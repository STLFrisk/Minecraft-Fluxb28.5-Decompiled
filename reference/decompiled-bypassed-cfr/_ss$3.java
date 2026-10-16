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

public final class _ss$3
implements bx6 {
    private static final long a = c.a(-4949274234672281753L, -3830206342313049996L, MethodHandles.lookup().lookupClass()).a(144198675747148L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    @Override
    public String dg6(int n) {
        String string;
        block10: {
            double d;
            double d2;
            long l;
            block8: {
                block9: {
                    l = a ^ 0x5960F21C7BD5L;
                    d2 = (double)n / 100.0;
                    double d3 = d2 / 1000.0;
                    int n2 = t9d.b();
                    try {
                        try {
                            double d4 = d3 - 0.5;
                            d = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
                            if (n2 == 0) break block8;
                            if (d > 0) {
                            }
                            break block9;
                        }
                        catch (oov oov2) {
                            throw _ss$3.a(oov2);
                        }
                        string = _ss.esp().format(d3) + (String)((Object)_ss$3.a("o", (int)12, (long)(0x2F63048E3B00B99EL ^ l)));
                        break block10;
                    }
                    catch (oov oov3) {
                        throw _ss$3.a(oov3);
                    }
                }
                double d5 = d2 - 0.5;
                d = d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1);
            }
            try {
                if (d > 0) {
                    string = _ss.esp().format(d2) + (String)((Object)_ss$3.a("o", (int)18489, (long)(0x61FD816C766AF1A9L ^ l)));
                }
            }
            catch (oov oov4) {
                throw _ss$3.a(oov4);
            }
            string = n + (String)((Object)_ss$3.a("o", (int)25749, (long)(0x5098B774A7D5D06L ^ l)));
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        d = new HashMap(13);
        long l = a ^ 0x6F9437950F9EL;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u00b9\\\"g\b\u0088|\u001f\u00eb\u0094\u00d9U8\u00a7\u0088\u00cb\u0010V\u001a\u00c7\u00fb\u0099+\u00c1X\u00c7i\u00cd=.\u00f8\u00e0\u00be\u0010^\u008aK1\u00e8\u00a8\u0082\u0018\u00e7\u0006\u0011\u00b0\u00eb~r\r";
        int n2 = "\u00b9\\\"g\b\u0088|\u001f\u00eb\u0094\u00d9U8\u00a7\u0088\u00cb\u0010V\u001a\u00c7\u00fb\u0099+\u00c1X\u00c7i\u00cd=.\u00f8\u00e0\u00be\u0010^\u008aK1\u00e8\u00a8\u0082\u0018\u00e7\u0006\u0011\u00b0\u00eb~r\r".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _ss$3.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7C5E;
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
                throw new RuntimeException("_ss$3", exception);
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
            _ss$3.c[n2] = _ss$3.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _ss$3.a(n, l);
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
            throw new RuntimeException("_ss$3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_ss$3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

