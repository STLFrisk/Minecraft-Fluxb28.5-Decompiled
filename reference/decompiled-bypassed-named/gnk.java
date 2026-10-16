public class Event extends ClientEvent {
   public Event(boolean var1, double var2, double var4) {
      this.k_i = var1;
      this.zfv = var2;
      this.dm1 = var4;
   }

   public Event(boolean var1, double var2) {
      this.k_i = var1;
      this.zfv = var2;
      this.dm1 = this.dm1;
   }

   public boolean pms() {
      return this.k_i;
   }

   public double spj() {
      return this.zfv;
   }

   public void p1a(double var1) {
      this.zfv = var1;
   }

   public double eh2() {
      return this.dm1;
   }

   public void cc2(double var1) {
      this.dm1 = var1;
   }
}
