package net.minecraft.network.play.server;

public class S24PacketBlockAction implements mz2 {
   public S24PacketBlockAction() {
   }

   public S24PacketBlockAction(mew var1, e0x var2, int var3, int var4) {
      this.dgi = var1;
      this._0u = var3;
      this.ax1 = var4;
      this.ba3 = var2;
   }

   @Override
   public void ajj(nfj var1) {
      this.dgi = var1.jh0();
      this._0u = var1.readUnsignedByte();
      this.ax1 = var1.readUnsignedByte();
      this.ba3 = e0x.csc(var1.gux() & 4095);
   }

   @Override
   public void ddd(nfj var1) {
      var1.l3a(this.dgi);
      var1.writeByte(this._0u);
      var1.writeByte(this.ax1);
      var1.tao(e0x.mxb(this.ba3) & 4095);
   }

   public void wno(jsv var1) {
      var1.jhp(this);
   }

   public mew rlo() {
      return this.dgi;
   }

   public int _74() {
      return this._0u;
   }

   public int en9() {
      return this.ax1;
   }

   public e0x uym() {
      return this.ba3;
   }

   @Override
   public void ito(yw3 var1) {
      this.wno((jsv)var1);
   }
}
