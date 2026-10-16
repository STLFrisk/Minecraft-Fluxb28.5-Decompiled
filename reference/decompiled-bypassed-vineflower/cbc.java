import com.google.common.collect.Lists;
import java.util.BitSet;
import java.util.List;

public class cbc {
   public static final cbc ays = new cbc$1();
   private final boolean[] m3r = new boolean[kqk.pxj.length];
   private final boolean[] x9t = new boolean[kqk.pxj.length];
   private boolean s1e = true;
   private final List qqk = Lists.newArrayList();
   private jcs vry = new jcs();
   private q3g$szd t00;
   private BitSet[] w1r = new BitSet[kqk.pxj.length];

   public boolean ra6() {
      return this.s1e;
   }

   public void uey(w51 var1) {
      this.s1e = false;
      this.m3r[var1.ordinal()] = true;
   }

   public boolean jo2(w51 var1) {
      int var2 = t9d.b();

      try {
         boolean var10000 = this.m3r[var1.ordinal()];
         if (var2 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   public void okj(w51 var1) {
      this.x9t[var1.ordinal()] = true;
   }

   public boolean g4s(w51 var1) {
      return this.x9t[var1.ordinal()];
   }

   public List pf7() {
      return this.qqk;
   }

   public void cmv(pyk var1) {
      this.qqk.add(var1);
   }

   public boolean spn(vt2 var1, vt2 var2) {
      return this.vry.mex(var1, var2);
   }

   public void htm(jcs var1) {
      this.vry = var1;
   }

   public q3g$szd zjr() {
      return this.t00;
   }

   public void agp(q3g$szd var1) {
      this.t00 = var1;
   }

   public BitSet pry(w51 var1) {
      return this.w1r[var1.ordinal()];
   }

   public void je9(w51 var1, BitSet var2) {
      this.w1r[var1.ordinal()] = var2;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
