/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ejl
extends ar7 {
    private static final long a = c.a(-1442592238264601075L, -920508499973181760L, MethodHandles.lookup().lookupClass()).a(24623973530004L);
    private static final String f;

    public ejl() {
        long l = a ^ 0x40AC3E466662L;
        super(f, _aj.p3z, false, new j1s[0]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @jev
    public void qef(q8e q8e2) {
        block17: {
            int n;
            l86 l862;
            block16: {
                boolean bl;
                block14: {
                    int n2;
                    block15: {
                        block12: {
                            block13: {
                                n2 = t9d.c();
                                try {
                                    try {
                                        bl = ejl.ek1.vg8.vx3(mcs.s19.wj9());
                                        if (n2 != 0) break block12;
                                        if (!bl) break block13;
                                    }
                                    catch (oov oov2) {
                                        throw ejl.a(oov2);
                                    }
                                    ejl.ek1.vg8.zu8(mcs.s19.wj9());
                                }
                                catch (oov oov3) {
                                    throw ejl.a(oov3);
                                }
                            }
                            bl = ejl.ek1.vg8.vx3(mcs.bla.wj9());
                        }
                        try {
                            try {
                                if (n2 != 0) break block14;
                                if (!bl) break block15;
                            }
                            catch (oov oov4) {
                                throw ejl.a(oov4);
                            }
                            ejl.ek1.vg8.zu8(mcs.bla.wj9());
                        }
                        catch (oov oov5) {
                            throw ejl.a(oov5);
                        }
                    }
                    try {
                        l862 = ejl.ek1.vg8;
                        n = mcs._es.wj9();
                        if (n2 != 0) break block16;
                        bl = l862.vx3(n);
                    }
                    catch (oov oov6) {
                        throw ejl.a(oov6);
                    }
                }
                try {
                    if (!bl) break block17;
                    l862 = ejl.ek1.vg8;
                    n = mcs._es.wj9();
                }
                catch (oov oov7) {
                    throw ejl.a(oov7);
                }
            }
            l862.zu8(n);
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
        long l = a ^ 0x41EFDC4B09A8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("/\u008d\u00f2\u00a9\u00ce\u00f0\u001d7".getBytes("ISO-8859-1"));
                f = ejl.b(byArray3).intern();
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

