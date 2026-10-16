import java.util.Random;

public class f26 extends d26 {
   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      int var4 = t9d.b();

      int var10000;
      label33: {
         label32: {
            try {
               var10000 = var3;
               if (var4 == 0) {
                  break label33;
               }

               if (var3 <= 3) {
                  break label32;
               }
            } catch (oov var6) {
               throw b(var6);
            }

            var3 = 3;
         }

         var10000 = var2.nextInt(10 - var3 * 3);
      }

      try {
         if (var10000 == 0) {
            return xbr.hgw;
         }
      } catch (oov var5) {
         throw b(var5);
      }

      return u7m.gfm(this);
   }

   @Override
   public _mi uoz(zfz var1) {
      return _mi.eo9;
   }

   private static oov b(oov var0) {
      return var0;
   }
}
