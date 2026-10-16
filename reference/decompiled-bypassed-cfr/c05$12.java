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
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c05$12
implements Callable {
    public final c05 j0s;
    private static final long a = c.a(684554326071965351L, 596766837254955611L, MethodHandles.lookup().lookupClass()).a(108793107802630L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public c05$12(c05 c052) {
        this.j0s = c052;
    }

    public String call() {
        StringBuilder stringBuilder;
        block12: {
            long l = a ^ 0x5BECB36B7D88L;
            StringBuilder stringBuilder2 = new StringBuilder();
            Iterator iterator = this.j0s.oxn.yvc.iterator();
            int n = t9d.c();
            while (iterator.hasNext()) {
                block15: {
                    StringBuilder stringBuilder3;
                    int n2;
                    block13: {
                        String string;
                        block14: {
                            string = (String)iterator.next();
                            try {
                                try {
                                    try {
                                        stringBuilder = stringBuilder2;
                                        if (n != 0) break block12;
                                        n2 = stringBuilder.length();
                                        if (n != 0) break block13;
                                    }
                                    catch (oov oov2) {
                                        throw c05$12.a(oov2);
                                    }
                                    if (n2 <= 0) break block14;
                                }
                                catch (oov oov3) {
                                    throw c05$12.a(oov3);
                                }
                                stringBuilder2.append((String)((Object)c05$12.a("j", (int)15468, (long)(0x219D7C263D27F0BBL ^ l))));
                            }
                            catch (oov oov4) {
                                throw c05$12.a(oov4);
                            }
                        }
                        try {
                            stringBuilder3 = stringBuilder2.append(string);
                            if (n != 0) break block15;
                            n2 = this.j0s.oxn.kc4.contains(string) ? 1 : 0;
                        }
                        catch (oov oov5) {
                            throw c05$12.a(oov5);
                        }
                    }
                    try {
                        if (n2 != 0) {
                            stringBuilder3 = stringBuilder2.append((String)((Object)c05$12.a("j", (int)31176, (long)(0x6D1030541473B51EL ^ l))));
                        }
                    }
                    catch (oov oov6) {
                        throw c05$12.a(oov6);
                    }
                }
                if (n == 0) continue;
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    public Object call() {
        return this.call();
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
        long l = a ^ 0x194FF339A0D7L;
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
        String string = "\u008b~\r\u00b5\u00b6\u00a9\u00ee\u00be\u00ea\u00d49\u008b\u00ae\u00ee\u00c3c \u00c2\u00feU\nt\u000f\u00a5pJ\u00d0\u00969\u00cd-B\u00c0II8\u00e3\u00feW\u00e1\u0089\u00f7\u00ab\u00bf\u00ffy\u0004\u00d8s";
        int n2 = "\u008b~\r\u00b5\u00b6\u00a9\u00ee\u00be\u00ea\u00d49\u008b\u00ae\u00ee\u00c3c \u00c2\u00feU\nt\u000f\u00a5pJ\u00d0\u00969\u00cd-B\u00c0II8\u00e3\u00feW\u00e1\u0089\u00f7\u00ab\u00bf\u00ffy\u0004\u00d8s".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = c05$12.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4E7;
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
                throw new RuntimeException("c05$12", exception);
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
            c05$12.c[n2] = c05$12.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = c05$12.a(n, l);
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
            throw new RuntimeException("c05$12" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c05$12.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

