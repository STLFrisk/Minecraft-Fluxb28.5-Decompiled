package net.minecraft.network.play.server;

public class S31PacketWindowProperty implements mz2 {
   public S31PacketWindowProperty() {
   }

   public S31PacketWindowProperty(int var1, int var2, int var3) {
      this.o3s = var1;
      this.d16 = var2;
      this.v6_ = var3;
   }

   public void ewi(jsv var1) {
      var1.b33(this);
   }

   @Override
   public void ajj(nfj var1) {
      this.o3s = var1.readUnsignedByte();
      this.d16 = var1.readShort();
      this.v6_ = var1.readShort();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this.o3s);
      var1.writeShort(this.d16);
      var1.writeShort(this.v6_);
   }

   public int m1d() {
      return this.o3s;
   }

   public int k0r() {
      return this.d16;
   }

   public int fv6() {
      return this.v6_;
   }

   @Override
   public void ito(yw3 var1) {
      this.ewi((jsv)var1);
   }
}
