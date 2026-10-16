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

public class btc {
    public static final btc pzg;
    private final long gyu;
    private long tn_;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public btc(long l) {
        this.gyu = l;
    }

    public void es9(long l) {
        long l2 = a ^ 0x9FA703B8D55L;
        try {
            this.tn_ += l / 8L;
            if (this.tn_ > this.gyu) {
                throw new RuntimeException((String)((Object)btc.a("v", (int)23799, (long)(0x16488915EF53CB64L ^ l2))) + this.tn_ + (String)((Object)btc.a("v", (int)31542, (long)(0x761D1B0622936CA4L ^ l2))) + this.gyu);
            }
        }
        catch (RuntimeException runtimeException) {
            throw btc.a(runtimeException);
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
        a = c.a(-768896859982430950L, -8737763927334134055L, MethodHandles.lookup().lookupClass()).a(123941843792248L);
        d = new HashMap(13);
        long l = a ^ 0xB4D4A14E5B1L;
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
        String string = "7\u008b\u00fe,\u009d\u0016.\u00aa\u00c5\u00f4\u00d9\u00dd+\u00a6SYO\u00d8\u00ca\u00f3\u008f\u0006\u00a2\u00b8\u00fc\u00f3l\u00e8\u00a4'\u00cb#Z\u00029\u0010w\u008a\u0015\u0092\u00d9Z\u00d9\u00eb\n\u00aa\u0083\u0006\u00de\u00bd\u009f;X;@u\u0010\u001e[W\u0002E\u00c6\u00a08\u009b.\u009c},\u009b\u00bb\u00e8'-\u00a6\u00af\u0082\u008d9\u00fc\u00fe\u00f6=\u0015\u00a4\u00efa\u00ee\u00f4\u009f\u009e5\u00e7\u00da*\u00fd\u00f5\u0019\u00ef[\u0098\u00c6\u009a8\u00b1\u00db\u0096\u00c2\u00d2*\u00e2[y\u00ce\u00f2\u0089\u00bc(\u00e0\u00ba\u00e2\u00e3+`{\u00ed\b\"i\u00c0u\u001f\u00ffs\u0002\u00de\u008ce\u00bc,\u00d2\u00c7\u008f(\u00bd\u008806\u0015)\u001a\u00df\u00fb\u00b9\u0092r\u00e3\u00f1]\u00fc";
        int n2 = "7\u008b\u00fe,\u009d\u0016.\u00aa\u00c5\u00f4\u00d9\u00dd+\u00a6SYO\u00d8\u00ca\u00f3\u008f\u0006\u00a2\u00b8\u00fc\u00f3l\u00e8\u00a4'\u00cb#Z\u00029\u0010w\u008a\u0015\u0092\u00d9Z\u00d9\u00eb\n\u00aa\u0083\u0006\u00de\u00bd\u009f;X;@u\u0010\u001e[W\u0002E\u00c6\u00a08\u009b.\u009c},\u009b\u00bb\u00e8'-\u00a6\u00af\u0082\u008d9\u00fc\u00fe\u00f6=\u0015\u00a4\u00efa\u00ee\u00f4\u009f\u009e5\u00e7\u00da*\u00fd\u00f5\u0019\u00ef[\u0098\u00c6\u009a8\u00b1\u00db\u0096\u00c2\u00d2*\u00e2[y\u00ce\u00f2\u0089\u00bc(\u00e0\u00ba\u00e2\u00e3+`{\u00ed\b\"i\u00c0u\u001f\u00ffs\u0002\u00de\u008ce\u00bc,\u00d2\u00c7\u008f(\u00bd\u008806\u0015)\u001a\u00df\u00fb\u00b9\u0092r\u00e3\u00f1]\u00fc".length();
        int n3 = 104;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = btc.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                pzg = new btc$1(0L);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x36AA;
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
                throw new RuntimeException("btc", exception);
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
            btc.c[n2] = btc.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = btc.a(n, l);
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
            throw new RuntimeException("btc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(btc.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

