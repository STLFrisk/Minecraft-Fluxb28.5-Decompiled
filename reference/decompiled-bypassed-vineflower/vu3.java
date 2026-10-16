public class vu3 extends g6r {
   public tf8 e0v = new tf8(this, 0, 0).swi(64, 64);
   public tf8 fpo;
   public tf8 pah;

   public vu3() {
      this.e0v.q3x(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
      this.e0v._ki = 1.0F;
      this.e0v.ca7 = 7.0F;
      this.e0v.kit = 15.0F;
      this.pah = new tf8(this, 0, 0).swi(64, 64);
      this.pah.q3x(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
      this.pah._ki = 8.0F;
      this.pah.ca7 = 7.0F;
      this.pah.kit = 15.0F;
      this.fpo = new tf8(this, 0, 19).swi(64, 64);
      this.fpo.q3x(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
      this.fpo._ki = 1.0F;
      this.fpo.ca7 = 6.0F;
      this.fpo.kit = 1.0F;
   }

   public void znj() {
      this.pah.pod = this.e0v.pod;
      this.e0v.vca(0.0625F);
      this.pah.vca(0.0625F);
      this.fpo.vca(0.0625F);
   }
}
