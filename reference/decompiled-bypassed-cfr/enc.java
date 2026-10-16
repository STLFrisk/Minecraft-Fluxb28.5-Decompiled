/*
 * Decompiled with CFR 0.152.
 */
public class enc
extends cjm {
    private /* synthetic */ ysf sdv;
    private /* synthetic */ ysf wum;
    private /* synthetic */ t9d uw_;
    private /* synthetic */ int olw;
    public j7z b4h;

    public enc(ysf ysf2) {
        this.sdv = ysf2;
        this.uw_ = ysf2.oay;
        this.k23(3);
    }

    @Override
    public boolean vle() {
        boolean bl;
        block34: {
            block35: {
                boolean bl2;
                block40: {
                    block39: {
                        int n;
                        block38: {
                            block36: {
                                i2h i2h2;
                                block37: {
                                    enc enc2;
                                    block32: {
                                        block33: {
                                            block31: {
                                                int n2;
                                                block29: {
                                                    block30: {
                                                        n = t9d.b();
                                                        try {
                                                            try {
                                                                n2 = this.sdv.ktm();
                                                                if (n == 0) break block29;
                                                                if (n2 == 0) break block30;
                                                            }
                                                            catch (oov oov2) {
                                                                throw enc.a(oov2);
                                                            }
                                                            return false;
                                                        }
                                                        catch (oov oov3) {
                                                            throw enc.a(oov3);
                                                        }
                                                    }
                                                    try {
                                                        enc2 = this;
                                                        if (n == 0) break block31;
                                                        n2 = enc2.sdv.mbr().nextInt(500);
                                                    }
                                                    catch (oov oov4) {
                                                        throw enc.a(oov4);
                                                    }
                                                }
                                                try {
                                                    if (n2 != 0) {
                                                        return false;
                                                    }
                                                }
                                                catch (oov oov5) {
                                                    throw enc.a(oov5);
                                                }
                                                this.b4h = this.uw_.hd9().pom(new mew(this.sdv), 0);
                                                enc2 = this;
                                            }
                                            try {
                                                try {
                                                    if (n == 0) break block32;
                                                    if (enc2.b4h != null) break block33;
                                                }
                                                catch (oov oov6) {
                                                    throw enc.a(oov6);
                                                }
                                                return false;
                                            }
                                            catch (oov oov7) {
                                                throw enc.a(oov7);
                                            }
                                        }
                                        enc2 = this;
                                    }
                                    try {
                                        try {
                                            try {
                                                bl = enc2.xv8();
                                                if (n == 0) break block34;
                                                if (!bl) break block35;
                                            }
                                            catch (oov oov8) {
                                                throw enc.a(oov8);
                                            }
                                            bl = this.sdv.b19(true);
                                            if (n == 0) break block34;
                                        }
                                        catch (oov oov9) {
                                            throw enc.a(oov9);
                                        }
                                        if (!bl) break block35;
                                    }
                                    catch (oov oov10) {
                                        throw enc.a(oov10);
                                    }
                                    i2h2 = this.uw_.xq6(ysf.class, this.sdv.aaw().c2h(8.0, 3.0, 8.0), this.sdv);
                                    try {
                                        try {
                                            if (n == 0) break block36;
                                            if (i2h2 != null) break block37;
                                        }
                                        catch (oov oov11) {
                                            throw enc.a(oov11);
                                        }
                                        return false;
                                    }
                                    catch (oov oov12) {
                                        throw enc.a(oov12);
                                    }
                                }
                                this.wum = (ysf)i2h2;
                            }
                            try {
                                try {
                                    bl2 = this.wum.ktm();
                                    if (n == 0) break block38;
                                    if (bl2) break block39;
                                }
                                catch (oov oov13) {
                                    throw enc.a(oov13);
                                }
                                bl2 = this.wum.b19(true);
                            }
                            catch (oov oov14) {
                                throw enc.a(oov14);
                            }
                        }
                        try {
                            if (n == 0) break block40;
                            if (!bl2) break block39;
                        }
                        catch (oov oov15) {
                            throw enc.a(oov15);
                        }
                        bl2 = true;
                        break block40;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void mnp() {
        this.olw = 300;
        this.sdv._zd(true);
    }

    @Override
    public void zly() {
        this.b4h = null;
        this.wum = null;
        this.sdv._zd(false);
    }

    @Override
    public boolean wh3() {
        int n;
        block18: {
            block15: {
                int n2;
                block17: {
                    block16: {
                        block14: {
                            n2 = t9d.c();
                            try {
                                try {
                                    n = this.olw;
                                    if (n2 != 0) break block14;
                                    if (n < 0) break block15;
                                }
                                catch (oov oov2) {
                                    throw enc.a(oov2);
                                }
                                n = this.xv8();
                            }
                            catch (oov oov3) {
                                throw enc.a(oov3);
                            }
                        }
                        try {
                            try {
                                if (n2 != 0) break block16;
                                if (n == 0) break block15;
                            }
                            catch (oov oov4) {
                                throw enc.a(oov4);
                            }
                            n = this.sdv.ktm();
                        }
                        catch (oov oov5) {
                            throw enc.a(oov5);
                        }
                    }
                    try {
                        try {
                            if (n2 != 0) break block17;
                            if (n != 0) break block15;
                        }
                        catch (oov oov6) {
                            throw enc.a(oov6);
                        }
                        n = this.sdv.b19(false) ? 1 : 0;
                    }
                    catch (oov oov7) {
                        throw enc.a(oov7);
                    }
                }
                try {
                    if (n2 != 0) break block18;
                    if (n == 0) break block15;
                }
                catch (oov oov8) {
                    throw enc.a(oov8);
                }
                n = 1;
                break block18;
            }
            n = 0;
        }
        return n != 0;
    }

    @Override
    public void iad() {
        block23: {
            enc enc2;
            block22: {
                double d;
                block21: {
                    int n;
                    block20: {
                        block18: {
                            --this.olw;
                            int n2 = t9d.c();
                            this.sdv.ph8().rz3(this.wum, 10.0f, 30.0f);
                            n = n2;
                            try {
                                block19: {
                                    try {
                                        try {
                                            double d2 = this.sdv.wxg(this.wum) - 2.25;
                                            d = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                                            if (n != 0) break block18;
                                            if (d <= 0) break block19;
                                        }
                                        catch (oov oov2) {
                                            throw enc.a(oov2);
                                        }
                                        this.sdv.zq2().p6m(this.wum, 0.25);
                                        if (n == 0) break block20;
                                    }
                                    catch (oov oov3) {
                                        throw enc.a(oov3);
                                    }
                                }
                                d = this.olw;
                            }
                            catch (oov oov4) {
                                throw enc.a(oov4);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (n != 0) break block21;
                                        if (d != false) break block20;
                                    }
                                    catch (oov oov5) {
                                        throw enc.a(oov5);
                                    }
                                    d = (double)this.wum.nfm();
                                    if (n != 0) break block21;
                                }
                                catch (oov oov6) {
                                    throw enc.a(oov6);
                                }
                                if (d == false) break block20;
                            }
                            catch (oov oov7) {
                                throw enc.a(oov7);
                            }
                            this.g27();
                        }
                        catch (oov oov8) {
                            throw enc.a(oov8);
                        }
                    }
                    try {
                        enc2 = this;
                        if (n != 0) break block22;
                        d = enc2.sdv.mbr().nextInt(35);
                    }
                    catch (oov oov9) {
                        throw enc.a(oov9);
                    }
                }
                if (d != false) break block23;
                enc2 = this;
            }
            enc2.uw_.qyn(this.sdv, (byte)12);
        }
    }

    private boolean xv8() {
        boolean bl;
        block10: {
            block11: {
                int n;
                int n2;
                block8: {
                    block9: {
                        n2 = t9d.b();
                        try {
                            try {
                                n = this.b4h.eiw();
                                if (n2 == 0) break block8;
                                if (n != false) break block9;
                            }
                            catch (oov oov2) {
                                throw enc.a(oov2);
                            }
                            return false;
                        }
                        catch (oov oov3) {
                            throw enc.a(oov3);
                        }
                    }
                    n = (int)((double)this.b4h.v0k() * 0.35);
                }
                boolean bl2 = n;
                try {
                    try {
                        bl = this.b4h.ucg();
                        if (n2 == 0) break block10;
                        if (bl >= bl2) break block11;
                    }
                    catch (oov oov4) {
                        throw enc.a(oov4);
                    }
                    bl = true;
                    break block10;
                }
                catch (oov oov5) {
                    throw enc.a(oov5);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void g27() {
        ysf ysf2 = this.sdv.kv0(this.wum);
        this.wum.mr2(6000);
        this.sdv.mr2(6000);
        this.wum.dim(false);
        this.sdv.dim(false);
        ysf2.mr2(-24000);
        ysf2.x24(this.sdv.o2v, this.sdv.kfp, this.sdv.vbd, 0.0f, 0.0f);
        this.uw_.xzq(ysf2);
        this.uw_.qyn(ysf2, (byte)12);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

