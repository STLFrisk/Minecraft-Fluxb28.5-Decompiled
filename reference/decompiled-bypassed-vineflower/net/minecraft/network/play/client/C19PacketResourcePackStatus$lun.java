package net.minecraft.network.play.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum C19PacketResourcePackStatus$lun {
   public static final C19PacketResourcePackStatus$lun q9e;
   public static final C19PacketResourcePackStatus$lun r0c;
   public static final C19PacketResourcePackStatus$lun htm;
   public static final C19PacketResourcePackStatus$lun off;
   private static final C19PacketResourcePackStatus$lun[] fhm;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7912066198596003057L, 5271982404723389406L, MethodHandles.lookup().lookupClass()).a(161866567692814L);
      // $VF: monitorexit
      long var10 = var10000 ^ 27683764379323L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[4];
      int var6 = 0;
      String var5 = "§\u0010\u0017\u0004\u008e^\u008fÙs\u0084ÜÇ¸a\u0014\u009e\u0010Ù\u009f\b§gCÖð{ST\u0090ã\u0017\u0006¿";
      int var7 = "§\u0010\u0017\u0004\u008e^\u008fÙs\u0084ÜÇ¸a\u0014\u009e\u0010Ù\u009f\b§gCÖð{ST\u0090ã\u0017\u0006¿".length();
      char var4 = 16;
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
                     q9e = new C19PacketResourcePackStatus$lun();
                     r0c = new C19PacketResourcePackStatus$lun();
                     htm = new C19PacketResourcePackStatus$lun();
                     off = new C19PacketResourcePackStatus$lun();
                     fhm = new C19PacketResourcePackStatus$lun[]{q9e, r0c, htm, off};
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

                  var5 = "n¬6\u0094:Ï¶\u0085æ04>ìÆ±ú'f 4ó;_É\u0010\u0090\u00079]Î4\u0097\u0091¯.\b\u0000yO\u009dÚ";
                  var7 = "n¬6\u0094:Ï¶\u0085æ04>ìÆ±ú'f 4ó;_É\u0010\u0090\u00079]Î4\u0097\u0091¯.\b\u0000yO\u009dÚ".length();
                  var4 = 24;
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
