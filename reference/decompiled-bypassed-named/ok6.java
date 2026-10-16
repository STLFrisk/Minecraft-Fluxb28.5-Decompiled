import java.io.DataInput;
import java.io.DataOutput;

public class ok6 extends gdw$q1_ {
   private double n07;

   public ok6() {
   }

   public ok6(double var1) {
      this.n07 = var1;
   }

   @Override
   public void b_8(DataOutput var1) {
      var1.writeDouble(this.n07);
   }

   @Override
   public void zwk(DataInput var1, int var2, btc var3) {
      var3.es9(128L);
      this.n07 = var1.readDouble();
   }

   @Override
   public byte ky0() {
      return 6;
   }

   @Override
   public String toString() {
      return "" + this.n07 + "d";
   }

   @Override
   public gdw h33() {
      return new ok6(this.n07);
   }

   @Override
   public boolean equals(Object var1) {
      int var2 = OpaquePredicate.c();

      label53: {
         try {
            boolean var10000 = super.equals(var1);
            if (var2 != 0) {
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

      ok6 var3 = (ok6)var1;

      try {
         double var7;
         int var6 = (var7 = this.n07 - var3.n07) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
         if (var2 != 0) {
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
      long var1 = Double.doubleToLongBits(this.n07);
      return super.hashCode() ^ (int)(var1 ^ var1 >>> 32);
   }

   @Override
   public long taw() {
      return (long)Math.floor(this.n07);
   }

   @Override
   public int r9u() {
      return fe6.jqf(this.n07);
   }

   @Override
   public short sgm() {
      return (short)(fe6.jqf(this.n07) & 65535);
   }

   @Override
   public byte t7_() {
      return (byte)(fe6.jqf(this.n07) & 0xFF);
   }

   @Override
   public double td3() {
      return this.n07;
   }

   @Override
   public float qaj() {
      return (float)this.n07;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
