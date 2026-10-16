/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fcu
extends e0x {
    public static final zb_ l4z;
    public static final zb_ b5k;
    public static final zb_ dnl;
    public static final zb_ _a7;
    public static final _ku crs;
    private boolean dv3 = true;
    private final Set zgi = Sets.newHashSet();

    public fcu() {
        super(p3y.f20);
        this.y8l(this._8_.c32().zvi(l4z, (Comparable)((Object)fcu$k9f.o8j)).zvi(b5k, (Comparable)((Object)fcu$k9f.o8j)).zvi(dnl, (Comparable)((Object)fcu$k9f.o8j)).zvi(_a7, (Comparable)((Object)fcu$k9f.o8j)).zvi(crs, Integer.valueOf(0)));
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }

    @Override
    public zfz w1b(zfz zfz2, m5n m5n2, mew mew2) {
        zfz2 = zfz2.zvi(_a7, (Comparable)((Object)this.ool(m5n2, mew2, vt2.te4)));
        zfz2 = zfz2.zvi(b5k, (Comparable)((Object)this.ool(m5n2, mew2, vt2.zk4)));
        zfz2 = zfz2.zvi(l4z, (Comparable)((Object)this.ool(m5n2, mew2, vt2.z9q)));
        zfz2 = zfz2.zvi(dnl, (Comparable)((Object)this.ool(m5n2, mew2, vt2.mxp)));
        return zfz2;
    }

    private fcu$k9f ool(m5n m5n2, mew mew2, vt2 vt22) {
        block23: {
            fcu$k9f fcu$k9f;
            block30: {
                block28: {
                    boolean bl;
                    block29: {
                        int n;
                        mew mew3;
                        block27: {
                            e0x e0x2;
                            e0x e0x3;
                            block24: {
                                zfz zfz2;
                                block26: {
                                    boolean bl2;
                                    block22: {
                                        mew3 = mew2.offset(vt22);
                                        e0x3 = m5n2.getBlockState(mew2.offset(vt22)).r_y();
                                        n = t9d.b();
                                        try {
                                            try {
                                                try {
                                                    bl2 = fcu.oan(m5n2.getBlockState(mew3), vt22);
                                                    if (n == 0) break block22;
                                                    if (bl2) break block23;
                                                }
                                                catch (oov oov2) {
                                                    throw fcu.a(oov2);
                                                }
                                                e0x2 = e0x3;
                                                if (n == 0) break block24;
                                            }
                                            catch (oov oov3) {
                                                throw fcu.a(oov3);
                                            }
                                            bl2 = e0x2.lj1();
                                        }
                                        catch (oov oov4) {
                                            throw fcu.a(oov4);
                                        }
                                    }
                                    try {
                                        block25: {
                                            try {
                                                try {
                                                    if (bl2) break block25;
                                                    zfz2 = m5n2.getBlockState(mew3.eve());
                                                    if (n == 0) break block26;
                                                }
                                                catch (oov oov5) {
                                                    throw fcu.a(oov5);
                                                }
                                                if (fcu.uze(zfz2)) break block23;
                                            }
                                            catch (oov oov6) {
                                                throw fcu.a(oov6);
                                            }
                                        }
                                        zfz2 = m5n2.getBlockState(mew2.nuv());
                                    }
                                    catch (oov oov7) {
                                        throw fcu.a(oov7);
                                    }
                                }
                                e0x2 = zfz2.r_y();
                            }
                            e0x e0x4 = e0x2;
                            try {
                                try {
                                    bl = e0x4.lj1();
                                    if (n == 0) break block27;
                                    if (bl) break block28;
                                }
                                catch (oov oov8) {
                                    throw fcu.a(oov8);
                                }
                                bl = e0x3.lj1();
                            }
                            catch (oov oov9) {
                                throw fcu.a(oov9);
                            }
                        }
                        try {
                            try {
                                if (n == 0) break block29;
                                if (!bl) break block28;
                            }
                            catch (oov oov10) {
                                throw fcu.a(oov10);
                            }
                            bl = fcu.uze(m5n2.getBlockState(mew3.nuv()));
                        }
                        catch (oov oov11) {
                            throw fcu.a(oov11);
                        }
                    }
                    try {
                        if (!bl) break block28;
                        fcu$k9f = fcu$k9f.ycz;
                        break block30;
                    }
                    catch (oov oov12) {
                        throw fcu.a(oov12);
                    }
                }
                fcu$k9f = fcu$k9f.o8j;
            }
            return fcu$k9f;
        }
        return fcu$k9f.u8j;
    }

    @Override
    public nh4 m__(t9d t9d2, mew mew2, zfz zfz2) {
        return null;
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public int j24(m5n m5n2, mew mew2, int n) {
        int n2;
        zfz zfz2 = m5n2.getBlockState(mew2);
        try {
            n2 = zfz2.r_y() != this ? super.j24(m5n2, mew2, n) : this.c0c((Integer)zfz2.dil(crs));
        }
        catch (oov oov2) {
            throw fcu.a(oov2);
        }
        return n2;
    }

    @Override
    public boolean ctq(t9d t9d2, mew mew2) {
        boolean bl;
        block6: {
            block8: {
                int n = t9d.b();
                try {
                    block7: {
                        try {
                            try {
                                bl = t9d.r3_(t9d2, mew2.eve());
                                if (n == 0) break block6;
                                if (bl) break block7;
                            }
                            catch (oov oov2) {
                                throw fcu.a(oov2);
                            }
                            if (t9d2.getBlockState(mew2.eve()).r_y() != ox_.t7q) break block8;
                        }
                        catch (oov oov3) {
                            throw fcu.a(oov3);
                        }
                    }
                    bl = true;
                    break block6;
                }
                catch (oov oov4) {
                    throw fcu.a(oov4);
                }
            }
            bl = false;
        }
        return bl;
    }

    private zfz wl1(t9d t9d2, mew mew2, zfz zfz2) {
        zfz2 = this.mfp(t9d2, mew2, mew2, zfz2);
        ArrayList arrayList = Lists.newArrayList((Iterable)this.zgi);
        int n = t9d.b();
        this.zgi.clear();
        for (mew mew3 : arrayList) {
            t9d2._0o(mew3, this);
            if (n != 0) continue;
        }
        return zfz2;
    }

    /*
     * Unable to fully structure code
     */
    private zfz mfp(t9d var1_1, mew var2_2, mew var3_3, zfz var4_4) {
        block86: {
            block87: {
                block83: {
                    block84: {
                        block82: {
                            block70: {
                                block67: {
                                    block68: {
                                        var6_5 = var4_4;
                                        var7_6 = (Integer)var4_4.dil(fcu.crs);
                                        var8_7 = 0;
                                        var8_7 = this.wd_(var1_1, var3_3, var8_7);
                                        this.dv3 = false;
                                        var9_8 = var1_1.yi4(var2_2);
                                        this.dv3 = true;
                                        var5_9 = t9d.b();
                                        try {
                                            try {
                                                try {
                                                    v0 = var9_8;
                                                    if (var5_9 == 0) break block67;
                                                    if (v0 <= 0) break block68;
                                                }
                                                catch (oov v1) {
                                                    throw fcu.a(v1);
                                                }
                                                v0 = var9_8;
                                                if (var5_9 == 0) break block67;
                                            }
                                            catch (oov v2) {
                                                throw fcu.a(v2);
                                            }
                                            if (v0 <= var8_7 - 1) break block68;
                                        }
                                        catch (oov v3) {
                                            throw fcu.a(v3);
                                        }
                                        var8_7 = var9_8;
                                    }
                                    v0 = 0;
                                }
                                var10_10 = v0;
                                for (vt2 var12_12 : vt2$unz.fzl) {
                                    block77: {
                                        block81: {
                                            block80: {
                                                block79: {
                                                    block75: {
                                                        block78: {
                                                            block76: {
                                                                block73: {
                                                                    block74: {
                                                                        block69: {
                                                                            block72: {
                                                                                var13_14 = var2_2.offset(var12_12);
                                                                                try {
                                                                                    block71: {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        v4 = var13_14.getX();
                                                                                                        if (var5_9 == 0) break block69;
                                                                                                        v5 = var3_3.getX();
                                                                                                        if (var5_9 == 0) break block70;
                                                                                                    }
                                                                                                    catch (oov v6) {
                                                                                                        throw fcu.a(v6);
                                                                                                    }
                                                                                                    if (v4 != v5) break block71;
                                                                                                }
                                                                                                catch (oov v7) {
                                                                                                    throw fcu.a(v7);
                                                                                                }
                                                                                                v4 = var13_14.getZ();
                                                                                                if (var5_9 == 0) break block69;
                                                                                            }
                                                                                            catch (oov v8) {
                                                                                                throw fcu.a(v8);
                                                                                            }
                                                                                            if (v4 == var3_3.getZ()) break block72;
                                                                                        }
                                                                                        catch (oov v9) {
                                                                                            throw fcu.a(v9);
                                                                                        }
                                                                                    }
                                                                                    v4 = 1;
                                                                                    break block69;
                                                                                }
                                                                                catch (oov v10) {
                                                                                    throw fcu.a(v10);
                                                                                }
                                                                            }
                                                                            v4 = 0;
                                                                        }
                                                                        var14_16 = v4;
                                                                        try {
                                                                            v11 = var14_16;
                                                                            if (var5_9 == 0) break block73;
                                                                            if (v11 == 0) break block74;
                                                                        }
                                                                        catch (oov v12) {
                                                                            throw fcu.a(v12);
                                                                        }
                                                                        var10_10 = this.wd_(var1_1, var13_14, var10_10);
                                                                    }
                                                                    v11 = (int)var1_1.getBlockState(var13_14).r_y().y0n();
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var5_9 == 0) break block75;
                                                                                        if (v11 != 0) {
                                                                                        }
                                                                                        ** GOTO lbl130
                                                                                    }
                                                                                    catch (oov v13) {
                                                                                        throw fcu.a(v13);
                                                                                    }
                                                                                    v11 = (int)var1_1.getBlockState(var2_2.nuv()).r_y().y0n();
                                                                                    if (var5_9 == 0) break block75;
                                                                                }
                                                                                catch (oov v14) {
                                                                                    throw fcu.a(v14);
                                                                                }
                                                                                if (v11 == 0) {
                                                                                }
                                                                                ** GOTO lbl130
                                                                            }
                                                                            catch (oov v15) {
                                                                                throw fcu.a(v15);
                                                                            }
                                                                            v16 = var14_16;
                                                                            if (var5_9 == 0) break block76;
                                                                        }
                                                                        catch (oov v17) {
                                                                            throw fcu.a(v17);
                                                                        }
                                                                        if (v16 == 0) break block77;
                                                                    }
                                                                    catch (oov v18) {
                                                                        throw fcu.a(v18);
                                                                    }
                                                                    v16 = var2_2.getY();
                                                                }
                                                                catch (oov v19) {
                                                                    throw fcu.a(v19);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var5_9 == 0) break block78;
                                                                    if (v16 < var3_3.getY()) break block77;
                                                                }
                                                                catch (oov v20) {
                                                                    throw fcu.a(v20);
                                                                }
                                                                v16 = this.wd_(var1_1, var13_14.nuv(), var10_10);
                                                            }
                                                            catch (oov v21) {
                                                                throw fcu.a(v21);
                                                            }
                                                        }
                                                        var10_10 = v16;
                                                        try {
                                                            if (var5_9 != 0) break block77;
lbl130:
                                                            // 3 sources

                                                            v11 = (int)var1_1.getBlockState(var13_14).r_y().y0n();
                                                        }
                                                        catch (oov v22) {
                                                            throw fcu.a(v22);
                                                        }
                                                    }
                                                    try {
                                                        if (var5_9 == 0) break block79;
                                                        if (v11 != 0) break block77;
                                                    }
                                                    catch (oov v23) {
                                                        throw fcu.a(v23);
                                                    }
                                                    v11 = var14_16;
                                                }
                                                try {
                                                    try {
                                                        if (var5_9 == 0) break block80;
                                                        if (v11 == 0) break block77;
                                                    }
                                                    catch (oov v24) {
                                                        throw fcu.a(v24);
                                                    }
                                                    v11 = var2_2.getY();
                                                }
                                                catch (oov v25) {
                                                    throw fcu.a(v25);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var5_9 == 0) break block81;
                                                    if (v11 > var3_3.getY()) break block77;
                                                }
                                                catch (oov v26) {
                                                    throw fcu.a(v26);
                                                }
                                                v11 = this.wd_(var1_1, var13_14.eve(), var10_10);
                                            }
                                            catch (oov v27) {
                                                throw fcu.a(v27);
                                            }
                                        }
                                        var10_10 = v11;
                                    }
                                    if (var5_9 != 0) continue;
                                }
                                try {
                                    v28 = var10_10;
                                    if (var5_9 == 0) break block82;
                                    v5 = var8_7;
                                }
                                catch (oov v29) {
                                    throw fcu.a(v29);
                                }
                            }
                            if (v28 <= v5) ** GOTO lbl182
                            var8_7 = var10_10 - 1;
                            try {
                                if (var5_9 != 0) break block83;
lbl182:
                                // 2 sources

                                v28 = var8_7;
                            }
                            catch (oov v30) {
                                throw fcu.a(v30);
                            }
                        }
                        try {
                            block85: {
                                try {
                                    try {
                                        if (var5_9 == 0) break block84;
                                        if (v28 <= 0) break block85;
                                    }
                                    catch (oov v31) {
                                        throw fcu.a(v31);
                                    }
                                    --var8_7;
                                    if (var5_9 != 0) break block83;
                                }
                                catch (oov v32) {
                                    throw fcu.a(v32);
                                }
                            }
                            v28 = 0;
                        }
                        catch (oov v33) {
                            throw fcu.a(v33);
                        }
                    }
                    var8_7 = v28;
                }
                try {
                    v34 = var9_8;
                    v35 = var8_7 - 1;
                    if (var5_9 == 0) break block86;
                    if (v34 <= v35) break block87;
                }
                catch (oov v36) {
                    throw fcu.a(v36);
                }
                var8_7 = var9_8;
            }
            v34 = var7_6;
            v35 = var8_7;
        }
        if (v34 != v35) {
            block88: {
                block89: {
                    var4_4 = var4_4.zvi(fcu.crs, Integer.valueOf(var8_7));
                    try {
                        try {
                            if (var5_9 == 0) break block88;
                            if (var1_1.getBlockState(var2_2) != var6_5) break block89;
                        }
                        catch (oov v37) {
                            throw fcu.a(v37);
                        }
                        var1_1.vct(var2_2, var4_4, 2);
                    }
                    catch (oov v38) {
                        throw fcu.a(v38);
                    }
                }
                this.zgi.add(var2_2);
            }
            for (vt2 var14_17 : vt2.values()) {
                this.zgi.add(var2_2.offset(var14_17));
                if (var5_9 != 0) continue;
            }
        }
        return var4_4;
    }

    private void bth(t9d t9d2, mew mew2) {
        block6: {
            mew mew3;
            t9d t9d3;
            int n;
            block5: {
                n = t9d.b();
                try {
                    try {
                        t9d3 = t9d2;
                        mew3 = mew2;
                        if (n == 0) break block5;
                        if (t9d3.getBlockState(mew3).r_y() != this) break block6;
                    }
                    catch (oov oov2) {
                        throw fcu.a(oov2);
                    }
                    t9d3 = t9d2;
                    mew3 = mew2;
                }
                catch (oov oov3) {
                    throw fcu.a(oov3);
                }
            }
            t9d3._0o(mew3, this);
            for (vt2 vt22 : vt2.values()) {
                t9d2._0o(mew2.offset(vt22), this);
                if (n != 0) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void tfc(t9d var1_1, mew var2_2, zfz var3_3) {
        block21: {
            block18: {
                block17: {
                    var4_4 = t9d.c();
                    if (var1_1.v0f) break block21;
                    this.wl1(var1_1, var2_2, var3_3);
                    var5_5 = vt2$unz.vrc.iterator();
                    while (var5_5.hasNext()) {
                        var6_6 = (vt2)var5_5.next();
                        try {
                            var1_1._0o(var2_2.offset(var6_6), this);
                            if (var4_4 == 0) {
                                if (var4_4 == 0) continue;
                                break;
                            }
                            break block17;
                        }
                        catch (oov v0) {
                            throw fcu.a(v0);
                        }
                    }
                    var5_5 = vt2$unz.fzl.iterator();
                }
                while (var5_5.hasNext()) {
                    var6_6 = (vt2)var5_5.next();
                    try {
                        this.bth(var1_1, var2_2.offset(var6_6));
                        if (var4_4 == 0) {
                            if (var4_4 == 0) continue;
                            break;
                        }
                        break block18;
                    }
                    catch (oov v1) {
                        throw fcu.a(v1);
                    }
                }
                var5_5 = vt2$unz.fzl.iterator();
            }
            while (var5_5.hasNext()) {
                block20: {
                    block19: {
                        var6_6 = (vt2)var5_5.next();
                        var7_7 = var2_2.offset(var6_6);
                        try {
                            try {
                                if (var4_4 != 0) break block19;
                                if (var1_1.getBlockState(var7_7).r_y().y0n()) {
                                }
                                ** GOTO lbl48
                            }
                            catch (oov v2) {
                                throw fcu.a(v2);
                            }
                            this.bth(var1_1, var7_7.nuv());
                        }
                        catch (oov v3) {
                            throw fcu.a(v3);
                        }
                    }
                    try {
                        if (var4_4 == 0) break block20;
lbl48:
                        // 2 sources

                        this.bth(var1_1, var7_7.eve());
                    }
                    catch (oov v4) {
                        throw fcu.a(v4);
                    }
                }
                if (var4_4 == 0) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void b8f(t9d var1_1, mew var2_2, zfz var3_3) {
        block21: {
            block18: {
                block17: {
                    var4_4 = t9d.b();
                    super.b8f(var1_1, var2_2, var3_3);
                    if (var1_1.v0f) break block21;
                    for (vt2 var8_11 : vt2.values()) {
                        try {
                            var1_1._0o(var2_2.offset(var8_11), this);
                            if (var4_4 != 0) {
                                if (var4_4 != 0) continue;
                                break;
                            }
                            break block17;
                        }
                        catch (oov v0) {
                            throw fcu.a(v0);
                        }
                    }
                    this.wl1(var1_1, var2_2, var3_3);
                }
                var5_5 = vt2$unz.fzl.iterator();
                while (var5_5.hasNext()) {
                    var6_7 = (vt2)var5_5.next();
                    try {
                        this.bth(var1_1, var2_2.offset(var6_7));
                        if (var4_4 != 0) {
                            if (var4_4 != 0) continue;
                            break;
                        }
                        break block18;
                    }
                    catch (oov v1) {
                        throw fcu.a(v1);
                    }
                }
                var5_5 = vt2$unz.fzl.iterator();
            }
            while (var5_5.hasNext()) {
                block20: {
                    block19: {
                        var6_8 = (vt2)var5_5.next();
                        var7_10 = var2_2.offset(var6_8);
                        try {
                            try {
                                if (var4_4 == 0) break block19;
                                if (var1_1.getBlockState(var7_10).r_y().y0n()) {
                                }
                                ** GOTO lbl47
                            }
                            catch (oov v2) {
                                throw fcu.a(v2);
                            }
                            this.bth(var1_1, var7_10.nuv());
                        }
                        catch (oov v3) {
                            throw fcu.a(v3);
                        }
                    }
                    try {
                        if (var4_4 != 0) break block20;
lbl47:
                        // 2 sources

                        this.bth(var1_1, var7_10.eve());
                    }
                    catch (oov v4) {
                        throw fcu.a(v4);
                    }
                }
                if (var4_4 != 0) continue;
            }
        }
    }

    private int wd_(t9d t9d2, mew mew2, int n) {
        int n2;
        block10: {
            block11: {
                zfz zfz2;
                int n3;
                block8: {
                    block9: {
                        n3 = t9d.c();
                        try {
                            try {
                                zfz2 = t9d2.getBlockState(mew2);
                                if (n3 != 0) break block8;
                                if (zfz2.r_y() == this) break block9;
                            }
                            catch (oov oov2) {
                                throw fcu.a(oov2);
                            }
                            return n;
                        }
                        catch (oov oov3) {
                            throw fcu.a(oov3);
                        }
                    }
                    zfz2 = t9d2.getBlockState(mew2);
                }
                int n4 = (Integer)zfz2.dil(crs);
                try {
                    try {
                        n2 = n4;
                        if (n3 != 0) break block10;
                        if (n2 <= n) break block11;
                    }
                    catch (oov oov4) {
                        throw fcu.a(oov4);
                    }
                    n2 = n4;
                    break block10;
                }
                catch (oov oov5) {
                    throw fcu.a(oov5);
                }
            }
            n2 = n;
        }
        return n2;
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        block11: {
            boolean bl;
            int n;
            block10: {
                n = t9d.b();
                try {
                    try {
                        bl = t9d2.v0f;
                        if (n == 0) break block10;
                        if (bl) break block11;
                    }
                    catch (oov oov2) {
                        throw fcu.a(oov2);
                    }
                    bl = this.ctq(t9d2, mew2);
                }
                catch (oov oov3) {
                    throw fcu.a(oov3);
                }
            }
            try {
                block12: {
                    try {
                        try {
                            if (n == 0) break block11;
                            if (!bl) break block12;
                        }
                        catch (oov oov4) {
                            throw fcu.a(oov4);
                        }
                        this.wl1(t9d2, mew2, zfz2);
                        if (n != 0) break block11;
                    }
                    catch (oov oov5) {
                        throw fcu.a(oov5);
                    }
                }
                this.lf0(t9d2, mew2, zfz2, 0);
                bl = t9d2.i6x(mew2);
            }
            catch (oov oov6) {
                throw fcu.a(oov6);
            }
        }
    }

    @Override
    public u7m j39(zfz zfz2, Random random, int n) {
        return xbr.deg;
    }

    @Override
    public int sqt(m5n m5n2, mew mew2, zfz zfz2, vt2 vt22) {
        int n;
        block6: {
            fcu fcu2;
            block4: {
                block5: {
                    int n2 = t9d.b();
                    try {
                        try {
                            fcu2 = this;
                            if (n2 == 0) break block4;
                            if (fcu2.dv3) break block5;
                        }
                        catch (oov oov2) {
                            throw fcu.a(oov2);
                        }
                        n = 0;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw fcu.a(oov3);
                    }
                }
                fcu2 = this;
            }
            n = fcu2.gpi(m5n2, mew2, zfz2, vt22);
        }
        return n;
    }

    @Override
    public int gpi(m5n m5n2, mew mew2, zfz zfz2, vt2 vt22) {
        int n;
        block44: {
            block45: {
                EnumSet<vt2> enumSet;
                int n2;
                int n3;
                block42: {
                    block43: {
                        block40: {
                            block39: {
                                int n4;
                                block38: {
                                    int n5;
                                    block36: {
                                        block37: {
                                            n3 = t9d.b();
                                            try {
                                                try {
                                                    n5 = this.dv3;
                                                    if (n3 == 0) break block36;
                                                    if (n5 != 0) break block37;
                                                }
                                                catch (oov oov2) {
                                                    throw fcu.a(oov2);
                                                }
                                                return 0;
                                            }
                                            catch (oov oov3) {
                                                throw fcu.a(oov3);
                                            }
                                        }
                                        n5 = (Integer)zfz2.dil(crs);
                                    }
                                    n2 = n5;
                                    try {
                                        n4 = n2;
                                        if (n3 == 0) break block38;
                                        if (n4 != 0) break block39;
                                    }
                                    catch (oov oov4) {
                                        throw fcu.a(oov4);
                                    }
                                    n4 = 0;
                                }
                                return n4;
                            }
                            try {
                                if (vt22 == vt2.rf3) {
                                    return n2;
                                }
                            }
                            catch (oov oov5) {
                                throw fcu.a(oov5);
                            }
                            enumSet = EnumSet.noneOf(vt2.class);
                            for (vt2 vt23 : vt2$unz.fzl) {
                                block41: {
                                    try {
                                        try {
                                            try {
                                                n = this.ef3(m5n2, mew2, vt23);
                                                if (n3 == 0) break block40;
                                                if (n3 == 0) break block41;
                                            }
                                            catch (oov oov6) {
                                                throw fcu.a(oov6);
                                            }
                                            if (n == 0) break block41;
                                        }
                                        catch (oov oov7) {
                                            throw fcu.a(oov7);
                                        }
                                        enumSet.add(vt23);
                                    }
                                    catch (oov oov8) {
                                        throw fcu.a(oov8);
                                    }
                                }
                                if (n3 != 0) continue;
                            }
                            n = vt22.e30().pyt();
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (n3 == 0) break block42;
                                        if (n == 0) break block43;
                                    }
                                    catch (oov oov9) {
                                        throw fcu.a(oov9);
                                    }
                                    n = enumSet.isEmpty();
                                    if (n3 == 0) break block42;
                                }
                                catch (oov oov10) {
                                    throw fcu.a(oov10);
                                }
                                if (n == 0) break block43;
                            }
                            catch (oov oov11) {
                                throw fcu.a(oov11);
                            }
                            return n2;
                        }
                        catch (oov oov12) {
                            throw fcu.a(oov12);
                        }
                    }
                    n = enumSet.contains(vt22);
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (n3 == 0) break block44;
                                        if (n == 0) break block45;
                                    }
                                    catch (oov oov13) {
                                        throw fcu.a(oov13);
                                    }
                                    n = enumSet.contains(vt22.tgw()) ? 1 : 0;
                                    if (n3 == 0) break block44;
                                }
                                catch (oov oov14) {
                                    throw fcu.a(oov14);
                                }
                                if (n != 0) break block45;
                            }
                            catch (oov oov15) {
                                throw fcu.a(oov15);
                            }
                            n = enumSet.contains(vt22.drv()) ? 1 : 0;
                            if (n3 == 0) break block44;
                        }
                        catch (oov oov16) {
                            throw fcu.a(oov16);
                        }
                        if (n != 0) break block45;
                    }
                    catch (oov oov17) {
                        throw fcu.a(oov17);
                    }
                    return n2;
                }
                catch (oov oov18) {
                    throw fcu.a(oov18);
                }
            }
            n = 0;
        }
        return n;
    }

    private boolean ef3(m5n m5n2, mew mew2, vt2 vt22) {
        boolean bl;
        block26: {
            block30: {
                int n;
                block29: {
                    boolean bl2;
                    mew mew3;
                    block28: {
                        e0x e0x2;
                        zfz zfz2;
                        block27: {
                            block24: {
                                block25: {
                                    mew3 = mew2.offset(vt22);
                                    zfz2 = m5n2.getBlockState(mew3);
                                    n = t9d.c();
                                    e0x2 = zfz2.r_y();
                                    bl2 = e0x2.y0n();
                                    boolean bl3 = m5n2.getBlockState(mew2.nuv()).r_y().y0n();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            bl = bl3;
                                                            if (n != 0) break block24;
                                                            if (bl) break block25;
                                                        }
                                                        catch (oov oov2) {
                                                            throw fcu.a(oov2);
                                                        }
                                                        bl = bl2;
                                                        if (n != 0) break block24;
                                                    }
                                                    catch (oov oov3) {
                                                        throw fcu.a(oov3);
                                                    }
                                                    if (!bl) break block25;
                                                }
                                                catch (oov oov4) {
                                                    throw fcu.a(oov4);
                                                }
                                                bl = fcu.ssp(m5n2, mew3.nuv());
                                                if (n != 0) break block24;
                                            }
                                            catch (oov oov5) {
                                                throw fcu.a(oov5);
                                            }
                                            if (!bl) break block25;
                                        }
                                        catch (oov oov6) {
                                            throw fcu.a(oov6);
                                        }
                                        bl = true;
                                        break block26;
                                    }
                                    catch (oov oov7) {
                                        throw fcu.a(oov7);
                                    }
                                }
                                bl = fcu.oan(zfz2, vt22);
                            }
                            try {
                                if (n != 0) break block26;
                                if (!bl) break block27;
                            }
                            catch (oov oov8) {
                                throw fcu.a(oov8);
                            }
                            bl = true;
                            break block26;
                        }
                        try {
                            try {
                                if (e0x2 != ox_.duh || zfz2.dil(f8k.em9) != vt22) break block28;
                            }
                            catch (oov oov9) {
                                throw fcu.a(oov9);
                            }
                            bl = true;
                            break block26;
                        }
                        catch (oov oov10) {
                            throw fcu.a(oov10);
                        }
                    }
                    try {
                        try {
                            bl = bl2;
                            if (n != 0) break block29;
                            if (bl) break block30;
                        }
                        catch (oov oov11) {
                            throw fcu.a(oov11);
                        }
                        bl = fcu.ssp(m5n2, mew3.eve());
                    }
                    catch (oov oov12) {
                        throw fcu.a(oov12);
                    }
                }
                try {
                    if (n != 0) break block26;
                    if (!bl) break block30;
                }
                catch (oov oov13) {
                    throw fcu.a(oov13);
                }
                bl = true;
                break block26;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean ssp(m5n m5n2, mew mew2) {
        return fcu.uze(m5n2.getBlockState(mew2));
    }

    public static boolean uze(zfz zfz2) {
        return fcu.oan(zfz2, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean oan(zfz zfz2, vt2 vt22) {
        boolean bl;
        block15: {
            e0x e0x2;
            block16: {
                vt2 vt23;
                vt2 vt24;
                block17: {
                    int n = t9d.c();
                    e0x2 = zfz2.r_y();
                    try {
                        if (e0x2 == ox_.s0f) {
                            return true;
                        }
                    }
                    catch (oov oov2) {
                        throw fcu.a(oov2);
                    }
                    try {
                        bl = ox_.r0f.zl0(e0x2);
                        if (n != 0) break block15;
                        if (!bl) break block16;
                    }
                    catch (oov oov3) {
                        throw fcu.a(oov3);
                    }
                    vt2 vt25 = (vt2)((Object)zfz2.dil(amu.em9));
                    try {
                        try {
                            vt24 = vt25;
                            vt23 = vt22;
                            if (n != 0) break block17;
                            if (vt24 == vt23) return true;
                        }
                        catch (oov oov4) {
                            throw fcu.a(oov4);
                        }
                        vt24 = vt25.b4b();
                        vt23 = vt22;
                    }
                    catch (oov oov5) {
                        throw fcu.a(oov5);
                    }
                }
                try {
                    if (vt24 != vt23) return false;
                    return true;
                }
                catch (oov oov6) {
                    throw fcu.a(oov6);
                }
            }
            bl = e0x2.scl();
        }
        try {
            try {
                if (!bl) return false;
                if (vt22 == null) return false;
                return true;
            }
            catch (oov oov7) {
                throw fcu.a(oov7);
            }
        }
        catch (oov oov8) {
            throw fcu.a(oov8);
        }
    }

    @Override
    public boolean scl() {
        return this.dv3;
    }

    private int c0c(int n) {
        float f;
        float f2;
        float f3;
        block7: {
            float f4;
            block8: {
                int n2;
                block5: {
                    float f5;
                    block6: {
                        float f6 = (float)n / 15.0f;
                        f4 = f6 * 0.6f + 0.4f;
                        n2 = t9d.b();
                        if (n == 0) {
                            f4 = 0.3f;
                        }
                        f3 = f6 * f6 * 0.7f - 0.5f;
                        f2 = f6 * f6 * 0.6f - 0.7f;
                        try {
                            float f7 = f3 - 0.0f;
                            f = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                            if (n2 == 0) break block5;
                            if (f >= 0) break block6;
                        }
                        catch (oov oov2) {
                            throw fcu.a(oov2);
                        }
                        f3 = 0.0f;
                    }
                    f = (f5 = f2 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
                }
                try {
                    if (n2 == 0) break block7;
                    if (f >= 0) break block8;
                }
                catch (oov oov3) {
                    throw fcu.a(oov3);
                }
                f2 = 0.0f;
            }
            f = fe6.faa((int)(f4 * 255.0f), 0, 255);
        }
        float f8 = f;
        int n3 = fe6.faa((int)(f3 * 255.0f), 0, 255);
        int n4 = fe6.faa((int)(f2 * 255.0f), 0, 255);
        return 0xFF000000 | f8 << 16 | n3 << 8 | n4;
    }

    @Override
    public void kyo(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        block5: {
            int n;
            int n2;
            block4: {
                int n3 = t9d.b();
                n2 = (Integer)zfz2.dil(crs);
                try {
                    try {
                        n = n2;
                        if (n3 == 0) break block4;
                        if (n == 0) break block5;
                    }
                    catch (oov oov2) {
                        throw fcu.a(oov2);
                    }
                    n = mew2.getX();
                }
                catch (oov oov3) {
                    throw fcu.a(oov3);
                }
            }
            double d = (double)n + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            double d2 = (float)mew2.getY() + 0.0625f;
            double d3 = (double)mew2.getZ() + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            float f = (float)n2 / 15.0f;
            float f2 = f * 0.6f + 0.4f;
            float f3 = Math.max(0.0f, f * f * 0.7f - 0.5f);
            float f4 = Math.max(0.0f, f * f * 0.6f - 0.7f);
            t9d2.zvy(w_0.dyc, d, d2, d3, f2, f3, f4, new int[0]);
        }
    }

    @Override
    public u7m su9(t9d t9d2, mew mew2) {
        return xbr.deg;
    }

    @Override
    public w51 w3x() {
        return w51.gx9;
    }

    @Override
    public zfz kig(int n) {
        return this.l4i().zvi(crs, Integer.valueOf(n));
    }

    @Override
    public int hvp(zfz zfz2) {
        return (Integer)zfz2.dil(crs);
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{l4z, b5k, dnl, _a7, crs});
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

                var10 = c.a(-8618977942189158277L, 1529237389771308571L, MethodHandles.lookup().lookupClass()).a(99529818216333L) ^ 11126023720174L;
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var10 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var10 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new String[5];
                var6_4 = 0;
                var5_5 = "!A\u00f6\"\u0092\u00df\u00ed\u00a8\b\u0002\u00eaZr\u00c4\u00e6\u00d9\u008d\bv\u0005\u0092~5\u0095\u00e3\u0081";
                var7_6 = "!A\u00f6\"\u0092\u00df\u00ed\u00a8\b\u0002\u00eaZr\u00c4\u00e6\u00d9\u008d\bv\u0005\u0092~5\u0095\u00e3\u0081".length();
                var4_7 = 8;
                var3_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var8_3[var6_4++] = fcu.b(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0017\u001b)W;\u0087Q\u0018\b#\u00e6R\u00aa\u00ce3;`";
                    var7_6 = "\u0017\u001b)W;\u0087Q\u0018\b#\u00e6R\u00aa\u00ce3;`".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var8_3[var6_4++] = fcu.b(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var9_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl50:
                // 1 sources

                ** continue;
            }
        }
        var0_10 = var8_3;
        fcu.l4z = zb_.pq4(var0_10[0], fcu$k9f.class);
        fcu.b5k = zb_.pq4(var0_10[4], fcu$k9f.class);
        fcu.dnl = zb_.pq4(var0_10[3], fcu$k9f.class);
        fcu._a7 = zb_.pq4(var0_10[1], fcu$k9f.class);
        fcu.crs = _ku.wgl(var0_10[2], 0, 15);
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

