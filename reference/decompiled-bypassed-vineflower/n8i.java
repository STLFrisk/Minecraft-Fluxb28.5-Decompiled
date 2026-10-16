import java.io.DataInput;
import java.io.DataOutput;

public class n8i extends gdw$q1_ {
   private float ien;

   public n8i() {
   }

   public n8i(float var1) {
      this.ien = var1;
   }

   @Override
   public void b_8(DataOutput var1) {
      var1.writeFloat(this.ien);
   }

   @Override
   public void zwk(DataInput var1, int var2, btc var3) {
      var3.es9(96L);
      this.ien = var1.readFloat();
   }

   @Override
   public byte ky0() {
      return 5;
   }

   @Override
   public String toString() {
      return "" + this.ien + "f";
   }

   @Override
   public gdw h33() {
      return new n8i(this.ien);
   }

   @Override
   public boolean equals(Object var1) {
      int var2 = t9d.b();

      label53: {
         try {
            boolean var10000 = super.equals(var1);
            if (var2 == 0) {
               return var10000;
            }

            if (var10000) {
               break label53;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         return false;
      }

      n8i var3 = (n8i)var1;

      try {
         float var7;
         int var6 = (var7 = this.ien - var3.ien) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
         if (var2 == 0) {
            return (boolean)var6;
         }

         if (!var6) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   @Override
   public int hashCode() {
      return super.hashCode() ^ Float.floatToIntBits(this.ien);
   }

   @Override
   public long taw() {
      return (long)this.ien;
   }

   @Override
   public int r9u() {
      return fe6.tpk(this.ien);
   }

   @Override
   public short sgm() {
      return (short)(fe6.tpk(this.ien) & 65535);
   }

   @Override
   public byte t7_() {
      return (byte)(fe6.tpk(this.ien) & 0xFF);
   }

   @Override
   public double td3() {
      return (double)this.ien;
   }

   @Override
   public float qaj() {
      return this.ien;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
