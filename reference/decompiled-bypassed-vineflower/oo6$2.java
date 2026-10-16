import java.util.Random;

public class oo6$2 extends py3 {
   public final oo6 bkm;

   public oo6$2(oo6 var1, int var2, gyu var3) {
      super(var2, var3);
      this.bkm = var1;
   }

   @Override
   public e9q jk9(Random var1) {
      try {
         if (var1.nextBoolean()) {
            return oo6.g9i;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return oo6.bs0;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
