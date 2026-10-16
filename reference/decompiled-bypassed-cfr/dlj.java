/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.Set;

public class dlj
extends arf {
    private static final Set ga2 = Sets.newHashSet((Object[])new e0x[]{ox_.wb7, ox_.kzr, ox_.uom, ox_.a4y, ox_.cug, ox_.jzx, ox_.pj4, ox_.gdb, ox_.h49});

    public dlj(u7m$vz9 u7m$vz9) {
        super(3.0f, u7m$vz9, ga2);
    }

    @Override
    public float v1f(erg erg2, e0x e0x2) {
        float f;
        block13: {
            block11: {
                p3y p3y2;
                p3y p3y3;
                block12: {
                    int n;
                    block10: {
                        n = t9d.b();
                        try {
                            try {
                                p3y3 = e0x2.p1r();
                                p3y2 = p3y.fdu;
                                if (n == 0) break block10;
                                if (p3y3 == p3y2) break block11;
                            }
                            catch (oov oov2) {
                                throw dlj.b(oov2);
                            }
                            p3y3 = e0x2.p1r();
                            p3y2 = p3y.nc7;
                        }
                        catch (oov oov3) {
                            throw dlj.b(oov3);
                        }
                    }
                    try {
                        try {
                            if (n == 0) break block12;
                            if (p3y3 == p3y2) break block11;
                        }
                        catch (oov oov4) {
                            throw dlj.b(oov4);
                        }
                        p3y3 = e0x2.p1r();
                        p3y2 = p3y.wui;
                    }
                    catch (oov oov5) {
                        throw dlj.b(oov5);
                    }
                }
                try {
                    if (p3y3 == p3y2) break block11;
                    f = super.v1f(erg2, e0x2);
                    break block13;
                }
                catch (oov oov6) {
                    throw dlj.b(oov6);
                }
            }
            f = this.qng;
        }
        return f;
    }

    private static oov b(oov oov2) {
        return oov2;
    }
}

