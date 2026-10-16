import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class e1i$5 implements Callable {
   public final e1i koi;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public e1i$5(e1i var1) {
      this.koi = var1;
   }

   public String call() {
      long var1 = a ^ 136680154998075L;
      Runtime var3 = Runtime.getRuntime();
      long var4 = var3.maxMemory();
      long var6 = var3.totalMemory();
      long var8 = var3.freeMemory();
      long var10 = var4 / 1024L / 1024L;
      long var12 = var6 / 1024L / 1024L;
      long var14 = var8 / 1024L / 1024L;
      return var8
         + a<"m">(17576, 7608071302590175083L ^ var1)
         + var14
         + a<"m">(9515, 3020202071894849258L ^ var1)
         + var6
         + a<"m">(3442, 885208097990500018L ^ var1)
         + var12
         + a<"m">(21711, 4940447013372200717L ^ var1)
         + var4
         + a<"m">(3442, 885208097990500018L ^ var1)
         + var10
         + a<"m">(24364, 2420563929693687016L ^ var1);
   }

   @Override
   public Object call() {
      return this.call();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8254308151726235118L, 8816096053527964629L, MethodHandles.lookup().lookupClass()).a(163358249983375L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 6099600704763L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "\u0082îs~±}¢©çÆ÷Ó\u009bHÑJÓ\n\u0019çoÀrÓ ñä\"üTV(\u0010Xl\u0010ÄRÌ\u0019\u008bî|JÂR»à\u0098\u0018¾\u001d\u000eIª\u009båG@\u0096\u001bè\u0012tR\u00182Ï\u0083ÓR\u0084K\u0016";
      int var8 = "\u0082îs~±}¢©çÆ÷Ó\u009bHÑJÓ\n\u0019çoÀrÓ ñä\"üTV(\u0010Xl\u0010ÄRÌ\u0019\u008bî|JÂR»à\u0098\u0018¾\u001d\u000eIª\u009båG@\u0096\u001bè\u0012tR\u00182Ï\u0083ÓR\u0084K\u0016"
         .length();
      char var5 = ' ';
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
                     c = new String[5];
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

                  var6 = "ãñ\u0016ë=ª\u0003å¤2\u0084\u0089\u0098ÒEø\u0011ö>Ú|\u0017CE´@Î\fe\u001dÁK\u0010Gbi.7à¤0î\u0003»Ñ\u0089ç|E";
                  var8 = "ãñ\u0016ë=ª\u0003å¤2\u0084\u0089\u0098ÒEø\u0011ö>Ú|\u0017CE´@Î\fe\u001dÁK\u0010Gbi.7à¤0î\u0003»Ñ\u0089ç|E".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21667;
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
            throw new RuntimeException("e1i$5", var10);
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
         throw new RuntimeException("e1i$5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
