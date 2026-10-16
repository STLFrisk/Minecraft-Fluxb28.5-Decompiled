/*
 * Decompiled with CFR 0.152.
 */
public class f7i
implements ui9 {
    private final /* synthetic */ int kmj;
    private final /* synthetic */ int sus;
    private final /* synthetic */ erg[] ur3;
    private final /* synthetic */ erg cea;
    private /* synthetic */ boolean ved;

    public f7i(int n, int n2, erg[] ergArray, erg erg2) {
        this.kmj = n;
        this.sus = n2;
        this.ur3 = ergArray;
        this.cea = erg2;
    }

    @Override
    public erg oot() {
        return this.cea;
    }

    @Override
    public erg[] qq2(z0_ z0_2) {
        erg[] ergArray = new erg[z0_2.opt()];
        int n = 0;
        int n2 = t9d.c();
        while (n < ergArray.length) {
            block7: {
                block8: {
                    erg erg2 = z0_2.ibn(n);
                    try {
                        try {
                            try {
                                if (n2 != 0) break block7;
                                if (erg2 == null) break block8;
                            }
                            catch (oov oov2) {
                                throw f7i.a(oov2);
                            }
                            if (!erg2.gn1().jof()) break block8;
                        }
                        catch (oov oov3) {
                            throw f7i.a(oov3);
                        }
                        ergArray[n] = new erg(erg2.gn1().cqe());
                    }
                    catch (oov oov4) {
                        throw f7i.a(oov4);
                    }
                }
                ++n;
            }
            if (n2 == 0) continue;
        }
        return ergArray;
    }

    @Override
    public boolean mve(z0_ z0_2, t9d t9d2) {
        int n;
        block9: {
            int n2 = t9d.c();
            int n3 = 0;
            block6: while (true) {
                int n4 = n3;
                block7: while (n4 <= 3 - this.kmj) {
                    n = 0;
                    if (n2 != 0) break block9;
                    for (int i = v1459384; i <= 3 - this.sus; ++i) {
                        boolean bl;
                        block12: {
                            block10: {
                                block11: {
                                    n4 = this.ylf(z0_2, n3, i, true) ? 1 : 0;
                                    if (n2 != 0) continue block7;
                                    try {
                                        try {
                                            if (n2 != 0) break block10;
                                            if (n4 == 0) break block11;
                                        }
                                        catch (oov oov2) {
                                            throw f7i.a(oov2);
                                        }
                                        return true;
                                    }
                                    catch (oov oov3) {
                                        throw f7i.a(oov3);
                                    }
                                }
                                bl = this.ylf(z0_2, n3, i, false);
                            }
                            try {
                                if (n2 != 0) break block12;
                                if (!bl) continue;
                            }
                            catch (oov oov4) {
                                throw f7i.a(oov4);
                            }
                            bl = true;
                        }
                        return bl;
                    }
                    ++n3;
                    if (n2 == 0) continue block6;
                }
                break;
            }
            n = 0;
        }
        return n != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean ylf(z0_ z0_2, int n, int n2, boolean bl) {
        int n3 = t9d.c();
        int n4 = 0;
        do {
            int n5 = n4;
            block41: while (true) {
                if (n5 >= 3) return 1 != 0;
                int n6 = 0;
                if (n3 != 0) return n6 != 0;
                for (int i = v1459798; i < 3; ++i) {
                    int n7;
                    int n8;
                    block58: {
                        erg erg2;
                        erg erg3;
                        erg erg4;
                        block56: {
                            block57: {
                                block54: {
                                    block55: {
                                        block52: {
                                            block53: {
                                                block50: {
                                                    block51: {
                                                        block46: {
                                                            int n9;
                                                            int n10;
                                                            int n11;
                                                            block49: {
                                                                int n12;
                                                                block48: {
                                                                    block47: {
                                                                        block45: {
                                                                            n11 = n4 - n;
                                                                            n10 = i - n2;
                                                                            erg4 = null;
                                                                            n5 = n11;
                                                                            if (n3 != 0) continue block41;
                                                                            try {
                                                                                if (n3 != 0) break block45;
                                                                                if (n5 < 0) break block46;
                                                                            }
                                                                            catch (oov oov2) {
                                                                                throw f7i.a(oov2);
                                                                            }
                                                                            n9 = n10;
                                                                        }
                                                                        try {
                                                                            if (n3 != 0) break block47;
                                                                            if (n9 < 0) break block46;
                                                                        }
                                                                        catch (oov oov3) {
                                                                            throw f7i.a(oov3);
                                                                        }
                                                                        n9 = n11;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                n12 = this.kmj;
                                                                                if (n3 != 0) break block48;
                                                                                if (n9 >= n12) break block46;
                                                                            }
                                                                            catch (oov oov4) {
                                                                                throw f7i.a(oov4);
                                                                            }
                                                                            n9 = n10;
                                                                            if (n3 != 0) break block49;
                                                                        }
                                                                        catch (oov oov5) {
                                                                            throw f7i.a(oov5);
                                                                        }
                                                                        n12 = this.sus;
                                                                    }
                                                                    catch (oov oov6) {
                                                                        throw f7i.a(oov6);
                                                                    }
                                                                }
                                                                if (n9 >= n12) break block46;
                                                                n9 = bl ? 1 : 0;
                                                            }
                                                            erg4 = n9 != 0 ? this.ur3[this.kmj - n11 - 1 + n10 * this.kmj] : this.ur3[n11 + n10 * this.kmj];
                                                        }
                                                        erg3 = z0_2.grp(n4, i);
                                                        try {
                                                            try {
                                                                try {
                                                                    erg2 = erg3;
                                                                    if (n3 != 0) break block50;
                                                                    if (erg2 != null) break block51;
                                                                }
                                                                catch (oov oov7) {
                                                                    throw f7i.a(oov7);
                                                                }
                                                                erg2 = erg4;
                                                                if (n3 != 0) break block50;
                                                            }
                                                            catch (oov oov8) {
                                                                throw f7i.a(oov8);
                                                            }
                                                            if (erg2 == null) continue;
                                                        }
                                                        catch (oov oov9) {
                                                            throw f7i.a(oov9);
                                                        }
                                                    }
                                                    erg2 = erg3;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (n3 != 0) break block52;
                                                            if (erg2 != null) break block53;
                                                        }
                                                        catch (oov oov10) {
                                                            throw f7i.a(oov10);
                                                        }
                                                        erg2 = erg4;
                                                        if (n3 != 0) break block52;
                                                    }
                                                    catch (oov oov11) {
                                                        throw f7i.a(oov11);
                                                    }
                                                    if (erg2 != null) return false;
                                                }
                                                catch (oov oov12) {
                                                    throw f7i.a(oov12);
                                                }
                                            }
                                            erg2 = erg3;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n3 != 0) break block54;
                                                        if (erg2 == null) break block55;
                                                    }
                                                    catch (oov oov13) {
                                                        throw f7i.a(oov13);
                                                    }
                                                    erg2 = erg4;
                                                    if (n3 != 0) break block54;
                                                }
                                                catch (oov oov14) {
                                                    throw f7i.a(oov14);
                                                }
                                                if (erg2 != null) break block55;
                                                return false;
                                            }
                                            catch (oov oov15) {
                                                throw f7i.a(oov15);
                                            }
                                        }
                                        catch (oov oov16) {
                                            throw f7i.a(oov16);
                                        }
                                    }
                                    erg2 = erg4;
                                }
                                try {
                                    try {
                                        if (n3 != 0) break block56;
                                        if (erg2.gn1() == erg3.gn1()) break block57;
                                        return false;
                                    }
                                    catch (oov oov17) {
                                        throw f7i.a(oov17);
                                    }
                                }
                                catch (oov oov18) {
                                    throw f7i.a(oov18);
                                }
                            }
                            erg2 = erg4;
                        }
                        try {
                            try {
                                try {
                                    n8 = erg2.j6_();
                                    n7 = Short.MAX_VALUE;
                                    if (n3 != 0) break block58;
                                    if (n8 == n7) continue;
                                }
                                catch (oov oov19) {
                                    throw f7i.a(oov19);
                                }
                                n8 = erg4.j6_();
                                if (n3 != 0) return n8 != 0;
                            }
                            catch (oov oov20) {
                                throw f7i.a(oov20);
                            }
                            n7 = erg3.j6_();
                        }
                        catch (oov oov21) {
                            throw f7i.a(oov21);
                        }
                    }
                    if (n8 == n7) continue;
                    return 0 != 0;
                }
                break;
            }
            ++n4;
        } while (n3 == 0);
        return 1 != 0;
    }

    @Override
    public erg hd0(z0_ z0_2) {
        erg erg2;
        block16: {
            erg erg3;
            block14: {
                int n;
                int n2;
                block13: {
                    int n3;
                    n2 = t9d.c();
                    erg3 = this.oot().yaq();
                    try {
                        n3 = this.ved;
                        if (n2 != 0) break block13;
                        if (n3 == 0) break block14;
                    }
                    catch (oov oov2) {
                        throw f7i.a(oov2);
                    }
                    n3 = n = 0;
                }
                while (n < z0_2.opt()) {
                    block15: {
                        block17: {
                            erg erg4;
                            erg erg5;
                            block18: {
                                erg5 = z0_2.ibn(n);
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n2 != 0) break block15;
                                                    erg2 = erg5;
                                                    if (n2 != 0) break block16;
                                                }
                                                catch (oov oov3) {
                                                    throw f7i.a(oov3);
                                                }
                                                if (erg2 == null) break block17;
                                            }
                                            catch (oov oov4) {
                                                throw f7i.a(oov4);
                                            }
                                            erg4 = erg5;
                                            if (n2 != 0) break block18;
                                        }
                                        catch (oov oov5) {
                                            throw f7i.a(oov5);
                                        }
                                        if (!erg4.w8b()) break block17;
                                    }
                                    catch (oov oov6) {
                                        throw f7i.a(oov6);
                                    }
                                    erg4 = erg3;
                                }
                                catch (oov oov7) {
                                    throw f7i.a(oov7);
                                }
                            }
                            erg4.b67((bdo)erg5.zso().h33());
                        }
                        ++n;
                    }
                    if (n2 == 0) continue;
                }
            }
            erg2 = erg3;
        }
        return erg2;
    }

    @Override
    public int hmy() {
        return this.kmj * this.sus;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

