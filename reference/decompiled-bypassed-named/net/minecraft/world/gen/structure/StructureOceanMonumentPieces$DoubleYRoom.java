package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$DoubleYRoom extends StructureOceanMonumentPieces$Piece {
   public StructureOceanMonumentPieces$DoubleYRoom() {
   }

   public StructureOceanMonumentPieces$DoubleYRoom(vt2 var1, StructureOceanMonumentPieces$man var2, Random var3) {
      super(1, var1, var2, 1, 2, 1);
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
      // 006: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 009: aload 4
      // 00b: ifnull 049
      // 00e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.o8f I
      // 011: bipush 25
      // 013: idiv
      // 014: ifle 03b
      // 017: goto 01e
      // 01a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: aload 1
      // 020: aload 3
      // 021: bipush 0
      // 022: bipush 0
      // 023: aload 0
      // 024: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 027: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 02a: getstatic vt2.m3r Lvt2;
      // 02d: invokevirtual vt2.c3s ()I
      // 030: baload
      // 031: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.tux (Lt9d;Lyve;IIZ)V
      // 034: goto 03b
      // 037: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 03f: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 042: getstatic vt2.rf3 Lvt2;
      // 045: invokevirtual vt2.c3s ()I
      // 048: aaload
      // 049: astore 5
      // 04b: aload 5
      // 04d: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 050: getstatic vt2.rf3 Lvt2;
      // 053: invokevirtual vt2.c3s ()I
      // 056: aaload
      // 057: aload 4
      // 059: ifnull 176
      // 05c: ifnonnull 080
      // 05f: goto 066
      // 062: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 0
      // 067: aload 1
      // 068: aload 3
      // 069: bipush 1
      // 06a: bipush 8
      // 06c: bipush 1
      // 06d: bipush 6
      // 06f: bipush 8
      // 071: bipush 6
      // 073: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.v7m Lzfz;
      // 076: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.cm0 (Lt9d;Lyve;IIIIIILzfz;)V
      // 079: goto 080
      // 07c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 0
      // 081: aload 1
      // 082: aload 3
      // 083: bipush 0
      // 084: bipush 4
      // 085: bipush 0
      // 086: bipush 0
      // 087: bipush 4
      // 088: bipush 7
      // 08a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 08d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 090: bipush 0
      // 091: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 094: aload 0
      // 095: aload 1
      // 096: aload 3
      // 097: bipush 7
      // 099: bipush 4
      // 09a: bipush 0
      // 09b: bipush 7
      // 09d: bipush 4
      // 09e: bipush 7
      // 0a0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 0a3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 0a6: bipush 0
      // 0a7: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0aa: aload 0
      // 0ab: aload 1
      // 0ac: aload 3
      // 0ad: bipush 1
      // 0ae: bipush 4
      // 0af: bipush 0
      // 0b0: bipush 6
      // 0b2: bipush 4
      // 0b3: bipush 0
      // 0b4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 0b7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 0ba: bipush 0
      // 0bb: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0be: aload 0
      // 0bf: aload 1
      // 0c0: aload 3
      // 0c1: bipush 1
      // 0c2: bipush 4
      // 0c3: bipush 7
      // 0c5: bipush 6
      // 0c7: bipush 4
      // 0c8: bipush 7
      // 0ca: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 0cd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 0d0: bipush 0
      // 0d1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0d4: aload 0
      // 0d5: aload 1
      // 0d6: aload 3
      // 0d7: bipush 2
      // 0d8: bipush 4
      // 0d9: bipush 1
      // 0da: bipush 2
      // 0db: bipush 4
      // 0dc: bipush 2
      // 0dd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 0e0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 0e3: bipush 0
      // 0e4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e7: aload 0
      // 0e8: aload 1
      // 0e9: aload 3
      // 0ea: bipush 1
      // 0eb: bipush 4
      // 0ec: bipush 2
      // 0ed: bipush 1
      // 0ee: bipush 4
      // 0ef: bipush 2
      // 0f0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 0f3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 0f6: bipush 0
      // 0f7: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0fa: aload 0
      // 0fb: aload 1
      // 0fc: aload 3
      // 0fd: bipush 5
      // 0fe: bipush 4
      // 0ff: bipush 1
      // 100: bipush 5
      // 101: bipush 4
      // 102: bipush 2
      // 103: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 106: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 109: bipush 0
      // 10a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 10d: aload 0
      // 10e: aload 1
      // 10f: aload 3
      // 110: bipush 6
      // 112: bipush 4
      // 113: bipush 2
      // 114: bipush 6
      // 116: bipush 4
      // 117: bipush 2
      // 118: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 11b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 11e: bipush 0
      // 11f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 122: aload 0
      // 123: aload 1
      // 124: aload 3
      // 125: bipush 2
      // 126: bipush 4
      // 127: bipush 5
      // 128: bipush 2
      // 129: bipush 4
      // 12a: bipush 6
      // 12c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 12f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 132: bipush 0
      // 133: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 136: aload 0
      // 137: aload 1
      // 138: aload 3
      // 139: bipush 1
      // 13a: bipush 4
      // 13b: bipush 5
      // 13c: bipush 1
      // 13d: bipush 4
      // 13e: bipush 5
      // 13f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 142: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 145: bipush 0
      // 146: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 149: aload 0
      // 14a: aload 1
      // 14b: aload 3
      // 14c: bipush 5
      // 14d: bipush 4
      // 14e: bipush 5
      // 14f: bipush 5
      // 150: bipush 4
      // 151: bipush 6
      // 153: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 156: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 159: bipush 0
      // 15a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 15d: aload 0
      // 15e: aload 1
      // 15f: aload 3
      // 160: bipush 6
      // 162: bipush 4
      // 163: bipush 5
      // 164: bipush 6
      // 166: bipush 4
      // 167: bipush 5
      // 168: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 16b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 16e: bipush 0
      // 16f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 172: aload 0
      // 173: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 176: astore 6
      // 178: bipush 1
      // 179: istore 7
      // 17b: iload 7
      // 17d: bipush 5
      // 17e: if_icmpgt 46b
      // 181: bipush 0
      // 182: istore 8
      // 184: aload 4
      // 186: ifnull 225
      // 189: aload 6
      // 18b: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 18e: getstatic vt2.mxp Lvt2;
      // 191: invokevirtual vt2.c3s ()I
      // 194: baload
      // 195: aload 4
      // 197: ifnull 46c
      // 19a: goto 1a1
      // 19d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: ifeq 204
      // 1a4: goto 1ab
      // 1a7: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 1aa: athrow
      // 1ab: aload 0
      // 1ac: aload 1
      // 1ad: aload 3
      // 1ae: bipush 2
      // 1af: iload 7
      // 1b1: iload 8
      // 1b3: bipush 2
      // 1b4: iload 7
      // 1b6: bipush 2
      // 1b7: iadd
      // 1b8: iload 8
      // 1ba: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 1bd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 1c0: bipush 0
      // 1c1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1c4: aload 0
      // 1c5: aload 1
      // 1c6: aload 3
      // 1c7: bipush 5
      // 1c8: iload 7
      // 1ca: iload 8
      // 1cc: bipush 5
      // 1cd: iload 7
      // 1cf: bipush 2
      // 1d0: iadd
      // 1d1: iload 8
      // 1d3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 1d6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 1d9: bipush 0
      // 1da: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1dd: aload 0
      // 1de: aload 1
      // 1df: aload 3
      // 1e0: bipush 3
      // 1e1: iload 7
      // 1e3: bipush 2
      // 1e4: iadd
      // 1e5: iload 8
      // 1e7: bipush 4
      // 1e8: iload 7
      // 1ea: bipush 2
      // 1eb: iadd
      // 1ec: iload 8
      // 1ee: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 1f1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 1f4: bipush 0
      // 1f5: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1f8: aload 4
      // 1fa: ifnonnull 241
      // 1fd: goto 204
      // 200: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 203: athrow
      // 204: aload 0
      // 205: aload 1
      // 206: aload 3
      // 207: bipush 0
      // 208: iload 7
      // 20a: iload 8
      // 20c: bipush 7
      // 20e: iload 7
      // 210: bipush 2
      // 211: iadd
      // 212: iload 8
      // 214: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 217: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 21a: bipush 0
      // 21b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 21e: goto 225
      // 221: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 224: athrow
      // 225: aload 0
      // 226: aload 1
      // 227: aload 3
      // 228: bipush 0
      // 229: iload 7
      // 22b: bipush 1
      // 22c: iadd
      // 22d: iload 8
      // 22f: bipush 7
      // 231: iload 7
      // 233: bipush 1
      // 234: iadd
      // 235: iload 8
      // 237: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.v7m Lzfz;
      // 23a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.v7m Lzfz;
      // 23d: bipush 0
      // 23e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 241: bipush 7
      // 243: istore 8
      // 245: aload 4
      // 247: ifnull 2da
      // 24a: aload 6
      // 24c: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 24f: getstatic vt2.z9q Lvt2;
      // 252: invokevirtual vt2.c3s ()I
      // 255: baload
      // 256: ifeq 2b9
      // 259: goto 260
      // 25c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 25f: athrow
      // 260: aload 0
      // 261: aload 1
      // 262: aload 3
      // 263: bipush 2
      // 264: iload 7
      // 266: iload 8
      // 268: bipush 2
      // 269: iload 7
      // 26b: bipush 2
      // 26c: iadd
      // 26d: iload 8
      // 26f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 272: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 275: bipush 0
      // 276: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 279: aload 0
      // 27a: aload 1
      // 27b: aload 3
      // 27c: bipush 5
      // 27d: iload 7
      // 27f: iload 8
      // 281: bipush 5
      // 282: iload 7
      // 284: bipush 2
      // 285: iadd
      // 286: iload 8
      // 288: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 28b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 28e: bipush 0
      // 28f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 292: aload 0
      // 293: aload 1
      // 294: aload 3
      // 295: bipush 3
      // 296: iload 7
      // 298: bipush 2
      // 299: iadd
      // 29a: iload 8
      // 29c: bipush 4
      // 29d: iload 7
      // 29f: bipush 2
      // 2a0: iadd
      // 2a1: iload 8
      // 2a3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 2a6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 2a9: bipush 0
      // 2aa: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2ad: aload 4
      // 2af: ifnonnull 2f6
      // 2b2: goto 2b9
      // 2b5: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 2b8: athrow
      // 2b9: aload 0
      // 2ba: aload 1
      // 2bb: aload 3
      // 2bc: bipush 0
      // 2bd: iload 7
      // 2bf: iload 8
      // 2c1: bipush 7
      // 2c3: iload 7
      // 2c5: bipush 2
      // 2c6: iadd
      // 2c7: iload 8
      // 2c9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 2cc: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 2cf: bipush 0
      // 2d0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2d3: goto 2da
      // 2d6: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 2d9: athrow
      // 2da: aload 0
      // 2db: aload 1
      // 2dc: aload 3
      // 2dd: bipush 0
      // 2de: iload 7
      // 2e0: bipush 1
      // 2e1: iadd
      // 2e2: iload 8
      // 2e4: bipush 7
      // 2e6: iload 7
      // 2e8: bipush 1
      // 2e9: iadd
      // 2ea: iload 8
      // 2ec: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.v7m Lzfz;
      // 2ef: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.v7m Lzfz;
      // 2f2: bipush 0
      // 2f3: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2f6: bipush 0
      // 2f7: istore 9
      // 2f9: aload 4
      // 2fb: ifnull 38e
      // 2fe: aload 6
      // 300: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 303: getstatic vt2.te4 Lvt2;
      // 306: invokevirtual vt2.c3s ()I
      // 309: baload
      // 30a: ifeq 36d
      // 30d: goto 314
      // 310: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 313: athrow
      // 314: aload 0
      // 315: aload 1
      // 316: aload 3
      // 317: iload 9
      // 319: iload 7
      // 31b: bipush 2
      // 31c: iload 9
      // 31e: iload 7
      // 320: bipush 2
      // 321: iadd
      // 322: bipush 2
      // 323: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 326: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 329: bipush 0
      // 32a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 32d: aload 0
      // 32e: aload 1
      // 32f: aload 3
      // 330: iload 9
      // 332: iload 7
      // 334: bipush 5
      // 335: iload 9
      // 337: iload 7
      // 339: bipush 2
      // 33a: iadd
      // 33b: bipush 5
      // 33c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 33f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 342: bipush 0
      // 343: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 346: aload 0
      // 347: aload 1
      // 348: aload 3
      // 349: iload 9
      // 34b: iload 7
      // 34d: bipush 2
      // 34e: iadd
      // 34f: bipush 3
      // 350: iload 9
      // 352: iload 7
      // 354: bipush 2
      // 355: iadd
      // 356: bipush 4
      // 357: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 35a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 35d: bipush 0
      // 35e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 361: aload 4
      // 363: ifnonnull 3aa
      // 366: goto 36d
      // 369: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 36c: athrow
      // 36d: aload 0
      // 36e: aload 1
      // 36f: aload 3
      // 370: iload 9
      // 372: iload 7
      // 374: bipush 0
      // 375: iload 9
      // 377: iload 7
      // 379: bipush 2
      // 37a: iadd
      // 37b: bipush 7
      // 37d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 380: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 383: bipush 0
      // 384: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 387: goto 38e
      // 38a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 38d: athrow
      // 38e: aload 0
      // 38f: aload 1
      // 390: aload 3
      // 391: iload 9
      // 393: iload 7
      // 395: bipush 1
      // 396: iadd
      // 397: bipush 0
      // 398: iload 9
      // 39a: iload 7
      // 39c: bipush 1
      // 39d: iadd
      // 39e: bipush 7
      // 3a0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.v7m Lzfz;
      // 3a3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.v7m Lzfz;
      // 3a6: bipush 0
      // 3a7: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3aa: bipush 7
      // 3ac: istore 9
      // 3ae: aload 4
      // 3b0: ifnull 443
      // 3b3: aload 6
      // 3b5: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 3b8: getstatic vt2.zk4 Lvt2;
      // 3bb: invokevirtual vt2.c3s ()I
      // 3be: baload
      // 3bf: ifeq 422
      // 3c2: goto 3c9
      // 3c5: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 3c8: athrow
      // 3c9: aload 0
      // 3ca: aload 1
      // 3cb: aload 3
      // 3cc: iload 9
      // 3ce: iload 7
      // 3d0: bipush 2
      // 3d1: iload 9
      // 3d3: iload 7
      // 3d5: bipush 2
      // 3d6: iadd
      // 3d7: bipush 2
      // 3d8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 3db: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 3de: bipush 0
      // 3df: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3e2: aload 0
      // 3e3: aload 1
      // 3e4: aload 3
      // 3e5: iload 9
      // 3e7: iload 7
      // 3e9: bipush 5
      // 3ea: iload 9
      // 3ec: iload 7
      // 3ee: bipush 2
      // 3ef: iadd
      // 3f0: bipush 5
      // 3f1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 3f4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 3f7: bipush 0
      // 3f8: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3fb: aload 0
      // 3fc: aload 1
      // 3fd: aload 3
      // 3fe: iload 9
      // 400: iload 7
      // 402: bipush 2
      // 403: iadd
      // 404: bipush 3
      // 405: iload 9
      // 407: iload 7
      // 409: bipush 2
      // 40a: iadd
      // 40b: bipush 4
      // 40c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 40f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 412: bipush 0
      // 413: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 416: aload 4
      // 418: ifnonnull 45f
      // 41b: goto 422
      // 41e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 421: athrow
      // 422: aload 0
      // 423: aload 1
      // 424: aload 3
      // 425: iload 9
      // 427: iload 7
      // 429: bipush 0
      // 42a: iload 9
      // 42c: iload 7
      // 42e: bipush 2
      // 42f: iadd
      // 430: bipush 7
      // 432: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 435: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.lzf Lzfz;
      // 438: bipush 0
      // 439: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 43c: goto 443
      // 43f: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.a (Loov;)Loov;
      // 442: athrow
      // 443: aload 0
      // 444: aload 1
      // 445: aload 3
      // 446: iload 9
      // 448: iload 7
      // 44a: bipush 1
      // 44b: iadd
      // 44c: bipush 0
      // 44d: iload 9
      // 44f: iload 7
      // 451: bipush 1
      // 452: iadd
      // 453: bipush 7
      // 455: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.v7m Lzfz;
      // 458: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.v7m Lzfz;
      // 45b: bipush 0
      // 45c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 45f: aload 5
      // 461: astore 6
      // 463: iinc 7 4
      // 466: aload 4
      // 468: ifnonnull 17b
      // 46b: bipush 1
      // 46c: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
