public class dul implements sdf {
   public dul(OpaquePredicate var1, mew var2) {
      this.qjs = var1;
      this.v1b = var2;
   }

   @Override
   public OpaquePredicate acz() {
      return this.qjs;
   }

   @Override
   public double tai() {
      return (double)this.v1b.getX() + 0.5;
   }

   @Override
   public double q_1() {
      return (double)this.v1b.getY() + 0.5;
   }

   @Override
   public double wgy() {
      return (double)this.v1b.getZ() + 0.5;
   }

   @Override
   public mew taq() {
      return this.v1b;
   }

   @Override
   public int lcq() {
      zfz var1 = this.qjs.getBlockState(this.v1b);
      return var1.r_y().hvp(var1);
   }

   @Override
   public pyk ztz() {
      return this.qjs.getTileEntity(this.v1b);
   }
}
