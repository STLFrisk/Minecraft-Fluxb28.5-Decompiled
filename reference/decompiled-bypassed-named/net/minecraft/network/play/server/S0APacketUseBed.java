package net.minecraft.network.play.server;

public class S0APacketUseBed implements mz2 {
   public S0APacketUseBed() {
   }

   public S0APacketUseBed(ha9 var1, mew var2) {
      this.roo = var1.jwu();
      this.s2z = var2;
   }

   @Override
   public void ajj(nfj var1) {
      this.roo = var1.gux();
      this.s2z = var1.jh0();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.roo);
      var1.l3a(this.s2z);
   }

   public void yf_(jsv var1) {
      var1.usm(this);
   }

   public ha9 zi5(OpaquePredicate var1) {
      return (ha9)var1.oks(this.roo);
   }

   public mew akm() {
      return this.s2z;
   }

   @Override
   public void ito(yw3 var1) {
      this.yf_((jsv)var1);
   }
}
