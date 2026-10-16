public class kea implements m1p {
   @Override
   public final erg r0k(sdf var1, erg var2) {
      erg var3 = this.lno(var1, var2);
      this.d_l(var1);
      this._uo(var1, okn.dwc(var1.lcq()));
      return var3;
   }

   public erg lno(sdf var1, erg var2) {
      vt2 var3 = okn.dwc(var1.lcq());
      tym var4 = okn.lx6(var1);
      erg var5 = var2.amj(1);
      ptj(var1.acz(), var5, 6, var3, var4);
      return var2;
   }

   public static void ptj(t9d var0, erg var1, int var2, vt2 var3, tym var4) {
      double var6 = var4.tai();
      int var10000 = t9d.c();
      double var8 = var4.q_1();
      int var5 = var10000;
      double var10 = var4.wgy();

      label25: {
         label24: {
            label23: {
               try {
                  if (var5 != 0) {
                     break label23;
                  }

                  if (var3.e30() != vt2$y0s.abn) {
                     break label24;
                  }
               } catch (oov var15) {
                  throw b(var15);
               }

               var8 -= 0.125;
            }

            if (var5 == 0) {
               break label25;
            }
         }

         var8 -= 0.15625;
      }

      nvf var12 = new nvf(var0, var6, var8, var10, var1);
      double var13 = var0.fsy.nextDouble() * 0.1 + 0.2;
      var12.icv = (double)var3.n67() * var13;
      var12.mop = 0.2F;
      var12.bw4 = (double)var3.ozy() * var13;
      var12.icv = var12.icv + var0.fsy.nextGaussian() * 0.0075F * (double)var2;
      var12.mop = var12.mop + var0.fsy.nextGaussian() * 0.0075F * (double)var2;
      var12.bw4 = var12.bw4 + var0.fsy.nextGaussian() * 0.0075F * (double)var2;
      var0.xzq(var12);
   }

   public void d_l(sdf var1) {
      var1.acz().qca(1000, var1.taq(), 0);
   }

   public void _uo(sdf var1, vt2 var2) {
      var1.acz().qca(2000, var1.taq(), this.yz7(var2));
   }

   private int yz7(vt2 var1) {
      return var1.n67() + 1 + (var1.ozy() + 1) * 3;
   }

   private static oov b(oov var0) {
      return var0;
   }
}
