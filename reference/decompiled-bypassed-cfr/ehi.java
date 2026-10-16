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

public class ehi
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x137D73109D5AL;
        return ehi.b("h", (int)1508, (long)(0x75D6A3BF572653L ^ l));
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x1D833087C1DCL;
        return ehi.b("h", (int)2301, (long)(0x121EBEE1864E77CFL ^ l));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void l3z(e7r e7r2, String[] stringArray) {
        e7r e7r3;
        int n;
        long l;
        block13: {
            l = a ^ 0x177ECED9681FL;
            vr1 vr12 = vr1._0v();
            boolean bl = false;
            int n2 = 0;
            n = t9d.b();
            while (n2 < vr12.p_y.length) {
                block16: {
                    block15: {
                        dug dug2;
                        block14: {
                            try {
                                try {
                                    try {
                                        e7r3 = vr12;
                                        if (n == 0) break block13;
                                        dug2 = e7r3.p_y[n2];
                                        if (n == 0) break block14;
                                    }
                                    catch (oov oov2) {
                                        throw ehi.a(oov2);
                                    }
                                    if (dug2 == null) break block15;
                                }
                                catch (oov oov3) {
                                    throw ehi.a(oov3);
                                }
                                dug2 = vr12.p_y[n2];
                            }
                            catch (oov oov4) {
                                throw ehi.a(oov4);
                            }
                        }
                        dug dug3 = dug2;
                        try {
                            if (n == 0) break block16;
                            if (!dug3.b4a) break block15;
                        }
                        catch (oov oov5) {
                            throw ehi.a(oov5);
                        }
                        dug3.b4a = false;
                        bl = true;
                    }
                    ++n2;
                }
                if (n != 0) continue;
            }
            try {
                if (!bl) throw new uvb((String)((Object)ehi.b("h", (int)15205, (long)(0x50219F3F98EDED96L ^ l))), new Object[0]);
                e7r3 = e7r2;
            }
            catch (oov oov6) {
                throw ehi.a(oov6);
            }
        }
        try {
            ehi.wxl(e7r3, this, (String)((Object)ehi.b("h", (int)6764, (long)(0x63E3F0A8C15CC9CL ^ l))), new Object[0]);
            if (n != 0) return;
            throw new uvb((String)((Object)ehi.b("h", (int)15205, (long)(0x50219F3F98EDED96L ^ l))), new Object[0]);
        }
        catch (oov oov7) {
            throw ehi.a(oov7);
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

                ehi.a = c.a(-4051049875275267924L, 577765197272296162L, MethodHandles.lookup().lookupClass()).a(160972872481109L);
                ehi.h = new HashMap<K, V>(13);
                var0 = ehi.a ^ 130096185846731L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "2\u00d8g\u0000\u00ff\u0019Zv\u00d2\u00b5\u00cc\u001cO\u00ea\u008e'8C\u00cc\u00efR?\u0094\u009e\u00a3U\u00d5\u009aFw\u00e6\u0095\re\u00eb`\u00cc\u0081{\u00ab\u00b9\u009e\u00ab\u00bc\u0098\u00b4\u00c4\"\u0007\u00ce`\u00fbR,\u00cf\u008dw\u00ef\u000fA4`\u00fc\u0087\u00c6p`\u0096e\u00b1\u00dd\u00ea\u00c4";
                var8_6 = "2\u00d8g\u0000\u00ff\u0019Zv\u00d2\u00b5\u00cc\u001cO\u00ea\u008e'8C\u00cc\u00efR?\u0094\u009e\u00a3U\u00d5\u009aFw\u00e6\u0095\re\u00eb`\u00cc\u0081{\u00ab\u00b9\u009e\u00ab\u00bc\u0098\u00b4\u00c4\"\u0007\u00ce`\u00fbR,\u00cf\u008dw\u00ef\u000fA4`\u00fc\u0087\u00c6p`\u0096e\u00b1\u00dd\u00ea\u00c4".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = ehi.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u008ag\u00b7\u0084\u00d8\u0096\u00c3O\nk\u009a,_\u0081\u008eym\u001d\u00ff\u00bf\u00a4\u00913\u00acA\f~\u00c3D\u00ba\\{\u00c2\u00eb[!\u0080z\u0004\u00f0(\u00b0\u00189I\u009eRH@R\u009c#\u00a8\u00c0\u00c6\u001fu\u0003\u00cd\u009eDx\n\u00e3\u00cf\u00af\u0091\u00b8\u0003\u00dem\u00d4\u00ec\u00e7\u00fc\r\u00de@e\u00f1\u0080";
                    var8_6 = "\u008ag\u00b7\u0084\u00d8\u0096\u00c3O\nk\u009a,_\u0081\u008eym\u001d\u00ff\u00bf\u00a4\u00913\u00acA\f~\u00c3D\u00ba\\{\u00c2\u00eb[!\u0080z\u0004\u00f0(\u00b0\u00189I\u009eRH@R\u009c#\u00a8\u00c0\u00c6\u001fu\u0003\u00cd\u009eDx\n\u00e3\u00cf\u00af\u0091\u00b8\u0003\u00dem\u00d4\u00ec\u00e7\u00fc\r\u00de@e\u00f1\u0080".length();
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
                    var9_3[var7_4++] = ehi.b(var10_9).intern();
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
        ehi.c = var9_3;
        ehi.g = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7AAC;
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
                throw new RuntimeException("ehi", exception);
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
            ehi.g[n2] = ehi.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ehi.b(n, l);
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
            throw new RuntimeException("ehi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ehi.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

