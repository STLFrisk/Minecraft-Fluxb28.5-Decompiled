/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class amb {
    private static /* synthetic */ c05 r2l;
    public static int fqe;
    public static int b4p;
    public static int r5g;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public static int zws() {
        int n;
        int n2;
        block16: {
            block17: {
                jnq jnq2;
                int n3;
                block14: {
                    block15: {
                        jnq jnq3;
                        block13: {
                            n3 = t9d.b();
                            for (int i = 0; i < 8; ++i) {
                                try {
                                    try {
                                        jnq3 = amb.r2l.vg8.up_;
                                        if (n3 == 0) break block13;
                                        if (jnq3.c41[i] != null) continue;
                                    }
                                    catch (oov oov2) {
                                        throw amb.a(oov2);
                                    }
                                    return i;
                                }
                                catch (oov oov3) {
                                    throw amb.a(oov3);
                                }
                            }
                            jnq3 = amb.r2l.vg8.up_;
                        }
                        try {
                            try {
                                n2 = jnq3.nb5;
                                jnq2 = amb.r2l.vg8.up_;
                                if (n3 == 0) break block14;
                                if (jnq2.dxs() != null) break block15;
                            }
                            catch (oov oov4) {
                                throw amb.a(oov4);
                            }
                            n = 0;
                            break block16;
                        }
                        catch (oov oov5) {
                            throw amb.a(oov5);
                        }
                    }
                    jnq2 = amb.r2l.vg8.up_;
                }
                try {
                    try {
                        n = jnq2.nb5;
                        if (n3 == 0) break block16;
                        if (n >= 8) break block17;
                    }
                    catch (oov oov6) {
                        throw amb.a(oov6);
                    }
                    n = 4;
                    break block16;
                }
                catch (oov oov7) {
                    throw amb.a(oov7);
                }
            }
            n = -1;
        }
        return n2 + n;
    }

    public static int rk5(int n) {
        try {
            if (amb.r2l.vg8.up_.c41[n] == null) {
                return n;
            }
        }
        catch (oov oov2) {
            throw amb.a(oov2);
        }
        return amb.zws();
    }

    public static void vtl(int n) {
        amb.r2l.l7q.efg(amb.r2l.vg8.fv9.h7l, n, 0, 1, amb.r2l.vg8);
    }

    public static void l_g(int n, int n2) {
        amb.r2l.l7q.efg(amb.r2l.vg8.fv9.h7l, n, n2, 2, amb.r2l.vg8);
    }

    public static boolean sxg() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = Arrays.asList(amb.r2l.vg8.up_.c41).contains(null);
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw amb.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public static int uew(int n) {
        return 8 - n;
    }

    public static void f4n() {
        amb.r2l.l7q.sendUseItem(amb.r2l.vg8, amb.r2l.tij, amb.r2l.vg8.up_.dxs());
    }

    public static erg p2w() {
        erg erg2;
        block6: {
            l86 l862;
            block4: {
                block5: {
                    int n = t9d.b();
                    try {
                        try {
                            l862 = amb.r2l.vg8;
                            if (n == 0) break block4;
                            if (l862.b5z() != null) break block5;
                        }
                        catch (oov oov2) {
                            throw amb.a(oov2);
                        }
                        erg2 = new erg(ox_.ibw);
                        break block6;
                    }
                    catch (oov oov3) {
                        throw amb.a(oov3);
                    }
                }
                l862 = amb.r2l.vg8;
            }
            erg2 = l862.b5z();
        }
        return erg2;
    }

    public static erg txc(int n) {
        erg erg2;
        block6: {
            int n2;
            erg[] ergArray;
            block4: {
                block5: {
                    int n3 = t9d.b();
                    try {
                        try {
                            ergArray = amb.r2l.vg8.up_.c41;
                            n2 = n;
                            if (n3 == 0) break block4;
                            if (ergArray[n2] != null) break block5;
                        }
                        catch (oov oov2) {
                            throw amb.a(oov2);
                        }
                        erg2 = new erg(ox_.ibw);
                        break block6;
                    }
                    catch (oov oov3) {
                        throw amb.a(oov3);
                    }
                }
                ergArray = amb.r2l.vg8.up_.c41;
                n2 = n;
            }
            erg2 = ergArray[n2];
        }
        return erg2;
    }

    public static List d5v() {
        ArrayList<erg> arrayList;
        block4: {
            ArrayList<erg> arrayList2 = new ArrayList<erg>();
            int n = t9d.b();
            for (int i = 0; i < 9; ++i) {
                try {
                    arrayList = arrayList2;
                    if (n != 0) {
                        arrayList.add(amb.r2l.vg8.up_.c41[i]);
                        if (n != 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw amb.a(oov2);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static List ta6() {
        ArrayList<erg> arrayList;
        block11: {
            int n;
            int n2;
            ArrayList<erg> arrayList2;
            block9: {
                arrayList2 = new ArrayList<erg>();
                n2 = t9d.c();
                for (n = 0; n < 35; ++n) {
                    try {
                        arrayList2.add(amb.r2l.vg8.up_.c41[n]);
                        if (n2 == 0) {
                            if (n2 == 0) continue;
                            break;
                        }
                        break block9;
                    }
                    catch (oov oov2) {
                        throw amb.a(oov2);
                    }
                }
                n = 0;
            }
            try {
                do {
                    try {
                        if (n >= 4) break;
                        arrayList = arrayList2;
                        if (n2 != 0) break block11;
                    }
                    catch (oov oov3) {
                        throw amb.a(oov3);
                    }
                    arrayList.add(amb.r2l.vg8.up_.tjd(n));
                    ++n;
                } while (n2 == 0);
            }
            catch (oov oov4) {
                throw amb.a(oov4);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static List f12() {
        ArrayList<erg> arrayList;
        block4: {
            ArrayList<erg> arrayList2 = new ArrayList<erg>();
            int n = t9d.c();
            for (int i = 9; i < 35; ++i) {
                try {
                    arrayList = arrayList2;
                    if (n == 0) {
                        arrayList.add(amb.r2l.vg8.up_.c41[i]);
                        if (n == 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw amb.a(oov2);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static int kiu() {
        int n = t9d.b();
        for (int i = 0; i < 9; ++i) {
            try {
                if (amb.r2l.vg8.up_.c41[i] != null) continue;
                return i;
            }
            catch (oov oov2) {
                throw amb.a(oov2);
            }
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float my2(erg erg2) {
        int n;
        float f;
        block11: {
            block12: {
                u7m u7m2;
                int n2;
                block9: {
                    block10: {
                        erg erg3;
                        block8: {
                            n2 = t9d.c();
                            try {
                                erg3 = erg2;
                                if (n2 != 0) break block8;
                                if (erg3 == null) return -1.0f;
                            }
                            catch (oov oov2) {
                                throw amb.a(oov2);
                            }
                            erg3 = erg2;
                        }
                        try {
                            try {
                                u7m2 = erg3.gn1();
                                if (n2 != 0) break block9;
                                if (u7m2 instanceof jpt) break block10;
                                return -1.0f;
                            }
                            catch (oov oov3) {
                                throw amb.a(oov3);
                            }
                        }
                        catch (oov oov4) {
                            throw amb.a(oov4);
                        }
                    }
                    u7m2 = erg2.gn1();
                }
                jpt jpt2 = (jpt)u7m2;
                f = 0.0f;
                f += (float)jpt2._wl;
                try {
                    n = hc0.aau(erg2).size();
                    if (n2 != 0) break block11;
                    if (n > 0) break block12;
                }
                catch (oov oov5) {
                    throw amb.a(oov5);
                }
                f = (float)((double)f - 0.1);
            }
            n = hc0.qa_(vef.o55.bbf, erg2);
        }
        int n3 = n;
        return (float)((double)f + (double)n3 * 0.2);
    }

    public static boolean b_r() {
        boolean bl;
        block12: {
            block14: {
                block13: {
                    erg erg2;
                    int n;
                    block10: {
                        block11: {
                            n = t9d.b();
                            try {
                                try {
                                    erg2 = amb.r2l.vg8.up_.dxs();
                                    if (n == 0) break block10;
                                    if (erg2 == null) break block11;
                                }
                                catch (oov oov2) {
                                    throw amb.a(oov2);
                                }
                                return false;
                            }
                            catch (oov oov3) {
                                throw amb.a(oov3);
                            }
                        }
                        erg2 = amb.r2l.vg8.up_.dxs();
                    }
                    try {
                        try {
                            try {
                                bl = erg2.gn1() instanceof dlj;
                                if (n == 0) break block12;
                                if (bl) break block13;
                            }
                            catch (oov oov4) {
                                throw amb.a(oov4);
                            }
                            bl = amb.r2l.vg8.up_.dxs().gn1() instanceof za6;
                            if (n == 0) break block12;
                        }
                        catch (oov oov5) {
                            throw amb.a(oov5);
                        }
                        if (!bl) break block14;
                    }
                    catch (oov oov6) {
                        throw amb.a(oov6);
                    }
                }
                bl = true;
                break block12;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean gcw() {
        boolean bl;
        block8: {
            block7: {
                erg erg2;
                int n;
                block6: {
                    n = t9d.b();
                    try {
                        try {
                            erg2 = amb.r2l.vg8.tsc();
                            if (n == 0) break block6;
                            if (erg2 == null) break block7;
                        }
                        catch (oov oov2) {
                            throw amb.a(oov2);
                        }
                        erg2 = amb.r2l.vg8.tsc();
                    }
                    catch (oov oov3) {
                        throw amb.a(oov3);
                    }
                }
                try {
                    bl = erg2.gn1() instanceof za6;
                    if (n == 0) break block8;
                    if (!bl) break block7;
                }
                catch (oov oov4) {
                    throw amb.a(oov4);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public static void _i2() {
        int n = t9d.c();
        int n2 = 9;
        while (n2 < 45) {
            block27: {
                block26: {
                    int n3;
                    block32: {
                        block30: {
                            block29: {
                                block28: {
                                    vrx vrx2;
                                    block25: {
                                        try {
                                            try {
                                                vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                                if (n != 0) break block25;
                                                if (!vrx2.hf8()) break block26;
                                            }
                                            catch (oov oov2) {
                                                throw amb.a(oov2);
                                            }
                                            vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                        }
                                        catch (oov oov3) {
                                            throw amb.a(oov3);
                                        }
                                    }
                                    erg erg2 = vrx2.x4s();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n != 0) break block27;
                                                    if (!amb.eke(erg2)) break block26;
                                                }
                                                catch (oov oov4) {
                                                    throw amb.a(oov4);
                                                }
                                                n3 = fqe;
                                                if (n != 0) break block28;
                                            }
                                            catch (oov oov5) {
                                                throw amb.a(oov5);
                                            }
                                            if (n3 == n2) break block26;
                                        }
                                        catch (oov oov6) {
                                            throw amb.a(oov6);
                                        }
                                        n3 = amb.ejj(erg2) ? 1 : 0;
                                    }
                                    catch (oov oov7) {
                                        throw amb.a(oov7);
                                    }
                                }
                                try {
                                    try {
                                        if (n != 0) break block29;
                                        if (n3 != 0) break block26;
                                    }
                                    catch (oov oov8) {
                                        throw amb.a(oov8);
                                    }
                                    n3 = amb.r2l.vg8.fv9.ajr(fqe).hf8() ? 1 : 0;
                                }
                                catch (oov oov9) {
                                    throw amb.a(oov9);
                                }
                            }
                            try {
                                block31: {
                                    try {
                                        try {
                                            if (n != 0) break block30;
                                            if (n3 != 0) break block31;
                                        }
                                        catch (oov oov10) {
                                            throw amb.a(oov10);
                                        }
                                        amb.l_g(n2, fqe - 36);
                                        if (n == 0) break block26;
                                    }
                                    catch (oov oov11) {
                                        throw amb.a(oov11);
                                    }
                                }
                                n3 = amb.eke(amb.r2l.vg8.fv9.ajr(fqe).x4s()) ? 1 : 0;
                            }
                            catch (oov oov12) {
                                throw amb.a(oov12);
                            }
                        }
                        try {
                            if (n != 0) break block32;
                            if (n3 != 0) break block26;
                        }
                        catch (oov oov13) {
                            throw amb.a(oov13);
                        }
                        n3 = n2;
                    }
                    amb.l_g(n3, fqe - 36);
                }
                ++n2;
            }
            if (n == 0) continue;
        }
    }

    public static void taj() {
        int n = t9d.b();
        int n2 = 9;
        while (n2 < 45) {
            block27: {
                block26: {
                    int n3;
                    block32: {
                        block30: {
                            block29: {
                                block28: {
                                    vrx vrx2;
                                    block25: {
                                        try {
                                            try {
                                                vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                                if (n == 0) break block25;
                                                if (!vrx2.hf8()) break block26;
                                            }
                                            catch (oov oov2) {
                                                throw amb.a(oov2);
                                            }
                                            vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                        }
                                        catch (oov oov3) {
                                            throw amb.a(oov3);
                                        }
                                    }
                                    erg erg2 = vrx2.x4s();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n == 0) break block27;
                                                    if (!amb.itg(erg2)) break block26;
                                                }
                                                catch (oov oov4) {
                                                    throw amb.a(oov4);
                                                }
                                                n3 = r5g;
                                                if (n == 0) break block28;
                                            }
                                            catch (oov oov5) {
                                                throw amb.a(oov5);
                                            }
                                            if (n3 == n2) break block26;
                                        }
                                        catch (oov oov6) {
                                            throw amb.a(oov6);
                                        }
                                        n3 = amb.ejj(erg2) ? 1 : 0;
                                    }
                                    catch (oov oov7) {
                                        throw amb.a(oov7);
                                    }
                                }
                                try {
                                    try {
                                        if (n == 0) break block29;
                                        if (n3 != 0) break block26;
                                    }
                                    catch (oov oov8) {
                                        throw amb.a(oov8);
                                    }
                                    n3 = amb.r2l.vg8.fv9.ajr(r5g).hf8() ? 1 : 0;
                                }
                                catch (oov oov9) {
                                    throw amb.a(oov9);
                                }
                            }
                            try {
                                block31: {
                                    try {
                                        try {
                                            if (n == 0) break block30;
                                            if (n3 != 0) break block31;
                                        }
                                        catch (oov oov10) {
                                            throw amb.a(oov10);
                                        }
                                        amb.l_g(n2, r5g - 36);
                                        if (n != 0) break block26;
                                    }
                                    catch (oov oov11) {
                                        throw amb.a(oov11);
                                    }
                                }
                                n3 = amb.itg(amb.r2l.vg8.fv9.ajr(r5g).x4s()) ? 1 : 0;
                            }
                            catch (oov oov12) {
                                throw amb.a(oov12);
                            }
                        }
                        try {
                            if (n == 0) break block32;
                            if (n3 != 0) break block26;
                        }
                        catch (oov oov13) {
                            throw amb.a(oov13);
                        }
                        n3 = n2;
                    }
                    amb.l_g(n3, r5g - 36);
                }
                ++n2;
            }
            if (n != 0) continue;
        }
    }

    public static void aki() {
        int n = t9d.c();
        int n2 = 9;
        while (n2 < 45) {
            block27: {
                block26: {
                    int n3;
                    block32: {
                        block30: {
                            block29: {
                                block28: {
                                    vrx vrx2;
                                    block25: {
                                        try {
                                            try {
                                                vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                                if (n != 0) break block25;
                                                if (!vrx2.hf8()) break block26;
                                            }
                                            catch (oov oov2) {
                                                throw amb.a(oov2);
                                            }
                                            vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                        }
                                        catch (oov oov3) {
                                            throw amb.a(oov3);
                                        }
                                    }
                                    erg erg2 = vrx2.x4s();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n != 0) break block27;
                                                    if (!amb.w5o(erg2)) break block26;
                                                }
                                                catch (oov oov4) {
                                                    throw amb.a(oov4);
                                                }
                                                n3 = b4p;
                                                if (n != 0) break block28;
                                            }
                                            catch (oov oov5) {
                                                throw amb.a(oov5);
                                            }
                                            if (n3 == n2) break block26;
                                        }
                                        catch (oov oov6) {
                                            throw amb.a(oov6);
                                        }
                                        n3 = amb.ejj(erg2) ? 1 : 0;
                                    }
                                    catch (oov oov7) {
                                        throw amb.a(oov7);
                                    }
                                }
                                try {
                                    try {
                                        if (n != 0) break block29;
                                        if (n3 != 0) break block26;
                                    }
                                    catch (oov oov8) {
                                        throw amb.a(oov8);
                                    }
                                    n3 = amb.r2l.vg8.fv9.ajr(b4p).hf8() ? 1 : 0;
                                }
                                catch (oov oov9) {
                                    throw amb.a(oov9);
                                }
                            }
                            try {
                                block31: {
                                    try {
                                        try {
                                            if (n != 0) break block30;
                                            if (n3 != 0) break block31;
                                        }
                                        catch (oov oov10) {
                                            throw amb.a(oov10);
                                        }
                                        amb.l_g(n2, b4p - 36);
                                        if (n == 0) break block26;
                                    }
                                    catch (oov oov11) {
                                        throw amb.a(oov11);
                                    }
                                }
                                n3 = amb.w5o(amb.r2l.vg8.fv9.ajr(b4p).x4s()) ? 1 : 0;
                            }
                            catch (oov oov12) {
                                throw amb.a(oov12);
                            }
                        }
                        try {
                            if (n != 0) break block32;
                            if (n3 != 0) break block26;
                        }
                        catch (oov oov13) {
                            throw amb.a(oov13);
                        }
                        n3 = n2;
                    }
                    amb.l_g(n3, b4p - 36);
                }
                ++n2;
            }
            if (n == 0) continue;
        }
    }

    public static boolean eke(erg erg2) {
        boolean bl;
        block18: {
            int n;
            block16: {
                boolean bl2;
                block15: {
                    n = t9d.b();
                    u7m u7m2 = erg2.gn1();
                    try {
                        bl2 = u7m2 instanceof f5h;
                        if (n == 0) break block15;
                        if (bl2) break block16;
                    }
                    catch (oov oov2) {
                        throw amb.a(oov2);
                    }
                    bl2 = false;
                }
                return bl2;
            }
            float f = amb.fs1(erg2);
            int n2 = 9;
            while (n2 < 45) {
                block20: {
                    block19: {
                        boolean bl3;
                        block21: {
                            vrx vrx2;
                            block17: {
                                try {
                                    try {
                                        try {
                                            vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                            if (n == 0) break block17;
                                            bl = vrx2.hf8();
                                            if (n == 0) break block18;
                                        }
                                        catch (oov oov3) {
                                            throw amb.a(oov3);
                                        }
                                        if (!bl) break block19;
                                    }
                                    catch (oov oov4) {
                                        throw amb.a(oov4);
                                    }
                                    vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                }
                                catch (oov oov5) {
                                    throw amb.a(oov5);
                                }
                            }
                            erg erg3 = vrx2.x4s();
                            try {
                                try {
                                    try {
                                        if (n == 0) break block20;
                                        if (!(amb.fs1(erg3) > f)) break block19;
                                    }
                                    catch (oov oov6) {
                                        throw amb.a(oov6);
                                    }
                                    bl3 = erg3.gn1() instanceof f5h;
                                    if (n == 0) break block21;
                                }
                                catch (oov oov7) {
                                    throw amb.a(oov7);
                                }
                                if (!bl3) break block19;
                            }
                            catch (oov oov8) {
                                throw amb.a(oov8);
                            }
                            bl3 = false;
                        }
                        return bl3;
                    }
                    ++n2;
                }
                if (n != 0) continue;
            }
            bl = true;
        }
        return bl;
    }

    public static boolean itg(erg erg2) {
        boolean bl;
        block18: {
            int n;
            block16: {
                boolean bl2;
                block15: {
                    n = t9d.c();
                    u7m u7m2 = erg2.gn1();
                    try {
                        bl2 = u7m2 instanceof svo;
                        if (n != 0) break block15;
                        if (bl2) break block16;
                    }
                    catch (oov oov2) {
                        throw amb.a(oov2);
                    }
                    bl2 = false;
                }
                return bl2;
            }
            float f = amb.fs1(erg2);
            int n2 = 9;
            while (n2 < 45) {
                block20: {
                    block19: {
                        boolean bl3;
                        block21: {
                            vrx vrx2;
                            block17: {
                                try {
                                    try {
                                        try {
                                            vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                            if (n != 0) break block17;
                                            bl = vrx2.hf8();
                                            if (n != 0) break block18;
                                        }
                                        catch (oov oov3) {
                                            throw amb.a(oov3);
                                        }
                                        if (!bl) break block19;
                                    }
                                    catch (oov oov4) {
                                        throw amb.a(oov4);
                                    }
                                    vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                }
                                catch (oov oov5) {
                                    throw amb.a(oov5);
                                }
                            }
                            erg erg3 = vrx2.x4s();
                            try {
                                try {
                                    try {
                                        if (n != 0) break block20;
                                        if (!(amb.fs1(erg3) > f)) break block19;
                                    }
                                    catch (oov oov6) {
                                        throw amb.a(oov6);
                                    }
                                    bl3 = erg3.gn1() instanceof svo;
                                    if (n != 0) break block21;
                                }
                                catch (oov oov7) {
                                    throw amb.a(oov7);
                                }
                                if (!bl3) break block19;
                            }
                            catch (oov oov8) {
                                throw amb.a(oov8);
                            }
                            bl3 = false;
                        }
                        return bl3;
                    }
                    ++n2;
                }
                if (n == 0) continue;
            }
            bl = true;
        }
        return bl;
    }

    public static boolean w5o(erg erg2) {
        boolean bl;
        block22: {
            int n;
            block20: {
                boolean bl2;
                block19: {
                    n = t9d.b();
                    u7m u7m2 = erg2.gn1();
                    try {
                        bl2 = u7m2 instanceof dlj;
                        if (n == 0) break block19;
                        if (bl2) break block20;
                    }
                    catch (oov oov2) {
                        throw amb.a(oov2);
                    }
                    bl2 = false;
                }
                return bl2;
            }
            float f = amb.fs1(erg2);
            int n2 = 9;
            while (n2 < 45) {
                block24: {
                    block23: {
                        boolean bl3;
                        block26: {
                            block25: {
                                vrx vrx2;
                                block21: {
                                    try {
                                        try {
                                            try {
                                                vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                                if (n == 0) break block21;
                                                bl = vrx2.hf8();
                                                if (n == 0) break block22;
                                            }
                                            catch (oov oov3) {
                                                throw amb.a(oov3);
                                            }
                                            if (!bl) break block23;
                                        }
                                        catch (oov oov4) {
                                            throw amb.a(oov4);
                                        }
                                        vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                    }
                                    catch (oov oov5) {
                                        throw amb.a(oov5);
                                    }
                                }
                                erg erg3 = vrx2.x4s();
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n == 0) break block24;
                                                if (!(amb.fs1(erg3) > f)) break block23;
                                            }
                                            catch (oov oov6) {
                                                throw amb.a(oov6);
                                            }
                                            bl3 = erg3.gn1() instanceof dlj;
                                            if (n == 0) break block25;
                                        }
                                        catch (oov oov7) {
                                            throw amb.a(oov7);
                                        }
                                        if (!bl3) break block23;
                                    }
                                    catch (oov oov8) {
                                        throw amb.a(oov8);
                                    }
                                    bl3 = amb.ejj(erg2);
                                }
                                catch (oov oov9) {
                                    throw amb.a(oov9);
                                }
                            }
                            try {
                                if (n == 0) break block26;
                                if (bl3) break block23;
                            }
                            catch (oov oov10) {
                                throw amb.a(oov10);
                            }
                            bl3 = false;
                        }
                        return bl3;
                    }
                    ++n2;
                }
                if (n != 0) continue;
            }
            bl = true;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public static float fs1(erg var0) {
        block29: {
            block30: {
                block32: {
                    block31: {
                        block28: {
                            block26: {
                                block27: {
                                    var1_1 = amb.a ^ 68554223638948L;
                                    var3_2 = t9d.b();
                                    var4_3 = var0.gn1();
                                    try {
                                        try {
                                            v0 = var4_3;
                                            if (var3_2 == 0) break block26;
                                            if (v0 instanceof arf) break block27;
                                        }
                                        catch (oov v1) {
                                            throw amb.a(v1);
                                        }
                                        return 0.0f;
                                    }
                                    catch (oov v2) {
                                        throw amb.a(v2);
                                    }
                                }
                                v0 = var4_3;
                            }
                            var5_4 = v0.ayn();
                            var6_5 = (arf)var4_3;
                            var7_6 = 1.0f;
                            try {
                                v3 = var4_3 instanceof f5h;
                                if (var3_2 == 0) break block28;
                                if (v3) {
                                }
                                ** GOTO lbl40
                            }
                            catch (oov v4) {
                                throw amb.a(v4);
                            }
                            var7_6 = var6_5.v1f(var0, ox_.pu8);
                            try {
                                if (var3_2 == 0) break block29;
                                if (!var5_4.toLowerCase().contains((CharSequence)amb.a("s", (int)30174, (long)(1178399250230496969L ^ var1_1)))) break block30;
                            }
                            catch (oov v5) {
                                throw amb.a(v5);
                            }
                            var7_6 -= 5.0f;
                            try {
                                if (var3_2 != 0) break block30;
lbl40:
                                // 2 sources

                                v3 = var4_3 instanceof svo;
                            }
                            catch (oov v6) {
                                throw amb.a(v6);
                            }
                        }
                        try {
                            if (var3_2 == 0) break block31;
                            if (v3) {
                            }
                            ** GOTO lbl63
                        }
                        catch (oov v7) {
                            throw amb.a(v7);
                        }
                        var7_6 = var6_5.v1f(var0, ox_.kqk);
                        try {
                            if (var3_2 == 0) break block29;
                            if (!var5_4.toLowerCase().contains((CharSequence)amb.a("s", (int)13539, (long)(8536644168309346293L ^ var1_1)))) break block30;
                        }
                        catch (oov v8) {
                            throw amb.a(v8);
                        }
                        var7_6 -= 5.0f;
                        try {
                            if (var3_2 != 0) break block30;
lbl63:
                            // 2 sources

                            v3 = var4_3 instanceof dlj;
                        }
                        catch (oov v9) {
                            throw amb.a(v9);
                        }
                    }
                    try {
                        if (var3_2 == 0) break block32;
                        if (v3) {
                        }
                        ** GOTO lbl89
                    }
                    catch (oov v10) {
                        throw amb.a(v10);
                    }
                    var7_6 = var6_5.v1f(var0, ox_.uom);
                    try {
                        if (var3_2 == 0) break block29;
                        v3 = var5_4.toLowerCase().contains((CharSequence)amb.a("s", (int)13539, (long)(8536644168309346293L ^ var1_1)));
                    }
                    catch (oov v11) {
                        throw amb.a(v11);
                    }
                }
                if (!v3) break block30;
                var7_6 -= 5.0f;
                try {
                    if (var3_2 != 0) break block30;
lbl89:
                    // 2 sources

                    return 1.0f;
                }
                catch (oov v12) {
                    throw amb.a(v12);
                }
            }
            var7_6 = (float)((double)var7_6 + (double)hc0.qa_(vef.y_g.bbf, var0) * 0.0075);
            var7_6 = (float)((double)var7_6 + (double)hc0.qa_(vef._jm.bbf, var0) / 100.0);
        }
        return var7_6;
    }

    public static boolean ejj(erg erg2) {
        boolean bl;
        block22: {
            block23: {
                int n;
                block18: {
                    float f = amb.dga(erg2);
                    int n2 = 9;
                    n = t9d.b();
                    while (n2 < 45) {
                        block20: {
                            block19: {
                                boolean bl2;
                                block21: {
                                    vrx vrx2;
                                    block17: {
                                        try {
                                            try {
                                                try {
                                                    vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                                    if (n == 0) break block17;
                                                    bl = vrx2.hf8();
                                                    if (n == 0) break block18;
                                                }
                                                catch (oov oov2) {
                                                    throw amb.a(oov2);
                                                }
                                                if (!bl) break block19;
                                            }
                                            catch (oov oov3) {
                                                throw amb.a(oov3);
                                            }
                                            vrx2 = amb.r2l.vg8.fv9.ajr(n2);
                                        }
                                        catch (oov oov4) {
                                            throw amb.a(oov4);
                                        }
                                    }
                                    erg erg3 = vrx2.x4s();
                                    try {
                                        try {
                                            try {
                                                if (n == 0) break block20;
                                                if (!(amb.dga(erg3) > f)) break block19;
                                            }
                                            catch (oov oov5) {
                                                throw amb.a(oov5);
                                            }
                                            bl2 = erg3.gn1() instanceof za6;
                                            if (n == 0) break block21;
                                        }
                                        catch (oov oov6) {
                                            throw amb.a(oov6);
                                        }
                                        if (!bl2) break block19;
                                    }
                                    catch (oov oov7) {
                                        throw amb.a(oov7);
                                    }
                                    bl2 = false;
                                }
                                return bl2;
                            }
                            ++n2;
                        }
                        if (n != 0) continue;
                    }
                    bl = erg2.gn1() instanceof za6;
                }
                try {
                    try {
                        if (n == 0) break block22;
                        if (!bl) break block23;
                    }
                    catch (oov oov8) {
                        throw amb.a(oov8);
                    }
                    return true;
                }
                catch (oov oov9) {
                    throw amb.a(oov9);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static float dga(erg erg2) {
        block9: {
            u7m u7m2;
            u7m u7m3;
            block8: {
                boolean bl;
                u7m u7m4;
                block6: {
                    int n;
                    block7: {
                        float f = 0.0f;
                        u7m4 = erg2.gn1();
                        n = t9d.b();
                        try {
                            bl = u7m4 instanceof arf;
                            if (n == 0) break block6;
                            if (!bl) break block7;
                        }
                        catch (oov oov2) {
                            throw amb.a(oov2);
                        }
                        u7m3 = (arf)u7m4;
                        f += ((arf)u7m3).mqh;
                    }
                    try {
                        u7m2 = u7m4;
                        if (n == 0) break block8;
                        bl = u7m2 instanceof za6;
                    }
                    catch (oov oov3) {
                        throw amb.a(oov3);
                    }
                }
                if (!bl) break block9;
                u7m2 = u7m4;
            }
            u7m3 = (za6)u7m2;
            f += ((za6)u7m3).ngv();
        }
        return f += (float)hc0.qa_(vef.m3n.bbf, erg2) * 1.25f + (float)hc0.qa_(vef.zbl.bbf, erg2) * 0.01f;
    }

    public static boolean gjz(u7m u7m2) {
        int n;
        block6: {
            block7: {
                block5: {
                    u7m u7m3;
                    int n2;
                    block4: {
                        n2 = t9d.b();
                        try {
                            u7m3 = u7m2;
                            if (n2 == 0) break block4;
                            if (u7m3 == null) break block5;
                        }
                        catch (oov oov2) {
                            throw amb.a(oov2);
                        }
                        u7m3 = u7m2;
                    }
                    try {
                        n = u7m._lo(u7m3);
                        if (n2 == 0) break block6;
                        if (n != 0) break block7;
                    }
                    catch (oov oov3) {
                        throw amb.a(oov3);
                    }
                }
                n = 1;
                break block6;
            }
            n = 0;
        }
        return n != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(-2974106876850731935L, 465182622708471376L, MethodHandles.lookup().lookupClass()).a(142093711437932L);
        d = new HashMap(13);
        long l = a ^ 0x4DE64D0AB393L;
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
        String string = "\u00b4\u00d4\u00ff\u00a5\u0083\"\u0083j\u00dbR\u00f4\u0099\u000637\u00ec\u0010\u00b2\u0010\u000f\u00f5\u000b\u00ff\u0099s\\P\u00d7n\u0012@_\u00bc";
        int n2 = "\u00b4\u00d4\u00ff\u00a5\u0083\"\u0083j\u00dbR\u00f4\u0099\u000637\u00ec\u0010\u00b2\u0010\u000f\u00f5\u000b\u00ff\u0099s\\P\u00d7n\u0012@_\u00bc".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = amb.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                r2l = c05.vz1();
                fqe = 37;
                b4p = 38;
                r5g = 39;
                return;
            }
            n3 = string.charAt(n4);
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2762;
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
                throw new RuntimeException("amb", exception);
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
            amb.c[n2] = amb.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = amb.a(n, l);
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
            throw new RuntimeException("amb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(amb.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

