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

public class a34
extends wdh {
    private static final long a = c.a(-2807440075128984770L, 3202498527596078370L, MethodHandles.lookup().lookupClass()).a(271721609096724L);
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public a34() {
        this.qfy(uja.kdm);
    }

    @Override
    public erg r__(erg erg2, t9d t9d2, ha9 ha92) {
        ha9 ha93;
        block11: {
            int n;
            erg erg3;
            block9: {
                int n2;
                block10: {
                    long l = a ^ 0x67FC387B1FBDL;
                    erg3 = new erg(xbr.kdv, 1, t9d2.xbc((String)((Object)a34.b("u", (int)17953, (long)(0x302E0B1E26E34E7AL ^ l)))));
                    String string = (String)((Object)a34.b("u", (int)664, (long)(0x679C273067F38AC2L ^ l))) + erg3.j6_();
                    int n3 = t9d.c();
                    ucr ucr2 = new ucr(string);
                    t9d2.m5k(string, ucr2);
                    n2 = n3;
                    try {
                        try {
                            ucr2.rqi = 0;
                            ucr2.snl(ha92.o2v, ha92.vbd, ucr2.rqi);
                            ucr2.d_r = (byte)t9d2.vzz.gs_();
                            ucr2.hcs();
                            n = --erg2.qd2;
                            if (n2 != 0) break block9;
                            if (n > 0) break block10;
                        }
                        catch (oov oov2) {
                            throw a34.a(oov2);
                        }
                        return erg3;
                    }
                    catch (oov oov3) {
                        throw a34.a(oov3);
                    }
                }
                try {
                    ha93 = ha92;
                    if (n2 != 0) break block11;
                    n = ha93.up_.phd(erg3.yaq()) ? 1 : 0;
                }
                catch (oov oov4) {
                    throw a34.a(oov4);
                }
            }
            try {
                if (n == 0) {
                    ha92.ejq(erg3, false);
                }
            }
            catch (oov oov5) {
                throw a34.a(oov5);
            }
            ha93 = ha92;
        }
        ha93.aex(l9p.foo[u7m._lo(this)]);
        return erg2;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        h = new HashMap(13);
        long l = a ^ 0x437B84C75F8DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "u!5\u00ff\u00a5I\u00afT26\u00dcU\u0084\u00022F\u0018\u00af\u0090\u00b4NM\u00cdfA^H-\u00cdl\u00eeU\u00ff\u00d0\"\u0006\u00d7\u008a\u00ea\u00e2w";
        int n2 = "u!5\u00ff\u00a5I\u00afT26\u00dcU\u0084\u00022F\u0018\u00af\u0090\u00b4NM\u00cdfA^H-\u00cdl\u00eeU\u00ff\u00d0\"\u0006\u00d7\u008a\u00ea\u00e2w".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = a34.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                g = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x56B0;
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
                throw new RuntimeException("a34", exception);
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
            a34.g[n2] = a34.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = a34.b(n, l);
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
            throw new RuntimeException("a34" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a34.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

