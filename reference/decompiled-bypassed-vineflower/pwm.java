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

public class pwm extends ar7 {
   public static c_3 zys;
   public static cn7 v42;
   public static cn7 mcn;
   public static crk kms;
   public static crk krs;
   public static crk h0k;
   public float mpr;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public pwm() {
      long var1 = a ^ 116019092525499L;
      super(b<"q">(27544, 7957916370614173314L ^ var1), _aj.sxc, false, new j1s[0]);
      this.mpr = 0.0F;
   }

   @jev
   public void g7g(fha param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: getstatic pwm.v42 Lcn7;
      // 07: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: iload 2
      // 0e: ifne 2f
      // 11: ifeq 26
      // 14: goto 1b
      // 17: invokestatic pwm.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual pwm.qdy ()V
      // 1f: goto 26
      // 22: invokestatic pwm.a (Loov;)Loov;
      // 25: athrow
      // 26: getstatic pwm.mcn Lcn7;
      // 29: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 2c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f: ifeq 3d
      // 32: aload 0
      // 33: invokevirtual pwm.yvy ()V
      // 36: goto 3d
      // 39: invokestatic pwm.a (Loov;)Loov;
      // 3c: athrow
      // 3d: return
   }

   public void yvy() {
      long var1 = a ^ 102519058585136L;
      int var3 = t9d.b();

      boolean var10000;
      label29: {
         label28: {
            try {
               var10000 = zys.wyk(b<"q">(27067, 6512079615621364540L ^ var1));
               if (var3 == 0) {
                  break label29;
               }

               if (!var10000) {
                  break label28;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            int var4 = ek1.vg8.g25 % 16 + 1;
            hhf.e_y(
               new gdz(b<"q">(5992, 7220849469020669429L ^ var1) + var4 + b<"q">(29729, 775076258106042043L ^ var1)),
               (float)krs.d7c().intValue(),
               (float)(hhf.tgg() - kms.d7c().intValue()),
               (float)h0k.d7c().intValue(),
               (float)h0k.d7c().intValue()
            );
         }

         var10000 = zys.wyk(b<"q">(7847, 116042674407672889L ^ var1));
      }

      try {
         if (var10000) {
            hhf.e_y(new gdz(b<"q">(24671, 3756114781824611014L ^ var1)), (float)krs.d7c().intValue(), (float)(hhf.tgg() - kms.d7c().intValue()), 77.0F, 250.0F);
         }
      } catch (oov var5) {
         throw a(var5);
      }
   }

   public void qdy() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic pwm.a J
      // 03: ldc2_w 6548738300855
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 49
      // 11: getfield pwm.mpr F
      // 14: invokestatic hhf.ocl ()I
      // 17: i2f
      // 18: fcmpg
      // 19: ifge 41
      // 1c: goto 23
      // 1f: invokestatic pwm.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: dup
      // 25: getfield pwm.mpr F
      // 28: f2d
      // 29: getstatic ybv.brc F
      // 2c: f2d
      // 2d: ldc2_w 0.1
      // 30: dmul
      // 31: dadd
      // 32: d2f
      // 33: putfield pwm.mpr F
      // 36: iload 3
      // 37: ifne 4d
      // 3a: goto 41
      // 3d: invokestatic pwm.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: goto 49
      // 45: invokestatic pwm.a (Loov;)Loov;
      // 48: athrow
      // 49: fconst_0
      // 4a: putfield pwm.mpr F
      // 4d: getstatic pwm.ek1 Lc05;
      // 50: getfield c05.vg8 Ll86;
      // 53: getfield l86.g25 I
      // 56: bipush 12
      // 58: irem
      // 59: bipush 1
      // 5a: iadd
      // 5b: istore 4
      // 5d: new gdz
      // 60: dup
      // 61: new java/lang/StringBuilder
      // 64: dup
      // 65: invokespecial java/lang/StringBuilder.<init> ()V
      // 68: sipush 11331
      // 6b: ldc2_w 6681181174443619167
      // 6e: lload 1
      // 6f: lxor
      // 70: invokedynamic q (IJ)Ljava/lang/String; bsm=pwm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: nop
      // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 79: iload 4
      // 7b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 7e: sipush 23707
      // 81: ldc2_w 1789521262501577600
      // 84: lload 1
      // 85: lxor
      // 86: invokedynamic q (IJ)Ljava/lang/String; bsm=pwm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: nop
      // 8c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 92: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 95: aload 0
      // 96: getfield pwm.mpr F
      // 99: invokestatic hhf.tgg ()I
      // 9c: bipush 80
      // 9e: isub
      // 9f: i2f
      // a0: ldc 42.0
      // a2: nop
      // a3: ldc 27.0
      // a5: nop
      // a6: invokestatic hhf.e_y (Lgdz;FFFF)V
      // a9: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3081445065054570424L, -4283661668399772268L, MethodHandles.lookup().lookupClass()).a(225784450710729L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 25370636702398L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[17];
      int var5 = 0;
      String var4 = "øZ´\u0013¢\u0088¼\u0091ÍjEXÒ\u009f·Ì6\u0000ÜXF%ë\u0013\u0010ú]\u009dÍ\u009fß; Á\u009fÍò¼\u0085I½\u0010\u0087)µ\b©vqeçï\bC-o×'\u0010w\u009aK\u00848\u0002'y]\u0000WÛiÏR!\u0010\u009a¹g\u0013®t.®a\u0081\u0001.a\u0004¸ò\u0010Ô¹ç¹\u0005\u0016\"Ùr`Ö\u009by,©Â\u0010Õj¥\u0017ns\u0081\u0087pÓTz\u009b\u00ad\u0004B\u0018ïå\u0019\u0006\rd\u000b\u0088z?ºr\u0007ôÁ*uËúÎò4\u0084L\u0010 óMæE\u008e\u0014B\u008d³ú\\X\u0081QÉ\u0010¬\u0095íSEÌ\u0015\u001b\u008eì\u001c§I`è³\u0018\u000eE{Zúû\u0095;\u0099û\u0017|*V3LC'ýÝ4Ø,M\u0010ET\u000f\u001eÐ+GëKïPÃÌºÕ\u009a\u0018\u00804z\u0087\u0081Íï\u000b\u009fÄw¨.\u0081ÝØüÃ\u0010Ë\u001eæýÀ\u0010JìM-»gètÛ\u009ah{á/Z¨8ê\u0095 Ç3ñª?u÷Ôoê ÇS¨i~\u001bt1Gè\u0082iz{*âéo\u0012ùnònQ+6ã\u0083Yß4·\u0013D¬\u00adÜXøq\u0092ú";
      int var6 = "øZ´\u0013¢\u0088¼\u0091ÍjEXÒ\u009f·Ì6\u0000ÜXF%ë\u0013\u0010ú]\u009dÍ\u009fß; Á\u009fÍò¼\u0085I½\u0010\u0087)µ\b©vqeçï\bC-o×'\u0010w\u009aK\u00848\u0002'y]\u0000WÛiÏR!\u0010\u009a¹g\u0013®t.®a\u0081\u0001.a\u0004¸ò\u0010Ô¹ç¹\u0005\u0016\"Ùr`Ö\u009by,©Â\u0010Õj¥\u0017ns\u0081\u0087pÓTz\u009b\u00ad\u0004B\u0018ïå\u0019\u0006\rd\u000b\u0088z?ºr\u0007ôÁ*uËúÎò4\u0084L\u0010 óMæE\u008e\u0014B\u008d³ú\\X\u0081QÉ\u0010¬\u0095íSEÌ\u0015\u001b\u008eì\u001c§I`è³\u0018\u000eE{Zúû\u0095;\u0099û\u0017|*V3LC'ýÝ4Ø,M\u0010ET\u000f\u001eÐ+GëKïPÃÌºÕ\u009a\u0018\u00804z\u0087\u0081Íï\u000b\u009fÄw¨.\u0081ÝØüÃ\u0010Ë\u001eæýÀ\u0010JìM-»gètÛ\u009ah{á/Z¨8ê\u0095 Ç3ñª?u÷Ôoê ÇS¨i~\u001bt1Gè\u0082iz{*âéo\u0012ùnònQ+6ã\u0083Yß4·\u0013D¬\u00adÜXøq\u0092ú"
         .length();
      char var3 = 24;
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
                     g = new String[17];
                     zys = new c_3(
                        b<"q">(30136, 6810304954280108965L ^ var9),
                        b<"q">(24708, 3677648143059121810L ^ var9),
                        b<"q">(17770, 4009167743153263483L ^ var9),
                        new String[]{b<"q">(27732, 8749802225332681288L ^ var9)}
                     );
                     v42 = new cn7(b<"q">(27544, 7957944454315048327L ^ var9), b<"q">(24735, 4415246690933929607L ^ var9), false);
                     mcn = new cn7(b<"q">(27544, 7957944454315048327L ^ var9), b<"q">(8093, 1873355990994880903L ^ var9), false);
                     kms = new crk(b<"q">(27544, 7957944454315048327L ^ var9), b<"q">(19038, 4842310753186667584L ^ var9), 130.0F, 0.0F, 1000.0F, 5.0F);
                     krs = new crk(b<"q">(27544, 7957944454315048327L ^ var9), b<"q">(27294, 7271534899331759239L ^ var9), 40.0F, 0.0F, 1000.0F, 5.0F);
                     h0k = new crk(b<"q">(27544, 7957944454315048327L ^ var9), b<"q">(30050, 1129290926208017273L ^ var9), 100.0F, 10.0F, 500.0F, 1.0F);
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

                  var4 = "\u0001H#\u001f(Çcñg,bâ\u0018¼¹\u0098¨\u001bI\u0010\u000e\u0006Û\u001dk5\u0017\f1ý\u008a°\u0010¿\u008dJ!¼0Wª¹'\u0007Õ¸Ù_ð";
                  var6 = "\u0001H#\u001f(Çcñg,bâ\u0018¼¹\u0098¨\u001bI\u0010\u000e\u0006Û\u001dk5\u0017\f1ý\u008a°\u0010¿\u008dJ!¼0Wª¹'\u0007Õ¸Ù_ð".length();
                  var3 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3277;
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
            throw new RuntimeException("pwm", var10);
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
         throw new RuntimeException("pwm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
