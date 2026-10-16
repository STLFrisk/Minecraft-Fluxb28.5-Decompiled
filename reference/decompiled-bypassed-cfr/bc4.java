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

public class bc4
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x58CBF30F1A79L;
        return bc4.b("d", (int)27087, (long)(0x29FC49047F018E06L ^ l));
    }

    @Override
    public int bag() {
        return 2;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x5635B09846FFL;
        return bc4.b("d", (int)16007, (long)(0x3607C4D5D58085CAL ^ l));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void l3z(e7r var1_1, String[] var2_2) {
        block20: {
            block19: {
                block18: {
                    block17: {
                        var3_3 = bc4.a ^ 102015384874812L;
                        var5_4 = t9d.c();
                        try {
                            if (var2_2.length < 1) {
                                throw new w57((String)bc4.b("d", (int)6538, (long)(7691744349268577029L ^ var3_3)), new Object[0]);
                            }
                        }
                        catch (npr v0) {
                            throw bc4.a(v0);
                        }
                        var6_5 = bc4.kot(var1_1, var2_2[0]);
                        var7_6 = null;
                        try {
                            v1 = var2_2;
                            if (var5_4 == 0) {
                                if (v1.length < 2) break block17;
                            }
                            ** GOTO lbl22
                        }
                        catch (npr v2) {
                            throw bc4.a(v2);
                        }
                        try {
                            v1 = var2_2;
lbl22:
                            // 2 sources

                            var7_6 = sza.mft(bc4.cai(v1, 1));
                        }
                        catch (npr var8_7) {
                            throw new uvb((String)bc4.b("d", (int)19161, (long)(2409890033973418067L ^ var3_3)), new Object[]{var8_7.getMessage()});
                        }
                    }
                    try {
                        try {
                            v3 = var7_6;
                            if (var5_4 != 0) break block18;
                            if (v3 == null) break block19;
                        }
                        catch (npr v4) {
                            throw bc4.a(v4);
                        }
                        v3 = new bdo();
                    }
                    catch (npr v5) {
                        throw bc4.a(v5);
                    }
                }
                var8_8 = v3;
                try {
                    try {
                        var6_5.c97(var8_8);
                        if (var5_4 != 0) break block20;
                        if (!j44.z3c(var7_6, var8_8, true)) {
                        }
                        break block19;
                    }
                    catch (npr v6) {
                        throw bc4.a(v6);
                    }
                    throw new uvb((String)bc4.b("d", (int)29537, (long)(5914085090625839596L ^ var3_3)), new Object[]{var6_5.noc()});
                }
                catch (npr v7) {
                    throw bc4.a(v7);
                }
            }
            bc4.wxl(var1_1, this, (String)bc4.b("d", (int)19807, (long)(6767461241404579796L ^ var3_3)), new Object[]{var6_5.noc()});
        }
    }

    @Override
    public boolean mp9(String[] stringArray, int n) {
        boolean bl;
        block2: {
            block3: {
                int n2 = t9d.c();
                try {
                    bl = n;
                    if (n2 != 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw bc4.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public List ggu(e7r e7r2, String[] stringArray, mew mew2) {
        List list;
        block6: {
            block5: {
                String[] stringArray2;
                block4: {
                    int n = t9d.c();
                    try {
                        try {
                            stringArray2 = stringArray;
                            if (n != 0) break block4;
                            if (stringArray2.length != 1) break block5;
                        }
                        catch (oov oov2) {
                            throw bc4.a(oov2);
                        }
                        stringArray2 = stringArray;
                    }
                    catch (oov oov3) {
                        throw bc4.a(oov3);
                    }
                }
                list = bc4.cqo(stringArray2, vr1._0v().p14());
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

                bc4.a = c.a(2045557322874872728L, 895165804189896512L, MethodHandles.lookup().lookupClass()).a(174765611917761L);
                bc4.h = new HashMap<K, V>(13);
                var0 = bc4.a ^ 130163184854731L;
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
                var6_5 = "\u009c\"\u00df\r9,\u00d5\u00bd\u00bf\u00e6Q#$\u007f\u00e6N^\u0001\u00e9D\u00a1r\u0096WPj(\u00b4\u0083\u00c7\u0086\u00f7\u0088Vl\u00f7!L\u00d7\u0089(O`\u0088\u001d\u0004\u00f6O\u00d5N\u00d9\u00e6\u00cc\u00b3v\u00a1\u00cf4\u00e6B:\u00ceLB:\u0094\u000f\u00daU\u00d2\u00ae\u00ef\u009c\"\u00b31{D%\u00e1\u0012\u0010\u00e3\u00a6^\u008b\u009b[SW\u0096n\u00dfF6\u00f4.\u00fc8\u009c\u00dd*VF\u00a2\u00e1\u00f5\u0017\u00bd\u00c5\u00e0B\u00e4\u008a\u0017\u00be\u00c0\u00b8\u00c3>\u00cf\u0002-G\u00f0\u0016!\u00e2\u0006\u001a0\u00a4|F\u00e4R\u00bfI\u001bF\u00a8=j\u00b2\u00d6\u009f\u00b7?\u00ca\u0018?\u00ba\u00100\u00d5";
                var8_6 = "\u009c\"\u00df\r9,\u00d5\u00bd\u00bf\u00e6Q#$\u007f\u00e6N^\u0001\u00e9D\u00a1r\u0096WPj(\u00b4\u0083\u00c7\u0086\u00f7\u0088Vl\u00f7!L\u00d7\u0089(O`\u0088\u001d\u0004\u00f6O\u00d5N\u00d9\u00e6\u00cc\u00b3v\u00a1\u00cf4\u00e6B:\u00ceLB:\u0094\u000f\u00daU\u00d2\u00ae\u00ef\u009c\"\u00b31{D%\u00e1\u0012\u0010\u00e3\u00a6^\u008b\u009b[SW\u0096n\u00dfF6\u00f4.\u00fc8\u009c\u00dd*VF\u00a2\u00e1\u00f5\u0017\u00bd\u00c5\u00e0B\u00e4\u008a\u0017\u00be\u00c0\u00b8\u00c3>\u00cf\u0002-G\u00f0\u0016!\u00e2\u0006\u001a0\u00a4|F\u00e4R\u00bfI\u001bF\u00a8=j\u00b2\u00d6\u009f\u00b7?\u00ca\u0018?\u00ba\u00100\u00d5".length();
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
                    var9_3[var7_4++] = bc4.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ab\u00e9\u00d9\u00b5`!\u00c5\u00fb\u00e1\r\u0003\":s\u0019\u008a\u00d0c\u001c6\u00cfz\u009c\u00d2\u008a\u009b\u00e3\u00e0K\u00f7P]j>&\u00fd\u00fa\u009btRg\u00ea\u0090\u00fe\u00d8|:\u00edDa\u0095\u00a7\u00a0t\u0082\u001f8\r\u001cf\u00ce\u0086\u00ff\u0014`\u00bez\u00fb\u00c7Rf4\u00e7Y\u00a7\u007f=t\u00f2\u00deV\u00f7\u00bb\u0015\u0083}\u0012\u00c3\u00a5\u0094y\u0094s\u00a2\u00ff\u00ce\u0006\u00fb\u0006\u001bA=}N\u00f9\u0001\f\u00e9\u00de\u0085\u00cd\u00ba\u001f";
                    var8_6 = "\u00ab\u00e9\u00d9\u00b5`!\u00c5\u00fb\u00e1\r\u0003\":s\u0019\u008a\u00d0c\u001c6\u00cfz\u009c\u00d2\u008a\u009b\u00e3\u00e0K\u00f7P]j>&\u00fd\u00fa\u009btRg\u00ea\u0090\u00fe\u00d8|:\u00edDa\u0095\u00a7\u00a0t\u0082\u001f8\r\u001cf\u00ce\u0086\u00ff\u0014`\u00bez\u00fb\u00c7Rf4\u00e7Y\u00a7\u007f=t\u00f2\u00deV\u00f7\u00bb\u0015\u0083}\u0012\u00c3\u00a5\u0094y\u0094s\u00a2\u00ff\u00ce\u0006\u00fb\u0006\u001bA=}N\u00f9\u0001\f\u00e9\u00de\u0085\u00cd\u00ba\u001f".length();
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
                    var9_3[var7_4++] = bc4.b(var10_9).intern();
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
        bc4.c = var9_3;
        bc4.g = new String[6];
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3ED0;
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
                throw new RuntimeException("bc4", exception);
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
            bc4.g[n2] = bc4.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bc4.b(n, l);
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
            throw new RuntimeException("bc4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bc4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

