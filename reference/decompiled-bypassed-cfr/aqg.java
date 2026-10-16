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

public class aqg
extends upn {
    private static final long a = c.a(-7385853370940680974L, -7213588043017461127L, MethodHandles.lookup().lookupClass()).a(91442199713226L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    @Override
    public void kyv() {
        this._c8 = new h06(gyu.phb, 0.0f);
        this.o5k = 1;
        this.thh = true;
    }

    @Override
    public g6k ska() {
        return new l8w(this.d3t, this.d3t.x2p());
    }

    @Override
    public float lju(long l, float f) {
        return 0.0f;
    }

    @Override
    public float[] sjt(float f, float f2) {
        return null;
    }

    @Override
    public fqr mnc(float f, float f2) {
        int n = 0xA080A0;
        float f3 = fe6.ssk(f * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        f3 = fe6._f3(f3, 0.0f, 1.0f);
        float f4 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f5 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f6 = (float)(n & 0xFF) / 255.0f;
        return new fqr(f4 *= f3 * 0.0f + 0.15f, f5 *= f3 * 0.0f + 0.15f, f6 *= f3 * 0.0f + 0.15f);
    }

    @Override
    public boolean t8l() {
        return false;
    }

    @Override
    public boolean vm6() {
        return false;
    }

    @Override
    public boolean cws() {
        return false;
    }

    @Override
    public float x66() {
        return 8.0f;
    }

    @Override
    public boolean au7(int n, int n2) {
        return this.d3t.koz(new mew(n, 0, n2)).p1r().c3t();
    }

    @Override
    public mew iw9() {
        return new mew(100, 50, 0);
    }

    @Override
    public int z9e() {
        return 50;
    }

    @Override
    public boolean c2o(int n, int n2) {
        return true;
    }

    @Override
    public String gby() {
        long l = a ^ 0x46D8D64AE111L;
        return aqg.a("g", (int)31349, (long)(0x17FB4A5750B483D9L ^ l));
    }

    @Override
    public String org() {
        long l = a ^ 0x571F4454054AL;
        return aqg.a("g", (int)14037, (long)(0x362DF24A92052B23L ^ l));
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
        long l = a ^ 0x5869B30F3F8FL;
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
        String string = " \u00fa\n9X\u00e9)\u00e4@\u00da\u00b8\u0080\u00a7\u009c\u00fa\u00be\u0010s\u00fb\u00e3\u009f\u0007v\u00d9\u00a0\u009cqBi\u00a6\u00e1\u000f\u0092";
        int n2 = " \u00fa\n9X\u00e9)\u00e4@\u00da\u00b8\u0080\u00a7\u009c\u00fa\u00be\u0010s\u00fb\u00e3\u009f\u0007v\u00d9\u00a0\u009cqBi\u00a6\u00e1\u000f\u0092".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = aqg.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4FAD;
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
                throw new RuntimeException("aqg", exception);
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
            aqg.c[n2] = aqg.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = aqg.a(n, l);
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
            throw new RuntimeException("aqg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(aqg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

