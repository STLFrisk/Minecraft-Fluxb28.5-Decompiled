import com.google.common.base.Predicate;

public class u5m$1 implements Predicate {
   public final u5m wm0;

   public u5m$1(u5m var1) {
      this.wm0 = var1;
   }

   public boolean r9s(u5m$cco var1) {
      try {
         if (var1.ged() == this.wm0.oj4()) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public boolean apply(Object var1) {
      return this.r9s((u5m$cco)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
