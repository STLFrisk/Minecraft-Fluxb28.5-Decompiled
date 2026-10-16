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

public class caj {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public void sgb(opt opt2) {
        long l = a ^ 0x1E5CAC1DFCC7L;
        opt2.liy(new erg(xbr.xvc), new Object[]{ox_.zml, ox_.ae9, xbr.xz5});
        Object[] objectArray = new Object[5];
        objectArray[0] = caj.a("u", (int)23196, (long)(0x3A26F0B949390256L ^ l));
        objectArray[1] = Character.valueOf('X');
        objectArray[2] = new erg(xbr.nnn, 1, qvg._fk.b9d());
        objectArray[3] = Character.valueOf('#');
        objectArray[4] = xbr.iqq;
        opt2.q01(new erg(xbr.xth, 8), objectArray);
        Object[] objectArray2 = new Object[13];
        objectArray2[0] = caj.a("u", (int)30486, (long)(0x79DB7B21C9192FDFL ^ l));
        objectArray2[1] = caj.a("u", (int)24657, (long)(0x70E388233B7B89DL ^ l));
        objectArray2[2] = caj.a("u", (int)10051, (long)(0x6C70BDE98A2F7F8EL ^ l));
        objectArray2[3] = Character.valueOf('R');
        objectArray2[4] = new erg(xbr.sng);
        objectArray2[5] = Character.valueOf('C');
        objectArray2[6] = xbr.aar;
        objectArray2[7] = Character.valueOf('P');
        objectArray2[8] = xbr.s8j;
        objectArray2[9] = Character.valueOf('M');
        objectArray2[10] = ox_.zml;
        objectArray2[11] = Character.valueOf('B');
        objectArray2[12] = xbr.xz5;
        opt2.q01(new erg(xbr.ak_), objectArray2);
        Object[] objectArray3 = new Object[13];
        objectArray3[0] = caj.a("u", (int)25094, (long)(0x2570C13F89843AC9L ^ l));
        objectArray3[1] = caj.a("u", (int)31892, (long)(0x5619C526A7C1245CL ^ l));
        objectArray3[2] = caj.a("u", (int)31337, (long)(0x140207F12DAD22ADL ^ l));
        objectArray3[3] = Character.valueOf('R');
        objectArray3[4] = new erg(xbr.sng);
        objectArray3[5] = Character.valueOf('C');
        objectArray3[6] = xbr.aar;
        objectArray3[7] = Character.valueOf('P');
        objectArray3[8] = xbr.s8j;
        objectArray3[9] = Character.valueOf('D');
        objectArray3[10] = ox_.ae9;
        objectArray3[11] = Character.valueOf('B');
        objectArray3[12] = xbr.xz5;
        opt2.q01(new erg(xbr.ak_), objectArray3);
        Object[] objectArray4 = new Object[5];
        objectArray4[0] = caj.a("u", (int)23683, (long)(0x595EEDAA56FB8448L ^ l));
        objectArray4[1] = caj.a("u", (int)9986, (long)(0x5E51853F4147FFCCL ^ l));
        objectArray4[2] = caj.a("u", (int)9986, (long)(0x5E51853F4147FFCCL ^ l));
        objectArray4[3] = Character.valueOf('M');
        objectArray4[4] = xbr.ei2;
        opt2.q01(new erg(ox_.gdb), objectArray4);
        Object[] objectArray5 = new Object[3];
        objectArray5[0] = "M";
        objectArray5[1] = Character.valueOf('M');
        objectArray5[2] = xbr.ei2;
        opt2.q01(new erg(xbr.k_k), objectArray5);
        Object[] objectArray6 = new Object[3];
        objectArray6[0] = "M";
        objectArray6[1] = Character.valueOf('M');
        objectArray6[2] = ox_.jzx;
        opt2.q01(new erg(xbr.d0o, 4), objectArray6);
        opt2.liy(new erg(xbr.pb8), new Object[]{ox_.jzx, xbr.bwp, xbr.ipl});
        opt2.liy(new erg(xbr.nsn), new Object[]{xbr.mrm, ox_.zml, xbr.bwp});
        opt2.liy(new erg(xbr.t4v, 2), new Object[]{xbr.nh7});
        opt2.liy(new erg(xbr.tle), new Object[]{xbr.t4v, xbr.g77});
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

                caj.a = c.a(-3210651280462754475L, 4613682451672621L, MethodHandles.lookup().lookupClass()).a(127595732562108L);
                caj.d = new HashMap<K, V>(13);
                var0 = caj.a ^ 61566314798501L;
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
                var6_5 = "\u00a1eL\u00b8f\u001c\u008f\u00e0+\u00c2\u0084&\u000f%\u000b\u008a\u0010\u00fdt\u00bb\u0096\u008ch\u008e\u008aG\u0005\u00a4\u0089\u00fe\u00fb\u00e75\u0010\u0010iP[tx\u00cc+\no=\u00c5\u00bbZ=\u00d3\u0010\u0003q#\u0082\u001bY\u00df\u00e0_t\u00c5\u00d4\u00ed\u001a\u00df!\u00103\u0007\u00fa\u00b91\u0086\u0015\u0095\u00e8\u00e5\u00efC<\u00e0\"@\u0010\u0093%\u00ef\u0086\u00b9\u00af\u001e;\u00da\u00bc]cc\u008c>\n\u0010\bP][\u0004\u0098\u009cA\u009bT,p\u000f\u009aO\u00fb";
                var8_6 = "\u00a1eL\u00b8f\u001c\u008f\u00e0+\u00c2\u0084&\u000f%\u000b\u008a\u0010\u00fdt\u00bb\u0096\u008ch\u008e\u008aG\u0005\u00a4\u0089\u00fe\u00fb\u00e75\u0010\u0010iP[tx\u00cc+\no=\u00c5\u00bbZ=\u00d3\u0010\u0003q#\u0082\u001bY\u00df\u00e0_t\u00c5\u00d4\u00ed\u001a\u00df!\u00103\u0007\u00fa\u00b91\u0086\u0015\u0095\u00e8\u00e5\u00efC<\u00e0\"@\u0010\u0093%\u00ef\u0086\u00b9\u00af\u001e;\u00da\u00bc]cc\u008c>\n\u0010\bP][\u0004\u0098\u009cA\u009bT,p\u000f\u009aO\u00fb".length();
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
                    var9_3[var7_4++] = caj.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00d9\u00a4\u00e3\\P^5>\u00a6\u00ab\u00ad1\u000e\u0014\u0010d\u0010-\u00eeYBK}_g\u000ey:\u00ff\u00cd\u00d0Y\u00c0";
                    var8_6 = "\u00d9\u00a4\u00e3\\P^5>\u00a6\u00ab\u00ad1\u000e\u0014\u0010d\u0010-\u00eeYBK}_g\u000ey:\u00ff\u00cd\u00d0Y\u00c0".length();
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
                    var9_3[var7_4++] = caj.a(var10_9).intern();
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
        caj.b = var9_3;
        caj.c = new String[9];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1A75;
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
                throw new RuntimeException("caj", exception);
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
            caj.c[n2] = caj.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = caj.a(n, l);
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
            throw new RuntimeException("caj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(caj.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

