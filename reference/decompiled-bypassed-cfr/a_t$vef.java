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

public class a_t$vef
extends cjm {
    private a_t db4;
    private static final long a = c.a(-1135476821262514303L, 1566615569514526960L, MethodHandles.lookup().lookupClass()).a(171552205860112L);
    private static final String b;

    public a_t$vef(a_t a_t2) {
        this.db4 = a_t2;
    }

    @Override
    public boolean vle() {
        int n;
        block12: {
            block15: {
                a_t a_t2;
                int n2;
                block13: {
                    block14: {
                        block10: {
                            block11: {
                                long l = a ^ 0x1E0B89AED4F9L;
                                n2 = t9d.b();
                                try {
                                    try {
                                        a_t2 = this.db4;
                                        if (n2 == 0) break block10;
                                        if (a_t2.oay.eir()._s0(b)) break block11;
                                    }
                                    catch (oov oov2) {
                                        throw a_t$vef.a(oov2);
                                    }
                                    n = 0;
                                    break block12;
                                }
                                catch (oov oov3) {
                                    throw a_t$vef.a(oov3);
                                }
                            }
                            a_t2 = this.db4;
                        }
                        try {
                            try {
                                if (n2 == 0) break block13;
                                if (a_t2.ejt().r_y().p1r() == p3y.cei) break block14;
                            }
                            catch (oov oov4) {
                                throw a_t$vef.a(oov4);
                            }
                            n = 0;
                            break block12;
                        }
                        catch (oov oov5) {
                            throw a_t$vef.a(oov5);
                        }
                    }
                    a_t2 = this.db4;
                }
                try {
                    n = a_t2.mbr().nextInt(20);
                    if (n2 == 0) break block12;
                    if (n != 0) break block15;
                }
                catch (oov oov6) {
                    throw a_t$vef.a(oov6);
                }
                n = 1;
                break block12;
            }
            n = 0;
        }
        return n != 0;
    }

    @Override
    public void iad() {
        block4: {
            Random random = this.db4.mbr();
            t9d t9d2 = this.db4.oay;
            int n = t9d.b();
            int n2 = fe6.jqf(this.db4.o2v - 2.0 + random.nextDouble() * 4.0);
            int n3 = fe6.jqf(this.db4.kfp + random.nextDouble() * 3.0);
            int n4 = fe6.jqf(this.db4.vbd - 2.0 + random.nextDouble() * 4.0);
            mew mew2 = new mew(n2, n3, n4);
            zfz zfz2 = t9d2.getBlockState(mew2);
            e0x e0x2 = zfz2.r_y();
            try {
                boolean bl;
                try {
                    bl = a_t.mek().contains(e0x2);
                    if (n == 0 || !bl) break block4;
                }
                catch (oov oov2) {
                    throw a_t$vef.a(oov2);
                }
                this.db4.y4i(zfz2);
                bl = t9d2.gfy(mew2, ox_.ibw.l4i());
            }
            catch (oov oov3) {
                throw a_t$vef.a(oov3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x438146F78675L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("2\u000fM\u00dd\u00ea\u00e2\u00bc\u0012\u0089\u00cc\u00ca\\+O\u0088\u00a4".getBytes("ISO-8859-1"));
                b = a_t$vef.a(byArray3).intern();
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

