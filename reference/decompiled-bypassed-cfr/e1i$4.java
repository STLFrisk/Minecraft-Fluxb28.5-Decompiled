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
public class e1i$4
implements Callable {
    public final e1i r0u;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public e1i$4(e1i e1i2) {
        this.r0u = e1i2;
    }

    public String call() {
        long l = a ^ 0x252371370282L;
        return System.getProperty((String)((Object)e1i$4.a("t", (int)21754, (long)(0x7435998BF1A8DDC2L ^ l)))) + (String)((Object)e1i$4.a("t", (int)17273, (long)(0x58154070CBD9CA43L ^ l))) + System.getProperty((String)((Object)e1i$4.a("t", (int)18720, (long)(0x5C0D1C44997EC019L ^ l)))) + (String)((Object)e1i$4.a("t", (int)22685, (long)(0x48C4A2DDAE24D1A1L ^ l))) + System.getProperty((String)((Object)e1i$4.a("t", (int)6182, (long)(0x65282FBD3436911DL ^ l))));
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

                e1i$4.a = c.a(-9074075164826898098L, 8379000346745007032L, MethodHandles.lookup().lookupClass()).a(156087528951808L);
                e1i$4.d = new HashMap<K, V>(13);
                var0 = e1i$4.a ^ 80191585756064L;
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
                var6_5 = "O\u00af\u00e2\u001a}\u0012?\u00b3\\\u00f9\u00ea\u0082\u0089\u00e5\u009f]\u0007^\u00ed\u00d5\u00f0\u00f6Z\u00ba\u00ad\u00e6\u00dd\u0002\u0003\u00baj\u001a k,\u00ea>\u00b9P\u009ay\u0006\u00f7KM\u008e\u008a>\u00d3\u00b3\u00a1\u0095\u00c8f\u00ca\u0089\u0013'RFI|6\r\u00d2\u0010\u00fb\u0099\u0006&wp[\u00c2\u00a2\n\u00f2\u0000$\u00c52>";
                var8_6 = "O\u00af\u00e2\u001a}\u0012?\u00b3\\\u00f9\u00ea\u0082\u0089\u00e5\u009f]\u0007^\u00ed\u00d5\u00f0\u00f6Z\u00ba\u00ad\u00e6\u00dd\u0002\u0003\u00baj\u001a k,\u00ea>\u00b9P\u009ay\u0006\u00f7KM\u008e\u008a>\u00d3\u00b3\u00a1\u0095\u00c8f\u00ca\u0089\u0013'RFI|6\r\u00d2\u0010\u00fb\u0099\u0006&wp[\u00c2\u00a2\n\u00f2\u0000$\u00c52>".length();
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
                    var9_3[var7_4++] = e1i$4.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0014\u00e8tS\u00ad\u0096\u00f1Z\u0084\u00e3F\u00fa\u00ec<F\u00c7\u00bf\u00e4\b6\u00e8A(\u00ab\u00f8?\u00fc\u00bc1\u0019#\u001f\u0010\u00b1\u000fF\u00cd\u0083\u00e2:\u0087\u00ae\u00b8\u0092\u0084Ko?\u009e";
                    var8_6 = "\u0014\u00e8tS\u00ad\u0096\u00f1Z\u0084\u00e3F\u00fa\u00ec<F\u00c7\u00bf\u00e4\b6\u00e8A(\u00ab\u00f8?\u00fc\u00bc1\u0019#\u001f\u0010\u00b1\u000fF\u00cd\u0083\u00e2:\u0087\u00ae\u00b8\u0092\u0084Ko?\u009e".length();
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
                    var9_3[var7_4++] = e1i$4.a(var10_9).intern();
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
        e1i$4.b = var9_3;
        e1i$4.c = new String[5];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6862;
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
                throw new RuntimeException("e1i$4", exception);
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
            e1i$4.c[n2] = e1i$4.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = e1i$4.a(n, l);
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
            throw new RuntimeException("e1i$4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e1i$4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

