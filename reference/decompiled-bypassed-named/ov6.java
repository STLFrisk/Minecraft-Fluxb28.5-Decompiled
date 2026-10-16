public class ov6 extends cjm {
   public ov6(yqv var1) {
      this.drt = var1;
      this.k23(3);
   }

   @Override
   public boolean vle() {
      int var1 = OpaquePredicate.b();

      try {
         float var3;
         int var10000 = (var3 = this.drt.mbr().nextFloat() - 0.02F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1);
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   @Override
   public boolean wh3() {
      int var1 = OpaquePredicate.c();

      try {
         if (var1 != 0) {
            return (boolean)this.dqp;
         }

         if (this.dqp >= 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   @Override
   public void mnp() {
      double var1 = (Math.PI * 2) * this.drt.mbr().nextDouble();
      this.un_ = Math.cos(var1);
      this.wkt = Math.sin(var1);
      this.dqp = 20 + this.drt.mbr().nextInt(20);
   }

   @Override
   public void iad() {
      this.dqp--;
      this.drt.ph8().c2i(this.drt.o2v + this.un_, this.drt.kfp + (double)this.drt.c5y(), this.drt.vbd + this.wkt, 10.0F, (float)this.drt.d1r());
   }

   private static oov a(oov var0) {
      return var0;
   }
}
