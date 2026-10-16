package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureNetherBridgePieces$Corridor3 extends StructureNetherBridgePieces$Piece {
   public StructureNetherBridgePieces$Corridor3() {
   }

   public StructureNetherBridgePieces$Corridor3(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.yqm = var3;
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      this.d3x((StructureNetherBridgePieces$Start)var1, var2, var3, 1, 0, true);
   }

   public static StructureNetherBridgePieces$Corridor3 lne(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 04: bipush -1
      // 05: bipush -7
      // 07: bipush 0
      // 08: bipush 5
      // 09: bipush 14
      // 0b: bipush 10
      // 0d: aload 5
      // 0f: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 12: astore 7
      // 14: aload 7
      // 16: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.ulp (Lyve;)Z
      // 19: ifeq 41
      // 1c: aload 0
      // 1d: aload 7
      // 1f: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 22: ifnonnull 41
      // 25: goto 2c
      // 28: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.a (Loov;)Loov;
      // 2b: athrow
      // 2c: new net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3
      // 2f: dup
      // 30: iload 6
      // 32: aload 1
      // 33: aload 7
      // 35: aload 5
      // 37: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3a: goto 42
      // 3d: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.a (Loov;)Loov;
      // 40: athrow
      // 41: aconst_null
      // 42: areturn
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
      // 001: getstatic ox_.aek Le0x;
      // 004: bipush 2
      // 005: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.ujv (Le0x;I)I
      // 008: istore 5
      // 00a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 00d: bipush 0
      // 00e: istore 6
      // 010: astore 4
      // 012: iload 6
      // 014: bipush 9
      // 016: if_icmpgt 1ce
      // 019: bipush 1
      // 01a: bipush 7
      // 01c: iload 6
      // 01e: isub
      // 01f: invokestatic java/lang/Math.max (II)I
      // 022: istore 7
      // 024: iload 7
      // 026: bipush 5
      // 027: iadd
      // 028: bipush 14
      // 02a: iload 6
      // 02c: isub
      // 02d: invokestatic java/lang/Math.max (II)I
      // 030: bipush 13
      // 032: invokestatic java/lang/Math.min (II)I
      // 035: istore 8
      // 037: iload 6
      // 039: istore 9
      // 03b: aload 0
      // 03c: aload 1
      // 03d: aload 3
      // 03e: bipush 0
      // 03f: bipush 0
      // 040: iload 6
      // 042: bipush 4
      // 043: iload 7
      // 045: iload 6
      // 047: getstatic ox_.cbk Le0x;
      // 04a: invokevirtual e0x.l4i ()Lzfz;
      // 04d: getstatic ox_.cbk Le0x;
      // 050: invokevirtual e0x.l4i ()Lzfz;
      // 053: bipush 0
      // 054: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 057: aload 0
      // 058: aload 1
      // 059: aload 3
      // 05a: bipush 1
      // 05b: iload 7
      // 05d: bipush 1
      // 05e: iadd
      // 05f: iload 6
      // 061: bipush 3
      // 062: iload 8
      // 064: bipush 1
      // 065: isub
      // 066: iload 6
      // 068: getstatic ox_.ibw Le0x;
      // 06b: invokevirtual e0x.l4i ()Lzfz;
      // 06e: getstatic ox_.ibw Le0x;
      // 071: invokevirtual e0x.l4i ()Lzfz;
      // 074: bipush 0
      // 075: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 078: iload 6
      // 07a: aload 4
      // 07c: ifnull 1cf
      // 07f: bipush 6
      // 081: aload 4
      // 083: ifnull 13f
      // 086: goto 08d
      // 089: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.a (Loov;)Loov;
      // 08c: athrow
      // 08d: if_icmpgt 0dd
      // 090: goto 097
      // 093: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 0
      // 098: aload 1
      // 099: getstatic ox_.aek Le0x;
      // 09c: iload 5
      // 09e: invokevirtual e0x.kig (I)Lzfz;
      // 0a1: bipush 1
      // 0a2: iload 7
      // 0a4: bipush 1
      // 0a5: iadd
      // 0a6: iload 6
      // 0a8: aload 3
      // 0a9: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: getstatic ox_.aek Le0x;
      // 0b1: iload 5
      // 0b3: invokevirtual e0x.kig (I)Lzfz;
      // 0b6: bipush 2
      // 0b7: iload 7
      // 0b9: bipush 1
      // 0ba: iadd
      // 0bb: iload 6
      // 0bd: aload 3
      // 0be: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0c1: aload 0
      // 0c2: aload 1
      // 0c3: getstatic ox_.aek Le0x;
      // 0c6: iload 5
      // 0c8: invokevirtual e0x.kig (I)Lzfz;
      // 0cb: bipush 3
      // 0cc: iload 7
      // 0ce: bipush 1
      // 0cf: iadd
      // 0d0: iload 6
      // 0d2: aload 3
      // 0d3: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0d6: goto 0dd
      // 0d9: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: aload 1
      // 0df: aload 3
      // 0e0: bipush 0
      // 0e1: iload 8
      // 0e3: iload 6
      // 0e5: bipush 4
      // 0e6: iload 8
      // 0e8: iload 6
      // 0ea: getstatic ox_.cbk Le0x;
      // 0ed: invokevirtual e0x.l4i ()Lzfz;
      // 0f0: getstatic ox_.cbk Le0x;
      // 0f3: invokevirtual e0x.l4i ()Lzfz;
      // 0f6: bipush 0
      // 0f7: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0fa: aload 0
      // 0fb: aload 1
      // 0fc: aload 3
      // 0fd: bipush 0
      // 0fe: iload 7
      // 100: bipush 1
      // 101: iadd
      // 102: iload 6
      // 104: bipush 0
      // 105: iload 8
      // 107: bipush 1
      // 108: isub
      // 109: iload 6
      // 10b: getstatic ox_.cbk Le0x;
      // 10e: invokevirtual e0x.l4i ()Lzfz;
      // 111: getstatic ox_.cbk Le0x;
      // 114: invokevirtual e0x.l4i ()Lzfz;
      // 117: bipush 0
      // 118: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 11b: aload 0
      // 11c: aload 1
      // 11d: aload 3
      // 11e: bipush 4
      // 11f: iload 7
      // 121: bipush 1
      // 122: iadd
      // 123: iload 6
      // 125: bipush 4
      // 126: iload 8
      // 128: bipush 1
      // 129: isub
      // 12a: iload 6
      // 12c: getstatic ox_.cbk Le0x;
      // 12f: invokevirtual e0x.l4i ()Lzfz;
      // 132: getstatic ox_.cbk Le0x;
      // 135: invokevirtual e0x.l4i ()Lzfz;
      // 138: bipush 0
      // 139: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 13c: iload 6
      // 13e: bipush 1
      // 13f: iand
      // 140: aload 4
      // 142: ifnull 199
      // 145: ifne 198
      // 148: goto 14f
      // 14b: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.a (Loov;)Loov;
      // 14e: athrow
      // 14f: aload 0
      // 150: aload 1
      // 151: aload 3
      // 152: bipush 0
      // 153: iload 7
      // 155: bipush 2
      // 156: iadd
      // 157: iload 6
      // 159: bipush 0
      // 15a: iload 7
      // 15c: bipush 3
      // 15d: iadd
      // 15e: iload 6
      // 160: getstatic ox_.laa Le0x;
      // 163: invokevirtual e0x.l4i ()Lzfz;
      // 166: getstatic ox_.laa Le0x;
      // 169: invokevirtual e0x.l4i ()Lzfz;
      // 16c: bipush 0
      // 16d: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 170: aload 0
      // 171: aload 1
      // 172: aload 3
      // 173: bipush 4
      // 174: iload 7
      // 176: bipush 2
      // 177: iadd
      // 178: iload 6
      // 17a: bipush 4
      // 17b: iload 7
      // 17d: bipush 3
      // 17e: iadd
      // 17f: iload 6
      // 181: getstatic ox_.laa Le0x;
      // 184: invokevirtual e0x.l4i ()Lzfz;
      // 187: getstatic ox_.laa Le0x;
      // 18a: invokevirtual e0x.l4i ()Lzfz;
      // 18d: bipush 0
      // 18e: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 191: goto 198
      // 194: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.a (Loov;)Loov;
      // 197: athrow
      // 198: bipush 0
      // 199: istore 10
      // 19b: iload 10
      // 19d: bipush 4
      // 19e: if_icmpgt 1c6
      // 1a1: aload 0
      // 1a2: aload 1
      // 1a3: getstatic ox_.cbk Le0x;
      // 1a6: invokevirtual e0x.l4i ()Lzfz;
      // 1a9: iload 10
      // 1ab: bipush -1
      // 1ac: iload 9
      // 1ae: aload 3
      // 1af: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.doc (Lt9d;Lzfz;IIILyve;)V
      // 1b2: iinc 10 1
      // 1b5: aload 4
      // 1b7: ifnull 1c9
      // 1ba: aload 4
      // 1bc: ifnonnull 19b
      // 1bf: goto 1c6
      // 1c2: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor3.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: iinc 6 1
      // 1c9: aload 4
      // 1cb: ifnonnull 012
      // 1ce: bipush 1
      // 1cf: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
