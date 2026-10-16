/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g7u
extends e0x {
    public static final qx_ sxt;
    public static final zb_ ru8;
    public static final zb_ vjy;
    private static final int[][] sgn;
    private final e0x yk1;
    private final zfz j61;
    private boolean wdb;
    private int xmj;

    public g7u(zfz zfz2) {
        super(zfz2.r_y().kgd);
        this.y8l(this._8_.c32().zvi(sxt, (Comparable)((Object)vt2.z9q)).zvi(ru8, (Comparable)((Object)g7u$lrl.ow0)).zvi(vjy, (Comparable)((Object)g7u$qmc.rn9)));
        this.yk1 = zfz2.r_y();
        this.j61 = zfz2;
        this.q6h(this.yk1.knk);
        this.dj8(this.yk1.iep / 3.0f);
        this.t4k(this.yk1.zu6);
        this.opa(255);
        this.i3l(uja.mqu);
    }

    @Override
    public void c7i(m5n m5n2, mew mew2) {
        block8: {
            g7u g7u2;
            block6: {
                int n = t9d.c();
                try {
                    block7: {
                        try {
                            try {
                                g7u2 = this;
                                if (n != 0) break block6;
                                if (!g7u2.wdb) break block7;
                            }
                            catch (oov oov2) {
                                throw g7u.a(oov2);
                            }
                            this.xl4(0.5f * (float)(this.xmj % 2), 0.5f * (float)(this.xmj / 4 % 2), 0.5f * (float)(this.xmj / 2 % 2), 0.5f + 0.5f * (float)(this.xmj % 2), 0.5f + 0.5f * (float)(this.xmj / 4 % 2), 0.5f + 0.5f * (float)(this.xmj / 2 % 2));
                            if (n == 0) break block8;
                        }
                        catch (oov oov3) {
                            throw g7u.a(oov3);
                        }
                    }
                    g7u2 = this;
                }
                catch (oov oov4) {
                    throw g7u.a(oov4);
                }
            }
            g7u2.xl4(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public boolean gck() {
        return false;
    }

    public void gjc(m5n m5n2, mew mew2) {
        block5: {
            int n = t9d.c();
            try {
                block4: {
                    try {
                        if (m5n2.getBlockState(mew2).dil(ru8) != g7u$lrl.vvx) break block4;
                        this.xl4(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
                        if (n == 0) break block5;
                    }
                    catch (oov oov2) {
                        throw g7u.a(oov2);
                    }
                }
                this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
            }
            catch (oov oov3) {
                throw g7u.a(oov3);
            }
        }
    }

    public static boolean x2k(e0x e0x2) {
        return e0x2 instanceof g7u;
    }

    public static boolean xpr(m5n m5n2, mew mew2, zfz zfz2) {
        boolean bl;
        block10: {
            block8: {
                Comparable comparable;
                Comparable comparable2;
                block9: {
                    zfz zfz3 = m5n2.getBlockState(mew2);
                    e0x e0x2 = zfz3.r_y();
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                if (!g7u.x2k(e0x2)) break block8;
                                comparable2 = zfz3.dil(ru8);
                                comparable = zfz2.dil(ru8);
                                if (n != 0) break block9;
                            }
                            catch (oov oov2) {
                                throw g7u.a(oov2);
                            }
                            if (comparable2 != comparable) break block8;
                        }
                        catch (oov oov3) {
                            throw g7u.a(oov3);
                        }
                        comparable2 = zfz3.dil(sxt);
                        comparable = zfz2.dil(sxt);
                    }
                    catch (oov oov4) {
                        throw g7u.a(oov4);
                    }
                }
                try {
                    if (comparable2 != comparable) break block8;
                    bl = true;
                    break block10;
                }
                catch (oov oov5) {
                    throw g7u.a(oov5);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public int r8u(m5n var1_1, mew var2_2) {
        block135: {
            block112: {
                block142: {
                    block143: {
                        block137: {
                            block138: {
                                block140: {
                                    block141: {
                                        block139: {
                                            block136: {
                                                block124: {
                                                    block125: {
                                                        block133: {
                                                            block134: {
                                                                block132: {
                                                                    block127: {
                                                                        block128: {
                                                                            block130: {
                                                                                block131: {
                                                                                    block129: {
                                                                                        block126: {
                                                                                            block113: {
                                                                                                block114: {
                                                                                                    block122: {
                                                                                                        block123: {
                                                                                                            block121: {
                                                                                                                block116: {
                                                                                                                    block117: {
                                                                                                                        block119: {
                                                                                                                            block120: {
                                                                                                                                block118: {
                                                                                                                                    block115: {
                                                                                                                                        block101: {
                                                                                                                                            block102: {
                                                                                                                                                block110: {
                                                                                                                                                    block111: {
                                                                                                                                                        block109: {
                                                                                                                                                            block104: {
                                                                                                                                                                block105: {
                                                                                                                                                                    block107: {
                                                                                                                                                                        block108: {
                                                                                                                                                                            block106: {
                                                                                                                                                                                block103: {
                                                                                                                                                                                    var4_3 = var1_1.getBlockState(var2_2);
                                                                                                                                                                                    var5_4 = (vt2)var4_3.dil(g7u.sxt);
                                                                                                                                                                                    var6_5 = (g7u$lrl)var4_3.dil(g7u.ru8);
                                                                                                                                                                                    var3_6 = t9d.c();
                                                                                                                                                                                    try {
                                                                                                                                                                                        v0 = var6_5 == g7u$lrl.vvx ? 1 : 0;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (oov v1) {
                                                                                                                                                                                        throw g7u.a(v1);
                                                                                                                                                                                    }
                                                                                                                                                                                    var7_7 = v0;
                                                                                                                                                                                    try {
                                                                                                                                                                                        v2 = var5_4;
                                                                                                                                                                                        v3 = vt2.zk4;
                                                                                                                                                                                        if (var3_6 != 0) break block101;
                                                                                                                                                                                        if (v2 == v3) {
                                                                                                                                                                                        }
                                                                                                                                                                                        ** GOTO lbl106
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (oov v4) {
                                                                                                                                                                                        throw g7u.a(v4);
                                                                                                                                                                                    }
                                                                                                                                                                                    var8_8 = var1_1.getBlockState(var2_2.o_8());
                                                                                                                                                                                    var9_9 = var8_8.r_y();
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                if (!g7u.x2k(var9_9)) break block102;
                                                                                                                                                                                                v5 = var6_5;
                                                                                                                                                                                                if (var3_6 != 0) break block103;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (oov v6) {
                                                                                                                                                                                                throw g7u.a(v6);
                                                                                                                                                                                            }
                                                                                                                                                                                            if (v5 != var8_8.dil(g7u.ru8)) break block102;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (oov v7) {
                                                                                                                                                                                            throw g7u.a(v7);
                                                                                                                                                                                        }
                                                                                                                                                                                        v5 = var8_8.dil(g7u.sxt);
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (oov v8) {
                                                                                                                                                                                        throw g7u.a(v8);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                var10_10 = (vt2)v5;
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            v9 = var10_10;
                                                                                                                                                                                            v10 = vt2.z9q;
                                                                                                                                                                                            if (var3_6 != 0) break block104;
                                                                                                                                                                                            if (v9 != v10) break block105;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (oov v11) {
                                                                                                                                                                                            throw g7u.a(v11);
                                                                                                                                                                                        }
                                                                                                                                                                                        v12 = g7u.xpr(var1_1, var2_2.z6x(), var4_3);
                                                                                                                                                                                        if (var3_6 != 0) break block106;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (oov v13) {
                                                                                                                                                                                        throw g7u.a(v13);
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v12 != 0) break block105;
                                                                                                                                                                                }
                                                                                                                                                                                catch (oov v14) {
                                                                                                                                                                                    throw g7u.a(v14);
                                                                                                                                                                                }
                                                                                                                                                                                v12 = var7_7;
                                                                                                                                                                            }
                                                                                                                                                                            try {
                                                                                                                                                                                if (var3_6 != 0) break block107;
                                                                                                                                                                                if (v12 == 0) break block108;
                                                                                                                                                                            }
                                                                                                                                                                            catch (oov v15) {
                                                                                                                                                                                throw g7u.a(v15);
                                                                                                                                                                            }
                                                                                                                                                                            v12 = 1;
                                                                                                                                                                            break block107;
                                                                                                                                                                        }
                                                                                                                                                                        v12 = 2;
                                                                                                                                                                    }
                                                                                                                                                                    return v12;
                                                                                                                                                                }
                                                                                                                                                                v9 = var10_10;
                                                                                                                                                                v10 = vt2.mxp;
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    if (v9 != v10) break block102;
                                                                                                                                                                    v16 = g7u.xpr(var1_1, var2_2.idu(), var4_3);
                                                                                                                                                                    if (var3_6 != 0) break block109;
                                                                                                                                                                }
                                                                                                                                                                catch (oov v17) {
                                                                                                                                                                    throw g7u.a(v17);
                                                                                                                                                                }
                                                                                                                                                                if (v16 != 0) break block102;
                                                                                                                                                            }
                                                                                                                                                            catch (oov v18) {
                                                                                                                                                                throw g7u.a(v18);
                                                                                                                                                            }
                                                                                                                                                            v16 = var7_7;
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            if (var3_6 != 0) break block110;
                                                                                                                                                            if (v16 == 0) break block111;
                                                                                                                                                        }
                                                                                                                                                        catch (oov v19) {
                                                                                                                                                            throw g7u.a(v19);
                                                                                                                                                        }
                                                                                                                                                        v16 = 2;
                                                                                                                                                        break block110;
                                                                                                                                                    }
                                                                                                                                                    v16 = 1;
                                                                                                                                                }
                                                                                                                                                return v16;
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                if (var3_6 == 0) break block112;
lbl106:
                                                                                                                                                // 2 sources

                                                                                                                                                v2 = var5_4;
                                                                                                                                                v3 = vt2.te4;
                                                                                                                                            }
                                                                                                                                            catch (oov v20) {
                                                                                                                                                throw g7u.a(v20);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            if (var3_6 != 0) break block113;
                                                                                                                                            if (v2 == v3) {
                                                                                                                                            }
                                                                                                                                            ** GOTO lbl206
                                                                                                                                        }
                                                                                                                                        catch (oov v21) {
                                                                                                                                            throw g7u.a(v21);
                                                                                                                                        }
                                                                                                                                        var8_8 = var1_1.getBlockState(var2_2.y8e());
                                                                                                                                        var9_9 = var8_8.r_y();
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    if (!g7u.x2k(var9_9)) break block114;
                                                                                                                                                    v22 = var6_5;
                                                                                                                                                    if (var3_6 != 0) break block115;
                                                                                                                                                }
                                                                                                                                                catch (oov v23) {
                                                                                                                                                    throw g7u.a(v23);
                                                                                                                                                }
                                                                                                                                                if (v22 != var8_8.dil(g7u.ru8)) break block114;
                                                                                                                                            }
                                                                                                                                            catch (oov v24) {
                                                                                                                                                throw g7u.a(v24);
                                                                                                                                            }
                                                                                                                                            v22 = var8_8.dil(g7u.sxt);
                                                                                                                                        }
                                                                                                                                        catch (oov v25) {
                                                                                                                                            throw g7u.a(v25);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var10_10 = (vt2)v22;
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v26 = var10_10;
                                                                                                                                                v27 = vt2.z9q;
                                                                                                                                                if (var3_6 != 0) break block116;
                                                                                                                                                if (v26 != v27) break block117;
                                                                                                                                            }
                                                                                                                                            catch (oov v28) {
                                                                                                                                                throw g7u.a(v28);
                                                                                                                                            }
                                                                                                                                            v29 = g7u.xpr(var1_1, var2_2.z6x(), var4_3);
                                                                                                                                            if (var3_6 != 0) break block118;
                                                                                                                                        }
                                                                                                                                        catch (oov v30) {
                                                                                                                                            throw g7u.a(v30);
                                                                                                                                        }
                                                                                                                                        if (v29 != 0) break block117;
                                                                                                                                    }
                                                                                                                                    catch (oov v31) {
                                                                                                                                        throw g7u.a(v31);
                                                                                                                                    }
                                                                                                                                    v29 = var7_7;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    if (var3_6 != 0) break block119;
                                                                                                                                    if (v29 == 0) break block120;
                                                                                                                                }
                                                                                                                                catch (oov v32) {
                                                                                                                                    throw g7u.a(v32);
                                                                                                                                }
                                                                                                                                v29 = 2;
                                                                                                                                break block119;
                                                                                                                            }
                                                                                                                            v29 = 1;
                                                                                                                        }
                                                                                                                        return v29;
                                                                                                                    }
                                                                                                                    v26 = var10_10;
                                                                                                                    v27 = vt2.mxp;
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (v26 != v27) break block114;
                                                                                                                        v33 = g7u.xpr(var1_1, var2_2.idu(), var4_3);
                                                                                                                        if (var3_6 != 0) break block121;
                                                                                                                    }
                                                                                                                    catch (oov v34) {
                                                                                                                        throw g7u.a(v34);
                                                                                                                    }
                                                                                                                    if (v33 != 0) break block114;
                                                                                                                }
                                                                                                                catch (oov v35) {
                                                                                                                    throw g7u.a(v35);
                                                                                                                }
                                                                                                                v33 = var7_7;
                                                                                                            }
                                                                                                            try {
                                                                                                                if (var3_6 != 0) break block122;
                                                                                                                if (v33 == 0) break block123;
                                                                                                            }
                                                                                                            catch (oov v36) {
                                                                                                                throw g7u.a(v36);
                                                                                                            }
                                                                                                            v33 = 1;
                                                                                                            break block122;
                                                                                                        }
                                                                                                        v33 = 2;
                                                                                                    }
                                                                                                    return v33;
                                                                                                }
                                                                                                try {
                                                                                                    if (var3_6 == 0) break block112;
lbl206:
                                                                                                    // 2 sources

                                                                                                    v2 = var5_4;
                                                                                                    v3 = vt2.mxp;
                                                                                                }
                                                                                                catch (oov v37) {
                                                                                                    throw g7u.a(v37);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (var3_6 != 0) break block124;
                                                                                                if (v2 == v3) {
                                                                                                }
                                                                                                ** GOTO lbl306
                                                                                            }
                                                                                            catch (oov v38) {
                                                                                                throw g7u.a(v38);
                                                                                            }
                                                                                            var8_8 = var1_1.getBlockState(var2_2.z6x());
                                                                                            var9_9 = var8_8.r_y();
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (!g7u.x2k(var9_9)) break block125;
                                                                                                        v39 = var6_5;
                                                                                                        if (var3_6 != 0) break block126;
                                                                                                    }
                                                                                                    catch (oov v40) {
                                                                                                        throw g7u.a(v40);
                                                                                                    }
                                                                                                    if (v39 != var8_8.dil(g7u.ru8)) break block125;
                                                                                                }
                                                                                                catch (oov v41) {
                                                                                                    throw g7u.a(v41);
                                                                                                }
                                                                                                v39 = var8_8.dil(g7u.sxt);
                                                                                            }
                                                                                            catch (oov v42) {
                                                                                                throw g7u.a(v42);
                                                                                            }
                                                                                        }
                                                                                        var10_10 = (vt2)v39;
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v43 = var10_10;
                                                                                                    v44 = vt2.te4;
                                                                                                    if (var3_6 != 0) break block127;
                                                                                                    if (v43 != v44) break block128;
                                                                                                }
                                                                                                catch (oov v45) {
                                                                                                    throw g7u.a(v45);
                                                                                                }
                                                                                                v46 = g7u.xpr(var1_1, var2_2.o_8(), var4_3);
                                                                                                if (var3_6 != 0) break block129;
                                                                                            }
                                                                                            catch (oov v47) {
                                                                                                throw g7u.a(v47);
                                                                                            }
                                                                                            if (v46 != 0) break block128;
                                                                                        }
                                                                                        catch (oov v48) {
                                                                                            throw g7u.a(v48);
                                                                                        }
                                                                                        v46 = var7_7;
                                                                                    }
                                                                                    try {
                                                                                        if (var3_6 != 0) break block130;
                                                                                        if (v46 == 0) break block131;
                                                                                    }
                                                                                    catch (oov v49) {
                                                                                        throw g7u.a(v49);
                                                                                    }
                                                                                    v46 = 2;
                                                                                    break block130;
                                                                                }
                                                                                v46 = 1;
                                                                            }
                                                                            return v46;
                                                                        }
                                                                        v43 = var10_10;
                                                                        v44 = vt2.zk4;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (v43 != v44) break block125;
                                                                            v50 = g7u.xpr(var1_1, var2_2.y8e(), var4_3);
                                                                            if (var3_6 != 0) break block132;
                                                                        }
                                                                        catch (oov v51) {
                                                                            throw g7u.a(v51);
                                                                        }
                                                                        if (v50 != 0) break block125;
                                                                    }
                                                                    catch (oov v52) {
                                                                        throw g7u.a(v52);
                                                                    }
                                                                    v50 = var7_7;
                                                                }
                                                                try {
                                                                    if (var3_6 != 0) break block133;
                                                                    if (v50 == 0) break block134;
                                                                }
                                                                catch (oov v53) {
                                                                    throw g7u.a(v53);
                                                                }
                                                                v50 = 1;
                                                                break block133;
                                                            }
                                                            v50 = 2;
                                                        }
                                                        return v50;
                                                    }
                                                    try {
                                                        if (var3_6 == 0) break block112;
lbl306:
                                                        // 2 sources

                                                        v2 = var5_4;
                                                        v3 = vt2.z9q;
                                                    }
                                                    catch (oov v54) {
                                                        throw g7u.a(v54);
                                                    }
                                                }
                                                if (v2 != v3) break block112;
                                                var8_8 = var1_1.getBlockState(var2_2.idu());
                                                var9_9 = var8_8.r_y();
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v55 = (int)g7u.x2k(var9_9);
                                                                if (var3_6 != 0) break block135;
                                                                if (v55 == 0) break block112;
                                                            }
                                                            catch (oov v56) {
                                                                throw g7u.a(v56);
                                                            }
                                                            v57 = var6_5;
                                                            if (var3_6 != 0) break block136;
                                                        }
                                                        catch (oov v58) {
                                                            throw g7u.a(v58);
                                                        }
                                                        if (v57 != var8_8.dil(g7u.ru8)) break block112;
                                                    }
                                                    catch (oov v59) {
                                                        throw g7u.a(v59);
                                                    }
                                                    v57 = var8_8.dil(g7u.sxt);
                                                }
                                                catch (oov v60) {
                                                    throw g7u.a(v60);
                                                }
                                            }
                                            var10_10 = (vt2)v57;
                                            try {
                                                try {
                                                    try {
                                                        v61 = var10_10;
                                                        v62 = vt2.te4;
                                                        if (var3_6 != 0) break block137;
                                                        if (v61 != v62) break block138;
                                                    }
                                                    catch (oov v63) {
                                                        throw g7u.a(v63);
                                                    }
                                                    v64 = g7u.xpr(var1_1, var2_2.o_8(), var4_3);
                                                    if (var3_6 != 0) break block139;
                                                }
                                                catch (oov v65) {
                                                    throw g7u.a(v65);
                                                }
                                                if (v64 != 0) break block138;
                                            }
                                            catch (oov v66) {
                                                throw g7u.a(v66);
                                            }
                                            v64 = var7_7;
                                        }
                                        try {
                                            if (var3_6 != 0) break block140;
                                            if (v64 == 0) break block141;
                                        }
                                        catch (oov v67) {
                                            throw g7u.a(v67);
                                        }
                                        v64 = 1;
                                        break block140;
                                    }
                                    v64 = 2;
                                }
                                return v64;
                            }
                            v61 = var10_10;
                            v62 = vt2.zk4;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (v61 != v62) break block112;
                                        v55 = (int)g7u.xpr(var1_1, var2_2.y8e(), var4_3);
                                        if (var3_6 != 0) break block135;
                                    }
                                    catch (oov v68) {
                                        throw g7u.a(v68);
                                    }
                                    if (v55 != 0) break block112;
                                }
                                catch (oov v69) {
                                    throw g7u.a(v69);
                                }
                                v70 = var7_7;
                                if (var3_6 != 0) break block142;
                            }
                            catch (oov v71) {
                                throw g7u.a(v71);
                            }
                            if (v70 == 0) break block143;
                        }
                        catch (oov v72) {
                            throw g7u.a(v72);
                        }
                        v70 = 2;
                        break block142;
                    }
                    v70 = 1;
                }
                return v70;
            }
            v55 = 0;
        }
        return v55;
    }

    /*
     * Unable to fully structure code
     */
    public int p9f(m5n var1_1, mew var2_2) {
        block135: {
            block112: {
                block142: {
                    block143: {
                        block137: {
                            block138: {
                                block140: {
                                    block141: {
                                        block139: {
                                            block136: {
                                                block124: {
                                                    block125: {
                                                        block133: {
                                                            block134: {
                                                                block132: {
                                                                    block127: {
                                                                        block128: {
                                                                            block130: {
                                                                                block131: {
                                                                                    block129: {
                                                                                        block126: {
                                                                                            block113: {
                                                                                                block114: {
                                                                                                    block122: {
                                                                                                        block123: {
                                                                                                            block121: {
                                                                                                                block116: {
                                                                                                                    block117: {
                                                                                                                        block119: {
                                                                                                                            block120: {
                                                                                                                                block118: {
                                                                                                                                    block115: {
                                                                                                                                        block101: {
                                                                                                                                            block102: {
                                                                                                                                                block110: {
                                                                                                                                                    block111: {
                                                                                                                                                        block109: {
                                                                                                                                                            block104: {
                                                                                                                                                                block105: {
                                                                                                                                                                    block107: {
                                                                                                                                                                        block108: {
                                                                                                                                                                            block106: {
                                                                                                                                                                                block103: {
                                                                                                                                                                                    var4_3 = var1_1.getBlockState(var2_2);
                                                                                                                                                                                    var5_4 = (vt2)var4_3.dil(g7u.sxt);
                                                                                                                                                                                    var3_5 = t9d.c();
                                                                                                                                                                                    var6_6 = (g7u$lrl)var4_3.dil(g7u.ru8);
                                                                                                                                                                                    try {
                                                                                                                                                                                        v0 = var6_6 == g7u$lrl.vvx ? 1 : 0;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (oov v1) {
                                                                                                                                                                                        throw g7u.a(v1);
                                                                                                                                                                                    }
                                                                                                                                                                                    var7_7 = v0;
                                                                                                                                                                                    try {
                                                                                                                                                                                        v2 = var5_4;
                                                                                                                                                                                        v3 = vt2.zk4;
                                                                                                                                                                                        if (var3_5 != 0) break block101;
                                                                                                                                                                                        if (v2 == v3) {
                                                                                                                                                                                        }
                                                                                                                                                                                        ** GOTO lbl106
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (oov v4) {
                                                                                                                                                                                        throw g7u.a(v4);
                                                                                                                                                                                    }
                                                                                                                                                                                    var8_8 = var1_1.getBlockState(var2_2.y8e());
                                                                                                                                                                                    var9_9 = var8_8.r_y();
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                if (!g7u.x2k(var9_9)) break block102;
                                                                                                                                                                                                v5 = var6_6;
                                                                                                                                                                                                if (var3_5 != 0) break block103;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (oov v6) {
                                                                                                                                                                                                throw g7u.a(v6);
                                                                                                                                                                                            }
                                                                                                                                                                                            if (v5 != var8_8.dil(g7u.ru8)) break block102;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (oov v7) {
                                                                                                                                                                                            throw g7u.a(v7);
                                                                                                                                                                                        }
                                                                                                                                                                                        v5 = var8_8.dil(g7u.sxt);
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (oov v8) {
                                                                                                                                                                                        throw g7u.a(v8);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                var10_10 = (vt2)v5;
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            v9 = var10_10;
                                                                                                                                                                                            v10 = vt2.z9q;
                                                                                                                                                                                            if (var3_5 != 0) break block104;
                                                                                                                                                                                            if (v9 != v10) break block105;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (oov v11) {
                                                                                                                                                                                            throw g7u.a(v11);
                                                                                                                                                                                        }
                                                                                                                                                                                        v12 = g7u.xpr(var1_1, var2_2.idu(), var4_3);
                                                                                                                                                                                        if (var3_5 != 0) break block106;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (oov v13) {
                                                                                                                                                                                        throw g7u.a(v13);
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v12 != 0) break block105;
                                                                                                                                                                                }
                                                                                                                                                                                catch (oov v14) {
                                                                                                                                                                                    throw g7u.a(v14);
                                                                                                                                                                                }
                                                                                                                                                                                v12 = var7_7;
                                                                                                                                                                            }
                                                                                                                                                                            try {
                                                                                                                                                                                if (var3_5 != 0) break block107;
                                                                                                                                                                                if (v12 == 0) break block108;
                                                                                                                                                                            }
                                                                                                                                                                            catch (oov v15) {
                                                                                                                                                                                throw g7u.a(v15);
                                                                                                                                                                            }
                                                                                                                                                                            v12 = 1;
                                                                                                                                                                            break block107;
                                                                                                                                                                        }
                                                                                                                                                                        v12 = 2;
                                                                                                                                                                    }
                                                                                                                                                                    return v12;
                                                                                                                                                                }
                                                                                                                                                                v9 = var10_10;
                                                                                                                                                                v10 = vt2.mxp;
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    if (v9 != v10) break block102;
                                                                                                                                                                    v16 = g7u.xpr(var1_1, var2_2.z6x(), var4_3);
                                                                                                                                                                    if (var3_5 != 0) break block109;
                                                                                                                                                                }
                                                                                                                                                                catch (oov v17) {
                                                                                                                                                                    throw g7u.a(v17);
                                                                                                                                                                }
                                                                                                                                                                if (v16 != 0) break block102;
                                                                                                                                                            }
                                                                                                                                                            catch (oov v18) {
                                                                                                                                                                throw g7u.a(v18);
                                                                                                                                                            }
                                                                                                                                                            v16 = var7_7;
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            if (var3_5 != 0) break block110;
                                                                                                                                                            if (v16 == 0) break block111;
                                                                                                                                                        }
                                                                                                                                                        catch (oov v19) {
                                                                                                                                                            throw g7u.a(v19);
                                                                                                                                                        }
                                                                                                                                                        v16 = 2;
                                                                                                                                                        break block110;
                                                                                                                                                    }
                                                                                                                                                    v16 = 1;
                                                                                                                                                }
                                                                                                                                                return v16;
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                if (var3_5 == 0) break block112;
lbl106:
                                                                                                                                                // 2 sources

                                                                                                                                                v2 = var5_4;
                                                                                                                                                v3 = vt2.te4;
                                                                                                                                            }
                                                                                                                                            catch (oov v20) {
                                                                                                                                                throw g7u.a(v20);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            if (var3_5 != 0) break block113;
                                                                                                                                            if (v2 == v3) {
                                                                                                                                            }
                                                                                                                                            ** GOTO lbl206
                                                                                                                                        }
                                                                                                                                        catch (oov v21) {
                                                                                                                                            throw g7u.a(v21);
                                                                                                                                        }
                                                                                                                                        var8_8 = var1_1.getBlockState(var2_2.o_8());
                                                                                                                                        var9_9 = var8_8.r_y();
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    if (!g7u.x2k(var9_9)) break block114;
                                                                                                                                                    v22 = var6_6;
                                                                                                                                                    if (var3_5 != 0) break block115;
                                                                                                                                                }
                                                                                                                                                catch (oov v23) {
                                                                                                                                                    throw g7u.a(v23);
                                                                                                                                                }
                                                                                                                                                if (v22 != var8_8.dil(g7u.ru8)) break block114;
                                                                                                                                            }
                                                                                                                                            catch (oov v24) {
                                                                                                                                                throw g7u.a(v24);
                                                                                                                                            }
                                                                                                                                            v22 = var8_8.dil(g7u.sxt);
                                                                                                                                        }
                                                                                                                                        catch (oov v25) {
                                                                                                                                            throw g7u.a(v25);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var10_10 = (vt2)v22;
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v26 = var10_10;
                                                                                                                                                v27 = vt2.z9q;
                                                                                                                                                if (var3_5 != 0) break block116;
                                                                                                                                                if (v26 != v27) break block117;
                                                                                                                                            }
                                                                                                                                            catch (oov v28) {
                                                                                                                                                throw g7u.a(v28);
                                                                                                                                            }
                                                                                                                                            v29 = g7u.xpr(var1_1, var2_2.idu(), var4_3);
                                                                                                                                            if (var3_5 != 0) break block118;
                                                                                                                                        }
                                                                                                                                        catch (oov v30) {
                                                                                                                                            throw g7u.a(v30);
                                                                                                                                        }
                                                                                                                                        if (v29 != 0) break block117;
                                                                                                                                    }
                                                                                                                                    catch (oov v31) {
                                                                                                                                        throw g7u.a(v31);
                                                                                                                                    }
                                                                                                                                    v29 = var7_7;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    if (var3_5 != 0) break block119;
                                                                                                                                    if (v29 == 0) break block120;
                                                                                                                                }
                                                                                                                                catch (oov v32) {
                                                                                                                                    throw g7u.a(v32);
                                                                                                                                }
                                                                                                                                v29 = 2;
                                                                                                                                break block119;
                                                                                                                            }
                                                                                                                            v29 = 1;
                                                                                                                        }
                                                                                                                        return v29;
                                                                                                                    }
                                                                                                                    v26 = var10_10;
                                                                                                                    v27 = vt2.mxp;
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (v26 != v27) break block114;
                                                                                                                        v33 = g7u.xpr(var1_1, var2_2.z6x(), var4_3);
                                                                                                                        if (var3_5 != 0) break block121;
                                                                                                                    }
                                                                                                                    catch (oov v34) {
                                                                                                                        throw g7u.a(v34);
                                                                                                                    }
                                                                                                                    if (v33 != 0) break block114;
                                                                                                                }
                                                                                                                catch (oov v35) {
                                                                                                                    throw g7u.a(v35);
                                                                                                                }
                                                                                                                v33 = var7_7;
                                                                                                            }
                                                                                                            try {
                                                                                                                if (var3_5 != 0) break block122;
                                                                                                                if (v33 == 0) break block123;
                                                                                                            }
                                                                                                            catch (oov v36) {
                                                                                                                throw g7u.a(v36);
                                                                                                            }
                                                                                                            v33 = 1;
                                                                                                            break block122;
                                                                                                        }
                                                                                                        v33 = 2;
                                                                                                    }
                                                                                                    return v33;
                                                                                                }
                                                                                                try {
                                                                                                    if (var3_5 == 0) break block112;
lbl206:
                                                                                                    // 2 sources

                                                                                                    v2 = var5_4;
                                                                                                    v3 = vt2.mxp;
                                                                                                }
                                                                                                catch (oov v37) {
                                                                                                    throw g7u.a(v37);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (var3_5 != 0) break block124;
                                                                                                if (v2 == v3) {
                                                                                                }
                                                                                                ** GOTO lbl306
                                                                                            }
                                                                                            catch (oov v38) {
                                                                                                throw g7u.a(v38);
                                                                                            }
                                                                                            var8_8 = var1_1.getBlockState(var2_2.idu());
                                                                                            var9_9 = var8_8.r_y();
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (!g7u.x2k(var9_9)) break block125;
                                                                                                        v39 = var6_6;
                                                                                                        if (var3_5 != 0) break block126;
                                                                                                    }
                                                                                                    catch (oov v40) {
                                                                                                        throw g7u.a(v40);
                                                                                                    }
                                                                                                    if (v39 != var8_8.dil(g7u.ru8)) break block125;
                                                                                                }
                                                                                                catch (oov v41) {
                                                                                                    throw g7u.a(v41);
                                                                                                }
                                                                                                v39 = var8_8.dil(g7u.sxt);
                                                                                            }
                                                                                            catch (oov v42) {
                                                                                                throw g7u.a(v42);
                                                                                            }
                                                                                        }
                                                                                        var10_10 = (vt2)v39;
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v43 = var10_10;
                                                                                                    v44 = vt2.te4;
                                                                                                    if (var3_5 != 0) break block127;
                                                                                                    if (v43 != v44) break block128;
                                                                                                }
                                                                                                catch (oov v45) {
                                                                                                    throw g7u.a(v45);
                                                                                                }
                                                                                                v46 = g7u.xpr(var1_1, var2_2.y8e(), var4_3);
                                                                                                if (var3_5 != 0) break block129;
                                                                                            }
                                                                                            catch (oov v47) {
                                                                                                throw g7u.a(v47);
                                                                                            }
                                                                                            if (v46 != 0) break block128;
                                                                                        }
                                                                                        catch (oov v48) {
                                                                                            throw g7u.a(v48);
                                                                                        }
                                                                                        v46 = var7_7;
                                                                                    }
                                                                                    try {
                                                                                        if (var3_5 != 0) break block130;
                                                                                        if (v46 == 0) break block131;
                                                                                    }
                                                                                    catch (oov v49) {
                                                                                        throw g7u.a(v49);
                                                                                    }
                                                                                    v46 = 2;
                                                                                    break block130;
                                                                                }
                                                                                v46 = 1;
                                                                            }
                                                                            return v46;
                                                                        }
                                                                        v43 = var10_10;
                                                                        v44 = vt2.zk4;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (v43 != v44) break block125;
                                                                            v50 = g7u.xpr(var1_1, var2_2.o_8(), var4_3);
                                                                            if (var3_5 != 0) break block132;
                                                                        }
                                                                        catch (oov v51) {
                                                                            throw g7u.a(v51);
                                                                        }
                                                                        if (v50 != 0) break block125;
                                                                    }
                                                                    catch (oov v52) {
                                                                        throw g7u.a(v52);
                                                                    }
                                                                    v50 = var7_7;
                                                                }
                                                                try {
                                                                    if (var3_5 != 0) break block133;
                                                                    if (v50 == 0) break block134;
                                                                }
                                                                catch (oov v53) {
                                                                    throw g7u.a(v53);
                                                                }
                                                                v50 = 1;
                                                                break block133;
                                                            }
                                                            v50 = 2;
                                                        }
                                                        return v50;
                                                    }
                                                    try {
                                                        if (var3_5 == 0) break block112;
lbl306:
                                                        // 2 sources

                                                        v2 = var5_4;
                                                        v3 = vt2.z9q;
                                                    }
                                                    catch (oov v54) {
                                                        throw g7u.a(v54);
                                                    }
                                                }
                                                if (v2 != v3) break block112;
                                                var8_8 = var1_1.getBlockState(var2_2.z6x());
                                                var9_9 = var8_8.r_y();
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v55 = (int)g7u.x2k(var9_9);
                                                                if (var3_5 != 0) break block135;
                                                                if (v55 == 0) break block112;
                                                            }
                                                            catch (oov v56) {
                                                                throw g7u.a(v56);
                                                            }
                                                            v57 = var6_6;
                                                            if (var3_5 != 0) break block136;
                                                        }
                                                        catch (oov v58) {
                                                            throw g7u.a(v58);
                                                        }
                                                        if (v57 != var8_8.dil(g7u.ru8)) break block112;
                                                    }
                                                    catch (oov v59) {
                                                        throw g7u.a(v59);
                                                    }
                                                    v57 = var8_8.dil(g7u.sxt);
                                                }
                                                catch (oov v60) {
                                                    throw g7u.a(v60);
                                                }
                                            }
                                            var10_10 = (vt2)v57;
                                            try {
                                                try {
                                                    try {
                                                        v61 = var10_10;
                                                        v62 = vt2.te4;
                                                        if (var3_5 != 0) break block137;
                                                        if (v61 != v62) break block138;
                                                    }
                                                    catch (oov v63) {
                                                        throw g7u.a(v63);
                                                    }
                                                    v64 = g7u.xpr(var1_1, var2_2.y8e(), var4_3);
                                                    if (var3_5 != 0) break block139;
                                                }
                                                catch (oov v65) {
                                                    throw g7u.a(v65);
                                                }
                                                if (v64 != 0) break block138;
                                            }
                                            catch (oov v66) {
                                                throw g7u.a(v66);
                                            }
                                            v64 = var7_7;
                                        }
                                        try {
                                            if (var3_5 != 0) break block140;
                                            if (v64 == 0) break block141;
                                        }
                                        catch (oov v67) {
                                            throw g7u.a(v67);
                                        }
                                        v64 = 1;
                                        break block140;
                                    }
                                    v64 = 2;
                                }
                                return v64;
                            }
                            v61 = var10_10;
                            v62 = vt2.zk4;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (v61 != v62) break block112;
                                        v55 = (int)g7u.xpr(var1_1, var2_2.o_8(), var4_3);
                                        if (var3_5 != 0) break block135;
                                    }
                                    catch (oov v68) {
                                        throw g7u.a(v68);
                                    }
                                    if (v55 != 0) break block112;
                                }
                                catch (oov v69) {
                                    throw g7u.a(v69);
                                }
                                v70 = var7_7;
                                if (var3_5 != 0) break block142;
                            }
                            catch (oov v71) {
                                throw g7u.a(v71);
                            }
                            if (v70 == 0) break block143;
                        }
                        catch (oov v72) {
                            throw g7u.a(v72);
                        }
                        v70 = 2;
                        break block142;
                    }
                    v70 = 1;
                }
                return v70;
            }
            v55 = 0;
        }
        return v55;
    }

    /*
     * Unable to fully structure code
     */
    public boolean hl8(m5n var1_1, mew var2_2) {
        block122: {
            block109: {
                block124: {
                    block125: {
                        block123: {
                            block116: {
                                block117: {
                                    block121: {
                                        block119: {
                                            block120: {
                                                block118: {
                                                    block110: {
                                                        block111: {
                                                            block115: {
                                                                block113: {
                                                                    block114: {
                                                                        block112: {
                                                                            block103: {
                                                                                block104: {
                                                                                    block108: {
                                                                                        block106: {
                                                                                            block107: {
                                                                                                block105: {
                                                                                                    block102: {
                                                                                                        block101: {
                                                                                                            var4_3 = var1_1.getBlockState(var2_2);
                                                                                                            var5_4 = (vt2)var4_3.dil(g7u.sxt);
                                                                                                            var6_5 = (g7u$lrl)var4_3.dil(g7u.ru8);
                                                                                                            var3_6 = t9d.c();
                                                                                                            try {
                                                                                                                v0 = var6_5 == g7u$lrl.vvx;
                                                                                                            }
                                                                                                            catch (oov v1) {
                                                                                                                throw g7u.a(v1);
                                                                                                            }
                                                                                                            var7_7 = v0;
                                                                                                            var8_8 = 0.5f;
                                                                                                            var9_9 = 1.0f;
                                                                                                            try {
                                                                                                                if (var3_6 != 0) break block101;
                                                                                                                if (!var7_7) break block102;
                                                                                                            }
                                                                                                            catch (oov v2) {
                                                                                                                throw g7u.a(v2);
                                                                                                            }
                                                                                                            var8_8 = 0.0f;
                                                                                                        }
                                                                                                        var9_9 = 0.5f;
                                                                                                    }
                                                                                                    var10_10 = 0.0f;
                                                                                                    var11_11 = 1.0f;
                                                                                                    var12_12 = 0.0f;
                                                                                                    var13_13 = 0.5f;
                                                                                                    var14_14 = true;
                                                                                                    try {
                                                                                                        v3 = var5_4;
                                                                                                        v4 = vt2.zk4;
                                                                                                        if (var3_6 != 0) break block103;
                                                                                                        if (v3 == v4) {
                                                                                                        }
                                                                                                        ** GOTO lbl114
                                                                                                    }
                                                                                                    catch (oov v5) {
                                                                                                        throw g7u.a(v5);
                                                                                                    }
                                                                                                    var10_10 = 0.5f;
                                                                                                    var13_13 = 1.0f;
                                                                                                    var15_15 = var1_1.getBlockState(var2_2.o_8());
                                                                                                    var16_16 = var15_15.r_y();
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (!g7u.x2k(var16_16)) break block104;
                                                                                                                v6 = var6_5;
                                                                                                                if (var3_6 != 0) break block105;
                                                                                                            }
                                                                                                            catch (oov v7) {
                                                                                                                throw g7u.a(v7);
                                                                                                            }
                                                                                                            if (v6 != var15_15.dil(g7u.ru8)) break block104;
                                                                                                        }
                                                                                                        catch (oov v8) {
                                                                                                            throw g7u.a(v8);
                                                                                                        }
                                                                                                        v6 = var15_15.dil(g7u.sxt);
                                                                                                    }
                                                                                                    catch (oov v9) {
                                                                                                        throw g7u.a(v9);
                                                                                                    }
                                                                                                }
                                                                                                var17_17 = (vt2)v6;
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v10 = var17_17;
                                                                                                            v11 = vt2.z9q;
                                                                                                            if (var3_6 != 0) break block106;
                                                                                                            if (v10 == v11) {
                                                                                                            }
                                                                                                            ** GOTO lbl89
                                                                                                        }
                                                                                                        catch (oov v12) {
                                                                                                            throw g7u.a(v12);
                                                                                                        }
                                                                                                        v13 = g7u.xpr(var1_1, var2_2.z6x(), var4_3);
                                                                                                        if (var3_6 != 0) break block107;
                                                                                                    }
                                                                                                    catch (oov v14) {
                                                                                                        throw g7u.a(v14);
                                                                                                    }
                                                                                                    if (!v13) {
                                                                                                    }
                                                                                                    ** GOTO lbl89
                                                                                                }
                                                                                                catch (oov v15) {
                                                                                                    throw g7u.a(v15);
                                                                                                }
                                                                                                var13_13 = 0.5f;
                                                                                                v13 = false;
                                                                                            }
                                                                                            var14_14 = v13;
                                                                                            try {
                                                                                                if (var3_6 == 0) break block104;
lbl89:
                                                                                                // 3 sources

                                                                                                v10 = var17_17;
                                                                                                v11 = vt2.mxp;
                                                                                            }
                                                                                            catch (oov v16) {
                                                                                                throw g7u.a(v16);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (v10 != v11) break block104;
                                                                                                v17 = g7u.xpr(var1_1, var2_2.idu(), var4_3);
                                                                                                if (var3_6 != 0) break block108;
                                                                                            }
                                                                                            catch (oov v18) {
                                                                                                throw g7u.a(v18);
                                                                                            }
                                                                                            if (v17) break block104;
                                                                                        }
                                                                                        catch (oov v19) {
                                                                                            throw g7u.a(v19);
                                                                                        }
                                                                                        var12_12 = 0.5f;
                                                                                        v17 = false;
                                                                                    }
                                                                                    var14_14 = v17;
                                                                                }
                                                                                try {
                                                                                    if (var3_6 == 0) break block109;
lbl114:
                                                                                    // 2 sources

                                                                                    v3 = var5_4;
                                                                                    v4 = vt2.te4;
                                                                                }
                                                                                catch (oov v20) {
                                                                                    throw g7u.a(v20);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (var3_6 != 0) break block110;
                                                                                if (v3 == v4) {
                                                                                }
                                                                                ** GOTO lbl202
                                                                            }
                                                                            catch (oov v21) {
                                                                                throw g7u.a(v21);
                                                                            }
                                                                            var11_11 = 0.5f;
                                                                            var13_13 = 1.0f;
                                                                            var15_15 = var1_1.getBlockState(var2_2.y8e());
                                                                            var16_16 = var15_15.r_y();
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (!g7u.x2k(var16_16)) break block111;
                                                                                        v22 = var6_5;
                                                                                        if (var3_6 != 0) break block112;
                                                                                    }
                                                                                    catch (oov v23) {
                                                                                        throw g7u.a(v23);
                                                                                    }
                                                                                    if (v22 != var15_15.dil(g7u.ru8)) break block111;
                                                                                }
                                                                                catch (oov v24) {
                                                                                    throw g7u.a(v24);
                                                                                }
                                                                                v22 = var15_15.dil(g7u.sxt);
                                                                            }
                                                                            catch (oov v25) {
                                                                                throw g7u.a(v25);
                                                                            }
                                                                        }
                                                                        var17_17 = (vt2)v22;
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v26 = var17_17;
                                                                                    v27 = vt2.z9q;
                                                                                    if (var3_6 != 0) break block113;
                                                                                    if (v26 == v27) {
                                                                                    }
                                                                                    ** GOTO lbl177
                                                                                }
                                                                                catch (oov v28) {
                                                                                    throw g7u.a(v28);
                                                                                }
                                                                                v29 = g7u.xpr(var1_1, var2_2.z6x(), var4_3);
                                                                                if (var3_6 != 0) break block114;
                                                                            }
                                                                            catch (oov v30) {
                                                                                throw g7u.a(v30);
                                                                            }
                                                                            if (!v29) {
                                                                            }
                                                                            ** GOTO lbl177
                                                                        }
                                                                        catch (oov v31) {
                                                                            throw g7u.a(v31);
                                                                        }
                                                                        var13_13 = 0.5f;
                                                                        v29 = false;
                                                                    }
                                                                    var14_14 = v29;
                                                                    try {
                                                                        if (var3_6 == 0) break block111;
lbl177:
                                                                        // 3 sources

                                                                        v26 = var17_17;
                                                                        v27 = vt2.mxp;
                                                                    }
                                                                    catch (oov v32) {
                                                                        throw g7u.a(v32);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (v26 != v27) break block111;
                                                                        v33 = g7u.xpr(var1_1, var2_2.idu(), var4_3);
                                                                        if (var3_6 != 0) break block115;
                                                                    }
                                                                    catch (oov v34) {
                                                                        throw g7u.a(v34);
                                                                    }
                                                                    if (v33) break block111;
                                                                }
                                                                catch (oov v35) {
                                                                    throw g7u.a(v35);
                                                                }
                                                                var12_12 = 0.5f;
                                                                v33 = false;
                                                            }
                                                            var14_14 = v33;
                                                        }
                                                        try {
                                                            if (var3_6 == 0) break block109;
lbl202:
                                                            // 2 sources

                                                            v3 = var5_4;
                                                            v4 = vt2.mxp;
                                                        }
                                                        catch (oov v36) {
                                                            throw g7u.a(v36);
                                                        }
                                                    }
                                                    try {
                                                        if (var3_6 != 0) break block116;
                                                        if (v3 == v4) {
                                                        }
                                                        ** GOTO lbl290
                                                    }
                                                    catch (oov v37) {
                                                        throw g7u.a(v37);
                                                    }
                                                    var12_12 = 0.5f;
                                                    var13_13 = 1.0f;
                                                    var15_15 = var1_1.getBlockState(var2_2.z6x());
                                                    var16_16 = var15_15.r_y();
                                                    try {
                                                        try {
                                                            try {
                                                                if (!g7u.x2k(var16_16)) break block117;
                                                                v38 = var6_5;
                                                                if (var3_6 != 0) break block118;
                                                            }
                                                            catch (oov v39) {
                                                                throw g7u.a(v39);
                                                            }
                                                            if (v38 != var15_15.dil(g7u.ru8)) break block117;
                                                        }
                                                        catch (oov v40) {
                                                            throw g7u.a(v40);
                                                        }
                                                        v38 = var15_15.dil(g7u.sxt);
                                                    }
                                                    catch (oov v41) {
                                                        throw g7u.a(v41);
                                                    }
                                                }
                                                var17_17 = (vt2)v38;
                                                try {
                                                    try {
                                                        try {
                                                            v42 = var17_17;
                                                            v43 = vt2.te4;
                                                            if (var3_6 != 0) break block119;
                                                            if (v42 == v43) {
                                                            }
                                                            ** GOTO lbl265
                                                        }
                                                        catch (oov v44) {
                                                            throw g7u.a(v44);
                                                        }
                                                        v45 = g7u.xpr(var1_1, var2_2.o_8(), var4_3);
                                                        if (var3_6 != 0) break block120;
                                                    }
                                                    catch (oov v46) {
                                                        throw g7u.a(v46);
                                                    }
                                                    if (!v45) {
                                                    }
                                                    ** GOTO lbl265
                                                }
                                                catch (oov v47) {
                                                    throw g7u.a(v47);
                                                }
                                                var11_11 = 0.5f;
                                                v45 = false;
                                            }
                                            var14_14 = v45;
                                            try {
                                                if (var3_6 == 0) break block117;
lbl265:
                                                // 3 sources

                                                v42 = var17_17;
                                                v43 = vt2.zk4;
                                            }
                                            catch (oov v48) {
                                                throw g7u.a(v48);
                                            }
                                        }
                                        try {
                                            try {
                                                if (v42 != v43) break block117;
                                                v49 = g7u.xpr(var1_1, var2_2.y8e(), var4_3);
                                                if (var3_6 != 0) break block121;
                                            }
                                            catch (oov v50) {
                                                throw g7u.a(v50);
                                            }
                                            if (v49) break block117;
                                        }
                                        catch (oov v51) {
                                            throw g7u.a(v51);
                                        }
                                        var10_10 = 0.5f;
                                        v49 = false;
                                    }
                                    var14_14 = v49;
                                }
                                try {
                                    if (var3_6 == 0) break block109;
lbl290:
                                    // 2 sources

                                    v3 = var5_4;
                                    v4 = vt2.z9q;
                                }
                                catch (oov v52) {
                                    throw g7u.a(v52);
                                }
                            }
                            if (v3 != v4) break block109;
                            var15_15 = var1_1.getBlockState(var2_2.idu());
                            var16_16 = var15_15.r_y();
                            try {
                                try {
                                    try {
                                        try {
                                            v53 = g7u.x2k(var16_16);
                                            if (var3_6 != 0) break block122;
                                            if (!v53) break block109;
                                        }
                                        catch (oov v54) {
                                            throw g7u.a(v54);
                                        }
                                        v55 = var6_5;
                                        if (var3_6 != 0) break block123;
                                    }
                                    catch (oov v56) {
                                        throw g7u.a(v56);
                                    }
                                    if (v55 != var15_15.dil(g7u.ru8)) break block109;
                                }
                                catch (oov v57) {
                                    throw g7u.a(v57);
                                }
                                v55 = var15_15.dil(g7u.sxt);
                            }
                            catch (oov v58) {
                                throw g7u.a(v58);
                            }
                        }
                        var17_17 = (vt2)v55;
                        try {
                            try {
                                try {
                                    v59 = var17_17;
                                    v60 = vt2.te4;
                                    if (var3_6 != 0) break block124;
                                    if (v59 == v60) {
                                    }
                                    ** GOTO lbl351
                                }
                                catch (oov v61) {
                                    throw g7u.a(v61);
                                }
                                v62 = g7u.xpr(var1_1, var2_2.o_8(), var4_3);
                                if (var3_6 != 0) break block125;
                            }
                            catch (oov v63) {
                                throw g7u.a(v63);
                            }
                            if (!v62) {
                            }
                            ** GOTO lbl351
                        }
                        catch (oov v64) {
                            throw g7u.a(v64);
                        }
                        var11_11 = 0.5f;
                        v62 = false;
                    }
                    var14_14 = v62;
                    try {
                        if (var3_6 == 0) break block109;
lbl351:
                        // 3 sources

                        v59 = var17_17;
                        v60 = vt2.zk4;
                    }
                    catch (oov v65) {
                        throw g7u.a(v65);
                    }
                }
                try {
                    try {
                        if (v59 != v60) break block109;
                        v53 = g7u.xpr(var1_1, var2_2.y8e(), var4_3);
                        if (var3_6 != 0) break block122;
                    }
                    catch (oov v66) {
                        throw g7u.a(v66);
                    }
                    if (v53) break block109;
                }
                catch (oov v67) {
                    throw g7u.a(v67);
                }
                var10_10 = 0.5f;
                var14_14 = false;
            }
            this.xl4(var10_10, var8_8, var12_12, var11_11, var9_9, var13_13);
            v53 = var14_14;
        }
        return v53;
    }

    /*
     * Unable to fully structure code
     */
    public boolean j1h(m5n var1_1, mew var2_2) {
        block126: {
            block127: {
                block122: {
                    block109: {
                        block124: {
                            block125: {
                                block123: {
                                    block116: {
                                        block117: {
                                            block121: {
                                                block119: {
                                                    block120: {
                                                        block118: {
                                                            block110: {
                                                                block111: {
                                                                    block115: {
                                                                        block113: {
                                                                            block114: {
                                                                                block112: {
                                                                                    block103: {
                                                                                        block104: {
                                                                                            block108: {
                                                                                                block106: {
                                                                                                    block107: {
                                                                                                        block105: {
                                                                                                            block102: {
                                                                                                                block101: {
                                                                                                                    var4_3 = var1_1.getBlockState(var2_2);
                                                                                                                    var5_4 = (vt2)var4_3.dil(g7u.sxt);
                                                                                                                    var6_5 = (g7u$lrl)var4_3.dil(g7u.ru8);
                                                                                                                    var3_6 = t9d.b();
                                                                                                                    try {
                                                                                                                        v0 = var6_5 == g7u$lrl.vvx;
                                                                                                                    }
                                                                                                                    catch (oov v1) {
                                                                                                                        throw g7u.a(v1);
                                                                                                                    }
                                                                                                                    var7_7 = v0;
                                                                                                                    var8_8 = 0.5f;
                                                                                                                    var9_9 = 1.0f;
                                                                                                                    try {
                                                                                                                        if (var3_6 == 0) break block101;
                                                                                                                        if (!var7_7) break block102;
                                                                                                                    }
                                                                                                                    catch (oov v2) {
                                                                                                                        throw g7u.a(v2);
                                                                                                                    }
                                                                                                                    var8_8 = 0.0f;
                                                                                                                }
                                                                                                                var9_9 = 0.5f;
                                                                                                            }
                                                                                                            var10_10 = 0.0f;
                                                                                                            var11_11 = 0.5f;
                                                                                                            var12_12 = 0.5f;
                                                                                                            var13_13 = 1.0f;
                                                                                                            var14_14 = false;
                                                                                                            try {
                                                                                                                v3 = var5_4;
                                                                                                                v4 = vt2.zk4;
                                                                                                                if (var3_6 == 0) break block103;
                                                                                                                if (v3 == v4) {
                                                                                                                }
                                                                                                                ** GOTO lbl116
                                                                                                            }
                                                                                                            catch (oov v5) {
                                                                                                                throw g7u.a(v5);
                                                                                                            }
                                                                                                            var15_15 = var1_1.getBlockState(var2_2.y8e());
                                                                                                            var16_16 = var15_15.r_y();
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (!g7u.x2k(var16_16)) break block104;
                                                                                                                        v6 = var6_5;
                                                                                                                        if (var3_6 == 0) break block105;
                                                                                                                    }
                                                                                                                    catch (oov v7) {
                                                                                                                        throw g7u.a(v7);
                                                                                                                    }
                                                                                                                    if (v6 != var15_15.dil(g7u.ru8)) break block104;
                                                                                                                }
                                                                                                                catch (oov v8) {
                                                                                                                    throw g7u.a(v8);
                                                                                                                }
                                                                                                                v6 = var15_15.dil(g7u.sxt);
                                                                                                            }
                                                                                                            catch (oov v9) {
                                                                                                                throw g7u.a(v9);
                                                                                                            }
                                                                                                        }
                                                                                                        var17_17 = (vt2)v6;
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    v10 = var17_17;
                                                                                                                    v11 = vt2.z9q;
                                                                                                                    if (var3_6 == 0) break block106;
                                                                                                                    if (v10 == v11) {
                                                                                                                    }
                                                                                                                    ** GOTO lbl90
                                                                                                                }
                                                                                                                catch (oov v12) {
                                                                                                                    throw g7u.a(v12);
                                                                                                                }
                                                                                                                v13 = g7u.xpr(var1_1, var2_2.idu(), var4_3);
                                                                                                                if (var3_6 == 0) break block107;
                                                                                                            }
                                                                                                            catch (oov v14) {
                                                                                                                throw g7u.a(v14);
                                                                                                            }
                                                                                                            if (!v13) {
                                                                                                            }
                                                                                                            ** GOTO lbl90
                                                                                                        }
                                                                                                        catch (oov v15) {
                                                                                                            throw g7u.a(v15);
                                                                                                        }
                                                                                                        var12_12 = 0.0f;
                                                                                                        var13_13 = 0.5f;
                                                                                                        v13 = true;
                                                                                                    }
                                                                                                    var14_14 = v13;
                                                                                                    try {
                                                                                                        if (var3_6 != 0) break block104;
lbl90:
                                                                                                        // 3 sources

                                                                                                        v10 = var17_17;
                                                                                                        v11 = vt2.mxp;
                                                                                                    }
                                                                                                    catch (oov v16) {
                                                                                                        throw g7u.a(v16);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (v10 != v11) break block104;
                                                                                                        v17 = g7u.xpr(var1_1, var2_2.z6x(), var4_3);
                                                                                                        if (var3_6 == 0) break block108;
                                                                                                    }
                                                                                                    catch (oov v18) {
                                                                                                        throw g7u.a(v18);
                                                                                                    }
                                                                                                    if (v17) break block104;
                                                                                                }
                                                                                                catch (oov v19) {
                                                                                                    throw g7u.a(v19);
                                                                                                }
                                                                                                var12_12 = 0.5f;
                                                                                                var13_13 = 1.0f;
                                                                                                v17 = true;
                                                                                            }
                                                                                            var14_14 = v17;
                                                                                        }
                                                                                        try {
                                                                                            if (var3_6 != 0) break block109;
lbl116:
                                                                                            // 2 sources

                                                                                            v3 = var5_4;
                                                                                            v4 = vt2.te4;
                                                                                        }
                                                                                        catch (oov v20) {
                                                                                            throw g7u.a(v20);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (var3_6 == 0) break block110;
                                                                                        if (v3 == v4) {
                                                                                        }
                                                                                        ** GOTO lbl203
                                                                                    }
                                                                                    catch (oov v21) {
                                                                                        throw g7u.a(v21);
                                                                                    }
                                                                                    var15_15 = var1_1.getBlockState(var2_2.o_8());
                                                                                    var16_16 = var15_15.r_y();
                                                                                    try {
                                                                                        try {
                                                                                            if (!g7u.x2k(var16_16)) break block111;
                                                                                            v22 = var6_5;
                                                                                            if (var3_6 == 0) break block112;
                                                                                        }
                                                                                        catch (oov v23) {
                                                                                            throw g7u.a(v23);
                                                                                        }
                                                                                        if (v22 != var15_15.dil(g7u.ru8)) break block111;
                                                                                    }
                                                                                    catch (oov v24) {
                                                                                        throw g7u.a(v24);
                                                                                    }
                                                                                    var10_10 = 0.5f;
                                                                                    var11_11 = 1.0f;
                                                                                    v22 = var15_15.dil(g7u.sxt);
                                                                                }
                                                                                var17_17 = (vt2)v22;
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v25 = var17_17;
                                                                                            v26 = vt2.z9q;
                                                                                            if (var3_6 == 0) break block113;
                                                                                            if (v25 == v26) {
                                                                                            }
                                                                                            ** GOTO lbl177
                                                                                        }
                                                                                        catch (oov v27) {
                                                                                            throw g7u.a(v27);
                                                                                        }
                                                                                        v28 = g7u.xpr(var1_1, var2_2.idu(), var4_3);
                                                                                        if (var3_6 == 0) break block114;
                                                                                    }
                                                                                    catch (oov v29) {
                                                                                        throw g7u.a(v29);
                                                                                    }
                                                                                    if (!v28) {
                                                                                    }
                                                                                    ** GOTO lbl177
                                                                                }
                                                                                catch (oov v30) {
                                                                                    throw g7u.a(v30);
                                                                                }
                                                                                var12_12 = 0.0f;
                                                                                var13_13 = 0.5f;
                                                                                v28 = true;
                                                                            }
                                                                            var14_14 = v28;
                                                                            try {
                                                                                if (var3_6 != 0) break block111;
lbl177:
                                                                                // 3 sources

                                                                                v25 = var17_17;
                                                                                v26 = vt2.mxp;
                                                                            }
                                                                            catch (oov v31) {
                                                                                throw g7u.a(v31);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (v25 != v26) break block111;
                                                                                v32 = g7u.xpr(var1_1, var2_2.z6x(), var4_3);
                                                                                if (var3_6 == 0) break block115;
                                                                            }
                                                                            catch (oov v33) {
                                                                                throw g7u.a(v33);
                                                                            }
                                                                            if (v32) break block111;
                                                                        }
                                                                        catch (oov v34) {
                                                                            throw g7u.a(v34);
                                                                        }
                                                                        var12_12 = 0.5f;
                                                                        var13_13 = 1.0f;
                                                                        v32 = true;
                                                                    }
                                                                    var14_14 = v32;
                                                                }
                                                                try {
                                                                    if (var3_6 != 0) break block109;
lbl203:
                                                                    // 2 sources

                                                                    v3 = var5_4;
                                                                    v4 = vt2.mxp;
                                                                }
                                                                catch (oov v35) {
                                                                    throw g7u.a(v35);
                                                                }
                                                            }
                                                            try {
                                                                if (var3_6 == 0) break block116;
                                                                if (v3 == v4) {
                                                                }
                                                                ** GOTO lbl288
                                                            }
                                                            catch (oov v36) {
                                                                throw g7u.a(v36);
                                                            }
                                                            var15_15 = var1_1.getBlockState(var2_2.idu());
                                                            var16_16 = var15_15.r_y();
                                                            try {
                                                                try {
                                                                    if (!g7u.x2k(var16_16)) break block117;
                                                                    v37 = var6_5;
                                                                    if (var3_6 == 0) break block118;
                                                                }
                                                                catch (oov v38) {
                                                                    throw g7u.a(v38);
                                                                }
                                                                if (v37 != var15_15.dil(g7u.ru8)) break block117;
                                                            }
                                                            catch (oov v39) {
                                                                throw g7u.a(v39);
                                                            }
                                                            var12_12 = 0.0f;
                                                            var13_13 = 0.5f;
                                                            v37 = var15_15.dil(g7u.sxt);
                                                        }
                                                        var17_17 = (vt2)v37;
                                                        try {
                                                            try {
                                                                try {
                                                                    v40 = var17_17;
                                                                    v41 = vt2.te4;
                                                                    if (var3_6 == 0) break block119;
                                                                    if (v40 == v41) {
                                                                    }
                                                                    ** GOTO lbl262
                                                                }
                                                                catch (oov v42) {
                                                                    throw g7u.a(v42);
                                                                }
                                                                v43 = g7u.xpr(var1_1, var2_2.y8e(), var4_3);
                                                                if (var3_6 == 0) break block120;
                                                            }
                                                            catch (oov v44) {
                                                                throw g7u.a(v44);
                                                            }
                                                            if (!v43) {
                                                            }
                                                            ** GOTO lbl262
                                                        }
                                                        catch (oov v45) {
                                                            throw g7u.a(v45);
                                                        }
                                                        v43 = true;
                                                    }
                                                    var14_14 = v43;
                                                    try {
                                                        if (var3_6 != 0) break block117;
lbl262:
                                                        // 3 sources

                                                        v40 = var17_17;
                                                        v41 = vt2.zk4;
                                                    }
                                                    catch (oov v46) {
                                                        throw g7u.a(v46);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (v40 != v41) break block117;
                                                        v47 = g7u.xpr(var1_1, var2_2.o_8(), var4_3);
                                                        if (var3_6 == 0) break block121;
                                                    }
                                                    catch (oov v48) {
                                                        throw g7u.a(v48);
                                                    }
                                                    if (v47) break block117;
                                                }
                                                catch (oov v49) {
                                                    throw g7u.a(v49);
                                                }
                                                var10_10 = 0.5f;
                                                var11_11 = 1.0f;
                                                v47 = true;
                                            }
                                            var14_14 = v47;
                                        }
                                        try {
                                            if (var3_6 != 0) break block109;
lbl288:
                                            // 2 sources

                                            v3 = var5_4;
                                            v4 = vt2.z9q;
                                        }
                                        catch (oov v50) {
                                            throw g7u.a(v50);
                                        }
                                    }
                                    if (v3 != v4) break block109;
                                    var15_15 = var1_1.getBlockState(var2_2.z6x());
                                    var16_16 = var15_15.r_y();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v51 = g7u.x2k(var16_16);
                                                    if (var3_6 == 0) break block122;
                                                    if (!v51) break block109;
                                                }
                                                catch (oov v52) {
                                                    throw g7u.a(v52);
                                                }
                                                v53 = var6_5;
                                                if (var3_6 == 0) break block123;
                                            }
                                            catch (oov v54) {
                                                throw g7u.a(v54);
                                            }
                                            if (v53 != var15_15.dil(g7u.ru8)) break block109;
                                        }
                                        catch (oov v55) {
                                            throw g7u.a(v55);
                                        }
                                        v53 = var15_15.dil(g7u.sxt);
                                    }
                                    catch (oov v56) {
                                        throw g7u.a(v56);
                                    }
                                }
                                var17_17 = (vt2)v53;
                                try {
                                    try {
                                        try {
                                            v57 = var17_17;
                                            v58 = vt2.te4;
                                            if (var3_6 == 0) break block124;
                                            if (v57 == v58) {
                                            }
                                            ** GOTO lbl348
                                        }
                                        catch (oov v59) {
                                            throw g7u.a(v59);
                                        }
                                        v60 = g7u.xpr(var1_1, var2_2.y8e(), var4_3);
                                        if (var3_6 == 0) break block125;
                                    }
                                    catch (oov v61) {
                                        throw g7u.a(v61);
                                    }
                                    if (!v60) {
                                    }
                                    ** GOTO lbl348
                                }
                                catch (oov v62) {
                                    throw g7u.a(v62);
                                }
                                v60 = true;
                            }
                            var14_14 = v60;
                            try {
                                if (var3_6 != 0) break block109;
lbl348:
                                // 3 sources

                                v57 = var17_17;
                                v58 = vt2.zk4;
                            }
                            catch (oov v63) {
                                throw g7u.a(v63);
                            }
                        }
                        try {
                            try {
                                if (v57 != v58) break block109;
                                v51 = g7u.xpr(var1_1, var2_2.o_8(), var4_3);
                                if (var3_6 == 0) break block122;
                            }
                            catch (oov v64) {
                                throw g7u.a(v64);
                            }
                            if (v51) break block109;
                        }
                        catch (oov v65) {
                            throw g7u.a(v65);
                        }
                        var10_10 = 0.5f;
                        var11_11 = 1.0f;
                        var14_14 = true;
                    }
                    v51 = var14_14;
                }
                try {
                    try {
                        if (var3_6 == 0) break block126;
                        if (!v51) break block127;
                    }
                    catch (oov v66) {
                        throw g7u.a(v66);
                    }
                    this.xl4(var10_10, var8_8, var12_12, var11_11, var9_9, var13_13);
                }
                catch (oov v67) {
                    throw g7u.a(v67);
                }
            }
            v51 = var14_14;
        }
        return v51;
    }

    @Override
    public void c76(t9d t9d2, mew mew2, zfz zfz2, nh4 nh42, List list, i2h i2h2) {
        block8: {
            g7u g7u2;
            block10: {
                block9: {
                    this.gjc(t9d2, mew2);
                    int n = t9d.b();
                    super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
                    int n2 = n;
                    boolean bl = this.hl8(t9d2, mew2);
                    try {
                        try {
                            try {
                                try {
                                    super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
                                    if (n2 == 0) break block8;
                                    if (!bl) break block9;
                                }
                                catch (oov oov2) {
                                    throw g7u.a(oov2);
                                }
                                g7u2 = this;
                                if (n2 == 0) break block10;
                            }
                            catch (oov oov3) {
                                throw g7u.a(oov3);
                            }
                            if (!g7u2.j1h(t9d2, mew2)) break block9;
                        }
                        catch (oov oov4) {
                            throw g7u.a(oov4);
                        }
                        super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
                    }
                    catch (oov oov5) {
                        throw g7u.a(oov5);
                    }
                }
                g7u2 = this;
            }
            g7u2.xl4(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public void kyo(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        this.yk1.kyo(t9d2, mew2, zfz2, random);
    }

    @Override
    public void uqb(t9d t9d2, mew mew2, ha9 ha92) {
        this.yk1.uqb(t9d2, mew2, ha92);
    }

    @Override
    public void bf0(t9d t9d2, mew mew2, zfz zfz2) {
        this.yk1.bf0(t9d2, mew2, zfz2);
    }

    @Override
    public int pil(m5n m5n2, mew mew2) {
        return this.yk1.pil(m5n2, mew2);
    }

    @Override
    public float aok(i2h i2h2) {
        return this.yk1.aok(i2h2);
    }

    @Override
    public w51 w3x() {
        return this.yk1.w3x();
    }

    @Override
    public int odp(t9d t9d2) {
        return this.yk1.odp(t9d2);
    }

    @Override
    public nh4 j54(t9d t9d2, mew mew2) {
        return this.yk1.j54(t9d2, mew2);
    }

    @Override
    public fqr efx(t9d t9d2, mew mew2, i2h i2h2, fqr fqr2) {
        return this.yk1.efx(t9d2, mew2, i2h2, fqr2);
    }

    @Override
    public boolean siy() {
        return this.yk1.siy();
    }

    @Override
    public boolean qc_(zfz zfz2, boolean bl) {
        return this.yk1.qc_(zfz2, bl);
    }

    @Override
    public boolean ctq(t9d t9d2, mew mew2) {
        return this.yk1.ctq(t9d2, mew2);
    }

    @Override
    public void tfc(t9d t9d2, mew mew2, zfz zfz2) {
        this.z3l(t9d2, mew2, this.j61, ox_.ibw);
        this.yk1.tfc(t9d2, mew2, this.j61);
    }

    @Override
    public void b8f(t9d t9d2, mew mew2, zfz zfz2) {
        this.yk1.b8f(t9d2, mew2, this.j61);
    }

    @Override
    public void xqy(t9d t9d2, mew mew2, i2h i2h2) {
        this.yk1.xqy(t9d2, mew2, i2h2);
    }

    @Override
    public void zvy(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        this.yk1.zvy(t9d2, mew2, zfz2, random);
    }

    @Override
    public boolean cl2(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92, vt2 vt22, float f, float f2, float f3) {
        return this.yk1.cl2(t9d2, mew2, this.j61, ha92, vt2.m3r, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a4c(t9d t9d2, mew mew2, vu6 vu62) {
        this.yk1.a4c(t9d2, mew2, vu62);
    }

    @Override
    public _mi uoz(zfz zfz2) {
        return this.yk1.uoz(this.j61);
    }

    @Override
    public zfz qk_(t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3, int n, g_3 g_32) {
        zfz zfz2;
        block9: {
            int n2 = t9d.c();
            zfz zfz3 = super.qk_(t9d2, mew2, vt22, f, f2, f3, n, g_32);
            zfz zfz4 = zfz3.zvi(sxt, (Comparable)((Object)g_32.u0f())).zvi(vjy, (Comparable)((Object)g7u$qmc.rn9));
            if (n2 == 0) {
                block7: {
                    zfz3 = zfz4;
                    try {
                        block8: {
                            try {
                                try {
                                    if (vt22 == vt2.m3r) break block7;
                                    if (vt22 == vt2.rf3) break block8;
                                }
                                catch (oov oov2) {
                                    throw g7u.a(oov2);
                                }
                                if (!((double)f2 <= 0.5)) break block7;
                            }
                            catch (oov oov3) {
                                throw g7u.a(oov3);
                            }
                        }
                        zfz2 = zfz3.zvi(ru8, (Comparable)((Object)g7u$lrl.ow0));
                        break block9;
                    }
                    catch (oov oov4) {
                        throw g7u.a(oov4);
                    }
                }
                zfz4 = zfz3;
            }
            zfz2 = zfz4.zvi(ru8, (Comparable)((Object)g7u$lrl.vvx));
        }
        return zfz2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public akm mns(t9d t9d2, mew mew2, fqr fqr2, fqr fqr3) {
        akm akm2;
        block25: {
            void var11_15;
            int[] nArray;
            int n;
            akm[] akmArray;
            block22: {
                void object2;
                int n2;
                int n3;
                int[][] nArray2;
                block19: {
                    block20: {
                        int n4;
                        akmArray = new akm[8];
                        zfz zfz2 = t9d2.getBlockState(mew2);
                        n = t9d.b();
                        int n5 = ((vt2)((Object)zfz2.dil(sxt))).tmy();
                        try {
                            n4 = zfz2.dil(ru8) == g7u$lrl.vvx ? 1 : 0;
                        }
                        catch (oov oov2) {
                            throw g7u.a(oov2);
                        }
                        int n6 = n4;
                        try {
                            nArray2 = sgn;
                            n3 = n5;
                            n2 = n6;
                            if (n == 0) break block19;
                            if (n2 == 0) break block20;
                        }
                        catch (oov oov3) {
                            throw g7u.a(oov3);
                        }
                        n2 = 4;
                        break block19;
                    }
                    n2 = 0;
                }
                int[] nArray3 = nArray2[n3 + n2];
                this.wdb = true;
                boolean n7 = false;
                while (object2 < 8) {
                    block21: {
                        block23: {
                            try {
                                try {
                                    try {
                                        this.xmj = object2;
                                        if (n == 0) break block21;
                                        nArray = nArray3;
                                        if (n == 0) break block22;
                                    }
                                    catch (oov oov4) {
                                        throw g7u.a(oov4);
                                    }
                                    if (Arrays.binarySearch(nArray, (int)object2) >= 0) break block23;
                                }
                                catch (oov oov5) {
                                    throw g7u.a(oov5);
                                }
                                akmArray[object2] = super.mns(t9d2, mew2, fqr2, fqr3);
                            }
                            catch (oov oov6) {
                                throw g7u.a(oov6);
                            }
                        }
                        ++object2;
                    }
                    if (n != 0) continue;
                }
                nArray = nArray3;
            }
            for (int n5 : nArray) {
                akmArray[n5] = null;
                if (n != 0) continue;
            }
            Object var11_14 = null;
            double d = 0.0;
            akm[] akmArray2 = akmArray;
            int n6 = akmArray2.length;
            int n7 = 0;
            while (n7 < n6) {
                block24: {
                    block26: {
                        akm akm3 = akmArray2[n7];
                        try {
                            try {
                                if (n == 0) break block24;
                                akm2 = akm3;
                                if (n == 0) break block25;
                            }
                            catch (oov oov7) {
                                throw g7u.a(oov7);
                            }
                            if (akm2 == null) break block26;
                        }
                        catch (oov oov8) {
                            throw g7u.a(oov8);
                        }
                        double d2 = akm3.jhn.y8x(fqr3);
                        try {
                            if (n == 0) break block24;
                            if (!(d2 > d)) break block26;
                        }
                        catch (oov oov9) {
                            throw g7u.a(oov9);
                        }
                        akm akm4 = akm3;
                        d = d2;
                    }
                    ++n7;
                }
                if (n != 0) continue;
            }
            akm2 = var11_15;
        }
        return akm2;
    }

    @Override
    public zfz kig(int n) {
        g7u$lrl g7u$lrl;
        zb_ zb_2;
        zfz zfz2;
        try {
            zfz2 = this.l4i();
            zb_2 = ru8;
            g7u$lrl = (n & 4) > 0 ? g7u$lrl.vvx : g7u$lrl.ow0;
        }
        catch (oov oov2) {
            throw g7u.a(oov2);
        }
        zfz zfz3 = zfz2.zvi(zb_2, (Comparable)((Object)g7u$lrl));
        zfz3 = zfz3.zvi(sxt, (Comparable)((Object)vt2.jw6(5 - (n & 3))));
        return zfz3;
    }

    @Override
    public int hvp(zfz zfz2) {
        int n;
        block2: {
            block3: {
                int n2 = t9d.b();
                n = 0;
                try {
                    if (n2 == 0) break block2;
                    if (zfz2.dil(ru8) != g7u$lrl.vvx) break block3;
                }
                catch (oov oov2) {
                    throw g7u.a(oov2);
                }
                n |= 4;
            }
            n |= 5 - ((vt2)((Object)zfz2.dil(sxt))).c3s();
        }
        return n;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public zfz w1b(zfz var1_1, m5n var2_2, mew var3_3) {
        block18: {
            block17: {
                var4_4 = t9d.c();
                try {
                    try {
                        v0 = this.hl8(var2_2, var3_3);
                        if (var4_4 != 0) break block17;
                        if (v0 != 0) {
                        }
                        ** GOTO lbl24
                    }
                    catch (oov v1) {
                        throw g7u.a(v1);
                    }
                }
                catch (oov v2) {
                    throw g7u.a(v2);
                }
                {
                    ** switch (this.p9f((m5n)var2_2, (mew)var3_3))
                }
lbl-1000:
                // 1 sources

                {
                    case 0: {
                        var1_1 = var1_1.zvi(g7u.vjy, (Comparable)g7u$qmc.rn9);
                        if (var4_4 == 0) break;
                    }
lbl17:
                    // 2 sources

                    case 1: {
                        var1_1 = var1_1.zvi(g7u.vjy, (Comparable)g7u$qmc.ryv);
                        if (var4_4 == 0) break;
                    }
lbl20:
                    // 2 sources

                    case 2: {
                        var1_1 = var1_1.zvi(g7u.vjy, (Comparable)g7u$qmc.qxj);
                    }
                }
lbl22:
                // 4 sources

                try {
                    if (var4_4 == 0) break block18;
lbl24:
                    // 2 sources

                    v0 = this.r8u(var2_2, var3_3);
                }
                catch (oov v3) {
                    throw g7u.a(v3);
                }
            }
            switch (v0 ? 1 : 0) {
                case 0: {
                    var1_1 = var1_1.zvi(g7u.vjy, (Comparable)g7u$qmc.rn9);
                    if (var4_4 == 0) break;
                }
                case 1: {
                    var1_1 = var1_1.zvi(g7u.vjy, (Comparable)g7u$qmc.xd3);
                    if (var4_4 == 0) break;
                }
                case 2: {
                    var1_1 = var1_1.zvi(g7u.vjy, (Comparable)g7u$qmc.pfi);
                }
            }
        }
        return var1_1;
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{sxt, ru8, vjy});
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(2451639808541702898L, -6826012531869619369L, MethodHandles.lookup().lookupClass()).a(195893470525510L) ^ 0x2C41C71D21B7L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "X\u0083\u00f9\u0002\u00e1ag\u00ce\b@4\u00c8\u00c6`z\u00c7\u0014\b\u00c2a\u00c0\f\u00c2B\u0011\u0016";
        int n2 = "X\u0083\u00f9\u0002\u00e1ag\u00ce\b@4\u00c8\u00c6`z\u00c7\u0014\b\u00c2a\u00c0\f\u00c2B\u0011\u0016".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = g7u.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                sxt = qx_.q0o(stringArray2[0], vt2$unz.fzl);
                ru8 = zb_.pq4(stringArray2[2], g7u$lrl.class);
                vjy = zb_.pq4(stringArray2[1], g7u$qmc.class);
                sgn = new int[][]{{4, 5}, {5, 7}, {6, 7}, {4, 6}, {0, 1}, {1, 3}, {2, 3}, {0, 2}};
                return;
            }
            n3 = string.charAt(n4);
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

