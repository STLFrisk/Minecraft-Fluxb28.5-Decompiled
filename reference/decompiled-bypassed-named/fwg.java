public class fwg extends ttt {
   public fwg(long var1, ttt var3) {
      super(var1);
      super.ty5 = var3;
   }

   @Override
   public int[] ub9(int var1, int var2, int var3, int var4) {
      int var6 = var1 >> 1;
      int var7 = var2 >> 1;
      int var10000 = OpaquePredicate.b();
      int var8 = (var3 >> 1) + 2;
      int var9 = (var4 >> 1) + 2;
      int[] var10 = this.ty5.ub9(var6, var7, var8, var9);
      int var11 = var8 - 1 << 1;
      int var12 = var9 - 1 << 1;
      int[] var13 = z97.web(var11 * var12);
      int var5 = var10000;
      int var14 = 0;

      while (true) {
         if (var14 < var9 - 1) {
            int var15 = (var14 << 1) * var11;
            int var16 = 0;
            int var17 = var10[var16 + 0 + (var14 + 0) * var8];
            var10000 = var10[var16 + 0 + (var14 + 1) * var8];
            if (var5 == 0) {
               break;
            }

            int var18 = var10000;

            label52: {
               while (var16 < var8 - 1) {
                  this.drx((long)(var16 + var6 << 1), (long)(var14 + var7 << 1));
                  int var19 = var10[var16 + 1 + (var14 + 0) * var8];
                  int var20 = var10[var16 + 1 + (var14 + 1) * var8];
                  var13[var15] = var17;
                  var13[var15++ + var11] = this.c5u(var17, var18);
                  var13[var15] = this.c5u(var17, var19);
                  var13[var15++ + var11] = this.m6x(var17, var19, var18, var20);
                  var17 = var19;
                  var18 = var20;

                  try {
                     var16++;
                     if (var5 == 0) {
                        break label52;
                     }

                     if (var5 == 0) {
                        break;
                     }
                  } catch (oov var22) {
                     throw a(var22);
                  }
               }

               var14++;
            }

            if (var5 != 0) {
               continue;
            }
         }

         var10000 = var3 * var4;
         break;
      }

      int[] var23 = z97.web(var10000);
      int var25 = 0;

      while (true) {
         if (var25 < var4) {
            try {
               var27 = var13;
               if (var5 == 0) {
                  break;
               }

               System.arraycopy(var13, (var25 + (var2 & 1)) * var11 + (var1 & 1), var23, var25 * var3, var3);
               var25++;
               if (var5 != 0) {
                  continue;
               }
            } catch (oov var21) {
               throw a(var21);
            }
         }

         var27 = var23;
         break;
      }

      return var27;
   }

   public static ttt h3v(long var0, ttt var2, int var3) {
      Object var5 = var2;
      int var10000 = OpaquePredicate.b();
      int var6 = 0;
      int var4 = var10000;

      while (true) {
         if (var6 < var3) {
            var7 = new fwg(var0 + (long)var6, (ttt)var5);
            if (var4 == 0) {
               break;
            }

            var5 = var7;
            var6++;
            if (var4 != 0) {
               continue;
            }
         }

         var7 = var5;
         break;
      }

      return (ttt)var7;
   }

   public int c5u(int var1, int var2) {
      int var3 = OpaquePredicate.c();
      int var4 = this.nbt(2);

      try {
         if (var3 != 0) {
            return var4;
         }

         if (var4 == 0) {
            return var1;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return var2;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
