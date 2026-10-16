public class who {
   public who(double var1, double var3, double var5) {
      this.p0r = var1;
      this.nh_ = var3;
      this.xnz = var5;
   }

   public double ovf() {
      return this.p0r;
   }

   public double xnw() {
      return this.nh_;
   }

   public double b9g() {
      return this.xnz;
   }

   public who da3(double var1, double var3, double var5) {
      return new who(this.p0r + var1, this.nh_ + var3, this.xnz + var5);
   }

   public who szb() {
      return new who(Math.floor(this.p0r), Math.floor(this.nh_), Math.floor(this.xnz));
   }

   public double __r(who var1) {
      return Math.pow(var1.p0r - this.p0r, 2.0) + Math.pow(var1.nh_ - this.nh_, 2.0) + Math.pow(var1.xnz - this.xnz, 2.0);
   }

   public who wjt(who var1) {
      return this.da3(var1.ovf(), var1.xnw(), var1.b9g());
   }

   public fqr j1q() {
      return new fqr(this.p0r, this.nh_, this.xnz);
   }

   @Override
   public String toString() {
      return "[" + this.p0r + ";" + this.nh_ + ";" + this.xnz + "]";
   }
}
