import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum h3t$wlo {
   public static final h3t$wlo nvg;
   public static final h3t$wlo dui;
   public static final h3t$wlo dky;
   public static final h3t$wlo nfg;
   public static final h3t$wlo znb;
   public static final h3t$wlo oxa;
   private final int xd8;
   private final int uwt;
   private static final h3t$wlo[] qfe;

   private h3t$wlo(int var3, int var4) {
      this.xd8 = var3;
      this.uwt = var4;
   }

   public int r5p() {
      return this.xd8;
   }

   public int xas() {
      return this.uwt;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5684641865023507370L, -6018868643736061673L, MethodHandles.lookup().lookupClass()).a(42278412872256L);
      // $VF: monitorexit
      long var10 = var10000 ^ 37304659444919L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[6];
      int var6 = 0;
      String var5 = "\u0094\táPº7\u0092\u001e\u0010à\u000bCÍ\u0013@\u0006\\\u0013\u000bE\u0003ÓO\u0096-\u0010ê\u008cÀ \u0001\u009b§\u0013â8Â\u0092\u001bÊ\u0006\u0083\u0018à\u000bCÍ\u0013@\u0006\\Ô(4\u00936R\u0007¨KL;\u0005 §@Ê";
      int var7 = "\u0094\táPº7\u0092\u001e\u0010à\u000bCÍ\u0013@\u0006\\\u0013\u000bE\u0003ÓO\u0096-\u0010ê\u008cÀ \u0001\u009b§\u0013â8Â\u0092\u001bÊ\u0006\u0083\u0018à\u000bCÍ\u0013@\u0006\\Ô(4\u00936R\u0007¨KL;\u0005 §@Ê"
         .length();
      char var4 = '\b';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     nvg = new h3t$wlo(0, 146);
                     dui = new h3t$wlo(0, 166);
                     dky = new h3t$wlo(0, 186);
                     nfg = new h3t$wlo(20, 146);
                     znb = new h3t$wlo(20, 166);
                     oxa = new h3t$wlo(20, 186);
                     qfe = new h3t$wlo[]{nvg, dui, dky, nfg, znb, oxa};
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "à\u000bCÍ\u0013@\u0006\\\u0097ÏGº{÷ø\b\u0010\u0015a\u0082\u0080Ö¯Ü\u001cQèm³®ðØ\u0001";
                  var7 = "à\u000bCÍ\u0013@\u0006\\\u0097ÏGº{÷ø\b\u0010\u0015a\u0082\u0080Ö¯Ü\u001cQèm³®ðØ\u0001".length();
                  var4 = 16;
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
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
}
