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

public class svk extends so9 {
   private static final long c;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public svk(hr_ var1, g6r var2, float var3) {
      super(var1, var2, var3);
   }

   public gdz euc(kxi param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic svk.c J
      // 03: ldc2_w 126017285517432
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokevirtual kxi.noc ()Ljava/lang/String;
      // 11: invokestatic syo.fan (Ljava/lang/String;)Ljava/lang/String;
      // 14: astore 5
      // 16: aload 5
      // 18: iload 4
      // 1a: ifeq 29
      // 1d: ifnull 51
      // 20: goto 27
      // 23: invokestatic svk.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 5
      // 29: sipush 7469
      // 2c: ldc2_w 8569205065288537281
      // 2f: lload 2
      // 30: lxor
      // 31: invokedynamic s (IJ)Ljava/lang/String; bsm=svk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: nop
      // 37: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3a: iload 4
      // 3c: ifeq 55
      // 3f: ifeq 51
      // 42: goto 49
      // 45: invokestatic svk.a (Loov;)Loov;
      // 48: athrow
      // 49: getstatic svk.wg4 Lgdz;
      // 4c: areturn
      // 4d: invokestatic svk.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 1
      // 52: invokevirtual kxi.f0c ()I
      // 55: lookupswitch 67 7 0 67 1 75 2 79 3 83 4 87 5 91 99 95
      // 98: getstatic svk.qve Lgdz;
      // 9b: areturn
      // 9c: invokestatic svk.a (Loov;)Loov;
      // 9f: athrow
      // a0: getstatic svk.pxg Lgdz;
      // a3: areturn
      // a4: getstatic svk.ma_ Lgdz;
      // a7: areturn
      // a8: getstatic svk.r47 Lgdz;
      // ab: areturn
      // ac: getstatic svk.hzm Lgdz;
      // af: areturn
      // b0: getstatic svk.sr5 Lgdz;
      // b3: areturn
      // b4: getstatic svk.hrn Lgdz;
      // b7: areturn
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.euc((kxi)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6854315470003549356L, -4971814596653195190L, MethodHandles.lookup().lookupClass()).a(1854726217981L);
      // $VF: monitorexit
      c = var10000;
      long var9 = c ^ 133566805626273L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[9];
      int var5 = 0;
      String var4 = "\u0089\u0081]ýþ½Ø}÷s\u0013÷LJ´Ó\\Æ®Tö¹\u0016÷\tz-\\\u0085Ìe®íª\r\u0014Á²Z]b¨\u0016²re*Ä\u001b1\u009d¼ö §<%_7Ï¯>¾¥lÖ\u0091Ärt\u001b;ü\u0094e¥$k.y@\u001b\u0018\rj m\u0095\u0093\u0014HÙ×¨\u0010A0À\u0093AÛ÷Wû\u0019\u0018É\u0004\f\u009fÔ\u007f\u001e£®iBQê\u0084*¿§\u0001\u0083®\fdDÙs\u001ag\"(\u0014\u001fýn'Ý\u0083ëíb\u0010ÜÝËÎù\u0085NÃ =\u0085>°2¤ÿ@å\u0099w\\°b¨CEQÔ¾ùÛ<\u0010m\u0003\u0001!\u0083Ø4~ÃÒ´Aø\u0019YÒ\u0095ägQ°×0_ù\u000bñ\u001f\u0082>>AãQf\u0092+Ý\u0086Î?¾ç\u0081ÈLMêH\bÍ£´C\u000f\u0019rzEN?Ùâ;¢\u0097Zs\u0086!i÷\u0091ùç\u0093º\u001b\u009c¥¶\u008c\u0014¸ò\u0096TY\u008bE\u0003\u0000=ûNÁeJÈ|ê=Ñð1¨tËóq¼\u0089\u0083\u000e\t8\u008dÀÌ(\u00160î\u0007\fÀE\u0097¡\u008e*\u009e\u000020½AÏ¯»eÙ©\u0094i(`©\u009eÁûsI»\u0094Þêu\u008d\tzgç0ò\u0005\u0088(9È@¾@!\u000e;\u00993\"pß¹\u000föþËÁê¯¿Üm%fù¾/83\u0089r'ä¯Ù\u0093Tü\u009dÝ{O\"Õþ\u0094DÃÎ\u0016\u009eT¢\u0080Ç¿\u0017\u001f/YX#AôÈ";
      int var6 = "\u0089\u0081]ýþ½Ø}÷s\u0013÷LJ´Ó\\Æ®Tö¹\u0016÷\tz-\\\u0085Ìe®íª\r\u0014Á²Z]b¨\u0016²re*Ä\u001b1\u009d¼ö §<%_7Ï¯>¾¥lÖ\u0091Ärt\u001b;ü\u0094e¥$k.y@\u001b\u0018\rj m\u0095\u0093\u0014HÙ×¨\u0010A0À\u0093AÛ÷Wû\u0019\u0018É\u0004\f\u009fÔ\u007f\u001e£®iBQê\u0084*¿§\u0001\u0083®\fdDÙs\u001ag\"(\u0014\u001fýn'Ý\u0083ëíb\u0010ÜÝËÎù\u0085NÃ =\u0085>°2¤ÿ@å\u0099w\\°b¨CEQÔ¾ùÛ<\u0010m\u0003\u0001!\u0083Ø4~ÃÒ´Aø\u0019YÒ\u0095ägQ°×0_ù\u000bñ\u001f\u0082>>AãQf\u0092+Ý\u0086Î?¾ç\u0081ÈLMêH\bÍ£´C\u000f\u0019rzEN?Ùâ;¢\u0097Zs\u0086!i÷\u0091ùç\u0093º\u001b\u009c¥¶\u008c\u0014¸ò\u0096TY\u008bE\u0003\u0000=ûNÁeJÈ|ê=Ñð1¨tËóq¼\u0089\u0083\u000e\t8\u008dÀÌ(\u00160î\u0007\fÀE\u0097¡\u008e*\u009e\u000020½AÏ¯»eÙ©\u0094i(`©\u009eÁûsI»\u0094Þêu\u008d\tzgç0ò\u0005\u0088(9È@¾@!\u000e;\u00993\"pß¹\u000föþËÁê¯¿Üm%fù¾/83\u0089r'ä¯Ù\u0093Tü\u009dÝ{O\"Õþ\u0094DÃÎ\u0016\u009eT¢\u0080Ç¿\u0017\u001f/YX#AôÈ"
         .length();
      char var3 = 'P';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     j = var7;
                     k = new String[9];
                     qve = new gdz(c<"s">(27132, 7421520348340624840L ^ var9));
                     pxg = new gdz(c<"s">(25186, 537063908374746705L ^ var9));
                     ma_ = new gdz(c<"s">(813, 8001165090364946203L ^ var9));
                     hzm = new gdz(c<"s">(8486, 6562829480608748822L ^ var9));
                     sr5 = new gdz(c<"s">(10118, 2021936265230898100L ^ var9));
                     r47 = new gdz(c<"s">(16313, 1870467835527842702L ^ var9));
                     wg4 = new gdz(c<"s">(20986, 9163866486425855429L ^ var9));
                     hrn = new gdz(c<"s">(65, 1952333832541041776L ^ var9));
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

                  var4 = "åä~Rn¾Y¦ìRvfä\u0093\u00180z¯C\u001fÍe÷þÍÐ.yÍVóyiÚÛ0ç±þÄ\"&1 \f~yh\\ù3ÕØ¯¶¤@¥\u009bhaÞ7~/\u0015{»\u007f»ÿ\u008a\u0082WC8\u0012Ý\u001c\u0091Xd\u008c®\u0000»\u0005¦84\u008d\u0007Ï\u0099T\u009cÀñ9\u008c\u000eÇuY\u0096\u0002¤4qrì\u0087qñPð\f}-\u0083k";
                  var6 = "åä~Rn¾Y¦ìRvfä\u0093\u00180z¯C\u001fÍe÷þÍÐ.yÍVóyiÚÛ0ç±þÄ\"&1 \f~yh\\ù3ÕØ¯¶¤@¥\u009bhaÞ7~/\u0015{»\u007f»ÿ\u008a\u0082WC8\u0012Ý\u001c\u0091Xd\u008c®\u0000»\u0005¦84\u008d\u0007Ï\u0099T\u009cÀñ9\u008c\u000eÇuY\u0096\u0002¤4qrì\u0087qñPð\f}-\u0083k"
                     .length();
                  var3 = '8';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2429;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("svk", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("svk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
