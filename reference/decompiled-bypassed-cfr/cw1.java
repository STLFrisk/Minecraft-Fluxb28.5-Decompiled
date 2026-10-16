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

public class cw1
extends g6r {
    public tf8 rhi;
    public tf8 mqk;
    public tf8 bpp;
    public tf8 ah3;
    public tf8 _1u;
    public tf8 tan;
    public tf8 bsn;
    public tf8 _yu;
    public tf8 o4g;
    public tf8 nqp;
    public tf8 u0o;
    public tf8 z37;
    private /* synthetic */ float s1s;
    private /* synthetic */ float ep5;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public cw1() {
        long l = a ^ 0x3EC96974206EL;
        this.s1s = 0.0f;
        this.ep5 = 0.0f;
        this.o15((String)((Object)cw1.a("h", (int)25089, (long)(0x36BCAE74A6E6CA4DL ^ l))), 0, 0);
        this.o15((String)((Object)cw1.a("h", (int)22461, (long)(0x65C8DA5460B5FFF3L ^ l))), 0, 24);
        this.o15((String)((Object)cw1.a("h", (int)9134, (long)(0x5C95D4E5D56C0BE1L ^ l))), 0, 10);
        this.o15((String)((Object)cw1.a("h", (int)32754, (long)(0x4DFC3DF192C657BFL ^ l))), 6, 10);
        this.rhi = new tf8(this, 26, 24);
        this.rhi.ge4(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.rhi.i50(3.0f, 17.5f, 3.7f);
        this.rhi.hsi = true;
        this.cf6(this.rhi, 0.0f, 0.0f, 0.0f);
        this.mqk = new tf8(this, 8, 24);
        this.mqk.ge4(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.mqk.i50(-3.0f, 17.5f, 3.7f);
        this.mqk.hsi = true;
        this.cf6(this.mqk, 0.0f, 0.0f, 0.0f);
        this.bpp = new tf8(this, 30, 15);
        this.bpp.ge4(-1.0f, 0.0f, 0.0f, 2, 4, 5);
        this.bpp.i50(3.0f, 17.5f, 3.7f);
        this.bpp.hsi = true;
        this.cf6(this.bpp, -0.34906584f, 0.0f, 0.0f);
        this.ah3 = new tf8(this, 16, 15);
        this.ah3.ge4(-1.0f, 0.0f, 0.0f, 2, 4, 5);
        this.ah3.i50(-3.0f, 17.5f, 3.7f);
        this.ah3.hsi = true;
        this.cf6(this.ah3, -0.34906584f, 0.0f, 0.0f);
        this._1u = new tf8(this, 0, 0);
        this._1u.ge4(-3.0f, -2.0f, -10.0f, 6, 5, 10);
        this._1u.i50(0.0f, 19.0f, 8.0f);
        this._1u.hsi = true;
        this.cf6(this._1u, -0.34906584f, 0.0f, 0.0f);
        this.tan = new tf8(this, 8, 15);
        this.tan.ge4(-1.0f, 0.0f, -1.0f, 2, 7, 2);
        this.tan.i50(3.0f, 17.0f, -1.0f);
        this.tan.hsi = true;
        this.cf6(this.tan, -0.17453292f, 0.0f, 0.0f);
        this.bsn = new tf8(this, 0, 15);
        this.bsn.ge4(-1.0f, 0.0f, -1.0f, 2, 7, 2);
        this.bsn.i50(-3.0f, 17.0f, -1.0f);
        this.bsn.hsi = true;
        this.cf6(this.bsn, -0.17453292f, 0.0f, 0.0f);
        this._yu = new tf8(this, 32, 0);
        this._yu.ge4(-2.5f, -4.0f, -5.0f, 5, 4, 5);
        this._yu.i50(0.0f, 16.0f, -1.0f);
        this._yu.hsi = true;
        this.cf6(this._yu, 0.0f, 0.0f, 0.0f);
        this.o4g = new tf8(this, 52, 0);
        this.o4g.ge4(-2.5f, -9.0f, -1.0f, 2, 5, 1);
        this.o4g.i50(0.0f, 16.0f, -1.0f);
        this.o4g.hsi = true;
        this.cf6(this.o4g, 0.0f, -0.2617994f, 0.0f);
        this.nqp = new tf8(this, 58, 0);
        this.nqp.ge4(0.5f, -9.0f, -1.0f, 2, 5, 1);
        this.nqp.i50(0.0f, 16.0f, -1.0f);
        this.nqp.hsi = true;
        this.cf6(this.nqp, 0.0f, 0.2617994f, 0.0f);
        this.u0o = new tf8(this, 52, 6);
        this.u0o.ge4(-1.5f, -1.5f, 0.0f, 3, 3, 2);
        this.u0o.i50(0.0f, 20.0f, 7.0f);
        this.u0o.hsi = true;
        this.cf6(this.u0o, -0.3490659f, 0.0f, 0.0f);
        this.z37 = new tf8(this, 32, 9);
        this.z37.ge4(-0.5f, -2.5f, -5.5f, 1, 1, 1);
        this.z37.i50(0.0f, 16.0f, -1.0f);
        this.z37.hsi = true;
        this.cf6(this.z37, 0.0f, 0.0f, 0.0f);
    }

    private void cf6(tf8 tf82, float f, float f2, float f3) {
        tf82.pod = f;
        tf82.r80 = f2;
        tf82.oo7 = f3;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void s_q(i2h var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7) {
        block6: {
            block5: {
                var8_8 = t9d.c();
                try {
                    this.ltd(var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var1_1);
                    v0 = this;
                    if (var8_8 != 0) break block5;
                    if (v0._a0) {
                    }
                    ** GOTO lbl35
                }
                catch (oov v1) {
                    throw cw1.a(v1);
                }
                var9_9 = 2.0f;
                try {
                    hzu.dp2();
                    hzu.a4k(0.0f, 5.0f * var7_7, 2.0f * var7_7);
                    this._yu.vca(var7_7);
                    this.nqp.vca(var7_7);
                    this.o4g.vca(var7_7);
                    this.z37.vca(var7_7);
                    hzu.x3w();
                    hzu.dp2();
                    hzu.syc(1.0f / var9_9, 1.0f / var9_9, 1.0f / var9_9);
                    hzu.a4k(0.0f, 24.0f * var7_7, 0.0f);
                    this.rhi.vca(var7_7);
                    this.mqk.vca(var7_7);
                    this.bpp.vca(var7_7);
                    this.ah3.vca(var7_7);
                    this._1u.vca(var7_7);
                    this.tan.vca(var7_7);
                    this.bsn.vca(var7_7);
                    this.u0o.vca(var7_7);
                    hzu.x3w();
                    if (var8_8 == 0) break block6;
lbl35:
                    // 2 sources

                    this.rhi.vca(var7_7);
                    this.mqk.vca(var7_7);
                    this.bpp.vca(var7_7);
                    this.ah3.vca(var7_7);
                    this._1u.vca(var7_7);
                    this.tan.vca(var7_7);
                    this.bsn.vca(var7_7);
                    this._yu.vca(var7_7);
                    this.o4g.vca(var7_7);
                    this.nqp.vca(var7_7);
                    this.u0o.vca(var7_7);
                    v0 = this;
                }
                catch (oov v2) {
                    throw cw1.a(v2);
                }
            }
            v0.z37.vca(var7_7);
        }
    }

    @Override
    public void ltd(float f, float f2, float f3, float f4, float f5, float f6, i2h i2h2) {
        float f7 = f3 - (float)i2h2.g25;
        kxi kxi2 = (kxi)i2h2;
        this.o4g.pod = this.nqp.pod = f5 * ((float)Math.PI / 180);
        this._yu.pod = this.nqp.pod;
        this.z37.pod = this.nqp.pod;
        this.z37.r80 = this._yu.r80 = f4 * ((float)Math.PI / 180);
        this.o4g.r80 = this.z37.r80 - 0.2617994f;
        this.nqp.r80 = this.z37.r80 + 0.2617994f;
        this.s1s = fe6.rtn(kxi2.wz4(f7) * (float)Math.PI);
        this.bpp.pod = this.ah3.pod = (this.s1s * 50.0f - 21.0f) * ((float)Math.PI / 180);
        this.rhi.pod = this.mqk.pod = this.s1s * 50.0f * ((float)Math.PI / 180);
        this.tan.pod = this.bsn.pod = (this.s1s * -40.0f - 11.0f) * ((float)Math.PI / 180);
    }

    @Override
    public void v3g(g_3 g_32, float f, float f2, float f3) {
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

                cw1.a = c.a(8410751851838047478L, 7003250285507059612L, MethodHandles.lookup().lookupClass()).a(12430813482422L);
                cw1.d = new HashMap<K, V>(13);
                var0 = cw1.a ^ 117557875924942L;
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
                var6_5 = "\u0010V\u0085`\u00d38P\u000e\u00d2c\u00d5\u00a7\u009c\u00c8\u00cb\u00e3\u00ecH\u00a9\u00dfa0\u00fdB\u0018=\u00cd\u0094T\u00cb\u00ddG\u00fdo\u00b0sP\u00c5\u00a5@z\u00da\u00c0\u00b3\u00cer\u00a0o\u00b0";
                var8_6 = "\u0010V\u0085`\u00d38P\u000e\u00d2c\u00d5\u00a7\u009c\u00c8\u00cb\u00e3\u00ecH\u00a9\u00dfa0\u00fdB\u0018=\u00cd\u0094T\u00cb\u00ddG\u00fdo\u00b0sP\u00c5\u00a5@z\u00da\u00c0\u00b3\u00cer\u00a0o\u00b0".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = cw1.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "s\u00e6\u00bf_;\u00f3\u00c6\u00c6sb\u00b1(5\u00efL\u00d2\u0088\u00a3\u0081\u000b1K\u0010{\u00a2#\u0005\u00d4\u0015\u0006\ba\u0018\u00d3\u0096\u0090\u0094\u00cbU\u0080\u0089\b\u00f1p\u000fg\u00bf\u00a2\u00b9v\u0004\u009aP\u00c8\u00c0Z\u00e4";
                    var8_6 = "s\u00e6\u00bf_;\u00f3\u00c6\u00c6sb\u00b1(5\u00efL\u00d2\u0088\u00a3\u0081\u000b1K\u0010{\u00a2#\u0005\u00d4\u0015\u0006\ba\u0018\u00d3\u0096\u0090\u0094\u00cbU\u0080\u0089\b\u00f1p\u000fg\u00bf\u00a2\u00b9v\u0004\u009aP\u00c8\u00c0Z\u00e4".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = cw1.a(var10_9).intern();
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
        cw1.b = var9_3;
        cw1.c = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6A54;
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
                throw new RuntimeException("cw1", exception);
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
            cw1.c[n2] = cw1.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cw1.a(n, l);
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
            throw new RuntimeException("cw1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cw1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

