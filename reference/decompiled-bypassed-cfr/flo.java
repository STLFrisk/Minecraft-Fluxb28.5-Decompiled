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

public class flo
extends i2h {
    public int _u1;
    public int p43;
    public float p7w;
    public float omz;
    public int goc;
    public int bx4;
    public float ysq;
    public float xx_;
    public float aeh;
    public float li4;
    public float v5a;
    public float xof = 1.0f;
    public sla esr;
    public static double mrd;
    public static double txo;
    public static double bta;
    private static final long c;
    private static final String[] d;
    private static final String[] e;
    private static final Map g;

    public flo(t9d t9d2, double d, double d2, double d3) {
        super(t9d2);
        this.yxc(0.2f, 0.2f);
        this.m6_(d, d2, d3);
        this.ivp = this.bc1 = d;
        this.c54 = this.o_z = d2;
        this.e2b = this.a4d = d3;
        this.v5a = 1.0f;
        this.li4 = 1.0f;
        this.aeh = 1.0f;
        this.p7w = this.z2d.nextFloat() * 3.0f;
        this.omz = this.z2d.nextFloat() * 3.0f;
        this.ysq = (this.z2d.nextFloat() * 0.5f + 0.5f) * 2.0f;
        this.bx4 = (int)(4.0f / (this.z2d.nextFloat() * 0.9f + 0.1f));
        this.goc = 0;
    }

    public flo(t9d t9d2, double d, double d2, double d3, double d4, double d5, double d6) {
        this(t9d2, d, d2, d3);
        this.icv = d4 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.mop = d5 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.bw4 = d6 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        float f = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        float f2 = fe6.dii(this.icv * this.icv + this.mop * this.mop + this.bw4 * this.bw4);
        this.icv = this.icv / (double)f2 * (double)f * (double)0.4f;
        this.mop = this.mop / (double)f2 * (double)f * (double)0.4f + (double)0.1f;
        this.bw4 = this.bw4 / (double)f2 * (double)f * (double)0.4f;
    }

    public flo o8j(float f) {
        this.icv *= (double)f;
        this.mop = (this.mop - (double)0.1f) * (double)f + (double)0.1f;
        this.bw4 *= (double)f;
        return this;
    }

    public flo nd9(float f) {
        this.yxc(0.2f * f, 0.2f * f);
        this.ysq *= f;
        return this;
    }

    public void mcd(float f, float f2, float f3) {
        this.aeh = f;
        this.li4 = f2;
        this.v5a = f3;
    }

    public void rc6(float f) {
        block19: {
            flo flo2;
            block18: {
                float f2;
                block16: {
                    int n = t9d.b();
                    try {
                        try {
                            block17: {
                                try {
                                    try {
                                        try {
                                            try {
                                                float f3 = this.xof - 1.0f;
                                                f2 = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                                                if (n == 0) break block16;
                                                if (f2 != false) break block17;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw flo.a(runtimeException);
                                            }
                                            float f4 = f - 1.0f;
                                            f2 = f4 == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1);
                                            if (n == 0) break block16;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw flo.a(runtimeException);
                                        }
                                        if (f2 >= 0) break block17;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw flo.a(runtimeException);
                                    }
                                    c05.vz1().i4p.l7r(this);
                                    if (n != 0) break block18;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw flo.a(runtimeException);
                                }
                            }
                            flo2 = this;
                            if (n == 0) break block19;
                        }
                        catch (RuntimeException runtimeException) {
                            throw flo.a(runtimeException);
                        }
                        float f5 = flo2.xof - 1.0f;
                        f2 = f5 == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
                    }
                    catch (RuntimeException runtimeException) {
                        throw flo.a(runtimeException);
                    }
                }
                try {
                    try {
                        if (f2 >= 0 || f != 1.0f) break block18;
                    }
                    catch (RuntimeException runtimeException) {
                        throw flo.a(runtimeException);
                    }
                    c05.vz1().i4p.lt_(this);
                }
                catch (RuntimeException runtimeException) {
                    throw flo.a(runtimeException);
                }
            }
            flo2 = this;
        }
        flo2.xof = f;
    }

    public float jmh() {
        return this.aeh;
    }

    public float t3o() {
        return this.li4;
    }

    public float gbn() {
        return this.v5a;
    }

    public float h6c() {
        return this.xof;
    }

    @Override
    public boolean _p9() {
        return false;
    }

    @Override
    public void tbj() {
    }

    @Override
    public void xx_() {
        block11: {
            block10: {
                flo flo2;
                int n;
                block8: {
                    int n2;
                    block9: {
                        this.bc1 = this.o2v;
                        this.o_z = this.kfp;
                        n2 = t9d.c();
                        try {
                            try {
                                this.a4d = this.vbd;
                                int n3 = this.goc;
                                n = n3;
                                this.goc = n3 + 1;
                                if (n2 != 0) break block8;
                                if (n < this.bx4) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw flo.a(runtimeException);
                            }
                            this._kl();
                        }
                        catch (RuntimeException runtimeException) {
                            throw flo.a(runtimeException);
                        }
                    }
                    try {
                        this.mop -= 0.04 * (double)this.xx_;
                        this.vjj(this.icv, this.mop, this.bw4);
                        this.icv *= (double)0.98f;
                        this.mop *= (double)0.98f;
                        this.bw4 *= (double)0.98f;
                        flo2 = this;
                        if (n2 != 0) break block10;
                        n = flo2.lfk ? 1 : 0;
                    }
                    catch (RuntimeException runtimeException) {
                        throw flo.a(runtimeException);
                    }
                }
                try {
                    if (n == 0) break block11;
                    this.icv *= (double)0.7f;
                    flo2 = this;
                }
                catch (RuntimeException runtimeException) {
                    throw flo.a(runtimeException);
                }
            }
            flo2.bw4 *= (double)0.7f;
        }
    }

    public void oss(q3g q3g2, i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
        flo flo2;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        block2: {
            block3: {
                f11 = (float)this._u1 / 16.0f;
                f10 = f11 + 0.0624375f;
                f9 = (float)this.p43 / 16.0f;
                int n = t9d.b();
                f8 = f9 + 0.0624375f;
                f7 = 0.1f * this.ysq;
                try {
                    flo2 = this;
                    if (n == 0) break block2;
                    if (flo2.esr == null) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw flo.a(runtimeException);
                }
                f11 = this.esr.l3u();
                f10 = this.esr.w2b();
                f9 = this.esr.bhi();
                f8 = this.esr.e8_();
            }
            flo2 = this;
        }
        float f12 = (float)(flo2.bc1 + (this.o2v - this.bc1) * (double)f - mrd);
        float f13 = (float)(this.o_z + (this.kfp - this.o_z) * (double)f - txo);
        float f14 = (float)(this.a4d + (this.vbd - this.a4d) * (double)f - bta);
        int n = this.azk(f);
        int n2 = n >> 16 & 0xFFFF;
        int n3 = n & 0xFFFF;
        q3g2.g5o(f12 - f2 * f7 - f5 * f7, f13 - f3 * f7, f14 - f4 * f7 - f6 * f7).h0a(f10, f8).gs4(this.aeh, this.li4, this.v5a, this.xof).iu0(n2, n3).pzw();
        q3g2.g5o(f12 - f2 * f7 + f5 * f7, f13 + f3 * f7, f14 - f4 * f7 + f6 * f7).h0a(f10, f9).gs4(this.aeh, this.li4, this.v5a, this.xof).iu0(n2, n3).pzw();
        q3g2.g5o(f12 + f2 * f7 + f5 * f7, f13 + f3 * f7, f14 + f4 * f7 + f6 * f7).h0a(f11, f9).gs4(this.aeh, this.li4, this.v5a, this.xof).iu0(n2, n3).pzw();
        q3g2.g5o(f12 + f2 * f7 - f5 * f7, f13 - f3 * f7, f14 + f4 * f7 - f6 * f7).h0a(f11, f8).gs4(this.aeh, this.li4, this.v5a, this.xof).iu0(n2, n3).pzw();
    }

    public int ikr() {
        return 0;
    }

    @Override
    public void srs(bdo bdo2) {
    }

    @Override
    public void cjb(bdo bdo2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void nsd(sla sla2) {
        int n;
        long l;
        block6: {
            l = c ^ 0x35B2EDC2EF84L;
            n = t9d.b();
            int n2 = this.ikr();
            try {
                try {
                    if (n == 0) break block6;
                    if (n2 != 1) throw new RuntimeException((String)((Object)flo.b("g", (int)9545, (long)(0x4AFF6080396EC8B5L ^ l))));
                }
                catch (RuntimeException runtimeException) {
                    throw flo.a(runtimeException);
                }
                this.esr = sla2;
            }
            catch (RuntimeException runtimeException) {
                throw flo.a(runtimeException);
            }
        }
        try {
            if (n != 0) return;
            throw new RuntimeException((String)((Object)flo.b("g", (int)9545, (long)(0x4AFF6080396EC8B5L ^ l))));
        }
        catch (RuntimeException runtimeException) {
            throw flo.a(runtimeException);
        }
    }

    public void f0l(int n) {
        block5: {
            flo flo2;
            block6: {
                long l = c ^ 0x5F29111927DL;
                int n2 = t9d.c();
                try {
                    try {
                        flo2 = this;
                        if (n2 != 0) break block5;
                        if (flo2.ikr() != 0) {
                        }
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw flo.a(runtimeException);
                    }
                    throw new RuntimeException((String)((Object)flo.b("g", (int)6383, (long)(0x35A8DA5464AF88ECL ^ l))));
                }
                catch (RuntimeException runtimeException) {
                    throw flo.a(runtimeException);
                }
            }
            this._u1 = n % 16;
            flo2 = this;
        }
        flo2.p43 = n / 16;
    }

    public void djm() {
        ++this._u1;
    }

    @Override
    public boolean qvl() {
        return false;
    }

    @Override
    public String toString() {
        long l = c ^ 0x6447C3B449D0L;
        return this.getClass().getSimpleName() + (String)((Object)flo.b("g", (int)25348, (long)(0x7D3C9362EFC6A8AFL ^ l))) + this.o2v + "," + this.kfp + "," + this.vbd + (String)((Object)flo.b("g", (int)11736, (long)(0x58D9FD5ABBD8E671L ^ l))) + this.aeh + "," + this.li4 + "," + this.v5a + "," + this.xof + (String)((Object)flo.b("g", (int)26538, (long)(0x5F1F1997CDFF2C00L ^ l))) + this.goc;
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

                flo.c = c.a(-1066888464524691558L, 9120984924282729236L, MethodHandles.lookup().lookupClass()).a(31834907082751L);
                flo.g = new HashMap<K, V>(13);
                var0 = flo.c ^ 108215094971743L;
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
                var6_5 = "\u00e51\u00b3\u008e\u00fb8\u0004\u00e0\u008f\u00f0\u008e\u00ba\u00a4\u00aa\u00c3\u001d\u0010\u0092\u009f\u00a3'\u00b2\u0012\u0097Z\u00e8\u0085\u00c8u\u00dbv\u00c1dX\u00a3uD\u00b5\"\u00aaZ}\u00d6\u00b3k\u00e8I\u008agd\u00ef\u00fc4\u00c3\u00c0w\u0092\u00eb\u00f9|\u00db\br\u001d\u00e4\u00d8\u00e9\u00c6\u00e0SI\u00a8\u0012cT\"\u00d7\u0086\u009bAT\u00e3Mp\u00b3\u0081&p\u00c4+w\u00b9\u00e1\u00ca\u00b7\u00a7l\u008ei\u001f*\u008a\u00ce@1&|s\u0099\u0098\u0089\u00ca\u001b\u0002\u00bd\u0095\u00d3\\]D\u00c2 ";
                var8_6 = "\u00e51\u00b3\u008e\u00fb8\u0004\u00e0\u008f\u00f0\u008e\u00ba\u00a4\u00aa\u00c3\u001d\u0010\u0092\u009f\u00a3'\u00b2\u0012\u0097Z\u00e8\u0085\u00c8u\u00dbv\u00c1dX\u00a3uD\u00b5\"\u00aaZ}\u00d6\u00b3k\u00e8I\u008agd\u00ef\u00fc4\u00c3\u00c0w\u0092\u00eb\u00f9|\u00db\br\u001d\u00e4\u00d8\u00e9\u00c6\u00e0SI\u00a8\u0012cT\"\u00d7\u0086\u009bAT\u00e3Mp\u00b3\u0081&p\u00c4+w\u00b9\u00e1\u00ca\u00b7\u00a7l\u008ei\u001f*\u008a\u00ce@1&|s\u0099\u0098\u0089\u00ca\u001b\u0002\u00bd\u0095\u00d3\\]D\u00c2 ".length();
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
                    var9_3[var7_4++] = flo.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "i\u00f5\u00fd<\u0081\u00a4T\u00f3\u00ac6\u00a8yL-\u00bdX;\u00d6=\n\u000f\u00ca\u00f7m\u00c9\u00ff5\u0011i\u0095%\u00f9H\u00fb\u00f2f\u00e6e\u00d2\u00a5\u00f5\u00f1t\u00b8\u00b5)#\u0085\u00d2\u00b7c\u00d8\u00e5\u00ff\u00cb\u00e6\u0096q\u009b\u00ab\u00c1\u00a4\u00f3?\u00f892\u00b1\u00a6\u008d)\u008f\u009d\u0014\u00a4}oq\u0089\u0095\u001a\u00f5Nb\u00ca\u00f0(\u008a\u0011\u00b5\u0080\u009f\u0011R\rX\u00f1dl\u00fe\u009c\u001c8\u0003n";
                    var8_6 = "i\u00f5\u00fd<\u0081\u00a4T\u00f3\u00ac6\u00a8yL-\u00bdX;\u00d6=\n\u000f\u00ca\u00f7m\u00c9\u00ff5\u0011i\u0095%\u00f9H\u00fb\u00f2f\u00e6e\u00d2\u00a5\u00f5\u00f1t\u00b8\u00b5)#\u0085\u00d2\u00b7c\u00d8\u00e5\u00ff\u00cb\u00e6\u0096q\u009b\u00ab\u00c1\u00a4\u00f3?\u00f892\u00b1\u00a6\u008d)\u008f\u009d\u0014\u00a4}oq\u0089\u0095\u001a\u00f5Nb\u00ca\u00f0(\u008a\u0011\u00b5\u0080\u009f\u0011R\rX\u00f1dl\u00fe\u009c\u001c8\u0003n".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = flo.b(var10_9).intern();
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
        flo.d = var9_3;
        flo.e = new String[5];
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4B8E;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("flo", exception);
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
            flo.e[n2] = flo.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = flo.b(n, l);
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
            throw new RuntimeException("flo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(flo.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

