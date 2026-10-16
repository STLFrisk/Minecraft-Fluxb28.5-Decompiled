import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vb2 {
   public String i8e;
   public String ljq;
   public String in_;
   public String soy;
   public String i_6;
   public String grb;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public vb2(String var1, String var2, String var3, String var4, String var5, String var6) {
      this.i8e = var1;
      this.ljq = var2;
      this.in_ = var3;
      this.soy = var4;
      this.i_6 = var5;
      this.grb = var6;
   }

   public String _2d() {
      long var1 = a ^ 115145142658685L;
      String[] var3 = new String[]{
         a<"k">(23884, 426301106042997627L ^ var1)
            + this.in_
            + a<"k">(16046, 1302067650490722436L ^ var1)
            + this.i8e
            + a<"k">(26378, 5023439923212267818L ^ var1)
            + this.soy
            + a<"k">(25109, 7525386772200600623L ^ var1),
         "我"
            + this.grb
            + a<"k">(2767, 4183785433656450302L ^ var1)
            + this.i8e
            + a<"k">(5511, 8049222302413865896L ^ var1)
            + this.in_
            + a<"k">(26245, 6604072714528862375L ^ var1)
            + this.soy
            + a<"k">(30477, 6274158558803763506L ^ var1)
            + this.ljq
            + a<"k">(6926, 9192488524686478647L ^ var1)
            + a<"k">(2790, 89303161048587482L ^ var1)
            + a<"k">(7750, 7765294613572175970L ^ var1),
         a<"k">(21170, 5718226811242316928L ^ var1)
            + this.i8e
            + a<"k">(19156, 6881564285898431731L ^ var1)
            + this.in_
            + "在"
            + this.soy
            + a<"k">(14582, 533785964504575711L ^ var1)
            + this.ljq,
         "我" + this.i8e + "在" + this.soy + a<"k">(8042, 3287351753789917516L ^ var1),
         a<"k">(1970, 7486355386565022108L ^ var1)
            + this.i8e
            + a<"k">(9722, 229127257455522761L ^ var1)
            + this.soy
            + a<"k">(13792, 6695300441931998174L ^ var1),
         a<"k">(5158, 2126335216126738954L ^ var1)
            + this.i8e
            + a<"k">(2603, 7544082407975967752L ^ var1)
            + this.in_
            + a<"k">(30995, 681431217320472382L ^ var1)
            + this.ljq,
         a<"k">(13944, 6447787189450694749L ^ var1)
            + this.i8e
            + " "
            + this.soy
            + a<"k">(14064, 4345033294773706944L ^ var1)
            + this.in_
            + a<"k">(22158, 2697125440309002405L ^ var1)
            + this.ljq,
         a<"k">(24928, 4914404750386214728L ^ var1) + this.i8e + a<"k">(16971, 8613412117755597939L ^ var1) + this.ljq,
         a<"k">(20615, 8223496424575600306L ^ var1)
            + this.i8e
            + a<"k">(8581, 1127861917132814259L ^ var1)
            + this.soy
            + a<"k">(11030, 7375753647794519315L ^ var1),
         a<"k">(24975, 5035080610671278004L ^ var1)
            + this.i8e
            + a<"k">(9722, 229127257455522761L ^ var1)
            + this.soy
            + a<"k">(21228, 3467038134516417745L ^ var1)
            + a<"k">(1127, 8187828792693510739L ^ var1)
            + a<"k">(11512, 91988093915986649L ^ var1)
            + this.ljq
      };
      return var3[new Random().nextInt(var3.length)];
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8660368627478342750L, 8339660864533108426L, MethodHandles.lookup().lookupClass()).a(228378545830676L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 128042014046159L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[33];
      int var7 = 0;
      String var6 = "È1z\u008c^ÄÇIìÍ¡3ë]ÂU ð\\\u0094p%ªºC²½\u009bôg£\u0098¾à¡WÔ÷}\u0004`ç-\u0015úgZÝ\u009f\u0018%ýWX\u0092íòÔ\u0082y}a´å©öE0b\u009eLú\u008d{@\u009f?¨\u0085E[\u0093ìË½û2Üs)\u009e\u0098\u0006rÚq\r\u001eë~C\u001bPÍ4`UN\b\u0091ø(Á\u001cM\u0080ßG`\u00178\u0007A*ÿ<è;\u000e@\r\b?Tý-gA\u001f\u0018\u0012\u0097$2\f\u0001@}{ÔìîÍ¼\u008fðdÍj4ª\u0086E¼ \u001aHYÌ\u000e!\u0011ËK\u008bqú¿sÀ]©kH5\u0086,k|)9\u0019ìd2\r[ Ïá3LëÝZHd6m\u0002É9zÄª\t<\u0006²!gÝg[Â»\u0084ÖCy\u0010lÅl£\u008a<\u009f\u007fmø\u0000c86\u009fz0Q\u00810ü6ûE\u0083qÒ±m5HùwGÜôÂ\u0002Ê\u000f\u0010\u0091\u0081\u0085\u0085|j!\u001d\u0097\u0085ãY#\u009c\u0014\u0094W\u0089»ÌéÚñÄ\u0010ib\u009b>\rVÚÂþ\u008f\u0092¸Á\u0007Ë~\u0010ÓÀÝ#\u001a\u0082Þ,_\u0019\u008fÝÏ\u00075© \u00ad©¬l±\u0097Å\u0090Æ¤\u0019¼\u001b]\u0018\u009d\u000bÛô'ð³\u0081·ÀÓ0ÞÜc°S(0EG,\u00111®\u0099\u0012ü¡\u001eû\u0013Ôæ\u0013¡ýv#xðó\u0004:@\u0007Èþº\u001d×7©J$\u001a3*\u0018¤ÄÔ}\u0000\u0088¥+ëi\u0016¶ÀÒ!\u008cÀ]ÉLNúm\u008b8\u0087{ZÍP\u00871©ä¾Ú\u009bH~´¢:ÚòðëN]\u009f\u0019ß7wõn~1¸¶t#Û×\u0001å\u001a\u0014S\u0004\u0091ýC5g>*h?x)¢\u0010|£SCõp÷ì×å\u00923Í\u008b 6\u0018Åê\u0011_Î\u009d½à5#\u0015Wtþ\u001eÇ`³=°ÒôRô L>®\u00ad\u0095ÂWõKM¤½>\u0082\u0016Ê·\r\u0007\u008bÚ\"¼ü\u0001\u009c\u0000¥}\u008cDq\u0010O\u008eÉ\u0085Ù+Z7ÊÚt<ýy\u0087X\u0010ð°¸Î\u0017¥Ø\u008f`ïjæÕp\u008aX\u0010c¨ñ\u0000B\u0099pÁwöiÛipñ58\u0094\u009c)\u0084\u00189\u0085Ñ\u009f?~\u0099ìåÊ\u0006Õn3\u0014\u0006Wg\u0004\u007fÜmN Ë½>½ðfßmë/á±{\u0092JÐ¤\u001f\u009dHr\u0094s¼\u0011m'\u0010³_\u007f\u001eÆDQ(³\u0019þ\u0093Ør\u009d{\u0010\u0089CQ\u000b\u009e\u0014\u0089\u0092\u009cqlüðXþóHºI,\u0016ö\bÿW5\u001b\u00182G\u0005°\u0086Ï?8Ô}:J¸M\u0099Î}5ù¢Ìª½\u009aÛkR\u001fü\u001f\u0007\u0083/a\r¬6\f}\\\u009eêi\\æl®8¢«\u008e*ëh£«æÎ\u0081$f \u0081\u001c¦\u000bú\u000e·\u001fcw\u008cÊ«ÜÄ}B?\u0091\u0097ûx+Ýõ~\u001cXI°\bP\u0010#\u0005± R=ÛOä±ûâè\u0080h8P¯&.?6\u001f\u0002^@ø;adë\\ùM2MoªFW«´\u009d.wàzÕ\u0004d¾iÀ\u0097\u0001@Ð¢g\b·¶IZ\u008b\u009d*'\bà¯û\u0000ï[\u0014£\u0096\u000eø\u0085Ù}TÅT×ß^õ\u0098\u0013¹K`î\u0084 á÷x?I \u0018$(ÆG±pMØbMXø\u00ad9\u0084\u008fj\u0082éãäJª\u0003â`\u009aã;\u0097²BBtIø\u0089\u009f7ôâ\\ê\u0012þ\u000bâ\u0082\u009f 1\u008eË\u0092\rß?øzÎ?\u0095Î¬\"´?óræé\u0000Ç^¿GØ@«\u0087\u0006hÍk\u001e\u0085\u0093/\u0015\u0082Y3Ò·\u008bx|\u009c\u0092íh\u0085\u0097ì AÇÍ:¼\u0014ÔkÙ\u0087\u009a|$ÉÙD\u009f\u0010=¥EâE$)\u008cp\u0003$~qS\u008cF";
      int var8 = "È1z\u008c^ÄÇIìÍ¡3ë]ÂU ð\\\u0094p%ªºC²½\u009bôg£\u0098¾à¡WÔ÷}\u0004`ç-\u0015úgZÝ\u009f\u0018%ýWX\u0092íòÔ\u0082y}a´å©öE0b\u009eLú\u008d{@\u009f?¨\u0085E[\u0093ìË½û2Üs)\u009e\u0098\u0006rÚq\r\u001eë~C\u001bPÍ4`UN\b\u0091ø(Á\u001cM\u0080ßG`\u00178\u0007A*ÿ<è;\u000e@\r\b?Tý-gA\u001f\u0018\u0012\u0097$2\f\u0001@}{ÔìîÍ¼\u008fðdÍj4ª\u0086E¼ \u001aHYÌ\u000e!\u0011ËK\u008bqú¿sÀ]©kH5\u0086,k|)9\u0019ìd2\r[ Ïá3LëÝZHd6m\u0002É9zÄª\t<\u0006²!gÝg[Â»\u0084ÖCy\u0010lÅl£\u008a<\u009f\u007fmø\u0000c86\u009fz0Q\u00810ü6ûE\u0083qÒ±m5HùwGÜôÂ\u0002Ê\u000f\u0010\u0091\u0081\u0085\u0085|j!\u001d\u0097\u0085ãY#\u009c\u0014\u0094W\u0089»ÌéÚñÄ\u0010ib\u009b>\rVÚÂþ\u008f\u0092¸Á\u0007Ë~\u0010ÓÀÝ#\u001a\u0082Þ,_\u0019\u008fÝÏ\u00075© \u00ad©¬l±\u0097Å\u0090Æ¤\u0019¼\u001b]\u0018\u009d\u000bÛô'ð³\u0081·ÀÓ0ÞÜc°S(0EG,\u00111®\u0099\u0012ü¡\u001eû\u0013Ôæ\u0013¡ýv#xðó\u0004:@\u0007Èþº\u001d×7©J$\u001a3*\u0018¤ÄÔ}\u0000\u0088¥+ëi\u0016¶ÀÒ!\u008cÀ]ÉLNúm\u008b8\u0087{ZÍP\u00871©ä¾Ú\u009bH~´¢:ÚòðëN]\u009f\u0019ß7wõn~1¸¶t#Û×\u0001å\u001a\u0014S\u0004\u0091ýC5g>*h?x)¢\u0010|£SCõp÷ì×å\u00923Í\u008b 6\u0018Åê\u0011_Î\u009d½à5#\u0015Wtþ\u001eÇ`³=°ÒôRô L>®\u00ad\u0095ÂWõKM¤½>\u0082\u0016Ê·\r\u0007\u008bÚ\"¼ü\u0001\u009c\u0000¥}\u008cDq\u0010O\u008eÉ\u0085Ù+Z7ÊÚt<ýy\u0087X\u0010ð°¸Î\u0017¥Ø\u008f`ïjæÕp\u008aX\u0010c¨ñ\u0000B\u0099pÁwöiÛipñ58\u0094\u009c)\u0084\u00189\u0085Ñ\u009f?~\u0099ìåÊ\u0006Õn3\u0014\u0006Wg\u0004\u007fÜmN Ë½>½ðfßmë/á±{\u0092JÐ¤\u001f\u009dHr\u0094s¼\u0011m'\u0010³_\u007f\u001eÆDQ(³\u0019þ\u0093Ør\u009d{\u0010\u0089CQ\u000b\u009e\u0014\u0089\u0092\u009cqlüðXþóHºI,\u0016ö\bÿW5\u001b\u00182G\u0005°\u0086Ï?8Ô}:J¸M\u0099Î}5ù¢Ìª½\u009aÛkR\u001fü\u001f\u0007\u0083/a\r¬6\f}\\\u009eêi\\æl®8¢«\u008e*ëh£«æÎ\u0081$f \u0081\u001c¦\u000bú\u000e·\u001fcw\u008cÊ«ÜÄ}B?\u0091\u0097ûx+Ýõ~\u001cXI°\bP\u0010#\u0005± R=ÛOä±ûâè\u0080h8P¯&.?6\u001f\u0002^@ø;adë\\ùM2MoªFW«´\u009d.wàzÕ\u0004d¾iÀ\u0097\u0001@Ð¢g\b·¶IZ\u008b\u009d*'\bà¯û\u0000ï[\u0014£\u0096\u000eø\u0085Ù}TÅT×ß^õ\u0098\u0013¹K`î\u0084 á÷x?I \u0018$(ÆG±pMØbMXø\u00ad9\u0084\u008fj\u0082éãäJª\u0003â`\u009aã;\u0097²BBtIø\u0089\u009f7ôâ\\ê\u0012þ\u000bâ\u0082\u009f 1\u008eË\u0092\rß?øzÎ?\u0095Î¬\"´?óræé\u0000Ç^¿GØ@«\u0087\u0006hÍk\u001e\u0085\u0093/\u0015\u0082Y3Ò·\u008bx|\u009c\u0092íh\u0085\u0097ì AÇÍ:¼\u0014ÔkÙ\u0087\u009a|$ÉÙD\u009f\u0010=¥EâE$)\u008cp\u0003$~qS\u008cF"
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
                     c = new String[33];
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

                  var6 = "æÆu¬õzÊù\u000e±\u009ab\u0097{+¹\u0014,\u001f\u0083>\u009a\u0085îK}\b!2!Ì¢¨|+Æ6¼w\u009c\u0098<\u0096BÒx\u009b\u0014Qu\r°~\u0093\u0090§º\u0084â\rðû\u0015\u0090\u009f=À¹\n\u0005Kjþ%û·\u008dQ\u0016àgg\u009131m´-\u0089®è6á¡ë\u001fM¹\u000bL\u007f\u000e÷_'ÿ\u007fB\u009e\u0083yJ÷>\u0090Ó\u0002<á Cþ·/dèÐâ\f4\u0000o|sØ©*4]¹\u001dîÚyo3Õ¸?wuqæ\u001b|;\u001béÎR8~ °\u008b\u0098\u0084SÐ\u0097qð¼z\u008cç5\u0086R\"\bÁGìÚ%uí\u009a¬á\u0004d5ÍË&ÈsD2";
                  var8 = "æÆu¬õzÊù\u000e±\u009ab\u0097{+¹\u0014,\u001f\u0083>\u009a\u0085îK}\b!2!Ì¢¨|+Æ6¼w\u009c\u0098<\u0096BÒx\u009b\u0014Qu\r°~\u0093\u0090§º\u0084â\rðû\u0015\u0090\u009f=À¹\n\u0005Kjþ%û·\u008dQ\u0016àgg\u009131m´-\u0089®è6á¡ë\u001fM¹\u000bL\u007f\u000e÷_'ÿ\u007fB\u009e\u0083yJ÷>\u0090Ó\u0002<á Cþ·/dèÐâ\f4\u0000o|sØ©*4]¹\u001dîÚyo3Õ¸?wuqæ\u001b|;\u001béÎR8~ °\u008b\u0098\u0084SÐ\u0097qð¼z\u008cç5\u0086R\"\bÁGìÚ%uí\u009a¬á\u0004d5ÍË&ÈsD2"
                     .length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25155;
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
            throw new RuntimeException("vb2", var10);
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
         throw new RuntimeException("vb2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
