package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class MapGenNetherBridge$Start extends ijb {
   public MapGenNetherBridge$Start() {
   }

   public MapGenNetherBridge$Start(t9d var1, Random var2, int var3, int var4) {
      super(var3, var4);
      StructureNetherBridgePieces$Start var6 = new StructureNetherBridgePieces$Start(var2, (var3 << 4) + 2, (var4 << 4) + 2);
      this.x9y.add(var6);
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      var6.vxr(var6, this.x9y, var2);
      i2h[] var5 = var10000;
      List var7 = var6.aka;

      while (true) {
         if (!var7.isEmpty()) {
            int var8 = var2.nextInt(var7.size());
            xi1 var9 = (xi1)var7.remove(var8);

            try {
               var9.vxr(var6, this.x9y, var2);
               if (var5 == null) {
                  break;
               }

               if (var5 != null) {
                  continue;
               }
            } catch (oov var10) {
               throw b(var10);
            }
         }

         this.eok();
         this.qi9(var1, var2, 48, 70);
         break;
      }
   }

   private static oov b(oov var0) {
      return var0;
   }
}
