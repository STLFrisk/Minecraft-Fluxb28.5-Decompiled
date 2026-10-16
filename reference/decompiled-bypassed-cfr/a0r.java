/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.tileentity.TileEntityFurnace;

public class a0r
extends vrx {
    public a0r(rsi rsi2, int n, int n2, int n3) {
        super(rsi2, n, n2, n3);
    }

    @Override
    public boolean xvl(erg erg2) {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    int n = t9d.b();
                    try {
                        try {
                            try {
                                bl = TileEntityFurnace.wlb(erg2);
                                if (n == 0) break block6;
                                if (bl) break block7;
                            }
                            catch (oov oov2) {
                                throw a0r.a(oov2);
                            }
                            bl = a0r.zeg(erg2);
                            if (n == 0) break block6;
                        }
                        catch (oov oov3) {
                            throw a0r.a(oov3);
                        }
                        if (!bl) break block8;
                    }
                    catch (oov oov4) {
                        throw a0r.a(oov4);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public int n29(erg erg2) {
        int n;
        block2: {
            block3: {
                int n2 = t9d.c();
                try {
                    n = a0r.zeg(erg2);
                    if (n2 != 0) break block2;
                    if (n == 0) break block3;
                }
                catch (oov oov2) {
                    throw a0r.a(oov2);
                }
                n = 1;
                break block2;
            }
            n = super.n29(erg2);
        }
        return n;
    }

    public static boolean zeg(erg erg2) {
        boolean bl;
        block11: {
            block9: {
                u7m u7m2;
                block10: {
                    erg erg3;
                    int n;
                    block8: {
                        n = t9d.b();
                        try {
                            erg3 = erg2;
                            if (n == 0) break block8;
                            if (erg3 == null) break block9;
                        }
                        catch (oov oov2) {
                            throw a0r.a(oov2);
                        }
                        erg3 = erg2;
                    }
                    try {
                        try {
                            u7m2 = erg3.gn1();
                            if (n == 0) break block10;
                            if (u7m2 == null) break block9;
                        }
                        catch (oov oov3) {
                            throw a0r.a(oov3);
                        }
                        u7m2 = erg2.gn1();
                    }
                    catch (oov oov4) {
                        throw a0r.a(oov4);
                    }
                }
                try {
                    if (u7m2 != xbr.xxz) break block9;
                    bl = true;
                    break block11;
                }
                catch (oov oov5) {
                    throw a0r.a(oov5);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

