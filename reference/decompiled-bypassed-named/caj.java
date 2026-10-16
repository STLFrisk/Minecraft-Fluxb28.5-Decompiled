import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class caj {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void sgb(opt var1) {
      long var2 = a ^ 33383373470919L;
      var1.liy(new erg(xbr.xvc), new Object[]{ox_.zml, ox_.ae9, xbr.xz5});
      var1.q01(new erg(xbr.xth, 8), new Object[]{a<"u">(23196, 4190301181902914134L ^ var2), 'X', new erg(xbr.nnn, 1, qvg._fk.b9d()), '#', xbr.iqq});
      var1.q01(
         new erg(xbr.ak_),
         new Object[]{
            a<"u">(30486, 8780747283526922207L ^ var2),
            a<"u">(24657, 508405939804027037L ^ var2),
            a<"u">(10051, 7813954164231208846L ^ var2),
            'R',
            new erg(xbr.sng),
            'C',
            xbr.aar,
            'P',
            xbr.s8j,
            'M',
            ox_.zml,
            'B',
            xbr.xz5
         }
      );
      var1.q01(
         new erg(xbr.ak_),
         new Object[]{
            a<"u">(25094, 2697868655429171913L ^ var2),
            a<"u">(31892, 6204206731493450844L ^ var2),
            a<"u">(31337, 1441723563146814125L ^ var2),
            'R',
            new erg(xbr.sng),
            'C',
            xbr.aar,
            'P',
            xbr.s8j,
            'D',
            ox_.ae9,
            'B',
            xbr.xz5
         }
      );
      var1.q01(
         new erg(ox_.gdb),
         new Object[]{
            a<"u">(23683, 6439845833045935176L ^ var2), a<"u">(9986, 6796359819403460556L ^ var2), a<"u">(9986, 6796359819403460556L ^ var2), 'M', xbr.ei2
         }
      );
      var1.q01(new erg(xbr.k_k), new Object[]{"M", 'M', xbr.ei2});
      var1.q01(new erg(xbr.d0o, 4), new Object[]{"M", 'M', ox_.jzx});
      var1.liy(new erg(xbr.pb8), new Object[]{ox_.jzx, xbr.bwp, xbr.ipl});
      var1.liy(new erg(xbr.nsn), new Object[]{xbr.targetsSorted, ox_.zml, xbr.bwp});
      var1.liy(new erg(xbr.t4v, 2), new Object[]{xbr.nh7});
      var1.liy(new erg(xbr.tle), new Object[]{xbr.t4v, xbr.g77});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3210651280462754475L, 4613682451672621L, MethodHandles.lookup().lookupClass()).a(127595732562108L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 61566314798501L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "¡eL¸f\u001c\u008fà+Â\u0084&\u000f%\u000b\u008a\u0010ýt»\u0096\u008ch\u008e\u008aG\u0005¤\u0089þûç5\u0010\u0010iP[txÌ+\no=Å»Z=Ó\u0010\u0003q#\u0082\u001bYßà_tÅÔí\u001aß!\u00103\u0007ú¹1\u0086\u0015\u0095èåïC<à\"@\u0010\u0093%ï\u0086¹¯\u001e;Ú¼]cc\u008c>\n\u0010\bP][\u0004\u0098\u009cA\u009bT,p\u000f\u009aOû";
      int var8 = "¡eL¸f\u001c\u008fà+Â\u0084&\u000f%\u000b\u008a\u0010ýt»\u0096\u008ch\u008e\u008aG\u0005¤\u0089þûç5\u0010\u0010iP[txÌ+\no=Å»Z=Ó\u0010\u0003q#\u0082\u001bYßà_tÅÔí\u001aß!\u00103\u0007ú¹1\u0086\u0015\u0095èåïC<à\"@\u0010\u0093%ï\u0086¹¯\u001e;Ú¼]cc\u008c>\n\u0010\bP][\u0004\u0098\u009cA\u009bT,p\u000f\u009aOû"
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
                     c = new String[9];
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

                  var6 = "Ù¤ã\\P^5>¦«\u00ad1\u000e\u0014\u0010d\u0010-îYBK}_g\u000ey:ÿÍÐYÀ";
                  var8 = "Ù¤ã\\P^5>¦«\u00ad1\u000e\u0014\u0010d\u0010-îYBK}_g\u000ey:ÿÍÐYÀ".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6773;
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
            throw new RuntimeException("caj", var10);
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
         throw new RuntimeException("caj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
