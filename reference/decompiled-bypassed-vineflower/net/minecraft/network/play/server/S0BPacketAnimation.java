package net.minecraft.network.play.server;

public class S0BPacketAnimation implements mz2 {
   public S0BPacketAnimation() {
   }

   public S0BPacketAnimation(i2h var1, int var2) {
      this.fz6 = var1.jwu();
      this.wgq = var2;
   }

   @Override
   public void ajj(nfj var1) {
      this.fz6 = var1.gux();
      this.wgq = var1.readUnsignedByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.fz6);
      var1.writeByte(this.wgq);
   }

   public void ng5(jsv var1) {
      var1.v7u(this);
   }

   public int _d6() {
      return this.fz6;
   }

   public int ser() {
      return this.wgq;
   }

   @Override
   public void ito(yw3 var1) {
      this.ng5((jsv)var1);
   }
}
