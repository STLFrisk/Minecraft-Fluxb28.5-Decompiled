import com.google.common.base.Predicate;

public class ppl implements Predicate {
   public static ppl gbe(e0x var0) {
      return new ppl(var0);
   }

   public boolean sn3(zfz var1) {
      int var2 = t9d.c();

      zfz var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 != 0) {
               break label27;
            }

            if (var1 == null) {
               return false;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      try {
         if (var10000.r_y() == this.gd4) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   public boolean apply(Object var1) {
      return this.sn3((zfz)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
