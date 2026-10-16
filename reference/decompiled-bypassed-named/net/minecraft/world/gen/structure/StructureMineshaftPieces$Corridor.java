package net.minecraft.world.gen.structure;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class StructureMineshaftPieces$Corridor extends xi1 {
   private boolean _0j;
   private boolean _4p;
   private boolean cae;
   private int itx;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map h = new HashMap(13);

   public StructureMineshaftPieces$Corridor() {
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 1945983341059L;
      var1.zyu(b<"s">(20211, 5269834253934543234L ^ var2), this._0j);
      var1.zyu(b<"s">(31236, 5168132868307809649L ^ var2), this._4p);
      var1.zyu(b<"s">(9716, 2504303332064766599L ^ var2), this.cae);
      var1.iin(b<"s">(14255, 1126306608640506075L ^ var2), this.itx);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 140285310737256L;
      this._0j = var1.dvl(b<"s">(15983, 8743135409636833398L ^ var2));
      this._4p = var1.dvl(b<"s">(19446, 334361521938140650L ^ var2));
      this.cae = var1.dvl(b<"s">(17489, 1904982122417422924L ^ var2));
      this.itx = var1.uz7(b<"s">(10756, 8027952778393119762L ^ var2));
   }

   public StructureMineshaftPieces$Corridor(int param1, Random param2, yve param3, vt2 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: invokespecial xi1.<init> (I)V
      // 05: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 08: aload 0
      // 09: aload 4
      // 0b: putfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.p7m Lvt2;
      // 0e: aload 0
      // 0f: aload 3
      // 10: putfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 13: astore 5
      // 15: aload 0
      // 16: aload 2
      // 17: bipush 3
      // 18: invokevirtual java/util/Random.nextInt (I)I
      // 1b: aload 5
      // 1d: ifnull 2b
      // 20: ifne 2e
      // 23: goto 2a
      // 26: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 29: athrow
      // 2a: bipush 1
      // 2b: goto 2f
      // 2e: bipush 0
      // 2f: putfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor._0j Z
      // 32: aload 0
      // 33: aload 0
      // 34: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor._0j Z
      // 37: aload 5
      // 39: ifnull 53
      // 3c: ifne 66
      // 3f: goto 46
      // 42: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 2
      // 47: bipush 23
      // 49: invokevirtual java/util/Random.nextInt (I)I
      // 4c: goto 53
      // 4f: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 5
      // 55: ifnull 63
      // 58: ifne 66
      // 5b: goto 62
      // 5e: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 61: athrow
      // 62: bipush 1
      // 63: goto 67
      // 66: bipush 0
      // 67: putfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor._4p Z
      // 6a: aload 0
      // 6b: aload 5
      // 6d: ifnull bb
      // 70: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.p7m Lvt2;
      // 73: getstatic vt2.z9q Lvt2;
      // 76: if_acmpeq b3
      // 79: goto 80
      // 7c: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 0
      // 81: aload 5
      // 83: ifnull bb
      // 86: goto 8d
      // 89: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 8c: athrow
      // 8d: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.p7m Lvt2;
      // 90: getstatic vt2.mxp Lvt2;
      // 93: if_acmpeq b3
      // 96: goto 9d
      // 99: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 9c: athrow
      // 9d: aload 0
      // 9e: aload 3
      // 9f: invokevirtual yve.num ()I
      // a2: bipush 5
      // a3: idiv
      // a4: putfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.itx I
      // a7: aload 5
      // a9: ifnonnull c4
      // ac: goto b3
      // af: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // b2: athrow
      // b3: aload 0
      // b4: goto bb
      // b7: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // ba: athrow
      // bb: aload 3
      // bc: invokevirtual yve.ut6 ()I
      // bf: bipush 5
      // c0: idiv
      // c1: putfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.itx I
      // c4: return
   }

   public static yve i8b(List param0, Random param1, int param2, int param3, int param4, vt2 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new yve
      // 003: dup
      // 004: iload 2
      // 005: iload 3
      // 006: iload 4
      // 008: iload 2
      // 009: iload 3
      // 00a: bipush 2
      // 00b: iadd
      // 00c: iload 4
      // 00e: invokespecial yve.<init> (IIIIII)V
      // 011: astore 7
      // 013: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 016: aload 1
      // 017: bipush 3
      // 018: invokevirtual java/util/Random.nextInt (I)I
      // 01b: bipush 2
      // 01c: iadd
      // 01d: istore 8
      // 01f: astore 6
      // 021: iload 8
      // 023: ifle 0fb
      // 026: iload 8
      // 028: bipush 5
      // 029: imul
      // 02a: istore 9
      // 02c: aload 6
      // 02e: ifnull 083
      // 031: getstatic net/minecraft/world/gen/structure/StructureMineshaftPieces$1.u_1 [I
      // 034: aload 5
      // 036: invokevirtual vt2.ordinal ()I
      // 039: iaload
      // 03a: aload 6
      // 03c: ifnull 0fd
      // 03f: goto 046
      // 042: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 045: athrow
      // 046: tableswitch 157 1 4 34 66 98 130
      // 064: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 067: athrow
      // 068: aload 7
      // 06a: iload 2
      // 06b: bipush 2
      // 06c: iadd
      // 06d: putfield yve.kwp I
      // 070: aload 7
      // 072: iload 4
      // 074: iload 9
      // 076: bipush 1
      // 077: isub
      // 078: isub
      // 079: putfield yve.ob0 I
      // 07c: goto 083
      // 07f: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 082: athrow
      // 083: aload 6
      // 085: ifnonnull 0e3
      // 088: aload 7
      // 08a: iload 2
      // 08b: bipush 2
      // 08c: iadd
      // 08d: putfield yve.kwp I
      // 090: aload 7
      // 092: iload 4
      // 094: iload 9
      // 096: bipush 1
      // 097: isub
      // 098: iadd
      // 099: putfield yve.nwc I
      // 09c: aload 6
      // 09e: ifnonnull 0e3
      // 0a1: goto 0a8
      // 0a4: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 7
      // 0aa: iload 2
      // 0ab: iload 9
      // 0ad: bipush 1
      // 0ae: isub
      // 0af: isub
      // 0b0: putfield yve.gdj I
      // 0b3: aload 7
      // 0b5: iload 4
      // 0b7: bipush 2
      // 0b8: iadd
      // 0b9: putfield yve.nwc I
      // 0bc: aload 6
      // 0be: ifnonnull 0e3
      // 0c1: goto 0c8
      // 0c4: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 7
      // 0ca: iload 2
      // 0cb: iload 9
      // 0cd: bipush 1
      // 0ce: isub
      // 0cf: iadd
      // 0d0: putfield yve.kwp I
      // 0d3: aload 7
      // 0d5: iload 4
      // 0d7: bipush 2
      // 0d8: iadd
      // 0d9: putfield yve.nwc I
      // 0dc: goto 0e3
      // 0df: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: aload 7
      // 0e6: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 0e9: ifnonnull 0f3
      // 0ec: goto 0fb
      // 0ef: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: iinc 8 -1
      // 0f6: aload 6
      // 0f8: ifnonnull 021
      // 0fb: iload 8
      // 0fd: ifle 109
      // 100: aload 7
      // 102: goto 10a
      // 105: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 108: athrow
      // 109: aconst_null
      // 10a: areturn
   }

   @Override
   public void vxr(xi1 param1, List param2, Random param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.gd3 ()I
      // 004: istore 5
      // 006: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 009: aload 3
      // 00a: bipush 4
      // 00b: invokevirtual java/util/Random.nextInt (I)I
      // 00e: istore 6
      // 010: astore 4
      // 012: aload 0
      // 013: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.p7m Lvt2;
      // 016: ifnull 387
      // 019: getstatic net/minecraft/world/gen/structure/StructureMineshaftPieces$1.u_1 [I
      // 01c: aload 0
      // 01d: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.p7m Lvt2;
      // 020: invokevirtual vt2.ordinal ()I
      // 023: iaload
      // 024: aload 4
      // 026: ifnull 389
      // 029: goto 030
      // 02c: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 02f: athrow
      // 030: tableswitch 855 1 4 36 240 448 652
      // 050: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 053: athrow
      // 054: iload 6
      // 056: bipush 1
      // 057: aload 4
      // 059: ifnull 0af
      // 05c: goto 063
      // 05f: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 062: athrow
      // 063: if_icmpgt 0a5
      // 066: goto 06d
      // 069: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 06c: athrow
      // 06d: aload 1
      // 06e: aload 2
      // 06f: aload 3
      // 070: aload 0
      // 071: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 074: getfield yve.gdj I
      // 077: aload 0
      // 078: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 07b: getfield yve._3o I
      // 07e: bipush 1
      // 07f: isub
      // 080: aload 3
      // 081: bipush 3
      // 082: invokevirtual java/util/Random.nextInt (I)I
      // 085: iadd
      // 086: aload 0
      // 087: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 08a: getfield yve.ob0 I
      // 08d: bipush 1
      // 08e: isub
      // 08f: aload 0
      // 090: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.p7m Lvt2;
      // 093: iload 5
      // 095: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 098: pop
      // 099: aload 4
      // 09b: ifnonnull 387
      // 09e: goto 0a5
      // 0a1: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: iload 6
      // 0a7: bipush 2
      // 0a8: goto 0af
      // 0ab: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: if_icmpne 0e9
      // 0b2: aload 1
      // 0b3: aload 2
      // 0b4: aload 3
      // 0b5: aload 0
      // 0b6: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 0b9: getfield yve.gdj I
      // 0bc: bipush 1
      // 0bd: isub
      // 0be: aload 0
      // 0bf: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 0c2: getfield yve._3o I
      // 0c5: bipush 1
      // 0c6: isub
      // 0c7: aload 3
      // 0c8: bipush 3
      // 0c9: invokevirtual java/util/Random.nextInt (I)I
      // 0cc: iadd
      // 0cd: aload 0
      // 0ce: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 0d1: getfield yve.ob0 I
      // 0d4: getstatic vt2.te4 Lvt2;
      // 0d7: iload 5
      // 0d9: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 0dc: pop
      // 0dd: aload 4
      // 0df: ifnonnull 387
      // 0e2: goto 0e9
      // 0e5: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aload 1
      // 0ea: aload 2
      // 0eb: aload 3
      // 0ec: aload 0
      // 0ed: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 0f0: getfield yve.kwp I
      // 0f3: bipush 1
      // 0f4: iadd
      // 0f5: aload 0
      // 0f6: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 0f9: getfield yve._3o I
      // 0fc: bipush 1
      // 0fd: isub
      // 0fe: aload 3
      // 0ff: bipush 3
      // 100: invokevirtual java/util/Random.nextInt (I)I
      // 103: iadd
      // 104: aload 0
      // 105: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 108: getfield yve.ob0 I
      // 10b: getstatic vt2.zk4 Lvt2;
      // 10e: iload 5
      // 110: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 113: pop
      // 114: aload 4
      // 116: ifnonnull 387
      // 119: goto 120
      // 11c: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 11f: athrow
      // 120: iload 6
      // 122: bipush 1
      // 123: aload 4
      // 125: ifnull 17b
      // 128: goto 12f
      // 12b: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 12e: athrow
      // 12f: if_icmpgt 171
      // 132: goto 139
      // 135: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 138: athrow
      // 139: aload 1
      // 13a: aload 2
      // 13b: aload 3
      // 13c: aload 0
      // 13d: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 140: getfield yve.gdj I
      // 143: aload 0
      // 144: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 147: getfield yve._3o I
      // 14a: bipush 1
      // 14b: isub
      // 14c: aload 3
      // 14d: bipush 3
      // 14e: invokevirtual java/util/Random.nextInt (I)I
      // 151: iadd
      // 152: aload 0
      // 153: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 156: getfield yve.nwc I
      // 159: bipush 1
      // 15a: iadd
      // 15b: aload 0
      // 15c: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.p7m Lvt2;
      // 15f: iload 5
      // 161: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 164: pop
      // 165: aload 4
      // 167: ifnonnull 387
      // 16a: goto 171
      // 16d: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 170: athrow
      // 171: iload 6
      // 173: bipush 2
      // 174: goto 17b
      // 177: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 17a: athrow
      // 17b: if_icmpne 1b7
      // 17e: aload 1
      // 17f: aload 2
      // 180: aload 3
      // 181: aload 0
      // 182: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 185: getfield yve.gdj I
      // 188: bipush 1
      // 189: isub
      // 18a: aload 0
      // 18b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 18e: getfield yve._3o I
      // 191: bipush 1
      // 192: isub
      // 193: aload 3
      // 194: bipush 3
      // 195: invokevirtual java/util/Random.nextInt (I)I
      // 198: iadd
      // 199: aload 0
      // 19a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 19d: getfield yve.nwc I
      // 1a0: bipush 3
      // 1a1: isub
      // 1a2: getstatic vt2.te4 Lvt2;
      // 1a5: iload 5
      // 1a7: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 1aa: pop
      // 1ab: aload 4
      // 1ad: ifnonnull 387
      // 1b0: goto 1b7
      // 1b3: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: aload 1
      // 1b8: aload 2
      // 1b9: aload 3
      // 1ba: aload 0
      // 1bb: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 1be: getfield yve.kwp I
      // 1c1: bipush 1
      // 1c2: iadd
      // 1c3: aload 0
      // 1c4: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 1c7: getfield yve._3o I
      // 1ca: bipush 1
      // 1cb: isub
      // 1cc: aload 3
      // 1cd: bipush 3
      // 1ce: invokevirtual java/util/Random.nextInt (I)I
      // 1d1: iadd
      // 1d2: aload 0
      // 1d3: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 1d6: getfield yve.nwc I
      // 1d9: bipush 3
      // 1da: isub
      // 1db: getstatic vt2.zk4 Lvt2;
      // 1de: iload 5
      // 1e0: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 1e3: pop
      // 1e4: aload 4
      // 1e6: ifnonnull 387
      // 1e9: goto 1f0
      // 1ec: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: iload 6
      // 1f2: bipush 1
      // 1f3: aload 4
      // 1f5: ifnull 24b
      // 1f8: goto 1ff
      // 1fb: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 1fe: athrow
      // 1ff: if_icmpgt 241
      // 202: goto 209
      // 205: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 208: athrow
      // 209: aload 1
      // 20a: aload 2
      // 20b: aload 3
      // 20c: aload 0
      // 20d: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 210: getfield yve.gdj I
      // 213: bipush 1
      // 214: isub
      // 215: aload 0
      // 216: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 219: getfield yve._3o I
      // 21c: bipush 1
      // 21d: isub
      // 21e: aload 3
      // 21f: bipush 3
      // 220: invokevirtual java/util/Random.nextInt (I)I
      // 223: iadd
      // 224: aload 0
      // 225: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 228: getfield yve.ob0 I
      // 22b: aload 0
      // 22c: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.p7m Lvt2;
      // 22f: iload 5
      // 231: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 234: pop
      // 235: aload 4
      // 237: ifnonnull 387
      // 23a: goto 241
      // 23d: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 240: athrow
      // 241: iload 6
      // 243: bipush 2
      // 244: goto 24b
      // 247: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 24a: athrow
      // 24b: if_icmpne 285
      // 24e: aload 1
      // 24f: aload 2
      // 250: aload 3
      // 251: aload 0
      // 252: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 255: getfield yve.gdj I
      // 258: aload 0
      // 259: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 25c: getfield yve._3o I
      // 25f: bipush 1
      // 260: isub
      // 261: aload 3
      // 262: bipush 3
      // 263: invokevirtual java/util/Random.nextInt (I)I
      // 266: iadd
      // 267: aload 0
      // 268: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 26b: getfield yve.ob0 I
      // 26e: bipush 1
      // 26f: isub
      // 270: getstatic vt2.z9q Lvt2;
      // 273: iload 5
      // 275: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 278: pop
      // 279: aload 4
      // 27b: ifnonnull 387
      // 27e: goto 285
      // 281: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 284: athrow
      // 285: aload 1
      // 286: aload 2
      // 287: aload 3
      // 288: aload 0
      // 289: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 28c: getfield yve.gdj I
      // 28f: aload 0
      // 290: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 293: getfield yve._3o I
      // 296: bipush 1
      // 297: isub
      // 298: aload 3
      // 299: bipush 3
      // 29a: invokevirtual java/util/Random.nextInt (I)I
      // 29d: iadd
      // 29e: aload 0
      // 29f: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 2a2: getfield yve.nwc I
      // 2a5: bipush 1
      // 2a6: iadd
      // 2a7: getstatic vt2.mxp Lvt2;
      // 2aa: iload 5
      // 2ac: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 2af: pop
      // 2b0: aload 4
      // 2b2: ifnonnull 387
      // 2b5: goto 2bc
      // 2b8: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 2bb: athrow
      // 2bc: iload 6
      // 2be: bipush 1
      // 2bf: aload 4
      // 2c1: ifnull 317
      // 2c4: goto 2cb
      // 2c7: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 2ca: athrow
      // 2cb: if_icmpgt 30d
      // 2ce: goto 2d5
      // 2d1: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 2d4: athrow
      // 2d5: aload 1
      // 2d6: aload 2
      // 2d7: aload 3
      // 2d8: aload 0
      // 2d9: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 2dc: getfield yve.kwp I
      // 2df: bipush 1
      // 2e0: iadd
      // 2e1: aload 0
      // 2e2: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 2e5: getfield yve._3o I
      // 2e8: bipush 1
      // 2e9: isub
      // 2ea: aload 3
      // 2eb: bipush 3
      // 2ec: invokevirtual java/util/Random.nextInt (I)I
      // 2ef: iadd
      // 2f0: aload 0
      // 2f1: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 2f4: getfield yve.ob0 I
      // 2f7: aload 0
      // 2f8: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.p7m Lvt2;
      // 2fb: iload 5
      // 2fd: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 300: pop
      // 301: aload 4
      // 303: ifnonnull 387
      // 306: goto 30d
      // 309: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 30c: athrow
      // 30d: iload 6
      // 30f: bipush 2
      // 310: goto 317
      // 313: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 316: athrow
      // 317: if_icmpne 353
      // 31a: aload 1
      // 31b: aload 2
      // 31c: aload 3
      // 31d: aload 0
      // 31e: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 321: getfield yve.kwp I
      // 324: bipush 3
      // 325: isub
      // 326: aload 0
      // 327: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 32a: getfield yve._3o I
      // 32d: bipush 1
      // 32e: isub
      // 32f: aload 3
      // 330: bipush 3
      // 331: invokevirtual java/util/Random.nextInt (I)I
      // 334: iadd
      // 335: aload 0
      // 336: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 339: getfield yve.ob0 I
      // 33c: bipush 1
      // 33d: isub
      // 33e: getstatic vt2.z9q Lvt2;
      // 341: iload 5
      // 343: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 346: pop
      // 347: aload 4
      // 349: ifnonnull 387
      // 34c: goto 353
      // 34f: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 352: athrow
      // 353: aload 1
      // 354: aload 2
      // 355: aload 3
      // 356: aload 0
      // 357: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 35a: getfield yve.kwp I
      // 35d: bipush 3
      // 35e: isub
      // 35f: aload 0
      // 360: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 363: getfield yve._3o I
      // 366: bipush 1
      // 367: isub
      // 368: aload 3
      // 369: bipush 3
      // 36a: invokevirtual java/util/Random.nextInt (I)I
      // 36d: iadd
      // 36e: aload 0
      // 36f: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 372: getfield yve.nwc I
      // 375: bipush 1
      // 376: iadd
      // 377: getstatic vt2.mxp Lvt2;
      // 37a: iload 5
      // 37c: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 37f: pop
      // 380: goto 387
      // 383: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 386: athrow
      // 387: iload 5
      // 389: bipush 8
      // 38b: if_icmpge 512
      // 38e: aload 0
      // 38f: aload 4
      // 391: ifnull 47a
      // 394: goto 39b
      // 397: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 39a: athrow
      // 39b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.p7m Lvt2;
      // 39e: getstatic vt2.z9q Lvt2;
      // 3a1: if_acmpeq 472
      // 3a4: goto 3ab
      // 3a7: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 3aa: athrow
      // 3ab: aload 0
      // 3ac: aload 4
      // 3ae: ifnull 47a
      // 3b1: goto 3b8
      // 3b4: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 3b7: athrow
      // 3b8: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.p7m Lvt2;
      // 3bb: getstatic vt2.mxp Lvt2;
      // 3be: if_acmpeq 472
      // 3c1: goto 3c8
      // 3c4: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 3c7: athrow
      // 3c8: aload 0
      // 3c9: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 3cc: getfield yve.gdj I
      // 3cf: bipush 3
      // 3d0: iadd
      // 3d1: istore 7
      // 3d3: iload 7
      // 3d5: bipush 3
      // 3d6: iadd
      // 3d7: aload 0
      // 3d8: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 3db: getfield yve.kwp I
      // 3de: if_icmpgt 46d
      // 3e1: aload 3
      // 3e2: bipush 5
      // 3e3: invokevirtual java/util/Random.nextInt (I)I
      // 3e6: istore 8
      // 3e8: aload 4
      // 3ea: ifnull 512
      // 3ed: iload 8
      // 3ef: aload 4
      // 3f1: ifnull 43a
      // 3f4: goto 3fb
      // 3f7: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 3fa: athrow
      // 3fb: ifne 431
      // 3fe: goto 405
      // 401: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 404: athrow
      // 405: aload 1
      // 406: aload 2
      // 407: aload 3
      // 408: iload 7
      // 40a: aload 0
      // 40b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 40e: getfield yve._3o I
      // 411: aload 0
      // 412: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 415: getfield yve.ob0 I
      // 418: bipush 1
      // 419: isub
      // 41a: getstatic vt2.z9q Lvt2;
      // 41d: iload 5
      // 41f: bipush 1
      // 420: iadd
      // 421: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 424: pop
      // 425: aload 4
      // 427: ifnonnull 465
      // 42a: goto 431
      // 42d: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 430: athrow
      // 431: iload 8
      // 433: goto 43a
      // 436: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 439: athrow
      // 43a: bipush 1
      // 43b: if_icmpne 465
      // 43e: aload 1
      // 43f: aload 2
      // 440: aload 3
      // 441: iload 7
      // 443: aload 0
      // 444: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 447: getfield yve._3o I
      // 44a: aload 0
      // 44b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 44e: getfield yve.nwc I
      // 451: bipush 1
      // 452: iadd
      // 453: getstatic vt2.mxp Lvt2;
      // 456: iload 5
      // 458: bipush 1
      // 459: iadd
      // 45a: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 45d: pop
      // 45e: goto 465
      // 461: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 464: athrow
      // 465: iinc 7 5
      // 468: aload 4
      // 46a: ifnonnull 3d3
      // 46d: aload 4
      // 46f: ifnonnull 512
      // 472: aload 0
      // 473: goto 47a
      // 476: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 479: athrow
      // 47a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 47d: getfield yve.ob0 I
      // 480: bipush 3
      // 481: iadd
      // 482: istore 7
      // 484: iload 7
      // 486: bipush 3
      // 487: iadd
      // 488: aload 0
      // 489: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 48c: getfield yve.nwc I
      // 48f: if_icmpgt 512
      // 492: aload 3
      // 493: bipush 5
      // 494: invokevirtual java/util/Random.nextInt (I)I
      // 497: istore 8
      // 499: iload 8
      // 49b: aload 4
      // 49d: ifnull 4df
      // 4a0: ifne 4d6
      // 4a3: goto 4aa
      // 4a6: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 4a9: athrow
      // 4aa: aload 1
      // 4ab: aload 2
      // 4ac: aload 3
      // 4ad: aload 0
      // 4ae: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 4b1: getfield yve.gdj I
      // 4b4: bipush 1
      // 4b5: isub
      // 4b6: aload 0
      // 4b7: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 4ba: getfield yve._3o I
      // 4bd: iload 7
      // 4bf: getstatic vt2.te4 Lvt2;
      // 4c2: iload 5
      // 4c4: bipush 1
      // 4c5: iadd
      // 4c6: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 4c9: pop
      // 4ca: aload 4
      // 4cc: ifnonnull 50a
      // 4cf: goto 4d6
      // 4d2: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 4d5: athrow
      // 4d6: iload 8
      // 4d8: goto 4df
      // 4db: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 4de: athrow
      // 4df: bipush 1
      // 4e0: if_icmpne 50a
      // 4e3: aload 1
      // 4e4: aload 2
      // 4e5: aload 3
      // 4e6: aload 0
      // 4e7: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 4ea: getfield yve.kwp I
      // 4ed: bipush 1
      // 4ee: iadd
      // 4ef: aload 0
      // 4f0: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.yqm Lyve;
      // 4f3: getfield yve._3o I
      // 4f6: iload 7
      // 4f8: getstatic vt2.zk4 Lvt2;
      // 4fb: iload 5
      // 4fd: bipush 1
      // 4fe: iadd
      // 4ff: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 502: pop
      // 503: goto 50a
      // 506: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 509: athrow
      // 50a: iinc 7 5
      // 50d: aload 4
      // 50f: ifnonnull 484
      // 512: return
   }

   @Override
   public boolean y6k(OpaquePredicate param1, yve param2, Random param3, int param4, int param5, int param6, List param7, int param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 9
      // 05: new mew
      // 08: dup
      // 09: aload 0
      // 0a: iload 4
      // 0c: iload 6
      // 0e: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.q__ (II)I
      // 11: aload 0
      // 12: iload 5
      // 14: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor._tw (I)I
      // 17: aload 0
      // 18: iload 4
      // 1a: iload 6
      // 1c: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor._ye (II)I
      // 1f: invokespecial mew.<init> (III)V
      // 22: astore 10
      // 24: aload 2
      // 25: aload 10
      // 27: invokevirtual yve.vwy (Lwgo;)Z
      // 2a: aload 9
      // 2c: ifnull cb
      // 2f: ifeq ca
      // 32: goto 39
      // 35: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 1
      // 3a: aload 10
      // 3c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 3f: invokeinterface zfz.r_y ()Le0x; 1
      // 44: invokevirtual e0x.p1r ()Lp3y;
      // 47: getstatic p3y.cei Lp3y;
      // 4a: if_acmpne ca
      // 4d: goto 54
      // 50: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 3
      // 55: invokevirtual java/util/Random.nextBoolean ()Z
      // 58: aload 9
      // 5a: ifnull 6f
      // 5d: goto 64
      // 60: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 63: athrow
      // 64: ifeq 72
      // 67: goto 6e
      // 6a: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 6d: athrow
      // 6e: bipush 1
      // 6f: goto 73
      // 72: bipush 0
      // 73: istore 11
      // 75: aload 1
      // 76: aload 10
      // 78: getstatic ox_.r_v Le0x;
      // 7b: aload 0
      // 7c: getstatic ox_.r_v Le0x;
      // 7f: iload 11
      // 81: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.ujv (Le0x;I)I
      // 84: invokevirtual e0x.kig (I)Lzfz;
      // 87: bipush 2
      // 88: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 8b: pop
      // 8c: new txf
      // 8f: dup
      // 90: aload 1
      // 91: aload 10
      // 93: invokevirtual mew.getX ()I
      // 96: i2f
      // 97: ldc 0.5
      // 99: nop
      // 9a: fadd
      // 9b: f2d
      // 9c: aload 10
      // 9e: invokevirtual mew.getY ()I
      // a1: i2f
      // a2: ldc 0.5
      // a4: nop
      // a5: fadd
      // a6: f2d
      // a7: aload 10
      // a9: invokevirtual mew.getZ ()I
      // ac: i2f
      // ad: ldc 0.5
      // af: nop
      // b0: fadd
      // b1: f2d
      // b2: invokespecial txf.<init> (Lt9d;DDD)V
      // b5: astore 12
      // b7: aload 3
      // b8: aload 7
      // ba: aload 12
      // bc: iload 8
      // be: invokestatic ypi.hut (Ljava/util/Random;Ljava/util/List;Lrsi;I)V
      // c1: aload 1
      // c2: aload 12
      // c4: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // c7: pop
      // c8: bipush 1
      // c9: ireturn
      // ca: bipush 0
      // cb: ireturn
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
      // 000: getstatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a J
      // 003: ldc2_w 17906069771392
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 00c: astore 6
      // 00e: aload 0
      // 00f: aload 1
      // 010: aload 3
      // 011: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.knc (Lt9d;Lyve;)Z
      // 014: aload 6
      // 016: ifnull 02a
      // 019: ifeq 029
      // 01c: goto 023
      // 01f: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 022: athrow
      // 023: bipush 0
      // 024: ireturn
      // 025: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 028: athrow
      // 029: bipush 0
      // 02a: istore 7
      // 02c: bipush 2
      // 02d: istore 8
      // 02f: bipush 0
      // 030: istore 9
      // 032: bipush 2
      // 033: istore 10
      // 035: aload 0
      // 036: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.itx I
      // 039: bipush 5
      // 03a: imul
      // 03b: bipush 1
      // 03c: isub
      // 03d: istore 11
      // 03f: aload 0
      // 040: aload 1
      // 041: aload 3
      // 042: bipush 0
      // 043: bipush 0
      // 044: bipush 0
      // 045: bipush 2
      // 046: bipush 1
      // 047: iload 11
      // 049: getstatic ox_.ibw Le0x;
      // 04c: invokevirtual e0x.l4i ()Lzfz;
      // 04f: getstatic ox_.ibw Le0x;
      // 052: invokevirtual e0x.l4i ()Lzfz;
      // 055: bipush 0
      // 056: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 059: aload 0
      // 05a: aload 1
      // 05b: aload 3
      // 05c: aload 2
      // 05d: ldc 0.8
      // 05f: nop
      // 060: bipush 0
      // 061: bipush 2
      // 062: bipush 0
      // 063: bipush 2
      // 064: bipush 2
      // 065: iload 11
      // 067: getstatic ox_.ibw Le0x;
      // 06a: invokevirtual e0x.l4i ()Lzfz;
      // 06d: getstatic ox_.ibw Le0x;
      // 070: invokevirtual e0x.l4i ()Lzfz;
      // 073: bipush 0
      // 074: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.ne7 (Lt9d;Lyve;Ljava/util/Random;FIIIIIILzfz;Lzfz;Z)V
      // 077: aload 0
      // 078: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor._4p Z
      // 07b: aload 6
      // 07d: ifnull 0b0
      // 080: ifeq 0af
      // 083: goto 08a
      // 086: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 089: athrow
      // 08a: aload 0
      // 08b: aload 1
      // 08c: aload 3
      // 08d: aload 2
      // 08e: ldc 0.6
      // 090: nop
      // 091: bipush 0
      // 092: bipush 0
      // 093: bipush 0
      // 094: bipush 2
      // 095: bipush 1
      // 096: iload 11
      // 098: getstatic ox_.gna Le0x;
      // 09b: invokevirtual e0x.l4i ()Lzfz;
      // 09e: getstatic ox_.ibw Le0x;
      // 0a1: invokevirtual e0x.l4i ()Lzfz;
      // 0a4: bipush 0
      // 0a5: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.ne7 (Lt9d;Lyve;Ljava/util/Random;FIIIIIILzfz;Lzfz;Z)V
      // 0a8: goto 0af
      // 0ab: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: bipush 0
      // 0b0: istore 12
      // 0b2: iload 12
      // 0b4: aload 0
      // 0b5: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.itx I
      // 0b8: if_icmpge 3c4
      // 0bb: bipush 2
      // 0bc: iload 12
      // 0be: bipush 5
      // 0bf: imul
      // 0c0: iadd
      // 0c1: istore 13
      // 0c3: aload 0
      // 0c4: aload 1
      // 0c5: aload 3
      // 0c6: bipush 0
      // 0c7: bipush 0
      // 0c8: iload 13
      // 0ca: bipush 0
      // 0cb: bipush 1
      // 0cc: iload 13
      // 0ce: getstatic ox_.j5b Le0x;
      // 0d1: invokevirtual e0x.l4i ()Lzfz;
      // 0d4: getstatic ox_.ibw Le0x;
      // 0d7: invokevirtual e0x.l4i ()Lzfz;
      // 0da: bipush 0
      // 0db: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0de: aload 0
      // 0df: aload 1
      // 0e0: aload 3
      // 0e1: bipush 2
      // 0e2: bipush 0
      // 0e3: iload 13
      // 0e5: bipush 2
      // 0e6: bipush 1
      // 0e7: iload 13
      // 0e9: getstatic ox_.j5b Le0x;
      // 0ec: invokevirtual e0x.l4i ()Lzfz;
      // 0ef: getstatic ox_.ibw Le0x;
      // 0f2: invokevirtual e0x.l4i ()Lzfz;
      // 0f5: bipush 0
      // 0f6: aload 6
      // 0f8: ifnull 17a
      // 0fb: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0fe: aload 2
      // 0ff: bipush 4
      // 100: invokevirtual java/util/Random.nextInt (I)I
      // 103: aload 6
      // 105: ifnull 3c5
      // 108: goto 10f
      // 10b: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 10e: athrow
      // 10f: ifne 15b
      // 112: goto 119
      // 115: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 0
      // 11a: aload 1
      // 11b: aload 3
      // 11c: bipush 0
      // 11d: bipush 2
      // 11e: iload 13
      // 120: bipush 0
      // 121: bipush 2
      // 122: iload 13
      // 124: getstatic ox_.wb7 Le0x;
      // 127: invokevirtual e0x.l4i ()Lzfz;
      // 12a: getstatic ox_.ibw Le0x;
      // 12d: invokevirtual e0x.l4i ()Lzfz;
      // 130: bipush 0
      // 131: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 134: aload 0
      // 135: aload 1
      // 136: aload 3
      // 137: bipush 2
      // 138: bipush 2
      // 139: iload 13
      // 13b: bipush 2
      // 13c: bipush 2
      // 13d: iload 13
      // 13f: getstatic ox_.wb7 Le0x;
      // 142: invokevirtual e0x.l4i ()Lzfz;
      // 145: getstatic ox_.ibw Le0x;
      // 148: invokevirtual e0x.l4i ()Lzfz;
      // 14b: bipush 0
      // 14c: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 14f: aload 6
      // 151: ifnonnull 17d
      // 154: goto 15b
      // 157: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 15a: athrow
      // 15b: aload 0
      // 15c: aload 1
      // 15d: aload 3
      // 15e: bipush 0
      // 15f: bipush 2
      // 160: iload 13
      // 162: bipush 2
      // 163: bipush 2
      // 164: iload 13
      // 166: getstatic ox_.wb7 Le0x;
      // 169: invokevirtual e0x.l4i ()Lzfz;
      // 16c: getstatic ox_.ibw Le0x;
      // 16f: invokevirtual e0x.l4i ()Lzfz;
      // 172: bipush 0
      // 173: goto 17a
      // 176: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 179: athrow
      // 17a: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 17d: aload 0
      // 17e: aload 1
      // 17f: aload 3
      // 180: aload 2
      // 181: ldc 0.1
      // 183: nop
      // 184: bipush 0
      // 185: bipush 2
      // 186: iload 13
      // 188: bipush 1
      // 189: isub
      // 18a: getstatic ox_.gna Le0x;
      // 18d: invokevirtual e0x.l4i ()Lzfz;
      // 190: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 193: aload 0
      // 194: aload 1
      // 195: aload 3
      // 196: aload 2
      // 197: ldc 0.1
      // 199: nop
      // 19a: bipush 2
      // 19b: bipush 2
      // 19c: iload 13
      // 19e: bipush 1
      // 19f: isub
      // 1a0: getstatic ox_.gna Le0x;
      // 1a3: invokevirtual e0x.l4i ()Lzfz;
      // 1a6: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 1a9: aload 0
      // 1aa: aload 1
      // 1ab: aload 3
      // 1ac: aload 2
      // 1ad: ldc 0.1
      // 1af: nop
      // 1b0: bipush 0
      // 1b1: bipush 2
      // 1b2: iload 13
      // 1b4: bipush 1
      // 1b5: iadd
      // 1b6: getstatic ox_.gna Le0x;
      // 1b9: invokevirtual e0x.l4i ()Lzfz;
      // 1bc: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 1bf: aload 0
      // 1c0: aload 1
      // 1c1: aload 3
      // 1c2: aload 2
      // 1c3: ldc 0.1
      // 1c5: nop
      // 1c6: bipush 2
      // 1c7: bipush 2
      // 1c8: iload 13
      // 1ca: bipush 1
      // 1cb: iadd
      // 1cc: getstatic ox_.gna Le0x;
      // 1cf: invokevirtual e0x.l4i ()Lzfz;
      // 1d2: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 1d5: aload 0
      // 1d6: aload 1
      // 1d7: aload 3
      // 1d8: aload 2
      // 1d9: ldc 0.05
      // 1db: nop
      // 1dc: bipush 0
      // 1dd: bipush 2
      // 1de: iload 13
      // 1e0: bipush 2
      // 1e1: isub
      // 1e2: getstatic ox_.gna Le0x;
      // 1e5: invokevirtual e0x.l4i ()Lzfz;
      // 1e8: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 1eb: aload 0
      // 1ec: aload 1
      // 1ed: aload 3
      // 1ee: aload 2
      // 1ef: ldc 0.05
      // 1f1: nop
      // 1f2: bipush 2
      // 1f3: bipush 2
      // 1f4: iload 13
      // 1f6: bipush 2
      // 1f7: isub
      // 1f8: getstatic ox_.gna Le0x;
      // 1fb: invokevirtual e0x.l4i ()Lzfz;
      // 1fe: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 201: aload 0
      // 202: aload 1
      // 203: aload 3
      // 204: aload 2
      // 205: ldc 0.05
      // 207: nop
      // 208: bipush 0
      // 209: bipush 2
      // 20a: iload 13
      // 20c: bipush 2
      // 20d: iadd
      // 20e: getstatic ox_.gna Le0x;
      // 211: invokevirtual e0x.l4i ()Lzfz;
      // 214: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 217: aload 0
      // 218: aload 1
      // 219: aload 3
      // 21a: aload 2
      // 21b: ldc 0.05
      // 21d: nop
      // 21e: bipush 2
      // 21f: bipush 2
      // 220: iload 13
      // 222: bipush 2
      // 223: iadd
      // 224: getstatic ox_.gna Le0x;
      // 227: invokevirtual e0x.l4i ()Lzfz;
      // 22a: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 22d: aload 0
      // 22e: aload 1
      // 22f: aload 3
      // 230: aload 2
      // 231: ldc 0.05
      // 233: nop
      // 234: bipush 1
      // 235: bipush 2
      // 236: iload 13
      // 238: bipush 1
      // 239: isub
      // 23a: getstatic ox_.gt8 Le0x;
      // 23d: getstatic vt2.rf3 Lvt2;
      // 240: invokevirtual vt2.c3s ()I
      // 243: invokevirtual e0x.kig (I)Lzfz;
      // 246: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 249: aload 0
      // 24a: aload 1
      // 24b: aload 3
      // 24c: aload 2
      // 24d: ldc 0.05
      // 24f: nop
      // 250: bipush 1
      // 251: bipush 2
      // 252: iload 13
      // 254: bipush 1
      // 255: iadd
      // 256: getstatic ox_.gt8 Le0x;
      // 259: getstatic vt2.rf3 Lvt2;
      // 25c: invokevirtual vt2.c3s ()I
      // 25f: invokevirtual e0x.kig (I)Lzfz;
      // 262: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 265: aload 2
      // 266: bipush 100
      // 268: invokevirtual java/util/Random.nextInt (I)I
      // 26b: aload 6
      // 26d: ifnull 2b0
      // 270: ifne 2aa
      // 273: goto 27a
      // 276: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 279: athrow
      // 27a: aload 0
      // 27b: aload 1
      // 27c: aload 3
      // 27d: aload 2
      // 27e: bipush 2
      // 27f: bipush 0
      // 280: iload 13
      // 282: bipush 1
      // 283: isub
      // 284: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces._e6 ()Ljava/util/List;
      // 287: bipush 1
      // 288: anewarray 228
      // 28b: dup
      // 28c: bipush 0
      // 28d: getstatic xbr.frz Lnmo;
      // 290: aload 2
      // 291: invokevirtual nmo.z0_ (Ljava/util/Random;)Lypi;
      // 294: aastore
      // 295: invokestatic ypi.voc (Ljava/util/List;[Lypi;)Ljava/util/List;
      // 298: bipush 3
      // 299: aload 2
      // 29a: bipush 4
      // 29b: invokevirtual java/util/Random.nextInt (I)I
      // 29e: iadd
      // 29f: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.y6k (Lt9d;Lyve;Ljava/util/Random;IIILjava/util/List;I)Z
      // 2a2: pop
      // 2a3: goto 2aa
      // 2a6: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 2a9: athrow
      // 2aa: aload 2
      // 2ab: bipush 100
      // 2ad: invokevirtual java/util/Random.nextInt (I)I
      // 2b0: aload 6
      // 2b2: ifnull 2f3
      // 2b5: ifne 2ef
      // 2b8: goto 2bf
      // 2bb: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 2be: athrow
      // 2bf: aload 0
      // 2c0: aload 1
      // 2c1: aload 3
      // 2c2: aload 2
      // 2c3: bipush 0
      // 2c4: bipush 0
      // 2c5: iload 13
      // 2c7: bipush 1
      // 2c8: iadd
      // 2c9: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces._e6 ()Ljava/util/List;
      // 2cc: bipush 1
      // 2cd: anewarray 228
      // 2d0: dup
      // 2d1: bipush 0
      // 2d2: getstatic xbr.frz Lnmo;
      // 2d5: aload 2
      // 2d6: invokevirtual nmo.z0_ (Ljava/util/Random;)Lypi;
      // 2d9: aastore
      // 2da: invokestatic ypi.voc (Ljava/util/List;[Lypi;)Ljava/util/List;
      // 2dd: bipush 3
      // 2de: aload 2
      // 2df: bipush 4
      // 2e0: invokevirtual java/util/Random.nextInt (I)I
      // 2e3: iadd
      // 2e4: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.y6k (Lt9d;Lyve;Ljava/util/Random;IIILjava/util/List;I)Z
      // 2e7: pop
      // 2e8: goto 2ef
      // 2eb: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 2ee: athrow
      // 2ef: aload 0
      // 2f0: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor._4p Z
      // 2f3: aload 6
      // 2f5: ifnull 30d
      // 2f8: ifeq 3bc
      // 2fb: goto 302
      // 2fe: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 301: athrow
      // 302: aload 0
      // 303: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cae Z
      // 306: goto 30d
      // 309: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 30c: athrow
      // 30d: aload 6
      // 30f: ifnull 328
      // 312: ifne 3bc
      // 315: goto 31c
      // 318: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 31b: athrow
      // 31c: aload 0
      // 31d: bipush 0
      // 31e: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor._tw (I)I
      // 321: goto 328
      // 324: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 327: athrow
      // 328: istore 14
      // 32a: iload 13
      // 32c: bipush 1
      // 32d: isub
      // 32e: aload 2
      // 32f: bipush 3
      // 330: invokevirtual java/util/Random.nextInt (I)I
      // 333: iadd
      // 334: istore 15
      // 336: aload 0
      // 337: bipush 1
      // 338: iload 15
      // 33a: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.q__ (II)I
      // 33d: istore 16
      // 33f: aload 0
      // 340: bipush 1
      // 341: iload 15
      // 343: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor._ye (II)I
      // 346: istore 15
      // 348: new mew
      // 34b: dup
      // 34c: iload 16
      // 34e: iload 14
      // 350: iload 15
      // 352: invokespecial mew.<init> (III)V
      // 355: astore 17
      // 357: aload 6
      // 359: ifnull 3bf
      // 35c: aload 3
      // 35d: aload 17
      // 35f: invokevirtual yve.vwy (Lwgo;)Z
      // 362: ifeq 3bc
      // 365: goto 36c
      // 368: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 36b: athrow
      // 36c: aload 0
      // 36d: bipush 1
      // 36e: putfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cae Z
      // 371: aload 1
      // 372: aload 17
      // 374: getstatic ox_.jvm Le0x;
      // 377: invokevirtual e0x.l4i ()Lzfz;
      // 37a: bipush 2
      // 37b: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 37e: pop
      // 37f: aload 1
      // 380: aload 17
      // 382: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 385: astore 18
      // 387: aload 6
      // 389: ifnull 3bf
      // 38c: aload 18
      // 38e: instanceof net/minecraft/tileentity/TileEntityMobSpawner
      // 391: ifeq 3bc
      // 394: goto 39b
      // 397: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 39a: athrow
      // 39b: aload 18
      // 39d: checkcast net/minecraft/tileentity/TileEntityMobSpawner
      // 3a0: invokevirtual net/minecraft/tileentity/TileEntityMobSpawner.ebe ()Laih;
      // 3a3: sipush 8510
      // 3a6: ldc2_w 5533779120129304781
      // 3a9: lload 4
      // 3ab: lxor
      // 3ac: invokedynamic s (IJ)Ljava/lang/String; bsm=net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b1: nop
      // 3b2: invokevirtual aih.ugq (Ljava/lang/String;)V
      // 3b5: goto 3bc
      // 3b8: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 3bb: athrow
      // 3bc: iinc 12 1
      // 3bf: aload 6
      // 3c1: ifnonnull 0b2
      // 3c4: bipush 0
      // 3c5: istore 12
      // 3c7: iload 12
      // 3c9: bipush 2
      // 3ca: if_icmpgt 43a
      // 3cd: bipush 0
      // 3ce: aload 6
      // 3d0: ifnull 43e
      // 3d3: istore 13
      // 3d5: iload 13
      // 3d7: iload 11
      // 3d9: if_icmpgt 432
      // 3dc: bipush -1
      // 3dd: istore 14
      // 3df: aload 0
      // 3e0: aload 1
      // 3e1: iload 12
      // 3e3: iload 14
      // 3e5: iload 13
      // 3e7: aload 3
      // 3e8: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.t90 (Lt9d;IIILyve;)Lzfz;
      // 3eb: astore 15
      // 3ed: aload 6
      // 3ef: ifnull 42d
      // 3f2: aload 15
      // 3f4: aload 6
      // 3f6: ifnull 461
      // 3f9: goto 400
      // 3fc: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 3ff: athrow
      // 400: invokeinterface zfz.r_y ()Le0x; 1
      // 405: invokevirtual e0x.p1r ()Lp3y;
      // 408: getstatic p3y.cei Lp3y;
      // 40b: if_acmpne 42a
      // 40e: goto 415
      // 411: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 414: athrow
      // 415: bipush -1
      // 416: istore 16
      // 418: aload 0
      // 419: aload 1
      // 41a: getstatic ox_.wb7 Le0x;
      // 41d: invokevirtual e0x.l4i ()Lzfz;
      // 420: iload 12
      // 422: iload 16
      // 424: iload 13
      // 426: aload 3
      // 427: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 42a: iinc 13 1
      // 42d: aload 6
      // 42f: ifnonnull 3d5
      // 432: iinc 12 1
      // 435: aload 6
      // 437: ifnonnull 3c7
      // 43a: aload 0
      // 43b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor._0j Z
      // 43e: aload 6
      // 440: ifnull 4bf
      // 443: ifeq 4be
      // 446: goto 44d
      // 449: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 44c: athrow
      // 44d: bipush 0
      // 44e: istore 12
      // 450: iload 12
      // 452: iload 11
      // 454: if_icmpgt 4be
      // 457: aload 0
      // 458: aload 1
      // 459: bipush 1
      // 45a: bipush -1
      // 45b: iload 12
      // 45d: aload 3
      // 45e: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.t90 (Lt9d;IIILyve;)Lzfz;
      // 461: astore 13
      // 463: aload 6
      // 465: ifnull 4b9
      // 468: aload 13
      // 46a: invokeinterface zfz.r_y ()Le0x; 1
      // 46f: invokevirtual e0x.p1r ()Lp3y;
      // 472: getstatic p3y.cei Lp3y;
      // 475: if_acmpeq 4b6
      // 478: goto 47f
      // 47b: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 47e: athrow
      // 47f: aload 13
      // 481: invokeinterface zfz.r_y ()Le0x; 1
      // 486: invokevirtual e0x.z4c ()Z
      // 489: ifeq 4b6
      // 48c: goto 493
      // 48f: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 492: athrow
      // 493: aload 0
      // 494: aload 1
      // 495: aload 3
      // 496: aload 2
      // 497: ldc 0.7
      // 499: nop
      // 49a: bipush 1
      // 49b: bipush 0
      // 49c: iload 12
      // 49e: getstatic ox_.r_v Le0x;
      // 4a1: aload 0
      // 4a2: getstatic ox_.r_v Le0x;
      // 4a5: bipush 0
      // 4a6: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.ujv (Le0x;I)I
      // 4a9: invokevirtual e0x.kig (I)Lzfz;
      // 4ac: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 4af: goto 4b6
      // 4b2: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor.a (Loov;)Loov;
      // 4b5: athrow
      // 4b6: iinc 12 1
      // 4b9: aload 6
      // 4bb: ifnonnull 450
      // 4be: bipush 1
      // 4bf: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-9173129184781143697L, 8184650171039384675L, MethodHandles.lookup().lookupClass()).a(205295644457477L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 112451203628754L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "Í\u0019ÜX°g\u001aÓü\u001dBÊJ0Ð\b\u0010v½\u0094\u0097VQ\u000e\u0082¼¥ø¹\u001a\u0015/Ý\u0010IÃ\u0099¾ïþ\u0098´ó\u0019r¢¸@[\u0005\u0010Õ£·\u009dâ1ÈS¼ æç¯.g\u0097\u0010xÎñ|v«¾V\u0002Yý¥.8v¤ \u00963*\u0098\u0005Ùí8\u0019\u008bÊyñÉ]ÚÁ»r\u0083\u001f:ßçQ\u0001CµÑ\u001f~\u0080\u0018ìCµVöÎ\u001d h£%ö\u0091û$\u0082\u0017÷sØÑ\u0084âI";
      int var8 = "Í\u0019ÜX°g\u001aÓü\u001dBÊJ0Ð\b\u0010v½\u0094\u0097VQ\u000e\u0082¼¥ø¹\u001a\u0015/Ý\u0010IÃ\u0099¾ïþ\u0098´ó\u0019r¢¸@[\u0005\u0010Õ£·\u009dâ1ÈS¼ æç¯.g\u0097\u0010xÎñ|v«¾V\u0002Yý¥.8v¤ \u00963*\u0098\u0005Ùí8\u0019\u008bÊyñÉ]ÚÁ»r\u0083\u001f:ßçQ\u0001CµÑ\u001f~\u0080\u0018ìCµVöÎ\u001d h£%ö\u0091û$\u0082\u0017÷sØÑ\u0084âI"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[9];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "?Ã\u009f,Þf\u0003°\u009fci.ÝÈ\f¢\u0010î\u008f\u0002`þYÏ\u0085ì%!Ùy\u0097\u0089\u001d";
                  var8 = "?Ã\u009f,Þf\u0003°\u009fci.ÝÈ\f¢\u0010î\u008f\u0002`þYÏ\u0085ì%!Ùy\u0097\u0089\u001d".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18995;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
