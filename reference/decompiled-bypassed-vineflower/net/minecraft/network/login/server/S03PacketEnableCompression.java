package net.minecraft.network.login.server;

public class S03PacketEnableCompression implements mz2 {
   public S03PacketEnableCompression() {
   }

   public S03PacketEnableCompression(int var1) {
      this.sr0 = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.sr0 = var1.gux();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.sr0);
   }

   public void lu_(ryn var1) {
      var1.c37(this);
   }

   public int m5o() {
      return this.sr0;
   }

   @Override
   public void ito(yw3 var1) {
      this.lu_((ryn)var1);
   }
}
