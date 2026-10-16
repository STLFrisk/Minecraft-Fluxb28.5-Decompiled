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

public class a6v
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x5094170A70BAL;
        return a6v.b("c", (int)29522, (long)(0x788D64547EEBEE27L ^ l));
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x5E6A549D2C3CL;
        return a6v.b("c", (int)3888, (long)(0x6B7F1FDC3D2F4EC1L ^ l));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void l3z(e7r var1_1, String[] var2_2) {
        block9: {
            block8: {
                var3_3 = a6v.a ^ 93010381735423L;
                var5_4 = t9d.c();
                var6_5 = vr1._0v().mb5(h50$f05.pwg, false);
                try {
                    try {
                        if (var5_4 != 0) break block8;
                        if (var6_5 != null) {
                        }
                        ** GOTO lbl20
                    }
                    catch (oov v0) {
                        throw a6v.a(v0);
                    }
                    a6v.wxl(var1_1, this, (String)a6v.b("c", (int)8131, (long)(4270824683895584754L ^ var3_3)), new Object[]{var6_5});
                }
                catch (oov v1) {
                    throw a6v.a(v1);
                }
            }
            try {
                if (var5_4 == 0) break block9;
lbl20:
                // 2 sources

                a6v.wxl(var1_1, this, (String)a6v.b("c", (int)30698, (long)(2567034505649561561L ^ var3_3)), new Object[0]);
            }
            catch (oov v2) {
                throw a6v.a(v2);
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

                a6v.a = c.a(-3757643842057221606L, 8178969900601767866L, MethodHandles.lookup().lookupClass()).a(19849261696234L);
                a6v.h = new HashMap<K, V>(13);
                var0 = a6v.a ^ 97780730989084L;
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
                var6_5 = "\u0095\u0091\u00f0\u00ab\u00d1\u00b7C\u001d\u00aa,\u00ad$~\u00d6\u00c5\u00bc\u00d3\u0002\u00ebkK\u009e &\u009dL\u00b0\u00de\u0017\u00e0\t:?\u00ca\u00d4'\u00f4?\u0099\u001d(\u001e\u0084\u0099\u000486m\u0011J\u00ea \u00a0)\u0012\u00887|B\u00d3\u00bb\u00ccj\u00ae\u00c6\u0004\u001aJL:\u00eeW\u008fWa\u008f\n\u00c4~\u00abi";
                var8_6 = "\u0095\u0091\u00f0\u00ab\u00d1\u00b7C\u001d\u00aa,\u00ad$~\u00d6\u00c5\u00bc\u00d3\u0002\u00ebkK\u009e &\u009dL\u00b0\u00de\u0017\u00e0\t:?\u00ca\u00d4'\u00f4?\u0099\u001d(\u001e\u0084\u0099\u000486m\u0011J\u00ea \u00a0)\u0012\u00887|B\u00d3\u00bb\u00ccj\u00ae\u00c6\u0004\u001aJL:\u00eeW\u008fWa\u008f\n\u00c4~\u00abi".length();
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
                    var9_3[var7_4++] = a6v.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00a6\u00b9\u0080K@wS&\u001fl\u0093)\u001c\u00e4)Z0\u00e5\u00d7\u00bf\u00c7\u00ac\u00eeh\u00ec%b\u00c8T\"\u00c1\u008f\u00d0\u00a5k\u009e\u0091~d\u00d5\u0003\u00ed\u00132g!\u0096\u001ay\u009cW\u0006KKH\u00b3\u00d6\u0087\u0004\u0089\u00a4\u0000\u00bb\u008dy";
                    var8_6 = "\u00a6\u00b9\u0080K@wS&\u001fl\u0093)\u001c\u00e4)Z0\u00e5\u00d7\u00bf\u00c7\u00ac\u00eeh\u00ec%b\u00c8T\"\u00c1\u008f\u00d0\u00a5k\u009e\u0091~d\u00d5\u0003\u00ed\u00132g!\u0096\u001ay\u009cW\u0006KKH\u00b3\u00d6\u0087\u0004\u0089\u00a4\u0000\u00bb\u008dy".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = a6v.b(var10_9).intern();
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
        a6v.c = var9_3;
        a6v.g = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x446C;
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
                throw new RuntimeException("a6v", exception);
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
            a6v.g[n2] = a6v.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = a6v.b(n, l);
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
            throw new RuntimeException("a6v" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a6v.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

