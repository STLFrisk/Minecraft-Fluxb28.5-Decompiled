/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _lk
extends ar7 {
    public static cn7 yqi;
    public static cn7 aax;
    public static cn7 xor;
    public static cn7 _ez;
    public static float lay;
    public static List gxj;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public _lk() {
        long l = a ^ 0x133566653D61L;
        super((String)((Object)_lk.b("j", (int)12508, (long)(0x21AF57C1BE43F13CL ^ l))), _aj.y49, true, new j1s[]{new a9u(), new jc0(), new zv4(), new a59(), new rft()});
        gxj = Arrays.asList(ox_.ibw, ox_.gdz, ox_.whp, ox_.ska, ox_.dr2);
    }

    @jev
    public void prn(q8e q8e2) {
        lay = q8e2.uto;
    }

    /*
     * Unable to fully structure code
     */
    @jev
    public void cbe(b5k var1_1) {
        block35: {
            block30: {
                block34: {
                    block33: {
                        block32: {
                            block31: {
                                block29: {
                                    var2_2 = t9d.c();
                                    if (!_lk.aax.g7m()) break block35;
                                    var3_3 = new mew(_lk.ek1.vg8).eve();
                                    try {
                                        v0 = _lk.ek1.vg8.u0f();
                                        v1 = vt2.z9q;
                                        if (var2_2 != 0) break block29;
                                        if (v0 == v1) {
                                        }
                                        ** GOTO lbl16
                                    }
                                    catch (oov v2) {
                                        throw _lk.a(v2);
                                    }
                                    var3_3 = var3_3.idu();
                                    try {
                                        if (var2_2 == 0) break block30;
lbl16:
                                        // 2 sources

                                        v0 = _lk.ek1.vg8.u0f();
                                        v1 = vt2.mxp;
                                    }
                                    catch (oov v3) {
                                        throw _lk.a(v3);
                                    }
                                }
                                try {
                                    if (var2_2 != 0) break block31;
                                    if (v0 == v1) {
                                    }
                                    ** GOTO lbl32
                                }
                                catch (oov v4) {
                                    throw _lk.a(v4);
                                }
                                var3_3 = var3_3.z6x();
                                try {
                                    if (var2_2 == 0) break block30;
lbl32:
                                    // 2 sources

                                    v0 = _lk.ek1.vg8.u0f();
                                    v1 = vt2.te4;
                                }
                                catch (oov v5) {
                                    throw _lk.a(v5);
                                }
                            }
                            try {
                                if (var2_2 != 0) break block32;
                                if (v0 == v1) {
                                }
                                ** GOTO lbl48
                            }
                            catch (oov v6) {
                                throw _lk.a(v6);
                            }
                            var3_3 = var3_3.y8e();
                            try {
                                if (var2_2 == 0) break block30;
lbl48:
                                // 2 sources

                                v0 = _lk.ek1.vg8.u0f();
                                v1 = vt2.zk4;
                            }
                            catch (oov v7) {
                                throw _lk.a(v7);
                            }
                        }
                        try {
                            if (var2_2 != 0) break block33;
                            if (v0 == v1) {
                            }
                            ** GOTO lbl64
                        }
                        catch (oov v8) {
                            throw _lk.a(v8);
                        }
                        var3_3 = var3_3.o_8();
                        try {
                            if (var2_2 == 0) break block30;
lbl64:
                            // 2 sources

                            v0 = _lk.ek1.vg8.u0f();
                            v1 = vt2.rf3;
                        }
                        catch (oov v9) {
                            throw _lk.a(v9);
                        }
                    }
                    try {
                        if (var2_2 != 0) break block34;
                        if (v0 == v1) {
                        }
                        ** GOTO lbl80
                    }
                    catch (oov v10) {
                        throw _lk.a(v10);
                    }
                    var3_3 = var3_3.nuv();
                    try {
                        if (var2_2 == 0) break block30;
lbl80:
                        // 2 sources

                        v0 = _lk.ek1.vg8.u0f();
                        v1 = vt2.m3r;
                    }
                    catch (oov v11) {
                        throw _lk.a(v11);
                    }
                }
                if (v0 == v1) {
                    var3_3 = var3_3.eve();
                }
            }
            var4_4 = (double)var3_3.getX() - _lk.ek1.ibs().uok;
            var6_5 = (double)var3_3.getY() - _lk.ek1.ibs().zmw;
            var8_6 = (double)var3_3.getZ() - _lk.ek1.ibs().klp;
            try {
                if (_lk.ek1.tij.getBlockState(var3_3).r_y().ujd(_lk.ek1.tij, var3_3)) {
                    hhf.m4t(var4_4, var6_5, var8_6, var4_4 + 1.0, var6_5 + 1.0, var8_6 + 1.0, 1.0f, 1.0f, 1.0f, 0.2f);
                }
            }
            catch (oov v12) {
                throw _lk.a(v12);
            }
        }
    }

    @jev
    public void kes(axn axn2) {
        long l = a ^ 0x67DA50B2AD8CL;
        try {
            if (_ez.g7m()) {
                this.kkj();
                zet.gn0((String)((Object)_lk.b("j", (int)5740, (long)(0x33915DC43EC763L ^ l))), this.m2d() + (String)((Object)_lk.b("j", (int)12835, (long)(0x6DF246833E37632FL ^ l))), jgv$vro.h_d);
            }
        }
        catch (oov oov2) {
            throw _lk.a(oov2);
        }
    }

    public static boolean unh(erg erg2) {
        boolean bl;
        block31: {
            block32: {
                int n;
                block29: {
                    gun gun2;
                    block30: {
                        u7m u7m2;
                        block28: {
                            int n2;
                            block26: {
                                block27: {
                                    erg erg3;
                                    block24: {
                                        block25: {
                                            n = t9d.b();
                                            try {
                                                try {
                                                    erg3 = erg2;
                                                    if (n == 0) break block24;
                                                    if (erg3 != null) break block25;
                                                }
                                                catch (oov oov2) {
                                                    throw _lk.a(oov2);
                                                }
                                                return false;
                                            }
                                            catch (oov oov3) {
                                                throw _lk.a(oov3);
                                            }
                                        }
                                        erg3 = erg2;
                                    }
                                    try {
                                        try {
                                            n2 = erg3.qd2;
                                            if (n == 0) break block26;
                                            if (n2 > 0) break block27;
                                        }
                                        catch (oov oov4) {
                                            throw _lk.a(oov4);
                                        }
                                        return false;
                                    }
                                    catch (oov oov5) {
                                        throw _lk.a(oov5);
                                    }
                                }
                                try {
                                    u7m2 = erg2.gn1();
                                    if (n == 0) break block28;
                                    n2 = u7m2 instanceof gun;
                                }
                                catch (oov oov6) {
                                    throw _lk.a(oov6);
                                }
                            }
                            try {
                                if (n2 == 0) {
                                    return false;
                                }
                            }
                            catch (oov oov7) {
                                throw _lk.a(oov7);
                            }
                            u7m2 = erg2.gn1();
                        }
                        gun2 = (gun)u7m2;
                        try {
                            if (gun2.kpo() == ox_.fzi) {
                                return true;
                            }
                        }
                        catch (oov oov8) {
                            throw _lk.a(oov8);
                        }
                        try {
                            try {
                                bl = rft.ly3.contains(e0x.p69(erg2.gn1()));
                                if (n == 0) break block29;
                                if (!bl) break block30;
                            }
                            catch (oov oov9) {
                                throw _lk.a(oov9);
                            }
                            return false;
                        }
                        catch (oov oov10) {
                            throw _lk.a(oov10);
                        }
                    }
                    bl = gun2.kpo().z4c();
                }
                try {
                    try {
                        if (n == 0) break block31;
                        if (bl) break block32;
                    }
                    catch (oov oov11) {
                        throw _lk.a(oov11);
                    }
                    return false;
                }
                catch (oov oov12) {
                    throw _lk.a(oov12);
                }
            }
            bl = true;
        }
        return bl;
    }

    public int tk9() {
        int n;
        block6: {
            int n2 = 0;
            int n3 = 9;
            int n4 = t9d.c();
            while (n3 < 45) {
                block5: {
                    block7: {
                        erg erg2 = _lk.ek1.vg8.fv9.ajr(n3).x4s();
                        try {
                            try {
                                if (n4 != 0) break block5;
                                n = _lk.unh(erg2) ? 1 : 0;
                                if (n4 != 0) break block6;
                            }
                            catch (oov oov2) {
                                throw _lk.a(oov2);
                            }
                            if (n == 0) break block7;
                        }
                        catch (oov oov3) {
                            throw _lk.a(oov3);
                        }
                        n2 += erg2.qd2;
                    }
                    ++n3;
                }
                if (n4 == 0) continue;
            }
            n = n2;
        }
        return n;
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

                _lk.a = c.a(-9086064273023017508L, -1264201280350084467L, MethodHandles.lookup().lookupClass()).a(56674476290979L);
                var9 = _lk.a ^ 5406416832136L;
                _lk.h = new HashMap<K, V>(13);
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
                var7_3 = new String[8];
                var5_4 = 0;
                var4_5 = "\u00150\u00e0t@\u00a6\u00c9}*\u007f\u00f1\u001b\u00f8\u00bcq~w\u0097'\u0014\u0092\u0093\u0019\u00fb(|\u00c2K2\u001f\u0094\u0007\u0010\u00d6S~\u00e2Lh\u00ad\u00fe\u00d4\u00d4}/\u008d\u00c0\u0085T \u00a1\u00c8\u001c\u0003\u009c<\u00bc\u00d3X\u0095\u00c9\u00df\u000e\u00b3\u00b2\u0010\u00b5O\u00bc\u001e\"\u0097J\u0012`\u00cd\u0006\u00bc\u00169\u00c3\u00ff\u0010\"<`q\u00afsE\u00b0\u00e8\u00f4A\u0005\u00ed\u00cb\u008fD \u00b5\u00bd\u001f\u00e9\u00e0=Ufg\u00d8\u00fd)V\u00a8@b\u0084\u0014\u00e9\u00f4\u00ec\u00fa\u009ad0AQN\u0090\u00c8\u0090\u00f0(\u00e2\u0016\u00d1\u0005\u001d\u00c0c\u0097\u00ac4<WNp~\u00ee\u000b\b1\u00b7\u00187N\u00cb\f\u008e,\u0015wR\u00cd\u008b\u00ae\u00c3\u00c7\u00c5\u0012\u00b7\u00ce\u00e3";
                var6_6 = "\u00150\u00e0t@\u00a6\u00c9}*\u007f\u00f1\u001b\u00f8\u00bcq~w\u0097'\u0014\u0092\u0093\u0019\u00fb(|\u00c2K2\u001f\u0094\u0007\u0010\u00d6S~\u00e2Lh\u00ad\u00fe\u00d4\u00d4}/\u008d\u00c0\u0085T \u00a1\u00c8\u001c\u0003\u009c<\u00bc\u00d3X\u0095\u00c9\u00df\u000e\u00b3\u00b2\u0010\u00b5O\u00bc\u001e\"\u0097J\u0012`\u00cd\u0006\u00bc\u00169\u00c3\u00ff\u0010\"<`q\u00afsE\u00b0\u00e8\u00f4A\u0005\u00ed\u00cb\u008fD \u00b5\u00bd\u001f\u00e9\u00e0=Ufg\u00d8\u00fd)V\u00a8@b\u0084\u0014\u00e9\u00f4\u00ec\u00fa\u009ad0AQN\u0090\u00c8\u0090\u00f0(\u00e2\u0016\u00d1\u0005\u001d\u00c0c\u0097\u00ac4<WNp~\u00ee\u000b\b1\u00b7\u00187N\u00cb\f\u008e,\u0015wR\u00cd\u008b\u00ae\u00c3\u00c7\u00c5\u0012\u00b7\u00ce\u00e3".length();
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
                    var7_3[var5_4++] = _lk.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "'L\u00da\u00da\u00f0\u00b2}\u0092d`\u00c6\u00ef\u009e\u00f9e\u00d0 \u00ea$\u0096W\u00fd\u00c0\u0087X\u00b2\u0007C\n\u00b2\u00e2)\u00fa\u0014\u0088J\u00f0\u0092\u00ce\u00bf\u00db\u0085#\u0093\u0004\u0015\u0089\u00e8X";
                    var6_6 = "'L\u00da\u00da\u00f0\u00b2}\u0092d`\u00c6\u00ef\u009e\u00f9e\u00d0 \u00ea$\u0096W\u00fd\u00c0\u0087X\u00b2\u0007C\n\u00b2\u00e2)\u00fa\u0014\u0088J\u00f0\u0092\u00ce\u00bf\u00db\u0085#\u0093\u0004\u0015\u0089\u00e8X".length();
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
                    var7_3[var5_4++] = _lk.b(var8_9).intern();
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
        _lk.f = var7_3;
        _lk.g = new String[8];
        _lk.yqi = new cn7((String)_lk.b("j", (int)24692, (long)(6947905278456273531L ^ var9)), (String)_lk.b("j", (int)11722, (long)(9222894660551235520L ^ var9)), true);
        _lk.aax = new cn7((String)_lk.b("j", (int)24692, (long)(6947905278456273531L ^ var9)), (String)_lk.b("j", (int)22358, (long)(5280028495631494488L ^ var9)), false);
        _lk.xor = new cn7((String)_lk.b("j", (int)24692, (long)(6947905278456273531L ^ var9)), (String)_lk.b("j", (int)12018, (long)(2886373460875072766L ^ var9)), true);
        _lk._ez = new cn7((String)_lk.b("j", (int)24692, (long)(6947905278456273531L ^ var9)), (String)_lk.b("j", (int)18623, (long)(5778715730196574898L ^ var9)), true);
        _lk.lay = 0.0f;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7967;
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
                throw new RuntimeException("_lk", exception);
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
            _lk.g[n2] = _lk.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _lk.b(n, l);
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
            throw new RuntimeException("_lk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_lk.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

