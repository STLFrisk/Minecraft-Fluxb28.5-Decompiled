/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g62 {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public static bdo xe6(InputStream inputStream) {
        bdo bdo2;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));){
            bdo2 = g62.z3b(dataInputStream, btc.pzg);
        }
        return bdo2;
    }

    public static void bhd(bdo bdo2, OutputStream outputStream) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));){
            g62.ehq(bdo2, dataOutputStream);
        }
    }

    public static void uhp(bdo bdo2, File file) {
        block17: {
            boolean bl;
            File file2;
            block18: {
                int n;
                long l;
                block15: {
                    block16: {
                        block13: {
                            block14: {
                                l = a ^ 0x484C3A1024ABL;
                                n = t9d.b();
                                file2 = new File(file.getAbsolutePath() + (String)((Object)g62.a("s", (int)276, (long)(0x650CF389EB96116AL ^ l))));
                                try {
                                    try {
                                        bl = file2.exists();
                                        if (n == 0) break block13;
                                        if (!bl) break block14;
                                    }
                                    catch (oov oov2) {
                                        throw g62.a(oov2);
                                    }
                                    file2.delete();
                                }
                                catch (oov oov3) {
                                    throw g62.a(oov3);
                                }
                            }
                            g62.ekq(bdo2, file2);
                            bl = file.exists();
                        }
                        try {
                            try {
                                if (n == 0) break block15;
                                if (!bl) break block16;
                            }
                            catch (oov oov4) {
                                throw g62.a(oov4);
                            }
                            file.delete();
                        }
                        catch (oov oov5) {
                            throw g62.a(oov5);
                        }
                    }
                    bl = file.exists();
                }
                try {
                    try {
                        if (n == 0) break block17;
                        if (bl) {
                        }
                        break block18;
                    }
                    catch (oov oov6) {
                        throw g62.a(oov6);
                    }
                    throw new IOException((String)((Object)g62.a("s", (int)26765, (long)(0x29F89BD9C6B6F8F2L ^ l))) + file);
                }
                catch (oov oov7) {
                    throw g62.a(oov7);
                }
            }
            bl = file2.renameTo(file);
        }
    }

    public static void ekq(bdo bdo2, File file) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
            g62.ehq(bdo2, dataOutputStream);
        }
    }

    public static bdo zgm(File file) {
        bdo bdo2;
        try {
            if (!file.exists()) {
                return null;
            }
        }
        catch (oov oov2) {
            throw g62.a(oov2);
        }
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));){
            bdo2 = g62.z3b(dataInputStream, btc.pzg);
        }
        return bdo2;
    }

    public static bdo za6(DataInputStream dataInputStream) {
        return g62.z3b(dataInputStream, btc.pzg);
    }

    public static bdo z3b(DataInput dataInput, btc btc2) {
        long l;
        block5: {
            gdw gdw2;
            block4: {
                l = a ^ 0x66C2529DFB94L;
                int n = t9d.b();
                gdw gdw3 = g62._m8(dataInput, 0, btc2);
                try {
                    try {
                        gdw2 = gdw3;
                        if (n == 0) break block4;
                        if (!(gdw2 instanceof bdo)) break block5;
                    }
                    catch (oov oov2) {
                        throw g62.a(oov2);
                    }
                    gdw2 = gdw3;
                }
                catch (oov oov3) {
                    throw g62.a(oov3);
                }
            }
            return (bdo)gdw2;
        }
        throw new IOException((String)((Object)g62.a("s", (int)29377, (long)(0x5049FC3C681DBD84L ^ l))));
    }

    public static void ehq(bdo bdo2, DataOutput dataOutput) {
        g62.elg(bdo2, dataOutput);
    }

    private static void elg(gdw gdw2, DataOutput dataOutput) {
        block5: {
            gdw gdw3;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        dataOutput.writeByte(gdw2.ky0());
                        gdw3 = gdw2;
                        if (n == 0) break block4;
                        if (gdw3.ky0() == 0) break block5;
                    }
                    catch (oov oov2) {
                        throw g62.a(oov2);
                    }
                    dataOutput.writeUTF("");
                    gdw3 = gdw2;
                }
                catch (oov oov3) {
                    throw g62.a(oov3);
                }
            }
            gdw3.b_8(dataOutput);
        }
    }

    /*
     * Loose catch block
     */
    private static gdw _m8(DataInput dataInput, int n, btc btc2) {
        byte by;
        byte by2;
        long l;
        block6: {
            block7: {
                l = a ^ 0x52092466CD0CL;
                int n2 = t9d.c();
                by2 = dataInput.readByte();
                by = by2;
                if (n2 != 0) break block6;
                try {
                    block8: {
                        if (by != 0) break block7;
                        break block8;
                        catch (IOException iOException) {
                            throw g62.a(iOException);
                        }
                    }
                    return new zv6();
                }
                catch (IOException iOException) {
                    throw g62.a(iOException);
                }
            }
            dataInput.readUTF();
            by = by2;
        }
        gdw gdw2 = gdw.nt6(by);
        try {
            gdw2.zwk(dataInput, n, btc2);
            return gdw2;
        }
        catch (IOException iOException) {
            e1i e1i2 = e1i.cor(iOException, (String)((Object)g62.a("s", (int)30133, (long)(0x1380A4607CA28C69L ^ l))));
            wsc wsc2 = e1i2.i_r((String)((Object)g62.a("s", (int)626, (long)(0x40D5959E1AA27BA8L ^ l))));
            wsc2._0p((String)((Object)g62.a("s", (int)10496, (long)(0x4BAA8F57DCB9D0DEL ^ l))), g62.a("s", (int)17088, (long)(0x3BD015BC9ED5BB1FL ^ l)));
            wsc2._0p((String)((Object)g62.a("s", (int)23925, (long)(0xB2D5A78688F24AEL ^ l))), by2);
            throw new oov(e1i2);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                g62.a = c.a(453911054115543001L, -5336497493629356114L, MethodHandles.lookup().lookupClass()).a(95037916815575L);
                g62.d = new HashMap<K, V>(13);
                var0 = g62.a ^ 4663580111489L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "\u001e\u00d5\u00a4\u00af\u0080\u00c0\u0088\u008d\u0012\u00b4v\u0087\u0019\u00b6\u0090\u0003\u0018 \u00ed&a7\u009480\u0092\u00a7|\u00b0\u00b2\u0083\u009d*q\u001a\u00fc\u00ab\u0010\u008f\u00888(\u00f2\u00f8!\u00a9\u00fb\u001c\u0012\u0003o\u00b2\u0088\u00a0'#\u00d0&f \u00femtyG\u00f1\u00eaG\u0017[\u00a7\u001bP\u0092\u00e6\u001a+\u00e3\u0011\u0018\u00e2<\u0010\u0017Y\u00c1wK\u009c\u00ce\u00d6G\u00a0\u00a6o\u00a4\u00de\u00fb\u0017 \u00f3\u0087,\u00bb;D\u0004\u0091{\u00e3\u00d6T\u00d5\u0002\u00c7\u001551;\u00edd\u001b3oe\u0011W\u0098_\u008fZp\u0018l}w\u0091d\u00c9~Q4:\u0018\u00d3\u009d`I\u00b1\u0083P\u00e3\u0006\u00d3\u00de\u001a\u00ea";
                var8_6 = "\u001e\u00d5\u00a4\u00af\u0080\u00c0\u0088\u008d\u0012\u00b4v\u0087\u0019\u00b6\u0090\u0003\u0018 \u00ed&a7\u009480\u0092\u00a7|\u00b0\u00b2\u0083\u009d*q\u001a\u00fc\u00ab\u0010\u008f\u00888(\u00f2\u00f8!\u00a9\u00fb\u001c\u0012\u0003o\u00b2\u0088\u00a0'#\u00d0&f \u00femtyG\u00f1\u00eaG\u0017[\u00a7\u001bP\u0092\u00e6\u001a+\u00e3\u0011\u0018\u00e2<\u0010\u0017Y\u00c1wK\u009c\u00ce\u00d6G\u00a0\u00a6o\u00a4\u00de\u00fb\u0017 \u00f3\u0087,\u00bb;D\u0004\u0091{\u00e3\u00d6T\u00d5\u0002\u00c7\u001551;\u00edd\u001b3oe\u0011W\u0098_\u008fZp\u0018l}w\u0091d\u00c9~Q4:\u0018\u00d3\u009d`I\u00b1\u0083P\u00e3\u0006\u00d3\u00de\u001a\u00ea".length();
                var5_7 = 16;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = g62.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e1:yU\u00bb\u00ef+Q\u00f6x\u0005\u0088\u00da\u00b6N\u009f\u00c62o\u00c3o\u00f6\u00b2gX\u00bcZ}\u0082/\u00c3,p\u00dd\u00cc \rH\u0017\u0094@3\u0088\u0094}\u00d7>R5\u0092J\u008e#}5\u00e6S\u00e9Rl\u00a1eG\u00111\u00ca\u00c0K-b\u0011\u008b\u0091\u00ff\\_\u0018\u0098\u00be|\u00b1\u0007\u0003e\u0086\u0007H\u00c0K7z\u0097?\u000f~\\\u00acY\u00b8\u00ffn\u001c,9\u00bf";
                    var8_6 = "\u00e1:yU\u00bb\u00ef+Q\u00f6x\u0005\u0088\u00da\u00b6N\u009f\u00c62o\u00c3o\u00f6\u00b2gX\u00bcZ}\u0082/\u00c3,p\u00dd\u00cc \rH\u0017\u0094@3\u0088\u0094}\u00d7>R5\u0092J\u008e#}5\u00e6S\u00e9Rl\u00a1eG\u00111\u00ca\u00c0K-b\u0011\u008b\u0091\u00ff\\_\u0018\u0098\u00be|\u00b1\u0007\u0003e\u0086\u0007H\u00c0K7z\u0097?\u000f~\\\u00acY\u00b8\u00ffn\u001c,9\u00bf".length();
                    var5_7 = 40;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = g62.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        g62.b = var9_3;
        g62.c = new String[8];
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x36F5;
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
                throw new RuntimeException("g62", exception);
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
            g62.c[n2] = g62.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = g62.a(n, l);
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
            throw new RuntimeException("g62" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g62.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

