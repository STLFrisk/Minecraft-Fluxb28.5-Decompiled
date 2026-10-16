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
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f5k
extends ar7 {
    public static cn7 d1m;
    public static cn7 q0s;
    public static cn7 rzn;
    public static cn7 pje;
    public static cn7 dwu;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public f5k() {
        long l = a ^ 0x5B7A3B653F54L;
        super((String)((Object)f5k.b("g", (int)14914, (long)(0x3AB6DB0D401E2C28L ^ l))), _aj.sxc, false, new j1s[0]);
    }

    @jev
    public void kji(fz2 fz22) {
        Iterator iterator = f5k.ek1.tij.guf.iterator();
        int n = t9d.c();
        while (iterator.hasNext()) {
            block10: {
                Object object;
                block11: {
                    boolean bl;
                    Object e;
                    block9: {
                        e = iterator.next();
                        try {
                            try {
                                try {
                                    bl = e instanceof nvf;
                                    if (n != 0) break block9;
                                    if (!bl) break block10;
                                }
                                catch (oov oov2) {
                                    throw f5k.a(oov2);
                                }
                                object = d1m.d7c();
                                if (n != 0) break block11;
                            }
                            catch (oov oov3) {
                                throw f5k.a(oov3);
                            }
                            bl = (Boolean)object;
                        }
                        catch (oov oov4) {
                            throw f5k.a(oov4);
                        }
                    }
                    if (!bl) break block10;
                    object = e;
                }
                nvf nvf2 = (nvf)object;
                f5k.ek1.tij.rqa(nvf2);
            }
            if (n == 0) continue;
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

                f5k.a = c.a(4401691319304048993L, 2904919364761180701L, MethodHandles.lookup().lookupClass()).a(58001628484240L);
                var9 = f5k.a ^ 94597515306052L;
                f5k.h = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[7];
                var5_4 = 0;
                var4_5 = "_\u00c1_a\u00f0usq\u000f\u009f_\u00cb\u0000\u00e5\u00ee,\u0010\u00e5\u0086\u008ej\u00ff\u00e6v\r\u0001lh)\u00b07D\u0003 \u000e\u00b5\u00ef|l\u0098\u000bX\r\u00b9\u00a3\u00b4\u00f0\u00a2\u008e8\u00b1\u0095\u00a9\u00ce/-\u0099K\u0099\u00e9\u00e2MuO\u0099\u0089\u0018\u0084x\u00b1\u00c2Y@\u00b6\u0098t;>\u00d9%@\u00c4\u00af\u0014\u00a2\u009c\u00b1\u00a4\u00e0\u00e3\u00f1 c[/v\u001eY\u00ffiw\u001b%\u00b2\u00c9\u00b5\u00cf\u00ba\u00e7\u00af\t*\u00c2\u00a8\u0099\u00a4\fh\u00c3X3&\u00b8\u009a";
                var6_6 = "_\u00c1_a\u00f0usq\u000f\u009f_\u00cb\u0000\u00e5\u00ee,\u0010\u00e5\u0086\u008ej\u00ff\u00e6v\r\u0001lh)\u00b07D\u0003 \u000e\u00b5\u00ef|l\u0098\u000bX\r\u00b9\u00a3\u00b4\u00f0\u00a2\u008e8\u00b1\u0095\u00a9\u00ce/-\u0099K\u0099\u00e9\u00e2MuO\u0099\u0089\u0018\u0084x\u00b1\u00c2Y@\u00b6\u0098t;>\u00d9%@\u00c4\u00af\u0014\u00a2\u009c\u00b1\u00a4\u00e0\u00e3\u00f1 c[/v\u001eY\u00ffiw\u001b%\u00b2\u00c9\u00b5\u00cf\u00ba\u00e7\u00af\t*\u00c2\u00a8\u0099\u00a4\fh\u00c3X3&\u00b8\u009a".length();
                var3_7 = 16;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = f5k.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00d30\u00fc\u00fbz\u00e6\u00c8\u00e2\u00b4^al\u00e5\u0097x5 \u00ef\u0097\u00e6\u00e4\u00c8\u0013\u009dt\u0083\u00d3JM\u00d4i\n\u00c6\u00f0\u00bcdy\u007f\u001c\u00d1J\u00c3\u001eZ\u00dc}\u00ffz<";
                    var6_6 = "\u00d30\u00fc\u00fbz\u00e6\u00c8\u00e2\u00b4^al\u00e5\u0097x5 \u00ef\u0097\u00e6\u00e4\u00c8\u0013\u009dt\u0083\u00d3JM\u00d4i\n\u00c6\u00f0\u00bcdy\u007f\u001c\u00d1J\u00c3\u001eZ\u00dc}\u00ffz<".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = f5k.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        f5k.f = var7_3;
        f5k.g = new String[7];
        f5k.d1m = new cn7((String)f5k.b("g", (int)19220, (long)(3905236506061211243L ^ var9)), (String)f5k.b("g", (int)29253, (long)(8108519617653423931L ^ var9)), false);
        f5k.q0s = new cn7((String)f5k.b("g", (int)14914, (long)(4230804737826551608L ^ var9)), (String)f5k.b("g", (int)301, (long)(9108848878143294544L ^ var9)), true);
        f5k.rzn = new cn7((String)f5k.b("g", (int)14914, (long)(4230804737826551608L ^ var9)), (String)f5k.b("g", (int)11194, (long)(4578996943718540995L ^ var9)), true);
        f5k.pje = new cn7((String)f5k.b("g", (int)14914, (long)(4230804737826551608L ^ var9)), (String)f5k.b("g", (int)16061, (long)(2681864134195868609L ^ var9)), false);
        f5k.dwu = new cn7((String)f5k.b("g", (int)14914, (long)(4230804737826551608L ^ var9)), (String)f5k.b("g", (int)4996, (long)(2296706974652423932L ^ var9)), false);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5BF4;
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
                throw new RuntimeException("f5k", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            f5k.g[n2] = f5k.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = f5k.b(n, l);
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
            throw new RuntimeException("f5k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f5k.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

