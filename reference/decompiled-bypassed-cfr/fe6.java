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
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.util.MathUtils;

public class fe6 {
    public static final float lud;
    private static final /* synthetic */ int _ic = 12;
    private static final /* synthetic */ int l5w = 4095;
    private static final /* synthetic */ int s6n = 4096;
    private static final /* synthetic */ int j9d = 1024;
    public static final float dss;
    public static final float gda;
    public static final float zp6;
    private static final /* synthetic */ float ns8;
    public static final float war;
    private static final /* synthetic */ float[] zwr;
    public static boolean gge;
    private static final /* synthetic */ float[] qt6;
    private static final /* synthetic */ int[] xk_;
    private static final /* synthetic */ double y33;
    private static final /* synthetic */ double[] r0x;
    private static final /* synthetic */ double[] pwt;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public static float rtn(float f) {
        float f2;
        try {
            f2 = gge ? zwr[(int)(f * ns8) & 0xFFF] : qt6[(int)(f * 10430.378f) & 0xFFFF];
        }
        catch (RuntimeException runtimeException) {
            throw fe6.a(runtimeException);
        }
        return f2;
    }

    public static float ssk(float f) {
        float f2;
        block3: {
            block2: {
                try {
                    if (!gge) break block2;
                    f2 = zwr[(int)(f * ns8 + 1024.0f) & 0xFFF];
                    break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
            }
            f2 = qt6[(int)(f * 10430.378f + 16384.0f) & 0xFFFF];
        }
        return f2;
    }

    public static float bug(float f) {
        return (float)Math.sqrt(f);
    }

    public static float dii(double d) {
        return (float)Math.sqrt(d);
    }

    public static int tpk(float f) {
        float f2;
        block4: {
            int n;
            block5: {
                int n2 = t9d.c();
                n = (int)f;
                try {
                    try {
                        float f3 = f - (float)n;
                        f2 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
                        if (n2 != 0) break block4;
                        if (f2 >= 0) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                    f2 = n - 1;
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
            }
            f2 = n;
        }
        return (int)f2;
    }

    public static int n61(double d) {
        return (int)(d + 1024.0) - 1024;
    }

    public static int jqf(double d) {
        double d2;
        block4: {
            int n;
            block5: {
                int n2 = t9d.b();
                n = (int)d;
                try {
                    try {
                        double d3 = d - (double)n;
                        d2 = d3 == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
                        if (n2 == 0) break block4;
                        if (d2 >= 0) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                    d2 = n - 1;
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
            }
            d2 = n;
        }
        return (int)d2;
    }

    public static long lfr(double d) {
        long l;
        long l2 = (long)d;
        try {
            l = d < (double)l2 ? l2 - 1L : l2;
        }
        catch (RuntimeException runtimeException) {
            throw fe6.a(runtimeException);
        }
        return l;
    }

    public static int qqq(double d) {
        double d2;
        block6: {
            double d3;
            double d4;
            block4: {
                block5: {
                    int n = t9d.b();
                    try {
                        try {
                            d4 = d;
                            d3 = 0.0;
                            if (n == 0) break block4;
                            if (!(d4 >= d3)) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw fe6.a(runtimeException);
                        }
                        d2 = d;
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                }
                d4 = -d;
                d3 = 1.0;
            }
            d2 = d4 + d3;
        }
        return (int)d2;
    }

    public static float sqg(float f) {
        float f2;
        block6: {
            float f3;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            f3 = f;
                            if (n != 0) break block4;
                            if (!(f3 >= 0.0f)) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw fe6.a(runtimeException);
                        }
                        f2 = f;
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                }
                f3 = f;
            }
            f2 = -f3;
        }
        return f2;
    }

    public static int z1m(int n) {
        int n2;
        try {
            n2 = n >= 0 ? n : -n;
        }
        catch (RuntimeException runtimeException) {
            throw fe6.a(runtimeException);
        }
        return n2;
    }

    public static int v1i(float f) {
        int n;
        int n2 = (int)f;
        try {
            n = f > (float)n2 ? n2 + 1 : n2;
        }
        catch (RuntimeException runtimeException) {
            throw fe6.a(runtimeException);
        }
        return n;
    }

    public static int hxe(double d) {
        double d2;
        block4: {
            int n;
            block5: {
                int n2 = t9d.b();
                n = (int)d;
                try {
                    try {
                        double d3 = d - (double)n;
                        d2 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                        if (n2 == 0) break block4;
                        if (d2 <= 0) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                    d2 = n + 1;
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
            }
            d2 = n;
        }
        return (int)d2;
    }

    public static int faa(int n, int n2, int n3) {
        int n4;
        block8: {
            int n5;
            block6: {
                int n6;
                block7: {
                    n6 = t9d.b();
                    try {
                        try {
                            n4 = n;
                            n5 = n2;
                            if (n6 == 0) break block6;
                            if (n4 >= n5) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw fe6.a(runtimeException);
                        }
                        n4 = n2;
                        break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                }
                try {
                    n4 = n;
                    if (n6 == 0) break block8;
                    n5 = n3;
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
            }
            n4 = n4 > n5 ? n3 : n;
        }
        return n4;
    }

    public static float _f3(float f, float f2, float f3) {
        float f4;
        block8: {
            float f5;
            block6: {
                int n;
                block7: {
                    n = t9d.c();
                    try {
                        try {
                            f5 = f == f2 ? 0 : (f < f2 ? -1 : 1);
                            if (n != 0) break block6;
                            if (f5 >= 0) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw fe6.a(runtimeException);
                        }
                        f4 = f2;
                        break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                }
                try {
                    f4 = f;
                    if (n != 0) break block8;
                    float f6 = f4 - f3;
                    f5 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
            }
            f4 = f5 > 0 ? f3 : f;
        }
        return f4;
    }

    public static double lft(double d, double d2, double d3) {
        double d4;
        block8: {
            double d5;
            block6: {
                int n;
                block7: {
                    n = t9d.b();
                    try {
                        try {
                            d5 = d == d2 ? 0 : (d < d2 ? -1 : 1);
                            if (n == 0) break block6;
                            if (d5 >= 0) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw fe6.a(runtimeException);
                        }
                        d4 = d2;
                        break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                }
                try {
                    d4 = d;
                    if (n == 0) break block8;
                    double d6 = d4 - d3;
                    d5 = d6 == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1);
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
            }
            d4 = d5 > 0 ? d3 : d;
        }
        return d4;
    }

    public static double ldq(double d, double d2, double d3) {
        double d4;
        block10: {
            double d5;
            double d6;
            block11: {
                block12: {
                    double d7;
                    block8: {
                        int n;
                        block9: {
                            n = t9d.c();
                            try {
                                try {
                                    double d8 = d3 - 0.0;
                                    d7 = d8 == 0.0 ? 0 : (d8 < 0.0 ? -1 : 1);
                                    if (n != 0) break block8;
                                    if (d7 >= 0) break block9;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw fe6.a(runtimeException);
                                }
                                d4 = d;
                                break block10;
                            }
                            catch (RuntimeException runtimeException) {
                                throw fe6.a(runtimeException);
                            }
                        }
                        try {
                            d6 = d3;
                            d5 = 1.0;
                            if (n != 0) break block11;
                            double d9 = d6 - d5;
                            d7 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                        }
                        catch (RuntimeException runtimeException) {
                            throw fe6.a(runtimeException);
                        }
                    }
                    try {
                        if (d7 <= 0) break block12;
                        d4 = d2;
                        break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                }
                d6 = d;
                d5 = (d2 - d) * d3;
            }
            d4 = d6 + d5;
        }
        return d4;
    }

    public static double g8w(double d, double d2) {
        double d3;
        block10: {
            double d4;
            block8: {
                int n;
                block9: {
                    block6: {
                        double d5;
                        block7: {
                            n = t9d.b();
                            try {
                                double d6 = d - 0.0;
                                d4 = d6 == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
                                if (n == 0) break block6;
                                if (d4 >= 0) break block7;
                            }
                            catch (RuntimeException runtimeException) {
                                throw fe6.a(runtimeException);
                            }
                            d = -d;
                        }
                        d4 = (d5 = d2 - 0.0) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1);
                    }
                    try {
                        if (n == 0) break block8;
                        if (d4 >= 0) break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                    d2 = -d2;
                }
                try {
                    d3 = d;
                    if (n == 0) break block10;
                    double d7 = d3 - d2;
                    d4 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
            }
            d3 = d4 > 0 ? d : d2;
        }
        return d3;
    }

    public static int zji(int n, int n2) {
        int n3;
        block6: {
            int n4;
            block4: {
                block5: {
                    int n5 = t9d.c();
                    try {
                        try {
                            n4 = n;
                            if (n5 != 0) break block4;
                            if (n4 >= 0) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw fe6.a(runtimeException);
                        }
                        n3 = -((-n - 1) / n2) - 1;
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                }
                n4 = n;
            }
            n3 = n4 / n2;
        }
        return n3;
    }

    public static int pzp(Random random, int n, int n2) {
        int n3;
        block6: {
            int n4;
            int n5;
            block4: {
                block5: {
                    int n6 = t9d.b();
                    try {
                        try {
                            n5 = n;
                            n4 = n2;
                            if (n6 == 0) break block4;
                            if (n5 < n4) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw fe6.a(runtimeException);
                        }
                        n3 = n;
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                }
                n5 = random.nextInt(n2 - n + 1);
                n4 = n;
            }
            n3 = n5 + n4;
        }
        return n3;
    }

    public static float m_l(Random random, float f, float f2) {
        float f3;
        block6: {
            float f4;
            float f5;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            f5 = f;
                            f4 = f2;
                            if (n != 0) break block4;
                            if (!(f5 >= f4)) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw fe6.a(runtimeException);
                        }
                        f3 = f;
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                }
                f5 = random.nextFloat() * (f2 - f);
                f4 = f;
            }
            f3 = f5 + f4;
        }
        return f3;
    }

    public static double x16(Random random, double d, double d2) {
        double d3;
        block6: {
            double d4;
            double d5;
            block4: {
                block5: {
                    int n = t9d.b();
                    try {
                        try {
                            d5 = d;
                            d4 = d2;
                            if (n == 0) break block4;
                            if (!(d5 >= d4)) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw fe6.a(runtimeException);
                        }
                        d3 = d;
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                }
                d5 = random.nextDouble() * (d2 - d);
                d4 = d;
            }
            d3 = d5 + d4;
        }
        return d3;
    }

    public static double i76(long[] lArray) {
        long l;
        block2: {
            long l2 = 0L;
            long[] lArray2 = lArray;
            int n = lArray2.length;
            int n2 = t9d.b();
            for (int i = 0; i < n; ++i) {
                long l3 = lArray2[i];
                l = l2 + l3;
                if (n2 != 0) {
                    l2 = l;
                    if (n2 != 0) continue;
                }
                break block2;
            }
            l = l2;
        }
        return (double)l / (double)lArray.length;
    }

    public static boolean fa2(float f, float f2) {
        float f3;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    float f4 = fe6.sqg(f2 - f) - 1.0E-5f;
                    f3 = f4 == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1);
                    if (n == 0) break block2;
                    if (f3 >= 0) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
                f3 = 1.0f;
                break block2;
            }
            f3 = 0.0f;
        }
        return (boolean)f3;
    }

    public static int ba6(int n, int n2) {
        return (n % n2 + n2) % n2;
    }

    public static float qsy(float f) {
        float f2;
        block7: {
            float f3;
            block5: {
                int n;
                block6: {
                    n = t9d.c();
                    f %= 360.0f;
                    try {
                        float f4 = f - 180.0f;
                        f3 = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                        if (n != 0) break block5;
                        if (f3 < 0) break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                    f -= 360.0f;
                }
                try {
                    f2 = f;
                    if (n != 0) break block7;
                    float f5 = f2 - -180.0f;
                    f3 = f5 == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
            }
            if (f3 < 0) {
                f += 360.0f;
            }
            f2 = f;
        }
        return f2;
    }

    public static double lrs(double d) {
        double d2;
        block7: {
            double d3;
            block5: {
                int n;
                block6: {
                    n = t9d.c();
                    d %= 360.0;
                    try {
                        double d4 = d - 180.0;
                        d3 = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
                        if (n != 0) break block5;
                        if (d3 < 0) break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                    d -= 360.0;
                }
                try {
                    d2 = d;
                    if (n != 0) break block7;
                    double d5 = d2 - -180.0;
                    d3 = d5 == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1);
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
            }
            if (d3 < 0) {
                d += 360.0;
            }
            d2 = d;
        }
        return d2;
    }

    public static int e9x(String string, int n) {
        try {
            return Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            return n;
        }
    }

    public static int rfv(String string, int n, int n2) {
        return Math.max(n2, fe6.e9x(string, n));
    }

    public static double v6n(String string, double d) {
        try {
            return Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            return d;
        }
    }

    public static double s2_(String string, double d, double d2) {
        return Math.max(d2, fe6.v6n(string, d));
    }

    public static int l0o(int n) {
        int n2 = n - 1;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return n2 + 1;
    }

    private static boolean rzs(int n) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (n == 0 || (n & n - 1) != 0) break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                    bl = true;
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static int sn0(int n) {
        int n2;
        try {
            n2 = fe6.rzs(n) ? n : fe6.l0o(n);
        }
        catch (RuntimeException runtimeException) {
            throw fe6.a(runtimeException);
        }
        n = n2;
        return xk_[(int)((long)n * 125613361L >> 27) & 0x1F];
    }

    public static int xjr(int n) {
        int n2;
        int n3;
        try {
            n3 = fe6.sn0(n);
            n2 = fe6.rzs(n) ? 0 : 1;
        }
        catch (RuntimeException runtimeException) {
            throw fe6.a(runtimeException);
        }
        return n3 - n2;
    }

    public static int v6y(int n, int n2) {
        int n3;
        block22: {
            int n4;
            int n5;
            block20: {
                block21: {
                    int n6;
                    int n7;
                    block18: {
                        block19: {
                            block16: {
                                block17: {
                                    block14: {
                                        block15: {
                                            n7 = t9d.c();
                                            try {
                                                try {
                                                    n6 = n2;
                                                    if (n7 != 0) break block14;
                                                    if (n6 != 0) break block15;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw fe6.a(runtimeException);
                                                }
                                                return 0;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw fe6.a(runtimeException);
                                            }
                                        }
                                        n6 = n;
                                    }
                                    try {
                                        try {
                                            if (n7 != 0) break block16;
                                            if (n6 != 0) break block17;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw fe6.a(runtimeException);
                                        }
                                        return n2;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw fe6.a(runtimeException);
                                    }
                                }
                                n6 = n;
                            }
                            try {
                                if (n7 != 0) break block18;
                                if (n6 >= 0) break block19;
                            }
                            catch (RuntimeException runtimeException) {
                                throw fe6.a(runtimeException);
                            }
                            n2 *= -1;
                        }
                        n6 = n % n2;
                    }
                    n5 = n6;
                    try {
                        try {
                            n4 = n5;
                            if (n7 != 0) break block20;
                            if (n4 != 0) break block21;
                        }
                        catch (RuntimeException runtimeException) {
                            throw fe6.a(runtimeException);
                        }
                        n3 = n;
                        break block22;
                    }
                    catch (RuntimeException runtimeException) {
                        throw fe6.a(runtimeException);
                    }
                }
                n4 = n + n2;
            }
            n3 = n4 - n5;
        }
        return n3;
    }

    public static int __u(float f, float f2, float f3) {
        return fe6.i0s(fe6.tpk(f * 255.0f), fe6.tpk(f2 * 255.0f), fe6.tpk(f3 * 255.0f));
    }

    public static int i0s(int n, int n2, int n3) {
        int n4 = (n << 8) + n2;
        n4 = (n4 << 8) + n3;
        return n4;
    }

    public static int rsi(int n, int n2) {
        int n3 = (n & 0xFF0000) >> 16;
        int n4 = (n2 & 0xFF0000) >> 16;
        int n5 = (n & 0xFF00) >> 8;
        int n6 = (n2 & 0xFF00) >> 8;
        int n7 = (n & 0xFF) >> 0;
        int n8 = (n2 & 0xFF) >> 0;
        int n9 = (int)((float)n3 * (float)n4 / 255.0f);
        int n10 = (int)((float)n5 * (float)n6 / 255.0f);
        int n11 = (int)((float)n7 * (float)n8 / 255.0f);
        return n & 0xFF000000 | n9 << 16 | n10 << 8 | n11;
    }

    public static double cnn(double d) {
        return d - Math.floor(d);
    }

    public static long n88(wgo wgo2) {
        return fe6.u98(wgo2.getX(), wgo2.getY(), wgo2.getZ());
    }

    public static long u98(int n, int n2, int n3) {
        long l = (long)(n * 3129871) ^ (long)n3 * 116129781L ^ (long)n2;
        l = l * l * 42317861L + l * 11L;
        return l;
    }

    public static UUID _g4(Random random) {
        long l = random.nextLong() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
        long l2 = random.nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
        return new UUID(l, l2);
    }

    public static double hx5(double d, double d2, double d3) {
        return (d - d2) / (d3 - d2);
    }

    public static double yr8(double d, double d2) {
        int n;
        double d3;
        block34: {
            int n2;
            block35: {
                int n3;
                block32: {
                    int n4;
                    block33: {
                        double d4;
                        int n5;
                        double d5;
                        block30: {
                            int n6;
                            block31: {
                                block28: {
                                    block29: {
                                        int n7;
                                        block26: {
                                            block27: {
                                                block24: {
                                                    double d6;
                                                    block25: {
                                                        int n8;
                                                        block22: {
                                                            block23: {
                                                                block20: {
                                                                    block21: {
                                                                        n3 = t9d.b();
                                                                        d5 = d2 * d2 + d * d;
                                                                        try {
                                                                            try {
                                                                                n8 = Double.isNaN(d5);
                                                                                if (n3 == 0) break block20;
                                                                                if (n8 == 0) break block21;
                                                                            }
                                                                            catch (RuntimeException runtimeException) {
                                                                                throw fe6.a(runtimeException);
                                                                            }
                                                                            return Double.NaN;
                                                                        }
                                                                        catch (RuntimeException runtimeException) {
                                                                            throw fe6.a(runtimeException);
                                                                        }
                                                                    }
                                                                    double d7 = d - 0.0;
                                                                    n8 = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
                                                                }
                                                                try {
                                                                    if (n3 == 0) break block22;
                                                                    if (n8 >= 0) break block23;
                                                                }
                                                                catch (RuntimeException runtimeException) {
                                                                    throw fe6.a(runtimeException);
                                                                }
                                                                n8 = 1;
                                                                break block22;
                                                            }
                                                            n8 = 0;
                                                        }
                                                        n2 = n8;
                                                        try {
                                                            n7 = n2;
                                                            if (n3 == 0) break block24;
                                                            if (n7 == 0) break block25;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw fe6.a(runtimeException);
                                                        }
                                                        d = -d;
                                                    }
                                                    n7 = (d6 = d2 - 0.0) == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
                                                }
                                                try {
                                                    if (n3 == 0) break block26;
                                                    if (n7 >= 0) break block27;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw fe6.a(runtimeException);
                                                }
                                                n7 = 1;
                                                break block26;
                                            }
                                            n7 = 0;
                                        }
                                        n4 = n7;
                                        try {
                                            n6 = n4;
                                            if (n3 == 0) break block28;
                                            if (n6 == 0) break block29;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw fe6.a(runtimeException);
                                        }
                                        d2 = -d2;
                                    }
                                    n6 = d == d2 ? 0 : (d > d2 ? 1 : -1);
                                }
                                try {
                                    if (n3 == 0) break block30;
                                    if (n6 <= 0) break block31;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw fe6.a(runtimeException);
                                }
                                n6 = 1;
                                break block30;
                            }
                            n6 = n5 = 0;
                        }
                        if (n5 != 0) {
                            d4 = d2;
                            d2 = d;
                            d = d4;
                        }
                        d4 = fe6.lg6(d5);
                        d2 *= d4;
                        double d8 = y33 + (d *= d4);
                        int n9 = (int)Double.doubleToRawLongBits(d8);
                        double d9 = r0x[n9];
                        double d10 = pwt[n9];
                        double d11 = d8 - y33;
                        double d12 = d * d10 - d2 * d11;
                        double d13 = (6.0 + d12 * d12) * d12 * 0.16666666666666666;
                        d3 = d9 + d13;
                        try {
                            n = n5;
                            if (n3 == 0) break block32;
                            if (n == 0) break block33;
                        }
                        catch (RuntimeException runtimeException) {
                            throw fe6.a(runtimeException);
                        }
                        d3 = 1.5707963267948966 - d3;
                    }
                    n = n4;
                }
                try {
                    if (n3 == 0) break block34;
                    if (n == 0) break block35;
                }
                catch (RuntimeException runtimeException) {
                    throw fe6.a(runtimeException);
                }
                d3 = Math.PI - d3;
            }
            n = n2;
        }
        if (n != 0) {
            d3 = -d3;
        }
        return d3;
    }

    public static double lg6(double d) {
        double d2 = 0.5 * d;
        long l = Double.doubleToRawLongBits(d);
        l = 6910469410427058090L - (l >> 1);
        d = Double.longBitsToDouble(l);
        d *= 1.5 - d2 * d * d;
        return d;
    }

    /*
     * Exception decompiling
     */
    public static int zgt(float var0, float var1_1, float var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[CASE]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        int n;
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(5159419232445078062L, 283982269229323836L, MethodHandles.lookup().lookupClass()).a(262798614639315L);
        d = new HashMap(13);
        long l = a ^ 0x6F456E008A55L;
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
        int n2 = 0;
        String string = "\u0091\u00af\u0082\u00b1G\u0094\u0019\u0083\u00cd\u00a4%\u00d4&s@|x\u00da\u00e7\u00f5\u00fa\u000e\"my-+\u00cfa?q2U\u00d1:=\u000b*\u0015\u0099\u0092\u008a\u00a5Y\u0017\u0084G&T7\u0087\u00a4py\u00a2+q\u00ac\u00c4+\u0080\u00ad]\u008e-\u000e^\u00c1\u00cdI\u00e6\u00e7s '\u00d4T\u00bd\u0093D!J\u00behPKc\u00f0\"N\u0012\u0018&\u00a8\u00f5\u0018\u001f\\%\u00b3\u00be\u009eN\u000b\u008b.\u00b8\r\u00de\u00a2\u008f\u008e\u000f\u00f9`\u00c0\u00cdT\u00b9\u00ed\u00ea\u00caL\u0094d\u00b2!\u007f\u00b4\u00c1%7e\u00fd\u00cb\u00b8r\u0010\fg\u00ee8\u0015(\u008a\u008b\u00edB\u00c6r:\u00b6j\u000e";
        int n3 = "\u0091\u00af\u0082\u00b1G\u0094\u0019\u0083\u00cd\u00a4%\u00d4&s@|x\u00da\u00e7\u00f5\u00fa\u000e\"my-+\u00cfa?q2U\u00d1:=\u000b*\u0015\u0099\u0092\u008a\u00a5Y\u0017\u0084G&T7\u0087\u00a4py\u00a2+q\u00ac\u00c4+\u0080\u00ad]\u008e-\u000e^\u00c1\u00cdI\u00e6\u00e7s '\u00d4T\u00bd\u0093D!J\u00behPKc\u00f0\"N\u0012\u0018&\u00a8\u00f5\u0018\u001f\\%\u00b3\u00be\u009eN\u000b\u008b.\u00b8\r\u00de\u00a2\u008f\u008e\u000f\u00f9`\u00c0\u00cdT\u00b9\u00ed\u00ea\u00caL\u0094d\u00b2!\u007f\u00b4\u00c1%7e\u00fd\u00cb\u00b8r\u0010\fg\u00ee8\u0015(\u008a\u008b\u00edB\u00c6r:\u00b6j\u000e".length();
        int n4 = 16;
        int n5 = -1;
        while (true) {
            int n6 = ++n5;
            byte[] byArray3 = cipher.doFinal(string.substring(n6, n6 + n4).getBytes("ISO-8859-1"));
            stringArray[n2++] = fe6.a(byArray3).intern();
            if ((n5 += n4) >= n3) break;
            n4 = string.charAt(n5);
        }
        b = stringArray;
        c = new String[3];
        lud = fe6.bug(2.0f);
        dss = MathUtils.roundToFloat(Math.PI);
        gda = MathUtils.roundToFloat(Math.PI * 2);
        zp6 = MathUtils.roundToFloat(1.5707963267948966);
        ns8 = MathUtils.roundToFloat(651.8986469044033);
        war = MathUtils.roundToFloat(Math.PI / 180);
        zwr = new float[4096];
        gge = false;
        qt6 = new float[65536];
        try {
            for (n = 0; n < 65536; ++n) {
                fe6.qt6[n] = (float)Math.sin((double)n * Math.PI * 2.0 / 65536.0);
            }
        }
        catch (RuntimeException runtimeException) {
            throw fe6.a(runtimeException);
        }
        try {
            for (n = 0; n < zwr.length; ++n) {
                fe6.zwr[n] = MathUtils.roundToFloat(Math.sin((double)n * Math.PI * 2.0 / 4096.0));
            }
        }
        catch (RuntimeException runtimeException) {
            throw fe6.a(runtimeException);
        }
        xk_ = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
        y33 = Double.longBitsToDouble(4805340802404319232L);
        r0x = new double[257];
        pwt = new double[257];
        n = 0;
        while (n < 257) {
            double d = (double)n / 256.0;
            double d2 = Math.asin(d);
            fe6.pwt[n] = Math.cos(d2);
            fe6.r0x[n] = d2;
            ++n;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2E3C;
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
                throw new RuntimeException("fe6", exception);
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
            fe6.c[n2] = fe6.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fe6.a(n, l);
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
            throw new RuntimeException("fe6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fe6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

