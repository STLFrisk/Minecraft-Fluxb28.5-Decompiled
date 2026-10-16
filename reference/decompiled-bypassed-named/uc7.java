import java.io.Serializable;

public class uc7 extends mdx implements Serializable {
   public static final long serialVersionUID = -4801347926528714435L;

   public uc7(float var1, float var2) {
      super(var1, var2);
   }

   public uc7(float[] var1) {
      super(var1);
   }

   public uc7(uc7 var1) {
      super(var1);
   }

   public uc7(iy9 var1) {
      super(var1);
   }

   public uc7(jwg var1) {
      super(var1);
   }

   public uc7(mdx var1) {
      super(var1);
   }

   public uc7() {
   }

   public final float od_(uc7 var1) {
      float var2 = this.n7d - var1.n7d;
      float var3 = this.wfr - var1.wfr;
      return var2 * var2 + var3 * var3;
   }

   public final float u_4(uc7 var1) {
      float var2 = this.n7d - var1.n7d;
      float var3 = this.wfr - var1.wfr;
      return (float)Math.sqrt((double)(var2 * var2 + var3 * var3));
   }

   public final float u60(uc7 var1) {
      return Math.abs(this.n7d - var1.n7d) + Math.abs(this.wfr - var1.wfr);
   }

   public final float lj6(uc7 var1) {
      return Math.max(Math.abs(this.n7d - var1.n7d), Math.abs(this.wfr - var1.wfr));
   }
}
