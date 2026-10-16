package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$DoubleYZRoom extends StructureOceanMonumentPieces$Piece {
   public StructureOceanMonumentPieces$DoubleYZRoom() {
   }

   public StructureOceanMonumentPieces$DoubleYZRoom(vt2 var1, StructureOceanMonumentPieces$man var2, Random var3) {
      super(1, var1, var2, 1, 2, 2);
   }

   @Override
   public boolean d__(t9d param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 004: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 007: getstatic vt2.z9q Lvt2;
      // 00a: invokevirtual vt2.c3s ()I
      // 00d: aaload
      // 00e: astore 5
      // 010: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 013: aload 0
      // 014: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 017: astore 6
      // 019: astore 4
      // 01b: aload 5
      // 01d: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 020: getstatic vt2.rf3 Lvt2;
      // 023: invokevirtual vt2.c3s ()I
      // 026: aaload
      // 027: astore 7
      // 029: aload 6
      // 02b: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 02e: getstatic vt2.rf3 Lvt2;
      // 031: invokevirtual vt2.c3s ()I
      // 034: aaload
      // 035: astore 8
      // 037: aload 0
      // 038: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 03b: aload 4
      // 03d: ifnull 08c
      // 040: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.o8f I
      // 043: bipush 25
      // 045: idiv
      // 046: ifle 080
      // 049: goto 050
      // 04c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 04f: athrow
      // 050: aload 0
      // 051: aload 1
      // 052: aload 3
      // 053: bipush 0
      // 054: bipush 8
      // 056: aload 5
      // 058: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 05b: getstatic vt2.m3r Lvt2;
      // 05e: invokevirtual vt2.c3s ()I
      // 061: baload
      // 062: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.tux (Lt9d;Lyve;IIZ)V
      // 065: aload 0
      // 066: aload 1
      // 067: aload 3
      // 068: bipush 0
      // 069: bipush 0
      // 06a: aload 6
      // 06c: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 06f: getstatic vt2.m3r Lvt2;
      // 072: invokevirtual vt2.c3s ()I
      // 075: baload
      // 076: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.tux (Lt9d;Lyve;IIZ)V
      // 079: goto 080
      // 07c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 8
      // 082: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 085: getstatic vt2.rf3 Lvt2;
      // 088: invokevirtual vt2.c3s ()I
      // 08b: aaload
      // 08c: aload 4
      // 08e: ifnull 0c1
      // 091: ifnonnull 0b5
      // 094: goto 09b
      // 097: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 0
      // 09c: aload 1
      // 09d: aload 3
      // 09e: bipush 1
      // 09f: bipush 8
      // 0a1: bipush 1
      // 0a2: bipush 6
      // 0a4: bipush 8
      // 0a6: bipush 7
      // 0a8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.v7m Lzfz;
      // 0ab: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.cm0 (Lt9d;Lyve;IIIIIILzfz;)V
      // 0ae: goto 0b5
      // 0b1: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: aload 7
      // 0b7: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 0ba: getstatic vt2.rf3 Lvt2;
      // 0bd: invokevirtual vt2.c3s ()I
      // 0c0: aaload
      // 0c1: ifnonnull 0df
      // 0c4: aload 0
      // 0c5: aload 1
      // 0c6: aload 3
      // 0c7: bipush 1
      // 0c8: bipush 8
      // 0ca: bipush 8
      // 0cc: bipush 6
      // 0ce: bipush 8
      // 0d0: bipush 14
      // 0d2: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.v7m Lzfz;
      // 0d5: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.cm0 (Lt9d;Lyve;IIIIIILzfz;)V
      // 0d8: goto 0df
      // 0db: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 0de: athrow
      // 0df: bipush 1
      // 0e0: istore 9
      // 0e2: iload 9
      // 0e4: bipush 7
      // 0e6: if_icmpgt 17b
      // 0e9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 0ec: astore 10
      // 0ee: iload 9
      // 0f0: bipush 2
      // 0f1: aload 4
      // 0f3: ifnull 182
      // 0f6: aload 4
      // 0f8: ifnull 117
      // 0fb: goto 102
      // 0fe: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 101: athrow
      // 102: if_icmpeq 11a
      // 105: goto 10c
      // 108: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 10b: athrow
      // 10c: iload 9
      // 10e: bipush 6
      // 110: goto 117
      // 113: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 116: athrow
      // 117: if_icmpne 11f
      // 11a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.v7m Lzfz;
      // 11d: astore 10
      // 11f: aload 0
      // 120: aload 1
      // 121: aload 3
      // 122: bipush 0
      // 123: iload 9
      // 125: bipush 0
      // 126: bipush 0
      // 127: iload 9
      // 129: bipush 15
      // 12b: aload 10
      // 12d: aload 10
      // 12f: bipush 0
      // 130: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 133: aload 0
      // 134: aload 1
      // 135: aload 3
      // 136: bipush 7
      // 138: iload 9
      // 13a: bipush 0
      // 13b: bipush 7
      // 13d: iload 9
      // 13f: bipush 15
      // 141: aload 10
      // 143: aload 10
      // 145: bipush 0
      // 146: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 149: aload 0
      // 14a: aload 1
      // 14b: aload 3
      // 14c: bipush 1
      // 14d: iload 9
      // 14f: bipush 0
      // 150: bipush 6
      // 152: iload 9
      // 154: bipush 0
      // 155: aload 10
      // 157: aload 10
      // 159: bipush 0
      // 15a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 15d: aload 0
      // 15e: aload 1
      // 15f: aload 3
      // 160: bipush 1
      // 161: iload 9
      // 163: bipush 15
      // 165: bipush 6
      // 167: iload 9
      // 169: bipush 15
      // 16b: aload 10
      // 16d: aload 10
      // 16f: bipush 0
      // 170: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 173: iinc 9 1
      // 176: aload 4
      // 178: ifnonnull 0e2
      // 17b: bipush 1
      // 17c: istore 9
      // 17e: iload 9
      // 180: bipush 7
      // 182: if_icmpgt 1d8
      // 185: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.cyh Lzfz;
      // 188: astore 10
      // 18a: iload 9
      // 18c: aload 4
      // 18e: ifnull 1e4
      // 191: bipush 2
      // 192: aload 4
      // 194: ifnull 1b3
      // 197: goto 19e
      // 19a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 19d: athrow
      // 19e: if_icmpeq 1b6
      // 1a1: goto 1a8
      // 1a4: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: iload 9
      // 1aa: bipush 6
      // 1ac: goto 1b3
      // 1af: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: if_icmpne 1bb
      // 1b6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.mip Lzfz;
      // 1b9: astore 10
      // 1bb: aload 0
      // 1bc: aload 1
      // 1bd: aload 3
      // 1be: bipush 3
      // 1bf: iload 9
      // 1c1: bipush 7
      // 1c3: bipush 4
      // 1c4: iload 9
      // 1c6: bipush 8
      // 1c8: aload 10
      // 1ca: aload 10
      // 1cc: bipush 0
      // 1cd: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1d0: iinc 9 1
      // 1d3: aload 4
      // 1d5: ifnonnull 17e
      // 1d8: aload 6
      // 1da: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 1dd: getstatic vt2.mxp Lvt2;
      // 1e0: invokevirtual vt2.c3s ()I
      // 1e3: baload
      // 1e4: aload 4
      // 1e6: ifnull 213
      // 1e9: ifeq 207
      // 1ec: goto 1f3
      // 1ef: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 1f2: athrow
      // 1f3: aload 0
      // 1f4: aload 1
      // 1f5: aload 3
      // 1f6: bipush 3
      // 1f7: bipush 1
      // 1f8: bipush 0
      // 1f9: bipush 4
      // 1fa: bipush 2
      // 1fb: bipush 0
      // 1fc: bipush 0
      // 1fd: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 200: goto 207
      // 203: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 206: athrow
      // 207: aload 6
      // 209: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 20c: getstatic vt2.zk4 Lvt2;
      // 20f: invokevirtual vt2.c3s ()I
      // 212: baload
      // 213: aload 4
      // 215: ifnull 244
      // 218: ifeq 238
      // 21b: goto 222
      // 21e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 221: athrow
      // 222: aload 0
      // 223: aload 1
      // 224: aload 3
      // 225: bipush 7
      // 227: bipush 1
      // 228: bipush 3
      // 229: bipush 7
      // 22b: bipush 2
      // 22c: bipush 4
      // 22d: bipush 0
      // 22e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 231: goto 238
      // 234: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 237: athrow
      // 238: aload 6
      // 23a: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 23d: getstatic vt2.te4 Lvt2;
      // 240: invokevirtual vt2.c3s ()I
      // 243: baload
      // 244: aload 4
      // 246: ifnull 273
      // 249: ifeq 267
      // 24c: goto 253
      // 24f: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 252: athrow
      // 253: aload 0
      // 254: aload 1
      // 255: aload 3
      // 256: bipush 0
      // 257: bipush 1
      // 258: bipush 3
      // 259: bipush 0
      // 25a: bipush 2
      // 25b: bipush 4
      // 25c: bipush 0
      // 25d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 260: goto 267
      // 263: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 266: athrow
      // 267: aload 5
      // 269: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 26c: getstatic vt2.z9q Lvt2;
      // 26f: invokevirtual vt2.c3s ()I
      // 272: baload
      // 273: aload 4
      // 275: ifnull 2a4
      // 278: ifeq 298
      // 27b: goto 282
      // 27e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 281: athrow
      // 282: aload 0
      // 283: aload 1
      // 284: aload 3
      // 285: bipush 3
      // 286: bipush 1
      // 287: bipush 15
      // 289: bipush 4
      // 28a: bipush 2
      // 28b: bipush 15
      // 28d: bipush 0
      // 28e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 291: goto 298
      // 294: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 297: athrow
      // 298: aload 5
      // 29a: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 29d: getstatic vt2.te4 Lvt2;
      // 2a0: invokevirtual vt2.c3s ()I
      // 2a3: baload
      // 2a4: aload 4
      // 2a6: ifnull 2d5
      // 2a9: ifeq 2c9
      // 2ac: goto 2b3
      // 2af: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 2b2: athrow
      // 2b3: aload 0
      // 2b4: aload 1
      // 2b5: aload 3
      // 2b6: bipush 0
      // 2b7: bipush 1
      // 2b8: bipush 11
      // 2ba: bipush 0
      // 2bb: bipush 2
      // 2bc: bipush 12
      // 2be: bipush 0
      // 2bf: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 2c2: goto 2c9
      // 2c5: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 2c8: athrow
      // 2c9: aload 5
      // 2cb: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 2ce: getstatic vt2.zk4 Lvt2;
      // 2d1: invokevirtual vt2.c3s ()I
      // 2d4: baload
      // 2d5: aload 4
      // 2d7: ifnull 308
      // 2da: ifeq 2fc
      // 2dd: goto 2e4
      // 2e0: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 2e3: athrow
      // 2e4: aload 0
      // 2e5: aload 1
      // 2e6: aload 3
      // 2e7: bipush 7
      // 2e9: bipush 1
      // 2ea: bipush 11
      // 2ec: bipush 7
      // 2ee: bipush 2
      // 2ef: bipush 12
      // 2f1: bipush 0
      // 2f2: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 2f5: goto 2fc
      // 2f8: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 2fb: athrow
      // 2fc: aload 8
      // 2fe: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 301: getstatic vt2.mxp Lvt2;
      // 304: invokevirtual vt2.c3s ()I
      // 307: baload
      // 308: aload 4
      // 30a: ifnull 338
      // 30d: ifeq 32c
      // 310: goto 317
      // 313: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 316: athrow
      // 317: aload 0
      // 318: aload 1
      // 319: aload 3
      // 31a: bipush 3
      // 31b: bipush 5
      // 31c: bipush 0
      // 31d: bipush 4
      // 31e: bipush 6
      // 320: bipush 0
      // 321: bipush 0
      // 322: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 325: goto 32c
      // 328: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 32b: athrow
      // 32c: aload 8
      // 32e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 331: getstatic vt2.zk4 Lvt2;
      // 334: invokevirtual vt2.c3s ()I
      // 337: baload
      // 338: aload 4
      // 33a: ifnull 3a8
      // 33d: ifeq 39c
      // 340: goto 347
      // 343: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 346: athrow
      // 347: aload 0
      // 348: aload 1
      // 349: aload 3
      // 34a: bipush 7
      // 34c: bipush 5
      // 34d: bipush 3
      // 34e: bipush 7
      // 350: bipush 6
      // 352: bipush 4
      // 353: bipush 0
      // 354: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 357: aload 0
      // 358: aload 1
      // 359: aload 3
      // 35a: bipush 5
      // 35b: bipush 4
      // 35c: bipush 2
      // 35d: bipush 6
      // 35f: bipush 4
      // 360: bipush 5
      // 361: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 364: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 367: bipush 0
      // 368: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 36b: aload 0
      // 36c: aload 1
      // 36d: aload 3
      // 36e: bipush 6
      // 370: bipush 1
      // 371: bipush 2
      // 372: bipush 6
      // 374: bipush 3
      // 375: bipush 2
      // 376: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 379: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 37c: bipush 0
      // 37d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 380: aload 0
      // 381: aload 1
      // 382: aload 3
      // 383: bipush 6
      // 385: bipush 1
      // 386: bipush 5
      // 387: bipush 6
      // 389: bipush 3
      // 38a: bipush 5
      // 38b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 38e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 391: bipush 0
      // 392: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 395: goto 39c
      // 398: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 39b: athrow
      // 39c: aload 8
      // 39e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 3a1: getstatic vt2.te4 Lvt2;
      // 3a4: invokevirtual vt2.c3s ()I
      // 3a7: baload
      // 3a8: aload 4
      // 3aa: ifnull 411
      // 3ad: ifeq 405
      // 3b0: goto 3b7
      // 3b3: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 3b6: athrow
      // 3b7: aload 0
      // 3b8: aload 1
      // 3b9: aload 3
      // 3ba: bipush 0
      // 3bb: bipush 5
      // 3bc: bipush 3
      // 3bd: bipush 0
      // 3be: bipush 6
      // 3c0: bipush 4
      // 3c1: bipush 0
      // 3c2: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 3c5: aload 0
      // 3c6: aload 1
      // 3c7: aload 3
      // 3c8: bipush 1
      // 3c9: bipush 4
      // 3ca: bipush 2
      // 3cb: bipush 2
      // 3cc: bipush 4
      // 3cd: bipush 5
      // 3ce: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 3d1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 3d4: bipush 0
      // 3d5: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3d8: aload 0
      // 3d9: aload 1
      // 3da: aload 3
      // 3db: bipush 1
      // 3dc: bipush 1
      // 3dd: bipush 2
      // 3de: bipush 1
      // 3df: bipush 3
      // 3e0: bipush 2
      // 3e1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 3e4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 3e7: bipush 0
      // 3e8: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3eb: aload 0
      // 3ec: aload 1
      // 3ed: aload 3
      // 3ee: bipush 1
      // 3ef: bipush 1
      // 3f0: bipush 5
      // 3f1: bipush 1
      // 3f2: bipush 3
      // 3f3: bipush 5
      // 3f4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 3f7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 3fa: bipush 0
      // 3fb: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3fe: goto 405
      // 401: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 404: athrow
      // 405: aload 7
      // 407: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 40a: getstatic vt2.z9q Lvt2;
      // 40d: invokevirtual vt2.c3s ()I
      // 410: baload
      // 411: aload 4
      // 413: ifnull 443
      // 416: ifeq 437
      // 419: goto 420
      // 41c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 41f: athrow
      // 420: aload 0
      // 421: aload 1
      // 422: aload 3
      // 423: bipush 3
      // 424: bipush 5
      // 425: bipush 15
      // 427: bipush 4
      // 428: bipush 6
      // 42a: bipush 15
      // 42c: bipush 0
      // 42d: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 430: goto 437
      // 433: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 436: athrow
      // 437: aload 7
      // 439: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 43c: getstatic vt2.te4 Lvt2;
      // 43f: invokevirtual vt2.c3s ()I
      // 442: baload
      // 443: aload 4
      // 445: ifnull 4b4
      // 448: ifeq 4a8
      // 44b: goto 452
      // 44e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 451: athrow
      // 452: aload 0
      // 453: aload 1
      // 454: aload 3
      // 455: bipush 0
      // 456: bipush 5
      // 457: bipush 11
      // 459: bipush 0
      // 45a: bipush 6
      // 45c: bipush 12
      // 45e: bipush 0
      // 45f: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 462: aload 0
      // 463: aload 1
      // 464: aload 3
      // 465: bipush 1
      // 466: bipush 4
      // 467: bipush 10
      // 469: bipush 2
      // 46a: bipush 4
      // 46b: bipush 13
      // 46d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 470: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 473: bipush 0
      // 474: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 477: aload 0
      // 478: aload 1
      // 479: aload 3
      // 47a: bipush 1
      // 47b: bipush 1
      // 47c: bipush 10
      // 47e: bipush 1
      // 47f: bipush 3
      // 480: bipush 10
      // 482: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 485: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 488: bipush 0
      // 489: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 48c: aload 0
      // 48d: aload 1
      // 48e: aload 3
      // 48f: bipush 1
      // 490: bipush 1
      // 491: bipush 13
      // 493: bipush 1
      // 494: bipush 3
      // 495: bipush 13
      // 497: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 49a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 49d: bipush 0
      // 49e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 4a1: goto 4a8
      // 4a4: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 4a7: athrow
      // 4a8: aload 7
      // 4aa: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 4ad: getstatic vt2.zk4 Lvt2;
      // 4b0: invokevirtual vt2.c3s ()I
      // 4b3: baload
      // 4b4: aload 4
      // 4b6: ifnull 521
      // 4b9: ifeq 520
      // 4bc: goto 4c3
      // 4bf: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 4c2: athrow
      // 4c3: aload 0
      // 4c4: aload 1
      // 4c5: aload 3
      // 4c6: bipush 7
      // 4c8: bipush 5
      // 4c9: bipush 11
      // 4cb: bipush 7
      // 4cd: bipush 6
      // 4cf: bipush 12
      // 4d1: bipush 0
      // 4d2: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 4d5: aload 0
      // 4d6: aload 1
      // 4d7: aload 3
      // 4d8: bipush 5
      // 4d9: bipush 4
      // 4da: bipush 10
      // 4dc: bipush 6
      // 4de: bipush 4
      // 4df: bipush 13
      // 4e1: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 4e4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 4e7: bipush 0
      // 4e8: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 4eb: aload 0
      // 4ec: aload 1
      // 4ed: aload 3
      // 4ee: bipush 6
      // 4f0: bipush 1
      // 4f1: bipush 10
      // 4f3: bipush 6
      // 4f5: bipush 3
      // 4f6: bipush 10
      // 4f8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 4fb: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 4fe: bipush 0
      // 4ff: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 502: aload 0
      // 503: aload 1
      // 504: aload 3
      // 505: bipush 6
      // 507: bipush 1
      // 508: bipush 13
      // 50a: bipush 6
      // 50c: bipush 3
      // 50d: bipush 13
      // 50f: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 512: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.lzf Lzfz;
      // 515: bipush 0
      // 516: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 519: goto 520
      // 51c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleYZRoom.a (Loov;)Loov;
      // 51f: athrow
      // 520: bipush 1
      // 521: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
