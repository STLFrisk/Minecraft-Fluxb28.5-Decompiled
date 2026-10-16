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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _6b
extends s1e {
    private /* synthetic */ int ouj;
    public long _ud;
    private /* synthetic */ int cf8;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public _6b(t9d t9d2, double d, double d2, double d3) {
        block35: {
            int n;
            int n2;
            mew mew2;
            block41: {
                int n3;
                block40: {
                    mew mew3;
                    t9d t9d3;
                    block39: {
                        block37: {
                            block36: {
                                boolean bl;
                                block34: {
                                    long l = b ^ 0x5D00D7A8DB1FL;
                                    super(t9d2);
                                    this.x24(d, d2, d3, 0.0f, 0.0f);
                                    this.ouj = 2;
                                    this._ud = this.z2d.nextLong();
                                    this.cf8 = this.z2d.nextInt(3) + 1;
                                    mew2 = new mew(this);
                                    n2 = t9d.b();
                                    try {
                                        try {
                                            try {
                                                bl = t9d2.v0f;
                                                if (n2 == 0) break block34;
                                                if (bl) break block35;
                                            }
                                            catch (oov oov2) {
                                                throw _6b.a(oov2);
                                            }
                                            t9d3 = t9d2;
                                            if (n2 == 0) break block36;
                                        }
                                        catch (oov oov3) {
                                            throw _6b.a(oov3);
                                        }
                                        bl = t9d3.eir()._s0((String)((Object)_6b.b("d", (int)28605, (long)(0x773E8B7612BABD57L ^ l))));
                                    }
                                    catch (oov oov4) {
                                        throw _6b.a(oov4);
                                    }
                                }
                                if (!bl) break block35;
                                t9d3 = t9d2;
                            }
                            try {
                                block38: {
                                    try {
                                        try {
                                            try {
                                                if (n2 == 0) break block37;
                                                if (t9d3.rbk() == v66.b_4) break block38;
                                            }
                                            catch (oov oov5) {
                                                throw _6b.a(oov5);
                                            }
                                            t9d3 = t9d2;
                                            if (n2 == 0) break block37;
                                        }
                                        catch (oov oov6) {
                                            throw _6b.a(oov6);
                                        }
                                        if (t9d3.rbk() != v66.csg) break block35;
                                    }
                                    catch (oov oov7) {
                                        throw _6b.a(oov7);
                                    }
                                }
                                t9d3 = t9d2;
                            }
                            catch (oov oov8) {
                                throw _6b.a(oov8);
                            }
                        }
                        try {
                            try {
                                mew3 = mew2;
                                if (n2 == 0) break block39;
                                if (!t9d3.hrj(mew3, 10)) break block35;
                            }
                            catch (oov oov9) {
                                throw _6b.a(oov9);
                            }
                            t9d3 = t9d2;
                            mew3 = mew2;
                        }
                        catch (oov oov10) {
                            throw _6b.a(oov10);
                        }
                    }
                    try {
                        try {
                            try {
                                if (t9d3.getBlockState(mew3).r_y().p1r() != p3y.cei) break block40;
                                n3 = ox_._0u.ctq(t9d2, mew2);
                                if (n2 == 0) break block41;
                            }
                            catch (oov oov11) {
                                throw _6b.a(oov11);
                            }
                            if (n3 == 0) break block40;
                        }
                        catch (oov oov12) {
                            throw _6b.a(oov12);
                        }
                        t9d2.gfy(mew2, ox_._0u.l4i());
                    }
                    catch (oov oov13) {
                        throw _6b.a(oov13);
                    }
                }
                n3 = n = 0;
            }
            while (n < 4) {
                block42: {
                    block43: {
                        mew mew4 = mew2.ec4(this.z2d.nextInt(3) - 1, this.z2d.nextInt(3) - 1, this.z2d.nextInt(3) - 1);
                        try {
                            boolean bl;
                            try {
                                try {
                                    try {
                                        if (n2 == 0) break block42;
                                        if (t9d2.getBlockState(mew4).r_y().p1r() != p3y.cei) break block43;
                                    }
                                    catch (oov oov14) {
                                        throw _6b.a(oov14);
                                    }
                                    bl = ox_._0u.ctq(t9d2, mew4);
                                    if (n2 == 0) break block43;
                                }
                                catch (oov oov15) {
                                    throw _6b.a(oov15);
                                }
                                if (!bl) break block43;
                            }
                            catch (oov oov16) {
                                throw _6b.a(oov16);
                            }
                            bl = t9d2.gfy(mew4, ox_._0u.l4i());
                        }
                        catch (oov oov17) {
                            throw _6b.a(oov17);
                        }
                    }
                    ++n;
                }
                if (n2 != 0) continue;
            }
        }
    }

    @Override
    public void xx_() {
        block55: {
            int n;
            block57: {
                t9d t9d2;
                block56: {
                    int n2;
                    block54: {
                        block49: {
                            _6b _6b2;
                            block53: {
                                block50: {
                                    long l;
                                    block51: {
                                        block47: {
                                            block48: {
                                                l = b ^ 0x25A6C7A5B756L;
                                                n = t9d.c();
                                                try {
                                                    try {
                                                        super.xx_();
                                                        n2 = this.ouj;
                                                        if (n != 0) break block47;
                                                        if (n2 != 2) break block48;
                                                    }
                                                    catch (oov oov2) {
                                                        throw _6b.a(oov2);
                                                    }
                                                    this.oay.amg(this.o2v, this.kfp, this.vbd, (String)((Object)_6b.b("d", (int)13490, (long)(0x2A72E25730988A13L ^ l))), 10000.0f, 0.8f + this.z2d.nextFloat() * 0.2f);
                                                    this.oay.amg(this.o2v, this.kfp, this.vbd, (String)((Object)_6b.b("d", (int)26187, (long)(0x258CFF738763D8E9L ^ l))), 2.0f, 0.5f + this.z2d.nextFloat() * 0.2f);
                                                }
                                                catch (oov oov3) {
                                                    throw _6b.a(oov3);
                                                }
                                            }
                                            n2 = --this.ouj;
                                        }
                                        try {
                                            block52: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (n != 0) break block49;
                                                                if (n2 >= 0) break block50;
                                                            }
                                                            catch (oov oov4) {
                                                                throw _6b.a(oov4);
                                                            }
                                                            n2 = this.cf8;
                                                            if (n != 0) break block51;
                                                        }
                                                        catch (oov oov5) {
                                                            throw _6b.a(oov5);
                                                        }
                                                        if (n2 != 0) break block52;
                                                    }
                                                    catch (oov oov6) {
                                                        throw _6b.a(oov6);
                                                    }
                                                    this._kl();
                                                    if (n == 0) break block50;
                                                }
                                                catch (oov oov7) {
                                                    throw _6b.a(oov7);
                                                }
                                            }
                                            n2 = this.ouj;
                                        }
                                        catch (oov oov8) {
                                            throw _6b.a(oov8);
                                        }
                                    }
                                    try {
                                        if (n != 0) break block49;
                                        if (n2 >= -this.z2d.nextInt(10)) break block50;
                                    }
                                    catch (oov oov9) {
                                        throw _6b.a(oov9);
                                    }
                                    --this.cf8;
                                    this.ouj = 1;
                                    this._ud = this.z2d.nextLong();
                                    mew mew2 = new mew(this);
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
                                                                            n2 = this.oay.v0f ? 1 : 0;
                                                                            if (n != 0) break block49;
                                                                            if (n2 != 0) break block50;
                                                                        }
                                                                        catch (oov oov10) {
                                                                            throw _6b.a(oov10);
                                                                        }
                                                                        n2 = this.oay.eir()._s0((String)((Object)_6b.b("d", (int)27128, (long)(0x644AF78B94745758L ^ l)))) ? 1 : 0;
                                                                        if (n != 0) break block49;
                                                                    }
                                                                    catch (oov oov11) {
                                                                        throw _6b.a(oov11);
                                                                    }
                                                                    if (n2 == 0) break block50;
                                                                }
                                                                catch (oov oov12) {
                                                                    throw _6b.a(oov12);
                                                                }
                                                                n2 = this.oay.hrj(mew2, 10) ? 1 : 0;
                                                                if (n != 0) break block49;
                                                            }
                                                            catch (oov oov13) {
                                                                throw _6b.a(oov13);
                                                            }
                                                            if (n2 == 0) break block50;
                                                        }
                                                        catch (oov oov14) {
                                                            throw _6b.a(oov14);
                                                        }
                                                        _6b2 = this;
                                                        if (n != 0) break block53;
                                                    }
                                                    catch (oov oov15) {
                                                        throw _6b.a(oov15);
                                                    }
                                                    if (_6b2.oay.getBlockState(mew2).r_y().p1r() != p3y.cei) break block50;
                                                }
                                                catch (oov oov16) {
                                                    throw _6b.a(oov16);
                                                }
                                                n2 = ox_._0u.ctq(this.oay, mew2) ? 1 : 0;
                                                if (n != 0) break block49;
                                            }
                                            catch (oov oov17) {
                                                throw _6b.a(oov17);
                                            }
                                            if (n2 == 0) break block50;
                                        }
                                        catch (oov oov18) {
                                            throw _6b.a(oov18);
                                        }
                                        this.oay.gfy(mew2, ox_._0u.l4i());
                                    }
                                    catch (oov oov19) {
                                        throw _6b.a(oov19);
                                    }
                                }
                                _6b2 = this;
                            }
                            n2 = _6b2.ouj;
                        }
                        try {
                            try {
                                try {
                                    if (n != 0) break block54;
                                    if (n2 < 0) break block55;
                                }
                                catch (oov oov20) {
                                    throw _6b.a(oov20);
                                }
                                t9d2 = this.oay;
                                if (n != 0) break block56;
                            }
                            catch (oov oov21) {
                                throw _6b.a(oov21);
                            }
                            n2 = t9d2.v0f ? 1 : 0;
                        }
                        catch (oov oov22) {
                            throw _6b.a(oov22);
                        }
                    }
                    try {
                        if (n2 == 0) break block57;
                        t9d2 = this.oay;
                    }
                    catch (oov oov23) {
                        throw _6b.a(oov23);
                    }
                }
                t9d2.wj6(2);
                if (n == 0) break block55;
            }
            double d = 3.0;
            List list = this.oay.p05(this, new nh4(this.o2v - d, this.kfp - d, this.vbd - d, this.o2v + d, this.kfp + 6.0 + d, this.vbd + d));
            for (int i = 0; i < list.size(); ++i) {
                i2h i2h2 = (i2h)list.get(i);
                i2h2.nzg(this);
                if (n == 0) continue;
            }
        }
    }

    @Override
    public void tbj() {
    }

    @Override
    public void cjb(bdo bdo2) {
    }

    @Override
    public void srs(bdo bdo2) {
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

                _6b.b = c.a(5842754658894085146L, -3135254021302127923L, MethodHandles.lookup().lookupClass()).a(150133361067298L);
                _6b.e = new HashMap<K, V>(13);
                var0 = _6b.b ^ 138430583462299L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u00da!x\u00dd%3\u00f0\u00df[q\u000b}T<\u00fb$M'\u00cciF\u001a\u00c3\u009e\u00b0\u00d9\u0005@\u00e0]\u00e2\u001a\u0098\u00b4TT>>\r\u00cf  A\u0002\u00a6\u00b5\u00b7!\u00df&\u00f6V\u00c6\u00be\u0086\u00f6\u00be\u00d17\u0091J\u00ec\u00bc_\u00d2\u00af\u00b5![>\u0090\u008b\u00e8";
                var8_6 = "\u00da!x\u00dd%3\u00f0\u00df[q\u000b}T<\u00fb$M'\u00cciF\u001a\u00c3\u009e\u00b0\u00d9\u0005@\u00e0]\u00e2\u001a\u0098\u00b4TT>>\r\u00cf  A\u0002\u00a6\u00b5\u00b7!\u00df&\u00f6V\u00c6\u00be\u0086\u00f6\u00be\u00d17\u0091J\u00ec\u00bc_\u00d2\u00af\u00b5![>\u0090\u008b\u00e8".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = _6b.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "e#\u00c7\u0007Q+\u00c1\\\u008a\u00b6=6y\u00ad+'\u0087\u00b2\u008cmN\u0013*_ \u0001x\u0015\u00a2\u00d6\u00b5i;/v\u00e9\u0099\u00d0lbT\u009d\u00a5\u009buPC\u0015\u00a0\u00bb&\u0097\u00bd\u00b4\u0006\u00a0\u0016";
                    var8_6 = "e#\u00c7\u0007Q+\u00c1\\\u008a\u00b6=6y\u00ad+'\u0087\u00b2\u008cmN\u0013*_ \u0001x\u0015\u00a2\u00d6\u00b5i;/v\u00e9\u0099\u00d0lbT\u009d\u00a5\u009buPC\u0015\u00a0\u00bb&\u0097\u00bd\u00b4\u0006\u00a0\u0016".length();
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
                    var9_3[var7_4++] = _6b.b(var10_9).intern();
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
        _6b.c = var9_3;
        _6b.d = new String[4];
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x23E3;
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
                throw new RuntimeException("_6b", exception);
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
            _6b.d[n2] = _6b.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _6b.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("_6b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6b.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

