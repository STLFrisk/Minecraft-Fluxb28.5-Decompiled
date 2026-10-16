import java.util.Random;
import net.minecraft.tileentity.TileEntityMobSpawner;

public class ty7 extends rw8 {
   public ty7() {
      super(p3y.zs8);
   }

   @Override
   public pyk ie9(t9d var1, int var2) {
      return new TileEntityMobSpawner();
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return null;
   }

   @Override
   public int bzr(Random var1) {
      return 0;
   }

   @Override
   public void ix7(t9d var1, mew var2, zfz var3, float var4, int var5) {
      super.ix7(var1, var2, var3, var4, var5);
      int var6 = 15 + var1.fsy.nextInt(15) + var1.fsy.nextInt(15);
      this.u9y(var1, var2, var6);
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public int kfj() {
      return 3;
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public u7m su9(t9d var1, mew var2) {
      return null;
   }
}
