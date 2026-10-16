package net.minecraft.network.play.client;

public class C01PacketChatMessage implements mz2 {
   public C01PacketChatMessage() {
   }

   public C01PacketChatMessage(String var1) {
      EntityLivingBase[] var2 = C03PacketPlayer.b();
      super();
      if (var2 == null) {
         if (var1.length() > 100) {
            var1 = var1.substring(0, 100);
         }

         this.iaz = var1;
      }
   }

   @Override
   public void ajj(nfj var1) {
      this.iaz = var1.oa5(100);
   }

   @Override
   public void ddd(nfj var1) {
      var1.p3z(this.iaz);
   }

   public void oee(no5 var1) {
      var1.lad(this);
   }

   public String pw6() {
      return this.iaz;
   }

   @Override
   public void ito(yw3 var1) {
      this.oee((no5)var1);
   }
}
