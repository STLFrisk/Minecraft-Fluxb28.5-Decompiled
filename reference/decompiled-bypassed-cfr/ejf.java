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

public class ejf
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x546366905E93L;
        return ejf.b("e", (int)1456, (long)(0x78AE50E1BF558C53L ^ l));
    }

    @Override
    public int bag() {
        return 2;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x5A9D25070215L;
        return ejf.b("e", (int)20945, (long)(0x6244555CB84504B1L ^ l));
    }

    @Override
    public void l3z(e7r e7r2, String[] stringArray) {
        block13: {
            bdo bdo2;
            i2h i2h2;
            long l;
            block14: {
                bdo bdo3;
                l = a ^ 0x5060DB59ABD6L;
                int n = t9d.c();
                try {
                    if (stringArray.length < 2) {
                        throw new w57((String)((Object)ejf.b("e", (int)7614, (long)(0x743346CEF178E119L ^ l))), new Object[0]);
                    }
                }
                catch (npr npr2) {
                    throw ejf.a(npr2);
                }
                i2h2 = ejf.kot(e7r2, stringArray[0]);
                try {
                    if (i2h2 instanceof ha9) {
                        throw new uvb((String)((Object)ejf.b("e", (int)25115, (long)(0x33CCFFE062B31EBEL ^ l))), new Object[]{i2h2.xyw()});
                    }
                }
                catch (npr npr3) {
                    throw ejf.a(npr3);
                }
                bdo2 = new bdo();
                i2h2.c97(bdo2);
                bdo bdo4 = (bdo)bdo2.h33();
                try {
                    bdo3 = sza.mft(ejf.as_(e7r2, stringArray, 1).rnh());
                }
                catch (npr npr4) {
                    throw new uvb((String)((Object)ejf.b("e", (int)24296, (long)(0xA9DC9C5577DA240L ^ l))), new Object[]{npr4.getMessage()});
                }
                try {
                    try {
                        bdo3.bkn((String)((Object)ejf.b("e", (int)17384, (long)(0x6479710232733F49L ^ l))));
                        bdo3.bkn((String)((Object)ejf.b("e", (int)20125, (long)(0x82BCF25E5CA323DL ^ l))));
                        bdo2.uhv(bdo3);
                        if (n != 0) break block13;
                        if (bdo2.equals(bdo4)) {
                        }
                        break block14;
                    }
                    catch (npr npr5) {
                        throw ejf.a(npr5);
                    }
                    throw new uvb((String)((Object)ejf.b("e", (int)8948, (long)(0x6D337AF732B1DE56L ^ l))), new Object[]{bdo2.toString()});
                }
                catch (npr npr6) {
                    throw ejf.a(npr6);
                }
            }
            i2h2.a1f(bdo2);
            ejf.wxl(e7r2, this, (String)((Object)ejf.b("e", (int)24107, (long)(0x4B4731C47181228FL ^ l))), new Object[]{bdo2.toString()});
        }
    }

    @Override
    public boolean mp9(String[] stringArray, int n) {
        boolean bl;
        block2: {
            block3: {
                int n2 = t9d.b();
                try {
                    bl = n;
                    if (n2 == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw ejf.a(oov2);
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

                ejf.a = c.a(272531482271976320L, -3543008302804924797L, MethodHandles.lookup().lookupClass()).a(122217035165719L);
                ejf.h = new HashMap<K, V>(13);
                var0 = ejf.a ^ 130749474140969L;
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
                var9_3 = new String[9];
                var7_4 = 0;
                var6_5 = "\u001015\u00bdS\u00d6\u00f5S\u00edZ\u00f3\u00a6.\u00ce\u00e8\u001a\u00c2Y\u00fd\u009b\u0096\u0005X\u009d\u00ac\u00f7|)m\u0098\u009b\u00eb aW-F\u008fu\u00edC9c\u00d39D\u00c4\u00ce\u00fd\u00ca\u0092u\u009cP\u00f6\u00d3\u00dd\t*\u00a4\u00b2\u0014\u00ecy\u00e50R\u00be\u0093\u00d9\u0094\u0006\u00e2\u00af\u00c8]~\u0091n\u0001\u009bv;\u0098=\u00ae\u0093\u00dd\u00e8\\\u00d9A@\u0003;2cdQ\u00db1\u0012\u001b\u00a3v\u00897\u00da\u00c0\u00d4w\u00db\u00e5\u00cc8\u00fa^V5\u00ae<\u0006\u001a\u00c1\u00ef:\u0013M\u0096P9\t\u0098qI@\u00f35\u0093#&\u000f|;\u00b9\u0010\u00c8\u0007N<O*t\u009bz?\u00fc\u001fud\u0003\u00fd\u00a2\u00c2\u0085\u0088\u000f\u0097\u0082G\u00120\u00e1_\u00b5xO:\u00af\u00fb\u008d\u00c3\u00f6\u00ec \u00b4\u0016\u0010\u00b7\u00ac\u0004\u001fB\u00c0'\u00db\u00ff\u00e0\u00c7\u00c9\u00e6P\u00d5\u00d0\u00be\u00aeT?\u00e3\u00f2\u00a9N\u00d6\u00bf\u00b2\u00e0\u00d88G\u00fd8\u00f2\u00f8<dY\u00f0\u00be\u00a3i\u00ca2\u00a7\u00b5\u00b1\u000eE\u00aac\u00f0D1\u0010\u008a|\u00e7\u00de\b\u00c7`Mc\fG\u0001o$h\u009a\u00b0(\u00fc\u00e7l\u0019\u00c8\u00d1t\u0017+9\u0093\u00b0\u00ff\u0018l4 \u00d0\"q\u0015*T_\u00e7N\u00a4\u00b2\u00e1\u001c?\u00bafmP\u00a8\u00ae\u00d4*\u001e\u00aal\u0087\u00c9z\u00ba\u00c9\u009en";
                var8_6 = "\u001015\u00bdS\u00d6\u00f5S\u00edZ\u00f3\u00a6.\u00ce\u00e8\u001a\u00c2Y\u00fd\u009b\u0096\u0005X\u009d\u00ac\u00f7|)m\u0098\u009b\u00eb aW-F\u008fu\u00edC9c\u00d39D\u00c4\u00ce\u00fd\u00ca\u0092u\u009cP\u00f6\u00d3\u00dd\t*\u00a4\u00b2\u0014\u00ecy\u00e50R\u00be\u0093\u00d9\u0094\u0006\u00e2\u00af\u00c8]~\u0091n\u0001\u009bv;\u0098=\u00ae\u0093\u00dd\u00e8\\\u00d9A@\u0003;2cdQ\u00db1\u0012\u001b\u00a3v\u00897\u00da\u00c0\u00d4w\u00db\u00e5\u00cc8\u00fa^V5\u00ae<\u0006\u001a\u00c1\u00ef:\u0013M\u0096P9\t\u0098qI@\u00f35\u0093#&\u000f|;\u00b9\u0010\u00c8\u0007N<O*t\u009bz?\u00fc\u001fud\u0003\u00fd\u00a2\u00c2\u0085\u0088\u000f\u0097\u0082G\u00120\u00e1_\u00b5xO:\u00af\u00fb\u008d\u00c3\u00f6\u00ec \u00b4\u0016\u0010\u00b7\u00ac\u0004\u001fB\u00c0'\u00db\u00ff\u00e0\u00c7\u00c9\u00e6P\u00d5\u00d0\u00be\u00aeT?\u00e3\u00f2\u00a9N\u00d6\u00bf\u00b2\u00e0\u00d88G\u00fd8\u00f2\u00f8<dY\u00f0\u00be\u00a3i\u00ca2\u00a7\u00b5\u00b1\u000eE\u00aac\u00f0D1\u0010\u008a|\u00e7\u00de\b\u00c7`Mc\fG\u0001o$h\u009a\u00b0(\u00fc\u00e7l\u0019\u00c8\u00d1t\u0017+9\u0093\u00b0\u00ff\u0018l4 \u00d0\"q\u0015*T_\u00e7N\u00a4\u00b2\u00e1\u001c?\u00bafmP\u00a8\u00ae\u00d4*\u001e\u00aal\u0087\u00c9z\u00ba\u00c9\u009en".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = ejf.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\b\u0010\u00eb\u00fe\u0001\u0013}\u0013\u00ff\u0083\u00ad\u000f=``\u0017f^E\u00bcE\u0090\u00f7\u00acvg5\fw'I\u000bZG\u0093[\u00a7K\u0012)e\u00ff\u00b2HC\u00d2<Q\u000f\u009cV5@\u00fck\u007f0\u000b\u0091`\u00ba\u009f\u0095\u00ffR\u00da]\u00eaQ0\u00a5\u00e6>K\u00a6\u00e2\u00ad\u009f\u00c0Z\u00d2\u0002\u009c\u00cc\u00d5\u00b9\u008d\u0084\u000ej\u0093\u00e6\u00b8&V\u00ff\u00ff\u00cbP\u008e\u00f2\u00a3h\u0099\u00c1";
                    var8_6 = "\b\u0010\u00eb\u00fe\u0001\u0013}\u0013\u00ff\u0083\u00ad\u000f=``\u0017f^E\u00bcE\u0090\u00f7\u00acvg5\fw'I\u000bZG\u0093[\u00a7K\u0012)e\u00ff\u00b2HC\u00d2<Q\u000f\u009cV5@\u00fck\u007f0\u000b\u0091`\u00ba\u009f\u0095\u00ffR\u00da]\u00eaQ0\u00a5\u00e6>K\u00a6\u00e2\u00ad\u009f\u00c0Z\u00d2\u0002\u009c\u00cc\u00d5\u00b9\u008d\u0084\u000ej\u0093\u00e6\u00b8&V\u00ff\u00ff\u00cbP\u008e\u00f2\u00a3h\u0099\u00c1".length();
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
                    var9_3[var7_4++] = ejf.b(var10_9).intern();
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
        ejf.c = var9_3;
        ejf.g = new String[9];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x50FE;
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
                throw new RuntimeException("ejf", exception);
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
            ejf.g[n2] = ejf.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ejf.b(n, l);
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
            throw new RuntimeException("ejf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ejf.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

