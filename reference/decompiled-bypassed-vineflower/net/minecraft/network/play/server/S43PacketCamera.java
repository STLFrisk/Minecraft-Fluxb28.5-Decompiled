package net.minecraft.network.play.server;

public class S43PacketCamera implements mz2 {
   public int j1u;

   public S43PacketCamera() {
   }

   public S43PacketCamera(i2h var1) {
      this.j1u = var1.jwu();
   }

   @Override
   public void ajj(nfj var1) {
      this.j1u = var1.gux();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.j1u);
   }

   public void e9b(jsv var1) {
      var1.qqb(this);
   }

   public i2h bcy(t9d var1) {
      return var1.oks(this.j1u);
   }

   @Override
   public void ito(yw3 var1) {
      this.e9b((jsv)var1);
   }
}
