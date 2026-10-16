/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import net.minecraft.tileentity.TileEntityEnchantmentTable;

public class asg
extends rw8 {
    public asg() {
        super(p3y.zs8, _mi.v0s);
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
        this.opa(0);
        this.i3l(uja.qqf);
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public void kyo(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        super.kyo(t9d2, mew2, zfz2, random);
        int n = -2;
        int n2 = t9d.c();
        block22: while (true) {
            int n3 = n;
            int n4 = 2;
            block23: while (n3 <= n4) {
                int n5 = -2;
                while (n5 <= 2) {
                    block31: {
                        block30: {
                            int n6;
                            block29: {
                                int n7;
                                block27: {
                                    block28: {
                                        try {
                                            n7 = n;
                                            if (n2 != 0) break block27;
                                            n4 = -2;
                                            if (n2 != 0) continue block23;
                                        }
                                        catch (oov oov2) {
                                            throw asg.a(oov2);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n7 <= n4) break block28;
                                                        n7 = n;
                                                        if (n2 != 0) break block27;
                                                    }
                                                    catch (oov oov3) {
                                                        throw asg.a(oov3);
                                                    }
                                                    if (n7 >= 2) break block28;
                                                }
                                                catch (oov oov4) {
                                                    throw asg.a(oov4);
                                                }
                                                n7 = n5;
                                                if (n2 != 0) break block27;
                                            }
                                            catch (oov oov5) {
                                                throw asg.a(oov5);
                                            }
                                            if (n7 != -1) break block28;
                                        }
                                        catch (oov oov6) {
                                            throw asg.a(oov6);
                                        }
                                        n5 = 2;
                                    }
                                    n7 = random.nextInt(16);
                                }
                                try {
                                    if (n2 != 0) break block29;
                                    if (n7 != 0) break block30;
                                }
                                catch (oov oov7) {
                                    throw asg.a(oov7);
                                }
                                n7 = n6 = 0;
                            }
                            while (n6 <= 1) {
                                block32: {
                                    block33: {
                                        t9d t9d3;
                                        block34: {
                                            mew mew3 = mew2.ec4(n, n6, n5);
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (n2 != 0) break block31;
                                                                if (n2 != 0) break block32;
                                                            }
                                                            catch (oov oov8) {
                                                                throw asg.a(oov8);
                                                            }
                                                            if (t9d2.getBlockState(mew3).r_y() != ox_.kzr) break block33;
                                                        }
                                                        catch (oov oov9) {
                                                            throw asg.a(oov9);
                                                        }
                                                        t9d3 = t9d2;
                                                        if (n2 != 0) break block34;
                                                    }
                                                    catch (oov oov10) {
                                                        throw asg.a(oov10);
                                                    }
                                                    if (!t9d3.isAirBlock(mew2.ec4(n / 2, 0, n5 / 2))) {
                                                        break;
                                                    }
                                                }
                                                catch (oov oov11) {
                                                    throw asg.a(oov11);
                                                }
                                            }
                                            catch (oov oov12) {
                                                throw asg.a(oov12);
                                            }
                                            t9d3 = t9d2;
                                        }
                                        t9d3.zvy(w_0.ygx, (double)mew2.getX() + 0.5, (double)mew2.getY() + 2.0, (double)mew2.getZ() + 0.5, (double)((float)n + random.nextFloat()) - 0.5, (float)n6 - random.nextFloat() - 1.0f, (double)((float)n5 + random.nextFloat()) - 0.5, new int[0]);
                                    }
                                    ++n6;
                                }
                                if (n2 == 0) continue;
                            }
                        }
                        ++n5;
                    }
                    if (n2 == 0) continue;
                }
                ++n;
                if (n2 == 0) continue block22;
            }
            break;
        }
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public int kfj() {
        return 3;
    }

    @Override
    public pyk ie9(t9d t9d2, int n) {
        return new TileEntityEnchantmentTable();
    }

    @Override
    public boolean cl2(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92, vt2 vt22, float f, float f2, float f3) {
        boolean bl;
        block10: {
            block11: {
                t9d t9d3;
                int n;
                block8: {
                    block9: {
                        n = t9d.c();
                        try {
                            try {
                                t9d3 = t9d2;
                                if (n != 0) break block8;
                                if (!t9d3.v0f) break block9;
                            }
                            catch (oov oov2) {
                                throw asg.a(oov2);
                            }
                            return true;
                        }
                        catch (oov oov3) {
                            throw asg.a(oov3);
                        }
                    }
                    t9d3 = t9d2;
                }
                pyk pyk2 = t9d3.getTileEntity(mew2);
                try {
                    try {
                        bl = pyk2 instanceof TileEntityEnchantmentTable;
                        if (n != 0) break block10;
                        if (!bl) break block11;
                    }
                    catch (oov oov4) {
                        throw asg.a(oov4);
                    }
                    ha92.xz_((TileEntityEnchantmentTable)pyk2);
                }
                catch (oov oov5) {
                    throw asg.a(oov5);
                }
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public void qh0(t9d t9d2, mew mew2, zfz zfz2, g_3 g_32, erg erg2) {
        block6: {
            int n = t9d.c();
            super.qh0(t9d2, mew2, zfz2, g_32, erg2);
            if (erg2.x4w()) {
                pyk pyk2;
                block5: {
                    pyk pyk3 = t9d2.getTileEntity(mew2);
                    try {
                        try {
                            pyk2 = pyk3;
                            if (n != 0) break block5;
                            if (!(pyk2 instanceof TileEntityEnchantmentTable)) break block6;
                        }
                        catch (oov oov2) {
                            throw asg.a(oov2);
                        }
                        pyk2 = pyk3;
                    }
                    catch (oov oov3) {
                        throw asg.a(oov3);
                    }
                }
                ((TileEntityEnchantmentTable)pyk2).nai(erg2.zow());
            }
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

