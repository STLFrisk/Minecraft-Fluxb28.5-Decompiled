/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  us.myles.ViaVersion.api.platform.ViaInjector
 *  us.myles.ViaVersion.util.GsonUtil
 *  us.myles.viaversion.libs.gson.JsonObject
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import us.myles.ViaVersion.api.platform.ViaInjector;
import us.myles.ViaVersion.util.GsonUtil;
import us.myles.viaversion.libs.gson.JsonObject;

public class ff2
implements ViaInjector {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public void inject() {
    }

    public void uninject() {
    }

    public int getServerProtocolVersion() {
        return this.byv();
    }

    private int byv() {
        return 47;
    }

    public String getEncoderName() {
        long l = a ^ 0x27347FBC2EB0L;
        return ff2.a("x", (int)2506, (long)(0x9B6D62AA65D2BBDL ^ l));
    }

    public String getDecoderName() {
        long l = a ^ 0x4A7FAEA1EABCL;
        return ff2.a("x", (int)16389, (long)(0x30306F07B25BA679L ^ l));
    }

    public JsonObject getDump() {
        long l = a ^ 0x64433881080DL;
        JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.add((String)((Object)ff2.a("x", (int)13953, (long)(0x1C55A07F6A97B249L ^ l))), GsonUtil.getGson().toJsonTree(Arrays.stream(Class.forName((String)((Object)ff2.a("x", (int)24362, (long)(0x7FDC22C80878DBE1L ^ l)))).getDeclaredMethods()).map(Method::toString).toArray(ff2::g_4)));
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        try {
            jsonObject.add((String)((Object)ff2.a("x", (int)562, (long)(0x1E81F741AE1D06FBL ^ l))), GsonUtil.getGson().toJsonTree(Arrays.stream(Class.forName((String)((Object)ff2.a("x", (int)23353, (long)(0x6579876E6CE4DFF5L ^ l)))).getDeclaredMethods()).map(Method::toString).toArray(ff2::lvm)));
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        return jsonObject;
    }

    private static String[] lvm(int n) {
        return new String[n];
    }

    private static String[] g_4(int n) {
        return new String[n];
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

                ff2.a = c.a(9045826448900142202L, 4494667366509577288L, MethodHandles.lookup().lookupClass()).a(176542510341109L);
                ff2.d = new HashMap<K, V>(13);
                var0 = ff2.a ^ 81855773250221L;
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
                var6_5 = "\u00a9\u00ed\u0004\u00e7)2\u001a\u0005\u00e4\u00f9\u0081\u00d1,\u00e5T\u00c0>^?\u00a8\b\u00c8\u00db8\u00cb:\u00c2\u00acws\u00e7\u00ed\u00e0Q\u0092>O\u00a9u\u00da(\u00c6>[\u00d1\u0097\u00f3\\\u00c8\u00eb\u00c0\u00a6\u00cb4\u0005`\u001a\u0011T\u00a3\u0093\u0099a\u000f\u001d\u00a3\u00fdX\u0015j\u00a1t\u0086\u001c?\u00d0\u00dd\u00c4EG\u00bf\u0018\u008e\u009e\u0094\u00ee\u00d4\u001bo,d7\u00e94i\b+\u00f3m\u0013\u00b3:k\u00a6\u00feH0\u00da\u00ec\u00a6b\u00c4\u0001\u0002\u00c0Za\u00ca\u0000\u00b6\u0005\u0002\u00a9\u0090\u00d6E\u0083\u00d9\u00fd\u0013/P\u0096\u0096M\u00a3\u0004\u001f\u00b3r\u00c0\u0004tk\bB\u00ab\u00aaZ\u00d1}\u0086O\u00c8\u00b0";
                var8_6 = "\u00a9\u00ed\u0004\u00e7)2\u001a\u0005\u00e4\u00f9\u0081\u00d1,\u00e5T\u00c0>^?\u00a8\b\u00c8\u00db8\u00cb:\u00c2\u00acws\u00e7\u00ed\u00e0Q\u0092>O\u00a9u\u00da(\u00c6>[\u00d1\u0097\u00f3\\\u00c8\u00eb\u00c0\u00a6\u00cb4\u0005`\u001a\u0011T\u00a3\u0093\u0099a\u000f\u001d\u00a3\u00fdX\u0015j\u00a1t\u0086\u001c?\u00d0\u00dd\u00c4EG\u00bf\u0018\u008e\u009e\u0094\u00ee\u00d4\u001bo,d7\u00e94i\b+\u00f3m\u0013\u00b3:k\u00a6\u00feH0\u00da\u00ec\u00a6b\u00c4\u0001\u0002\u00c0Za\u00ca\u0000\u00b6\u0005\u0002\u00a9\u0090\u00d6E\u0083\u00d9\u00fd\u0013/P\u0096\u0096M\u00a3\u0004\u001f\u00b3r\u00c0\u0004tk\bB\u00ab\u00aaZ\u00d1}\u0086O\u00c8\u00b0".length();
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
                    var9_3[var7_4++] = ff2.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ec6\u00ba\u00e3'f\u00f8\u0016_\r\u00cab|QB`\u0099\u001e\u0005\u00b7\u00bbQ\u0013\u00d8R\u00c5l\u00ed\u00cc\u00fa\u00bc\u00d15\u0097\u00ee\u00c0\u00c3\u009b\u00a9\\\u001f\u0086e\u00a9\u00c5\b\u0098a b`e$\u00cdNt\u00e7\u0017\u00ab\u00e1\u0080\b\u0007\u0091\u008c\u000f\u000eV<^9\u00d7\u009d\u00fb;\u00c7.TV\u00c7i";
                    var8_6 = "\u00ec6\u00ba\u00e3'f\u00f8\u0016_\r\u00cab|QB`\u0099\u001e\u0005\u00b7\u00bbQ\u0013\u00d8R\u00c5l\u00ed\u00cc\u00fa\u00bc\u00d15\u0097\u00ee\u00c0\u00c3\u009b\u00a9\\\u001f\u0086e\u00a9\u00c5\b\u0098a b`e$\u00cdNt\u00e7\u0017\u00ab\u00e1\u0080\b\u0007\u0091\u008c\u000f\u000eV<^9\u00d7\u009d\u00fb;\u00c7.TV\u00c7i".length();
                    var5_7 = 48;
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
                    var9_3[var7_4++] = ff2.a(var10_9).intern();
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
        ff2.b = var9_3;
        ff2.c = new String[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4EE8;
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
                throw new RuntimeException("ff2", exception);
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
            ff2.c[n2] = ff2.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ff2.a(n, l);
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
            throw new RuntimeException("ff2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ff2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

