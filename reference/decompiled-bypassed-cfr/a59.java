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

public class a59
extends j1s {
    private /* synthetic */ mew e_x;
    private /* synthetic */ mew nhs;
    private /* synthetic */ vt2 eve;
    private /* synthetic */ nhs e40;
    private static final long a = c.a(-659642410375599123L, 7101314832914264119L, MethodHandles.lookup().lookupClass()).a(280651375583810L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public a59() {
        long l = a ^ 0x3030677CB831L;
        super((String)((Object)a59.a("q", (int)22516, (long)(0x641B4C4D3F103D19L ^ l))), (String)((Object)a59.a("q", (int)25749, (long)(0x808D1F3293F8E79L ^ l))));
        this.e_x = null;
        this.nhs = null;
        this.eve = null;
        this.e40 = new nhs();
    }

    @Override
    public void w4v() {
        super.w4v();
    }

    @Override
    public void i__() {
        this.wyl.oxn.e5o.m7n = false;
        super.i__();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @jev
    public void zy8(fz2 fz22) {
        float f;
        fz2 fz23;
        block39: {
            float f2;
            float f3;
            block37: {
                block38: {
                    int n;
                    block34: {
                        block33: {
                            l86 l862;
                            block32: {
                                u7m u7m2;
                                block31: {
                                    erg erg2;
                                    block30: {
                                        this.e_x = null;
                                        this.nhs = null;
                                        n = t9d.c();
                                        try {
                                            try {
                                                erg2 = this.wyl.vg8.b5z();
                                                if (n != 0) break block30;
                                                if (erg2 == null) return;
                                            }
                                            catch (oov oov2) {
                                                throw a59.a(oov2);
                                            }
                                            erg2 = this.wyl.vg8.b5z();
                                        }
                                        catch (oov oov3) {
                                            throw a59.a(oov3);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                u7m2 = erg2.gn1();
                                                if (n != 0) break block31;
                                                if (u7m2 == null) return;
                                            }
                                            catch (oov oov4) {
                                                throw a59.a(oov4);
                                            }
                                            l862 = this.wyl.vg8;
                                            if (n != 0) break block32;
                                        }
                                        catch (oov oov5) {
                                            throw a59.a(oov5);
                                        }
                                        u7m2 = l862.b5z().gn1();
                                    }
                                    catch (oov oov6) {
                                        throw a59.a(oov6);
                                    }
                                }
                                try {
                                    if (!(u7m2 instanceof gun)) {
                                        return;
                                    }
                                }
                                catch (oov oov7) {
                                    throw a59.a(oov7);
                                }
                                l862 = this.wyl.vg8;
                            }
                            l862.fqc(false);
                            mew mew2 = new mew(this.wyl.vg8.o2v, this.wyl.vg8.kfp - 0.01, this.wyl.vg8.vbd);
                            try {
                                try {
                                    if (n != 0) break block33;
                                    if (bk4._82(mew2).p1r() != p3y.cei) break block34;
                                }
                                catch (oov oov8) {
                                    throw a59.a(oov8);
                                }
                                this.e_x = mew2;
                            }
                            catch (oov oov9) {
                                throw a59.a(oov9);
                            }
                        }
                        vt2[] vt2Array = vt2.values();
                        int n2 = vt2Array.length;
                        int n3 = 0;
                        while (n3 < n2) {
                            block35: {
                                vt2 vt22 = vt2Array[n3];
                                mew mew3 = this.e_x.offset(vt22);
                                try {
                                    block36: {
                                        try {
                                            try {
                                                try {
                                                    if (n != 0) return;
                                                    if (n != 0) break block35;
                                                }
                                                catch (oov oov10) {
                                                    throw a59.a(oov10);
                                                }
                                                if (bk4._82(mew3).p1r() == p3y.cei) break block36;
                                            }
                                            catch (oov oov11) {
                                                throw a59.a(oov11);
                                            }
                                            this.eve = vt22;
                                            this.nhs = mew3;
                                            if (n == 0) break;
                                        }
                                        catch (oov oov12) {
                                            throw a59.a(oov12);
                                        }
                                    }
                                    ++n3;
                                }
                                catch (oov oov13) {
                                    throw a59.a(oov13);
                                }
                            }
                            if (n == 0) continue;
                        }
                    }
                    try {
                        try {
                            fz23 = fz22;
                            f3 = this.wyl.vg8.x5k;
                            f2 = 0.0f;
                            if (n != 0) break block37;
                            if (!(f3 > f2)) break block38;
                        }
                        catch (oov oov14) {
                            throw a59.a(oov14);
                        }
                        f = this.wyl.vg8.x5k - 180.0f;
                        break block39;
                    }
                    catch (oov oov15) {
                        throw a59.a(oov15);
                    }
                }
                f3 = this.wyl.vg8.x5k;
                f2 = 180.0f;
            }
            f = f3 + f2;
        }
        fz23.h8j(f);
        fz22.ni7(82.0f);
    }

    @jev
    public void _qm(ccn ccn2) {
        block6: {
            p3y p3y2;
            p3y p3y3;
            block5: {
                mew mew2 = new mew(this.wyl.vg8.o2v + this.wyl.vg8.icv * 2.0, this.wyl.vg8.kfp - 0.01, this.wyl.vg8.vbd + this.wyl.vg8.bw4 * 2.0);
                mew mew3 = new mew(this.wyl.vg8.o2v, this.wyl.vg8.kfp - 0.01, this.wyl.vg8.vbd);
                int n = t9d.b();
                try {
                    try {
                        p3y3 = bk4._82(mew2).p1r();
                        p3y2 = p3y.cei;
                        if (n == 0) break block5;
                        if (p3y3 == p3y2) break block6;
                    }
                    catch (oov oov2) {
                        throw a59.a(oov2);
                    }
                    p3y3 = bk4._82(mew3).p1r();
                    p3y2 = p3y.cei;
                }
                catch (oov oov3) {
                    throw a59.a(oov3);
                }
            }
            if (p3y3 != p3y2) {
                this.wyl.oxn.e5o.m7n = false;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @jev
    public void ei2(_qa var1_1) {
        block14: {
            block12: {
                block13: {
                    var2_2 = t9d.b();
                    try {
                        try {
                            try {
                                try {
                                    var1_1.yu1(true);
                                    if (var2_2 == 0) break block12;
                                    if (this.wyl.vg8.lfk) {
                                    }
                                    ** GOTO lbl30
                                }
                                catch (oov v0) {
                                    throw a59.a(v0);
                                }
                                v1 = this.wyl.vg8.fcv;
                                if (var2_2 == 0) break block13;
                            }
                            catch (oov v2) {
                                throw a59.a(v2);
                            }
                            if (v1) {
                            }
                            ** GOTO lbl30
                        }
                        catch (oov v3) {
                            throw a59.a(v3);
                        }
                        v1 = this.wyl.vg8.g9g.s0a;
                    }
                    catch (oov v4) {
                        throw a59.a(v4);
                    }
                }
                try {
                    if (!v1) break block14;
lbl30:
                    // 3 sources

                    var1_1.c6l = 0.0;
                }
                catch (oov v5) {
                    throw a59.a(v5);
                }
            }
            var1_1.faq = 0.0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @jev
    public void wd3(q8e q8e2) {
        akm akm2;
        akm akm3;
        block16: {
            block17: {
                a59 a592;
                int n;
                block14: {
                    block15: {
                        block13: {
                            mew mew2;
                            block12: {
                                n = t9d.b();
                                try {
                                    try {
                                        try {
                                            mew2 = this.e_x;
                                            if (n == 0) break block12;
                                            if (mew2 == null) return;
                                        }
                                        catch (oov oov2) {
                                            throw a59.a(oov2);
                                        }
                                        a592 = this;
                                        if (n == 0) break block13;
                                    }
                                    catch (oov oov3) {
                                        throw a59.a(oov3);
                                    }
                                    mew2 = a592.nhs;
                                }
                                catch (oov oov4) {
                                    throw a59.a(oov4);
                                }
                            }
                            if (mew2 == null) return;
                            a592 = this;
                        }
                        try {
                            try {
                                if (n == 0) break block14;
                                if (a592.e40.yrv(300.0)) break block15;
                                return;
                            }
                            catch (oov oov5) {
                                throw a59.a(oov5);
                            }
                        }
                        catch (oov oov6) {
                            throw a59.a(oov6);
                        }
                    }
                    a592 = this;
                }
                akm3 = a592.wyl.tij.caq(this.tsl(this.e_x).r2x(0.5, 0.5, 0.5), this.tsl(this.nhs).r2x(0.5, 0.5, 0.5));
                try {
                    akm2 = akm3;
                    if (n == 0) break block16;
                    if (akm2 != null) break block17;
                    return;
                }
                catch (oov oov7) {
                    throw a59.a(oov7);
                }
            }
            akm2 = akm3;
        }
        fqr fqr2 = akm2.jhn;
        this.wyl.vg8.hgb();
        this.wyl.l7q.onPlayerRightClick(this.wyl.vg8, this.wyl.tij, this.wyl.vg8.b5z(), this.nhs, akm3.m_f, fqr2);
        this.e40.zay();
    }

    private fqr tsl(mew mew2) {
        return new fqr(mew2.getX(), mew2.getY(), mew2.getZ());
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        f = new HashMap(13);
        long l = a ^ 0x69DC7680923CL;
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
        String string = "\u000f\u00df6Z%R\u00819\u0001\u00fb\u00e4\u0001jV!\u0089 \u00ba\u00df\u001d&\u00bf\u00d2\u0001\u00f6\u00a6\u00a6\u00fe\u00bba\u009d\u0097\u0011w*XX\u00e2\u009f\u00b3\u00e2[\b\u00ed-\u001b\u00eeB\u00c8";
        int n2 = "\u000f\u00df6Z%R\u00819\u0001\u00fb\u00e4\u0001jV!\u0089 \u00ba\u00df\u001d&\u00bf\u00d2\u0001\u00f6\u00a6\u00a6\u00fe\u00bba\u009d\u0097\u0011w*XX\u00e2\u009f\u00b3\u00e2[\b\u00ed-\u001b\u00eeB\u00c8".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = a59.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x26E0;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("a59", exception);
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
            a59.e[n2] = a59.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = a59.a(n, l);
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
            throw new RuntimeException("a59" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a59.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

