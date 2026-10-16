/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bcl
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public List dnz() {
        long l = a ^ 0x27F752FD5292L;
        String[] stringArray = new String[2];
        stringArray[0] = "w";
        stringArray[1] = bcl.b("l", (int)16709, (long)(0x7546E22969D7F05FL ^ l));
        return Arrays.asList(stringArray);
    }

    @Override
    public String xue() {
        long l = a ^ 0x3EB062A45F98L;
        return bcl.b("l", (int)2373, (long)(0x395AD57B542FB556L ^ l));
    }

    @Override
    public int bag() {
        return 0;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x304E2133031EL;
        return bcl.b("l", (int)22884, (long)(0x72BFAB9171DAB9F5L ^ l));
    }

    @Override
    public void l3z(e7r e7r2, String[] stringArray) {
        boolean bl;
        int n;
        String[] stringArray2;
        e7r e7r3;
        z96 z962;
        long l;
        block12: {
            block13: {
                int n2;
                block10: {
                    block11: {
                        l = a ^ 0x3AB3DF6DAADDL;
                        n2 = t9d.c();
                        try {
                            if (stringArray.length < 2) {
                                throw new w57((String)((Object)bcl.b("l", (int)9725, (long)(0x5B9C1432EB6F6CACL ^ l))), new Object[0]);
                            }
                        }
                        catch (oov oov2) {
                            throw bcl.a(oov2);
                        }
                        z962 = bcl.h32(e7r2, stringArray[0]);
                        try {
                            try {
                                e7r3 = z962;
                                if (n2 != 0) break block10;
                                if (e7r3 == e7r2) {
                                }
                                break block11;
                            }
                            catch (oov oov3) {
                                throw bcl.a(oov3);
                            }
                            throw new iez((String)((Object)bcl.b("l", (int)11930, (long)(0x93BE1DC5A6467CEL ^ l))), new Object[0]);
                        }
                        catch (oov oov4) {
                            throw bcl.a(oov4);
                        }
                    }
                    e7r3 = e7r2;
                }
                try {
                    stringArray2 = stringArray;
                    n = 1;
                    bl = e7r2 instanceof ha9;
                    if (n2 != 0) break block12;
                    if (bl) break block13;
                }
                catch (oov oov5) {
                    throw bcl.a(oov5);
                }
                bl = true;
                break block12;
            }
            bl = false;
        }
        ekw ekw2 = bcl.h1l(e7r3, stringArray2, n, bl);
        hsu hsu2 = new hsu((String)((Object)bcl.b("l", (int)29202, (long)(0x1B9E0FA10FDC3B41L ^ l))), new Object[]{e7r2.xyw(), ekw2.qy8()});
        hsu hsu3 = new hsu((String)((Object)bcl.b("l", (int)6063, (long)(0x204CA611FBF1DEFFL ^ l))), new Object[]{z962.xyw(), ekw2.qy8()});
        hsu2.f4q().vyb(syo.qiz).e53(true);
        hsu3.f4q().vyb(syo.qiz).e53(true);
        ((i2h)z962).a0d(hsu2);
        e7r2.a0d(hsu3);
    }

    @Override
    public List ggu(e7r e7r2, String[] stringArray, mew mew2) {
        return bcl.cqo(stringArray, vr1._0v().p14());
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
                    throw bcl.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
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

                bcl.a = c.a(-3039533279141468405L, -8807434148200897146L, MethodHandles.lookup().lookupClass()).a(125055130871411L);
                bcl.h = new HashMap<K, V>(13);
                var0 = bcl.a ^ 2031279009044L;
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
                var6_5 = "\u00d0\u00ad:\u009b\u0084\u000fjg\u008b\u0092\u001a\u0017\u00ea\u001c\u0098\u0087\u00a2\u00aeA}\u00a4\u0011\u00b5\u0016\u00cb\u0014\u00f4\u00c5\u009c\r\u008f\u00c2\u0084\u0081\b\u00b3\u00f4+\u00ae\u0093J\u0080\u00f3\u0096.\u00dc(*5<v\u00f8*\u00a7\u00f4\u0091\u00e3\u00d4\u008e\u0091\u00a8//\u0017(\u00e2\u0001\u0083\u00d2\u00e8\u007f4\u00a1\u00bb\u00f9\u0098\u00e7\u00b6zwX\u0088\u0015\u0087\u00b9\u0010\u00ca\u00aa$\n\u0004\u008e\u00d14P\u00e3\u001ag\u00f7\u001b\u001c,\u00c5\u00d5\u00dd(W\u00c94\u00dd\u00cd\u00893\u000f\u00f8V`\u0016\u0011\u00c7[\u00fe\u0080-\u008b,8\u00b7\u00ef\u00b9\u0014/\u00e9m\u001e!\u00f1\u00a5\u00e6\u009d\u0095\u00e1~\u00cf\u00a86@\u00aa\u00ed\u0091\u00ca%\u00b9\u00b632\u00de\u008f9\u00b8\u0001\u00a8\u00c0o=+\u00c8\u0012\u000e\u008ag\u00adV[\u00b1\u009f4W\u00b1\u0001P\u00b3\u008a\u0017\u000e\u000b\u00ad\u00cay\u00d6\u009e,\u00b5\u009e]\u0094\u0007 \u0083rJ\u0095\u00a3T\u00c1\u009d\u00d7\u00d1\u0095\u00f6\u00920\u0090T\u00c9\u00f8\u00fa\u00ec\u00b6\u009c\u00b3\u00a5\u00daC\u001e\u0011Dw\u00cb\u001f\u00df\u00b8v G\u009c\u00ba\u00e6B\u00bf\u00a4\u00c9JM\u00f5\u00a9\u0090h\u00e5!'P\u0081\u00c4*y\u00ff\u0015\u00a3\u0086";
                var8_6 = "\u00d0\u00ad:\u009b\u0084\u000fjg\u008b\u0092\u001a\u0017\u00ea\u001c\u0098\u0087\u00a2\u00aeA}\u00a4\u0011\u00b5\u0016\u00cb\u0014\u00f4\u00c5\u009c\r\u008f\u00c2\u0084\u0081\b\u00b3\u00f4+\u00ae\u0093J\u0080\u00f3\u0096.\u00dc(*5<v\u00f8*\u00a7\u00f4\u0091\u00e3\u00d4\u008e\u0091\u00a8//\u0017(\u00e2\u0001\u0083\u00d2\u00e8\u007f4\u00a1\u00bb\u00f9\u0098\u00e7\u00b6zwX\u0088\u0015\u0087\u00b9\u0010\u00ca\u00aa$\n\u0004\u008e\u00d14P\u00e3\u001ag\u00f7\u001b\u001c,\u00c5\u00d5\u00dd(W\u00c94\u00dd\u00cd\u00893\u000f\u00f8V`\u0016\u0011\u00c7[\u00fe\u0080-\u008b,8\u00b7\u00ef\u00b9\u0014/\u00e9m\u001e!\u00f1\u00a5\u00e6\u009d\u0095\u00e1~\u00cf\u00a86@\u00aa\u00ed\u0091\u00ca%\u00b9\u00b632\u00de\u008f9\u00b8\u0001\u00a8\u00c0o=+\u00c8\u0012\u000e\u008ag\u00adV[\u00b1\u009f4W\u00b1\u0001P\u00b3\u008a\u0017\u000e\u000b\u00ad\u00cay\u00d6\u009e,\u00b5\u009e]\u0094\u0007 \u0083rJ\u0095\u00a3T\u00c1\u009d\u00d7\u00d1\u0095\u00f6\u00920\u0090T\u00c9\u00f8\u00fa\u00ec\u00b6\u009c\u00b3\u00a5\u00daC\u001e\u0011Dw\u00cb\u001f\u00df\u00b8v G\u009c\u00ba\u00e6B\u00bf\u00a4\u00c9JM\u00f5\u00a9\u0090h\u00e5!'P\u0081\u00c4*y\u00ff\u0015\u00a3\u0086".length();
                var5_7 = 64;
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
                    var9_3[var7_4++] = bcl.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "9\r\u00b1\u008a\u0087\u00f8\u00a4+\u00das\u00db\u00d6\u00a33\u00b8\u00a6\u0010\u009ef\u00e6\u00e3Z\u00f1$\u0089\u00d3K\u00f3\u00e1\u00e1\u00bd\u00d8\"";
                    var8_6 = "9\r\u00b1\u008a\u0087\u00f8\u00a4+\u00das\u00db\u00d6\u00a33\u00b8\u00a6\u0010\u009ef\u00e6\u00e3Z\u00f1$\u0089\u00d3K\u00f3\u00e1\u00e1\u00bd\u00d8\"".length();
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
                    var9_3[var7_4++] = bcl.b(var10_9).intern();
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
        bcl.c = var9_3;
        bcl.g = new String[7];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x650E;
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
                throw new RuntimeException("bcl", exception);
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
            bcl.g[n2] = bcl.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bcl.b(n, l);
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
            throw new RuntimeException("bcl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bcl.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

