/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class b06
extends zc4 {
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public b06(GameProfile gameProfile) {
        this(gameProfile, (Date)null, (String)null, (Date)null, (String)null);
    }

    public b06(GameProfile gameProfile, Date date, String string, Date date2, String string2) {
        super(gameProfile, date2, string, date2, string2);
    }

    public b06(JsonObject jsonObject) {
        super(b06.nvm(jsonObject), jsonObject);
    }

    @Override
    public void jqb(JsonObject jsonObject) {
        block6: {
            String string;
            CallSite callSite;
            JsonObject jsonObject2;
            long l;
            block9: {
                UUID uUID;
                block7: {
                    block8: {
                        l = a ^ 0x549013B89EFEL;
                        int n = t9d.b();
                        try {
                            try {
                                try {
                                    if (this.gma() == null) break block6;
                                    jsonObject2 = jsonObject;
                                    callSite = b06.b("f", (int)1778, (long)(0x700C214E1DB3BF35L ^ l));
                                    uUID = ((GameProfile)this.gma()).getId();
                                    if (n == 0) break block7;
                                }
                                catch (oov oov2) {
                                    throw b06.a(oov2);
                                }
                                if (uUID != null) break block8;
                            }
                            catch (oov oov3) {
                                throw b06.a(oov3);
                            }
                            string = "";
                            break block9;
                        }
                        catch (oov oov4) {
                            throw b06.a(oov4);
                        }
                    }
                    uUID = ((GameProfile)this.gma()).getId();
                }
                string = uUID.toString();
            }
            jsonObject2.addProperty((String)((Object)callSite), string);
            jsonObject.addProperty((String)((Object)b06.b("f", (int)12157, (long)(0x4C1A324E5396B8L ^ l))), ((GameProfile)this.gma()).getName());
            super.jqb(jsonObject);
        }
    }

    /*
     * Loose catch block
     */
    private static GameProfile nvm(JsonObject jsonObject) {
        block11: {
            UUID uUID;
            CallSite callSite;
            JsonObject jsonObject2;
            long l;
            block12: {
                boolean bl;
                block10: {
                    int n;
                    block13: {
                        l = a ^ 0x52A9254C6A49L;
                        n = t9d.b();
                        bl = jsonObject.has((String)((Object)b06.b("f", (int)24752, (long)(0x469289FCA94D2DC3L ^ l))));
                        if (n == 0) break block10;
                        if (!bl) break block11;
                        break block13;
                        catch (Throwable throwable) {
                            throw b06.a(throwable);
                        }
                    }
                    try {
                        block14: {
                            jsonObject2 = jsonObject;
                            callSite = b06.b("f", (int)24842, (long)(0x4C0C52EE02322C7BL ^ l));
                            if (n == 0) break block12;
                            break block14;
                            catch (Throwable throwable) {
                                throw b06.a(throwable);
                            }
                        }
                        bl = jsonObject2.has((String)((Object)callSite));
                    }
                    catch (Throwable throwable) {
                        throw b06.a(throwable);
                    }
                }
                try {
                    if (!bl) break block11;
                    jsonObject2 = jsonObject;
                    callSite = b06.b("f", (int)24752, (long)(0x469289FCA94D2DC3L ^ l));
                }
                catch (Throwable throwable) {
                    throw b06.a(throwable);
                }
            }
            String string = jsonObject2.get((String)((Object)callSite)).getAsString();
            try {
                uUID = UUID.fromString(string);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new GameProfile(uUID, jsonObject.get((String)((Object)b06.b("f", (int)24842, (long)(0x4C0C52EE02322C7BL ^ l)))).getAsString());
        }
        return null;
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

                b06.a = c.a(7919198544223145133L, -8083794540903145200L, MethodHandles.lookup().lookupClass()).a(198777468153016L);
                b06.h = new HashMap<K, V>(13);
                var0 = b06.a ^ 53137057657692L;
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
                var6_5 = "\u00f3\u00c5\u0089h\u00ac3\u0087\u0084\u0094\u009ba\u0082^\u00e6Kd\u0010\u00af\u00b0#\u00da(\u00809\u00f7\u0081\u00f2\"\u00f9\u00a3\u00eflN";
                var8_6 = "\u00f3\u00c5\u0089h\u00ac3\u0087\u0084\u0094\u009ba\u0082^\u00e6Kd\u0010\u00af\u00b0#\u00da(\u00809\u00f7\u0081\u00f2\"\u00f9\u00a3\u00eflN".length();
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
                    var9_3[var7_4++] = b06.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00cf\u008c\u00cc\u00cbT\u0086\u001a\u009f\u00b1U\u001a\u00fc\u009aA\f\u0015\u0010\u00de7I\r\u00c7\u007f\u00e7k>X\u00ac\u00b7J%\u00a3\u00d3";
                    var8_6 = "\u00cf\u008c\u00cc\u00cbT\u0086\u001a\u009f\u00b1U\u001a\u00fc\u009aA\f\u0015\u0010\u00de7I\r\u00c7\u007f\u00e7k>X\u00ac\u00b7J%\u00a3\u00d3".length();
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
                    var9_3[var7_4++] = b06.b(var10_9).intern();
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
        b06.f = var9_3;
        b06.g = new String[4];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7C8A;
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
                throw new RuntimeException("b06", exception);
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
            b06.g[n2] = b06.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b06.b(n, l);
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
            throw new RuntimeException("b06" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b06.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

