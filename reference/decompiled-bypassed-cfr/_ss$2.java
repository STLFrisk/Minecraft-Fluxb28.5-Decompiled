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

public final class _ss$2
implements bx6 {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    @Override
    public String dg6(int n) {
        String string;
        block20: {
            double d;
            double d2;
            double d3;
            long l;
            block23: {
                block24: {
                    int n2;
                    double d4;
                    block21: {
                        block22: {
                            double d5;
                            block18: {
                                block19: {
                                    l = a ^ 0x1BB9830A69DFL;
                                    d3 = (double)n / 20.0;
                                    d2 = d3 / 60.0;
                                    d4 = d2 / 60.0;
                                    n2 = t9d.c();
                                    d5 = d4 / 24.0;
                                    double d6 = d5 / 365.0;
                                    try {
                                        try {
                                            double d7 = d6 - 0.5;
                                            d = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                                            if (n2 != 0) break block18;
                                            if (d > 0) {
                                            }
                                            break block19;
                                        }
                                        catch (oov oov2) {
                                            throw _ss$2.a(oov2);
                                        }
                                        string = _ss.esp().format(d6) + (String)((Object)_ss$2.a("m", (int)14796, (long)(0x4501748B598B5182L ^ l)));
                                        break block20;
                                    }
                                    catch (oov oov3) {
                                        throw _ss$2.a(oov3);
                                    }
                                }
                                double d8 = d5 - 0.5;
                                d = d8 == 0.0 ? 0 : (d8 > 0.0 ? 1 : -1);
                            }
                            try {
                                try {
                                    if (n2 != 0) break block21;
                                    if (d > 0) {
                                    }
                                    break block22;
                                }
                                catch (oov oov4) {
                                    throw _ss$2.a(oov4);
                                }
                                string = _ss.esp().format(d5) + (String)((Object)_ss$2.a("m", (int)21581, (long)(0x79152ECC470F3C00L ^ l)));
                                break block20;
                            }
                            catch (oov oov5) {
                                throw _ss$2.a(oov5);
                            }
                        }
                        double d9 = d4 - 0.5;
                        d = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                    }
                    try {
                        try {
                            if (n2 != 0) break block23;
                            if (d > 0) {
                            }
                            break block24;
                        }
                        catch (oov oov6) {
                            throw _ss$2.a(oov6);
                        }
                        string = _ss.esp().format(d4) + (String)((Object)_ss$2.a("m", (int)15212, (long)(0x5052FACE336B5323L ^ l)));
                        break block20;
                    }
                    catch (oov oov7) {
                        throw _ss$2.a(oov7);
                    }
                }
                double d10 = d2 - 0.5;
                d = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
            }
            try {
                if (d > 0) {
                    string = _ss.esp().format(d2) + (String)((Object)_ss$2.a("m", (int)17121, (long)(0x107DEC217783AAADL ^ l)));
                }
            }
            catch (oov oov8) {
                throw _ss$2.a(oov8);
            }
            string = d3 + (String)((Object)_ss$2.a("m", (int)8828, (long)(0x4BE8B22468F64A35L ^ l)));
        }
        return string;
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

                _ss$2.a = c.a(-1852683088249835535L, 3843871833302297240L, MethodHandles.lookup().lookupClass()).a(93333536604944L);
                _ss$2.d = new HashMap<K, V>(13);
                var0 = _ss$2.a ^ 1308594464967L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u00f8\u00cc( \u0016A+G\u00c2\u00f8]V\u009b4\u00ae\u00e5\u0010\u009a{\u00b20\u0013\u0019\u00bd\\\u0091\u00bb\u00c8\u00b8\u00b2W\u00e4Y\u0010f/ly>\u00ce\u00fc\u001c\u0007\u00fd|\u0089Q\u00b1a\u008e";
                var8_6 = "\u00f8\u00cc( \u0016A+G\u00c2\u00f8]V\u009b4\u00ae\u00e5\u0010\u009a{\u00b20\u0013\u0019\u00bd\\\u0091\u00bb\u00c8\u00b8\u00b2W\u00e4Y\u0010f/ly>\u00ce\u00fc\u001c\u0007\u00fd|\u0089Q\u00b1a\u008e".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = _ss$2.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e3\u00ac\u00d4!\u00eb&,\u00a7\u00b7.\u00ec\u00ce5z\t\u0006\u0010\u00a0\u0089\f\u0095\u00eb\u00ef\u00a5\u00aa\u00bc\u00cdJ{(\u0006p\u00e4";
                    var8_6 = "\u00e3\u00ac\u00d4!\u00eb&,\u00a7\u00b7.\u00ec\u00ce5z\t\u0006\u0010\u00a0\u0089\f\u0095\u00eb\u00ef\u00a5\u00aa\u00bc\u00cdJ{(\u0006p\u00e4".length();
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
                    var9_3[var7_4++] = _ss$2.a(var10_9).intern();
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
        _ss$2.b = var9_3;
        _ss$2.c = new String[5];
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String a(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2D81;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("_ss$2", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            _ss$2.c[n2] = _ss$2.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _ss$2.a(n, l);
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
            throw new RuntimeException("_ss$2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_ss$2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

