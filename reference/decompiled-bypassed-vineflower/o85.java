import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class o85 extends vd3 {
   public o85(File var1) {
      super(var1);
   }

   @Override
   public syv fna(JsonObject var1) {
      return new x6m(var1);
   }

   public boolean nxv(SocketAddress var1) {
      String var2 = this.h95(var1);
      return this.vb_(var2);
   }

   public x6m lyx(SocketAddress var1) {
      String var2 = this.h95(var1);
      return (x6m)this.fsa(var2);
   }

   private String h95(SocketAddress var1) {
      int var2 = t9d.b();
      String var3 = var1.toString();

      boolean var10000;
      label34: {
         label33: {
            try {
               var10000 = var3.contains("/");
               if (var2 == 0) {
                  break label34;
               }

               if (!var10000) {
                  break label33;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var3 = var3.substring(var3.indexOf(47) + 1);
         }

         try {
            if (var2 == 0) {
               return var3;
            }

            var10000 = var3.contains(":");
         } catch (oov var4) {
            throw a(var4);
         }
      }

      if (var10000) {
         var3 = var3.substring(0, var3.indexOf(58));
      }

      return var3;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
