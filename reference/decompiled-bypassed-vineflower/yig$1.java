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

public class yig$1 extends m75 {
   public final yig _ef;
   private static final long b;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public yig$1(yig var1) {
      this._ef = var1;
   }

   @Override
   public zlz htt(zfz var1) {
      long var2 = b ^ 16276087109671L;
      ywl$iai var4 = (ywl$iai)var1.dil(ywl._tj);

      try {
         switch (yig$8.q75[var4.ordinal()]) {
            case 1:
            default:
               return new zlz(a<"r">(11711, 1433387369029449610L ^ var2), a<"r">(14714, 2269504333529391942L ^ var2));
            case 2:
               return new zlz(a<"r">(22033, 8020452516212886574L ^ var2), a<"r">(12118, 5113336140679656808L ^ var2));
            case 3:
               return new zlz(a<"r">(22806, 2456065422044513070L ^ var2), a<"r">(9888, 8071507905661615257L ^ var2));
            case 4:
               return new zlz(a<"r">(27472, 4905991823998972266L ^ var2), a<"r">(23524, 6387897144294818265L ^ var2));
            case 5:
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return new zlz(a<"r">(27472, 4905991823998972266L ^ var2), a<"r">(1559, 8801755035824921644L ^ var2));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3033693169131556639L, -6914729747621774481L, MethodHandles.lookup().lookupClass()).a(62646434333399L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 4780082659004L;
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
      String var6 = "³òÎÌ~¿x©üg\u0095\fµ\u0088´\u009e\u0010\"µE¬ [SÇoq\u0095\u000b\u00adóÆT(Ç*HiX&\u008dé]\u009d\u0098©at\u0080 é]À?G\u009a[â\u0018WxÐÞÍÏ}f\u0012Ö®º\u008b!\"\u0010\u0083!\u0014\u008cjø\u0012\r`·TÕF´tÿ\u0010ú>ä»°\b\u0005nR9.ÛËe)O \u0011Ó_Òr\u00149\u00176£ç¶«î\u0099ñ¿·\u0006³Õª\u0088'Y|:©\u008bJnÍ\u0010\u0097AÕGÊx)é\u00927c¦xï\rå";
      int var8 = "³òÎÌ~¿x©üg\u0095\fµ\u0088´\u009e\u0010\"µE¬ [SÇoq\u0095\u000b\u00adóÆT(Ç*HiX&\u008dé]\u009d\u0098©at\u0080 é]À?G\u009a[â\u0018WxÐÞÍÏ}f\u0012Ö®º\u008b!\"\u0010\u0083!\u0014\u008cjø\u0012\r`·TÕF´tÿ\u0010ú>ä»°\b\u0005nR9.ÛËe)O \u0011Ó_Òr\u00149\u00176£ç¶«î\u0099ñ¿·\u0006³Õª\u0088'Y|:©\u008bJnÍ\u0010\u0097AÕGÊx)é\u00927c¦xï\rå"
         .length();
      char var5 = 16;
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
                     d = var9;
                     e = new String[9];
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

                  var6 = "î\u007f\u0000\u0093L\rY}\u0019Ã¿CgH=\u001cIÍôAq-ýÖ\u0018¯l¦\u001aJ\u0085*MÃ<ïCüêÒÚ\u009d6B\u001bGät\u0004";
                  var8 = "î\u007f\u0000\u0093L\rY}\u0019Ã¿CgH=\u001cIÍôAq-ýÖ\u0018¯l¦\u001aJ\u0085*MÃ<ïCüêÒÚ\u009d6B\u001bGät\u0004".length();
                  var5 = 24;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27982;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("yig$1", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("yig$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
