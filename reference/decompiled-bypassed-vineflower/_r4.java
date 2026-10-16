import java.io.Serializable;

public class _r4 extends ry6 implements Serializable {
   public static final long serialVersionUID = -8689337816398030143L;

   public _r4(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public _r4(float[] var1) {
      super(var1);
   }

   public _r4(_r4 var1) {
      super(var1);
   }

   public _r4(fna var1) {
      super(var1);
   }

   public _r4(ry6 var1) {
      super(var1);
   }

   public _r4(g5s var1) {
      super(var1);
   }

   public _r4() {
   }

   public final float w3j(_r4 var1) {
      float var2 = this.yiu - var1.yiu;
      float var3 = this.q6o - var1.q6o;
      float var4 = this.n_d - var1.n_d;
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public final float xv0(_r4 var1) {
      float var2 = this.yiu - var1.yiu;
      float var3 = this.q6o - var1.q6o;
      float var4 = this.n_d - var1.n_d;
      return (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
   }

   public final float _3t(_r4 var1) {
      return Math.abs(this.yiu - var1.yiu) + Math.abs(this.q6o - var1.q6o) + Math.abs(this.n_d - var1.n_d);
   }

   public final float kl3(_r4 var1) {
      float var2 = Math.max(Math.abs(this.yiu - var1.yiu), Math.abs(this.q6o - var1.q6o));
      return Math.max(var2, Math.abs(this.n_d - var1.n_d));
   }

   public final void s8n(hj4 var1) {
      float var2 = 1.0F / var1.ck3;
      this.yiu = var1.hp2 * var2;
      this.q6o = var1.nc_ * var2;
      this.n_d = var1.ax5 * var2;
   }
}
