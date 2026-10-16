package net.minecraft.network.play.server;

public class S49PacketUpdateEntityNBT implements mz2 {
   public S49PacketUpdateEntityNBT() {
   }

   public S49PacketUpdateEntityNBT(int var1, bdo var2) {
      this.qhk = var1;
      this._cr = var2;
   }

   @Override
   public void ajj(nfj var1) {
      this.qhk = var1.gux();
      this._cr = var1.e97();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.qhk);
      var1.__w(this._cr);
   }

   public void gwm(jsv var1) {
      var1.wlg(this);
   }

   public bdo k1k() {
      return this._cr;
   }

   public EntityLivingBase eor(OpaquePredicate var1) {
      return var1.oks(this.qhk);
   }

   @Override
   public void ito(yw3 var1) {
      this.gwm((jsv)var1);
   }
}
