/*
 * Decompiled with CFR 0.152.
 */
public class esx$niw
extends esx {
    public esx$niw() {
        this.y8l(this._8_.c32().zvi(t4h, Integer.valueOf(0)));
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        block4: {
            int n = t9d.b();
            try {
                boolean bl;
                try {
                    bl = t9d2.getBlockState(mew2.eve()).r_y().p1r().gk6();
                    if (n == 0 || bl) break block4;
                }
                catch (oov oov2) {
                    throw esx$niw.b(oov2);
                }
                this.lf0(t9d2, mew2, zfz2, 0);
                bl = t9d2.i6x(mew2);
            }
            catch (oov oov3) {
                throw esx$niw.b(oov3);
            }
        }
        super.z3l(t9d2, mew2, zfz2, e0x2);
    }

    @Override
    public zfz kig(int n) {
        return this.l4i().zvi(t4h, Integer.valueOf(n));
    }

    @Override
    public int hvp(zfz zfz2) {
        return (Integer)zfz2.dil(t4h);
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{t4h});
    }

    private static oov b(oov oov2) {
        return oov2;
    }
}

