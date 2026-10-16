/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import net.optifine.CustomItems;
import net.optifine.reflect.Reflector;

public class a6o {
    private final Map mot = Maps.newHashMap();
    private final Map yqk = Maps.newHashMap();
    private final Map sf2 = Maps.newHashMap();
    private final v58 npb;

    public a6o(v58 v582) {
        this.npb = v582;
    }

    public sla a28(u7m u7m2) {
        return this.eyp(u7m2, 0);
    }

    public sla eyp(u7m u7m2, int n) {
        return this._1p(new erg(u7m2, 1, n)).yea();
    }

    public dbw _1p(erg erg2) {
        dbw dbw2;
        block23: {
            dbw dbw3;
            block22: {
                int n;
                block21: {
                    block20: {
                        boolean bl;
                        block19: {
                            block18: {
                                idp idp2;
                                dbw dbw4;
                                block17: {
                                    u7m u7m2 = erg2.gn1();
                                    dbw2 = this.unc(u7m2, this.j6y(erg2));
                                    n = t9d.b();
                                    try {
                                        try {
                                            dbw4 = dbw2;
                                            if (n == 0) break block17;
                                            if (dbw4 != null) break block18;
                                        }
                                        catch (oov oov2) {
                                            throw a6o.a(oov2);
                                        }
                                        dbw4 = this.sf2.get(u7m2);
                                    }
                                    catch (oov oov3) {
                                        throw a6o.a(oov3);
                                    }
                                }
                                if ((idp2 = (idp)((Object)dbw4)) != null) {
                                    dbw2 = this.npb.a92(idp2.zz2(erg2));
                                }
                            }
                            try {
                                try {
                                    try {
                                        bl = Reflector.ForgeHooksClient.exists();
                                        if (n == 0) break block19;
                                        if (!bl) break block20;
                                    }
                                    catch (oov oov4) {
                                        throw a6o.a(oov4);
                                    }
                                    dbw3 = dbw2;
                                    if (n == 0) break block21;
                                }
                                catch (oov oov5) {
                                    throw a6o.a(oov5);
                                }
                                bl = dbw3 instanceof ycv;
                            }
                            catch (oov oov6) {
                                throw a6o.a(oov6);
                            }
                        }
                        if (bl) {
                            dbw2 = ((ycv)dbw2).gak(erg2);
                        }
                    }
                    dbw3 = dbw2;
                }
                try {
                    try {
                        if (n == 0) break block22;
                        if (dbw3 != null) break block23;
                    }
                    catch (oov oov7) {
                        throw a6o.a(oov7);
                    }
                    dbw3 = this.npb.ohw();
                }
                catch (oov oov8) {
                    throw a6o.a(oov8);
                }
            }
            dbw2 = dbw3;
        }
        if (hxt.bdl()) {
            dbw2 = CustomItems.getCustomItemModel(erg2, dbw2, null, true);
        }
        return dbw2;
    }

    public int j6y(erg erg2) {
        int n;
        block6: {
            erg erg3;
            block4: {
                block5: {
                    int n2 = t9d.c();
                    try {
                        try {
                            erg3 = erg2;
                            if (n2 != 0) break block4;
                            if (!erg3.dw2()) break block5;
                        }
                        catch (oov oov2) {
                            throw a6o.a(oov2);
                        }
                        n = 0;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw a6o.a(oov3);
                    }
                }
                erg3 = erg2;
            }
            n = erg3.j6_();
        }
        return n;
    }

    public dbw unc(u7m u7m2, int n) {
        return (dbw)this.yqk.get(this.s4j(u7m2, n));
    }

    private int s4j(u7m u7m2, int n) {
        return u7m._lo(u7m2) << 16 | n;
    }

    public void zuv(u7m u7m2, int n, zlz zlz2) {
        this.mot.put(this.s4j(u7m2, n), zlz2);
        this.yqk.put(this.s4j(u7m2, n), this.npb.a92(zlz2));
    }

    public void ta1(u7m u7m2, idp idp2) {
        this.sf2.put(u7m2, idp2);
    }

    public v58 mkp() {
        return this.npb;
    }

    public void r57() {
        this.yqk.clear();
        Iterator iterator = this.mot.entrySet().iterator();
        int n = t9d.b();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            this.yqk.put(entry.getKey(), this.npb.a92((zlz)entry.getValue()));
            if (n != 0) continue;
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

