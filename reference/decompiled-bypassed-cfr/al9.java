/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Lists
 */
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class al9 {
    private static final sjk oha = new al9$oge(null);
    private static final sjk qbz = new al9$tup(-1, true);
    private static final sjk xnl = new al9$tup(1, true);
    private static final sjk ss1 = new al9$tup(1, false);
    public static final sjk _du = new al9$1();
    private final eqe odk;
    private final List b4i = Lists.newArrayList();
    private wra m71 = new y_0();
    private int wnu = -1;
    private int _oh;

    public al9(eqe eqe2) {
        this.odk = eqe2;
    }

    public sjk i37(int n) {
        sjk sjk2;
        block24: {
            block31: {
                int n2;
                int n3;
                block30: {
                    int n4;
                    block28: {
                        block29: {
                            int n5;
                            block25: {
                                block26: {
                                    block27: {
                                        block22: {
                                            block23: {
                                                n4 = t9d.c();
                                                n3 = n + this._oh * 6;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                n2 = this._oh;
                                                                if (n4 != 0) break block22;
                                                                if (n2 <= 0) break block23;
                                                            }
                                                            catch (oov oov2) {
                                                                throw al9.a(oov2);
                                                            }
                                                            n2 = n;
                                                            if (n4 != 0) break block22;
                                                        }
                                                        catch (oov oov3) {
                                                            throw al9.a(oov3);
                                                        }
                                                        if (n2 != 0) break block23;
                                                    }
                                                    catch (oov oov4) {
                                                        throw al9.a(oov4);
                                                    }
                                                    sjk2 = qbz;
                                                    break block24;
                                                }
                                                catch (oov oov5) {
                                                    throw al9.a(oov5);
                                                }
                                            }
                                            n2 = n;
                                        }
                                        try {
                                            try {
                                                try {
                                                    n5 = 7;
                                                    if (n4 != 0) break block25;
                                                    if (n2 != n5) break block26;
                                                }
                                                catch (oov oov6) {
                                                    throw al9.a(oov6);
                                                }
                                                if (n3 >= this.m71._ec().size()) break block27;
                                            }
                                            catch (oov oov7) {
                                                throw al9.a(oov7);
                                            }
                                            sjk2 = xnl;
                                            break block24;
                                        }
                                        catch (oov oov8) {
                                            throw al9.a(oov8);
                                        }
                                    }
                                    sjk2 = ss1;
                                    break block24;
                                }
                                try {
                                    n2 = n;
                                    if (n4 != 0) break block28;
                                    n5 = 8;
                                }
                                catch (oov oov9) {
                                    throw al9.a(oov9);
                                }
                            }
                            try {
                                if (n2 != n5) break block29;
                                sjk2 = oha;
                                break block24;
                            }
                            catch (oov oov10) {
                                throw al9.a(oov10);
                            }
                        }
                        n2 = n3;
                    }
                    try {
                        if (n4 != 0) break block30;
                        if (n2 < 0) break block31;
                    }
                    catch (oov oov11) {
                        throw al9.a(oov11);
                    }
                    n2 = n3;
                }
                try {
                    if (n2 >= this.m71._ec().size()) break block31;
                    sjk2 = (sjk)Objects.firstNonNull(this.m71._ec().get(n3), (Object)_du);
                    break block24;
                }
                catch (oov oov12) {
                    throw al9.a(oov12);
                }
            }
            sjk2 = _du;
        }
        return sjk2;
    }

    public List xal() {
        ArrayList arrayList;
        block4: {
            ArrayList arrayList2 = Lists.newArrayList();
            int n = t9d.b();
            for (int i = 0; i <= 8; ++i) {
                try {
                    arrayList = arrayList2;
                    if (n != 0) {
                        arrayList.add(this.i37(i));
                        if (n != 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw al9.a(oov2);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public sjk by8() {
        return this.i37(this.wnu);
    }

    public wra sr4() {
        return this.m71;
    }

    /*
     * Unable to fully structure code
     */
    public void o4o(int var1_1) {
        block14: {
            block15: {
                block16: {
                    var2_2 = t9d.b();
                    var3_3 = this.i37(var1_1);
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (var3_3 == al9._du) break block14;
                                        v0 = this;
                                        if (var2_2 == 0) break block15;
                                    }
                                    catch (oov v1) {
                                        throw al9.a(v1);
                                    }
                                    if (v0.wnu == var1_1) {
                                    }
                                    ** GOTO lbl37
                                }
                                catch (oov v2) {
                                    throw al9.a(v2);
                                }
                                v3 = var3_3;
                                if (var2_2 == 0) break block16;
                            }
                            catch (oov v4) {
                                throw al9.a(v4);
                            }
                            if (v3.v4p()) {
                            }
                            ** GOTO lbl37
                        }
                        catch (oov v5) {
                            throw al9.a(v5);
                        }
                        v3 = var3_3;
                    }
                    catch (oov v6) {
                        throw al9.a(v6);
                    }
                }
                try {
                    v3.z9x(this);
                    if (var2_2 != 0) break block14;
lbl37:
                    // 3 sources

                    v0 = this;
                }
                catch (oov v7) {
                    throw al9.a(v7);
                }
            }
            v0.wnu = var1_1;
        }
    }

    public void kh4() {
        this.odk.b67(this);
    }

    public int q_4() {
        return this.wnu;
    }

    public void rg3(wra wra2) {
        this.b4i.add(this.zrh());
        this.m71 = wra2;
        this.wnu = -1;
        this._oh = 0;
    }

    public h61 zrh() {
        return new h61(this.m71, this.xal(), this.wnu);
    }

    public static int f23(al9 al92, int n) {
        al92._oh = n;
        return al92._oh;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

