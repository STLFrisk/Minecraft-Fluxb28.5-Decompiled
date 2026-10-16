/*
 * Decompiled with CFR 0.152.
 */
public class fni
extends j0j {
    public cdu yl_ = new ork(ox_.p5a);

    @Override
    public void nvi(gyu gyu2) {
        block10: {
            int n;
            block9: {
                int n2;
                block7: {
                    block8: {
                        n2 = t9d.b();
                        try {
                            this.mbd();
                            n = this.rsu.nextInt(5);
                            if (n2 == 0) break block7;
                            if (n != 0) break block8;
                        }
                        catch (oov oov2) {
                            throw fni.a(oov2);
                        }
                        int n3 = this.rsu.nextInt(16) + 8;
                        int n4 = this.rsu.nextInt(16) + 8;
                        this.yl_.v3g(this.noy, this.rsu, this.noy.pnv(this.n_g.ec4(n3, 0, n4)));
                    }
                    n = this.n_g.getX();
                }
                try {
                    try {
                        if (n2 == 0) break block9;
                        if (n != 0) break block10;
                    }
                    catch (oov oov3) {
                        throw fni.a(oov3);
                    }
                    n = this.n_g.getZ();
                }
                catch (oov oov4) {
                    throw fni.a(oov4);
                }
            }
            if (n == 0) {
                fcs fcs2 = new fcs(this.noy);
                fcs2.x24(0.0, 128.0, 0.0, this.rsu.nextFloat() * 360.0f, 0.0f);
                this.noy.xzq(fcs2);
            }
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

