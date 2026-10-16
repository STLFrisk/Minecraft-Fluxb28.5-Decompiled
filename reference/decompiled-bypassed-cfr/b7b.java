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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class b7b
extends izd {
    public static final h76 z1p;
    public static final zb_ qyo;
    private static final long b;
    private static final String[] d;
    private static final String[] h;
    private static final Map i;

    public b7b() {
        zfz zfz2;
        block6: {
            block5: {
                int n;
                block4: {
                    n = t9d.c();
                    super(p3y.zs8);
                    zfz2 = this._8_.c32();
                    try {
                        if (n != 0) break block4;
                        if (!this.t7p()) break block5;
                    }
                    catch (oov oov2) {
                        throw b7b.a(oov2);
                    }
                    zfz2 = zfz2.zvi(z1p, Boolean.valueOf(false));
                }
                if (n == 0) break block6;
            }
            zfz2 = zfz2.zvi(_9x, (Comparable)((Object)izd$jc0.ct4));
        }
        this.y8l(zfz2.zvi(qyo, (Comparable)((Object)b7b$op3.sm3)));
        this.i3l(uja.mqu);
    }

    @Override
    public String ieu() {
        long l = b ^ 0x124AD646BD2BL;
        return orr.zgh(this.abc() + (String)((Object)b7b.b("h", (int)25240, (long)(0xDBB9164B9223F68L ^ l))));
    }

    @Override
    public u7m j39(zfz zfz2, Random random, int n) {
        return u7m.gfm(ox_.ip2);
    }

    @Override
    public u7m su9(t9d t9d2, mew mew2) {
        return u7m.gfm(ox_.ip2);
    }

    @Override
    public String uud(int n) {
        return super.abc() + "." + b7b$op3.wc8(n).usc();
    }

    @Override
    public xny ptp() {
        return qyo;
    }

    @Override
    public Object ulk(erg erg2) {
        return b7b$op3.wc8(erg2.j6_() & 7);
    }

    @Override
    public void m1q(u7m u7m2, uja uja2, List list) {
        int n = t9d.c();
        if (u7m2 != u7m.gfm(ox_.k_0)) {
            for (b7b$op3 b7b$op3 : b7b$op3.values()) {
                list.add(new erg(u7m2, 1, b7b$op3.tn1()));
                if (n == 0) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public zfz kig(int var1_1) {
        block11: {
            block13: {
                block12: {
                    block9: {
                        block10: {
                            var2_2 = t9d.b();
                            var3_3 = this.l4i().zvi(b7b.qyo, (Comparable)b7b$op3.wc8(var1_1 & 7));
                            try {
                                try {
                                    if (this.t7p()) {
                                        v0 = var3_3;
                                        v1 = b7b.z1p;
                                        v2 = var1_1 & 8;
                                        if (var2_2 == 0) break block9;
                                    }
                                    ** GOTO lbl27
                                }
                                catch (oov v3) {
                                    throw b7b.a(v3);
                                }
                                if (!v2) break block10;
                            }
                            catch (oov v4) {
                                throw b7b.a(v4);
                            }
                            v2 = true;
                            break block9;
                        }
                        v2 = false;
                    }
                    var3_3 = v0.zvi(v1, Boolean.valueOf(v2));
                    try {
                        try {
                            if (var2_2 != 0) break block11;
lbl27:
                            // 2 sources

                            v5 = var3_3;
                            v6 = b7b._9x;
                            if ((var1_1 & 8) != 0) break block12;
                        }
                        catch (oov v7) {
                            throw b7b.a(v7);
                        }
                        v8 = izd$jc0.ct4;
                        break block13;
                    }
                    catch (oov v9) {
                        throw b7b.a(v9);
                    }
                }
                v8 = izd$jc0.l7i;
            }
            var3_3 = v5.zvi(v6, (Comparable)v8);
        }
        return var3_3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public int hvp(zfz var1_1) {
        block10: {
            block11: {
                block9: {
                    var3_2 = 0;
                    var3_2 |= ((b7b$op3)var1_1.dil(b7b.qyo)).tn1();
                    var2_3 = t9d.c();
                    try {
                        try {
                            v0 = this.t7p();
                            if (var2_3 != 0) break block9;
                            if (v0 != 0) {
                            }
                            ** GOTO lbl27
                        }
                        catch (oov v1) {
                            throw b7b.a(v1);
                        }
                        v0 = (int)((Boolean)var1_1.dil(b7b.z1p)).booleanValue();
                    }
                    catch (oov v2) {
                        throw b7b.a(v2);
                    }
                }
                try {
                    if (var2_3 != 0) break block10;
                    if (v0 == 0) break block11;
                }
                catch (oov v3) {
                    throw b7b.a(v3);
                }
                var3_2 |= 8;
                try {
                    if (var2_3 == 0) break block11;
lbl27:
                    // 2 sources

                    if (var1_1.dil(b7b._9x) != izd$jc0.l7i) break block11;
                }
                catch (oov v4) {
                    throw b7b.a(v4);
                }
                var3_2 |= 8;
            }
            v0 = var3_2;
        }
        return v0;
    }

    @Override
    public g92 oz5() {
        g92 g922;
        try {
            g922 = this.t7p() ? new g92(this, new xny[]{z1p, qyo}) : new g92(this, new xny[]{_9x, qyo});
        }
        catch (oov oov2) {
            throw b7b.a(oov2);
        }
        return g922;
    }

    @Override
    public _mi uoz(zfz zfz2) {
        return ((b7b$op3)((Object)zfz2.dil(qyo))).lk1();
    }

    @Override
    public int crg(zfz zfz2) {
        return ((b7b$op3)((Object)zfz2.dil(qyo))).tn1();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        b = c.a(4609649948552845519L, -3450676196349035673L, MethodHandles.lookup().lookupClass()).a(158863100263768L);
        long l = b ^ 0x4ADD19307932L;
        i = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u0011&\u0096\u00e6p\u008e\u0000\u00feH\u00c4\u00a8~\u00a7\u00daY\u00c4\u0098\u00caZp\u00a5\u0003}#\u00f1\u00d4\u0086\u00e0\u0006\u00bd\u00e3\u0004\u008d>S\u0003\u0097\u00b0\u001bW \u00a5\u00f4J:QY\u00eb\u0018\u00f3=\u00e3\u00ff\u00bfR\u008b\u00a3W\u0092\u00acZsR+\u0085O\u0088\u00cc\u008e\u0002\u00f4\u00bb\u00fa\u0010m\u00a6\u00d6;\u00b0\u00d3\u0006#QYl\u0002\u00f4w\u000e0";
        int n2 = "\u0011&\u0096\u00e6p\u008e\u0000\u00feH\u00c4\u00a8~\u00a7\u00daY\u00c4\u0098\u00caZp\u00a5\u0003}#\u00f1\u00d4\u0086\u00e0\u0006\u00bd\u00e3\u0004\u008d>S\u0003\u0097\u00b0\u001bW \u00a5\u00f4J:QY\u00eb\u0018\u00f3=\u00e3\u00ff\u00bfR\u008b\u00a3W\u0092\u00acZsR+\u0085O\u0088\u00cc\u008e\u0002\u00f4\u00bb\u00fa\u0010m\u00a6\u00d6;\u00b0\u00d3\u0006#QYl\u0002\u00f4w\u000e0".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = b7b.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                h = new String[3];
                z1p = h76.d_1((String)((Object)b7b.b("h", (int)19081, (long)(0x22FB479E80865361L ^ l))));
                qyo = zb_.pq4((String)((Object)b7b.b("h", (int)16706, (long)(0x7029E6E63CC0D8A9L ^ l))), b7b$op3.class);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String c(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6697;
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
                throw new RuntimeException("b7b", exception);
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
            b7b.h[n2] = b7b.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b7b.b(n, l);
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
            throw new RuntimeException("b7b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b7b.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

