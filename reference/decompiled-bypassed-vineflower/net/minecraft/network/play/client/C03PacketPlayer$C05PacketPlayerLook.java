package net.minecraft.network.play.client;

public class C03PacketPlayer$C05PacketPlayerLook extends C03PacketPlayer {
   public C03PacketPlayer$C05PacketPlayerLook() {
      this.sfy = true;
   }

   public C03PacketPlayer$C05PacketPlayerLook(float var1, float var2, boolean var3) {
      this.l73 = var1;
      this.m3m = var2;
      this.er7 = var3;
      this.sfy = true;
   }

   @Override
   public void ajj(nfj var1) {
      this.l73 = var1.readFloat();
      this.m3m = var1.readFloat();
      super.ajj(var1);
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeFloat(this.l73);
      var1.writeFloat(this.m3m);
      super.ddd(var1);
   }

   @Override
   public void ito(yw3 var1) {
      super.ucy((no5)var1);
   }
}
