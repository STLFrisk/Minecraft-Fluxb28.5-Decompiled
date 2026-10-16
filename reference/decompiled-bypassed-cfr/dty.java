/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.Validate
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
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
import org.apache.commons.lang3.Validate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dty
extends _6f {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public vsv deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        float[] fArray;
        float[] fArray2;
        float[] fArray3;
        block23: {
            int n;
            JsonObject jsonObject;
            float f;
            float f2;
            float f3;
            int n2;
            long l;
            block25: {
                int n3;
                block26: {
                    CallSite callSite;
                    JsonObject jsonObject2;
                    block27: {
                        block28: {
                            CallSite callSite2;
                            JsonObject jsonObject3;
                            block24: {
                                boolean bl;
                                JsonObject jsonObject4;
                                block22: {
                                    l = a ^ 0x394A5E0BC6DL;
                                    jsonObject4 = jsonElement.getAsJsonObject();
                                    fArray3 = new float[256];
                                    n2 = t9d.c();
                                    fArray2 = new float[256];
                                    fArray = new float[256];
                                    f3 = 1.0f;
                                    f2 = 0.0f;
                                    f = 0.0f;
                                    try {
                                        try {
                                            try {
                                                bl = jsonObject4.has((String)((Object)dty.a("o", (int)3158, (long)(0x2BA4E76C29135455L ^ l))));
                                                if (n2 != 0) break block22;
                                                if (!bl) break block23;
                                            }
                                            catch (JsonParseException jsonParseException) {
                                                throw dty.a(jsonParseException);
                                            }
                                            jsonObject3 = jsonObject4;
                                            callSite2 = dty.a("o", (int)22901, (long)(0x71D6AB9BF6E48172L ^ l));
                                            if (n2 != 0) break block24;
                                        }
                                        catch (JsonParseException jsonParseException) {
                                            throw dty.a(jsonParseException);
                                        }
                                        bl = jsonObject3.get((String)((Object)callSite2)).isJsonObject();
                                    }
                                    catch (JsonParseException jsonParseException) {
                                        throw dty.a(jsonParseException);
                                    }
                                }
                                try {
                                    if (!bl) {
                                        throw new JsonParseException((String)((Object)dty.a("o", (int)14111, (long)(0x37CC92F27C12EF16L ^ l))) + jsonObject4.get((String)((Object)dty.a("o", (int)22901, (long)(0x71D6AB9BF6E48172L ^ l)))));
                                    }
                                }
                                catch (JsonParseException jsonParseException) {
                                    throw dty.a(jsonParseException);
                                }
                                jsonObject3 = jsonObject4;
                                callSite2 = dty.a("o", (int)22901, (long)(0x71D6AB9BF6E48172L ^ l));
                            }
                            jsonObject = jsonObject3.getAsJsonObject((String)((Object)callSite2));
                            try {
                                try {
                                    try {
                                        try {
                                            n3 = jsonObject.has((String)((Object)dty.a("o", (int)6167, (long)(0x20B276908F9B4000L ^ l))));
                                            if (n2 != 0) break block25;
                                            if (n3 == 0) break block26;
                                        }
                                        catch (JsonParseException jsonParseException) {
                                            throw dty.a(jsonParseException);
                                        }
                                        jsonObject2 = jsonObject;
                                        callSite = dty.a("o", (int)12823, (long)(0x6B3FEA60FB106A12L ^ l));
                                        if (n2 != 0) break block27;
                                    }
                                    catch (JsonParseException jsonParseException) {
                                        throw dty.a(jsonParseException);
                                    }
                                    if (!jsonObject2.get((String)((Object)callSite)).isJsonObject()) {
                                    }
                                    break block28;
                                }
                                catch (JsonParseException jsonParseException) {
                                    throw dty.a(jsonParseException);
                                }
                                throw new JsonParseException((String)((Object)dty.a("o", (int)25427, (long)(0x6FB04A09E982BB59L ^ l))) + jsonObject.get((String)((Object)dty.a("o", (int)12823, (long)(0x6B3FEA60FB106A12L ^ l)))));
                            }
                            catch (JsonParseException jsonParseException) {
                                throw dty.a(jsonParseException);
                            }
                        }
                        jsonObject2 = jsonObject;
                        callSite = dty.a("o", (int)12823, (long)(0x6B3FEA60FB106A12L ^ l));
                    }
                    JsonObject jsonObject5 = jsonObject2.getAsJsonObject((String)((Object)callSite));
                    f3 = f83.abs(jsonObject5, (String)((Object)dty.a("o", (int)32763, (long)(0x14BDEB0B74DEA7F7L ^ l))), f3);
                    Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f3, (String)((Object)dty.a("o", (int)11605, (long)(0x251B7EDD035CF543L ^ l))));
                    f2 = f83.abs(jsonObject5, (String)((Object)dty.a("o", (int)15082, (long)(0x775E6206D75DE2ECL ^ l))), f2);
                    Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f2, (String)((Object)dty.a("o", (int)16006, (long)(0x79326F1B48306682L ^ l))));
                    f = f83.abs(jsonObject5, (String)((Object)dty.a("o", (int)24477, (long)(0x673C4EBB3A1B079DL ^ l))), f2);
                    Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f, (String)((Object)dty.a("o", (int)26079, (long)(0x60F0D948895EBDD1L ^ l))));
                }
                n3 = n = 0;
            }
            while (n < 256) {
                block29: {
                    float f4;
                    float f5;
                    float f6;
                    block30: {
                        JsonElement jsonElement2 = jsonObject.get(Integer.toString(n));
                        f6 = f3;
                        f5 = f2;
                        f4 = f;
                        try {
                            if (n2 != 0) break block29;
                            if (jsonElement2 != null) {
                            }
                            break block30;
                        }
                        catch (JsonParseException jsonParseException) {
                            throw dty.a(jsonParseException);
                        }
                        JsonObject jsonObject6 = f83._yv(jsonElement2, (String)((Object)dty.a("o", (int)22281, (long)(0x7A9D915A20290F06L ^ l))) + n + "]");
                        f6 = f83.abs(jsonObject6, (String)((Object)dty.a("o", (int)10551, (long)(0x32AAC9B1D6BAF13AL ^ l))), f3);
                        Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f6, (String)((Object)dty.a("o", (int)17868, (long)(0x265F1B55B9FC1DD8L ^ l))));
                        f5 = f83.abs(jsonObject6, (String)((Object)dty.a("o", (int)31305, (long)(0x4EF12F31325D224BL ^ l))), f2);
                        Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f5, (String)((Object)dty.a("o", (int)9311, (long)(0x1F10A837813D7C57L ^ l))));
                        f4 = f83.abs(jsonObject6, (String)((Object)dty.a("o", (int)22722, (long)(0x7E3822C6684A80D7L ^ l))), f);
                        Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f4, (String)((Object)dty.a("o", (int)10622, (long)(0x33D8FAD699E8F17FL ^ l))));
                    }
                    fArray3[n] = f6;
                    fArray2[n] = f5;
                    fArray[n] = f4;
                    ++n;
                }
                if (n2 == 0) continue;
            }
        }
        return new vsv(fArray3, fArray, fArray2);
    }

    @Override
    public String xtu() {
        long l = a ^ 0x7CC3E4FE1029L;
        return dty.a("o", (int)31466, (long)(0x27AF742C974D0EA5L ^ l));
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

                dty.a = c.a(2449202361619683163L, -8716678080183704370L, MethodHandles.lookup().lookupClass()).a(241579261121127L);
                dty.d = new HashMap<K, V>(13);
                var0 = dty.a ^ 39082038647935L;
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
                var9_3 = new String[20];
                var7_4 = 0;
                var6_5 = "\\\u00fe\u0092I\u00b3`\u00ccJkmK\u00e7\u0095\u0001\u001c\u009av%-\t\u0005\u00b8\u0001\u009d\u00eb\u0006;K\u008b\u00e4\u0012;\u0010\u0006h\u00ff\u0013\u00ad\n\u00fc\u00b0\u0091\u0083\u00cf\\\u00d5\u00b5\u00e3\u007f\u0010R\u0000W\u0081\u0011\u008a\u00ed\u00ee\\\u00b5\u00c8fa\u00ea\u00e8\b(\u00b7q\u00c39H\u00dd\u00c5g\u00fe\u00d2\u00a8\u0003\u00d9p\u00a4\u00f9 \nL~\u0089\u00c4\u001e\u00dd\u00c4\u00e3\u00db\u0085\u00d9\u00aa@uLfgS\u00daF\u00880 \u00ba\u008e\u00b3\u008e%\t\u00b7'2m\u00f3\u00c2\u008b\u0098)\u00dcS\u00ad\u00c8\u00c3\u00d4vBvv\u00fc\t\u00a3N\u00b4\u008a\u00cc\u0010\u008fc\u0006\u0082\u00c4p\u00b1~f\u0014A\u00fb\u00de\u00dc\u0004\u00cd\u0018\u00f0@KtDv\fb\u00e9\u00d2^a\u00b5.\u00b3\u00bc\u0096\u0091n\u00b2'\u0093\u00a8?\u0010K\u00df-@\u001b\u00ecwT}M\u00e4\u00e5\u009cY\u00c4\u008a i\u00b2\u0085\u00f7|\u00f8~w\u000e4\u00d5j\u00ff#\u0080.r;X\u00cb\u0012r\u00fa\u00a2M\u0096Ns\u00ad\u00d6\u0011}(j)?\u00c2_g\u00b2\u00db\u0084\u008c\u0088n\u009c\u0083!p\u0084\u0012\u00d6\u00ce3\u0019\u0000\u0002\u00a2\u0093\rp}\u0012'\u00e6\u0082N,\u00c0k\u0097\u0012\u0092\u0010\u00899\u00c5N9\u008f\u00b4\u000e\u000fE\u00de0\u00a1e\u00d7_\u0010W\u00d7\u00e5\u00b0\u00c1Up!\u00ea\u00b4\u00c5k\u001e\u001e\u00e5\u0081\u0010\u00d3\u0087\u001f\u00d0Zx\u001e B\u0001y\u009a8\u0084U\u009aha\u00b7\u00deuL\u0080Gr&a9.\u000el\u0094\u0080l\u0006\u001a\u001f\u0011%N}\u0089\u0094=\u0012=\u0081\u00a9\u00f7}\u00a2%\r\u0014\u00da\u00ef\u0092\u00b1\u00ca\u00a5\u00fe\u00c7\u00ac\u00f3(\u009bD\u00b1}M\tnY,\u0019\u00bd^d\u008d\u008d\t6\u001d\u0097\u00bf\u00a1\u00d4_\u00a6Q\u00d8\u00b3\u00fc\u00d4n\u00c4\u00ff^\u0003\u00ff\u0090\u00ec\u0017#\u00a8k\u008d\u00b53\u00fdY\u00bf\u0089C\u00d9\u00d7#,\f\n\u00baH\u001f\u00e3\u0097\u00ccO\u00b2\u008b\u00a5\u0099QN\u0005R.>=&G\u0095\u00b8L\u0010\u0007g0h\u00c4\u00fb\u00e4W\u00e5%\u00aa\u00e7\u00d1\u00e4_p\u00bc\u00b4\u0006K\u00e5\u00f3*\u00c4\"<\u0087\u00d8\u00d95\u00dc\u00e5*\u00d3\u00ac\u00cedW\u00bd.=P5&\u00f4\u00d5:{]\u008f \u00f3\u008cGB\u0004\u001c\u00f6\u00e8u|c\u00aa\u009b\f\u00c4\u0080\u00a9\u0011l7p\u00b3\\\u00bcRPWdG\u00e7\u0082\u00c9\u0010\u00a6\u00e5\u00da\u001az\u0007\u00c3\u00c4\u00fb5(\u00f0C\u00d6\u00f1\u00c6(\\C\u0000\u00ac\u00eduH\u00c6J;J\u0016\u00f5f\u00f7\u00b1\u008cC,l\u00f2\u008a\u00dd\u00db\u007f\u008f0\u00c3O+\u0010:\u00f2\u0099Ow\u00f9\u00e7\u009c\u0084";
                var8_6 = "\\\u00fe\u0092I\u00b3`\u00ccJkmK\u00e7\u0095\u0001\u001c\u009av%-\t\u0005\u00b8\u0001\u009d\u00eb\u0006;K\u008b\u00e4\u0012;\u0010\u0006h\u00ff\u0013\u00ad\n\u00fc\u00b0\u0091\u0083\u00cf\\\u00d5\u00b5\u00e3\u007f\u0010R\u0000W\u0081\u0011\u008a\u00ed\u00ee\\\u00b5\u00c8fa\u00ea\u00e8\b(\u00b7q\u00c39H\u00dd\u00c5g\u00fe\u00d2\u00a8\u0003\u00d9p\u00a4\u00f9 \nL~\u0089\u00c4\u001e\u00dd\u00c4\u00e3\u00db\u0085\u00d9\u00aa@uLfgS\u00daF\u00880 \u00ba\u008e\u00b3\u008e%\t\u00b7'2m\u00f3\u00c2\u008b\u0098)\u00dcS\u00ad\u00c8\u00c3\u00d4vBvv\u00fc\t\u00a3N\u00b4\u008a\u00cc\u0010\u008fc\u0006\u0082\u00c4p\u00b1~f\u0014A\u00fb\u00de\u00dc\u0004\u00cd\u0018\u00f0@KtDv\fb\u00e9\u00d2^a\u00b5.\u00b3\u00bc\u0096\u0091n\u00b2'\u0093\u00a8?\u0010K\u00df-@\u001b\u00ecwT}M\u00e4\u00e5\u009cY\u00c4\u008a i\u00b2\u0085\u00f7|\u00f8~w\u000e4\u00d5j\u00ff#\u0080.r;X\u00cb\u0012r\u00fa\u00a2M\u0096Ns\u00ad\u00d6\u0011}(j)?\u00c2_g\u00b2\u00db\u0084\u008c\u0088n\u009c\u0083!p\u0084\u0012\u00d6\u00ce3\u0019\u0000\u0002\u00a2\u0093\rp}\u0012'\u00e6\u0082N,\u00c0k\u0097\u0012\u0092\u0010\u00899\u00c5N9\u008f\u00b4\u000e\u000fE\u00de0\u00a1e\u00d7_\u0010W\u00d7\u00e5\u00b0\u00c1Up!\u00ea\u00b4\u00c5k\u001e\u001e\u00e5\u0081\u0010\u00d3\u0087\u001f\u00d0Zx\u001e B\u0001y\u009a8\u0084U\u009aha\u00b7\u00deuL\u0080Gr&a9.\u000el\u0094\u0080l\u0006\u001a\u001f\u0011%N}\u0089\u0094=\u0012=\u0081\u00a9\u00f7}\u00a2%\r\u0014\u00da\u00ef\u0092\u00b1\u00ca\u00a5\u00fe\u00c7\u00ac\u00f3(\u009bD\u00b1}M\tnY,\u0019\u00bd^d\u008d\u008d\t6\u001d\u0097\u00bf\u00a1\u00d4_\u00a6Q\u00d8\u00b3\u00fc\u00d4n\u00c4\u00ff^\u0003\u00ff\u0090\u00ec\u0017#\u00a8k\u008d\u00b53\u00fdY\u00bf\u0089C\u00d9\u00d7#,\f\n\u00baH\u001f\u00e3\u0097\u00ccO\u00b2\u008b\u00a5\u0099QN\u0005R.>=&G\u0095\u00b8L\u0010\u0007g0h\u00c4\u00fb\u00e4W\u00e5%\u00aa\u00e7\u00d1\u00e4_p\u00bc\u00b4\u0006K\u00e5\u00f3*\u00c4\"<\u0087\u00d8\u00d95\u00dc\u00e5*\u00d3\u00ac\u00cedW\u00bd.=P5&\u00f4\u00d5:{]\u008f \u00f3\u008cGB\u0004\u001c\u00f6\u00e8u|c\u00aa\u009b\f\u00c4\u0080\u00a9\u0011l7p\u00b3\\\u00bcRPWdG\u00e7\u0082\u00c9\u0010\u00a6\u00e5\u00da\u001az\u0007\u00c3\u00c4\u00fb5(\u00f0C\u00d6\u00f1\u00c6(\\C\u0000\u00ac\u00eduH\u00c6J;J\u0016\u00f5f\u00f7\u00b1\u008cC,l\u00f2\u008a\u00dd\u00db\u007f\u008f0\u00c3O+\u0010:\u00f2\u0099Ow\u00f9\u00e7\u009c\u0084".length();
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
                    var9_3[var7_4++] = dty.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u009a\u0001\u00d45\u00c0\u0086\u009c\u00bc\u0090vW\u00ac\u001d0\u00df< u\u000b\u009c\u00b8\u0018\u009ca\u00c9\u00e1\u00d8a\u00e4\u0096\u00b4\u0093\u0096[R\u00da\u00c1\u00ab1\b\u00a5\u00c4\u008b\u0003\u00d6b\u00ce\u00bcR";
                    var8_6 = "\u009a\u0001\u00d45\u00c0\u0086\u009c\u00bc\u0090vW\u00ac\u001d0\u00df< u\u000b\u009c\u00b8\u0018\u009ca\u00c9\u00e1\u00d8a\u00e4\u0096\u00b4\u0093\u0096[R\u00da\u00c1\u00ab1\b\u00a5\u00c4\u008b\u0003\u00d6b\u00ce\u00bcR".length();
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
                    var9_3[var7_4++] = dty.a(var10_9).intern();
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
        dty.b = var9_3;
        dty.c = new String[20];
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x746B;
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
                throw new RuntimeException("dty", exception);
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
            dty.c[n2] = dty.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dty.a(n, l);
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
            throw new RuntimeException("dty" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dty.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

