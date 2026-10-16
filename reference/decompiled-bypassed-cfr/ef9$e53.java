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

public class ef9$e53 {
    private String bb6;
    private boolean mm_;
    private int a4z;
    private double zin;
    private final ef9.nbw pmk;
    private static final long a = c.a(-8976528392494177158L, 5405851413425351641L, MethodHandles.lookup().lookupClass()).a(26836614103675L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public ef9$e53(String string, ef9.nbw nbw2) {
        this.pmk = nbw2;
        this.ck4(string);
    }

    /*
     * Loose catch block
     */
    public void ck4(String string) {
        boolean bl;
        block21: {
            block22: {
                int n;
                block17: {
                    block18: {
                        boolean bl2;
                        block19: {
                            long l;
                            block20: {
                                block24: {
                                    block23: {
                                        l = a ^ 0x340A4FFEAE8BL;
                                        n = t9d.c();
                                        this.bb6 = string;
                                        if (n != 0) break block17;
                                        if (string == null) break block18;
                                        break block23;
                                        catch (NumberFormatException numberFormatException) {
                                            throw ef9$e53.a(numberFormatException);
                                        }
                                    }
                                    bl2 = string.equals(ef9$e53.a("k", (int)24647, (long)(0x3A1DB3A10771C4FAL ^ l)));
                                    if (n != 0) break block19;
                                    break block24;
                                    catch (NumberFormatException numberFormatException) {
                                        throw ef9$e53.a(numberFormatException);
                                    }
                                }
                                try {
                                    block25: {
                                        if (!bl2) break block20;
                                        break block25;
                                        catch (NumberFormatException numberFormatException) {
                                            throw ef9$e53.a(numberFormatException);
                                        }
                                    }
                                    this.mm_ = false;
                                    return;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw ef9$e53.a(numberFormatException);
                                }
                            }
                            bl2 = string.equals(ef9$e53.a("k", (int)29781, (long)(0x125E2E15C051D0E9L ^ l)));
                        }
                        try {
                            if (bl2) {
                                this.mm_ = true;
                                return;
                            }
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw ef9$e53.a(numberFormatException);
                        }
                    }
                    this.mm_ = Boolean.parseBoolean(string);
                }
                try {
                    ef9$e53 ef9$e53 = this;
                    bl = this.mm_;
                    if (n != 0) break block21;
                    if (!bl) break block22;
                }
                catch (NumberFormatException numberFormatException) {
                    throw ef9$e53.a(numberFormatException);
                }
                bl = true;
                break block21;
            }
            bl = false;
        }
        ef9$e53.a4z = bl ? 1 : 0;
        try {
            this.a4z = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        try {
            this.zin = Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    public String fzk() {
        return this.bb6;
    }

    public boolean c8x() {
        return this.mm_;
    }

    public int k9u() {
        return this.a4z;
    }

    public ef9.nbw yxm() {
        return this.pmk;
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
        long l = a ^ 0x23B6844973CCL;
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
        String string = "\u00f9\u0084\u00c5f\u0000\u00a7\u00d4\u00b0\u0082\u00029\u009c\u00e2\u0010JK\u0010.\u00cegz\u0097\u00b8\u00b5\"\u008ay\u00b2\u000b\u00e1\u0091\u008d\u00a5";
        int n2 = "\u00f9\u0084\u00c5f\u0000\u00a7\u00d4\u00b0\u0082\u00029\u009c\u00e2\u0010JK\u0010.\u00cegz\u0097\u00b8\u00b5\"\u008ay\u00b2\u000b\u00e1\u0091\u008d\u00a5".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ef9$e53.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x24CC;
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
                throw new RuntimeException("ef9$e53", exception);
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
            ef9$e53.c[n2] = ef9$e53.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ef9$e53.a(n, l);
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
            throw new RuntimeException("ef9$e53" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ef9$e53.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

