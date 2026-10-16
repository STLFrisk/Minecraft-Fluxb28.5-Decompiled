import java.awt.Color;
import java.io.Serializable;

public class y6y extends ry6 implements Serializable {
   public static final long serialVersionUID = -1861792981817493659L;

   public y6y(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public y6y(float[] var1) {
      super(var1);
   }

   public y6y(y6y var1) {
      super(var1);
   }

   public y6y(ry6 var1) {
      super(var1);
   }

   public y6y(g5s var1) {
      super(var1);
   }

   public y6y(Color var1) {
      super((float)var1.getRed() / 255.0F, (float)var1.getGreen() / 255.0F, (float)var1.getBlue() / 255.0F);
   }

   public y6y() {
   }

   public final void b74(Color var1) {
      this.yiu = (float)var1.getRed() / 255.0F;
      this.q6o = (float)var1.getGreen() / 255.0F;
      this.n_d = (float)var1.getBlue() / 255.0F;
   }

   public final Color qp2() {
      int var1 = Math.round(this.yiu * 255.0F);
      int var2 = Math.round(this.q6o * 255.0F);
      int var3 = Math.round(this.n_d * 255.0F);
      return new Color(var1, var2, var3);
   }
}
