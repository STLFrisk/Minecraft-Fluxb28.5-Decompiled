package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureStrongholdPieces$Prison extends StructureStrongholdPieces$Stronghold {
   public StructureStrongholdPieces$Prison() {
   }

   public StructureStrongholdPieces$Prison(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.ppu = this.i2t(var2);
      this.yqm = var3;
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      this.bmb((StructureStrongholdPieces$Stairs2)var1, var2, var3, 1, 1);
   }

   public static StructureStrongholdPieces$Prison g_b(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 05: bipush -1
      // 06: bipush 0
      // 07: bipush 9
      // 09: bipush 5
      // 0a: bipush 11
      // 0c: aload 5
      // 0e: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 11: astore 7
      // 13: aload 7
      // 15: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.jty (Lyve;)Z
      // 18: ifeq 40
      // 1b: aload 0
      // 1c: aload 7
      // 1e: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 21: ifnonnull 40
      // 24: goto 2b
      // 27: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.a (Loov;)Loov;
      // 2a: athrow
      // 2b: new net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison
      // 2e: dup
      // 2f: iload 6
      // 31: aload 1
      // 32: aload 7
      // 34: aload 5
      // 36: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 39: goto 41
      // 3c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.a (Loov;)Loov;
      // 3f: athrow
      // 40: aconst_null
      // 41: areturn
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
      // 008: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.knc (Lt9d;Lyve;)Z
      // 00b: aload 4
      // 00d: ifnull 15c
      // 010: ifeq 020
      // 013: goto 01a
      // 016: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.a (Loov;)Loov;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aload 1
      // 022: aload 3
      // 023: bipush 0
      // 024: bipush 0
      // 025: bipush 0
      // 026: bipush 8
      // 028: bipush 4
      // 029: bipush 10
      // 02b: bipush 1
      // 02c: aload 2
      // 02d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 030: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 033: aload 0
      // 034: aload 1
      // 035: aload 2
      // 036: aload 3
      // 037: aload 0
      // 038: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.ppu Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 03b: bipush 1
      // 03c: bipush 1
      // 03d: bipush 0
      // 03e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 041: aload 0
      // 042: aload 1
      // 043: aload 3
      // 044: bipush 1
      // 045: bipush 1
      // 046: bipush 10
      // 048: bipush 3
      // 049: bipush 3
      // 04a: bipush 10
      // 04c: getstatic ox_.ibw Le0x;
      // 04f: invokevirtual e0x.l4i ()Lzfz;
      // 052: getstatic ox_.ibw Le0x;
      // 055: invokevirtual e0x.l4i ()Lzfz;
      // 058: bipush 0
      // 059: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 05c: aload 0
      // 05d: aload 1
      // 05e: aload 3
      // 05f: bipush 4
      // 060: bipush 1
      // 061: bipush 1
      // 062: bipush 4
      // 063: bipush 3
      // 064: bipush 1
      // 065: bipush 0
      // 066: aload 2
      // 067: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 06a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 06d: aload 0
      // 06e: aload 1
      // 06f: aload 3
      // 070: bipush 4
      // 071: bipush 1
      // 072: bipush 3
      // 073: bipush 4
      // 074: bipush 3
      // 075: bipush 3
      // 076: bipush 0
      // 077: aload 2
      // 078: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 07b: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 07e: aload 0
      // 07f: aload 1
      // 080: aload 3
      // 081: bipush 4
      // 082: bipush 1
      // 083: bipush 7
      // 085: bipush 4
      // 086: bipush 3
      // 087: bipush 7
      // 089: bipush 0
      // 08a: aload 2
      // 08b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 08e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 091: aload 0
      // 092: aload 1
      // 093: aload 3
      // 094: bipush 4
      // 095: bipush 1
      // 096: bipush 9
      // 098: bipush 4
      // 099: bipush 3
      // 09a: bipush 9
      // 09c: bipush 0
      // 09d: aload 2
      // 09e: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 0a1: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 0a4: aload 0
      // 0a5: aload 1
      // 0a6: aload 3
      // 0a7: bipush 4
      // 0a8: bipush 1
      // 0a9: bipush 4
      // 0aa: bipush 4
      // 0ab: bipush 3
      // 0ac: bipush 6
      // 0ae: getstatic ox_.ytr Le0x;
      // 0b1: invokevirtual e0x.l4i ()Lzfz;
      // 0b4: getstatic ox_.ytr Le0x;
      // 0b7: invokevirtual e0x.l4i ()Lzfz;
      // 0ba: bipush 0
      // 0bb: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0be: aload 0
      // 0bf: aload 1
      // 0c0: aload 3
      // 0c1: bipush 5
      // 0c2: bipush 1
      // 0c3: bipush 5
      // 0c4: bipush 7
      // 0c6: bipush 3
      // 0c7: bipush 5
      // 0c8: getstatic ox_.ytr Le0x;
      // 0cb: invokevirtual e0x.l4i ()Lzfz;
      // 0ce: getstatic ox_.ytr Le0x;
      // 0d1: invokevirtual e0x.l4i ()Lzfz;
      // 0d4: bipush 0
      // 0d5: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0d8: aload 0
      // 0d9: aload 1
      // 0da: getstatic ox_.ytr Le0x;
      // 0dd: invokevirtual e0x.l4i ()Lzfz;
      // 0e0: bipush 4
      // 0e1: bipush 3
      // 0e2: bipush 2
      // 0e3: aload 3
      // 0e4: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0e7: aload 0
      // 0e8: aload 1
      // 0e9: getstatic ox_.ytr Le0x;
      // 0ec: invokevirtual e0x.l4i ()Lzfz;
      // 0ef: bipush 4
      // 0f0: bipush 3
      // 0f1: bipush 8
      // 0f3: aload 3
      // 0f4: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f7: aload 0
      // 0f8: aload 1
      // 0f9: getstatic ox_.oof Le0x;
      // 0fc: aload 0
      // 0fd: getstatic ox_.oof Le0x;
      // 100: bipush 3
      // 101: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.ujv (Le0x;I)I
      // 104: invokevirtual e0x.kig (I)Lzfz;
      // 107: bipush 4
      // 108: bipush 1
      // 109: bipush 2
      // 10a: aload 3
      // 10b: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.lzy (Lt9d;Lzfz;IIILyve;)V
      // 10e: aload 0
      // 10f: aload 1
      // 110: getstatic ox_.oof Le0x;
      // 113: aload 0
      // 114: getstatic ox_.oof Le0x;
      // 117: bipush 3
      // 118: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.ujv (Le0x;I)I
      // 11b: bipush 8
      // 11d: iadd
      // 11e: invokevirtual e0x.kig (I)Lzfz;
      // 121: bipush 4
      // 122: bipush 2
      // 123: bipush 2
      // 124: aload 3
      // 125: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.lzy (Lt9d;Lzfz;IIILyve;)V
      // 128: aload 0
      // 129: aload 1
      // 12a: getstatic ox_.oof Le0x;
      // 12d: aload 0
      // 12e: getstatic ox_.oof Le0x;
      // 131: bipush 3
      // 132: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.ujv (Le0x;I)I
      // 135: invokevirtual e0x.kig (I)Lzfz;
      // 138: bipush 4
      // 139: bipush 1
      // 13a: bipush 8
      // 13c: aload 3
      // 13d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.lzy (Lt9d;Lzfz;IIILyve;)V
      // 140: aload 0
      // 141: aload 1
      // 142: getstatic ox_.oof Le0x;
      // 145: aload 0
      // 146: getstatic ox_.oof Le0x;
      // 149: bipush 3
      // 14a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.ujv (Le0x;I)I
      // 14d: bipush 8
      // 14f: iadd
      // 150: invokevirtual e0x.kig (I)Lzfz;
      // 153: bipush 4
      // 154: bipush 2
      // 155: bipush 8
      // 157: aload 3
      // 158: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison.lzy (Lt9d;Lzfz;IIILyve;)V
      // 15b: bipush 1
      // 15c: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
