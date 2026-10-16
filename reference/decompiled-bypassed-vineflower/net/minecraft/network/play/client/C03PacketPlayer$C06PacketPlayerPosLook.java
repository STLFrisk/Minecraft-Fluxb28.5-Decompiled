package net.minecraft.network.play.client;

public class C03PacketPlayer$C06PacketPlayerPosLook extends C03PacketPlayer {
   public C03PacketPlayer$C06PacketPlayerPosLook() {
      this.z3f = true;
      this.sfy = true;
   }

   public C03PacketPlayer$C06PacketPlayerPosLook(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.mjd = var1;
      this.q9m = var3;
      this.nzt = var5;
      this.l73 = var7;
      this.m3m = var8;
      this.er7 = var9;
      this.sfy = true;
      this.z3f = true;
   }

   @Override
   public void ajj(nfj var1) {
      this.mjd = var1.readDouble();
      this.q9m = var1.readDouble();
      this.nzt = var1.readDouble();
      this.l73 = var1.readFloat();
      this.m3m = var1.readFloat();
      super.ajj(var1);
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeDouble(this.mjd);
      var1.writeDouble(this.q9m);
      var1.writeDouble(this.nzt);
      var1.writeFloat(this.l73);
      var1.writeFloat(this.m3m);
      super.ddd(var1);
   }

   @Override
   public void ito(yw3 var1) {
      super.ucy((no5)var1);
   }
}
