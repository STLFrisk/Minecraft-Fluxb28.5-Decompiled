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

public class epk
extends IllegalArgumentException {
    private static final long a = c.a(-357816313734086678L, -7711962976934876648L, MethodHandles.lookup().lookupClass()).a(171582624323660L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public epk(hsu hsu2, String string) {
        long l = a ^ 0x7437D13E3676L;
        super(String.format((String)((Object)epk.a("f", (int)20379, (long)(0x5FC9C0E94A6B3E3AL ^ l))), hsu2, string));
    }

    public epk(hsu hsu2, int n) {
        long l = a ^ 0xD6592F91E15L;
        super(String.format((String)((Object)epk.a("f", (int)19162, (long)(0x58583125E987931BL ^ l))), n, hsu2));
    }

    public epk(hsu hsu2, Throwable throwable) {
        long l = a ^ 0x4D614C53071L;
        super(String.format((String)((Object)epk.a("f", (int)4837, (long)(0x3464D193E2826541L ^ l))), hsu2), throwable);
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
        long l = a ^ 0x5AFFB1A15E01L;
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
        String string = "E\u00ca\u00f6\u00e5\u00ea\u009b\u000e\u0086D94d]-n\u00e2\u0019*\u00b9\u00c0+\u0095\u00a2U\u00a2C\u0012-\u00d7\u00fc\u0099+\u00f4;\u00fe\\9\u00bbw\u00d7@B\u00cf\u00de\u0094\t\u00e7\")S\u00e2C\u007f\u0000_\u00fd\u0081\u00af\u00f3A\u00b0\u0012\u001aN\u0097P\u00beb\f\u0097\u0080#\bz\u0081\u00c3\u00ec0\u000e\u001b\u00b3\u00c5F\u008b\u0000\u0087\u0013\u009a\u008b\u00aa\u001c\u00efR\u000f\u008a!\u001b\u00b6X6\u00a8Q\u00c8\u00b4I(_\u001c\u00fb\u00c2\u00acq\u009c\u00ac\u00a8\u008a\u00d2]\u00e9BD\u00aa\u00a9B3\u00db\u0090\u00ae\u00c0\u00c4h4\u00a6\u00d9\u00ab#\u00f4\u0017\u00aa\u00d2\u00e1\t6\u00d7O\u00d0";
        int n2 = "E\u00ca\u00f6\u00e5\u00ea\u009b\u000e\u0086D94d]-n\u00e2\u0019*\u00b9\u00c0+\u0095\u00a2U\u00a2C\u0012-\u00d7\u00fc\u0099+\u00f4;\u00fe\\9\u00bbw\u00d7@B\u00cf\u00de\u0094\t\u00e7\")S\u00e2C\u007f\u0000_\u00fd\u0081\u00af\u00f3A\u00b0\u0012\u001aN\u0097P\u00beb\f\u0097\u0080#\bz\u0081\u00c3\u00ec0\u000e\u001b\u00b3\u00c5F\u008b\u0000\u0087\u0013\u009a\u008b\u00aa\u001c\u00efR\u000f\u008a!\u001b\u00b6X6\u00a8Q\u00c8\u00b4I(_\u001c\u00fb\u00c2\u00acq\u009c\u00ac\u00a8\u008a\u00d2]\u00e9BD\u00aa\u00a9B3\u00db\u0090\u00ae\u00c0\u00c4h4\u00a6\u00d9\u00ab#\u00f4\u0017\u00aa\u00d2\u00e1\t6\u00d7O\u00d0".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = epk.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xFB2;
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
                throw new RuntimeException("epk", exception);
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
            epk.c[n2] = epk.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = epk.a(n, l);
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
            throw new RuntimeException("epk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(epk.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

