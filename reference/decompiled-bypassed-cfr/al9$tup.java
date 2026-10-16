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

public class al9$tup
implements sjk {
    private final int of2;
    private final boolean ek3;
    private static final long a = c.a(7695715943831748037L, -5593234662374090702L, MethodHandles.lookup().lookupClass()).a(150366908986604L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public al9$tup(int n, boolean bl) {
        this.of2 = n;
        this.ek3 = bl;
    }

    @Override
    public void z9x(al9 al92) {
        al9.f23(al92, this.of2);
    }

    @Override
    public ekw s34() {
        tao tao2;
        long l = a ^ 0x4370A1C4AC2AL;
        try {
            if (this.of2 < 0) {
                tao2 = new tao((String)((Object)al9$tup.a("z", (int)18188, (long)(0x5A68AC15D2A64A27L ^ l))));
            }
        }
        catch (oov oov2) {
            throw al9$tup.a(oov2);
        }
        tao2 = new tao((String)((Object)al9$tup.a("z", (int)24717, (long)(0x4FE9277881926DA7L ^ l))));
        return tao2;
    }

    @Override
    public void b6x(float f, int n) {
        block8: {
            int n2;
            block6: {
                int n3 = t9d.b();
                try {
                    block7: {
                        try {
                            try {
                                c05.vz1().l22().anl(akr._rg);
                                n2 = this.of2;
                                if (n3 == 0) break block6;
                                if (n2 >= 0) break block7;
                            }
                            catch (oov oov2) {
                                throw al9$tup.a(oov2);
                            }
                            b0t.vfo(0, 0, 144.0f, 0.0f, 16, 16, 256.0f, 256.0f);
                            if (n3 != 0) break block8;
                        }
                        catch (oov oov3) {
                            throw al9$tup.a(oov3);
                        }
                    }
                    n2 = 0;
                }
                catch (oov oov4) {
                    throw al9$tup.a(oov4);
                }
            }
            b0t.vfo(n2, 0, 160.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        }
    }

    @Override
    public boolean v4p() {
        return this.ek3;
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
        long l = a ^ 0x8E02622AD8AL;
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
        String string = "\u00f4\u00dd(|@\u00f8T\u00cf\u0018o;W\u00aeLtqy\"\u00b9\u00a2\u0010\u00ab\tj\u0018\u00d6\u00f7\u008d\u0096\u00fd\u0010<\u00d1\u00b9\u00ca\u00ef%\u001a\u00a29gS\n]E\u00b3\u0092\u0016\u0007";
        int n2 = "\u00f4\u00dd(|@\u00f8T\u00cf\u0018o;W\u00aeLtqy\"\u00b9\u00a2\u0010\u00ab\tj\u0018\u00d6\u00f7\u008d\u0096\u00fd\u0010<\u00d1\u00b9\u00ca\u00ef%\u001a\u00a29gS\n]E\u00b3\u0092\u0016\u0007".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = al9$tup.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1ACC;
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
                throw new RuntimeException("al9$tup", exception);
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
            al9$tup.c[n2] = al9$tup.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = al9$tup.a(n, l);
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
            throw new RuntimeException("al9$tup" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(al9$tup.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

