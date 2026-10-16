/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.Display
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

public class enq {
    private static /* synthetic */ JFrame l87;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void skv(ity ity2, Logger logger) {
        long l = a ^ 0x1824723353C2L;
        try {
            if (!enq.haf()) {
                return;
            }
        }
        catch (Exception exception) {
            throw enq.a(exception);
        }
        l87 = new JFrame((String)((Object)enq.a("x", (int)10584, (long)(0x479D7EE949C5A00EL ^ l))));
        Canvas canvas = new Canvas();
        canvas.setBackground(new Color(16, 16, 16));
        Display.setParent((Canvas)canvas);
        c05 c052 = c05.vz1();
        canvas.setSize(c052.pfr, c052.ry7);
        l87.add(canvas);
        l87.setDefaultCloseOperation(3);
        l87.pack();
        l87.setLocationRelativeTo(null);
        InputStream inputStream = null;
        InputStream inputStream2 = null;
        try {
            inputStream = ity2.bxo(new gdz((String)((Object)enq.a("x", (int)16576, (long)(0x2B86CCF606084993L ^ l)))));
            inputStream2 = ity2.bxo(new gdz((String)((Object)enq.a("x", (int)23719, (long)(0x50695587839D55F5L ^ l)))));
            ArrayList<BufferedImage> arrayList = new ArrayList<BufferedImage>();
            arrayList.add(ImageIO.read(inputStream));
            arrayList.add(ImageIO.read(inputStream2));
            l87.setIconImages(arrayList);
        }
        catch (Exception exception) {
            try {
                logger.error((String)((Object)enq.a("x", (int)13778, (long)(0x4CB9B07BC078BC85L ^ l))), (Throwable)exception);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly(inputStream2);
                throw throwable;
            }
            IOUtils.closeQuietly((InputStream)inputStream);
            IOUtils.closeQuietly(inputStream2);
        }
        IOUtils.closeQuietly((InputStream)inputStream);
        IOUtils.closeQuietly((InputStream)inputStream2);
        l87.setVisible(true);
    }

    /*
     * Loose catch block
     */
    private static boolean haf() {
        int n;
        boolean bl;
        File file;
        long l;
        block11: {
            File file2;
            block10: {
                l = a ^ 0x47FB3422C17L;
                file = new File(c05.vz1().glh + (String)((Object)enq.a("x", (int)6344, (long)(0x2957DDCC66186E4CL ^ l))));
                bl = false;
                n = t9d.c();
                file2 = file;
                if (n != 0) break block10;
                try {
                    block15: {
                        if (file2.exists()) break block11;
                        break block15;
                        catch (IOException iOException) {
                            throw enq.a(iOException);
                        }
                    }
                    file2 = file;
                }
                catch (IOException iOException) {
                    throw enq.a(iOException);
                }
            }
            enq.wm7(file2);
        }
        try {
            boolean bl2;
            block14: {
                block13: {
                    block12: {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        String string = bufferedReader.readLine();
                        try {
                            bufferedReader.close();
                            c05.vz1();
                            bl2 = string.equals(enq.a("x", (int)19189, (long)(0x685629D108E4BC70L ^ l)));
                            if (n != 0) break block12;
                            if (!bl2) break block13;
                        }
                        catch (IOException iOException) {
                            throw enq.a(iOException);
                        }
                        bl2 = c05.go6;
                    }
                    try {
                        if (n != 0) break block14;
                        if (bl2) break block13;
                    }
                    catch (IOException iOException) {
                        throw enq.a(iOException);
                    }
                    bl2 = true;
                    break block14;
                }
                bl2 = false;
            }
            bl = bl2;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return bl;
    }

    /*
     * Loose catch block
     */
    private static void wm7(File file) {
        int n = t9d.c();
        try {
            boolean bl;
            PrintWriter printWriter;
            PrintWriter printWriter2;
            block9: {
                block10: {
                    block8: {
                        boolean bl2 = file.getParentFile().exists();
                        if (n != 0) break block8;
                        try {
                            block11: {
                                if (bl2) break block8;
                                break block11;
                                catch (IOException iOException) {
                                    throw enq.a(iOException);
                                }
                            }
                            bl2 = file.getParentFile().mkdirs();
                        }
                        catch (IOException iOException) {
                            throw enq.a(iOException);
                        }
                    }
                    printWriter2 = new PrintWriter(new FileWriter(file));
                    try {
                        printWriter = printWriter2;
                        bl = c05.go6;
                        if (n != 0) break block9;
                        if (bl) break block10;
                    }
                    catch (IOException iOException) {
                        throw enq.a(iOException);
                    }
                    bl = true;
                    break block9;
                }
                bl = false;
            }
            printWriter.println(Boolean.toString(bl));
            printWriter2.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static void h43() {
        block3: {
            JFrame jFrame;
            block2: {
                int n = t9d.b();
                try {
                    jFrame = l87;
                    if (n == 0) break block2;
                    if (jFrame == null) break block3;
                }
                catch (oov oov2) {
                    throw enq.a(oov2);
                }
                jFrame = l87;
            }
            jFrame.setExtendedState(6);
        }
    }

    public static JFrame _et() {
        return l87;
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

                enq.a = c.a(-2288731809165656679L, -985852248436487066L, MethodHandles.lookup().lookupClass()).a(57418515993770L);
                enq.d = new HashMap<K, V>(13);
                var0 = enq.a ^ 53499105653318L;
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
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "s\u00d1\u00fcU\u00df4c\u00ea\u00c8\u00d8\u00c8v\u00a2\nf\u00a5\u00a2}\u0095c}\u00e0\u00cd\u009b\u00d5\u00e4\u00d2\u00c0\u00bd\u00f9\u00b6\u00ecs\u00e7\u00d9\u00fc\u001bq\u008c\u0094(YD\u00d15\u00eew\u00c6\u0089\u000e/*\u00a1\u001dA\u00b1\u0088ja\u0094<.61z\u00bd\u00c3\u00d3>\u009c\u00e6s\u0086c\u00b3\u00fe{\u0019M\u00eae8coOM)\u0087\u00fe\u0002W\u0000\u00b3\u00b3\u00a8\u001aB\u00ff\u00139\u001d\u00b9\u00dd\f\u008d\u00c9'\u0006*\u00a9\u00a4\u00e5W\u001f\u00e3\u00e2\u00ddw\u00b2l\u00b1\u00dc\u00f1\u0099I,\u00c6Z\u00df\u00c8\u00db\u00ab\u0089\u00fb\u0003\u00da6\u00d8\u0010g\u0084\u0086W\u00d7\u00c5X\u0099\u0087\u00b8\u000f\u00b8\u00df\u008ff\n";
                var8_6 = "s\u00d1\u00fcU\u00df4c\u00ea\u00c8\u00d8\u00c8v\u00a2\nf\u00a5\u00a2}\u0095c}\u00e0\u00cd\u009b\u00d5\u00e4\u00d2\u00c0\u00bd\u00f9\u00b6\u00ecs\u00e7\u00d9\u00fc\u001bq\u008c\u0094(YD\u00d15\u00eew\u00c6\u0089\u000e/*\u00a1\u001dA\u00b1\u0088ja\u0094<.61z\u00bd\u00c3\u00d3>\u009c\u00e6s\u0086c\u00b3\u00fe{\u0019M\u00eae8coOM)\u0087\u00fe\u0002W\u0000\u00b3\u00b3\u00a8\u001aB\u00ff\u00139\u001d\u00b9\u00dd\f\u008d\u00c9'\u0006*\u00a9\u00a4\u00e5W\u001f\u00e3\u00e2\u00ddw\u00b2l\u00b1\u00dc\u00f1\u0099I,\u00c6Z\u00df\u00c8\u00db\u00ab\u0089\u00fb\u0003\u00da6\u00d8\u0010g\u0084\u0086W\u00d7\u00c5X\u0099\u0087\u00b8\u000f\u00b8\u00df\u008ff\n".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = enq.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00df-\u00b7I\u00e2\u00a73\u00ce )\u00ffL\u00d4\u0096\u00aa\u00f6\u008f\u00a0\u0016\u009a{\u00ba\u0085nx\u00ad\u00c1\u00e5\u00f6|Z\u001a\u00de\u00b7E\u00bb\u00cds\\\u00c4 Sp\u00b2j\u00a4\u00e2<\u00b1\u00c3\f\u0097.Z\u007f\u001c\u001b\u00b3\u00ed\u00d4rE,\u00bc\u009dzm\u008c\u00be<\u0099:\u00e1";
                    var8_6 = "\u00df-\u00b7I\u00e2\u00a73\u00ce )\u00ffL\u00d4\u0096\u00aa\u00f6\u008f\u00a0\u0016\u009a{\u00ba\u0085nx\u00ad\u00c1\u00e5\u00f6|Z\u001a\u00de\u00b7E\u00bb\u00cds\\\u00c4 Sp\u00b2j\u00a4\u00e2<\u00b1\u00c3\f\u0097.Z\u007f\u001c\u001b\u00b3\u00ed\u00d4rE,\u00bc\u009dzm\u008c\u00be<\u0099:\u00e1".length();
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
                    var9_3[var7_4++] = enq.a(var10_9).intern();
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
        enq.b = var9_3;
        enq.c = new String[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x21B4;
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
                throw new RuntimeException("enq", exception);
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
            enq.c[n2] = enq.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = enq.a(n, l);
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
            throw new RuntimeException("enq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(enq.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

