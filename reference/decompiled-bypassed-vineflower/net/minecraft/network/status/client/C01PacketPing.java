package net.minecraft.network.status.client;

public class C01PacketPing implements mz2 {
   private static i2h[] a;

   public C01PacketPing() {
   }

   public C01PacketPing(long var1) {
      this._pp = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this._pp = var1.readLong();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeLong(this._pp);
   }

   public void c_g(tcf var1) {
      var1._qg(this);
   }

   public long q7m() {
      return this._pp;
   }

   @Override
   public void ito(yw3 var1) {
      this.c_g((tcf)var1);
   }

   public static void b(i2h[] var0) {
      a = var0;
   }

   public static i2h[] b() {
      return a;
   }

   static {
      if (b() != null) {
         b(new i2h[3]);
      }
   }
}
