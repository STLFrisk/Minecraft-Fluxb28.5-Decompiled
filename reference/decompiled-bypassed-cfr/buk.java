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
import net.optifine.gui.GuiButtonOF;
import net.optifine.gui.GuiScreenCapeOF;

public class buk
extends gbe {
    private final gbe qx7;
    private String r4o;
    private static final long a;
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public buk(gbe gbe2) {
        this.qx7 = gbe2;
    }

    @Override
    public void initGui() {
        block6: {
            int n;
            int n2;
            int n3;
            long l;
            block7: {
                block8: {
                    l = a ^ 0x6B9AA390FD00L;
                    n3 = 0;
                    this.r4o = fc1.gx1((String)((Object)buk.b("w", (int)4451, (long)(0x795C0E7BC9DA70AEL ^ l))), new Object[0]);
                    ulc[] ulcArray = ulc.values();
                    int n4 = ulcArray.length;
                    int n5 = t9d.c();
                    for (int i = 0; i < n4; ++i) {
                        ulc ulc2 = ulcArray[i];
                        try {
                            this.khf.add(new buk$rcg(this, ulc2.jl_(), this.dt7 / 2 - 155 + n3 % 2 * 160, this.o1e / 6 + 24 * (n3 >> 1), 150, 20, ulc2, null));
                            ++n3;
                            if (n5 == 0) {
                                if (n5 == 0) continue;
                                break;
                            }
                            break block6;
                        }
                        catch (oov oov2) {
                            throw buk.a(oov2);
                        }
                    }
                    try {
                        n2 = n3 % 2;
                        n = 1;
                        if (n5 != 0) break block7;
                        if (n2 != n) break block8;
                    }
                    catch (oov oov3) {
                        throw buk.a(oov3);
                    }
                    ++n3;
                }
                this.khf.add(new GuiButtonOF(210, this.dt7 / 2 - 100, this.o1e / 6 + 24 * (n3 >> 1), fc1.gx1((String)((Object)buk.b("w", (int)6550, (long)(0x64B1C9401269F858L ^ l))), new Object[0])));
                n2 = n3;
                n = 2;
            }
            n3 = n2 + n;
            this.khf.add(new gt4(200, this.dt7 / 2 - 100, this.o1e / 6 + 24 * (n3 >> 1), fc1.gx1((String)((Object)buk.b("w", (int)30061, (long)(0x71AD16A45A3E94A2L ^ l))), new Object[0])));
        }
    }

    @Override
    public void actionPerformed(gt4 gt42) {
        block19: {
            gt4 gt43;
            block24: {
                int n;
                block22: {
                    int n2;
                    int n3;
                    block20: {
                        block21: {
                            block18: {
                                n3 = t9d.b();
                                try {
                                    try {
                                        n = gt42.c9a;
                                        if (n3 == 0) break block18;
                                        if (n == 0) break block19;
                                    }
                                    catch (oov oov2) {
                                        throw buk.a(oov2);
                                    }
                                    n = gt42._me;
                                }
                                catch (oov oov3) {
                                    throw buk.a(oov3);
                                }
                            }
                            try {
                                try {
                                    n2 = 210;
                                    if (n3 == 0) break block20;
                                    if (n != n2) break block21;
                                }
                                catch (oov oov4) {
                                    throw buk.a(oov4);
                                }
                                this.f41.z2i(new GuiScreenCapeOF(this));
                            }
                            catch (oov oov5) {
                                throw buk.a(oov5);
                            }
                        }
                        try {
                            n = gt42._me;
                            if (n3 == 0) break block22;
                            n2 = 200;
                        }
                        catch (oov oov6) {
                            throw buk.a(oov6);
                        }
                    }
                    try {
                        try {
                            block23: {
                                try {
                                    if (n != n2) break block23;
                                    this.f41.oxn.cmo();
                                    this.f41.z2i(this.qx7);
                                    if (n3 != 0) break block19;
                                }
                                catch (oov oov7) {
                                    throw buk.a(oov7);
                                }
                            }
                            gt43 = gt42;
                            if (n3 == 0) break block24;
                        }
                        catch (oov oov8) {
                            throw buk.a(oov8);
                        }
                        n = gt43 instanceof buk$rcg;
                    }
                    catch (oov oov9) {
                        throw buk.a(oov9);
                    }
                }
                if (n == 0) break block19;
                gt43 = gt42;
            }
            ulc ulc2 = buk$rcg.py7((buk$rcg)gt43);
            this.f41.oxn._qk(ulc2);
            gt42.frg = this.txj(ulc2);
        }
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        this.xmz();
        this.poi(this.fex, this.r4o, this.dt7 / 2, 20, 0xFFFFFF);
        super.drawScreen(n, n2, f);
    }

    private String txj(ulc ulc2) {
        String string;
        long l;
        block3: {
            block2: {
                l = a ^ 0x1EC148D6F03AL;
                int n = t9d.b();
                if (!this.f41.oxn.c1l().contains((Object)ulc2)) break block2;
                string = fc1.gx1((String)((Object)buk.b("w", (int)1084, (long)(0x46EB1C86250968CAL ^ l))), new Object[0]);
                if (n != 0) break block3;
            }
            string = fc1.gx1((String)((Object)buk.b("w", (int)30691, (long)(0x131B0FF13D0F9B13L ^ l))), new Object[0]);
        }
        return ulc2.z28()._2o() + (String)((Object)buk.b("w", (int)7674, (long)(0x49131F578BA0F10BL ^ l))) + string;
    }

    public static String p0r(buk buk2, ulc ulc2) {
        return buk2.txj(ulc2);
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

                buk.a = c.a(7737283141845824004L, -5722799978242703299L, MethodHandles.lookup().lookupClass()).a(265391586071016L);
                buk.h = new HashMap<K, V>(13);
                var0 = buk.a ^ 95377965803240L;
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
                var6_5 = "\u00c8\u0092\u0013\u00fe\u0090m-\u00a3\u00d5\u0019\u00c2\u00d4\u009a7)\u0088\u0016}!\u00db\u0004\u0003\u0003H\u008d\u00be\u00fej\u00d1\u0081M0k\u00a8\u00c2\u0089\u0086\u0014\u00e8\u00eam\u0014\u00db9>n\u007fP\u00eaQ>\u00fd\u0011?\u0013\u009a\u0018/i\u008fa\u0010\u0092\u00fd\u008d?y\u00dd\t\u00a6\u0015\u00a9i\u0090n\u00e8\u0006m\u00a1p\u0097 L\u00e7\u001fZ\u00ec\u00c9\u008d{\u001cL\u000b\u00de\u008e9\u00b2Oa\u0016\u0003\u00ab\u000b\u00b4\u00ee4A\u0097\u00f9\u00eb\u0096\u00ecbq8\u00ed\u00ae\u0086\u00ebO\u00f4>\u00dei\u00b1.\u00df\u00a3\u00f3?\u0089\u00bf\u00db>]\u008d\u00df\u0081\u0015Q\u00d0Z\u008e\u00a8[\u0018\u0092z\u00ea\u00f1\u00d9\u009f\u009f\u00a8 o/@\u00b4\u008d\u00cd\u00e2;\u00ead\u00a3X)\u00ec9\u00da";
                var8_6 = "\u00c8\u0092\u0013\u00fe\u0090m-\u00a3\u00d5\u0019\u00c2\u00d4\u009a7)\u0088\u0016}!\u00db\u0004\u0003\u0003H\u008d\u00be\u00fej\u00d1\u0081M0k\u00a8\u00c2\u0089\u0086\u0014\u00e8\u00eam\u0014\u00db9>n\u007fP\u00eaQ>\u00fd\u0011?\u0013\u009a\u0018/i\u008fa\u0010\u0092\u00fd\u008d?y\u00dd\t\u00a6\u0015\u00a9i\u0090n\u00e8\u0006m\u00a1p\u0097 L\u00e7\u001fZ\u00ec\u00c9\u008d{\u001cL\u000b\u00de\u008e9\u00b2Oa\u0016\u0003\u00ab\u000b\u00b4\u00ee4A\u0097\u00f9\u00eb\u0096\u00ecbq8\u00ed\u00ae\u0086\u00ebO\u00f4>\u00dei\u00b1.\u00df\u00a3\u00f3?\u0089\u00bf\u00db>]\u008d\u00df\u0081\u0015Q\u00d0Z\u008e\u00a8[\u0018\u0092z\u00ea\u00f1\u00d9\u009f\u009f\u00a8 o/@\u00b4\u008d\u00cd\u00e2;\u00ead\u00a3X)\u00ec9\u00da".length();
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
                    var9_3[var7_4++] = buk.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "r'\u00da\u00fe\u00b7qy/\u00bc`x\u00ca\u0091\u00da\u00d1.K\u00c1\u0095D\u00f3\u008e\u001c\"\u0010\u0011v\u00a3\u00cf\u001c\u00b5\u0085(\u00fa\u0000M*\u00db\u00c6\u00a2,";
                    var8_6 = "r'\u00da\u00fe\u00b7qy/\u00bc`x\u00ca\u0091\u00da\u00d1.K\u00c1\u0095D\u00f3\u008e\u001c\"\u0010\u0011v\u00a3\u00cf\u001c\u00b5\u0085(\u00fa\u0000M*\u00db\u00c6\u00a2,".length();
                    var5_7 = 24;
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
                    var9_3[var7_4++] = buk.a(var10_9).intern();
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
        buk.b = var9_3;
        buk.g = new String[6];
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1AC3;
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
                throw new RuntimeException("buk", exception);
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
            buk.g[n2] = buk.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = buk.b(n, l);
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
            throw new RuntimeException("buk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(buk.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

