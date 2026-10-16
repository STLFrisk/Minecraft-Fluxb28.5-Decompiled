/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class _o9
extends wlx {
    private /* synthetic */ bdo bdp;
    private static final long a = c.a(7248489278697408333L, -2398746458586357175L, MethodHandles.lookup().lookupClass()).a(122614240564070L);
    private static final String f;

    public _o9(iq7 iq72) {
        super(iq72);
        this.b09(10);
    }

    @Override
    public void vsg(z96 z962) {
        block5: {
            z96 z963;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        z963 = z962;
                        if (n == 0) break block4;
                        if (!z963.noc().equals(this.sdn().p4h())) break block5;
                    }
                    catch (oov oov2) {
                        throw _o9.a(oov2);
                    }
                    this.bdp = new bdo();
                    z963 = z962;
                }
                catch (oov oov3) {
                    throw _o9.a(oov3);
                }
            }
            z963.c97(this.bdp);
        }
        super.vsg(z962);
    }

    @Override
    public String pjq(SocketAddress socketAddress, GameProfile gameProfile) {
        String string;
        block8: {
            _o9 _o92;
            block7: {
                block6: {
                    long l = a ^ 0x20E9F1BF3398L;
                    int n = t9d.b();
                    try {
                        try {
                            try {
                                if (!gameProfile.getName().equalsIgnoreCase(this.sdn().p4h())) break block6;
                                _o92 = this;
                                if (n == 0) break block7;
                            }
                            catch (oov oov2) {
                                throw _o9.a(oov2);
                            }
                            if (_o92.f_q(gameProfile.getName()) == null) break block6;
                        }
                        catch (oov oov3) {
                            throw _o9.a(oov3);
                        }
                        string = f;
                        break block8;
                    }
                    catch (oov oov4) {
                        throw _o9.a(oov4);
                    }
                }
                _o92 = this;
            }
            string = super.pjq(socketAddress, gameProfile);
        }
        return string;
    }

    @Override
    public iq7 sdn() {
        return (iq7)super.sdn();
    }

    @Override
    public bdo u2u() {
        return this.bdp;
    }

    @Override
    public vr1 sdn() {
        return this.sdn();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x52FF3EEDE143L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00e2\f\u0088J\u0013\u0081\u00d5\u0082\u00c3\u00b4\u00a8z\u0004\u0004\u0081\u00eb6Ij\u00d4\u000b\u00bc\u00c8v\u0095\u00a8U\u000b\u00a4\u00de\u0099\b".getBytes("ISO-8859-1"));
                f = _o9.b(byArray3).intern();
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

