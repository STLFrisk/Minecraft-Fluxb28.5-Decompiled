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

public class axk {
    public static final axk sar;
    private final /* synthetic */ String ur_;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public axk(String string) {
        this.ur_ = string;
    }

    public boolean vol() {
        boolean bl;
        block8: {
            block9: {
                block7: {
                    String string;
                    int n;
                    block6: {
                        n = t9d.b();
                        try {
                            try {
                                string = this.ur_;
                                if (n == 0) break block6;
                                if (string == null) break block7;
                            }
                            catch (oov oov2) {
                                throw axk.a(oov2);
                            }
                            string = this.ur_;
                        }
                        catch (oov oov3) {
                            throw axk.a(oov3);
                        }
                    }
                    try {
                        bl = string.isEmpty();
                        if (n == 0) break block8;
                        if (!bl) break block9;
                    }
                    catch (oov oov4) {
                        throw axk.a(oov4);
                    }
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public String o7p() {
        return this.ur_;
    }

    public void fze(bdo bdo2) {
        long l = a ^ 0x6041F2DCE609L;
        bdo2.rjq((String)((Object)axk.a("h", (int)8551, (long)(0x16DC518A0F309630L ^ l))), this.ur_);
    }

    public static axk yq_(bdo bdo2) {
        block5: {
            CallSite callSite;
            bdo bdo3;
            block4: {
                long l = a ^ 0x16A95FC0AF1BL;
                int n = t9d.c();
                try {
                    try {
                        bdo3 = bdo2;
                        callSite = axk.a("h", (int)11151, (long)(0x874C96DC13B55CBL ^ l));
                        if (n != 0) break block4;
                        if (!bdo3.inh((String)((Object)callSite), 8)) break block5;
                    }
                    catch (oov oov2) {
                        throw axk.a(oov2);
                    }
                    bdo3 = bdo2;
                    callSite = axk.a("h", (int)11151, (long)(0x874C96DC13B55CBL ^ l));
                }
                catch (oov oov3) {
                    throw axk.a(oov3);
                }
            }
            String string = bdo3.u14((String)((Object)callSite));
            return new axk(string);
        }
        return sar;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(970783075760058203L, -2481412003115494518L, MethodHandles.lookup().lookupClass()).a(76308721149453L);
        d = new HashMap(13);
        long l = a ^ 0x121CC2307407L;
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
        String string = "p\u00c4\u001a\u009c\u0093c\u008d\u00b2L\u0080m:M\u00880X\u0010bd\u0003\u0003\u00a6\u00c6X\u00c6t\u00a3\u00c4-\u0007{\u00abz";
        int n2 = "p\u00c4\u001a\u009c\u0093c\u008d\u00b2L\u0080m:M\u00880X\u0010bd\u0003\u0003\u00a6\u00c6X\u00c6t\u00a3\u00c4-\u0007{\u00abz".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = axk.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                sar = new axk("");
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7C94;
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
                throw new RuntimeException("axk", exception);
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
            axk.c[n2] = axk.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = axk.a(n, l);
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
            throw new RuntimeException("axk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(axk.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

