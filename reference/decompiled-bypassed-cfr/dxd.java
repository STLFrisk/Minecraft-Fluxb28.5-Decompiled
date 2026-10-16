/*
 * Decompiled with CFR 0.152.
 */
public abstract class dxd
extends ed7 {
    public dxd(c05 c052, int n, int n2, int n3, int n4, int n5) {
        super(c052, n, n2, n3, n4, n5);
    }

    @Override
    public void elementClicked(int n, boolean bl, int n2, int n3) {
    }

    @Override
    public boolean isSelected(int n) {
        return false;
    }

    @Override
    public void drawBackground() {
    }

    @Override
    public void drawSlot(int n, int n2, int n3, int n4, int n5, int n6) {
        boolean bl;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        dxd$v9l dxd$v9l;
        block4: {
            block5: {
                int n14 = t9d.c();
                try {
                    try {
                        dxd$v9l = this.jb4(n);
                        int n7 = n;
                        n7 = n2;
                        n7 = n3;
                        n7 = this.getListWidth();
                        n7 = n4;
                        n7 = n5;
                        n7 = n6;
                        bl = this.dwe(n5, n6);
                        if (n14 != 0) break block4;
                        if (bl != n) break block5;
                    }
                    catch (oov oov2) {
                        throw dxd.a(oov2);
                    }
                    bl = true;
                    break block4;
                }
                catch (oov oov3) {
                    throw dxd.a(oov3);
                }
            }
            bl = false;
        }
        dxd$v9l.is9(n13, n12, n11, n10, n9, n8, n7, bl);
    }

    @Override
    public void dm2(int n, int n2, int n3) {
        this.jb4(n)._at(n, n2, n3);
    }

    public boolean dsd(int n, int n2, int n3) {
        int n4;
        block8: {
            block9: {
                int n5 = t9d.c();
                try {
                    n4 = this.gti(n2);
                    if (n5 != 0) break block8;
                    if (n4 == 0) break block9;
                }
                catch (oov oov2) {
                    throw dxd.a(oov2);
                }
                int n6 = this.dwe(n, n2);
                try {
                    n4 = n6;
                    if (n5 != 0) break block8;
                    if (n4 < 0) break block9;
                }
                catch (oov oov3) {
                    throw dxd.a(oov3);
                }
                int n7 = this.ytt + this.wde / 2 - this.getListWidth() / 2 + 2;
                int n8 = this.vem + 4 - this.hc1() + n6 * this.qc1 + this.vrd;
                int n9 = n - n7;
                int n10 = n2 - n8;
                try {
                    try {
                        n4 = this.jb4(n6).r6b(n6, n, n2, n3, n9, n10) ? 1 : 0;
                        if (n5 != 0) break block8;
                        if (n4 == 0) break block9;
                    }
                    catch (oov oov4) {
                        throw dxd.a(oov4);
                    }
                    this.m9t(false);
                    return true;
                }
                catch (oov oov5) {
                    throw dxd.a(oov5);
                }
            }
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean qsz(int n, int n2, int n3) {
        block4: {
            int n4 = t9d.b();
            for (int i = 0; i < this.getSize(); ++i) {
                int n5 = this.ytt + this.wde / 2 - this.getListWidth() / 2 + 2;
                int n6 = this.vem + 4 - this.hc1() + i * this.qc1 + this.vrd;
                int n7 = n - n5;
                int n8 = n2 - n6;
                try {
                    this.jb4(i).l_a(i, n, n2, n3, n7, n8);
                    if (n4 != 0) {
                        if (n4 != 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw dxd.a(oov2);
                }
            }
            this.m9t(true);
        }
        return false;
    }

    public abstract dxd$v9l jb4(int var1);

    private static oov a(oov oov2) {
        return oov2;
    }
}

