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
import net.minecraft.tileentity.TileEntityBanner;

public class esx
extends rw8 {
    public static final qx_ enk;
    public static final _ku t4h;
    private static final long b;
    private static final String[] d;
    private static final String[] h;
    private static final Map i;

    public esx() {
        super(p3y.fdu);
        float f = 0.25f;
        float f2 = 1.0f;
        this.xl4(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f2, 0.5f + f);
    }

    @Override
    public String ieu() {
        long l = b ^ 0x323BD246F6D6L;
        return orr.zgh((String)((Object)esx.b("c", (int)29578, (long)(0x7C8A3A9449A0C97CL ^ l))));
    }

    @Override
    public nh4 m__(t9d t9d2, mew mew2, zfz zfz2) {
        return null;
    }

    @Override
    public nh4 j54(t9d t9d2, mew mew2) {
        this.c7i(t9d2, mew2);
        return super.j54(t9d2, mew2);
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
    public boolean ko5() {
        return false;
    }

    @Override
    public boolean jdk() {
        return true;
    }

    @Override
    public pyk ie9(t9d t9d2, int n) {
        return new TileEntityBanner();
    }

    @Override
    public u7m j39(zfz zfz2, Random random, int n) {
        return xbr.ogp;
    }

    @Override
    public u7m su9(t9d t9d2, mew mew2) {
        return xbr.ogp;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void ix7(t9d var1_1, mew var2_2, zfz var3_3, float var4_4, int var5_5) {
        block3: {
            var6_6 = esx.b ^ 40796168898169L;
            var8_7 = t9d.b();
            var9_8 = var1_1.getTileEntity(var2_2);
            if (!(var9_8 instanceof TileEntityBanner)) ** GOTO lbl21
            var10_9 = new erg(xbr.ogp, 1, ((TileEntityBanner)var9_8).s29());
            var11_10 = new bdo();
            try {
                var9_8.m2a(var11_10);
                var11_10.bkn("x");
                var11_10.bkn("y");
                var11_10.bkn("z");
                var11_10.bkn((String)esx.b("c", (int)31225, (long)(2358724612261835681L ^ var6_6)));
                var10_9.fvt((String)esx.b("c", (int)15253, (long)(1215117010188513738L ^ var6_6)), var11_10);
                esx.ymu(var1_1, var2_2, var10_9);
                if (var8_7 != 0) break block3;
lbl21:
                // 2 sources

                super.ix7(var1_1, var2_2, var3_3, var4_4, var5_5);
            }
            catch (oov v0) {
                throw esx.a(v0);
            }
        }
    }

    @Override
    public boolean ctq(t9d t9d2, mew mew2) {
        boolean bl;
        block8: {
            block7: {
                int n;
                block6: {
                    n = t9d.b();
                    try {
                        try {
                            bl = this.vpo(t9d2, mew2);
                            if (n == 0) break block6;
                            if (bl) break block7;
                        }
                        catch (oov oov2) {
                            throw esx.a(oov2);
                        }
                        bl = super.ctq(t9d2, mew2);
                    }
                    catch (oov oov3) {
                        throw esx.a(oov3);
                    }
                }
                try {
                    if (n == 0) break block8;
                    if (!bl) break block7;
                }
                catch (oov oov4) {
                    throw esx.a(oov4);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void i4u(t9d var1_1, ha9 var2_2, mew var3_3, zfz var4_4, pyk var5_5) {
        block9: {
            block8: {
                var6_6 = esx.b ^ 137839249243129L;
                var8_7 = t9d.c();
                try {
                    try {
                        v0 = var5_5;
                        if (var8_7 != 0) break block8;
                        if (v0 instanceof TileEntityBanner) {
                        }
                        ** GOTO lbl26
                    }
                    catch (oov v1) {
                        throw esx.a(v1);
                    }
                    v0 = var5_5;
                }
                catch (oov v2) {
                    throw esx.a(v2);
                }
            }
            var9_8 = (TileEntityBanner)v0;
            var10_9 = new erg(xbr.ogp, 1, ((TileEntityBanner)var5_5).s29());
            var11_10 = new bdo();
            try {
                TileEntityBanner.ds4(var11_10, var9_8.s29(), var9_8.jj8());
                var10_9.fvt((String)esx.b("c", (int)23117, (long)(7840597011088584080L ^ var6_6)), var11_10);
                esx.ymu(var1_1, var3_3, var10_9);
                if (var8_7 == 0) break block9;
lbl26:
                // 2 sources

                super.i4u(var1_1, var2_2, var3_3, var4_4, null);
            }
            catch (oov v3) {
                throw esx.a(v3);
            }
        }
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

                esx.b = c.a(-8251209693072799741L, -868990705531815589L, MethodHandles.lookup().lookupClass()).a(264998511244096L);
                var9 = esx.b ^ 67041445099246L;
                esx.i = new HashMap<K, V>(13);
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
                var7_3 = new String[6];
                var5_4 = 0;
                var4_5 = "P\u00b1\u0093\u00f8\u0017n6\u0005H\t\u001a\u00f4{\u00be\u00d8.\u00cah\u00b5?\u0017[\u00de\u008bmt\u0093\u008d\u0017\u00e1\u0090\u008f\u0018\u008f}[=\u00beu\u00da\u0018\u00b3\u00cf\u00da\u00dd\u00f2\u00d7\u0092oC\u00dap\u00c7IJoS\u0010\u00bd\u0083\u00bf\u00eb4\u00e41uc\u0010\u007f@yud\u00ea \u00d0\u00e5\u001c\u00f4QP\u00de\u00c8r\u008ar_^\n\u00c9\u008c\u009b\u0095+\u00dc\u00f4xKs\u00e5\u0004\u00eciS\u0096\u00b2p";
                var6_6 = "P\u00b1\u0093\u00f8\u0017n6\u0005H\t\u001a\u00f4{\u00be\u00d8.\u00cah\u00b5?\u0017[\u00de\u008bmt\u0093\u008d\u0017\u00e1\u0090\u008f\u0018\u008f}[=\u00beu\u00da\u0018\u00b3\u00cf\u00da\u00dd\u00f2\u00d7\u0092oC\u00dap\u00c7IJoS\u0010\u00bd\u0083\u00bf\u00eb4\u00e41uc\u0010\u007f@yud\u00ea \u00d0\u00e5\u001c\u00f4QP\u00de\u00c8r\u008ar_^\n\u00c9\u008c\u009b\u0095+\u00dc\u00f4xKs\u00e5\u0004\u00eciS\u0096\u00b2p".length();
                var3_7 = 32;
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
                    var7_3[var5_4++] = esx.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "Mj\u0099?(\u009a\u001b\u0089#\u00e8C\u00c3\u0003-FI(\u00ec-\u00b6\fi\u00f1K\u00d8\u008a\u00b8W\u00d9\u0016\u00edf\u009f\u001b\u00d2\u00c8k\u00b1\u00b3\u001b\u00f8C\u00f9`'Xb\u00ad\u00d2\u00f8=\u00c9\u00c9\u00cbg\u00e2v";
                    var6_6 = "Mj\u0099?(\u009a\u001b\u0089#\u00e8C\u00c3\u0003-FI(\u00ec-\u00b6\fi\u00f1K\u00d8\u008a\u00b8W\u00d9\u0016\u00edf\u009f\u001b\u00d2\u00c8k\u00b1\u00b3\u001b\u00f8C\u00f9`'Xb\u00ad\u00d2\u00f8=\u00c9\u00c9\u00cbg\u00e2v".length();
                    var3_7 = 16;
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
                    var7_3[var5_4++] = esx.b(var8_9).intern();
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
        esx.d = var7_3;
        esx.h = new String[6];
        esx.enk = qx_.q0o((String)esx.b("c", (int)20939, (long)(1848216401376946946L ^ var9)), vt2$unz.fzl);
        esx.t4h = _ku.wgl((String)esx.b("c", (int)13864, (long)(7555376718839467235L ^ var9)), 0, 15);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x194;
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
                throw new RuntimeException("esx", exception);
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
            esx.h[n2] = esx.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = esx.b(n, l);
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
            throw new RuntimeException("esx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(esx.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

