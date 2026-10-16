/*
 * Decompiled with CFR 0.152.
 */
public class cf_
extends ym7 {
    public cf_(hr_ hr_2) {
        super(hr_2);
    }

    public void n3a(wpl wpl2, float f, zfz zfz2) {
        try {
            super.zea(wpl2, f, zfz2);
            if (zfz2.r_y() == ox_.jvm) {
                rhy.dtk(wpl2.inv(), wpl2.o2v, wpl2.kfp, wpl2.vbd, f);
            }
        }
        catch (oov oov2) {
            throw cf_.a(oov2);
        }
    }

    @Override
    public void zea(_f3 _f32, float f, zfz zfz2) {
        this.n3a((wpl)_f32, f, zfz2);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

