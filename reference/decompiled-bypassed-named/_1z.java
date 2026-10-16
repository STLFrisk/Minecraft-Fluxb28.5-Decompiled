import net.minecraft.network.play.client.C01PacketChatMessage;

@dr9$x0j(
   t2u = "say",
   io4 = {"<message>"},
   hjc = "Say the specified message."
)
public class _1z extends HwidProvider {
   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void xjl(String[] var1) {
      label45: {
         int var2 = OpaquePredicate.b();
         if (var1.length >= 1) {
            String var3 = "";
            String[] var4 = var1;
            int var5 = var1.length;
            int var6 = 0;

            label41: {
               while (var6 < var5) {
                  String var7 = var4[var6];
                  var3 = var3 + var7 + " ";

                  try {
                     var6++;
                     if (var2 == 0) {
                        break label41;
                     }

                     if (var2 == 0) {
                        break;
                     }
                  } catch (oov var11) {
                     throw a(var11);
                  }
               }

               this.rpq.vg8.lq7.sxi(new C01PacketChatMessage(var3));
            }

            try {
               if (var2 != 0) {
                  break label45;
               }
            } catch (oov var10) {
               boolean var10001 = false;
               throw a(var10);
            }
         }

         try {
            this.dhs();
         } catch (oov var9) {
            boolean var12 = false;
            throw a(var9);
         }
      }

      try {
         ;
      } catch (oov var8) {
         boolean var13 = false;
         throw a(var8);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
