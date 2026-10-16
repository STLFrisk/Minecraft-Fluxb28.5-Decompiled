import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public final class gjy$1 implements Comparator {
   public int yl5(hv2 var1, hv2 var2) {
      return ComparisonChain.start().compare(var1.pbs().getId(), var2.pbs().getId()).result();
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.yl5((hv2)var1, (hv2)var2);
   }
}
