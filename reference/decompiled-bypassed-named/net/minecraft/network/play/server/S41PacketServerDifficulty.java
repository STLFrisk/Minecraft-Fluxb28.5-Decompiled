package net.minecraft.network.play.server;

public class S41PacketServerDifficulty implements mz2 {
   public S41PacketServerDifficulty() {
   }

   public S41PacketServerDifficulty(v66 var1, boolean var2) {
      this.tj5 = var1;
      this.m1n = var2;
   }

   public void f4z(jsv var1) {
      var1.yux(this);
   }

   @Override
   public void ajj(nfj var1) {
      this.tj5 = v66.n4n(var1.readUnsignedByte());
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this.tj5.dzc());
   }

   public boolean q83() {
      return this.m1n;
   }

   public v66 k86() {
      return this.tj5;
   }

   @Override
   public void ito(yw3 var1) {
      this.f4z((jsv)var1);
   }
}
