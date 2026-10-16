package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureNetherBridgePieces$Crossing extends StructureNetherBridgePieces$Piece {
   public StructureNetherBridgePieces$Crossing() {
   }

   public StructureNetherBridgePieces$Crossing(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.yqm = var3;
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      this.d3x((StructureNetherBridgePieces$Start)var1, var2, var3, 2, 0, false);
      this.lns((StructureNetherBridgePieces$Start)var1, var2, var3, 0, 2, false);
      this.fkt((StructureNetherBridgePieces$Start)var1, var2, var3, 0, 2, false);
   }

   public static StructureNetherBridgePieces$Crossing t_q(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 04: bipush -2
      // 06: bipush 0
      // 07: bipush 0
      // 08: bipush 7
      // 0a: bipush 9
      // 0c: bipush 7
      // 0e: aload 5
      // 10: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 13: astore 7
      // 15: aload 7
      // 17: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing.ulp (Lyve;)Z
      // 1a: ifeq 42
      // 1d: aload 0
      // 1e: aload 7
      // 20: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 23: ifnonnull 42
      // 26: goto 2d
      // 29: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing.a (Loov;)Loov;
      // 2c: athrow
      // 2d: new net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing
      // 30: dup
      // 31: iload 6
      // 33: aload 1
      // 34: aload 7
      // 36: aload 5
      // 38: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3b: goto 43
      // 3e: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing.a (Loov;)Loov;
      // 41: athrow
      // 42: aconst_null
      // 43: areturn
   }

   @Override
   public boolean d__(t9d var1, Random var2, yve var3) {
      this.gys(var1, var3, 0, 0, 0, 6, 1, 6, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 2, 0, 6, 7, 6, ox_.ibw.l4i(), ox_.ibw.l4i(), false);
      this.gys(var1, var3, 0, 2, 0, 1, 6, 0, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      this.gys(var1, var3, 0, 2, 6, 1, 6, 6, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 5, 2, 0, 6, 6, 0, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 5, 2, 6, 6, 6, 6, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 2, 0, 0, 6, 1, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 2, 5, 0, 6, 6, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 6, 2, 0, 6, 6, 1, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 6, 2, 5, 6, 6, 6, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      i2h[] var4 = var10000;
      this.gys(var1, var3, 2, 6, 0, 4, 6, 0, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 2, 5, 0, 4, 5, 0, ox_.laa.l4i(), ox_.laa.l4i(), false);
      this.gys(var1, var3, 2, 6, 6, 4, 6, 6, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 2, 5, 6, 4, 5, 6, ox_.laa.l4i(), ox_.laa.l4i(), false);
      this.gys(var1, var3, 0, 6, 2, 0, 6, 4, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 5, 2, 0, 5, 4, ox_.laa.l4i(), ox_.laa.l4i(), false);
      this.gys(var1, var3, 6, 6, 2, 6, 6, 4, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 6, 5, 2, 6, 5, 4, ox_.laa.l4i(), ox_.laa.l4i(), false);
      int var5 = 0;

      while (true) {
         if (var5 <= 6) {
            var8 = false;
            if (var4 == null) {
               break;
            }

            int var6 = 0;

            label32: {
               while (var6 <= 6) {
                  try {
                     this.doc(var1, ox_.cbk.l4i(), var5, -1, var6, var3);
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
