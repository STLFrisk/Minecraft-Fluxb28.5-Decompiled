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
public class e1i$5
implements Callable {
    public final e1i koi;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public e1i$5(e1i e1i2) {
        this.koi = e1i2;
    }

    public String call() {
        long l = a ^ 0x7C4F5416253BL;
        Runtime runtime = Runtime.getRuntime();
        long l2 = runtime.maxMemory();
        long l3 = runtime.totalMemory();
        long l4 = runtime.freeMemory();
        long l5 = l2 / 1024L / 1024L;
        long l6 = l3 / 1024L / 1024L;
        long l7 = l4 / 1024L / 1024L;
        return l4 + (String)((Object)e1i$5.a("m", (int)17576, (long)(0x69954C8A58BB176BL ^ l))) + l7 + (String)((Object)e1i$5.a("m", (int)9515, (long)(0x29E9E9C85D30F6EAL ^ l))) + l3 + (String)((Object)e1i$5.a("m", (int)3442, (long)(0xC48E4133905DEB2L ^ l))) + l6 + (String)((Object)e1i$5.a("m", (int)21711, (long)(0x448FFE620FB0870DL ^ l))) + l2 + (String)((Object)e1i$5.a("m", (int)3442, (long)(0xC48E4133905DEB2L ^ l))) + l5 + (String)((Object)e1i$5.a("m", (int)24364, (long)(0x21979211C1840CE8L ^ l)));
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

                e1i$5.a = c.a(-8254308151726235118L, 8816096053527964629L, MethodHandles.lookup().lookupClass()).a(163358249983375L);
                e1i$5.d = new HashMap<K, V>(13);
                var0 = e1i$5.a ^ 6099600704763L;
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
                var6_5 = "\u0082\u00ees~\u00b1}\u00a2\u00a9\u00e7\u00c6\u00f7\u00d3\u009bH\u00d1J\u00d3\n\u0019\u00e7o\u00c0r\u00d3\u00a0\u00f1\u00e4\"\u00fcTV(\u0010Xl\u0010\u00c4R\u00cc\u0019\u008b\u00ee|J\u00c2R\u00bb\u00e0\u0098\u0018\u00be\u001d\u000eI\u00aa\u009b\u00e5G@\u0096\u001b\u00e8\u0012tR\u00182\u00cf\u0083\u00d3R\u0084K\u0016";
                var8_6 = "\u0082\u00ees~\u00b1}\u00a2\u00a9\u00e7\u00c6\u00f7\u00d3\u009bH\u00d1J\u00d3\n\u0019\u00e7o\u00c0r\u00d3\u00a0\u00f1\u00e4\"\u00fcTV(\u0010Xl\u0010\u00c4R\u00cc\u0019\u008b\u00ee|J\u00c2R\u00bb\u00e0\u0098\u0018\u00be\u001d\u000eI\u00aa\u009b\u00e5G@\u0096\u001b\u00e8\u0012tR\u00182\u00cf\u0083\u00d3R\u0084K\u0016".length();
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
                    var9_3[var7_4++] = e1i$5.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e3\u00f1\u0016\u00eb=\u00aa\u0003\u00e5\u00a42\u0084\u0089\u0098\u00d2E\u00f8\u0011\u00f6>\u00da|\u0017CE\u00b4@\u00ce\fe\u001d\u00c1K\u0010Gbi.7\u00e0\u00a40\u00ee\u0003\u00bb\u00d1\u0089\u00e7|E";
                    var8_6 = "\u00e3\u00f1\u0016\u00eb=\u00aa\u0003\u00e5\u00a42\u0084\u0089\u0098\u00d2E\u00f8\u0011\u00f6>\u00da|\u0017CE\u00b4@\u00ce\fe\u001d\u00c1K\u0010Gbi.7\u00e0\u00a40\u00ee\u0003\u00bb\u00d1\u0089\u00e7|E".length();
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
                    var9_3[var7_4++] = e1i$5.a(var10_9).intern();
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
        e1i$5.b = var9_3;
        e1i$5.c = new String[5];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x54A3;
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
                throw new RuntimeException("e1i$5", exception);
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
            e1i$5.c[n2] = e1i$5.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = e1i$5.a(n, l);
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
            throw new RuntimeException("e1i$5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e1i$5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

