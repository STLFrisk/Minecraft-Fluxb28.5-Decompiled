import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class o8h extends w56 {
   private static final gdz j60;

   public o8h(hr_ var1) {
      super(var1, new eur(), 0.5F, 1.0F);
      this.d4f(new rr8(this));
      this.d4f(new o8h$1(this, this));
   }

   public gdz s8u(v9i var1) {
      return j60;
   }

   @Override
   public gdz zkj(yqv var1) {
      return this.s8u((v9i)var1);
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.s8u((v9i)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7611490617188056948L, -8573230933577085562L, MethodHandles.lookup().lookupClass()).a(38639189684733L);
      // $VF: monitorexit
      long var4 = var10000 ^ 73556382420288L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(
         "\u00adÃ\u0093Ç<Ì\u0087\u0012mB9\u0089Êù\r\u0098ä\b\u001e\u0010\u0004Â\u0003NL9\u0000\u0005ÌcX\u0087ñìÖ\u0087½6äz".getBytes("ISO-8859-1")
      );
      String var7 = d(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      j60 = new gdz(var0);
   }

   private static String d(byte[] var0) {
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
