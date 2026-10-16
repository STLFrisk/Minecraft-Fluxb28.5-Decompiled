package net.minecraft.network.play.server;

public class S14PacketEntity$S16PacketEntityLook extends S14PacketEntity {
   public S14PacketEntity$S16PacketEntityLook() {
      this.wta = true;
   }

   public S14PacketEntity$S16PacketEntityLook(int var1, byte var2, byte var3, boolean var4) {
      super(var1);
      this.ufq = var2;
      this.azt = var3;
      this.wta = true;
      this.ro5 = var4;
   }

   @Override
   public void ajj(nfj var1) {
      super.ajj(var1);
      this.ufq = var1.readByte();
      this.azt = var1.readByte();
      this.ro5 = var1.readBoolean();
   }

   @Override
   public void ddd(nfj var1) {
      super.ddd(var1);
      var1.writeByte(this.ufq);
      var1.writeByte(this.azt);
      var1.writeBoolean(this.ro5);
   }

   @Override
   public void ito(yw3 var1) {
      super.klg((jsv)var1);
   }
}
