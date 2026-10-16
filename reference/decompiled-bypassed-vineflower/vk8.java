import java.io.UnsupportedEncodingException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;

public class vk8 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static SecretKey o5w() {
      long var0 = a ^ 25699370451140L;

      try {
         KeyGenerator var2 = KeyGenerator.getInstance(a<"h">(15169, 3949526814668984428L ^ var0));
         var2.init(128);
         return var2.generateKey();
      } catch (NoSuchAlgorithmException var3) {
         throw new Error(var3);
      }
   }

   public static KeyPair o3h() {
      long var0 = a ^ 110428944729200L;

      try {
         KeyPairGenerator var2 = KeyPairGenerator.getInstance(a<"h">(15953, 2622103335921406403L ^ var0));
         var2.initialize(1024);
         return var2.generateKeyPair();
      } catch (NoSuchAlgorithmException var3) {
         var3.printStackTrace();
         xc5.error(a<"h">(32709, 7400928596026003537L ^ var0));
         return null;
      }
   }

   public static byte[] lul(String var0, PublicKey var1, SecretKey var2) {
      long var3 = a ^ 929517231349L;

      try {
         return dpo(
            a<"h">(1157, 2672132688843387793L ^ var3),
            new byte[][]{var0.getBytes(a<"h">(28510, 6363077720317941835L ^ var3)), var2.getEncoded(), var1.getEncoded()}
         );
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
         return null;
      }
   }

   private static byte[] dpo(String var0, byte[][] var1) {
      int var2 = t9d.b();

      try {
         MessageDigest var3 = MessageDigest.getInstance(var0);
         byte[][] var4 = var1;
         int var5 = var1.length;
         int var6 = 0;

         MessageDigest var10000;
         while (true) {
            if (var6 < var5) {
               byte[] var7 = var4[var6];

               try {
                  var10000 = var3;
                  if (var2 == 0) {
                     break;
                  }

                  var3.update(var7);
                  var6++;
                  if (var2 != 0) {
                     continue;
                  }
               } catch (NoSuchAlgorithmException var8) {
                  throw a(var8);
               }
            }

            var10000 = var3;
            break;
         }

         return var10000.digest();
      } catch (NoSuchAlgorithmException var9) {
         var9.printStackTrace();
         return null;
      }
   }

   public static PublicKey n13(byte[] var0) {
      long var1 = a ^ 14417014707207L;

      try {
         X509EncodedKeySpec var3 = new X509EncodedKeySpec(var0);
         KeyFactory var4 = KeyFactory.getInstance(a<"h">(14310, 699176388726163466L ^ var1));
         return var4.generatePublic(var3);
      } catch (NoSuchAlgorithmException var5) {
      } catch (InvalidKeySpecException var6) {
      }

      xc5.error(a<"h">(11445, 8703454285645583188L ^ var1));
      return null;
   }

   public static SecretKey im3(PrivateKey var0, byte[] var1) {
      long var2 = a ^ 103857476865075L;
      return new SecretKeySpec(u8s(var0, var1), a<"h">(27364, 558473025745128756L ^ var2));
   }

   public static byte[] hbe(Key var0, byte[] var1) {
      return _91(1, var0, var1);
   }

   public static byte[] u8s(Key var0, byte[] var1) {
      return _91(2, var0, var1);
   }

   private static byte[] _91(int var0, Key var1, byte[] var2) {
      long var3 = a ^ 61639616642732L;

      try {
         return b8p(var0, var1.getAlgorithm(), var1).doFinal(var2);
      } catch (IllegalBlockSizeException var6) {
         var6.printStackTrace();
      } catch (BadPaddingException var7) {
         var7.printStackTrace();
      }

      xc5.error(a<"h">(12028, 5350555630309211061L ^ var3));
      return null;
   }

   private static Cipher b8p(int var0, String var1, Key var2) {
      long var3 = a ^ 62086726858571L;

      try {
         Cipher var5 = Cipher.getInstance(var1);
         var5.init(var0, var2);
         return var5;
      } catch (InvalidKeyException var6) {
         var6.printStackTrace();
      } catch (NoSuchAlgorithmException var7) {
         var7.printStackTrace();
      } catch (NoSuchPaddingException var8) {
         var8.printStackTrace();
      }

      xc5.error(a<"h">(10916, 8074705192593520133L ^ var3));
      return null;
   }

   public static Cipher xw6(int var0, Key var1) {
      long var2 = a ^ 133789026815258L;

      try {
         Cipher var4 = Cipher.getInstance(a<"h">(8781, 5045945161861416112L ^ var2));
         var4.init(var0, var1, new IvParameterSpec(var1.getEncoded()));
         return var4;
      } catch (GeneralSecurityException var5) {
         throw new RuntimeException(var5);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6780675196842170473L, 8559265561397977224L, MethodHandles.lookup().lookupClass()).a(28986071027932L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 31011658395875L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "\u0091ïcC_SÆ!±Ñ\u0006\u0088~{\u0007¤\u0010\u0084\u009a¥Iºzø\b=\u009fu\u0084\u008cÉdô\u0010öm©\u009eíô±\u0087Q\u001a Bb²Þ\u0084 p§ç/\u001f6¤\u0005Yb@s·S\u0015']M¦\u0013J1}o7º×\u0013§D\u001fm(ÐüJQ\u0003\u001c¬êV¯[\u000f\u00ad\u0013\u009d\bZwG\u0018Û\u009bÕÄykIá\u008c«I4\t³ËWkb\u0097}0\u0098X0:¬Èp:^u\u0094\u0083(\u0096\u000fr\u0013åNà»%ÑT\u0087\f\u00075µðhì\u00adq\u0083´\"_R\u0017Ã\u0000¥o\u0002ð\u0099R(ìðYÿ\u0001ï\u0083ßX¥éÙÝÂ2ìm\u009dÛ|«#ShNG0\u0015`\u007fÎ\u0001`òÅ\u0086I\u0084,m0¼ÅV\u0000Ö¨¯t(\u001dDÒÿ\u0011OTÂ&£ÒÆ\u001f×ý|\u0097\b¬7]\u0091éW19\u0010±\u0092«V<\t]\u0090\u009a½â9\u0010Òa·\u0004\u0015£\u009aíîÙL¸«h\u008bm";
      int var8 = "\u0091ïcC_SÆ!±Ñ\u0006\u0088~{\u0007¤\u0010\u0084\u009a¥Iºzø\b=\u009fu\u0084\u008cÉdô\u0010öm©\u009eíô±\u0087Q\u001a Bb²Þ\u0084 p§ç/\u001f6¤\u0005Yb@s·S\u0015']M¦\u0013J1}o7º×\u0013§D\u001fm(ÐüJQ\u0003\u001c¬êV¯[\u000f\u00ad\u0013\u009d\bZwG\u0018Û\u009bÕÄykIá\u008c«I4\t³ËWkb\u0097}0\u0098X0:¬Èp:^u\u0094\u0083(\u0096\u000fr\u0013åNà»%ÑT\u0087\f\u00075µðhì\u00adq\u0083´\"_R\u0017Ã\u0000¥o\u0002ð\u0099R(ìðYÿ\u0001ï\u0083ßX¥éÙÝÂ2ìm\u009dÛ|«#ShNG0\u0015`\u007fÎ\u0001`òÅ\u0086I\u0084,m0¼ÅV\u0000Ö¨¯t(\u001dDÒÿ\u0011OTÂ&£ÒÆ\u001f×ý|\u0097\b¬7]\u0091éW19\u0010±\u0092«V<\t]\u0090\u009a½â9\u0010Òa·\u0004\u0015£\u009aíîÙL¸«h\u008bm"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[11];
                     xc5 = LogManager.getLogger();
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\\ú\u0013\tQ\u0000îð\u009b]\u0090ð¹ùã¸\u0082\u008bqçêJ\u001e\u0000\u001ae\u0083`·kß.I£cÈþp:\u0085\u0010ø¬\u008cggÍ{Üa\u001e3 ×sé\u0099";
                  var8 = "\\ú\u0013\tQ\u0000îð\u009b]\u0090ð¹ùã¸\u0082\u008bqçêJ\u001e\u0000\u001ae\u0083`·kß.I£cÈþp:\u0085\u0010ø¬\u008cggÍ{Üa\u001e3 ×sé\u0099"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static NoSuchAlgorithmException a(NoSuchAlgorithmException var0) {
      return var0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27937;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("vk8", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("vk8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
