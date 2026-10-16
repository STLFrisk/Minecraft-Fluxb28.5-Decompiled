package net.minecraft.network.play.server;

public class S32PacketConfirmTransaction implements mz2 {
   public S32PacketConfirmTransaction() {
   }

   public S32PacketConfirmTransaction(int var1, short var2, boolean var3) {
      this.bum = var1;
      this.fy8 = var2;
      this.i69 = var3;
   }

   public void dom(jsv var1) {
      var1.luq(this);
   }

   @Override
   public void ajj(nfj var1) {
      this.bum = var1.readUnsignedByte();
      this.fy8 = var1.readShort();
      this.i69 = var1.readBoolean();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this.bum);
      var1.writeShort(this.fy8);
      var1.writeBoolean(this.i69);
   }

   public int dtk() {
      return this.bum;
   }

   public short ms2() {
      return this.fy8;
   }

   public boolean p1c() {
      return this.i69;
   }

   @Override
   public void ito(yw3 var1) {
      this.dom((jsv)var1);
   }
}
