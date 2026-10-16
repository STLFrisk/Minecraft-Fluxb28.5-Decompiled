/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
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

public abstract class fy3
implements Serializable,
Cloneable {
    public static final long serialVersionUID = -483782685323607044L;
    public byte vxv;
    public byte dia;
    public byte urv;
    private static final long a = c.a(1452817005021090955L, 5749360039296103981L, MethodHandles.lookup().lookupClass()).a(263155398322689L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public fy3(byte by, byte by2, byte by3) {
        this.vxv = by;
        this.dia = by2;
        this.urv = by3;
    }

    public fy3(byte[] byArray) {
        this.vxv = byArray[0];
        this.dia = byArray[1];
        this.urv = byArray[2];
    }

    public fy3(fy3 fy32) {
        this.vxv = fy32.vxv;
        this.dia = fy32.dia;
        this.urv = fy32.urv;
    }

    public fy3() {
        this.vxv = 0;
        this.dia = 0;
        this.urv = 0;
    }

    public String toString() {
        long l = a ^ 0x6EF23E3C4E0CL;
        return "(" + (this.vxv & 0xFF) + (String)((Object)fy3.a("y", (int)16617, (long)(0x791ED732DDDC3AB4L ^ l))) + (this.dia & 0xFF) + (String)((Object)fy3.a("y", (int)16803, (long)(0x149C3DADC083BFFL ^ l))) + (this.urv & 0xFF) + ")";
    }

    public final void js9(byte[] byArray) {
        byArray[0] = this.vxv;
        byArray[1] = this.dia;
        byArray[2] = this.urv;
    }

    public final void we6(fy3 fy32) {
        fy32.vxv = this.vxv;
        fy32.dia = this.dia;
        fy32.urv = this.urv;
    }

    public final void j0_(fy3 fy32) {
        this.vxv = fy32.vxv;
        this.dia = fy32.dia;
        this.urv = fy32.urv;
    }

    public final void m44(byte[] byArray) {
        this.vxv = byArray[0];
        this.dia = byArray[1];
        this.urv = byArray[2];
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean i8g(fy3 fy32) {
        int n = t9d.b();
        try {
            byte by;
            byte by2;
            block13: {
                block15: {
                    block12: {
                        by2 = this.vxv;
                        by = fy32.vxv;
                        if (n == 0) break block12;
                        try {
                            block14: {
                                break block14;
                                catch (NullPointerException nullPointerException) {
                                    throw fy3.a(nullPointerException);
                                }
                            }
                            if (by2 != by) return 0 != 0;
                            by2 = this.dia;
                            by = fy32.dia;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw fy3.a(nullPointerException);
                        }
                    }
                    if (n == 0) break block13;
                    break block15;
                    catch (NullPointerException nullPointerException) {
                        throw fy3.a(nullPointerException);
                    }
                }
                if (by2 != by) return 0 != 0;
                try {
                    block16: {
                        break block16;
                        catch (NullPointerException nullPointerException) {
                            throw fy3.a(nullPointerException);
                        }
                    }
                    by2 = this.urv;
                    if (n == 0) return by2 != 0;
                    by = fy32.urv;
                }
                catch (NullPointerException nullPointerException) {
                    throw fy3.a(nullPointerException);
                }
            }
            if (by2 != by) return 0 != 0;
            return 1 != 0;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n = t9d.c();
        try {
            byte by;
            byte by2;
            block14: {
                fy3 fy32;
                block16: {
                    block13: {
                        fy32 = (fy3)object;
                        by2 = this.vxv;
                        by = fy32.vxv;
                        if (n != 0) break block13;
                        try {
                            block15: {
                                break block15;
                                catch (NullPointerException nullPointerException) {
                                    throw fy3.a(nullPointerException);
                                }
                            }
                            if (by2 != by) return 0 != 0;
                            by2 = this.dia;
                            by = fy32.dia;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw fy3.a(nullPointerException);
                        }
                    }
                    if (n != 0) break block14;
                    break block16;
                    catch (NullPointerException nullPointerException) {
                        throw fy3.a(nullPointerException);
                    }
                }
                if (by2 != by) return 0 != 0;
                try {
                    block17: {
                        break block17;
                        catch (NullPointerException nullPointerException) {
                            throw fy3.a(nullPointerException);
                        }
                    }
                    by2 = this.urv;
                    if (n != 0) return by2 != 0;
                    by = fy32.urv;
                }
                catch (NullPointerException nullPointerException) {
                    throw fy3.a(nullPointerException);
                }
            }
            if (by2 != by) return 0 != 0;
            return 1 != 0;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public int hashCode() {
        return (this.vxv & 0xFF) << 0 | (this.dia & 0xFF) << 8 | (this.urv & 0xFF) << 16;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public final byte k9x() {
        return this.vxv;
    }

    public final void ehy(byte by) {
        this.vxv = by;
    }

    public final byte zrm() {
        return this.dia;
    }

    public final void skv(byte by) {
        this.dia = by;
    }

    public final byte h0t() {
        return this.urv;
    }

    public final void or8(byte by) {
        this.urv = by;
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
        long l = a ^ 0x551DD1C89A5EL;
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
        String string = "Ad\u00a2\u0085\u00d3J\u00aag\u00db\u00c5\u00ab\u00a0!J\u00cd6\u0010\u00aafV\u00ab\u00cd\u008f\u00b3+s\u00c3\u00c9\u00c8F\u00b6#I";
        int n2 = "Ad\u00a2\u0085\u00d3J\u00aag\u00db\u00c5\u00ab\u00a0!J\u00cd6\u0010\u00aafV\u00ab\u00cd\u008f\u00b3+s\u00c3\u00c9\u00c8F\u00b6#I".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = fy3.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1AE7;
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
                throw new RuntimeException("fy3", exception);
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
            fy3.c[n2] = fy3.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fy3.a(n, l);
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
            throw new RuntimeException("fy3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fy3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

