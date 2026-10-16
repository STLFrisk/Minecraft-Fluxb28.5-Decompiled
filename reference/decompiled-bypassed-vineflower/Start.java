import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.main.Main;

public class Start {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void main(String[] var0) {
      long var1 = a ^ 118933233726907L;
      Main.main(
         (String[])kkf(
            new String[]{
               a<"e">(12331, 3580054026106401115L ^ var1),
               a<"e">(8152, 3933181011819257504L ^ var1),
               a<"e">(25750, 6210269931239450095L ^ var1),
               "0",
               a<"e">(20966, 4021664777263845525L ^ var1),
               a<"e">(4644, 3267609738735735643L ^ var1),
               a<"e">(23856, 4404402404476296258L ^ var1),
               a<"e">(15177, 6587915514405059125L ^ var1),
               a<"e">(7155, 3447789533376207502L ^ var1),
               a<"e">(24482, 2135350979203735257L ^ var1),
               a<"e">(3396, 1756276154816121905L ^ var1),
               a<"e">(6940, 8274170891639708258L ^ var1),
               a<"e">(30901, 8303502382001994180L ^ var1),
               a<"e">(12069, 3883969897069637215L ^ var1)
            },
            var0
         )
      );
   }

   public static Object[] kkf(Object[] var0, Object[] var1) {
      Object[] var2 = Arrays.copyOf(var0, var0.length + var1.length);
      System.arraycopy(var1, 0, var2, var0.length, var1.length);
      return var2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(267244830146366321L, -1877901412615378313L, MethodHandles.lookup().lookupClass()).a(37751265284260L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 58784811607684L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[13];
      int var7 = 0;
      String var6 = "ã\b\u001b· I{.¸\u0000l@e\u0001¢\u0007Ñ#b©ÊHíÑ\u0010®\u0018z\u0081_Y :\u0014\u001fýM5\u0018*ø\u0010vAðs\u0081Þ,\u0098\u001aë£â\u0007èûç\u0010¶¨Nw4h¢4<ò\u0096\u0084\u0000|XÂ(\tT-\u0093Ô¡D\tdÃ\u001eÁçÔ\u0005\u0007\u009f5ªÎ¦\u0011öD?Vê*\u0099\u0005ô1FàÏÚL¬\u0089\u0090\u001018ù¸C·Dí\u0016B\u001bÙz\u009cüÉ\u0010Ý Çó\u008e3\u0003é\u008e¿*B\u0016pP=\u0010lþýJ½a\u0090¥xîc\u001fÎ\t<\u001c \u001b?Ü\u0007Vr£çoV\u0094ºè¨BÝzÖ\u0000K¸ÚÐ]V±\u0019>\u009dqGØ\u0018ôh\u0000}dóXX\u001cSéU)×ù½\u0091\u001f\u00001èm\u0083\u0018 ~\u0092\u0087¼Y\u0080\u009d=i\u0082ýÛ\u000e¥ý\u0016^r7\u0004©§&É NwyÔTóÖ";
      int var8 = "ã\b\u001b· I{.¸\u0000l@e\u0001¢\u0007Ñ#b©ÊHíÑ\u0010®\u0018z\u0081_Y :\u0014\u001fýM5\u0018*ø\u0010vAðs\u0081Þ,\u0098\u001aë£â\u0007èûç\u0010¶¨Nw4h¢4<ò\u0096\u0084\u0000|XÂ(\tT-\u0093Ô¡D\tdÃ\u001eÁçÔ\u0005\u0007\u009f5ªÎ¦\u0011öD?Vê*\u0099\u0005ô1FàÏÚL¬\u0089\u0090\u001018ù¸C·Dí\u0016B\u001bÙz\u009cüÉ\u0010Ý Çó\u008e3\u0003é\u008e¿*B\u0016pP=\u0010lþýJ½a\u0090¥xîc\u001fÎ\t<\u001c \u001b?Ü\u0007Vr£çoV\u0094ºè¨BÝzÖ\u0000K¸ÚÐ]V±\u0019>\u009dqGØ\u0018ôh\u0000}dóXX\u001cSéU)×ù½\u0091\u001f\u00001èm\u0083\u0018 ~\u0092\u0087¼Y\u0080\u009d=i\u0082ýÛ\u000e¥ý\u0016^r7\u0004©§&É NwyÔTóÖ"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[13];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\u0093Ù\u000eáé¨îfçV»ÉÐ\u0082£J8\u009eÙ|\u0019¡µáëôFñ`)j,\u0010\u009cÚ'ºÔ\u008er^xS\u0090·U\u0086Þ\u0095";
                  var8 = "\u0093Ù\u000eáé¨îfçV»ÉÐ\u0082£J8\u009eÙ|\u0019¡µáëôFñ`)j,\u0010\u009cÚ'ºÔ\u008er^xS\u0090·U\u0086Þ\u0095".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9200;
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
            throw new RuntimeException("Start", var10);
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
         throw new RuntimeException("Start" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
