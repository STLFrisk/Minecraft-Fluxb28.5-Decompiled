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

public class a1s
extends vef {
    private static final /* synthetic */ String[] ufh;
    private static final /* synthetic */ int[] jou;
    private static final /* synthetic */ int[] xrt;
    private static final /* synthetic */ int[] c4m;
    public final int t_s;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public a1s(int n, gdz gdz2, int n2, int n3) {
        super(n, gdz2, n2, bn1.jfw);
        this.t_s = n3;
        if (n3 == 2) {
            this.n1z = bn1.t6y;
        }
    }

    @Override
    public int qwk(int n) {
        return jou[this.t_s] + (n - 1) * xrt[this.t_s];
    }

    @Override
    public int fnu(int n) {
        return this.qwk(n) + c4m[this.t_s];
    }

    @Override
    public int ehp() {
        return 4;
    }

    @Override
    public int f_3(int n, ofh ofh2) {
        int n2;
        block42: {
            block52: {
                float f;
                int n3;
                block51: {
                    int n4;
                    block48: {
                        block50: {
                            block49: {
                                block46: {
                                    block47: {
                                        block43: {
                                            block45: {
                                                block44: {
                                                    block40: {
                                                        block41: {
                                                            int n5;
                                                            block38: {
                                                                block39: {
                                                                    n3 = t9d.b();
                                                                    try {
                                                                        try {
                                                                            n5 = ofh2.u5u();
                                                                            if (n3 == 0) break block38;
                                                                            if (n5 == 0) break block39;
                                                                        }
                                                                        catch (oov oov2) {
                                                                            throw a1s.a(oov2);
                                                                        }
                                                                        return 0;
                                                                    }
                                                                    catch (oov oov3) {
                                                                        throw a1s.a(oov3);
                                                                    }
                                                                }
                                                                n5 = 6 + n * n;
                                                            }
                                                            f = (float)n5 / 3.0f;
                                                            try {
                                                                try {
                                                                    n2 = this.t_s;
                                                                    if (n3 == 0) break block40;
                                                                    if (n2 != 0) break block41;
                                                                }
                                                                catch (oov oov4) {
                                                                    throw a1s.a(oov4);
                                                                }
                                                                n2 = fe6.tpk(f * 0.75f);
                                                                break block42;
                                                            }
                                                            catch (oov oov5) {
                                                                throw a1s.a(oov5);
                                                            }
                                                        }
                                                        n2 = this.t_s;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    n4 = 1;
                                                                    if (n3 == 0) break block43;
                                                                    if (n2 != n4) break block44;
                                                                }
                                                                catch (oov oov6) {
                                                                    throw a1s.a(oov6);
                                                                }
                                                                n2 = ofh2.i0l() ? 1 : 0;
                                                                if (n3 == 0) break block45;
                                                            }
                                                            catch (oov oov7) {
                                                                throw a1s.a(oov7);
                                                            }
                                                            if (n2 == 0) break block44;
                                                        }
                                                        catch (oov oov8) {
                                                            throw a1s.a(oov8);
                                                        }
                                                        n2 = fe6.tpk(f * 1.25f);
                                                        break block42;
                                                    }
                                                    catch (oov oov9) {
                                                        throw a1s.a(oov9);
                                                    }
                                                }
                                                n2 = this.t_s;
                                            }
                                            n4 = 2;
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (n3 == 0) break block46;
                                                    if (n2 != n4) break block47;
                                                }
                                                catch (oov oov10) {
                                                    throw a1s.a(oov10);
                                                }
                                                if (ofh2 != ofh.m8d) break block47;
                                            }
                                            catch (oov oov11) {
                                                throw a1s.a(oov11);
                                            }
                                            n2 = fe6.tpk(f * 2.5f);
                                            break block42;
                                        }
                                        catch (oov oov12) {
                                            throw a1s.a(oov12);
                                        }
                                    }
                                    n2 = this.t_s;
                                    n4 = 3;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n3 == 0) break block48;
                                                if (n2 != n4) break block49;
                                            }
                                            catch (oov oov13) {
                                                throw a1s.a(oov13);
                                            }
                                            n2 = ofh2.yto() ? 1 : 0;
                                            if (n3 == 0) break block50;
                                        }
                                        catch (oov oov14) {
                                            throw a1s.a(oov14);
                                        }
                                        if (n2 == 0) break block49;
                                    }
                                    catch (oov oov15) {
                                        throw a1s.a(oov15);
                                    }
                                    n2 = fe6.tpk(f * 1.5f);
                                    break block42;
                                }
                                catch (oov oov16) {
                                    throw a1s.a(oov16);
                                }
                            }
                            n2 = this.t_s;
                        }
                        try {
                            if (n3 == 0) break block51;
                            n4 = 4;
                        }
                        catch (oov oov17) {
                            throw a1s.a(oov17);
                        }
                    }
                    try {
                        if (n2 != n4) break block52;
                        n2 = ofh2.u0p() ? 1 : 0;
                    }
                    catch (oov oov18) {
                        throw a1s.a(oov18);
                    }
                }
                try {
                    try {
                        if (n3 == 0) break block42;
                        if (n2 == 0) break block52;
                    }
                    catch (oov oov19) {
                        throw a1s.a(oov19);
                    }
                    n2 = fe6.tpk(f * 1.5f);
                    break block42;
                }
                catch (oov oov20) {
                    throw a1s.a(oov20);
                }
            }
            n2 = 0;
        }
        return n2;
    }

    @Override
    public String d8j() {
        long l = a ^ 0x4E958291B0A8L;
        return (String)((Object)a1s.b("m", (int)23438, (long)(0x7780019026CEF1A4L ^ l))) + ufh[this.t_s];
    }

    @Override
    public boolean yhx(vef vef2) {
        boolean bl;
        block14: {
            block15: {
                int n;
                block18: {
                    block20: {
                        int n2;
                        a1s a1s2;
                        int n3;
                        block16: {
                            block17: {
                                n3 = t9d.b();
                                try {
                                    bl = vef2 instanceof a1s;
                                    if (n3 == 0) break block14;
                                    if (!bl) break block15;
                                }
                                catch (oov oov2) {
                                    throw a1s.a(oov2);
                                }
                                a1s2 = (a1s)vef2;
                                try {
                                    try {
                                        n = a1s2.t_s;
                                        n2 = this.t_s;
                                        if (n3 == 0) break block16;
                                        if (n != n2) break block17;
                                    }
                                    catch (oov oov3) {
                                        throw a1s.a(oov3);
                                    }
                                    n = 0;
                                    break block18;
                                }
                                catch (oov oov4) {
                                    throw a1s.a(oov4);
                                }
                            }
                            try {
                                n = this.t_s;
                                if (n3 == 0) break block18;
                                n2 = 2;
                            }
                            catch (oov oov5) {
                                throw a1s.a(oov5);
                            }
                        }
                        try {
                            block19: {
                                try {
                                    try {
                                        if (n == n2) break block19;
                                        n = a1s2.t_s;
                                        if (n3 == 0) break block18;
                                    }
                                    catch (oov oov6) {
                                        throw a1s.a(oov6);
                                    }
                                    if (n != 2) break block20;
                                }
                                catch (oov oov7) {
                                    throw a1s.a(oov7);
                                }
                            }
                            n = 1;
                            break block18;
                        }
                        catch (oov oov8) {
                            throw a1s.a(oov8);
                        }
                    }
                    n = 0;
                }
                return n != 0;
            }
            bl = super.yhx(vef2);
        }
        return bl;
    }

    public static int vrg(i2h i2h2, int n) {
        int n2;
        block2: {
            block3: {
                int n3 = t9d.c();
                int n4 = hc0.gld(vef.qt1.bbf, i2h2.n7a());
                try {
                    n2 = n4;
                    if (n3 != 0) break block2;
                    if (n2 <= 0) break block3;
                }
                catch (oov oov2) {
                    throw a1s.a(oov2);
                }
                n -= fe6.tpk((float)n * (float)n4 * 0.15f);
            }
            n2 = n;
        }
        return n2;
    }

    public static double dpu(i2h i2h2, double d) {
        int n = hc0.gld(vef.dru.bbf, i2h2.n7a());
        if (n > 0) {
            d -= (double)fe6.jqf(d * (double)((float)n * 0.15f));
        }
        return d;
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

                a1s.a = c.a(-4958205672242201047L, -1061251985779731444L, MethodHandles.lookup().lookupClass()).a(165760353836366L);
                var9 = a1s.a ^ 37173382239403L;
                a1s.h = new HashMap<K, V>(13);
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
                var7_3 = new String[6];
                var5_4 = 0;
                var4_5 = "\u001b\t5G\u00d6T\u009d\u0097/\u00cd\u00c4-\u008d\u0097\u00de\u00df\u0097\u00e8\u0016\u009d\u00ec\u0092m\u00b5Z\u00bcj\u00c0\u00dd\u00cdy\u001b\u0018/\u008an\u00ff<\u0004=W\u009c\"\u00e4*\u00da\u009a}\u00ba\u00c1\u001b\u008flt!\u008c#\u0010\u0087\u00f4\u00ae<u\u0099d\u00b1\u00193\u00a9\u0090\u00ac\u0015\u00ea'\u0010:\b\u00ce\u00e9\u001fQA8\u00e8\u00a6KU\u00814\u00902";
                var6_6 = "\u001b\t5G\u00d6T\u009d\u0097/\u00cd\u00c4-\u008d\u0097\u00de\u00df\u0097\u00e8\u0016\u009d\u00ec\u0092m\u00b5Z\u00bcj\u00c0\u00dd\u00cdy\u001b\u0018/\u008an\u00ff<\u0004=W\u009c\"\u00e4*\u00da\u009a}\u00ba\u00c1\u001b\u008flt!\u008c#\u0010\u0087\u00f4\u00ae<u\u0099d\u00b1\u00193\u00a9\u0090\u00ac\u0015\u00ea'\u0010:\b\u00ce\u00e9\u001fQA8\u00e8\u00a6KU\u00814\u00902".length();
                var3_7 = 32;
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
                    var7_3[var5_4++] = a1s.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u001e\u00ef\u0095\u00b9\u0007\u00de,\u00d5\u0000C.\u0004\u0001\u00b0\u00bdY\u00fc\u00c8\u00a6\u00d1\u00b9\u0094\u0085\u00e3#\u0017\u00e0\u00f2\u00f2\u00ed\u009d\u00cb\u00d4\u009a\u00d4\u00eaa\u00c3\u00bc\u00ad\u0010\u00f3\u00a2.\u00a2\u00fd\u00ec\u009f\u00b9<%\u0019s\u009b\\JY";
                    var6_6 = "\u001e\u00ef\u0095\u00b9\u0007\u00de,\u00d5\u0000C.\u0004\u0001\u00b0\u00bdY\u00fc\u00c8\u00a6\u00d1\u00b9\u0094\u0085\u00e3#\u0017\u00e0\u00f2\u00f2\u00ed\u009d\u00cb\u00d4\u009a\u00d4\u00eaa\u00c3\u00bc\u00ad\u0010\u00f3\u00a2.\u00a2\u00fd\u00ec\u009f\u00b9<%\u0019s\u009b\\JY".length();
                    var3_7 = 40;
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
                    var7_3[var5_4++] = a1s.b(var8_9).intern();
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
        a1s.f = var7_3;
        a1s.g = new String[6];
        v7 = new String[5];
        v7[0] = a1s.b("m", (int)18937, (long)(5635454654837393361L ^ var9));
        v7[1] = a1s.b("m", (int)16335, (long)(2229048587169821153L ^ var9));
        v7[2] = a1s.b("m", (int)5516, (long)(1325772299794832291L ^ var9));
        v7[3] = a1s.b("m", (int)21184, (long)(1171592404609047788L ^ var9));
        v7[4] = a1s.b("m", (int)14754, (long)(8659061327290693519L ^ var9));
        a1s.ufh = v7;
        a1s.jou = new int[]{1, 10, 5, 5, 3};
        a1s.xrt = new int[]{11, 8, 6, 8, 6};
        a1s.c4m = new int[]{20, 12, 10, 12, 15};
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xADA;
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
                throw new RuntimeException("a1s", exception);
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
            a1s.g[n2] = a1s.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = a1s.b(n, l);
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
            throw new RuntimeException("a1s" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a1s.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

