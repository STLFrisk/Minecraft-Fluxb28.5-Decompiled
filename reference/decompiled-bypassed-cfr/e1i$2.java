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
public class e1i$2
implements Callable {
    public final e1i nxa;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public e1i$2(e1i e1i2) {
        this.nxa = e1i2;
    }

    public String call() {
        long l = a ^ 0x784E5876765CL;
        return System.getProperty((String)((Object)e1i$2.a("m", (int)22268, (long)(0x2A986AEF2CDABC79L ^ l)))) + (String)((Object)e1i$2.a("m", (int)8688, (long)(0x6C653672EF19CB71L ^ l))) + System.getProperty((String)((Object)e1i$2.a("m", (int)3521, (long)(0x41987185ACD66745L ^ l)))) + (String)((Object)e1i$2.a("m", (int)5276, (long)(0x76F29811F57EFE1AL ^ l))) + System.getProperty((String)((Object)e1i$2.a("m", (int)13750, (long)(0x802B11830DBDF31L ^ l))));
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

                e1i$2.a = c.a(3006466627722025367L, -3206421739187677884L, MethodHandles.lookup().lookupClass()).a(232140111720595L);
                e1i$2.d = new HashMap<K, V>(13);
                var0 = e1i$2.a ^ 73954673209387L;
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
                var6_5 = "\u0017$\u00a7y6\u000f\u0089O\u00dd\u00be@F\u008b\u00ea2\u0019\u0010\u0001\u0016\u00e1\u00cd=-\u00ac;\u0012\u00d2\n\u00fc^$EL d\u00f3\u00d8\u00ab4\u00af0:\u00af\u0012\u0000C%\u00871v\\w\u000b7\u0002\u00da\u00ae'\u00a7\u00ab7\u00f0-\f\u00b2\u00b8";
                var8_6 = "\u0017$\u00a7y6\u000f\u0089O\u00dd\u00be@F\u008b\u00ea2\u0019\u0010\u0001\u0016\u00e1\u00cd=-\u00ac;\u0012\u00d2\n\u00fc^$EL d\u00f3\u00d8\u00ab4\u00af0:\u00af\u0012\u0000C%\u00871v\\w\u000b7\u0002\u00da\u00ae'\u00a7\u00ab7\u00f0-\f\u00b2\u00b8".length();
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
                    var9_3[var7_4++] = e1i$2.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00cd\u0016\u00afd\u0081\u001d)by\u008e\u0097\u00d0a\u00abK\u00d2\u0005\u00e9W\u00c1;9\u0088\u0080\u00af\u00ed\u0089\u00d9\u0012\u00d2/\u00b4\u0010\u0018\u009c\"yqB\u001d=\u00d96V=rm\u0019\u00cd";
                    var8_6 = "\u00cd\u0016\u00afd\u0081\u001d)by\u008e\u0097\u00d0a\u00abK\u00d2\u0005\u00e9W\u00c1;9\u0088\u0080\u00af\u00ed\u0089\u00d9\u0012\u00d2/\u00b4\u0010\u0018\u009c\"yqB\u001d=\u00d96V=rm\u0019\u00cd".length();
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
                    var9_3[var7_4++] = e1i$2.a(var10_9).intern();
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
        e1i$2.b = var9_3;
        e1i$2.c = new String[5];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1C42;
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
                throw new RuntimeException("e1i$2", exception);
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
            e1i$2.c[n2] = e1i$2.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = e1i$2.a(n, l);
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
            throw new RuntimeException("e1i$2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e1i$2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

