/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.FileUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.server.S37PacketStatistics;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dc5
extends ik0 {
    private static final Logger pmy;
    private final vr1 aux;
    private final File oum;
    private final Set ufg = Sets.newHashSet();
    private int u4x = -300;
    private boolean l26 = false;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public dc5(vr1 vr12, File file) {
        this.aux = vr12;
        this.oum = file;
    }

    /*
     * Unable to fully structure code
     */
    public void r_t() {
        block6: {
            var1_1 = dc5.a ^ 69734416327505L;
            var3_2 = t9d.c();
            try {
                v0 = this;
                if (var3_2 == 0) {
                    if (!v0.oum.isFile()) break block6;
                }
                ** GOTO lbl14
            }
            catch (IOException v1) {
                throw dc5.a(v1);
            }
            try {
                this.q48.clear();
                v0 = this;
lbl14:
                // 2 sources

                v0.q48.putAll(this.uek(FileUtils.readFileToString((File)this.oum)));
            }
            catch (IOException var4_3) {
                dc5.pmy.error((String)dc5.a("m", (int)30370, (long)(7644111683560270810L ^ var1_1)) + this.oum, (Throwable)var4_3);
            }
            catch (JsonParseException var4_4) {
                dc5.pmy.error((String)dc5.a("m", (int)32294, (long)(3689145795137856346L ^ var1_1)) + this.oum, (Throwable)var4_4);
            }
        }
    }

    public void oce() {
        long l = a ^ 0x720EB2849607L;
        try {
            FileUtils.writeStringToFile((File)this.oum, (String)dc5.ip9(this.q48));
        }
        catch (IOException iOException) {
            pmy.error((String)((Object)dc5.a("m", (int)8031, (long)(0x3A8A47869D7AB77EL ^ l))), (Throwable)iOException);
        }
    }

    @Override
    public void xzh(ha9 ha92, _ss _ss2, int n) {
        block39: {
            vr1 vr12;
            long l;
            block42: {
                int n2;
                block41: {
                    int n3;
                    block40: {
                        block38: {
                            int n4;
                            block36: {
                                block37: {
                                    int n5;
                                    block34: {
                                        block35: {
                                            l = a ^ 0xFE79358AB26L;
                                            n3 = t9d.c();
                                            try {
                                                try {
                                                    n5 = _ss2.koi();
                                                    if (n3 != 0) break block34;
                                                    if (n5 == 0) break block35;
                                                }
                                                catch (JsonParseException jsonParseException) {
                                                    throw dc5.a(jsonParseException);
                                                }
                                                n5 = this.zgq(_ss2);
                                                break block34;
                                            }
                                            catch (JsonParseException jsonParseException) {
                                                throw dc5.a(jsonParseException);
                                            }
                                        }
                                        n5 = 0;
                                    }
                                    n4 = n5;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    super.xzh(ha92, _ss2, n);
                                                                    this.ufg.add(_ss2);
                                                                    n2 = _ss2.koi();
                                                                    if (n3 != 0) break block36;
                                                                    if (n2 == 0) break block37;
                                                                }
                                                                catch (JsonParseException jsonParseException) {
                                                                    throw dc5.a(jsonParseException);
                                                                }
                                                                n2 = n4;
                                                                if (n3 != 0) break block36;
                                                            }
                                                            catch (JsonParseException jsonParseException) {
                                                                throw dc5.a(jsonParseException);
                                                            }
                                                            if (n2 != 0) break block37;
                                                        }
                                                        catch (JsonParseException jsonParseException) {
                                                            throw dc5.a(jsonParseException);
                                                        }
                                                        n2 = n;
                                                        if (n3 != 0) break block36;
                                                    }
                                                    catch (JsonParseException jsonParseException) {
                                                        throw dc5.a(jsonParseException);
                                                    }
                                                    if (n2 <= 0) break block37;
                                                }
                                                catch (JsonParseException jsonParseException) {
                                                    throw dc5.a(jsonParseException);
                                                }
                                                this.l26 = true;
                                                n2 = this.aux.akt() ? 1 : 0;
                                                if (n3 != 0) break block36;
                                            }
                                            catch (JsonParseException jsonParseException) {
                                                throw dc5.a(jsonParseException);
                                            }
                                            if (n2 != 0) {
                                            }
                                            break block37;
                                        }
                                        catch (JsonParseException jsonParseException) {
                                            throw dc5.a(jsonParseException);
                                        }
                                        this.aux.wh3().d3z(new hsu((String)((Object)dc5.a("m", (int)29656, (long)(0x23BE69E17FDC66DAL ^ l))), new Object[]{ha92.xyw(), _ss2.zv4()}));
                                    }
                                    catch (JsonParseException jsonParseException) {
                                        throw dc5.a(jsonParseException);
                                    }
                                }
                                n2 = _ss2.koi() ? 1 : 0;
                            }
                            try {
                                if (n3 != 0) break block38;
                                if (n2 == 0) break block39;
                            }
                            catch (JsonParseException jsonParseException) {
                                throw dc5.a(jsonParseException);
                            }
                            n2 = n4;
                        }
                        try {
                            if (n3 != 0) break block40;
                            if (n2 <= 0) break block39;
                        }
                        catch (JsonParseException jsonParseException) {
                            throw dc5.a(jsonParseException);
                        }
                        n2 = n;
                    }
                    try {
                        try {
                            try {
                                if (n3 != 0) break block41;
                                if (n2 != 0) break block39;
                            }
                            catch (JsonParseException jsonParseException) {
                                throw dc5.a(jsonParseException);
                            }
                            this.l26 = true;
                            vr12 = this.aux;
                            if (n3 != 0) break block42;
                        }
                        catch (JsonParseException jsonParseException) {
                            throw dc5.a(jsonParseException);
                        }
                        n2 = vr12.akt() ? 1 : 0;
                    }
                    catch (JsonParseException jsonParseException) {
                        throw dc5.a(jsonParseException);
                    }
                }
                try {
                    if (n2 != 0) {
                        vr12 = this.aux;
                    }
                    break block39;
                }
                catch (JsonParseException jsonParseException) {
                    throw dc5.a(jsonParseException);
                }
            }
            vr12.wh3().d3z(new hsu((String)((Object)dc5.a("m", (int)32413, (long)(0xEC8653F1E66EB99L ^ l))), new Object[]{ha92.xyw(), _ss2.zv4()}));
        }
    }

    public Set twl() {
        HashSet hashSet = Sets.newHashSet((Iterable)this.ufg);
        this.ufg.clear();
        this.l26 = false;
        return hashSet;
    }

    /*
     * Unable to fully structure code
     */
    public Map uek(String var1_1) {
        block40: {
            block41: {
                var2_2 = dc5.a ^ 42499207847020L;
                var4_3 = t9d.c();
                var5_4 = new JsonParser().parse(var1_1);
                v0 = var5_4;
                if (var4_3 != 0) break block40;
                try {
                    block48: {
                        if (v0.isJsonObject()) break block41;
                        break block48;
                        catch (Throwable v1) {
                            throw dc5.a(v1);
                        }
                    }
                    return Maps.newHashMap();
                }
                catch (Throwable v2) {
                    throw dc5.a(v2);
                }
            }
            v0 = var5_4;
        }
        var6_5 = v0.getAsJsonObject();
        var7_6 = Maps.newHashMap();
        for (Map.Entry var9_8 : var6_5.entrySet()) {
            block47: {
                block44: {
                    block43: {
                        block45: {
                            block46: {
                                block57: {
                                    block56: {
                                        block55: {
                                            block54: {
                                                block42: {
                                                    block52: {
                                                        block51: {
                                                            block50: {
                                                                block49: {
                                                                    var10_9 = l9p._02((String)var9_8.getKey());
                                                                    if (var10_9 == null) ** GOTO lbl151
                                                                    var11_10 = new blu();
                                                                    v3 = ((JsonElement)var9_8.getValue()).isJsonPrimitive();
                                                                    if (var4_3 != 0) break block42;
                                                                    if (!v3) ** GOTO lbl53
                                                                    break block49;
                                                                    catch (Throwable v4) {
                                                                        throw dc5.a(v4);
                                                                    }
                                                                }
                                                                v3 = ((JsonElement)var9_8.getValue()).getAsJsonPrimitive().isNumber();
                                                                if (var4_3 != 0) break block42;
                                                                break block50;
                                                                catch (Throwable v5) {
                                                                    throw dc5.a(v5);
                                                                }
                                                            }
                                                            if (!v3) ** GOTO lbl53
                                                            break block51;
                                                            catch (Throwable v6) {
                                                                throw dc5.a(v6);
                                                            }
                                                        }
                                                        var11_10.uvg(((JsonElement)var9_8.getValue()).getAsInt());
                                                        if (var4_3 == 0) break block43;
                                                        break block52;
                                                        catch (Throwable v7) {
                                                            throw dc5.a(v7);
                                                        }
                                                    }
                                                    try {
                                                        block53: {
                                                            v8 = (JsonElement)var9_8.getValue();
                                                            if (var4_3 != 0) break block44;
                                                            break block53;
                                                            catch (Throwable v9) {
                                                                throw dc5.a(v9);
                                                            }
                                                        }
                                                        v3 = v8.isJsonObject();
                                                    }
                                                    catch (Throwable v10) {
                                                        throw dc5.a(v10);
                                                    }
                                                }
                                                if (!v3) break block43;
                                                var12_11 = ((JsonElement)var9_8.getValue()).getAsJsonObject();
                                                v11 = var12_11.has((String)dc5.a("m", (int)16916, (long)(7560033411538231385L ^ var2_2)));
                                                if (var4_3 != 0) break block45;
                                                if (!v11) break block46;
                                                break block54;
                                                catch (Throwable v12) {
                                                    throw dc5.a(v12);
                                                }
                                            }
                                            v11 = var12_11.get((String)dc5.a("m", (int)30254, (long)(3288374870509261932L ^ var2_2))).isJsonPrimitive();
                                            if (var4_3 != 0) break block45;
                                            break block55;
                                            catch (Throwable v13) {
                                                throw dc5.a(v13);
                                            }
                                        }
                                        if (!v11) break block46;
                                        break block56;
                                        catch (Throwable v14) {
                                            throw dc5.a(v14);
                                        }
                                    }
                                    v11 = var12_11.get((String)dc5.a("m", (int)30254, (long)(3288374870509261932L ^ var2_2))).getAsJsonPrimitive().isNumber();
                                    if (var4_3 != 0) break block45;
                                    break block57;
                                    catch (Throwable v15) {
                                        throw dc5.a(v15);
                                    }
                                }
                                try {
                                    block58: {
                                        if (!v11) break block46;
                                        break block58;
                                        catch (Throwable v16) {
                                            throw dc5.a(v16);
                                        }
                                    }
                                    var11_10.uvg(var12_11.getAsJsonPrimitive((String)dc5.a("m", (int)30254, (long)(3288374870509261932L ^ var2_2))).getAsInt());
                                }
                                catch (Throwable v17) {
                                    throw dc5.a(v17);
                                }
                            }
                            try {
                                v8 = var12_11;
                                if (var4_3 != 0) break block44;
                                v11 = v8.has((String)dc5.a("m", (int)21329, (long)(1845961663782531357L ^ var2_2)));
                            }
                            catch (Throwable v18) {
                                throw dc5.a(v18);
                            }
                        }
                        if (!v11) break block43;
                        try {
                            block59: {
                                v8 = var10_9.yjl();
                                if (var4_3 != 0) break block44;
                                break block59;
                                catch (Throwable v19) {
                                    throw dc5.a(v19);
                                }
                            }
                            if (v8 == null) break block43;
                        }
                        catch (Throwable v20) {
                            throw dc5.a(v20);
                        }
                        try {
                            var13_12 = var10_9.yjl().getConstructor(new Class[0]);
                            var14_14 = (lhm)var13_12.newInstance(new Object[0]);
                            var14_14.wqy(var12_11.get((String)dc5.a("m", (int)25635, (long)(4697459335307462252L ^ var2_2))));
                            var11_10.jkb(var14_14);
                        }
                        catch (Throwable var13_13) {
                            dc5.pmy.warn((String)dc5.a("m", (int)1379, (long)(4567888741352400682L ^ var2_2)) + this.oum, var13_13);
                        }
                    }
                    v8 = var7_6.put(var10_9, var11_10);
                }
                try {
                    if (var4_3 == 0) break block47;
lbl151:
                    // 2 sources

                    dc5.pmy.warn((String)dc5.a("m", (int)4472, (long)(2488986186738692915L ^ var2_2)) + this.oum + (String)dc5.a("m", (int)25313, (long)(8449826195303661734L ^ var2_2)) + (String)var9_8.getKey() + (String)dc5.a("m", (int)10134, (long)(1377960515530704341L ^ var2_2)));
                }
                catch (Throwable v21) {
                    throw dc5.a(v21);
                }
            }
            if (var4_3 == 0) continue;
        }
        return var7_6;
    }

    /*
     * Unable to fully structure code
     */
    public static String ip9(Map var0) {
        var1_1 = dc5.a ^ 135605010988707L;
        var4_2 = new JsonObject();
        var5_3 = var0.entrySet().iterator();
        var3_4 = t9d.b();
        while (var5_3.hasNext()) {
            block6: {
                var6_5 = var5_3.next();
                if (((blu)var6_5.getValue()).q12() == null) ** GOTO lbl22
                var7_6 = new JsonObject();
                var7_6.addProperty((String)dc5.a("m", (int)30254, (long)(3288466069956277923L ^ var1_1)), (Number)((blu)var6_5.getValue()).tsb());
                try {
                    var7_6.add((String)dc5.a("m", (int)25635, (long)(4697509027971966115L ^ var1_1)), ((blu)var6_5.getValue()).q12().ni6());
                }
                catch (Throwable var8_7) {
                    dc5.pmy.warn((String)dc5.a("m", (int)23241, (long)(1377695893009046080L ^ var1_1)) + ((_ss)var6_5.getKey()).xn7() + (String)dc5.a("m", (int)25887, (long)(7193664818643641744L ^ var1_1)), var8_7);
                }
                try {
                    var4_2.add(((_ss)var6_5.getKey()).yr5, (JsonElement)var7_6);
                    if (var3_4 != 0) break block6;
lbl22:
                    // 2 sources

                    var4_2.addProperty(((_ss)var6_5.getKey()).yr5, (Number)((blu)var6_5.getValue()).tsb());
                }
                catch (Throwable v0) {
                    throw dc5.a(v0);
                }
            }
            if (var3_4 != 0) continue;
        }
        return var4_2.toString();
    }

    public void w92() {
        int n = t9d.c();
        for (_ss _ss2 : this.q48.keySet()) {
            this.ufg.add(_ss2);
            if (n == 0) continue;
        }
    }

    public void gts(z96 z962) {
        block13: {
            HashMap hashMap;
            block12: {
                dc5 dc52;
                int n;
                block10: {
                    int n2 = this.aux.g5u();
                    hashMap = Maps.newHashMap();
                    n = t9d.c();
                    try {
                        block11: {
                            try {
                                try {
                                    dc52 = this;
                                    if (n != 0) break block10;
                                    if (dc52.l26) break block11;
                                }
                                catch (JsonParseException jsonParseException) {
                                    throw dc5.a(jsonParseException);
                                }
                                if (n2 - this.u4x <= 300) break block12;
                            }
                            catch (JsonParseException jsonParseException) {
                                throw dc5.a(jsonParseException);
                            }
                        }
                        this.u4x = n2;
                        dc52 = this;
                    }
                    catch (JsonParseException jsonParseException) {
                        throw dc5.a(jsonParseException);
                    }
                }
                for (_ss _ss2 : dc52.twl()) {
                    try {
                        hashMap.put(_ss2, this.zgq(_ss2));
                        if (n == 0) {
                            if (n == 0) continue;
                            break;
                        }
                        break block13;
                    }
                    catch (JsonParseException jsonParseException) {
                        throw dc5.a(jsonParseException);
                    }
                }
            }
            z962.rhh.vnf(new S37PacketStatistics(hashMap));
        }
    }

    public void vd_(z96 z962) {
        block7: {
            HashMap hashMap = Maps.newHashMap();
            Iterator iterator = y8d.i0s.iterator();
            int n = t9d.c();
            while (iterator.hasNext()) {
                block8: {
                    l7l l7l2 = (l7l)iterator.next();
                    try {
                        boolean bl;
                        try {
                            try {
                                if (n != 0) break block7;
                                bl = this.ktg(l7l2);
                                if (n != 0) break block8;
                            }
                            catch (JsonParseException jsonParseException) {
                                throw dc5.a(jsonParseException);
                            }
                            if (!bl) break block8;
                        }
                        catch (JsonParseException jsonParseException) {
                            throw dc5.a(jsonParseException);
                        }
                        hashMap.put(l7l2, this.zgq(l7l2));
                        bl = this.ufg.remove(l7l2);
                    }
                    catch (JsonParseException jsonParseException) {
                        throw dc5.a(jsonParseException);
                    }
                }
                if (n == 0) continue;
            }
            z962.rhh.vnf(new S37PacketStatistics(hashMap));
        }
    }

    public boolean bzz() {
        return this.l26;
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

                dc5.a = c.a(7639695008995016675L, -7707791591917471960L, MethodHandles.lookup().lookupClass()).a(185613694142130L);
                dc5.d = new HashMap<K, V>(13);
                var0 = dc5.a ^ 121952428674873L;
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
                var9_3 = new String[15];
                var7_4 = 0;
                var6_5 = "\u00de\u00e84\u00001\u00fe\u00a8\u00cf\u00f5!h\u00c3\u00fe\u0094\u00cbN\u00c2'\u00c8\u00a0Lyu\u00fa\u00b2\u0092+\u00e9i*\u00b8\u009d\u00c5\u00cf\u00d3^\u00b8\u00a5s\u00e4(\u0084\u00d4\u00cb\u00e3D\u008c\u0086E\u00f1\u00fb\u00fe\u00a9'\u0002\u00e9\u00d0\u00e9\u00b9\u00d6\u00f3\u00a06=v\u00bb\u00d5r}\u00bc\u00dd\u00f15\u00ad\u00e4\u00cb\u001b\u00aa\u00b0\u000eS8\u000f\u00e0#l\u00a5\u0084\u0092\u00c2\u008d\t\u00e7M\u0004)T\u00e7\u00fb\u009e.>\u00d2\u00ff\u001d\u00ea\u007fT\u00f5\u00d040;\u0099\u00ac\u00acW\u0006C#'\u001d$w\u0081\u00c1\u009bn\u008a\u0094\u00e4V\u00ab\u00c3\u00b5\u008a\u000e\u00b6(\u0011\u0091T\u00bfY\u00a9|\u0098\u00bb)~\u00b1\u0087\u00c8<\u00c4\u00f4E\u00e4\u0016\u00bc\u00ba\u0006@\u00c0\u0084\u00b0E\r[\u00e9gV\u0082\u0084g@\u00b6\u00fbQ\u0018\u00e6\u00c3\u00df\u00d1\fu)t\u0082\u00d0{\u00cf\u001cP\u00935\u00dc\u00a3jn\u00bd\fc\u00ac0\bQ\u00db\u0080mG\u00e1\u0084\u00e9Xl\u00a3\u00b6\u0092A;a\u0018-\u00a7\u00a4\u000b\u00ae\u00f4\u0083\u00c4\u009e\u00d6\\\u0011\u00ac\u0003r(\u00c3\u00f7'\u0004Y\u00bb\u00ce\u00830\u0019\u00e0S\u00ef\u00e7\u0010\u00f8\u00bb`\u00b0*rrE\u00d8\u00e4e\u00b3Oq\u00dd\u009c\u0018\u0015J[\u00d4#\u00dc\u001e\u00b5\u00fc\u0006\u0082\u00de\u00e9\u0006f(\u00b9}\u00aa\u0005\u0094\u00eb\u0095\u00bd\u0010\u0092\u0095\u00dcD\b\u001eD\u00cf\u00bb`\rp3\u00faU\u00ae\u0010\u0019a\u009d\u0097\u0013-M\b\u00c0\u008f/\u00e4\u00ccA\u001b\u00ef0A\"\u00d30J\u00d4\u00cf\u00ce\u00f8u\u0087x\u00e3\u00fe\u00d8\u00fb\u009c`''8_\u00ac]hD\u0007~a\u00a9\u00a9\u0094Y\u00f3\u00e4\u00d7\u00d9\u0002\u00c2\u00f4\u00b2\u00bc\u00f6\u00b7\u0097@\u00d5\u00f78\u00c4\u00d8\u00ea\u008f\u00d5\u0092\u00eak\u0001P\u00f8<\u00feT\u00d1\\\u00b0+\u00e9\u009cH\u0092\u00ad\u00b7\u00c1Y9\u0011\u00b9\u00a3\u00b3\u001f\u0081\"\u00ed\u009c\u00daH\u00a2\u001eE\u00e4\u0087\u009e\u008f\u00e4\u00dbs\u00c0d\u00a3\u008c\u0017k;\u00e7(\u0002{\u0093\u008e\u00ddl\u00d2\u00dd\u00c3\u0012U'\u0010\u0007\u00e0J\u0097\u009d\u0098\u00f9a\u00ac\u00c1'\u000f\u0096k\u008au>\u00ce\u00d5bR\u00ed\u00dd\u0010\u00e6U\u00bd";
                var8_6 = "\u00de\u00e84\u00001\u00fe\u00a8\u00cf\u00f5!h\u00c3\u00fe\u0094\u00cbN\u00c2'\u00c8\u00a0Lyu\u00fa\u00b2\u0092+\u00e9i*\u00b8\u009d\u00c5\u00cf\u00d3^\u00b8\u00a5s\u00e4(\u0084\u00d4\u00cb\u00e3D\u008c\u0086E\u00f1\u00fb\u00fe\u00a9'\u0002\u00e9\u00d0\u00e9\u00b9\u00d6\u00f3\u00a06=v\u00bb\u00d5r}\u00bc\u00dd\u00f15\u00ad\u00e4\u00cb\u001b\u00aa\u00b0\u000eS8\u000f\u00e0#l\u00a5\u0084\u0092\u00c2\u008d\t\u00e7M\u0004)T\u00e7\u00fb\u009e.>\u00d2\u00ff\u001d\u00ea\u007fT\u00f5\u00d040;\u0099\u00ac\u00acW\u0006C#'\u001d$w\u0081\u00c1\u009bn\u008a\u0094\u00e4V\u00ab\u00c3\u00b5\u008a\u000e\u00b6(\u0011\u0091T\u00bfY\u00a9|\u0098\u00bb)~\u00b1\u0087\u00c8<\u00c4\u00f4E\u00e4\u0016\u00bc\u00ba\u0006@\u00c0\u0084\u00b0E\r[\u00e9gV\u0082\u0084g@\u00b6\u00fbQ\u0018\u00e6\u00c3\u00df\u00d1\fu)t\u0082\u00d0{\u00cf\u001cP\u00935\u00dc\u00a3jn\u00bd\fc\u00ac0\bQ\u00db\u0080mG\u00e1\u0084\u00e9Xl\u00a3\u00b6\u0092A;a\u0018-\u00a7\u00a4\u000b\u00ae\u00f4\u0083\u00c4\u009e\u00d6\\\u0011\u00ac\u0003r(\u00c3\u00f7'\u0004Y\u00bb\u00ce\u00830\u0019\u00e0S\u00ef\u00e7\u0010\u00f8\u00bb`\u00b0*rrE\u00d8\u00e4e\u00b3Oq\u00dd\u009c\u0018\u0015J[\u00d4#\u00dc\u001e\u00b5\u00fc\u0006\u0082\u00de\u00e9\u0006f(\u00b9}\u00aa\u0005\u0094\u00eb\u0095\u00bd\u0010\u0092\u0095\u00dcD\b\u001eD\u00cf\u00bb`\rp3\u00faU\u00ae\u0010\u0019a\u009d\u0097\u0013-M\b\u00c0\u008f/\u00e4\u00ccA\u001b\u00ef0A\"\u00d30J\u00d4\u00cf\u00ce\u00f8u\u0087x\u00e3\u00fe\u00d8\u00fb\u009c`''8_\u00ac]hD\u0007~a\u00a9\u00a9\u0094Y\u00f3\u00e4\u00d7\u00d9\u0002\u00c2\u00f4\u00b2\u00bc\u00f6\u00b7\u0097@\u00d5\u00f78\u00c4\u00d8\u00ea\u008f\u00d5\u0092\u00eak\u0001P\u00f8<\u00feT\u00d1\\\u00b0+\u00e9\u009cH\u0092\u00ad\u00b7\u00c1Y9\u0011\u00b9\u00a3\u00b3\u001f\u0081\"\u00ed\u009c\u00daH\u00a2\u001eE\u00e4\u0087\u009e\u008f\u00e4\u00dbs\u00c0d\u00a3\u008c\u0017k;\u00e7(\u0002{\u0093\u008e\u00ddl\u00d2\u00dd\u00c3\u0012U'\u0010\u0007\u00e0J\u0097\u009d\u0098\u00f9a\u00ac\u00c1'\u000f\u0096k\u008au>\u00ce\u00d5bR\u00ed\u00dd\u0010\u00e6U\u00bd".length();
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
                    var9_3[var7_4++] = dc5.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00da.[R\u0092\u0004\u00cc\u00e28\u00fcOd3\u008a\u009d^\u00ed/(\u0089\u00b5%\u00a9{:\u0092\fo\u0097\u001b\u00edr\u00ae\b\u00f9\u0012\u001b\u0016l\u00b3\u00ea\u007f;\u00da\u00a5\u00c2O\u00dd\u0086\u00d5\u00d9\u0086\u00a6\u0087\u00bb\u00f80\u00b2\u00c0\u00c9O\u00034\u00c9\u0016\u00dc\"\u0004\u0094\u0083\u001aB\u009d\u0018,5\u00c0\u00d2\u00e5\u0083P\u0096\u008fv\u009d\u00f6 ]\u007f4}\u001b\u00c7\u0093\u0006\u001e\u00ab\u00d3) \n|\u008d\u00fa3";
                    var8_6 = "\u00da.[R\u0092\u0004\u00cc\u00e28\u00fcOd3\u008a\u009d^\u00ed/(\u0089\u00b5%\u00a9{:\u0092\fo\u0097\u001b\u00edr\u00ae\b\u00f9\u0012\u001b\u0016l\u00b3\u00ea\u007f;\u00da\u00a5\u00c2O\u00dd\u0086\u00d5\u00d9\u0086\u00a6\u0087\u00bb\u00f80\u00b2\u00c0\u00c9O\u00034\u00c9\u0016\u00dc\"\u0004\u0094\u0083\u001aB\u009d\u0018,5\u00c0\u00d2\u00e5\u0083P\u0096\u008fv\u009d\u00f6 ]\u007f4}\u001b\u00c7\u0093\u0006\u001e\u00ab\u00d3) \n|\u008d\u00fa3".length();
                    var5_7 = 56;
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
                    var9_3[var7_4++] = dc5.a(var10_9).intern();
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
        dc5.b = var9_3;
        dc5.c = new String[15];
        dc5.pmy = LogManager.getLogger();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2BAE;
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
                throw new RuntimeException("dc5", exception);
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
            dc5.c[n2] = dc5.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dc5.a(n, l);
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
            throw new RuntimeException("dc5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dc5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

