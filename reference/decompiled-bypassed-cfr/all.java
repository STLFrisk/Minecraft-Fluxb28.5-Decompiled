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
import net.minecraft.tileentity.TileEntityBrewingStand;

public class all
extends rw8 {
    public static final h76[] yky;
    private static final long b;
    private static final String[] d;
    private static final String[] h;
    private static final Map i;

    public all() {
        super(p3y.e21);
        this.y8l(this._8_.c32().zvi(yky[0], Boolean.valueOf(false)).zvi(yky[1], Boolean.valueOf(false)).zvi(yky[2], Boolean.valueOf(false)));
    }

    @Override
    public String ieu() {
        long l = b ^ 0x63B463E3C164L;
        return orr.zgh((String)((Object)all.b("c", (int)21766, (long)(0x329DE22851669437L ^ l))));
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public int kfj() {
        return 3;
    }

    @Override
    public pyk ie9(t9d t9d2, int n) {
        return new TileEntityBrewingStand();
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public void c76(t9d t9d2, mew mew2, zfz zfz2, nh4 nh42, List list, i2h i2h2) {
        this.xl4(0.4375f, 0.0f, 0.4375f, 0.5625f, 0.875f, 0.5625f);
        super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
        this.bf6();
        super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
    }

    @Override
    public void bf6() {
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }

    @Override
    public boolean cl2(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92, vt2 vt22, float f, float f2, float f3) {
        boolean bl;
        block10: {
            block11: {
                t9d t9d3;
                int n;
                block8: {
                    block9: {
                        n = t9d.b();
                        try {
                            try {
                                t9d3 = t9d2;
                                if (n == 0) break block8;
                                if (!t9d3.v0f) break block9;
                            }
                            catch (oov oov2) {
                                throw all.a(oov2);
                            }
                            return true;
                        }
                        catch (oov oov3) {
                            throw all.a(oov3);
                        }
                    }
                    t9d3 = t9d2;
                }
                pyk pyk2 = t9d3.getTileEntity(mew2);
                try {
                    try {
                        bl = pyk2 instanceof TileEntityBrewingStand;
                        if (n == 0) break block10;
                        if (!bl) break block11;
                    }
                    catch (oov oov4) {
                        throw all.a(oov4);
                    }
                    ha92.a_o((TileEntityBrewingStand)pyk2);
                    ha92.aex(l9p.af6);
                }
                catch (oov oov5) {
                    throw all.a(oov5);
                }
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public void qh0(t9d t9d2, mew mew2, zfz zfz2, g_3 g_32, erg erg2) {
        block6: {
            int n = t9d.c();
            if (erg2.x4w()) {
                pyk pyk2;
                block5: {
                    pyk pyk3 = t9d2.getTileEntity(mew2);
                    try {
                        try {
                            pyk2 = pyk3;
                            if (n != 0) break block5;
                            if (!(pyk2 instanceof TileEntityBrewingStand)) break block6;
                        }
                        catch (oov oov2) {
                            throw all.a(oov2);
                        }
                        pyk2 = pyk3;
                    }
                    catch (oov oov3) {
                        throw all.a(oov3);
                    }
                }
                ((TileEntityBrewingStand)pyk2).f9y(erg2.zow());
            }
        }
    }

    @Override
    public void kyo(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        double d = (float)mew2.getX() + 0.4f + random.nextFloat() * 0.2f;
        double d2 = (float)mew2.getY() + 0.7f + random.nextFloat() * 0.3f;
        double d3 = (float)mew2.getZ() + 0.4f + random.nextFloat() * 0.2f;
        t9d2.zvy(w_0.bac, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
    }

    @Override
    public void b8f(t9d t9d2, mew mew2, zfz zfz2) {
        block4: {
            block5: {
                int n = t9d.c();
                pyk pyk2 = t9d2.getTileEntity(mew2);
                try {
                    try {
                        if (n != 0) break block4;
                        if (!(pyk2 instanceof TileEntityBrewingStand)) break block5;
                    }
                    catch (oov oov2) {
                        throw all.a(oov2);
                    }
                    py1.hkj(t9d2, mew2, (TileEntityBrewingStand)pyk2);
                }
                catch (oov oov3) {
                    throw all.a(oov3);
                }
            }
            super.b8f(t9d2, mew2, zfz2);
        }
    }

    @Override
    public u7m j39(zfz zfz2, Random random, int n) {
        return xbr.os1;
    }

    @Override
    public u7m su9(t9d t9d2, mew mew2) {
        return xbr.os1;
    }

    @Override
    public boolean ge5() {
        return true;
    }

    @Override
    public int mya(t9d t9d2, mew mew2) {
        return _jc.nuj(t9d2.getTileEntity(mew2));
    }

    @Override
    public w51 w3x() {
        return w51.gx9;
    }

    @Override
    public zfz kig(int n) {
        zfz zfz2;
        block5: {
            zfz zfz3 = this.l4i();
            int n2 = t9d.b();
            for (int i = 0; i < 3; ++i) {
                boolean bl;
                h76 h762;
                block6: {
                    block7: {
                        try {
                            try {
                                zfz2 = zfz3;
                                if (n2 == 0) break block5;
                                h762 = yky[i];
                                bl = n & 1 << i;
                                if (n2 == 0) break block6;
                            }
                            catch (oov oov2) {
                                throw all.a(oov2);
                            }
                            if (bl <= false) break block7;
                        }
                        catch (oov oov3) {
                            throw all.a(oov3);
                        }
                        bl = true;
                        break block6;
                    }
                    bl = false;
                }
                zfz3 = zfz2.zvi(h762, Boolean.valueOf(bl));
                if (n2 != 0) continue;
            }
            zfz2 = zfz3;
        }
        return zfz2;
    }

    @Override
    public int hvp(zfz zfz2) {
        int n;
        block7: {
            int n2 = 0;
            int n3 = t9d.c();
            for (int i = 0; i < 3; ++i) {
                int n4;
                block8: {
                    try {
                        try {
                            try {
                                n = ((Boolean)zfz2.dil(yky[i])).booleanValue() ? 1 : 0;
                                if (n3 != 0) break block7;
                                if (n3 != 0) break block8;
                            }
                            catch (oov oov2) {
                                throw all.a(oov2);
                            }
                            if (n == 0) continue;
                        }
                        catch (oov oov3) {
                            throw all.a(oov3);
                        }
                        n4 = n2 | 1 << i;
                    }
                    catch (oov oov4) {
                        throw all.a(oov4);
                    }
                }
                n2 = n4;
                if (n3 == 0) continue;
            }
            n = n2;
        }
        return n;
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{yky[0], yky[1], yky[2]});
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

                all.b = c.a(-7542382000566126647L, -6545787873015924383L, MethodHandles.lookup().lookupClass()).a(260837412825816L);
                var9 = all.b ^ 132910836473395L;
                all.i = new HashMap<K, V>(13);
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
                var7_3 = new String[4];
                var5_4 = 0;
                var4_5 = "M2\\\u000fFUt\u001d\u00ae\u00d1/\u00cd\u00cf3\u0081h-\u00e4\u00884\u0099R7\u001e(\u00e0\u001ek9\u0098{;\u0080\u00af]_\u00e5\u00b5}a\u00e0\u000f\u00a4\u00d9\u00d9\u00cd`\u00b2m\u00d8\u00d5b\u00f2\u0081\u001c\u00ca[A\u001c\u0094\u0089,\u00b0\u001f\u0086";
                var6_6 = "M2\\\u000fFUt\u001d\u00ae\u00d1/\u00cd\u00cf3\u0081h-\u00e4\u00884\u0099R7\u001e(\u00e0\u001ek9\u0098{;\u0080\u00af]_\u00e5\u00b5}a\u00e0\u000f\u00a4\u00d9\u00d9\u00cd`\u00b2m\u00d8\u00d5b\u00f2\u0081\u001c\u00ca[A\u001c\u0094\u0089,\u00b0\u001f\u0086".length();
                var3_7 = 24;
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
                    var7_3[var5_4++] = all.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00a7\u00d1\u0085\u00fb\u009d\u00d2'vq\u00e2\u008e\u00ce2\u00ff\"\u0004\u0007\u00a5\u00e3\u00c3\f\u0083i\u00c1\u0018 uoPeM-\u00e7\u00b8\u001f\u0015\u00d0\u00f8\u0017H]\u00d1\u001a\"\u00ca\u0083\u00cd\u0097\u000e";
                    var6_6 = "\u00a7\u00d1\u0085\u00fb\u009d\u00d2'vq\u00e2\u008e\u00ce2\u00ff\"\u0004\u0007\u00a5\u00e3\u00c3\f\u0083i\u00c1\u0018 uoPeM-\u00e7\u00b8\u001f\u0015\u00d0\u00f8\u0017H]\u00d1\u001a\"\u00ca\u0083\u00cd\u0097\u000e".length();
                    var3_7 = 24;
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
                    var7_3[var5_4++] = all.b(var8_9).intern();
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
        all.d = var7_3;
        all.h = new String[4];
        v7 = new h76[3];
        v7[0] = h76.d_1((String)all.b("c", (int)3607, (long)(138665535692263538L ^ var9)));
        v7[1] = h76.d_1((String)all.b("c", (int)23675, (long)(3097737775006679580L ^ var9)));
        v7[2] = h76.d_1((String)all.b("c", (int)19428, (long)(1646612010382529920L ^ var9)));
        all.yky = v7;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7A57;
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
                throw new RuntimeException("all", exception);
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
            all.h[n2] = all.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = all.b(n, l);
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
            throw new RuntimeException("all" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(all.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

