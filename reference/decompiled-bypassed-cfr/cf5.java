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

public class cf5
extends ar7 {
    public static crk _dh;
    public static crk b27;
    public static crk rww;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public cf5() {
        long l = a ^ 0x3F38C7AD05C3L;
        super((String)((Object)cf5.b("c", (int)30003, (long)(0x4CC655B33CCECD59L ^ l))), _aj.i9j, false, new j1s[0]);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                cf5.a = c.a(-8381256728347528163L, 8963345251128336324L, MethodHandles.lookup().lookupClass()).a(129116563816973L);
                var9 = cf5.a ^ 62680928141336L;
                cf5.h = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[5];
                var5_4 = 0;
                var4_5 = "\u00a2=L\u0086\u0011\u00e9`6\u008fA]\u00ad\u00b6\u00ffzY\u00108\u0004\u00f1\u0015\u0013\u00b1\u0011\"kZ+\u009dt\u00bbI\u00ce\u0010\u00c0Q\u00ed\u00ae\u00e9\u00a0\u0091\u0080\u009a_\u00bc-s\u001d\u00e1\u00af";
                var6_6 = "\u00a2=L\u0086\u0011\u00e9`6\u008fA]\u00ad\u00b6\u00ffzY\u00108\u0004\u00f1\u0015\u0013\u00b1\u0011\"kZ+\u009dt\u00bbI\u00ce\u0010\u00c0Q\u00ed\u00ae\u00e9\u00a0\u0091\u0080\u009a_\u00bc-s\u001d\u00e1\u00af".length();
                var3_7 = 16;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = cf5.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "5\u00c7n\u00c9k:/\u00f2\\\u00f7e\u00d2\u00b8\u0004#\u00ba\u0010;,^l\u00f2\u000b\u00b4L\u00e5y\u000f\u00b5\u00c8\u00b2\u007f>";
                    var6_6 = "5\u00c7n\u00c9k:/\u00f2\\\u00f7e\u00d2\u00b8\u0004#\u00ba\u0010;,^l\u00f2\u000b\u00b4L\u00e5y\u000f\u00b5\u00c8\u00b2\u007f>".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = cf5.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        cf5.f = var7_3;
        cf5.g = new String[5];
        cf5._dh = new crk((String)cf5.b("c", (int)2233, (long)(6626118443450692873L ^ var9)), (String)cf5.b("c", (int)13756, (long)(7296272987623868424L ^ var9)), 255.0f, 0.0f, 255.0f, 1.0f);
        cf5.b27 = new crk((String)cf5.b("c", (int)30003, (long)(5532201044191676546L ^ var9)), (String)cf5.b("c", (int)7751, (long)(3690820535456326645L ^ var9)), 255.0f, 0.0f, 255.0f, 1.0f);
        cf5.rww = new crk((String)cf5.b("c", (int)30003, (long)(5532201044191676546L ^ var9)), (String)cf5.b("c", (int)10751, (long)(7726422401990382668L ^ var9)), 255.0f, 0.0f, 255.0f, 1.0f);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5347;
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
                throw new RuntimeException("cf5", exception);
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
            cf5.g[n2] = cf5.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cf5.b(n, l);
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
            throw new RuntimeException("cf5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cf5.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

