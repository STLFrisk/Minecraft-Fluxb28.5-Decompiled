public class tvk$ewj implements a6_ {
   @Override
   public flo r1r(int var1, OpaquePredicate var2, double var3, double var5, double var7, double var9, double var11, double var13, int[] var15) {
      zfz var16 = e0x.v1b(var15[0]);

      try {
         if (var16.r_y().kfj() == -1) {
            return null;
         }
      } catch (oov var17) {
         throw a(var17);
      }

      return new tvk(var2, var3, var5, var7, var9, var11, var13, var16).z_a();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
