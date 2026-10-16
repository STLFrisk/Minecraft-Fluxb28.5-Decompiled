import java.util.Random;

public class _4n extends zfj$yuc {
   private final erg c0t;
   private float us0;
   private boolean q2w;

   public _4n(erg var1, int var2) {
      super(var2);
      this.c0t = var1;
   }

   public erg et4(Random var1) {
      int var2 = OpaquePredicate.c();
      erg var3 = this.c0t.yaq();

      int var10000;
      label63: {
         label67: {
            try {
               float var11;
               var10000 = (var11 = this.us0 - 0.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
               if (var2 != 0) {
                  break label63;
               }

               if (var10000 <= 0) {
                  break label67;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            int var4 = (int)(this.us0 * (float)this.c0t.mg5());
            int var5 = var3.mg5() - var1.nextInt(var1.nextInt(var4) + 1);

            label55: {
               label68: {
                  int var10001;
                  label53: {
                     label52: {
                        try {
                           var10000 = var5;
                           var10001 = var4;
                           if (var2 != 0) {
                              break label53;
                           }

                           if (var5 <= var4) {
                              break label52;
                           }
                        } catch (oov var8) {
                           throw a(var8);
                        }

                        var5 = var4;
                     }

                     try {
                        var10000 = var5;
                        if (var2 != 0) {
                           break label68;
                        }

                        var10001 = 1;
                     } catch (oov var7) {
                        throw a(var7);
                     }
                  }

                  if (var10000 >= var10001) {
                     break label55;
                  }

                  var10000 = 1;
               }

               var5 = var10000;
            }

            var3.awe(var5);
         }

         var10000 = this.q2w;
      }

      try {
         if (var10000 != 0) {
            hc0.xm8(var1, var3, 30);
         }

         return var3;
      } catch (oov var6) {
         throw a(var6);
      }
   }

   public _4n s1t(float var1) {
      this.us0 = var1;
      return this;
   }

   public _4n jkg() {
      this.q2w = true;
      return this;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
