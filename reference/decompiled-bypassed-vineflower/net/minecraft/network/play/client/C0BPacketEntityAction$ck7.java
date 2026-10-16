package net.minecraft.network.play.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum C0BPacketEntityAction$ck7 {
   public static final C0BPacketEntityAction$ck7 cqg;
   public static final C0BPacketEntityAction$ck7 lxs;
   public static final C0BPacketEntityAction$ck7 a79;
   public static final C0BPacketEntityAction$ck7 mft;
   public static final C0BPacketEntityAction$ck7 dbx;
   public static final C0BPacketEntityAction$ck7 y56;
   public static final C0BPacketEntityAction$ck7 lqv;
   private static final C0BPacketEntityAction$ck7[] yxv;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6468149934513702575L, -8576922199998226491L, MethodHandles.lookup().lookupClass()).a(8146778431226L);
      // $VF: monitorexit
      long var10 = var10000 ^ 8246872841285L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[7];
      int var6 = 0;
      String var5 = "ó\u0092c\u00adíÌ½ÿ\u000fÑÞ<ÒÖ_\u009b\u0010?§{êö,\f\u0088W\bÄ6\u009b+\rè\u00103~m_DE1ÛqHmú³\u0087P\u0089\u0010ºyåöà\u0014[\u0001\u0003\u0012\u0086ÓÁ¡Iò\u0010\u009cß5à0Å\u0001\u0099è$\u0006q5\u0081ÿ\u0012";
      int var7 = "ó\u0092c\u00adíÌ½ÿ\u000fÑÞ<ÒÖ_\u009b\u0010?§{êö,\f\u0088W\bÄ6\u009b+\rè\u00103~m_DE1ÛqHmú³\u0087P\u0089\u0010ºyåöà\u0014[\u0001\u0003\u0012\u0086ÓÁ¡Iò\u0010\u009cß5à0Å\u0001\u0099è$\u0006q5\u0081ÿ\u0012"
         .length();
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
                     cqg = new C0BPacketEntityAction$ck7();
                     lxs = new C0BPacketEntityAction$ck7();
                     a79 = new C0BPacketEntityAction$ck7();
                     mft = new C0BPacketEntityAction$ck7();
                     dbx = new C0BPacketEntityAction$ck7();
                     y56 = new C0BPacketEntityAction$ck7();
                     lqv = new C0BPacketEntityAction$ck7();
                     yxv = new C0BPacketEntityAction$ck7[]{cqg, lxs, a79, mft, dbx, y56, lqv};
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

                  var5 = "Ûõ\u000b3v¶´Ö;¦Nó\u008aeË\u0018\u0010\u008aÂ¢hhQø\\;XqvÞûní";
                  var7 = "Ûõ\u000b3v¶´Ö;¦Nó\u008aeË\u0018\u0010\u008aÂ¢hhQø\\;XqvÞûní".length();
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
