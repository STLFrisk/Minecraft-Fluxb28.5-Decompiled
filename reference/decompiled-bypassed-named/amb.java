import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class amb {
   public static int fqe;
   public static int b4p;
   public static int r5g;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static int zws() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: bipush 0
      // 05: istore 1
      // 06: iload 1
      // 07: bipush 8
      // 09: if_icmpge 35
      // 0c: getstatic amb.r2l Lc05;
      // 0f: getfield Minecraft.vg8 Ll86;
      // 12: getfield EntityPlayerSP.up_ Ljnq;
      // 15: iload 0
      // 16: ifeq 3e
      // 19: getfield jnq.c41 [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: ifnonnull 2e
      // 21: goto 28
      // 24: invokestatic amb.a (Loov;)Loov;
      // 27: athrow
      // 28: iload 1
      // 29: ireturn
      // 2a: invokestatic amb.a (Loov;)Loov;
      // 2d: athrow
      // 2e: iinc 1 1
      // 31: iload 0
      // 32: ifne 06
      // 35: getstatic amb.r2l Lc05;
      // 38: getfield Minecraft.vg8 Ll86;
      // 3b: getfield EntityPlayerSP.up_ Ljnq;
      // 3e: getfield jnq.nb5 I
      // 41: getstatic amb.r2l Lc05;
      // 44: getfield Minecraft.vg8 Ll86;
      // 47: getfield EntityPlayerSP.up_ Ljnq;
      // 4a: iload 0
      // 4b: ifeq 6c
      // 4e: invokevirtual jnq.dxs ()Lerg;
      // 51: ifnonnull 63
      // 54: goto 5b
      // 57: invokestatic amb.a (Loov;)Loov;
      // 5a: athrow
      // 5b: bipush 0
      // 5c: goto 8b
      // 5f: invokestatic amb.a (Loov;)Loov;
      // 62: athrow
      // 63: getstatic amb.r2l Lc05;
      // 66: getfield Minecraft.vg8 Ll86;
      // 69: getfield EntityPlayerSP.up_ Ljnq;
      // 6c: getfield jnq.nb5 I
      // 6f: iload 0
      // 70: ifeq 87
      // 73: bipush 8
      // 75: if_icmpge 8a
      // 78: goto 7f
      // 7b: invokestatic amb.a (Loov;)Loov;
      // 7e: athrow
      // 7f: bipush 4
      // 80: goto 87
      // 83: invokestatic amb.a (Loov;)Loov;
      // 86: athrow
      // 87: goto 8b
      // 8a: bipush -1
      // 8b: iadd
      // 8c: ireturn
   }

   public static int rk5(int var0) {
      try {
         if (r2l.vg8.up_.c41[var0] == null) {
            return var0;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return zws();
   }

   public static void vtl(int var0) {
      r2l.l7q.efg(r2l.vg8.fv9.h7l, var0, 0, 1, r2l.vg8);
   }

   public static void l_g(int var0, int var1) {
      r2l.l7q.efg(r2l.vg8.fv9.h7l, var0, var1, 2, r2l.vg8);
   }

   public static boolean sxg() {
      int var0 = OpaquePredicate.b();

      try {
         boolean var10000 = Arrays.asList(r2l.vg8.up_.c41).contains(null);
         if (var0 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public static int uew(int var0) {
      return 8 - var0;
   }

   public static void f4n() {
      r2l.l7q.sendUseItem(r2l.vg8, r2l.tij, r2l.vg8.up_.dxs());
   }

   public static erg p2w() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: getstatic amb.r2l Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: iload 0
      // 0b: ifeq 32
      // 0e: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // 11: ifnonnull 2c
      // 14: goto 1b
      // 17: invokestatic amb.a (Loov;)Loov;
      // 1a: athrow
      // 1b: new erg
      // 1e: dup
      // 1f: getstatic ox_.ibw Le0x;
      // 22: invokespecial erg.<init> (Le0x;)V
      // 25: goto 35
      // 28: invokestatic amb.a (Loov;)Loov;
      // 2b: athrow
      // 2c: getstatic amb.r2l Lc05;
      // 2f: getfield Minecraft.vg8 Ll86;
      // 32: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // 35: areturn
   }

   public static erg txc(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic amb.r2l Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: getfield EntityPlayerSP.up_ Ljnq;
      // 0d: getfield jnq.c41 [Lerg;
      // 10: iload 0
      // 11: iload 1
      // 12: ifeq 3e
      // 15: aaload
      // 16: ifnonnull 31
      // 19: goto 20
      // 1c: invokestatic amb.a (Loov;)Loov;
      // 1f: athrow
      // 20: new erg
      // 23: dup
      // 24: getstatic ox_.ibw Le0x;
      // 27: invokespecial erg.<init> (Le0x;)V
      // 2a: goto 3f
      // 2d: invokestatic amb.a (Loov;)Loov;
      // 30: athrow
      // 31: getstatic amb.r2l Lc05;
      // 34: getfield Minecraft.vg8 Ll86;
      // 37: getfield EntityPlayerSP.up_ Ljnq;
      // 3a: getfield jnq.c41 [Lerg;
      // 3d: iload 0
      // 3e: aaload
      // 3f: areturn
   }

   public static List d5v() {
      ArrayList var1 = new ArrayList();
      int var10000 = OpaquePredicate.b();
      int var2 = 0;
      int var0 = var10000;

      while (true) {
         if (var2 < 9) {
            try {
               var4 = var1;
               if (var0 == 0) {
                  break;
               }

               var1.add(r2l.vg8.up_.c41[var2]);
               var2++;
               if (var0 != 0) {
                  continue;
               }
            } catch (oov var3) {
               throw a(var3);
            }
         }

         var4 = var1;
         break;
      }

      return var4;
   }

   public static List ta6() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: bipush 0
      // 0c: istore 2
      // 0d: istore 0
      // 0e: iload 2
      // 0f: bipush 35
      // 11: if_icmpge 3b
      // 14: aload 1
      // 15: getstatic amb.r2l Lc05;
      // 18: getfield Minecraft.vg8 Ll86;
      // 1b: getfield EntityPlayerSP.up_ Ljnq;
      // 1e: getfield jnq.c41 [Lerg;
      // 21: iload 2
      // 22: aaload
      // 23: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 28: pop
      // 29: iinc 2 1
      // 2c: iload 0
      // 2d: ifne 3d
      // 30: iload 0
      // 31: ifeq 0e
      // 34: goto 3b
      // 37: invokestatic amb.a (Loov;)Loov;
      // 3a: athrow
      // 3b: bipush 0
      // 3c: istore 2
      // 3d: iload 2
      // 3e: bipush 4
      // 3f: if_icmpge 6f
      // 42: aload 1
      // 43: iload 0
      // 44: ifne 70
      // 47: goto 4e
      // 4a: invokestatic amb.a (Loov;)Loov;
      // 4d: athrow
      // 4e: getstatic amb.r2l Lc05;
      // 51: getfield Minecraft.vg8 Ll86;
      // 54: getfield EntityPlayerSP.up_ Ljnq;
      // 57: iload 2
      // 58: invokevirtual jnq.tjd (I)Lerg;
      // 5b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 60: pop
      // 61: iinc 2 1
      // 64: iload 0
      // 65: ifeq 3d
      // 68: goto 6f
      // 6b: invokestatic amb.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 1
      // 70: areturn
   }

   public static List f12() {
      ArrayList var1 = new ArrayList();
      int var10000 = OpaquePredicate.c();
      int var2 = 9;
      int var0 = var10000;

      while (true) {
         if (var2 < 35) {
            try {
               var4 = var1;
               if (var0 != 0) {
                  break;
               }

               var1.add(r2l.vg8.up_.c41[var2]);
               var2++;
               if (var0 == 0) {
                  continue;
               }
            } catch (oov var3) {
               throw a(var3);
            }
         }

         var4 = var1;
         break;
      }

      return var4;
   }

   public static int kiu() {
      int var0 = OpaquePredicate.b();
      int var1 = 0;

      while (var1 < 9) {
         try {
            if (r2l.vg8.up_.c41[var1] == null) {
               return var1;
            }
         } catch (oov var2) {
            throw a(var2);
         }

         var1++;
         if (var0 == 0) {
            break;
         }
      }

      return -1;
   }

   public static float my2(erg param0) {
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
      // 05: iload 1
      // 06: ifne 14
      // 09: ifnull 28
      // 0c: goto 13
      // 0f: invokestatic amb.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual erg.gn1 ()Lu7m;
      // 17: iload 1
      // 18: ifne 34
      // 1b: instanceof jpt
      // 1e: ifne 30
      // 21: goto 28
      // 24: invokestatic amb.a (Loov;)Loov;
      // 27: athrow
      // 28: ldc -1.0
      // 2a: nop
      // 2b: freturn
      // 2c: invokestatic amb.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: invokevirtual erg.gn1 ()Lu7m;
      // 34: checkcast jpt
      // 37: astore 2
      // 38: fconst_0
      // 39: fstore 3
      // 3a: fload 3
      // 3b: aload 2
      // 3c: getfield jpt._wl I
      // 3f: i2f
      // 40: fadd
      // 41: fstore 3
      // 42: aload 0
      // 43: invokestatic hc0.aau (Lerg;)Ljava/util/Map;
      // 46: invokeinterface java/util/Map.size ()I 1
      // 4b: iload 1
      // 4c: ifne 6b
      // 4f: ifgt 61
      // 52: goto 59
      // 55: invokestatic amb.a (Loov;)Loov;
      // 58: athrow
      // 59: fload 3
      // 5a: f2d
      // 5b: ldc2_w 0.1
      // 5e: dsub
      // 5f: d2f
      // 60: fstore 3
      // 61: getstatic vef.o55 Lvef;
      // 64: getfield vef.bbf I
      // 67: aload 0
      // 68: invokestatic hc0.qa_ (ILerg;)I
      // 6b: istore 4
      // 6d: fload 3
      // 6e: f2d
      // 6f: iload 4
      // 71: i2d
      // 72: ldc2_w 0.2
      // 75: dmul
      // 76: dadd
      // 77: d2f
      // 78: fstore 3
      // 79: fload 3
      // 7a: freturn
   }

   public static boolean b_r() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: getstatic amb.r2l Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: getfield EntityPlayerSP.up_ Ljnq;
      // 0d: invokevirtual jnq.dxs ()Lerg;
      // 10: iload 0
      // 11: ifeq 30
      // 14: ifnull 24
      // 17: goto 1e
      // 1a: invokestatic amb.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic amb.a (Loov;)Loov;
      // 23: athrow
      // 24: getstatic amb.r2l Lc05;
      // 27: getfield Minecraft.vg8 Ll86;
      // 2a: getfield EntityPlayerSP.up_ Ljnq;
      // 2d: invokevirtual jnq.dxs ()Lerg;
      // 30: invokevirtual erg.gn1 ()Lu7m;
      // 33: instanceof dlj
      // 36: iload 0
      // 37: ifeq 6c
      // 3a: ifne 6b
      // 3d: goto 44
      // 40: invokestatic amb.a (Loov;)Loov;
      // 43: athrow
      // 44: getstatic amb.r2l Lc05;
      // 47: getfield Minecraft.vg8 Ll86;
      // 4a: getfield EntityPlayerSP.up_ Ljnq;
      // 4d: invokevirtual jnq.dxs ()Lerg;
      // 50: invokevirtual erg.gn1 ()Lu7m;
      // 53: instanceof za6
      // 56: iload 0
      // 57: ifeq 6c
      // 5a: goto 61
      // 5d: invokestatic amb.a (Loov;)Loov;
      // 60: athrow
      // 61: ifeq 6f
      // 64: goto 6b
      // 67: invokestatic amb.a (Loov;)Loov;
      // 6a: athrow
      // 6b: bipush 1
      // 6c: goto 70
      // 6f: bipush 0
      // 70: ireturn
   }

   public static boolean gcw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: getstatic amb.r2l Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 0d: iload 0
      // 0e: ifeq 2b
      // 11: ifnull 43
      // 14: goto 1b
      // 17: invokestatic amb.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic amb.r2l Lc05;
      // 1e: getfield Minecraft.vg8 Ll86;
      // 21: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 24: goto 2b
      // 27: invokestatic amb.a (Loov;)Loov;
      // 2a: athrow
      // 2b: invokevirtual erg.gn1 ()Lu7m;
      // 2e: instanceof za6
      // 31: iload 0
      // 32: ifeq 40
      // 35: ifeq 43
      // 38: goto 3f
      // 3b: invokestatic amb.a (Loov;)Loov;
      // 3e: athrow
      // 3f: bipush 1
      // 40: goto 44
      // 43: bipush 0
      // 44: ireturn
   }

   public static void _i2() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: bipush 9
      // 06: istore 1
      // 07: iload 1
      // 08: bipush 45
      // 0a: if_icmpge fe
      // 0d: getstatic amb.r2l Lc05;
      // 10: getfield Minecraft.vg8 Ll86;
      // 13: getfield EntityPlayerSP.fv9 L_jc;
      // 16: iload 1
      // 17: invokevirtual _jc.ajr (I)Lvrx;
      // 1a: iload 0
      // 1b: ifne 3f
      // 1e: invokevirtual vrx.hf8 ()Z
      // 21: ifeq f7
      // 24: goto 2b
      // 27: invokestatic amb.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getstatic amb.r2l Lc05;
      // 2e: getfield Minecraft.vg8 Ll86;
      // 31: getfield EntityPlayerSP.fv9 L_jc;
      // 34: iload 1
      // 35: invokevirtual _jc.ajr (I)Lvrx;
      // 38: goto 3f
      // 3b: invokestatic amb.a (Loov;)Loov;
      // 3e: athrow
      // 3f: invokevirtual vrx.x4s ()Lerg;
      // 42: astore 2
      // 43: iload 0
      // 44: ifne fa
      // 47: aload 2
      // 48: invokestatic amb.eke (Lerg;)Z
      // 4b: ifeq f7
      // 4e: goto 55
      // 51: invokestatic amb.a (Loov;)Loov;
      // 54: athrow
      // 55: getstatic amb.fqe I
      // 58: iload 0
      // 59: ifne 79
      // 5c: goto 63
      // 5f: invokestatic amb.a (Loov;)Loov;
      // 62: athrow
      // 63: iload 1
      // 64: if_icmpeq f7
      // 67: goto 6e
      // 6a: invokestatic amb.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 2
      // 6f: invokestatic amb.ejj (Lerg;)Z
      // 72: goto 79
      // 75: invokestatic amb.a (Loov;)Loov;
      // 78: athrow
      // 79: iload 0
      // 7a: ifne a0
      // 7d: ifne f7
      // 80: goto 87
      // 83: invokestatic amb.a (Loov;)Loov;
      // 86: athrow
      // 87: getstatic amb.r2l Lc05;
      // 8a: getfield Minecraft.vg8 Ll86;
      // 8d: getfield EntityPlayerSP.fv9 L_jc;
      // 90: getstatic amb.fqe I
      // 93: invokevirtual _jc.ajr (I)Lvrx;
      // 96: invokevirtual vrx.hf8 ()Z
      // 99: goto a0
      // 9c: invokestatic amb.a (Loov;)Loov;
      // 9f: athrow
      // a0: iload 0
      // a1: ifne df
      // a4: ifne c3
      // a7: goto ae
      // aa: invokestatic amb.a (Loov;)Loov;
      // ad: athrow
      // ae: iload 1
      // af: getstatic amb.fqe I
      // b2: bipush 36
      // b4: isub
      // b5: invokestatic amb.l_g (II)V
      // b8: iload 0
      // b9: ifeq f7
      // bc: goto c3
      // bf: invokestatic amb.a (Loov;)Loov;
      // c2: athrow
      // c3: getstatic amb.r2l Lc05;
      // c6: getfield Minecraft.vg8 Ll86;
      // c9: getfield EntityPlayerSP.fv9 L_jc;
      // cc: getstatic amb.fqe I
      // cf: invokevirtual _jc.ajr (I)Lvrx;
      // d2: invokevirtual vrx.x4s ()Lerg;
      // d5: invokestatic amb.eke (Lerg;)Z
      // d8: goto df
      // db: invokestatic amb.a (Loov;)Loov;
      // de: athrow
      // df: iload 0
      // e0: ifne ee
      // e3: ifne f7
      // e6: goto ed
      // e9: invokestatic amb.a (Loov;)Loov;
      // ec: athrow
      // ed: iload 1
      // ee: getstatic amb.fqe I
      // f1: bipush 36
      // f3: isub
      // f4: invokestatic amb.l_g (II)V
      // f7: iinc 1 1
      // fa: iload 0
      // fb: ifeq 07
      // fe: return
   }

   public static void taj() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: bipush 9
      // 06: istore 1
      // 07: iload 1
      // 08: bipush 45
      // 0a: if_icmpge fe
      // 0d: getstatic amb.r2l Lc05;
      // 10: getfield Minecraft.vg8 Ll86;
      // 13: getfield EntityPlayerSP.fv9 L_jc;
      // 16: iload 1
      // 17: invokevirtual _jc.ajr (I)Lvrx;
      // 1a: iload 0
      // 1b: ifeq 3f
      // 1e: invokevirtual vrx.hf8 ()Z
      // 21: ifeq f7
      // 24: goto 2b
      // 27: invokestatic amb.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getstatic amb.r2l Lc05;
      // 2e: getfield Minecraft.vg8 Ll86;
      // 31: getfield EntityPlayerSP.fv9 L_jc;
      // 34: iload 1
      // 35: invokevirtual _jc.ajr (I)Lvrx;
      // 38: goto 3f
      // 3b: invokestatic amb.a (Loov;)Loov;
      // 3e: athrow
      // 3f: invokevirtual vrx.x4s ()Lerg;
      // 42: astore 2
      // 43: iload 0
      // 44: ifeq fa
      // 47: aload 2
      // 48: invokestatic amb.itg (Lerg;)Z
      // 4b: ifeq f7
      // 4e: goto 55
      // 51: invokestatic amb.a (Loov;)Loov;
      // 54: athrow
      // 55: getstatic amb.r5g I
      // 58: iload 0
      // 59: ifeq 79
      // 5c: goto 63
      // 5f: invokestatic amb.a (Loov;)Loov;
      // 62: athrow
      // 63: iload 1
      // 64: if_icmpeq f7
      // 67: goto 6e
      // 6a: invokestatic amb.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 2
      // 6f: invokestatic amb.ejj (Lerg;)Z
      // 72: goto 79
      // 75: invokestatic amb.a (Loov;)Loov;
      // 78: athrow
      // 79: iload 0
      // 7a: ifeq a0
      // 7d: ifne f7
      // 80: goto 87
      // 83: invokestatic amb.a (Loov;)Loov;
      // 86: athrow
      // 87: getstatic amb.r2l Lc05;
      // 8a: getfield Minecraft.vg8 Ll86;
      // 8d: getfield EntityPlayerSP.fv9 L_jc;
      // 90: getstatic amb.r5g I
      // 93: invokevirtual _jc.ajr (I)Lvrx;
      // 96: invokevirtual vrx.hf8 ()Z
      // 99: goto a0
      // 9c: invokestatic amb.a (Loov;)Loov;
      // 9f: athrow
      // a0: iload 0
      // a1: ifeq df
      // a4: ifne c3
      // a7: goto ae
      // aa: invokestatic amb.a (Loov;)Loov;
      // ad: athrow
      // ae: iload 1
      // af: getstatic amb.r5g I
      // b2: bipush 36
      // b4: isub
      // b5: invokestatic amb.l_g (II)V
      // b8: iload 0
      // b9: ifne f7
      // bc: goto c3
      // bf: invokestatic amb.a (Loov;)Loov;
      // c2: athrow
      // c3: getstatic amb.r2l Lc05;
      // c6: getfield Minecraft.vg8 Ll86;
      // c9: getfield EntityPlayerSP.fv9 L_jc;
      // cc: getstatic amb.r5g I
      // cf: invokevirtual _jc.ajr (I)Lvrx;
      // d2: invokevirtual vrx.x4s ()Lerg;
      // d5: invokestatic amb.itg (Lerg;)Z
      // d8: goto df
      // db: invokestatic amb.a (Loov;)Loov;
      // de: athrow
      // df: iload 0
      // e0: ifeq ee
      // e3: ifne f7
      // e6: goto ed
      // e9: invokestatic amb.a (Loov;)Loov;
      // ec: athrow
      // ed: iload 1
      // ee: getstatic amb.r5g I
      // f1: bipush 36
      // f3: isub
      // f4: invokestatic amb.l_g (II)V
      // f7: iinc 1 1
      // fa: iload 0
      // fb: ifne 07
      // fe: return
   }

   public static void aki() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: bipush 9
      // 06: istore 1
      // 07: iload 1
      // 08: bipush 45
      // 0a: if_icmpge fe
      // 0d: getstatic amb.r2l Lc05;
      // 10: getfield Minecraft.vg8 Ll86;
      // 13: getfield EntityPlayerSP.fv9 L_jc;
      // 16: iload 1
      // 17: invokevirtual _jc.ajr (I)Lvrx;
      // 1a: iload 0
      // 1b: ifne 3f
      // 1e: invokevirtual vrx.hf8 ()Z
      // 21: ifeq f7
      // 24: goto 2b
      // 27: invokestatic amb.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getstatic amb.r2l Lc05;
      // 2e: getfield Minecraft.vg8 Ll86;
      // 31: getfield EntityPlayerSP.fv9 L_jc;
      // 34: iload 1
      // 35: invokevirtual _jc.ajr (I)Lvrx;
      // 38: goto 3f
      // 3b: invokestatic amb.a (Loov;)Loov;
      // 3e: athrow
      // 3f: invokevirtual vrx.x4s ()Lerg;
      // 42: astore 2
      // 43: iload 0
      // 44: ifne fa
      // 47: aload 2
      // 48: invokestatic amb.w5o (Lerg;)Z
      // 4b: ifeq f7
      // 4e: goto 55
      // 51: invokestatic amb.a (Loov;)Loov;
      // 54: athrow
      // 55: getstatic amb.b4p I
      // 58: iload 0
      // 59: ifne 79
      // 5c: goto 63
      // 5f: invokestatic amb.a (Loov;)Loov;
      // 62: athrow
      // 63: iload 1
      // 64: if_icmpeq f7
      // 67: goto 6e
      // 6a: invokestatic amb.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 2
      // 6f: invokestatic amb.ejj (Lerg;)Z
      // 72: goto 79
      // 75: invokestatic amb.a (Loov;)Loov;
      // 78: athrow
      // 79: iload 0
      // 7a: ifne a0
      // 7d: ifne f7
      // 80: goto 87
      // 83: invokestatic amb.a (Loov;)Loov;
      // 86: athrow
      // 87: getstatic amb.r2l Lc05;
      // 8a: getfield Minecraft.vg8 Ll86;
      // 8d: getfield EntityPlayerSP.fv9 L_jc;
      // 90: getstatic amb.b4p I
      // 93: invokevirtual _jc.ajr (I)Lvrx;
      // 96: invokevirtual vrx.hf8 ()Z
      // 99: goto a0
      // 9c: invokestatic amb.a (Loov;)Loov;
      // 9f: athrow
      // a0: iload 0
      // a1: ifne df
      // a4: ifne c3
      // a7: goto ae
      // aa: invokestatic amb.a (Loov;)Loov;
      // ad: athrow
      // ae: iload 1
      // af: getstatic amb.b4p I
      // b2: bipush 36
      // b4: isub
      // b5: invokestatic amb.l_g (II)V
      // b8: iload 0
      // b9: ifeq f7
      // bc: goto c3
      // bf: invokestatic amb.a (Loov;)Loov;
      // c2: athrow
      // c3: getstatic amb.r2l Lc05;
      // c6: getfield Minecraft.vg8 Ll86;
      // c9: getfield EntityPlayerSP.fv9 L_jc;
      // cc: getstatic amb.b4p I
      // cf: invokevirtual _jc.ajr (I)Lvrx;
      // d2: invokevirtual vrx.x4s ()Lerg;
      // d5: invokestatic amb.w5o (Lerg;)Z
      // d8: goto df
      // db: invokestatic amb.a (Loov;)Loov;
      // de: athrow
      // df: iload 0
      // e0: ifne ee
      // e3: ifne f7
      // e6: goto ed
      // e9: invokestatic amb.a (Loov;)Loov;
      // ec: athrow
      // ed: iload 1
      // ee: getstatic amb.b4p I
      // f1: bipush 36
      // f3: isub
      // f4: invokestatic amb.l_g (II)V
      // f7: iinc 1 1
      // fa: iload 0
      // fb: ifeq 07
      // fe: return
   }

   public static boolean eke(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual erg.gn1 ()Lu7m;
      // 08: astore 2
      // 09: aload 2
      // 0a: instanceof f5h
      // 0d: iload 1
      // 0e: ifeq 1c
      // 11: ifne 1d
      // 14: goto 1b
      // 17: invokestatic amb.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: aload 0
      // 1e: invokestatic amb.fs1 (Lerg;)F
      // 21: fstore 3
      // 22: bipush 9
      // 24: istore 4
      // 26: iload 4
      // 28: bipush 45
      // 2a: if_icmpge ac
      // 2d: getstatic amb.r2l Lc05;
      // 30: getfield Minecraft.vg8 Ll86;
      // 33: getfield EntityPlayerSP.fv9 L_jc;
      // 36: iload 4
      // 38: invokevirtual _jc.ajr (I)Lvrx;
      // 3b: iload 1
      // 3c: ifeq 6c
      // 3f: invokevirtual vrx.hf8 ()Z
      // 42: iload 1
      // 43: ifeq ad
      // 46: goto 4d
      // 49: invokestatic amb.a (Loov;)Loov;
      // 4c: athrow
      // 4d: ifeq a5
      // 50: goto 57
      // 53: invokestatic amb.a (Loov;)Loov;
      // 56: athrow
      // 57: getstatic amb.r2l Lc05;
      // 5a: getfield Minecraft.vg8 Ll86;
      // 5d: getfield EntityPlayerSP.fv9 L_jc;
      // 60: iload 4
      // 62: invokevirtual _jc.ajr (I)Lvrx;
      // 65: goto 6c
      // 68: invokestatic amb.a (Loov;)Loov;
      // 6b: athrow
      // 6c: invokevirtual vrx.x4s ()Lerg;
      // 6f: astore 5
      // 71: iload 1
      // 72: ifeq a8
      // 75: aload 5
      // 77: invokestatic amb.fs1 (Lerg;)F
      // 7a: fload 3
      // 7b: fcmpl
      // 7c: ifle a5
      // 7f: goto 86
      // 82: invokestatic amb.a (Loov;)Loov;
      // 85: athrow
      // 86: aload 5
      // 88: invokevirtual erg.gn1 ()Lu7m;
      // 8b: instanceof f5h
      // 8e: iload 1
      // 8f: ifeq a4
      // 92: goto 99
      // 95: invokestatic amb.a (Loov;)Loov;
      // 98: athrow
      // 99: ifeq a5
      // 9c: goto a3
      // 9f: invokestatic amb.a (Loov;)Loov;
      // a2: athrow
      // a3: bipush 0
      // a4: ireturn
      // a5: iinc 4 1
      // a8: iload 1
      // a9: ifne 26
      // ac: bipush 1
      // ad: ireturn
   }

   public static boolean itg(erg param0) {
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
      // 05: invokevirtual erg.gn1 ()Lu7m;
      // 08: astore 2
      // 09: aload 2
      // 0a: instanceof svo
      // 0d: iload 1
      // 0e: ifne 1c
      // 11: ifne 1d
      // 14: goto 1b
      // 17: invokestatic amb.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: aload 0
      // 1e: invokestatic amb.fs1 (Lerg;)F
      // 21: fstore 3
      // 22: bipush 9
      // 24: istore 4
      // 26: iload 4
      // 28: bipush 45
      // 2a: if_icmpge ac
      // 2d: getstatic amb.r2l Lc05;
      // 30: getfield Minecraft.vg8 Ll86;
      // 33: getfield EntityPlayerSP.fv9 L_jc;
      // 36: iload 4
      // 38: invokevirtual _jc.ajr (I)Lvrx;
      // 3b: iload 1
      // 3c: ifne 6c
      // 3f: invokevirtual vrx.hf8 ()Z
      // 42: iload 1
      // 43: ifne ad
      // 46: goto 4d
      // 49: invokestatic amb.a (Loov;)Loov;
      // 4c: athrow
      // 4d: ifeq a5
      // 50: goto 57
      // 53: invokestatic amb.a (Loov;)Loov;
      // 56: athrow
      // 57: getstatic amb.r2l Lc05;
      // 5a: getfield Minecraft.vg8 Ll86;
      // 5d: getfield EntityPlayerSP.fv9 L_jc;
      // 60: iload 4
      // 62: invokevirtual _jc.ajr (I)Lvrx;
      // 65: goto 6c
      // 68: invokestatic amb.a (Loov;)Loov;
      // 6b: athrow
      // 6c: invokevirtual vrx.x4s ()Lerg;
      // 6f: astore 5
      // 71: iload 1
      // 72: ifne a8
      // 75: aload 5
      // 77: invokestatic amb.fs1 (Lerg;)F
      // 7a: fload 3
      // 7b: fcmpl
      // 7c: ifle a5
      // 7f: goto 86
      // 82: invokestatic amb.a (Loov;)Loov;
      // 85: athrow
      // 86: aload 5
      // 88: invokevirtual erg.gn1 ()Lu7m;
      // 8b: instanceof svo
      // 8e: iload 1
      // 8f: ifne a4
      // 92: goto 99
      // 95: invokestatic amb.a (Loov;)Loov;
      // 98: athrow
      // 99: ifeq a5
      // 9c: goto a3
      // 9f: invokestatic amb.a (Loov;)Loov;
      // a2: athrow
      // a3: bipush 0
      // a4: ireturn
      // a5: iinc 4 1
      // a8: iload 1
      // a9: ifeq 26
      // ac: bipush 1
      // ad: ireturn
   }

   public static boolean w5o(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual erg.gn1 ()Lu7m;
      // 08: astore 2
      // 09: aload 2
      // 0a: instanceof dlj
      // 0d: iload 1
      // 0e: ifeq 1c
      // 11: ifne 1d
      // 14: goto 1b
      // 17: invokestatic amb.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: aload 0
      // 1e: invokestatic amb.fs1 (Lerg;)F
      // 21: fstore 3
      // 22: bipush 9
      // 24: istore 4
      // 26: iload 4
      // 28: bipush 45
      // 2a: if_icmpge c5
      // 2d: getstatic amb.r2l Lc05;
      // 30: getfield Minecraft.vg8 Ll86;
      // 33: getfield EntityPlayerSP.fv9 L_jc;
      // 36: iload 4
      // 38: invokevirtual _jc.ajr (I)Lvrx;
      // 3b: iload 1
      // 3c: ifeq 6c
      // 3f: invokevirtual vrx.hf8 ()Z
      // 42: iload 1
      // 43: ifeq c6
      // 46: goto 4d
      // 49: invokestatic amb.a (Loov;)Loov;
      // 4c: athrow
      // 4d: ifeq be
      // 50: goto 57
      // 53: invokestatic amb.a (Loov;)Loov;
      // 56: athrow
      // 57: getstatic amb.r2l Lc05;
      // 5a: getfield Minecraft.vg8 Ll86;
      // 5d: getfield EntityPlayerSP.fv9 L_jc;
      // 60: iload 4
      // 62: invokevirtual _jc.ajr (I)Lvrx;
      // 65: goto 6c
      // 68: invokestatic amb.a (Loov;)Loov;
      // 6b: athrow
      // 6c: invokevirtual vrx.x4s ()Lerg;
      // 6f: astore 5
      // 71: iload 1
      // 72: ifeq c1
      // 75: aload 5
      // 77: invokestatic amb.fs1 (Lerg;)F
      // 7a: fload 3
      // 7b: fcmpl
      // 7c: ifle be
      // 7f: goto 86
      // 82: invokestatic amb.a (Loov;)Loov;
      // 85: athrow
      // 86: aload 5
      // 88: invokevirtual erg.gn1 ()Lu7m;
      // 8b: instanceof dlj
      // 8e: iload 1
      // 8f: ifeq ae
      // 92: goto 99
      // 95: invokestatic amb.a (Loov;)Loov;
      // 98: athrow
      // 99: ifeq be
      // 9c: goto a3
      // 9f: invokestatic amb.a (Loov;)Loov;
      // a2: athrow
      // a3: aload 0
      // a4: invokestatic amb.ejj (Lerg;)Z
      // a7: goto ae
      // aa: invokestatic amb.a (Loov;)Loov;
      // ad: athrow
      // ae: iload 1
      // af: ifeq bd
      // b2: ifne be
      // b5: goto bc
      // b8: invokestatic amb.a (Loov;)Loov;
      // bb: athrow
      // bc: bipush 0
      // bd: ireturn
      // be: iinc 4 1
      // c1: iload 1
      // c2: ifne 26
      // c5: bipush 1
      // c6: ireturn
   }

   public static float fs1(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic amb.a J
      // 003: ldc2_w 68554223638948
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokevirtual erg.gn1 ()Lu7m;
      // 010: astore 4
      // 012: aload 4
      // 014: iload 3
      // 015: ifeq 02d
      // 018: instanceof arf
      // 01b: ifne 02b
      // 01e: goto 025
      // 021: invokestatic amb.a (Loov;)Loov;
      // 024: athrow
      // 025: fconst_0
      // 026: freturn
      // 027: invokestatic amb.a (Loov;)Loov;
      // 02a: athrow
      // 02b: aload 4
      // 02d: invokevirtual u7m.ayn ()Ljava/lang/String;
      // 030: astore 5
      // 032: aload 4
      // 034: checkcast arf
      // 037: astore 6
      // 039: fconst_1
      // 03a: fstore 7
      // 03c: aload 4
      // 03e: instanceof f5h
      // 041: iload 3
      // 042: ifeq 096
      // 045: ifeq 08a
      // 048: goto 04f
      // 04b: invokestatic amb.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 6
      // 051: aload 0
      // 052: getstatic ox_.pu8 Le0x;
      // 055: invokevirtual arf.v1f (Lerg;Le0x;)F
      // 058: fstore 7
      // 05a: iload 3
      // 05b: ifeq 166
      // 05e: aload 5
      // 060: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 063: sipush 30174
      // 066: ldc2_w 1178399250230496969
      // 069: lload 1
      // 06a: lxor
      // 06b: invokedynamic s (IJ)Ljava/lang/String; bsm=amb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: nop
      // 071: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 074: ifeq 13a
      // 077: goto 07e
      // 07a: invokestatic amb.a (Loov;)Loov;
      // 07d: athrow
      // 07e: fload 7
      // 080: ldc 5.0
      // 082: nop
      // 083: fsub
      // 084: fstore 7
      // 086: iload 3
      // 087: ifne 13a
      // 08a: aload 4
      // 08c: instanceof svo
      // 08f: goto 096
      // 092: invokestatic amb.a (Loov;)Loov;
      // 095: athrow
      // 096: iload 3
      // 097: ifeq 0eb
      // 09a: ifeq 0df
      // 09d: goto 0a4
      // 0a0: invokestatic amb.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 6
      // 0a6: aload 0
      // 0a7: getstatic ox_.kqk Le0x;
      // 0aa: invokevirtual arf.v1f (Lerg;Le0x;)F
      // 0ad: fstore 7
      // 0af: iload 3
      // 0b0: ifeq 166
      // 0b3: aload 5
      // 0b5: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 0b8: sipush 13539
      // 0bb: ldc2_w 8536644168309346293
      // 0be: lload 1
      // 0bf: lxor
      // 0c0: invokedynamic s (IJ)Ljava/lang/String; bsm=amb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: nop
      // 0c6: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0c9: ifeq 13a
      // 0cc: goto 0d3
      // 0cf: invokestatic amb.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: fload 7
      // 0d5: ldc 5.0
      // 0d7: nop
      // 0d8: fsub
      // 0d9: fstore 7
      // 0db: iload 3
      // 0dc: ifne 13a
      // 0df: aload 4
      // 0e1: instanceof dlj
      // 0e4: goto 0eb
      // 0e7: invokestatic amb.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: iload 3
      // 0ec: ifeq 125
      // 0ef: ifeq 134
      // 0f2: goto 0f9
      // 0f5: invokestatic amb.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 6
      // 0fb: aload 0
      // 0fc: getstatic ox_.uom Le0x;
      // 0ff: invokevirtual arf.v1f (Lerg;Le0x;)F
      // 102: fstore 7
      // 104: iload 3
      // 105: ifeq 166
      // 108: aload 5
      // 10a: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 10d: sipush 13539
      // 110: ldc2_w 8536644168309346293
      // 113: lload 1
      // 114: lxor
      // 115: invokedynamic s (IJ)Ljava/lang/String; bsm=amb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: nop
      // 11b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 11e: goto 125
      // 121: invokestatic amb.a (Loov;)Loov;
      // 124: athrow
      // 125: ifeq 13a
      // 128: fload 7
      // 12a: ldc 5.0
      // 12c: nop
      // 12d: fsub
      // 12e: fstore 7
      // 130: iload 3
      // 131: ifne 13a
      // 134: fconst_1
      // 135: freturn
      // 136: invokestatic amb.a (Loov;)Loov;
      // 139: athrow
      // 13a: fload 7
      // 13c: f2d
      // 13d: getstatic vef.y_g Lvef;
      // 140: getfield vef.bbf I
      // 143: aload 0
      // 144: invokestatic hc0.qa_ (ILerg;)I
      // 147: i2d
      // 148: ldc2_w 0.0075
      // 14b: dmul
      // 14c: dadd
      // 14d: d2f
      // 14e: fstore 7
      // 150: fload 7
      // 152: f2d
      // 153: getstatic vef._jm Lvef;
      // 156: getfield vef.bbf I
      // 159: aload 0
      // 15a: invokestatic hc0.qa_ (ILerg;)I
      // 15d: i2d
      // 15e: ldc2_w 100.0
      // 161: ddiv
      // 162: dadd
      // 163: d2f
      // 164: fstore 7
      // 166: fload 7
      // 168: freturn
   }

   public static boolean ejj(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic amb.dga (Lerg;)F
      // 04: fstore 2
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: bipush 9
      // 0a: istore 3
      // 0b: istore 1
      // 0c: iload 3
      // 0d: bipush 45
      // 0f: if_icmpge 8f
      // 12: getstatic amb.r2l Lc05;
      // 15: getfield Minecraft.vg8 Ll86;
      // 18: getfield EntityPlayerSP.fv9 L_jc;
      // 1b: iload 3
      // 1c: invokevirtual _jc.ajr (I)Lvrx;
      // 1f: iload 1
      // 20: ifeq 4f
      // 23: invokevirtual vrx.hf8 ()Z
      // 26: iload 1
      // 27: ifeq 96
      // 2a: goto 31
      // 2d: invokestatic amb.a (Loov;)Loov;
      // 30: athrow
      // 31: ifeq 88
      // 34: goto 3b
      // 37: invokestatic amb.a (Loov;)Loov;
      // 3a: athrow
      // 3b: getstatic amb.r2l Lc05;
      // 3e: getfield Minecraft.vg8 Ll86;
      // 41: getfield EntityPlayerSP.fv9 L_jc;
      // 44: iload 3
      // 45: invokevirtual _jc.ajr (I)Lvrx;
      // 48: goto 4f
      // 4b: invokestatic amb.a (Loov;)Loov;
      // 4e: athrow
      // 4f: invokevirtual vrx.x4s ()Lerg;
      // 52: astore 4
      // 54: iload 1
      // 55: ifeq 8b
      // 58: aload 4
      // 5a: invokestatic amb.dga (Lerg;)F
      // 5d: fload 2
      // 5e: fcmpl
      // 5f: ifle 88
      // 62: goto 69
      // 65: invokestatic amb.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 4
      // 6b: invokevirtual erg.gn1 ()Lu7m;
      // 6e: instanceof za6
      // 71: iload 1
      // 72: ifeq 87
      // 75: goto 7c
      // 78: invokestatic amb.a (Loov;)Loov;
      // 7b: athrow
      // 7c: ifeq 88
      // 7f: goto 86
      // 82: invokestatic amb.a (Loov;)Loov;
      // 85: athrow
      // 86: bipush 0
      // 87: ireturn
      // 88: iinc 3 1
      // 8b: iload 1
      // 8c: ifne 0c
      // 8f: aload 0
      // 90: invokevirtual erg.gn1 ()Lu7m;
      // 93: instanceof za6
      // 96: iload 1
      // 97: ifeq ab
      // 9a: ifeq aa
      // 9d: goto a4
      // a0: invokestatic amb.a (Loov;)Loov;
      // a3: athrow
      // a4: bipush 1
      // a5: ireturn
      // a6: invokestatic amb.a (Loov;)Loov;
      // a9: athrow
      // aa: bipush 0
      // ab: ireturn
   }

   public static float dga(erg var0) {
      float var2 = 0.0F;
      int var10000 = OpaquePredicate.b();
      u7m var3 = var0.gn1();
      int var1 = var10000;

      label41: {
         label35: {
            label34: {
               try {
                  var8 = var3 instanceof arf;
                  if (var1 == 0) {
                     break label35;
                  }

                  if (!var8) {
                     break label34;
                  }
               } catch (oov var6) {
                  throw a(var6);
               }

               arf var4 = (arf)var3;
               var2 += var4.mqh;
            }

            try {
               var9 = var3;
               if (var1 == 0) {
                  break label41;
               }

               var8 = var3 instanceof za6;
            } catch (oov var5) {
               throw a(var5);
            }
         }

         if (!var8) {
            return var2 + (float)hc0.qa_(vef.m3n.bbf, var0) * 1.25F + (float)hc0.qa_(vef.zbl.bbf, var0) * 0.01F;
         }

         var9 = var3;
      }

      za6 var7 = (za6)var9;
      var2 += var7.ngv();
      return var2 + (float)hc0.qa_(vef.m3n.bbf, var0) * 1.25F + (float)hc0.qa_(vef.zbl.bbf, var0) * 0.01F;
   }

   public static boolean gjz(u7m var0) {
      int var1 = OpaquePredicate.b();

      u7m var10000;
      label33: {
         try {
            var10000 = var0;
            if (var1 == 0) {
               break label33;
            }

            if (var0 == null) {
               return (boolean)1;
            }
         } catch (oov var3) {
            throw a(var3);
         }

         var10000 = var0;
      }

      try {
         int var4 = u7m._lo(var10000);
         if (var1 == 0) {
            return (boolean)var4;
         }

         if (var4 == 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2974106876850731935L, 465182622708471376L, MethodHandles.lookup().lookupClass()).a(142093711437932L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 85651530363795L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "´Ôÿ¥\u0083\"\u0083jÛRô\u0099\u000637ì\u0010²\u0010\u000fõ\u000bÿ\u0099s\\P×n\u0012@_¼";
      int var8 = "´Ôÿ¥\u0083\"\u0083jÛRô\u0099\u000637ì\u0010²\u0010\u000fõ\u000bÿ\u0099s\\P×n\u0012@_¼".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            r2l = Minecraft.vz1();
            fqe = 37;
            b4p = 38;
            r5g = 39;
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10082;
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
            throw new RuntimeException("amb", var10);
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
         throw new RuntimeException("amb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
