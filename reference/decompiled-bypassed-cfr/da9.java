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

public class da9
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x60532E5190FBL;
        return da9.b("j", (int)15199, (long)(0x59B7E88DC82C681BL ^ l));
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x6EAD6DC6CC7DL;
        return da9.b("j", (int)26266, (long)(0x56C28D502477695AL ^ l));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void l3z(e7r var1_1, String[] var2_2) {
        block31: {
            block28: {
                block35: {
                    var3_3 = da9.a ^ 110297236399550L;
                    var6_4 = vr1._0v();
                    v0 = t9d.b();
                    var1_1.a0d(new hsu((String)da9.b("j", (int)17521, (long)(450278609399898743L ^ var3_3)), new Object[0]));
                    var5_5 = v0;
                    v1 = var6_4.wh3();
                    if (var5_5 == 0) break block35;
                    try {
                        block36: {
                            if (v1 == null) break block28;
                            break block36;
                            catch (d3f v2) {
                                throw da9.a(v2);
                            }
                        }
                        v1 = var6_4.wh3();
                    }
                    catch (d3f v3) {
                        throw da9.a(v3);
                    }
                }
                v1.b8x();
            }
            try {
                block33: {
                    block32: {
                        block30: {
                            for (var7_6 = 0; var7_6 < var6_4.p_y.length; ++var7_6) {
                                block29: {
                                    block37: {
                                        v4 = var6_4.p_y[var7_6];
                                        if (var5_5 == 0) ** GOTO lbl88
                                        if (var5_5 == 0) break block29;
                                        break block37;
                                        catch (d3f v5) {
                                            throw da9.a(v5);
                                        }
                                    }
                                    try {
                                        block38: {
                                            if (v4 == null) continue;
                                            break block38;
                                            catch (d3f v6) {
                                                throw da9.a(v6);
                                            }
                                        }
                                        v7 = var6_4.p_y[var7_6];
                                    }
                                    catch (d3f v8) {
                                        throw da9.a(v8);
                                    }
                                }
                                var8_8 = v7;
                                var9_9 = var8_8.b4a;
                                var8_8.b4a = false;
                                var8_8.w3w(true, null);
                                var8_8.b4a = var9_9;
                                if (var5_5 != 0) continue;
                            }
                            v9 = var2_2.length;
                            if (var5_5 == 0) break block30;
                            try {
                                block39: {
                                    if (v9 <= 0) break block31;
                                    break block39;
                                    catch (d3f v10) {
                                        throw da9.a(v10);
                                    }
                                }
                                v9 = (int)da9.b("j", (int)25365, (long)(7033517728573900049L ^ var3_3)).equals(var2_2[0]);
                            }
                            catch (d3f v11) {
                                throw da9.a(v11);
                            }
                        }
                        if (var5_5 == 0) break block32;
                        try {
                            block40: {
                                if (v9 == 0) break block31;
                                break block40;
                                catch (d3f v12) {
                                    throw da9.a(v12);
                                }
                            }
                            var1_1.a0d(new hsu((String)da9.b("j", (int)28424, (long)(2131113706098182413L ^ var3_3)), new Object[0]));
                            v9 = 0;
                        }
                        catch (d3f v13) {
                            throw da9.a(v13);
                        }
                    }
                    for (var7_6 = v1047603; var7_6 < var6_4.p_y.length; ++var7_6) {
                        block34: {
                            try {
                                v14 = var6_4;
                                if (var5_5 == 0) break block33;
                                v4 = v14.p_y[var7_6];
                            }
                            catch (d3f v15) {
                                throw da9.a(v15);
                            }
lbl88:
                            // 3 sources

                            if (var5_5 == 0) break block34;
                            try {
                                block41: {
                                    if (v4 == null) continue;
                                    break block41;
                                    catch (d3f v16) {
                                        throw da9.a(v16);
                                    }
                                }
                                v4 = var6_4.p_y[var7_6];
                            }
                            catch (d3f v17) {
                                throw da9.a(v17);
                            }
                        }
                        var8_8 = v4;
                        var9_9 = var8_8.b4a;
                        var8_8.b4a = false;
                        var8_8.bt7();
                        var8_8.b4a = var9_9;
                        if (var5_5 != 0) continue;
                    }
                    v14 = var1_1;
                }
                v14.a0d(new hsu((String)da9.b("j", (int)23585, (long)(8550487920576690726L ^ var3_3)), new Object[0]));
            }
            catch (d3f var7_7) {
                da9.wxl(var1_1, this, (String)da9.b("j", (int)31974, (long)(933943580003490532L ^ var3_3)), new Object[]{var7_7.getMessage()});
                return;
            }
        }
        da9.wxl(var1_1, this, (String)da9.b("j", (int)26959, (long)(8267981082418073423L ^ var3_3)), new Object[0]);
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

                da9.a = c.a(-6954547087601975451L, 6370488362357072351L, MethodHandles.lookup().lookupClass()).a(201924320339705L);
                da9.h = new HashMap<K, V>(13);
                var0 = da9.a ^ 1175510611502L;
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
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "#&\u0089\u00c2\u0093\u00b3\u00d0]\u001fLj\u00931\u0097o\u0003\u008e<j\u00a0`\u0017a\u009f= 4-\u0001\u00cf\u0017\u00c6!C\u00a0\u00f8\u00cb/uN(\u00a1\u00ad\u00ff\u00c29\u000b\u00bfia\b\u00b0\u0013{\u00c1w\u0082S\u00d2f\u00a7\u00f2\u00a0}$\u0095@4\u0000\u00ee\u001e\u00ael\u009b%\u0089\u00ca\u009a\u00bca\u00a1(M\u00fbi\u00cdt\u008b\u00a2\u0099}\u00bd\u00a5\u00e7\u001d\u00f9\u009bq8\u00ad\u008e\u00ed\u00dbj\u00d9C\u0012\u00ae\u00198\u00fcw\u00f2D\u00c6\u0010Cy\u009cER\u00d7\u0018N\u00e8\u008c\u00c6Mr\u00e2o\u001b\u008c\u001bF[q\u008b\u00d7\u00a7Wv4u\u00f0\u0094|(c\u00bc+\u0087Kv;\u0001I*\u001e}\u0091\u0083Qh\u00c1\u00f7=i\u00d0\r\u00ab\u0090\u00b9\u00bc\u0000(\u009b\u00ef\u00a1\u00de\u00f6\u0006\u0099\u0099x)fm(D\u0093\u00a3l\u000b\u00f3\u00fd\u00d3\u00f5*m\u00dfS\u009c\u00fc\u00bf\u009b\u0017\u0002(\u0083\u001e\u00df\u008f\u0082\u00b8(\u0096\u00f7\u00f8\u00bf\u0013\u0087\u0006{8\u00ef\u00bb\u00fe\u0005";
                var8_6 = "#&\u0089\u00c2\u0093\u00b3\u00d0]\u001fLj\u00931\u0097o\u0003\u008e<j\u00a0`\u0017a\u009f= 4-\u0001\u00cf\u0017\u00c6!C\u00a0\u00f8\u00cb/uN(\u00a1\u00ad\u00ff\u00c29\u000b\u00bfia\b\u00b0\u0013{\u00c1w\u0082S\u00d2f\u00a7\u00f2\u00a0}$\u0095@4\u0000\u00ee\u001e\u00ael\u009b%\u0089\u00ca\u009a\u00bca\u00a1(M\u00fbi\u00cdt\u008b\u00a2\u0099}\u00bd\u00a5\u00e7\u001d\u00f9\u009bq8\u00ad\u008e\u00ed\u00dbj\u00d9C\u0012\u00ae\u00198\u00fcw\u00f2D\u00c6\u0010Cy\u009cER\u00d7\u0018N\u00e8\u008c\u00c6Mr\u00e2o\u001b\u008c\u001bF[q\u008b\u00d7\u00a7Wv4u\u00f0\u0094|(c\u00bc+\u0087Kv;\u0001I*\u001e}\u0091\u0083Qh\u00c1\u00f7=i\u00d0\r\u00ab\u0090\u00b9\u00bc\u0000(\u009b\u00ef\u00a1\u00de\u00f6\u0006\u0099\u0099x)fm(D\u0093\u00a3l\u000b\u00f3\u00fd\u00d3\u00f5*m\u00dfS\u009c\u00fc\u00bf\u009b\u0017\u0002(\u0083\u001e\u00df\u008f\u0082\u00b8(\u0096\u00f7\u00f8\u00bf\u0013\u0087\u0006{8\u00ef\u00bb\u00fe\u0005".length();
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
                    var9_3[var7_4++] = da9.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00f4-\u00c7b\u0092\u00b7j\t_+\u00f04\u00f8nf 8\u00f2-RC\u00b7\u0086\u00ad\u00c5\u00c504)\u0086j\u001cA\u00a8T\u00b6\u00ceM\u00de\u0010\u00a7\u008a\u00d7\u00f1%\u008d\u00f7\u00efq\u00ce\u0088rJ\u001b\u00f8Pg\u000e/\u00f0\u00ea_E\u00f9\u0000\u0089\u00c6\u00c6\u00d5R\u0007\u00c7\u0012";
                    var8_6 = "\u00f4-\u00c7b\u0092\u00b7j\t_+\u00f04\u00f8nf 8\u00f2-RC\u00b7\u0086\u00ad\u00c5\u00c504)\u0086j\u001cA\u00a8T\u00b6\u00ceM\u00de\u0010\u00a7\u008a\u00d7\u00f1%\u008d\u00f7\u00efq\u00ce\u0088rJ\u001b\u00f8Pg\u000e/\u00f0\u00ea_E\u00f9\u0000\u0089\u00c6\u00c6\u00d5R\u0007\u00c7\u0012".length();
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
                    var9_3[var7_4++] = da9.b(var10_9).intern();
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
        da9.c = var9_3;
        da9.g = new String[8];
    }

    private static d3f a(d3f d3f2) {
        return d3f2;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xA5C;
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
                throw new RuntimeException("da9", exception);
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
            da9.g[n2] = da9.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = da9.b(n, l);
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
            throw new RuntimeException("da9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(da9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

