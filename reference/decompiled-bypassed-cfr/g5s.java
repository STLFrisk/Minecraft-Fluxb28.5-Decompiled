/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
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

public abstract class g5s
implements Serializable,
Cloneable {
    public static final long serialVersionUID = 5542096614926168415L;
    public double v54;
    public double g0w;
    public double mu9;
    private static final long a = c.a(-1169294132394298060L, -2781584151748074983L, MethodHandles.lookup().lookupClass()).a(82605033419218L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public g5s(double d, double d2, double d3) {
        this.v54 = d;
        this.g0w = d2;
        this.mu9 = d3;
    }

    public g5s(double[] dArray) {
        this.v54 = dArray[0];
        this.g0w = dArray[1];
        this.mu9 = dArray[2];
    }

    public g5s(g5s g5s2) {
        this.v54 = g5s2.v54;
        this.g0w = g5s2.g0w;
        this.mu9 = g5s2.mu9;
    }

    public g5s(ry6 ry62) {
        this.v54 = ry62.yiu;
        this.g0w = ry62.q6o;
        this.mu9 = ry62.n_d;
    }

    public g5s() {
        this.v54 = 0.0;
        this.g0w = 0.0;
        this.mu9 = 0.0;
    }

    public final void ww3(double d, double d2, double d3) {
        this.v54 = d;
        this.g0w = d2;
        this.mu9 = d3;
    }

    public final void yo6(double[] dArray) {
        this.v54 = dArray[0];
        this.g0w = dArray[1];
        this.mu9 = dArray[2];
    }

    public final void ajh(g5s g5s2) {
        this.v54 = g5s2.v54;
        this.g0w = g5s2.g0w;
        this.mu9 = g5s2.mu9;
    }

    public final void bsj(ry6 ry62) {
        this.v54 = ry62.yiu;
        this.g0w = ry62.q6o;
        this.mu9 = ry62.n_d;
    }

    public final void wdc(double[] dArray) {
        dArray[0] = this.v54;
        dArray[1] = this.g0w;
        dArray[2] = this.mu9;
    }

    public final void t4x(g5s g5s2) {
        g5s2.v54 = this.v54;
        g5s2.g0w = this.g0w;
        g5s2.mu9 = this.mu9;
    }

    public final void j6j(g5s g5s2, g5s g5s3) {
        this.v54 = g5s2.v54 + g5s3.v54;
        this.g0w = g5s2.g0w + g5s3.g0w;
        this.mu9 = g5s2.mu9 + g5s3.mu9;
    }

    public final void nmh(g5s g5s2) {
        this.v54 += g5s2.v54;
        this.g0w += g5s2.g0w;
        this.mu9 += g5s2.mu9;
    }

    public final void tka(g5s g5s2, g5s g5s3) {
        this.v54 = g5s2.v54 - g5s3.v54;
        this.g0w = g5s2.g0w - g5s3.g0w;
        this.mu9 = g5s2.mu9 - g5s3.mu9;
    }

    public final void t77(g5s g5s2) {
        this.v54 -= g5s2.v54;
        this.g0w -= g5s2.g0w;
        this.mu9 -= g5s2.mu9;
    }

    public final void aba(g5s g5s2) {
        this.v54 = -g5s2.v54;
        this.g0w = -g5s2.g0w;
        this.mu9 = -g5s2.mu9;
    }

    public final void c90() {
        this.v54 = -this.v54;
        this.g0w = -this.g0w;
        this.mu9 = -this.mu9;
    }

    public final void wve(double d, g5s g5s2) {
        this.v54 = d * g5s2.v54;
        this.g0w = d * g5s2.g0w;
        this.mu9 = d * g5s2.mu9;
    }

    public final void t_x(double d) {
        this.v54 *= d;
        this.g0w *= d;
        this.mu9 *= d;
    }

    public final void f72(double d, g5s g5s2, g5s g5s3) {
        this.v54 = d * g5s2.v54 + g5s3.v54;
        this.g0w = d * g5s2.g0w + g5s3.g0w;
        this.mu9 = d * g5s2.mu9 + g5s3.mu9;
    }

    public final void e8v(double d, ry6 ry62) {
        this.u6o(d, new fna(ry62));
    }

    public final void u6o(double d, g5s g5s2) {
        this.v54 = d * this.v54 + g5s2.v54;
        this.g0w = d * this.g0w + g5s2.g0w;
        this.mu9 = d * this.mu9 + g5s2.mu9;
    }

    public String toString() {
        long l = a ^ 0x2065FF0134F9L;
        return "(" + this.v54 + (String)((Object)g5s.a("j", (int)13429, (long)(0xEA6D393DFAA699L ^ l))) + this.g0w + (String)((Object)g5s.a("j", (int)29873, (long)(0x239CB14E2E8D665CL ^ l))) + this.mu9 + ")";
    }

    public int hashCode() {
        long l = 1L;
        l = get.mql(l, this.v54);
        l = get.mql(l, this.g0w);
        l = get.mql(l, this.mu9);
        return get.p05(l);
    }

    /*
     * Loose catch block
     */
    public boolean bm4(g5s g5s2) {
        int n = t9d.b();
        try {
            double d;
            block15: {
                block13: {
                    block14: {
                        block12: {
                            double d2 = this.v54 - g5s2.v54;
                            d = d2 == 0.0 ? (byte)0 : (d2 > 0.0 ? (byte)1 : -1);
                            if (n == 0) break block12;
                            try {
                                block16: {
                                    if (d != false) break block13;
                                    break block16;
                                    catch (NullPointerException nullPointerException) {
                                        throw g5s.a(nullPointerException);
                                    }
                                }
                                double d3 = this.g0w - g5s2.g0w;
                                d = d3 == 0.0 ? (byte)0 : (d3 > 0.0 ? (byte)1 : -1);
                            }
                            catch (NullPointerException nullPointerException) {
                                throw g5s.a(nullPointerException);
                            }
                        }
                        if (n == 0) break block14;
                        try {
                            block17: {
                                if (d != false) break block13;
                                break block17;
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                            }
                            double d4 = this.mu9 - g5s2.mu9;
                            d = d4 == 0.0 ? (byte)0 : (d4 > 0.0 ? (byte)1 : -1);
                        }
                        catch (NullPointerException nullPointerException) {
                            throw g5s.a(nullPointerException);
                        }
                    }
                    try {
                        if (n == 0) break block15;
                        if (d != false) break block13;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw g5s.a(nullPointerException);
                    }
                    d = 1.0;
                    break block15;
                }
                d = 0.0;
            }
            return (boolean)d;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
    }

    /*
     * Loose catch block
     */
    public boolean equals(Object object) {
        int n = t9d.c();
        try {
            double d;
            block16: {
                block14: {
                    block15: {
                        g5s g5s2;
                        block13: {
                            g5s2 = (g5s)object;
                            double d2 = this.v54 - g5s2.v54;
                            d = d2 == 0.0 ? (byte)0 : (d2 > 0.0 ? (byte)1 : -1);
                            if (n != 0) break block13;
                            try {
                                block17: {
                                    if (d != false) break block14;
                                    break block17;
                                    catch (ClassCastException classCastException) {
                                        throw g5s.a(classCastException);
                                    }
                                }
                                double d3 = this.g0w - g5s2.g0w;
                                d = d3 == 0.0 ? (byte)0 : (d3 > 0.0 ? (byte)1 : -1);
                            }
                            catch (ClassCastException classCastException) {
                                throw g5s.a(classCastException);
                            }
                        }
                        if (n != 0) break block15;
                        try {
                            block18: {
                                if (d != false) break block14;
                                break block18;
                                catch (ClassCastException classCastException) {
                                    throw g5s.a(classCastException);
                                }
                            }
                            double d4 = this.mu9 - g5s2.mu9;
                            d = d4 == 0.0 ? (byte)0 : (d4 > 0.0 ? (byte)1 : -1);
                        }
                        catch (ClassCastException classCastException) {
                            throw g5s.a(classCastException);
                        }
                    }
                    try {
                        if (n != 0) break block16;
                        if (d != false) break block14;
                    }
                    catch (ClassCastException classCastException) {
                        throw g5s.a(classCastException);
                    }
                    d = 1.0;
                    break block16;
                }
                d = 0.0;
            }
            return (boolean)d;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
    }

    public boolean _l5(g5s g5s2, double d) {
        double d2;
        block49: {
            block50: {
                double d3;
                int n;
                block48: {
                    double d4;
                    double d5;
                    block46: {
                        block47: {
                            block44: {
                                block45: {
                                    double d6;
                                    block43: {
                                        double d7;
                                        block41: {
                                            block42: {
                                                block39: {
                                                    block40: {
                                                        double d8;
                                                        block38: {
                                                            int n2;
                                                            block36: {
                                                                block37: {
                                                                    n = t9d.c();
                                                                    d5 = this.v54 - g5s2.v54;
                                                                    try {
                                                                        try {
                                                                            n2 = Double.isNaN(d5);
                                                                            if (n != 0) break block36;
                                                                            if (n2 == 0) break block37;
                                                                        }
                                                                        catch (NullPointerException nullPointerException) {
                                                                            throw g5s.a(nullPointerException);
                                                                        }
                                                                        return false;
                                                                    }
                                                                    catch (NullPointerException nullPointerException) {
                                                                        throw g5s.a(nullPointerException);
                                                                    }
                                                                }
                                                                try {
                                                                    d8 = d5;
                                                                    if (n != 0) break block38;
                                                                    double d9 = d8 - 0.0;
                                                                    n2 = d9 == 0.0 ? (byte)0 : (d9 < 0.0 ? (byte)-1 : 1);
                                                                }
                                                                catch (NullPointerException nullPointerException) {
                                                                    throw g5s.a(nullPointerException);
                                                                }
                                                            }
                                                            try {
                                                                d8 = n2 < 0 ? -d5 : d5;
                                                            }
                                                            catch (NullPointerException nullPointerException) {
                                                                throw g5s.a(nullPointerException);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                double d10 = d8 - d;
                                                                d7 = d10 == 0.0 ? (byte)0 : (d10 > 0.0 ? (byte)1 : -1);
                                                                if (n != 0) break block39;
                                                                if (d7 <= 0) break block40;
                                                            }
                                                            catch (NullPointerException nullPointerException) {
                                                                throw g5s.a(nullPointerException);
                                                            }
                                                            return false;
                                                        }
                                                        catch (NullPointerException nullPointerException) {
                                                            throw g5s.a(nullPointerException);
                                                        }
                                                    }
                                                    d5 = this.g0w - g5s2.g0w;
                                                    d7 = (double)Double.isNaN(d5);
                                                }
                                                try {
                                                    try {
                                                        if (n != 0) break block41;
                                                        if (d7 == false) break block42;
                                                    }
                                                    catch (NullPointerException nullPointerException) {
                                                        throw g5s.a(nullPointerException);
                                                    }
                                                    return false;
                                                }
                                                catch (NullPointerException nullPointerException) {
                                                    throw g5s.a(nullPointerException);
                                                }
                                            }
                                            try {
                                                d6 = d5;
                                                if (n != 0) break block43;
                                                double d11 = d6 - 0.0;
                                                d7 = d11 == 0.0 ? (byte)0 : (d11 < 0.0 ? (byte)-1 : 1);
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw g5s.a(nullPointerException);
                                            }
                                        }
                                        try {
                                            d6 = d7 < 0 ? -d5 : d5;
                                        }
                                        catch (NullPointerException nullPointerException) {
                                            throw g5s.a(nullPointerException);
                                        }
                                    }
                                    try {
                                        try {
                                            double d12 = d6 - d;
                                            d4 = d12 == 0.0 ? (byte)0 : (d12 > 0.0 ? (byte)1 : -1);
                                            if (n != 0) break block44;
                                            if (d4 <= 0) break block45;
                                        }
                                        catch (NullPointerException nullPointerException) {
                                            throw g5s.a(nullPointerException);
                                        }
                                        return false;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw g5s.a(nullPointerException);
                                    }
                                }
                                d5 = this.mu9 - g5s2.mu9;
                                d4 = (double)Double.isNaN(d5);
                            }
                            try {
                                try {
                                    if (n != 0) break block46;
                                    if (d4 == false) break block47;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                                return false;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw g5s.a(nullPointerException);
                            }
                        }
                        try {
                            d3 = d5;
                            if (n != 0) break block48;
                            double d13 = d3 - 0.0;
                            d4 = d13 == 0.0 ? (byte)0 : (d13 < 0.0 ? (byte)-1 : 1);
                        }
                        catch (NullPointerException nullPointerException) {
                            throw g5s.a(nullPointerException);
                        }
                    }
                    try {
                        d3 = d4 < 0 ? -d5 : d5;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw g5s.a(nullPointerException);
                    }
                }
                try {
                    try {
                        double d14 = d3 - d;
                        d2 = d14 == 0.0 ? (byte)0 : (d14 > 0.0 ? (byte)1 : -1);
                        if (n != 0) break block49;
                        if (d2 <= 0) break block50;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw g5s.a(nullPointerException);
                    }
                    return false;
                }
                catch (NullPointerException nullPointerException) {
                    throw g5s.a(nullPointerException);
                }
            }
            d2 = 1.0;
        }
        return (boolean)d2;
    }

    public final void an7(float f, float f2, g5s g5s2) {
        this.mbo(f, f2, g5s2);
    }

    public final void mbo(double d, double d2, g5s g5s2) {
        block48: {
            block49: {
                g5s g5s3;
                double d3;
                int n;
                block46: {
                    block43: {
                        block44: {
                            g5s g5s4;
                            double d4;
                            block41: {
                                block38: {
                                    block39: {
                                        g5s g5s5;
                                        double d5;
                                        block36: {
                                            n = t9d.c();
                                            try {
                                                try {
                                                    block37: {
                                                        try {
                                                            try {
                                                                double d6 = g5s2.v54 - d2;
                                                                d5 = d6 == 0.0 ? (byte)0 : (d6 > 0.0 ? (byte)1 : -1);
                                                                if (n != 0) break block36;
                                                                if (d5 <= 0) break block37;
                                                            }
                                                            catch (NullPointerException nullPointerException) {
                                                                throw g5s.a(nullPointerException);
                                                            }
                                                            this.v54 = d2;
                                                            if (n == 0) break block38;
                                                        }
                                                        catch (NullPointerException nullPointerException) {
                                                            throw g5s.a(nullPointerException);
                                                        }
                                                    }
                                                    g5s5 = g5s2;
                                                    if (n != 0) break block39;
                                                }
                                                catch (NullPointerException nullPointerException) {
                                                    throw g5s.a(nullPointerException);
                                                }
                                                double d7 = g5s5.v54 - d;
                                                d5 = d7 == 0.0 ? (byte)0 : (d7 < 0.0 ? (byte)-1 : 1);
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw g5s.a(nullPointerException);
                                            }
                                        }
                                        try {
                                            block40: {
                                                try {
                                                    if (d5 >= 0) break block40;
                                                    this.v54 = d;
                                                    if (n == 0) break block38;
                                                }
                                                catch (NullPointerException nullPointerException) {
                                                    throw g5s.a(nullPointerException);
                                                }
                                            }
                                            g5s5 = this;
                                        }
                                        catch (NullPointerException nullPointerException) {
                                            throw g5s.a(nullPointerException);
                                        }
                                    }
                                    g5s5.v54 = g5s2.v54;
                                }
                                try {
                                    try {
                                        block42: {
                                            try {
                                                try {
                                                    double d8 = g5s2.g0w - d2;
                                                    d4 = d8 == 0.0 ? (byte)0 : (d8 > 0.0 ? (byte)1 : -1);
                                                    if (n != 0) break block41;
                                                    if (d4 <= 0) break block42;
                                                }
                                                catch (NullPointerException nullPointerException) {
                                                    throw g5s.a(nullPointerException);
                                                }
                                                this.g0w = d2;
                                                if (n == 0) break block43;
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw g5s.a(nullPointerException);
                                            }
                                        }
                                        g5s4 = g5s2;
                                        if (n != 0) break block44;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw g5s.a(nullPointerException);
                                    }
                                    double d9 = g5s4.g0w - d;
                                    d4 = d9 == 0.0 ? (byte)0 : (d9 < 0.0 ? (byte)-1 : 1);
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                            }
                            try {
                                block45: {
                                    try {
                                        if (d4 >= 0) break block45;
                                        this.g0w = d;
                                        if (n == 0) break block43;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw g5s.a(nullPointerException);
                                    }
                                }
                                g5s4 = this;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw g5s.a(nullPointerException);
                            }
                        }
                        g5s4.g0w = g5s2.g0w;
                    }
                    try {
                        try {
                            block47: {
                                try {
                                    try {
                                        double d10 = g5s2.mu9 - d2;
                                        d3 = d10 == 0.0 ? (byte)0 : (d10 > 0.0 ? (byte)1 : -1);
                                        if (n != 0) break block46;
                                        if (d3 <= 0) break block47;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw g5s.a(nullPointerException);
                                    }
                                    this.mu9 = d2;
                                    if (n == 0) break block48;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                            }
                            g5s3 = g5s2;
                            if (n != 0) break block49;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw g5s.a(nullPointerException);
                        }
                        double d11 = g5s3.mu9 - d;
                        d3 = d11 == 0.0 ? (byte)0 : (d11 < 0.0 ? (byte)-1 : 1);
                    }
                    catch (NullPointerException nullPointerException) {
                        throw g5s.a(nullPointerException);
                    }
                }
                try {
                    block50: {
                        try {
                            if (d3 >= 0) break block50;
                            this.mu9 = d;
                            if (n == 0) break block48;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw g5s.a(nullPointerException);
                        }
                    }
                    g5s3 = this;
                }
                catch (NullPointerException nullPointerException) {
                    throw g5s.a(nullPointerException);
                }
            }
            g5s3.mu9 = g5s2.mu9;
        }
    }

    public final void tf8(float f, g5s g5s2) {
        this.n_u(f, g5s2);
    }

    public final void n_u(double d, g5s g5s2) {
        block26: {
            block24: {
                int n;
                block23: {
                    block21: {
                        block20: {
                            block18: {
                                n = t9d.b();
                                try {
                                    g5s g5s3;
                                    block19: {
                                        try {
                                            try {
                                                g5s3 = g5s2;
                                                if (n == 0) break block18;
                                                if (!(g5s3.v54 < d)) break block19;
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw g5s.a(nullPointerException);
                                            }
                                            this.v54 = d;
                                            if (n != 0) break block20;
                                        }
                                        catch (NullPointerException nullPointerException) {
                                            throw g5s.a(nullPointerException);
                                        }
                                    }
                                    g5s3 = this;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                            }
                            g5s3.v54 = g5s2.v54;
                        }
                        try {
                            g5s g5s4;
                            block22: {
                                try {
                                    try {
                                        g5s4 = g5s2;
                                        if (n == 0) break block21;
                                        if (!(g5s4.g0w < d)) break block22;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw g5s.a(nullPointerException);
                                    }
                                    this.g0w = d;
                                    if (n != 0) break block23;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                            }
                            g5s4 = this;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw g5s.a(nullPointerException);
                        }
                    }
                    g5s4.g0w = g5s2.g0w;
                }
                try {
                    g5s g5s5;
                    block25: {
                        try {
                            try {
                                g5s5 = g5s2;
                                if (n == 0) break block24;
                                if (!(g5s5.mu9 < d)) break block25;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw g5s.a(nullPointerException);
                            }
                            this.mu9 = d;
                            if (n != 0) break block26;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw g5s.a(nullPointerException);
                        }
                    }
                    g5s5 = this;
                }
                catch (NullPointerException nullPointerException) {
                    throw g5s.a(nullPointerException);
                }
            }
            g5s5.mu9 = g5s2.mu9;
        }
    }

    public final void u3g(float f, g5s g5s2) {
        this.pf6(f, g5s2);
    }

    public final void pf6(double d, g5s g5s2) {
        block26: {
            block24: {
                int n;
                block23: {
                    block21: {
                        block20: {
                            block18: {
                                n = t9d.c();
                                try {
                                    g5s g5s3;
                                    block19: {
                                        try {
                                            try {
                                                g5s3 = g5s2;
                                                if (n != 0) break block18;
                                                if (!(g5s3.v54 > d)) break block19;
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw g5s.a(nullPointerException);
                                            }
                                            this.v54 = d;
                                            if (n == 0) break block20;
                                        }
                                        catch (NullPointerException nullPointerException) {
                                            throw g5s.a(nullPointerException);
                                        }
                                    }
                                    g5s3 = this;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                            }
                            g5s3.v54 = g5s2.v54;
                        }
                        try {
                            g5s g5s4;
                            block22: {
                                try {
                                    try {
                                        g5s4 = g5s2;
                                        if (n != 0) break block21;
                                        if (!(g5s4.g0w > d)) break block22;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw g5s.a(nullPointerException);
                                    }
                                    this.g0w = d;
                                    if (n == 0) break block23;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                            }
                            g5s4 = this;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw g5s.a(nullPointerException);
                        }
                    }
                    g5s4.g0w = g5s2.g0w;
                }
                try {
                    g5s g5s5;
                    block25: {
                        try {
                            try {
                                g5s5 = g5s2;
                                if (n != 0) break block24;
                                if (!(g5s5.mu9 > d)) break block25;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw g5s.a(nullPointerException);
                            }
                            this.mu9 = d;
                            if (n == 0) break block26;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw g5s.a(nullPointerException);
                        }
                    }
                    g5s5 = this;
                }
                catch (NullPointerException nullPointerException) {
                    throw g5s.a(nullPointerException);
                }
            }
            g5s5.mu9 = g5s2.mu9;
        }
    }

    public final void wtt(g5s g5s2) {
        this.v54 = Math.abs(g5s2.v54);
        this.g0w = Math.abs(g5s2.g0w);
        this.mu9 = Math.abs(g5s2.mu9);
    }

    public final void h4l(float f, float f2) {
        this.tqt(f, f2);
    }

    public final void tqt(double d, double d2) {
        block40: {
            block41: {
                g5s g5s2;
                double d3;
                block38: {
                    int n;
                    block37: {
                        double d4;
                        block36: {
                            block34: {
                                block33: {
                                    double d5;
                                    block32: {
                                        block30: {
                                            n = t9d.c();
                                            try {
                                                double d6;
                                                block31: {
                                                    try {
                                                        try {
                                                            double d7 = this.v54 - d2;
                                                            d3 = d7 == 0.0 ? (byte)0 : (d7 > 0.0 ? (byte)1 : -1);
                                                            if (n != 0) break block30;
                                                            if (d3 <= 0) break block31;
                                                        }
                                                        catch (NullPointerException nullPointerException) {
                                                            throw g5s.a(nullPointerException);
                                                        }
                                                        this.v54 = d2;
                                                        if (n == 0) break block32;
                                                    }
                                                    catch (NullPointerException nullPointerException) {
                                                        throw g5s.a(nullPointerException);
                                                    }
                                                }
                                                d3 = (d6 = this.v54 - d) == 0.0 ? (byte)0 : (d6 < 0.0 ? (byte)-1 : 1);
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw g5s.a(nullPointerException);
                                            }
                                        }
                                        try {
                                            try {
                                                if (n != 0) break block33;
                                                if (d3 >= 0) break block32;
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw g5s.a(nullPointerException);
                                            }
                                            this.v54 = d;
                                        }
                                        catch (NullPointerException nullPointerException) {
                                            throw g5s.a(nullPointerException);
                                        }
                                    }
                                    d3 = (d5 = this.g0w - d2) == 0.0 ? (byte)0 : (d5 > 0.0 ? (byte)1 : -1);
                                }
                                try {
                                    double d8;
                                    block35: {
                                        try {
                                            try {
                                                if (n != 0) break block34;
                                                if (d3 <= 0) break block35;
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw g5s.a(nullPointerException);
                                            }
                                            this.g0w = d2;
                                            if (n == 0) break block36;
                                        }
                                        catch (NullPointerException nullPointerException) {
                                            throw g5s.a(nullPointerException);
                                        }
                                    }
                                    d3 = (d8 = this.g0w - d) == 0.0 ? (byte)0 : (d8 < 0.0 ? (byte)-1 : 1);
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                            }
                            try {
                                try {
                                    if (n != 0) break block37;
                                    if (d3 >= 0) break block36;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                                this.g0w = d;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw g5s.a(nullPointerException);
                            }
                        }
                        d3 = (d4 = this.mu9 - d2) == 0.0 ? (byte)0 : (d4 > 0.0 ? (byte)1 : -1);
                    }
                    try {
                        try {
                            block39: {
                                try {
                                    try {
                                        if (n != 0) break block38;
                                        if (d3 <= 0) break block39;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw g5s.a(nullPointerException);
                                    }
                                    this.mu9 = d2;
                                    if (n == 0) break block40;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                            }
                            g5s2 = this;
                            if (n != 0) break block41;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw g5s.a(nullPointerException);
                        }
                        double d9 = g5s2.mu9 - d;
                        d3 = d9 == 0.0 ? (byte)0 : (d9 < 0.0 ? (byte)-1 : 1);
                    }
                    catch (NullPointerException nullPointerException) {
                        throw g5s.a(nullPointerException);
                    }
                }
                if (d3 >= 0) break block40;
                g5s2 = this;
            }
            g5s2.mu9 = d;
        }
    }

    public final void kos(float f) {
        this.s4g(f);
    }

    public final void s4g(double d) {
        block17: {
            block16: {
                g5s g5s2;
                double d2;
                block14: {
                    int n;
                    block15: {
                        block12: {
                            double d3;
                            block13: {
                                n = t9d.c();
                                try {
                                    try {
                                        double d4 = this.v54 - d;
                                        d2 = d4 == 0.0 ? (byte)0 : (d4 < 0.0 ? (byte)-1 : 1);
                                        if (n != 0) break block12;
                                        if (d2 >= 0) break block13;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw g5s.a(nullPointerException);
                                    }
                                    this.v54 = d;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                            }
                            d2 = (d3 = this.g0w - d) == 0.0 ? (byte)0 : (d3 < 0.0 ? (byte)-1 : 1);
                        }
                        try {
                            try {
                                if (n != 0) break block14;
                                if (d2 >= 0) break block15;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw g5s.a(nullPointerException);
                            }
                            this.g0w = d;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw g5s.a(nullPointerException);
                        }
                    }
                    try {
                        g5s2 = this;
                        if (n != 0) break block16;
                        double d5 = g5s2.mu9 - d;
                        d2 = d5 == 0.0 ? (byte)0 : (d5 < 0.0 ? (byte)-1 : 1);
                    }
                    catch (NullPointerException nullPointerException) {
                        throw g5s.a(nullPointerException);
                    }
                }
                if (d2 >= 0) break block17;
                g5s2 = this;
            }
            g5s2.mu9 = d;
        }
    }

    public final void k9x(float f) {
        this.e7k(f);
    }

    public final void e7k(double d) {
        block17: {
            block16: {
                g5s g5s2;
                double d2;
                block14: {
                    int n;
                    block15: {
                        block12: {
                            double d3;
                            block13: {
                                n = t9d.c();
                                try {
                                    try {
                                        double d4 = this.v54 - d;
                                        d2 = d4 == 0.0 ? (byte)0 : (d4 > 0.0 ? (byte)1 : -1);
                                        if (n != 0) break block12;
                                        if (d2 <= 0) break block13;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw g5s.a(nullPointerException);
                                    }
                                    this.v54 = d;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw g5s.a(nullPointerException);
                                }
                            }
                            d2 = (d3 = this.g0w - d) == 0.0 ? (byte)0 : (d3 > 0.0 ? (byte)1 : -1);
                        }
                        try {
                            try {
                                if (n != 0) break block14;
                                if (d2 <= 0) break block15;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw g5s.a(nullPointerException);
                            }
                            this.g0w = d;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw g5s.a(nullPointerException);
                        }
                    }
                    try {
                        g5s2 = this;
                        if (n != 0) break block16;
                        double d5 = g5s2.mu9 - d;
                        d2 = d5 == 0.0 ? (byte)0 : (d5 > 0.0 ? (byte)1 : -1);
                    }
                    catch (NullPointerException nullPointerException) {
                        throw g5s.a(nullPointerException);
                    }
                }
                if (d2 <= 0) break block17;
                g5s2 = this;
            }
            g5s2.mu9 = d;
        }
    }

    public final void pln() {
        this.v54 = Math.abs(this.v54);
        this.g0w = Math.abs(this.g0w);
        this.mu9 = Math.abs(this.mu9);
    }

    public final void jh2(g5s g5s2, g5s g5s3, float f) {
        this.sem(g5s2, g5s3, f);
    }

    public final void sem(g5s g5s2, g5s g5s3, double d) {
        this.v54 = (1.0 - d) * g5s2.v54 + d * g5s3.v54;
        this.g0w = (1.0 - d) * g5s2.g0w + d * g5s3.g0w;
        this.mu9 = (1.0 - d) * g5s2.mu9 + d * g5s3.mu9;
    }

    public final void fy3(g5s g5s2, float f) {
        this.te2(g5s2, f);
    }

    public final void te2(g5s g5s2, double d) {
        this.v54 = (1.0 - d) * this.v54 + d * g5s2.v54;
        this.g0w = (1.0 - d) * this.g0w + d * g5s2.g0w;
        this.mu9 = (1.0 - d) * this.mu9 + d * g5s2.mu9;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public final double _zh() {
        return this.v54;
    }

    public final void l1q(double d) {
        this.v54 = d;
    }

    public final double nie() {
        return this.g0w;
    }

    public final void geb(double d) {
        this.g0w = d;
    }

    public final double bml() {
        return this.mu9;
    }

    public final void suo(double d) {
        this.mu9 = d;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        d = new HashMap(13);
        long l = a ^ 0x1282672ABA32L;
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
        String string = "\u00c2lh;\u00f3Z\u00c6\u0086\u0012\u00a2\u00b7\u009f\u009c\u00c6\u00d6\u00f3\u0010\u0085\u0091E\u00a2\u00f5\u00d7\u0098\u00c7\u0080\u0089\u007f\u00b4\u000bx\u0012\u00c2";
        int n2 = "\u00c2lh;\u00f3Z\u00c6\u0086\u0012\u00a2\u00b7\u009f\u009c\u00c6\u00d6\u00f3\u0010\u0085\u0091E\u00a2\u00f5\u00d7\u0098\u00c7\u0080\u0089\u007f\u00b4\u000bx\u0012\u00c2".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = g5s.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6C1A;
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
                throw new RuntimeException("g5s", exception);
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
            g5s.c[n2] = g5s.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = g5s.a(n, l);
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
            throw new RuntimeException("g5s" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g5s.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

