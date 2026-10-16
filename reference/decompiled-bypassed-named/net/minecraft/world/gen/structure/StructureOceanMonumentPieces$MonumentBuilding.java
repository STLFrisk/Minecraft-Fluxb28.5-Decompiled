package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class StructureOceanMonumentPieces$MonumentBuilding extends StructureOceanMonumentPieces$Piece {
   private StructureOceanMonumentPieces$man pml;
   private StructureOceanMonumentPieces$man ul4;
   private List jd_ = Lists.newArrayList();

   public StructureOceanMonumentPieces$MonumentBuilding() {
   }

   public StructureOceanMonumentPieces$MonumentBuilding(Random param1, int param2, int param3, vt2 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.<init> (I)V
      // 005: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 008: aload 0
      // 009: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 00c: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.jd_ Ljava/util/List;
      // 00f: astore 5
      // 011: aload 0
      // 012: aload 5
      // 014: ifnull 075
      // 017: aload 4
      // 019: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.p7m Lvt2;
      // 01c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$1.hyi [I
      // 01f: aload 0
      // 020: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.p7m Lvt2;
      // 023: invokevirtual vt2.ordinal ()I
      // 026: iaload
      // 027: lookupswitch 70 2 1 29 2 29
      // 040: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 0
      // 045: new yve
      // 048: dup
      // 049: iload 2
      // 04a: bipush 39
      // 04c: iload 3
      // 04d: iload 2
      // 04e: bipush 58
      // 050: iadd
      // 051: bipush 1
      // 052: isub
      // 053: bipush 61
      // 055: iload 3
      // 056: bipush 58
      // 058: iadd
      // 059: bipush 1
      // 05a: isub
      // 05b: invokespecial yve.<init> (IIIIII)V
      // 05e: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.yqm Lyve;
      // 061: aload 5
      // 063: ifnonnull 091
      // 066: goto 06d
      // 069: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 06c: athrow
      // 06d: aload 0
      // 06e: goto 075
      // 071: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 074: athrow
      // 075: new yve
      // 078: dup
      // 079: iload 2
      // 07a: bipush 39
      // 07c: iload 3
      // 07d: iload 2
      // 07e: bipush 58
      // 080: iadd
      // 081: bipush 1
      // 082: isub
      // 083: bipush 61
      // 085: iload 3
      // 086: bipush 58
      // 088: iadd
      // 089: bipush 1
      // 08a: isub
      // 08b: invokespecial yve.<init> (IIIIII)V
      // 08e: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.yqm Lyve;
      // 091: aload 0
      // 092: aload 1
      // 093: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.o3k (Ljava/util/Random;)Ljava/util/List;
      // 096: astore 6
      // 098: aload 0
      // 099: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.pml Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 09c: bipush 1
      // 09d: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 0a0: aload 0
      // 0a1: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.jd_ Ljava/util/List;
      // 0a4: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$EntryRoom
      // 0a7: dup
      // 0a8: aload 0
      // 0a9: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.p7m Lvt2;
      // 0ac: aload 0
      // 0ad: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.pml Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 0b0: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$EntryRoom.<init> (Lvt2;Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;)V
      // 0b3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b8: pop
      // 0b9: aload 0
      // 0ba: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.jd_ Ljava/util/List;
      // 0bd: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom
      // 0c0: dup
      // 0c1: aload 0
      // 0c2: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.p7m Lvt2;
      // 0c5: aload 0
      // 0c6: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.ul4 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 0c9: aload 1
      // 0ca: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.<init> (Lvt2;Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;Ljava/util/Random;)V
      // 0cd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0d2: pop
      // 0d3: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 0d6: astore 7
      // 0d8: aload 7
      // 0da: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$g72
      // 0dd: dup
      // 0de: aconst_null
      // 0df: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$g72.<init> (Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$1;)V
      // 0e2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0e7: pop
      // 0e8: aload 7
      // 0ea: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$kf4
      // 0ed: dup
      // 0ee: aconst_null
      // 0ef: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$kf4.<init> (Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$1;)V
      // 0f2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f7: pop
      // 0f8: aload 7
      // 0fa: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$ssb
      // 0fd: dup
      // 0fe: aconst_null
      // 0ff: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$ssb.<init> (Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$1;)V
      // 102: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 107: pop
      // 108: aload 7
      // 10a: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$csp
      // 10d: dup
      // 10e: aconst_null
      // 10f: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$csp.<init> (Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$1;)V
      // 112: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 117: pop
      // 118: aload 7
      // 11a: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qtx
      // 11d: dup
      // 11e: aconst_null
      // 11f: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qtx.<init> (Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$1;)V
      // 122: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 127: pop
      // 128: aload 7
      // 12a: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qhd
      // 12d: dup
      // 12e: aconst_null
      // 12f: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$qhd.<init> (Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$1;)V
      // 132: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 137: pop
      // 138: aload 7
      // 13a: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$z1e
      // 13d: dup
      // 13e: aconst_null
      // 13f: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$z1e.<init> (Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$1;)V
      // 142: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 147: pop
      // 148: aload 6
      // 14a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 14f: astore 8
      // 151: aload 8
      // 153: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 158: ifeq 1e4
      // 15b: aload 8
      // 15d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 162: checkcast net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man
      // 165: astore 9
      // 167: aload 9
      // 169: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 16c: aload 5
      // 16e: ifnull 1eb
      // 171: aload 5
      // 173: ifnull 193
      // 176: goto 17d
      // 179: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 17c: athrow
      // 17d: ifne 1df
      // 180: goto 187
      // 183: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 186: athrow
      // 187: aload 9
      // 189: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.w5c ()Z
      // 18c: goto 193
      // 18f: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 192: athrow
      // 193: ifne 1df
      // 196: aload 7
      // 198: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 19d: astore 10
      // 19f: aload 10
      // 1a1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a6: ifne 1ac
      // 1a9: goto 151
      // 1ac: aload 10
      // 1ae: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1b3: checkcast net/minecraft/world/gen/structure/StructureOceanMonumentPieces$cnm
      // 1b6: astore 11
      // 1b8: aload 11
      // 1ba: aload 9
      // 1bc: invokeinterface net/minecraft/world/gen/structure/StructureOceanMonumentPieces$cnm.a1z (Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;)Z 2
      // 1c1: ifeq 19f
      // 1c4: goto 1c7
      // 1c7: aload 0
      // 1c8: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.jd_ Ljava/util/List;
      // 1cb: aload 11
      // 1cd: aload 0
      // 1ce: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.p7m Lvt2;
      // 1d1: aload 9
      // 1d3: aload 1
      // 1d4: invokeinterface net/minecraft/world/gen/structure/StructureOceanMonumentPieces$cnm.a1a (Lvt2;Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;Ljava/util/Random;)Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece; 4
      // 1d9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1de: pop
      // 1df: aload 5
      // 1e1: ifnonnull 151
      // 1e4: aload 0
      // 1e5: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.yqm Lyve;
      // 1e8: getfield yve._3o I
      // 1eb: istore 8
      // 1ed: aload 0
      // 1ee: bipush 9
      // 1f0: bipush 22
      // 1f2: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.q__ (II)I
      // 1f5: istore 9
      // 1f7: aload 0
      // 1f8: bipush 9
      // 1fa: bipush 22
      // 1fc: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._ye (II)I
      // 1ff: istore 10
      // 201: aload 0
      // 202: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.jd_ Ljava/util/List;
      // 205: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 20a: astore 11
      // 20c: aload 11
      // 20e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 213: ifeq 241
      // 216: aload 11
      // 218: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21d: checkcast net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece
      // 220: astore 12
      // 222: aload 12
      // 224: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.q1q ()Lyve;
      // 227: aload 5
      // 229: ifnull 26b
      // 22c: iload 9
      // 22e: iload 8
      // 230: iload 10
      // 232: invokevirtual yve.gbw (III)V
      // 235: aload 5
      // 237: ifnonnull 20c
      // 23a: goto 241
      // 23d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 240: athrow
      // 241: aload 0
      // 242: bipush 1
      // 243: bipush 1
      // 244: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.q__ (II)I
      // 247: aload 0
      // 248: bipush 1
      // 249: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._tw (I)I
      // 24c: aload 0
      // 24d: bipush 1
      // 24e: bipush 1
      // 24f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._ye (II)I
      // 252: aload 0
      // 253: bipush 23
      // 255: bipush 21
      // 257: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.q__ (II)I
      // 25a: aload 0
      // 25b: bipush 8
      // 25d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._tw (I)I
      // 260: aload 0
      // 261: bipush 23
      // 263: bipush 21
      // 265: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._ye (II)I
      // 268: invokestatic yve.t9e (IIIIII)Lyve;
      // 26b: astore 11
      // 26d: aload 0
      // 26e: bipush 34
      // 270: bipush 1
      // 271: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.q__ (II)I
      // 274: aload 0
      // 275: bipush 1
      // 276: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._tw (I)I
      // 279: aload 0
      // 27a: bipush 34
      // 27c: bipush 1
      // 27d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._ye (II)I
      // 280: aload 0
      // 281: bipush 56
      // 283: bipush 21
      // 285: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.q__ (II)I
      // 288: aload 0
      // 289: bipush 8
      // 28b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._tw (I)I
      // 28e: aload 0
      // 28f: bipush 56
      // 291: bipush 21
      // 293: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._ye (II)I
      // 296: invokestatic yve.t9e (IIIIII)Lyve;
      // 299: astore 12
      // 29b: aload 0
      // 29c: bipush 22
      // 29e: bipush 22
      // 2a0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.q__ (II)I
      // 2a3: aload 0
      // 2a4: bipush 13
      // 2a6: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._tw (I)I
      // 2a9: aload 0
      // 2aa: bipush 22
      // 2ac: bipush 22
      // 2ae: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._ye (II)I
      // 2b1: aload 0
      // 2b2: bipush 35
      // 2b4: bipush 35
      // 2b6: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.q__ (II)I
      // 2b9: aload 0
      // 2ba: bipush 17
      // 2bc: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._tw (I)I
      // 2bf: aload 0
      // 2c0: bipush 35
      // 2c2: bipush 35
      // 2c4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding._ye (II)I
      // 2c7: invokestatic yve.t9e (IIIIII)Lyve;
      // 2ca: astore 13
      // 2cc: aload 1
      // 2cd: invokevirtual java/util/Random.nextInt ()I
      // 2d0: istore 14
      // 2d2: aload 0
      // 2d3: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.jd_ Ljava/util/List;
      // 2d6: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$WingRoom
      // 2d9: dup
      // 2da: aload 0
      // 2db: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.p7m Lvt2;
      // 2de: aload 11
      // 2e0: iload 14
      // 2e2: iinc 14 1
      // 2e5: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$WingRoom.<init> (Lvt2;Lyve;I)V
      // 2e8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2ed: pop
      // 2ee: aload 0
      // 2ef: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.jd_ Ljava/util/List;
      // 2f2: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$WingRoom
      // 2f5: dup
      // 2f6: aload 0
      // 2f7: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.p7m Lvt2;
      // 2fa: aload 12
      // 2fc: iload 14
      // 2fe: iinc 14 1
      // 301: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$WingRoom.<init> (Lvt2;Lyve;I)V
      // 304: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 309: pop
      // 30a: aload 0
      // 30b: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.jd_ Ljava/util/List;
      // 30e: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Penthouse
      // 311: dup
      // 312: aload 0
      // 313: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.p7m Lvt2;
      // 316: aload 13
      // 318: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Penthouse.<init> (Lvt2;Lyve;)V
      // 31b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 320: pop
      // 321: return
   }

   private List o3k(Random param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 75
      // 002: anewarray 6
      // 005: astore 3
      // 006: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 009: bipush 0
      // 00a: istore 4
      // 00c: astore 2
      // 00d: iload 4
      // 00f: bipush 5
      // 010: if_icmpge 054
      // 013: bipush 0
      // 014: aload 2
      // 015: ifnull 055
      // 018: istore 5
      // 01a: iload 5
      // 01c: bipush 4
      // 01d: if_icmpge 04d
      // 020: bipush 0
      // 021: istore 6
      // 023: iload 4
      // 025: iload 6
      // 027: iload 5
      // 029: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a5w (III)I
      // 02c: istore 7
      // 02e: aload 3
      // 02f: iload 7
      // 031: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man
      // 034: dup
      // 035: iload 7
      // 037: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.<init> (I)V
      // 03a: aastore
      // 03b: iinc 5 1
      // 03e: aload 2
      // 03f: ifnull 050
      // 042: aload 2
      // 043: ifnonnull 01a
      // 046: goto 04d
      // 049: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 04c: athrow
      // 04d: iinc 4 1
      // 050: aload 2
      // 051: ifnonnull 00d
      // 054: bipush 0
      // 055: istore 4
      // 057: iload 4
      // 059: bipush 5
      // 05a: if_icmpge 09e
      // 05d: bipush 0
      // 05e: aload 2
      // 05f: ifnull 09f
      // 062: istore 5
      // 064: iload 5
      // 066: bipush 4
      // 067: if_icmpge 097
      // 06a: bipush 1
      // 06b: istore 6
      // 06d: iload 4
      // 06f: iload 6
      // 071: iload 5
      // 073: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a5w (III)I
      // 076: istore 7
      // 078: aload 3
      // 079: iload 7
      // 07b: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man
      // 07e: dup
      // 07f: iload 7
      // 081: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.<init> (I)V
      // 084: aastore
      // 085: iinc 5 1
      // 088: aload 2
      // 089: ifnull 09a
      // 08c: aload 2
      // 08d: ifnonnull 064
      // 090: goto 097
      // 093: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 096: athrow
      // 097: iinc 4 1
      // 09a: aload 2
      // 09b: ifnonnull 057
      // 09e: bipush 1
      // 09f: istore 4
      // 0a1: iload 4
      // 0a3: bipush 4
      // 0a4: if_icmpge 0e8
      // 0a7: bipush 0
      // 0a8: aload 2
      // 0a9: ifnull 0f2
      // 0ac: istore 5
      // 0ae: iload 5
      // 0b0: bipush 2
      // 0b1: if_icmpge 0e1
      // 0b4: bipush 2
      // 0b5: istore 6
      // 0b7: iload 4
      // 0b9: iload 6
      // 0bb: iload 5
      // 0bd: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a5w (III)I
      // 0c0: istore 7
      // 0c2: aload 3
      // 0c3: iload 7
      // 0c5: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man
      // 0c8: dup
      // 0c9: iload 7
      // 0cb: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.<init> (I)V
      // 0ce: aastore
      // 0cf: iinc 5 1
      // 0d2: aload 2
      // 0d3: ifnull 0e4
      // 0d6: aload 2
      // 0d7: ifnonnull 0ae
      // 0da: goto 0e1
      // 0dd: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: iinc 4 1
      // 0e4: aload 2
      // 0e5: ifnonnull 0a1
      // 0e8: aload 0
      // 0e9: aload 3
      // 0ea: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.j_o I
      // 0ed: aaload
      // 0ee: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.pml Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 0f1: bipush 0
      // 0f2: istore 4
      // 0f4: iload 4
      // 0f6: bipush 5
      // 0f7: if_icmpge 26a
      // 0fa: bipush 0
      // 0fb: istore 5
      // 0fd: iload 5
      // 0ff: bipush 5
      // 100: if_icmpge 263
      // 103: bipush 0
      // 104: aload 2
      // 105: ifnull 0f6
      // 108: istore 6
      // 10a: iload 6
      // 10c: bipush 3
      // 10d: if_icmpge 25c
      // 110: iload 4
      // 112: iload 6
      // 114: iload 5
      // 116: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a5w (III)I
      // 119: istore 7
      // 11b: aload 2
      // 11c: ifnull 258
      // 11f: aload 3
      // 120: iload 7
      // 122: aaload
      // 123: aload 2
      // 124: ifnull 26f
      // 127: goto 12e
      // 12a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 12d: athrow
      // 12e: ifnull 255
      // 131: goto 138
      // 134: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 137: athrow
      // 138: invokestatic vt2.values ()[Lvt2;
      // 13b: astore 8
      // 13d: aload 8
      // 13f: arraylength
      // 140: istore 9
      // 142: bipush 0
      // 143: istore 10
      // 145: iload 10
      // 147: iload 9
      // 149: if_icmpge 255
      // 14c: aload 8
      // 14e: iload 10
      // 150: aaload
      // 151: astore 11
      // 153: iload 4
      // 155: aload 11
      // 157: invokevirtual vt2.n67 ()I
      // 15a: iadd
      // 15b: istore 12
      // 15d: iload 6
      // 15f: aload 11
      // 161: invokevirtual vt2.g5t ()I
      // 164: iadd
      // 165: istore 13
      // 167: iload 5
      // 169: aload 11
      // 16b: invokevirtual vt2.ozy ()I
      // 16e: iadd
      // 16f: istore 14
      // 171: aload 2
      // 172: ifnull 251
      // 175: iload 12
      // 177: aload 2
      // 178: ifnull 10c
      // 17b: goto 182
      // 17e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 181: athrow
      // 182: iflt 24e
      // 185: iload 12
      // 187: aload 2
      // 188: ifnull 1a6
      // 18b: goto 192
      // 18e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 191: athrow
      // 192: bipush 5
      // 193: if_icmpge 24e
      // 196: goto 19d
      // 199: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 19c: athrow
      // 19d: iload 14
      // 19f: goto 1a6
      // 1a2: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: aload 2
      // 1a7: ifnull 1b6
      // 1aa: iflt 24e
      // 1ad: goto 1b4
      // 1b0: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: iload 14
      // 1b6: aload 2
      // 1b7: ifnull 1ce
      // 1ba: bipush 5
      // 1bb: if_icmpge 24e
      // 1be: goto 1c5
      // 1c1: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: iload 13
      // 1c7: goto 1ce
      // 1ca: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: aload 2
      // 1cf: ifnull 1de
      // 1d2: iflt 24e
      // 1d5: goto 1dc
      // 1d8: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: iload 13
      // 1de: bipush 3
      // 1df: aload 2
      // 1e0: ifnull 1f8
      // 1e3: if_icmpge 24e
      // 1e6: goto 1ed
      // 1e9: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: iload 12
      // 1ef: iload 13
      // 1f1: goto 1f8
      // 1f4: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1f7: athrow
      // 1f8: iload 14
      // 1fa: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a5w (III)I
      // 1fd: istore 15
      // 1ff: aload 2
      // 200: ifnull 251
      // 203: aload 3
      // 204: iload 15
      // 206: aaload
      // 207: ifnull 24e
      // 20a: goto 211
      // 20d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 210: athrow
      // 211: iload 14
      // 213: iload 5
      // 215: if_icmpeq 23a
      // 218: goto 21f
      // 21b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 21e: athrow
      // 21f: aload 3
      // 220: iload 7
      // 222: aaload
      // 223: aload 11
      // 225: invokevirtual vt2.b4b ()Lvt2;
      // 228: aload 3
      // 229: iload 15
      // 22b: aaload
      // 22c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.di1 (Lvt2;Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;)V
      // 22f: aload 2
      // 230: ifnonnull 24e
      // 233: goto 23a
      // 236: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 239: athrow
      // 23a: aload 3
      // 23b: iload 7
      // 23d: aaload
      // 23e: aload 11
      // 240: aload 3
      // 241: iload 15
      // 243: aaload
      // 244: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.di1 (Lvt2;Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;)V
      // 247: goto 24e
      // 24a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 24d: athrow
      // 24e: iinc 10 1
      // 251: aload 2
      // 252: ifnonnull 145
      // 255: iinc 6 1
      // 258: aload 2
      // 259: ifnonnull 10a
      // 25c: iinc 5 1
      // 25f: aload 2
      // 260: ifnonnull 0fd
      // 263: iinc 4 1
      // 266: aload 2
      // 267: ifnonnull 0f4
      // 26a: aload 3
      // 26b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.qmu I
      // 26e: aaload
      // 26f: getstatic vt2.rf3 Lvt2;
      // 272: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man
      // 275: dup
      // 276: sipush 1003
      // 279: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.<init> (I)V
      // 27c: dup
      // 27d: astore 4
      // 27f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.di1 (Lvt2;Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;)V
      // 282: aload 3
      // 283: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.zjn I
      // 286: aaload
      // 287: getstatic vt2.mxp Lvt2;
      // 28a: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man
      // 28d: dup
      // 28e: sipush 1001
      // 291: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.<init> (I)V
      // 294: dup
      // 295: astore 5
      // 297: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.di1 (Lvt2;Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;)V
      // 29a: aload 3
      // 29b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.y5e I
      // 29e: aaload
      // 29f: getstatic vt2.mxp Lvt2;
      // 2a2: new net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man
      // 2a5: dup
      // 2a6: sipush 1002
      // 2a9: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.<init> (I)V
      // 2ac: dup
      // 2ad: astore 6
      // 2af: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.di1 (Lvt2;Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;)V
      // 2b2: aload 4
      // 2b4: bipush 1
      // 2b5: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 2b8: aload 5
      // 2ba: bipush 1
      // 2bb: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 2be: aload 6
      // 2c0: bipush 1
      // 2c1: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 2c4: aload 0
      // 2c5: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.pml Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 2c8: bipush 1
      // 2c9: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.txj Z
      // 2cc: aload 0
      // 2cd: aload 3
      // 2ce: aload 1
      // 2cf: bipush 4
      // 2d0: invokevirtual java/util/Random.nextInt (I)I
      // 2d3: bipush 0
      // 2d4: bipush 2
      // 2d5: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a5w (III)I
      // 2d8: aaload
      // 2d9: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.ul4 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 2dc: aload 0
      // 2dd: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.ul4 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 2e0: bipush 1
      // 2e1: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 2e4: aload 0
      // 2e5: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.ul4 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 2e8: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 2eb: getstatic vt2.zk4 Lvt2;
      // 2ee: invokevirtual vt2.c3s ()I
      // 2f1: aaload
      // 2f2: bipush 1
      // 2f3: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 2f6: aload 0
      // 2f7: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.ul4 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 2fa: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 2fd: getstatic vt2.z9q Lvt2;
      // 300: invokevirtual vt2.c3s ()I
      // 303: aaload
      // 304: bipush 1
      // 305: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 308: aload 0
      // 309: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.ul4 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 30c: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 30f: getstatic vt2.zk4 Lvt2;
      // 312: invokevirtual vt2.c3s ()I
      // 315: aaload
      // 316: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 319: getstatic vt2.z9q Lvt2;
      // 31c: invokevirtual vt2.c3s ()I
      // 31f: aaload
      // 320: bipush 1
      // 321: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 324: aload 0
      // 325: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.ul4 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 328: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 32b: getstatic vt2.rf3 Lvt2;
      // 32e: invokevirtual vt2.c3s ()I
      // 331: aaload
      // 332: bipush 1
      // 333: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 336: aload 0
      // 337: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.ul4 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 33a: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 33d: getstatic vt2.zk4 Lvt2;
      // 340: invokevirtual vt2.c3s ()I
      // 343: aaload
      // 344: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 347: getstatic vt2.rf3 Lvt2;
      // 34a: invokevirtual vt2.c3s ()I
      // 34d: aaload
      // 34e: bipush 1
      // 34f: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 352: aload 0
      // 353: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.ul4 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 356: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 359: getstatic vt2.z9q Lvt2;
      // 35c: invokevirtual vt2.c3s ()I
      // 35f: aaload
      // 360: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 363: getstatic vt2.rf3 Lvt2;
      // 366: invokevirtual vt2.c3s ()I
      // 369: aaload
      // 36a: bipush 1
      // 36b: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 36e: aload 0
      // 36f: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.ul4 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 372: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 375: getstatic vt2.zk4 Lvt2;
      // 378: invokevirtual vt2.c3s ()I
      // 37b: aaload
      // 37c: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 37f: getstatic vt2.z9q Lvt2;
      // 382: invokevirtual vt2.c3s ()I
      // 385: aaload
      // 386: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 389: getstatic vt2.rf3 Lvt2;
      // 38c: invokevirtual vt2.c3s ()I
      // 38f: aaload
      // 390: bipush 1
      // 391: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.s0n Z
      // 394: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 397: astore 7
      // 399: aload 3
      // 39a: astore 8
      // 39c: aload 8
      // 39e: arraylength
      // 39f: istore 9
      // 3a1: bipush 0
      // 3a2: istore 10
      // 3a4: iload 10
      // 3a6: iload 9
      // 3a8: if_icmpge 3ea
      // 3ab: aload 8
      // 3ad: iload 10
      // 3af: aaload
      // 3b0: astore 11
      // 3b2: aload 2
      // 3b3: ifnull 3e6
      // 3b6: aload 11
      // 3b8: aload 2
      // 3b9: ifnull 3ec
      // 3bc: goto 3c3
      // 3bf: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 3c2: athrow
      // 3c3: ifnull 3e3
      // 3c6: goto 3cd
      // 3c9: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 3cc: athrow
      // 3cd: aload 11
      // 3cf: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.mpp ()V
      // 3d2: aload 7
      // 3d4: aload 11
      // 3d6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3db: pop
      // 3dc: goto 3e3
      // 3df: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 3e2: athrow
      // 3e3: iinc 10 1
      // 3e6: aload 2
      // 3e7: ifnonnull 3a4
      // 3ea: aload 4
      // 3ec: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.mpp ()V
      // 3ef: aload 7
      // 3f1: aload 1
      // 3f2: invokestatic java/util/Collections.shuffle (Ljava/util/List;Ljava/util/Random;)V
      // 3f5: bipush 1
      // 3f6: istore 8
      // 3f8: aload 7
      // 3fa: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3ff: astore 9
      // 401: aload 9
      // 403: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 408: ifeq 502
      // 40b: aload 9
      // 40d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 412: checkcast net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man
      // 415: astore 10
      // 417: bipush 0
      // 418: istore 11
      // 41a: bipush 0
      // 41b: aload 2
      // 41c: ifnull 51f
      // 41f: istore 12
      // 421: iload 11
      // 423: bipush 2
      // 424: if_icmpge 4fe
      // 427: iload 12
      // 429: aload 2
      // 42a: ifnull 44c
      // 42d: bipush 5
      // 42e: aload 2
      // 42f: ifnull 424
      // 432: goto 439
      // 435: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 438: athrow
      // 439: if_icmpge 4fe
      // 43c: iinc 12 1
      // 43f: aload 1
      // 440: bipush 6
      // 442: invokevirtual java/util/Random.nextInt (I)I
      // 445: goto 44c
      // 448: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 44b: athrow
      // 44c: istore 13
      // 44e: aload 10
      // 450: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 453: iload 13
      // 455: baload
      // 456: aload 2
      // 457: ifnull 476
      // 45a: ifeq 4fa
      // 45d: goto 464
      // 460: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 463: athrow
      // 464: iload 13
      // 466: invokestatic vt2.jw6 (I)Lvt2;
      // 469: invokevirtual vt2.b4b ()Lvt2;
      // 46c: invokevirtual vt2.c3s ()I
      // 46f: goto 476
      // 472: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 475: athrow
      // 476: istore 14
      // 478: aload 10
      // 47a: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 47d: iload 13
      // 47f: bipush 0
      // 480: bastore
      // 481: aload 10
      // 483: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 486: iload 13
      // 488: aaload
      // 489: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 48c: iload 14
      // 48e: bipush 0
      // 48f: bastore
      // 490: aload 10
      // 492: aload 2
      // 493: ifnull 4f3
      // 496: iload 8
      // 498: iinc 8 1
      // 49b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.aru (I)Z
      // 49e: ifeq 4db
      // 4a1: goto 4a8
      // 4a4: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 4a7: athrow
      // 4a8: aload 10
      // 4aa: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 4ad: iload 13
      // 4af: aaload
      // 4b0: aload 2
      // 4b1: ifnull 4f3
      // 4b4: goto 4bb
      // 4b7: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 4ba: athrow
      // 4bb: iload 8
      // 4bd: iinc 8 1
      // 4c0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.aru (I)Z
      // 4c3: ifeq 4db
      // 4c6: goto 4cd
      // 4c9: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 4cc: athrow
      // 4cd: iinc 11 1
      // 4d0: aload 2
      // 4d1: ifnonnull 4fa
      // 4d4: goto 4db
      // 4d7: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 4da: athrow
      // 4db: aload 10
      // 4dd: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 4e0: iload 13
      // 4e2: bipush 1
      // 4e3: bastore
      // 4e4: aload 10
      // 4e6: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 4e9: iload 13
      // 4eb: aaload
      // 4ec: goto 4f3
      // 4ef: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 4f2: athrow
      // 4f3: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 4f6: iload 14
      // 4f8: bipush 1
      // 4f9: bastore
      // 4fa: aload 2
      // 4fb: ifnonnull 421
      // 4fe: aload 2
      // 4ff: ifnonnull 401
      // 502: aload 7
      // 504: aload 4
      // 506: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 50b: pop
      // 50c: aload 7
      // 50e: aload 5
      // 510: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 515: pop
      // 516: aload 7
      // 518: aload 6
      // 51a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 51f: pop
      // 520: aload 7
      // 522: areturn
   }

   @Override
   public boolean d__(OpaquePredicate param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual OpaquePredicate._s3 ()I
      // 004: bipush 64
      // 006: invokestatic java/lang/Math.max (II)I
      // 009: aload 0
      // 00a: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.yqm Lyve;
      // 00d: getfield yve._3o I
      // 010: isub
      // 011: istore 5
      // 013: aload 0
      // 014: aload 1
      // 015: aload 3
      // 016: bipush 0
      // 017: bipush 0
      // 018: bipush 0
      // 019: bipush 58
      // 01b: iload 5
      // 01d: bipush 58
      // 01f: bipush 0
      // 020: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 023: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 026: aload 0
      // 027: bipush 0
      // 028: bipush 0
      // 029: aload 1
      // 02a: aload 2
      // 02b: aload 3
      // 02c: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.uvn (ZILt9d;Ljava/util/Random;Lyve;)V
      // 02f: aload 0
      // 030: bipush 1
      // 031: bipush 33
      // 033: aload 1
      // 034: aload 2
      // 035: aload 3
      // 036: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.uvn (ZILt9d;Ljava/util/Random;Lyve;)V
      // 039: aload 0
      // 03a: aload 1
      // 03b: aload 2
      // 03c: aload 3
      // 03d: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v65 (Lt9d;Ljava/util/Random;Lyve;)V
      // 040: aload 0
      // 041: aload 1
      // 042: aload 2
      // 043: aload 3
      // 044: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.dn9 (Lt9d;Ljava/util/Random;Lyve;)V
      // 047: aload 0
      // 048: aload 1
      // 049: aload 2
      // 04a: aload 3
      // 04b: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.odb (Lt9d;Ljava/util/Random;Lyve;)V
      // 04e: astore 4
      // 050: aload 0
      // 051: aload 1
      // 052: aload 2
      // 053: aload 3
      // 054: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.hrn (Lt9d;Ljava/util/Random;Lyve;)V
      // 057: aload 0
      // 058: aload 1
      // 059: aload 2
      // 05a: aload 3
      // 05b: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.on2 (Lt9d;Ljava/util/Random;Lyve;)V
      // 05e: aload 0
      // 05f: aload 1
      // 060: aload 2
      // 061: aload 3
      // 062: invokespecial net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.k7y (Lt9d;Ljava/util/Random;Lyve;)V
      // 065: bipush 0
      // 066: istore 6
      // 068: iload 6
      // 06a: bipush 7
      // 06c: if_icmpge 158
      // 06f: bipush 0
      // 070: aload 4
      // 072: ifnull 159
      // 075: istore 7
      // 077: iload 7
      // 079: bipush 7
      // 07b: if_icmpge 150
      // 07e: iload 7
      // 080: aload 4
      // 082: ifnull 06a
      // 085: aload 4
      // 087: ifnull 0b6
      // 08a: ifne 0b1
      // 08d: goto 094
      // 090: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 093: athrow
      // 094: iload 6
      // 096: bipush 3
      // 097: aload 4
      // 099: ifnull 0b5
      // 09c: goto 0a3
      // 09f: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: if_icmpne 0b1
      // 0a6: goto 0ad
      // 0a9: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: bipush 6
      // 0af: istore 7
      // 0b1: iload 6
      // 0b3: bipush 9
      // 0b5: imul
      // 0b6: istore 8
      // 0b8: iload 7
      // 0ba: bipush 9
      // 0bc: imul
      // 0bd: istore 9
      // 0bf: bipush 0
      // 0c0: istore 10
      // 0c2: iload 10
      // 0c4: bipush 4
      // 0c5: if_icmpge 11a
      // 0c8: bipush 0
      // 0c9: aload 4
      // 0cb: ifnull 11c
      // 0ce: istore 11
      // 0d0: iload 11
      // 0d2: bipush 4
      // 0d3: if_icmpge 112
      // 0d6: aload 0
      // 0d7: aload 1
      // 0d8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0db: iload 8
      // 0dd: iload 10
      // 0df: iadd
      // 0e0: bipush 0
      // 0e1: iload 9
      // 0e3: iload 11
      // 0e5: iadd
      // 0e6: aload 3
      // 0e7: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0ea: aload 0
      // 0eb: aload 1
      // 0ec: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0ef: iload 8
      // 0f1: iload 10
      // 0f3: iadd
      // 0f4: bipush -1
      // 0f5: iload 9
      // 0f7: iload 11
      // 0f9: iadd
      // 0fa: aload 3
      // 0fb: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.doc (Lt9d;Lzfz;IIILyve;)V
      // 0fe: iinc 11 1
      // 101: aload 4
      // 103: ifnull 115
      // 106: aload 4
      // 108: ifnonnull 0d0
      // 10b: goto 112
      // 10e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 111: athrow
      // 112: iinc 10 1
      // 115: aload 4
      // 117: ifnonnull 0c2
      // 11a: iload 6
      // 11c: aload 4
      // 11e: ifnull 12d
      // 121: ifeq 141
      // 124: goto 12b
      // 127: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 12a: athrow
      // 12b: iload 6
      // 12d: bipush 6
      // 12f: if_icmpeq 141
      // 132: iinc 7 6
      // 135: aload 4
      // 137: ifnonnull 14b
      // 13a: goto 141
      // 13d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 140: athrow
      // 141: iinc 7 1
      // 144: goto 14b
      // 147: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 14a: athrow
      // 14b: aload 4
      // 14d: ifnonnull 077
      // 150: iinc 6 1
      // 153: aload 4
      // 155: ifnonnull 068
      // 158: bipush 0
      // 159: istore 6
      // 15b: iload 6
      // 15d: bipush 5
      // 15e: if_icmpge 1f9
      // 161: aload 0
      // 162: aload 1
      // 163: aload 3
      // 164: bipush -1
      // 165: iload 6
      // 167: isub
      // 168: bipush 0
      // 169: iload 6
      // 16b: bipush 2
      // 16c: imul
      // 16d: iadd
      // 16e: bipush -1
      // 16f: iload 6
      // 171: isub
      // 172: bipush -1
      // 173: iload 6
      // 175: isub
      // 176: bipush 23
      // 178: bipush 58
      // 17a: iload 6
      // 17c: iadd
      // 17d: bipush 0
      // 17e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 181: aload 0
      // 182: aload 1
      // 183: aload 3
      // 184: bipush 58
      // 186: iload 6
      // 188: iadd
      // 189: bipush 0
      // 18a: iload 6
      // 18c: bipush 2
      // 18d: imul
      // 18e: iadd
      // 18f: bipush -1
      // 190: iload 6
      // 192: isub
      // 193: bipush 58
      // 195: iload 6
      // 197: iadd
      // 198: bipush 23
      // 19a: bipush 58
      // 19c: iload 6
      // 19e: iadd
      // 19f: bipush 0
      // 1a0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 1a3: aload 0
      // 1a4: aload 1
      // 1a5: aload 3
      // 1a6: bipush 0
      // 1a7: iload 6
      // 1a9: isub
      // 1aa: bipush 0
      // 1ab: iload 6
      // 1ad: bipush 2
      // 1ae: imul
      // 1af: iadd
      // 1b0: bipush -1
      // 1b1: iload 6
      // 1b3: isub
      // 1b4: bipush 57
      // 1b6: iload 6
      // 1b8: iadd
      // 1b9: bipush 23
      // 1bb: bipush -1
      // 1bc: iload 6
      // 1be: isub
      // 1bf: bipush 0
      // 1c0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 1c3: aload 0
      // 1c4: aload 4
      // 1c6: ifnull 1fa
      // 1c9: aload 1
      // 1ca: aload 3
      // 1cb: bipush 0
      // 1cc: iload 6
      // 1ce: isub
      // 1cf: bipush 0
      // 1d0: iload 6
      // 1d2: bipush 2
      // 1d3: imul
      // 1d4: iadd
      // 1d5: bipush 58
      // 1d7: iload 6
      // 1d9: iadd
      // 1da: bipush 57
      // 1dc: iload 6
      // 1de: iadd
      // 1df: bipush 23
      // 1e1: bipush 58
      // 1e3: iload 6
      // 1e5: iadd
      // 1e6: bipush 0
      // 1e7: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 1ea: iinc 6 1
      // 1ed: aload 4
      // 1ef: ifnonnull 15b
      // 1f2: goto 1f9
      // 1f5: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: aload 0
      // 1fa: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.jd_ Ljava/util/List;
      // 1fd: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 202: astore 6
      // 204: aload 6
      // 206: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 20b: ifeq 253
      // 20e: aload 6
      // 210: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 215: checkcast net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece
      // 218: astore 7
      // 21a: aload 7
      // 21c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.q1q ()Lyve;
      // 21f: aload 3
      // 220: invokevirtual yve.fsa (Lyve;)Z
      // 223: aload 4
      // 225: ifnull 254
      // 228: aload 4
      // 22a: ifnull 24d
      // 22d: goto 234
      // 230: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 233: athrow
      // 234: ifeq 24e
      // 237: goto 23e
      // 23a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 23d: athrow
      // 23e: aload 7
      // 240: aload 1
      // 241: aload 2
      // 242: aload 3
      // 243: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.d__ (Lt9d;Ljava/util/Random;Lyve;)Z
      // 246: goto 24d
      // 249: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 24c: athrow
      // 24d: pop
      // 24e: aload 4
      // 250: ifnonnull 204
      // 253: bipush 1
      // 254: ireturn
   }

   private void uvn(boolean param1, int param2, OpaquePredicate param3, Random param4, yve param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 6
      // 005: bipush 24
      // 007: istore 7
      // 009: aload 0
      // 00a: aload 5
      // 00c: iload 2
      // 00d: bipush 0
      // 00e: iload 2
      // 00f: bipush 23
      // 011: iadd
      // 012: bipush 20
      // 014: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 017: aload 6
      // 019: ifnull 05d
      // 01c: ifeq 350
      // 01f: goto 026
      // 022: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 0
      // 027: aload 3
      // 028: aload 5
      // 02a: iload 2
      // 02b: bipush 0
      // 02c: iadd
      // 02d: bipush 0
      // 02e: bipush 0
      // 02f: iload 2
      // 030: bipush 24
      // 032: iadd
      // 033: bipush 0
      // 034: bipush 20
      // 036: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 039: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 03c: bipush 0
      // 03d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 040: aload 0
      // 041: aload 3
      // 042: aload 5
      // 044: iload 2
      // 045: bipush 0
      // 046: iadd
      // 047: bipush 1
      // 048: bipush 0
      // 049: iload 2
      // 04a: bipush 24
      // 04c: iadd
      // 04d: bipush 10
      // 04f: bipush 20
      // 051: bipush 0
      // 052: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 055: bipush 0
      // 056: goto 05d
      // 059: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 05c: athrow
      // 05d: istore 8
      // 05f: iload 8
      // 061: bipush 4
      // 062: if_icmpge 16e
      // 065: aload 0
      // 066: aload 3
      // 067: aload 5
      // 069: iload 2
      // 06a: iload 8
      // 06c: iadd
      // 06d: iload 8
      // 06f: bipush 1
      // 070: iadd
      // 071: iload 8
      // 073: iload 2
      // 074: iload 8
      // 076: iadd
      // 077: iload 8
      // 079: bipush 1
      // 07a: iadd
      // 07b: bipush 20
      // 07d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 080: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 083: bipush 0
      // 084: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 087: aload 0
      // 088: aload 3
      // 089: aload 5
      // 08b: iload 2
      // 08c: iload 8
      // 08e: iadd
      // 08f: bipush 7
      // 091: iadd
      // 092: iload 8
      // 094: bipush 5
      // 095: iadd
      // 096: iload 8
      // 098: bipush 7
      // 09a: iadd
      // 09b: iload 2
      // 09c: iload 8
      // 09e: iadd
      // 09f: bipush 7
      // 0a1: iadd
      // 0a2: iload 8
      // 0a4: bipush 5
      // 0a5: iadd
      // 0a6: bipush 20
      // 0a8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0ab: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0ae: bipush 0
      // 0af: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0b2: aload 0
      // 0b3: aload 3
      // 0b4: aload 5
      // 0b6: iload 2
      // 0b7: bipush 17
      // 0b9: iadd
      // 0ba: iload 8
      // 0bc: isub
      // 0bd: iload 8
      // 0bf: bipush 5
      // 0c0: iadd
      // 0c1: iload 8
      // 0c3: bipush 7
      // 0c5: iadd
      // 0c6: iload 2
      // 0c7: bipush 17
      // 0c9: iadd
      // 0ca: iload 8
      // 0cc: isub
      // 0cd: iload 8
      // 0cf: bipush 5
      // 0d0: iadd
      // 0d1: bipush 20
      // 0d3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0d6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0d9: bipush 0
      // 0da: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0dd: aload 0
      // 0de: aload 3
      // 0df: aload 5
      // 0e1: iload 2
      // 0e2: bipush 24
      // 0e4: iadd
      // 0e5: iload 8
      // 0e7: isub
      // 0e8: iload 8
      // 0ea: bipush 1
      // 0eb: iadd
      // 0ec: iload 8
      // 0ee: iload 2
      // 0ef: bipush 24
      // 0f1: iadd
      // 0f2: iload 8
      // 0f4: isub
      // 0f5: iload 8
      // 0f7: bipush 1
      // 0f8: iadd
      // 0f9: bipush 20
      // 0fb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0fe: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 101: bipush 0
      // 102: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 105: aload 0
      // 106: aload 3
      // 107: aload 5
      // 109: iload 2
      // 10a: iload 8
      // 10c: iadd
      // 10d: bipush 1
      // 10e: iadd
      // 10f: iload 8
      // 111: bipush 1
      // 112: iadd
      // 113: iload 8
      // 115: iload 2
      // 116: bipush 23
      // 118: iadd
      // 119: iload 8
      // 11b: isub
      // 11c: iload 8
      // 11e: bipush 1
      // 11f: iadd
      // 120: iload 8
      // 122: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 125: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 128: bipush 0
      // 129: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 12c: aload 0
      // 12d: aload 3
      // 12e: aload 5
      // 130: iload 2
      // 131: iload 8
      // 133: iadd
      // 134: bipush 8
      // 136: iadd
      // 137: iload 8
      // 139: bipush 5
      // 13a: iadd
      // 13b: iload 8
      // 13d: bipush 7
      // 13f: iadd
      // 140: iload 2
      // 141: bipush 16
      // 143: iadd
      // 144: iload 8
      // 146: isub
      // 147: iload 8
      // 149: bipush 5
      // 14a: iadd
      // 14b: iload 8
      // 14d: bipush 7
      // 14f: iadd
      // 150: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 153: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 156: bipush 0
      // 157: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 15a: iinc 8 1
      // 15d: aload 6
      // 15f: ifnull 212
      // 162: aload 6
      // 164: ifnonnull 05f
      // 167: goto 16e
      // 16a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 16d: athrow
      // 16e: aload 0
      // 16f: aload 3
      // 170: aload 5
      // 172: iload 2
      // 173: bipush 4
      // 174: iadd
      // 175: bipush 4
      // 176: bipush 4
      // 177: iload 2
      // 178: bipush 6
      // 17a: iadd
      // 17b: bipush 4
      // 17c: bipush 20
      // 17e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 181: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 184: bipush 0
      // 185: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 188: aload 0
      // 189: aload 3
      // 18a: aload 5
      // 18c: iload 2
      // 18d: bipush 7
      // 18f: iadd
      // 190: bipush 4
      // 191: bipush 4
      // 192: iload 2
      // 193: bipush 17
      // 195: iadd
      // 196: bipush 4
      // 197: bipush 6
      // 199: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 19c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 19f: bipush 0
      // 1a0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1a3: aload 0
      // 1a4: aload 3
      // 1a5: aload 5
      // 1a7: iload 2
      // 1a8: bipush 18
      // 1aa: iadd
      // 1ab: bipush 4
      // 1ac: bipush 4
      // 1ad: iload 2
      // 1ae: bipush 20
      // 1b0: iadd
      // 1b1: bipush 4
      // 1b2: bipush 20
      // 1b4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 1b7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 1ba: bipush 0
      // 1bb: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1be: aload 0
      // 1bf: aload 3
      // 1c0: aload 5
      // 1c2: iload 2
      // 1c3: bipush 11
      // 1c5: iadd
      // 1c6: bipush 8
      // 1c8: bipush 11
      // 1ca: iload 2
      // 1cb: bipush 13
      // 1cd: iadd
      // 1ce: bipush 8
      // 1d0: bipush 20
      // 1d2: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 1d5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 1d8: bipush 0
      // 1d9: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1dc: aload 0
      // 1dd: aload 3
      // 1de: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 1e1: iload 2
      // 1e2: bipush 12
      // 1e4: iadd
      // 1e5: bipush 9
      // 1e7: bipush 12
      // 1e9: aload 5
      // 1eb: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1ee: aload 0
      // 1ef: aload 3
      // 1f0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 1f3: iload 2
      // 1f4: bipush 12
      // 1f6: iadd
      // 1f7: bipush 9
      // 1f9: bipush 15
      // 1fb: aload 5
      // 1fd: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 200: aload 0
      // 201: aload 3
      // 202: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 205: iload 2
      // 206: bipush 12
      // 208: iadd
      // 209: bipush 9
      // 20b: bipush 18
      // 20d: aload 5
      // 20f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 212: iload 1
      // 213: aload 6
      // 215: ifnull 22e
      // 218: ifeq 22d
      // 21b: goto 222
      // 21e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 221: athrow
      // 222: iload 2
      // 223: bipush 19
      // 225: iadd
      // 226: goto 230
      // 229: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 22c: athrow
      // 22d: iload 2
      // 22e: bipush 5
      // 22f: iadd
      // 230: istore 8
      // 232: iload 1
      // 233: aload 6
      // 235: ifnull 24d
      // 238: ifeq 24c
      // 23b: goto 242
      // 23e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 241: athrow
      // 242: iload 2
      // 243: bipush 5
      // 244: iadd
      // 245: goto 250
      // 248: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 24b: athrow
      // 24c: iload 2
      // 24d: bipush 19
      // 24f: iadd
      // 250: istore 9
      // 252: bipush 20
      // 254: istore 10
      // 256: iload 10
      // 258: bipush 5
      // 259: if_icmplt 27f
      // 25c: aload 0
      // 25d: aload 3
      // 25e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 261: iload 8
      // 263: bipush 5
      // 264: iload 10
      // 266: aload 5
      // 268: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 26b: iinc 10 -3
      // 26e: aload 6
      // 270: ifnull 283
      // 273: aload 6
      // 275: ifnonnull 256
      // 278: goto 27f
      // 27b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 27e: athrow
      // 27f: bipush 19
      // 281: istore 10
      // 283: iload 10
      // 285: bipush 7
      // 287: if_icmplt 2b4
      // 28a: aload 0
      // 28b: aload 3
      // 28c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 28f: iload 9
      // 291: bipush 5
      // 292: iload 10
      // 294: aload 5
      // 296: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 299: iinc 10 -3
      // 29c: aload 6
      // 29e: ifnull 2b7
      // 2a1: goto 2a8
      // 2a4: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 2a7: athrow
      // 2a8: aload 6
      // 2aa: ifnonnull 283
      // 2ad: goto 2b4
      // 2b0: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 2b3: athrow
      // 2b4: bipush 0
      // 2b5: istore 10
      // 2b7: iload 10
      // 2b9: bipush 4
      // 2ba: if_icmpge 308
      // 2bd: iload 1
      // 2be: aload 6
      // 2c0: ifnull 2eb
      // 2c3: goto 2ca
      // 2c6: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 2c9: athrow
      // 2ca: ifeq 2e7
      // 2cd: goto 2d4
      // 2d0: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 2d3: athrow
      // 2d4: iload 2
      // 2d5: bipush 24
      // 2d7: bipush 17
      // 2d9: iload 10
      // 2db: bipush 3
      // 2dc: imul
      // 2dd: isub
      // 2de: isub
      // 2df: iadd
      // 2e0: goto 2f0
      // 2e3: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 2e6: athrow
      // 2e7: iload 2
      // 2e8: bipush 17
      // 2ea: iadd
      // 2eb: iload 10
      // 2ed: bipush 3
      // 2ee: imul
      // 2ef: isub
      // 2f0: istore 11
      // 2f2: aload 0
      // 2f3: aload 3
      // 2f4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 2f7: iload 11
      // 2f9: bipush 5
      // 2fa: bipush 5
      // 2fb: aload 5
      // 2fd: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 300: iinc 10 1
      // 303: aload 6
      // 305: ifnonnull 2b7
      // 308: aload 0
      // 309: aload 3
      // 30a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 30d: iload 9
      // 30f: bipush 5
      // 310: bipush 5
      // 311: aload 5
      // 313: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 316: aload 0
      // 317: aload 3
      // 318: aload 5
      // 31a: iload 2
      // 31b: bipush 11
      // 31d: iadd
      // 31e: bipush 1
      // 31f: bipush 12
      // 321: iload 2
      // 322: bipush 13
      // 324: iadd
      // 325: bipush 7
      // 327: bipush 12
      // 329: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 32c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 32f: bipush 0
      // 330: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 333: aload 0
      // 334: aload 3
      // 335: aload 5
      // 337: iload 2
      // 338: bipush 12
      // 33a: iadd
      // 33b: bipush 1
      // 33c: bipush 11
      // 33e: iload 2
      // 33f: bipush 12
      // 341: iadd
      // 342: bipush 7
      // 344: bipush 13
      // 346: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 349: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 34c: bipush 0
      // 34d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 350: return
   }

   private void v65(OpaquePredicate param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: aload 3
      // 007: bipush 22
      // 009: bipush 5
      // 00a: bipush 35
      // 00c: bipush 17
      // 00e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 011: aload 4
      // 013: ifnull 039
      // 016: ifeq 154
      // 019: goto 020
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aload 1
      // 022: aload 3
      // 023: bipush 25
      // 025: bipush 0
      // 026: bipush 0
      // 027: bipush 32
      // 029: bipush 8
      // 02b: bipush 20
      // 02d: bipush 0
      // 02e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 031: bipush 0
      // 032: goto 039
      // 035: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 038: athrow
      // 039: istore 5
      // 03b: iload 5
      // 03d: bipush 4
      // 03e: if_icmpge 154
      // 041: aload 0
      // 042: aload 1
      // 043: aload 3
      // 044: bipush 24
      // 046: bipush 2
      // 047: bipush 5
      // 048: iload 5
      // 04a: bipush 4
      // 04b: imul
      // 04c: iadd
      // 04d: bipush 24
      // 04f: bipush 4
      // 050: bipush 5
      // 051: iload 5
      // 053: bipush 4
      // 054: imul
      // 055: iadd
      // 056: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 059: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 05c: bipush 0
      // 05d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 060: aload 0
      // 061: aload 1
      // 062: aload 3
      // 063: bipush 22
      // 065: bipush 4
      // 066: bipush 5
      // 067: iload 5
      // 069: bipush 4
      // 06a: imul
      // 06b: iadd
      // 06c: bipush 23
      // 06e: bipush 4
      // 06f: bipush 5
      // 070: iload 5
      // 072: bipush 4
      // 073: imul
      // 074: iadd
      // 075: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 078: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 07b: bipush 0
      // 07c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 07f: aload 0
      // 080: aload 1
      // 081: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 084: bipush 25
      // 086: bipush 5
      // 087: bipush 5
      // 088: iload 5
      // 08a: bipush 4
      // 08b: imul
      // 08c: iadd
      // 08d: aload 3
      // 08e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 091: aload 0
      // 092: aload 1
      // 093: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 096: bipush 26
      // 098: bipush 6
      // 09a: bipush 5
      // 09b: iload 5
      // 09d: bipush 4
      // 09e: imul
      // 09f: iadd
      // 0a0: aload 3
      // 0a1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a4: aload 0
      // 0a5: aload 1
      // 0a6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mip Lzfz;
      // 0a9: bipush 26
      // 0ab: bipush 5
      // 0ac: bipush 5
      // 0ad: iload 5
      // 0af: bipush 4
      // 0b0: imul
      // 0b1: iadd
      // 0b2: aload 3
      // 0b3: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b6: aload 0
      // 0b7: aload 1
      // 0b8: aload 3
      // 0b9: bipush 33
      // 0bb: bipush 2
      // 0bc: bipush 5
      // 0bd: iload 5
      // 0bf: bipush 4
      // 0c0: imul
      // 0c1: iadd
      // 0c2: bipush 33
      // 0c4: bipush 4
      // 0c5: bipush 5
      // 0c6: iload 5
      // 0c8: bipush 4
      // 0c9: imul
      // 0ca: iadd
      // 0cb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0ce: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0d1: bipush 0
      // 0d2: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0d5: aload 0
      // 0d6: aload 1
      // 0d7: aload 3
      // 0d8: bipush 34
      // 0da: bipush 4
      // 0db: bipush 5
      // 0dc: iload 5
      // 0de: bipush 4
      // 0df: imul
      // 0e0: iadd
      // 0e1: bipush 35
      // 0e3: bipush 4
      // 0e4: bipush 5
      // 0e5: iload 5
      // 0e7: bipush 4
      // 0e8: imul
      // 0e9: iadd
      // 0ea: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0ed: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0f0: bipush 0
      // 0f1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0f4: aload 0
      // 0f5: aload 1
      // 0f6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0f9: bipush 32
      // 0fb: bipush 5
      // 0fc: bipush 5
      // 0fd: iload 5
      // 0ff: bipush 4
      // 100: imul
      // 101: iadd
      // 102: aload 3
      // 103: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 106: aload 0
      // 107: aload 1
      // 108: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 10b: bipush 31
      // 10d: bipush 6
      // 10f: bipush 5
      // 110: iload 5
      // 112: bipush 4
      // 113: imul
      // 114: iadd
      // 115: aload 3
      // 116: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 119: aload 0
      // 11a: aload 1
      // 11b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mip Lzfz;
      // 11e: bipush 31
      // 120: bipush 5
      // 121: bipush 5
      // 122: iload 5
      // 124: bipush 4
      // 125: imul
      // 126: iadd
      // 127: aload 3
      // 128: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 12b: aload 0
      // 12c: aload 1
      // 12d: aload 3
      // 12e: bipush 27
      // 130: bipush 6
      // 132: bipush 5
      // 133: iload 5
      // 135: bipush 4
      // 136: imul
      // 137: iadd
      // 138: bipush 30
      // 13a: bipush 6
      // 13c: bipush 5
      // 13d: iload 5
      // 13f: bipush 4
      // 140: imul
      // 141: iadd
      // 142: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 145: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 148: bipush 0
      // 149: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 14c: iinc 5 1
      // 14f: aload 4
      // 151: ifnonnull 03b
      // 154: return
   }

   private void dn9(OpaquePredicate param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: aload 3
      // 007: bipush 15
      // 009: bipush 20
      // 00b: bipush 42
      // 00d: bipush 21
      // 00f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 012: aload 4
      // 014: ifnull 1c3
      // 017: ifeq 3c4
      // 01a: goto 021
      // 01d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: aload 1
      // 023: aload 3
      // 024: bipush 15
      // 026: bipush 0
      // 027: bipush 21
      // 029: bipush 42
      // 02b: bipush 0
      // 02c: bipush 21
      // 02e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 031: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 034: bipush 0
      // 035: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 038: aload 0
      // 039: aload 1
      // 03a: aload 3
      // 03b: bipush 26
      // 03d: bipush 1
      // 03e: bipush 21
      // 040: bipush 31
      // 042: bipush 3
      // 043: bipush 21
      // 045: bipush 0
      // 046: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 049: aload 0
      // 04a: aload 1
      // 04b: aload 3
      // 04c: bipush 21
      // 04e: bipush 12
      // 050: bipush 21
      // 052: bipush 36
      // 054: bipush 12
      // 056: bipush 21
      // 058: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 05b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 05e: bipush 0
      // 05f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 062: aload 0
      // 063: aload 1
      // 064: aload 3
      // 065: bipush 17
      // 067: bipush 11
      // 069: bipush 21
      // 06b: bipush 40
      // 06d: bipush 11
      // 06f: bipush 21
      // 071: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 074: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 077: bipush 0
      // 078: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 07b: aload 0
      // 07c: aload 1
      // 07d: aload 3
      // 07e: bipush 16
      // 080: bipush 10
      // 082: bipush 21
      // 084: bipush 41
      // 086: bipush 10
      // 088: bipush 21
      // 08a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 08d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 090: bipush 0
      // 091: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 094: aload 0
      // 095: aload 1
      // 096: aload 3
      // 097: bipush 15
      // 099: bipush 7
      // 09b: bipush 21
      // 09d: bipush 42
      // 09f: bipush 9
      // 0a1: bipush 21
      // 0a3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 0a6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 0a9: bipush 0
      // 0aa: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0ad: aload 0
      // 0ae: aload 1
      // 0af: aload 3
      // 0b0: bipush 16
      // 0b2: bipush 6
      // 0b4: bipush 21
      // 0b6: bipush 41
      // 0b8: bipush 6
      // 0ba: bipush 21
      // 0bc: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 0bf: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 0c2: bipush 0
      // 0c3: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0c6: aload 0
      // 0c7: aload 1
      // 0c8: aload 3
      // 0c9: bipush 17
      // 0cb: bipush 5
      // 0cc: bipush 21
      // 0ce: bipush 40
      // 0d0: bipush 5
      // 0d1: bipush 21
      // 0d3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 0d6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 0d9: bipush 0
      // 0da: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0dd: aload 0
      // 0de: aload 1
      // 0df: aload 3
      // 0e0: bipush 21
      // 0e2: bipush 4
      // 0e3: bipush 21
      // 0e5: bipush 36
      // 0e7: bipush 4
      // 0e8: bipush 21
      // 0ea: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 0ed: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 0f0: bipush 0
      // 0f1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0f4: aload 0
      // 0f5: aload 1
      // 0f6: aload 3
      // 0f7: bipush 22
      // 0f9: bipush 3
      // 0fa: bipush 21
      // 0fc: bipush 26
      // 0fe: bipush 3
      // 0ff: bipush 21
      // 101: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 104: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 107: bipush 0
      // 108: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 10b: aload 0
      // 10c: aload 1
      // 10d: aload 3
      // 10e: bipush 31
      // 110: bipush 3
      // 111: bipush 21
      // 113: bipush 35
      // 115: bipush 3
      // 116: bipush 21
      // 118: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 11b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 11e: bipush 0
      // 11f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 122: aload 0
      // 123: aload 1
      // 124: aload 3
      // 125: bipush 23
      // 127: bipush 2
      // 128: bipush 21
      // 12a: bipush 25
      // 12c: bipush 2
      // 12d: bipush 21
      // 12f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 132: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 135: bipush 0
      // 136: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 139: aload 0
      // 13a: aload 1
      // 13b: aload 3
      // 13c: bipush 32
      // 13e: bipush 2
      // 13f: bipush 21
      // 141: bipush 34
      // 143: bipush 2
      // 144: bipush 21
      // 146: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 149: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 14c: bipush 0
      // 14d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 150: aload 0
      // 151: aload 1
      // 152: aload 3
      // 153: bipush 28
      // 155: bipush 4
      // 156: bipush 20
      // 158: bipush 29
      // 15a: bipush 4
      // 15b: bipush 21
      // 15d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 160: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 163: bipush 0
      // 164: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 167: aload 0
      // 168: aload 1
      // 169: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 16c: bipush 27
      // 16e: bipush 3
      // 16f: bipush 21
      // 171: aload 3
      // 172: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 175: aload 0
      // 176: aload 1
      // 177: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 17a: bipush 30
      // 17c: bipush 3
      // 17d: bipush 21
      // 17f: aload 3
      // 180: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 183: aload 0
      // 184: aload 1
      // 185: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 188: bipush 26
      // 18a: bipush 2
      // 18b: bipush 21
      // 18d: aload 3
      // 18e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 191: aload 0
      // 192: aload 1
      // 193: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 196: bipush 31
      // 198: bipush 2
      // 199: bipush 21
      // 19b: aload 3
      // 19c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 19f: aload 0
      // 1a0: aload 1
      // 1a1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 1a4: bipush 25
      // 1a6: bipush 1
      // 1a7: bipush 21
      // 1a9: aload 3
      // 1aa: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1ad: aload 0
      // 1ae: aload 1
      // 1af: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 1b2: bipush 32
      // 1b4: bipush 1
      // 1b5: bipush 21
      // 1b7: aload 3
      // 1b8: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1bb: bipush 0
      // 1bc: goto 1c3
      // 1bf: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1c2: athrow
      // 1c3: istore 5
      // 1c5: iload 5
      // 1c7: bipush 7
      // 1c9: if_icmpge 20a
      // 1cc: aload 0
      // 1cd: aload 1
      // 1ce: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.cyh Lzfz;
      // 1d1: bipush 28
      // 1d3: iload 5
      // 1d5: isub
      // 1d6: bipush 6
      // 1d8: iload 5
      // 1da: iadd
      // 1db: bipush 21
      // 1dd: aload 3
      // 1de: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1e1: aload 0
      // 1e2: aload 1
      // 1e3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.cyh Lzfz;
      // 1e6: bipush 29
      // 1e8: iload 5
      // 1ea: iadd
      // 1eb: bipush 6
      // 1ed: iload 5
      // 1ef: iadd
      // 1f0: bipush 21
      // 1f2: aload 3
      // 1f3: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1f6: iinc 5 1
      // 1f9: aload 4
      // 1fb: ifnull 20d
      // 1fe: aload 4
      // 200: ifnonnull 1c5
      // 203: goto 20a
      // 206: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 209: athrow
      // 20a: bipush 0
      // 20b: istore 5
      // 20d: iload 5
      // 20f: bipush 4
      // 210: if_icmpge 258
      // 213: aload 0
      // 214: aload 1
      // 215: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.cyh Lzfz;
      // 218: bipush 28
      // 21a: iload 5
      // 21c: isub
      // 21d: bipush 9
      // 21f: iload 5
      // 221: iadd
      // 222: bipush 21
      // 224: aload 3
      // 225: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 228: aload 0
      // 229: aload 1
      // 22a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.cyh Lzfz;
      // 22d: bipush 29
      // 22f: iload 5
      // 231: iadd
      // 232: bipush 9
      // 234: iload 5
      // 236: iadd
      // 237: bipush 21
      // 239: aload 3
      // 23a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 23d: iinc 5 1
      // 240: aload 4
      // 242: ifnull 276
      // 245: goto 24c
      // 248: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 24b: athrow
      // 24c: aload 4
      // 24e: ifnonnull 20d
      // 251: goto 258
      // 254: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 257: athrow
      // 258: aload 0
      // 259: aload 1
      // 25a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.cyh Lzfz;
      // 25d: bipush 28
      // 25f: bipush 12
      // 261: bipush 21
      // 263: aload 3
      // 264: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 267: aload 0
      // 268: aload 1
      // 269: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.cyh Lzfz;
      // 26c: bipush 29
      // 26e: bipush 12
      // 270: bipush 21
      // 272: aload 3
      // 273: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 276: bipush 0
      // 277: istore 5
      // 279: iload 5
      // 27b: bipush 3
      // 27c: if_icmpge 2e3
      // 27f: aload 0
      // 280: aload 1
      // 281: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.cyh Lzfz;
      // 284: bipush 22
      // 286: iload 5
      // 288: bipush 2
      // 289: imul
      // 28a: isub
      // 28b: bipush 8
      // 28d: bipush 21
      // 28f: aload 3
      // 290: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 293: aload 0
      // 294: aload 1
      // 295: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.cyh Lzfz;
      // 298: bipush 22
      // 29a: iload 5
      // 29c: bipush 2
      // 29d: imul
      // 29e: isub
      // 29f: bipush 9
      // 2a1: bipush 21
      // 2a3: aload 3
      // 2a4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2a7: aload 0
      // 2a8: aload 1
      // 2a9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.cyh Lzfz;
      // 2ac: bipush 35
      // 2ae: iload 5
      // 2b0: bipush 2
      // 2b1: imul
      // 2b2: iadd
      // 2b3: bipush 8
      // 2b5: bipush 21
      // 2b7: aload 3
      // 2b8: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2bb: aload 0
      // 2bc: aload 1
      // 2bd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.cyh Lzfz;
      // 2c0: bipush 35
      // 2c2: iload 5
      // 2c4: bipush 2
      // 2c5: imul
      // 2c6: iadd
      // 2c7: bipush 9
      // 2c9: bipush 21
      // 2cb: aload 3
      // 2cc: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2cf: iinc 5 1
      // 2d2: aload 4
      // 2d4: ifnull 3b3
      // 2d7: aload 4
      // 2d9: ifnonnull 279
      // 2dc: goto 2e3
      // 2df: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 2e2: athrow
      // 2e3: aload 0
      // 2e4: aload 1
      // 2e5: aload 3
      // 2e6: bipush 15
      // 2e8: bipush 13
      // 2ea: bipush 21
      // 2ec: bipush 42
      // 2ee: bipush 15
      // 2f0: bipush 21
      // 2f2: bipush 0
      // 2f3: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 2f6: aload 0
      // 2f7: aload 1
      // 2f8: aload 3
      // 2f9: bipush 15
      // 2fb: bipush 1
      // 2fc: bipush 21
      // 2fe: bipush 15
      // 300: bipush 6
      // 302: bipush 21
      // 304: bipush 0
      // 305: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 308: aload 0
      // 309: aload 1
      // 30a: aload 3
      // 30b: bipush 16
      // 30d: bipush 1
      // 30e: bipush 21
      // 310: bipush 16
      // 312: bipush 5
      // 313: bipush 21
      // 315: bipush 0
      // 316: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 319: aload 0
      // 31a: aload 1
      // 31b: aload 3
      // 31c: bipush 17
      // 31e: bipush 1
      // 31f: bipush 21
      // 321: bipush 20
      // 323: bipush 4
      // 324: bipush 21
      // 326: bipush 0
      // 327: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 32a: aload 0
      // 32b: aload 1
      // 32c: aload 3
      // 32d: bipush 21
      // 32f: bipush 1
      // 330: bipush 21
      // 332: bipush 21
      // 334: bipush 3
      // 335: bipush 21
      // 337: bipush 0
      // 338: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 33b: aload 0
      // 33c: aload 1
      // 33d: aload 3
      // 33e: bipush 22
      // 340: bipush 1
      // 341: bipush 21
      // 343: bipush 22
      // 345: bipush 2
      // 346: bipush 21
      // 348: bipush 0
      // 349: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 34c: aload 0
      // 34d: aload 1
      // 34e: aload 3
      // 34f: bipush 23
      // 351: bipush 1
      // 352: bipush 21
      // 354: bipush 24
      // 356: bipush 1
      // 357: bipush 21
      // 359: bipush 0
      // 35a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 35d: aload 0
      // 35e: aload 1
      // 35f: aload 3
      // 360: bipush 42
      // 362: bipush 1
      // 363: bipush 21
      // 365: bipush 42
      // 367: bipush 6
      // 369: bipush 21
      // 36b: bipush 0
      // 36c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 36f: aload 0
      // 370: aload 1
      // 371: aload 3
      // 372: bipush 41
      // 374: bipush 1
      // 375: bipush 21
      // 377: bipush 41
      // 379: bipush 5
      // 37a: bipush 21
      // 37c: bipush 0
      // 37d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 380: aload 0
      // 381: aload 1
      // 382: aload 3
      // 383: bipush 37
      // 385: bipush 1
      // 386: bipush 21
      // 388: bipush 40
      // 38a: bipush 4
      // 38b: bipush 21
      // 38d: bipush 0
      // 38e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 391: aload 0
      // 392: aload 1
      // 393: aload 3
      // 394: bipush 36
      // 396: bipush 1
      // 397: bipush 21
      // 399: bipush 36
      // 39b: bipush 3
      // 39c: bipush 21
      // 39e: bipush 0
      // 39f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 3a2: aload 0
      // 3a3: aload 1
      // 3a4: aload 3
      // 3a5: bipush 33
      // 3a7: bipush 1
      // 3a8: bipush 21
      // 3aa: bipush 34
      // 3ac: bipush 1
      // 3ad: bipush 21
      // 3af: bipush 0
      // 3b0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 3b3: aload 0
      // 3b4: aload 1
      // 3b5: aload 3
      // 3b6: bipush 35
      // 3b8: bipush 1
      // 3b9: bipush 21
      // 3bb: bipush 35
      // 3bd: bipush 2
      // 3be: bipush 21
      // 3c0: bipush 0
      // 3c1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 3c4: return
   }

   private void odb(OpaquePredicate param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: aload 3
      // 007: bipush 21
      // 009: bipush 21
      // 00b: bipush 36
      // 00d: bipush 36
      // 00f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 012: aload 4
      // 014: ifnull 052
      // 017: ifeq 2af
      // 01a: goto 021
      // 01d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: aload 1
      // 023: aload 3
      // 024: bipush 21
      // 026: bipush 0
      // 027: bipush 22
      // 029: bipush 36
      // 02b: bipush 0
      // 02c: bipush 36
      // 02e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 031: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 034: bipush 0
      // 035: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 038: aload 0
      // 039: aload 1
      // 03a: aload 3
      // 03b: bipush 21
      // 03d: bipush 1
      // 03e: bipush 22
      // 040: bipush 36
      // 042: bipush 23
      // 044: bipush 36
      // 046: bipush 0
      // 047: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 04a: bipush 0
      // 04b: goto 052
      // 04e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 051: athrow
      // 052: istore 5
      // 054: iload 5
      // 056: bipush 4
      // 057: if_icmpge 11a
      // 05a: aload 0
      // 05b: aload 1
      // 05c: aload 3
      // 05d: bipush 21
      // 05f: iload 5
      // 061: iadd
      // 062: bipush 13
      // 064: iload 5
      // 066: iadd
      // 067: bipush 21
      // 069: iload 5
      // 06b: iadd
      // 06c: bipush 36
      // 06e: iload 5
      // 070: isub
      // 071: bipush 13
      // 073: iload 5
      // 075: iadd
      // 076: bipush 21
      // 078: iload 5
      // 07a: iadd
      // 07b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 07e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 081: bipush 0
      // 082: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 085: aload 0
      // 086: aload 1
      // 087: aload 3
      // 088: bipush 21
      // 08a: iload 5
      // 08c: iadd
      // 08d: bipush 13
      // 08f: iload 5
      // 091: iadd
      // 092: bipush 36
      // 094: iload 5
      // 096: isub
      // 097: bipush 36
      // 099: iload 5
      // 09b: isub
      // 09c: bipush 13
      // 09e: iload 5
      // 0a0: iadd
      // 0a1: bipush 36
      // 0a3: iload 5
      // 0a5: isub
      // 0a6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0a9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0ac: bipush 0
      // 0ad: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0b0: aload 0
      // 0b1: aload 1
      // 0b2: aload 3
      // 0b3: bipush 21
      // 0b5: iload 5
      // 0b7: iadd
      // 0b8: bipush 13
      // 0ba: iload 5
      // 0bc: iadd
      // 0bd: bipush 22
      // 0bf: iload 5
      // 0c1: iadd
      // 0c2: bipush 21
      // 0c4: iload 5
      // 0c6: iadd
      // 0c7: bipush 13
      // 0c9: iload 5
      // 0cb: iadd
      // 0cc: bipush 35
      // 0ce: iload 5
      // 0d0: isub
      // 0d1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0d4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0d7: bipush 0
      // 0d8: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0db: aload 0
      // 0dc: aload 1
      // 0dd: aload 3
      // 0de: bipush 36
      // 0e0: iload 5
      // 0e2: isub
      // 0e3: bipush 13
      // 0e5: iload 5
      // 0e7: iadd
      // 0e8: bipush 22
      // 0ea: iload 5
      // 0ec: iadd
      // 0ed: bipush 36
      // 0ef: iload 5
      // 0f1: isub
      // 0f2: bipush 13
      // 0f4: iload 5
      // 0f6: iadd
      // 0f7: bipush 35
      // 0f9: iload 5
      // 0fb: isub
      // 0fc: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0ff: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 102: bipush 0
      // 103: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 106: iinc 5 1
      // 109: aload 4
      // 10b: ifnull 296
      // 10e: aload 4
      // 110: ifnonnull 054
      // 113: goto 11a
      // 116: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 119: athrow
      // 11a: aload 0
      // 11b: aload 1
      // 11c: aload 3
      // 11d: bipush 25
      // 11f: bipush 16
      // 121: bipush 25
      // 123: bipush 32
      // 125: bipush 16
      // 127: bipush 32
      // 129: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 12c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 12f: bipush 0
      // 130: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 133: aload 0
      // 134: aload 1
      // 135: aload 3
      // 136: bipush 25
      // 138: bipush 17
      // 13a: bipush 25
      // 13c: bipush 25
      // 13e: bipush 19
      // 140: bipush 25
      // 142: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 145: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 148: bipush 0
      // 149: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 14c: aload 0
      // 14d: aload 1
      // 14e: aload 3
      // 14f: bipush 32
      // 151: bipush 17
      // 153: bipush 25
      // 155: bipush 32
      // 157: bipush 19
      // 159: bipush 25
      // 15b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 15e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 161: bipush 0
      // 162: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 165: aload 0
      // 166: aload 1
      // 167: aload 3
      // 168: bipush 25
      // 16a: bipush 17
      // 16c: bipush 32
      // 16e: bipush 25
      // 170: bipush 19
      // 172: bipush 32
      // 174: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 177: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 17a: bipush 0
      // 17b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 17e: aload 0
      // 17f: aload 1
      // 180: aload 3
      // 181: bipush 32
      // 183: bipush 17
      // 185: bipush 32
      // 187: bipush 32
      // 189: bipush 19
      // 18b: bipush 32
      // 18d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 190: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 193: bipush 0
      // 194: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 197: aload 0
      // 198: aload 1
      // 199: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 19c: bipush 26
      // 19e: bipush 20
      // 1a0: bipush 26
      // 1a2: aload 3
      // 1a3: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1a6: aload 0
      // 1a7: aload 1
      // 1a8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 1ab: bipush 27
      // 1ad: bipush 21
      // 1af: bipush 27
      // 1b1: aload 3
      // 1b2: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1b5: aload 0
      // 1b6: aload 1
      // 1b7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mip Lzfz;
      // 1ba: bipush 27
      // 1bc: bipush 20
      // 1be: bipush 27
      // 1c0: aload 3
      // 1c1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1c4: aload 0
      // 1c5: aload 1
      // 1c6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 1c9: bipush 26
      // 1cb: bipush 20
      // 1cd: bipush 31
      // 1cf: aload 3
      // 1d0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1d3: aload 0
      // 1d4: aload 1
      // 1d5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 1d8: bipush 27
      // 1da: bipush 21
      // 1dc: bipush 30
      // 1de: aload 3
      // 1df: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1e2: aload 0
      // 1e3: aload 1
      // 1e4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mip Lzfz;
      // 1e7: bipush 27
      // 1e9: bipush 20
      // 1eb: bipush 30
      // 1ed: aload 3
      // 1ee: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1f1: aload 0
      // 1f2: aload 1
      // 1f3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 1f6: bipush 31
      // 1f8: bipush 20
      // 1fa: bipush 31
      // 1fc: aload 3
      // 1fd: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 200: aload 0
      // 201: aload 1
      // 202: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 205: bipush 30
      // 207: bipush 21
      // 209: bipush 30
      // 20b: aload 3
      // 20c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 20f: aload 0
      // 210: aload 1
      // 211: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mip Lzfz;
      // 214: bipush 30
      // 216: bipush 20
      // 218: bipush 30
      // 21a: aload 3
      // 21b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 21e: aload 0
      // 21f: aload 1
      // 220: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 223: bipush 31
      // 225: bipush 20
      // 227: bipush 26
      // 229: aload 3
      // 22a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 22d: aload 0
      // 22e: aload 1
      // 22f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 232: bipush 30
      // 234: bipush 21
      // 236: bipush 27
      // 238: aload 3
      // 239: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 23c: aload 0
      // 23d: aload 1
      // 23e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mip Lzfz;
      // 241: bipush 30
      // 243: bipush 20
      // 245: bipush 27
      // 247: aload 3
      // 248: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 24b: aload 0
      // 24c: aload 1
      // 24d: aload 3
      // 24e: bipush 28
      // 250: bipush 21
      // 252: bipush 27
      // 254: bipush 29
      // 256: bipush 21
      // 258: bipush 27
      // 25a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 25d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 260: bipush 0
      // 261: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 264: aload 0
      // 265: aload 1
      // 266: aload 3
      // 267: bipush 27
      // 269: bipush 21
      // 26b: bipush 28
      // 26d: bipush 27
      // 26f: bipush 21
      // 271: bipush 29
      // 273: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 276: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 279: bipush 0
      // 27a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 27d: aload 0
      // 27e: aload 1
      // 27f: aload 3
      // 280: bipush 28
      // 282: bipush 21
      // 284: bipush 30
      // 286: bipush 29
      // 288: bipush 21
      // 28a: bipush 30
      // 28c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 28f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 292: bipush 0
      // 293: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 296: aload 0
      // 297: aload 1
      // 298: aload 3
      // 299: bipush 30
      // 29b: bipush 21
      // 29d: bipush 28
      // 29f: bipush 30
      // 2a1: bipush 21
      // 2a3: bipush 29
      // 2a5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 2a8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 2ab: bipush 0
      // 2ac: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2af: return
   }

   private void hrn(OpaquePredicate param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: aload 3
      // 007: bipush 0
      // 008: bipush 21
      // 00a: bipush 6
      // 00c: bipush 58
      // 00e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 011: aload 4
      // 013: ifnull 14f
      // 016: ifeq 142
      // 019: goto 020
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aload 1
      // 022: aload 3
      // 023: bipush 0
      // 024: bipush 0
      // 025: bipush 21
      // 027: bipush 6
      // 029: bipush 0
      // 02a: bipush 57
      // 02c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 02f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 032: bipush 0
      // 033: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 036: aload 0
      // 037: aload 1
      // 038: aload 3
      // 039: bipush 0
      // 03a: bipush 1
      // 03b: bipush 21
      // 03d: bipush 6
      // 03f: bipush 7
      // 041: bipush 57
      // 043: bipush 0
      // 044: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 047: aload 0
      // 048: aload 1
      // 049: aload 3
      // 04a: bipush 4
      // 04b: bipush 4
      // 04c: bipush 21
      // 04e: bipush 6
      // 050: bipush 4
      // 051: bipush 53
      // 053: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 056: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 059: bipush 0
      // 05a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 05d: bipush 0
      // 05e: istore 5
      // 060: iload 5
      // 062: bipush 4
      // 063: if_icmpge 09a
      // 066: aload 0
      // 067: aload 1
      // 068: aload 3
      // 069: iload 5
      // 06b: iload 5
      // 06d: bipush 1
      // 06e: iadd
      // 06f: bipush 21
      // 071: iload 5
      // 073: iload 5
      // 075: bipush 1
      // 076: iadd
      // 077: bipush 57
      // 079: iload 5
      // 07b: isub
      // 07c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 07f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 082: bipush 0
      // 083: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 086: iinc 5 1
      // 089: aload 4
      // 08b: ifnull 09e
      // 08e: aload 4
      // 090: ifnonnull 060
      // 093: goto 09a
      // 096: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 099: athrow
      // 09a: bipush 23
      // 09c: istore 5
      // 09e: iload 5
      // 0a0: bipush 53
      // 0a2: if_icmpge 0cd
      // 0a5: aload 0
      // 0a6: aload 1
      // 0a7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 0aa: bipush 5
      // 0ab: bipush 5
      // 0ac: iload 5
      // 0ae: aload 3
      // 0af: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b2: iinc 5 3
      // 0b5: aload 4
      // 0b7: ifnull 0da
      // 0ba: goto 0c1
      // 0bd: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 4
      // 0c3: ifnonnull 09e
      // 0c6: goto 0cd
      // 0c9: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: aload 1
      // 0cf: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 0d2: bipush 5
      // 0d3: bipush 5
      // 0d4: bipush 52
      // 0d6: aload 3
      // 0d7: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0da: bipush 0
      // 0db: istore 5
      // 0dd: iload 5
      // 0df: bipush 4
      // 0e0: if_icmpge 117
      // 0e3: aload 0
      // 0e4: aload 1
      // 0e5: aload 3
      // 0e6: iload 5
      // 0e8: iload 5
      // 0ea: bipush 1
      // 0eb: iadd
      // 0ec: bipush 21
      // 0ee: iload 5
      // 0f0: iload 5
      // 0f2: bipush 1
      // 0f3: iadd
      // 0f4: bipush 57
      // 0f6: iload 5
      // 0f8: isub
      // 0f9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0fc: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0ff: bipush 0
      // 100: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 103: iinc 5 1
      // 106: aload 4
      // 108: ifnull 12d
      // 10b: aload 4
      // 10d: ifnonnull 0dd
      // 110: goto 117
      // 113: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 116: athrow
      // 117: aload 0
      // 118: aload 1
      // 119: aload 3
      // 11a: bipush 4
      // 11b: bipush 1
      // 11c: bipush 52
      // 11e: bipush 6
      // 120: bipush 3
      // 121: bipush 52
      // 123: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 126: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 129: bipush 0
      // 12a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 12d: aload 0
      // 12e: aload 1
      // 12f: aload 3
      // 130: bipush 5
      // 131: bipush 1
      // 132: bipush 51
      // 134: bipush 5
      // 135: bipush 3
      // 136: bipush 53
      // 138: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 13b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 13e: bipush 0
      // 13f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 142: aload 0
      // 143: aload 3
      // 144: bipush 51
      // 146: bipush 21
      // 148: bipush 58
      // 14a: bipush 58
      // 14c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 14f: aload 4
      // 151: ifnull 25d
      // 154: ifeq 251
      // 157: goto 15e
      // 15a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 15d: athrow
      // 15e: aload 0
      // 15f: aload 1
      // 160: aload 3
      // 161: bipush 51
      // 163: bipush 0
      // 164: bipush 21
      // 166: bipush 57
      // 168: bipush 0
      // 169: bipush 57
      // 16b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 16e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 171: bipush 0
      // 172: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 175: aload 0
      // 176: aload 1
      // 177: aload 3
      // 178: bipush 51
      // 17a: bipush 1
      // 17b: bipush 21
      // 17d: bipush 57
      // 17f: bipush 7
      // 181: bipush 57
      // 183: bipush 0
      // 184: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 187: aload 0
      // 188: aload 1
      // 189: aload 3
      // 18a: bipush 51
      // 18c: bipush 4
      // 18d: bipush 21
      // 18f: bipush 53
      // 191: bipush 4
      // 192: bipush 53
      // 194: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 197: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 19a: bipush 0
      // 19b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 19e: bipush 0
      // 19f: istore 5
      // 1a1: iload 5
      // 1a3: bipush 4
      // 1a4: if_icmpge 1e1
      // 1a7: aload 0
      // 1a8: aload 1
      // 1a9: aload 3
      // 1aa: bipush 57
      // 1ac: iload 5
      // 1ae: isub
      // 1af: iload 5
      // 1b1: bipush 1
      // 1b2: iadd
      // 1b3: bipush 21
      // 1b5: bipush 57
      // 1b7: iload 5
      // 1b9: isub
      // 1ba: iload 5
      // 1bc: bipush 1
      // 1bd: iadd
      // 1be: bipush 57
      // 1c0: iload 5
      // 1c2: isub
      // 1c3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 1c6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 1c9: bipush 0
      // 1ca: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1cd: iinc 5 1
      // 1d0: aload 4
      // 1d2: ifnull 1e5
      // 1d5: aload 4
      // 1d7: ifnonnull 1a1
      // 1da: goto 1e1
      // 1dd: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1e0: athrow
      // 1e1: bipush 23
      // 1e3: istore 5
      // 1e5: iload 5
      // 1e7: bipush 53
      // 1e9: if_icmpge 215
      // 1ec: aload 0
      // 1ed: aload 1
      // 1ee: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 1f1: bipush 52
      // 1f3: bipush 5
      // 1f4: iload 5
      // 1f6: aload 3
      // 1f7: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1fa: iinc 5 3
      // 1fd: aload 4
      // 1ff: ifnull 23a
      // 202: goto 209
      // 205: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 208: athrow
      // 209: aload 4
      // 20b: ifnonnull 1e5
      // 20e: goto 215
      // 211: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 214: athrow
      // 215: aload 0
      // 216: aload 1
      // 217: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 21a: bipush 52
      // 21c: bipush 5
      // 21d: bipush 52
      // 21f: aload 3
      // 220: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 223: aload 0
      // 224: aload 1
      // 225: aload 3
      // 226: bipush 51
      // 228: bipush 1
      // 229: bipush 52
      // 22b: bipush 53
      // 22d: bipush 3
      // 22e: bipush 52
      // 230: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 233: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 236: bipush 0
      // 237: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 23a: aload 0
      // 23b: aload 1
      // 23c: aload 3
      // 23d: bipush 52
      // 23f: bipush 1
      // 240: bipush 51
      // 242: bipush 52
      // 244: bipush 3
      // 245: bipush 53
      // 247: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 24a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 24d: bipush 0
      // 24e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 251: aload 0
      // 252: aload 3
      // 253: bipush 0
      // 254: bipush 51
      // 256: bipush 57
      // 258: bipush 57
      // 25a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 25d: aload 4
      // 25f: ifnull 29d
      // 262: ifeq 2d5
      // 265: goto 26c
      // 268: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 26b: athrow
      // 26c: aload 0
      // 26d: aload 1
      // 26e: aload 3
      // 26f: bipush 7
      // 271: bipush 0
      // 272: bipush 51
      // 274: bipush 50
      // 276: bipush 0
      // 277: bipush 57
      // 279: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 27c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 27f: bipush 0
      // 280: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 283: aload 0
      // 284: aload 1
      // 285: aload 3
      // 286: bipush 7
      // 288: bipush 1
      // 289: bipush 51
      // 28b: bipush 50
      // 28d: bipush 10
      // 28f: bipush 57
      // 291: bipush 0
      // 292: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 295: bipush 0
      // 296: goto 29d
      // 299: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 29c: athrow
      // 29d: istore 5
      // 29f: iload 5
      // 2a1: bipush 4
      // 2a2: if_icmpge 2d5
      // 2a5: aload 0
      // 2a6: aload 1
      // 2a7: aload 3
      // 2a8: iload 5
      // 2aa: bipush 1
      // 2ab: iadd
      // 2ac: iload 5
      // 2ae: bipush 1
      // 2af: iadd
      // 2b0: bipush 57
      // 2b2: iload 5
      // 2b4: isub
      // 2b5: bipush 56
      // 2b7: iload 5
      // 2b9: isub
      // 2ba: iload 5
      // 2bc: bipush 1
      // 2bd: iadd
      // 2be: bipush 57
      // 2c0: iload 5
      // 2c2: isub
      // 2c3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 2c6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 2c9: bipush 0
      // 2ca: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2cd: iinc 5 1
      // 2d0: aload 4
      // 2d2: ifnonnull 29f
      // 2d5: return
   }

   private void on2(OpaquePredicate param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: aload 3
      // 007: bipush 7
      // 009: bipush 21
      // 00b: bipush 13
      // 00d: bipush 50
      // 00f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 012: aload 4
      // 014: ifnull 0e5
      // 017: ifeq 0d8
      // 01a: goto 021
      // 01d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: aload 1
      // 023: aload 3
      // 024: bipush 7
      // 026: bipush 0
      // 027: bipush 21
      // 029: bipush 13
      // 02b: bipush 0
      // 02c: bipush 50
      // 02e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 031: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 034: bipush 0
      // 035: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 038: aload 0
      // 039: aload 1
      // 03a: aload 3
      // 03b: bipush 7
      // 03d: bipush 1
      // 03e: bipush 21
      // 040: bipush 13
      // 042: bipush 10
      // 044: bipush 50
      // 046: bipush 0
      // 047: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 04a: aload 0
      // 04b: aload 1
      // 04c: aload 3
      // 04d: bipush 11
      // 04f: bipush 8
      // 051: bipush 21
      // 053: bipush 13
      // 055: bipush 8
      // 057: bipush 53
      // 059: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 05c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 05f: bipush 0
      // 060: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 063: bipush 0
      // 064: istore 5
      // 066: iload 5
      // 068: bipush 4
      // 069: if_icmpge 0a3
      // 06c: aload 0
      // 06d: aload 1
      // 06e: aload 3
      // 06f: iload 5
      // 071: bipush 7
      // 073: iadd
      // 074: iload 5
      // 076: bipush 5
      // 077: iadd
      // 078: bipush 21
      // 07a: iload 5
      // 07c: bipush 7
      // 07e: iadd
      // 07f: iload 5
      // 081: bipush 5
      // 082: iadd
      // 083: bipush 54
      // 085: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 088: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 08b: bipush 0
      // 08c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 08f: iinc 5 1
      // 092: aload 4
      // 094: ifnull 0a7
      // 097: aload 4
      // 099: ifnonnull 066
      // 09c: goto 0a3
      // 09f: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: bipush 21
      // 0a5: istore 5
      // 0a7: iload 5
      // 0a9: bipush 45
      // 0ab: if_icmpgt 0d8
      // 0ae: aload 0
      // 0af: aload 1
      // 0b0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 0b3: bipush 12
      // 0b5: bipush 9
      // 0b7: iload 5
      // 0b9: aload 3
      // 0ba: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0bd: iinc 5 3
      // 0c0: aload 4
      // 0c2: ifnull 1ab
      // 0c5: goto 0cc
      // 0c8: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 4
      // 0ce: ifnonnull 0a7
      // 0d1: goto 0d8
      // 0d4: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: aload 3
      // 0da: bipush 44
      // 0dc: bipush 21
      // 0de: bipush 50
      // 0e0: bipush 54
      // 0e2: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 0e5: aload 4
      // 0e7: ifnull 1b8
      // 0ea: ifeq 1ab
      // 0ed: goto 0f4
      // 0f0: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: aload 1
      // 0f6: aload 3
      // 0f7: bipush 44
      // 0f9: bipush 0
      // 0fa: bipush 21
      // 0fc: bipush 50
      // 0fe: bipush 0
      // 0ff: bipush 50
      // 101: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 104: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 107: bipush 0
      // 108: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 10b: aload 0
      // 10c: aload 1
      // 10d: aload 3
      // 10e: bipush 44
      // 110: bipush 1
      // 111: bipush 21
      // 113: bipush 50
      // 115: bipush 10
      // 117: bipush 50
      // 119: bipush 0
      // 11a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 11d: aload 0
      // 11e: aload 1
      // 11f: aload 3
      // 120: bipush 44
      // 122: bipush 8
      // 124: bipush 21
      // 126: bipush 46
      // 128: bipush 8
      // 12a: bipush 53
      // 12c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 12f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 132: bipush 0
      // 133: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 136: bipush 0
      // 137: istore 5
      // 139: iload 5
      // 13b: bipush 4
      // 13c: if_icmpge 176
      // 13f: aload 0
      // 140: aload 1
      // 141: aload 3
      // 142: bipush 50
      // 144: iload 5
      // 146: isub
      // 147: iload 5
      // 149: bipush 5
      // 14a: iadd
      // 14b: bipush 21
      // 14d: bipush 50
      // 14f: iload 5
      // 151: isub
      // 152: iload 5
      // 154: bipush 5
      // 155: iadd
      // 156: bipush 54
      // 158: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 15b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 15e: bipush 0
      // 15f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 162: iinc 5 1
      // 165: aload 4
      // 167: ifnull 17a
      // 16a: aload 4
      // 16c: ifnonnull 139
      // 16f: goto 176
      // 172: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 175: athrow
      // 176: bipush 21
      // 178: istore 5
      // 17a: iload 5
      // 17c: bipush 45
      // 17e: if_icmpgt 1ab
      // 181: aload 0
      // 182: aload 1
      // 183: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 186: bipush 45
      // 188: bipush 9
      // 18a: iload 5
      // 18c: aload 3
      // 18d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 190: iinc 5 3
      // 193: aload 4
      // 195: ifnull 3d3
      // 198: goto 19f
      // 19b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 19e: athrow
      // 19f: aload 4
      // 1a1: ifnonnull 17a
      // 1a4: goto 1ab
      // 1a7: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1aa: athrow
      // 1ab: aload 0
      // 1ac: aload 3
      // 1ad: bipush 8
      // 1af: bipush 44
      // 1b1: bipush 49
      // 1b3: bipush 54
      // 1b5: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 1b8: aload 4
      // 1ba: ifnull 1f9
      // 1bd: ifeq 3d3
      // 1c0: goto 1c7
      // 1c3: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1c6: athrow
      // 1c7: aload 0
      // 1c8: aload 1
      // 1c9: aload 3
      // 1ca: bipush 14
      // 1cc: bipush 0
      // 1cd: bipush 44
      // 1cf: bipush 43
      // 1d1: bipush 0
      // 1d2: bipush 50
      // 1d4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 1d7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 1da: bipush 0
      // 1db: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1de: aload 0
      // 1df: aload 1
      // 1e0: aload 3
      // 1e1: bipush 14
      // 1e3: bipush 1
      // 1e4: bipush 44
      // 1e6: bipush 43
      // 1e8: bipush 10
      // 1ea: bipush 50
      // 1ec: bipush 0
      // 1ed: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 1f0: bipush 12
      // 1f2: goto 1f9
      // 1f5: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: istore 5
      // 1fb: iload 5
      // 1fd: bipush 45
      // 1ff: if_icmpgt 35a
      // 202: aload 0
      // 203: aload 1
      // 204: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 207: iload 5
      // 209: bipush 9
      // 20b: bipush 45
      // 20d: aload 3
      // 20e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 211: aload 0
      // 212: aload 1
      // 213: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 216: iload 5
      // 218: bipush 9
      // 21a: bipush 52
      // 21c: aload 3
      // 21d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 220: aload 4
      // 222: ifnull 343
      // 225: iload 5
      // 227: bipush 12
      // 229: aload 4
      // 22b: ifnull 360
      // 22e: goto 235
      // 231: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 234: athrow
      // 235: if_icmpeq 2b5
      // 238: goto 23f
      // 23b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 23e: athrow
      // 23f: iload 5
      // 241: bipush 18
      // 243: aload 4
      // 245: ifnull 264
      // 248: goto 24f
      // 24b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 24e: athrow
      // 24f: if_icmpeq 2b5
      // 252: goto 259
      // 255: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 258: athrow
      // 259: iload 5
      // 25b: bipush 24
      // 25d: goto 264
      // 260: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 263: athrow
      // 264: aload 4
      // 266: ifnull 27e
      // 269: if_icmpeq 2b5
      // 26c: goto 273
      // 26f: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 272: athrow
      // 273: iload 5
      // 275: bipush 33
      // 277: goto 27e
      // 27a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 27d: athrow
      // 27e: aload 4
      // 280: ifnull 298
      // 283: if_icmpeq 2b5
      // 286: goto 28d
      // 289: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 28c: athrow
      // 28d: iload 5
      // 28f: bipush 39
      // 291: goto 298
      // 294: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 297: athrow
      // 298: aload 4
      // 29a: ifnull 2b2
      // 29d: if_icmpeq 2b5
      // 2a0: goto 2a7
      // 2a3: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 2a6: athrow
      // 2a7: iload 5
      // 2a9: bipush 45
      // 2ab: goto 2b2
      // 2ae: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 2b1: athrow
      // 2b2: if_icmpne 352
      // 2b5: aload 0
      // 2b6: aload 1
      // 2b7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 2ba: iload 5
      // 2bc: bipush 9
      // 2be: bipush 47
      // 2c0: aload 3
      // 2c1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2c4: aload 0
      // 2c5: aload 1
      // 2c6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 2c9: iload 5
      // 2cb: bipush 9
      // 2cd: bipush 50
      // 2cf: aload 3
      // 2d0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2d3: aload 0
      // 2d4: aload 1
      // 2d5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 2d8: iload 5
      // 2da: bipush 10
      // 2dc: bipush 45
      // 2de: aload 3
      // 2df: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2e2: aload 0
      // 2e3: aload 1
      // 2e4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 2e7: iload 5
      // 2e9: bipush 10
      // 2eb: bipush 46
      // 2ed: aload 3
      // 2ee: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2f1: aload 0
      // 2f2: aload 1
      // 2f3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 2f6: iload 5
      // 2f8: bipush 10
      // 2fa: bipush 51
      // 2fc: aload 3
      // 2fd: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 300: aload 0
      // 301: aload 1
      // 302: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 305: iload 5
      // 307: bipush 10
      // 309: bipush 52
      // 30b: aload 3
      // 30c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 30f: aload 0
      // 310: aload 1
      // 311: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 314: iload 5
      // 316: bipush 11
      // 318: bipush 47
      // 31a: aload 3
      // 31b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 31e: aload 0
      // 31f: aload 1
      // 320: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 323: iload 5
      // 325: bipush 11
      // 327: bipush 50
      // 329: aload 3
      // 32a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 32d: aload 0
      // 32e: aload 1
      // 32f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 332: iload 5
      // 334: bipush 12
      // 336: bipush 48
      // 338: aload 3
      // 339: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 33c: goto 343
      // 33f: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 342: athrow
      // 343: aload 0
      // 344: aload 1
      // 345: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 348: iload 5
      // 34a: bipush 12
      // 34c: bipush 49
      // 34e: aload 3
      // 34f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 352: iinc 5 3
      // 355: aload 4
      // 357: ifnonnull 1fb
      // 35a: bipush 0
      // 35b: istore 5
      // 35d: iload 5
      // 35f: bipush 3
      // 360: if_icmpge 3a1
      // 363: aload 0
      // 364: aload 1
      // 365: aload 3
      // 366: bipush 8
      // 368: iload 5
      // 36a: iadd
      // 36b: bipush 5
      // 36c: iload 5
      // 36e: iadd
      // 36f: bipush 54
      // 371: bipush 49
      // 373: iload 5
      // 375: isub
      // 376: bipush 5
      // 377: iload 5
      // 379: iadd
      // 37a: bipush 54
      // 37c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 37f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 382: bipush 0
      // 383: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 386: iinc 5 1
      // 389: aload 4
      // 38b: ifnull 3ba
      // 38e: goto 395
      // 391: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 394: athrow
      // 395: aload 4
      // 397: ifnonnull 35d
      // 39a: goto 3a1
      // 39d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 3a0: athrow
      // 3a1: aload 0
      // 3a2: aload 1
      // 3a3: aload 3
      // 3a4: bipush 11
      // 3a6: bipush 8
      // 3a8: bipush 54
      // 3aa: bipush 46
      // 3ac: bipush 8
      // 3ae: bipush 54
      // 3b0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 3b3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 3b6: bipush 0
      // 3b7: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3ba: aload 0
      // 3bb: aload 1
      // 3bc: aload 3
      // 3bd: bipush 14
      // 3bf: bipush 8
      // 3c1: bipush 44
      // 3c3: bipush 43
      // 3c5: bipush 8
      // 3c7: bipush 53
      // 3c9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 3cc: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 3cf: bipush 0
      // 3d0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3d3: return
   }

   private void k7y(OpaquePredicate param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: aload 3
      // 007: bipush 14
      // 009: bipush 21
      // 00b: bipush 20
      // 00d: bipush 43
      // 00f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 012: aload 4
      // 014: ifnull 103
      // 017: ifeq 0f6
      // 01a: goto 021
      // 01d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: aload 1
      // 023: aload 3
      // 024: bipush 14
      // 026: bipush 0
      // 027: bipush 21
      // 029: bipush 20
      // 02b: bipush 0
      // 02c: bipush 43
      // 02e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 031: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 034: bipush 0
      // 035: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 038: aload 0
      // 039: aload 1
      // 03a: aload 3
      // 03b: bipush 14
      // 03d: bipush 1
      // 03e: bipush 22
      // 040: bipush 20
      // 042: bipush 14
      // 044: bipush 43
      // 046: bipush 0
      // 047: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 04a: aload 0
      // 04b: aload 1
      // 04c: aload 3
      // 04d: bipush 18
      // 04f: bipush 12
      // 051: bipush 22
      // 053: bipush 20
      // 055: bipush 12
      // 057: bipush 39
      // 059: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 05c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 05f: bipush 0
      // 060: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 063: aload 0
      // 064: aload 1
      // 065: aload 3
      // 066: bipush 18
      // 068: bipush 12
      // 06a: bipush 21
      // 06c: bipush 20
      // 06e: bipush 12
      // 070: bipush 21
      // 072: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 075: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 078: bipush 0
      // 079: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 07c: bipush 0
      // 07d: istore 5
      // 07f: iload 5
      // 081: bipush 4
      // 082: if_icmpge 0c1
      // 085: aload 0
      // 086: aload 1
      // 087: aload 3
      // 088: iload 5
      // 08a: bipush 14
      // 08c: iadd
      // 08d: iload 5
      // 08f: bipush 9
      // 091: iadd
      // 092: bipush 21
      // 094: iload 5
      // 096: bipush 14
      // 098: iadd
      // 099: iload 5
      // 09b: bipush 9
      // 09d: iadd
      // 09e: bipush 43
      // 0a0: iload 5
      // 0a2: isub
      // 0a3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0a6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 0a9: bipush 0
      // 0aa: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0ad: iinc 5 1
      // 0b0: aload 4
      // 0b2: ifnull 0c5
      // 0b5: aload 4
      // 0b7: ifnonnull 07f
      // 0ba: goto 0c1
      // 0bd: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: bipush 23
      // 0c3: istore 5
      // 0c5: iload 5
      // 0c7: bipush 39
      // 0c9: if_icmpgt 0f6
      // 0cc: aload 0
      // 0cd: aload 1
      // 0ce: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 0d1: bipush 19
      // 0d3: bipush 13
      // 0d5: iload 5
      // 0d7: aload 3
      // 0d8: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0db: iinc 5 3
      // 0de: aload 4
      // 0e0: ifnull 1e7
      // 0e3: goto 0ea
      // 0e6: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: aload 4
      // 0ec: ifnonnull 0c5
      // 0ef: goto 0f6
      // 0f2: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: aload 3
      // 0f8: bipush 37
      // 0fa: bipush 21
      // 0fc: bipush 43
      // 0fe: bipush 43
      // 100: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 103: aload 4
      // 105: ifnull 1f4
      // 108: ifeq 1e7
      // 10b: goto 112
      // 10e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 111: athrow
      // 112: aload 0
      // 113: aload 1
      // 114: aload 3
      // 115: bipush 37
      // 117: bipush 0
      // 118: bipush 21
      // 11a: bipush 43
      // 11c: bipush 0
      // 11d: bipush 43
      // 11f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 122: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 125: bipush 0
      // 126: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 129: aload 0
      // 12a: aload 1
      // 12b: aload 3
      // 12c: bipush 37
      // 12e: bipush 1
      // 12f: bipush 22
      // 131: bipush 43
      // 133: bipush 14
      // 135: bipush 43
      // 137: bipush 0
      // 138: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 13b: aload 0
      // 13c: aload 1
      // 13d: aload 3
      // 13e: bipush 37
      // 140: bipush 12
      // 142: bipush 22
      // 144: bipush 39
      // 146: bipush 12
      // 148: bipush 39
      // 14a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 14d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 150: bipush 0
      // 151: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 154: aload 0
      // 155: aload 1
      // 156: aload 3
      // 157: bipush 37
      // 159: bipush 12
      // 15b: bipush 21
      // 15d: bipush 39
      // 15f: bipush 12
      // 161: bipush 21
      // 163: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 166: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 169: bipush 0
      // 16a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 16d: bipush 0
      // 16e: istore 5
      // 170: iload 5
      // 172: bipush 4
      // 173: if_icmpge 1b2
      // 176: aload 0
      // 177: aload 1
      // 178: aload 3
      // 179: bipush 43
      // 17b: iload 5
      // 17d: isub
      // 17e: iload 5
      // 180: bipush 9
      // 182: iadd
      // 183: bipush 21
      // 185: bipush 43
      // 187: iload 5
      // 189: isub
      // 18a: iload 5
      // 18c: bipush 9
      // 18e: iadd
      // 18f: bipush 43
      // 191: iload 5
      // 193: isub
      // 194: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 197: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 19a: bipush 0
      // 19b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 19e: iinc 5 1
      // 1a1: aload 4
      // 1a3: ifnull 1b6
      // 1a6: aload 4
      // 1a8: ifnonnull 170
      // 1ab: goto 1b2
      // 1ae: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1b1: athrow
      // 1b2: bipush 23
      // 1b4: istore 5
      // 1b6: iload 5
      // 1b8: bipush 39
      // 1ba: if_icmpgt 1e7
      // 1bd: aload 0
      // 1be: aload 1
      // 1bf: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 1c2: bipush 38
      // 1c4: bipush 13
      // 1c6: iload 5
      // 1c8: aload 3
      // 1c9: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1cc: iinc 5 3
      // 1cf: aload 4
      // 1d1: ifnull 2bd
      // 1d4: goto 1db
      // 1d7: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1da: athrow
      // 1db: aload 4
      // 1dd: ifnonnull 1b6
      // 1e0: goto 1e7
      // 1e3: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 1e6: athrow
      // 1e7: aload 0
      // 1e8: aload 3
      // 1e9: bipush 15
      // 1eb: bipush 37
      // 1ed: bipush 42
      // 1ef: bipush 43
      // 1f1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.mjo (Lyve;IIII)Z
      // 1f4: aload 4
      // 1f6: ifnull 24d
      // 1f9: ifeq 2bd
      // 1fc: goto 203
      // 1ff: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 202: athrow
      // 203: aload 0
      // 204: aload 1
      // 205: aload 3
      // 206: bipush 21
      // 208: bipush 0
      // 209: bipush 37
      // 20b: bipush 36
      // 20d: bipush 0
      // 20e: bipush 43
      // 210: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 213: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 216: bipush 0
      // 217: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 21a: aload 0
      // 21b: aload 1
      // 21c: aload 3
      // 21d: bipush 21
      // 21f: bipush 1
      // 220: bipush 37
      // 222: bipush 36
      // 224: bipush 14
      // 226: bipush 43
      // 228: bipush 0
      // 229: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 22c: aload 0
      // 22d: aload 1
      // 22e: aload 3
      // 22f: bipush 21
      // 231: bipush 12
      // 233: bipush 37
      // 235: bipush 36
      // 237: bipush 12
      // 239: bipush 39
      // 23b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 23e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.v7m Lzfz;
      // 241: bipush 0
      // 242: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 245: bipush 0
      // 246: goto 24d
      // 249: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 24c: athrow
      // 24d: istore 5
      // 24f: iload 5
      // 251: bipush 4
      // 252: if_icmpge 294
      // 255: aload 0
      // 256: aload 1
      // 257: aload 3
      // 258: bipush 15
      // 25a: iload 5
      // 25c: iadd
      // 25d: iload 5
      // 25f: bipush 9
      // 261: iadd
      // 262: bipush 43
      // 264: iload 5
      // 266: isub
      // 267: bipush 42
      // 269: iload 5
      // 26b: isub
      // 26c: iload 5
      // 26e: bipush 9
      // 270: iadd
      // 271: bipush 43
      // 273: iload 5
      // 275: isub
      // 276: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 279: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzf Lzfz;
      // 27c: bipush 0
      // 27d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 280: iinc 5 1
      // 283: aload 4
      // 285: ifnull 298
      // 288: aload 4
      // 28a: ifnonnull 24f
      // 28d: goto 294
      // 290: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 293: athrow
      // 294: bipush 21
      // 296: istore 5
      // 298: iload 5
      // 29a: bipush 36
      // 29c: if_icmpgt 2bd
      // 29f: aload 0
      // 2a0: aload 1
      // 2a1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.vvr Lzfz;
      // 2a4: iload 5
      // 2a6: bipush 13
      // 2a8: bipush 38
      // 2aa: aload 3
      // 2ab: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2ae: iinc 5 3
      // 2b1: aload 4
      // 2b3: ifnonnull 298
      // 2b6: goto 2bd
      // 2b9: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding.a (Loov;)Loov;
      // 2bc: athrow
      // 2bd: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
