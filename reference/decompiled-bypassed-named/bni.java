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

public class bni {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public bni() {
      long var1 = a ^ 82277915612947L;
      super();
      this.zkd = new String[][]{
         {a<"k">(1359, 4993967726669261201L ^ var1), a<"k">(11883, 6488657855315952306L ^ var1), a<"k">(23924, 2497380508250976686L ^ var1)},
         {"X", "#", "#"},
         {a<"k">(32615, 2454920967987467194L ^ var1), a<"k">(15279, 3562275307269117815L ^ var1), a<"k">(18436, 8355322317454746836L ^ var1)},
         {a<"k">(75, 2486192570618571924L ^ var1), a<"k">(25030, 375670979308326170L ^ var1), a<"k">(25030, 375670979308326170L ^ var1)}
      };
      this.zzm = new Object[][]{
         {ox_.wb7, ox_.a3_, xbr.icz, xbr.exg, xbr.jtr},
         {xbr.xcf, xbr.cp_, xbr.l4f, xbr.ihl, xbr.a4b},
         {xbr.im7, xbr.aa0, xbr.p91, xbr.wsp, xbr.uky},
         {xbr.l_0, xbr.u_x, xbr.aec, xbr.ki4, xbr.vyj},
         {xbr.imv, xbr.ns2, xbr.mim, xbr.qtu, xbr.t22}
      };
   }

   public void fjp(opt var1) {
      long var2 = a ^ 95740744829242L;

      for (int var4 = 0; var4 < this.zzm[0].length; var4++) {
         Object var5 = this.zzm[0][var4];

         for (int var6 = 0; var6 < this.zzm.length - 1; var6++) {
            u7m var7 = (u7m)this.zzm[var6 + 1][var4];
            var1.q01(new erg(var7), new Object[]{this.zkd[var6], '#', xbr.t1j, 'X', var5});
         }
      }

      var1.q01(new erg(xbr.qsl), new Object[]{a<"k">(25030, 375693246310929203L ^ var2), a<"k">(5758, 9110429169444463756L ^ var2), '#', xbr.icz});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7555105542451578283L, 9183131385485550682L, MethodHandles.lookup().lookupClass()).a(224498652268242L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 570326403975L;
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
      String var6 = "_\u0017±$<³W1ÕÞÚ¼¦\u008d\u008a/\u0010äA¨´\u001fý\u001fñ«\u0004Y\u009a-l_\b\u00104íf\u0003ì·ÿ\u0095\u0096\u0083\u000bdÝ\u0091%Á\u0010in\u009e\u009dÓV}\u0083\u0000\u0082f·µn¥\u0094\u0010h¦g\u008b\u00adõæï`¥°.ÉGµñ\u0010\f£V\u0011\u00adÛÁE®\u0001æ\u0089½åÖì\u0010q,\u0084b\u008bàYÂ\u0080V¨ßß,\u0006ß";
      int var8 = "_\u0017±$<³W1ÕÞÚ¼¦\u008d\u008a/\u0010äA¨´\u001fý\u001fñ«\u0004Y\u009a-l_\b\u00104íf\u0003ì·ÿ\u0095\u0096\u0083\u000bdÝ\u0091%Á\u0010in\u009e\u009dÓV}\u0083\u0000\u0082f·µn¥\u0094\u0010h¦g\u008b\u00adõæï`¥°.ÉGµñ\u0010\f£V\u0011\u00adÛÁE®\u0001æ\u0089½åÖì\u0010q,\u0084b\u008bàYÂ\u0080V¨ßß,\u0006ß"
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

                  var6 = "Lcb\rl\u008d¥²\u009eæÙnoÜ\b-\u0010\u00advm¥ÕÖÛ×tÌ°U¹çpF";
                  var8 = "Lcb\rl\u008d¥²\u009eæÙnoÜ\b-\u0010\u00advm¥ÕÖÛ×tÌ°U¹çpF".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30766;
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
            throw new RuntimeException("bni", var10);
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
         throw new RuntimeException("bni" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
