package net.minecraft.network.play.server;

public class S3APacketTabComplete implements mz2 {
   public S3APacketTabComplete() {
   }

   public S3APacketTabComplete(String[] var1) {
      this.fj3 = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.fj3 = new String[var1.gux()];
      String var10000 = S14PacketEntity.b();
      int var3 = 0;
      String var2 = var10000;

      while (var3 < this.fj3.length) {
         this.fj3[var3] = var1.oa5(32767);
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.fj3.length);
      String var10000 = S14PacketEntity.b();
      String[] var3 = this.fj3;
      int var4 = var3.length;
      int var5 = 0;
      String var2 = var10000;

      while (var5 < var4) {
         String var6 = var3[var5];
         var1.p3z(var6);
         var5++;
         if (var2 == null) {
            break;
         }
      }
   }

   public void cyr(jsv var1) {
      var1.wsc(this);
   }

   public String[] ul9() {
      return this.fj3;
   }

   @Override
   public void ito(yw3 var1) {
      this.cyr((jsv)var1);
   }
}
