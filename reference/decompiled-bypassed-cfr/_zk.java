/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.io.IOException;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class _zk {
    private final /* synthetic */ c05 _ny;
    public int fux;
    private /* synthetic */ int k24;
    public int ymi;
    public int cms;
    public int v5s;
    public int ll_;
    public final int pu6;
    private /* synthetic */ int iz9;
    private /* synthetic */ int xq9;
    public int __a;
    public int qjv;
    public boolean xgh = true;
    private /* synthetic */ float _pr;
    private /* synthetic */ float mdk;
    private /* synthetic */ float cdx;
    private /* synthetic */ int qx9;
    private /* synthetic */ long dy2;
    private /* synthetic */ boolean czy;
    private /* synthetic */ boolean we6;
    public int s63;
    private /* synthetic */ boolean _sv;

    public _zk(c05 c052, int n, int n2, int n3, int n4, int n5) {
        this._pr = -2.0f;
        this.qx9 = -1;
        this.czy = true;
        this._sv = true;
        this._ny = c052;
        this.fux = n;
        this.k24 = n2;
        this.ymi = n3;
        this.cms = n4;
        this.pu6 = n5;
        this.ll_ = 0;
        this.v5s = n;
    }

    public void ysu(int n, int n2, int n3, int n4) {
        this.fux = n;
        this.k24 = n2;
        this.ymi = n3;
        this.cms = n4;
        this.ll_ = 0;
        this.v5s = n;
    }

    public void j6h(boolean bl) {
        this.czy = bl;
    }

    public void o68(boolean bl, int n) {
        block5: {
            int n2;
            block4: {
                int n3 = t9d.b();
                try {
                    _zk _zk2;
                    try {
                        this.we6 = bl;
                        _zk2 = this;
                        n2 = n;
                        if (n3 == 0) break block4;
                        _zk2.s63 = n2;
                        if (bl) break block5;
                    }
                    catch (oov oov2) {
                        throw _zk.a(oov2);
                    }
                    _zk2 = this;
                    n2 = 0;
                }
                catch (oov oov3) {
                    throw _zk.a(oov3);
                }
            }
            _zk2.s63 = n2;
        }
    }

    public abstract int osm();

    public abstract void f41(int var1, boolean var2, int var3, int var4);

    public abstract boolean ie8(int var1);

    public int lty() {
        return this.osm() * this.pu6 + this.s63;
    }

    public abstract void lec();

    public abstract void bct(int var1, int var2, int var3, int var4, int var5, int var6);

    public void zot(int n, int n2, jom jom2) {
    }

    public void xdy(int n, int n2) {
    }

    public void zrl(int n, int n2) {
    }

    public int byn(int n, int n2) {
        int n3;
        block25: {
            block20: {
                int n4;
                int n5;
                block24: {
                    block23: {
                        int n6;
                        block22: {
                            int n7;
                            block21: {
                                int n8;
                                block19: {
                                    int n9 = this.ll_ + this.fux / 2 - this.e14() / 2;
                                    n8 = this.ll_ + this.fux / 2 + this.e14() / 2;
                                    n6 = n2 - this.ymi - this.s63 + (int)this.cdx - 4;
                                    n5 = n6 / this.pu6;
                                    n4 = t9d.c();
                                    try {
                                        try {
                                            n3 = n;
                                            n7 = this.w3q();
                                            if (n4 != 0) break block19;
                                            if (n3 >= n7) break block20;
                                        }
                                        catch (oov oov2) {
                                            throw _zk.a(oov2);
                                        }
                                        n3 = n;
                                        n7 = n9;
                                    }
                                    catch (oov oov3) {
                                        throw _zk.a(oov3);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (n4 != 0) break block21;
                                            if (n3 < n7) break block20;
                                        }
                                        catch (oov oov4) {
                                            throw _zk.a(oov4);
                                        }
                                        n3 = n;
                                        if (n4 != 0) break block22;
                                    }
                                    catch (oov oov5) {
                                        throw _zk.a(oov5);
                                    }
                                    n7 = n8;
                                }
                                catch (oov oov6) {
                                    throw _zk.a(oov6);
                                }
                            }
                            if (n3 > n7) break block20;
                            n3 = n5;
                        }
                        try {
                            if (n4 != 0) break block23;
                            if (n3 < 0) break block20;
                        }
                        catch (oov oov7) {
                            throw _zk.a(oov7);
                        }
                        n3 = n6;
                    }
                    try {
                        if (n4 != 0) break block24;
                        if (n3 < 0) break block20;
                    }
                    catch (oov oov8) {
                        throw _zk.a(oov8);
                    }
                    n3 = n5;
                }
                try {
                    try {
                        if (n4 != 0) break block25;
                        if (n3 >= this.osm()) break block20;
                    }
                    catch (oov oov9) {
                        throw _zk.a(oov9);
                    }
                    n3 = n5;
                    break block25;
                }
                catch (oov oov10) {
                    throw _zk.a(oov10);
                }
            }
            n3 = -1;
        }
        return n3;
    }

    public void oae(int n, int n2) {
        this.iz9 = n;
        this.xq9 = n2;
    }

    private void kg2() {
        block23: {
            int n;
            block22: {
                _zk _zk2;
                int n2;
                block20: {
                    int n3;
                    block21: {
                        block18: {
                            float f;
                            block19: {
                                block16: {
                                    block17: {
                                        n3 = t9d.b();
                                        n = this.g1g();
                                        try {
                                            n2 = n;
                                            if (n3 == 0) break block16;
                                            if (n2 >= 0) break block17;
                                        }
                                        catch (oov oov2) {
                                            throw _zk.a(oov2);
                                        }
                                        n /= 2;
                                    }
                                    n2 = this.xgh ? 1 : 0;
                                }
                                try {
                                    try {
                                        try {
                                            if (n3 == 0) break block18;
                                            if (n2 != 0) break block19;
                                        }
                                        catch (oov oov3) {
                                            throw _zk.a(oov3);
                                        }
                                        n2 = n;
                                        if (n3 == 0) break block18;
                                    }
                                    catch (oov oov4) {
                                        throw _zk.a(oov4);
                                    }
                                    if (n2 >= 0) break block19;
                                }
                                catch (oov oov5) {
                                    throw _zk.a(oov5);
                                }
                                n = 0;
                            }
                            n2 = (f = this.cdx - 0.0f) == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                        }
                        try {
                            try {
                                if (n3 == 0) break block20;
                                if (n2 >= 0) break block21;
                            }
                            catch (oov oov6) {
                                throw _zk.a(oov6);
                            }
                            this.cdx = 0.0f;
                        }
                        catch (oov oov7) {
                            throw _zk.a(oov7);
                        }
                    }
                    try {
                        _zk2 = this;
                        if (n3 == 0) break block22;
                        float f = _zk2.cdx - (float)n;
                        n2 = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                    }
                    catch (oov oov8) {
                        throw _zk.a(oov8);
                    }
                }
                if (n2 <= 0) break block23;
                _zk2 = this;
            }
            _zk2.cdx = n;
        }
    }

    public int g1g() {
        return this.lty() - (this.cms - this.ymi - 4);
    }

    public int x1g() {
        return (int)this.cdx;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean ghj(int n) {
        int n2;
        boolean bl;
        block6: {
            int n3 = t9d.b();
            try {
                try {
                    try {
                        bl = n;
                        n2 = this.ymi;
                        if (n3 == 0) break block6;
                        if (bl < n2) return false;
                    }
                    catch (oov oov2) {
                        throw _zk.a(oov2);
                    }
                    bl = n;
                    if (n3 == 0) return bl;
                }
                catch (oov oov3) {
                    throw _zk.a(oov3);
                }
                n2 = this.cms;
            }
            catch (oov oov4) {
                throw _zk.a(oov4);
            }
        }
        if (bl > n2) return false;
        return true;
    }

    public void ics(int n) {
        this.cdx += (float)n;
        this.kg2();
        this._pr = -2.0f;
    }

    public void lyg(gt4 gt42) {
        block14: {
            int n;
            int n2;
            block15: {
                int n3;
                block13: {
                    n3 = t9d.c();
                    try {
                        try {
                            n2 = gt42.c9a;
                            if (n3 != 0) break block13;
                            if (n2 == 0) break block14;
                        }
                        catch (oov oov2) {
                            throw _zk.a(oov2);
                        }
                        n2 = gt42._me;
                    }
                    catch (oov oov3) {
                        throw _zk.a(oov3);
                    }
                }
                try {
                    block16: {
                        try {
                            try {
                                n = this.iz9;
                                if (n3 != 0) break block15;
                                if (n2 != n) break block16;
                            }
                            catch (oov oov4) {
                                throw _zk.a(oov4);
                            }
                            this.cdx -= (float)(this.pu6 * 2 / 3);
                            this._pr = -2.0f;
                            this.kg2();
                            if (n3 == 0) break block14;
                        }
                        catch (oov oov5) {
                            throw _zk.a(oov5);
                        }
                    }
                    n2 = gt42._me;
                    n = this.xq9;
                }
                catch (oov oov6) {
                    throw _zk.a(oov6);
                }
            }
            try {
                if (n2 == n) {
                    this.cdx += (float)(this.pu6 * 2 / 3);
                    this._pr = -2.0f;
                    this.kg2();
                }
            }
            catch (oov oov7) {
                throw _zk.a(oov7);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void t01(int var1_1, int var2_2, float var3_3) {
        block171: {
            block172: {
                block177: {
                    block178: {
                        block175: {
                            block176: {
                                block173: {
                                    block174: {
                                        block169: {
                                            block170: {
                                                block138: {
                                                    block139: {
                                                        block163: {
                                                            block140: {
                                                                block141: {
                                                                    block162: {
                                                                        block161: {
                                                                            block160: {
                                                                                block159: {
                                                                                    block158: {
                                                                                        block156: {
                                                                                            block157: {
                                                                                                block154: {
                                                                                                    block155: {
                                                                                                        block153: {
                                                                                                            block152: {
                                                                                                                block208: {
                                                                                                                    block150: {
                                                                                                                        block151: {
                                                                                                                            block149: {
                                                                                                                                block206: {
                                                                                                                                    block205: {
                                                                                                                                        block204: {
                                                                                                                                            block144: {
                                                                                                                                                block145: {
                                                                                                                                                    block148: {
                                                                                                                                                        block147: {
                                                                                                                                                            block146: {
                                                                                                                                                                block202: {
                                                                                                                                                                    block201: {
                                                                                                                                                                        block200: {
                                                                                                                                                                            block199: {
                                                                                                                                                                                block198: {
                                                                                                                                                                                    block197: {
                                                                                                                                                                                        block196: {
                                                                                                                                                                                            block195: {
                                                                                                                                                                                                block194: {
                                                                                                                                                                                                    block193: {
                                                                                                                                                                                                        block143: {
                                                                                                                                                                                                            block142: {
                                                                                                                                                                                                                block189: {
                                                                                                                                                                                                                    block188: {
                                                                                                                                                                                                                        block187: {
                                                                                                                                                                                                                            block186: {
                                                                                                                                                                                                                                block185: {
                                                                                                                                                                                                                                    block184: {
                                                                                                                                                                                                                                        block183: {
                                                                                                                                                                                                                                            block182: {
                                                                                                                                                                                                                                                block181: {
                                                                                                                                                                                                                                                    block180: {
                                                                                                                                                                                                                                                        block179: {
                                                                                                                                                                                                                                                            this.__a = var1_1;
                                                                                                                                                                                                                                                            this.qjv = var2_2;
                                                                                                                                                                                                                                                            this.lec();
                                                                                                                                                                                                                                                            var5_4 = this.osm();
                                                                                                                                                                                                                                                            var4_5 = t9d.c();
                                                                                                                                                                                                                                                            var6_6 = this.w3q();
                                                                                                                                                                                                                                                            var7_7 = var6_6 + 6;
                                                                                                                                                                                                                                                            v0 = var1_1;
                                                                                                                                                                                                                                                            if (var4_5 != 0) break block138;
                                                                                                                                                                                                                                                            if (v0 <= this.ll_) break block139;
                                                                                                                                                                                                                                                            break block179;
                                                                                                                                                                                                                                                            catch (IOException v1) {
                                                                                                                                                                                                                                                                throw _zk.a(v1);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        v0 = var1_1;
                                                                                                                                                                                                                                                        if (var4_5 != 0) break block138;
                                                                                                                                                                                                                                                        break block180;
                                                                                                                                                                                                                                                        catch (IOException v2) {
                                                                                                                                                                                                                                                            throw _zk.a(v2);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (v0 >= this.v5s) break block139;
                                                                                                                                                                                                                                                    break block181;
                                                                                                                                                                                                                                                    catch (IOException v3) {
                                                                                                                                                                                                                                                        throw _zk.a(v3);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                v0 = var2_2;
                                                                                                                                                                                                                                                if (var4_5 != 0) break block138;
                                                                                                                                                                                                                                                break block182;
                                                                                                                                                                                                                                                catch (IOException v4) {
                                                                                                                                                                                                                                                    throw _zk.a(v4);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (v0 <= this.ymi) break block139;
                                                                                                                                                                                                                                            break block183;
                                                                                                                                                                                                                                            catch (IOException v5) {
                                                                                                                                                                                                                                                throw _zk.a(v5);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        v0 = var2_2;
                                                                                                                                                                                                                                        if (var4_5 != 0) break block138;
                                                                                                                                                                                                                                        break block184;
                                                                                                                                                                                                                                        catch (IOException v6) {
                                                                                                                                                                                                                                            throw _zk.a(v6);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (v0 >= this.cms) break block139;
                                                                                                                                                                                                                                    break block185;
                                                                                                                                                                                                                                    catch (IOException v7) {
                                                                                                                                                                                                                                        throw _zk.a(v7);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                v8 = Mouse.isButtonDown((int)0);
                                                                                                                                                                                                                                if (var4_5 != 0) ** GOTO lbl408
                                                                                                                                                                                                                                break block186;
                                                                                                                                                                                                                                catch (IOException v9) {
                                                                                                                                                                                                                                    throw _zk.a(v9);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (!v8) break block140;
                                                                                                                                                                                                                            break block187;
                                                                                                                                                                                                                            catch (IOException v10) {
                                                                                                                                                                                                                                throw _zk.a(v10);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        v8 = this.u8l();
                                                                                                                                                                                                                        if (var4_5 != 0) ** GOTO lbl408
                                                                                                                                                                                                                        break block188;
                                                                                                                                                                                                                        catch (IOException v11) {
                                                                                                                                                                                                                            throw _zk.a(v11);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (!v8) break block140;
                                                                                                                                                                                                                    break block189;
                                                                                                                                                                                                                    catch (IOException v12) {
                                                                                                                                                                                                                        throw _zk.a(v12);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    block190: {
                                                                                                                                                                                                                        cfr_temp_0 = this._pr - -1.0f;
                                                                                                                                                                                                                        v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                        if (var4_5 != 0) break block141;
                                                                                                                                                                                                                        break block190;
                                                                                                                                                                                                                        catch (IOException v13) {
                                                                                                                                                                                                                            throw _zk.a(v13);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (v0 == 0) {
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    ** GOTO lbl384
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (IOException v14) {
                                                                                                                                                                                                                    throw _zk.a(v14);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                var12_8 = 1;
                                                                                                                                                                                                                v15 = var2_2;
                                                                                                                                                                                                                v16 = this.ymi;
                                                                                                                                                                                                                if (var4_5 != 0) break block142;
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    block191: {
                                                                                                                                                                                                                        if (v15 < v16) ** GOTO lbl377
                                                                                                                                                                                                                        break block191;
                                                                                                                                                                                                                        catch (IOException v17) {
                                                                                                                                                                                                                            throw _zk.a(v17);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v15 = var2_2;
                                                                                                                                                                                                                    v16 = this.cms;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (IOException v18) {
                                                                                                                                                                                                                    throw _zk.a(v18);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (var4_5 != 0) break block143;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                block192: {
                                                                                                                                                                                                                    if (v15 > v16) ** GOTO lbl377
                                                                                                                                                                                                                    break block192;
                                                                                                                                                                                                                    catch (IOException v19) {
                                                                                                                                                                                                                        throw _zk.a(v19);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                v15 = this.fux / 2;
                                                                                                                                                                                                                v16 = this.e14() / 2;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (IOException v20) {
                                                                                                                                                                                                                throw _zk.a(v20);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        var13_11 = v15 - v16;
                                                                                                                                                                                                        var8_13 = this.fux / 2 + this.e14() / 2;
                                                                                                                                                                                                        var9_14 = var2_2 - this.ymi - this.s63 + (int)this.cdx - 4;
                                                                                                                                                                                                        var14_15 = var9_14 / this.pu6;
                                                                                                                                                                                                        v21 = var1_1;
                                                                                                                                                                                                        v22 = var13_11;
                                                                                                                                                                                                        if (var4_5 != 0) break block144;
                                                                                                                                                                                                        if (v21 < v22) ** GOTO lbl231
                                                                                                                                                                                                        break block193;
                                                                                                                                                                                                        catch (IOException v23) {
                                                                                                                                                                                                            throw _zk.a(v23);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v21 = var1_1;
                                                                                                                                                                                                    v22 = var8_13;
                                                                                                                                                                                                    if (var4_5 != 0) break block144;
                                                                                                                                                                                                    break block194;
                                                                                                                                                                                                    catch (IOException v24) {
                                                                                                                                                                                                        throw _zk.a(v24);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                if (v21 > v22) ** GOTO lbl231
                                                                                                                                                                                                break block195;
                                                                                                                                                                                                catch (IOException v25) {
                                                                                                                                                                                                    throw _zk.a(v25);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            v21 = var14_15;
                                                                                                                                                                                            if (var4_5 != 0) break block145;
                                                                                                                                                                                            break block196;
                                                                                                                                                                                            catch (IOException v26) {
                                                                                                                                                                                                throw _zk.a(v26);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        if (v21 < 0) ** GOTO lbl231
                                                                                                                                                                                        break block197;
                                                                                                                                                                                        catch (IOException v27) {
                                                                                                                                                                                            throw _zk.a(v27);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    v21 = var9_14;
                                                                                                                                                                                    if (var4_5 != 0) break block145;
                                                                                                                                                                                    break block198;
                                                                                                                                                                                    catch (IOException v28) {
                                                                                                                                                                                        throw _zk.a(v28);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                if (v21 < 0) ** GOTO lbl231
                                                                                                                                                                                break block199;
                                                                                                                                                                                catch (IOException v29) {
                                                                                                                                                                                    throw _zk.a(v29);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            v21 = var14_15;
                                                                                                                                                                            v22 = var5_4;
                                                                                                                                                                            if (var4_5 != 0) break block144;
                                                                                                                                                                            break block200;
                                                                                                                                                                            catch (IOException v30) {
                                                                                                                                                                                throw _zk.a(v30);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        if (v21 >= v22) ** GOTO lbl231
                                                                                                                                                                        break block201;
                                                                                                                                                                        catch (IOException v31) {
                                                                                                                                                                            throw _zk.a(v31);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    v32 = var14_15;
                                                                                                                                                                    if (var4_5 != 0) break block146;
                                                                                                                                                                    break block202;
                                                                                                                                                                    catch (IOException v33) {
                                                                                                                                                                        throw _zk.a(v33);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    block203: {
                                                                                                                                                                        if (v32 != this.qx9) break block147;
                                                                                                                                                                        break block203;
                                                                                                                                                                        catch (IOException v34) {
                                                                                                                                                                            throw _zk.a(v34);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    cfr_temp_1 = c05.qgs() - this.dy2 - 250L;
                                                                                                                                                                    v32 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                                                                                                                                }
                                                                                                                                                                catch (IOException v35) {
                                                                                                                                                                    throw _zk.a(v35);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                if (var4_5 != 0) break block148;
                                                                                                                                                                if (v32 >= 0) break block147;
                                                                                                                                                            }
                                                                                                                                                            catch (IOException v36) {
                                                                                                                                                                throw _zk.a(v36);
                                                                                                                                                            }
                                                                                                                                                            v32 = 1;
                                                                                                                                                            break block148;
                                                                                                                                                        }
                                                                                                                                                        v32 = 0;
                                                                                                                                                    }
                                                                                                                                                    var15_16 = v32;
                                                                                                                                                    try {
                                                                                                                                                        this.f41(var14_15, (boolean)var15_16, var1_1, var2_2);
                                                                                                                                                        this.qx9 = var14_15;
                                                                                                                                                        this.dy2 = c05.qgs();
                                                                                                                                                        if (var4_5 == 0) break block149;
lbl231:
                                                                                                                                                        // 6 sources

                                                                                                                                                        v21 = var1_1;
                                                                                                                                                    }
                                                                                                                                                    catch (IOException v37) {
                                                                                                                                                        throw _zk.a(v37);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                v22 = var13_11;
                                                                                                                                            }
                                                                                                                                            if (var4_5 != 0) break block150;
                                                                                                                                            if (v21 < v22) break block149;
                                                                                                                                            break block204;
                                                                                                                                            catch (IOException v38) {
                                                                                                                                                throw _zk.a(v38);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v21 = var1_1;
                                                                                                                                        v22 = var8_13;
                                                                                                                                        if (var4_5 != 0) break block150;
                                                                                                                                        break block205;
                                                                                                                                        catch (IOException v39) {
                                                                                                                                            throw _zk.a(v39);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (v21 > v22) break block149;
                                                                                                                                    break block206;
                                                                                                                                    catch (IOException v40) {
                                                                                                                                        throw _zk.a(v40);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    block207: {
                                                                                                                                        v21 = var9_14;
                                                                                                                                        if (var4_5 != 0) break block151;
                                                                                                                                        break block207;
                                                                                                                                        catch (IOException v41) {
                                                                                                                                            throw _zk.a(v41);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (v21 >= 0) break block149;
                                                                                                                                }
                                                                                                                                catch (IOException v42) {
                                                                                                                                    throw _zk.a(v42);
                                                                                                                                }
                                                                                                                                this.xdy(var1_1 - var13_11, var2_2 - this.ymi + (int)this.cdx - 4);
                                                                                                                                var12_8 = 0;
                                                                                                                            }
                                                                                                                            v21 = var1_1;
                                                                                                                        }
                                                                                                                        v22 = var6_6;
                                                                                                                    }
                                                                                                                    if (var4_5 != 0) break block152;
                                                                                                                    if (v21 < v22) ** GOTO lbl355
                                                                                                                    break block208;
                                                                                                                    catch (IOException v43) {
                                                                                                                        throw _zk.a(v43);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    block209: {
                                                                                                                        v21 = var1_1;
                                                                                                                        if (var4_5 != 0) break block153;
                                                                                                                        break block209;
                                                                                                                        catch (IOException v44) {
                                                                                                                            throw _zk.a(v44);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v22 = var7_7;
                                                                                                                }
                                                                                                                catch (IOException v45) {
                                                                                                                    throw _zk.a(v45);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                if (v21 <= v22) {
                                                                                                                    this.mdk = -1.0f;
                                                                                                                    v21 = this.g1g();
                                                                                                                }
                                                                                                                ** GOTO lbl355
                                                                                                            }
                                                                                                            catch (IOException v46) {
                                                                                                                throw _zk.a(v46);
                                                                                                            }
                                                                                                        }
                                                                                                        var11_17 = v21;
                                                                                                        try {
                                                                                                            v47 = var11_17;
                                                                                                            v48 = 1;
                                                                                                            if (var4_5 != 0) break block154;
                                                                                                            if (v47 >= v48) break block155;
                                                                                                        }
                                                                                                        catch (IOException v49) {
                                                                                                            throw _zk.a(v49);
                                                                                                        }
                                                                                                        var11_17 = 1;
                                                                                                    }
                                                                                                    v47 = this.cms - this.ymi;
                                                                                                    v48 = this.cms - this.ymi;
                                                                                                }
                                                                                                var10_18 = (int)((float)(v47 * v48) / (float)this.lty());
                                                                                                try {
                                                                                                    v50 = var10_18;
                                                                                                    v51 = 32;
                                                                                                    if (var4_5 != 0) break block156;
                                                                                                    if (v50 >= v51) break block157;
                                                                                                }
                                                                                                catch (IOException v52) {
                                                                                                    throw _zk.a(v52);
                                                                                                }
                                                                                                var10_18 = 32;
                                                                                            }
                                                                                            v50 = var10_18;
                                                                                            v51 = this.cms - this.ymi - 8;
                                                                                        }
                                                                                        if (var4_5 != 0) break block158;
                                                                                        try {
                                                                                            block210: {
                                                                                                if (v50 <= v51) break block159;
                                                                                                break block210;
                                                                                                catch (IOException v53) {
                                                                                                    throw _zk.a(v53);
                                                                                                }
                                                                                            }
                                                                                            v50 = this.cms - this.ymi;
                                                                                            v51 = 8;
                                                                                        }
                                                                                        catch (IOException v54) {
                                                                                            throw _zk.a(v54);
                                                                                        }
                                                                                    }
                                                                                    var10_18 = v50 - v51;
                                                                                }
                                                                                try {
                                                                                    this.mdk /= (float)(this.cms - this.ymi - var10_18) / (float)var11_17;
                                                                                    if (var4_5 == 0) break block160;
lbl355:
                                                                                    // 3 sources

                                                                                    this.mdk = 1.0f;
                                                                                }
                                                                                catch (IOException v55) {
                                                                                    throw _zk.a(v55);
                                                                                }
                                                                            }
                                                                            if (var12_8 == 0) ** GOTO lbl368
                                                                            try {
                                                                                block211: {
                                                                                    this._pr = var2_2;
                                                                                    if (var4_5 == 0) break block161;
                                                                                    break block211;
                                                                                    catch (IOException v56) {
                                                                                        throw _zk.a(v56);
                                                                                    }
                                                                                }
                                                                                this._pr = -2.0f;
                                                                            }
                                                                            catch (IOException v57) {
                                                                                throw _zk.a(v57);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (var4_5 == 0) break block162;
lbl377:
                                                                            // 3 sources

                                                                            this._pr = -2.0f;
                                                                        }
                                                                        catch (IOException v58) {
                                                                            throw _zk.a(v58);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (var4_5 == 0) break block139;
lbl384:
                                                                        // 2 sources

                                                                        v0 = (cfr_temp_2 = this._pr - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                                    }
                                                                    catch (IOException v59) {
                                                                        throw _zk.a(v59);
                                                                    }
                                                                }
                                                                if (var4_5 != 0) break block138;
                                                                try {
                                                                    block212: {
                                                                        if (v0 < 0) break block139;
                                                                        break block212;
                                                                        catch (IOException v60) {
                                                                            throw _zk.a(v60);
                                                                        }
                                                                    }
                                                                    this.cdx -= ((float)var2_2 - this._pr) * this.mdk;
                                                                    this._pr = var2_2;
                                                                    if (var4_5 == 0) break block139;
                                                                }
                                                                catch (IOException v61) {
                                                                    throw _zk.a(v61);
                                                                }
                                                            }
                                                            try {
                                                                do {
                                                                    block165: {
                                                                        block167: {
                                                                            block168: {
                                                                                block166: {
                                                                                    block215: {
                                                                                        block164: {
                                                                                            block213: {
                                                                                                v8 = this._ny.oxn.mg8;
lbl408:
                                                                                                // 4 sources

                                                                                                if (v8) break block163;
                                                                                                v0 = (int)Mouse.next();
                                                                                                if (var4_5 != 0) break block138;
                                                                                                break block213;
                                                                                                catch (IOException v62) {
                                                                                                    throw _zk.a(v62);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                block214: {
                                                                                                    if (var4_5 != 0) break block164;
                                                                                                    break block214;
                                                                                                    catch (IOException v63) {
                                                                                                        throw _zk.a(v63);
                                                                                                    }
                                                                                                }
                                                                                                if (v0 == 0) break block163;
                                                                                            }
                                                                                            catch (IOException v64) {
                                                                                                throw _zk.a(v64);
                                                                                            }
                                                                                            v65 = Mouse.getEventDWheel();
                                                                                        }
                                                                                        var12_8 = v65;
                                                                                        if (var4_5 != 0) continue;
                                                                                        if (var12_8 == false) break block165;
                                                                                        break block215;
                                                                                        catch (IOException v66) {
                                                                                            throw _zk.a(v66);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        block216: {
                                                                                            v67 = var12_8;
                                                                                            if (var4_5 != 0) break block166;
                                                                                            break block216;
                                                                                            catch (IOException v68) {
                                                                                                throw _zk.a(v68);
                                                                                            }
                                                                                        }
                                                                                        if (v67 > 0) {
                                                                                        }
                                                                                        ** GOTO lbl452
                                                                                    }
                                                                                    catch (IOException v69) {
                                                                                        throw _zk.a(v69);
                                                                                    }
                                                                                    var12_8 = -1;
                                                                                    try {
                                                                                        if (var4_5 == 0) break block167;
lbl452:
                                                                                        // 2 sources

                                                                                        v67 = var12_8;
                                                                                    }
                                                                                    catch (IOException v70) {
                                                                                        throw _zk.a(v70);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (var4_5 != 0) break block168;
                                                                                    if (v67 >= 0) break block167;
                                                                                }
                                                                                catch (IOException v71) {
                                                                                    throw _zk.a(v71);
                                                                                }
                                                                                v67 = 1;
                                                                            }
                                                                            var12_8 = v67;
                                                                        }
                                                                        this.cdx += (float)(var12_8 * this.pu6 / 2);
                                                                    }
                                                                    this._ny.u0y.handleMouseInput();
                                                                } while (var4_5 == 0);
                                                            }
                                                            catch (IOException var12_9) {
                                                                var12_9.printStackTrace();
                                                            }
                                                        }
                                                        this._pr = -1.0f;
                                                    }
                                                    this.kg2();
                                                    GL11.glDisable((int)2896);
                                                    v0 = 2912;
                                                }
                                                GL11.glDisable((int)v0);
                                                var12_10 = jom.yut();
                                                var13_12 = var12_10.zuq();
                                                b0t.oc3(0.0f, 0.0f, 0.0f, 0.0f, this.ll_, this.ymi, this.ll_, this.ymi, this.ll_, this.ymi);
                                                var8_13 = this.ll_ + this.fux / 2 - this.e14() / 2 + 2;
                                                var9_14 = this.ymi + 4 - (int)this.cdx;
                                                try {
                                                    try {
                                                        v72 = this.we6;
                                                        if (var4_5 != 0) break block169;
                                                        if (v72 == 0) break block170;
                                                    }
                                                    catch (IOException v73) {
                                                        throw _zk.a(v73);
                                                    }
                                                    this.zot(var8_13, var9_14, jom.yut());
                                                }
                                                catch (IOException v74) {
                                                    throw _zk.a(v74);
                                                }
                                            }
                                            this.pci(var8_13, var9_14, var1_1, var2_2);
                                            GL11.glDisable((int)2929);
                                            v72 = 4;
                                        }
                                        var14_15 = v72;
                                        this.vfu(0, this.ymi, 255, 255);
                                        this.vfu(this.cms, this.k24, 255, 255);
                                        GL11.glEnable((int)3042);
                                        gis.y03(770, 771, 0, 1);
                                        GL11.glDisable((int)3008);
                                        GL11.glShadeModel((int)7425);
                                        GL11.glDisable((int)3553);
                                        var13_12.ezr(7, gnl.rad);
                                        var13_12.g5o(this.ll_, this.ymi + var14_15, 0.0).h0a(0.0, 1.0).fje(0, 0, 0, 0).pzw();
                                        var13_12.g5o(this.v5s, this.ymi + var14_15, 0.0).h0a(1.0, 1.0).fje(0, 0, 0, 0).pzw();
                                        var13_12.g5o(this.v5s, this.ymi, 0.0).h0a(1.0, 0.0).fje(0, 0, 0, 255).pzw();
                                        var13_12.g5o(this.ll_, this.ymi, 0.0).h0a(0.0, 0.0).fje(0, 0, 0, 255).pzw();
                                        var12_10.q7g();
                                        var13_12.ezr(7, gnl.rad);
                                        var13_12.g5o(this.ll_, this.cms, 0.0).h0a(0.0, 1.0).fje(0, 0, 0, 255).pzw();
                                        var13_12.g5o(this.v5s, this.cms, 0.0).h0a(1.0, 1.0).fje(0, 0, 0, 255).pzw();
                                        var13_12.g5o(this.v5s, this.cms - var14_15, 0.0).h0a(1.0, 0.0).fje(0, 0, 0, 0).pzw();
                                        var13_12.g5o(this.ll_, this.cms - var14_15, 0.0).h0a(0.0, 0.0).fje(0, 0, 0, 0).pzw();
                                        var12_10.q7g();
                                        var11_17 = this.g1g();
                                        try {
                                            v75 = var11_17;
                                            if (var4_5 != 0) break block171;
                                            if (v75 <= 0) break block172;
                                        }
                                        catch (IOException v76) {
                                            throw _zk.a(v76);
                                        }
                                        var10_18 = (this.cms - this.ymi) * (this.cms - this.ymi) / this.lty();
                                        try {
                                            v77 = var10_18;
                                            v78 = 32;
                                            if (var4_5 != 0) break block173;
                                            if (v77 >= v78) break block174;
                                        }
                                        catch (IOException v79) {
                                            throw _zk.a(v79);
                                        }
                                        var10_18 = 32;
                                    }
                                    v77 = var10_18;
                                    v78 = this.cms - this.ymi - 8;
                                }
                                try {
                                    if (var4_5 != 0) break block175;
                                    if (v77 <= v78) break block176;
                                }
                                catch (IOException v80) {
                                    throw _zk.a(v80);
                                }
                                var10_18 = this.cms - this.ymi - 8;
                            }
                            v77 = (int)this.cdx * (this.cms - this.ymi - var10_18) / var11_17;
                            v78 = this.ymi;
                        }
                        var15_16 = v77 + v78;
                        try {
                            if (var4_5 != 0) break block177;
                            if (var15_16 >= this.ymi) break block178;
                        }
                        catch (IOException v81) {
                            throw _zk.a(v81);
                        }
                        var15_16 = this.ymi;
                    }
                    var13_12.ezr(7, gnl.rad);
                    var13_12.g5o(var6_6, this.cms, 0.0).h0a(0.0, 1.0).fje(0, 0, 0, 255).pzw();
                    var13_12.g5o(var7_7, this.cms, 0.0).h0a(1.0, 1.0).fje(0, 0, 0, 255).pzw();
                    var13_12.g5o(var7_7, this.ymi, 0.0).h0a(1.0, 0.0).fje(0, 0, 0, 255).pzw();
                    var13_12.g5o(var6_6, this.ymi, 0.0).h0a(0.0, 0.0).fje(0, 0, 0, 255).pzw();
                    var12_10.q7g();
                    var13_12.ezr(7, gnl.rad);
                    var13_12.g5o(var6_6, var15_16 + var10_18, 0.0).h0a(0.0, 1.0).fje(80, 80, 80, 255).pzw();
                    var13_12.g5o(var7_7, var15_16 + var10_18, 0.0).h0a(1.0, 1.0).fje(80, 80, 80, 255).pzw();
                    var13_12.g5o(var7_7, var15_16, 0.0).h0a(1.0, 0.0).fje(80, 80, 80, 255).pzw();
                    var13_12.g5o(var6_6, var15_16, 0.0).h0a(0.0, 0.0).fje(80, 80, 80, 255).pzw();
                    var12_10.q7g();
                    var13_12.ezr(7, gnl.rad);
                    var13_12.g5o(var6_6, var15_16 + var10_18 - 1, 0.0).h0a(0.0, 1.0).fje(192, 192, 192, 255).pzw();
                    var13_12.g5o(var7_7 - 1, var15_16 + var10_18 - 1, 0.0).h0a(1.0, 1.0).fje(192, 192, 192, 255).pzw();
                    var13_12.g5o(var7_7 - 1, var15_16, 0.0).h0a(1.0, 0.0).fje(192, 192, 192, 255).pzw();
                    var13_12.g5o(var6_6, var15_16, 0.0).h0a(0.0, 0.0).fje(192, 192, 192, 255).pzw();
                }
                var12_10.q7g();
            }
            this.zrl(var1_1, var2_2);
            GL11.glEnable((int)3553);
            GL11.glShadeModel((int)7424);
            GL11.glEnable((int)3008);
            v75 = 3042;
        }
        GL11.glDisable((int)v75);
    }

    public void zt8(boolean bl) {
        this._sv = bl;
    }

    public boolean u8l() {
        return this._sv;
    }

    public int e14() {
        return 250;
    }

    public void pci(int n, int n2, int n3, int n4) {
        int n5 = this.osm();
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        int n6 = 0;
        int n7 = t9d.c();
        while (n6 < n5) {
            block15: {
                block16: {
                    int n8;
                    _zk _zk2;
                    int n9;
                    int n10;
                    block20: {
                        block18: {
                            block19: {
                                int n11;
                                block17: {
                                    n10 = n2 + n6 * this.pu6 + this.s63;
                                    n9 = this.pu6 - 4;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n7 != 0) break block15;
                                                        if (n10 > this.cms) break block16;
                                                    }
                                                    catch (oov oov2) {
                                                        throw _zk.a(oov2);
                                                    }
                                                    n11 = n10 + n9;
                                                    if (n7 != 0) break block17;
                                                }
                                                catch (oov oov3) {
                                                    throw _zk.a(oov3);
                                                }
                                                if (n11 < this.ymi) break block16;
                                            }
                                            catch (oov oov4) {
                                                throw _zk.a(oov4);
                                            }
                                            _zk2 = this;
                                            if (n7 != 0) break block18;
                                        }
                                        catch (oov oov5) {
                                            throw _zk.a(oov5);
                                        }
                                        n11 = _zk2.czy ? 1 : 0;
                                    }
                                    catch (oov oov6) {
                                        throw _zk.a(oov6);
                                    }
                                }
                                try {
                                    try {
                                        if (n11 == 0) break block19;
                                        _zk2 = this;
                                        n8 = n6;
                                        if (n7 != 0) break block20;
                                    }
                                    catch (oov oov7) {
                                        throw _zk.a(oov7);
                                    }
                                    if (!_zk2.ie8(n8)) break block19;
                                }
                                catch (oov oov8) {
                                    throw _zk.a(oov8);
                                }
                                int n12 = this.ll_ + this.fux / 2 - this.e14() / 2;
                                int n13 = this.ll_ + this.fux / 2 + this.e14() / 2;
                                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                                GL11.glDisable((int)3553);
                                q3g2.ezr(7, gnl.rad);
                                q3g2.g5o(n12, n10 + n9 + 2, 0.0).h0a(0.0, 1.0).fje(128, 128, 128, 255).pzw();
                                q3g2.g5o(n13, n10 + n9 + 2, 0.0).h0a(1.0, 1.0).fje(128, 128, 128, 255).pzw();
                                q3g2.g5o(n13, n10 - 2, 0.0).h0a(1.0, 0.0).fje(128, 128, 128, 255).pzw();
                                q3g2.g5o(n12, n10 - 2, 0.0).h0a(0.0, 0.0).fje(128, 128, 128, 255).pzw();
                                q3g2.g5o(n12 + 1, n10 + n9 + 1, 0.0).h0a(0.0, 1.0).fje(0, 0, 0, 255).pzw();
                                q3g2.g5o(n13 - 1, n10 + n9 + 1, 0.0).h0a(1.0, 1.0).fje(0, 0, 0, 255).pzw();
                                q3g2.g5o(n13 - 1, n10 - 1, 0.0).h0a(1.0, 0.0).fje(0, 0, 0, 255).pzw();
                                q3g2.g5o(n12 + 1, n10 - 1, 0.0).h0a(0.0, 0.0).fje(0, 0, 0, 255).pzw();
                                jom2.q7g();
                                GL11.glEnable((int)3553);
                            }
                            _zk2 = this;
                        }
                        n8 = n6;
                    }
                    _zk2.bct(n8, n, n10, n9, n3, n4);
                }
                ++n6;
            }
            if (n7 == 0) continue;
        }
    }

    public int w3q() {
        return this.fux / 2 + 134;
    }

    private void vfu(int n, int n2, int n3, int n4) {
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        this._ny.l22().anl(sum.dj4);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f = 32.0f;
        q3g2.ezr(7, gnl.rad);
        q3g2.g5o(this.ll_, n2, 0.0).h0a(0.0, (float)n2 / f).fje(64, 64, 64, n4).pzw();
        q3g2.g5o(this.ll_ + this.fux, n2, 0.0).h0a((float)this.fux / f, (float)n2 / f).fje(64, 64, 64, n4).pzw();
        q3g2.g5o(this.ll_ + this.fux, n, 0.0).h0a((float)this.fux / f, (float)n / f).fje(64, 64, 64, n3).pzw();
        q3g2.g5o(this.ll_, n, 0.0).h0a(0.0, (float)n / f).fje(64, 64, 64, n3).pzw();
        jom2.q7g();
    }

    public void c1r(int n) {
        this.ll_ = n;
        this.v5s = n + this.fux;
    }

    public int f1e() {
        return this.pu6;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

