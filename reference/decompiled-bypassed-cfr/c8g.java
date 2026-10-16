/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class c8g
implements a83 {
    private static final /* synthetic */ Logger oy9;
    public final Map jvn = this.tn6();
    private static final long a = c.a(-2336228177698099490L, -6932048266343034138L, MethodHandles.lookup().lookupClass()).a(113970655362100L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public Map tn6() {
        return Maps.newHashMap();
    }

    @Override
    public Object _gz(Object object) {
        return this.jvn.get(object);
    }

    @Override
    public void emn(Object object, Object object2) {
        Object object3;
        Map map;
        block5: {
            block6: {
                long l = a ^ 0x3A2196048F2CL;
                Validate.notNull((Object)object);
                int n = t9d.b();
                Validate.notNull((Object)object2);
                int n2 = n;
                try {
                    try {
                        map = this.jvn;
                        object3 = object;
                        if (n2 == 0) break block5;
                        if (map.containsKey(object3)) {
                        }
                        break block6;
                    }
                    catch (oov oov2) {
                        throw c8g.b(oov2);
                    }
                    oy9.debug((String)((Object)c8g.a("y", (int)3091, (long)(0x26A0EC0ACBB84745L ^ l))) + object + (String)((Object)c8g.a("y", (int)18472, (long)(0xDD738C7C49C837FL ^ l))));
                }
                catch (oov oov3) {
                    throw c8g.b(oov3);
                }
            }
            map = this.jvn;
            object3 = object;
        }
        map.put(object3, object2);
    }

    public Set kqi() {
        return Collections.unmodifiableSet(this.jvn.keySet());
    }

    public boolean vqt(Object object) {
        return this.jvn.containsKey(object);
    }

    public Iterator iterator() {
        return this.jvn.values().iterator();
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
        long l = a ^ 0x3DB9B2AFE72FL;
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
        String string = "1^\u0080\u00b3\u0013J\u000e\t<\u0006\u008a\u00ac\u00ceH\u00adm$\u0002,u\u00a0\u008d\u0006\u00ba(I6\u00c1\u00ae \u001f\u00abU\f\u00c1\"\u001a0g\u0091\u0017\u000f\u008aA\u001a\u00e7\u00fa%\u00e51\u001d\u00dfP^l\u00c4l\u00d5\u00d0e~]G\u00ea\u00a9";
        int n2 = "1^\u0080\u00b3\u0013J\u000e\t<\u0006\u008a\u00ac\u00ceH\u00adm$\u0002,u\u00a0\u008d\u0006\u00ba(I6\u00c1\u00ae \u001f\u00abU\f\u00c1\"\u001a0g\u0091\u0017\u000f\u008aA\u001a\u00e7\u00fa%\u00e51\u001d\u00dfP^l\u00c4l\u00d5\u00d0e~]G\u00ea\u00a9".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = c8g.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                oy9 = LogManager.getLogger();
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov b(oov oov2) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6677;
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
                throw new RuntimeException("c8g", exception);
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
            c8g.c[n2] = c8g.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = c8g.a(n, l);
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
            throw new RuntimeException("c8g" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c8g.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

