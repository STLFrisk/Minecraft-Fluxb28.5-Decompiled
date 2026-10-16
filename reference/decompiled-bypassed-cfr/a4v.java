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
import net.minecraft.tileentity.TileEntityHopper;

public class a4v
extends rw8 {
    public static final qx_ gu0;
    public static final h76 tzd;

    public a4v() {
        super(p3y.e21, _mi.eo9);
        this.y8l(this._8_.c32().zvi(gu0, (Comparable)((Object)vt2.m3r)).zvi(tzd, Boolean.valueOf(true)));
        this.i3l(uja.yj_);
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void c7i(m5n m5n2, mew mew2) {
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void c76(t9d t9d2, mew mew2, zfz zfz2, nh4 nh42, List list, i2h i2h2) {
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
        float f = 0.125f;
        this.xl4(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
        super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
        super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
        this.xl4(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
        this.xl4(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
        super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public zfz qk_(t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3, int n, g_3 g_32) {
        vt2 vt23;
        block5: {
            vt2 vt24;
            block4: {
                int n2 = t9d.c();
                vt23 = vt22.b4b();
                try {
                    try {
                        vt24 = vt23;
                        if (n2 != 0) break block4;
                        if (vt24 != vt2.rf3) break block5;
                    }
                    catch (oov oov2) {
                        throw a4v.a(oov2);
                    }
                    vt24 = vt2.m3r;
                }
                catch (oov oov3) {
                    throw a4v.a(oov3);
                }
            }
            vt23 = vt24;
        }
        return this.l4i().zvi(gu0, (Comparable)((Object)vt23)).zvi(tzd, Boolean.valueOf(true));
    }

    @Override
    public pyk ie9(t9d t9d2, int n) {
        return new TileEntityHopper();
    }

    @Override
    public void qh0(t9d t9d2, mew mew2, zfz zfz2, g_3 g_32, erg erg2) {
        block6: {
            int n = t9d.c();
            super.qh0(t9d2, mew2, zfz2, g_32, erg2);
            if (erg2.x4w()) {
                pyk pyk2;
                block5: {
                    pyk pyk3 = t9d2.getTileEntity(mew2);
                    try {
                        try {
                            pyk2 = pyk3;
                            if (n != 0) break block5;
                            if (!(pyk2 instanceof TileEntityHopper)) break block6;
                        }
                        catch (oov oov2) {
                            throw a4v.a(oov2);
                        }
                        pyk2 = pyk3;
                    }
                    catch (oov oov3) {
                        throw a4v.a(oov3);
                    }
                }
                ((TileEntityHopper)pyk2).owa(erg2.zow());
            }
        }
    }

    @Override
    public void tfc(t9d t9d2, mew mew2, zfz zfz2) {
        this.isv(t9d2, mew2, zfz2);
    }

    @Override
    public boolean cl2(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92, vt2 vt22, float f, float f2, float f3) {
        boolean bl;
        block10: {
            block11: {
                t9d t9d3;
                int n;
                block8: {
                    block9: {
                        n = t9d.c();
                        try {
                            try {
                                t9d3 = t9d2;
                                if (n != 0) break block8;
                                if (!t9d3.v0f) break block9;
                            }
                            catch (oov oov2) {
                                throw a4v.a(oov2);
                            }
                            return true;
                        }
                        catch (oov oov3) {
                            throw a4v.a(oov3);
                        }
                    }
                    t9d3 = t9d2;
                }
                pyk pyk2 = t9d3.getTileEntity(mew2);
                try {
                    try {
                        bl = pyk2 instanceof TileEntityHopper;
                        if (n != 0) break block10;
                        if (!bl) break block11;
                    }
                    catch (oov oov4) {
                        throw a4v.a(oov4);
                    }
                    ha92.a_o((TileEntityHopper)pyk2);
                    ha92.aex(l9p.x79);
                }
                catch (oov oov5) {
                    throw a4v.a(oov5);
                }
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        this.isv(t9d2, mew2, zfz2);
    }

    private void isv(t9d t9d2, mew mew2, zfz zfz2) {
        block8: {
            boolean bl;
            int n;
            block6: {
                block7: {
                    n = t9d.b();
                    try {
                        bl = t9d2.gxo(mew2);
                        if (n == 0) break block6;
                        if (bl) break block7;
                    }
                    catch (oov oov2) {
                        throw a4v.a(oov2);
                    }
                    bl = true;
                    break block6;
                }
                bl = false;
            }
            boolean bl2 = bl;
            try {
                boolean bl3;
                try {
                    bl3 = bl2;
                    if (n == 0 || bl3 == (Boolean)zfz2.dil(tzd)) break block8;
                }
                catch (oov oov3) {
                    throw a4v.a(oov3);
                }
                bl3 = t9d2.vct(mew2, zfz2.zvi(tzd, Boolean.valueOf(bl2)), 4);
            }
            catch (oov oov4) {
                throw a4v.a(oov4);
            }
        }
    }

    @Override
    public void b8f(t9d t9d2, mew mew2, zfz zfz2) {
        block4: {
            block5: {
                int n = t9d.b();
                pyk pyk2 = t9d2.getTileEntity(mew2);
                try {
                    try {
                        if (n == 0) break block4;
                        if (!(pyk2 instanceof TileEntityHopper)) break block5;
                    }
                    catch (oov oov2) {
                        throw a4v.a(oov2);
                    }
                    py1.hkj(t9d2, mew2, (TileEntityHopper)pyk2);
                    t9d2.lw8(mew2, this);
                }
                catch (oov oov3) {
                    throw a4v.a(oov3);
                }
            }
            super.b8f(t9d2, mew2, zfz2);
        }
    }

    @Override
    public int kfj() {
        return 3;
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public boolean ron(m5n m5n2, mew mew2, vt2 vt22) {
        return true;
    }

    public static vt2 fb4(int n) {
        return vt2.jw6(n & 7);
    }

    public static boolean wu4(int n) {
        boolean bl;
        block4: {
            block5: {
                int n2 = t9d.b();
                try {
                    try {
                        bl = n & 8;
                        if (n2 == 0) break block4;
                        if (bl) break block5;
                    }
                    catch (oov oov2) {
                        throw a4v.a(oov2);
                    }
                    bl = true;
                    break block4;
                }
                catch (oov oov3) {
                    throw a4v.a(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public boolean ge5() {
        return true;
    }

    @Override
    public int mya(t9d t9d2, mew mew2) {
        return _jc.nuj(t9d2.getTileEntity(mew2));
    }

    @Override
    public w51 w3x() {
        return w51.oja;
    }

    @Override
    public zfz kig(int n) {
        return this.l4i().zvi(gu0, (Comparable)((Object)a4v.fb4(n))).zvi(tzd, Boolean.valueOf(a4v.wu4(n)));
    }

    @Override
    public int hvp(zfz zfz2) {
        int n;
        block2: {
            int n2;
            block3: {
                n2 = 0;
                n2 |= ((vt2)((Object)zfz2.dil(gu0))).c3s();
                int n3 = t9d.c();
                try {
                    n = ((Boolean)zfz2.dil(tzd)).booleanValue();
                    if (n3 != 0) break block2;
                    if (n != 0) break block3;
                }
                catch (oov oov2) {
                    throw a4v.a(oov2);
                }
                n2 |= 8;
            }
            n = n2;
        }
        return n;
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{gu0, tzd});
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-7613030100103452532L, 2683325696930862045L, MethodHandles.lookup().lookupClass()).a(101843808039452L) ^ 0x649AE921A8E9L;
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
        String string = "7~\u00c0\u00c3\u00e1\u0007EJ\b\u00fb\u009b\no\u0002O\u00be\u001e";
        int n2 = "7~\u00c0\u00c3\u00e1\u0007EJ\b\u00fb\u009b\no\u0002O\u00be\u001e".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = a4v.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                gu0 = qx_.q0o(stringArray2[1], new a4v$1());
                tzd = h76.d_1(stringArray2[0]);
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

