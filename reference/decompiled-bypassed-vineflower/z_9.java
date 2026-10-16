public class z_9 {
   public w6v sqb(mew var1) {
      int var2 = t9d.c();

      label98: {
         boolean var10000;
         label93: {
            try {
               var10000 = w6v.wa8(var1.ec4(0, -1, 0));
               if (var2 != 0) {
                  break label93;
               }

               if (var10000) {
                  break label98;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            var10000 = w6v.wa8(var1.ec4(0, 0, 1));
         }

         label99: {
            label83: {
               try {
                  if (var2 != 0) {
                     break label83;
                  }

                  if (var10000) {
                     break label99;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }

               var10000 = w6v.wa8(var1.ec4(-1, 0, 0));
            }

            label100: {
               label73: {
                  try {
                     if (var2 != 0) {
                        break label73;
                     }

                     if (var10000) {
                        break label100;
                     }
                  } catch (oov var7) {
                     throw a(var7);
                  }

                  var10000 = w6v.wa8(var1.ec4(0, 0, -1));
               }

               label64: {
                  label101: {
                     label62: {
                        try {
                           if (var2 != 0) {
                              break label62;
                           }

                           if (var10000) {
                              break label64;
                           }
                        } catch (oov var6) {
                           throw a(var6);
                        }

                        try {
                           var14 = var1.ec4(1, 0, 0);
                           if (var2 != 0) {
                              break label101;
                           }

                           var10000 = w6v.wa8(var14);
                        } catch (oov var4) {
                           throw a(var4);
                        }
                     }

                     try {
                        if (var10000) {
                           var14 = var1.ec4(1, 0, 0);
                           break label101;
                        }
                     } catch (oov var5) {
                        throw a(var5);
                     }

                     return null;
                  }

                  mew var13 = var14;
                  return new w6v(var13, vt2.te4, null, 4);
               }

               mew var12 = var1.ec4(0, 0, -1);
               return new w6v(var12, vt2.mxp, null, 4);
            }

            mew var11 = var1.ec4(-1, 0, 0);
            return new w6v(var11, vt2.zk4, null, 4);
         }

         mew var10 = var1.ec4(0, 0, 1);
         return new w6v(var10, vt2.z9q, null, 4);
      }

      mew var3 = var1.ec4(0, -1, 0);
      return new w6v(var3, vt2.rf3, null, 4);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
