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

public class bs_
extends j1s {
    private static final long a = c.a(-3719610109647979107L, -5193341156466820161L, MethodHandles.lookup().lookupClass()).a(249906850135206L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public bs_() {
        long l = a ^ 0x125369FC656BL;
        super((String)((Object)bs_.a("r", (int)4373, (long)(0x74174B190965FEC2L ^ l))), (String)((Object)bs_.a("r", (int)4460, (long)(0x995098853327EBAL ^ l))));
    }

    @jev
    public void su0(fz2 fz22) {
        block9: {
            l86 l862;
            block10: {
                boolean bl;
                block8: {
                    int n = t9d.b();
                    try {
                        try {
                            try {
                                bl = bk4.da2();
                                if (n == 0) break block8;
                                if (!bl) break block9;
                            }
                            catch (oov oov2) {
                                throw bs_.a(oov2);
                            }
                            l862 = this.wyl.vg8;
                            if (n == 0) break block10;
                        }
                        catch (oov oov3) {
                            throw bs_.a(oov3);
                        }
                        bl = l862.hzv();
                    }
                    catch (oov oov4) {
                        throw bs_.a(oov4);
                    }
                }
                try {
                    if (!bl) break block9;
                    l862 = this.wyl.vg8;
                }
                catch (oov oov5) {
                    throw bs_.a(oov5);
                }
            }
            float f = l862.x5k;
            float f2 = 1.0f;
            this.wyl.vg8.aaw().z6k(1.0 * Math.cos(Math.toRadians(f + 90.0f)), 0.0, 1.0 * Math.sin(Math.toRadians(f + 90.0f)));
        }
    }

    @jev
    public void trv(w1x w1x2) {
        block12: {
            double d;
            block13: {
                nh4 nh42;
                int n;
                block11: {
                    n = t9d.b();
                    try {
                        try {
                            nh42 = w1x2.jqi();
                            if (n == 0) break block11;
                            if (nh42 == null) break block12;
                        }
                        catch (oov oov2) {
                            throw bs_.a(oov2);
                        }
                        nh42 = w1x2.jqi();
                    }
                    catch (oov oov3) {
                        throw bs_.a(oov3);
                    }
                }
                try {
                    try {
                        double d2 = nh42.i2c - this.wyl.vg8.aaw().bx_;
                        d = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                        if (n == 0) break block13;
                        if (d <= 0) break block12;
                    }
                    catch (oov oov4) {
                        throw bs_.a(oov4);
                    }
                    d = (double)this.wyl.vg8.hzv();
                }
                catch (oov oov5) {
                    throw bs_.a(oov5);
                }
            }
            try {
                if (d != false) {
                    w1x2.wfu(null);
                }
            }
            catch (oov oov6) {
                throw bs_.a(oov6);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        f = new HashMap(13);
        long l = a ^ 0x13B5E50CBB42L;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00c46\u00d6\u00ea\u0099\u0003?\u0010\u00ce\u0080\u008d\u00b8\u00f3\u0091\u00a4U\u0010\u007f\u00b4\u00d4bn}\u00d5\u00d7\u00bb\u0014\u00a8\u0005\u00fa\u00eacW";
        int n2 = "\u00c46\u00d6\u00ea\u0099\u0003?\u0010\u00ce\u0080\u008d\u00b8\u00f3\u0091\u00a4U\u0010\u007f\u00b4\u00d4bn}\u00d5\u00d7\u00bb\u0014\u00a8\u0005\u00fa\u00eacW".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = bs_.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x85;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("bs_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            bs_.e[n2] = bs_.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bs_.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("bs_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bs_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

