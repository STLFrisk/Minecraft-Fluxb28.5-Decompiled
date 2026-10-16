package net.minecraft.network.play.server;

public class S05PacketSpawnPosition implements mz2 {
   public S05PacketSpawnPosition() {
   }

   public S05PacketSpawnPosition(mew var1) {
      this.r25 = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.r25 = var1.jh0();
   }

   @Override
   public void ddd(nfj var1) {
      var1.l3a(this.r25);
   }

   public void h0y(jsv var1) {
      var1.oz9(this);
   }

   public mew _ry() {
      return this.r25;
   }

   @Override
   public void ito(yw3 var1) {
      this.h0y((jsv)var1);
   }
}
