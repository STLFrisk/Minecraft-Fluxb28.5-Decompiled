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

public class _hv
extends j1s {
    public static crk _48;
    public static cn7 z8j;
    public static cn7 cdj;
    public int iim;
    public double aeu;
    public double j14;
    public q6h _mi;
    private static final long a;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public _hv() {
        long l = a ^ 0x409761E3CC88L;
        super((String)((Object)_hv.a("j", (int)188, (long)(0x26C2DFA9500DA4CL ^ l))), (String)((Object)_hv.a("j", (int)24617, (long)(0x3C10B4FA36303ADEL ^ l))));
        this._mi = new q6h();
    }

    @Override
    public void w4v() {
        super.w4v();
    }

    @Override
    public void i__() {
        double d;
        try {
            d = z8j.g7m() ? 0.0 : p_c.tz6() * 0.8;
        }
        catch (oov oov2) {
            throw _hv.a(oov2);
        }
        p_c.u7g(d);
        this.wyl.gze.qeu = 1.0f;
        super.i__();
    }

    @jev
    public void _fx(fz2 fz22) {
        block8: {
            boolean bl;
            block7: {
                int n = t9d.c();
                try {
                    try {
                        bl = this.wyl.vg8.fcv;
                        if (n != 0) break block7;
                        if (!bl) break block8;
                    }
                    catch (oov oov2) {
                        throw _hv.a(oov2);
                    }
                    bl = this.wyl.vg8.lfk;
                }
                catch (oov oov3) {
                    throw _hv.a(oov3);
                }
            }
            try {
                if (bl) {
                    fz22.o4n(this.wyl.vg8.kfp + 1.0E-14);
                }
            }
            catch (oov oov4) {
                throw _hv.a(oov4);
            }
        }
    }

    @jev
    public void nvr(q8e q8e2) {
        double d = this.wyl.vg8.o2v - this.wyl.vg8.bc1;
        double d2 = this.wyl.vg8.vbd - this.wyl.vg8.a4d;
        this.j14 = Math.sqrt(d * d + d2 * d2);
    }

    /*
     * Unable to fully structure code
     */
    @jev
    public void qfv(_qa var1_1) {
        block102: {
            block103: {
                block91: {
                    block92: {
                        block98: {
                            block99: {
                                block100: {
                                    block101: {
                                        block96: {
                                            block93: {
                                                block95: {
                                                    block94: {
                                                        block88: {
                                                            block87: {
                                                                block89: {
                                                                    block90: {
                                                                        block85: {
                                                                            block86: {
                                                                                block84: {
                                                                                    block83: {
                                                                                        block82: {
                                                                                            block80: {
                                                                                                block81: {
                                                                                                    var2_2 = t9d.c();
                                                                                                    var3_3 = _hv.cdj.d7c().booleanValue();
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    v0 = q0r.f2f();
                                                                                                                    if (var2_2 != 0) break block80;
                                                                                                                    if (v0) break block81;
                                                                                                                }
                                                                                                                catch (oov v1) {
                                                                                                                    throw _hv.a(v1);
                                                                                                                }
                                                                                                                v0 = _hv.z8j.g7m();
                                                                                                                if (var2_2 != 0) break block80;
                                                                                                            }
                                                                                                            catch (oov v2) {
                                                                                                                throw _hv.a(v2);
                                                                                                            }
                                                                                                            if (!v0) break block81;
                                                                                                        }
                                                                                                        catch (oov v3) {
                                                                                                            throw _hv.a(v3);
                                                                                                        }
                                                                                                        this.wyl.vg8.icv = 0.0;
                                                                                                        this.wyl.vg8.bw4 = 0.0;
                                                                                                        var1_1.faq = 0.0;
                                                                                                        var1_1.c6l = 0.0;
                                                                                                    }
                                                                                                    catch (oov v4) {
                                                                                                        throw _hv.a(v4);
                                                                                                    }
                                                                                                }
                                                                                                v0 = q0r.f2f();
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var2_2 != 0) break block82;
                                                                                                        if (!v0) break block83;
                                                                                                    }
                                                                                                    catch (oov v5) {
                                                                                                        throw _hv.a(v5);
                                                                                                    }
                                                                                                    v6 = this;
                                                                                                    if (var2_2 != 0) break block84;
                                                                                                }
                                                                                                catch (oov v7) {
                                                                                                    throw _hv.a(v7);
                                                                                                }
                                                                                                v0 = v6.wyl.vg8.lfk;
                                                                                            }
                                                                                            catch (oov v8) {
                                                                                                throw _hv.a(v8);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (v0) break block83;
                                                                                                        v9 = this.iim;
                                                                                                        if (var2_2 != 0) break block85;
                                                                                                    }
                                                                                                    catch (oov v10) {
                                                                                                        throw _hv.a(v10);
                                                                                                    }
                                                                                                    if (v9 != 1) break block86;
                                                                                                }
                                                                                                catch (oov v11) {
                                                                                                    throw _hv.a(v11);
                                                                                                }
                                                                                                v9 = (int)this.wyl.vg8.fcv;
                                                                                                if (var2_2 != 0) break block85;
                                                                                            }
                                                                                            catch (oov v12) {
                                                                                                throw _hv.a(v12);
                                                                                            }
                                                                                            if (v9 == 0) break block86;
                                                                                        }
                                                                                        catch (oov v13) {
                                                                                            throw _hv.a(v13);
                                                                                        }
                                                                                    }
                                                                                    v6 = this;
                                                                                }
                                                                                v6.aeu = p_c.tz6();
                                                                            }
                                                                            v9 = (int)this.wyl.vg8.lfk;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var2_2 != 0) break block87;
                                                                                                        if (v9 != 0) {
                                                                                                        }
                                                                                                        ** GOTO lbl148
                                                                                                    }
                                                                                                    catch (oov v14) {
                                                                                                        throw _hv.a(v14);
                                                                                                    }
                                                                                                    v9 = (int)q0r.fsj();
                                                                                                    if (var2_2 != 0) break block87;
                                                                                                }
                                                                                                catch (oov v15) {
                                                                                                    throw _hv.a(v15);
                                                                                                }
                                                                                                if (v9 != 0) {
                                                                                                }
                                                                                                ** GOTO lbl148
                                                                                            }
                                                                                            catch (oov v16) {
                                                                                                throw _hv.a(v16);
                                                                                            }
                                                                                            v9 = this.iim;
                                                                                            v17 = 2;
                                                                                            if (var2_2 != 0) break block88;
                                                                                        }
                                                                                        catch (oov v18) {
                                                                                            throw _hv.a(v18);
                                                                                        }
                                                                                        if (v9 == v17) {
                                                                                        }
                                                                                        ** GOTO lbl148
                                                                                    }
                                                                                    catch (oov v19) {
                                                                                        throw _hv.a(v19);
                                                                                    }
                                                                                    v20 = var3_3;
                                                                                    if (var2_2 != 0) break block89;
                                                                                }
                                                                                catch (oov v21) {
                                                                                    throw _hv.a(v21);
                                                                                }
                                                                                if (v20 == 0) break block90;
                                                                            }
                                                                            catch (oov v22) {
                                                                                throw _hv.a(v22);
                                                                            }
                                                                            this.wyl.gze.qeu = 3.0f;
                                                                        }
                                                                        catch (oov v23) {
                                                                            throw _hv.a(v23);
                                                                        }
                                                                    }
                                                                    this.wyl.vg8.xv1();
                                                                    this.wyl.vg8.mop = 0.40666 + (double)p_c.vmu() * 0.1;
                                                                    var1_1.ziq(this.wyl.vg8.mop);
                                                                    this.aeu *= 1.61;
                                                                    v20 = var3_3;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var2_2 != 0) break block91;
                                                                            if (v20 == 0) break block92;
                                                                        }
                                                                        catch (oov v24) {
                                                                            throw _hv.a(v24);
                                                                        }
                                                                        this.wyl.gze.qeu = 3.0f;
                                                                        if (var2_2 == 0) break block92;
                                                                    }
                                                                    catch (oov v25) {
                                                                        throw _hv.a(v25);
                                                                    }
lbl148:
                                                                    // 4 sources

                                                                    v9 = this.iim;
                                                                }
                                                                catch (oov v26) {
                                                                    throw _hv.a(v26);
                                                                }
                                                            }
                                                            try {
                                                                if (var2_2 != 0) break block93;
                                                                v17 = 3;
                                                            }
                                                            catch (oov v27) {
                                                                throw _hv.a(v27);
                                                            }
                                                        }
                                                        if (v9 != v17) ** GOTO lbl180
                                                        var4_4 = 0.66 * (this.j14 - p_c.tz6());
                                                        try {
                                                            try {
                                                                v28 = this;
                                                                if (var2_2 != 0) break block94;
                                                                v28.aeu = this.j14 - var4_4;
                                                                if (var3_3 == 0) break block95;
                                                            }
                                                            catch (oov v29) {
                                                                throw _hv.a(v29);
                                                            }
                                                            v28 = this;
                                                        }
                                                        catch (oov v30) {
                                                            throw _hv.a(v30);
                                                        }
                                                    }
                                                    v28.wyl.gze.qeu = 3.0f;
                                                }
                                                try {
                                                    if (var2_2 == 0) break block92;
lbl180:
                                                    // 2 sources

                                                    v9 = var3_3;
                                                }
                                                catch (oov v31) {
                                                    throw _hv.a(v31);
                                                }
                                            }
                                            try {
                                                if (v9 != 0) {
                                                    this.wyl.gze.qeu = 1.0f;
                                                }
                                            }
                                            catch (oov v32) {
                                                throw _hv.a(v32);
                                            }
                                            var4_5 = this.wyl.tij.bb4(this.wyl.vg8, this.wyl.vg8.rhs().sy_(0.0, this.wyl.vg8.mop, 0.0));
                                            try {
                                                try {
                                                    block97: {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v33 = var4_5.size();
                                                                            if (var2_2 != 0) break block96;
                                                                            if (v33 > 0) break block97;
                                                                        }
                                                                        catch (oov v34) {
                                                                            throw _hv.a(v34);
                                                                        }
                                                                        v33 = (int)this.wyl.vg8.fcv;
                                                                        if (var2_2 != 0) break block96;
                                                                    }
                                                                    catch (oov v35) {
                                                                        throw _hv.a(v35);
                                                                    }
                                                                    if (v33 != 0) break block97;
                                                                }
                                                                catch (oov v36) {
                                                                    throw _hv.a(v36);
                                                                }
                                                                v37 = this;
                                                                if (var2_2 != 0) break block98;
                                                            }
                                                            catch (oov v38) {
                                                                throw _hv.a(v38);
                                                            }
                                                            if (!v37.wyl.vg8.cbi) break block99;
                                                        }
                                                        catch (oov v39) {
                                                            throw _hv.a(v39);
                                                        }
                                                    }
                                                    v37 = this;
                                                    if (var2_2 != 0) break block98;
                                                }
                                                catch (oov v40) {
                                                    throw _hv.a(v40);
                                                }
                                                v33 = v37.iim;
                                            }
                                            catch (oov v41) {
                                                throw _hv.a(v41);
                                            }
                                        }
                                        try {
                                            try {
                                                if (v33 <= 0) break block99;
                                                v42 = this;
                                                v43 = q0r.fsj();
                                                if (var2_2 != 0) break block100;
                                            }
                                            catch (oov v44) {
                                                throw _hv.a(v44);
                                            }
                                            if (!v43) break block101;
                                        }
                                        catch (oov v45) {
                                            throw _hv.a(v45);
                                        }
                                        v43 = true;
                                        break block100;
                                    }
                                    v43 = false;
                                }
                                v42.iim = (int)v43;
                            }
                            v37 = this;
                        }
                        v37.aeu = this.j14 - this.j14 / 159.0;
                    }
                    try {
                        this.aeu = Math.max(this.aeu, p_c.tz6());
                        v46 = this;
                        if (var2_2 != 0) break block102;
                        v20 = v46.iim;
                    }
                    catch (oov v47) {
                        throw _hv.a(v47);
                    }
                }
                try {
                    if (v20 <= 0 || !q0r.fsj()) break block103;
                }
                catch (oov v48) {
                    throw _hv.a(v48);
                }
                var4_4 = Math.min((double)(1.0f + (float)this.wyl.vg8.qqi / 200.0f * _hv._48.d7c().floatValue()), 1.08);
                ohv.o0x(var1_1, this.aeu * var4_4);
            }
            v46 = this;
        }
        ++v46.iim;
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

                _hv.a = c.a(-4046787718870205242L, 3797757992852797657L, MethodHandles.lookup().lookupClass()).a(256566967015082L);
                var9 = _hv.a ^ 27149550460792L;
                _hv.f = new HashMap<K, V>(13);
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
                var4_5 = "Oc8j\u0005\u00e7\u00f9\u00c8>7\u008f\u00832\u0086\u000e\u00fd \u00bf\u0014\u00e9\u00b3\u00bbD\u00c7\u009c!-iN\u00a8~\u0016\u00b0\u0083\u00e4\t{\u0012\u00036{\u00cb+\u00ba\u00f3\u00e0\u00de\u009d=\u0010\u00d3\u001cY\u00d3f\u00eeu\n\u009bk\u0003g\u008a^\u00c4\u00af =\u00e8h\u0093`\u0013\u00e62\u00ea\u001f\u00de\u001d\u0093\u00ea7RJm7\fT\b\u00ef\u0086\tM\u00e6\u00fc\u00c8\u00ef\u0006\u009e";
                var6_6 = "Oc8j\u0005\u00e7\u00f9\u00c8>7\u008f\u00832\u0086\u000e\u00fd \u00bf\u0014\u00e9\u00b3\u00bbD\u00c7\u009c!-iN\u00a8~\u0016\u00b0\u0083\u00e4\t{\u0012\u00036{\u00cb+\u00ba\u00f3\u00e0\u00de\u009d=\u0010\u00d3\u001cY\u00d3f\u00eeu\n\u009bk\u0003g\u008a^\u00c4\u00af =\u00e8h\u0093`\u0013\u00e62\u00ea\u001f\u00de\u001d\u0093\u00ea7RJm7\fT\b\u00ef\u0086\tM\u00e6\u00fc\u00c8\u00ef\u0006\u009e".length();
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
                    var7_3[var5_4++] = _hv.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00f3\u001e\u00b0\u00d4\u00f7o\u008d\u0087\u00b2\u00d8t\u0099\u00e8|\u000e!\u001c\u00c0\u00d4\u00d2\u00ba\u001c\u0083&\u00f0\u00fa\u0000\u00f7\u000f\u009avK\u0010\u00b1\u00e5yf\u00fb8\u00a3\u00ec8 \u001aj\u0000\u0002\u00a3\u00d1";
                    var6_6 = "\u00f3\u001e\u00b0\u00d4\u00f7o\u008d\u0087\u00b2\u00d8t\u0099\u00e8|\u000e!\u001c\u00c0\u00d4\u00d2\u00ba\u001c\u0083&\u00f0\u00fa\u0000\u00f7\u000f\u009avK\u0010\u00b1\u00e5yf\u00fb8\u00a3\u00ec8 \u001aj\u0000\u0002\u00a3\u00d1".length();
                    var3_7 = 32;
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
                    var7_3[var5_4++] = _hv.b(var8_9).intern();
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
        _hv.d = var7_3;
        _hv.e = new String[6];
        _hv._48 = new crk((String)_hv.a("j", (int)9007, (long)(3130499421770983978L ^ var9)), (String)_hv.a("j", (int)20661, (long)(7464335965261519283L ^ var9)), 0.45f, 0.0f, 1.0f, 0.001f);
        _hv.z8j = new cn7((String)_hv.a("j", (int)9007, (long)(3130499421770983978L ^ var9)), (String)_hv.a("j", (int)18013, (long)(2175521142720286553L ^ var9)), true);
        _hv.cdj = new cn7((String)_hv.a("j", (int)9007, (long)(3130499421770983978L ^ var9)), (String)_hv.a("j", (int)1580, (long)(5703985017046503213L ^ var9)), true);
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2C67;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("_hv", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            _hv.e[n2] = _hv.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _hv.a(n, l);
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
            throw new RuntimeException("_hv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_hv.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

