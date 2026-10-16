package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$DoubleZRoom extends StructureOceanMonumentPieces$Piece {
   public StructureOceanMonumentPieces$DoubleZRoom() {
   }

   public StructureOceanMonumentPieces$DoubleZRoom(vt2 var1, StructureOceanMonumentPieces$man var2, Random var3) {
      super(1, var1, var2, 1, 1, 2);
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
      // 001: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 004: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 007: getstatic vt2.z9q Lvt2;
      // 00a: invokevirtual vt2.c3s ()I
      // 00d: aaload
      // 00e: astore 5
      // 010: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 013: aload 0
      // 014: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 017: astore 6
      // 019: astore 4
      // 01b: aload 0
      // 01c: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 01f: aload 4
      // 021: ifnull 070
      // 024: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.o8f I
      // 027: bipush 25
      // 029: idiv
      // 02a: ifle 064
      // 02d: goto 034
      // 030: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 033: athrow
      // 034: aload 0
      // 035: aload 1
      // 036: aload 3
      // 037: bipush 0
      // 038: bipush 8
      // 03a: aload 5
      // 03c: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 03f: getstatic vt2.m3r Lvt2;
      // 042: invokevirtual vt2.c3s ()I
      // 045: baload
      // 046: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.tux (Lt9d;Lyve;IIZ)V
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
      // 05a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.tux (Lt9d;Lyve;IIZ)V
      // 05d: goto 064
      // 060: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
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
      // 07b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 0
      // 080: aload 1
      // 081: aload 3
      // 082: bipush 1
      // 083: bipush 4
      // 084: bipush 1
      // 085: bipush 6
      // 087: bipush 4
      // 088: bipush 7
      // 08a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.v7m Lzfz;
      // 08d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.cm0 (Lt9d;Lyve;IIIIIILzfz;)V
      // 090: goto 097
      // 093: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 5
      // 099: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 09c: getstatic vt2.rf3 Lvt2;
      // 09f: invokevirtual vt2.c3s ()I
      // 0a2: aaload
      // 0a3: aload 4
      // 0a5: ifnull 37d
      // 0a8: ifnonnull 0cb
      // 0ab: goto 0b2
      // 0ae: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: aload 1
      // 0b4: aload 3
      // 0b5: bipush 1
      // 0b6: bipush 4
      // 0b7: bipush 8
      // 0b9: bipush 6
      // 0bb: bipush 4
      // 0bc: bipush 14
      // 0be: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.v7m Lzfz;
      // 0c1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.cm0 (Lt9d;Lyve;IIIIIILzfz;)V
      // 0c4: goto 0cb
      // 0c7: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: aload 1
      // 0cd: aload 3
      // 0ce: bipush 0
      // 0cf: bipush 3
      // 0d0: bipush 0
      // 0d1: bipush 0
      // 0d2: bipush 3
      // 0d3: bipush 15
      // 0d5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 0d8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 0db: bipush 0
      // 0dc: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0df: aload 0
      // 0e0: aload 1
      // 0e1: aload 3
      // 0e2: bipush 7
      // 0e4: bipush 3
      // 0e5: bipush 0
      // 0e6: bipush 7
      // 0e8: bipush 3
      // 0e9: bipush 15
      // 0eb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 0ee: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 0f1: bipush 0
      // 0f2: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0f5: aload 0
      // 0f6: aload 1
      // 0f7: aload 3
      // 0f8: bipush 1
      // 0f9: bipush 3
      // 0fa: bipush 0
      // 0fb: bipush 7
      // 0fd: bipush 3
      // 0fe: bipush 0
      // 0ff: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 102: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 105: bipush 0
      // 106: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 109: aload 0
      // 10a: aload 1
      // 10b: aload 3
      // 10c: bipush 1
      // 10d: bipush 3
      // 10e: bipush 15
      // 110: bipush 6
      // 112: bipush 3
      // 113: bipush 15
      // 115: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 118: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 11b: bipush 0
      // 11c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 11f: aload 0
      // 120: aload 1
      // 121: aload 3
      // 122: bipush 0
      // 123: bipush 2
      // 124: bipush 0
      // 125: bipush 0
      // 126: bipush 2
      // 127: bipush 15
      // 129: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.v7m Lzfz;
      // 12c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.v7m Lzfz;
      // 12f: bipush 0
      // 130: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 133: aload 0
      // 134: aload 1
      // 135: aload 3
      // 136: bipush 7
      // 138: bipush 2
      // 139: bipush 0
      // 13a: bipush 7
      // 13c: bipush 2
      // 13d: bipush 15
      // 13f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.v7m Lzfz;
      // 142: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.v7m Lzfz;
      // 145: bipush 0
      // 146: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 149: aload 0
      // 14a: aload 1
      // 14b: aload 3
      // 14c: bipush 1
      // 14d: bipush 2
      // 14e: bipush 0
      // 14f: bipush 7
      // 151: bipush 2
      // 152: bipush 0
      // 153: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.v7m Lzfz;
      // 156: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.v7m Lzfz;
      // 159: bipush 0
      // 15a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 15d: aload 0
      // 15e: aload 1
      // 15f: aload 3
      // 160: bipush 1
      // 161: bipush 2
      // 162: bipush 15
      // 164: bipush 6
      // 166: bipush 2
      // 167: bipush 15
      // 169: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.v7m Lzfz;
      // 16c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.v7m Lzfz;
      // 16f: bipush 0
      // 170: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 173: aload 0
      // 174: aload 1
      // 175: aload 3
      // 176: bipush 0
      // 177: bipush 1
      // 178: bipush 0
      // 179: bipush 0
      // 17a: bipush 1
      // 17b: bipush 15
      // 17d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 180: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 183: bipush 0
      // 184: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 187: aload 0
      // 188: aload 1
      // 189: aload 3
      // 18a: bipush 7
      // 18c: bipush 1
      // 18d: bipush 0
      // 18e: bipush 7
      // 190: bipush 1
      // 191: bipush 15
      // 193: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 196: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 199: bipush 0
      // 19a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 19d: aload 0
      // 19e: aload 1
      // 19f: aload 3
      // 1a0: bipush 1
      // 1a1: bipush 1
      // 1a2: bipush 0
      // 1a3: bipush 7
      // 1a5: bipush 1
      // 1a6: bipush 0
      // 1a7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 1aa: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 1ad: bipush 0
      // 1ae: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1b1: aload 0
      // 1b2: aload 1
      // 1b3: aload 3
      // 1b4: bipush 1
      // 1b5: bipush 1
      // 1b6: bipush 15
      // 1b8: bipush 6
      // 1ba: bipush 1
      // 1bb: bipush 15
      // 1bd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 1c0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 1c3: bipush 0
      // 1c4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1c7: aload 0
      // 1c8: aload 1
      // 1c9: aload 3
      // 1ca: bipush 1
      // 1cb: bipush 1
      // 1cc: bipush 1
      // 1cd: bipush 1
      // 1ce: bipush 1
      // 1cf: bipush 2
      // 1d0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 1d3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 1d6: bipush 0
      // 1d7: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1da: aload 0
      // 1db: aload 1
      // 1dc: aload 3
      // 1dd: bipush 6
      // 1df: bipush 1
      // 1e0: bipush 1
      // 1e1: bipush 6
      // 1e3: bipush 1
      // 1e4: bipush 2
      // 1e5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 1e8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 1eb: bipush 0
      // 1ec: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1ef: aload 0
      // 1f0: aload 1
      // 1f1: aload 3
      // 1f2: bipush 1
      // 1f3: bipush 3
      // 1f4: bipush 1
      // 1f5: bipush 1
      // 1f6: bipush 3
      // 1f7: bipush 2
      // 1f8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 1fb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 1fe: bipush 0
      // 1ff: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 202: aload 0
      // 203: aload 1
      // 204: aload 3
      // 205: bipush 6
      // 207: bipush 3
      // 208: bipush 1
      // 209: bipush 6
      // 20b: bipush 3
      // 20c: bipush 2
      // 20d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 210: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 213: bipush 0
      // 214: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 217: aload 0
      // 218: aload 1
      // 219: aload 3
      // 21a: bipush 1
      // 21b: bipush 1
      // 21c: bipush 13
      // 21e: bipush 1
      // 21f: bipush 1
      // 220: bipush 14
      // 222: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 225: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 228: bipush 0
      // 229: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 22c: aload 0
      // 22d: aload 1
      // 22e: aload 3
      // 22f: bipush 6
      // 231: bipush 1
      // 232: bipush 13
      // 234: bipush 6
      // 236: bipush 1
      // 237: bipush 14
      // 239: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 23c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 23f: bipush 0
      // 240: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 243: aload 0
      // 244: aload 1
      // 245: aload 3
      // 246: bipush 1
      // 247: bipush 3
      // 248: bipush 13
      // 24a: bipush 1
      // 24b: bipush 3
      // 24c: bipush 14
      // 24e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 251: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 254: bipush 0
      // 255: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 258: aload 0
      // 259: aload 1
      // 25a: aload 3
      // 25b: bipush 6
      // 25d: bipush 3
      // 25e: bipush 13
      // 260: bipush 6
      // 262: bipush 3
      // 263: bipush 14
      // 265: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 268: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 26b: bipush 0
      // 26c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 26f: aload 0
      // 270: aload 1
      // 271: aload 3
      // 272: bipush 2
      // 273: bipush 1
      // 274: bipush 6
      // 276: bipush 2
      // 277: bipush 3
      // 278: bipush 6
      // 27a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 27d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 280: bipush 0
      // 281: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 284: aload 0
      // 285: aload 1
      // 286: aload 3
      // 287: bipush 5
      // 288: bipush 1
      // 289: bipush 6
      // 28b: bipush 5
      // 28c: bipush 3
      // 28d: bipush 6
      // 28f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 292: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 295: bipush 0
      // 296: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 299: aload 0
      // 29a: aload 1
      // 29b: aload 3
      // 29c: bipush 2
      // 29d: bipush 1
      // 29e: bipush 9
      // 2a0: bipush 2
      // 2a1: bipush 3
      // 2a2: bipush 9
      // 2a4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 2a7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 2aa: bipush 0
      // 2ab: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2ae: aload 0
      // 2af: aload 1
      // 2b0: aload 3
      // 2b1: bipush 5
      // 2b2: bipush 1
      // 2b3: bipush 9
      // 2b5: bipush 5
      // 2b6: bipush 3
      // 2b7: bipush 9
      // 2b9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 2bc: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 2bf: bipush 0
      // 2c0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2c3: aload 0
      // 2c4: aload 1
      // 2c5: aload 3
      // 2c6: bipush 3
      // 2c7: bipush 2
      // 2c8: bipush 6
      // 2ca: bipush 4
      // 2cb: bipush 2
      // 2cc: bipush 6
      // 2ce: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 2d1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 2d4: bipush 0
      // 2d5: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2d8: aload 0
      // 2d9: aload 1
      // 2da: aload 3
      // 2db: bipush 3
      // 2dc: bipush 2
      // 2dd: bipush 9
      // 2df: bipush 4
      // 2e0: bipush 2
      // 2e1: bipush 9
      // 2e3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 2e6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 2e9: bipush 0
      // 2ea: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2ed: aload 0
      // 2ee: aload 1
      // 2ef: aload 3
      // 2f0: bipush 2
      // 2f1: bipush 2
      // 2f2: bipush 7
      // 2f4: bipush 2
      // 2f5: bipush 2
      // 2f6: bipush 8
      // 2f8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 2fb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 2fe: bipush 0
      // 2ff: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 302: aload 0
      // 303: aload 1
      // 304: aload 3
      // 305: bipush 5
      // 306: bipush 2
      // 307: bipush 7
      // 309: bipush 5
      // 30a: bipush 2
      // 30b: bipush 8
      // 30d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 310: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 313: bipush 0
      // 314: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 317: aload 0
      // 318: aload 1
      // 319: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.mip Lzfz;
      // 31c: bipush 2
      // 31d: bipush 2
      // 31e: bipush 5
      // 31f: aload 3
      // 320: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 323: aload 0
      // 324: aload 1
      // 325: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.mip Lzfz;
      // 328: bipush 5
      // 329: bipush 2
      // 32a: bipush 5
      // 32b: aload 3
      // 32c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 32f: aload 0
      // 330: aload 1
      // 331: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.mip Lzfz;
      // 334: bipush 2
      // 335: bipush 2
      // 336: bipush 10
      // 338: aload 3
      // 339: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 33c: aload 0
      // 33d: aload 1
      // 33e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.mip Lzfz;
      // 341: bipush 5
      // 342: bipush 2
      // 343: bipush 10
      // 345: aload 3
      // 346: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 349: aload 0
      // 34a: aload 1
      // 34b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 34e: bipush 2
      // 34f: bipush 3
      // 350: bipush 5
      // 351: aload 3
      // 352: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 355: aload 0
      // 356: aload 1
      // 357: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 35a: bipush 5
      // 35b: bipush 3
      // 35c: bipush 5
      // 35d: aload 3
      // 35e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 361: aload 0
      // 362: aload 1
      // 363: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 366: bipush 2
      // 367: bipush 3
      // 368: bipush 10
      // 36a: aload 3
      // 36b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 36e: aload 0
      // 36f: aload 1
      // 370: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzf Lzfz;
      // 373: bipush 5
      // 374: bipush 3
      // 375: bipush 10
      // 377: aload 3
      // 378: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 37b: aload 6
      // 37d: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 380: getstatic vt2.mxp Lvt2;
      // 383: invokevirtual vt2.c3s ()I
      // 386: baload
      // 387: aload 4
      // 389: ifnull 3b6
      // 38c: ifeq 3aa
      // 38f: goto 396
      // 392: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 395: athrow
      // 396: aload 0
      // 397: aload 1
      // 398: aload 3
      // 399: bipush 3
      // 39a: bipush 1
      // 39b: bipush 0
      // 39c: bipush 4
      // 39d: bipush 2
      // 39e: bipush 0
      // 39f: bipush 0
      // 3a0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 3a3: goto 3aa
      // 3a6: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 3a9: athrow
      // 3aa: aload 6
      // 3ac: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 3af: getstatic vt2.zk4 Lvt2;
      // 3b2: invokevirtual vt2.c3s ()I
      // 3b5: baload
      // 3b6: aload 4
      // 3b8: ifnull 3e7
      // 3bb: ifeq 3db
      // 3be: goto 3c5
      // 3c1: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 3c4: athrow
      // 3c5: aload 0
      // 3c6: aload 1
      // 3c7: aload 3
      // 3c8: bipush 7
      // 3ca: bipush 1
      // 3cb: bipush 3
      // 3cc: bipush 7
      // 3ce: bipush 2
      // 3cf: bipush 4
      // 3d0: bipush 0
      // 3d1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 3d4: goto 3db
      // 3d7: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 3da: athrow
      // 3db: aload 6
      // 3dd: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 3e0: getstatic vt2.te4 Lvt2;
      // 3e3: invokevirtual vt2.c3s ()I
      // 3e6: baload
      // 3e7: aload 4
      // 3e9: ifnull 416
      // 3ec: ifeq 40a
      // 3ef: goto 3f6
      // 3f2: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 3f5: athrow
      // 3f6: aload 0
      // 3f7: aload 1
      // 3f8: aload 3
      // 3f9: bipush 0
      // 3fa: bipush 1
      // 3fb: bipush 3
      // 3fc: bipush 0
      // 3fd: bipush 2
      // 3fe: bipush 4
      // 3ff: bipush 0
      // 400: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 403: goto 40a
      // 406: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 409: athrow
      // 40a: aload 5
      // 40c: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 40f: getstatic vt2.z9q Lvt2;
      // 412: invokevirtual vt2.c3s ()I
      // 415: baload
      // 416: aload 4
      // 418: ifnull 447
      // 41b: ifeq 43b
      // 41e: goto 425
      // 421: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 424: athrow
      // 425: aload 0
      // 426: aload 1
      // 427: aload 3
      // 428: bipush 3
      // 429: bipush 1
      // 42a: bipush 15
      // 42c: bipush 4
      // 42d: bipush 2
      // 42e: bipush 15
      // 430: bipush 0
      // 431: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 434: goto 43b
      // 437: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 43a: athrow
      // 43b: aload 5
      // 43d: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 440: getstatic vt2.te4 Lvt2;
      // 443: invokevirtual vt2.c3s ()I
      // 446: baload
      // 447: aload 4
      // 449: ifnull 478
      // 44c: ifeq 46c
      // 44f: goto 456
      // 452: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 455: athrow
      // 456: aload 0
      // 457: aload 1
      // 458: aload 3
      // 459: bipush 0
      // 45a: bipush 1
      // 45b: bipush 11
      // 45d: bipush 0
      // 45e: bipush 2
      // 45f: bipush 12
      // 461: bipush 0
      // 462: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 465: goto 46c
      // 468: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 46b: athrow
      // 46c: aload 5
      // 46e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 471: getstatic vt2.zk4 Lvt2;
      // 474: invokevirtual vt2.c3s ()I
      // 477: baload
      // 478: aload 4
      // 47a: ifnull 4a0
      // 47d: ifeq 49f
      // 480: goto 487
      // 483: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 486: athrow
      // 487: aload 0
      // 488: aload 1
      // 489: aload 3
      // 48a: bipush 7
      // 48c: bipush 1
      // 48d: bipush 11
      // 48f: bipush 7
      // 491: bipush 2
      // 492: bipush 12
      // 494: bipush 0
      // 495: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 498: goto 49f
      // 49b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleZRoom.a (Loov;)Loov;
      // 49e: athrow
      // 49f: bipush 1
      // 4a0: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
