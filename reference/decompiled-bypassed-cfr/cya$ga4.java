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

public class cya$ga4
extends ed7 {
    public int xqg;
    public final cya hvc;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public cya$ga4(cya cya2) {
        this.hvc = cya2;
        super(cya2.f41, cya2.dt7, cya2.o1e, 43, cya2.o1e - 60, 24);
        this.xqg = -1;
    }

    private void t_l(int n, int n2, erg erg2) {
        block6: {
            block7: {
                int n3 = t9d.c();
                try {
                    try {
                        try {
                            this.tv6(n + 1, n2 + 1);
                            hzu.ixc();
                            if (n3 != 0) break block6;
                            if (erg2 == null) break block7;
                        }
                        catch (oov oov2) {
                            throw cya$ga4.a(oov2);
                        }
                        if (erg2.gn1() == null) break block7;
                    }
                    catch (oov oov3) {
                        throw cya$ga4.a(oov3);
                    }
                    qpm.gdb();
                    this.hvc.vs5.s3g(erg2, n + 2, n2 + 2);
                    qpm.cng();
                }
                catch (oov oov4) {
                    throw cya$ga4.a(oov4);
                }
            }
            hzu.eiq();
        }
    }

    private void tv6(int n, int n2) {
        this.z17(n, n2, 0, 0);
    }

    private void z17(int n, int n2, int n3, int n4) {
        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
        this.gk_.l22().anl(b0t.p24);
        float f = 0.0078125f;
        float f2 = 0.0078125f;
        int n5 = 18;
        int n6 = 18;
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl._r5);
        q3g2.g5o(n + 0, n2 + 18, this.hvc.o3s).h0a((float)(n3 + 0) * 0.0078125f, (float)(n4 + 18) * 0.0078125f).pzw();
        q3g2.g5o(n + 18, n2 + 18, this.hvc.o3s).h0a((float)(n3 + 18) * 0.0078125f, (float)(n4 + 18) * 0.0078125f).pzw();
        q3g2.g5o(n + 18, n2 + 0, this.hvc.o3s).h0a((float)(n3 + 18) * 0.0078125f, (float)(n4 + 0) * 0.0078125f).pzw();
        q3g2.g5o(n + 0, n2 + 0, this.hvc.o3s).h0a((float)(n3 + 0) * 0.0078125f, (float)(n4 + 0) * 0.0078125f).pzw();
        jom2.q7g();
    }

    @Override
    public int getSize() {
        return cya.w72(this.hvc).t48().size();
    }

    @Override
    public void elementClicked(int n, boolean bl, int n2, int n3) {
        this.xqg = n;
        this.hvc.iop();
    }

    @Override
    public boolean isSelected(int n) {
        int n2;
        block4: {
            block5: {
                int n3 = t9d.b();
                try {
                    try {
                        n2 = n;
                        if (n3 == 0) break block4;
                        if (n2 != this.xqg) break block5;
                    }
                    catch (oov oov2) {
                        throw cya$ga4.a(oov2);
                    }
                    n2 = 1;
                    break block4;
                }
                catch (oov oov3) {
                    throw cya$ga4.a(oov3);
                }
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    @Override
    public void drawBackground() {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void drawSlot(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        block50: {
            block52: {
                block49: {
                    block42: {
                        block43: {
                            block51: {
                                block45: {
                                    block48: {
                                        block47: {
                                            block46: {
                                                block44: {
                                                    block41: {
                                                        block40: {
                                                            block39: {
                                                                block38: {
                                                                    var7_7 = cya$ga4.a ^ 4643907541511L;
                                                                    var10_8 = (bvf)cya.w72(this.hvc).t48().get(cya.w72(this.hvc).t48().size() - var1_1 - 1);
                                                                    var11_9 = var10_8.see();
                                                                    var12_10 = var11_9.r_y();
                                                                    var9_11 = t9d.b();
                                                                    var13_12 = u7m.gfm(var12_10);
                                                                    try {
                                                                        try {
                                                                            if (var12_10 == ox_.ibw || var13_12 == null) break block38;
                                                                        }
                                                                        catch (oov v0) {
                                                                            throw cya$ga4.a(v0);
                                                                        }
                                                                        v1 = new erg(var13_12, 1, var12_10.hvp(var11_9));
                                                                        break block39;
                                                                    }
                                                                    catch (oov v2) {
                                                                        throw cya$ga4.a(v2);
                                                                    }
                                                                }
                                                                v1 = null;
                                                            }
                                                            var14_13 = v1;
                                                            try {
                                                                if (var14_13 != null) break block40;
                                                                v3 = cya$ga4.a("x", (int)16858, (long)(4854586880138536724L ^ var7_7));
                                                                break block41;
                                                            }
                                                            catch (oov v4) {
                                                                throw cya$ga4.a(v4);
                                                            }
                                                        }
                                                        v3 = var13_12.ily(var14_13);
                                                    }
                                                    var15_14 = v3;
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var9_11 == 0) break block42;
                                                                    if (var13_12 != null) break block43;
                                                                }
                                                                catch (oov v5) {
                                                                    throw cya$ga4.a(v5);
                                                                }
                                                                v6 = var12_10;
                                                                if (var9_11 == 0) break block44;
                                                            }
                                                            catch (oov v7) {
                                                                throw cya$ga4.a(v7);
                                                            }
                                                            if (v6 == ox_.gdz) break block45;
                                                        }
                                                        catch (oov v8) {
                                                            throw cya$ga4.a(v8);
                                                        }
                                                        v6 = var12_10;
                                                    }
                                                    catch (oov v9) {
                                                        throw cya$ga4.a(v9);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var9_11 == 0) break block46;
                                                        if (v6 == ox_.whp) break block45;
                                                    }
                                                    catch (oov v10) {
                                                        throw cya$ga4.a(v10);
                                                    }
                                                    v6 = var12_10;
                                                }
                                                catch (oov v11) {
                                                    throw cya$ga4.a(v11);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var9_11 == 0) break block47;
                                                    if (v6 == ox_.ska) break block48;
                                                }
                                                catch (oov v12) {
                                                    throw cya$ga4.a(v12);
                                                }
                                                v6 = var12_10;
                                            }
                                            catch (oov v13) {
                                                throw cya$ga4.a(v13);
                                            }
                                        }
                                        if (v6 != ox_.dr2) break block51;
                                    }
                                    var13_12 = xbr.miu;
                                    if (var9_11 != 0) break block51;
                                }
                                var13_12 = xbr.lqp;
                            }
                            if (var13_12 != null) {
                                var14_13 = new erg(var13_12, 1, var12_10.hvp(var11_9));
                                var15_14 = var12_10.ieu();
                            }
                        }
                        this.t_l(var2_2, var3_3, var14_13);
                        this.hvc.fex.eh6(var15_14, var2_2 + 18 + 5, var3_3 + 3, 0xFFFFFF);
                    }
                    try {
                        v14 = var1_1;
                        if (var9_11 == 0) break block49;
                        if (v14 == 0) {
                        }
                        ** GOTO lbl106
                    }
                    catch (oov v15) {
                        throw cya$ga4.a(v15);
                    }
                    var16_15 = fc1.gx1((String)cya$ga4.a("x", (int)7201, (long)(8514288152807619308L ^ var7_7)), new Object[]{var10_8.pyz()});
                    try {
                        if (var9_11 != 0) break block50;
lbl106:
                        // 2 sources

                        v14 = var1_1;
                    }
                    catch (oov v16) {
                        throw cya$ga4.a(v16);
                    }
                }
                if (v14 != cya.w72(this.hvc).t48().size() - 1) break block52;
                var16_15 = fc1.gx1((String)cya$ga4.a("x", (int)7242, (long)(7195994474835163782L ^ var7_7)), new Object[]{var10_8.pyz()});
                if (var9_11 != 0) break block50;
            }
            var16_15 = fc1.gx1((String)cya$ga4.a("x", (int)18198, (long)(6400815508746822105L ^ var7_7)), new Object[]{var10_8.pyz()});
        }
        this.hvc.fex.eh6(var16_15, var2_2 + 2 + 213 - this.hvc.fex.ezt(var16_15), var3_3 + 3, 0xFFFFFF);
    }

    @Override
    public int getScrollBarX() {
        return this.wde - 70;
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

                cya$ga4.a = c.a(5402553650796807616L, 6099163809760816098L, MethodHandles.lookup().lookupClass()).a(161050761743860L);
                cya$ga4.d = new HashMap<K, V>(13);
                var0 = cya$ga4.a ^ 8250042519294L;
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
                var6_5 = "\u00ceH\\\u00d5\u001f5M\u00fe;;F\u00eb\u008a\u00cd\u00b1%\u00e4!2\u00dc{\u001d\u0095\u0001\u00ce]\u00fd\u00e0\u00ee\u00dbB\u0013\u00e9\u001f\u00b0\u00f9j\u001d\u00d5\u0006\u00e1\u008c\u0002\u00d9\u00dck\u00d5\u00b9z\b\u00be\t\u00ec\u001f\u0082OI\u00a1\u00bf\u00b5\u00da\u000bB\nH/\u008d:Q\u00a6\u00a7\u00d5\u00f4\u00a4\u00d7]\tx\u00deK\u00b6I@\u001c\u0088\u00ee\u00a8\u00b5\u00edA\u00b1uz4\u00fb\u0010\u0012\u00944\u00b6\u00d6\u00c9\nX1\u00b8\u00b1v'\u00b0\u00b2\u00a3\u000e\u0080r~g\u0018\u00fa\u0002\r-W.*\u00de~\u00a5\u0086\u00ad&js\u0094\u009e.\u00cc";
                var8_6 = "\u00ceH\\\u00d5\u001f5M\u00fe;;F\u00eb\u008a\u00cd\u00b1%\u00e4!2\u00dc{\u001d\u0095\u0001\u00ce]\u00fd\u00e0\u00ee\u00dbB\u0013\u00e9\u001f\u00b0\u00f9j\u001d\u00d5\u0006\u00e1\u008c\u0002\u00d9\u00dck\u00d5\u00b9z\b\u00be\t\u00ec\u001f\u0082OI\u00a1\u00bf\u00b5\u00da\u000bB\nH/\u008d:Q\u00a6\u00a7\u00d5\u00f4\u00a4\u00d7]\tx\u00deK\u00b6I@\u001c\u0088\u00ee\u00a8\u00b5\u00edA\u00b1uz4\u00fb\u0010\u0012\u00944\u00b6\u00d6\u00c9\nX1\u00b8\u00b1v'\u00b0\u00b2\u00a3\u000e\u0080r~g\u0018\u00fa\u0002\r-W.*\u00de~\u00a5\u0086\u00ad&js\u0094\u009e.\u00cc".length();
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
                    var9_3[var7_4++] = cya$ga4.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00a0\u00d8\u00fd\u00ac\u00e3{\u00bb\u0007\u00ecs8\u00d00\u00fb\u0092U\u00dbl\u00c4x\u00d1\u0017L\u00bc\u00aa\u0012\u00caz\u00bc\u001a\u00ffqj\u0016\u00e1\u0082j\u00feI\u0092g\u0015\u00ff\u00c5\u00dei\u00d4\u0084\u00d7\u0093\u0093\u00e3(\"m\u0098\u00b2L\u00e4e\u00d3\u00a1?\u00e0\u0010\u0015U\u00bb)\u00e1i*x1\u00a6k\u00c6\u00ff8\u00a6\u00f9";
                    var8_6 = "\u00a0\u00d8\u00fd\u00ac\u00e3{\u00bb\u0007\u00ecs8\u00d00\u00fb\u0092U\u00dbl\u00c4x\u00d1\u0017L\u00bc\u00aa\u0012\u00caz\u00bc\u001a\u00ffqj\u0016\u00e1\u0082j\u00feI\u0092g\u0015\u00ff\u00c5\u00dei\u00d4\u0084\u00d7\u0093\u0093\u00e3(\"m\u0098\u00b2L\u00e4e\u00d3\u00a1?\u00e0\u0010\u0015U\u00bb)\u00e1i*x1\u00a6k\u00c6\u00ff8\u00a6\u00f9".length();
                    var5_7 = 64;
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
                    var9_3[var7_4++] = cya$ga4.a(var10_9).intern();
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
        cya$ga4.b = var9_3;
        cya$ga4.c = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x161C;
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
                throw new RuntimeException("cya$ga4", exception);
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
            cya$ga4.c[n2] = cya$ga4.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cya$ga4.a(n, l);
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
            throw new RuntimeException("cya$ga4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cya$ga4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

