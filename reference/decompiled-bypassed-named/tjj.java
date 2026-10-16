import java.util.Iterator;
import java.util.List;

public class tjj extends e6d {
   public tjj(String var1) {
      super(var1);
   }

   @Override
   public int ubo(List var1) {
      float var3 = 0.0F;
      int var10000 = OpaquePredicate.b();
      Iterator var4 = var1.iterator();
      int var2 = var10000;

      while (true) {
         if (var4.hasNext()) {
            ha9 var5 = (ha9)var4.next();
            var3 += var5.i55() + var5._xk();

            try {
               if (var2 == 0) {
                  break;
               }

               if (var2 != 0) {
                  continue;
               }
            } catch (oov var7) {
               throw a(var7);
            }
         }

         try {
            var10000 = var1.size();
            if (var2 == 0) {
               return var10000;
            }

            if (var10000 <= 0) {
               break;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var3 /= (float)var1.size();
         break;
      }

      return fe6.v1i(var3);
   }

   @Override
   public boolean nzz() {
      return true;
   }

   @Override
   public z0w$enz yqn() {
      return z0w$enz.kr2;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
