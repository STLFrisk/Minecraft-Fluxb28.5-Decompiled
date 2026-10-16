/*
 * Decompiled with CFR 0.152.
 */
public class dge$_fz
extends cjm {
    private dge s0h;
    private int uqy;

    public dge$_fz(dge dge2) {
        this.s0h = dge2;
        this.k23(2);
    }

    @Override
    public boolean vle() {
        boolean bl;
        block16: {
            block20: {
                block19: {
                    g_3 g_32;
                    int n;
                    block17: {
                        block18: {
                            g_3 g_33;
                            block14: {
                                block15: {
                                    n = t9d.b();
                                    g_32 = this.s0h.q4v();
                                    try {
                                        try {
                                            g_33 = g_32;
                                            if (n == 0) break block14;
                                            if (g_33 != null) break block15;
                                        }
                                        catch (oov oov2) {
                                            throw dge$_fz.a(oov2);
                                        }
                                        bl = false;
                                        break block16;
                                    }
                                    catch (oov oov3) {
                                        throw dge$_fz.a(oov3);
                                    }
                                }
                                g_33 = g_32;
                            }
                            try {
                                try {
                                    bl = g_33.gzr();
                                    if (n == 0) break block17;
                                    if (bl) break block18;
                                }
                                catch (oov oov4) {
                                    throw dge$_fz.a(oov4);
                                }
                                bl = false;
                                break block16;
                            }
                            catch (oov oov5) {
                                throw dge$_fz.a(oov5);
                            }
                        }
                        bl = g_32 instanceof ha9;
                    }
                    try {
                        try {
                            try {
                                if (n == 0) break block16;
                                if (!bl) break block19;
                            }
                            catch (oov oov6) {
                                throw dge$_fz.a(oov6);
                            }
                            bl = ((ha9)g_32).lls.lez;
                            if (n == 0) break block16;
                        }
                        catch (oov oov7) {
                            throw dge$_fz.a(oov7);
                        }
                        if (bl) break block20;
                    }
                    catch (oov oov8) {
                        throw dge$_fz.a(oov8);
                    }
                }
                bl = true;
                break block16;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void mnp() {
        this.uqy = 300;
        super.mnp();
    }

    @Override
    public boolean wh3() {
        int n;
        block20: {
            block25: {
                int n2;
                block23: {
                    block24: {
                        g_3 g_32;
                        block21: {
                            block22: {
                                g_3 g_33;
                                block18: {
                                    block19: {
                                        n2 = t9d.c();
                                        g_32 = this.s0h.q4v();
                                        try {
                                            try {
                                                g_33 = g_32;
                                                if (n2 != 0) break block18;
                                                if (g_33 != null) break block19;
                                            }
                                            catch (oov oov2) {
                                                throw dge$_fz.a(oov2);
                                            }
                                            n = 0;
                                            break block20;
                                        }
                                        catch (oov oov3) {
                                            throw dge$_fz.a(oov3);
                                        }
                                    }
                                    g_33 = g_32;
                                }
                                try {
                                    try {
                                        n = g_33.gzr();
                                        if (n2 != 0) break block21;
                                        if (n != 0) break block22;
                                    }
                                    catch (oov oov4) {
                                        throw dge$_fz.a(oov4);
                                    }
                                    n = 0;
                                    break block20;
                                }
                                catch (oov oov5) {
                                    throw dge$_fz.a(oov5);
                                }
                            }
                            n = g_32 instanceof ha9;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (n2 != 0) break block23;
                                        if (n == 0) break block24;
                                    }
                                    catch (oov oov6) {
                                        throw dge$_fz.a(oov6);
                                    }
                                    n = ((ha9)g_32).lls.lez ? 1 : 0;
                                    if (n2 != 0) break block23;
                                }
                                catch (oov oov7) {
                                    throw dge$_fz.a(oov7);
                                }
                                if (n == 0) break block24;
                            }
                            catch (oov oov8) {
                                throw dge$_fz.a(oov8);
                            }
                            n = 0;
                            break block20;
                        }
                        catch (oov oov9) {
                            throw dge$_fz.a(oov9);
                        }
                    }
                    n = this.uqy = this.uqy - 1;
                }
                try {
                    if (n2 != 0) break block20;
                    if (n <= 0) break block25;
                }
                catch (oov oov10) {
                    throw dge$_fz.a(oov10);
                }
                n = 1;
                break block20;
            }
            n = 0;
        }
        return n != 0;
    }

    @Override
    public void iad() {
        this.s0h.fm3(this.s0h.q4v(), 10.0f, 10.0f);
        ((dge$ilj)this.s0h.gvh()).c1a(this.s0h.x5k, this.s0h.cry());
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

