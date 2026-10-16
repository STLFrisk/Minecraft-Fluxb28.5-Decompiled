import java.awt.Color;
import java.io.Serializable;

public class b6n extends rkj implements Serializable {
   public static final long serialVersionUID = 8577680141580006740L;

   public b6n(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public b6n(float[] var1) {
      super(var1);
   }

   public b6n(b6n var1) {
      super(var1);
   }

   public b6n(rkj var1) {
      super(var1);
   }

   public b6n(xv0 var1) {
      super(var1);
   }

   public b6n(Color var1) {
      super((float)var1.getRed() / 255.0F, (float)var1.getGreen() / 255.0F, (float)var1.getBlue() / 255.0F, (float)var1.getAlpha() / 255.0F);
   }

   public b6n() {
   }

   public final void t0a(Color var1) {
      this.hp2 = (float)var1.getRed() / 255.0F;
      this.nc_ = (float)var1.getGreen() / 255.0F;
      this.ax5 = (float)var1.getBlue() / 255.0F;
      this.ck3 = (float)var1.getAlpha() / 255.0F;
   }

   public final Color p8q() {
      int var1 = Math.round(this.hp2 * 255.0F);
      int var2 = Math.round(this.nc_ * 255.0F);
      int var3 = Math.round(this.ax5 * 255.0F);
      int var4 = Math.round(this.ck3 * 255.0F);
      return new Color(var1, var2, var3, var4);
   }
}
