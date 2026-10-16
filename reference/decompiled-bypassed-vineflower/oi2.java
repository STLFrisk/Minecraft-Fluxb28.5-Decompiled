import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class oi2 extends upn {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public void kyv() {
      this._c8 = new h06(gyu.ygn, 0.0F);
      this.v9x = true;
      this.thh = true;
      this.o5k = -1;
   }

   @Override
   public fqr mnc(float var1, float var2) {
      return new fqr(0.2F, 0.03F, 0.03F);
   }

   @Override
   public void d9r() {
      float var2 = 0.1F;
      int var10000 = t9d.b();
      int var3 = 0;
      int var1 = var10000;

      while (var3 <= 15) {
         float var4 = 1.0F - (float)var3 / 15.0F;
         this.gdh[var3] = (1.0F - var4) / (var4 * 3.0F + 1.0F) * (1.0F - var2) + var2;
         var3++;
         if (var1 == 0) {
            break;
         }
      }
   }

   @Override
   public g6k ska() {
      return new l76(this.d3t, this.d3t.r7d().gk1(), this.d3t.x2p());
   }

   @Override
   public boolean cws() {
      return false;
   }

   @Override
   public boolean au7(int var1, int var2) {
      return false;
   }

   @Override
   public float lju(long var1, float var3) {
      return 0.5F;
   }

   @Override
   public boolean vm6() {
      return false;
   }

   @Override
   public boolean c2o(int var1, int var2) {
      return true;
   }

   @Override
   public String gby() {
      long var1 = a ^ 85532170945898L;
      return a<"w">(23004, 4486005613781034964L ^ var1);
   }

   @Override
   public String org() {
      long var1 = a ^ 101211184587057L;
      return a<"w">(30175, 3233114197488430989L ^ var1);
   }

   @Override
   public w5i w23() {
      return new oi2$1(this);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5012090847193852810L, 7609976035779168542L, MethodHandles.lookup().lookupClass()).a(217334763890336L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 104601085172963L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u00adM\\~±j\\ÒÔ\u009eýÙv# '\u0010\r\bÕ\u0002\u0091:\u000b´Å\u0000p\u001b·$\u008a\u0010";
      int var8 = "\u00adM\\~±j\\ÒÔ\u009eýÙv# '\u0010\r\bÕ\u0002\u0091:\u000b´Å\u0000p\u001b·$\u008a\u0010".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18441;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("oi2", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("oi2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
