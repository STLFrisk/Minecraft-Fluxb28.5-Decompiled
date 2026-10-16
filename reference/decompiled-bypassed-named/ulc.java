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

public enum ulc {
   public static final ulc zah;
   public static final ulc z3x;
   public static final ulc ss0;
   public static final ulc f7q;
   public static final ulc jku;
   public static final ulc m4i;
   public static final ulc gn8;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public int ubx() {
      return this.bwi;
   }

   public int jl_() {
      return this.b6t;
   }

   public String dq6() {
      return this.nva;
   }

   public ekw z28() {
      return this.dop;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7904279629124388484L, -1795461116613206537L, MethodHandles.lookup().lookupClass()).a(119268957769877L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 30895400092649L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[15];
      int var5 = 0;
      String var4 = "R\u0007b!á\tú\u0095ÜP\u0002åjÔ\u0090]\u0092\u0094j1Çâþ\"Qp¤\u0007Bu\nç\u0010\u0088F¶\u001bDJS\u0017~t\u0098uµË\u008b¯(Á±!£ð\u008b9ÈÆ_ú-`\u0006\u0080¥ôrCf+À\u008f\u0096\u0090\u001e\u0006M3\u008d\u009fAu\u0006!M\u009b|<®\u0010öÀ\u0087ÓÍR\u000e\u008aÖ\u001c£ñËÇzþ\u0018ðE\u0099?\u001b¥\u001fêü\u009aáþFüý\u001fx\u000b}ýJðõ5 nG\u0007\u00adI\u0005\u000bu\u001c@é\u0089f\f\u0090Ü\u00026\u0085ø@$G-(9úÈBÕi\u0014\u0010\u0017\"p\nHl\u0087ã\u000f\u008b\u009cNW\u0088é\u0017 @p(ë)ìMömªsã@ç*M¨\u0088r?ªÁ¡q5>âj\u007fê~\u009b\u0010ÞUSy_ETö½\u007fÓ^>\u0083\u0087) $$Øø\u00ad³}Ýl@¡í\u0083y\u0091£\u001e@\u0005 ©+²JÃõ8\u00813ÞÛv\u0010_<ö¤\u0018U\u0000¤\u0002Nh\u0085ê[<«\u0010\u007fÆ\u0011\u0001Bî\u0085\u000b\u000bnÆ\u0006\u0010(8i\u0018îtÚn\u0006Þ PhNrtv\\\u009a1×¥éäQY\u008cÑ";
      int var6 = "R\u0007b!á\tú\u0095ÜP\u0002åjÔ\u0090]\u0092\u0094j1Çâþ\"Qp¤\u0007Bu\nç\u0010\u0088F¶\u001bDJS\u0017~t\u0098uµË\u008b¯(Á±!£ð\u008b9ÈÆ_ú-`\u0006\u0080¥ôrCf+À\u008f\u0096\u0090\u001e\u0006M3\u008d\u009fAu\u0006!M\u009b|<®\u0010öÀ\u0087ÓÍR\u000e\u008aÖ\u001c£ñËÇzþ\u0018ðE\u0099?\u001b¥\u001fêü\u009aáþFüý\u001fx\u000b}ýJðõ5 nG\u0007\u00adI\u0005\u000bu\u001c@é\u0089f\f\u0090Ü\u00026\u0085ø@$G-(9úÈBÕi\u0014\u0010\u0017\"p\nHl\u0087ã\u000f\u008b\u009cNW\u0088é\u0017 @p(ë)ìMömªsã@ç*M¨\u0088r?ªÁ¡q5>âj\u007fê~\u009b\u0010ÞUSy_ETö½\u007fÓ^>\u0083\u0087) $$Øø\u00ad³}Ýl@¡í\u0083y\u0091£\u001e@\u0005 ©+²JÃõ8\u00813ÞÛv\u0010_<ö¤\u0018U\u0000¤\u0002Nh\u0085ê[<«\u0010\u007fÆ\u0011\u0001Bî\u0085\u000b\u000bnÆ\u0006\u0010(8i\u0018îtÚn\u0006Þ PhNrtv\\\u009a1×¥éäQY\u008cÑ"
         .length();
      char var3 = ' ';
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
                     c = new String[15];
                     zah = new ulc(0, a<"o">(20141, 634267727301498275L ^ var9));
                     z3x = new ulc(1, a<"o">(13599, 4706482951912959512L ^ var9));
                     ss0 = new ulc(2, a<"o">(14335, 5516086001212304631L ^ var9));
                     f7q = new ulc(3, a<"o">(10048, 2155616488560376896L ^ var9));
                     jku = new ulc(4, a<"o">(32697, 3239683544174290109L ^ var9));
                     m4i = new ulc(5, a<"o">(29725, 5644925319679274772L ^ var9));
                     gn8 = new ulc(6, a<"o">(7643, 4395873812722484953L ^ var9));
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

                  var4 = "\u001b+8\u0016W\u008ebå§ïo<þ\u0011\fÂ\u000eÜÔ\u000e1#b3ÿªùù\u000eB|) òÃZ\t\u009c\u0084 F\u0081\u0017\u0017øãç+;éÙLgÍ<]¤bî¿,ÄYo\u008e";
                  var6 = "\u001b+8\u0016W\u008ebå§ïo<þ\u0011\fÂ\u000eÜÔ\u000e1#b3ÿªùù\u000eB|) òÃZ\t\u009c\u0084 F\u0081\u0017\u0017øãç+;éÙLgÍ<]¤bî¿,ÄYo\u008e"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23322;
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
            throw new RuntimeException("ulc", var10);
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
         throw new RuntimeException("ulc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
