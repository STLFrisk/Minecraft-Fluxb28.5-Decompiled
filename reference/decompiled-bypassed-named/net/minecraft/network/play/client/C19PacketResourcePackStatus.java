package net.minecraft.network.play.client;

public class C19PacketResourcePackStatus implements mz2 {
   private String e0l;
   private C19PacketResourcePackStatus$lun qtv;

   public C19PacketResourcePackStatus() {
   }

   public C19PacketResourcePackStatus(String var1, C19PacketResourcePackStatus$lun var2) {
      EntityLivingBase[] var3 = C03PacketPlayer.b();
      super();
      if (var3 == null) {
         if (var1.length() > 40) {
            var1 = var1.substring(0, 40);
         }

         this.e0l = var1;
         this.qtv = var2;
      }
   }

   @Override
   public void ajj(nfj var1) {
      this.e0l = var1.oa5(40);
      this.qtv = (C19PacketResourcePackStatus$lun)var1.e0h(C19PacketResourcePackStatus$lun.class);
   }

   @Override
   public void ddd(nfj var1) {
      var1.p3z(this.e0l);
      var1.p9c(this.qtv);
   }

   public void _kr(no5 var1) {
      var1.cy5(this);
   }

   @Override
   public void ito(yw3 var1) {
      this._kr((no5)var1);
   }
}
