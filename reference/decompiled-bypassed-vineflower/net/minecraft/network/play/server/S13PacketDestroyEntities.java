package net.minecraft.network.play.server;

public class S13PacketDestroyEntities implements mz2 {
   public S13PacketDestroyEntities() {
   }

   public S13PacketDestroyEntities(int[] var1) {
      this.yip = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.yip = new int[var1.gux()];
      String var10000 = S14PacketEntity.b();
      int var3 = 0;
      String var2 = var10000;

      while (var3 < this.yip.length) {
         this.yip[var3] = var1.gux();
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.yip.length);
      String var10000 = S14PacketEntity.b();
      int var3 = 0;
      String var2 = var10000;

      while (var3 < this.yip.length) {
         var1.tao(this.yip[var3]);
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   public void qw8(jsv var1) {
      var1.ajs(this);
   }

   public int[] v9l() {
      return this.yip;
   }

   @Override
   public void ito(yw3 var1) {
      this.qw8((jsv)var1);
   }
}
