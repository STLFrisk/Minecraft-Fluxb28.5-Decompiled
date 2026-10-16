package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureNetherBridgePieces$Crossing2 extends StructureNetherBridgePieces$Piece {
   public StructureNetherBridgePieces$Crossing2() {
   }

   public StructureNetherBridgePieces$Crossing2(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.yqm = var3;
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      this.d3x((StructureNetherBridgePieces$Start)var1, var2, var3, 1, 0, true);
      this.lns((StructureNetherBridgePieces$Start)var1, var2, var3, 0, 1, true);
      this.fkt((StructureNetherBridgePieces$Start)var1, var2, var3, 0, 1, true);
   }

   public static StructureNetherBridgePieces$Crossing2 tx5(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 04: bipush -1
      // 05: bipush 0
      // 06: bipush 0
      // 07: bipush 5
      // 08: bipush 7
      // 0a: bipush 5
      // 0b: aload 5
      // 0d: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 10: astore 7
      // 12: aload 7
      // 14: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing2.ulp (Lyve;)Z
      // 17: ifeq 3f
      // 1a: aload 0
      // 1b: aload 7
      // 1d: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 20: ifnonnull 3f
      // 23: goto 2a
      // 26: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing2.a (Loov;)Loov;
      // 29: athrow
      // 2a: new net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing2
      // 2d: dup
      // 2e: iload 6
      // 30: aload 1
      // 31: aload 7
      // 33: aload 5
      // 35: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing2.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 38: goto 40
      // 3b: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing2.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aconst_null
      // 40: areturn
   }

   @Override
   public boolean d__(t9d var1, Random var2, yve var3) {
      this.gys(var1, var3, 0, 0, 0, 4, 1, 4, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 2, 0, 4, 5, 4, ox_.ibw.l4i(), ox_.ibw.l4i(), false);
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      this.gys(var1, var3, 0, 2, 0, 0, 5, 0, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 4, 2, 0, 4, 5, 0, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 2, 4, 0, 5, 4, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 4, 2, 4, 4, 5, 4, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 6, 0, 4, 6, 4, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      i2h[] var4 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 <= 4) {
            var8 = false;
            if (var4 == null) {
               break;
            }

            int var6 = 0;

            label32: {
               while (var6 <= 4) {
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
