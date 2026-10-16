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

public class fp0
implements gnj {
    private static final /* synthetic */ gdz ueb;
    private final /* synthetic */ tt7 e65;

    public fp0(tt7 tt72) {
        this.e65 = tt72;
    }

    public void xyl(fcs fcs2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n;
        block6: {
            block7: {
                int n2;
                block4: {
                    block5: {
                        this.e65.gu4(ueb);
                        hzu.spd();
                        hzu.vtj();
                        hzu.ru7(1, 1);
                        hzu.fpt();
                        hzu.d14(514);
                        int n3 = 61680;
                        int n4 = n3 % 65536;
                        int n5 = n3 / 65536;
                        n2 = t9d.c();
                        try {
                            gis.w9e(gis.exn, (float)n4 / 1.0f, (float)n5 / 1.0f);
                            hzu.s7q();
                            hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
                            n = hxt.ly3();
                            if (n2 != 0) break block4;
                            if (n == 0) break block5;
                        }
                        catch (oov oov2) {
                            throw fp0.a(oov2);
                        }
                        Shaders.beginSpiderEyes();
                    }
                    hxt.hm6().oun = true;
                    this.e65.fy4().s_q(fcs2, f, f2, f4, f5, f6, f7);
                    hxt.hm6().oun = false;
                    n = hxt.ly3() ? 1 : 0;
                }
                try {
                    if (n2 != 0) break block6;
                    if (n == 0) break block7;
                }
                catch (oov oov3) {
                    throw fp0.a(oov3);
                }
                Shaders.endSpiderEyes();
            }
            this.e65.r22(fcs2, f3);
            hzu.ux6();
            hzu.if9();
            n = 515;
        }
        hzu.d14(n);
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

    @Override
    public void doRenderLayer(g_3 g_32, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.xyl((fcs)g_32, f, f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(8222886294676623409L, -4970631234628852579L, MethodHandles.lookup().lookupClass()).a(125702449352672L) ^ 0x40972291203BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("h\u0092iz\u00e1\u0000\u0089\u000fI\u007f\u0015\u0016\u00dd<D\u00a1\u00bby\u00be\u0091q\u0099\u00b1+\u00d4\u008f\u0015 \u00afW\u0005\u0099\u0011\u008f\u008a\u009a\u00c9>\u00ba\u0005\u0002\u009e\u00e0\u0001OKH\u00b7".getBytes("ISO-8859-1"));
                String string = fp0.a(byArray3).intern();
                ueb = new gdz(string);
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

