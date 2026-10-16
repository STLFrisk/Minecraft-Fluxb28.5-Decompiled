package net.minecraft.network.play.server;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum S44PacketWorldBorder$yf2 {
   public static final S44PacketWorldBorder$yf2 usb;
   public static final S44PacketWorldBorder$yf2 q9x;
   public static final S44PacketWorldBorder$yf2 ts3;
   public static final S44PacketWorldBorder$yf2 pkv;
   public static final S44PacketWorldBorder$yf2 nm1;
   public static final S44PacketWorldBorder$yf2 ddg;
   private static final S44PacketWorldBorder$yf2[] _bz;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5267854114519280982L, -1587309032366923056L, MethodHandles.lookup().lookupClass()).a(118689598201627L);
      // $VF: monitorexit
      long var10 = var10000 ^ 10860172751756L;
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
      String var5 = "ò¬V;\u001dÔz¿y«Ù\u0092p\täç$E\u0012~µ(æ\u0010\u0010_¿¿\u0013ì\u0015\u0094,Å¦&ÁÎÔ\u009a\u001a\u0018ò¬V;\u001dÔz¿\u0003&\u0006¯Ì\u0092Ý)¬\u0016kE[ß\u0005K\u001025§\u00ad$så`\u008c\u0016\u007fûiÜ¨:";
      int var7 = "ò¬V;\u001dÔz¿y«Ù\u0092p\täç$E\u0012~µ(æ\u0010\u0010_¿¿\u0013ì\u0015\u0094,Å¦&ÁÎÔ\u009a\u001a\u0018ò¬V;\u001dÔz¿\u0003&\u0006¯Ì\u0092Ý)¬\u0016kE[ß\u0005K\u001025§\u00ad$så`\u008c\u0016\u007fûiÜ¨:"
         .length();
      char var4 = 24;
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
                     usb = new S44PacketWorldBorder$yf2();
                     q9x = new S44PacketWorldBorder$yf2();
                     ts3 = new S44PacketWorldBorder$yf2();
                     pkv = new S44PacketWorldBorder$yf2();
                     nm1 = new S44PacketWorldBorder$yf2();
                     ddg = new S44PacketWorldBorder$yf2();
                     _bz = new S44PacketWorldBorder$yf2[]{usb, q9x, ts3, pkv, nm1, ddg};
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

                  var5 = "?qS\u008dK¨ácìV¸®<ºPï\u0010þä\u0090/Ü\u009bÇ:^ýÒ×¥\u0099_H";
                  var7 = "?qS\u008dK¨ácìV¸®<ºPï\u0010þä\u0090/Ü\u009bÇ:^ýÒ×¥\u0099_H".length();
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
