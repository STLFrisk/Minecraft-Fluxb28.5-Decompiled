import java.io.Serializable;

public class ck4 extends jwg implements Serializable {
   public static final long serialVersionUID = 8572646365302599857L;

   public ck4(double var1, double var3) {
      super(var1, var3);
   }

   public ck4(double[] var1) {
      super(var1);
   }

   public ck4(ck4 var1) {
      super(var1);
   }

   public ck4(dvx var1) {
      super(var1);
   }

   public ck4(jwg var1) {
      super(var1);
   }

   public ck4(mdx var1) {
      super(var1);
   }

   public ck4() {
   }

   public final double su_(ck4 var1) {
      return this.q8a * var1.q8a + this.pfp * var1.pfp;
   }

   public final double jj6() {
      return Math.sqrt(this.q8a * this.q8a + this.pfp * this.pfp);
   }

   public final double w16() {
      return this.q8a * this.q8a + this.pfp * this.pfp;
   }

   public final void jq6(ck4 var1) {
      double var2 = 1.0 / Math.sqrt(var1.q8a * var1.q8a + var1.pfp * var1.pfp);
      this.q8a = var1.q8a * var2;
      this.pfp = var1.pfp * var2;
   }

   public final void bvc() {
      double var1 = 1.0 / Math.sqrt(this.q8a * this.q8a + this.pfp * this.pfp);
      this.q8a *= var1;
      this.pfp *= var1;
   }

   public final double k7x(ck4 var1) {
      int var2 = t9d.c();
      double var3 = this.su_(var1) / (this.jj6() * var1.jj6());

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
