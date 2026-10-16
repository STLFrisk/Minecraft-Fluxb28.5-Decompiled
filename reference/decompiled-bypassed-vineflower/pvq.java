public abstract class pvq extends kea {
   @Override
   public erg lno(sdf var1, erg var2) {
      t9d var3 = var1.acz();
      tym var4 = okn.lx6(var1);
      vt2 var5 = okn.dwc(var1.lcq());
      wdc var6 = this.ua7(var3, var4);
      var6.bob((double)var5.n67(), (double)((float)var5.g5t() + 0.1F), (double)var5.ozy(), this.q9n(), this.i9g());
      var3.xzq((i2h)var6);
      var2.amj(1);
      return var2;
   }

   @Override
   public void d_l(sdf var1) {
      var1.acz().qca(1002, var1.taq(), 0);
   }

   public abstract wdc ua7(t9d var1, tym var2);

   public float i9g() {
      return 6.0F;
   }

   public float q9n() {
      return 1.1F;
   }
}
