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

public class nlh extends Module {
   public static ModeSetting fam;
   public static NumberSetting din;
   public static NumberSetting wre;
   public static NumberSetting f6y;
   public static NumberSetting fja;
   public static NumberSetting coo;
   public static NumberSetting hm4;
   public static NumberSetting ebm;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public nlh() {
      long var1 = a ^ 74544897336918L;
      super(b<"l">(19961, 4236806314539989461L ^ var1), _aj.sxc, fam);
      this.r6x = true;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8409599307827340088L, -3460969310075790190L, MethodHandles.lookup().lookupClass()).a(247841054334713L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 62021342781173L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[29];
      int var5 = 0;
      String var4 = "\u008c\u0089!×'MØ\u0080ý\u009eàçr\u000fsc\u0010\t,VÆª4öi2ª|ñK\u0011Éý\u0010WÏ0\u0006i=s\u0081\u0090\u000fU×ºr¦° >\u0015\u0087ôéÚ'\u0014\u00956«¸\u009b\u0087Qº\u009a\u009e\nï^\u001bËñ\u000e¸¶{¬\u0088\u001e\u0011\u0018\u0011b\u0086W\u009dI\u009fG×ás&{\u008e\b°NCr\u0090_Õè+\u0018\u0081QD*ö<\u0097SénüýÕ\u0097õ¸Öa°X2\u0081ëý\u0010~\u0014ØY\u008c\u001d\u0099\u0088q\u0010¹\u0002©ôI4\u0010ööJw\u0085õ$ºÎfL}4\u0000ì\t(az\u008b©\u009c¤Ìr\u0003°\u0004;°\u00927\u000fé'£,o%àX°É6¿¹_E²\u00adr0±b\u0017zW\u0010µÏ\bUÚ\u0013Ñ¢â\u00adnÄÛ:Oa\u0010\u009c\u00905¥û\u0089\u009bw¹«»2¨\u0011\u0082O )Å7ñ\u0085°9ÁVïòFÒ$Æ\u0098ë9\u0085\u0018°R\u0003àp\u001dÃ²\u007fIv´ P\u00ad7çE¡b\u001dý<9\u0005\u0086ªËeãGØ@Ã_É4\u0086\u0006I[6ð¹k\u0010¤ü\t\u0012±î\u009eâ=_|\u0091N\u0006äÔ\u0010Cxë\u0095\u009d'\u00017Ô\u0003c%\u0086Ç\u008c,\u0010ÜFíEÇ½¼\u009d\u0018þå·®,\u0011ý\u0018¡#|6ë0g}¸ù.OÑ·E\u001eó\u000bÊüË]Lb\u0018w{¤\u00ad\u008aUaT\u0000B~Lù\u001d\u0081\u0096æPx7\u001bÊJþ\u0010Íù«\u0090\u008eëY\u0014Ø\u007fÃ¤ºZÅn\u0010õüT#Q\u0012HÌØC¨\u007f\u0091¢Ú\u0092\u0010ÓÉ%ö\u0011\u0011¢k\u009fó\u0014 !x\u0005\u0010\u0010\u0093Ì\u0092¨0\u0084ÄC8Ë|\"±\u001a\u009b´\u0018\u001e\u0012àÇ®ÐÓßí_\u001d¤+¥×Z\u008cõ®Cx \u001c\u009f\u00109ÚLÅ¹ÞXJ/:?û\u009b±¦\u000b\u0018\u008e\u0005×?¸1Ø¿\u0082ïwB$\t\u001f,\u0012)g]\u00029ÝJ\u0010\u00029\u001dÃ\u009f\náñiÙ\u0091-¯B\u001dÜ\u0018úÇ³â\u0091B!ö?ðÆ`Ã\u0003Wz|\u0000qö£i±\u0080";
      int var6 = "\u008c\u0089!×'MØ\u0080ý\u009eàçr\u000fsc\u0010\t,VÆª4öi2ª|ñK\u0011Éý\u0010WÏ0\u0006i=s\u0081\u0090\u000fU×ºr¦° >\u0015\u0087ôéÚ'\u0014\u00956«¸\u009b\u0087Qº\u009a\u009e\nï^\u001bËñ\u000e¸¶{¬\u0088\u001e\u0011\u0018\u0011b\u0086W\u009dI\u009fG×ás&{\u008e\b°NCr\u0090_Õè+\u0018\u0081QD*ö<\u0097SénüýÕ\u0097õ¸Öa°X2\u0081ëý\u0010~\u0014ØY\u008c\u001d\u0099\u0088q\u0010¹\u0002©ôI4\u0010ööJw\u0085õ$ºÎfL}4\u0000ì\t(az\u008b©\u009c¤Ìr\u0003°\u0004;°\u00927\u000fé'£,o%àX°É6¿¹_E²\u00adr0±b\u0017zW\u0010µÏ\bUÚ\u0013Ñ¢â\u00adnÄÛ:Oa\u0010\u009c\u00905¥û\u0089\u009bw¹«»2¨\u0011\u0082O )Å7ñ\u0085°9ÁVïòFÒ$Æ\u0098ë9\u0085\u0018°R\u0003àp\u001dÃ²\u007fIv´ P\u00ad7çE¡b\u001dý<9\u0005\u0086ªËeãGØ@Ã_É4\u0086\u0006I[6ð¹k\u0010¤ü\t\u0012±î\u009eâ=_|\u0091N\u0006äÔ\u0010Cxë\u0095\u009d'\u00017Ô\u0003c%\u0086Ç\u008c,\u0010ÜFíEÇ½¼\u009d\u0018þå·®,\u0011ý\u0018¡#|6ë0g}¸ù.OÑ·E\u001eó\u000bÊüË]Lb\u0018w{¤\u00ad\u008aUaT\u0000B~Lù\u001d\u0081\u0096æPx7\u001bÊJþ\u0010Íù«\u0090\u008eëY\u0014Ø\u007fÃ¤ºZÅn\u0010õüT#Q\u0012HÌØC¨\u007f\u0091¢Ú\u0092\u0010ÓÉ%ö\u0011\u0011¢k\u009fó\u0014 !x\u0005\u0010\u0010\u0093Ì\u0092¨0\u0084ÄC8Ë|\"±\u001a\u009b´\u0018\u001e\u0012àÇ®ÐÓßí_\u001d¤+¥×Z\u008cõ®Cx \u001c\u009f\u00109ÚLÅ¹ÞXJ/:?û\u009b±¦\u000b\u0018\u008e\u0005×?¸1Ø¿\u0082ïwB$\t\u001f,\u0012)g]\u00029ÝJ\u0010\u00029\u001dÃ\u009f\náñiÙ\u0091-¯B\u001dÜ\u0018úÇ³â\u0091B!ö?ðÆ`Ã\u0003Wz|\u0000qö£i±\u0080"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[29];
                     fam = new ModeSetting(
                        b<"l">(6721, 4507863546626643663L ^ var9),
                        b<"l">(23571, 4190825714376691846L ^ var9),
                        b<"l">(31994, 3731317360208015460L ^ var9),
                        new String[]{
                           b<"l">(15633, 4037344555821773197L ^ var9),
                           b<"l">(1273, 3506037702310955122L ^ var9),
                           b<"l">(7400, 2198757562287001696L ^ var9),
                           b<"l">(18929, 5317715533366347110L ^ var9),
                           b<"l">(9587, 6104447162104261110L ^ var9),
                           b<"l">(32227, 1223354464479244654L ^ var9),
                           b<"l">(2742, 8982036265974924838L ^ var9),
                           b<"l">(323, 1138927098387762654L ^ var9),
                           b<"l">(16093, 6680703415321277018L ^ var9),
                           b<"l">(29, 4878795339398810761L ^ var9),
                           b<"l">(314, 8542593599653023152L ^ var9),
                           b<"l">(11999, 5501098148872561238L ^ var9),
                           b<"l">(5071, 3080216960719822686L ^ var9),
                           b<"l">(27957, 8541684660112744878L ^ var9),
                           b<"l">(13690, 777705934545598974L ^ var9),
                           b<"l">(11989, 7700665152959423055L ^ var9),
                           b<"l">(32425, 5183366281938956859L ^ var9),
                           b<"l">(1506, 3835088054808185188L ^ var9)
                        }
                     );
                     din = new NumberSetting(b<"l">(19961, 4236852889939820918L ^ var9), b<"l">(2291, 5457586550708929632L ^ var9), 0.0F, -2.5F, 2.5F, 0.01F);
                     wre = new NumberSetting(b<"l">(19961, 4236852889939820918L ^ var9), b<"l">(7857, 8130173866003796531L ^ var9), 0.0F, -2.5F, 2.5F, 0.01F);
                     f6y = new NumberSetting(b<"l">(19961, 4236852889939820918L ^ var9), b<"l">(23084, 8585129669800416947L ^ var9), 0.0F, -2.5F, 2.5F, 0.01F);
                     fja = new NumberSetting(b<"l">(19961, 4236852889939820918L ^ var9), b<"l">(14810, 4897050760346350915L ^ var9), 0.0F, -2.5F, 2.5F, 0.01F);
                     coo = new NumberSetting(b<"l">(19961, 4236852889939820918L ^ var9), b<"l">(30837, 3979349336303629549L ^ var9), 0.0F, -2.5F, 2.5F, 0.01F);
                     hm4 = new NumberSetting(b<"l">(19961, 4236852889939820918L ^ var9), b<"l">(22109, 8921898722432080593L ^ var9), 0.0F, -2.5F, 2.5F, 0.01F);
                     ebm = new NumberSetting(b<"l">(19961, 4236852889939820918L ^ var9), b<"l">(27506, 5961311771737417700L ^ var9), 1.0F, 0.0F, 1.5F, 0.01F);
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

                  var4 = "A/ép\u0000 qÐyÚà\u009b\u0013ô¡.\u0010ÜÕZú\u0015æDY\u0007è\n]NR\fE";
                  var6 = "A/ép\u0000 qÐyÚà\u009b\u0013ô¡.\u0010ÜÕZú\u0015æDY\u0007è\n]NR\fE".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26108;
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
            throw new RuntimeException("nlh", var10);
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
         throw new RuntimeException("nlh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
