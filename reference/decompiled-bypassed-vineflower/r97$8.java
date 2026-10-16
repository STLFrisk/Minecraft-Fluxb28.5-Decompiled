import java.util.Random;

public final class r97$8 extends kea {
   @Override
   public erg lno(sdf var1, erg var2) {
      vt2 var3 = okn.dwc(var1.lcq());
      tym var4 = okn.lx6(var1);
      double var5 = var4.tai() + (double)((float)var3.n67() * 0.3F);
      double var7 = var4.q_1() + (double)((float)var3.g5t() * 0.3F);
      double var9 = var4.wgy() + (double)((float)var3.ozy() * 0.3F);
      t9d var11 = var1.acz();
      Random var12 = var11.fsy;
      double var13 = var12.nextGaussian() * 0.05 + (double)var3.n67();
      double var15 = var12.nextGaussian() * 0.05 + (double)var3.g5t();
      double var17 = var12.nextGaussian() * 0.05 + (double)var3.ozy();
      var11.xzq(new ka8(var11, var5, var7, var9, var13, var15, var17));
      var2.amj(1);
      return var2;
   }

   @Override
   public void d_l(sdf var1) {
      var1.acz().qca(1009, var1.taq(), 0);
   }
}
