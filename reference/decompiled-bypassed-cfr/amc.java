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

public class amc
extends noz {
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public amc(l7l l7l2) {
        long l = a ^ 0x408AAE430AE1L;
        super((String)((Object)amc.b("u", (int)3288, (long)(0x3D89A312A8A14B97L ^ l))));
        this.h8r((String)((Object)amc.b("u", (int)16127, (long)(0x775859EA0E04F9B7L ^ l))), l7l2.yr5);
        this.h8r((String)((Object)amc.b("u", (int)17118, (long)(0x4F177D2219F48593L ^ l))), l7l2.xn7().rnh());
        this.h8r((String)((Object)amc.b("u", (int)1385, (long)(0x1F9AF48EDD674227L ^ l))), l7l2.h7c());
        this.p7i((String)((Object)amc.b("u", (int)5298, (long)(0x4608BF887B6553FEL ^ l))) + l7l2.xn7().rnh() + (String)((Object)amc.b("u", (int)4630, (long)(0x4A468C7EF699555FL ^ l))));
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

                amc.a = c.a(4173870279388030027L, 4083822895735249480L, MethodHandles.lookup().lookupClass()).a(29754753018120L);
                amc.h = new HashMap<K, V>(13);
                var0 = amc.a ^ 56663986394751L;
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
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "\u0085\u008fA/ \u009f\u00b6l\u00d8\u00acR%\u0006\u0080~\u0011\u001c\u00ab\u00d4\u0084\u00ae\u0097\u001aQ\u00a4\u001c\u00c6\u00d4\u00d6~\u0007\u00d9(\u00a9\u00b1\u00dcm\"\u00f3\u00c6} \u00d8hB\u008a\u00a1\u008b[B\u00ca3\u000f\u0093\u0003\u00de$PT5\u0084\rex\u0090,q\u001cS\u00cft\u00bd{0#\u00f1\u00b7\u00be\u00cdXB\u00a9)\u00da\u0081\u00ce/\u00cb\u0081^_\u00bd\u00e9M\u00f9\t\u00d04n\u00d6*\u0084\u00d5\u00eb\u00b8\u008f\u00bd\u00dd\u00bbjn\u0002\u00a2\u00c4\u0083\u00c4;Gk\u00e9\u00d7\u00e3\u0018\u00ab\u0002\u00e7\u00ac\u00f6\u00c2\tY\u00d85g\u00e0\u0081\u00dd\u001e\u00d8&\u009ej\u0002S\u008f\u009b\u00e5";
                var8_6 = "\u0085\u008fA/ \u009f\u00b6l\u00d8\u00acR%\u0006\u0080~\u0011\u001c\u00ab\u00d4\u0084\u00ae\u0097\u001aQ\u00a4\u001c\u00c6\u00d4\u00d6~\u0007\u00d9(\u00a9\u00b1\u00dcm\"\u00f3\u00c6} \u00d8hB\u008a\u00a1\u008b[B\u00ca3\u000f\u0093\u0003\u00de$PT5\u0084\rex\u0090,q\u001cS\u00cft\u00bd{0#\u00f1\u00b7\u00be\u00cdXB\u00a9)\u00da\u0081\u00ce/\u00cb\u0081^_\u00bd\u00e9M\u00f9\t\u00d04n\u00d6*\u0084\u00d5\u00eb\u00b8\u008f\u00bd\u00dd\u00bbjn\u0002\u00a2\u00c4\u0083\u00c4;Gk\u00e9\u00d7\u00e3\u0018\u00ab\u0002\u00e7\u00ac\u00f6\u00c2\tY\u00d85g\u00e0\u0081\u00dd\u001e\u00d8&\u009ej\u0002S\u008f\u009b\u00e5".length();
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
                    var9_3[var7_4++] = amc.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e0\u00fbIv\u0099\u00ba\r\u00daG\u00cd\u00f7n R\u00cf\u00c3\u00ac\u00b0\u0084\u00cd\u0017\u000b\u00a2\u00c7 0o\u0010\u00bb\u00bd\u009d\u001c\u00f9\u0010$\u00a8\u00ce/|\u001c\u0018w\u0087\u00d3u\u00a2N\u00f0!\u00aaZ\u0011\u00f7\u009d\u00a1@\u0096";
                    var8_6 = "\u00e0\u00fbIv\u0099\u00ba\r\u00daG\u00cd\u00f7n R\u00cf\u00c3\u00ac\u00b0\u0084\u00cd\u0017\u000b\u00a2\u00c7 0o\u0010\u00bb\u00bd\u009d\u001c\u00f9\u0010$\u00a8\u00ce/|\u001c\u0018w\u0087\u00d3u\u00a2N\u00f0!\u00aaZ\u0011\u00f7\u009d\u00a1@\u0096".length();
                    var5_7 = 24;
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
                    var9_3[var7_4++] = amc.b(var10_9).intern();
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
        amc.f = var9_3;
        amc.g = new String[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x8B1;
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
                throw new RuntimeException("amc", exception);
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
            amc.g[n2] = amc.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = amc.b(n, l);
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
            throw new RuntimeException("amc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(amc.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

