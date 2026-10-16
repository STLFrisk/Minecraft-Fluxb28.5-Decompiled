/*
 * Decompiled with CFR 0.152.
 */
public class ak2
extends wel {
    public k9a k5w;
    public g_3 isn;
    private /* synthetic */ int g5v;

    public ak2(k9a k9a2) {
        super(k9a2, false);
        this.k5w = k9a2;
        this.k23(1);
    }

    @Override
    public boolean vle() {
        boolean bl;
        block25: {
            block23: {
                int n;
                block24: {
                    k9a k9a2;
                    block22: {
                        k9a k9a3;
                        block20: {
                            block21: {
                                g_3 g_32;
                                block18: {
                                    block19: {
                                        n = t9d.c();
                                        try {
                                            try {
                                                g_32 = this.k5w;
                                                if (n != 0) break block18;
                                                if (g_32.j1j()) break block19;
                                            }
                                            catch (oov oov2) {
                                                throw ak2.a(oov2);
                                            }
                                            return false;
                                        }
                                        catch (oov oov3) {
                                            throw ak2.a(oov3);
                                        }
                                    }
                                    g_32 = this.k5w.ifk();
                                }
                                k9a2 = g_32;
                                try {
                                    try {
                                        k9a3 = k9a2;
                                        if (n != 0) break block20;
                                        if (k9a3 != null) break block21;
                                    }
                                    catch (oov oov4) {
                                        throw ak2.a(oov4);
                                    }
                                    return false;
                                }
                                catch (oov oov5) {
                                    throw ak2.a(oov5);
                                }
                            }
                            this.isn = k9a2.myo();
                            k9a3 = k9a2;
                        }
                        boolean bl2 = k9a3.ii0();
                        try {
                            try {
                                bl = bl2;
                                if (n != 0) break block22;
                                if (bl == this.g5v) break block23;
                            }
                            catch (oov oov6) {
                                throw ak2.a(oov6);
                            }
                            bl = this.paa(this.isn, false);
                        }
                        catch (oov oov7) {
                            throw ak2.a(oov7);
                        }
                    }
                    try {
                        try {
                            if (n != 0) break block24;
                            if (!bl) break block23;
                        }
                        catch (oov oov8) {
                            throw ak2.a(oov8);
                        }
                        bl = this.k5w.ssb(this.isn, k9a2);
                    }
                    catch (oov oov9) {
                        throw ak2.a(oov9);
                    }
                }
                try {
                    if (n != 0) break block25;
                    if (!bl) break block23;
                }
                catch (oov oov10) {
                    throw ak2.a(oov10);
                }
                bl = true;
                break block25;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void mnp() {
        block4: {
            block5: {
                int n = t9d.c();
                this.pf7.ux8(this.isn);
                g_3 g_32 = this.k5w.ifk();
                try {
                    try {
                        if (n != 0) break block4;
                        if (g_32 == null) break block5;
                    }
                    catch (oov oov2) {
                        throw ak2.a(oov2);
                    }
                    this.g5v = g_32.ii0();
                }
                catch (oov oov3) {
                    throw ak2.a(oov3);
                }
            }
            super.mnp();
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

