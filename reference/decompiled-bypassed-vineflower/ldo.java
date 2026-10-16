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

public class ldo {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static boolean cr8(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ldo.a J
      // 03: ldc2_w 25227829349859
      // 06: lxor
      // 07: lstore 1
      // 08: sipush 27513
      // 0b: ldc2_w 8177764068332923767
      // 0e: lload 1
      // 0f: lxor
      // 10: invokedynamic i (IJ)Ljava/lang/String; bsm=ldo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: nop
      // 16: astore 4
      // 18: invokestatic t9d.c ()I
      // 1b: sipush 294
      // 1e: ldc2_w 3717806636050972969
      // 21: lload 1
      // 22: lxor
      // 23: invokedynamic i (IJ)Ljava/lang/String; bsm=ldo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: nop
      // 29: astore 5
      // 2b: istore 3
      // 2c: sipush 10612
      // 2f: ldc2_w 4316028295039035768
      // 32: lload 1
      // 33: lxor
      // 34: invokedynamic i (IJ)Ljava/lang/String; bsm=ldo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: nop
      // 3a: astore 6
      // 3c: sipush 2092
      // 3f: ldc2_w 3838246552704452646
      // 42: lload 1
      // 43: lxor
      // 44: invokedynamic i (IJ)Ljava/lang/String; bsm=ldo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: nop
      // 4a: astore 7
      // 4c: sipush 29438
      // 4f: ldc2_w 7008039814158217971
      // 52: lload 1
      // 53: lxor
      // 54: invokedynamic i (IJ)Ljava/lang/String; bsm=ldo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: nop
      // 5a: aload 0
      // 5b: invokestatic java/util/regex/Pattern.matches (Ljava/lang/String;Ljava/lang/CharSequence;)Z
      // 5e: iload 3
      // 5f: ifne 73
      // 62: ifeq 72
      // 65: goto 6c
      // 68: invokestatic ldo.a (Loov;)Loov;
      // 6b: athrow
      // 6c: bipush 1
      // 6d: ireturn
      // 6e: invokestatic ldo.a (Loov;)Loov;
      // 71: athrow
      // 72: bipush 0
      // 73: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7559508807922109337L, -8038622021772347782L, MethodHandles.lookup().lookupClass()).a(96688353683969L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 102445574078152L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "Âîé91\u008eG\u0084£ËµRkA¯ö_ï\u0081ØuÃ(b \u001c¶tf!\u009a¬Ø\u009f\u0099c\u0019¹éÜ·S\u0010í¬\u008cZ1ö%ex)j]Zø Ãw¼'qf9\u0003©+\u0089Y\u0081~\u008aJÂÅ\u0085XæÝ\b±£?«oöÌÉ£";
      int var8 = "Âîé91\u008eG\u0084£ËµRkA¯ö_ï\u0081ØuÃ(b \u001c¶tf!\u009a¬Ø\u009f\u0099c\u0019¹éÜ·S\u0010í¬\u008cZ1ö%ex)j]Zø Ãw¼'qf9\u0003©+\u0089Y\u0081~\u008aJÂÅ\u0085XæÝ\b±£?«oöÌÉ£"
         .length();
      char var5 = 24;
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
                     c = new String[5];
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

                  var6 = "\u009bØ;ç ÜH\u0099Wn¹hF\u0097\u001cjÉ\u000f\u0098é\u001a|h~\u0010\u0003Ü\u008fC®ÍÑ%\u0084\u008b\u0084xïPéü`ªc\u0082ùÕL]çyss8TL\u0003/Å>\u0081¾*P0ÓÇê\u0017)ó\u0012[\u009d¤½0×/÷\u0081q \u0001~u\u001b\u0001\u0090oPFïáaj\u0081Iý\u0092GõMú»\u0000(ÁAÄîL£Ç%~ÞZ)õªà\u008aà\u0017®n\u009d<0=\u000b\u0000n·ª1Þr{éÕ.¬A\u009fÃÁµ\u0002ï«Ð7J<H\u0014þ\u0090Uýi\u00ad\u0019m%\u0017î÷\u0081K&\u009b©'\u000e\u00853\u0012\u000fw\u0081ç\u0013§\u0083îl\u000fcß\u00020¨)®2LÀ\u001cRãÚ#¸p¨º\u009f\u001cX$\u0001:)_5\u000e©µ\u0014ã_-\u0093õ^¦ûÑÙ÷}UÙQxGÀøÂ\u007fø9\u0095PÚÎâ¢4Ý\u008fÏè#=_bÂW\u0096.\r\u0015q`³àTr\u0087\u0093{áQ\"æ\u001fþ\u0000/,J¡QL½¯?$#\u0082Ofjâ¬_Ó&\b\u0080rÖ2W\u001e\u0094\u001cá\u0014ÐVùF\u008fµÔCõ\u008f\u008dGÿ\fO\u0001\u001d2\u0080P\u0091\u0017+nÁ\u008aPÁòÕ=\u0013\u008bå\u0003Ìn5\u008b¸#\u0099ü.Y\u0000 \u0084õW ~D³\u009dþDì\u009e#Þç\u000b,ñæí«\u008dEåƐ\b#\u0087ÅÑEÇ\u0092Ù²@¶\fç5OÿmÛ³ÜaàÇº\u0085]3QeX,N\u0003ÿ©~\f3·q\u0085î×Èàíqí\nzv\u0091·à\u0085t;ÎpAz¥\u000f\n\u009e¹çÆD\u0085\u008b\u001bÑÔ\u0083I.9\u000bJ\u0019\u009e¨\u00179~vt\u001c\u0086\u0098\u0080k³Ù\u0084ÐÇ´2Ê]Ø-\u0004¿|\u0013&. ¼î±\u000f)\u0090Eû2\u0094Ä\u0096>÷ëxmÜµpM\u0000xgäs>ÄÀx8\u0011`i\u0001ûã\u0019·.¢w}\u0092WÔl:âJó\u0005\rÖq\u001fûúj \u0093\u0018/U\nxgÊ (¯nÆåÀO4\u008a>¶¦È>\u009fòVô<+%.¹O¤\u009fÃý\u007f\u0015\u0014\u00adnUV\u0093PGÓ+E\u0099¯t4tSó\u0013\u00963Oá÷@=OoyßÂõB\u001e\n\"Å3\u009aÜ\u000bnøeàÉ\u0080V;ÌÂ+\u00171c\u001b0Â\u001a±ð$p\u0091¦+g\u0086*¤\u0017¥ñmüå¿\u0084\u0002{\u0002QX0!¸>\u001b\u000fSÌÜ'\u0094N\u009b®øÞ\u0080\u001a-\u009dAÂ\u001a¿¹R)\u008aÇx\u001aú¤Áfyxz)§õ«Y\bdÜ#FeÜ>\u001d4\u0010\u0082Õ&èÃ\u0093\u0018\\u\u0083-oà{¯,\\LÞ78\u0095w\u0094\u0094ð\u0086ãA\u0002|\u000bÎ*U\u0014ÌtÃëñ\u0004\u001cyF\u0092øÚ$ôM\u0019";
                  var8 = "\u009bØ;ç ÜH\u0099Wn¹hF\u0097\u001cjÉ\u000f\u0098é\u001a|h~\u0010\u0003Ü\u008fC®ÍÑ%\u0084\u008b\u0084xïPéü`ªc\u0082ùÕL]çyss8TL\u0003/Å>\u0081¾*P0ÓÇê\u0017)ó\u0012[\u009d¤½0×/÷\u0081q \u0001~u\u001b\u0001\u0090oPFïáaj\u0081Iý\u0092GõMú»\u0000(ÁAÄîL£Ç%~ÞZ)õªà\u008aà\u0017®n\u009d<0=\u000b\u0000n·ª1Þr{éÕ.¬A\u009fÃÁµ\u0002ï«Ð7J<H\u0014þ\u0090Uýi\u00ad\u0019m%\u0017î÷\u0081K&\u009b©'\u000e\u00853\u0012\u000fw\u0081ç\u0013§\u0083îl\u000fcß\u00020¨)®2LÀ\u001cRãÚ#¸p¨º\u009f\u001cX$\u0001:)_5\u000e©µ\u0014ã_-\u0093õ^¦ûÑÙ÷}UÙQxGÀøÂ\u007fø9\u0095PÚÎâ¢4Ý\u008fÏè#=_bÂW\u0096.\r\u0015q`³àTr\u0087\u0093{áQ\"æ\u001fþ\u0000/,J¡QL½¯?$#\u0082Ofjâ¬_Ó&\b\u0080rÖ2W\u001e\u0094\u001cá\u0014ÐVùF\u008fµÔCõ\u008f\u008dGÿ\fO\u0001\u001d2\u0080P\u0091\u0017+nÁ\u008aPÁòÕ=\u0013\u008bå\u0003Ìn5\u008b¸#\u0099ü.Y\u0000 \u0084õW ~D³\u009dþDì\u009e#Þç\u000b,ñæí«\u008dEåƐ\b#\u0087ÅÑEÇ\u0092Ù²@¶\fç5OÿmÛ³ÜaàÇº\u0085]3QeX,N\u0003ÿ©~\f3·q\u0085î×Èàíqí\nzv\u0091·à\u0085t;ÎpAz¥\u000f\n\u009e¹çÆD\u0085\u008b\u001bÑÔ\u0083I.9\u000bJ\u0019\u009e¨\u00179~vt\u001c\u0086\u0098\u0080k³Ù\u0084ÐÇ´2Ê]Ø-\u0004¿|\u0013&. ¼î±\u000f)\u0090Eû2\u0094Ä\u0096>÷ëxmÜµpM\u0000xgäs>ÄÀx8\u0011`i\u0001ûã\u0019·.¢w}\u0092WÔl:âJó\u0005\rÖq\u001fûúj \u0093\u0018/U\nxgÊ (¯nÆåÀO4\u008a>¶¦È>\u009fòVô<+%.¹O¤\u009fÃý\u007f\u0015\u0014\u00adnUV\u0093PGÓ+E\u0099¯t4tSó\u0013\u00963Oá÷@=OoyßÂõB\u001e\n\"Å3\u009aÜ\u000bnøeàÉ\u0080V;ÌÂ+\u00171c\u001b0Â\u001a±ð$p\u0091¦+g\u0086*¤\u0017¥ñmüå¿\u0084\u0002{\u0002QX0!¸>\u001b\u000fSÌÜ'\u0094N\u009b®øÞ\u0080\u001a-\u009dAÂ\u001a¿¹R)\u008aÇx\u001aú¤Áfyxz)§õ«Y\bdÜ#FeÜ>\u001d4\u0010\u0082Õ&èÃ\u0093\u0018\\u\u0083-oà{¯,\\LÞ78\u0095w\u0094\u0094ð\u0086ãA\u0002|\u000bÎ*U\u0014ÌtÃëñ\u0004\u001cyF\u0092øÚ$ôM\u0019"
                     .length();
                  var5 = 384;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28314;
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
            throw new RuntimeException("ldo", var10);
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
         throw new RuntimeException("ldo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
