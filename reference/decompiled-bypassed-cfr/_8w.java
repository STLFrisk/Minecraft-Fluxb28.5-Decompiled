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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _8w
extends sq9 {
    public static final zb_ sqt;
    public static final h76 hyx;
    private static final long b;
    private static final String[] d;
    private static final String[] h;
    private static final Map i;

    public _8w() {
        super(p3y._mr);
        this.y8l(this._8_.c32().zvi(sqt, (Comparable)((Object)_8w$mc6.jen)).zvi(hyx, Boolean.valueOf(false)));
        this.cot();
    }

    @Override
    public boolean cl2(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92, vt2 vt22, float f, float f2, float f3) {
        t9d t9d3;
        block52: {
            block53: {
                int n;
                block41: {
                    mew mew3;
                    t9d t9d4;
                    boolean bl;
                    block43: {
                        block42: {
                            block51: {
                                ha9$o7a ha9$o7a;
                                Object object;
                                long l;
                                block49: {
                                    Object object2;
                                    block47: {
                                        block48: {
                                            block44: {
                                                block45: {
                                                    block46: {
                                                        t9d t9d5;
                                                        block54: {
                                                            block40: {
                                                                zfz zfz3;
                                                                block39: {
                                                                    block38: {
                                                                        boolean bl2;
                                                                        block37: {
                                                                            l = b ^ 0x35256AB38B84L;
                                                                            n = t9d.c();
                                                                            try {
                                                                                bl2 = t9d2.v0f;
                                                                                if (n != 0) break block37;
                                                                                if (!bl2) break block38;
                                                                            }
                                                                            catch (oov oov2) {
                                                                                throw _8w.a(oov2);
                                                                            }
                                                                            bl2 = true;
                                                                        }
                                                                        return bl2;
                                                                    }
                                                                    try {
                                                                        zfz3 = zfz2;
                                                                        if (n != 0) break block39;
                                                                        if (zfz3.dil(sqt) == _8w$mc6.ang) break block40;
                                                                    }
                                                                    catch (oov oov3) {
                                                                        throw _8w.a(oov3);
                                                                    }
                                                                    mew2 = mew2.offset((vt2)((Object)zfz2.dil(em9)));
                                                                    t9d5 = t9d2;
                                                                    if (n != 0) break block54;
                                                                    zfz3 = zfz2 = t9d5.getBlockState(mew2);
                                                                }
                                                                try {
                                                                    if (zfz3.r_y() != this) {
                                                                        return true;
                                                                    }
                                                                }
                                                                catch (oov oov4) {
                                                                    throw _8w.a(oov4);
                                                                }
                                                            }
                                                            t9d5 = t9d2;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        bl = t9d5.vzz.vm6();
                                                                        if (n != 0) break block41;
                                                                        if (!bl) break block42;
                                                                    }
                                                                    catch (oov oov5) {
                                                                        throw _8w.a(oov5);
                                                                    }
                                                                    t9d4 = t9d2;
                                                                    mew3 = mew2;
                                                                    if (n != 0) break block43;
                                                                }
                                                                catch (oov oov6) {
                                                                    throw _8w.a(oov6);
                                                                }
                                                                if (t9d4.getBiomeGenForCoords(mew3) == gyu.ygn) break block42;
                                                            }
                                                            catch (oov oov7) {
                                                                throw _8w.a(oov7);
                                                            }
                                                            if (!((Boolean)zfz2.dil(hyx)).booleanValue()) break block44;
                                                        }
                                                        catch (oov oov8) {
                                                            throw _8w.a(oov8);
                                                        }
                                                        object2 = this.cpf(t9d2, mew2);
                                                        try {
                                                            try {
                                                                if (n != 0) break block45;
                                                                if (object2 != null) {
                                                                }
                                                                break block46;
                                                            }
                                                            catch (oov oov9) {
                                                                throw _8w.a(oov9);
                                                            }
                                                            ha92.tog(new hsu((String)((Object)_8w.b("x", (int)12473, (long)(0x5B044C7440D6967L ^ l))), new Object[0]));
                                                            return true;
                                                        }
                                                        catch (oov oov10) {
                                                            throw _8w.a(oov10);
                                                        }
                                                    }
                                                    zfz2 = zfz2.zvi(hyx, Boolean.valueOf(false));
                                                }
                                                t9d2.vct(mew2, zfz2, 4);
                                            }
                                            object2 = ha92.zv1(mew2);
                                            try {
                                                object = object2;
                                                ha9$o7a = ha9$o7a.xdw;
                                                if (n != 0) break block47;
                                                if (object != ha9$o7a) break block48;
                                            }
                                            catch (oov oov11) {
                                                throw _8w.a(oov11);
                                            }
                                            zfz2 = zfz2.zvi(hyx, Boolean.valueOf(true));
                                            t9d2.vct(mew2, zfz2, 4);
                                            return true;
                                        }
                                        object = object2;
                                        ha9$o7a = ha9$o7a.ar_;
                                    }
                                    try {
                                        block50: {
                                            try {
                                                try {
                                                    if (n != 0) break block49;
                                                    if (object == ha9$o7a) {
                                                    }
                                                    break block50;
                                                }
                                                catch (oov oov12) {
                                                    throw _8w.a(oov12);
                                                }
                                                ha92.tog(new hsu((String)((Object)_8w.b("x", (int)1663, (long)(0x52899FCEE2EE5FA3L ^ l))), new Object[0]));
                                                if (n == 0) break block51;
                                            }
                                            catch (oov oov13) {
                                                throw _8w.a(oov13);
                                            }
                                        }
                                        object = object2;
                                        ha9$o7a = ha9$o7a.cl6;
                                    }
                                    catch (oov oov14) {
                                        throw _8w.a(oov14);
                                    }
                                }
                                try {
                                    if (object == ha9$o7a) {
                                        ha92.tog(new hsu((String)((Object)_8w.b("x", (int)21736, (long)(0x3FDDFD72496E8D32L ^ l))), new Object[0]));
                                    }
                                }
                                catch (oov oov15) {
                                    throw _8w.a(oov15);
                                }
                            }
                            return true;
                        }
                        t9d4 = t9d2;
                        mew3 = mew2;
                    }
                    bl = t9d4.i6x(mew3);
                }
                mew mew4 = mew2.offset(((vt2)((Object)zfz2.dil(em9))).b4b());
                try {
                    try {
                        t9d3 = t9d2;
                        if (n != 0) break block52;
                        if (t9d3.getBlockState(mew4).r_y() != this) break block53;
                    }
                    catch (oov oov16) {
                        throw _8w.a(oov16);
                    }
                    t9d2.i6x(mew4);
                }
                catch (oov oov17) {
                    throw _8w.a(oov17);
                }
            }
            t9d3 = t9d2;
        }
        t9d3.dta(null, (double)mew2.getX() + 0.5, (double)mew2.getY() + 0.5, (double)mew2.getZ() + 0.5, 5.0f, true, true);
        return true;
    }

    private ha9 cpf(t9d t9d2, mew mew2) {
        int n = t9d.c();
        for (ha9 ha92 : t9d2.rpk) {
            block10: {
                ha9 ha93;
                block11: {
                    boolean bl;
                    block9: {
                        try {
                            try {
                                try {
                                    bl = ha92.ofg();
                                    if (n != 0) break block9;
                                    if (!bl) break block10;
                                }
                                catch (oov oov2) {
                                    throw _8w.a(oov2);
                                }
                                ha93 = ha92;
                                if (n != 0) break block11;
                            }
                            catch (oov oov3) {
                                throw _8w.a(oov3);
                            }
                            bl = ha93.ndt.equals(mew2);
                        }
                        catch (oov oov4) {
                            throw _8w.a(oov4);
                        }
                    }
                    if (!bl) break block10;
                    ha93 = ha92;
                }
                return ha93;
            }
            if (n == 0) continue;
        }
        return null;
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public void c7i(m5n m5n2, mew mew2) {
        this.cot();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void z3l(t9d var1_1, mew var2_2, zfz var3_3, e0x var4_4) {
        block20: {
            block21: {
                block18: {
                    block19: {
                        var5_5 = t9d.b();
                        var6_6 = (vt2)var3_3.dil(_8w.em9);
                        try {
                            try {
                                try {
                                    try {
                                        v0 = var3_3;
                                        if (var5_5 == 0) break block18;
                                        if (v0.dil(_8w.sqt) == _8w$mc6.ang) {
                                        }
                                        ** GOTO lbl35
                                    }
                                    catch (oov v1) {
                                        throw _8w.a(v1);
                                    }
                                    v2 = var1_1;
                                    v3 = var2_2.offset(var6_6.b4b());
                                    if (var5_5 == 0) break block19;
                                }
                                catch (oov v4) {
                                    throw _8w.a(v4);
                                }
                                if (v2.getBlockState(v3).r_y() == this) break block20;
                            }
                            catch (oov v5) {
                                throw _8w.a(v5);
                            }
                            v2 = var1_1;
                            v3 = var2_2;
                        }
                        catch (oov v6) {
                            throw _8w.a(v6);
                        }
                    }
                    try {
                        try {
                            v2.i6x(v3);
                            if (var5_5 != 0) break block20;
lbl35:
                            // 2 sources

                            v7 = var1_1;
                            v8 = var2_2.offset(var6_6);
                            if (var5_5 == 0) break block21;
                        }
                        catch (oov v9) {
                            throw _8w.a(v9);
                        }
                        v0 = v7.getBlockState(v8);
                    }
                    catch (oov v10) {
                        throw _8w.a(v10);
                    }
                }
                try {
                    if (v0.r_y() == this) break block20;
                    v7 = var1_1;
                    v8 = var2_2;
                }
                catch (oov v11) {
                    throw _8w.a(v11);
                }
            }
            try {
                v7.i6x(v8);
                if (!var1_1.v0f) {
                    this.lf0(var1_1, var2_2, var3_3, 0);
                }
            }
            catch (oov v12) {
                throw _8w.a(v12);
            }
        }
    }

    @Override
    public u7m j39(zfz zfz2, Random random, int n) {
        u7m u7m2;
        try {
            u7m2 = zfz2.dil(sqt) == _8w$mc6.ang ? null : xbr.u17;
        }
        catch (oov oov2) {
            throw _8w.a(oov2);
        }
        return u7m2;
    }

    private void cot() {
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.5625f, 1.0f);
    }

    public static mew fay(t9d t9d2, mew mew2, int n) {
        vt2 vt22 = (vt2)((Object)t9d2.getBlockState(mew2).dil(em9));
        int n2 = mew2.getX();
        int n3 = mew2.getY();
        int n4 = mew2.getZ();
        int n5 = t9d.b();
        int n6 = 0;
        block6: while (true) {
            int n7 = n6;
            block7: while (n7 <= 1) {
                int n8 = n2 - vt22.n67() * n6 - 1;
                int n9 = n4 - vt22.ozy() * n6 - 1;
                int n10 = n8 + 2;
                int n11 = n9 + 2;
                int n12 = n8;
                block8: while (true) {
                    int n13 = n12;
                    block9: while (n13 <= n10) {
                        n7 = n9;
                        if (n5 == 0) continue block7;
                        int n14 = n7;
                        while (n14 <= n11) {
                            block11: {
                                block12: {
                                    block13: {
                                        mew mew3 = new mew(n12, n3, n14);
                                        try {
                                            if (n5 == 0) break block11;
                                            n13 = _8w.mq5(t9d2, mew3) ? 1 : 0;
                                            if (n5 == 0) continue block9;
                                        }
                                        catch (oov oov2) {
                                            throw _8w.a(oov2);
                                        }
                                        try {
                                            try {
                                                if (n13 == 0) break block12;
                                                if (n > 0) break block13;
                                            }
                                            catch (oov oov3) {
                                                throw _8w.a(oov3);
                                            }
                                            return mew3;
                                        }
                                        catch (oov oov4) {
                                            throw _8w.a(oov4);
                                        }
                                    }
                                    --n;
                                }
                                ++n14;
                            }
                            if (n5 != 0) continue;
                        }
                        ++n12;
                        if (n5 != 0) continue block8;
                    }
                    break;
                }
                ++n6;
                if (n5 != 0) continue block6;
            }
            break;
        }
        return null;
    }

    public static boolean mq5(t9d t9d2, mew mew2) {
        boolean bl;
        block13: {
            block11: {
                int n;
                block12: {
                    block10: {
                        n = t9d.c();
                        try {
                            try {
                                bl = t9d.r3_(t9d2, mew2.eve());
                                if (n != 0) break block10;
                                if (!bl) break block11;
                            }
                            catch (oov oov2) {
                                throw _8w.a(oov2);
                            }
                            bl = t9d2.getBlockState(mew2).r_y().p1r().gk6();
                        }
                        catch (oov oov3) {
                            throw _8w.a(oov3);
                        }
                    }
                    try {
                        try {
                            if (n != 0) break block12;
                            if (bl) break block11;
                        }
                        catch (oov oov4) {
                            throw _8w.a(oov4);
                        }
                        bl = t9d2.getBlockState(mew2.nuv()).r_y().p1r().gk6();
                    }
                    catch (oov oov5) {
                        throw _8w.a(oov5);
                    }
                }
                try {
                    if (n != 0) break block13;
                    if (bl) break block11;
                }
                catch (oov oov6) {
                    throw _8w.a(oov6);
                }
                bl = true;
                break block13;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void ix7(t9d t9d2, mew mew2, zfz zfz2, float f, int n) {
        try {
            if (zfz2.dil(sqt) == _8w$mc6.jen) {
                super.ix7(t9d2, mew2, zfz2, f, 0);
            }
        }
        catch (oov oov2) {
            throw _8w.a(oov2);
        }
    }

    @Override
    public int quv() {
        return 1;
    }

    @Override
    public w51 w3x() {
        return w51.gx9;
    }

    @Override
    public u7m su9(t9d t9d2, mew mew2) {
        return xbr.u17;
    }

    @Override
    public void f51(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92) {
        block6: {
            mew mew3;
            t9d t9d3;
            block7: {
                int n = t9d.b();
                try {
                    if (!ha92.lls.g40 || zfz2.dil(sqt) != _8w$mc6.ang) break block6;
                }
                catch (oov oov2) {
                    throw _8w.a(oov2);
                }
                mew mew4 = mew2.offset(((vt2)((Object)zfz2.dil(em9))).b4b());
                try {
                    try {
                        t9d3 = t9d2;
                        mew3 = mew4;
                        if (n == 0) break block7;
                        if (t9d3.getBlockState(mew3).r_y() != this) break block6;
                    }
                    catch (oov oov3) {
                        throw _8w.a(oov3);
                    }
                    t9d3 = t9d2;
                    mew3 = mew4;
                }
                catch (oov oov4) {
                    throw _8w.a(oov4);
                }
            }
            t9d3.i6x(mew3);
        }
    }

    @Override
    public zfz kig(int n) {
        zfz zfz2;
        block7: {
            vt2 vt22;
            block4: {
                boolean bl;
                h76 h762;
                zfz zfz3;
                block5: {
                    block6: {
                        int n2 = t9d.c();
                        vt22 = vt2.bm6(n);
                        try {
                            try {
                                if ((n & 8) <= 0) break block4;
                                zfz3 = this.l4i().zvi(sqt, (Comparable)((Object)_8w$mc6.ang)).zvi(em9, (Comparable)((Object)vt22));
                                h762 = hyx;
                                bl = n & 4;
                                if (n2 != 0) break block5;
                            }
                            catch (oov oov2) {
                                throw _8w.a(oov2);
                            }
                            if (bl <= false) break block6;
                        }
                        catch (oov oov3) {
                            throw _8w.a(oov3);
                        }
                        bl = true;
                        break block5;
                    }
                    bl = false;
                }
                zfz2 = zfz3.zvi(h762, Boolean.valueOf(bl));
                break block7;
            }
            zfz2 = this.l4i().zvi(sqt, (Comparable)((Object)_8w$mc6.jen)).zvi(em9, (Comparable)((Object)vt22));
        }
        return zfz2;
    }

    @Override
    public zfz w1b(zfz zfz2, m5n m5n2, mew mew2) {
        zfz zfz3;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    zfz3 = zfz2;
                    if (n == 0) break block4;
                    if (zfz3.dil(sqt) != _8w$mc6.jen) break block5;
                }
                catch (oov oov2) {
                    throw _8w.a(oov2);
                }
                zfz zfz4 = m5n2.getBlockState(mew2.offset((vt2)((Object)zfz2.dil(em9))));
                try {
                    zfz3 = zfz4;
                    if (n == 0) break block4;
                    if (zfz3.r_y() != this) break block5;
                }
                catch (oov oov3) {
                    throw _8w.a(oov3);
                }
                zfz2 = zfz2.zvi(hyx, zfz4.dil(hyx));
            }
            zfz3 = zfz2;
        }
        return zfz3;
    }

    @Override
    public int hvp(zfz zfz2) {
        int n;
        block4: {
            int n2 = t9d.c();
            int n3 = 0;
            n = n3 | ((vt2)((Object)zfz2.dil(em9))).tmy();
            if (n2 == 0) {
                block5: {
                    n3 = n;
                    if (zfz2.dil(sqt) == _8w$mc6.ang) {
                        n3 |= 8;
                        try {
                            n = ((Boolean)zfz2.dil(hyx)).booleanValue() ? 1 : 0;
                            if (n2 != 0) break block4;
                            if (n == 0) break block5;
                        }
                        catch (oov oov2) {
                            throw _8w.a(oov2);
                        }
                        n3 |= 4;
                    }
                }
                n = n3;
            }
        }
        return n;
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{em9, sqt, hyx});
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

                _8w.b = c.a(-2659006492219154465L, 3176348416122074845L, MethodHandles.lookup().lookupClass()).a(94894018849508L);
                var9 = _8w.b ^ 60016193376865L;
                _8w.i = new HashMap<K, V>(13);
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
                var4_5 = "\u00b6|\u0099\u0013\b\u0096Zi\u00a6P\u00fa\u00bf=\u00c5\u00eb\u00ce\u009e\u00ea>\u001aO\u00a8b_\u00f8\u0019Y\u00f5\u001f\u00b6\u00d7@\u00a9.\u0018Q\u00933\u00a5\u00fb\u0010\u00a0\u008bJ.\u00f9\u00d0`o\u0094\u008c1\u009a\u007f\u009em\u00bd \u0083\u00c6\u000b\u00f7x!\u008a\u0019\u009f\u00aaS\u00d5R \u0097?\u0096ZI\u00d8\u00b5U\u00bfB\u00ad\u00cc\u0007\u00dd\u00e0Z\u00b9\u00b8";
                var6_6 = "\u00b6|\u0099\u0013\b\u0096Zi\u00a6P\u00fa\u00bf=\u00c5\u00eb\u00ce\u009e\u00ea>\u001aO\u00a8b_\u00f8\u0019Y\u00f5\u001f\u00b6\u00d7@\u00a9.\u0018Q\u00933\u00a5\u00fb\u0010\u00a0\u008bJ.\u00f9\u00d0`o\u0094\u008c1\u009a\u007f\u009em\u00bd \u0083\u00c6\u000b\u00f7x!\u008a\u0019\u009f\u00aaS\u00d5R \u0097?\u0096ZI\u00d8\u00b5U\u00bfB\u00ad\u00cc\u0007\u00dd\u00e0Z\u00b9\u00b8".length();
                var3_7 = 40;
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
                    var7_3[var5_4++] = _8w.c(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = " \u008f\u0093\u00e8\u00b5\u00e1\u00a9Z\u00e2\u009e\u00d1\u00c8\u00ce\u00fc\u00be\u00a8\u00ca\u0098g.\u0001\u00eb\u00eaL(b\u00c4\u00c5\u00dd\u00a7\u00a4\u00d4\u00ac\u0096^%\u00f4B\u008a\u00cd\u0010L\u00b80Da\u00f7\u00bf\u001c\u0002\u00a7\u0093G\u0015I\u00e7\u009f\u0098\u00d8\u00baO\u00eatR\u00a7";
                    var6_6 = " \u008f\u0093\u00e8\u00b5\u00e1\u00a9Z\u00e2\u009e\u00d1\u00c8\u00ce\u00fc\u00be\u00a8\u00ca\u0098g.\u0001\u00eb\u00eaL(b\u00c4\u00c5\u00dd\u00a7\u00a4\u00d4\u00ac\u0096^%\u00f4B\u008a\u00cd\u0010L\u00b80Da\u00f7\u00bf\u001c\u0002\u00a7\u0093G\u0015I\u00e7\u009f\u0098\u00d8\u00baO\u00eatR\u00a7".length();
                    var3_7 = 24;
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
                    var7_3[var5_4++] = _8w.c(var8_9).intern();
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
        _8w.d = var7_3;
        _8w.h = new String[5];
        _8w.sqt = zb_.pq4((String)_8w.b("x", (int)31308, (long)(7389010019390896758L ^ var9)), _8w$mc6.class);
        _8w.hyx = h76.d_1((String)_8w.b("x", (int)14370, (long)(1269666009130530842L ^ var9)));
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String c(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x716B;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("_8w", exception);
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
            _8w.h[n2] = _8w.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _8w.b(n, l);
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
            throw new RuntimeException("_8w" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8w.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

