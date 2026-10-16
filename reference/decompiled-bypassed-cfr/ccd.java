/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;

public class ccd
implements ui9 {
    @Override
    public boolean mve(z0_ z0_2, t9d t9d2) {
        boolean bl;
        block33: {
            block27: {
                ArrayList arrayList = Lists.newArrayList();
                int n = 0;
                int n2 = t9d.b();
                while (n < z0_2.opt()) {
                    block28: {
                        block29: {
                            int n3;
                            block32: {
                                block31: {
                                    erg erg2;
                                    erg erg3;
                                    erg erg4;
                                    block30: {
                                        erg4 = z0_2.ibn(n);
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n2 == 0) break block27;
                                                        if (n2 == 0) break block28;
                                                    }
                                                    catch (oov oov2) {
                                                        throw ccd.a(oov2);
                                                    }
                                                    if (erg4 == null) break block29;
                                                }
                                                catch (oov oov3) {
                                                    throw ccd.a(oov3);
                                                }
                                                arrayList.add(erg4);
                                                if (n2 == 0) break block28;
                                            }
                                            catch (oov oov4) {
                                                throw ccd.a(oov4);
                                            }
                                            if (arrayList.size() <= 1) break block29;
                                        }
                                        catch (oov oov5) {
                                            throw ccd.a(oov5);
                                        }
                                        erg3 = (erg)arrayList.get(0);
                                        try {
                                            try {
                                                erg2 = erg4;
                                                if (n2 == 0) break block30;
                                                if (erg2.gn1() != erg3.gn1()) break block31;
                                            }
                                            catch (oov oov6) {
                                                throw ccd.a(oov6);
                                            }
                                            erg2 = erg3;
                                        }
                                        catch (oov oov7) {
                                            throw ccd.a(oov7);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        n3 = erg2.qd2;
                                                        if (n2 == 0) break block32;
                                                        if (n3 != 1) break block31;
                                                    }
                                                    catch (oov oov8) {
                                                        throw ccd.a(oov8);
                                                    }
                                                    n3 = erg4.qd2;
                                                    if (n2 == 0) break block32;
                                                }
                                                catch (oov oov9) {
                                                    throw ccd.a(oov9);
                                                }
                                                if (n3 != 1) break block31;
                                            }
                                            catch (oov oov10) {
                                                throw ccd.a(oov10);
                                            }
                                            n3 = erg3.gn1().k40() ? 1 : 0;
                                            if (n2 == 0) break block32;
                                        }
                                        catch (oov oov11) {
                                            throw ccd.a(oov11);
                                        }
                                        if (n3 != 0) break block29;
                                    }
                                    catch (oov oov12) {
                                        throw ccd.a(oov12);
                                    }
                                }
                                n3 = 0;
                            }
                            return n3 != 0;
                        }
                        ++n;
                    }
                    if (n2 != 0) continue;
                }
                try {
                    try {
                        bl = arrayList.size();
                        if (n2 == 0) break block33;
                        if (!bl) break block27;
                    }
                    catch (oov oov13) {
                        throw ccd.a(oov13);
                    }
                    bl = true;
                    break block33;
                }
                catch (oov oov14) {
                    throw ccd.a(oov14);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public erg hd0(z0_ z0_2) {
        int n;
        int n2;
        erg erg2;
        block57: {
            u7m u7m2;
            Object object;
            erg erg3;
            int n3;
            block56: {
                int n4;
                block55: {
                    int n5;
                    block54: {
                        erg erg4;
                        block53: {
                            erg erg5;
                            ArrayList arrayList;
                            block47: {
                                ArrayList arrayList2;
                                block52: {
                                    arrayList = Lists.newArrayList();
                                    int n6 = 0;
                                    n3 = t9d.c();
                                    while (n6 < z0_2.opt()) {
                                        block46: {
                                            block48: {
                                                int n7;
                                                block51: {
                                                    int n8;
                                                    block50: {
                                                        Object object2;
                                                        block49: {
                                                            erg3 = z0_2.ibn(n6);
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (n3 != 0) break block46;
                                                                            erg5 = erg3;
                                                                            if (n3 != 0) break block47;
                                                                        }
                                                                        catch (oov oov2) {
                                                                            throw ccd.a(oov2);
                                                                        }
                                                                        if (erg5 == null) break block48;
                                                                    }
                                                                    catch (oov oov3) {
                                                                        throw ccd.a(oov3);
                                                                    }
                                                                    arrayList.add(erg3);
                                                                    if (n3 != 0) break block46;
                                                                }
                                                                catch (oov oov4) {
                                                                    throw ccd.a(oov4);
                                                                }
                                                                if (arrayList.size() <= 1) break block48;
                                                            }
                                                            catch (oov oov5) {
                                                                throw ccd.a(oov5);
                                                            }
                                                            object = (erg)arrayList.get(0);
                                                            try {
                                                                try {
                                                                    object2 = erg3;
                                                                    if (n3 != 0) break block49;
                                                                    if (((erg)object2).gn1() != ((erg)object).gn1()) return null;
                                                                }
                                                                catch (oov oov6) {
                                                                    throw ccd.a(oov6);
                                                                }
                                                                object2 = object;
                                                            }
                                                            catch (oov oov7) {
                                                                throw ccd.a(oov7);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    int n8 = ((erg)object2).qd2;
                                                                    n8 = 1;
                                                                    if (n3 != 0) break block50;
                                                                    if (n7 != n8) return null;
                                                                }
                                                                catch (oov oov8) {
                                                                    throw ccd.a(oov8);
                                                                }
                                                                n7 = erg3.qd2;
                                                                if (n3 != 0) break block51;
                                                            }
                                                            catch (oov oov9) {
                                                                throw ccd.a(oov9);
                                                            }
                                                            n8 = 1;
                                                        }
                                                        catch (oov oov10) {
                                                            throw ccd.a(oov10);
                                                        }
                                                    }
                                                    try {
                                                        if (n7 != n8) return null;
                                                        n7 = ((erg)object).gn1().k40() ? 1 : 0;
                                                    }
                                                    catch (oov oov11) {
                                                        throw ccd.a(oov11);
                                                    }
                                                }
                                                try {
                                                    if (n7 == 0) {
                                                        return null;
                                                    }
                                                }
                                                catch (oov oov12) {
                                                    throw ccd.a(oov12);
                                                }
                                            }
                                            ++n6;
                                        }
                                        if (n3 == 0) continue;
                                    }
                                    try {
                                        try {
                                            arrayList2 = arrayList;
                                            if (n3 != 0) break block52;
                                            if (arrayList2.size() != 2) return null;
                                        }
                                        catch (oov oov13) {
                                            throw ccd.a(oov13);
                                        }
                                        arrayList2 = arrayList.get(0);
                                    }
                                    catch (oov oov14) {
                                        throw ccd.a(oov14);
                                    }
                                }
                                erg5 = (erg)((Object)arrayList2);
                            }
                            erg2 = erg5;
                            erg3 = (erg)arrayList.get(1);
                            try {
                                try {
                                    erg4 = erg2;
                                    if (n3 != 0) break block53;
                                    if (erg4.gn1() != erg3.gn1()) return null;
                                }
                                catch (oov oov15) {
                                    throw ccd.a(oov15);
                                }
                                erg4 = erg2;
                            }
                            catch (oov oov16) {
                                throw ccd.a(oov16);
                            }
                        }
                        try {
                            try {
                                try {
                                    int n5 = erg4.qd2;
                                    n5 = 1;
                                    if (n3 != 0) break block54;
                                    if (n4 != n5) return null;
                                }
                                catch (oov oov17) {
                                    throw ccd.a(oov17);
                                }
                                n4 = erg3.qd2;
                                if (n3 != 0) break block55;
                            }
                            catch (oov oov18) {
                                throw ccd.a(oov18);
                            }
                            n5 = 1;
                        }
                        catch (oov oov19) {
                            throw ccd.a(oov19);
                        }
                    }
                    try {
                        try {
                            if (n4 != n5) return null;
                            u7m2 = erg2.gn1();
                            if (n3 != 0) break block56;
                        }
                        catch (oov oov20) {
                            throw ccd.a(oov20);
                        }
                        n4 = u7m2.k40() ? 1 : 0;
                    }
                    catch (oov oov21) {
                        throw ccd.a(oov21);
                    }
                }
                try {
                    if (n4 == 0) return null;
                    u7m2 = erg2.gn1();
                }
                catch (oov oov22) {
                    throw ccd.a(oov22);
                }
            }
            object = u7m2;
            int n9 = ((u7m)object).jk2() - erg2.dzj();
            int n10 = ((u7m)object).jk2() - erg3.dzj();
            int n11 = n9 + n10 + ((u7m)object).jk2() * 5 / 100;
            n2 = ((u7m)object).jk2() - n11;
            try {
                n = n2;
                if (n3 != 0) break block57;
                if (n >= 0) return new erg(erg2.gn1(), 1, n2);
            }
            catch (oov oov23) {
                throw ccd.a(oov23);
            }
            n = 0;
        }
        n2 = n;
        return new erg(erg2.gn1(), 1, n2);
    }

    @Override
    public int hmy() {
        return 4;
    }

    @Override
    public erg oot() {
        return null;
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
                                throw ccd.a(oov2);
                            }
                            if (!erg2.gn1().jof()) break block8;
                        }
                        catch (oov oov3) {
                            throw ccd.a(oov3);
                        }
                        ergArray[n] = new erg(erg2.gn1().cqe());
                    }
                    catch (oov oov4) {
                        throw ccd.a(oov4);
                    }
                }
                ++n;
            }
            if (n2 == 0) continue;
        }
        return ergArray;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

