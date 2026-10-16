/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSyntaxException
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
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
import org.apache.commons.lang3.StringUtils;

public class f83 {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public static boolean g_w(JsonObject jsonObject, String string) {
        boolean bl;
        block6: {
            String string2;
            JsonObject jsonObject2;
            block4: {
                block5: {
                    int n = t9d.b();
                    try {
                        try {
                            jsonObject2 = jsonObject;
                            string2 = string;
                            if (n == 0) break block4;
                            if (f83.hih(jsonObject2, string2)) break block5;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        bl = false;
                        break block6;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                jsonObject2 = jsonObject;
                string2 = string;
            }
            bl = jsonObject2.getAsJsonPrimitive(string2).isString();
        }
        return bl;
    }

    public static boolean ndv(JsonElement jsonElement) {
        boolean bl;
        block6: {
            JsonElement jsonElement2;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            jsonElement2 = jsonElement;
                            if (n != 0) break block4;
                            if (jsonElement2.isJsonPrimitive()) break block5;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        bl = false;
                        break block6;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                jsonElement2 = jsonElement;
            }
            bl = jsonElement2.getAsJsonPrimitive().isString();
        }
        return bl;
    }

    public static boolean re2(JsonObject jsonObject, String string) {
        boolean bl;
        block6: {
            String string2;
            JsonObject jsonObject2;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            jsonObject2 = jsonObject;
                            string2 = string;
                            if (n != 0) break block4;
                            if (f83.hih(jsonObject2, string2)) break block5;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        bl = false;
                        break block6;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                jsonObject2 = jsonObject;
                string2 = string;
            }
            bl = jsonObject2.getAsJsonPrimitive(string2).isBoolean();
        }
        return bl;
    }

    public static boolean yrq(JsonObject jsonObject, String string) {
        boolean bl;
        block6: {
            String string2;
            JsonObject jsonObject2;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            jsonObject2 = jsonObject;
                            string2 = string;
                            if (n != 0) break block4;
                            if (f83.x48(jsonObject2, string2)) break block5;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        bl = false;
                        break block6;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                jsonObject2 = jsonObject;
                string2 = string;
            }
            bl = jsonObject2.get(string2).isJsonArray();
        }
        return bl;
    }

    public static boolean hih(JsonObject jsonObject, String string) {
        boolean bl;
        block6: {
            String string2;
            JsonObject jsonObject2;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            jsonObject2 = jsonObject;
                            string2 = string;
                            if (n != 0) break block4;
                            if (f83.x48(jsonObject2, string2)) break block5;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        bl = false;
                        break block6;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                jsonObject2 = jsonObject;
                string2 = string;
            }
            bl = jsonObject2.get(string2).isJsonPrimitive();
        }
        return bl;
    }

    public static boolean x48(JsonObject jsonObject, String string) {
        boolean bl;
        block8: {
            JsonObject jsonObject2;
            block6: {
                block7: {
                    int n = t9d.b();
                    try {
                        try {
                            jsonObject2 = jsonObject;
                            if (n == 0) break block6;
                            if (jsonObject2 != null) break block7;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        bl = false;
                        break block8;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                jsonObject2 = jsonObject.get(string);
            }
            try {
                bl = jsonObject2 != null;
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                throw f83.a(jsonSyntaxException);
            }
        }
        return bl;
    }

    public static String o1h(JsonElement jsonElement, String string) {
        long l;
        block5: {
            JsonElement jsonElement2;
            block4: {
                l = a ^ 0xE2749AE1C2L;
                int n = t9d.c();
                try {
                    try {
                        jsonElement2 = jsonElement;
                        if (n != 0) break block4;
                        if (!jsonElement2.isJsonPrimitive()) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    jsonElement2 = jsonElement;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            return jsonElement2.getAsString();
        }
        throw new JsonSyntaxException((String)((Object)f83.a("r", (int)468, (long)(0x454DDC5C29EFF5F0L ^ l))) + string + (String)((Object)f83.a("r", (int)25209, (long)(0x2580C70F4BA11653L ^ l))) + f83.dyg(jsonElement));
    }

    public static String sjp(JsonObject jsonObject, String string) {
        long l;
        block5: {
            String string2;
            JsonObject jsonObject2;
            block4: {
                l = a ^ 0x1E0129BE7A9EL;
                int n = t9d.b();
                try {
                    try {
                        jsonObject2 = jsonObject;
                        string2 = string;
                        if (n == 0) break block4;
                        if (!jsonObject2.has(string2)) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    jsonObject2 = jsonObject.get(string);
                    string2 = string;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            return f83.o1h((JsonElement)jsonObject2, string2);
        }
        throw new JsonSyntaxException((String)((Object)f83.a("r", (int)25208, (long)(0x4270BB429E498D11L ^ l))) + string + (String)((Object)f83.a("r", (int)29097, (long)(0x32A5C63CB3279EDBL ^ l))));
    }

    public static String sen(JsonObject jsonObject, String string, String string2) {
        String string3;
        block6: {
            block5: {
                String string4;
                JsonObject jsonObject2;
                block4: {
                    int n = t9d.c();
                    try {
                        try {
                            jsonObject2 = jsonObject;
                            string4 = string;
                            if (n != 0) break block4;
                            if (!jsonObject2.has(string4)) break block5;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        jsonObject2 = jsonObject.get(string);
                        string4 = string;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                string3 = f83.o1h((JsonElement)jsonObject2, string4);
                break block6;
            }
            string3 = string2;
        }
        return string3;
    }

    public static boolean wfb(JsonElement jsonElement, String string) {
        long l;
        block5: {
            boolean bl;
            block4: {
                l = a ^ 0x4E4905F8847EL;
                int n = t9d.c();
                try {
                    try {
                        bl = jsonElement.isJsonPrimitive();
                        if (n != 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    bl = jsonElement.getAsBoolean();
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            return bl;
        }
        throw new JsonSyntaxException((String)((Object)f83.a("r", (int)30739, (long)(0x65355B373B19E984L ^ l))) + string + (String)((Object)f83.a("r", (int)18560, (long)(0x6AA13367CCE6591FL ^ l))) + f83.dyg(jsonElement));
    }

    public static boolean f68(JsonObject jsonObject, String string) {
        long l;
        block5: {
            boolean bl;
            block4: {
                l = a ^ 0x12EED052ECEBL;
                int n = t9d.c();
                try {
                    try {
                        bl = jsonObject.has(string);
                        if (n != 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    bl = f83.wfb(jsonObject.get(string), string);
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            return bl;
        }
        throw new JsonSyntaxException((String)((Object)f83.a("r", (int)25208, (long)(0x4270B7AD67A51B64L ^ l))) + string + (String)((Object)f83.a("r", (int)20983, (long)(0x226F7D8A8400A8F9L ^ l))));
    }

    public static boolean fpy(JsonObject jsonObject, String string, boolean bl) {
        boolean bl2;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        bl2 = jsonObject.has(string);
                        if (n != 0) break block4;
                        if (!bl2) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    bl2 = f83.wfb(jsonObject.get(string), string);
                    break block4;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            bl2 = bl;
        }
        return bl2;
    }

    public static float f_y(JsonElement jsonElement, String string) {
        long l;
        block9: {
            JsonElement jsonElement2;
            block10: {
                boolean bl;
                block8: {
                    l = a ^ 0x3D943B6AACA6L;
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                bl = jsonElement.isJsonPrimitive();
                                if (n != 0) break block8;
                                if (!bl) break block9;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw f83.a(jsonSyntaxException);
                            }
                            jsonElement2 = jsonElement.getAsJsonPrimitive();
                            if (n != 0) break block10;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        bl = jsonElement2.isNumber();
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                if (!bl) break block9;
                jsonElement2 = jsonElement;
            }
            return jsonElement2.getAsFloat();
        }
        throw new JsonSyntaxException((String)((Object)f83.a("r", (int)30739, (long)(0x653528EA058BC15CL ^ l))) + string + (String)((Object)f83.a("r", (int)16925, (long)(0x18D20006712B7B4AL ^ l))) + f83.dyg(jsonElement));
    }

    public static float nfg(JsonObject jsonObject, String string) {
        long l;
        block5: {
            String string2;
            JsonObject jsonObject2;
            block4: {
                l = a ^ 0x1CBC8CCA94DAL;
                int n = t9d.c();
                try {
                    try {
                        jsonObject2 = jsonObject;
                        string2 = string;
                        if (n != 0) break block4;
                        if (!jsonObject2.has(string2)) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    jsonObject2 = jsonObject.get(string);
                    string2 = string;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            return f83.f_y((JsonElement)jsonObject2, string2);
        }
        throw new JsonSyntaxException((String)((Object)f83.a("r", (int)25208, (long)(0x4270B9FF3B3D6355L ^ l))) + string + (String)((Object)f83.a("r", (int)32515, (long)(0x3974027E7FE67E39L ^ l))));
    }

    public static float abs(JsonObject jsonObject, String string, float f) {
        float f2;
        block6: {
            block5: {
                String string2;
                JsonObject jsonObject2;
                block4: {
                    int n = t9d.c();
                    try {
                        try {
                            jsonObject2 = jsonObject;
                            string2 = string;
                            if (n != 0) break block4;
                            if (!jsonObject2.has(string2)) break block5;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        jsonObject2 = jsonObject.get(string);
                        string2 = string;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                f2 = f83.f_y((JsonElement)jsonObject2, string2);
                break block6;
            }
            f2 = f;
        }
        return f2;
    }

    public static int cr2(JsonElement jsonElement, String string) {
        long l;
        block9: {
            int n;
            block10: {
                int n2;
                block8: {
                    l = a ^ 0x26B65F9AEA4DL;
                    n2 = t9d.b();
                    try {
                        try {
                            n = jsonElement.isJsonPrimitive();
                            if (n2 == 0) break block8;
                            if (n == 0) break block9;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        n = jsonElement.getAsJsonPrimitive().isNumber();
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                try {
                    try {
                        if (n2 == 0) break block10;
                        if (n == 0) break block9;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    n = jsonElement.getAsInt();
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            return n;
        }
        throw new JsonSyntaxException((String)((Object)f83.a("r", (int)30739, (long)(0x653533C8617B87B7L ^ l))) + string + (String)((Object)f83.a("r", (int)5425, (long)(0x3C385A74EE976A9FL ^ l))) + f83.dyg(jsonElement));
    }

    public static int z2p(JsonObject jsonObject, String string) {
        long l;
        block5: {
            int n;
            block4: {
                l = a ^ 0x2B0BEA764B0CL;
                int n2 = t9d.b();
                try {
                    try {
                        n = jsonObject.has(string);
                        if (n2 == 0) break block4;
                        if (n == 0) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    n = f83.cr2(jsonObject.get(string), string);
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            return n;
        }
        throw new JsonSyntaxException((String)((Object)f83.a("r", (int)4631, (long)(0x77430A0D37414CF9L ^ l))) + string + (String)((Object)f83.a("r", (int)22862, (long)(0x36A8B1331ACC87A8L ^ l))));
    }

    public static int wt9(JsonObject jsonObject, String string, int n) {
        int n2;
        block4: {
            block5: {
                int n3 = t9d.b();
                try {
                    try {
                        n2 = jsonObject.has(string);
                        if (n3 == 0) break block4;
                        if (n2 == 0) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    n2 = f83.cr2(jsonObject.get(string), string);
                    break block4;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            n2 = n;
        }
        return n2;
    }

    public static JsonObject _yv(JsonElement jsonElement, String string) {
        long l;
        block5: {
            JsonElement jsonElement2;
            block4: {
                l = a ^ 0x3983955D17C3L;
                int n = t9d.b();
                try {
                    try {
                        jsonElement2 = jsonElement;
                        if (n == 0) break block4;
                        if (!jsonElement2.isJsonObject()) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    jsonElement2 = jsonElement;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            return jsonElement2.getAsJsonObject();
        }
        throw new JsonSyntaxException((String)((Object)f83.a("r", (int)30739, (long)(0x65352CFDABBC7A39L ^ l))) + string + (String)((Object)f83.a("r", (int)12900, (long)(0x25DD3E209EDC304CL ^ l))) + f83.dyg(jsonElement));
    }

    public static JsonObject lhy(JsonObject jsonObject, String string) {
        long l;
        block5: {
            String string2;
            JsonObject jsonObject2;
            block4: {
                l = a ^ 0x6C0EC669BE67L;
                int n = t9d.c();
                try {
                    try {
                        jsonObject2 = jsonObject;
                        string2 = string;
                        if (n != 0) break block4;
                        if (!jsonObject2.has(string2)) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    jsonObject2 = jsonObject.get(string);
                    string2 = string;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            return f83._yv((JsonElement)jsonObject2, string2);
        }
        throw new JsonSyntaxException((String)((Object)f83.a("r", (int)25208, (long)(0x4270C94D719E49E8L ^ l))) + string + (String)((Object)f83.a("r", (int)28479, (long)(0x79BC598F8B57C4B5L ^ l))));
    }

    public static JsonObject ugk(JsonObject jsonObject, String string, JsonObject jsonObject2) {
        JsonObject jsonObject3;
        block6: {
            block5: {
                String string2;
                JsonObject jsonObject4;
                block4: {
                    int n = t9d.c();
                    try {
                        try {
                            jsonObject4 = jsonObject;
                            string2 = string;
                            if (n != 0) break block4;
                            if (!jsonObject4.has(string2)) break block5;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        jsonObject4 = jsonObject.get(string);
                        string2 = string;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                jsonObject3 = f83._yv((JsonElement)jsonObject4, string2);
                break block6;
            }
            jsonObject3 = jsonObject2;
        }
        return jsonObject3;
    }

    public static JsonArray vjw(JsonElement jsonElement, String string) {
        long l;
        block5: {
            JsonElement jsonElement2;
            block4: {
                l = a ^ 0x715D7C146E7DL;
                int n = t9d.c();
                try {
                    try {
                        jsonElement2 = jsonElement;
                        if (n != 0) break block4;
                        if (!jsonElement2.isJsonArray()) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    jsonElement2 = jsonElement;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            return jsonElement2.getAsJsonArray();
        }
        throw new JsonSyntaxException((String)((Object)f83.a("r", (int)30739, (long)(0x6535642342F50387L ^ l))) + string + (String)((Object)f83.a("r", (int)16985, (long)(0x31441DD592AF39D4L ^ l))) + f83.dyg(jsonElement));
    }

    public static JsonArray k68(JsonObject jsonObject, String string) {
        long l;
        block5: {
            String string2;
            JsonObject jsonObject2;
            block4: {
                l = a ^ 0x4C0D4D49083L;
                int n = t9d.b();
                try {
                    try {
                        jsonObject2 = jsonObject;
                        string2 = string;
                        if (n == 0) break block4;
                        if (!jsonObject2.has(string2)) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                    jsonObject2 = jsonObject.get(string);
                    string2 = string;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw f83.a(jsonSyntaxException);
                }
            }
            return f83.vjw((JsonElement)jsonObject2, string2);
        }
        throw new JsonSyntaxException((String)((Object)f83.a("r", (int)25208, (long)(0x4270A1836323670CL ^ l))) + string + (String)((Object)f83.a("r", (int)27783, (long)(0x16573B14CBEE69F7L ^ l))));
    }

    public static JsonArray zf2(JsonObject jsonObject, String string, JsonArray jsonArray) {
        JsonArray jsonArray2;
        block6: {
            block5: {
                String string2;
                JsonObject jsonObject2;
                block4: {
                    int n = t9d.c();
                    try {
                        try {
                            jsonObject2 = jsonObject;
                            string2 = string;
                            if (n != 0) break block4;
                            if (!jsonObject2.has(string2)) break block5;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        jsonObject2 = jsonObject.get(string);
                        string2 = string;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                jsonArray2 = f83.vjw((JsonElement)jsonObject2, string2);
                break block6;
            }
            jsonArray2 = jsonArray;
        }
        return jsonArray2;
    }

    public static String dyg(JsonElement jsonElement) {
        String string;
        block40: {
            boolean bl;
            long l;
            block38: {
                JsonPrimitive jsonPrimitive;
                block39: {
                    JsonElement jsonElement2;
                    int n;
                    block37: {
                        boolean bl2;
                        block35: {
                            block36: {
                                block33: {
                                    block34: {
                                        block31: {
                                            block32: {
                                                JsonElement jsonElement3;
                                                block29: {
                                                    block30: {
                                                        l = a ^ 0x246417232E22L;
                                                        n = t9d.b();
                                                        string = StringUtils.abbreviateMiddle((String)String.valueOf(jsonElement), (String)((Object)f83.a("r", (int)23628, (long)(0x1C4E86DAC133E79CL ^ l))), (int)10);
                                                        try {
                                                            try {
                                                                jsonElement3 = jsonElement;
                                                                if (n == 0) break block29;
                                                                if (jsonElement3 != null) break block30;
                                                            }
                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                throw f83.a(jsonSyntaxException);
                                                            }
                                                            return f83.a("r", (int)8917, (long)(0x3674F5952C6F1903L ^ l));
                                                        }
                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                            throw f83.a(jsonSyntaxException);
                                                        }
                                                    }
                                                    jsonElement3 = jsonElement;
                                                }
                                                try {
                                                    try {
                                                        bl2 = jsonElement3.isJsonNull();
                                                        if (n == 0) break block31;
                                                        if (!bl2) break block32;
                                                    }
                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                        throw f83.a(jsonSyntaxException);
                                                    }
                                                    return f83.a("r", (int)29835, (long)(0x3472209FE8FA4F4DL ^ l));
                                                }
                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                    throw f83.a(jsonSyntaxException);
                                                }
                                            }
                                            bl2 = jsonElement.isJsonArray();
                                        }
                                        try {
                                            try {
                                                if (n == 0) break block33;
                                                if (bl2) {
                                                }
                                                break block34;
                                            }
                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                throw f83.a(jsonSyntaxException);
                                            }
                                            return (String)((Object)f83.a("r", (int)18384, (long)(0x18441AE02A7EFC04L ^ l))) + string + ")";
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw f83.a(jsonSyntaxException);
                                        }
                                    }
                                    bl2 = jsonElement.isJsonObject();
                                }
                                try {
                                    try {
                                        if (n == 0) break block35;
                                        if (bl2) {
                                        }
                                        break block36;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw f83.a(jsonSyntaxException);
                                    }
                                    return (String)((Object)f83.a("r", (int)29070, (long)(0x434BA00B3A99CA4BL ^ l))) + string + ")";
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw f83.a(jsonSyntaxException);
                                }
                            }
                            try {
                                jsonElement2 = jsonElement;
                                if (n == 0) break block37;
                                bl2 = jsonElement2.isJsonPrimitive();
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw f83.a(jsonSyntaxException);
                            }
                        }
                        if (!bl2) break block40;
                        jsonElement2 = jsonElement;
                    }
                    jsonPrimitive = jsonElement2.getAsJsonPrimitive();
                    try {
                        try {
                            bl = jsonPrimitive.isNumber();
                            if (n == 0) break block38;
                            if (bl) {
                            }
                            break block39;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw f83.a(jsonSyntaxException);
                        }
                        return (String)((Object)f83.a("r", (int)32245, (long)(0x77AC4C98ACAC639L ^ l))) + string + ")";
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw f83.a(jsonSyntaxException);
                    }
                }
                bl = jsonPrimitive.isBoolean();
            }
            try {
                if (bl) {
                    return (String)((Object)f83.a("r", (int)19645, (long)(0x19908A54275F770L ^ l))) + string + ")";
                }
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                throw f83.a(jsonSyntaxException);
            }
        }
        return string;
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

                f83.a = c.a(4235649590877951509L, -5419708639101374078L, MethodHandles.lookup().lookupClass()).a(246723502884309L);
                f83.d = new HashMap<K, V>(13);
                var0 = f83.a ^ 126699791975238L;
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
                var6_5 = "z%E\u00ff\u00ef\u0011\u00b9\u00cc\u00d1R\u000b\u00f6Yg`\u007f\u0085\t\f\u00bc##\u009bRT\u0013U$k-`\u0095(h\u0013\u00f8S\u00b6\u0097\u00d7\u00a4C\u009cw\u0098\u00e6\"\"f\u009b\u00ba\u00b5\u00e4~\u00bb\u00d42\u009b4m\u00e8\u00fenL\u001d\u00b8p\u00ad\u00b2\u0013\u00ef\u0098\b8\u00b2\u00dd'M\u00e6\u00f3S\u00db5}\r\u00d6\u0014()}\u00cf\u0085\u000b\u00ac\u008e\u00aa\u00bc\u00ad'\u00a1\"|\r\u00a4\u008a)m&T\\\u0089\\\"w\u001f\u001f\u0082\u00c6\u00ee\u00f5\u0007\u00e2\u00b2\u00d6(\u00ac0`\u00dd\u00fe0\u00f0+\u00bak\u00adq\u0082\u00bc\u00e8g\"F\u00e8\u00ea\u00ae\u00d5D7\u00eb\u00b9~\u00e5\u00dbmA\u00e5\u008b\u0082\u0003\u00e4\u00ee\u0099r\u00f3\u0004\u00cc\u001e\u008f7\u008d\u001d\u0000b\u00c6{`\u0081\u0011\u0018\u00a3D\u009c\u00dcH8\u00cc\u008b\u00a8_(\u0086\u0004y\u00e6\u0083\u00c9\u00d5xvU\u00ce\u00d9\u0093\u0018N\u0000\u0084ks@tw5\u00d6\u00e8\u0082\u009cG\u00e2\u00a3H\u00b7\u00ae\u00fcY\u00cfSw\u0018\u00c5\u00cf\u00a4\u00fc\u00c7A\u00b2zT\u00c5iY\u00b8f+\u00bcz\u00bcp\u008d;\u00f5\u00b3\t0-\u0090c\u00cf\u00f2\u00fdsx8I{G\u0081\u00b8\u00a5\u00f8#*\u0087\u00c1\u00f2?\n\f\u00b0\u0088\u0081\u00a7]b\u00bc\u00a1\u00b8\u00a3\u001dOFUbz\\\u00d7\u00dd4\u00ac\nk-8\u00e4\u0093\u001e\u00b6\u0083;\u0004\u00f6\u00c6\u00162\u00e7|z\u00d4\t\u0011q\n\u0017\u00a7\u00fd\u00aa\u00d4\u008d\u00d2\u0002\u00f8,\u0097\u00b4=\u00d9\u00cc)\u008fu\u00f2#\u00e7\u00d7^\u00cf[\u00df\u00db\u001cB\u00cf\u001d?\u00d6*]\u00ff\u00f08\u00efl\u008d\u009c=\u00ee\u00f1\u001f\u00c2\u00027\u00c4\u00fe\f\u00da\u0005\nc\b\u00baQ\u0010c\u00ae \u0084\u00a4\u00a4GHg\u00fcO\u009b@SO\u00d5?\u00f7d\u00e5\u00e0O\u008e\u0011\u00e4R[\u000b\u001d\u00edwg*a(\u00e5x\u0088\u00bf\u00ce\u00bcV\u0097!<\u00a8\u00ebW\u00c0A:\u00ae\u00d6M\u0004\u00f9{F\u0086\u00c1\u00a5\u0097\u00e1\u0082\u000f\u00a7N\u00ee#;\u00bc\u00b0\u00b5F\u00fc 8\u009f\u0099h\u0013\u00d8\u0094\u00c0+\u00f7\u00bb\nrp\u00c5;\u00cc-v\u008cY\u00c1b\u00df\u00e0-\u0083\u0004e\u008fH\u000f d3\u00c8\u0088\u00a4G\u0011\n\u00ca\u00c4\u00b8{P\u0013\u00ef\u00ed(\u00a2\u009b/\u0019\u00a2\u00b8;j\u00a6\u00a82\u00f8b-U\u0018\u00e0_\u00db\u0013%\u0094,\u0089\u00a2k\u00af2\u001a.:epJK\u00f5\u00a5\u00ff\u00bb\u00f60\u009f\u001f\u00ba\u00a3\u00a8\u00f6}\u009es\u00f7w!`\u001c\u00cb(\u0001\u0093d\u00d6\u0093\u00d2\u0090\u0007I\u00a8a\u00db\u00c3\u0003\u0080P\u00fam\u00f0\u00f1\u00d8\tt]\u00aa\u00ae& \u00ef\u0010\u0011\u00ed0<\u00d9!\u00ac8\u000f\u0015\u00e2\u00a1\u00b4\u0088\u00fev\u00f6-\u00d4`\u00e6\u00f9\u00dc0\u0091<\u0011\u00e5\u001cL^\u001d\u009e\u0092\u0091;\u00e9s\u00fe(\u0014\u001cWD\u00c5\u00a4\u001d\u00e1m'`\u0010t\u00c8\u00ce\tJ\u008f\u0004\u00d8\u00f3\u00e6C,I\u0011@\u00d60\u0090\u00a3\u00aaT\u009b\u0019\u0012\u00ed\u007f\u00da&\u009f\u0091\u001d\u00d1\u00dd\u00ebD\u00c0\u00a8{O\u0080y\u00bf\u00f2m\u00f4%r\u00ea\"\u00b9h{\\Z\u00fdK\u001b\u0013\u00f6\u0002\u00db0\u00f4\u00e6N0\u00cfW,\u00fd\\\u0002s|\r\r\u00db5$5\n\u00f8\u00bb\u0013\u00cb\bJjw\u00e8\u00b0\u000f\u0089_ \u001d\u00a2\u00bc\u00e1\t\u00cf\u00bcm\u00c5`\u00f8 \u0098\u00cb#\u001aO\u00e7\u0015(j\u0082\u00fd`\u0086\u00e2x\u0086\u00bb\u00f1g9\u00fd\u00e7\u00dd$\u00dazb*\u001e\u00b1.\u000eH\u0012\u00d2\u00c7[\u00d0\u00e6\u000f\f\u009e\u0016\u0085a0\u00d9\u00a5\u0018\u00d6\b\u0000\u00b2e\u00f6%\u0014\u00dd\u000eU\u0005\u0006\u00ec\u001c#\u00fa\u0001k\u0099\u00e1\u00ab~\u009c";
                var8_6 = "z%E\u00ff\u00ef\u0011\u00b9\u00cc\u00d1R\u000b\u00f6Yg`\u007f\u0085\t\f\u00bc##\u009bRT\u0013U$k-`\u0095(h\u0013\u00f8S\u00b6\u0097\u00d7\u00a4C\u009cw\u0098\u00e6\"\"f\u009b\u00ba\u00b5\u00e4~\u00bb\u00d42\u009b4m\u00e8\u00fenL\u001d\u00b8p\u00ad\u00b2\u0013\u00ef\u0098\b8\u00b2\u00dd'M\u00e6\u00f3S\u00db5}\r\u00d6\u0014()}\u00cf\u0085\u000b\u00ac\u008e\u00aa\u00bc\u00ad'\u00a1\"|\r\u00a4\u008a)m&T\\\u0089\\\"w\u001f\u001f\u0082\u00c6\u00ee\u00f5\u0007\u00e2\u00b2\u00d6(\u00ac0`\u00dd\u00fe0\u00f0+\u00bak\u00adq\u0082\u00bc\u00e8g\"F\u00e8\u00ea\u00ae\u00d5D7\u00eb\u00b9~\u00e5\u00dbmA\u00e5\u008b\u0082\u0003\u00e4\u00ee\u0099r\u00f3\u0004\u00cc\u001e\u008f7\u008d\u001d\u0000b\u00c6{`\u0081\u0011\u0018\u00a3D\u009c\u00dcH8\u00cc\u008b\u00a8_(\u0086\u0004y\u00e6\u0083\u00c9\u00d5xvU\u00ce\u00d9\u0093\u0018N\u0000\u0084ks@tw5\u00d6\u00e8\u0082\u009cG\u00e2\u00a3H\u00b7\u00ae\u00fcY\u00cfSw\u0018\u00c5\u00cf\u00a4\u00fc\u00c7A\u00b2zT\u00c5iY\u00b8f+\u00bcz\u00bcp\u008d;\u00f5\u00b3\t0-\u0090c\u00cf\u00f2\u00fdsx8I{G\u0081\u00b8\u00a5\u00f8#*\u0087\u00c1\u00f2?\n\f\u00b0\u0088\u0081\u00a7]b\u00bc\u00a1\u00b8\u00a3\u001dOFUbz\\\u00d7\u00dd4\u00ac\nk-8\u00e4\u0093\u001e\u00b6\u0083;\u0004\u00f6\u00c6\u00162\u00e7|z\u00d4\t\u0011q\n\u0017\u00a7\u00fd\u00aa\u00d4\u008d\u00d2\u0002\u00f8,\u0097\u00b4=\u00d9\u00cc)\u008fu\u00f2#\u00e7\u00d7^\u00cf[\u00df\u00db\u001cB\u00cf\u001d?\u00d6*]\u00ff\u00f08\u00efl\u008d\u009c=\u00ee\u00f1\u001f\u00c2\u00027\u00c4\u00fe\f\u00da\u0005\nc\b\u00baQ\u0010c\u00ae \u0084\u00a4\u00a4GHg\u00fcO\u009b@SO\u00d5?\u00f7d\u00e5\u00e0O\u008e\u0011\u00e4R[\u000b\u001d\u00edwg*a(\u00e5x\u0088\u00bf\u00ce\u00bcV\u0097!<\u00a8\u00ebW\u00c0A:\u00ae\u00d6M\u0004\u00f9{F\u0086\u00c1\u00a5\u0097\u00e1\u0082\u000f\u00a7N\u00ee#;\u00bc\u00b0\u00b5F\u00fc 8\u009f\u0099h\u0013\u00d8\u0094\u00c0+\u00f7\u00bb\nrp\u00c5;\u00cc-v\u008cY\u00c1b\u00df\u00e0-\u0083\u0004e\u008fH\u000f d3\u00c8\u0088\u00a4G\u0011\n\u00ca\u00c4\u00b8{P\u0013\u00ef\u00ed(\u00a2\u009b/\u0019\u00a2\u00b8;j\u00a6\u00a82\u00f8b-U\u0018\u00e0_\u00db\u0013%\u0094,\u0089\u00a2k\u00af2\u001a.:epJK\u00f5\u00a5\u00ff\u00bb\u00f60\u009f\u001f\u00ba\u00a3\u00a8\u00f6}\u009es\u00f7w!`\u001c\u00cb(\u0001\u0093d\u00d6\u0093\u00d2\u0090\u0007I\u00a8a\u00db\u00c3\u0003\u0080P\u00fam\u00f0\u00f1\u00d8\tt]\u00aa\u00ae& \u00ef\u0010\u0011\u00ed0<\u00d9!\u00ac8\u000f\u0015\u00e2\u00a1\u00b4\u0088\u00fev\u00f6-\u00d4`\u00e6\u00f9\u00dc0\u0091<\u0011\u00e5\u001cL^\u001d\u009e\u0092\u0091;\u00e9s\u00fe(\u0014\u001cWD\u00c5\u00a4\u001d\u00e1m'`\u0010t\u00c8\u00ce\tJ\u008f\u0004\u00d8\u00f3\u00e6C,I\u0011@\u00d60\u0090\u00a3\u00aaT\u009b\u0019\u0012\u00ed\u007f\u00da&\u009f\u0091\u001d\u00d1\u00dd\u00ebD\u00c0\u00a8{O\u0080y\u00bf\u00f2m\u00f4%r\u00ea\"\u00b9h{\\Z\u00fdK\u001b\u0013\u00f6\u0002\u00db0\u00f4\u00e6N0\u00cfW,\u00fd\\\u0002s|\r\r\u00db5$5\n\u00f8\u00bb\u0013\u00cb\bJjw\u00e8\u00b0\u000f\u0089_ \u001d\u00a2\u00bc\u00e1\t\u00cf\u00bcm\u00c5`\u00f8 \u0098\u00cb#\u001aO\u00e7\u0015(j\u0082\u00fd`\u0086\u00e2x\u0086\u00bb\u00f1g9\u00fd\u00e7\u00dd$\u00dazb*\u001e\u00b1.\u000eH\u0012\u00d2\u00c7[\u00d0\u00e6\u000f\f\u009e\u0016\u0085a0\u00d9\u00a5\u0018\u00d6\b\u0000\u00b2e\u00f6%\u0014\u00dd\u000eU\u0005\u0006\u00ec\u001c#\u00fa\u0001k\u0099\u00e1\u00ab~\u009c".length();
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
                    var9_3[var7_4++] = f83.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "2\u00fbJ\u00de\u0084\u0016\u00bb\u0094e\u00dfrZO\u00c7\u00f5\u0002\u000e\u00e82\u00ac@\b\u00c5z \u0082\u00be\u00af\u00ce\u00b9\u0082n\u0087\u00fcw\u001fV+8\u009e\u00e3f\u00ef\u001d\u00c3\u00cc\u00d8\u00914\u000e\u00e2p\u00f1\u0001\u0094e3";
                    var8_6 = "2\u00fbJ\u00de\u0084\u0016\u00bb\u0094e\u00dfrZO\u00c7\u00f5\u0002\u000e\u00e82\u00ac@\b\u00c5z \u0082\u00be\u00af\u00ce\u00b9\u0082n\u0087\u00fcw\u001fV+8\u009e\u00e3f\u00ef\u001d\u00c3\u00cc\u00d8\u00914\u000e\u00e2p\u00f1\u0001\u0094e3".length();
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
                    var9_3[var7_4++] = f83.a(var10_9).intern();
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
        f83.b = var9_3;
        f83.c = new String[23];
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x20F6;
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
                throw new RuntimeException("f83", exception);
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
            f83.c[n2] = f83.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = f83.a(n, l);
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
            throw new RuntimeException("f83" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f83.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

