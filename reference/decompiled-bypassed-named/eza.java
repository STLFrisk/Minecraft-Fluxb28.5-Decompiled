import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class eza extends so9 {
   public eza(hr_ var1) {
      super(var1, new cob(), 0.5F);
   }

   public gdz pyc(h_s var1) {
      try {
         if (var1.osy()) {
            return gzr;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return qa4;
   }

   public void xn4(h_s var1, float var2) {
      float var3 = 1.0F;
      float var4 = (8.0F + var3) / 2.0F;
      float var5 = (8.0F + 1.0F / var3) / 2.0F;
      hzu.syc(var5, var4, var5);
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void e2w(Entity var1, float var2) {
      this.xn4((h_s)var1, var2);
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.pyc((h_s)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1679810555601612609L, 7589066484185001929L, MethodHandles.lookup().lookupClass()).a(247787031986280L);
      // $VF: monitorexit
      long var10 = var10000 ^ 23328918292707L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "¼ÊùLPý\u009fý¶\u001f\f\u001c\bA\u0097t{\u0084\u0016ýitýÚ¬·qNÂ<\u0083â0¼ÊùLPý\u009fý¶\u001f\f\u001c\bA\u0097t{\u0084\u0016ýitýÚ«¬Ç\u009e\u001a\bäæGE\u001bx=<9\u00adn±;4ßy.s";
      int var7 = "¼ÊùLPý\u009fý¶\u001f\f\u001c\bA\u0097t{\u0084\u0016ýitýÚ¬·qNÂ<\u0083â0¼ÊùLPý\u009fý¶\u001f\f\u001c\bA\u0097t{\u0084\u0016ýitýÚ«¬Ç\u009e\u001a\bäæGE\u001bx=<9\u00adn±;4ßy.s"
         .length();
      char var4 = ' ';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = c(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            qa4 = new gdz(var8[0]);
            gzr = new gdz(var8[1]);
            return;
         }

         var4 = var5.charAt(var3);
      }
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
