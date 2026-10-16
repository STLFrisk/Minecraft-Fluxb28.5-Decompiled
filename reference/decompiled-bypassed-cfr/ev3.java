/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 */
import com.google.common.base.Objects;
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

public abstract class ev3
implements xny {
    private final Class d7o;
    private final String tt0;
    private static final long b = c.a(7693501119301733324L, -4246766798032679327L, MethodHandles.lookup().lookupClass()).a(17488008188357L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public ev3(String string, Class clazz) {
        this.d7o = clazz;
        this.tt0 = string;
    }

    @Override
    public String w6i() {
        return this.tt0;
    }

    @Override
    public Class pn7() {
        return this.d7o;
    }

    public String toString() {
        long l = b ^ 0x54F2F666E914L;
        return Objects.toStringHelper((Object)this).add((String)((Object)ev3.a("f", (int)3254, (long)(0x695A4ECEE978EB2FL ^ l))), (Object)this.tt0).add((String)((Object)ev3.a("f", (int)27403, (long)(0x5F8233AB62328C91L ^ l))), (Object)this.d7o).add((String)((Object)ev3.a("f", (int)9626, (long)(0x4C3718C7DD484202L ^ l))), (Object)this.isr()).toString();
    }

    public boolean equals(Object object) {
        block18: {
            boolean bl;
            block22: {
                block21: {
                    int n;
                    block20: {
                        Object object2;
                        block19: {
                            Object object3;
                            block16: {
                                block17: {
                                    n = t9d.b();
                                    try {
                                        try {
                                            object3 = this;
                                            if (n == 0) break block16;
                                            if (object3 != object) break block17;
                                        }
                                        catch (oov oov2) {
                                            throw ev3.a(oov2);
                                        }
                                        return true;
                                    }
                                    catch (oov oov3) {
                                        throw ev3.a(oov3);
                                    }
                                }
                                object3 = object;
                            }
                            try {
                                try {
                                    try {
                                        if (object3 == null) break block18;
                                        object2 = this.getClass();
                                        if (n == 0) break block19;
                                    }
                                    catch (oov oov4) {
                                        throw ev3.a(oov4);
                                    }
                                    if (object2 != object.getClass()) break block18;
                                }
                                catch (oov oov5) {
                                    throw ev3.a(oov5);
                                }
                                object2 = object;
                            }
                            catch (oov oov6) {
                                throw ev3.a(oov6);
                            }
                        }
                        ev3 ev32 = (ev3)object2;
                        try {
                            try {
                                bl = this.d7o.equals(ev32.d7o);
                                if (n == 0) break block20;
                                if (!bl) break block21;
                            }
                            catch (oov oov7) {
                                throw ev3.a(oov7);
                            }
                            bl = this.tt0.equals(ev32.tt0);
                        }
                        catch (oov oov8) {
                            throw ev3.a(oov8);
                        }
                    }
                    try {
                        if (n == 0) break block22;
                        if (!bl) break block21;
                    }
                    catch (oov oov9) {
                        throw ev3.a(oov9);
                    }
                    bl = true;
                    break block22;
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.d7o.hashCode() + this.tt0.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        e = new HashMap(13);
        long l = b ^ 0x296CD35B0A86L;
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
        String string = "G\u007f\u0096\u00e2\u00dc\u00ee\u008e\u000b\u0099\u00e8\u00a2+\u0091\u0013\u00f3i\u0010\u009d\u00a8V9]\u00ab)d\u00b6\u00c8Z\u00d0y\u00db\u00efs\u0010\u00b7\u00b4\u00cb\u00c1\u00b2\u00e4\u00fe\u00ef\u0083G\u00c4!\u00c5\u00f3\u00cb\u00e1";
        int n2 = "G\u007f\u0096\u00e2\u00dc\u00ee\u008e\u000b\u0099\u00e8\u00a2+\u0091\u0013\u00f3i\u0010\u009d\u00a8V9]\u00ab)d\u00b6\u00c8Z\u00d0y\u00db\u00efs\u0010\u00b7\u00b4\u00cb\u00c1\u00b2\u00e4\u00fe\u00ef\u0083G\u00c4!\u00c5\u00f3\u00cb\u00e1".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ev3.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1ACD;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("ev3", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            ev3.d[n2] = ev3.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ev3.a(n, l);
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
            throw new RuntimeException("ev3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ev3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

