import java.awt.Color;
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

public class vqs extends Module {
   public static NumberSetting bg7;
   public static NumberSetting t2n;
   public static NumberSetting dk_;
   public static BooleanSetting xlm;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public vqs() {
      long var1 = a ^ 59410930169041L;
      super(b<"o">(19424, 1414767335396859449L ^ var1), _aj.sxc, false, new SubEngine[0]);
   }

   @EventHandler
   public void h9f(s60 var1) {
      if (xlm.g7m()) {
         Color var2 = new Color(kie(0));
         bg7.setNumber((float)var2.getRed());
         t2n.setNumber((float)var2.getGreen());
         dk_.setNumber((float)var2.getBlue());
      }
   }

   public static int kie(int var0) {
      double var1 = Math.ceil((double)(System.currentTimeMillis() / 4L) + (double)var0 / 20.0);
      var1 %= 360.0;
      return Color.getHSBColor((float)(var1 / 360.0), 0.8F, 0.8F).brighter().getRGB();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6731927336189712086L, -2316812036870859440L, MethodHandles.lookup().lookupClass()).a(121807566135863L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 118458440569651L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "u¼ÃÆ(ú¾Ã* øò\u0090\u0018¾\u0092\u0010é,\u0098\u0082x\u0098~±_\u0016~ú\u000etz\u0004\u0010\u0099$\u0085½\fk¦?/eZeÚ\u0084½\u0097\u0018\u0083\u0010ï\u0001=T\u001f5¨ÙÈ°ïÚ´\u0013,\u008c\u009f\u0093Îqez";
      int var6 = "u¼ÃÆ(ú¾Ã* øò\u0090\u0018¾\u0092\u0010é,\u0098\u0082x\u0098~±_\u0016~ú\u000etz\u0004\u0010\u0099$\u0085½\fk¦?/eZeÚ\u0084½\u0097\u0018\u0083\u0010ï\u0001=T\u001f5¨ÙÈ°ïÚ´\u0013,\u008c\u009f\u0093Îqez"
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
                     g = new String[6];
                     bg7 = new NumberSetting(b<"o">(13876, 249607334161679369L ^ var9), b<"o">(30207, 4967144386317109187L ^ var9), 170.0F, 0.0F, 255.0F, 1.0F);
                     t2n = new NumberSetting(b<"o">(19424, 1414727116951517659L ^ var9), b<"o">(19125, 1145182593044117647L ^ var9), 0.0F, 0.0F, 255.0F, 1.0F);
                     dk_ = new NumberSetting(b<"o">(19424, 1414727116951517659L ^ var9), b<"o">(13141, 7500965364761952618L ^ var9), 0.0F, 0.0F, 255.0F, 1.0F);
                     xlm = new BooleanSetting(b<"o">(19424, 1414727116951517659L ^ var9), b<"o">(29889, 5108732239900657407L ^ var9), false);
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

                  var4 = "·\u009dXþ\u0017\té\u0003Ô\u0006m\u0096hQ}\u0017 \u0091Q&À\u008cüÕ\u0010pÌ$.öå;ìÐ\u008cEp\u008a\u0015¿\u0018\u001dÐJV\u0089å©ï";
                  var6 = "·\u009dXþ\u0017\té\u0003Ô\u0006m\u0096hQ}\u0017 \u0091Q&À\u008cüÕ\u0010pÌ$.öå;ìÐ\u008cEp\u008a\u0015¿\u0018\u001dÐJV\u0089å©ï"
                     .length();
                  var3 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15933;
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
            throw new RuntimeException("vqs", var10);
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
         throw new RuntimeException("vqs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
