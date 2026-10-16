package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$csp implements StructureOceanMonumentPieces$cnm {
   private StructureOceanMonumentPieces$csp() {
   }

   @Override
   public boolean a1z(StructureOceanMonumentPieces$man param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 2
      // 04: aload 1
      // 05: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 08: getstatic vt2.zk4 Lvt2;
      // 0b: invokevirtual vt2.c3s ()I
      // 0e: baload
      // 0f: aload 2
      // 10: ifnull 32
      // 13: ifeq 44
      // 16: goto 1d
      // 19: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$csp.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 1
      // 1e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 21: getstatic vt2.zk4 Lvt2;
      // 24: invokevirtual vt2.c3s ()I
      // 27: aaload
      // 28: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$csp.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 2
      // 33: ifnull 41
      // 36: ifne 44
      // 39: goto 40
      // 3c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$csp.a (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 45
      // 44: bipush 0
      // 45: ireturn
   }

   @Override
   public StructureOceanMonumentPieces$Piece a1a(vt2 var1, StructureOceanMonumentPieces$man var2, Random var3) {
      var2.s0n = true;
      var2.fpr[vt2.zk4.c3s()].s0n = true;
      return new StructureOceanMonumentPieces$DoubleXRoom(var1, var2, var3);
   }

   public StructureOceanMonumentPieces$csp(StructureOceanMonumentPieces$1 var1) {
      this();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
