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

public class drn extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 107127852891956L;
      return b<"v">(24054, 7067876789930041172L ^ var1);
   }

   @Override
   public int bag() {
      return 0;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 122668125430706L;
      return b<"v">(27876, 3742632349935825603L ^ var2);
   }

   @Override
   public void l3z(e7r var1, String[] var2) {
      long var3 = a ^ 111519234001521L;
      int var5 = vr1._0v().mij();

      e7r var10000;
      tao var10001;
      tao var10002;
      wlx var10003;
      boolean var10004;
      label22: {
         label21: {
            try {
               var1.a0d(new hsu(b<"v">(13390, 629863707335426987L ^ var3), new Object[]{var5, vr1._0v().ao7()}));
               var10000 = var1;
               var10001 = new tao;
               var10002 = var10001;
               var10003 = vr1._0v().wh3();
               if (var2.length > 0 && b<"v">(1848, 2654454598998438110L ^ var3).equalsIgnoreCase(var2[0])) {
                  break label21;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var10004 = false;
            break label22;
         }

         var10004 = true;
      }

      var10002./* $VF: Unable to resugar constructor */<init>(var10003.uuy(var10004));
      var10000.a0d(var10001);
      var1.io9(n_k$pbp.t39, var5);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(434260218746488043L, 3340984134365005258L, MethodHandles.lookup().lookupClass()).a(159575838217310L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 85177006295387L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "6ºôíPÿ\u0007tÆÚ5`\u0007ÜùÚ\u008a³Ð%«ê\u0003\u0083P;¸\u0002\u0013\u0089.CO\nÄ[¾W¾Þ0&\u0006Bç>\u0082«ãÇ´ù\u0099\u0081+ùi`\b+î¯n¸iÅm\u008cxl\u000fnp{aÉþ\u008c\u008b'3ÆÐ®´!\bÝR";
      int var8 = "6ºôíPÿ\u0007tÆÚ5`\u0007ÜùÚ\u008a³Ð%«ê\u0003\u0083P;¸\u0002\u0013\u0089.CO\nÄ[¾W¾Þ0&\u0006Bç>\u0082«ãÇ´ù\u0099\u0081+ùi`\b+î¯n¸iÅm\u008cxl\u000fnp{aÉþ\u008c\u008b'3ÆÐ®´!\bÝR"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     g = new String[4];
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

                  var6 = "\u0004ò\u0094ô±ä¥\u0000Ã\u00adÀ&¢yW\u0007\u0010v\u0013\u007f\u001b\u0097Ð§\u008a9Þ\u0000ë½<\u0017ÿ";
                  var8 = "\u0004ò\u0094ô±ä¥\u0000Ã\u00adÀ&¢yW\u0007\u0010v\u0013\u007f\u001b\u0097Ð§\u008a9Þ\u0000ë½<\u0017ÿ".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7099;
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
            throw new RuntimeException("drn", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("drn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
