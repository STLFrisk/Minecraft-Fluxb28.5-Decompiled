package net.minecraft.network.play.server;

public class S1FPacketSetExperience implements mz2 {
   public S1FPacketSetExperience() {
   }

   public S1FPacketSetExperience(float var1, int var2, int var3) {
      this.n73 = var1;
      this.scm = var2;
      this.t69 = var3;
   }

   @Override
   public void ajj(nfj var1) {
      this.n73 = var1.readFloat();
      this.t69 = var1.gux();
      this.scm = var1.gux();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeFloat(this.n73);
      var1.tao(this.t69);
      var1.tao(this.scm);
   }

   public void fn3(jsv var1) {
      var1.d91(this);
   }

   public float dev() {
      return this.n73;
   }

   public int yvv() {
      return this.scm;
   }

   public int _rj() {
      return this.t69;
   }

   @Override
   public void ito(yw3 var1) {
      this.fn3((jsv)var1);
   }
}
