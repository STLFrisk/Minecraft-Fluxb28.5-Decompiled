package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$WingRoom extends StructureOceanMonumentPieces$Piece {
   private int s52;

   public StructureOceanMonumentPieces$WingRoom() {
   }

   public StructureOceanMonumentPieces$WingRoom(vt2 var1, yve var2, int var3) {
      super(var1, var2);
      this.s52 = var3 & 1;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public boolean d__(t9d var1, Random var2, yve var3) {
      i2h[] var4 = StructureStrongholdPieces$Stronghold.b();

      int var10000;
      label151: {
         label159: {
            try {
               var10000 = this.s52;
               if (var4 == null) {
                  break label151;
               }

               if (this.s52 != 0) {
                  break label159;
               }
            } catch (oov var17) {
               throw a(var17);
            }

            int var5 = 0;

            label143: {
               while (var5 < 4) {
                  try {
                     this.gys(var1, var3, 10 - var5, 3 - var5, 20 - var5, 12 + var5, 3 - var5, 20, lzf, lzf, false);
                     var5++;
                     if (var4 == null) {
                        break label143;
                     }

                     if (var4 == null) {
                        break;
                     }
                  } catch (oov var16) {
                     throw a(var16);
                  }
               }

               this.gys(var1, var3, 7, 0, 6, 15, 0, 16, lzf, lzf, false);
               this.gys(var1, var3, 6, 0, 6, 6, 3, 20, lzf, lzf, false);
               this.gys(var1, var3, 16, 0, 6, 16, 3, 20, lzf, lzf, false);
               this.gys(var1, var3, 7, 1, 7, 7, 1, 20, lzf, lzf, false);
               this.gys(var1, var3, 15, 1, 7, 15, 1, 20, lzf, lzf, false);
               this.gys(var1, var3, 7, 1, 6, 9, 3, 6, lzf, lzf, false);
               this.gys(var1, var3, 13, 1, 6, 15, 3, 6, lzf, lzf, false);
               this.gys(var1, var3, 8, 1, 7, 9, 1, 7, lzf, lzf, false);
               this.gys(var1, var3, 13, 1, 7, 14, 1, 7, lzf, lzf, false);
               this.gys(var1, var3, 9, 0, 5, 13, 0, 5, lzf, lzf, false);
               this.gys(var1, var3, 10, 0, 7, 12, 0, 7, cyh, cyh, false);
               this.gys(var1, var3, 8, 0, 10, 8, 0, 12, cyh, cyh, false);
               this.gys(var1, var3, 14, 0, 10, 14, 0, 12, cyh, cyh, false);
            }

            byte var18 = 18;

            label131: {
               while (var18 >= 7) {
                  try {
                     this.lzy(var1, mip, 6, 3, var18, var3);
                     this.lzy(var1, mip, 16, 3, var18, var3);
                     var18 -= 3;
                     if (var4 == null) {
                        break label131;
                     }

                     if (var4 == null) {
                        break;
                     }
                  } catch (oov var15) {
                     throw a(var15);
                  }
               }

               this.lzy(var1, mip, 10, 0, 10, var3);
               this.lzy(var1, mip, 12, 0, 10, var3);
               this.lzy(var1, mip, 10, 0, 12, var3);
               this.lzy(var1, mip, 12, 0, 12, var3);
               this.lzy(var1, mip, 8, 3, 6, var3);
               this.lzy(var1, mip, 14, 3, 6, var3);
               this.lzy(var1, lzf, 4, 2, 4, var3);
               this.lzy(var1, mip, 4, 1, 4, var3);
               this.lzy(var1, lzf, 4, 0, 4, var3);
               this.lzy(var1, lzf, 18, 2, 4, var3);
               this.lzy(var1, mip, 18, 1, 4, var3);
               this.lzy(var1, lzf, 18, 0, 4, var3);
               this.lzy(var1, lzf, 4, 2, 18, var3);
               this.lzy(var1, mip, 4, 1, 18, var3);
               this.lzy(var1, lzf, 4, 0, 18, var3);
               this.lzy(var1, lzf, 18, 2, 18, var3);
               this.lzy(var1, mip, 18, 1, 18, var3);
               this.lzy(var1, lzf, 18, 0, 18, var3);
               this.lzy(var1, lzf, 9, 7, 20, var3);
               this.lzy(var1, lzf, 13, 7, 20, var3);
               this.gys(var1, var3, 6, 0, 21, 7, 4, 21, lzf, lzf, false);
               this.gys(var1, var3, 15, 0, 21, 16, 4, 21, lzf, lzf, false);
               this.cm6(var1, var3, 11, 2, 16);
            }

            try {
               if (var4 != null) {
                  return (boolean)1;
               }
            } catch (oov var14) {
               boolean var10001 = false;
               throw a(var14);
            }
         }

         try {
            var10000 = this.s52;
         } catch (oov var13) {
            boolean var23 = false;
            throw a(var13);
         }
      }

      try {
         if (var4 == null) {
            return (boolean)var10000;
         }

         if (var10000 != 1) {
            return (boolean)1;
         }
      } catch (oov var12) {
         throw a(var12);
      }

      this.gys(var1, var3, 9, 3, 18, 13, 3, 20, lzf, lzf, false);
      this.gys(var1, var3, 9, 0, 18, 9, 2, 18, lzf, lzf, false);
      this.gys(var1, var3, 13, 0, 18, 13, 2, 18, lzf, lzf, false);
      byte var19 = 9;
      byte var6 = 20;
      byte var7 = 5;
      int var8 = 0;

      label107: {
         while (var8 < 2) {
            this.lzy(var1, lzf, var19, var7 + 1, var6, var3);
            this.lzy(var1, mip, var19, var7, var6, var3);
            this.lzy(var1, lzf, var19, var7 - 1, var6, var3);
            var19 = 13;

            try {
               var8++;
               if (var4 == null) {
                  break label107;
               }

               if (var4 == null) {
                  break;
               }
            } catch (oov var11) {
               throw a(var11);
            }
         }

         this.gys(var1, var3, 7, 3, 7, 15, 3, 14, lzf, lzf, false);
         var19 = 10;
      }

      var8 = 0;

      label94: {
         while (var8 < 2) {
            this.gys(var1, var3, var19, 0, 10, var19, 6, 10, lzf, lzf, false);
            this.gys(var1, var3, var19, 0, 12, var19, 6, 12, lzf, lzf, false);
            this.lzy(var1, mip, var19, 0, 10, var3);
            this.lzy(var1, mip, var19, 0, 12, var3);
            this.lzy(var1, mip, var19, 4, 10, var3);
            this.lzy(var1, mip, var19, 4, 12, var3);
            var19 = 12;

            try {
               var8++;
               if (var4 == null) {
                  break label94;
               }

               if (var4 == null) {
                  break;
               }
            } catch (oov var10) {
               throw a(var10);
            }
         }

         var19 = 8;
      }

      var8 = 0;

      label81: {
         while (var8 < 2) {
            this.gys(var1, var3, var19, 0, 7, var19, 2, 7, lzf, lzf, false);
            this.gys(var1, var3, var19, 0, 14, var19, 2, 14, lzf, lzf, false);
            var19 = 14;

            try {
               var8++;
               if (var4 == null) {
                  break label81;
               }

               if (var4 == null) {
                  break;
               }
            } catch (oov var9) {
               throw a(var9);
            }
         }

         this.gys(var1, var3, 8, 3, 8, 8, 3, 13, cyh, cyh, false);
         this.gys(var1, var3, 14, 3, 8, 14, 3, 13, cyh, cyh, false);
      }

      this.cm6(var1, var3, 11, 5, 13);
      return (boolean)1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
