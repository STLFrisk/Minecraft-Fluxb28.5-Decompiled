/*
 * Decompiled with CFR 0.152.
 */
public final class et9$1
implements Runnable {
    public final mz2 ou4;
    public final yw3 fan;

    public et9$1(mz2 mz22, yw3 yw32) {
        this.ou4 = mz22;
        this.fan = yw32;
    }

    @Override
    public void run() {
        et9.adc(this.ou4);
        this.ou4.ito(this.fan);
    }
}

