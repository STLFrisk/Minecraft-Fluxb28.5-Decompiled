package net.minecraft.network.play.server;

public class S00PacketKeepAlive implements mz2 {
   public S00PacketKeepAlive() {
   }

   public S00PacketKeepAlive(int var1) {
      this.sn2 = var1;
   }

   public void kgh(jsv var1) {
      var1.xcg(this);
   }

   @Override
   public void ajj(nfj var1) {
      this.sn2 = var1.gux();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.sn2);
   }

   public int _g8() {
      return this.sn2;
   }

   @Override
   public void ito(yw3 var1) {
      this.kgh((jsv)var1);
   }
}
