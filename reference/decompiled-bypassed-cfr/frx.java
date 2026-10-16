/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class frx
extends ar7 {
    public static cn7 mro;
    public static crk w7c;
    public static crk gbn;
    private fqr sfg;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public frx() {
        long l = a ^ 0x7B71A2298D61L;
        super((String)((Object)frx.b("f", (int)24843, (long)(0x70DAA4B9867E70ABL ^ l))), _aj.z3a, false, new j1s[0]);
    }

    /*
     * Unable to fully structure code
     */
    @jev(jn1=3)
    private void gi4(fz2 var1_1) {
        block24: {
            block25: {
                block22: {
                    block23: {
                        block21: {
                            block20: {
                                var2_2 = t9d.c();
                                try {
                                    try {
                                        v0 = var1_1.lhw();
                                        if (var2_2 != 0) break block20;
                                        if (!v0) {
                                        }
                                        ** GOTO lbl37
                                    }
                                    catch (oov v1) {
                                        throw frx.a(v1);
                                    }
                                    v0 = var1_1.elp();
                                }
                                catch (oov v2) {
                                    throw frx.a(v2);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (var2_2 != 0) break block21;
                                        if (!v0) {
                                        }
                                        ** GOTO lbl37
                                    }
                                    catch (oov v3) {
                                        throw frx.a(v3);
                                    }
                                    v4 = frx.ek1.oxn.oxt;
                                    if (var2_2 != 0) break block22;
                                }
                                catch (oov v5) {
                                    throw frx.a(v5);
                                }
                                v0 = v4.m7n;
                            }
                            catch (oov v6) {
                                throw frx.a(v6);
                            }
                        }
                        try {
                            if (v0) break block23;
lbl37:
                            // 3 sources

                            this.sfg = null;
                            return;
                        }
                        catch (oov v7) {
                            throw frx.a(v7);
                        }
                    }
                    v4 = uj3.o1c().stream().filter((Predicate<ha9>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, v3r(ha9 ), (Lha9;)Z)((frx)this)).sorted(Comparator.comparing((Function<ha9, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, xym(ha9 ), (Lha9;)Ljava/lang/Float;)((frx)this))).collect(Collectors.toList());
                }
                var3_3 = (List)v4;
                try {
                    try {
                        if (var2_2 != 0) break block24;
                        if (var3_3.size() > 0) break block25;
                    }
                    catch (oov v8) {
                        throw frx.a(v8);
                    }
                    return;
                }
                catch (oov v9) {
                    throw frx.a(v9);
                }
            }
            this.sfg = this.l72((g_3)var3_3.get(0), frx.gbn.d7c().floatValue(), frx.mro.d7c());
        }
        var4_4 = omb.b5h(this.sfg);
        var1_1.h8j(var4_4[0]);
        var1_1.ni7(var4_4[1]);
    }

    @jev
    private void kjk(b5k b5k2) {
        fqr fqr2;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    fqr2 = this.sfg;
                    if (n == 0) break block2;
                    if (fqr2 != null) break block3;
                }
                catch (oov oov2) {
                    throw frx.a(oov2);
                }
                return;
            }
            fqr2 = this.sfg;
        }
        double d = fqr2.lvi - ek1.ibs().yky();
        double d2 = this.sfg.gn5 - ek1.ibs().fxk();
        double d3 = this.sfg.bn2 - ek1.ibs().kux();
        iyr.jil(d - 0.5, d2 - 0.5, d3 - 0.5, new Color(255, 0, 0, 100).getRGB(), new Color(16771328).getRGB(), 1.0f);
    }

    private fqr l72(g_3 g_32, float f, boolean bl) {
        double d;
        double d2;
        double d3;
        block4: {
            block5: {
                int n = t9d.c();
                d3 = g_32.o2v + (g_32.o2v - g_32.ivp) * (double)f;
                try {
                    try {
                        d2 = g_32.kfp;
                        d = (g_32.kfp - g_32.c54) * ((double)f * 0.3);
                        if (n != 0) break block4;
                        d2 = d2 + d;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw frx.a(oov2);
                    }
                    d = g_32.c5y();
                    break block4;
                }
                catch (oov oov3) {
                    throw frx.a(oov3);
                }
            }
            d = 1.0;
        }
        double d4 = d2 + d;
        double d5 = g_32.vbd + (g_32.vbd - g_32.e2b) * (double)f;
        return new fqr(d3, d4, d5);
    }

    private boolean v3r(ha9 ha92) {
        float f;
        block40: {
            block41: {
                int n;
                block38: {
                    block39: {
                        block36: {
                            block37: {
                                block34: {
                                    block35: {
                                        block32: {
                                            block33: {
                                                boolean bl;
                                                block30: {
                                                    block31: {
                                                        n = t9d.c();
                                                        try {
                                                            try {
                                                                try {
                                                                    bl = ha92.ma9;
                                                                    if (n != 0) break block30;
                                                                    if (bl) break block31;
                                                                }
                                                                catch (oov oov2) {
                                                                    throw frx.a(oov2);
                                                                }
                                                                float f2 = ha92.i55() - 0.0f;
                                                                f = f2 == 0.0f ? 0 : (f2 < 0.0f ? -1 : 1);
                                                                if (n != 0) break block32;
                                                            }
                                                            catch (oov oov3) {
                                                                throw frx.a(oov3);
                                                            }
                                                            if (f > 0) break block33;
                                                        }
                                                        catch (oov oov4) {
                                                            throw frx.a(oov4);
                                                        }
                                                    }
                                                    bl = false;
                                                }
                                                return bl;
                                            }
                                            float f3 = frx.ek1.vg8.tm6(ha92) - w7c.d7c().floatValue();
                                            f = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                                        }
                                        try {
                                            try {
                                                if (n != 0) break block34;
                                                if (f <= 0) break block35;
                                            }
                                            catch (oov oov5) {
                                                throw frx.a(oov5);
                                            }
                                            return false;
                                        }
                                        catch (oov oov6) {
                                            throw frx.a(oov6);
                                        }
                                    }
                                    f = (float)frx.ek1.vg8.e7y(ha92);
                                }
                                try {
                                    try {
                                        if (n != 0) break block36;
                                        if (f != false) break block37;
                                    }
                                    catch (oov oov7) {
                                        throw frx.a(oov7);
                                    }
                                    return false;
                                }
                                catch (oov oov8) {
                                    throw frx.a(oov8);
                                }
                            }
                            f = (float)f62.a92(ha92);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (n != 0) break block38;
                                        if (f == false) break block39;
                                    }
                                    catch (oov oov9) {
                                        throw frx.a(oov9);
                                    }
                                    f = (float)zwr.o1s.d7c().booleanValue();
                                    if (n != 0) break block38;
                                }
                                catch (oov oov10) {
                                    throw frx.a(oov10);
                                }
                                if (f == false) break block39;
                            }
                            catch (oov oov11) {
                                throw frx.a(oov11);
                            }
                            return false;
                        }
                        catch (oov oov12) {
                            throw frx.a(oov12);
                        }
                    }
                    f = (float)kgt.p71.klu();
                }
                try {
                    try {
                        try {
                            try {
                                if (n != 0) break block40;
                                if (f == false) break block41;
                            }
                            catch (oov oov13) {
                                throw frx.a(oov13);
                            }
                            f = (float)kgt.p71.kh5(ha92);
                            if (n != 0) break block40;
                        }
                        catch (oov oov14) {
                            throw frx.a(oov14);
                        }
                        if (f == false) break block41;
                    }
                    catch (oov oov15) {
                        throw frx.a(oov15);
                    }
                    return false;
                }
                catch (oov oov16) {
                    throw frx.a(oov16);
                }
            }
            f = 1.0f;
        }
        return (boolean)f;
    }

    private Float xym(ha9 ha92) {
        return Float.valueOf(frx.ek1.vg8.tm6(ha92));
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

                frx.a = c.a(7950785158945940551L, 7392889561526017959L, MethodHandles.lookup().lookupClass()).a(164724079741458L);
                var9 = frx.a ^ 14204158712398L;
                frx.h = new HashMap<K, V>(13);
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
                var4_5 = "\u00f8\u00eb\u00fc\u00ac\u00a2j\u00c2\u00c0\u0089\u00e5\u00b6\u00b0\u0082\u00db\u0010T \u00c5D4\\\u00f7\u00c9\u0089\u008cX\u008b\u00d5@<\u00f9\u00da'\u00ba\u00e6\u0007\"\u00ef\u00c3P\u0002\u00f7;\u008e\u00aaC\u00f1y\u00bd\u0010\u001a\u00c2\\\u00c5\u00af\u00d4\u0083\u00c6\u00df\u00ce\u0004,\u0087\u0006l\u008e";
                var6_6 = "\u00f8\u00eb\u00fc\u00ac\u00a2j\u00c2\u00c0\u0089\u00e5\u00b6\u00b0\u0082\u00db\u0010T \u00c5D4\\\u00f7\u00c9\u0089\u008cX\u008b\u00d5@<\u00f9\u00da'\u00ba\u00e6\u0007\"\u00ef\u00c3P\u0002\u00f7;\u008e\u00aaC\u00f1y\u00bd\u0010\u001a\u00c2\\\u00c5\u00af\u00d4\u0083\u00c6\u00df\u00ce\u0004,\u0087\u0006l\u008e".length();
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
                    var7_3[var5_4++] = frx.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u0016\u0093<\u008b\u00e6\u0099\u00ef4\u00c0f\u00a1^\u00b5\u00e5\u00a3p\u0018\u00cf>Yi\u00aaECs\u00e0S\u00fe\u0092u&\u0088\u00b0c\u00c2e\u008cY\u00d3\u0018\t";
                    var6_6 = "\u0016\u0093<\u008b\u00e6\u0099\u00ef4\u00c0f\u00a1^\u00b5\u00e5\u00a3p\u0018\u00cf>Yi\u00aaECs\u00e0S\u00fe\u0092u&\u0088\u00b0c\u00c2e\u008cY\u00d3\u0018\t".length();
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
                    var7_3[var5_4++] = frx.b(var8_9).intern();
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
        frx.f = var7_3;
        frx.g = new String[5];
        frx.mro = new cn7((String)frx.b("f", (int)21338, (long)(2822630161314665943L ^ var9)), (String)frx.b("f", (int)5960, (long)(2407069029726294470L ^ var9)), false);
        frx.w7c = new crk((String)frx.b("f", (int)24843, (long)(8132044224674817924L ^ var9)), (String)frx.b("f", (int)27818, (long)(3210669626052012582L ^ var9)), 100.0f, 1.0f, 500.0f, 5.0f);
        frx.gbn = new crk((String)frx.b("f", (int)24843, (long)(8132044224674817924L ^ var9)), (String)frx.b("f", (int)3187, (long)(6434099850056108792L ^ var9)), 1.5f, 0.0f, 10.0f, 0.1f);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5673;
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
                throw new RuntimeException("frx", exception);
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
            frx.g[n2] = frx.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = frx.b(n, l);
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
            throw new RuntimeException("frx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(frx.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

