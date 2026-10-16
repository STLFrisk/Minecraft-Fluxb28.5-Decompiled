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

public class alb
extends ed3 {
    private /* synthetic */ x1l qr2;
    private static final long a = c.a(7100035553159145508L, -2031063539210517399L, MethodHandles.lookup().lookupClass()).a(188808976663987L);
    private static final String[] j;
    private static final String[] k;
    private static final Map l;

    public alb(gbe gbe2, x1l x1l2) {
        super(gbe2);
        this.qr2 = x1l2;
    }

    @Override
    public String o9u() {
        long l = a ^ 0x5DBE428F23BDL;
        return alb.c("l", (int)21807, (long)(0x6FC9346A82536C39L ^ l));
    }

    @Override
    public String _ey() {
        return this.qr2.rii() + ":" + this.qr2.g9o();
    }

    @Override
    public void dgw(gt4 gt42) {
        block19: {
            alb alb2;
            block18: {
                String string;
                block17: {
                    int n;
                    block16: {
                        String[] stringArray;
                        block14: {
                            n = t9d.c();
                            try {
                                block15: {
                                    try {
                                        try {
                                            stringArray = this.ezi.eec().split(":");
                                            if (n != 0) break block14;
                                            if (stringArray.length > 1) break block15;
                                        }
                                        catch (oov oov2) {
                                            throw alb.a(oov2);
                                        }
                                        qd_.oyx.set(qd_.oyx.indexOf(this.qr2), new x1l(this.ezi.eec(), null, null, this.qr2.wvc()));
                                        this.cqv = null;
                                        if (n == 0) break block16;
                                    }
                                    catch (oov oov3) {
                                        throw alb.a(oov3);
                                    }
                                }
                                stringArray = this.ezi.eec().split(":");
                            }
                            catch (oov oov4) {
                                throw alb.a(oov4);
                            }
                        }
                        String string2 = stringArray[0];
                        String string3 = this.ezi.eec().split(":")[1];
                        try {
                            try {
                                string = this.cqv = zfs.eoj(string2, string3);
                                if (n != 0) break block17;
                                if (string != null) break block16;
                            }
                            catch (oov oov5) {
                                throw alb.a(oov5);
                            }
                            qd_.oyx.set(qd_.oyx.indexOf(this.qr2), new x1l(string2, string3, this.f41.ee0().z2u(), this.qr2.wvc()));
                        }
                        catch (oov oov6) {
                            throw alb.a(oov6);
                        }
                    }
                    try {
                        alb2 = this;
                        if (n != 0) break block18;
                        string = alb2.cqv;
                    }
                    catch (oov oov7) {
                        throw alb.a(oov7);
                    }
                }
                try {
                    if (string != null) break block19;
                    qd_.mpj();
                    zwr.qkk.up0().p5g();
                    alb2 = this;
                }
                catch (oov oov8) {
                    throw alb.a(oov8);
                }
            }
            alb2.f41.z2i(this.bnx);
        }
    }

    @Override
    public String a79() {
        long l = a ^ 0x2C1AE1B0DA73L;
        return alb.c("l", (int)14364, (long)(0x3E7881E906BCF8C5L ^ l));
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        l = new HashMap(13);
        long l = a ^ 0x2E93FD1C44CCL;
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
        String string = "\u00e3\u0088\u0001\u00d7=\u00dcMHY\u0000q\u0003Q\u00ed\u0081\u00058\u00a6\u00f9\u00aex/\u00a8\u00dd\u0010\u00a4\u00af\u00938\u00ba\u0010\u00d4kC\u00a0\u00ab?\u001b\u00e2\u00ee#";
        int n2 = "\u00e3\u0088\u0001\u00d7=\u00dcMHY\u0000q\u0003Q\u00ed\u0081\u00058\u00a6\u00f9\u00aex/\u00a8\u00dd\u0010\u00a4\u00af\u00938\u00ba\u0010\u00d4kC\u00a0\u00ab?\u001b\u00e2\u00ee#".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = alb.d(byArray3).intern();
            if ((n4 += n3) >= n2) {
                j = stringArray;
                k = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String d(byte[] byArray) {
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

    private static String c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x36EA;
        if (k[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])alb.l.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    alb.l.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("alb", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = j[n2].getBytes("ISO-8859-1");
            alb.k[n2] = alb.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = alb.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("alb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(alb.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

