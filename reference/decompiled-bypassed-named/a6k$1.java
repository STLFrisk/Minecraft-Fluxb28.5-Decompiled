import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition;
import net.minecraft.network.play.client.C13PacketPlayerAbilities;

public class a6k$1 extends Thread {
   public final a6k c02;
   private static final long a;
   private static final String b;

   public a6k$1(a6k var1) {
      this.c02 = var1;
   }

   @Override
   public void run() {
      long var1 = a ^ 127540046459683L;
      int var3 = OpaquePredicate.c();

      try {
         sleep(1000L);
      } catch (InterruptedException var6) {
         var6.printStackTrace();
      }

      Iterator var4 = a6k.jmd(this.c02).iterator();

      while (true) {
         if (var4.hasNext()) {
            ue5 var5 = (ue5)var4.next();

            try {
               a6k.jnd(this.c02).vg8.lq7._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(var5.h25(), var5.mji(), var5.va0(), true));
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            } catch (InterruptedException var7) {
               throw a(var7);
            }
         }

         a6k.ljj(this.c02)
            .vg8
            .lq7
            ._m3()
            .r92(new C03PacketPlayer$C04PacketPlayerPosition((double)this.c02.ous.getX(), (double)this.c02.ous.getY(), (double)this.c02.ous.getZ(), true));
         a6k.dm5(this.c02).vg8.lq7._m3().r92(new C03PacketPlayer(true));
         a6k.gnk(this.c02).vg8.m6_((double)this.c02.ous.getX(), (double)this.c02.ous.getY(), (double)this.c02.ous.getZ());
         q0r.tq3(b);
         break;
      }

      pj2 var8 = new pj2();
      var8.wzx = false;
      a6k.thp(this.c02).c02()._m3().r92(new C13PacketPlayerAbilities(var8));
      a6k.clw(this.c02)
         .c02()
         ._m3()
         .r92(new C03PacketPlayer$C04PacketPlayerPosition(a6k._9h(this.c02).vg8.o2v, a6k.t6e(this.c02).vg8.kfp, a6k.svl(this.c02).vg8.vbd, true));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8402948489095194918L, -7482486156224959811L, MethodHandles.lookup().lookupClass()).a(137445306649505L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 13918397592678L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ª\u001dà\u0019¡ãúÞSµþãµ\u00ad\u0002G".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
