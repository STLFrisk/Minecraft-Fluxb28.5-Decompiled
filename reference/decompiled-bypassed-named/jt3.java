public class jt3 {
   public fqr ugv;
   public float td0;
   public float gpa;

   public jt3(float var1, float var2, float var3, float var4, float var5) {
      this(new fqr((double)var1, (double)var2, (double)var3), var4, var5);
   }

   public jt3 rmw(float var1, float var2) {
      return new jt3(this, var1, var2);
   }

   public jt3(jt3 var1, float var2, float var3) {
      this.ugv = var1.ugv;
      this.td0 = var2;
      this.gpa = var3;
   }

   public jt3(fqr var1, float var2, float var3) {
      this.ugv = var1;
      this.td0 = var2;
      this.gpa = var3;
   }
}
