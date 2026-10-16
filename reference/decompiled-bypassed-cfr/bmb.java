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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bmb
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x1AEBF53641D2L;
        return bmb.b("p", (int)15279, (long)(0x7E474BDE3B97CB5L ^ l));
    }

    @Override
    public int bag() {
        return 2;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x1415B6A11D54L;
        return bmb.b("p", (int)31904, (long)(0x404B27A8A43F6739L ^ l));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void l3z(e7r var1_1, String[] var2_2) {
        block24: {
            block26: {
                block25: {
                    block27: {
                        block28: {
                            block34: {
                                block33: {
                                    block32: {
                                        block30: {
                                            var3_3 = bmb.a ^ 33983005963415L;
                                            var5_4 = t9d.c();
                                            try {
                                                if (var2_2.length < 5) {
                                                    throw new w57((String)bmb.b("p", (int)12232, (long)(3001612930110463377L ^ var3_3)), new Object[0]);
                                                }
                                            }
                                            catch (Throwable v0) {
                                                throw bmb.a(v0);
                                            }
                                            var6_5 = bmb.arm(var1_1, var2_2[0], i2h.class);
                                            var7_6 = bmb.d80(var6_5.o2v, var2_2[1], false);
                                            var9_7 = bmb.d80(var6_5.kfp, var2_2[2], false);
                                            var11_8 = bmb.d80(var6_5.vbd, var2_2[3], false);
                                            var13_9 = new mew(var7_6, var9_7, var11_8);
                                            var14_10 = 4;
                                            v1 = bmb.b("p", (int)25690, (long)(2196976388649604609L ^ var3_3));
                                            if (var5_4 != 0) break block24;
                                            if (!v1.equals(var2_2[4])) break block25;
                                            break block30;
                                            catch (Throwable v2) {
                                                throw bmb.a(v2);
                                            }
                                        }
                                        try {
                                            block31: {
                                                v3 = var2_2;
                                                if (var5_4 != 0) break block26;
                                                break block31;
                                                catch (Throwable v4) {
                                                    throw bmb.a(v4);
                                                }
                                            }
                                            if (v3.length <= 10) break block25;
                                        }
                                        catch (Throwable v5) {
                                            throw bmb.a(v5);
                                        }
                                        var15_11 = var6_5.qha();
                                        var16_12 = bmb.d80(var7_6, var2_2[5], false);
                                        var18_14 = bmb.d80(var9_7, var2_2[6], false);
                                        var20_17 = bmb.d80(var11_8, var2_2[7], false);
                                        var22_18 = bmb.dde(var1_1, var2_2[8]);
                                        var23_19 = bmb.fzm(var2_2[9], -1, 15);
                                        var24_20 = new mew(var16_12, var18_14, var20_17);
                                        var25_21 = var15_11.getBlockState(var24_20);
                                        if (var25_21.r_y() != var22_18) ** GOTO lbl72
                                        v6 = var23_19;
                                        if (var5_4 != 0) break block27;
                                        break block32;
                                        catch (Throwable v7) {
                                            throw bmb.a(v7);
                                        }
                                    }
                                    if (v6 < 0) break block28;
                                    break block33;
                                    catch (Throwable v8) {
                                        throw bmb.a(v8);
                                    }
                                }
                                v6 = var25_21.r_y().hvp(var25_21);
                                if (var5_4 != 0) break block27;
                                break block34;
                                catch (Throwable v9) {
                                    throw bmb.a(v9);
                                }
                            }
                            try {
                                block35: {
                                    if (v6 == var23_19) break block28;
                                    break block35;
                                    catch (Throwable v10) {
                                        throw bmb.a(v10);
                                    }
                                }
                                v11 = new Object[2];
                                v11[0] = bmb.b("p", (int)22395, (long)(5542148555515421989L ^ var3_3));
                                v11[1] = var6_5.noc();
                                throw new uvb((String)bmb.b("p", (int)6595, (long)(2490771739522182047L ^ var3_3)), v11);
                            }
                            catch (Throwable v12) {
                                throw bmb.a(v12);
                            }
                        }
                        v6 = 10;
                    }
                    var14_10 = v6;
                }
                v3 = var2_2;
            }
            v1 = bmb.cai(v3, var14_10);
        }
        var15_11 = v1;
        var16_13 = new bmb$1(this, var6_5, var1_1, var13_9, var7_6, var9_7, var11_8);
        var17_22 = vr1._0v().rns();
        try {
            var18_15 = var17_22.q2n(var16_13, (String)var15_11);
            try {
                if (var18_15 < 1) {
                    throw new uvb((String)bmb.b("p", (int)28882, (long)(6829256161735066255L ^ var3_3)), new Object[]{var15_11});
                }
            }
            catch (Throwable v13) {
                throw bmb.a(v13);
            }
        }
        catch (Throwable var18_16) {
            throw new uvb((String)bmb.b("p", (int)16717, (long)(5937927908684493589L ^ var3_3)), new Object[]{var15_11, var6_5.noc()});
        }
    }

    @Override
    public List ggu(e7r e7r2, String[] stringArray, mew mew2) {
        List list;
        block32: {
            block39: {
                int n;
                block38: {
                    int n2;
                    long l;
                    block35: {
                        int n3;
                        block37: {
                            block36: {
                                block33: {
                                    block34: {
                                        block30: {
                                            block31: {
                                                l = a ^ 0x321ECABAE967L;
                                                n3 = t9d.c();
                                                try {
                                                    try {
                                                        n = stringArray.length;
                                                        n2 = 1;
                                                        if (n3 != 0) break block30;
                                                        if (n != n2) break block31;
                                                    }
                                                    catch (oov oov2) {
                                                        throw bmb.a(oov2);
                                                    }
                                                    list = bmb.cqo(stringArray, vr1._0v().p14());
                                                    break block32;
                                                }
                                                catch (oov oov3) {
                                                    throw bmb.a(oov3);
                                                }
                                            }
                                            n = stringArray.length;
                                            n2 = 1;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n3 != 0) break block33;
                                                        if (n <= n2) break block34;
                                                    }
                                                    catch (oov oov4) {
                                                        throw bmb.a(oov4);
                                                    }
                                                    n = stringArray.length;
                                                    n2 = 4;
                                                    if (n3 != 0) break block33;
                                                }
                                                catch (oov oov5) {
                                                    throw bmb.a(oov5);
                                                }
                                                if (n > n2) break block34;
                                            }
                                            catch (oov oov6) {
                                                throw bmb.a(oov6);
                                            }
                                            list = bmb.aqt(stringArray, 1, mew2);
                                            break block32;
                                        }
                                        catch (oov oov7) {
                                            throw bmb.a(oov7);
                                        }
                                    }
                                    n = stringArray.length;
                                    n2 = 5;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n3 != 0) break block35;
                                                        if (n <= n2) break block36;
                                                    }
                                                    catch (oov oov8) {
                                                        throw bmb.a(oov8);
                                                    }
                                                    n = stringArray.length;
                                                    n2 = 8;
                                                    if (n3 != 0) break block35;
                                                }
                                                catch (oov oov9) {
                                                    throw bmb.a(oov9);
                                                }
                                                if (n > n2) break block36;
                                            }
                                            catch (oov oov10) {
                                                throw bmb.a(oov10);
                                            }
                                            n = ((String)((Object)bmb.b("p", (int)22395, (long)(0x4CE98649E5B5B8D5L ^ l)))).equals(stringArray[4]) ? 1 : 0;
                                            if (n3 != 0) break block37;
                                        }
                                        catch (oov oov11) {
                                            throw bmb.a(oov11);
                                        }
                                        if (n == 0) break block36;
                                    }
                                    catch (oov oov12) {
                                        throw bmb.a(oov12);
                                    }
                                    list = bmb.aqt(stringArray, 5, mew2);
                                    break block32;
                                }
                                catch (oov oov13) {
                                    throw bmb.a(oov13);
                                }
                            }
                            n = stringArray.length;
                        }
                        try {
                            if (n3 != 0) break block38;
                            n2 = 9;
                        }
                        catch (oov oov14) {
                            throw bmb.a(oov14);
                        }
                    }
                    try {
                        if (n != n2) break block39;
                        n = ((String)((Object)bmb.b("p", (int)22395, (long)(0x4CE98649E5B5B8D5L ^ l)))).equals(stringArray[4]) ? 1 : 0;
                    }
                    catch (oov oov15) {
                        throw bmb.a(oov15);
                    }
                }
                try {
                    if (n == 0) break block39;
                    list = bmb.d79(stringArray, e0x.db8.kqi());
                    break block32;
                }
                catch (oov oov16) {
                    throw bmb.a(oov16);
                }
            }
            list = null;
        }
        return list;
    }

    @Override
    public boolean mp9(String[] stringArray, int n) {
        boolean bl;
        block2: {
            block3: {
                int n2 = t9d.c();
                try {
                    bl = n;
                    if (n2 != 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw bmb.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
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

                bmb.a = c.a(1830093489020941341L, 4594820823671511922L, MethodHandles.lookup().lookupClass()).a(139468473775732L);
                bmb.h = new HashMap<K, V>(13);
                var0 = bmb.a ^ 124935382712744L;
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
                var6_5 = "\u00e0\u00ect\u0085vLR\u00e4\u0087\u0080\u00ab\u0090D\u009an\u00a6\u00f0\u0011\u0011\u00d5\u00c3\u00dd\u00e2\u0097@\u00ca\u008aih*\u00d0\u00eb,\u00ae/\u00ef\u009b\u0005\u00f0\u00f9\u009fY4wc\u00e1N\u0001\u00b3\u0092B\u00bd\u00a4\u0087p\u00ddKg\u00bf\u00a6\u00e7\u00f1\u00ee\u00cb(\u00f2q4a\u00b2\u0085CY2\u0082\u00bb\"E}\u00ee\u009f]}\u00df\u00e4\u00f3a\u0006\u00e7!0U\u00f7~\u009a_\u008c\u00ec\u009aS0\u0010\u00f0c\u0012\u0010\u00dc\u0002\tD1\u007f\u008f\u0000\u0002X\u0000Y\u0089vl\u000b\u0010\u00fc\u00c5\u0084\u009c(\u009a\u00c3e\u00ec\u00ea\u001c\u00f7\u007ffFs(\u00df\u00c37\u00a0\u00ca\u00fb\u0097\u00dcpB\u00e31\u00d4\u00b9\u00f7\u00bb.?\u00d6\u00d8\u0006:{\u008e\u009a\u00a8%[\u0088\u00ad\u00fdE`\u009d\u00b2\u0098Q9\u0015}(\u00c28\u0006;!\u00ab\u00b2c;\u0088\u00e6\u00dcChA\u00b7\u0085\u0018\u00eff\u00b4\u0001\u00b3\u00bf\u00f9\u00d4L\u00ec7\\\u0013\u00e6G%\u00e7A\u00c4f\u00db\u00f1";
                var8_6 = "\u00e0\u00ect\u0085vLR\u00e4\u0087\u0080\u00ab\u0090D\u009an\u00a6\u00f0\u0011\u0011\u00d5\u00c3\u00dd\u00e2\u0097@\u00ca\u008aih*\u00d0\u00eb,\u00ae/\u00ef\u009b\u0005\u00f0\u00f9\u009fY4wc\u00e1N\u0001\u00b3\u0092B\u00bd\u00a4\u0087p\u00ddKg\u00bf\u00a6\u00e7\u00f1\u00ee\u00cb(\u00f2q4a\u00b2\u0085CY2\u0082\u00bb\"E}\u00ee\u009f]}\u00df\u00e4\u00f3a\u0006\u00e7!0U\u00f7~\u009a_\u008c\u00ec\u009aS0\u0010\u00f0c\u0012\u0010\u00dc\u0002\tD1\u007f\u008f\u0000\u0002X\u0000Y\u0089vl\u000b\u0010\u00fc\u00c5\u0084\u009c(\u009a\u00c3e\u00ec\u00ea\u001c\u00f7\u007ffFs(\u00df\u00c37\u00a0\u00ca\u00fb\u0097\u00dcpB\u00e31\u00d4\u00b9\u00f7\u00bb.?\u00d6\u00d8\u0006:{\u008e\u009a\u00a8%[\u0088\u00ad\u00fdE`\u009d\u00b2\u0098Q9\u0015}(\u00c28\u0006;!\u00ab\u00b2c;\u0088\u00e6\u00dcChA\u00b7\u0085\u0018\u00eff\u00b4\u0001\u00b3\u00bf\u00f9\u00d4L\u00ec7\\\u0013\u00e6G%\u00e7A\u00c4f\u00db\u00f1".length();
                var5_7 = 64;
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
                    var9_3[var7_4++] = bmb.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00eb\u00eb\u00e1\u0002\u00f0\u001e\u00d7\u00ed\u0016\u00d2\u00d1Du0\u00b8\u0000(\u0016-?\u009d\u0084vw\u0010\u00df,\u00ba?`\u00f0\u00bb\u00ed\u00c4\u00fa\u00d3\u00d2~\u00d4E\u001aI?I\u00b4%5\u00de\u00012\u0015\u00fb\u00d1J\u0081\u00a3v";
                    var8_6 = "\u00eb\u00eb\u00e1\u0002\u00f0\u001e\u00d7\u00ed\u0016\u00d2\u00d1Du0\u00b8\u0000(\u0016-?\u009d\u0084vw\u0010\u00df,\u00ba?`\u00f0\u00bb\u00ed\u00c4\u00fa\u00d3\u00d2~\u00d4E\u001aI?I\u00b4%5\u00de\u00012\u0015\u00fb\u00d1J\u0081\u00a3v".length();
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
                    var9_3[var7_4++] = bmb.b(var10_9).intern();
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
        bmb.c = var9_3;
        bmb.g = new String[8];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1E03;
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
                throw new RuntimeException("bmb", exception);
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
            bmb.g[n2] = bmb.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bmb.b(n, l);
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
            throw new RuntimeException("bmb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bmb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

