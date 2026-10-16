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

public class ryb extends Module {
   public static NumberSetting tb1;
   public static NumberSetting b2c;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ryb() {
      long var1 = a ^ 36995282174127L;
      super(b<"e">(18117, 3652091392942424605L ^ var1), _aj.p3z, false, new SubEngine[0]);
   }

   @EventHandler
   public void nxq(PlayerUpdateEvent param1) {
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
      // 05: invokevirtual PlayerUpdateEvent.lhw ()Z
      // 08: ifeq 10
      // 0b: return
      // 0c: invokestatic ryb.a (Loov;)Loov;
      // 0f: athrow
      // 10: aload 0
      // 11: invokespecial ryb.qgv ()Lg_3;
      // 14: astore 3
      // 15: iload 2
      // 16: ifeq 2b
      // 19: aload 3
      // 1a: ifnonnull 29
      // 1d: goto 24
      // 20: invokestatic ryb.a (Loov;)Loov;
      // 23: athrow
      // 24: return
      // 25: invokestatic ryb.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: pop
      // 2b: getstatic ryb.ek1 Lc05;
      // 2e: getfield Minecraft.vg8 Ll86;
      // 31: getfield EntityPlayerSP.up_ Ljnq;
      // 34: invokevirtual jnq.dxs ()Lerg;
      // 37: iload 2
      // 38: ifeq 65
      // 3b: ifnull 8c
      // 3e: goto 45
      // 41: invokestatic ryb.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 0
      // 46: iload 2
      // 47: ifeq 76
      // 4a: goto 51
      // 4d: invokestatic ryb.a (Loov;)Loov;
      // 50: athrow
      // 51: pop
      // 52: getstatic ryb.ek1 Lc05;
      // 55: getfield Minecraft.vg8 Ll86;
      // 58: getfield EntityPlayerSP.up_ Ljnq;
      // 5b: invokevirtual jnq.dxs ()Lerg;
      // 5e: goto 65
      // 61: invokestatic ryb.a (Loov;)Loov;
      // 64: athrow
      // 65: invokevirtual erg.gn1 ()Lu7m;
      // 68: instanceof r5m
      // 6b: ifeq 8c
      // 6e: aload 0
      // 6f: goto 76
      // 72: invokestatic ryb.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 3
      // 77: invokespecial ryb.riz (Li2h;)[F
      // 7a: astore 4
      // 7c: aload 1
      // 7d: aload 4
      // 7f: bipush 0
      // 80: faload
      // 81: invokevirtual PlayerUpdateEvent.h8j (F)V
      // 84: aload 1
      // 85: aload 4
      // 87: bipush 1
      // 88: faload
      // 89: invokevirtual PlayerUpdateEvent.ni7 (F)V
      // 8c: return
   }

   private float[] riz(EntityLivingBase var1) {
      double var2 = (double)ek1.vg8.tm6(var1);
      double var4 = var1.o2v + (var1.o2v - var1.ivp) * var2 * 0.8;
      double var6 = var1.vbd + (var1.vbd - var1.e2b) * var2 * 0.8;
      double var8 = var4 - ek1.vg8.o2v;
      double var10 = var6 - ek1.vg8.vbd;
      double var12 = var1.kfp + 1.0 - (ek1.vg8.kfp + (double)ek1.vg8.c5y());
      double var14 = Math.sqrt(var8 * var8 + var10 * var10);
      float var16 = (float)(Math.atan2(var10, var8) * 180.0 / Math.PI) - 90.0F;
      float var17 = -omb.pnh((float)var14, (float)var12, 1.0F);
      return new float[]{var16, var17};
   }

   private Entity qgv() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: invokestatic uj3.o1c ()Ljava/util/List;
      // 07: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 0c: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ryb.oou (Lha9;)Z, (Lha9;)Z ]
      // 11: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 16: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ryb.ugj (Lha9;)Z, (Lha9;)Z ]
      // 1b: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 20: aload 0
      // 21: pop
      // 22: getstatic ryb.ek1 Lc05;
      // 25: getfield Minecraft.vg8 Ll86;
      // 28: dup
      // 29: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2c: pop
      // 2d: invokedynamic test (Ll86;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, Entity.gq6 (Li2h;)Z, (Lha9;)Z ]
      // 32: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 37: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ryb.qta (Lha9;)Z, (Lha9;)Z ]
      // 3c: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 41: aload 0
      // 42: invokedynamic applyAsDouble (Lryb;)Ljava/util/function/ToDoubleFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)D, ryb.syz (Li2h;)F, (Lha9;)D ]
      // 47: invokestatic java/util/Comparator.comparingDouble (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
      // 4a: invokeinterface java/util/stream/Stream.sorted (Ljava/util/Comparator;)Ljava/util/stream/Stream; 2
      // 4f: invokestatic java/util/stream/Collectors.toList ()Ljava/util/stream/Collector;
      // 52: invokeinterface java/util/stream/Stream.collect (Ljava/util/stream/Collector;)Ljava/lang/Object; 2
      // 57: checkcast java/util/List
      // 5a: astore 2
      // 5b: aload 2
      // 5c: iload 1
      // 5d: ifeq 7c
      // 60: invokeinterface java/util/List.size ()I 1
      // 65: ifgt 75
      // 68: goto 6f
      // 6b: invokestatic ryb.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aconst_null
      // 70: areturn
      // 71: invokestatic ryb.a (Loov;)Loov;
      // 74: athrow
      // 75: aload 2
      // 76: bipush 0
      // 77: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 7c: checkcast Entity
      // 7f: areturn
   }

   private float syz(EntityLivingBase var1) {
      return Math.abs(ek1.vg8.x5k - omb.ndg(var1)[0]);
   }

   private static boolean qta(ha9 var0) {
      return omb.jok(var0, tb1.getValue());
   }

   private static boolean ugj(ha9 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic ModuleRegistry.p71 Lar9;
      // 07: invokevirtual AntiBots.isEnabled ()Z
      // 0a: iload 1
      // 0b: ifeq 35
      // 0e: ifeq 34
      // 11: goto 18
      // 14: invokestatic ryb.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic ModuleRegistry.p71 Lar9;
      // 1b: aload 0
      // 1c: invokevirtual AntiBots.kh5 (Lg_3;)Z
      // 1f: iload 1
      // 20: ifeq 35
      // 23: goto 2a
      // 26: invokestatic ryb.a (Loov;)Loov;
      // 29: athrow
      // 2a: ifne 38
      // 2d: goto 34
      // 30: invokestatic ryb.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 1
      // 35: goto 39
      // 38: bipush 0
      // 39: ireturn
   }

   private static boolean oou(ha9 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic ClientState.o1s Lcn7;
      // 07: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: iload 1
      // 0e: ifeq 35
      // 11: ifeq 34
      // 14: goto 1b
      // 17: invokestatic ryb.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokestatic f62.a92 (Lha9;)Z
      // 1f: iload 1
      // 20: ifeq 35
      // 23: goto 2a
      // 26: invokestatic ryb.a (Loov;)Loov;
      // 29: athrow
      // 2a: ifne 38
      // 2d: goto 34
      // 30: invokestatic ryb.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 1
      // 35: goto 39
      // 38: bipush 0
      // 39: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3725508852621599118L, 2774421105860345914L, MethodHandles.lookup().lookupClass()).a(206299039878511L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 59612639368400L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "_\u008f\u0088\u0003²»£\u0015¸¤\u009fãuëYE \u0001ùLÜìC¥ææèÖ[£mçiÉmGÖ¯£ÈÊ/³ê¬&'\u0003Å";
      int var6 = "_\u008f\u0088\u0003²»£\u0015¸¤\u009fãuëYE \u0001ùLÜìC¥ææèÖ[£mçiÉmGÖ¯£ÈÊ/³ê¬&'\u0003Å".length();
      char var3 = 16;
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
                     g = new String[4];
                     tb1 = new NumberSetting(b<"e">(8213, 7720353309659574448L ^ var9), b<"e">(12788, 761829989475590482L ^ var9), 180.0F, 10.0F, 360.0F, 10.0F, "°");
                     b2c = new NumberSetting(b<"e">(8213, 7720353309659574448L ^ var9), b<"e">(20114, 2121632687574343222L ^ var9), 100.0F, 1.0F, 200.0F, 10.0F);
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

                  var4 = "7û\u0016¨Ü\u007f\u009fþuåÄ/«I^W ·@\u0091U]î\u008cý®\u0005\u00853¤º/ÑsÓi³·\u000bò\u000eÔ½$ºÀ\u009b)1";
                  var6 = "7û\u0016¨Ü\u007f\u009fþuåÄ/«I^W ·@\u0091U]î\u008cý®\u0005\u00853¤º/ÑsÓi³·\u000bò\u000eÔ½$ºÀ\u009b)1".length();
                  var3 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 657;
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
            throw new RuntimeException("ryb", var10);
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
         throw new RuntimeException("ryb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
