package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$z1e implements StructureOceanMonumentPieces$cnm {
   private StructureOceanMonumentPieces$z1e() {
   }

   @Override
   public boolean a1z(StructureOceanMonumentPieces$man var1) {
      return true;
   }

   @Override
   public StructureOceanMonumentPieces$Piece a1a(vt2 var1, StructureOceanMonumentPieces$man var2, Random var3) {
      var2.s0n = true;
      return new StructureOceanMonumentPieces$SimpleRoom(var1, var2, var3);
   }

   public StructureOceanMonumentPieces$z1e(StructureOceanMonumentPieces$1 var1) {
      this();
   }
}
