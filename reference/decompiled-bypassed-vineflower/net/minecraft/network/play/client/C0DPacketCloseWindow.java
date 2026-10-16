package net.minecraft.network.play.client;

public class C0DPacketCloseWindow implements mz2 {
   public C0DPacketCloseWindow() {
   }

   public C0DPacketCloseWindow(int var1) {
      this.qrz = var1;
   }

   public void d25(no5 var1) {
      var1.ebs(this);
   }

   @Override
   public void ajj(nfj var1) {
      this.qrz = var1.readByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this.qrz);
   }

   @Override
   public void ito(yw3 var1) {
      this.d25((no5)var1);
   }
}
