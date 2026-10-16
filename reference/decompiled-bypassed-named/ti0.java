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

public class ti0 extends Module {
   public static BooleanSetting x2g;
   public static BooleanSetting h3x;
   public static BooleanSetting uuy;
   public static NumberSetting ft9;
   public static NumberSetting fmq;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ti0() {
      long var1 = a ^ 97681531171891L;
      super(b<"d">(20816, 3866735793762886280L ^ var1), _aj.sxc, false, new SubEngine[0]);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7686424669632337504L, 7734967797692976437L, MethodHandles.lookup().lookupClass()).a(77470291087476L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 66025688054374L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "§í~\u0013\u001cc¯'\u0012èV\u0098*?\\Ð o\u0093\u0082\u0080Â±6ã=7<ØInè_÷·\u009cÁVÎx\u008eP\u0015Q\u0097\u0097#¦\u001e ¨ç{ù\u0088ØI\nÂ\u0010Ïk\u0011© ,Pù2¾iÇ\u001fws\u0016tEu\u0080ýF ,©½ç,¸äì\u0017\u0080-\u0010\u0093]ø±É\u0097êVÐÂ\u008dØ\f\b\u0092Ùí©Ñ¥ \u0003û½ÞúZ\u0012ðÎXW@a]Í}ô\u00100UÓ+åòÒ¯Ü\u0003e\u0095øV";
      int var6 = "§í~\u0013\u001cc¯'\u0012èV\u0098*?\\Ð o\u0093\u0082\u0080Â±6ã=7<ØInè_÷·\u009cÁVÎx\u008eP\u0015Q\u0097\u0097#¦\u001e ¨ç{ù\u0088ØI\nÂ\u0010Ïk\u0011© ,Pù2¾iÇ\u001fws\u0016tEu\u0080ýF ,©½ç,¸äì\u0017\u0080-\u0010\u0093]ø±É\u0097êVÐÂ\u008dØ\f\b\u0092Ùí©Ñ¥ \u0003û½ÞúZ\u0012ðÎXW@a]Í}ô\u00100UÓ+åòÒ¯Ü\u0003e\u0095øV"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[7];
                     x2g = new BooleanSetting(b<"d">(32619, 424189546149741282L ^ var9), b<"d">(19704, 3022250093860729200L ^ var9), true);
                     h3x = new BooleanSetting(b<"d">(32619, 424189546149741282L ^ var9), b<"d">(7340, 9217296086294257954L ^ var9), false);
                     uuy = new BooleanSetting(b<"d">(32619, 424189546149741282L ^ var9), b<"d">(7273, 301525663154102758L ^ var9), false);
                     ft9 = new NumberSetting(b<"d">(32619, 424189546149741282L ^ var9), b<"d">(32419, 3581671671883006760L ^ var9), 1.0F, 0.2F, 1.5F, 0.01F);
                     fmq = new NumberSetting(b<"d">(32619, 424189546149741282L ^ var9), b<"d">(25240, 1047281506357190418L ^ var9), 1.0F, 0.1F, 2.0F, 0.01F);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "}þM(róÛÁ$¨\u0018%\u001bö>ÞwBy\u0010Mø¹3ý\u0090 ®µ.\u001a\u0082 ã¿5ÊÃKs\u0094Ú5}Ë\u0081æª~ÝNîúCóðyJè\u0011\u0018\u0007$ý\u0091";
                  var6 = "}þM(róÛÁ$¨\u0018%\u001bö>ÞwBy\u0010Mø¹3ý\u0090 ®µ.\u001a\u0082 ã¿5ÊÃKs\u0094Ú5}Ë\u0081æª~ÝNîúCóðyJè\u0011\u0018\u0007$ý\u0091"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18097;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ti0", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("ti0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
