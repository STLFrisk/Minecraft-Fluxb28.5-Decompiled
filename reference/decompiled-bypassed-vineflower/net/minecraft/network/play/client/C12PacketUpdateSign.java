package net.minecraft.network.play.client;

public class C12PacketUpdateSign implements mz2 {
   private mew pln;
   private ekw[] bzw;

   public C12PacketUpdateSign() {
   }

   public C12PacketUpdateSign(mew var1, ekw[] var2) {
      this.pln = var1;
      this.bzw = new ekw[]{var2[0], var2[1], var2[2], var2[3]};
   }

   @Override
   public void ajj(nfj var1) {
      this.pln = var1.jh0();
      i2h[] var10000 = C03PacketPlayer.b();
      this.bzw = new ekw[4];
      i2h[] var2 = var10000;
      int var3 = 0;

      while (var3 < 4) {
         String var4 = var1.oa5(384);
         ekw var5 = ekw$szt.wnw(var4);
         this.bzw[var3] = var5;
         var3++;
         if (var2 != null) {
            break;
         }
      }
   }

   @Override
   public void ddd(nfj var1) {
      var1.l3a(this.pln);
      i2h[] var10000 = C03PacketPlayer.b();
      int var3 = 0;
      i2h[] var2 = var10000;

      while (var3 < 4) {
         ekw var4 = this.bzw[var3];
         String var5 = ekw$szt.odg(var4);
         var1.p3z(var5);
         var3++;
         if (var2 != null) {
            break;
         }
      }
   }

   public void sk2(no5 var1) {
      var1.qmt(this);
   }

   public mew ybo() {
      return this.pln;
   }

   public ekw[] sc7() {
      return this.bzw;
   }

   @Override
   public void ito(yw3 var1) {
      this.sk2((no5)var1);
   }
}
