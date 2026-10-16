/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class aih {
    private int op9;
    private String jpk;
    private final List c9g;
    private aih$vir ww2;
    private double xsg;
    private double qxf;
    private int zwe;
    private int hqe;
    private int c4_;
    private i2h s8q;
    private int ffx;
    private int uw3;
    private int a2q;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public aih() {
        long l = a ^ 0x2B8ADB9E4ADDL;
        this.op9 = 20;
        this.jpk = aih.a("j", (int)587, (long)(0x599CE2B6CFB9AE27L ^ l));
        this.c9g = Lists.newArrayList();
        this.zwe = 200;
        this.hqe = 800;
        this.c4_ = 4;
        this.ffx = 6;
        this.uw3 = 16;
        this.a2q = 4;
    }

    private String m9e() {
        aih$vir aih$vir;
        block12: {
            block13: {
                String string;
                block14: {
                    block15: {
                        long l = a ^ 0x30D9F9D8384EL;
                        int n = t9d.b();
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                aih$vir = this.s8m();
                                                if (n == 0) break block12;
                                                if (aih$vir != null) break block13;
                                            }
                                            catch (oov oov2) {
                                                throw aih.a(oov2);
                                            }
                                            string = this.jpk;
                                            if (n == 0) break block14;
                                        }
                                        catch (oov oov3) {
                                            throw aih.a(oov3);
                                        }
                                        if (string == null) break block15;
                                    }
                                    catch (oov oov4) {
                                        throw aih.a(oov4);
                                    }
                                    string = this.jpk;
                                    if (n == 0) break block14;
                                }
                                catch (oov oov5) {
                                    throw aih.a(oov5);
                                }
                                if (!string.equals(aih.a("j", (int)29853, (long)(0x7BA243B97DEEAA74L ^ l)))) break block15;
                            }
                            catch (oov oov6) {
                                throw aih.a(oov6);
                            }
                            this.jpk = aih.a("j", (int)20031, (long)(0x602E86021F9A90DDL ^ l));
                        }
                        catch (oov oov7) {
                            throw aih.a(oov7);
                        }
                    }
                    string = this.jpk;
                }
                return string;
            }
            aih$vir = this.s8m();
        }
        return aih$vir.pa8(aih$vir);
    }

    public void ugq(String string) {
        this.jpk = string;
    }

    private boolean zlf() {
        mew mew2 = this.fwc();
        return this.c4e().dig((double)mew2.getX() + 0.5, (double)mew2.getY() + 0.5, (double)mew2.getZ() + 0.5, this.uw3);
    }

    /*
     * Unable to fully structure code
     */
    public void laq() {
        block53: {
            block59: {
                block60: {
                    block57: {
                        block58: {
                            block54: {
                                block55: {
                                    block56: {
                                        block52: {
                                            var1_1 = t9d.b();
                                            try {
                                                try {
                                                    v0 = this;
                                                    if (var1_1 == 0) break block52;
                                                    if (!v0.zlf()) break block53;
                                                }
                                                catch (oov v1) {
                                                    throw aih.a(v1);
                                                }
                                                v0 = this;
                                            }
                                            catch (oov v2) {
                                                throw aih.a(v2);
                                            }
                                        }
                                        var2_2 = v0.fwc();
                                        try {
                                            v3 = this.c4e().v0f;
                                            if (var1_1 == 0) break block54;
                                            if (v3 != 0) {
                                            }
                                            ** GOTO lbl50
                                        }
                                        catch (oov v4) {
                                            throw aih.a(v4);
                                        }
                                        var3_3 = (float)var2_2.getX() + this.c4e().fsy.nextFloat();
                                        var5_5 = (float)var2_2.getY() + this.c4e().fsy.nextFloat();
                                        var7_7 = (float)var2_2.getZ() + this.c4e().fsy.nextFloat();
                                        try {
                                            try {
                                                this.c4e().zvy(w_0.bac, var3_3, var5_5, var7_7, 0.0, 0.0, 0.0, new int[0]);
                                                this.c4e().zvy(w_0.jnp, var3_3, var5_5, var7_7, 0.0, 0.0, 0.0, new int[0]);
                                                v5 = this;
                                                if (var1_1 == 0) break block55;
                                                if (v5.op9 <= 0) break block56;
                                            }
                                            catch (oov v6) {
                                                throw aih.a(v6);
                                            }
                                            --this.op9;
                                        }
                                        catch (oov v7) {
                                            throw aih.a(v7);
                                        }
                                    }
                                    this.qxf = this.xsg;
                                    v5 = this;
                                }
                                try {
                                    v5.xsg = (this.xsg + (double)(1000.0f / ((float)this.op9 + 200.0f))) % 360.0;
                                    if (var1_1 != 0) break block53;
lbl50:
                                    // 2 sources

                                    v3 = this.op9;
                                }
                                catch (oov v8) {
                                    throw aih.a(v8);
                                }
                            }
                            try {
                                try {
                                    if (var1_1 == 0) break block57;
                                    if (v3 != -1) break block58;
                                }
                                catch (oov v9) {
                                    throw aih.a(v9);
                                }
                                this.jhc();
                            }
                            catch (oov v10) {
                                throw aih.a(v10);
                            }
                        }
                        v3 = this.op9;
                    }
                    try {
                        try {
                            if (var1_1 == 0) break block59;
                            if (v3 <= 0) break block60;
                        }
                        catch (oov v11) {
                            throw aih.a(v11);
                        }
                        --this.op9;
                        return;
                    }
                    catch (oov v12) {
                        throw aih.a(v12);
                    }
                }
                v3 = 0;
            }
            var3_4 = v3;
            for (var4_8 = 0; var4_8 < this.c4_; ++var4_8) {
                block69: {
                    block68: {
                        block66: {
                            block67: {
                                block70: {
                                    block65: {
                                        block64: {
                                            block62: {
                                                block63: {
                                                    block61: {
                                                        var5_6 = y65.k71(this.m9e(), this.c4e());
                                                        try {
                                                            try {
                                                                if (var1_1 == 0) break block53;
                                                                if (var5_6 != null) break block61;
                                                            }
                                                            catch (oov v13) {
                                                                throw aih.a(v13);
                                                            }
                                                            return;
                                                        }
                                                        catch (oov v14) {
                                                            throw aih.a(v14);
                                                        }
                                                    }
                                                    var6_9 = this.c4e().m_z(var5_6.getClass(), new nh4(var2_2.getX(), var2_2.getY(), var2_2.getZ(), var2_2.getX() + 1, var2_2.getY() + 1, var2_2.getZ() + 1).c2h(this.a2q, this.a2q, this.a2q)).size();
                                                    try {
                                                        try {
                                                            v15 = var6_9;
                                                            if (var1_1 == 0) break block62;
                                                            if (v15 < this.ffx) break block63;
                                                        }
                                                        catch (oov v16) {
                                                            throw aih.a(v16);
                                                        }
                                                        this.jhc();
                                                        return;
                                                    }
                                                    catch (oov v17) {
                                                        throw aih.a(v17);
                                                    }
                                                }
                                                v15 = var2_2.getX();
                                            }
                                            var7_7 = (double)v15 + (this.c4e().fsy.nextDouble() - this.c4e().fsy.nextDouble()) * (double)this.a2q + 0.5;
                                            var9_10 = var2_2.getY() + this.c4e().fsy.nextInt(3) - 1;
                                            var11_11 = (double)var2_2.getZ() + (this.c4e().fsy.nextDouble() - this.c4e().fsy.nextDouble()) * (double)this.a2q + 0.5;
                                            try {
                                                try {
                                                    v18 = var5_6;
                                                    if (var1_1 == 0) break block64;
                                                    if (!(v18 instanceof yqv)) break block65;
                                                }
                                                catch (oov v19) {
                                                    throw aih.a(v19);
                                                }
                                                v18 = var5_6;
                                            }
                                            catch (oov v20) {
                                                throw aih.a(v20);
                                            }
                                        }
                                        v21 = (yqv)v18;
                                        break block70;
                                    }
                                    v21 = null;
                                }
                                var13_12 = v21;
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    var5_6.x24(var7_7, var9_10, var11_11, this.c4e().fsy.nextFloat() * 360.0f, 0.0f);
                                                    v22 = var13_12;
                                                    if (var1_1 == 0) break block66;
                                                    if (v22 != null) {
                                                    }
                                                    ** GOTO lbl170
                                                }
                                                catch (oov v23) {
                                                    throw aih.a(v23);
                                                }
                                                v24 = var13_12.iaw();
                                                if (var1_1 == 0) break block67;
                                            }
                                            catch (oov v25) {
                                                throw aih.a(v25);
                                            }
                                            if (!v24) continue;
                                        }
                                        catch (oov v26) {
                                            throw aih.a(v26);
                                        }
                                        v22 = var13_12;
                                        if (var1_1 == 0) break block66;
                                    }
                                    catch (oov v27) {
                                        throw aih.a(v27);
                                    }
                                    v24 = v22.m63();
                                }
                                catch (oov v28) {
                                    throw aih.a(v28);
                                }
                            }
                            try {
                                if (!v24) continue;
lbl170:
                                // 2 sources

                                this.yh9(var5_6, true);
                                this.c4e().qca(2004, var2_2, 0);
                                v22 = var13_12;
                            }
                            catch (oov v29) {
                                throw aih.a(v29);
                            }
                        }
                        try {
                            if (var1_1 == 0) break block68;
                            if (v22 == null) break block69;
                        }
                        catch (oov v30) {
                            throw aih.a(v30);
                        }
                        v22 = var13_12;
                    }
                    v22.guo();
                }
                var3_4 = 1;
                if (var1_1 != 0) continue;
            }
            try {
                if (var3_4 != 0) {
                    this.jhc();
                }
            }
            catch (oov v31) {
                throw aih.a(v31);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private i2h yh9(i2h var1_1, boolean var2_2) {
        block50: {
            block56: {
                block58: {
                    block57: {
                        block48: {
                            block49: {
                                block47: {
                                    var3_3 = aih.a ^ 14293770204693L;
                                    var5_4 = t9d.c();
                                    if (this.s8m() == null) ** GOTO lbl121
                                    var6_5 = new bdo();
                                    var1_1.qqt((bdo)var6_5);
                                    for (Object var8_7 : aih$vir.pmp(this.s8m()).bo9()) {
                                        var9_8 = aih$vir.pmp(this.s8m()).e2o((String)var8_7);
                                        try {
                                            var6_5.rzm((String)var8_7, var9_8.h33());
                                            if (var5_4 == 0) {
                                                if (var5_4 == 0) continue;
                                                break;
                                            }
                                            break block47;
                                        }
                                        catch (oov v0) {
                                            throw aih.a(v0);
                                        }
                                    }
                                    var1_1.a1f((bdo)var6_5);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                v1 = var1_1;
                                                if (var5_4 != 0) break block48;
                                                if (v1.oay == null) break block49;
                                            }
                                            catch (oov v2) {
                                                throw aih.a(v2);
                                            }
                                            v3 = var2_2;
                                            if (var5_4 != 0) break block49;
                                        }
                                        catch (oov v4) {
                                            throw aih.a(v4);
                                        }
                                        if (!v3) break block49;
                                    }
                                    catch (oov v5) {
                                        throw aih.a(v5);
                                    }
                                    v3 = var1_1.oay.xzq(var1_1);
                                }
                                catch (oov v6) {
                                    throw aih.a(v6);
                                }
                            }
                            v1 = var1_1;
                        }
                        var8_7 = v1;
                        while (var6_5.inh((String)aih.a("j", (int)31341, (long)(1361176763245619926L ^ var3_3)), 10)) {
                            block51: {
                                block52: {
                                    block54: {
                                        block55: {
                                            block53: {
                                                var7_6 = var6_5.b__((String)aih.a("j", (int)6048, (long)(2320174661454333699L ^ var3_3)));
                                                var9_8 = y65.k71(var7_6.u14((String)aih.a("j", (int)12025, (long)(2300126575877242439L ^ var3_3))), var1_1.oay);
                                                try {
                                                    try {
                                                        v7 = var9_8;
                                                        if (var5_4 != 0) break block50;
                                                        if (var5_4 != 0) break block51;
                                                    }
                                                    catch (oov v8) {
                                                        throw aih.a(v8);
                                                    }
                                                    if (v7 == null) break block52;
                                                }
                                                catch (oov v9) {
                                                    throw aih.a(v9);
                                                }
                                                var10_9 = new bdo();
                                                var9_8.qqt(var10_9);
                                                for (String var12_11 : var7_6.bo9()) {
                                                    var13_12 = var7_6.e2o(var12_11);
                                                    try {
                                                        var10_9.rzm(var12_11, var13_12.h33());
                                                        if (var5_4 == 0) {
                                                            if (var5_4 == 0) continue;
                                                            break;
                                                        }
                                                        break block53;
                                                    }
                                                    catch (oov v10) {
                                                        throw aih.a(v10);
                                                    }
                                                }
                                                var9_8.a1f(var10_9);
                                                var9_8.x24(var8_7.o2v, var8_7.kfp, var8_7.vbd, var8_7.x5k, var8_7.y2i);
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v11 = var1_1;
                                                            if (var5_4 != 0) break block54;
                                                            if (v11.oay == null) break block55;
                                                        }
                                                        catch (oov v12) {
                                                            throw aih.a(v12);
                                                        }
                                                        v13 = var2_2;
                                                        if (var5_4 != 0) break block55;
                                                    }
                                                    catch (oov v14) {
                                                        throw aih.a(v14);
                                                    }
                                                    if (!v13) break block55;
                                                }
                                                catch (oov v15) {
                                                    throw aih.a(v15);
                                                }
                                                v13 = var1_1.oay.xzq((i2h)var9_8);
                                            }
                                            catch (oov v16) {
                                                throw aih.a(v16);
                                            }
                                        }
                                        v11 = var8_7;
                                    }
                                    v11.nw9((i2h)var9_8);
                                }
                                v17 = var9_8;
                            }
                            var8_7 = v17;
                            var6_5 = var7_6;
                            if (var5_4 == 0) continue;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var5_4 == 0) break block56;
lbl121:
                                                    // 2 sources

                                                    v7 = var1_1;
                                                    if (var5_4 != 0) break block50;
                                                }
                                                catch (oov v18) {
                                                    throw aih.a(v18);
                                                }
                                                if (!(v7 instanceof g_3)) break block56;
                                            }
                                            catch (oov v19) {
                                                throw aih.a(v19);
                                            }
                                            v7 = var1_1;
                                            if (var5_4 != 0) break block50;
                                        }
                                        catch (oov v20) {
                                            throw aih.a(v20);
                                        }
                                        if (v7.oay == null) break block56;
                                    }
                                    catch (oov v21) {
                                        throw aih.a(v21);
                                    }
                                    v22 = var2_2;
                                    if (var5_4 != 0) break block57;
                                }
                                catch (oov v23) {
                                    throw aih.a(v23);
                                }
                                if (!v22) break block56;
                            }
                            catch (oov v24) {
                                throw aih.a(v24);
                            }
                            v22 = var1_1 instanceof yqv;
                        }
                        catch (oov v25) {
                            throw aih.a(v25);
                        }
                    }
                    try {
                        try {
                            if (var5_4 != 0) break block56;
                            if (!v22) break block58;
                        }
                        catch (oov v26) {
                            throw aih.a(v26);
                        }
                        ((yqv)var1_1).hx8(var1_1.oay.sms(new mew(var1_1)), null);
                    }
                    catch (oov v27) {
                        throw aih.a(v27);
                    }
                }
                v22 = var1_1.oay.xzq(var1_1);
            }
            v7 = var1_1;
        }
        return v7;
    }

    private void jhc() {
        aih aih2;
        block13: {
            block14: {
                int n;
                block12: {
                    int n2;
                    int n3;
                    block10: {
                        n = t9d.c();
                        try {
                            block11: {
                                try {
                                    try {
                                        n3 = this.hqe;
                                        n2 = this.zwe;
                                        if (n != 0) break block10;
                                        if (n3 > n2) break block11;
                                    }
                                    catch (oov oov2) {
                                        throw aih.a(oov2);
                                    }
                                    this.op9 = this.zwe;
                                    if (n == 0) break block12;
                                }
                                catch (oov oov3) {
                                    throw aih.a(oov3);
                                }
                            }
                            n3 = this.hqe;
                            n2 = this.zwe;
                        }
                        catch (oov oov4) {
                            throw aih.a(oov4);
                        }
                    }
                    int n4 = n3 - n2;
                    this.op9 = this.zwe + this.c4e().fsy.nextInt(n4);
                }
                try {
                    try {
                        aih2 = this;
                        if (n != 0) break block13;
                        if (aih2.c9g.size() <= 0) break block14;
                    }
                    catch (oov oov5) {
                        throw aih.a(oov5);
                    }
                    this.yv6((aih$vir)zfj.h82(this.c4e().fsy, this.c9g));
                }
                catch (oov oov6) {
                    throw aih.a(oov6);
                }
            }
            aih2 = this;
        }
        aih2.jn0(1);
    }

    public void n8j(bdo bdo2) {
        block32: {
            block31: {
                boolean bl;
                int n;
                long l;
                block29: {
                    block30: {
                        block27: {
                            block28: {
                                block26: {
                                    block25: {
                                        boolean bl2;
                                        block23: {
                                            block24: {
                                                l = a ^ 0xEA3A6C3FB2BL;
                                                this.jpk = bdo2.u14((String)((Object)aih.a("j", (int)8167, (long)(0x33AF05A491DE8266L ^ l))));
                                                this.op9 = bdo2.hp9((String)((Object)aih.a("j", (int)20261, (long)(0x29C0D2201EE452A1L ^ l))));
                                                n = t9d.b();
                                                try {
                                                    this.c9g.clear();
                                                    bl2 = bdo2.inh((String)((Object)aih.a("j", (int)8817, (long)(0x7BA7491008483FE2L ^ l))), 9);
                                                    if (n == 0) break block23;
                                                    if (!bl2) break block24;
                                                }
                                                catch (oov oov2) {
                                                    throw aih.a(oov2);
                                                }
                                                qhg qhg2 = bdo2.bzb((String)((Object)aih.a("j", (int)8817, (long)(0x7BA7491008483FE2L ^ l))), 10);
                                                for (int i = 0; i < qhg2.vek(); ++i) {
                                                    try {
                                                        this.c9g.add(new aih$vir(this, qhg2.kd6(i)));
                                                        if (n != 0) {
                                                            if (n != 0) continue;
                                                            break;
                                                        }
                                                        break block25;
                                                    }
                                                    catch (oov oov3) {
                                                        throw aih.a(oov3);
                                                    }
                                                }
                                            }
                                            bl2 = bdo2.inh((String)((Object)aih.a("j", (int)29005, (long)(0xD5515B2BE756CD5L ^ l))), 10);
                                        }
                                        try {
                                            if (!bl2) break block25;
                                            this.yv6(new aih$vir(this, bdo2.b__((String)((Object)aih.a("j", (int)29005, (long)(0xD5515B2BE756CD5L ^ l)))), this.jpk));
                                            if (n != 0) break block26;
                                        }
                                        catch (oov oov4) {
                                            throw aih.a(oov4);
                                        }
                                    }
                                    this.yv6(null);
                                }
                                try {
                                    try {
                                        bl = bdo2.inh((String)((Object)aih.a("j", (int)21183, (long)(0x6CDFFC32AAE5CF28L ^ l))), 99);
                                        if (n == 0) break block27;
                                        if (!bl) break block28;
                                    }
                                    catch (oov oov5) {
                                        throw aih.a(oov5);
                                    }
                                    this.zwe = bdo2.hp9((String)((Object)aih.a("j", (int)21183, (long)(0x6CDFFC32AAE5CF28L ^ l))));
                                    this.hqe = bdo2.hp9((String)((Object)aih.a("j", (int)2340, (long)(0x6FB11D9B02B214A7L ^ l))));
                                    this.c4_ = bdo2.hp9((String)((Object)aih.a("j", (int)18611, (long)(0xD2AB78C1CFFD531L ^ l))));
                                }
                                catch (oov oov6) {
                                    throw aih.a(oov6);
                                }
                            }
                            bl = bdo2.inh((String)((Object)aih.a("j", (int)12130, (long)(0x2CC1C53EAC9432F6L ^ l))), 99);
                        }
                        try {
                            try {
                                if (n == 0) break block29;
                                if (!bl) break block30;
                            }
                            catch (oov oov7) {
                                throw aih.a(oov7);
                            }
                            this.ffx = bdo2.hp9((String)((Object)aih.a("j", (int)12130, (long)(0x2CC1C53EAC9432F6L ^ l))));
                            this.uw3 = bdo2.hp9((String)((Object)aih.a("j", (int)4297, (long)(0x298D447706FD8D5BL ^ l))));
                        }
                        catch (oov oov8) {
                            throw aih.a(oov8);
                        }
                    }
                    bl = bdo2.inh((String)((Object)aih.a("j", (int)27389, (long)(0x1047FF5FBB52776DL ^ l))), 99);
                }
                try {
                    if (bl) {
                        this.a2q = bdo2.hp9((String)((Object)aih.a("j", (int)27389, (long)(0x1047FF5FBB52776DL ^ l))));
                    }
                }
                catch (oov oov9) {
                    throw aih.a(oov9);
                }
                try {
                    aih aih2;
                    try {
                        aih2 = this;
                        if (n == 0) break block31;
                        if (aih2.c4e() == null) break block32;
                    }
                    catch (oov oov10) {
                        throw aih.a(oov10);
                    }
                    aih2 = this;
                }
                catch (oov oov11) {
                    throw aih.a(oov11);
                }
            }
            aih2.s8q = null;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void ymq(bdo var1_1) {
        block23: {
            block28: {
                block27: {
                    block29: {
                        block26: {
                            block24: {
                                block25: {
                                    block22: {
                                        var2_2 = aih.a ^ 102256513809302L;
                                        var4_3 = t9d.c();
                                        var5_4 = this.m9e();
                                        try {
                                            try {
                                                if (var4_3 != 0) break block22;
                                                if (jfy.hez(var5_4)) break block23;
                                            }
                                            catch (oov v0) {
                                                throw aih.a(v0);
                                            }
                                            var1_1.rjq((String)aih.a("j", (int)31474, (long)(6674321944096630722L ^ var2_2)), var5_4);
                                            var1_1.ge7((String)aih.a("j", (int)1816, (long)(2692938339158465086L ^ var2_2)), (short)this.op9);
                                            var1_1.ge7((String)aih.a("j", (int)20292, (long)(3192198622195634792L ^ var2_2)), (short)this.zwe);
                                            var1_1.ge7((String)aih.a("j", (int)21039, (long)(4072533779962875662L ^ var2_2)), (short)this.hqe);
                                            var1_1.ge7((String)aih.a("j", (int)30301, (long)(2918897312144026489L ^ var2_2)), (short)this.c4_);
                                            var1_1.ge7((String)aih.a("j", (int)5999, (long)(6863223105447561805L ^ var2_2)), (short)this.ffx);
                                            var1_1.ge7((String)aih.a("j", (int)18696, (long)(8425654820312503328L ^ var2_2)), (short)this.uw3);
                                            var1_1.ge7((String)aih.a("j", (int)26875, (long)(8132317050105755072L ^ var2_2)), (short)this.a2q);
                                        }
                                        catch (oov v1) {
                                            throw aih.a(v1);
                                        }
                                    }
                                    try {
                                        try {
                                            v2 = this.s8m();
                                            if (var4_3 != 0) break block24;
                                            if (v2 == null) break block25;
                                        }
                                        catch (oov v3) {
                                            throw aih.a(v3);
                                        }
                                        var1_1.rzm((String)aih.a("j", (int)12108, (long)(7396868429071921767L ^ var2_2)), aih$vir.pmp(this.s8m()).h33());
                                    }
                                    catch (oov v4) {
                                        throw aih.a(v4);
                                    }
                                }
                                try {
                                    v5 = this;
                                    if (var4_3 != 0) break block26;
                                    v2 = v5.s8m();
                                }
                                catch (oov v6) {
                                    throw aih.a(v6);
                                }
                            }
                            if (v2 != null) break block29;
                            v5 = this;
                        }
                        if (v5.c9g.size() <= 0) break block23;
                    }
                    var6_5 = new qhg();
                    try {
                        try {
                            v7 = this.c9g;
                            if (var4_3 != 0) break block27;
                            if (v7.size() > 0) {
                            }
                            ** GOTO lbl82
                        }
                        catch (oov v8) {
                            throw aih.a(v8);
                        }
                        v7 = this.c9g;
                    }
                    catch (oov v9) {
                        throw aih.a(v9);
                    }
                }
                for (aih$vir var8_7 : v7) {
                    try {
                        var6_5.w2j(var8_7.dv9());
                        if (var4_3 == 0) {
                            if (var4_3 == 0) continue;
                            break;
                        }
                        break block28;
                    }
                    catch (oov v10) {
                        throw aih.a(v10);
                    }
                }
                try {
                    if (var4_3 == 0) break block28;
lbl82:
                    // 2 sources

                    var6_5.w2j(this.s8m().dv9());
                }
                catch (oov v11) {
                    throw aih.a(v11);
                }
            }
            var1_1.rzm((String)aih.a("j", (int)26685, (long)(4694943950964847902L ^ var2_2)), var6_5);
        }
    }

    public i2h dou(t9d t9d2) {
        i2h i2h2;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    i2h2 = this.s8q;
                    if (n != 0) break block4;
                    if (i2h2 != null) break block5;
                }
                catch (oov oov2) {
                    throw aih.a(oov2);
                }
                i2h i2h3 = y65.k71(this.m9e(), t9d2);
                try {
                    i2h2 = i2h3;
                    if (n != 0) break block4;
                    if (i2h2 == null) break block5;
                }
                catch (oov oov3) {
                    throw aih.a(oov3);
                }
                this.s8q = i2h3 = this.yh9(i2h3, false);
            }
            i2h2 = this.s8q;
        }
        return i2h2;
    }

    public boolean h99(int n) {
        boolean bl;
        block8: {
            block9: {
                int n2 = t9d.c();
                try {
                    try {
                        try {
                            try {
                                bl = n;
                                if (n2 != 0) break block8;
                                if (!bl) break block9;
                            }
                            catch (oov oov2) {
                                throw aih.a(oov2);
                            }
                            bl = this.c4e().v0f;
                            if (n2 != 0) break block8;
                        }
                        catch (oov oov3) {
                            throw aih.a(oov3);
                        }
                        if (!bl) break block9;
                    }
                    catch (oov oov4) {
                        throw aih.a(oov4);
                    }
                    this.op9 = this.zwe;
                    return true;
                }
                catch (oov oov5) {
                    throw aih.a(oov5);
                }
            }
            bl = false;
        }
        return bl;
    }

    private aih$vir s8m() {
        return this.ww2;
    }

    public void yv6(aih$vir aih$vir) {
        this.ww2 = aih$vir;
    }

    public abstract void jn0(int var1);

    public abstract t9d c4e();

    public abstract mew fwc();

    public double maa() {
        return this.xsg;
    }

    public double l75() {
        return this.qxf;
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

                aih.a = c.a(5598136847231659381L, -2666797064403999810L, MethodHandles.lookup().lookupClass()).a(81109302142434L);
                aih.d = new HashMap<K, V>(13);
                var0 = aih.a ^ 59981422255584L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[26];
                var7_4 = 0;
                var6_5 = "\u00d4 Q\u00da;\"]O\u00d5\u0095oz\n\u00de\u00b1\u00b9G\u00ffE(\u00de:c\u00fc\u00c4\u0013\u00ab\u00e9\u00ac\u00be\u00e8\u00ae\u009c\u001a\u0081\u00a19\u00c9{T(\u00a7\u0010\u001eKi\u0093\u00e5\u00bbz\u0082,,F\u00b0\u00c7\u00a5b+\u00ed\u0005\u00afI\u0011Iyva\u00bc\u0082\u00ca\u00dc\u001fy\u00f8Ws\u00d0Un=\u0018e$\u00b5\u00e2\u00fbg\t<\u00a8\u00f4\u000flA?u\u00f0y\u00f4\u00d5S\u00ab9\u0091\u00f6 \u00a1!\u00e5X\u00dc\u0001H\u00e0g\u00be\u00eds{\u008e\u0019\u0089\u00f6m\u00fe.\u00f1\u00d9\u00bel-e[2\u00a7\u00b8\u0080\u008b\u0018\u009a\u00aaK\u00b4\u00d8\u00bd\u00d4t\u00fa9lx\u00ffp\u00df\u00f6\u0089a[Y\u00b0&\u00eb\u009b \u00e1\u008fh\u0094~\u0014[\u0083\u00ea\u00fa\u0007~\u001bft!\u00b1\u00fd\u00b3PX\u00e7\u00dd`e\u00f6]|\u00eb\u0004\u0097\u009b(>!\u00ce\u00fa\u009aoQ\f\u00f1]\u0087\"\u00fey\u00d05B\u0084\u00fc\u009a\u00ac\u00eb>\u00dc\u00a8\u00b8\u00dfJE\u009e9\u00f4\u0016\u00c3\u00f1W\u0083\u00bav\u00cf \u00d2\u0014\u00f0\u00f2V\u0087\u00cd\u00da\u00ca\u00d6J,\u00f7\r\u00c4\u00169\u00e2A\u009a\u00d1z(\u00a4\u00f4/\u00d6lD\u00afU\u001a\u0018\u00c8\u00a4\u0018\u00a6D\u0016;va\u0094\u00b3\u00f3\u0095\u00bcYB77\u00ee\u00df\u0095\u0097[I\u0010\u00f3$\u0080\u0097\u001b\u008bD\u001e*\u0017\u00a2\u00d1$\u0013\u001e\u00e0\u0018Bt\u009c\u0015\u00d0e\u00a8N\u00a6\u000b~k\u00bb:f\u00f7\u00e7\u00f5\u00b4f\u00ce7\u0097\u000e(\u00d9\u00d1\u00e4g.\u000e,^\u00e1\u009b$\u00a8\u00e2\u00fe`\u00ab\u00d4\u00bf\u0080\u00d9\u00da\u000f\u0098\u00cd/\u0094\u00b21}\u00cb\u009caz\u00e9\u0099\u008b\u0010\u0089<(\u0018\u00f8)\u0084\u008d\u00ad\u0083\u001fC\u0082\u00cb\r\u00ed\u00ef\n\u00d499F\u00bb\u0014\u00b8\u00a1\u00df\u00c7 Y\u00ca\u00c7r\u0088\u00c8~\u00b0\u0010\u00ff\u00feev\u00ea\u00f1M\u009co\u00cd\u00cf0_\u0094\u0082u\u00f4i\u00b8z\u0083Qt\u0010q\u00c5E'\u009b\u00c6q@e\u00a5\u00076\u0094Z\u00c7\u00bb\u0010\u00e7\u00e1$\u0098\u00dcv\u00b5\u00f9_A\u008a\\\u00e0\u0086\u00ce>\u0010YI\u00e2\u000b\u0006LL1\u00e6\u0014\u00a89\u00e3\u008e\u0010(\u0010\u00b6(\u0007\u00a4\u00d0w\u0004\u008c>eK\u00ba\u008fO\u00fdV\u0018<P\u001c\u0011\u00b2\u00dbm\u00c4\u0090\u0001\u00cd\u00c1s\u0017\u00ba\u0083\u00c1\u00f4T)\u0019\u00c6\u00ba\u008c(t\u0089\u008a\n\u00ab\u0083\u0013;\u0000\u0096\u00f2s\u00d8\u00f5\u0097\u00d5\u00dbne]\r\u00ba\u0016\u00db;\u00a9\u00f2\u00c5\u00d0\u000e\u00a8\u00da\u00ddwS\u00e3U\u00f8Q\u00c9\u0010qDj\u00cft\u009d\u00a0x\u001d\u00d5\u00d9z\u00b7\u00fa\u00fc\u00ce \u00c6\u00b9$\u0010m\u00e7\u00b2\u00e1\u00f6\u008e\u001e\u0006\u00c1A|\u00db\u00aa\u0003~\u00e0\u00e2\u00e3o7oz'\u00c7\u00e3e\"-\u0018\u00f6\u0089\u00e6\u00ef\u00d4\u00cf\u00b4\u0093\u00b2,\u00dd2\u0017\u008c5\u0014\u00b2A;\u0002\u0016\u00abb\u00ad\u0018O\u00a9]\u0018\u0012\u00e0\u00a4\u001ah\u0081\u00a4+\u0005\u0085\f\u0015C\u0092\u009e\u00b2\u0019\b\u00a2y";
                var8_6 = "\u00d4 Q\u00da;\"]O\u00d5\u0095oz\n\u00de\u00b1\u00b9G\u00ffE(\u00de:c\u00fc\u00c4\u0013\u00ab\u00e9\u00ac\u00be\u00e8\u00ae\u009c\u001a\u0081\u00a19\u00c9{T(\u00a7\u0010\u001eKi\u0093\u00e5\u00bbz\u0082,,F\u00b0\u00c7\u00a5b+\u00ed\u0005\u00afI\u0011Iyva\u00bc\u0082\u00ca\u00dc\u001fy\u00f8Ws\u00d0Un=\u0018e$\u00b5\u00e2\u00fbg\t<\u00a8\u00f4\u000flA?u\u00f0y\u00f4\u00d5S\u00ab9\u0091\u00f6 \u00a1!\u00e5X\u00dc\u0001H\u00e0g\u00be\u00eds{\u008e\u0019\u0089\u00f6m\u00fe.\u00f1\u00d9\u00bel-e[2\u00a7\u00b8\u0080\u008b\u0018\u009a\u00aaK\u00b4\u00d8\u00bd\u00d4t\u00fa9lx\u00ffp\u00df\u00f6\u0089a[Y\u00b0&\u00eb\u009b \u00e1\u008fh\u0094~\u0014[\u0083\u00ea\u00fa\u0007~\u001bft!\u00b1\u00fd\u00b3PX\u00e7\u00dd`e\u00f6]|\u00eb\u0004\u0097\u009b(>!\u00ce\u00fa\u009aoQ\f\u00f1]\u0087\"\u00fey\u00d05B\u0084\u00fc\u009a\u00ac\u00eb>\u00dc\u00a8\u00b8\u00dfJE\u009e9\u00f4\u0016\u00c3\u00f1W\u0083\u00bav\u00cf \u00d2\u0014\u00f0\u00f2V\u0087\u00cd\u00da\u00ca\u00d6J,\u00f7\r\u00c4\u00169\u00e2A\u009a\u00d1z(\u00a4\u00f4/\u00d6lD\u00afU\u001a\u0018\u00c8\u00a4\u0018\u00a6D\u0016;va\u0094\u00b3\u00f3\u0095\u00bcYB77\u00ee\u00df\u0095\u0097[I\u0010\u00f3$\u0080\u0097\u001b\u008bD\u001e*\u0017\u00a2\u00d1$\u0013\u001e\u00e0\u0018Bt\u009c\u0015\u00d0e\u00a8N\u00a6\u000b~k\u00bb:f\u00f7\u00e7\u00f5\u00b4f\u00ce7\u0097\u000e(\u00d9\u00d1\u00e4g.\u000e,^\u00e1\u009b$\u00a8\u00e2\u00fe`\u00ab\u00d4\u00bf\u0080\u00d9\u00da\u000f\u0098\u00cd/\u0094\u00b21}\u00cb\u009caz\u00e9\u0099\u008b\u0010\u0089<(\u0018\u00f8)\u0084\u008d\u00ad\u0083\u001fC\u0082\u00cb\r\u00ed\u00ef\n\u00d499F\u00bb\u0014\u00b8\u00a1\u00df\u00c7 Y\u00ca\u00c7r\u0088\u00c8~\u00b0\u0010\u00ff\u00feev\u00ea\u00f1M\u009co\u00cd\u00cf0_\u0094\u0082u\u00f4i\u00b8z\u0083Qt\u0010q\u00c5E'\u009b\u00c6q@e\u00a5\u00076\u0094Z\u00c7\u00bb\u0010\u00e7\u00e1$\u0098\u00dcv\u00b5\u00f9_A\u008a\\\u00e0\u0086\u00ce>\u0010YI\u00e2\u000b\u0006LL1\u00e6\u0014\u00a89\u00e3\u008e\u0010(\u0010\u00b6(\u0007\u00a4\u00d0w\u0004\u008c>eK\u00ba\u008fO\u00fdV\u0018<P\u001c\u0011\u00b2\u00dbm\u00c4\u0090\u0001\u00cd\u00c1s\u0017\u00ba\u0083\u00c1\u00f4T)\u0019\u00c6\u00ba\u008c(t\u0089\u008a\n\u00ab\u0083\u0013;\u0000\u0096\u00f2s\u00d8\u00f5\u0097\u00d5\u00dbne]\r\u00ba\u0016\u00db;\u00a9\u00f2\u00c5\u00d0\u000e\u00a8\u00da\u00ddwS\u00e3U\u00f8Q\u00c9\u0010qDj\u00cft\u009d\u00a0x\u001d\u00d5\u00d9z\u00b7\u00fa\u00fc\u00ce \u00c6\u00b9$\u0010m\u00e7\u00b2\u00e1\u00f6\u008e\u001e\u0006\u00c1A|\u00db\u00aa\u0003~\u00e0\u00e2\u00e3o7oz'\u00c7\u00e3e\"-\u0018\u00f6\u0089\u00e6\u00ef\u00d4\u00cf\u00b4\u0093\u00b2,\u00dd2\u0017\u008c5\u0014\u00b2A;\u0002\u0016\u00abb\u00ad\u0018O\u00a9]\u0018\u0012\u00e0\u00a4\u001ah\u0081\u00a4+\u0005\u0085\f\u0015C\u0092\u009e\u00b2\u0019\b\u00a2y".length();
                var5_7 = 40;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = aih.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00821l\u00d2\u0018\u0014d\u00e4\u009e\u00a6\u0016\u00c1\u00b9 \u0004\u0013>\u0095\u0004[\u0002\u00e7\u00a6\u0084\u0085\u00eb\u00f3\u00f2\u0097\u0088V\u00d0\u0018\u00c5\u00fa\u00c1\u00c2\u00ba\u00e5\u00f3\u00cb\u0001\u00eb\u0010)=\u00fe\u00fc\u00ebr\u0083\u00d1\u00aa\u00993\u0095\u00be";
                    var8_6 = "\u00821l\u00d2\u0018\u0014d\u00e4\u009e\u00a6\u0016\u00c1\u00b9 \u0004\u0013>\u0095\u0004[\u0002\u00e7\u00a6\u0084\u0085\u00eb\u00f3\u00f2\u0097\u0088V\u00d0\u0018\u00c5\u00fa\u00c1\u00c2\u00ba\u00e5\u00f3\u00cb\u0001\u00eb\u0010)=\u00fe\u00fc\u00ebr\u0083\u00d1\u00aa\u00993\u0095\u00be".length();
                    var5_7 = 32;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = aih.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        aih.b = var9_3;
        aih.c = new String[26];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7907;
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
                throw new RuntimeException("aih", exception);
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
            aih.c[n2] = aih.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = aih.a(n, l);
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
            throw new RuntimeException("aih" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(aih.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

