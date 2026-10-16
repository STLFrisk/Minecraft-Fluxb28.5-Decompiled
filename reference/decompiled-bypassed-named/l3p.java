import java.io.Serializable;

public class l3p extends ry6 implements Serializable {
   public static final long serialVersionUID = -7031930069184524614L;

   public l3p(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public l3p(float[] var1) {
      super(var1);
   }

   public l3p(l3p var1) {
      super(var1);
   }

   public l3p(qhn var1) {
      super(var1);
   }

   public l3p(ry6 var1) {
      super(var1);
   }

   public l3p(g5s var1) {
      super(var1);
   }

   public l3p() {
   }

   public final float l6d() {
      return this.yiu * this.yiu + this.q6o * this.q6o + this.n_d * this.n_d;
   }

   public final float t7d() {
      return (float)Math.sqrt((double)(this.yiu * this.yiu + this.q6o * this.q6o + this.n_d * this.n_d));
   }

   public final void xo8(l3p var1, l3p var2) {
      float var3 = var1.q6o * var2.n_d - var1.n_d * var2.q6o;
      float var4 = var2.yiu * var1.n_d - var2.n_d * var1.yiu;
      this.n_d = var1.yiu * var2.q6o - var1.q6o * var2.yiu;
      this.yiu = var3;
      this.q6o = var4;
   }

   public final float ho2(l3p var1) {
      return this.yiu * var1.yiu + this.q6o * var1.q6o + this.n_d * var1.n_d;
   }

   public final void ef9(l3p var1) {
      float var2 = (float)(1.0 / Math.sqrt((double)(var1.yiu * var1.yiu + var1.q6o * var1.q6o + var1.n_d * var1.n_d)));
      this.yiu = var1.yiu * var2;
      this.q6o = var1.q6o * var2;
      this.n_d = var1.n_d * var2;
   }

   public final void ynu() {
      float var1 = (float)(1.0 / Math.sqrt((double)(this.yiu * this.yiu + this.q6o * this.q6o + this.n_d * this.n_d)));
      this.yiu *= var1;
      this.q6o *= var1;
      this.n_d *= var1;
   }

   public final float lht(l3p var1) {
      int var2 = OpaquePredicate.c();
      double var3 = (double)(this.ho2(var1) / (this.t7d() * var1.t7d()));

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
