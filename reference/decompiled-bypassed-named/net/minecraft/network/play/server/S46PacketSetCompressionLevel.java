package net.minecraft.network.play.server;

public class S46PacketSetCompressionLevel implements mz2 {
   @Override
   public void ajj(nfj var1) {
      this.ymo = var1.gux();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.ymo);
   }

   public void din(jsv var1) {
      var1.h3r(this);
   }

   public int zub() {
      return this.ymo;
   }

   @Override
   public void ito(yw3 var1) {
      this.din((jsv)var1);
   }
}
