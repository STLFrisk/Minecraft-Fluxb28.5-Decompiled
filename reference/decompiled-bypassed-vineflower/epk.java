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

public class epk extends IllegalArgumentException {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public epk(hsu var1, String var2) {
      long var3 = a ^ 127783082538614L;
      super(String.format(a<"f">(20379, 6902260012130451002L ^ var3), var1, var2));
   }

   public epk(hsu var1, int var2) {
      long var3 = a ^ 14729908657685L;
      super(String.format(a<"f">(19162, 6365892112189723419L ^ var3), var2, var1));
   }

   public epk(hsu var1, Throwable var2) {
      long var3 = a ^ 5317517979761L;
      super(String.format(a<"f">(4837, 3775372820733912385L ^ var3), var1), var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-357816313734086678L, -7711962976934876648L, MethodHandles.lookup().lookupClass()).a(171582624323660L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 100054243302913L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "EÊöåê\u009b\u000e\u0086D94d]-nâ\u0019*¹À+\u0095¢U¢C\u0012-×ü\u0099+ô;þ\\9»w×@BÏÞ\u0094\tç\")SâC\u007f\u0000_ý\u0081¯óA°\u0012\u001aN\u0097P¾b\f\u0097\u0080#\bz\u0081Ãì0\u000e\u001b³ÅF\u008b\u0000\u0087\u0013\u009a\u008bª\u001cïR\u000f\u008a!\u001b¶X6¨QÈ´I(_\u001cûÂ¬q\u009c¬¨\u008aÒ]éBDª©B3Û\u0090®ÀÄh4¦Ù«#ô\u0017ªÒá\t6×OÐ";
      int var8 = "EÊöåê\u009b\u000e\u0086D94d]-nâ\u0019*¹À+\u0095¢U¢C\u0012-×ü\u0099+ô;þ\\9»w×@BÏÞ\u0094\tç\")SâC\u007f\u0000_ý\u0081¯óA°\u0012\u001aN\u0097P¾b\f\u0097\u0080#\bz\u0081Ãì0\u000e\u001b³ÅF\u008b\u0000\u0087\u0013\u009a\u008bª\u001cïR\u000f\u008a!\u001b¶X6¨QÈ´I(_\u001cûÂ¬q\u009c¬¨\u008aÒ]éBDª©B3Û\u0090®ÀÄh4¦Ù«#ô\u0017ªÒá\t6×OÐ"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4018;
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
            throw new RuntimeException("epk", var10);
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
         throw new RuntimeException("epk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
