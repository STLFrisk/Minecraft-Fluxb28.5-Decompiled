package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureVillagePieces$Hall extends StructureVillagePieces$Village {
   public StructureVillagePieces$Hall() {
   }

   public StructureVillagePieces$Hall(StructureVillagePieces$Start var1, int var2, Random var3, yve var4, vt2 var5) {
      super(var1, var2);
      this.p7m = var5;
      this.yqm = var4;
   }

   public static StructureVillagePieces$Hall e_i(
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
      // 0c: bipush 11
      // 0e: aload 6
      // 10: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 13: astore 8
      // 15: aload 8
      // 17: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.r60 (Lyve;)Z
      // 1a: ifeq 43
      // 1d: aload 1
      // 1e: aload 8
      // 20: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 23: ifnonnull 43
      // 26: goto 2d
      // 29: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.a (Loov;)Loov;
      // 2c: athrow
      // 2d: new net/minecraft/world/gen/structure/StructureVillagePieces$Hall
      // 30: dup
      // 31: aload 0
      // 32: iload 7
      // 34: aload 2
      // 35: aload 8
      // 37: aload 6
      // 39: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$Hall.<init> (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lyve;Lvt2;)V
      // 3c: goto 44
      // 3f: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.a (Loov;)Loov;
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
      // 006: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Hall.e_j I
      // 009: aload 4
      // 00b: ifnull 25d
      // 00e: ifge 05c
      // 011: goto 018
      // 014: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 3
      // 01c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.rh3 (Lt9d;Lyve;)I
      // 01f: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Hall.e_j I
      // 022: aload 0
      // 023: aload 4
      // 025: ifnull 043
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.a (Loov;)Loov;
      // 02e: athrow
      // 02f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Hall.e_j I
      // 032: ifge 042
      // 035: goto 03c
      // 038: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.a (Loov;)Loov;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: ireturn
      // 03e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Hall.yqm Lyve;
      // 046: bipush 0
      // 047: aload 0
      // 048: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Hall.e_j I
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Hall.yqm Lyve;
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
      // 073: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
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
      // 08f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 092: aload 0
      // 093: aload 1
      // 094: aload 3
      // 095: bipush 2
      // 096: bipush 0
      // 097: bipush 6
      // 099: bipush 8
      // 09b: bipush 0
      // 09c: bipush 10
      // 09e: getstatic ox_.kqk Le0x;
      // 0a1: invokevirtual e0x.l4i ()Lzfz;
      // 0a4: getstatic ox_.kqk Le0x;
      // 0a7: invokevirtual e0x.l4i ()Lzfz;
      // 0aa: bipush 0
      // 0ab: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0ae: aload 0
      // 0af: aload 1
      // 0b0: getstatic ox_.a3_ Le0x;
      // 0b3: invokevirtual e0x.l4i ()Lzfz;
      // 0b6: bipush 6
      // 0b8: bipush 0
      // 0b9: bipush 6
      // 0bb: aload 3
      // 0bc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0bf: aload 0
      // 0c0: aload 1
      // 0c1: aload 3
      // 0c2: bipush 2
      // 0c3: bipush 1
      // 0c4: bipush 6
      // 0c6: bipush 2
      // 0c7: bipush 1
      // 0c8: bipush 10
      // 0ca: getstatic ox_.j5b Le0x;
      // 0cd: invokevirtual e0x.l4i ()Lzfz;
      // 0d0: getstatic ox_.j5b Le0x;
      // 0d3: invokevirtual e0x.l4i ()Lzfz;
      // 0d6: bipush 0
      // 0d7: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0da: aload 0
      // 0db: aload 1
      // 0dc: aload 3
      // 0dd: bipush 8
      // 0df: bipush 1
      // 0e0: bipush 6
      // 0e2: bipush 8
      // 0e4: bipush 1
      // 0e5: bipush 10
      // 0e7: getstatic ox_.j5b Le0x;
      // 0ea: invokevirtual e0x.l4i ()Lzfz;
      // 0ed: getstatic ox_.j5b Le0x;
      // 0f0: invokevirtual e0x.l4i ()Lzfz;
      // 0f3: bipush 0
      // 0f4: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0f7: aload 0
      // 0f8: aload 1
      // 0f9: aload 3
      // 0fa: bipush 3
      // 0fb: bipush 1
      // 0fc: bipush 10
      // 0fe: bipush 7
      // 100: bipush 1
      // 101: bipush 10
      // 103: getstatic ox_.j5b Le0x;
      // 106: invokevirtual e0x.l4i ()Lzfz;
      // 109: getstatic ox_.j5b Le0x;
      // 10c: invokevirtual e0x.l4i ()Lzfz;
      // 10f: bipush 0
      // 110: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 113: aload 0
      // 114: aload 1
      // 115: aload 3
      // 116: bipush 1
      // 117: bipush 0
      // 118: bipush 1
      // 119: bipush 7
      // 11b: bipush 0
      // 11c: bipush 4
      // 11d: getstatic ox_.wb7 Le0x;
      // 120: invokevirtual e0x.l4i ()Lzfz;
      // 123: getstatic ox_.wb7 Le0x;
      // 126: invokevirtual e0x.l4i ()Lzfz;
      // 129: bipush 0
      // 12a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 12d: aload 0
      // 12e: aload 1
      // 12f: aload 3
      // 130: bipush 0
      // 131: bipush 0
      // 132: bipush 0
      // 133: bipush 0
      // 134: bipush 3
      // 135: bipush 5
      // 136: getstatic ox_.a3_ Le0x;
      // 139: invokevirtual e0x.l4i ()Lzfz;
      // 13c: getstatic ox_.a3_ Le0x;
      // 13f: invokevirtual e0x.l4i ()Lzfz;
      // 142: bipush 0
      // 143: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 146: aload 0
      // 147: aload 1
      // 148: aload 3
      // 149: bipush 8
      // 14b: bipush 0
      // 14c: bipush 0
      // 14d: bipush 8
      // 14f: bipush 3
      // 150: bipush 5
      // 151: getstatic ox_.a3_ Le0x;
      // 154: invokevirtual e0x.l4i ()Lzfz;
      // 157: getstatic ox_.a3_ Le0x;
      // 15a: invokevirtual e0x.l4i ()Lzfz;
      // 15d: bipush 0
      // 15e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 161: aload 0
      // 162: aload 1
      // 163: aload 3
      // 164: bipush 1
      // 165: bipush 0
      // 166: bipush 0
      // 167: bipush 7
      // 169: bipush 1
      // 16a: bipush 0
      // 16b: getstatic ox_.a3_ Le0x;
      // 16e: invokevirtual e0x.l4i ()Lzfz;
      // 171: getstatic ox_.a3_ Le0x;
      // 174: invokevirtual e0x.l4i ()Lzfz;
      // 177: bipush 0
      // 178: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 17b: aload 0
      // 17c: aload 1
      // 17d: aload 3
      // 17e: bipush 1
      // 17f: bipush 0
      // 180: bipush 5
      // 181: bipush 7
      // 183: bipush 1
      // 184: bipush 5
      // 185: getstatic ox_.a3_ Le0x;
      // 188: invokevirtual e0x.l4i ()Lzfz;
      // 18b: getstatic ox_.a3_ Le0x;
      // 18e: invokevirtual e0x.l4i ()Lzfz;
      // 191: bipush 0
      // 192: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 195: aload 0
      // 196: aload 1
      // 197: aload 3
      // 198: bipush 1
      // 199: bipush 2
      // 19a: bipush 0
      // 19b: bipush 7
      // 19d: bipush 3
      // 19e: bipush 0
      // 19f: getstatic ox_.wb7 Le0x;
      // 1a2: invokevirtual e0x.l4i ()Lzfz;
      // 1a5: getstatic ox_.wb7 Le0x;
      // 1a8: invokevirtual e0x.l4i ()Lzfz;
      // 1ab: bipush 0
      // 1ac: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1af: aload 0
      // 1b0: aload 1
      // 1b1: aload 3
      // 1b2: bipush 1
      // 1b3: bipush 2
      // 1b4: bipush 5
      // 1b5: bipush 7
      // 1b7: bipush 3
      // 1b8: bipush 5
      // 1b9: getstatic ox_.wb7 Le0x;
      // 1bc: invokevirtual e0x.l4i ()Lzfz;
      // 1bf: getstatic ox_.wb7 Le0x;
      // 1c2: invokevirtual e0x.l4i ()Lzfz;
      // 1c5: bipush 0
      // 1c6: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1c9: aload 0
      // 1ca: aload 1
      // 1cb: aload 3
      // 1cc: bipush 0
      // 1cd: bipush 4
      // 1ce: bipush 1
      // 1cf: bipush 8
      // 1d1: bipush 4
      // 1d2: bipush 1
      // 1d3: getstatic ox_.wb7 Le0x;
      // 1d6: invokevirtual e0x.l4i ()Lzfz;
      // 1d9: getstatic ox_.wb7 Le0x;
      // 1dc: invokevirtual e0x.l4i ()Lzfz;
      // 1df: bipush 0
      // 1e0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1e3: aload 0
      // 1e4: aload 1
      // 1e5: aload 3
      // 1e6: bipush 0
      // 1e7: bipush 4
      // 1e8: bipush 4
      // 1e9: bipush 8
      // 1eb: bipush 4
      // 1ec: bipush 4
      // 1ed: getstatic ox_.wb7 Le0x;
      // 1f0: invokevirtual e0x.l4i ()Lzfz;
      // 1f3: getstatic ox_.wb7 Le0x;
      // 1f6: invokevirtual e0x.l4i ()Lzfz;
      // 1f9: bipush 0
      // 1fa: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1fd: aload 0
      // 1fe: aload 1
      // 1ff: aload 3
      // 200: bipush 0
      // 201: bipush 5
      // 202: bipush 2
      // 203: bipush 8
      // 205: bipush 5
      // 206: bipush 3
      // 207: getstatic ox_.wb7 Le0x;
      // 20a: invokevirtual e0x.l4i ()Lzfz;
      // 20d: getstatic ox_.wb7 Le0x;
      // 210: invokevirtual e0x.l4i ()Lzfz;
      // 213: bipush 0
      // 214: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 217: aload 0
      // 218: aload 1
      // 219: getstatic ox_.wb7 Le0x;
      // 21c: invokevirtual e0x.l4i ()Lzfz;
      // 21f: bipush 0
      // 220: bipush 4
      // 221: bipush 2
      // 222: aload 3
      // 223: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 226: aload 0
      // 227: aload 1
      // 228: getstatic ox_.wb7 Le0x;
      // 22b: invokevirtual e0x.l4i ()Lzfz;
      // 22e: bipush 0
      // 22f: bipush 4
      // 230: bipush 3
      // 231: aload 3
      // 232: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 235: aload 0
      // 236: aload 1
      // 237: getstatic ox_.wb7 Le0x;
      // 23a: invokevirtual e0x.l4i ()Lzfz;
      // 23d: bipush 8
      // 23f: bipush 4
      // 240: bipush 2
      // 241: aload 3
      // 242: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 245: aload 0
      // 246: aload 1
      // 247: getstatic ox_.wb7 Le0x;
      // 24a: invokevirtual e0x.l4i ()Lzfz;
      // 24d: bipush 8
      // 24f: bipush 4
      // 250: bipush 3
      // 251: aload 3
      // 252: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 255: aload 0
      // 256: getstatic ox_.olk Le0x;
      // 259: bipush 3
      // 25a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.ujv (Le0x;I)I
      // 25d: istore 5
      // 25f: aload 0
      // 260: getstatic ox_.olk Le0x;
      // 263: bipush 2
      // 264: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.ujv (Le0x;I)I
      // 267: istore 6
      // 269: bipush -1
      // 26a: istore 7
      // 26c: iload 7
      // 26e: bipush 2
      // 26f: if_icmpgt 2cb
      // 272: bipush 0
      // 273: aload 4
      // 275: ifnull 528
      // 278: istore 8
      // 27a: iload 8
      // 27c: bipush 8
      // 27e: if_icmpgt 2c3
      // 281: aload 0
      // 282: aload 1
      // 283: getstatic ox_.olk Le0x;
      // 286: iload 5
      // 288: invokevirtual e0x.kig (I)Lzfz;
      // 28b: iload 8
      // 28d: bipush 4
      // 28e: iload 7
      // 290: iadd
      // 291: iload 7
      // 293: aload 3
      // 294: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 297: aload 0
      // 298: aload 1
      // 299: getstatic ox_.olk Le0x;
      // 29c: iload 6
      // 29e: invokevirtual e0x.kig (I)Lzfz;
      // 2a1: iload 8
      // 2a3: bipush 4
      // 2a4: iload 7
      // 2a6: iadd
      // 2a7: bipush 5
      // 2a8: iload 7
      // 2aa: isub
      // 2ab: aload 3
      // 2ac: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2af: iinc 8 1
      // 2b2: aload 4
      // 2b4: ifnull 2c6
      // 2b7: aload 4
      // 2b9: ifnonnull 27a
      // 2bc: goto 2c3
      // 2bf: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.a (Loov;)Loov;
      // 2c2: athrow
      // 2c3: iinc 7 1
      // 2c6: aload 4
      // 2c8: ifnonnull 26c
      // 2cb: aload 0
      // 2cc: aload 1
      // 2cd: getstatic ox_.uom Le0x;
      // 2d0: invokevirtual e0x.l4i ()Lzfz;
      // 2d3: bipush 0
      // 2d4: bipush 2
      // 2d5: bipush 1
      // 2d6: aload 3
      // 2d7: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2da: aload 0
      // 2db: aload 1
      // 2dc: getstatic ox_.uom Le0x;
      // 2df: invokevirtual e0x.l4i ()Lzfz;
      // 2e2: bipush 0
      // 2e3: bipush 2
      // 2e4: bipush 4
      // 2e5: aload 3
      // 2e6: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2e9: aload 0
      // 2ea: aload 1
      // 2eb: getstatic ox_.uom Le0x;
      // 2ee: invokevirtual e0x.l4i ()Lzfz;
      // 2f1: bipush 8
      // 2f3: bipush 2
      // 2f4: bipush 1
      // 2f5: aload 3
      // 2f6: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2f9: aload 0
      // 2fa: aload 1
      // 2fb: getstatic ox_.uom Le0x;
      // 2fe: invokevirtual e0x.l4i ()Lzfz;
      // 301: bipush 8
      // 303: bipush 2
      // 304: bipush 4
      // 305: aload 3
      // 306: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 309: aload 0
      // 30a: aload 1
      // 30b: getstatic ox_.g6c Le0x;
      // 30e: invokevirtual e0x.l4i ()Lzfz;
      // 311: bipush 0
      // 312: bipush 2
      // 313: bipush 2
      // 314: aload 3
      // 315: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 318: aload 0
      // 319: aload 1
      // 31a: getstatic ox_.g6c Le0x;
      // 31d: invokevirtual e0x.l4i ()Lzfz;
      // 320: bipush 0
      // 321: bipush 2
      // 322: bipush 3
      // 323: aload 3
      // 324: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 327: aload 0
      // 328: aload 1
      // 329: getstatic ox_.g6c Le0x;
      // 32c: invokevirtual e0x.l4i ()Lzfz;
      // 32f: bipush 8
      // 331: bipush 2
      // 332: bipush 2
      // 333: aload 3
      // 334: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 337: aload 0
      // 338: aload 1
      // 339: getstatic ox_.g6c Le0x;
      // 33c: invokevirtual e0x.l4i ()Lzfz;
      // 33f: bipush 8
      // 341: bipush 2
      // 342: bipush 3
      // 343: aload 3
      // 344: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 347: aload 0
      // 348: aload 1
      // 349: getstatic ox_.g6c Le0x;
      // 34c: invokevirtual e0x.l4i ()Lzfz;
      // 34f: bipush 2
      // 350: bipush 2
      // 351: bipush 5
      // 352: aload 3
      // 353: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 356: aload 0
      // 357: aload 1
      // 358: getstatic ox_.g6c Le0x;
      // 35b: invokevirtual e0x.l4i ()Lzfz;
      // 35e: bipush 3
      // 35f: bipush 2
      // 360: bipush 5
      // 361: aload 3
      // 362: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 365: aload 0
      // 366: aload 1
      // 367: getstatic ox_.g6c Le0x;
      // 36a: invokevirtual e0x.l4i ()Lzfz;
      // 36d: bipush 5
      // 36e: bipush 2
      // 36f: bipush 0
      // 370: aload 3
      // 371: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 374: aload 0
      // 375: aload 1
      // 376: getstatic ox_.g6c Le0x;
      // 379: invokevirtual e0x.l4i ()Lzfz;
      // 37c: bipush 6
      // 37e: bipush 2
      // 37f: bipush 5
      // 380: aload 3
      // 381: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 384: aload 0
      // 385: aload 1
      // 386: getstatic ox_.j5b Le0x;
      // 389: invokevirtual e0x.l4i ()Lzfz;
      // 38c: bipush 2
      // 38d: bipush 1
      // 38e: bipush 3
      // 38f: aload 3
      // 390: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 393: aload 0
      // 394: aload 1
      // 395: getstatic ox_.drm Le0x;
      // 398: invokevirtual e0x.l4i ()Lzfz;
      // 39b: bipush 2
      // 39c: bipush 2
      // 39d: bipush 3
      // 39e: aload 3
      // 39f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3a2: aload 0
      // 3a3: aload 1
      // 3a4: getstatic ox_.wb7 Le0x;
      // 3a7: invokevirtual e0x.l4i ()Lzfz;
      // 3aa: bipush 1
      // 3ab: bipush 1
      // 3ac: bipush 4
      // 3ad: aload 3
      // 3ae: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3b1: aload 0
      // 3b2: aload 1
      // 3b3: getstatic ox_.olk Le0x;
      // 3b6: aload 0
      // 3b7: getstatic ox_.olk Le0x;
      // 3ba: bipush 3
      // 3bb: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.ujv (Le0x;I)I
      // 3be: invokevirtual e0x.kig (I)Lzfz;
      // 3c1: bipush 2
      // 3c2: bipush 1
      // 3c3: bipush 4
      // 3c4: aload 3
      // 3c5: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3c8: aload 0
      // 3c9: aload 1
      // 3ca: getstatic ox_.olk Le0x;
      // 3cd: aload 0
      // 3ce: getstatic ox_.olk Le0x;
      // 3d1: bipush 1
      // 3d2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.ujv (Le0x;I)I
      // 3d5: invokevirtual e0x.kig (I)Lzfz;
      // 3d8: bipush 1
      // 3d9: bipush 1
      // 3da: bipush 3
      // 3db: aload 3
      // 3dc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3df: aload 0
      // 3e0: aload 1
      // 3e1: aload 3
      // 3e2: bipush 5
      // 3e3: bipush 0
      // 3e4: bipush 1
      // 3e5: bipush 7
      // 3e7: bipush 0
      // 3e8: bipush 3
      // 3e9: getstatic ox_.yvz Lizd;
      // 3ec: invokevirtual izd.l4i ()Lzfz;
      // 3ef: getstatic ox_.yvz Lizd;
      // 3f2: invokevirtual izd.l4i ()Lzfz;
      // 3f5: bipush 0
      // 3f6: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3f9: aload 0
      // 3fa: aload 1
      // 3fb: getstatic ox_.yvz Lizd;
      // 3fe: invokevirtual izd.l4i ()Lzfz;
      // 401: bipush 6
      // 403: bipush 1
      // 404: bipush 1
      // 405: aload 3
      // 406: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 409: aload 0
      // 40a: aload 1
      // 40b: getstatic ox_.yvz Lizd;
      // 40e: invokevirtual izd.l4i ()Lzfz;
      // 411: bipush 6
      // 413: bipush 1
      // 414: bipush 2
      // 415: aload 3
      // 416: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 419: aload 0
      // 41a: aload 1
      // 41b: getstatic ox_.ibw Le0x;
      // 41e: invokevirtual e0x.l4i ()Lzfz;
      // 421: bipush 2
      // 422: bipush 1
      // 423: bipush 0
      // 424: aload 3
      // 425: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 428: aload 0
      // 429: aload 1
      // 42a: getstatic ox_.ibw Le0x;
      // 42d: invokevirtual e0x.l4i ()Lzfz;
      // 430: bipush 2
      // 431: bipush 2
      // 432: bipush 0
      // 433: aload 3
      // 434: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 437: aload 0
      // 438: aload 1
      // 439: getstatic ox_.gt8 Le0x;
      // 43c: invokevirtual e0x.l4i ()Lzfz;
      // 43f: getstatic um3.go7 Lqx_;
      // 442: aload 0
      // 443: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Hall.p7m Lvt2;
      // 446: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 44b: bipush 2
      // 44c: bipush 3
      // 44d: bipush 1
      // 44e: aload 3
      // 44f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 452: aload 0
      // 453: aload 1
      // 454: aload 3
      // 455: aload 2
      // 456: bipush 2
      // 457: bipush 1
      // 458: bipush 0
      // 459: aload 0
      // 45a: getstatic ox_.o0v Le0x;
      // 45d: bipush 1
      // 45e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.ujv (Le0x;I)I
      // 461: invokestatic vt2.bm6 (I)Lvt2;
      // 464: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.us5 (Lt9d;Lyve;Ljava/util/Random;IIILvt2;)V
      // 467: aload 0
      // 468: aload 1
      // 469: aload 4
      // 46b: ifnull 513
      // 46e: bipush 2
      // 46f: bipush 0
      // 470: bipush -1
      // 471: aload 3
      // 472: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.t90 (Lt9d;IIILyve;)Lzfz;
      // 475: invokeinterface zfz.r_y ()Le0x; 1
      // 47a: invokevirtual e0x.p1r ()Lp3y;
      // 47d: getstatic p3y.cei Lp3y;
      // 480: if_acmpne 4d2
      // 483: goto 48a
      // 486: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.a (Loov;)Loov;
      // 489: athrow
      // 48a: aload 0
      // 48b: aload 1
      // 48c: aload 4
      // 48e: ifnull 513
      // 491: goto 498
      // 494: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.a (Loov;)Loov;
      // 497: athrow
      // 498: bipush 2
      // 499: bipush -1
      // 49a: bipush -1
      // 49b: aload 3
      // 49c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.t90 (Lt9d;IIILyve;)Lzfz;
      // 49f: invokeinterface zfz.r_y ()Le0x; 1
      // 4a4: invokevirtual e0x.p1r ()Lp3y;
      // 4a7: getstatic p3y.cei Lp3y;
      // 4aa: if_acmpeq 4d2
      // 4ad: goto 4b4
      // 4b0: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.a (Loov;)Loov;
      // 4b3: athrow
      // 4b4: aload 0
      // 4b5: aload 1
      // 4b6: getstatic ox_.l3f Le0x;
      // 4b9: aload 0
      // 4ba: getstatic ox_.l3f Le0x;
      // 4bd: bipush 3
      // 4be: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.ujv (Le0x;I)I
      // 4c1: invokevirtual e0x.kig (I)Lzfz;
      // 4c4: bipush 2
      // 4c5: bipush 0
      // 4c6: bipush -1
      // 4c7: aload 3
      // 4c8: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4cb: goto 4d2
      // 4ce: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.a (Loov;)Loov;
      // 4d1: athrow
      // 4d2: aload 0
      // 4d3: aload 1
      // 4d4: getstatic ox_.ibw Le0x;
      // 4d7: invokevirtual e0x.l4i ()Lzfz;
      // 4da: bipush 6
      // 4dc: bipush 1
      // 4dd: bipush 5
      // 4de: aload 3
      // 4df: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4e2: aload 0
      // 4e3: aload 1
      // 4e4: getstatic ox_.ibw Le0x;
      // 4e7: invokevirtual e0x.l4i ()Lzfz;
      // 4ea: bipush 6
      // 4ec: bipush 2
      // 4ed: bipush 5
      // 4ee: aload 3
      // 4ef: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4f2: aload 0
      // 4f3: aload 1
      // 4f4: getstatic ox_.gt8 Le0x;
      // 4f7: invokevirtual e0x.l4i ()Lzfz;
      // 4fa: getstatic um3.go7 Lqx_;
      // 4fd: aload 0
      // 4fe: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Hall.p7m Lvt2;
      // 501: invokevirtual vt2.b4b ()Lvt2;
      // 504: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 509: bipush 6
      // 50b: bipush 3
      // 50c: bipush 4
      // 50d: aload 3
      // 50e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.lzy (Lt9d;Lzfz;IIILyve;)V
      // 511: aload 0
      // 512: aload 1
      // 513: aload 3
      // 514: aload 2
      // 515: bipush 6
      // 517: bipush 1
      // 518: bipush 5
      // 519: aload 0
      // 51a: getstatic ox_.o0v Le0x;
      // 51d: bipush 1
      // 51e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.ujv (Le0x;I)I
      // 521: invokestatic vt2.bm6 (I)Lvt2;
      // 524: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.us5 (Lt9d;Lyve;Ljava/util/Random;IIILvt2;)V
      // 527: bipush 0
      // 528: istore 7
      // 52a: iload 7
      // 52c: bipush 5
      // 52d: if_icmpge 578
      // 530: bipush 0
      // 531: aload 4
      // 533: ifnull 583
      // 536: istore 8
      // 538: iload 8
      // 53a: bipush 9
      // 53c: if_icmpge 570
      // 53f: aload 0
      // 540: aload 1
      // 541: iload 8
      // 543: bipush 7
      // 545: iload 7
      // 547: aload 3
      // 548: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.epu (Lt9d;IIILyve;)V
      // 54b: aload 0
      // 54c: aload 1
      // 54d: getstatic ox_.a3_ Le0x;
      // 550: invokevirtual e0x.l4i ()Lzfz;
      // 553: iload 8
      // 555: bipush -1
      // 556: iload 7
      // 558: aload 3
      // 559: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.doc (Lt9d;Lzfz;IIILyve;)V
      // 55c: iinc 8 1
      // 55f: aload 4
      // 561: ifnull 573
      // 564: aload 4
      // 566: ifnonnull 538
      // 569: goto 570
      // 56c: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Hall.a (Loov;)Loov;
      // 56f: athrow
      // 570: iinc 7 1
      // 573: aload 4
      // 575: ifnonnull 52a
      // 578: aload 0
      // 579: aload 1
      // 57a: aload 3
      // 57b: bipush 4
      // 57c: bipush 1
      // 57d: bipush 2
      // 57e: bipush 2
      // 57f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Hall.pil (Lt9d;Lyve;IIII)V
      // 582: bipush 1
      // 583: ireturn
   }

   @Override
   public int e0x(int var1, int var2) {
      i2h[] var3 = StructureStrongholdPieces$Stronghold.b();

      try {
         if (var3 == null) {
            return var1;
         }

         if (var1 == 0) {
            return 4;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return super.e0x(var1, var2);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
