import java.io.Serializable;

public class qhn extends g5s implements Serializable {
   public static final long serialVersionUID = 3761969948420550442L;

   public qhn(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public qhn(double[] var1) {
      super(var1);
   }

   public qhn(qhn var1) {
      super(var1);
   }

   public qhn(l3p var1) {
      super(var1);
   }

   public qhn(ry6 var1) {
      super(var1);
   }

   public qhn(g5s var1) {
      super(var1);
   }

   public qhn() {
   }

   public final void ovn(qhn var1, qhn var2) {
      double var3 = var1.g0w * var2.mu9 - var1.mu9 * var2.g0w;
      double var5 = var2.v54 * var1.mu9 - var2.mu9 * var1.v54;
      this.mu9 = var1.v54 * var2.g0w - var1.g0w * var2.v54;
      this.v54 = var3;
      this.g0w = var5;
   }

   public final void vf1(qhn var1) {
      double var2 = 1.0 / Math.sqrt(var1.v54 * var1.v54 + var1.g0w * var1.g0w + var1.mu9 * var1.mu9);
      this.v54 = var1.v54 * var2;
      this.g0w = var1.g0w * var2;
      this.mu9 = var1.mu9 * var2;
   }

   public final void _8j() {
      double var1 = 1.0 / Math.sqrt(this.v54 * this.v54 + this.g0w * this.g0w + this.mu9 * this.mu9);
      this.v54 *= var1;
      this.g0w *= var1;
      this.mu9 *= var1;
   }

   public final double ruv(qhn var1) {
      return this.v54 * var1.v54 + this.g0w * var1.g0w + this.mu9 * var1.mu9;
   }

   public final double rcp() {
      return this.v54 * this.v54 + this.g0w * this.g0w + this.mu9 * this.mu9;
   }

   public final double mq8() {
      return Math.sqrt(this.v54 * this.v54 + this.g0w * this.g0w + this.mu9 * this.mu9);
   }

   public final double vgg(qhn var1) {
      int var2 = OpaquePredicate.b();
      double var3 = this.ruv(var1) / (this.mq8() * var1.mq8());

      int var10000;
      label34: {
         label33: {
            try {
               double var8;
               var10000 = (var8 = var3 - -1.0) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
               if (var2 == 0) {
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
            if (var2 == 0) {
               return var3;
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

      return Math.acos(var3);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
