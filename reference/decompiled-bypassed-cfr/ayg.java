/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ayg
extends u7m {
    private e0x ltl;
    private static final long a = c.a(3962622592047439069L, 5175156509280364262L, MethodHandles.lookup().lookupClass()).a(186828151924886L);
    private static final String b;

    public ayg(e0x e0x2) {
        this.vgp = 1;
        this.ltl = e0x2;
        this.qfy(uja.kdm);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public erg r__(erg var1_1, t9d var2_2, ha9 var3_3) {
        block59: {
            block72: {
                block71: {
                    block69: {
                        block70: {
                            block68: {
                                block66: {
                                    block67: {
                                        block63: {
                                            block64: {
                                                block65: {
                                                    block62: {
                                                        block60: {
                                                            block61: {
                                                                block58: {
                                                                    block56: {
                                                                        block57: {
                                                                            var4_4 = t9d.c();
                                                                            try {
                                                                                v0 = this.ltl == ox_.ibw;
                                                                            }
                                                                            catch (oov v1) {
                                                                                throw ayg.a(v1);
                                                                            }
                                                                            var5_5 = v0;
                                                                            var6_6 = this.tbt(var2_2, var3_3, var5_5);
                                                                            try {
                                                                                try {
                                                                                    v2 = var6_6;
                                                                                    if (var4_4 != 0) break block56;
                                                                                    if (v2 != null) break block57;
                                                                                }
                                                                                catch (oov v3) {
                                                                                    throw ayg.a(v3);
                                                                                }
                                                                                return var1_1;
                                                                            }
                                                                            catch (oov v4) {
                                                                                throw ayg.a(v4);
                                                                            }
                                                                        }
                                                                        v2 = var6_6;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var4_4 != 0) break block58;
                                                                            if (v2.oyz != akm$qs6.i4l) break block59;
                                                                        }
                                                                        catch (oov v5) {
                                                                            throw ayg.a(v5);
                                                                        }
                                                                        v2 = var6_6;
                                                                    }
                                                                    catch (oov v6) {
                                                                        throw ayg.a(v6);
                                                                    }
                                                                }
                                                                var7_7 = v2._uf();
                                                                try {
                                                                    try {
                                                                        v7 = var2_2.q2p(var3_3, var7_7);
                                                                        if (var4_4 != 0) break block60;
                                                                        if (v7) break block61;
                                                                    }
                                                                    catch (oov v8) {
                                                                        throw ayg.a(v8);
                                                                    }
                                                                    return var1_1;
                                                                }
                                                                catch (oov v9) {
                                                                    throw ayg.a(v9);
                                                                }
                                                            }
                                                            v7 = var5_5;
                                                        }
                                                        try {
                                                            try {
                                                                if (var4_4 != 0) break block62;
                                                                if (v7) {
                                                                }
                                                                ** GOTO lbl125
                                                            }
                                                            catch (oov v10) {
                                                                throw ayg.a(v10);
                                                            }
                                                            v7 = var3_3.dzh(var7_7.offset(var6_6.m_f), var6_6.m_f, var1_1);
                                                        }
                                                        catch (oov v11) {
                                                            throw ayg.a(v11);
                                                        }
                                                    }
                                                    try {
                                                        if (!v7) {
                                                            return var1_1;
                                                        }
                                                    }
                                                    catch (oov v12) {
                                                        throw ayg.a(v12);
                                                    }
                                                    var8_8 = var2_2.getBlockState(var7_7);
                                                    var9_9 = var8_8.r_y().p1r();
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v13 = var9_9;
                                                                    v14 = p3y.six;
                                                                    if (var4_4 != 0) break block63;
                                                                    if (v13 != v14) break block64;
                                                                }
                                                                catch (oov v15) {
                                                                    throw ayg.a(v15);
                                                                }
                                                                v16 = (Integer)var8_8.dil(hmv.nfg);
                                                                if (var4_4 != 0) break block65;
                                                            }
                                                            catch (oov v17) {
                                                                throw ayg.a(v17);
                                                            }
                                                            if (v16 != 0) break block64;
                                                        }
                                                        catch (oov v18) {
                                                            throw ayg.a(v18);
                                                        }
                                                        v16 = (int)var2_2.i6x(var7_7);
                                                    }
                                                    catch (oov v19) {
                                                        throw ayg.a(v19);
                                                    }
                                                }
                                                var3_3.aex(l9p.foo[u7m._lo(this)]);
                                                return this.ysm(var1_1, var3_3, xbr.lqp);
                                            }
                                            v13 = var9_9;
                                            v14 = p3y.e1s;
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (v13 != v14) break block66;
                                                    v20 = (Integer)var8_8.dil(hmv.nfg);
                                                    if (var4_4 != 0) break block67;
                                                }
                                                catch (oov v21) {
                                                    throw ayg.a(v21);
                                                }
                                                if (v20 != 0) break block66;
                                            }
                                            catch (oov v22) {
                                                throw ayg.a(v22);
                                            }
                                            v20 = (int)var2_2.i6x(var7_7);
                                        }
                                        catch (oov v23) {
                                            throw ayg.a(v23);
                                        }
                                    }
                                    var3_3.aex(l9p.foo[u7m._lo(this)]);
                                    return this.ysm(var1_1, var3_3, xbr.miu);
                                }
                                try {
                                    try {
                                        if (var4_4 == 0) break block59;
lbl125:
                                        // 2 sources

                                        if (this.ltl != ox_.ibw) break block68;
                                    }
                                    catch (oov v24) {
                                        throw ayg.a(v24);
                                    }
                                    return new erg(xbr.xxz);
                                }
                                catch (oov v25) {
                                    throw ayg.a(v25);
                                }
                            }
                            var8_8 = var7_7.offset(var6_6.m_f);
                            try {
                                try {
                                    v26 = var3_3.dzh((mew)var8_8, var6_6.m_f, var1_1);
                                    if (var4_4 != 0) break block69;
                                    if (v26) break block70;
                                }
                                catch (oov v27) {
                                    throw ayg.a(v27);
                                }
                                return var1_1;
                            }
                            catch (oov v28) {
                                throw ayg.a(v28);
                            }
                        }
                        v26 = this.nf1(var2_2, (mew)var8_8);
                    }
                    try {
                        try {
                            try {
                                if (var4_4 != 0) break block71;
                                if (!v26) break block59;
                            }
                            catch (oov v29) {
                                throw ayg.a(v29);
                            }
                            v30 = var3_3;
                            if (var4_4 != 0) break block72;
                        }
                        catch (oov v31) {
                            throw ayg.a(v31);
                        }
                        v26 = v30.lls.g40;
                    }
                    catch (oov v32) {
                        throw ayg.a(v32);
                    }
                }
                if (v26) break block59;
                v30 = var3_3;
            }
            v30.aex(l9p.foo[u7m._lo(this)]);
            return new erg(xbr.xxz);
        }
        return var1_1;
    }

    private erg ysm(erg erg2, ha9 ha92, u7m u7m2) {
        block17: {
            ha9 ha93;
            block16: {
                int n;
                block14: {
                    int n2;
                    block15: {
                        block12: {
                            block13: {
                                n2 = t9d.b();
                                try {
                                    try {
                                        n = ha92.lls.g40;
                                        if (n2 == 0) break block12;
                                        if (n == 0) break block13;
                                    }
                                    catch (oov oov2) {
                                        throw ayg.a(oov2);
                                    }
                                    return erg2;
                                }
                                catch (oov oov3) {
                                    throw ayg.a(oov3);
                                }
                            }
                            n = erg2.qd2 = erg2.qd2 - 1;
                        }
                        try {
                            try {
                                if (n2 == 0) break block14;
                                if (n > 0) break block15;
                            }
                            catch (oov oov4) {
                                throw ayg.a(oov4);
                            }
                            return new erg(u7m2);
                        }
                        catch (oov oov5) {
                            throw ayg.a(oov5);
                        }
                    }
                    try {
                        ha93 = ha92;
                        if (n2 == 0) break block16;
                        n = ha93.up_.phd(new erg(u7m2)) ? 1 : 0;
                    }
                    catch (oov oov6) {
                        throw ayg.a(oov6);
                    }
                }
                if (n != 0) break block17;
                ha93 = ha92;
            }
            ha93.ejq(new erg(u7m2, 1, 0), false);
        }
        return erg2;
    }

    /*
     * Unable to fully structure code
     */
    public boolean nf1(t9d var1_1, mew var2_2) {
        block45: {
            block46: {
                block44: {
                    block42: {
                        block43: {
                            block40: {
                                block41: {
                                    block38: {
                                        block39: {
                                            var3_3 = ayg.a ^ 100695381926862L;
                                            var5_4 = t9d.b();
                                            try {
                                                try {
                                                    v0 = this.ltl;
                                                    if (var5_4 == 0) break block38;
                                                    if (v0 != ox_.ibw) break block39;
                                                }
                                                catch (oov v1) {
                                                    throw ayg.a(v1);
                                                }
                                                return false;
                                            }
                                            catch (oov v2) {
                                                throw ayg.a(v2);
                                            }
                                        }
                                        v0 = var1_1.getBlockState(var2_2).r_y();
                                    }
                                    var6_5 = v0.p1r();
                                    try {
                                        v3 = var6_5.gk6();
                                        if (var5_4 == 0) break block40;
                                        if (v3) break block41;
                                    }
                                    catch (oov v4) {
                                        throw ayg.a(v4);
                                    }
                                    v3 = true;
                                    break block40;
                                }
                                v3 = false;
                            }
                            var7_6 = v3;
                            try {
                                try {
                                    try {
                                        try {
                                            v5 = var1_1.isAirBlock(var2_2);
                                            if (var5_4 == 0) break block42;
                                            if (v5) break block43;
                                        }
                                        catch (oov v6) {
                                            throw ayg.a(v6);
                                        }
                                        v5 = var7_6;
                                        if (var5_4 == 0) break block42;
                                    }
                                    catch (oov v7) {
                                        throw ayg.a(v7);
                                    }
                                    if (v5) break block43;
                                }
                                catch (oov v8) {
                                    throw ayg.a(v8);
                                }
                                return false;
                            }
                            catch (oov v9) {
                                throw ayg.a(v9);
                            }
                        }
                        v5 = var1_1.vzz.yz2();
                    }
                    try {
                        try {
                            if (var5_4 == 0) break block44;
                            if (v5) {
                            }
                            ** GOTO lbl91
                        }
                        catch (oov v10) {
                            throw ayg.a(v10);
                        }
                        if (this.ltl == ox_.whp) {
                        }
                        ** GOTO lbl91
                    }
                    catch (oov v11) {
                        throw ayg.a(v11);
                    }
                    var8_7 = var2_2.getX();
                    var9_8 = var2_2.getY();
                    var10_9 = var2_2.getZ();
                    var1_1.amg((float)var8_7 + 0.5f, (float)var9_8 + 0.5f, (float)var10_9 + 0.5f, ayg.b, 0.5f, 2.6f + (var1_1.fsy.nextFloat() - var1_1.fsy.nextFloat()) * 0.8f);
                    for (var11_10 = 0; var11_10 < 8; ++var11_10) {
                        try {
                            var1_1.zvy(w_0.vby, (double)var8_7 + Math.random(), (double)var9_8 + Math.random(), (double)var10_9 + Math.random(), 0.0, 0.0, 0.0, new int[0]);
                            if (var5_4 != 0) {
                                if (var5_4 != 0) continue;
                                break;
                            }
                            break block45;
                        }
                        catch (oov v12) {
                            throw ayg.a(v12);
                        }
                    }
                    try {
                        if (var5_4 != 0) break block45;
lbl91:
                        // 3 sources

                        v5 = var1_1.v0f;
                    }
                    catch (oov v13) {
                        throw ayg.a(v13);
                    }
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (var5_4 == 0) break block45;
                                        if (v5) break block46;
                                    }
                                    catch (oov v14) {
                                        throw ayg.a(v14);
                                    }
                                    v5 = var7_6;
                                    if (var5_4 == 0) break block45;
                                }
                                catch (oov v15) {
                                    throw ayg.a(v15);
                                }
                                if (!v5) break block46;
                            }
                            catch (oov v16) {
                                throw ayg.a(v16);
                            }
                            v5 = var6_5.l7j();
                            if (var5_4 == 0) break block45;
                        }
                        catch (oov v17) {
                            throw ayg.a(v17);
                        }
                        if (v5) break block46;
                    }
                    catch (oov v18) {
                        throw ayg.a(v18);
                    }
                    var1_1.yir(var2_2, true);
                }
                catch (oov v19) {
                    throw ayg.a(v19);
                }
            }
            v5 = var1_1.vct(var2_2, this.ltl.l4i(), 3);
        }
        return true;
    }

    public e0x k1c() {
        return this.ltl;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x531BBFEC42D5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("M\u001at\\p\u00aa\u00cbUh`\u00bf\u00eb3\u000f\u00f8\u00da".getBytes("ISO-8859-1"));
                b = ayg.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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
}

