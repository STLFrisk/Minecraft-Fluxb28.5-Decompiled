/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.CustomColors;

public class bpv
implements gnj {
    private static final /* synthetic */ gdz koz;
    private final /* synthetic */ _0w kxx;

    public bpv(_0w _0w2) {
        this.kxx = _0w2;
    }

    public void xon(gse gse2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        block11: {
            block13: {
                float[] fArray;
                block14: {
                    int n;
                    int n2;
                    block12: {
                        block10: {
                            n2 = t9d.b();
                            try {
                                try {
                                    n = gse2.j1j();
                                    if (n2 == 0) break block10;
                                    if (n == 0) break block11;
                                }
                                catch (oov oov2) {
                                    throw bpv.a(oov2);
                                }
                                n = gse2.h5u();
                            }
                            catch (oov oov3) {
                                throw bpv.a(oov3);
                            }
                        }
                        try {
                            try {
                                if (n2 == 0) break block12;
                                if (n != 0) break block11;
                            }
                            catch (oov oov4) {
                                throw bpv.a(oov4);
                            }
                            this.kxx.gu4(koz);
                            n = gse2.lwj().hoo();
                        }
                        catch (oov oov5) {
                            throw bpv.a(oov5);
                        }
                    }
                    qvg qvg2 = qvg.hup(n);
                    fArray = ia2.kn7(qvg2);
                    try {
                        if (n2 == 0) break block13;
                        if (!hxt.xe2()) break block14;
                    }
                    catch (oov oov6) {
                        throw bpv.a(oov6);
                    }
                    fArray = CustomColors.getWolfCollarColors(qvg2, fArray);
                }
                hzu.oxa(fArray[0], fArray[1], fArray[2]);
            }
            this.kxx.fy4().s_q(gse2, f, f2, f4, f5, f6, f7);
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return true;
    }

    @Override
    public void doRenderLayer(g_3 g_32, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.xon((gse)g_32, f, f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(6407777019785210499L, -8644501056772496823L, MethodHandles.lookup().lookupClass()).a(152892551929843L) ^ 0x67926B09DAEL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("z\\b\u00a0\u0016@\u00d0\u00e4\u008f0\u0018\u00b9\u0091\u0089\u0088\u00b2\u00e4\u00b8\u00a5\u00e3dH=\u009c\u00a7q\u000f\u00b5~\u00cf\u008dN\u00d8\u00a5%\u00fa\u009a}.4".getBytes("ISO-8859-1"));
                String string = bpv.a(byArray3).intern();
                koz = new gdz(string);
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

