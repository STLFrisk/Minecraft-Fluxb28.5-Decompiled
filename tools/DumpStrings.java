import java.io.*;
import java.lang.reflect.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/**
 * ZKM 12.x string dumper.
 *
 * Consumes the TSV produced by callscan.py:
 *   class <TAB> keyField <TAB> n <TAB> acc <TAB> keyBased <TAB> descriptor <TAB> method <TAB> offset
 *
 * For each row it loads the owning class (which runs the ZKM <clinit> that builds the
 * internal ciphertext table), reads the referenced static long key field wherever it
 * lives, and invokes the class's own (I,J)->String decryptor with the reconstructed
 * key. The decryption therefore uses the target's own implementation; nothing about
 * the cipher is re-implemented here.
 */
public final class DumpStrings {

    private static URL[] targetUrls;

    public static void main(String[] args) throws Exception {
        Path in = Paths.get(args[0]);
        Path outDir = Paths.get(args[1]);
        long timeoutMs = args.length > 2 ? Long.parseLong(args[2]) : 8000L;
        Files.createDirectories(outDir);

        List<String[]> rows = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(in, StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) continue;
                String[] p = line.split("\t", -1);
                if (p.length >= 8) rows.add(p);
            }
        }
        System.out.println("rows=" + rows.size());

        targetUrls = new URL[]{ Paths.get(args[3]).toUri().toURL() };

        // NOTE ON ISOLATION
        // ZKM 12.x derives each class's string-table key through a shared helper
        // (`c.a(long,long,Object)` -> `a.a(long)`). Its state is process-global, so
        // initialising class A can leave class B's key derivation wrong, producing
        // javax.crypto.BadPaddingException inside B's own <clinit>. The target jar
        // must therefore NOT be on the system classpath: every class gets a private
        // URLClassLoader so its ZKM state starts clean.
        ClassLoader probe = new URLClassLoader(targetUrls, ClassLoader.getSystemClassLoader());
        try {
            Class<?> bs = Class.forName("net.minecraft.init.Bootstrap", true, probe);
            Method reg = bs.getDeclaredMethod("register");
            reg.setAccessible(true);
            reg.invoke(null);
            System.out.println("bootstrap: net.minecraft.init.Bootstrap.register() OK");
        } catch (Throwable t) {
            System.out.println("bootstrap: not registered (" + chain(t) + ")");
        }

        // group rows by class+key so each class is initialized once
        Map<String, List<String[]>> byClass = new LinkedHashMap<>();
        for (String[] r : rows) byClass.computeIfAbsent(r[0], k -> new ArrayList<>()).add(r);

        PrintWriter ok = new PrintWriter(Files.newBufferedWriter(
                outDir.resolve("strings_plain.tsv"), StandardCharsets.UTF_8));
        PrintWriter bad = new PrintWriter(Files.newBufferedWriter(
                outDir.resolve("strings_errors.tsv"), StandardCharsets.UTF_8));

        ExecutorService pool = Executors.newSingleThreadExecutor(r -> {
            Thread t = new Thread(r, "zkm-worker");
            t.setDaemon(true);
            return t;
        });

        int done = 0, failed = 0, classFail = 0;
        Map<String, Long> keys = new HashMap<>();

        // Multi-pass: a class that fails only because a dependency was not ready yet
        // is retried once other classes have initialised. Final residual failures are
        // reported, never silently dropped.
        List<Map.Entry<String, List<String[]>>> pending =
                new ArrayList<>(byClass.entrySet());
        int totalClasses = pending.size();
        for (int pass = 1; pass <= 5 && !pending.isEmpty(); pass++) {
            List<Map.Entry<String, List<String[]>>> next = new ArrayList<>();
            int okThisPass = 0;
            for (Map.Entry<String, List<String[]>> e : pending) {
                final String clsName = e.getKey();
                final List<String[]> classRows = e.getValue();
                done++;
                if (done % 1000 == 0) System.out.println("  ... pass" + pass + " " + done);

                Future<List<String>> f = pool.submit(() -> decryptClass(clsName, classRows, keys));
                List<String> lines = null;
                try {
                    lines = f.get(timeoutMs, TimeUnit.MILLISECONDS);
                } catch (TimeoutException te) {
                    f.cancel(true);
                } catch (Exception ex) {
                    // fall through to retry
                }
                if (lines == null) { next.add(e); continue; }

                boolean retryable = lines.size() > 0 && lines.get(0).startsWith("!RETRY");
                if (retryable && pass < 5) { next.add(e); continue; }
                for (String l : lines) {
                    if (l.startsWith("!")) {
                        bad.println(l.startsWith("!RETRY") ? l.substring(6) : l.substring(1));
                        failed++;
                    } else ok.println(l);
                }
                okThisPass++;
            }
            System.out.println("pass " + pass + ": settled=" + okThisPass
                    + " deferred=" + next.size() + " of " + totalClasses);
            pending = next;
        }
        classFail = pending.size();
        for (Map.Entry<String, List<String[]>> e : pending) {
            for (String[] r : e.getValue()) {
                bad.println(e.getKey() + "\t" + r[6] + "\t" + r[7] + "\t" + r[2]
                        + "\tclass never initialised after 5 passes");
                failed++;
            }
        }
        ok.close(); bad.close();
        pool.shutdownNow();
        System.out.println("classes=" + byClass.size()
                + " classesFailed=" + classFail
                + " callSitesFailed=" + failed);
    }

    private static List<String> decryptClass(String clsName, List<String[]> rows,
                                             Map<String, Long> keys) {
        List<String> out = new ArrayList<>(rows.size());
        // Private loader per class: ZKM's key schedule is process-global state, so a
        // shared loader makes later classes fail with BadPaddingException.
        ClassLoader loader = new URLClassLoader(targetUrls, ClassLoader.getSystemClassLoader());
        keys.clear();                       // key values belong to this loader instance
        Class<?> c;
        try {
            c = Class.forName(clsName, true, loader);
        } catch (Throwable t) {
            // <clinit> failed. For most classes the failure is a native anti-tamper
            // gate (v6ma.Ex) that runs AFTER the ZKM string table has already been
            // decrypted into a static String[]. Read that table with Unsafe (which
            // does not trigger initialization) and reproduce only the inner DES
            // layer, which is fully described by the target's own decryptor.
            List<String> viaUnsafe = decryptViaUnsafe(clsName, rows, loader, keyFieldOf(rows));
            if (viaUnsafe != null) return viaUnsafe;
            String why = chain(t) + " [unsafe fallback: " + unsafeReason.get() + "]";
            for (String[] r : rows) {
                out.add("!RETRY" + clsName + "\t" + r[6] + "\t" + r[7] + "\t" + r[2]
                        + "\tclass init failed: " + why);
            }
            return out;
        }

        for (String[] r : rows) {
            String keyField = r[1];
            int n = (int) Long.parseLong(r[2]);
            long acc = Long.parseUnsignedLong(r[3]);
            boolean keyBased = "1".equals(r[4]);
            String desc = r[5];
            String method = r[6];
            String offset = r[7];

            long l = acc;
            if (keyBased) {
                Long kv = readKey(keyField, keys, loader);
                if (kv == null) {
                    out.add("!RETRY" + clsName + "\t" + method + "\t" + offset + "\t" + n
                            + "\tkey field unreadable: " + keyField);
                    continue;
                }
                l = kv ^ acc;
            }
            try {
                Method m = findDecryptor(c, desc);
                if (m == null) {
                    out.add("!" + clsName + "\t" + method + "\t" + offset + "\t" + n
                            + "\tno decryptor for " + desc);
                    continue;
                }
                Object res = m.invoke(null, n, l);
                out.add(clsName + "\t" + method + "\t" + offset + "\t" + n + "\t"
                        + escape((String) res));
            } catch (Throwable t) {
                Throwable cc = t instanceof InvocationTargetException && t.getCause() != null
                        ? t.getCause() : t;
                out.add("!RETRY" + clsName + "\t" + method + "\t" + offset + "\t" + n
                        + "\t" + chain(cc));
            }
        }
        return out;
    }

    /** Full throwable chain so a null-message ExceptionInInitializerError is still diagnostic. */
    private static String chain(Throwable t) {
        StringBuilder sb = new StringBuilder();
        Set<Throwable> seen = new HashSet<>();
        int depth = 0;
        for (Throwable x = t; x != null && depth < 8; x = x.getCause(), depth++) {
            if (!seen.add(x)) { sb.append(" -> <cycle>"); break; }
            if (depth > 0) sb.append(" -> ");
            sb.append(x.getClass().getName());
            String msg = x.getMessage();
            if (msg != null) sb.append(": ").append(msg);
            Throwable[] sup = x.getSuppressed();
            if (sup.length > 0) sb.append(" [suppressed ").append(sup.length).append("]");
        }
        return sb.toString();
    }

    private static String keyFieldOf(List<String[]> rows) {
        for (String[] r : rows) if (!r[1].isEmpty()) return r[1];
        return null;
    }

    // ---------------------------------------------------------------- Unsafe path

    private static Object unsafe;
    private static Method uStaticBase, uStaticOffset, uGetObject, uGetLong;
    private static boolean unsafeReady, unsafeTried;
    private static final ThreadLocal<String> unsafeReason = ThreadLocal.withInitial(() -> "not attempted");

    private static boolean initUnsafe() {
        if (unsafeTried) return unsafeReady;
        unsafeTried = true;
        try {
            Class<?> uc = Class.forName("sun.misc.Unsafe");
            Field f = uc.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            unsafe = f.get(null);
            uStaticBase = uc.getMethod("staticFieldBase", Field.class);
            uStaticOffset = uc.getMethod("staticFieldOffset", Field.class);
            uGetObject = uc.getMethod("getObject", Object.class, long.class);
            uGetLong = uc.getMethod("getLong", Object.class, long.class);
            unsafeReady = true;
            unsafeReason.set("ok");
        } catch (Throwable t) {
            unsafeReady = false;
            unsafeReason.set("init: " + chain(t));
        }
        return unsafeReady;
    }

    private static long uLong(Field f) throws Exception {
        return (Long) uGetLong.invoke(unsafe, uStaticBase.invoke(unsafe, f),
                uStaticOffset.invoke(unsafe, f));
    }

    private static Object uObj(Field f) throws Exception {
        return uGetObject.invoke(unsafe, uStaticBase.invoke(unsafe, f),
                uStaticOffset.invoke(unsafe, f));
    }

    /** Read a static long without triggering class initialization. */
    private static long readStaticLongUnsafe(Class<?> c, String name) throws Exception {
        Field chosen = null;
        for (Field f : c.getDeclaredFields()) {
            if (f.getType() != long.class || !Modifier.isStatic(f.getModifiers())) continue;
            if (name != null && f.getName().equals(name)) { chosen = f; break; }
            if (chosen == null) chosen = f;
        }
        if (chosen == null) throw new NoSuchFieldException("no static long in " + c.getName());
        chosen.setAccessible(true);
        return uLong(chosen);
    }

    /**
     * Reproduce ZKM 12.x's second string layer from the already-populated ciphertext
     * table. Returns null when the table was never built (initializer died earlier).
     */
    private static List<String> decryptViaUnsafe(String clsName, List<String[]> rows,
                                                 ClassLoader loader, String keyFieldRef) {
        if (!initUnsafe()) { unsafeReason.set("unsafe unavailable"); return null; }
        Class<?> c;
        try {
            c = Class.forName(clsName, false, loader);   // no initialization
        } catch (Throwable t) {
            unsafeReason.set("loadClass: " + chain(t));
            return null;
        }
        long key;
        try {
            key = readStaticLongUnsafe(c, null);          // own class key
            if (keyFieldRef != null) {
                int dot = keyFieldRef.lastIndexOf('.');
                String owner = dot > 0 ? keyFieldRef.substring(0, dot) : clsName;
                String fname = keyFieldRef.substring(dot + 1);
                if (!owner.equals(clsName)) {
                    Class<?> oc = Class.forName(owner, false, loader);   // no init
                    key = readStaticLongUnsafe(oc, fname);
                } else {
                    key = readStaticLongUnsafe(c, fname);
                }
            }
        } catch (Throwable t) {
            unsafeReason.set("key: " + chain(t));
            return null;
        }

        String[] table = null;
        try {
            for (Field f : c.getDeclaredFields()) {
                if (f.getType() != String[].class || !Modifier.isStatic(f.getModifiers())) continue;
                f.setAccessible(true);
                Object o = uObj(f);
                if (!(o instanceof String[])) continue;
                String[] arr = (String[]) o;
                boolean any = false;
                for (String s : arr) if (s != null) { any = true; break; }
                if (any) { table = arr; break; }     // the populated one is the ciphertext table
            }
        } catch (Throwable t) {
            unsafeReason.set("table: " + chain(t));
            return null;
        }
        if (table == null) {
            StringBuilder dbg = new StringBuilder("no populated static String[]; fields=");
            try {
                for (Field f : c.getDeclaredFields()) {
                    dbg.append(f.getType().getSimpleName()).append(' ').append(f.getName());
                    if (f.getType() == String[].class && Modifier.isStatic(f.getModifiers())) {
                        f.setAccessible(true);
                        Object o = uObj(f);
                        dbg.append("[unsafe=").append(o == null ? "null"
                                : (o instanceof String[] ? "String[" + ((String[]) o).length + "]"
                                                         : o.getClass().getName())).append("]");
                    }
                    dbg.append("; ");
                }
            } catch (Throwable t) { dbg.append(" <").append(t).append('>'); }
            unsafeReason.set("[" + clsName + "] " + dbg);
            return null;
        }

        Cipher des;
        SecretKeyFactory skf;
        try {
            des = Cipher.getInstance("DES/CBC/PKCS5Padding");
            skf = SecretKeyFactory.getInstance("DES");
        } catch (Exception e) {
            return null;
        }

        List<String> out = new ArrayList<>(rows.size());
        int recovered = 0;
        for (String[] r : rows) {
            int n = (int) Long.parseLong(r[2]);
            long acc = Long.parseUnsignedLong(r[3]);
            boolean keyBased = "1".equals(r[4]);
            long l = keyBased ? (key ^ acc) : acc;
            try {
                int n2 = n ^ (int) (l & 0x7FFFL) ^ 0x23F0;
                if (n2 < 0 || n2 >= table.length || table[n2] == null) {
                    out.add("!" + clsName + "\t" + r[6] + "\t" + r[7] + "\t" + n
                            + "\ttable index " + n2 + " out of range (len=" + table.length
                            + " key=" + key + " acc=" + acc + " l=" + l + " keyBased=" + keyBased
                            + " keyField=" + keyFieldRef + ")");
                    continue;
                }
                byte[] kb = new byte[8];
                kb[0] = (byte) (l >>> 56);
                for (int i = 1; i < 8; i++) kb[i] = (byte) (l << i * 8 >>> 56);
                des.init(Cipher.DECRYPT_MODE, skf.generateSecret(new DESKeySpec(kb)),
                        new IvParameterSpec(new byte[8]));
                byte[] pt = des.doFinal(table[n2].getBytes("ISO-8859-1"));
                out.add(clsName + "\t" + r[6] + "\t" + r[7] + "\t" + n + "\t"
                        + escape(modifiedUtf8(pt)));
                recovered++;
            } catch (Throwable t) {
                out.add("!" + clsName + "\t" + r[6] + "\t" + r[7] + "\t" + n
                        + "\t" + chain(t));
            }
        }
        return recovered > 0 ? out : out;   // surface per-site reasons instead of hiding them
    }

    /** Byte-for-byte port of the target's own modified-UTF8 decoder. */
    private static String modifiedUtf8(byte[] a) {
        int n = 0, len = a.length;
        char[] out = new char[len];
        for (int i = 0; i < len; i++) {
            int v = 0xFF & a[i];
            if (v < 192) { out[n++] = (char) v; continue; }
            if (v < 224) {
                char ch = (char) ((v & 0x1F) << 6);
                v = a[++i];
                out[n++] = (char) (ch | (v & 0x3F));
                continue;
            }
            if (i >= len - 2) continue;
            char ch = (char) ((v & 0xF) << 12);
            v = a[++i];
            ch = (char) (ch | (v & 0x3F) << 6);
            v = a[++i];
            out[n++] = (char) (ch | (v & 0x3F));
        }
        return new String(out, 0, n);
    }

    private static Long readKey(String fieldRef, Map<String, Long> keys, ClassLoader loader) {
        Long cached = keys.get(fieldRef);
        if (cached != null) return cached;
        int dot = fieldRef.lastIndexOf('.');
        if (dot < 0) return null;
        String owner = fieldRef.substring(0, dot);
        String name = fieldRef.substring(dot + 1);
        try {
            Class<?> oc = Class.forName(owner, true, loader);
            Field fld = oc.getDeclaredField(name);
            fld.setAccessible(true);
            long v = fld.getLong(null);
            keys.put(fieldRef, v);
            return v;
        } catch (Throwable t) {
            return null;
        }
    }

    /** Find the static (params from desc) -> String decryptor declared by c. */
    private static Method findDecryptor(Class<?> c, String desc) {
        Class<?>[] params = parseParams(desc);
        if (params == null) return null;
        for (Method m : c.getDeclaredMethods()) {
            if (!Modifier.isStatic(m.getModifiers())) continue;
            if (m.getReturnType() != String.class) continue;
            if (Arrays.equals(m.getParameterTypes(), params)) {
                m.setAccessible(true);
                return m;
            }
        }
        return null;
    }

    private static Class<?>[] parseParams(String desc) {
        int close = desc.indexOf(')');
        if (close < 0) return null;
        String p = desc.substring(1, close);
        List<Class<?>> out = new ArrayList<>();
        for (int i = 0; i < p.length(); ) {
            char ch = p.charAt(i);
            if (ch == 'I') { out.add(int.class); i++; }
            else if (ch == 'J') { out.add(long.class); i++; }
            else if (ch == '[') {
                int j = i;
                while (j < p.length() && p.charAt(j) == '[') j++;
                String comp;
                if (p.charAt(j) == 'L') { comp = p.substring(i, p.indexOf(';', j) + 1); i = p.indexOf(';', j) + 1; }
                else { comp = p.substring(i, j + 1); i = j + 1; }
                try { out.add(Class.forName(comp.replace('/', '.'))); } catch (Throwable t) { return null; }
            } else if (ch == 'L') {
                int end = p.indexOf(';', i);
                if (end < 0) return null;
                try { out.add(Class.forName(p.substring(i + 1, end).replace('/', '.'))); }
                catch (Throwable t) { return null; }
                i = end + 1;
            } else return null;
        }
        return out.toArray(new Class<?>[0]);
    }

    private static String escape(String s) {
        if (s == null) return "<null>";
        StringBuilder sb = new StringBuilder(s.length() + 8);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '\t': sb.append("\\t"); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                case '\\': sb.append("\\\\"); break;
                default:
                    if (ch < 0x20 || ch == 0x7f) sb.append(String.format("\\u%04x", (int) ch));
                    else sb.append(ch);
            }
        }
        return sb.toString();
    }

    private DumpStrings() {}
}
