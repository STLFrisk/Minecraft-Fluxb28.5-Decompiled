package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$MonumentCoreRoom extends StructureOceanMonumentPieces$Piece {
   public StructureOceanMonumentPieces$MonumentCoreRoom() {
   }

   public StructureOceanMonumentPieces$MonumentCoreRoom(vt2 var1, StructureOceanMonumentPieces$man var2, Random var3) {
      super(1, var1, var2, 2, 2, 2);
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
      // 001: aload 1
      // 002: aload 3
      // 003: bipush 1
      // 004: bipush 8
      // 006: bipush 0
      // 007: bipush 14
      // 009: bipush 8
      // 00b: bipush 14
      // 00d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.v7m Lzfz;
      // 010: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.cm0 (Lt9d;Lyve;IIIIIILzfz;)V
      // 013: bipush 7
      // 015: istore 5
      // 017: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 01a: astore 6
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 01f: aload 0
      // 020: aload 1
      // 021: aload 3
      // 022: bipush 0
      // 023: iload 5
      // 025: bipush 0
      // 026: bipush 0
      // 027: iload 5
      // 029: bipush 15
      // 02b: aload 6
      // 02d: aload 6
      // 02f: bipush 0
      // 030: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 033: aload 0
      // 034: aload 1
      // 035: aload 3
      // 036: bipush 15
      // 038: iload 5
      // 03a: bipush 0
      // 03b: bipush 15
      // 03d: iload 5
      // 03f: bipush 15
      // 041: aload 6
      // 043: aload 6
      // 045: bipush 0
      // 046: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 049: aload 0
      // 04a: aload 1
      // 04b: aload 3
      // 04c: bipush 1
      // 04d: iload 5
      // 04f: bipush 0
      // 050: bipush 15
      // 052: iload 5
      // 054: bipush 0
      // 055: aload 6
      // 057: aload 6
      // 059: bipush 0
      // 05a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 05d: astore 4
      // 05f: aload 0
      // 060: aload 1
      // 061: aload 3
      // 062: bipush 1
      // 063: iload 5
      // 065: bipush 15
      // 067: bipush 14
      // 069: iload 5
      // 06b: bipush 15
      // 06d: aload 6
      // 06f: aload 6
      // 071: bipush 0
      // 072: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 075: bipush 1
      // 076: istore 5
      // 078: iload 5
      // 07a: bipush 6
      // 07c: if_icmpgt 17d
      // 07f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 082: aload 4
      // 084: ifnull 0bf
      // 087: astore 6
      // 089: iload 5
      // 08b: bipush 2
      // 08c: aload 4
      // 08e: ifnull 1b9
      // 091: if_icmpeq 0b5
      // 094: goto 09b
      // 097: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.a (Loov;)Loov;
      // 09a: athrow
      // 09b: iload 5
      // 09d: aload 4
      // 09f: ifnull 0c2
      // 0a2: goto 0a9
      // 0a5: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: bipush 6
      // 0ab: if_icmpne 0c1
      // 0ae: goto 0b5
      // 0b1: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.v7m Lzfz;
      // 0b8: goto 0bf
      // 0bb: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: astore 6
      // 0c1: bipush 0
      // 0c2: istore 7
      // 0c4: iload 7
      // 0c6: bipush 15
      // 0c8: if_icmpgt 122
      // 0cb: aload 0
      // 0cc: aload 1
      // 0cd: aload 3
      // 0ce: iload 7
      // 0d0: iload 5
      // 0d2: bipush 0
      // 0d3: iload 7
      // 0d5: iload 5
      // 0d7: bipush 1
      // 0d8: aload 6
      // 0da: aload 6
      // 0dc: bipush 0
      // 0dd: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e0: aload 0
      // 0e1: aload 1
      // 0e2: aload 3
      // 0e3: iload 7
      // 0e5: iload 5
      // 0e7: bipush 6
      // 0e9: iload 7
      // 0eb: iload 5
      // 0ed: bipush 9
      // 0ef: aload 6
      // 0f1: aload 6
      // 0f3: bipush 0
      // 0f4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0f7: aload 0
      // 0f8: aload 1
      // 0f9: aload 3
      // 0fa: iload 7
      // 0fc: iload 5
      // 0fe: bipush 14
      // 100: iload 7
      // 102: iload 5
      // 104: bipush 15
      // 106: aload 6
      // 108: aload 6
      // 10a: bipush 0
      // 10b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 10e: iinc 7 15
      // 111: aload 4
      // 113: ifnull 178
      // 116: aload 4
      // 118: ifnonnull 0c4
      // 11b: goto 122
      // 11e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.a (Loov;)Loov;
      // 121: athrow
      // 122: aload 0
      // 123: aload 1
      // 124: aload 3
      // 125: bipush 1
      // 126: iload 5
      // 128: bipush 0
      // 129: bipush 1
      // 12a: iload 5
      // 12c: bipush 0
      // 12d: aload 6
      // 12f: aload 6
      // 131: bipush 0
      // 132: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 135: aload 0
      // 136: aload 1
      // 137: aload 3
      // 138: bipush 6
      // 13a: iload 5
      // 13c: bipush 0
      // 13d: bipush 9
      // 13f: iload 5
      // 141: bipush 0
      // 142: aload 6
      // 144: aload 6
      // 146: bipush 0
      // 147: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 14a: aload 0
      // 14b: aload 1
      // 14c: aload 3
      // 14d: bipush 14
      // 14f: iload 5
      // 151: bipush 0
      // 152: bipush 14
      // 154: iload 5
      // 156: bipush 0
      // 157: aload 6
      // 159: aload 6
      // 15b: bipush 0
      // 15c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 15f: aload 0
      // 160: aload 1
      // 161: aload 3
      // 162: bipush 1
      // 163: iload 5
      // 165: bipush 15
      // 167: bipush 14
      // 169: iload 5
      // 16b: bipush 15
      // 16d: aload 6
      // 16f: aload 6
      // 171: bipush 0
      // 172: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 175: iinc 5 1
      // 178: aload 4
      // 17a: ifnonnull 078
      // 17d: aload 0
      // 17e: aload 1
      // 17f: aload 3
      // 180: bipush 6
      // 182: bipush 3
      // 183: bipush 6
      // 185: bipush 9
      // 187: bipush 6
      // 189: bipush 9
      // 18b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.cyh Lzfz;
      // 18e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.cyh Lzfz;
      // 191: bipush 0
      // 192: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 195: aload 0
      // 196: aload 1
      // 197: aload 3
      // 198: bipush 7
      // 19a: bipush 4
      // 19b: bipush 7
      // 19d: bipush 8
      // 19f: bipush 5
      // 1a0: bipush 8
      // 1a2: getstatic ox_.pkt Le0x;
      // 1a5: invokevirtual e0x.l4i ()Lzfz;
      // 1a8: getstatic ox_.pkt Le0x;
      // 1ab: invokevirtual e0x.l4i ()Lzfz;
      // 1ae: bipush 0
      // 1af: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1b2: bipush 3
      // 1b3: istore 5
      // 1b5: iload 5
      // 1b7: bipush 6
      // 1b9: if_icmpgt 20d
      // 1bc: bipush 6
      // 1be: aload 4
      // 1c0: ifnull 47a
      // 1c3: goto 1ca
      // 1c6: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.a (Loov;)Loov;
      // 1c9: athrow
      // 1ca: istore 7
      // 1cc: iload 7
      // 1ce: bipush 9
      // 1d0: if_icmpgt 205
      // 1d3: aload 0
      // 1d4: aload 1
      // 1d5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.mip Lzfz;
      // 1d8: iload 7
      // 1da: iload 5
      // 1dc: bipush 6
      // 1de: aload 3
      // 1df: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1e2: aload 0
      // 1e3: aload 1
      // 1e4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.mip Lzfz;
      // 1e7: iload 7
      // 1e9: iload 5
      // 1eb: bipush 9
      // 1ed: aload 3
      // 1ee: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1f1: iinc 7 3
      // 1f4: aload 4
      // 1f6: ifnull 208
      // 1f9: aload 4
      // 1fb: ifnonnull 1cc
      // 1fe: goto 205
      // 201: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.a (Loov;)Loov;
      // 204: athrow
      // 205: iinc 5 3
      // 208: aload 4
      // 20a: ifnonnull 1b5
      // 20d: aload 0
      // 20e: aload 1
      // 20f: aload 3
      // 210: bipush 5
      // 211: bipush 1
      // 212: bipush 6
      // 214: bipush 5
      // 215: bipush 2
      // 216: bipush 6
      // 218: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 21b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 21e: bipush 0
      // 21f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 222: aload 0
      // 223: aload 1
      // 224: aload 3
      // 225: bipush 5
      // 226: bipush 1
      // 227: bipush 9
      // 229: bipush 5
      // 22a: bipush 2
      // 22b: bipush 9
      // 22d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 230: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 233: bipush 0
      // 234: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 237: aload 0
      // 238: aload 1
      // 239: aload 3
      // 23a: bipush 10
      // 23c: bipush 1
      // 23d: bipush 6
      // 23f: bipush 10
      // 241: bipush 2
      // 242: bipush 6
      // 244: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 247: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 24a: bipush 0
      // 24b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 24e: aload 0
      // 24f: aload 1
      // 250: aload 3
      // 251: bipush 10
      // 253: bipush 1
      // 254: bipush 9
      // 256: bipush 10
      // 258: bipush 2
      // 259: bipush 9
      // 25b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 25e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 261: bipush 0
      // 262: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 265: aload 0
      // 266: aload 1
      // 267: aload 3
      // 268: bipush 6
      // 26a: bipush 1
      // 26b: bipush 5
      // 26c: bipush 6
      // 26e: bipush 2
      // 26f: bipush 5
      // 270: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 273: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 276: bipush 0
      // 277: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 27a: aload 0
      // 27b: aload 1
      // 27c: aload 3
      // 27d: bipush 9
      // 27f: bipush 1
      // 280: bipush 5
      // 281: bipush 9
      // 283: bipush 2
      // 284: bipush 5
      // 285: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 288: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 28b: bipush 0
      // 28c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 28f: aload 0
      // 290: aload 1
      // 291: aload 3
      // 292: bipush 6
      // 294: bipush 1
      // 295: bipush 10
      // 297: bipush 6
      // 299: bipush 2
      // 29a: bipush 10
      // 29c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 29f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 2a2: bipush 0
      // 2a3: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2a6: aload 0
      // 2a7: aload 1
      // 2a8: aload 3
      // 2a9: bipush 9
      // 2ab: bipush 1
      // 2ac: bipush 10
      // 2ae: bipush 9
      // 2b0: bipush 2
      // 2b1: bipush 10
      // 2b3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 2b6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 2b9: bipush 0
      // 2ba: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2bd: aload 0
      // 2be: aload 1
      // 2bf: aload 3
      // 2c0: bipush 5
      // 2c1: bipush 2
      // 2c2: bipush 5
      // 2c3: bipush 5
      // 2c4: bipush 6
      // 2c6: bipush 5
      // 2c7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 2ca: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 2cd: bipush 0
      // 2ce: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2d1: aload 0
      // 2d2: aload 1
      // 2d3: aload 3
      // 2d4: bipush 5
      // 2d5: bipush 2
      // 2d6: bipush 10
      // 2d8: bipush 5
      // 2d9: bipush 6
      // 2db: bipush 10
      // 2dd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 2e0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 2e3: bipush 0
      // 2e4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2e7: aload 0
      // 2e8: aload 1
      // 2e9: aload 3
      // 2ea: bipush 10
      // 2ec: bipush 2
      // 2ed: bipush 5
      // 2ee: bipush 10
      // 2f0: bipush 6
      // 2f2: bipush 5
      // 2f3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 2f6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 2f9: bipush 0
      // 2fa: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2fd: aload 0
      // 2fe: aload 1
      // 2ff: aload 3
      // 300: bipush 10
      // 302: bipush 2
      // 303: bipush 10
      // 305: bipush 10
      // 307: bipush 6
      // 309: bipush 10
      // 30b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 30e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 311: bipush 0
      // 312: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 315: aload 0
      // 316: aload 1
      // 317: aload 3
      // 318: bipush 5
      // 319: bipush 7
      // 31b: bipush 1
      // 31c: bipush 5
      // 31d: bipush 7
      // 31f: bipush 6
      // 321: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 324: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 327: bipush 0
      // 328: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 32b: aload 0
      // 32c: aload 1
      // 32d: aload 3
      // 32e: bipush 10
      // 330: bipush 7
      // 332: bipush 1
      // 333: bipush 10
      // 335: bipush 7
      // 337: bipush 6
      // 339: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 33c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 33f: bipush 0
      // 340: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 343: aload 0
      // 344: aload 1
      // 345: aload 3
      // 346: bipush 5
      // 347: bipush 7
      // 349: bipush 9
      // 34b: bipush 5
      // 34c: bipush 7
      // 34e: bipush 14
      // 350: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 353: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 356: bipush 0
      // 357: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 35a: aload 0
      // 35b: aload 1
      // 35c: aload 3
      // 35d: bipush 10
      // 35f: bipush 7
      // 361: bipush 9
      // 363: bipush 10
      // 365: bipush 7
      // 367: bipush 14
      // 369: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 36c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 36f: bipush 0
      // 370: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 373: aload 0
      // 374: aload 1
      // 375: aload 3
      // 376: bipush 1
      // 377: bipush 7
      // 379: bipush 5
      // 37a: bipush 6
      // 37c: bipush 7
      // 37e: bipush 5
      // 37f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 382: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 385: bipush 0
      // 386: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 389: aload 0
      // 38a: aload 1
      // 38b: aload 3
      // 38c: bipush 1
      // 38d: bipush 7
      // 38f: bipush 10
      // 391: bipush 6
      // 393: bipush 7
      // 395: bipush 10
      // 397: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 39a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 39d: bipush 0
      // 39e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3a1: aload 0
      // 3a2: aload 1
      // 3a3: aload 3
      // 3a4: bipush 9
      // 3a6: bipush 7
      // 3a8: bipush 5
      // 3a9: bipush 14
      // 3ab: bipush 7
      // 3ad: bipush 5
      // 3ae: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 3b1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 3b4: bipush 0
      // 3b5: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3b8: aload 0
      // 3b9: aload 1
      // 3ba: aload 3
      // 3bb: bipush 9
      // 3bd: bipush 7
      // 3bf: bipush 10
      // 3c1: bipush 14
      // 3c3: bipush 7
      // 3c5: bipush 10
      // 3c7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 3ca: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 3cd: bipush 0
      // 3ce: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3d1: aload 0
      // 3d2: aload 1
      // 3d3: aload 3
      // 3d4: bipush 2
      // 3d5: bipush 1
      // 3d6: bipush 2
      // 3d7: bipush 2
      // 3d8: bipush 1
      // 3d9: bipush 3
      // 3da: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 3dd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 3e0: bipush 0
      // 3e1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3e4: aload 0
      // 3e5: aload 1
      // 3e6: aload 3
      // 3e7: bipush 3
      // 3e8: bipush 1
      // 3e9: bipush 2
      // 3ea: bipush 3
      // 3eb: bipush 1
      // 3ec: bipush 2
      // 3ed: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 3f0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 3f3: bipush 0
      // 3f4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3f7: aload 0
      // 3f8: aload 1
      // 3f9: aload 3
      // 3fa: bipush 13
      // 3fc: bipush 1
      // 3fd: bipush 2
      // 3fe: bipush 13
      // 400: bipush 1
      // 401: bipush 3
      // 402: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 405: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 408: bipush 0
      // 409: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 40c: aload 0
      // 40d: aload 1
      // 40e: aload 3
      // 40f: bipush 12
      // 411: bipush 1
      // 412: bipush 2
      // 413: bipush 12
      // 415: bipush 1
      // 416: bipush 2
      // 417: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 41a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 41d: bipush 0
      // 41e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 421: aload 0
      // 422: aload 1
      // 423: aload 3
      // 424: bipush 2
      // 425: bipush 1
      // 426: bipush 12
      // 428: bipush 2
      // 429: bipush 1
      // 42a: bipush 13
      // 42c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 42f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 432: bipush 0
      // 433: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 436: aload 0
      // 437: aload 1
      // 438: aload 3
      // 439: bipush 3
      // 43a: bipush 1
      // 43b: bipush 13
      // 43d: bipush 3
      // 43e: bipush 1
      // 43f: bipush 13
      // 441: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 444: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 447: bipush 0
      // 448: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 44b: aload 0
      // 44c: aload 1
      // 44d: aload 3
      // 44e: bipush 13
      // 450: bipush 1
      // 451: bipush 12
      // 453: bipush 13
      // 455: bipush 1
      // 456: bipush 13
      // 458: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 45b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 45e: bipush 0
      // 45f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 462: aload 0
      // 463: aload 1
      // 464: aload 3
      // 465: bipush 12
      // 467: bipush 1
      // 468: bipush 13
      // 46a: bipush 12
      // 46c: bipush 1
      // 46d: bipush 13
      // 46f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 472: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.lzf Lzfz;
      // 475: bipush 0
      // 476: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentCoreRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 479: bipush 1
      // 47a: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
