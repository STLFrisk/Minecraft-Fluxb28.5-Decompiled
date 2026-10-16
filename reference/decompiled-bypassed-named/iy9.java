import java.io.Serializable;

public class iy9 extends jwg implements Serializable {
   public static final long serialVersionUID = 1133748791492571954L;

   public iy9(double var1, double var3) {
      super(var1, var3);
   }

   public iy9(double[] var1) {
      super(var1);
   }

   public iy9(iy9 var1) {
      super(var1);
   }

   public iy9(uc7 var1) {
      super(var1);
   }

   public iy9(jwg var1) {
      super(var1);
   }

   public iy9(mdx var1) {
      super(var1);
   }

   public iy9() {
   }

   public final double xo4(iy9 var1) {
      double var2 = this.q8a - var1.q8a;
      double var4 = this.pfp - var1.pfp;
      return var2 * var2 + var4 * var4;
   }

   public final double xz2(iy9 var1) {
      double var2 = this.q8a - var1.q8a;
      double var4 = this.pfp - var1.pfp;
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   public final double ofs(iy9 var1) {
      return Math.abs(this.q8a - var1.q8a) + Math.abs(this.pfp - var1.pfp);
   }

   public final double d3f(iy9 var1) {
      return Math.max(Math.abs(this.q8a - var1.q8a), Math.abs(this.pfp - var1.pfp));
   }
}
