import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class iyx {
   public static Collector jwb() {
      return Collector.of(ArrayList::new, iyx::uzi, iyx::ftf, Lists::reverse);
   }

   private static List ftf(List var0, List var1) {
      var0.addAll(var1);
      return var0;
   }

   private static void uzi(List var0, Object var1) {
      var0.add(var1);
   }
}
