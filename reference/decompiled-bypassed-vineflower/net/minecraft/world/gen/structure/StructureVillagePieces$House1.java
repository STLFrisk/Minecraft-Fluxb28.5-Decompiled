package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureVillagePieces$House1 extends StructureVillagePieces$Village {
   public StructureVillagePieces$House1() {
   }

   public StructureVillagePieces$House1(StructureVillagePieces$Start var1, int var2, Random var3, yve var4, vt2 var5) {
      super(var1, var2);
      this.p7m = var5;
      this.yqm = var4;
   }

   public static StructureVillagePieces$House1 u7s(
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
      // 0a: bipush 9
      // 0c: bipush 6
      // 0e: aload 6
      // 10: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 13: astore 8
      // 15: aload 8
      // 17: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House1.r60 (Lyve;)Z
      // 1a: ifeq 43
      // 1d: aload 1
      // 1e: aload 8
      // 20: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 23: ifnonnull 43
      // 26: goto 2d
      // 29: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House1.a (Loov;)Loov;
      // 2c: athrow
      // 2d: new net/minecraft/world/gen/structure/StructureVillagePieces$House1
      // 30: dup
      // 31: aload 0
      // 32: iload 7
      // 34: aload 2
      // 35: aload 8
      // 37: aload 6
      // 39: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$House1.<init> (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lyve;Lvt2;)V
      // 3c: goto 44
      // 3f: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House1.a (Loov;)Loov;
      // 42: athrow
      // 43: aconst_null
      // 44: areturn
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
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House1.e_j I
      // 009: aload 4
      // 00b: ifnull 0ea
      // 00e: ifge 05c
      // 011: goto 018
      // 014: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House1.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 3
      // 01c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.rh3 (Lt9d;Lyve;)I
      // 01f: putfield net/minecraft/world/gen/structure/StructureVillagePieces$House1.e_j I
      // 022: aload 0
      // 023: aload 4
      // 025: ifnull 043
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House1.a (Loov;)Loov;
      // 02e: athrow
      // 02f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House1.e_j I
      // 032: ifge 042
      // 035: goto 03c
      // 038: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House1.a (Loov;)Loov;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: ireturn
      // 03e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House1.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House1.yqm Lyve;
      // 046: bipush 0
      // 047: aload 0
      // 048: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House1.e_j I
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House1.yqm Lyve;
      // 04f: getfield yve.ixv I
      // 052: isub
      // 053: bipush 9
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
      // 064: bipush 5
      // 065: bipush 4
      // 066: getstatic ox_.ibw Le0x;
      // 069: invokevirtual e0x.l4i ()Lzfz;
      // 06c: getstatic ox_.ibw Le0x;
      // 06f: invokevirtual e0x.l4i ()Lzfz;
      // 072: bipush 0
      // 073: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 076: aload 0
      // 077: aload 1
      // 078: aload 3
      // 079: bipush 0
      // 07a: bipush 0
      // 07b: bipush 0
      // 07c: bipush 8
      // 07e: bipush 0
      // 07f: bipush 5
      // 080: getstatic ox_.a3_ Le0x;
      // 083: invokevirtual e0x.l4i ()Lzfz;
      // 086: getstatic ox_.a3_ Le0x;
      // 089: invokevirtual e0x.l4i ()Lzfz;
      // 08c: bipush 0
      // 08d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 090: aload 0
      // 091: aload 1
      // 092: aload 3
      // 093: bipush 0
      // 094: bipush 5
      // 095: bipush 0
      // 096: bipush 8
      // 098: bipush 5
      // 099: bipush 5
      // 09a: getstatic ox_.a3_ Le0x;
      // 09d: invokevirtual e0x.l4i ()Lzfz;
      // 0a0: getstatic ox_.a3_ Le0x;
      // 0a3: invokevirtual e0x.l4i ()Lzfz;
      // 0a6: bipush 0
      // 0a7: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0aa: aload 0
      // 0ab: aload 1
      // 0ac: aload 3
      // 0ad: bipush 0
      // 0ae: bipush 6
      // 0b0: bipush 1
      // 0b1: bipush 8
      // 0b3: bipush 6
      // 0b5: bipush 4
      // 0b6: getstatic ox_.a3_ Le0x;
      // 0b9: invokevirtual e0x.l4i ()Lzfz;
      // 0bc: getstatic ox_.a3_ Le0x;
      // 0bf: invokevirtual e0x.l4i ()Lzfz;
      // 0c2: bipush 0
      // 0c3: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0c6: aload 0
      // 0c7: aload 1
      // 0c8: aload 3
      // 0c9: bipush 0
      // 0ca: bipush 7
      // 0cc: bipush 2
      // 0cd: bipush 8
      // 0cf: bipush 7
      // 0d1: bipush 3
      // 0d2: getstatic ox_.a3_ Le0x;
      // 0d5: invokevirtual e0x.l4i ()Lzfz;
      // 0d8: getstatic ox_.a3_ Le0x;
      // 0db: invokevirtual e0x.l4i ()Lzfz;
      // 0de: bipush 0
      // 0df: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e2: aload 0
      // 0e3: getstatic ox_.olk Le0x;
      // 0e6: bipush 3
      // 0e7: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.ujv (Le0x;I)I
      // 0ea: istore 5
      // 0ec: aload 0
      // 0ed: getstatic ox_.olk Le0x;
      // 0f0: bipush 2
      // 0f1: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.ujv (Le0x;I)I
      // 0f4: istore 6
      // 0f6: bipush -1
      // 0f7: istore 7
      // 0f9: iload 7
      // 0fb: bipush 2
      // 0fc: if_icmpgt 15a
      // 0ff: bipush 0
      // 100: aload 4
      // 102: ifnull 425
      // 105: istore 8
      // 107: iload 8
      // 109: bipush 8
      // 10b: if_icmpgt 152
      // 10e: aload 0
      // 10f: aload 1
      // 110: getstatic ox_.olk Le0x;
      // 113: iload 5
      // 115: invokevirtual e0x.kig (I)Lzfz;
      // 118: iload 8
      // 11a: bipush 6
      // 11c: iload 7
      // 11e: iadd
      // 11f: iload 7
      // 121: aload 3
      // 122: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 125: aload 0
      // 126: aload 1
      // 127: getstatic ox_.olk Le0x;
      // 12a: iload 6
      // 12c: invokevirtual e0x.kig (I)Lzfz;
      // 12f: iload 8
      // 131: bipush 6
      // 133: iload 7
      // 135: iadd
      // 136: bipush 5
      // 137: iload 7
      // 139: isub
      // 13a: aload 3
      // 13b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 13e: iinc 8 1
      // 141: aload 4
      // 143: ifnull 155
      // 146: aload 4
      // 148: ifnonnull 107
      // 14b: goto 152
      // 14e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House1.a (Loov;)Loov;
      // 151: athrow
      // 152: iinc 7 1
      // 155: aload 4
      // 157: ifnonnull 0f9
      // 15a: aload 0
      // 15b: aload 1
      // 15c: aload 3
      // 15d: bipush 0
      // 15e: bipush 1
      // 15f: bipush 0
      // 160: bipush 0
      // 161: bipush 1
      // 162: bipush 5
      // 163: getstatic ox_.a3_ Le0x;
      // 166: invokevirtual e0x.l4i ()Lzfz;
      // 169: getstatic ox_.a3_ Le0x;
      // 16c: invokevirtual e0x.l4i ()Lzfz;
      // 16f: bipush 0
      // 170: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 173: aload 0
      // 174: aload 1
      // 175: aload 3
      // 176: bipush 1
      // 177: bipush 1
      // 178: bipush 5
      // 179: bipush 8
      // 17b: bipush 1
      // 17c: bipush 5
      // 17d: getstatic ox_.a3_ Le0x;
      // 180: invokevirtual e0x.l4i ()Lzfz;
      // 183: getstatic ox_.a3_ Le0x;
      // 186: invokevirtual e0x.l4i ()Lzfz;
      // 189: bipush 0
      // 18a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 18d: aload 0
      // 18e: aload 1
      // 18f: aload 3
      // 190: bipush 8
      // 192: bipush 1
      // 193: bipush 0
      // 194: bipush 8
      // 196: bipush 1
      // 197: bipush 4
      // 198: getstatic ox_.a3_ Le0x;
      // 19b: invokevirtual e0x.l4i ()Lzfz;
      // 19e: getstatic ox_.a3_ Le0x;
      // 1a1: invokevirtual e0x.l4i ()Lzfz;
      // 1a4: bipush 0
      // 1a5: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1a8: aload 0
      // 1a9: aload 1
      // 1aa: aload 3
      // 1ab: bipush 2
      // 1ac: bipush 1
      // 1ad: bipush 0
      // 1ae: bipush 7
      // 1b0: bipush 1
      // 1b1: bipush 0
      // 1b2: getstatic ox_.a3_ Le0x;
      // 1b5: invokevirtual e0x.l4i ()Lzfz;
      // 1b8: getstatic ox_.a3_ Le0x;
      // 1bb: invokevirtual e0x.l4i ()Lzfz;
      // 1be: bipush 0
      // 1bf: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1c2: aload 0
      // 1c3: aload 1
      // 1c4: aload 3
      // 1c5: bipush 0
      // 1c6: bipush 2
      // 1c7: bipush 0
      // 1c8: bipush 0
      // 1c9: bipush 4
      // 1ca: bipush 0
      // 1cb: getstatic ox_.a3_ Le0x;
      // 1ce: invokevirtual e0x.l4i ()Lzfz;
      // 1d1: getstatic ox_.a3_ Le0x;
      // 1d4: invokevirtual e0x.l4i ()Lzfz;
      // 1d7: bipush 0
      // 1d8: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1db: aload 0
      // 1dc: aload 1
      // 1dd: aload 3
      // 1de: bipush 0
      // 1df: bipush 2
      // 1e0: bipush 5
      // 1e1: bipush 0
      // 1e2: bipush 4
      // 1e3: bipush 5
      // 1e4: getstatic ox_.a3_ Le0x;
      // 1e7: invokevirtual e0x.l4i ()Lzfz;
      // 1ea: getstatic ox_.a3_ Le0x;
      // 1ed: invokevirtual e0x.l4i ()Lzfz;
      // 1f0: bipush 0
      // 1f1: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1f4: aload 0
      // 1f5: aload 1
      // 1f6: aload 3
      // 1f7: bipush 8
      // 1f9: bipush 2
      // 1fa: bipush 5
      // 1fb: bipush 8
      // 1fd: bipush 4
      // 1fe: bipush 5
      // 1ff: getstatic ox_.a3_ Le0x;
      // 202: invokevirtual e0x.l4i ()Lzfz;
      // 205: getstatic ox_.a3_ Le0x;
      // 208: invokevirtual e0x.l4i ()Lzfz;
      // 20b: bipush 0
      // 20c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 20f: aload 0
      // 210: aload 1
      // 211: aload 3
      // 212: bipush 8
      // 214: bipush 2
      // 215: bipush 0
      // 216: bipush 8
      // 218: bipush 4
      // 219: bipush 0
      // 21a: getstatic ox_.a3_ Le0x;
      // 21d: invokevirtual e0x.l4i ()Lzfz;
      // 220: getstatic ox_.a3_ Le0x;
      // 223: invokevirtual e0x.l4i ()Lzfz;
      // 226: bipush 0
      // 227: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 22a: aload 0
      // 22b: aload 1
      // 22c: aload 3
      // 22d: bipush 0
      // 22e: bipush 2
      // 22f: bipush 1
      // 230: bipush 0
      // 231: bipush 4
      // 232: bipush 4
      // 233: getstatic ox_.wb7 Le0x;
      // 236: invokevirtual e0x.l4i ()Lzfz;
      // 239: getstatic ox_.wb7 Le0x;
      // 23c: invokevirtual e0x.l4i ()Lzfz;
      // 23f: bipush 0
      // 240: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 243: aload 0
      // 244: aload 1
      // 245: aload 3
      // 246: bipush 1
      // 247: bipush 2
      // 248: bipush 5
      // 249: bipush 7
      // 24b: bipush 4
      // 24c: bipush 5
      // 24d: getstatic ox_.wb7 Le0x;
      // 250: invokevirtual e0x.l4i ()Lzfz;
      // 253: getstatic ox_.wb7 Le0x;
      // 256: invokevirtual e0x.l4i ()Lzfz;
      // 259: bipush 0
      // 25a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 25d: aload 0
      // 25e: aload 1
      // 25f: aload 3
      // 260: bipush 8
      // 262: bipush 2
      // 263: bipush 1
      // 264: bipush 8
      // 266: bipush 4
      // 267: bipush 4
      // 268: getstatic ox_.wb7 Le0x;
      // 26b: invokevirtual e0x.l4i ()Lzfz;
      // 26e: getstatic ox_.wb7 Le0x;
      // 271: invokevirtual e0x.l4i ()Lzfz;
      // 274: bipush 0
      // 275: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 278: aload 0
      // 279: aload 1
      // 27a: aload 3
      // 27b: bipush 1
      // 27c: bipush 2
      // 27d: bipush 0
      // 27e: bipush 7
      // 280: bipush 4
      // 281: bipush 0
      // 282: getstatic ox_.wb7 Le0x;
      // 285: invokevirtual e0x.l4i ()Lzfz;
      // 288: getstatic ox_.wb7 Le0x;
      // 28b: invokevirtual e0x.l4i ()Lzfz;
      // 28e: bipush 0
      // 28f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 292: aload 0
      // 293: aload 1
      // 294: getstatic ox_.g6c Le0x;
      // 297: invokevirtual e0x.l4i ()Lzfz;
      // 29a: bipush 4
      // 29b: bipush 2
      // 29c: bipush 0
      // 29d: aload 3
      // 29e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2a1: aload 0
      // 2a2: aload 1
      // 2a3: getstatic ox_.g6c Le0x;
      // 2a6: invokevirtual e0x.l4i ()Lzfz;
      // 2a9: bipush 5
      // 2aa: bipush 2
      // 2ab: bipush 0
      // 2ac: aload 3
      // 2ad: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2b0: aload 0
      // 2b1: aload 1
      // 2b2: getstatic ox_.g6c Le0x;
      // 2b5: invokevirtual e0x.l4i ()Lzfz;
      // 2b8: bipush 6
      // 2ba: bipush 2
      // 2bb: bipush 0
      // 2bc: aload 3
      // 2bd: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2c0: aload 0
      // 2c1: aload 1
      // 2c2: getstatic ox_.g6c Le0x;
      // 2c5: invokevirtual e0x.l4i ()Lzfz;
      // 2c8: bipush 4
      // 2c9: bipush 3
      // 2ca: bipush 0
      // 2cb: aload 3
      // 2cc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2cf: aload 0
      // 2d0: aload 1
      // 2d1: getstatic ox_.g6c Le0x;
      // 2d4: invokevirtual e0x.l4i ()Lzfz;
      // 2d7: bipush 5
      // 2d8: bipush 3
      // 2d9: bipush 0
      // 2da: aload 3
      // 2db: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2de: aload 0
      // 2df: aload 1
      // 2e0: getstatic ox_.g6c Le0x;
      // 2e3: invokevirtual e0x.l4i ()Lzfz;
      // 2e6: bipush 6
      // 2e8: bipush 3
      // 2e9: bipush 0
      // 2ea: aload 3
      // 2eb: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2ee: aload 0
      // 2ef: aload 1
      // 2f0: getstatic ox_.g6c Le0x;
      // 2f3: invokevirtual e0x.l4i ()Lzfz;
      // 2f6: bipush 0
      // 2f7: bipush 2
      // 2f8: bipush 2
      // 2f9: aload 3
      // 2fa: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2fd: aload 0
      // 2fe: aload 1
      // 2ff: getstatic ox_.g6c Le0x;
      // 302: invokevirtual e0x.l4i ()Lzfz;
      // 305: bipush 0
      // 306: bipush 2
      // 307: bipush 3
      // 308: aload 3
      // 309: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 30c: aload 0
      // 30d: aload 1
      // 30e: getstatic ox_.g6c Le0x;
      // 311: invokevirtual e0x.l4i ()Lzfz;
      // 314: bipush 0
      // 315: bipush 3
      // 316: bipush 2
      // 317: aload 3
      // 318: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 31b: aload 0
      // 31c: aload 1
      // 31d: getstatic ox_.g6c Le0x;
      // 320: invokevirtual e0x.l4i ()Lzfz;
      // 323: bipush 0
      // 324: bipush 3
      // 325: bipush 3
      // 326: aload 3
      // 327: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 32a: aload 0
      // 32b: aload 1
      // 32c: getstatic ox_.g6c Le0x;
      // 32f: invokevirtual e0x.l4i ()Lzfz;
      // 332: bipush 8
      // 334: bipush 2
      // 335: bipush 2
      // 336: aload 3
      // 337: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 33a: aload 0
      // 33b: aload 1
      // 33c: getstatic ox_.g6c Le0x;
      // 33f: invokevirtual e0x.l4i ()Lzfz;
      // 342: bipush 8
      // 344: bipush 2
      // 345: bipush 3
      // 346: aload 3
      // 347: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 34a: aload 0
      // 34b: aload 1
      // 34c: getstatic ox_.g6c Le0x;
      // 34f: invokevirtual e0x.l4i ()Lzfz;
      // 352: bipush 8
      // 354: bipush 3
      // 355: bipush 2
      // 356: aload 3
      // 357: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 35a: aload 0
      // 35b: aload 1
      // 35c: getstatic ox_.g6c Le0x;
      // 35f: invokevirtual e0x.l4i ()Lzfz;
      // 362: bipush 8
      // 364: bipush 3
      // 365: bipush 3
      // 366: aload 3
      // 367: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 36a: aload 0
      // 36b: aload 1
      // 36c: getstatic ox_.g6c Le0x;
      // 36f: invokevirtual e0x.l4i ()Lzfz;
      // 372: bipush 2
      // 373: bipush 2
      // 374: bipush 5
      // 375: aload 3
      // 376: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 379: aload 0
      // 37a: aload 1
      // 37b: getstatic ox_.g6c Le0x;
      // 37e: invokevirtual e0x.l4i ()Lzfz;
      // 381: bipush 3
      // 382: bipush 2
      // 383: bipush 5
      // 384: aload 3
      // 385: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 388: aload 0
      // 389: aload 1
      // 38a: getstatic ox_.g6c Le0x;
      // 38d: invokevirtual e0x.l4i ()Lzfz;
      // 390: bipush 5
      // 391: bipush 2
      // 392: bipush 5
      // 393: aload 3
      // 394: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 397: aload 0
      // 398: aload 1
      // 399: getstatic ox_.g6c Le0x;
      // 39c: invokevirtual e0x.l4i ()Lzfz;
      // 39f: bipush 6
      // 3a1: bipush 2
      // 3a2: bipush 5
      // 3a3: aload 3
      // 3a4: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3a7: aload 0
      // 3a8: aload 1
      // 3a9: aload 3
      // 3aa: bipush 1
      // 3ab: bipush 4
      // 3ac: bipush 1
      // 3ad: bipush 7
      // 3af: bipush 4
      // 3b0: bipush 1
      // 3b1: getstatic ox_.wb7 Le0x;
      // 3b4: invokevirtual e0x.l4i ()Lzfz;
      // 3b7: getstatic ox_.wb7 Le0x;
      // 3ba: invokevirtual e0x.l4i ()Lzfz;
      // 3bd: bipush 0
      // 3be: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3c1: aload 0
      // 3c2: aload 1
      // 3c3: aload 3
      // 3c4: bipush 1
      // 3c5: bipush 4
      // 3c6: bipush 4
      // 3c7: bipush 7
      // 3c9: bipush 4
      // 3ca: bipush 4
      // 3cb: getstatic ox_.wb7 Le0x;
      // 3ce: invokevirtual e0x.l4i ()Lzfz;
      // 3d1: getstatic ox_.wb7 Le0x;
      // 3d4: invokevirtual e0x.l4i ()Lzfz;
      // 3d7: bipush 0
      // 3d8: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3db: aload 0
      // 3dc: aload 1
      // 3dd: aload 3
      // 3de: bipush 1
      // 3df: bipush 3
      // 3e0: bipush 4
      // 3e1: bipush 7
      // 3e3: bipush 3
      // 3e4: bipush 4
      // 3e5: getstatic ox_.kzr Le0x;
      // 3e8: invokevirtual e0x.l4i ()Lzfz;
      // 3eb: getstatic ox_.kzr Le0x;
      // 3ee: invokevirtual e0x.l4i ()Lzfz;
      // 3f1: bipush 0
      // 3f2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3f5: aload 0
      // 3f6: aload 1
      // 3f7: getstatic ox_.wb7 Le0x;
      // 3fa: invokevirtual e0x.l4i ()Lzfz;
      // 3fd: bipush 7
      // 3ff: bipush 1
      // 400: bipush 4
      // 401: aload 3
      // 402: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 405: aload 0
      // 406: aload 1
      // 407: getstatic ox_.olk Le0x;
      // 40a: aload 0
      // 40b: getstatic ox_.olk Le0x;
      // 40e: bipush 0
      // 40f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.ujv (Le0x;I)I
      // 412: invokevirtual e0x.kig (I)Lzfz;
      // 415: bipush 7
      // 417: bipush 1
      // 418: bipush 3
      // 419: aload 3
      // 41a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 41d: aload 0
      // 41e: getstatic ox_.olk Le0x;
      // 421: bipush 3
      // 422: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.ujv (Le0x;I)I
      // 425: aload 4
      // 427: ifnull 552
      // 42a: istore 7
      // 42c: aload 0
      // 42d: aload 1
      // 42e: getstatic ox_.olk Le0x;
      // 431: iload 7
      // 433: invokevirtual e0x.kig (I)Lzfz;
      // 436: bipush 6
      // 438: bipush 1
      // 439: bipush 4
      // 43a: aload 3
      // 43b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 43e: aload 0
      // 43f: aload 1
      // 440: getstatic ox_.olk Le0x;
      // 443: iload 7
      // 445: invokevirtual e0x.kig (I)Lzfz;
      // 448: bipush 5
      // 449: bipush 1
      // 44a: bipush 4
      // 44b: aload 3
      // 44c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 44f: aload 0
      // 450: aload 1
      // 451: getstatic ox_.olk Le0x;
      // 454: iload 7
      // 456: invokevirtual e0x.kig (I)Lzfz;
      // 459: bipush 4
      // 45a: bipush 1
      // 45b: bipush 4
      // 45c: aload 3
      // 45d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 460: aload 0
      // 461: aload 1
      // 462: getstatic ox_.olk Le0x;
      // 465: iload 7
      // 467: invokevirtual e0x.kig (I)Lzfz;
      // 46a: bipush 3
      // 46b: bipush 1
      // 46c: bipush 4
      // 46d: aload 3
      // 46e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 471: aload 0
      // 472: aload 1
      // 473: getstatic ox_.j5b Le0x;
      // 476: invokevirtual e0x.l4i ()Lzfz;
      // 479: bipush 6
      // 47b: bipush 1
      // 47c: bipush 3
      // 47d: aload 3
      // 47e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 481: aload 0
      // 482: aload 1
      // 483: getstatic ox_.drm Le0x;
      // 486: invokevirtual e0x.l4i ()Lzfz;
      // 489: bipush 6
      // 48b: bipush 2
      // 48c: bipush 3
      // 48d: aload 3
      // 48e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 491: aload 0
      // 492: aload 1
      // 493: getstatic ox_.j5b Le0x;
      // 496: invokevirtual e0x.l4i ()Lzfz;
      // 499: bipush 4
      // 49a: bipush 1
      // 49b: bipush 3
      // 49c: aload 3
      // 49d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4a0: aload 0
      // 4a1: aload 1
      // 4a2: getstatic ox_.drm Le0x;
      // 4a5: invokevirtual e0x.l4i ()Lzfz;
      // 4a8: bipush 4
      // 4a9: bipush 2
      // 4aa: bipush 3
      // 4ab: aload 3
      // 4ac: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4af: aload 0
      // 4b0: aload 1
      // 4b1: getstatic ox_.nxz Le0x;
      // 4b4: invokevirtual e0x.l4i ()Lzfz;
      // 4b7: bipush 7
      // 4b9: bipush 1
      // 4ba: bipush 1
      // 4bb: aload 3
      // 4bc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4bf: aload 0
      // 4c0: aload 1
      // 4c1: getstatic ox_.ibw Le0x;
      // 4c4: invokevirtual e0x.l4i ()Lzfz;
      // 4c7: bipush 1
      // 4c8: bipush 1
      // 4c9: bipush 0
      // 4ca: aload 3
      // 4cb: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4ce: aload 0
      // 4cf: aload 1
      // 4d0: getstatic ox_.ibw Le0x;
      // 4d3: invokevirtual e0x.l4i ()Lzfz;
      // 4d6: bipush 1
      // 4d7: bipush 2
      // 4d8: bipush 0
      // 4d9: aload 3
      // 4da: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4dd: aload 0
      // 4de: aload 1
      // 4df: aload 3
      // 4e0: aload 2
      // 4e1: bipush 1
      // 4e2: bipush 1
      // 4e3: bipush 0
      // 4e4: aload 0
      // 4e5: getstatic ox_.o0v Le0x;
      // 4e8: bipush 1
      // 4e9: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.ujv (Le0x;I)I
      // 4ec: invokestatic vt2.bm6 (I)Lvt2;
      // 4ef: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.us5 (Lt9d;Lyve;Ljava/util/Random;IIILvt2;)V
      // 4f2: aload 0
      // 4f3: aload 1
      // 4f4: bipush 1
      // 4f5: bipush 0
      // 4f6: bipush -1
      // 4f7: aload 3
      // 4f8: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.t90 (Lt9d;IIILyve;)Lzfz;
      // 4fb: invokeinterface zfz.r_y ()Le0x; 1
      // 500: invokevirtual e0x.p1r ()Lp3y;
      // 503: getstatic p3y.cei Lp3y;
      // 506: if_acmpne 551
      // 509: aload 0
      // 50a: aload 1
      // 50b: aload 4
      // 50d: ifnull 53c
      // 510: goto 517
      // 513: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House1.a (Loov;)Loov;
      // 516: athrow
      // 517: bipush 1
      // 518: bipush -1
      // 519: bipush -1
      // 51a: aload 3
      // 51b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.t90 (Lt9d;IIILyve;)Lzfz;
      // 51e: invokeinterface zfz.r_y ()Le0x; 1
      // 523: invokevirtual e0x.p1r ()Lp3y;
      // 526: getstatic p3y.cei Lp3y;
      // 529: if_acmpeq 551
      // 52c: goto 533
      // 52f: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House1.a (Loov;)Loov;
      // 532: athrow
      // 533: aload 0
      // 534: aload 1
      // 535: goto 53c
      // 538: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House1.a (Loov;)Loov;
      // 53b: athrow
      // 53c: getstatic ox_.l3f Le0x;
      // 53f: aload 0
      // 540: getstatic ox_.l3f Le0x;
      // 543: bipush 3
      // 544: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.ujv (Le0x;I)I
      // 547: invokevirtual e0x.kig (I)Lzfz;
      // 54a: bipush 1
      // 54b: bipush 0
      // 54c: bipush -1
      // 54d: aload 3
      // 54e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 551: bipush 0
      // 552: istore 8
      // 554: iload 8
      // 556: bipush 6
      // 558: if_icmpge 5a3
      // 55b: bipush 0
      // 55c: aload 4
      // 55e: ifnull 5ae
      // 561: istore 9
      // 563: iload 9
      // 565: bipush 9
      // 567: if_icmpge 59b
      // 56a: aload 0
      // 56b: aload 1
      // 56c: iload 9
      // 56e: bipush 9
      // 570: iload 8
      // 572: aload 3
      // 573: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.epu (Lt9d;IIILyve;)V
      // 576: aload 0
      // 577: aload 1
      // 578: getstatic ox_.a3_ Le0x;
      // 57b: invokevirtual e0x.l4i ()Lzfz;
      // 57e: iload 9
      // 580: bipush -1
      // 581: iload 8
      // 583: aload 3
      // 584: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.doc (Lt9d;Lzfz;IIILyve;)V
      // 587: iinc 9 1
      // 58a: aload 4
      // 58c: ifnull 59e
      // 58f: aload 4
      // 591: ifnonnull 563
      // 594: goto 59b
      // 597: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House1.a (Loov;)Loov;
      // 59a: athrow
      // 59b: iinc 8 1
      // 59e: aload 4
      // 5a0: ifnonnull 554
      // 5a3: aload 0
      // 5a4: aload 1
      // 5a5: aload 3
      // 5a6: bipush 2
      // 5a7: bipush 1
      // 5a8: bipush 2
      // 5a9: bipush 1
      // 5aa: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House1.pil (Lt9d;Lyve;IIII)V
      // 5ad: bipush 1
      // 5ae: ireturn
   }

   @Override
   public int e0x(int var1, int var2) {
      return 1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
