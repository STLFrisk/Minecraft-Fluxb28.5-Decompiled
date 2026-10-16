import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum kxi$vxo {
   public static final kxi$vxo mih;
   public static final kxi$vxo e_w;
   public static final kxi$vxo jat;
   public static final kxi$vxo te9;
   public static final kxi$vxo hzb;
   private final float eqg;
   private final float djq;
   private final int i_g;
   private final int upi;
   private static final kxi$vxo[] qsk;

   private kxi$vxo(float var3, float var4, int var5, int var6) {
      this.eqg = var3;
      this.djq = var4;
      this.i_g = var5;
      this.upi = var6;
   }

   public float _io() {
      return this.eqg;
   }

   public float pta() {
      return this.djq;
   }

   public int zo3() {
      return this.i_g;
   }

   public int oxv() {
      return this.upi;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7507938909500685085L, 6651953641187937785L, MethodHandles.lookup().lookupClass()).a(83124706594788L);
      // $VF: monitorexit
      long var10 = var10000 ^ 9487174561808L;
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
      String var5 = "\u00017I\u0006^\u009a£ö\b½u\u000b\u008e\u000eÞ6Ú\b¸¾uoj Ä¥";
      int var7 = "\u00017I\u0006^\u009a£ö\b½u\u000b\u008e\u000eÞ6Ú\b¸¾uoj Ä¥".length();
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
                     mih = new kxi$vxo(0.0F, 0.0F, 30, 1);
                     e_w = new kxi$vxo(0.8F, 0.2F, 20, 10);
                     jat = new kxi$vxo(1.0F, 0.45F, 14, 14);
                     te9 = new kxi$vxo(1.75F, 0.4F, 1, 8);
                     hzb = new kxi$vxo(2.0F, 0.7F, 7, 8);
                     qsk = new kxi$vxo[]{mih, e_w, jat, te9, hzb};
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

                  var5 = "m\u000ft\u0006¾EîÍ\b\u0081°íº\u008e\u0086\u0091\u008a";
                  var7 = "m\u000ft\u0006¾EîÍ\b\u0081°íº\u008e\u0086\u0091\u008a".length();
                  var4 = '\b';
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
