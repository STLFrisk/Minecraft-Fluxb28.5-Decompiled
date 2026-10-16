import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;

public class qx_ extends zb_ {
   public qx_(String var1, Collection var2) {
      super(var1, vt2.class, var2);
   }

   public static qx_ jap(String var0) {
      return q0o(var0, Predicates.alwaysTrue());
   }

   public static qx_ q0o(String var0, Predicate var1) {
      return a8o(var0, Collections2.filter(Lists.newArrayList(vt2.values()), var1));
   }

   public static qx_ a8o(String var0, Collection var1) {
      return new qx_(var0, var1);
   }
}
