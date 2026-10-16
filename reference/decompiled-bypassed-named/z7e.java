import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum z7e {
   public static final z7e ret;
   public static final z7e mvz;
   public static final z7e yip;
   public static final z7e gwi;
   public static final z7e adb;
   public static final z7e a2_;
   public static final z7e sst;
   public static final z7e e4g;
   public static final z7e kks;
   public static final z7e ysh;
   public static final z7e hd3;
   public static final z7e tcq;
   public static final z7e d3m;
   public static final z7e uzb;
   public static final z7e jqn;
   public static final z7e p11;
   public static final z7e b0w;
   public static final z7e hwu;
   public int k0y;

   public static int ax1(Color var0) {
      return i1s(var0.getRed(), var0.getGreen(), var0.getBlue(), var0.getAlpha());
   }

   public static int _mb(int var0) {
      return i1s(var0, var0, var0, 255);
   }

   public static int ynt(int var0, int var1) {
      return i1s(var0, var0, var0, var1);
   }

   public static int l75(int var0, int var1, int var2) {
      return i1s(var0, var1, var2, 255);
   }

   public static int i1s(int var0, int var1, int var2, int var3) {
      byte var4 = 0;
      int var5 = var4 | var3 << 24;
      var5 |= var0 << 16;
      var5 |= var1 << 8;
      return var5 | var2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6769222405924312175L, 951736420122456204L, MethodHandles.lookup().lookupClass()).a(155567624054031L);
      // $VF: monitorexit
      long var10 = var10000 ^ 137885405935257L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[18];
      int var6 = 0;
      String var5 = "\fdx/\u0013\u0005q\u0083\bÕjÐdu\u0014\u00153\b\u0005_\bvý \u0003¢\büÙ%£\u0099\u000eÎ*\u00109»\u0001d\u0019½\u001cbcº\u001dÁõ#pÏ\u0010]é3QsÔÊ\u0014\u0082pú-{ÙÅ\u0087\b¼\u0087\u0080³\u0001@\u0016Ì\u0010ÂöeÄ;¹\u0088\u0001ýq#ì÷\u0010ÎÞ\b=R\u0014\u008eß\u009b=\u009a\u0010ì¾\u0094N¯\f;_òý\u0005ú\u0090Ö\u009c9\bäû\u000b·\t\u0097Úö\u0010t\u001c~î-Yü è\u009c,F\u0097Ôï\u0090\u00108zÈ?È\u0018N1\\Ðh\u00ad\u0088\f4\u0013\b\u009fc\u0015yÜ\u0003Óº\bS_7µcÚÝ7\b\u001dlW\u0000áíH\u001d";
      int var7 = "\fdx/\u0013\u0005q\u0083\bÕjÐdu\u0014\u00153\b\u0005_\bvý \u0003¢\büÙ%£\u0099\u000eÎ*\u00109»\u0001d\u0019½\u001cbcº\u001dÁõ#pÏ\u0010]é3QsÔÊ\u0014\u0082pú-{ÙÅ\u0087\b¼\u0087\u0080³\u0001@\u0016Ì\u0010ÂöeÄ;¹\u0088\u0001ýq#ì÷\u0010ÎÞ\b=R\u0014\u008eß\u009b=\u009a\u0010ì¾\u0094N¯\f;_òý\u0005ú\u0090Ö\u009c9\bäû\u000b·\t\u0097Úö\u0010t\u001c~î-Yü è\u009c,F\u0097Ôï\u0090\u00108zÈ?È\u0018N1\\Ðh\u00ad\u0088\f4\u0013\b\u009fc\u0015yÜ\u0003Óº\bS_7µcÚÝ7\b\u001dlW\u0000áíH\u001d"
         .length();
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
                     ret = new z7e(-16711423);
                     mvz = new z7e(-12028161);
                     yip = new z7e(-12621684);
                     gwi = new z7e(-9830551);
                     adb = new z7e(-9320847);
                     a2_ = new z7e(-65794);
                     sst = new z7e(-7820064);
                     e4g = new z7e(-12621684);
                     kks = new z7e(-9868951);
                     ysh = new z7e(-14342875);
                     hd3 = new z7e(-65536);
                     tcq = new z7e(-8388608);
                     d3m = new z7e(-29696);
                     uzb = new z7e(-2263808);
                     jqn = new z7e(-256);
                     p11 = new z7e(-2702025);
                     b0w = new z7e(-18751);
                     hwu = new z7e(-2252579);
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

                  var5 = "¨Sª¦_æSöñl%å\"Ôµò\b\u0093AIÖò#nª";
                  var7 = "¨Sª¦_æSöñl%å\"Ôµò\b\u0093AIÖò#nª".length();
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
