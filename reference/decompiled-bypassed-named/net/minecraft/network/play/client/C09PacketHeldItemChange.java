package net.minecraft.network.play.client;

public class C09PacketHeldItemChange implements mz2 {
   public C09PacketHeldItemChange() {
   }

   public C09PacketHeldItemChange(int var1) {
      this.byj = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.byj = var1.readShort();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeShort(this.byj);
   }

   public void va3(no5 var1) {
      var1.gd3(this);
   }

   public int _7g() {
      return this.byj;
   }

   @Override
   public void ito(yw3 var1) {
      this.va3((no5)var1);
   }
}
