import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class d6z extends so9 {
   public d6z(hr_ var1, g6r var2, float var3) {
      super(var1, var2, var3);
      this.d4f(new sl_(this));
   }

   public void q8o(dge var1, double var2, double var4, double var6, float var8, float var9) {
      this.o2u = 0.25F * (float)var1.qi8();
      super.w_x(var1, var2, var4, var6, var8, var9);
   }

   public void iuy(dge var1, float var2) {
      float var3 = (float)var1.qi8();
      float var4 = (var1.un8 + (var1.mhp - var1.un8) * var2) / (var3 * 0.5F + 1.0F);
      float var5 = 1.0F / (var4 + 1.0F);
      hzu.syc(var5 * var3, 1.0F / var5 * var3, var5 * var3);
   }

   public gdz _ww(dge var1) {
      return p93;
   }

   @Override
   public void w_x(yqv var1, double var2, double var4, double var6, float var8, float var9) {
      this.q8o((dge)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public void e2w(g_3 var1, float var2) {
      this.iuy((dge)var1, var2);
   }

   @Override
   public void l1o(g_3 var1, double var2, double var4, double var6, float var8, float var9) {
      this.q8o((dge)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public gdz dzd(i2h var1) {
      return this._ww((dge)var1);
   }

   @Override
   public void apl(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      this.q8o((dge)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3564783000125031416L, -8678424152532002886L, MethodHandles.lookup().lookupClass()).a(173388245711157L);
      // $VF: monitorexit
      long var4 = var10000 ^ 96979333529902L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u000bãp\u009c\u0090{-fÑüjÞVÍN XE5Ûh>`]\u0086\u008eK<J.0\u0099".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      p93 = new gdz(var0);
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
