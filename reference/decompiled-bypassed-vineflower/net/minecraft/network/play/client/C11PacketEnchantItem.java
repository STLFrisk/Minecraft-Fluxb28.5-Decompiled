package net.minecraft.network.play.client;

public class C11PacketEnchantItem implements mz2 {
   public C11PacketEnchantItem() {
   }

   public C11PacketEnchantItem(int var1, int var2) {
      this._1h = var1;
      this.j9e = var2;
   }

   public void we7(no5 var1) {
      var1.gtn(this);
   }

   @Override
   public void ajj(nfj var1) {
      this._1h = var1.readByte();
      this.j9e = var1.readByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this._1h);
      var1.writeByte(this.j9e);
   }

   public int sp9() {
      return this._1h;
   }

   public int ij7() {
      return this.j9e;
   }

   @Override
   public void ito(yw3 var1) {
      this.we7((no5)var1);
   }
}
