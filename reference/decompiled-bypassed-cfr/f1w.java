/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C03PacketPlayer;

public class f1w
extends ar7 {
    private /* synthetic */ boolean crf;
    private static final long a = c.a(-8923313566880928235L, 1621533312436440174L, MethodHandles.lookup().lookupClass()).a(159310984808930L);
    private static final String f;

    public f1w() {
        long l = a ^ 0x636AC0D81C99L;
        super(f, _aj.z3a, false, new j1s[0]);
        this.crf = true;
    }

    @Override
    public void ne2() {
        super.ne2();
        f1w.ek1.vg8.iau();
        this.crf = false;
    }

    @jev
    public void j3m(ccn ccn2) {
        block11: {
            l86 l862;
            block10: {
                c05 c052;
                int n;
                block8: {
                    block9: {
                        n = t9d.b();
                        try {
                            try {
                                c052 = ek1;
                                if (n == 0) break block8;
                                if (c052.tij != null) break block9;
                            }
                            catch (oov oov2) {
                                throw f1w.a(oov2);
                            }
                            return;
                        }
                        catch (oov oov3) {
                            throw f1w.a(oov3);
                        }
                    }
                    c052 = ek1;
                }
                try {
                    try {
                        l862 = c052.vg8;
                        if (n == 0) break block10;
                        if (l862.i55() != 0.0f) break block11;
                    }
                    catch (oov oov4) {
                        throw f1w.a(oov4);
                    }
                    f1w.ek1.vg8.uh3(20.0f);
                    f1w.ek1.vg8.ma9 = false;
                    this.crf = true;
                    ek1.z2i(null);
                    l862 = f1w.ek1.vg8;
                }
                catch (oov oov5) {
                    throw f1w.a(oov5);
                }
            }
            l862.clj(f1w.ek1.vg8.o2v, f1w.ek1.vg8.kfp, f1w.ek1.vg8.vbd);
        }
    }

    @jev
    public void ru7(ihr ihr2) {
        block9: {
            ihr ihr3;
            block10: {
                boolean bl;
                block8: {
                    int n = t9d.b();
                    try {
                        try {
                            try {
                                bl = this.crf;
                                if (n == 0) break block8;
                                if (!bl) break block9;
                            }
                            catch (oov oov2) {
                                throw f1w.a(oov2);
                            }
                            ihr3 = ihr2;
                            if (n == 0) break block10;
                        }
                        catch (oov oov3) {
                            throw f1w.a(oov3);
                        }
                        bl = ihr3.bbi() instanceof C03PacketPlayer;
                    }
                    catch (oov oov4) {
                        throw f1w.a(oov4);
                    }
                }
                if (!bl) break block9;
                ihr3 = ihr2;
            }
            ihr3.wxi(true);
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
        long l = a ^ 0x1A6EFD45A9C6L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00a1\u00b1\u0007\u00a5\u0083\u0013\u00f2Y".getBytes("ISO-8859-1"));
                f = f1w.b(byArray3).intern();
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

