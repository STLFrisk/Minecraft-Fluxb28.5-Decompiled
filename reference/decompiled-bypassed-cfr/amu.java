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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class amu
extends f8k {
    public static final h76 znu;
    public static final _ku hec;
    private static final long b;
    private static final String[] d;
    private static final String[] h;
    private static final Map i;

    public amu(boolean bl) {
        super(bl);
        this.y8l(this._8_.c32().zvi(em9, (Comparable)((Object)vt2.z9q)).zvi(hec, Integer.valueOf(1)).zvi(znu, Boolean.valueOf(false)));
    }

    @Override
    public String ieu() {
        long l = b ^ 0x64FF4A7E3FAEL;
        return orr.zgh((String)((Object)amu.b("d", (int)19290, (long)(0x3710A684F64DB9E5L ^ l))));
    }

    @Override
    public zfz w1b(zfz zfz2, m5n m5n2, mew mew2) {
        return zfz2.zvi(znu, Boolean.valueOf(this.vfl(m5n2, mew2, zfz2)));
    }

    @Override
    public boolean cl2(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92, vt2 vt22, float f, float f2, float f3) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        bl = ha92.lls.x4a;
                        if (n != 0) break block4;
                        if (bl) break block5;
                    }
                    catch (oov oov2) {
                        throw amu.a(oov2);
                    }
                    return false;
                }
                catch (oov oov3) {
                    throw amu.a(oov3);
                }
            }
            t9d2.vct(mew2, zfz2.dm4(hec), 3);
            bl = true;
        }
        return bl;
    }

    @Override
    public int hqm(zfz zfz2) {
        return (Integer)zfz2.dil(hec) * 2;
    }

    @Override
    public zfz ip_(zfz zfz2) {
        Integer n = (Integer)zfz2.dil(hec);
        Boolean bl = (Boolean)zfz2.dil(znu);
        vt2 vt22 = (vt2)((Object)zfz2.dil(em9));
        return ox_.duh.l4i().zvi(em9, (Comparable)((Object)vt22)).zvi(hec, n).zvi(znu, bl);
    }

    @Override
    public zfz woc(zfz zfz2) {
        Integer n = (Integer)zfz2.dil(hec);
        Boolean bl = (Boolean)zfz2.dil(znu);
        vt2 vt22 = (vt2)((Object)zfz2.dil(em9));
        return ox_.r0f.l4i().zvi(em9, (Comparable)((Object)vt22)).zvi(hec, n).zvi(znu, bl);
    }

    @Override
    public u7m j39(zfz zfz2, Random random, int n) {
        return xbr.us0;
    }

    @Override
    public u7m su9(t9d t9d2, mew mew2) {
        return xbr.us0;
    }

    @Override
    public boolean vfl(m5n m5n2, mew mew2, zfz zfz2) {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    bl = this.snu(m5n2, mew2, zfz2);
                    if (n != 0) break block2;
                    if (bl <= false) break block3;
                }
                catch (oov oov2) {
                    throw amu.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public boolean qi0(e0x e0x2) {
        return amu.r25(e0x2);
    }

    @Override
    public void kyo(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        int n = t9d.b();
        if (this.d5w) {
            float f;
            double d;
            double d2;
            double d3;
            vt2 vt22;
            block3: {
                block4: {
                    vt22 = (vt2)((Object)zfz2.dil(em9));
                    d3 = (double)((float)mew2.getX() + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
                    d2 = (double)((float)mew2.getY() + 0.4f) + (double)(random.nextFloat() - 0.5f) * 0.2;
                    d = (double)((float)mew2.getZ() + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
                    f = -5.0f;
                    try {
                        if (n == 0) break block3;
                        if (!random.nextBoolean()) break block4;
                    }
                    catch (oov oov2) {
                        throw amu.a(oov2);
                    }
                    f = (Integer)zfz2.dil(hec) * 2 - 1;
                }
                f /= 16.0f;
            }
            double d4 = f * (float)vt22.n67();
            double d5 = f * (float)vt22.ozy();
            t9d2.zvy(w_0.dyc, d3 + d4, d2, d + d5, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public void b8f(t9d t9d2, mew mew2, zfz zfz2) {
        super.b8f(t9d2, mew2, zfz2);
        this.fow(t9d2, mew2, zfz2);
    }

    @Override
    public zfz kig(int n) {
        return this.l4i().zvi(em9, (Comparable)((Object)vt2.bm6(n))).zvi(znu, Boolean.valueOf(false)).zvi(hec, Integer.valueOf(1 + (n >> 2)));
    }

    @Override
    public int hvp(zfz zfz2) {
        int n = 0;
        n |= ((vt2)((Object)zfz2.dil(em9))).tmy();
        return n |= (Integer)zfz2.dil(hec) - 1 << 2;
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{em9, hec, znu});
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        b = c.a(2658771222773621770L, 6678915477070562091L, MethodHandles.lookup().lookupClass()).a(261403592360007L);
        long l = b ^ 0x1B9F0D6E35E4L;
        i = new HashMap(13);
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
        String string = "\u0013\u00d7b2\u00a3\u00d2\u00e5\u009c\u00e5\u00d8\u00f9\u001d\u00d3zx\u00ff\u0004\u00f0\u001a\u009a\u0017\u00bc\u00e6\u00a4\u0010\u0003\u00d7\u00ce\u0090g\u0097\u00f7\u00bfB\\I\u0002\u00c3P\u00d2.\u0010\u00b8\u001f#w_\u00a4\u00a4\u0018\u00d1\u00b6x\u000b\u0091\u0012g\u00ef";
        int n2 = "\u0013\u00d7b2\u00a3\u00d2\u00e5\u009c\u00e5\u00d8\u00f9\u001d\u00d3zx\u00ff\u0004\u00f0\u001a\u009a\u0017\u00bc\u00e6\u00a4\u0010\u0003\u00d7\u00ce\u0090g\u0097\u00f7\u00bfB\\I\u0002\u00c3P\u00d2.\u0010\u00b8\u001f#w_\u00a4\u00a4\u0018\u00d1\u00b6x\u000b\u0091\u0012g\u00ef".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = amu.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                h = new String[3];
                znu = h76.d_1((String)((Object)amu.b("d", (int)7217, (long)(0x38C91A4D4EA9E4C6L ^ l))));
                hec = _ku.wgl((String)((Object)amu.b("d", (int)6759, (long)(0x5A881270FD5E293L ^ l))), 1, 4);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String c(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x49D8;
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
                throw new RuntimeException("amu", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            amu.h[n2] = amu.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = amu.b(n, l);
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
            throw new RuntimeException("amu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(amu.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

