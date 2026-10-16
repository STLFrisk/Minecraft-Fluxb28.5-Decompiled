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

public class drn
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x616EA59DFF34L;
        return drn.b("v", (int)24054, (long)(0x6216247E44021F54L ^ l));
    }

    @Override
    public int bag() {
        return 0;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x6F90E60AA3B2L;
        return drn.b("v", (int)27876, (long)(0x33F0804AFECF72C3L ^ l));
    }

    @Override
    public void l3z(e7r e7r2, String[] stringArray) {
        boolean bl;
        wlx wlx2;
        tao tao2;
        tao tao3;
        e7r e7r3;
        int n;
        block3: {
            block2: {
                long l = a ^ 0x656D18540A71L;
                n = vr1._0v().mij();
                try {
                    tao tao4;
                    e7r2.a0d(new hsu((String)((Object)drn.b("v", (int)13390, (long)(0x8BDB9B464A383ABL ^ l))), new Object[]{n, vr1._0v().ao7()}));
                    e7r3 = e7r2;
                    tao3 = tao4;
                    tao2 = tao4;
                    wlx2 = vr1._0v().wh3();
                    if (stringArray.length <= 0) break block2;
                    if (!((String)((Object)drn.b("v", (int)1848, (long)(0x24D68464D5B430DEL ^ l)))).equalsIgnoreCase(stringArray[0])) break block2;
                }
                catch (oov oov2) {
                    throw drn.a(oov2);
                }
                bl = true;
                break block3;
            }
            bl = false;
        }
        tao3(wlx2.uuy(bl));
        e7r3.a0d(tao2);
        e7r2.io9(n_k$pbp.t39, n);
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

                drn.a = c.a(434260218746488043L, 3340984134365005258L, MethodHandles.lookup().lookupClass()).a(159575838217310L);
                drn.h = new HashMap<K, V>(13);
                var0 = drn.a ^ 85177006295387L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "6\u00ba\u00f4\u00edP\u00ff\u0007t\u00c6\u00da5`\u0007\u00dc\u00f9\u00da\u008a\u00b3\u00d0%\u00ab\u00ea\u0003\u0083P;\u00b8\u0002\u0013\u0089.CO\n\u00c4[\u00beW\u00be\u00de0&\u0006B\u00e7>\u0082\u00ab\u00e3\u00c7\u00b4\u00f9\u0099\u0081+\u00f9i`\b+\u00ee\u00afn\u00b8i\u00c5m\u008cxl\u000fnp{a\u00c9\u00fe\u008c\u008b'3\u00c6\u00d0\u00ae\u00b4!\b\u00ddR";
                var8_6 = "6\u00ba\u00f4\u00edP\u00ff\u0007t\u00c6\u00da5`\u0007\u00dc\u00f9\u00da\u008a\u00b3\u00d0%\u00ab\u00ea\u0003\u0083P;\u00b8\u0002\u0013\u0089.CO\n\u00c4[\u00beW\u00be\u00de0&\u0006B\u00e7>\u0082\u00ab\u00e3\u00c7\u00b4\u00f9\u0099\u0081+\u00f9i`\b+\u00ee\u00afn\u00b8i\u00c5m\u008cxl\u000fnp{a\u00c9\u00fe\u008c\u008b'3\u00c6\u00d0\u00ae\u00b4!\b\u00ddR".length();
                var5_7 = 40;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = drn.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0004\u00f2\u0094\u00f4\u00b1\u00e4\u00a5\u0000\u00c3\u00ad\u00c0&\u00a2yW\u0007\u0010v\u0013\u007f\u001b\u0097\u00d0\u00a7\u008a9\u00de\u0000\u00eb\u00bd<\u0017\u00ff";
                    var8_6 = "\u0004\u00f2\u0094\u00f4\u00b1\u00e4\u00a5\u0000\u00c3\u00ad\u00c0&\u00a2yW\u0007\u0010v\u0013\u007f\u001b\u0097\u00d0\u00a7\u008a9\u00de\u0000\u00eb\u00bd<\u0017\u00ff".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = drn.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        drn.c = var9_3;
        drn.g = new String[4];
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1BBB;
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
                throw new RuntimeException("drn", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            drn.g[n2] = drn.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = drn.b(n, l);
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
            throw new RuntimeException("drn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(drn.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

