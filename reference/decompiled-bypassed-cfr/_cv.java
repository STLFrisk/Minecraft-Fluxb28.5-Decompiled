/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _cv
extends eel {
    public static final h76 g07;
    public static final h76 sdu;
    public int[] ai2;
    public int sqi;
    public boolean b6a;

    public _cv() {
        super(p3y.hh1, false);
        this._p_(true);
        this.i3l(uja.qqf);
        this.q6h(0.2f);
        this.opa(1);
        this.t4k(_0p);
    }

    @Override
    public int ldy() {
        return h7z.yf5(0.5, 1.0);
    }

    @Override
    public int ieb(zfz zfz2) {
        return h7z.c6v();
    }

    @Override
    public int j24(m5n m5n2, mew mew2, int n) {
        return s4i.uqp(m5n2, mew2);
    }

    @Override
    public void b8f(t9d t9d2, mew mew2, zfz zfz2) {
        block19: {
            int n;
            int n2;
            int n3;
            block18: {
                n3 = 1;
                int n4 = n3 + 1;
                int n5 = mew2.getX();
                n2 = t9d.c();
                int n6 = mew2.getY();
                int n7 = mew2.getZ();
                try {
                    try {
                        n = t9d2.o2i(new mew(n5 - n4, n6 - n4, n7 - n4), new mew(n5 + n4, n6 + n4, n7 + n4));
                        if (n2 != 0) break block18;
                        if (n == 0) break block19;
                    }
                    catch (oov oov2) {
                        throw _cv.a(oov2);
                    }
                    n = -n3;
                }
                catch (oov oov3) {
                    throw _cv.a(oov3);
                }
            }
            int n8 = n;
            block14: while (true) {
                int n9 = n8;
                block15: while (n9 <= n3) {
                    int n10 = -n3;
                    while (n10 <= n3) {
                        block20: {
                            n9 = -n3;
                            if (n2 != 0) continue block15;
                            int n11 = n9;
                            while (n11 <= n3) {
                                block21: {
                                    block22: {
                                        mew mew3 = mew2.ec4(n8, n10, n11);
                                        zfz zfz3 = t9d2.getBlockState(mew3);
                                        try {
                                            boolean bl;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (n2 != 0) break block20;
                                                            if (n2 != 0) break block21;
                                                        }
                                                        catch (oov oov4) {
                                                            throw _cv.a(oov4);
                                                        }
                                                        if (zfz3.r_y().p1r() != p3y.hh1) break block22;
                                                    }
                                                    catch (oov oov5) {
                                                        throw _cv.a(oov5);
                                                    }
                                                    bl = (Boolean)zfz3.dil(sdu);
                                                    if (n2 != 0) break block22;
                                                }
                                                catch (oov oov6) {
                                                    throw _cv.a(oov6);
                                                }
                                                if (bl) break block22;
                                            }
                                            catch (oov oov7) {
                                                throw _cv.a(oov7);
                                            }
                                            bl = t9d2.vct(mew3, zfz3.zvi(sdu, Boolean.valueOf(true)), 4);
                                        }
                                        catch (oov oov8) {
                                            throw _cv.a(oov8);
                                        }
                                    }
                                    ++n11;
                                }
                                if (n2 == 0) continue;
                            }
                            ++n10;
                        }
                        if (n2 == 0) continue;
                    }
                    ++n8;
                    if (n2 == 0) continue block14;
                }
                break;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void zvy(t9d var1_1, mew var2_2, zfz var3_3, Random var4_4) {
        block80: {
            block103: {
                block85: {
                    block86: {
                        block87: {
                            block84: {
                                block83: {
                                    block82: {
                                        block81: {
                                            block79: {
                                                var5_5 = t9d.c();
                                                try {
                                                    try {
                                                        v0 = var1_1.v0f;
                                                        if (var5_5 != 0) break block79;
                                                        if (v0 != 0) break block80;
                                                    }
                                                    catch (oov v1) {
                                                        throw _cv.a(v1);
                                                    }
                                                    v0 = ((Boolean)var3_3.dil(_cv.sdu)).booleanValue();
                                                }
                                                catch (oov v2) {
                                                    throw _cv.a(v2);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var5_5 != 0) break block81;
                                                    if (v0 == 0) break block80;
                                                }
                                                catch (oov v3) {
                                                    throw _cv.a(v3);
                                                }
                                                v0 = (int)((Boolean)var3_3.dil(_cv.g07)).booleanValue();
                                            }
                                            catch (oov v4) {
                                                throw _cv.a(v4);
                                            }
                                        }
                                        try {
                                            if (var5_5 != 0) break block82;
                                            if (v0 == 0) break block80;
                                        }
                                        catch (oov v5) {
                                            throw _cv.a(v5);
                                        }
                                        v0 = 4;
                                    }
                                    var6_6 = v0;
                                    var7_7 = var6_6 + 1;
                                    var8_8 = var2_2.getX();
                                    var9_9 = var2_2.getY();
                                    var10_10 = var2_2.getZ();
                                    var11_11 = 32;
                                    var12_12 = var11_11 * var11_11;
                                    var13_13 = var11_11 / 2;
                                    try {
                                        try {
                                            v6 = this;
                                            if (var5_5 != 0) break block83;
                                            if (v6.ai2 != null) break block84;
                                        }
                                        catch (oov v7) {
                                            throw _cv.a(v7);
                                        }
                                        v6 = this;
                                    }
                                    catch (oov v8) {
                                        throw _cv.a(v8);
                                    }
                                }
                                v6.ai2 = new int[var11_11 * var11_11 * var11_11];
                            }
                            try {
                                v9 = var1_1.o2i(new mew(var8_8 - var7_7, var9_9 - var7_7, var10_10 - var7_7), new mew(var8_8 + var7_7, var9_9 + var7_7, var10_10 + var7_7));
                                if (var5_5 != 0) break block85;
                                if (v9 == 0) break block86;
                            }
                            catch (oov v10) {
                                throw _cv.a(v10);
                            }
                            var14_14 = new mew$mix();
                            var15_16 = -var6_6;
                            block64: while (true) {
                                v11 = var15_16;
                                block65: while (v11 <= var6_6) {
                                    v12 = -var6_6;
                                    if (var5_5 != 0) break block87;
                                    var16_17 = v12;
                                    while (var16_17 <= var6_6) {
                                        block88: {
                                            v11 = -var6_6;
                                            if (var5_5 != 0) continue block65;
                                            for (var17_18 = v35044; var17_18 <= var6_6; ++var17_18) {
                                                block90: {
                                                    block89: {
                                                        var18_19 = var1_1.getBlockState(var14_14.bj0(var8_8 + var15_16, var9_9 + var16_17, var10_10 + var17_18)).r_y();
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (var5_5 != 0) break block88;
                                                                        v13 = var18_19;
                                                                        v14 = ox_.uom;
                                                                        if (var5_5 != 0) break block89;
                                                                    }
                                                                    catch (oov v15) {
                                                                        throw _cv.a(v15);
                                                                    }
                                                                    if (v13 != v14) {
                                                                    }
                                                                    ** GOTO lbl121
                                                                }
                                                                catch (oov v16) {
                                                                    throw _cv.a(v16);
                                                                }
                                                                v13 = var18_19;
                                                                if (var5_5 != 0) break block90;
                                                            }
                                                            catch (oov v17) {
                                                                throw _cv.a(v17);
                                                            }
                                                            v14 = ox_.a4y;
                                                        }
                                                        catch (oov v18) {
                                                            throw _cv.a(v18);
                                                        }
                                                    }
                                                    if (v13 == v14) ** GOTO lbl121
                                                    v13 = var18_19;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (v13.p1r() == p3y.hh1) {
                                                                this.ai2[(var15_16 + var13_13) * var12_12 + (var16_17 + var13_13) * var11_11 + var17_18 + var13_13] = -2;
                                                                if (var5_5 == 0) continue;
                                                            }
                                                        }
                                                        catch (oov v19) {
                                                            throw _cv.a(v19);
                                                        }
                                                        this.ai2[(var15_16 + var13_13) * var12_12 + (var16_17 + var13_13) * var11_11 + var17_18 + var13_13] = -1;
                                                        if (var5_5 == 0) continue;
                                                    }
                                                    catch (oov v20) {
                                                        throw _cv.a(v20);
                                                    }
lbl121:
                                                    // 3 sources

                                                    this.ai2[(var15_16 + var13_13) * var12_12 + (var16_17 + var13_13) * var11_11 + var17_18 + var13_13] = 0;
                                                    continue;
                                                }
                                                catch (oov v21) {
                                                    throw _cv.a(v21);
                                                }
                                            }
                                            ++var16_17;
                                        }
                                        if (var5_5 == 0) continue;
                                    }
                                    ++var15_16;
                                    if (var5_5 == 0) continue block64;
                                }
                                break;
                            }
                            v12 = 1;
                        }
                        var15_16 = v12;
                        block68: while (true) {
                            v22 = var15_16;
                            block69: while (v22 <= 4) {
                                v9 = -var6_6;
                                if (var5_5 != 0) break block85;
                                var16_17 = v9;
                                block70: while (true) {
                                    v23 = var16_17;
                                    block71: while (v23 <= var6_6) {
                                        v22 = -var6_6;
                                        if (var5_5 != 0) continue block69;
                                        var17_18 = v22;
                                        block72: while (true) {
                                            v24 = var17_18;
                                            v25 = var6_6;
                                            block73: while (v24 <= v25) {
                                                v23 = -var6_6;
                                                if (var5_5 != 0) continue block71;
                                                for (var18_20 = v35145; var18_20 <= var6_6; ++var18_20) {
                                                    block102: {
                                                        block100: {
                                                            block101: {
                                                                block98: {
                                                                    block99: {
                                                                        block96: {
                                                                            block97: {
                                                                                block94: {
                                                                                    block95: {
                                                                                        block92: {
                                                                                            block93: {
                                                                                                block91: {
                                                                                                    v24 = this.ai2[(var16_17 + var13_13) * var12_12 + (var17_18 + var13_13) * var11_11 + var18_20 + var13_13];
                                                                                                    v25 = var15_16 - 1;
                                                                                                    if (var5_5 != 0) continue block73;
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var5_5 != 0) break block91;
                                                                                                            if (v24 != v25) continue;
                                                                                                        }
                                                                                                        catch (oov v26) {
                                                                                                            throw _cv.a(v26);
                                                                                                        }
                                                                                                        v27 = this.ai2[(var16_17 + var13_13 - 1) * var12_12 + (var17_18 + var13_13) * var11_11 + var18_20 + var13_13];
                                                                                                        v28 = -2;
                                                                                                    }
                                                                                                    catch (oov v29) {
                                                                                                        throw _cv.a(v29);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var5_5 != 0) break block92;
                                                                                                        if (v27 != v28) break block93;
                                                                                                    }
                                                                                                    catch (oov v30) {
                                                                                                        throw _cv.a(v30);
                                                                                                    }
                                                                                                    this.ai2[(var16_17 + var13_13 - 1) * var12_12 + (var17_18 + var13_13) * var11_11 + var18_20 + var13_13] = var15_16;
                                                                                                }
                                                                                                catch (oov v31) {
                                                                                                    throw _cv.a(v31);
                                                                                                }
                                                                                            }
                                                                                            v27 = this.ai2[(var16_17 + var13_13 + 1) * var12_12 + (var17_18 + var13_13) * var11_11 + var18_20 + var13_13];
                                                                                            v28 = -2;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (var5_5 != 0) break block94;
                                                                                                if (v27 != v28) break block95;
                                                                                            }
                                                                                            catch (oov v32) {
                                                                                                throw _cv.a(v32);
                                                                                            }
                                                                                            this.ai2[(var16_17 + var13_13 + 1) * var12_12 + (var17_18 + var13_13) * var11_11 + var18_20 + var13_13] = var15_16;
                                                                                        }
                                                                                        catch (oov v33) {
                                                                                            throw _cv.a(v33);
                                                                                        }
                                                                                    }
                                                                                    v27 = this.ai2[(var16_17 + var13_13) * var12_12 + (var17_18 + var13_13 - 1) * var11_11 + var18_20 + var13_13];
                                                                                    v28 = -2;
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (var5_5 != 0) break block96;
                                                                                        if (v27 != v28) break block97;
                                                                                    }
                                                                                    catch (oov v34) {
                                                                                        throw _cv.a(v34);
                                                                                    }
                                                                                    this.ai2[(var16_17 + var13_13) * var12_12 + (var17_18 + var13_13 - 1) * var11_11 + var18_20 + var13_13] = var15_16;
                                                                                }
                                                                                catch (oov v35) {
                                                                                    throw _cv.a(v35);
                                                                                }
                                                                            }
                                                                            v27 = this.ai2[(var16_17 + var13_13) * var12_12 + (var17_18 + var13_13 + 1) * var11_11 + var18_20 + var13_13];
                                                                            v28 = -2;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (var5_5 != 0) break block98;
                                                                                if (v27 != v28) break block99;
                                                                            }
                                                                            catch (oov v36) {
                                                                                throw _cv.a(v36);
                                                                            }
                                                                            this.ai2[(var16_17 + var13_13) * var12_12 + (var17_18 + var13_13 + 1) * var11_11 + var18_20 + var13_13] = var15_16;
                                                                        }
                                                                        catch (oov v37) {
                                                                            throw _cv.a(v37);
                                                                        }
                                                                    }
                                                                    v27 = this.ai2[(var16_17 + var13_13) * var12_12 + (var17_18 + var13_13) * var11_11 + (var18_20 + var13_13 - 1)];
                                                                    v28 = -2;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var5_5 != 0) break block100;
                                                                        if (v27 != v28) break block101;
                                                                    }
                                                                    catch (oov v38) {
                                                                        throw _cv.a(v38);
                                                                    }
                                                                    this.ai2[(var16_17 + var13_13) * var12_12 + (var17_18 + var13_13) * var11_11 + (var18_20 + var13_13 - 1)] = var15_16;
                                                                }
                                                                catch (oov v39) {
                                                                    throw _cv.a(v39);
                                                                }
                                                            }
                                                            try {
                                                                v40 = this.ai2;
                                                                v41 = (var16_17 + var13_13) * var12_12 + (var17_18 + var13_13) * var11_11 + var18_20 + var13_13 + 1;
                                                                if (var5_5 != 0) break block102;
                                                                v27 = v40[v41];
                                                                v28 = -2;
                                                            }
                                                            catch (oov v42) {
                                                                throw _cv.a(v42);
                                                            }
                                                        }
                                                        try {
                                                            if (v27 != v28) continue;
                                                            v40 = this.ai2;
                                                            v41 = (var16_17 + var13_13) * var12_12 + (var17_18 + var13_13) * var11_11 + var18_20 + var13_13 + 1;
                                                        }
                                                        catch (oov v43) {
                                                            throw _cv.a(v43);
                                                        }
                                                    }
                                                    v40[v41] = var15_16;
                                                    if (var5_5 == 0) continue;
                                                }
                                                ++var17_18;
                                                if (var5_5 == 0) continue block72;
                                            }
                                            break;
                                        }
                                        ++var16_17;
                                        if (var5_5 == 0) continue block70;
                                    }
                                    break;
                                }
                                ++var15_16;
                                if (var5_5 == 0) continue block68;
                            }
                            break;
                        }
                    }
                    v9 = this.ai2[var13_13 * var12_12 + var13_13 * var11_11 + var13_13];
                }
                var14_15 = v9;
                try {
                    try {
                        v44 = var14_15;
                        if (var5_5 != 0) break block103;
                        if (v44 >= 0) {
                        }
                        ** GOTO lbl286
                    }
                    catch (oov v45) {
                        throw _cv.a(v45);
                    }
                    v44 = (int)var1_1.vct(var2_2, var3_3.zvi(_cv.sdu, Boolean.valueOf(false)), 4);
                }
                catch (oov v46) {
                    throw _cv.a(v46);
                }
            }
            try {
                if (var5_5 == 0) break block80;
lbl286:
                // 2 sources

                this.g6u(var1_1, var2_2);
            }
            catch (oov v47) {
                throw _cv.a(v47);
            }
        }
    }

    @Override
    public void kyo(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        block13: {
            int n;
            block15: {
                int n2;
                block14: {
                    block12: {
                        n2 = t9d.b();
                        try {
                            try {
                                n = t9d2.eyz(mew2.nuv());
                                if (n2 == 0) break block12;
                                if (n == 0) break block13;
                            }
                            catch (oov oov2) {
                                throw _cv.a(oov2);
                            }
                            n = t9d.r3_(t9d2, mew2.eve());
                        }
                        catch (oov oov3) {
                            throw _cv.a(oov3);
                        }
                    }
                    try {
                        try {
                            if (n2 == 0) break block14;
                            if (n != 0) break block13;
                        }
                        catch (oov oov4) {
                            throw _cv.a(oov4);
                        }
                        n = random.nextInt(15);
                    }
                    catch (oov oov5) {
                        throw _cv.a(oov5);
                    }
                }
                try {
                    try {
                        if (n2 == 0) break block15;
                        if (n != 1) break block13;
                    }
                    catch (oov oov6) {
                        throw _cv.a(oov6);
                    }
                    n = mew2.getX();
                }
                catch (oov oov7) {
                    throw _cv.a(oov7);
                }
            }
            double d = (float)n + random.nextFloat();
            double d2 = (double)mew2.getY() - 0.05;
            double d3 = (float)mew2.getZ() + random.nextFloat();
            t9d2.zvy(w_0.cde, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    private void g6u(t9d t9d2, mew mew2) {
        this.lf0(t9d2, mew2, t9d2.getBlockState(mew2), 0);
        t9d2.i6x(mew2);
    }

    @Override
    public int bzr(Random random) {
        int n;
        block2: {
            block3: {
                int n2 = t9d.b();
                try {
                    n = random.nextInt(20);
                    if (n2 == 0) break block2;
                    if (n != 0) break block3;
                }
                catch (oov oov2) {
                    throw _cv.a(oov2);
                }
                n = 1;
                break block2;
            }
            n = 0;
        }
        return n;
    }

    @Override
    public u7m j39(zfz zfz2, Random random, int n) {
        return u7m.gfm(ox_.t_k);
    }

    @Override
    public void ix7(t9d t9d2, mew mew2, zfz zfz2, float f, int n) {
        block17: {
            int n2;
            block23: {
                int n3;
                block24: {
                    int n4;
                    block22: {
                        block20: {
                            block21: {
                                block18: {
                                    block19: {
                                        int n5;
                                        block16: {
                                            n4 = t9d.b();
                                            try {
                                                try {
                                                    n5 = t9d2.v0f;
                                                    if (n4 == 0) break block16;
                                                    if (n5 != 0) break block17;
                                                }
                                                catch (oov oov2) {
                                                    throw _cv.a(oov2);
                                                }
                                                n5 = this.b9m(zfz2);
                                            }
                                            catch (oov oov3) {
                                                throw _cv.a(oov3);
                                            }
                                        }
                                        n2 = n5;
                                        try {
                                            n3 = n;
                                            if (n4 == 0) break block18;
                                            if (n3 <= 0) break block19;
                                        }
                                        catch (oov oov4) {
                                            throw _cv.a(oov4);
                                        }
                                        n2 -= 2 << n;
                                        try {
                                            n3 = n2;
                                            if (n4 == 0) break block18;
                                            if (n3 >= 10) break block19;
                                        }
                                        catch (oov oov5) {
                                            throw _cv.a(oov5);
                                        }
                                        n2 = 10;
                                    }
                                    n3 = t9d2.fsy.nextInt(n2);
                                }
                                try {
                                    if (n4 == 0) break block20;
                                    if (n3 != 0) break block21;
                                }
                                catch (oov oov6) {
                                    throw _cv.a(oov6);
                                }
                                u7m u7m2 = this.j39(zfz2, t9d2.fsy, n);
                                _cv.ymu(t9d2, mew2, new erg(u7m2, 1, this.crg(zfz2)));
                            }
                            n2 = 200;
                            n3 = n;
                        }
                        try {
                            if (n4 == 0) break block22;
                            if (n3 <= 0) break block23;
                        }
                        catch (oov oov7) {
                            throw _cv.a(oov7);
                        }
                        n3 = n2 -= 10 << n;
                    }
                    try {
                        try {
                            if (n4 == 0) break block24;
                            if (n3 >= 40) break block23;
                        }
                        catch (oov oov8) {
                            throw _cv.a(oov8);
                        }
                        n3 = 40;
                    }
                    catch (oov oov9) {
                        throw _cv.a(oov9);
                    }
                }
                n2 = n3;
            }
            this.j00(t9d2, mew2, zfz2, n2);
        }
    }

    public void j00(t9d t9d2, mew mew2, zfz zfz2, int n) {
    }

    public int b9m(zfz zfz2) {
        return 20;
    }

    @Override
    public boolean ko5() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    bl = this.d0y;
                    if (n != 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw _cv.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public void gku(boolean bl) {
        boolean bl2;
        block2: {
            block3: {
                this.b6a = bl;
                this.d0y = bl;
                int n = t9d.b();
                try {
                    _cv _cv2 = this;
                    bl2 = bl;
                    if (n == 0) break block2;
                    if (!bl2) break block3;
                }
                catch (oov oov2) {
                    throw _cv.a(oov2);
                }
                bl2 = false;
                break block2;
            }
            bl2 = true;
        }
        _cv2.sqi = bl2 ? 1 : 0;
    }

    @Override
    public w51 w3x() {
        w51 w512;
        try {
            w512 = this.b6a ? w51.oja : w51.exw;
        }
        catch (oov oov2) {
            throw _cv.a(oov2);
        }
        return w512;
    }

    @Override
    public boolean zrr() {
        return false;
    }

    public abstract x54.lti d14(int var1);

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(5314318927755335668L, -1024058960903675849L, MethodHandles.lookup().lookupClass()).a(162678159981601L) ^ 0x6F66884750C5L;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u0011\u0097\u00d5\u00bfw\u00e8y\u000b\u0099\u00a6\u00fdR\u00f9K\\n\u0010\u008c\u00a5\u00acV\u001fU.\u00b42{\f\r\u00f5\u00f4\u00e3\u00c2";
        int n2 = "\u0011\u0097\u00d5\u00bfw\u00e8y\u000b\u0099\u00a6\u00fdR\u00f9K\\n\u0010\u008c\u00a5\u00acV\u001fU.\u00b42{\f\r\u00f5\u00f4\u00e3\u00c2".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _cv.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                g07 = h76.d_1(stringArray2[1]);
                sdu = h76.d_1(stringArray2[0]);
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

