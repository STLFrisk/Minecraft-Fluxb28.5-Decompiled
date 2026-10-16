import com.google.common.base.Predicate;

public class t6d$1 implements Predicate {
   public final vt2 jew;
   public final t6d _ee;

   public t6d$1(t6d var1, vt2 var2) {
      this._ee = var1;
      this.jew = var2;
   }

   public boolean vkg(EntityLivingBase var1) {
      int var2 = OpaquePredicate.c();

      EntityLivingBase var10000;
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
         if (var10000.u0f() == this.jew) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   public boolean apply(Object var1) {
      return this.vkg((EntityLivingBase)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
