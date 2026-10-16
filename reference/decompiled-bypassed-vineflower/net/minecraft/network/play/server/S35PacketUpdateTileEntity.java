package net.minecraft.network.play.server;

public class S35PacketUpdateTileEntity implements mz2 {
   public S35PacketUpdateTileEntity() {
   }

   public S35PacketUpdateTileEntity(mew var1, int var2, bdo var3) {
      this.dw0 = var1;
      this.ug_ = var2;
      this.h__ = var3;
   }

   @Override
   public void ajj(nfj var1) {
      this.dw0 = var1.jh0();
      this.ug_ = var1.readUnsignedByte();
      this.h__ = var1.e97();
   }

   @Override
   public void ddd(nfj var1) {
      var1.l3a(this.dw0);
      var1.writeByte((byte)this.ug_);
      var1.__w(this.h__);
   }

   public void wsm(jsv var1) {
      var1.x0j(this);
   }

   public mew dox() {
      return this.dw0;
   }

   public int o2i() {
      return this.ug_;
   }

   public bdo bxo() {
      return this.h__;
   }

   @Override
   public void ito(yw3 var1) {
      this.wsm((jsv)var1);
   }
}
