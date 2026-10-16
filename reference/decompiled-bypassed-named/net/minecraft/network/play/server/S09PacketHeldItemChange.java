package net.minecraft.network.play.server;

public class S09PacketHeldItemChange implements mz2 {
   public S09PacketHeldItemChange() {
   }

   public S09PacketHeldItemChange(int var1) {
      this.lvm = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.lvm = var1.readByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this.lvm);
   }

   public void ppz(jsv var1) {
      var1.wjr(this);
   }

   public int q81() {
      return this.lvm;
   }

   @Override
   public void ito(yw3 var1) {
      this.ppz((jsv)var1);
   }
}
