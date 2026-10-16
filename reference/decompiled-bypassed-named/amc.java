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

public class amc extends noz {
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public amc(l7l var1) {
      long var2 = a ^ 70964373293793L;
      super(b<"u">(3288, 4434254608656845719L ^ var2));
      this.h8r(b<"u">(16127, 8599722350256388535L ^ var2), var1.yr5);
      this.h8r(b<"u">(17118, 5699161438878467475L ^ var2), var1.xn7().rnh());
      this.h8r(b<"u">(1385, 2277401456026272295L ^ var2), var1.h7c());
      this.p7i(b<"u">(5298, 5046493975375336446L ^ var2) + var1.xn7().rnh() + b<"u">(4630, 5352119684107425119L ^ var2));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4173870279388030027L, 4083822895735249480L, MethodHandles.lookup().lookupClass()).a(29754753018120L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 56663986394751L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "\u0085\u008fA/ \u009f¶lØ¬R%\u0006\u0080~\u0011\u001c«Ô\u0084®\u0097\u001aQ¤\u001cÆÔÖ~\u0007Ù(©±Üm\"óÆ} ØhB\u008a¡\u008b[BÊ3\u000f\u0093\u0003Þ$PT5\u0084\rex\u0090,q\u001cSÏt½{0#ñ·¾ÍXB©)Ú\u0081Î/Ë\u0081^_½éMù\tÐ4nÖ*\u0084Õë¸\u008f½Ý»jn\u0002¢Ä\u0083Ä;Gké×ã\u0018«\u0002ç¬öÂ\tYØ5gà\u0081Ý\u001eØ&\u009ej\u0002S\u008f\u009bå";
      int var8 = "\u0085\u008fA/ \u009f¶lØ¬R%\u0006\u0080~\u0011\u001c«Ô\u0084®\u0097\u001aQ¤\u001cÆÔÖ~\u0007Ù(©±Üm\"óÆ} ØhB\u008a¡\u008b[BÊ3\u000f\u0093\u0003Þ$PT5\u0084\rex\u0090,q\u001cSÏt½{0#ñ·¾ÍXB©)Ú\u0081Î/Ë\u0081^_½éMù\tÐ4nÖ*\u0084Õë¸\u008f½Ý»jn\u0002¢Ä\u0083Ä;Gké×ã\u0018«\u0002ç¬öÂ\tYØ5gà\u0081Ý\u001eØ&\u009ej\u0002S\u008f\u009bå"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     f = var9;
                     g = new String[6];
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

                  var6 = "àûIv\u0099º\rÚGÍ÷n RÏÃ¬°\u0084Í\u0017\u000b¢Ç 0o\u0010»½\u009d\u001cù\u0010$¨Î/|\u001c\u0018w\u0087Óu¢Nð!ªZ\u0011÷\u009d¡@\u0096";
                  var8 = "àûIv\u0099º\rÚGÍ÷n RÏÃ¬°\u0084Í\u0017\u000b¢Ç 0o\u0010»½\u009d\u001cù\u0010$¨Î/|\u001c\u0018w\u0087Óu¢Nð!ªZ\u0011÷\u009d¡@\u0096"
                     .length();
                  var5 = 24;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2225;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("amc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("amc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
