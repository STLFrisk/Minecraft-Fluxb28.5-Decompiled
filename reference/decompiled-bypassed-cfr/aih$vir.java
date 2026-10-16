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

public class aih$vir
extends zfj$yuc {
    private final bdo cl0;
    private final String g_c;
    public final aih pj9;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public aih$vir(aih aih2, bdo bdo2) {
        long l = a ^ 0x25D89A133D4DL;
        this(aih2, bdo2.b__((String)((Object)aih$vir.a("b", (int)25758, (long)(0x7A14843AECA6A679L ^ l)))), bdo2.u14((String)((Object)aih$vir.a("b", (int)20763, (long)(0x44467E929B8F13FEL ^ l)))), bdo2.uz7((String)((Object)aih$vir.a("b", (int)16094, (long)(0x41C1FB4FE599FC3CL ^ l)))));
    }

    public aih$vir(aih aih2, bdo bdo2, String string) {
        this(aih2, bdo2, string, 1);
    }

    private aih$vir(aih aih2, bdo bdo2, String object, int n) {
        block9: {
            block6: {
                long l;
                block8: {
                    bdo bdo3;
                    int n2;
                    block7: {
                        l = a ^ 0x6250AD5CCBCBL;
                        n2 = t9d.b();
                        this.pj9 = aih2;
                        super(n);
                        if (n2 == 0) break block9;
                        try {
                            try {
                                if (!((String)object).equals(aih$vir.a("b", (int)10229, (long)(0x21D82360157C9397L ^ l)))) break block6;
                                bdo3 = bdo2;
                                if (n2 == 0) break block7;
                            }
                            catch (oov oov2) {
                                throw aih$vir.a(oov2);
                            }
                            if (bdo3 == null) break block8;
                        }
                        catch (oov oov3) {
                            throw aih$vir.a(oov3);
                        }
                        bdo3 = bdo2;
                    }
                    object = _f3$c3d.ja1(bdo3.uz7((String)((Object)aih$vir.a("b", (int)27280, (long)(0x70D1C23B73E1DEF7L ^ l))))).eob();
                    if (n2 != 0) break block6;
                }
                object = aih$vir.a("b", (int)18685, (long)(0xCC92542855A7C9BL ^ l));
            }
            this.cl0 = bdo2;
            this.g_c = object;
        }
    }

    public bdo dv9() {
        long l = a ^ 0x587F1B0478F9L;
        bdo bdo2 = new bdo();
        bdo2.rzm((String)((Object)aih$vir.a("b", (int)2392, (long)(0x6FAEA45548DF8E0FL ^ l))), this.cl0);
        bdo2.rjq((String)((Object)aih$vir.a("b", (int)20763, (long)(0x444603351A98564AL ^ l))), this.g_c);
        bdo2.iin((String)((Object)aih$vir.a("b", (int)29890, (long)(0x5A948A5FC597F390L ^ l))), this.ndz);
        return bdo2;
    }

    public static String pa8(aih$vir aih$vir) {
        return aih$vir.g_c;
    }

    public static bdo pmp(aih$vir aih$vir) {
        return aih$vir.cl0;
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

                aih$vir.a = c.a(2213653017997820416L, -1795331055208520562L, MethodHandles.lookup().lookupClass()).a(208348965873918L);
                aih$vir.d = new HashMap<K, V>(13);
                var0 = aih$vir.a ^ 89457119432017L;
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
                var6_5 = "\u00fb\u0011\u009e\u0080\u0013\u00ad\u0016\u0011Hlp\u00e0\u008e\u00f6Y\u00dc\u00b28\u00d3\u009dxN\u00f1\u008fVb\u00afdC\u00a6Y\u00f5\u0012`~\u00b1D\u00ba\u000f\u00a6\u0010\u00a1\u00db\u00a4+\u001aS\u00e7\u00aa\u00fbqu\u008f\u00b8\u0002[w\u0010\u00fd\u00bc\u0007\u00c6\u00d9\u000e:\u00beU\u00e5\u001f\u0088\u00b7\u008d\u00bf\u00f5\u0018\u0084`\u00deH\u00d2H;\u001b\u0000r\u00b3\u001f\u00df\u0092X\u00edf\u00b0R\u00d1(\u00f8\u00c0\u001b \f\u0085\u00a2o\u001c\u00c6N\u0088\u00e4g\u00b0\u00fb\u00d9\u0095\u00a0\u00c3\u00f5\u00a8u\u00a75;~\u00a0t\u00fa\u00d3\u00e0\u0016\b\u00e9\u0019\u0010\u00e7?\u00b7@\u0089\u0097x!\u0087\u00a0\u009f\t?\u00b6\u00b2\u0081";
                var8_6 = "\u00fb\u0011\u009e\u0080\u0013\u00ad\u0016\u0011Hlp\u00e0\u008e\u00f6Y\u00dc\u00b28\u00d3\u009dxN\u00f1\u008fVb\u00afdC\u00a6Y\u00f5\u0012`~\u00b1D\u00ba\u000f\u00a6\u0010\u00a1\u00db\u00a4+\u001aS\u00e7\u00aa\u00fbqu\u008f\u00b8\u0002[w\u0010\u00fd\u00bc\u0007\u00c6\u00d9\u000e:\u00beU\u00e5\u001f\u0088\u00b7\u008d\u00bf\u00f5\u0018\u0084`\u00deH\u00d2H;\u001b\u0000r\u00b3\u001f\u00df\u0092X\u00edf\u00b0R\u00d1(\u00f8\u00c0\u001b \f\u0085\u00a2o\u001c\u00c6N\u0088\u00e4g\u00b0\u00fb\u00d9\u0095\u00a0\u00c3\u00f5\u00a8u\u00a75;~\u00a0t\u00fa\u00d3\u00e0\u0016\b\u00e9\u0019\u0010\u00e7?\u00b7@\u0089\u0097x!\u0087\u00a0\u009f\t?\u00b6\u00b2\u0081".length();
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
                    var9_3[var7_4++] = aih$vir.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00c3\u0085\b3^\u00abY\u00dbFD\u009e\u00c3\u00a3i\u00f3\" \u00ac\u0003yp\u00ee#\u0088\u00c0\u00a9\u0099\u00c3\u0005\u00a7\u0081\u000b\u0018$\u00ceb<\b),\u008d\u00cev\u0013\b\u00a0\u00a9\u00ec\u00be";
                    var8_6 = "\u00c3\u0085\b3^\u00abY\u00dbFD\u009e\u00c3\u00a3i\u00f3\" \u00ac\u0003yp\u00ee#\u0088\u00c0\u00a9\u0099\u00c3\u0005\u00a7\u0081\u000b\u0018$\u00ceb<\b),\u008d\u00cev\u0013\b\u00a0\u00a9\u00ec\u00be".length();
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
                    var9_3[var7_4++] = aih$vir.a(var10_9).intern();
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
        aih$vir.b = var9_3;
        aih$vir.c = new String[8];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x38A6;
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
                throw new RuntimeException("aih$vir", exception);
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
            aih$vir.c[n2] = aih$vir.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = aih$vir.a(n, l);
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
            throw new RuntimeException("aih$vir" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(aih$vir.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

