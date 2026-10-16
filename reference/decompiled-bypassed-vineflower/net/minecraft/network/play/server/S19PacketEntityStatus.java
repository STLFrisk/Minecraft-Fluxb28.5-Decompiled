package net.minecraft.network.play.server;

public class S19PacketEntityStatus implements mz2 {
   public S19PacketEntityStatus() {
   }

   public S19PacketEntityStatus(i2h var1, byte var2) {
      this.amn = var1.jwu();
      this.xi4 = var2;
   }

   @Override
   public void ajj(nfj var1) {
      this.amn = var1.readInt();
      this.xi4 = var1.readByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeInt(this.amn);
      var1.writeByte(this.xi4);
   }

   public void g76(jsv var1) {
      var1.sgx(this);
   }

   public i2h csv(t9d var1) {
      return var1.oks(this.amn);
   }

   public byte s3_() {
      return this.xi4;
   }

   @Override
   public void ito(yw3 var1) {
      this.g76((jsv)var1);
   }
}
