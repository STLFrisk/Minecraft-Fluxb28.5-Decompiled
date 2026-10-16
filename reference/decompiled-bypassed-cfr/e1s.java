/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition;

public class e1s
extends ar7 {
    private static final long a = c.a(4654884850882839968L, -5504042086455153597L, MethodHandles.lookup().lookupClass()).a(234402637033573L);
    private static final String f;

    public e1s() {
        long l = a ^ 0x2C54E39EF0F2L;
        super(f, _aj._lm, false, new j1s[0]);
    }

    @Override
    public void ron() {
        block10: {
            block11: {
                int n = t9d.b();
                try {
                    try {
                        try {
                            try {
                                if (n == 0) break block10;
                                if (e1s.ek1.vg8 != null) {
                                }
                                break block11;
                            }
                            catch (oov oov2) {
                                throw e1s.a(oov2);
                            }
                            if (n == 0) break block10;
                        }
                        catch (oov oov3) {
                            throw e1s.a(oov3);
                        }
                        if (e1s.ek1.tij != null) {
                        }
                        break block11;
                    }
                    catch (oov oov4) {
                        throw e1s.a(oov4);
                    }
                    e1s.ek1.vg8.lq7.sxi(new C03PacketPlayer$C04PacketPlayerPosition(e1s.ek1.vg8.o2v, e1s.ek1.vg8.kfp + 1.0, e1s.ek1.vg8.vbd, false));
                }
                catch (oov oov5) {
                    throw e1s.a(oov5);
                }
            }
            this.yse(false);
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
        long l = a ^ 0x76B61B3601DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("s\u00f3\\\u00fc\u0086\u00c9\u0005\u00c1\u00e3\u00a1\u000b\u009f\u00c8{7\u00d0".getBytes("ISO-8859-1"));
                f = e1s.b(byArray3).intern();
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

