import java.util.Random;

public class grj extends e0x {
   public grj(p3y var1) {
      super(var1);
      this.i3l(uja.mqu);
   }

   @Override
   public int bzr(Random var1) {
      return 2 + var1.nextInt(2);
   }

   @Override
   public int osi(int var1, Random var2) {
      return fe6.faa(this.bzr(var2) + var2.nextInt(var1 + 1), 1, 5);
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.fi0;
   }

   @Override
   public _mi uoz(zfz var1) {
      return _mi.xxi;
   }

   @Override
   public boolean row() {
      return true;
   }
}
