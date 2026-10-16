/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class djl {
    private static /* synthetic */ IntBuffer g8u;
    private static /* synthetic */ int[] wns;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public static ekw k10(File file, String string, int n, int n2, oru oru2) {
        File file2;
        long l;
        block30: {
            int n3;
            block28: {
                int n4;
                int n5;
                int n6;
                block26: {
                    block27: {
                        IntBuffer intBuffer;
                        int n7;
                        block24: {
                            int n8;
                            block22: {
                                block23: {
                                    block20: {
                                        block21: {
                                            l = a ^ 0x920BD43BE3CL;
                                            n6 = t9d.c();
                                            file2 = new File(c05.vz1().glh, (String)((Object)djl.a("m", (int)18077, (long)(0x3D55B3D9FBDD9913L ^ l))));
                                            try {
                                                try {
                                                    n8 = file2.exists();
                                                    if (n6 != 0) break block20;
                                                    if (n8 != 0) break block21;
                                                }
                                                catch (oov oov2) {
                                                    throw djl.a(oov2);
                                                }
                                                file2.mkdir();
                                            }
                                            catch (oov oov3) {
                                                throw djl.a(oov3);
                                            }
                                        }
                                        n8 = gis.gu5();
                                    }
                                    try {
                                        if (n6 != 0) break block22;
                                        if (n8 == 0) break block23;
                                    }
                                    catch (oov oov4) {
                                        throw djl.a(oov4);
                                    }
                                    n = oru2.ntc;
                                    n2 = oru2.f86;
                                }
                                n8 = n * n2;
                            }
                            n7 = n8;
                            try {
                                block25: {
                                    try {
                                        try {
                                            try {
                                                intBuffer = g8u;
                                                if (n6 != 0) break block24;
                                                if (intBuffer == null) break block25;
                                            }
                                            catch (oov oov5) {
                                                throw djl.a(oov5);
                                            }
                                            int n4 = g8u.capacity();
                                            n4 = n7;
                                            if (n6 != 0) break block26;
                                        }
                                        catch (oov oov6) {
                                            throw djl.a(oov6);
                                        }
                                        if (n5 >= n4) break block27;
                                    }
                                    catch (oov oov7) {
                                        throw djl.a(oov7);
                                    }
                                }
                                intBuffer = BufferUtils.createIntBuffer((int)n7);
                            }
                            catch (oov oov8) {
                                throw djl.a(oov8);
                            }
                        }
                        g8u = intBuffer;
                        wns = new int[n7];
                    }
                    GL11.glPixelStorei((int)3333, (int)1);
                    int n4 = 3317;
                    n4 = 1;
                }
                try {
                    block29: {
                        try {
                            try {
                                GL11.glPixelStorei((int)n5, (int)n4);
                                g8u.clear();
                                n3 = gis.gu5();
                                if (n6 != 0) break block28;
                                if (n3 == 0) break block29;
                            }
                            catch (oov oov9) {
                                throw djl.a(oov9);
                            }
                            hzu.t30(oru2.mqx);
                            GL11.glGetTexImage((int)3553, (int)0, (int)32993, (int)33639, (IntBuffer)g8u);
                            if (n6 == 0) break block30;
                        }
                        catch (oov oov10) {
                            throw djl.a(oov10);
                        }
                    }
                    n3 = 0;
                }
                catch (oov oov11) {
                    throw djl.a(oov11);
                }
            }
            GL11.glReadPixels((int)n3, (int)0, (int)n, (int)n2, (int)32993, (int)33639, (IntBuffer)g8u);
        }
        g8u.get(wns);
        new Thread(new jiz(n, n2, wns, c05.vz1()._d2(), file2)).start();
        return new tao((Object)((Object)syo.jkd) + "(" + (Object)((Object)syo.qiz) + (Object)((Object)syo.yn5) + (String)((Object)djl.a("m", (int)23346, (long)(0x5B0DFD80EAD04BFL ^ l))) + (Object)((Object)syo.jkd) + (String)((Object)djl.a("m", (int)15272, (long)(0x1DB1FB58918DE427L ^ l))) + (Object)((Object)syo.qiz) + (String)((Object)djl.a("m", (int)29831, (long)(0x7D4192CBA6E4AB0BL ^ l))));
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

                djl.a = c.a(8074288075605515052L, 4898853094118994511L, MethodHandles.lookup().lookupClass()).a(52495735586885L);
                djl.d = new HashMap<K, V>(13);
                var0 = djl.a ^ 31112561664771L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u00cfg\u00e5\u0016\u00e6l\u00ac\u00fbr\u007f\u00f0\u00e7n\u00d3\u00b9\u009d\u000e\\\u001e\u00ea\u00c4\u00bc\u0090t\u0000\u00e9\u00a4\u0015\u00f9:\u00ce=\u0010\u00bc\u00ad/+\u00de\u0012\u00d3\u00fb\u001c\u00de0?\u00fb)\u00851";
                var8_6 = "\u00cfg\u00e5\u0016\u00e6l\u00ac\u00fbr\u007f\u00f0\u00e7n\u00d3\u00b9\u009d\u000e\\\u001e\u00ea\u00c4\u00bc\u0090t\u0000\u00e9\u00a4\u0015\u00f9:\u00ce=\u0010\u00bc\u00ad/+\u00de\u0012\u00d3\u00fb\u001c\u00de0?\u00fb)\u00851".length();
                var5_7 = 32;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = djl.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "k\u00cd\u0014\u009a@\u0006\u00b9\u0082!UY\u00a9\u0012\u00b3\u0080p\u00d3\u00cf\u00d9\u00c6\u00f6rF\u00e2\u000b\u00de\u00ee7\u00fa\u00cb\u00b4\u00b3\u00cfTJ\u00a2\u00d1\u0011\u00ff\u001a\u0010/\u00b8g\u0016\u00cb~\"w-\u00be\u000e\u00e8\r\u00c9\u00bf\f";
                    var8_6 = "k\u00cd\u0014\u009a@\u0006\u00b9\u0082!UY\u00a9\u0012\u00b3\u0080p\u00d3\u00cf\u00d9\u00c6\u00f6rF\u00e2\u000b\u00de\u00ee7\u00fa\u00cb\u00b4\u00b3\u00cfTJ\u00a2\u00d1\u0011\u00ff\u001a\u0010/\u00b8g\u0016\u00cb~\"w-\u00be\u000e\u00e8\r\u00c9\u00bf\f".length();
                    var5_7 = 40;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = djl.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        djl.b = var9_3;
        djl.c = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xA05;
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
                throw new RuntimeException("djl", exception);
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
            djl.c[n2] = djl.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = djl.a(n, l);
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
            throw new RuntimeException("djl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(djl.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

