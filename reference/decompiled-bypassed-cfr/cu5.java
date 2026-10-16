/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cu5
implements gnj {
    private static final /* synthetic */ gdz gc0;
    private final /* synthetic */ _35 ghy;
    private final /* synthetic */ rno g9z;

    public cu5(_35 _352) {
        this.g9z = new rno(0.5f);
        this.ghy = _352;
    }

    public void a8_(ju8 ju82, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        block7: {
            boolean bl;
            block8: {
                block9: {
                    int n;
                    block6: {
                        n = t9d.c();
                        try {
                            try {
                                bl = ju82.kvl();
                                if (n != 0) break block6;
                                if (!bl) break block7;
                            }
                            catch (oov oov2) {
                                throw cu5.a(oov2);
                            }
                            bl = ju82.h5u();
                        }
                        catch (oov oov3) {
                            throw cu5.a(oov3);
                        }
                    }
                    try {
                        if (n != 0) break block8;
                        if (bl) break block9;
                    }
                    catch (oov oov4) {
                        throw cu5.a(oov4);
                    }
                    bl = true;
                    break block8;
                }
                bl = false;
            }
            hzu.jun(bl);
            this.ghy.gu4(gc0);
            hzu.ah8(5890);
            hzu.zwy();
            float f8 = (float)ju82.g25 + f3;
            float f9 = fe6.ssk(f8 * 0.02f) * 3.0f;
            float f10 = f8 * 0.01f;
            hzu.a4k(f9, f10, 0.0f);
            hzu.ah8(5888);
            hzu.spd();
            float f11 = 0.5f;
            hzu.wn0(f11, f11, f11, 1.0f);
            hzu.fpt();
            hzu.ru7(1, 1);
            this.g9z.v3g(ju82, f, f2, f3);
            this.g9z.jxr(this.ghy.fy4());
            this.g9z.s_q(ju82, f, f2, f4, f5, f6, f7);
            hzu.ah8(5890);
            hzu.zwy();
            hzu.ah8(5888);
            hzu.s7q();
            hzu.ux6();
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

    @Override
    public void doRenderLayer(g_3 g_32, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a8_((ju8)g_32, f, f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-3432726061412254030L, -3387275722494734426L, MethodHandles.lookup().lookupClass()).a(177961591074400L) ^ 0x37052654A363L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0003\u0011G\u00d4\u00a6\u00e5\u001d\u00b3\u001d;\u001eui2\u0080\u0012e\u00fa\u00fdQ\u00fd\u00f0\u0005\u008d\u0098\u00dd\u00bc\u00ac\u00ae\u0091\u00f7E\u00d5/\u0019\u0006}6\u00d64".getBytes("ISO-8859-1"));
                String string = cu5.a(byArray3).intern();
                gc0 = new gdz(string);
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

