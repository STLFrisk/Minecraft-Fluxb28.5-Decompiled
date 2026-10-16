/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.UnknownHostException;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bbv$1
implements Runnable {
    public final bbv fcd;
    private static final long a = c.a(-4945223046059176826L, 1705126341916626491L, MethodHandles.lookup().lookupClass()).a(83799938477990L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public bbv$1(bbv bbv2) {
        this.fcd = bbv2;
    }

    @Override
    public void run() {
        long l = a ^ 0x1B8390C7CBBL;
        try {
            bbv.la_(this.fcd).oz5().o7l(bbv.tcw(this.fcd));
        }
        catch (UnknownHostException unknownHostException) {
            bbv.tcw((bbv)this.fcd).zab = -1L;
            bbv.tcw((bbv)this.fcd).o_g = (Object)((Object)syo.id3) + (String)((Object)bbv$1.a("h", (int)22914, (long)(0x3F3C9365DED95AF0L ^ l)));
        }
        catch (Exception exception) {
            bbv.tcw((bbv)this.fcd).zab = -1L;
            bbv.tcw((bbv)this.fcd).o_g = (Object)((Object)syo.id3) + (String)((Object)bbv$1.a("h", (int)10473, (long)(0x37820ECDF317AB9AL ^ l)));
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
        d = new HashMap(13);
        long l = a ^ 0x43D8E8664D84L;
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
        String string = "\u00f0\u00ac\u00b8\u00d7\u0015\u0099\u009f\u0013\u00e8\u0019t\u00e7]\u00a1A\u0007\u0095/\u00caun\u00b0\u009ad\u00d1)F!mwd)P\u0003jH\u00c3\u00b1^\u0016\u001a7\u001e\u00f1\u001b6\u0095z\u00e2\u00e5\u00f9V\u0089\u0085.s(<\u00b5N\u00f1G\u00b3\u00e2\u0004\u00f0:K\u00b8\u008aD\u00e0p\u00f0&-\u001e\u00b0\u000f\u00a2'W\u00ce\u00066\u00a8k\u00c3\u00e8\u001f\u00e3X5eI4c";
        int n2 = "\u00f0\u00ac\u00b8\u00d7\u0015\u0099\u009f\u0013\u00e8\u0019t\u00e7]\u00a1A\u0007\u0095/\u00caun\u00b0\u009ad\u00d1)F!mwd)P\u0003jH\u00c3\u00b1^\u0016\u001a7\u001e\u00f1\u001b6\u0095z\u00e2\u00e5\u00f9V\u0089\u0085.s(<\u00b5N\u00f1G\u00b3\u00e2\u0004\u00f0:K\u00b8\u008aD\u00e0p\u00f0&-\u001e\u00b0\u000f\u00a2'W\u00ce\u00066\u00a8k\u00c3\u00e8\u001f\u00e3X5eI4c".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = bbv$1.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xFAF;
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
                throw new RuntimeException("bbv$1", exception);
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
            bbv$1.c[n2] = bbv$1.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bbv$1.a(n, l);
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
            throw new RuntimeException("bbv$1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bbv$1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

