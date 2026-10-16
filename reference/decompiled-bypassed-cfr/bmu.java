/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class bmu
extends ar7 {
    private static final long a = c.a(-8727534583444342624L, -3370751348211453503L, MethodHandles.lookup().lookupClass()).a(177486610682165L);
    private static final String f;

    public bmu() {
        long l = a ^ 0x5102D5E0E43CL;
        super(f, _aj.sxc, false, new j1s[0]);
    }

    @jev
    private void up8(_ts _ts2) {
        this.qf_();
    }

    private void qf_() {
        block22: {
            int n;
            int n2;
            int n3;
            block23: {
                int n4;
                block20: {
                    int n5;
                    block18: {
                        block19: {
                            n3 = t9d.c();
                            try {
                                n5 = bmu.ek1.oxn.i_y;
                                if (n3 != 0) break block18;
                                if (n5 == 0) break block19;
                            }
                            catch (oov oov2) {
                                throw bmu.a(oov2);
                            }
                            return;
                        }
                        hzu._o4();
                        hzu.jun(false);
                        hzu.u39(0, 769, 1, 0);
                        n5 = (int)(bmu.ek1.vg8.i55() / bmu.ek1.vg8.axb() * 100.0f);
                    }
                    n4 = n5;
                    try {
                        block21: {
                            try {
                                try {
                                    n2 = n4;
                                    n = 10;
                                    if (n3 != 0) break block20;
                                    if (n2 > n) break block21;
                                }
                                catch (oov oov3) {
                                    throw bmu.a(oov3);
                                }
                                GL11.glColor4f((float)0.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                                if (n3 == 0) break block22;
                            }
                            catch (oov oov4) {
                                throw bmu.a(oov4);
                            }
                        }
                        n2 = n4;
                        n = 20;
                    }
                    catch (oov oov5) {
                        throw bmu.a(oov5);
                    }
                }
                try {
                    block24: {
                        try {
                            try {
                                if (n3 != 0) break block23;
                                if (n2 > n) break block24;
                            }
                            catch (oov oov6) {
                                throw bmu.a(oov6);
                            }
                            GL11.glColor4f((float)0.0f, (float)0.8f, (float)0.8f, (float)1.0f);
                            if (n3 == 0) break block22;
                        }
                        catch (oov oov7) {
                            throw bmu.a(oov7);
                        }
                    }
                    n2 = n4;
                    n = 50;
                }
                catch (oov oov8) {
                    throw bmu.a(oov8);
                }
            }
            try {
                block25: {
                    try {
                        if (n2 > n) break block25;
                        GL11.glColor4f((float)0.0f, (float)0.5f, (float)0.5f, (float)1.0f);
                        if (n3 == 0) break block22;
                    }
                    catch (oov oov9) {
                        throw bmu.a(oov9);
                    }
                }
                GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
            }
            catch (oov oov10) {
                throw bmu.a(oov10);
            }
        }
        eka eka2 = new eka(ek1);
        ek1.l22().anl(d1f.wau);
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl._r5);
        q3g2.g5o(0.0, eka2.lrx(), -90.0).h0a(0.0, 1.0).pzw();
        q3g2.g5o(eka2.x05(), eka2.lrx(), -90.0).h0a(1.0, 1.0).pzw();
        q3g2.g5o(eka2.x05(), 0.0, -90.0).h0a(1.0, 0.0).pzw();
        q3g2.g5o(0.0, 0.0, -90.0).h0a(0.0, 0.0).pzw();
        jom2.q7g();
        hzu.jun(true);
        hzu.m45();
        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
        hzu.u39(770, 771, 1, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x2248BE2505E4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ec\u0085\u00cciU\u00b8 \u008f\u008b\u00ff\f\u0092\u00e6\u00ee\u0082\u0004".getBytes("ISO-8859-1"));
                f = bmu.b(byArray3).intern();
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

