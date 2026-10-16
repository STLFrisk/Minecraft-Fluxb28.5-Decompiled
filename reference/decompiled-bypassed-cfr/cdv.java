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

public class cdv
extends gbe {
    private final /* synthetic */ ar7 jwv;
    private final /* synthetic */ gbe tqz;
    private static final long a = c.a(-1690071979324536586L, 3327204476383308832L, MethodHandles.lookup().lookupClass()).a(243405233819433L);
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public cdv(ar7 ar72, gbe gbe2) {
        this.jwv = ar72;
        this.tqz = gbe2;
    }

    @Override
    public void dig(char c2, int n) {
        int n2;
        int n3;
        block17: {
            block18: {
                int n4;
                block15: {
                    block16: {
                        n4 = t9d.c();
                        try {
                            try {
                                super.dig(c2, n);
                                n3 = n;
                                n2 = 1;
                                if (n4 != 0) break block15;
                                if (n3 != n2) break block16;
                            }
                            catch (oov oov2) {
                                throw cdv.a(oov2);
                            }
                            this.f41.z2i(this.tqz);
                        }
                        catch (oov oov3) {
                            throw cdv.a(oov3);
                        }
                    }
                    n3 = n;
                    n2 = 1;
                }
                try {
                    try {
                        try {
                            try {
                                if (n4 != 0) break block17;
                                if (n3 == n2) break block18;
                            }
                            catch (oov oov4) {
                                throw cdv.a(oov4);
                            }
                            n3 = n;
                            n2 = 211;
                            if (n4 != 0) break block17;
                        }
                        catch (oov oov5) {
                            throw cdv.a(oov5);
                        }
                        if (n3 == n2) break block18;
                    }
                    catch (oov oov6) {
                        throw cdv.a(oov6);
                    }
                    this.jwv.nm8(n);
                    zwr.qkk.up0().j02();
                    this.f41.z2i(this.tqz);
                }
                catch (oov oov7) {
                    throw cdv.a(oov7);
                }
            }
            n3 = n;
            n2 = 211;
        }
        try {
            if (n3 == n2) {
                this.jwv.nm8(0);
                zwr.qkk.up0().j02();
                this.f41.z2i(this.tqz);
            }
        }
        catch (oov oov8) {
            throw cdv.a(oov8);
        }
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        long l = a ^ 0x7FB9C1FC75B7L;
        this.xmz();
        this.poi(this.fex, (String)((Object)cdv.b("h", (int)8573, (long)(0x4E301A1C46350206L ^ l))) + (Object)((Object)syo.iyk) + this.jwv.m2d(), this.dt7 / 2, 150, 0xFFFFFF);
        this.poi(this.fex, (String)((Object)cdv.b("h", (int)30058, (long)(0x46C3A605C2BED610L ^ l))), this.dt7 / 2, 170, 0xFFFFFF);
        super.drawScreen(n, n2, f);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        h = new HashMap(13);
        long l = a ^ 0x4D955A063463L;
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
        String string = "\u0016\u00b1\u00b3\u00c5\u008e\u00c3E\u009a\u00c5\u00a2 \u00857\u00ffZq\u00a3\u0091\b\u009e\u00cf!\u00d3\u00bd\u00f97\u00b0@\u00d8\u00f8\u00bd\u008du\u001b\u0089$xD$\u0006@\u0003N\u009a\u00ac\u00c1\u00a9=_\u00ef6\u00aa\u0083\u008b\u0085\u00bc\u0090\u00e6\u0095\u0081\u00f50\u00bf\u00c2\u00b0c\u000f-\u00d6\u0080\u000f\u00ffvX&\u00a6\u00d2d\u0003;\u00d5\u00f3\t\u0088Z\u00a1\u0010K\u00cb\u009f\u00f4\u0081\u00ca\u00c2\u00c6\u00cel\u00af\u00d1\u0080k\u00b9\u0097V\u00bc";
        int n2 = "\u0016\u00b1\u00b3\u00c5\u008e\u00c3E\u009a\u00c5\u00a2 \u00857\u00ffZq\u00a3\u0091\b\u009e\u00cf!\u00d3\u00bd\u00f97\u00b0@\u00d8\u00f8\u00bd\u008du\u001b\u0089$xD$\u0006@\u0003N\u009a\u00ac\u00c1\u00a9=_\u00ef6\u00aa\u0083\u008b\u0085\u00bc\u0090\u00e6\u0095\u0081\u00f50\u00bf\u00c2\u00b0c\u000f-\u00d6\u0080\u000f\u00ffvX&\u00a6\u00d2d\u0003;\u00d5\u00f3\t\u0088Z\u00a1\u0010K\u00cb\u009f\u00f4\u0081\u00ca\u00c2\u00c6\u00cel\u00af\u00d1\u0080k\u00b9\u0097V\u00bc".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = cdv.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                g = new String[2];
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x349;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("cdv", exception);
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
            cdv.g[n2] = cdv.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cdv.b(n, l);
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
            throw new RuntimeException("cdv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cdv.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

