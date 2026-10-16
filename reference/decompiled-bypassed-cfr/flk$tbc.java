/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Type;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class flk$tbc
implements JsonDeserializer {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public flk deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        long l = a ^ 0x67612DBBE1ABL;
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        hej hej2 = this.e4g(jsonDeserializationContext, jsonObject, (String)((Object)flk$tbc.a("u", (int)30669, (long)(0x2E7121046810547CL ^ l))));
        hej hej3 = this.e4g(jsonDeserializationContext, jsonObject, (String)((Object)flk$tbc.a("u", (int)27702, (long)(0x3B2A950E0946CF83L ^ l))));
        hej hej4 = this.e4g(jsonDeserializationContext, jsonObject, (String)((Object)flk$tbc.a("u", (int)11868, (long)(0x11C8733618D98DECL ^ l))));
        hej hej5 = this.e4g(jsonDeserializationContext, jsonObject, (String)((Object)flk$tbc.a("u", (int)20280, (long)(0x391E9E1B01226C8BL ^ l))));
        hej hej6 = this.e4g(jsonDeserializationContext, jsonObject, (String)((Object)flk$tbc.a("u", (int)27136, (long)(0x6FE005C2FB1B49B2L ^ l))));
        hej hej7 = this.e4g(jsonDeserializationContext, jsonObject, (String)((Object)flk$tbc.a("u", (int)13582, (long)(0x77C19396D3DA96BAL ^ l))));
        return new flk(hej2, hej3, hej4, hej5, hej6, hej7);
    }

    private hej e4g(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, String string) {
        hej hej2;
        block6: {
            block5: {
                Object object;
                block4: {
                    int n = t9d.c();
                    try {
                        try {
                            object = jsonObject;
                            if (n != 0) break block4;
                            if (!object.has(string)) break block5;
                        }
                        catch (oov oov2) {
                            throw flk$tbc.a(oov2);
                        }
                        object = jsonDeserializationContext.deserialize(jsonObject.get(string), hej.class);
                    }
                    catch (oov oov3) {
                        throw flk$tbc.a(oov3);
                    }
                }
                hej2 = (hej)object;
                break block6;
            }
            hej2 = hej.i26;
        }
        return hej2;
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.deserialize(jsonElement, type, jsonDeserializationContext);
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

                flk$tbc.a = c.a(-3829826069813279227L, 8640657788807637739L, MethodHandles.lookup().lookupClass()).a(38261245569075L);
                flk$tbc.d = new HashMap<K, V>(13);
                var0 = flk$tbc.a ^ 33886048635999L;
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
                var6_5 = "\\\u00ec\u00ce\u00fd\u009a\u00a1\u00fb\"p\u00f0\u008b\u008a1\u00a0\u00efD a\"MR\u0099\u0094\u00ee|\u009c+\u00855\u00c8\u00b5c\u009e0\u00e2Ol\u00f0\u00fd\u00be\u0013$\u0081s\n\u0099\u008fL\u00aa\u0010\u00de\u0017\u00d7\u008f\u0019\u0010\u0087\u00deVY[\u0011X\u0096\u009ei\u0010\u0095\u008f\u00aeA\u009f\u008b\u00c0\u0012\u0015\u00cc\u0085\u00f8y\u00f4\u00d7\u00b4";
                var8_6 = "\\\u00ec\u00ce\u00fd\u009a\u00a1\u00fb\"p\u00f0\u008b\u008a1\u00a0\u00efD a\"MR\u0099\u0094\u00ee|\u009c+\u00855\u00c8\u00b5c\u009e0\u00e2Ol\u00f0\u00fd\u00be\u0013$\u0081s\n\u0099\u008fL\u00aa\u0010\u00de\u0017\u00d7\u008f\u0019\u0010\u0087\u00deVY[\u0011X\u0096\u009ei\u0010\u0095\u008f\u00aeA\u009f\u008b\u00c0\u0012\u0015\u00cc\u0085\u00f8y\u00f4\u00d7\u00b4".length();
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
                    var9_3[var7_4++] = flk$tbc.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0081t\u00ab\u00ddw\u00d8\u00f7\u00faS\u00d8\u00b8Z2\u001d\u00c9\u00eb \u00b7~'\u00bd!Xt\u00d4\u00eb\u00f8\u00d1\u0089\u00a9\u00edw\n\u00b1\u00db>\u0087\u00f0.\u008d\u00e9\u00e4zk\u0095xs\u00ce\u00cc";
                    var8_6 = "\u0081t\u00ab\u00ddw\u00d8\u00f7\u00faS\u00d8\u00b8Z2\u001d\u00c9\u00eb \u00b7~'\u00bd!Xt\u00d4\u00eb\u00f8\u00d1\u0089\u00a9\u00edw\n\u00b1\u00db>\u0087\u00f0.\u008d\u00e9\u00e4zk\u0095xs\u00ce\u00cc".length();
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
                    var9_3[var7_4++] = flk$tbc.a(var10_9).intern();
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
        flk$tbc.b = var9_3;
        flk$tbc.c = new String[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4C05;
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
                throw new RuntimeException("flk$tbc", exception);
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
            flk$tbc.c[n2] = flk$tbc.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = flk$tbc.a(n, l);
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
            throw new RuntimeException("flk$tbc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(flk$tbc.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

