/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
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

public class bgg
extends gdw {
    private /* synthetic */ String wlg;
    private static final long a = c.a(6990135299912396954L, 3668405584495331342L, MethodHandles.lookup().lookupClass()).a(207724855509429L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public bgg() {
        this.wlg = "";
    }

    public bgg(String string) {
        long l = a ^ 0x4A4C31C35A53L;
        this.wlg = string;
        if (string == null) {
            throw new IllegalArgumentException((String)((Object)bgg.a("n", (int)21011, (long)(0xC81D0012DF017A9L ^ l))));
        }
    }

    @Override
    public void b_8(DataOutput dataOutput) {
        dataOutput.writeUTF(this.wlg);
    }

    @Override
    public void zwk(DataInput dataInput, int n, btc btc2) {
        btc2.es9(288L);
        this.wlg = dataInput.readUTF();
        btc2.es9(16 * this.wlg.length());
    }

    @Override
    public byte ky0() {
        return 8;
    }

    @Override
    public String toString() {
        long l = a ^ 0x529CAD4A7D37L;
        return "\"" + this.wlg.replace("\"", (CharSequence)((Object)bgg.a("n", (int)32536, (long)(0x36EFFCDF90079DC7L ^ l)))) + "\"";
    }

    @Override
    public gdw h33() {
        return new bgg(this.wlg);
    }

    @Override
    public boolean dq5() {
        return this.wlg.isEmpty();
    }

    @Override
    public boolean equals(Object object) {
        boolean bl;
        block25: {
            block24: {
                block22: {
                    String string;
                    bgg bgg2;
                    int n;
                    block23: {
                        block20: {
                            bgg bgg3;
                            block18: {
                                block19: {
                                    n = t9d.c();
                                    try {
                                        try {
                                            bgg3 = this;
                                            if (n != 0) break block18;
                                            if (super.equals(object)) break block19;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw bgg.a(illegalArgumentException);
                                        }
                                        return false;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw bgg.a(illegalArgumentException);
                                    }
                                }
                                bgg3 = (bgg)object;
                            }
                            bgg2 = bgg3;
                            try {
                                block21: {
                                    try {
                                        try {
                                            try {
                                                string = this.wlg;
                                                if (n != 0) break block20;
                                                if (string != null) break block21;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw bgg.a(illegalArgumentException);
                                            }
                                            string = bgg2.wlg;
                                            if (n != 0) break block20;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw bgg.a(illegalArgumentException);
                                        }
                                        if (string == null) break block22;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw bgg.a(illegalArgumentException);
                                    }
                                }
                                string = this.wlg;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw bgg.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                if (n != 0) break block23;
                                if (string == null) break block24;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw bgg.a(illegalArgumentException);
                            }
                            string = this.wlg;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw bgg.a(illegalArgumentException);
                        }
                    }
                    try {
                        bl = string.equals(bgg2.wlg);
                        if (n != 0) break block25;
                        if (!bl) break block24;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw bgg.a(illegalArgumentException);
                    }
                }
                bl = true;
                break block25;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.wlg.hashCode();
    }

    @Override
    public String ocr() {
        return this.wlg;
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
        long l = a ^ 0x24BD75247898L;
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
        String string = "\u00c37\u00eb\u0086\u00dbc\u008e\u0094\u00cf\u00ca\u001d\u001b\u00c7\u0010\u00f0\f8\u001e&\u0084W3\u0016\u00c3T\u00abq:V[5\u00dc\bW\u00de\n\u00a7_4\u00e7K\u0010\u00e2\u00c5\u00f4\u00a0\u0012\u009a\u00daC\u00e6\u00ba\u00ee\u001d\u009d\u00c9!\u00b5\u00e3#q/\u00d7\u00fc\u00e4\u00c0\u001fs\u00d0FUT\u00f7";
        int n2 = "\u00c37\u00eb\u0086\u00dbc\u008e\u0094\u00cf\u00ca\u001d\u001b\u00c7\u0010\u00f0\f8\u001e&\u0084W3\u0016\u00c3T\u00abq:V[5\u00dc\bW\u00de\n\u00a7_4\u00e7K\u0010\u00e2\u00c5\u00f4\u00a0\u0012\u009a\u00daC\u00e6\u00ba\u00ee\u001d\u009d\u00c9!\u00b5\u00e3#q/\u00d7\u00fc\u00e4\u00c0\u001fs\u00d0FUT\u00f7".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = bgg.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String b(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4F36;
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
                throw new RuntimeException("bgg", exception);
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
            bgg.c[n2] = bgg.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bgg.a(n, l);
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
            throw new RuntimeException("bgg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bgg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

