import java.util.Arrays;

public class c8u extends oa4 {
   private final sla s1l;

   public c8u(oa4 var1, sla var2) {
      super(Arrays.copyOf(var1.fnb(), var1.fnb().length), var1.hvb, atg.g9d(var1.fnb()));
      this.s1l = var2;
      this.kw_();
      this.hmg();
   }

   private void kw_() {
      int var1 = OpaquePredicate.b();
      int var2 = 0;

      while (var2 < 4) {
         this.bcj(var2);
         var2++;
         if (var1 == 0) {
            break;
         }
      }
   }

   private void bcj(int var1) {
      int var3 = this.osu.length / 4;
      int var10000 = OpaquePredicate.b();
      int var4 = var3 * var1;
      float var5 = Float.intBitsToFloat(this.osu[var4]);
      float var6 = Float.intBitsToFloat(this.osu[var4 + 1]);
      float var7 = Float.intBitsToFloat(this.osu[var4 + 2]);
      float var8 = 0.0F;
      int var2 = var10000;
      float var9 = 0.0F;

      int var10001;
      label48: {
         label47: {
            label46: {
               label45: {
                  label44: {
                     label43: {
                        label42: {
                           try {
                              var11 = c8u$1.t_v;
                              var10001 = this.iqa.ordinal();
                              if (var2 == 0) {
                                 break label48;
                              }

                              switch (var11[var10001]) {
                                 case 1:
                                    break;
                                 case 2:
                                    break label42;
                                 case 3:
                                    break label43;
                                 case 4:
                                    break label44;
                                 case 5:
                                    break label45;
                                 case 6:
                                    break label46;
                                 default:
                                    break label47;
                              }
                           } catch (oov var10) {
                              throw a(var10);
                           }

                           var8 = var5 * 16.0F;
                           var9 = (1.0F - var7) * 16.0F;
                           if (var2 != 0) {
                              break label47;
                           }
                        }

                        var8 = var5 * 16.0F;
                        var9 = var7 * 16.0F;
                        if (var2 != 0) {
                           break label47;
                        }
                     }

                     var8 = (1.0F - var5) * 16.0F;
                     var9 = (1.0F - var6) * 16.0F;
                     if (var2 != 0) {
                        break label47;
                     }
                  }

                  var8 = var5 * 16.0F;
                  var9 = (1.0F - var6) * 16.0F;
                  if (var2 != 0) {
                     break label47;
                  }
               }

               var8 = var7 * 16.0F;
               var9 = (1.0F - var6) * 16.0F;
               if (var2 != 0) {
                  break label47;
               }
            }

            var8 = (1.0F - var7) * 16.0F;
            var9 = (1.0F - var6) * 16.0F;
         }

         this.osu[var4 + 4] = Float.floatToRawIntBits(this.s1l.oon((double)var8));
         var11 = this.osu;
         var10001 = var4 + 4 + 1;
      }

      var11[var10001] = Float.floatToRawIntBits(this.s1l.h0c((double)var9));
   }

   private static oov a(oov var0) {
      return var0;
   }
}
