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

public class b1t
extends j1s {
    private /* synthetic */ boolean u8j;
    private /* synthetic */ boolean zw_;
    public double d8o;
    private static final long a = c.a(-683546931784259611L, 7264324250949821144L, MethodHandles.lookup().lookupClass()).a(209020954815403L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public b1t() {
        long l = a ^ 0x1FCAE0AD022L;
        super((String)((Object)b1t.a("i", (int)24843, (long)(0x3283D26609BC21E8L ^ l))), (String)((Object)b1t.a("i", (int)29298, (long)(0x626D5C1785EC3290L ^ l))));
    }

    @jev
    public void _xd(q8e q8e2) {
        block39: {
            b1t b1t2;
            block43: {
                int n;
                int n2;
                block42: {
                    block41: {
                        block40: {
                            block38: {
                                block36: {
                                    block37: {
                                        block34: {
                                            block35: {
                                                n2 = t9d.c();
                                                try {
                                                    try {
                                                        n = this.wyl.vg8.lfk;
                                                        if (n2 != 0) break block34;
                                                        if (n == 0) break block35;
                                                    }
                                                    catch (oov oov2) {
                                                        throw b1t.a(oov2);
                                                    }
                                                    this.u8j = false;
                                                    this.zw_ = false;
                                                    this.d8o = this.wyl.vg8.kfp;
                                                    return;
                                                }
                                                catch (oov oov3) {
                                                    throw b1t.a(oov3);
                                                }
                                            }
                                            float f = this.wyl.vg8.o_8 - 3.0f;
                                            n = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n2 != 0) break block36;
                                                        if (n <= 0) break block37;
                                                    }
                                                    catch (oov oov4) {
                                                        throw b1t.a(oov4);
                                                    }
                                                    n = this.u8j ? 1 : 0;
                                                    if (n2 != 0) break block36;
                                                }
                                                catch (oov oov5) {
                                                    throw b1t.a(oov5);
                                                }
                                                if (n != 0) break block37;
                                            }
                                            catch (oov oov6) {
                                                throw b1t.a(oov6);
                                            }
                                            this.u8j = true;
                                        }
                                        catch (oov oov7) {
                                            throw b1t.a(oov7);
                                        }
                                    }
                                    n = this.wyl.vg8.g9g.s0a ? 1 : 0;
                                }
                                try {
                                    try {
                                        if (n2 != 0) break block38;
                                        if (n == 0) break block39;
                                    }
                                    catch (oov oov8) {
                                        throw b1t.a(oov8);
                                    }
                                    n = this.u8j ? 1 : 0;
                                }
                                catch (oov oov9) {
                                    throw b1t.a(oov9);
                                }
                            }
                            try {
                                try {
                                    if (n2 != 0) break block40;
                                    if (n == 0) break block39;
                                }
                                catch (oov oov10) {
                                    throw b1t.a(oov10);
                                }
                                float f = this.wyl.vg8.o_8 - 1.12f;
                                n = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                            }
                            catch (oov oov11) {
                                throw b1t.a(oov11);
                            }
                        }
                        try {
                            try {
                                if (n2 != 0) break block41;
                                if (n <= 0) break block39;
                            }
                            catch (oov oov12) {
                                throw b1t.a(oov12);
                            }
                            double d = this.wyl.vg8.kfp - (this.d8o - 1.0);
                            n = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                        }
                        catch (oov oov13) {
                            throw b1t.a(oov13);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n2 != 0) break block42;
                                if (n >= 0) break block39;
                            }
                            catch (oov oov14) {
                                throw b1t.a(oov14);
                            }
                            b1t2 = this;
                            if (n2 != 0) break block43;
                        }
                        catch (oov oov15) {
                            throw b1t.a(oov15);
                        }
                        n = b1t2.zw_ ? 1 : 0;
                    }
                    catch (oov oov16) {
                        throw b1t.a(oov16);
                    }
                }
                try {
                    block44: {
                        try {
                            if (n != 0) break block44;
                            this.zw_ = true;
                            this.wyl.vg8.mop = 0.0;
                            this.wyl.vg8.icv = 0.0;
                            this.wyl.vg8.bw4 = 0.0;
                            if (n2 == 0) break block39;
                        }
                        catch (oov oov17) {
                            throw b1t.a(oov17);
                        }
                    }
                    this.wyl.vg8.mop = 0.42f;
                    b1t2 = this;
                }
                catch (oov oov18) {
                    throw b1t.a(oov18);
                }
            }
            float f = b1t2.wyl.vg8.x5k * ((float)Math.PI / 180);
            this.wyl.vg8.icv -= (double)(fe6.rtn(f) * 0.07f);
            this.wyl.vg8.bw4 += (double)(fe6.ssk(f) * 0.07f);
            this.wyl.vg8.o_8 = 0.0f;
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
        long l = a ^ 0x66E8EF5CC6C8L;
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
        String string = "\u00a0Us\u0086\u00ac\u0092\u00c7=\u0094c\u000e\u0089\u00ae\u00a3Rf\u0010\u00dbH\u0091C\u00e2\"\u00be\u00e3\u00ecD\u0002b\u00ca\u00cf\\l";
        int n2 = "\u00a0Us\u0086\u00ac\u0092\u00c7=\u0094c\u000e\u0089\u00ae\u00a3Rf\u0010\u00dbH\u0091C\u00e2\"\u00be\u00e3\u00ecD\u0002b\u00ca\u00cf\\l".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = b1t.b(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1E35;
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
                throw new RuntimeException("b1t", exception);
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
            b1t.e[n2] = b1t.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b1t.a(n, l);
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
            throw new RuntimeException("b1t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b1t.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

