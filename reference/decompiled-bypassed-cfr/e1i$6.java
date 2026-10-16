/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
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
public class e1i$6
implements Callable {
    public final e1i p98;
    private static final long a = c.a(5028660129588207041L, -1083796287542456703L, MethodHandles.lookup().lookupClass()).a(229750813256774L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public e1i$6(e1i e1i2) {
        this.p98 = e1i2;
    }

    public String call() {
        String string;
        block10: {
            long l = a ^ 0x19A8E5A3D8E6L;
            RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
            List<String> list = runtimeMXBean.getInputArguments();
            int n = 0;
            int n2 = t9d.b();
            StringBuilder stringBuilder = new StringBuilder();
            for (String string2 : list) {
                block12: {
                    int n3;
                    block11: {
                        try {
                            try {
                                try {
                                    string = string2;
                                    if (n2 == 0) break block10;
                                    n3 = string.startsWith((String)((Object)e1i$6.a("v", (int)4992, (long)(0x7F44919DC5590F6L ^ l))));
                                    if (n2 == 0) break block11;
                                }
                                catch (oov oov2) {
                                    throw e1i$6.a(oov2);
                                }
                                if (n3 == 0) break block12;
                            }
                            catch (oov oov3) {
                                throw e1i$6.a(oov3);
                            }
                            n3 = n++;
                        }
                        catch (oov oov4) {
                            throw e1i$6.a(oov4);
                        }
                    }
                    try {
                        if (n3 > 0) {
                            stringBuilder.append(" ");
                        }
                    }
                    catch (oov oov5) {
                        throw e1i$6.a(oov5);
                    }
                    stringBuilder.append(string2);
                }
                if (n2 != 0) continue;
                break;
            }
            string = String.format((String)((Object)e1i$6.a("v", (int)30357, (long)(0x4B6C7730497BF5E2L ^ l))), n, stringBuilder.toString());
        }
        return string;
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
        long l = a ^ 0xD38084CF206L;
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
        String string = "\u0098\u00b2K\\\"MxY\u00d8\u00fd\u00b7\u00ac\u008c\u00dc\u00ad\\\u008c\u00ea\u00f6?\u00a2D$\u00f5v\u00f5\u009a\u00e1gz\u0012i\u0010!\u009f]f\u00e1\u00a7\u0019\u00e2\u00cf4\u00b3\u0087v-(R";
        int n2 = "\u0098\u00b2K\\\"MxY\u00d8\u00fd\u00b7\u00ac\u008c\u00dc\u00ad\\\u008c\u00ea\u00f6?\u00a2D$\u00f5v\u00f5\u009a\u00e1gz\u0012i\u0010!\u009f]f\u00e1\u00a7\u0019\u00e2\u00cf4\u00b3\u0087v-(R".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = e1i$6.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2BA2;
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
                throw new RuntimeException("e1i$6", exception);
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
            e1i$6.c[n2] = e1i$6.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = e1i$6.a(n, l);
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
            throw new RuntimeException("e1i$6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e1i$6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

