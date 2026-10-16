/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class fln
extends uk2 {
    private _89 amx;
    public Map b8o = Maps.newHashMap();
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public abstract String tqd();

    /*
     * Unable to fully structure code
     */
    @Override
    public final void bjr(t9d var1_1, int var2_2, int var3_3, int var4_4, int var5_5, lno var6_6) {
        block10: {
            var7_7 = fln.a ^ 68006120964355L;
            var9_8 = t9d.c();
            try {
                this.it0(var1_1);
                v0 = this.b8o.containsKey(h2f.fcz(var2_2, var3_3));
                if (var9_8 == 0) {
                    if (v0) break block10;
                }
                ** GOTO lbl20
            }
            catch (Throwable v1) {
                throw fln.a(v1);
            }
            this.a0f.nextInt();
            try {
                block11: {
                    v2 = this;
                    v3 = var2_2;
                    v4 = var3_3;
                    if (var9_8 != 0) break block11;
                    v0 = v2.ary(v3, v4);
lbl20:
                    // 2 sources

                    try {
                        if (!v0) break block10;
                        v2 = this;
                        v3 = var2_2;
                        v4 = var3_3;
                    }
                    catch (Throwable v5) {
                        throw fln.a(v5);
                    }
                }
                var10_9 = v2.sph(v3, v4);
                this.b8o.put(h2f.fcz(var2_2, var3_3), var10_9);
                this.eha(var2_2, var3_3, var10_9);
            }
            catch (Throwable var10_10) {
                var11_11 = e1i.cor(var10_10, (String)fln.a("u", (int)16122, (long)(2753680489090308974L ^ var7_7)));
                var12_12 = var11_11.i_r((String)fln.a("u", (int)31104, (long)(2862128655281429532L ^ var7_7)));
                var12_12.h1o((String)fln.a("u", (int)30448, (long)(5911712793526014829L ^ var7_7)), new fln$1(this, var2_2, var3_3));
                var12_12._0p((String)fln.a("u", (int)9090, (long)(9146224573480257044L ^ var7_7)), String.format((String)fln.a("u", (int)23314, (long)(1524772967751270029L ^ var7_7)), new Object[]{var2_2, var3_3}));
                var12_12.h1o((String)fln.a("u", (int)26562, (long)(3836694291885228624L ^ var7_7)), new fln$2(this, var2_2, var3_3));
                var12_12.h1o((String)fln.a("u", (int)16988, (long)(6398478156092745675L ^ var7_7)), new fln$3(this));
                throw new oov(var11_11);
            }
        }
    }

    public boolean vd1(t9d t9d2, Random random, h2f h2f2) {
        boolean bl;
        block15: {
            this.it0(t9d2);
            int n = (h2f2.jnd << 4) + 8;
            int n2 = (h2f2.km5 << 4) + 8;
            boolean bl2 = false;
            Iterator iterator = this.b8o.values().iterator();
            int n3 = t9d.c();
            while (iterator.hasNext()) {
                block17: {
                    boolean bl3;
                    ijb ijb2;
                    block19: {
                        block18: {
                            block16: {
                                ijb2 = (ijb)iterator.next();
                                try {
                                    try {
                                        try {
                                            bl = ijb2.z1p();
                                            if (n3 != 0) break block15;
                                            if (n3 != 0) break block16;
                                        }
                                        catch (oov oov2) {
                                            throw fln.a(oov2);
                                        }
                                        if (!bl) break block17;
                                    }
                                    catch (oov oov3) {
                                        throw fln.a(oov3);
                                    }
                                    bl3 = ijb2.vud(h2f2);
                                }
                                catch (oov oov4) {
                                    throw fln.a(oov4);
                                }
                            }
                            try {
                                try {
                                    if (n3 != 0) break block18;
                                    if (!bl3) break block17;
                                }
                                catch (oov oov5) {
                                    throw fln.a(oov5);
                                }
                                bl3 = ijb2.rbg()._dk(n, n2, n + 15, n2 + 15);
                            }
                            catch (oov oov6) {
                                throw fln.a(oov6);
                            }
                        }
                        try {
                            try {
                                if (n3 != 0) break block19;
                                if (!bl3) break block17;
                            }
                            catch (oov oov7) {
                                throw fln.a(oov7);
                            }
                            ijb2.lbp(t9d2, random, new yve(n, n2, n + 15, n2 + 15));
                            ijb2.t4h(h2f2);
                            bl3 = true;
                        }
                        catch (oov oov8) {
                            throw fln.a(oov8);
                        }
                    }
                    bl2 = bl3;
                    this.eha(ijb2.vdh(), ijb2.x65(), ijb2);
                }
                if (n3 == 0) continue;
            }
            bl = bl2;
        }
        return bl;
    }

    public boolean vy1(mew mew2) {
        boolean bl;
        try {
            this.it0(this.pr9);
            bl = this.aki(mew2) != null;
        }
        catch (oov oov2) {
            throw fln.a(oov2);
        }
        return bl;
    }

    public ijb aki(mew mew2) {
        int n = t9d.b();
        for (ijb ijb2 : this.b8o.values()) {
            block12: {
                ijb ijb3;
                block13: {
                    boolean bl;
                    block11: {
                        try {
                            try {
                                try {
                                    bl = ijb2.z1p();
                                    if (n == 0) break block11;
                                    if (!bl) break block12;
                                }
                                catch (oov oov2) {
                                    throw fln.a(oov2);
                                }
                                ijb3 = ijb2;
                                if (n == 0) break block13;
                            }
                            catch (oov oov3) {
                                throw fln.a(oov3);
                            }
                            bl = ijb3.rbg().vwy(mew2);
                        }
                        catch (oov oov4) {
                            throw fln.a(oov4);
                        }
                    }
                    if (!bl) break block12;
                    ijb3 = ijb2;
                }
                for (xi1 xi12 : ijb3.fd9()) {
                    block15: {
                        block14: {
                            try {
                                if (!xi12.q1q().vwy(mew2)) break block14;
                                break block15;
                            }
                            catch (oov oov5) {
                                throw fln.a(oov5);
                            }
                        }
                        if (n != 0) continue;
                    }
                    return ijb2;
                }
                continue;
            }
            if (n != 0) continue;
        }
        return null;
    }

    public boolean g3m(t9d t9d2, mew mew2) {
        boolean bl;
        block9: {
            this.it0(t9d2);
            Iterator iterator = this.b8o.values().iterator();
            int n = t9d.c();
            while (iterator.hasNext()) {
                block11: {
                    boolean bl2;
                    block12: {
                        block10: {
                            ijb ijb2 = (ijb)iterator.next();
                            try {
                                try {
                                    try {
                                        bl = ijb2.z1p();
                                        if (n != 0) break block9;
                                        if (n != 0) break block10;
                                    }
                                    catch (oov oov2) {
                                        throw fln.a(oov2);
                                    }
                                    if (!bl) break block11;
                                }
                                catch (oov oov3) {
                                    throw fln.a(oov3);
                                }
                                bl2 = ijb2.rbg().vwy(mew2);
                            }
                            catch (oov oov4) {
                                throw fln.a(oov4);
                            }
                        }
                        try {
                            if (n != 0) break block12;
                            if (!bl2) break block11;
                        }
                        catch (oov oov5) {
                            throw fln.a(oov5);
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                if (n == 0) continue;
            }
            bl = false;
        }
        return bl;
    }

    public mew p3b(t9d t9d2, mew mew2) {
        double d;
        mew mew3;
        Object object;
        Object object2;
        Object object3;
        double d2;
        int n;
        block19: {
            mew mew4;
            block23: {
                this.pr9 = t9d2;
                int n2 = t9d.b();
                this.it0(t9d2);
                this.a0f.setSeed(t9d2.x2p());
                long l = this.a0f.nextLong();
                long l2 = this.a0f.nextLong();
                long l3 = (long)(mew2.getX() >> 4) * l;
                n = n2;
                long l4 = (long)(mew2.getZ() >> 4) * l2;
                this.a0f.setSeed(l3 ^ l4 ^ t9d2.x2p());
                this.bjr(t9d2, mew2.getX() >> 4, mew2.getZ() >> 4, 0, 0, null);
                d2 = Double.MAX_VALUE;
                mew mew5 = null;
                object3 = this.b8o.values().iterator();
                while (object3.hasNext()) {
                    block21: {
                        double d3;
                        block22: {
                            ijb ijb2;
                            block20: {
                                object2 = (ijb)object3.next();
                                try {
                                    try {
                                        try {
                                            if (n == 0) break block19;
                                            ijb2 = object2;
                                            if (n == 0) break block20;
                                        }
                                        catch (oov oov2) {
                                            throw fln.a(oov2);
                                        }
                                        if (!ijb2.z1p()) break block21;
                                    }
                                    catch (oov oov3) {
                                        throw fln.a(oov3);
                                    }
                                    ijb2 = ((ijb)object2).fd9().get(0);
                                }
                                catch (oov oov4) {
                                    throw fln.a(oov4);
                                }
                            }
                            object = (xi1)((Object)ijb2);
                            mew3 = ((xi1)object).xqt();
                            d = mew3.t0u(mew2);
                            try {
                                try {
                                    d3 = d;
                                    if (n == 0) break block22;
                                    if (!(d3 < d2)) break block21;
                                }
                                catch (oov oov5) {
                                    throw fln.a(oov5);
                                }
                                d3 = d;
                            }
                            catch (oov oov6) {
                                throw fln.a(oov6);
                            }
                        }
                        d2 = d3;
                        mew5 = mew3;
                    }
                    if (n != 0) continue;
                }
                try {
                    mew4 = mew5;
                    if (n == 0) break block23;
                    if (mew4 == null) break block19;
                }
                catch (oov oov7) {
                    throw fln.a(oov7);
                }
                mew4 = mew5;
            }
            return mew4;
        }
        if ((object3 = this.f_m()) != null) {
            Object object4;
            block24: {
                object2 = null;
                object = object3.iterator();
                while (object.hasNext()) {
                    block26: {
                        double d4;
                        block25: {
                            mew3 = (mew)object.next();
                            object4 = mew3;
                            if (n == 0) break block24;
                            d = ((wgo)object4).t0u(mew2);
                            try {
                                try {
                                    d4 = d;
                                    if (n == 0) break block25;
                                    if (!(d4 < d2)) break block26;
                                }
                                catch (oov oov8) {
                                    throw fln.a(oov8);
                                }
                                d4 = d;
                            }
                            catch (oov oov9) {
                                throw fln.a(oov9);
                            }
                        }
                        d2 = d4;
                        object2 = mew3;
                    }
                    if (n != 0) continue;
                }
                object4 = object2;
            }
            return object4;
        }
        return null;
    }

    public List f_m() {
        return null;
    }

    private void it0(t9d t9d2) {
        block28: {
            _89 _892;
            int n;
            long l;
            block29: {
                block27: {
                    l = a ^ 0x17155CC2F0E4L;
                    n = t9d.b();
                    try {
                        try {
                            _892 = this.amx;
                            if (n == 0) break block27;
                            if (_892 != null) break block28;
                        }
                        catch (oov oov2) {
                            throw fln.a(oov2);
                        }
                        _892 = this.amx = (_89)t9d2.hyf(_89.class, this.tqd());
                    }
                    catch (oov oov3) {
                        throw fln.a(oov3);
                    }
                }
                try {
                    block30: {
                        try {
                            try {
                                if (n == 0) break block29;
                                if (_892 != null) break block30;
                            }
                            catch (oov oov4) {
                                throw fln.a(oov4);
                            }
                            this.amx = new _89(this.tqd());
                            t9d2.m5k(this.tqd(), this.amx);
                            if (n != 0) break block28;
                        }
                        catch (oov oov5) {
                            throw fln.a(oov5);
                        }
                    }
                    _892 = this.amx;
                }
                catch (oov oov6) {
                    throw fln.a(oov6);
                }
            }
            bdo bdo2 = _892.whi();
            for (String string : bdo2.bo9()) {
                block32: {
                    int n2;
                    bdo bdo3;
                    block34: {
                        block33: {
                            gdw gdw2;
                            block31: {
                                gdw gdw3 = bdo2.e2o(string);
                                try {
                                    try {
                                        gdw2 = gdw3;
                                        if (n == 0) break block31;
                                        if (gdw2.ky0() != 10) break block32;
                                    }
                                    catch (oov oov7) {
                                        throw fln.a(oov7);
                                    }
                                    gdw2 = gdw3;
                                }
                                catch (oov oov8) {
                                    throw fln.a(oov8);
                                }
                            }
                            bdo3 = (bdo)gdw2;
                            try {
                                try {
                                    n2 = bdo3.dmw((String)((Object)fln.a("u", (int)23523, (long)(0x10501970B0D60F91L ^ l))));
                                    if (n == 0) break block33;
                                    if (n2 == 0) break block32;
                                }
                                catch (oov oov9) {
                                    throw fln.a(oov9);
                                }
                                n2 = bdo3.dmw((String)((Object)fln.a("u", (int)1444, (long)(0x20CEA5C4634551D2L ^ l))));
                            }
                            catch (oov oov10) {
                                throw fln.a(oov10);
                            }
                        }
                        try {
                            try {
                                if (n == 0) break block34;
                                if (n2 == 0) break block32;
                            }
                            catch (oov oov11) {
                                throw fln.a(oov11);
                            }
                            n2 = bdo3.uz7((String)((Object)fln.a("u", (int)24212, (long)(0x545A8EA5FA608AE0L ^ l))));
                        }
                        catch (oov oov12) {
                            throw fln.a(oov12);
                        }
                    }
                    int n3 = n2;
                    int n4 = bdo3.uz7((String)((Object)fln.a("u", (int)8397, (long)(0x5C8533CD317EF4BAL ^ l))));
                    ijb ijb2 = v8a.wch(bdo3, t9d2);
                    try {
                        ijb ijb3;
                        try {
                            ijb3 = ijb2;
                            if (n == 0 || ijb3 == null) break block32;
                        }
                        catch (oov oov13) {
                            throw fln.a(oov13);
                        }
                        ijb3 = this.b8o.put(h2f.fcz(n3, n4), ijb2);
                    }
                    catch (oov oov14) {
                        throw fln.a(oov14);
                    }
                }
                if (n != 0) continue;
            }
        }
    }

    private void eha(int n, int n2, ijb ijb2) {
        this.amx.j2m(ijb2._u5(n, n2), n, n2);
        this.amx.hcs();
    }

    public abstract boolean ary(int var1, int var2);

    public abstract ijb sph(int var1, int var2);

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                fln.a = c.a(-6936595122909085822L, -2091649650270019652L, MethodHandles.lookup().lookupClass()).a(162637019357951L);
                fln.e = new HashMap<K, V>(13);
                var0 = fln.a ^ 71753133987617L;
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
                var9_3 = new String[11];
                var7_4 = 0;
                var6_5 = "?#no+\u00c5f\u0088\u00b9L&\u0007 Vj\u00c0@?\u000f\u00c29\u00c68\u00c8\u00dc\u009c)mt\u0002\u00b2\u0097\u00a8\u0083\u0000\u00a5\u00bc1\u00b4\u008a2L\u007f\u0011&\u00b3\u00d8G\u00c8\u00b9\u0092\u00d0\u0003\u00ba\u00afC\u00f9\u00c6>\u00be|+S\u000b\u00f6]\u00f8j\u00e2r\u0013\u0090\u00b3\u00aaP\u00bd\u00ae\u0090\u00bfI0 2\u001a,\u00e8\u001bS\u00e5Y)\u00fb\u00f4B\u00d7\u00ee\u00a7?\u00a3\u0014So\u00b0\u00bf@eY\u00b0A\u001fGlYV\u0018=\u00c1?\u001d\u00c6\u00de\u008b\u00e8B4\\\u0016k%mfh\u00cc\u00cen\u007f3\u00cdH\u0010\u00db\"^\u00cdW\rqeC\u0090\u0004\u00fe\u00feDR\u00e5\u0010\u0090\u00fc\u0017a\u001f\u00f6\u000bA.oKqL}&Y\u0010\u00b3\u00f2\u0005\u009e\u0092m\u00d5\u00cbGE\u009d\u001f{\u00bc\u00c9\u00a0 \u008e\u0081F\u00129\u000b*m\u00be\u00c3C\u00fa\u00ab\u0015\u0012\u0095\u00f6\u0019\n\u00a6\\\u00fb\u00af\u0003\u000f\u001d\u00ef\u00d5\u00b6\u00fd-\u00cf(\u00e6\u008f\u00cd\u0088\u007f\u00ce\u00b2\u00b1\u00c9x\u0010\u00b7\u00e7\u00b2\u0002\u0084\u0004u\u00b1\u00fdN\u00a5R\\2\u00d3Mn\u0006\"\u00ef\u0012\u00b6\u0004_Z\u00bb\u00dc\u00d3\u00b8";
                var8_6 = "?#no+\u00c5f\u0088\u00b9L&\u0007 Vj\u00c0@?\u000f\u00c29\u00c68\u00c8\u00dc\u009c)mt\u0002\u00b2\u0097\u00a8\u0083\u0000\u00a5\u00bc1\u00b4\u008a2L\u007f\u0011&\u00b3\u00d8G\u00c8\u00b9\u0092\u00d0\u0003\u00ba\u00afC\u00f9\u00c6>\u00be|+S\u000b\u00f6]\u00f8j\u00e2r\u0013\u0090\u00b3\u00aaP\u00bd\u00ae\u0090\u00bfI0 2\u001a,\u00e8\u001bS\u00e5Y)\u00fb\u00f4B\u00d7\u00ee\u00a7?\u00a3\u0014So\u00b0\u00bf@eY\u00b0A\u001fGlYV\u0018=\u00c1?\u001d\u00c6\u00de\u008b\u00e8B4\\\u0016k%mfh\u00cc\u00cen\u007f3\u00cdH\u0010\u00db\"^\u00cdW\rqeC\u0090\u0004\u00fe\u00feDR\u00e5\u0010\u0090\u00fc\u0017a\u001f\u00f6\u000bA.oKqL}&Y\u0010\u00b3\u00f2\u0005\u009e\u0092m\u00d5\u00cbGE\u009d\u001f{\u00bc\u00c9\u00a0 \u008e\u0081F\u00129\u000b*m\u00be\u00c3C\u00fa\u00ab\u0015\u0012\u0095\u00f6\u0019\n\u00a6\\\u00fb\u00af\u0003\u000f\u001d\u00ef\u00d5\u00b6\u00fd-\u00cf(\u00e6\u008f\u00cd\u0088\u007f\u00ce\u00b2\u00b1\u00c9x\u0010\u00b7\u00e7\u00b2\u0002\u0084\u0004u\u00b1\u00fdN\u00a5R\\2\u00d3Mn\u0006\"\u00ef\u0012\u00b6\u0004_Z\u00bb\u00dc\u00d3\u00b8".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = fln.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "5\u0001\u0015\u0090d\u00b00\u00db~\u0005\u00178\u0091\u00c8\u00f5\u00ab\u00dc\u009c\u00d6\u00bbi\u0095\u00c9\u00dc\u00dd\u0082\u00aa\u008b\u00ab\u008c\u00b9\u00be\u001c\u00f2\u00ea\u00e9\u00f5\u00b9\u00f6\u00ed\u0010\u00dc\u00e6Xc\u00ee\t\u00a9\u00d38b\u00b5\u00ee\u0000JJ>";
                    var8_6 = "5\u0001\u0015\u0090d\u00b00\u00db~\u0005\u00178\u0091\u00c8\u00f5\u00ab\u00dc\u009c\u00d6\u00bbi\u0095\u00c9\u00dc\u00dd\u0082\u00aa\u008b\u00ab\u008c\u00b9\u00be\u001c\u00f2\u00ea\u00e9\u00f5\u00b9\u00f6\u00ed\u0010\u00dc\u00e6Xc\u00ee\t\u00a9\u00d38b\u00b5\u00ee\u0000JJ>".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = fln.a(var10_9).intern();
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
        fln.c = var9_3;
        fln.d = new String[11];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x27C3;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("fln", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            fln.d[n2] = fln.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fln.a(n, l);
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
            throw new RuntimeException("fln" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fln.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

