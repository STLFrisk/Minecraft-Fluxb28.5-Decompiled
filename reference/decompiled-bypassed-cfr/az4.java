/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class az4 {
    public List hhs = new ArrayList();
    private static final long a = c.a(2962491380417168415L, 4006326603926141492L, MethodHandles.lookup().lookupClass()).a(265305438743551L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Unable to fully structure code
     */
    public void nig(String var1_1, String var2_2, String var3_3, String var4_4) {
        block11: {
            var5_5 = az4.a ^ 133604334538498L;
            var7_6 = t9d.c();
            var1_1 = var1_1.replaceAll((String)az4.a("q", (int)16456, (long)(3833991224584815978L ^ var5_5)), "");
            try {
                v0 = this.ocr(var1_1);
                if (var7_6 != 0) break block11;
                if (v0) {
                }
                ** GOTO lbl28
            }
            catch (oov v1) {
                throw az4.a(v1);
            }
            for (var8_7 = 0; var8_7 < this.hhs.size(); ++var8_7) {
                try {
                    try {
                        v2 = var1_1;
                        if (var7_6 != 0 || !v2.equals(((nny)this.hhs.get((int)var8_7)).qlc)) continue;
                    }
                    catch (oov v3) {
                        throw az4.a(v3);
                    }
                    v2 = this.hhs.set(var8_7, new nny(var1_1, var2_2, var3_3, var4_4));
                    continue;
                }
                catch (oov v4) {
                    throw az4.a(v4);
                }
            }
            try {
                if (var7_6 == 0) break block11;
lbl28:
                // 2 sources

                v0 = this.hhs.add(new nny(var1_1, var2_2, var3_3, var4_4));
            }
            catch (oov v5) {
                throw az4.a(v5);
            }
        }
    }

    public void csq(String string) {
        int n;
        int n2;
        block7: {
            int n3;
            block8: {
                long l = a ^ 0x68C37C73A93DL;
                n2 = t9d.b();
                string = string.replaceAll((String)((Object)az4.a("q", (int)16456, (long)(0x353503F4C7C2E355L ^ l))), "");
                try {
                    n3 = this.ocr(string);
                    if (n2 == 0) break block7;
                    if (n3 != 0) break block8;
                }
                catch (oov oov2) {
                    throw az4.a(oov2);
                }
                return;
            }
            n3 = n = 0;
        }
        while (n < this.hhs.size()) {
            block9: {
                try {
                    String string2;
                    try {
                        string2 = string;
                        if (n2 == 0 || !string2.equals(((nny)this.hhs.get((int)n)).qlc)) break block9;
                    }
                    catch (oov oov3) {
                        throw az4.a(oov3);
                    }
                    string2 = this.hhs.remove(n);
                }
                catch (oov oov4) {
                    throw az4.a(oov4);
                }
            }
            ++n;
            if (n2 != 0) continue;
        }
    }

    public boolean ocr(String string) {
        boolean bl;
        block8: {
            block9: {
                nny nny2;
                int n;
                block6: {
                    block7: {
                        long l = a ^ 0x71387648D41EL;
                        n = t9d.b();
                        string = string.replaceAll((String)((Object)az4.a("q", (int)9545, (long)(0x6ED2AA88113F7B76L ^ l))), "");
                        try {
                            try {
                                nny2 = this.wk6(string);
                                if (n == 0) break block6;
                                if (nny2 != null) break block7;
                            }
                            catch (oov oov2) {
                                throw az4.a(oov2);
                            }
                            return false;
                        }
                        catch (oov oov3) {
                            throw az4.a(oov3);
                        }
                    }
                    nny2 = this.wk6(string);
                }
                String string2 = nny2.n2t();
                try {
                    bl = string2.equals("");
                    if (n == 0) break block8;
                    if (bl) break block9;
                }
                catch (oov oov4) {
                    throw az4.a(oov4);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public String wu0(String string) {
        String string2;
        az4 az42;
        block4: {
            block5: {
                long l = a ^ 0x2C74C39E4589L;
                int n = t9d.b();
                string = string.replaceAll((String)((Object)az4.a("q", (int)16456, (long)(0x35354743782F0FE1L ^ l))), "");
                try {
                    try {
                        az42 = this;
                        string2 = string;
                        if (n == 0) break block4;
                        if (az42.ocr(string2)) break block5;
                    }
                    catch (oov oov2) {
                        throw az4.a(oov2);
                    }
                    return "";
                }
                catch (oov oov3) {
                    throw az4.a(oov3);
                }
            }
            az42 = this;
            string2 = string;
        }
        return az42.wk6(string2).n2t();
    }

    private nny wk6(String string) {
        long l = a ^ 0x473993D7B857L;
        string = string.replaceAll((String)((Object)az4.a("q", (int)16456, (long)(0x35352C0E2866F23FL ^ l))), "");
        int n = t9d.c();
        for (int i = 0; i < this.hhs.size(); ++i) {
            String string2;
            block5: {
                try {
                    try {
                        string2 = string;
                        if (n != 0) break block5;
                        if (!string2.equals(((nny)this.hhs.get((int)i)).qlc)) continue;
                    }
                    catch (oov oov2) {
                        throw az4.a(oov2);
                    }
                    string2 = this.hhs.get(i);
                }
                catch (oov oov3) {
                    throw az4.a(oov3);
                }
            }
            return (nny)((Object)string2);
        }
        return null;
    }

    public void ku3(String string) {
        int n = t9d.b();
        for (int i = 0; i < this.hhs.size(); ++i) {
            try {
                String string2;
                try {
                    string2 = string;
                    if (n == 0 || !string2.equals(((nny)this.hhs.get((int)i)).jm6)) continue;
                }
                catch (oov oov2) {
                    throw az4.a(oov2);
                }
                string2 = this.hhs.remove(i);
                continue;
            }
            catch (oov oov3) {
                throw az4.a(oov3);
            }
        }
    }

    public List lo7() {
        return this.hhs;
    }

    public void ug8(List list) {
        this.hhs = list;
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
        long l = a ^ 0x4B742FDB3796L;
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
        String string = "\u0017~\u008cy\u00fbq\u009d1\u00c3\u00d0\u00d7u\u0013;\u0001\u0088\u0010\u00cem[\u00e9\u00cas\u00f6\u0096\u009fn\u0016\u001b\u00e8\u0019\u00dc\u0084";
        int n2 = "\u0017~\u008cy\u00fbq\u009d1\u00c3\u00d0\u00d7u\u0013;\u0001\u0088\u0010\u00cem[\u00e9\u00cas\u00f6\u0096\u009fn\u0016\u001b\u00e8\u0019\u00dc\u0084".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = az4.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x478E;
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
                throw new RuntimeException("az4", exception);
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
            az4.c[n2] = az4.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = az4.a(n, l);
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
            throw new RuntimeException("az4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(az4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

