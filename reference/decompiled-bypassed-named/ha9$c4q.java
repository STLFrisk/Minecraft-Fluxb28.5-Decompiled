import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum ha9$c4q {
   public static final ha9$c4q mxe;
   public static final ha9$c4q rw4;
   public static final ha9$c4q ulg;
   private static final ha9$c4q[] aai;
   private final int v6w;
   private final String cwi;
   private static final ha9$c4q[] f7x;

   private ha9$c4q(int var3, String var4) {
      this.v6w = var3;
      this.cwi = var4;
   }

   public int ih5() {
      return this.v6w;
   }

   public static ha9$c4q oub(int var0) {
      return aai[var0 % aai.length];
   }

   public String imc() {
      return this.cwi;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6656687781984911000L, 7420177213174243292L, MethodHandles.lookup().lookupClass()).a(96663840483799L);
      // $VF: monitorexit
      long var10 = var10000 ^ 27957245478964L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[6];
      int var6 = 0;
      String var5 = "¤äÑ¤lâ^¹ \u0012¬\u0010WÉ\u0096Ü¢X@Û\u000fé<ºÓ\u0091Gt\u009b`ý{]\u0085Gð\u008d9'\u009bû\bÉÙí¤Ý\u0099\u0093¼ \u0012¬\u0010WÉ\u0096Ü¢X@Û\u000fé<ºÓ\u0091Gt\u009b`ý{]\u0019ö[Yíò¦\u0088";
      int var7 = "¤äÑ¤lâ^¹ \u0012¬\u0010WÉ\u0096Ü¢X@Û\u000fé<ºÓ\u0091Gt\u009b`ý{]\u0085Gð\u008d9'\u009bû\bÉÙí¤Ý\u0099\u0093¼ \u0012¬\u0010WÉ\u0096Ü¢X@Û\u000fé<ºÓ\u0091Gt\u009b`ý{]\u0019ö[Yíò¦\u0088"
         .length();
      char var4 = '\b';
      int var17 = -1;

      label37:
      while (true) {
         String var19 = var5.substring(++var17, var17 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var19.getBytes("ISO-8859-1"));
            String var25 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var25;
                  if ((var17 += var4) >= var7) {
                     mxe = new ha9$c4q(0, var8[1]);
                     rw4 = new ha9$c4q(1, var8[3]);
                     ulg = new ha9$c4q(2, var8[4]);
                     f7x = new ha9$c4q[]{mxe, rw4, ulg};
                     aai = new ha9$c4q[values().length];

                     for (ha9$c4q var15 : values()) {
                        aai[var15.v6w] = var15;
                     }

                     return;
                  }

                  var4 = var5.charAt(var17);
                  break;
               default:
                  var8[var6++] = var25;
                  if ((var17 += var4) < var7) {
                     var4 = var5.charAt(var17);
                     continue label37;
                  }

                  var5 = "\u0012¬\u0010WÉ\u0096Ü¢X@Û\u000fé<ºÓ\u0091Gt\u009b`ý{]X?\u0002o4\u0096×)\bgçÝ\u0005û;$)";
                  var7 = "\u0012¬\u0010WÉ\u0096Ü¢X@Û\u000fé<ºÓ\u0091Gt\u009b`ý{]X?\u0002o4\u0096×)\bgçÝ\u0005û;$)".length();
                  var4 = ' ';
                  var17 = -1;
            }

            var19 = var5.substring(++var17, var17 + var4);
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
