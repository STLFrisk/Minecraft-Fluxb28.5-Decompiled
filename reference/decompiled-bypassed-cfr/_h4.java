/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _h4
extends bq2 {
    public static final zb_ msa;

    public _h4() {
        super(p3y.fdu);
        this.i3l(uja.mqu);
        this.q6h(2.0f);
        this.t4k(l18);
    }

    @Override
    public void b8f(t9d t9d2, mew mew2, zfz zfz2) {
        int n = 4;
        int n2 = n + 1;
        int n3 = t9d.b();
        if (t9d2.o2i(mew2.ec4(-n2, -n2, -n2), mew2.ec4(n2, n2, n2))) {
            for (mew mew3 : mew.kil(mew2.ec4(-n, -n, -n), mew2.ec4(n, n, n))) {
                block11: {
                    zfz zfz3;
                    zfz zfz4;
                    block10: {
                        zfz4 = t9d2.getBlockState(mew3);
                        try {
                            try {
                                zfz3 = zfz4;
                                if (n3 == 0) break block10;
                                if (zfz3.r_y().p1r() != p3y.hh1) break block11;
                            }
                            catch (oov oov2) {
                                throw _h4.a(oov2);
                            }
                            zfz3 = zfz4;
                        }
                        catch (oov oov3) {
                            throw _h4.a(oov3);
                        }
                    }
                    try {
                        boolean bl;
                        try {
                            bl = (Boolean)zfz3.dil(_cv.sdu);
                            if (n3 == 0 || bl) break block11;
                        }
                        catch (oov oov4) {
                            throw _h4.a(oov4);
                        }
                        bl = t9d2.vct(mew3, zfz4.zvi(_cv.sdu, Boolean.valueOf(true)), 4);
                    }
                    catch (oov oov5) {
                        throw _h4.a(oov5);
                    }
                }
                if (n3 != 0) continue;
            }
        }
    }

    @Override
    public zfz qk_(t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3, int n, g_3 g_32) {
        return super.qk_(t9d2, mew2, vt22, f, f2, f3, n, g_32).zvi(msa, (Comparable)((Object)_h4$i61.ckj(vt22.e30())));
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-4522512064643258243L, 6669856086607323286L, MethodHandles.lookup().lookupClass()).a(161017178451557L) ^ 0x509327E25CC8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal(" \u00c5\u00caj\u00ea\u0088 6".getBytes("ISO-8859-1"));
                String string = _h4.c(byArray3).intern();
                msa = zb_.pq4(string, _h4$i61.class);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
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
}

