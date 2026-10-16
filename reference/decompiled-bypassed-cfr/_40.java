/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.shaders.Shaders;

public class _40
implements gnj {
    private static final /* synthetic */ gdz usb;
    private final /* synthetic */ dnm vby;

    public _40(dnm dnm2) {
        this.vby = dnm2;
    }

    public void med(a_t a_t2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        boolean bl;
        block10: {
            block11: {
                int n;
                block8: {
                    block9: {
                        boolean bl2;
                        block6: {
                            block7: {
                                this.vby.gu4(usb);
                                int n2 = t9d.b();
                                hzu.spd();
                                hzu.vtj();
                                hzu.ru7(1, 1);
                                n = n2;
                                try {
                                    hzu.fpt();
                                    bl2 = a_t2.h5u();
                                    if (n == 0) break block6;
                                    if (bl2) break block7;
                                }
                                catch (oov oov2) {
                                    throw _40.a(oov2);
                                }
                                bl2 = true;
                                break block6;
                            }
                            bl2 = false;
                        }
                        hzu.jun(bl2);
                        int n3 = 61680;
                        int n4 = n3 % 65536;
                        int n5 = n3 / 65536;
                        try {
                            gis.w9e(gis.exn, (float)n4 / 1.0f, (float)n5 / 1.0f);
                            hzu.s7q();
                            hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
                            bl = hxt.ly3();
                            if (n == 0) break block8;
                            if (!bl) break block9;
                        }
                        catch (oov oov3) {
                            throw _40.a(oov3);
                        }
                        Shaders.beginSpiderEyes();
                    }
                    hxt.hm6().oun = true;
                    this.vby.fy4().s_q(a_t2, f, f2, f4, f5, f6, f7);
                    hxt.hm6().oun = false;
                    bl = hxt.ly3();
                }
                try {
                    if (n == 0) break block10;
                    if (!bl) break block11;
                }
                catch (oov oov4) {
                    throw _40.a(oov4);
                }
                Shaders.endSpiderEyes();
            }
            this.vby.r22(a_t2, f3);
            bl = true;
        }
        hzu.jun(bl);
        hzu.ux6();
        hzu.if9();
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

    @Override
    public void doRenderLayer(g_3 g_32, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.med((a_t)g_32, f, f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(8841015070081241456L, 858092904595631694L, MethodHandles.lookup().lookupClass()).a(174906474930190L) ^ 0x6417AEFF064BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0013*\u00ec_\u00cb\u00c6l%n\u0084$(\u00885O\u00ed\u00eaf]\u00d3b:Cb\u00c2P\u00bb\u0017\u00e0$\b\u0005\u0011*%\u00d4\u0016{S\u0093\u0095)\u00d2e\u00de\u00b9\u00f7W".getBytes("ISO-8859-1"));
                String string = _40.a(byArray3).intern();
                usb = new gdz(string);
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

