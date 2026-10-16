package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class StructureNetherBridgePieces$Start extends StructureNetherBridgePieces$Crossing3 {
   public StructureNetherBridgePieces$r67 pqi;
   public List npl;
   public List d48;
   public List aka = Lists.newArrayList();

   public StructureNetherBridgePieces$Start() {
   }

   public StructureNetherBridgePieces$Start(Random var1, int var2, int var3) {
      super(var1, var2, var3);
      this.npl = Lists.newArrayList();
      StructureNetherBridgePieces$r67[] var5 = StructureNetherBridgePieces.wrz();
      EntityLivingBase[] var10000 = StructureStrongholdPieces$Stronghold.b();
      int var6 = var5.length;
      EntityLivingBase[] var4 = var10000;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            StructureNetherBridgePieces$r67 var8 = var5[var7];

            try {
               var8.m3g = 0;
               this.npl.add(var8);
               var7++;
               if (var4 == null) {
                  break;
               }

               if (var4 != null) {
                  continue;
               }
            } catch (oov var9) {
               throw c(var9);
            }
         }

         this.d48 = Lists.newArrayList();
         var5 = StructureNetherBridgePieces.jz0();
         var6 = var5.length;
         break;
      }

      var7 = 0;

      while (var7 < var6) {
         StructureNetherBridgePieces$r67 var11 = var5[var7];
         var11.m3g = 0;
         this.d48.add(var11);
         var7++;
         if (var4 == null) {
            break;
         }
      }
   }

   @Override
   public void oqf(bdo var1) {
      super.oqf(var1);
   }

   @Override
   public void z0d(bdo var1) {
      super.z0d(var1);
   }

   private static oov c(oov var0) {
      return var0;
   }
}
