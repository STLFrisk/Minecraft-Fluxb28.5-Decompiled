import java.io.Serializable;

public class fna extends g5s implements Serializable {
   public static final long serialVersionUID = 5718062286069042927L;

   public fna(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public fna(double[] var1) {
      super(var1);
   }

   public fna(fna var1) {
      super(var1);
   }

   public fna(_r4 var1) {
      super(var1);
   }

   public fna(ry6 var1) {
      super(var1);
   }

   public fna(g5s var1) {
      super(var1);
   }

   public fna() {
   }

   public final double c46(fna var1) {
      double var2 = this.v54 - var1.v54;
      double var4 = this.g0w - var1.g0w;
      double var6 = this.mu9 - var1.mu9;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public final double gbk(fna var1) {
      double var2 = this.v54 - var1.v54;
      double var4 = this.g0w - var1.g0w;
      double var6 = this.mu9 - var1.mu9;
      return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public final double flv(fna var1) {
      return Math.abs(this.v54 - var1.v54) + Math.abs(this.g0w - var1.g0w) + Math.abs(this.mu9 - var1.mu9);
   }

   public final double zpr(fna var1) {
      double var2 = Math.max(Math.abs(this.v54 - var1.v54), Math.abs(this.g0w - var1.g0w));
      return Math.max(var2, Math.abs(this.mu9 - var1.mu9));
   }

   public final void _z9(dyx var1) {
      double var2 = 1.0 / var1.ggc;
      this.v54 = var1.yme * var2;
      this.g0w = var1.pf8 * var2;
      this.mu9 = var1.jfe * var2;
   }
}
