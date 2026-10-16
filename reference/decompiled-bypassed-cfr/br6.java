/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
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
import org.lwjgl.input.Mouse;

public class br6 {
    public float azm;
    public float h87;
    public float zas;
    public float jgs;
    public boolean gbw;
    public fkf$m01 u9d;
    public String pnw;
    public String nc_;
    public float zv5;
    public float hlm;
    public boolean fkl;
    public boolean gr6;
    public c05 hsv;
    private static final long a = c.a(-6628904636691383082L, 2727472073330332909L, MethodHandles.lookup().lookupClass()).a(106102639477466L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public br6(String string, String string2, float f, float f2, boolean bl) {
        block5: {
            br6 br62;
            block4: {
                this.azm = 0.0f;
                this.h87 = 0.0f;
                this.gbw = false;
                this.u9d = new fkf$m01(0);
                int n = t9d.b();
                try {
                    try {
                        this.fkl = false;
                        this.gr6 = false;
                        this.hsv = c05.vz1();
                        this.pnw = string;
                        this.nc_ = string2;
                        this.zv5 = f;
                        br62 = this;
                        if (n == 0) break block4;
                        br62.hlm = f2;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw br6.a(oov2);
                    }
                    br62 = this;
                }
                catch (oov oov3) {
                    throw br6.a(oov3);
                }
            }
            br62.p1b();
        }
    }

    public void rqr(int n, int n2) {
        int n3;
        long l;
        block4: {
            block5: {
                l = a ^ 0x3E03E00344EBL;
                this.gf6(n, n2);
                int n4 = t9d.c();
                mkt.o8m(this.azm, this.h87, this.zv5, this.hlm, 2.0f, -10719102, 0.1f, 0);
                mkt.o8m(this.azm, this.h87, this.zv5, 15.0f, 2.0f, -10636054, 0.1f, 0);
                int n5 = n4;
                hhf.cuu(this.azm, this.h87 + 13.0f, this.azm + this.zv5, this.h87 + 16.0f, -10636054);
                jsr.rfr.fzf(this.pnw, this.azm + 5.0f, this.h87 + 2.0f, z7e.a2_.k0y);
                float f = jsr.rfr.ax2(this.nc_);
                try {
                    try {
                        jsr.rfr.fzf(this.nc_, this.azm + this.zv5 / 2.0f - f / 2.0f, this.h87 + this.hlm / 2.0f - 7.0f, z7e.a2_.k0y);
                        n3 = hhf.md3(n, n2, this.azm + this.zv5 / 2.0f - this.zv5 / 4.0f, this.h87 + this.hlm - 18.0f, this.azm + this.zv5 / 2.0f + this.zv5 / 4.0f, this.h87 + this.hlm - 3.0f);
                        if (n5 != 0) break block4;
                        if (n3 == 0) break block5;
                    }
                    catch (oov oov2) {
                        throw br6.a(oov2);
                    }
                    n3 = -10636054;
                    break block4;
                }
                catch (oov oov3) {
                    throw br6.a(oov3);
                }
            }
            n3 = -12231829;
        }
        int n6 = n3;
        mkt.o8m(this.azm + this.zv5 / 2.0f - this.zv5 / 4.0f, this.h87 + this.hlm - 18.0f, this.zv5 / 2.0f, 15.0f, 2.0f, n6, 0.1f, n6);
        jsr.rfr.fzf((String)((Object)br6.a("s", (int)11631, (long)(0x704FDF8683000F28L ^ l))), this.azm + this.zv5 / 2.0f - jsr.rfr.ax2((String)((Object)br6.a("s", (int)10201, (long)(0x23AEBC2FCF44059FL ^ l)))) / 2.0f, this.h87 + this.hlm - 16.0f, z7e.a2_.k0y);
    }

    public void nml(int n, int n2, int n3) {
        block6: {
            int n4;
            block5: {
                int n5 = t9d.c();
                try {
                    n4 = hhf.md3(n, n2, this.azm + this.zv5 / 2.0f - this.zv5 / 4.0f, this.h87 + this.hlm - 18.0f, this.azm + this.zv5 / 2.0f + this.zv5 / 4.0f, this.h87 + this.hlm - 3.0f);
                    if (n5 != 0) break block5;
                    if (n4 == 0) break block6;
                }
                catch (oov oov2) {
                    throw br6.a(oov2);
                }
                n4 = n3;
            }
            try {
                if (n4 == 0) {
                    this.gr6 = true;
                }
            }
            catch (oov oov3) {
                throw br6.a(oov3);
            }
        }
    }

    public void gf6(int n, int n2) {
        block25: {
            block24: {
                br6 br62;
                boolean bl;
                block22: {
                    int n3;
                    block23: {
                        block20: {
                            block21: {
                                n3 = t9d.b();
                                try {
                                    try {
                                        try {
                                            try {
                                                bl = Mouse.isButtonDown((int)0);
                                                if (n3 == 0) break block20;
                                                if (bl) break block21;
                                            }
                                            catch (oov oov2) {
                                                throw br6.a(oov2);
                                            }
                                            bl = this.gbw;
                                            if (n3 == 0) break block20;
                                        }
                                        catch (oov oov3) {
                                            throw br6.a(oov3);
                                        }
                                        if (!bl) break block21;
                                    }
                                    catch (oov oov4) {
                                        throw br6.a(oov4);
                                    }
                                    this.gbw = false;
                                }
                                catch (oov oov5) {
                                    throw br6.a(oov5);
                                }
                            }
                            bl = hhf.md3(n, n2, this.azm, this.h87, this.azm + this.zv5, this.h87 + 16.0f);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (n3 == 0) break block22;
                                        if (!bl) break block23;
                                    }
                                    catch (oov oov6) {
                                        throw br6.a(oov6);
                                    }
                                    bl = this.u9d.mxf();
                                    if (n3 == 0) break block22;
                                }
                                catch (oov oov7) {
                                    throw br6.a(oov7);
                                }
                                if (!bl) break block23;
                            }
                            catch (oov oov8) {
                                throw br6.a(oov8);
                            }
                            this.gbw = true;
                            this.zas = (float)n - this.azm;
                            this.jgs = (float)n2 - this.h87;
                        }
                        catch (oov oov9) {
                            throw br6.a(oov9);
                        }
                    }
                    try {
                        br62 = this;
                        if (n3 == 0) break block24;
                        bl = br62.gbw;
                    }
                    catch (oov oov10) {
                        throw br6.a(oov10);
                    }
                }
                try {
                    if (!bl) break block25;
                    this.azm = (float)n - this.zas;
                    br62 = this;
                }
                catch (oov oov11) {
                    throw br6.a(oov11);
                }
            }
            br62.h87 = (float)n2 - this.jgs;
        }
    }

    public void p1b() {
        eka eka2 = new eka(this.hsv);
        this.azm = (float)eka2.x05() / 2.0f - this.zv5 / 2.0f;
        this.h87 = (float)eka2.lrx() / 2.0f - this.hlm / 2.0f;
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
        long l = a ^ 0x252ADA0298DAL;
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
        String string = "\u00faP\u0005\u009f\u00f5!\u0081\u00f3}NW\u00cd\u00ad\u00d2\u008a\u00bf\u0010\r\u00e7n\u00a3\u0081\u00fd\u0090A\u009f\b7\u0000o\u00b9x\u00ad";
        int n2 = "\u00faP\u0005\u009f\u00f5!\u0081\u00f3}NW\u00cd\u00ad\u00d2\u008a\u00bf\u0010\r\u00e7n\u00a3\u0081\u00fd\u0090A\u009f\b7\u0000o\u00b9x\u00ad".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = br6.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xB7;
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
                throw new RuntimeException("br6", exception);
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
            br6.c[n2] = br6.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = br6.a(n, l);
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
            throw new RuntimeException("br6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(br6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

