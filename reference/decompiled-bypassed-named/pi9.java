public class pi9 extends e0x {
   public pi9() {
      super(p3y.y_4, _mi.c36);
      this.i3l(uja.mqu);
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      float var4 = 0.125F;
      return new nh4(
         (double)var2.getX(),
         (double)var2.getY(),
         (double)var2.getZ(),
         (double)(var2.getX() + 1),
         (double)((float)(var2.getY() + 1) - var4),
         (double)(var2.getZ() + 1)
      );
   }

   @Override
   public void n9e(OpaquePredicate var1, mew var2, zfz var3, EntityLivingBase var4) {
      var4.icv *= 0.4;
      var4.bw4 *= 0.4;
   }
}
