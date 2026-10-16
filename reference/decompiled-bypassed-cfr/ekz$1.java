/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ekz$1
extends TimerTask {
    public final ekz n6c;
    private static final long a = c.a(7178724582331419225L, 8252264633336396313L, MethodHandles.lookup().lookupClass()).a(98737928324585L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public ekz$1(ekz ekz2) {
        this.n6c = ekz2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @Override
    public void run() {
        Object object;
        int n;
        long l;
        block11: {
            l = a ^ 0x77A5FE3FA123L;
            n = t9d.c();
            object = ekz.p0l(this.n6c);
            if (n != 0) break block11;
            try {
                block15: {
                    if (!object.i6i()) break block12;
                    break block15;
                    catch (oov oov2) {
                        throw ekz$1.a(oov2);
                    }
                }
                object = ekz.y0h(this.n6c);
            }
            catch (oov oov3) {
                throw ekz$1.a(oov3);
            }
        }
        zgw zgw2 = object;
        synchronized (object) {
            block12: {
                HashMap hashMap;
                block13: {
                    Object object2;
                    block14: {
                        hashMap = Maps.newHashMap((Map)ekz.uyh(this.n6c));
                        object2 = this.n6c;
                        if (n != 0) break block13;
                        try {
                            block16: {
                                if (ekz.a_g((ekz)object2) != 0) break block14;
                                break block16;
                                catch (oov oov4) {
                                    throw ekz$1.a(oov4);
                                }
                            }
                            hashMap.putAll(ekz.nh0(this.n6c));
                        }
                        catch (oov oov5) {
                            throw ekz$1.a(oov5);
                        }
                    }
                    hashMap.put(ekz$1.a("j", (int)11008, (long)(0x6D4E0EDA888A15E4L ^ l)), ekz.wl1(this.n6c));
                    hashMap.put(ekz$1.a("j", (int)10089, (long)(0x74FCDDD034E7198CL ^ l)), ekz.byx(this.n6c));
                    object2 = zgw2;
                }
                // ** MonitorExit[v3] (shouldn't be in output)
                crb.zv4(ekz.wrk(this.n6c), hashMap, true);
            }
            return;
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
        long l = a ^ 0x731DD348FDD8L;
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
        String string = "\u00e1\u001fk\u00deG\u0081\\\u00e9x\u00d5\u00ef\u008d\u00f6\u0006c\u000b[>\u00bb\u00d6\u00c2\u00a9\bL \u00bcj3\u001cv*\u00a6\u00fc6\u008bz\u00c0V\u00b3\u00e8&R\u0003&\u00b8\u0015\b\u008b:\u00ca\u00a07\u00ea=\nNj";
        int n2 = "\u00e1\u001fk\u00deG\u0081\\\u00e9x\u00d5\u00ef\u008d\u00f6\u0006c\u000b[>\u00bb\u00d6\u00c2\u00a9\bL \u00bcj3\u001cv*\u00a6\u00fc6\u008bz\u00c0V\u00b3\u00e8&R\u0003&\u00b8\u0015\b\u008b:\u00ca\u00a07\u00ea=\nNj".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ekz$1.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6269;
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
                throw new RuntimeException("ekz$1", exception);
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
            ekz$1.c[n2] = ekz$1.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ekz$1.a(n, l);
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
            throw new RuntimeException("ekz$1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ekz$1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

