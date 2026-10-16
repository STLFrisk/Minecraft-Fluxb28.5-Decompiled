package net.minecraft.tileentity;

import io.netty.buffer.ByteBuf;

public class TileEntityCommandBlock$1 extends k6s {
   public final TileEntityCommandBlock ose;

   public TileEntityCommandBlock$1(TileEntityCommandBlock var1) {
      this.ose = var1;
   }

   @Override
   public mew d3d() {
      return this.ose.al2;
   }

   @Override
   public fqr i15() {
      return new fqr((double)this.ose.al2.getX() + 0.5, (double)this.ose.al2.getY() + 0.5, (double)this.ose.al2.getZ() + 0.5);
   }

   @Override
   public t9d qha() {
      return this.ose.yi7();
   }

   @Override
   public void y6j(String var1) {
      super.y6j(var1);
      this.ose.r5t();
   }

   @Override
   public void r73() {
      this.ose.yi7().nfo(this.ose.al2);
   }

   @Override
   public int end() {
      return 0;
   }

   @Override
   public void p8w(ByteBuf var1) {
      var1.writeInt(this.ose.al2.getX());
      var1.writeInt(this.ose.al2.getY());
      var1.writeInt(this.ose.al2.getZ());
   }

   @Override
   public i2h zyd() {
      return null;
   }
}
