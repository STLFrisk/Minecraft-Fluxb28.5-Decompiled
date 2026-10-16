package net.minecraft.network.play.server;

public class S40PacketDisconnect implements mz2 {
   public S40PacketDisconnect() {
   }

   public S40PacketDisconnect(ekw var1) {
      this.rul = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.rul = var1.wdz();
   }

   @Override
   public void ddd(nfj var1) {
      var1.v7d(this.rul);
   }

   public void xd6(jsv var1) {
      var1.e5w(this);
   }

   public ekw f70() {
      return this.rul;
   }

   @Override
   public void ito(yw3 var1) {
      this.xd6((jsv)var1);
   }
}
