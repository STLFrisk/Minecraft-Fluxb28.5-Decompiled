/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.Multimap;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class arf
extends u7m {
    private Set _24;
    public float qng = 4.0f;
    public float mqh;
    public u7m$vz9 yjw;
    private static final long a = c.a(-7976740200353098594L, -2697215696909819518L, MethodHandles.lookup().lookupClass()).a(66814312700310L);
    private static final String b;

    public arf(float f, u7m$vz9 u7m$vz9, Set set) {
        this.yjw = u7m$vz9;
        this._24 = set;
        this.vgp = 1;
        this.rlr(u7m$vz9.sqv());
        this.qng = u7m$vz9.kv9();
        this.mqh = f + u7m$vz9.zua();
        this.qfy(uja.zip);
    }

    @Override
    public float v1f(erg erg2, e0x e0x2) {
        float f;
        block6: {
            block5: {
                arf arf2;
                block4: {
                    int n = t9d.b();
                    try {
                        try {
                            arf2 = this;
                            if (n == 0) break block4;
                            if (!arf2._24.contains(e0x2)) break block5;
                        }
                        catch (oov oov2) {
                            throw arf.a(oov2);
                        }
                        arf2 = this;
                    }
                    catch (oov oov3) {
                        throw arf.a(oov3);
                    }
                }
                f = arf2.qng;
                break block6;
            }
            f = 1.0f;
        }
        return f;
    }

    @Override
    public boolean gtk(erg erg2, g_3 g_32, g_3 g_33) {
        erg2.ybw(2, g_33);
        return true;
    }

    @Override
    public boolean ziu(erg erg2, t9d t9d2, e0x e0x2, mew mew2, g_3 g_32) {
        double d;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        double d2 = (double)e0x2.wnt(t9d2, mew2) - 0.0;
                        d = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                        if (n != 0) break block4;
                        if (d == false) break block5;
                    }
                    catch (oov oov2) {
                        throw arf.a(oov2);
                    }
                    erg2.ybw(1, g_32);
                }
                catch (oov oov3) {
                    throw arf.a(oov3);
                }
            }
            d = 1.0;
        }
        return (boolean)d;
    }

    @Override
    public boolean t0m() {
        return true;
    }

    public u7m$vz9 mc4() {
        return this.yjw;
    }

    @Override
    public int k7x() {
        return this.yjw.pmc();
    }

    public String y5n() {
        return this.yjw.toString();
    }

    @Override
    public boolean nur(erg erg2, erg erg3) {
        boolean bl;
        block6: {
            arf arf2;
            block4: {
                block5: {
                    int n = t9d.b();
                    try {
                        try {
                            arf2 = this;
                            if (n == 0) break block4;
                            if (arf2.yjw.jw6() != erg3.gn1()) break block5;
                        }
                        catch (oov oov2) {
                            throw arf.a(oov2);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw arf.a(oov3);
                    }
                }
                arf2 = this;
            }
            bl = super.nur(erg2, erg3);
        }
        return bl;
    }

    @Override
    public Multimap hv4() {
        long l = a ^ 0x6080EAA55FE5L;
        Multimap multimap = super.hv4();
        multimap.put((Object)m6d.y3f.ugh(), (Object)new xk5(lz8, b, this.mqh, 0));
        return multimap;
    }

    public float ogh() {
        return this.qng;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x77C3FD63DBF9L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("f\u001d\u00cai\u0016\u00fdK\u001f\u00cc\u0004#\u00daewF\u00e8".getBytes("ISO-8859-1"));
                b = arf.b(byArray3).intern();
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

