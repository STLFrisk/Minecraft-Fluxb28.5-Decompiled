package net.minecraft.network.play.client;

public class C0BPacketEntityAction implements mz2 {
   private int ibh;
   private C0BPacketEntityAction$ck7 eot;
   private int zir;

   public C0BPacketEntityAction() {
   }

   public C0BPacketEntityAction(i2h var1, C0BPacketEntityAction$ck7 var2) {
      this(var1, var2, 0);
   }

   public C0BPacketEntityAction(i2h var1, C0BPacketEntityAction$ck7 var2, int var3) {
      this.ibh = var1.jwu();
      this.eot = var2;
      this.zir = var3;
   }

   @Override
   public void ajj(nfj var1) {
      this.ibh = var1.gux();
      this.eot = (C0BPacketEntityAction$ck7)var1.e0h(C0BPacketEntityAction$ck7.class);
      this.zir = var1.gux();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.ibh);
      var1.p9c(this.eot);
      var1.tao(this.zir);
   }

   public void i9o(no5 var1) {
      var1.z1g(this);
   }

   public C0BPacketEntityAction$ck7 zwv() {
      return this.eot;
   }

   public int tdn() {
      return this.zir;
   }

   @Override
   public void ito(yw3 var1) {
      this.i9o((no5)var1);
   }
}
