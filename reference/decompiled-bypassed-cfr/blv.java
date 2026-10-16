/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.BufferUtils
 */
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;

public class blv {
    private final blv$mau zc3;
    private final String a4g;
    private int dec;
    private int j9k = 0;
    private static final long a = c.a(3444589458882945349L, 7521198647535844710L, MethodHandles.lookup().lookupClass()).a(145489593967403L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    private blv(blv$mau blv$mau, int n, String string) {
        this.zc3 = blv$mau;
        this.dec = n;
        this.a4g = string;
    }

    public void n8m(jn3 jn32) {
        ++this.j9k;
        gis.kmn(jn32.x_a(), this.dec);
    }

    public void btz(jn3 jn32) {
        block5: {
            int n;
            block4: {
                int n2 = t9d.b();
                try {
                    try {
                        n = --this.j9k;
                        if (n2 == 0) break block4;
                        if (n > 0) break block5;
                    }
                    catch (oov oov2) {
                        throw blv.a(oov2);
                    }
                    n = this.dec;
                }
                catch (oov oov3) {
                    throw blv.a(oov3);
                }
            }
            gis.rzx(n);
            this.zc3.hup().remove(this.a4g);
        }
    }

    public String ik9() {
        return this.a4g;
    }

    public static blv zmy(y99 y992, blv$mau blv$mau, String string) {
        blv blv2;
        block5: {
            blv blv3;
            block6: {
                block7: {
                    int n;
                    block8: {
                        long l = a ^ 0xA48C13A24FFL;
                        int n2 = t9d.b();
                        blv3 = (blv)blv$mau.hup().get(string);
                        try {
                            blv2 = blv3;
                            if (n2 == 0) break block5;
                            if (blv2 == null) {
                            }
                            break block6;
                        }
                        catch (oov oov2) {
                            throw blv.a(oov2);
                        }
                        gdz gdz2 = new gdz((String)((Object)blv.a("x", (int)6551, (long)(0x715D98F000DC9995L ^ l))) + string + blv$mau.f8h());
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(y992.td5(gdz2).f_4());
                        byte[] byArray = blv.opl(bufferedInputStream);
                        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)byArray.length);
                        byteBuffer.put(byArray);
                        byteBuffer.position(0);
                        n = gis.qor(blv$mau.bl8());
                        try {
                            gis.yg7(n, byteBuffer);
                            gis.u58(n);
                            if (n2 == 0) break block7;
                            if (gis.dc1(n, gis.y93) != 0) break block8;
                        }
                        catch (oov oov3) {
                            throw blv.a(oov3);
                        }
                        String string2 = StringUtils.trim((String)gis.h0d(n, 32768));
                        kcc kcc2 = new kcc((String)((Object)blv.a("x", (int)12235, (long)(0x754070C71D97AFCAL ^ l))) + blv$mau.zvr() + (String)((Object)blv.a("x", (int)15551, (long)(0x4E90B1F372003CBCL ^ l))) + string2);
                        kcc2.oic(gdz2.xyp());
                        throw kcc2;
                    }
                    blv3 = new blv(blv$mau, n, string);
                }
                blv$mau.hup().put(string, blv3);
            }
            blv2 = blv3;
        }
        return blv2;
    }

    public static byte[] opl(BufferedInputStream bufferedInputStream) {
        byte[] byArray;
        try {
            byArray = IOUtils.toByteArray((InputStream)bufferedInputStream);
        }
        finally {
            bufferedInputStream.close();
        }
        return byArray;
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
        long l = a ^ 0x2E9AA63F2588L;
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
        String string = "\u00ae\u00e8\u00bc\u00f2\u00e8\u00c3h\u009c\u00ba\u00f8'=\u00fd\u00d0\r\u001f\u00b7\u00e4G\rE\u0016\u0016\u00f8(>\u0007\u0083\u00c9\u0091g(\u00dd\u00e77\u00d3\u0094\u00ef\u00b0\u00a1\u0002*Q\u0012\u00aa\u00fdOE\u00bag\u0018\u00f9\u0014L]RL\u00c8M\u00bd\u0011E\u00a2\u0095\b(\u0007o\u00b8\u0091\u00c5u8\u0080\u0002\u008ap\u0002\u00e3]B-\u0095\u00c6y\u0007\u00f6X\u0004T\u00c6%b\u00b4\u009f\u00f0Za\u00a8\u0098\u00b5+\u00da\u001a}\u000e";
        int n2 = "\u00ae\u00e8\u00bc\u00f2\u00e8\u00c3h\u009c\u00ba\u00f8'=\u00fd\u00d0\r\u001f\u00b7\u00e4G\rE\u0016\u0016\u00f8(>\u0007\u0083\u00c9\u0091g(\u00dd\u00e77\u00d3\u0094\u00ef\u00b0\u00a1\u0002*Q\u0012\u00aa\u00fdOE\u00bag\u0018\u00f9\u0014L]RL\u00c8M\u00bd\u0011E\u00a2\u0095\b(\u0007o\u00b8\u0091\u00c5u8\u0080\u0002\u008ap\u0002\u00e3]B-\u0095\u00c6y\u0007\u00f6X\u0004T\u00c6%b\u00b4\u009f\u00f0Za\u00a8\u0098\u00b5+\u00da\u001a}\u000e".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = blv.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A86;
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
                throw new RuntimeException("blv", exception);
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
            blv.c[n2] = blv.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = blv.a(n, l);
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
            throw new RuntimeException("blv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(blv.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

