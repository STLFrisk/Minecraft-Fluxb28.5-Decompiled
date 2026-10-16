import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class m1c {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public m1c() {
      long var1 = a ^ 97777435449831L;
      super();
      this.k61 = a<"w">(6482, 2814694457313779738L ^ var1);
      this.mi4 = a<"w">(13400, 4790581873198484757L ^ var1);
      this.av1 = new String[]{
         a<"w">(14838, 2597070236714942639L ^ var1), a<"w">(32499, 2812898123220158394L ^ var1), a<"w">(21631, 1903952865652157747L ^ var1)
      };
      this.tru = new he9(a<"w">(16668, 953087739477407830L ^ var1));
      this.q48 = new he9(a<"w">(23444, 857966201067872972L ^ var1));

      try {
         this.tru.f64(a<"w">(22251, 564789638005501883L ^ var1), this.av1);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public iw2 zoz(iw2 var1) {
      long var2 = a ^ 117508950860943L;

      try {
         String var4 = var1.agt();
         he9 var5 = this.q48;
         var5.f64(a<"w">(15909, 9206708464223418889L ^ var2), var4);
         var5.f64(a<"w">(9421, 5375960783095161067L ^ var2), new URL(var4 + a<"w">(29048, 4621051257954743627L ^ var2)));
         var5.f64(a<"w">(4408, 4274140395150562591L ^ var2), new URL(var4 + a<"w">(21753, 202129904002404562L ^ var2)));
         var5.f64(a<"w">(10517, 5411920869084884263L ^ var2), new URL(var4 + a<"w">(3357, 6841269998393641267L ^ var2)));
         var5.f64(a<"w">(29227, 1042231828340618756L ^ var2), new URL(var4 + a<"w">(24388, 5304128779176319857L ^ var2)));
         var5.f64(a<"w">(6748, 3012269044491247211L ^ var2), new URL(var4 + a<"w">(14765, 7784189555498679680L ^ var2)));
         String var6 = var1.u07();
         he9 var7 = this.tru;
         var7.f64(a<"w">(26494, 7061707513616409428L ^ var2), var6 + a<"w">(31156, 4560225959503674780L ^ var2));
         var7.f64(a<"w">(101, 2556598675825673297L ^ var2), new URL(var6 + a<"w">(10206, 6132724446412268520L ^ var2)));
         var7.f64(a<"w">(19075, 7053220830462447264L ^ var2), new URL(var6 + a<"w">(2207, 6047473614023347382L ^ var2)));
         return var1;
      } catch (Exception var8) {
         var8.printStackTrace();
         return iw2.ot_;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2958567997911928895L, -2726742641733176107L, MethodHandles.lookup().lookupClass()).a(123913858913022L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 128545778042321L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[25];
      int var7 = 0;
      String var6 = "Àá\u001e\u0002ãÂ\u0089â\"\u008b#\u0013«çiõh-;\u0017É\u009f\u0017MWYáÿnÜ1½\u0094¹Ü{Q\u009f\u009c!\u0003^\fÝÿ¹\u0088?\u0084D EÌ@MNÊ¡A(¼\u0098v\u001e8\u00076\r¼6£\u001a\u0004\u008dBf\u0081\u0013è\u001e¯¾\u0019\u0093\u008a\u0097ÖjýÜ\u008eh\u001b®~JÙao\rïÜ\"¿\u0018õ\u001a½m\u008dZpY\"¸ìzU¡5]\u0002H\u009aBùïª\u008d`oE<O\u0000õy¢8U[¥ª¤KÆ \u0090ïG@\f¼åè\u001dËy«\u007fÕ³½\u00adÒÐ\u0091\"\u001d> \u009a^1\u0098wàwo¿ÔI¨@\u009b\u0002©H\u000fÙ§ý2.\u0095\u001a²ß.N\u0017&jÄ\u0086ÁG\u0096¸L\u0088\u0010\u009a(%²ãÖZS4÷\u0094â9À\u0018õÕ^Øzs\u0094\u0089æî\u000bàTâ0ú/yõÍ´]N¸(\u001a\u0095ï\u00943\u008c\u0096J\u0088üíÂ1(J©\u001cß\u009a\u0004Ï§Ô£,\u0096)\u0098\u008e\u00adUq\u0082ö\u0099ût\u0016\u008d3hj\u0094L\u009a\u008a\u0098Is\u0019$ì\u009d´4\nÎ\u0095Á0\u0082\u0006¶ù²dx\u009ft\u00183bõ\u0087n¯¬\u0015*á´\u009b\u0088¼\\<{M?[<eÎÉM~\u000eT\u0087é\u0085cQ\u0014&¨ÑÊ\u0082¢µ\u009aÌ¬¥;Ë\u0019\u0006~\u000eí¯ÒCwÆ(\u001fÊ¨\u0085`\u0006\u00adgÛ±\u008dêG\u0083µó¥(\u0014´\u0096·õxÑÓACt\u0095\u0003Å#ñ¥\u0004,\u0017-4\u0097s]WÐw¨®ÎÎÈ´io\u008f\u001eÆ\u0003(ZÄR1pO\u0087\u008f\u0005!É\u0000\u00002\u0097¨\u001f9ô:\u008aNJÕ¡\u009cl\u009e!±©[\u009aMÎ®\u0014\u0090\u009a·(\u0019\u001c§\u0001\u009bðè=ç\u008cT á\u0097<&D[d\u0090e*aA¯á\u0019\u0011½\"\u001e\u0082\f\u0087\n{éÍIn0k\u0091\u0092±µº\u0081f\u001f\u0016W\u009fy\u009f7díS9f\u009eöøý§¼\u008f`Í\u0088à\u007fw\u008b\u0092Û\u001adýën|tÌ<I@ß\u0018æx `K\u008d}\u001cH\u00884ïùòÿ\u0000ò©k\u0087\u0084\u008c&H \u001bí{&\u001e¿¤¢~ùÜ\u009eÒ\u008b0\u0014Á+úc\u0000«Ô:yøcÛ\u0084\u001b\u0099J I\u001bý¼²ÌÛ)\u000f´\u009d:;{(;\u001báN\u0083¤\u000e¸Ë\\Sñ\u0098-¥\u0001¸\u00109ÿ¼«¢Ä«Ù:Ý:®\u00876\u0004 \u0010Ò6\u008b7\u000f\u0014\u001e\u0081»t°Dq¡1Ð\u0018\u0010Pî\u0095\u0088¬\u000bïÄà¨j\\\u009eÄe\u0081\u00adØ©//!îh\u000f;ãqi\"å\u0082¡j$VZª³ïh²Ùð²-tBî\bE¨ìW\u008f\u0088\u001c\u001b@\u0013ëVm\u0094°8\u0081\nÊ\u008fjh\u009c)Ä;\u009d»¹ïd\u0083xx\u0010*®|\"òóÜ÷\u0003\u001d0Ì-\u001ew\u009fToåÄµR\u0011ç\u009aNUCý¯Ê\u0014ã\u0089ë\u0003©¯\u0082\u0010V½\u0087 \u000eC÷Z\u0000»\u0087ud\u001dx\u0099\u0013V/î#UA\u008b\u007fÏÇ+ï.Âï\u008f\u0000\u0007\u0018 \u009bÄ¦\u0017ý\u0019\u0094PS#[UíÁ\u0093¨\u0095\u008d\u0002\u0094ÑrC(ãÄpªPH\u009bU £Ëº\u0014¸UÍ\rq\rõ¬\u0093S£\u0015Â\u008eIÖ°r\u0082\u0016}RdMDßäN ã\"å,bÜæÍææ ß\u0080øP\u009c!Þ+.7´\u0011Q¦½Rô¬5\u0099a Mýôvú\u008aé`\u0010vÒÚëÁ)\u009dê\u000f\u0086ÿ9á}Ö\u0083²\u008c\u0088\u009e\u0089ÒÐ0¯\nC!ª\t¦\u0011\\\u0095Óp&\u0090]à¨/¶à\u008fì¶ïwæ\u0088À<à9/z\u0089Ü\u009cÙ\u008eI¾nzcG]P\u009eÀ";
      int var8 = "Àá\u001e\u0002ãÂ\u0089â\"\u008b#\u0013«çiõh-;\u0017É\u009f\u0017MWYáÿnÜ1½\u0094¹Ü{Q\u009f\u009c!\u0003^\fÝÿ¹\u0088?\u0084D EÌ@MNÊ¡A(¼\u0098v\u001e8\u00076\r¼6£\u001a\u0004\u008dBf\u0081\u0013è\u001e¯¾\u0019\u0093\u008a\u0097ÖjýÜ\u008eh\u001b®~JÙao\rïÜ\"¿\u0018õ\u001a½m\u008dZpY\"¸ìzU¡5]\u0002H\u009aBùïª\u008d`oE<O\u0000õy¢8U[¥ª¤KÆ \u0090ïG@\f¼åè\u001dËy«\u007fÕ³½\u00adÒÐ\u0091\"\u001d> \u009a^1\u0098wàwo¿ÔI¨@\u009b\u0002©H\u000fÙ§ý2.\u0095\u001a²ß.N\u0017&jÄ\u0086ÁG\u0096¸L\u0088\u0010\u009a(%²ãÖZS4÷\u0094â9À\u0018õÕ^Øzs\u0094\u0089æî\u000bàTâ0ú/yõÍ´]N¸(\u001a\u0095ï\u00943\u008c\u0096J\u0088üíÂ1(J©\u001cß\u009a\u0004Ï§Ô£,\u0096)\u0098\u008e\u00adUq\u0082ö\u0099ût\u0016\u008d3hj\u0094L\u009a\u008a\u0098Is\u0019$ì\u009d´4\nÎ\u0095Á0\u0082\u0006¶ù²dx\u009ft\u00183bõ\u0087n¯¬\u0015*á´\u009b\u0088¼\\<{M?[<eÎÉM~\u000eT\u0087é\u0085cQ\u0014&¨ÑÊ\u0082¢µ\u009aÌ¬¥;Ë\u0019\u0006~\u000eí¯ÒCwÆ(\u001fÊ¨\u0085`\u0006\u00adgÛ±\u008dêG\u0083µó¥(\u0014´\u0096·õxÑÓACt\u0095\u0003Å#ñ¥\u0004,\u0017-4\u0097s]WÐw¨®ÎÎÈ´io\u008f\u001eÆ\u0003(ZÄR1pO\u0087\u008f\u0005!É\u0000\u00002\u0097¨\u001f9ô:\u008aNJÕ¡\u009cl\u009e!±©[\u009aMÎ®\u0014\u0090\u009a·(\u0019\u001c§\u0001\u009bðè=ç\u008cT á\u0097<&D[d\u0090e*aA¯á\u0019\u0011½\"\u001e\u0082\f\u0087\n{éÍIn0k\u0091\u0092±µº\u0081f\u001f\u0016W\u009fy\u009f7díS9f\u009eöøý§¼\u008f`Í\u0088à\u007fw\u008b\u0092Û\u001adýën|tÌ<I@ß\u0018æx `K\u008d}\u001cH\u00884ïùòÿ\u0000ò©k\u0087\u0084\u008c&H \u001bí{&\u001e¿¤¢~ùÜ\u009eÒ\u008b0\u0014Á+úc\u0000«Ô:yøcÛ\u0084\u001b\u0099J I\u001bý¼²ÌÛ)\u000f´\u009d:;{(;\u001báN\u0083¤\u000e¸Ë\\Sñ\u0098-¥\u0001¸\u00109ÿ¼«¢Ä«Ù:Ý:®\u00876\u0004 \u0010Ò6\u008b7\u000f\u0014\u001e\u0081»t°Dq¡1Ð\u0018\u0010Pî\u0095\u0088¬\u000bïÄà¨j\\\u009eÄe\u0081\u00adØ©//!îh\u000f;ãqi\"å\u0082¡j$VZª³ïh²Ùð²-tBî\bE¨ìW\u008f\u0088\u001c\u001b@\u0013ëVm\u0094°8\u0081\nÊ\u008fjh\u009c)Ä;\u009d»¹ïd\u0083xx\u0010*®|\"òóÜ÷\u0003\u001d0Ì-\u001ew\u009fToåÄµR\u0011ç\u009aNUCý¯Ê\u0014ã\u0089ë\u0003©¯\u0082\u0010V½\u0087 \u000eC÷Z\u0000»\u0087ud\u001dx\u0099\u0013V/î#UA\u008b\u007fÏÇ+ï.Âï\u008f\u0000\u0007\u0018 \u009bÄ¦\u0017ý\u0019\u0094PS#[UíÁ\u0093¨\u0095\u008d\u0002\u0094ÑrC(ãÄpªPH\u009bU £Ëº\u0014¸UÍ\rq\rõ¬\u0093S£\u0015Â\u008eIÖ°r\u0082\u0016}RdMDßäN ã\"å,bÜæÍææ ß\u0080øP\u009c!Þ+.7´\u0011Q¦½Rô¬5\u0099a Mýôvú\u008aé`\u0010vÒÚëÁ)\u009dê\u000f\u0086ÿ9á}Ö\u0083²\u008c\u0088\u009e\u0089ÒÐ0¯\nC!ª\t¦\u0011\\\u0095Óp&\u0090]à¨/¶à\u008fì¶ïwæ\u0088À<à9/z\u0089Ü\u009cÙ\u008eI¾nzcG]P\u009eÀ"
         .length();
      char var5 = 'h';
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
                     c = new String[25];
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

                  var6 = "PbHÍÜlû¼\u0097\\.m\u000b¾óÖÀ\u0006Ìà!ð\u0013ì\u0010û|~|\u00053Ø({'\u0080\u001cÁÕ\u001a¼|è%£#|´ÚàgM\u0090`{ü\u0003p\u008c<lFÃ\u008cõÝÙ#È\u0000\u0007\"ã";
                  var8 = "PbHÍÜlû¼\u0097\\.m\u000b¾óÖÀ\u0006Ìà!ð\u0013ì\u0010û|~|\u00053Ø({'\u0080\u001cÁÕ\u001a¼|è%£#|´ÚàgM\u0090`{ü\u0003p\u008c<lFÃ\u008cõÝÙ#È\u0000\u0007\"ã"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28236;
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
            throw new RuntimeException("m1c", var10);
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
         throw new RuntimeException("m1c" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
