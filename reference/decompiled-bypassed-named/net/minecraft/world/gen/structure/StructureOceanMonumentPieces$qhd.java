package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$qhd implements StructureOceanMonumentPieces$cnm {
   private StructureOceanMonumentPieces$qhd() {
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
      // 08: getstatic vt2.te4 Lvt2;
      // 0b: invokevirtual vt2.c3s ()I
      // 0e: baload
      // 0f: aload 2
      // 10: ifnull 2f
      // 13: ifne a1
      // 16: goto 1d
      // 19: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qhd.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 1
      // 1e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 21: getstatic vt2.zk4 Lvt2;
      // 24: invokevirtual vt2.c3s ()I
      // 27: baload
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qhd.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 2
      // 30: ifnull 4f
      // 33: ifne a1
      // 36: goto 3d
      // 39: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qhd.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 1
      // 3e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 41: getstatic vt2.z9q Lvt2;
      // 44: invokevirtual vt2.c3s ()I
      // 47: baload
      // 48: goto 4f
      // 4b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qhd.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 2
      // 50: ifnull 6f
      // 53: ifne a1
      // 56: goto 5d
      // 59: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qhd.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 1
      // 5e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 61: getstatic vt2.mxp Lvt2;
      // 64: invokevirtual vt2.c3s ()I
      // 67: baload
      // 68: goto 6f
      // 6b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qhd.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 2
      // 70: ifnull 8f
      // 73: ifne a1
      // 76: goto 7d
      // 79: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qhd.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 1
      // 7e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 81: getstatic vt2.rf3 Lvt2;
      // 84: invokevirtual vt2.c3s ()I
      // 87: baload
      // 88: goto 8f
      // 8b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qhd.a (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 2
      // 90: ifnull 9e
      // 93: ifne a1
      // 96: goto 9d
      // 99: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qhd.a (Loov;)Loov;
      // 9c: athrow
      // 9d: bipush 1
      // 9e: goto a2
      // a1: bipush 0
      // a2: ireturn
   }

   @Override
   public StructureOceanMonumentPieces$Piece a1a(vt2 var1, StructureOceanMonumentPieces$man var2, Random var3) {
      var2.s0n = true;
      return new StructureOceanMonumentPieces$SimpleTopRoom(var1, var2, var3);
   }

   public StructureOceanMonumentPieces$qhd(StructureOceanMonumentPieces$1 var1) {
      this();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
