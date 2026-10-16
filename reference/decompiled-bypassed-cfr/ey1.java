/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import net.optifine.ChunkPosComparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ey1 {
    private static final Logger o6d = LogManager.getLogger();
    private final dug ylg;
    private final List o75 = Lists.newArrayList();
    private final yo9 mg1 = new yo9();
    private final List r5p = Lists.newArrayList();
    private final List rdd = Lists.newArrayList();
    private int rnz;
    private long sm8;
    private final int[][] ou5 = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private final Map g5r = new HashMap();

    public ey1(dug dug2) {
        this.ylg = dug2;
        this.ke1(dug2.ve6().wh3().pci());
    }

    public dug g37() {
        return this.ylg;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void d6c() {
        block47: {
            block46: {
                block44: {
                    block45: {
                        block43: {
                            var2_1 = this.g5r.entrySet();
                            var3_2 = var2_1.iterator();
                            var1_3 = t9d.b();
                            block26: while (var3_2.hasNext()) {
                                block38: {
                                    block42: {
                                        block41: {
                                            block40: {
                                                block39: {
                                                    block37: {
                                                        var4_4 = var3_2.next();
                                                        var5_6 = (Set)var4_4.getValue();
                                                        try {
                                                            try {
                                                                v0 /* !! */  = var5_6;
                                                                if (var1_3 == 0) break block37;
                                                                if (v0 /* !! */ .isEmpty()) break block38;
                                                            }
                                                            catch (oov v1) {
                                                                throw ey1.a(v1);
                                                            }
                                                            v0 /* !! */  = var4_4.getKey();
                                                        }
                                                        catch (oov v2) {
                                                            throw ey1.a(v2);
                                                        }
                                                    }
                                                    var6_7 = (z96)v0 /* !! */ ;
                                                    try {
                                                        try {
                                                            if (var1_3 == 0) break block39;
                                                            if (var6_7.oay == this.ylg) break block40;
                                                        }
                                                        catch (oov v3) {
                                                            throw ey1.a(v3);
                                                        }
                                                        var3_2.remove();
                                                    }
                                                    catch (oov v4) {
                                                        throw ey1.a(v4);
                                                    }
                                                }
                                                if (var1_3 != 0) break block38;
                                            }
                                            var7_10 = this.rnz / 3 + 1;
                                            try {
                                                try {
                                                    v5 = hxt.jwp();
                                                    if (var1_3 == 0) break block41;
                                                    if (v5 != 0) break block42;
                                                }
                                                catch (oov v6) {
                                                    throw ey1.a(v6);
                                                }
                                                v5 = this.rnz * 2 + 1;
                                            }
                                            catch (oov v7) {
                                                throw ey1.a(v7);
                                            }
                                        }
                                        var7_10 = v5;
                                    }
                                    for (h2f var9_15 : this.pys(var5_6, var6_7, var7_10)) {
                                        var10_16 = this.w7h(var9_15.jnd, var9_15.km5, true);
                                        var10_16.n82(var6_7);
                                        var5_6.remove(var9_15);
                                        if (var1_3 == 0) continue block26;
                                        if (var1_3 != 0) continue;
                                    }
                                }
                                if (var1_3 != 0) continue;
                            }
                            var4_5 = this.ylg.p2b();
                            try {
                                cfr_temp_0 = var4_5 - this.sm8 - 8000L;
                                v8 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                if (var1_3 == 0) break block43;
                                if (v8 > 0) {
                                }
                                ** GOTO lbl84
                            }
                            catch (oov v9) {
                                throw ey1.a(v9);
                            }
                            this.sm8 = var4_5;
                            for (var6_8 = (long)0; var6_8 < this.rdd.size(); ++var6_8) {
                                var7_12 = (ey1$d08)this.rdd.get((int)var6_8);
                                try {
                                    var7_12.q84();
                                    var7_12.bii();
                                    if (var1_3 != 0) {
                                        if (var1_3 != 0) continue;
                                        break;
                                    }
                                    break block44;
                                }
                                catch (oov v10) {
                                    throw ey1.a(v10);
                                }
                            }
                            try {
                                if (var1_3 != 0) break block45;
lbl84:
                                // 2 sources

                                v8 = 0;
                            }
                            catch (oov v11) {
                                throw ey1.a(v11);
                            }
                        }
                        for (var6_8 = v1413760; var6_8 < this.r5p.size(); ++var6_8) {
                            var7_13 = (ey1$d08)this.r5p.get((int)var6_8);
                            try {
                                var7_13.q84();
                                if (var1_3 != 0) {
                                    if (var1_3 != 0) continue;
                                    break;
                                }
                                break block44;
                            }
                            catch (oov v12) {
                                throw ey1.a(v12);
                            }
                        }
                    }
                    this.r5p.clear();
                }
                try {
                    try {
                        v13 = this;
                        if (var1_3 == 0) break block46;
                        if (!v13.o75.isEmpty()) break block47;
                    }
                    catch (oov v14) {
                        throw ey1.a(v14);
                    }
                    v13 = this;
                }
                catch (oov v15) {
                    throw ey1.a(v15);
                }
            }
            var6_9 = v13.ylg.vzz;
            try {
                if (!var6_9.vm6()) {
                    this.ylg.kil.hps();
                }
            }
            catch (oov v16) {
                throw ey1.a(v16);
            }
        }
    }

    public boolean cwk(int n, int n2) {
        boolean bl;
        long l = (long)n + Integer.MAX_VALUE | (long)n2 + Integer.MAX_VALUE << 32;
        try {
            bl = this.mg1.hhm(l) != null;
        }
        catch (oov oov2) {
            throw ey1.a(oov2);
        }
        return bl;
    }

    private ey1$d08 w7h(int n, int n2, boolean bl) {
        ey1$d08 ey1$d08;
        block6: {
            ey1$d08 ey1$d082;
            block7: {
                boolean bl2;
                long l = (long)n + Integer.MAX_VALUE | (long)n2 + Integer.MAX_VALUE << 32;
                ey1$d082 = (ey1$d08)this.mg1.hhm(l);
                int n3 = t9d.b();
                try {
                    try {
                        try {
                            ey1$d08 = ey1$d082;
                            if (n3 == 0) break block6;
                            if (ey1$d08 != null) break block7;
                        }
                        catch (oov oov2) {
                            throw ey1.a(oov2);
                        }
                        bl2 = bl;
                        if (n3 == 0) break block7;
                    }
                    catch (oov oov3) {
                        throw ey1.a(oov3);
                    }
                    if (!bl2) break block7;
                }
                catch (oov oov4) {
                    throw ey1.a(oov4);
                }
                ey1$d082 = new ey1$d08(this, n, n2);
                this.mg1.pab(l, ey1$d082);
                bl2 = this.rdd.add(ey1$d082);
            }
            ey1$d08 = ey1$d082;
        }
        return ey1$d08;
    }

    public void ana(mew mew2) {
        block3: {
            ey1$d08 ey1$d08;
            block2: {
                int n = mew2.getX() >> 4;
                int n2 = mew2.getZ() >> 4;
                int n3 = t9d.b();
                ey1$d08 ey1$d082 = this.w7h(n, n2, false);
                try {
                    ey1$d08 = ey1$d082;
                    if (n3 == 0) break block2;
                    if (ey1$d08 == null) break block3;
                }
                catch (oov oov2) {
                    throw ey1.a(oov2);
                }
                ey1$d08 = ey1$d082;
            }
            ey1$d08.gma(mew2.getX() & 0xF, mew2.getY(), mew2.getZ() & 0xF);
        }
    }

    public void x0z(z96 z962) {
        block21: {
            int n;
            int n2 = (int)z962.o2v >> 4;
            int n3 = (int)z962.vbd >> 4;
            z962.yj0 = z962.o2v;
            z962.pgx = z962.vbd;
            int n4 = Math.min(this.rnz, 8);
            int n5 = n2 - n4;
            int n6 = t9d.b();
            int n7 = n2 + n4;
            int n8 = n3 - n4;
            int n9 = n3 + n4;
            Set set = this.avs(z962);
            int n10 = n2 - this.rnz;
            block18: while (true) {
                int n11 = n10;
                int n12 = n2 + this.rnz;
                block19: while (n11 <= n12) {
                    n = n3 - this.rnz;
                    if (n6 == 0) break block21;
                    for (int i = v1415798; i <= n3 + this.rnz; ++i) {
                        int n13;
                        try {
                            n13 = n10;
                            if (n6 == 0) continue;
                            n12 = n5;
                            if (n6 == 0) continue block19;
                        }
                        catch (oov oov2) {
                            throw ey1.a(oov2);
                        }
                        try {
                            block22: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (n13 < n12) break block22;
                                                            n13 = n10;
                                                            if (n6 == 0) continue;
                                                        }
                                                        catch (oov oov3) {
                                                            throw ey1.a(oov3);
                                                        }
                                                        if (n13 > n7) break block22;
                                                    }
                                                    catch (oov oov4) {
                                                        throw ey1.a(oov4);
                                                    }
                                                    n13 = i;
                                                    if (n6 == 0) continue;
                                                }
                                                catch (oov oov5) {
                                                    throw ey1.a(oov5);
                                                }
                                                if (n13 < n8) break block22;
                                            }
                                            catch (oov oov6) {
                                                throw ey1.a(oov6);
                                            }
                                            n13 = i;
                                            if (n6 == 0) continue;
                                        }
                                        catch (oov oov7) {
                                            throw ey1.a(oov7);
                                        }
                                        if (n13 > n9) break block22;
                                    }
                                    catch (oov oov8) {
                                        throw ey1.a(oov8);
                                    }
                                    this.w7h(n10, i, true).n82(z962);
                                    if (n6 != 0) continue;
                                }
                                catch (oov oov9) {
                                    throw ey1.a(oov9);
                                }
                            }
                            n13 = set.add(new h2f(n10, i)) ? 1 : 0;
                            continue;
                        }
                        catch (oov oov10) {
                            throw ey1.a(oov10);
                        }
                    }
                    ++n10;
                    if (n6 != 0) continue block18;
                }
                break;
            }
            n = this.o75.add(z962) ? 1 : 0;
        }
        this.cya(z962);
    }

    public void cya(z96 z962) {
        int n;
        int n2;
        h2f h2f2;
        int n3;
        int n4;
        int n5;
        int n6;
        ArrayList arrayList;
        block21: {
            int n7;
            int n8;
            block19: {
                block20: {
                    arrayList = Lists.newArrayList((Iterable)z962.u8j);
                    n6 = 0;
                    n5 = this.rnz;
                    n4 = (int)z962.o2v >> 4;
                    n3 = (int)z962.vbd >> 4;
                    int n9 = 0;
                    int n10 = 0;
                    h2f2 = ey1$d08.cbu(this.w7h(n4, n3, true));
                    n2 = t9d.b();
                    try {
                        try {
                            z962.u8j.clear();
                            n8 = arrayList.contains(h2f2);
                            if (n2 == 0) break block19;
                            if (n8 == 0) break block20;
                        }
                        catch (oov oov2) {
                            throw ey1.a(oov2);
                        }
                        z962.u8j.add(h2f2);
                    }
                    catch (oov oov3) {
                        throw ey1.a(oov3);
                    }
                }
                n8 = 1;
            }
            n = n8;
            block12: while (true) {
                int n11 = n;
                block13: while (n11 <= n5 * 2) {
                    n7 = 0;
                    if (n2 == 0) break block21;
                    int n12 = n7;
                    block14: while (true) {
                        int n13 = n12;
                        block15: while (n13 < 2) {
                            int[] nArray = this.ou5[n6++ % 4];
                            n11 = 0;
                            if (n2 == 0) continue block13;
                            int n14 = n11;
                            while (n14 < n) {
                                block22: {
                                    h2f2 = ey1$d08.cbu(this.w7h(n4 + (n9 += nArray[0]), n3 + (n10 += nArray[1]), true));
                                    try {
                                        if (n2 == 0) break block22;
                                        n13 = arrayList.contains(h2f2) ? 1 : 0;
                                        if (n2 == 0) continue block15;
                                    }
                                    catch (oov oov4) {
                                        throw ey1.a(oov4);
                                    }
                                    try {
                                        if (n13 != 0) {
                                            z962.u8j.add(h2f2);
                                        }
                                    }
                                    catch (oov oov5) {
                                        throw ey1.a(oov5);
                                    }
                                    ++n14;
                                }
                                if (n2 != 0) continue;
                            }
                            ++n12;
                            if (n2 != 0) continue block14;
                        }
                        break;
                    }
                    ++n;
                    if (n2 != 0) continue block12;
                }
                break;
            }
            n6 %= 4;
            n7 = n = 0;
        }
        while (n < n5 * 2) {
            block23: {
                block24: {
                    h2f2 = ey1$d08.cbu(this.w7h(n4 + (n9 += this.ou5[n6][0]), n3 + (n10 += this.ou5[n6][1]), true));
                    try {
                        try {
                            if (n2 == 0) break block23;
                            if (!arrayList.contains(h2f2)) break block24;
                        }
                        catch (oov oov6) {
                            throw ey1.a(oov6);
                        }
                        z962.u8j.add(h2f2);
                    }
                    catch (oov oov7) {
                        throw ey1.a(oov7);
                    }
                }
                ++n;
            }
            if (n2 != 0) continue;
        }
    }

    public void pt7(z96 z962) {
        block8: {
            int n;
            this.g5r.remove(z962);
            int n2 = (int)z962.yj0 >> 4;
            int n3 = t9d.b();
            int n4 = (int)z962.pgx >> 4;
            int n5 = n2 - this.rnz;
            while (n5 <= n2 + this.rnz) {
                block9: {
                    n = n4 - this.rnz;
                    if (n3 == 0) break block8;
                    int n6 = n;
                    while (n6 <= n4 + this.rnz) {
                        block10: {
                            block11: {
                                ey1$d08 ey1$d08 = this.w7h(n5, n6, false);
                                try {
                                    try {
                                        try {
                                            if (n3 == 0) break block9;
                                            if (n3 == 0) break block10;
                                        }
                                        catch (oov oov2) {
                                            throw ey1.a(oov2);
                                        }
                                        if (ey1$d08 == null) break block11;
                                    }
                                    catch (oov oov3) {
                                        throw ey1.a(oov3);
                                    }
                                    ey1$d08.fwh(z962);
                                }
                                catch (oov oov4) {
                                    throw ey1.a(oov4);
                                }
                            }
                            ++n6;
                        }
                        if (n3 != 0) continue;
                    }
                    ++n5;
                }
                if (n3 != 0) continue;
            }
            n = this.o75.remove(z962) ? 1 : 0;
        }
    }

    private boolean oyf(int n, int n2, int n3, int n4, int n5) {
        int n6;
        block19: {
            block17: {
                block20: {
                    int n7;
                    int n8;
                    int n9;
                    block18: {
                        block16: {
                            int n10 = n - n3;
                            n9 = n2 - n4;
                            n8 = t9d.c();
                            try {
                                try {
                                    n6 = n10;
                                    n7 = -n5;
                                    if (n8 != 0) break block16;
                                    if (n6 < n7) break block17;
                                }
                                catch (oov oov2) {
                                    throw ey1.a(oov2);
                                }
                                n6 = n10;
                                n7 = n5;
                            }
                            catch (oov oov3) {
                                throw ey1.a(oov3);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (n8 != 0) break block18;
                                    if (n6 > n7) break block17;
                                }
                                catch (oov oov4) {
                                    throw ey1.a(oov4);
                                }
                                n6 = n9;
                                if (n8 != 0) break block19;
                            }
                            catch (oov oov5) {
                                throw ey1.a(oov5);
                            }
                            n7 = -n5;
                        }
                        catch (oov oov6) {
                            throw ey1.a(oov6);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n6 < n7) break block20;
                                n6 = n9;
                                if (n8 != 0) break block19;
                            }
                            catch (oov oov7) {
                                throw ey1.a(oov7);
                            }
                            if (n6 > n5) break block20;
                        }
                        catch (oov oov8) {
                            throw ey1.a(oov8);
                        }
                        n6 = 1;
                        break block19;
                    }
                    catch (oov oov9) {
                        throw ey1.a(oov9);
                    }
                }
                n6 = 0;
                break block19;
            }
            n6 = 0;
        }
        return n6 != 0;
    }

    /*
     * Unable to fully structure code
     */
    public void tc5(z96 var1_1) {
        block30: {
            block32: {
                block31: {
                    block29: {
                        var3_2 = (int)var1_1.o2v >> 4;
                        var4_3 = (int)var1_1.vbd >> 4;
                        var2_4 = t9d.b();
                        var5_5 = var1_1.yj0 - var1_1.o2v;
                        var7_6 = var1_1.pgx - var1_1.vbd;
                        var9_7 = var5_5 * var5_5 + var7_6 * var7_6;
                        try {
                            try {
                                cfr_temp_0 = var9_7 - 64.0;
                                v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                if (var2_4 == 0) break block29;
                                if (v0 < 0) break block30;
                            }
                            catch (oov v1) {
                                throw ey1.a(v1);
                            }
                            v0 = (int)var1_1.yj0 >> 4;
                        }
                        catch (oov v2) {
                            throw ey1.a(v2);
                        }
                    }
                    var11_8 = v0;
                    var12_9 = (int)var1_1.pgx >> 4;
                    var13_10 = this.rnz;
                    var14_11 = var3_2 - var11_8;
                    var15_12 = var4_3 - var12_9;
                    try {
                        v3 = var14_11;
                        if (var2_4 == 0) break block31;
                        if (v3 != 0) break block32;
                    }
                    catch (oov v4) {
                        throw ey1.a(v4);
                    }
                    v3 = var15_12;
                }
                if (v3 == 0) break block30;
            }
            var16_13 = this.avs(var1_1);
            var17_14 = var3_2 - var13_10;
            block24: while (true) {
                v5 = var17_14;
                block25: while (v5 <= var3_2 + var13_10) {
                    var18_15 = var4_3 - var13_10;
                    while (var18_15 <= var4_3 + var13_10) {
                        block38: {
                            block37: {
                                block36: {
                                    block33: {
                                        block34: {
                                            block35: {
                                                v5 = (int)this.oyf(var17_14, var18_15, (int)var11_8, var12_9, var13_10);
                                                if (var2_4 == 0) continue block25;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var2_4 == 0) break block33;
                                                                if (v5 != 0) break block34;
                                                            }
                                                            catch (oov v6) {
                                                                throw ey1.a(v6);
                                                            }
                                                            v7 = hxt.jwp();
                                                            if (var2_4 == 0) break block35;
                                                        }
                                                        catch (oov v8) {
                                                            throw ey1.a(v8);
                                                        }
                                                        if (v7) {
                                                        }
                                                        ** GOTO lbl72
                                                    }
                                                    catch (oov v9) {
                                                        throw ey1.a(v9);
                                                    }
                                                    v7 = var16_13.add(new h2f(var17_14, var18_15));
                                                }
                                                catch (oov v10) {
                                                    throw ey1.a(v10);
                                                }
                                            }
                                            try {
                                                if (var2_4 != 0) break block34;
lbl72:
                                                // 2 sources

                                                this.w7h(var17_14, var18_15, true).n82(var1_1);
                                            }
                                            catch (oov v11) {
                                                throw ey1.a(v11);
                                            }
                                        }
                                        v12 = this.oyf(var17_14 - var14_11, var18_15 - var15_12, var3_2, var4_3, var13_10);
                                    }
                                    try {
                                        try {
                                            if (var2_4 == 0) break block36;
                                            if (v12) break block37;
                                        }
                                        catch (oov v13) {
                                            throw ey1.a(v13);
                                        }
                                        v12 = var16_13.remove(new h2f(var17_14 - var14_11, var18_15 - var15_12));
                                    }
                                    catch (oov v14) {
                                        throw ey1.a(v14);
                                    }
                                }
                                var19_16 = this.w7h(var17_14 - var14_11, var18_15 - var15_12, false);
                                try {
                                    try {
                                        if (var2_4 == 0) break block38;
                                        if (var19_16 == null) break block37;
                                    }
                                    catch (oov v15) {
                                        throw ey1.a(v15);
                                    }
                                    var19_16.fwh(var1_1);
                                }
                                catch (oov v16) {
                                    throw ey1.a(v16);
                                }
                            }
                            ++var18_15;
                        }
                        if (var2_4 != 0) continue;
                    }
                    ++var17_14;
                    if (var2_4 != 0) continue block24;
                }
                break;
            }
            this.cya(var1_1);
            var1_1.yj0 = var1_1.o2v;
            var1_1.pgx = var1_1.vbd;
        }
    }

    public boolean ydq(z96 z962, int n, int n2) {
        boolean bl;
        block11: {
            block9: {
                int n3;
                block10: {
                    ey1$d08 ey1$d08;
                    ey1$d08 ey1$d082;
                    block8: {
                        n3 = t9d.b();
                        ey1$d082 = this.w7h(n, n2, false);
                        try {
                            ey1$d08 = ey1$d082;
                            if (n3 == 0) break block8;
                            if (ey1$d08 == null) break block9;
                        }
                        catch (oov oov2) {
                            throw ey1.a(oov2);
                        }
                        ey1$d08 = ey1$d082;
                    }
                    try {
                        try {
                            bl = ey1$d08.sz3(ey1$d08).contains(z962);
                            if (n3 == 0) break block10;
                            if (!bl) break block9;
                        }
                        catch (oov oov3) {
                            throw ey1.a(oov3);
                        }
                        bl = z962.u8j.contains(ey1$d08.cbu(ey1$d082));
                    }
                    catch (oov oov4) {
                        throw ey1.a(oov4);
                    }
                }
                try {
                    if (n3 == 0) break block11;
                    if (bl) break block9;
                }
                catch (oov oov5) {
                    throw ey1.a(oov5);
                }
                bl = true;
                break block11;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public void ke1(int var1_1) {
        block39: {
            block38: {
                var2_2 = t9d.b();
                var1_1 = fe6.faa(var1_1, 3, 64);
                try {
                    try {
                        v0 = var1_1;
                        v1 = this.rnz;
                        if (var2_2 == 0) break block38;
                        if (v0 == v1) break block39;
                    }
                    catch (oov v2) {
                        throw ey1.a(v2);
                    }
                    v0 = var1_1;
                    v1 = this.rnz;
                }
                catch (oov v3) {
                    throw ey1.a(v3);
                }
            }
            var3_3 = v0 - v1;
            var4_4 = Lists.newArrayList((Iterable)this.o75).iterator();
            block26: while (true) {
                v4 = var4_4.hasNext();
                block27: while (v4 != 0) {
                    block40: {
                        var5_5 = (z96)var4_4.next();
                        var6_6 = (int)var5_5.o2v >> 4;
                        var7_7 = (int)var5_5.vbd >> 4;
                        var8_8 = this.avs(var5_5);
                        try {
                            try {
                                if (var2_2 == 0) break block39;
                                v5 = var3_3;
                                if (var2_2 == 0) break block40;
                            }
                            catch (oov v6) {
                                throw ey1.a(v6);
                            }
                            if (v5 > 0) {
                            }
                            ** GOTO lbl84
                        }
                        catch (oov v7) {
                            throw ey1.a(v7);
                        }
                        var9_9 = var6_6 - var1_1;
                        block28: while (true) {
                            v8 = var9_9;
                            block29: while (v8 <= var6_6 + var1_1) {
                                v4 = var7_7 - var1_1;
                                if (var2_2 == 0) continue block27;
                                var10_10 = v4;
                                while (var10_10 <= var7_7 + var1_1) {
                                    block43: {
                                        block44: {
                                            block42: {
                                                block41: {
                                                    v8 = (int)hxt.jwp();
                                                    if (var2_2 == 0) continue block29;
                                                    try {
                                                        try {
                                                            if (var2_2 == 0) break block41;
                                                            if (v8 == 0) break block42;
                                                        }
                                                        catch (oov v9) {
                                                            throw ey1.a(v9);
                                                        }
                                                        var8_8.add(new h2f(var9_9, var10_10));
                                                    }
                                                    catch (oov v10) {
                                                        throw ey1.a(v10);
                                                    }
                                                }
                                                if (var2_2 != 0) break block44;
                                            }
                                            var11_11 = this.w7h(var9_9, var10_10, true);
                                            try {
                                                try {
                                                    if (var2_2 == 0) break block43;
                                                    if (ey1$d08.sz3(var11_11).contains(var5_5)) break block44;
                                                }
                                                catch (oov v11) {
                                                    throw ey1.a(v11);
                                                }
                                                var11_11.n82(var5_5);
                                            }
                                            catch (oov v12) {
                                                throw ey1.a(v12);
                                            }
                                        }
                                        ++var10_10;
                                    }
                                    if (var2_2 != 0) continue;
                                }
                                ++var9_9;
                                if (var2_2 != 0) continue block28;
                            }
                            break;
                        }
                        try {
                            if (var2_2 != 0) continue block26;
lbl84:
                            // 2 sources

                            v5 = var6_6 - this.rnz;
                        }
                        catch (oov v13) {
                            throw ey1.a(v13);
                        }
                    }
                    var9_9 = v5;
                    block31: while (true) {
                        v14 = var9_9;
                        block32: while (v14 <= var6_6 + this.rnz) {
                            v4 = var7_7 - this.rnz;
                            if (var2_2 == 0) continue block27;
                            var10_10 = v4;
                            while (var10_10 <= var7_7 + this.rnz) {
                                block47: {
                                    block46: {
                                        block45: {
                                            v14 = (int)this.oyf(var9_9, var10_10, var6_6, var7_7, var1_1);
                                            if (var2_2 == 0) continue block32;
                                            try {
                                                try {
                                                    if (var2_2 == 0) break block45;
                                                    if (v14 != 0) break block46;
                                                }
                                                catch (oov v15) {
                                                    throw ey1.a(v15);
                                                }
                                                var8_8.remove(new h2f(var9_9, var10_10));
                                            }
                                            catch (oov v16) {
                                                throw ey1.a(v16);
                                            }
                                        }
                                        var11_11 = this.w7h(var9_9, var10_10, true);
                                        try {
                                            try {
                                                if (var2_2 == 0) break block47;
                                                if (var11_11 == null) break block46;
                                            }
                                            catch (oov v17) {
                                                throw ey1.a(v17);
                                            }
                                            var11_11.fwh(var5_5);
                                        }
                                        catch (oov v18) {
                                            throw ey1.a(v18);
                                        }
                                    }
                                    ++var10_10;
                                }
                                if (var2_2 != 0) continue;
                            }
                            ++var9_9;
                            if (var2_2 != 0) continue block31;
                        }
                        break;
                    }
                    if (var2_2 != 0) continue block26;
                }
                break;
            }
            this.rnz = var1_1;
        }
    }

    public static int _97(int n) {
        return n * 16 - 16;
    }

    private PriorityQueue pys(Set set, z96 z962, int n) {
        PriorityQueue priorityQueue;
        block21: {
            float f;
            int n2;
            block20: {
                float f2;
                block19: {
                    n2 = t9d.b();
                    for (f2 = z962.x5k + 90.0f; f2 <= -180.0f; f2 += 360.0f) {
                        try {
                            if (n2 != 0) {
                                if (n2 != 0) continue;
                                break;
                            }
                            break block19;
                        }
                        catch (oov oov2) {
                            throw ey1.a(oov2);
                        }
                    }
                    while (f2 > 180.0f) {
                        f = f2 - 360.0f;
                        if (n2 != 0) {
                            f2 = f;
                            if (n2 != 0) continue;
                        }
                        break block20;
                    }
                }
                f = f2;
            }
            double d = (double)f * (Math.PI / 180);
            double d2 = z962.y2i;
            double d3 = d2 * (Math.PI / 180);
            ChunkPosComparator chunkPosComparator = new ChunkPosComparator(z962.jw4, z962.e6l, d, d3);
            Comparator comparator = Collections.reverseOrder(chunkPosComparator);
            PriorityQueue priorityQueue2 = new PriorityQueue(n, comparator);
            for (h2f h2f2 : set) {
                block24: {
                    Object t;
                    block22: {
                        try {
                            block23: {
                                try {
                                    try {
                                        try {
                                            priorityQueue = priorityQueue2;
                                            if (n2 == 0) break block21;
                                            if (n2 == 0) break block22;
                                        }
                                        catch (oov oov3) {
                                            throw ey1.a(oov3);
                                        }
                                        if (priorityQueue.size() >= n) break block23;
                                    }
                                    catch (oov oov4) {
                                        throw ey1.a(oov4);
                                    }
                                    priorityQueue2.add(h2f2);
                                    if (n2 != 0) break block24;
                                }
                                catch (oov oov5) {
                                    throw ey1.a(oov5);
                                }
                            }
                            t = priorityQueue2.peek();
                        }
                        catch (oov oov6) {
                            throw ey1.a(oov6);
                        }
                    }
                    h2f h2f3 = (h2f)t;
                    try {
                        int n3;
                        try {
                            n3 = chunkPosComparator.compare(h2f2, h2f3);
                            if (n2 == 0 || n3 >= 0) break block24;
                        }
                        catch (oov oov7) {
                            throw ey1.a(oov7);
                        }
                        priorityQueue2.remove();
                        n3 = priorityQueue2.add(h2f2) ? 1 : 0;
                    }
                    catch (oov oov8) {
                        throw ey1.a(oov8);
                    }
                }
                if (n2 != 0) continue;
            }
            priorityQueue = priorityQueue2;
        }
        return priorityQueue;
    }

    private Set avs(z96 z962) {
        block3: {
            Set set;
            block2: {
                int n = t9d.b();
                Set set2 = (Set)this.g5r.get(z962);
                try {
                    set = set2;
                    if (n == 0) break block2;
                    if (set == null) break block3;
                }
                catch (oov oov2) {
                    throw ey1.a(oov2);
                }
                set = set2;
            }
            return set;
        }
        int n = Math.min(this.rnz, 8);
        int n2 = this.rnz * 2 + 1;
        int n3 = n * 2 + 1;
        int n4 = n2 * n2 - n3 * n3;
        n4 = Math.max(n4, 16);
        HashSet hashSet = new HashSet(n4);
        this.g5r.put(z962, hashSet);
        return hashSet;
    }

    public static Logger srl() {
        return o6d;
    }

    public static dug u4y(ey1 ey12) {
        return ey12.ylg;
    }

    public static yo9 tq6(ey1 ey12) {
        return ey12.mg1;
    }

    public static List xsj(ey1 ey12) {
        return ey12.rdd;
    }

    public static List h7m(ey1 ey12) {
        return ey12.r5p;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

