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

public class ipp extends ar7 {
   public static crk dra;
   public static crk t_q;
   public static crk iwr;
   public static c_3 jwf;
   public static cn7 ack;
   public static cn7 p_z;
   public static cn7 gzo;
   public static cn7 jju;
   public static cn7 msw;
   public static cn7 dak;
   public static cn7 _ft;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ipp() {
      long var1 = a ^ 95444112573638L;
      super(b<"m">(15917, 1795535594345634096L ^ var1), _aj.sxc, false, new j1s[0]);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7412528200654612509L, -6593219527280174695L, MethodHandles.lookup().lookupClass()).a(102798136632873L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 53951548186171L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[17];
      int var5 = 0;
      String var4 = "å\u0006Ý\u0090\u0004ïG¦¢\u0006\u0081Ëï>®ÈVÑ\u0012åù6®ªÃø\u008cL\u0014«\u007f®\u0010é¡8¿«¯7\u0092Z\u0016\u0085cÿèh¯\u0010~´L1¡Ú°4Ê\u000fkÁ\u0012*¯å X'lçD\u009c\u0092þTD6\u0083\u0007q\u00adÊÐq\u001f\u0082° b\u0000³Mv/ÌUëM\u0010\u0018n»gÅ´\u0087Ã§ÿ 9×]7µ\u0018I»y¥u\u001a[\u0004i'¯Ph\bÇ'Ï§=\u0087Ì5r\u009f\u0010Éou\u009b©mC·¶\u0006X÷eµu±\u0018\nÑä\u0092C\u009fãA¥Ñ\u0015\u0014\u001an\rOG¦\u0002\u0001\u001fÇ\u0097\b \u0090'ïËÈC°\u0006\u0097[\r×á,M\u0003®]°Ù\u001d«\u0099þÌÿ£@\u001d\u0006±U\u0018Ò*ÚjÇ\u0090:4ú¥\u0007ñdáëU\u0083ÊÌûÂ\u008eoj\u00109GFw_\u0097\u0006lWBDY\f¤\u0017¾ Jû}!\u008e:ØÎ\u0095\u0001\u008a#5\u0080\u0000ß\u008d\u0019¥\u009e9Þ\fë¢Ef£Ë±Ù\u0089\u0010\u009f«ä¬o:\u009c§\u009bV\u001açøJ\u0001\u0089\u0010\u0004'\u0092»\u0007sÚ%ñÕ°Ô|Ã:´8Æ\u0015ûxýÁZ>¥\"\u001cü\u0015k·$®*)à¹\u001f\u009aa\u0099Ð\u0089Ù2|B£\u008aay²j\u0007F-\u0099t\u0090KDr£(\u0003&áâ\u0084mçÔ";
      int var6 = "å\u0006Ý\u0090\u0004ïG¦¢\u0006\u0081Ëï>®ÈVÑ\u0012åù6®ªÃø\u008cL\u0014«\u007f®\u0010é¡8¿«¯7\u0092Z\u0016\u0085cÿèh¯\u0010~´L1¡Ú°4Ê\u000fkÁ\u0012*¯å X'lçD\u009c\u0092þTD6\u0083\u0007q\u00adÊÐq\u001f\u0082° b\u0000³Mv/ÌUëM\u0010\u0018n»gÅ´\u0087Ã§ÿ 9×]7µ\u0018I»y¥u\u001a[\u0004i'¯Ph\bÇ'Ï§=\u0087Ì5r\u009f\u0010Éou\u009b©mC·¶\u0006X÷eµu±\u0018\nÑä\u0092C\u009fãA¥Ñ\u0015\u0014\u001an\rOG¦\u0002\u0001\u001fÇ\u0097\b \u0090'ïËÈC°\u0006\u0097[\r×á,M\u0003®]°Ù\u001d«\u0099þÌÿ£@\u001d\u0006±U\u0018Ò*ÚjÇ\u0090:4ú¥\u0007ñdáëU\u0083ÊÌûÂ\u008eoj\u00109GFw_\u0097\u0006lWBDY\f¤\u0017¾ Jû}!\u008e:ØÎ\u0095\u0001\u008a#5\u0080\u0000ß\u008d\u0019¥\u009e9Þ\fë¢Ef£Ë±Ù\u0089\u0010\u009f«ä¬o:\u009c§\u009bV\u001açøJ\u0001\u0089\u0010\u0004'\u0092»\u0007sÚ%ñÕ°Ô|Ã:´8Æ\u0015ûxýÁZ>¥\"\u001cü\u0015k·$®*)à¹\u001f\u009aa\u0099Ð\u0089Ù2|B£\u008aay²j\u0007F-\u0099t\u0090KDr£(\u0003&áâ\u0084mçÔ"
         .length();
      char var3 = ' ';
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
                     g = new String[17];
                     dra = new crk(b<"m">(14998, 4814887968930908002L ^ var9), b<"m">(9634, 4319892053322913863L ^ var9), 0.2F, 0.0F, 1.0F, 0.01F);
                     t_q = new crk(b<"m">(15917, 1795636370345739213L ^ var9), b<"m">(6055, 5540078598884780611L ^ var9), 0.2F, 0.0F, 1.0F, 0.01F);
                     iwr = new crk(b<"m">(15917, 1795636370345739213L ^ var9), b<"m">(8082, 5578043334468657790L ^ var9), 0.2F, 0.0F, 1.0F, 0.01F);
                     jwf = new c_3(
                        b<"m">(15917, 1795636370345739213L ^ var9),
                        b<"m">(6331, 6968846243579946332L ^ var9),
                        b<"m">(18570, 6454812311494571362L ^ var9),
                        new String[]{
                           b<"m">(5417, 8408084752957860039L ^ var9), b<"m">(24151, 6111733923627770804L ^ var9), b<"m">(12635, 5794692473425677497L ^ var9)
                        }
                     );
                     ack = new cn7(b<"m">(15917, 1795636370345739213L ^ var9), b<"m">(8563, 6091699073194548373L ^ var9), true);
                     p_z = new cn7(b<"m">(15917, 1795636370345739213L ^ var9), b<"m">(6183, 5536288584746427846L ^ var9), true);
                     gzo = new cn7(b<"m">(15917, 1795636370345739213L ^ var9), b<"m">(39, 5142368240765205962L ^ var9), true);
                     jju = new cn7(b<"m">(15917, 1795636370345739213L ^ var9), b<"m">(21246, 6758124625616154391L ^ var9), true);
                     msw = new cn7(b<"m">(15917, 1795636370345739213L ^ var9), b<"m">(15554, 8778081507551133993L ^ var9), true);
                     dak = new cn7(b<"m">(15917, 1795636370345739213L ^ var9), b<"m">(6827, 5297547991262881604L ^ var9), true);
                     _ft = new cn7(b<"m">(15917, 1795636370345739213L ^ var9), b<"m">(9918, 7581768546583829332L ^ var9), false);
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

                  var4 = "/ëÂ<²=\u0096Í\u0016·%\f\u0091ö\u0005h\u0086U\u0011HÏªí\u0001§)¾OaeÇc\u0010§\u0083ÆÎß=£Cq\u0095#ì>ÄGä";
                  var6 = "/ëÂ<²=\u0096Í\u0016·%\f\u0091ö\u0005h\u0086U\u0011HÏªí\u0001§)¾OaeÇc\u0010§\u0083ÆÎß=£Cq\u0095#ì>ÄGä".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29727;
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
            throw new RuntimeException("ipp", var10);
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
         throw new RuntimeException("ipp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
