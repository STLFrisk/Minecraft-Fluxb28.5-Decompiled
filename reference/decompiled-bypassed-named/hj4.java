import java.io.Serializable;

public class hj4 extends rkj implements Serializable {
   public static final long serialVersionUID = 4643134103185764459L;

   public hj4(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public hj4(float[] var1) {
      super(var1);
   }

   public hj4(hj4 var1) {
      super(var1);
   }

   public hj4(dyx var1) {
      super(var1);
   }

   public hj4(rkj var1) {
      super(var1);
   }

   public hj4(xv0 var1) {
      super(var1);
   }

   public hj4(ry6 var1) {
      super(var1.yiu, var1.q6o, var1.n_d, 1.0F);
   }

   public hj4() {
   }

   public final void v9w(ry6 var1) {
      this.hp2 = var1.yiu;
      this.nc_ = var1.q6o;
      this.ax5 = var1.n_d;
      this.ck3 = 1.0F;
   }

   public final float eh4(hj4 var1) {
      float var2 = this.hp2 - var1.hp2;
      float var3 = this.nc_ - var1.nc_;
      float var4 = this.ax5 - var1.ax5;
      float var5 = this.ck3 - var1.ck3;
      return var2 * var2 + var3 * var3 + var4 * var4 + var5 * var5;
   }

   public final float zuf(hj4 var1) {
      float var2 = this.hp2 - var1.hp2;
      float var3 = this.nc_ - var1.nc_;
      float var4 = this.ax5 - var1.ax5;
      float var5 = this.ck3 - var1.ck3;
      return (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4 + var5 * var5));
   }

   public final float gpy(hj4 var1) {
      return Math.abs(this.hp2 - var1.hp2) + Math.abs(this.nc_ - var1.nc_) + Math.abs(this.ax5 - var1.ax5) + Math.abs(this.ck3 - var1.ck3);
   }

   public final float say(hj4 var1) {
      float var2 = Math.max(Math.abs(this.hp2 - var1.hp2), Math.abs(this.nc_ - var1.nc_));
      float var3 = Math.max(Math.abs(this.ax5 - var1.ax5), Math.abs(this.ck3 - var1.ck3));
      return Math.max(var2, var3);
   }

   public final void nnh(hj4 var1) {
      float var2 = 1.0F / var1.ck3;
      this.hp2 = var1.hp2 * var2;
      this.nc_ = var1.nc_ * var2;
      this.ax5 = var1.ax5 * var2;
      this.ck3 = 1.0F;
   }
}
