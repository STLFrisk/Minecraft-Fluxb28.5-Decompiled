/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bg8
extends wob {
    private /* synthetic */ t9d jnv;
    private final /* synthetic */ List b_5;
    private final /* synthetic */ List jhc;
    private final /* synthetic */ List m10;
    private /* synthetic */ int n2a;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public bg8(String string) {
        super(string);
        this.b_5 = Lists.newArrayList();
        this.jhc = Lists.newArrayList();
        this.m10 = Lists.newArrayList();
    }

    public bg8(t9d t9d2) {
        super(bg8.m28(t9d2.vzz));
        this.b_5 = Lists.newArrayList();
        this.jhc = Lists.newArrayList();
        this.m10 = Lists.newArrayList();
        this.jnv = t9d2;
        this.hcs();
    }

    public void kyu(t9d t9d2) {
        this.jnv = t9d2;
        Iterator iterator = this.m10.iterator();
        int n = t9d.b();
        while (iterator.hasNext()) {
            j7z j7z2 = (j7z)iterator.next();
            j7z2.d3e(t9d2);
            if (n != 0) continue;
        }
    }

    public void bgl(mew mew2) {
        block9: {
            int n;
            int n2;
            block8: {
                n2 = t9d.c();
                try {
                    try {
                        n = this.b_5.size();
                        if (n2 != 0) break block8;
                        if (n > 64) break block9;
                    }
                    catch (oov oov2) {
                        throw bg8.a(oov2);
                    }
                    n = this.iow(mew2) ? 1 : 0;
                }
                catch (oov oov3) {
                    throw bg8.a(oov3);
                }
            }
            try {
                try {
                    if (n2 != 0 || n != 0) break block9;
                }
                catch (oov oov4) {
                    throw bg8.a(oov4);
                }
                n = this.b_5.add(mew2) ? 1 : 0;
            }
            catch (oov oov5) {
                throw bg8.a(oov5);
            }
        }
    }

    public void o09() {
        block10: {
            bg8 bg82;
            block9: {
                int n;
                block8: {
                    ++this.n2a;
                    Iterator iterator = this.m10.iterator();
                    n = t9d.b();
                    while (iterator.hasNext()) {
                        j7z j7z2 = (j7z)iterator.next();
                        try {
                            j7z2.yeq(this.n2a);
                            if (n != 0) {
                                if (n != 0) continue;
                                break;
                            }
                            break block8;
                        }
                        catch (oov oov2) {
                            throw bg8.a(oov2);
                        }
                    }
                    this.u3w();
                    this.orf();
                    this.khj();
                }
                try {
                    try {
                        bg82 = this;
                        if (n == 0) break block9;
                        if (bg82.n2a % 400 != 0) break block10;
                    }
                    catch (oov oov3) {
                        throw bg8.a(oov3);
                    }
                    bg82 = this;
                }
                catch (oov oov4) {
                    throw bg8.a(oov4);
                }
            }
            bg82.hcs();
        }
    }

    private void u3w() {
        int n = t9d.b();
        Iterator iterator = this.m10.iterator();
        while (iterator.hasNext()) {
            block6: {
                block5: {
                    j7z j7z2 = (j7z)iterator.next();
                    try {
                        try {
                            if (n == 0) break block5;
                            if (!j7z2.fr6()) break block6;
                        }
                        catch (oov oov2) {
                            throw bg8.a(oov2);
                        }
                        iterator.remove();
                    }
                    catch (oov oov3) {
                        throw bg8.a(oov3);
                    }
                }
                this.hcs();
            }
            if (n != 0) continue;
        }
    }

    public List wjb() {
        return this.m10;
    }

    public j7z pom(mew mew2, int n) {
        j7z j7z2;
        block7: {
            j7z j7z3 = null;
            double d = 3.4028234663852886E38;
            Iterator iterator = this.m10.iterator();
            int n2 = t9d.c();
            while (iterator.hasNext()) {
                block9: {
                    double d2;
                    double d3;
                    double d4;
                    j7z j7z4;
                    block8: {
                        j7z2 = j7z4 = (j7z)iterator.next();
                        if (n2 != 0) break block7;
                        d4 = j7z2.n0h().t0u(mew2);
                        try {
                            try {
                                d3 = d4 == d ? 0 : (d4 < d ? -1 : 1);
                                if (n2 != 0) break block8;
                                if (d3 >= 0) break block9;
                            }
                            catch (oov oov2) {
                                throw bg8.a(oov2);
                            }
                            d3 = n + j7z4.hk4();
                        }
                        catch (oov oov3) {
                            throw bg8.a(oov3);
                        }
                    }
                    float f = (float)d3;
                    try {
                        d2 = d4;
                        if (n2 != 0 || !(d2 <= (double)(f * f))) break block9;
                    }
                    catch (oov oov4) {
                        throw bg8.a(oov4);
                    }
                    j7z3 = j7z4;
                    d2 = d = d4;
                }
                if (n2 == 0) continue;
            }
            j7z2 = j7z3;
        }
        return j7z2;
    }

    private void orf() {
        block5: {
            bg8 bg82;
            block4: {
                int n = t9d.c();
                try {
                    try {
                        bg82 = this;
                        if (n != 0) break block4;
                        if (bg82.b_5.isEmpty()) break block5;
                    }
                    catch (oov oov2) {
                        throw bg8.a(oov2);
                    }
                    bg82 = this;
                }
                catch (oov oov3) {
                    throw bg8.a(oov3);
                }
            }
            bg82.z76((mew)this.b_5.remove(0));
        }
    }

    private void khj() {
        block5: {
            int n = t9d.c();
            for (int i = 0; i < this.jhc.size(); ++i) {
                j7z j7z2;
                wdx wdx2;
                block6: {
                    j7z j7z3;
                    block7: {
                        wdx2 = (wdx)this.jhc.get(i);
                        j7z3 = this.pom(wdx2._d5(), 32);
                        try {
                            try {
                                if (n != 0) break block5;
                                j7z2 = j7z3;
                                if (n != 0) break block6;
                            }
                            catch (oov oov2) {
                                throw bg8.a(oov2);
                            }
                            if (j7z2 != null) break block7;
                        }
                        catch (oov oov3) {
                            throw bg8.a(oov3);
                        }
                        j7z3 = new j7z(this.jnv);
                        this.m10.add(j7z3);
                        this.hcs();
                    }
                    j7z2 = j7z3;
                }
                j7z2.hv3(wdx2);
                if (n == 0) continue;
            }
            this.jhc.clear();
        }
    }

    private void z76(mew mew2) {
        int n = 16;
        int n2 = 4;
        int n3 = 16;
        int n4 = t9d.b();
        int n5 = -n;
        block8: while (true) {
            int n6 = n5;
            block9: while (n6 < n) {
                int n7 = -n2;
                block10: while (true) {
                    int n8 = n7;
                    block11: while (n8 < n2) {
                        n6 = -n3;
                        if (n4 == 0) continue block9;
                        int n9 = n6;
                        while (n9 < n3) {
                            block14: {
                                block17: {
                                    mew mew3 = mew2.ec4(n5, n7, n9);
                                    try {
                                        if (n4 == 0) break block14;
                                        n8 = this.m1u(mew3) ? 1 : 0;
                                        if (n4 == 0) continue block11;
                                    }
                                    catch (oov oov2) {
                                        throw bg8.a(oov2);
                                    }
                                    if (n8 != 0) {
                                        wdx wdx2;
                                        block15: {
                                            wdx wdx3 = this.p7z(mew3);
                                            try {
                                                block16: {
                                                    try {
                                                        try {
                                                            wdx2 = wdx3;
                                                            if (n4 == 0) break block15;
                                                            if (wdx2 != null) break block16;
                                                        }
                                                        catch (oov oov3) {
                                                            throw bg8.a(oov3);
                                                        }
                                                        this.o4p(mew3);
                                                        if (n4 != 0) break block17;
                                                    }
                                                    catch (oov oov4) {
                                                        throw bg8.a(oov4);
                                                    }
                                                }
                                                wdx2 = wdx3;
                                            }
                                            catch (oov oov5) {
                                                throw bg8.a(oov5);
                                            }
                                        }
                                        wdx2.zt0(this.n2a);
                                    }
                                }
                                ++n9;
                            }
                            if (n4 != 0) continue;
                        }
                        ++n7;
                        if (n4 != 0) continue block10;
                    }
                    break;
                }
                ++n5;
                if (n4 != 0) continue block8;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private wdx p7z(mew var1_1) {
        var2_2 = t9d.c();
        var3_3 = this.jhc.iterator();
        while (var3_3.hasNext()) {
            block22: {
                block24: {
                    block23: {
                        block21: {
                            var4_4 = (wdx)var3_3.next();
                            try {
                                try {
                                    try {
                                        v0 = var4_4._d5().getX();
                                        if (var2_2 == 0) {
                                            v1 = var1_1.getX();
                                            if (var2_2 != 0) break block21;
                                        }
                                        ** GOTO lbl54
                                    }
                                    catch (oov v2) {
                                        throw bg8.a(v2);
                                    }
                                    if (v0 != v1) break block22;
                                }
                                catch (oov v3) {
                                    throw bg8.a(v3);
                                }
                                v4 = var4_4._d5().getZ();
                                v1 = var1_1.getZ();
                            }
                            catch (oov v5) {
                                throw bg8.a(v5);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (var2_2 != 0) break block23;
                                    if (v4 != v1) break block22;
                                }
                                catch (oov v6) {
                                    throw bg8.a(v6);
                                }
                                v7 = var4_4;
                                if (var2_2 != 0) break block24;
                            }
                            catch (oov v8) {
                                throw bg8.a(v8);
                            }
                            v4 = Math.abs(v7._d5().getY() - var1_1.getY());
                            v1 = 1;
                        }
                        catch (oov v9) {
                            throw bg8.a(v9);
                        }
                    }
                    if (v4 > v1) break block22;
                    v7 = var4_4;
                }
                return v7;
            }
            if (var2_2 == 0) continue;
        }
        var3_3 = this.m10.iterator();
        do {
            block25: {
                v0 = var3_3.hasNext();
lbl54:
                // 2 sources

                if (v0 == 0) break;
                var4_4 = (j7z)var3_3.next();
                var5_5 = var4_4._wo(var1_1);
                try {
                    v10 = var5_5;
                    if (var2_2 != 0) break block25;
                    if (v10 == null) continue;
                }
                catch (oov v11) {
                    throw bg8.a(v11);
                }
                v10 = var5_5;
            }
            return v10;
        } while (var2_2 == 0);
        return null;
    }

    private void o4p(mew mew2) {
        block4: {
            vt2 vt22;
            mew mew3;
            wdx wdx2;
            wdx wdx3;
            List list;
            block6: {
                vt2 vt23;
                block5: {
                    vt2 vt24 = w4e.c5q(this.jnv, mew2);
                    vt23 = vt24.b4b();
                    int n = this.r6_(mew2, vt24, 5);
                    int n2 = this.r6_(mew2, vt23, n + 1);
                    try {
                        try {
                            wdx wdx4;
                            if (n == n2) break block4;
                            list = this.jhc;
                            wdx3 = wdx4;
                            wdx2 = wdx4;
                            mew3 = mew2;
                            if (n >= n2) break block5;
                        }
                        catch (oov oov2) {
                            throw bg8.a(oov2);
                        }
                        vt22 = vt24;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw bg8.a(oov3);
                    }
                }
                vt22 = vt23;
            }
            wdx3(mew3, vt22, this.n2a);
            list.add(wdx2);
        }
    }

    private int r6_(mew mew2, vt2 vt22, int n) {
        int n2;
        block12: {
            int n3 = 0;
            int n4 = 1;
            int n5 = t9d.b();
            while (n4 <= 5) {
                block15: {
                    block14: {
                        int n6;
                        block13: {
                            try {
                                try {
                                    try {
                                        try {
                                            n2 = this.jnv.cfv(mew2.offset(vt22, n4)) ? 1 : 0;
                                            if (n5 == 0) break block12;
                                            if (n5 == 0) break block13;
                                        }
                                        catch (oov oov2) {
                                            throw bg8.a(oov2);
                                        }
                                        if (n2 == 0) break block14;
                                    }
                                    catch (oov oov3) {
                                        throw bg8.a(oov3);
                                    }
                                    ++n3;
                                    if (n5 == 0) break block15;
                                }
                                catch (oov oov4) {
                                    throw bg8.a(oov4);
                                }
                                n6 = n3;
                            }
                            catch (oov oov5) {
                                throw bg8.a(oov5);
                            }
                        }
                        try {
                            if (n6 >= n) {
                                return n3;
                            }
                        }
                        catch (oov oov6) {
                            throw bg8.a(oov6);
                        }
                    }
                    ++n4;
                }
                if (n5 != 0) continue;
            }
            n2 = n3;
        }
        return n2;
    }

    private boolean iow(mew mew2) {
        boolean bl;
        block5: {
            int n = t9d.b();
            for (mew mew3 : this.b_5) {
                block7: {
                    boolean bl2;
                    block6: {
                        try {
                            try {
                                bl = mew3.equals(mew2);
                                if (n == 0) break block5;
                                if (n == 0) break block6;
                            }
                            catch (oov oov2) {
                                throw bg8.a(oov2);
                            }
                            if (!bl) break block7;
                        }
                        catch (oov oov3) {
                            throw bg8.a(oov3);
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

    private boolean m1u(mew mew2) {
        boolean bl;
        block9: {
            block7: {
                block8: {
                    e0x e0x2;
                    block6: {
                        int n = t9d.c();
                        e0x e0x3 = this.jnv.getBlockState(mew2).r_y();
                        try {
                            try {
                                e0x2 = e0x3;
                                if (n != 0) break block6;
                                if (!(e0x2 instanceof w4e)) break block7;
                            }
                            catch (oov oov2) {
                                throw bg8.a(oov2);
                            }
                            e0x2 = e0x3;
                        }
                        catch (oov oov3) {
                            throw bg8.a(oov3);
                        }
                    }
                    try {
                        if (e0x2.p1r() != p3y.fdu) break block8;
                        bl = true;
                        break block9;
                    }
                    catch (oov oov4) {
                        throw bg8.a(oov4);
                    }
                }
                bl = false;
                break block9;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void oo1(bdo bdo2) {
        long l = a ^ 0x13359F55E664L;
        this.n2a = bdo2.uz7((String)((Object)bg8.a("v", (int)22856, (long)(0x7CAB3EA68CA5BD7L ^ l))));
        qhg qhg2 = bdo2.bzb((String)((Object)bg8.a("v", (int)27953, (long)(0x259AF363106AEFAFL ^ l))), 10);
        int n = t9d.b();
        for (int i = 0; i < qhg2.vek(); ++i) {
            bdo bdo3 = qhg2.kd6(i);
            j7z j7z2 = new j7z();
            j7z2.x0m(bdo3);
            this.m10.add(j7z2);
            if (n != 0) continue;
        }
    }

    @Override
    public void _j9(bdo bdo2) {
        block4: {
            long l = a ^ 0x4B1779E451F5L;
            bdo2.iin((String)((Object)bg8.a("v", (int)4859, (long)(0x5E4B47CE7B61A7F7L ^ l))), this.n2a);
            qhg qhg2 = new qhg();
            int n = t9d.b();
            for (j7z j7z2 : this.m10) {
                bdo bdo3 = new bdo();
                try {
                    j7z2.z7g(bdo3);
                    qhg2.w2j(bdo3);
                    if (n != 0) {
                        if (n != 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw bg8.a(oov2);
                }
            }
            bdo2.rzm((String)((Object)bg8.a("v", (int)21883, (long)(0x6B39D2014D816072L ^ l))), qhg2);
        }
    }

    public static String m28(upn upn2) {
        long l = a ^ 0x5CCAB7250B76L;
        return (String)((Object)bg8.a("v", (int)17127, (long)(0x6E91207DD2B3AD69L ^ l))) + upn2.org();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                bg8.a = c.a(7320632205699879480L, -8274236079370958572L, MethodHandles.lookup().lookupClass()).a(78404137355135L);
                bg8.d = new HashMap<K, V>(13);
                var0 = bg8.a ^ 4416219380679L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u0096\u0019\u00ac\u0010\u00aa\u00b5#\u008e\u00f7\u00fbb\u0080,\rG\u00d0\u009b\u00deQ\u00da\u00f9zAD\u0010\u009f\u00b2\r\u008eX\u00ff\u0091\u00ee\u00d4\u00d6\u0080\u0095@ v\u00fa .Y\u0090\u00ce\u00a0\u0087EI\u00fd\u00e9a\u0001\u00eaw\u00f9\u00d6\u0096\u00f8'\u00bd\u00d6x\u00aa;\u00876~\u0097^\u00e7P\u00c8";
                var8_6 = "\u0096\u0019\u00ac\u0010\u00aa\u00b5#\u008e\u00f7\u00fbb\u0080,\rG\u00d0\u009b\u00deQ\u00da\u00f9zAD\u0010\u009f\u00b2\r\u008eX\u00ff\u0091\u00ee\u00d4\u00d6\u0080\u0095@ v\u00fa .Y\u0090\u00ce\u00a0\u0087EI\u00fd\u00e9a\u0001\u00eaw\u00f9\u00d6\u0096\u00f8'\u00bd\u00d6x\u00aa;\u00876~\u0097^\u00e7P\u00c8".length();
                var5_7 = 24;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = bg8.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u008f;\u001e\u0080k\u0001\u0019\u00aa\u00c1\u0088.M:\u0095\n8\u0018\u00bb\u00a3,\u00939@\u0019\u00a9$\u0089\u0090\u007f\u00fa\u00c5\u00c0\u00f8~\u00c8\u00f9O\u00fb\u001dS\u0017";
                    var8_6 = "\u008f;\u001e\u0080k\u0001\u0019\u00aa\u00c1\u0088.M:\u0095\n8\u0018\u00bb\u00a3,\u00939@\u0019\u00a9$\u0089\u0090\u007f\u00fa\u00c5\u00c0\u00f8~\u00c8\u00f9O\u00fb\u001dS\u0017".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = bg8.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        bg8.b = var9_3;
        bg8.c = new String[5];
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c2;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (i >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3EEA;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("bg8", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            bg8.c[n2] = bg8.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bg8.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("bg8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bg8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

