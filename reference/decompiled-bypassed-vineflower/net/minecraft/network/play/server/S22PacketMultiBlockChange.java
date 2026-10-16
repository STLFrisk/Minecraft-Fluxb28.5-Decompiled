package net.minecraft.network.play.server;

public class S22PacketMultiBlockChange implements mz2 {
   private h2f klf;
   private S22PacketMultiBlockChange$_to[] ytq;

   public S22PacketMultiBlockChange() {
   }

   public S22PacketMultiBlockChange(int var1, short[] var2, tts var3) {
      String var10000 = S14PacketEntity.b();
      this.klf = new h2f(var3.nzx, var3.yxl);
      this.ytq = new S22PacketMultiBlockChange$_to[var1];
      String var4 = var10000;
      int var5 = 0;

      while (var5 < this.ytq.length) {
         this.ytq[var5] = new S22PacketMultiBlockChange$_to(this, var2[var5], var3);
         var5++;
         if (var4 == null) {
            break;
         }
      }
   }

   @Override
   public void ajj(nfj var1) {
      this.klf = new h2f(var1.readInt(), var1.readInt());
      String var10000 = S14PacketEntity.b();
      this.ytq = new S22PacketMultiBlockChange$_to[var1.gux()];
      int var3 = 0;
      String var2 = var10000;

      while (var3 < this.ytq.length) {
         this.ytq[var3] = new S22PacketMultiBlockChange$_to(this, var1.readShort(), (zfz)e0x.qha.gcd(var1.gux()));
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeInt(this.klf.jnd);
      var1.writeInt(this.klf.km5);
      var1.tao(this.ytq.length);
      S22PacketMultiBlockChange$_to[] var3 = this.ytq;
      String var10000 = S14PacketEntity.b();
      int var4 = var3.length;
      String var2 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         S22PacketMultiBlockChange$_to var6 = var3[var5];
         var1.writeShort(var6.ej7());
         var1.tao(e0x.qha.zt5(var6.il5()));
         var5++;
         if (var2 == null) {
            break;
         }
      }
   }

   public void mku(jsv var1) {
      var1.q8e(this);
   }

   public S22PacketMultiBlockChange$_to[] s1k() {
      return this.ytq;
   }

   @Override
   public void ito(yw3 var1) {
      this.mku((jsv)var1);
   }

   public static h2f vbp(S22PacketMultiBlockChange var0) {
      return var0.klf;
   }
}
