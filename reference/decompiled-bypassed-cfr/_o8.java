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

public class _o8 {
    private /* synthetic */ w6v gbe;
    private /* synthetic */ yfc zs3;
    private static final long a = c.a(8186932835385104588L, 4375558077781915557L, MethodHandles.lookup().lookupClass()).a(113417610552826L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public w6v x5u() {
        return this.gbe;
    }

    public yfc kk4() {
        return this.zs3;
    }

    public _o8(w6v w6v2, yfc yfc2) {
        this.gbe = w6v2;
        this.zs3 = yfc2;
    }

    public w6v l3w() {
        return this.gbe;
    }

    public yfc jdw() {
        return this.zs3;
    }

    public _o8 uh5(w6v w6v2, yfc yfc2) {
        return new _o8(w6v2, yfc2);
    }

    public static _o8 k01(_o8 _o82, w6v w6v2, yfc yfc2, int n, Object object) {
        int n2;
        block3: {
            block4: {
                int n3 = t9d.c();
                try {
                    n2 = n & 1;
                    if (n3 != 0) break block3;
                    if (n2 == 0) break block4;
                }
                catch (oov oov2) {
                    throw _o8.a(oov2);
                }
                w6v2 = _o82.gbe;
            }
            n2 = n & 2;
        }
        if (n2 != 0) {
            yfc2 = _o82.zs3;
        }
        return _o82.uh5(w6v2, yfc2);
    }

    public String toString() {
        long l = a ^ 0x51E8C4858D32L;
        return (String)((Object)_o8.a("r", (int)23596, (long)(0x357729DBFA44F3BCL ^ l))) + this.gbe + (String)((Object)_o8.a("r", (int)25803, (long)(0x43085D51E5ACB5AL ^ l))) + this.zs3 + ")";
    }

    public int hashCode() {
        int n;
        int n2;
        block13: {
            block11: {
                yfc yfc2;
                block10: {
                    int n3;
                    int n4;
                    block12: {
                        block9: {
                            w6v w6v2;
                            block8: {
                                n4 = t9d.b();
                                try {
                                    try {
                                        w6v2 = this.gbe;
                                        if (n4 == 0) break block8;
                                        if (w6v2 == null) break block9;
                                    }
                                    catch (oov oov2) {
                                        throw _o8.a(oov2);
                                    }
                                    w6v2 = this.gbe;
                                }
                                catch (oov oov3) {
                                    throw _o8.a(oov3);
                                }
                            }
                            n3 = w6v2.hashCode();
                            break block12;
                        }
                        n3 = 0;
                    }
                    try {
                        try {
                            n2 = n3 * 31;
                            yfc2 = this.zs3;
                            if (n4 == 0) break block10;
                            if (yfc2 == null) break block11;
                        }
                        catch (oov oov4) {
                            throw _o8.a(oov4);
                        }
                        yfc2 = this.zs3;
                    }
                    catch (oov oov5) {
                        throw _o8.a(oov5);
                    }
                }
                n = yfc2.hashCode();
                break block13;
            }
            n = 0;
        }
        return n2 + n;
    }

    public boolean equals(Object object) {
        block15: {
            boolean bl;
            block16: {
                block17: {
                    Object object2;
                    int n;
                    block14: {
                        n = t9d.c();
                        try {
                            try {
                                object2 = this;
                                if (n != 0) break block14;
                                if (object2 == object) break block15;
                            }
                            catch (oov oov2) {
                                throw _o8.a(oov2);
                            }
                            object2 = object;
                        }
                        catch (oov oov3) {
                            throw _o8.a(oov3);
                        }
                    }
                    try {
                        bl = object2 instanceof _o8;
                        if (n != 0) break block16;
                        if (!bl) break block17;
                    }
                    catch (oov oov4) {
                        throw _o8.a(oov4);
                    }
                    _o8 _o82 = (_o8)object;
                    try {
                        try {
                            try {
                                try {
                                    bl = this.gbe.equals(_o82.gbe);
                                    if (n != 0) break block16;
                                    if (!bl) break block17;
                                }
                                catch (oov oov5) {
                                    throw _o8.a(oov5);
                                }
                                bl = this.zs3.equals(_o82.zs3);
                                if (n != 0) break block16;
                            }
                            catch (oov oov6) {
                                throw _o8.a(oov6);
                            }
                            if (!bl) break block17;
                        }
                        catch (oov oov7) {
                            throw _o8.a(oov7);
                        }
                        return true;
                    }
                    catch (oov oov8) {
                        throw _o8.a(oov8);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return true;
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
        long l = a ^ 0x2899DFF38BBCL;
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
        String string = "x\\\u00f7\u00adS\u00fa1\u0091\u00ef~\u00b3\u0018\u00f0\u00cf\u00d3\u00ab \u00d5\u0002F\u00ea\u00ff\u00d1\u00d4ZU\u00f0-\u00f2sJ\u009bB\u00fb\u0087\u00fb\u001e\u00eal\u00d3X3\u00e7{B\u00f3\u00c2\b |\u008b\u0010\u00e1T\u00c2:cB't\u009a\u00dbi\u00db\u0011\u00dc\u0088\u00a3k\u00f2<j\u00eb\u00bcK\u0089\u00b0J\u00f6\u00af\u00f3";
        int n2 = "x\\\u00f7\u00adS\u00fa1\u0091\u00ef~\u00b3\u0018\u00f0\u00cf\u00d3\u00ab \u00d5\u0002F\u00ea\u00ff\u00d1\u00d4ZU\u00f0-\u00f2sJ\u009bB\u00fb\u0087\u00fb\u001e\u00eal\u00d3X3\u00e7{B\u00f3\u00c2\b |\u008b\u0010\u00e1T\u00c2:cB't\u009a\u00dbi\u00db\u0011\u00dc\u0088\u00a3k\u00f2<j\u00eb\u00bcK\u0089\u00b0J\u00f6\u00af\u00f3".length();
        int n3 = 48;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _o8.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5302;
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
                throw new RuntimeException("_o8", exception);
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
            _o8.c[n2] = _o8.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _o8.a(n, l);
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
            throw new RuntimeException("_o8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_o8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

