import net.minecraft.tileentity.TileEntityMobSpawner;

public class rhy extends q9h {
   public void qt_(TileEntityMobSpawner var1, double var2, double var4, double var6, float var8, int var9) {
      hzu.dp2();
      hzu.a4k((float)var2 + 0.5F, (float)var4, (float)var6 + 0.5F);
      dtk(var1.ebe(), var2, var4, var6, var8);
      hzu.x3w();
   }

   public static void dtk(aih var0, double var1, double var3, double var5, float var7) {
      EntityLivingBase var8 = var0.dou(var0.c4e());
      if (var8 != null) {
         float var9 = 0.4375F;
         hzu.a4k(0.0F, 0.4F, 0.0F);
         hzu.a2h((float)(var0.l75() + (var0.maa() - var0.l75()) * (double)var7) * 10.0F, 0.0F, 1.0F, 0.0F);
         hzu.a2h(-30.0F, 1.0F, 0.0F, 0.0F);
         hzu.a4k(0.0F, -0.4F, 0.0F);
         hzu.syc(var9, var9, var9);
         var8.x24(var1, var3, var5, 0.0F, 0.0F);
         Minecraft.vz1().ibs().ajg(var8, 0.0, 0.0, 0.0, 0.0F, var7);
      }
   }

   @Override
   public void _ny(pyk var1, double var2, double var4, double var6, float var8, int var9) {
      this.qt_((TileEntityMobSpawner)var1, var2, var4, var6, var8, var9);
   }
}
