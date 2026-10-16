/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class d6l {
    public yqv z3k;
    public List d2y = Lists.newArrayList();
    public List y0w = Lists.newArrayList();
    private static final long a = c.a(-1104064444238109760L, 3476167205202179150L, MethodHandles.lookup().lookupClass()).a(134375304982891L);
    private static final String b;

    public d6l(yqv yqv2) {
        this.z3k = yqv2;
    }

    public void ukb() {
        this.d2y.clear();
        this.y0w.clear();
    }

    public boolean ik5(i2h i2h2) {
        boolean bl;
        block18: {
            boolean bl2;
            int n;
            block16: {
                block17: {
                    block14: {
                        block15: {
                            long l = a ^ 0x55C15E5D1501L;
                            n = t9d.b();
                            try {
                                try {
                                    bl2 = this.d2y.contains(i2h2);
                                    if (n == 0) break block14;
                                    if (!bl2) break block15;
                                }
                                catch (oov oov2) {
                                    throw d6l.a(oov2);
                                }
                                return true;
                            }
                            catch (oov oov3) {
                                throw d6l.a(oov3);
                            }
                        }
                        bl2 = this.y0w.contains(i2h2);
                    }
                    try {
                        try {
                            if (n == 0) break block16;
                            if (!bl2) break block17;
                        }
                        catch (oov oov4) {
                            throw d6l.a(oov4);
                        }
                        return false;
                    }
                    catch (oov oov5) {
                        throw d6l.a(oov5);
                    }
                }
                this.z3k.oay.e8t.qek(b);
                bl2 = this.z3k.gq6(i2h2);
            }
            bl = bl2;
            try {
                boolean bl3;
                block19: {
                    try {
                        try {
                            this.z3k.oay.e8t.uio();
                            bl3 = bl;
                            if (n == 0) break block18;
                            if (!bl3) break block19;
                        }
                        catch (oov oov6) {
                            throw d6l.a(oov6);
                        }
                        this.d2y.add(i2h2);
                        if (n != 0) break block18;
                    }
                    catch (oov oov7) {
                        throw d6l.a(oov7);
                    }
                }
                bl3 = this.y0w.add(i2h2);
            }
            catch (oov oov8) {
                throw d6l.a(oov8);
            }
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
        long l = a ^ 0x28B2AC44FA7BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00benVgL\u0005\u00b6P".getBytes("ISO-8859-1"));
                b = d6l.a(byArray3).intern();
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

