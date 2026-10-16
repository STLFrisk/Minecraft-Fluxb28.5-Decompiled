/*
 * Decompiled with CFR 0.152.
 */
public class c0c
extends ttt {
    public c0c(long l, ttt ttt2) {
        super(l);
        this.ty5 = ttt2;
    }

    @Override
    public int[] ub9(int n, int n2, int n3, int n4) {
        int n5 = n - 1;
        int n6 = n2 - 1;
        int n7 = n3 + 2;
        int n8 = n4 + 2;
        int n9 = t9d.b();
        int[] nArray = this.ty5.ub9(n5, n6, n7, n8);
        int[] nArray2 = z97.web(n3 * n4);
        int n10 = 0;
        block16: while (true) {
            int n11 = n10;
            block17: while (n11 < n4) {
                int n12 = 0;
                while (n12 < n3) {
                    block20: {
                        block21: {
                            int n13;
                            block25: {
                                block24: {
                                    int n14;
                                    block23: {
                                        int n15;
                                        block22: {
                                            int n16 = nArray[n12 + 1 + (n10 + 1 - 1) * (n3 + 2)];
                                            int n17 = nArray[n12 + 1 + 1 + (n10 + 1) * (n3 + 2)];
                                            n15 = nArray[n12 + 1 - 1 + (n10 + 1) * (n3 + 2)];
                                            n14 = nArray[n12 + 1 + (n10 + 1 + 1) * (n3 + 2)];
                                            int n18 = nArray[n12 + 1 + (n10 + 1) * n7];
                                            try {
                                                nArray2[n12 + n10 * n3] = n18;
                                                this.drx(n12 + n, n10 + n2);
                                                if (n9 == 0) break block20;
                                                n11 = n18;
                                                if (n9 == 0) continue block17;
                                            }
                                            catch (oov oov2) {
                                                throw c0c.a(oov2);
                                            }
                                            try {
                                                try {
                                                    if (n11 != 0) break block21;
                                                    n13 = n16;
                                                    if (n9 == 0) break block22;
                                                }
                                                catch (oov oov3) {
                                                    throw c0c.a(oov3);
                                                }
                                                if (n13 != 0) break block21;
                                            }
                                            catch (oov oov4) {
                                                throw c0c.a(oov4);
                                            }
                                            n13 = n17;
                                        }
                                        try {
                                            if (n9 == 0) break block23;
                                            if (n13 != 0) break block21;
                                        }
                                        catch (oov oov5) {
                                            throw c0c.a(oov5);
                                        }
                                        n13 = n15;
                                    }
                                    try {
                                        if (n9 == 0) break block24;
                                        if (n13 != 0) break block21;
                                    }
                                    catch (oov oov6) {
                                        throw c0c.a(oov6);
                                    }
                                    n13 = n14;
                                }
                                try {
                                    try {
                                        if (n9 == 0) break block25;
                                        if (n13 != 0) break block21;
                                    }
                                    catch (oov oov7) {
                                        throw c0c.a(oov7);
                                    }
                                    n13 = this.nbt(2);
                                }
                                catch (oov oov8) {
                                    throw c0c.a(oov8);
                                }
                            }
                            try {
                                if (n13 == 0) {
                                    nArray2[n12 + n10 * n3] = 1;
                                }
                            }
                            catch (oov oov9) {
                                throw c0c.a(oov9);
                            }
                        }
                        ++n12;
                    }
                    if (n9 != 0) continue;
                }
                ++n10;
                if (n9 != 0) continue block16;
            }
            break;
        }
        return nArray2;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

