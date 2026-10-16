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

public class zd0 extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 82724905544713L;
      return b<"x">(1002, 7028530683477810870L ^ var1);
   }

   @Override
   public int bag() {
      return 3;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 76702328598671L;
      return b<"x">(6944, 4145103773046086397L ^ var2);
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
      // 0a: invokevirtual wlx.w68 ()Lwxb;
      // 0d: invokevirtual wxb.dc3 ()Z
      // 10: iload 2
      // 11: ifne 2a
      // 14: ifeq 3c
      // 17: goto 1e
      // 1a: invokestatic zd0.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: invokespecial bc_.m6l (Le7r;)Z
      // 23: goto 2a
      // 26: invokestatic zd0.a (Loov;)Loov;
      // 29: athrow
      // 2a: iload 2
      // 2b: ifne 39
      // 2e: ifeq 3c
      // 31: goto 38
      // 34: invokestatic zd0.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 1
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
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
      // 00: getstatic zd0.a J
      // 03: ldc2_w 87133500086604
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 2
      // 0e: arraylength
      // 0f: iload 5
      // 11: ifeq 2c
      // 14: bipush 1
      // 15: if_icmpne a8
      // 18: goto 1f
      // 1b: invokestatic zd0.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 2
      // 20: bipush 0
      // 21: aaload
      // 22: invokevirtual java/lang/String.length ()I
      // 25: goto 2c
      // 28: invokestatic zd0.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifle a8
      // 2f: invokestatic vr1._0v ()Lvr1;
      // 32: astore 6
      // 34: aload 6
      // 36: invokevirtual vr1.wh3 ()Lwlx;
      // 39: invokevirtual wlx.w68 ()Lwxb;
      // 3c: aload 2
      // 3d: bipush 0
      // 3e: aaload
      // 3f: invokevirtual wxb.siv (Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;
      // 42: astore 7
      // 44: iload 5
      // 46: ifeq a3
      // 49: aload 7
      // 4b: ifnonnull 79
      // 4e: goto 55
      // 51: invokestatic zd0.a (Loov;)Loov;
      // 54: athrow
      // 55: new uvb
      // 58: dup
      // 59: sipush 28341
      // 5c: ldc2_w 1289626395236648621
      // 5f: lload 3
      // 60: lxor
      // 61: invokedynamic x (IJ)Ljava/lang/String; bsm=zd0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: nop
      // 67: bipush 1
      // 68: anewarray 64
      // 6b: dup
      // 6c: bipush 0
      // 6d: aload 2
      // 6e: bipush 0
      // 6f: aaload
      // 70: aastore
      // 71: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 74: athrow
      // 75: invokestatic zd0.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 6
      // 7b: invokevirtual vr1.wh3 ()Lwlx;
      // 7e: invokevirtual wlx.w68 ()Lwxb;
      // 81: aload 7
      // 83: invokevirtual wxb.qwz (Ljava/lang/Object;)V
      // 86: aload 1
      // 87: aload 0
      // 88: sipush 6993
      // 8b: ldc2_w 5198126852401705803
      // 8e: lload 3
      // 8f: lxor
      // 90: invokedynamic x (IJ)Ljava/lang/String; bsm=zd0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: nop
      // 96: bipush 1
      // 97: anewarray 64
      // 9a: dup
      // 9b: bipush 0
      // 9c: aload 2
      // 9d: bipush 0
      // 9e: aaload
      // 9f: aastore
      // a0: invokestatic zd0.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // a3: iload 5
      // a5: ifne c6
      // a8: new w57
      // ab: dup
      // ac: sipush 18856
      // af: ldc2_w 9119675839738995123
      // b2: lload 3
      // b3: lxor
      // b4: invokedynamic x (IJ)Ljava/lang/String; bsm=zd0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: nop
      // ba: bipush 0
      // bb: anewarray 64
      // be: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // c1: athrow
      // c2: invokestatic zd0.a (Loov;)Loov;
      // c5: athrow
      // c6: return
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifne 1f
      // 0b: arraylength
      // 0c: bipush 1
      // 0d: if_icmpne 31
      // 10: goto 17
      // 13: invokestatic zd0.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: goto 1f
      // 1b: invokestatic zd0.a (Loov;)Loov;
      // 1e: athrow
      // 1f: invokestatic vr1._0v ()Lvr1;
      // 22: invokevirtual vr1.wh3 ()Lwlx;
      // 25: invokevirtual wlx.w68 ()Lwxb;
      // 28: invokevirtual wxb.zim ()[Ljava/lang/String;
      // 2b: invokestatic zd0.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 2e: goto 32
      // 31: aconst_null
      // 32: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4222961118995750837L, 2039305378751341832L, MethodHandles.lookup().lookupClass()).a(238223492999613L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 75326660046477L;
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
      String var6 = "Û\u0084:Z\u0018æðAâÞ\u008f\u0006K*ý1ç\u0011o^\u0019\u000eÐÁå4w\u0018\b°PÐuî\u000f§ç\u009dë\u00adý0\u0090\u009f\u001f8W\u009a(p\u0086æD!\u0092\u0091\u0093¥U\u001d\u0091?¶M\u0015\u0087Í¦Ó\u0086ç\ryZ=\u0095WT6t|xvº\u009a\u0089Hþ±(ä\u0080æ\u0095\u001aØ\u008a\fº\u0016ãõu\u008dø;ôÎ\u009fé~\"ÔE3P4\u001c\b+Ä è\t\rÃØ¶Ó\u0094";
      int var8 = "Û\u0084:Z\u0018æðAâÞ\u008f\u0006K*ý1ç\u0011o^\u0019\u000eÐÁå4w\u0018\b°PÐuî\u000f§ç\u009dë\u00adý0\u0090\u009f\u001f8W\u009a(p\u0086æD!\u0092\u0091\u0093¥U\u001d\u0091?¶M\u0015\u0087Í¦Ó\u0086ç\ryZ=\u0095WT6t|xvº\u009a\u0089Hþ±(ä\u0080æ\u0095\u001aØ\u008a\fº\u0016ãõu\u008dø;ôÎ\u009fé~\"ÔE3P4\u001c\b+Ä è\t\rÃØ¶Ó\u0094"
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

                  var6 = "d\u001d½èäÀU\u0014[ìa5\u001c\u0017uG(°©Ä|ÚYfÎ'ÿ\u0092w9À\u00911sÏCº\u008dà°¥{.¦\u00ad$\fjmz\u00109cA\b[R";
                  var8 = "d\u001d½èäÀU\u0014[ìa5\u001c\u0017uG(°©Ä|ÚYfÎ'ÿ\u0092w9À\u00911sÏCº\u008dà°¥{.¦\u00ad$\fjmz\u00109cA\b[R".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1092;
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
            throw new RuntimeException("zd0", var10);
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
         throw new RuntimeException("zd0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
