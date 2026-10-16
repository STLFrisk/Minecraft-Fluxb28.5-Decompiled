import com.google.common.primitives.Floats;
import java.util.Comparator;

public class q3g$1 implements Comparator {
   public final float[] yk0;
   public final q3g c9e;

   public q3g$1(q3g var1, float[] var2) {
      this.c9e = var1;
      this.yk0 = var2;
   }

   public int ax7(Integer var1, Integer var2) {
      return Floats.compare(this.yk0[var2], this.yk0[var1]);
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.ax7((Integer)var1, (Integer)var2);
   }
}
