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

public class ek8
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x6F12139D6B4L;
        return ek8.b("r", (int)14031, (long)(0x39B78BC2FDFC6FE3L ^ l));
    }

    @Override
    public int bag() {
        return 1;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x80F62AE8A32L;
        return ek8.b("r", (int)17949, (long)(0x4360D2340792C3B4L ^ l));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void l3z(e7r e7r2, String[] stringArray) {
        int n;
        int n2;
        long l;
        block6: {
            l = a ^ 0x2F29CF023F1L;
            n2 = t9d.b();
            try {
                try {
                    n = stringArray.length;
                    if (n2 == 0) break block6;
                    if (n <= 0) throw new w57((String)((Object)ek8.b("r", (int)21380, (long)(0x4DE428DBB69F7FEFL ^ l))), new Object[0]);
                }
                catch (oov oov2) {
                    throw ek8.a(oov2);
                }
                n = stringArray[0].length();
            }
            catch (oov oov3) {
                throw ek8.a(oov3);
            }
        }
        if (n <= 0) throw new w57((String)((Object)ek8.b("r", (int)21380, (long)(0x4DE428DBB69F7FEFL ^ l))), new Object[0]);
        ekw ekw2 = ek8.h1l(e7r2, stringArray, 0, true);
        try {
            vr1._0v().wh3().d3z(new hsu((String)((Object)ek8.b("r", (int)26409, (long)(0x15602F98207C4B41L ^ l))), new Object[]{e7r2.xyw(), ekw2}));
            if (n2 != 0) return;
            throw new w57((String)((Object)ek8.b("r", (int)21380, (long)(0x4DE428DBB69F7FEFL ^ l))), new Object[0]);
        }
        catch (oov oov4) {
            throw ek8.a(oov4);
        }
    }

    @Override
    public List ggu(e7r e7r2, String[] stringArray, mew mew2) {
        List list;
        block6: {
            block5: {
                String[] stringArray2;
                block4: {
                    int n = t9d.c();
                    try {
                        try {
                            stringArray2 = stringArray;
                            if (n != 0) break block4;
                            if (stringArray2.length < 1) break block5;
                        }
                        catch (oov oov2) {
                            throw ek8.a(oov2);
                        }
                        stringArray2 = stringArray;
                    }
                    catch (oov oov3) {
                        throw ek8.a(oov3);
                    }
                }
                list = ek8.cqo(stringArray2, vr1._0v().p14());
                break block6;
            }
            list = null;
        }
        return list;
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

                ek8.a = c.a(5623791270537841800L, -8073565962762309830L, MethodHandles.lookup().lookupClass()).a(264775722513228L);
                ek8.h = new HashMap<K, V>(13);
                var0 = ek8.a ^ 113056004034648L;
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
                var6_5 = "}\u00ce\u00ba\u0086yF\u00fae\u0089/V\u0011\u00a2\u009bF\u00c9\u0004X\u0016\u00a2\u0097O\u00e6iM\u00a5\u00d0\u0086z\u00ef\t\u00f5\u00fdm|B$t\u0087\u00e8\u0010N+\u00ba\u00d8\u00ba4Zp\\\u00cbf\u0095\u00fc\t\u0012G";
                var8_6 = "}\u00ce\u00ba\u0086yF\u00fae\u0089/V\u0011\u00a2\u009bF\u00c9\u0004X\u0016\u00a2\u0097O\u00e6iM\u00a5\u00d0\u0086z\u00ef\t\u00f5\u00fdm|B$t\u0087\u00e8\u0010N+\u00ba\u00d8\u00ba4Zp\\\u00cbf\u0095\u00fc\t\u0012G".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = ek8.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e1\u0019\u00d1\u00db\u0003G\u00fa*\u00c6\u000fR\u00da\u00c2\u0099$XQ\u00a0\u00ffu\u00b8@\u0010\u00d1\nv\u00da\u0002\u00aa\u00b1f[\u00ff/2\u001dd\u00d6\u00e6\u00bd(5V{37H\u00f7\u000eu\u00d1\u00ad\u00a3\u00ab\u0007\u00a8D\u0002\u00d7\tEx\u009d.\u00abO\u00c6\u00a9p\u00b9\u0095\u00c6\u001fK\f\u00b8\u00a2\u00bc\u00e7\u00a2\u009f";
                    var8_6 = "\u00e1\u0019\u00d1\u00db\u0003G\u00fa*\u00c6\u000fR\u00da\u00c2\u0099$XQ\u00a0\u00ffu\u00b8@\u0010\u00d1\nv\u00da\u0002\u00aa\u00b1f[\u00ff/2\u001dd\u00d6\u00e6\u00bd(5V{37H\u00f7\u000eu\u00d1\u00ad\u00a3\u00ab\u0007\u00a8D\u0002\u00d7\tEx\u009d.\u00abO\u00c6\u00a9p\u00b9\u0095\u00c6\u001fK\f\u00b8\u00a2\u00bc\u00e7\u00a2\u009f".length();
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
                    var9_3[var7_4++] = ek8.b(var10_9).intern();
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
        ek8.c = var9_3;
        ek8.g = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x36;
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
                throw new RuntimeException("ek8", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            ek8.g[n2] = ek8.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ek8.b(n, l);
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
            throw new RuntimeException("ek8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ek8.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

