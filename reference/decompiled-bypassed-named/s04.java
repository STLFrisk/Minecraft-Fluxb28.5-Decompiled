public class s04 extends g6r {
   public tf8 t7o;
   public tf8 fgp;
   public tf8 qjh;
   public tf8 bnr;
   public tf8 ymo;
   public tf8 rk3;
   public tf8 pu4;
   public tf8 p_5;
   public tf8 cqs;
   public tf8 mjb;
   public tf8 g6t;

   public s04() {
      float var1 = 0.0F;
      byte var2 = 15;
      this.t7o = new tf8(this, 32, 4);
      this.t7o.q3x(-4.0F, -4.0F, -8.0F, 8, 8, 8, var1);
      this.t7o.i50(0.0F, (float)var2, -3.0F);
      this.fgp = new tf8(this, 0, 0);
      this.fgp.q3x(-3.0F, -3.0F, -3.0F, 6, 6, 6, var1);
      this.fgp.i50(0.0F, (float)var2, 0.0F);
      this.qjh = new tf8(this, 0, 12);
      this.qjh.q3x(-5.0F, -4.0F, -6.0F, 10, 8, 12, var1);
      this.qjh.i50(0.0F, (float)var2, 9.0F);
      this.bnr = new tf8(this, 18, 0);
      this.bnr.q3x(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.bnr.i50(-4.0F, (float)var2, 2.0F);
      this.ymo = new tf8(this, 18, 0);
      this.ymo.q3x(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.ymo.i50(4.0F, (float)var2, 2.0F);
      this.rk3 = new tf8(this, 18, 0);
      this.rk3.q3x(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.rk3.i50(-4.0F, (float)var2, 1.0F);
      this.pu4 = new tf8(this, 18, 0);
      this.pu4.q3x(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.pu4.i50(4.0F, (float)var2, 1.0F);
      this.p_5 = new tf8(this, 18, 0);
      this.p_5.q3x(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.p_5.i50(-4.0F, (float)var2, 0.0F);
      this.cqs = new tf8(this, 18, 0);
      this.cqs.q3x(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.cqs.i50(4.0F, (float)var2, 0.0F);
      this.mjb = new tf8(this, 18, 0);
      this.mjb.q3x(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.mjb.i50(-4.0F, (float)var2, -1.0F);
      this.g6t = new tf8(this, 18, 0);
      this.g6t.q3x(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.g6t.i50(4.0F, (float)var2, -1.0F);
   }

   @Override
   public void s_q(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      this.t7o.vca(var7);
      this.fgp.vca(var7);
      this.qjh.vca(var7);
      this.bnr.vca(var7);
      this.ymo.vca(var7);
      this.rk3.vca(var7);
      this.pu4.vca(var7);
      this.p_5.vca(var7);
      this.cqs.vca(var7);
      this.mjb.vca(var7);
      this.g6t.vca(var7);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, EntityLivingBase var7) {
      this.t7o.r80 = var4 / (180.0F / (float)Math.PI);
      this.t7o.pod = var5 / (180.0F / (float)Math.PI);
      float var8 = (float) (Math.PI / 4);
      this.bnr.oo7 = -var8;
      this.ymo.oo7 = var8;
      this.rk3.oo7 = -var8 * 0.74F;
      this.pu4.oo7 = var8 * 0.74F;
      this.p_5.oo7 = -var8 * 0.74F;
      this.cqs.oo7 = var8 * 0.74F;
      this.mjb.oo7 = -var8;
      this.g6t.oo7 = var8;
      float var9 = -0.0F;
      float var10 = (float) (Math.PI / 8);
      this.bnr.r80 = var10 * 2.0F + var9;
      this.ymo.r80 = -var10 * 2.0F - var9;
      this.rk3.r80 = var10 * 1.0F + var9;
      this.pu4.r80 = -var10 * 1.0F - var9;
      this.p_5.r80 = -var10 * 1.0F + var9;
      this.cqs.r80 = var10 * 1.0F - var9;
      this.mjb.r80 = -var10 * 2.0F + var9;
      this.g6t.r80 = var10 * 2.0F - var9;
      float var11 = -(fe6.ssk(var1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var2;
      float var12 = -(fe6.ssk(var1 * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * var2;
      float var13 = -(fe6.ssk(var1 * 0.6662F * 2.0F + (float) (Math.PI / 2)) * 0.4F) * var2;
      float var14 = -(fe6.ssk(var1 * 0.6662F * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var2;
      float var15 = Math.abs(fe6.rtn(var1 * 0.6662F + 0.0F) * 0.4F) * var2;
      float var16 = Math.abs(fe6.rtn(var1 * 0.6662F + (float) Math.PI) * 0.4F) * var2;
      float var17 = Math.abs(fe6.rtn(var1 * 0.6662F + (float) (Math.PI / 2)) * 0.4F) * var2;
      float var18 = Math.abs(fe6.rtn(var1 * 0.6662F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var2;
      this.bnr.r80 += var11;
      this.ymo.r80 += -var11;
      this.rk3.r80 += var12;
      this.pu4.r80 += -var12;
      this.p_5.r80 += var13;
      this.cqs.r80 += -var13;
      this.mjb.r80 += var14;
      this.g6t.r80 += -var14;
      this.bnr.oo7 += var15;
      this.ymo.oo7 += -var15;
      this.rk3.oo7 += var16;
      this.pu4.oo7 += -var16;
      this.p_5.oo7 += var17;
      this.cqs.oo7 += -var17;
      this.mjb.oo7 += var18;
      this.g6t.oo7 += -var18;
   }
}
