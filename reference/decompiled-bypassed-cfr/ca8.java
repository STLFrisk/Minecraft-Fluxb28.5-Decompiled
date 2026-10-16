/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
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
import net.minecraft.tileentity.TileEntitySign;
import net.optifine.CustomColors;
import net.optifine.shaders.Shaders;
import org.lwjgl.opengl.GL11;

public class ca8
extends q9h {
    private static final /* synthetic */ gdz iwg;
    private final /* synthetic */ ttj bvu;
    private static /* synthetic */ double v83;
    private static final long a = c.a(-402353521029401597L, -6387921132051673555L, MethodHandles.lookup().lookupClass()).a(119176146904186L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public ca8() {
        this.bvu = new ttj();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void qg6(TileEntitySign var1_1, double var2_2, double var4_3, double var6_4, float var8_5, int var9_6) {
        block63: {
            block62: {
                block54: {
                    block55: {
                        block56: {
                            block57: {
                                block53: {
                                    block52: {
                                        block64: {
                                            block50: {
                                                block51: {
                                                    block48: {
                                                        block49: {
                                                            block47: {
                                                                block46: {
                                                                    var10_7 = ca8.a ^ 72782398721534L;
                                                                    var12_8 = t9d.c();
                                                                    var13_9 = var1_1.qwl();
                                                                    hzu.dp2();
                                                                    var14_10 = 0.6666667f;
                                                                    try {
                                                                        try {
                                                                            if (var12_8 != 0) break block46;
                                                                            if (var13_9 != ox_.w0z) break block47;
                                                                        }
                                                                        catch (oov v0) {
                                                                            throw ca8.a(v0);
                                                                        }
                                                                        hzu.a4k((float)var2_2 + 0.5f, (float)var4_3 + 0.75f * var14_10, (float)var6_4 + 0.5f);
                                                                    }
                                                                    catch (oov v1) {
                                                                        throw ca8.a(v1);
                                                                    }
                                                                }
                                                                var15_11 = (float)(var1_1.hvh() * 360) / 16.0f;
                                                                hzu.a2h(-var15_11, 0.0f, 1.0f, 0.0f);
                                                                this.bvu.jjx.b16 = true;
                                                                if (var12_8 == 0) break block64;
                                                            }
                                                            var15_12 = var1_1.hvh();
                                                            var16_14 = 0.0f;
                                                            try {
                                                                v2 = var15_12;
                                                                v3 = 2;
                                                                if (var12_8 != 0) break block48;
                                                                if (v2 != v3) break block49;
                                                            }
                                                            catch (oov v4) {
                                                                throw ca8.a(v4);
                                                            }
                                                            var16_14 = 180.0f;
                                                        }
                                                        v2 = var15_12;
                                                        v3 = 4;
                                                    }
                                                    try {
                                                        if (var12_8 != 0) break block50;
                                                        if (v2 != v3) break block51;
                                                    }
                                                    catch (oov v5) {
                                                        throw ca8.a(v5);
                                                    }
                                                    var16_14 = 90.0f;
                                                }
                                                v2 = var15_12;
                                                v3 = 5;
                                            }
                                            if (v2 == v3) {
                                                var16_14 = -90.0f;
                                            }
                                            hzu.a4k((float)var2_2 + 0.5f, (float)var4_3 + 0.75f * var14_10, (float)var6_4 + 0.5f);
                                            hzu.a2h(-var16_14, 0.0f, 1.0f, 0.0f);
                                            hzu.a4k(0.0f, -0.3125f, -0.4375f);
                                            this.bvu.jjx.b16 = false;
                                        }
                                        try {
                                            try {
                                                v6 = var9_6;
                                                if (var12_8 != 0) break block52;
                                                if (v6 >= 0) {
                                                }
                                                ** GOTO lbl89
                                            }
                                            catch (oov v7) {
                                                throw ca8.a(v7);
                                            }
                                            this.g3j(ca8._oj[var9_6]);
                                            hzu.ah8(5890);
                                            hzu.dp2();
                                            hzu.syc(4.0f, 2.0f, 1.0f);
                                            hzu.a4k(0.0625f, 0.0625f, 0.0625f);
                                            v6 = 5888;
                                        }
                                        catch (oov v8) {
                                            throw ca8.a(v8);
                                        }
                                    }
                                    try {
                                        hzu.ah8(v6);
                                        if (var12_8 == 0) break block53;
lbl89:
                                        // 2 sources

                                        this.g3j(ca8.iwg);
                                    }
                                    catch (oov v9) {
                                        throw ca8.a(v9);
                                    }
                                }
                                try {
                                    hzu.ixc();
                                    hzu.dp2();
                                    hzu.syc(var14_10, -var14_10, -var14_10);
                                    this.bvu.s42();
                                    hzu.x3w();
                                    v10 = ca8.zjh(var1_1);
                                    if (var12_8 != 0) break block54;
                                    if (v10 == 0) break block55;
                                }
                                catch (oov v11) {
                                    throw ca8.a(v11);
                                }
                                var15_13 = this.srv();
                                var16_14 = 0.015625f * var14_10;
                                hzu.a4k(0.0f, 0.5f * var14_10, 0.07f * var14_10);
                                hzu.syc(var16_14, -var16_14, var16_14);
                                GL11.glNormal3f((float)0.0f, (float)0.0f, (float)(-1.0f * var16_14));
                                hzu.jun(false);
                                var17_15 = 0;
                                try {
                                    v10 = (int)hxt.xe2();
                                    if (var12_8 != 0) break block56;
                                    if (v10 == 0) break block57;
                                }
                                catch (oov v12) {
                                    throw ca8.a(v12);
                                }
                                var17_15 = CustomColors.getSignTextColor(var17_15);
                            }
                            v10 = var9_6;
                        }
                        try {
                            if (var12_8 != 0) break block54;
                            if (v10 >= 0) break block55;
                        }
                        catch (oov v13) {
                            throw ca8.a(v13);
                        }
                        for (var18_16 = 0; var18_16 < var1_1.lvt.length; ++var18_16) {
                            block65: {
                                block60: {
                                    block61: {
                                        block59: {
                                            block58: {
                                                try {
                                                    try {
                                                        v14 = var1_1.lvt[var18_16];
                                                        if (var12_8 != 0) break block58;
                                                        if (v14 == null) continue;
                                                    }
                                                    catch (oov v15) {
                                                        throw ca8.a(v15);
                                                    }
                                                    v14 = var1_1.lvt[var18_16];
                                                }
                                                catch (oov v16) {
                                                    throw ca8.a(v16);
                                                }
                                            }
                                            var19_17 = v14;
                                            var20_18 = p_i.vtz(var19_17, 90, var15_13, false, true);
                                            try {
                                                v17 /* !! */  = var20_18;
                                                if (var12_8 != 0) break block59;
                                                if (v17 /* !! */  == null) break block60;
                                            }
                                            catch (oov v18) {
                                                throw ca8.a(v18);
                                            }
                                            v17 /* !! */  = var20_18;
                                        }
                                        try {
                                            try {
                                                if (var12_8 != 0) break block61;
                                                if (v17 /* !! */ .size() <= 0) break block60;
                                            }
                                            catch (oov v19) {
                                                throw ca8.a(v19);
                                            }
                                            v17 /* !! */  = var20_18.get(0);
                                        }
                                        catch (oov v20) {
                                            throw ca8.a(v20);
                                        }
                                    }
                                    v21 = ((ekw)v17 /* !! */ )._2o();
                                    break block65;
                                }
                                v21 = "";
                            }
                            var21_19 = v21;
                            try {
                                v22 = var18_16;
                                if (var12_8 != 0) continue;
                                if (v22 == var1_1.mjm) {
                                }
                                ** GOTO lbl191
                            }
                            catch (oov v23) {
                                throw ca8.a(v23);
                            }
                            var21_19 = (String)ca8.a("v", (int)22190, (long)(7605355996155999767L ^ var10_7)) + var21_19 + (String)ca8.a("v", (int)22996, (long)(8143041769278568812L ^ var10_7));
                            try {
                                var15_13.eh6(var21_19, -var15_13.ezt(var21_19) / 2, var18_16 * 10 - var1_1.lvt.length * 5, var17_15);
                                if (var12_8 == 0) continue;
lbl191:
                                // 2 sources

                                v22 = var15_13.eh6(var21_19, -var15_13.ezt(var21_19) / 2, var18_16 * 10 - var1_1.lvt.length * 5, var17_15);
                                continue;
                            }
                            catch (oov v24) {
                                throw ca8.a(v24);
                            }
                        }
                    }
                    hzu.jun(true);
                    hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
                    hzu.x3w();
                    v10 = var9_6;
                }
                try {
                    try {
                        if (var12_8 != 0) break block62;
                        if (v10 < 0) break block63;
                    }
                    catch (oov v25) {
                        throw ca8.a(v25);
                    }
                    hzu.ah8(5890);
                    hzu.x3w();
                    v10 = 5888;
                }
                catch (oov v26) {
                    throw ca8.a(v26);
                }
            }
            hzu.ah8(v10);
        }
    }

    private static boolean zjh(TileEntitySign tileEntitySign) {
        int n;
        block22: {
            block23: {
                int n2;
                block20: {
                    block21: {
                        block18: {
                            block19: {
                                n2 = t9d.c();
                                try {
                                    try {
                                        n = Shaders.isShadowPass;
                                        if (n2 != 0) break block18;
                                        if (n == 0) break block19;
                                    }
                                    catch (oov oov2) {
                                        throw ca8.a(oov2);
                                    }
                                    return false;
                                }
                                catch (oov oov3) {
                                    throw ca8.a(oov3);
                                }
                            }
                            n = hxt.a59().u0y instanceof ptg;
                        }
                        try {
                            try {
                                if (n2 != 0) break block20;
                                if (n == 0) break block21;
                            }
                            catch (oov oov4) {
                                throw ca8.a(oov4);
                            }
                            return true;
                        }
                        catch (oov oov5) {
                            throw ca8.a(oov5);
                        }
                    }
                    n = hxt.shm;
                }
                try {
                    try {
                        try {
                            if (n2 != 0) break block22;
                            if (n != 0) break block23;
                        }
                        catch (oov oov6) {
                            throw ca8.a(oov6);
                        }
                        n = tileEntitySign.mjm;
                        if (n2 != 0) break block22;
                    }
                    catch (oov oov7) {
                        throw ca8.a(oov7);
                    }
                    if (n >= 0) break block23;
                }
                catch (oov oov8) {
                    throw ca8.a(oov8);
                }
                i2h i2h2 = hxt.a59().nsd();
                double d = tileEntitySign.vor(i2h2.o2v, i2h2.kfp, i2h2.vbd);
                try {
                    try {
                        double d2 = d - v83;
                        n = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                        if (n2 != 0) break block22;
                        if (n <= 0) break block23;
                    }
                    catch (oov oov9) {
                        throw ca8.a(oov9);
                    }
                    return false;
                }
                catch (oov oov10) {
                    throw ca8.a(oov10);
                }
            }
            n = 1;
        }
        return n != 0;
    }

    public static void _2n() {
        c05 c052 = hxt.a59();
        double d = hxt.zkb(c052.oxn.bpa, 1.0f, 120.0f);
        double d2 = Math.max(1.5 * (double)c052.ry7 / d, 16.0);
        v83 = d2 * d2;
    }

    @Override
    public void _ny(pyk pyk2, double d, double d2, double d3, float f, int n) {
        this.qg6((TileEntitySign)pyk2, d, d2, d3, f, n);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x78C49501AD6AL;
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
        String string = "\u001a\u0097\u00abD\u00dbS9\u00cap\u00e1\u00a1\f\u0082@e!\u0010\u00e7\u000f\u001b\u00a0\u00fd\u0096\u00aaz\u00955\u00cf\u00b4\u00b9\u009f}\u009c8\u00afwN\u0001\u0088\u00942\u0005\u00ebT\u001d\u0083\u0005{\u00fa\u00c5\u00a9\u009d\u00b7\u00d6\tDuC\u00e3f\u00c6\u00f5\u00b3\u00fd\u00fe\u0087\u00f1\u00f0[\u0015\u0014\u00ab\f\u0093o2e\\\u00d5\u00fa\u009b\u0004zK\t\u00a8\u009f\u00ef\u009a\u00ba";
        int n2 = "\u001a\u0097\u00abD\u00dbS9\u00cap\u00e1\u00a1\f\u0082@e!\u0010\u00e7\u000f\u001b\u00a0\u00fd\u0096\u00aaz\u00955\u00cf\u00b4\u00b9\u009f}\u009c8\u00afwN\u0001\u0088\u00942\u0005\u00ebT\u001d\u0083\u0005{\u00fa\u00c5\u00a9\u009d\u00b7\u00d6\tDuC\u00e3f\u00c6\u00f5\u00b3\u00fd\u00fe\u0087\u00f1\u00f0[\u0015\u0014\u00ab\f\u0093o2e\\\u00d5\u00fa\u009b\u0004zK\t\u00a8\u009f\u00ef\u009a\u00ba".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ca8.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
                iwg = new gdz((String)((Object)ca8.a("v", (int)27213, (long)(0x2892EAC9252B6A62L ^ l))));
                v83 = 4096.0;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4086;
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
                throw new RuntimeException("ca8", exception);
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
            ca8.c[n2] = ca8.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ca8.a(n, l);
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
            throw new RuntimeException("ca8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ca8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

