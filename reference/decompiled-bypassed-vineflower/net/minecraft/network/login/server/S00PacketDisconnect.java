package net.minecraft.network.login.server;

public class S00PacketDisconnect implements mz2 {
   private static i2h[] a;

   public S00PacketDisconnect() {
   }

   public S00PacketDisconnect(ekw var1) {
      this.wv5 = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.wv5 = var1.wdz();
   }

   @Override
   public void ddd(nfj var1) {
      var1.v7d(this.wv5);
   }

   public void umz(ryn var1) {
      var1.d2u(this);
   }

   public ekw mvs() {
      return this.wv5;
   }

   @Override
   public void ito(yw3 var1) {
      this.umz((ryn)var1);
   }

   public static void b(i2h[] var0) {
      a = var0;
   }

   public static i2h[] b() {
      return a;
   }

   static {
      if (b() != null) {
         b(new i2h[4]);
      }
   }
}
