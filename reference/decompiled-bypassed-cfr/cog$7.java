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
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cog$7
implements Callable {
    public final cog mdf;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public cog$7(cog cog2) {
        this.mdf = cog2;
    }

    /*
     * Unable to fully structure code
     */
    public String call() {
        var1_1 = cog$7.a ^ 61334946580745L;
        var3_2 = t9d.c();
        var4_3 = cog$7.a("q", (int)20708, (long)(4992944504633931393L ^ var1_1));
        try {
            try {
                if (var3_2 == 0) {
                }
                ** GOTO lbl16
            }
            catch (Throwable v0) {
                throw cog$7.a(v0);
            }
            {
                ** switch (cog.xc5((cog)this.mdf))
            }
lbl-1000:
            // 1 sources

            {
                case 19132: {
                    var4_3 = cog$7.a("q", (int)2286, (long)(2619513504934456970L ^ var1_1));
lbl16:
                    // 2 sources

                    if (var3_2 == 0) break;
                }
lbl17:
                // 2 sources

                case 19133: {
                    var4_3 = cog$7.a("q", (int)19006, (long)(674980130388880472L ^ var1_1));
                }
            }
lbl20:
            // 3 sources

        }
        catch (Throwable var5_4) {
        }
        return String.format((String)cog$7.a("q", (int)17959, (long)(3704036911074877504L ^ var1_1)), new Object[]{cog.xc5(this.mdf), var4_3});
    }

    public Object call() {
        return this.call();
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

                cog$7.a = c.a(4047111452017988045L, 3826990525370936901L, MethodHandles.lookup().lookupClass()).a(77947164294262L);
                cog$7.d = new HashMap<K, V>(13);
                var0 = cog$7.a ^ 118804334165432L;
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
                var6_5 = "\u001a\u0086\u0098#\u00b2\u00e2\u00ee\u00ce\u00ab\u0085\u00e8\u00da3\u00a4v; w\u00c1\u0090\u0004\u009d#A\u00ed\u00acZ\u00b0\u00ab\u0019\u00c5\u00c6\u001b\u008e\u00f9\u00df\u00ed\\\u0000\u00fa\u008ej\u009b\u00f8\u001e\u00e7t\u00ed\u0010";
                var8_6 = "\u001a\u0086\u0098#\u00b2\u00e2\u00ee\u00ce\u00ab\u0085\u00e8\u00da3\u00a4v; w\u00c1\u0090\u0004\u009d#A\u00ed\u00acZ\u00b0\u00ab\u0019\u00c5\u00c6\u001b\u008e\u00f9\u00df\u00ed\\\u0000\u00fa\u008ej\u009b\u00f8\u001e\u00e7t\u00ed\u0010".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = cog$7.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00a2\u0001A\u00bev\u009b\u0003~/\u00ed~<\u00b8q\u00bdUBIC\u00cf\\\u00fe\u00da7o\u00cbZ\u00dd\u00ad\u0018\u00eay\u0018\u00a6G_b\u009fEY\u00fby`\u0012\u00f9\u00f0\u0087n\u0003\u00d6\u0093\u000f\u00f0-\b\u00e3\u0011";
                    var8_6 = "\u00a2\u0001A\u00bev\u009b\u0003~/\u00ed~<\u00b8q\u00bdUBIC\u00cf\\\u00fe\u00da7o\u00cbZ\u00dd\u00ad\u0018\u00eay\u0018\u00a6G_b\u009fEY\u00fby`\u0012\u00f9\u00f0\u0087n\u0003\u00d6\u0093\u000f\u00f0-\b\u00e3\u0011".length();
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
                    var9_3[var7_4++] = cog$7.a(var10_9).intern();
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
        cog$7.b = var9_3;
        cog$7.c = new String[4];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7216;
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
                throw new RuntimeException("cog$7", exception);
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
            cog$7.c[n2] = cog$7.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cog$7.a(n, l);
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
            throw new RuntimeException("cog$7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cog$7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

