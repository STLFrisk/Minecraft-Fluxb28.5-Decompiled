/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
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

public class cn9$zw7
extends InputStream {
    private final InputStream zy9;
    private final String e_7;
    private boolean i3r;
    private static final long a = c.a(-6311594306747601585L, -2290662834766743432L, MethodHandles.lookup().lookupClass()).a(250066642727903L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public cn9$zw7(InputStream inputStream, gdz gdz2, String string) {
        long l = a ^ 0x2987812EC641L;
        this.i3r = false;
        this.zy9 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new Exception().printStackTrace(new PrintStream(byteArrayOutputStream));
        this.e_7 = (String)((Object)cn9$zw7.a("f", (int)7595, (long)(0x779D7A944E1C6FF0L ^ l))) + gdz2 + (String)((Object)cn9$zw7.a("f", (int)8054, (long)(0x61B81E8810926D2EL ^ l))) + string + (String)((Object)cn9$zw7.a("f", (int)2979, (long)(0x54C881BC637C79FAL ^ l))) + byteArrayOutputStream.toString();
    }

    @Override
    public void close() {
        this.zy9.close();
        this.i3r = true;
    }

    public void finalize() {
        cn9$zw7 cn9$zw7;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        cn9$zw7 = this;
                        if (n == 0) break block4;
                        if (cn9$zw7.i3r) break block5;
                    }
                    catch (oov oov2) {
                        throw cn9$zw7.a(oov2);
                    }
                    cn9.nyj().warn(this.e_7);
                }
                catch (oov oov3) {
                    throw cn9$zw7.a(oov3);
                }
            }
            cn9$zw7 = this;
        }
        super.finalize();
    }

    @Override
    public int read() {
        return this.zy9.read();
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
        long l = a ^ 0x68150401FF94L;
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
        String string = "6\u001d\u00aa\u00d9\u00eav\u0015\u00a9\u00f3\u00e0R\u00bf\u00e6_\u00d8L(K\u00fcI\u00cb\u00f4 t2\u00deWX\u0091\u00d3\u00aa\u00cb\u0003\u00f6Q\u00caD{q\u00ff\u0011\u009cs\u00e3T\u0001\u00a5\u00d1%\u008bJ(\u00acj \u008e\u00e4(\u009c\u00031\u00e1\u0015;\u001c\u00de\u0093&\u00e1\u0006fu\u0091\u00d5\u0086\u009b\u001a\u001b\u001b\u000f\u00ce\u009a\u00db\u008bc\u00d2zKt\u00dd{5\u00a7\u00e8}\u0083Ar";
        int n2 = "6\u001d\u00aa\u00d9\u00eav\u0015\u00a9\u00f3\u00e0R\u00bf\u00e6_\u00d8L(K\u00fcI\u00cb\u00f4 t2\u00deWX\u0091\u00d3\u00aa\u00cb\u0003\u00f6Q\u00caD{q\u00ff\u0011\u009cs\u00e3T\u0001\u00a5\u00d1%\u008bJ(\u00acj \u008e\u00e4(\u009c\u00031\u00e1\u0015;\u001c\u00de\u0093&\u00e1\u0006fu\u0091\u00d5\u0086\u009b\u001a\u001b\u001b\u000f\u00ce\u009a\u00db\u008bc\u00d2zKt\u00dd{5\u00a7\u00e8}\u0083Ar".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = cn9$zw7.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x50FF;
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
                throw new RuntimeException("cn9$zw7", exception);
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
            cn9$zw7.c[n2] = cn9$zw7.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cn9$zw7.a(n, l);
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
            throw new RuntimeException("cn9$zw7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cn9$zw7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

