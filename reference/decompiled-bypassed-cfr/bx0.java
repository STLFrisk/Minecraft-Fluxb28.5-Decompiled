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

public class bx0
extends e0x {
    public static final zb_ nln;
    public static final h76 g1_;

    public bx0() {
        super(p3y.v19);
        this.y8l(this._8_.c32().zvi(nln, (Comparable)((Object)bx0$b_z.rg3)).zvi(g1_, Boolean.valueOf(false)));
        this.i3l(uja.mqu);
    }

    @Override
    public _mi uoz(zfz zfz2) {
        return ((bx0$b_z)((Object)zfz2.dil(nln))).vf1();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public zfz w1b(zfz var1_1, m5n var2_2, mew var3_3) {
        block9: {
            block10: {
                block13: {
                    block12: {
                        block11: {
                            var4_4 = t9d.c();
                            try {
                                v0 = var1_1;
                                if (var4_4 != 0) break block9;
                                if (v0.dil(bx0.nln) != bx0$b_z.sos) break block10;
                            }
                            catch (oov v1) {
                                throw bx0.a(v1);
                            }
                            var5_5 = var2_2.getBlockState(var3_3.nuv()).r_y();
                            try {
                                try {
                                    v2 = var1_1;
                                    v3 = bx0.g1_;
                                    v4 = var5_5;
                                    v5 = ox_._mc;
                                    if (var4_4 != 0) break block11;
                                    if (v4 != v5) {
                                    }
                                    ** GOTO lbl30
                                }
                                catch (oov v6) {
                                    throw bx0.a(v6);
                                }
                                v4 = var5_5;
                                v5 = ox_.dxo;
                            }
                            catch (oov v7) {
                                throw bx0.a(v7);
                            }
                        }
                        try {
                            if (v4 != v5) break block12;
lbl30:
                            // 2 sources

                            v8 = true;
                            break block13;
                        }
                        catch (oov v9) {
                            throw bx0.a(v9);
                        }
                    }
                    v8 = false;
                }
                var1_1 = v2.zvi(v3, Boolean.valueOf(v8));
            }
            v0 = var1_1;
        }
        return v0;
    }

    @Override
    public void m1q(u7m u7m2, uja uja2, List list) {
        list.add(new erg(this, 1, bx0$b_z.rg3.d74()));
        list.add(new erg(this, 1, bx0$b_z.ryg.d74()));
        list.add(new erg(this, 1, bx0$b_z.sos.d74()));
    }

    @Override
    public int qu2(t9d t9d2, mew mew2) {
        int n;
        block6: {
            zfz zfz2;
            block4: {
                zfz zfz3;
                block5: {
                    int n2 = t9d.b();
                    zfz3 = t9d2.getBlockState(mew2);
                    try {
                        try {
                            zfz2 = zfz3;
                            if (n2 == 0) break block4;
                            if (zfz2.r_y() == this) break block5;
                        }
                        catch (oov oov2) {
                            throw bx0.a(oov2);
                        }
                        n = 0;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw bx0.a(oov3);
                    }
                }
                zfz2 = zfz3;
            }
            n = ((bx0$b_z)((Object)zfz2.dil(nln))).d74();
        }
        return n;
    }

    @Override
    public zfz kig(int n) {
        return this.l4i().zvi(nln, (Comparable)((Object)bx0$b_z.brn(n)));
    }

    @Override
    public int hvp(zfz zfz2) {
        return ((bx0$b_z)((Object)zfz2.dil(nln))).d74();
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{nln, g1_});
    }

    @Override
    public int crg(zfz zfz2) {
        bx0$b_z bx0$b_z;
        block2: {
            bx0$b_z bx0$b_z2;
            block3: {
                int n = t9d.b();
                bx0$b_z2 = (bx0$b_z)((Object)zfz2.dil(nln));
                try {
                    bx0$b_z = bx0$b_z2;
                    if (n == 0) break block2;
                    if (bx0$b_z != bx0$b_z.sos) break block3;
                }
                catch (oov oov2) {
                    throw bx0.a(oov2);
                }
                bx0$b_z2 = bx0$b_z.rg3;
            }
            bx0$b_z = bx0$b_z2;
        }
        return bx0$b_z.d74();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-703032574056136044L, -7799083414255748435L, MethodHandles.lookup().lookupClass()).a(208614309810563L) ^ 0x574F1542683BL;
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
        String string = "\u00ab\u00b2\u009eR\u0000\u008c\u0013-\b\u00bd\u0087F\u009b\u00c0\u0004I\u0017";
        int n2 = "\u00ab\u00b2\u009eR\u0000\u008c\u0013-\b\u00bd\u0087F\u009b\u00c0\u0004I\u0017".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = bx0.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                nln = zb_.pq4(stringArray2[0], bx0$b_z.class);
                g1_ = h76.d_1(stringArray2[1]);
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

