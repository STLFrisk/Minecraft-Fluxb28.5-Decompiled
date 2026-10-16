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

public class btc {
   public static final btc pzg;
   private final long gyu;
   private long tn_;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public btc(long var1) {
      this.gyu = var1;
   }

   public void es9(long var1) {
      long var3 = a ^ 10971229424981L;

      try {
         this.tn_ += var1 / 8L;
         if (this.tn_ > this.gyu) {
            throw new RuntimeException(a<"v">(23799, 1605683994460146532L ^ var3) + this.tn_ + a<"v">(31542, 8510988583963946148L ^ var3) + this.gyu);
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-768896859982430950L, -8737763927334134055L, MethodHandles.lookup().lookupClass()).a(123941843792248L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 12426583270833L;
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
      String var6 = "7\u008bþ,\u009d\u0016.ªÅôÙÝ+¦SYOØÊó\u008f\u0006¢¸üólè¤'Ë#Z\u00029\u0010w\u008a\u0015\u0092ÙZÙë\nª\u0083\u0006Þ½\u009f;X;@u\u0010\u001e[W\u0002EÆ 8\u009b.\u009c},\u009b»è'-¦¯\u0082\u008d9üþö=\u0015¤ïaîô\u009f\u009e5çÚ*ýõ\u0019ï[\u0098Æ\u009a8±Û\u0096ÂÒ*â[yÎò\u0089¼(àºâã+`{í\b\"iÀu\u001fÿs\u0002Þ\u008ce¼,ÒÇ\u008f(½\u008806\u0015)\u001aßû¹\u0092rãñ]ü";
      int var8 = "7\u008bþ,\u009d\u0016.ªÅôÙÝ+¦SYOØÊó\u008f\u0006¢¸üólè¤'Ë#Z\u00029\u0010w\u008a\u0015\u0092ÙZÙë\nª\u0083\u0006Þ½\u009f;X;@u\u0010\u001e[W\u0002EÆ 8\u009b.\u009c},\u009b»è'-¦¯\u0082\u008d9üþö=\u0015¤ïaîô\u009f\u009e5çÚ*ýõ\u0019ï[\u0098Æ\u009a8±Û\u0096ÂÒ*â[yÎò\u0089¼(àºâã+`{í\b\"iÀu\u001fÿs\u0002Þ\u008ce¼,ÒÇ\u008f(½\u008806\u0015)\u001aßû¹\u0092rãñ]ü"
         .length();
      char var5 = 'h';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            pzg = new btc$1(0L);
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13994;
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
            throw new RuntimeException("btc", var10);
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
         throw new RuntimeException("btc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
