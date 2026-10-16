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

public class vvn extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 92393814388854L;
      return b<"b">(26406, 6931719116282806729L ^ var1);
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: invokestatic vr1._0v ()Lvr1;
      // 07: invokevirtual vr1.wh3 ()Lwlx;
      // 0a: invokevirtual wlx._rf ()Lo85;
      // 0d: invokevirtual o85.dc3 ()Z
      // 10: iload 2
      // 11: ifne 2a
      // 14: ifeq 3c
      // 17: goto 1e
      // 1a: invokestatic vvn.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: invokespecial bc_.m6l (Le7r;)Z
      // 23: goto 2a
      // 26: invokestatic vvn.a (Loov;)Loov;
      // 29: athrow
      // 2a: iload 2
      // 2b: ifne 39
      // 2e: ifeq 3c
      // 31: goto 38
      // 34: invokestatic vvn.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 1
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 100014217702640L;
      return b<"b">(11855, 1498671201567167527L ^ var2);
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
      // 00: getstatic vvn.a J
      // 03: ldc2_w 88010887890227
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 2
      // 0e: arraylength
      // 0f: bipush 1
      // 10: iload 5
      // 12: ifeq 2d
      // 15: if_icmpne aa
      // 18: goto 1f
      // 1b: invokestatic vvn.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 2
      // 20: bipush 0
      // 21: aaload
      // 22: invokevirtual java/lang/String.length ()I
      // 25: bipush 1
      // 26: goto 2d
      // 29: invokestatic vvn.a (Loov;)Loov;
      // 2c: athrow
      // 2d: if_icmple aa
      // 30: getstatic r50.t8e Ljava/util/regex/Pattern;
      // 33: aload 2
      // 34: bipush 0
      // 35: aaload
      // 36: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 39: astore 6
      // 3b: iload 5
      // 3d: ifeq 82
      // 40: aload 6
      // 42: invokevirtual java/util/regex/Matcher.matches ()Z
      // 45: ifeq 87
      // 48: goto 4f
      // 4b: invokestatic vvn.a (Loov;)Loov;
      // 4e: athrow
      // 4f: invokestatic vr1._0v ()Lvr1;
      // 52: invokevirtual vr1.wh3 ()Lwlx;
      // 55: invokevirtual wlx._rf ()Lo85;
      // 58: aload 2
      // 59: bipush 0
      // 5a: aaload
      // 5b: invokevirtual o85.qwz (Ljava/lang/Object;)V
      // 5e: aload 1
      // 5f: aload 0
      // 60: sipush 18530
      // 63: ldc2_w 6380415302553902031
      // 66: lload 3
      // 67: lxor
      // 68: invokedynamic b (IJ)Ljava/lang/String; bsm=vvn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: nop
      // 6e: bipush 1
      // 6f: anewarray 79
      // 72: dup
      // 73: bipush 0
      // 74: aload 2
      // 75: bipush 0
      // 76: aaload
      // 77: aastore
      // 78: invokestatic vvn.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 7b: goto 82
      // 7e: invokestatic vvn.a (Loov;)Loov;
      // 81: athrow
      // 82: iload 5
      // 84: ifne a5
      // 87: new dxs
      // 8a: dup
      // 8b: sipush 13083
      // 8e: ldc2_w 8693989033241272498
      // 91: lload 3
      // 92: lxor
      // 93: invokedynamic b (IJ)Ljava/lang/String; bsm=vvn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: nop
      // 99: bipush 0
      // 9a: anewarray 79
      // 9d: invokespecial dxs.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // a0: athrow
      // a1: invokestatic vvn.a (Loov;)Loov;
      // a4: athrow
      // a5: iload 5
      // a7: ifne c8
      // aa: new w57
      // ad: dup
      // ae: sipush 387
      // b1: ldc2_w 4404478115385692715
      // b4: lload 3
      // b5: lxor
      // b6: invokedynamic b (IJ)Ljava/lang/String; bsm=vvn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: nop
      // bc: bipush 0
      // bd: anewarray 79
      // c0: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // c3: athrow
      // c4: invokestatic vvn.a (Loov;)Loov;
      // c7: athrow
      // c8: return
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifeq 1f
      // 0b: arraylength
      // 0c: bipush 1
      // 0d: if_icmpne 31
      // 10: goto 17
      // 13: invokestatic vvn.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: goto 1f
      // 1b: invokestatic vvn.a (Loov;)Loov;
      // 1e: athrow
      // 1f: invokestatic vr1._0v ()Lvr1;
      // 22: invokevirtual vr1.wh3 ()Lwlx;
      // 25: invokevirtual wlx._rf ()Lo85;
      // 28: invokevirtual o85.zim ()[Ljava/lang/String;
      // 2b: invokestatic vvn.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 2e: goto 32
      // 31: aconst_null
      // 32: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-998923261231371448L, 4355338578110365337L, MethodHandles.lookup().lookupClass()).a(58446172426387L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 42816842417669L;
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
      String var6 = "¦\u0004\u0098Ý¿\u0083\u000eÇ\u00031}EjØ¬7Ãný(\n\u0094¤A«aªÚ:)'º\u0089\u0015²k0sæb\u0018Û\"ñcIÀ\u0098\u0005²ÏÐ\u0084O}\u0092!î\u00ad~ù&òè(\u0097æ\u009f³\u001fS#\u0099ß\u0085Rç\u00152×t\u0081-\b%¼\u009cSñ\u0098K·`hä\u00056[þ\u0001°\u00871b\u0094(<ÿ»\u0004ºj\u000eüh^,0 \u0092â`jÛ£òxÿßÁ\\\u001aäDâ\u0091¸\u0087\u001c\u009aÃ¶\u009b64ê";
      int var8 = "¦\u0004\u0098Ý¿\u0083\u000eÇ\u00031}EjØ¬7Ãný(\n\u0094¤A«aªÚ:)'º\u0089\u0015²k0sæb\u0018Û\"ñcIÀ\u0098\u0005²ÏÐ\u0084O}\u0092!î\u00ad~ù&òè(\u0097æ\u009f³\u001fS#\u0099ß\u0085Rç\u00152×t\u0081-\b%¼\u009cSñ\u0098K·`hä\u00056[þ\u0001°\u00871b\u0094(<ÿ»\u0004ºj\u000eüh^,0 \u0092â`jÛ£òxÿßÁ\\\u001aäDâ\u0091¸\u0087\u001c\u009aÃ¶\u009b64ê"
         .length();
      char var5 = '@';
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

                  var6 = "F\u009dË{\u009c\u001f\u008f>Tµ\u0016iÍ4(u±Fu²Ð>¬\u00870ü \u008d»Í+úhò7\u0011V±úzÇeÙ@ù]Ã£v$\u0018_>¹l×Î\u008cr°\n¶¥\u0087n7%V<à@½Â";
                  var8 = "F\u009dË{\u009c\u001f\u008f>Tµ\u0016iÍ4(u±Fu²Ð>¬\u00870ü \u008d»Í+úhò7\u0011V±úzÇeÙ@ù]Ã£v$\u0018_>¹l×Î\u008cr°\n¶¥\u0087n7%V<à@½Â"
                     .length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32759;
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
            throw new RuntimeException("vvn", var10);
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
         throw new RuntimeException("vvn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
