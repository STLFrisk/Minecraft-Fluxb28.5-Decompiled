import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class lpw {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public lpw() {
      long var1 = a ^ 60713508126104L;
      super();
      this.kyk = Maps.newHashMap();

      try {
         InputStream var3 = lpw.class.getResourceAsStream(a<"b">(14533, 1997964079619675640L ^ var1));

         for (String var5 : IOUtils.readLines(var3, Charsets.UTF_8)) {
            try {
               if (var5.isEmpty() || var5.charAt(0) == '#') {
                  continue;
               }
            } catch (IOException var10) {
               throw a(var10);
            }

            String[] var6 = (String[])Iterables.toArray(ye6.split(var5), String.class);

            try {
               if (var6 == null || var6.length != 2) {
                  continue;
               }
            } catch (IOException var9) {
               throw a(var9);
            }

            String var7 = var6[0];
            String var8 = nbv.matcher(var6[1]).replaceAll(a<"b">(8354, 8270000859550059933L ^ var1));
            this.kyk.put(var7, var8);
         }

         this.zjo = System.currentTimeMillis();
      } catch (IOException var11) {
      }
   }

   public static lpw md0() {
      return qr4;
   }

   public static synchronized void xti(Map var0) {
      qr4.kyk.clear();
      qr4.kyk.putAll(var0);
      qr4.zjo = System.currentTimeMillis();
   }

   public synchronized String y6e(String var1) {
      return this.tyk(var1);
   }

   public synchronized String ayd(String var1, Object[] var2) {
      long var3 = a ^ 80142140769021L;
      String var5 = this.tyk(var1);

      try {
         return String.format(var5, var2);
      } catch (IllegalFormatException var7) {
         return a<"b">(2162, 5427646881463704107L ^ var3) + var5;
      }
   }

   private String tyk(String var1) {
      int var2 = t9d.b();
      String var3 = (String)this.kyk.get(var1);

      try {
         if (var2 == 0) {
            return var3;
         }

         if (var3 == null) {
            return var1;
         }
      } catch (IllegalFormatException var4) {
         throw a(var4);
      }

      return var3;
   }

   public synchronized boolean wve(String var1) {
      return this.kyk.containsKey(var1);
   }

   public long vxy() {
      return this.zjo;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1857299082091609985L, 1219702009657678846L, MethodHandles.lookup().lookupClass()).a(229334739259529L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 38708080382620L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "ùüÊ\u0002Ï7\u001bJþÙ\u0084%¾#½u\u0086Ð\u0018h\u0081Æ}j¨ä=´E£\u001b\u009b1g\u008a2\u001f¹\u0099U\u0010Ì*4¢w\u0090V\u0006ñ\u0094ÙÜ®\u00adÃÍ";
      int var6 = "ùüÊ\u0002Ï7\u001bJþÙ\u0084%¾#½u\u0086Ð\u0018h\u0081Æ}j¨ä=´E£\u001b\u009b1g\u008a2\u001f¹\u0099U\u0010Ì*4¢w\u0090V\u0006ñ\u0094ÙÜ®\u00adÃÍ"
         .length();
      char var3 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[4];
                     nbv = Pattern.compile(a<"b">(2022, 8668513307422819804L ^ var9));
                     ye6 = Splitter.on('=').limit(2);
                     qr4 = new lpw();
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "Í\u0086¦\u0098\u0092òë\u008fýW\u0091\u0005SYrõSÉ¸¬£]s\u00919ë\u0092Æ\u0019hÐI@Ý×\u008aéCÑ\u0013Õy°\u0086ØIÄFãÒ\u0081óy\u001e\u0006jL½Îy£\u0005\u0083K{ 9Ðz\u00166Wº9+©w~\u0017\u0003ÂË¶´ëKÅBhf\u009eÿñ[÷ÊC";
                  var6 = "Í\u0086¦\u0098\u0092òë\u008fýW\u0091\u0005SYrõSÉ¸¬£]s\u00919ë\u0092Æ\u0019hÐI@Ý×\u008aéCÑ\u0013Õy°\u0086ØIÄFãÒ\u0081óy\u001e\u0006jL½Îy£\u0005\u0083K{ 9Ðz\u00166Wº9+©w~\u0017\u0003ÂË¶´ëKÅBhf\u009eÿñ[÷ÊC"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10128;
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
            throw new RuntimeException("lpw", var10);
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
         throw new RuntimeException("lpw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
