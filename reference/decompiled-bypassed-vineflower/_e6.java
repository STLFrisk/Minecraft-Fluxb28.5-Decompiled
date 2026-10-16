import java.io.Serializable;

public class _e6 extends rkj implements Serializable {
   public static final long serialVersionUID = 8749319902347760659L;

   public _e6(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public _e6(float[] var1) {
      super(var1);
   }

   public _e6(_e6 var1) {
      super(var1);
   }

   public _e6(v71 var1) {
      super(var1);
   }

   public _e6(rkj var1) {
      super(var1);
   }

   public _e6(xv0 var1) {
      super(var1);
   }

   public _e6(ry6 var1) {
      super(var1.yiu, var1.q6o, var1.n_d, 0.0F);
   }

   public _e6() {
   }

   public final void hsi(ry6 var1) {
      this.hp2 = var1.yiu;
      this.nc_ = var1.q6o;
      this.ax5 = var1.n_d;
      this.ck3 = 0.0F;
   }

   public final float ts6() {
      return (float)Math.sqrt((double)(this.hp2 * this.hp2 + this.nc_ * this.nc_ + this.ax5 * this.ax5 + this.ck3 * this.ck3));
   }

   public final float kf3() {
      return this.hp2 * this.hp2 + this.nc_ * this.nc_ + this.ax5 * this.ax5 + this.ck3 * this.ck3;
   }

   public final float g5m(_e6 var1) {
      return this.hp2 * var1.hp2 + this.nc_ * var1.nc_ + this.ax5 * var1.ax5 + this.ck3 * var1.ck3;
   }

   public final void vzj(_e6 var1) {
      float var2 = (float)(1.0 / Math.sqrt((double)(var1.hp2 * var1.hp2 + var1.nc_ * var1.nc_ + var1.ax5 * var1.ax5 + var1.ck3 * var1.ck3)));
      this.hp2 = var1.hp2 * var2;
      this.nc_ = var1.nc_ * var2;
      this.ax5 = var1.ax5 * var2;
      this.ck3 = var1.ck3 * var2;
   }

   public final void g2i() {
      float var1 = (float)(1.0 / Math.sqrt((double)(this.hp2 * this.hp2 + this.nc_ * this.nc_ + this.ax5 * this.ax5 + this.ck3 * this.ck3)));
      this.hp2 *= var1;
      this.nc_ *= var1;
      this.ax5 *= var1;
      this.ck3 *= var1;
   }

   public final float _cj(_e6 var1) {
      int var2 = t9d.c();
      double var3 = (double)(this.g5m(var1) / (this.ts6() * var1.ts6()));

      int var10000;
      label34: {
         label33: {
            try {
               double var8;
               var10000 = (var8 = var3 - -1.0) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
               if (var2 != 0) {
                  break label34;
               }

               if (var10000 >= 0) {
                  break label33;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var3 = -1.0;
         }

         try {
            if (var2 != 0) {
               return (float)var3;
            }

            double var9;
            var10000 = (var9 = var3 - 1.0) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
         } catch (oov var5) {
            throw a(var5);
         }
      }

      if (var10000 > 0) {
         var3 = 1.0;
      }

      return (float)Math.acos(var3);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
