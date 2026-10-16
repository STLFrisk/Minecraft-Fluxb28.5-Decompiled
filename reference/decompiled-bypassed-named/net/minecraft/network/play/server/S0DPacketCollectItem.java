package net.minecraft.network.play.server;

public class S0DPacketCollectItem implements mz2 {
   public S0DPacketCollectItem() {
   }

   public S0DPacketCollectItem(int var1, int var2) {
      this.q29 = var1;
      this.cww = var2;
   }

   @Override
   public void ajj(nfj var1) {
      this.q29 = var1.gux();
      this.cww = var1.gux();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.q29);
      var1.tao(this.cww);
   }

   public void h3i(jsv var1) {
      var1.y9y(this);
   }

   public int m3j() {
      return this.q29;
   }

   public int v11() {
      return this.cww;
   }

   @Override
   public void ito(yw3 var1) {
      this.h3i((jsv)var1);
   }
}
