package net.minecraft.world.gen.structure;

import java.util.Random;

public class StructureOceanMonumentPieces$DoubleXYRoom extends StructureOceanMonumentPieces$Piece {
   public StructureOceanMonumentPieces$DoubleXYRoom() {
   }

   public StructureOceanMonumentPieces$DoubleXYRoom(vt2 var1, StructureOceanMonumentPieces$man var2, Random var3) {
      super(1, var1, var2, 2, 2, 1);
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
      // 001: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 004: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 007: getstatic vt2.zk4 Lvt2;
      // 00a: invokevirtual vt2.c3s ()I
      // 00d: aaload
      // 00e: astore 5
      // 010: aload 0
      // 011: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 014: astore 6
      // 016: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 019: aload 6
      // 01b: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 01e: getstatic vt2.rf3 Lvt2;
      // 021: invokevirtual vt2.c3s ()I
      // 024: aaload
      // 025: astore 7
      // 027: astore 4
      // 029: aload 5
      // 02b: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 02e: getstatic vt2.rf3 Lvt2;
      // 031: invokevirtual vt2.c3s ()I
      // 034: aaload
      // 035: astore 8
      // 037: aload 0
      // 038: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 03b: aload 4
      // 03d: ifnull 08c
      // 040: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.o8f I
      // 043: bipush 25
      // 045: idiv
      // 046: ifle 080
      // 049: goto 050
      // 04c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 04f: athrow
      // 050: aload 0
      // 051: aload 1
      // 052: aload 3
      // 053: bipush 8
      // 055: bipush 0
      // 056: aload 5
      // 058: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 05b: getstatic vt2.m3r Lvt2;
      // 05e: invokevirtual vt2.c3s ()I
      // 061: baload
      // 062: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.tux (Lt9d;Lyve;IIZ)V
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
      // 076: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.tux (Lt9d;Lyve;IIZ)V
      // 079: goto 080
      // 07c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 7
      // 082: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 085: getstatic vt2.rf3 Lvt2;
      // 088: invokevirtual vt2.c3s ()I
      // 08b: aaload
      // 08c: aload 4
      // 08e: ifnull 0c1
      // 091: ifnonnull 0b5
      // 094: goto 09b
      // 097: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 0
      // 09c: aload 1
      // 09d: aload 3
      // 09e: bipush 1
      // 09f: bipush 8
      // 0a1: bipush 1
      // 0a2: bipush 7
      // 0a4: bipush 8
      // 0a6: bipush 6
      // 0a8: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.v7m Lzfz;
      // 0ab: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.cm0 (Lt9d;Lyve;IIIIIILzfz;)V
      // 0ae: goto 0b5
      // 0b1: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: aload 8
      // 0b7: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 0ba: getstatic vt2.rf3 Lvt2;
      // 0bd: invokevirtual vt2.c3s ()I
      // 0c0: aaload
      // 0c1: ifnonnull 0df
      // 0c4: aload 0
      // 0c5: aload 1
      // 0c6: aload 3
      // 0c7: bipush 8
      // 0c9: bipush 8
      // 0cb: bipush 1
      // 0cc: bipush 14
      // 0ce: bipush 8
      // 0d0: bipush 6
      // 0d2: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.v7m Lzfz;
      // 0d5: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.cm0 (Lt9d;Lyve;IIIIIILzfz;)V
      // 0d8: goto 0df
      // 0db: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 0de: athrow
      // 0df: bipush 1
      // 0e0: istore 9
      // 0e2: iload 9
      // 0e4: bipush 7
      // 0e6: if_icmpgt 17b
      // 0e9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 0ec: astore 10
      // 0ee: iload 9
      // 0f0: aload 4
      // 0f2: ifnull 32a
      // 0f5: bipush 2
      // 0f6: aload 4
      // 0f8: ifnull 117
      // 0fb: goto 102
      // 0fe: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 101: athrow
      // 102: if_icmpeq 11a
      // 105: goto 10c
      // 108: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 10b: athrow
      // 10c: iload 9
      // 10e: bipush 6
      // 110: goto 117
      // 113: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 116: athrow
      // 117: if_icmpne 11f
      // 11a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.v7m Lzfz;
      // 11d: astore 10
      // 11f: aload 0
      // 120: aload 1
      // 121: aload 3
      // 122: bipush 0
      // 123: iload 9
      // 125: bipush 0
      // 126: bipush 0
      // 127: iload 9
      // 129: bipush 7
      // 12b: aload 10
      // 12d: aload 10
      // 12f: bipush 0
      // 130: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 133: aload 0
      // 134: aload 1
      // 135: aload 3
      // 136: bipush 15
      // 138: iload 9
      // 13a: bipush 0
      // 13b: bipush 15
      // 13d: iload 9
      // 13f: bipush 7
      // 141: aload 10
      // 143: aload 10
      // 145: bipush 0
      // 146: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 149: aload 0
      // 14a: aload 1
      // 14b: aload 3
      // 14c: bipush 1
      // 14d: iload 9
      // 14f: bipush 0
      // 150: bipush 15
      // 152: iload 9
      // 154: bipush 0
      // 155: aload 10
      // 157: aload 10
      // 159: bipush 0
      // 15a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 15d: aload 0
      // 15e: aload 1
      // 15f: aload 3
      // 160: bipush 1
      // 161: iload 9
      // 163: bipush 7
      // 165: bipush 14
      // 167: iload 9
      // 169: bipush 7
      // 16b: aload 10
      // 16d: aload 10
      // 16f: bipush 0
      // 170: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 173: iinc 9 1
      // 176: aload 4
      // 178: ifnonnull 0e2
      // 17b: aload 0
      // 17c: aload 1
      // 17d: aload 3
      // 17e: bipush 2
      // 17f: bipush 1
      // 180: bipush 3
      // 181: bipush 2
      // 182: bipush 7
      // 184: bipush 4
      // 185: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 188: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 18b: bipush 0
      // 18c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 18f: aload 0
      // 190: aload 1
      // 191: aload 3
      // 192: bipush 3
      // 193: bipush 1
      // 194: bipush 2
      // 195: bipush 4
      // 196: bipush 7
      // 198: bipush 2
      // 199: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 19c: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 19f: bipush 0
      // 1a0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1a3: aload 0
      // 1a4: aload 1
      // 1a5: aload 3
      // 1a6: bipush 3
      // 1a7: bipush 1
      // 1a8: bipush 5
      // 1a9: bipush 4
      // 1aa: bipush 7
      // 1ac: bipush 5
      // 1ad: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 1b0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 1b3: bipush 0
      // 1b4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1b7: aload 0
      // 1b8: aload 1
      // 1b9: aload 3
      // 1ba: bipush 13
      // 1bc: bipush 1
      // 1bd: bipush 3
      // 1be: bipush 13
      // 1c0: bipush 7
      // 1c2: bipush 4
      // 1c3: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 1c6: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 1c9: bipush 0
      // 1ca: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1cd: aload 0
      // 1ce: aload 1
      // 1cf: aload 3
      // 1d0: bipush 11
      // 1d2: bipush 1
      // 1d3: bipush 2
      // 1d4: bipush 12
      // 1d6: bipush 7
      // 1d8: bipush 2
      // 1d9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 1dc: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 1df: bipush 0
      // 1e0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1e3: aload 0
      // 1e4: aload 1
      // 1e5: aload 3
      // 1e6: bipush 11
      // 1e8: bipush 1
      // 1e9: bipush 5
      // 1ea: bipush 12
      // 1ec: bipush 7
      // 1ee: bipush 5
      // 1ef: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 1f2: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 1f5: bipush 0
      // 1f6: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1f9: aload 0
      // 1fa: aload 1
      // 1fb: aload 3
      // 1fc: bipush 5
      // 1fd: bipush 1
      // 1fe: bipush 3
      // 1ff: bipush 5
      // 200: bipush 3
      // 201: bipush 4
      // 202: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 205: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 208: bipush 0
      // 209: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 20c: aload 0
      // 20d: aload 1
      // 20e: aload 3
      // 20f: bipush 10
      // 211: bipush 1
      // 212: bipush 3
      // 213: bipush 10
      // 215: bipush 3
      // 216: bipush 4
      // 217: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 21a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 21d: bipush 0
      // 21e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 221: aload 0
      // 222: aload 1
      // 223: aload 3
      // 224: bipush 5
      // 225: bipush 7
      // 227: bipush 2
      // 228: bipush 10
      // 22a: bipush 7
      // 22c: bipush 5
      // 22d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 230: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 233: bipush 0
      // 234: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 237: aload 0
      // 238: aload 1
      // 239: aload 3
      // 23a: bipush 5
      // 23b: bipush 5
      // 23c: bipush 2
      // 23d: bipush 5
      // 23e: bipush 7
      // 240: bipush 2
      // 241: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 244: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 247: bipush 0
      // 248: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 24b: aload 0
      // 24c: aload 1
      // 24d: aload 3
      // 24e: bipush 10
      // 250: bipush 5
      // 251: bipush 2
      // 252: bipush 10
      // 254: bipush 7
      // 256: bipush 2
      // 257: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 25a: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 25d: bipush 0
      // 25e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 261: aload 0
      // 262: aload 1
      // 263: aload 3
      // 264: bipush 5
      // 265: bipush 5
      // 266: bipush 5
      // 267: bipush 5
      // 268: bipush 7
      // 26a: bipush 5
      // 26b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 26e: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 271: bipush 0
      // 272: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 275: aload 0
      // 276: aload 1
      // 277: aload 3
      // 278: bipush 10
      // 27a: bipush 5
      // 27b: bipush 5
      // 27c: bipush 10
      // 27e: bipush 7
      // 280: bipush 5
      // 281: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 284: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 287: bipush 0
      // 288: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 28b: aload 0
      // 28c: aload 1
      // 28d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 290: bipush 6
      // 292: bipush 6
      // 294: bipush 2
      // 295: aload 3
      // 296: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 299: aload 0
      // 29a: aload 1
      // 29b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 29e: bipush 9
      // 2a0: bipush 6
      // 2a2: bipush 2
      // 2a3: aload 3
      // 2a4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2a7: aload 0
      // 2a8: aload 1
      // 2a9: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 2ac: bipush 6
      // 2ae: bipush 6
      // 2b0: bipush 5
      // 2b1: aload 3
      // 2b2: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2b5: aload 0
      // 2b6: aload 1
      // 2b7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 2ba: bipush 9
      // 2bc: bipush 6
      // 2be: bipush 5
      // 2bf: aload 3
      // 2c0: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2c3: aload 0
      // 2c4: aload 1
      // 2c5: aload 3
      // 2c6: bipush 5
      // 2c7: bipush 4
      // 2c8: bipush 3
      // 2c9: bipush 6
      // 2cb: bipush 4
      // 2cc: bipush 4
      // 2cd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 2d0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 2d3: bipush 0
      // 2d4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2d7: aload 0
      // 2d8: aload 1
      // 2d9: aload 3
      // 2da: bipush 9
      // 2dc: bipush 4
      // 2dd: bipush 3
      // 2de: bipush 10
      // 2e0: bipush 4
      // 2e1: bipush 4
      // 2e2: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 2e5: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzf Lzfz;
      // 2e8: bipush 0
      // 2e9: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2ec: aload 0
      // 2ed: aload 1
      // 2ee: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.mip Lzfz;
      // 2f1: bipush 5
      // 2f2: bipush 4
      // 2f3: bipush 2
      // 2f4: aload 3
      // 2f5: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2f8: aload 0
      // 2f9: aload 1
      // 2fa: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.mip Lzfz;
      // 2fd: bipush 5
      // 2fe: bipush 4
      // 2ff: bipush 5
      // 300: aload 3
      // 301: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 304: aload 0
      // 305: aload 1
      // 306: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.mip Lzfz;
      // 309: bipush 10
      // 30b: bipush 4
      // 30c: bipush 2
      // 30d: aload 3
      // 30e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 311: aload 0
      // 312: aload 1
      // 313: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.mip Lzfz;
      // 316: bipush 10
      // 318: bipush 4
      // 319: bipush 5
      // 31a: aload 3
      // 31b: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 31e: aload 6
      // 320: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 323: getstatic vt2.mxp Lvt2;
      // 326: invokevirtual vt2.c3s ()I
      // 329: baload
      // 32a: aload 4
      // 32c: ifnull 359
      // 32f: ifeq 34d
      // 332: goto 339
      // 335: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 338: athrow
      // 339: aload 0
      // 33a: aload 1
      // 33b: aload 3
      // 33c: bipush 3
      // 33d: bipush 1
      // 33e: bipush 0
      // 33f: bipush 4
      // 340: bipush 2
      // 341: bipush 0
      // 342: bipush 0
      // 343: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 346: goto 34d
      // 349: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 34c: athrow
      // 34d: aload 6
      // 34f: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 352: getstatic vt2.z9q Lvt2;
      // 355: invokevirtual vt2.c3s ()I
      // 358: baload
      // 359: aload 4
      // 35b: ifnull 38a
      // 35e: ifeq 37e
      // 361: goto 368
      // 364: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 367: athrow
      // 368: aload 0
      // 369: aload 1
      // 36a: aload 3
      // 36b: bipush 3
      // 36c: bipush 1
      // 36d: bipush 7
      // 36f: bipush 4
      // 370: bipush 2
      // 371: bipush 7
      // 373: bipush 0
      // 374: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 377: goto 37e
      // 37a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 37d: athrow
      // 37e: aload 6
      // 380: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 383: getstatic vt2.te4 Lvt2;
      // 386: invokevirtual vt2.c3s ()I
      // 389: baload
      // 38a: aload 4
      // 38c: ifnull 3b9
      // 38f: ifeq 3ad
      // 392: goto 399
      // 395: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 398: athrow
      // 399: aload 0
      // 39a: aload 1
      // 39b: aload 3
      // 39c: bipush 0
      // 39d: bipush 1
      // 39e: bipush 3
      // 39f: bipush 0
      // 3a0: bipush 2
      // 3a1: bipush 4
      // 3a2: bipush 0
      // 3a3: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 3a6: goto 3ad
      // 3a9: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 3ac: athrow
      // 3ad: aload 5
      // 3af: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 3b2: getstatic vt2.mxp Lvt2;
      // 3b5: invokevirtual vt2.c3s ()I
      // 3b8: baload
      // 3b9: aload 4
      // 3bb: ifnull 3ea
      // 3be: ifeq 3de
      // 3c1: goto 3c8
      // 3c4: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 3c7: athrow
      // 3c8: aload 0
      // 3c9: aload 1
      // 3ca: aload 3
      // 3cb: bipush 11
      // 3cd: bipush 1
      // 3ce: bipush 0
      // 3cf: bipush 12
      // 3d1: bipush 2
      // 3d2: bipush 0
      // 3d3: bipush 0
      // 3d4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 3d7: goto 3de
      // 3da: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 3dd: athrow
      // 3de: aload 5
      // 3e0: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 3e3: getstatic vt2.z9q Lvt2;
      // 3e6: invokevirtual vt2.c3s ()I
      // 3e9: baload
      // 3ea: aload 4
      // 3ec: ifnull 41d
      // 3ef: ifeq 411
      // 3f2: goto 3f9
      // 3f5: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 3f8: athrow
      // 3f9: aload 0
      // 3fa: aload 1
      // 3fb: aload 3
      // 3fc: bipush 11
      // 3fe: bipush 1
      // 3ff: bipush 7
      // 401: bipush 12
      // 403: bipush 2
      // 404: bipush 7
      // 406: bipush 0
      // 407: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 40a: goto 411
      // 40d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 410: athrow
      // 411: aload 5
      // 413: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 416: getstatic vt2.zk4 Lvt2;
      // 419: invokevirtual vt2.c3s ()I
      // 41c: baload
      // 41d: aload 4
      // 41f: ifnull 44e
      // 422: ifeq 442
      // 425: goto 42c
      // 428: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 42b: athrow
      // 42c: aload 0
      // 42d: aload 1
      // 42e: aload 3
      // 42f: bipush 15
      // 431: bipush 1
      // 432: bipush 3
      // 433: bipush 15
      // 435: bipush 2
      // 436: bipush 4
      // 437: bipush 0
      // 438: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 43b: goto 442
      // 43e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 441: athrow
      // 442: aload 7
      // 444: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 447: getstatic vt2.mxp Lvt2;
      // 44a: invokevirtual vt2.c3s ()I
      // 44d: baload
      // 44e: aload 4
      // 450: ifnull 47e
      // 453: ifeq 472
      // 456: goto 45d
      // 459: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 45c: athrow
      // 45d: aload 0
      // 45e: aload 1
      // 45f: aload 3
      // 460: bipush 3
      // 461: bipush 5
      // 462: bipush 0
      // 463: bipush 4
      // 464: bipush 6
      // 466: bipush 0
      // 467: bipush 0
      // 468: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 46b: goto 472
      // 46e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 471: athrow
      // 472: aload 7
      // 474: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 477: getstatic vt2.z9q Lvt2;
      // 47a: invokevirtual vt2.c3s ()I
      // 47d: baload
      // 47e: aload 4
      // 480: ifnull 4b0
      // 483: ifeq 4a4
      // 486: goto 48d
      // 489: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 48c: athrow
      // 48d: aload 0
      // 48e: aload 1
      // 48f: aload 3
      // 490: bipush 3
      // 491: bipush 5
      // 492: bipush 7
      // 494: bipush 4
      // 495: bipush 6
      // 497: bipush 7
      // 499: bipush 0
      // 49a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 49d: goto 4a4
      // 4a0: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 4a3: athrow
      // 4a4: aload 7
      // 4a6: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 4a9: getstatic vt2.te4 Lvt2;
      // 4ac: invokevirtual vt2.c3s ()I
      // 4af: baload
      // 4b0: aload 4
      // 4b2: ifnull 4e0
      // 4b5: ifeq 4d4
      // 4b8: goto 4bf
      // 4bb: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 4be: athrow
      // 4bf: aload 0
      // 4c0: aload 1
      // 4c1: aload 3
      // 4c2: bipush 0
      // 4c3: bipush 5
      // 4c4: bipush 3
      // 4c5: bipush 0
      // 4c6: bipush 6
      // 4c8: bipush 4
      // 4c9: bipush 0
      // 4ca: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 4cd: goto 4d4
      // 4d0: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 4d3: athrow
      // 4d4: aload 8
      // 4d6: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 4d9: getstatic vt2.mxp Lvt2;
      // 4dc: invokevirtual vt2.c3s ()I
      // 4df: baload
      // 4e0: aload 4
      // 4e2: ifnull 512
      // 4e5: ifeq 506
      // 4e8: goto 4ef
      // 4eb: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 4ee: athrow
      // 4ef: aload 0
      // 4f0: aload 1
      // 4f1: aload 3
      // 4f2: bipush 11
      // 4f4: bipush 5
      // 4f5: bipush 0
      // 4f6: bipush 12
      // 4f8: bipush 6
      // 4fa: bipush 0
      // 4fb: bipush 0
      // 4fc: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 4ff: goto 506
      // 502: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 505: athrow
      // 506: aload 8
      // 508: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 50b: getstatic vt2.z9q Lvt2;
      // 50e: invokevirtual vt2.c3s ()I
      // 511: baload
      // 512: aload 4
      // 514: ifnull 546
      // 517: ifeq 53a
      // 51a: goto 521
      // 51d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 520: athrow
      // 521: aload 0
      // 522: aload 1
      // 523: aload 3
      // 524: bipush 11
      // 526: bipush 5
      // 527: bipush 7
      // 529: bipush 12
      // 52b: bipush 6
      // 52d: bipush 7
      // 52f: bipush 0
      // 530: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 533: goto 53a
      // 536: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 539: athrow
      // 53a: aload 8
      // 53c: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 53f: getstatic vt2.zk4 Lvt2;
      // 542: invokevirtual vt2.c3s ()I
      // 545: baload
      // 546: aload 4
      // 548: ifnull 56d
      // 54b: ifeq 56c
      // 54e: goto 555
      // 551: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 554: athrow
      // 555: aload 0
      // 556: aload 1
      // 557: aload 3
      // 558: bipush 15
      // 55a: bipush 5
      // 55b: bipush 3
      // 55c: bipush 15
      // 55e: bipush 6
      // 560: bipush 4
      // 561: bipush 0
      // 562: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.sm_ (Lt9d;Lyve;IIIIIIZ)V
      // 565: goto 56c
      // 568: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$DoubleXYRoom.a (Loov;)Loov;
      // 56b: athrow
      // 56c: bipush 1
      // 56d: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
