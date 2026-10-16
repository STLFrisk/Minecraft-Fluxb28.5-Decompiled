package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureMineshaftStart extends ijb {
   public StructureMineshaftStart() {
   }

   public StructureMineshaftStart(t9d var1, Random var2, int var3, int var4) {
      super(var3, var4);
      StructureMineshaftPieces$Room var5 = new StructureMineshaftPieces$Room(0, var2, (var3 << 4) + 2, (var4 << 4) + 2);
      this.x9y.add(var5);
      var5.vxr(var5, this.x9y, var2);
      this.eok();
      this.t53(var1, var2, 10);
   }
}
