/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.google.gson.TypeAdapterFactory
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapterFactory;
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
public class ekw$szt
implements JsonDeserializer,
JsonSerializer {
    private static final Gson pw2;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ekw deserialize(JsonElement var1_1, Type var2_2, JsonDeserializationContext var3_3) {
        block105: {
            block102: {
                block103: {
                    block104: {
                        block101: {
                            block92: {
                                block98: {
                                    block100: {
                                        block99: {
                                            block93: {
                                                block106: {
                                                    block95: {
                                                        block94: {
                                                            block91: {
                                                                block85: {
                                                                    block86: {
                                                                        block88: {
                                                                            block89: {
                                                                                block87: {
                                                                                    block83: {
                                                                                        block84: {
                                                                                            var4_4 = ekw$szt.a ^ 111952367705387L;
                                                                                            var6_5 = t9d.c();
                                                                                            try {
                                                                                                try {
                                                                                                    v0 = var1_1.isJsonPrimitive();
                                                                                                    if (var6_5 != 0) break block83;
                                                                                                    if (!v0) break block84;
                                                                                                }
                                                                                                catch (JsonParseException v1) {
                                                                                                    throw ekw$szt.a(v1);
                                                                                                }
                                                                                                return new tao(var1_1.getAsString());
                                                                                            }
                                                                                            catch (JsonParseException v2) {
                                                                                                throw ekw$szt.a(v2);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            v3 = var1_1;
                                                                                            if (var6_5 != 0) break block85;
                                                                                            v0 = v3.isJsonObject();
                                                                                        }
                                                                                        catch (JsonParseException v4) {
                                                                                            throw ekw$szt.a(v4);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (v0) break block86;
                                                                                                v5 = var1_1;
                                                                                                if (var6_5 != 0) break block87;
                                                                                            }
                                                                                            catch (JsonParseException v6) {
                                                                                                throw ekw$szt.a(v6);
                                                                                            }
                                                                                            if (!v5.isJsonArray()) break block88;
                                                                                        }
                                                                                        catch (JsonParseException v7) {
                                                                                            throw ekw$szt.a(v7);
                                                                                        }
                                                                                        v5 = var1_1;
                                                                                    }
                                                                                    catch (JsonParseException v8) {
                                                                                        throw ekw$szt.a(v8);
                                                                                    }
                                                                                }
                                                                                var7_6 = v5.getAsJsonArray();
                                                                                var8_8 = null;
                                                                                for (JsonElement var10_12 : var7_6) {
                                                                                    block90: {
                                                                                        var11_15 = this.deserialize(var10_12, var10_12.getClass(), var3_3);
                                                                                        try {
                                                                                            try {
                                                                                                v9 = var8_8;
                                                                                                if (var6_5 != 0) break block89;
                                                                                                if (var6_5 != 0) break block90;
                                                                                            }
                                                                                            catch (JsonParseException v10) {
                                                                                                throw ekw$szt.a(v10);
                                                                                            }
                                                                                            if (v9 == null) {
                                                                                            }
                                                                                            ** GOTO lbl61
                                                                                        }
                                                                                        catch (JsonParseException v11) {
                                                                                            throw ekw$szt.a(v11);
                                                                                        }
                                                                                        var8_8 = var11_15;
                                                                                        try {
                                                                                            if (var6_5 == 0) break block90;
lbl61:
                                                                                            // 2 sources

                                                                                            var8_8.vha(var11_15);
                                                                                        }
                                                                                        catch (JsonParseException v12) {
                                                                                            throw ekw$szt.a(v12);
                                                                                        }
                                                                                    }
                                                                                    if (var6_5 == 0) continue;
                                                                                }
                                                                                v9 = var8_8;
                                                                            }
                                                                            return v9;
                                                                        }
                                                                        throw new JsonParseException((String)ekw$szt.a("a", (int)18882, (long)(6572226502420239481L ^ var4_4)) + var1_1.toString() + (String)ekw$szt.a("a", (int)11552, (long)(6935405149587665046L ^ var4_4)));
                                                                    }
                                                                    v3 = var1_1;
                                                                }
                                                                var7_7 = v3.getAsJsonObject();
                                                                try {
                                                                    v13 = var7_7.has((String)ekw$szt.a("a", (int)11143, (long)(2241375188177090107L ^ var4_4)));
                                                                    if (var6_5 != 0) break block91;
                                                                    if (v13) {
                                                                    }
                                                                    ** GOTO lbl89
                                                                }
                                                                catch (JsonParseException v14) {
                                                                    throw ekw$szt.a(v14);
                                                                }
                                                                var8_9 /* !! */  = new tao(var7_7.get((String)ekw$szt.a("a", (int)23943, (long)(3686676097227915297L ^ var4_4))).getAsString());
                                                                try {
                                                                    if (var6_5 == 0) break block92;
lbl89:
                                                                    // 2 sources

                                                                    v13 = var7_7.has((String)ekw$szt.a("a", (int)32666, (long)(8031879585104437819L ^ var4_4)));
                                                                }
                                                                catch (JsonParseException v15) {
                                                                    throw ekw$szt.a(v15);
                                                                }
                                                            }
                                                            try {
                                                                if (var6_5 != 0) break block93;
                                                                if (v13) {
                                                                }
                                                                ** GOTO lbl159
                                                            }
                                                            catch (JsonParseException v16) {
                                                                throw ekw$szt.a(v16);
                                                            }
                                                            var9_11 = var7_7.get((String)ekw$szt.a("a", (int)23518, (long)(5212547323986642541L ^ var4_4))).getAsString();
                                                            try {
                                                                try {
                                                                    v17 = var7_7;
                                                                    v18 = ekw$szt.a("a", (int)29961, (long)(3143594412857632941L ^ var4_4));
                                                                    if (var6_5 != 0) break block94;
                                                                    if (!v17.has((String)v18)) break block95;
                                                                }
                                                                catch (JsonParseException v19) {
                                                                    throw ekw$szt.a(v19);
                                                                }
                                                                v17 = var7_7;
                                                                v18 = ekw$szt.a("a", (int)7312, (long)(2429073828560060709L ^ var4_4));
                                                            }
                                                            catch (JsonParseException v20) {
                                                                throw ekw$szt.a(v20);
                                                            }
                                                        }
                                                        var10_13 = v17.getAsJsonArray((String)v18);
                                                        var11_16 = new Object[var10_13.size()];
                                                        var12_17 = 0;
                                                        while (var12_17 < var11_16.length) {
                                                            block96: {
                                                                block97: {
                                                                    try {
                                                                        var11_16[var12_17] = this.deserialize(var10_13.get(var12_17), var2_2, var3_3);
                                                                        if (var6_5 != 0) break block96;
                                                                        if (!(var11_16[var12_17] instanceof tao)) break block97;
                                                                    }
                                                                    catch (JsonParseException v21) {
                                                                        throw ekw$szt.a(v21);
                                                                    }
                                                                    var13_18 = (tao)var11_16[var12_17];
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var6_5 != 0) break block96;
                                                                                if (!var13_18.f4q().wov()) break block97;
                                                                            }
                                                                            catch (JsonParseException v22) {
                                                                                throw ekw$szt.a(v22);
                                                                            }
                                                                            if (!var13_18.iwv().isEmpty()) break block97;
                                                                        }
                                                                        catch (JsonParseException v23) {
                                                                            throw ekw$szt.a(v23);
                                                                        }
                                                                        var11_16[var12_17] = var13_18.rcd();
                                                                    }
                                                                    catch (JsonParseException v24) {
                                                                        throw ekw$szt.a(v24);
                                                                    }
                                                                }
                                                                ++var12_17;
                                                            }
                                                            if (var6_5 == 0) continue;
                                                        }
                                                        var8_9 /* !! */  = new hsu(var9_11, var11_16);
                                                        if (var6_5 == 0) break block106;
                                                    }
                                                    var8_9 /* !! */  = new hsu(var9_11, new Object[0]);
                                                }
                                                try {
                                                    if (var6_5 == 0) break block92;
lbl159:
                                                    // 2 sources

                                                    v13 = var7_7.has((String)ekw$szt.a("a", (int)22202, (long)(4982210896459729680L ^ var4_4)));
                                                }
                                                catch (JsonParseException v25) {
                                                    throw ekw$szt.a(v25);
                                                }
                                            }
                                            try {
                                                if (var6_5 != 0) break block98;
                                                if (v13) {
                                                }
                                                ** GOTO lbl206
                                            }
                                            catch (JsonParseException v26) {
                                                throw ekw$szt.a(v26);
                                            }
                                            var9_11 = var7_7.getAsJsonObject((String)ekw$szt.a("a", (int)10759, (long)(7458901481522362298L ^ var4_4)));
                                            try {
                                                try {
                                                    v27 = var9_11.has((String)ekw$szt.a("a", (int)15809, (long)(3421373000975900798L ^ var4_4)));
                                                    if (var6_5 != 0) break block99;
                                                    if (v27) {
                                                    }
                                                    ** GOTO lbl190
                                                }
                                                catch (JsonParseException v28) {
                                                    throw ekw$szt.a(v28);
                                                }
                                                v27 = var9_11.has((String)ekw$szt.a("a", (int)31777, (long)(4582334584277606790L ^ var4_4)));
                                            }
                                            catch (JsonParseException v29) {
                                                throw ekw$szt.a(v29);
                                            }
                                        }
                                        try {
                                            if (v27) break block100;
lbl190:
                                            // 2 sources

                                            throw new JsonParseException((String)ekw$szt.a("a", (int)25352, (long)(7655323116942474925L ^ var4_4)));
                                        }
                                        catch (JsonParseException v30) {
                                            throw ekw$szt.a(v30);
                                        }
                                    }
                                    var8_9 /* !! */  = new inv(f83.sjp((JsonObject)var9_11, (String)ekw$szt.a("a", (int)18513, (long)(7672174263915484646L ^ var4_4))), f83.sjp((JsonObject)var9_11, (String)ekw$szt.a("a", (int)12425, (long)(5080554096698125624L ^ var4_4))));
                                    try {
                                        if (var9_11.has((String)ekw$szt.a("a", (int)32197, (long)(1218105205013618798L ^ var4_4)))) {
                                            ((inv)var8_9 /* !! */ ).h2r(f83.sjp((JsonObject)var9_11, (String)ekw$szt.a("a", (int)3617, (long)(580943918309528469L ^ var4_4))));
                                        }
                                    }
                                    catch (JsonParseException v31) {
                                        throw ekw$szt.a(v31);
                                    }
                                    try {
                                        if (var6_5 == 0) break block92;
lbl206:
                                        // 2 sources

                                        v13 = var7_7.has((String)ekw$szt.a("a", (int)12951, (long)(4010953815931744052L ^ var4_4)));
                                    }
                                    catch (JsonParseException v32) {
                                        throw ekw$szt.a(v32);
                                    }
                                }
                                try {
                                    if (!v13) {
                                        throw new JsonParseException((String)ekw$szt.a("a", (int)7329, (long)(5980552285843177759L ^ var4_4)) + var1_1.toString() + (String)ekw$szt.a("a", (int)17082, (long)(7188663692563160840L ^ var4_4)));
                                    }
                                }
                                catch (JsonParseException v33) {
                                    throw ekw$szt.a(v33);
                                }
                                var8_9 /* !! */  = new mp4(f83.sjp(var7_7, (String)ekw$szt.a("a", (int)16467, (long)(3210577036192456179L ^ var4_4))));
                            }
                            try {
                                try {
                                    v34 = var7_7;
                                    v35 = ekw$szt.a("a", (int)28577, (long)(578943203395449369L ^ var4_4));
                                    if (var6_5 != 0) break block101;
                                    if (!v34.has((String)v35)) break block102;
                                }
                                catch (JsonParseException v36) {
                                    throw ekw$szt.a(v36);
                                }
                                v34 = var7_7;
                                v35 = ekw$szt.a("a", (int)5240, (long)(8807246189977749960L ^ var4_4));
                            }
                            catch (JsonParseException v37) {
                                throw ekw$szt.a(v37);
                            }
                        }
                        var9_11 = v34.getAsJsonArray((String)v35);
                        try {
                            try {
                                v38 = var9_11.size();
                                if (var6_5 != 0) break block103;
                                if (v38 <= 0) {
                                }
                                break block104;
                            }
                            catch (JsonParseException v39) {
                                throw ekw$szt.a(v39);
                            }
                            throw new JsonParseException((String)ekw$szt.a("a", (int)27118, (long)(1635906262151509076L ^ var4_4)));
                        }
                        catch (JsonParseException v40) {
                            throw ekw$szt.a(v40);
                        }
                    }
                    v38 = var10_14 = 0;
                }
                while (var10_14 < var9_11.size()) {
                    try {
                        var8_9 /* !! */ .vha(this.deserialize(var9_11.get(var10_14), var2_2, var3_3));
                        ++var10_14;
                        if (var6_5 == 0) {
                            if (var6_5 == 0) continue;
                            break;
                        }
                        break block105;
                    }
                    catch (JsonParseException v41) {
                        throw ekw$szt.a(v41);
                    }
                }
            }
            var8_9 /* !! */ .di5((poy)var3_3.deserialize(var1_1, poy.class));
        }
        return var8_9 /* !! */ ;
    }

    private void m32(poy poy2, JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        block6: {
            JsonElement jsonElement;
            int n;
            block5: {
                n = t9d.b();
                JsonElement jsonElement2 = jsonSerializationContext.serialize((Object)poy2);
                try {
                    try {
                        jsonElement = jsonElement2;
                        if (n == 0) break block5;
                        if (!jsonElement.isJsonObject()) break block6;
                    }
                    catch (JsonParseException jsonParseException) {
                        throw ekw$szt.a(jsonParseException);
                    }
                    jsonElement = jsonElement2;
                }
                catch (JsonParseException jsonParseException) {
                    throw ekw$szt.a(jsonParseException);
                }
            }
            JsonObject jsonObject2 = (JsonObject)jsonElement;
            for (Map.Entry entry : jsonObject2.entrySet()) {
                jsonObject.add((String)entry.getKey(), (JsonElement)entry.getValue());
                if (n != 0) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public JsonElement fnq(ekw var1_1, Type var2_2, JsonSerializationContext var3_3) {
        block65: {
            block71: {
                block70: {
                    block66: {
                        block68: {
                            block67: {
                                block63: {
                                    block61: {
                                        block62: {
                                            block59: {
                                                block60: {
                                                    block57: {
                                                        block58: {
                                                            block56: {
                                                                var4_4 = ekw$szt.a ^ 26629851552800L;
                                                                var6_5 = t9d.c();
                                                                try {
                                                                    try {
                                                                        v0 = var1_1 instanceof tao;
                                                                        if (var6_5 != 0) break block56;
                                                                        if (!v0) break block57;
                                                                    }
                                                                    catch (JsonParseException v1) {
                                                                        throw ekw$szt.a(v1);
                                                                    }
                                                                    v0 = var1_1.f4q().wov();
                                                                }
                                                                catch (JsonParseException v2) {
                                                                    throw ekw$szt.a(v2);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var6_5 != 0) break block58;
                                                                    if (!v0) break block57;
                                                                }
                                                                catch (JsonParseException v3) {
                                                                    throw ekw$szt.a(v3);
                                                                }
                                                                v0 = var1_1.iwv().isEmpty();
                                                            }
                                                            catch (JsonParseException v4) {
                                                                throw ekw$szt.a(v4);
                                                            }
                                                        }
                                                        try {
                                                            if (v0) {
                                                                return new JsonPrimitive(((tao)var1_1).rcd());
                                                            }
                                                        }
                                                        catch (JsonParseException v5) {
                                                            throw ekw$szt.a(v5);
                                                        }
                                                    }
                                                    var7_6 = new JsonObject();
                                                    try {
                                                        try {
                                                            v6 = var1_1.f4q().wov();
                                                            if (var6_5 != 0) break block59;
                                                            if (v6) break block60;
                                                        }
                                                        catch (JsonParseException v7) {
                                                            throw ekw$szt.a(v7);
                                                        }
                                                        this.m32(var1_1.f4q(), var7_6, var3_3);
                                                    }
                                                    catch (JsonParseException v8) {
                                                        throw ekw$szt.a(v8);
                                                    }
                                                }
                                                v6 = var1_1.iwv().isEmpty();
                                            }
                                            try {
                                                if (var6_5 != 0) break block61;
                                                if (v6) break block62;
                                            }
                                            catch (JsonParseException v9) {
                                                throw ekw$szt.a(v9);
                                            }
                                            var8_7 = new JsonArray();
                                            for (Object[] var10_9 : var1_1.iwv()) {
                                                try {
                                                    var8_7.add(this.fnq((ekw)var10_9, var10_9.getClass(), var3_3));
                                                    if (var6_5 == 0) {
                                                        if (var6_5 == 0) continue;
                                                        break;
                                                    }
                                                    break block62;
                                                }
                                                catch (JsonParseException v10) {
                                                    throw ekw$szt.a(v10);
                                                }
                                            }
                                            var7_6.add((String)ekw$szt.a("a", (int)5240, (long)(8807319409401333955L ^ var4_4)), (JsonElement)var8_7);
                                        }
                                        v6 = var1_1 instanceof tao;
                                    }
                                    try {
                                        block64: {
                                            try {
                                                try {
                                                    if (var6_5 != 0) break block63;
                                                    if (!v6) break block64;
                                                }
                                                catch (JsonParseException v11) {
                                                    throw ekw$szt.a(v11);
                                                }
                                                var7_6.addProperty((String)ekw$szt.a("a", (int)23943, (long)(3686699361955070250L ^ var4_4)), ((tao)var1_1).rcd());
                                                if (var6_5 == 0) break block65;
                                            }
                                            catch (JsonParseException v12) {
                                                throw ekw$szt.a(v12);
                                            }
                                        }
                                        v6 = var1_1 instanceof hsu;
                                    }
                                    catch (JsonParseException v13) {
                                        throw ekw$szt.a(v13);
                                    }
                                }
                                try {
                                    if (var6_5 != 0) break block66;
                                    if (v6) {
                                    }
                                    ** GOTO lbl144
                                }
                                catch (JsonParseException v14) {
                                    throw ekw$szt.a(v14);
                                }
                                var8_7 = (hsu)var1_1;
                                try {
                                    try {
                                        var7_6.addProperty((String)ekw$szt.a("a", (int)23518, (long)(5212579865977374566L ^ var4_4)), var8_7.z24());
                                        v15 = var8_7.a69();
                                        if (var6_5 != 0) break block67;
                                        if (v15 == null) break block68;
                                    }
                                    catch (JsonParseException v16) {
                                        throw ekw$szt.a(v16);
                                    }
                                    v15 = var8_7.a69();
                                }
                                catch (JsonParseException v17) {
                                    throw ekw$szt.a(v17);
                                }
                            }
                            if (v15.length <= 0) break block68;
                            var9_8 = new JsonArray();
                            for (Object var13_12 : var8_7.a69()) {
                                block69: {
                                    try {
                                        try {
                                            try {
                                                if (var6_5 != 0) break block68;
                                                if (var6_5 != 0) break block69;
                                            }
                                            catch (JsonParseException v18) {
                                                throw ekw$szt.a(v18);
                                            }
                                            if (var13_12 instanceof ekw) {
                                            }
                                            ** GOTO lbl136
                                        }
                                        catch (JsonParseException v19) {
                                            throw ekw$szt.a(v19);
                                        }
                                        var9_8.add(this.fnq((ekw)var13_12, var13_12.getClass(), var3_3));
                                    }
                                    catch (JsonParseException v20) {
                                        throw ekw$szt.a(v20);
                                    }
                                }
                                try {
                                    if (var6_5 == 0) continue;
lbl136:
                                    // 2 sources

                                    var9_8.add((JsonElement)new JsonPrimitive(String.valueOf(var13_12)));
                                }
                                catch (JsonParseException v21) {
                                    throw ekw$szt.a(v21);
                                }
                            }
                            var7_6.add((String)ekw$szt.a("a", (int)7312, (long)(2429041290806624302L ^ var4_4)), (JsonElement)var9_8);
                        }
                        try {
                            if (var6_5 == 0) break block65;
lbl144:
                            // 2 sources

                            v6 = var1_1 instanceof inv;
                        }
                        catch (JsonParseException v22) {
                            throw ekw$szt.a(v22);
                        }
                    }
                    try {
                        if (var6_5 != 0) break block70;
                        if (v6) {
                        }
                        ** GOTO lbl169
                    }
                    catch (JsonParseException v23) {
                        throw ekw$szt.a(v23);
                    }
                    var8_7 = (inv)var1_1;
                    var9_8 = new JsonObject();
                    try {
                        try {
                            var9_8.addProperty((String)ekw$szt.a("a", (int)18513, (long)(7672291197634729197L ^ var4_4)), var8_7.cf1());
                            var9_8.addProperty((String)ekw$szt.a("a", (int)12425, (long)(5080549532359765043L ^ var4_4)), var8_7.tj1());
                            var9_8.addProperty((String)ekw$szt.a("a", (int)3617, (long)(580841771996484254L ^ var4_4)), var8_7.cpz());
                            var7_6.add((String)ekw$szt.a("a", (int)10759, (long)(7458852176476649137L ^ var4_4)), (JsonElement)var9_8);
                            if (var6_5 == 0) break block65;
lbl169:
                            // 2 sources

                            v24 = var1_1;
                            if (var6_5 != 0) break block71;
                        }
                        catch (JsonParseException v25) {
                            throw ekw$szt.a(v25);
                        }
                        v6 = v24 instanceof mp4;
                    }
                    catch (JsonParseException v26) {
                        throw ekw$szt.a(v26);
                    }
                }
                try {
                    if (!v6) {
                        throw new IllegalArgumentException((String)ekw$szt.a("a", (int)21271, (long)(8667297599890182053L ^ var4_4)) + var1_1 + (String)ekw$szt.a("a", (int)3723, (long)(6673198135947891234L ^ var4_4)));
                    }
                }
                catch (JsonParseException v27) {
                    throw ekw$szt.a(v27);
                }
                v24 = var1_1;
            }
            var8_7 = (mp4)v24;
            var7_6.addProperty((String)ekw$szt.a("a", (int)16467, (long)(3210573008641678584L ^ var4_4)), var8_7.nyv());
        }
        return var7_6;
    }

    public static String odg(ekw ekw2) {
        return pw2.toJson((Object)ekw2);
    }

    public static ekw wnw(String string) {
        return (ekw)pw2.fromJson(string, ekw.class);
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.deserialize(jsonElement, type, jsonDeserializationContext);
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.fnq((ekw)object, type, jsonSerializationContext);
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

                ekw$szt.a = c.a(5148072907689632066L, -7841552472470697527L, MethodHandles.lookup().lookupClass()).a(54971163949361L);
                ekw$szt.d = new HashMap<K, V>(13);
                var0 = ekw$szt.a ^ 131519607765197L;
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
                var9_3 = new String[26];
                var7_4 = 0;
                var6_5 = "\u00c0\u009c\u007f^\u00aa-F\u00e2T3xdI@\u00b9\u00dah\u00f5d\f\u00dc\bd\u00a1\u008e\u00aa\u00b9\u0002\u008f\u00f5\u00a6x\u0004\u0092\u00c4\u00ad\u00bb\u00d1\u00e9d\u0018T\u00dbp\u0093\u001f\u00c6\u00a8\u00ad`=\u00eb\u0095@\u00b5\u00a5)\u00b1\u00cc\u00ff\u00d1o+\u0005o\u0010\u008a\u001b\u00e6\n\u009b\u00a4\u00c11\u0013CE\u00b9\u0016\u00a2\u00d0\u0080\u0018\u00c7\u00cd*\u00ebd\u00d1\u00f0\u00b5\u00f3\b\u00b45\u00f8!\u00d0{$k\u00abw\u00ed\r\u0094\u00920\u008aI\u008f\u00e2`'$\u0093O8Nf\u00f5\u0095I*>\u0092\u00e7r&Z\u001e\u00ae\u008e\u00c8xm\u00c6\r>\u0003gR\u009e\u00f3J\u0086\u00ce\u0014=T*_\u00c7\u00dec\u00a5\u0010\u00d1\u0096\u00ee\u007f\u00b7\u00ef\u00fa<\u00e2\u00c4%c\u0096\u009a!b\u0010?\u00e8.'\u001f\u00e0\u00aa\u00f4@\u0016\r\u00a9\u0010\u0081\u009f\u00e5\u0010\u00d7\u00d3)\u00f6\u00fa\u00a9\u00a8\u00e2\u00cb|RZkV2\u00c5H\u000e\u009c\u00c9\u00a1\u00baE\u0089*i\u00d8\u001e;\u0019\u0080qH\u0018H6\u00e5X\u00cc\u001b\u009c'\u001e\u0007Z\u0085\f\u00e1\u0080~\u009d\u00c9\u0006\u00bd\"\u0002\u00a6\u0080\u00b7\u0003\u009ap\u00fd\u00898\u0011\u00e3+\u001cSc\"c\u0016\u00c7\u0097\u00d2mC\u00a9h<\u00cb\u00ac^|)\b\u00ab(\u009buI(i0\u00db\u0081f-\u00f8\u00e8\u0083\u00c7\u00ebs\u00b3\u00d6\\\t\u00e1\u00d6`\u00e4p15V\u008bO\u00f2\"\u009es\u00bf\u00a3K\u00ddH\u00bd\u0010@S\u00e35\u00fcg\u00e2@\u0092\u008d\\\u00db\u008a\u0005\u0017\u001c8\u0091Y.\u001ak\u0017\u00ab\u007f\u00d38U3$\u00b7x\u00ba\u00cf\u00ed\u0013\u00ef\u0093\u00d5x\u00d0\u0092&k0\u0088q\u00b02E \u00aeZ\u00d9\u0011\u00ec4\u00ee\u00f5e\u00c7\u0006J\u00c1\u00ed\u00aa\u00b3\u00e8\u00d3\u00f6\u00a2\u00cb\u0010(X\u00a7\u008c\u00e0Y,\u008b\u00ee^\u001f\u00d5p\u00cc<\u008f\u00c6a\u000e\u0098\u00d9\u00ae}\u00df\u00f5\u00c7X\u00c3\u0084\u00e8<\u0093\u00a0\u0014E\u00da\u00c4}G\u00b7\u00dd\u0010\u0092~\u00e5\u00e2\u00f7A<t\u0088\u00bc~\u00e5\u0018\u00a5a\u00c6\u0010\u00de\u00e8y\u007f\u00fe\u0005\u008d\u00f3\u00ad\u001dse\t\u001a\n\u00e7\u0010\u0084\u0003S\u009f\u00ec\u009221\u007f\u00bd\u0014\u00bfO\u00ef\u009c\u001f\u0018\u008d\u00df0x\u00b2\u00e7Bc\u0082\u0093\u0092\u0007\bL\u00c1\n\u00eb\u00a0\u00ac\u00d0\u00f1\r\u00e0\u00ee\u00184\u00c9\u00e2\u008a\u00cb}A\u00dd\u000bbdm\u00d2Z\b\u00e2\u00f4Puwg\u008d\u00edf\u0018HGX+U0\u001d\u001c\u00b5\u00df\u00fbK\u00da\u00e1\u00b1W\u000e\u00dd\\\u00ffg\u0011\u00ad\u00de \u00efj|\u0090\u0082\u00fc\u00d8\u001di\u00d5(\u008a\u0088\u00e9g-\u00f9$`\u00a5\u0097\u00b5&]\u00b4\u00c6\u00c8j\u007f\u00dc\u0095<\u0010\u0019*y\u00d3(\u00e1F\u00a1\"\u00f5'\u00b56)-\u00e0 N\u00a8\u00d5\f\"\u00ad\u00b1\u001aq>\u0005_\r9m\u001dg\u00b7\u0092\u00b7[\u00d5\u00dc\u00ecQ{\u00fa\u00920\u00c8\u007f\u0093\u0010v\u008c\u00d0\u0087\u00c2\u0091\u009fj\u00e0\u0093\u00b6\u0019B\u00ee\u000b\u00e4X4\u0094\u00c6H\u0013\u0019\u00cb\u00dd\u00d2\n\u00b1\u00b1\u00df\u009c\u0085\u00a0 \u00e0\u00e6C\u0001\u00fbU\u009a^\u00d5?\u00eb%v<\u0005Yd\u00b7O\u000e\u0092'W\u008a\u00e5H\u00aaI\n_\u00aa\u0007_\u00adh\f\u0001\u00dc\u00e4\u0003\u0017\u001d\u009c\u0098tT\u00fd\u0099\u00c3\u00ae\u00c0\u0091\u0086\u00c6`?\u0011D\u0094\u00ba\b\u00f9\u00fcaZZ&\u00ba[\u00cd\u0083";
                var8_6 = "\u00c0\u009c\u007f^\u00aa-F\u00e2T3xdI@\u00b9\u00dah\u00f5d\f\u00dc\bd\u00a1\u008e\u00aa\u00b9\u0002\u008f\u00f5\u00a6x\u0004\u0092\u00c4\u00ad\u00bb\u00d1\u00e9d\u0018T\u00dbp\u0093\u001f\u00c6\u00a8\u00ad`=\u00eb\u0095@\u00b5\u00a5)\u00b1\u00cc\u00ff\u00d1o+\u0005o\u0010\u008a\u001b\u00e6\n\u009b\u00a4\u00c11\u0013CE\u00b9\u0016\u00a2\u00d0\u0080\u0018\u00c7\u00cd*\u00ebd\u00d1\u00f0\u00b5\u00f3\b\u00b45\u00f8!\u00d0{$k\u00abw\u00ed\r\u0094\u00920\u008aI\u008f\u00e2`'$\u0093O8Nf\u00f5\u0095I*>\u0092\u00e7r&Z\u001e\u00ae\u008e\u00c8xm\u00c6\r>\u0003gR\u009e\u00f3J\u0086\u00ce\u0014=T*_\u00c7\u00dec\u00a5\u0010\u00d1\u0096\u00ee\u007f\u00b7\u00ef\u00fa<\u00e2\u00c4%c\u0096\u009a!b\u0010?\u00e8.'\u001f\u00e0\u00aa\u00f4@\u0016\r\u00a9\u0010\u0081\u009f\u00e5\u0010\u00d7\u00d3)\u00f6\u00fa\u00a9\u00a8\u00e2\u00cb|RZkV2\u00c5H\u000e\u009c\u00c9\u00a1\u00baE\u0089*i\u00d8\u001e;\u0019\u0080qH\u0018H6\u00e5X\u00cc\u001b\u009c'\u001e\u0007Z\u0085\f\u00e1\u0080~\u009d\u00c9\u0006\u00bd\"\u0002\u00a6\u0080\u00b7\u0003\u009ap\u00fd\u00898\u0011\u00e3+\u001cSc\"c\u0016\u00c7\u0097\u00d2mC\u00a9h<\u00cb\u00ac^|)\b\u00ab(\u009buI(i0\u00db\u0081f-\u00f8\u00e8\u0083\u00c7\u00ebs\u00b3\u00d6\\\t\u00e1\u00d6`\u00e4p15V\u008bO\u00f2\"\u009es\u00bf\u00a3K\u00ddH\u00bd\u0010@S\u00e35\u00fcg\u00e2@\u0092\u008d\\\u00db\u008a\u0005\u0017\u001c8\u0091Y.\u001ak\u0017\u00ab\u007f\u00d38U3$\u00b7x\u00ba\u00cf\u00ed\u0013\u00ef\u0093\u00d5x\u00d0\u0092&k0\u0088q\u00b02E \u00aeZ\u00d9\u0011\u00ec4\u00ee\u00f5e\u00c7\u0006J\u00c1\u00ed\u00aa\u00b3\u00e8\u00d3\u00f6\u00a2\u00cb\u0010(X\u00a7\u008c\u00e0Y,\u008b\u00ee^\u001f\u00d5p\u00cc<\u008f\u00c6a\u000e\u0098\u00d9\u00ae}\u00df\u00f5\u00c7X\u00c3\u0084\u00e8<\u0093\u00a0\u0014E\u00da\u00c4}G\u00b7\u00dd\u0010\u0092~\u00e5\u00e2\u00f7A<t\u0088\u00bc~\u00e5\u0018\u00a5a\u00c6\u0010\u00de\u00e8y\u007f\u00fe\u0005\u008d\u00f3\u00ad\u001dse\t\u001a\n\u00e7\u0010\u0084\u0003S\u009f\u00ec\u009221\u007f\u00bd\u0014\u00bfO\u00ef\u009c\u001f\u0018\u008d\u00df0x\u00b2\u00e7Bc\u0082\u0093\u0092\u0007\bL\u00c1\n\u00eb\u00a0\u00ac\u00d0\u00f1\r\u00e0\u00ee\u00184\u00c9\u00e2\u008a\u00cb}A\u00dd\u000bbdm\u00d2Z\b\u00e2\u00f4Puwg\u008d\u00edf\u0018HGX+U0\u001d\u001c\u00b5\u00df\u00fbK\u00da\u00e1\u00b1W\u000e\u00dd\\\u00ffg\u0011\u00ad\u00de \u00efj|\u0090\u0082\u00fc\u00d8\u001di\u00d5(\u008a\u0088\u00e9g-\u00f9$`\u00a5\u0097\u00b5&]\u00b4\u00c6\u00c8j\u007f\u00dc\u0095<\u0010\u0019*y\u00d3(\u00e1F\u00a1\"\u00f5'\u00b56)-\u00e0 N\u00a8\u00d5\f\"\u00ad\u00b1\u001aq>\u0005_\r9m\u001dg\u00b7\u0092\u00b7[\u00d5\u00dc\u00ecQ{\u00fa\u00920\u00c8\u007f\u0093\u0010v\u008c\u00d0\u0087\u00c2\u0091\u009fj\u00e0\u0093\u00b6\u0019B\u00ee\u000b\u00e4X4\u0094\u00c6H\u0013\u0019\u00cb\u00dd\u00d2\n\u00b1\u00b1\u00df\u009c\u0085\u00a0 \u00e0\u00e6C\u0001\u00fbU\u009a^\u00d5?\u00eb%v<\u0005Yd\u00b7O\u000e\u0092'W\u008a\u00e5H\u00aaI\n_\u00aa\u0007_\u00adh\f\u0001\u00dc\u00e4\u0003\u0017\u001d\u009c\u0098tT\u00fd\u0099\u00c3\u00ae\u00c0\u0091\u0086\u00c6`?\u0011D\u0094\u00ba\b\u00f9\u00fcaZZ&\u00ba[\u00cd\u0083".length();
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
                    var9_3[var7_4++] = ekw$szt.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e0\u00e5t\u0005\u00ef\u00e1\u00a8\u00f5P\u00b5d\u00bdl\u000b\u0011\u00c7\u0010\u0087\u00e4i\u00c1\u0094\u008d\u001c\u00efj\u00be\u00d9}\u00c6\u00c1\u00ad\u008b";
                    var8_6 = "\u00e0\u00e5t\u0005\u00ef\u00e1\u00a8\u00f5P\u00b5d\u00bdl\u000b\u0011\u00c7\u0010\u0087\u00e4i\u00c1\u0094\u008d\u001c\u00efj\u00be\u00d9}\u00c6\u00c1\u00ad\u008b".length();
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
                    var9_3[var7_4++] = ekw$szt.a(var10_9).intern();
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
        ekw$szt.b = var9_3;
        ekw$szt.c = new String[26];
        var11_10 = new GsonBuilder();
        var11_10.registerTypeHierarchyAdapter(ekw.class, (Object)new ekw$szt());
        var11_10.registerTypeHierarchyAdapter(poy.class, (Object)new poy$vcg());
        var11_10.registerTypeAdapterFactory((TypeAdapterFactory)new lhs());
        ekw$szt.pw2 = var11_10.create();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x68A8;
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
                throw new RuntimeException("ekw$szt", exception);
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
            ekw$szt.c[n2] = ekw$szt.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ekw$szt.a(n, l);
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
            throw new RuntimeException("ekw$szt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ekw$szt.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

