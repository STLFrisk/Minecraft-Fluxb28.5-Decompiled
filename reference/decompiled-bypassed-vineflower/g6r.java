import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public abstract class g6r {
   public float _5e;
   public boolean ete;
   public boolean _a0 = true;
   public List uik = Lists.newArrayList();
   public int dsx = 64;
   public int apc = 32;

   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
   }

   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
   }

   public void v3g(g_3 var1, float var2, float var3, float var4) {
   }

   public tf8 bm8(Random var1) {
      return (tf8)this.uik.get(var1.nextInt(this.uik.size()));
   }

   public void o15(String var1, int var2, int var3) {
      this.nx7.put(var1, new jts(var2, var3));
   }

   public jts bx0(String var1) {
      return (jts)this.nx7.get(var1);
   }

   public static void ibo(tf8 var0, tf8 var1) {
      var1.pod = var0.pod;
      var1.r80 = var0.r80;
      var1.oo7 = var0.oo7;
      var1._ki = var0._ki;
      var1.ca7 = var0.ca7;
      var1.kit = var0.kit;
   }

   public void jxr(g6r var1) {
      this._5e = var1._5e;
      this.ete = var1.ete;
      this._a0 = var1._a0;
   }
}
