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
import net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition;
import net.minecraft.network.play.client.C13PacketPlayerAbilities;

public class a6k$1
extends Thread {
    public final a6k c02;
    private static final long a = c.a(-8402948489095194918L, -7482486156224959811L, MethodHandles.lookup().lookupClass()).a(137445306649505L);
    private static final String b;

    public a6k$1(a6k a6k2) {
        this.c02 = a6k2;
    }

    @Override
    public void run() {
        block6: {
            long l = a ^ 0x73FF3B29F323L;
            int n = t9d.c();
            try {
                a6k$1.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            for (ue5 ue52 : a6k.jmd(this.c02)) {
                try {
                    a6k.jnd((a6k)this.c02).vg8.lq7._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(ue52.h25(), ue52.mji(), ue52.va0(), true));
                    if (n == 0) {
                        if (n == 0) continue;
                        break;
                    }
                    break block6;
                }
                catch (InterruptedException interruptedException) {
                    throw a6k$1.a(interruptedException);
                }
            }
            a6k.ljj((a6k)this.c02).vg8.lq7._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(this.c02.ous.getX(), this.c02.ous.getY(), this.c02.ous.getZ(), true));
            a6k.dm5((a6k)this.c02).vg8.lq7._m3().r92(new C03PacketPlayer(true));
            a6k.gnk((a6k)this.c02).vg8.m6_(this.c02.ous.getX(), this.c02.ous.getY(), this.c02.ous.getZ());
            q0r.tq3(b);
        }
        pj2 pj22 = new pj2();
        pj22.wzx = false;
        a6k.thp(this.c02).c02()._m3().r92(new C13PacketPlayerAbilities(pj22));
        a6k.clw(this.c02).c02()._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(a6k._9h((a6k)this.c02).vg8.o2v, a6k.t6e((a6k)this.c02).vg8.kfp, a6k.svl((a6k)this.c02).vg8.vbd, true));
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0xCA8A124F466L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00aa\u001d\u00e0\u0019\u00a1\u00e3\u00fa\u00deS\u00b5\u00fe\u00e3\u00b5\u00ad\u0002G".getBytes("ISO-8859-1"));
                b = a6k$1.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
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

