package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureNetherBridgePieces$Corridor4 extends StructureNetherBridgePieces$Piece {
   public StructureNetherBridgePieces$Corridor4() {
   }

   public StructureNetherBridgePieces$Corridor4(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.yqm = var3;
   }

   @Override
   public void vxr(xi1 param1, List param2, Random param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 4
      // 05: bipush 1
      // 06: istore 5
      // 08: aload 0
      // 09: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.p7m Lvt2;
      // 0c: getstatic vt2.te4 Lvt2;
      // 0f: aload 4
      // 11: ifnull 38
      // 14: if_acmpeq 3b
      // 17: goto 1e
      // 1a: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 4
      // 21: ifnull 3f
      // 24: goto 2b
      // 27: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.p7m Lvt2;
      // 2e: getstatic vt2.z9q Lvt2;
      // 31: goto 38
      // 34: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.a (Loov;)Loov;
      // 37: athrow
      // 38: if_acmpne 3e
      // 3b: bipush 5
      // 3c: istore 5
      // 3e: aload 0
      // 3f: aload 1
      // 40: checkcast net/minecraft/world/gen/structure/StructureNetherBridgePieces$Start
      // 43: aload 2
      // 44: aload 3
      // 45: bipush 0
      // 46: iload 5
      // 48: aload 3
      // 49: bipush 8
      // 4b: invokevirtual java/util/Random.nextInt (I)I
      // 4e: aload 4
      // 50: ifnull 5e
      // 53: ifle 61
      // 56: goto 5d
      // 59: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.a (Loov;)Loov;
      // 5c: athrow
      // 5d: bipush 1
      // 5e: goto 62
      // 61: bipush 0
      // 62: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.lns (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIZ)Lxi1;
      // 65: pop
      // 66: aload 0
      // 67: aload 1
      // 68: checkcast net/minecraft/world/gen/structure/StructureNetherBridgePieces$Start
      // 6b: aload 2
      // 6c: aload 3
      // 6d: bipush 0
      // 6e: iload 5
      // 70: aload 3
      // 71: bipush 8
      // 73: invokevirtual java/util/Random.nextInt (I)I
      // 76: aload 4
      // 78: ifnull 86
      // 7b: ifle 89
      // 7e: goto 85
      // 81: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.a (Loov;)Loov;
      // 84: athrow
      // 85: bipush 1
      // 86: goto 8a
      // 89: bipush 0
      // 8a: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.fkt (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIZ)Lxi1;
      // 8d: pop
      // 8e: return
   }

   public static StructureNetherBridgePieces$Corridor4 fpu(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: iload 3
      // 02: iload 4
      // 04: bipush -3
      // 06: bipush 0
      // 07: bipush 0
      // 08: bipush 9
      // 0a: bipush 7
      // 0c: bipush 9
      // 0e: aload 5
      // 10: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 13: astore 7
      // 15: aload 7
      // 17: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.ulp (Lyve;)Z
      // 1a: ifeq 42
      // 1d: aload 0
      // 1e: aload 7
      // 20: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 23: ifnonnull 42
      // 26: goto 2d
      // 29: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.a (Loov;)Loov;
      // 2c: athrow
      // 2d: new net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4
      // 30: dup
      // 31: iload 6
      // 33: aload 1
      // 34: aload 7
      // 36: aload 5
      // 38: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3b: goto 43
      // 3e: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor4.a (Loov;)Loov;
      // 41: athrow
      // 42: aconst_null
      // 43: areturn
   }

   @Override
   public boolean d__(t9d var1, Random var2, yve var3) {
      this.gys(var1, var3, 0, 0, 0, 8, 1, 8, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      this.gys(var1, var3, 0, 2, 0, 8, 5, 8, ox_.ibw.l4i(), ox_.ibw.l4i(), false);
      this.gys(var1, var3, 0, 6, 0, 8, 6, 5, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 2, 0, 2, 5, 0, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 6, 2, 0, 8, 5, 0, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 1, 3, 0, 1, 4, 0, ox_.laa.l4i(), ox_.laa.l4i(), false);
      this.gys(var1, var3, 7, 3, 0, 7, 4, 0, ox_.laa.l4i(), ox_.laa.l4i(), false);
      i2h[] var4 = var10000;
      this.gys(var1, var3, 0, 2, 4, 8, 2, 8, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 1, 1, 4, 2, 2, 4, ox_.ibw.l4i(), ox_.ibw.l4i(), false);
      this.gys(var1, var3, 6, 1, 4, 7, 2, 4, ox_.ibw.l4i(), ox_.ibw.l4i(), false);
      this.gys(var1, var3, 0, 3, 8, 8, 3, 8, ox_.laa.l4i(), ox_.laa.l4i(), false);
      this.gys(var1, var3, 0, 3, 6, 0, 3, 7, ox_.laa.l4i(), ox_.laa.l4i(), false);
      this.gys(var1, var3, 8, 3, 6, 8, 3, 7, ox_.laa.l4i(), ox_.laa.l4i(), false);
      this.gys(var1, var3, 0, 3, 4, 0, 5, 5, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 8, 3, 4, 8, 5, 5, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 1, 3, 5, 2, 5, 5, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 6, 3, 5, 7, 5, 5, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 1, 4, 5, 1, 5, 5, ox_.laa.l4i(), ox_.laa.l4i(), false);
      this.gys(var1, var3, 7, 4, 5, 7, 5, 5, ox_.laa.l4i(), ox_.laa.l4i(), false);
      int var5 = 0;

      while (true) {
         if (var5 <= 5) {
            var8 = false;
            if (var4 == null) {
               break;
            }

            int var6 = 0;

            label32: {
               while (var6 <= 8) {
                  try {
                     this.doc(var1, ox_.cbk.l4i(), var6, -1, var5, var3);
                     var6++;
                     if (var4 == null) {
                        break label32;
                     }

                     if (var4 == null) {
                        break;
                     }
                  } catch (oov var7) {
                     throw a(var7);
                  }
               }

               var5++;
            }

            if (var4 != null) {
               continue;
            }
         }

         var8 = true;
         break;
      }

      return var8;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
