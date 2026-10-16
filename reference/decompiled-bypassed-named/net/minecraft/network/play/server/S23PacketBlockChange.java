package net.minecraft.network.play.server;

public class S23PacketBlockChange implements mz2 {
   public S23PacketBlockChange() {
   }

   public S23PacketBlockChange(OpaquePredicate var1, mew var2) {
      this.qb6 = var2;
      this.m5y = var1.getBlockState(var2);
   }

   @Override
   public void ajj(nfj var1) {
      this.qb6 = var1.jh0();
      this.m5y = (zfz)e0x.qha.gcd(var1.gux());
   }

   @Override
   public void ddd(nfj var1) {
      var1.l3a(this.qb6);
      var1.tao(e0x.qha.zt5(this.m5y));
   }

   public void q0o(jsv var1) {
      var1.tfd(this);
   }

   public zfz jzh() {
      return this.m5y;
   }

   public mew p71() {
      return this.qb6;
   }

   @Override
   public void ito(yw3 var1) {
      this.q0o((jsv)var1);
   }
}
