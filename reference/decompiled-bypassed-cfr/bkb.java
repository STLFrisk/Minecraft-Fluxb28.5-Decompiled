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

public class bkb
extends ar7 {
    public static c_3 dw0;
    private /* synthetic */ double qz1;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public bkb() {
        long l = a ^ 0x1FA61D37A6F9L;
        super((String)((Object)bkb.b("e", (int)4132, (long)(0x7F30F0CC11970D51L ^ l))), _aj._lm, dw0);
    }

    @jev
    public void _qf(fz2 fz22) {
        block16: {
            block15: {
                bkb bkb2;
                boolean bl;
                block13: {
                    int n;
                    block14: {
                        long l = a ^ 0x6322BA2F08A1L;
                        n = t9d.c();
                        try {
                            try {
                                try {
                                    try {
                                        bl = bkb.ek1.vg8.cbi;
                                        if (n != 0) break block13;
                                        if (!bl) break block14;
                                    }
                                    catch (oov oov2) {
                                        throw bkb.a(oov2);
                                    }
                                    bl = dw0.d7c().equals(bkb.b("e", (int)10136, (long)(0x3BCA94BE4BFA94B0L ^ l)));
                                    if (n != 0) break block13;
                                }
                                catch (oov oov3) {
                                    throw bkb.a(oov3);
                                }
                                if (bl) {
                                }
                                break block14;
                            }
                            catch (oov oov4) {
                                throw bkb.a(oov4);
                            }
                            bkb.ek1.vg8.mop = 0.3f;
                        }
                        catch (oov oov5) {
                            throw bkb.a(oov5);
                        }
                    }
                    try {
                        bkb2 = this;
                        if (n != 0) break block15;
                        bl = bkb.ek1.vg8.lfk;
                    }
                    catch (oov oov6) {
                        throw bkb.a(oov6);
                    }
                }
                try {
                    if (!bl) break block16;
                    bkb2 = this;
                }
                catch (oov oov7) {
                    throw bkb.a(oov7);
                }
            }
            bkb2.qz1 = bkb.ek1.vg8.kfp;
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

                bkb.a = c.a(-1323169956534523174L, -6129213247290787584L, MethodHandles.lookup().lookupClass()).a(140208017635803L);
                var9 = bkb.a ^ 75255891707312L;
                bkb.h = new HashMap<K, V>(13);
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
                var7_3 = new String[5];
                var5_4 = 0;
                var4_5 = "3\u00f7s\u00af\u0095X\u0096\u00c7\u00bfR\u007f\u00bc\u0010\u00b2\t\u00a3\u001071\u00acf\u00a6n\u001dI\u00fb\u00f0&`M8Be\u0010|\u00f2\u00c4Q\u00af#\u00ff9fH6\u009d\u00ade\u009f\u0017";
                var6_6 = "3\u00f7s\u00af\u0095X\u0096\u00c7\u00bfR\u007f\u00bc\u0010\u00b2\t\u00a3\u001071\u00acf\u00a6n\u001dI\u00fb\u00f0&`M8Be\u0010|\u00f2\u00c4Q\u00af#\u00ff9fH6\u009d\u00ade\u009f\u0017".length();
                var3_7 = 16;
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
                    var7_3[var5_4++] = bkb.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "fE\u00c4S\u0007rv\u00e0\u00f1\u008de\u001b<\u0090\u00e0e\u0010\u0011\u00fa\u00ab\u0015\u00c5\u00c6\u008a\u008a\u00c5Q\u009d\u000f\u0089\u00d1\u00bb\u00de";
                    var6_6 = "fE\u00c4S\u0007rv\u00e0\u00f1\u008de\u001b<\u0090\u00e0e\u0010\u0011\u00fa\u00ab\u0015\u00c5\u00c6\u008a\u008a\u00c5Q\u009d\u000f\u0089\u00d1\u00bb\u00de".length();
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
                    var7_3[var5_4++] = bkb.b(var8_9).intern();
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
        bkb.f = var7_3;
        bkb.g = new String[5];
        bkb.dw0 = new c_3((String)bkb.b("e", (int)30893, (long)(3699862161132324496L ^ var9)), (String)bkb.b("e", (int)5204, (long)(3606209440794176106L ^ var9)), (String)bkb.b("e", (int)19184, (long)(348565752778634447L ^ var9)), new String[0]);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x48A3;
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
                throw new RuntimeException("bkb", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            bkb.g[n2] = bkb.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bkb.b(n, l);
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
            throw new RuntimeException("bkb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bkb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

