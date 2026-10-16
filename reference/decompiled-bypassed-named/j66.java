import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class j66 extends so9 {
   private static final gdz da5;
   private float sz2;

   public j66(hr_ var1, g6r var2, float var3, float var4) {
      super(var1, var2, var3 * var4);
      this.sz2 = var4;
      this.d4f(new rr8(this));
      this.d4f(new j66$1(this, this));
   }

   @Override
   public void odh() {
      hzu.a4k(0.0F, 0.1875F, 0.0F);
   }

   public void shi(ace var1, float var2) {
      hzu.syc(this.sz2, this.sz2, this.sz2);
   }

   public gdz s_h(ace var1) {
      return da5;
   }

   @Override
   public void e2w(Entity var1, float var2) {
      this.shi((ace)var1, var2);
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.s_h((ace)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3820856765199376493L, -1039139423514190149L, MethodHandles.lookup().lookupClass()).a(137844392616077L);
      // $VF: monitorexit
      long var4 = var10000 ^ 117200191845165L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(
         "\u001d\u0097\u0015é\u0082Í\u0091Ý»\u0089³$ZDE.\u0082<¾P¤\u0096@H-Ð\u0083½ø²\u0085c\u001bz\u0018õ³\u008f\rK".getBytes("ISO-8859-1")
      );
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      da5 = new gdz(var0);
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
