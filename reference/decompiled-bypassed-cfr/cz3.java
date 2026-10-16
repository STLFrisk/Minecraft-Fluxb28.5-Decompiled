/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class cz3 {
    private final t9d hgm;
    private final mew ebl;
    private final mew x01;
    private final vt2 nv3;
    private final List djq;
    private final List go6;

    public cz3(t9d t9d2, mew mew2, vt2 vt22, boolean bl) {
        block8: {
            block6: {
                this.djq = Lists.newArrayList();
                this.go6 = Lists.newArrayList();
                int n = t9d.b();
                try {
                    block7: {
                        try {
                            try {
                                this.hgm = t9d2;
                                this.ebl = mew2;
                                if (n == 0) break block6;
                                if (!bl) break block7;
                            }
                            catch (oov oov2) {
                                throw cz3.a(oov2);
                            }
                            this.nv3 = vt22;
                            this.x01 = mew2.offset(vt22);
                            if (n != 0) break block8;
                        }
                        catch (oov oov3) {
                            throw cz3.a(oov3);
                        }
                    }
                    this.nv3 = vt22.b4b();
                }
                catch (oov oov4) {
                    throw cz3.a(oov4);
                }
            }
            this.x01 = mew2.offset(vt22, 2);
        }
    }

    public boolean h2m() {
        int n;
        int n2;
        block23: {
            int n3;
            block24: {
                block19: {
                    block20: {
                        boolean bl;
                        block21: {
                            block22: {
                                this.djq.clear();
                                int n4 = t9d.c();
                                this.go6.clear();
                                e0x e0x2 = this.hgm.getBlockState(this.x01).r_y();
                                n2 = n4;
                                try {
                                    try {
                                        try {
                                            try {
                                                n3 = aog.eh5(e0x2, this.hgm, this.x01, this.nv3, false);
                                                if (n2 != 0) break block19;
                                                if (n3 != 0) break block20;
                                            }
                                            catch (oov oov2) {
                                                throw cz3.a(oov2);
                                            }
                                            bl = e0x2.quv();
                                            if (n2 != 0) break block21;
                                        }
                                        catch (oov oov3) {
                                            throw cz3.a(oov3);
                                        }
                                        if (bl) break block22;
                                    }
                                    catch (oov oov4) {
                                        throw cz3.a(oov4);
                                    }
                                    return false;
                                }
                                catch (oov oov5) {
                                    throw cz3.a(oov5);
                                }
                            }
                            this.go6.add(this.x01);
                            bl = true;
                        }
                        return bl;
                    }
                    n3 = this.hzy(this.x01);
                }
                try {
                    try {
                        if (n2 != 0) break block23;
                        if (n3 != 0) break block24;
                    }
                    catch (oov oov6) {
                        throw cz3.a(oov6);
                    }
                    return false;
                }
                catch (oov oov7) {
                    throw cz3.a(oov7);
                }
            }
            n3 = n = 0;
        }
        while (n < this.djq.size()) {
            block25: {
                block26: {
                    boolean bl;
                    block27: {
                        mew mew2 = (mew)this.djq.get(n);
                        try {
                            try {
                                try {
                                    if (n2 != 0) break block25;
                                    if (this.hgm.getBlockState(mew2).r_y() != ox_.ehh) break block26;
                                }
                                catch (oov oov8) {
                                    throw cz3.a(oov8);
                                }
                                bl = this.xwg(mew2);
                                if (n2 != 0) break block27;
                            }
                            catch (oov oov9) {
                                throw cz3.a(oov9);
                            }
                            if (bl) break block26;
                        }
                        catch (oov oov10) {
                            throw cz3.a(oov10);
                        }
                        bl = false;
                    }
                    return bl;
                }
                ++n;
            }
            if (n2 == 0) continue;
        }
        return true;
    }

    private boolean hzy(mew mew2) {
        int n;
        int n2;
        e0x e0x2;
        int n3;
        block84: {
            int n4;
            block80: {
                int n5;
                block78: {
                    int n6;
                    block77: {
                        int n7;
                        block75: {
                            block76: {
                                block73: {
                                    block74: {
                                        block71: {
                                            block72: {
                                                e0x e0x3;
                                                block69: {
                                                    block70: {
                                                        n3 = t9d.b();
                                                        e0x2 = this.hgm.getBlockState(mew2).r_y();
                                                        try {
                                                            try {
                                                                e0x3 = e0x2;
                                                                if (n3 == 0) break block69;
                                                                if (e0x3.p1r() != p3y.cei) break block70;
                                                            }
                                                            catch (oov oov2) {
                                                                throw cz3.a(oov2);
                                                            }
                                                            return true;
                                                        }
                                                        catch (oov oov3) {
                                                            throw cz3.a(oov3);
                                                        }
                                                    }
                                                    e0x3 = e0x2;
                                                }
                                                try {
                                                    try {
                                                        n7 = aog.eh5(e0x3, this.hgm, mew2, this.nv3, false);
                                                        if (n3 == 0) break block71;
                                                        if (n7 != 0) break block72;
                                                    }
                                                    catch (oov oov4) {
                                                        throw cz3.a(oov4);
                                                    }
                                                    return true;
                                                }
                                                catch (oov oov5) {
                                                    throw cz3.a(oov5);
                                                }
                                            }
                                            n7 = mew2.equals(this.ebl);
                                        }
                                        try {
                                            try {
                                                if (n3 == 0) break block73;
                                                if (n7 == 0) break block74;
                                            }
                                            catch (oov oov6) {
                                                throw cz3.a(oov6);
                                            }
                                            return true;
                                        }
                                        catch (oov oov7) {
                                            throw cz3.a(oov7);
                                        }
                                    }
                                    n7 = this.djq.contains(mew2);
                                }
                                try {
                                    try {
                                        if (n3 == 0) break block75;
                                        if (n7 == 0) break block76;
                                    }
                                    catch (oov oov8) {
                                        throw cz3.a(oov8);
                                    }
                                    return true;
                                }
                                catch (oov oov9) {
                                    throw cz3.a(oov9);
                                }
                            }
                            n7 = 1;
                        }
                        n5 = n7;
                        try {
                            try {
                                n6 = n5 + this.djq.size();
                                if (n3 == 0) break block77;
                                if (n6 <= 12) break block78;
                            }
                            catch (oov oov10) {
                                throw cz3.a(oov10);
                            }
                            n6 = 0;
                        }
                        catch (oov oov11) {
                            throw cz3.a(oov11);
                        }
                    }
                    return n6 != 0;
                }
                while (e0x2 == ox_.ehh) {
                    block83: {
                        int n8;
                        block82: {
                            block81: {
                                e0x e0x4;
                                mew mew3;
                                block79: {
                                    mew3 = mew2.offset(this.nv3.b4b(), n5);
                                    e0x2 = this.hgm.getBlockState(mew3).r_y();
                                    try {
                                        try {
                                            e0x4 = e0x2;
                                            if (n3 == 0) break block79;
                                            if (e0x4.p1r() == p3y.cei) break;
                                        }
                                        catch (oov oov12) {
                                            throw cz3.a(oov12);
                                        }
                                        e0x4 = e0x2;
                                    }
                                    catch (oov oov13) {
                                        throw cz3.a(oov13);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            n4 = aog.eh5(e0x4, this.hgm, mew3, this.nv3, false) ? 1 : 0;
                                            if (n3 == 0) break block80;
                                            if (n4 == 0) break;
                                        }
                                        catch (oov oov14) {
                                            throw cz3.a(oov14);
                                        }
                                        n8 = mew3.equals(this.ebl);
                                        if (n3 == 0) break block81;
                                    }
                                    catch (oov oov15) {
                                        throw cz3.a(oov15);
                                    }
                                    if (n8 != 0) {
                                        break;
                                    }
                                }
                                catch (oov oov16) {
                                    throw cz3.a(oov16);
                                }
                                n8 = ++n5 + this.djq.size();
                            }
                            try {
                                try {
                                    if (n3 == 0) break block82;
                                    if (n8 <= 12) break block83;
                                }
                                catch (oov oov17) {
                                    throw cz3.a(oov17);
                                }
                                n8 = 0;
                            }
                            catch (oov oov18) {
                                throw cz3.a(oov18);
                            }
                        }
                        return n8 != 0;
                    }
                    if (n3 != 0) continue;
                }
                n4 = 0;
            }
            n2 = n4;
            for (n = n5 - 1; n >= 0; --n) {
                try {
                    this.djq.add(mew2.offset(this.nv3.b4b(), n));
                    ++n2;
                    if (n3 != 0) {
                        if (n3 != 0) continue;
                        break;
                    }
                    break block84;
                }
                catch (oov oov19) {
                    throw cz3.a(oov19);
                }
            }
            n = 1;
        }
        while (true) {
            block98: {
                int n9;
                int n10;
                mew mew4;
                block96: {
                    block97: {
                        block94: {
                            block95: {
                                int n11;
                                block92: {
                                    block93: {
                                        block86: {
                                            e0x e0x5;
                                            block90: {
                                                block91: {
                                                    block85: {
                                                        mew4 = mew2.offset(this.nv3, n);
                                                        int n12 = this.djq.indexOf(mew4);
                                                        try {
                                                            if (n12 <= -1) break block85;
                                                            this.zcd(n2, n12);
                                                            n11 = 0;
                                                            if (n3 == 0) break block86;
                                                        }
                                                        catch (oov oov20) {
                                                            throw cz3.a(oov20);
                                                        }
                                                        int n13 = n11;
                                                        while (n13 <= n12 + n2) {
                                                            block87: {
                                                                block88: {
                                                                    boolean bl;
                                                                    block89: {
                                                                        mew mew5 = (mew)this.djq.get(n13);
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (n3 == 0) break block87;
                                                                                    if (this.hgm.getBlockState(mew5).r_y() != ox_.ehh) break block88;
                                                                                }
                                                                                catch (oov oov21) {
                                                                                    throw cz3.a(oov21);
                                                                                }
                                                                                bl = this.xwg(mew5);
                                                                                if (n3 == 0) break block89;
                                                                            }
                                                                            catch (oov oov22) {
                                                                                throw cz3.a(oov22);
                                                                            }
                                                                            if (bl) break block88;
                                                                        }
                                                                        catch (oov oov23) {
                                                                            throw cz3.a(oov23);
                                                                        }
                                                                        bl = false;
                                                                    }
                                                                    return bl;
                                                                }
                                                                ++n13;
                                                            }
                                                            if (n3 != 0) continue;
                                                        }
                                                        return true;
                                                    }
                                                    e0x2 = this.hgm.getBlockState(mew4).r_y();
                                                    try {
                                                        try {
                                                            e0x5 = e0x2;
                                                            if (n3 == 0) break block90;
                                                            if (e0x5.p1r() != p3y.cei) break block91;
                                                        }
                                                        catch (oov oov24) {
                                                            throw cz3.a(oov24);
                                                        }
                                                        return true;
                                                    }
                                                    catch (oov oov25) {
                                                        throw cz3.a(oov25);
                                                    }
                                                }
                                                e0x5 = e0x2;
                                            }
                                            n11 = aog.eh5(e0x5, this.hgm, mew4, this.nv3, true) ? 1 : 0;
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (n3 == 0) break block92;
                                                    if (n11 == 0) break block93;
                                                }
                                                catch (oov oov26) {
                                                    throw cz3.a(oov26);
                                                }
                                                n10 = mew4.equals(this.ebl);
                                                if (n3 == 0) break block94;
                                            }
                                            catch (oov oov27) {
                                                throw cz3.a(oov27);
                                            }
                                            if (n10 == 0) break block95;
                                        }
                                        catch (oov oov28) {
                                            throw cz3.a(oov28);
                                        }
                                    }
                                    n11 = 0;
                                }
                                return n11 != 0;
                            }
                            n10 = e0x2.quv();
                        }
                        try {
                            try {
                                n9 = 1;
                                if (n3 == 0) break block96;
                                if (n10 != n9) break block97;
                            }
                            catch (oov oov29) {
                                throw cz3.a(oov29);
                            }
                            this.go6.add(mew4);
                            return true;
                        }
                        catch (oov oov30) {
                            throw cz3.a(oov30);
                        }
                    }
                    try {
                        n10 = this.djq.size();
                        if (n3 == 0) break block98;
                        n9 = 12;
                    }
                    catch (oov oov31) {
                        throw cz3.a(oov31);
                    }
                }
                try {
                    if (n10 >= n9) {
                        return false;
                    }
                }
                catch (oov oov32) {
                    throw cz3.a(oov32);
                }
                n10 = this.djq.add(mew4) ? 1 : 0;
            }
            ++n2;
            ++n;
        }
    }

    private void zcd(int n, int n2) {
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        arrayList.addAll(this.djq.subList(0, n2));
        arrayList2.addAll(this.djq.subList(this.djq.size() - n, this.djq.size()));
        arrayList3.addAll(this.djq.subList(n2, this.djq.size() - n));
        this.djq.clear();
        this.djq.addAll(arrayList);
        this.djq.addAll(arrayList2);
        this.djq.addAll(arrayList3);
    }

    private boolean xwg(mew mew2) {
        vt2[] vt2Array = vt2.values();
        int n = vt2Array.length;
        int n2 = 0;
        int n3 = t9d.b();
        while (n2 < n) {
            block7: {
                block8: {
                    boolean bl;
                    block9: {
                        vt2 vt22 = vt2Array[n2];
                        try {
                            try {
                                try {
                                    if (n3 == 0) break block7;
                                    if (vt22.e30() == this.nv3.e30()) break block8;
                                }
                                catch (oov oov2) {
                                    throw cz3.a(oov2);
                                }
                                bl = this.hzy(mew2.offset(vt22));
                                if (n3 == 0) break block9;
                            }
                            catch (oov oov3) {
                                throw cz3.a(oov3);
                            }
                            if (bl) break block8;
                        }
                        catch (oov oov4) {
                            throw cz3.a(oov4);
                        }
                        bl = false;
                    }
                    return bl;
                }
                ++n2;
            }
            if (n3 != 0) continue;
        }
        return true;
    }

    public List sxx() {
        return this.djq;
    }

    public List _h2() {
        return this.go6;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

