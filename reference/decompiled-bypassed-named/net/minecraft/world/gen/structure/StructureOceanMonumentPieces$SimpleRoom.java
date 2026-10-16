package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$SimpleRoom extends StructureOceanMonumentPieces$Piece {
   private int vjk;

   public StructureOceanMonumentPieces$SimpleRoom() {
   }

   public StructureOceanMonumentPieces$SimpleRoom(vt2 var1, StructureOceanMonumentPieces$man var2, Random var3) {
      super(1, var1, var2, 1, 1, 1);
      this.vjk = var3.nextInt(3);
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
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 009: aload 4
      // 00b: ifnull 055
      // 00e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.o8f I
      // 011: bipush 25
      // 013: idiv
      // 014: ifle 03b
      // 017: goto 01e
      // 01a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: aload 1
      // 020: aload 3
      // 021: bipush 0
      // 022: bipush 0
      // 023: aload 0
      // 024: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 027: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 02a: getstatic vt2.m3r Lvt2;
      // 02d: invokevirtual vt2.c3s ()I
      // 030: baload
      // 031: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.tux (Lt9d;Lyve;IIZ)V
      // 034: goto 03b
      // 037: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: aload 4
      // 03e: ifnull 071
      // 041: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 044: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 047: getstatic vt2.rf3 Lvt2;
      // 04a: invokevirtual vt2.c3s ()I
      // 04d: aaload
      // 04e: goto 055
      // 051: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 054: athrow
      // 055: ifnonnull 070
      // 058: aload 0
      // 059: aload 1
      // 05a: aload 3
      // 05b: bipush 1
      // 05c: bipush 4
      // 05d: bipush 1
      // 05e: bipush 6
      // 060: bipush 4
      // 061: bipush 6
      // 063: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 066: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cm0 (Lt9d;Lyve;IIIIIILzfz;)V
      // 069: goto 070
      // 06c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 06f: athrow
      // 070: aload 0
      // 071: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.vjk I
      // 074: aload 4
      // 076: ifnull 08e
      // 079: ifeq 10e
      // 07c: goto 083
      // 07f: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 082: athrow
      // 083: aload 2
      // 084: invokevirtual java/util/Random.nextBoolean ()Z
      // 087: goto 08e
      // 08a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 4
      // 090: ifnull 0b2
      // 093: ifeq 10e
      // 096: goto 09d
      // 099: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 0
      // 09e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 0a1: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 0a4: getstatic vt2.m3r Lvt2;
      // 0a7: invokevirtual vt2.c3s ()I
      // 0aa: baload
      // 0ab: goto 0b2
      // 0ae: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 4
      // 0b4: ifnull 0d6
      // 0b7: ifne 10e
      // 0ba: goto 0c1
      // 0bd: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 0c5: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 0c8: getstatic vt2.rf3 Lvt2;
      // 0cb: invokevirtual vt2.c3s ()I
      // 0ce: baload
      // 0cf: goto 0d6
      // 0d2: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 4
      // 0d8: ifnull 0f3
      // 0db: ifne 10e
      // 0de: goto 0e5
      // 0e1: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 0e9: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.eqz ()I
      // 0ec: goto 0f3
      // 0ef: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 4
      // 0f5: ifnull 10b
      // 0f8: bipush 1
      // 0f9: if_icmple 10e
      // 0fc: goto 103
      // 0ff: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 102: athrow
      // 103: bipush 1
      // 104: goto 10b
      // 107: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 10a: athrow
      // 10b: goto 10f
      // 10e: bipush 0
      // 10f: istore 5
      // 111: aload 0
      // 112: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.vjk I
      // 115: aload 4
      // 117: ifnull 4b3
      // 11a: ifne 4a8
      // 11d: goto 124
      // 120: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 123: athrow
      // 124: aload 0
      // 125: aload 1
      // 126: aload 3
      // 127: bipush 0
      // 128: bipush 1
      // 129: bipush 0
      // 12a: bipush 2
      // 12b: bipush 1
      // 12c: bipush 2
      // 12d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 130: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 133: bipush 0
      // 134: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 137: aload 0
      // 138: aload 1
      // 139: aload 3
      // 13a: bipush 0
      // 13b: bipush 3
      // 13c: bipush 0
      // 13d: bipush 2
      // 13e: bipush 3
      // 13f: bipush 2
      // 140: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 143: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 146: bipush 0
      // 147: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 14a: aload 0
      // 14b: aload 1
      // 14c: aload 3
      // 14d: bipush 0
      // 14e: bipush 2
      // 14f: bipush 0
      // 150: bipush 0
      // 151: bipush 2
      // 152: bipush 2
      // 153: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 156: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 159: bipush 0
      // 15a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 15d: aload 0
      // 15e: aload 1
      // 15f: aload 3
      // 160: bipush 1
      // 161: bipush 2
      // 162: bipush 0
      // 163: bipush 2
      // 164: bipush 2
      // 165: bipush 0
      // 166: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 169: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 16c: bipush 0
      // 16d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 170: aload 0
      // 171: aload 1
      // 172: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.mip Lzfz;
      // 175: bipush 1
      // 176: bipush 2
      // 177: bipush 1
      // 178: aload 3
      // 179: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 17c: aload 0
      // 17d: aload 1
      // 17e: aload 3
      // 17f: bipush 5
      // 180: bipush 1
      // 181: bipush 0
      // 182: bipush 7
      // 184: bipush 1
      // 185: bipush 2
      // 186: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 189: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 18c: bipush 0
      // 18d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 190: aload 0
      // 191: aload 1
      // 192: aload 3
      // 193: bipush 5
      // 194: bipush 3
      // 195: bipush 0
      // 196: bipush 7
      // 198: bipush 3
      // 199: bipush 2
      // 19a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 19d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 1a0: bipush 0
      // 1a1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1a4: aload 0
      // 1a5: aload 1
      // 1a6: aload 3
      // 1a7: bipush 7
      // 1a9: bipush 2
      // 1aa: bipush 0
      // 1ab: bipush 7
      // 1ad: bipush 2
      // 1ae: bipush 2
      // 1af: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 1b2: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 1b5: bipush 0
      // 1b6: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1b9: aload 0
      // 1ba: aload 1
      // 1bb: aload 3
      // 1bc: bipush 5
      // 1bd: bipush 2
      // 1be: bipush 0
      // 1bf: bipush 6
      // 1c1: bipush 2
      // 1c2: bipush 0
      // 1c3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 1c6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 1c9: bipush 0
      // 1ca: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1cd: aload 0
      // 1ce: aload 1
      // 1cf: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.mip Lzfz;
      // 1d2: bipush 6
      // 1d4: bipush 2
      // 1d5: bipush 1
      // 1d6: aload 3
      // 1d7: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1da: aload 0
      // 1db: aload 1
      // 1dc: aload 3
      // 1dd: bipush 0
      // 1de: bipush 1
      // 1df: bipush 5
      // 1e0: bipush 2
      // 1e1: bipush 1
      // 1e2: bipush 7
      // 1e4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 1e7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 1ea: bipush 0
      // 1eb: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1ee: aload 0
      // 1ef: aload 1
      // 1f0: aload 3
      // 1f1: bipush 0
      // 1f2: bipush 3
      // 1f3: bipush 5
      // 1f4: bipush 2
      // 1f5: bipush 3
      // 1f6: bipush 7
      // 1f8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 1fb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 1fe: bipush 0
      // 1ff: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 202: aload 0
      // 203: aload 1
      // 204: aload 3
      // 205: bipush 0
      // 206: bipush 2
      // 207: bipush 5
      // 208: bipush 0
      // 209: bipush 2
      // 20a: bipush 7
      // 20c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 20f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 212: bipush 0
      // 213: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 216: aload 0
      // 217: aload 1
      // 218: aload 3
      // 219: bipush 1
      // 21a: bipush 2
      // 21b: bipush 7
      // 21d: bipush 2
      // 21e: bipush 2
      // 21f: bipush 7
      // 221: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 224: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 227: bipush 0
      // 228: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 22b: aload 0
      // 22c: aload 1
      // 22d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.mip Lzfz;
      // 230: bipush 1
      // 231: bipush 2
      // 232: bipush 6
      // 234: aload 3
      // 235: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 238: aload 0
      // 239: aload 1
      // 23a: aload 3
      // 23b: bipush 5
      // 23c: bipush 1
      // 23d: bipush 5
      // 23e: bipush 7
      // 240: bipush 1
      // 241: bipush 7
      // 243: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 246: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 249: bipush 0
      // 24a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 24d: aload 0
      // 24e: aload 1
      // 24f: aload 3
      // 250: bipush 5
      // 251: bipush 3
      // 252: bipush 5
      // 253: bipush 7
      // 255: bipush 3
      // 256: bipush 7
      // 258: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 25b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 25e: bipush 0
      // 25f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 262: aload 0
      // 263: aload 1
      // 264: aload 3
      // 265: bipush 7
      // 267: bipush 2
      // 268: bipush 5
      // 269: bipush 7
      // 26b: bipush 2
      // 26c: bipush 7
      // 26e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 271: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 274: bipush 0
      // 275: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 278: aload 0
      // 279: aload 1
      // 27a: aload 3
      // 27b: bipush 5
      // 27c: bipush 2
      // 27d: bipush 7
      // 27f: bipush 6
      // 281: bipush 2
      // 282: bipush 7
      // 284: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 287: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 28a: bipush 0
      // 28b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 28e: aload 0
      // 28f: aload 1
      // 290: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.mip Lzfz;
      // 293: bipush 6
      // 295: bipush 2
      // 296: bipush 6
      // 298: aload 3
      // 299: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 29c: aload 0
      // 29d: aload 4
      // 29f: ifnull 30d
      // 2a2: goto 2a9
      // 2a5: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 2a8: athrow
      // 2a9: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 2ac: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 2af: getstatic vt2.mxp Lvt2;
      // 2b2: invokevirtual vt2.c3s ()I
      // 2b5: baload
      // 2b6: ifeq 2df
      // 2b9: goto 2c0
      // 2bc: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 2bf: athrow
      // 2c0: aload 0
      // 2c1: aload 1
      // 2c2: aload 3
      // 2c3: bipush 3
      // 2c4: bipush 3
      // 2c5: bipush 0
      // 2c6: bipush 4
      // 2c7: bipush 3
      // 2c8: bipush 0
      // 2c9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 2cc: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 2cf: bipush 0
      // 2d0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2d3: aload 4
      // 2d5: ifnonnull 31f
      // 2d8: goto 2df
      // 2db: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 2de: athrow
      // 2df: aload 0
      // 2e0: aload 1
      // 2e1: aload 3
      // 2e2: bipush 3
      // 2e3: bipush 3
      // 2e4: bipush 0
      // 2e5: bipush 4
      // 2e6: bipush 3
      // 2e7: bipush 1
      // 2e8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 2eb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 2ee: bipush 0
      // 2ef: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2f2: aload 0
      // 2f3: aload 1
      // 2f4: aload 3
      // 2f5: bipush 3
      // 2f6: bipush 2
      // 2f7: bipush 0
      // 2f8: bipush 4
      // 2f9: bipush 2
      // 2fa: bipush 0
      // 2fb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 2fe: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 301: bipush 0
      // 302: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 305: aload 0
      // 306: goto 30d
      // 309: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 30c: athrow
      // 30d: aload 1
      // 30e: aload 3
      // 30f: bipush 3
      // 310: bipush 1
      // 311: bipush 0
      // 312: bipush 4
      // 313: bipush 1
      // 314: bipush 1
      // 315: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 318: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 31b: bipush 0
      // 31c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 31f: aload 0
      // 320: aload 4
      // 322: ifnull 38f
      // 325: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 328: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 32b: getstatic vt2.z9q Lvt2;
      // 32e: invokevirtual vt2.c3s ()I
      // 331: baload
      // 332: ifeq 35d
      // 335: goto 33c
      // 338: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 33b: athrow
      // 33c: aload 0
      // 33d: aload 1
      // 33e: aload 3
      // 33f: bipush 3
      // 340: bipush 3
      // 341: bipush 7
      // 343: bipush 4
      // 344: bipush 3
      // 345: bipush 7
      // 347: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 34a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 34d: bipush 0
      // 34e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 351: aload 4
      // 353: ifnonnull 3a3
      // 356: goto 35d
      // 359: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 35c: athrow
      // 35d: aload 0
      // 35e: aload 1
      // 35f: aload 3
      // 360: bipush 3
      // 361: bipush 3
      // 362: bipush 6
      // 364: bipush 4
      // 365: bipush 3
      // 366: bipush 7
      // 368: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 36b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 36e: bipush 0
      // 36f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 372: aload 0
      // 373: aload 1
      // 374: aload 3
      // 375: bipush 3
      // 376: bipush 2
      // 377: bipush 7
      // 379: bipush 4
      // 37a: bipush 2
      // 37b: bipush 7
      // 37d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 380: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 383: bipush 0
      // 384: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 387: aload 0
      // 388: goto 38f
      // 38b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 38e: athrow
      // 38f: aload 1
      // 390: aload 3
      // 391: bipush 3
      // 392: bipush 1
      // 393: bipush 6
      // 395: bipush 4
      // 396: bipush 1
      // 397: bipush 7
      // 399: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 39c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 39f: bipush 0
      // 3a0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3a3: aload 0
      // 3a4: aload 4
      // 3a6: ifnull 40d
      // 3a9: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 3ac: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 3af: getstatic vt2.te4 Lvt2;
      // 3b2: invokevirtual vt2.c3s ()I
      // 3b5: baload
      // 3b6: ifeq 3df
      // 3b9: goto 3c0
      // 3bc: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 3bf: athrow
      // 3c0: aload 0
      // 3c1: aload 1
      // 3c2: aload 3
      // 3c3: bipush 0
      // 3c4: bipush 3
      // 3c5: bipush 3
      // 3c6: bipush 0
      // 3c7: bipush 3
      // 3c8: bipush 4
      // 3c9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 3cc: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 3cf: bipush 0
      // 3d0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3d3: aload 4
      // 3d5: ifnonnull 41f
      // 3d8: goto 3df
      // 3db: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 3de: athrow
      // 3df: aload 0
      // 3e0: aload 1
      // 3e1: aload 3
      // 3e2: bipush 0
      // 3e3: bipush 3
      // 3e4: bipush 3
      // 3e5: bipush 1
      // 3e6: bipush 3
      // 3e7: bipush 4
      // 3e8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 3eb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 3ee: bipush 0
      // 3ef: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3f2: aload 0
      // 3f3: aload 1
      // 3f4: aload 3
      // 3f5: bipush 0
      // 3f6: bipush 2
      // 3f7: bipush 3
      // 3f8: bipush 0
      // 3f9: bipush 2
      // 3fa: bipush 4
      // 3fb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 3fe: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 401: bipush 0
      // 402: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 405: aload 0
      // 406: goto 40d
      // 409: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 40c: athrow
      // 40d: aload 1
      // 40e: aload 3
      // 40f: bipush 0
      // 410: bipush 1
      // 411: bipush 3
      // 412: bipush 1
      // 413: bipush 1
      // 414: bipush 4
      // 415: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 418: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 41b: bipush 0
      // 41c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 41f: aload 0
      // 420: aload 4
      // 422: ifnull 48f
      // 425: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 428: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 42b: getstatic vt2.zk4 Lvt2;
      // 42e: invokevirtual vt2.c3s ()I
      // 431: baload
      // 432: ifeq 45d
      // 435: goto 43c
      // 438: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 43b: athrow
      // 43c: aload 0
      // 43d: aload 1
      // 43e: aload 3
      // 43f: bipush 7
      // 441: bipush 3
      // 442: bipush 3
      // 443: bipush 7
      // 445: bipush 3
      // 446: bipush 4
      // 447: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 44a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 44d: bipush 0
      // 44e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 451: aload 4
      // 453: ifnonnull a1d
      // 456: goto 45d
      // 459: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 45c: athrow
      // 45d: aload 0
      // 45e: aload 1
      // 45f: aload 3
      // 460: bipush 6
      // 462: bipush 3
      // 463: bipush 3
      // 464: bipush 7
      // 466: bipush 3
      // 467: bipush 4
      // 468: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 46b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 46e: bipush 0
      // 46f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 472: aload 0
      // 473: aload 1
      // 474: aload 3
      // 475: bipush 7
      // 477: bipush 2
      // 478: bipush 3
      // 479: bipush 7
      // 47b: bipush 2
      // 47c: bipush 4
      // 47d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 480: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 483: bipush 0
      // 484: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 487: aload 0
      // 488: goto 48f
      // 48b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 48e: athrow
      // 48f: aload 1
      // 490: aload 3
      // 491: bipush 6
      // 493: bipush 1
      // 494: bipush 3
      // 495: bipush 7
      // 497: bipush 1
      // 498: bipush 4
      // 499: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 49c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 49f: bipush 0
      // 4a0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 4a3: aload 4
      // 4a5: ifnonnull a1d
      // 4a8: aload 0
      // 4a9: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.vjk I
      // 4ac: goto 4b3
      // 4af: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 4b2: athrow
      // 4b3: bipush 1
      // 4b4: aload 4
      // 4b6: ifnull 7ff
      // 4b9: if_icmpne 7e7
      // 4bc: goto 4c3
      // 4bf: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 4c2: athrow
      // 4c3: aload 0
      // 4c4: aload 1
      // 4c5: aload 3
      // 4c6: bipush 2
      // 4c7: bipush 1
      // 4c8: bipush 2
      // 4c9: bipush 2
      // 4ca: bipush 3
      // 4cb: bipush 2
      // 4cc: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 4cf: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 4d2: bipush 0
      // 4d3: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 4d6: aload 0
      // 4d7: aload 1
      // 4d8: aload 3
      // 4d9: bipush 2
      // 4da: bipush 1
      // 4db: bipush 5
      // 4dc: bipush 2
      // 4dd: bipush 3
      // 4de: bipush 5
      // 4df: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 4e2: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 4e5: bipush 0
      // 4e6: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 4e9: aload 0
      // 4ea: aload 1
      // 4eb: aload 3
      // 4ec: bipush 5
      // 4ed: bipush 1
      // 4ee: bipush 5
      // 4ef: bipush 5
      // 4f0: bipush 3
      // 4f1: bipush 5
      // 4f2: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 4f5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 4f8: bipush 0
      // 4f9: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 4fc: aload 0
      // 4fd: aload 1
      // 4fe: aload 3
      // 4ff: bipush 5
      // 500: bipush 1
      // 501: bipush 2
      // 502: bipush 5
      // 503: bipush 3
      // 504: bipush 2
      // 505: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 508: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 50b: bipush 0
      // 50c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 50f: aload 0
      // 510: aload 1
      // 511: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.mip Lzfz;
      // 514: bipush 2
      // 515: bipush 2
      // 516: bipush 2
      // 517: aload 3
      // 518: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 51b: aload 0
      // 51c: aload 1
      // 51d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.mip Lzfz;
      // 520: bipush 2
      // 521: bipush 2
      // 522: bipush 5
      // 523: aload 3
      // 524: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 527: aload 0
      // 528: aload 1
      // 529: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.mip Lzfz;
      // 52c: bipush 5
      // 52d: bipush 2
      // 52e: bipush 5
      // 52f: aload 3
      // 530: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 533: aload 0
      // 534: aload 1
      // 535: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.mip Lzfz;
      // 538: bipush 5
      // 539: bipush 2
      // 53a: bipush 2
      // 53b: aload 3
      // 53c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 53f: aload 0
      // 540: aload 1
      // 541: aload 3
      // 542: bipush 0
      // 543: bipush 1
      // 544: bipush 0
      // 545: bipush 1
      // 546: bipush 3
      // 547: bipush 0
      // 548: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 54b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 54e: bipush 0
      // 54f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 552: aload 0
      // 553: aload 1
      // 554: aload 3
      // 555: bipush 0
      // 556: bipush 1
      // 557: bipush 1
      // 558: bipush 0
      // 559: bipush 3
      // 55a: bipush 1
      // 55b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 55e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 561: bipush 0
      // 562: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 565: aload 0
      // 566: aload 1
      // 567: aload 3
      // 568: bipush 0
      // 569: bipush 1
      // 56a: bipush 7
      // 56c: bipush 1
      // 56d: bipush 3
      // 56e: bipush 7
      // 570: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 573: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 576: bipush 0
      // 577: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 57a: aload 0
      // 57b: aload 1
      // 57c: aload 3
      // 57d: bipush 0
      // 57e: bipush 1
      // 57f: bipush 6
      // 581: bipush 0
      // 582: bipush 3
      // 583: bipush 6
      // 585: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 588: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 58b: bipush 0
      // 58c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 58f: aload 0
      // 590: aload 1
      // 591: aload 3
      // 592: bipush 6
      // 594: bipush 1
      // 595: bipush 7
      // 597: bipush 7
      // 599: bipush 3
      // 59a: bipush 7
      // 59c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 59f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 5a2: bipush 0
      // 5a3: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 5a6: aload 0
      // 5a7: aload 1
      // 5a8: aload 3
      // 5a9: bipush 7
      // 5ab: bipush 1
      // 5ac: bipush 6
      // 5ae: bipush 7
      // 5b0: bipush 3
      // 5b1: bipush 6
      // 5b3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 5b6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 5b9: bipush 0
      // 5ba: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 5bd: aload 0
      // 5be: aload 1
      // 5bf: aload 3
      // 5c0: bipush 6
      // 5c2: bipush 1
      // 5c3: bipush 0
      // 5c4: bipush 7
      // 5c6: bipush 3
      // 5c7: bipush 0
      // 5c8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 5cb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 5ce: bipush 0
      // 5cf: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 5d2: aload 0
      // 5d3: aload 1
      // 5d4: aload 3
      // 5d5: bipush 7
      // 5d7: bipush 1
      // 5d8: bipush 1
      // 5d9: bipush 7
      // 5db: bipush 3
      // 5dc: bipush 1
      // 5dd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 5e0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 5e3: bipush 0
      // 5e4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 5e7: aload 0
      // 5e8: aload 1
      // 5e9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 5ec: bipush 1
      // 5ed: bipush 2
      // 5ee: bipush 0
      // 5ef: aload 3
      // 5f0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5f3: aload 0
      // 5f4: aload 1
      // 5f5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 5f8: bipush 0
      // 5f9: bipush 2
      // 5fa: bipush 1
      // 5fb: aload 3
      // 5fc: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5ff: aload 0
      // 600: aload 1
      // 601: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 604: bipush 1
      // 605: bipush 2
      // 606: bipush 7
      // 608: aload 3
      // 609: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 60c: aload 0
      // 60d: aload 1
      // 60e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 611: bipush 0
      // 612: bipush 2
      // 613: bipush 6
      // 615: aload 3
      // 616: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 619: aload 0
      // 61a: aload 1
      // 61b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 61e: bipush 6
      // 620: bipush 2
      // 621: bipush 7
      // 623: aload 3
      // 624: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 627: aload 0
      // 628: aload 1
      // 629: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 62c: bipush 7
      // 62e: bipush 2
      // 62f: bipush 6
      // 631: aload 3
      // 632: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 635: aload 0
      // 636: aload 1
      // 637: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 63a: bipush 6
      // 63c: bipush 2
      // 63d: bipush 0
      // 63e: aload 3
      // 63f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 642: aload 0
      // 643: aload 1
      // 644: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 647: bipush 7
      // 649: bipush 2
      // 64a: bipush 1
      // 64b: aload 3
      // 64c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 64f: aload 0
      // 650: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 653: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 656: getstatic vt2.mxp Lvt2;
      // 659: invokevirtual vt2.c3s ()I
      // 65c: baload
      // 65d: aload 4
      // 65f: ifnull 6c4
      // 662: goto 669
      // 665: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 668: athrow
      // 669: ifne 6b6
      // 66c: goto 673
      // 66f: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 672: athrow
      // 673: aload 0
      // 674: aload 1
      // 675: aload 3
      // 676: bipush 1
      // 677: bipush 3
      // 678: bipush 0
      // 679: bipush 6
      // 67b: bipush 3
      // 67c: bipush 0
      // 67d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 680: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 683: bipush 0
      // 684: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 687: aload 0
      // 688: aload 1
      // 689: aload 3
      // 68a: bipush 1
      // 68b: bipush 2
      // 68c: bipush 0
      // 68d: bipush 6
      // 68f: bipush 2
      // 690: bipush 0
      // 691: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 694: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 697: bipush 0
      // 698: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 69b: aload 0
      // 69c: aload 1
      // 69d: aload 3
      // 69e: bipush 1
      // 69f: bipush 1
      // 6a0: bipush 0
      // 6a1: bipush 6
      // 6a3: bipush 1
      // 6a4: bipush 0
      // 6a5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 6a8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 6ab: bipush 0
      // 6ac: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 6af: goto 6b6
      // 6b2: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 6b5: athrow
      // 6b6: aload 0
      // 6b7: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 6ba: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 6bd: getstatic vt2.z9q Lvt2;
      // 6c0: invokevirtual vt2.c3s ()I
      // 6c3: baload
      // 6c4: aload 4
      // 6c6: ifnull 72a
      // 6c9: ifne 71c
      // 6cc: goto 6d3
      // 6cf: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 6d2: athrow
      // 6d3: aload 0
      // 6d4: aload 1
      // 6d5: aload 3
      // 6d6: bipush 1
      // 6d7: bipush 3
      // 6d8: bipush 7
      // 6da: bipush 6
      // 6dc: bipush 3
      // 6dd: bipush 7
      // 6df: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 6e2: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 6e5: bipush 0
      // 6e6: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 6e9: aload 0
      // 6ea: aload 1
      // 6eb: aload 3
      // 6ec: bipush 1
      // 6ed: bipush 2
      // 6ee: bipush 7
      // 6f0: bipush 6
      // 6f2: bipush 2
      // 6f3: bipush 7
      // 6f5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 6f8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 6fb: bipush 0
      // 6fc: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 6ff: aload 0
      // 700: aload 1
      // 701: aload 3
      // 702: bipush 1
      // 703: bipush 1
      // 704: bipush 7
      // 706: bipush 6
      // 708: bipush 1
      // 709: bipush 7
      // 70b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 70e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 711: bipush 0
      // 712: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 715: goto 71c
      // 718: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 71b: athrow
      // 71c: aload 0
      // 71d: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 720: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 723: getstatic vt2.te4 Lvt2;
      // 726: invokevirtual vt2.c3s ()I
      // 729: baload
      // 72a: aload 4
      // 72c: ifnull 78a
      // 72f: ifne 77c
      // 732: goto 739
      // 735: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 738: athrow
      // 739: aload 0
      // 73a: aload 1
      // 73b: aload 3
      // 73c: bipush 0
      // 73d: bipush 3
      // 73e: bipush 1
      // 73f: bipush 0
      // 740: bipush 3
      // 741: bipush 6
      // 743: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 746: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 749: bipush 0
      // 74a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 74d: aload 0
      // 74e: aload 1
      // 74f: aload 3
      // 750: bipush 0
      // 751: bipush 2
      // 752: bipush 1
      // 753: bipush 0
      // 754: bipush 2
      // 755: bipush 6
      // 757: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 75a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 75d: bipush 0
      // 75e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 761: aload 0
      // 762: aload 1
      // 763: aload 3
      // 764: bipush 0
      // 765: bipush 1
      // 766: bipush 1
      // 767: bipush 0
      // 768: bipush 1
      // 769: bipush 6
      // 76b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 76e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 771: bipush 0
      // 772: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 775: goto 77c
      // 778: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 77b: athrow
      // 77c: aload 0
      // 77d: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 780: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 783: getstatic vt2.zk4 Lvt2;
      // 786: invokevirtual vt2.c3s ()I
      // 789: baload
      // 78a: aload 4
      // 78c: ifnull a1f
      // 78f: ifne a1d
      // 792: goto 799
      // 795: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 798: athrow
      // 799: aload 0
      // 79a: aload 1
      // 79b: aload 3
      // 79c: bipush 7
      // 79e: bipush 3
      // 79f: bipush 1
      // 7a0: bipush 7
      // 7a2: bipush 3
      // 7a3: bipush 6
      // 7a5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 7a8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 7ab: bipush 0
      // 7ac: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 7af: aload 0
      // 7b0: aload 1
      // 7b1: aload 3
      // 7b2: bipush 7
      // 7b4: bipush 2
      // 7b5: bipush 1
      // 7b6: bipush 7
      // 7b8: bipush 2
      // 7b9: bipush 6
      // 7bb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 7be: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // 7c1: bipush 0
      // 7c2: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 7c5: aload 0
      // 7c6: aload 1
      // 7c7: aload 3
      // 7c8: bipush 7
      // 7ca: bipush 1
      // 7cb: bipush 1
      // 7cc: bipush 7
      // 7ce: bipush 1
      // 7cf: bipush 6
      // 7d1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 7d4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 7d7: bipush 0
      // 7d8: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 7db: aload 4
      // 7dd: ifnonnull a1d
      // 7e0: goto 7e7
      // 7e3: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 7e6: athrow
      // 7e7: aload 0
      // 7e8: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.vjk I
      // 7eb: aload 4
      // 7ed: ifnull a1f
      // 7f0: goto 7f7
      // 7f3: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 7f6: athrow
      // 7f7: bipush 2
      // 7f8: goto 7ff
      // 7fb: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 7fe: athrow
      // 7ff: if_icmpne a1d
      // 802: aload 0
      // 803: aload 1
      // 804: aload 3
      // 805: bipush 0
      // 806: bipush 1
      // 807: bipush 0
      // 808: bipush 0
      // 809: bipush 1
      // 80a: bipush 7
      // 80c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 80f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 812: bipush 0
      // 813: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 816: aload 0
      // 817: aload 1
      // 818: aload 3
      // 819: bipush 7
      // 81b: bipush 1
      // 81c: bipush 0
      // 81d: bipush 7
      // 81f: bipush 1
      // 820: bipush 7
      // 822: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 825: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 828: bipush 0
      // 829: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 82c: aload 0
      // 82d: aload 1
      // 82e: aload 3
      // 82f: bipush 1
      // 830: bipush 1
      // 831: bipush 0
      // 832: bipush 6
      // 834: bipush 1
      // 835: bipush 0
      // 836: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 839: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 83c: bipush 0
      // 83d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 840: aload 0
      // 841: aload 1
      // 842: aload 3
      // 843: bipush 1
      // 844: bipush 1
      // 845: bipush 7
      // 847: bipush 6
      // 849: bipush 1
      // 84a: bipush 7
      // 84c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 84f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 852: bipush 0
      // 853: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 856: aload 0
      // 857: aload 1
      // 858: aload 3
      // 859: bipush 0
      // 85a: bipush 2
      // 85b: bipush 0
      // 85c: bipush 0
      // 85d: bipush 2
      // 85e: bipush 7
      // 860: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 863: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 866: bipush 0
      // 867: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 86a: aload 0
      // 86b: aload 1
      // 86c: aload 3
      // 86d: bipush 7
      // 86f: bipush 2
      // 870: bipush 0
      // 871: bipush 7
      // 873: bipush 2
      // 874: bipush 7
      // 876: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 879: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 87c: bipush 0
      // 87d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 880: aload 0
      // 881: aload 1
      // 882: aload 3
      // 883: bipush 1
      // 884: bipush 2
      // 885: bipush 0
      // 886: bipush 6
      // 888: bipush 2
      // 889: bipush 0
      // 88a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 88d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 890: bipush 0
      // 891: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 894: aload 0
      // 895: aload 1
      // 896: aload 3
      // 897: bipush 1
      // 898: bipush 2
      // 899: bipush 7
      // 89b: bipush 6
      // 89d: bipush 2
      // 89e: bipush 7
      // 8a0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 8a3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 8a6: bipush 0
      // 8a7: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 8aa: aload 0
      // 8ab: aload 1
      // 8ac: aload 3
      // 8ad: bipush 0
      // 8ae: bipush 3
      // 8af: bipush 0
      // 8b0: bipush 0
      // 8b1: bipush 3
      // 8b2: bipush 7
      // 8b4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 8b7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 8ba: bipush 0
      // 8bb: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 8be: aload 0
      // 8bf: aload 1
      // 8c0: aload 3
      // 8c1: bipush 7
      // 8c3: bipush 3
      // 8c4: bipush 0
      // 8c5: bipush 7
      // 8c7: bipush 3
      // 8c8: bipush 7
      // 8ca: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 8cd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 8d0: bipush 0
      // 8d1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 8d4: aload 0
      // 8d5: aload 1
      // 8d6: aload 3
      // 8d7: bipush 1
      // 8d8: bipush 3
      // 8d9: bipush 0
      // 8da: bipush 6
      // 8dc: bipush 3
      // 8dd: bipush 0
      // 8de: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 8e1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 8e4: bipush 0
      // 8e5: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 8e8: aload 0
      // 8e9: aload 1
      // 8ea: aload 3
      // 8eb: bipush 1
      // 8ec: bipush 3
      // 8ed: bipush 7
      // 8ef: bipush 6
      // 8f1: bipush 3
      // 8f2: bipush 7
      // 8f4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 8f7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // 8fa: bipush 0
      // 8fb: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 8fe: aload 0
      // 8ff: aload 1
      // 900: aload 3
      // 901: bipush 0
      // 902: bipush 1
      // 903: bipush 3
      // 904: bipush 0
      // 905: bipush 2
      // 906: bipush 4
      // 907: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 90a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 90d: bipush 0
      // 90e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 911: aload 0
      // 912: aload 1
      // 913: aload 3
      // 914: bipush 7
      // 916: bipush 1
      // 917: bipush 3
      // 918: bipush 7
      // 91a: bipush 2
      // 91b: bipush 4
      // 91c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 91f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 922: bipush 0
      // 923: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 926: aload 0
      // 927: aload 1
      // 928: aload 3
      // 929: bipush 3
      // 92a: bipush 1
      // 92b: bipush 0
      // 92c: bipush 4
      // 92d: bipush 2
      // 92e: bipush 0
      // 92f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 932: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 935: bipush 0
      // 936: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 939: aload 0
      // 93a: aload 1
      // 93b: aload 3
      // 93c: bipush 3
      // 93d: bipush 1
      // 93e: bipush 7
      // 940: bipush 4
      // 941: bipush 2
      // 942: bipush 7
      // 944: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 947: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.cyh Lzfz;
      // 94a: bipush 0
      // 94b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 94e: aload 0
      // 94f: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 952: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 955: getstatic vt2.mxp Lvt2;
      // 958: invokevirtual vt2.c3s ()I
      // 95b: baload
      // 95c: aload 4
      // 95e: ifnull 994
      // 961: goto 968
      // 964: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 967: athrow
      // 968: ifeq 986
      // 96b: goto 972
      // 96e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 971: athrow
      // 972: aload 0
      // 973: aload 1
      // 974: aload 3
      // 975: bipush 3
      // 976: bipush 1
      // 977: bipush 0
      // 978: bipush 4
      // 979: bipush 2
      // 97a: bipush 0
      // 97b: bipush 0
      // 97c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 97f: goto 986
      // 982: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 985: athrow
      // 986: aload 0
      // 987: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 98a: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 98d: getstatic vt2.z9q Lvt2;
      // 990: invokevirtual vt2.c3s ()I
      // 993: baload
      // 994: aload 4
      // 996: ifnull 9c7
      // 999: ifeq 9b9
      // 99c: goto 9a3
      // 99f: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 9a2: athrow
      // 9a3: aload 0
      // 9a4: aload 1
      // 9a5: aload 3
      // 9a6: bipush 3
      // 9a7: bipush 1
      // 9a8: bipush 7
      // 9aa: bipush 4
      // 9ab: bipush 2
      // 9ac: bipush 7
      // 9ae: bipush 0
      // 9af: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 9b2: goto 9b9
      // 9b5: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 9b8: athrow
      // 9b9: aload 0
      // 9ba: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 9bd: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 9c0: getstatic vt2.te4 Lvt2;
      // 9c3: invokevirtual vt2.c3s ()I
      // 9c6: baload
      // 9c7: aload 4
      // 9c9: ifnull 9f8
      // 9cc: ifeq 9ea
      // 9cf: goto 9d6
      // 9d2: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 9d5: athrow
      // 9d6: aload 0
      // 9d7: aload 1
      // 9d8: aload 3
      // 9d9: bipush 0
      // 9da: bipush 1
      // 9db: bipush 3
      // 9dc: bipush 0
      // 9dd: bipush 2
      // 9de: bipush 4
      // 9df: bipush 0
      // 9e0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 9e3: goto 9ea
      // 9e6: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // 9e9: athrow
      // 9ea: aload 0
      // 9eb: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 9ee: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 9f1: getstatic vt2.zk4 Lvt2;
      // 9f4: invokevirtual vt2.c3s ()I
      // 9f7: baload
      // 9f8: aload 4
      // 9fa: ifnull a1f
      // 9fd: ifeq a1d
      // a00: goto a07
      // a03: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // a06: athrow
      // a07: aload 0
      // a08: aload 1
      // a09: aload 3
      // a0a: bipush 7
      // a0c: bipush 1
      // a0d: bipush 3
      // a0e: bipush 7
      // a10: bipush 2
      // a11: bipush 4
      // a12: bipush 0
      // a13: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // a16: goto a1d
      // a19: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // a1c: athrow
      // a1d: iload 5
      // a1f: aload 4
      // a21: ifnull a6f
      // a24: ifeq a6e
      // a27: goto a2e
      // a2a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // a2d: athrow
      // a2e: aload 0
      // a2f: aload 1
      // a30: aload 3
      // a31: bipush 3
      // a32: bipush 1
      // a33: bipush 3
      // a34: bipush 4
      // a35: bipush 1
      // a36: bipush 4
      // a37: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // a3a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // a3d: bipush 0
      // a3e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // a41: aload 0
      // a42: aload 1
      // a43: aload 3
      // a44: bipush 3
      // a45: bipush 2
      // a46: bipush 3
      // a47: bipush 4
      // a48: bipush 2
      // a49: bipush 4
      // a4a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // a4d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.v7m Lzfz;
      // a50: bipush 0
      // a51: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // a54: aload 0
      // a55: aload 1
      // a56: aload 3
      // a57: bipush 3
      // a58: bipush 3
      // a59: bipush 3
      // a5a: bipush 4
      // a5b: bipush 3
      // a5c: bipush 4
      // a5d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // a60: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.lzf Lzfz;
      // a63: bipush 0
      // a64: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // a67: goto a6e
      // a6a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom.a (Loov;)Loov;
      // a6d: athrow
      // a6e: bipush 1
      // a6f: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
