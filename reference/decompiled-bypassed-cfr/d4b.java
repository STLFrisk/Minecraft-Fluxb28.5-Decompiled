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

public class d4b
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x4173086B5D45L;
        return d4b.b("a", (int)472, (long)(0x1F98F930174187C1L ^ l));
    }

    @Override
    public int bag() {
        return 3;
    }

    @Override
    public boolean m6l(e7r e7r2) {
        boolean bl;
        block13: {
            block12: {
                int n;
                block10: {
                    n = t9d.b();
                    try {
                        block11: {
                            try {
                                try {
                                    try {
                                        bl = vr1._0v().wh3()._rf().dc3();
                                        if (n == 0) break block10;
                                        if (bl) break block11;
                                    }
                                    catch (oov oov2) {
                                        throw d4b.a(oov2);
                                    }
                                    bl = vr1._0v().wh3().w68().dc3();
                                    if (n == 0) break block10;
                                }
                                catch (oov oov3) {
                                    throw d4b.a(oov3);
                                }
                                if (!bl) break block12;
                            }
                            catch (oov oov4) {
                                throw d4b.a(oov4);
                            }
                        }
                        bl = super.m6l(e7r2);
                    }
                    catch (oov oov5) {
                        throw d4b.a(oov5);
                    }
                }
                try {
                    if (n == 0) break block13;
                    if (!bl) break block12;
                }
                catch (oov oov6) {
                    throw d4b.a(oov6);
                }
                bl = true;
                break block13;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x4F8D4BFC01C3L;
        return d4b.b("a", (int)7989, (long)(0x78887030A9AEC5A8L ^ l));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void l3z(e7r var1_1, String[] var2_2) {
        block11: {
            block10: {
                var3_3 = d4b.a ^ 76350385989632L;
                var5_4 = t9d.c();
                try {
                    try {
                        v0 = var2_2.length;
                        if (var5_4 != 0) break block10;
                        if (v0 >= 1) {
                        }
                        ** GOTO lbl28
                    }
                    catch (oov v1) {
                        throw d4b.a(v1);
                    }
                    v0 = (int)var2_2[0].equalsIgnoreCase((String)d4b.b("a", (int)2594, (long)(6126244437379348861L ^ var3_3)));
                }
                catch (oov v2) {
                    throw d4b.a(v2);
                }
            }
            try {
                try {
                    if (v0 == 0) ** GOTO lbl28
                    var1_1.a0d(new hsu((String)d4b.b("a", (int)11513, (long)(843248402445623201L ^ var3_3)), new Object[]{vr1._0v().wh3()._rf().zim().length}));
                    var1_1.a0d(new tao(d4b.fgi(vr1._0v().wh3()._rf().zim())));
                    if (var5_4 != 0) {
                    }
                    break block11;
                }
                catch (oov v3) {
                    throw d4b.a(v3);
                }
lbl28:
                // 3 sources

                var1_1.a0d(new hsu((String)d4b.b("a", (int)23577, (long)(1894378568632381252L ^ var3_3)), new Object[]{vr1._0v().wh3().w68().zim().length}));
                var1_1.a0d(new tao(d4b.fgi(vr1._0v().wh3().w68().zim())));
            }
            catch (oov v4) {
                throw d4b.a(v4);
            }
        }
    }

    @Override
    public List ggu(e7r e7r2, String[] stringArray, mew mew2) {
        List list;
        block6: {
            block5: {
                String[] stringArray2;
                long l;
                block4: {
                    l = a ^ 0x698637E7F5F0L;
                    int n = t9d.c();
                    try {
                        try {
                            stringArray2 = stringArray;
                            if (n != 0) break block4;
                            if (stringArray2.length != 1) break block5;
                        }
                        catch (oov oov2) {
                            throw d4b.a(oov2);
                        }
                        stringArray2 = stringArray;
                    }
                    catch (oov oov3) {
                        throw d4b.a(oov3);
                    }
                }
                String[] stringArray3 = new String[2];
                stringArray3[0] = d4b.b("a", (int)24094, (long)(0x475D445BFCEF70B7L ^ l));
                stringArray3[1] = d4b.b("a", (int)12514, (long)(0x6441B0BDBF571E49L ^ l));
                list = d4b.cqo(stringArray2, stringArray3);
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

                d4b.a = c.a(-3750346172338649625L, -270042967475158856L, MethodHandles.lookup().lookupClass()).a(204947960181029L);
                d4b.h = new HashMap<K, V>(13);
                var0 = d4b.a ^ 55904211112677L;
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
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "1~\u009d\u00b8\u00d8\u000f\u00b7\u008du\u0011|\tI+\u00ec\u00b7\u00a0\u008a\u001f\u00dd|\u00dc\u00ce\u00c1\u0013\u00efO\"M\u0002\u0010\u0089\u00a1+\u000b\u0016\u00ccZ\u007fT\u00c2>\u00df\u0000\u00075\r\u00cb\u0010\u00efM\u009e\u0085\u00b6\u0017\u009f\u00f5\u0090\u00a73:[\u00c2?8\u0010V\u00c9\u00f6O\u00fb\u00f4\u0007f\u000f\u0098\u0087D\u0081\u00d4\u00f0\u00ff(\u0097F{\u00af\u008e\u0016\u0002\u009e\biq\u00d8Q\u00e7/5\u00c7\u001b2\u00c7\u0090G\u008c\u008a\u00db|\u00e8t\u0091,m\u00f2`\u0097\u007f:\u00f2B\u008c\u00d1\u0010\u00db\u00bb0J\u0098K\\\u00e7\u00ba\u00dd\u000b\u00fd\u00cb\u00feR\u0017";
                var8_6 = "1~\u009d\u00b8\u00d8\u000f\u00b7\u008du\u0011|\tI+\u00ec\u00b7\u00a0\u008a\u001f\u00dd|\u00dc\u00ce\u00c1\u0013\u00efO\"M\u0002\u0010\u0089\u00a1+\u000b\u0016\u00ccZ\u007fT\u00c2>\u00df\u0000\u00075\r\u00cb\u0010\u00efM\u009e\u0085\u00b6\u0017\u009f\u00f5\u0090\u00a73:[\u00c2?8\u0010V\u00c9\u00f6O\u00fb\u00f4\u0007f\u000f\u0098\u0087D\u0081\u00d4\u00f0\u00ff(\u0097F{\u00af\u008e\u0016\u0002\u009e\biq\u00d8Q\u00e7/5\u00c7\u001b2\u00c7\u0090G\u008c\u008a\u00db|\u00e8t\u0091,m\u00f2`\u0097\u007f:\u00f2B\u008c\u00d1\u0010\u00db\u00bb0J\u0098K\\\u00e7\u00ba\u00dd\u000b\u00fd\u00cb\u00feR\u0017".length();
                var5_7 = 48;
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
                    var9_3[var7_4++] = d4b.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0006\u0090\u00c9]\u008f\u00ee\u00b5\u00a0\u00f2\u0080\u00c1\u00ef\u00012\u00f3\u00a4\u00ee\f\u001e1S\u00da\u007f\u00f5\u00a4\r\u00bf^>V\u00adk\u00f8\u00e0*\u00e8\u00e1Ka\u00b9\u0010\u0094;\u00b0\u00a5\u008a&n\u00c5\u00ad<\u00f2\u00b3\u0095\u008b\u009a\u0010";
                    var8_6 = "\u0006\u0090\u00c9]\u008f\u00ee\u00b5\u00a0\u00f2\u0080\u00c1\u00ef\u00012\u00f3\u00a4\u00ee\f\u001e1S\u00da\u007f\u00f5\u00a4\r\u00bf^>V\u00adk\u00f8\u00e0*\u00e8\u00e1Ka\u00b9\u0010\u0094;\u00b0\u00a5\u008a&n\u00c5\u00ad<\u00f2\u00b3\u0095\u008b\u009a\u0010".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = d4b.b(var10_9).intern();
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
        d4b.c = var9_3;
        d4b.g = new String[7];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5F03;
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
                throw new RuntimeException("d4b", exception);
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
            d4b.g[n2] = d4b.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = d4b.b(n, l);
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
            throw new RuntimeException("d4b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d4b.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

