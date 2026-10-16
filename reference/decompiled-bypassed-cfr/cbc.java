/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.BitSet;
import java.util.List;

public class cbc {
    public static final cbc ays = new cbc$1();
    private final boolean[] m3r = new boolean[kqk.pxj.length];
    private final boolean[] x9t = new boolean[kqk.pxj.length];
    private boolean s1e = true;
    private final List qqk = Lists.newArrayList();
    private jcs vry = new jcs();
    private q3g.szd t00;
    private BitSet[] w1r = new BitSet[kqk.pxj.length];

    public boolean ra6() {
        return this.s1e;
    }

    public void uey(w51 w512) {
        this.s1e = false;
        this.m3r[w512.ordinal()] = true;
    }

    public boolean jo2(w51 w512) {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.m3r[w512.ordinal()];
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw cbc.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public void okj(w51 w512) {
        this.x9t[w512.ordinal()] = true;
    }

    public boolean g4s(w51 w512) {
        return this.x9t[w512.ordinal()];
    }

    public List pf7() {
        return this.qqk;
    }

    public void cmv(pyk pyk2) {
        this.qqk.add(pyk2);
    }

    public boolean spn(vt2 vt22, vt2 vt23) {
        return this.vry.mex(vt22, vt23);
    }

    public void htm(jcs jcs2) {
        this.vry = jcs2;
    }

    public q3g.szd zjr() {
        return this.t00;
    }

    public void agp(q3g.szd szd2) {
        this.t00 = szd2;
    }

    public BitSet pry(w51 w512) {
        return this.w1r[w512.ordinal()];
    }

    public void je9(w51 w512, BitSet bitSet) {
        this.w1r[w512.ordinal()] = bitSet;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

