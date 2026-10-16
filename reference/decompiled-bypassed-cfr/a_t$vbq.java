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

public class a_t$vbq
extends cjm {
    private a_t wue;
    private static final long a = c.a(-5854210142288093349L, -4790501268049710139L, MethodHandles.lookup().lookupClass()).a(85594910172541L);
    private static final String b;

    public a_t$vbq(a_t a_t2) {
        this.wue = a_t2;
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
                                long l = a ^ 0x3F1496DC2473L;
                                n2 = t9d.b();
                                try {
                                    try {
                                        a_t2 = this.wue;
                                        if (n2 == 0) break block10;
                                        if (a_t2.oay.eir()._s0(b)) break block11;
                                    }
                                    catch (oov oov2) {
                                        throw a_t$vbq.a(oov2);
                                    }
                                    n = 0;
                                    break block12;
                                }
                                catch (oov oov3) {
                                    throw a_t$vbq.a(oov3);
                                }
                            }
                            a_t2 = this.wue;
                        }
                        try {
                            try {
                                if (n2 == 0) break block13;
                                if (a_t2.ejt().r_y().p1r() != p3y.cei) break block14;
                            }
                            catch (oov oov4) {
                                throw a_t$vbq.a(oov4);
                            }
                            n = 0;
                            break block12;
                        }
                        catch (oov oov5) {
                            throw a_t$vbq.a(oov5);
                        }
                    }
                    a_t2 = this.wue;
                }
                try {
                    n = a_t2.mbr().nextInt(2000);
                    if (n2 == 0) break block12;
                    if (n != 0) break block15;
                }
                catch (oov oov6) {
                    throw a_t$vbq.a(oov6);
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
        block5: {
            block4: {
                Random random = this.wue.mbr();
                t9d t9d2 = this.wue.oay;
                int n = fe6.jqf(this.wue.o2v - 1.0 + random.nextDouble() * 2.0);
                int n2 = fe6.jqf(this.wue.kfp + random.nextDouble() * 2.0);
                int n3 = t9d.c();
                int n4 = fe6.jqf(this.wue.vbd - 1.0 + random.nextDouble() * 2.0);
                mew mew2 = new mew(n, n2, n4);
                e0x e0x2 = t9d2.getBlockState(mew2).r_y();
                e0x e0x3 = t9d2.getBlockState(mew2.eve()).r_y();
                try {
                    boolean bl;
                    try {
                        bl = this.mrn(t9d2, mew2, this.wue.ejt().r_y(), e0x2, e0x3);
                        if (n3 != 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw a_t$vbq.a(oov2);
                    }
                    bl = t9d2.vct(mew2, this.wue.ejt(), 3);
                }
                catch (oov oov3) {
                    throw a_t$vbq.a(oov3);
                }
            }
            this.wue.y4i(ox_.ibw.l4i());
        }
    }

    private boolean mrn(t9d t9d2, mew mew2, e0x e0x2, e0x e0x3, e0x e0x4) {
        boolean bl;
        block14: {
            e0x e0x5;
            block17: {
                block18: {
                    p3y p3y2;
                    p3y p3y3;
                    block15: {
                        int n;
                        block16: {
                            e0x e0x6;
                            block12: {
                                block13: {
                                    n = t9d.c();
                                    try {
                                        try {
                                            e0x6 = e0x2;
                                            if (n != 0) break block12;
                                            if (e0x6.ctq(t9d2, mew2)) break block13;
                                        }
                                        catch (oov oov2) {
                                            throw a_t$vbq.a(oov2);
                                        }
                                        bl = false;
                                        break block14;
                                    }
                                    catch (oov oov3) {
                                        throw a_t$vbq.a(oov3);
                                    }
                                }
                                e0x6 = e0x3;
                            }
                            try {
                                try {
                                    p3y3 = e0x6.p1r();
                                    p3y2 = p3y.cei;
                                    if (n != 0) break block15;
                                    if (p3y3 == p3y2) break block16;
                                }
                                catch (oov oov4) {
                                    throw a_t$vbq.a(oov4);
                                }
                                bl = false;
                                break block14;
                            }
                            catch (oov oov5) {
                                throw a_t$vbq.a(oov5);
                            }
                        }
                        try {
                            e0x5 = e0x4;
                            if (n != 0) break block17;
                            p3y3 = e0x5.p1r();
                            p3y2 = p3y.cei;
                        }
                        catch (oov oov6) {
                            throw a_t$vbq.a(oov6);
                        }
                    }
                    try {
                        if (p3y3 != p3y2) break block18;
                        bl = false;
                        break block14;
                    }
                    catch (oov oov7) {
                        throw a_t$vbq.a(oov7);
                    }
                }
                e0x5 = e0x4;
            }
            bl = e0x5.gck();
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x2A6AB384E925L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("_\u00ef\u0012\u00a9\u001dH\u00b7\u00c3\u0014W:\u00b1p*]\t".getBytes("ISO-8859-1"));
                b = a_t$vbq.a(byArray3).intern();
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

