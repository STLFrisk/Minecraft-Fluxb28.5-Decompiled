public abstract class w66 {
   public m5n utp;
   public pni uu0 = new pni();
   public int ttk;
   public int yva;
   public int r9u;

   public void zrj(m5n var1, i2h var2) {
      this.utp = var1;
      this.uu0.op7();
      this.ttk = fe6.tpk(var2.uo6 + 1.0F);
      this.yva = fe6.tpk(var2.ikl + 1.0F);
      this.r9u = fe6.tpk(var2.uo6 + 1.0F);
   }

   public void ai9() {
   }

   public mux r3f(int var1, int var2, int var3) {
      int var5 = mux.lmx(var1, var2, var3);
      int var10000 = t9d.b();
      mux var6 = (mux)this.uu0.ij8(var5);
      int var4 = var10000;

      try {
         if (var4 == 0) {
            return var6;
         }

         if (var6 != null) {
            return var6;
         }
      } catch (oov var7) {
         throw b(var7);
      }

      var6 = new mux(var1, var2, var3);
      this.uu0.yfe(var5, var6);
      return var6;
   }

   public abstract mux wvu(i2h var1);

   public abstract mux r7o(i2h var1, double var2, double var4, double var6);

   public abstract int t2_(mux[] var1, i2h var2, mux var3, mux var4, float var5);

   private static oov b(oov var0) {
      return var0;
   }
}
