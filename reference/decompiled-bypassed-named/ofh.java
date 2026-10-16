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

public class ofh {
   public static ofh pho;
   public static ofh w8h;
   public static ofh rpg;
   public static ofh w5u;
   public static ofh _st;
   public static ofh e7v;
   public static ofh y_6;
   public static ofh xv5;
   public static ofh m8d;
   public static ofh r2b;
   public static ofh f27;
   public static ofh isz;
   public static ofh b9h;
   public static ofh cw1;
   public static ofh __h;
   public String rfm;
   private static final long c;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public static ofh kun(Entity var0) {
      long var1 = c ^ 59687930357440L;
      return new c7o(a<"y">(5631, 1392191342636223993L ^ var1), var0);
   }

   public static ofh c_k(ha9 var0) {
      long var1 = c ^ 14252769421890L;
      return new c7o(a<"y">(20634, 2989342663424885786L ^ var1), var0);
   }

   public static ofh hvq(hy9 var0, EntityLivingBase var1) {
      long var2 = c ^ 116811031793357L;
      return new nhv(a<"y">(30536, 8166302810352125766L ^ var2), var0, var1).ktb();
   }

   public static ofh dop(c5x var0, EntityLivingBase var1) {
      long var2 = c ^ 17902754907254L;

      try {
         if (var1 == null) {
            return new nhv(a<"y">(16143, 2483821578766697917L ^ var2), var0, var0).j0j().ktb();
         }
      } catch (oov var4) {
         throw c(var4);
      }

      return new nhv(a<"y">(24179, 7568573331390080205L ^ var2), var0, var1).j0j().ktb();
   }

   public static ofh lr9(EntityLivingBase var0, EntityLivingBase var1) {
      long var2 = c ^ 70101888591455L;
      return new nhv(a<"y">(17949, 1672305065460473475L ^ var2), var0, var1).ktb();
   }

   public static ofh zj0(EntityLivingBase var0, EntityLivingBase var1) {
      long var2 = c ^ 100264605214313L;
      return new nhv(a<"y">(2683, 6866894745106797273L ^ var2), var0, var1).dqc().f1s();
   }

   public static ofh i_z(EntityLivingBase var0) {
      long var1 = c ^ 96054150654853L;
      return new c7o(a<"y">(19928, 1944236131310082188L ^ var1), var0).ach().f1s();
   }

   public static ofh siu(vu6 var0) {
      long var1 = c ^ 22268342118825L;
      int var3 = OpaquePredicate.b();

      vu6 var10000;
      label27: {
         try {
            var10000 = var0;
            if (var3 == 0) {
               break label27;
            }

            if (var0 == null) {
               return new ofh(a<"y">(23770, 6952917301024934831L ^ var1)).psk().w41();
            }
         } catch (oov var5) {
            throw c(var5);
         }

         var10000 = var0;
      }

      try {
         if (var10000.wbg() != null) {
            return new c7o(a<"y">(16902, 3250950750470264166L ^ var1), var0.wbg()).psk().w41();
         }
      } catch (oov var4) {
         throw c(var4);
      }

      return new ofh(a<"y">(23770, 6952917301024934831L ^ var1)).psk().w41();
   }

   public boolean u0p() {
      return this.vsv;
   }

   public ofh ktb() {
      this.vsv = true;
      return this;
   }

   public boolean yto() {
      return this.mf7;
   }

   public ofh w41() {
      this.mf7 = true;
      return this;
   }

   public boolean e8m() {
      return this.guv;
   }

   public float rig() {
      return this.zkg;
   }

   public boolean u5u() {
      return this.c6_;
   }

   public boolean nk0() {
      return this.klf;
   }

   public ofh(String var1) {
      this.rfm = var1;
   }

   public EntityLivingBase f8d() {
      return this.nra();
   }

   public EntityLivingBase nra() {
      return null;
   }

   public ofh dqc() {
      this.guv = true;
      this.zkg = 0.0F;
      return this;
   }

   public ofh u5l() {
      this.c6_ = true;
      return this;
   }

   public ofh kvt() {
      this.klf = true;
      this.zkg = 0.0F;
      return this;
   }

   public ofh j0j() {
      this.ndw = true;
      return this;
   }

   public ekw ny3(Entity param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ofh.c J
      // 03: ldc2_w 49509487661211
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: invokevirtual Entity.gy0 ()Lg_3;
      // 0c: astore 4
      // 0e: new java/lang/StringBuilder
      // 11: dup
      // 12: invokespecial java/lang/StringBuilder.<init> ()V
      // 15: sipush 30666
      // 18: ldc2_w 8543237439255026057
      // 1b: lload 2
      // 1c: lxor
      // 1d: invokedynamic y (IJ)Ljava/lang/String; bsm=ofh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: nop
      // 23: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26: aload 0
      // 27: getfield ofh.rfm Ljava/lang/String;
      // 2a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 30: astore 5
      // 32: new java/lang/StringBuilder
      // 35: dup
      // 36: invokespecial java/lang/StringBuilder.<init> ()V
      // 39: aload 5
      // 3b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e: sipush 11079
      // 41: ldc2_w 363991257145918748
      // 44: lload 2
      // 45: lxor
      // 46: invokedynamic y (IJ)Ljava/lang/String; bsm=ofh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: nop
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 52: astore 6
      // 54: aload 4
      // 56: ifnull 8b
      // 59: aload 6
      // 5b: invokestatic orr.okp (Ljava/lang/String;)Z
      // 5e: ifeq 8b
      // 61: goto 68
      // 64: invokestatic ofh.c (Loov;)Loov;
      // 67: athrow
      // 68: new hsu
      // 6b: dup
      // 6c: aload 6
      // 6e: bipush 2
      // 6f: anewarray 15
      // 72: dup
      // 73: bipush 0
      // 74: aload 1
      // 75: invokevirtual Entity.xyw ()Lekw;
      // 78: aastore
      // 79: dup
      // 7a: bipush 1
      // 7b: aload 4
      // 7d: invokevirtual Entity.xyw ()Lekw;
      // 80: aastore
      // 81: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 84: goto 9f
      // 87: invokestatic ofh.c (Loov;)Loov;
      // 8a: athrow
      // 8b: new hsu
      // 8e: dup
      // 8f: aload 5
      // 91: bipush 1
      // 92: anewarray 15
      // 95: dup
      // 96: bipush 0
      // 97: aload 1
      // 98: invokevirtual Entity.xyw ()Lekw;
      // 9b: aastore
      // 9c: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 9f: areturn
   }

   public boolean i0l() {
      return this.ndw;
   }

   public String p_f() {
      return this.rfm;
   }

   public ofh psk() {
      this.esy = true;
      return this;
   }

   public boolean li9() {
      return this.esy;
   }

   public boolean vmw() {
      return this.cx4;
   }

   public ofh f1s() {
      this.cx4 = true;
      return this;
   }

   public boolean neg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual ofh.nra ()Li2h;
      // 08: astore 2
      // 09: aload 2
      // 0a: instanceof ha9
      // 0d: iload 1
      // 0e: ifne 2c
      // 11: ifeq 3e
      // 14: goto 1b
      // 17: invokestatic ofh.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 2
      // 1c: checkcast ha9
      // 1f: getfield ha9.lls Lpj2;
      // 22: getfield pj2.g40 Z
      // 25: goto 2c
      // 28: invokestatic ofh.c (Loov;)Loov;
      // 2b: athrow
      // 2c: iload 1
      // 2d: ifne 3b
      // 30: ifeq 3e
      // 33: goto 3a
      // 36: invokestatic ofh.c (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8150247866504977763L, 3423085301295609066L, MethodHandles.lookup().lookupClass()).a(129601314496916L);
      // $VF: monitorexit
      c = var10000;
      long var9 = c ^ 12500046507952L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[27];
      int var5 = 0;
      String var4 = "½\u0085\r\u0097ô «ºïð\u007f0ôñÃ\u0013\u008ay\u0088\u00adÉ>!3¯lx\u000eÇ\tXÛ(ü+ôòÿ^[+UÓ\u0088$\u009eør\u0097\r×S±.&&¾8fJù\u001fáp\u0003'¸90\u000f¼wR\u0010\u0019\u0005ðH²Sü\u0010\u0012\u008fÁ\u000blÓK$ \u0080¼\u0085\u008f¹\u0012ù\u0002Ã+\u009f\u0002\tz3$Õ--µ@}H%\u0084áSñ \n±ö\u0018\u001bÚ\u001a=\u009f<I°\u0086/bv\u0013\u008bRR7\u0012ÄD\r¤\u0014\u007f\u0010úã9\u008e¼V\"kª \u0092¹\u000b\u0090Ëº\u0010Gø\u0088*\u0006DUâ|¿ÂÍ\f\u009e\u0099K\u0010®×\u0082`e.Ö7P}\u009f£ºyé²\u0010Çã¹¢O3bYÃ\u00adÿ\rj\u0012ÝÇ\u0010.\u0091\u0010%Å\u0082É\u0006y~§ÆNlJ°\u0010\u001b`ÌË\u009fù;¡Ç\u0010ãá\u008f$E|\u0010oþù\n«\u000eÆ\u009f¥¯SüM¨¹y\u0010g¨äìI^\u0014usÝHáWÅ¤\u001a\u00107¥+\u0089T\u0095\\8gñG[ãdk\u0019\u0010×L\u0080\u0002&<ªð.®ìA\u0015¿\u008c3\u0010\u0001\tÜº\u00adÆ0õø«î·Ô&\u0092´\u0018\u0091\u008aUÇ\u0002\u0007`\u0007]!Ù¨\u001f½ÙZ\u0081hï§x©ýä\u0010ºe\u0000ab\u0014%·\u000e\u0080Âñ\u0014\\§E f\u0004»Ð!í\u0013T)m\u000bh¾áG¤ø\u0097=\u000f\u0000\u0095z\u008d\u0090\u0018µ?\u0095eË÷\u0010rM<@Y\\\u0081iÕD¼x°\u0080\u0018]\u0018äñ\u0093Ñx\u0006Z\u008bu:ÿ]Ò\u0089®)õ[\tzxõàa\u0010\u0000\u000bÇôc\u001eLûÂ\u0091È?ÐS\u001dé\u0010w\u0091\r!`YuøéNõv\u0013Ê&Û\u0010e(¯\u0093\u0003Æ×Î=ji\tÎ!½´\u0010îÀÿ^\u008bz\u001fìÖå\u0093j\u009f\u0016ò°";
      int var6 = "½\u0085\r\u0097ô «ºïð\u007f0ôñÃ\u0013\u008ay\u0088\u00adÉ>!3¯lx\u000eÇ\tXÛ(ü+ôòÿ^[+UÓ\u0088$\u009eør\u0097\r×S±.&&¾8fJù\u001fáp\u0003'¸90\u000f¼wR\u0010\u0019\u0005ðH²Sü\u0010\u0012\u008fÁ\u000blÓK$ \u0080¼\u0085\u008f¹\u0012ù\u0002Ã+\u009f\u0002\tz3$Õ--µ@}H%\u0084áSñ \n±ö\u0018\u001bÚ\u001a=\u009f<I°\u0086/bv\u0013\u008bRR7\u0012ÄD\r¤\u0014\u007f\u0010úã9\u008e¼V\"kª \u0092¹\u000b\u0090Ëº\u0010Gø\u0088*\u0006DUâ|¿ÂÍ\f\u009e\u0099K\u0010®×\u0082`e.Ö7P}\u009f£ºyé²\u0010Çã¹¢O3bYÃ\u00adÿ\rj\u0012ÝÇ\u0010.\u0091\u0010%Å\u0082É\u0006y~§ÆNlJ°\u0010\u001b`ÌË\u009fù;¡Ç\u0010ãá\u008f$E|\u0010oþù\n«\u000eÆ\u009f¥¯SüM¨¹y\u0010g¨äìI^\u0014usÝHáWÅ¤\u001a\u00107¥+\u0089T\u0095\\8gñG[ãdk\u0019\u0010×L\u0080\u0002&<ªð.®ìA\u0015¿\u008c3\u0010\u0001\tÜº\u00adÆ0õø«î·Ô&\u0092´\u0018\u0091\u008aUÇ\u0002\u0007`\u0007]!Ù¨\u001f½ÙZ\u0081hï§x©ýä\u0010ºe\u0000ab\u0014%·\u000e\u0080Âñ\u0014\\§E f\u0004»Ð!í\u0013T)m\u000bh¾áG¤ø\u0097=\u000f\u0000\u0095z\u008d\u0090\u0018µ?\u0095eË÷\u0010rM<@Y\\\u0081iÕD¼x°\u0080\u0018]\u0018äñ\u0093Ñx\u0006Z\u008bu:ÿ]Ò\u0089®)õ[\tzxõàa\u0010\u0000\u000bÇôc\u001eLûÂ\u0091È?ÐS\u001dé\u0010w\u0091\r!`YuøéNõv\u0013Ê&Û\u0010e(¯\u0093\u0003Æ×Î=ji\tÎ!½´\u0010îÀÿ^\u008bz\u001fìÖå\u0093j\u009f\u0016ò°"
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
                     d = var7;
                     e = new String[27];
                     pho = new ofh(a<"y">(25159, 888922426050360104L ^ var9)).j0j();
                     w8h = new ofh(a<"y">(28740, 8712744019623846200L ^ var9));
                     rpg = new ofh(a<"y">(29118, 227993059674071232L ^ var9)).dqc().j0j();
                     w5u = new ofh(a<"y">(2324, 7670498283101706365L ^ var9)).j0j();
                     _st = new ofh(a<"y">(10063, 611597623285675570L ^ var9)).dqc();
                     e7v = new ofh(a<"y">(2502, 3898539522689849510L ^ var9)).dqc();
                     y_6 = new ofh(a<"y">(18741, 9008243994978424926L ^ var9)).dqc().kvt();
                     xv5 = new ofh(a<"y">(9537, 7274763386101789758L ^ var9));
                     m8d = new ofh(a<"y">(2871, 5115688746541996610L ^ var9)).dqc();
                     r2b = new ofh(a<"y">(21533, 7794442423963420023L ^ var9)).dqc().u5l();
                     f27 = new ofh(a<"y">(216, 2759908260436365750L ^ var9)).dqc();
                     isz = new ofh(a<"y">(14313, 3903196259064538771L ^ var9)).dqc().f1s();
                     b9h = new ofh(a<"y">(97, 2320406773020840204L ^ var9)).dqc();
                     cw1 = new ofh(a<"y">(20904, 1109825868678398175L ^ var9));
                     __h = new ofh(a<"y">(24370, 6899076019615272528L ^ var9));
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

                  var4 = "\u0005íb\u0090&Z6^Ú°Ý¦\u0015!.F \u0091p\u009c?\u0082\u001cä7ÿ®\u0019Û\u0086\u008b\u0011\u0018,\fx\u0011\"\u0005\u0081\u0099Aw[*dÝ¶t";
                  var6 = "\u0005íb\u0090&Z6^Ú°Ý¦\u0015!.F \u0091p\u009c?\u0082\u001cä7ÿ®\u0019Û\u0086\u008b\u0011\u0018,\fx\u0011\"\u0005\u0081\u0099Aw[*dÝ¶t"
                     .length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static oov c(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 396;
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
            throw new RuntimeException("ofh", var10);
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
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("ofh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
