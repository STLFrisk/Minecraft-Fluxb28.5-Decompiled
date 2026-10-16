/*
 * Decompiled with CFR 0.152.
 */
public class dul
implements sdf {
    private final /* synthetic */ t9d qjs;
    private final /* synthetic */ mew v1b;

    public dul(t9d t9d2, mew mew2) {
        this.qjs = t9d2;
        this.v1b = mew2;
    }

    @Override
    public t9d acz() {
        return this.qjs;
    }

    @Override
    public double tai() {
        return (double)this.v1b.getX() + 0.5;
    }

    @Override
    public double q_1() {
        return (double)this.v1b.getY() + 0.5;
    }

    @Override
    public double wgy() {
        return (double)this.v1b.getZ() + 0.5;
    }

    @Override
    public mew taq() {
        return this.v1b;
    }

    @Override
    public int lcq() {
        zfz zfz2 = this.qjs.getBlockState(this.v1b);
        return zfz2.r_y().hvp(zfz2);
    }

    @Override
    public pyk ztz() {
        return this.qjs.getTileEntity(this.v1b);
    }
}

