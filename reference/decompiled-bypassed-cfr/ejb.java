/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ejb
extends ar7 {
    public static String vt5;
    public static Map j0b;
    public static cn7 ben;
    public static cn7 _fy;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public ejb() {
        long l = a ^ 0x735AC048F063L;
        super((String)((Object)ejb.b("t", (int)15062, (long)(0x3C1C1601F5B456ABL ^ l))), _aj.sxc, false, new j1s[0]);
    }

    /*
     * Unable to fully structure code
     */
    @jev
    public void ywd(s60 var1_1) {
        block32: {
            block34: {
                block30: {
                    block31: {
                        block29: {
                            block28: {
                                var2_2 = t9d.b();
                                try {
                                    try {
                                        v0 = ejb.ek1;
                                        if (var2_2 == 0) break block28;
                                        if (v0.vg8 != null) {
                                        }
                                        ** GOTO lbl19
                                    }
                                    catch (oov v1) {
                                        throw ejb.a(v1);
                                    }
                                    v0 = ejb.ek1;
                                }
                                catch (oov v2) {
                                    throw ejb.a(v2);
                                }
                            }
                            try {
                                if (v0.tij != null) break block29;
lbl19:
                                // 2 sources

                                return;
                            }
                            catch (oov v3) {
                                throw ejb.a(v3);
                            }
                        }
                        try {
                            v4 = var1_1.jcg;
                            if (var2_2 == 0) break block30;
                            if (v4 != null) break block31;
                        }
                        catch (oov v5) {
                            throw ejb.a(v5);
                        }
                        return;
                    }
                    v4 = var1_1.jcg;
                }
                var3_3 = v4;
                var3_3 = var3_3.replace(ejb.ek1.vg8.noc(), ejb.vt5).replace(ejb.ek1.vg8.noc().toLowerCase(), ejb.vt5).replace(ejb.ek1.vg8.noc().toUpperCase(), ejb.vt5);
                for (Object var5_5 : ejb.j0b.keySet()) {
                    var3_3 = var3_3.replace((CharSequence)var5_5, (CharSequence)ejb.j0b.get(var5_5));
                    try {
                        if (var2_2 != 0) {
                            if (var2_2 != 0) continue;
                            break;
                        }
                        break block32;
                    }
                    catch (oov v6) {
                        throw ejb.a(v6);
                    }
                }
                if (!ejb._fy.d7c().booleanValue()) break block34;
                var4_4 = ejb.ek1.c02().l0e().iterator();
                while (var4_4.hasNext()) {
                    block33: {
                        var5_5 = (hv2)var4_4.next();
                        try {
                            try {
                                v7 = var5_5;
                                if (var2_2 != 0) {
                                    if (var2_2 == 0) break block33;
                                }
                                ** GOTO lbl-1000
                            }
                            catch (oov v8) {
                                throw ejb.a(v8);
                            }
                            if (v7 == null) continue;
                        }
                        catch (oov v9) {
                            throw ejb.a(v9);
                        }
                        v10 = var5_5;
                    }
                    try {
                        if (v10.pbs() == null) {
                            continue;
                        }
                    }
                    catch (oov v11) {
                        throw ejb.a(v11);
                    }
                    var3_3 = var3_3.replace(var5_5.pbs().getName(), (Object)syo.w29 + "" + (Object)syo.sxj + var5_5.pbs().getName() + (Object)syo.w29);
                    if (var2_2 != 0) continue;
                }
                for (Object v7 : uj3.o1c()) lbl-1000:
                // 2 sources

                {
                    var5_5 = (ha9)v7;
                    var3_3 = var3_3.replace(var5_5.noc(), (Object)syo.rl1 + "" + (Object)syo.sxj + var5_5.noc() + (Object)syo.rl1);
                    try {
                        if (var2_2 != 0) {
                            if (var2_2 != 0) continue;
                            break;
                        }
                        break block32;
                    }
                    catch (oov v12) {
                        throw ejb.a(v12);
                    }
                }
            }
            var1_1.jcg = var3_3;
        }
    }

    public int bpy() {
        int n;
        block2: {
            int n2 = 0;
            Iterator iterator = j0b.keySet().iterator();
            int n3 = t9d.b();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                n = Math.max(n2, ejb.ek1.tx1.ezt((String)j0b.get(string)));
                if (n3 != 0) {
                    n2 = n;
                    if (n3 != 0) continue;
                }
                break block2;
            }
            n = n2;
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

                ejb.a = c.a(-7447667554198154625L, -5718327509996572403L, MethodHandles.lookup().lookupClass()).a(213804035526787L);
                var9 = ejb.a ^ 77859884859997L;
                ejb.h = new HashMap<K, V>(13);
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
                var7_3 = new String[5];
                var5_4 = 0;
                var4_5 = "*\u00f0C\u00c4N\u00caJ\u0011\u00a5l\u0095\u00b6Lh\u009c\u00ce\u0018\u0091\u0017_\u00e8\u0002\u000e\u0098\u008a\u00c4\u00d9\u00f1Q2\u00ce\u009a\u00a2[\u000eZ\u00d6\u0099\u001cqU\u00108\u0086\u00ec\\\u00a8\u001eF\u009b\u0088\u00d4B\u00d7\u00be\u00b7\u00ca\u00ff";
                var6_6 = "*\u00f0C\u00c4N\u00caJ\u0011\u00a5l\u0095\u00b6Lh\u009c\u00ce\u0018\u0091\u0017_\u00e8\u0002\u000e\u0098\u008a\u00c4\u00d9\u00f1Q2\u00ce\u009a\u00a2[\u000eZ\u00d6\u0099\u001cqU\u00108\u0086\u00ec\\\u00a8\u001eF\u009b\u0088\u00d4B\u00d7\u00be\u00b7\u00ca\u00ff".length();
                var3_7 = 16;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = ejb.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "1}qq\u00d94<\u00ca\u00edV0A\u00ba\"y\u00cc\u00fdBS\u00d6\u00fb\u00a6qL\u00ab\u00c0vb\u00bc\u00b9\u0012\u00b9 b\u009c\u00a89`\u00a4Y\u00b8\u00a3/\u00b5x\u0094R\u00f1\u0004`\u00b8lVsK\u00e9\u00e6V\u00ee\u00ea4\u0015\u00c2i3";
                    var6_6 = "1}qq\u00d94<\u00ca\u00edV0A\u00ba\"y\u00cc\u00fdBS\u00d6\u00fb\u00a6qL\u00ab\u00c0vb\u00bc\u00b9\u0012\u00b9 b\u009c\u00a89`\u00a4Y\u00b8\u00a3/\u00b5x\u0094R\u00f1\u0004`\u00b8lVsK\u00e9\u00e6V\u00ee\u00ea4\u0015\u00c2i3".length();
                    var3_7 = 32;
                    var2_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = ejb.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block12;
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
        ejb.f = var7_3;
        ejb.g = new String[5];
        ejb.vt5 = ejb.b("t", (int)1530, (long)(3257171286713441211L ^ var9));
        ejb.j0b = new HashMap<K, V>();
        ejb.ben = new cn7((String)ejb.b("t", (int)28905, (long)(6068777332580511405L ^ var9)), (String)ejb.b("t", (int)25175, (long)(3134919839055084565L ^ var9)), false);
        ejb._fy = new cn7((String)ejb.b("t", (int)28905, (long)(6068777332580511405L ^ var9)), (String)ejb.b("t", (int)18814, (long)(3896969652768069438L ^ var9)), false);
    }

    private static oov a(oov oov2) {
        return oov2;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5EA1;
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
                throw new RuntimeException("ejb", exception);
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
            ejb.g[n2] = ejb.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ejb.b(n, l);
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
            throw new RuntimeException("ejb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ejb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

