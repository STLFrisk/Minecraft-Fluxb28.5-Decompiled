/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
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
import org.lwjgl.opengl.GL20;

public class g5m
extends ni3 {
    private /* synthetic */ float zxi;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public g5m() {
        long l = a ^ 0x3E86B808AC1L;
        super((String)((Object)g5m.b("a", (int)13815, (long)(0x49DD0E2FFB2CE28BL ^ l))));
    }

    @Override
    public void la_() {
        long l = a ^ 0x60177754382EL;
        this.j_r((String)((Object)g5m.b("a", (int)27441, (long)(0x1262629A5C360EA1L ^ l))));
        this.j_r((String)((Object)g5m.b("a", (int)1756, (long)(0x2D5EA3A66BDDE34DL ^ l))));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void jhy() {
        block10: {
            block11: {
                int n;
                int n2;
                block8: {
                    long l;
                    block9: {
                        l = a ^ 0x7568B0527C6DL;
                        eka eka2 = new eka(wc2);
                        int n3 = this.jda((String)((Object)g5m.b("a", (int)8965, (long)(0x41E6F6DC391302D1L ^ l))));
                        n2 = t9d.c();
                        try {
                            try {
                                n = n3;
                                if (n2 != 0) break block8;
                                if (n <= -1) break block9;
                            }
                            catch (oov oov2) {
                                throw g5m.a(oov2);
                            }
                            GL20.glUniform2f((int)n3, (float)((float)eka2.x05() * 2.0f), (float)((float)eka2.lrx() * 2.0f));
                        }
                        catch (oov oov3) {
                            throw g5m.a(oov3);
                        }
                    }
                    n = this.jda((String)((Object)g5m.b("a", (int)6328, (long)(0x4DEE486AC078B969L ^ l))));
                }
                int n4 = n;
                try {
                    try {
                        if (n2 != 0) break block10;
                        if (n4 <= -1) break block11;
                    }
                    catch (oov oov4) {
                        throw g5m.a(oov4);
                    }
                    GL20.glUniform1f((int)n4, (float)this.zxi);
                }
                catch (oov oov5) {
                    throw g5m.a(oov5);
                }
            }
            this.zxi += 0.001f * ybv.brc;
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

                g5m.a = c.a(5317986270709744780L, 6534779419074038148L, MethodHandles.lookup().lookupClass()).a(229659743143877L);
                g5m.h = new HashMap<K, V>(13);
                var0 = g5m.a ^ 837918595316L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "v\u0000\u009b0\u00f6\u0018\u00cfe\u008b{\u00f8T\u0011H+\u008a\u00ac\u00d2v\u0091\u00b3\u00b8\u009a\u00b4\u001f\u00c6P\u00ac&\u009a\u0086~\u0010\u00b07r8\u000b\u00c4\u0006\u00c9\u0005S'X\u00945@\u0091\u0010\u008c\u0081g\u0002t&\f\u00da\u00ffNZ\u0097\u00b7:\u00a0\u0005";
                var8_6 = "v\u0000\u009b0\u00f6\u0018\u00cfe\u008b{\u00f8T\u0011H+\u008a\u00ac\u00d2v\u0091\u00b3\u00b8\u009a\u00b4\u001f\u00c6P\u00ac&\u009a\u0086~\u0010\u00b07r8\u000b\u00c4\u0006\u00c9\u0005S'X\u00945@\u0091\u0010\u008c\u0081g\u0002t&\f\u00da\u00ffNZ\u0097\u00b7:\u00a0\u0005".length();
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
                    var9_3[var7_4++] = g5m.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u001a\u0011\u0081\u00cb\u0018g\u00dc\u001a-n\u0099\u0012\b.\u0081\u00fcq\u0085\u00f4\u00ee\u00d2\u0019e\u00dc\u00a8\u00b4\u00b5 .\u0089+f\u0018\u00a1\u0097\u00cd|ghw\u00180rK\u00da\u00bc\u0002T\u00b9\u000edCdM\u00a7\u00d3)";
                    var8_6 = "\u001a\u0011\u0081\u00cb\u0018g\u00dc\u001a-n\u0099\u0012\b.\u0081\u00fcq\u0085\u00f4\u00ee\u00d2\u0019e\u00dc\u00a8\u00b4\u00b5 .\u0089+f\u0018\u00a1\u0097\u00cd|ghw\u00180rK\u00da\u00bc\u0002T\u00b9\u000edCdM\u00a7\u00d3)".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = g5m.b(var10_9).intern();
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
        g5m.f = var9_3;
        g5m.g = new String[5];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1B21;
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
                throw new RuntimeException("g5m", exception);
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
            g5m.g[n2] = g5m.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = g5m.b(n, l);
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
            throw new RuntimeException("g5m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g5m.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

