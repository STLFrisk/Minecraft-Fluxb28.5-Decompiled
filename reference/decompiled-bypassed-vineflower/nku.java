public class nku extends g6r {
   public tf8[] lha = new tf8[5];

   public nku() {
      this.lha[0] = new tf8(this, 0, 8);
      this.lha[1] = new tf8(this, 0, 0);
      this.lha[2] = new tf8(this, 0, 0);
      this.lha[3] = new tf8(this, 0, 0);
      this.lha[4] = new tf8(this, 0, 0);
      byte var1 = 24;
      byte var2 = 6;
      byte var3 = 20;
      byte var4 = 4;
      this.lha[0].q3x((float)(-var1 / 2), (float)(-var3 / 2 + 2), -3.0F, var1, var3 - 4, 4, 0.0F);
      this.lha[0].i50(0.0F, (float)var4, 0.0F);
      this.lha[1].q3x((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.lha[1].i50((float)(-var1 / 2 + 1), (float)var4, 0.0F);
      this.lha[2].q3x((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.lha[2].i50((float)(var1 / 2 - 1), (float)var4, 0.0F);
      this.lha[3].q3x((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.lha[3].i50(0.0F, (float)var4, (float)(-var3 / 2 + 1));
      this.lha[4].q3x((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.lha[4].i50(0.0F, (float)var4, (float)(var3 / 2 - 1));
      this.lha[0].pod = (float) (Math.PI / 2);
      this.lha[1].r80 = (float) (Math.PI * 3.0 / 2.0);
      this.lha[2].r80 = (float) (Math.PI / 2);
      this.lha[3].r80 = (float) Math.PI;
   }

   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int var8 = t9d.b();
      int var9 = 0;

      while (var9 < 5) {
         this.lha[var9].vca(var7);
         var9++;
         if (var8 == 0) {
            break;
         }
      }
   }
}
