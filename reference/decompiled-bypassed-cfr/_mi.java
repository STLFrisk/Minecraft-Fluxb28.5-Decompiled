/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _mi {
    public static final _mi[] ijo;
    public static final _mi _b5;
    public static final _mi g21;
    public static final _mi e0k;
    public static final _mi cjr;
    public static final _mi e38;
    public static final _mi w3f;
    public static final _mi niv;
    public static final _mi inj;
    public static final _mi e5e;
    public static final _mi qji;
    public static final _mi pzg;
    public static final _mi eo9;
    public static final _mi hvl;
    public static final _mi uwd;
    public static final _mi xxi;
    public static final _mi vbr;
    public static final _mi hkk;
    public static final _mi l7h;
    public static final _mi _qi;
    public static final _mi ipp;
    public static final _mi en2;
    public static final _mi qjf;
    public static final _mi v97;
    public static final _mi p8k;
    public static final _mi bzo;
    public static final _mi xyu;
    public static final _mi c36;
    public static final _mi oxf;
    public static final _mi v0s;
    public static final _mi xas;
    public static final _mi bm2;
    public static final _mi zfs;
    public static final _mi d8h;
    public static final _mi atg;
    public static final _mi _bd;
    public static final _mi l5z;
    public int eon;
    public final int bav;
    private static final long a;
    private static final String b;

    private /* synthetic */ _mi(int n, int n2) {
        long l = a ^ 0x41933C803507L;
        if (n >= 0) {
            try {
                if (n <= 63) {
                    this.bav = n;
                    this.eon = n2;
                    _mi.ijo[n] = this;
                }
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw _mi.a(indexOutOfBoundsException);
            }
        }
        throw new IndexOutOfBoundsException(b);
    }

    public int ghu(int n) {
        int n2;
        int n3;
        block14: {
            block15: {
                int n4;
                block13: {
                    int n5;
                    block11: {
                        block12: {
                            block9: {
                                block10: {
                                    n4 = t9d.b();
                                    n3 = 220;
                                    try {
                                        n2 = n;
                                        n5 = 3;
                                        if (n4 == 0) break block9;
                                        if (n2 != n5) break block10;
                                    }
                                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                        throw _mi.a(indexOutOfBoundsException);
                                    }
                                    n3 = 135;
                                }
                                n2 = n;
                                n5 = 2;
                            }
                            try {
                                if (n4 == 0) break block11;
                                if (n2 != n5) break block12;
                            }
                            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                throw _mi.a(indexOutOfBoundsException);
                            }
                            n3 = 255;
                        }
                        try {
                            n2 = n;
                            if (n4 == 0) break block13;
                            n5 = 1;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                            throw _mi.a(indexOutOfBoundsException);
                        }
                    }
                    if (n2 == n5) {
                        n3 = 220;
                    }
                    n2 = n;
                }
                try {
                    if (n4 == 0) break block14;
                    if (n2 != 0) break block15;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw _mi.a(indexOutOfBoundsException);
                }
                n3 = 180;
            }
            n2 = (this.eon >> 16 & 0xFF) * n3 / 255;
        }
        int n6 = n2;
        int n7 = (this.eon >> 8 & 0xFF) * n3 / 255;
        int n8 = (this.eon & 0xFF) * n3 / 255;
        return 0xFF000000 | n6 << 16 | n7 << 8 | n8;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(-2565757287743061976L, -6547064256699060334L, MethodHandles.lookup().lookupClass()).a(13289520211362L);
        long l = a ^ 0x2A579083EF48L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00d9\u00db\u00fa\u00ee\u009b\u00f1\u00ecF\u00f96\u0084\u009d\u00ef\u00fev\u008cKs\u00fe\u00dd\u00b8B\u00cc,\u0015\u000f\u00d4\u00eci\u00a1U~\u00b03h\u00a0o\u00e5\u00e1\\\u0099\u007f.\u00b2\u00a3){\u00fb\u00b2\f\u00a7\u00a0\u00fa\u00e7\u00a2\u00fe".getBytes("ISO-8859-1"));
                b = _mi.a(byArray3).intern();
                ijo = new _mi[64];
                _b5 = new _mi(0, 0);
                g21 = new _mi(1, 8368696);
                e0k = new _mi(2, 16247203);
                cjr = new _mi(3, 0xC7C7C7);
                e38 = new _mi(4, 0xFF0000);
                w3f = new _mi(5, 0xA0A0FF);
                niv = new _mi(6, 0xA7A7A7);
                inj = new _mi(7, 31744);
                e5e = new _mi(8, 0xFFFFFF);
                qji = new _mi(9, 10791096);
                pzg = new _mi(10, 9923917);
                eo9 = new _mi(11, 0x707070);
                hvl = new _mi(12, 0x4040FF);
                uwd = new _mi(13, 9402184);
                xxi = new _mi(14, 0xFFFCF5);
                vbr = new _mi(15, 14188339);
                hkk = new _mi(16, 11685080);
                l7h = new _mi(17, 6724056);
                _qi = new _mi(18, 0xE5E533);
                ipp = new _mi(19, 8375321);
                en2 = new _mi(20, 15892389);
                qjf = new _mi(21, 0x4C4C4C);
                v97 = new _mi(22, 0x999999);
                p8k = new _mi(23, 5013401);
                bzo = new _mi(24, 8339378);
                xyu = new _mi(25, 3361970);
                c36 = new _mi(26, 6704179);
                oxf = new _mi(27, 6717235);
                v0s = new _mi(28, 0x993333);
                xas = new _mi(29, 0x191919);
                bm2 = new _mi(30, 16445005);
                zfs = new _mi(31, 6085589);
                d8h = new _mi(32, 4882687);
                atg = new _mi(33, 55610);
                _bd = new _mi(34, 8476209);
                l5z = new _mi(35, 0x700200);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
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
}

