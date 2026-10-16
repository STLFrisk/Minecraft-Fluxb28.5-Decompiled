/*
 * Decompiled with CFR 0.152.
 */
public class eij {
    public float ikn;
    public float z7o;

    public eij(float f, float f2) {
        this.ikn = f;
        this.z7o = f2;
    }

    public float r8p() {
        return this.ikn;
    }

    public float jqw() {
        return this.z7o;
    }

    public void k6h(ha9 ha92) {
        eij eij2;
        block10: {
            block11: {
                block9: {
                    boolean bl;
                    block8: {
                        int n = t9d.b();
                        try {
                            try {
                                try {
                                    bl = Float.isNaN(this.ikn);
                                    if (n == 0) break block8;
                                    if (bl) break block9;
                                }
                                catch (oov oov2) {
                                    throw eij.a(oov2);
                                }
                                eij2 = this;
                                if (n == 0) break block10;
                            }
                            catch (oov oov3) {
                                throw eij.a(oov3);
                            }
                            bl = Float.isNaN(eij2.z7o);
                        }
                        catch (oov oov4) {
                            throw eij.a(oov4);
                        }
                    }
                    if (!bl) break block11;
                }
                return;
            }
            eij2 = this;
        }
        eij2.eft(Float.valueOf(c05.vz1().oxn.igw));
        ha92.x5k = this.ikn;
        ha92.y2i = this.z7o;
    }

    public void eft(Float f) {
        float f2 = f.floatValue() * 0.6f + 0.2f;
        float f3 = f2 * f2 * f2 * 1.2f;
        this.ikn -= this.ikn % f3;
        this.z7o -= this.z7o % f3;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

