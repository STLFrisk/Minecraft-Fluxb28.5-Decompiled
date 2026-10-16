package net.minecraft.network.play.client;

import java.util.UUID;

public class C18PacketSpectate implements mz2 {
   public C18PacketSpectate() {
   }

   public C18PacketSpectate(UUID var1) {
      this.uc1 = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.uc1 = var1.ac2();
   }

   @Override
   public void ddd(nfj var1) {
      var1.n5q(this.uc1);
   }

   public void uo2(no5 var1) {
      var1.pnp(this);
   }

   public EntityLivingBase _28(dug var1) {
      return var1.yzl(this.uc1);
   }

   @Override
   public void ito(yw3 var1) {
      this.uo2((no5)var1);
   }
}
