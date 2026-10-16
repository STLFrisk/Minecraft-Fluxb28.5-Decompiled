/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C02PacketUseEntity$_y6;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C07PacketPlayerDigging$pl2;
import org.lwjgl.opengl.GL11;

public class fyk
extends ar7 {
    public static g_3 kfa;
    public static cn7 s4u;
    public static crk w1a;
    public static crk vto;
    public static crk bxq;
    public static crk u2o;
    public static crk q84;
    public static crk kog;
    public static crk exx;
    public static cn7 jff;
    public static cn7 dsv;
    public static cn7 qa6;
    public static cn7 ky3;
    public static cn7 sy_;
    public static cn7 g4y;
    public static cn7 ogx;
    public static c_3 qiz;
    public static ArrayList r3i;
    public nhs kl3;
    public static int bwo;
    public static boolean f8f;
    public static boolean qcf;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public fyk() {
        long l = a ^ 0x744D2F8D07AEL;
        super((String)((Object)fyk.b("i", (int)7821, (long)(0x10FB553A38E118CDL ^ l))), _aj.p3z, true, new j1s[]{new xbs(true), new xbs(false), new e9p()});
        this.kl3 = new nhs();
    }

    /*
     * Unable to fully structure code
     */
    @jev(jn1=3)
    public void k27(fha var1_1) {
        block27: {
            block26: {
                var2_2 = fyk.a ^ 124938212027587L;
                var4_3 = t9d.c();
                try {
                    try {
                        v0 = fyk.g4y.g7m();
                        if (var4_3 != 0) break block26;
                        if (!v0) break block27;
                    }
                    catch (oov v1) {
                        throw fyk.a(v1);
                    }
                    v0 = kgt.nd5.kl3.us_(50.0);
                }
                catch (oov v2) {
                    throw fyk.a(v2);
                }
            }
            if (!v0) break block27;
            var5_4 = new eka(fyk.ek1);
            var6_5 = 0;
            for (i2h var8_7 : fyk.ek1.tij.guf) {
                block29: {
                    block32: {
                        block30: {
                            block31: {
                                block34: {
                                    block33: {
                                        block28: {
                                            try {
                                                try {
                                                    v3 = var8_7;
                                                    if (var4_3 != 0) break block28;
                                                    if (!(v3 instanceof ha9)) break block29;
                                                }
                                                catch (oov v4) {
                                                    throw fyk.a(v4);
                                                }
                                                v3 = var8_7;
                                            }
                                            catch (oov v5) {
                                                throw fyk.a(v5);
                                            }
                                        }
                                        var9_8 = (ha9)v3;
                                        if (!this.smu().wyk((String)fyk.b("i", (int)1255, (long)(1876012688530909636L ^ var2_2)))) break block33;
                                        var10_9 = xbs.lo6;
                                        if (var4_3 == 0) break block34;
                                    }
                                    var10_9 = new ArrayList<g_3>();
                                    var10_9.add(fyk.kfa);
                                }
                                try {
                                    try {
                                        try {
                                            if (var10_9.contains(var8_7)) {
                                                v6 = var9_8.pwz;
                                                if (var4_3 != 0) break block30;
                                            }
                                            ** GOTO lbl70
                                        }
                                        catch (oov v7) {
                                            throw fyk.a(v7);
                                        }
                                        if (v6 != null) break block31;
                                    }
                                    catch (oov v8) {
                                        throw fyk.a(v8);
                                    }
                                    var9_8.pwz = new fyk$r1f(this, var9_8);
                                }
                                catch (oov v9) {
                                    throw fyk.a(v9);
                                }
                            }
                            v6 = var9_8.pwz;
                        }
                        try {
                            try {
                                try {
                                    v6.cag(var5_4.x05() / 2 + 20, var5_4.lrx() / 2 - 20 + var6_5 * 45);
                                    ++var6_5;
                                    if (var4_3 == 0) break block29;
lbl70:
                                    // 2 sources

                                    v10 = var9_8.pwz;
                                    if (var4_3 != 0) break block32;
                                }
                                catch (oov v11) {
                                    throw fyk.a(v11);
                                }
                                if (v10 == null) break block29;
                            }
                            catch (oov v12) {
                                throw fyk.a(v12);
                            }
                            v10 = var9_8.pwz;
                        }
                        catch (oov v13) {
                            throw fyk.a(v13);
                        }
                    }
                    v10.q5z = 0.0f;
                }
                if (var4_3 == 0) continue;
            }
        }
    }

    @Override
    public void ron() {
        r3i.clear();
        super.ron();
    }

    @Override
    public void ne2() {
        kfa = null;
        super.ne2();
    }

    @jev
    public void ohn(ccn ccn2) {
        long l = a ^ 0x3193006C3D6L;
        this.n5o(this.m2d() + (String)((Object)fyk.b("i", (int)10268, (long)(0x4E969D2ACF96A31L ^ l))) + this.smu().d7c());
    }

    @jev
    public void __1(axn axn2) {
        long l = a ^ 0x2859FEF7A0A8L;
        try {
            if (sy_.d7c().booleanValue()) {
                this.yse(false);
                zet.gn0((String)((Object)fyk.b("i", (int)2589, (long)(0x2E992EC8340FAB56L ^ l))), this.m2d() + (String)((Object)fyk.b("i", (int)557, (long)(0x6D0DCCB00AE72377L ^ l))), jgv$vro.h_d);
            }
        }
        catch (oov oov2) {
            throw fyk.a(oov2);
        }
    }

    public static boolean b6k(g_3 g_32, double d) {
        boolean bl;
        block132: {
            block133: {
                int n;
                block130: {
                    block131: {
                        block128: {
                            block129: {
                                block126: {
                                    block127: {
                                        block124: {
                                            double d2;
                                            block125: {
                                                block122: {
                                                    block120: {
                                                        block121: {
                                                            block118: {
                                                                block119: {
                                                                    long l;
                                                                    block116: {
                                                                        block117: {
                                                                            block114: {
                                                                                block115: {
                                                                                    g_3 g_33;
                                                                                    block110: {
                                                                                        block111: {
                                                                                            byte n2;
                                                                                            block112: {
                                                                                                block113: {
                                                                                                    block108: {
                                                                                                        l = a ^ 0x13D21B0CDF1FL;
                                                                                                        n = t9d.b();
                                                                                                        try {
                                                                                                            block109: {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    n2 = g_32.ma9;
                                                                                                                                    if (n == 0) break block108;
                                                                                                                                    if (n2 != 0) break block109;
                                                                                                                                }
                                                                                                                                catch (oov oov2) {
                                                                                                                                    throw fyk.a(oov2);
                                                                                                                                }
                                                                                                                                float f = g_32.i55() - 0.0f;
                                                                                                                                n2 = f == 0.0f ? (byte)0 : (f < 0.0f ? (byte)-1 : 1);
                                                                                                                                if (n == 0) break block108;
                                                                                                                            }
                                                                                                                            catch (oov oov3) {
                                                                                                                                throw fyk.a(oov3);
                                                                                                                            }
                                                                                                                            if (n2 <= 0) break block109;
                                                                                                                        }
                                                                                                                        catch (oov oov4) {
                                                                                                                            throw fyk.a(oov4);
                                                                                                                        }
                                                                                                                        g_33 = g_32;
                                                                                                                        if (n == 0) break block110;
                                                                                                                    }
                                                                                                                    catch (oov oov5) {
                                                                                                                        throw fyk.a(oov5);
                                                                                                                    }
                                                                                                                    if (g_33 != fyk.ek1.vg8) break block111;
                                                                                                                }
                                                                                                                catch (oov oov6) {
                                                                                                                    throw fyk.a(oov6);
                                                                                                                }
                                                                                                            }
                                                                                                            n2 = r3i.contains(g_32);
                                                                                                        }
                                                                                                        catch (oov oov7) {
                                                                                                            throw fyk.a(oov7);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (n == 0) break block112;
                                                                                                                            if (n2 == 0) break block113;
                                                                                                                        }
                                                                                                                        catch (oov oov8) {
                                                                                                                            throw fyk.a(oov8);
                                                                                                                        }
                                                                                                                        ++bwo;
                                                                                                                        n2 = kgt.ynw.klu() ? 1 : 0;
                                                                                                                        if (n == 0) break block112;
                                                                                                                    }
                                                                                                                    catch (oov oov9) {
                                                                                                                        throw fyk.a(oov9);
                                                                                                                    }
                                                                                                                    if (n2 == 0) break block113;
                                                                                                                }
                                                                                                                catch (oov oov10) {
                                                                                                                    throw fyk.a(oov10);
                                                                                                                }
                                                                                                                r3i.remove(g_32);
                                                                                                                ncl.vhi(pjd.l4v(g_32.noc()));
                                                                                                                n2 = pjd.qq7.g7m() ? 1 : 0;
                                                                                                                if (n == 0) break block112;
                                                                                                            }
                                                                                                            catch (oov oov11) {
                                                                                                                throw fyk.a(oov11);
                                                                                                            }
                                                                                                            if (n2 == 0) break block113;
                                                                                                        }
                                                                                                        catch (oov oov12) {
                                                                                                            throw fyk.a(oov12);
                                                                                                        }
                                                                                                        ncl.bt6(g_32.noc());
                                                                                                    }
                                                                                                    catch (oov oov13) {
                                                                                                        throw fyk.a(oov13);
                                                                                                    }
                                                                                                }
                                                                                                n2 = 0;
                                                                                            }
                                                                                            return n2 != 0;
                                                                                        }
                                                                                        g_33 = g_32;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            bl = g_33 instanceof h67;
                                                                                            if (n == 0) break block114;
                                                                                            if (!bl) break block115;
                                                                                        }
                                                                                        catch (oov oov14) {
                                                                                            throw fyk.a(oov14);
                                                                                        }
                                                                                        return false;
                                                                                    }
                                                                                    catch (oov oov15) {
                                                                                        throw fyk.a(oov15);
                                                                                    }
                                                                                }
                                                                                bl = g_32.h5u();
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (n == 0) break block116;
                                                                                            if (!bl) break block117;
                                                                                        }
                                                                                        catch (oov oov16) {
                                                                                            throw fyk.a(oov16);
                                                                                        }
                                                                                        bl = ky3.d7c();
                                                                                        if (n == 0) break block116;
                                                                                    }
                                                                                    catch (oov oov17) {
                                                                                        throw fyk.a(oov17);
                                                                                    }
                                                                                    if (bl) break block117;
                                                                                }
                                                                                catch (oov oov18) {
                                                                                    throw fyk.a(oov18);
                                                                                }
                                                                                return false;
                                                                            }
                                                                            catch (oov oov19) {
                                                                                throw fyk.a(oov19);
                                                                            }
                                                                        }
                                                                        bl = g_32 instanceof ha9;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (n == 0) break block118;
                                                                                                    if (!bl) break block119;
                                                                                                }
                                                                                                catch (oov oov20) {
                                                                                                    throw fyk.a(oov20);
                                                                                                }
                                                                                                bl = kgt.p71.klu();
                                                                                                if (n == 0) break block118;
                                                                                            }
                                                                                            catch (oov oov21) {
                                                                                                throw fyk.a(oov21);
                                                                                            }
                                                                                            if (!bl) break block119;
                                                                                        }
                                                                                        catch (oov oov22) {
                                                                                            throw fyk.a(oov22);
                                                                                        }
                                                                                        bl = kgt.p71.smu().wyk((String)((Object)fyk.b("i", (int)19547, (long)(0x42A41A1B10E512A5L ^ l))));
                                                                                        if (n == 0) break block118;
                                                                                    }
                                                                                    catch (oov oov23) {
                                                                                        throw fyk.a(oov23);
                                                                                    }
                                                                                    if (!bl) break block119;
                                                                                }
                                                                                catch (oov oov24) {
                                                                                    throw fyk.a(oov24);
                                                                                }
                                                                                bl = ar9.nqw(g_32);
                                                                                if (n == 0) break block118;
                                                                            }
                                                                            catch (oov oov25) {
                                                                                throw fyk.a(oov25);
                                                                            }
                                                                            if (!bl) break block119;
                                                                        }
                                                                        catch (oov oov26) {
                                                                            throw fyk.a(oov26);
                                                                        }
                                                                        return false;
                                                                    }
                                                                    catch (oov oov27) {
                                                                        throw fyk.a(oov27);
                                                                    }
                                                                }
                                                                bl = g_32 instanceof ha9;
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (n == 0) break block120;
                                                                            if (!bl) break block121;
                                                                        }
                                                                        catch (oov oov28) {
                                                                            throw fyk.a(oov28);
                                                                        }
                                                                        bl = dsv.d7c();
                                                                        if (n == 0) break block120;
                                                                    }
                                                                    catch (oov oov29) {
                                                                        throw fyk.a(oov29);
                                                                    }
                                                                    if (bl) break block121;
                                                                }
                                                                catch (oov oov30) {
                                                                    throw fyk.a(oov30);
                                                                }
                                                                return false;
                                                            }
                                                            catch (oov oov31) {
                                                                throw fyk.a(oov31);
                                                            }
                                                        }
                                                        bl = g_32 instanceof laq;
                                                    }
                                                    try {
                                                        block123: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (n == 0) break block122;
                                                                                        if (bl) break block123;
                                                                                    }
                                                                                    catch (oov oov32) {
                                                                                        throw fyk.a(oov32);
                                                                                    }
                                                                                    bl = g_32 instanceof l5f;
                                                                                    if (n == 0) break block122;
                                                                                }
                                                                                catch (oov oov33) {
                                                                                    throw fyk.a(oov33);
                                                                                }
                                                                                if (bl) break block123;
                                                                            }
                                                                            catch (oov oov34) {
                                                                                throw fyk.a(oov34);
                                                                            }
                                                                            bl = g_32 instanceof dge;
                                                                            if (n == 0) break block122;
                                                                        }
                                                                        catch (oov oov35) {
                                                                            throw fyk.a(oov35);
                                                                        }
                                                                        if (bl) break block123;
                                                                    }
                                                                    catch (oov oov36) {
                                                                        throw fyk.a(oov36);
                                                                    }
                                                                    bl = g_32 instanceof w8s;
                                                                    if (n == 0) break block124;
                                                                }
                                                                catch (oov oov37) {
                                                                    throw fyk.a(oov37);
                                                                }
                                                                if (!bl) break block125;
                                                            }
                                                            catch (oov oov38) {
                                                                throw fyk.a(oov38);
                                                            }
                                                        }
                                                        bl = jff.d7c();
                                                    }
                                                    catch (oov oov39) {
                                                        throw fyk.a(oov39);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (n == 0) break block124;
                                                        if (bl) break block125;
                                                    }
                                                    catch (oov oov40) {
                                                        throw fyk.a(oov40);
                                                    }
                                                    return false;
                                                }
                                                catch (oov oov41) {
                                                    throw fyk.a(oov41);
                                                }
                                            }
                                            bl = ((d2 = (double)g_32.tm6(fyk.ek1.vg8) - d) == 0.0 ? (byte)0 : (d2 > 0.0 ? (byte)1 : -1)) != 0;
                                        }
                                        try {
                                            try {
                                                if (n == 0) break block126;
                                                if (bl <= false) break block127;
                                            }
                                            catch (oov oov42) {
                                                throw fyk.a(oov42);
                                            }
                                            return false;
                                        }
                                        catch (oov oov43) {
                                            throw fyk.a(oov43);
                                        }
                                    }
                                    bl = omb.jok(g_32, exx.d7c().floatValue());
                                }
                                try {
                                    try {
                                        if (n == 0) break block128;
                                        if (bl) break block129;
                                    }
                                    catch (oov oov44) {
                                        throw fyk.a(oov44);
                                    }
                                    return false;
                                }
                                catch (oov oov45) {
                                    throw fyk.a(oov45);
                                }
                            }
                            bl = g_32 instanceof ha9;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n == 0) break block130;
                                                if (!bl) break block131;
                                            }
                                            catch (oov oov46) {
                                                throw fyk.a(oov46);
                                            }
                                            bl = f62.a92((ha9)g_32);
                                            if (n == 0) break block130;
                                        }
                                        catch (oov oov47) {
                                            throw fyk.a(oov47);
                                        }
                                        if (!bl) break block131;
                                    }
                                    catch (oov oov48) {
                                        throw fyk.a(oov48);
                                    }
                                    bl = zwr.o1s.d7c();
                                    if (n == 0) break block130;
                                }
                                catch (oov oov49) {
                                    throw fyk.a(oov49);
                                }
                                if (!bl) break block131;
                            }
                            catch (oov oov50) {
                                throw fyk.a(oov50);
                            }
                            return false;
                        }
                        catch (oov oov51) {
                            throw fyk.a(oov51);
                        }
                    }
                    bl = kgt.p71.klu();
                }
                try {
                    try {
                        try {
                            try {
                                if (n == 0) break block132;
                                if (!bl) break block133;
                            }
                            catch (oov oov52) {
                                throw fyk.a(oov52);
                            }
                            bl = kgt.p71.kh5(g_32);
                            if (n == 0) break block132;
                        }
                        catch (oov oov53) {
                            throw fyk.a(oov53);
                        }
                        if (!bl) break block133;
                    }
                    catch (oov oov54) {
                        throw fyk.a(oov54);
                    }
                    return false;
                }
                catch (oov oov55) {
                    throw fyk.a(oov55);
                }
            }
            bl = true;
        }
        return bl;
    }

    public static boolean szx() {
        return f8f;
    }

    public static void hpe(g_3 g_32) {
        block15: {
            boolean bl;
            int n;
            block14: {
                n = t9d.b();
                try {
                    if (g_32 == null) {
                        return;
                    }
                }
                catch (oov oov2) {
                    throw fyk.a(oov2);
                }
                try {
                    try {
                        bl = r3i.contains(g_32);
                        if (n == 0) break block14;
                        if (bl) break block15;
                    }
                    catch (oov oov3) {
                        throw fyk.a(oov3);
                    }
                    bl = g_32 instanceof ha9;
                }
                catch (oov oov4) {
                    throw fyk.a(oov4);
                }
            }
            try {
                try {
                    if (n == 0 || !bl) break block15;
                }
                catch (oov oov5) {
                    throw fyk.a(oov5);
                }
                bl = r3i.add(g_32);
            }
            catch (oov oov6) {
                throw fyk.a(oov6);
            }
        }
        fyk.ek1.vg8.hgb();
        ek1.c02()._m3().k7f(new C02PacketUseEntity((i2h)g_32, C02PacketUseEntity$_y6.cb5));
        float f = hc0.xpe(fyk.ek1.vg8.up_.dxs(), g_32.fhc());
        try {
            if (f > 0.0f) {
                fyk.ek1.vg8.eej(g_32);
            }
        }
        catch (oov oov7) {
            throw fyk.a(oov7);
        }
    }

    public static void kmt() {
        block5: {
            boolean bl;
            block4: {
                int n = t9d.c();
                try {
                    try {
                        bl = qcf;
                        if (n != 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw fyk.a(oov2);
                    }
                    fyk.ek1.vg8.lq7._m3().k7f(new C07PacketPlayerDigging(C07PacketPlayerDigging$pl2.md_, new mew(-1, -1, -1), vt2.m3r));
                    bl = false;
                }
                catch (oov oov3) {
                    throw fyk.a(oov3);
                }
            }
            qcf = bl;
        }
    }

    public static double mmr(double d, double d2) {
        double d3;
        block6: {
            double d4;
            double d5;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            d5 = d;
                            d4 = d2;
                            if (n != 0) break block4;
                            if (!(d5 >= d4)) break block5;
                        }
                        catch (oov oov2) {
                            throw fyk.a(oov2);
                        }
                        d3 = d;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw fyk.a(oov3);
                    }
                }
                d5 = new Random().nextDouble() * (d2 - d);
                d4 = d;
            }
            d3 = d5 + d4;
        }
        return d3;
    }

    public static boolean x64(g_3 g_32) {
        return fyk.b6k(g_32, w1a.d7c().floatValue());
    }

    public static boolean g20(g_3 g_32) {
        return fyk.b6k(g_32, w1a.d7c().floatValue() + vto.d7c().floatValue());
    }

    public void z57(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11 = 1.0f / f9;
        float f12 = 1.0f / f10;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl._r5);
        q3g2.g5o(f, f2 + f8, 0.0).h0a(f3 * f11, (f4 + f6) * f12).pzw();
        q3g2.g5o(f + f7, f2 + f8, 0.0).h0a((f3 + f5) * f11, (f4 + f6) * f12).pzw();
        q3g2.g5o(f + f7, f2, 0.0).h0a((f3 + f5) * f11, f4 * f12).pzw();
        q3g2.g5o(f, f2, 0.0).h0a(f3 * f11, f4 * f12).pzw();
        jom2.q7g();
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

                fyk.a = c.a(-267909094280298331L, 2032482130652919795L, MethodHandles.lookup().lookupClass()).a(16291667741731L);
                var9 = fyk.a ^ 77779576121370L;
                fyk.h = new HashMap<K, V>(13);
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
                var7_3 = new String[29];
                var5_4 = 0;
                var4_5 = "\u00af\u00f2\u00e2\u00a5=\u008e\u008amj\u00d5B\u008c\u00df\u000e\u00b8\u00ad\u00ea=K\u0000{\u00a7\u00f7\u0087\u0018[Z\u00f3A\u00b9\u000fz\u00e6\u00d0|\u008f\"\u00b4\u0096\u0082u\u0096^\u00e4\u008d\u00de\u0011\u00bf\u00f0\u0010l\u008c\f\u00bc\u00f2\u00a4\u0084\u00a1\u00ae\u00b89;\f\u00ee\u00fa\u00be(\u00f8mK\b\u00bdA\u00cbT\u0092\u0016\u00ad\u000679P\u00fa\u0098\u008b'\u00d8\u00c7t\u00ae\u00a2\u00ff5\u00e9i\u00eb\u0003\u00be\u000f\u00b48\u00cd\u00d7\u008c\u00d8D+\u0018\u00c8P#A+q\u00f2\u00f2\u00abj\u00ab\u00e7\u00ab\u0018\u00f8^\u000f^\u009f\u00a8\u00e9\u009a\u0083;(\"\u00af\u001c*\u00f3aOH\u0007\u00bap\u00021\u00b6\u00d0\u00d1\u00e5*;\u0085\u00ce\u00d8\u00edD[\u000e\u0094i\u0084\u00a0\u0082\u00b9F\u007f\u00c2\u00b3\u00e4\u008cs4\u00105V\u00ede\u0085\u0088\u0089\u00d5h\u00b2\u00b2K\u0019_\u00bd\u0087\u0010\u0092p\u00a6cvz;\u00d4\u00b2K<\u008am\u00a0\u00f4X\u0010\u00f4\u00fd\u0097\u009f\u00f9\u00d2&\u00814\u0092\u00a3R\u00ce\u00ca\u0001= 4C\u0016HCK\u00dd\u0092\u00fb .\u00e7\u0084M\\&\u00ff\u001e\u001c\u00d9\u00b3\u0019\u00195\u00bbL\u00da\u008a!\u0017\u001b#\u0018e!&\u00bfd\u008b\u00eb\u00fe\u0081\u00bc\u0085\u00f9\u008b\u00d2\u0099'\u000f\u00f8x\u001fjUd!\u0010\u007f\u00c1\u0099\u00be\u00a3\u00a0c\u00ca\u0017\u0088\u00f9\u00c5\u008a16\u00a2\u0010\u0087\u0000\u00e8\u0090\u00995\u00caK\u00af\u00d9\u00eb\u00e8u-\u00eaW \td\u0080\u00b7\u00d5/\u00ff\u0094\u00f8\r+\u001b`\u001d\u00bd\"\u00fe\u0014\u008a\u00ca\u000e#P\u00ceZ\u00d05V\u008c\u00b3\u00063\u0010\u00aa\u0012\u00c7\u00a2\u00ae\u0005{L\u0086\u00ac?\u008b\u00a130\u0096\u0010\u00d2-\u00bd\u0089\u0089U\u0017\u008bpq\u00af\u00d1hw\u0099]\u0010\u00b9\u00a58;\u00ddi\u0083\u00dc\u00c0*J\u0019s\u00aeY\u00ad \u0084\u00a6\u00a6\u00d45\u0087\u00a8FG\u00e0\u00d0\u0084\u00b4[af\u008c\u000f\u00f1\u00bb\u009e\u007fEfB\u00f8\u0007d\u00bc\u00b5pa\u0010\u00d7\u00ce\u0091\u00033D\u00b9|\u0080\u001c\u009d\u0094H\u0017\u00c7\u00a0 :-\u0016k)\u00e7\u00f1\u009b\u00e7\u00d8\u0007g|\u001e\u008d=\u00be\u000476\u008b\u000e/m\u0081\u001db\u00ac\u00dd\u0082\u00a0\u00c1\u0010_\u00e4\u00c4\u0006\u00cbP_\u00d6\u0094\u0084\u0099\u00cbz\u00d0\u0014\u00a0\u0010\u00ffa\u009e\u00e7,\u0002C{i\u00e3.\u0011\u0099\u0095\u00b5\u00c2\u0010\u007fi4\u00f1(\u001c\u00a6\u00aa\u00b2Ha\u00ce\u001b\u001a\u00cd\u009a\u0010\u00e4\u00f0\u00fb\u001d\u009c\u0089\u00ba\u001d\u0080\u00dd\u00b6(\u00e3M\u0004y\u0010AD$Ouq\u00fc\u0015\u0082\u0096\u00det9D\u00a6\u0094 Wa\u00f7 \u0002k\u00f4\u00ce=(\u0017KhP\u0095\u0007\u00b8\u0098J\u00ad\u00c3\u0087\u00ebx\u0092\u00bc\u00bd\u0090B|ne \u00dd\u00c7\u00ed\u00bc\u00fcm6-\n\u0014\u00b8\u00b1%J\u009c\u00f9\u009e\u00ff\u000eb[\u009bf\u00e7\u007f\u00e0D\u00bc\u008f(\u0082R";
                var6_6 = "\u00af\u00f2\u00e2\u00a5=\u008e\u008amj\u00d5B\u008c\u00df\u000e\u00b8\u00ad\u00ea=K\u0000{\u00a7\u00f7\u0087\u0018[Z\u00f3A\u00b9\u000fz\u00e6\u00d0|\u008f\"\u00b4\u0096\u0082u\u0096^\u00e4\u008d\u00de\u0011\u00bf\u00f0\u0010l\u008c\f\u00bc\u00f2\u00a4\u0084\u00a1\u00ae\u00b89;\f\u00ee\u00fa\u00be(\u00f8mK\b\u00bdA\u00cbT\u0092\u0016\u00ad\u000679P\u00fa\u0098\u008b'\u00d8\u00c7t\u00ae\u00a2\u00ff5\u00e9i\u00eb\u0003\u00be\u000f\u00b48\u00cd\u00d7\u008c\u00d8D+\u0018\u00c8P#A+q\u00f2\u00f2\u00abj\u00ab\u00e7\u00ab\u0018\u00f8^\u000f^\u009f\u00a8\u00e9\u009a\u0083;(\"\u00af\u001c*\u00f3aOH\u0007\u00bap\u00021\u00b6\u00d0\u00d1\u00e5*;\u0085\u00ce\u00d8\u00edD[\u000e\u0094i\u0084\u00a0\u0082\u00b9F\u007f\u00c2\u00b3\u00e4\u008cs4\u00105V\u00ede\u0085\u0088\u0089\u00d5h\u00b2\u00b2K\u0019_\u00bd\u0087\u0010\u0092p\u00a6cvz;\u00d4\u00b2K<\u008am\u00a0\u00f4X\u0010\u00f4\u00fd\u0097\u009f\u00f9\u00d2&\u00814\u0092\u00a3R\u00ce\u00ca\u0001= 4C\u0016HCK\u00dd\u0092\u00fb .\u00e7\u0084M\\&\u00ff\u001e\u001c\u00d9\u00b3\u0019\u00195\u00bbL\u00da\u008a!\u0017\u001b#\u0018e!&\u00bfd\u008b\u00eb\u00fe\u0081\u00bc\u0085\u00f9\u008b\u00d2\u0099'\u000f\u00f8x\u001fjUd!\u0010\u007f\u00c1\u0099\u00be\u00a3\u00a0c\u00ca\u0017\u0088\u00f9\u00c5\u008a16\u00a2\u0010\u0087\u0000\u00e8\u0090\u00995\u00caK\u00af\u00d9\u00eb\u00e8u-\u00eaW \td\u0080\u00b7\u00d5/\u00ff\u0094\u00f8\r+\u001b`\u001d\u00bd\"\u00fe\u0014\u008a\u00ca\u000e#P\u00ceZ\u00d05V\u008c\u00b3\u00063\u0010\u00aa\u0012\u00c7\u00a2\u00ae\u0005{L\u0086\u00ac?\u008b\u00a130\u0096\u0010\u00d2-\u00bd\u0089\u0089U\u0017\u008bpq\u00af\u00d1hw\u0099]\u0010\u00b9\u00a58;\u00ddi\u0083\u00dc\u00c0*J\u0019s\u00aeY\u00ad \u0084\u00a6\u00a6\u00d45\u0087\u00a8FG\u00e0\u00d0\u0084\u00b4[af\u008c\u000f\u00f1\u00bb\u009e\u007fEfB\u00f8\u0007d\u00bc\u00b5pa\u0010\u00d7\u00ce\u0091\u00033D\u00b9|\u0080\u001c\u009d\u0094H\u0017\u00c7\u00a0 :-\u0016k)\u00e7\u00f1\u009b\u00e7\u00d8\u0007g|\u001e\u008d=\u00be\u000476\u008b\u000e/m\u0081\u001db\u00ac\u00dd\u0082\u00a0\u00c1\u0010_\u00e4\u00c4\u0006\u00cbP_\u00d6\u0094\u0084\u0099\u00cbz\u00d0\u0014\u00a0\u0010\u00ffa\u009e\u00e7,\u0002C{i\u00e3.\u0011\u0099\u0095\u00b5\u00c2\u0010\u007fi4\u00f1(\u001c\u00a6\u00aa\u00b2Ha\u00ce\u001b\u001a\u00cd\u009a\u0010\u00e4\u00f0\u00fb\u001d\u009c\u0089\u00ba\u001d\u0080\u00dd\u00b6(\u00e3M\u0004y\u0010AD$Ouq\u00fc\u0015\u0082\u0096\u00det9D\u00a6\u0094 Wa\u00f7 \u0002k\u00f4\u00ce=(\u0017KhP\u0095\u0007\u00b8\u0098J\u00ad\u00c3\u0087\u00ebx\u0092\u00bc\u00bd\u0090B|ne \u00dd\u00c7\u00ed\u00bc\u00fcm6-\n\u0014\u00b8\u00b1%J\u009c\u00f9\u009e\u00ff\u000eb[\u009bf\u00e7\u007f\u00e0D\u00bc\u008f(\u0082R".length();
                var3_7 = 24;
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
                    var7_3[var5_4++] = fyk.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00f5`\u0018)\u00d9\u0093\\\u0011\u0011\u00fe\u00aa\u009f\u00943\u00df\u00e2\u0015?\u00e7\u00fb\u0018\u008aY\u00cb\u00f5[\u0005y\u0096\u00c1\u008eX\u009f\u0087Hv\u00b7KN\u00f7 \u0015\u00bc\u00cc\u00f7h>\u00fbQ\u00d6{\u00f2\u00ec=\u000e\u009e{\u00f1crx\u00b9+\u001f'e\u00a7\u0080\u0003\u00ca\u00cfjM";
                    var6_6 = "\u00f5`\u0018)\u00d9\u0093\\\u0011\u0011\u00fe\u00aa\u009f\u00943\u00df\u00e2\u0015?\u00e7\u00fb\u0018\u008aY\u00cb\u00f5[\u0005y\u0096\u00c1\u008eX\u009f\u0087Hv\u00b7KN\u00f7 \u0015\u00bc\u00cc\u00f7h>\u00fbQ\u00d6{\u00f2\u00ec=\u000e\u009e{\u00f1crx\u00b9+\u001f'e\u00a7\u0080\u0003\u00ca\u00cfjM".length();
                    var3_7 = 40;
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
                    var7_3[var5_4++] = fyk.b(var8_9).intern();
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
        fyk.f = var7_3;
        fyk.g = new String[29];
        fyk.s4u = new cn7((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)20790, (long)(2881597195283839169L ^ var9)), false);
        fyk.w1a = new crk((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)16443, (long)(2424173500769511892L ^ var9)), 4.2f, 1.0f, 8.0f, 0.1f);
        fyk.vto = new crk((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)9686, (long)(3336027193823382568L ^ var9)), 2.0f, 0.0f, 4.0f, 0.1f);
        fyk.bxq = new crk((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)18282, (long)(5796076608206614151L ^ var9)), 120.0f, 30.0f, 180.0f, 1.0f);
        fyk.u2o = new crk((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)5387, (long)(3339541480364473576L ^ var9)), 10.0f, 1.0f, 20.0f, 1.0f);
        fyk.q84 = new crk((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)10013, (long)(8371644619011084029L ^ var9)), 1000.0f, 1.0f, 2000.0f, 100.0f);
        fyk.kog = new crk((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)13585, (long)(1748968786151660790L ^ var9)), 3.0f, 1.0f, 8.0f, 1.0f);
        fyk.exx = new crk((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)7968, (long)(4334470342411548354L ^ var9)), 360.0f, 10.0f, 360.0f, 10.0f, "\u00b0");
        fyk.jff = new cn7((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)5827, (long)(2420690982776176425L ^ var9)), false);
        fyk.dsv = new cn7((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)31887, (long)(1698781768392807794L ^ var9)), true);
        fyk.qa6 = new cn7((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)23429, (long)(6602755028007662187L ^ var9)), false);
        fyk.ky3 = new cn7((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)10938, (long)(2473371517320020811L ^ var9)), true);
        fyk.sy_ = new cn7((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)20550, (long)(7538218998660741562L ^ var9)), true);
        fyk.g4y = new cn7((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)25109, (long)(3174307329891273713L ^ var9)), true);
        fyk.ogx = new cn7((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)4399, (long)(7904136941873002713L ^ var9)), true);
        v7 = new String[5];
        v7[0] = fyk.b("i", (int)12865, (long)(5330749718660799422L ^ var9));
        v7[1] = fyk.b("i", (int)13157, (long)(2168451761219689091L ^ var9));
        v7[2] = fyk.b("i", (int)25331, (long)(4764352610383760134L ^ var9));
        v7[3] = fyk.b("i", (int)29196, (long)(6711082021866216425L ^ var9));
        v7[4] = fyk.b("i", (int)369, (long)(7783385325243230345L ^ var9));
        fyk.qiz = new c_3((String)fyk.b("i", (int)19941, (long)(5820091837664928777L ^ var9)), (String)fyk.b("i", (int)6827, (long)(6282382598799553346L ^ var9)), (String)fyk.b("i", (int)27878, (long)(1279464578561246477L ^ var9)), v7);
        fyk.r3i = new ArrayList<E>();
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7D31;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("fyk", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            fyk.g[n2] = fyk.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fyk.b(n, l);
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
            throw new RuntimeException("fyk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fyk.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

