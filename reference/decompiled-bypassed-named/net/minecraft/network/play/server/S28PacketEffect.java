package net.minecraft.network.play.server;

public class S28PacketEffect implements mz2 {
   public S28PacketEffect() {
   }

   public S28PacketEffect(int var1, mew var2, int var3, boolean var4) {
      this.v7g = var1;
      this.xwh = var2;
      this.dbc = var3;
      this.al4 = var4;
   }

   @Override
   public void ajj(nfj var1) {
      this.v7g = var1.readInt();
      this.xwh = var1.jh0();
      this.dbc = var1.readInt();
      this.al4 = var1.readBoolean();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeInt(this.v7g);
      var1.l3a(this.xwh);
      var1.writeInt(this.dbc);
      var1.writeBoolean(this.al4);
   }

   public void f56(jsv var1) {
      var1.nzf(this);
   }

   public boolean cc4() {
      return this.al4;
   }

   public int eip() {
      return this.v7g;
   }

   public int p_2() {
      return this.dbc;
   }

   public mew ad5() {
      return this.xwh;
   }

   @Override
   public void ito(yw3 var1) {
      this.f56((jsv)var1);
   }
}
