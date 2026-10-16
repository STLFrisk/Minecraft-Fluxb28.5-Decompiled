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

public class d3e {
    private /* synthetic */ String[][] wrx;
    private /* synthetic */ u7m[][] ouc;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public d3e() {
        long l = a ^ 0x1A0D3EF4D007L;
        String[][] stringArrayArray = new String[4][];
        String[] stringArray = new String[2];
        stringArray[0] = d3e.a("b", (int)24392, (long)(0x3595C221E90510EL ^ l));
        stringArray[1] = d3e.a("b", (int)20436, (long)(0x7464FE67C42E4193L ^ l));
        stringArrayArray[0] = stringArray;
        String[] stringArray2 = new String[3];
        stringArray2[0] = d3e.a("b", (int)13725, (long)(0x76F2B9F0B113BBD8L ^ l));
        stringArray2[1] = d3e.a("b", (int)3680, (long)(0x7E1B67C796048024L ^ l));
        stringArray2[2] = d3e.a("b", (int)3680, (long)(0x7E1B67C796048024L ^ l));
        stringArrayArray[1] = stringArray2;
        String[] stringArray3 = new String[3];
        stringArray3[0] = d3e.a("b", (int)3680, (long)(0x7E1B67C796048024L ^ l));
        stringArray3[1] = d3e.a("b", (int)13725, (long)(0x76F2B9F0B113BBD8L ^ l));
        stringArray3[2] = d3e.a("b", (int)13725, (long)(0x76F2B9F0B113BBD8L ^ l));
        stringArrayArray[2] = stringArray3;
        String[] stringArray4 = new String[2];
        stringArray4[0] = d3e.a("b", (int)13725, (long)(0x76F2B9F0B113BBD8L ^ l));
        stringArray4[1] = d3e.a("b", (int)13725, (long)(0x76F2B9F0B113BBD8L ^ l));
        stringArrayArray[3] = stringArray4;
        this.wrx = stringArrayArray;
        this.ouc = new u7m[][]{{xbr.i8v, xbr.icz, xbr.exg, xbr.jtr}, {xbr.pgw, xbr.c2v, xbr.z44, xbr.hrw}, {xbr.s9f, xbr.w41, xbr.r6g, xbr.mmx}, {xbr.esc, xbr.hfp, xbr.rrf, xbr.c8v}, {xbr._qk, xbr.tfe, xbr.zrn, xbr.lsz}};
    }

    public void es_(opt opt2) {
        for (int i = 0; i < this.ouc[0].length; ++i) {
            u7m u7m2 = this.ouc[0][i];
            for (int j = 0; j < this.ouc.length - 1; ++j) {
                u7m u7m3 = this.ouc[j + 1][i];
                opt2.q01(new erg(u7m3), new Object[]{this.wrx[j], Character.valueOf('X'), u7m2});
            }
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

                d3e.a = c.a(9150737176418856897L, -5642536717084733328L, MethodHandles.lookup().lookupClass()).a(87561559080009L);
                d3e.d = new HashMap<K, V>(13);
                var0 = d3e.a ^ 72464217857906L;
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
                var6_5 = "\u00ea\u0091>\u0094\u0014\u00b7\r\u00a7\u00bc\u0086\u00b0\u00f0^\u00cd\u0018\u0006\u0010S\u0019r\u00db4\u00cd\u0088H\u00a5d\u00abL\u0091\u00e3\u0015[";
                var8_6 = "\u00ea\u0091>\u0094\u0014\u00b7\r\u00a7\u00bc\u0086\u00b0\u00f0^\u00cd\u0018\u0006\u0010S\u0019r\u00db4\u00cd\u0088H\u00a5d\u00abL\u0091\u00e3\u0015[".length();
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
                    var9_3[var7_4++] = d3e.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0084\u00fc\u00f0\u00e3r\u00e7\u00f3\u00b9\u00da\u00a6K\u00d8\u0086\"\u0092b\u0010\u0099\u0013\u00a4u\u009d\u0087\u0086o\u008b\u00ee\u00e7\u0000>A\u0097\u00a5";
                    var8_6 = "\u0084\u00fc\u00f0\u00e3r\u00e7\u00f3\u00b9\u00da\u00a6K\u00d8\u0086\"\u0092b\u0010\u0099\u0013\u00a4u\u009d\u0087\u0086o\u008b\u00ee\u00e7\u0000>A\u0097\u00a5".length();
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
                    var9_3[var7_4++] = d3e.a(var10_9).intern();
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
        d3e.b = var9_3;
        d3e.c = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x63F7;
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
                throw new RuntimeException("d3e", exception);
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
            d3e.c[n2] = d3e.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = d3e.a(n, l);
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
            throw new RuntimeException("d3e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d3e.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

