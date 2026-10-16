package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$SimpleTopRoom extends StructureOceanMonumentPieces$Piece {
   public StructureOceanMonumentPieces$SimpleTopRoom() {
   }

   public StructureOceanMonumentPieces$SimpleTopRoom(vt2 var1, StructureOceanMonumentPieces$man var2, Random var3) {
      super(1, var1, var2, 1, 1, 1);
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
      // 006: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 009: aload 4
      // 00b: ifnull 055
      // 00e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.o8f I
      // 011: bipush 25
      // 013: idiv
      // 014: ifle 03b
      // 017: goto 01e
      // 01a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: aload 1
      // 020: aload 3
      // 021: bipush 0
      // 022: bipush 0
      // 023: aload 0
      // 024: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 027: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 02a: getstatic vt2.m3r Lvt2;
      // 02d: invokevirtual vt2.c3s ()I
      // 030: baload
      // 031: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.tux (Lt9d;Lyve;IIZ)V
      // 034: goto 03b
      // 037: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: aload 4
      // 03e: ifnull 059
      // 041: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 044: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 047: getstatic vt2.rf3 Lvt2;
      // 04a: invokevirtual vt2.c3s ()I
      // 04d: aaload
      // 04e: goto 055
      // 051: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.a (Loov;)Loov;
      // 054: athrow
      // 055: ifnonnull 069
      // 058: aload 0
      // 059: aload 1
      // 05a: aload 3
      // 05b: bipush 1
      // 05c: bipush 4
      // 05d: bipush 1
      // 05e: bipush 6
      // 060: bipush 4
      // 061: bipush 6
      // 063: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.v7m Lzfz;
      // 066: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cm0 (Lt9d;Lyve;IIIIIILzfz;)V
      // 069: bipush 1
      // 06a: istore 5
      // 06c: iload 5
      // 06e: bipush 6
      // 070: if_icmpgt 0e8
      // 073: bipush 1
      // 074: aload 4
      // 076: ifnull 242
      // 079: istore 6
      // 07b: iload 6
      // 07d: bipush 6
      // 07f: if_icmpgt 0e0
      // 082: aload 2
      // 083: bipush 3
      // 084: invokevirtual java/util/Random.nextInt (I)I
      // 087: aload 4
      // 089: ifnull 06e
      // 08c: aload 4
      // 08e: ifnull 09c
      // 091: ifeq 0d8
      // 094: goto 09b
      // 097: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.a (Loov;)Loov;
      // 09a: athrow
      // 09b: bipush 2
      // 09c: aload 2
      // 09d: bipush 4
      // 09e: invokevirtual java/util/Random.nextInt (I)I
      // 0a1: aload 4
      // 0a3: ifnull 0b1
      // 0a6: ifne 0b4
      // 0a9: goto 0b0
      // 0ac: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: bipush 0
      // 0b1: goto 0b5
      // 0b4: bipush 1
      // 0b5: iadd
      // 0b6: istore 7
      // 0b8: aload 0
      // 0b9: aload 1
      // 0ba: aload 3
      // 0bb: iload 5
      // 0bd: iload 7
      // 0bf: iload 6
      // 0c1: iload 5
      // 0c3: bipush 3
      // 0c4: iload 6
      // 0c6: getstatic ox_.u7i Le0x;
      // 0c9: bipush 1
      // 0ca: invokevirtual e0x.kig (I)Lzfz;
      // 0cd: getstatic ox_.u7i Le0x;
      // 0d0: bipush 1
      // 0d1: invokevirtual e0x.kig (I)Lzfz;
      // 0d4: bipush 0
      // 0d5: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0d8: iinc 6 1
      // 0db: aload 4
      // 0dd: ifnonnull 07b
      // 0e0: iinc 5 1
      // 0e3: aload 4
      // 0e5: ifnonnull 06c
      // 0e8: aload 0
      // 0e9: aload 1
      // 0ea: aload 3
      // 0eb: bipush 0
      // 0ec: bipush 1
      // 0ed: bipush 0
      // 0ee: bipush 0
      // 0ef: bipush 1
      // 0f0: bipush 7
      // 0f2: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 0f5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 0f8: bipush 0
      // 0f9: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0fc: aload 0
      // 0fd: aload 1
      // 0fe: aload 3
      // 0ff: bipush 7
      // 101: bipush 1
      // 102: bipush 0
      // 103: bipush 7
      // 105: bipush 1
      // 106: bipush 7
      // 108: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 10b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 10e: bipush 0
      // 10f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 112: aload 0
      // 113: aload 1
      // 114: aload 3
      // 115: bipush 1
      // 116: bipush 1
      // 117: bipush 0
      // 118: bipush 6
      // 11a: bipush 1
      // 11b: bipush 0
      // 11c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 11f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 122: bipush 0
      // 123: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 126: aload 0
      // 127: aload 1
      // 128: aload 3
      // 129: bipush 1
      // 12a: bipush 1
      // 12b: bipush 7
      // 12d: bipush 6
      // 12f: bipush 1
      // 130: bipush 7
      // 132: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 135: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 138: bipush 0
      // 139: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 13c: aload 0
      // 13d: aload 1
      // 13e: aload 3
      // 13f: bipush 0
      // 140: bipush 2
      // 141: bipush 0
      // 142: bipush 0
      // 143: bipush 2
      // 144: bipush 7
      // 146: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 149: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 14c: bipush 0
      // 14d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 150: aload 0
      // 151: aload 1
      // 152: aload 3
      // 153: bipush 7
      // 155: bipush 2
      // 156: bipush 0
      // 157: bipush 7
      // 159: bipush 2
      // 15a: bipush 7
      // 15c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 15f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 162: bipush 0
      // 163: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 166: aload 0
      // 167: aload 1
      // 168: aload 3
      // 169: bipush 1
      // 16a: bipush 2
      // 16b: bipush 0
      // 16c: bipush 6
      // 16e: bipush 2
      // 16f: bipush 0
      // 170: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 173: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 176: bipush 0
      // 177: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 17a: aload 0
      // 17b: aload 1
      // 17c: aload 3
      // 17d: bipush 1
      // 17e: bipush 2
      // 17f: bipush 7
      // 181: bipush 6
      // 183: bipush 2
      // 184: bipush 7
      // 186: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 189: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 18c: bipush 0
      // 18d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 190: aload 0
      // 191: aload 1
      // 192: aload 3
      // 193: bipush 0
      // 194: bipush 3
      // 195: bipush 0
      // 196: bipush 0
      // 197: bipush 3
      // 198: bipush 7
      // 19a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 19d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 1a0: bipush 0
      // 1a1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1a4: aload 0
      // 1a5: aload 1
      // 1a6: aload 3
      // 1a7: bipush 7
      // 1a9: bipush 3
      // 1aa: bipush 0
      // 1ab: bipush 7
      // 1ad: bipush 3
      // 1ae: bipush 7
      // 1b0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 1b3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 1b6: bipush 0
      // 1b7: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1ba: aload 0
      // 1bb: aload 1
      // 1bc: aload 3
      // 1bd: bipush 1
      // 1be: bipush 3
      // 1bf: bipush 0
      // 1c0: bipush 6
      // 1c2: bipush 3
      // 1c3: bipush 0
      // 1c4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 1c7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 1ca: bipush 0
      // 1cb: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1ce: aload 0
      // 1cf: aload 1
      // 1d0: aload 3
      // 1d1: bipush 1
      // 1d2: bipush 3
      // 1d3: bipush 7
      // 1d5: bipush 6
      // 1d7: bipush 3
      // 1d8: bipush 7
      // 1da: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 1dd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.lzf Lzfz;
      // 1e0: bipush 0
      // 1e1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1e4: aload 0
      // 1e5: aload 1
      // 1e6: aload 3
      // 1e7: bipush 0
      // 1e8: bipush 1
      // 1e9: bipush 3
      // 1ea: bipush 0
      // 1eb: bipush 2
      // 1ec: bipush 4
      // 1ed: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 1f0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 1f3: bipush 0
      // 1f4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1f7: aload 0
      // 1f8: aload 1
      // 1f9: aload 3
      // 1fa: bipush 7
      // 1fc: bipush 1
      // 1fd: bipush 3
      // 1fe: bipush 7
      // 200: bipush 2
      // 201: bipush 4
      // 202: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 205: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 208: bipush 0
      // 209: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 20c: aload 0
      // 20d: aload 1
      // 20e: aload 3
      // 20f: bipush 3
      // 210: bipush 1
      // 211: bipush 0
      // 212: bipush 4
      // 213: bipush 2
      // 214: bipush 0
      // 215: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 218: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 21b: bipush 0
      // 21c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 21f: aload 0
      // 220: aload 1
      // 221: aload 3
      // 222: bipush 3
      // 223: bipush 1
      // 224: bipush 7
      // 226: bipush 4
      // 227: bipush 2
      // 228: bipush 7
      // 22a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 22d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.cyh Lzfz;
      // 230: bipush 0
      // 231: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 234: aload 0
      // 235: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 238: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 23b: getstatic vt2.mxp Lvt2;
      // 23e: invokevirtual vt2.c3s ()I
      // 241: baload
      // 242: aload 4
      // 244: ifnull 266
      // 247: ifeq 265
      // 24a: goto 251
      // 24d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.a (Loov;)Loov;
      // 250: athrow
      // 251: aload 0
      // 252: aload 1
      // 253: aload 3
      // 254: bipush 3
      // 255: bipush 1
      // 256: bipush 0
      // 257: bipush 4
      // 258: bipush 2
      // 259: bipush 0
      // 25a: bipush 0
      // 25b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 25e: goto 265
      // 261: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleTopRoom.a (Loov;)Loov;
      // 264: athrow
      // 265: bipush 1
      // 266: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
