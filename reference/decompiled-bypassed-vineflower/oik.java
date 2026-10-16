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

public class oik extends mn8 {
   private static final long b;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public oik(w9p var1, String var2, double var3, double var5, double var7) {
      long var9 = b ^ 92448225130181L;
      super(var1, var2, var3);
      this._bt = var5;
      this.jz4 = var7;
      if (var5 > var7) {
         throw new IllegalArgumentException(a<"n">(28251, 2895731537575321968L ^ var9));
      } else {
         try {
            if (var3 < var5) {
               throw new IllegalArgumentException(a<"n">(1655, 7056178748748712286L ^ var9));
            }
         } catch (IllegalArgumentException var12) {
            throw b(var12);
         }

         try {
            if (var3 > var7) {
               throw new IllegalArgumentException(a<"n">(7480, 4302459262427910674L ^ var9));
            }
         } catch (IllegalArgumentException var11) {
            throw b(var11);
         }
      }
   }

   public oik c3y(String var1) {
      this.pqi = var1;
      return this;
   }

   public String u_r() {
      return this.pqi;
   }

   @Override
   public double qot(double var1) {
      return fe6.lft(var1, this._bt, this.jz4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8820528959360995091L, 8596617345697324349L, MethodHandles.lookup().lookupClass()).a(36782187195764L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 56630427652380L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "$@AOc'iº´\u008dwÑ7\u0010æB\"Z\u0084Ì«Ybðõ*å¾nè\u0099\u001e¨â\u001c\u001b\u000eâ¬\u008a\u009aÏ½\u0084\u0092ÕÕéKG;\u0005\u0099=O«Üàö\u007fg¶=°\u001aK¥\u0090t½By\u008aæîå\u0093\u0094'C½,W³¯£j\u009bâ\u009d\u0087Ê\bÕ|\u0094`\u000b±\u0013g\u008a\u009bã6\u0098\u0003Z\u0088oGUí\u000b\u008f\ròQÆé\u0092\f\u0003õþnîV\u0081XÞPÀü¢\u009fÚ\u0001\u0092\u0016ô\u00828\u008f\u009f\u009dðÔ§Üå¦\u0004¸\u009c\u009aÉûÊ\u0013u\u0001*Ã·zc7pÍ\r\u0014)lèmëázËU²ByH\u0095a\nÒÐ¯&\u008bX-,?\u0089E.×,\u0087ÁÂ}S>§<\u0007Ï¨\u0093>(H\u0081¬ÉIe/\u0015Ùã\u001e,bc\u000b&VK¹\u008e&½û¥/õ¶ÀekD`H\u0003æ\u009bÀ)ù\u008e\u009f¹\u0088P?\u0091'[ã\u000bIuúî{\r\u007f\u0096¬¡'\u0085zmfI";
      int var8 = "$@AOc'iº´\u008dwÑ7\u0010æB\"Z\u0084Ì«Ybðõ*å¾nè\u0099\u001e¨â\u001c\u001b\u000eâ¬\u008a\u009aÏ½\u0084\u0092ÕÕéKG;\u0005\u0099=O«Üàö\u007fg¶=°\u001aK¥\u0090t½By\u008aæîå\u0093\u0094'C½,W³¯£j\u009bâ\u009d\u0087Ê\bÕ|\u0094`\u000b±\u0013g\u008a\u009bã6\u0098\u0003Z\u0088oGUí\u000b\u008f\ròQÆé\u0092\f\u0003õþnîV\u0081XÞPÀü¢\u009fÚ\u0001\u0092\u0016ô\u00828\u008f\u009f\u009dðÔ§Üå¦\u0004¸\u009c\u009aÉûÊ\u0013u\u0001*Ã·zc7pÍ\r\u0014)lèmëázËU²ByH\u0095a\nÒÐ¯&\u008bX-,?\u0089E.×,\u0087ÁÂ}S>§<\u0007Ï¨\u0093>(H\u0081¬ÉIe/\u0015Ùã\u001e,bc\u000b&VK¹\u008e&½û¥/õ¶ÀekD`H\u0003æ\u009bÀ)ù\u008e\u009f¹\u0088P?\u0091'[ã\u000bIuúî{\r\u007f\u0096¬¡'\u0085zmfI"
         .length();
      char var5 = '`';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static IllegalArgumentException b(IllegalArgumentException var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1484;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("oik", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("oik" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
