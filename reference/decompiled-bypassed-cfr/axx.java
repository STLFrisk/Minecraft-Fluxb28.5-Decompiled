/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.tileentity.TileEntityBanner$swh;

public class axx
extends q9h {
    private static final Map cgw;
    private static final gdz fhr;
    private kkn x1a = new kkn();
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public void ec9(TileEntityBanner tileEntityBanner, double d, double d2, double d3, float f, int n) {
        block39: {
            block40: {
                float f2;
                long l;
                int n2;
                block41: {
                    int n3;
                    int n4;
                    float f3;
                    block37: {
                        int n5;
                        block38: {
                            block35: {
                                block36: {
                                    block34: {
                                        int n6;
                                        block33: {
                                            long l2;
                                            int n7;
                                            int n8;
                                            int n9;
                                            block31: {
                                                block32: {
                                                    int n10;
                                                    block28: {
                                                        block30: {
                                                            int n11;
                                                            n2 = t9d.c();
                                                            try {
                                                                n11 = tileEntityBanner.yi7() != null ? 1 : 0;
                                                            }
                                                            catch (oov oov2) {
                                                                throw axx.a(oov2);
                                                            }
                                                            n9 = n11;
                                                            try {
                                                                block29: {
                                                                    try {
                                                                        try {
                                                                            n10 = n9;
                                                                            if (n2 != 0) break block28;
                                                                            if (n10 == 0) break block29;
                                                                        }
                                                                        catch (oov oov3) {
                                                                            throw axx.a(oov3);
                                                                        }
                                                                        if (tileEntityBanner.qwl() != ox_.e2n) break block30;
                                                                    }
                                                                    catch (oov oov4) {
                                                                        throw axx.a(oov4);
                                                                    }
                                                                }
                                                                n10 = 1;
                                                                break block28;
                                                            }
                                                            catch (oov oov5) {
                                                                throw axx.a(oov5);
                                                            }
                                                        }
                                                        n10 = 0;
                                                    }
                                                    n8 = n10;
                                                    try {
                                                        try {
                                                            n7 = n9;
                                                            if (n2 != 0) break block31;
                                                            if (n7 == 0) break block32;
                                                        }
                                                        catch (oov oov6) {
                                                            throw axx.a(oov6);
                                                        }
                                                        n7 = tileEntityBanner.hvh();
                                                        break block31;
                                                    }
                                                    catch (oov oov7) {
                                                        throw axx.a(oov7);
                                                    }
                                                }
                                                n7 = 0;
                                            }
                                            n5 = n7;
                                            try {
                                                l2 = n9 != 0 ? tileEntityBanner.yi7().p2b() : 0L;
                                            }
                                            catch (oov oov8) {
                                                throw axx.a(oov8);
                                            }
                                            l = l2;
                                            hzu.dp2();
                                            f2 = 0.6666667f;
                                            try {
                                                try {
                                                    n6 = n8;
                                                    if (n2 != 0) break block33;
                                                    if (n6 == 0) break block34;
                                                }
                                                catch (oov oov9) {
                                                    throw axx.a(oov9);
                                                }
                                                hzu.a4k((float)d + 0.5f, (float)d2 + 0.75f * f2, (float)d3 + 0.5f);
                                                n6 = n5 * 360;
                                            }
                                            catch (oov oov10) {
                                                throw axx.a(oov10);
                                            }
                                        }
                                        f3 = (float)n6 / 16.0f;
                                        hzu.a2h(-f3, 0.0f, 1.0f, 0.0f);
                                        this.x1a._g7.b16 = true;
                                        if (n2 == 0) break block41;
                                    }
                                    f3 = 0.0f;
                                    try {
                                        n4 = n5;
                                        n3 = 2;
                                        if (n2 != 0) break block35;
                                        if (n4 != n3) break block36;
                                    }
                                    catch (oov oov11) {
                                        throw axx.a(oov11);
                                    }
                                    f3 = 180.0f;
                                }
                                n4 = n5;
                                n3 = 4;
                            }
                            try {
                                if (n2 != 0) break block37;
                                if (n4 != n3) break block38;
                            }
                            catch (oov oov12) {
                                throw axx.a(oov12);
                            }
                            f3 = 90.0f;
                        }
                        n4 = n5;
                        n3 = 5;
                    }
                    if (n4 == n3) {
                        f3 = -90.0f;
                    }
                    hzu.a4k((float)d + 0.5f, (float)d2 - 0.25f * f2, (float)d3 + 0.5f);
                    hzu.a2h(-f3, 0.0f, 1.0f, 0.0f);
                    hzu.a4k(0.0f, -0.3125f, -0.4375f);
                    this.x1a._g7.b16 = false;
                }
                mew mew2 = tileEntityBanner.y8_();
                float f4 = (float)(mew2.getX() * 7 + mew2.getY() * 9 + mew2.getZ() * 13) + (float)l + f;
                this.x1a.iz6.pod = (-0.0125f + 0.01f * fe6.ssk(f4 * (float)Math.PI * 0.02f)) * (float)Math.PI;
                hzu.ixc();
                gdz gdz2 = this.we6(tileEntityBanner);
                try {
                    try {
                        if (n2 != 0) break block39;
                        if (gdz2 == null) break block40;
                    }
                    catch (oov oov13) {
                        throw axx.a(oov13);
                    }
                    this.g3j(gdz2);
                    hzu.dp2();
                    hzu.syc(f2, -f2, -f2);
                    this.x1a.xgu();
                    hzu.x3w();
                }
                catch (oov oov14) {
                    throw axx.a(oov14);
                }
            }
            hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
            hzu.x3w();
        }
    }

    private gdz we6(TileEntityBanner tileEntityBanner) {
        axx$_a1 axx$_a1;
        block24: {
            axx$_a1 axx$_a12;
            block25: {
                String string;
                block30: {
                    Object object;
                    int n;
                    long l;
                    block26: {
                        int n2;
                        block28: {
                            String string2;
                            block22: {
                                block23: {
                                    l = a ^ 0x627AABE7DF50L;
                                    n = t9d.b();
                                    string = tileEntityBanner.uq3();
                                    try {
                                        try {
                                            string2 = string;
                                            if (n == 0) break block22;
                                            if (!string2.isEmpty()) break block23;
                                        }
                                        catch (oov oov2) {
                                            throw axx.a(oov2);
                                        }
                                        return null;
                                    }
                                    catch (oov oov3) {
                                        throw axx.a(oov3);
                                    }
                                }
                                string2 = cgw.get(string);
                            }
                            axx$_a12 = (axx$_a1)((Object)string2);
                            try {
                                try {
                                    axx$_a1 = axx$_a12;
                                    if (n == 0) break block24;
                                    if (axx$_a1 != null) break block25;
                                }
                                catch (oov oov4) {
                                    throw axx.a(oov4);
                                }
                                if (cgw.size() < 256) break block26;
                            }
                            catch (oov oov5) {
                                throw axx.a(oov5);
                            }
                            long l2 = System.currentTimeMillis();
                            object = cgw.keySet().iterator();
                            while (object.hasNext()) {
                                block29: {
                                    block27: {
                                        String string3 = (String)object.next();
                                        Object object2 = (axx$_a1)cgw.get(string3);
                                        try {
                                            try {
                                                try {
                                                    if (n == 0) break block27;
                                                    long l3 = l2 - ((axx$_a1)object2).jhw - 60000L;
                                                    n2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                                                    if (n == 0) break block28;
                                                }
                                                catch (oov oov6) {
                                                    throw axx.a(oov6);
                                                }
                                                if (n2 <= 0) break block29;
                                            }
                                            catch (oov oov7) {
                                                throw axx.a(oov7);
                                            }
                                            c05.vz1().l22().cez(((axx$_a1)object2).du_);
                                        }
                                        catch (oov oov8) {
                                            throw axx.a(oov8);
                                        }
                                    }
                                    object.remove();
                                }
                                if (n != 0) continue;
                            }
                            n2 = cgw.size();
                        }
                        try {
                            if (n2 >= 256) {
                                return null;
                            }
                        }
                        catch (oov oov9) {
                            throw axx.a(oov9);
                        }
                    }
                    List list = tileEntityBanner.u88();
                    List list2 = tileEntityBanner.s1t();
                    object = Lists.newArrayList();
                    for (Object object2 : list) {
                        try {
                            object.add((String)((Object)axx.a("y", (int)9650, (long)(0x1D7D0AF983B34835L ^ l))) + ((TileEntityBanner$swh)((Object)object2)).u4i() + (String)((Object)axx.a("y", (int)18435, (long)(0x3417A2EB865A587L ^ l))));
                            if (n != 0) {
                                if (n != 0) continue;
                                break;
                            }
                            break block30;
                        }
                        catch (oov oov10) {
                            throw axx.a(oov10);
                        }
                    }
                    axx$_a12 = new axx$_a1(null);
                    axx$_a12.du_ = new gdz(string);
                    c05.vz1().l22().pc2(axx$_a12.du_, new ia_(fhr, (List)object, list2));
                }
                cgw.put(string, axx$_a12);
            }
            axx$_a12.jhw = System.currentTimeMillis();
            axx$_a1 = axx$_a12;
        }
        return axx$_a1.du_;
    }

    @Override
    public void _ny(pyk pyk2, double d, double d2, double d3, float f, int n) {
        this.ec9((TileEntityBanner)pyk2, d, d2, d3, f, n);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(-6972456213149068508L, 5136396280020000197L, MethodHandles.lookup().lookupClass()).a(196259169658251L);
        long l = a ^ 0x40DEFEBA0470L;
        d = new HashMap(13);
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
        String string = "\u0092\u009a\u00af\u00f0T\u001e\u00acFD\u00f14y\u000f\u00d6Y\u00e81-\nD\u00d4E\u00f1\u00c9%\u00ec\u00b4\u008f\u00c1p\u0013r\u00bct\u0007\u00bb\u00ea\u0002S\u00fc\u00e1\u0099UI\u0006\u008e\u0099/\u00b1$\u001aB\b\u0000\u00bb\u00f3\u0010\u001a\u00e8]\u0092\u00be\u00e2;\u0094\u00a8c\u009a\u009b\u00e5\u00fbS\u00ff(}\u00ed\u0013\u00cbK\u00a6:\u0006\u0094\u00cb\u00d6a\u00eaH!\u0016\u001f\u00a6\u00fa{Ke\u00d9\u00180\f\u0018wo\u001b\u0013\u00fe\u00d0,\u00f0x\u00b7\rR\u00e9";
        int n2 = "\u0092\u009a\u00af\u00f0T\u001e\u00acFD\u00f14y\u000f\u00d6Y\u00e81-\nD\u00d4E\u00f1\u00c9%\u00ec\u00b4\u008f\u00c1p\u0013r\u00bct\u0007\u00bb\u00ea\u0002S\u00fc\u00e1\u0099UI\u0006\u008e\u0099/\u00b1$\u001aB\b\u0000\u00bb\u00f3\u0010\u001a\u00e8]\u0092\u00be\u00e2;\u0094\u00a8c\u009a\u009b\u00e5\u00fbS\u00ff(}\u00ed\u0013\u00cbK\u00a6:\u0006\u0094\u00cb\u00d6a\u00eaH!\u0016\u001f\u00a6\u00fa{Ke\u00d9\u00180\f\u0018wo\u001b\u0013\u00fe\u00d0,\u00f0x\u00b7\rR\u00e9".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = axx.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
                cgw = Maps.newHashMap();
                fhr = new gdz((String)((Object)axx.a("y", (int)27426, (long)(0xC04C7F0214C5D87L ^ l))));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6A04;
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
                throw new RuntimeException("axx", exception);
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
            axx.c[n2] = axx.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = axx.a(n, l);
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
            throw new RuntimeException("axx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(axx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

