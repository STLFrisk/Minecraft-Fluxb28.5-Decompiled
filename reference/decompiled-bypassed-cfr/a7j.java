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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

@dr9$x0j(t2u="rename", io4={"<name> | <player> <name> "}, hjc="Set display name used by NameProtect")
public class a7j
extends dr9 {
    private static final long a;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    /*
     * Unable to fully structure code
     */
    @Override
    public void xjl(String[] var1_1) {
        block32: {
            block36: {
                block35: {
                    block34: {
                        block33: {
                            block30: {
                                block31: {
                                    var2_2 = a7j.a ^ 40711236766409L;
                                    var4_3 = t9d.b();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v0 = var1_1.length;
                                                    v1 = 1;
                                                    if (var4_3 == 0) break block30;
                                                    if (v0 == v1) {
                                                    }
                                                    ** GOTO lbl35
                                                }
                                                catch (oov v2) {
                                                    throw a7j.a(v2);
                                                }
                                                ejb.vt5 = var1_1[0].replace("&", "\u00a7").replace((CharSequence)a7j.a("s", (int)240, (long)(6342710137394918755L ^ var2_2)), (CharSequence)a7j.a("s", (int)6864, (long)(5692423948500135750L ^ var2_2))).replace("_", " ").replace((CharSequence)a7j.a("s", (int)23529, (long)(3259911156992126587L ^ var2_2)), "_");
                                                if (var4_3 == 0) break block31;
                                            }
                                            catch (oov v3) {
                                                throw a7j.a(v3);
                                            }
                                            if (!kgt.f9t.klu()) ** GOTO lbl30
                                        }
                                        catch (oov v4) {
                                            throw a7j.a(v4);
                                        }
                                        ncl.dob((String)a7j.a("s", (int)25048, (long)(3727532234546877516L ^ var2_2)) + (Object)syo.u4m + ejb.vt5);
                                        if (var4_3 == 0) {
                                        }
                                        break block32;
                                    }
                                    catch (oov v5) {
                                        throw a7j.a(v5);
                                    }
lbl30:
                                    // 2 sources

                                    ncl.dob((Object)syo.aez + (String)a7j.a("s", (int)20604, (long)(5267367287766689259L ^ var2_2)));
                                }
                                try {
                                    try {
                                        if (var4_3 != 0) break block32;
lbl35:
                                        // 2 sources

                                        v0 = var1_1.length;
                                        if (var4_3 == 0) break block33;
                                    }
                                    catch (oov v6) {
                                        throw a7j.a(v6);
                                    }
                                    v1 = 2;
                                }
                                catch (oov v7) {
                                    throw a7j.a(v7);
                                }
                            }
                            try {
                                if (v0 == v1) {
                                    v0 = (int)kgt.f9t.klu();
                                }
                                ** GOTO lbl95
                            }
                            catch (oov v8) {
                                throw a7j.a(v8);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (var4_3 == 0) break block34;
                                    if (v0 != 0) {
                                    }
                                    ** GOTO lbl90
                                }
                                catch (oov v9) {
                                    throw a7j.a(v9);
                                }
                                v10 = ejb.j0b;
                                v11 = var1_1[0];
                                if (var4_3 == 0) break block35;
                            }
                            catch (oov v12) {
                                throw a7j.a(v12);
                            }
                            v0 = (int)v10.containsKey(v11);
                        }
                        catch (oov v13) {
                            throw a7j.a(v13);
                        }
                    }
                    try {
                        if (v0 != 0) break block36;
                        v10 = ejb.j0b;
                        v11 = var1_1[0];
                    }
                    catch (oov v14) {
                        throw a7j.a(v14);
                    }
                }
                v10.put(v11, var1_1[1].replace((CharSequence)a7j.a("s", (int)19700, (long)(7768320446084036961L ^ var2_2)), (CharSequence)a7j.a("s", (int)23529, (long)(3259911156992126587L ^ var2_2))).replace("_", " ").replace((CharSequence)a7j.a("s", (int)23529, (long)(3259911156992126587L ^ var2_2)), "_"));
            }
            try {
                try {
                    ncl.dob((String)a7j.a("s", (int)1231, (long)(819504580600000862L ^ var2_2)) + (Object)syo.u4m + var1_1[1]);
                    if (var4_3 != 0) break block32;
lbl90:
                    // 2 sources

                    ncl.dob((Object)syo.aez + (String)a7j.a("s", (int)24539, (long)(6585779674432678475L ^ var2_2)));
                    if (var4_3 != 0) break block32;
                }
                catch (oov v15) {
                    throw a7j.a(v15);
                }
lbl95:
                // 2 sources

                this.dhs();
            }
            catch (oov v16) {
                throw a7j.a(v16);
            }
        }
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

                a7j.a = c.a(-1458950058112830634L, 6404147535365943744L, MethodHandles.lookup().lookupClass()).a(137455217854703L);
                a7j.f = new HashMap<K, V>(13);
                var0 = a7j.a ^ 94653356767224L;
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
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "\u009ek<\u0011\u00ff\u000f\u00d6\u00ca~\u00dce\u00a3\f\u00a7\u00c5\u0091\u0095\u00ed\u00f4A\u00cf\u0084\u009aU]U1\u0083\u00b5x\u0080\u009a\u0000\u0099\u00daV\u00b7o^\u00e1\u00a1\u00b6\u00db2\u0086\u00dc\u000b\u007f\u0014q\u00bf\u0099j\u00a1\u00b4QX\u00bb\u009f`\u00fc\u00a9\u008dd%]&\u00ff\u001b(!mg\u009b\u00fc\u00ae{|\u00ae\u00d2\"_T9\u00c0\u009c\u0015\u00d7/{\u00e6N\u00e8\u001cJ\u009a{Cv\u00a2\u009d\u00cb\u0095gu\u00e5\u009bBF\u00cc\u00932\u00e9_\u00e7\u0097\u0018\u000fE\u00f5Y)\u0086\u00da\u0088\u00c3f\t\u00b6t\u0090\u00df\u0015\u0090\u0095\u00fe\u00b7\u000f\u00b6K\u00ff\u00f3\u00ceA\u0010\u0010D\u00bf\u00ab]\u00e7XB\u0005\u00d5\u0006')_\u00ae\u00cc\u00f6 z\u00ae\u00de\u001fqv\u00cb;\u00cal\u00cb\u0005\u0019x;\u00c0Ly:\u0002\u00de\u00ea\u00a2J=\b9\u00ceg\u00d1\u00a7r\u0010\u00f98R\u00cf\u00a4\u00feR\u00a4\u001c\u00ae\u00f6\u00ce\u0082gk(8\u00d9\u00f0\u00ab\u00b2\u00b8U\u00d5\u00f8\u00cc\u00cd(\u00da\nR\u009fxd|\u00ff\u00c3\u00b5/_\u0090\u0080\u00cc\u00c8\u00a9\u00b9TMT\u00bd\u009cP\u0098R\u0002\u00df\u00ffcH\u00f4\u00f2\f\u00db g\u00fb\u00f6\u00a0BG\u0017\u0007\u0017";
                var8_6 = "\u009ek<\u0011\u00ff\u000f\u00d6\u00ca~\u00dce\u00a3\f\u00a7\u00c5\u0091\u0095\u00ed\u00f4A\u00cf\u0084\u009aU]U1\u0083\u00b5x\u0080\u009a\u0000\u0099\u00daV\u00b7o^\u00e1\u00a1\u00b6\u00db2\u0086\u00dc\u000b\u007f\u0014q\u00bf\u0099j\u00a1\u00b4QX\u00bb\u009f`\u00fc\u00a9\u008dd%]&\u00ff\u001b(!mg\u009b\u00fc\u00ae{|\u00ae\u00d2\"_T9\u00c0\u009c\u0015\u00d7/{\u00e6N\u00e8\u001cJ\u009a{Cv\u00a2\u009d\u00cb\u0095gu\u00e5\u009bBF\u00cc\u00932\u00e9_\u00e7\u0097\u0018\u000fE\u00f5Y)\u0086\u00da\u0088\u00c3f\t\u00b6t\u0090\u00df\u0015\u0090\u0095\u00fe\u00b7\u000f\u00b6K\u00ff\u00f3\u00ceA\u0010\u0010D\u00bf\u00ab]\u00e7XB\u0005\u00d5\u0006')_\u00ae\u00cc\u00f6 z\u00ae\u00de\u001fqv\u00cb;\u00cal\u00cb\u0005\u0019x;\u00c0Ly:\u0002\u00de\u00ea\u00a2J=\b9\u00ceg\u00d1\u00a7r\u0010\u00f98R\u00cf\u00a4\u00feR\u00a4\u001c\u00ae\u00f6\u00ce\u0082gk(8\u00d9\u00f0\u00ab\u00b2\u00b8U\u00d5\u00f8\u00cc\u00cd(\u00da\nR\u009fxd|\u00ff\u00c3\u00b5/_\u0090\u0080\u00cc\u00c8\u00a9\u00b9TMT\u00bd\u009cP\u0098R\u0002\u00df\u00ffcH\u00f4\u00f2\f\u00db g\u00fb\u00f6\u00a0BG\u0017\u0007\u0017".length();
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
                    var9_3[var7_4++] = a7j.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ff\u00e9\u00aed\u00c2\u00f5\u0090\u00ceXleR\u000er\u00bc\u00ceO\u0087\u00f1\u00d5aP\u00a0t\u00b2N1+x\u00b9\u0000\u00f0\u00be\u0016\u00c1t\u00e9\u00e6\u00f7\u008b\u009a3(V\u00f4\u00d3\u00a8O\u00c6\u00b8\u00c7\u001c\u00c2\u009b\u00eer\u0083I\u00b9f]\u00cey\u0016\u00ae*\u00cfe\u00e6\u00ca+\u00e6\u00e8\u0013\u008e\u008c\u00e0\u00bc\u00d6\u00da\u00e6[\u00e0\u0087\u00d0\u0003\u0099\u00ef \u00a6)$Q\u00d6\u00a5\u00cc\u0001\u00d9\u00f1]\u0082\u0007W\u0019\u00c6=\u00c8N\u0015\u008e\u0094\u0005W\u00ef@QR\u00dd\u00f5y\u0003";
                    var8_6 = "\u00ff\u00e9\u00aed\u00c2\u00f5\u0090\u00ceXleR\u000er\u00bc\u00ceO\u0087\u00f1\u00d5aP\u00a0t\u00b2N1+x\u00b9\u0000\u00f0\u00be\u0016\u00c1t\u00e9\u00e6\u00f7\u008b\u009a3(V\u00f4\u00d3\u00a8O\u00c6\u00b8\u00c7\u001c\u00c2\u009b\u00eer\u0083I\u00b9f]\u00cey\u0016\u00ae*\u00cfe\u00e6\u00ca+\u00e6\u00e8\u0013\u008e\u008c\u00e0\u00bc\u00d6\u00da\u00e6[\u00e0\u0087\u00d0\u0003\u0099\u00ef \u00a6)$Q\u00d6\u00a5\u00cc\u0001\u00d9\u00f1]\u0082\u0007W\u0019\u00c6=\u00c8N\u0015\u008e\u0094\u0005W\u00ef@QR\u00dd\u00f5y\u0003".length();
                    var5_7 = 88;
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
                    var9_3[var7_4++] = a7j.b(var10_9).intern();
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
        a7j.d = var9_3;
        a7j.e = new String[8];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4293;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("a7j", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            a7j.e[n2] = a7j.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = a7j.a(n, l);
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
            throw new RuntimeException("a7j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a7j.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

