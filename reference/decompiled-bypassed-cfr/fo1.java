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

public class fo1
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x7470BDDE1C75L;
        return fo1.b("g", (int)30133, (long)(0xB765C6088D6FBD2L ^ l));
    }

    @Override
    public int bag() {
        return 2;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x7A8EFE4940F3L;
        return fo1.b("g", (int)30014, (long)(0x5ACB4DF1ECBDA7DCL ^ l));
    }

    @Override
    public void l3z(e7r e7r2, String[] stringArray) {
        block20: {
            e7r e7r3;
            mew mew2;
            z96 z962;
            long l;
            block19: {
                mew mew3;
                z96 z963;
                int n;
                int n2;
                block17: {
                    block18: {
                        l = a ^ 0x70730017E930L;
                        n2 = t9d.b();
                        try {
                            try {
                                try {
                                    try {
                                        n = stringArray.length;
                                        if (n2 == 0) break block17;
                                        if (n <= 1) break block18;
                                    }
                                    catch (oov oov2) {
                                        throw fo1.a(oov2);
                                    }
                                    n = stringArray.length;
                                    if (n2 == 0) break block17;
                                }
                                catch (oov oov3) {
                                    throw fo1.a(oov3);
                                }
                                if (n < 4) {
                                }
                                break block18;
                            }
                            catch (oov oov4) {
                                throw fo1.a(oov4);
                            }
                            throw new w57((String)((Object)fo1.b("g", (int)2130, (long)(0x1F11EA65A660F371L ^ l))), new Object[0]);
                        }
                        catch (oov oov5) {
                            throw fo1.a(oov5);
                        }
                    }
                    n = stringArray.length;
                }
                try {
                    z963 = n > 0 ? fo1.h32(e7r2, stringArray[0]) : fo1.cfc(e7r2);
                }
                catch (oov oov6) {
                    throw fo1.a(oov6);
                }
                z962 = z963;
                try {
                    mew3 = stringArray.length > 3 ? fo1.tiq(e7r2, stringArray, 1, true) : z962.d3d();
                }
                catch (oov oov7) {
                    throw fo1.a(oov7);
                }
                mew2 = mew3;
                try {
                    try {
                        e7r3 = z962;
                        if (n2 == 0) break block19;
                        if (e7r3.oay == null) break block20;
                    }
                    catch (oov oov8) {
                        throw fo1.a(oov8);
                    }
                    z962.i9g(mew2, true);
                    e7r3 = e7r2;
                }
                catch (oov oov9) {
                    throw fo1.a(oov9);
                }
            }
            fo1.wxl(e7r3, this, (String)((Object)fo1.b("g", (int)681, (long)(0x61CB756875A17989L ^ l))), new Object[]{z962.noc(), mew2.getX(), mew2.getY(), mew2.getZ()});
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public List ggu(e7r e7r2, String[] stringArray, mew mew2) {
        String[] stringArray2;
        List list;
        block13: {
            int n;
            int n2;
            block12: {
                int n3;
                block10: {
                    block11: {
                        n3 = t9d.b();
                        try {
                            try {
                                n2 = stringArray.length;
                                n = 1;
                                if (n3 == 0) break block10;
                                if (n2 != n) break block11;
                            }
                            catch (oov oov2) {
                                throw fo1.a(oov2);
                            }
                            list = fo1.cqo(stringArray, vr1._0v().p14());
                            return list;
                        }
                        catch (oov oov3) {
                            throw fo1.a(oov3);
                        }
                    }
                    n2 = stringArray.length;
                    n = 1;
                }
                try {
                    try {
                        try {
                            if (n3 == 0) break block12;
                            if (n2 <= n) return null;
                        }
                        catch (oov oov4) {
                            throw fo1.a(oov4);
                        }
                        stringArray2 = stringArray;
                        if (n3 == 0) break block13;
                    }
                    catch (oov oov5) {
                        throw fo1.a(oov5);
                    }
                    n2 = stringArray2.length;
                    n = 4;
                }
                catch (oov oov6) {
                    throw fo1.a(oov6);
                }
            }
            if (n2 > n) return null;
            stringArray2 = stringArray;
        }
        list = fo1.aqt(stringArray2, 1, mew2);
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
                    throw fo1.a(oov2);
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

                fo1.a = c.a(-4072110841109195047L, 2128020250767508076L, MethodHandles.lookup().lookupClass()).a(203253130850664L);
                fo1.h = new HashMap<K, V>(13);
                var0 = fo1.a ^ 72410790444930L;
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
                var6_5 = "\u0013\u00eeU\u00cf*\u0017\u00e2\u00d6\u00ad\u00fc+\u001e5\u0082\u00fb\\\u00d8\u009a!$\u0010\u00e1^\u00a8;\u00bb\u0014\u00d7\u0007b\u0015\u00e6\u00ec\u00c7>\u00b4\u00b0\u00cd\u00b5\u00a2\u00c8 \u00beQH\u00f2\u00c8\u009dV9'_`\u00fa\u0001\u000f0\r\u00db\u0011\u00a56\u0017.\u00fdf\u00b6\u00f4\u0093!\u00f3m\u009d\"\u0002<\u0007\u00eb\u00f1\u00c0:]O\u00b7\u00eb!\u00c2>\u00f1\u00d1\u00b8\u00d9\u001a\u00ee\u00df\u00e9\u0019)\u00bf:u_F\u0000\u00ce";
                var8_6 = "\u0013\u00eeU\u00cf*\u0017\u00e2\u00d6\u00ad\u00fc+\u001e5\u0082\u00fb\\\u00d8\u009a!$\u0010\u00e1^\u00a8;\u00bb\u0014\u00d7\u0007b\u0015\u00e6\u00ec\u00c7>\u00b4\u00b0\u00cd\u00b5\u00a2\u00c8 \u00beQH\u00f2\u00c8\u009dV9'_`\u00fa\u0001\u000f0\r\u00db\u0011\u00a56\u0017.\u00fdf\u00b6\u00f4\u0093!\u00f3m\u009d\"\u0002<\u0007\u00eb\u00f1\u00c0:]O\u00b7\u00eb!\u00c2>\u00f1\u00d1\u00b8\u00d9\u001a\u00ee\u00df\u00e9\u0019)\u00bf:u_F\u0000\u00ce".length();
                var5_7 = 56;
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
                    var9_3[var7_4++] = fo1.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "kY\u00bc\u00d4\t\u001d\u00d2\u00df\u0007\u000e\u00a3\u00ecj\u00b3\u0015p\u00c2\u0000v\u00fe/N\u00b8\u0098\u0082Q\u00ab\u00d5$\u0014f\u0080\u00b5\u0012\u008aI\u00a8\\\u001d\u0000\u0010\u00cf\u001es\u008b\u00fd\u0016\u00f52\u0094\u009a\f$7QQ \u000b\u00cc:\u00cc\u0012\u00b4b\u009f\u00fdt\u00bcS\u00c5\u007f\u009da\u00f86Ps\u00d6\u00e8\u00bc\u00bc,\u00eb\u009f\u0099\u0093\u00db\u0094\u00fe";
                    var8_6 = "kY\u00bc\u00d4\t\u001d\u00d2\u00df\u0007\u000e\u00a3\u00ecj\u00b3\u0015p\u00c2\u0000v\u00fe/N\u00b8\u0098\u0082Q\u00ab\u00d5$\u0014f\u0080\u00b5\u0012\u008aI\u00a8\\\u001d\u0000\u0010\u00cf\u001es\u008b\u00fd\u0016\u00f52\u0094\u009a\f$7QQ \u000b\u00cc:\u00cc\u0012\u00b4b\u009f\u00fdt\u00bcS\u00c5\u007f\u009da\u00f86Ps\u00d6\u00e8\u00bc\u00bc,\u00eb\u009f\u0099\u0093\u00db\u0094\u00fe".length();
                    var5_7 = 56;
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
                    var9_3[var7_4++] = fo1.b(var10_9).intern();
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
        fo1.c = var9_3;
        fo1.g = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x577F;
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
                throw new RuntimeException("fo1", exception);
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
            fo1.g[n2] = fo1.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fo1.b(n, l);
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
            throw new RuntimeException("fo1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fo1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

