package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public abstract class StructureNetherBridgePieces$Piece extends xi1 {
   public static final List rop = Lists.newArrayList(
      new ypi[]{
         new ypi(xbr.exg, 0, 1, 3, 5),
         new ypi(xbr.icz, 0, 1, 5, 5),
         new ypi(xbr.jtr, 0, 1, 3, 15),
         new ypi(xbr.g8a, 0, 1, 1, 5),
         new ypi(xbr.mmx, 0, 1, 1, 5),
         new ypi(xbr.za8, 0, 1, 1, 5),
         new ypi(xbr.jgt, 0, 3, 7, 5),
         new ypi(xbr.fpq, 0, 1, 1, 10),
         new ypi(xbr.fps, 0, 1, 1, 8),
         new ypi(xbr.mhm, 0, 1, 1, 5),
         new ypi(xbr.krl, 0, 1, 1, 3),
         new ypi(u7m.gfm(ox_.j4y), 0, 2, 4, 2)
      }
   );

   public StructureNetherBridgePieces$Piece() {
   }

   public StructureNetherBridgePieces$Piece(int var1) {
      super(var1);
   }

   @Override
   public void oqf(bdo var1) {
   }

   @Override
   public void z0d(bdo var1) {
   }

   private int ald(List param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 05: bipush 0
      // 06: istore 4
      // 08: astore 2
      // 09: aload 1
      // 0a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0f: astore 5
      // 11: aload 5
      // 13: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18: ifeq 74
      // 1b: aload 5
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast net/minecraft/world/gen/structure/StructureNetherBridgePieces$r67
      // 25: astore 6
      // 27: aload 6
      // 29: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$r67.nez I
      // 2c: aload 2
      // 2d: ifnull 75
      // 30: aload 2
      // 31: ifnull 6e
      // 34: goto 3b
      // 37: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 3a: athrow
      // 3b: ifle 66
      // 3e: goto 45
      // 41: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 44: athrow
      // 45: aload 6
      // 47: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$r67.m3g I
      // 4a: aload 6
      // 4c: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$r67.nez I
      // 4f: aload 2
      // 50: ifnull 6d
      // 53: goto 5a
      // 56: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 59: athrow
      // 5a: if_icmpge 66
      // 5d: goto 64
      // 60: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 63: athrow
      // 64: bipush 1
      // 65: istore 3
      // 66: iload 4
      // 68: aload 6
      // 6a: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$r67.arx I
      // 6d: iadd
      // 6e: istore 4
      // 70: aload 2
      // 71: ifnonnull 11
      // 74: iload 3
      // 75: aload 2
      // 76: ifnull 85
      // 79: ifeq 88
      // 7c: goto 83
      // 7f: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 82: athrow
      // 83: iload 4
      // 85: goto 89
      // 88: bipush -1
      // 89: ireturn
   }

   private StructureNetherBridgePieces$Piece mn3(
      StructureNetherBridgePieces$Start param1, List param2, List param3, Random param4, int param5, int param6, int param7, vt2 param8, int param9
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 10
      // 005: aload 0
      // 006: aload 2
      // 007: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.ald (Ljava/util/List;)I
      // 00a: istore 11
      // 00c: iload 11
      // 00e: aload 10
      // 010: ifnull 01f
      // 013: ifle 03b
      // 016: goto 01d
      // 019: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 01c: athrow
      // 01d: iload 9
      // 01f: aload 10
      // 021: ifnull 038
      // 024: bipush 30
      // 026: if_icmpgt 03b
      // 029: goto 030
      // 02c: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 02f: athrow
      // 030: bipush 1
      // 031: goto 038
      // 034: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 037: athrow
      // 038: goto 03c
      // 03b: bipush 0
      // 03c: istore 12
      // 03e: bipush 0
      // 03f: istore 13
      // 041: iload 13
      // 043: bipush 5
      // 044: if_icmpge 16b
      // 047: iload 12
      // 049: aload 10
      // 04b: ifnull 069
      // 04e: ifeq 16b
      // 051: goto 058
      // 054: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 057: athrow
      // 058: iinc 13 1
      // 05b: aload 4
      // 05d: iload 11
      // 05f: invokevirtual java/util/Random.nextInt (I)I
      // 062: goto 069
      // 065: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 068: athrow
      // 069: istore 14
      // 06b: aload 2
      // 06c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 071: astore 15
      // 073: aload 15
      // 075: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07a: ifeq 166
      // 07d: aload 15
      // 07f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 084: checkcast net/minecraft/world/gen/structure/StructureNetherBridgePieces$r67
      // 087: astore 16
      // 089: iload 14
      // 08b: aload 16
      // 08d: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$r67.arx I
      // 090: isub
      // 091: istore 14
      // 093: iload 14
      // 095: aload 10
      // 097: ifnull 043
      // 09a: aload 10
      // 09c: ifnull 0c3
      // 09f: ifge 161
      // 0a2: goto 0a9
      // 0a5: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 16
      // 0ab: aload 10
      // 0ad: ifnull 0c8
      // 0b0: goto 0b7
      // 0b3: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 0b6: athrow
      // 0b7: iload 9
      // 0b9: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$r67.i77 (I)Z
      // 0bc: goto 0c3
      // 0bf: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 0c2: athrow
      // 0c3: ifeq 166
      // 0c6: aload 16
      // 0c8: aload 10
      // 0ca: ifnull 0ff
      // 0cd: aload 1
      // 0ce: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Start.pqi Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$r67;
      // 0d1: if_acmpne 0fd
      // 0d4: goto 0db
      // 0d7: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 16
      // 0dd: aload 10
      // 0df: ifnull 0ff
      // 0e2: goto 0e9
      // 0e5: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 0e8: athrow
      // 0e9: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$r67.hhz Z
      // 0ec: ifne 0fd
      // 0ef: goto 0f6
      // 0f2: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 0f5: athrow
      // 0f6: goto 166
      // 0f9: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 0fc: athrow
      // 0fd: aload 16
      // 0ff: aload 3
      // 100: aload 4
      // 102: iload 5
      // 104: iload 6
      // 106: iload 7
      // 108: aload 8
      // 10a: iload 9
      // 10c: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces.nt0 (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$r67;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece;
      // 10f: astore 17
      // 111: aload 10
      // 113: ifnull 146
      // 116: aload 17
      // 118: ifnull 161
      // 11b: goto 122
      // 11e: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 121: athrow
      // 122: aload 16
      // 124: dup
      // 125: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$r67.m3g I
      // 128: bipush 1
      // 129: iadd
      // 12a: putfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$r67.m3g I
      // 12d: aload 1
      // 12e: aload 10
      // 130: ifnull 160
      // 133: goto 13a
      // 136: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 139: athrow
      // 13a: aload 16
      // 13c: putfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Start.pqi Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$r67;
      // 13f: goto 146
      // 142: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 145: athrow
      // 146: aload 16
      // 148: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$r67.ywp ()Z
      // 14b: ifne 15e
      // 14e: aload 2
      // 14f: aload 16
      // 151: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 156: pop
      // 157: goto 15e
      // 15a: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 15d: athrow
      // 15e: aload 17
      // 160: areturn
      // 161: aload 10
      // 163: ifnonnull 073
      // 166: aload 10
      // 168: ifnonnull 041
      // 16b: aload 3
      // 16c: aload 4
      // 16e: iload 5
      // 170: iload 6
      // 172: iload 7
      // 174: aload 8
      // 176: iload 9
      // 178: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$End.d81 (Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$End;
      // 17b: areturn
   }

   private xi1 lay(
      StructureNetherBridgePieces$Start param1, List param2, Random param3, int param4, int param5, int param6, vt2 param7, int param8, boolean param9
   ) {
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
      // 07: aload 1
      // 08: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Start.q1q ()Lyve;
      // 0b: getfield yve.gdj I
      // 0e: isub
      // 0f: invokestatic java/lang/Math.abs (I)I
      // 12: bipush 112
      // 14: aload 10
      // 16: ifnull 39
      // 19: if_icmpgt 94
      // 1c: goto 23
      // 1f: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 22: athrow
      // 23: iload 6
      // 25: aload 1
      // 26: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Start.q1q ()Lyve;
      // 29: getfield yve.ob0 I
      // 2c: isub
      // 2d: invokestatic java/lang/Math.abs (I)I
      // 30: bipush 112
      // 32: goto 39
      // 35: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 38: athrow
      // 39: if_icmpgt 94
      // 3c: aload 1
      // 3d: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Start.npl Ljava/util/List;
      // 40: astore 11
      // 42: iload 9
      // 44: ifeq 4d
      // 47: aload 1
      // 48: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Start.d48 Ljava/util/List;
      // 4b: astore 11
      // 4d: aload 0
      // 4e: aload 1
      // 4f: aload 11
      // 51: aload 2
      // 52: aload 3
      // 53: iload 4
      // 55: iload 5
      // 57: iload 6
      // 59: aload 7
      // 5b: iload 8
      // 5d: bipush 1
      // 5e: iadd
      // 5f: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.mn3 (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece;
      // 62: astore 12
      // 64: aload 12
      // 66: aload 10
      // 68: ifnull 93
      // 6b: ifnull 91
      // 6e: goto 75
      // 71: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 74: athrow
      // 75: aload 2
      // 76: aload 12
      // 78: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7d: pop
      // 7e: aload 1
      // 7f: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Start.aka Ljava/util/List;
      // 82: aload 12
      // 84: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 89: pop
      // 8a: goto 91
      // 8d: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 90: athrow
      // 91: aload 12
      // 93: areturn
      // 94: aload 2
      // 95: aload 3
      // 96: iload 4
      // 98: iload 5
      // 9a: iload 6
      // 9c: aload 7
      // 9e: iload 8
      // a0: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$End.d81 (Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$End;
      // a3: areturn
   }

   public xi1 d3x(StructureNetherBridgePieces$Start param1, List param2, Random param3, int param4, int param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.p7m Lvt2;
      // 04: ifnull f4
      // 07: getstatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$1.f6i [I
      // 0a: aload 0
      // 0b: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.p7m Lvt2;
      // 0e: invokevirtual vt2.ordinal ()I
      // 11: iaload
      // 12: tableswitch 226 1 4 34 85 132 179
      // 30: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: aload 1
      // 36: aload 2
      // 37: aload 3
      // 38: aload 0
      // 39: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 3c: getfield yve.gdj I
      // 3f: iload 4
      // 41: iadd
      // 42: aload 0
      // 43: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 46: getfield yve._3o I
      // 49: iload 5
      // 4b: iadd
      // 4c: aload 0
      // 4d: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 50: getfield yve.ob0 I
      // 53: bipush 1
      // 54: isub
      // 55: aload 0
      // 56: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.p7m Lvt2;
      // 59: aload 0
      // 5a: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.gd3 ()I
      // 5d: iload 6
      // 5f: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.lay (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;IZ)Lxi1;
      // 62: areturn
      // 63: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 66: athrow
      // 67: aload 0
      // 68: aload 1
      // 69: aload 2
      // 6a: aload 3
      // 6b: aload 0
      // 6c: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 6f: getfield yve.gdj I
      // 72: iload 4
      // 74: iadd
      // 75: aload 0
      // 76: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 79: getfield yve._3o I
      // 7c: iload 5
      // 7e: iadd
      // 7f: aload 0
      // 80: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 83: getfield yve.nwc I
      // 86: bipush 1
      // 87: iadd
      // 88: aload 0
      // 89: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.p7m Lvt2;
      // 8c: aload 0
      // 8d: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.gd3 ()I
      // 90: iload 6
      // 92: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.lay (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;IZ)Lxi1;
      // 95: areturn
      // 96: aload 0
      // 97: aload 1
      // 98: aload 2
      // 99: aload 3
      // 9a: aload 0
      // 9b: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 9e: getfield yve.gdj I
      // a1: bipush 1
      // a2: isub
      // a3: aload 0
      // a4: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // a7: getfield yve._3o I
      // aa: iload 5
      // ac: iadd
      // ad: aload 0
      // ae: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // b1: getfield yve.ob0 I
      // b4: iload 4
      // b6: iadd
      // b7: aload 0
      // b8: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.p7m Lvt2;
      // bb: aload 0
      // bc: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.gd3 ()I
      // bf: iload 6
      // c1: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.lay (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;IZ)Lxi1;
      // c4: areturn
      // c5: aload 0
      // c6: aload 1
      // c7: aload 2
      // c8: aload 3
      // c9: aload 0
      // ca: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // cd: getfield yve.kwp I
      // d0: bipush 1
      // d1: iadd
      // d2: aload 0
      // d3: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // d6: getfield yve._3o I
      // d9: iload 5
      // db: iadd
      // dc: aload 0
      // dd: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // e0: getfield yve.ob0 I
      // e3: iload 4
      // e5: iadd
      // e6: aload 0
      // e7: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.p7m Lvt2;
      // ea: aload 0
      // eb: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.gd3 ()I
      // ee: iload 6
      // f0: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.lay (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;IZ)Lxi1;
      // f3: areturn
      // f4: aconst_null
      // f5: areturn
   }

   public xi1 lns(StructureNetherBridgePieces$Start param1, List param2, Random param3, int param4, int param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.p7m Lvt2;
      // 04: ifnull f0
      // 07: getstatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$1.f6i [I
      // 0a: aload 0
      // 0b: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.p7m Lvt2;
      // 0e: invokevirtual vt2.ordinal ()I
      // 11: iaload
      // 12: tableswitch 222 1 4 34 84 130 176
      // 30: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: aload 1
      // 36: aload 2
      // 37: aload 3
      // 38: aload 0
      // 39: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 3c: getfield yve.gdj I
      // 3f: bipush 1
      // 40: isub
      // 41: aload 0
      // 42: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 45: getfield yve._3o I
      // 48: iload 4
      // 4a: iadd
      // 4b: aload 0
      // 4c: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 4f: getfield yve.ob0 I
      // 52: iload 5
      // 54: iadd
      // 55: getstatic vt2.te4 Lvt2;
      // 58: aload 0
      // 59: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.gd3 ()I
      // 5c: iload 6
      // 5e: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.lay (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;IZ)Lxi1;
      // 61: areturn
      // 62: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 65: athrow
      // 66: aload 0
      // 67: aload 1
      // 68: aload 2
      // 69: aload 3
      // 6a: aload 0
      // 6b: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 6e: getfield yve.gdj I
      // 71: bipush 1
      // 72: isub
      // 73: aload 0
      // 74: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 77: getfield yve._3o I
      // 7a: iload 4
      // 7c: iadd
      // 7d: aload 0
      // 7e: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 81: getfield yve.ob0 I
      // 84: iload 5
      // 86: iadd
      // 87: getstatic vt2.te4 Lvt2;
      // 8a: aload 0
      // 8b: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.gd3 ()I
      // 8e: iload 6
      // 90: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.lay (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;IZ)Lxi1;
      // 93: areturn
      // 94: aload 0
      // 95: aload 1
      // 96: aload 2
      // 97: aload 3
      // 98: aload 0
      // 99: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 9c: getfield yve.gdj I
      // 9f: iload 5
      // a1: iadd
      // a2: aload 0
      // a3: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // a6: getfield yve._3o I
      // a9: iload 4
      // ab: iadd
      // ac: aload 0
      // ad: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // b0: getfield yve.ob0 I
      // b3: bipush 1
      // b4: isub
      // b5: getstatic vt2.z9q Lvt2;
      // b8: aload 0
      // b9: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.gd3 ()I
      // bc: iload 6
      // be: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.lay (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;IZ)Lxi1;
      // c1: areturn
      // c2: aload 0
      // c3: aload 1
      // c4: aload 2
      // c5: aload 3
      // c6: aload 0
      // c7: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // ca: getfield yve.gdj I
      // cd: iload 5
      // cf: iadd
      // d0: aload 0
      // d1: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // d4: getfield yve._3o I
      // d7: iload 4
      // d9: iadd
      // da: aload 0
      // db: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // de: getfield yve.ob0 I
      // e1: bipush 1
      // e2: isub
      // e3: getstatic vt2.z9q Lvt2;
      // e6: aload 0
      // e7: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.gd3 ()I
      // ea: iload 6
      // ec: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.lay (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;IZ)Lxi1;
      // ef: areturn
      // f0: aconst_null
      // f1: areturn
   }

   public xi1 fkt(StructureNetherBridgePieces$Start param1, List param2, Random param3, int param4, int param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.p7m Lvt2;
      // 04: ifnull f0
      // 07: getstatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$1.f6i [I
      // 0a: aload 0
      // 0b: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.p7m Lvt2;
      // 0e: invokevirtual vt2.ordinal ()I
      // 11: iaload
      // 12: tableswitch 222 1 4 34 84 130 176
      // 30: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: aload 1
      // 36: aload 2
      // 37: aload 3
      // 38: aload 0
      // 39: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 3c: getfield yve.kwp I
      // 3f: bipush 1
      // 40: iadd
      // 41: aload 0
      // 42: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 45: getfield yve._3o I
      // 48: iload 4
      // 4a: iadd
      // 4b: aload 0
      // 4c: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 4f: getfield yve.ob0 I
      // 52: iload 5
      // 54: iadd
      // 55: getstatic vt2.zk4 Lvt2;
      // 58: aload 0
      // 59: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.gd3 ()I
      // 5c: iload 6
      // 5e: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.lay (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;IZ)Lxi1;
      // 61: areturn
      // 62: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 65: athrow
      // 66: aload 0
      // 67: aload 1
      // 68: aload 2
      // 69: aload 3
      // 6a: aload 0
      // 6b: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 6e: getfield yve.kwp I
      // 71: bipush 1
      // 72: iadd
      // 73: aload 0
      // 74: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 77: getfield yve._3o I
      // 7a: iload 4
      // 7c: iadd
      // 7d: aload 0
      // 7e: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 81: getfield yve.ob0 I
      // 84: iload 5
      // 86: iadd
      // 87: getstatic vt2.zk4 Lvt2;
      // 8a: aload 0
      // 8b: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.gd3 ()I
      // 8e: iload 6
      // 90: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.lay (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;IZ)Lxi1;
      // 93: areturn
      // 94: aload 0
      // 95: aload 1
      // 96: aload 2
      // 97: aload 3
      // 98: aload 0
      // 99: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // 9c: getfield yve.gdj I
      // 9f: iload 5
      // a1: iadd
      // a2: aload 0
      // a3: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // a6: getfield yve._3o I
      // a9: iload 4
      // ab: iadd
      // ac: aload 0
      // ad: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // b0: getfield yve.nwc I
      // b3: bipush 1
      // b4: iadd
      // b5: getstatic vt2.mxp Lvt2;
      // b8: aload 0
      // b9: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.gd3 ()I
      // bc: iload 6
      // be: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.lay (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;IZ)Lxi1;
      // c1: areturn
      // c2: aload 0
      // c3: aload 1
      // c4: aload 2
      // c5: aload 3
      // c6: aload 0
      // c7: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // ca: getfield yve.gdj I
      // cd: iload 5
      // cf: iadd
      // d0: aload 0
      // d1: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // d4: getfield yve._3o I
      // d7: iload 4
      // d9: iadd
      // da: aload 0
      // db: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.yqm Lyve;
      // de: getfield yve.nwc I
      // e1: bipush 1
      // e2: iadd
      // e3: getstatic vt2.mxp Lvt2;
      // e6: aload 0
      // e7: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.gd3 ()I
      // ea: iload 6
      // ec: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.lay (Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;IZ)Lxi1;
      // ef: areturn
      // f0: aconst_null
      // f1: areturn
   }

   public static boolean ulp(yve param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 14
      // 09: ifnull 32
      // 0c: goto 13
      // 0f: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: getfield yve._3o I
      // 17: aload 1
      // 18: ifnull 2f
      // 1b: bipush 10
      // 1d: if_icmple 32
      // 20: goto 27
      // 23: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 26: athrow
      // 27: bipush 1
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece.b (Loov;)Loov;
      // 2e: athrow
      // 2f: goto 33
      // 32: bipush 0
      // 33: ireturn
   }

   private static oov b(oov var0) {
      return var0;
   }
}
