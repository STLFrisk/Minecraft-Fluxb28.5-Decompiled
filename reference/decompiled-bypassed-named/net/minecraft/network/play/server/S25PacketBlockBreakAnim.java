package net.minecraft.network.play.server;

public class S25PacketBlockBreakAnim implements mz2 {
   public S25PacketBlockBreakAnim() {
   }

   public S25PacketBlockBreakAnim(int var1, mew var2, int var3) {
      this.c57 = var1;
      this.w3q = var2;
      this.co3 = var3;
   }

   @Override
   public void ajj(nfj var1) {
      this.c57 = var1.gux();
      this.w3q = var1.jh0();
      this.co3 = var1.readUnsignedByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.c57);
      var1.l3a(this.w3q);
      var1.writeByte(this.co3);
   }

   public void _hm(jsv var1) {
      var1.collectTargets(this);
   }

   public int enb() {
      return this.c57;
   }

   public mew nxc() {
      return this.w3q;
   }

   public int x30() {
      return this.co3;
   }

   @Override
   public void ito(yw3 var1) {
      this._hm((jsv)var1);
   }
}
