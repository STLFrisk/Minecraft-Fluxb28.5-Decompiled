/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public class g_x$ov1 {
    private final float[] _qj = new float[4];
    private final int[] wfj = new int[4];

    public g_x$ov1() {
        this(null);
    }

    public g_x$ov1(g_x g_x2) {
    }

    public void j6m() {
        int n = 240;
        this.wfj[0] = this.wfj[0] | n;
        this.wfj[1] = this.wfj[1] | n;
        this.wfj[2] = this.wfj[2] | n;
        this.wfj[3] = this.wfj[3] | n;
        this._qj[0] = 1.0f;
        this._qj[1] = 1.0f;
        this._qj[2] = 1.0f;
        this._qj[3] = 1.0f;
    }

    public void bc6(m5n m5n2, e0x e0x2, mew mew2, vt2 vt22, float[] fArray, BitSet bitSet) {
        block52: {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            int n;
            int n2;
            float f6;
            int n3;
            float f7;
            int n4;
            float f8;
            int n5;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            int n6;
            int n7;
            int n8;
            int n9;
            block47: {
                boolean bl;
                g_x$lo3 g_x$lo3;
                int n10;
                block46: {
                    float f14;
                    boolean bl2;
                    mew mew3;
                    block44: {
                        block45: {
                            int n11;
                            block42: {
                                block51: {
                                    mew mew4;
                                    block41: {
                                        boolean bl3;
                                        block40: {
                                            boolean bl4;
                                            boolean bl5;
                                            block50: {
                                                block39: {
                                                    boolean bl6;
                                                    block38: {
                                                        boolean bl7;
                                                        block49: {
                                                            mew mew5;
                                                            block37: {
                                                                boolean bl8;
                                                                block36: {
                                                                    boolean bl9;
                                                                    block48: {
                                                                        block35: {
                                                                            boolean bl10;
                                                                            block34: {
                                                                                mew mew6;
                                                                                n10 = t9d.c();
                                                                                try {
                                                                                    mew6 = bitSet.get(0) ? mew2.offset(vt22) : mew2;
                                                                                }
                                                                                catch (oov oov2) {
                                                                                    throw g_x$ov1.a(oov2);
                                                                                }
                                                                                mew3 = mew6;
                                                                                g_x$lo3 = g_x$lo3.cnv(vt22);
                                                                                mew5 = mew3.offset(g_x$lo3.uy6[0]);
                                                                                mew4 = mew3.offset(g_x$lo3.uy6[1]);
                                                                                mew mew7 = mew3.offset(g_x$lo3.uy6[2]);
                                                                                mew mew8 = mew3.offset(g_x$lo3.uy6[3]);
                                                                                n9 = e0x2.pil(m5n2, mew5);
                                                                                n8 = e0x2.pil(m5n2, mew4);
                                                                                n7 = e0x2.pil(m5n2, mew7);
                                                                                n6 = e0x2.pil(m5n2, mew8);
                                                                                f13 = g_x.irr(m5n2.getBlockState(mew5).r_y().fpv());
                                                                                f12 = g_x.irr(m5n2.getBlockState(mew4).r_y().fpv());
                                                                                f11 = g_x.irr(m5n2.getBlockState(mew7).r_y().fpv());
                                                                                f10 = g_x.irr(m5n2.getBlockState(mew8).r_y().fpv());
                                                                                bl9 = m5n2.getBlockState(mew5.offset(vt22)).r_y().c25();
                                                                                bl5 = m5n2.getBlockState(mew4.offset(vt22)).r_y().c25();
                                                                                bl7 = m5n2.getBlockState(mew7.offset(vt22)).r_y().c25();
                                                                                bl4 = m5n2.getBlockState(mew8.offset(vt22)).r_y().c25();
                                                                                try {
                                                                                    bl10 = bl7;
                                                                                    if (n10 != 0) break block34;
                                                                                    if (bl10) break block35;
                                                                                }
                                                                                catch (oov oov3) {
                                                                                    throw g_x$ov1.a(oov3);
                                                                                }
                                                                                bl10 = bl9;
                                                                            }
                                                                            if (bl10) break block35;
                                                                            f9 = f13;
                                                                            n5 = n9;
                                                                            if (n10 == 0) break block48;
                                                                        }
                                                                        mew mew9 = mew5.offset(g_x$lo3.uy6[2]);
                                                                        f9 = g_x.irr(m5n2.getBlockState(mew9).r_y().fpv());
                                                                        n5 = e0x2.pil(m5n2, mew9);
                                                                    }
                                                                    try {
                                                                        bl8 = bl4;
                                                                        if (n10 != 0) break block36;
                                                                        if (bl8) break block37;
                                                                    }
                                                                    catch (oov oov4) {
                                                                        throw g_x$ov1.a(oov4);
                                                                    }
                                                                    bl8 = bl9;
                                                                }
                                                                if (bl8) break block37;
                                                                f8 = f13;
                                                                n4 = n9;
                                                                if (n10 == 0) break block49;
                                                            }
                                                            mew mew10 = mew5.offset(g_x$lo3.uy6[3]);
                                                            f8 = g_x.irr(m5n2.getBlockState(mew10).r_y().fpv());
                                                            n4 = e0x2.pil(m5n2, mew10);
                                                        }
                                                        try {
                                                            bl6 = bl7;
                                                            if (n10 != 0) break block38;
                                                            if (bl6) break block39;
                                                        }
                                                        catch (oov oov5) {
                                                            throw g_x$ov1.a(oov5);
                                                        }
                                                        bl6 = bl5;
                                                    }
                                                    if (bl6) break block39;
                                                    f7 = f12;
                                                    n3 = n8;
                                                    if (n10 == 0) break block50;
                                                }
                                                mew mew11 = mew4.offset(g_x$lo3.uy6[2]);
                                                f7 = g_x.irr(m5n2.getBlockState(mew11).r_y().fpv());
                                                n3 = e0x2.pil(m5n2, mew11);
                                            }
                                            try {
                                                bl3 = bl4;
                                                if (n10 != 0) break block40;
                                                if (bl3) break block41;
                                            }
                                            catch (oov oov6) {
                                                throw g_x$ov1.a(oov6);
                                            }
                                            bl3 = bl5;
                                        }
                                        if (bl3) break block41;
                                        f6 = f12;
                                        n2 = n8;
                                        if (n10 == 0) break block51;
                                    }
                                    mew mew12 = mew4.offset(g_x$lo3.uy6[3]);
                                    f6 = g_x.irr(m5n2.getBlockState(mew12).r_y().fpv());
                                    n2 = e0x2.pil(m5n2, mew12);
                                }
                                n = e0x2.pil(m5n2, mew2);
                                try {
                                    block43: {
                                        try {
                                            try {
                                                try {
                                                    n11 = bitSet.get(0);
                                                    if (n10 != 0) break block42;
                                                    if (n11 != 0) break block43;
                                                }
                                                catch (oov oov7) {
                                                    throw g_x$ov1.a(oov7);
                                                }
                                                bl2 = m5n2.getBlockState(mew2.offset(vt22)).r_y().ko5();
                                                if (n10 != 0) break block44;
                                            }
                                            catch (oov oov8) {
                                                throw g_x$ov1.a(oov8);
                                            }
                                            if (bl2) break block45;
                                        }
                                        catch (oov oov9) {
                                            throw g_x$ov1.a(oov9);
                                        }
                                    }
                                    n11 = e0x2.pil(m5n2, mew2.offset(vt22));
                                }
                                catch (oov oov10) {
                                    throw g_x$ov1.a(oov10);
                                }
                            }
                            n = n11;
                        }
                        bl2 = bitSet.get(0);
                    }
                    try {
                        f14 = bl2 ? m5n2.getBlockState(mew3).r_y().fpv() : m5n2.getBlockState(mew2).r_y().fpv();
                    }
                    catch (oov oov11) {
                        throw g_x$ov1.a(oov11);
                    }
                    f5 = f14;
                    f5 = g_x.irr(f5);
                    g_x$qru g_x$qru = g_x$qru.a6n(vt22);
                    try {
                        try {
                            bl = bitSet.get(1);
                            if (n10 != 0) break block46;
                            if (!bl) break block47;
                        }
                        catch (oov oov12) {
                            throw g_x$ov1.a(oov12);
                        }
                        bl = g_x$lo3.kxr;
                    }
                    catch (oov oov13) {
                        throw g_x$ov1.a(oov13);
                    }
                }
                if (!bl) break block47;
                f4 = (f10 + f13 + f8 + f5) * 0.25f;
                f3 = (f11 + f13 + f9 + f5) * 0.25f;
                f2 = (f11 + f12 + f7 + f5) * 0.25f;
                f = (f10 + f12 + f6 + f5) * 0.25f;
                float f15 = fArray[g_x$lo3.x6f[0].e9j] * fArray[g_x$lo3.x6f[1].e9j];
                float f16 = fArray[g_x$lo3.x6f[2].e9j] * fArray[g_x$lo3.x6f[3].e9j];
                float f17 = fArray[g_x$lo3.x6f[4].e9j] * fArray[g_x$lo3.x6f[5].e9j];
                float f18 = fArray[g_x$lo3.x6f[6].e9j] * fArray[g_x$lo3.x6f[7].e9j];
                float f19 = fArray[g_x$lo3.jpu[0].e9j] * fArray[g_x$lo3.jpu[1].e9j];
                float f20 = fArray[g_x$lo3.jpu[2].e9j] * fArray[g_x$lo3.jpu[3].e9j];
                float f21 = fArray[g_x$lo3.jpu[4].e9j] * fArray[g_x$lo3.jpu[5].e9j];
                float f22 = fArray[g_x$lo3.jpu[6].e9j] * fArray[g_x$lo3.jpu[7].e9j];
                float f23 = fArray[g_x$lo3.iot[0].e9j] * fArray[g_x$lo3.iot[1].e9j];
                float f24 = fArray[g_x$lo3.iot[2].e9j] * fArray[g_x$lo3.iot[3].e9j];
                float f25 = fArray[g_x$lo3.iot[4].e9j] * fArray[g_x$lo3.iot[5].e9j];
                float f27 = fArray[g_x$lo3.iot[6].e9j] * fArray[g_x$lo3.iot[7].e9j];
                float f28 = fArray[g_x$lo3.shb[0].e9j] * fArray[g_x$lo3.shb[1].e9j];
                float f29 = fArray[g_x$lo3.shb[2].e9j] * fArray[g_x$lo3.shb[3].e9j];
                float f30 = fArray[g_x$lo3.shb[4].e9j] * fArray[g_x$lo3.shb[5].e9j];
                float f31 = fArray[g_x$lo3.shb[6].e9j] * fArray[g_x$lo3.shb[7].e9j];
                this._qj[g_x$qru.z_i((g_x$qru)g_x$qru)] = f4 * f15 + f3 * f16 + f2 * f17 + f * f18;
                this._qj[g_x$qru._0c((g_x$qru)g_x$qru)] = f4 * f19 + f3 * f20 + f2 * f21 + f * f22;
                this._qj[g_x$qru.ojw((g_x$qru)g_x$qru)] = f4 * f23 + f3 * f24 + f2 * f25 + f * f27;
                this._qj[g_x$qru.jim((g_x$qru)g_x$qru)] = f4 * f28 + f3 * f29 + f2 * f30 + f * f31;
                int n12 = this.k6d(n6, n9, n4, n);
                int n13 = this.k6d(n7, n9, n5, n);
                int n14 = this.k6d(n7, n8, n3, n);
                int n15 = this.k6d(n6, n8, n2, n);
                this.wfj[g_x$qru.z_i((g_x$qru)g_x$qru)] = this.llk(n12, n13, n14, n15, f15, f16, f17, f18);
                this.wfj[g_x$qru._0c((g_x$qru)g_x$qru)] = this.llk(n12, n13, n14, n15, f19, f20, f21, f22);
                this.wfj[g_x$qru.ojw((g_x$qru)g_x$qru)] = this.llk(n12, n13, n14, n15, f23, f24, f25, f27);
                this.wfj[g_x$qru.jim((g_x$qru)g_x$qru)] = this.llk(n12, n13, n14, n15, f28, f29, f30, f31);
                if (n10 == 0) break block52;
            }
            f4 = (f10 + f13 + f8 + f5) * 0.25f;
            f3 = (f11 + f13 + f9 + f5) * 0.25f;
            f2 = (f11 + f12 + f7 + f5) * 0.25f;
            f = (f10 + f12 + f6 + f5) * 0.25f;
            this.wfj[g_x$qru.z_i((g_x$qru)g_x$qru)] = this.k6d(n6, n9, n4, n);
            this.wfj[g_x$qru._0c((g_x$qru)g_x$qru)] = this.k6d(n7, n9, n5, n);
            this.wfj[g_x$qru.ojw((g_x$qru)g_x$qru)] = this.k6d(n7, n8, n3, n);
            this.wfj[g_x$qru.jim((g_x$qru)g_x$qru)] = this.k6d(n6, n8, n2, n);
            this._qj[g_x$qru.z_i((g_x$qru)g_x$qru)] = f4;
            this._qj[g_x$qru._0c((g_x$qru)g_x$qru)] = f3;
            this._qj[g_x$qru.ojw((g_x$qru)g_x$qru)] = f2;
            this._qj[g_x$qru.jim((g_x$qru)g_x$qru)] = f;
        }
    }

    private int k6d(int n, int n2, int n3, int n4) {
        int n5;
        block10: {
            block11: {
                int n6;
                block8: {
                    block9: {
                        block6: {
                            block7: {
                                n6 = t9d.b();
                                try {
                                    n5 = n;
                                    if (n6 == 0) break block6;
                                    if (n5 != 0) break block7;
                                }
                                catch (oov oov2) {
                                    throw g_x$ov1.a(oov2);
                                }
                                n = n4;
                            }
                            n5 = n2;
                        }
                        try {
                            if (n6 == 0) break block8;
                            if (n5 != 0) break block9;
                        }
                        catch (oov oov3) {
                            throw g_x$ov1.a(oov3);
                        }
                        n2 = n4;
                    }
                    n5 = n3;
                }
                try {
                    if (n6 == 0) break block10;
                    if (n5 != 0) break block11;
                }
                catch (oov oov4) {
                    throw g_x$ov1.a(oov4);
                }
                n3 = n4;
            }
            n5 = n + n2 + n3 + n4 >> 2 & 0xFF00FF;
        }
        return n5;
    }

    private int llk(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        int n5 = (int)((float)(n >> 16 & 0xFF) * f + (float)(n2 >> 16 & 0xFF) * f2 + (float)(n3 >> 16 & 0xFF) * f3 + (float)(n4 >> 16 & 0xFF) * f4) & 0xFF;
        int n6 = (int)((float)(n & 0xFF) * f + (float)(n2 & 0xFF) * f2 + (float)(n3 & 0xFF) * f3 + (float)(n4 & 0xFF) * f4) & 0xFF;
        return n5 << 16 | n6;
    }

    public static int[] l46(g_x$ov1 g_x$ov1) {
        return g_x$ov1.wfj;
    }

    public static float[] n8x(g_x$ov1 g_x$ov1) {
        return g_x$ov1._qj;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

