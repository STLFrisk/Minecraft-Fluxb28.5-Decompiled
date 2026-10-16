import java.util.Random;

public class p76 extends e0x {
   public p76() {
      super(p3y.clf, _mi.ipp);
      this.i3l(uja.mqu);
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.ei2;
   }

   @Override
   public int bzr(Random var1) {
      return 3 + var1.nextInt(5);
   }

   @Override
   public int osi(int var1, Random var2) {
      return Math.min(9, this.bzr(var2) + var2.nextInt(1 + var1));
   }
}
