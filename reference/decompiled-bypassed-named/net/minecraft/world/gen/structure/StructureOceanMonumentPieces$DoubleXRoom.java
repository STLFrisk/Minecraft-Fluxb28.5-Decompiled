package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$DoubleXRoom extends StructureOceanMonumentPieces$Piece {
   public StructureOceanMonumentPieces$DoubleXRoom() {
   }

   public StructureOceanMonumentPieces$DoubleXRoom(vt2 var1, StructureOceanMonumentPieces$man var2, Random var3) {
      super(1, var1, var2, 2, 1, 1);
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
      // 000: aload 0
      // 001: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 004: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 007: getstatic vt2.zk4 Lvt2;
      // 00a: invokevirtual vt2.c3s ()I
      // 00d: aaload
      // 00e: astore 5
      // 010: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 013: aload 0
      // 014: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 017: astore 6
      // 019: astore 4
      // 01b: aload 0
      // 01c: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 01f: aload 4
      // 021: ifnull 070
      // 024: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.o8f I
      // 027: bipush 25
      // 029: idiv
      // 02a: ifle 064
      // 02d: goto 034
      // 030: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 033: athrow
      // 034: aload 0
      // 035: aload 1
      // 036: aload 3
      // 037: bipush 8
      // 039: bipush 0
      // 03a: aload 5
      // 03c: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 03f: getstatic vt2.m3r Lvt2;
      // 042: invokevirtual vt2.c3s ()I
      // 045: baload
      // 046: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.tux (Lt9d;Lyve;IIZ)V
      // 049: aload 0
      // 04a: aload 1
      // 04b: aload 3
      // 04c: bipush 0
      // 04d: bipush 0
      // 04e: aload 6
      // 050: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 053: getstatic vt2.m3r Lvt2;
      // 056: invokevirtual vt2.c3s ()I
      // 059: baload
      // 05a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.tux (Lt9d;Lyve;IIZ)V
      // 05d: goto 064
      // 060: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 063: athrow
      // 064: aload 6
      // 066: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 069: getstatic vt2.rf3 Lvt2;
      // 06c: invokevirtual vt2.c3s ()I
      // 06f: aaload
      // 070: aload 4
      // 072: ifnull 0a3
      // 075: ifnonnull 097
      // 078: goto 07f
      // 07b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 0
      // 080: aload 1
      // 081: aload 3
      // 082: bipush 1
      // 083: bipush 4
      // 084: bipush 1
      // 085: bipush 7
      // 087: bipush 4
      // 088: bipush 6
      // 08a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.v7m Lzfz;
      // 08d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.cm0 (Lt9d;Lyve;IIIIIILzfz;)V
      // 090: goto 097
      // 093: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 5
      // 099: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 09c: getstatic vt2.rf3 Lvt2;
      // 09f: invokevirtual vt2.c3s ()I
      // 0a2: aaload
      // 0a3: aload 4
      // 0a5: ifnull 220
      // 0a8: ifnonnull 0cb
      // 0ab: goto 0b2
      // 0ae: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: aload 1
      // 0b4: aload 3
      // 0b5: bipush 8
      // 0b7: bipush 4
      // 0b8: bipush 1
      // 0b9: bipush 14
      // 0bb: bipush 4
      // 0bc: bipush 6
      // 0be: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.v7m Lzfz;
      // 0c1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.cm0 (Lt9d;Lyve;IIIIIILzfz;)V
      // 0c4: goto 0cb
      // 0c7: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: aload 1
      // 0cd: aload 3
      // 0ce: bipush 0
      // 0cf: bipush 3
      // 0d0: bipush 0
      // 0d1: bipush 0
      // 0d2: bipush 3
      // 0d3: bipush 7
      // 0d5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 0d8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 0db: bipush 0
      // 0dc: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0df: aload 0
      // 0e0: aload 1
      // 0e1: aload 3
      // 0e2: bipush 15
      // 0e4: bipush 3
      // 0e5: bipush 0
      // 0e6: bipush 15
      // 0e8: bipush 3
      // 0e9: bipush 7
      // 0eb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 0ee: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 0f1: bipush 0
      // 0f2: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0f5: aload 0
      // 0f6: aload 1
      // 0f7: aload 3
      // 0f8: bipush 1
      // 0f9: bipush 3
      // 0fa: bipush 0
      // 0fb: bipush 15
      // 0fd: bipush 3
      // 0fe: bipush 0
      // 0ff: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 102: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 105: bipush 0
      // 106: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 109: aload 0
      // 10a: aload 1
      // 10b: aload 3
      // 10c: bipush 1
      // 10d: bipush 3
      // 10e: bipush 7
      // 110: bipush 14
      // 112: bipush 3
      // 113: bipush 7
      // 115: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 118: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 11b: bipush 0
      // 11c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 11f: aload 0
      // 120: aload 1
      // 121: aload 3
      // 122: bipush 0
      // 123: bipush 2
      // 124: bipush 0
      // 125: bipush 0
      // 126: bipush 2
      // 127: bipush 7
      // 129: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.v7m Lzfz;
      // 12c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.v7m Lzfz;
      // 12f: bipush 0
      // 130: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 133: aload 0
      // 134: aload 1
      // 135: aload 3
      // 136: bipush 15
      // 138: bipush 2
      // 139: bipush 0
      // 13a: bipush 15
      // 13c: bipush 2
      // 13d: bipush 7
      // 13f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.v7m Lzfz;
      // 142: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.v7m Lzfz;
      // 145: bipush 0
      // 146: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 149: aload 0
      // 14a: aload 1
      // 14b: aload 3
      // 14c: bipush 1
      // 14d: bipush 2
      // 14e: bipush 0
      // 14f: bipush 15
      // 151: bipush 2
      // 152: bipush 0
      // 153: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.v7m Lzfz;
      // 156: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.v7m Lzfz;
      // 159: bipush 0
      // 15a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 15d: aload 0
      // 15e: aload 1
      // 15f: aload 3
      // 160: bipush 1
      // 161: bipush 2
      // 162: bipush 7
      // 164: bipush 14
      // 166: bipush 2
      // 167: bipush 7
      // 169: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.v7m Lzfz;
      // 16c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.v7m Lzfz;
      // 16f: bipush 0
      // 170: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 173: aload 0
      // 174: aload 1
      // 175: aload 3
      // 176: bipush 0
      // 177: bipush 1
      // 178: bipush 0
      // 179: bipush 0
      // 17a: bipush 1
      // 17b: bipush 7
      // 17d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 180: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 183: bipush 0
      // 184: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 187: aload 0
      // 188: aload 1
      // 189: aload 3
      // 18a: bipush 15
      // 18c: bipush 1
      // 18d: bipush 0
      // 18e: bipush 15
      // 190: bipush 1
      // 191: bipush 7
      // 193: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 196: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 199: bipush 0
      // 19a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 19d: aload 0
      // 19e: aload 1
      // 19f: aload 3
      // 1a0: bipush 1
      // 1a1: bipush 1
      // 1a2: bipush 0
      // 1a3: bipush 15
      // 1a5: bipush 1
      // 1a6: bipush 0
      // 1a7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 1aa: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 1ad: bipush 0
      // 1ae: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1b1: aload 0
      // 1b2: aload 1
      // 1b3: aload 3
      // 1b4: bipush 1
      // 1b5: bipush 1
      // 1b6: bipush 7
      // 1b8: bipush 14
      // 1ba: bipush 1
      // 1bb: bipush 7
      // 1bd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 1c0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 1c3: bipush 0
      // 1c4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1c7: aload 0
      // 1c8: aload 1
      // 1c9: aload 3
      // 1ca: bipush 5
      // 1cb: bipush 1
      // 1cc: bipush 0
      // 1cd: bipush 10
      // 1cf: bipush 1
      // 1d0: bipush 4
      // 1d1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 1d4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 1d7: bipush 0
      // 1d8: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1db: aload 0
      // 1dc: aload 1
      // 1dd: aload 3
      // 1de: bipush 6
      // 1e0: bipush 2
      // 1e1: bipush 0
      // 1e2: bipush 9
      // 1e4: bipush 2
      // 1e5: bipush 3
      // 1e6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.v7m Lzfz;
      // 1e9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.v7m Lzfz;
      // 1ec: bipush 0
      // 1ed: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1f0: aload 0
      // 1f1: aload 1
      // 1f2: aload 3
      // 1f3: bipush 5
      // 1f4: bipush 3
      // 1f5: bipush 0
      // 1f6: bipush 10
      // 1f8: bipush 3
      // 1f9: bipush 4
      // 1fa: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 1fd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzf Lzfz;
      // 200: bipush 0
      // 201: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 204: aload 0
      // 205: aload 1
      // 206: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.mip Lzfz;
      // 209: bipush 6
      // 20b: bipush 2
      // 20c: bipush 3
      // 20d: aload 3
      // 20e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 211: aload 0
      // 212: aload 1
      // 213: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.mip Lzfz;
      // 216: bipush 9
      // 218: bipush 2
      // 219: bipush 3
      // 21a: aload 3
      // 21b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 21e: aload 6
      // 220: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 223: getstatic vt2.mxp Lvt2;
      // 226: invokevirtual vt2.c3s ()I
      // 229: baload
      // 22a: aload 4
      // 22c: ifnull 259
      // 22f: ifeq 24d
      // 232: goto 239
      // 235: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 238: athrow
      // 239: aload 0
      // 23a: aload 1
      // 23b: aload 3
      // 23c: bipush 3
      // 23d: bipush 1
      // 23e: bipush 0
      // 23f: bipush 4
      // 240: bipush 2
      // 241: bipush 0
      // 242: bipush 0
      // 243: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 246: goto 24d
      // 249: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 24c: athrow
      // 24d: aload 6
      // 24f: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 252: getstatic vt2.z9q Lvt2;
      // 255: invokevirtual vt2.c3s ()I
      // 258: baload
      // 259: aload 4
      // 25b: ifnull 28a
      // 25e: ifeq 27e
      // 261: goto 268
      // 264: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 267: athrow
      // 268: aload 0
      // 269: aload 1
      // 26a: aload 3
      // 26b: bipush 3
      // 26c: bipush 1
      // 26d: bipush 7
      // 26f: bipush 4
      // 270: bipush 2
      // 271: bipush 7
      // 273: bipush 0
      // 274: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 277: goto 27e
      // 27a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 27d: athrow
      // 27e: aload 6
      // 280: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 283: getstatic vt2.te4 Lvt2;
      // 286: invokevirtual vt2.c3s ()I
      // 289: baload
      // 28a: aload 4
      // 28c: ifnull 2b9
      // 28f: ifeq 2ad
      // 292: goto 299
      // 295: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 298: athrow
      // 299: aload 0
      // 29a: aload 1
      // 29b: aload 3
      // 29c: bipush 0
      // 29d: bipush 1
      // 29e: bipush 3
      // 29f: bipush 0
      // 2a0: bipush 2
      // 2a1: bipush 4
      // 2a2: bipush 0
      // 2a3: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 2a6: goto 2ad
      // 2a9: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 2ac: athrow
      // 2ad: aload 5
      // 2af: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 2b2: getstatic vt2.mxp Lvt2;
      // 2b5: invokevirtual vt2.c3s ()I
      // 2b8: baload
      // 2b9: aload 4
      // 2bb: ifnull 2ea
      // 2be: ifeq 2de
      // 2c1: goto 2c8
      // 2c4: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 2c7: athrow
      // 2c8: aload 0
      // 2c9: aload 1
      // 2ca: aload 3
      // 2cb: bipush 11
      // 2cd: bipush 1
      // 2ce: bipush 0
      // 2cf: bipush 12
      // 2d1: bipush 2
      // 2d2: bipush 0
      // 2d3: bipush 0
      // 2d4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 2d7: goto 2de
      // 2da: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 2dd: athrow
      // 2de: aload 5
      // 2e0: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 2e3: getstatic vt2.z9q Lvt2;
      // 2e6: invokevirtual vt2.c3s ()I
      // 2e9: baload
      // 2ea: aload 4
      // 2ec: ifnull 31d
      // 2ef: ifeq 311
      // 2f2: goto 2f9
      // 2f5: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 2f8: athrow
      // 2f9: aload 0
      // 2fa: aload 1
      // 2fb: aload 3
      // 2fc: bipush 11
      // 2fe: bipush 1
      // 2ff: bipush 7
      // 301: bipush 12
      // 303: bipush 2
      // 304: bipush 7
      // 306: bipush 0
      // 307: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 30a: goto 311
      // 30d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 310: athrow
      // 311: aload 5
      // 313: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 316: getstatic vt2.zk4 Lvt2;
      // 319: invokevirtual vt2.c3s ()I
      // 31c: baload
      // 31d: aload 4
      // 31f: ifnull 343
      // 322: ifeq 342
      // 325: goto 32c
      // 328: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 32b: athrow
      // 32c: aload 0
      // 32d: aload 1
      // 32e: aload 3
      // 32f: bipush 15
      // 331: bipush 1
      // 332: bipush 3
      // 333: bipush 15
      // 335: bipush 2
      // 336: bipush 4
      // 337: bipush 0
      // 338: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 33b: goto 342
      // 33e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXRoom.a (Loov;)Loov;
      // 341: athrow
      // 342: bipush 1
      // 343: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
