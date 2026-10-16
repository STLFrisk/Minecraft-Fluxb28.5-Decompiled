import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * In-process runtime probe for the patched Flux client.
 *
 * Frida cannot hook Java methods on desktop HotSpot, and the client's own objects
 * are the only place the answers live: which modules are registered on the event
 * bus, whether each module considers itself enabled, what keybind it holds, what
 * its display name is, and - the question that decides everything - whether the
 * settings a handler gates on actually hold the values written in the config.
 *
 * Everything is reached by reflection on the obfuscated names, so this class has
 * no compile-time dependency on the client and can be built with a bare javac.
 * A daemon thread started from the static initialiser rewrites a small report
 * next to the game every two seconds.
 *
 * No anonymous or inner classes: shipping only the outer class would make the
 * static initialiser fail with NoClassDefFoundError the moment it is touched.
 */
public final class FluxDiag implements Runnable {

    private static final String OUT = "flux-diag.txt";
    private static final int ROUNDS = 900;          // ~30 minutes at 2 s

    /** Modules whose declared settings are dumped in full. */
    private static final String[] INTEREST =
        { "Fly", "Speed", "KillAura", "Scaffold", "Velocity", "Sprint" };

    static {
        Thread t = new Thread(new FluxDiag(), "FluxDiag");
        t.setDaemon(true);
        t.start();
    }

    public void run() {
        loop();
    }

    public static void start() {
        // touching the class runs the static initialiser
    }

    private static Object lastWorld;

    /**
     * Apply the saved config as soon as a world exists.
     *
     * szk is the lazy singleton behind zwr.up0(), and szk.<init> is what runs the
     * loader (a2k for the keybinds, then _k4 for the settings).  The first caller
     * of zwr.up0() is ar7.tp_, i.e. the first module toggle - so on a fresh launch
     * every cn7 setting is still at its default until the player toggles something.
     * That is why KillAura ignored Mob on the very first run and only honoured it
     * after a toggle.
     *
     * _k4() deliberately no-ops while c05.vz1().tij is null, and szk is a singleton
     * that will not retry, so the load has to be re-issued once the world appears.
     */
    private static void ensureConfigLoaded() {
        try {
            Class<?> zwr = Class.forName("zwr");
            Object c05 = Class.forName("c05");
            java.lang.reflect.Method vz1 = ((Class<?>) c05).getDeclaredMethod("vz1");
            vz1.setAccessible(true);
            Object mc = vz1.invoke(null);
            Object tij = fieldAny(mc, "tij");
            if (tij == null) {
                lastWorld = null;
                return;
            }
            if (tij == lastWorld) {
                return;
            }
            lastWorld = tij;
            Object zwrInstance = staticObj(zwr, "qkk");
            // Force the module registry first.  szk's loader matches config lines
            // against setting objects BY NAME, and those objects only exist once
            // each module's <clinit> has run; kgt.<init> references every module's
            // static field, which is what forces them.  Creating szk before kgt is
            // how KillAura ended up with Mob=true even though the file said false.
            call(zwrInstance, "zj2");
            Object szk = call(zwrInstance, "up0");
            if (szk == null) {
                return;
            }
            for (int pass = 0; pass < 2; pass++) {
                String name = pass == 0 ? "a2k" : "_k4";
                java.lang.reflect.Method m = szk.getClass().getDeclaredMethod(name);
                m.setAccessible(true);
                m.invoke(szk);
            }
            write("* config re-applied for a new world: a2k() then _k4()\n");
        } catch (Throwable t) {
            try {
                write("* config re-apply failed: " + t + "\n");
            } catch (Throwable ignored) {
                // nothing else to do
            }
        }
    }

    private static boolean modesApplied;

    /**
     * Apply the Mode dropdown values straight from the config file.
     *
     * The evidence that the loader skips them: the file says
     * `s#KillAura:Mode:Switch` while the live object reports
     * `fyk.isg = c_3[Mode]=Single`.  Priority happens to agree, which is exactly
     * what a dropdown left at its default would look like.
     *
     * ar7.asw(boolean) is the whole mode mechanism:
     *
     *     for (j1s sub : this._w6)
     *         if (sub.zkf().equalsIgnoreCase(this.isg.d7c())) sub.qza();
     *
     * so writing c_3.n1j(value) and then re-running the enable path is enough to
     * switch engines - j1s.qza()/d2z() are the only native parts.
     */
    private static void applyModesOnce() {
        if (modesApplied) {
            return;
        }
        StringBuilder log = new StringBuilder();
        try {
            java.io.File f = new java.io.File("flux/prs-hypixel_best_config.txt");
            if (!f.exists()) {
                f = new java.io.File("prs-hypixel_best_config.txt");
            }
            if (!f.exists()) {
                return;
            }
            java.io.BufferedReader r = new java.io.BufferedReader(
                new java.io.InputStreamReader(new java.io.FileInputStream(f), "UTF-8"));
            java.util.List lines = new java.util.ArrayList();
            String line;
            while ((line = r.readLine()) != null) {
                lines.add(line);
            }
            r.close();
            Object zwr = staticObj(Class.forName("zwr"), "qkk");
            Object kgt = call(zwr, "zj2");
            Object mods = call(kgt, "wau");
            if (!(mods instanceof java.util.List)) {
                return;
            }
            java.util.List list = (java.util.List) mods;
            for (int i = 0; i < list.size(); i++) {
                Object mod = list.get(i);
                if (mod == null) {
                    continue;
                }
                Object name = fieldAny(mod, "rb6");
                Object isg = fieldAny(mod, "isg");
                if (name == null || isg == null) {
                    continue;
                }
                String prefix = "s#" + name + ":Mode:";
                for (int k = 0; k < lines.size(); k++) {
                    String l = (String) lines.get(k);
                    if (!l.startsWith(prefix)) {
                        continue;
                    }
                    String want = l.substring(prefix.length());
                    Object have = call(isg, "d7c");
                    log.append("* mode ").append(name).append(": ")
                       .append(have).append(" -> ").append(want).append('\n');
                    if (!want.equals(String.valueOf(have))) {
                        java.lang.reflect.Method set =
                            isg.getClass().getDeclaredMethod("n1j", String.class);
                        set.setAccessible(true);
                        set.invoke(isg, want);
                        // re-run the enable path so asw() picks the matching engine
                        Object szk = call(zwr, "up0");
                        if (szk != null) {
                            java.lang.reflect.Method k4 =
                                szk.getClass().getDeclaredMethod("_k4");
                            k4.setAccessible(true);
                            k4.invoke(szk);
                        }
                    }
                }
            }
            modesApplied = true;
        } catch (Throwable t) {
            log.append("* applyModes failed: ").append(t).append('\n');
        }
        write(log.toString());
    }

    private static void loop() {
        for (int i = 0; i < ROUNDS; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("=== FluxDiag round ").append(i).append(" ===\n");
            try {
                applyModesOnce();
                dump(sb);
                ensureConfigLoaded();
            } catch (Throwable t) {
                sb.append("DUMP ERROR ").append(t).append('\n');
            }
            write(sb.toString());
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    private static void dump(StringBuilder sb) throws Exception {
        Class<?> zwr = Class.forName("zwr");
        Object z = staticObj(zwr, "qkk");
        sb.append("zwr.qkk          = ").append(z).append('\n');

        Object kgt = null;
        if (z != null) {
            kgt = call(z, "zj2");
            sb.append("zwr.qkk.zj2()    = ").append(kgt).append('\n');
        }

        Class<?> u1p = Class.forName("u1p");
        sb.append("u1p.jcs          = ").append(staticInt(u1p, "jcs")).append('\n');
        Class<?> ar7 = Class.forName("ar7");
        sb.append("ar7.vlm          = ").append(staticInt(ar7, "vlm")).append('\n');
        Class<?> c05 = Class.forName("c05");
        Object mc = callStatic(c05, "vz1");
        Object tij = mc == null ? null : fieldAny(mc, "tij");
        sb.append("c05.vz1().tij    = ").append(tij).append('\n');
        sb.append("zwr.bxb.d7c()    = ").append(call(staticObj(zwr, "bxb"), "d7c")).append('\n');

        Class<?> mtl = Class.forName("mtl");
        Object v = staticObj(mtl, "yh7");
        if (v instanceof Map) {
            Map<?, ?> m = (Map<?, ?>) v;
            sb.append("mtl.yh7 (bus)    = ").append(m.size()).append(" event types\n");
            for (Map.Entry<?, ?> e : m.entrySet()) {
                Object val = e.getValue();
                int n = (val instanceof List) ? ((List<?>) val).size() : -1;
                sb.append("    ").append(name(e.getKey())).append("  listeners=").append(n).append('\n');
                if (!(val instanceof List)) {
                    continue;
                }
                List<?> ws = (List<?>) val;
                for (int i = 0; i < ws.size(); i++) {
                    Object w = ws.get(i);
                    Object mi = call(w, "tss");
                    if (!(mi instanceof Method)) {
                        continue;
                    }
                    Method mm = (Method) mi;
                    String decl = mm.getDeclaringClass().getName();
                    if (!"fyk".equals(decl) && !"xbs".equals(decl) && !"j1s".equals(decl)) {
                        continue;
                    }
                    Object inst = call(w, "_5a");
                    sb.append("        HOOK ").append(decl)
                      .append("  event=").append(name(e.getKey()))
                      .append("  method=").append(mm.getName()).append('(')
                      .append(types(mm)).append(')')
                      .append("  on=").append(inst == null ? "null" : inst.getClass().getName())
                      .append('\n');
                }
            }
        }

        if (kgt == null) {
            sb.append("!! no registry: zj2() returned null\n");
            return;
        }
        Object listObj = call(kgt, "wau");
        if (!(listObj instanceof List)) {
            sb.append("!! wau() did not return a List: ").append(listObj).append('\n');
            return;
        }
        List<?> mods = (List<?>) listObj;
        int enabled = 0;
        sb.append("registry size    = ").append(mods.size()).append('\n');
        sb.append("---- modules ----\n");
        for (Object mod : mods) {
            if (mod == null) {
                sb.append("    <null module in registry>\n");
                continue;
            }
            Object on = fieldAny(mod, "iio");
            if (Boolean.TRUE.equals(on)) {
                enabled++;
            }
            String display = String.valueOf(fieldAny(mod, "rb6"));
            String desc = String.valueOf(fieldAny(mod, "k9o"));
            sb.append("    ").append(pad(mod.getClass().getName(), 8))
              .append(" name=").append(pad(display, 18))
              .append(" enabled=").append(on)
              .append(" key=").append(call(mod, "x_i"))
              .append("  desc=").append(desc)
              .append('\n');
            if (interesting(display) || interesting(mod.getClass().getName())) {
                dumpSettings(sb, mod);
            }
        }
        sb.append("enabled modules  = ").append(enabled).append('\n');
        sb.append("zwr.up0() (szk)  = ").append(z == null ? null : call(z, "up0")).append('\n');
        dumpAuraInputs(sb, mods, tij);
    }

    /**
     * Everything fyk.k27(fha) reads before it can pick a target:
     *
     *     t9d.c(); fyk.g4y.g7m(); fyk.kl3; kgt.nd5; fyk.ek1;
     *     c05.tij.guf.iterator(); checkcast i2h; checkcast ha9; c_3.wyk(...)
     *
     * "Aura enabled but idle" is almost always an empty/odd entity list or a
     * toggle setting reading false, so report both.
     */
    private static void dumpAuraInputs(StringBuilder sb, List<?> mods, Object tij) {
        sb.append("---- aura inputs ----\n");
        try {
            Class<?> xbs = Class.forName("xbs");
            Object lo6 = staticObj(xbs, "lo6");
            Object mrm = staticObj(xbs, "mrm");
            sb.append("xbs.lo6          = ").append(listInfo(lo6)).append('\n');
            sb.append("xbs.mrm          = ").append(listInfo(mrm)).append('\n');
            sb.append("fyk.kfa (target) = ").append(staticObj(Class.forName("fyk"), "kfa")).append('\n');
            sb.append("fyk.kfa declared in = ")
              .append(Class.forName("fyk").getDeclaredField("kfa").getType().getName()).append('\n');
        } catch (Throwable t) {
            sb.append("xbs probe error  = ").append(t).append('\n');
        }
        Object guf = fieldAny(tij, "guf");
        if (guf instanceof List) {
            List<?> ents = (List<?>) guf;
            sb.append("c05.tij.guf      = List size=").append(ents.size()).append('\n');
            int shown = 0;
            for (int i = 0; i < ents.size() && shown < 12; i++) {
                Object e = ents.get(i);
                sb.append("    [").append(i).append("] ")
                  .append(e == null ? "null" : e.getClass().getName()).append('\n');
                shown++;
            }
        } else {
            sb.append("c05.tij.guf      = ").append(guf).append('\n');
        }

        Object fyk = null;
        for (int i = 0; i < mods.size(); i++) {
            Object m = mods.get(i);
            if (m != null && "fyk".equals(m.getClass().getName())) {
                fyk = m;
                break;
            }
        }
        if (fyk == null) {
            sb.append("fyk (KillAura)   = not in registry\n");
            return;
        }
        sb.append("---- fyk (KillAura) fields ----\n");
        // The sub-object names decide the whole Mode mechanism. ar7.asw() enables
        // every sub-object unconditionally, then re-enables only those whose zkf()
        // equalsIgnoreCase the current mode - and only if tb8(mode) found a match.
        // If no engine is named after the modes, the second loop is dead code and
        // every engine simply runs at once.
        Object w6 = fieldAny(fyk, "_w6");
        if (w6 instanceof List) {
            List<?> subs = (List<?>) w6;
            sb.append("fyk._w6 (engines) = size ").append(subs.size()).append('\n');
            for (int i = 0; i < subs.size(); i++) {
                Object sub = subs.get(i);
                sb.append("    [").append(i).append("] ")
                  .append(sub == null ? "null" : sub.getClass().getName())
                  .append("  name=").append(sub == null ? "-" : call(sub, "zkf"))
                  .append("  desc=").append(sub == null ? "-" : call(sub, "e0r"))
                  .append('\n');
            }
        }
        try {
            java.lang.reflect.Method tb8 =
                Class.forName("ar7").getDeclaredMethod("tb8", String.class);
            tb8.setAccessible(true);
            String[] probes = { "Switch", "Single", "Multi", "Vanilla", "Hypixel" };
            for (int i = 0; i < probes.length; i++) {
                sb.append("    tb8(\"").append(probes[i]).append("\") = ")
                  .append(tb8.invoke(fyk, probes[i])).append('\n');
            }
        } catch (Throwable t) {
            sb.append("    tb8 probe failed: ").append(t).append('\n');
        }
        for (Class<?> c = fyk.getClass(); c != null; c = c.getSuperclass()) {
            Field[] fs;
            try {
                fs = c.getDeclaredFields();
            } catch (Throwable t) {
                continue;
            }
            for (int i = 0; i < fs.length; i++) {
                String fn = fs[i].getName();
                if (fn.length() != 3) {
                    continue;                       // obfuscated 3-char names only
                }
                Object val;
                try {
                    fs[i].setAccessible(true);
                    val = fs[i].get(fyk);
                } catch (Throwable t) {
                    continue;
                }
                if (val == null) {
                    sb.append("    fyk.").append(fn).append(" = null\n");
                } else if (isSetting(val.getClass())) {
                    // cn7 (checkbox/slider) and crk (mode) both answer to d7c(); crk
                    // has no ktv/h4c, so fall back to its own accessors.  Printing
                    // only the class name is what hid the mode value for several
                    // rounds of this investigation.
                    sb.append("    fyk.").append(fn)
                      .append(" = ").append(val.getClass().getName())
                      .append("[").append(settingName(val)).append("]")
                      .append("=").append(settingValue(val))
                      .append("  raw=").append(fieldAny(val, "ktv"))
                      .append('\n');
                } else {
                    sb.append("    fyk.").append(fn).append(" = ")
                      .append(val.getClass().getName()).append('\n');
                }
            }
        }
    }

    /** Declared fields whose type is the setting class cn7, with their strings and value. */
    private static void dumpSettings(StringBuilder sb, Object mod) {
        int shown = 0;
        for (Class<?> c = mod.getClass(); c != null; c = c.getSuperclass()) {
            Field[] fs;
            try {
                fs = c.getDeclaredFields();
            } catch (Throwable t) {
                continue;
            }
            for (int i = 0; i < fs.length; i++) {
                Field f = fs[i];
                Object val;
                try {
                    f.setAccessible(true);
                    val = f.get(mod);
                } catch (Throwable t) {
                    continue;
                }
                if (val == null) {
                    continue;
                }
                String tn = val.getClass().getName();
                if (!isSetting(val.getClass())) {
                    continue;
                }
                sb.append("        .").append(f.getName())
                  .append("  a=").append(fieldAny(val, "rn2"))
                  .append("  b=").append(fieldAny(val, "h4c"))
                  .append("  value=").append(fieldAny(val, "ktv"))
                  .append('\n');
                shown++;
            }
        }
        if (shown == 0) {
            sb.append("        (no cn7 fields)\n");
        }
    }

    /** A setting's display name: cn7 keeps it in h4c, crk exposes it via fht(). */
    private static String settingName(Object s) {
        Object v = fieldAny(s, "h4c");
        if (v instanceof String) {
            return (String) v;
        }
        v = fieldAny(s, "rn2");
        if (v instanceof String) {
            return (String) v;
        }
        v = call(s, "fht");
        if (v instanceof String) {
            return (String) v;
        }
        return String.valueOf(v);
    }

    /** A setting's current value through the shared d7c() accessor. */
    private static String settingValue(Object s) {
        Object v = call(s, "d7c");
        if (v != null && !String.valueOf(v).startsWith("<")) {
            return String.valueOf(v);
        }
        return String.valueOf(fieldAny(s, "ktv"));
    }

    /**
     * True for any setting object: cn7 (checkbox/slider), crk (mode - it extends
     * dzm and carries the same d7c() accessor) and their siblings.  Matching on the
     * exact class name missed every crk, which is why the mode values never showed
     * up in the report.
     */
    private static boolean isSetting(Class<?> c) {
        try {
            Class<?> base = Class.forName("dzm");
            if (base.isAssignableFrom(c)) {
                return true;
            }
        } catch (Throwable t) {
            // fall through to the name check
        }
        return "cn7".equals(c.getName()) || "dzm".equals(c.getName())
            || "crk".equals(c.getName());
    }

    /** Size plus the first few element class names of a list-valued static. */
    private static String listInfo(Object o) {
        if (!(o instanceof List)) {
            return String.valueOf(o);
        }
        List<?> l = (List<?>) o;
        StringBuilder b = new StringBuilder("List size=").append(l.size());
        for (int i = 0; i < l.size() && i < 4; i++) {
            Object e = l.get(i);
            b.append("  [").append(i).append("]=")
             .append(e == null ? "null" : e.getClass().getName());
        }
        return b.toString();
    }

    /** Parameter type names, so a handler signature is readable in the report. */
    private static String types(Method m) {
        Class<?>[] ps;
        try {
            ps = m.getParameterTypes();
        } catch (Throwable t) {
            return "?";
        }
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < ps.length; i++) {
            if (i > 0) {
                b.append(',');
            }
            b.append(ps[i].getName());
        }
        return b.toString();
    }

    private static boolean interesting(String s) {        if (s == null) {
            return false;
        }
        for (int i = 0; i < INTEREST.length; i++) {
            if (s.indexOf(INTEREST[i]) >= 0) {
                return true;
            }
        }
        return false;
    }

    private static String pad(String s, int n) {
        if (s == null) {
            s = "null";
        }
        while (s.length() < n) {
            s = s + " ";
        }
        return s;
    }

    // ---------------------------------------------------------------- helpers

    private static String name(Object o) {
        if (o == null) {
            return "null";
        }
        if (o instanceof Class) {
            return ((Class<?>) o).getName();
        }
        return o.getClass().getName();
    }

    private static Object callStatic(Class<?> c, String m) {
        try {
            Method mm = c.getDeclaredMethod(m);
            mm.setAccessible(true);
            return mm.invoke(null);
        } catch (Throwable t) {
            return "<" + t + ">";
        }
    }

    private static Object call(Object o, String m) {
        if (o == null) {
            return null;
        }
        for (Class<?> c = o.getClass(); c != null; c = c.getSuperclass()) {
            try {
                Method mm = c.getDeclaredMethod(m);
                mm.setAccessible(true);
                return mm.invoke(o);
            } catch (NoSuchMethodException e) {
                // keep walking up
            } catch (Throwable t) {
                return "<" + t + ">";
            }
        }
        return "<no method " + m + ">";
    }

    private static Object fieldAny(Object o, String f) {
        if (o == null) {
            return null;
        }
        for (Class<?> c = o.getClass(); c != null; c = c.getSuperclass()) {
            try {
                Field ff = c.getDeclaredField(f);
                ff.setAccessible(true);
                return ff.get(o);
            } catch (NoSuchFieldException e) {
                // keep walking up
            } catch (Throwable t) {
                return "<" + t + ">";
            }
        }
        return "<no field " + f + ">";
    }

    private static Object staticObj(Class<?> c, String f) {
        try {
            Field ff = c.getDeclaredField(f);
            ff.setAccessible(true);
            return ff.get(null);
        } catch (Throwable t) {
            return "<" + t + ">";
        }
    }

    private static int staticInt(Class<?> c, String f) {
        try {
            Field ff = c.getDeclaredField(f);
            ff.setAccessible(true);
            return ff.getInt(null);
        } catch (Throwable t) {
            return -999;
        }
    }

    private static void write(String text) {
        PrintWriter w = null;
        try {
            w = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(new File(OUT)), "UTF-8"));
            w.print(text);
        } catch (Throwable t) {
            // the probe must never disturb the client
        } finally {
            if (w != null) {
                w.close();
            }
        }
    }
}
