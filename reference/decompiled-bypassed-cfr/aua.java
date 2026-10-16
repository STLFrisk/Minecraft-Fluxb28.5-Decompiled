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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class aua
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x72453477811CL;
        return aua.b("n", (int)14691, (long)(0xB0D2C6C4CDD5A17L ^ l));
    }

    @Override
    public int bag() {
        return 3;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x7CBB77E0DD9AL;
        return aua.b("n", (int)22830, (long)(0x3877D73EEC7A66D8L ^ l));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void l3z(e7r e7r2, String[] stringArray) {
        int n;
        long l;
        block22: {
            e7r e7r3;
            z96 z962;
            block20: {
                int n2;
                Object object;
                block18: {
                    int n3;
                    block19: {
                        int n4;
                        block17: {
                            l = a ^ 0x764689BE7459L;
                            n = t9d.c();
                            try {
                                try {
                                    n4 = stringArray.length;
                                    if (n != 0) break block17;
                                    if (n4 <= 0) throw new w57((String)((Object)aua.b("n", (int)13551, (long)(0x4B663A202364A2DFL ^ l))), new Object[0]);
                                }
                                catch (oov oov2) {
                                    throw aua.a(oov2);
                                }
                                n4 = stringArray[0].length();
                            }
                            catch (oov oov3) {
                                throw aua.a(oov3);
                            }
                        }
                        if (n4 <= 1) throw new w57((String)((Object)aua.b("n", (int)13551, (long)(0x4B663A202364A2DFL ^ l))), new Object[0]);
                        z962 = vr1._0v().wh3().f_q(stringArray[0]);
                        object = aua.b("n", (int)22943, (long)(0x3DDA0B5D5C4D4FADL ^ l));
                        n3 = 0;
                        try {
                            if (z962 == null) {
                                throw new iez();
                            }
                        }
                        catch (oov oov4) {
                            throw aua.a(oov4);
                        }
                        try {
                            n2 = stringArray.length;
                            if (n != 0) break block18;
                            if (n2 < 2) break block19;
                        }
                        catch (oov oov5) {
                            throw aua.a(oov5);
                        }
                        object = aua.as_(e7r2, stringArray, 1).rnh();
                        n3 = 1;
                    }
                    try {
                        e7r3 = z962;
                        if (n != 0) break block20;
                        e7r3.rhh.wr4((String)object);
                        n2 = n3;
                    }
                    catch (oov oov6) {
                        throw aua.a(oov6);
                    }
                }
                try {
                    block21: {
                        try {
                            if (n2 == 0) break block21;
                            aua.wxl(e7r2, this, (String)((Object)aua.b("n", (int)31646, (long)(0x1A8D5CCFD51CEDAAL ^ l))), new Object[]{z962.noc(), object});
                            if (n == 0) break block22;
                        }
                        catch (oov oov7) {
                            throw aua.a(oov7);
                        }
                    }
                    e7r3 = e7r2;
                }
                catch (oov oov8) {
                    throw aua.a(oov8);
                }
            }
            aua.wxl(e7r3, this, (String)((Object)aua.b("n", (int)12144, (long)(0x1643336A2A463943L ^ l))), new Object[]{z962.noc()});
        }
        try {
            if (n == 0) return;
            throw new w57((String)((Object)aua.b("n", (int)13551, (long)(0x4B663A202364A2DFL ^ l))), new Object[0]);
        }
        catch (oov oov9) {
            throw aua.a(oov9);
        }
    }

    @Override
    public List ggu(e7r e7r2, String[] stringArray, mew mew2) {
        List list;
        block6: {
            block5: {
                String[] stringArray2;
                block4: {
                    int n = t9d.b();
                    try {
                        try {
                            stringArray2 = stringArray;
                            if (n == 0) break block4;
                            if (stringArray2.length < 1) break block5;
                        }
                        catch (oov oov2) {
                            throw aua.a(oov2);
                        }
                        stringArray2 = stringArray;
                    }
                    catch (oov oov3) {
                        throw aua.a(oov3);
                    }
                }
                list = aua.cqo(stringArray2, vr1._0v().p14());
                break block6;
            }
            list = null;
        }
        return list;
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

                aua.a = c.a(1713001354764534848L, 3215959004356230578L, MethodHandles.lookup().lookupClass()).a(111687957484141L);
                aua.h = new HashMap<K, V>(13);
                var0 = aua.a ^ 52823477621876L;
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
                var6_5 = "\u009a\u00fb\u00ecV\u00d4\u0080-\u00ae\u00aco7\u0015\u00a2Z\u00ce<\u00e6b\u0080\u00ba\u0005\u00ceq\u00dcS\u0013\u00c1K\u00c2\u00ac7\u00f6\u00dd\r\u00d2-V\u000b\u001a\u00b8\u0010\u00ca\t\u000e\u009e\u00a3\u009f\u00f5#,\u0086\u000f(\u0081\u00ac\u00e7\u00f2(Sm<}{PL\u00c4\u00a5E\u00b7\u00a8\u00a2_\u00d8'\u00e7*[\u00d5H7\u001b|+\u00dcB\u00ee5k\u0097{\u00fcGD\u00c4vf\u00be\u001c0\u001f\u00db1\u00f0/}C\u008a\u008b\u009a\u00ea#\u0099\u0096\u001a6%.\u00a7\u0093\u00da\u001b\b.L\u00d0\b?\u00d848\u0013\u0082\u00df\u0016\u0094\u00bc\u00b4\u0000\u008b\r\u00a2\u00c3f\u0091\u00f1\u0080\u00b8";
                var8_6 = "\u009a\u00fb\u00ecV\u00d4\u0080-\u00ae\u00aco7\u0015\u00a2Z\u00ce<\u00e6b\u0080\u00ba\u0005\u00ceq\u00dcS\u0013\u00c1K\u00c2\u00ac7\u00f6\u00dd\r\u00d2-V\u000b\u001a\u00b8\u0010\u00ca\t\u000e\u009e\u00a3\u009f\u00f5#,\u0086\u000f(\u0081\u00ac\u00e7\u00f2(Sm<}{PL\u00c4\u00a5E\u00b7\u00a8\u00a2_\u00d8'\u00e7*[\u00d5H7\u001b|+\u00dcB\u00ee5k\u0097{\u00fcGD\u00c4vf\u00be\u001c0\u001f\u00db1\u00f0/}C\u008a\u008b\u009a\u00ea#\u0099\u0096\u001a6%.\u00a7\u0093\u00da\u001b\b.L\u00d0\b?\u00d848\u0013\u0082\u00df\u0016\u0094\u00bc\u00b4\u0000\u008b\r\u00a2\u00c3f\u0091\u00f1\u0080\u00b8".length();
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
                    var9_3[var7_4++] = aua.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "A\u008c%\u009b\u0095g\u0097\u00e5\u007fA\u0099\u009d\u009d\u001eC2\u00c4f\u00f0\u000b\\\u00ea\u001c\u00f0\u008a\u00cc\u00be\u00bd\u00b5!*\u00a5|\u0000\u0091Gwv\u00eb=\u00bc\u0019\u00fc\u0014:b\u00f5\u00c6\u00c7G-*i+\u00b3\u00cf(h^\u0095\u00e0\t\u00a5fy2 \u00b7\u0005J\u0015r\u00ebi\u00b5C1GPZC\u00e4\u00f0+\u009c\u00af\u00c2JX\u00e9.\u001b\u00cd-\u00b7\u0004j";
                    var8_6 = "A\u008c%\u009b\u0095g\u0097\u00e5\u007fA\u0099\u009d\u009d\u001eC2\u00c4f\u00f0\u000b\\\u00ea\u001c\u00f0\u008a\u00cc\u00be\u00bd\u00b5!*\u00a5|\u0000\u0091Gwv\u00eb=\u00bc\u0019\u00fc\u0014:b\u00f5\u00c6\u00c7G-*i+\u00b3\u00cf(h^\u0095\u00e0\t\u00a5fy2 \u00b7\u0005J\u0015r\u00ebi\u00b5C1GPZC\u00e4\u00f0+\u009c\u00af\u00c2JX\u00e9.\u001b\u00cd-\u00b7\u0004j".length();
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
                    var9_3[var7_4++] = aua.b(var10_9).intern();
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
        aua.c = var9_3;
        aua.g = new String[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A6E;
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
                throw new RuntimeException("aua", exception);
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
            aua.g[n2] = aua.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = aua.b(n, l);
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
            throw new RuntimeException("aua" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(aua.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

