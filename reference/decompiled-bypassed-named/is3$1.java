import com.google.common.base.Predicate;

public final class is3$1 implements Predicate {
   public boolean dto(String var1) {
      int var2 = OpaquePredicate.b();

      try {
         boolean var10000 = jfy.hez(var1);
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

   public boolean apply(Object var1) {
      return this.dto((String)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
