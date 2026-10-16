package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureNetherBridgePieces$NetherStalkRoom extends StructureNetherBridgePieces$Piece {
   public StructureNetherBridgePieces$NetherStalkRoom() {
   }

   public StructureNetherBridgePieces$NetherStalkRoom(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.yqm = var3;
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      this.d3x((StructureNetherBridgePieces$Start)var1, var2, var3, 5, 3, true);
      this.d3x((StructureNetherBridgePieces$Start)var1, var2, var3, 5, 11, true);
   }

   public static StructureNetherBridgePieces$NetherStalkRoom uka(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 18: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.ulp (Lyve;)Z
      // 1b: ifeq 43
      // 1e: aload 0
      // 1f: aload 7
      // 21: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 24: ifnonnull 43
      // 27: goto 2e
      // 2a: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 2d: athrow
      // 2e: new net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom
      // 31: dup
      // 32: iload 6
      // 34: aload 1
      // 35: aload 7
      // 37: aload 5
      // 39: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3c: goto 44
      // 3f: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
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
      // 018: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 01b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 01e: aload 0
      // 01f: aload 1
      // 020: aload 3
      // 021: bipush 0
      // 022: bipush 5
      // 023: bipush 0
      // 024: bipush 12
      // 026: bipush 13
      // 028: bipush 12
      // 02a: getstatic ox_.ibw Le0x;
      // 02d: invokevirtual e0x.l4i ()Lzfz;
      // 030: getstatic ox_.ibw Le0x;
      // 033: invokevirtual e0x.l4i ()Lzfz;
      // 036: bipush 0
      // 037: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 03a: astore 4
      // 03c: aload 0
      // 03d: aload 1
      // 03e: aload 3
      // 03f: bipush 0
      // 040: bipush 5
      // 041: bipush 0
      // 042: bipush 1
      // 043: bipush 12
      // 045: bipush 12
      // 047: getstatic ox_.cbk Le0x;
      // 04a: invokevirtual e0x.l4i ()Lzfz;
      // 04d: getstatic ox_.cbk Le0x;
      // 050: invokevirtual e0x.l4i ()Lzfz;
      // 053: bipush 0
      // 054: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 057: aload 0
      // 058: aload 1
      // 059: aload 3
      // 05a: bipush 11
      // 05c: bipush 5
      // 05d: bipush 0
      // 05e: bipush 12
      // 060: bipush 12
      // 062: bipush 12
      // 064: getstatic ox_.cbk Le0x;
      // 067: invokevirtual e0x.l4i ()Lzfz;
      // 06a: getstatic ox_.cbk Le0x;
      // 06d: invokevirtual e0x.l4i ()Lzfz;
      // 070: bipush 0
      // 071: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 074: aload 0
      // 075: aload 1
      // 076: aload 3
      // 077: bipush 2
      // 078: bipush 5
      // 079: bipush 11
      // 07b: bipush 4
      // 07c: bipush 12
      // 07e: bipush 12
      // 080: getstatic ox_.cbk Le0x;
      // 083: invokevirtual e0x.l4i ()Lzfz;
      // 086: getstatic ox_.cbk Le0x;
      // 089: invokevirtual e0x.l4i ()Lzfz;
      // 08c: bipush 0
      // 08d: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 090: aload 0
      // 091: aload 1
      // 092: aload 3
      // 093: bipush 8
      // 095: bipush 5
      // 096: bipush 11
      // 098: bipush 10
      // 09a: bipush 12
      // 09c: bipush 12
      // 09e: getstatic ox_.cbk Le0x;
      // 0a1: invokevirtual e0x.l4i ()Lzfz;
      // 0a4: getstatic ox_.cbk Le0x;
      // 0a7: invokevirtual e0x.l4i ()Lzfz;
      // 0aa: bipush 0
      // 0ab: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
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
      // 0c9: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
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
      // 0e3: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
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
      // 0ff: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
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
      // 11b: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
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
      // 138: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 13b: bipush 1
      // 13c: istore 5
      // 13e: iload 5
      // 140: bipush 11
      // 142: if_icmpgt 265
      // 145: aload 0
      // 146: aload 1
      // 147: aload 3
      // 148: iload 5
      // 14a: bipush 10
      // 14c: bipush 0
      // 14d: iload 5
      // 14f: bipush 11
      // 151: bipush 0
      // 152: getstatic ox_.laa Le0x;
      // 155: invokevirtual e0x.l4i ()Lzfz;
      // 158: getstatic ox_.laa Le0x;
      // 15b: invokevirtual e0x.l4i ()Lzfz;
      // 15e: bipush 0
      // 15f: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 162: aload 0
      // 163: aload 1
      // 164: aload 3
      // 165: iload 5
      // 167: bipush 10
      // 169: bipush 12
      // 16b: iload 5
      // 16d: bipush 11
      // 16f: bipush 12
      // 171: getstatic ox_.laa Le0x;
      // 174: invokevirtual e0x.l4i ()Lzfz;
      // 177: getstatic ox_.laa Le0x;
      // 17a: invokevirtual e0x.l4i ()Lzfz;
      // 17d: bipush 0
      // 17e: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 181: aload 0
      // 182: aload 1
      // 183: aload 3
      // 184: bipush 0
      // 185: bipush 10
      // 187: iload 5
      // 189: bipush 0
      // 18a: bipush 11
      // 18c: iload 5
      // 18e: getstatic ox_.laa Le0x;
      // 191: invokevirtual e0x.l4i ()Lzfz;
      // 194: getstatic ox_.laa Le0x;
      // 197: invokevirtual e0x.l4i ()Lzfz;
      // 19a: bipush 0
      // 19b: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 19e: aload 0
      // 19f: aload 1
      // 1a0: aload 3
      // 1a1: bipush 12
      // 1a3: bipush 10
      // 1a5: iload 5
      // 1a7: bipush 12
      // 1a9: bipush 11
      // 1ab: iload 5
      // 1ad: getstatic ox_.laa Le0x;
      // 1b0: invokevirtual e0x.l4i ()Lzfz;
      // 1b3: getstatic ox_.laa Le0x;
      // 1b6: invokevirtual e0x.l4i ()Lzfz;
      // 1b9: bipush 0
      // 1ba: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1bd: aload 0
      // 1be: aload 1
      // 1bf: getstatic ox_.cbk Le0x;
      // 1c2: invokevirtual e0x.l4i ()Lzfz;
      // 1c5: iload 5
      // 1c7: bipush 13
      // 1c9: bipush 0
      // 1ca: aload 3
      // 1cb: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1ce: aload 0
      // 1cf: aload 1
      // 1d0: getstatic ox_.cbk Le0x;
      // 1d3: invokevirtual e0x.l4i ()Lzfz;
      // 1d6: iload 5
      // 1d8: bipush 13
      // 1da: bipush 12
      // 1dc: aload 3
      // 1dd: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1e0: aload 0
      // 1e1: aload 1
      // 1e2: getstatic ox_.cbk Le0x;
      // 1e5: invokevirtual e0x.l4i ()Lzfz;
      // 1e8: bipush 0
      // 1e9: bipush 13
      // 1eb: iload 5
      // 1ed: aload 3
      // 1ee: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1f1: aload 0
      // 1f2: aload 1
      // 1f3: getstatic ox_.cbk Le0x;
      // 1f6: invokevirtual e0x.l4i ()Lzfz;
      // 1f9: bipush 12
      // 1fb: bipush 13
      // 1fd: iload 5
      // 1ff: aload 3
      // 200: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 203: aload 0
      // 204: aload 1
      // 205: getstatic ox_.laa Le0x;
      // 208: invokevirtual e0x.l4i ()Lzfz;
      // 20b: iload 5
      // 20d: bipush 1
      // 20e: iadd
      // 20f: bipush 13
      // 211: bipush 0
      // 212: aload 3
      // 213: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 216: aload 0
      // 217: aload 1
      // 218: getstatic ox_.laa Le0x;
      // 21b: invokevirtual e0x.l4i ()Lzfz;
      // 21e: iload 5
      // 220: bipush 1
      // 221: iadd
      // 222: bipush 13
      // 224: bipush 12
      // 226: aload 3
      // 227: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 22a: aload 0
      // 22b: aload 1
      // 22c: getstatic ox_.laa Le0x;
      // 22f: invokevirtual e0x.l4i ()Lzfz;
      // 232: bipush 0
      // 233: bipush 13
      // 235: iload 5
      // 237: bipush 1
      // 238: iadd
      // 239: aload 3
      // 23a: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 23d: aload 0
      // 23e: aload 1
      // 23f: getstatic ox_.laa Le0x;
      // 242: invokevirtual e0x.l4i ()Lzfz;
      // 245: bipush 12
      // 247: bipush 13
      // 249: iload 5
      // 24b: bipush 1
      // 24c: iadd
      // 24d: aload 3
      // 24e: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 251: iinc 5 2
      // 254: aload 4
      // 256: ifnull 2a7
      // 259: aload 4
      // 25b: ifnonnull 13e
      // 25e: goto 265
      // 261: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 264: athrow
      // 265: aload 0
      // 266: aload 1
      // 267: getstatic ox_.laa Le0x;
      // 26a: invokevirtual e0x.l4i ()Lzfz;
      // 26d: bipush 0
      // 26e: bipush 13
      // 270: bipush 0
      // 271: aload 3
      // 272: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 275: aload 0
      // 276: aload 1
      // 277: getstatic ox_.laa Le0x;
      // 27a: invokevirtual e0x.l4i ()Lzfz;
      // 27d: bipush 0
      // 27e: bipush 13
      // 280: bipush 12
      // 282: aload 3
      // 283: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 286: aload 0
      // 287: aload 1
      // 288: getstatic ox_.laa Le0x;
      // 28b: invokevirtual e0x.l4i ()Lzfz;
      // 28e: bipush 0
      // 28f: bipush 13
      // 291: bipush 0
      // 292: aload 3
      // 293: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 296: aload 0
      // 297: aload 1
      // 298: getstatic ox_.laa Le0x;
      // 29b: invokevirtual e0x.l4i ()Lzfz;
      // 29e: bipush 12
      // 2a0: bipush 13
      // 2a2: bipush 0
      // 2a3: aload 3
      // 2a4: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2a7: bipush 3
      // 2a8: istore 5
      // 2aa: iload 5
      // 2ac: bipush 9
      // 2ae: if_icmpgt 301
      // 2b1: aload 0
      // 2b2: aload 1
      // 2b3: aload 3
      // 2b4: bipush 1
      // 2b5: bipush 7
      // 2b7: iload 5
      // 2b9: bipush 1
      // 2ba: bipush 8
      // 2bc: iload 5
      // 2be: getstatic ox_.laa Le0x;
      // 2c1: invokevirtual e0x.l4i ()Lzfz;
      // 2c4: getstatic ox_.laa Le0x;
      // 2c7: invokevirtual e0x.l4i ()Lzfz;
      // 2ca: bipush 0
      // 2cb: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2ce: aload 0
      // 2cf: aload 1
      // 2d0: aload 3
      // 2d1: bipush 11
      // 2d3: bipush 7
      // 2d5: iload 5
      // 2d7: bipush 11
      // 2d9: bipush 8
      // 2db: iload 5
      // 2dd: getstatic ox_.laa Le0x;
      // 2e0: invokevirtual e0x.l4i ()Lzfz;
      // 2e3: getstatic ox_.laa Le0x;
      // 2e6: invokevirtual e0x.l4i ()Lzfz;
      // 2e9: bipush 0
      // 2ea: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2ed: iinc 5 2
      // 2f0: aload 4
      // 2f2: ifnull 30b
      // 2f5: aload 4
      // 2f7: ifnonnull 2aa
      // 2fa: goto 301
      // 2fd: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 300: athrow
      // 301: aload 0
      // 302: getstatic ox_.aek Le0x;
      // 305: bipush 3
      // 306: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.ujv (Le0x;I)I
      // 309: istore 5
      // 30b: bipush 0
      // 30c: istore 6
      // 30e: iload 6
      // 310: bipush 6
      // 312: if_icmpgt 438
      // 315: iload 6
      // 317: bipush 4
      // 318: iadd
      // 319: istore 7
      // 31b: bipush 5
      // 31c: aload 4
      // 31e: ifnull 439
      // 321: istore 8
      // 323: iload 8
      // 325: bipush 7
      // 327: if_icmpgt 354
      // 32a: aload 0
      // 32b: aload 1
      // 32c: getstatic ox_.aek Le0x;
      // 32f: iload 5
      // 331: invokevirtual e0x.kig (I)Lzfz;
      // 334: iload 8
      // 336: bipush 5
      // 337: iload 6
      // 339: iadd
      // 33a: iload 7
      // 33c: aload 3
      // 33d: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 340: iinc 8 1
      // 343: aload 4
      // 345: ifnull 3ab
      // 348: aload 4
      // 34a: ifnonnull 323
      // 34d: goto 354
      // 350: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 353: athrow
      // 354: iload 7
      // 356: bipush 5
      // 357: aload 4
      // 359: ifnull 3af
      // 35c: if_icmplt 3ab
      // 35f: goto 366
      // 362: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 365: athrow
      // 366: iload 7
      // 368: bipush 8
      // 36a: aload 4
      // 36c: ifnull 3af
      // 36f: goto 376
      // 372: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 375: athrow
      // 376: if_icmpgt 3ab
      // 379: goto 380
      // 37c: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 37f: athrow
      // 380: aload 0
      // 381: aload 1
      // 382: aload 3
      // 383: bipush 5
      // 384: bipush 5
      // 385: iload 7
      // 387: bipush 7
      // 389: iload 6
      // 38b: bipush 4
      // 38c: iadd
      // 38d: iload 7
      // 38f: getstatic ox_.cbk Le0x;
      // 392: invokevirtual e0x.l4i ()Lzfz;
      // 395: getstatic ox_.cbk Le0x;
      // 398: invokevirtual e0x.l4i ()Lzfz;
      // 39b: bipush 0
      // 39c: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 39f: aload 4
      // 3a1: ifnonnull 3ff
      // 3a4: goto 3ab
      // 3a7: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 3aa: athrow
      // 3ab: iload 7
      // 3ad: bipush 9
      // 3af: aload 4
      // 3b1: ifnull 402
      // 3b4: if_icmplt 3ff
      // 3b7: goto 3be
      // 3ba: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 3bd: athrow
      // 3be: iload 7
      // 3c0: bipush 10
      // 3c2: aload 4
      // 3c4: ifnull 402
      // 3c7: goto 3ce
      // 3ca: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 3cd: athrow
      // 3ce: if_icmpgt 3ff
      // 3d1: goto 3d8
      // 3d4: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 3d7: athrow
      // 3d8: aload 0
      // 3d9: aload 1
      // 3da: aload 3
      // 3db: bipush 5
      // 3dc: bipush 8
      // 3de: iload 7
      // 3e0: bipush 7
      // 3e2: iload 6
      // 3e4: bipush 4
      // 3e5: iadd
      // 3e6: iload 7
      // 3e8: getstatic ox_.cbk Le0x;
      // 3eb: invokevirtual e0x.l4i ()Lzfz;
      // 3ee: getstatic ox_.cbk Le0x;
      // 3f1: invokevirtual e0x.l4i ()Lzfz;
      // 3f4: bipush 0
      // 3f5: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3f8: goto 3ff
      // 3fb: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 3fe: athrow
      // 3ff: iload 6
      // 401: bipush 1
      // 402: if_icmplt 430
      // 405: aload 0
      // 406: aload 1
      // 407: aload 3
      // 408: bipush 5
      // 409: bipush 6
      // 40b: iload 6
      // 40d: iadd
      // 40e: iload 7
      // 410: bipush 7
      // 412: bipush 9
      // 414: iload 6
      // 416: iadd
      // 417: iload 7
      // 419: getstatic ox_.ibw Le0x;
      // 41c: invokevirtual e0x.l4i ()Lzfz;
      // 41f: getstatic ox_.ibw Le0x;
      // 422: invokevirtual e0x.l4i ()Lzfz;
      // 425: bipush 0
      // 426: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 429: goto 430
      // 42c: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 42f: athrow
      // 430: iinc 6 1
      // 433: aload 4
      // 435: ifnonnull 30e
      // 438: bipush 5
      // 439: istore 6
      // 43b: iload 6
      // 43d: bipush 7
      // 43f: if_icmpgt 46a
      // 442: aload 0
      // 443: aload 1
      // 444: getstatic ox_.aek Le0x;
      // 447: iload 5
      // 449: invokevirtual e0x.kig (I)Lzfz;
      // 44c: iload 6
      // 44e: bipush 12
      // 450: bipush 11
      // 452: aload 3
      // 453: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 456: iinc 6 1
      // 459: aload 4
      // 45b: ifnull 570
      // 45e: aload 4
      // 460: ifnonnull 43b
      // 463: goto 46a
      // 466: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 469: athrow
      // 46a: aload 0
      // 46b: aload 1
      // 46c: aload 3
      // 46d: bipush 5
      // 46e: bipush 6
      // 470: bipush 7
      // 472: bipush 5
      // 473: bipush 7
      // 475: bipush 7
      // 477: getstatic ox_.laa Le0x;
      // 47a: invokevirtual e0x.l4i ()Lzfz;
      // 47d: getstatic ox_.laa Le0x;
      // 480: invokevirtual e0x.l4i ()Lzfz;
      // 483: bipush 0
      // 484: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 487: aload 0
      // 488: aload 1
      // 489: aload 3
      // 48a: bipush 7
      // 48c: bipush 6
      // 48e: bipush 7
      // 490: bipush 7
      // 492: bipush 7
      // 494: bipush 7
      // 496: getstatic ox_.laa Le0x;
      // 499: invokevirtual e0x.l4i ()Lzfz;
      // 49c: getstatic ox_.laa Le0x;
      // 49f: invokevirtual e0x.l4i ()Lzfz;
      // 4a2: bipush 0
      // 4a3: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 4a6: aload 0
      // 4a7: aload 1
      // 4a8: aload 3
      // 4a9: bipush 5
      // 4aa: bipush 13
      // 4ac: bipush 12
      // 4ae: bipush 7
      // 4b0: bipush 13
      // 4b2: bipush 12
      // 4b4: getstatic ox_.ibw Le0x;
      // 4b7: invokevirtual e0x.l4i ()Lzfz;
      // 4ba: getstatic ox_.ibw Le0x;
      // 4bd: invokevirtual e0x.l4i ()Lzfz;
      // 4c0: bipush 0
      // 4c1: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 4c4: aload 0
      // 4c5: aload 1
      // 4c6: aload 3
      // 4c7: bipush 2
      // 4c8: bipush 5
      // 4c9: bipush 2
      // 4ca: bipush 3
      // 4cb: bipush 5
      // 4cc: bipush 3
      // 4cd: getstatic ox_.cbk Le0x;
      // 4d0: invokevirtual e0x.l4i ()Lzfz;
      // 4d3: getstatic ox_.cbk Le0x;
      // 4d6: invokevirtual e0x.l4i ()Lzfz;
      // 4d9: bipush 0
      // 4da: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 4dd: aload 0
      // 4de: aload 1
      // 4df: aload 3
      // 4e0: bipush 2
      // 4e1: bipush 5
      // 4e2: bipush 9
      // 4e4: bipush 3
      // 4e5: bipush 5
      // 4e6: bipush 10
      // 4e8: getstatic ox_.cbk Le0x;
      // 4eb: invokevirtual e0x.l4i ()Lzfz;
      // 4ee: getstatic ox_.cbk Le0x;
      // 4f1: invokevirtual e0x.l4i ()Lzfz;
      // 4f4: bipush 0
      // 4f5: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 4f8: aload 0
      // 4f9: aload 1
      // 4fa: aload 3
      // 4fb: bipush 2
      // 4fc: bipush 5
      // 4fd: bipush 4
      // 4fe: bipush 2
      // 4ff: bipush 5
      // 500: bipush 8
      // 502: getstatic ox_.cbk Le0x;
      // 505: invokevirtual e0x.l4i ()Lzfz;
      // 508: getstatic ox_.cbk Le0x;
      // 50b: invokevirtual e0x.l4i ()Lzfz;
      // 50e: bipush 0
      // 50f: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 512: aload 0
      // 513: aload 1
      // 514: aload 3
      // 515: bipush 9
      // 517: bipush 5
      // 518: bipush 2
      // 519: bipush 10
      // 51b: bipush 5
      // 51c: bipush 3
      // 51d: getstatic ox_.cbk Le0x;
      // 520: invokevirtual e0x.l4i ()Lzfz;
      // 523: getstatic ox_.cbk Le0x;
      // 526: invokevirtual e0x.l4i ()Lzfz;
      // 529: bipush 0
      // 52a: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 52d: aload 0
      // 52e: aload 1
      // 52f: aload 3
      // 530: bipush 9
      // 532: bipush 5
      // 533: bipush 9
      // 535: bipush 10
      // 537: bipush 5
      // 538: bipush 10
      // 53a: getstatic ox_.cbk Le0x;
      // 53d: invokevirtual e0x.l4i ()Lzfz;
      // 540: getstatic ox_.cbk Le0x;
      // 543: invokevirtual e0x.l4i ()Lzfz;
      // 546: bipush 0
      // 547: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 54a: aload 0
      // 54b: aload 1
      // 54c: aload 3
      // 54d: bipush 10
      // 54f: bipush 5
      // 550: bipush 4
      // 551: bipush 10
      // 553: bipush 5
      // 554: bipush 8
      // 556: getstatic ox_.cbk Le0x;
      // 559: invokevirtual e0x.l4i ()Lzfz;
      // 55c: getstatic ox_.cbk Le0x;
      // 55f: invokevirtual e0x.l4i ()Lzfz;
      // 562: bipush 0
      // 563: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 566: aload 0
      // 567: getstatic ox_.aek Le0x;
      // 56a: bipush 0
      // 56b: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.ujv (Le0x;I)I
      // 56e: istore 6
      // 570: aload 0
      // 571: getstatic ox_.aek Le0x;
      // 574: bipush 1
      // 575: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.ujv (Le0x;I)I
      // 578: istore 7
      // 57a: aload 0
      // 57b: aload 1
      // 57c: getstatic ox_.aek Le0x;
      // 57f: iload 7
      // 581: invokevirtual e0x.kig (I)Lzfz;
      // 584: bipush 4
      // 585: bipush 5
      // 586: bipush 2
      // 587: aload 3
      // 588: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 58b: aload 0
      // 58c: aload 1
      // 58d: getstatic ox_.aek Le0x;
      // 590: iload 7
      // 592: invokevirtual e0x.kig (I)Lzfz;
      // 595: bipush 4
      // 596: bipush 5
      // 597: bipush 3
      // 598: aload 3
      // 599: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 59c: aload 0
      // 59d: aload 1
      // 59e: getstatic ox_.aek Le0x;
      // 5a1: iload 7
      // 5a3: invokevirtual e0x.kig (I)Lzfz;
      // 5a6: bipush 4
      // 5a7: bipush 5
      // 5a8: bipush 9
      // 5aa: aload 3
      // 5ab: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5ae: aload 0
      // 5af: aload 1
      // 5b0: getstatic ox_.aek Le0x;
      // 5b3: iload 7
      // 5b5: invokevirtual e0x.kig (I)Lzfz;
      // 5b8: bipush 4
      // 5b9: bipush 5
      // 5ba: bipush 10
      // 5bc: aload 3
      // 5bd: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5c0: aload 0
      // 5c1: aload 1
      // 5c2: getstatic ox_.aek Le0x;
      // 5c5: iload 6
      // 5c7: invokevirtual e0x.kig (I)Lzfz;
      // 5ca: bipush 8
      // 5cc: bipush 5
      // 5cd: bipush 2
      // 5ce: aload 3
      // 5cf: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5d2: aload 0
      // 5d3: aload 1
      // 5d4: getstatic ox_.aek Le0x;
      // 5d7: iload 6
      // 5d9: invokevirtual e0x.kig (I)Lzfz;
      // 5dc: bipush 8
      // 5de: bipush 5
      // 5df: bipush 3
      // 5e0: aload 3
      // 5e1: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5e4: aload 0
      // 5e5: aload 1
      // 5e6: getstatic ox_.aek Le0x;
      // 5e9: iload 6
      // 5eb: invokevirtual e0x.kig (I)Lzfz;
      // 5ee: bipush 8
      // 5f0: bipush 5
      // 5f1: bipush 9
      // 5f3: aload 3
      // 5f4: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5f7: aload 0
      // 5f8: aload 1
      // 5f9: getstatic ox_.aek Le0x;
      // 5fc: iload 6
      // 5fe: invokevirtual e0x.kig (I)Lzfz;
      // 601: bipush 8
      // 603: bipush 5
      // 604: bipush 10
      // 606: aload 3
      // 607: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 60a: aload 0
      // 60b: aload 1
      // 60c: aload 3
      // 60d: bipush 3
      // 60e: bipush 4
      // 60f: bipush 4
      // 610: bipush 4
      // 611: bipush 4
      // 612: bipush 8
      // 614: getstatic ox_.p58 Le0x;
      // 617: invokevirtual e0x.l4i ()Lzfz;
      // 61a: getstatic ox_.p58 Le0x;
      // 61d: invokevirtual e0x.l4i ()Lzfz;
      // 620: bipush 0
      // 621: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 624: aload 0
      // 625: aload 1
      // 626: aload 3
      // 627: bipush 8
      // 629: bipush 4
      // 62a: bipush 4
      // 62b: bipush 9
      // 62d: bipush 4
      // 62e: bipush 8
      // 630: getstatic ox_.p58 Le0x;
      // 633: invokevirtual e0x.l4i ()Lzfz;
      // 636: getstatic ox_.p58 Le0x;
      // 639: invokevirtual e0x.l4i ()Lzfz;
      // 63c: bipush 0
      // 63d: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 640: aload 0
      // 641: aload 1
      // 642: aload 3
      // 643: bipush 3
      // 644: bipush 5
      // 645: bipush 4
      // 646: bipush 4
      // 647: bipush 5
      // 648: bipush 8
      // 64a: getstatic ox_.ihc Le0x;
      // 64d: invokevirtual e0x.l4i ()Lzfz;
      // 650: getstatic ox_.ihc Le0x;
      // 653: invokevirtual e0x.l4i ()Lzfz;
      // 656: bipush 0
      // 657: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 65a: aload 0
      // 65b: aload 1
      // 65c: aload 3
      // 65d: bipush 8
      // 65f: bipush 5
      // 660: bipush 4
      // 661: bipush 9
      // 663: bipush 5
      // 664: bipush 8
      // 666: getstatic ox_.ihc Le0x;
      // 669: invokevirtual e0x.l4i ()Lzfz;
      // 66c: getstatic ox_.ihc Le0x;
      // 66f: invokevirtual e0x.l4i ()Lzfz;
      // 672: bipush 0
      // 673: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 676: aload 0
      // 677: aload 1
      // 678: aload 3
      // 679: bipush 4
      // 67a: bipush 2
      // 67b: bipush 0
      // 67c: bipush 8
      // 67e: bipush 2
      // 67f: bipush 12
      // 681: getstatic ox_.cbk Le0x;
      // 684: invokevirtual e0x.l4i ()Lzfz;
      // 687: getstatic ox_.cbk Le0x;
      // 68a: invokevirtual e0x.l4i ()Lzfz;
      // 68d: bipush 0
      // 68e: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 691: aload 0
      // 692: aload 1
      // 693: aload 3
      // 694: bipush 0
      // 695: bipush 2
      // 696: bipush 4
      // 697: bipush 12
      // 699: bipush 2
      // 69a: bipush 8
      // 69c: getstatic ox_.cbk Le0x;
      // 69f: invokevirtual e0x.l4i ()Lzfz;
      // 6a2: getstatic ox_.cbk Le0x;
      // 6a5: invokevirtual e0x.l4i ()Lzfz;
      // 6a8: bipush 0
      // 6a9: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 6ac: aload 0
      // 6ad: aload 1
      // 6ae: aload 3
      // 6af: bipush 4
      // 6b0: bipush 0
      // 6b1: bipush 0
      // 6b2: bipush 8
      // 6b4: bipush 1
      // 6b5: bipush 3
      // 6b6: getstatic ox_.cbk Le0x;
      // 6b9: invokevirtual e0x.l4i ()Lzfz;
      // 6bc: getstatic ox_.cbk Le0x;
      // 6bf: invokevirtual e0x.l4i ()Lzfz;
      // 6c2: bipush 0
      // 6c3: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 6c6: aload 0
      // 6c7: aload 1
      // 6c8: aload 3
      // 6c9: bipush 4
      // 6ca: bipush 0
      // 6cb: bipush 9
      // 6cd: bipush 8
      // 6cf: bipush 1
      // 6d0: bipush 12
      // 6d2: getstatic ox_.cbk Le0x;
      // 6d5: invokevirtual e0x.l4i ()Lzfz;
      // 6d8: getstatic ox_.cbk Le0x;
      // 6db: invokevirtual e0x.l4i ()Lzfz;
      // 6de: bipush 0
      // 6df: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 6e2: aload 0
      // 6e3: aload 1
      // 6e4: aload 3
      // 6e5: bipush 0
      // 6e6: bipush 0
      // 6e7: bipush 4
      // 6e8: bipush 3
      // 6e9: bipush 1
      // 6ea: bipush 8
      // 6ec: getstatic ox_.cbk Le0x;
      // 6ef: invokevirtual e0x.l4i ()Lzfz;
      // 6f2: getstatic ox_.cbk Le0x;
      // 6f5: invokevirtual e0x.l4i ()Lzfz;
      // 6f8: bipush 0
      // 6f9: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 6fc: aload 0
      // 6fd: aload 1
      // 6fe: aload 3
      // 6ff: bipush 9
      // 701: bipush 0
      // 702: bipush 4
      // 703: bipush 12
      // 705: bipush 1
      // 706: bipush 8
      // 708: getstatic ox_.cbk Le0x;
      // 70b: invokevirtual e0x.l4i ()Lzfz;
      // 70e: getstatic ox_.cbk Le0x;
      // 711: invokevirtual e0x.l4i ()Lzfz;
      // 714: bipush 0
      // 715: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 718: bipush 4
      // 719: istore 8
      // 71b: iload 8
      // 71d: bipush 8
      // 71f: if_icmpgt 771
      // 722: bipush 0
      // 723: aload 4
      // 725: ifnull 772
      // 728: istore 9
      // 72a: iload 9
      // 72c: bipush 2
      // 72d: if_icmpgt 769
      // 730: aload 0
      // 731: aload 1
      // 732: getstatic ox_.cbk Le0x;
      // 735: invokevirtual e0x.l4i ()Lzfz;
      // 738: iload 8
      // 73a: bipush -1
      // 73b: iload 9
      // 73d: aload 3
      // 73e: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.doc (Lt9d;Lzfz;IIILyve;)V
      // 741: aload 0
      // 742: aload 1
      // 743: getstatic ox_.cbk Le0x;
      // 746: invokevirtual e0x.l4i ()Lzfz;
      // 749: iload 8
      // 74b: bipush -1
      // 74c: bipush 12
      // 74e: iload 9
      // 750: isub
      // 751: aload 3
      // 752: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.doc (Lt9d;Lzfz;IIILyve;)V
      // 755: iinc 9 1
      // 758: aload 4
      // 75a: ifnull 76c
      // 75d: aload 4
      // 75f: ifnonnull 72a
      // 762: goto 769
      // 765: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 768: athrow
      // 769: iinc 8 1
      // 76c: aload 4
      // 76e: ifnonnull 71b
      // 771: bipush 0
      // 772: istore 8
      // 774: iload 8
      // 776: bipush 2
      // 777: if_icmpgt 7ca
      // 77a: bipush 4
      // 77b: aload 4
      // 77d: ifnull 7cb
      // 780: istore 9
      // 782: iload 9
      // 784: bipush 8
      // 786: if_icmpgt 7c2
      // 789: aload 0
      // 78a: aload 1
      // 78b: getstatic ox_.cbk Le0x;
      // 78e: invokevirtual e0x.l4i ()Lzfz;
      // 791: iload 8
      // 793: bipush -1
      // 794: iload 9
      // 796: aload 3
      // 797: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.doc (Lt9d;Lzfz;IIILyve;)V
      // 79a: aload 0
      // 79b: aload 1
      // 79c: getstatic ox_.cbk Le0x;
      // 79f: invokevirtual e0x.l4i ()Lzfz;
      // 7a2: bipush 12
      // 7a4: iload 8
      // 7a6: isub
      // 7a7: bipush -1
      // 7a8: iload 9
      // 7aa: aload 3
      // 7ab: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.doc (Lt9d;Lzfz;IIILyve;)V
      // 7ae: iinc 9 1
      // 7b1: aload 4
      // 7b3: ifnull 7c5
      // 7b6: aload 4
      // 7b8: ifnonnull 782
      // 7bb: goto 7c2
      // 7be: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 7c1: athrow
      // 7c2: iinc 8 1
      // 7c5: aload 4
      // 7c7: ifnonnull 774
      // 7ca: bipush 1
      // 7cb: invokestatic EntityLivingBase.b ()[Li2h;
      // 7ce: ifnull 7df
      // 7d1: bipush 2
      // 7d2: anewarray 106
      // 7d5: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ([Li2h;)V
      // 7d8: goto 7df
      // 7db: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$NetherStalkRoom.a (Loov;)Loov;
      // 7de: athrow
      // 7df: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
