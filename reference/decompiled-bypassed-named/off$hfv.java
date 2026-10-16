public class off$hfv implements dxd$v9l {
   private final String qi3;
   private final int bhv;
   public final off fy6;

   public off$hfv(off var1, String var2) {
      this.fy6 = var1;
      this.qi3 = fc1.gx1(var2, new Object[0]);
      this.bhv = off.tx_(var1).tx1.ezt(this.qi3);
   }

   @Override
   public void is9(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      off.tx_(this.fy6)
         .tx1
         .eh6(this.qi3, (float)(off.tx_(this.fy6).u0y.dt7 / 2 - this.bhv / 2), (float)(var3 + var5 - off.tx_(this.fy6).tx1.rr7 - 1), 16777215);
   }

   @Override
   public boolean r6b(int var1, int var2, int var3, int var4, int var5, int var6) {
      return false;
   }

   @Override
   public void l_a(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   @Override
   public void _at(int var1, int var2, int var3) {
   }
}
