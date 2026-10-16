import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jxe extends w56 {
   private static final gdz qih;
   private static final gdz tl8;

   public jxe(hr_ var1) {
      super(var1, new a2b(), 0.5F);
      this.d4f(new rr8(this));
      this.d4f(new jxe$1(this, this));
   }

   public void kyk(jzg var1, float var2) {
      try {
         if (var1.su3() == 1) {
            hzu.syc(1.2F, 1.2F, 1.2F);
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   @Override
   public void odh() {
      hzu.a4k(0.09375F, 0.1875F, 0.0F);
   }

   public gdz ir_(jzg var1) {
      try {
         if (var1.su3() == 1) {
            return tl8;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return qih;
   }

   @Override
   public gdz zkj(yqv var1) {
      return this.ir_((jzg)var1);
   }

   @Override
   public void e2w(g_3 var1, float var2) {
      this.kyk((jzg)var1, var2);
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.ir_((jzg)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8236488753373490122L, 246714769940393966L, MethodHandles.lookup().lookupClass()).a(207307571025884L);
      // $VF: monitorexit
      long var10 = var10000 ^ 75177342745986L;
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
      String var5 = "wÙAÏÇW:@sÍ\u0019\t!öDÇÝ\u0094\u0016ñ!\u0091ù§ÑþÙcÕ,g\u0018à\u0088p®6\u0010\u001cÁ\u008535±*ÎÌê(wÙAÏÇW:@sÍ\u0019\t!öDÇÝ\u0094\u0016ñ!\u0091ù§\u0090ò\u008c<¬\u001a&hæûµ¹$äRk";
      int var7 = "wÙAÏÇW:@sÍ\u0019\t!öDÇÝ\u0094\u0016ñ!\u0091ù§ÑþÙcÕ,g\u0018à\u0088p®6\u0010\u001cÁ\u008535±*ÎÌê(wÙAÏÇW:@sÍ\u0019\t!öDÇÝ\u0094\u0016ñ!\u0091ù§\u0090ò\u008c<¬\u001a&hæûµ¹$äRk"
         .length();
      char var4 = '0';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = d(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            qih = new gdz(var8[1]);
            tl8 = new gdz(var8[0]);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static oov a(oov var0) {
      return var0;
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
