/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fx6
extends Thread {
    public c05 but = c05.vz1();
    public ArrayList wts = new ArrayList();
    public static mof t06;
    public List qwp;
    public crk tjr;
    public crk jb2;
    public int r9z = -1;
    public boolean zpp = false;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public fx6(crk crk2, crk crk3) {
        this.tjr = crk2;
        this.jb2 = crk3;
    }

    public fx6(int n, crk crk2) {
        this.r9z = n;
        this.jb2 = crk2;
    }

    @Override
    public void run() {
        block36: {
            fx6 fx62;
            long l = a ^ 0x6DBD3F234213L;
            int n = t9d.c();
            block28: while (true) {
                int n2 = kgt.caa.klu();
                block29: while (n2 != 0) {
                    int n3;
                    long l2;
                    block39: {
                        fx6 fx63;
                        block37: {
                            block38: {
                                try {
                                    try {
                                        fx62 = this;
                                        if (n != 0 || n != 0) break block36;
                                    }
                                    catch (oov oov2) {
                                        throw fx6.a(oov2);
                                    }
                                    if (fx62.but.tij == null) break block28;
                                }
                                catch (oov oov3) {
                                    throw fx6.a(oov3);
                                }
                                this.zpp = true;
                                l2 = System.currentTimeMillis();
                                try {
                                    try {
                                        fx63 = this;
                                        if (n != 0) break block37;
                                        if (fx63.r9z == -1) break block38;
                                    }
                                    catch (oov oov4) {
                                        throw fx6.a(oov4);
                                    }
                                    n3 = this.r9z;
                                    break block39;
                                }
                                catch (oov oov5) {
                                    throw fx6.a(oov5);
                                }
                            }
                            fx63 = this;
                        }
                        n3 = fx63.tjr.d7c().intValue();
                    }
                    int n4 = n3;
                    ArrayList<mew> arrayList = new ArrayList<mew>();
                    int n5 = -n4;
                    block30: while (true) {
                        int n6 = n5;
                        block31: while (n6 <= n4) {
                            n2 = 1;
                            if (n != 0) continue block29;
                            int n7 = n2;
                            block32: while (true) {
                                int n8 = n7;
                                block33: while (n8 <= 128) {
                                    n6 = -n4;
                                    if (n != 0) continue block31;
                                    int n9 = n6;
                                    while (n9 <= n4) {
                                        block40: {
                                            block41: {
                                                boolean bl;
                                                mew mew2;
                                                block43: {
                                                    block42: {
                                                        mew2 = new mew(this.but.vg8.o2v + (double)n5, (double)n7, this.but.vg8.vbd + (double)n9);
                                                        try {
                                                            if (n != 0) break block40;
                                                            n8 = t06.af9(mew2) ? 1 : 0;
                                                            if (n != 0) continue block33;
                                                        }
                                                        catch (oov oov6) {
                                                            throw fx6.a(oov6);
                                                        }
                                                        try {
                                                            boolean bl2;
                                                            try {
                                                                try {
                                                                    if (n8 == 0) break block41;
                                                                    bl2 = t06.yub(mew2, this.jb2.d7c().intValue());
                                                                    if (n != 0) break block42;
                                                                }
                                                                catch (oov oov7) {
                                                                    throw fx6.a(oov7);
                                                                }
                                                                if (!bl2) break block41;
                                                            }
                                                            catch (oov oov8) {
                                                                throw fx6.a(oov8);
                                                            }
                                                            bl2 = arrayList.add(mew2);
                                                        }
                                                        catch (oov oov9) {
                                                            throw fx6.a(oov9);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (n != 0) break block40;
                                                                        if (this.but.tij.getBlockState(mew2).r_y() != ox_._dt) break block41;
                                                                    }
                                                                    catch (oov oov10) {
                                                                        throw fx6.a(oov10);
                                                                    }
                                                                    bl = this.wts.contains(mew2);
                                                                    if (n != 0) break block43;
                                                                }
                                                                catch (oov oov11) {
                                                                    throw fx6.a(oov11);
                                                                }
                                                                if (bl) break block41;
                                                            }
                                                            catch (oov oov12) {
                                                                throw fx6.a(oov12);
                                                            }
                                                            this.wts.add(mew2);
                                                            if (n != 0) break block40;
                                                        }
                                                        catch (oov oov13) {
                                                            throw fx6.a(oov13);
                                                        }
                                                        bl = kgt.caa.zoz.d7c();
                                                    }
                                                    catch (oov oov14) {
                                                        throw fx6.a(oov14);
                                                    }
                                                }
                                                try {
                                                    if (bl) {
                                                        q0r.tq3(String.format((String)((Object)fx6.a("l", (int)29234, (long)(0x70B804AA78A45717L ^ l))), mew2.getX(), mew2.getY(), mew2.getZ()));
                                                    }
                                                }
                                                catch (oov oov15) {
                                                    throw fx6.a(oov15);
                                                }
                                            }
                                            ++n9;
                                        }
                                        if (n == 0) continue;
                                    }
                                    ++n7;
                                    if (n == 0) continue block32;
                                }
                                break;
                            }
                            ++n5;
                            if (n == 0) continue block30;
                        }
                        break;
                    }
                    this.qwp = arrayList;
                    ncl.zpu((String)((Object)fx6.a("l", (int)25906, (long)(0x596EB54431354016L ^ l))) + (System.currentTimeMillis() - l2));
                    if (n == 0) continue block28;
                }
                break;
            }
            fx62 = this;
        }
        fx62.zpp = false;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(-8151400551458574527L, 8016922614208975471L, MethodHandles.lookup().lookupClass()).a(247039015869533L);
        d = new HashMap(13);
        long l = a ^ 0x76C48B622C3L;
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
        String string = "\u0089\u00c4\u0016\u00be\u0005\u0004@\u008egs\u00fc\u0090\u00c4\u0095\u00c2$\u00c1\nAA~mi\u00bf\u0010/\u00a3\u00ae\u0006\u00a0\u00a5.8\u00c6\u00ee\u00f8\u00ce\u00a0\bi\u00a9\u007fs\u00dal\bs\u000e\u00c8hkB\u00f2\u00a0\u00ab&]{\u0082\u0085\u00a2\u00d1\u000e=\u00f1\u000bx\u00d3ggQ\u008e\u00f9\u0012\u0004\u00a5\u00b3\u00b1\u000bJ\u00dc\u000ej\u00fa\u00d8\u00ebQ\\\u0013";
        int n2 = "\u0089\u00c4\u0016\u00be\u0005\u0004@\u008egs\u00fc\u0090\u00c4\u0095\u00c2$\u00c1\nAA~mi\u00bf\u0010/\u00a3\u00ae\u0006\u00a0\u00a5.8\u00c6\u00ee\u00f8\u00ce\u00a0\bi\u00a9\u007fs\u00dal\bs\u000e\u00c8hkB\u00f2\u00a0\u00ab&]{\u0082\u0085\u00a2\u00d1\u000e=\u00f1\u000bx\u00d3ggQ\u008e\u00f9\u0012\u0004\u00a5\u00b3\u00b1\u000bJ\u00dc\u000ej\u00fa\u00d8\u00ebQ\\\u0013".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = fx6.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                t06 = kgt.caa;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x78B3;
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
                throw new RuntimeException("fx6", exception);
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
            fx6.c[n2] = fx6.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fx6.a(n, l);
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
            throw new RuntimeException("fx6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fx6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

