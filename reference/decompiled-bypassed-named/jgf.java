import java.util.List;

public abstract class jgf extends dxd {
   public final Minecraft e71;
   public final List rt0;

   public jgf(Minecraft var1, int var2, int var3, List var4) {
      super(var1, var2, var3, 32, var3 - 55 + 4, 36);
      this.e71 = var1;
      this.rt0 = var4;
      this.n05 = false;
      this.lfu(true, (int)((float)var1.tx1.rr7 * 1.5F));
   }

   @Override
   public void xwh(int var1, int var2, jom var3) {
      String var4 = syo.dkd + "" + syo.yn5 + this.hy1();
      this.e71.tx1.eh6(var4, (float)(var1 + this.wde / 2 - this.e71.tx1.ezt(var4) / 2), (float)Math.min(this.vem + 3, var2), 16777215);
   }

   public abstract String hy1();

   public List ik6() {
      return this.rt0;
   }

   @Override
   public int getSize() {
      return this.ik6().size();
   }

   public m2h jb4(int var1) {
      return (m2h)this.ik6().get(var1);
   }

   @Override
   public int getListWidth() {
      return this.wde;
   }

   @Override
   public int getScrollBarX() {
      return this.som - 6;
   }

   @Override
   public dxd$v9l jb4(int var1) {
      return this.jb4(var1);
   }
}
