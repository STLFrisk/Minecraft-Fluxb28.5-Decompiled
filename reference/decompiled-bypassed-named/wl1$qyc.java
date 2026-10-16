public class wl1$qyc {
   private final int jmj;
   private final int lra;
   private Object bic;
   private boolean c_w;

   public wl1$qyc(int var1, int var2, Object var3) {
      this.lra = var2;
      this.bic = var3;
      this.jmj = var1;
      this.c_w = true;
   }

   public int a4k() {
      return this.lra;
   }

   public void l_0(Object var1) {
      this.bic = var1;
   }

   public Object x7y() {
      return this.bic;
   }

   public int f28() {
      return this.jmj;
   }

   public boolean co1() {
      return this.c_w;
   }

   public void xzt(boolean var1) {
      this.c_w = var1;
   }

   public static boolean h1k(wl1$qyc var0, boolean var1) {
      return var0.c_w = var1;
   }
}
