public final class et9$1 implements Runnable {
   public final mz2 ou4;
   public final yw3 fan;

   public et9$1(mz2 var1, yw3 var2) {
      this.ou4 = var1;
      this.fan = var2;
   }

   @Override
   public void run() {
      et9.adc(this.ou4);
      this.ou4.ito(this.fan);
   }
}
