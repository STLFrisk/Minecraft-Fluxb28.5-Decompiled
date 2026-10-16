package net.minecraft.network.play.server;

public class S47PacketPlayerListHeaderFooter implements mz2 {
   public S47PacketPlayerListHeaderFooter() {
   }

   public S47PacketPlayerListHeaderFooter(ekw var1) {
      this.o43 = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.o43 = var1.wdz();
      this.p_r = var1.wdz();
   }

   @Override
   public void ddd(nfj var1) {
      var1.v7d(this.o43);
      var1.v7d(this.p_r);
   }

   public void wqa(jsv var1) {
      var1.kln(this);
   }

   public ekw kjr() {
      return this.o43;
   }

   public ekw xch() {
      return this.p_r;
   }

   @Override
   public void ito(yw3 var1) {
      this.wqa((jsv)var1);
   }
}
