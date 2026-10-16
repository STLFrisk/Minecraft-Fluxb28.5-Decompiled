import com.google.common.base.Objects;
import java.util.List;

public class h61 {
   public h61(wra var1, List var2, int var3) {
      this.hpl = var1;
      this.t6u = var2;
      this.ags = var3;
   }

   public sjk m3g(int var1) {
      int var2 = t9d.b();

      int var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 == 0) {
               break label27;
            }

            if (var1 < 0) {
               return al9._du;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      try {
         if (var10000 < this.t6u.size()) {
            return (sjk)Objects.firstNonNull(this.t6u.get(var1), al9._du);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return al9._du;
   }

   public int hys() {
      return this.ags;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
