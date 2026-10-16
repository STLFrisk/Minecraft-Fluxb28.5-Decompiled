/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bjx
extends e0x {
    public static final qx_ d0q;
    public static final h76 i1i;

    public bjx() {
        super(p3y.zs8, _mi.oxf);
        this.y8l(this._8_.c32().zvi(d0q, (Comparable)((Object)vt2.z9q)).zvi(i1i, Boolean.valueOf(false)));
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public void bf6() {
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
    }

    @Override
    public void c76(t9d t9d2, mew mew2, zfz zfz2, nh4 nh42, List list, i2h i2h2) {
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
                        super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
                        if (n == 0) break block4;
                        if (!((Boolean)t9d2.getBlockState(mew2).dil(i1i)).booleanValue()) break block5;
                    }
                    catch (oov oov2) {
                        throw bjx.a(oov2);
                    }
                    this.xl4(0.3125f, 0.8125f, 0.3125f, 0.6875f, 1.0f, 0.6875f);
                    super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
                }
                catch (oov oov3) {
                    throw bjx.a(oov3);
                }
            }
            this.bf6();
        }
    }

    @Override
    public u7m j39(zfz zfz2, Random random, int n) {
        return null;
    }

    @Override
    public zfz qk_(t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3, int n, g_3 g_32) {
        return this.l4i().zvi(d0q, (Comparable)((Object)g_32.u0f().b4b())).zvi(i1i, Boolean.valueOf(false));
    }

    @Override
    public boolean ge5() {
        return true;
    }

    @Override
    public int mya(t9d t9d2, mew mew2) {
        int n;
        block2: {
            block3: {
                int n2 = t9d.c();
                try {
                    n = ((Boolean)t9d2.getBlockState(mew2).dil(i1i)).booleanValue();
                    if (n2 != 0) break block2;
                    if (n == 0) break block3;
                }
                catch (oov oov2) {
                    throw bjx.a(oov2);
                }
                n = 15;
                break block2;
            }
            n = 0;
        }
        return n;
    }

    @Override
    public zfz kig(int n) {
        boolean bl;
        h76 h762;
        zfz zfz2;
        block2: {
            block3: {
                int n2 = t9d.c();
                try {
                    zfz2 = this.l4i();
                    h762 = i1i;
                    bl = n & 4;
                    if (n2 != 0) break block2;
                    if (!bl) break block3;
                }
                catch (oov oov2) {
                    throw bjx.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return zfz2.zvi(h762, Boolean.valueOf(bl)).zvi(d0q, (Comparable)((Object)vt2.bm6(n & 3)));
    }

    @Override
    public int hvp(zfz zfz2) {
        int n;
        block2: {
            int n2;
            block3: {
                n2 = 0;
                n2 |= ((vt2)((Object)zfz2.dil(d0q))).tmy();
                int n3 = t9d.c();
                try {
                    n = ((Boolean)zfz2.dil(i1i)).booleanValue();
                    if (n3 != 0) break block2;
                    if (n == 0) break block3;
                }
                catch (oov oov2) {
                    throw bjx.a(oov2);
                }
                n2 |= 4;
            }
            n = n2;
        }
        return n;
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{d0q, i1i});
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(2035933309601231792L, -201362156414795187L, MethodHandles.lookup().lookupClass()).a(198037344003888L) ^ 0x53EA13F7D8C3L;
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
        String string = "\u0011\u00df\u0084\u00ca\u0001\u00e0\u00e0?\b;6w\u0016\u00f0\b\u00dfW";
        int n2 = "\u0011\u00df\u0084\u00ca\u0001\u00e0\u00e0?\b;6w\u0016\u00f0\b\u00dfW".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = bjx.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                d0q = qx_.q0o(stringArray2[0], vt2$unz.fzl);
                i1i = h76.d_1(stringArray2[1]);
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
}

