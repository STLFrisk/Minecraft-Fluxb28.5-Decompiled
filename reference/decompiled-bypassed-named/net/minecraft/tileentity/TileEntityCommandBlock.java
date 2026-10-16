package net.minecraft.tileentity;

import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

public class TileEntityCommandBlock extends pyk {
   private final k6s xhx = new TileEntityCommandBlock$1(this);

   @Override
   public void m2a(bdo var1) {
      super.m2a(var1);
      this.xhx.vdi(var1);
   }

   @Override
   public void agl(bdo var1) {
      super.agl(var1);
      this.xhx.uvc(var1);
   }

   @Override
   public mz2 ptb() {
      bdo var1 = new bdo();
      this.m2a(var1);
      return new S35PacketUpdateTileEntity(this.al2, 2, var1);
   }

   @Override
   public boolean v3u() {
      return true;
   }

   public k6s n_g() {
      return this.xhx;
   }

   public n_k z_r() {
      return this.xhx.r0f();
   }
}
