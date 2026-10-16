public class q3g$szd {
   private final int[] dbj;
   private final be7 koa;
   private sla[] k_w;
   public final q3g zeh;

   public q3g$szd(q3g var1, int[] var2, be7 var3, sla[] var4) {
      this.zeh = var1;
      this.dbj = var2;
      this.koa = var3;
      this.k_w = var4;
   }

   public q3g$szd(q3g var1, int[] var2, be7 var3) {
      this.zeh = var1;
      this.dbj = var2;
      this.koa = var3;
   }

   public int[] afe() {
      return this.dbj;
   }

   public int ap4() {
      return this.dbj.length / this.koa.olc();
   }

   public be7 fii() {
      return this.koa;
   }

   public static sla[] pil(q3g$szd var0) {
      return var0.k_w;
   }
}
