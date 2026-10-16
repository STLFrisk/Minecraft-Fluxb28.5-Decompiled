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

public class evg
extends e0x {
    public static final h76 m0p;
    public static final h76 z0g;
    public static final h76 h98;
    public static final h76 w3p;
    public static final h76 vj8;
    public static final h76 mv6;
    public static final h76 u5x;
    public static final h76 bni;

    public evg() {
        super(p3y.f20);
        this.y8l(this._8_.c32().zvi(m0p, Boolean.valueOf(false)).zvi(z0g, Boolean.valueOf(false)).zvi(h98, Boolean.valueOf(false)).zvi(w3p, Boolean.valueOf(false)).zvi(vj8, Boolean.valueOf(false)).zvi(mv6, Boolean.valueOf(false)).zvi(u5x, Boolean.valueOf(false)).zvi(bni, Boolean.valueOf(false)));
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.15625f, 1.0f);
        this._p_(true);
    }

    @Override
    public zfz w1b(zfz zfz2, m5n m5n2, mew mew2) {
        return zfz2.zvi(vj8, Boolean.valueOf(evg.w51(m5n2, mew2, zfz2, vt2.z9q))).zvi(mv6, Boolean.valueOf(evg.w51(m5n2, mew2, zfz2, vt2.zk4))).zvi(u5x, Boolean.valueOf(evg.w51(m5n2, mew2, zfz2, vt2.mxp))).zvi(bni, Boolean.valueOf(evg.w51(m5n2, mew2, zfz2, vt2.te4)));
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
    public w51 w3x() {
        return w51.mem;
    }

    @Override
    public u7m j39(zfz zfz2, Random random, int n) {
        return xbr.eij;
    }

    @Override
    public u7m su9(t9d t9d2, mew mew2) {
        return xbr.eij;
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        block8: {
            boolean bl;
            boolean bl2;
            int n;
            block6: {
                block7: {
                    n = t9d.c();
                    bl2 = (Boolean)zfz2.dil(z0g);
                    try {
                        bl = t9d.r3_(t9d2, mew2.eve());
                        if (n != 0) break block6;
                        if (bl) break block7;
                    }
                    catch (oov oov2) {
                        throw evg.a(oov2);
                    }
                    bl = true;
                    break block6;
                }
                bl = false;
            }
            boolean bl3 = bl;
            try {
                boolean bl4;
                try {
                    bl4 = bl2;
                    if (n != 0 || bl4 == bl3) break block8;
                }
                catch (oov oov3) {
                    throw evg.a(oov3);
                }
                this.lf0(t9d2, mew2, zfz2, 0);
                bl4 = t9d2.i6x(mew2);
            }
            catch (oov oov4) {
                throw evg.a(oov4);
            }
        }
    }

    @Override
    public void c7i(m5n m5n2, mew mew2) {
        block12: {
            boolean bl;
            int n;
            block10: {
                zfz zfz2 = m5n2.getBlockState(mew2);
                boolean bl2 = (Boolean)zfz2.dil(h98);
                boolean bl3 = (Boolean)zfz2.dil(z0g);
                n = t9d.b();
                try {
                    block11: {
                        try {
                            try {
                                bl = bl3;
                                if (n == 0) break block10;
                                if (bl) break block11;
                            }
                            catch (oov oov2) {
                                throw evg.a(oov2);
                            }
                            this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.09375f, 1.0f);
                            if (n != 0) break block12;
                        }
                        catch (oov oov3) {
                            throw evg.a(oov3);
                        }
                    }
                    bl = bl2;
                }
                catch (oov oov4) {
                    throw evg.a(oov4);
                }
            }
            try {
                block13: {
                    try {
                        if (bl) break block13;
                        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
                        if (n != 0) break block12;
                    }
                    catch (oov oov5) {
                        throw evg.a(oov5);
                    }
                }
                this.xl4(0.0f, 0.0625f, 0.0f, 1.0f, 0.15625f, 1.0f);
            }
            catch (oov oov6) {
                throw evg.a(oov6);
            }
        }
    }

    @Override
    public void tfc(t9d t9d2, mew mew2, zfz zfz2) {
        boolean bl;
        h76 h762;
        zfz zfz3;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    zfz3 = zfz2;
                    h762 = z0g;
                    bl = t9d.r3_(t9d2, mew2.eve());
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw evg.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        zfz2 = zfz3.zvi(h762, Boolean.valueOf(bl));
        t9d2.vct(mew2, zfz2, 3);
        this.whx(t9d2, mew2, zfz2);
    }

    @Override
    public void b8f(t9d t9d2, mew mew2, zfz zfz2) {
        this.whx(t9d2, mew2, zfz2.zvi(m0p, Boolean.valueOf(true)));
    }

    @Override
    public void f51(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92) {
        block9: {
            erg erg2;
            block10: {
                int n = t9d.c();
                try {
                    try {
                        try {
                            if (t9d2.v0f) break block9;
                            erg2 = ha92.b5z();
                            if (n != 0) break block10;
                        }
                        catch (oov oov2) {
                            throw evg.a(oov2);
                        }
                        if (erg2 == null) break block9;
                    }
                    catch (oov oov3) {
                        throw evg.a(oov3);
                    }
                    erg2 = ha92.b5z();
                }
                catch (oov oov4) {
                    throw evg.a(oov4);
                }
            }
            try {
                if (erg2.gn1() == xbr.qsl) {
                    t9d2.vct(mew2, zfz2.zvi(w3p, Boolean.valueOf(true)), 4);
                }
            }
            catch (oov oov5) {
                throw evg.a(oov5);
            }
        }
    }

    private void whx(t9d t9d2, mew mew2, zfz zfz2) {
        vt2[] vt2Array = new vt2[]{vt2.mxp, vt2.te4};
        int n = vt2Array.length;
        int n2 = t9d.c();
        int n3 = 0;
        while (n3 < n) {
            block12: {
                vt2 vt22 = vt2Array[n3];
                for (int i = 1; i < 42; ++i) {
                    e0x e0x2;
                    e0x e0x3;
                    block13: {
                        mew mew3 = mew2.offset(vt22, i);
                        zfz zfz3 = t9d2.getBlockState(mew3);
                        try {
                            block14: {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n2 != 0) break block12;
                                                e0x3 = zfz3.r_y();
                                                e0x2 = ox_.r11;
                                                if (n2 != 0) break block13;
                                            }
                                            catch (oov oov2) {
                                                throw evg.a(oov2);
                                            }
                                            if (e0x3 != e0x2) break block14;
                                        }
                                        catch (oov oov3) {
                                            throw evg.a(oov3);
                                        }
                                        if (zfz3.dil(l2c._ic) != vt22.b4b()) break;
                                    }
                                    catch (oov oov4) {
                                        throw evg.a(oov4);
                                    }
                                    ox_.r11.khf(t9d2, mew3, zfz3, false, true, i, zfz2);
                                    if (n2 == 0) break;
                                }
                                catch (oov oov5) {
                                    throw evg.a(oov5);
                                }
                            }
                            e0x3 = zfz3.r_y();
                            e0x2 = ox_.s7a;
                        }
                        catch (oov oov6) {
                            throw evg.a(oov6);
                        }
                    }
                    if (e0x3 != e0x2) break;
                    if (n2 == 0) continue;
                }
                ++n3;
            }
            if (n2 == 0) continue;
        }
    }

    @Override
    public void n9e(t9d t9d2, mew mew2, zfz zfz2, i2h i2h2) {
        block8: {
            boolean bl;
            block7: {
                int n = t9d.c();
                try {
                    try {
                        bl = t9d2.v0f;
                        if (n != 0) break block7;
                        if (bl) break block8;
                    }
                    catch (oov oov2) {
                        throw evg.a(oov2);
                    }
                    bl = (Boolean)zfz2.dil(m0p);
                }
                catch (oov oov3) {
                    throw evg.a(oov3);
                }
            }
            try {
                if (!bl) {
                    this.wuj(t9d2, mew2);
                }
            }
            catch (oov oov4) {
                throw evg.a(oov4);
            }
        }
    }

    @Override
    public void ff3(t9d t9d2, mew mew2, zfz zfz2, Random random) {
    }

    @Override
    public void zvy(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        block8: {
            boolean bl;
            block7: {
                int n = t9d.b();
                try {
                    try {
                        bl = t9d2.v0f;
                        if (n == 0) break block7;
                        if (bl) break block8;
                    }
                    catch (oov oov2) {
                        throw evg.a(oov2);
                    }
                    bl = (Boolean)t9d2.getBlockState(mew2).dil(m0p);
                }
                catch (oov oov3) {
                    throw evg.a(oov3);
                }
            }
            try {
                if (bl) {
                    this.wuj(t9d2, mew2);
                }
            }
            catch (oov oov4) {
                throw evg.a(oov4);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void wuj(t9d var1_1, mew var2_2) {
        block18: {
            block19: {
                block15: {
                    block16: {
                        var4_3 = var1_1.getBlockState(var2_2);
                        var5_4 = (Boolean)var4_3.dil(evg.m0p);
                        var6_5 = false;
                        var3_6 = t9d.b();
                        var7_7 = var1_1.p05(null, new nh4((double)var2_2.getX() + this.d80, (double)var2_2.getY() + this.tcq, (double)var2_2.getZ() + this.iac, (double)var2_2.getX() + this.smy, (double)var2_2.getY() + this.lpg, (double)var2_2.getZ() + this.nlu));
                        try {
                            v0 = var7_7.isEmpty();
                            if (var3_6 == 0) break block15;
                            if (v0) break block16;
                        }
                        catch (oov v1) {
                            throw evg.a(v1);
                        }
                        for (i2h var9_9 : var7_7) {
                            block17: {
                                try {
                                    try {
                                        v0 = var9_9.l__();
                                        if (var3_6 == 0) break block15;
                                        if (var3_6 == 0) break block17;
                                    }
                                    catch (oov v2) {
                                        throw evg.a(v2);
                                    }
                                    if (!v0) {
                                    }
                                    ** GOTO lbl32
                                }
                                catch (oov v3) {
                                    throw evg.a(v3);
                                }
                                v4 = true;
                            }
                            var6_5 = v4;
                            try {
                                if (var3_6 != 0) break;
lbl32:
                                // 2 sources

                                if (var3_6 != 0) continue;
                                break;
                            }
                            catch (oov v5) {
                                throw evg.a(v5);
                            }
                        }
                    }
                    v0 = var6_5;
                }
                try {
                    if (var3_6 == 0) break block18;
                    if (v0 == var5_4) break block19;
                }
                catch (oov v6) {
                    throw evg.a(v6);
                }
                var4_3 = var4_3.zvi(evg.m0p, Boolean.valueOf(var6_5));
                var1_1.vct(var2_2, var4_3, 3);
                this.whx(var1_1, var2_2, var4_3);
            }
            v0 = var6_5;
        }
        try {
            if (v0) {
                var1_1.cjk(var2_2, this, this.odp(var1_1));
            }
        }
        catch (oov v7) {
            throw evg.a(v7);
        }
    }

    public static boolean w51(m5n m5n2, mew mew2, zfz zfz2, vt2 vt22) {
        e0x e0x2;
        e0x e0x3;
        int n;
        zfz zfz3;
        block9: {
            e0x e0x4;
            block10: {
                boolean bl;
                mew mew3 = mew2.offset(vt22);
                zfz3 = m5n2.getBlockState(mew3);
                n = t9d.b();
                e0x4 = zfz3.r_y();
                try {
                    e0x3 = e0x4;
                    e0x2 = ox_.r11;
                    if (n == 0) break block9;
                    if (e0x3 != e0x2) break block10;
                }
                catch (oov oov2) {
                    throw evg.a(oov2);
                }
                vt2 vt23 = vt22.b4b();
                try {
                    bl = zfz3.dil(l2c._ic) == vt23;
                }
                catch (oov oov3) {
                    throw evg.a(oov3);
                }
                return bl;
            }
            e0x3 = e0x4;
            e0x2 = ox_.s7a;
        }
        if (e0x3 == e0x2) {
            boolean bl;
            block11: {
                block12: {
                    boolean bl2 = (Boolean)zfz2.dil(z0g);
                    boolean bl3 = (Boolean)zfz3.dil(z0g);
                    try {
                        try {
                            bl = bl2;
                            if (n == 0) break block11;
                            if (bl != bl3) break block12;
                        }
                        catch (oov oov4) {
                            throw evg.a(oov4);
                        }
                        bl = true;
                        break block11;
                    }
                    catch (oov oov5) {
                        throw evg.a(oov5);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    public zfz kig(int n) {
        boolean bl;
        h76 h762;
        zfz zfz2;
        block14: {
            block15: {
                boolean bl2;
                h76 h763;
                zfz zfz3;
                int n2;
                block12: {
                    block13: {
                        boolean bl3;
                        h76 h764;
                        zfz zfz4;
                        block10: {
                            block11: {
                                boolean bl4;
                                h76 h765;
                                zfz zfz5;
                                block8: {
                                    block9: {
                                        n2 = t9d.b();
                                        try {
                                            zfz5 = this.l4i();
                                            h765 = m0p;
                                            bl4 = n & 1;
                                            if (n2 == 0) break block8;
                                            if (bl4 <= false) break block9;
                                        }
                                        catch (oov oov2) {
                                            throw evg.a(oov2);
                                        }
                                        bl4 = true;
                                        break block8;
                                    }
                                    bl4 = false;
                                }
                                try {
                                    zfz4 = zfz5.zvi(h765, Boolean.valueOf(bl4));
                                    h764 = z0g;
                                    bl3 = n & 2;
                                    if (n2 == 0) break block10;
                                    if (bl3 <= false) break block11;
                                }
                                catch (oov oov3) {
                                    throw evg.a(oov3);
                                }
                                bl3 = true;
                                break block10;
                            }
                            bl3 = false;
                        }
                        try {
                            zfz3 = zfz4.zvi(h764, Boolean.valueOf(bl3));
                            h763 = h98;
                            bl2 = n & 4;
                            if (n2 == 0) break block12;
                            if (bl2 <= false) break block13;
                        }
                        catch (oov oov4) {
                            throw evg.a(oov4);
                        }
                        bl2 = true;
                        break block12;
                    }
                    bl2 = false;
                }
                try {
                    zfz2 = zfz3.zvi(h763, Boolean.valueOf(bl2));
                    h762 = w3p;
                    bl = n & 8;
                    if (n2 == 0) break block14;
                    if (bl <= false) break block15;
                }
                catch (oov oov5) {
                    throw evg.a(oov5);
                }
                bl = true;
                break block14;
            }
            bl = false;
        }
        return zfz2.zvi(h762, Boolean.valueOf(bl));
    }

    @Override
    public int hvp(zfz zfz2) {
        int n;
        block14: {
            int n2;
            block15: {
                int n3;
                block12: {
                    block13: {
                        block10: {
                            block11: {
                                block8: {
                                    block9: {
                                        n3 = t9d.b();
                                        n2 = 0;
                                        try {
                                            n = ((Boolean)zfz2.dil(m0p)).booleanValue();
                                            if (n3 == 0) break block8;
                                            if (n == 0) break block9;
                                        }
                                        catch (oov oov2) {
                                            throw evg.a(oov2);
                                        }
                                        n2 |= 1;
                                    }
                                    n = ((Boolean)zfz2.dil(z0g)).booleanValue();
                                }
                                try {
                                    if (n3 == 0) break block10;
                                    if (n == 0) break block11;
                                }
                                catch (oov oov3) {
                                    throw evg.a(oov3);
                                }
                                n2 |= 2;
                            }
                            n = ((Boolean)zfz2.dil(h98)).booleanValue();
                        }
                        try {
                            if (n3 == 0) break block12;
                            if (n == 0) break block13;
                        }
                        catch (oov oov4) {
                            throw evg.a(oov4);
                        }
                        n2 |= 4;
                    }
                    n = ((Boolean)zfz2.dil(w3p)).booleanValue() ? 1 : 0;
                }
                try {
                    if (n3 == 0) break block14;
                    if (n == 0) break block15;
                }
                catch (oov oov5) {
                    throw evg.a(oov5);
                }
                n2 |= 8;
            }
            n = n2;
        }
        return n;
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{m0p, z0g, h98, w3p, vj8, mv6, bni, u5x});
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

                var10 = c.a(-8085418392312476089L, -9222931857476214371L, MethodHandles.lookup().lookupClass()).a(183974476276540L) ^ 46939556784695L;
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
                var8_3 = new String[8];
                var6_4 = 0;
                var5_5 = "0\u00cb\u000eh\u00e3\u009eq}d\u009e3\u00b1\u00fc\u00a1b\u00ca\b\u00f5\u00f5\u00881\u0003\u00dc\u00b1\u00e0\u0010!2\u0016%\u001bQ\u001c\u008c\u001c\u008bd\u00b0\u00ea\u00032#\b\u00ba`\u00b6\u00d5C\u00ee\u00e5\"\bI*\u0002\u0092;\u0006?\r\b\u000e\u0011\u00d6W\u00e1\u0097U6";
                var7_6 = "0\u00cb\u000eh\u00e3\u009eq}d\u009e3\u00b1\u00fc\u00a1b\u00ca\b\u00f5\u00f5\u00881\u0003\u00dc\u00b1\u00e0\u0010!2\u0016%\u001bQ\u001c\u008c\u001c\u008bd\u00b0\u00ea\u00032#\b\u00ba`\u00b6\u00d5C\u00ee\u00e5\"\bI*\u0002\u0092;\u0006?\r\b\u000e\u0011\u00d6W\u00e1\u0097U6".length();
                var4_7 = 16;
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
                    var8_3[var6_4++] = evg.b(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00c2\u00df!\u00fb\u001aX\u00fe\u001f\u00ec\u0081'\u00a8W\u001c\u00ffR\b\u0094x-\u0011c66\u00fe";
                    var7_6 = "\u00c2\u00df!\u00fb\u001aX\u00fe\u001f\u00ec\u0081'\u00a8W\u001c\u00ffR\b\u0094x-\u0011c66\u00fe".length();
                    var4_7 = 16;
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
                    var8_3[var6_4++] = evg.b(var9_9).intern();
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
        evg.m0p = h76.d_1(var0_10[7]);
        evg.z0g = h76.d_1(var0_10[6]);
        evg.h98 = h76.d_1(var0_10[2]);
        evg.w3p = h76.d_1(var0_10[0]);
        evg.vj8 = h76.d_1(var0_10[5]);
        evg.mv6 = h76.d_1(var0_10[4]);
        evg.u5x = h76.d_1(var0_10[3]);
        evg.bni = h76.d_1(var0_10[1]);
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

