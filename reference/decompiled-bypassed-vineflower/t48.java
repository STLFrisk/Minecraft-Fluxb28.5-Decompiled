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

public class t48 extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 63435137654143L;
      return b<"q">(28767, 5366558631320905672L ^ var1);
   }

   @Override
   public int bag() {
      return 3;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 60816322707961L;
      return b<"q">(32611, 10719380540372086L ^ var2);
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
      // 00: getstatic t48.a J
      // 03: ldc2_w 67835134044218
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: aload 2
      // 0e: arraylength
      // 0f: iload 5
      // 11: ifeq 2c
      // 14: bipush 1
      // 15: if_icmpne a2
      // 18: goto 1f
      // 1b: invokestatic t48.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 2
      // 20: bipush 0
      // 21: aaload
      // 22: invokevirtual java/lang/String.length ()I
      // 25: goto 2c
      // 28: invokestatic t48.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifle a2
      // 2f: invokestatic vr1._0v ()Lvr1;
      // 32: astore 6
      // 34: aload 6
      // 36: invokevirtual vr1.y71 ()Lkr3;
      // 39: aload 2
      // 3a: bipush 0
      // 3b: aaload
      // 3c: invokevirtual kr3.wjp (Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;
      // 3f: astore 7
      // 41: iload 5
      // 43: ifeq 9d
      // 46: aload 7
      // 48: ifnonnull 76
      // 4b: goto 52
      // 4e: invokestatic t48.a (Loov;)Loov;
      // 51: athrow
      // 52: new uvb
      // 55: dup
      // 56: sipush 14095
      // 59: ldc2_w 3621646504325305823
      // 5c: lload 3
      // 5d: lxor
      // 5e: invokedynamic q (IJ)Ljava/lang/String; bsm=t48.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: nop
      // 64: bipush 1
      // 65: anewarray 50
      // 68: dup
      // 69: bipush 0
      // 6a: aload 2
      // 6b: bipush 0
      // 6c: aaload
      // 6d: aastore
      // 6e: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 71: athrow
      // 72: invokestatic t48.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 6
      // 78: invokevirtual vr1.wh3 ()Lwlx;
      // 7b: aload 7
      // 7d: invokevirtual wlx.y11 (Lcom/mojang/authlib/GameProfile;)V
      // 80: aload 1
      // 81: aload 0
      // 82: sipush 22548
      // 85: ldc2_w 1145001539751852743
      // 88: lload 3
      // 89: lxor
      // 8a: invokedynamic q (IJ)Ljava/lang/String; bsm=t48.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: nop
      // 90: bipush 1
      // 91: anewarray 50
      // 94: dup
      // 95: bipush 0
      // 96: aload 2
      // 97: bipush 0
      // 98: aaload
      // 99: aastore
      // 9a: invokestatic t48.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 9d: iload 5
      // 9f: ifne c0
      // a2: new w57
      // a5: dup
      // a6: sipush 24339
      // a9: ldc2_w 3831364890485341634
      // ac: lload 3
      // ad: lxor
      // ae: invokedynamic q (IJ)Ljava/lang/String; bsm=t48.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: nop
      // b4: bipush 0
      // b5: anewarray 50
      // b8: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // bb: athrow
      // bc: invokestatic t48.a (Loov;)Loov;
      // bf: athrow
      // c0: return
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifeq 1f
      // 0b: arraylength
      // 0c: bipush 1
      // 0d: if_icmpne a2
      // 10: goto 17
      // 13: invokestatic t48.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: goto 1f
      // 1b: invokestatic t48.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 2
      // 20: arraylength
      // 21: bipush 1
      // 22: isub
      // 23: aaload
      // 24: astore 5
      // 26: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 29: astore 6
      // 2b: invokestatic vr1._0v ()Lvr1;
      // 2e: invokevirtual vr1._5a ()[Lcom/mojang/authlib/GameProfile;
      // 31: astore 7
      // 33: aload 7
      // 35: arraylength
      // 36: istore 8
      // 38: bipush 0
      // 39: istore 9
      // 3b: iload 9
      // 3d: iload 8
      // 3f: if_icmpge 9f
      // 42: aload 7
      // 44: iload 9
      // 46: aaload
      // 47: astore 10
      // 49: iload 4
      // 4b: ifeq 9a
      // 4e: invokestatic vr1._0v ()Lvr1;
      // 51: invokevirtual vr1.wh3 ()Lwlx;
      // 54: aload 10
      // 56: invokevirtual wlx.sbc (Lcom/mojang/authlib/GameProfile;)Z
      // 59: ifne 97
      // 5c: goto 63
      // 5f: invokestatic t48.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 5
      // 65: aload 10
      // 67: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 6a: invokestatic t48.ufz (Ljava/lang/String;Ljava/lang/String;)Z
      // 6d: iload 4
      // 6f: ifeq 96
      // 72: goto 79
      // 75: invokestatic t48.a (Loov;)Loov;
      // 78: athrow
      // 79: ifeq 97
      // 7c: goto 83
      // 7f: invokestatic t48.a (Loov;)Loov;
      // 82: athrow
      // 83: aload 6
      // 85: aload 10
      // 87: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 8a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8f: goto 96
      // 92: invokestatic t48.a (Loov;)Loov;
      // 95: athrow
      // 96: pop
      // 97: iinc 9 1
      // 9a: iload 4
      // 9c: ifne 3b
      // 9f: aload 6
      // a1: areturn
      // a2: aconst_null
      // a3: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2600874515718216610L, -5086350310903144671L, MethodHandles.lookup().lookupClass()).a(29260877388435L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 77654857976919L;
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
      String var6 = "ëR=\u0013Ò{Z´âCÌ\u0084\u0085M9<(ù\\.XrðÃ¢\u001a²\u0018kk~\u0097\u0098 âbé_Yn\u0017\u008eÙÚ¶\u000fP\u009a\u000e\u001cRÎA\u0085\u009a\u0010Ã Rò\u0015/0Êk\u0016Wc-4\u0088¨Lr\u0085\t\\±±¬\tIó\u0016\u0090\u0084Ò\u0003\u0081r";
      int var8 = "ëR=\u0013Ò{Z´âCÌ\u0084\u0085M9<(ù\\.XrðÃ¢\u001a²\u0018kk~\u0097\u0098 âbé_Yn\u0017\u008eÙÚ¶\u000fP\u009a\u000e\u001cRÎA\u0085\u009a\u0010Ã Rò\u0015/0Êk\u0016Wc-4\u0088¨Lr\u0085\t\\±±¬\tIó\u0016\u0090\u0084Ò\u0003\u0081r"
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
                     c = var9;
                     g = new String[5];
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

                  var6 = "@6ý\u0084\u0019C»pZbØ\u001cÙ\u009c ÏÛ¼ÌDBmOßW_<Ç(\u0017¡x8¨\u0012nråb¶(N\rn²-{¾\u009d´¶\u007fâÝe\u000eÇHsÞ(\u000fÿ\u0092\u0015\u0097×'\u0089èÏéÏ\u0005sÑ2«e¿\u0003";
                  var8 = "@6ý\u0084\u0019C»pZbØ\u001cÙ\u009c ÏÛ¼ÌDBmOßW_<Ç(\u0017¡x8¨\u0012nråb¶(N\rn²-{¾\u009d´¶\u007fâÝe\u000eÇHsÞ(\u000fÿ\u0092\u0015\u0097×'\u0089èÏéÏ\u0005sÑ2«e¿\u0003"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20108;
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
            throw new RuntimeException("t48", var10);
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
         throw new RuntimeException("t48" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
