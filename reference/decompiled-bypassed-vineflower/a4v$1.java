import com.google.common.base.Predicate;

public final class a4v$1 implements Predicate {
   public boolean lh4(vt2 var1) {
      try {
         if (var1 != vt2.rf3) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public boolean apply(Object var1) {
      return this.lh4((vt2)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
