import java.io.DataInput;
import java.io.DataOutput;

public class tju extends gdw$q1_ {
   private long hpa;

   public tju() {
   }

   public tju(long var1) {
      this.hpa = var1;
   }

   @Override
   public void b_8(DataOutput var1) {
      var1.writeLong(this.hpa);
   }

   @Override
   public void zwk(DataInput var1, int var2, btc var3) {
      var3.es9(128L);
      this.hpa = var1.readLong();
   }

   @Override
   public byte ky0() {
      return 4;
   }

   @Override
   public String toString() {
      return "" + this.hpa + "L";
   }

   @Override
   public gdw h33() {
      return new tju(this.hpa);
   }

   @Override
   public boolean equals(Object var1) {
      int var2 = t9d.c();

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

      tju var3 = (tju)var1;

      try {
         long var7;
         int var6 = (var7 = this.hpa - var3.hpa) == 0L ? 0 : (var7 < 0L ? -1 : 1);
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
      return super.hashCode() ^ (int)(this.hpa ^ this.hpa >>> 32);
   }

   @Override
   public long taw() {
      return this.hpa;
   }

   @Override
   public int r9u() {
      return (int)(this.hpa & -1L);
   }

   @Override
   public short sgm() {
      return (short)((int)(this.hpa & 65535L));
   }

   @Override
   public byte t7_() {
      return (byte)((int)(this.hpa & 255L));
   }

   @Override
   public double td3() {
      return (double)this.hpa;
   }

   @Override
   public float qaj() {
      return (float)this.hpa;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
