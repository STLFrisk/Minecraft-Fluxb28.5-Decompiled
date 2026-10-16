public class nv3$wa2 {
   public float[] yln;
   public gyu[] l6c;
   public int vwf;
   public int i7l;
   public long ias;
   public final nv3 j2u;

   public nv3$wa2(nv3 var1, int var2, int var3) {
      this.j2u = var1;
      this.yln = new float[256];
      this.l6c = new gyu[256];
      this.vwf = var2;
      this.i7l = var3;
      nv3.fp5(var1).u2e(this.yln, var2 << 4, var3 << 4, 16, 16);
      nv3.fp5(var1).jbk(this.l6c, var2 << 4, var3 << 4, 16, 16, false);
   }

   public gyu iyr(int var1, int var2) {
      return this.l6c[var1 & 15 | (var2 & 15) << 4];
   }
}
