/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FileUtils
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;

public class bhs$1
extends Thread {
    public final bhs xs1;
    private static final long a = c.a(-4226482553779109216L, 1280565028230800954L, MethodHandles.lookup().lookupClass()).a(47896465982543L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public bhs$1(bhs bhs2, String string) {
        this.xs1 = bhs2;
        super(string);
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block51: {
            bhs bhs2;
            BufferedImage bufferedImage;
            int n;
            HttpURLConnection httpURLConnection;
            long l;
            block49: {
                block50: {
                    block59: {
                        block48: {
                            File file;
                            block47: {
                                block42: {
                                    block46: {
                                        HttpURLConnection httpURLConnection2;
                                        block45: {
                                            block43: {
                                                block44: {
                                                    block41: {
                                                        block40: {
                                                            bhs bhs3;
                                                            block39: {
                                                                l = a ^ 0x53F71BC27703L;
                                                                httpURLConnection = null;
                                                                int n2 = t9d.b();
                                                                bhs.beq().debug((String)((Object)bhs$1.a("s", (int)26137, (long)(0x7CE03B165DE1ABD9L ^ l))), new Object[]{bhs.cfu(this.xs1), bhs.bvz(this.xs1)});
                                                                n = n2;
                                                                bhs3 = this.xs1;
                                                                if (n == 0) break block39;
                                                                try {
                                                                    block55: {
                                                                        if (!bhs.w3b(bhs3)) break block40;
                                                                        break block55;
                                                                        catch (Exception exception) {
                                                                            throw bhs$1.a(exception);
                                                                        }
                                                                    }
                                                                    bhs3 = this.xs1;
                                                                }
                                                                catch (Exception exception) {
                                                                    throw bhs$1.a(exception);
                                                                }
                                                            }
                                                            bhs.qi7(bhs3);
                                                            if (n != 0) break block51;
                                                        }
                                                        httpURLConnection = (HttpURLConnection)new URL(bhs.cfu(this.xs1)).openConnection(c05.vz1().snb());
                                                        httpURLConnection.setDoInput(true);
                                                        httpURLConnection.setDoOutput(false);
                                                        httpURLConnection.connect();
                                                        httpURLConnection2 = httpURLConnection;
                                                        if (n == 0) break block41;
                                                        try {
                                                            block56: {
                                                                if (httpURLConnection2.getResponseCode() / 100 == 2) break block42;
                                                                break block56;
                                                                catch (Exception exception) {
                                                                    throw bhs$1.a(exception);
                                                                }
                                                            }
                                                            httpURLConnection2 = httpURLConnection;
                                                        }
                                                        catch (Exception exception) {
                                                            throw bhs$1.a(exception);
                                                        }
                                                    }
                                                    if (n == 0) break block43;
                                                    try {
                                                        block57: {
                                                            if (httpURLConnection2.getErrorStream() == null) break block44;
                                                            break block57;
                                                            catch (Exception exception) {
                                                                throw bhs$1.a(exception);
                                                            }
                                                        }
                                                        hxt.d2_(httpURLConnection.getErrorStream());
                                                    }
                                                    catch (Exception exception) {
                                                        throw bhs$1.a(exception);
                                                    }
                                                }
                                                httpURLConnection2 = httpURLConnection;
                                            }
                                            try {
                                                if (n == 0) break block45;
                                                if (httpURLConnection2 == null) break block46;
                                            }
                                            catch (Exception exception) {
                                                throw bhs$1.a(exception);
                                            }
                                            httpURLConnection2 = httpURLConnection;
                                        }
                                        httpURLConnection2.disconnect();
                                    }
                                    bhs.snf(this.xs1);
                                    return;
                                }
                                file = bhs.bvz(this.xs1);
                                if (n == 0) break block47;
                                try {
                                    block58: {
                                        if (file == null) break block48;
                                        break block58;
                                        catch (Exception exception) {
                                            throw bhs$1.a(exception);
                                        }
                                    }
                                    FileUtils.copyInputStreamToFile((InputStream)httpURLConnection.getInputStream(), (File)bhs.bvz(this.xs1));
                                    file = bhs.bvz(this.xs1);
                                }
                                catch (Exception exception) {
                                    throw bhs$1.a(exception);
                                }
                            }
                            bufferedImage = ImageIO.read(file);
                            if (n != 0) break block59;
                        }
                        bufferedImage = p9t.h3z(httpURLConnection.getInputStream());
                    }
                    try {
                        bhs2 = this.xs1;
                        if (n == 0) break block49;
                        if (bhs.ef_(bhs2) == null) break block50;
                    }
                    catch (Exception exception) {
                        throw bhs$1.a(exception);
                    }
                    bufferedImage = bhs.ef_(this.xs1).parseUserSkin(bufferedImage);
                }
                bhs2 = this.xs1;
            }
            bhs2.asj(bufferedImage);
            if (n == 0) break block51;
            try {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
            catch (Exception exception) {
                throw bhs$1.a(exception);
            }
            bhs.snf(this.xs1);
            break block51;
            catch (Exception exception) {
                block52: {
                    try {
                        bhs.beq().error((String)((Object)bhs$1.a("s", (int)8263, (long)(0x3614787109AF6D84L ^ l))) + exception.getClass().getName() + (String)((Object)bhs$1.a("s", (int)20636, (long)(0x60B8A3C5B6131D5EL ^ l))) + exception.getMessage());
                        if (n == 0) break block52;
                    }
                    catch (Throwable throwable) {
                        block53: {
                            block54: {
                                try {
                                    try {
                                        if (n == 0) break block53;
                                        if (httpURLConnection == null) break block54;
                                    }
                                    catch (Exception exception2) {
                                        throw bhs$1.a(exception2);
                                    }
                                    httpURLConnection.disconnect();
                                }
                                catch (Exception exception3) {
                                    throw bhs$1.a(exception3);
                                }
                            }
                            bhs.snf(this.xs1);
                        }
                        throw throwable;
                    }
                    try {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                    catch (Exception exception4) {
                        throw bhs$1.a(exception4);
                    }
                    bhs.snf(this.xs1);
                }
                return;
            }
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
        long l = a ^ 0x13EB161D712EL;
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
        String string = "\u00c7b\u00d8\u00804p\u00b9\u00b4O\u008aX\u00e7\u0098\u0012\u0087\u0001@\u00871\u0000{|1\u00e0\u009f\u0005)7R,\u00f8(\u00b9\u0096\u0085r-\u0088P\u00ed\u00f2\u00d4\u00e4\u00dd\u0003\nNV\u0012\u00e6f\u008e\u0017\u00faWu\u00b5I\u00ed\u00c8\u0004j\u0095\u00a4\u00e1\u00eev\u00eb\u00fc.\u00a9B\u0083\\\u00c0\u00be\u00ee\u00b3\u0019wD@\u0083A\u00af\u00f1\u00eb9\u009d\u00d6\u0081J,\u009d\u00f4\u00cc:\u00cb\u0083\u0085t(\u00a9\u00ac\u00e8\u00d6n\u0017\u0095Q?\u00c8\u00f2\"<)l\u00e4\u00cd]E\u0018\u00bewXF6'\u00ef\u0002\u00ec;\u0083a\u00bdG@\u00a7\u001fr\u009a\u00fa\u00b7\t\u0014\u0007";
        int n2 = "\u00c7b\u00d8\u00804p\u00b9\u00b4O\u008aX\u00e7\u0098\u0012\u0087\u0001@\u00871\u0000{|1\u00e0\u009f\u0005)7R,\u00f8(\u00b9\u0096\u0085r-\u0088P\u00ed\u00f2\u00d4\u00e4\u00dd\u0003\nNV\u0012\u00e6f\u008e\u0017\u00faWu\u00b5I\u00ed\u00c8\u0004j\u0095\u00a4\u00e1\u00eev\u00eb\u00fc.\u00a9B\u0083\\\u00c0\u00be\u00ee\u00b3\u0019wD@\u0083A\u00af\u00f1\u00eb9\u009d\u00d6\u0081J,\u009d\u00f4\u00cc:\u00cb\u0083\u0085t(\u00a9\u00ac\u00e8\u00d6n\u0017\u0095Q?\u00c8\u00f2\"<)l\u00e4\u00cd]E\u0018\u00bewXF6'\u00ef\u0002\u00ec;\u0083a\u00bdG@\u00a7\u001fr\u009a\u00fa\u00b7\t\u0014\u0007".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = bhs$1.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x322B;
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
                throw new RuntimeException("bhs$1", exception);
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
            bhs$1.c[n2] = bhs$1.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bhs$1.a(n, l);
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
            throw new RuntimeException("bhs$1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bhs$1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

