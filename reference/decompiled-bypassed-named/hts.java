import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hts extends ShaderHelper {
   private static final long a;
   private static final String b;

   public hts(String var1, String var2) {
      this.y_m = var1;
      this.m03 = var2;
   }

   @Override
   public void initGui() {
      long var1 = a ^ 64866347977048L;
      super.initGui();
      this.khf.add(new gt4(0, this.dt7 / 2 - 100, 140, fc1.gx1(b, new Object[0])));
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      this.flp(0, 0, this.dt7, this.o1e, -12574688, -11530224);
      this.poi(this.fex, this.y_m, this.dt7 / 2, 90, 16777215);
      this.poi(this.fex, this.m03, this.dt7 / 2, 110, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   @Override
   public void dig(char var1, int var2) {
   }

   @Override
   public void actionPerformed(gt4 var1) {
      this.f41.z2i((ShaderHelper)null);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3459436099573670432L, 7954717363090422214L, MethodHandles.lookup().lookupClass()).a(75935938484043L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 16325458252202L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0092âÈ\u0080å\u008eà\u0015ä^n\u0010Ð:îä".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
