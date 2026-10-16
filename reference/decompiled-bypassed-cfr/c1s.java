/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import net.optifine.render.VboRegion;

public class c1s {
    public final crp uwu;
    public final t9d jhd;
    public int dtu;
    public int bjx;
    public int q7z;
    public kqk[] mzt;
    private /* synthetic */ Map hk1;

    public c1s(t9d t9d2, int n, crp crp2, eg6 eg62) {
        this.hk1 = new HashMap();
        this.uwu = crp2;
        this.jhd = t9d2;
        this.ixd(n);
        this.vdv(eg62);
    }

    public void vdv(eg6 eg62) {
        mew mew2;
        int n;
        int n2;
        int n3;
        block16: {
            int n4;
            int n5 = this.bjx * this.dtu * this.q7z;
            this.mzt = new kqk[n5];
            int n6 = 0;
            n3 = t9d.c();
            n2 = 0;
            block8: while (true) {
                int n7 = n2;
                block9: while (n7 < this.bjx) {
                    n4 = 0;
                    if (n3 != 0) break block16;
                    int n8 = n4;
                    block10: while (true) {
                        int n9 = n8;
                        block11: while (n9 < this.dtu) {
                            n7 = 0;
                            if (n3 != 0) continue block9;
                            n = n7;
                            while (n < this.q7z) {
                                block17: {
                                    block18: {
                                        int n10 = (n * this.dtu + n8) * this.bjx + n2;
                                        mew2 = new mew(n2 * 16, n8 * 16, n * 16);
                                        try {
                                            this.mzt[n10] = eg62.rek(this.jhd, this.uwu, mew2, n6++);
                                            if (n3 != 0) break block17;
                                            n9 = hxt.x74() ? 1 : 0;
                                            if (n3 != 0) continue block11;
                                        }
                                        catch (oov oov2) {
                                            throw c1s.a(oov2);
                                        }
                                        try {
                                            try {
                                                if (n9 == 0 || !hxt._al()) break block18;
                                            }
                                            catch (oov oov3) {
                                                throw c1s.a(oov3);
                                            }
                                            this.cpz(this.mzt[n10]);
                                        }
                                        catch (oov oov4) {
                                            throw c1s.a(oov4);
                                        }
                                    }
                                    ++n;
                                }
                                if (n3 == 0) continue;
                            }
                            ++n8;
                            if (n3 == 0) continue block10;
                        }
                        break;
                    }
                    ++n2;
                    if (n3 == 0) continue block8;
                }
                break;
            }
            n4 = n2 = 0;
        }
        while (n2 < this.mzt.length) {
            block19: {
                kqk kqk2 = this.mzt[n2];
                for (n = 0; n < vt2.vbu.length; ++n) {
                    vt2 vt22 = vt2.vbu[n];
                    mew2 = kqk2.a8d(vt22);
                    kqk kqk3 = this.bes(mew2);
                    try {
                        kqk2.cfx(vt22, kqk3);
                        if (n3 == 0) {
                            if (n3 == 0) continue;
                            break;
                        }
                        break block19;
                    }
                    catch (oov oov5) {
                        throw c1s.a(oov5);
                    }
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    public void dfb() {
        block4: {
            kqk[] kqkArray = this.mzt;
            int n = kqkArray.length;
            int n2 = t9d.c();
            for (int i = 0; i < n; ++i) {
                kqk kqk2 = kqkArray[i];
                try {
                    kqk2.qv0();
                    if (n2 == 0) {
                        if (n2 == 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw c1s.a(oov2);
                }
            }
            this.tkk();
        }
    }

    public void ixd(int n) {
        int n2;
        this.bjx = n2 = n * 2 + 1;
        this.dtu = 16;
        this.q7z = n2;
    }

    public void b4a(double d, double d2) {
        int n = fe6.jqf(d) - 8;
        int n2 = fe6.jqf(d2) - 8;
        int n3 = t9d.b();
        int n4 = this.bjx * 16;
        int n5 = 0;
        block16: while (true) {
            int n6 = n5;
            block17: while (n6 < this.bjx) {
                int n7 = this.kfw(n, n4, n5);
                int n8 = 0;
                block18: while (true) {
                    int n9 = n8;
                    int n10 = this.q7z;
                    block19: while (n9 < n10) {
                        int n11 = this.kfw(n2, n4, n8);
                        n6 = 0;
                        if (n3 == 0) continue block17;
                        int n12 = n6;
                        while (n12 < this.dtu) {
                            block24: {
                                block23: {
                                    mew mew2;
                                    kqk kqk2;
                                    block21: {
                                        int n13 = n12 * 16;
                                        kqk2 = this.mzt[(n8 * this.dtu + n12) * this.bjx + n5];
                                        mew mew3 = kqk2.a7g();
                                        try {
                                            mew2 = mew3;
                                            if (n3 == 0) break block21;
                                            n9 = mew2.getX();
                                            n10 = n7;
                                            if (n3 == 0) continue block19;
                                        }
                                        catch (oov oov2) {
                                            throw c1s.a(oov2);
                                        }
                                        try {
                                            block22: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (n9 != n10) break block22;
                                                                mew2 = mew3;
                                                                if (n3 == 0) break block21;
                                                            }
                                                            catch (oov oov3) {
                                                                throw c1s.a(oov3);
                                                            }
                                                            if (mew2.getY() != n13) break block22;
                                                        }
                                                        catch (oov oov4) {
                                                            throw c1s.a(oov4);
                                                        }
                                                        mew2 = mew3;
                                                        if (n3 == 0) break block21;
                                                    }
                                                    catch (oov oov5) {
                                                        throw c1s.a(oov5);
                                                    }
                                                    if (mew2.getZ() == n11) break block23;
                                                }
                                                catch (oov oov6) {
                                                    throw c1s.a(oov6);
                                                }
                                            }
                                            mew2 = new mew(n7, n13, n11);
                                        }
                                        catch (oov oov7) {
                                            throw c1s.a(oov7);
                                        }
                                    }
                                    mew mew4 = mew2;
                                    try {
                                        try {
                                            if (n3 == 0) break block24;
                                            if (mew4.equals(kqk2.a7g())) break block23;
                                        }
                                        catch (oov oov8) {
                                            throw c1s.a(oov8);
                                        }
                                        kqk2.pap(mew4);
                                    }
                                    catch (oov oov9) {
                                        throw c1s.a(oov9);
                                    }
                                }
                                ++n12;
                            }
                            if (n3 != 0) continue;
                        }
                        ++n8;
                        if (n3 != 0) continue block18;
                    }
                    break;
                }
                ++n5;
                if (n3 != 0) continue block16;
            }
            break;
        }
    }

    private int kfw(int n, int n2, int n3) {
        int n4;
        block2: {
            int n5;
            int n6;
            block3: {
                n6 = n3 * 16;
                n5 = n6 - n + n2 / 2;
                int n7 = t9d.b();
                try {
                    n4 = n5;
                    if (n7 == 0) break block2;
                    if (n4 >= 0) break block3;
                }
                catch (oov oov2) {
                    throw c1s.a(oov2);
                }
                n5 -= n2 - 1;
            }
            n4 = n6 - n5 / n2 * n2;
        }
        return n4;
    }

    /*
     * WARNING - void declaration
     */
    public void rid(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = fe6.zji(n, 16);
        int n8 = fe6.zji(n2, 16);
        int n9 = fe6.zji(n3, 16);
        int n10 = fe6.zji(n4, 16);
        int n11 = fe6.zji(n5, 16);
        int n12 = fe6.zji(n6, 16);
        int n13 = n7;
        int n14 = t9d.c();
        block6: while (true) {
            int n15 = n13;
            block7: while (n15 <= n10) {
                int n16;
                int n17;
                block11: {
                    block12: {
                        n17 = n13 % this.bjx;
                        try {
                            n16 = n17;
                            if (n14 != 0) break block11;
                            if (n16 >= 0) break block12;
                        }
                        catch (oov oov2) {
                            throw c1s.a(oov2);
                        }
                        n17 += this.bjx;
                    }
                    n16 = n8;
                }
                int n18 = n16;
                block8: while (true) {
                    int n19 = n18;
                    block9: while (n19 <= n11) {
                        void var18_18;
                        int n20;
                        block13: {
                            block14: {
                                n15 = n20 = n18 % this.dtu;
                                if (n14 != 0) continue block7;
                                try {
                                    if (n14 != 0) break block13;
                                    if (n15 >= 0) break block14;
                                }
                                catch (oov oov3) {
                                    throw c1s.a(oov3);
                                }
                                n20 += this.dtu;
                            }
                            int n21 = var18_18 = n9;
                        }
                        while (var18_18 <= n12) {
                            void v7;
                            block15: {
                                void var19_19;
                                block16: {
                                    var19_19 = var18_18 % this.q7z;
                                    n19 = var19_19;
                                    if (n14 != 0) continue block9;
                                    try {
                                        if (n14 != 0) break block15;
                                        if (n19 >= 0) break block16;
                                    }
                                    catch (oov oov4) {
                                        throw c1s.a(oov4);
                                    }
                                    var19_19 += this.q7z;
                                }
                                v7 = (var19_19 * this.dtu + n20) * this.bjx + n17;
                            }
                            void var20_20 = v7;
                            kqk kqk2 = this.mzt[var20_20];
                            kqk2.sf6(true);
                            ++var18_18;
                            if (n14 == 0) continue;
                        }
                        ++n18;
                        if (n14 == 0) continue block8;
                    }
                    break;
                }
                ++n13;
                if (n14 == 0) continue block6;
            }
            break;
        }
    }

    public kqk bes(mew mew2) {
        block11: {
            int n;
            block15: {
                int n2;
                int n3;
                int n4;
                block16: {
                    int n5;
                    block13: {
                        block14: {
                            int n6;
                            int n7;
                            block12: {
                                block10: {
                                    n4 = mew2.getX() >> 4;
                                    n3 = mew2.getY() >> 4;
                                    n2 = mew2.getZ() >> 4;
                                    n5 = t9d.b();
                                    try {
                                        n7 = n3;
                                        if (n5 == 0) break block10;
                                        if (n7 < 0) break block11;
                                    }
                                    catch (oov oov2) {
                                        throw c1s.a(oov2);
                                    }
                                    n7 = n3;
                                }
                                try {
                                    try {
                                        n6 = this.dtu;
                                        if (n5 == 0) break block12;
                                        if (n7 >= n6) break block11;
                                    }
                                    catch (oov oov3) {
                                        throw c1s.a(oov3);
                                    }
                                    n7 = n4;
                                    n6 = this.bjx;
                                }
                                catch (oov oov4) {
                                    throw c1s.a(oov4);
                                }
                            }
                            n4 = n7 % n6;
                            try {
                                n = n4;
                                if (n5 == 0) break block13;
                                if (n >= 0) break block14;
                            }
                            catch (oov oov5) {
                                throw c1s.a(oov5);
                            }
                            n4 += this.bjx;
                        }
                        n = n2 %= this.q7z;
                    }
                    try {
                        if (n5 == 0) break block15;
                        if (n >= 0) break block16;
                    }
                    catch (oov oov6) {
                        throw c1s.a(oov6);
                    }
                    n2 += this.q7z;
                }
                n = (n2 * this.dtu + n3) * this.bjx + n4;
            }
            int n8 = n;
            return this.mzt[n8];
        }
        return null;
    }

    private void cpz(kqk kqk2) {
        int n;
        int n2;
        VboRegion[] vboRegionArray;
        w51[] w51Array;
        block14: {
            VboRegion[] vboRegionArray2;
            h2f h2f2;
            block13: {
                mew mew2 = kqk2.a7g();
                int n3 = mew2.getX() >> 8 << 8;
                int n4 = mew2.getZ() >> 8 << 8;
                h2f2 = new h2f(n3, n4);
                w51Array = kqk.pxj;
                vboRegionArray = (VboRegion[])this.hk1.get(h2f2);
                n2 = t9d.c();
                try {
                    try {
                        vboRegionArray2 = vboRegionArray;
                        if (n2 != 0) break block13;
                        if (vboRegionArray2 != null) break block14;
                    }
                    catch (oov oov2) {
                        throw c1s.a(oov2);
                    }
                    vboRegionArray2 = new VboRegion[w51Array.length];
                }
                catch (oov oov3) {
                    throw c1s.a(oov3);
                }
            }
            vboRegionArray = vboRegionArray2;
            for (n = 0; n < w51Array.length; ++n) {
                try {
                    vboRegionArray[n] = new VboRegion(w51Array[n]);
                    if (n2 == 0) {
                        if (n2 == 0) continue;
                        break;
                    }
                    break block14;
                }
                catch (oov oov4) {
                    throw c1s.a(oov4);
                }
            }
            this.hk1.put(h2f2, vboRegionArray);
        }
        n = 0;
        while (n < w51Array.length) {
            block15: {
                block16: {
                    VboRegion vboRegion = vboRegionArray[n];
                    try {
                        try {
                            if (n2 != 0) break block15;
                            if (vboRegion == null) break block16;
                        }
                        catch (oov oov5) {
                            throw c1s.a(oov5);
                        }
                        kqk2.lry(n).fb5(vboRegion);
                    }
                    catch (oov oov6) {
                        throw c1s.a(oov6);
                    }
                }
                ++n;
            }
            if (n2 == 0) continue;
        }
    }

    public void tkk() {
        block8: {
            int n = t9d.c();
            for (h2f h2f2 : this.hk1.keySet()) {
                Object object = this.hk1.get(h2f2);
                block5: while (true) {
                    VboRegion[] vboRegionArray = (VboRegion[])object;
                    if (n != 0) break block8;
                    int n2 = 0;
                    while (n2 < vboRegionArray.length) {
                        block9: {
                            VboRegion vboRegion = vboRegionArray[n2];
                            try {
                                if (n != 0) break block9;
                                object = vboRegion;
                                if (n != 0) continue block5;
                            }
                            catch (oov oov2) {
                                throw c1s.a(oov2);
                            }
                            try {
                                if (object != null) {
                                    vboRegion.deleteGlBuffers();
                                }
                            }
                            catch (oov oov3) {
                                throw c1s.a(oov3);
                            }
                            vboRegionArray[n2] = null;
                            ++n2;
                        }
                        if (n == 0) continue;
                    }
                    break;
                }
                if (n == 0) continue;
            }
            this.hk1.clear();
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

