/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class bm4 {
    private static final /* synthetic */ IntBuffer qjv;
    private static final /* synthetic */ FloatBuffer dd2;
    private static final /* synthetic */ FloatBuffer m23;
    private static final /* synthetic */ FloatBuffer zhn;
    private static /* synthetic */ fqr oje;
    private static /* synthetic */ float ce8;
    private static /* synthetic */ float osy;
    private static /* synthetic */ float o7b;
    private static /* synthetic */ float vdt;
    private static /* synthetic */ float yie;

    public static void biq(ha9 ha92, boolean bl) {
        hzu.i56(2982, dd2);
        hzu.i56(2983, m23);
        GL11.glGetInteger((int)2978, (IntBuffer)qjv);
        float f = (qjv.get(0) + qjv.get(2)) / 2;
        int n = t9d.b();
        float f2 = (qjv.get(1) + qjv.get(3)) / 2;
        GLU.gluUnProject((float)f, (float)f2, (float)0.0f, (FloatBuffer)dd2, (FloatBuffer)m23, (IntBuffer)qjv, (FloatBuffer)zhn);
        int n2 = n;
        oje = new fqr(zhn.get(0), zhn.get(1), zhn.get(2));
        int n3 = bl;
        if (n2 != 0) {
            n3 = n3 != 0 ? 1 : 0;
        }
        int n4 = n3;
        float f3 = ha92.y2i;
        float f4 = ha92.x5k;
        ce8 = fe6.ssk(f4 * (float)Math.PI / 180.0f) * (float)(1 - n4 * 2);
        o7b = fe6.rtn(f4 * (float)Math.PI / 180.0f) * (float)(1 - n4 * 2);
        vdt = -o7b * fe6.rtn(f3 * (float)Math.PI / 180.0f) * (float)(1 - n4 * 2);
        yie = ce8 * fe6.rtn(f3 * (float)Math.PI / 180.0f) * (float)(1 - n4 * 2);
        osy = fe6.ssk(f3 * (float)Math.PI / 180.0f);
    }

    public static fqr fqa(i2h i2h2, double d) {
        double d2 = i2h2.bc1 + (i2h2.o2v - i2h2.bc1) * d;
        double d3 = i2h2.o_z + (i2h2.kfp - i2h2.o_z) * d;
        double d4 = i2h2.a4d + (i2h2.vbd - i2h2.a4d) * d;
        double d5 = d2 + bm4.oje.lvi;
        double d6 = d3 + bm4.oje.gn5;
        double d7 = d4 + bm4.oje.bn2;
        return new fqr(d5, d6, d7);
    }

    public static e0x te3(t9d t9d2, i2h i2h2, float f) {
        e0x e0x2;
        block5: {
            e0x e0x3;
            block6: {
                float f2;
                int n;
                float f3;
                mew mew2;
                fqr fqr2;
                block7: {
                    block8: {
                        fqr2 = bm4.fqa(i2h2, f);
                        mew2 = new mew(fqr2);
                        zfz zfz2 = t9d2.getBlockState(mew2);
                        e0x3 = zfz2.r_y();
                        int n2 = t9d.b();
                        try {
                            e0x2 = e0x3;
                            if (n2 == 0) break block5;
                            if (!e0x2.p1r().l7j()) break block6;
                        }
                        catch (oov oov2) {
                            throw bm4.a(oov2);
                        }
                        f3 = 0.0f;
                        try {
                            n = zfz2.r_y() instanceof hmv;
                            if (n2 == 0) break block7;
                            if (n == 0) break block8;
                        }
                        catch (oov oov3) {
                            throw bm4.a(oov3);
                        }
                        f3 = hmv.jou((Integer)zfz2.dil(hmv.nfg)) - 0.11111111f;
                    }
                    n = mew2.getY() + 1;
                }
                if (fqr2.gn5 >= (double)(f2 = (float)n - f3)) {
                    e0x3 = t9d2.getBlockState(mew2.nuv()).r_y();
                }
            }
            e0x2 = e0x3;
        }
        return e0x2;
    }

    public static fqr g62() {
        return oje;
    }

    public static float peb() {
        return ce8;
    }

    public static float g8n() {
        return osy;
    }

    public static float _t6() {
        return o7b;
    }

    public static float jcu() {
        return vdt;
    }

    public static float oz4() {
        return yie;
    }

    static {
        qjv = nkx._5e(16);
        dd2 = nkx.dyc(16);
        m23 = nkx.dyc(16);
        zhn = nkx.dyc(3);
        oje = new fqr(0.0, 0.0, 0.0);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

