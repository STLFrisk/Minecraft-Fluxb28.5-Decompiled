/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f35
extends e0x {
    public static final zb_ q4f;

    public f35() {
        super(p3y.zs8, pmc$s6y.tms.fds());
        this.y8l(this._8_.c32().zvi(q4f, (Comparable)((Object)f35$vyc.q6a)));
        this.i3l(uja.mqu);
    }

    @Override
    public int crg(zfz zfz2) {
        return ((f35$vyc)((Object)zfz2.dil(q4f))).zks();
    }

    @Override
    public void m1q(u7m u7m2, uja uja2, List list) {
        f35$vyc[] f35$vycArray = f35$vyc.values();
        int n = f35$vycArray.length;
        int n2 = t9d.c();
        for (int i = 0; i < n; ++i) {
            f35$vyc f35$vyc = f35$vycArray[i];
            list.add(new erg(u7m2, 1, f35$vyc.zks()));
            if (n2 == 0) continue;
        }
    }

    @Override
    public zfz kig(int n) {
        return this.l4i().zvi(q4f, (Comparable)((Object)f35$vyc.vmt(n)));
    }

    @Override
    public int hvp(zfz zfz2) {
        return ((f35$vyc)((Object)zfz2.dil(q4f))).zks();
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{q4f});
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-696151611478616584L, -3925575640191264602L, MethodHandles.lookup().lookupClass()).a(177667696031725L) ^ 0x5C85D031DA84L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00e6O\u00d7\u00e0\u00fd7QG".getBytes("ISO-8859-1"));
                String string = f35.b(byArray3).intern();
                q4f = zb_.pq4(string, f35$vyc.class);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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

