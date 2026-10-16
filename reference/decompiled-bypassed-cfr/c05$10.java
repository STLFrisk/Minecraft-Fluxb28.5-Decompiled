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
public class c05$10
implements Callable {
    public final c05 wzi;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public c05$10(c05 c052) {
        this.wzi = c052;
    }

    public String call() {
        Object object;
        block7: {
            long l;
            block9: {
                block8: {
                    l = a ^ 0x34FAE29E4B8FL;
                    int n = t9d.c();
                    String string = g4v.a68();
                    try {
                        try {
                            object = string;
                            if (n != 0) break block7;
                            if (!((String)object).equals(c05$10.a("g", (int)3704, (long)(0x77D75040622BEE9AL ^ l)))) {
                            }
                            break block8;
                        }
                        catch (oov oov2) {
                            throw c05$10.a(oov2);
                        }
                        object = (String)((Object)c05$10.a("g", (int)29496, (long)(0x45AFB6653BE993DBL ^ l))) + string + "'";
                        break block7;
                    }
                    catch (oov oov3) {
                        throw c05$10.a(oov3);
                    }
                }
                try {
                    if (c05.class.getSigners() != null) break block9;
                    object = c05$10.a("g", (int)23203, (long)(0x672715B19FEABA42L ^ l));
                    break block7;
                }
                catch (oov oov4) {
                    throw c05$10.a(oov4);
                }
            }
            object = c05$10.a("g", (int)17103, (long)(0x62E71E17D19A222FL ^ l));
        }
        return object;
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

                c05$10.a = c.a(-2398656436337413091L, 5712082021828196912L, MethodHandles.lookup().lookupClass()).a(170877112427973L);
                c05$10.d = new HashMap<K, V>(13);
                var0 = c05$10.a ^ 9168129062153L;
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
                var6_5 = "y\u00b4#y\u00d1R\u0014\u00c7\u00b2GA\u0000n\u00b8\u00e5\u00c6\u000b\u00fd\u00e4\u00bf\u008c\u001b\u00c9\u0090!\u00f6\u00de+\u00ae\u00ec\\)M5\u001a\u00d1\u00f1\u008c]S\u00a0\u00e2\u00c3\u00ccp\u00cb\u0013\u001c\u00b8\u00db\u008f\u00c6\u0011E\u0012\u0019\b\u009f\u00ff\u00d2\u0015\u00125\u009fx\u001fa\u00c7\u0018\u00cf\u00bdG\u00a9\u00e1\u008e\u00ee[/\u00b5-\u0088\u00aa9US\u0091Kj\u00a2\u0013\u00b3\u00af\u000f\u00c5\u00e2?\u00a7\u00e7|\u00a6{\u00bc\u00d4\u0004X\u0090\u00c9\u00d9\u00a5.oB[\u00e1?\u00d3\u001f\u0083\u00d8\u0011\u00a8\u000bmO\u0098\u00d1\u00b9\u0081\u00f5\u00e6\u00a6A\u00c5=\u0010\u00a4\r'\u00b9[\u00fb\u00f8\u00c9w\u001a\u0098T\u0094;\u00bfM\u0016\u001f\u00c3Y\u00d3\u00a3\u00b2Q\u0000\u0012\u0005\u009b\u00e1\u00e3\u00e4\u008f'_.\u007fuEu\u0084\u0091\u000bA:\u0012\u00bd\u00dd\u008e=\u00ec";
                var8_6 = "y\u00b4#y\u00d1R\u0014\u00c7\u00b2GA\u0000n\u00b8\u00e5\u00c6\u000b\u00fd\u00e4\u00bf\u008c\u001b\u00c9\u0090!\u00f6\u00de+\u00ae\u00ec\\)M5\u001a\u00d1\u00f1\u008c]S\u00a0\u00e2\u00c3\u00ccp\u00cb\u0013\u001c\u00b8\u00db\u008f\u00c6\u0011E\u0012\u0019\b\u009f\u00ff\u00d2\u0015\u00125\u009fx\u001fa\u00c7\u0018\u00cf\u00bdG\u00a9\u00e1\u008e\u00ee[/\u00b5-\u0088\u00aa9US\u0091Kj\u00a2\u0013\u00b3\u00af\u000f\u00c5\u00e2?\u00a7\u00e7|\u00a6{\u00bc\u00d4\u0004X\u0090\u00c9\u00d9\u00a5.oB[\u00e1?\u00d3\u001f\u0083\u00d8\u0011\u00a8\u000bmO\u0098\u00d1\u00b9\u0081\u00f5\u00e6\u00a6A\u00c5=\u0010\u00a4\r'\u00b9[\u00fb\u00f8\u00c9w\u001a\u0098T\u0094;\u00bfM\u0016\u001f\u00c3Y\u00d3\u00a3\u00b2Q\u0000\u0012\u0005\u009b\u00e1\u00e3\u00e4\u008f'_.\u007fuEu\u0084\u0091\u000bA:\u0012\u00bd\u00dd\u008e=\u00ec".length();
                var5_7 = 64;
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
                    var9_3[var7_4++] = c05$10.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ce2\u0006DS/\u00a7\u001e\u0017P\u00dc\u0001\u001a\u00c7\u00ae\u00a6-\u0004\u00d6\u00a0\u00e7,\u00fa\u00a8r\u00e5\u0014\u00fd\u00b5\u00dc\\\u0019\u0015\u0019m\u00e58\u00b5\u00146\u00a8\u009c$\u00c2iS\u00cf\u009f\u0083\u00a6u8A\u00bcE#\u00c0\u008e\u00d17\u00ea\u00e4\u009eh\u0010L~\u00a9\u00a3\u0013\u00ef\u00a2\u00fe\u008d\u009c*\u0085\u00b4\u00e0\u0006\u0018";
                    var8_6 = "\u00ce2\u0006DS/\u00a7\u001e\u0017P\u00dc\u0001\u001a\u00c7\u00ae\u00a6-\u0004\u00d6\u00a0\u00e7,\u00fa\u00a8r\u00e5\u0014\u00fd\u00b5\u00dc\\\u0019\u0015\u0019m\u00e58\u00b5\u00146\u00a8\u009c$\u00c2iS\u00cf\u009f\u0083\u00a6u8A\u00bcE#\u00c0\u008e\u00d17\u00ea\u00e4\u009eh\u0010L~\u00a9\u00a3\u0013\u00ef\u00a2\u00fe\u008d\u009c*\u0085\u00b4\u00e0\u0006\u0018".length();
                    var5_7 = 64;
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
                    var9_3[var7_4++] = c05$10.a(var10_9).intern();
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
        c05$10.b = var9_3;
        c05$10.c = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x56D4;
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
                throw new RuntimeException("c05$10", exception);
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
            c05$10.c[n2] = c05$10.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = c05$10.a(n, l);
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
            throw new RuntimeException("c05$10" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c05$10.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

