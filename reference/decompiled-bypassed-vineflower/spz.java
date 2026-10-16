import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class spz extends liu {
   public spz(hr_ var1) {
      super(var1);
   }

   private float w32(float var1, float var2, float var3) {
      int var4 = t9d.b();
      float var5 = var2 - var1;

      while (var5 < -180.0F) {
         var5 += 360.0F;

         try {
            if (var4 == 0) {
               return var1 + var3 * var5;
            }

            if (var4 == 0) {
               break;
            }
         } catch (oov var6) {
            throw a(var6);
         }
      }

      while (var5 >= 180.0F) {
         float var10000 = var5 - 360.0F;
         if (var4 == 0) {
            return var10000;
         }

         var5 = var10000;
         if (var4 == 0) {
            return var1 + var3 * var5;
         }
      }

      return var1 + var3 * var5;
   }

   public void t1q(k7p var1, double var2, double var4, double var6, float var8, float var9) {
      hzu.dp2();
      hzu.o1b();
      float var10 = this.w32(var1.p3h, var1.x5k, var9);
      float var11 = var1.j25 + (var1.y2i - var1.j25) * var9;
      hzu.a4k((float)var2, (float)var4, (float)var6);
      float var12 = 0.0625F;
      hzu.ixc();
      hzu.syc(-1.0F, -1.0F, 1.0F);
      hzu.if9();
      this.sat(var1);
      this.gzs.s_q(var1, 0.0F, 0.0F, 0.0F, var10, var11, var12);
      hzu.x3w();
      super.apl(var1, var2, var4, var6, var8, var9);
   }

   public gdz co8(k7p var1) {
      try {
         if (var1.oy3()) {
            return l3w;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return xfv;
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.co8((k7p)var1);
   }

   @Override
   public void apl(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      this.t1q((k7p)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7214662252315897079L, 3026847110030744042L, MethodHandles.lookup().lookupClass()).a(57235467397143L);
      // $VF: monitorexit
      long var10 = var10000 ^ 86693637367581L;
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
      String var5 = "³¡y×©VëV\u0014³3èêç£\u0096i0r°_#\b\u008f\u0002ÿO§øÑ\u0000n\u0093\u000e4Ù\u009aÇèZ0³¡y×©VëV\u0014³3èêç£\u0096i0r°_#\b\u008f8O\u0001¿\u0013þüâ\u0082\u001cnQê\u0088E\u000euìÔ7ª\u0097d\u001b";
      int var7 = "³¡y×©VëV\u0014³3èêç£\u0096i0r°_#\b\u008f\u0002ÿO§øÑ\u0000n\u0093\u000e4Ù\u009aÇèZ0³¡y×©VëV\u0014³3èêç£\u0096i0r°_#\b\u008f8O\u0001¿\u0013þüâ\u0082\u001cnQê\u0088E\u000euìÔ7ª\u0097d\u001b"
         .length();
      char var4 = '(';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            l3w = new gdz(var8[1]);
            xfv = new gdz(var8[0]);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static oov a(oov var0) {
      return var0;
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
