/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dbu$2
implements y_f {
    public final gdz ajd;
    public final String yf4;
    public final rv2$nlt giy;
    public final dbu rnn;

    public dbu$2(dbu dbu2, String string, rv2$nlt rv2$nlt) {
        this.rnn = dbu2;
        this.yf4 = string;
        this.giy = rv2$nlt;
        this.ajd = new gdz(this.yf4, this.giy.ssp());
    }

    @Override
    public int h_s() {
        int n;
        block6: {
            z7p z7p2;
            block4: {
                z7p z7p3;
                block5: {
                    int n2 = t9d.c();
                    z7p3 = (z7p)dbu.gl0(this.rnn)._gz(this.ajd);
                    try {
                        try {
                            z7p2 = z7p3;
                            if (n2 != 0) break block4;
                            if (z7p2 != null) break block5;
                        }
                        catch (oov oov2) {
                            throw dbu$2.a(oov2);
                        }
                        n = 0;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw dbu$2.a(oov3);
                    }
                }
                z7p2 = z7p3;
            }
            n = z7p2.h_s();
        }
        return n;
    }

    @Override
    public vas npr() {
        vas vas2;
        block6: {
            z7p z7p2;
            block4: {
                z7p z7p3;
                block5: {
                    int n = t9d.c();
                    z7p3 = (z7p)dbu.gl0(this.rnn)._gz(this.ajd);
                    try {
                        try {
                            z7p2 = z7p3;
                            if (n != 0) break block4;
                            if (z7p2 != null) break block5;
                        }
                        catch (oov oov2) {
                            throw dbu$2.a(oov2);
                        }
                        vas2 = dbu.e5c;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw dbu$2.a(oov3);
                    }
                }
                z7p2 = z7p3;
            }
            vas2 = z7p2.npr();
        }
        return vas2;
    }

    @Override
    public Object npr() {
        return this.npr();
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

