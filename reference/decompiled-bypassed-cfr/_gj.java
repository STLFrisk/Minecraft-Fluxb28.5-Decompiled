/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class _gj
extends j37 {
    private final /* synthetic */ bdv bbz;
    private static final long c;
    private static final String[] h;
    private static final String[] y;
    private static final Map z;

    public _gj(t9d t9d2) {
        super(t9d2);
        this.yxc(0.9f, 0.9f);
        ((zvv)this.zq2()).uuq(true);
        this.r1d.tn8(0, new dnq(this));
        this.r1d.tn8(1, new p1g(this, 1.25));
        this.bbz = new bdv(this, 0.3f);
        this.r1d.tn8(2, this.bbz);
        this.r1d.tn8(3, new rg_(this, 1.0));
        this.r1d.tn8(4, new ttn(this, 1.2, xbr.nz4, false));
        this.r1d.tn8(4, new ttn(this, 1.2, xbr.aar, false));
        this.r1d.tn8(5, new bun(this, 1.1));
        this.r1d.tn8(6, new _tb(this, 1.0));
        this.r1d.tn8(7, new bdq(this, ha9.class, 6.0f));
        this.r1d.tn8(8, new ov6(this));
    }

    @Override
    public void nyy() {
        super.nyy();
        this.dgt(m6d.t9k).zf7(10.0);
        this.dgt(m6d.w7i).zf7(0.25);
    }

    @Override
    public boolean t1g() {
        boolean bl;
        block6: {
            block5: {
                erg erg2;
                block4: {
                    int n = t9d.b();
                    erg erg3 = ((ha9)this.wgv).tsc();
                    try {
                        erg2 = erg3;
                        if (n == 0) break block4;
                        if (erg2 == null) break block5;
                    }
                    catch (oov oov2) {
                        throw _gj.a(oov2);
                    }
                    erg2 = erg3;
                }
                try {
                    if (erg2.gn1() != xbr.nz4) break block5;
                    bl = true;
                    break block6;
                }
                catch (oov oov3) {
                    throw _gj.a(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void tbj() {
        super.tbj();
        this.oit.kp2(16, (byte)0);
    }

    @Override
    public void srs(bdo bdo2) {
        long l = c ^ 0x49A0D9FF77EDL;
        super.srs(bdo2);
        bdo2.zyu((String)((Object)_gj.f("j", (int)13630, (long)(0x7811289086189126L ^ l))), this.vlb());
    }

    @Override
    public void cjb(bdo bdo2) {
        long l = c ^ 0x3F0E9CA01B46L;
        super.cjb(bdo2);
        this.hfu(bdo2.dvl((String)((Object)_gj.f("j", (int)19397, (long)(0x3C9C2FF8F71F8373L ^ l)))));
    }

    @Override
    public String _n1() {
        long l = c ^ 0x489E8F884D9BL;
        return _gj.f("j", (int)11183, (long)(0x7F108ACF6913B5C7L ^ l));
    }

    @Override
    public String wcg() {
        long l = c ^ 0x523FC5C142E3L;
        return _gj.f("j", (int)5939, (long)(0x6870143504DC8624L ^ l));
    }

    @Override
    public String ix6() {
        long l = c ^ 0x6D4902B0F4ADL;
        return _gj.f("j", (int)1624, (long)(0x531BFC361E9A104L ^ l));
    }

    @Override
    public void cmh(mew mew2, e0x e0x2) {
        long l = c ^ 0x1933A21CADE1L;
        this.lhu((String)((Object)_gj.f("j", (int)21495, (long)(0x4EF1259E21DADE4L ^ l))), 0.15f, 1.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean hp6(ha9 ha92) {
        block22: {
            i2h i2h2;
            block21: {
                boolean bl;
                int n;
                block19: {
                    block20: {
                        n = t9d.c();
                        try {
                            try {
                                bl = super.hp6(ha92);
                                if (n != 0) break block19;
                                if (!bl) break block20;
                                return true;
                            }
                            catch (oov oov2) {
                                throw _gj.a(oov2);
                            }
                        }
                        catch (oov oov3) {
                            throw _gj.a(oov3);
                        }
                    }
                    bl = this.vlb();
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (n != 0) return bl;
                                        if (!bl) return false;
                                    }
                                    catch (oov oov4) {
                                        throw _gj.a(oov4);
                                    }
                                    bl = this.oay.v0f;
                                    if (n != 0) return bl;
                                }
                                catch (oov oov5) {
                                    throw _gj.a(oov5);
                                }
                                if (bl) return false;
                            }
                            catch (oov oov6) {
                                throw _gj.a(oov6);
                            }
                            i2h2 = this.wgv;
                            if (n != 0) break block21;
                        }
                        catch (oov oov7) {
                            throw _gj.a(oov7);
                        }
                        if (i2h2 == null) break block22;
                    }
                    catch (oov oov8) {
                        throw _gj.a(oov8);
                    }
                    i2h2 = this.wgv;
                }
                catch (oov oov9) {
                    throw _gj.a(oov9);
                }
            }
            try {
                if (i2h2 != ha92) {
                    return false;
                }
            }
            catch (oov oov10) {
                throw _gj.a(oov10);
            }
        }
        ha92.nw9(this);
        return true;
    }

    @Override
    public u7m q4n() {
        u7m u7m2;
        try {
            u7m2 = this.agj() ? xbr.li3 : xbr.tf4;
        }
        catch (oov oov2) {
            throw _gj.a(oov2);
        }
        return u7m2;
    }

    @Override
    public void ir3(boolean bl, int n) {
        block17: {
            _gj _gj2;
            block16: {
                boolean bl2;
                block14: {
                    int n2 = this.z2d.nextInt(3) + 1 + this.z2d.nextInt(1 + n);
                    int n3 = t9d.c();
                    for (int i = 0; i < n2; ++i) {
                        _gj _gj3;
                        block13: {
                            try {
                                block15: {
                                    try {
                                        try {
                                            try {
                                                _gj3 = this;
                                                if (n3 != 0) break block13;
                                                bl2 = _gj3.agj();
                                                if (n3 != 0) break block14;
                                            }
                                            catch (oov oov2) {
                                                throw _gj.a(oov2);
                                            }
                                            if (!bl2) break block15;
                                        }
                                        catch (oov oov3) {
                                            throw _gj.a(oov3);
                                        }
                                        this.e70(xbr.li3, 1);
                                        if (n3 == 0) continue;
                                    }
                                    catch (oov oov4) {
                                        throw _gj.a(oov4);
                                    }
                                }
                                _gj3 = this;
                            }
                            catch (oov oov5) {
                                throw _gj.a(oov5);
                            }
                        }
                        _gj3.e70(xbr.tf4, 1);
                        if (n3 == 0) continue;
                    }
                    try {
                        _gj2 = this;
                        if (n3 != 0) break block16;
                        bl2 = _gj2.vlb();
                    }
                    catch (oov oov6) {
                        throw _gj.a(oov6);
                    }
                }
                if (!bl2) break block17;
                _gj2 = this;
            }
            _gj2.e70(xbr.fpq, 1);
        }
    }

    public boolean vlb() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.oit.miz(16) & 1;
                    if (n == 0) break block2;
                    if (!bl) break block3;
                }
                catch (oov oov2) {
                    throw _gj.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public void hfu(boolean bl) {
        block5: {
            int n = t9d.b();
            try {
                block4: {
                    try {
                        if (!bl) break block4;
                        this.oit.c66(16, (byte)1);
                        if (n != 0) break block5;
                    }
                    catch (oov oov2) {
                        throw _gj.a(oov2);
                    }
                }
                this.oit.c66(16, (byte)0);
            }
            catch (oov oov3) {
                throw _gj.a(oov3);
            }
        }
    }

    @Override
    public void nzg(_6b _6b2) {
        block10: {
            boolean bl;
            int n;
            block9: {
                n = t9d.b();
                try {
                    try {
                        bl = this.oay.v0f;
                        if (n == 0) break block9;
                        if (bl) break block10;
                    }
                    catch (oov oov2) {
                        throw _gj.a(oov2);
                    }
                    bl = this.ma9;
                }
                catch (oov oov3) {
                    throw _gj.a(oov3);
                }
            }
            if (!bl) {
                block11: {
                    boolean bl2;
                    v9i v9i2;
                    block12: {
                        v9i2 = new v9i(this.oay);
                        try {
                            try {
                                v9i2.fga(0, new erg(xbr.g8a));
                                v9i2.x24(this.o2v, this.kfp, this.vbd, this.x5k, this.y2i);
                                v9i2.x53(this.r1t());
                                bl2 = this.qrh();
                                if (n == 0) break block11;
                                if (!bl2) break block12;
                            }
                            catch (oov oov4) {
                                throw _gj.a(oov4);
                            }
                            v9i2.x84(this.hei());
                            v9i2.krn(this.bpc());
                        }
                        catch (oov oov5) {
                            throw _gj.a(oov5);
                        }
                    }
                    bl2 = this.oay.xzq(v9i2);
                }
                this._kl();
            }
        }
    }

    @Override
    public void ibc(float f, float f2) {
        block9: {
            i2h i2h2;
            block10: {
                float f3;
                block8: {
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                super.ibc(f, f2);
                                float f4 = f - 5.0f;
                                f3 = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                                if (n != 0) break block8;
                                if (f3 <= 0) break block9;
                            }
                            catch (oov oov2) {
                                throw _gj.a(oov2);
                            }
                            i2h2 = this.wgv;
                            if (n != 0) break block10;
                        }
                        catch (oov oov3) {
                            throw _gj.a(oov3);
                        }
                        f3 = (float)(i2h2 instanceof ha9);
                    }
                    catch (oov oov4) {
                        throw _gj.a(oov4);
                    }
                }
                try {
                    if (f3 == false) break block9;
                    i2h2 = this.wgv;
                }
                catch (oov oov5) {
                    throw _gj.a(oov5);
                }
            }
            ((ha9)i2h2).aex(y8d.jno);
        }
    }

    @Override
    public _gj kv0(dms dms2) {
        return new _gj(this.oay);
    }

    @Override
    public boolean _cv(erg erg2) {
        boolean bl;
        block6: {
            block5: {
                erg erg3;
                block4: {
                    int n = t9d.b();
                    try {
                        erg3 = erg2;
                        if (n == 0) break block4;
                        if (erg3 == null) break block5;
                    }
                    catch (oov oov2) {
                        throw _gj.a(oov2);
                    }
                    erg3 = erg2;
                }
                try {
                    if (erg3.gn1() != xbr.aar) break block5;
                    bl = true;
                    break block6;
                }
                catch (oov oov3) {
                    throw _gj.a(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    public bdv hl4() {
        return this.bbz;
    }

    @Override
    public dms kv0(dms dms2) {
        return this.kv0(dms2);
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

                _gj.c = c.a(-7677972379842162792L, -369113134298103612L, MethodHandles.lookup().lookupClass()).a(131487555550397L);
                _gj.z = new HashMap<K, V>(13);
                var0 = _gj.c ^ 29739943416635L;
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
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "ce\u0082WXD\u00fd\u008c\u009a$\u0087\u00b9JM-\u00db tn\u00be5_b\u00d0\u0011\u0018p'X\u00f0\u00df\u00f8,t(Y\u0097/r\u00bc=l\u0016l\u00bd\u00ebq?\u00f5 f\u00b0\u0013\u008a\u00bf\u0092\u00dc\u00f4\u001a\u001c?p\u00f8\u0015`\u00f3\t\u000e\u00b9\u0092\u001b\u00c9\u008c\b\u00f0B \u0007\u0085\u00b0h\u0093\u0018\u00c2w\u00ae\u00f0\u00f5\u00e5\u00ad\u0010i\u00d1[:\u00af\u00b5\u001aq{\u0086&CG\u00de\u00d9\u00f9";
                var8_6 = "ce\u0082WXD\u00fd\u008c\u009a$\u0087\u00b9JM-\u00db tn\u00be5_b\u00d0\u0011\u0018p'X\u00f0\u00df\u00f8,t(Y\u0097/r\u00bc=l\u0016l\u00bd\u00ebq?\u00f5 f\u00b0\u0013\u008a\u00bf\u0092\u00dc\u00f4\u001a\u001c?p\u00f8\u0015`\u00f3\t\u000e\u00b9\u0092\u001b\u00c9\u008c\b\u00f0B \u0007\u0085\u00b0h\u0093\u0018\u00c2w\u00ae\u00f0\u00f5\u00e5\u00ad\u0010i\u00d1[:\u00af\u00b5\u001aq{\u0086&CG\u00de\u00d9\u00f9".length();
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
                    var9_3[var7_4++] = _gj.g(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00f8Q\u001e\u00b7\u00b7\u0007[\u00c4\u0092*X\u00aa\u009c\u00c0\u00bd9\u00c1\u00a50\u00b00\u00c30 \u0010\u0010mp\u0096*\u0010\u00d7\u00c8\u00ebXY\u00c4\u00e3\u009cG\u0094";
                    var8_6 = "\u00f8Q\u001e\u00b7\u00b7\u0007[\u00c4\u0092*X\u00aa\u009c\u00c0\u00bd9\u00c1\u00a50\u00b00\u00c30 \u0010\u0010mp\u0096*\u0010\u00d7\u00c8\u00ebXY\u00c4\u00e3\u009cG\u0094".length();
                    var5_7 = 24;
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
                    var9_3[var7_4++] = _gj.g(var10_9).intern();
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
        _gj.h = var9_3;
        _gj.y = new String[6];
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String g(byte[] byArray) {
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

    private static String f(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1871;
        if (y[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])z.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    z.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("_gj", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = h[n2].getBytes("ISO-8859-1");
            _gj.y[n2] = _gj.g(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return y[n2];
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _gj.f(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("_gj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_gj.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

