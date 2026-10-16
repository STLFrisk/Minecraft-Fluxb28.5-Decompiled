public class nw7$ag0 extends ed7 {
   public final nw7 gsv;

   public nw7$ag0(nw7 var1) {
      super(var1.f41, var1.dt7, var1.o1e, 80, var1.o1e - 40, var1.fex.rr7 + 1);
      this.gsv = var1;
   }

   @Override
   public int getSize() {
      return nw7.tcq(this.gsv).size();
   }

   @Override
   public void elementClicked(int var1, boolean var2, int var3, int var4) {
   }

   @Override
   public boolean isSelected(int var1) {
      return false;
   }

   @Override
   public void drawBackground() {
   }

   @Override
   public void drawSlot(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.gsv.fex.eh6((String)nw7.tcq(this.gsv).get(var1), 10.0F, (float)var3, 16777215);
      this.gsv.fex.eh6((String)nw7.cyb(this.gsv).get(var1), 230.0F, (float)var3, 16777215);
   }

   @Override
   public int getScrollBarX() {
      return this.wde - 10;
   }
}
