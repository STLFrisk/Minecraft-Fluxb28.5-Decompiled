package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class MapGenStronghold$Start extends ijb {
   public MapGenStronghold$Start() {
   }

   public MapGenStronghold$Start(OpaquePredicate var1, Random var2, int var3, int var4) {
      super(var3, var4);
      EntityLivingBase[] var10000 = StructureStrongholdPieces$Stronghold.b();
      StructureStrongholdPieces.lp1();
      StructureStrongholdPieces$Stairs2 var6 = new StructureStrongholdPieces$Stairs2(0, var2, (var3 << 4) + 2, (var4 << 4) + 2);
      this.attack.add(var6);
      EntityLivingBase[] var5 = var10000;
      var6.vxr(var6, this.attack, var2);
      List var7 = var6.z8j;

      while (true) {
         if (!var7.isEmpty()) {
            int var8 = var2.nextInt(var7.size());
            xi1 var9 = (xi1)var7.remove(var8);

            try {
               var9.vxr(var6, this.attack, var2);
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
         this.t53(var1, var2, 10);
         break;
      }
   }

   private static oov b(oov var0) {
      return var0;
   }
}
