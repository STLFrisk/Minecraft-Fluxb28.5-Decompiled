/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a01
extends gyu {
    private boolean zsz;
    private vg1 z_n = new vg1();
    private h_q upn = new h_q(4);
    private static final long a = c.a(579884544495492934L, -3170325442042291727L, MethodHandles.lookup().lookupClass()).a(57062110487778L);
    private static final String f;

    public a01(int n, boolean bl) {
        super(n);
        this.zsz = bl;
        if (bl) {
            this.ke4 = ox_._mc.l4i();
        }
        this.c1d.clear();
    }

    @Override
    public void u0r(t9d t9d2, Random random, mew mew2) {
        block13: {
            a01 a012;
            block10: {
                block11: {
                    int n;
                    int n2;
                    int n3;
                    int n4;
                    block12: {
                        n4 = t9d.b();
                        try {
                            a012 = this;
                            if (n4 == 0) break block10;
                            if (!a012.zsz) break block11;
                        }
                        catch (oov oov2) {
                            throw a01.a(oov2);
                        }
                        for (n3 = 0; n3 < 3; ++n3) {
                            n2 = random.nextInt(16) + 8;
                            n = random.nextInt(16) + 8;
                            try {
                                this.z_n.v3g(t9d2, random, t9d2.p9y(mew2.ec4(n2, 0, n)));
                                if (n4 != 0) {
                                    if (n4 != 0) continue;
                                    break;
                                }
                                break block12;
                            }
                            catch (oov oov3) {
                                throw a01.a(oov3);
                            }
                        }
                        n3 = 0;
                    }
                    while (n3 < 2) {
                        n2 = random.nextInt(16) + 8;
                        n = random.nextInt(16) + 8;
                        try {
                            this.upn.v3g(t9d2, random, t9d2.p9y(mew2.ec4(n2, 0, n)));
                            ++n3;
                            if (n4 != 0) {
                                if (n4 != 0) continue;
                                break;
                            }
                            break block13;
                        }
                        catch (oov oov4) {
                            throw a01.a(oov4);
                        }
                    }
                }
                a012 = this;
            }
            super.u0r(t9d2, random, mew2);
        }
    }

    @Override
    public e9q jk9(Random random) {
        return new lkp(false);
    }

    @Override
    public gyu hiq(int n) {
        long l = a ^ 0x17216823B368L;
        gyu gyu2 = new a01(n, true).cq8(0xD2FFFF, true).cb4(this.jcq + f).apv().j10(0.0f, 0.5f).wzy(new gyu$ekk(this.f6x + 0.1f, this.yeh + 0.1f));
        gyu2.f6x = this.f6x + 0.3f;
        gyu2.yeh = this.yeh + 0.4f;
        return gyu2;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x6E7F03EA9134L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0086\u009a\u000e\u00f3m,\u00ce\u000b".getBytes("ISO-8859-1"));
                f = a01.b(byArray3).intern();
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

