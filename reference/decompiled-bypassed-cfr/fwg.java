/*
 * Decompiled with CFR 0.152.
 */
public class fwg
extends ttt {
    public fwg(long l, ttt ttt2) {
        super(l);
        this.ty5 = ttt2;
    }

    @Override
    public int[] ub9(int n, int n2, int n3, int n4) {
        int[] nArray;
        block11: {
            int n5;
            int n6;
            int n7;
            int[] nArray2;
            int n8;
            block9: {
                int n9 = n >> 1;
                int n10 = n2 >> 1;
                int n11 = (n3 >> 1) + 2;
                int n12 = (n4 >> 1) + 2;
                int[] nArray3 = this.ty5.ub9(n9, n10, n11, n12);
                n8 = n11 - 1 << 1;
                int n13 = n12 - 1 << 1;
                nArray2 = z97.web(n8 * n13);
                n7 = t9d.b();
                int n14 = 0;
                while (n14 < n12 - 1) {
                    block10: {
                        int n15;
                        n6 = (n14 << 1) * n8;
                        int n16 = nArray3[n15 + 0 + (n14 + 0) * n11];
                        n5 = nArray3[n15 + 0 + (n14 + 1) * n11];
                        if (n7 == 0) break block9;
                        int n17 = n5;
                        for (n15 = 0; n15 < n11 - 1; ++n15) {
                            this.drx(n15 + n9 << 1, n14 + n10 << 1);
                            int n18 = nArray3[n15 + 1 + (n14 + 0) * n11];
                            int n19 = nArray3[n15 + 1 + (n14 + 1) * n11];
                            nArray2[n6] = n16;
                            nArray2[n6++ + n8] = this.c5u(n16, n17);
                            nArray2[n6] = this.c5u(n16, n18);
                            nArray2[n6++ + n8] = this.m6x(n16, n18, n17, n19);
                            n16 = n18;
                            n17 = n19;
                            try {
                                if (n7 != 0) {
                                    if (n7 != 0) continue;
                                    break;
                                }
                                break block10;
                            }
                            catch (oov oov2) {
                                throw fwg.a(oov2);
                            }
                        }
                        ++n14;
                    }
                    if (n7 != 0) continue;
                }
                n5 = n3 * n4;
            }
            int[] nArray4 = z97.web(n5);
            for (n6 = 0; n6 < n4; ++n6) {
                try {
                    nArray = nArray2;
                    if (n7 != 0) {
                        System.arraycopy(nArray, (n6 + (n2 & 1)) * n8 + (n & 1), nArray4, n6 * n3, n3);
                        if (n7 != 0) continue;
                        break;
                    }
                    break block11;
                }
                catch (oov oov3) {
                    throw fwg.a(oov3);
                }
            }
            nArray = nArray4;
        }
        return nArray;
    }

    public static ttt h3v(long l, ttt ttt2, int n) {
        ttt ttt3;
        block2: {
            ttt ttt4 = ttt2;
            int n2 = t9d.b();
            for (int i = 0; i < n; ++i) {
                ttt3 = new fwg(l + (long)i, ttt4);
                if (n2 != 0) {
                    ttt4 = ttt3;
                    if (n2 != 0) continue;
                }
                break block2;
            }
            ttt3 = ttt4;
        }
        return ttt3;
    }

    public int c5u(int n, int n2) {
        int n3;
        block2: {
            block3: {
                int n4 = t9d.c();
                int n5 = this.nbt(2);
                try {
                    n3 = n5;
                    if (n4 != 0) break block2;
                    if (n3 != 0) break block3;
                }
                catch (oov oov2) {
                    throw fwg.a(oov2);
                }
                n3 = n;
                break block2;
            }
            n3 = n2;
        }
        return n3;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

