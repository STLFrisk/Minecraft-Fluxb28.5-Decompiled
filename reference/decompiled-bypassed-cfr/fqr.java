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

public class fqr {
    public double lvi;
    public double gn5;
    public double bn2;
    private static final long a = c.a(-5765727035093301882L, -736981646531913518L, MethodHandles.lookup().lookupClass()).a(130307752896372L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public fqr(double d, double d2, double d3) {
        if (d == -0.0) {
            d = 0.0;
        }
        if (d2 == -0.0) {
            d2 = 0.0;
        }
        if (d3 == -0.0) {
            d3 = 0.0;
        }
        this.lvi = d;
        this.gn5 = d2;
        this.bn2 = d3;
    }

    public fqr(wgo wgo2) {
        this(wgo2.getX(), wgo2.getY(), wgo2.getZ());
    }

    public fqr vei(fqr fqr2) {
        return new fqr(fqr2.lvi - this.lvi, fqr2.gn5 - this.gn5, fqr2.bn2 - this.bn2);
    }

    public fqr kec() {
        fqr fqr2;
        double d = fe6.dii(this.lvi * this.lvi + this.gn5 * this.gn5 + this.bn2 * this.bn2);
        try {
            fqr2 = d < 1.0E-4 ? new fqr(0.0, 0.0, 0.0) : new fqr(this.lvi / d, this.gn5 / d, this.bn2 / d);
        }
        catch (oov oov2) {
            throw fqr.a(oov2);
        }
        return fqr2;
    }

    public double xvl(fqr fqr2) {
        return this.lvi * fqr2.lvi + this.gn5 * fqr2.gn5 + this.bn2 * fqr2.bn2;
    }

    public fqr ajp(fqr fqr2) {
        return new fqr(this.gn5 * fqr2.bn2 - this.bn2 * fqr2.gn5, this.bn2 * fqr2.lvi - this.lvi * fqr2.bn2, this.lvi * fqr2.gn5 - this.gn5 * fqr2.lvi);
    }

    public fqr _kk(fqr fqr2) {
        return this.l8u(fqr2.lvi, fqr2.gn5, fqr2.bn2);
    }

    public fqr l8u(double d, double d2, double d3) {
        return this.r2x(-d, -d2, -d3);
    }

    public fqr lle(fqr fqr2) {
        return this.r2x(fqr2.lvi, fqr2.gn5, fqr2.bn2);
    }

    public fqr r2x(double d, double d2, double d3) {
        return new fqr(this.lvi + d, this.gn5 + d2, this.bn2 + d3);
    }

    public double b4d(fqr fqr2) {
        double d = fqr2.lvi - this.lvi;
        double d2 = fqr2.gn5 - this.gn5;
        double d3 = fqr2.bn2 - this.bn2;
        return fe6.dii(d * d + d2 * d2 + d3 * d3);
    }

    public double y8x(fqr fqr2) {
        double d = fqr2.lvi - this.lvi;
        double d2 = fqr2.gn5 - this.gn5;
        double d3 = fqr2.bn2 - this.bn2;
        return d * d + d2 * d2 + d3 * d3;
    }

    public double vtb() {
        return fe6.dii(this.lvi * this.lvi + this.gn5 * this.gn5 + this.bn2 * this.bn2);
    }

    public fqr t0u(fqr fqr2, double d) {
        fqr fqr3;
        block14: {
            block13: {
                double d2;
                double d3;
                double d4;
                double d5;
                double d6;
                block12: {
                    double d7;
                    double d8;
                    int n;
                    block10: {
                        block11: {
                            d6 = fqr2.lvi - this.lvi;
                            d5 = fqr2.gn5 - this.gn5;
                            d4 = fqr2.bn2 - this.bn2;
                            n = t9d.b();
                            try {
                                try {
                                    d8 = d6 * d6;
                                    d7 = 1.0E-7f;
                                    if (n == 0) break block10;
                                    if (!(d8 < d7)) break block11;
                                }
                                catch (oov oov2) {
                                    throw fqr.a(oov2);
                                }
                                return null;
                            }
                            catch (oov oov3) {
                                throw fqr.a(oov3);
                            }
                        }
                        d8 = d - this.lvi;
                        d7 = d6;
                    }
                    d3 = d8 / d7;
                    try {
                        try {
                            double d9 = d3 - 0.0;
                            d2 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                            if (n == 0) break block12;
                            if (d2 < 0) break block13;
                        }
                        catch (oov oov4) {
                            throw fqr.a(oov4);
                        }
                        double d10 = d3 - 1.0;
                        d2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                    }
                    catch (oov oov5) {
                        throw fqr.a(oov5);
                    }
                }
                try {
                    if (d2 > 0) break block13;
                    fqr3 = new fqr(this.lvi + d6 * d3, this.gn5 + d5 * d3, this.bn2 + d4 * d3);
                    break block14;
                }
                catch (oov oov6) {
                    throw fqr.a(oov6);
                }
            }
            fqr3 = null;
        }
        return fqr3;
    }

    public fqr _5q(fqr fqr2, double d) {
        fqr fqr3;
        block14: {
            block13: {
                double d2;
                double d3;
                double d4;
                double d5;
                double d6;
                block12: {
                    double d7;
                    double d8;
                    int n;
                    block10: {
                        block11: {
                            d6 = fqr2.lvi - this.lvi;
                            d5 = fqr2.gn5 - this.gn5;
                            n = t9d.b();
                            d4 = fqr2.bn2 - this.bn2;
                            try {
                                try {
                                    d8 = d5 * d5;
                                    d7 = 1.0E-7f;
                                    if (n == 0) break block10;
                                    if (!(d8 < d7)) break block11;
                                }
                                catch (oov oov2) {
                                    throw fqr.a(oov2);
                                }
                                return null;
                            }
                            catch (oov oov3) {
                                throw fqr.a(oov3);
                            }
                        }
                        d8 = d - this.gn5;
                        d7 = d5;
                    }
                    d3 = d8 / d7;
                    try {
                        try {
                            double d9 = d3 - 0.0;
                            d2 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                            if (n == 0) break block12;
                            if (d2 < 0) break block13;
                        }
                        catch (oov oov4) {
                            throw fqr.a(oov4);
                        }
                        double d10 = d3 - 1.0;
                        d2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                    }
                    catch (oov oov5) {
                        throw fqr.a(oov5);
                    }
                }
                try {
                    if (d2 > 0) break block13;
                    fqr3 = new fqr(this.lvi + d6 * d3, this.gn5 + d5 * d3, this.bn2 + d4 * d3);
                    break block14;
                }
                catch (oov oov6) {
                    throw fqr.a(oov6);
                }
            }
            fqr3 = null;
        }
        return fqr3;
    }

    public fqr p9z(fqr fqr2, double d) {
        fqr fqr3;
        block14: {
            block13: {
                double d2;
                double d3;
                double d4;
                double d5;
                double d6;
                block12: {
                    double d7;
                    double d8;
                    int n;
                    block10: {
                        block11: {
                            d6 = fqr2.lvi - this.lvi;
                            d5 = fqr2.gn5 - this.gn5;
                            d4 = fqr2.bn2 - this.bn2;
                            n = t9d.c();
                            try {
                                try {
                                    d8 = d4 * d4;
                                    d7 = 1.0E-7f;
                                    if (n != 0) break block10;
                                    if (!(d8 < d7)) break block11;
                                }
                                catch (oov oov2) {
                                    throw fqr.a(oov2);
                                }
                                return null;
                            }
                            catch (oov oov3) {
                                throw fqr.a(oov3);
                            }
                        }
                        d8 = d - this.bn2;
                        d7 = d4;
                    }
                    d3 = d8 / d7;
                    try {
                        try {
                            double d9 = d3 - 0.0;
                            d2 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                            if (n != 0) break block12;
                            if (d2 < 0) break block13;
                        }
                        catch (oov oov4) {
                            throw fqr.a(oov4);
                        }
                        double d10 = d3 - 1.0;
                        d2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                    }
                    catch (oov oov5) {
                        throw fqr.a(oov5);
                    }
                }
                try {
                    if (d2 > 0) break block13;
                    fqr3 = new fqr(this.lvi + d6 * d3, this.gn5 + d5 * d3, this.bn2 + d4 * d3);
                    break block14;
                }
                catch (oov oov6) {
                    throw fqr.a(oov6);
                }
            }
            fqr3 = null;
        }
        return fqr3;
    }

    public String toString() {
        long l = a ^ 0x7C9DE6860C45L;
        return "(" + this.lvi + (String)((Object)fqr.a("l", (int)14857, (long)(0xDACDC526AD40D93L ^ l))) + this.gn5 + (String)((Object)fqr.a("l", (int)18523, (long)(0x547154BAB876FFC0L ^ l))) + this.bn2 + ")";
    }

    public fqr mx1(float f) {
        float f2 = fe6.ssk(f);
        float f3 = fe6.rtn(f);
        double d = this.lvi;
        double d2 = this.gn5 * (double)f2 + this.bn2 * (double)f3;
        double d3 = this.bn2 * (double)f2 - this.gn5 * (double)f3;
        return new fqr(d, d2, d3);
    }

    public fqr av2(float f) {
        float f2 = fe6.ssk(f);
        float f3 = fe6.rtn(f);
        double d = this.lvi * (double)f2 + this.bn2 * (double)f3;
        double d2 = this.gn5;
        double d3 = this.bn2 * (double)f2 - this.lvi * (double)f3;
        return new fqr(d, d2, d3);
    }

    public fqr zc9(double d) {
        return new fqr(this.lvi * d, this.gn5 * d, this.bn2 * d);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        d = new HashMap(13);
        long l = a ^ 0x6B7DF09E1DDDL;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u0001\u00b7_\u00f0[\u00aav\"_?\u008d\u00ea\u0001+\u00d4\u00b2\u0010\u00ac\u001f\u00bf9\u001bj\u00e3\u000ez\u00b7A\u00c8\u00day\u000e\u008f";
        int n2 = "\u0001\u00b7_\u00f0[\u00aav\"_?\u008d\u00ea\u0001+\u00d4\u00b2\u0010\u00ac\u001f\u00bf9\u001bj\u00e3\u000ez\u00b7A\u00c8\u00day\u000e\u008f".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = fqr.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5408;
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
                throw new RuntimeException("fqr", exception);
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
            fqr.c[n2] = fqr.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fqr.a(n, l);
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
            throw new RuntimeException("fqr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fqr.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

