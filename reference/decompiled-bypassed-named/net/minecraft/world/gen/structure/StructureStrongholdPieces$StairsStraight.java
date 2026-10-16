package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureStrongholdPieces$StairsStraight extends StructureStrongholdPieces$Stronghold {
   public StructureStrongholdPieces$StairsStraight() {
   }

   public StructureStrongholdPieces$StairsStraight(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.ppu = this.i2t(var2);
      this.yqm = var3;
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      this.bmb((StructureStrongholdPieces$Stairs2)var1, var2, var3, 1, 1);
   }

   public static StructureStrongholdPieces$StairsStraight z5x(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 09: bipush 11
      // 0b: bipush 8
      // 0d: aload 5
      // 0f: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 12: astore 7
      // 14: aload 7
      // 16: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.jty (Lyve;)Z
      // 19: ifeq 41
      // 1c: aload 0
      // 1d: aload 7
      // 1f: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 22: ifnonnull 41
      // 25: goto 2c
      // 28: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.a (Loov;)Loov;
      // 2b: athrow
      // 2c: new net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight
      // 2f: dup
      // 30: iload 6
      // 32: aload 1
      // 33: aload 7
      // 35: aload 5
      // 37: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3a: goto 42
      // 3d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.a (Loov;)Loov;
      // 40: athrow
      // 41: aconst_null
      // 42: areturn
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
      // 006: aload 1
      // 007: aload 3
      // 008: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.knc (Lt9d;Lyve;)Z
      // 00b: aload 4
      // 00d: ifnull 058
      // 010: ifeq 020
      // 013: goto 01a
      // 016: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.a (Loov;)Loov;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aload 1
      // 022: aload 3
      // 023: bipush 0
      // 024: bipush 0
      // 025: bipush 0
      // 026: bipush 4
      // 027: bipush 10
      // 029: bipush 7
      // 02b: bipush 1
      // 02c: aload 2
      // 02d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 030: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 033: aload 0
      // 034: aload 1
      // 035: aload 2
      // 036: aload 3
      // 037: aload 0
      // 038: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.ppu Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 03b: bipush 1
      // 03c: bipush 7
      // 03e: bipush 0
      // 03f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 042: aload 0
      // 043: aload 1
      // 044: aload 2
      // 045: aload 3
      // 046: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy.waj Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 049: bipush 1
      // 04a: bipush 1
      // 04b: bipush 7
      // 04d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 050: aload 0
      // 051: getstatic ox_.l3f Le0x;
      // 054: bipush 2
      // 055: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.ujv (Le0x;I)I
      // 058: istore 5
      // 05a: bipush 0
      // 05b: istore 6
      // 05d: iload 6
      // 05f: bipush 6
      // 061: if_icmpge 118
      // 064: aload 0
      // 065: aload 1
      // 066: getstatic ox_.l3f Le0x;
      // 069: iload 5
      // 06b: invokevirtual e0x.kig (I)Lzfz;
      // 06e: bipush 1
      // 06f: bipush 6
      // 071: iload 6
      // 073: isub
      // 074: bipush 1
      // 075: iload 6
      // 077: iadd
      // 078: aload 3
      // 079: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.lzy (Lt9d;Lzfz;IIILyve;)V
      // 07c: aload 0
      // 07d: aload 1
      // 07e: getstatic ox_.l3f Le0x;
      // 081: iload 5
      // 083: invokevirtual e0x.kig (I)Lzfz;
      // 086: bipush 2
      // 087: bipush 6
      // 089: iload 6
      // 08b: isub
      // 08c: bipush 1
      // 08d: iload 6
      // 08f: iadd
      // 090: aload 3
      // 091: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.lzy (Lt9d;Lzfz;IIILyve;)V
      // 094: aload 0
      // 095: aload 1
      // 096: getstatic ox_.l3f Le0x;
      // 099: iload 5
      // 09b: invokevirtual e0x.kig (I)Lzfz;
      // 09e: bipush 3
      // 09f: bipush 6
      // 0a1: iload 6
      // 0a3: isub
      // 0a4: bipush 1
      // 0a5: iload 6
      // 0a7: iadd
      // 0a8: aload 3
      // 0a9: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0ac: aload 4
      // 0ae: ifnull 113
      // 0b1: iload 6
      // 0b3: aload 4
      // 0b5: ifnull 119
      // 0b8: goto 0bf
      // 0bb: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: bipush 5
      // 0c0: if_icmpge 110
      // 0c3: goto 0ca
      // 0c6: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: aload 1
      // 0cc: getstatic ox_.ow_ Le0x;
      // 0cf: invokevirtual e0x.l4i ()Lzfz;
      // 0d2: bipush 1
      // 0d3: bipush 5
      // 0d4: iload 6
      // 0d6: isub
      // 0d7: bipush 1
      // 0d8: iload 6
      // 0da: iadd
      // 0db: aload 3
      // 0dc: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0df: aload 0
      // 0e0: aload 1
      // 0e1: getstatic ox_.ow_ Le0x;
      // 0e4: invokevirtual e0x.l4i ()Lzfz;
      // 0e7: bipush 2
      // 0e8: bipush 5
      // 0e9: iload 6
      // 0eb: isub
      // 0ec: bipush 1
      // 0ed: iload 6
      // 0ef: iadd
      // 0f0: aload 3
      // 0f1: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f4: aload 0
      // 0f5: aload 1
      // 0f6: getstatic ox_.ow_ Le0x;
      // 0f9: invokevirtual e0x.l4i ()Lzfz;
      // 0fc: bipush 3
      // 0fd: bipush 5
      // 0fe: iload 6
      // 100: isub
      // 101: bipush 1
      // 102: iload 6
      // 104: iadd
      // 105: aload 3
      // 106: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.lzy (Lt9d;Lzfz;IIILyve;)V
      // 109: goto 110
      // 10c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$StairsStraight.a (Loov;)Loov;
      // 10f: athrow
      // 110: iinc 6 1
      // 113: aload 4
      // 115: ifnonnull 05d
      // 118: bipush 1
      // 119: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
