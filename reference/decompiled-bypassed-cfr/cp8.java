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

public class cp8
extends e0x {
    public static final zb_ jld;

    public cp8() {
        super(p3y.zs8);
        this.y8l(this._8_.c32().zvi(jld, (Comparable)((Object)cp8$vxz.bpt)));
        this.i3l(uja.mqu);
    }

    @Override
    public int crg(zfz zfz2) {
        return ((cp8$vxz)((Object)zfz2.dil(jld))).a1g();
    }

    @Override
    public void m1q(u7m u7m2, uja uja2, List list) {
        cp8$vxz[] cp8$vxzArray = cp8$vxz.values();
        int n = cp8$vxzArray.length;
        int n2 = t9d.c();
        for (int i = 0; i < n; ++i) {
            cp8$vxz cp8$vxz = cp8$vxzArray[i];
            list.add(new erg(u7m2, 1, cp8$vxz.a1g()));
            if (n2 == 0) continue;
        }
    }

    @Override
    public _mi uoz(zfz zfz2) {
        return _mi.e0k;
    }

    @Override
    public zfz kig(int n) {
        return this.l4i().zvi(jld, (Comparable)((Object)cp8$vxz.ydq(n)));
    }

    @Override
    public int hvp(zfz zfz2) {
        return ((cp8$vxz)((Object)zfz2.dil(jld))).a1g();
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{jld});
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(3402783922533337671L, 6379378351780833068L, MethodHandles.lookup().lookupClass()).a(126778787234995L) ^ 0x7C8AA7E8772L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("c\u00a8^/z\u00a3u\u0000".getBytes("ISO-8859-1"));
                String string = cp8.b(byArray3).intern();
                jld = zb_.pq4(string, cp8$vxz.class);
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

