package net.minecraft.network.play.client;

public class C07PacketPlayerDigging implements mz2 {
   private mew c88;
   private vt2 bub;
   private C07PacketPlayerDigging$pl2 e2d;

   public C07PacketPlayerDigging() {
   }

   public C07PacketPlayerDigging(C07PacketPlayerDigging$pl2 var1, mew var2, vt2 var3) {
      this.e2d = var1;
      this.c88 = var2;
      this.bub = var3;
   }

   @Override
   public void ajj(nfj var1) {
      this.e2d = (C07PacketPlayerDigging$pl2)var1.e0h(C07PacketPlayerDigging$pl2.class);
      this.c88 = var1.jh0();
      this.bub = vt2.jw6(var1.readUnsignedByte());
   }

   @Override
   public void ddd(nfj var1) {
      var1.p9c(this.e2d);
      var1.l3a(this.c88);
      var1.writeByte(this.bub.c3s());
   }

   public void t7x(no5 var1) {
      var1.c9j(this);
   }

   public mew h6h() {
      return this.c88;
   }

   public vt2 up9() {
      return this.bub;
   }

   public C07PacketPlayerDigging$pl2 sju() {
      return this.e2d;
   }

   @Override
   public void ito(yw3 var1) {
      this.t7x((no5)var1);
   }
}
