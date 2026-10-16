/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class f62 {
    private /* synthetic */ ArrayList p07;

    public f62() {
        this.p07 = new ArrayList();
    }

    public void fu7(String string) {
        block4: {
            int n = t9d.b();
            try {
                boolean bl;
                try {
                    bl = this.dy5().contains(string.toLowerCase());
                    if (n == 0 || bl) break block4;
                }
                catch (oov oov2) {
                    throw f62.a(oov2);
                }
                bl = this.dy5().add(string.toLowerCase());
            }
            catch (oov oov3) {
                throw f62.a(oov3);
            }
        }
    }

    public void vca(String string) {
        block4: {
            int n = t9d.c();
            try {
                boolean bl;
                try {
                    bl = this.dy5().contains(string.toLowerCase());
                    if (n != 0 || !bl) break block4;
                }
                catch (oov oov2) {
                    throw f62.a(oov2);
                }
                bl = this.dy5().remove(string.toLowerCase());
            }
            catch (oov oov3) {
                throw f62.a(oov3);
            }
        }
    }

    public ArrayList dy5() {
        return this.p07;
    }

    public boolean jzk(String string) {
        boolean bl;
        block5: {
            int n = t9d.b();
            for (String string2 : this.dy5()) {
                block7: {
                    boolean bl2;
                    block6: {
                        try {
                            try {
                                bl = string2.contains(string.toLowerCase());
                                if (n == 0) break block5;
                                if (n == 0) break block6;
                            }
                            catch (oov oov2) {
                                throw f62.a(oov2);
                            }
                            if (!bl) break block7;
                        }
                        catch (oov oov3) {
                            throw f62.a(oov3);
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                if (n != 0) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean a92(ha9 ha92) {
        int n;
        block10: {
            block13: {
                block11: {
                    int n2;
                    block12: {
                        n2 = t9d.b();
                        try {
                            try {
                                try {
                                    try {
                                        n = iyr.b3b(ha92);
                                        if (n2 == 0) break block10;
                                        if (n == iyr.b3b(c05.vz1().vg8)) break block11;
                                    }
                                    catch (oov oov2) {
                                        throw f62.a(oov2);
                                    }
                                    n = zwr.qkk.w34().jzk(ha92.noc()) ? 1 : 0;
                                    if (n2 == 0) break block12;
                                }
                                catch (oov oov3) {
                                    throw f62.a(oov3);
                                }
                                if (n == 0) break block13;
                            }
                            catch (oov oov4) {
                                throw f62.a(oov4);
                            }
                            n = zwr.ox7.g7m() ? 1 : 0;
                        }
                        catch (oov oov5) {
                            throw f62.a(oov5);
                        }
                    }
                    try {
                        if (n2 == 0) break block10;
                        if (n == 0) break block13;
                    }
                    catch (oov oov6) {
                        throw f62.a(oov6);
                    }
                }
                n = 1;
                break block10;
            }
            n = 0;
        }
        return n != 0;
    }

    public static boolean bs7(s0i s0i2) {
        boolean bl;
        block18: {
            block17: {
                int n;
                block16: {
                    String string;
                    String string2;
                    block14: {
                        block15: {
                            boolean bl2;
                            block12: {
                                block13: {
                                    string2 = s0i2.xyw()._2o().substring(0, 2);
                                    string = c05.vz1().vg8.xyw()._2o().substring(0, 2);
                                    n = t9d.c();
                                    try {
                                        try {
                                            try {
                                                bl2 = string2.equals("");
                                                if (n != 0) break block12;
                                                if (bl2) break block13;
                                            }
                                            catch (oov oov2) {
                                                throw f62.a(oov2);
                                            }
                                            bl = string.equals("");
                                            if (n != 0) break block14;
                                        }
                                        catch (oov oov3) {
                                            throw f62.a(oov3);
                                        }
                                        if (!bl) break block15;
                                    }
                                    catch (oov oov4) {
                                        throw f62.a(oov4);
                                    }
                                }
                                bl2 = false;
                            }
                            return bl2;
                        }
                        bl = zwr.dpa.g7m();
                    }
                    try {
                        try {
                            if (n != 0) break block16;
                            if (!bl) break block17;
                        }
                        catch (oov oov5) {
                            throw f62.a(oov5);
                        }
                        bl = string2.equals(string);
                    }
                    catch (oov oov6) {
                        throw f62.a(oov6);
                    }
                }
                try {
                    if (n != 0) break block18;
                    if (!bl) break block17;
                }
                catch (oov oov7) {
                    throw f62.a(oov7);
                }
                bl = true;
                break block18;
            }
            bl = false;
        }
        return bl;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

