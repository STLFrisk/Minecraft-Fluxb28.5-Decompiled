public class ue5 {
   public ue5(double var1, double var3, double var5) {
      this.fzm = var1;
      this.c0t = var3;
      this.cav = var5;
   }

   public double h25() {
      return this.fzm;
   }

   public double mji() {
      return this.c0t;
   }

   public double va0() {
      return this.cav;
   }

   public ue5 cdr(double var1, double var3, double var5) {
      return new ue5(this.fzm + var1, this.c0t + var3, this.cav + var5);
   }

   public ue5 opx() {
      return new ue5(Math.floor(this.fzm), Math.floor(this.c0t), Math.floor(this.cav));
   }

   public double glf(ue5 var1) {
      return Math.pow(var1.fzm - this.fzm, 2.0) + Math.pow(var1.c0t - this.c0t, 2.0) + Math.pow(var1.cav - this.cav, 2.0);
   }

   public ue5 chp(ue5 var1) {
      return this.cdr(var1.h25(), var1.mji(), var1.va0());
   }

   public fqr ptb() {
      return new fqr(this.fzm, this.c0t, this.cav);
   }

   @Override
   public String toString() {
      return "[" + this.fzm + ";" + this.c0t + ";" + this.cav + "]";
   }
}
