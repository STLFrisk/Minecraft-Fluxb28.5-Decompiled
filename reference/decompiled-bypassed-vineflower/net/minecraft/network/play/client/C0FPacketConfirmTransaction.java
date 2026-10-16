package net.minecraft.network.play.client;

public class C0FPacketConfirmTransaction implements mz2 {
   public int zfu;
   public short bt2;
   public boolean ilh;

   public C0FPacketConfirmTransaction() {
   }

   public C0FPacketConfirmTransaction(int var1, short var2, boolean var3) {
      this.zfu = var1;
      this.bt2 = var2;
      this.ilh = var3;
   }

   public void qce(no5 var1) {
      var1.wp_(this);
   }

   @Override
   public void ajj(nfj var1) {
      this.zfu = var1.readByte();
      i2h[] var10000 = C03PacketPlayer.b();
      this.bt2 = var1.readShort();
      i2h[] var2 = var10000;

      byte var10001;
      label22: {
         label21: {
            try {
               var4 = this;
               var10001 = var1.readByte();
               if (var2 != null) {
                  break label22;
               }

               if (var10001 != 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var4.ilh = (boolean)var10001;
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this.zfu);
      i2h[] var10000 = C03PacketPlayer.b();
      var1.writeShort(this.bt2);
      i2h[] var2 = var10000;

      byte var10001;
      label22: {
         label21: {
            try {
               var4 = var1;
               var10001 = this.ilh;
               if (var2 != null) {
                  break label22;
               }

               if (this.ilh) {
                  break label21;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var4.writeByte(var10001);
   }

   public int qec() {
      return this.zfu;
   }

   public short x7y() {
      return this.bt2;
   }

   @Override
   public void ito(yw3 var1) {
      this.qce((no5)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
