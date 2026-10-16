package net.minecraft.network.play.server;

public class S18PacketEntityTeleport implements mz2 {
   public S18PacketEntityTeleport() {
   }

   public S18PacketEntityTeleport(EntityLivingBase var1) {
      this.k53 = var1.jwu();
      this.cr_ = fe6.jqf(var1.o2v * 32.0);
      this.yt2 = fe6.jqf(var1.kfp * 32.0);
      this.aq2 = fe6.jqf(var1.vbd * 32.0);
      this.a11 = (byte)((int)(var1.x5k * 256.0F / 360.0F));
      this.voc = (byte)((int)(var1.y2i * 256.0F / 360.0F));
      this.on7 = var1.lfk;
   }

   public S18PacketEntityTeleport(int var1, int var2, int var3, int var4, byte var5, byte var6, boolean var7) {
      this.k53 = var1;
      this.cr_ = var2;
      this.yt2 = var3;
      this.aq2 = var4;
      this.a11 = var5;
      this.voc = var6;
      this.on7 = var7;
   }

   @Override
   public void ajj(nfj var1) {
      this.k53 = var1.gux();
      this.cr_ = var1.readInt();
      this.yt2 = var1.readInt();
      this.aq2 = var1.readInt();
      this.a11 = var1.readByte();
      this.voc = var1.readByte();
      this.on7 = var1.readBoolean();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.k53);
      var1.writeInt(this.cr_);
      var1.writeInt(this.yt2);
      var1.writeInt(this.aq2);
      var1.writeByte(this.a11);
      var1.writeByte(this.voc);
      var1.writeBoolean(this.on7);
   }

   public void ixn(jsv var1) {
      var1.fch(this);
   }

   public int imn() {
      return this.k53;
   }

   public int xgn() {
      return this.cr_;
   }

   public int toh() {
      return this.yt2;
   }

   public int toj() {
      return this.aq2;
   }

   public byte oxy() {
      return this.a11;
   }

   public byte zw8() {
      return this.voc;
   }

   public boolean any() {
      return this.on7;
   }

   @Override
   public void ito(yw3 var1) {
      this.ixn((jsv)var1);
   }
}
