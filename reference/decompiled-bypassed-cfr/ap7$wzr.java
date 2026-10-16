/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class ap7$wzr
implements sjk {
    private final q2m qxr;
    private final gdz bnw;
    private final List ilz;
    public final ap7 dzc;

    public ap7$wzr(ap7 ap72, q2m q2m2) {
        block13: {
            block11: {
                ap7$wzr ap7$wzr;
                block12: {
                    hv2 hv22;
                    block9: {
                        this.dzc = ap72;
                        int n = t9d.b();
                        this.qxr = q2m2;
                        int n2 = n;
                        this.ilz = Lists.newArrayList();
                        for (String string : q2m2.vsw()) {
                            block10: {
                                hv2 hv23 = c05.vz1().c02().cj2(string);
                                try {
                                    try {
                                        hv22 = hv23;
                                        if (n2 == 0) break block9;
                                        if (hv22 == null) break block10;
                                    }
                                    catch (oov oov2) {
                                        throw ap7$wzr.a(oov2);
                                    }
                                    this.ilz.add(hv23);
                                }
                                catch (oov oov3) {
                                    throw ap7$wzr.a(oov3);
                                }
                            }
                            if (n2 != 0) continue;
                        }
                        try {
                            try {
                                ap7$wzr = this;
                                if (n2 == 0) break block11;
                                if (ap7$wzr.ilz.isEmpty()) break block12;
                            }
                            catch (oov oov4) {
                                throw ap7$wzr.a(oov4);
                            }
                            hv22 = (hv2)this.ilz.get(new Random().nextInt(this.ilz.size()));
                        }
                        catch (oov oov5) {
                            throw ap7$wzr.a(oov5);
                        }
                    }
                    String string = hv22.pbs().getName();
                    this.bnw = x0l.to8(string);
                    x0l.m1h(this.bnw, string);
                    break block13;
                }
                ap7$wzr = this;
            }
            ap7$wzr.bnw = wip.s_2();
        }
    }

    @Override
    public void z9x(al9 al92) {
        al92.rg3(new gjy(this.ilz));
    }

    @Override
    public ekw s34() {
        return new tao(this.qxr.m6i());
    }

    @Override
    public void b6x(float f, int n) {
        block9: {
            int n2;
            int n3;
            block8: {
                int n4;
                block6: {
                    block7: {
                        n3 = -1;
                        String string = owt.pkg(this.qxr.wyj());
                        n4 = t9d.c();
                        try {
                            n2 = string.length();
                            if (n4 != 0) break block6;
                            if (n2 < 2) break block7;
                        }
                        catch (oov oov2) {
                            throw ap7$wzr.a(oov2);
                        }
                        n3 = c05.vz1().tx1.squ(string.charAt(1));
                    }
                    n2 = n3;
                }
                try {
                    try {
                        if (n4 != 0) break block8;
                        if (n2 < 0) break block9;
                    }
                    catch (oov oov3) {
                        throw ap7$wzr.a(oov3);
                    }
                    n2 = n3 >> 16 & 0xFF;
                }
                catch (oov oov4) {
                    throw ap7$wzr.a(oov4);
                }
            }
            float f2 = (float)n2 / 255.0f;
            float f3 = (float)(n3 >> 8 & 0xFF) / 255.0f;
            float f4 = (float)(n3 & 0xFF) / 255.0f;
            b0t.df9(1.0f, 1.0f, 15.0f, 15.0f, fe6.__u(f2 * f, f3 * f, f4 * f) | n << 24);
        }
        c05.vz1().l22().anl(this.bnw);
        hzu.wn0(f, f, f, (float)n / 255.0f);
        b0t.oc3(2.0f, 2.0f, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        b0t.oc3(2.0f, 2.0f, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
    }

    @Override
    public boolean v4p() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    bl = this.ilz.isEmpty();
                    if (n != 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw ap7$wzr.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

