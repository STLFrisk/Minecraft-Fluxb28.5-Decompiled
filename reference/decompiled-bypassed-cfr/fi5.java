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

public class fi5
extends j1s {
    private static final long a = c.a(-3708270163056252905L, 2434591882840326008L, MethodHandles.lookup().lookupClass()).a(257733916111381L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public fi5() {
        long l = a ^ 0x16519D7D2AC2L;
        super((String)((Object)fi5.a("c", (int)5165, (long)(0x633FF8E1CAA03095L ^ l))), (String)((Object)fi5.a("c", (int)2146, (long)(0x66FDABD4CC56ACDBL ^ l))));
    }

    @jev
    public void dbq(_qa _qa2) {
        float f;
        block22: {
            int n;
            block21: {
                int n2;
                block17: {
                    block18: {
                        float f2;
                        block19: {
                            n2 = t9d.b();
                            f = 0.05f;
                            try {
                                block20: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        n = this.wyl.vg8.lfk;
                                                        if (n2 == 0) break block17;
                                                        if (n == 0) break block18;
                                                    }
                                                    catch (oov oov2) {
                                                        throw fi5.a(oov2);
                                                    }
                                                    f2 = this.wyl.vg8.ooc;
                                                    if (n2 == 0) break block19;
                                                }
                                                catch (oov oov3) {
                                                    throw fi5.a(oov3);
                                                }
                                                if (f2 != 0.0f) break block20;
                                            }
                                            catch (oov oov4) {
                                                throw fi5.a(oov4);
                                            }
                                            float f3 = this.wyl.vg8.z66 - 0.0f;
                                            n = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                                            if (n2 == 0) break block17;
                                        }
                                        catch (oov oov5) {
                                            throw fi5.a(oov5);
                                        }
                                        if (n == 0) break block18;
                                    }
                                    catch (oov oov6) {
                                        throw fi5.a(oov6);
                                    }
                                }
                                this.wyl.vg8.mop = 0.4;
                                _qa2.ziq(0.4);
                                f2 = 0.704f;
                            }
                            catch (oov oov7) {
                                throw fi5.a(oov7);
                            }
                        }
                        f = f2;
                    }
                    n = this.wyl.vg8.lfk;
                }
                try {
                    try {
                        if (n2 == 0) break block21;
                        if (n != 0) break block22;
                    }
                    catch (oov oov8) {
                        throw fi5.a(oov8);
                    }
                    n = this.wyl.vg8.g25 % 2;
                }
                catch (oov oov9) {
                    throw fi5.a(oov9);
                }
            }
            if (n == 0) {
                f = 0.704f;
            }
        }
        ohv.qjs(_qa2, f);
    }

    private double u7w() {
        double d;
        block5: {
            int n;
            block4: {
                int n2 = t9d.b();
                d = 0.2872;
                try {
                    try {
                        n = this.wyl.vg8.cab(mcs.uwx);
                        if (n2 == 0) break block4;
                        if (n == 0) break block5;
                    }
                    catch (oov oov2) {
                        throw fi5.a(oov2);
                    }
                    n = this.wyl.vg8.dhd(mcs.uwx).tus();
                }
                catch (oov oov3) {
                    throw fi5.a(oov3);
                }
            }
            int n3 = n;
            d *= 1.0 + 0.2 * (double)(n3 + 1);
        }
        return d;
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
        long l = a ^ 0x63D915425FC0L;
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
        String string = " 3\u001ahL\u0000}\u0092+\u009f\u00e0\u009a\u00a1\u00d2$\u00ba\u0010\u008a\u00dc\u00d7\u001e\u00d9-\u008f\u00a5\u008fF\u00d4\u0013/\u001c\u00beU";
        int n2 = " 3\u001ahL\u0000}\u0092+\u009f\u00e0\u009a\u00a1\u00d2$\u00ba\u0010\u008a\u00dc\u00d7\u001e\u00d9-\u008f\u00a5\u008fF\u00d4\u0013/\u001c\u00beU".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = fi5.b(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7397;
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
                throw new RuntimeException("fi5", exception);
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
            fi5.e[n2] = fi5.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fi5.a(n, l);
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
            throw new RuntimeException("fi5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fi5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

