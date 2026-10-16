package net.minecraft.network.play.client;

public class C00PacketKeepAlive implements mz2 {
   public C00PacketKeepAlive() {
   }

   public C00PacketKeepAlive(int var1) {
      this._a6 = var1;
   }

   public void lf6(no5 var1) {
      var1.qoc(this);
   }

   @Override
   public void ajj(nfj var1) {
      this._a6 = var1.gux();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this._a6);
   }

   public int u5c() {
      return this._a6;
   }

   @Override
   public void ito(yw3 var1) {
      this.lf6((no5)var1);
   }
}
