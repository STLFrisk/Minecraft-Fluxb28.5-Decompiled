import us.myles.ViaVersion.api.data.UserConnection;
import us.myles.ViaVersion.api.platform.ViaConnectionManager;

public class kle extends ViaConnectionManager {
   public boolean isFrontEnd(UserConnection var1) {
      int var2 = OpaquePredicate.b();

      try {
         boolean var10000 = var1 instanceof j25;
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

   private static oov a(oov var0) {
      return var0;
   }
}
