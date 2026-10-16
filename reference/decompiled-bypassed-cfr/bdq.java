/*
 * Decompiled with CFR 0.152.
 */
public class bdq
extends cjm {
    public yqv her;
    public i2h rtl;
    public float s7b;
    private /* synthetic */ int c4e;
    private /* synthetic */ float xns;
    public Class ea2;

    public bdq(yqv yqv2, Class clazz, float f) {
        this.her = yqv2;
        this.ea2 = clazz;
        this.s7b = f;
        this.xns = 0.02f;
        this.k23(2);
    }

    public bdq(yqv yqv2, Class clazz, float f, float f2) {
        this.her = yqv2;
        this.ea2 = clazz;
        this.s7b = f;
        this.xns = f2;
        this.k23(2);
    }

    @Override
    public boolean vle() {
        boolean bl;
        block22: {
            block20: {
                bdq bdq2;
                int n;
                block19: {
                    g_3 g_32;
                    block17: {
                        block18: {
                            n = t9d.c();
                            try {
                                try {
                                    g_32 = this.her;
                                    if (n != 0) break block17;
                                    if (!(g_32.mbr().nextFloat() >= this.xns)) break block18;
                                }
                                catch (oov oov2) {
                                    throw bdq.a(oov2);
                                }
                                return false;
                            }
                            catch (oov oov3) {
                                throw bdq.a(oov3);
                            }
                        }
                        try {
                            bdq2 = this;
                            if (n != 0) break block19;
                            g_32 = bdq2.her.q4v();
                        }
                        catch (oov oov4) {
                            throw bdq.a(oov4);
                        }
                    }
                    try {
                        if (g_32 != null) {
                            this.rtl = this.her.q4v();
                        }
                    }
                    catch (oov oov5) {
                        throw bdq.a(oov5);
                    }
                    bdq2 = this;
                }
                try {
                    block21: {
                        try {
                            try {
                                if (n != 0) break block20;
                                if (bdq2.ea2 != ha9.class) break block21;
                            }
                            catch (oov oov6) {
                                throw bdq.a(oov6);
                            }
                            this.rtl = this.her.oay.a_q(this.her, this.s7b);
                            if (n == 0) break block22;
                        }
                        catch (oov oov7) {
                            throw bdq.a(oov7);
                        }
                    }
                    bdq2 = this;
                }
                catch (oov oov8) {
                    throw bdq.a(oov8);
                }
            }
            bdq2.rtl = this.her.oay.xq6(this.ea2, this.her.aaw().c2h(this.s7b, 3.0, this.s7b), this.her);
        }
        try {
            bl = this.rtl != null;
        }
        catch (oov oov9) {
            throw bdq.a(oov9);
        }
        return bl;
    }

    @Override
    public boolean wh3() {
        int n;
        block12: {
            block15: {
                int n2;
                block13: {
                    block14: {
                        block10: {
                            block11: {
                                n2 = t9d.c();
                                try {
                                    try {
                                        n = this.rtl.gzr();
                                        if (n2 != 0) break block10;
                                        if (n != 0) break block11;
                                    }
                                    catch (oov oov2) {
                                        throw bdq.a(oov2);
                                    }
                                    n = 0;
                                    break block12;
                                }
                                catch (oov oov3) {
                                    throw bdq.a(oov3);
                                }
                            }
                            double d = this.her.wxg(this.rtl) - (double)(this.s7b * this.s7b);
                            n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                        }
                        try {
                            try {
                                if (n2 != 0) break block13;
                                if (n <= 0) break block14;
                            }
                            catch (oov oov4) {
                                throw bdq.a(oov4);
                            }
                            n = 0;
                            break block12;
                        }
                        catch (oov oov5) {
                            throw bdq.a(oov5);
                        }
                    }
                    n = this.c4e;
                }
                try {
                    if (n2 != 0) break block12;
                    if (n <= 0) break block15;
                }
                catch (oov oov6) {
                    throw bdq.a(oov6);
                }
                n = 1;
                break block12;
            }
            n = 0;
        }
        return n != 0;
    }

    @Override
    public void mnp() {
        this.c4e = 40 + this.her.mbr().nextInt(40);
    }

    @Override
    public void zly() {
        this.rtl = null;
    }

    @Override
    public void iad() {
        this.her.ph8().c2i(this.rtl.o2v, this.rtl.kfp + (double)this.rtl.c5y(), this.rtl.vbd, 10.0f, this.her.d1r());
        --this.c4e;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

