package net.minecraft.network.play.client;

public class C03PacketPlayer$C04PacketPlayerPosition extends C03PacketPlayer {
   public C03PacketPlayer$C04PacketPlayerPosition() {
      this.z3f = true;
   }

   public C03PacketPlayer$C04PacketPlayerPosition(double var1, double var3, double var5, boolean var7) {
      this.mjd = var1;
      this.q9m = var3;
      this.nzt = var5;
      this.er7 = var7;
      this.z3f = true;
   }

   @Override
   public void ajj(nfj var1) {
      this.mjd = var1.readDouble();
      this.q9m = var1.readDouble();
      this.nzt = var1.readDouble();
      super.ajj(var1);
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeDouble(this.mjd);
      var1.writeDouble(this.q9m);
      var1.writeDouble(this.nzt);
      super.ddd(var1);
   }

   @Override
   public void ito(yw3 var1) {
      super.ucy((no5)var1);
   }
}
