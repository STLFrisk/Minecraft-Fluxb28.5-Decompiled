/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
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

public class bfw {
    private static final /* synthetic */ Map u_h;
    private static final long a = c.a(-4227523630725167043L, 8904836564652897647L, MethodHandles.lookup().lookupClass()).a(256742579282425L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public static synchronized ylx _cn(File file, int n, int n2) {
        int n3;
        File file2;
        block11: {
            block12: {
                int n4;
                File file3;
                block10: {
                    ylx ylx2;
                    block9: {
                        long l = a ^ 0x6FA4667E9B1DL;
                        file3 = new File(file, (String)((Object)bfw.a("b", (int)3094, (long)(0x2D74E89E04767DF8L ^ l))));
                        file2 = new File(file3, (String)((Object)bfw.a("b", (int)25316, (long)(0x2A2A26C034539308L ^ l))) + (n >> 5) + "." + (n2 >> 5) + (String)((Object)bfw.a("b", (int)9121, (long)(0x5B541D29C604D24CL ^ l))));
                        n4 = t9d.b();
                        ylx ylx3 = (ylx)u_h.get(file2);
                        try {
                            ylx2 = ylx3;
                            if (n4 == 0) break block9;
                            if (ylx2 == null) break block10;
                        }
                        catch (oov oov2) {
                            throw bfw.a(oov2);
                        }
                        ylx2 = ylx3;
                    }
                    return ylx2;
                }
                try {
                    try {
                        n3 = file3.exists();
                        if (n4 == 0) break block11;
                        if (n3 != 0) break block12;
                    }
                    catch (oov oov3) {
                        throw bfw.a(oov3);
                    }
                    file3.mkdirs();
                }
                catch (oov oov4) {
                    throw bfw.a(oov4);
                }
            }
            n3 = u_h.size();
        }
        try {
            if (n3 >= 256) {
                bfw.j_n();
            }
        }
        catch (oov oov5) {
            throw bfw.a(oov5);
        }
        ylx ylx4 = new ylx(file2);
        u_h.put(file2, ylx4);
        return ylx4;
    }

    /*
     * Loose catch block
     */
    public static synchronized void j_n() {
        block7: {
            int n = t9d.c();
            for (ylx ylx2 : u_h.values()) {
                block9: {
                    try {
                        ylx ylx3;
                        block8: {
                            if (n != 0) break block7;
                            try {
                                block10: {
                                    ylx3 = ylx2;
                                    if (n != 0) break block8;
                                    break block10;
                                    catch (IOException iOException) {
                                        throw bfw.a(iOException);
                                    }
                                }
                                if (ylx3 == null) break block9;
                            }
                            catch (IOException iOException) {
                                throw bfw.a(iOException);
                            }
                            ylx3 = ylx2;
                        }
                        ylx3.ain();
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                }
                if (n == 0) continue;
            }
            u_h.clear();
        }
    }

    public static DataInputStream p1f(File file, int n, int n2) {
        ylx ylx2 = bfw._cn(file, n, n2);
        return ylx2.ci2(n & 0x1F, n2 & 0x1F);
    }

    public static DataOutputStream ay4(File file, int n, int n2) {
        ylx ylx2 = bfw._cn(file, n, n2);
        return ylx2.wfn(n & 0x1F, n2 & 0x1F);
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
        long l = a ^ 0x508F181E39E2L;
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
        String string = "\u00fe\u00a9\u0012\u00db\u001a \u0004\u00ac0B`h\u0010\u00bfvH\u0010\u00169\u00e7\u00cc\u00c1M\u00f4Q#\u0001\u0002\u0018{\u00fe\u00a8\u0001\u0010\u00d2K\u00a8*F\u0082\u00a0\u008d\u00fe2lc\u00b8w\u00e1\u00be";
        int n2 = "\u00fe\u00a9\u0012\u00db\u001a \u0004\u00ac0B`h\u0010\u00bfvH\u0010\u00169\u00e7\u00cc\u00c1M\u00f4Q#\u0001\u0002\u0018{\u00fe\u00a8\u0001\u0010\u00d2K\u00a8*F\u0082\u00a0\u008d\u00fe2lc\u00b8w\u00e1\u00be".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = bfw.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
                u_h = Maps.newHashMap();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4CF8;
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
                throw new RuntimeException("bfw", exception);
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
            bfw.c[n2] = bfw.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bfw.a(n, l);
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
            throw new RuntimeException("bfw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bfw.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

