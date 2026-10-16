package net.minecraft.network.play.server;

public class S1BPacketEntityAttach implements mz2 {
   public S1BPacketEntityAttach() {
   }

   public S1BPacketEntityAttach(int var1, i2h var2, i2h var3) {
      String var10000 = S14PacketEntity.b();
      this.s85 = var1;
      String var4 = var10000;

      int var7;
      label24: {
         label23: {
            label22: {
               try {
                  this.umv = var2.jwu();
                  var6 = this;
                  var10001 = var3;
                  if (var4 == null) {
                     break label23;
                  }

                  if (var3 == null) {
                     break label22;
                  }
               } catch (oov var5) {
                  throw a(var5);
               }

               var10001 = var3;
               break label23;
            }

            var7 = -1;
            break label24;
         }

         var7 = var10001.jwu();
      }

      var6.byi = var7;
   }

   @Override
   public void ajj(nfj var1) {
      this.umv = var1.readInt();
      this.byi = var1.readInt();
      this.s85 = var1.readUnsignedByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeInt(this.umv);
      var1.writeInt(this.byi);
      var1.writeByte(this.s85);
   }

   public void v1o(jsv var1) {
      var1.m41(this);
   }

   public int dcg() {
      return this.s85;
   }

   public int sem() {
      return this.umv;
   }

   public int bbw() {
      return this.byi;
   }

   @Override
   public void ito(yw3 var1) {
      this.v1o((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
