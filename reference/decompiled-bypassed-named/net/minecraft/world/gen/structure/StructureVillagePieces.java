package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class StructureVillagePieces {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void amy() {
      long var0 = a ^ 135887756620221L;
      v8a.kem(StructureVillagePieces$House1.class, a<"j">(24339, 832971405084913251L ^ var0));
      v8a.kem(StructureVillagePieces$Field1.class, a<"j">(859, 830243789156561441L ^ var0));
      v8a.kem(StructureVillagePieces$Field2.class, a<"j">(3165, 1145723950795537705L ^ var0));
      v8a.kem(StructureVillagePieces$Torch.class, a<"j">(7920, 9110635846713651077L ^ var0));
      v8a.kem(StructureVillagePieces$Hall.class, a<"j">(8189, 6159741043335245443L ^ var0));
      v8a.kem(StructureVillagePieces$House4Garden.class, a<"j">(19194, 3148816309757016962L ^ var0));
      v8a.kem(StructureVillagePieces$WoodHut.class, a<"j">(27595, 6153476028147489460L ^ var0));
      v8a.kem(StructureVillagePieces$Church.class, a<"j">(19787, 7080308389259770941L ^ var0));
      v8a.kem(StructureVillagePieces$House2.class, a<"j">(2291, 7414757800679586186L ^ var0));
      v8a.kem(StructureVillagePieces$Start.class, a<"j">(24453, 4641505107690319608L ^ var0));
      v8a.kem(StructureVillagePieces$Path.class, a<"j">(22563, 5488956049333741912L ^ var0));
      v8a.kem(StructureVillagePieces$House3.class, a<"j">(26320, 5234909946974033831L ^ var0));
      v8a.kem(StructureVillagePieces$Well.class, a<"j">(1790, 4906614368249427842L ^ var0));
   }

   public static List s5k(Random var0, int var1) {
      ArrayList var3 = Lists.newArrayList();
      var3.add(new StructureVillagePieces$y3u(StructureVillagePieces$House4Garden.class, 4, fe6.pzp(var0, 2 + var1, 4 + var1 * 2)));
      EntityLivingBase[] var10000 = StructureStrongholdPieces$Stronghold.b();
      var3.add(new StructureVillagePieces$y3u(StructureVillagePieces$Church.class, 20, fe6.pzp(var0, 0 + var1, 1 + var1)));
      EntityLivingBase[] var2 = var10000;
      var3.add(new StructureVillagePieces$y3u(StructureVillagePieces$House1.class, 20, fe6.pzp(var0, 0 + var1, 2 + var1)));
      var3.add(new StructureVillagePieces$y3u(StructureVillagePieces$WoodHut.class, 3, fe6.pzp(var0, 2 + var1, 5 + var1 * 3)));
      var3.add(new StructureVillagePieces$y3u(StructureVillagePieces$Hall.class, 15, fe6.pzp(var0, 0 + var1, 2 + var1)));
      var3.add(new StructureVillagePieces$y3u(StructureVillagePieces$Field1.class, 3, fe6.pzp(var0, 1 + var1, 4 + var1)));
      var3.add(new StructureVillagePieces$y3u(StructureVillagePieces$Field2.class, 3, fe6.pzp(var0, 2 + var1, 4 + var1 * 2)));
      var3.add(new StructureVillagePieces$y3u(StructureVillagePieces$House2.class, 15, fe6.pzp(var0, 0, 1 + var1)));
      var3.add(new StructureVillagePieces$y3u(StructureVillagePieces$House3.class, 8, fe6.pzp(var0, 0 + var1, 3 + var1 * 2)));
      Iterator var4 = var3.iterator();

      while (var4.hasNext()) {
         label23: {
            try {
               var6 = var4;
               if (var2 == null) {
                  break label23;
               }

               if (((StructureVillagePieces$y3u)var4.next()).c_v != 0) {
                  continue;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var6 = var4;
         }

         var6.remove();
         if (var2 == null) {
            break;
         }
      }

      return var3;
   }

   private static int wap(List param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 2
      // 02: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 05: bipush 0
      // 06: istore 3
      // 07: astore 1
      // 08: aload 0
      // 09: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e: astore 4
      // 10: aload 4
      // 12: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 17: ifeq 71
      // 1a: aload 4
      // 1c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$y3u
      // 24: astore 5
      // 26: aload 5
      // 28: getfield net/minecraft/world/gen/structure/StructureVillagePieces$y3u.c_v I
      // 2b: aload 1
      // 2c: ifnull 72
      // 2f: aload 1
      // 30: ifnull 6c
      // 33: goto 3a
      // 36: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 39: athrow
      // 3a: ifle 65
      // 3d: goto 44
      // 40: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 5
      // 46: getfield net/minecraft/world/gen/structure/StructureVillagePieces$y3u.e5b I
      // 49: aload 5
      // 4b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$y3u.c_v I
      // 4e: aload 1
      // 4f: ifnull 6b
      // 52: goto 59
      // 55: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 58: athrow
      // 59: if_icmpge 65
      // 5c: goto 63
      // 5f: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 62: athrow
      // 63: bipush 1
      // 64: istore 2
      // 65: iload 3
      // 66: aload 5
      // 68: getfield net/minecraft/world/gen/structure/StructureVillagePieces$y3u.nw9 I
      // 6b: iadd
      // 6c: istore 3
      // 6d: aload 1
      // 6e: ifnonnull 10
      // 71: iload 2
      // 72: aload 1
      // 73: ifnull 81
      // 76: ifeq 84
      // 79: goto 80
      // 7c: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 7f: athrow
      // 80: iload 3
      // 81: goto 85
      // 84: bipush -1
      // 85: ireturn
   }

   private static StructureVillagePieces$Village rej(
      StructureVillagePieces$Start var0, StructureVillagePieces$y3u var1, List var2, Random var3, int var4, int var5, int var6, vt2 var7, int var8
   ) {
      Class var10 = var1.gmm;
      EntityLivingBase[] var10000 = StructureStrongholdPieces$Stronghold.b();
      StructureVillagePieces$House3 var11 = null;
      EntityLivingBase[] var9 = var10000;

      Class<StructureVillagePieces$House4Garden> var10001;
      label143: {
         try {
            var20 = var10;
            var10001 = StructureVillagePieces$House4Garden.class;
            if (var9 == null) {
               break label143;
            }

            if (var10 == StructureVillagePieces$House4Garden.class) {
               return StructureVillagePieces$House4Garden.ffk(var0, var2, var3, var4, var5, var6, var7, var8);
            }
         } catch (oov var19) {
            throw a(var19);
         }

         var20 = var10;
         var10001 = StructureVillagePieces$Church.class;
      }

      label133: {
         try {
            if (var9 == null) {
               break label133;
            }

            if (var20 == var10001) {
               return StructureVillagePieces$Church.xl4(var0, var2, var3, var4, var5, var6, var7, var8);
            }
         } catch (oov var18) {
            throw a(var18);
         }

         var20 = var10;
         var10001 = StructureVillagePieces$House1.class;
      }

      label123: {
         try {
            if (var9 == null) {
               break label123;
            }

            if (var20 == var10001) {
               return StructureVillagePieces$House1.u7s(var0, var2, var3, var4, var5, var6, var7, var8);
            }
         } catch (oov var17) {
            throw a(var17);
         }

         var20 = var10;
         var10001 = StructureVillagePieces$WoodHut.class;
      }

      label113: {
         try {
            if (var9 == null) {
               break label113;
            }

            if (var20 == var10001) {
               return StructureVillagePieces$WoodHut.z36(var0, var2, var3, var4, var5, var6, var7, var8);
            }
         } catch (oov var16) {
            throw a(var16);
         }

         var20 = var10;
         var10001 = StructureVillagePieces$Hall.class;
      }

      label103: {
         try {
            if (var9 == null) {
               break label103;
            }

            if (var20 == var10001) {
               return StructureVillagePieces$Hall.e_i(var0, var2, var3, var4, var5, var6, var7, var8);
            }
         } catch (oov var15) {
            throw a(var15);
         }

         var20 = var10;
         var10001 = StructureVillagePieces$Field1.class;
      }

      label93: {
         try {
            if (var9 == null) {
               break label93;
            }

            if (var20 == var10001) {
               return StructureVillagePieces$Field1.mwt(var0, var2, var3, var4, var5, var6, var7, var8);
            }
         } catch (oov var14) {
            throw a(var14);
         }

         var20 = var10;
         var10001 = StructureVillagePieces$Field2.class;
      }

      label83: {
         try {
            if (var9 == null) {
               break label83;
            }

            if (var20 == var10001) {
               return StructureVillagePieces$Field2.dq0(var0, var2, var3, var4, var5, var6, var7, var8);
            }
         } catch (oov var13) {
            throw a(var13);
         }

         var20 = var10;
         var10001 = StructureVillagePieces$House2.class;
      }

      label73: {
         try {
            if (var9 == null) {
               break label73;
            }

            if (var20 == var10001) {
               return StructureVillagePieces$House2.yj2(var0, var2, var3, var4, var5, var6, var7, var8);
            }
         } catch (oov var12) {
            throw a(var12);
         }

         var20 = var10;
         var10001 = StructureVillagePieces$House3.class;
      }

      if (var20 == var10001) {
         var11 = StructureVillagePieces$House3.ure(var0, var2, var3, var4, var5, var6, var7, var8);
      }

      return var11;
   }

   private static StructureVillagePieces$Village o6g(
      StructureVillagePieces$Start param0, List param1, Random param2, int param3, int param4, int param5, vt2 param6, int param7
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
      // 005: aload 0
      // 006: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.fl_ Ljava/util/List;
      // 009: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.wap (Ljava/util/List;)I
      // 00c: istore 9
      // 00e: iload 9
      // 010: aload 8
      // 012: ifnull 026
      // 015: ifgt 025
      // 018: goto 01f
      // 01b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aconst_null
      // 020: areturn
      // 021: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 024: athrow
      // 025: bipush 0
      // 026: istore 10
      // 028: iload 10
      // 02a: bipush 5
      // 02b: if_icmpge 13c
      // 02e: iinc 10 1
      // 031: aload 2
      // 032: iload 9
      // 034: invokevirtual java/util/Random.nextInt (I)I
      // 037: istore 11
      // 039: aload 0
      // 03a: aload 8
      // 03c: ifnull 13d
      // 03f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.fl_ Ljava/util/List;
      // 042: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 047: astore 12
      // 049: aload 12
      // 04b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 050: ifeq 137
      // 053: aload 12
      // 055: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05a: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$y3u
      // 05d: astore 13
      // 05f: iload 11
      // 061: aload 13
      // 063: getfield net/minecraft/world/gen/structure/StructureVillagePieces$y3u.nw9 I
      // 066: isub
      // 067: istore 11
      // 069: iload 11
      // 06b: aload 8
      // 06d: ifnull 02a
      // 070: aload 8
      // 072: ifnull 099
      // 075: ifge 132
      // 078: goto 07f
      // 07b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 13
      // 081: aload 8
      // 083: ifnull 09e
      // 086: goto 08d
      // 089: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 08c: athrow
      // 08d: iload 7
      // 08f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$y3u._ji (I)Z
      // 092: goto 099
      // 095: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 098: athrow
      // 099: ifeq 137
      // 09c: aload 13
      // 09e: aload 0
      // 09f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.onk Lnet/minecraft/world/gen/structure/StructureVillagePieces$y3u;
      // 0a2: if_acmpne 0cc
      // 0a5: aload 0
      // 0a6: aload 8
      // 0a8: ifnull 0dd
      // 0ab: goto 0b2
      // 0ae: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.fl_ Ljava/util/List;
      // 0b5: invokeinterface java/util/List.size ()I 1
      // 0ba: bipush 1
      // 0bb: if_icmple 0cc
      // 0be: goto 0c5
      // 0c1: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: goto 137
      // 0c8: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: aload 13
      // 0cf: aload 1
      // 0d0: aload 2
      // 0d1: iload 3
      // 0d2: iload 4
      // 0d4: iload 5
      // 0d6: aload 6
      // 0d8: iload 7
      // 0da: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.rej (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Lnet/minecraft/world/gen/structure/StructureVillagePieces$y3u;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lnet/minecraft/world/gen/structure/StructureVillagePieces$Village;
      // 0dd: astore 14
      // 0df: aload 8
      // 0e1: ifnull 114
      // 0e4: aload 14
      // 0e6: ifnull 132
      // 0e9: goto 0f0
      // 0ec: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 13
      // 0f2: dup
      // 0f3: getfield net/minecraft/world/gen/structure/StructureVillagePieces$y3u.e5b I
      // 0f6: bipush 1
      // 0f7: iadd
      // 0f8: putfield net/minecraft/world/gen/structure/StructureVillagePieces$y3u.e5b I
      // 0fb: aload 0
      // 0fc: aload 8
      // 0fe: ifnull 131
      // 101: goto 108
      // 104: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 107: athrow
      // 108: aload 13
      // 10a: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.onk Lnet/minecraft/world/gen/structure/StructureVillagePieces$y3u;
      // 10d: goto 114
      // 110: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 113: athrow
      // 114: aload 13
      // 116: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$y3u.tqu ()Z
      // 119: ifne 12f
      // 11c: aload 0
      // 11d: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.fl_ Ljava/util/List;
      // 120: aload 13
      // 122: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 127: pop
      // 128: goto 12f
      // 12b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 12e: athrow
      // 12f: aload 14
      // 131: areturn
      // 132: aload 8
      // 134: ifnonnull 049
      // 137: aload 8
      // 139: ifnonnull 028
      // 13c: aload 0
      // 13d: aload 1
      // 13e: aload 2
      // 13f: iload 3
      // 140: iload 4
      // 142: iload 5
      // 144: aload 6
      // 146: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Torch.bgc (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;)Lyve;
      // 149: astore 11
      // 14b: aload 11
      // 14d: ifnull 164
      // 150: new net/minecraft/world/gen/structure/StructureVillagePieces$Torch
      // 153: dup
      // 154: aload 0
      // 155: iload 7
      // 157: aload 2
      // 158: aload 11
      // 15a: aload 6
      // 15c: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$Torch.<init> (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lyve;Lvt2;)V
      // 15f: areturn
      // 160: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 163: athrow
      // 164: aconst_null
      // 165: areturn
   }

   private static xi1 a5p(StructureVillagePieces$Start param0, List param1, Random param2, int param3, int param4, int param5, vt2 param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 8
      // 005: iload 7
      // 007: bipush 50
      // 009: aload 8
      // 00b: ifnull 02c
      // 00e: if_icmple 01e
      // 011: goto 018
      // 014: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 017: athrow
      // 018: aconst_null
      // 019: areturn
      // 01a: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 01d: athrow
      // 01e: iload 3
      // 01f: aload 0
      // 020: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Start.q1q ()Lyve;
      // 023: getfield yve.gdj I
      // 026: isub
      // 027: invokestatic java/lang/Math.abs (I)I
      // 02a: bipush 112
      // 02c: aload 8
      // 02e: ifnull 051
      // 031: if_icmpgt 12f
      // 034: goto 03b
      // 037: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 03a: athrow
      // 03b: iload 5
      // 03d: aload 0
      // 03e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Start.q1q ()Lyve;
      // 041: getfield yve.ob0 I
      // 044: isub
      // 045: invokestatic java/lang/Math.abs (I)I
      // 048: bipush 112
      // 04a: goto 051
      // 04d: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 050: athrow
      // 051: if_icmpgt 12f
      // 054: aload 0
      // 055: aload 1
      // 056: aload 2
      // 057: iload 3
      // 058: iload 4
      // 05a: iload 5
      // 05c: aload 6
      // 05e: iload 7
      // 060: bipush 1
      // 061: iadd
      // 062: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.o6g (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lnet/minecraft/world/gen/structure/StructureVillagePieces$Village;
      // 065: astore 9
      // 067: aload 9
      // 069: aload 8
      // 06b: ifnull 07a
      // 06e: ifnull 12d
      // 071: goto 078
      // 074: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 9
      // 07a: getfield xi1.yqm Lyve;
      // 07d: getfield yve.gdj I
      // 080: aload 9
      // 082: getfield xi1.yqm Lyve;
      // 085: getfield yve.kwp I
      // 088: iadd
      // 089: bipush 2
      // 08a: idiv
      // 08b: istore 10
      // 08d: aload 9
      // 08f: getfield xi1.yqm Lyve;
      // 092: getfield yve.ob0 I
      // 095: aload 9
      // 097: getfield xi1.yqm Lyve;
      // 09a: getfield yve.nwc I
      // 09d: iadd
      // 09e: bipush 2
      // 09f: idiv
      // 0a0: istore 11
      // 0a2: aload 9
      // 0a4: getfield xi1.yqm Lyve;
      // 0a7: getfield yve.kwp I
      // 0aa: aload 9
      // 0ac: getfield xi1.yqm Lyve;
      // 0af: getfield yve.gdj I
      // 0b2: isub
      // 0b3: istore 12
      // 0b5: aload 9
      // 0b7: getfield xi1.yqm Lyve;
      // 0ba: getfield yve.nwc I
      // 0bd: aload 9
      // 0bf: getfield xi1.yqm Lyve;
      // 0c2: getfield yve.ob0 I
      // 0c5: isub
      // 0c6: istore 13
      // 0c8: iload 12
      // 0ca: aload 8
      // 0cc: ifnull 0e4
      // 0cf: iload 13
      // 0d1: if_icmple 0e7
      // 0d4: goto 0db
      // 0d7: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 0da: athrow
      // 0db: iload 12
      // 0dd: goto 0e4
      // 0e0: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: goto 0e9
      // 0e7: iload 13
      // 0e9: istore 14
      // 0eb: aload 0
      // 0ec: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Start.adb ()Lcdp;
      // 0ef: iload 10
      // 0f1: iload 11
      // 0f3: iload 14
      // 0f5: bipush 2
      // 0f6: idiv
      // 0f7: bipush 4
      // 0f8: iadd
      // 0f9: getstatic net/minecraft/world/gen/structure/MapGenVillage.a3x Ljava/util/List;
      // 0fc: invokevirtual cdp.h4l (IIILjava/util/List;)Z
      // 0ff: aload 8
      // 101: ifnull 129
      // 104: ifeq 12d
      // 107: goto 10e
      // 10a: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 10d: athrow
      // 10e: aload 1
      // 10f: aload 9
      // 111: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 116: pop
      // 117: aload 0
      // 118: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.t48 Ljava/util/List;
      // 11b: aload 9
      // 11d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 122: goto 129
      // 125: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 128: athrow
      // 129: pop
      // 12a: aload 9
      // 12c: areturn
      // 12d: aconst_null
      // 12e: areturn
      // 12f: aconst_null
      // 130: areturn
   }

   private static xi1 czv(StructureVillagePieces$Start param0, List param1, Random param2, int param3, int param4, int param5, vt2 param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 8
      // 005: iload 7
      // 007: bipush 3
      // 008: aload 0
      // 009: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.qru I
      // 00c: iadd
      // 00d: aload 8
      // 00f: ifnull 030
      // 012: if_icmple 022
      // 015: goto 01c
      // 018: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aconst_null
      // 01d: areturn
      // 01e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 021: athrow
      // 022: iload 3
      // 023: aload 0
      // 024: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Start.q1q ()Lyve;
      // 027: getfield yve.gdj I
      // 02a: isub
      // 02b: invokestatic java/lang/Math.abs (I)I
      // 02e: bipush 112
      // 030: aload 8
      // 032: ifnull 055
      // 035: if_icmpgt 14a
      // 038: goto 03f
      // 03b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 03e: athrow
      // 03f: iload 5
      // 041: aload 0
      // 042: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Start.q1q ()Lyve;
      // 045: getfield yve.ob0 I
      // 048: isub
      // 049: invokestatic java/lang/Math.abs (I)I
      // 04c: bipush 112
      // 04e: goto 055
      // 051: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 054: athrow
      // 055: if_icmpgt 14a
      // 058: aload 0
      // 059: aload 1
      // 05a: aload 2
      // 05b: iload 3
      // 05c: iload 4
      // 05e: iload 5
      // 060: aload 6
      // 062: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.c8l (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;)Lyve;
      // 065: astore 9
      // 067: aload 9
      // 069: aload 8
      // 06b: ifnull 07a
      // 06e: ifnull 148
      // 071: goto 078
      // 074: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 9
      // 07a: getfield yve._3o I
      // 07d: bipush 10
      // 07f: if_icmple 148
      // 082: new net/minecraft/world/gen/structure/StructureVillagePieces$Path
      // 085: dup
      // 086: aload 0
      // 087: iload 7
      // 089: aload 2
      // 08a: aload 9
      // 08c: aload 6
      // 08e: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$Path.<init> (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lyve;Lvt2;)V
      // 091: astore 10
      // 093: aload 10
      // 095: getfield xi1.yqm Lyve;
      // 098: getfield yve.gdj I
      // 09b: aload 10
      // 09d: getfield xi1.yqm Lyve;
      // 0a0: getfield yve.kwp I
      // 0a3: iadd
      // 0a4: bipush 2
      // 0a5: idiv
      // 0a6: istore 11
      // 0a8: aload 10
      // 0aa: getfield xi1.yqm Lyve;
      // 0ad: getfield yve.ob0 I
      // 0b0: aload 10
      // 0b2: getfield xi1.yqm Lyve;
      // 0b5: getfield yve.nwc I
      // 0b8: iadd
      // 0b9: bipush 2
      // 0ba: idiv
      // 0bb: istore 12
      // 0bd: aload 10
      // 0bf: getfield xi1.yqm Lyve;
      // 0c2: getfield yve.kwp I
      // 0c5: aload 10
      // 0c7: getfield xi1.yqm Lyve;
      // 0ca: getfield yve.gdj I
      // 0cd: isub
      // 0ce: istore 13
      // 0d0: aload 10
      // 0d2: getfield xi1.yqm Lyve;
      // 0d5: getfield yve.nwc I
      // 0d8: aload 10
      // 0da: getfield xi1.yqm Lyve;
      // 0dd: getfield yve.ob0 I
      // 0e0: isub
      // 0e1: istore 14
      // 0e3: iload 13
      // 0e5: aload 8
      // 0e7: ifnull 0ff
      // 0ea: iload 14
      // 0ec: if_icmple 102
      // 0ef: goto 0f6
      // 0f2: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: iload 13
      // 0f8: goto 0ff
      // 0fb: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: goto 104
      // 102: iload 14
      // 104: istore 15
      // 106: aload 0
      // 107: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Start.adb ()Lcdp;
      // 10a: iload 11
      // 10c: iload 12
      // 10e: iload 15
      // 110: bipush 2
      // 111: idiv
      // 112: bipush 4
      // 113: iadd
      // 114: getstatic net/minecraft/world/gen/structure/MapGenVillage.a3x Ljava/util/List;
      // 117: invokevirtual cdp.h4l (IIILjava/util/List;)Z
      // 11a: aload 8
      // 11c: ifnull 144
      // 11f: ifeq 148
      // 122: goto 129
      // 125: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 128: athrow
      // 129: aload 1
      // 12a: aload 10
      // 12c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 131: pop
      // 132: aload 0
      // 133: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.bc_ Ljava/util/List;
      // 136: aload 10
      // 138: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 13d: goto 144
      // 140: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.a (Loov;)Loov;
      // 143: athrow
      // 144: pop
      // 145: aload 10
      // 147: areturn
      // 148: aconst_null
      // 149: areturn
      // 14a: aconst_null
      // 14b: areturn
   }

   public static xi1 ycl(StructureVillagePieces$Start var0, List var1, Random var2, int var3, int var4, int var5, vt2 var6, int var7) {
      return czv(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static xi1 ds_(StructureVillagePieces$Start var0, List var1, Random var2, int var3, int var4, int var5, vt2 var6, int var7) {
      return a5p(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5474453610184929895L, -3611854751085830182L, MethodHandles.lookup().lookupClass()).a(204145958197731L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 140726956339935L;
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
      String var6 = "\u00adË·Vµ\u0015\u0097\u0082é@S\u0091´\u0099\fÄ\u0010\u008e\u0004Q!>X!¬*\u0092!+÷\u0006ü\u0081\u0010X\u009aG\u008dwþrmX´=Ë\u001aH¨\u0006\u0010U¸C·Û\u000eàèÁ\u0000âÒ\u0000\u009e¶u\u0010û\u0086ö\u0087|ç;\u008b\u0010È7²\u008f\u0011zx\u0010sIÍq\u008cJô\u0088:õ\u0000\u009fñÞ3=\u0010\u0003Ù¾ø5õ\u001aÑ-\u008bld\u0084\u001be£\u0010\u0082sÖÄâ\u0093\u0015I\u0002ÏßùÚz¡Í\u0010¿ø\u0017\u008a-~\u0093dwÄ\u0018 <\u008bøº\u0010ê\u0005G´É\u0088xü1×w\u0084ã_5}\u0010´É¾3Á\u0000\u008e-JD¤X5¾º\u009f";
      int var8 = "\u00adË·Vµ\u0015\u0097\u0082é@S\u0091´\u0099\fÄ\u0010\u008e\u0004Q!>X!¬*\u0092!+÷\u0006ü\u0081\u0010X\u009aG\u008dwþrmX´=Ë\u001aH¨\u0006\u0010U¸C·Û\u000eàèÁ\u0000âÒ\u0000\u009e¶u\u0010û\u0086ö\u0087|ç;\u008b\u0010È7²\u008f\u0011zx\u0010sIÍq\u008cJô\u0088:õ\u0000\u009fñÞ3=\u0010\u0003Ù¾ø5õ\u001aÑ-\u008bld\u0084\u001be£\u0010\u0082sÖÄâ\u0093\u0015I\u0002ÏßùÚz¡Í\u0010¿ø\u0017\u008a-~\u0093dwÄ\u0018 <\u008bøº\u0010ê\u0005G´É\u0088xü1×w\u0084ã_5}\u0010´É¾3Á\u0000\u008e-JD¤X5¾º\u009f"
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

                  var6 = "\u00ad\f\u007f<ç\u0014WÕNK\u009a ÒKå9\u0010ó,\u0010ç;\u0017Nþ!\u0006\u001d\u009by\u0007³\u009f";
                  var8 = "\u00ad\f\u007f<ç\u0014WÕNK\u009a ÒKå9\u0010ó,\u0010ç;\u0017Nþ!\u0006\u001d\u009by\u0007³\u009f".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1422;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
