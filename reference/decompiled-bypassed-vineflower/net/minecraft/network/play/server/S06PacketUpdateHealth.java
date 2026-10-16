package net.minecraft.network.play.server;

public class S06PacketUpdateHealth implements mz2 {
   public S06PacketUpdateHealth() {
   }

   public S06PacketUpdateHealth(float var1, int var2, float var3) {
      this.hl2 = var1;
      this.bq2 = var2;
      this.jh3 = var3;
   }

   @Override
   public void ajj(nfj var1) {
      this.hl2 = var1.readFloat();
      this.bq2 = var1.gux();
      this.jh3 = var1.readFloat();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeFloat(this.hl2);
      var1.tao(this.bq2);
      var1.writeFloat(this.jh3);
   }

   public void bsd(jsv var1) {
      var1.oe4(this);
   }

   public float fih() {
      return this.hl2;
   }

   public int slz() {
      return this.bq2;
   }

   public float ax8() {
      return this.jh3;
   }

   @Override
   public void ito(yw3 var1) {
      this.bsd((jsv)var1);
   }
}
