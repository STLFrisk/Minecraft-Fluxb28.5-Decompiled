public final class kop {
   public final mew pb1() {
      return this.qx1;
   }

   public final vt2 j85() {
      return this.i5t;
   }

   public final fqr d25() {
      return this.wy0;
   }

   public final void wnq(fqr var1) {
      this.wy0 = var1;
   }

   public kop(mew var1, vt2 var2, fqr var3) {
      this.qx1 = var1;
      this.i5t = var2;
      this.wy0 = var3;
   }

   public kop(mew var1, vt2 var2) {
      this(var1, var2, new fqr((double)var1.getX() + 0.5, (double)var1.getY() + 0.5, (double)var1.getZ() + 0.5));
   }

   public static kop jfx(mew var0) {
      int var1 = t9d.c();

      label101: {
         boolean var10000;
         label96: {
            try {
               var10000 = pt5.h0b(var0.ec4(0, -1, 0));
               if (var1 != 0) {
                  break label96;
               }

               if (var10000) {
                  break label101;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            var10000 = pt5.h0b(var0.ec4(0, 0, 1));
         }

         label102: {
            label86: {
               try {
                  if (var1 != 0) {
                     break label86;
                  }

                  if (var10000) {
                     break label102;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }

               var10000 = pt5.h0b(var0.ec4(-1, 0, 0));
            }

            label103: {
               label76: {
                  try {
                     if (var1 != 0) {
                        break label76;
                     }

                     if (var10000) {
                        break label103;
                     }
                  } catch (oov var7) {
                     throw a(var7);
                  }

                  var10000 = pt5.h0b(var0.ec4(0, 0, -1));
               }

               label107: {
                  label64: {
                     label63: {
                        try {
                           if (var1 != 0) {
                              break label63;
                           }

                           if (var10000) {
                              break label107;
                           }
                        } catch (oov var6) {
                           throw a(var6);
                        }

                        try {
                           var14 = var0.ec4(1, 0, 0);
                           if (var1 != 0) {
                              break label64;
                           }

                           var10000 = pt5.h0b(var14);
                        } catch (oov var5) {
                           throw a(var5);
                        }
                     }

                     try {
                        if (!var10000) {
                           return null;
                        }

                        var14 = var0.ec4(1, 0, 0);
                     } catch (oov var4) {
                        throw a(var4);
                     }
                  }

                  mew var13 = var14;
                  kop var2 = new kop(var13, vt2.te4);
                  if (var1 == 0) {
                     return var2;
                  }

                  return null;
               }

               mew var12 = var0.ec4(0, 0, -1);
               return new kop(var12, vt2.mxp);
            }

            mew var11 = var0.ec4(-1, 0, 0);
            return new kop(var11, vt2.zk4);
         }

         mew var10 = var0.ec4(0, 0, 1);
         return new kop(var10, vt2.z9q);
      }

      mew var3 = var0.ec4(0, -1, 0);
      return new kop(var3, vt2.rf3);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
