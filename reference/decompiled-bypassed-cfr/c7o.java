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

public class c7o
extends ofh {
    public i2h tje;
    private /* synthetic */ boolean ph0;
    private static final long a = c.a(-1309672535504495525L, -4964774463427355552L, MethodHandles.lookup().lookupClass()).a(92180755128400L);
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    public c7o(String string, i2h i2h2) {
        super(string);
        this.ph0 = false;
        this.tje = i2h2;
    }

    public c7o ach() {
        this.ph0 = true;
        return this;
    }

    public boolean tkn() {
        return this.ph0;
    }

    @Override
    public i2h nra() {
        return this.tje;
    }

    @Override
    public ekw ny3(g_3 g_32) {
        hsu hsu2;
        block17: {
            String string;
            block15: {
                boolean bl;
                String string2;
                erg erg2;
                block16: {
                    erg erg3;
                    int n;
                    block14: {
                        erg erg4;
                        long l;
                        block18: {
                            block13: {
                                i2h i2h2;
                                block12: {
                                    l = a ^ 0x531E2E75BBA5L;
                                    n = t9d.b();
                                    try {
                                        try {
                                            i2h2 = this.tje;
                                            if (n == 0) break block12;
                                            if (!(i2h2 instanceof g_3)) break block13;
                                        }
                                        catch (oov oov2) {
                                            throw c7o.a(oov2);
                                        }
                                        i2h2 = this.tje;
                                    }
                                    catch (oov oov3) {
                                        throw c7o.a(oov3);
                                    }
                                }
                                erg4 = ((g_3)i2h2).tsc();
                                break block18;
                            }
                            erg4 = null;
                        }
                        erg2 = erg4;
                        string = (String)((Object)c7o.b("b", (int)3088, (long)(0x6BFFFB83A2592CE7L ^ l))) + this.rfm;
                        string2 = string + (String)((Object)c7o.b("b", (int)8647, (long)(0x53668D36C41F8131L ^ l)));
                        try {
                            erg3 = erg2;
                            if (n == 0) break block14;
                            if (erg3 == null) break block15;
                        }
                        catch (oov oov4) {
                            throw c7o.a(oov4);
                        }
                        erg3 = erg2;
                    }
                    try {
                        try {
                            bl = erg3.x4w();
                            if (n == 0) break block16;
                            if (!bl) break block15;
                        }
                        catch (oov oov5) {
                            throw c7o.a(oov5);
                        }
                        bl = orr.okp(string2);
                    }
                    catch (oov oov6) {
                        throw c7o.a(oov6);
                    }
                }
                try {
                    if (!bl) break block15;
                    hsu2 = new hsu(string2, new Object[]{g_32.xyw(), this.tje.xyw(), erg2.lob()});
                    break block17;
                }
                catch (oov oov7) {
                    throw c7o.a(oov7);
                }
            }
            hsu2 = new hsu(string, new Object[]{g_32.xyw(), this.tje.xyw()});
        }
        return hsu2;
    }

    @Override
    public boolean li9() {
        boolean bl;
        block13: {
            block11: {
                int n;
                block12: {
                    i2h i2h2;
                    block10: {
                        n = t9d.c();
                        try {
                            try {
                                i2h2 = this.tje;
                                if (n != 0) break block10;
                                if (i2h2 == null) break block11;
                            }
                            catch (oov oov2) {
                                throw c7o.a(oov2);
                            }
                            i2h2 = this.tje;
                        }
                        catch (oov oov3) {
                            throw c7o.a(oov3);
                        }
                    }
                    try {
                        try {
                            bl = i2h2 instanceof g_3;
                            if (n != 0) break block12;
                            if (!bl) break block11;
                        }
                        catch (oov oov4) {
                            throw c7o.a(oov4);
                        }
                        bl = this.tje instanceof ha9;
                    }
                    catch (oov oov5) {
                        throw c7o.a(oov5);
                    }
                }
                try {
                    if (n != 0) break block13;
                    if (bl) break block11;
                }
                catch (oov oov6) {
                    throw c7o.a(oov6);
                }
                bl = true;
                break block13;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        i = new HashMap(13);
        long l = a ^ 0x3F9C5AC23330L;
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
        String string = "\u00ee\u00d5\u0010r\u0091\u00c1<}.=_\t\u00b3\u007fZ\u0098u\u0095\u00a5A\u00a2[\u009b\u00cc\u008f\u0002\u00fe\u00eb\u00cf:j0\u0010\u001a\u00fe\t\u00f2\u00bf<\u00e32^\u0001o\u00e7QDCd";
        int n2 = "\u00ee\u00d5\u0010r\u0091\u00c1<}.=_\t\u00b3\u007fZ\u0098u\u0095\u00a5A\u00a2[\u009b\u00cc\u008f\u0002\u00fe\u00eb\u00cf:j0\u0010\u001a\u00fe\t\u00f2\u00bf<\u00e32^\u0001o\u00e7QDCd".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = c7o.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                g = stringArray;
                h = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4F28;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("c7o", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            c7o.h[n2] = c7o.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = c7o.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("c7o" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c7o.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

