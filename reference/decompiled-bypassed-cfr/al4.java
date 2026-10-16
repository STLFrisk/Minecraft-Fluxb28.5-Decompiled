/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 */
import com.google.common.base.Predicates;
import java.util.Random;

public class al4
extends cdu {
    private static final o9a v1a = o9a.utk(ox_.vd0).zpr(pmc.xum, Predicates.equalTo((Object)pmc$s6y.r2y));
    private final zfz muc = ox_.bj8.l4i().zvi(hvn.spa, (Comparable)((Object)hvn$dyo.oy2)).zvi(izd._9x, (Comparable)((Object)izd$jc0.ct4));
    private final zfz bxz = ox_.umb.l4i();
    private final zfz trl = ox_.whp.l4i();

    @Override
    public boolean v3g(t9d t9d2, Random random, mew mew2) {
        boolean bl;
        block78: {
            int n;
            int n2;
            block76: {
                int n3;
                int n4;
                int n5;
                block74: {
                    int n6;
                    block73: {
                        block71: {
                            int n7;
                            int n8;
                            int n9;
                            int n10;
                            block68: {
                                int n11;
                                block66: {
                                    block67: {
                                        block65: {
                                            n2 = t9d.c();
                                            while (t9d2.isAirBlock(mew2)) {
                                                try {
                                                    try {
                                                        n11 = mew2.getY();
                                                        if (n2 != 0 || n2 != 0) break block65;
                                                    }
                                                    catch (oov oov2) {
                                                        throw al4.a(oov2);
                                                    }
                                                    if (n11 <= 2) break;
                                                }
                                                catch (oov oov3) {
                                                    throw al4.a(oov3);
                                                }
                                                mew2 = mew2.eve();
                                                if (n2 == 0) continue;
                                            }
                                            n11 = v1a.no2(t9d2.getBlockState(mew2)) ? 1 : 0;
                                        }
                                        try {
                                            try {
                                                if (n2 != 0) break block66;
                                                if (n11 != 0) break block67;
                                            }
                                            catch (oov oov4) {
                                                throw al4.a(oov4);
                                            }
                                            return false;
                                        }
                                        catch (oov oov5) {
                                            throw al4.a(oov5);
                                        }
                                    }
                                    n11 = -2;
                                }
                                n10 = n11;
                                block47: while (true) {
                                    int n12 = n10;
                                    block48: while (n12 <= 2) {
                                        n9 = -2;
                                        if (n2 != 0) break block68;
                                        for (n8 = v290749; n8 <= 2; ++n8) {
                                            boolean bl2;
                                            block70: {
                                                block69: {
                                                    n12 = t9d2.isAirBlock(mew2.ec4(n10, -1, n8)) ? 1 : 0;
                                                    if (n2 != 0) continue block48;
                                                    try {
                                                        try {
                                                            if (n2 != 0) break block69;
                                                            if (n12 == 0) continue;
                                                        }
                                                        catch (oov oov6) {
                                                            throw al4.a(oov6);
                                                        }
                                                        bl2 = t9d2.isAirBlock(mew2.ec4(n10, -2, n8));
                                                    }
                                                    catch (oov oov7) {
                                                        throw al4.a(oov7);
                                                    }
                                                }
                                                try {
                                                    if (n2 != 0) break block70;
                                                    if (!bl2) continue;
                                                }
                                                catch (oov oov8) {
                                                    throw al4.a(oov8);
                                                }
                                                bl2 = false;
                                            }
                                            return bl2;
                                        }
                                        ++n10;
                                        if (n2 == 0) continue block47;
                                    }
                                    break;
                                }
                                n9 = -1;
                            }
                            n10 = n9;
                            block50: while (true) {
                                int n13 = n10;
                                block51: while (n13 <= 0) {
                                    n7 = -2;
                                    if (n2 != 0) break block71;
                                    n8 = n7;
                                    while (n8 <= 2) {
                                        block72: {
                                            n13 = -2;
                                            if (n2 != 0) continue block51;
                                            for (int i = v290750; i <= 2; ++i) {
                                                try {
                                                    t9d2.vct(mew2.ec4(n8, n10, i), this.bxz, 2);
                                                    if (n2 == 0) {
                                                        if (n2 == 0) continue;
                                                        break;
                                                    }
                                                    break block72;
                                                }
                                                catch (oov oov9) {
                                                    throw al4.a(oov9);
                                                }
                                            }
                                            ++n8;
                                        }
                                        if (n2 == 0) continue;
                                    }
                                    ++n10;
                                    if (n2 == 0) continue block50;
                                }
                                break;
                            }
                            n7 = t9d2.vct(mew2, this.trl, 2) ? 1 : 0;
                        }
                        for (vt2 vt22 : vt2$unz.fzl) {
                            try {
                                n6 = t9d2.vct(mew2.offset(vt22), this.trl, 2) ? 1 : 0;
                                if (n2 == 0) {
                                    if (n2 == 0) continue;
                                    break;
                                }
                                break block73;
                            }
                            catch (oov oov10) {
                                throw al4.a(oov10);
                            }
                        }
                        n6 = -2;
                    }
                    n = n6;
                    block55: while (true) {
                        int n14 = n;
                        int n15 = 2;
                        block56: while (n14 <= n15) {
                            n5 = -2;
                            if (n2 != 0) break block74;
                            for (n4 = v290868; n4 <= 2; ++n4) {
                                int n16;
                                try {
                                    n16 = n;
                                    if (n2 != 0) continue;
                                    n15 = -2;
                                    if (n2 != 0) continue block56;
                                }
                                catch (oov oov11) {
                                    throw al4.a(oov11);
                                }
                                try {
                                    block75: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (n16 == n15) break block75;
                                                                n16 = n;
                                                                if (n2 != 0) continue;
                                                            }
                                                            catch (oov oov12) {
                                                                throw al4.a(oov12);
                                                            }
                                                            if (n16 == 2) break block75;
                                                        }
                                                        catch (oov oov13) {
                                                            throw al4.a(oov13);
                                                        }
                                                        n16 = n4;
                                                        if (n2 != 0) continue;
                                                    }
                                                    catch (oov oov14) {
                                                        throw al4.a(oov14);
                                                    }
                                                    if (n16 == -2) break block75;
                                                }
                                                catch (oov oov15) {
                                                    throw al4.a(oov15);
                                                }
                                                n16 = n4;
                                                if (n2 != 0) continue;
                                            }
                                            catch (oov oov16) {
                                                throw al4.a(oov16);
                                            }
                                            if (n16 != 2) continue;
                                        }
                                        catch (oov oov17) {
                                            throw al4.a(oov17);
                                        }
                                    }
                                    n16 = t9d2.vct(mew2.ec4(n, 1, n4), this.bxz, 2) ? 1 : 0;
                                    continue;
                                }
                                catch (oov oov18) {
                                    throw al4.a(oov18);
                                }
                            }
                            ++n;
                            if (n2 == 0) continue block55;
                        }
                        break;
                    }
                    t9d2.vct(mew2.ec4(2, 1, 0), this.muc, 2);
                    t9d2.vct(mew2.ec4(-2, 1, 0), this.muc, 2);
                    t9d2.vct(mew2.ec4(0, 1, 2), this.muc, 2);
                    t9d2.vct(mew2.ec4(0, 1, -2), this.muc, 2);
                    n5 = -1;
                }
                n = n5;
                block58: while (true) {
                    int n17 = n;
                    block59: while (n17 <= 1) {
                        n3 = -1;
                        if (n2 != 0) break block76;
                        for (n4 = v290903; n4 <= 1; ++n4) {
                            n17 = n;
                            if (n2 != 0) continue block59;
                            try {
                                int n18;
                                block77: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n2 != 0) continue;
                                                    if (n17 != 0) break block77;
                                                }
                                                catch (oov oov19) {
                                                    throw al4.a(oov19);
                                                }
                                                n18 = n4;
                                                if (n2 != 0) continue;
                                            }
                                            catch (oov oov20) {
                                                throw al4.a(oov20);
                                            }
                                            if (n18 != 0) break block77;
                                        }
                                        catch (oov oov21) {
                                            throw al4.a(oov21);
                                        }
                                        t9d2.vct(mew2.ec4(n, 4, n4), this.bxz, 2);
                                        if (n2 == 0) continue;
                                    }
                                    catch (oov oov22) {
                                        throw al4.a(oov22);
                                    }
                                }
                                n18 = t9d2.vct(mew2.ec4(n, 4, n4), this.muc, 2) ? 1 : 0;
                                continue;
                            }
                            catch (oov oov23) {
                                throw al4.a(oov23);
                            }
                        }
                        ++n;
                        if (n2 == 0) continue block58;
                    }
                    break;
                }
                n3 = n = 1;
            }
            while (n <= 3) {
                try {
                    t9d2.vct(mew2.ec4(-1, n, -1), this.bxz, 2);
                    t9d2.vct(mew2.ec4(-1, n, 1), this.bxz, 2);
                    t9d2.vct(mew2.ec4(1, n, -1), this.bxz, 2);
                    bl = t9d2.vct(mew2.ec4(1, n, 1), this.bxz, 2);
                    if (n2 == 0) {
                        ++n;
                        if (n2 == 0) continue;
                        break;
                    }
                    break block78;
                }
                catch (oov oov24) {
                    throw al4.a(oov24);
                }
            }
            bl = true;
        }
        return bl;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

