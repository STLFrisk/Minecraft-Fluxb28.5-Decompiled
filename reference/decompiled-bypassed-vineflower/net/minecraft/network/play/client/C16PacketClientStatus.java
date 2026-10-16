package net.minecraft.network.play.client;

public class C16PacketClientStatus implements mz2 {
   private C16PacketClientStatus$v78 b6c;

   public C16PacketClientStatus() {
   }

   public C16PacketClientStatus(C16PacketClientStatus$v78 var1) {
      this.b6c = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.b6c = (C16PacketClientStatus$v78)var1.e0h(C16PacketClientStatus$v78.class);
   }

   @Override
   public void ddd(nfj var1) {
      var1.p9c(this.b6c);
   }

   public void u7t(no5 var1) {
      var1.zgf(this);
   }

   public C16PacketClientStatus$v78 wc7() {
      return this.b6c;
   }

   @Override
   public void ito(yw3 var1) {
      this.u7t((no5)var1);
   }
}
