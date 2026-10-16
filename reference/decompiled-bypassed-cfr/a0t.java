/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
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
import org.apache.logging.log4j.LogManager;

public class a0t
extends Enum {
    public static final a0t z8v;
    public static final a0t fwh;
    public static final a0t nil;
    public static final a0t le5;
    private static int uly;
    private static int u2c;
    private static final a0t[] su6;
    private static final Map mtt;
    private final int d9u;
    private final Map soq = Maps.newEnumMap(qat.class);
    private static final a0t[] ygy;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public static a0t[] values() {
        return (a0t[])ygy.clone();
    }

    public static a0t valueOf(String string) {
        return Enum.valueOf(a0t.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a0t() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.d9u = var3_1;
    }

    public a0t y07(qat qat2, Class clazz) {
        long l = a ^ 0x68F3284C2FCBL;
        BiMap biMap = (BiMap)this.soq.get((Object)qat2);
        if (biMap == null) {
            biMap = HashBiMap.create();
            this.soq.put(qat2, biMap);
        }
        if (biMap.containsValue((Object)clazz)) {
            String string = (Object)((Object)qat2) + (String)((Object)a0t.a("v", (int)25326, (long)(0x6F97A20E0DA991A8L ^ l))) + clazz + (String)((Object)a0t.a("v", (int)4823, (long)(0x150FC1BFE642E19FL ^ l))) + biMap.inverse().get((Object)clazz);
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        biMap.put((Object)biMap.size(), (Object)clazz);
        return this;
    }

    public Integer dhy(qat qat2, mz2 mz22) {
        return (Integer)((BiMap)this.soq.get((Object)qat2)).inverse().get(mz22.getClass());
    }

    public mz2 pz2(qat qat2, int n) {
        mz2 mz22;
        block6: {
            Class clazz;
            block4: {
                Class clazz2;
                block5: {
                    int n2 = t9d.b();
                    clazz2 = (Class)((BiMap)this.soq.get((Object)qat2)).get((Object)n);
                    try {
                        try {
                            clazz = clazz2;
                            if (n2 == 0) break block4;
                            if (clazz != null) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw a0t.a(illegalArgumentException);
                        }
                        mz22 = null;
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw a0t.a(illegalArgumentException);
                    }
                }
                clazz = clazz2.newInstance();
            }
            mz22 = (mz2)((Object)clazz);
        }
        return mz22;
    }

    public int jhj() {
        return this.d9u;
    }

    public static a0t abp(int n) {
        a0t a0t2;
        block8: {
            block7: {
                int n2;
                int n3;
                block6: {
                    int n4 = t9d.c();
                    try {
                        try {
                            n3 = n;
                            n2 = uly;
                            if (n4 != 0) break block6;
                            if (n3 < n2) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw a0t.a(illegalArgumentException);
                        }
                        n3 = n;
                        n2 = u2c;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw a0t.a(illegalArgumentException);
                    }
                }
                try {
                    if (n3 > n2) break block7;
                    a0t2 = su6[n - uly];
                    break block8;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw a0t.a(illegalArgumentException);
                }
            }
            a0t2 = null;
        }
        return a0t2;
    }

    public static a0t c5_(mz2 mz22) {
        return (a0t)((Object)mtt.get(mz22.getClass()));
    }

    /*
     * WARNING - void declaration
     */
    public a0t() {
        this((String)var1_-1, (int)a0t$1, (int)var3_2);
        void var3_2;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                a0t.a = c.a(7621718849811618949L, -495148344822023378L, MethodHandles.lookup().lookupClass()).a(164244658437567L);
                var9 = a0t.a ^ 47407464256962L;
                a0t.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[12];
                var5_4 = 0;
                var4_5 = "k\u0007\u00ea\u00de\u008e\u00d6\u0097=r\u00dbs\u00c4M\u0086k\u0089\u0010N\u0015h\u00f9\u00a7>\u0015\t:\u00a8\u00d6\u00bb\u001e\u00f4K\u00cb@\u00c9\u00d4\"\u00dcQ\u00e5\u00d7A{#z\u00e9H\u0001M`a\u00c9\f\u00e2\"w\u00bc\u00dbA\u0087\u00c4\u00bek-6\u00b6\u0018 \u00f9\u00ba<1?\u008fF\u00c1\u009cc\u00b7\u00d4Ap#5}\u00b0\u008e\n\u009d\u00a1\u008aJf\u0096q`\u0010^(\u00c5\u00bc;\u00df\u00c1\u00fe\u0012)\u009ev\u00ed\u00e7\u00b1\u009d\u008b\u00c0\u00f5\u00c6T^+7\u00fa\u00da\u00b5\u00ab7\u00f4H6\u00b7K\u0092?8a\u00bch\r\u0002\u0010\u00fan!\u0088^\u00e6\u00a1\u0000\u009aE\u0010\u00aa<\u00aek\u00198A{@*X\u00e8B~\u0014\u0011\u00fb\u00b9\u00a8)\u00c7\u00e5\t\u00d0\u00ef\u00a3\u0086(\u00e5\u001e\u00a4`\u0015\u0017\u00f0\u0094\u00b1\u00f8'\u00a2J\u00a4_\u009f\u0095\u00e5:\\\u00ed#`\u00c1\u00d9\u0012q\u0010B\u00e5m\u00ba\u0098\u00d3\u0010MM9\u00ec(\u00b3 z\u0091\u0095\u00138\u00b0\u008d\u00a7\u00e38~\u0092w\u0002B9p-\u008e\u0096A\u00cc\u008b`\u0086}0\u00dc\u00cfjP\u00c41}\u00dd\u00ca\u009b\u00e6\u00ef\u00df\u00a8\u001cm=\u00fd\u0081\\x\u00ab^\u00c2\u00ea\u0091xR\u008e\u00e0Y\n\u00f2\u00b3\u00a9\u00b4\u00f7\u00acK(\u00d9\u00d28\u00aa\u00ce\u0095x\u00e7\b\u0017\u00f3)3\\\u00b5E\u0016\u00a9k\u00d8\u00f2\u009a\u00af\u00f1\u00d3\u00b6p<\u00b2\u00c0\u00cd\u00f8\u0013\u00a6\u0084o\u0084J\u009d\u009f\u00180_tn\u0084\u0017_\u008aBF\u00f3\u0013Q$+\u009b\u0003fFv*\u00c0\u0010\u00c7";
                var6_6 = "k\u0007\u00ea\u00de\u008e\u00d6\u0097=r\u00dbs\u00c4M\u0086k\u0089\u0010N\u0015h\u00f9\u00a7>\u0015\t:\u00a8\u00d6\u00bb\u001e\u00f4K\u00cb@\u00c9\u00d4\"\u00dcQ\u00e5\u00d7A{#z\u00e9H\u0001M`a\u00c9\f\u00e2\"w\u00bc\u00dbA\u0087\u00c4\u00bek-6\u00b6\u0018 \u00f9\u00ba<1?\u008fF\u00c1\u009cc\u00b7\u00d4Ap#5}\u00b0\u008e\n\u009d\u00a1\u008aJf\u0096q`\u0010^(\u00c5\u00bc;\u00df\u00c1\u00fe\u0012)\u009ev\u00ed\u00e7\u00b1\u009d\u008b\u00c0\u00f5\u00c6T^+7\u00fa\u00da\u00b5\u00ab7\u00f4H6\u00b7K\u0092?8a\u00bch\r\u0002\u0010\u00fan!\u0088^\u00e6\u00a1\u0000\u009aE\u0010\u00aa<\u00aek\u00198A{@*X\u00e8B~\u0014\u0011\u00fb\u00b9\u00a8)\u00c7\u00e5\t\u00d0\u00ef\u00a3\u0086(\u00e5\u001e\u00a4`\u0015\u0017\u00f0\u0094\u00b1\u00f8'\u00a2J\u00a4_\u009f\u0095\u00e5:\\\u00ed#`\u00c1\u00d9\u0012q\u0010B\u00e5m\u00ba\u0098\u00d3\u0010MM9\u00ec(\u00b3 z\u0091\u0095\u00138\u00b0\u008d\u00a7\u00e38~\u0092w\u0002B9p-\u008e\u0096A\u00cc\u008b`\u0086}0\u00dc\u00cfjP\u00c41}\u00dd\u00ca\u009b\u00e6\u00ef\u00df\u00a8\u001cm=\u00fd\u0081\\x\u00ab^\u00c2\u00ea\u0091xR\u008e\u00e0Y\n\u00f2\u00b3\u00a9\u00b4\u00f7\u00acK(\u00d9\u00d28\u00aa\u00ce\u0095x\u00e7\b\u0017\u00f3)3\\\u00b5E\u0016\u00a9k\u00d8\u00f2\u009a\u00af\u00f1\u00d3\u00b6p<\u00b2\u00c0\u00cd\u00f8\u0013\u00a6\u0084o\u0084J\u009d\u009f\u00180_tn\u0084\u0017_\u008aBF\u00f3\u0013Q$+\u009b\u0003fFv*\u00c0\u0010\u00c7".length();
                var3_7 = 16;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block24;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = a0t.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00b0eI\u0087\u00f1~\u00a2\u00b0\u00bfIo\u00e7\u0084\u00c6F\u0084 s\r\u00d3<\u0099\u00d57\u00dds\u00bb\u00ad\u0085?\u00d6\u00f3'.K\u00c9_\u0019KE\u00eb\u00e6\u00a0\u0015\u0006\u0087(H\u00bd";
                    var6_6 = "\u00b0eI\u0087\u00f1~\u00a2\u00b0\u00bfIo\u00e7\u0084\u00c6F\u0084 s\r\u00d3<\u0099\u00d57\u00dds\u00bb\u00ad\u0085?\u00d6\u00f3'.K\u00c9_\u0019KE\u00eb\u00e6\u00a0\u0015\u0006\u0087(H\u00bd".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block24;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = a0t.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block25;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        a0t.b = var7_3;
        a0t.c = new String[12];
        a0t.z8v = new a0t$1(-1);
        a0t.fwh = new a0t$2(0);
        a0t.nil = new a0t$3(1);
        a0t.le5 = new a0t$4(2);
        a0t.ygy = new a0t[]{a0t.z8v, a0t.fwh, a0t.nil, a0t.le5};
        a0t.uly = -1;
        a0t.u2c = 2;
        a0t.su6 = new a0t[a0t.u2c - a0t.uly + 1];
        a0t.mtt = Maps.newHashMap();
        for (a0t var14_13 : a0t.values()) {
            block26: {
                var15_14 = var14_13.jhj();
                if (var15_14 < a0t.uly) ** GOTO lbl78
                try {
                    block28: {
                        if (var15_14 <= a0t.u2c) break block26;
                        break block28;
                        catch (Throwable v7) {
                            throw a0t.a(v7);
                        }
                    }
                    throw new Error((String)a0t.a("v", (int)24799, (long)(9008998337699948945L ^ var9)) + Integer.toString(var15_14));
                }
                catch (Throwable v8) {
                    throw a0t.a(v8);
                }
            }
            a0t.su6[var15_14 - a0t.uly] = var14_13;
            for (qat var17_16 : var14_13.soq.keySet()) {
                for (Class var19_18 : ((BiMap)var14_13.soq.get((Object)var17_16)).values()) {
                    block27: {
                        if (!a0t.mtt.containsKey(var19_18)) break block27;
                        try {
                            block29: {
                                if (a0t.mtt.get(var19_18) == var14_13) break block27;
                                break block29;
                                catch (Throwable v9) {
                                    throw a0t.a(v9);
                                }
                            }
                            throw new Error((String)a0t.a("v", (int)20808, (long)(6172353515985508356L ^ var9)) + var19_18 + (String)a0t.a("v", (int)28819, (long)(5767676179535575511L ^ var9)) + a0t.mtt.get(var19_18) + (String)a0t.a("v", (int)16351, (long)(7117137364409120410L ^ var9)) + (Object)var14_13);
                        }
                        catch (Throwable v10) {
                            throw a0t.a(v10);
                        }
                    }
                    try {
                        var19_18.newInstance();
                    }
                    catch (Throwable var20_19) {
                        throw new Error((String)a0t.a("v", (int)13237, (long)(5280798298199915255L ^ var9)) + var19_18 + (String)a0t.a("v", (int)4307, (long)(427503412435966352L ^ var9)) + var19_18);
                    }
                    a0t.mtt.put(var19_18, var14_13);
                }
            }
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4640;
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
                throw new RuntimeException("a0t", exception);
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
            a0t.c[n2] = a0t.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = a0t.a(n, l);
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
            throw new RuntimeException("a0t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a0t.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

