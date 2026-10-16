package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureNetherBridgePieces$Straight extends StructureNetherBridgePieces$Piece {
   public StructureNetherBridgePieces$Straight() {
   }

   public StructureNetherBridgePieces$Straight(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.yqm = var3;
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      this.d3x((StructureNetherBridgePieces$Start)var1, var2, var3, 1, 3, false);
   }

   public static StructureNetherBridgePieces$Straight v5r(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 05: bipush -3
      // 07: bipush 0
      // 08: bipush 5
      // 09: bipush 10
      // 0b: bipush 19
      // 0d: aload 5
      // 0f: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 12: astore 7
      // 14: aload 7
      // 16: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Straight.ulp (Lyve;)Z
      // 19: ifeq 41
      // 1c: aload 0
      // 1d: aload 7
      // 1f: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 22: ifnonnull 41
      // 25: goto 2c
      // 28: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Straight.a (Loov;)Loov;
      // 2b: athrow
      // 2c: new net/minecraft/world/gen/structure/StructureNetherBridgePieces$Straight
      // 2f: dup
      // 30: iload 6
      // 32: aload 1
      // 33: aload 7
      // 35: aload 5
      // 37: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Straight.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3a: goto 42
      // 3d: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Straight.a (Loov;)Loov;
      // 40: athrow
      // 41: aconst_null
      // 42: areturn
   }

   @Override
   public boolean d__(OpaquePredicate var1, Random var2, yve var3) {
      this.gys(var1, var3, 0, 3, 0, 4, 4, 18, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 1, 5, 0, 3, 7, 18, ox_.ibw.l4i(), ox_.ibw.l4i(), false);
      this.gys(var1, var3, 0, 5, 0, 0, 5, 18, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      EntityLivingBase[] var10000 = StructureStrongholdPieces$Stronghold.b();
      this.gys(var1, var3, 4, 5, 0, 4, 5, 18, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 2, 0, 4, 2, 5, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 2, 13, 4, 2, 18, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 0, 0, 4, 1, 3, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      EntityLivingBase[] var4 = var10000;
      this.gys(var1, var3, 0, 0, 15, 4, 1, 18, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      int var5 = 0;

      while (true) {
         if (var5 <= 4) {
            var8 = false;
            if (var4 == null) {
               break;
            }

            int var6 = 0;

            label32: {
               while (var6 <= 2) {
                  try {
                     this.doc(var1, ox_.cbk.l4i(), var5, -1, var6, var3);
                     this.doc(var1, ox_.cbk.l4i(), var5, -1, 18 - var6, var3);
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

         this.gys(var1, var3, 0, 1, 1, 0, 4, 1, ox_.laa.l4i(), ox_.laa.l4i(), false);
         this.gys(var1, var3, 0, 3, 4, 0, 4, 4, ox_.laa.l4i(), ox_.laa.l4i(), false);
         this.gys(var1, var3, 0, 3, 14, 0, 4, 14, ox_.laa.l4i(), ox_.laa.l4i(), false);
         this.gys(var1, var3, 0, 1, 17, 0, 4, 17, ox_.laa.l4i(), ox_.laa.l4i(), false);
         this.gys(var1, var3, 4, 1, 1, 4, 4, 1, ox_.laa.l4i(), ox_.laa.l4i(), false);
         this.gys(var1, var3, 4, 3, 4, 4, 4, 4, ox_.laa.l4i(), ox_.laa.l4i(), false);
         this.gys(var1, var3, 4, 3, 14, 4, 4, 14, ox_.laa.l4i(), ox_.laa.l4i(), false);
         this.gys(var1, var3, 4, 1, 17, 4, 4, 17, ox_.laa.l4i(), ox_.laa.l4i(), false);
         var8 = true;
         break;
      }

      return var8;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
