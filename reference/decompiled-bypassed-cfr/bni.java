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

public class bni {
    private /* synthetic */ String[][] zkd;
    private /* synthetic */ Object[][] zzm;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public bni() {
        long l = a ^ 0x4AD4D1EED713L;
        String[][] stringArrayArray = new String[4][];
        String[] stringArray = new String[3];
        stringArray[0] = bni.a("k", (int)1359, (long)(0x454E23302FE2E991L ^ l));
        stringArray[1] = bni.a("k", (int)11883, (long)(0x5A0C57F0E727C2B2L ^ l));
        stringArray[2] = bni.a("k", (int)23924, (long)(0x22A87A572F48B1AEL ^ l));
        stringArrayArray[0] = stringArray;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "X";
        stringArray2[1] = "#";
        stringArray2[2] = "#";
        stringArrayArray[1] = stringArray2;
        String[] stringArray3 = new String[3];
        stringArray3[0] = bni.a("k", (int)32615, (long)(0x2211A19D188D13BAL ^ l));
        stringArray3[1] = bni.a("k", (int)15279, (long)(0x316FBE84A9EBD777L ^ l));
        stringArray3[2] = bni.a("k", (int)18436, (long)(0x73F411611BC8A4D4L ^ l));
        stringArrayArray[2] = stringArray3;
        String[] stringArray4 = new String[3];
        stringArray4[0] = bni.a("k", (int)75, (long)(0x2280BAF876EF6C94L ^ l));
        stringArray4[1] = bni.a("k", (int)25030, (long)(0x536A6C3EA188D1AL ^ l));
        stringArray4[2] = bni.a("k", (int)25030, (long)(0x536A6C3EA188D1AL ^ l));
        stringArrayArray[3] = stringArray4;
        this.zkd = stringArrayArray;
        this.zzm = new Object[][]{{ox_.wb7, ox_.a3_, xbr.icz, xbr.exg, xbr.jtr}, {xbr.xcf, xbr.cp_, xbr.l4f, xbr.ihl, xbr.a4b}, {xbr.im7, xbr.aa0, xbr.p91, xbr.wsp, xbr.uky}, {xbr.l_0, xbr.u_x, xbr.aec, xbr.ki4, xbr.vyj}, {xbr.imv, xbr.ns2, xbr.mim, xbr.qtu, xbr.t22}};
    }

    public void fjp(opt opt2) {
        long l = a ^ 0x57136116093AL;
        for (int i = 0; i < this.zzm[0].length; ++i) {
            Object object = this.zzm[0][i];
            for (int j = 0; j < this.zzm.length - 1; ++j) {
                u7m u7m2 = (u7m)this.zzm[j + 1][i];
                opt2.q01(new erg(u7m2), new Object[]{this.zkd[j], Character.valueOf('#'), xbr.t1j, Character.valueOf('X'), object});
            }
        }
        Object[] objectArray = new Object[4];
        objectArray[0] = bni.a("k", (int)25030, (long)(0x536BB045AE05333L ^ l));
        objectArray[1] = bni.a("k", (int)5758, (long)(0x7E6EBF0F7C18248CL ^ l));
        objectArray[2] = Character.valueOf('#');
        objectArray[3] = xbr.icz;
        opt2.q01(new erg(xbr.qsl), objectArray);
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

                bni.a = c.a(7555105542451578283L, 9183131385485550682L, MethodHandles.lookup().lookupClass()).a(224498652268242L);
                bni.d = new HashMap<K, V>(13);
                var0 = bni.a ^ 570326403975L;
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
                var6_5 = "_\u0017\u00b1$<\u00b3W1\u00d5\u00de\u00da\u00bc\u00a6\u008d\u008a/\u0010\u00e4A\u00a8\u00b4\u001f\u00fd\u001f\u00f1\u00ab\u0004Y\u009a-l_\b\u00104\u00edf\u0003\u00ec\u00b7\u00ff\u0095\u0096\u0083\u000bd\u00dd\u0091%\u00c1\u0010in\u009e\u009d\u00d3V}\u0083\u0000\u0082f\u00b7\u00b5n\u00a5\u0094\u0010h\u00a6g\u008b\u00ad\u00f5\u00e6\u00ef`\u00a5\u00b0.\u00c9G\u00b5\u00f1\u0010\f\u00a3V\u0011\u00ad\u00db\u00c1E\u00ae\u0001\u00e6\u0089\u00bd\u00e5\u00d6\u00ec\u0010q,\u0084b\u008b\u00e0Y\u00c2\u0080V\u00a8\u00df\u00df,\u0006\u00df";
                var8_6 = "_\u0017\u00b1$<\u00b3W1\u00d5\u00de\u00da\u00bc\u00a6\u008d\u008a/\u0010\u00e4A\u00a8\u00b4\u001f\u00fd\u001f\u00f1\u00ab\u0004Y\u009a-l_\b\u00104\u00edf\u0003\u00ec\u00b7\u00ff\u0095\u0096\u0083\u000bd\u00dd\u0091%\u00c1\u0010in\u009e\u009d\u00d3V}\u0083\u0000\u0082f\u00b7\u00b5n\u00a5\u0094\u0010h\u00a6g\u008b\u00ad\u00f5\u00e6\u00ef`\u00a5\u00b0.\u00c9G\u00b5\u00f1\u0010\f\u00a3V\u0011\u00ad\u00db\u00c1E\u00ae\u0001\u00e6\u0089\u00bd\u00e5\u00d6\u00ec\u0010q,\u0084b\u008b\u00e0Y\u00c2\u0080V\u00a8\u00df\u00df,\u0006\u00df".length();
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
                    var9_3[var7_4++] = bni.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "Lcb\rl\u008d\u00a5\u00b2\u009e\u00e6\u00d9no\u00dc\b-\u0010\u00advm\u00a5\u00d5\u00d6\u00db\u00d7t\u00cc\u00b0U\u00b9\u00e7pF";
                    var8_6 = "Lcb\rl\u008d\u00a5\u00b2\u009e\u00e6\u00d9no\u00dc\b-\u0010\u00advm\u00a5\u00d5\u00d6\u00db\u00d7t\u00cc\u00b0U\u00b9\u00e7pF".length();
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
                    var9_3[var7_4++] = bni.a(var10_9).intern();
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
        bni.b = var9_3;
        bni.c = new String[9];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x782E;
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
                throw new RuntimeException("bni", exception);
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
            bni.c[n2] = bni.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bni.a(n, l);
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
            throw new RuntimeException("bni" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bni.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

