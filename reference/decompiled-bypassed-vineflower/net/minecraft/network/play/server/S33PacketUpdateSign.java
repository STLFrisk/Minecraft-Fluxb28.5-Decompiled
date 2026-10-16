package net.minecraft.network.play.server;

public class S33PacketUpdateSign implements mz2 {
   public S33PacketUpdateSign() {
   }

   public S33PacketUpdateSign(t9d var1, mew var2, ekw[] var3) {
      this.vco = var1;
      this.rw_ = var2;
      this.za1 = new ekw[]{var3[0], var3[1], var3[2], var3[3]};
   }

   @Override
   public void ajj(nfj var1) {
      this.rw_ = var1.jh0();
      String var10000 = S14PacketEntity.b();
      this.za1 = new ekw[4];
      int var3 = 0;
      String var2 = var10000;

      while (var3 < 4) {
         this.za1[var3] = var1.wdz();
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void ddd(nfj var1) {
      var1.l3a(this.rw_);
      String var10000 = S14PacketEntity.b();
      int var3 = 0;
      String var2 = var10000;

      while (var3 < 4) {
         var1.v7d(this.za1[var3]);
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   public void r8a(jsv var1) {
      var1._63(this);
   }

   public mew mmn() {
      return this.rw_;
   }

   public ekw[] iqy() {
      return this.za1;
   }

   @Override
   public void ito(yw3 var1) {
      this.r8a((jsv)var1);
   }
}
