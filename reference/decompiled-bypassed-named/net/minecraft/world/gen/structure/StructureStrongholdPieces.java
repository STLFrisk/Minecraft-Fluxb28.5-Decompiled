package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class StructureStrongholdPieces {
   private static final StructureStrongholdPieces$rlz[] vlv;
   private static List leo;
   private static Class r99;
   public static int gir;
   private static final StructureStrongholdPieces$cw5 f3_;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void awe() {
      long var0 = a ^ 1942800654247L;
      v8a.kem(StructureStrongholdPieces$ChestCorridor.class, a<"q">(22301, 5256300603723944109L ^ var0));
      v8a.kem(StructureStrongholdPieces$Corridor.class, a<"q">(19393, 2280752298151644283L ^ var0));
      v8a.kem(StructureStrongholdPieces$Crossing.class, a<"q">(4909, 3815426990936446107L ^ var0));
      v8a.kem(StructureStrongholdPieces$LeftTurn.class, a<"q">(27608, 8805607665528482922L ^ var0));
      v8a.kem(StructureStrongholdPieces$Library.class, a<"q">(22632, 8284451330271322075L ^ var0));
      v8a.kem(StructureStrongholdPieces$PortalRoom.class, a<"q">(10417, 6088655360148696845L ^ var0));
      v8a.kem(StructureStrongholdPieces$Prison.class, a<"q">(16478, 748476889978669024L ^ var0));
      v8a.kem(StructureStrongholdPieces$RightTurn.class, a<"q">(29692, 7816945580087325765L ^ var0));
      v8a.kem(StructureStrongholdPieces$RoomCrossing.class, a<"q">(21919, 7444952056130146862L ^ var0));
      v8a.kem(StructureStrongholdPieces$Stairs.class, a<"q">(7509, 3651045598436350702L ^ var0));
      v8a.kem(StructureStrongholdPieces$Stairs2.class, a<"q">(27040, 5278484389086866975L ^ var0));
      v8a.kem(StructureStrongholdPieces$Straight.class, a<"q">(1942, 5414807872423084075L ^ var0));
      v8a.kem(StructureStrongholdPieces$StairsStraight.class, a<"q">(18516, 5381112780285415404L ^ var0));
   }

   public static void lp1() {
      leo = Lists.newArrayList();
      StructureStrongholdPieces$rlz[] var1 = vlv;
      EntityLivingBase[] var10000 = StructureStrongholdPieces$Stronghold.b();
      int var2 = var1.length;
      EntityLivingBase[] var0 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < var2) {
            StructureStrongholdPieces$rlz var4 = var1[var3];

            try {
               var4.jtm = 0;
               leo.add(var4);
               var3++;
               if (var0 == null) {
                  break;
               }

               if (var0 != null) {
                  continue;
               }
            } catch (oov var5) {
               throw a(var5);
            }
         }

         r99 = null;
         break;
      }
   }

   private static boolean seq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 1
      // 02: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 05: bipush 0
      // 06: putstatic net/minecraft/world/gen/structure/StructureStrongholdPieces.gir I
      // 09: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces.leo Ljava/util/List;
      // 0c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11: astore 2
      // 12: astore 0
      // 13: aload 2
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq 71
      // 1c: aload 2
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz
      // 25: astore 3
      // 26: aload 3
      // 27: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz.yf5 I
      // 2a: aload 0
      // 2b: ifnull 72
      // 2e: aload 0
      // 2f: ifnull 6a
      // 32: goto 39
      // 35: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 38: athrow
      // 39: ifle 62
      // 3c: goto 43
      // 3f: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 3
      // 44: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz.jtm I
      // 47: aload 3
      // 48: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz.yf5 I
      // 4b: aload 0
      // 4c: ifnull 69
      // 4f: goto 56
      // 52: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 55: athrow
      // 56: if_icmpge 62
      // 59: goto 60
      // 5c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 5f: athrow
      // 60: bipush 1
      // 61: istore 1
      // 62: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces.gir I
      // 65: aload 3
      // 66: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz.zk2 I
      // 69: iadd
      // 6a: putstatic net/minecraft/world/gen/structure/StructureStrongholdPieces.gir I
      // 6d: aload 0
      // 6e: ifnonnull 13
      // 71: iload 1
      // 72: ireturn
   }

   private static StructureStrongholdPieces$Stronghold fsd(Class var0, List var1, Random var2, int var3, int var4, int var5, vt2 var6, int var7) {
      EntityLivingBase[] var8 = StructureStrongholdPieces$Stronghold.b();
      StructureStrongholdPieces$PortalRoom var9 = null;

      Class var10000;
      Class<StructureStrongholdPieces$Straight> var10001;
      label177: {
         try {
            var10000 = var0;
            var10001 = StructureStrongholdPieces$Straight.class;
            if (var8 == null) {
               break label177;
            }

            if (var0 == StructureStrongholdPieces$Straight.class) {
               return StructureStrongholdPieces$Straight.mc_(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var19) {
            throw a(var19);
         }

         var10000 = var0;
         var10001 = StructureStrongholdPieces$Prison.class;
      }

      label167: {
         try {
            if (var8 == null) {
               break label167;
            }

            if (var10000 == var10001) {
               return StructureStrongholdPieces$Prison.g_b(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var18) {
            throw a(var18);
         }

         var10000 = var0;
         var10001 = StructureStrongholdPieces$LeftTurn.class;
      }

      label157: {
         try {
            if (var8 == null) {
               break label157;
            }

            if (var10000 == var10001) {
               return StructureStrongholdPieces$LeftTurn.ei8(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var17) {
            throw a(var17);
         }

         var10000 = var0;
         var10001 = StructureStrongholdPieces$RightTurn.class;
      }

      label147: {
         try {
            if (var8 == null) {
               break label147;
            }

            if (var10000 == var10001) {
               return StructureStrongholdPieces$RightTurn.ei8(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var16) {
            throw a(var16);
         }

         var10000 = var0;
         var10001 = StructureStrongholdPieces$RoomCrossing.class;
      }

      label137: {
         try {
            if (var8 == null) {
               break label137;
            }

            if (var10000 == var10001) {
               return StructureStrongholdPieces$RoomCrossing.z_4(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var15) {
            throw a(var15);
         }

         var10000 = var0;
         var10001 = StructureStrongholdPieces$StairsStraight.class;
      }

      label127: {
         try {
            if (var8 == null) {
               break label127;
            }

            if (var10000 == var10001) {
               return StructureStrongholdPieces$StairsStraight.z5x(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var14) {
            throw a(var14);
         }

         var10000 = var0;
         var10001 = StructureStrongholdPieces$Stairs.class;
      }

      label117: {
         try {
            if (var8 == null) {
               break label117;
            }

            if (var10000 == var10001) {
               return StructureStrongholdPieces$Stairs.kdn(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var13) {
            throw a(var13);
         }

         var10000 = var0;
         var10001 = StructureStrongholdPieces$Crossing.class;
      }

      label107: {
         try {
            if (var8 == null) {
               break label107;
            }

            if (var10000 == var10001) {
               return StructureStrongholdPieces$Crossing.lzc(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var12) {
            throw a(var12);
         }

         var10000 = var0;
         var10001 = StructureStrongholdPieces$ChestCorridor.class;
      }

      label97: {
         try {
            if (var8 == null) {
               break label97;
            }

            if (var10000 == var10001) {
               return StructureStrongholdPieces$ChestCorridor.k7k(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var11) {
            throw a(var11);
         }

         var10000 = var0;
         var10001 = StructureStrongholdPieces$Library.class;
      }

      label87: {
         try {
            if (var8 == null) {
               break label87;
            }

            if (var10000 == var10001) {
               return StructureStrongholdPieces$Library.h_r(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var10) {
            throw a(var10);
         }

         var10000 = var0;
         var10001 = StructureStrongholdPieces$PortalRoom.class;
      }

      if (var10000 == var10001) {
         var9 = StructureStrongholdPieces$PortalRoom.b_y(var1, var2, var3, var4, var5, var6, var7);
      }

      return var9;
   }

   private static StructureStrongholdPieces$Stronghold c2n(
      StructureStrongholdPieces$Stairs2 param0, List param1, Random param2, int param3, int param4, int param5, vt2 param6, int param7
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 8
      // 005: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.seq ()Z
      // 008: ifne 011
      // 00b: aconst_null
      // 00c: areturn
      // 00d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 010: athrow
      // 011: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces.r99 Ljava/lang/Class;
      // 014: aload 8
      // 016: ifnull 026
      // 019: ifnull 04e
      // 01c: goto 023
      // 01f: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 022: athrow
      // 023: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces.r99 Ljava/lang/Class;
      // 026: aload 1
      // 027: aload 2
      // 028: iload 3
      // 029: iload 4
      // 02b: iload 5
      // 02d: aload 6
      // 02f: iload 7
      // 031: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fsd (Ljava/lang/Class;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold;
      // 034: astore 9
      // 036: aconst_null
      // 037: putstatic net/minecraft/world/gen/structure/StructureStrongholdPieces.r99 Ljava/lang/Class;
      // 03a: aload 9
      // 03c: aload 8
      // 03e: ifnull 04d
      // 041: ifnull 04e
      // 044: goto 04b
      // 047: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 9
      // 04d: areturn
      // 04e: bipush 0
      // 04f: istore 9
      // 051: iload 9
      // 053: bipush 5
      // 054: if_icmpge 152
      // 057: iinc 9 1
      // 05a: aload 2
      // 05b: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces.gir I
      // 05e: invokevirtual java/util/Random.nextInt (I)I
      // 061: istore 10
      // 063: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces.leo Ljava/util/List;
      // 066: aload 8
      // 068: ifnull 153
      // 06b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 070: astore 11
      // 072: aload 11
      // 074: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 079: ifeq 14d
      // 07c: aload 11
      // 07e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 083: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz
      // 086: astore 12
      // 088: iload 10
      // 08a: aload 12
      // 08c: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz.zk2 I
      // 08f: isub
      // 090: istore 10
      // 092: iload 10
      // 094: aload 8
      // 096: ifnull 053
      // 099: aload 8
      // 09b: ifnull 0c2
      // 09e: ifge 148
      // 0a1: goto 0a8
      // 0a4: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 12
      // 0aa: aload 8
      // 0ac: ifnull 0c7
      // 0af: goto 0b6
      // 0b2: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: iload 7
      // 0b8: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz.mix (I)Z
      // 0bb: goto 0c2
      // 0be: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: ifeq 14d
      // 0c5: aload 12
      // 0c7: aload 8
      // 0c9: ifnull 0e3
      // 0cc: aload 0
      // 0cd: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2.i5u Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$rlz;
      // 0d0: if_acmpne 0e1
      // 0d3: goto 0da
      // 0d6: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: goto 14d
      // 0dd: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 12
      // 0e3: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz.p7u Ljava/lang/Class;
      // 0e6: aload 1
      // 0e7: aload 2
      // 0e8: iload 3
      // 0e9: iload 4
      // 0eb: iload 5
      // 0ed: aload 6
      // 0ef: iload 7
      // 0f1: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fsd (Ljava/lang/Class;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold;
      // 0f4: astore 13
      // 0f6: aload 8
      // 0f8: ifnull 12b
      // 0fb: aload 13
      // 0fd: ifnull 148
      // 100: goto 107
      // 103: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 106: athrow
      // 107: aload 12
      // 109: dup
      // 10a: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz.jtm I
      // 10d: bipush 1
      // 10e: iadd
      // 10f: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz.jtm I
      // 112: aload 0
      // 113: aload 8
      // 115: ifnull 147
      // 118: goto 11f
      // 11b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 11e: athrow
      // 11f: aload 12
      // 121: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2.i5u Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$rlz;
      // 124: goto 12b
      // 127: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 12a: athrow
      // 12b: aload 12
      // 12d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz.jdg ()Z
      // 130: ifne 145
      // 133: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces.leo Ljava/util/List;
      // 136: aload 12
      // 138: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 13d: pop
      // 13e: goto 145
      // 141: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 144: athrow
      // 145: aload 13
      // 147: areturn
      // 148: aload 8
      // 14a: ifnonnull 072
      // 14d: aload 8
      // 14f: ifnonnull 051
      // 152: aload 1
      // 153: aload 2
      // 154: iload 3
      // 155: iload 4
      // 157: iload 5
      // 159: aload 6
      // 15b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.s5g (Ljava/util/List;Ljava/util/Random;IIILvt2;)Lyve;
      // 15e: astore 10
      // 160: aload 10
      // 162: aload 8
      // 164: ifnull 173
      // 167: ifnull 18d
      // 16a: goto 171
      // 16d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 170: athrow
      // 171: aload 10
      // 173: getfield yve._3o I
      // 176: bipush 1
      // 177: if_icmple 18d
      // 17a: new net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor
      // 17d: dup
      // 17e: iload 7
      // 180: aload 2
      // 181: aload 10
      // 183: aload 6
      // 185: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 188: areturn
      // 189: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aconst_null
      // 18e: areturn
   }

   private static xi1 m_5(StructureStrongholdPieces$Stairs2 param0, List param1, Random param2, int param3, int param4, int param5, vt2 param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 8
      // 05: iload 7
      // 07: bipush 50
      // 09: aload 8
      // 0b: ifnull 2c
      // 0e: if_icmple 1e
      // 11: goto 18
      // 14: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 17: athrow
      // 18: aconst_null
      // 19: areturn
      // 1a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 1d: athrow
      // 1e: iload 3
      // 1f: aload 0
      // 20: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2.q1q ()Lyve;
      // 23: getfield yve.gdj I
      // 26: isub
      // 27: invokestatic java/lang/Math.abs (I)I
      // 2a: bipush 112
      // 2c: aload 8
      // 2e: ifnull 51
      // 31: if_icmpgt 97
      // 34: goto 3b
      // 37: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 3a: athrow
      // 3b: iload 5
      // 3d: aload 0
      // 3e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2.q1q ()Lyve;
      // 41: getfield yve.ob0 I
      // 44: isub
      // 45: invokestatic java/lang/Math.abs (I)I
      // 48: bipush 112
      // 4a: goto 51
      // 4d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 50: athrow
      // 51: if_icmpgt 97
      // 54: aload 0
      // 55: aload 1
      // 56: aload 2
      // 57: iload 3
      // 58: iload 4
      // 5a: iload 5
      // 5c: aload 6
      // 5e: iload 7
      // 60: bipush 1
      // 61: iadd
      // 62: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.c2n (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold;
      // 65: astore 9
      // 67: aload 9
      // 69: aload 8
      // 6b: ifnull 96
      // 6e: ifnull 94
      // 71: goto 78
      // 74: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 1
      // 79: aload 9
      // 7b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 80: pop
      // 81: aload 0
      // 82: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2.z8j Ljava/util/List;
      // 85: aload 9
      // 87: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8c: pop
      // 8d: goto 94
      // 90: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.a (Loov;)Loov;
      // 93: athrow
      // 94: aload 9
      // 96: areturn
      // 97: aconst_null
      // 98: areturn
   }

   public static StructureStrongholdPieces$cw5 y2t() {
      return f3_;
   }

   public static Class oo9(Class var0) {
      r99 = var0;
      return var0;
   }

   public static xi1 fdf(StructureStrongholdPieces$Stairs2 var0, List var1, Random var2, int var3, int var4, int var5, vt2 var6, int var7) {
      return m_5(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5601098921437634295L, 708324159897318514L, MethodHandles.lookup().lookupClass()).a(125997218500057L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 78846075038640L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[13];
      int var7 = 0;
      String var6 = "ÔM\u009f\u0080á+Õ\u008a\u001cå\u001b}$\u009bP&\u0010ðyÃµ¼c\u0016b\u0019Ú\u008bl\u0015xs6\u0010yÀ¾\u008e\u001f½\u001f\u0015\u0013\u0001Ã\u008a\u0015\u0090ÂÌ\u0010+\u0094ãÓæ#\u008b@a\u0086o4äþîo\u0010'å2bo².³Û¿dÚ\u0083½Ö\u0001\u0010\u0013w`|\u0089_K+\u0014\u0080Õ8Âøf&\u0010\u0085Y(*q\u008cï\u001e;H3[¢¥³¦\u0010þääó\u009bv#Ôñ\u001fÅ4éb\u0004l\u0010!\u0004Òï^Ì\u0096ÿ\u009atÓý\b~3ë\u0010T]/\u0014×)s·0H\u0013\u0017\u000f¢-Ì\u0010Ñ³µGvÔêD\u0001\u009c\u0093øÅy`~";
      int var8 = "ÔM\u009f\u0080á+Õ\u008a\u001cå\u001b}$\u009bP&\u0010ðyÃµ¼c\u0016b\u0019Ú\u008bl\u0015xs6\u0010yÀ¾\u008e\u001f½\u001f\u0015\u0013\u0001Ã\u008a\u0015\u0090ÂÌ\u0010+\u0094ãÓæ#\u008b@a\u0086o4äþîo\u0010'å2bo².³Û¿dÚ\u0083½Ö\u0001\u0010\u0013w`|\u0089_K+\u0014\u0080Õ8Âøf&\u0010\u0085Y(*q\u008cï\u001e;H3[¢¥³¦\u0010þääó\u009bv#Ôñ\u001fÅ4éb\u0004l\u0010!\u0004Òï^Ì\u0096ÿ\u009atÓý\b~3ë\u0010T]/\u0014×)s·0H\u0013\u0017\u000f¢-Ì\u0010Ñ³µGvÔêD\u0001\u009c\u0093øÅy`~"
         .length();
      char var5 = 16;
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
                     c = new String[13];
                     vlv = new StructureStrongholdPieces$rlz[]{
                        new StructureStrongholdPieces$rlz(StructureStrongholdPieces$Straight.class, 40, 0),
                        new StructureStrongholdPieces$rlz(StructureStrongholdPieces$Prison.class, 5, 5),
                        new StructureStrongholdPieces$rlz(StructureStrongholdPieces$LeftTurn.class, 20, 0),
                        new StructureStrongholdPieces$rlz(StructureStrongholdPieces$RightTurn.class, 20, 0),
                        new StructureStrongholdPieces$rlz(StructureStrongholdPieces$RoomCrossing.class, 10, 6),
                        new StructureStrongholdPieces$rlz(StructureStrongholdPieces$StairsStraight.class, 5, 5),
                        new StructureStrongholdPieces$rlz(StructureStrongholdPieces$Stairs.class, 5, 5),
                        new StructureStrongholdPieces$rlz(StructureStrongholdPieces$Crossing.class, 5, 4),
                        new StructureStrongholdPieces$rlz(StructureStrongholdPieces$ChestCorridor.class, 5, 4),
                        new StructureStrongholdPieces$1(StructureStrongholdPieces$Library.class, 10, 2),
                        new StructureStrongholdPieces$2(StructureStrongholdPieces$PortalRoom.class, 20, 1)
                     };
                     f3_ = new StructureStrongholdPieces$cw5(null);
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

                  var6 = "¢§@HÔ \u0089\u009dK8Û\u0013µ\u0098\u008aº\u0010°¢Ñ` gY\u0090ª·Q\u0090ç\u0018&ä";
                  var8 = "¢§@HÔ \u0089\u009dK8Û\u0013µ\u0098\u008aº\u0010°¢Ñ` gY\u0090ª·Q\u0090ç\u0018&ä".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26949;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
