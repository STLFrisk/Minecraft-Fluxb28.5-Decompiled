/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class c7z
implements b9a {
    private static final Logger go7;
    private final Map bn6 = Maps.newHashMap();
    private final Set eqf = Sets.newHashSet();
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    /*
     * Unable to fully structure code
     */
    @Override
    public int q2n(e7r var1_1, String var2_2) {
        block29: {
            block25: {
                block27: {
                    block28: {
                        block26: {
                            block24: {
                                block22: {
                                    block23: {
                                        var3_3 = c7z.a ^ 131388912506111L;
                                        var5_4 = t9d.b();
                                        var2_2 = var2_2.trim();
                                        try {
                                            v0 = var2_2;
                                            v1 = "/";
                                            if (var5_4 == 0) break block22;
                                            if (!v0.startsWith(v1)) break block23;
                                        }
                                        catch (oov v2) {
                                            throw c7z.a(v2);
                                        }
                                        var2_2 = var2_2.substring(1);
                                    }
                                    v0 = var2_2;
                                    v1 = " ";
                                }
                                var6_5 = v0.split(v1);
                                var7_6 = var6_5[0];
                                var6_5 = c7z.h61(var6_5);
                                var8_7 = (on1)this.bn6.get(var7_6);
                                var9_8 = this.kbr(var8_7, var6_5);
                                var10_9 = 0;
                                try {
                                    v3 = var8_7;
                                    if (var5_4 == 0) break block24;
                                    if (v3 == null) {
                                    }
                                    ** GOTO lbl39
                                }
                                catch (oov v4) {
                                    throw c7z.a(v4);
                                }
                                var11_10 = new hsu((String)c7z.a("w", (int)18765, (long)(3063915833300670808L ^ var3_3)), new Object[0]);
                                try {
                                    var11_10.f4q().vyb(syo.aez);
                                    var1_1.a0d((ekw)var11_10);
                                    if (var5_4 != 0) break block25;
lbl39:
                                    // 2 sources

                                    v3 = var8_7;
                                }
                                catch (oov v5) {
                                    throw c7z.a(v5);
                                }
                            }
                            try {
                                v6 = v3.m6l(var1_1);
                                if (var5_4 == 0) break block26;
                                if (v6 == 0) break block27;
                            }
                            catch (oov v7) {
                                throw c7z.a(v7);
                            }
                            v6 = var9_8;
                        }
                        try {
                            if (var5_4 == 0) break block28;
                            if (v6 > -1) {
                            }
                            ** GOTO lbl78
                        }
                        catch (oov v8) {
                            throw c7z.a(v8);
                        }
                        var11_10 = z83.mib(var1_1, var6_5[var9_8], i2h.class);
                        var12_11 = var6_5[var9_8];
                        var1_1.io9(n_k$pbp.byu, var11_10.size());
                        for (i2h var14_13 : var11_10) {
                            block30: {
                                try {
                                    var6_5[var9_8] = var14_13.b_q().toString();
                                    v6 = (int)this.ysu(var1_1, var6_5, var8_7, var2_2);
                                    if (var5_4 == 0) break block29;
                                    if (v6 == 0) break block30;
                                }
                                catch (oov v9) {
                                    throw c7z.a(v9);
                                }
                                ++var10_9;
                            }
                            if (var5_4 != 0) continue;
                        }
                        try {
                            var6_5[var9_8] = var12_11;
                            if (var5_4 != 0) break block25;
lbl78:
                            // 2 sources

                            var1_1.io9(n_k$pbp.byu, 1);
                            v6 = (int)this.ysu(var1_1, var6_5, var8_7, var2_2);
                        }
                        catch (oov v10) {
                            throw c7z.a(v10);
                        }
                    }
                    try {
                        try {
                            if (var5_4 == 0) break block29;
                            if (v6 == 0) break block25;
                        }
                        catch (oov v11) {
                            throw c7z.a(v11);
                        }
                        ++var10_9;
                        if (var5_4 == 0) {
                        }
                        break block25;
                    }
                    catch (oov v12) {
                        throw c7z.a(v12);
                    }
                }
                var11_10 = new hsu((String)c7z.a("w", (int)19320, (long)(835946023850564458L ^ var3_3)), new Object[0]);
                var11_10.f4q().vyb(syo.aez);
                var1_1.a0d((ekw)var11_10);
            }
            var1_1.io9(n_k$pbp.c_c, var10_9);
            v6 = var10_9;
        }
        return v6;
    }

    public boolean ysu(e7r e7r2, String[] stringArray, on1 on12, String string) {
        long l = a ^ 0x792E1F90053CL;
        try {
            on12.l3z(e7r2, stringArray);
            return true;
        }
        catch (w57 w572) {
            hsu hsu2 = new hsu((String)((Object)c7z.a("w", (int)3478, (long)(0x35D300D529C8C45L ^ l))), new Object[]{new hsu(w572.getMessage(), w572._0v())});
            hsu2.f4q().vyb(syo.aez);
            e7r2.a0d(hsu2);
        }
        catch (uvb uvb2) {
            hsu hsu3 = new hsu(uvb2.getMessage(), uvb2._0v());
            hsu3.f4q().vyb(syo.aez);
            e7r2.a0d(hsu3);
        }
        catch (Throwable throwable) {
            hsu hsu4 = new hsu((String)((Object)c7z.a("w", (int)12312, (long)(0x1CE2ECAC23F831C8L ^ l))), new Object[0]);
            hsu4.f4q().vyb(syo.aez);
            e7r2.a0d(hsu4);
            go7.warn((String)((Object)c7z.a("w", (int)1330, (long)(0x639D8C815C7184E0L ^ l))) + string + "'");
        }
        return false;
    }

    public on1 wvr(on1 on12) {
        on1 on13;
        block11: {
            this.bn6.put(on12.xue(), on12);
            this.eqf.add(on12);
            Iterator iterator = on12.dnz().iterator();
            int n = t9d.c();
            while (iterator.hasNext()) {
                block12: {
                    String string = (String)iterator.next();
                    on1 on14 = (on1)this.bn6.get(string);
                    try {
                        Object object;
                        block13: {
                            try {
                                try {
                                    try {
                                        try {
                                            on13 = on14;
                                            if (n != 0) break block11;
                                            if (n != 0) break block12;
                                        }
                                        catch (oov oov2) {
                                            throw c7z.a(oov2);
                                        }
                                        if (on13 == null) break block13;
                                    }
                                    catch (oov oov3) {
                                        throw c7z.a(oov3);
                                    }
                                    object = on14.xue();
                                    if (n != 0) break block12;
                                }
                                catch (oov oov4) {
                                    throw c7z.a(oov4);
                                }
                                if (((String)object).equals(string)) break block12;
                            }
                            catch (oov oov5) {
                                throw c7z.a(oov5);
                            }
                        }
                        object = this.bn6.put(string, on12);
                    }
                    catch (oov oov6) {
                        throw c7z.a(oov6);
                    }
                }
                if (n == 0) continue;
            }
            on13 = on12;
        }
        return on13;
    }

    private static String[] h61(String[] stringArray) {
        String[] stringArray2 = new String[stringArray.length - 1];
        System.arraycopy(stringArray, 1, stringArray2, 0, stringArray.length - 1);
        return stringArray2;
    }

    @Override
    public List _tv(e7r e7r2, String string, mew mew2) {
        block26: {
            e7r e7r3;
            on1 on12;
            String[] stringArray;
            block28: {
                on1 on13;
                int n;
                block27: {
                    Object object;
                    block25: {
                        int n2;
                        int n3;
                        String string2;
                        block21: {
                            block22: {
                                stringArray = string.split(" ", -1);
                                string2 = stringArray[0];
                                n = t9d.c();
                                try {
                                    n3 = stringArray.length;
                                    n2 = 1;
                                    if (n != 0) break block21;
                                    if (n3 != n2) break block22;
                                }
                                catch (oov oov2) {
                                    throw c7z.a(oov2);
                                }
                                ArrayList arrayList = Lists.newArrayList();
                                for (Map.Entry entry : this.bn6.entrySet()) {
                                    block24: {
                                        boolean bl;
                                        block23: {
                                            try {
                                                try {
                                                    bl = bc_.ufz(string2, (String)entry.getKey());
                                                    if (n != 0) break block23;
                                                    if (!bl) break block24;
                                                }
                                                catch (oov oov3) {
                                                    throw c7z.a(oov3);
                                                }
                                                bl = ((on1)entry.getValue()).m6l(e7r2);
                                            }
                                            catch (oov oov4) {
                                                throw c7z.a(oov4);
                                            }
                                        }
                                        try {
                                            try {
                                                if (n != 0 || !bl) break block24;
                                            }
                                            catch (oov oov5) {
                                                throw c7z.a(oov5);
                                            }
                                            bl = arrayList.add(entry.getKey());
                                        }
                                        catch (oov oov6) {
                                            throw c7z.a(oov6);
                                        }
                                    }
                                    if (n == 0) continue;
                                }
                                return arrayList;
                            }
                            try {
                                object = stringArray;
                                if (n != 0) break block25;
                                n3 = ((String[])object).length;
                                n2 = 1;
                            }
                            catch (oov oov7) {
                                throw c7z.a(oov7);
                            }
                        }
                        try {
                            if (n3 <= n2) break block26;
                            object = this.bn6.get(string2);
                        }
                        catch (oov oov8) {
                            throw c7z.a(oov8);
                        }
                    }
                    on13 = (on1)object;
                    try {
                        on12 = on13;
                        if (n != 0) break block27;
                        if (on12 == null) break block26;
                    }
                    catch (oov oov9) {
                        throw c7z.a(oov9);
                    }
                    on12 = on13;
                }
                try {
                    try {
                        e7r3 = e7r2;
                        if (n != 0) break block28;
                        if (!on12.m6l(e7r3)) break block26;
                    }
                    catch (oov oov10) {
                        throw c7z.a(oov10);
                    }
                    on12 = on13;
                    e7r3 = e7r2;
                }
                catch (oov oov11) {
                    throw c7z.a(oov11);
                }
            }
            return on12.ggu(e7r3, c7z.h61(stringArray), mew2);
        }
        return null;
    }

    @Override
    public List ic2(e7r e7r2) {
        ArrayList arrayList = Lists.newArrayList();
        Iterator iterator = this.eqf.iterator();
        int n = t9d.b();
        while (iterator.hasNext()) {
            block5: {
                on1 on12 = (on1)iterator.next();
                try {
                    boolean bl;
                    try {
                        bl = on12.m6l(e7r2);
                        if (n == 0 || !bl) break block5;
                    }
                    catch (oov oov2) {
                        throw c7z.a(oov2);
                    }
                    bl = arrayList.add(on12);
                }
                catch (oov oov3) {
                    throw c7z.a(oov3);
                }
            }
            if (n != 0) continue;
        }
        return arrayList;
    }

    @Override
    public Map bef() {
        return this.bn6;
    }

    private int kbr(on1 on12, String[] stringArray) {
        int n;
        block12: {
            int n2 = t9d.b();
            try {
                if (on12 == null) {
                    return -1;
                }
            }
            catch (oov oov2) {
                throw c7z.a(oov2);
            }
            for (int i = 0; i < stringArray.length; ++i) {
                int n3;
                block14: {
                    block13: {
                        try {
                            try {
                                try {
                                    n = on12.mp9(stringArray, i) ? 1 : 0;
                                    if (n2 == 0) break block12;
                                    if (n2 == 0) break block13;
                                }
                                catch (oov oov3) {
                                    throw c7z.a(oov3);
                                }
                                if (n == 0) continue;
                            }
                            catch (oov oov4) {
                                throw c7z.a(oov4);
                            }
                            n3 = z83.ceg(stringArray[i]) ? 1 : 0;
                        }
                        catch (oov oov5) {
                            throw c7z.a(oov5);
                        }
                    }
                    try {
                        if (n2 == 0) break block14;
                        if (n3 == false) continue;
                    }
                    catch (oov oov6) {
                        throw c7z.a(oov6);
                    }
                    n3 = i;
                }
                return n3;
            }
            n = -1;
        }
        return n;
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

                c7z.a = c.a(3225840241819023770L, 8532386769194582798L, MethodHandles.lookup().lookupClass()).a(181671278526226L);
                c7z.e = new HashMap<K, V>(13);
                var0 = c7z.a ^ 97823130636029L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u000bi\u00a2\u00e6\u009c%\u0014;\u0019\u00e1\u00a2\u00003\u0005\u00e8\u00cfO{U\u00b6\u00c3[\u0098\u0084\u000f'75^\u00de\u00d2+\u0012\u008d\u00b8r\u0010\u00d8H\u001f9\u0011\u0087}[\u00b9\u00e1\u000e\u00dd%\b\u00e6\u001e2\u009a\u00ba(\u009e\u000f\u00c4$\u0097\u0085\u0081\u00e9$\u00b4\u00f9\u00ba|\u008ar\u00f0\u0089\u0088\u00e1\u001fI\u0091\u00f3\u008bz\u00edP%W\u00bf\u00b1S\u000f\u00d5\u0094\u00f5\u00e3%\u001f,8+b\u00d1\u00b7&\u0083\b^\u00a5\u0083\u00f4\u00a5\u0018\u0019^\u008a_N\u0097\u0096\n3k\u00a7\u00d1\u00ba`R\u00a9\u00d0\u00e1\u00cc\u00e1;+\t\u008fT\u00dc\u00de\u00c8\u0018\u00a8\u001a\u00abP\u0019I/\u009d\u00e0\u009f}\u0096R\u00a8";
                var8_6 = "\u000bi\u00a2\u00e6\u009c%\u0014;\u0019\u00e1\u00a2\u00003\u0005\u00e8\u00cfO{U\u00b6\u00c3[\u0098\u0084\u000f'75^\u00de\u00d2+\u0012\u008d\u00b8r\u0010\u00d8H\u001f9\u0011\u0087}[\u00b9\u00e1\u000e\u00dd%\b\u00e6\u001e2\u009a\u00ba(\u009e\u000f\u00c4$\u0097\u0085\u0081\u00e9$\u00b4\u00f9\u00ba|\u008ar\u00f0\u0089\u0088\u00e1\u001fI\u0091\u00f3\u008bz\u00edP%W\u00bf\u00b1S\u000f\u00d5\u0094\u00f5\u00e3%\u001f,8+b\u00d1\u00b7&\u0083\b^\u00a5\u0083\u00f4\u00a5\u0018\u0019^\u008a_N\u0097\u0096\n3k\u00a7\u00d1\u00ba`R\u00a9\u00d0\u00e1\u00cc\u00e1;+\t\u008fT\u00dc\u00de\u00c8\u0018\u00a8\u001a\u00abP\u0019I/\u009d\u00e0\u009f}\u0096R\u00a8".length();
                var5_7 = 56;
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
                    var9_3[var7_4++] = c7z.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00d4\u0093\u00c8\"\u00c9\b\u00ff\u0016\u001a0mKw\u00c94\u00a3\u00be!:\u00d3_x\u001f\u001c)\u0081v\u00c2h7\u0099\u0085\u00d3_\u00f6\u00b0_\u001e\u00cad?y\u00a0\u00b4\u00ba\u0005,ffiJ\u00e1\u00e6\u00aeY}0'I\t%\u00e6\u00cf6\u00985t\\g\u00ca\u0019\u00b2\u00ce\u00998q\u00c5nU\u00a5\u0090\u00ddq\u00b5\u0084\u008e\u0097\u0093\u00a6d\u0098\u00ee\u0095$@\u00d9\u00e2e%\u0017H\u00a8X$\u00ea";
                    var8_6 = "\u00d4\u0093\u00c8\"\u00c9\b\u00ff\u0016\u001a0mKw\u00c94\u00a3\u00be!:\u00d3_x\u001f\u001c)\u0081v\u00c2h7\u0099\u0085\u00d3_\u00f6\u00b0_\u001e\u00cad?y\u00a0\u00b4\u00ba\u0005,ffiJ\u00e1\u00e6\u00aeY}0'I\t%\u00e6\u00cf6\u00985t\\g\u00ca\u0019\u00b2\u00ce\u00998q\u00c5nU\u00a5\u0090\u00ddq\u00b5\u0084\u008e\u0097\u0093\u00a6d\u0098\u00ee\u0095$@\u00d9\u00e2e%\u0017H\u00a8X$\u00ea".length();
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
                    var9_3[var7_4++] = c7z.a(var10_9).intern();
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
        c7z.c = var9_3;
        c7z.d = new String[5];
        c7z.go7 = LogManager.getLogger();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xA3B;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("c7z", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            c7z.d[n2] = c7z.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = c7z.a(n, l);
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
            throw new RuntimeException("c7z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c7z.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

