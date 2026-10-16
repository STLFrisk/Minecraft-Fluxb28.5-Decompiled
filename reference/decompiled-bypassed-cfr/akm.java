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

public class akm {
    private mew afl;
    public akm$qs6 oyz;
    public vt2 m_f;
    public fqr jhn;
    public i2h sc8;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public akm(fqr fqr2, vt2 vt22, mew mew2) {
        this(akm$qs6.i4l, fqr2, vt22, mew2);
    }

    public akm(fqr fqr2, vt2 vt22) {
        this(akm$qs6.i4l, fqr2, vt22, mew._9b);
    }

    public akm(i2h i2h2) {
        this(i2h2, new fqr(i2h2.o2v, i2h2.kfp, i2h2.vbd));
    }

    public akm(akm$qs6 akm$qs6, fqr fqr2, vt2 vt22, mew mew2) {
        this.oyz = akm$qs6;
        this.afl = mew2;
        this.m_f = vt22;
        this.jhn = new fqr(fqr2.lvi, fqr2.gn5, fqr2.bn2);
    }

    public akm(i2h i2h2, fqr fqr2) {
        this.oyz = akm$qs6.xvy;
        this.sc8 = i2h2;
        this.jhn = fqr2;
    }

    public mew _uf() {
        return this.afl;
    }

    public String toString() {
        long l = a ^ 0x3A81507F6B81L;
        return (String)((Object)akm.a("j", (int)5312, (long)(0x23B94816E0596420L ^ l))) + (Object)((Object)this.oyz) + (String)((Object)akm.a("j", (int)4003, (long)(0x597935E3CD14FF40L ^ l))) + this.afl + (String)((Object)akm.a("j", (int)29813, (long)(0x7AB4F89F06FD0494L ^ l))) + this.m_f + (String)((Object)akm.a("j", (int)26168, (long)(0x6FF362C3E1F396DAL ^ l))) + this.jhn + (String)((Object)akm.a("j", (int)18503, (long)(0x78C3FEA126BD38A1L ^ l))) + this.sc8 + '}';
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

                akm.a = c.a(7522374332906894815L, -4069765233481506225L, MethodHandles.lookup().lookupClass()).a(99210281461396L);
                akm.d = new HashMap<K, V>(13);
                var0 = akm.a ^ 75291739306543L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u00ba\u00fc|\u00bb\u00e36$g\r\u00e5\u00fe\\\u0007\u00a9Ph \u00a8\u00f6\u00d20\u00b2TT\u00a2\u00d7\u000e+\u00ec\u00f2A\u00ab\u00dd\u0091\u0010\u00bc\u00fb&\u00fb\u00c9\u00a4/\u0088\u00be\u00a8aY\"\u0003\u0018\u00fdw\u0098LB\u00ddG\u00d2\u00e2\u00d7\u008b/\u009ct+\u00a5\u00dc\u00a6\u009c\u0095\u0002\u00b6\u00f3\u00f2";
                var8_6 = "\u00ba\u00fc|\u00bb\u00e36$g\r\u00e5\u00fe\\\u0007\u00a9Ph \u00a8\u00f6\u00d20\u00b2TT\u00a2\u00d7\u000e+\u00ec\u00f2A\u00ab\u00dd\u0091\u0010\u00bc\u00fb&\u00fb\u00c9\u00a4/\u0088\u00be\u00a8aY\"\u0003\u0018\u00fdw\u0098LB\u00ddG\u00d2\u00e2\u00d7\u008b/\u009ct+\u00a5\u00dc\u00a6\u009c\u0095\u0002\u00b6\u00f3\u00f2".length();
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
                    var9_3[var7_4++] = akm.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00b2\u000652\u0086\u0003XN*K\u00e7\u00f0\u0096\u00a6\u001eF f\u009b\u00f5\u0096\u0012\u00b3\u00f1\u00d6\u00ad\u00152_\u00e0\u00b0\u0086\u00ba\u00ea\u001d\b\\\u00fc\u00d0]\u00d8\u008d\u0015t1z)\u00f5\u0092";
                    var8_6 = "\u00b2\u000652\u0086\u0003XN*K\u00e7\u00f0\u0096\u00a6\u001eF f\u009b\u00f5\u0096\u0012\u00b3\u00f1\u00d6\u00ad\u00152_\u00e0\u00b0\u0086\u00ba\u00ea\u001d\b\\\u00fc\u00d0]\u00d8\u008d\u0015t1z)\u00f5\u0092".length();
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
                    var9_3[var7_4++] = akm.a(var10_9).intern();
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
        akm.b = var9_3;
        akm.c = new String[5];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x685A;
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
                throw new RuntimeException("akm", exception);
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
            akm.c[n2] = akm.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = akm.a(n, l);
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
            throw new RuntimeException("akm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(akm.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

