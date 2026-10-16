import java.io.Serializable;

public class v71 extends xv0 implements Serializable {
   public static final long serialVersionUID = 3938123424117448700L;

   public v71(double var1, double var3, double var5, double var7) {
      super(var1, var3, var5, var7);
   }

   public v71(double[] var1) {
      super(var1);
   }

   public v71(v71 var1) {
      super(var1);
   }

   public v71(_e6 var1) {
      super(var1);
   }

   public v71(rkj var1) {
      super(var1);
   }

   public v71(xv0 var1) {
      super(var1);
   }

   public v71(g5s var1) {
      super(var1.v54, var1.g0w, var1.mu9, 0.0);
   }

   public v71() {
   }

   public final void i77(g5s var1) {
      this.yme = var1.v54;
      this.pf8 = var1.g0w;
      this.jfe = var1.mu9;
      this.ggc = 0.0;
   }

   public final double wg8() {
      return Math.sqrt(this.yme * this.yme + this.pf8 * this.pf8 + this.jfe * this.jfe + this.ggc * this.ggc);
   }

   public final double wg1() {
      return this.yme * this.yme + this.pf8 * this.pf8 + this.jfe * this.jfe + this.ggc * this.ggc;
   }

   public final double q2s(v71 var1) {
      return this.yme * var1.yme + this.pf8 * var1.pf8 + this.jfe * var1.jfe + this.ggc * var1.ggc;
   }

   public final void tun(v71 var1) {
      double var2 = 1.0 / Math.sqrt(var1.yme * var1.yme + var1.pf8 * var1.pf8 + var1.jfe * var1.jfe + var1.ggc * var1.ggc);
      this.yme = var1.yme * var2;
      this.pf8 = var1.pf8 * var2;
      this.jfe = var1.jfe * var2;
      this.ggc = var1.ggc * var2;
   }

   public final void spw() {
      double var1 = 1.0 / Math.sqrt(this.yme * this.yme + this.pf8 * this.pf8 + this.jfe * this.jfe + this.ggc * this.ggc);
      this.yme *= var1;
      this.pf8 *= var1;
      this.jfe *= var1;
      this.ggc *= var1;
   }

   public final double lba(v71 var1) {
      int var2 = OpaquePredicate.c();
      double var3 = this.q2s(var1) / (this.wg8() * var1.wg8());

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
