import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dnm extends so9 {
   public dnm(hr_ var1) {
      super(var1, new fzb(0.0F), 0.5F);
      this.e8o = (fzb)super.m5v;
      this.d4f(new _40(this));
      this.d4f(new j0x(this));
   }

   public void gp_(a_t var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = OpaquePredicate.c();

      fzb var10000;
      boolean var10001;
      label33: {
         try {
            var10000 = this.e8o;
            if (var1.ejt().r_y().p1r() != p3y.cei) {
               var10001 = true;
               break label33;
            }
         } catch (oov var14) {
            throw a(var14);
         }

         var10001 = false;
      }

      label25: {
         try {
            var10000.djg = var10001;
            this.e8o.n7k = var1._ah();
            if (var10 != 0) {
               return;
            }

            if (!var1._ah()) {
               break label25;
            }
         } catch (oov var13) {
            throw a(var13);
         }

         double var11 = 0.02;
         var2 += this.qed.nextGaussian() * var11;
         var6 += this.qed.nextGaussian() * var11;
      }

      super.w_x(var1, var2, var4, var6, var8, var9);
   }

   public gdz o17(a_t var1) {
      return lio;
   }

   @Override
   public void w_x(yqv var1, double var2, double var4, double var6, float var8, float var9) {
      this.gp_((a_t)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public void l1o(Entity var1, double var2, double var4, double var6, float var8, float var9) {
      this.gp_((a_t)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.o17((a_t)var1);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.gp_((a_t)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-968071497023022785L, -4972975784574645384L, MethodHandles.lookup().lookupClass()).a(68687581655823L);
      // $VF: monitorexit
      long var4 = var10000 ^ 43242357268663L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("m<\u0005ÍPç\u009f\b7nôãÀZ0\u0019Ür\fïf·\u0098HÛµ\u0088èá¹;\u0095Ü²MÜ¬i=m".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      lio = new gdz(var0);
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
