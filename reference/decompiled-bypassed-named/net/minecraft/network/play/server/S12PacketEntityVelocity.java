package net.minecraft.network.play.server;

public class S12PacketEntityVelocity implements mz2 {
   public S12PacketEntityVelocity() {
   }

   public S12PacketEntityVelocity(EntityLivingBase var1) {
      this(var1.jwu(), var1.icv, var1.mop, var1.bw4);
   }

   public S12PacketEntityVelocity(int var1, double var2, double var4, double var6) {
      String var10000 = S14PacketEntity.b();
      this._o0 = var1;
      String var8 = var10000;
      double var9 = 3.9;

      label101: {
         label100: {
            try {
               double var19;
               var17 = (var19 = var2 - -var9) == 0.0 ? 0 : (var19 < 0.0 ? -1 : 1);
               if (var8 == null) {
                  break label101;
               }

               if (var17 >= 0) {
                  break label100;
               }
            } catch (oov var16) {
               throw a(var16);
            }

            var2 = -var9;
         }

         double var20;
         var17 = (var20 = var4 - -var9) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1);
      }

      label92: {
         label91: {
            try {
               if (var8 == null) {
                  break label92;
               }

               if (var17 >= 0) {
                  break label91;
               }
            } catch (oov var15) {
               throw a(var15);
            }

            var4 = -var9;
         }

         double var21;
         var17 = (var21 = var6 - -var9) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
      }

      label83: {
         label82: {
            try {
               if (var8 == null) {
                  break label83;
               }

               if (var17 >= 0) {
                  break label82;
               }
            } catch (oov var14) {
               throw a(var14);
            }

            var6 = -var9;
         }

         double var22;
         var17 = (var22 = var2 - var9) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1);
      }

      label74: {
         label73: {
            try {
               if (var8 == null) {
                  break label74;
               }

               if (var17 <= 0) {
                  break label73;
               }
            } catch (oov var13) {
               throw a(var13);
            }

            var2 = var9;
         }

         double var23;
         var17 = (var23 = var4 - var9) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
      }

      label65: {
         label105: {
            label63: {
               label62: {
                  try {
                     if (var8 == null) {
                        break label63;
                     }

                     if (var17 <= 0) {
                        break label62;
                     }
                  } catch (oov var12) {
                     throw a(var12);
                  }

                  var4 = var9;
               }

               try {
                  var18 = var6;
                  if (var8 == null) {
                     break label105;
                  }

                  double var24;
                  var17 = (var24 = var6 - var9) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
               } catch (oov var11) {
                  throw a(var11);
               }
            }

            if (var17 <= 0) {
               break label65;
            }

            var18 = var9;
         }

         var6 = var18;
      }

      this.yk2 = (int)(var2 * 8000.0);
      this.fj8 = (int)(var4 * 8000.0);
      this.fwv = (int)(var6 * 8000.0);
   }

   @Override
   public void ajj(nfj var1) {
      this._o0 = var1.gux();
      this.yk2 = var1.readShort();
      this.fj8 = var1.readShort();
      this.fwv = var1.readShort();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this._o0);
      var1.writeShort(this.yk2);
      var1.writeShort(this.fj8);
      var1.writeShort(this.fwv);
   }

   public void EventBus(jsv var1) {
      var1.uia(this);
   }

   public int ybp() {
      return this._o0;
   }

   public int ywv() {
      return this.yk2;
   }

   public int hi3() {
      return this.fj8;
   }

   public int al8() {
      return this.fwv;
   }

   public void wzr(int var1) {
      this.yk2 = var1;
   }

   public void r6p(int var1) {
      this.fj8 = var1;
   }

   public void f5v(int var1) {
      this.fwv = var1;
   }

   @Override
   public void ito(yw3 var1) {
      this.mtl((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
