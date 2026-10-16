package net.minecraft.world.gen.structure;

import java.util.Random;

public class MapGenScatteredFeature$Start extends ijb {
   public MapGenScatteredFeature$Start() {
   }

   public MapGenScatteredFeature$Start(t9d param1, Random param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: iload 3
      // 002: iload 4
      // 004: invokespecial ijb.<init> (II)V
      // 007: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 00a: aload 1
      // 00b: new mew
      // 00e: dup
      // 00f: iload 3
      // 010: bipush 16
      // 012: imul
      // 013: bipush 8
      // 015: iadd
      // 016: bipush 0
      // 017: iload 4
      // 019: bipush 16
      // 01b: imul
      // 01c: bipush 8
      // 01e: iadd
      // 01f: invokespecial mew.<init> (III)V
      // 022: invokevirtual t9d.getBiomeGenForCoords (Lmew;)Lgyu;
      // 025: astore 6
      // 027: astore 5
      // 029: aload 6
      // 02b: getstatic gyu.bli Lgyu;
      // 02e: aload 5
      // 030: ifnull 049
      // 033: if_acmpeq 0e1
      // 036: goto 03d
      // 039: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature$Start.b (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 6
      // 03f: getstatic gyu.tlt Lgyu;
      // 042: goto 049
      // 045: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature$Start.b (Loov;)Loov;
      // 048: athrow
      // 049: aload 5
      // 04b: ifnull 064
      // 04e: if_acmpeq 0e1
      // 051: goto 058
      // 054: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature$Start.b (Loov;)Loov;
      // 057: athrow
      // 058: aload 6
      // 05a: getstatic gyu.bpg Lgyu;
      // 05d: goto 064
      // 060: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature$Start.b (Loov;)Loov;
      // 063: athrow
      // 064: aload 5
      // 066: ifnull 0a1
      // 069: if_acmpne 095
      // 06c: goto 073
      // 06f: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature$Start.b (Loov;)Loov;
      // 072: athrow
      // 073: new net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut
      // 076: dup
      // 077: aload 2
      // 078: iload 3
      // 079: bipush 16
      // 07b: imul
      // 07c: iload 4
      // 07e: bipush 16
      // 080: imul
      // 081: invokespecial net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.<init> (Ljava/util/Random;II)V
      // 084: astore 7
      // 086: aload 0
      // 087: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature$Start.x9y Ljava/util/LinkedList;
      // 08a: aload 7
      // 08c: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
      // 08f: pop
      // 090: aload 5
      // 092: ifnonnull 0fe
      // 095: aload 6
      // 097: getstatic gyu._cz Lgyu;
      // 09a: goto 0a1
      // 09d: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature$Start.b (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 5
      // 0a3: ifnull 0bc
      // 0a6: if_acmpeq 0bf
      // 0a9: goto 0b0
      // 0ac: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature$Start.b (Loov;)Loov;
      // 0af: athrow
      // 0b0: aload 6
      // 0b2: getstatic gyu.txo Lgyu;
      // 0b5: goto 0bc
      // 0b8: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature$Start.b (Loov;)Loov;
      // 0bb: athrow
      // 0bc: if_acmpne 0fe
      // 0bf: new net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid
      // 0c2: dup
      // 0c3: aload 2
      // 0c4: iload 3
      // 0c5: bipush 16
      // 0c7: imul
      // 0c8: iload 4
      // 0ca: bipush 16
      // 0cc: imul
      // 0cd: invokespecial net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.<init> (Ljava/util/Random;II)V
      // 0d0: astore 7
      // 0d2: aload 0
      // 0d3: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature$Start.x9y Ljava/util/LinkedList;
      // 0d6: aload 7
      // 0d8: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
      // 0db: pop
      // 0dc: aload 5
      // 0de: ifnonnull 0fe
      // 0e1: new net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid
      // 0e4: dup
      // 0e5: aload 2
      // 0e6: iload 3
      // 0e7: bipush 16
      // 0e9: imul
      // 0ea: iload 4
      // 0ec: bipush 16
      // 0ee: imul
      // 0ef: invokespecial net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.<init> (Ljava/util/Random;II)V
      // 0f2: astore 7
      // 0f4: aload 0
      // 0f5: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature$Start.x9y Ljava/util/LinkedList;
      // 0f8: aload 7
      // 0fa: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
      // 0fd: pop
      // 0fe: aload 0
      // 0ff: invokevirtual net/minecraft/world/gen/structure/MapGenScatteredFeature$Start.eok ()V
      // 102: return
   }

   private static oov b(oov var0) {
      return var0;
   }
}
