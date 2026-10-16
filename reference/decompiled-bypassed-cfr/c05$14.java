/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c05$14
implements Callable {
    public final c05 wp0;
    private static final long a = c.a(8179146219582338234L, -6510942472818423521L, MethodHandles.lookup().lookupClass()).a(171132316751852L);
    private static final String b;

    public c05$14(c05 c052) {
        this.wp0 = c052;
    }

    public String call() {
        String string;
        block6: {
            block5: {
                uan uan2;
                block4: {
                    long l = a ^ 0x3C1A0E5E7B53L;
                    int n = t9d.c();
                    try {
                        try {
                            uan2 = this.wp0.ba0;
                            if (n != 0) break block4;
                            if (!uan2._e9) break block5;
                        }
                        catch (oov oov2) {
                            throw c05$14.a(oov2);
                        }
                        uan2 = this.wp0.ba0;
                    }
                    catch (oov oov3) {
                        throw c05$14.a(oov3);
                    }
                }
                string = uan2.q53();
                break block6;
            }
            string = b;
        }
        return string;
    }

    public Object call() {
        return this.call();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x4FA2D3D01AC3L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00aa\u00aa\u00ef\u00c8\u009c\u00cfr\u001f\u0099b\u00d2/\u00e6<\u00c3\u00c9".getBytes("ISO-8859-1"));
                b = c05$14.a(byArray3).intern();
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

