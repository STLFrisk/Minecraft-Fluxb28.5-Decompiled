import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wd8 extends so9 {
   public wd8(hr_ var1) {
      super(var1, new z95(0.0F), 0.5F);
      this.d4f(new f5f(this));
   }

   public void tga(EntitySpider var1, double var2, double var4, double var6, float var8, float var9) {
      z95 var10000;
      boolean var10001;
      label16: {
         try {
            var10000 = (z95)this.m5v;
            if (var1.tsc() != null) {
               var10001 = true;
               break label16;
            }
         } catch (oov var10) {
            throw a(var10);
         }

         var10001 = false;
      }

      var10000.z78 = var10001;
      super.w_x(var1, var2, var4, var6, var8, var9);
   }

   public gdz upn(EntitySpider var1) {
      return th_;
   }

   @Override
   public void odh() {
      hzu.a4k(0.0F, 0.1875F, 0.0F);
   }

   public void exq(EntitySpider var1, float var2) {
      float var3 = 0.9375F;
      hzu.syc(var3, var3, var3);
   }

   @Override
   public void w_x(yqv var1, double var2, double var4, double var6, float var8, float var9) {
      this.tga((EntitySpider)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public void e2w(Entity var1, float var2) {
      this.exq((EntitySpider)var1, var2);
   }

   @Override
   public void l1o(Entity var1, double var2, double var4, double var6, float var8, float var9) {
      this.tga((EntitySpider)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.upn((EntitySpider)var1);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.tga((EntitySpider)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1317228632244532991L, 6881634071888728279L, MethodHandles.lookup().lookupClass()).a(144889284123510L);
      // $VF: monitorexit
      long var4 = var10000 ^ 110344020822568L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0095Ìg?©xSBÌ®*\nÚ\n! ;éR\"^½ô\u0000£\u001a\u0099Y5\u0082G}".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      th_ = new gdz(var0);
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
