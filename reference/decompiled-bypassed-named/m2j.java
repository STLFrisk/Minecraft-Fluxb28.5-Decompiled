public class m2j {
   public m2j(double var1, double var3, double var5, float var7, float var8) {
      this.uio = var1;
      this.gvb = var3;
      this.k7d = var5;
      this.qh5 = var7;
      this.d6n = var8;
   }

   public m2j(double var1, double var3, double var5) {
      this.uio = var1;
      this.gvb = var3;
      this.k7d = var5;
      this.qh5 = 0.0F;
      this.d6n = 0.0F;
   }

   public m2j(mew var1) {
      this.uio = (double)var1.getX();
      this.gvb = (double)var1.getY();
      this.k7d = (double)var1.getZ();
      this.qh5 = 0.0F;
      this.d6n = 0.0F;
   }

   public m2j(Entity var1) {
      this.uio = var1.o2v;
      this.gvb = var1.kfp;
      this.k7d = var1.vbd;
      this.qh5 = 0.0F;
      this.d6n = 0.0F;
   }

   public m2j(int var1, int var2, int var3) {
      this.uio = (double)var1;
      this.gvb = (double)var2;
      this.k7d = (double)var3;
      this.qh5 = 0.0F;
      this.d6n = 0.0F;
   }

   public m2j csd(int var1, int var2, int var3) {
      this.uio += (double)var1;
      this.gvb += (double)var2;
      this.k7d += (double)var3;
      return this;
   }

   public m2j re2(double var1, double var3, double var5) {
      this.uio += var1;
      this.gvb += var3;
      this.k7d += var5;
      return this;
   }

   public m2j ihh(int var1, int var2, int var3) {
      this.uio -= (double)var1;
      this.gvb -= (double)var2;
      this.k7d -= (double)var3;
      return this;
   }

   public m2j wt7(double var1, double var3, double var5) {
      this.uio -= var1;
      this.gvb -= var3;
      this.k7d -= var5;
      return this;
   }

   public e0x h30() {
      return Minecraft.vz1().tij.getBlockState(this.qsz()).r_y();
   }

   public double yeo() {
      return this.uio;
   }

   public m2j jj5(double var1) {
      this.uio = var1;
      return this;
   }

   public double o41() {
      return this.gvb;
   }

   public m2j k5c(double var1) {
      this.gvb = var1;
      return this;
   }

   public double bnl() {
      return this.k7d;
   }

   public m2j gq1(double var1) {
      this.k7d = var1;
      return this;
   }

   public float igy() {
      return this.qh5;
   }

   public m2j m6k(float var1) {
      this.qh5 = var1;
      return this;
   }

   public float v0p() {
      return this.d6n;
   }

   public m2j jsc(float var1) {
      this.d6n = var1;
      return this;
   }

   public static m2j ojp(mew var0) {
      return new m2j(var0.getX(), var0.getY(), var0.getZ());
   }

   public mew qsz() {
      return new mew(this.yeo(), this.o41(), this.bnl());
   }

   public double lk2(m2j var1) {
      double var2 = var1.uio - this.uio;
      double var4 = var1.k7d - this.k7d;
      double var6 = var1.gvb - this.gvb;
      return Math.sqrt(var2 * var2 + var6 * var6 + var4 * var4);
   }

   public double w9e(m2j var1) {
      double var2 = var1.uio - this.uio;
      double var4 = var1.k7d - this.k7d;
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   public double dez(m2j var1) {
      double var2 = var1.gvb - this.gvb;
      return Math.sqrt(var2 * var2);
   }

   public fqr du3() {
      return new fqr(this.uio, this.gvb, this.k7d);
   }
}
