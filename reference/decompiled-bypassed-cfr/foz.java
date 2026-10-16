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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class foz
extends e0x {
    private static final long b = c.a(-4387273556251424784L, 1642059412348221343L, MethodHandles.lookup().lookupClass()).a(112020750000636L);
    private static final String[] d;
    private static final String[] h;
    private static final Map i;

    public foz(p3y p3y2) {
        this(p3y2, p3y2.up9());
    }

    public foz(p3y p3y2, _mi _mi2) {
        super(p3y2, _mi2);
        this.i3l(uja.yj_);
        this._p_(true);
    }

    @Override
    public void c7i(m5n m5n2, mew mew2) {
        this.zos(m5n2.getBlockState(mew2));
    }

    /*
     * Unable to fully structure code
     */
    public void zos(zfz var1_1) {
        block13: {
            block12: {
                block10: {
                    block11: {
                        var2_2 = t9d.c();
                        try {
                            v0 = this.eqv(var1_1);
                            if (var2_2 != 0) break block10;
                            if (v0 <= 0) break block11;
                        }
                        catch (oov v1) {
                            throw foz.a(v1);
                        }
                        v0 = 1;
                        break block10;
                    }
                    v0 = 0;
                }
                var3_3 = v0;
                var4_4 = 0.0625f;
                try {
                    try {
                        if (var2_2 != 0) break block12;
                        if (var3_3 != 0) {
                        }
                        ** GOTO lbl37
                    }
                    catch (oov v2) {
                        throw foz.a(v2);
                    }
                    this.xl4(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.03125f, 0.9375f);
                }
                catch (oov v3) {
                    throw foz.a(v3);
                }
            }
            try {
                if (var2_2 == 0) break block13;
lbl37:
                // 2 sources

                this.xl4(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.0625f, 0.9375f);
            }
            catch (oov v4) {
                throw foz.a(v4);
            }
        }
    }

    @Override
    public int odp(t9d t9d2) {
        return 20;
    }

    @Override
    public nh4 m__(t9d t9d2, mew mew2, zfz zfz2) {
        return null;
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public boolean iwf(m5n m5n2, mew mew2) {
        return true;
    }

    @Override
    public boolean jdk() {
        return true;
    }

    @Override
    public boolean ctq(t9d t9d2, mew mew2) {
        return this.rti(t9d2, mew2.eve());
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        block4: {
            int n = t9d.b();
            try {
                boolean bl;
                try {
                    bl = this.rti(t9d2, mew2.eve());
                    if (n == 0 || bl) break block4;
                }
                catch (oov oov2) {
                    throw foz.a(oov2);
                }
                this.lf0(t9d2, mew2, zfz2, 0);
                bl = t9d2.i6x(mew2);
            }
            catch (oov oov3) {
                throw foz.a(oov3);
            }
        }
    }

    private boolean rti(t9d t9d2, mew mew2) {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    int n = t9d.b();
                    try {
                        try {
                            try {
                                bl = t9d.r3_(t9d2, mew2);
                                if (n == 0) break block6;
                                if (bl) break block7;
                            }
                            catch (oov oov2) {
                                throw foz.a(oov2);
                            }
                            bl = t9d2.getBlockState(mew2).r_y() instanceof dqt;
                            if (n == 0) break block6;
                        }
                        catch (oov oov3) {
                            throw foz.a(oov3);
                        }
                        if (!bl) break block8;
                    }
                    catch (oov oov4) {
                        throw foz.a(oov4);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void ff3(t9d t9d2, mew mew2, zfz zfz2, Random random) {
    }

    @Override
    public void zvy(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        block8: {
            int n;
            block7: {
                int n2 = t9d.b();
                try {
                    try {
                        n = t9d2.v0f;
                        if (n2 == 0) break block7;
                        if (n != 0) break block8;
                    }
                    catch (oov oov2) {
                        throw foz.a(oov2);
                    }
                    n = this.eqv(zfz2);
                }
                catch (oov oov3) {
                    throw foz.a(oov3);
                }
            }
            int n3 = n;
            try {
                if (n3 > 0) {
                    this.wvz(t9d2, mew2, zfz2, n3);
                }
            }
            catch (oov oov4) {
                throw foz.a(oov4);
            }
        }
    }

    @Override
    public void n9e(t9d t9d2, mew mew2, zfz zfz2, i2h i2h2) {
        block8: {
            int n;
            block7: {
                int n2 = t9d.b();
                try {
                    try {
                        n = t9d2.v0f;
                        if (n2 == 0) break block7;
                        if (n != 0) break block8;
                    }
                    catch (oov oov2) {
                        throw foz.a(oov2);
                    }
                    n = this.eqv(zfz2);
                }
                catch (oov oov3) {
                    throw foz.a(oov3);
                }
            }
            int n3 = n;
            try {
                if (n3 == 0) {
                    this.wvz(t9d2, mew2, zfz2, n3);
                }
            }
            catch (oov oov4) {
                throw foz.a(oov4);
            }
        }
    }

    public void wvz(t9d t9d2, mew mew2, zfz zfz2, int n) {
        int n2;
        block36: {
            int n3;
            block35: {
                int n4;
                int n5;
                long l;
                block33: {
                    block31: {
                        block32: {
                            int n6;
                            int n7;
                            block29: {
                                block30: {
                                    int n8;
                                    block27: {
                                        block28: {
                                            l = b ^ 0x1AE75E2632FL;
                                            n5 = t9d.b();
                                            n7 = this.af7(t9d2, mew2);
                                            try {
                                                n8 = n;
                                                if (n5 == 0) break block27;
                                                if (n8 <= 0) break block28;
                                            }
                                            catch (oov oov2) {
                                                throw foz.a(oov2);
                                            }
                                            n8 = 1;
                                            break block27;
                                        }
                                        n8 = 0;
                                    }
                                    n4 = n8;
                                    try {
                                        n6 = n7;
                                        if (n5 == 0) break block29;
                                        if (n6 <= 0) break block30;
                                    }
                                    catch (oov oov3) {
                                        throw foz.a(oov3);
                                    }
                                    n6 = 1;
                                    break block29;
                                }
                                n6 = 0;
                            }
                            n3 = n6;
                            try {
                                n2 = n;
                                if (n5 == 0) break block31;
                                if (n2 == n7) break block32;
                            }
                            catch (oov oov4) {
                                throw foz.a(oov4);
                            }
                            zfz2 = this.u0_(zfz2, n7);
                            t9d2.vct(mew2, zfz2, 2);
                            this.clo(t9d2, mew2);
                            t9d2.bi9(mew2, mew2);
                        }
                        n2 = n3;
                    }
                    try {
                        block34: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (n5 == 0) break block33;
                                            if (n2 != 0) break block34;
                                        }
                                        catch (oov oov5) {
                                            throw foz.a(oov5);
                                        }
                                        n2 = n4;
                                        if (n5 == 0) break block33;
                                    }
                                    catch (oov oov6) {
                                        throw foz.a(oov6);
                                    }
                                    if (n2 == 0) break block34;
                                }
                                catch (oov oov7) {
                                    throw foz.a(oov7);
                                }
                                t9d2.amg((double)mew2.getX() + 0.5, (double)mew2.getY() + 0.1, (double)mew2.getZ() + 0.5, (String)((Object)foz.b("u", (int)19570, (long)(0x3CB25D5E03D8FFFBL ^ l))), 0.3f, 0.5f);
                                if (n5 != 0) break block35;
                            }
                            catch (oov oov8) {
                                throw foz.a(oov8);
                            }
                        }
                        n2 = n3;
                    }
                    catch (oov oov9) {
                        throw foz.a(oov9);
                    }
                }
                try {
                    try {
                        try {
                            try {
                                if (n5 == 0) break block36;
                                if (n2 == 0) break block35;
                            }
                            catch (oov oov10) {
                                throw foz.a(oov10);
                            }
                            n2 = n4;
                            if (n5 == 0) break block36;
                        }
                        catch (oov oov11) {
                            throw foz.a(oov11);
                        }
                        if (n2 != 0) break block35;
                    }
                    catch (oov oov12) {
                        throw foz.a(oov12);
                    }
                    t9d2.amg((double)mew2.getX() + 0.5, (double)mew2.getY() + 0.1, (double)mew2.getZ() + 0.5, (String)((Object)foz.b("u", (int)28767, (long)(0x6EDC4FA051F7C3D7L ^ l))), 0.3f, 0.6f);
                }
                catch (oov oov13) {
                    throw foz.a(oov13);
                }
            }
            n2 = n3;
        }
        try {
            if (n2 != 0) {
                t9d2.cjk(mew2, this, this.odp(t9d2));
            }
        }
        catch (oov oov14) {
            throw foz.a(oov14);
        }
    }

    public nh4 ae9(mew mew2) {
        float f = 0.125f;
        return new nh4((float)mew2.getX() + 0.125f, mew2.getY(), (float)mew2.getZ() + 0.125f, (float)(mew2.getX() + 1) - 0.125f, (double)mew2.getY() + 0.25, (float)(mew2.getZ() + 1) - 0.125f);
    }

    @Override
    public void b8f(t9d t9d2, mew mew2, zfz zfz2) {
        foz foz2;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        foz2 = this;
                        if (n == 0) break block4;
                        if (foz2.eqv(zfz2) <= 0) break block5;
                    }
                    catch (oov oov2) {
                        throw foz.a(oov2);
                    }
                    this.clo(t9d2, mew2);
                }
                catch (oov oov3) {
                    throw foz.a(oov3);
                }
            }
            foz2 = this;
        }
        super.b8f(t9d2, mew2, zfz2);
    }

    public void clo(t9d t9d2, mew mew2) {
        t9d2._0o(mew2, this);
        t9d2._0o(mew2.eve(), this);
    }

    @Override
    public int gpi(m5n m5n2, mew mew2, zfz zfz2, vt2 vt22) {
        return this.eqv(zfz2);
    }

    @Override
    public int sqt(m5n m5n2, mew mew2, zfz zfz2, vt2 vt22) {
        int n;
        try {
            n = vt22 == vt2.rf3 ? this.eqv(zfz2) : 0;
        }
        catch (oov oov2) {
            throw foz.a(oov2);
        }
        return n;
    }

    @Override
    public boolean scl() {
        return true;
    }

    @Override
    public void bf6() {
        float f = 0.5f;
        float f2 = 0.125f;
        float f3 = 0.5f;
        this.xl4(0.0f, 0.375f, 0.0f, 1.0f, 0.625f, 1.0f);
    }

    @Override
    public int quv() {
        return 1;
    }

    public abstract int af7(t9d var1, mew var2);

    public abstract int eqv(zfz var1);

    public abstract zfz u0_(zfz var1, int var2);

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        i = new HashMap(13);
        long l = b ^ 0x79CF0904C3C8L;
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
        String string = "\u001c\u0005u\u00be'\u00eb\u00f1\u00f1\u00faN\u00cea\u0017&\u0095\u000b\u00f5\r\u0001\u00dbKG\u00b8E\u0095\u00c3\u00fd4\u0081\u00e1<x \u00ab\t\u00bcq\u000fL\u009c2]\u00e5\u00c1\u00ef\u00e7\u0081\u00aa>!\u00f2\u00a2\u00d9\u00b0\u008189,\u0082\u00e1\u00f8\u00e44\u00d4\b";
        int n2 = "\u001c\u0005u\u00be'\u00eb\u00f1\u00f1\u00faN\u00cea\u0017&\u0095\u000b\u00f5\r\u0001\u00dbKG\u00b8E\u0095\u00c3\u00fd4\u0081\u00e1<x \u00ab\t\u00bcq\u000fL\u009c2]\u00e5\u00c1\u00ef\u00e7\u0081\u00aa>!\u00f2\u00a2\u00d9\u00b0\u008189,\u0082\u00e1\u00f8\u00e44\u00d4\b".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = foz.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                h = new String[2];
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x16C8;
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
                throw new RuntimeException("foz", exception);
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
            foz.h[n2] = foz.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = foz.b(n, l);
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
            throw new RuntimeException("foz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(foz.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

