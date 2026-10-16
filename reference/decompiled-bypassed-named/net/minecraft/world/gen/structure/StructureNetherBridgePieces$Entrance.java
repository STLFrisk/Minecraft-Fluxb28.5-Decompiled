package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureNetherBridgePieces$Entrance extends StructureNetherBridgePieces$Piece {
   public StructureNetherBridgePieces$Entrance() {
   }

   public StructureNetherBridgePieces$Entrance(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.yqm = var3;
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      this.d3x((StructureNetherBridgePieces$Start)var1, var2, var3, 5, 3, true);
   }

   public static StructureNetherBridgePieces$Entrance b03(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: iload 3
      // 02: iload 4
      // 04: bipush -5
      // 06: bipush -3
      // 08: bipush 0
      // 09: bipush 13
      // 0b: bipush 14
      // 0d: bipush 13
      // 0f: aload 5
      // 11: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 14: astore 7
      // 16: aload 7
      // 18: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.ulp (Lyve;)Z
      // 1b: ifeq 43
      // 1e: aload 0
      // 1f: aload 7
      // 21: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 24: ifnonnull 43
      // 27: goto 2e
      // 2a: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.a (Loov;)Loov;
      // 2d: athrow
      // 2e: new net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance
      // 31: dup
      // 32: iload 6
      // 34: aload 1
      // 35: aload 7
      // 37: aload 5
      // 39: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3c: goto 44
      // 3f: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.a (Loov;)Loov;
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
      // 000: aload 0
      // 001: aload 1
      // 002: aload 3
      // 003: bipush 0
      // 004: bipush 3
      // 005: bipush 0
      // 006: bipush 12
      // 008: bipush 4
      // 009: bipush 12
      // 00b: getstatic ox_.cbk Le0x;
      // 00e: invokevirtual e0x.l4i ()Lzfz;
      // 011: getstatic ox_.cbk Le0x;
      // 014: invokevirtual e0x.l4i ()Lzfz;
      // 017: bipush 0
      // 018: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 01b: aload 0
      // 01c: aload 1
      // 01d: aload 3
      // 01e: bipush 0
      // 01f: bipush 5
      // 020: bipush 0
      // 021: bipush 12
      // 023: bipush 13
      // 025: bipush 12
      // 027: getstatic ox_.ibw Le0x;
      // 02a: invokevirtual e0x.l4i ()Lzfz;
      // 02d: getstatic ox_.ibw Le0x;
      // 030: invokevirtual e0x.l4i ()Lzfz;
      // 033: bipush 0
      // 034: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 037: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03a: aload 0
      // 03b: aload 1
      // 03c: aload 3
      // 03d: bipush 0
      // 03e: bipush 5
      // 03f: bipush 0
      // 040: bipush 1
      // 041: bipush 12
      // 043: bipush 12
      // 045: getstatic ox_.cbk Le0x;
      // 048: invokevirtual e0x.l4i ()Lzfz;
      // 04b: getstatic ox_.cbk Le0x;
      // 04e: invokevirtual e0x.l4i ()Lzfz;
      // 051: bipush 0
      // 052: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 055: aload 0
      // 056: aload 1
      // 057: aload 3
      // 058: bipush 11
      // 05a: bipush 5
      // 05b: bipush 0
      // 05c: bipush 12
      // 05e: bipush 12
      // 060: bipush 12
      // 062: getstatic ox_.cbk Le0x;
      // 065: invokevirtual e0x.l4i ()Lzfz;
      // 068: getstatic ox_.cbk Le0x;
      // 06b: invokevirtual e0x.l4i ()Lzfz;
      // 06e: bipush 0
      // 06f: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 072: aload 0
      // 073: aload 1
      // 074: aload 3
      // 075: bipush 2
      // 076: bipush 5
      // 077: bipush 11
      // 079: bipush 4
      // 07a: bipush 12
      // 07c: bipush 12
      // 07e: getstatic ox_.cbk Le0x;
      // 081: invokevirtual e0x.l4i ()Lzfz;
      // 084: getstatic ox_.cbk Le0x;
      // 087: invokevirtual e0x.l4i ()Lzfz;
      // 08a: bipush 0
      // 08b: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 08e: aload 0
      // 08f: aload 1
      // 090: aload 3
      // 091: bipush 8
      // 093: bipush 5
      // 094: bipush 11
      // 096: bipush 10
      // 098: bipush 12
      // 09a: bipush 12
      // 09c: getstatic ox_.cbk Le0x;
      // 09f: invokevirtual e0x.l4i ()Lzfz;
      // 0a2: getstatic ox_.cbk Le0x;
      // 0a5: invokevirtual e0x.l4i ()Lzfz;
      // 0a8: bipush 0
      // 0a9: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0ac: astore 4
      // 0ae: aload 0
      // 0af: aload 1
      // 0b0: aload 3
      // 0b1: bipush 5
      // 0b2: bipush 9
      // 0b4: bipush 11
      // 0b6: bipush 7
      // 0b8: bipush 12
      // 0ba: bipush 12
      // 0bc: getstatic ox_.cbk Le0x;
      // 0bf: invokevirtual e0x.l4i ()Lzfz;
      // 0c2: getstatic ox_.cbk Le0x;
      // 0c5: invokevirtual e0x.l4i ()Lzfz;
      // 0c8: bipush 0
      // 0c9: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0cc: aload 0
      // 0cd: aload 1
      // 0ce: aload 3
      // 0cf: bipush 2
      // 0d0: bipush 5
      // 0d1: bipush 0
      // 0d2: bipush 4
      // 0d3: bipush 12
      // 0d5: bipush 1
      // 0d6: getstatic ox_.cbk Le0x;
      // 0d9: invokevirtual e0x.l4i ()Lzfz;
      // 0dc: getstatic ox_.cbk Le0x;
      // 0df: invokevirtual e0x.l4i ()Lzfz;
      // 0e2: bipush 0
      // 0e3: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e6: aload 0
      // 0e7: aload 1
      // 0e8: aload 3
      // 0e9: bipush 8
      // 0eb: bipush 5
      // 0ec: bipush 0
      // 0ed: bipush 10
      // 0ef: bipush 12
      // 0f1: bipush 1
      // 0f2: getstatic ox_.cbk Le0x;
      // 0f5: invokevirtual e0x.l4i ()Lzfz;
      // 0f8: getstatic ox_.cbk Le0x;
      // 0fb: invokevirtual e0x.l4i ()Lzfz;
      // 0fe: bipush 0
      // 0ff: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 102: aload 0
      // 103: aload 1
      // 104: aload 3
      // 105: bipush 5
      // 106: bipush 9
      // 108: bipush 0
      // 109: bipush 7
      // 10b: bipush 12
      // 10d: bipush 1
      // 10e: getstatic ox_.cbk Le0x;
      // 111: invokevirtual e0x.l4i ()Lzfz;
      // 114: getstatic ox_.cbk Le0x;
      // 117: invokevirtual e0x.l4i ()Lzfz;
      // 11a: bipush 0
      // 11b: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 11e: aload 0
      // 11f: aload 1
      // 120: aload 3
      // 121: bipush 2
      // 122: bipush 11
      // 124: bipush 2
      // 125: bipush 10
      // 127: bipush 12
      // 129: bipush 10
      // 12b: getstatic ox_.cbk Le0x;
      // 12e: invokevirtual e0x.l4i ()Lzfz;
      // 131: getstatic ox_.cbk Le0x;
      // 134: invokevirtual e0x.l4i ()Lzfz;
      // 137: bipush 0
      // 138: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 13b: aload 0
      // 13c: aload 1
      // 13d: aload 3
      // 13e: bipush 5
      // 13f: bipush 8
      // 141: bipush 0
      // 142: bipush 7
      // 144: bipush 8
      // 146: bipush 0
      // 147: getstatic ox_.laa Le0x;
      // 14a: invokevirtual e0x.l4i ()Lzfz;
      // 14d: getstatic ox_.laa Le0x;
      // 150: invokevirtual e0x.l4i ()Lzfz;
      // 153: bipush 0
      // 154: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 157: bipush 1
      // 158: istore 5
      // 15a: iload 5
      // 15c: bipush 11
      // 15e: if_icmpgt 281
      // 161: aload 0
      // 162: aload 1
      // 163: aload 3
      // 164: iload 5
      // 166: bipush 10
      // 168: bipush 0
      // 169: iload 5
      // 16b: bipush 11
      // 16d: bipush 0
      // 16e: getstatic ox_.laa Le0x;
      // 171: invokevirtual e0x.l4i ()Lzfz;
      // 174: getstatic ox_.laa Le0x;
      // 177: invokevirtual e0x.l4i ()Lzfz;
      // 17a: bipush 0
      // 17b: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 17e: aload 0
      // 17f: aload 1
      // 180: aload 3
      // 181: iload 5
      // 183: bipush 10
      // 185: bipush 12
      // 187: iload 5
      // 189: bipush 11
      // 18b: bipush 12
      // 18d: getstatic ox_.laa Le0x;
      // 190: invokevirtual e0x.l4i ()Lzfz;
      // 193: getstatic ox_.laa Le0x;
      // 196: invokevirtual e0x.l4i ()Lzfz;
      // 199: bipush 0
      // 19a: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 19d: aload 0
      // 19e: aload 1
      // 19f: aload 3
      // 1a0: bipush 0
      // 1a1: bipush 10
      // 1a3: iload 5
      // 1a5: bipush 0
      // 1a6: bipush 11
      // 1a8: iload 5
      // 1aa: getstatic ox_.laa Le0x;
      // 1ad: invokevirtual e0x.l4i ()Lzfz;
      // 1b0: getstatic ox_.laa Le0x;
      // 1b3: invokevirtual e0x.l4i ()Lzfz;
      // 1b6: bipush 0
      // 1b7: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1ba: aload 0
      // 1bb: aload 1
      // 1bc: aload 3
      // 1bd: bipush 12
      // 1bf: bipush 10
      // 1c1: iload 5
      // 1c3: bipush 12
      // 1c5: bipush 11
      // 1c7: iload 5
      // 1c9: getstatic ox_.laa Le0x;
      // 1cc: invokevirtual e0x.l4i ()Lzfz;
      // 1cf: getstatic ox_.laa Le0x;
      // 1d2: invokevirtual e0x.l4i ()Lzfz;
      // 1d5: bipush 0
      // 1d6: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1d9: aload 0
      // 1da: aload 1
      // 1db: getstatic ox_.cbk Le0x;
      // 1de: invokevirtual e0x.l4i ()Lzfz;
      // 1e1: iload 5
      // 1e3: bipush 13
      // 1e5: bipush 0
      // 1e6: aload 3
      // 1e7: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1ea: aload 0
      // 1eb: aload 1
      // 1ec: getstatic ox_.cbk Le0x;
      // 1ef: invokevirtual e0x.l4i ()Lzfz;
      // 1f2: iload 5
      // 1f4: bipush 13
      // 1f6: bipush 12
      // 1f8: aload 3
      // 1f9: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1fc: aload 0
      // 1fd: aload 1
      // 1fe: getstatic ox_.cbk Le0x;
      // 201: invokevirtual e0x.l4i ()Lzfz;
      // 204: bipush 0
      // 205: bipush 13
      // 207: iload 5
      // 209: aload 3
      // 20a: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 20d: aload 0
      // 20e: aload 1
      // 20f: getstatic ox_.cbk Le0x;
      // 212: invokevirtual e0x.l4i ()Lzfz;
      // 215: bipush 12
      // 217: bipush 13
      // 219: iload 5
      // 21b: aload 3
      // 21c: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 21f: aload 0
      // 220: aload 1
      // 221: getstatic ox_.laa Le0x;
      // 224: invokevirtual e0x.l4i ()Lzfz;
      // 227: iload 5
      // 229: bipush 1
      // 22a: iadd
      // 22b: bipush 13
      // 22d: bipush 0
      // 22e: aload 3
      // 22f: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 232: aload 0
      // 233: aload 1
      // 234: getstatic ox_.laa Le0x;
      // 237: invokevirtual e0x.l4i ()Lzfz;
      // 23a: iload 5
      // 23c: bipush 1
      // 23d: iadd
      // 23e: bipush 13
      // 240: bipush 12
      // 242: aload 3
      // 243: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 246: aload 0
      // 247: aload 1
      // 248: getstatic ox_.laa Le0x;
      // 24b: invokevirtual e0x.l4i ()Lzfz;
      // 24e: bipush 0
      // 24f: bipush 13
      // 251: iload 5
      // 253: bipush 1
      // 254: iadd
      // 255: aload 3
      // 256: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 259: aload 0
      // 25a: aload 1
      // 25b: getstatic ox_.laa Le0x;
      // 25e: invokevirtual e0x.l4i ()Lzfz;
      // 261: bipush 12
      // 263: bipush 13
      // 265: iload 5
      // 267: bipush 1
      // 268: iadd
      // 269: aload 3
      // 26a: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 26d: iinc 5 2
      // 270: aload 4
      // 272: ifnull 2c3
      // 275: aload 4
      // 277: ifnonnull 15a
      // 27a: goto 281
      // 27d: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.a (Loov;)Loov;
      // 280: athrow
      // 281: aload 0
      // 282: aload 1
      // 283: getstatic ox_.laa Le0x;
      // 286: invokevirtual e0x.l4i ()Lzfz;
      // 289: bipush 0
      // 28a: bipush 13
      // 28c: bipush 0
      // 28d: aload 3
      // 28e: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 291: aload 0
      // 292: aload 1
      // 293: getstatic ox_.laa Le0x;
      // 296: invokevirtual e0x.l4i ()Lzfz;
      // 299: bipush 0
      // 29a: bipush 13
      // 29c: bipush 12
      // 29e: aload 3
      // 29f: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2a2: aload 0
      // 2a3: aload 1
      // 2a4: getstatic ox_.laa Le0x;
      // 2a7: invokevirtual e0x.l4i ()Lzfz;
      // 2aa: bipush 0
      // 2ab: bipush 13
      // 2ad: bipush 0
      // 2ae: aload 3
      // 2af: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2b2: aload 0
      // 2b3: aload 1
      // 2b4: getstatic ox_.laa Le0x;
      // 2b7: invokevirtual e0x.l4i ()Lzfz;
      // 2ba: bipush 12
      // 2bc: bipush 13
      // 2be: bipush 0
      // 2bf: aload 3
      // 2c0: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2c3: bipush 3
      // 2c4: istore 5
      // 2c6: iload 5
      // 2c8: bipush 9
      // 2ca: if_icmpgt 31d
      // 2cd: aload 0
      // 2ce: aload 1
      // 2cf: aload 3
      // 2d0: bipush 1
      // 2d1: bipush 7
      // 2d3: iload 5
      // 2d5: bipush 1
      // 2d6: bipush 8
      // 2d8: iload 5
      // 2da: getstatic ox_.laa Le0x;
      // 2dd: invokevirtual e0x.l4i ()Lzfz;
      // 2e0: getstatic ox_.laa Le0x;
      // 2e3: invokevirtual e0x.l4i ()Lzfz;
      // 2e6: bipush 0
      // 2e7: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2ea: aload 0
      // 2eb: aload 1
      // 2ec: aload 3
      // 2ed: bipush 11
      // 2ef: bipush 7
      // 2f1: iload 5
      // 2f3: bipush 11
      // 2f5: bipush 8
      // 2f7: iload 5
      // 2f9: getstatic ox_.laa Le0x;
      // 2fc: invokevirtual e0x.l4i ()Lzfz;
      // 2ff: getstatic ox_.laa Le0x;
      // 302: invokevirtual e0x.l4i ()Lzfz;
      // 305: bipush 0
      // 306: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 309: iinc 5 2
      // 30c: aload 4
      // 30e: ifnull 3bf
      // 311: aload 4
      // 313: ifnonnull 2c6
      // 316: goto 31d
      // 319: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.a (Loov;)Loov;
      // 31c: athrow
      // 31d: aload 0
      // 31e: aload 1
      // 31f: aload 3
      // 320: bipush 4
      // 321: bipush 2
      // 322: bipush 0
      // 323: bipush 8
      // 325: bipush 2
      // 326: bipush 12
      // 328: getstatic ox_.cbk Le0x;
      // 32b: invokevirtual e0x.l4i ()Lzfz;
      // 32e: getstatic ox_.cbk Le0x;
      // 331: invokevirtual e0x.l4i ()Lzfz;
      // 334: bipush 0
      // 335: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 338: aload 0
      // 339: aload 1
      // 33a: aload 3
      // 33b: bipush 0
      // 33c: bipush 2
      // 33d: bipush 4
      // 33e: bipush 12
      // 340: bipush 2
      // 341: bipush 8
      // 343: getstatic ox_.cbk Le0x;
      // 346: invokevirtual e0x.l4i ()Lzfz;
      // 349: getstatic ox_.cbk Le0x;
      // 34c: invokevirtual e0x.l4i ()Lzfz;
      // 34f: bipush 0
      // 350: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 353: aload 0
      // 354: aload 1
      // 355: aload 3
      // 356: bipush 4
      // 357: bipush 0
      // 358: bipush 0
      // 359: bipush 8
      // 35b: bipush 1
      // 35c: bipush 3
      // 35d: getstatic ox_.cbk Le0x;
      // 360: invokevirtual e0x.l4i ()Lzfz;
      // 363: getstatic ox_.cbk Le0x;
      // 366: invokevirtual e0x.l4i ()Lzfz;
      // 369: bipush 0
      // 36a: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 36d: aload 0
      // 36e: aload 1
      // 36f: aload 3
      // 370: bipush 4
      // 371: bipush 0
      // 372: bipush 9
      // 374: bipush 8
      // 376: bipush 1
      // 377: bipush 12
      // 379: getstatic ox_.cbk Le0x;
      // 37c: invokevirtual e0x.l4i ()Lzfz;
      // 37f: getstatic ox_.cbk Le0x;
      // 382: invokevirtual e0x.l4i ()Lzfz;
      // 385: bipush 0
      // 386: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 389: aload 0
      // 38a: aload 1
      // 38b: aload 3
      // 38c: bipush 0
      // 38d: bipush 0
      // 38e: bipush 4
      // 38f: bipush 3
      // 390: bipush 1
      // 391: bipush 8
      // 393: getstatic ox_.cbk Le0x;
      // 396: invokevirtual e0x.l4i ()Lzfz;
      // 399: getstatic ox_.cbk Le0x;
      // 39c: invokevirtual e0x.l4i ()Lzfz;
      // 39f: bipush 0
      // 3a0: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3a3: aload 0
      // 3a4: aload 1
      // 3a5: aload 3
      // 3a6: bipush 9
      // 3a8: bipush 0
      // 3a9: bipush 4
      // 3aa: bipush 12
      // 3ac: bipush 1
      // 3ad: bipush 8
      // 3af: getstatic ox_.cbk Le0x;
      // 3b2: invokevirtual e0x.l4i ()Lzfz;
      // 3b5: getstatic ox_.cbk Le0x;
      // 3b8: invokevirtual e0x.l4i ()Lzfz;
      // 3bb: bipush 0
      // 3bc: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3bf: bipush 4
      // 3c0: istore 5
      // 3c2: iload 5
      // 3c4: bipush 8
      // 3c6: if_icmpgt 418
      // 3c9: bipush 0
      // 3ca: aload 4
      // 3cc: ifnull 419
      // 3cf: istore 6
      // 3d1: iload 6
      // 3d3: bipush 2
      // 3d4: if_icmpgt 410
      // 3d7: aload 0
      // 3d8: aload 1
      // 3d9: getstatic ox_.cbk Le0x;
      // 3dc: invokevirtual e0x.l4i ()Lzfz;
      // 3df: iload 5
      // 3e1: bipush -1
      // 3e2: iload 6
      // 3e4: aload 3
      // 3e5: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.doc (Lt9d;Lzfz;IIILyve;)V
      // 3e8: aload 0
      // 3e9: aload 1
      // 3ea: getstatic ox_.cbk Le0x;
      // 3ed: invokevirtual e0x.l4i ()Lzfz;
      // 3f0: iload 5
      // 3f2: bipush -1
      // 3f3: bipush 12
      // 3f5: iload 6
      // 3f7: isub
      // 3f8: aload 3
      // 3f9: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.doc (Lt9d;Lzfz;IIILyve;)V
      // 3fc: iinc 6 1
      // 3ff: aload 4
      // 401: ifnull 413
      // 404: aload 4
      // 406: ifnonnull 3d1
      // 409: goto 410
      // 40c: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.a (Loov;)Loov;
      // 40f: athrow
      // 410: iinc 5 1
      // 413: aload 4
      // 415: ifnonnull 3c2
      // 418: bipush 0
      // 419: istore 5
      // 41b: iload 5
      // 41d: bipush 2
      // 41e: if_icmpgt 46c
      // 421: bipush 4
      // 422: istore 6
      // 424: iload 6
      // 426: bipush 8
      // 428: if_icmpgt 464
      // 42b: aload 0
      // 42c: aload 1
      // 42d: getstatic ox_.cbk Le0x;
      // 430: invokevirtual e0x.l4i ()Lzfz;
      // 433: iload 5
      // 435: bipush -1
      // 436: iload 6
      // 438: aload 3
      // 439: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.doc (Lt9d;Lzfz;IIILyve;)V
      // 43c: aload 0
      // 43d: aload 1
      // 43e: getstatic ox_.cbk Le0x;
      // 441: invokevirtual e0x.l4i ()Lzfz;
      // 444: bipush 12
      // 446: iload 5
      // 448: isub
      // 449: bipush -1
      // 44a: iload 6
      // 44c: aload 3
      // 44d: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.doc (Lt9d;Lzfz;IIILyve;)V
      // 450: iinc 6 1
      // 453: aload 4
      // 455: ifnull 467
      // 458: aload 4
      // 45a: ifnonnull 424
      // 45d: goto 464
      // 460: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.a (Loov;)Loov;
      // 463: athrow
      // 464: iinc 5 1
      // 467: aload 4
      // 469: ifnonnull 41b
      // 46c: aload 0
      // 46d: aload 1
      // 46e: aload 3
      // 46f: bipush 5
      // 470: bipush 5
      // 471: bipush 5
      // 472: bipush 7
      // 474: bipush 5
      // 475: bipush 7
      // 477: getstatic ox_.cbk Le0x;
      // 47a: invokevirtual e0x.l4i ()Lzfz;
      // 47d: getstatic ox_.cbk Le0x;
      // 480: invokevirtual e0x.l4i ()Lzfz;
      // 483: bipush 0
      // 484: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 487: aload 0
      // 488: aload 1
      // 489: aload 3
      // 48a: bipush 6
      // 48c: bipush 1
      // 48d: bipush 6
      // 48f: bipush 6
      // 491: bipush 4
      // 492: bipush 6
      // 494: getstatic ox_.ibw Le0x;
      // 497: invokevirtual e0x.l4i ()Lzfz;
      // 49a: getstatic ox_.ibw Le0x;
      // 49d: invokevirtual e0x.l4i ()Lzfz;
      // 4a0: bipush 0
      // 4a1: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 4a4: aload 0
      // 4a5: aload 1
      // 4a6: getstatic ox_.cbk Le0x;
      // 4a9: invokevirtual e0x.l4i ()Lzfz;
      // 4ac: bipush 6
      // 4ae: bipush 0
      // 4af: bipush 6
      // 4b1: aload 3
      // 4b2: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4b5: aload 0
      // 4b6: aload 1
      // 4b7: getstatic ox_.dr2 L_13;
      // 4ba: invokevirtual _13.l4i ()Lzfz;
      // 4bd: bipush 6
      // 4bf: bipush 5
      // 4c0: bipush 6
      // 4c2: aload 3
      // 4c3: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4c6: new mew
      // 4c9: dup
      // 4ca: aload 0
      // 4cb: bipush 6
      // 4cd: bipush 6
      // 4cf: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.q__ (II)I
      // 4d2: aload 0
      // 4d3: bipush 5
      // 4d4: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance._tw (I)I
      // 4d7: aload 0
      // 4d8: bipush 6
      // 4da: bipush 6
      // 4dc: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance._ye (II)I
      // 4df: invokespecial mew.<init> (III)V
      // 4e2: astore 5
      // 4e4: aload 3
      // 4e5: aload 5
      // 4e7: invokevirtual yve.vwy (Lwgo;)Z
      // 4ea: aload 4
      // 4ec: ifnull 50b
      // 4ef: ifeq 50a
      // 4f2: goto 4f9
      // 4f5: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.a (Loov;)Loov;
      // 4f8: athrow
      // 4f9: aload 1
      // 4fa: getstatic ox_.dr2 L_13;
      // 4fd: aload 5
      // 4ff: aload 2
      // 500: invokevirtual OpaquePredicate.g0z (Le0x;Lmew;Ljava/util/Random;)V
      // 503: goto 50a
      // 506: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Entrance.a (Loov;)Loov;
      // 509: athrow
      // 50a: bipush 1
      // 50b: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
