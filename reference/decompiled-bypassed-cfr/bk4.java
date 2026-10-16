/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bk4 {
    private /* synthetic */ hpk t78;
    private static final long a = c.a(8135119113749449475L, 4444238549757092198L, MethodHandles.lookup().lookupClass()).a(62359727409645L);
    private static final String b;

    public static String zb0(e0x e0x2) {
        String string;
        block20: {
            String string2;
            block19: {
                int n;
                block18: {
                    String string3;
                    erg erg2;
                    e0x e0x3;
                    int n2;
                    block16: {
                        block17: {
                            long l = a ^ 0xC22C3DDD178L;
                            n2 = t9d.c();
                            try {
                                try {
                                    e0x3 = e0x2;
                                    if (n2 != 0) break block16;
                                    if (e0x3 != ox_.ibw) break block17;
                                }
                                catch (oov oov2) {
                                    throw bk4.a(oov2);
                                }
                                return null;
                            }
                            catch (oov oov3) {
                                throw bk4.a(oov3);
                            }
                        }
                        e0x3 = e0x2;
                    }
                    u7m u7m2 = u7m.gfm(e0x3);
                    try {
                        erg2 = u7m2 != null ? new erg(u7m.rya(e0x2.abc()), 1, 0) : null;
                    }
                    catch (oov oov4) {
                        throw bk4.a(oov4);
                    }
                    erg erg3 = erg2;
                    try {
                        string3 = erg3 == null ? e0x2.ieu() : u7m2.ily(erg3);
                    }
                    catch (oov oov5) {
                        throw bk4.a(oov5);
                    }
                    string2 = string3;
                    try {
                        try {
                            try {
                                n = string2.length();
                                if (n2 != 0) break block18;
                                if (n <= 5) break block19;
                            }
                            catch (oov oov6) {
                                throw bk4.a(oov6);
                            }
                            string = string2.substring(0, 5);
                            if (n2 != 0) break block20;
                        }
                        catch (oov oov7) {
                            throw bk4.a(oov7);
                        }
                        n = string.equals(b) ? 1 : 0;
                    }
                    catch (oov oov8) {
                        throw bk4.a(oov8);
                    }
                }
                try {
                    if (n == 0) break block19;
                    string = e0x2.abc();
                    break block20;
                }
                catch (oov oov9) {
                    throw bk4.a(oov9);
                }
            }
            string = string2;
        }
        return string;
    }

    public static boolean m2x() {
        boolean bl;
        block20: {
            boolean bl2;
            block21: {
                boolean bl3;
                block18: {
                    block19: {
                        int n = t9d.b();
                        bl2 = false;
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            bl3 = bk4.izc(c05.vz1().vg8, 0.31f, 0.0, 0.31f) instanceof g7u;
                                                            if (n == 0) break block18;
                                                            if (bl3) break block19;
                                                        }
                                                        catch (oov oov2) {
                                                            throw bk4.a(oov2);
                                                        }
                                                        bl3 = bk4.izc(c05.vz1().vg8, -0.31f, 0.0, -0.31f) instanceof g7u;
                                                        if (n == 0) break block18;
                                                    }
                                                    catch (oov oov3) {
                                                        throw bk4.a(oov3);
                                                    }
                                                    if (bl3) break block19;
                                                }
                                                catch (oov oov4) {
                                                    throw bk4.a(oov4);
                                                }
                                                bl3 = bk4.izc(c05.vz1().vg8, 0.31f, 0.0, -0.31f) instanceof g7u;
                                                if (n == 0) break block18;
                                            }
                                            catch (oov oov5) {
                                                throw bk4.a(oov5);
                                            }
                                            if (bl3) break block19;
                                        }
                                        catch (oov oov6) {
                                            throw bk4.a(oov6);
                                        }
                                        bl3 = bk4.izc(c05.vz1().vg8, -0.31f, 0.0, 0.31f) instanceof g7u;
                                        if (n == 0) break block18;
                                    }
                                    catch (oov oov7) {
                                        throw bk4.a(oov7);
                                    }
                                    if (bl3) break block19;
                                }
                                catch (oov oov8) {
                                    throw bk4.a(oov8);
                                }
                                bl = bk4._r5(c05.vz1().vg8, 1.05f, 1.05f) instanceof g7u;
                                if (n == 0) break block20;
                            }
                            catch (oov oov9) {
                                throw bk4.a(oov9);
                            }
                            if (!bl) break block21;
                        }
                        catch (oov oov10) {
                            throw bk4.a(oov10);
                        }
                    }
                    bl3 = true;
                }
                bl2 = bl3;
            }
            bl = bl2;
        }
        return bl;
    }

    public static e0x _r5(ha9 ha92, float f, float f2) {
        double d = ha92.o2v + ha92.icv * (double)f;
        double d2 = ha92.vbd + ha92.bw4 * (double)f2;
        return bk4.rwa(new mew(d, ha92.kfp, d2));
    }

    public static e0x rwa(mew mew2) {
        zfz zfz2 = c05.vz1().tij.getBlockState(mew2);
        return zfz2.r_y();
    }

    public static void m6f(mew mew2, vt2 vt22) {
        block4: {
            erg erg2;
            block5: {
                int n = t9d.b();
                erg2 = c05.vz1().vg8.up_.dxs();
                try {
                    try {
                        if (n == 0) break block4;
                        if (erg2 != null) break block5;
                    }
                    catch (oov oov2) {
                        throw bk4.a(oov2);
                    }
                    return;
                }
                catch (oov oov3) {
                    throw bk4.a(oov3);
                }
            }
            c05.vz1().l7q.onPlayerRightClick(c05.vz1().vg8, c05.vz1().tij, erg2, mew2, vt22, new fqr(mew2.getX(), mew2.getY(), mew2.getZ()));
        }
    }

    /*
     * Unable to fully structure code
     */
    public static double w8a() {
        block20: {
            var1 = 0.0;
            var3_1 = c05.vz1().vg8.kfp;
            var0_2 = t9d.c();
            while (var3_1 > 0.0) {
                block23: {
                    block22: {
                        block21: {
                            var5_3 = bk4._82(new mew(c05.vz1().vg8.o2v, var3_1, c05.vz1().vg8.vbd));
                            try {
                                try {
                                    try {
                                        if (var0_2 != 0) break block20;
                                        v0 = var5_3;
                                        if (var0_2 != 0) break block21;
                                    }
                                    catch (oov v1) {
                                        throw bk4.a(v1);
                                    }
                                    if (v0.p1r() != p3y.cei) {
                                    }
                                    ** GOTO lbl49
                                }
                                catch (oov v2) {
                                    throw bk4.a(v2);
                                }
                                v0 = var5_3;
                            }
                            catch (oov v3) {
                                throw bk4.a(v3);
                            }
                        }
                        try {
                            try {
                                try {
                                    v4 = v0.lj1();
                                    if (var0_2 != 0) break block22;
                                    if (v4 != 0) {
                                    }
                                    ** GOTO lbl49
                                }
                                catch (oov v5) {
                                    throw bk4.a(v5);
                                }
                                v4 = (int)var5_3.siy();
                                if (var0_2 != 0) break block22;
                            }
                            catch (oov v6) {
                                throw bk4.a(v6);
                            }
                            if (v4 != 0) {
                            }
                            ** GOTO lbl49
                        }
                        catch (oov v7) {
                            throw bk4.a(v7);
                        }
                        var1 = var3_1;
                        try {
                            try {
                                if (var0_2 == 0) break;
lbl49:
                                // 4 sources

                                v8 = var3_1;
                                v9 = 0.0;
                                if (var0_2 != 0) break block23;
                            }
                            catch (oov v10) {
                                throw bk4.a(v10);
                            }
                            cfr_temp_0 = v8 - v9;
                            v4 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                        }
                        catch (oov v11) {
                            throw bk4.a(v11);
                        }
                    }
                    if (v4 < 0) break;
                    v8 = var3_1;
                    v9 = 1.0;
                }
                var3_1 = v8 - v9;
                if (var0_2 == 0) continue;
            }
            var3_1 = c05.vz1().vg8.kfp - var1 - 1.0;
        }
        return var3_1;
    }

    public static e0x dub(ha9 ha92, double d) {
        return bk4._82(new mew(ha92.o2v, ha92.kfp - d, ha92.vbd));
    }

    public static e0x izc(ha9 ha92, double d, double d2, double d3) {
        return bk4._82(new mew(ha92.o2v - d, ha92.kfp - d2, ha92.vbd - d3));
    }

    public static boolean oa9() {
        int n;
        block14: {
            int n2;
            block15: {
                int n3 = t9d.c();
                n2 = 0;
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            n = bk4.izc(c05.vz1().vg8, 0.3f, 0.1f, 0.3f).p1r().l7j();
                                            if (n3 != 0) break block14;
                                            if (n == 0) break block15;
                                        }
                                        catch (oov oov2) {
                                            throw bk4.a(oov2);
                                        }
                                        n = bk4.izc(c05.vz1().vg8, -0.3f, 0.1f, -0.3f).p1r().l7j();
                                        if (n3 != 0) break block14;
                                    }
                                    catch (oov oov3) {
                                        throw bk4.a(oov3);
                                    }
                                    if (n == 0) break block15;
                                }
                                catch (oov oov4) {
                                    throw bk4.a(oov4);
                                }
                                n = (Integer)c05.vz1().tij.getBlockState(new mew(c05.vz1().vg8.o2v - 0.3, c05.vz1().vg8.kfp - 0.1, c05.vz1().vg8.vbd - 0.3)).dil(hmv.nfg);
                                if (n3 != 0) break block14;
                            }
                            catch (oov oov5) {
                                throw bk4.a(oov5);
                            }
                            if (n != 0) break block15;
                        }
                        catch (oov oov6) {
                            throw bk4.a(oov6);
                        }
                        n = (Integer)c05.vz1().tij.getBlockState(new mew(c05.vz1().vg8.o2v + 0.3, c05.vz1().vg8.kfp - 0.1, c05.vz1().vg8.vbd + 0.3)).dil(hmv.nfg);
                        if (n3 != 0) break block14;
                    }
                    catch (oov oov7) {
                        throw bk4.a(oov7);
                    }
                    if (n != 0) break block15;
                }
                catch (oov oov8) {
                    throw bk4.a(oov8);
                }
                n2 = 1;
            }
            n = n2;
        }
        return n != 0;
    }

    public static boolean _t6() {
        boolean bl;
        block12: {
            block11: {
                e0x e0x2;
                e0x e0x3;
                int n;
                l86 l862;
                block10: {
                    l862 = c05.vz1().vg8;
                    double d = l862.aaw().sy_((double)0.0, (double)-0.01, (double)0.0).bx_;
                    n = t9d.b();
                    e0x3 = c05.vz1().tij.getBlockState(new mew(l862.o2v, d, l862.vbd)).r_y();
                    try {
                        e0x2 = e0x3;
                        if (n == 0) break block10;
                        if (e0x2 == null) break block11;
                    }
                    catch (oov oov2) {
                        throw bk4.a(oov2);
                    }
                    e0x2 = e0x3;
                }
                try {
                    try {
                        try {
                            try {
                                bl = e0x2 instanceof n47;
                                if (n == 0) break block12;
                                if (bl) break block11;
                            }
                            catch (oov oov3) {
                                throw bk4.a(oov3);
                            }
                            bl = e0x3 instanceof hmv;
                            if (n == 0) break block12;
                        }
                        catch (oov oov4) {
                            throw bk4.a(oov4);
                        }
                        if (bl) break block11;
                    }
                    catch (oov oov5) {
                        throw bk4.a(oov5);
                    }
                    return l862.lfk;
                }
                catch (oov oov6) {
                    throw bk4.a(oov6);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static e0x _kz(double d, double d2, double d3) {
        return c05.vz1().tij.getBlockState(new mew(d, d2, d3)).r_y();
    }

    public static e0x _82(mew mew2) {
        return c05.vz1().tij.getBlockState(mew2).r_y();
    }

    public static e0x a32(i2h i2h2, double d) {
        i2h i2h3;
        int n;
        block9: {
            block10: {
                n = t9d.c();
                try {
                    try {
                        i2h3 = i2h2;
                        if (n != 0) break block9;
                        if (i2h3 != null) break block10;
                    }
                    catch (oov oov2) {
                        throw bk4.a(oov2);
                    }
                    return null;
                }
                catch (oov oov3) {
                    throw bk4.a(oov3);
                }
            }
            i2h3 = i2h2;
        }
        int n2 = (int)i2h3.aaw().sy_((double)0.0, (double)d, (double)0.0).bx_;
        int n3 = fe6.jqf(i2h2.aaw().rlc);
        while (n3 < fe6.jqf(i2h2.aaw().t_2) + 1) {
            block11: {
                block12: {
                    int n4 = fe6.jqf(i2h2.aaw().t8n);
                    try {
                        try {
                            if (n != 0) break block11;
                            if (n4 >= fe6.jqf(i2h2.aaw().oqj) + 1) break block12;
                        }
                        catch (oov oov4) {
                            throw bk4.a(oov4);
                        }
                        return c05.vz1().tij.getBlockState(new mew(n3, n2, n4)).r_y();
                    }
                    catch (oov oov5) {
                        throw bk4.a(oov5);
                    }
                }
                ++n3;
            }
            if (n == 0) continue;
        }
        return null;
    }

    public static boolean qq4() {
        int n;
        block11: {
            nh4 nh42 = c05.vz1().vg8.aaw().sy_(0.0, -0.1, 0.0).va6(0.001, 0.0, 0.001);
            int n2 = fe6.jqf(nh42.rlc);
            int n3 = fe6.jqf(nh42.t_2 + 1.0);
            int n4 = t9d.c();
            int n5 = fe6.jqf(nh42.bx_);
            int n6 = fe6.jqf(nh42.i2c + 1.0);
            int n7 = fe6.jqf(nh42.t8n);
            int n8 = fe6.jqf(nh42.oqj + 1.0);
            int n9 = 0;
            int n10 = n5;
            block6: while (true) {
                int n11 = n10;
                block7: while (n11 < n6) {
                    n = n2;
                    if (n4 != 0) break block11;
                    int n12 = n;
                    block8: while (true) {
                        int n13 = n12;
                        block9: while (n13 < n3) {
                            n11 = n7;
                            if (n4 != 0) continue block7;
                            for (int i = v563531; i < n8; ++i) {
                                e0x e0x2;
                                block14: {
                                    boolean bl;
                                    e0x e0x3;
                                    block12: {
                                        block13: {
                                            e0x3 = c05.vz1().tij.getBlockState(new mew(n12, n10, i)).r_y();
                                            n13 = e0x3 instanceof hmv;
                                            if (n4 != 0) continue block9;
                                            try {
                                                if (n4 != 0) break block12;
                                                if (n13 == 0) break block13;
                                            }
                                            catch (oov oov2) {
                                                throw bk4.a(oov2);
                                            }
                                            n9 = 1;
                                        }
                                        try {
                                            e0x2 = e0x3;
                                            if (n4 != 0) break block14;
                                            bl = e0x2 instanceof hmv;
                                        }
                                        catch (oov oov3) {
                                            throw bk4.a(oov3);
                                        }
                                    }
                                    if (bl) continue;
                                    e0x2 = e0x3;
                                }
                                try {
                                    if (e0x2.m__(c05.vz1().tij, new mew(n12, n10, i), c05.vz1().tij.getBlockState(new mew(n12, n10, i))) == null) continue;
                                    return false;
                                }
                                catch (oov oov4) {
                                    throw bk4.a(oov4);
                                }
                            }
                            ++n12;
                            if (n4 == 0) continue block8;
                        }
                        break;
                    }
                    ++n10;
                    if (n4 == 0) continue block6;
                }
                break;
            }
            n = n9;
        }
        return n != 0;
    }

    public static boolean a2a() {
        return c05.vz1().tij.jqj(c05.vz1().vg8.aaw().c2h(0.0, -0.4f, 0.0).va6(0.001, 0.001, 0.001), p3y.six, c05.vz1().vg8);
    }

    public static boolean icg() {
        int n;
        block10: {
            nh4 nh42 = c05.vz1().vg8.aaw().va6(0.001, 0.001, 0.001);
            int n2 = fe6.jqf(nh42.rlc);
            int n3 = fe6.jqf(nh42.t_2 + 1.0);
            int n4 = fe6.jqf(nh42.bx_);
            int n5 = fe6.jqf(nh42.i2c + 1.0);
            int n6 = fe6.jqf(nh42.t8n);
            int n7 = fe6.jqf(nh42.oqj + 1.0);
            int n8 = n2;
            int n9 = t9d.b();
            block4: while (true) {
                int n10 = n8;
                block5: while (n10 < n3) {
                    n = n4;
                    if (n9 == 0) break block10;
                    int n11 = n;
                    block6: while (true) {
                        int n12 = n11;
                        block7: while (n12 < n5) {
                            n10 = n6;
                            if (n9 == 0) continue block5;
                            int n13 = n10;
                            while (n13 < n7) {
                                block11: {
                                    mew mew2 = new mew(n8, n11, n13);
                                    e0x e0x2 = c05.vz1().tij.getBlockState(mew2).r_y();
                                    try {
                                        if (n9 == 0) break block11;
                                        n12 = e0x2 instanceof hmv;
                                        if (n9 == 0) continue block7;
                                    }
                                    catch (oov oov2) {
                                        throw bk4.a(oov2);
                                    }
                                    try {
                                        if (n12 != 0) {
                                            return true;
                                        }
                                    }
                                    catch (oov oov3) {
                                        throw bk4.a(oov3);
                                    }
                                    ++n13;
                                }
                                if (n9 != 0) continue;
                            }
                            ++n11;
                            if (n9 != 0) continue block6;
                        }
                        break;
                    }
                    ++n8;
                    if (n9 != 0) continue block4;
                }
                break;
            }
            n = 0;
        }
        return n != 0;
    }

    public static boolean no9() {
        boolean bl;
        block8: {
            nh4 nh42 = c05.vz1().vg8.aaw().va6(0.0, 0.001, 0.0);
            int n = fe6.jqf(nh42.bx_);
            int n2 = fe6.jqf(nh42.i2c + 1.0);
            int n3 = t9d.b();
            int n4 = n;
            while (n4 < n2) {
                block7: {
                    block9: {
                        mew mew2 = new mew(c05.vz1().vg8.o2v, (double)n4, c05.vz1().vg8.vbd);
                        e0x e0x2 = c05.vz1().tij.getBlockState(mew2).r_y();
                        try {
                            try {
                                try {
                                    if (n3 == 0) break block7;
                                    bl = e0x2.z4c();
                                    if (n3 == 0) break block8;
                                }
                                catch (oov oov2) {
                                    throw bk4.a(oov2);
                                }
                                if (!bl) break block9;
                            }
                            catch (oov oov3) {
                                throw bk4.a(oov3);
                            }
                            return true;
                        }
                        catch (oov oov4) {
                            throw bk4.a(oov4);
                        }
                    }
                    ++n4;
                }
                if (n3 != 0) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean ncv() {
        int n;
        block31: {
            block33: {
                block32: {
                    int n2;
                    block25: {
                        int n3 = 0;
                        int n4 = (int)c05.vz1().vg8.aaw().sy_((double)0.0, (double)1.0, (double)0.0).bx_;
                        n2 = t9d.c();
                        int n5 = fe6.jqf(c05.vz1().vg8.aaw().rlc);
                        block22: while (true) {
                            int n6 = n5;
                            block23: while (n6 < fe6.jqf(c05.vz1().vg8.aaw().t_2) + 1) {
                                n = fe6.jqf(c05.vz1().vg8.aaw().t8n);
                                if (n2 != 0) break block25;
                                int n7 = n;
                                while (n7 < fe6.jqf(c05.vz1().vg8.aaw().oqj) + 1) {
                                    block26: {
                                        block27: {
                                            int n8;
                                            block29: {
                                                block30: {
                                                    e0x e0x2;
                                                    block28: {
                                                        e0x2 = c05.vz1().tij.getBlockState(new mew(n5, n4, n7)).r_y();
                                                        try {
                                                            if (n2 != 0) break block26;
                                                            n6 = Objects.nonNull(e0x2) ? 1 : 0;
                                                            if (n2 != 0) continue block23;
                                                        }
                                                        catch (oov oov2) {
                                                            throw bk4.a(oov2);
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n6 == 0) break block27;
                                                                    n8 = e0x2 instanceof n47;
                                                                    if (n2 != 0) break block28;
                                                                }
                                                                catch (oov oov3) {
                                                                    throw bk4.a(oov3);
                                                                }
                                                                if (n8 != 0) break block27;
                                                            }
                                                            catch (oov oov4) {
                                                                throw bk4.a(oov4);
                                                            }
                                                            n8 = e0x2 instanceof f_b;
                                                        }
                                                        catch (oov oov5) {
                                                            throw bk4.a(oov5);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n2 != 0) break block29;
                                                                    if (n8 != 0) break block30;
                                                                }
                                                                catch (oov oov6) {
                                                                    throw bk4.a(oov6);
                                                                }
                                                                n8 = e0x2 instanceof pcl;
                                                                if (n2 != 0) break block29;
                                                            }
                                                            catch (oov oov7) {
                                                                throw bk4.a(oov7);
                                                            }
                                                            if (n8 != 0) break block30;
                                                        }
                                                        catch (oov oov8) {
                                                            throw bk4.a(oov8);
                                                        }
                                                        return false;
                                                    }
                                                    catch (oov oov9) {
                                                        throw bk4.a(oov9);
                                                    }
                                                }
                                                n8 = 1;
                                            }
                                            n3 = n8;
                                        }
                                        ++n7;
                                    }
                                    if (n2 == 0) continue;
                                }
                                ++n5;
                                if (n2 == 0) continue block22;
                            }
                            break;
                        }
                        n = n3;
                    }
                    try {
                        try {
                            try {
                                if (n2 != 0) break block31;
                                if (n != 0) break block32;
                            }
                            catch (oov oov10) {
                                throw bk4.a(oov10);
                            }
                            n = c05.vz1().vg8.z2m() ? 1 : 0;
                            if (n2 != 0) break block31;
                        }
                        catch (oov oov11) {
                            throw bk4.a(oov11);
                        }
                        if (n == 0) break block33;
                    }
                    catch (oov oov12) {
                        throw bk4.a(oov12);
                    }
                }
                n = 1;
                break block31;
            }
            n = 0;
        }
        return n != 0;
    }

    public static boolean da2() {
        int n;
        block20: {
            int n2 = t9d.c();
            int n3 = fe6.jqf(c05.vz1().vg8.aaw().rlc);
            block16: while (true) {
                int n4 = n3;
                block17: while (n4 < fe6.jqf(c05.vz1().vg8.aaw().t_2) + 1) {
                    n = fe6.jqf(c05.vz1().vg8.aaw().bx_);
                    if (n2 != 0) break block20;
                    int n5 = n;
                    while (n5 < fe6.jqf(c05.vz1().vg8.aaw().i2c) + 1) {
                        block21: {
                            n4 = fe6.jqf(c05.vz1().vg8.aaw().t8n);
                            if (n2 != 0) continue block17;
                            int n6 = n4;
                            while (n6 < fe6.jqf(c05.vz1().vg8.aaw().oqj) + 1) {
                                block22: {
                                    block23: {
                                        boolean bl;
                                        block26: {
                                            nh4 nh42;
                                            block25: {
                                                e0x e0x2;
                                                block24: {
                                                    e0x e0x3 = c05.vz1().tij.getBlockState(new mew(n3, n5, n6)).r_y();
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (n2 != 0) break block21;
                                                                        if (n2 != 0) break block22;
                                                                    }
                                                                    catch (oov oov2) {
                                                                        throw bk4.a(oov2);
                                                                    }
                                                                    if (e0x3 == null) break block23;
                                                                }
                                                                catch (oov oov3) {
                                                                    throw bk4.a(oov3);
                                                                }
                                                                e0x2 = e0x3;
                                                                if (n2 != 0) break block24;
                                                            }
                                                            catch (oov oov4) {
                                                                throw bk4.a(oov4);
                                                            }
                                                            if (e0x2 instanceof n47) break block23;
                                                        }
                                                        catch (oov oov5) {
                                                            throw bk4.a(oov5);
                                                        }
                                                        e0x2 = e0x3;
                                                    }
                                                    catch (oov oov6) {
                                                        throw bk4.a(oov6);
                                                    }
                                                }
                                                nh42 = e0x2.m__(c05.vz1().tij, new mew(n3, n5, n6), c05.vz1().tij.getBlockState(new mew(n3, n5, n6)));
                                                try {
                                                    try {
                                                        if (n2 != 0) break block25;
                                                        if (nh42 == null) break block23;
                                                    }
                                                    catch (oov oov7) {
                                                        throw bk4.a(oov7);
                                                    }
                                                    nh42 = c05.vz1().vg8.aaw();
                                                }
                                                catch (oov oov8) {
                                                    throw bk4.a(oov8);
                                                }
                                            }
                                            try {
                                                nh4 nh43;
                                                bl = nh42.epq(nh43);
                                                if (n2 != 0) break block26;
                                                if (!bl) break block23;
                                            }
                                            catch (oov oov9) {
                                                throw bk4.a(oov9);
                                            }
                                            bl = true;
                                        }
                                        return bl;
                                    }
                                    ++n6;
                                }
                                if (n2 == 0) continue;
                            }
                            ++n5;
                        }
                        if (n2 == 0) continue;
                    }
                    ++n3;
                    if (n2 == 0) continue block16;
                }
                break;
            }
            n = 0;
        }
        return n != 0;
    }

    public static float[] cmx(double d, double d2, double d3) {
        double d4 = d - c05.vz1().vg8.o2v + 0.5;
        double d5 = d3 - c05.vz1().vg8.vbd + 0.5;
        double d6 = d2 - (c05.vz1().vg8.kfp + (double)c05.vz1().vg8.c5y() - 1.0);
        double d7 = fe6.dii(d4 * d4 + d5 * d5);
        float f = (float)(Math.atan2(d5, d4) * 180.0 / Math.PI) - 90.0f;
        return new float[]{f, (float)(-Math.atan2(d6, d7) * 180.0 / Math.PI)};
    }

    private static float[] jw8(i2h i2h2) {
        double d = i2h2.o2v - c05.vz1().vg8.o2v;
        double d2 = i2h2.kfp - (c05.vz1().vg8.kfp + (double)c05.vz1().vg8.c5y());
        double d3 = i2h2.vbd - c05.vz1().vg8.vbd;
        double d4 = fe6.dii(d * d + d3 * d3);
        float f = (float)(Math.atan2(d3, d) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(-(Math.atan2(d2, d4) * 180.0 / Math.PI));
        return new float[]{f, f2};
    }

    public static boolean a3k(mew mew2) {
        return bk4._82(mew2).ujd(c05.vz1().tij, mew2);
    }

    public static boolean ab3(mew mew2) {
        return bk4._82(mew2).qc_(c05.vz1().tij.getBlockState(mew2), false);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x1704EB08C151L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("di\u00d9x\u00b47A\u0015".getBytes("ISO-8859-1"));
                b = bk4.a(byArray3).intern();
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
}

