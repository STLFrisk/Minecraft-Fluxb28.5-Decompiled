public class z8o extends g6r {
   public tf8[] xmm = new tf8[7];

   public z8o() {
      this.xmm[0] = new tf8(this, 0, 10);
      this.xmm[1] = new tf8(this, 0, 0);
      this.xmm[2] = new tf8(this, 0, 0);
      this.xmm[3] = new tf8(this, 0, 0);
      this.xmm[4] = new tf8(this, 0, 0);
      this.xmm[5] = new tf8(this, 44, 10);
      byte var1 = 20;
      byte var2 = 8;
      byte var3 = 16;
      byte var4 = 4;
      this.xmm[0].q3x((float)(-var1 / 2), (float)(-var3 / 2), -1.0F, var1, var3, 2, 0.0F);
      this.xmm[0].i50(0.0F, (float)var4, 0.0F);
      this.xmm[5].q3x((float)(-var1 / 2 + 1), (float)(-var3 / 2 + 1), -1.0F, var1 - 2, var3 - 2, 1, 0.0F);
      this.xmm[5].i50(0.0F, (float)var4, 0.0F);
      this.xmm[1].q3x((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.xmm[1].i50((float)(-var1 / 2 + 1), (float)var4, 0.0F);
      this.xmm[2].q3x((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.xmm[2].i50((float)(var1 / 2 - 1), (float)var4, 0.0F);
      this.xmm[3].q3x((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.xmm[3].i50(0.0F, (float)var4, (float)(-var3 / 2 + 1));
      this.xmm[4].q3x((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.xmm[4].i50(0.0F, (float)var4, (float)(var3 / 2 - 1));
      this.xmm[0].pod = (float) (Math.PI / 2);
      this.xmm[1].r80 = (float) (Math.PI * 3.0 / 2.0);
      this.xmm[2].r80 = (float) (Math.PI / 2);
      this.xmm[3].r80 = (float) Math.PI;
      this.xmm[5].pod = (float) (-Math.PI / 2);
   }

   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.xmm[5].ca7 = 4.0F - var4;
      int var10000 = t9d.b();
      int var9 = 0;
      int var8 = var10000;

      while (var9 < 6) {
         this.xmm[var9].vca(var7);
         var9++;
         if (var8 == 0) {
            break;
         }
      }
   }
}
