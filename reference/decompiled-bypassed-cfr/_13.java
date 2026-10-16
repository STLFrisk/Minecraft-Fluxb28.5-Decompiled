/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;
import java.util.Random;
import java.util.Set;

public class _13
extends hmv {
    public int ym2;

    public _13(p3y p3y2) {
        super(p3y2);
    }

    private void a8e(t9d t9d2, mew mew2, zfz zfz2) {
        t9d2.vct(mew2, _13.km1(this.kgd).l4i().zvi(nfg, zfz2.dil(nfg)), 2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void zvy(t9d var1_1, mew var2_2, zfz var3_3, Random var4_4) {
        block134: {
            block138: {
                block139: {
                    block137: {
                        block136: {
                            block135: {
                                block129: {
                                    block131: {
                                        block132: {
                                            block130: {
                                                block108: {
                                                    block126: {
                                                        block127: {
                                                            block128: {
                                                                block124: {
                                                                    block125: {
                                                                        block122: {
                                                                            block123: {
                                                                                block121: {
                                                                                    block118: {
                                                                                        block116: {
                                                                                            block117: {
                                                                                                block120: {
                                                                                                    block119: {
                                                                                                        block113: {
                                                                                                            block114: {
                                                                                                                block115: {
                                                                                                                    block111: {
                                                                                                                        block112: {
                                                                                                                            block109: {
                                                                                                                                block110: {
                                                                                                                                    block107: {
                                                                                                                                        block106: {
                                                                                                                                            block104: {
                                                                                                                                                block105: {
                                                                                                                                                    var6_5 = (Integer)var3_3.dil(_13.nfg);
                                                                                                                                                    var7_6 = 1;
                                                                                                                                                    var5_7 = t9d.c();
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                v0 = this;
                                                                                                                                                                if (var5_7 != 0) break block104;
                                                                                                                                                                if (v0.kgd != p3y.e1s) break block105;
                                                                                                                                                            }
                                                                                                                                                            catch (oov v1) {
                                                                                                                                                                throw _13.a(v1);
                                                                                                                                                            }
                                                                                                                                                            v2 = (int)var1_1.vzz.yz2();
                                                                                                                                                            if (var5_7 != 0) break block106;
                                                                                                                                                        }
                                                                                                                                                        catch (oov v3) {
                                                                                                                                                            throw _13.a(v3);
                                                                                                                                                        }
                                                                                                                                                        if (v2 != 0) break block105;
                                                                                                                                                    }
                                                                                                                                                    catch (oov v4) {
                                                                                                                                                        throw _13.a(v4);
                                                                                                                                                    }
                                                                                                                                                    var7_6 = 2;
                                                                                                                                                }
                                                                                                                                                v0 = this;
                                                                                                                                            }
                                                                                                                                            v2 = v0.odp(var1_1);
                                                                                                                                        }
                                                                                                                                        var8_8 = v2;
                                                                                                                                        try {
                                                                                                                                            v5 = var6_5;
                                                                                                                                            if (var5_7 != 0) break block107;
                                                                                                                                            if (v5 > 0) {
                                                                                                                                            }
                                                                                                                                            ** GOTO lbl260
                                                                                                                                        }
                                                                                                                                        catch (oov v6) {
                                                                                                                                            throw _13.a(v6);
                                                                                                                                        }
                                                                                                                                        v5 = -100;
                                                                                                                                    }
                                                                                                                                    var9_9 = v5;
                                                                                                                                    this.ym2 = 0;
                                                                                                                                    for (vt2 var11_13 : vt2$unz.fzl) {
                                                                                                                                        var9_9 = this.o22(var1_1, var2_2.offset(var11_13), var9_9);
                                                                                                                                        try {
                                                                                                                                            if (var5_7 == 0) {
                                                                                                                                                if (var5_7 == 0) continue;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            break block108;
                                                                                                                                        }
                                                                                                                                        catch (oov v7) {
                                                                                                                                            throw _13.a(v7);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var10_12 = var9_9 + var7_6;
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v8 = var10_12;
                                                                                                                                                if (var5_7 != 0) break block109;
                                                                                                                                                if (v8 >= 8) break block110;
                                                                                                                                            }
                                                                                                                                            catch (oov v9) {
                                                                                                                                                throw _13.a(v9);
                                                                                                                                            }
                                                                                                                                            v10 = var9_9;
                                                                                                                                            if (var5_7 != 0) break block111;
                                                                                                                                        }
                                                                                                                                        catch (oov v11) {
                                                                                                                                            throw _13.a(v11);
                                                                                                                                        }
                                                                                                                                        if (v10 >= 0) break block112;
                                                                                                                                    }
                                                                                                                                    catch (oov v12) {
                                                                                                                                        throw _13.a(v12);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v8 = -1;
                                                                                                                            }
                                                                                                                            var10_12 = v8;
                                                                                                                        }
                                                                                                                        v10 = this.cah(var1_1, var2_2.nuv());
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (var5_7 != 0) break block113;
                                                                                                                        if (v10 < 0) break block114;
                                                                                                                    }
                                                                                                                    catch (oov v13) {
                                                                                                                        throw _13.a(v13);
                                                                                                                    }
                                                                                                                    var11_14 = this.cah(var1_1, var2_2.nuv());
                                                                                                                    try {
                                                                                                                        v14 = var11_14;
                                                                                                                        v15 = 8;
                                                                                                                        if (var5_7 != 0) break block115;
                                                                                                                        if (v14 >= v15) {
                                                                                                                        }
                                                                                                                        ** GOTO lbl95
                                                                                                                    }
                                                                                                                    catch (oov v16) {
                                                                                                                        throw _13.a(v16);
                                                                                                                    }
                                                                                                                    var10_12 = var11_14;
                                                                                                                    try {
                                                                                                                        if (var5_7 == 0) break block114;
lbl95:
                                                                                                                        // 2 sources

                                                                                                                        v14 = var11_14;
                                                                                                                        v15 = 8;
                                                                                                                    }
                                                                                                                    catch (oov v17) {
                                                                                                                        throw _13.a(v17);
                                                                                                                    }
                                                                                                                }
                                                                                                                var10_12 = v14 + v15;
                                                                                                            }
                                                                                                            try {
                                                                                                                v18 = this;
                                                                                                                if (var5_7 != 0) break block116;
                                                                                                                v10 = v18.ym2;
                                                                                                            }
                                                                                                            catch (oov v19) {
                                                                                                                throw _13.a(v19);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (v10 < 2) break block117;
                                                                                                                v20 = this.kgd;
                                                                                                                v21 = p3y.six;
                                                                                                                if (var5_7 != 0) break block118;
                                                                                                            }
                                                                                                            catch (oov v22) {
                                                                                                                throw _13.a(v22);
                                                                                                            }
                                                                                                            if (v20 != v21) break block117;
                                                                                                        }
                                                                                                        catch (oov v23) {
                                                                                                            throw _13.a(v23);
                                                                                                        }
                                                                                                        var11_15 = var1_1.getBlockState(var2_2.eve());
                                                                                                        try {
                                                                                                            v20 = var11_15.r_y().p1r();
                                                                                                            if (var5_7 != 0) break block119;
                                                                                                            if (v20.gk6()) {
                                                                                                            }
                                                                                                            ** GOTO lbl136
                                                                                                        }
                                                                                                        catch (oov v24) {
                                                                                                            throw _13.a(v24);
                                                                                                        }
                                                                                                        var10_12 = 0;
                                                                                                        try {
                                                                                                            if (var5_7 == 0) break block117;
lbl136:
                                                                                                            // 2 sources

                                                                                                            v20 = var11_15.r_y().p1r();
                                                                                                        }
                                                                                                        catch (oov v25) {
                                                                                                            throw _13.a(v25);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                v21 = this.kgd;
                                                                                                                if (var5_7 != 0) break block118;
                                                                                                                if (v20 != v21) break block117;
                                                                                                            }
                                                                                                            catch (oov v26) {
                                                                                                                throw _13.a(v26);
                                                                                                            }
                                                                                                            v27 = (Integer)var11_15.dil(_13.nfg);
                                                                                                            if (var5_7 != 0) break block120;
                                                                                                        }
                                                                                                        catch (oov v28) {
                                                                                                            throw _13.a(v28);
                                                                                                        }
                                                                                                        if (v27 != 0) break block117;
                                                                                                    }
                                                                                                    catch (oov v29) {
                                                                                                        throw _13.a(v29);
                                                                                                    }
                                                                                                    v27 = 0;
                                                                                                }
                                                                                                var10_12 = v27;
                                                                                            }
                                                                                            v18 = this;
                                                                                        }
                                                                                        v20 = v18.kgd;
                                                                                        v21 = p3y.e1s;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (v20 != v21) break block121;
                                                                                                                    v30 = var6_5;
                                                                                                                    v31 = 8;
                                                                                                                    if (var5_7 != 0) break block122;
                                                                                                                }
                                                                                                                catch (oov v32) {
                                                                                                                    throw _13.a(v32);
                                                                                                                }
                                                                                                                if (v30 >= v31) break block121;
                                                                                                            }
                                                                                                            catch (oov v33) {
                                                                                                                throw _13.a(v33);
                                                                                                            }
                                                                                                            v30 = var10_12;
                                                                                                            v31 = 8;
                                                                                                            if (var5_7 != 0) break block122;
                                                                                                        }
                                                                                                        catch (oov v34) {
                                                                                                            throw _13.a(v34);
                                                                                                        }
                                                                                                        if (v30 >= v31) break block121;
                                                                                                    }
                                                                                                    catch (oov v35) {
                                                                                                        throw _13.a(v35);
                                                                                                    }
                                                                                                    v30 = var10_12;
                                                                                                    v31 = var6_5;
                                                                                                    if (var5_7 != 0) break block122;
                                                                                                }
                                                                                                catch (oov v36) {
                                                                                                    throw _13.a(v36);
                                                                                                }
                                                                                                if (v30 <= v31) break block121;
                                                                                            }
                                                                                            catch (oov v37) {
                                                                                                throw _13.a(v37);
                                                                                            }
                                                                                            v30 = var4_4.nextInt(4);
                                                                                            if (var5_7 != 0) break block123;
                                                                                        }
                                                                                        catch (oov v38) {
                                                                                            throw _13.a(v38);
                                                                                        }
                                                                                        if (v30 == 0) break block121;
                                                                                    }
                                                                                    catch (oov v39) {
                                                                                        throw _13.a(v39);
                                                                                    }
                                                                                    var8_8 *= 4;
                                                                                }
                                                                                v30 = var10_12;
                                                                            }
                                                                            try {
                                                                                if (var5_7 != 0) break block124;
                                                                                v31 = var6_5;
                                                                            }
                                                                            catch (oov v40) {
                                                                                throw _13.a(v40);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (v30 != v31) break block125;
                                                                            this.a8e(var1_1, var2_2, var3_3);
                                                                            if (var5_7 == 0) break block126;
                                                                        }
                                                                        catch (oov v41) {
                                                                            throw _13.a(v41);
                                                                        }
                                                                    }
                                                                    var6_5 = var10_12;
                                                                    v30 = var10_12;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var5_7 != 0) break block127;
                                                                        if (v30 >= 0) break block128;
                                                                    }
                                                                    catch (oov v42) {
                                                                        throw _13.a(v42);
                                                                    }
                                                                    var1_1.i6x(var2_2);
                                                                    if (var5_7 == 0) break block126;
                                                                }
                                                                catch (oov v43) {
                                                                    throw _13.a(v43);
                                                                }
                                                            }
                                                            var3_3 = var3_3.zvi(_13.nfg, Integer.valueOf(var10_12));
                                                            v30 = (int)var1_1.vct(var2_2, var3_3, 2);
                                                        }
                                                        var1_1.cjk(var2_2, this, var8_8);
                                                        var1_1._0o(var2_2, this);
                                                    }
                                                    try {
                                                        if (var5_7 == 0) break block108;
lbl260:
                                                        // 2 sources

                                                        this.a8e(var1_1, var2_2, var3_3);
                                                    }
                                                    catch (oov v44) {
                                                        throw _13.a(v44);
                                                    }
                                                }
                                                var9_10 = var1_1.getBlockState(var2_2.eve());
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v45 = this.g4k(var1_1, var2_2.eve(), var9_10);
                                                                    if (var5_7 != 0) break block129;
                                                                    if (v45 != 0) {
                                                                    }
                                                                    ** GOTO lbl328
                                                                }
                                                                catch (oov v46) {
                                                                    throw _13.a(v46);
                                                                }
                                                                v47 = this.kgd;
                                                                v48 = p3y.e1s;
                                                                if (var5_7 != 0) break block130;
                                                            }
                                                            catch (oov v49) {
                                                                throw _13.a(v49);
                                                            }
                                                            if (v47 != v48) break block131;
                                                        }
                                                        catch (oov v50) {
                                                            throw _13.a(v50);
                                                        }
                                                        v51 = var1_1;
                                                        v52 = var2_2.eve();
                                                        if (var5_7 != 0) break block132;
                                                    }
                                                    catch (oov v53) {
                                                        throw _13.a(v53);
                                                    }
                                                    v47 = v51.getBlockState(v52).r_y().p1r();
                                                    v48 = p3y.six;
                                                }
                                                catch (oov v54) {
                                                    throw _13.a(v54);
                                                }
                                            }
                                            try {
                                                if (v47 != v48) break block131;
                                                v51 = var1_1;
                                                v52 = var2_2.eve();
                                            }
                                            catch (oov v55) {
                                                throw _13.a(v55);
                                            }
                                        }
                                        v51.gfy(v52, ox_.pu8.l4i());
                                        this.hjz(var1_1, var2_2.eve());
                                        return;
                                    }
                                    try {
                                        try {
                                            block133: {
                                                try {
                                                    if (var6_5 < 8) break block133;
                                                    this.gnt(var1_1, var2_2.eve(), var9_10, var6_5);
                                                    if (var5_7 == 0) break block134;
                                                }
                                                catch (oov v56) {
                                                    throw _13.a(v56);
                                                }
                                            }
                                            this.gnt(var1_1, var2_2.eve(), var9_10, var6_5 + 8);
                                            if (var5_7 == 0) break block134;
                                        }
                                        catch (oov v57) {
                                            throw _13.a(v57);
                                        }
lbl328:
                                        // 2 sources

                                        v45 = var6_5;
                                    }
                                    catch (oov v58) {
                                        throw _13.a(v58);
                                    }
                                }
                                try {
                                    if (var5_7 != 0) break block135;
                                    if (v45 < 0) break block134;
                                }
                                catch (oov v59) {
                                    throw _13.a(v59);
                                }
                                v45 = var6_5;
                            }
                            try {
                                try {
                                    try {
                                        if (var5_7 != 0) break block136;
                                        if (v45 != 0) {
                                        }
                                        ** GOTO lbl364
                                    }
                                    catch (oov v60) {
                                        throw _13.a(v60);
                                    }
                                    v61 = this;
                                    v62 = var1_1;
                                    v63 = var2_2.eve();
                                    if (var5_7 != 0) break block137;
                                }
                                catch (oov v64) {
                                    throw _13.a(v64);
                                }
                                v45 = (int)v61._9j(v62, v63, var9_10);
                            }
                            catch (oov v65) {
                                throw _13.a(v65);
                            }
                        }
                        try {
                            if (v45 == 0) break block134;
lbl364:
                            // 2 sources

                            v61 = this;
                            v62 = var1_1;
                            v63 = var2_2;
                        }
                        catch (oov v66) {
                            throw _13.a(v66);
                        }
                    }
                    var10_11 = v61.lo3(v62, v63);
                    var11_16 = var6_5 + var7_6;
                    try {
                        v67 = var6_5;
                        v68 = 8;
                        if (var5_7 != 0) break block138;
                        if (v67 < v68) break block139;
                    }
                    catch (oov v69) {
                        throw _13.a(v69);
                    }
                    var11_16 = 1;
                }
                v67 = var11_16;
                v68 = 8;
            }
            if (v67 >= v68) {
                return;
            }
            var12_17 = var10_11.iterator();
            while (var12_17.hasNext()) {
                var13_18 = (vt2)var12_17.next();
                this.gnt(var1_1, var2_2.offset(var13_18), var1_1.getBlockState(var2_2.offset(var13_18)), var11_16);
                if (var5_7 == 0) continue;
            }
        }
    }

    private void gnt(t9d t9d2, mew mew2, zfz zfz2, int n) {
        block13: {
            block14: {
                e0x e0x2;
                block15: {
                    e0x e0x3;
                    int n2;
                    block12: {
                        n2 = t9d.c();
                        try {
                            try {
                                e0x3 = this;
                                if (n2 != 0) break block12;
                                if (!e0x3.g4k(t9d2, mew2, zfz2)) break block13;
                            }
                            catch (oov oov2) {
                                throw _13.a(oov2);
                            }
                            e0x3 = zfz2.r_y();
                        }
                        catch (oov oov3) {
                            throw _13.a(oov3);
                        }
                    }
                    try {
                        block16: {
                            try {
                                try {
                                    try {
                                        if (e0x3 == ox_.ibw) break block14;
                                        e0x2 = this;
                                        if (n2 != 0) break block15;
                                    }
                                    catch (oov oov4) {
                                        throw _13.a(oov4);
                                    }
                                    if (e0x2.kgd != p3y.e1s) break block16;
                                }
                                catch (oov oov5) {
                                    throw _13.a(oov5);
                                }
                                this.hjz(t9d2, mew2);
                                if (n2 == 0) break block14;
                            }
                            catch (oov oov6) {
                                throw _13.a(oov6);
                            }
                        }
                        e0x2 = zfz2.r_y();
                    }
                    catch (oov oov7) {
                        throw _13.a(oov7);
                    }
                }
                e0x2.lf0(t9d2, mew2, zfz2, 0);
            }
            t9d2.vct(mew2, this.l4i().zvi(nfg, Integer.valueOf(n)), 3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int exu(t9d var1_1, mew var2_2, int var3_3, vt2 var4_4) {
        var6_5 = 1000;
        var7_6 = vt2$unz.fzl.iterator();
        var5_7 = t9d.c();
        while (var7_6.hasNext()) {
            block27: {
                block33: {
                    block32: {
                        block30: {
                            block31: {
                                block29: {
                                    block28: {
                                        block26: {
                                            var8_8 = (vt2)var7_6.next();
                                            if (var8_8 == var4_4) break block27;
                                            var9_9 = var2_2.offset(var8_8);
                                            var10_10 = var1_1.getBlockState(var9_9);
                                            try {
                                                try {
                                                    try {
                                                        v0 /* !! */  = this;
                                                        if (var5_7 != 0) break block26;
                                                        if (v0 /* !! */ ._9j(var1_1, var9_9, var10_10)) break block27;
                                                    }
                                                    catch (oov v1) {
                                                        throw _13.a(v1);
                                                    }
                                                    v2 = var10_10;
                                                    if (var5_7 != 0) break block28;
                                                }
                                                catch (oov v3) {
                                                    throw _13.a(v3);
                                                }
                                                v0 /* !! */  = v2.r_y();
                                            }
                                            catch (oov v4) {
                                                throw _13.a(v4);
                                            }
                                        }
                                        try {
                                            if (v0 /* !! */ .p1r() == this.kgd) {
                                                v2 = var10_10;
                                            }
                                            ** GOTO lbl44
                                        }
                                        catch (oov v5) {
                                            throw _13.a(v5);
                                        }
                                    }
                                    try {
                                        try {
                                            v6 = (Integer)v2.dil(_13.nfg);
                                            if (var5_7 != 0) break block29;
                                            if (v6 <= 0) break block27;
                                        }
                                        catch (oov v7) {
                                            throw _13.a(v7);
                                        }
lbl44:
                                        // 2 sources

                                        v6 = this._9j(var1_1, var9_9.eve(), var10_10);
                                    }
                                    catch (oov v8) {
                                        throw _13.a(v8);
                                    }
                                }
                                try {
                                    try {
                                        if (var5_7 != 0) break block30;
                                        if (v6 != 0) break block31;
                                    }
                                    catch (oov v9) {
                                        throw _13.a(v9);
                                    }
                                    return var3_3;
                                }
                                catch (oov v10) {
                                    throw _13.a(v10);
                                }
                            }
                            v6 = var3_3;
                        }
                        try {
                            try {
                                if (var5_7 != 0) break block32;
                                if (v6 >= 4) break block27;
                            }
                            catch (oov v11) {
                                throw _13.a(v11);
                            }
                            v6 = this.exu(var1_1, var9_9, var3_3 + 1, var8_8.b4b());
                        }
                        catch (oov v12) {
                            throw _13.a(v12);
                        }
                    }
                    var11_11 = v6;
                    try {
                        try {
                            v13 = var11_11;
                            if (var5_7 != 0) break block33;
                            if (v13 >= var6_5) break block27;
                        }
                        catch (oov v14) {
                            throw _13.a(v14);
                        }
                        v13 = var11_11;
                    }
                    catch (oov v15) {
                        throw _13.a(v15);
                    }
                }
                var6_5 = v13;
            }
            if (var5_7 == 0) continue;
        }
        return var6_5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Set lo3(t9d var1_1, mew var2_2) {
        var4_3 = 1000;
        var5_4 = EnumSet.noneOf(vt2.class);
        var3_5 = t9d.c();
        for (vt2 var7_7 : vt2$unz.fzl) {
            block28: {
                block35: {
                    block33: {
                        block34: {
                            block32: {
                                block31: {
                                    block30: {
                                        block29: {
                                            block27: {
                                                var8_8 = var2_2.offset(var7_7);
                                                var9_9 = var1_1.getBlockState(var8_8);
                                                try {
                                                    try {
                                                        try {
                                                            v0 /* !! */  = this;
                                                            if (var3_5 != 0) break block27;
                                                            if (v0 /* !! */ ._9j(var1_1, var8_8, var9_9)) break block28;
                                                        }
                                                        catch (oov v1) {
                                                            throw _13.a(v1);
                                                        }
                                                        v2 = var9_9;
                                                        if (var3_5 != 0) break block29;
                                                    }
                                                    catch (oov v3) {
                                                        throw _13.a(v3);
                                                    }
                                                    v0 /* !! */  = v2.r_y();
                                                }
                                                catch (oov v4) {
                                                    throw _13.a(v4);
                                                }
                                            }
                                            try {
                                                if (v0 /* !! */ .p1r() == this.kgd) {
                                                    v2 = var9_9;
                                                }
                                                ** GOTO lbl43
                                            }
                                            catch (oov v5) {
                                                throw _13.a(v5);
                                            }
                                        }
                                        try {
                                            try {
                                                v6 = (Integer)v2.dil(_13.nfg);
                                                if (var3_5 != 0) break block30;
                                                if (v6 <= 0) break block28;
                                            }
                                            catch (oov v7) {
                                                throw _13.a(v7);
                                            }
lbl43:
                                            // 2 sources

                                            v6 = (int)this._9j(var1_1, var8_8.eve(), var1_1.getBlockState(var8_8.eve()));
                                        }
                                        catch (oov v8) {
                                            throw _13.a(v8);
                                        }
                                    }
                                    try {
                                        if (var3_5 != 0) break block31;
                                        if (v6 != 0) {
                                        }
                                        ** GOTO lbl58
                                    }
                                    catch (oov v9) {
                                        throw _13.a(v9);
                                    }
                                    var10_10 = this.exu(var1_1, var8_8, 1, var7_7.b4b());
                                    try {
                                        if (var3_5 == 0) break block32;
lbl58:
                                        // 2 sources

                                        v6 = 0;
                                    }
                                    catch (oov v10) {
                                        throw _13.a(v10);
                                    }
                                }
                                var10_10 = v6;
                            }
                            try {
                                try {
                                    v11 = var10_10;
                                    v12 = var4_3;
                                    if (var3_5 != 0) break block33;
                                    if (v11 >= v12) break block34;
                                }
                                catch (oov v13) {
                                    throw _13.a(v13);
                                }
                                var5_4.clear();
                            }
                            catch (oov v14) {
                                throw _13.a(v14);
                            }
                        }
                        try {
                            v11 = var10_10;
                            if (var3_5 != 0) break block35;
                            v12 = var4_3;
                        }
                        catch (oov v15) {
                            throw _13.a(v15);
                        }
                    }
                    try {
                        if (v11 > v12) break block28;
                        var5_4.add(var7_7);
                        v11 = var10_10;
                    }
                    catch (oov v16) {
                        throw _13.a(v16);
                    }
                }
                var4_3 = v11;
            }
            if (var3_5 == 0) continue;
        }
        return var5_4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean _9j(t9d t9d2, mew mew2, zfz zfz2) {
        p3y p3y2;
        block22: {
            e0x e0x2;
            block23: {
                e0x e0x3;
                int n;
                block21: {
                    block20: {
                        e0x e0x4;
                        block19: {
                            block18: {
                                n = t9d.b();
                                e0x2 = t9d2.getBlockState(mew2).r_y();
                                try {
                                    try {
                                        e0x3 = e0x2;
                                        if (n == 0) break block18;
                                        if (e0x3 instanceof w4e) return true;
                                    }
                                    catch (oov oov2) {
                                        throw _13.a(oov2);
                                    }
                                    e0x3 = e0x2;
                                }
                                catch (oov oov3) {
                                    throw _13.a(oov3);
                                }
                            }
                            try {
                                try {
                                    try {
                                        e0x4 = ox_.w0z;
                                        if (n == 0) break block19;
                                        if (e0x3 == e0x4) return true;
                                    }
                                    catch (oov oov4) {
                                        throw _13.a(oov4);
                                    }
                                    e0x3 = e0x2;
                                    if (n == 0) break block20;
                                }
                                catch (oov oov5) {
                                    throw _13.a(oov5);
                                }
                                e0x4 = ox_.h49;
                            }
                            catch (oov oov6) {
                                throw _13.a(oov6);
                            }
                        }
                        if (e0x3 == e0x4) return true;
                        e0x3 = e0x2;
                    }
                    try {
                        try {
                            if (n == 0) break block21;
                            if (e0x3 == ox_.x65) return true;
                        }
                        catch (oov oov7) {
                            throw _13.a(oov7);
                        }
                        e0x3 = e0x2;
                    }
                    catch (oov oov8) {
                        throw _13.a(oov8);
                    }
                }
                try {
                    try {
                        p3y2 = e0x3.kgd;
                        if (n == 0) break block22;
                        if (p3y2 != p3y.p6q) break block23;
                        return true;
                    }
                    catch (oov oov9) {
                        throw _13.a(oov9);
                    }
                }
                catch (oov oov10) {
                    throw _13.a(oov10);
                }
            }
            p3y2 = e0x2.kgd;
        }
        boolean bl = p3y2.c3t();
        return bl;
    }

    public int o22(t9d t9d2, mew mew2, int n) {
        int n2;
        block24: {
            int n3;
            block23: {
                int n4;
                block22: {
                    block20: {
                        block21: {
                            block18: {
                                block19: {
                                    block16: {
                                        block17: {
                                            n4 = t9d.b();
                                            n3 = this.cah(t9d2, mew2);
                                            try {
                                                try {
                                                    n2 = n3;
                                                    if (n4 == 0) break block16;
                                                    if (n2 >= 0) break block17;
                                                }
                                                catch (oov oov2) {
                                                    throw _13.a(oov2);
                                                }
                                                return n;
                                            }
                                            catch (oov oov3) {
                                                throw _13.a(oov3);
                                            }
                                        }
                                        n2 = n3;
                                    }
                                    try {
                                        try {
                                            if (n4 == 0) break block18;
                                            if (n2 != 0) break block19;
                                        }
                                        catch (oov oov4) {
                                            throw _13.a(oov4);
                                        }
                                        ++this.ym2;
                                    }
                                    catch (oov oov5) {
                                        throw _13.a(oov5);
                                    }
                                }
                                n2 = n3;
                            }
                            try {
                                if (n4 == 0) break block20;
                                if (n2 < 8) break block21;
                            }
                            catch (oov oov6) {
                                throw _13.a(oov6);
                            }
                            n3 = 0;
                        }
                        n2 = n;
                    }
                    try {
                        if (n4 == 0) break block22;
                        if (n2 < 0) break block23;
                    }
                    catch (oov oov7) {
                        throw _13.a(oov7);
                    }
                    n2 = n3;
                }
                try {
                    try {
                        if (n4 == 0) break block24;
                        if (n2 < n) break block23;
                    }
                    catch (oov oov8) {
                        throw _13.a(oov8);
                    }
                    n2 = n;
                    break block24;
                }
                catch (oov oov9) {
                    throw _13.a(oov9);
                }
            }
            n2 = n3;
        }
        return n2;
    }

    private boolean g4k(t9d t9d2, mew mew2, zfz zfz2) {
        boolean bl;
        block10: {
            block9: {
                p3y p3y2;
                p3y p3y3;
                int n;
                block8: {
                    n = t9d.c();
                    p3y p3y4 = zfz2.r_y().p1r();
                    try {
                        try {
                            p3y3 = p3y4;
                            p3y2 = this.kgd;
                            if (n != 0) break block8;
                            if (p3y3 == p3y2) break block9;
                        }
                        catch (oov oov2) {
                            throw _13.a(oov2);
                        }
                        p3y3 = p3y4;
                        p3y2 = p3y.e1s;
                    }
                    catch (oov oov3) {
                        throw _13.a(oov3);
                    }
                }
                try {
                    try {
                        if (p3y3 == p3y2) break block9;
                        bl = this._9j(t9d2, mew2, zfz2);
                        if (n != 0) break block10;
                    }
                    catch (oov oov4) {
                        throw _13.a(oov4);
                    }
                    if (bl) break block9;
                }
                catch (oov oov5) {
                    throw _13.a(oov5);
                }
                bl = true;
                break block10;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void tfc(t9d t9d2, mew mew2, zfz zfz2) {
        try {
            if (!this.umq(t9d2, mew2, zfz2)) {
                t9d2.cjk(mew2, this, this.odp(t9d2));
            }
        }
        catch (oov oov2) {
            throw _13.a(oov2);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

