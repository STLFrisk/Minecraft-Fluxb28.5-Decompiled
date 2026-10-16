package net.minecraft.network.play.server;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum S38PacketPlayerListItem$a1f {
   public static final S38PacketPlayerListItem$a1f om8;
   public static final S38PacketPlayerListItem$a1f esa;
   public static final S38PacketPlayerListItem$a1f qwp;
   public static final S38PacketPlayerListItem$a1f qq8;
   public static final S38PacketPlayerListItem$a1f vl6;
   private static final S38PacketPlayerListItem$a1f[] t4u;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8610810091140900184L, -430982183011565301L, MethodHandles.lookup().lookupClass()).a(33016152735982L);
      // $VF: monitorexit
      long var10 = var10000 ^ 44052598171314L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[5];
      int var6 = 0;
      String var5 = "\u00ad\u0003k«U3Ô±\u001cXåF8I-\u001ccmµÏ\u0081\u008b4ü\u0018~JC¶ô´°\tÿÖ«ËnTB\u0082Ö]3^æ\u00876ù\u0010<º\u009d^eÓ\u001e\u0005D\u0006 o#5\u009cÉ";
      int var7 = "\u00ad\u0003k«U3Ô±\u001cXåF8I-\u001ccmµÏ\u0081\u008b4ü\u0018~JC¶ô´°\tÿÖ«ËnTB\u0082Ö]3^æ\u00876ù\u0010<º\u009d^eÓ\u001e\u0005D\u0006 o#5\u009cÉ"
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
                     om8 = new S38PacketPlayerListItem$a1f();
                     esa = new S38PacketPlayerListItem$a1f();
                     qwp = new S38PacketPlayerListItem$a1f();
                     qq8 = new S38PacketPlayerListItem$a1f();
                     vl6 = new S38PacketPlayerListItem$a1f();
                     t4u = new S38PacketPlayerListItem$a1f[]{om8, esa, qwp, qq8, vl6};
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

                  var5 = "ï»t}]ÔEÝ´Á\u008d\u0092jöp\u0012\u00100£\u0018\n\u0012âñà\u00ad[#m\r¨\u0082\u0081";
                  var7 = "ï»t}]ÔEÝ´Á\u008d\u0092jöp\u0012\u00100£\u0018\n\u0012âñà\u00ad[#m\r¨\u0082\u0081".length();
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
