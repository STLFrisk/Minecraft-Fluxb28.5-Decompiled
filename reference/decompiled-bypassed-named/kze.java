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

public class kze extends ShaderHelper {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public void initGui() {
      long var1 = a ^ 81940581656340L;
      this.khf.clear();
      this.khf.add(new cm_(0, this.dt7 / 2 - 155, this.o1e / 4 + 120 + 12, fc1.gx1(b<"p">(12539, 386331120698671055L ^ var1), new Object[0])));
      this.khf.add(new cm_(1, this.dt7 / 2 - 155 + 160, this.o1e / 4 + 120 + 12, fc1.gx1(b<"p">(27803, 184249975953220521L ^ var1), new Object[0])));
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4._me I
      // 08: iload 2
      // 09: ifeq 3a
      // 0c: ifne 2f
      // 0f: goto 16
      // 12: invokestatic kze.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield kze.f41 Lc05;
      // 1a: new MainMenuScreen
      // 1d: dup
      // 1e: invokespecial MainMenuScreen.<init> ()V
      // 21: invokevirtual Minecraft.z2i (Lgbe;)V
      // 24: iload 2
      // 25: ifne 4c
      // 28: goto 2f
      // 2b: invokestatic kze.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: getfield gt4._me I
      // 33: goto 3a
      // 36: invokestatic kze.a (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 1
      // 3b: if_icmpne 4c
      // 3e: aload 0
      // 3f: getfield kze.f41 Lc05;
      // 42: invokevirtual Minecraft.s_l ()V
      // 45: goto 4c
      // 48: invokestatic kze.a (Loov;)Loov;
      // 4b: athrow
      // 4c: return
   }

   @Override
   public void dig(char var1, int var2) {
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      long var4 = a ^ 91105267809323L;
      this.xmz();
      this.poi(this.fex, b<"p">(24351, 3480707419767048979L ^ var4), this.dt7 / 2, this.o1e / 4 - 60 + 20, 16777215);
      this.c_t(this.fex, b<"p">(14154, 553991256634745676L ^ var4), this.dt7 / 2 - 140, this.o1e / 4 - 60 + 60 + 0, 10526880);
      this.c_t(this.fex, b<"p">(2427, 2329415729917549939L ^ var4), this.dt7 / 2 - 140, this.o1e / 4 - 60 + 60 + 18, 10526880);
      this.c_t(this.fex, b<"p">(9743, 4218989688235815430L ^ var4), this.dt7 / 2 - 140, this.o1e / 4 - 60 + 60 + 27, 10526880);
      this.c_t(this.fex, b<"p">(27286, 1942493806914813596L ^ var4), this.dt7 / 2 - 140, this.o1e / 4 - 60 + 60 + 36, 10526880);
      this.c_t(this.fex, b<"p">(29942, 3313480828414828787L ^ var4), this.dt7 / 2 - 140, this.o1e / 4 - 60 + 60 + 54, 10526880);
      this.c_t(this.fex, b<"p">(3168, 2348481717690456175L ^ var4), this.dt7 / 2 - 140, this.o1e / 4 - 60 + 60 + 63, 10526880);
      this.c_t(this.fex, b<"p">(22987, 8148357278318792143L ^ var4), this.dt7 / 2 - 140, this.o1e / 4 - 60 + 60 + 72, 10526880);
      this.c_t(this.fex, b<"p">(25246, 4857594889893688976L ^ var4), this.dt7 / 2 - 140, this.o1e / 4 - 60 + 60 + 81, 10526880);
      super.drawScreen(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3754375755163923670L, -1276475944418249446L, MethodHandles.lookup().lookupClass()).a(73028520333644L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 130574023861599L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "Ïd\u0093\u00067>\u0092!4jØ°¡\u0099Slrgá=ø¸bîÐÈ\u0015CP'3Ø \u0095\u00026\\Ã'ó\u008b\u0000×\u0010M\u00161Ûj/\u0096ë½8EÁÇÂ>\u0093·\u0090Ê9(`+ÚX\u001bÐHÖlFªçKM\u001d\u0012ê\u0012\u0093¥fáÞÒVK\u00000²\u008b\u0097\u0097f3C8 ÖªöíW\u0090o\r¶@«xnÖ8Üc\u0088@\t:¦\"'2\u000f\u0005,\tN\ræ\u0083U\u0091½ô\u000eà\fÂaå\u0081ìîM¼â\tVf\u0080pöH\u009br9¾h\nÂ\t\u0084¢p2=\"\u0094\u007f\u0006À8\u0019QÞ\u001e¼\u0001ªæ\u00069W=\u009f\u007f¸\u0013\u0016¿¹ÿU 0\u001c\u009eÄïÓ\u0087\u008djë}0^RÂ6%õS\f\u001b\u001eøàzíÆh\u0095;~Û²\u007fÓÆÆG¢ö\u0011Ap\u008c\u00adÃÒ*;\u0006\u0089ÊÐ\\\u0081Ö\u0003\u0018\f\u0080¸mW,\u00ad\u008c\u0004qP\u0083ì\u0090é¤¢¬\u0081½\u00911\u0083[\rQù\u0095Ýï\u0099ö\u0090£ég\u0018Ññ\u00880Jù\u009cûÑ7KqÓ\bîý\u008chÛ\"AS\u009b\u000b\fP¹ç\\¢-²øµ\u001cµ#\u009b \u001bñª+\u001d¿øýt\u0092\u001eu\u001dº¾PT\u0001£\u0080¦Q\u0085ð\u0090\u009d0\u0080ý\u009c\u0092\u009eô|(\u0084\rîª\u0084²['l³vr\u008dè¥óõ¾@¹ÕÀámã\u0080u\u0094©¡[,deåéAFà8\u0097ú`CÌ×]\u0096¼KñÏµ0\u0090Ù§Â\r\u0086]\u0010;\u00adÞ\u009a+.( I\u008cÂ¦ù\u009a\u0000`\u0018\u000fønòä\u009a\u009bÊ\u008aª\u0085\u001dð´©\u00ad',,µ\u00adg4\u001cpC\t-&ÁûµG\u008dP¢E§xÆAÅ \u008foìðZ\u0003O\u0091øÐKÍ·\u000bal\u0092\u008bf\u008dá\u0007\u009dÊî\\®&ÃÂ>\u0096¨^,\u001b%Ê4Ç\t\f\u001d¤F6\u0083LLFö\u001dÅÑ¹ \u00adSNGÀ¢ª\u0098e)íSy\u000e\u008e\rdà9\u0007fO\u0095T\u000fk\u0004\u008drqh\u001f8iU\u009d´»";
      int var8 = "Ïd\u0093\u00067>\u0092!4jØ°¡\u0099Slrgá=ø¸bîÐÈ\u0015CP'3Ø \u0095\u00026\\Ã'ó\u008b\u0000×\u0010M\u00161Ûj/\u0096ë½8EÁÇÂ>\u0093·\u0090Ê9(`+ÚX\u001bÐHÖlFªçKM\u001d\u0012ê\u0012\u0093¥fáÞÒVK\u00000²\u008b\u0097\u0097f3C8 ÖªöíW\u0090o\r¶@«xnÖ8Üc\u0088@\t:¦\"'2\u000f\u0005,\tN\ræ\u0083U\u0091½ô\u000eà\fÂaå\u0081ìîM¼â\tVf\u0080pöH\u009br9¾h\nÂ\t\u0084¢p2=\"\u0094\u007f\u0006À8\u0019QÞ\u001e¼\u0001ªæ\u00069W=\u009f\u007f¸\u0013\u0016¿¹ÿU 0\u001c\u009eÄïÓ\u0087\u008djë}0^RÂ6%õS\f\u001b\u001eøàzíÆh\u0095;~Û²\u007fÓÆÆG¢ö\u0011Ap\u008c\u00adÃÒ*;\u0006\u0089ÊÐ\\\u0081Ö\u0003\u0018\f\u0080¸mW,\u00ad\u008c\u0004qP\u0083ì\u0090é¤¢¬\u0081½\u00911\u0083[\rQù\u0095Ýï\u0099ö\u0090£ég\u0018Ññ\u00880Jù\u009cûÑ7KqÓ\bîý\u008chÛ\"AS\u009b\u000b\fP¹ç\\¢-²øµ\u001cµ#\u009b \u001bñª+\u001d¿øýt\u0092\u001eu\u001dº¾PT\u0001£\u0080¦Q\u0085ð\u0090\u009d0\u0080ý\u009c\u0092\u009eô|(\u0084\rîª\u0084²['l³vr\u008dè¥óõ¾@¹ÕÀámã\u0080u\u0094©¡[,deåéAFà8\u0097ú`CÌ×]\u0096¼KñÏµ0\u0090Ù§Â\r\u0086]\u0010;\u00adÞ\u009a+.( I\u008cÂ¦ù\u009a\u0000`\u0018\u000fønòä\u009a\u009bÊ\u008aª\u0085\u001dð´©\u00ad',,µ\u00adg4\u001cpC\t-&ÁûµG\u008dP¢E§xÆAÅ \u008foìðZ\u0003O\u0091øÐKÍ·\u000bal\u0092\u008bf\u008dá\u0007\u009dÊî\\®&ÃÂ>\u0096¨^,\u001b%Ê4Ç\t\f\u001d¤F6\u0083LLFö\u001dÅÑ¹ \u00adSNGÀ¢ª\u0098e)íSy\u000e\u008e\rdà9\u0007fO\u0095T\u000fk\u0004\u008drqh\u001f8iU\u009d´»"
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
                     g = new String[11];
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

                  var6 = "6ç\u008dáòà\u0087U/\u0012¬9#\u00129\u009d2@ås\u0004Ä\u0012Ãñ[Û®\u0002\u0096\u009b\u0094Ç\"\u0081¤\u0083\u00ad\u0010(V\u0088\u0001î\u0097¿Ò\u0001\u008fF[\u009f\"ÝàÂi)ê4õå¢çÆ*\u009c\u0096x&ÍÞ\u008f8ø -·\u001dí¨=Ê4\u0092+\f½@\u000b6<¢\u009dÎ={\u001b\t©\u0014\u001f\u008b\u008fluJ8x\u0000¤\u0086o¥{\u008eÎk§PàlºPîZ¤Õ3\u0017+ÙYû\u001e\u0010å\u0006$ÎÝ\u0099\u0012Øû7\u009c\u009e_\u0093\u0084T\u001e";
                  var8 = "6ç\u008dáòà\u0087U/\u0012¬9#\u00129\u009d2@ås\u0004Ä\u0012Ãñ[Û®\u0002\u0096\u009b\u0094Ç\"\u0081¤\u0083\u00ad\u0010(V\u0088\u0001î\u0097¿Ò\u0001\u008fF[\u009f\"ÝàÂi)ê4õå¢çÆ*\u009c\u0096x&ÍÞ\u008f8ø -·\u001dí¨=Ê4\u0092+\f½@\u000b6<¢\u009dÎ={\u001b\t©\u0014\u001f\u008b\u008fluJ8x\u0000¤\u0086o¥{\u008eÎk§PàlºPîZ¤Õ3\u0017+ÙYû\u001e\u0010å\u0006$ÎÝ\u0099\u0012Øû7\u009c\u009e_\u0093\u0084T\u001e"
                     .length();
                  var5 = 'X';
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29758;
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
            throw new RuntimeException("kze", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("kze" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
