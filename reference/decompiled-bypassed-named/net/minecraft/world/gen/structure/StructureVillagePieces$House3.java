package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureVillagePieces$House3 extends StructureVillagePieces$Village {
   public StructureVillagePieces$House3() {
   }

   public StructureVillagePieces$House3(StructureVillagePieces$Start var1, int var2, Random var3, yve var4, vt2 var5) {
      super(var1, var2);
      this.p7m = var5;
      this.yqm = var4;
   }

   public static StructureVillagePieces$House3 ure(
      StructureVillagePieces$Start param0, List param1, Random param2, int param3, int param4, int param5, vt2 param6, int param7
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 3
      // 01: iload 4
      // 03: iload 5
      // 05: bipush 0
      // 06: bipush 0
      // 07: bipush 0
      // 08: bipush 9
      // 0a: bipush 7
      // 0c: bipush 12
      // 0e: aload 6
      // 10: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 13: astore 8
      // 15: aload 8
      // 17: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.r60 (Lyve;)Z
      // 1a: ifeq 43
      // 1d: aload 1
      // 1e: aload 8
      // 20: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 23: ifnonnull 43
      // 26: goto 2d
      // 29: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 2c: athrow
      // 2d: new net/minecraft/world/gen/structure/StructureVillagePieces$House3
      // 30: dup
      // 31: aload 0
      // 32: iload 7
      // 34: aload 2
      // 35: aload 8
      // 37: aload 6
      // 39: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$House3.<init> (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lyve;Lvt2;)V
      // 3c: goto 44
      // 3f: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 42: athrow
      // 43: aconst_null
      // 44: areturn
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
      // 006: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House3.e_j I
      // 009: aload 4
      // 00b: ifnull 23c
      // 00e: ifge 05c
      // 011: goto 018
      // 014: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 3
      // 01c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.rh3 (Lt9d;Lyve;)I
      // 01f: putfield net/minecraft/world/gen/structure/StructureVillagePieces$House3.e_j I
      // 022: aload 0
      // 023: aload 4
      // 025: ifnull 043
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 02e: athrow
      // 02f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House3.e_j I
      // 032: ifge 042
      // 035: goto 03c
      // 038: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: ireturn
      // 03e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House3.yqm Lyve;
      // 046: bipush 0
      // 047: aload 0
      // 048: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House3.e_j I
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House3.yqm Lyve;
      // 04f: getfield yve.ixv I
      // 052: isub
      // 053: bipush 7
      // 055: iadd
      // 056: bipush 1
      // 057: isub
      // 058: bipush 0
      // 059: invokevirtual yve.gbw (III)V
      // 05c: aload 0
      // 05d: aload 1
      // 05e: aload 3
      // 05f: bipush 1
      // 060: bipush 1
      // 061: bipush 1
      // 062: bipush 7
      // 064: bipush 4
      // 065: bipush 4
      // 066: getstatic ox_.ibw Le0x;
      // 069: invokevirtual e0x.l4i ()Lzfz;
      // 06c: getstatic ox_.ibw Le0x;
      // 06f: invokevirtual e0x.l4i ()Lzfz;
      // 072: bipush 0
      // 073: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 076: aload 0
      // 077: aload 1
      // 078: aload 3
      // 079: bipush 2
      // 07a: bipush 1
      // 07b: bipush 6
      // 07d: bipush 8
      // 07f: bipush 4
      // 080: bipush 10
      // 082: getstatic ox_.ibw Le0x;
      // 085: invokevirtual e0x.l4i ()Lzfz;
      // 088: getstatic ox_.ibw Le0x;
      // 08b: invokevirtual e0x.l4i ()Lzfz;
      // 08e: bipush 0
      // 08f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 092: aload 0
      // 093: aload 1
      // 094: aload 3
      // 095: bipush 2
      // 096: bipush 0
      // 097: bipush 5
      // 098: bipush 8
      // 09a: bipush 0
      // 09b: bipush 10
      // 09d: getstatic ox_.wb7 Le0x;
      // 0a0: invokevirtual e0x.l4i ()Lzfz;
      // 0a3: getstatic ox_.wb7 Le0x;
      // 0a6: invokevirtual e0x.l4i ()Lzfz;
      // 0a9: bipush 0
      // 0aa: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0ad: aload 0
      // 0ae: aload 1
      // 0af: aload 3
      // 0b0: bipush 1
      // 0b1: bipush 0
      // 0b2: bipush 1
      // 0b3: bipush 7
      // 0b5: bipush 0
      // 0b6: bipush 4
      // 0b7: getstatic ox_.wb7 Le0x;
      // 0ba: invokevirtual e0x.l4i ()Lzfz;
      // 0bd: getstatic ox_.wb7 Le0x;
      // 0c0: invokevirtual e0x.l4i ()Lzfz;
      // 0c3: bipush 0
      // 0c4: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0c7: aload 0
      // 0c8: aload 1
      // 0c9: aload 3
      // 0ca: bipush 0
      // 0cb: bipush 0
      // 0cc: bipush 0
      // 0cd: bipush 0
      // 0ce: bipush 3
      // 0cf: bipush 5
      // 0d0: getstatic ox_.a3_ Le0x;
      // 0d3: invokevirtual e0x.l4i ()Lzfz;
      // 0d6: getstatic ox_.a3_ Le0x;
      // 0d9: invokevirtual e0x.l4i ()Lzfz;
      // 0dc: bipush 0
      // 0dd: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e0: aload 0
      // 0e1: aload 1
      // 0e2: aload 3
      // 0e3: bipush 8
      // 0e5: bipush 0
      // 0e6: bipush 0
      // 0e7: bipush 8
      // 0e9: bipush 3
      // 0ea: bipush 10
      // 0ec: getstatic ox_.a3_ Le0x;
      // 0ef: invokevirtual e0x.l4i ()Lzfz;
      // 0f2: getstatic ox_.a3_ Le0x;
      // 0f5: invokevirtual e0x.l4i ()Lzfz;
      // 0f8: bipush 0
      // 0f9: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0fc: aload 0
      // 0fd: aload 1
      // 0fe: aload 3
      // 0ff: bipush 1
      // 100: bipush 0
      // 101: bipush 0
      // 102: bipush 7
      // 104: bipush 2
      // 105: bipush 0
      // 106: getstatic ox_.a3_ Le0x;
      // 109: invokevirtual e0x.l4i ()Lzfz;
      // 10c: getstatic ox_.a3_ Le0x;
      // 10f: invokevirtual e0x.l4i ()Lzfz;
      // 112: bipush 0
      // 113: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 116: aload 0
      // 117: aload 1
      // 118: aload 3
      // 119: bipush 1
      // 11a: bipush 0
      // 11b: bipush 5
      // 11c: bipush 2
      // 11d: bipush 1
      // 11e: bipush 5
      // 11f: getstatic ox_.a3_ Le0x;
      // 122: invokevirtual e0x.l4i ()Lzfz;
      // 125: getstatic ox_.a3_ Le0x;
      // 128: invokevirtual e0x.l4i ()Lzfz;
      // 12b: bipush 0
      // 12c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 12f: aload 0
      // 130: aload 1
      // 131: aload 3
      // 132: bipush 2
      // 133: bipush 0
      // 134: bipush 6
      // 136: bipush 2
      // 137: bipush 3
      // 138: bipush 10
      // 13a: getstatic ox_.a3_ Le0x;
      // 13d: invokevirtual e0x.l4i ()Lzfz;
      // 140: getstatic ox_.a3_ Le0x;
      // 143: invokevirtual e0x.l4i ()Lzfz;
      // 146: bipush 0
      // 147: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 14a: aload 0
      // 14b: aload 1
      // 14c: aload 3
      // 14d: bipush 3
      // 14e: bipush 0
      // 14f: bipush 10
      // 151: bipush 7
      // 153: bipush 3
      // 154: bipush 10
      // 156: getstatic ox_.a3_ Le0x;
      // 159: invokevirtual e0x.l4i ()Lzfz;
      // 15c: getstatic ox_.a3_ Le0x;
      // 15f: invokevirtual e0x.l4i ()Lzfz;
      // 162: bipush 0
      // 163: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 166: aload 0
      // 167: aload 1
      // 168: aload 3
      // 169: bipush 1
      // 16a: bipush 2
      // 16b: bipush 0
      // 16c: bipush 7
      // 16e: bipush 3
      // 16f: bipush 0
      // 170: getstatic ox_.wb7 Le0x;
      // 173: invokevirtual e0x.l4i ()Lzfz;
      // 176: getstatic ox_.wb7 Le0x;
      // 179: invokevirtual e0x.l4i ()Lzfz;
      // 17c: bipush 0
      // 17d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 180: aload 0
      // 181: aload 1
      // 182: aload 3
      // 183: bipush 1
      // 184: bipush 2
      // 185: bipush 5
      // 186: bipush 2
      // 187: bipush 3
      // 188: bipush 5
      // 189: getstatic ox_.wb7 Le0x;
      // 18c: invokevirtual e0x.l4i ()Lzfz;
      // 18f: getstatic ox_.wb7 Le0x;
      // 192: invokevirtual e0x.l4i ()Lzfz;
      // 195: bipush 0
      // 196: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 199: aload 0
      // 19a: aload 1
      // 19b: aload 3
      // 19c: bipush 0
      // 19d: bipush 4
      // 19e: bipush 1
      // 19f: bipush 8
      // 1a1: bipush 4
      // 1a2: bipush 1
      // 1a3: getstatic ox_.wb7 Le0x;
      // 1a6: invokevirtual e0x.l4i ()Lzfz;
      // 1a9: getstatic ox_.wb7 Le0x;
      // 1ac: invokevirtual e0x.l4i ()Lzfz;
      // 1af: bipush 0
      // 1b0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1b3: aload 0
      // 1b4: aload 1
      // 1b5: aload 3
      // 1b6: bipush 0
      // 1b7: bipush 4
      // 1b8: bipush 4
      // 1b9: bipush 3
      // 1ba: bipush 4
      // 1bb: bipush 4
      // 1bc: getstatic ox_.wb7 Le0x;
      // 1bf: invokevirtual e0x.l4i ()Lzfz;
      // 1c2: getstatic ox_.wb7 Le0x;
      // 1c5: invokevirtual e0x.l4i ()Lzfz;
      // 1c8: bipush 0
      // 1c9: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1cc: aload 0
      // 1cd: aload 1
      // 1ce: aload 3
      // 1cf: bipush 0
      // 1d0: bipush 5
      // 1d1: bipush 2
      // 1d2: bipush 8
      // 1d4: bipush 5
      // 1d5: bipush 3
      // 1d6: getstatic ox_.wb7 Le0x;
      // 1d9: invokevirtual e0x.l4i ()Lzfz;
      // 1dc: getstatic ox_.wb7 Le0x;
      // 1df: invokevirtual e0x.l4i ()Lzfz;
      // 1e2: bipush 0
      // 1e3: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1e6: aload 0
      // 1e7: aload 1
      // 1e8: getstatic ox_.wb7 Le0x;
      // 1eb: invokevirtual e0x.l4i ()Lzfz;
      // 1ee: bipush 0
      // 1ef: bipush 4
      // 1f0: bipush 2
      // 1f1: aload 3
      // 1f2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1f5: aload 0
      // 1f6: aload 1
      // 1f7: getstatic ox_.wb7 Le0x;
      // 1fa: invokevirtual e0x.l4i ()Lzfz;
      // 1fd: bipush 0
      // 1fe: bipush 4
      // 1ff: bipush 3
      // 200: aload 3
      // 201: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 204: aload 0
      // 205: aload 1
      // 206: getstatic ox_.wb7 Le0x;
      // 209: invokevirtual e0x.l4i ()Lzfz;
      // 20c: bipush 8
      // 20e: bipush 4
      // 20f: bipush 2
      // 210: aload 3
      // 211: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 214: aload 0
      // 215: aload 1
      // 216: getstatic ox_.wb7 Le0x;
      // 219: invokevirtual e0x.l4i ()Lzfz;
      // 21c: bipush 8
      // 21e: bipush 4
      // 21f: bipush 3
      // 220: aload 3
      // 221: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 224: aload 0
      // 225: aload 1
      // 226: getstatic ox_.wb7 Le0x;
      // 229: invokevirtual e0x.l4i ()Lzfz;
      // 22c: bipush 8
      // 22e: bipush 4
      // 22f: bipush 4
      // 230: aload 3
      // 231: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 234: aload 0
      // 235: getstatic ox_.olk Le0x;
      // 238: bipush 3
      // 239: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.ujv (Le0x;I)I
      // 23c: istore 5
      // 23e: aload 0
      // 23f: getstatic ox_.olk Le0x;
      // 242: bipush 2
      // 243: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.ujv (Le0x;I)I
      // 246: istore 6
      // 248: bipush -1
      // 249: istore 7
      // 24b: iload 7
      // 24d: bipush 2
      // 24e: if_icmpgt 33f
      // 251: bipush 0
      // 252: aload 4
      // 254: ifnull 3d2
      // 257: istore 8
      // 259: iload 8
      // 25b: bipush 8
      // 25d: if_icmpgt 337
      // 260: aload 0
      // 261: aload 1
      // 262: getstatic ox_.olk Le0x;
      // 265: iload 5
      // 267: invokevirtual e0x.kig (I)Lzfz;
      // 26a: iload 8
      // 26c: bipush 4
      // 26d: iload 7
      // 26f: iadd
      // 270: iload 7
      // 272: aload 3
      // 273: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 276: iload 7
      // 278: aload 4
      // 27a: ifnull 2af
      // 27d: bipush -1
      // 27e: aload 4
      // 280: ifnull 24e
      // 283: goto 28a
      // 286: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 289: athrow
      // 28a: if_icmpgt 2a6
      // 28d: iload 8
      // 28f: aload 4
      // 291: ifnull 2af
      // 294: goto 29b
      // 297: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 29a: athrow
      // 29b: bipush 1
      // 29c: if_icmpgt 32f
      // 29f: goto 2a6
      // 2a2: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: iload 7
      // 2a8: goto 2af
      // 2ab: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 2ae: athrow
      // 2af: aload 4
      // 2b1: ifnull 2d9
      // 2b4: ifgt 2d7
      // 2b7: goto 2be
      // 2ba: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 2bd: athrow
      // 2be: iload 8
      // 2c0: bipush 3
      // 2c1: aload 4
      // 2c3: ifnull 2da
      // 2c6: goto 2cd
      // 2c9: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 2cc: athrow
      // 2cd: if_icmpgt 32f
      // 2d0: goto 2d7
      // 2d3: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 2d6: athrow
      // 2d7: iload 7
      // 2d9: bipush 1
      // 2da: aload 4
      // 2dc: ifnull 2f3
      // 2df: if_icmpgt 310
      // 2e2: goto 2e9
      // 2e5: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 2e8: athrow
      // 2e9: iload 8
      // 2eb: bipush 4
      // 2ec: goto 2f3
      // 2ef: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 2f2: athrow
      // 2f3: aload 4
      // 2f5: ifnull 30d
      // 2f8: if_icmple 310
      // 2fb: goto 302
      // 2fe: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 301: athrow
      // 302: iload 8
      // 304: bipush 6
      // 306: goto 30d
      // 309: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 30c: athrow
      // 30d: if_icmplt 32f
      // 310: aload 0
      // 311: aload 1
      // 312: getstatic ox_.olk Le0x;
      // 315: iload 6
      // 317: invokevirtual e0x.kig (I)Lzfz;
      // 31a: iload 8
      // 31c: bipush 4
      // 31d: iload 7
      // 31f: iadd
      // 320: bipush 5
      // 321: iload 7
      // 323: isub
      // 324: aload 3
      // 325: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 328: goto 32f
      // 32b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 32e: athrow
      // 32f: iinc 8 1
      // 332: aload 4
      // 334: ifnonnull 259
      // 337: iinc 7 1
      // 33a: aload 4
      // 33c: ifnonnull 24b
      // 33f: aload 0
      // 340: aload 1
      // 341: aload 3
      // 342: bipush 3
      // 343: bipush 4
      // 344: bipush 5
      // 345: bipush 3
      // 346: bipush 4
      // 347: bipush 10
      // 349: getstatic ox_.wb7 Le0x;
      // 34c: invokevirtual e0x.l4i ()Lzfz;
      // 34f: getstatic ox_.wb7 Le0x;
      // 352: invokevirtual e0x.l4i ()Lzfz;
      // 355: bipush 0
      // 356: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 359: aload 0
      // 35a: aload 1
      // 35b: aload 3
      // 35c: bipush 7
      // 35e: bipush 4
      // 35f: bipush 2
      // 360: bipush 7
      // 362: bipush 4
      // 363: bipush 10
      // 365: getstatic ox_.wb7 Le0x;
      // 368: invokevirtual e0x.l4i ()Lzfz;
      // 36b: getstatic ox_.wb7 Le0x;
      // 36e: invokevirtual e0x.l4i ()Lzfz;
      // 371: bipush 0
      // 372: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 375: aload 0
      // 376: aload 1
      // 377: aload 3
      // 378: bipush 4
      // 379: bipush 5
      // 37a: bipush 4
      // 37b: bipush 4
      // 37c: bipush 5
      // 37d: bipush 10
      // 37f: getstatic ox_.wb7 Le0x;
      // 382: invokevirtual e0x.l4i ()Lzfz;
      // 385: getstatic ox_.wb7 Le0x;
      // 388: invokevirtual e0x.l4i ()Lzfz;
      // 38b: bipush 0
      // 38c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 38f: aload 0
      // 390: aload 1
      // 391: aload 3
      // 392: bipush 6
      // 394: bipush 5
      // 395: bipush 4
      // 396: bipush 6
      // 398: bipush 5
      // 399: bipush 10
      // 39b: getstatic ox_.wb7 Le0x;
      // 39e: invokevirtual e0x.l4i ()Lzfz;
      // 3a1: getstatic ox_.wb7 Le0x;
      // 3a4: invokevirtual e0x.l4i ()Lzfz;
      // 3a7: bipush 0
      // 3a8: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3ab: aload 0
      // 3ac: aload 1
      // 3ad: aload 3
      // 3ae: bipush 5
      // 3af: bipush 6
      // 3b1: bipush 3
      // 3b2: bipush 5
      // 3b3: bipush 6
      // 3b5: bipush 10
      // 3b7: getstatic ox_.wb7 Le0x;
      // 3ba: invokevirtual e0x.l4i ()Lzfz;
      // 3bd: getstatic ox_.wb7 Le0x;
      // 3c0: invokevirtual e0x.l4i ()Lzfz;
      // 3c3: bipush 0
      // 3c4: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3c7: aload 0
      // 3c8: getstatic ox_.olk Le0x;
      // 3cb: bipush 0
      // 3cc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.ujv (Le0x;I)I
      // 3cf: istore 7
      // 3d1: bipush 4
      // 3d2: istore 8
      // 3d4: iload 8
      // 3d6: bipush 1
      // 3d7: if_icmplt 436
      // 3da: aload 0
      // 3db: aload 1
      // 3dc: getstatic ox_.wb7 Le0x;
      // 3df: invokevirtual e0x.l4i ()Lzfz;
      // 3e2: iload 8
      // 3e4: bipush 2
      // 3e5: iload 8
      // 3e7: iadd
      // 3e8: bipush 7
      // 3ea: iload 8
      // 3ec: isub
      // 3ed: aload 3
      // 3ee: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3f1: bipush 8
      // 3f3: iload 8
      // 3f5: isub
      // 3f6: aload 4
      // 3f8: ifnull 476
      // 3fb: istore 9
      // 3fd: iload 9
      // 3ff: bipush 10
      // 401: if_icmpgt 42e
      // 404: aload 0
      // 405: aload 1
      // 406: getstatic ox_.olk Le0x;
      // 409: iload 7
      // 40b: invokevirtual e0x.kig (I)Lzfz;
      // 40e: iload 8
      // 410: bipush 2
      // 411: iload 8
      // 413: iadd
      // 414: iload 9
      // 416: aload 3
      // 417: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 41a: iinc 9 1
      // 41d: aload 4
      // 41f: ifnull 431
      // 422: aload 4
      // 424: ifnonnull 3fd
      // 427: goto 42e
      // 42a: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 42d: athrow
      // 42e: iinc 8 -1
      // 431: aload 4
      // 433: ifnonnull 3d4
      // 436: aload 0
      // 437: getstatic ox_.olk Le0x;
      // 43a: bipush 1
      // 43b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.ujv (Le0x;I)I
      // 43e: istore 8
      // 440: aload 0
      // 441: aload 1
      // 442: getstatic ox_.wb7 Le0x;
      // 445: invokevirtual e0x.l4i ()Lzfz;
      // 448: bipush 6
      // 44a: bipush 6
      // 44c: bipush 3
      // 44d: aload 3
      // 44e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 451: aload 0
      // 452: aload 1
      // 453: getstatic ox_.wb7 Le0x;
      // 456: invokevirtual e0x.l4i ()Lzfz;
      // 459: bipush 7
      // 45b: bipush 5
      // 45c: bipush 4
      // 45d: aload 3
      // 45e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 461: aload 0
      // 462: aload 1
      // 463: getstatic ox_.olk Le0x;
      // 466: iload 8
      // 468: invokevirtual e0x.kig (I)Lzfz;
      // 46b: bipush 6
      // 46d: bipush 6
      // 46f: bipush 4
      // 470: aload 3
      // 471: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 474: bipush 6
      // 476: istore 9
      // 478: iload 9
      // 47a: bipush 8
      // 47c: if_icmpgt 4c1
      // 47f: bipush 5
      // 480: aload 4
      // 482: ifnull 713
      // 485: istore 10
      // 487: iload 10
      // 489: bipush 10
      // 48b: if_icmpgt 4b9
      // 48e: aload 0
      // 48f: aload 1
      // 490: getstatic ox_.olk Le0x;
      // 493: iload 8
      // 495: invokevirtual e0x.kig (I)Lzfz;
      // 498: iload 9
      // 49a: bipush 12
      // 49c: iload 9
      // 49e: isub
      // 49f: iload 10
      // 4a1: aload 3
      // 4a2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4a5: iinc 10 1
      // 4a8: aload 4
      // 4aa: ifnull 4bc
      // 4ad: aload 4
      // 4af: ifnonnull 487
      // 4b2: goto 4b9
      // 4b5: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 4b8: athrow
      // 4b9: iinc 9 1
      // 4bc: aload 4
      // 4be: ifnonnull 478
      // 4c1: aload 0
      // 4c2: aload 1
      // 4c3: getstatic ox_.uom Le0x;
      // 4c6: invokevirtual e0x.l4i ()Lzfz;
      // 4c9: bipush 0
      // 4ca: bipush 2
      // 4cb: bipush 1
      // 4cc: aload 3
      // 4cd: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4d0: aload 0
      // 4d1: aload 1
      // 4d2: getstatic ox_.uom Le0x;
      // 4d5: invokevirtual e0x.l4i ()Lzfz;
      // 4d8: bipush 0
      // 4d9: bipush 2
      // 4da: bipush 4
      // 4db: aload 3
      // 4dc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4df: aload 0
      // 4e0: aload 1
      // 4e1: getstatic ox_.g6c Le0x;
      // 4e4: invokevirtual e0x.l4i ()Lzfz;
      // 4e7: bipush 0
      // 4e8: bipush 2
      // 4e9: bipush 2
      // 4ea: aload 3
      // 4eb: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4ee: aload 0
      // 4ef: aload 1
      // 4f0: getstatic ox_.g6c Le0x;
      // 4f3: invokevirtual e0x.l4i ()Lzfz;
      // 4f6: bipush 0
      // 4f7: bipush 2
      // 4f8: bipush 3
      // 4f9: aload 3
      // 4fa: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4fd: aload 0
      // 4fe: aload 1
      // 4ff: getstatic ox_.uom Le0x;
      // 502: invokevirtual e0x.l4i ()Lzfz;
      // 505: bipush 4
      // 506: bipush 2
      // 507: bipush 0
      // 508: aload 3
      // 509: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 50c: aload 0
      // 50d: aload 1
      // 50e: getstatic ox_.g6c Le0x;
      // 511: invokevirtual e0x.l4i ()Lzfz;
      // 514: bipush 5
      // 515: bipush 2
      // 516: bipush 0
      // 517: aload 3
      // 518: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 51b: aload 0
      // 51c: aload 1
      // 51d: getstatic ox_.uom Le0x;
      // 520: invokevirtual e0x.l4i ()Lzfz;
      // 523: bipush 6
      // 525: bipush 2
      // 526: bipush 0
      // 527: aload 3
      // 528: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 52b: aload 0
      // 52c: aload 1
      // 52d: getstatic ox_.uom Le0x;
      // 530: invokevirtual e0x.l4i ()Lzfz;
      // 533: bipush 8
      // 535: bipush 2
      // 536: bipush 1
      // 537: aload 3
      // 538: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 53b: aload 0
      // 53c: aload 1
      // 53d: getstatic ox_.g6c Le0x;
      // 540: invokevirtual e0x.l4i ()Lzfz;
      // 543: bipush 8
      // 545: bipush 2
      // 546: bipush 2
      // 547: aload 3
      // 548: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 54b: aload 0
      // 54c: aload 1
      // 54d: getstatic ox_.g6c Le0x;
      // 550: invokevirtual e0x.l4i ()Lzfz;
      // 553: bipush 8
      // 555: bipush 2
      // 556: bipush 3
      // 557: aload 3
      // 558: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 55b: aload 0
      // 55c: aload 1
      // 55d: getstatic ox_.uom Le0x;
      // 560: invokevirtual e0x.l4i ()Lzfz;
      // 563: bipush 8
      // 565: bipush 2
      // 566: bipush 4
      // 567: aload 3
      // 568: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 56b: aload 0
      // 56c: aload 1
      // 56d: getstatic ox_.wb7 Le0x;
      // 570: invokevirtual e0x.l4i ()Lzfz;
      // 573: bipush 8
      // 575: bipush 2
      // 576: bipush 5
      // 577: aload 3
      // 578: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 57b: aload 0
      // 57c: aload 1
      // 57d: getstatic ox_.uom Le0x;
      // 580: invokevirtual e0x.l4i ()Lzfz;
      // 583: bipush 8
      // 585: bipush 2
      // 586: bipush 6
      // 588: aload 3
      // 589: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 58c: aload 0
      // 58d: aload 1
      // 58e: getstatic ox_.g6c Le0x;
      // 591: invokevirtual e0x.l4i ()Lzfz;
      // 594: bipush 8
      // 596: bipush 2
      // 597: bipush 7
      // 599: aload 3
      // 59a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 59d: aload 0
      // 59e: aload 1
      // 59f: getstatic ox_.g6c Le0x;
      // 5a2: invokevirtual e0x.l4i ()Lzfz;
      // 5a5: bipush 8
      // 5a7: bipush 2
      // 5a8: bipush 8
      // 5aa: aload 3
      // 5ab: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5ae: aload 0
      // 5af: aload 1
      // 5b0: getstatic ox_.uom Le0x;
      // 5b3: invokevirtual e0x.l4i ()Lzfz;
      // 5b6: bipush 8
      // 5b8: bipush 2
      // 5b9: bipush 9
      // 5bb: aload 3
      // 5bc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5bf: aload 0
      // 5c0: aload 1
      // 5c1: getstatic ox_.uom Le0x;
      // 5c4: invokevirtual e0x.l4i ()Lzfz;
      // 5c7: bipush 2
      // 5c8: bipush 2
      // 5c9: bipush 6
      // 5cb: aload 3
      // 5cc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5cf: aload 0
      // 5d0: aload 1
      // 5d1: getstatic ox_.g6c Le0x;
      // 5d4: invokevirtual e0x.l4i ()Lzfz;
      // 5d7: bipush 2
      // 5d8: bipush 2
      // 5d9: bipush 7
      // 5db: aload 3
      // 5dc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5df: aload 0
      // 5e0: aload 1
      // 5e1: getstatic ox_.g6c Le0x;
      // 5e4: invokevirtual e0x.l4i ()Lzfz;
      // 5e7: bipush 2
      // 5e8: bipush 2
      // 5e9: bipush 8
      // 5eb: aload 3
      // 5ec: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5ef: aload 0
      // 5f0: aload 1
      // 5f1: getstatic ox_.uom Le0x;
      // 5f4: invokevirtual e0x.l4i ()Lzfz;
      // 5f7: bipush 2
      // 5f8: bipush 2
      // 5f9: bipush 9
      // 5fb: aload 3
      // 5fc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5ff: aload 0
      // 600: aload 1
      // 601: getstatic ox_.uom Le0x;
      // 604: invokevirtual e0x.l4i ()Lzfz;
      // 607: bipush 4
      // 608: bipush 4
      // 609: bipush 10
      // 60b: aload 3
      // 60c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 60f: aload 0
      // 610: aload 1
      // 611: getstatic ox_.g6c Le0x;
      // 614: invokevirtual e0x.l4i ()Lzfz;
      // 617: bipush 5
      // 618: bipush 4
      // 619: bipush 10
      // 61b: aload 3
      // 61c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 61f: aload 0
      // 620: aload 1
      // 621: getstatic ox_.uom Le0x;
      // 624: invokevirtual e0x.l4i ()Lzfz;
      // 627: bipush 6
      // 629: bipush 4
      // 62a: bipush 10
      // 62c: aload 3
      // 62d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 630: aload 0
      // 631: aload 1
      // 632: getstatic ox_.wb7 Le0x;
      // 635: invokevirtual e0x.l4i ()Lzfz;
      // 638: bipush 5
      // 639: bipush 5
      // 63a: bipush 10
      // 63c: aload 3
      // 63d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 640: aload 0
      // 641: aload 1
      // 642: getstatic ox_.ibw Le0x;
      // 645: invokevirtual e0x.l4i ()Lzfz;
      // 648: bipush 2
      // 649: bipush 1
      // 64a: bipush 0
      // 64b: aload 3
      // 64c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 64f: aload 0
      // 650: aload 1
      // 651: getstatic ox_.ibw Le0x;
      // 654: invokevirtual e0x.l4i ()Lzfz;
      // 657: bipush 2
      // 658: bipush 2
      // 659: bipush 0
      // 65a: aload 3
      // 65b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 65e: aload 0
      // 65f: aload 1
      // 660: getstatic ox_.gt8 Le0x;
      // 663: invokevirtual e0x.l4i ()Lzfz;
      // 666: getstatic um3.go7 Lqx_;
      // 669: aload 0
      // 66a: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House3.p7m Lvt2;
      // 66d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 672: bipush 2
      // 673: bipush 3
      // 674: bipush 1
      // 675: aload 3
      // 676: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 679: aload 0
      // 67a: aload 1
      // 67b: aload 3
      // 67c: aload 2
      // 67d: bipush 2
      // 67e: bipush 1
      // 67f: bipush 0
      // 680: aload 0
      // 681: getstatic ox_.o0v Le0x;
      // 684: bipush 1
      // 685: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.ujv (Le0x;I)I
      // 688: invokestatic vt2.bm6 (I)Lvt2;
      // 68b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.us5 (Lt9d;Lyve;Ljava/util/Random;IIILvt2;)V
      // 68e: aload 0
      // 68f: aload 1
      // 690: aload 3
      // 691: bipush 1
      // 692: bipush 0
      // 693: bipush -1
      // 694: bipush 3
      // 695: bipush 2
      // 696: bipush -1
      // 697: getstatic ox_.ibw Le0x;
      // 69a: invokevirtual e0x.l4i ()Lzfz;
      // 69d: getstatic ox_.ibw Le0x;
      // 6a0: invokevirtual e0x.l4i ()Lzfz;
      // 6a3: bipush 0
      // 6a4: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 6a7: aload 0
      // 6a8: aload 1
      // 6a9: bipush 2
      // 6aa: bipush 0
      // 6ab: bipush -1
      // 6ac: aload 3
      // 6ad: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.t90 (Lt9d;IIILyve;)Lzfz;
      // 6b0: invokeinterface zfz.r_y ()Le0x; 1
      // 6b5: invokevirtual e0x.p1r ()Lp3y;
      // 6b8: getstatic p3y.cei Lp3y;
      // 6bb: aload 4
      // 6bd: ifnull 6f1
      // 6c0: if_acmpne 712
      // 6c3: goto 6ca
      // 6c6: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 6c9: athrow
      // 6ca: aload 0
      // 6cb: aload 1
      // 6cc: aload 4
      // 6ce: ifnull 6fd
      // 6d1: goto 6d8
      // 6d4: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 6d7: athrow
      // 6d8: bipush 2
      // 6d9: bipush -1
      // 6da: bipush -1
      // 6db: aload 3
      // 6dc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.t90 (Lt9d;IIILyve;)Lzfz;
      // 6df: invokeinterface zfz.r_y ()Le0x; 1
      // 6e4: invokevirtual e0x.p1r ()Lp3y;
      // 6e7: getstatic p3y.cei Lp3y;
      // 6ea: goto 6f1
      // 6ed: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 6f0: athrow
      // 6f1: if_acmpeq 712
      // 6f4: aload 0
      // 6f5: aload 1
      // 6f6: goto 6fd
      // 6f9: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 6fc: athrow
      // 6fd: getstatic ox_.l3f Le0x;
      // 700: aload 0
      // 701: getstatic ox_.l3f Le0x;
      // 704: bipush 3
      // 705: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.ujv (Le0x;I)I
      // 708: invokevirtual e0x.kig (I)Lzfz;
      // 70b: bipush 2
      // 70c: bipush 0
      // 70d: bipush -1
      // 70e: aload 3
      // 70f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 712: bipush 0
      // 713: istore 9
      // 715: iload 9
      // 717: bipush 5
      // 718: if_icmpge 763
      // 71b: bipush 0
      // 71c: aload 4
      // 71e: ifnull 764
      // 721: istore 10
      // 723: iload 10
      // 725: bipush 9
      // 727: if_icmpge 75b
      // 72a: aload 0
      // 72b: aload 1
      // 72c: iload 10
      // 72e: bipush 7
      // 730: iload 9
      // 732: aload 3
      // 733: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.epu (Lt9d;IIILyve;)V
      // 736: aload 0
      // 737: aload 1
      // 738: getstatic ox_.a3_ Le0x;
      // 73b: invokevirtual e0x.l4i ()Lzfz;
      // 73e: iload 10
      // 740: bipush -1
      // 741: iload 9
      // 743: aload 3
      // 744: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.doc (Lt9d;Lzfz;IIILyve;)V
      // 747: iinc 10 1
      // 74a: aload 4
      // 74c: ifnull 75e
      // 74f: aload 4
      // 751: ifnonnull 723
      // 754: goto 75b
      // 757: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 75a: athrow
      // 75b: iinc 9 1
      // 75e: aload 4
      // 760: ifnonnull 715
      // 763: bipush 5
      // 764: istore 9
      // 766: iload 9
      // 768: bipush 11
      // 76a: if_icmpge 7b5
      // 76d: bipush 2
      // 76e: aload 4
      // 770: ifnull 7c0
      // 773: istore 10
      // 775: iload 10
      // 777: bipush 9
      // 779: if_icmpge 7ad
      // 77c: aload 0
      // 77d: aload 1
      // 77e: iload 10
      // 780: bipush 7
      // 782: iload 9
      // 784: aload 3
      // 785: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.epu (Lt9d;IIILyve;)V
      // 788: aload 0
      // 789: aload 1
      // 78a: getstatic ox_.a3_ Le0x;
      // 78d: invokevirtual e0x.l4i ()Lzfz;
      // 790: iload 10
      // 792: bipush -1
      // 793: iload 9
      // 795: aload 3
      // 796: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.doc (Lt9d;Lzfz;IIILyve;)V
      // 799: iinc 10 1
      // 79c: aload 4
      // 79e: ifnull 7b0
      // 7a1: aload 4
      // 7a3: ifnonnull 775
      // 7a6: goto 7ad
      // 7a9: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House3.a (Loov;)Loov;
      // 7ac: athrow
      // 7ad: iinc 9 1
      // 7b0: aload 4
      // 7b2: ifnonnull 766
      // 7b5: aload 0
      // 7b6: aload 1
      // 7b7: aload 3
      // 7b8: bipush 4
      // 7b9: bipush 1
      // 7ba: bipush 2
      // 7bb: bipush 2
      // 7bc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House3.pil (Lt9d;Lyve;IIII)V
      // 7bf: bipush 1
      // 7c0: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
