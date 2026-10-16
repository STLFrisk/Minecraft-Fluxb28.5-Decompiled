package net.minecraft.world.gen.structure;

import java.util.Random;

public class ComponentScatteredFeaturePieces$JunglePyramid$d3n extends xi1$e0c {
   private ComponentScatteredFeaturePieces$JunglePyramid$d3n() {
   }

   @Override
   public void phr(Random param1, int param2, int param3, int param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 6
      // 05: aload 1
      // 06: invokevirtual java/util/Random.nextFloat ()F
      // 09: ldc 0.4
      // 0b: nop
      // 0c: fcmpg
      // 0d: ifge 26
      // 10: aload 0
      // 11: getstatic ox_.a3_ Le0x;
      // 14: invokevirtual e0x.l4i ()Lzfz;
      // 17: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n.n0c Lzfz;
      // 1a: aload 6
      // 1c: ifnonnull 37
      // 1f: goto 26
      // 22: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: getstatic ox_.jwk Le0x;
      // 2a: invokevirtual e0x.l4i ()Lzfz;
      // 2d: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n.n0c Lzfz;
      // 30: goto 37
      // 33: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n.a (Loov;)Loov;
      // 36: athrow
      // 37: return
   }

   public ComponentScatteredFeaturePieces$JunglePyramid$d3n(ComponentScatteredFeaturePieces$1 var1) {
      this();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
