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

public class b41
extends dge {
    private static final long c = c.a(2005020348962509345L, 8586306691971541725L, MethodHandles.lookup().lookupClass()).a(42079867080114L);
    private static final String[] t;
    private static final String[] u;
    private static final Map v;

    public b41(t9d t9d2) {
        super(t9d2);
        this.cuj = true;
    }

    @Override
    public void nyy() {
        super.nyy();
        this.dgt(m6d.w7i).zf7(0.2f);
    }

    @Override
    public boolean iaw() {
        boolean bl;
        try {
            bl = this.oay.rbk() != v66.na2;
        }
        catch (oov oov2) {
            throw b41.a(oov2);
        }
        return bl;
    }

    @Override
    public boolean m63() {
        boolean bl;
        block13: {
            block11: {
                int n;
                block12: {
                    block10: {
                        n = t9d.b();
                        try {
                            try {
                                bl = this.oay.g17(this.aaw(), this);
                                if (n == 0) break block10;
                                if (!bl) break block11;
                            }
                            catch (oov oov2) {
                                throw b41.a(oov2);
                            }
                            bl = this.oay.bb4(this, this.aaw()).isEmpty();
                        }
                        catch (oov oov3) {
                            throw b41.a(oov3);
                        }
                    }
                    try {
                        try {
                            if (n == 0) break block12;
                            if (!bl) break block11;
                        }
                        catch (oov oov4) {
                            throw b41.a(oov4);
                        }
                        bl = this.oay.hhd(this.aaw());
                    }
                    catch (oov oov5) {
                        throw b41.a(oov5);
                    }
                }
                try {
                    if (n == 0) break block13;
                    if (bl) break block11;
                }
                catch (oov oov6) {
                    throw b41.a(oov6);
                }
                bl = true;
                break block13;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public int y5z() {
        return this.qi8() * 3;
    }

    @Override
    public int azk(float f) {
        return 0xF000F0;
    }

    @Override
    public float xeu(float f) {
        return 1.0f;
    }

    @Override
    public w_0 mj4() {
        return w_0.jnp;
    }

    @Override
    public dge yx5() {
        return new b41(this.oay);
    }

    @Override
    public u7m q4n() {
        return xbr.tle;
    }

    @Override
    public void ir3(boolean bl, int n) {
        block9: {
            int n2;
            int n3;
            u7m u7m2;
            int n4;
            block11: {
                int n5;
                block12: {
                    int n6;
                    int n7;
                    block10: {
                        n4 = t9d.b();
                        u7m2 = this.q4n();
                        try {
                            try {
                                try {
                                    if (u7m2 == null) break block9;
                                    n7 = this.qi8();
                                    n6 = 1;
                                    if (n4 == 0) break block10;
                                }
                                catch (oov oov2) {
                                    throw b41.a(oov2);
                                }
                                if (n7 <= n6) break block9;
                            }
                            catch (oov oov3) {
                                throw b41.a(oov3);
                            }
                            n7 = this.z2d.nextInt(4);
                            n6 = 2;
                        }
                        catch (oov oov4) {
                            throw b41.a(oov4);
                        }
                    }
                    n3 = n7 - n6;
                    try {
                        n5 = n;
                        if (n4 == 0) break block11;
                        if (n5 <= 0) break block12;
                    }
                    catch (oov oov5) {
                        throw b41.a(oov5);
                    }
                    n3 += this.z2d.nextInt(n + 1);
                }
                n5 = n2 = 0;
            }
            while (n2 < n3) {
                this.e70(u7m2, 1);
                ++n2;
                if (n4 != 0) continue;
            }
        }
    }

    @Override
    public boolean agj() {
        return false;
    }

    @Override
    public int usz() {
        return super.usz() * 4;
    }

    @Override
    public void mni() {
        this.yzk *= 0.9f;
    }

    @Override
    public void xv1() {
        this.mop = 0.42f + (float)this.qi8() * 0.1f;
        this.u19 = true;
    }

    @Override
    public void q6x() {
        this.mop = 0.22f + (float)this.qi8() * 0.05f;
        this.u19 = true;
    }

    @Override
    public void ibc(float f, float f2) {
    }

    @Override
    public boolean cry() {
        return true;
    }

    @Override
    public int t2j() {
        return super.t2j() + 2;
    }

    @Override
    public String u5x() {
        CallSite callSite;
        block3: {
            long l;
            block2: {
                l = c ^ 0x7184A84436E6L;
                try {
                    if (this.qi8() <= 1) break block2;
                    callSite = b41.e("f", (int)13634, (long)(0x66A37037ADB383FAL ^ l));
                    break block3;
                }
                catch (oov oov2) {
                    throw b41.a(oov2);
                }
            }
            callSite = b41.e("f", (int)31965, (long)(0x1E7422670FA4CA64L ^ l));
        }
        return callSite;
    }

    @Override
    public boolean xak() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        v = new HashMap(13);
        long l = c ^ 0x1EEC766CBE8EL;
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
        String string = "\u00e8\u00f69r\u00dc\u00ceE\u00f7N(\u00d7\u00d8*\t]6\u001b\u0006\u00a1\u00a0!\u00f7T\u00e2T\\\u000b\u00d4.\u00eb\u0098\u0005\u00cd\u0093\u009fv\u0014\u009a\u00b7\u001c(\u0012\n\u007f\u0089!\u00ba||\u001e\u00b2\u00d1l\u00f5\u00ed\u0087\u001c\u00bb\u00ec\u00fb\u00c7\u00f6h\u00e8\u00dae\u009c\u00ba\u00db\u00d9\u00e0\u00a1\u0019RH.\u0089\u00a3\u00a8\u0013\u00c9";
        int n2 = "\u00e8\u00f69r\u00dc\u00ceE\u00f7N(\u00d7\u00d8*\t]6\u001b\u0006\u00a1\u00a0!\u00f7T\u00e2T\\\u000b\u00d4.\u00eb\u0098\u0005\u00cd\u0093\u009fv\u0014\u009a\u00b7\u001c(\u0012\n\u007f\u0089!\u00ba||\u001e\u00b2\u00d1l\u00f5\u00ed\u0087\u001c\u00bb\u00ec\u00fb\u00c7\u00f6h\u00e8\u00dae\u009c\u00ba\u00db\u00d9\u00e0\u00a1\u0019RH.\u0089\u00a3\u00a8\u0013\u00c9".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = b41.e(byArray3).intern();
            if ((n4 += n3) >= n2) {
                t = stringArray;
                u = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String e(byte[] byArray) {
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

    private static String e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4FDD;
        if (u[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])v.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    v.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("b41", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = t[n2].getBytes("ISO-8859-1");
            b41.u[n2] = b41.e(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return u[n2];
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b41.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("b41" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b41.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

