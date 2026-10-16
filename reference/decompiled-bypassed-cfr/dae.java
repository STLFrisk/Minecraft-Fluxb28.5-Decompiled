/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.apache.commons.lang3.Validate
 */
import com.google.gson.JsonArray;
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
import org.apache.commons.lang3.Validate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dae
implements JsonDeserializer {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public rv2 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        rv2 rv22;
        block27: {
            rv2 rv23;
            block28: {
                long l = a ^ 0x62E7C8752046L;
                JsonObject jsonObject = f83._yv(jsonElement, (String)((Object)dae.a("y", (int)6401, (long)(0x3C8E295B7DF1B6F1L ^ l))));
                int n = t9d.b();
                rv23 = new rv2();
                rv23.lax(f83.fpy(jsonObject, (String)((Object)dae.a("y", (int)19592, (long)(0x2A29A433DDF0637AL ^ l))), false));
                xdt xdt2 = xdt._ve(f83.sen(jsonObject, (String)((Object)dae.a("y", (int)29182, (long)(0x56A9210317BEDE04L ^ l))), xdt.adu.gv1()));
                int n2 = n;
                try {
                    rv22 = rv23;
                    if (n2 == 0) break block27;
                    rv22.ymz(xdt2);
                    Validate.notNull((Object)((Object)xdt2), (String)((Object)dae.a("y", (int)26939, (long)(0x4BB8DDD6D4B946CFL ^ l))), (Object[])new Object[0]);
                    if (!jsonObject.has((String)((Object)dae.a("y", (int)24281, (long)(0x5183271AFA0BF128L ^ l))))) break block28;
                }
                catch (oov oov2) {
                    throw dae.a(oov2);
                }
                JsonArray jsonArray = f83.k68(jsonObject, (String)((Object)dae.a("y", (int)14651, (long)(0x3F44110EABA996D6L ^ l))));
                for (int i = 0; i < jsonArray.size(); ++i) {
                    boolean bl;
                    rv2$nlt rv2$nlt;
                    block31: {
                        JsonObject jsonObject2;
                        block42: {
                            block43: {
                                int n3;
                                int n4;
                                block44: {
                                    block45: {
                                        block38: {
                                            block39: {
                                                float f;
                                                float f2;
                                                block40: {
                                                    block41: {
                                                        block34: {
                                                            block35: {
                                                                float f3;
                                                                float f4;
                                                                block36: {
                                                                    block37: {
                                                                        block32: {
                                                                            block33: {
                                                                                JsonElement jsonElement2;
                                                                                block29: {
                                                                                    JsonElement jsonElement3 = jsonArray.get(i);
                                                                                    rv2$nlt = new rv2$nlt();
                                                                                    try {
                                                                                        block30: {
                                                                                            try {
                                                                                                try {
                                                                                                    jsonElement2 = jsonElement3;
                                                                                                    if (n2 == 0) break block29;
                                                                                                    if (!f83.ndv(jsonElement2)) break block30;
                                                                                                }
                                                                                                catch (oov oov3) {
                                                                                                    throw dae.a(oov3);
                                                                                                }
                                                                                                rv2$nlt.bpi(f83.o1h(jsonElement3, (String)((Object)dae.a("y", (int)23347, (long)(0x447FA3D1E75774CEL ^ l)))));
                                                                                                if (n2 != 0) break block31;
                                                                                            }
                                                                                            catch (oov oov4) {
                                                                                                throw dae.a(oov4);
                                                                                            }
                                                                                        }
                                                                                        jsonElement2 = jsonElement3;
                                                                                    }
                                                                                    catch (oov oov5) {
                                                                                        throw dae.a(oov5);
                                                                                    }
                                                                                }
                                                                                jsonObject2 = f83._yv(jsonElement2, (String)((Object)dae.a("y", (int)3133, (long)(0x45EED655F1B23C8L ^ l))));
                                                                                try {
                                                                                    rv2$nlt.bpi(f83.sjp(jsonObject2, (String)((Object)dae.a("y", (int)27837, (long)(0x7CC16140E53D4345L ^ l)))));
                                                                                    bl = jsonObject2.has((String)((Object)dae.a("y", (int)17858, (long)(0x4B502A13FDD06A3DL ^ l))));
                                                                                    if (n2 == 0) break block32;
                                                                                    if (!bl) break block33;
                                                                                }
                                                                                catch (oov oov6) {
                                                                                    throw dae.a(oov6);
                                                                                }
                                                                                rv2$nlt$dj6 rv2$nlt$dj6 = rv2$nlt$dj6.r0k(f83.sjp(jsonObject2, (String)((Object)dae.a("y", (int)8869, (long)(0x4B32277737840D4CL ^ l)))));
                                                                                Validate.notNull((Object)((Object)rv2$nlt$dj6), (String)((Object)dae.a("y", (int)7557, (long)(0xC9D13275328B273L ^ l))), (Object[])new Object[0]);
                                                                                rv2$nlt.qed(rv2$nlt$dj6);
                                                                            }
                                                                            bl = jsonObject2.has((String)((Object)dae.a("y", (int)32082, (long)(0x2D197EB3B69CD2ABL ^ l))));
                                                                        }
                                                                        try {
                                                                            if (n2 == 0) break block34;
                                                                            if (!bl) break block35;
                                                                        }
                                                                        catch (oov oov7) {
                                                                            throw dae.a(oov7);
                                                                        }
                                                                        f4 = f83.nfg(jsonObject2, (String)((Object)dae.a("y", (int)3153, (long)(0x3ECFEA8937B223AAL ^ l))));
                                                                        try {
                                                                            float f5 = f4 - 0.0f;
                                                                            f3 = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                                                                            if (n2 == 0) break block36;
                                                                            if (f3 <= 0) break block37;
                                                                        }
                                                                        catch (oov oov8) {
                                                                            throw dae.a(oov8);
                                                                        }
                                                                        f3 = 1.0f;
                                                                        break block36;
                                                                    }
                                                                    f3 = 0.0f;
                                                                }
                                                                Validate.isTrue((boolean)f3, (String)((Object)dae.a("y", (int)10756, (long)(0x9466EE9F35505EFL ^ l))), (Object[])new Object[0]);
                                                                rv2$nlt.fnh(f4);
                                                            }
                                                            bl = jsonObject2.has((String)((Object)dae.a("y", (int)28026, (long)(0x1BEE8CBA7749C290L ^ l))));
                                                        }
                                                        try {
                                                            if (n2 == 0) break block38;
                                                            if (!bl) break block39;
                                                        }
                                                        catch (oov oov9) {
                                                            throw dae.a(oov9);
                                                        }
                                                        f2 = f83.nfg(jsonObject2, (String)((Object)dae.a("y", (int)2855, (long)(0x141F0E91E169A4CFL ^ l))));
                                                        try {
                                                            float f6 = f2 - 0.0f;
                                                            f = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                                                            if (n2 == 0) break block40;
                                                            if (f <= 0) break block41;
                                                        }
                                                        catch (oov oov10) {
                                                            throw dae.a(oov10);
                                                        }
                                                        f = 1.0f;
                                                        break block40;
                                                    }
                                                    f = 0.0f;
                                                }
                                                Validate.isTrue((boolean)f, (String)((Object)dae.a("y", (int)29262, (long)(0xF02B2DA8934DDB0L ^ l))), (Object[])new Object[0]);
                                                rv2$nlt.gp2(f2);
                                            }
                                            bl = jsonObject2.has((String)((Object)dae.a("y", (int)1401, (long)(0x4C06CACD05662A8EL ^ l))));
                                        }
                                        try {
                                            if (n2 == 0) break block42;
                                            if (!bl) break block43;
                                        }
                                        catch (oov oov11) {
                                            throw dae.a(oov11);
                                        }
                                        n4 = f83.z2p(jsonObject2, (String)((Object)dae.a("y", (int)12139, (long)(0x5FE550342CD50087L ^ l))));
                                        try {
                                            n3 = n4;
                                            if (n2 == 0) break block44;
                                            if (n3 <= 0) break block45;
                                        }
                                        catch (oov oov12) {
                                            throw dae.a(oov12);
                                        }
                                        n3 = 1;
                                        break block44;
                                    }
                                    n3 = 0;
                                }
                                Validate.isTrue(n3 != 0, (String)((Object)dae.a("y", (int)260, (long)(0x14D12F42693FAEEAL ^ l))), (Object[])new Object[0]);
                                rv2$nlt.xve(n4);
                            }
                            bl = jsonObject2.has((String)((Object)dae.a("y", (int)28019, (long)(0x1176C4E959A7428FL ^ l))));
                        }
                        try {
                            try {
                                if (n2 == 0) continue;
                                if (!bl) break block31;
                            }
                            catch (oov oov13) {
                                throw dae.a(oov13);
                            }
                            rv2$nlt.rjf(f83.f68(jsonObject2, (String)((Object)dae.a("y", (int)4721, (long)(0x24510D63D4A43D82L ^ l)))));
                        }
                        catch (oov oov14) {
                            throw dae.a(oov14);
                        }
                    }
                    bl = rv23.rvq().add(rv2$nlt);
                    if (n2 != 0) continue;
                }
            }
            rv22 = rv23;
        }
        return rv22;
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

                dae.a = c.a(-3701757572135059943L, 4675276646363131343L, MethodHandles.lookup().lookupClass()).a(108243104950196L);
                dae.d = new HashMap<K, V>(13);
                var0 = dae.a ^ 16112098921351L;
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
                var9_3 = new String[23];
                var7_4 = 0;
                var6_5 = "\u00d7\t\u0010Tfq\u00b7\u00ae\u00c6\u00af\u00f7\u00b5i\u00ea9\u001f\u0010\u00ff{\u001ed\u001a1\u00e5\u008b#\u0001\u00bc\u00d0A\u0097aj \u0085\u00a8\u00bcb\u00e0j\u00aa\u00fdP\u00ab\u00d0aD\u00d4\u0019mt\u0097\u00f6\u00cb\u00f5\u0085\u00a03<@\u001cw\u00f4\u009a\u00ca\u00fc\u0010I\u00ea-\u00e5Z\\\u0007\u00b3 \u0006\u0099|\u00f7\u00b6\u0092\b\u0010h\u00f3\u00a5\u00b1\u00ff,\u00a6\u00c4b\u00d4\u0085\u0011Y\u00a9\u0094\u001a\u0010a\u00d4U#\u00e9\u000fB~\u0016'\u00d3\u00d9\u00bb\u009a\u0014\u0084\u0018\u00a3\u00be\u009b\u00a6\u009d\u000e\u000b\u00d4\u00b4\u008c\u0083\u00ba\u00d8\u00cc\u00e1t\u00a2\u00ee,l\u00dbn\t\"\u0010\u00b1S\u00f4\u00e7\u00b0\u00ac\u0004p\u00e3\u0096nS\u0085\u00ee\u00a6\u00c0\u0010u\u000b8K\u0099\u00ec\u0095\u0010U \u00f3\u0000\u00ac\u0089p\u00b7\u0010\u00e2(+\u00aa <\u0085\u00c9\u00ea\u00c5\u008b\u00c3\u008f\u00a0:\u0000\u0010\u00b0\u0000d\u0082\u00d5\u00bdpE\u00ea\\\u0084\u0017\u00c4\\\u001e&\u0010-\u001c:\u0084>\u00acc;\u00f3\u00a8\u00f1\u00e4\u00e7\u00be'c(\u009f\u0001c\u00ca\u0094(\fdvGQuCD_\u008e\u00aby\u00e2L \"\u0016w$\u0092\u00dd8\u0094wW\u001e\u00b4*GWue\u00a5n\u0010\u00e4\u00b6p\u00ca!u\u00ca\u00b9>\u00c4D\u00fd{\u00a7>t \u0083*,\u0012y\u00a7d\u001ea\u0094M\u00a7\u009e\u00fd\u00b8@\u00e8k\u0085\u008d\u00ac\u00a2\rD\u0005\u00c9\ta\u0082\u00c3\u00a1s\u0010\u0000\u00d0\u0014\u00d2pR \u00e8\u0002\u009c\f\u009c\u00ae\u00fe\u008a\u00cf\u0010j\u00d2`G\u00ecE\u00df\u00cb\u00abH\u00cdj\u009dtX\u00b2\u0010\u00d8*\u00ba\u001c\u008c\u0087pw\u009aV\u00ef%\u00c7\u00c5\u00a9\u00a7\u0010\u00f2\u00d1\u00fci[\u00fa$:\u00cf\u00816\u000f\u00b1\"\u00dbg\u0018Ts\u0087Xw~\u0001$\u009b\u0088\u0098{\u00be\u00ab\u0080\u00e8/\u00b0\u00d9xH\u0004\u0096\u00ad\u0010\u009cW7~W9u\u00a7\u00dd\u009b\u0011\u0095\u00cd-\u00a1\u0018";
                var8_6 = "\u00d7\t\u0010Tfq\u00b7\u00ae\u00c6\u00af\u00f7\u00b5i\u00ea9\u001f\u0010\u00ff{\u001ed\u001a1\u00e5\u008b#\u0001\u00bc\u00d0A\u0097aj \u0085\u00a8\u00bcb\u00e0j\u00aa\u00fdP\u00ab\u00d0aD\u00d4\u0019mt\u0097\u00f6\u00cb\u00f5\u0085\u00a03<@\u001cw\u00f4\u009a\u00ca\u00fc\u0010I\u00ea-\u00e5Z\\\u0007\u00b3 \u0006\u0099|\u00f7\u00b6\u0092\b\u0010h\u00f3\u00a5\u00b1\u00ff,\u00a6\u00c4b\u00d4\u0085\u0011Y\u00a9\u0094\u001a\u0010a\u00d4U#\u00e9\u000fB~\u0016'\u00d3\u00d9\u00bb\u009a\u0014\u0084\u0018\u00a3\u00be\u009b\u00a6\u009d\u000e\u000b\u00d4\u00b4\u008c\u0083\u00ba\u00d8\u00cc\u00e1t\u00a2\u00ee,l\u00dbn\t\"\u0010\u00b1S\u00f4\u00e7\u00b0\u00ac\u0004p\u00e3\u0096nS\u0085\u00ee\u00a6\u00c0\u0010u\u000b8K\u0099\u00ec\u0095\u0010U \u00f3\u0000\u00ac\u0089p\u00b7\u0010\u00e2(+\u00aa <\u0085\u00c9\u00ea\u00c5\u008b\u00c3\u008f\u00a0:\u0000\u0010\u00b0\u0000d\u0082\u00d5\u00bdpE\u00ea\\\u0084\u0017\u00c4\\\u001e&\u0010-\u001c:\u0084>\u00acc;\u00f3\u00a8\u00f1\u00e4\u00e7\u00be'c(\u009f\u0001c\u00ca\u0094(\fdvGQuCD_\u008e\u00aby\u00e2L \"\u0016w$\u0092\u00dd8\u0094wW\u001e\u00b4*GWue\u00a5n\u0010\u00e4\u00b6p\u00ca!u\u00ca\u00b9>\u00c4D\u00fd{\u00a7>t \u0083*,\u0012y\u00a7d\u001ea\u0094M\u00a7\u009e\u00fd\u00b8@\u00e8k\u0085\u008d\u00ac\u00a2\rD\u0005\u00c9\ta\u0082\u00c3\u00a1s\u0010\u0000\u00d0\u0014\u00d2pR \u00e8\u0002\u009c\f\u009c\u00ae\u00fe\u008a\u00cf\u0010j\u00d2`G\u00ecE\u00df\u00cb\u00abH\u00cdj\u009dtX\u00b2\u0010\u00d8*\u00ba\u001c\u008c\u0087pw\u009aV\u00ef%\u00c7\u00c5\u00a9\u00a7\u0010\u00f2\u00d1\u00fci[\u00fa$:\u00cf\u00816\u000f\u00b1\"\u00dbg\u0018Ts\u0087Xw~\u0001$\u009b\u0088\u0098{\u00be\u00ab\u0080\u00e8/\u00b0\u00d9xH\u0004\u0096\u00ad\u0010\u009cW7~W9u\u00a7\u00dd\u009b\u0011\u0095\u00cd-\u00a1\u0018".length();
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
                    var9_3[var7_4++] = dae.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00d8\b\u00f2\u0016nW\u0015\u001a\r\u00c4\u0099\t\u0013\u00f8\u009av \u00c1\u00d4D9\u00b2\u00db'y\r\u00cf\u00b6?\u00c5\u00bf\u00df\u009d\u001d\u00bcp\u00d7\u0085w\u00d9\u00ddH}\f\u001f\u00f1M\u0000|";
                    var8_6 = "\u00d8\b\u00f2\u0016nW\u0015\u001a\r\u00c4\u0099\t\u0013\u00f8\u009av \u00c1\u00d4D9\u00b2\u00db'y\r\u00cf\u00b6?\u00c5\u00bf\u00df\u009d\u001d\u00bcp\u00d7\u0085w\u00d9\u00ddH}\f\u001f\u00f1M\u0000|".length();
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
                    var9_3[var7_4++] = dae.a(var10_9).intern();
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
        dae.b = var9_3;
        dae.c = new String[23];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1A3D;
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
                throw new RuntimeException("dae", exception);
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
            dae.c[n2] = dae.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dae.a(n, l);
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
            throw new RuntimeException("dae" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dae.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

