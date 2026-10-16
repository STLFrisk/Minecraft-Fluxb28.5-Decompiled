/*
 * Decompiled with CFR 0.152.
 */
public class eel
extends e0x {
    public boolean d0y;

    public eel(p3y p3y2, boolean bl) {
        super(p3y2);
        this.d0y = bl;
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public boolean ron(m5n m5n2, mew mew2, vt2 vt22) {
        boolean bl;
        block8: {
            eel eel2;
            block6: {
                block7: {
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                eel2 = this;
                                if (n != 0) break block6;
                                if (eel2.d0y) break block7;
                            }
                            catch (oov oov2) {
                                throw eel.b(oov2);
                            }
                            if (m5n2.getBlockState(mew2).r_y() != this) break block7;
                        }
                        catch (oov oov3) {
                            throw eel.b(oov3);
                        }
                        bl = false;
                        break block8;
                    }
                    catch (oov oov4) {
                        throw eel.b(oov4);
                    }
                }
                eel2 = this;
            }
            bl = super.ron(m5n2, mew2, vt22);
        }
        return bl;
    }

    private static oov b(oov oov2) {
        return oov2;
    }
}

