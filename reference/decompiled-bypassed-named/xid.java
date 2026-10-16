import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xid extends so9 {
   public xid(hr_ var1, g6r var2, float var3) {
      super(var1, var2, var3);
   }

   public gdz bw8(EntityMob var1) {
      return a_p;
   }

   public void gur(EntityMob var1, float var2, float var3, float var4) {
      float var5 = var1.w1t + (var1._v3 - var1.w1t) * var4;
      float var6 = var1.ja3 + (var1.b5b - var1.ja3) * var4;
      hzu.a4k(0.0F, 0.5F, 0.0F);
      hzu.a2h(180.0F - var3, 0.0F, 1.0F, 0.0F);
      hzu.a2h(var5, 1.0F, 0.0F, 0.0F);
      hzu.a2h(var6, 0.0F, 1.0F, 0.0F);
      hzu.a4k(0.0F, -1.2F, 0.0F);
   }

   public float f_t(EntityMob var1, float var2) {
      return var1.eay + (var1.a_w - var1.eay) * var2;
   }

   @Override
   public float xwp(Entity var1, float var2) {
      return this.f_t((EntityMob)var1, var2);
   }

   @Override
   public void ur9(Entity var1, float var2, float var3, float var4) {
      this.gur((EntityMob)var1, var2, var3, var4);
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.bw8((EntityMob)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7126204041181754700L, -6110091287191325397L, MethodHandles.lookup().lookupClass()).a(138768279377874L);
      // $VF: monitorexit
      long var4 = var10000 ^ 61290066470867L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("ÖyvEBü\u0010ÿTaK`#Í¡  Q.ð\\\u0001a@$\u009c\\¦pª\u009fý".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      a_p = new gdz(var0);
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
