package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureVillagePieces$Church extends StructureVillagePieces$Village {
   public StructureVillagePieces$Church() {
   }

   public StructureVillagePieces$Church(StructureVillagePieces$Start var1, int var2, Random var3, yve var4, vt2 var5) {
      super(var1, var2);
      this.p7m = var5;
      this.yqm = var4;
   }

   public static StructureVillagePieces$Church xl4(
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
      // 08: bipush 5
      // 09: bipush 12
      // 0b: bipush 9
      // 0d: aload 6
      // 0f: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 12: astore 8
      // 14: aload 8
      // 16: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.r60 (Lyve;)Z
      // 19: ifeq 42
      // 1c: aload 1
      // 1d: aload 8
      // 1f: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 22: ifnonnull 42
      // 25: goto 2c
      // 28: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.a (Loov;)Loov;
      // 2b: athrow
      // 2c: new net/minecraft/world/gen/structure/StructureVillagePieces$Church
      // 2f: dup
      // 30: aload 0
      // 31: iload 7
      // 33: aload 2
      // 34: aload 8
      // 36: aload 6
      // 38: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$Church.<init> (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lyve;Lvt2;)V
      // 3b: goto 43
      // 3e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.a (Loov;)Loov;
      // 41: athrow
      // 42: aconst_null
      // 43: areturn
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
      // 006: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Church.e_j I
      // 009: aload 4
      // 00b: ifnull 421
      // 00e: ifge 05c
      // 011: goto 018
      // 014: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 3
      // 01c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.rh3 (Lt9d;Lyve;)I
      // 01f: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Church.e_j I
      // 022: aload 0
      // 023: aload 4
      // 025: ifnull 043
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.a (Loov;)Loov;
      // 02e: athrow
      // 02f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Church.e_j I
      // 032: ifge 042
      // 035: goto 03c
      // 038: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.a (Loov;)Loov;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: ireturn
      // 03e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Church.yqm Lyve;
      // 046: bipush 0
      // 047: aload 0
      // 048: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Church.e_j I
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Church.yqm Lyve;
      // 04f: getfield yve.ixv I
      // 052: isub
      // 053: bipush 12
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
      // 062: bipush 3
      // 063: bipush 3
      // 064: bipush 7
      // 066: getstatic ox_.ibw Le0x;
      // 069: invokevirtual e0x.l4i ()Lzfz;
      // 06c: getstatic ox_.ibw Le0x;
      // 06f: invokevirtual e0x.l4i ()Lzfz;
      // 072: bipush 0
      // 073: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 076: aload 0
      // 077: aload 1
      // 078: aload 3
      // 079: bipush 1
      // 07a: bipush 5
      // 07b: bipush 1
      // 07c: bipush 3
      // 07d: bipush 9
      // 07f: bipush 3
      // 080: getstatic ox_.ibw Le0x;
      // 083: invokevirtual e0x.l4i ()Lzfz;
      // 086: getstatic ox_.ibw Le0x;
      // 089: invokevirtual e0x.l4i ()Lzfz;
      // 08c: bipush 0
      // 08d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 090: aload 0
      // 091: aload 1
      // 092: aload 3
      // 093: bipush 1
      // 094: bipush 0
      // 095: bipush 0
      // 096: bipush 3
      // 097: bipush 0
      // 098: bipush 8
      // 09a: getstatic ox_.a3_ Le0x;
      // 09d: invokevirtual e0x.l4i ()Lzfz;
      // 0a0: getstatic ox_.a3_ Le0x;
      // 0a3: invokevirtual e0x.l4i ()Lzfz;
      // 0a6: bipush 0
      // 0a7: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0aa: aload 0
      // 0ab: aload 1
      // 0ac: aload 3
      // 0ad: bipush 1
      // 0ae: bipush 1
      // 0af: bipush 0
      // 0b0: bipush 3
      // 0b1: bipush 10
      // 0b3: bipush 0
      // 0b4: getstatic ox_.a3_ Le0x;
      // 0b7: invokevirtual e0x.l4i ()Lzfz;
      // 0ba: getstatic ox_.a3_ Le0x;
      // 0bd: invokevirtual e0x.l4i ()Lzfz;
      // 0c0: bipush 0
      // 0c1: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0c4: aload 0
      // 0c5: aload 1
      // 0c6: aload 3
      // 0c7: bipush 0
      // 0c8: bipush 1
      // 0c9: bipush 1
      // 0ca: bipush 0
      // 0cb: bipush 10
      // 0cd: bipush 3
      // 0ce: getstatic ox_.a3_ Le0x;
      // 0d1: invokevirtual e0x.l4i ()Lzfz;
      // 0d4: getstatic ox_.a3_ Le0x;
      // 0d7: invokevirtual e0x.l4i ()Lzfz;
      // 0da: bipush 0
      // 0db: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0de: aload 0
      // 0df: aload 1
      // 0e0: aload 3
      // 0e1: bipush 4
      // 0e2: bipush 1
      // 0e3: bipush 1
      // 0e4: bipush 4
      // 0e5: bipush 10
      // 0e7: bipush 3
      // 0e8: getstatic ox_.a3_ Le0x;
      // 0eb: invokevirtual e0x.l4i ()Lzfz;
      // 0ee: getstatic ox_.a3_ Le0x;
      // 0f1: invokevirtual e0x.l4i ()Lzfz;
      // 0f4: bipush 0
      // 0f5: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0f8: aload 0
      // 0f9: aload 1
      // 0fa: aload 3
      // 0fb: bipush 0
      // 0fc: bipush 0
      // 0fd: bipush 4
      // 0fe: bipush 0
      // 0ff: bipush 4
      // 100: bipush 7
      // 102: getstatic ox_.a3_ Le0x;
      // 105: invokevirtual e0x.l4i ()Lzfz;
      // 108: getstatic ox_.a3_ Le0x;
      // 10b: invokevirtual e0x.l4i ()Lzfz;
      // 10e: bipush 0
      // 10f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 112: aload 0
      // 113: aload 1
      // 114: aload 3
      // 115: bipush 4
      // 116: bipush 0
      // 117: bipush 4
      // 118: bipush 4
      // 119: bipush 4
      // 11a: bipush 7
      // 11c: getstatic ox_.a3_ Le0x;
      // 11f: invokevirtual e0x.l4i ()Lzfz;
      // 122: getstatic ox_.a3_ Le0x;
      // 125: invokevirtual e0x.l4i ()Lzfz;
      // 128: bipush 0
      // 129: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 12c: aload 0
      // 12d: aload 1
      // 12e: aload 3
      // 12f: bipush 1
      // 130: bipush 1
      // 131: bipush 8
      // 133: bipush 3
      // 134: bipush 4
      // 135: bipush 8
      // 137: getstatic ox_.a3_ Le0x;
      // 13a: invokevirtual e0x.l4i ()Lzfz;
      // 13d: getstatic ox_.a3_ Le0x;
      // 140: invokevirtual e0x.l4i ()Lzfz;
      // 143: bipush 0
      // 144: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 147: aload 0
      // 148: aload 1
      // 149: aload 3
      // 14a: bipush 1
      // 14b: bipush 5
      // 14c: bipush 4
      // 14d: bipush 3
      // 14e: bipush 10
      // 150: bipush 4
      // 151: getstatic ox_.a3_ Le0x;
      // 154: invokevirtual e0x.l4i ()Lzfz;
      // 157: getstatic ox_.a3_ Le0x;
      // 15a: invokevirtual e0x.l4i ()Lzfz;
      // 15d: bipush 0
      // 15e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 161: aload 0
      // 162: aload 1
      // 163: aload 3
      // 164: bipush 1
      // 165: bipush 5
      // 166: bipush 5
      // 167: bipush 3
      // 168: bipush 5
      // 169: bipush 7
      // 16b: getstatic ox_.a3_ Le0x;
      // 16e: invokevirtual e0x.l4i ()Lzfz;
      // 171: getstatic ox_.a3_ Le0x;
      // 174: invokevirtual e0x.l4i ()Lzfz;
      // 177: bipush 0
      // 178: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 17b: aload 0
      // 17c: aload 1
      // 17d: aload 3
      // 17e: bipush 0
      // 17f: bipush 9
      // 181: bipush 0
      // 182: bipush 4
      // 183: bipush 9
      // 185: bipush 4
      // 186: getstatic ox_.a3_ Le0x;
      // 189: invokevirtual e0x.l4i ()Lzfz;
      // 18c: getstatic ox_.a3_ Le0x;
      // 18f: invokevirtual e0x.l4i ()Lzfz;
      // 192: bipush 0
      // 193: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 196: aload 0
      // 197: aload 1
      // 198: aload 3
      // 199: bipush 0
      // 19a: bipush 4
      // 19b: bipush 0
      // 19c: bipush 4
      // 19d: bipush 4
      // 19e: bipush 4
      // 19f: getstatic ox_.a3_ Le0x;
      // 1a2: invokevirtual e0x.l4i ()Lzfz;
      // 1a5: getstatic ox_.a3_ Le0x;
      // 1a8: invokevirtual e0x.l4i ()Lzfz;
      // 1ab: bipush 0
      // 1ac: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1af: aload 0
      // 1b0: aload 1
      // 1b1: getstatic ox_.a3_ Le0x;
      // 1b4: invokevirtual e0x.l4i ()Lzfz;
      // 1b7: bipush 0
      // 1b8: bipush 11
      // 1ba: bipush 2
      // 1bb: aload 3
      // 1bc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1bf: aload 0
      // 1c0: aload 1
      // 1c1: getstatic ox_.a3_ Le0x;
      // 1c4: invokevirtual e0x.l4i ()Lzfz;
      // 1c7: bipush 4
      // 1c8: bipush 11
      // 1ca: bipush 2
      // 1cb: aload 3
      // 1cc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1cf: aload 0
      // 1d0: aload 1
      // 1d1: getstatic ox_.a3_ Le0x;
      // 1d4: invokevirtual e0x.l4i ()Lzfz;
      // 1d7: bipush 2
      // 1d8: bipush 11
      // 1da: bipush 0
      // 1db: aload 3
      // 1dc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1df: aload 0
      // 1e0: aload 1
      // 1e1: getstatic ox_.a3_ Le0x;
      // 1e4: invokevirtual e0x.l4i ()Lzfz;
      // 1e7: bipush 2
      // 1e8: bipush 11
      // 1ea: bipush 4
      // 1eb: aload 3
      // 1ec: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1ef: aload 0
      // 1f0: aload 1
      // 1f1: getstatic ox_.a3_ Le0x;
      // 1f4: invokevirtual e0x.l4i ()Lzfz;
      // 1f7: bipush 1
      // 1f8: bipush 1
      // 1f9: bipush 6
      // 1fb: aload 3
      // 1fc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1ff: aload 0
      // 200: aload 1
      // 201: getstatic ox_.a3_ Le0x;
      // 204: invokevirtual e0x.l4i ()Lzfz;
      // 207: bipush 1
      // 208: bipush 1
      // 209: bipush 7
      // 20b: aload 3
      // 20c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 20f: aload 0
      // 210: aload 1
      // 211: getstatic ox_.a3_ Le0x;
      // 214: invokevirtual e0x.l4i ()Lzfz;
      // 217: bipush 2
      // 218: bipush 1
      // 219: bipush 7
      // 21b: aload 3
      // 21c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 21f: aload 0
      // 220: aload 1
      // 221: getstatic ox_.a3_ Le0x;
      // 224: invokevirtual e0x.l4i ()Lzfz;
      // 227: bipush 3
      // 228: bipush 1
      // 229: bipush 6
      // 22b: aload 3
      // 22c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 22f: aload 0
      // 230: aload 1
      // 231: getstatic ox_.a3_ Le0x;
      // 234: invokevirtual e0x.l4i ()Lzfz;
      // 237: bipush 3
      // 238: bipush 1
      // 239: bipush 7
      // 23b: aload 3
      // 23c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 23f: aload 0
      // 240: aload 1
      // 241: getstatic ox_.l3f Le0x;
      // 244: aload 0
      // 245: getstatic ox_.l3f Le0x;
      // 248: bipush 3
      // 249: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.ujv (Le0x;I)I
      // 24c: invokevirtual e0x.kig (I)Lzfz;
      // 24f: bipush 1
      // 250: bipush 1
      // 251: bipush 5
      // 252: aload 3
      // 253: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 256: aload 0
      // 257: aload 1
      // 258: getstatic ox_.l3f Le0x;
      // 25b: aload 0
      // 25c: getstatic ox_.l3f Le0x;
      // 25f: bipush 3
      // 260: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.ujv (Le0x;I)I
      // 263: invokevirtual e0x.kig (I)Lzfz;
      // 266: bipush 2
      // 267: bipush 1
      // 268: bipush 6
      // 26a: aload 3
      // 26b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 26e: aload 0
      // 26f: aload 1
      // 270: getstatic ox_.l3f Le0x;
      // 273: aload 0
      // 274: getstatic ox_.l3f Le0x;
      // 277: bipush 3
      // 278: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.ujv (Le0x;I)I
      // 27b: invokevirtual e0x.kig (I)Lzfz;
      // 27e: bipush 3
      // 27f: bipush 1
      // 280: bipush 5
      // 281: aload 3
      // 282: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 285: aload 0
      // 286: aload 1
      // 287: getstatic ox_.l3f Le0x;
      // 28a: aload 0
      // 28b: getstatic ox_.l3f Le0x;
      // 28e: bipush 1
      // 28f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.ujv (Le0x;I)I
      // 292: invokevirtual e0x.kig (I)Lzfz;
      // 295: bipush 1
      // 296: bipush 2
      // 297: bipush 7
      // 299: aload 3
      // 29a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 29d: aload 0
      // 29e: aload 1
      // 29f: getstatic ox_.l3f Le0x;
      // 2a2: aload 0
      // 2a3: getstatic ox_.l3f Le0x;
      // 2a6: bipush 0
      // 2a7: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.ujv (Le0x;I)I
      // 2aa: invokevirtual e0x.kig (I)Lzfz;
      // 2ad: bipush 3
      // 2ae: bipush 2
      // 2af: bipush 7
      // 2b1: aload 3
      // 2b2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2b5: aload 0
      // 2b6: aload 1
      // 2b7: getstatic ox_.g6c Le0x;
      // 2ba: invokevirtual e0x.l4i ()Lzfz;
      // 2bd: bipush 0
      // 2be: bipush 2
      // 2bf: bipush 2
      // 2c0: aload 3
      // 2c1: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2c4: aload 0
      // 2c5: aload 1
      // 2c6: getstatic ox_.g6c Le0x;
      // 2c9: invokevirtual e0x.l4i ()Lzfz;
      // 2cc: bipush 0
      // 2cd: bipush 3
      // 2ce: bipush 2
      // 2cf: aload 3
      // 2d0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2d3: aload 0
      // 2d4: aload 1
      // 2d5: getstatic ox_.g6c Le0x;
      // 2d8: invokevirtual e0x.l4i ()Lzfz;
      // 2db: bipush 4
      // 2dc: bipush 2
      // 2dd: bipush 2
      // 2de: aload 3
      // 2df: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2e2: aload 0
      // 2e3: aload 1
      // 2e4: getstatic ox_.g6c Le0x;
      // 2e7: invokevirtual e0x.l4i ()Lzfz;
      // 2ea: bipush 4
      // 2eb: bipush 3
      // 2ec: bipush 2
      // 2ed: aload 3
      // 2ee: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2f1: aload 0
      // 2f2: aload 1
      // 2f3: getstatic ox_.g6c Le0x;
      // 2f6: invokevirtual e0x.l4i ()Lzfz;
      // 2f9: bipush 0
      // 2fa: bipush 6
      // 2fc: bipush 2
      // 2fd: aload 3
      // 2fe: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 301: aload 0
      // 302: aload 1
      // 303: getstatic ox_.g6c Le0x;
      // 306: invokevirtual e0x.l4i ()Lzfz;
      // 309: bipush 0
      // 30a: bipush 7
      // 30c: bipush 2
      // 30d: aload 3
      // 30e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 311: aload 0
      // 312: aload 1
      // 313: getstatic ox_.g6c Le0x;
      // 316: invokevirtual e0x.l4i ()Lzfz;
      // 319: bipush 4
      // 31a: bipush 6
      // 31c: bipush 2
      // 31d: aload 3
      // 31e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 321: aload 0
      // 322: aload 1
      // 323: getstatic ox_.g6c Le0x;
      // 326: invokevirtual e0x.l4i ()Lzfz;
      // 329: bipush 4
      // 32a: bipush 7
      // 32c: bipush 2
      // 32d: aload 3
      // 32e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 331: aload 0
      // 332: aload 1
      // 333: getstatic ox_.g6c Le0x;
      // 336: invokevirtual e0x.l4i ()Lzfz;
      // 339: bipush 2
      // 33a: bipush 6
      // 33c: bipush 0
      // 33d: aload 3
      // 33e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 341: aload 0
      // 342: aload 1
      // 343: getstatic ox_.g6c Le0x;
      // 346: invokevirtual e0x.l4i ()Lzfz;
      // 349: bipush 2
      // 34a: bipush 7
      // 34c: bipush 0
      // 34d: aload 3
      // 34e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 351: aload 0
      // 352: aload 1
      // 353: getstatic ox_.g6c Le0x;
      // 356: invokevirtual e0x.l4i ()Lzfz;
      // 359: bipush 2
      // 35a: bipush 6
      // 35c: bipush 4
      // 35d: aload 3
      // 35e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 361: aload 0
      // 362: aload 1
      // 363: getstatic ox_.g6c Le0x;
      // 366: invokevirtual e0x.l4i ()Lzfz;
      // 369: bipush 2
      // 36a: bipush 7
      // 36c: bipush 4
      // 36d: aload 3
      // 36e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 371: aload 0
      // 372: aload 1
      // 373: getstatic ox_.g6c Le0x;
      // 376: invokevirtual e0x.l4i ()Lzfz;
      // 379: bipush 0
      // 37a: bipush 3
      // 37b: bipush 6
      // 37d: aload 3
      // 37e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 381: aload 0
      // 382: aload 1
      // 383: getstatic ox_.g6c Le0x;
      // 386: invokevirtual e0x.l4i ()Lzfz;
      // 389: bipush 4
      // 38a: bipush 3
      // 38b: bipush 6
      // 38d: aload 3
      // 38e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 391: aload 0
      // 392: aload 1
      // 393: getstatic ox_.g6c Le0x;
      // 396: invokevirtual e0x.l4i ()Lzfz;
      // 399: bipush 2
      // 39a: bipush 3
      // 39b: bipush 8
      // 39d: aload 3
      // 39e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3a1: aload 0
      // 3a2: aload 1
      // 3a3: getstatic ox_.gt8 Le0x;
      // 3a6: invokevirtual e0x.l4i ()Lzfz;
      // 3a9: getstatic um3.go7 Lqx_;
      // 3ac: aload 0
      // 3ad: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Church.p7m Lvt2;
      // 3b0: invokevirtual vt2.b4b ()Lvt2;
      // 3b3: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 3b8: bipush 2
      // 3b9: bipush 4
      // 3ba: bipush 7
      // 3bc: aload 3
      // 3bd: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3c0: aload 0
      // 3c1: aload 1
      // 3c2: getstatic ox_.gt8 Le0x;
      // 3c5: invokevirtual e0x.l4i ()Lzfz;
      // 3c8: getstatic um3.go7 Lqx_;
      // 3cb: aload 0
      // 3cc: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Church.p7m Lvt2;
      // 3cf: invokevirtual vt2.drv ()Lvt2;
      // 3d2: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 3d7: bipush 1
      // 3d8: bipush 4
      // 3d9: bipush 6
      // 3db: aload 3
      // 3dc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3df: aload 0
      // 3e0: aload 1
      // 3e1: getstatic ox_.gt8 Le0x;
      // 3e4: invokevirtual e0x.l4i ()Lzfz;
      // 3e7: getstatic um3.go7 Lqx_;
      // 3ea: aload 0
      // 3eb: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Church.p7m Lvt2;
      // 3ee: invokevirtual vt2.tgw ()Lvt2;
      // 3f1: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 3f6: bipush 3
      // 3f7: bipush 4
      // 3f8: bipush 6
      // 3fa: aload 3
      // 3fb: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3fe: aload 0
      // 3ff: aload 1
      // 400: getstatic ox_.gt8 Le0x;
      // 403: invokevirtual e0x.l4i ()Lzfz;
      // 406: getstatic um3.go7 Lqx_;
      // 409: aload 0
      // 40a: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Church.p7m Lvt2;
      // 40d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 412: bipush 2
      // 413: bipush 4
      // 414: bipush 5
      // 415: aload 3
      // 416: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 419: aload 0
      // 41a: getstatic ox_.h49 Le0x;
      // 41d: bipush 4
      // 41e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.ujv (Le0x;I)I
      // 421: istore 5
      // 423: bipush 1
      // 424: istore 6
      // 426: iload 6
      // 428: bipush 9
      // 42a: if_icmpgt 453
      // 42d: aload 0
      // 42e: aload 1
      // 42f: getstatic ox_.h49 Le0x;
      // 432: iload 5
      // 434: invokevirtual e0x.kig (I)Lzfz;
      // 437: bipush 3
      // 438: iload 6
      // 43a: bipush 3
      // 43b: aload 3
      // 43c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 43f: iinc 6 1
      // 442: aload 4
      // 444: ifnull 486
      // 447: aload 4
      // 449: ifnonnull 426
      // 44c: goto 453
      // 44f: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.a (Loov;)Loov;
      // 452: athrow
      // 453: aload 0
      // 454: aload 1
      // 455: getstatic ox_.ibw Le0x;
      // 458: invokevirtual e0x.l4i ()Lzfz;
      // 45b: bipush 2
      // 45c: bipush 1
      // 45d: bipush 0
      // 45e: aload 3
      // 45f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 462: aload 0
      // 463: aload 1
      // 464: getstatic ox_.ibw Le0x;
      // 467: invokevirtual e0x.l4i ()Lzfz;
      // 46a: bipush 2
      // 46b: bipush 2
      // 46c: bipush 0
      // 46d: aload 3
      // 46e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 471: aload 0
      // 472: aload 1
      // 473: aload 3
      // 474: aload 2
      // 475: bipush 2
      // 476: bipush 1
      // 477: bipush 0
      // 478: aload 0
      // 479: getstatic ox_.o0v Le0x;
      // 47c: bipush 1
      // 47d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.ujv (Le0x;I)I
      // 480: invokestatic vt2.bm6 (I)Lvt2;
      // 483: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.us5 (Lt9d;Lyve;Ljava/util/Random;IIILvt2;)V
      // 486: aload 0
      // 487: aload 1
      // 488: bipush 2
      // 489: bipush 0
      // 48a: bipush -1
      // 48b: aload 3
      // 48c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.t90 (Lt9d;IIILyve;)Lzfz;
      // 48f: invokeinterface zfz.r_y ()Le0x; 1
      // 494: invokevirtual e0x.p1r ()Lp3y;
      // 497: getstatic p3y.cei Lp3y;
      // 49a: aload 4
      // 49c: ifnull 4d0
      // 49f: if_acmpne 4f1
      // 4a2: goto 4a9
      // 4a5: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.a (Loov;)Loov;
      // 4a8: athrow
      // 4a9: aload 0
      // 4aa: aload 1
      // 4ab: aload 4
      // 4ad: ifnull 4dc
      // 4b0: goto 4b7
      // 4b3: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.a (Loov;)Loov;
      // 4b6: athrow
      // 4b7: bipush 2
      // 4b8: bipush -1
      // 4b9: bipush -1
      // 4ba: aload 3
      // 4bb: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.t90 (Lt9d;IIILyve;)Lzfz;
      // 4be: invokeinterface zfz.r_y ()Le0x; 1
      // 4c3: invokevirtual e0x.p1r ()Lp3y;
      // 4c6: getstatic p3y.cei Lp3y;
      // 4c9: goto 4d0
      // 4cc: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.a (Loov;)Loov;
      // 4cf: athrow
      // 4d0: if_acmpeq 4f1
      // 4d3: aload 0
      // 4d4: aload 1
      // 4d5: goto 4dc
      // 4d8: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.a (Loov;)Loov;
      // 4db: athrow
      // 4dc: getstatic ox_.l3f Le0x;
      // 4df: aload 0
      // 4e0: getstatic ox_.l3f Le0x;
      // 4e3: bipush 3
      // 4e4: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.ujv (Le0x;I)I
      // 4e7: invokevirtual e0x.kig (I)Lzfz;
      // 4ea: bipush 2
      // 4eb: bipush 0
      // 4ec: bipush -1
      // 4ed: aload 3
      // 4ee: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4f1: bipush 0
      // 4f2: istore 6
      // 4f4: iload 6
      // 4f6: bipush 9
      // 4f8: if_icmpge 542
      // 4fb: bipush 0
      // 4fc: aload 4
      // 4fe: ifnull 54d
      // 501: istore 7
      // 503: iload 7
      // 505: bipush 5
      // 506: if_icmpge 53a
      // 509: aload 0
      // 50a: aload 1
      // 50b: iload 7
      // 50d: bipush 12
      // 50f: iload 6
      // 511: aload 3
      // 512: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.epu (Lt9d;IIILyve;)V
      // 515: aload 0
      // 516: aload 1
      // 517: getstatic ox_.a3_ Le0x;
      // 51a: invokevirtual e0x.l4i ()Lzfz;
      // 51d: iload 7
      // 51f: bipush -1
      // 520: iload 6
      // 522: aload 3
      // 523: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.doc (Lt9d;Lzfz;IIILyve;)V
      // 526: iinc 7 1
      // 529: aload 4
      // 52b: ifnull 53d
      // 52e: aload 4
      // 530: ifnonnull 503
      // 533: goto 53a
      // 536: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Church.a (Loov;)Loov;
      // 539: athrow
      // 53a: iinc 6 1
      // 53d: aload 4
      // 53f: ifnonnull 4f4
      // 542: aload 0
      // 543: aload 1
      // 544: aload 3
      // 545: bipush 2
      // 546: bipush 1
      // 547: bipush 2
      // 548: bipush 1
      // 549: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Church.pil (Lt9d;Lyve;IIII)V
      // 54c: bipush 1
      // 54d: ireturn
   }

   @Override
   public int e0x(int var1, int var2) {
      return 2;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
