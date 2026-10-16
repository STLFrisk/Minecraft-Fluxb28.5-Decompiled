package net.minecraft.network.play.server;

public class S14PacketEntity$S15PacketEntityRelMove extends S14PacketEntity {
   public S14PacketEntity$S15PacketEntityRelMove() {
   }

   public S14PacketEntity$S15PacketEntityRelMove(int var1, byte var2, byte var3, byte var4, boolean var5) {
      super(var1);
      this.zgi = var2;
      this.nj5 = var3;
      this.z3q = var4;
      this.ro5 = var5;
   }

   @Override
   public void ajj(nfj var1) {
      super.ajj(var1);
      this.zgi = var1.readByte();
      this.nj5 = var1.readByte();
      this.z3q = var1.readByte();
      this.ro5 = var1.readBoolean();
   }

   @Override
   public void ddd(nfj var1) {
      super.ddd(var1);
      var1.writeByte(this.zgi);
      var1.writeByte(this.nj5);
      var1.writeByte(this.z3q);
      var1.writeBoolean(this.ro5);
   }

   @Override
   public void ito(yw3 var1) {
      super.klg((jsv)var1);
   }
}
