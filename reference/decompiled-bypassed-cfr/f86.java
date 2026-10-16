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

public class f86
extends e0x {
    public static final h76 kqk;
    public static final h76 ncy;
    public static final h76 aov;
    public static final h76 z42;
    public static final h76 j5c;
    public static final zb_ fd3;
    private static final long b;
    private static final String[] d;
    private static final String[] h;
    private static final Map i;

    public f86(e0x e0x2) {
        super(e0x2.kgd);
        this.y8l(this._8_.c32().zvi(kqk, Boolean.valueOf(false)).zvi(ncy, Boolean.valueOf(false)).zvi(aov, Boolean.valueOf(false)).zvi(z42, Boolean.valueOf(false)).zvi(j5c, Boolean.valueOf(false)).zvi(fd3, (Comparable)((Object)f86$ou6.am7)));
        this.q6h(e0x2.knk);
        this.dj8(e0x2.iep / 3.0f);
        this.t4k(e0x2.zu6);
        this.i3l(uja.mqu);
    }

    @Override
    public String ieu() {
        long l = b ^ 0x3C550A87553FL;
        return orr.zgh(this.abc() + "." + f86$ou6.am7.tvf() + (String)((Object)f86.b("p", (int)8947, (long)(0x220FA115C7E154CAL ^ l))));
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public boolean iwf(m5n m5n2, mew mew2) {
        return false;
    }

    @Override
    public boolean ko5() {
        return false;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void c7i(m5n var1_1, mew var2_2) {
        block44: {
            block47: {
                block46: {
                    block45: {
                        block43: {
                            block41: {
                                block42: {
                                    block39: {
                                        block40: {
                                            block37: {
                                                block38: {
                                                    block35: {
                                                        block36: {
                                                            var4_3 = this.b5x(var1_1, var2_2.idu());
                                                            var5_4 = this.b5x(var1_1, var2_2.z6x());
                                                            var3_5 = t9d.c();
                                                            var6_6 = this.b5x(var1_1, var2_2.y8e());
                                                            var7_7 = this.b5x(var1_1, var2_2.o_8());
                                                            var8_8 = 0.25f;
                                                            var9_9 = 0.75f;
                                                            var10_10 = 0.25f;
                                                            var11_11 = 0.75f;
                                                            var12_12 = 1.0f;
                                                            try {
                                                                v0 = var4_3;
                                                                if (var3_5 != 0) break block35;
                                                                if (!v0) break block36;
                                                            }
                                                            catch (oov v1) {
                                                                throw f86.a(v1);
                                                            }
                                                            var10_10 = 0.0f;
                                                        }
                                                        v0 = var5_4;
                                                    }
                                                    try {
                                                        if (var3_5 != 0) break block37;
                                                        if (!v0) break block38;
                                                    }
                                                    catch (oov v2) {
                                                        throw f86.a(v2);
                                                    }
                                                    var11_11 = 1.0f;
                                                }
                                                v0 = var6_6;
                                            }
                                            try {
                                                if (var3_5 != 0) break block39;
                                                if (!v0) break block40;
                                            }
                                            catch (oov v3) {
                                                throw f86.a(v3);
                                            }
                                            var8_8 = 0.0f;
                                        }
                                        v0 = var7_7;
                                    }
                                    try {
                                        if (var3_5 != 0) break block41;
                                        if (!v0) break block42;
                                    }
                                    catch (oov v4) {
                                        throw f86.a(v4);
                                    }
                                    var9_9 = 1.0f;
                                }
                                v0 = var4_3;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var3_5 != 0) break block43;
                                                        if (v0) {
                                                        }
                                                        ** GOTO lbl106
                                                    }
                                                    catch (oov v5) {
                                                        throw f86.a(v5);
                                                    }
                                                    v0 = var5_4;
                                                    if (var3_5 != 0) break block43;
                                                }
                                                catch (oov v6) {
                                                    throw f86.a(v6);
                                                }
                                                if (v0) {
                                                }
                                                ** GOTO lbl106
                                            }
                                            catch (oov v7) {
                                                throw f86.a(v7);
                                            }
                                            v0 = var6_6;
                                            if (var3_5 != 0) break block43;
                                        }
                                        catch (oov v8) {
                                            throw f86.a(v8);
                                        }
                                        if (!v0) {
                                        }
                                        ** GOTO lbl106
                                    }
                                    catch (oov v9) {
                                        throw f86.a(v9);
                                    }
                                    v0 = var7_7;
                                    if (var3_5 != 0) break block43;
                                }
                                catch (oov v10) {
                                    throw f86.a(v10);
                                }
                                if (!v0) {
                                }
                                ** GOTO lbl106
                            }
                            catch (oov v11) {
                                throw f86.a(v11);
                            }
                            var12_12 = 0.8125f;
                            var8_8 = 0.3125f;
                            var9_9 = 0.6875f;
                            try {
                                if (var3_5 == 0) break block44;
lbl106:
                                // 5 sources

                                v0 = var4_3;
                            }
                            catch (oov v12) {
                                throw f86.a(v12);
                            }
                        }
                        try {
                            if (var3_5 != 0) break block45;
                            if (v0) break block44;
                        }
                        catch (oov v13) {
                            throw f86.a(v13);
                        }
                        v0 = var5_4;
                    }
                    try {
                        if (var3_5 != 0) break block46;
                        if (v0) break block44;
                    }
                    catch (oov v14) {
                        throw f86.a(v14);
                    }
                    v0 = var6_6;
                }
                try {
                    if (var3_5 != 0) break block47;
                    if (!v0) break block44;
                }
                catch (oov v15) {
                    throw f86.a(v15);
                }
                v0 = var7_7;
            }
            if (v0) {
                var12_12 = 0.8125f;
                var10_10 = 0.3125f;
                var11_11 = 0.6875f;
            }
        }
        this.xl4(var8_8, 0.0f, var10_10, var9_9, var12_12, var11_11);
    }

    @Override
    public nh4 m__(t9d t9d2, mew mew2, zfz zfz2) {
        this.c7i(t9d2, mew2);
        this.lpg = 1.5;
        return super.m__(t9d2, mew2, zfz2);
    }

    public boolean b5x(m5n m5n2, mew mew2) {
        boolean bl;
        block24: {
            block26: {
                block28: {
                    block29: {
                        e0x e0x2;
                        int n;
                        block27: {
                            e0x e0x3;
                            block25: {
                                block22: {
                                    block23: {
                                        n = t9d.b();
                                        e0x2 = m5n2.getBlockState(mew2).r_y();
                                        try {
                                            try {
                                                e0x3 = e0x2;
                                                if (n == 0) break block22;
                                                if (e0x3 != ox_.c28) break block23;
                                            }
                                            catch (oov oov2) {
                                                throw f86.a(oov2);
                                            }
                                            bl = false;
                                            break block24;
                                        }
                                        catch (oov oov3) {
                                            throw f86.a(oov3);
                                        }
                                    }
                                    e0x3 = e0x2;
                                }
                                try {
                                    try {
                                        if (n == 0) break block25;
                                        if (e0x3 == this) break block26;
                                    }
                                    catch (oov oov4) {
                                        throw f86.a(oov4);
                                    }
                                    e0x3 = e0x2;
                                }
                                catch (oov oov5) {
                                    throw f86.a(oov5);
                                }
                            }
                            try {
                                try {
                                    bl = e0x3 instanceof u98;
                                    if (n == 0) break block27;
                                    if (bl) break block26;
                                }
                                catch (oov oov6) {
                                    throw f86.a(oov6);
                                }
                                bl = e0x2.kgd.u4h();
                            }
                            catch (oov oov7) {
                                throw f86.a(oov7);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (n == 0) break block24;
                                            if (!bl) break block28;
                                        }
                                        catch (oov oov8) {
                                            throw f86.a(oov8);
                                        }
                                        bl = e0x2.gck();
                                        if (n == 0) break block24;
                                    }
                                    catch (oov oov9) {
                                        throw f86.a(oov9);
                                    }
                                    if (!bl) break block28;
                                }
                                catch (oov oov10) {
                                    throw f86.a(oov10);
                                }
                                if (e0x2.kgd == p3y.clf) break block29;
                            }
                            catch (oov oov11) {
                                throw f86.a(oov11);
                            }
                            bl = true;
                            break block24;
                        }
                        catch (oov oov12) {
                            throw f86.a(oov12);
                        }
                    }
                    bl = false;
                    break block24;
                }
                bl = false;
                break block24;
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public void m1q(u7m u7m2, uja uja2, List list) {
        f86$ou6[] f86$ou6Array = f86$ou6.values();
        int n = f86$ou6Array.length;
        int n2 = t9d.b();
        for (int i = 0; i < n; ++i) {
            f86$ou6 f86$ou6 = f86$ou6Array[i];
            list.add(new erg(u7m2, 1, f86$ou6.irm()));
            if (n2 != 0) continue;
        }
    }

    @Override
    public int crg(zfz zfz2) {
        return ((f86$ou6)((Object)zfz2.dil(fd3))).irm();
    }

    @Override
    public boolean ron(m5n m5n2, mew mew2, vt2 vt22) {
        boolean bl;
        try {
            bl = vt22 == vt2.m3r ? super.ron(m5n2, mew2, vt22) : true;
        }
        catch (oov oov2) {
            throw f86.a(oov2);
        }
        return bl;
    }

    @Override
    public zfz kig(int n) {
        return this.l4i().zvi(fd3, (Comparable)((Object)f86$ou6.yp3(n)));
    }

    @Override
    public int hvp(zfz zfz2) {
        return ((f86$ou6)((Object)zfz2.dil(fd3))).irm();
    }

    @Override
    public zfz w1b(zfz zfz2, m5n m5n2, mew mew2) {
        boolean bl;
        h76 h762;
        zfz zfz3;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    zfz3 = zfz2;
                    h762 = kqk;
                    bl = m5n2.isAirBlock(mew2.nuv());
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw f86.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return zfz3.zvi(h762, Boolean.valueOf(bl)).zvi(ncy, Boolean.valueOf(this.b5x(m5n2, mew2.idu()))).zvi(aov, Boolean.valueOf(this.b5x(m5n2, mew2.o_8()))).zvi(z42, Boolean.valueOf(this.b5x(m5n2, mew2.z6x()))).zvi(j5c, Boolean.valueOf(this.b5x(m5n2, mew2.y8e())));
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{kqk, ncy, aov, j5c, z42, fd3});
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

                f86.b = c.a(-9214206305656489484L, 8477042849662938051L, MethodHandles.lookup().lookupClass()).a(10242846425683L);
                var9 = f86.b ^ 26991064580172L;
                f86.i = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[7];
                var5_4 = 0;
                var4_5 = "\u00af<\u00b2\u00db\b|H\u001e\u00a6mD\u008d,\u0086V\u00ab\u0010\u0093\u00b2\u0004\u0094\u001e\u00fcqa\u0092\u00b8\u00c2_odX\u00ec\u0010\u00d8 j\bX\u00d8\u0003\u0015'\u00f4\u00af\u0082v\u00e9\u00ff\u009f\u0010\u000f\u009ba\u00c8\u00f8\u00ab\u00e3\u00b8\u00a4\u00e1\u0086\u00b6\\+*i\u0010\u00c6\u0096\u008e\u00dc,\u0084(r(\u00c4v\u001ba\u0017\u00a2\u00fd";
                var6_6 = "\u00af<\u00b2\u00db\b|H\u001e\u00a6mD\u008d,\u0086V\u00ab\u0010\u0093\u00b2\u0004\u0094\u001e\u00fcqa\u0092\u00b8\u00c2_odX\u00ec\u0010\u00d8 j\bX\u00d8\u0003\u0015'\u00f4\u00af\u0082v\u00e9\u00ff\u009f\u0010\u000f\u009ba\u00c8\u00f8\u00ab\u00e3\u00b8\u00a4\u00e1\u0086\u00b6\\+*i\u0010\u00c6\u0096\u008e\u00dc,\u0084(r(\u00c4v\u001ba\u0017\u00a2\u00fd".length();
                var3_7 = 16;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = f86.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00f7\u00ceK\u00c5\u00fepR\u00aa\u00fc\u001d\u00ad\u009a\u009a\u00c0h@\u0010Mr\u00cd#T\u00d5\u0092\u0002\u001eroK\u00b2\u0019\u00b4\u0017";
                    var6_6 = "\u00f7\u00ceK\u00c5\u00fepR\u00aa\u00fc\u001d\u00ad\u009a\u009a\u00c0h@\u0010Mr\u00cd#T\u00d5\u0092\u0002\u001eroK\u00b2\u0019\u00b4\u0017".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = f86.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        f86.d = var7_3;
        f86.h = new String[7];
        f86.kqk = h76.d_1((String)f86.b("p", (int)13738, (long)(1848909022782297825L ^ var9)));
        f86.ncy = h76.d_1((String)f86.b("p", (int)7361, (long)(903600805895094159L ^ var9)));
        f86.aov = h76.d_1((String)f86.b("p", (int)17367, (long)(1613644962605818011L ^ var9)));
        f86.z42 = h76.d_1((String)f86.b("p", (int)14527, (long)(3762117023141927926L ^ var9)));
        f86.j5c = h76.d_1((String)f86.b("p", (int)30366, (long)(1830182163870995923L ^ var9)));
        f86.fd3 = zb_.pq4((String)f86.b("p", (int)29279, (long)(1968543438094323984L ^ var9)), f86$ou6.class);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4D5B;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("f86", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            f86.h[n2] = f86.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = f86.b(n, l);
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
            throw new RuntimeException("f86" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f86.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

