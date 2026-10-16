package net.minecraft.network.play.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum C07PacketPlayerDigging$pl2 {
   public static final C07PacketPlayerDigging$pl2 gi_;
   public static final C07PacketPlayerDigging$pl2 t2e;
   public static final C07PacketPlayerDigging$pl2 x56;
   public static final C07PacketPlayerDigging$pl2 r69;
   public static final C07PacketPlayerDigging$pl2 etu;
   public static final C07PacketPlayerDigging$pl2 md_;
   private static final C07PacketPlayerDigging$pl2[] n2z;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3558256772751926877L, -743781569559816678L, MethodHandles.lookup().lookupClass()).a(175398486833076L);
      // $VF: monitorexit
      long var10 = var10000 ^ 130881505993648L;
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
      String var5 = "2_(\u0004¾\u001euÍ\\l_.\u007f\u0080*dùý¨Q1\u0098Vj\u0018ç\u0099ðPJ;²\u009bg\n*9z*)\u0098\u008dK][\u009f\u0011ÜE\u0010\u0010ýÞ\u0089H\u0092uà\u0081/K´ÊvU\u0013\u0018¥\u001bì\u0082É\u0000¬_\u008eJãa¬#\u0002&ã\u0015v\u009b6Ð¼.";
      int var7 = "2_(\u0004¾\u001euÍ\\l_.\u007f\u0080*dùý¨Q1\u0098Vj\u0018ç\u0099ðPJ;²\u009bg\n*9z*)\u0098\u008dK][\u009f\u0011ÜE\u0010\u0010ýÞ\u0089H\u0092uà\u0081/K´ÊvU\u0013\u0018¥\u001bì\u0082É\u0000¬_\u008eJãa¬#\u0002&ã\u0015v\u009b6Ð¼."
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
                     gi_ = new C07PacketPlayerDigging$pl2();
                     t2e = new C07PacketPlayerDigging$pl2();
                     x56 = new C07PacketPlayerDigging$pl2();
                     r69 = new C07PacketPlayerDigging$pl2();
                     etu = new C07PacketPlayerDigging$pl2();
                     md_ = new C07PacketPlayerDigging$pl2();
                     n2z = new C07PacketPlayerDigging$pl2[]{gi_, t2e, x56, r69, etu, md_};
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

                  var5 = "\u00adä¯½ØC0jK{c\u0001b ÎÕù\u009a¨\u0017+\u0085Â{\u0010çAþ\u0018\u0013)§\u001f>\u009cõð´@ ª";
                  var7 = "\u00adä¯½ØC0jK{c\u0001b ÎÕù\u009a¨\u0017+\u0085Â{\u0010çAþ\u0018\u0013)§\u001f>\u009cõð´@ ª".length();
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
