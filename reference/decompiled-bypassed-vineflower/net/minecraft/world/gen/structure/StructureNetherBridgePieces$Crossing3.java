package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureNetherBridgePieces$Crossing3 extends StructureNetherBridgePieces$Piece {
   public StructureNetherBridgePieces$Crossing3() {
   }

   public StructureNetherBridgePieces$Crossing3(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.yqm = var3;
   }

   public StructureNetherBridgePieces$Crossing3(Random param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 4
      // 05: aload 0
      // 06: bipush 0
      // 07: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.<init> (I)V
      // 0a: aload 0
      // 0b: aload 4
      // 0d: ifnull 71
      // 10: getstatic vt2$unz.fzl Lvt2$unz;
      // 13: aload 1
      // 14: invokevirtual vt2$unz.cvs (Ljava/util/Random;)Lvt2;
      // 17: putfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3.p7m Lvt2;
      // 1a: getstatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$1.f6i [I
      // 1d: aload 0
      // 1e: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3.p7m Lvt2;
      // 21: invokevirtual vt2.ordinal ()I
      // 24: iaload
      // 25: lookupswitch 68 2 1 27 2 27
      // 40: aload 0
      // 41: new yve
      // 44: dup
      // 45: iload 2
      // 46: bipush 64
      // 48: iload 3
      // 49: iload 2
      // 4a: bipush 19
      // 4c: iadd
      // 4d: bipush 1
      // 4e: isub
      // 4f: bipush 73
      // 51: iload 3
      // 52: bipush 19
      // 54: iadd
      // 55: bipush 1
      // 56: isub
      // 57: invokespecial yve.<init> (IIIIII)V
      // 5a: putfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3.yqm Lyve;
      // 5d: aload 4
      // 5f: ifnonnull 8d
      // 62: goto 69
      // 65: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 0
      // 6a: goto 71
      // 6d: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3.a (Loov;)Loov;
      // 70: athrow
      // 71: new yve
      // 74: dup
      // 75: iload 2
      // 76: bipush 64
      // 78: iload 3
      // 79: iload 2
      // 7a: bipush 19
      // 7c: iadd
      // 7d: bipush 1
      // 7e: isub
      // 7f: bipush 73
      // 81: iload 3
      // 82: bipush 19
      // 84: iadd
      // 85: bipush 1
      // 86: isub
      // 87: invokespecial yve.<init> (IIIIII)V
      // 8a: putfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3.yqm Lyve;
      // 8d: return
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      this.d3x((StructureNetherBridgePieces$Start)var1, var2, var3, 8, 3, false);
      this.lns((StructureNetherBridgePieces$Start)var1, var2, var3, 3, 8, false);
      this.fkt((StructureNetherBridgePieces$Start)var1, var2, var3, 3, 8, false);
   }

   public static StructureNetherBridgePieces$Crossing3 pfx(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 04: bipush -8
      // 06: bipush -3
      // 08: bipush 0
      // 09: bipush 19
      // 0b: bipush 10
      // 0d: bipush 19
      // 0f: aload 5
      // 11: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 14: astore 7
      // 16: aload 7
      // 18: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3.ulp (Lyve;)Z
      // 1b: ifeq 43
      // 1e: aload 0
      // 1f: aload 7
      // 21: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 24: ifnonnull 43
      // 27: goto 2e
      // 2a: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3.a (Loov;)Loov;
      // 2d: athrow
      // 2e: new net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3
      // 31: dup
      // 32: iload 6
      // 34: aload 1
      // 35: aload 7
      // 37: aload 5
      // 39: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3c: goto 44
      // 3f: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3.a (Loov;)Loov;
      // 42: athrow
      // 43: aconst_null
      // 44: areturn
   }

   @Override
   public boolean d__(t9d var1, Random var2, yve var3) {
      this.gys(var1, var3, 7, 3, 0, 11, 4, 18, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 3, 7, 18, 4, 11, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 8, 5, 0, 10, 7, 18, ox_.ibw.l4i(), ox_.ibw.l4i(), false);
      this.gys(var1, var3, 0, 5, 8, 18, 7, 10, ox_.ibw.l4i(), ox_.ibw.l4i(), false);
      this.gys(var1, var3, 7, 5, 0, 7, 5, 7, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 7, 5, 11, 7, 5, 18, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 11, 5, 0, 11, 5, 7, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      this.gys(var1, var3, 11, 5, 11, 11, 5, 18, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 5, 7, 7, 5, 7, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 11, 5, 7, 18, 5, 7, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 0, 5, 11, 7, 5, 11, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 11, 5, 11, 18, 5, 11, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      i2h[] var4 = var10000;
      this.gys(var1, var3, 7, 2, 0, 11, 2, 5, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 7, 2, 13, 11, 2, 18, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 7, 0, 0, 11, 1, 3, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      this.gys(var1, var3, 7, 0, 15, 11, 1, 18, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
      int var5 = 7;

      while (true) {
         if (var5 <= 11) {
            var11 = 0;
            if (var4 == null) {
               break;
            }

            int var6 = 0;

            label66: {
               while (var6 <= 2) {
                  try {
                     this.doc(var1, ox_.cbk.l4i(), var5, -1, var6, var3);
                     this.doc(var1, ox_.cbk.l4i(), var5, -1, 18 - var6, var3);
                     var6++;
                     if (var4 == null) {
                        break label66;
                     }

                     if (var4 == null) {
                        break;
                     }
                  } catch (oov var8) {
                     throw a(var8);
                  }
               }

               var5++;
            }

            if (var4 != null) {
               continue;
            }
         }

         this.gys(var1, var3, 0, 2, 7, 5, 2, 11, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
         this.gys(var1, var3, 13, 2, 7, 18, 2, 11, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
         this.gys(var1, var3, 0, 0, 7, 3, 1, 11, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
         this.gys(var1, var3, 15, 0, 7, 18, 1, 11, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
         var11 = 0;
         break;
      }

      var5 = var11;

      while (true) {
         if (var5 <= 2) {
            var12 = 7;
            if (var4 == null) {
               break;
            }

            int var10 = 7;

            label45: {
               while (var10 <= 11) {
                  try {
                     this.doc(var1, ox_.cbk.l4i(), var5, -1, var10, var3);
                     this.doc(var1, ox_.cbk.l4i(), 18 - var5, -1, var10, var3);
                     var10++;
                     if (var4 == null) {
                        break label45;
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

         var12 = 1;
         break;
      }

      return (boolean)var12;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
