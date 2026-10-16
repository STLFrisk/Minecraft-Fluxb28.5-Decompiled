import com.google.common.base.Predicate;

public final class u5m$cco$1 implements Predicate {
   public final u5m$bad yyd;

   public u5m$cco$1(u5m$bad var1) {
      this.yyd = var1;
   }

   public boolean wua(u5m$cco var1) {
      try {
         if (var1.ged() == this.yyd) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public boolean apply(Object var1) {
      return this.wua((u5m$cco)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
