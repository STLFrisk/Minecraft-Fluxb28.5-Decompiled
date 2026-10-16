/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class e0x$4
extends e0x$zvv {
    private static final long a = c.a(-5155374363066684032L, -4500128167611590517L, MethodHandles.lookup().lookupClass()).a(166981609053229L);
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public e0x$4(String string, float f, float f2) {
        super(string, f, f2);
    }

    @Override
    public String l1o() {
        long l = a ^ 0x2D935A37518DL;
        return e0x$4.b("z", (int)6253, (long)(0x4DC854856A3EF079L ^ l));
    }

    @Override
    public String jfo() {
        long l = a ^ 0x58AA475A3090L;
        return e0x$4.b("z", (int)4874, (long)(0x51F527D33C019A00L ^ l));
    }

    @Override
    public String i3r() {
        long l = a ^ 0x35A2815F999EL;
        return e0x$4.b("z", (int)24518, (long)(0x5C03D8FACA67FC0L ^ l));
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        h = new HashMap(13);
        long l = a ^ 0x1E076767FD86L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "*\u00f1\u00a4\u00e1\u001a\u00ee'\u0085$\u00f2\u001e\u0083w\u00dc\u008f\u00b9E\u00d3\u0099\u00c6\u00d3\u00f9\u009cd\u0003M\u008b\u00ea\u00e1\u00d0\u00ceX \u0095\u00e0A}\u00e9\u00ee\u0011\u00ef\u000f\u0019\u00ccD\u00e0\u008f\u00ce\u0082\u00ec+a\u0004= \u001e\u00d0m\u00ad\u0012z\u009b\u00c9\u00de\u0082\u0018fX^\u00f4p\u00d7w\u00b9\u0016F\u00e0\tW\u00cb l\u007f\u00b1q1\u000e\u00da\u00198";
        int n2 = "*\u00f1\u00a4\u00e1\u001a\u00ee'\u0085$\u00f2\u001e\u0083w\u00dc\u008f\u00b9E\u00d3\u0099\u00c6\u00d3\u00f9\u009cd\u0003M\u008b\u00ea\u00e1\u00d0\u00ceX \u0095\u00e0A}\u00e9\u00ee\u0011\u00ef\u000f\u0019\u00ccD\u00e0\u008f\u00ce\u0082\u00ec+a\u0004= \u001e\u00d0m\u00ad\u0012z\u009b\u00c9\u00de\u0082\u0018fX^\u00f4p\u00d7w\u00b9\u0016F\u00e0\tW\u00cb l\u007f\u00b1q1\u000e\u00da\u00198".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = e0x$4.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                f = stringArray;
                g = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c2;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (i >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1290;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("e0x$4", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            e0x$4.g[n2] = e0x$4.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = e0x$4.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("e0x$4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e0x$4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

