import java.io.Serializable;

public class dyx extends xv0 implements Serializable {
   public static final long serialVersionUID = 1733471895962736949L;

   public dyx(double var1, double var3, double var5, double var7) {
      super(var1, var3, var5, var7);
   }

   public dyx(double[] var1) {
      super(var1);
   }

   public dyx(dyx var1) {
      super(var1);
   }

   public dyx(hj4 var1) {
      super(var1);
   }

   public dyx(rkj var1) {
      super(var1);
   }

   public dyx(xv0 var1) {
      super(var1);
   }

   public dyx(g5s var1) {
      super(var1.v54, var1.g0w, var1.mu9, 1.0);
   }

   public dyx() {
   }

   public final void j06(g5s var1) {
      this.yme = var1.v54;
      this.pf8 = var1.g0w;
      this.jfe = var1.mu9;
      this.ggc = 1.0;
   }

   public final double jou(dyx var1) {
      double var2 = this.yme - var1.yme;
      double var4 = this.pf8 - var1.pf8;
      double var6 = this.jfe - var1.jfe;
      double var8 = this.ggc - var1.ggc;
      return var2 * var2 + var4 * var4 + var6 * var6 + var8 * var8;
   }

   public final double oh1(dyx var1) {
      double var2 = this.yme - var1.yme;
      double var4 = this.pf8 - var1.pf8;
      double var6 = this.jfe - var1.jfe;
      double var8 = this.ggc - var1.ggc;
      return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6 + var8 * var8);
   }

   public final double m_p(dyx var1) {
      return Math.abs(this.yme - var1.yme) + Math.abs(this.pf8 - var1.pf8) + Math.abs(this.jfe - var1.jfe) + Math.abs(this.ggc - var1.ggc);
   }

   public final double w_v(dyx var1) {
      double var2 = Math.max(Math.abs(this.yme - var1.yme), Math.abs(this.pf8 - var1.pf8));
      double var4 = Math.max(Math.abs(this.jfe - var1.jfe), Math.abs(this.ggc - var1.ggc));
      return Math.max(var2, var4);
   }

   public final void aph(dyx var1) {
      double var2 = 1.0 / var1.ggc;
      this.yme = var1.yme * var2;
      this.pf8 = var1.pf8 * var2;
      this.jfe = var1.jfe * var2;
      this.ggc = 1.0;
   }
}
