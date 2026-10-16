/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ap7
implements wra,
sjk {
    private final List lct = Lists.newArrayList();
    private static final long a = c.a(1209661284354416663L, -3763648811248451323L, MethodHandles.lookup().lookupClass()).a(35947894160156L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public ap7() {
        int n = t9d.b();
        c05 c052 = c05.vz1();
        for (q2m q2m2 : c052.tij.fgp().yhf()) {
            this.lct.add(new ap7$wzr(this, q2m2));
            if (n != 0) continue;
        }
    }

    @Override
    public List _ec() {
        return this.lct;
    }

    @Override
    public ekw iuh() {
        long l = a ^ 0x796ABB831974L;
        return new tao((String)((Object)ap7.a("r", (int)30037, (long)(0x4E0E5FBB120F9453L ^ l))));
    }

    @Override
    public void z9x(al9 al92) {
        al92.rg3(this);
    }

    @Override
    public ekw s34() {
        long l = a ^ 0x412BC7D929B6L;
        return new tao((String)((Object)ap7.a("r", (int)19962, (long)(0x20ACC11283261C3FL ^ l))));
    }

    @Override
    public void b6x(float f, int n) {
        c05.vz1().l22().anl(akr._rg);
        b0t.vfo(0, 0, 16.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }

    @Override
    public boolean v4p() {
        boolean bl;
        block5: {
            int n = t9d.b();
            for (sjk sjk2 : this.lct) {
                block7: {
                    boolean bl2;
                    block6: {
                        try {
                            try {
                                bl = sjk2.v4p();
                                if (n == 0) break block5;
                                if (n == 0) break block6;
                            }
                            catch (oov oov2) {
                                throw ap7.a(oov2);
                            }
                            if (!bl) break block7;
                        }
                        catch (oov oov3) {
                            throw ap7.a(oov3);
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                if (n != 0) continue;
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
        d = new HashMap(13);
        long l = a ^ 0x209FE01DD89EL;
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
        String string = "L\u0012\u0018\f\u00dd\u00e7\u00b9\u00b3a\u00e9\u008e;\u00a9\u0010\u008b\u00e9\u00f6\u00d0\u00b7\u000e:\u00a0\u00d3\u00a9\u000elZ>\u00a3\u00f5*O`\u00afz\u0007QL[xF\u00c9\u00b7\u00f6\f%\u008d\u00f9:\u0006P\u00d5H0\u00f4\u0010(7j1O\u00a0\u00c3\u009a\u00a8\u00f6t4%4Q\u001cY\b\u00fc\u009f\u0097\u00d2S\u0089\u0087\u0004-\u00dc\u00ae\u00b3\u00f6aw=\u00ecMsU\u0084\u00e4\u009f";
        int n2 = "L\u0012\u0018\f\u00dd\u00e7\u00b9\u00b3a\u00e9\u008e;\u00a9\u0010\u008b\u00e9\u00f6\u00d0\u00b7\u000e:\u00a0\u00d3\u00a9\u000elZ>\u00a3\u00f5*O`\u00afz\u0007QL[xF\u00c9\u00b7\u00f6\f%\u008d\u00f9:\u0006P\u00d5H0\u00f4\u0010(7j1O\u00a0\u00c3\u009a\u00a8\u00f6t4%4Q\u001cY\b\u00fc\u009f\u0097\u00d2S\u0089\u0087\u0004-\u00dc\u00ae\u00b3\u00f6aw=\u00ecMsU\u0084\u00e4\u009f".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ap7.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4623;
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
                throw new RuntimeException("ap7", exception);
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
            ap7.c[n2] = ap7.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ap7.a(n, l);
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
            throw new RuntimeException("ap7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ap7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

