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
import net.minecraft.tileentity.TileEntityMobSpawner;

public class bmp
extends u7m {
    private static final long a = c.a(-6070412072211667771L, 8377901222597408177L, MethodHandles.lookup().lookupClass()).a(110992568435660L);
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public bmp() {
        this.oml(true);
        this.qfy(uja.kdm);
    }

    @Override
    public String ily(erg erg2) {
        String string;
        block3: {
            String string2;
            block4: {
                long l = a ^ 0x2985AA9E87BCL;
                string2 = ("" + orr.zgh(this.ayn() + (String)((Object)bmp.b("f", (int)2889, (long)(0x1AC31947930DDD78L ^ l))))).trim();
                String string3 = y65.jue(erg2.j6_());
                int n = t9d.b();
                try {
                    string = string3;
                    if (n == 0) break block3;
                    if (string != null) {
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw bmp.a(oov2);
                }
                string2 = string2 + " " + orr.zgh((String)((Object)bmp.b("f", (int)6872, (long)(0xC548B26FB5BCCE8L ^ l))) + string3 + (String)((Object)bmp.b("f", (int)15052, (long)(0x743FEB980F6EECFEL ^ l))));
            }
            string = string2;
        }
        return string;
    }

    @Override
    public int bu9(erg erg2, int n) {
        int n2;
        block7: {
            block6: {
                y65$p2a y65$p2a;
                block8: {
                    int n3 = t9d.c();
                    y65$p2a = (y65$p2a)y65._n6.get(erg2.j6_());
                    try {
                        try {
                            try {
                                if (y65$p2a == null) break block6;
                                n2 = n;
                                if (n3 != 0) break block7;
                            }
                            catch (oov oov2) {
                                throw bmp.a(oov2);
                            }
                            if (n2 != 0) break block8;
                        }
                        catch (oov oov3) {
                            throw bmp.a(oov3);
                        }
                        n2 = y65$p2a.ty_;
                        break block7;
                    }
                    catch (oov oov4) {
                        throw bmp.a(oov4);
                    }
                }
                n2 = y65$p2a.a35;
                break block7;
            }
            n2 = 0xFFFFFF;
        }
        return n2;
    }

    @Override
    public boolean ghw(erg erg2, ha9 ha92, t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3) {
        boolean bl;
        block43: {
            block40: {
                int n;
                block41: {
                    block42: {
                        i2h i2h2;
                        i2h i2h3;
                        block39: {
                            double d;
                            block38: {
                                zfz zfz2;
                                block34: {
                                    block35: {
                                        boolean bl2;
                                        block36: {
                                            block37: {
                                                block33: {
                                                    boolean bl3;
                                                    block32: {
                                                        block30: {
                                                            block31: {
                                                                n = t9d.c();
                                                                try {
                                                                    try {
                                                                        bl3 = t9d2.v0f;
                                                                        if (n != 0) break block30;
                                                                        if (!bl3) break block31;
                                                                    }
                                                                    catch (oov oov2) {
                                                                        throw bmp.a(oov2);
                                                                    }
                                                                    return true;
                                                                }
                                                                catch (oov oov3) {
                                                                    throw bmp.a(oov3);
                                                                }
                                                            }
                                                            bl3 = ha92.dzh(mew2.offset(vt22), vt22, erg2);
                                                        }
                                                        try {
                                                            if (n != 0) break block32;
                                                            if (bl3) break block33;
                                                        }
                                                        catch (oov oov4) {
                                                            throw bmp.a(oov4);
                                                        }
                                                        bl3 = false;
                                                    }
                                                    return bl3;
                                                }
                                                zfz2 = t9d2.getBlockState(mew2);
                                                try {
                                                    if (n != 0) break block34;
                                                    if (zfz2.r_y() != ox_.jvm) break block35;
                                                }
                                                catch (oov oov5) {
                                                    throw bmp.a(oov5);
                                                }
                                                pyk pyk2 = t9d2.getTileEntity(mew2);
                                                try {
                                                    if (n != 0) break block34;
                                                    if (!(pyk2 instanceof TileEntityMobSpawner)) break block35;
                                                }
                                                catch (oov oov6) {
                                                    throw bmp.a(oov6);
                                                }
                                                aih aih2 = ((TileEntityMobSpawner)pyk2).ebe();
                                                try {
                                                    try {
                                                        aih2.ugq(y65.jue(erg2.j6_()));
                                                        pyk2.r5t();
                                                        t9d2.nfo(mew2);
                                                        bl2 = ha92.lls.g40;
                                                        if (n != 0) break block36;
                                                        if (bl2) break block37;
                                                    }
                                                    catch (oov oov7) {
                                                        throw bmp.a(oov7);
                                                    }
                                                    --erg2.qd2;
                                                }
                                                catch (oov oov8) {
                                                    throw bmp.a(oov8);
                                                }
                                            }
                                            bl2 = true;
                                        }
                                        return bl2;
                                    }
                                    mew2 = mew2.offset(vt22);
                                }
                                d = 0.0;
                                try {
                                    if (vt22 != vt2.rf3 || !(zfz2 instanceof dqt)) break block38;
                                }
                                catch (oov oov9) {
                                    throw bmp.a(oov9);
                                }
                                d = 0.5;
                            }
                            i2h3 = bmp.ga6(t9d2, erg2.j6_(), (double)mew2.getX() + 0.5, (double)mew2.getY() + d, (double)mew2.getZ() + 0.5);
                            try {
                                i2h2 = i2h3;
                                if (n != 0) break block39;
                                if (i2h2 == null) break block40;
                            }
                            catch (oov oov10) {
                                throw bmp.a(oov10);
                            }
                            i2h2 = i2h3;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        bl = i2h2 instanceof g_3;
                                        if (n != 0) break block41;
                                        if (!bl) break block42;
                                    }
                                    catch (oov oov11) {
                                        throw bmp.a(oov11);
                                    }
                                    bl = erg2.x4w();
                                    if (n != 0) break block41;
                                }
                                catch (oov oov12) {
                                    throw bmp.a(oov12);
                                }
                                if (!bl) break block42;
                            }
                            catch (oov oov13) {
                                throw bmp.a(oov13);
                            }
                            i2h3.x84(erg2.zow());
                        }
                        catch (oov oov14) {
                            throw bmp.a(oov14);
                        }
                    }
                    bl = ha92.lls.g40;
                }
                try {
                    try {
                        if (n != 0) break block43;
                        if (bl) break block40;
                    }
                    catch (oov oov15) {
                        throw bmp.a(oov15);
                    }
                    --erg2.qd2;
                }
                catch (oov oov16) {
                    throw bmp.a(oov16);
                }
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public erg r__(erg erg2, t9d t9d2, ha9 ha92) {
        block40: {
            ha9 ha93;
            block49: {
                boolean bl;
                block47: {
                    int n;
                    block48: {
                        i2h i2h2;
                        i2h i2h3;
                        block46: {
                            t9d t9d3;
                            mew mew2;
                            block45: {
                                boolean bl2;
                                block43: {
                                    block44: {
                                        block41: {
                                            akm akm2;
                                            block42: {
                                                akm akm3;
                                                block39: {
                                                    block37: {
                                                        block38: {
                                                            n = t9d.c();
                                                            try {
                                                                if (t9d2.v0f) {
                                                                    return erg2;
                                                                }
                                                            }
                                                            catch (oov oov2) {
                                                                throw bmp.a(oov2);
                                                            }
                                                            akm2 = this.tbt(t9d2, ha92, true);
                                                            try {
                                                                try {
                                                                    akm3 = akm2;
                                                                    if (n != 0) break block37;
                                                                    if (akm3 != null) break block38;
                                                                }
                                                                catch (oov oov3) {
                                                                    throw bmp.a(oov3);
                                                                }
                                                                return erg2;
                                                            }
                                                            catch (oov oov4) {
                                                                throw bmp.a(oov4);
                                                            }
                                                        }
                                                        akm3 = akm2;
                                                    }
                                                    try {
                                                        try {
                                                            if (n != 0) break block39;
                                                            if (akm3.oyz != akm$qs6.i4l) break block40;
                                                        }
                                                        catch (oov oov5) {
                                                            throw bmp.a(oov5);
                                                        }
                                                        akm3 = akm2;
                                                    }
                                                    catch (oov oov6) {
                                                        throw bmp.a(oov6);
                                                    }
                                                }
                                                mew2 = akm3._uf();
                                                try {
                                                    try {
                                                        bl2 = t9d2.q2p(ha92, mew2);
                                                        if (n != 0) break block41;
                                                        if (bl2) break block42;
                                                    }
                                                    catch (oov oov7) {
                                                        throw bmp.a(oov7);
                                                    }
                                                    return erg2;
                                                }
                                                catch (oov oov8) {
                                                    throw bmp.a(oov8);
                                                }
                                            }
                                            bl2 = ha92.dzh(mew2, akm2.m_f, erg2);
                                        }
                                        try {
                                            try {
                                                if (n != 0) break block43;
                                                if (bl2) break block44;
                                            }
                                            catch (oov oov9) {
                                                throw bmp.a(oov9);
                                            }
                                            return erg2;
                                        }
                                        catch (oov oov10) {
                                            throw bmp.a(oov10);
                                        }
                                    }
                                    try {
                                        t9d3 = t9d2;
                                        if (n != 0) break block45;
                                        bl2 = t9d3.getBlockState(mew2).r_y() instanceof hmv;
                                    }
                                    catch (oov oov11) {
                                        throw bmp.a(oov11);
                                    }
                                }
                                if (!bl2) break block40;
                                t9d3 = t9d2;
                            }
                            i2h3 = bmp.ga6(t9d3, erg2.j6_(), (double)mew2.getX() + 0.5, (double)mew2.getY() + 0.5, (double)mew2.getZ() + 0.5);
                            try {
                                i2h2 = i2h3;
                                if (n != 0) break block46;
                                if (i2h2 == null) break block40;
                            }
                            catch (oov oov12) {
                                throw bmp.a(oov12);
                            }
                            i2h2 = i2h3;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        bl = i2h2 instanceof g_3;
                                        if (n != 0) break block47;
                                        if (!bl) break block48;
                                    }
                                    catch (oov oov13) {
                                        throw bmp.a(oov13);
                                    }
                                    bl = erg2.x4w();
                                    if (n != 0) break block47;
                                }
                                catch (oov oov14) {
                                    throw bmp.a(oov14);
                                }
                                if (!bl) break block48;
                            }
                            catch (oov oov15) {
                                throw bmp.a(oov15);
                            }
                            ((yqv)i2h3).x84(erg2.zow());
                        }
                        catch (oov oov16) {
                            throw bmp.a(oov16);
                        }
                    }
                    try {
                        ha93 = ha92;
                        if (n != 0) break block49;
                        bl = ha93.lls.g40;
                    }
                    catch (oov oov17) {
                        throw bmp.a(oov17);
                    }
                }
                try {
                    if (!bl) {
                        --erg2.qd2;
                    }
                }
                catch (oov oov18) {
                    throw bmp.a(oov18);
                }
                ha93 = ha92;
            }
            ha93.aex(l9p.foo[u7m._lo(this)]);
        }
        return erg2;
    }

    public static i2h ga6(t9d t9d2, int n, double d, double d2, double d3) {
        i2h i2h2;
        block9: {
            int n2 = t9d.b();
            try {
                if (!y65._n6.containsKey(n)) {
                    return null;
                }
            }
            catch (oov oov2) {
                throw bmp.a(oov2);
            }
            i2h i2h3 = null;
            int n3 = 0;
            while (n3 < 1) {
                block8: {
                    block10: {
                        i2h3 = y65.sh5(n, t9d2);
                        try {
                            try {
                                if (n2 == 0) break block8;
                                i2h2 = i2h3;
                                if (n2 == 0) break block9;
                            }
                            catch (oov oov3) {
                                throw bmp.a(oov3);
                            }
                            if (!(i2h2 instanceof g_3)) break block10;
                        }
                        catch (oov oov4) {
                            throw bmp.a(oov4);
                        }
                        yqv yqv2 = (yqv)i2h3;
                        i2h3.x24(d, d2, d3, fe6.qsy(t9d2.fsy.nextFloat() * 360.0f), 0.0f);
                        yqv2.q6c = yqv2.x5k;
                        yqv2.ksw = yqv2.x5k;
                        yqv2.hx8(t9d2.sms(new mew(yqv2)), null);
                        t9d2.xzq(i2h3);
                        yqv2.zi7();
                    }
                    ++n3;
                }
                if (n2 != 0) continue;
            }
            i2h2 = i2h3;
        }
        return i2h2;
    }

    @Override
    public void jlj(u7m u7m2, uja uja2, List list) {
        int n = t9d.b();
        for (y65$p2a y65$p2a : y65._n6.values()) {
            list.add(new erg(u7m2, 1, y65$p2a.hgl));
            if (n != 0) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        h = new HashMap(13);
        long l = a ^ 0x85BE59AAF29L;
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
        String string = "\u0013\u00e2d\u00da\u00c18A\u0011\u00c0\u009a\u00a83W\u00d1\u00f1v\u0010gu\u00d7\u00abC>\u0099-\u00fcd\u0097\u000e`\u00b1\u00bb\u0093\u0010\u0095N\u0091\u00f1F\u0004X\u0080\u008e\u001dN!ZK>\u00fd";
        int n2 = "\u0013\u00e2d\u00da\u00c18A\u0011\u00c0\u009a\u00a83W\u00d1\u00f1v\u0010gu\u00d7\u00abC>\u0099-\u00fcd\u0097\u000e`\u00b1\u00bb\u0093\u0010\u0095N\u0091\u00f1F\u0004X\u0080\u008e\u001dN!ZK>\u00fd".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = bmp.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                g = new String[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4BB1;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("bmp", exception);
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
            bmp.g[n2] = bmp.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bmp.b(n, l);
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
            throw new RuntimeException("bmp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bmp.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

