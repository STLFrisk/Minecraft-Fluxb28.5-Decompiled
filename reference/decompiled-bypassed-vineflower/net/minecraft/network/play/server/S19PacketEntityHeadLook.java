package net.minecraft.network.play.server;

public class S19PacketEntityHeadLook implements mz2 {
   public S19PacketEntityHeadLook() {
   }

   public S19PacketEntityHeadLook(i2h var1, byte var2) {
      this.h4s = var1.jwu();
      this.qin = var2;
   }

   @Override
   public void ajj(nfj var1) {
      this.h4s = var1.gux();
      this.qin = var1.readByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.h4s);
      var1.writeByte(this.qin);
   }

   public void q77(jsv var1) {
      var1.ces(this);
   }

   public i2h sec(t9d var1) {
      return var1.oks(this.h4s);
   }

   public byte x59() {
      return this.qin;
   }

   @Override
   public void ito(yw3 var1) {
      this.q77((jsv)var1);
   }
}
