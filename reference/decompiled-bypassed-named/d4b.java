import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class d4b extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 71962318298437L;
      return b<"a">(472, 2276843596579702721L ^ var1);
   }

   @Override
   public int bag() {
      return 3;
   }

   @Override
   public boolean m6l(e7r param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: invokestatic vr1._0v ()Lvr1;
      // 07: invokevirtual vr1.wh3 ()Lwlx;
      // 0a: invokevirtual wlx._rf ()Lo85;
      // 0d: invokevirtual o85.dc3 ()Z
      // 10: iload 2
      // 11: ifeq 4b
      // 14: ifne 3f
      // 17: goto 1e
      // 1a: invokestatic d4b.a (Loov;)Loov;
      // 1d: athrow
      // 1e: invokestatic vr1._0v ()Lvr1;
      // 21: invokevirtual vr1.wh3 ()Lwlx;
      // 24: invokevirtual wlx.w68 ()Lwxb;
      // 27: invokevirtual wxb.dc3 ()Z
      // 2a: iload 2
      // 2b: ifeq 4b
      // 2e: goto 35
      // 31: invokestatic d4b.a (Loov;)Loov;
      // 34: athrow
      // 35: ifeq 5d
      // 38: goto 3f
      // 3b: invokestatic d4b.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: aload 1
      // 41: invokespecial bc_.m6l (Le7r;)Z
      // 44: goto 4b
      // 47: invokestatic d4b.a (Loov;)Loov;
      // 4a: athrow
      // 4b: iload 2
      // 4c: ifeq 5a
      // 4f: ifeq 5d
      // 52: goto 59
      // 55: invokestatic d4b.a (Loov;)Loov;
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 87468283789763L;
      return b<"a">(7989, 8685315235691546024L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic d4b.a J
      // 03: ldc2_w 76350385989632
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: aload 2
      // 0e: arraylength
      // 0f: iload 5
      // 11: ifne 3a
      // 14: bipush 1
      // 15: if_icmplt 97
      // 18: goto 1f
      // 1b: invokestatic d4b.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 2
      // 20: bipush 0
      // 21: aaload
      // 22: sipush 2594
      // 25: ldc2_w 6126244437379348861
      // 28: lload 3
      // 29: lxor
      // 2a: invokedynamic a (IJ)Ljava/lang/String; bsm=d4b.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: nop
      // 30: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 33: goto 3a
      // 36: invokestatic d4b.a (Loov;)Loov;
      // 39: athrow
      // 3a: ifeq 97
      // 3d: aload 1
      // 3e: new hsu
      // 41: dup
      // 42: sipush 11513
      // 45: ldc2_w 843248402445623201
      // 48: lload 3
      // 49: lxor
      // 4a: invokedynamic a (IJ)Ljava/lang/String; bsm=d4b.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: nop
      // 50: bipush 1
      // 51: anewarray 68
      // 54: dup
      // 55: bipush 0
      // 56: invokestatic vr1._0v ()Lvr1;
      // 59: invokevirtual vr1.wh3 ()Lwlx;
      // 5c: invokevirtual wlx._rf ()Lo85;
      // 5f: invokevirtual o85.zim ()[Ljava/lang/String;
      // 62: arraylength
      // 63: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 66: aastore
      // 67: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 6a: invokeinterface e7r.a0d (Lekw;)V 2
      // 6f: aload 1
      // 70: new tao
      // 73: dup
      // 74: invokestatic vr1._0v ()Lvr1;
      // 77: invokevirtual vr1.wh3 ()Lwlx;
      // 7a: invokevirtual wlx._rf ()Lo85;
      // 7d: invokevirtual o85.zim ()[Ljava/lang/String;
      // 80: invokestatic d4b.fgi ([Ljava/lang/Object;)Ljava/lang/String;
      // 83: invokespecial tao.<init> (Ljava/lang/String;)V
      // 86: invokeinterface e7r.a0d (Lekw;)V 2
      // 8b: iload 5
      // 8d: ifeq ec
      // 90: goto 97
      // 93: invokestatic d4b.a (Loov;)Loov;
      // 96: athrow
      // 97: aload 1
      // 98: new hsu
      // 9b: dup
      // 9c: sipush 23577
      // 9f: ldc2_w 1894378568632381252
      // a2: lload 3
      // a3: lxor
      // a4: invokedynamic a (IJ)Ljava/lang/String; bsm=d4b.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: nop
      // aa: bipush 1
      // ab: anewarray 68
      // ae: dup
      // af: bipush 0
      // b0: invokestatic vr1._0v ()Lvr1;
      // b3: invokevirtual vr1.wh3 ()Lwlx;
      // b6: invokevirtual wlx.w68 ()Lwxb;
      // b9: invokevirtual wxb.zim ()[Ljava/lang/String;
      // bc: arraylength
      // bd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c0: aastore
      // c1: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // c4: invokeinterface e7r.a0d (Lekw;)V 2
      // c9: aload 1
      // ca: new tao
      // cd: dup
      // ce: invokestatic vr1._0v ()Lvr1;
      // d1: invokevirtual vr1.wh3 ()Lwlx;
      // d4: invokevirtual wlx.w68 ()Lwxb;
      // d7: invokevirtual wxb.zim ()[Ljava/lang/String;
      // da: invokestatic d4b.fgi ([Ljava/lang/Object;)Ljava/lang/String;
      // dd: invokespecial tao.<init> (Ljava/lang/String;)V
      // e0: invokeinterface e7r.a0d (Lekw;)V 2
      // e5: goto ec
      // e8: invokestatic d4b.a (Loov;)Loov;
      // eb: athrow
      // ec: return
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic d4b.a J
      // 03: ldc2_w 116025184482800
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 6
      // 0e: aload 2
      // 0f: iload 6
      // 11: ifne 28
      // 14: arraylength
      // 15: bipush 1
      // 16: if_icmpne 56
      // 19: goto 20
      // 1c: invokestatic d4b.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: goto 28
      // 24: invokestatic d4b.a (Loov;)Loov;
      // 27: athrow
      // 28: bipush 2
      // 29: anewarray 1
      // 2c: dup
      // 2d: bipush 0
      // 2e: sipush 24094
      // 31: ldc2_w 5142341511403237559
      // 34: lload 4
      // 36: lxor
      // 37: invokedynamic a (IJ)Ljava/lang/String; bsm=d4b.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: nop
      // 3d: aastore
      // 3e: dup
      // 3f: bipush 1
      // 40: sipush 12514
      // 43: ldc2_w 7224249606284451401
      // 46: lload 4
      // 48: lxor
      // 49: invokedynamic a (IJ)Ljava/lang/String; bsm=d4b.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: nop
      // 4f: aastore
      // 50: invokestatic d4b.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 53: goto 57
      // 56: aconst_null
      // 57: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3750346172338649625L, -270042967475158856L, MethodHandles.lookup().lookupClass()).a(204947960181029L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 55904211112677L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "1~\u009d¸Ø\u000f·\u008du\u0011|\tI+ì· \u008a\u001fÝ|ÜÎÁ\u0013ïO\"M\u0002\u0010\u0089¡+\u000b\u0016ÌZ\u007fTÂ>ß\u0000\u00075\rË\u0010ïM\u009e\u0085¶\u0017\u009fõ\u0090§3:[Â?8\u0010VÉöOûô\u0007f\u000f\u0098\u0087D\u0081Ôðÿ(\u0097F{¯\u008e\u0016\u0002\u009e\biqØQç/5Ç\u001b2Ç\u0090G\u008c\u008aÛ|èt\u0091,mò`\u0097\u007f:òB\u008cÑ\u0010Û»0J\u0098K\\çºÝ\u000býËþR\u0017";
      int var8 = "1~\u009d¸Ø\u000f·\u008du\u0011|\tI+ì· \u008a\u001fÝ|ÜÎÁ\u0013ïO\"M\u0002\u0010\u0089¡+\u000b\u0016ÌZ\u007fTÂ>ß\u0000\u00075\rË\u0010ïM\u009e\u0085¶\u0017\u009fõ\u0090§3:[Â?8\u0010VÉöOûô\u0007f\u000f\u0098\u0087D\u0081Ôðÿ(\u0097F{¯\u008e\u0016\u0002\u009e\biqØQç/5Ç\u001b2Ç\u0090G\u008c\u008aÛ|èt\u0091,mò`\u0097\u007f:òB\u008cÑ\u0010Û»0J\u0098K\\çºÝ\u000býËþR\u0017"
         .length();
      char var5 = '0';
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
                     c = var9;
                     g = new String[7];
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

                  var6 = "\u0006\u0090É]\u008fîµ ò\u0080Áï\u00012ó¤î\f\u001e1SÚ\u007fõ¤\r¿^>V\u00adkøà*èáKa¹\u0010\u0094;°¥\u008a&nÅ\u00ad<ò³\u0095\u008b\u009a\u0010";
                  var8 = "\u0006\u0090É]\u008fîµ ò\u0080Áï\u00012ó¤î\f\u001e1SÚ\u007fõ¤\r¿^>V\u00adkøà*èáKa¹\u0010\u0094;°¥\u008a&nÅ\u00ad<ò³\u0095\u008b\u009a\u0010"
                     .length();
                  var5 = '(';
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24323;
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
            throw new RuntimeException("d4b", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("d4b" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
