package net.minecraft.network.play.server;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum S42PacketCombatEvent$cwk {
   public static final S42PacketCombatEvent$cwk dsq;
   public static final S42PacketCombatEvent$cwk ks3;
   public static final S42PacketCombatEvent$cwk mx5;
   private static final S42PacketCombatEvent$cwk[] fp7;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1180534411059624766L, -7602920591485109763L, MethodHandles.lookup().lookupClass()).a(43178074006894L);
      // $VF: monitorexit
      long var10 = var10000 ^ 40983171954591L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[3];
      int var6 = 0;
      String var5 = "¢þÍ¾(ó±¹âR\u001fA \u00ad\u0091ó\u00106¥ÔFðÃ½,S\u001b¿Â\u0085¼5|\u0010¶Ë\u000eÒYv\u0013\u009cª3³½\u0002N^{";
      int var7 = "¢þÍ¾(ó±¹âR\u001fA \u00ad\u0091ó\u00106¥ÔFðÃ½,S\u001b¿Â\u0085¼5|\u0010¶Ë\u000eÒYv\u0013\u009cª3³½\u0002N^{".length();
      char var4 = 16;
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = a(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            dsq = new S42PacketCombatEvent$cwk();
            ks3 = new S42PacketCombatEvent$cwk();
            mx5 = new S42PacketCombatEvent$cwk();
            fp7 = new S42PacketCombatEvent$cwk[]{dsq, ks3, mx5};
            return;
         }

         var4 = var5.charAt(var3);
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
