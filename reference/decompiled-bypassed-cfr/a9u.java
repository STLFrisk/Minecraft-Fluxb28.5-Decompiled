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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C0APacketAnimation;

public class a9u
extends j1s {
    private a9u$ja6 ob5;
    private nhs bix;
    private nhs nhs;
    private boolean fza;
    private static final long a = c.a(265174535881676653L, 2799197831052306938L, MethodHandles.lookup().lookupClass()).a(50011596883829L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public a9u() {
        long l = a ^ 0x3E173373470EL;
        super((String)((Object)a9u.a("m", (int)15045, (long)(0x7CB5E75D7EC6E56DL ^ l))), (String)((Object)a9u.a("m", (int)4852, (long)(0x2846CFD70FFA4D5DL ^ l))));
        this.ob5 = null;
        this.bix = new nhs();
        this.nhs = new nhs();
    }

    @Override
    public void w4v() {
        super.w4v();
        this.bix.zay();
    }

    @Override
    public void i__() {
        block4: {
            c05 c052;
            block5: {
                int n = t9d.b();
                try {
                    try {
                        super.i__();
                        c052 = this.wyl;
                        if (n == 0) break block4;
                        if (c052.tij != null) break block5;
                    }
                    catch (oov oov2) {
                        throw a9u.a(oov2);
                    }
                    return;
                }
                catch (oov oov3) {
                    throw a9u.a(oov3);
                }
            }
            c052 = this.wyl;
        }
        c052.vg8.lfk = true;
    }

    private a9u$ja6 ulk(mew mew2) {
        boolean bl;
        mew mew3;
        block121: {
            block122: {
                int n;
                block119: {
                    block120: {
                        block117: {
                            block118: {
                                block115: {
                                    block116: {
                                        block113: {
                                            block114: {
                                                block111: {
                                                    block112: {
                                                        block109: {
                                                            block110: {
                                                                block107: {
                                                                    block108: {
                                                                        block105: {
                                                                            block106: {
                                                                                block103: {
                                                                                    block104: {
                                                                                        block101: {
                                                                                            block102: {
                                                                                                block99: {
                                                                                                    block100: {
                                                                                                        block97: {
                                                                                                            block98: {
                                                                                                                block95: {
                                                                                                                    block96: {
                                                                                                                        block93: {
                                                                                                                            block94: {
                                                                                                                                block91: {
                                                                                                                                    block92: {
                                                                                                                                        block89: {
                                                                                                                                            block90: {
                                                                                                                                                block87: {
                                                                                                                                                    block88: {
                                                                                                                                                        block85: {
                                                                                                                                                            block86: {
                                                                                                                                                                block83: {
                                                                                                                                                                    block84: {
                                                                                                                                                                        n = t9d.b();
                                                                                                                                                                        mew3 = mew2;
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(0, -1, 0)).r_y());
                                                                                                                                                                                if (n == 0) break block83;
                                                                                                                                                                                if (bl) break block84;
                                                                                                                                                                            }
                                                                                                                                                                            catch (oov oov2) {
                                                                                                                                                                                throw a9u.a(oov2);
                                                                                                                                                                            }
                                                                                                                                                                            return new a9u$ja6(this, mew3.ec4(0, -1, 0), vt2.rf3, null);
                                                                                                                                                                        }
                                                                                                                                                                        catch (oov oov3) {
                                                                                                                                                                            throw a9u.a(oov3);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(-1, 0, 0)).r_y());
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        if (n == 0) break block85;
                                                                                                                                                                        if (bl) break block86;
                                                                                                                                                                    }
                                                                                                                                                                    catch (oov oov4) {
                                                                                                                                                                        throw a9u.a(oov4);
                                                                                                                                                                    }
                                                                                                                                                                    return new a9u$ja6(this, mew3.ec4(-1, 0, 0), vt2.zk4, null);
                                                                                                                                                                }
                                                                                                                                                                catch (oov oov5) {
                                                                                                                                                                    throw a9u.a(oov5);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(1, 0, 0)).r_y());
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                if (n == 0) break block87;
                                                                                                                                                                if (bl) break block88;
                                                                                                                                                            }
                                                                                                                                                            catch (oov oov6) {
                                                                                                                                                                throw a9u.a(oov6);
                                                                                                                                                            }
                                                                                                                                                            return new a9u$ja6(this, mew3.ec4(1, 0, 0), vt2.te4, null);
                                                                                                                                                        }
                                                                                                                                                        catch (oov oov7) {
                                                                                                                                                            throw a9u.a(oov7);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(0, 0, -1)).r_y());
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        if (n == 0) break block89;
                                                                                                                                                        if (bl) break block90;
                                                                                                                                                    }
                                                                                                                                                    catch (oov oov8) {
                                                                                                                                                        throw a9u.a(oov8);
                                                                                                                                                    }
                                                                                                                                                    return new a9u$ja6(this, mew3.ec4(0, 0, -1), vt2.mxp, null);
                                                                                                                                                }
                                                                                                                                                catch (oov oov9) {
                                                                                                                                                    throw a9u.a(oov9);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(0, 0, 1)).r_y());
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                if (n == 0) break block91;
                                                                                                                                                if (bl) break block92;
                                                                                                                                            }
                                                                                                                                            catch (oov oov10) {
                                                                                                                                                throw a9u.a(oov10);
                                                                                                                                            }
                                                                                                                                            return new a9u$ja6(this, mew3.ec4(0, 0, 1), vt2.z9q, null);
                                                                                                                                        }
                                                                                                                                        catch (oov oov11) {
                                                                                                                                            throw a9u.a(oov11);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    mew3 = mew2.ec4(-1, 0, 0);
                                                                                                                                    bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(-1, 0, 0)).r_y());
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (n == 0) break block93;
                                                                                                                                        if (bl) break block94;
                                                                                                                                    }
                                                                                                                                    catch (oov oov12) {
                                                                                                                                        throw a9u.a(oov12);
                                                                                                                                    }
                                                                                                                                    return new a9u$ja6(this, mew3.ec4(-1, 0, 0), vt2.zk4, null);
                                                                                                                                }
                                                                                                                                catch (oov oov13) {
                                                                                                                                    throw a9u.a(oov13);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(1, 0, 0)).r_y());
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (n == 0) break block95;
                                                                                                                                if (bl) break block96;
                                                                                                                            }
                                                                                                                            catch (oov oov14) {
                                                                                                                                throw a9u.a(oov14);
                                                                                                                            }
                                                                                                                            return new a9u$ja6(this, mew3.ec4(1, 0, 0), vt2.te4, null);
                                                                                                                        }
                                                                                                                        catch (oov oov15) {
                                                                                                                            throw a9u.a(oov15);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(0, 0, -1)).r_y());
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (n == 0) break block97;
                                                                                                                        if (bl) break block98;
                                                                                                                    }
                                                                                                                    catch (oov oov16) {
                                                                                                                        throw a9u.a(oov16);
                                                                                                                    }
                                                                                                                    return new a9u$ja6(this, mew3.ec4(0, 0, -1), vt2.mxp, null);
                                                                                                                }
                                                                                                                catch (oov oov17) {
                                                                                                                    throw a9u.a(oov17);
                                                                                                                }
                                                                                                            }
                                                                                                            bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(0, 0, 1)).r_y());
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (n == 0) break block99;
                                                                                                                if (bl) break block100;
                                                                                                            }
                                                                                                            catch (oov oov18) {
                                                                                                                throw a9u.a(oov18);
                                                                                                            }
                                                                                                            return new a9u$ja6(this, mew3.ec4(0, 0, 1), vt2.z9q, null);
                                                                                                        }
                                                                                                        catch (oov oov19) {
                                                                                                            throw a9u.a(oov19);
                                                                                                        }
                                                                                                    }
                                                                                                    mew3 = mew2.ec4(1, 0, 0);
                                                                                                    bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(-1, 0, 0)).r_y());
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (n == 0) break block101;
                                                                                                        if (bl) break block102;
                                                                                                    }
                                                                                                    catch (oov oov20) {
                                                                                                        throw a9u.a(oov20);
                                                                                                    }
                                                                                                    return new a9u$ja6(this, mew3.ec4(-1, 0, 0), vt2.zk4, null);
                                                                                                }
                                                                                                catch (oov oov21) {
                                                                                                    throw a9u.a(oov21);
                                                                                                }
                                                                                            }
                                                                                            bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(1, 0, 0)).r_y());
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (n == 0) break block103;
                                                                                                if (bl) break block104;
                                                                                            }
                                                                                            catch (oov oov22) {
                                                                                                throw a9u.a(oov22);
                                                                                            }
                                                                                            return new a9u$ja6(this, mew3.ec4(1, 0, 0), vt2.te4, null);
                                                                                        }
                                                                                        catch (oov oov23) {
                                                                                            throw a9u.a(oov23);
                                                                                        }
                                                                                    }
                                                                                    bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(0, 0, -1)).r_y());
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (n == 0) break block105;
                                                                                        if (bl) break block106;
                                                                                    }
                                                                                    catch (oov oov24) {
                                                                                        throw a9u.a(oov24);
                                                                                    }
                                                                                    return new a9u$ja6(this, mew3.ec4(0, 0, -1), vt2.mxp, null);
                                                                                }
                                                                                catch (oov oov25) {
                                                                                    throw a9u.a(oov25);
                                                                                }
                                                                            }
                                                                            bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(0, 0, 1)).r_y());
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (n == 0) break block107;
                                                                                if (bl) break block108;
                                                                            }
                                                                            catch (oov oov26) {
                                                                                throw a9u.a(oov26);
                                                                            }
                                                                            return new a9u$ja6(this, mew3.ec4(0, 0, 1), vt2.z9q, null);
                                                                        }
                                                                        catch (oov oov27) {
                                                                            throw a9u.a(oov27);
                                                                        }
                                                                    }
                                                                    mew3 = mew2.ec4(0, 0, -1);
                                                                    bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(-1, 0, 0)).r_y());
                                                                }
                                                                try {
                                                                    try {
                                                                        if (n == 0) break block109;
                                                                        if (bl) break block110;
                                                                    }
                                                                    catch (oov oov28) {
                                                                        throw a9u.a(oov28);
                                                                    }
                                                                    return new a9u$ja6(this, mew3.ec4(-1, 0, 0), vt2.zk4, null);
                                                                }
                                                                catch (oov oov29) {
                                                                    throw a9u.a(oov29);
                                                                }
                                                            }
                                                            bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(1, 0, 0)).r_y());
                                                        }
                                                        try {
                                                            try {
                                                                if (n == 0) break block111;
                                                                if (bl) break block112;
                                                            }
                                                            catch (oov oov30) {
                                                                throw a9u.a(oov30);
                                                            }
                                                            return new a9u$ja6(this, mew3.ec4(1, 0, 0), vt2.te4, null);
                                                        }
                                                        catch (oov oov31) {
                                                            throw a9u.a(oov31);
                                                        }
                                                    }
                                                    bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(0, 0, -1)).r_y());
                                                }
                                                try {
                                                    try {
                                                        if (n == 0) break block113;
                                                        if (bl) break block114;
                                                    }
                                                    catch (oov oov32) {
                                                        throw a9u.a(oov32);
                                                    }
                                                    return new a9u$ja6(this, mew3.ec4(0, 0, -1), vt2.mxp, null);
                                                }
                                                catch (oov oov33) {
                                                    throw a9u.a(oov33);
                                                }
                                            }
                                            bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(0, 0, 1)).r_y());
                                        }
                                        try {
                                            try {
                                                if (n == 0) break block115;
                                                if (bl) break block116;
                                            }
                                            catch (oov oov34) {
                                                throw a9u.a(oov34);
                                            }
                                            return new a9u$ja6(this, mew3.ec4(0, 0, 1), vt2.z9q, null);
                                        }
                                        catch (oov oov35) {
                                            throw a9u.a(oov35);
                                        }
                                    }
                                    mew3 = mew2.ec4(0, 0, 1);
                                    bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(-1, 0, 0)).r_y());
                                }
                                try {
                                    try {
                                        if (n == 0) break block117;
                                        if (bl) break block118;
                                    }
                                    catch (oov oov36) {
                                        throw a9u.a(oov36);
                                    }
                                    return new a9u$ja6(this, mew3.ec4(-1, 0, 0), vt2.zk4, null);
                                }
                                catch (oov oov37) {
                                    throw a9u.a(oov37);
                                }
                            }
                            bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(1, 0, 0)).r_y());
                        }
                        try {
                            try {
                                if (n == 0) break block119;
                                if (bl) break block120;
                            }
                            catch (oov oov38) {
                                throw a9u.a(oov38);
                            }
                            return new a9u$ja6(this, mew3.ec4(1, 0, 0), vt2.te4, null);
                        }
                        catch (oov oov39) {
                            throw a9u.a(oov39);
                        }
                    }
                    bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(0, 0, -1)).r_y());
                }
                try {
                    try {
                        if (n == 0) break block121;
                        if (bl) break block122;
                    }
                    catch (oov oov40) {
                        throw a9u.a(oov40);
                    }
                    return new a9u$ja6(this, mew3.ec4(0, 0, -1), vt2.mxp, null);
                }
                catch (oov oov41) {
                    throw a9u.a(oov41);
                }
            }
            bl = _lk.gxj.contains(this.wyl.tij.getBlockState(mew3.ec4(0, 0, 1)).r_y());
        }
        try {
            if (!bl) {
                return new a9u$ja6(this, mew3.ec4(0, 0, 1), vt2.z9q, null);
            }
        }
        catch (oov oov42) {
            throw a9u.a(oov42);
        }
        return null;
    }

    @jev(jn1=0)
    private void fr8(fz2 fz22) {
        block25: {
            a9u a9u2;
            block29: {
                mew mew2;
                int n;
                block30: {
                    block28: {
                        l86 l862;
                        block27: {
                            boolean bl;
                            block26: {
                                block24: {
                                    block22: {
                                        block23: {
                                            n = t9d.c();
                                            try {
                                                try {
                                                    bl = fz22.lhw();
                                                    if (n != 0) break block22;
                                                    if (!bl) break block23;
                                                }
                                                catch (oov oov2) {
                                                    throw a9u.a(oov2);
                                                }
                                                this.fza = false;
                                                return;
                                            }
                                            catch (oov oov3) {
                                                throw a9u.a(oov3);
                                            }
                                        }
                                        this.ob5 = null;
                                        bl = this.wyl.vg8.hzv();
                                    }
                                    try {
                                        try {
                                            if (n != 0) break block24;
                                            if (bl) break block25;
                                        }
                                        catch (oov oov4) {
                                            throw a9u.a(oov4);
                                        }
                                        bl = this.wpm();
                                    }
                                    catch (oov oov5) {
                                        throw a9u.a(oov5);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (n != 0) break block26;
                                            if (!bl) break block25;
                                        }
                                        catch (oov oov6) {
                                            throw a9u.a(oov6);
                                        }
                                        l862 = this.wyl.vg8;
                                        if (n != 0) break block27;
                                    }
                                    catch (oov oov7) {
                                        throw a9u.a(oov7);
                                    }
                                    bl = l862.lfk;
                                }
                                catch (oov oov8) {
                                    throw a9u.a(oov8);
                                }
                            }
                            try {
                                if (!bl) break block28;
                                l862 = this.wyl.vg8;
                            }
                            catch (oov oov9) {
                                throw a9u.a(oov9);
                            }
                        }
                        double d = Math.cos(Math.toRadians(l862.x5k + 90.0f));
                        double d2 = Math.sin(Math.toRadians(this.wyl.vg8.x5k + 90.0f));
                        double d3 = (double)this.wyl.vg8.g9g._mw * 0.4 * d;
                        double d4 = d3 + (double)this.wyl.vg8.g9g.lrp * 0.4 * d2;
                        d3 = (double)this.wyl.vg8.g9g._mw * 0.4 * d2;
                        double d5 = d3 - (double)this.wyl.vg8.g9g.lrp * 0.4 * d;
                        double d6 = this.wyl.vg8.o2v + d4;
                        double d7 = this.wyl.vg8.kfp - 1.0;
                        double d8 = this.wyl.vg8.vbd + d5;
                        mew2 = new mew(d6, d7, d8);
                        if (n == 0) break block30;
                    }
                    mew2 = new mew(this.wyl.nsd().o2v, this.wyl.nsd().aaw().bx_ - 1.0, this.wyl.nsd().vbd);
                }
                try {
                    try {
                        a9u2 = this;
                        if (n != 0) break block29;
                        if (a9u2.wyl.tij.getBlockState(mew2).r_y() != ox_.ibw) break block25;
                    }
                    catch (oov oov10) {
                        throw a9u.a(oov10);
                    }
                    this.ob5 = this.ulk(mew2);
                    a9u2 = this;
                }
                catch (oov oov11) {
                    throw a9u.a(oov11);
                }
            }
            float[] fArray = omb.ln0(a9u2.ob5.yv4, this.ob5.dlj);
            fz22.h8j(fArray[0]);
            fz22.ni7(fArray[1]);
            this.fza = true;
        }
    }

    @jev
    private void zu6(ccn ccn2) {
        block17: {
            nhs nhs2;
            block19: {
                int n;
                block18: {
                    int n2;
                    int n3;
                    block16: {
                        block14: {
                            block15: {
                                n3 = t9d.b();
                                int n4 = this.mvf();
                                try {
                                    n = n4;
                                    n2 = -1;
                                    if (n3 == 0) break block14;
                                    if (n != n2) break block15;
                                }
                                catch (oov oov2) {
                                    throw a9u.a(oov2);
                                }
                                return;
                            }
                            n = this.rn5();
                            n2 = 2;
                        }
                        try {
                            try {
                                try {
                                    if (n3 == 0) break block16;
                                    if (n >= n2) break block17;
                                }
                                catch (oov oov3) {
                                    throw a9u.a(oov3);
                                }
                                n = this.mvf();
                                if (n3 == 0) break block18;
                            }
                            catch (oov oov4) {
                                throw a9u.a(oov4);
                            }
                            n2 = -1;
                        }
                        catch (oov oov5) {
                            throw a9u.a(oov5);
                        }
                    }
                    try {
                        try {
                            if (n == n2) break block17;
                            nhs2 = this.nhs;
                            if (n3 == 0) break block19;
                        }
                        catch (oov oov6) {
                            throw a9u.a(oov6);
                        }
                        n = nhs2.yrv(200.0) ? 1 : 0;
                    }
                    catch (oov oov7) {
                        throw a9u.a(oov7);
                    }
                }
                try {
                    if (n == 0) break block17;
                    this.li4(this.mvf(), amb.zws());
                    nhs2 = this.nhs;
                }
                catch (oov oov8) {
                    throw a9u.a(oov8);
                }
            }
            nhs2.zay();
        }
    }

    @jev(jn1=3)
    private void gh5(q8e q8e2) {
        block45: {
            int n;
            block44: {
                l86 l862;
                jnq jnq2;
                block46: {
                    a9u a9u2;
                    block42: {
                        block43: {
                            int n2;
                            int n3;
                            int n4;
                            block40: {
                                block41: {
                                    int n5;
                                    block38: {
                                        block39: {
                                            n4 = t9d.c();
                                            try {
                                                n5 = this.fza;
                                                if (n4 != 0) break block38;
                                                if (n5 != 0) break block39;
                                            }
                                            catch (oov oov2) {
                                                throw a9u.a(oov2);
                                            }
                                            return;
                                        }
                                        this.fza = false;
                                        n5 = this.rlg();
                                    }
                                    n3 = n5;
                                    try {
                                        try {
                                            n2 = n3;
                                            if (n4 != 0) break block40;
                                            if (n2 != -1) break block41;
                                        }
                                        catch (oov oov3) {
                                            throw a9u.a(oov3);
                                        }
                                        return;
                                    }
                                    catch (oov oov4) {
                                        throw a9u.a(oov4);
                                    }
                                }
                                n2 = this.wyl.vg8.up_.nb5;
                            }
                            n = n2;
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            this.wyl.vg8.up_.nb5 = n3;
                                                                                            a9u2 = this;
                                                                                            if (n4 != 0) break block42;
                                                                                            if (a9u2.ob5 == null) break block43;
                                                                                        }
                                                                                        catch (oov oov5) {
                                                                                            throw a9u.a(oov5);
                                                                                        }
                                                                                        jnq2 = this.wyl.vg8.up_;
                                                                                        if (n4 != 0) break block44;
                                                                                    }
                                                                                    catch (oov oov6) {
                                                                                        throw a9u.a(oov6);
                                                                                    }
                                                                                    if (jnq2.dxs() == null) break block43;
                                                                                }
                                                                                catch (oov oov7) {
                                                                                    throw a9u.a(oov7);
                                                                                }
                                                                                jnq2 = this.wyl.vg8.up_;
                                                                                if (n4 != 0) break block44;
                                                                            }
                                                                            catch (oov oov8) {
                                                                                throw a9u.a(oov8);
                                                                            }
                                                                            if (!(jnq2.dxs().gn1() instanceof gun)) break block43;
                                                                        }
                                                                        catch (oov oov9) {
                                                                            throw a9u.a(oov9);
                                                                        }
                                                                        jnq2 = this.wyl.vg8.up_;
                                                                        if (n4 != 0) break block44;
                                                                    }
                                                                    catch (oov oov10) {
                                                                        throw a9u.a(oov10);
                                                                    }
                                                                    if (jnq2.dxs().qd2 <= 0) break block43;
                                                                }
                                                                catch (oov oov11) {
                                                                    throw a9u.a(oov11);
                                                                }
                                                                a9u2 = this;
                                                                if (n4 != 0) break block42;
                                                            }
                                                            catch (oov oov12) {
                                                                throw a9u.a(oov12);
                                                            }
                                                            if (!a9u2.bix.yrv(90.0)) break block43;
                                                        }
                                                        catch (oov oov13) {
                                                            throw a9u.a(oov13);
                                                        }
                                                        this.bix.zay();
                                                        this.wyl.vg8.lq7.sxi(new C0APacketAnimation());
                                                        this.mam(this.ob5.yv4, this.ob5.dlj);
                                                        if (n4 != 0) break block45;
                                                    }
                                                    catch (oov oov14) {
                                                        throw a9u.a(oov14);
                                                    }
                                                    if (!_lk.xor.d7c().booleanValue()) break block43;
                                                }
                                                catch (oov oov15) {
                                                    throw a9u.a(oov15);
                                                }
                                                l862 = this.wyl.vg8;
                                                if (n4 != 0) break block46;
                                            }
                                            catch (oov oov16) {
                                                throw a9u.a(oov16);
                                            }
                                            if (l862.kfp == (double)(this.ob5.yv4.getY() + 1)) break block43;
                                        }
                                        catch (oov oov17) {
                                            throw a9u.a(oov17);
                                        }
                                        l862 = this.wyl.vg8;
                                        if (n4 != 0) break block46;
                                    }
                                    catch (oov oov18) {
                                        throw a9u.a(oov18);
                                    }
                                    if (!l862.g9g.s0a) break block43;
                                }
                                catch (oov oov19) {
                                    throw a9u.a(oov19);
                                }
                                this.wyl.vg8.m6_(this.wyl.vg8.o2v, this.ob5.yv4.getY() + 2, this.wyl.vg8.vbd);
                                this.wyl.vg8.mop = 0.0;
                                this.wyl.vg8.icv = 0.0;
                                this.wyl.vg8.bw4 = 0.0;
                                this.wyl.vg8.xv1();
                            }
                            catch (oov oov20) {
                                throw a9u.a(oov20);
                            }
                        }
                        a9u2 = this;
                    }
                    l862 = a9u2.wyl.vg8;
                }
                jnq2 = l862.up_;
            }
            jnq2.nb5 = n;
        }
    }

    private int rn5() {
        return amb.d5v().stream().filter(_lk::unh).mapToInt(a9u::t4p).sum();
    }

    private int mvf() {
        int n;
        block8: {
            int n2 = 0;
            int n3 = -1;
            int n4 = t9d.b();
            for (int i = 9; i < 36; ++i) {
                int n5;
                block10: {
                    erg erg2;
                    block9: {
                        erg2 = this.wyl.vg8.up_.c41[i];
                        try {
                            try {
                                n = _lk.unh(erg2) ? 1 : 0;
                                if (n4 == 0) break block8;
                                if (n4 == 0) break block9;
                            }
                            catch (oov oov2) {
                                throw a9u.a(oov2);
                            }
                            if (n == 0) {
                                continue;
                            }
                        }
                        catch (oov oov3) {
                            throw a9u.a(oov3);
                        }
                        n5 = n2;
                    }
                    try {
                        if (n4 == 0) break block10;
                        if (n5 >= erg2.qd2) continue;
                    }
                    catch (oov oov4) {
                        throw a9u.a(oov4);
                    }
                    n2 = erg2.qd2;
                    n5 = i;
                }
                n3 = n5;
                if (n4 != 0) continue;
            }
            n = n3;
        }
        return n;
    }

    @jev
    private void gty(b4u b4u2) {
        int n = t9d.b();
        for (int i = 0; i < 8; ++i) {
            block10: {
                int n2;
                erg[] ergArray;
                erg erg2;
                block9: {
                    try {
                        try {
                            try {
                                erg2 = this.wyl.vg8.up_.c41[i];
                                if (n == 0) break block9;
                                if (erg2 == null) continue;
                            }
                            catch (oov oov2) {
                                throw a9u.a(oov2);
                            }
                            ergArray = this.wyl.vg8.up_.c41;
                            n2 = i;
                            if (n == 0) break block10;
                        }
                        catch (oov oov3) {
                            throw a9u.a(oov3);
                        }
                        erg2 = ergArray[n2];
                    }
                    catch (oov oov4) {
                        throw a9u.a(oov4);
                    }
                }
                try {
                    if (erg2.qd2 > 0) continue;
                    ergArray = this.wyl.vg8.up_.c41;
                    n2 = i;
                }
                catch (oov oov5) {
                    throw a9u.a(oov5);
                }
            }
            ergArray[n2] = null;
            if (n != 0) continue;
        }
    }

    private void li4(int n, int n2) {
        this.wyl.l7q.efg(this.wyl.vg8.fv9.h7l, n, n2, 2, this.wyl.vg8);
    }

    private int rlg() {
        int n;
        block8: {
            int n2 = 0;
            int n3 = -1;
            int n4 = t9d.b();
            for (int i = 0; i < 9; ++i) {
                int n5;
                block10: {
                    erg erg2;
                    block9: {
                        erg2 = this.wyl.vg8.up_.c41[i];
                        try {
                            try {
                                n = _lk.unh(erg2) ? 1 : 0;
                                if (n4 == 0) break block8;
                                if (n4 == 0) break block9;
                            }
                            catch (oov oov2) {
                                throw a9u.a(oov2);
                            }
                            if (n == 0) {
                                continue;
                            }
                        }
                        catch (oov oov3) {
                            throw a9u.a(oov3);
                        }
                        n5 = n2;
                    }
                    try {
                        if (n4 == 0) break block10;
                        if (n5 >= erg2.qd2) continue;
                    }
                    catch (oov oov4) {
                        throw a9u.a(oov4);
                    }
                    n2 = erg2.qd2;
                    n5 = i;
                }
                n3 = n5;
                if (n4 != 0) continue;
            }
            n = n3;
        }
        return n;
    }

    private void mam(mew mew2, vt2 vt22) {
        erg erg2;
        erg erg3;
        block2: {
            block3: {
                int n = t9d.c();
                erg3 = this.wyl.vg8.up_.dxs();
                try {
                    erg2 = erg3;
                    if (n != 0) break block2;
                    if (erg2 != null) break block3;
                }
                catch (oov oov2) {
                    throw a9u.a(oov2);
                }
                return;
            }
            erg2 = this.wyl.vg8.up_.c41[this.wyl.vg8.up_.nb5];
        }
        --erg2.qd2;
        this.wyl.l7q.onPlayerRightClick(this.wyl.vg8, this.wyl.tij, erg3, mew2, vt22, new fqr(mew2.getX(), mew2.getY(), mew2.getZ()));
    }

    /*
     * Unable to fully structure code
     */
    @jev
    public void e0s(_qa var1_1) {
        block18: {
            block16: {
                block17: {
                    block14: {
                        block15: {
                            var2_2 = t9d.b();
                            try {
                                v0 = _lk.yqi.d7c();
                                if (var2_2 == 0) break block14;
                                if (v0) break block15;
                            }
                            catch (oov v1) {
                                throw a9u.a(v1);
                            }
                            return;
                        }
                        try {
                            var1_1.yu1(true);
                            if (var2_2 == 0) break block16;
                            v0 = this.wyl.vg8.lfk;
                        }
                        catch (oov v2) {
                            throw a9u.a(v2);
                        }
                    }
                    try {
                        try {
                            try {
                                if (v0) {
                                    v3 = this.wyl.vg8.fcv;
                                    if (var2_2 == 0) break block17;
                                }
                                ** GOTO lbl41
                            }
                            catch (oov v4) {
                                throw a9u.a(v4);
                            }
                            if (v3) {
                            }
                            ** GOTO lbl41
                        }
                        catch (oov v5) {
                            throw a9u.a(v5);
                        }
                        v3 = this.wyl.vg8.g9g.s0a;
                    }
                    catch (oov v6) {
                        throw a9u.a(v6);
                    }
                }
                try {
                    if (!v3) break block18;
lbl41:
                    // 3 sources

                    var1_1.c6l = 0.0;
                }
                catch (oov v7) {
                    throw a9u.a(v7);
                }
            }
            var1_1.faq = 0.0;
        }
    }

    private boolean wpm() {
        int n;
        block8: {
            block9: {
                int n2 = this.ffi(9, 36);
                int n3 = this.ffi(36, 45);
                int n4 = t9d.b();
                try {
                    try {
                        try {
                            try {
                                n = n2;
                                if (n4 == 0) break block8;
                                if (n != -1) break block9;
                            }
                            catch (oov oov2) {
                                throw a9u.a(oov2);
                            }
                            n = n3;
                            if (n4 == 0) break block8;
                        }
                        catch (oov oov3) {
                            throw a9u.a(oov3);
                        }
                        if (n != -1) break block9;
                    }
                    catch (oov oov4) {
                        throw a9u.a(oov4);
                    }
                    return false;
                }
                catch (oov oov5) {
                    throw a9u.a(oov5);
                }
            }
            n = 1;
        }
        return n != 0;
    }

    private int ffi(int n, int n2) {
        int n3 = t9d.c();
        int n4 = n;
        while (n4 < n2) {
            block11: {
                block12: {
                    int n5;
                    block14: {
                        block13: {
                            erg erg2 = this.wyl.vg8.fv9.ajr(n4).x4s();
                            try {
                                try {
                                    try {
                                        try {
                                            if (n3 != 0) break block11;
                                            if (erg2 == null) break block12;
                                        }
                                        catch (oov oov2) {
                                            throw a9u.a(oov2);
                                        }
                                        n5 = erg2.gn1() instanceof gun;
                                        if (n3 != 0) break block13;
                                    }
                                    catch (oov oov3) {
                                        throw a9u.a(oov3);
                                    }
                                    if (n5 == 0) break block12;
                                }
                                catch (oov oov4) {
                                    throw a9u.a(oov4);
                                }
                                n5 = ((gun)erg2.gn1()).kpo().z4c() ? 1 : 0;
                            }
                            catch (oov oov5) {
                                throw a9u.a(oov5);
                            }
                        }
                        try {
                            if (n3 != 0) break block14;
                            if (n5 == 0) break block12;
                        }
                        catch (oov oov6) {
                            throw a9u.a(oov6);
                        }
                        n5 = n4;
                    }
                    return n5;
                }
                ++n4;
            }
            if (n3 == 0) continue;
        }
        return -1;
    }

    private static int t4p(erg erg2) {
        return erg2.qd2;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        f = new HashMap(13);
        long l = a ^ 0xDC536DE5477L;
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
        String string = "*\u00932n\f\u008df\u00b6f\t\u00bc\u00a2f|\u0085\t\u00c5\u001c\u00fb0'lqk_`\u0081\u00d8K\u00d4@\u00f4\u0010$\u00bb\u008c\u00fe\u00fe\u00cd\u00003\u0083q\u00e1\u00922\u00f4\u007f0";
        int n2 = "*\u00932n\f\u008df\u00b6f\t\u00bc\u00a2f|\u0085\t\u00c5\u001c\u00fb0'lqk_`\u0081\u00d8K\u00d4@\u00f4\u0010$\u00bb\u008c\u00fe\u00fe\u00cd\u00003\u0083q\u00e1\u00922\u00f4\u007f0".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = a9u.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[2];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x466D;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("a9u", exception);
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
            a9u.e[n2] = a9u.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = a9u.a(n, l);
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
            throw new RuntimeException("a9u" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a9u.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

