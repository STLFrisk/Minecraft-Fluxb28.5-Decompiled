package net.minecraft.network.play.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum C16PacketClientStatus$v78 {
   public static final C16PacketClientStatus$v78 ggv;
   public static final C16PacketClientStatus$v78 gfl;
   public static final C16PacketClientStatus$v78 s_c;
   private static final C16PacketClientStatus$v78[] mz6;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(462844113750328832L, 6769266822714287484L, MethodHandles.lookup().lookupClass()).a(216444419512676L);
      // $VF: monitorexit
      long var10 = var10000 ^ 35889960240926L;
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
      String var5 = "¬\u0086\u008dþ\u009fb`MSíûýÔ\u00970 òö0\u007fhóZÑCÊ>º\u001eä\u0015·\u0010ùz5ÿ\u0012gå\u008c_\u0083\u0086\u007f±¤è\u001b\u0010\u001eJøÿg¦è\b°\u0082Ì3áíò\u001d";
      int var7 = "¬\u0086\u008dþ\u009fb`MSíûýÔ\u00970 òö0\u007fhóZÑCÊ>º\u001eä\u0015·\u0010ùz5ÿ\u0012gå\u008c_\u0083\u0086\u007f±¤è\u001b\u0010\u001eJøÿg¦è\b°\u0082Ì3áíò\u001d"
         .length();
      char var4 = ' ';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = a(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            ggv = new C16PacketClientStatus$v78();
            gfl = new C16PacketClientStatus$v78();
            s_c = new C16PacketClientStatus$v78();
            mz6 = new C16PacketClientStatus$v78[]{ggv, gfl, s_c};
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
