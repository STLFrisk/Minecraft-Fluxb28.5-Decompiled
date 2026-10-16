/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f5a {
    private static final gdz ugp;
    private final lc5 tkr;
    private final Map quu = Maps.newHashMap();

    public f5a(lc5 lc52) {
        this.tkr = lc52;
    }

    public void qxz(ucr ucr2) {
        f5a$yqd.ogj(this.xi1(ucr2));
    }

    public void wzl(ucr ucr2, boolean bl) {
        f5a$yqd.toe(this.xi1(ucr2), bl);
    }

    private f5a$yqd xi1(ucr ucr2) {
        f5a$yqd f5a$yqd;
        block2: {
            f5a$yqd f5a$yqd2;
            block3: {
                int n = t9d.c();
                f5a$yqd2 = (f5a$yqd)this.quu.get(ucr2.tg4);
                try {
                    f5a$yqd = f5a$yqd2;
                    if (n != 0) break block2;
                    if (f5a$yqd != null) break block3;
                }
                catch (oov oov2) {
                    throw f5a.a(oov2);
                }
                f5a$yqd2 = new f5a$yqd(this, ucr2, null);
                this.quu.put(ucr2.tg4, f5a$yqd2);
            }
            f5a$yqd = f5a$yqd2;
        }
        return f5a$yqd;
    }

    public void wge() {
        block4: {
            int n = t9d.c();
            for (f5a$yqd f5a$yqd : this.quu.values()) {
                try {
                    this.tkr.cez(f5a$yqd.uxl(f5a$yqd));
                    if (n == 0) {
                        if (n == 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw f5a.a(oov2);
                }
            }
            this.quu.clear();
        }
    }

    public static lc5 y66(f5a f5a2) {
        return f5a2.tkr;
    }

    public static gdz zix() {
        return ugp;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-5480697529208635430L, -9090514184875788959L, MethodHandles.lookup().lookupClass()).a(53489274621779L) ^ 0x275E135E9C93L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("UA\u00f3\u0094XO+V\u00cb*\u0011hR5x\u00d6\u00ad\u00f9\u00a7\u00bb\u00eaU\u00f9no\u0001\u00a8g\u00db\u00fe\u0003\u00ac".getBytes("ISO-8859-1"));
                String string = f5a.a(byArray3).intern();
                ugp = new gdz(string);
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

