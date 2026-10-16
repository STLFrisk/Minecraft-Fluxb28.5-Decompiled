package net.minecraft.network.status.server;

public class S01PacketPong implements mz2 {
   private static String a;

   public S01PacketPong() {
   }

   public S01PacketPong(long var1) {
      this.m26 = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.m26 = var1.readLong();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeLong(this.m26);
   }

   public void y2v(pmi var1) {
      var1.bj7(this);
   }

   @Override
   public void ito(yw3 var1) {
      this.y2v((pmi)var1);
   }

   public static void b(String var0) {
      a = var0;
   }

   public static String b() {
      return a;
   }

   static {
      if (b() == null) {
         b("bsKshc");
      }
   }
}
