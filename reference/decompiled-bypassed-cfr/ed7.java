/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import org.lwjgl.input.Mouse;

public abstract class ed7 {
    public final c05 gk_;
    public int wde;
    public int io9;
    public int vem;
    public int chj;
    public int som;
    public int ytt;
    public final int qc1;
    private /* synthetic */ int sot;
    private /* synthetic */ int l8q;
    public int bgb;
    public int sng;
    public boolean n05 = true;
    public int n26 = -2;
    public float lej;
    public float fx8;
    public int qzy = -1;
    public long kjk;
    public boolean s4g = true;
    public boolean zy6 = true;
    public boolean bc8;
    public int vrd;
    private /* synthetic */ boolean gto;
    public boolean cwa = false;
    public int r3k = 0;
    public int puh = 0;

    public ed7(c05 c052, int n, int n2, int n3, int n4, int n5) {
        this.gto = true;
        this.gk_ = c052;
        this.wde = n;
        this.io9 = n2;
        this.vem = n3;
        this.chj = n4;
        this.qc1 = n5;
        this.ytt = 0;
        this.som = n;
    }

    public void scs(int n, int n2, int n3, int n4) {
        this.wde = n;
        this.io9 = n2;
        this.vem = n3;
        this.chj = n4;
        this.ytt = 0;
        this.som = n;
    }

    public void fai(boolean bl) {
        this.zy6 = bl;
    }

    public void lfu(boolean bl, int n) {
        block5: {
            int n2;
            block4: {
                int n3 = t9d.b();
                try {
                    ed7 ed72;
                    try {
                        this.bc8 = bl;
                        ed72 = this;
                        n2 = n;
                        if (n3 == 0) break block4;
                        ed72.vrd = n2;
                        if (bl) break block5;
                    }
                    catch (oov oov2) {
                        throw ed7.b(oov2);
                    }
                    ed72 = this;
                    n2 = 0;
                }
                catch (oov oov3) {
                    throw ed7.b(oov3);
                }
            }
            ed72.vrd = n2;
        }
    }

    public abstract int getSize();

    public abstract void elementClicked(int var1, boolean var2, int var3, int var4);

    public abstract boolean isSelected(int var1);

    public int getContentHeight() {
        return this.getSize() * this.qc1 + this.vrd;
    }

    public abstract void drawBackground();

    public void dm2(int n, int n2, int n3) {
    }

    public abstract void drawSlot(int var1, int var2, int var3, int var4, int var5, int var6);

    public void xwh(int n, int n2, jom jom2) {
    }

    public void n_7(int n, int n2) {
    }

    public void fbo(int n, int n2) {
    }

    public int dwe(int n, int n2) {
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
                                    int n9 = this.ytt + this.wde / 2 - this.getListWidth() / 2;
                                    n8 = this.ytt + this.wde / 2 + this.getListWidth() / 2;
                                    n5 = t9d.b();
                                    n6 = n2 - this.vem - this.vrd + (int)this.fx8 - 4;
                                    n4 = n6 / this.qc1;
                                    try {
                                        try {
                                            n3 = n;
                                            n7 = this.getScrollBarX();
                                            if (n5 == 0) break block19;
                                            if (n3 >= n7) break block20;
                                        }
                                        catch (oov oov2) {
                                            throw ed7.b(oov2);
                                        }
                                        n3 = n;
                                        n7 = n9;
                                    }
                                    catch (oov oov3) {
                                        throw ed7.b(oov3);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (n5 == 0) break block21;
                                            if (n3 < n7) break block20;
                                        }
                                        catch (oov oov4) {
                                            throw ed7.b(oov4);
                                        }
                                        n3 = n;
                                        if (n5 == 0) break block22;
                                    }
                                    catch (oov oov5) {
                                        throw ed7.b(oov5);
                                    }
                                    n7 = n8;
                                }
                                catch (oov oov6) {
                                    throw ed7.b(oov6);
                                }
                            }
                            if (n3 > n7) break block20;
                            n3 = n4;
                        }
                        try {
                            if (n5 == 0) break block23;
                            if (n3 < 0) break block20;
                        }
                        catch (oov oov7) {
                            throw ed7.b(oov7);
                        }
                        n3 = n6;
                    }
                    try {
                        if (n5 == 0) break block24;
                        if (n3 < 0) break block20;
                    }
                    catch (oov oov8) {
                        throw ed7.b(oov8);
                    }
                    n3 = n4;
                }
                try {
                    try {
                        if (n5 == 0) break block25;
                        if (n3 >= this.getSize()) break block20;
                    }
                    catch (oov oov9) {
                        throw ed7.b(oov9);
                    }
                    n3 = n4;
                    break block25;
                }
                catch (oov oov10) {
                    throw ed7.b(oov10);
                }
            }
            n3 = -1;
        }
        return n3;
    }

    public void x9x(int n, int n2) {
        this.sot = n;
        this.l8q = n2;
    }

    public void zn9() {
        this.fx8 = fe6._f3(this.fx8, 0.0f, this.w1w());
    }

    public int w1w() {
        return Math.max(0, this.getContentHeight() - (this.chj - this.vem - 4));
    }

    public int hc1() {
        return (int)this.fx8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean gti(int n) {
        int n2;
        int n3;
        block16: {
            int n4;
            block15: {
                block14: {
                    n4 = t9d.c();
                    try {
                        try {
                            n3 = n;
                            n2 = this.vem;
                            if (n4 != 0) break block14;
                            if (n3 < n2) return 0 != 0;
                        }
                        catch (oov oov2) {
                            throw ed7.b(oov2);
                        }
                        n3 = n;
                        n2 = this.chj;
                    }
                    catch (oov oov3) {
                        throw ed7.b(oov3);
                    }
                }
                try {
                    try {
                        if (n4 != 0) break block15;
                        if (n3 > n2) return 0 != 0;
                    }
                    catch (oov oov4) {
                        throw ed7.b(oov4);
                    }
                    n3 = this.bgb;
                    n2 = this.ytt;
                }
                catch (oov oov5) {
                    throw ed7.b(oov5);
                }
            }
            try {
                try {
                    try {
                        if (n4 != 0) break block16;
                        if (n3 < n2) return 0 != 0;
                    }
                    catch (oov oov6) {
                        throw ed7.b(oov6);
                    }
                    n3 = this.bgb;
                    if (n4 != 0) return n3 != 0;
                }
                catch (oov oov7) {
                    throw ed7.b(oov7);
                }
                n2 = this.som;
            }
            catch (oov oov8) {
                throw ed7.b(oov8);
            }
        }
        if (n3 > n2) return 0 != 0;
        return 1 != 0;
    }

    public void pg1(int n) {
        this.fx8 += (float)n;
        this.zn9();
        this.n26 = -2;
    }

    public void ncl(gt4 gt42) {
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
                            throw ed7.b(oov2);
                        }
                        n2 = gt42._me;
                    }
                    catch (oov oov3) {
                        throw ed7.b(oov3);
                    }
                }
                try {
                    block16: {
                        try {
                            try {
                                n = this.sot;
                                if (n3 != 0) break block15;
                                if (n2 != n) break block16;
                            }
                            catch (oov oov4) {
                                throw ed7.b(oov4);
                            }
                            this.fx8 -= (float)(this.qc1 * 2 / 3);
                            this.n26 = -2;
                            this.zn9();
                            if (n3 == 0) break block14;
                        }
                        catch (oov oov5) {
                            throw ed7.b(oov5);
                        }
                    }
                    n2 = gt42._me;
                    n = this.l8q;
                }
                catch (oov oov6) {
                    throw ed7.b(oov6);
                }
            }
            try {
                if (n2 == n) {
                    this.fx8 += (float)(this.qc1 * 2 / 3);
                    this.n26 = -2;
                    this.zn9();
                }
            }
            catch (oov oov7) {
                throw ed7.b(oov7);
            }
        }
    }

    public void j46(int n, int n2, float f) {
        block23: {
            int n3;
            block34: {
                block35: {
                    jom jom2;
                    block36: {
                        int n4;
                        int n5;
                        q3g q3g2;
                        int n6;
                        int n7;
                        block37: {
                            int n8;
                            int n9;
                            block32: {
                                int n10;
                                int n11;
                                block33: {
                                    int n12;
                                    block24: {
                                        block25: {
                                            int n13;
                                            block28: {
                                                block29: {
                                                    jom jom3;
                                                    block30: {
                                                        int n14;
                                                        int n15;
                                                        q3g q3g3;
                                                        int n16;
                                                        int n17;
                                                        block31: {
                                                            int n18;
                                                            block26: {
                                                                int n19;
                                                                int n20;
                                                                block27: {
                                                                    block22: {
                                                                        n9 = t9d.b();
                                                                        try {
                                                                            try {
                                                                                n12 = this.s4g;
                                                                                if (n9 == 0) break block22;
                                                                                if (n12 == 0) break block23;
                                                                            }
                                                                            catch (oov oov2) {
                                                                                throw ed7.b(oov2);
                                                                            }
                                                                            n12 = this.cwa;
                                                                        }
                                                                        catch (oov oov3) {
                                                                            throw ed7.b(oov3);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (n9 == 0) break block24;
                                                                        if (n12 == 0) break block25;
                                                                    }
                                                                    catch (oov oov4) {
                                                                        throw ed7.b(oov4);
                                                                    }
                                                                    this.bgb = n;
                                                                    this.sng = n2;
                                                                    this.drawBackground();
                                                                    n17 = this.getScrollBarX();
                                                                    n16 = n17 + 6;
                                                                    this.zn9();
                                                                    jom3 = jom.yut();
                                                                    q3g3 = jom3.zuq();
                                                                    hzu.spd();
                                                                    hzu.vtj();
                                                                    hzu.m_1();
                                                                    int n21 = 5;
                                                                    int n22 = this.ytt + (this.wde / 2 - (305 + n21) / 2) + this.r3k;
                                                                    int n23 = this.ytt + this.wde / 2 + (305 + n21) / 2 + this.puh;
                                                                    q3g3.ezr(7, gnl.rad);
                                                                    q3g3.g5o(n22, this.chj, 0.0).h0a(0.0, 1.0).fje(0, 0, 0, 120).pzw();
                                                                    q3g3.g5o(n23, this.chj, 0.0).h0a(1.0, 1.0).fje(0, 0, 0, 120).pzw();
                                                                    q3g3.g5o(n23, this.vem, 0.0).h0a(1.0, 0.0).fje(0, 0, 0, 120).pzw();
                                                                    q3g3.g5o(n22, this.vem, 0.0).h0a(0.0, 0.0).fje(0, 0, 0, 120).pzw();
                                                                    jom3.q7g();
                                                                    hzu.rqj();
                                                                    hzu.if9();
                                                                    hzu.ux6();
                                                                    n20 = this.ytt + this.wde / 2 - this.getListWidth() / 2 + 2;
                                                                    n19 = this.vem + 4 - (int)this.fx8;
                                                                    try {
                                                                        try {
                                                                            n18 = this.bc8;
                                                                            if (n9 == 0) break block26;
                                                                            if (n18 == 0) break block27;
                                                                        }
                                                                        catch (oov oov5) {
                                                                            throw ed7.b(oov5);
                                                                        }
                                                                        this.xwh(n20, n19, jom3);
                                                                    }
                                                                    catch (oov oov6) {
                                                                        throw ed7.b(oov6);
                                                                    }
                                                                }
                                                                this.ycp(n20, n19, n, n2);
                                                                hzu._o4();
                                                                n18 = 1;
                                                            }
                                                            int n24 = n18;
                                                            this.ukt(0, this.vem, 255, 255);
                                                            this.ukt(this.chj, this.io9, 255, 255);
                                                            hzu.spd();
                                                            hzu.u39(770, 771, 0, 1);
                                                            hzu.vtj();
                                                            hzu.nn9(7425);
                                                            hzu.m_1();
                                                            q3g3.ezr(7, gnl.rad);
                                                            q3g3.g5o(this.ytt, this.vem + n24, 0.0).h0a(0.0, 1.0).fje(255, 255, 255, 255).pzw();
                                                            q3g3.g5o(this.som, this.vem + n24, 0.0).h0a(1.0, 1.0).fje(255, 255, 255, 255).pzw();
                                                            q3g3.g5o(this.som, this.vem, 0.0).h0a(1.0, 0.0).fje(255, 255, 255, 255).pzw();
                                                            q3g3.g5o(this.ytt, this.vem, 0.0).h0a(0.0, 0.0).fje(255, 255, 255, 255).pzw();
                                                            jom3.q7g();
                                                            q3g3.ezr(7, gnl.rad);
                                                            q3g3.g5o(this.ytt, this.chj, 0.0).h0a(0.0, 1.0).fje(255, 255, 255, 255).pzw();
                                                            q3g3.g5o(this.som, this.chj, 0.0).h0a(1.0, 1.0).fje(255, 255, 255, 255).pzw();
                                                            q3g3.g5o(this.som, this.chj - n24, 0.0).h0a(1.0, 0.0).fje(255, 255, 255, 255).pzw();
                                                            q3g3.g5o(this.ytt, this.chj - n24, 0.0).h0a(0.0, 0.0).fje(255, 255, 255, 255).pzw();
                                                            jom3.q7g();
                                                            int n25 = this.w1w();
                                                            try {
                                                                n13 = n25;
                                                                if (n9 == 0) break block28;
                                                                if (n13 <= 0) break block29;
                                                            }
                                                            catch (oov oov7) {
                                                                throw ed7.b(oov7);
                                                            }
                                                            n15 = (this.chj - this.vem) * (this.chj - this.vem) / this.getContentHeight();
                                                            n15 = fe6.faa(n15, 32, this.chj - this.vem - 8);
                                                            n14 = (int)this.fx8 * (this.chj - this.vem - n15) / n25 + this.vem;
                                                            try {
                                                                if (n9 == 0) break block30;
                                                                if (n14 >= this.vem) break block31;
                                                            }
                                                            catch (oov oov8) {
                                                                throw ed7.b(oov8);
                                                            }
                                                            n14 = this.vem;
                                                        }
                                                        q3g3.ezr(7, gnl.rad);
                                                        q3g3.g5o(n17, (double)this.chj - 1.0, 0.0).h0a(0.0, 1.0).fje(0, 0, 0, 255).pzw();
                                                        q3g3.g5o(n16, (double)this.chj - 1.0, 0.0).h0a(1.0, 1.0).fje(0, 0, 0, 255).pzw();
                                                        q3g3.g5o(n16, (double)this.vem + 1.0, 0.0).h0a(1.0, 0.0).fje(0, 0, 0, 255).pzw();
                                                        q3g3.g5o(n17, (double)this.vem + 1.0, 0.0).h0a(0.0, 0.0).fje(0, 0, 0, 255).pzw();
                                                        jom3.q7g();
                                                        q3g3.ezr(7, gnl.rad);
                                                        q3g3.g5o(n17, n14 + n15 - 1, 0.0).h0a(0.0, 1.0).fje(128, 128, 128, 255).pzw();
                                                        q3g3.g5o(n16, n14 + n15 - 1, 0.0).h0a(1.0, 1.0).fje(128, 128, 128, 255).pzw();
                                                        q3g3.g5o(n16, (double)n14 + 1.0, 0.0).h0a(1.0, 0.0).fje(128, 128, 128, 255).pzw();
                                                        q3g3.g5o(n17, (double)n14 + 1.0, 0.0).h0a(0.0, 0.0).fje(128, 128, 128, 255).pzw();
                                                        jom3.q7g();
                                                        q3g3.ezr(7, gnl.rad);
                                                        q3g3.g5o(n17, n14 + n15 - 1 - 1, 0.0).h0a(0.0, 1.0).fje(192, 192, 192, 255).pzw();
                                                        q3g3.g5o(n16 - 1, n14 + n15 - 1 - 1, 0.0).h0a(1.0, 1.0).fje(192, 192, 192, 255).pzw();
                                                        q3g3.g5o(n16 - 1, (double)n14 + 1.0, 0.0).h0a(1.0, 0.0).fje(192, 192, 192, 255).pzw();
                                                        q3g3.g5o(n17, (double)n14 + 1.0, 0.0).h0a(0.0, 0.0).fje(192, 192, 192, 255).pzw();
                                                    }
                                                    jom3.q7g();
                                                }
                                                this.fbo(n, n2);
                                                hzu.rqj();
                                                n13 = 7424;
                                            }
                                            hzu.nn9(n13);
                                            hzu.if9();
                                            hzu.ux6();
                                            return;
                                        }
                                        this.bgb = n;
                                        this.sng = n2;
                                        this.drawBackground();
                                        n12 = this.getScrollBarX();
                                    }
                                    n7 = n12;
                                    n6 = n7 + 6;
                                    this.zn9();
                                    hzu.fpt();
                                    hzu.gcp();
                                    jom2 = jom.yut();
                                    q3g2 = jom2.zuq();
                                    this.gk_.l22().anl(b0t.yby);
                                    hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
                                    float f2 = 32.0f;
                                    q3g2.ezr(7, gnl.rad);
                                    q3g2.g5o(this.ytt, this.chj, 0.0).h0a((float)this.ytt / f2, (float)(this.chj + (int)this.fx8) / f2).fje(32, 32, 32, 255).pzw();
                                    q3g2.g5o(this.som, this.chj, 0.0).h0a((float)this.som / f2, (float)(this.chj + (int)this.fx8) / f2).fje(32, 32, 32, 255).pzw();
                                    q3g2.g5o(this.som, this.vem, 0.0).h0a((float)this.som / f2, (float)(this.vem + (int)this.fx8) / f2).fje(32, 32, 32, 255).pzw();
                                    q3g2.g5o(this.ytt, this.vem, 0.0).h0a((float)this.ytt / f2, (float)(this.vem + (int)this.fx8) / f2).fje(32, 32, 32, 255).pzw();
                                    jom2.q7g();
                                    n11 = this.ytt + this.wde / 2 - this.getListWidth() / 2 + 2;
                                    n10 = this.vem + 4 - (int)this.fx8;
                                    try {
                                        try {
                                            n8 = this.bc8;
                                            if (n9 == 0) break block32;
                                            if (n8 == 0) break block33;
                                        }
                                        catch (oov oov9) {
                                            throw ed7.b(oov9);
                                        }
                                        this.xwh(n11, n10, jom2);
                                    }
                                    catch (oov oov10) {
                                        throw ed7.b(oov10);
                                    }
                                }
                                this.ycp(n11, n10, n, n2);
                                hzu._o4();
                                n8 = 4;
                            }
                            int n26 = n8;
                            this.ukt(0, this.vem, 255, 255);
                            this.ukt(this.chj, this.io9, 255, 255);
                            hzu.spd();
                            hzu.u39(770, 771, 0, 1);
                            hzu.vtj();
                            hzu.nn9(7425);
                            hzu.m_1();
                            q3g2.ezr(7, gnl.rad);
                            q3g2.g5o(this.ytt, this.vem + n26, 0.0).h0a(0.0, 1.0).fje(0, 0, 0, 0).pzw();
                            q3g2.g5o(this.som, this.vem + n26, 0.0).h0a(1.0, 1.0).fje(0, 0, 0, 0).pzw();
                            q3g2.g5o(this.som, this.vem, 0.0).h0a(1.0, 0.0).fje(0, 0, 0, 255).pzw();
                            q3g2.g5o(this.ytt, this.vem, 0.0).h0a(0.0, 0.0).fje(0, 0, 0, 255).pzw();
                            jom2.q7g();
                            q3g2.ezr(7, gnl.rad);
                            q3g2.g5o(this.ytt, this.chj, 0.0).h0a(0.0, 1.0).fje(0, 0, 0, 255).pzw();
                            q3g2.g5o(this.som, this.chj, 0.0).h0a(1.0, 1.0).fje(0, 0, 0, 255).pzw();
                            q3g2.g5o(this.som, this.chj - n26, 0.0).h0a(1.0, 0.0).fje(0, 0, 0, 0).pzw();
                            q3g2.g5o(this.ytt, this.chj - n26, 0.0).h0a(0.0, 0.0).fje(0, 0, 0, 0).pzw();
                            jom2.q7g();
                            int n27 = this.w1w();
                            try {
                                n3 = n27;
                                if (n9 == 0) break block34;
                                if (n3 <= 0) break block35;
                            }
                            catch (oov oov11) {
                                throw ed7.b(oov11);
                            }
                            n5 = (this.chj - this.vem) * (this.chj - this.vem) / this.getContentHeight();
                            n5 = fe6.faa(n5, 32, this.chj - this.vem - 8);
                            n4 = (int)this.fx8 * (this.chj - this.vem - n5) / n27 + this.vem;
                            try {
                                if (n9 == 0) break block36;
                                if (n4 >= this.vem) break block37;
                            }
                            catch (oov oov12) {
                                throw ed7.b(oov12);
                            }
                            n4 = this.vem;
                        }
                        q3g2.ezr(7, gnl.rad);
                        q3g2.g5o(n7, this.chj, 0.0).h0a(0.0, 1.0).fje(0, 0, 0, 255).pzw();
                        q3g2.g5o(n6, this.chj, 0.0).h0a(1.0, 1.0).fje(0, 0, 0, 255).pzw();
                        q3g2.g5o(n6, this.vem, 0.0).h0a(1.0, 0.0).fje(0, 0, 0, 255).pzw();
                        q3g2.g5o(n7, this.vem, 0.0).h0a(0.0, 0.0).fje(0, 0, 0, 255).pzw();
                        jom2.q7g();
                        q3g2.ezr(7, gnl.rad);
                        q3g2.g5o(n7, n4 + n5, 0.0).h0a(0.0, 1.0).fje(128, 128, 128, 255).pzw();
                        q3g2.g5o(n6, n4 + n5, 0.0).h0a(1.0, 1.0).fje(128, 128, 128, 255).pzw();
                        q3g2.g5o(n6, n4, 0.0).h0a(1.0, 0.0).fje(128, 128, 128, 255).pzw();
                        q3g2.g5o(n7, n4, 0.0).h0a(0.0, 0.0).fje(128, 128, 128, 255).pzw();
                        jom2.q7g();
                        q3g2.ezr(7, gnl.rad);
                        q3g2.g5o(n7, n4 + n5 - 1, 0.0).h0a(0.0, 1.0).fje(192, 192, 192, 255).pzw();
                        q3g2.g5o(n6 - 1, n4 + n5 - 1, 0.0).h0a(1.0, 1.0).fje(192, 192, 192, 255).pzw();
                        q3g2.g5o(n6 - 1, n4, 0.0).h0a(1.0, 0.0).fje(192, 192, 192, 255).pzw();
                        q3g2.g5o(n7, n4, 0.0).h0a(0.0, 0.0).fje(192, 192, 192, 255).pzw();
                    }
                    jom2.q7g();
                }
                this.fbo(n, n2);
                hzu.rqj();
                n3 = 7424;
            }
            hzu.nn9(n3);
            hzu.if9();
            hzu.ux6();
        }
    }

    /*
     * Unable to fully structure code
     */
    public void gzb() {
        block150: {
            block178: {
                block179: {
                    block177: {
                        block176: {
                            block175: {
                                block174: {
                                    block157: {
                                        block158: {
                                            block173: {
                                                block159: {
                                                    block172: {
                                                        block170: {
                                                            block167: {
                                                                block168: {
                                                                    block169: {
                                                                        block166: {
                                                                            block165: {
                                                                                block160: {
                                                                                    block161: {
                                                                                        block164: {
                                                                                            block163: {
                                                                                                block162: {
                                                                                                    block156: {
                                                                                                        block151: {
                                                                                                            block152: {
                                                                                                                block153: {
                                                                                                                    block155: {
                                                                                                                        block149: {
                                                                                                                            var1_1 = t9d.c();
                                                                                                                            try {
                                                                                                                                v0 = this.gti(this.sng);
                                                                                                                                if (var1_1 != 0) break block149;
                                                                                                                                if (v0 == 0) break block150;
                                                                                                                            }
                                                                                                                            catch (oov v1) {
                                                                                                                                throw ed7.b(v1);
                                                                                                                            }
                                                                                                                            v0 = Mouse.getEventButton();
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    if (var1_1 != 0) break block151;
                                                                                                                                                    if (v0 != 0) break block152;
                                                                                                                                                }
                                                                                                                                                catch (oov v2) {
                                                                                                                                                    throw ed7.b(v2);
                                                                                                                                                }
                                                                                                                                                v0 = (int)Mouse.getEventButtonState();
                                                                                                                                                if (var1_1 != 0) break block151;
                                                                                                                                            }
                                                                                                                                            catch (oov v3) {
                                                                                                                                                throw ed7.b(v3);
                                                                                                                                            }
                                                                                                                                            if (v0 == 0) break block152;
                                                                                                                                        }
                                                                                                                                        catch (oov v4) {
                                                                                                                                            throw ed7.b(v4);
                                                                                                                                        }
                                                                                                                                        v0 = this.sng;
                                                                                                                                        if (var1_1 != 0) break block151;
                                                                                                                                    }
                                                                                                                                    catch (oov v5) {
                                                                                                                                        throw ed7.b(v5);
                                                                                                                                    }
                                                                                                                                    if (v0 < this.vem) break block152;
                                                                                                                                }
                                                                                                                                catch (oov v6) {
                                                                                                                                    throw ed7.b(v6);
                                                                                                                                }
                                                                                                                                v0 = this.sng;
                                                                                                                                if (var1_1 != 0) break block151;
                                                                                                                            }
                                                                                                                            catch (oov v7) {
                                                                                                                                throw ed7.b(v7);
                                                                                                                            }
                                                                                                                            if (v0 > this.chj) break block152;
                                                                                                                        }
                                                                                                                        catch (oov v8) {
                                                                                                                            throw ed7.b(v8);
                                                                                                                        }
                                                                                                                        var2_2 = (this.wde - this.getListWidth()) / 2;
                                                                                                                        var3_3 = (this.wde + this.getListWidth()) / 2;
                                                                                                                        var4_4 = this.sng - this.vem - this.vrd + (int)this.fx8 - 4;
                                                                                                                        var5_5 = var4_4 / this.qc1;
                                                                                                                        try {
                                                                                                                            block154: {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        v0 = var5_5;
                                                                                                                                                                        v9 = this.getSize();
                                                                                                                                                                        if (var1_1 != 0) break block153;
                                                                                                                                                                        if (v0 >= v9) break block154;
                                                                                                                                                                    }
                                                                                                                                                                    catch (oov v10) {
                                                                                                                                                                        throw ed7.b(v10);
                                                                                                                                                                    }
                                                                                                                                                                    v0 = this.bgb;
                                                                                                                                                                    v9 = var2_2;
                                                                                                                                                                    if (var1_1 != 0) break block153;
                                                                                                                                                                }
                                                                                                                                                                catch (oov v11) {
                                                                                                                                                                    throw ed7.b(v11);
                                                                                                                                                                }
                                                                                                                                                                if (v0 < v9) break block154;
                                                                                                                                                            }
                                                                                                                                                            catch (oov v12) {
                                                                                                                                                                throw ed7.b(v12);
                                                                                                                                                            }
                                                                                                                                                            v0 = this.bgb;
                                                                                                                                                            v9 = var3_3;
                                                                                                                                                            if (var1_1 != 0) break block153;
                                                                                                                                                        }
                                                                                                                                                        catch (oov v13) {
                                                                                                                                                            throw ed7.b(v13);
                                                                                                                                                        }
                                                                                                                                                        if (v0 > v9) break block154;
                                                                                                                                                    }
                                                                                                                                                    catch (oov v14) {
                                                                                                                                                        throw ed7.b(v14);
                                                                                                                                                    }
                                                                                                                                                    v0 = var5_5;
                                                                                                                                                    if (var1_1 != 0) break block155;
                                                                                                                                                }
                                                                                                                                                catch (oov v15) {
                                                                                                                                                    throw ed7.b(v15);
                                                                                                                                                }
                                                                                                                                                if (v0 < 0) break block154;
                                                                                                                                            }
                                                                                                                                            catch (oov v16) {
                                                                                                                                                throw ed7.b(v16);
                                                                                                                                            }
                                                                                                                                            v0 = var4_4;
                                                                                                                                            if (var1_1 != 0) break block155;
                                                                                                                                        }
                                                                                                                                        catch (oov v17) {
                                                                                                                                            throw ed7.b(v17);
                                                                                                                                        }
                                                                                                                                        if (v0 < 0) break block154;
                                                                                                                                    }
                                                                                                                                    catch (oov v18) {
                                                                                                                                        throw ed7.b(v18);
                                                                                                                                    }
                                                                                                                                    this.elementClicked(var5_5, false, this.bgb, this.sng);
                                                                                                                                    this.qzy = var5_5;
                                                                                                                                    if (var1_1 == 0) break block152;
                                                                                                                                }
                                                                                                                                catch (oov v19) {
                                                                                                                                    throw ed7.b(v19);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v0 = this.bgb;
                                                                                                                        }
                                                                                                                        catch (oov v20) {
                                                                                                                            throw ed7.b(v20);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (var1_1 != 0) break block151;
                                                                                                                        v9 = var2_2;
                                                                                                                    }
                                                                                                                    catch (oov v21) {
                                                                                                                        throw ed7.b(v21);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (v0 < v9) break block152;
                                                                                                                                    v0 = this.bgb;
                                                                                                                                    if (var1_1 != 0) break block151;
                                                                                                                                }
                                                                                                                                catch (oov v22) {
                                                                                                                                    throw ed7.b(v22);
                                                                                                                                }
                                                                                                                                if (v0 > var3_3) break block152;
                                                                                                                            }
                                                                                                                            catch (oov v23) {
                                                                                                                                throw ed7.b(v23);
                                                                                                                            }
                                                                                                                            v0 = var4_4;
                                                                                                                            if (var1_1 != 0) break block151;
                                                                                                                        }
                                                                                                                        catch (oov v24) {
                                                                                                                            throw ed7.b(v24);
                                                                                                                        }
                                                                                                                        if (v0 >= 0) break block152;
                                                                                                                    }
                                                                                                                    catch (oov v25) {
                                                                                                                        throw ed7.b(v25);
                                                                                                                    }
                                                                                                                    this.n_7(this.bgb - var2_2, this.sng - this.vem + (int)this.fx8 - 4);
                                                                                                                }
                                                                                                                catch (oov v26) {
                                                                                                                    throw ed7.b(v26);
                                                                                                                }
                                                                                                            }
                                                                                                            v0 = (int)Mouse.isButtonDown((int)0);
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (var1_1 != 0) break block156;
                                                                                                                    if (v0 != 0) {
                                                                                                                    }
                                                                                                                    ** GOTO lbl445
                                                                                                                }
                                                                                                                catch (oov v27) {
                                                                                                                    throw ed7.b(v27);
                                                                                                                }
                                                                                                                v28 = this;
                                                                                                                if (var1_1 != 0) break block157;
                                                                                                            }
                                                                                                            catch (oov v29) {
                                                                                                                throw ed7.b(v29);
                                                                                                            }
                                                                                                            v0 = (int)v28.d17();
                                                                                                        }
                                                                                                        catch (oov v30) {
                                                                                                            throw ed7.b(v30);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (v0 != 0) {
                                                                                                                v31 = this.n26;
                                                                                                                if (var1_1 != 0) break block158;
                                                                                                            }
                                                                                                            ** GOTO lbl445
                                                                                                        }
                                                                                                        catch (oov v32) {
                                                                                                            throw ed7.b(v32);
                                                                                                        }
                                                                                                        if (v31 == -1) {
                                                                                                        }
                                                                                                        ** GOTO lbl426
                                                                                                    }
                                                                                                    catch (oov v33) {
                                                                                                        throw ed7.b(v33);
                                                                                                    }
                                                                                                    var2_2 = 1;
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                v34 = this;
                                                                                                                if (var1_1 != 0) break block159;
                                                                                                                if (v34.sng >= this.vem) {
                                                                                                                }
                                                                                                                ** GOTO lbl417
                                                                                                            }
                                                                                                            catch (oov v35) {
                                                                                                                throw ed7.b(v35);
                                                                                                            }
                                                                                                            v34 = this;
                                                                                                            if (var1_1 != 0) break block159;
                                                                                                        }
                                                                                                        catch (oov v36) {
                                                                                                            throw ed7.b(v36);
                                                                                                        }
                                                                                                        if (v34.sng <= this.chj) {
                                                                                                        }
                                                                                                        ** GOTO lbl417
                                                                                                    }
                                                                                                    catch (oov v37) {
                                                                                                        throw ed7.b(v37);
                                                                                                    }
                                                                                                    var3_3 = (this.wde - this.getListWidth()) / 2;
                                                                                                    var4_4 = (this.wde + this.getListWidth()) / 2;
                                                                                                    var5_5 = this.sng - this.vem - this.vrd + (int)this.fx8 - 4;
                                                                                                    var6_6 = var5_5 / this.qc1;
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v38 = var6_6;
                                                                                                                                                    v39 = this.getSize();
                                                                                                                                                    if (var1_1 != 0) break block160;
                                                                                                                                                    if (v38 < v39) {
                                                                                                                                                    }
                                                                                                                                                    ** GOTO lbl312
                                                                                                                                                }
                                                                                                                                                catch (oov v40) {
                                                                                                                                                    throw ed7.b(v40);
                                                                                                                                                }
                                                                                                                                                v38 = this.bgb;
                                                                                                                                                v39 = var3_3;
                                                                                                                                                if (var1_1 != 0) break block160;
                                                                                                                                            }
                                                                                                                                            catch (oov v41) {
                                                                                                                                                throw ed7.b(v41);
                                                                                                                                            }
                                                                                                                                            if (v38 >= v39) {
                                                                                                                                            }
                                                                                                                                            ** GOTO lbl312
                                                                                                                                        }
                                                                                                                                        catch (oov v42) {
                                                                                                                                            throw ed7.b(v42);
                                                                                                                                        }
                                                                                                                                        v38 = this.bgb;
                                                                                                                                        v39 = var4_4;
                                                                                                                                        if (var1_1 != 0) break block160;
                                                                                                                                    }
                                                                                                                                    catch (oov v43) {
                                                                                                                                        throw ed7.b(v43);
                                                                                                                                    }
                                                                                                                                    if (v38 <= v39) {
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl312
                                                                                                                                }
                                                                                                                                catch (oov v44) {
                                                                                                                                    throw ed7.b(v44);
                                                                                                                                }
                                                                                                                                v38 = var6_6;
                                                                                                                                if (var1_1 != 0) break block161;
                                                                                                                            }
                                                                                                                            catch (oov v45) {
                                                                                                                                throw ed7.b(v45);
                                                                                                                            }
                                                                                                                            if (v38 >= 0) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl312
                                                                                                                        }
                                                                                                                        catch (oov v46) {
                                                                                                                            throw ed7.b(v46);
                                                                                                                        }
                                                                                                                        v38 = var5_5;
                                                                                                                        if (var1_1 != 0) break block161;
                                                                                                                    }
                                                                                                                    catch (oov v47) {
                                                                                                                        throw ed7.b(v47);
                                                                                                                    }
                                                                                                                    if (v38 >= 0) {
                                                                                                                    }
                                                                                                                    ** GOTO lbl312
                                                                                                                }
                                                                                                                catch (oov v48) {
                                                                                                                    throw ed7.b(v48);
                                                                                                                }
                                                                                                                v49 = var6_6;
                                                                                                                if (var1_1 != 0) break block162;
                                                                                                            }
                                                                                                            catch (oov v50) {
                                                                                                                throw ed7.b(v50);
                                                                                                            }
                                                                                                            if (v49 != this.qzy) break block163;
                                                                                                        }
                                                                                                        catch (oov v51) {
                                                                                                            throw ed7.b(v51);
                                                                                                        }
                                                                                                        cfr_temp_0 = c05.qgs() - this.kjk - 250L;
                                                                                                        v49 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                                    }
                                                                                                    catch (oov v52) {
                                                                                                        throw ed7.b(v52);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    if (var1_1 != 0) break block164;
                                                                                                    if (v49 >= 0) break block163;
                                                                                                }
                                                                                                catch (oov v53) {
                                                                                                    throw ed7.b(v53);
                                                                                                }
                                                                                                v49 = 1;
                                                                                                break block164;
                                                                                            }
                                                                                            v49 = 0;
                                                                                        }
                                                                                        var7_7 = v49;
                                                                                        try {
                                                                                            this.elementClicked(var6_6, (boolean)var7_7, this.bgb, this.sng);
                                                                                            this.qzy = var6_6;
                                                                                            this.kjk = c05.qgs();
                                                                                            if (var1_1 == 0) break block165;
lbl312:
                                                                                            // 6 sources

                                                                                            v38 = this.bgb;
                                                                                        }
                                                                                        catch (oov v54) {
                                                                                            throw ed7.b(v54);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (var1_1 != 0) break block166;
                                                                                        v39 = var3_3;
                                                                                    }
                                                                                    catch (oov v55) {
                                                                                        throw ed7.b(v55);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (v38 < v39) break block165;
                                                                                                v38 = this.bgb;
                                                                                                if (var1_1 != 0) break block166;
                                                                                            }
                                                                                            catch (oov v56) {
                                                                                                throw ed7.b(v56);
                                                                                            }
                                                                                            if (v38 > var4_4) break block165;
                                                                                        }
                                                                                        catch (oov v57) {
                                                                                            throw ed7.b(v57);
                                                                                        }
                                                                                        v38 = var5_5;
                                                                                        if (var1_1 != 0) break block166;
                                                                                    }
                                                                                    catch (oov v58) {
                                                                                        throw ed7.b(v58);
                                                                                    }
                                                                                    if (v38 >= 0) break block165;
                                                                                }
                                                                                catch (oov v59) {
                                                                                    throw ed7.b(v59);
                                                                                }
                                                                                this.n_7(this.bgb - var3_3, this.sng - this.vem + (int)this.fx8 - 4);
                                                                                var2_2 = 0;
                                                                            }
                                                                            v38 = this.getScrollBarX();
                                                                        }
                                                                        var7_7 = v38;
                                                                        var8_8 = var7_7 + 6;
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v60 = this;
                                                                                    if (var1_1 != 0) break block167;
                                                                                    if (v60.bgb >= var7_7) {
                                                                                    }
                                                                                    ** GOTO lbl394
                                                                                }
                                                                                catch (oov v61) {
                                                                                    throw ed7.b(v61);
                                                                                }
                                                                                v60 = this;
                                                                                if (var1_1 != 0) break block167;
                                                                            }
                                                                            catch (oov v62) {
                                                                                throw ed7.b(v62);
                                                                            }
                                                                            if (v60.bgb <= var8_8) {
                                                                            }
                                                                            ** GOTO lbl394
                                                                        }
                                                                        catch (oov v63) {
                                                                            throw ed7.b(v63);
                                                                        }
                                                                        this.lej = -1.0f;
                                                                        var9_9 = this.w1w();
                                                                        try {
                                                                            v64 = var9_9;
                                                                            v65 = 1;
                                                                            if (var1_1 != 0) break block168;
                                                                            if (v64 >= v65) break block169;
                                                                        }
                                                                        catch (oov v66) {
                                                                            throw ed7.b(v66);
                                                                        }
                                                                        var9_9 = 1;
                                                                    }
                                                                    v64 = this.chj - this.vem;
                                                                    v65 = this.chj - this.vem;
                                                                }
                                                                var10_10 = (int)((float)(v64 * v65) / (float)this.getContentHeight());
                                                                var10_10 = fe6.faa(var10_10, 32, this.chj - this.vem - 8);
                                                                try {
                                                                    this.lej /= (float)(this.chj - this.vem - var10_10) / (float)var9_9;
                                                                    if (var1_1 == 0) break block170;
lbl394:
                                                                    // 3 sources

                                                                    v60 = this;
                                                                }
                                                                catch (oov v67) {
                                                                    throw ed7.b(v67);
                                                                }
                                                            }
                                                            v60.lej = 1.0f;
                                                        }
                                                        try {
                                                            block171: {
                                                                try {
                                                                    if (var2_2 == 0) break block171;
                                                                    this.n26 = this.sng;
                                                                    if (var1_1 == 0) break block172;
                                                                }
                                                                catch (oov v68) {
                                                                    throw ed7.b(v68);
                                                                }
                                                            }
                                                            this.n26 = -2;
                                                        }
                                                        catch (oov v69) {
                                                            throw ed7.b(v69);
                                                        }
                                                    }
                                                    try {
                                                        if (var1_1 == 0) break block173;
lbl417:
                                                        // 3 sources

                                                        v34 = this;
                                                    }
                                                    catch (oov v70) {
                                                        throw ed7.b(v70);
                                                    }
                                                }
                                                v34.n26 = -2;
                                            }
                                            try {
                                                if (var1_1 == 0) break block174;
lbl426:
                                                // 2 sources

                                                v31 = this.n26;
                                            }
                                            catch (oov v71) {
                                                throw ed7.b(v71);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (var1_1 != 0) break block175;
                                                    if (v31 < 0) break block174;
                                                }
                                                catch (oov v72) {
                                                    throw ed7.b(v72);
                                                }
                                                this.fx8 -= (float)(this.sng - this.n26) * this.lej;
                                                this.n26 = this.sng;
                                                if (var1_1 == 0) break block174;
                                            }
                                            catch (oov v73) {
                                                throw ed7.b(v73);
                                            }
lbl445:
                                            // 3 sources

                                            v28 = this;
                                        }
                                        catch (oov v74) {
                                            throw ed7.b(v74);
                                        }
                                    }
                                    v28.n26 = -1;
                                }
                                v31 = Mouse.getEventDWheel();
                            }
                            var2_2 = v31;
                            try {
                                v75 = var2_2;
                                if (var1_1 != 0) break block176;
                                if (v75 == 0) break block150;
                            }
                            catch (oov v76) {
                                throw ed7.b(v76);
                            }
                            v75 = var2_2;
                        }
                        try {
                            if (var1_1 != 0) break block177;
                            if (v75 > 0) {
                            }
                            ** GOTO lbl474
                        }
                        catch (oov v77) {
                            throw ed7.b(v77);
                        }
                        var2_2 = -1;
                        try {
                            if (var1_1 == 0) break block178;
lbl474:
                            // 2 sources

                            v75 = var2_2;
                        }
                        catch (oov v78) {
                            throw ed7.b(v78);
                        }
                    }
                    try {
                        if (var1_1 != 0) break block179;
                        if (v75 >= 0) break block178;
                    }
                    catch (oov v79) {
                        throw ed7.b(v79);
                    }
                    v75 = 1;
                }
                var2_2 = v75;
            }
            this.fx8 += (float)(var2_2 * this.qc1 / 2);
        }
    }

    public void m9t(boolean bl) {
        this.gto = bl;
    }

    public boolean d17() {
        return this.gto;
    }

    public int getListWidth() {
        return 220;
    }

    /*
     * Unable to fully structure code
     */
    public void ycp(int var1_1, int var2_2, int var3_3, int var4_4) {
        var6_5 = this.getSize();
        var7_6 = jom.yut();
        var8_7 = var7_6.zuq();
        var5_8 = t9d.c();
        for (var9_9 = 0; var9_9 < var6_5; ++var9_9) {
            block22: {
                block20: {
                    block21: {
                        block18: {
                            block19: {
                                block17: {
                                    var10_10 = var2_2 + var9_9 * this.qc1 + this.vrd;
                                    var11_11 = this.qc1 - 4;
                                    try {
                                        try {
                                            try {
                                                v0 = var10_10;
                                                v1 = this.chj;
                                                if (var5_8 != 0) break block17;
                                                if (v0 <= v1) {
                                                }
                                                ** GOTO lbl31
                                            }
                                            catch (oov v2) {
                                                throw ed7.b(v2);
                                            }
                                            v0 = var10_10 + var11_11;
                                            if (var5_8 != 0) break block18;
                                        }
                                        catch (oov v3) {
                                            throw ed7.b(v3);
                                        }
                                        v1 = this.vem;
                                    }
                                    catch (oov v4) {
                                        throw ed7.b(v4);
                                    }
                                }
                                try {
                                    if (v0 >= v1) break block19;
lbl31:
                                    // 2 sources

                                    this.dm2(var9_9, var1_1, var10_10);
                                }
                                catch (oov v5) {
                                    throw ed7.b(v5);
                                }
                            }
                            try {
                                v6 = this;
                                if (var5_8 != 0) break block20;
                                v0 = (int)v6.zy6;
                            }
                            catch (oov v7) {
                                throw ed7.b(v7);
                            }
                        }
                        try {
                            try {
                                if (v0 == 0) break block21;
                                v6 = this;
                                v8 = var9_9;
                                if (var5_8 != 0) break block22;
                            }
                            catch (oov v9) {
                                throw ed7.b(v9);
                            }
                            if (!v6.isSelected(v8)) break block21;
                        }
                        catch (oov v10) {
                            throw ed7.b(v10);
                        }
                        var12_12 = this.ytt + (this.wde / 2 - this.getListWidth() / 2);
                        var13_13 = this.ytt + this.wde / 2 + this.getListWidth() / 2;
                        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
                        hzu.m_1();
                        var8_7.ezr(7, gnl.rad);
                        var8_7.g5o(var12_12, var10_10 + var11_11 + 2, 0.0).h0a(0.0, 1.0).fje(128, 128, 128, 255).pzw();
                        var8_7.g5o(var13_13, var10_10 + var11_11 + 2, 0.0).h0a(1.0, 1.0).fje(128, 128, 128, 255).pzw();
                        var8_7.g5o(var13_13, var10_10 - 2, 0.0).h0a(1.0, 0.0).fje(128, 128, 128, 255).pzw();
                        var8_7.g5o(var12_12, var10_10 - 2, 0.0).h0a(0.0, 0.0).fje(128, 128, 128, 255).pzw();
                        var8_7.g5o(var12_12 + 1, var10_10 + var11_11 + 1, 0.0).h0a(0.0, 1.0).fje(0, 0, 0, 255).pzw();
                        var8_7.g5o(var13_13 - 1, var10_10 + var11_11 + 1, 0.0).h0a(1.0, 1.0).fje(0, 0, 0, 255).pzw();
                        var8_7.g5o(var13_13 - 1, var10_10 - 1, 0.0).h0a(1.0, 0.0).fje(0, 0, 0, 255).pzw();
                        var8_7.g5o(var12_12 + 1, var10_10 - 1, 0.0).h0a(0.0, 0.0).fje(0, 0, 0, 255).pzw();
                        var7_6.q7g();
                        hzu.rqj();
                    }
                    v6 = this;
                }
                v8 = var9_9;
            }
            v6.drawSlot(v8, var1_1, var10_10, var11_11, var3_3, var4_4);
            if (var5_8 == 0) continue;
        }
    }

    public int getScrollBarX() {
        return this.wde / 2 + 124;
    }

    public void ukt(int n, int n2, int n3, int n4) {
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        this.gk_.l22().anl(b0t.yby);
        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
        float f = 32.0f;
        q3g2.ezr(7, gnl.rad);
        q3g2.g5o(this.ytt, n2, 0.0).h0a(0.0, (float)n2 / 32.0f).fje(64, 64, 64, n4).pzw();
        q3g2.g5o(this.ytt + this.wde, n2, 0.0).h0a((float)this.wde / 32.0f, (float)n2 / 32.0f).fje(64, 64, 64, n4).pzw();
        q3g2.g5o(this.ytt + this.wde, n, 0.0).h0a((float)this.wde / 32.0f, (float)n / 32.0f).fje(64, 64, 64, n3).pzw();
        q3g2.g5o(this.ytt, n, 0.0).h0a(0.0, (float)n / 32.0f).fje(64, 64, 64, n3).pzw();
        jom2.q7g();
    }

    public void pm4(int n) {
        this.ytt = n;
        this.som = n + this.wde;
    }

    public int m6f() {
        return this.qc1;
    }

    private static oov b(oov oov2) {
        return oov2;
    }
}

