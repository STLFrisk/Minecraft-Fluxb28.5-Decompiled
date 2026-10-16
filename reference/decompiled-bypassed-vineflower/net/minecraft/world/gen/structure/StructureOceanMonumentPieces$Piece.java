package net.minecraft.world.gen.structure;

public abstract class StructureOceanMonumentPieces$Piece extends xi1 {
   public static final zfz v7m = ox_.ye1.kig(hgu.fy6);
   public static final zfz lzf = ox_.ye1.kig(hgu.mc0);
   public static final zfz cyh = ox_.ye1.kig(hgu.rpc);
   public static final zfz vvr = lzf;
   public static final zfz mip = ox_.zq7.l4i();
   public static final zfz kjx = ox_.gdz.l4i();
   public static final int j_o = a5w(2, 0, 0);
   public static final int qmu = a5w(2, 2, 0);
   public static final int zjn = a5w(0, 1, 0);
   public static final int y5e = a5w(4, 1, 0);
   public StructureOceanMonumentPieces$man qd5;

   public static final int a5w(int var0, int var1, int var2) {
      return var1 * 25 + var2 * 5 + var0;
   }

   public StructureOceanMonumentPieces$Piece() {
      super(0);
   }

   public StructureOceanMonumentPieces$Piece(int var1) {
      super(var1);
   }

   public StructureOceanMonumentPieces$Piece(vt2 var1, yve var2) {
      super(1);
      this.p7m = var1;
      this.yqm = var2;
   }

   public StructureOceanMonumentPieces$Piece(int param1, vt2 param2, StructureOceanMonumentPieces$man param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: iload 1
      // 002: invokespecial xi1.<init> (I)V
      // 005: aload 0
      // 006: aload 2
      // 007: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.p7m Lvt2;
      // 00a: aload 0
      // 00b: aload 3
      // 00c: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.qd5 Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 00f: aload 3
      // 010: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.o8f I
      // 013: istore 8
      // 015: iload 8
      // 017: bipush 5
      // 018: irem
      // 019: istore 9
      // 01b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 01e: iload 8
      // 020: bipush 5
      // 021: idiv
      // 022: bipush 5
      // 023: irem
      // 024: istore 10
      // 026: iload 8
      // 028: bipush 25
      // 02a: idiv
      // 02b: istore 11
      // 02d: astore 7
      // 02f: aload 2
      // 030: getstatic vt2.z9q Lvt2;
      // 033: aload 7
      // 035: ifnull 04d
      // 038: if_acmpeq 07e
      // 03b: goto 042
      // 03e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 041: athrow
      // 042: aload 2
      // 043: getstatic vt2.mxp Lvt2;
      // 046: goto 04d
      // 049: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 04c: athrow
      // 04d: if_acmpeq 07e
      // 050: aload 0
      // 051: new yve
      // 054: dup
      // 055: bipush 0
      // 056: bipush 0
      // 057: bipush 0
      // 058: iload 6
      // 05a: bipush 8
      // 05c: imul
      // 05d: bipush 1
      // 05e: isub
      // 05f: iload 5
      // 061: bipush 4
      // 062: imul
      // 063: bipush 1
      // 064: isub
      // 065: iload 4
      // 067: bipush 8
      // 069: imul
      // 06a: bipush 1
      // 06b: isub
      // 06c: invokespecial yve.<init> (IIIIII)V
      // 06f: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.yqm Lyve;
      // 072: aload 7
      // 074: ifnonnull 0a7
      // 077: goto 07e
      // 07a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 0
      // 07f: new yve
      // 082: dup
      // 083: bipush 0
      // 084: bipush 0
      // 085: bipush 0
      // 086: iload 4
      // 088: bipush 8
      // 08a: imul
      // 08b: bipush 1
      // 08c: isub
      // 08d: iload 5
      // 08f: bipush 4
      // 090: imul
      // 091: bipush 1
      // 092: isub
      // 093: iload 6
      // 095: bipush 8
      // 097: imul
      // 098: bipush 1
      // 099: isub
      // 09a: invokespecial yve.<init> (IIIIII)V
      // 09d: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.yqm Lyve;
      // 0a0: goto 0a7
      // 0a3: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 0a6: athrow
      // 0a7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$1.hyi [I
      // 0aa: aload 2
      // 0ab: invokevirtual vt2.ordinal ()I
      // 0ae: iaload
      // 0af: tableswitch 136 1 3 25 64 97
      // 0c8: aload 0
      // 0c9: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.yqm Lyve;
      // 0cc: iload 9
      // 0ce: bipush 8
      // 0d0: imul
      // 0d1: iload 11
      // 0d3: bipush 4
      // 0d4: imul
      // 0d5: iload 10
      // 0d7: iload 6
      // 0d9: iadd
      // 0da: ineg
      // 0db: bipush 8
      // 0dd: imul
      // 0de: bipush 1
      // 0df: iadd
      // 0e0: invokevirtual yve.gbw (III)V
      // 0e3: aload 7
      // 0e5: ifnonnull 153
      // 0e8: goto 0ef
      // 0eb: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.yqm Lyve;
      // 0f3: iload 9
      // 0f5: bipush 8
      // 0f7: imul
      // 0f8: iload 11
      // 0fa: bipush 4
      // 0fb: imul
      // 0fc: iload 10
      // 0fe: bipush 8
      // 100: imul
      // 101: invokevirtual yve.gbw (III)V
      // 104: aload 7
      // 106: ifnonnull 153
      // 109: goto 110
      // 10c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.yqm Lyve;
      // 114: iload 10
      // 116: iload 6
      // 118: iadd
      // 119: ineg
      // 11a: bipush 8
      // 11c: imul
      // 11d: bipush 1
      // 11e: iadd
      // 11f: iload 11
      // 121: bipush 4
      // 122: imul
      // 123: iload 9
      // 125: bipush 8
      // 127: imul
      // 128: invokevirtual yve.gbw (III)V
      // 12b: aload 7
      // 12d: ifnonnull 153
      // 130: goto 137
      // 133: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 136: athrow
      // 137: aload 0
      // 138: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.yqm Lyve;
      // 13b: iload 10
      // 13d: bipush 8
      // 13f: imul
      // 140: iload 11
      // 142: bipush 4
      // 143: imul
      // 144: iload 9
      // 146: bipush 8
      // 148: imul
      // 149: invokevirtual yve.gbw (III)V
      // 14c: goto 153
      // 14f: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 152: athrow
      // 153: return
   }

   @Override
   public void z0d(bdo var1) {
   }

   @Override
   public void oqf(bdo var1) {
   }

   public void sm_(t9d param1, yve param2, int param3, int param4, int param5, int param6, int param7, int param8, boolean param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 10
      // 05: iload 4
      // 07: istore 11
      // 09: iload 11
      // 0b: iload 7
      // 0d: if_icmpgt d9
      // 10: iload 3
      // 11: istore 12
      // 13: iload 12
      // 15: iload 6
      // 17: if_icmpgt d1
      // 1a: iload 5
      // 1c: aload 10
      // 1e: ifnull 0b
      // 21: istore 13
      // 23: iload 13
      // 25: iload 8
      // 27: if_icmpgt c9
      // 2a: iload 9
      // 2c: aload 10
      // 2e: ifnull 15
      // 31: aload 10
      // 33: ifnull 86
      // 36: ifeq 6d
      // 39: goto 40
      // 3c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: aload 10
      // 43: ifnull 75
      // 46: goto 4d
      // 49: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 1
      // 4e: iload 12
      // 50: iload 11
      // 52: iload 13
      // 54: aload 2
      // 55: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.t90 (Lt9d;IIILyve;)Lzfz;
      // 58: invokeinterface zfz.r_y ()Le0x; 1
      // 5d: invokevirtual e0x.p1r ()Lp3y;
      // 60: getstatic p3y.cei Lp3y;
      // 63: if_acmpeq c1
      // 66: goto 6d
      // 69: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: goto 75
      // 71: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 74: athrow
      // 75: aload 10
      // 77: ifnull b3
      // 7a: iload 11
      // 7c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece._tw (I)I
      // 7f: goto 86
      // 82: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 85: athrow
      // 86: aload 1
      // 87: invokevirtual t9d._s3 ()I
      // 8a: if_icmplt ab
      // 8d: aload 0
      // 8e: aload 1
      // 8f: getstatic ox_.ibw Le0x;
      // 92: invokevirtual e0x.l4i ()Lzfz;
      // 95: iload 12
      // 97: iload 11
      // 99: iload 13
      // 9b: aload 2
      // 9c: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.lzy (Lt9d;Lzfz;IIILyve;)V
      // 9f: aload 10
      // a1: ifnonnull c1
      // a4: goto ab
      // a7: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // aa: athrow
      // ab: aload 0
      // ac: goto b3
      // af: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // b2: athrow
      // b3: aload 1
      // b4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.kjx Lzfz;
      // b7: iload 12
      // b9: iload 11
      // bb: iload 13
      // bd: aload 2
      // be: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.lzy (Lt9d;Lzfz;IIILyve;)V
      // c1: iinc 13 1
      // c4: aload 10
      // c6: ifnonnull 23
      // c9: iinc 12 1
      // cc: aload 10
      // ce: ifnonnull 13
      // d1: iinc 11 1
      // d4: aload 10
      // d6: ifnonnull 09
      // d9: return
   }

   public void tux(t9d param1, yve param2, int param3, int param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 6
      // 005: iload 5
      // 007: ifeq 10a
      // 00a: aload 0
      // 00b: aload 1
      // 00c: aload 2
      // 00d: iload 3
      // 00e: bipush 0
      // 00f: iadd
      // 010: bipush 0
      // 011: iload 4
      // 013: bipush 0
      // 014: iadd
      // 015: iload 3
      // 016: bipush 2
      // 017: iadd
      // 018: bipush 0
      // 019: iload 4
      // 01b: bipush 8
      // 01d: iadd
      // 01e: bipush 1
      // 01f: isub
      // 020: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.v7m Lzfz;
      // 023: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.v7m Lzfz;
      // 026: bipush 0
      // 027: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 02a: aload 0
      // 02b: aload 1
      // 02c: aload 2
      // 02d: iload 3
      // 02e: bipush 5
      // 02f: iadd
      // 030: bipush 0
      // 031: iload 4
      // 033: bipush 0
      // 034: iadd
      // 035: iload 3
      // 036: bipush 8
      // 038: iadd
      // 039: bipush 1
      // 03a: isub
      // 03b: bipush 0
      // 03c: iload 4
      // 03e: bipush 8
      // 040: iadd
      // 041: bipush 1
      // 042: isub
      // 043: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.v7m Lzfz;
      // 046: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.v7m Lzfz;
      // 049: bipush 0
      // 04a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 04d: aload 0
      // 04e: aload 1
      // 04f: aload 2
      // 050: iload 3
      // 051: bipush 3
      // 052: iadd
      // 053: bipush 0
      // 054: iload 4
      // 056: bipush 0
      // 057: iadd
      // 058: iload 3
      // 059: bipush 4
      // 05a: iadd
      // 05b: bipush 0
      // 05c: iload 4
      // 05e: bipush 2
      // 05f: iadd
      // 060: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.v7m Lzfz;
      // 063: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.v7m Lzfz;
      // 066: bipush 0
      // 067: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 06a: aload 0
      // 06b: aload 1
      // 06c: aload 2
      // 06d: iload 3
      // 06e: bipush 3
      // 06f: iadd
      // 070: bipush 0
      // 071: iload 4
      // 073: bipush 5
      // 074: iadd
      // 075: iload 3
      // 076: bipush 4
      // 077: iadd
      // 078: bipush 0
      // 079: iload 4
      // 07b: bipush 8
      // 07d: iadd
      // 07e: bipush 1
      // 07f: isub
      // 080: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.v7m Lzfz;
      // 083: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.v7m Lzfz;
      // 086: bipush 0
      // 087: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 08a: aload 0
      // 08b: aload 1
      // 08c: aload 2
      // 08d: iload 3
      // 08e: bipush 3
      // 08f: iadd
      // 090: bipush 0
      // 091: iload 4
      // 093: bipush 2
      // 094: iadd
      // 095: iload 3
      // 096: bipush 4
      // 097: iadd
      // 098: bipush 0
      // 099: iload 4
      // 09b: bipush 2
      // 09c: iadd
      // 09d: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.lzf Lzfz;
      // 0a0: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.lzf Lzfz;
      // 0a3: bipush 0
      // 0a4: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0a7: aload 0
      // 0a8: aload 1
      // 0a9: aload 2
      // 0aa: iload 3
      // 0ab: bipush 3
      // 0ac: iadd
      // 0ad: bipush 0
      // 0ae: iload 4
      // 0b0: bipush 5
      // 0b1: iadd
      // 0b2: iload 3
      // 0b3: bipush 4
      // 0b4: iadd
      // 0b5: bipush 0
      // 0b6: iload 4
      // 0b8: bipush 5
      // 0b9: iadd
      // 0ba: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.lzf Lzfz;
      // 0bd: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.lzf Lzfz;
      // 0c0: bipush 0
      // 0c1: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0c4: aload 0
      // 0c5: aload 1
      // 0c6: aload 2
      // 0c7: iload 3
      // 0c8: bipush 2
      // 0c9: iadd
      // 0ca: bipush 0
      // 0cb: iload 4
      // 0cd: bipush 3
      // 0ce: iadd
      // 0cf: iload 3
      // 0d0: bipush 2
      // 0d1: iadd
      // 0d2: bipush 0
      // 0d3: iload 4
      // 0d5: bipush 4
      // 0d6: iadd
      // 0d7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.lzf Lzfz;
      // 0da: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.lzf Lzfz;
      // 0dd: bipush 0
      // 0de: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e1: aload 0
      // 0e2: aload 1
      // 0e3: aload 2
      // 0e4: iload 3
      // 0e5: bipush 5
      // 0e6: iadd
      // 0e7: bipush 0
      // 0e8: iload 4
      // 0ea: bipush 3
      // 0eb: iadd
      // 0ec: iload 3
      // 0ed: bipush 5
      // 0ee: iadd
      // 0ef: bipush 0
      // 0f0: iload 4
      // 0f2: bipush 4
      // 0f3: iadd
      // 0f4: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.lzf Lzfz;
      // 0f7: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.lzf Lzfz;
      // 0fa: bipush 0
      // 0fb: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0fe: aload 6
      // 100: ifnonnull 134
      // 103: goto 10a
      // 106: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 109: athrow
      // 10a: aload 0
      // 10b: aload 1
      // 10c: aload 2
      // 10d: iload 3
      // 10e: bipush 0
      // 10f: iadd
      // 110: bipush 0
      // 111: iload 4
      // 113: bipush 0
      // 114: iadd
      // 115: iload 3
      // 116: bipush 8
      // 118: iadd
      // 119: bipush 1
      // 11a: isub
      // 11b: bipush 0
      // 11c: iload 4
      // 11e: bipush 8
      // 120: iadd
      // 121: bipush 1
      // 122: isub
      // 123: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.v7m Lzfz;
      // 126: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.v7m Lzfz;
      // 129: bipush 0
      // 12a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 12d: goto 134
      // 130: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 133: athrow
      // 134: return
   }

   public void cm0(t9d param1, yve param2, int param3, int param4, int param5, int param6, int param7, int param8, zfz param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 10
      // 05: iload 4
      // 07: istore 11
      // 09: iload 11
      // 0b: iload 7
      // 0d: if_icmpgt 75
      // 10: iload 3
      // 11: istore 12
      // 13: iload 12
      // 15: iload 6
      // 17: if_icmpgt 6d
      // 1a: iload 5
      // 1c: aload 10
      // 1e: ifnull 0b
      // 21: istore 13
      // 23: iload 13
      // 25: iload 8
      // 27: if_icmpgt 65
      // 2a: aload 0
      // 2b: aload 1
      // 2c: aload 10
      // 2e: ifnull 51
      // 31: iload 12
      // 33: iload 11
      // 35: iload 13
      // 37: aload 2
      // 38: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.t90 (Lt9d;IIILyve;)Lzfz;
      // 3b: getstatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.kjx Lzfz;
      // 3e: if_acmpne 5d
      // 41: goto 48
      // 44: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: aload 1
      // 4a: goto 51
      // 4d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.b (Loov;)Loov;
      // 50: athrow
      // 51: aload 9
      // 53: iload 12
      // 55: iload 11
      // 57: iload 13
      // 59: aload 2
      // 5a: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5d: iinc 13 1
      // 60: aload 10
      // 62: ifnonnull 23
      // 65: iinc 12 1
      // 68: aload 10
      // 6a: ifnonnull 13
      // 6d: iinc 11 1
      // 70: aload 10
      // 72: ifnonnull 09
      // 75: return
   }

   public boolean mjo(yve var1, int var2, int var3, int var4, int var5) {
      int var6 = this.q__(var2, var3);
      int var7 = this._ye(var2, var3);
      int var8 = this.q__(var4, var5);
      int var9 = this._ye(var4, var5);
      return var1._dk(Math.min(var6, var8), Math.min(var7, var9), Math.max(var6, var8), Math.max(var7, var9));
   }

   public boolean cm6(t9d var1, yve var2, int var3, int var4, int var5) {
      int var7 = this.q__(var3, var5);
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      int var8 = this._tw(var4);
      i2h[] var6 = var10000;
      int var9 = this._ye(var3, var5);

      label27: {
         try {
            boolean var12 = var2.vwy(new mew(var7, var8, var9));
            if (var6 == null) {
               return var12;
            }

            if (var12) {
               break label27;
            }
         } catch (oov var11) {
            throw b(var11);
         }

         return false;
      }

      c9p var10 = new c9p(var1);
      var10.pfo(true);
      var10.rwd(var10.axb());
      var10.x24((double)var7 + 0.5, (double)var8, (double)var9 + 0.5, 0.0F, 0.0F);
      var10.hx8(var1.sms(new mew(var10)), (ps6)null);
      var1.xzq(var10);
      return true;
   }

   private static oov b(oov var0) {
      return var0;
   }
}
