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

public class jqz extends Module {
   public static ModeSetting j8c;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public jqz() {
      long var1 = a ^ 94220628234578L;
      super(b<"r">(21364, 1221567097716661014L ^ var1), _aj._lm, j8c);
   }

   @EventHandler(
      jn1 = 4
   )
   public void r_4(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic jqz.a J
      // 03: ldc2_w 96380780391634
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: getstatic jqz.j8c Lc_3;
      // 10: invokevirtual ModeSetting.getValue ()Ljava/lang/String;
      // 13: sipush 23194
      // 16: ldc2_w 8567118582576803711
      // 19: lload 2
      // 1a: lxor
      // 1b: invokedynamic r (IJ)Ljava/lang/String; bsm=jqz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 24: iload 4
      // 26: ifeq 3e
      // 29: ifeq 6e
      // 2c: goto 33
      // 2f: invokestatic jqz.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: invokevirtual jqz.ao1 ()Z
      // 37: goto 3e
      // 3a: invokestatic jqz.a (Loov;)Loov;
      // 3d: athrow
      // 3e: ifeq 6e
      // 41: getstatic jqz.ek1 Lc05;
      // 44: getfield Minecraft.vg8 Ll86;
      // 47: getfield EntityPlayerSP.lq7 Lp_k;
      // 4a: invokevirtual p_k._m3 ()Lhv0;
      // 4d: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // 50: dup
      // 51: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.md_ Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 54: new mew
      // 57: dup
      // 58: bipush -1
      // 59: bipush -1
      // 5a: bipush -1
      // 5b: invokespecial mew.<init> (III)V
      // 5e: getstatic vt2.m3r Lvt2;
      // 61: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // 64: invokevirtual hv0.k7f (Lmz2;)V
      // 67: goto 6e
      // 6a: invokestatic jqz.a (Loov;)Loov;
      // 6d: athrow
      // 6e: return
   }

   @EventHandler(
      jn1 = 4
   )
   public void yyw(Event param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic jqz.a J
      // 03: ldc2_w 62290269847518
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: getstatic jqz.j8c Lc_3;
      // 10: invokevirtual ModeSetting.getValue ()Ljava/lang/String;
      // 13: sipush 23194
      // 16: ldc2_w 8567231852898090099
      // 19: lload 2
      // 1a: lxor
      // 1b: invokedynamic r (IJ)Ljava/lang/String; bsm=jqz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 24: iload 4
      // 26: ifeq 3e
      // 29: ifeq 77
      // 2c: goto 33
      // 2f: invokestatic jqz.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: invokevirtual jqz.ao1 ()Z
      // 37: goto 3e
      // 3a: invokestatic jqz.a (Loov;)Loov;
      // 3d: athrow
      // 3e: ifeq 77
      // 41: getstatic jqz.ek1 Lc05;
      // 44: getfield Minecraft.vg8 Ll86;
      // 47: getfield EntityPlayerSP.lq7 Lp_k;
      // 4a: invokevirtual p_k._m3 ()Lhv0;
      // 4d: new net/minecraft/network/play/client/C08PacketPlayerBlockPlacement
      // 50: dup
      // 51: new mew
      // 54: dup
      // 55: bipush -1
      // 56: bipush -1
      // 57: bipush -1
      // 58: invokespecial mew.<init> (III)V
      // 5b: sipush 255
      // 5e: getstatic jqz.ek1 Lc05;
      // 61: getfield Minecraft.vg8 Ll86;
      // 64: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 67: fconst_0
      // 68: fconst_0
      // 69: fconst_0
      // 6a: invokespecial net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.<init> (Lmew;ILerg;FFF)V
      // 6d: invokevirtual hv0.k7f (Lmz2;)V
      // 70: goto 77
      // 73: invokestatic jqz.a (Loov;)Loov;
      // 76: athrow
      // 77: return
   }

   public boolean ao1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic jqz.ek1 Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 0d: invokevirtual erg.gn1 ()Lu7m;
      // 10: instanceof za6
      // 13: iload 1
      // 14: ifeq 31
      // 17: ifeq 43
      // 1a: goto 21
      // 1d: invokestatic jqz.a (Loov;)Loov;
      // 20: athrow
      // 21: getstatic jqz.ek1 Lc05;
      // 24: getfield Minecraft.vg8 Ll86;
      // 27: invokevirtual EntityPlayerSP.kqa ()Z
      // 2a: goto 31
      // 2d: invokestatic jqz.a (Loov;)Loov;
      // 30: athrow
      // 31: iload 1
      // 32: ifeq 40
      // 35: ifeq 43
      // 38: goto 3f
      // 3b: invokestatic jqz.a (Loov;)Loov;
      // 3e: athrow
      // 3f: bipush 1
      // 40: goto 44
      // 43: bipush 0
      // 44: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8946894953448804873L, 8051449154594561809L, MethodHandles.lookup().lookupClass()).a(238503364741757L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 89962397927811L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "p\u0003Ù`p´ÇR\u0003^Ò9\u0099(DU\u0010{\r8\u009d¯L@ìh^\u0015¦$eNñ\u0010\u0082g5\u0017Ô¶Æ\u00126õ§\u0001è\u0013\"·\u0010d\u0013Ø\r\u009cÛ#\u0017\"\u0098N<\u009fÈìl";
      int var6 = "p\u0003Ù`p´ÇR\u0003^Ò9\u0099(DU\u0010{\r8\u009d¯L@ìh^\u0015¦$eNñ\u0010\u0082g5\u0017Ô¶Æ\u00126õ§\u0001è\u0013\"·\u0010d\u0013Ø\r\u009cÛ#\u0017\"\u0098N<\u009fÈìl"
         .length();
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
                     g = new String[6];
                     j8c = new ModeSetting(
                        b<"r">(1591, 2160938608717796992L ^ var9),
                        b<"r">(15873, 6836172689658785460L ^ var9),
                        b<"r">(18079, 9147268789287179821L ^ var9),
                        new String[]{b<"r">(23194, 8567115944840350254L ^ var9), b<"r">(22268, 4367085985112049226L ^ var9)}
                     );
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

                  var4 = "ÛÆ3\u0014N\r#úøbÝ\u0086\u008dî²·\u0010t\u0003¥ª½Ë\u009b&\u008d\u0016zçFìK\u001f";
                  var6 = "ÛÆ3\u0014N\r#úøbÝ\u0086\u008dî²·\u0010t\u0003¥ª½Ë\u009b&\u008d\u0016zçFìK\u001f".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6203;
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
            throw new RuntimeException("jqz", var10);
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
         throw new RuntimeException("jqz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
