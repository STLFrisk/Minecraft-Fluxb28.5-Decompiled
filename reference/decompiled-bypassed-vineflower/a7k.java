import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a7k extends liu {
   public a7k(hr_ var1) {
      super(var1);
      this.o2u = 0.5F;
   }

   public void ao9(edl var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = (float)var1.cjr + var9;
      hzu.dp2();
      hzu.a4k((float)var2, (float)var4, (float)var6);
      this.gu4(gli);
      float var11 = fe6.rtn(var10 * 0.2F) / 2.0F + 0.5F;
      var11 = var11 * var11 + var11;
      this.ih3.s_q(var1, 0.0F, var10 * 3.0F, var11 * 0.2F, 0.0F, 0.0F, 0.0625F);
      hzu.x3w();
      super.apl(var1, var2, var4, var6, var8, var9);
   }

   public gdz _03(edl var1) {
      return gli;
   }

   @Override
   public gdz dzd(i2h var1) {
      return this._03((edl)var1);
   }

   @Override
   public void apl(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      this.ao9((edl)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3820801556987660911L, 4187238171268929668L, MethodHandles.lookup().lookupClass()).a(155468408701239L);
      // $VF: monitorexit
      long var4 = var10000 ^ 50461334983458L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(
         "ÐË1\u0086û:¸Ñÿ§\u0088\u008f'\u009dñ#0ë\t7Iõ\u000eÖ^¢î\u0087azeê¶\u0088!\u0016r\u0014\u008a«\u0088i¾\u0094\u0001\u0087<t".getBytes("ISO-8859-1")
      );
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      gli = new gdz(var0);
   }

   private static String b(byte[] var0) {
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
