package net.minecraft.network.play.server;

public class S1EPacketRemoveEntityEffect implements mz2 {
   public S1EPacketRemoveEntityEffect() {
   }

   public S1EPacketRemoveEntityEffect(int var1, sdj var2) {
      this.x4b = var1;
      this.dv1 = var2._na();
   }

   @Override
   public void ajj(nfj var1) {
      this.x4b = var1.gux();
      this.dv1 = var1.readUnsignedByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.x4b);
      var1.writeByte(this.dv1);
   }

   public void k_9(jsv var1) {
      var1.qfr(this);
   }

   public int pj2() {
      return this.x4b;
   }

   public int rs0() {
      return this.dv1;
   }

   @Override
   public void ito(yw3 var1) {
      this.k_9((jsv)var1);
   }
}
