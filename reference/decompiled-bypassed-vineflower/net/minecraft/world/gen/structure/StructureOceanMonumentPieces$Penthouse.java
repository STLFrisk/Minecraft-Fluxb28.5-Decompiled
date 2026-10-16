package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$Penthouse extends StructureOceanMonumentPieces$Piece {
   public StructureOceanMonumentPieces$Penthouse() {
   }

   public StructureOceanMonumentPieces$Penthouse(vt2 var1, yve var2) {
      super(var1, var2);
   }

   @Override
   public boolean d__(t9d var1, Random var2, yve var3) {
      this.gys(var1, var3, 2, -1, 2, 11, -1, 11, lzf, lzf, false);
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      this.gys(var1, var3, 0, -1, 0, 1, -1, 11, v7m, v7m, false);
      i2h[] var4 = var10000;
      this.gys(var1, var3, 12, -1, 0, 13, -1, 11, v7m, v7m, false);
      this.gys(var1, var3, 2, -1, 0, 11, -1, 1, v7m, v7m, false);
      this.gys(var1, var3, 2, -1, 12, 11, -1, 13, v7m, v7m, false);
      this.gys(var1, var3, 0, 0, 0, 0, 0, 13, lzf, lzf, false);
      this.gys(var1, var3, 13, 0, 0, 13, 0, 13, lzf, lzf, false);
      this.gys(var1, var3, 1, 0, 0, 12, 0, 0, lzf, lzf, false);
      this.gys(var1, var3, 1, 0, 13, 12, 0, 13, lzf, lzf, false);
      byte var5 = 2;

      while (true) {
         if (var5 <= 11) {
            try {
               this.lzy(var1, mip, 0, 0, var5, var3);
               this.lzy(var1, mip, 13, 0, var5, var3);
               this.lzy(var1, mip, var5, 0, 0, var3);
               var5 += 3;
               if (var4 == null) {
                  break;
               }

               if (var4 != null) {
                  continue;
               }
            } catch (oov var9) {
               throw a(var9);
            }
         }

         this.gys(var1, var3, 2, 0, 3, 4, 0, 9, lzf, lzf, false);
         this.gys(var1, var3, 9, 0, 3, 11, 0, 9, lzf, lzf, false);
         this.gys(var1, var3, 4, 0, 9, 9, 0, 11, lzf, lzf, false);
         this.lzy(var1, lzf, 5, 0, 8, var3);
         this.lzy(var1, lzf, 8, 0, 8, var3);
         this.lzy(var1, lzf, 10, 0, 10, var3);
         this.lzy(var1, lzf, 3, 0, 10, var3);
         this.gys(var1, var3, 3, 0, 3, 3, 0, 7, cyh, cyh, false);
         this.gys(var1, var3, 10, 0, 3, 10, 0, 7, cyh, cyh, false);
         this.gys(var1, var3, 6, 0, 10, 7, 0, 10, cyh, cyh, false);
         var5 = 3;
         break;
      }

      int var6 = 0;

      while (true) {
         if (var6 < 2) {
            var10 = 2;
            if (var4 == null) {
               break;
            }

            byte var7 = 2;

            label40: {
               while (var7 <= 8) {
                  try {
                     this.gys(var1, var3, var5, 0, var7, var5, 2, var7, lzf, lzf, false);
                     var7 += 3;
                     if (var4 == null) {
                        break label40;
                     }

                     if (var4 == null) {
                        break;
                     }
                  } catch (oov var8) {
                     throw a(var8);
                  }
               }

               var5 = 10;
               var6++;
            }

            if (var4 != null) {
               continue;
            }
         }

         this.gys(var1, var3, 5, 0, 10, 5, 2, 10, lzf, lzf, false);
         this.gys(var1, var3, 8, 0, 10, 8, 2, 10, lzf, lzf, false);
         this.gys(var1, var3, 6, -1, 7, 7, -1, 8, cyh, cyh, false);
         this.sm_(var1, var3, 6, -1, 3, 7, -1, 4, false);
         this.cm6(var1, var3, 6, 1, 6);
         var10 = 1;
         break;
      }

      return (boolean)var10;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
