/*
 * Decompiled with CFR 0.152.
 */
public class f3x$mti
extends ed7 {
    public final f3x vaa;

    public f3x$mti(f3x f3x2, c05 c052) {
        this.vaa = f3x2;
        super(c052, f3x2.dt7, f3x2.o1e, 32, f3x2.o1e - 64, 10);
        this.fai(false);
    }

    @Override
    public int getSize() {
        return l9p.o4r.size();
    }

    @Override
    public void elementClicked(int n, boolean bl, int n2, int n3) {
    }

    @Override
    public boolean isSelected(int n) {
        return false;
    }

    @Override
    public int getContentHeight() {
        return this.getSize() * 10;
    }

    @Override
    public void drawBackground() {
        this.vaa.xmz();
    }

    @Override
    public void drawSlot(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8;
        int n9;
        String string;
        owt owt2;
        f3x f3x2;
        block10: {
            block11: {
                int n10;
                int n11;
                int n12;
                String string2;
                owt owt3;
                f3x f3x3;
                _ss _ss2;
                int n13;
                block8: {
                    block9: {
                        n13 = t9d.b();
                        _ss2 = (_ss)l9p.o4r.get(n);
                        try {
                            try {
                                f3x3 = this.vaa;
                                owt3 = f3x._vs(this.vaa);
                                string2 = _ss2.xn7().rnh();
                                n12 = n2 + 2;
                                n11 = n3 + 1;
                                n10 = n % 2;
                                if (n13 == 0) break block8;
                                if (n10 != 0) break block9;
                            }
                            catch (oov oov2) {
                                throw f3x$mti.a(oov2);
                            }
                            n10 = 0xFFFFFF;
                            break block8;
                        }
                        catch (oov oov3) {
                            throw f3x$mti.a(oov3);
                        }
                    }
                    n10 = 0x909090;
                }
                f3x3.c_t(owt3, string2, n12, n11, n10);
                String string3 = _ss2.rbf(f3x.h5z(this.vaa).zgq(_ss2));
                try {
                    try {
                        f3x2 = this.vaa;
                        owt2 = f3x.lp6(this.vaa);
                        string = string3;
                        n9 = n2 + 2 + 213 - f3x.xsr(this.vaa).ezt(string3);
                        n8 = n3 + 1;
                        n7 = n % 2;
                        if (n13 == 0) break block10;
                        if (n7 != 0) break block11;
                    }
                    catch (oov oov4) {
                        throw f3x$mti.a(oov4);
                    }
                    n7 = 0xFFFFFF;
                    break block10;
                }
                catch (oov oov5) {
                    throw f3x$mti.a(oov5);
                }
            }
            n7 = 0x909090;
        }
        f3x2.c_t(owt2, string, n9, n8, n7);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

