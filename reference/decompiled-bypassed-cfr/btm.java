/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class btm
extends e0x {
    public static final zb_ juo;

    public btm() {
        super(p3y.n7o);
        this.y8l(this._8_.c32().zvi(juo, (Comparable)((Object)qvg.ft3)));
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
        this._p_(true);
        this.i3l(uja.qqf);
        this.ogp(0);
    }

    @Override
    public _mi uoz(zfz zfz2) {
        return ((qvg)((Object)zfz2.dil(juo))).f0q();
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public void bf6() {
        this.ogp(0);
    }

    @Override
    public void c7i(m5n m5n2, mew mew2) {
        this.ogp(0);
    }

    public void ogp(int n) {
        int n2 = 0;
        float f = (float)(1 * (1 + n2)) / 16.0f;
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, f, 1.0f);
    }

    @Override
    public boolean ctq(t9d t9d2, mew mew2) {
        boolean bl;
        block8: {
            block7: {
                int n;
                block6: {
                    n = t9d.b();
                    try {
                        try {
                            bl = super.ctq(t9d2, mew2);
                            if (n == 0) break block6;
                            if (!bl) break block7;
                        }
                        catch (oov oov2) {
                            throw btm.a(oov2);
                        }
                        bl = this.nie(t9d2, mew2);
                    }
                    catch (oov oov3) {
                        throw btm.a(oov3);
                    }
                }
                try {
                    if (n == 0) break block8;
                    if (!bl) break block7;
                }
                catch (oov oov4) {
                    throw btm.a(oov4);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        this.d8r(t9d2, mew2, zfz2);
    }

    private boolean d8r(t9d t9d2, mew mew2, zfz zfz2) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        bl = this.nie(t9d2, mew2);
                        if (n != 0) break block4;
                        if (bl) break block5;
                    }
                    catch (oov oov2) {
                        throw btm.a(oov2);
                    }
                    this.lf0(t9d2, mew2, zfz2, 0);
                    t9d2.i6x(mew2);
                    return false;
                }
                catch (oov oov3) {
                    throw btm.a(oov3);
                }
            }
            bl = true;
        }
        return bl;
    }

    private boolean nie(t9d t9d2, mew mew2) {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    bl = t9d2.isAirBlock(mew2.eve());
                    if (n != 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw btm.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public boolean ron(m5n m5n2, mew mew2, vt2 vt22) {
        boolean bl;
        try {
            bl = vt22 == vt2.rf3 ? true : super.ron(m5n2, mew2, vt22);
        }
        catch (oov oov2) {
            throw btm.a(oov2);
        }
        return bl;
    }

    @Override
    public int crg(zfz zfz2) {
        return ((qvg)((Object)zfz2.dil(juo))).hoo();
    }

    @Override
    public void m1q(u7m u7m2, uja uja2, List list) {
        int n = t9d.c();
        for (int i = 0; i < 16; ++i) {
            list.add(new erg(u7m2, 1, i));
            if (n == 0) continue;
        }
    }

    @Override
    public zfz kig(int n) {
        return this.l4i().zvi(juo, (Comparable)((Object)qvg.hup(n)));
    }

    @Override
    public int hvp(zfz zfz2) {
        return ((qvg)((Object)zfz2.dil(juo))).hoo();
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{juo});
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-5286419635152562576L, -6834932429157650677L, MethodHandles.lookup().lookupClass()).a(269151006902104L) ^ 0x1D947FB8EB9AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u000f\r\u00f5\u00c4H\u00da\u00e2\u000f".getBytes("ISO-8859-1"));
                String string = btm.b(byArray3).intern();
                juo = zb_.pq4(string, qvg.class);
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
}

