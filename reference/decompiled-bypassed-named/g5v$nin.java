import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum g5v$nin {
   public static final g5v$nin yv2;
   public static final g5v$nin tc_;
   public static final g5v$nin c3d;
   public static final g5v$nin ns_;
   public static final g5v$nin zw2;
   public static final g5v$nin dgt;
   public static final g5v$nin hc4;
   public static final g5v$nin s0o;
   public static final g5v$nin a_4;
   public static final g5v$nin hcq;
   public static final g5v$nin jcl;
   public static final g5v$nin vri;
   public static final g5v$nin c8e;
   public static final g5v$nin ttb;
   private static final g5v$nin[] gcv;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7079934369957942834L, 6598244173298312213L, MethodHandles.lookup().lookupClass()).a(200188752583691L);
      // $VF: monitorexit
      long var10 = var10000 ^ 23437700271537L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[14];
      int var6 = 0;
      String var5 = "xùÎ\u0099.§ñþê\u00ad\u0087=©ô\u0010U\u0018\u00821\u0001ÕÜ9\u009c=ç\u0006±ã\u0090\u0011\u0082êà\u0085î\u0089\u0080>*i\u0018t:!3íe\u009b\u0000qöÓ#rA<\u0007ÞbI¬ÒÚÌ?\u0010¸p\u0098û;²zfÏéUÐ!~\u008e\r\b \\:£¬\u008a\u0095#\u0010ÎÊ \u0001×e:OÖ&úèj²ï\u007f\u0010á#4\u0001\u0000\u0002\u0082';5¹\u0084+\t3V\u0018{\\]\u007fí.\r\u0013¤k\r_EFXÀ(m\nÈÒvÖ8\u0010xùÎ\u0099.§ñþxÈX± /'Z\u0010®;ýõ¥\n6Ñ\"R·\u0086\tçC\u0085\u0010?M\u0089abA\u0014?\u0094zòkqD\u008d´\u0010Å\u009eX\u000bÏÓ\u0000\u0083»>Ã\u007fD\u0005r¨";
      int var7 = "xùÎ\u0099.§ñþê\u00ad\u0087=©ô\u0010U\u0018\u00821\u0001ÕÜ9\u009c=ç\u0006±ã\u0090\u0011\u0082êà\u0085î\u0089\u0080>*i\u0018t:!3íe\u009b\u0000qöÓ#rA<\u0007ÞbI¬ÒÚÌ?\u0010¸p\u0098û;²zfÏéUÐ!~\u008e\r\b \\:£¬\u008a\u0095#\u0010ÎÊ \u0001×e:OÖ&úèj²ï\u007f\u0010á#4\u0001\u0000\u0002\u0082';5¹\u0084+\t3V\u0018{\\]\u007fí.\r\u0013¤k\r_EFXÀ(m\nÈÒvÖ8\u0010xùÎ\u0099.§ñþxÈX± /'Z\u0010®;ýõ¥\n6Ñ\"R·\u0086\tçC\u0085\u0010?M\u0089abA\u0014?\u0094zòkqD\u008d´\u0010Å\u009eX\u000bÏÓ\u0000\u0083»>Ã\u007fD\u0005r¨"
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
                     yv2 = new g5v$nin();
                     tc_ = new g5v$nin();
                     c3d = new g5v$nin();
                     ns_ = new g5v$nin();
                     zw2 = new g5v$nin();
                     dgt = new g5v$nin();
                     hc4 = new g5v$nin();
                     s0o = new g5v$nin();
                     a_4 = new g5v$nin();
                     hcq = new g5v$nin();
                     jcl = new g5v$nin();
                     vri = new g5v$nin();
                     c8e = new g5v$nin();
                     ttb = new g5v$nin();
                     gcv = new g5v$nin[]{yv2, tc_, c3d, ns_, zw2, dgt, hc4, s0o, a_4, hcq, jcl, vri, c8e, ttb};
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

                  var5 = "\u0013TDH}?\u00999\u0089\u00ad\u0005\u0012¢,àP\u0010hT÷\u0099Ü¯\u0087«©£OÞêûì7";
                  var7 = "\u0013TDH}?\u00999\u0089\u00ad\u0005\u0012¢,àP\u0010hT÷\u0099Ü¯\u0087«©£OÞêûì7".length();
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
