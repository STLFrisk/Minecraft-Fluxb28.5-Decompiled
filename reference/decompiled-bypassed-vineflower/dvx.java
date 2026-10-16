import java.io.Serializable;

public class dvx extends mdx implements Serializable {
   public static final long serialVersionUID = -2168194326883512320L;

   public dvx(float var1, float var2) {
      super(var1, var2);
   }

   public dvx(float[] var1) {
      super(var1);
   }

   public dvx(dvx var1) {
      super(var1);
   }

   public dvx(ck4 var1) {
      super(var1);
   }

   public dvx(mdx var1) {
      super(var1);
   }

   public dvx(jwg var1) {
      super(var1);
   }

   public dvx() {
   }

   public final float nv7(dvx var1) {
      return this.n7d * var1.n7d + this.wfr * var1.wfr;
   }

   public final float lv4() {
      return (float)Math.sqrt((double)(this.n7d * this.n7d + this.wfr * this.wfr));
   }

   public final float sba() {
      return this.n7d * this.n7d + this.wfr * this.wfr;
   }

   public final void ntp(dvx var1) {
      float var2 = (float)(1.0 / Math.sqrt((double)(var1.n7d * var1.n7d + var1.wfr * var1.wfr)));
      this.n7d = var1.n7d * var2;
      this.wfr = var1.wfr * var2;
   }

   public final void x6k() {
      float var1 = (float)(1.0 / Math.sqrt((double)(this.n7d * this.n7d + this.wfr * this.wfr)));
      this.n7d *= var1;
      this.wfr *= var1;
   }

   public final float _4f(dvx var1) {
      int var2 = t9d.c();
      double var3 = (double)(this.nv7(var1) / (this.lv4() * var1.lv4()));

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
