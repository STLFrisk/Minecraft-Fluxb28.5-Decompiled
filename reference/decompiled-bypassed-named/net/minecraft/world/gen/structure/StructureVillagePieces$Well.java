package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureVillagePieces$Well extends StructureVillagePieces$Village {
   public StructureVillagePieces$Well() {
   }

   public StructureVillagePieces$Well(StructureVillagePieces$Start param1, int param2, Random param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 6
      // 05: aload 0
      // 06: aload 1
      // 07: iload 2
      // 08: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$Village.<init> (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;I)V
      // 0b: aload 0
      // 0c: aload 6
      // 0e: ifnull 75
      // 11: getstatic vt2$unz.fzl Lvt2$unz;
      // 14: aload 3
      // 15: invokevirtual vt2$unz.cvs (Ljava/util/Random;)Lvt2;
      // 18: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Well.p7m Lvt2;
      // 1b: getstatic net/minecraft/world/gen/structure/StructureVillagePieces$1.wgx [I
      // 1e: aload 0
      // 1f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Well.p7m Lvt2;
      // 22: invokevirtual vt2.ordinal ()I
      // 25: iaload
      // 26: lookupswitch 71 2 1 26 2 26
      // 40: aload 0
      // 41: new yve
      // 44: dup
      // 45: iload 4
      // 47: bipush 64
      // 49: iload 5
      // 4b: iload 4
      // 4d: bipush 6
      // 4f: iadd
      // 50: bipush 1
      // 51: isub
      // 52: bipush 78
      // 54: iload 5
      // 56: bipush 6
      // 58: iadd
      // 59: bipush 1
      // 5a: isub
      // 5b: invokespecial yve.<init> (IIIIII)V
      // 5e: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Well.yqm Lyve;
      // 61: aload 6
      // 63: ifnonnull 95
      // 66: goto 6d
      // 69: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Well.c (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: goto 75
      // 71: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Well.c (Loov;)Loov;
      // 74: athrow
      // 75: new yve
      // 78: dup
      // 79: iload 4
      // 7b: bipush 64
      // 7d: iload 5
      // 7f: iload 4
      // 81: bipush 6
      // 83: iadd
      // 84: bipush 1
      // 85: isub
      // 86: bipush 78
      // 88: iload 5
      // 8a: bipush 6
      // 8c: iadd
      // 8d: bipush 1
      // 8e: isub
      // 8f: invokespecial yve.<init> (IIIIII)V
      // 92: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Well.yqm Lyve;
      // 95: return
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      StructureVillagePieces.ycl((StructureVillagePieces$Start)var1, var2, var3, this.yqm.gdj - 1, this.yqm.ixv - 4, this.yqm.ob0 + 1, vt2.te4, this.gd3());
      StructureVillagePieces.ycl((StructureVillagePieces$Start)var1, var2, var3, this.yqm.kwp + 1, this.yqm.ixv - 4, this.yqm.ob0 + 1, vt2.zk4, this.gd3());
      StructureVillagePieces.ycl((StructureVillagePieces$Start)var1, var2, var3, this.yqm.gdj + 1, this.yqm.ixv - 4, this.yqm.ob0 - 1, vt2.z9q, this.gd3());
      StructureVillagePieces.ycl((StructureVillagePieces$Start)var1, var2, var3, this.yqm.gdj + 1, this.yqm.ixv - 4, this.yqm.nwc + 1, vt2.mxp, this.gd3());
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
      // 006: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Well.e_j I
      // 009: aload 4
      // 00b: ifnull 14f
      // 00e: ifge 059
      // 011: goto 018
      // 014: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Well.c (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 3
      // 01c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.rh3 (Lt9d;Lyve;)I
      // 01f: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Well.e_j I
      // 022: aload 0
      // 023: aload 4
      // 025: ifnull 043
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Well.c (Loov;)Loov;
      // 02e: athrow
      // 02f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Well.e_j I
      // 032: ifge 042
      // 035: goto 03c
      // 038: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Well.c (Loov;)Loov;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: ireturn
      // 03e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Well.c (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Well.yqm Lyve;
      // 046: bipush 0
      // 047: aload 0
      // 048: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Well.e_j I
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Well.yqm Lyve;
      // 04f: getfield yve.ixv I
      // 052: isub
      // 053: bipush 3
      // 054: iadd
      // 055: bipush 0
      // 056: invokevirtual yve.gbw (III)V
      // 059: aload 0
      // 05a: aload 1
      // 05b: aload 3
      // 05c: bipush 1
      // 05d: bipush 0
      // 05e: bipush 1
      // 05f: bipush 4
      // 060: bipush 12
      // 062: bipush 4
      // 063: getstatic ox_.a3_ Le0x;
      // 066: invokevirtual e0x.l4i ()Lzfz;
      // 069: getstatic ox_.whp L_13;
      // 06c: invokevirtual _13.l4i ()Lzfz;
      // 06f: bipush 0
      // 070: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 073: aload 0
      // 074: aload 1
      // 075: getstatic ox_.ibw Le0x;
      // 078: invokevirtual e0x.l4i ()Lzfz;
      // 07b: bipush 2
      // 07c: bipush 12
      // 07e: bipush 2
      // 07f: aload 3
      // 080: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 083: aload 0
      // 084: aload 1
      // 085: getstatic ox_.ibw Le0x;
      // 088: invokevirtual e0x.l4i ()Lzfz;
      // 08b: bipush 3
      // 08c: bipush 12
      // 08e: bipush 2
      // 08f: aload 3
      // 090: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 093: aload 0
      // 094: aload 1
      // 095: getstatic ox_.ibw Le0x;
      // 098: invokevirtual e0x.l4i ()Lzfz;
      // 09b: bipush 2
      // 09c: bipush 12
      // 09e: bipush 3
      // 09f: aload 3
      // 0a0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a3: aload 0
      // 0a4: aload 1
      // 0a5: getstatic ox_.ibw Le0x;
      // 0a8: invokevirtual e0x.l4i ()Lzfz;
      // 0ab: bipush 3
      // 0ac: bipush 12
      // 0ae: bipush 3
      // 0af: aload 3
      // 0b0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b3: aload 0
      // 0b4: aload 1
      // 0b5: getstatic ox_.j5b Le0x;
      // 0b8: invokevirtual e0x.l4i ()Lzfz;
      // 0bb: bipush 1
      // 0bc: bipush 13
      // 0be: bipush 1
      // 0bf: aload 3
      // 0c0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0c3: aload 0
      // 0c4: aload 1
      // 0c5: getstatic ox_.j5b Le0x;
      // 0c8: invokevirtual e0x.l4i ()Lzfz;
      // 0cb: bipush 1
      // 0cc: bipush 14
      // 0ce: bipush 1
      // 0cf: aload 3
      // 0d0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0d3: aload 0
      // 0d4: aload 1
      // 0d5: getstatic ox_.j5b Le0x;
      // 0d8: invokevirtual e0x.l4i ()Lzfz;
      // 0db: bipush 4
      // 0dc: bipush 13
      // 0de: bipush 1
      // 0df: aload 3
      // 0e0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0e3: aload 0
      // 0e4: aload 1
      // 0e5: getstatic ox_.j5b Le0x;
      // 0e8: invokevirtual e0x.l4i ()Lzfz;
      // 0eb: bipush 4
      // 0ec: bipush 14
      // 0ee: bipush 1
      // 0ef: aload 3
      // 0f0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f3: aload 0
      // 0f4: aload 1
      // 0f5: getstatic ox_.j5b Le0x;
      // 0f8: invokevirtual e0x.l4i ()Lzfz;
      // 0fb: bipush 1
      // 0fc: bipush 13
      // 0fe: bipush 4
      // 0ff: aload 3
      // 100: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 103: aload 0
      // 104: aload 1
      // 105: getstatic ox_.j5b Le0x;
      // 108: invokevirtual e0x.l4i ()Lzfz;
      // 10b: bipush 1
      // 10c: bipush 14
      // 10e: bipush 4
      // 10f: aload 3
      // 110: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 113: aload 0
      // 114: aload 1
      // 115: getstatic ox_.j5b Le0x;
      // 118: invokevirtual e0x.l4i ()Lzfz;
      // 11b: bipush 4
      // 11c: bipush 13
      // 11e: bipush 4
      // 11f: aload 3
      // 120: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 123: aload 0
      // 124: aload 1
      // 125: getstatic ox_.j5b Le0x;
      // 128: invokevirtual e0x.l4i ()Lzfz;
      // 12b: bipush 4
      // 12c: bipush 14
      // 12e: bipush 4
      // 12f: aload 3
      // 130: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 133: aload 0
      // 134: aload 1
      // 135: aload 3
      // 136: bipush 1
      // 137: bipush 15
      // 139: bipush 1
      // 13a: bipush 4
      // 13b: bipush 15
      // 13d: bipush 4
      // 13e: getstatic ox_.a3_ Le0x;
      // 141: invokevirtual e0x.l4i ()Lzfz;
      // 144: getstatic ox_.a3_ Le0x;
      // 147: invokevirtual e0x.l4i ()Lzfz;
      // 14a: bipush 0
      // 14b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 14e: bipush 0
      // 14f: istore 5
      // 151: iload 5
      // 153: bipush 5
      // 154: if_icmpgt 1e0
      // 157: bipush 0
      // 158: aload 4
      // 15a: ifnull 1e1
      // 15d: istore 6
      // 15f: iload 6
      // 161: bipush 5
      // 162: if_icmpgt 1d8
      // 165: iload 6
      // 167: aload 4
      // 169: ifnull 153
      // 16c: aload 4
      // 16e: ifnull 17d
      // 171: ifeq 1ab
      // 174: goto 17b
      // 177: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Well.c (Loov;)Loov;
      // 17a: athrow
      // 17b: iload 6
      // 17d: aload 4
      // 17f: ifnull 196
      // 182: bipush 5
      // 183: if_icmpeq 1ab
      // 186: goto 18d
      // 189: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Well.c (Loov;)Loov;
      // 18c: athrow
      // 18d: iload 5
      // 18f: goto 196
      // 192: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Well.c (Loov;)Loov;
      // 195: athrow
      // 196: aload 4
      // 198: ifnull 1a7
      // 19b: ifeq 1ab
      // 19e: goto 1a5
      // 1a1: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Well.c (Loov;)Loov;
      // 1a4: athrow
      // 1a5: iload 5
      // 1a7: bipush 5
      // 1a8: if_icmpne 1d0
      // 1ab: aload 0
      // 1ac: aload 1
      // 1ad: getstatic ox_.bqn Le0x;
      // 1b0: invokevirtual e0x.l4i ()Lzfz;
      // 1b3: iload 6
      // 1b5: bipush 11
      // 1b7: iload 5
      // 1b9: aload 3
      // 1ba: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1bd: aload 0
      // 1be: aload 1
      // 1bf: iload 6
      // 1c1: bipush 12
      // 1c3: iload 5
      // 1c5: aload 3
      // 1c6: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Well.epu (Lt9d;IIILyve;)V
      // 1c9: goto 1d0
      // 1cc: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Well.c (Loov;)Loov;
      // 1cf: athrow
      // 1d0: iinc 6 1
      // 1d3: aload 4
      // 1d5: ifnonnull 15f
      // 1d8: iinc 5 1
      // 1db: aload 4
      // 1dd: ifnonnull 151
      // 1e0: bipush 1
      // 1e1: ireturn
   }

   private static oov c(oov var0) {
      return var0;
   }
}
