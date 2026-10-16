package net.minecraft.network.play.server;

public class S14PacketEntity$S17PacketEntityLookMove extends S14PacketEntity {
   public S14PacketEntity$S17PacketEntityLookMove() {
      this.wta = true;
   }

   public S14PacketEntity$S17PacketEntityLookMove(int var1, byte var2, byte var3, byte var4, byte var5, byte var6, boolean var7) {
      super(var1);
      this.zgi = var2;
      this.nj5 = var3;
      this.z3q = var4;
      this.ufq = var5;
      this.azt = var6;
      this.ro5 = var7;
      this.wta = true;
   }

   @Override
   public void ajj(nfj var1) {
      super.ajj(var1);
      this.zgi = var1.readByte();
      this.nj5 = var1.readByte();
      this.z3q = var1.readByte();
      this.ufq = var1.readByte();
      this.azt = var1.readByte();
      this.ro5 = var1.readBoolean();
   }

   @Override
   public void ddd(nfj var1) {
      super.ddd(var1);
      var1.writeByte(this.zgi);
      var1.writeByte(this.nj5);
      var1.writeByte(this.z3q);
      var1.writeByte(this.ufq);
      var1.writeByte(this.azt);
      var1.writeBoolean(this.ro5);
   }

   @Override
   public void ito(yw3 var1) {
      super.klg((jsv)var1);
   }
}
