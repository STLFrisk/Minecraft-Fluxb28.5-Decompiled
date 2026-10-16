/*
 * Decompiled with CFR 0.152.
 */
public class bdv
extends cjm {
    private final /* synthetic */ yqv hxk;
    private final /* synthetic */ float o5o;
    private /* synthetic */ float m6f;
    private /* synthetic */ boolean tv2;
    private /* synthetic */ int qbq;
    private /* synthetic */ int vxv;

    public bdv(yqv yqv2, float f) {
        this.hxk = yqv2;
        this.o5o = f;
        this.k23(7);
    }

    @Override
    public void mnp() {
        this.m6f = 0.0f;
    }

    @Override
    public void zly() {
        this.tv2 = false;
        this.m6f = 0.0f;
    }

    @Override
    public boolean vle() {
        boolean bl;
        block22: {
            block19: {
                block23: {
                    int n;
                    block21: {
                        i2h i2h2;
                        block20: {
                            block18: {
                                n = t9d.b();
                                try {
                                    try {
                                        i2h2 = this.hxk;
                                        if (n == 0) break block18;
                                        if (!i2h2.gzr()) break block19;
                                    }
                                    catch (oov oov2) {
                                        throw bdv.a(oov2);
                                    }
                                    i2h2 = this.hxk.wgv;
                                }
                                catch (oov oov3) {
                                    throw bdv.a(oov3);
                                }
                            }
                            try {
                                try {
                                    if (n == 0) break block20;
                                    if (i2h2 == null) break block19;
                                }
                                catch (oov oov4) {
                                    throw bdv.a(oov4);
                                }
                                i2h2 = this.hxk.wgv;
                            }
                            catch (oov oov5) {
                                throw bdv.a(oov5);
                            }
                        }
                        try {
                            try {
                                bl = i2h2 instanceof ha9;
                                if (n == 0) break block21;
                                if (!bl) break block19;
                            }
                            catch (oov oov6) {
                                throw bdv.a(oov6);
                            }
                            bl = this.tv2;
                        }
                        catch (oov oov7) {
                            throw bdv.a(oov7);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n == 0) break block22;
                                if (bl) break block23;
                            }
                            catch (oov oov8) {
                                throw bdv.a(oov8);
                            }
                            bl = this.hxk.t1g();
                            if (n == 0) break block22;
                        }
                        catch (oov oov9) {
                            throw bdv.a(oov9);
                        }
                        if (!bl) break block19;
                    }
                    catch (oov oov10) {
                        throw bdv.a(oov10);
                    }
                }
                bl = true;
                break block22;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void iad() {
        block125: {
            yqv yqv2;
            float f;
            block124: {
                bdv bdv2;
                block123: {
                    block122: {
                        Object object;
                        Object object2;
                        block126: {
                            float f2;
                            int n;
                            ha9 ha92;
                            block121: {
                                block116: {
                                    block120: {
                                        boolean bl;
                                        int n2;
                                        int n3;
                                        int n4;
                                        int n5;
                                        float f3;
                                        int n6;
                                        int n7;
                                        float f4;
                                        laq laq2;
                                        block119: {
                                            block117: {
                                                block118: {
                                                    block115: {
                                                        float f5;
                                                        block114: {
                                                            float f6;
                                                            float f7;
                                                            block112: {
                                                                float f8;
                                                                block113: {
                                                                    block110: {
                                                                        float f9;
                                                                        block111: {
                                                                            block105: {
                                                                                block106: {
                                                                                    block109: {
                                                                                        float f10;
                                                                                        float f11;
                                                                                        block107: {
                                                                                            block108: {
                                                                                                float f12;
                                                                                                block104: {
                                                                                                    yqv yqv3;
                                                                                                    block103: {
                                                                                                        block100: {
                                                                                                            block102: {
                                                                                                                int n8;
                                                                                                                block101: {
                                                                                                                    bdv bdv3;
                                                                                                                    int n9;
                                                                                                                    block99: {
                                                                                                                        float f13;
                                                                                                                        block97: {
                                                                                                                            block98: {
                                                                                                                                block95: {
                                                                                                                                    float f14;
                                                                                                                                    block96: {
                                                                                                                                        block93: {
                                                                                                                                            float f15;
                                                                                                                                            block94: {
                                                                                                                                                block91: {
                                                                                                                                                    float f16;
                                                                                                                                                    block92: {
                                                                                                                                                        ha92 = (ha9)this.hxk.wgv;
                                                                                                                                                        laq2 = (laq)this.hxk;
                                                                                                                                                        n = t9d.b();
                                                                                                                                                        f15 = fe6.qsy(ha92.x5k - this.hxk.x5k) * 0.5f;
                                                                                                                                                        try {
                                                                                                                                                            float f17 = f15 - 5.0f;
                                                                                                                                                            f13 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                                                                                                                                                            if (n == 0) break block91;
                                                                                                                                                            if (f13 <= 0) break block92;
                                                                                                                                                        }
                                                                                                                                                        catch (oov oov2) {
                                                                                                                                                            throw bdv.a(oov2);
                                                                                                                                                        }
                                                                                                                                                        f15 = 5.0f;
                                                                                                                                                    }
                                                                                                                                                    f13 = (f16 = f15 - -5.0f) == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    if (n == 0) break block93;
                                                                                                                                                    if (f13 >= 0) break block94;
                                                                                                                                                }
                                                                                                                                                catch (oov oov3) {
                                                                                                                                                    throw bdv.a(oov3);
                                                                                                                                                }
                                                                                                                                                f15 = -5.0f;
                                                                                                                                            }
                                                                                                                                            this.hxk.x5k = fe6.qsy(this.hxk.x5k + f15);
                                                                                                                                            float f18 = this.m6f - this.o5o;
                                                                                                                                            f13 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                if (n == 0) break block95;
                                                                                                                                                if (f13 >= 0) break block96;
                                                                                                                                            }
                                                                                                                                            catch (oov oov4) {
                                                                                                                                                throw bdv.a(oov4);
                                                                                                                                            }
                                                                                                                                            this.m6f += (this.o5o - this.m6f) * 0.01f;
                                                                                                                                        }
                                                                                                                                        catch (oov oov5) {
                                                                                                                                            throw bdv.a(oov5);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    f13 = (f14 = this.m6f - this.o5o) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (n == 0) break block97;
                                                                                                                                        if (f13 <= 0) break block98;
                                                                                                                                    }
                                                                                                                                    catch (oov oov6) {
                                                                                                                                        throw bdv.a(oov6);
                                                                                                                                    }
                                                                                                                                    this.m6f = this.o5o;
                                                                                                                                }
                                                                                                                                catch (oov oov7) {
                                                                                                                                    throw bdv.a(oov7);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            f13 = fe6.jqf(this.hxk.o2v);
                                                                                                                        }
                                                                                                                        f4 = f13;
                                                                                                                        n7 = fe6.jqf(this.hxk.kfp);
                                                                                                                        n6 = fe6.jqf(this.hxk.vbd);
                                                                                                                        f = this.m6f;
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    n9 = this.tv2;
                                                                                                                                    if (n == 0) break block99;
                                                                                                                                    if (n9 == 0) break block100;
                                                                                                                                }
                                                                                                                                catch (oov oov8) {
                                                                                                                                    throw bdv.a(oov8);
                                                                                                                                }
                                                                                                                                bdv bdv4 = this;
                                                                                                                                bdv3 = bdv4;
                                                                                                                                n8 = bdv4.qbq;
                                                                                                                                if (n == 0) break block101;
                                                                                                                            }
                                                                                                                            catch (oov oov9) {
                                                                                                                                throw bdv.a(oov9);
                                                                                                                            }
                                                                                                                            n9 = n8;
                                                                                                                            bdv3.qbq = n8 + 1;
                                                                                                                        }
                                                                                                                        catch (oov oov10) {
                                                                                                                            throw bdv.a(oov10);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (n9 <= this.vxv) break block102;
                                                                                                                        bdv3 = this;
                                                                                                                        n8 = 0;
                                                                                                                    }
                                                                                                                    catch (oov oov11) {
                                                                                                                        throw bdv.a(oov11);
                                                                                                                    }
                                                                                                                }
                                                                                                                bdv3.tv2 = n8;
                                                                                                            }
                                                                                                            f += f * 1.15f * fe6.rtn((float)this.qbq / (float)this.vxv * (float)Math.PI);
                                                                                                        }
                                                                                                        f12 = 0.91f;
                                                                                                        try {
                                                                                                            try {
                                                                                                                yqv3 = this.hxk;
                                                                                                                if (n == 0) break block103;
                                                                                                                if (!yqv3.lfk) break block104;
                                                                                                            }
                                                                                                            catch (oov oov12) {
                                                                                                                throw bdv.a(oov12);
                                                                                                            }
                                                                                                            yqv3 = this.hxk;
                                                                                                        }
                                                                                                        catch (oov oov13) {
                                                                                                            throw bdv.a(oov13);
                                                                                                        }
                                                                                                    }
                                                                                                    f12 = yqv3.oay.getBlockState((mew)new mew((int)fe6.tpk((float)((float)f4)), (int)(fe6.tpk((float)((float)n7)) - 1), (int)fe6.tpk((float)((float)n6)))).r_y().t50 * 0.91f;
                                                                                                }
                                                                                                float f19 = 0.16277136f / (f12 * f12 * f12);
                                                                                                float f20 = fe6.rtn(laq2.x5k * (float)Math.PI / 180.0f);
                                                                                                float f21 = fe6.ssk(laq2.x5k * (float)Math.PI / 180.0f);
                                                                                                float f22 = laq2.ldh() * f19;
                                                                                                float f23 = Math.max(f, 1.0f);
                                                                                                f23 = f22 / f23;
                                                                                                float f24 = f * f23;
                                                                                                f8 = -(f24 * f20);
                                                                                                f7 = f24 * f21;
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            float f25 = fe6.sqg(f8) - fe6.sqg(f7);
                                                                                                            f6 = f25 == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1);
                                                                                                            if (n == 0) break block105;
                                                                                                            if (f6 <= 0) break block106;
                                                                                                        }
                                                                                                        catch (oov oov14) {
                                                                                                            throw bdv.a(oov14);
                                                                                                        }
                                                                                                        float f27 = f8 - 0.0f;
                                                                                                        f11 = f27 == 0.0f ? 0 : (f27 < 0.0f ? -1 : 1);
                                                                                                        if (n == 0) break block107;
                                                                                                    }
                                                                                                    catch (oov oov15) {
                                                                                                        throw bdv.a(oov15);
                                                                                                    }
                                                                                                    if (f11 >= 0) break block108;
                                                                                                }
                                                                                                catch (oov oov16) {
                                                                                                    throw bdv.a(oov16);
                                                                                                }
                                                                                                f8 -= this.hxk.uo6 / 2.0f;
                                                                                            }
                                                                                            try {
                                                                                                f10 = f8;
                                                                                                if (n == 0) break block109;
                                                                                                float f28 = f10 - 0.0f;
                                                                                                f11 = f28 == 0.0f ? 0 : (f28 > 0.0f ? 1 : -1);
                                                                                            }
                                                                                            catch (oov oov17) {
                                                                                                throw bdv.a(oov17);
                                                                                            }
                                                                                        }
                                                                                        if (f11 > 0) {
                                                                                            f8 += this.hxk.uo6 / 2.0f;
                                                                                        }
                                                                                        f10 = f7 = 0.0f;
                                                                                    }
                                                                                    if (n != 0) break block113;
                                                                                }
                                                                                f8 = 0.0f;
                                                                                float f29 = f7 - 0.0f;
                                                                                f6 = f29 == 0.0f ? 0 : (f29 < 0.0f ? -1 : 1);
                                                                            }
                                                                            try {
                                                                                if (n == 0) break block110;
                                                                                if (f6 >= 0) break block111;
                                                                            }
                                                                            catch (oov oov18) {
                                                                                throw bdv.a(oov18);
                                                                            }
                                                                            f7 -= this.hxk.uo6 / 2.0f;
                                                                        }
                                                                        f6 = (f9 = f7 - 0.0f) == 0.0f ? 0 : (f9 > 0.0f ? 1 : -1);
                                                                    }
                                                                    try {
                                                                        if (n == 0) break block112;
                                                                        if (f6 <= 0) break block113;
                                                                    }
                                                                    catch (oov oov19) {
                                                                        throw bdv.a(oov19);
                                                                    }
                                                                    f7 += this.hxk.uo6 / 2.0f;
                                                                }
                                                                f6 = fe6.jqf(this.hxk.o2v + (double)f8);
                                                            }
                                                            f3 = f6;
                                                            n5 = fe6.jqf(this.hxk.vbd + (double)f7);
                                                            n4 = fe6.tpk(this.hxk.uo6 + 1.0f);
                                                            n3 = fe6.tpk(this.hxk.ikl + ha92.ikl + 1.0f);
                                                            n2 = fe6.tpk(this.hxk.uo6 + 1.0f);
                                                            try {
                                                                try {
                                                                    try {
                                                                        f2 = f4;
                                                                        f5 = f3;
                                                                        if (n == 0) break block114;
                                                                        if (f2 != f5) break block115;
                                                                    }
                                                                    catch (oov oov20) {
                                                                        throw bdv.a(oov20);
                                                                    }
                                                                    f2 = n6;
                                                                    if (n == 0) break block116;
                                                                }
                                                                catch (oov oov21) {
                                                                    throw bdv.a(oov21);
                                                                }
                                                                f5 = n5;
                                                            }
                                                            catch (oov oov22) {
                                                                throw bdv.a(oov22);
                                                            }
                                                        }
                                                        if (f2 == f5) break block120;
                                                    }
                                                    object2 = this.hxk.oay.getBlockState(new mew((int)f4, n7, n6)).r_y();
                                                    try {
                                                        try {
                                                            try {
                                                                if (this.mjm((e0x)object2)) break block117;
                                                                if (((e0x)object2).p1r() != p3y.cei) break block118;
                                                            }
                                                            catch (oov oov23) {
                                                                throw bdv.a(oov23);
                                                            }
                                                            bl = this.mjm(this.hxk.oay.getBlockState(new mew((int)f4, n7 - 1, n6)).r_y());
                                                            if (n == 0) break block119;
                                                        }
                                                        catch (oov oov24) {
                                                            throw bdv.a(oov24);
                                                        }
                                                        if (bl) break block117;
                                                    }
                                                    catch (oov oov25) {
                                                        throw bdv.a(oov25);
                                                    }
                                                }
                                                bl = true;
                                                break block119;
                                            }
                                            bl = false;
                                        }
                                        boolean bl2 = bl;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        f2 = (float)bl2;
                                                                        if (n == 0) break block116;
                                                                        if (f2 == false) break block120;
                                                                    }
                                                                    catch (oov oov26) {
                                                                        throw bdv.a(oov26);
                                                                    }
                                                                    f2 = 0.0f;
                                                                    if (n == 0) break block116;
                                                                }
                                                                catch (oov oov27) {
                                                                    throw bdv.a(oov27);
                                                                }
                                                                if (f2 != l4f.ccu(this.hxk.oay, this.hxk, (int)f3, n7, n5, n4, n3, n2, false, false, true)) break block120;
                                                            }
                                                            catch (oov oov28) {
                                                                throw bdv.a(oov28);
                                                            }
                                                            f2 = 1.0f;
                                                            if (n == 0) break block116;
                                                        }
                                                        catch (oov oov29) {
                                                            throw bdv.a(oov29);
                                                        }
                                                        if (f2 != l4f.ccu(this.hxk.oay, this.hxk, (int)f4, n7 + 1, n6, n4, n3, n2, false, false, true)) break block120;
                                                    }
                                                    catch (oov oov30) {
                                                        throw bdv.a(oov30);
                                                    }
                                                    f2 = 1.0f;
                                                    if (n == 0) break block116;
                                                }
                                                catch (oov oov31) {
                                                    throw bdv.a(oov31);
                                                }
                                                if (f2 != l4f.ccu(this.hxk.oay, this.hxk, (int)f3, n7 + 1, n5, n4, n3, n2, false, false, true)) break block120;
                                            }
                                            catch (oov oov32) {
                                                throw bdv.a(oov32);
                                            }
                                            laq2.wzk().nqf();
                                        }
                                        catch (oov oov33) {
                                            throw bdv.a(oov33);
                                        }
                                    }
                                    f2 = (float)ha92.lls.g40;
                                }
                                try {
                                    try {
                                        try {
                                            if (n == 0) break block121;
                                            if (f2 != false) break block122;
                                        }
                                        catch (oov oov34) {
                                            throw bdv.a(oov34);
                                        }
                                        bdv2 = this;
                                        if (n == 0) break block123;
                                    }
                                    catch (oov oov35) {
                                        throw bdv.a(oov35);
                                    }
                                    float f30 = bdv2.m6f - this.o5o * 0.5f;
                                    f2 = f30 == 0.0f ? 0 : (f30 > 0.0f ? 1 : -1);
                                }
                                catch (oov oov36) {
                                    throw bdv.a(oov36);
                                }
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (f2 < 0) break block122;
                                            yqv2 = this.hxk;
                                            if (n == 0) break block124;
                                        }
                                        catch (oov oov37) {
                                            throw bdv.a(oov37);
                                        }
                                        if (!(yqv2.mbr().nextFloat() < 0.006f)) break block122;
                                    }
                                    catch (oov oov38) {
                                        throw bdv.a(oov38);
                                    }
                                    bdv2 = this;
                                    if (n == 0) break block123;
                                }
                                catch (oov oov39) {
                                    throw bdv.a(oov39);
                                }
                                if (bdv2.tv2) break block122;
                            }
                            catch (oov oov40) {
                                throw bdv.a(oov40);
                            }
                            object2 = ha92.tsc();
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n == 0) break block125;
                                                if (object2 == null) break block122;
                                            }
                                            catch (oov oov41) {
                                                throw bdv.a(oov41);
                                            }
                                            object = object2;
                                            if (n == 0) break block126;
                                        }
                                        catch (oov oov42) {
                                            throw bdv.a(oov42);
                                        }
                                        if (((erg)object).gn1() != xbr.nz4) break block122;
                                    }
                                    catch (oov oov43) {
                                        throw bdv.a(oov43);
                                    }
                                    ((erg)object2).ybw(1, ha92);
                                    if (n == 0) break block125;
                                }
                                catch (oov oov44) {
                                    throw bdv.a(oov44);
                                }
                                object = object2;
                            }
                            catch (oov oov45) {
                                throw bdv.a(oov45);
                            }
                        }
                        if (((erg)object).qd2 == 0) {
                            erg erg2 = new erg(xbr.kru);
                            erg2.b67(((erg)object2).zso());
                            ha92.up_.c41[ha92.up_.nb5] = erg2;
                        }
                    }
                    bdv2 = this;
                }
                yqv2 = bdv2.hxk;
            }
            yqv2.ge2(0.0f, f);
        }
    }

    private boolean mjm(e0x e0x2) {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                bl = e0x2 instanceof g7u;
                                if (n != 0) break block6;
                                if (bl) break block7;
                            }
                            catch (oov oov2) {
                                throw bdv.a(oov2);
                            }
                            bl = e0x2 instanceof izd;
                            if (n != 0) break block6;
                        }
                        catch (oov oov3) {
                            throw bdv.a(oov3);
                        }
                        if (!bl) break block8;
                    }
                    catch (oov oov4) {
                        throw bdv.a(oov4);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public boolean xl7() {
        return this.tv2;
    }

    public void ri3() {
        this.tv2 = true;
        this.qbq = 0;
        this.vxv = this.hxk.mbr().nextInt(841) + 140;
    }

    public boolean k3c() {
        int n;
        block8: {
            block7: {
                int n2;
                block6: {
                    n2 = t9d.c();
                    try {
                        try {
                            n = this.xl7();
                            if (n2 != 0) break block6;
                            if (n != 0) break block7;
                        }
                        catch (oov oov2) {
                            throw bdv.a(oov2);
                        }
                        float f = this.m6f - this.o5o * 0.3f;
                        n = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                    }
                    catch (oov oov3) {
                        throw bdv.a(oov3);
                    }
                }
                try {
                    if (n2 != 0) break block8;
                    if (n <= 0) break block7;
                }
                catch (oov oov4) {
                    throw bdv.a(oov4);
                }
                n = 1;
                break block8;
            }
            n = 0;
        }
        return n != 0;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

