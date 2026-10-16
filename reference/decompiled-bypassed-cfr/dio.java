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

public class dio
extends j1s {
    private static final long a = c.a(-7426199114673678244L, 3703104432218373010L, MethodHandles.lookup().lookupClass()).a(119665620372199L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public dio() {
        long l = a ^ 0x652A0C7CE891L;
        super((String)((Object)dio.a("l", (int)2175, (long)(0x690D917E705AD759L ^ l))), (String)((Object)dio.a("l", (int)14334, (long)(0x229719A6814468D9L ^ l))));
    }

    @Override
    public void w4v() {
        dio dio2;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        dio2 = this;
                        if (n != 0) break block4;
                        if (dio2.wyl.tij != null) break block5;
                    }
                    catch (oov oov2) {
                        throw dio.a(oov2);
                    }
                    return;
                }
                catch (oov oov3) {
                    throw dio.a(oov3);
                }
            }
            dio2 = this;
        }
        super.w4v();
    }

    @Override
    public void i__() {
        block15: {
            block16: {
                c05 c052;
                h50$f05 h50$f05;
                h50$f05 h50$f052;
                block14: {
                    c05 c053;
                    int n;
                    block12: {
                        block13: {
                            n = t9d.c();
                            try {
                                try {
                                    super.i__();
                                    c053 = this.wyl;
                                    if (n != 0) break block12;
                                    if (c053.tij != null) break block13;
                                }
                                catch (oov oov2) {
                                    throw dio.a(oov2);
                                }
                                return;
                            }
                            catch (oov oov3) {
                                throw dio.a(oov3);
                            }
                        }
                        c053 = this.wyl;
                    }
                    try {
                        try {
                            try {
                                h50$f052 = c053.l7q.fdl();
                                h50$f05 = h50$f05._nr;
                                if (n != 0) break block14;
                                if (h50$f052 == h50$f05) break block15;
                            }
                            catch (oov oov4) {
                                throw dio.a(oov4);
                            }
                            c052 = this.wyl;
                            if (n != 0) break block16;
                        }
                        catch (oov oov5) {
                            throw dio.a(oov5);
                        }
                        h50$f052 = c052.l7q.fdl();
                        h50$f05 = h50$f05.l18;
                    }
                    catch (oov oov6) {
                        throw dio.a(oov6);
                    }
                }
                try {
                    if (h50$f052 == h50$f05) break block15;
                    this.wyl.vg8.lls.wvp = false;
                    c052 = this.wyl;
                }
                catch (oov oov7) {
                    throw dio.a(oov7);
                }
            }
            c052.vg8.lls.wzx = false;
        }
    }

    @jev
    private void z2p(q8e q8e2) {
        block9: {
            c05 c052;
            block10: {
                h50$f05 h50$f05;
                h50$f05 h50$f052;
                block8: {
                    int n = t9d.b();
                    try {
                        try {
                            try {
                                h50$f052 = this.wyl.l7q.fdl();
                                h50$f05 = h50$f05._nr;
                                if (n == 0) break block8;
                                if (h50$f052 == h50$f05) break block9;
                            }
                            catch (oov oov2) {
                                throw dio.a(oov2);
                            }
                            c052 = this.wyl;
                            if (n == 0) break block10;
                        }
                        catch (oov oov3) {
                            throw dio.a(oov3);
                        }
                        h50$f052 = c052.l7q.fdl();
                        h50$f05 = h50$f05.l18;
                    }
                    catch (oov oov4) {
                        throw dio.a(oov4);
                    }
                }
                try {
                    if (h50$f052 == h50$f05) break block9;
                    this.wyl.vg8.lls.wvp = true;
                    this.wyl.vg8.lls.wzx = true;
                    c052 = this.wyl;
                }
                catch (oov oov5) {
                    throw dio.a(oov5);
                }
            }
            c052.vg8.lls.e7s(i4o.ewf.d7c().floatValue() * 0.05f);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        f = new HashMap(13);
        long l = a ^ 0x68D95AEFF7CL;
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
        String string = "V\u00ad\u00b7\u00c8\u0002\"\u00e8w\u0011P?\u00fb\u009d\u00cb\u0083\u00e9\u0010\u0081\u0081\u00a7U\u008f\u00bc_+\u00a9\u00ac\u00e9\u00eb\u00e9d\u0004G";
        int n2 = "V\u00ad\u00b7\u00c8\u0002\"\u00e8w\u0011P?\u00fb\u009d\u00cb\u0083\u00e9\u0010\u0081\u0081\u00a7U\u008f\u00bc_+\u00a9\u00ac\u00e9\u00eb\u00e9d\u0004G".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = dio.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[2];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1B;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dio", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            dio.e[n2] = dio.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dio.a(n, l);
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
            throw new RuntimeException("dio" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dio.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

