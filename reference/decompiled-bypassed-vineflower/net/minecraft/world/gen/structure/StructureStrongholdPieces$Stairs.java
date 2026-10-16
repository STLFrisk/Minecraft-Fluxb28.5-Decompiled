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

public class StructureStrongholdPieces$Stairs extends StructureStrongholdPieces$Stronghold {
   private boolean e1z;
   private static final long b;
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   public StructureStrongholdPieces$Stairs() {
   }

   public StructureStrongholdPieces$Stairs(int param1, Random param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.<init> (I)V
      // 05: aload 0
      // 06: bipush 1
      // 07: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.e1z Z
      // 0a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 0d: aload 0
      // 0e: getstatic vt2$unz.fzl Lvt2$unz;
      // 11: aload 2
      // 12: invokevirtual vt2$unz.cvs (Ljava/util/Random;)Lvt2;
      // 15: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.p7m Lvt2;
      // 18: astore 5
      // 1a: aload 0
      // 1b: aload 5
      // 1d: ifnull 81
      // 20: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy.waj Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 23: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.ppu Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 26: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$3.dds [I
      // 29: aload 0
      // 2a: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.p7m Lvt2;
      // 2d: invokevirtual vt2.ordinal ()I
      // 30: iaload
      // 31: lookupswitch 72 2 1 31 4 31
      // 4c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: new yve
      // 54: dup
      // 55: iload 3
      // 56: bipush 64
      // 58: iload 4
      // 5a: iload 3
      // 5b: bipush 5
      // 5c: iadd
      // 5d: bipush 1
      // 5e: isub
      // 5f: bipush 74
      // 61: iload 4
      // 63: bipush 5
      // 64: iadd
      // 65: bipush 1
      // 66: isub
      // 67: invokespecial yve.<init> (IIIIII)V
      // 6a: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.yqm Lyve;
      // 6d: aload 5
      // 6f: ifnonnull 9d
      // 72: goto 79
      // 75: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 0
      // 7a: goto 81
      // 7d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.a (Loov;)Loov;
      // 80: athrow
      // 81: new yve
      // 84: dup
      // 85: iload 3
      // 86: bipush 64
      // 88: iload 4
      // 8a: iload 3
      // 8b: bipush 5
      // 8c: iadd
      // 8d: bipush 1
      // 8e: isub
      // 8f: bipush 74
      // 91: iload 4
      // 93: bipush 5
      // 94: iadd
      // 95: bipush 1
      // 96: isub
      // 97: invokespecial yve.<init> (IIIIII)V
      // 9a: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.yqm Lyve;
      // 9d: return
   }

   public StructureStrongholdPieces$Stairs(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.e1z = false;
      this.p7m = var4;
      this.ppu = this.i2t(var2);
      this.yqm = var3;
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = b ^ 28234391004314L;
      super.z0d(var1);
      var1.zyu(c<"w">(16813, 1382933029732319178L ^ var2), this.e1z);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = b ^ 114342655749617L;
      super.oqf(var1);
      this.e1z = var1.dvl(c<"w">(24823, 4032808501842024442L ^ var2));
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
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 4
      // 05: aload 0
      // 06: aload 4
      // 08: ifnull 32
      // 0b: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.e1z Z
      // 0e: ifeq 26
      // 11: goto 18
      // 14: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.a (Loov;)Loov;
      // 17: athrow
      // 18: ldc net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing
      // 1a: nop
      // 1b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.oo9 (Ljava/lang/Class;)Ljava/lang/Class;
      // 1e: pop
      // 1f: goto 26
      // 22: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: aload 1
      // 28: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2
      // 2b: aload 2
      // 2c: aload 3
      // 2d: bipush 1
      // 2e: bipush 1
      // 2f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.bmb (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // 32: pop
      // 33: return
   }

   public static StructureStrongholdPieces$Stairs kdn(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 0b: bipush 5
      // 0c: aload 5
      // 0e: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 11: astore 7
      // 13: aload 7
      // 15: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.jty (Lyve;)Z
      // 18: ifeq 40
      // 1b: aload 0
      // 1c: aload 7
      // 1e: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 21: ifnonnull 40
      // 24: goto 2b
      // 27: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.a (Loov;)Loov;
      // 2a: athrow
      // 2b: new net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs
      // 2e: dup
      // 2f: iload 6
      // 31: aload 1
      // 32: aload 7
      // 34: aload 5
      // 36: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 39: goto 41
      // 3c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.a (Loov;)Loov;
      // 3f: athrow
      // 40: aconst_null
      // 41: areturn
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
      // 006: aload 1
      // 007: aload 3
      // 008: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.knc (Lt9d;Lyve;)Z
      // 00b: aload 4
      // 00d: ifnull 174
      // 010: ifeq 020
      // 013: goto 01a
      // 016: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.a (Loov;)Loov;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aload 1
      // 022: aload 3
      // 023: bipush 0
      // 024: bipush 0
      // 025: bipush 0
      // 026: bipush 4
      // 027: bipush 10
      // 029: bipush 4
      // 02a: bipush 1
      // 02b: aload 2
      // 02c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 02f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 032: aload 0
      // 033: aload 1
      // 034: aload 2
      // 035: aload 3
      // 036: aload 0
      // 037: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.ppu Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 03a: bipush 1
      // 03b: bipush 7
      // 03d: bipush 0
      // 03e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 041: aload 0
      // 042: aload 1
      // 043: aload 2
      // 044: aload 3
      // 045: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy.waj Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 048: bipush 1
      // 049: bipush 1
      // 04a: bipush 4
      // 04b: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 04e: aload 0
      // 04f: aload 1
      // 050: getstatic ox_.ow_ Le0x;
      // 053: invokevirtual e0x.l4i ()Lzfz;
      // 056: bipush 2
      // 057: bipush 6
      // 059: bipush 1
      // 05a: aload 3
      // 05b: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 05e: aload 0
      // 05f: aload 1
      // 060: getstatic ox_.ow_ Le0x;
      // 063: invokevirtual e0x.l4i ()Lzfz;
      // 066: bipush 1
      // 067: bipush 5
      // 068: bipush 1
      // 069: aload 3
      // 06a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 06d: aload 0
      // 06e: aload 1
      // 06f: getstatic ox_.bj8 Lizd;
      // 072: getstatic hvn$dyo.jf7 Lhvn$dyo;
      // 075: invokevirtual hvn$dyo.run ()I
      // 078: invokevirtual izd.kig (I)Lzfz;
      // 07b: bipush 1
      // 07c: bipush 6
      // 07e: bipush 1
      // 07f: aload 3
      // 080: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 083: aload 0
      // 084: aload 1
      // 085: getstatic ox_.ow_ Le0x;
      // 088: invokevirtual e0x.l4i ()Lzfz;
      // 08b: bipush 1
      // 08c: bipush 5
      // 08d: bipush 2
      // 08e: aload 3
      // 08f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 092: aload 0
      // 093: aload 1
      // 094: getstatic ox_.ow_ Le0x;
      // 097: invokevirtual e0x.l4i ()Lzfz;
      // 09a: bipush 1
      // 09b: bipush 4
      // 09c: bipush 3
      // 09d: aload 3
      // 09e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a1: aload 0
      // 0a2: aload 1
      // 0a3: getstatic ox_.bj8 Lizd;
      // 0a6: getstatic hvn$dyo.jf7 Lhvn$dyo;
      // 0a9: invokevirtual hvn$dyo.run ()I
      // 0ac: invokevirtual izd.kig (I)Lzfz;
      // 0af: bipush 1
      // 0b0: bipush 5
      // 0b1: bipush 3
      // 0b2: aload 3
      // 0b3: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b6: aload 0
      // 0b7: aload 1
      // 0b8: getstatic ox_.ow_ Le0x;
      // 0bb: invokevirtual e0x.l4i ()Lzfz;
      // 0be: bipush 2
      // 0bf: bipush 4
      // 0c0: bipush 3
      // 0c1: aload 3
      // 0c2: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0c5: aload 0
      // 0c6: aload 1
      // 0c7: getstatic ox_.ow_ Le0x;
      // 0ca: invokevirtual e0x.l4i ()Lzfz;
      // 0cd: bipush 3
      // 0ce: bipush 3
      // 0cf: bipush 3
      // 0d0: aload 3
      // 0d1: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0d4: aload 0
      // 0d5: aload 1
      // 0d6: getstatic ox_.bj8 Lizd;
      // 0d9: getstatic hvn$dyo.jf7 Lhvn$dyo;
      // 0dc: invokevirtual hvn$dyo.run ()I
      // 0df: invokevirtual izd.kig (I)Lzfz;
      // 0e2: bipush 3
      // 0e3: bipush 4
      // 0e4: bipush 3
      // 0e5: aload 3
      // 0e6: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0e9: aload 0
      // 0ea: aload 1
      // 0eb: getstatic ox_.ow_ Le0x;
      // 0ee: invokevirtual e0x.l4i ()Lzfz;
      // 0f1: bipush 3
      // 0f2: bipush 3
      // 0f3: bipush 2
      // 0f4: aload 3
      // 0f5: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f8: aload 0
      // 0f9: aload 1
      // 0fa: getstatic ox_.ow_ Le0x;
      // 0fd: invokevirtual e0x.l4i ()Lzfz;
      // 100: bipush 3
      // 101: bipush 2
      // 102: bipush 1
      // 103: aload 3
      // 104: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 107: aload 0
      // 108: aload 1
      // 109: getstatic ox_.bj8 Lizd;
      // 10c: getstatic hvn$dyo.jf7 Lhvn$dyo;
      // 10f: invokevirtual hvn$dyo.run ()I
      // 112: invokevirtual izd.kig (I)Lzfz;
      // 115: bipush 3
      // 116: bipush 3
      // 117: bipush 1
      // 118: aload 3
      // 119: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 11c: aload 0
      // 11d: aload 1
      // 11e: getstatic ox_.ow_ Le0x;
      // 121: invokevirtual e0x.l4i ()Lzfz;
      // 124: bipush 2
      // 125: bipush 2
      // 126: bipush 1
      // 127: aload 3
      // 128: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 12b: aload 0
      // 12c: aload 1
      // 12d: getstatic ox_.ow_ Le0x;
      // 130: invokevirtual e0x.l4i ()Lzfz;
      // 133: bipush 1
      // 134: bipush 1
      // 135: bipush 1
      // 136: aload 3
      // 137: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 13a: aload 0
      // 13b: aload 1
      // 13c: getstatic ox_.bj8 Lizd;
      // 13f: getstatic hvn$dyo.jf7 Lhvn$dyo;
      // 142: invokevirtual hvn$dyo.run ()I
      // 145: invokevirtual izd.kig (I)Lzfz;
      // 148: bipush 1
      // 149: bipush 2
      // 14a: bipush 1
      // 14b: aload 3
      // 14c: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 14f: aload 0
      // 150: aload 1
      // 151: getstatic ox_.ow_ Le0x;
      // 154: invokevirtual e0x.l4i ()Lzfz;
      // 157: bipush 1
      // 158: bipush 1
      // 159: bipush 2
      // 15a: aload 3
      // 15b: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 15e: aload 0
      // 15f: aload 1
      // 160: getstatic ox_.bj8 Lizd;
      // 163: getstatic hvn$dyo.jf7 Lhvn$dyo;
      // 166: invokevirtual hvn$dyo.run ()I
      // 169: invokevirtual izd.kig (I)Lzfz;
      // 16c: bipush 1
      // 16d: bipush 1
      // 16e: bipush 3
      // 16f: aload 3
      // 170: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.lzy (Lt9d;Lzfz;IIILyve;)V
      // 173: bipush 1
      // 174: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3766302239832561174L, 2701531470114778948L, MethodHandles.lookup().lookupClass()).a(219492166996209L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 128743850664022L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "ý²_ñÈéÞ»¸`ê\u009888dÎ\u0010\u001e4N%\u008að\u009f\u0097¾ä¸\u007f\u00906\u0004ú";
      int var8 = "ý²_ñÈéÞ»¸`ê\u009888dÎ\u0010\u001e4N%\u008að\u009f\u0097¾ä¸\u007f\u00906\u0004ú".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            k = var9;
            l = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31521;
      if (l[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = k[var5].getBytes("ISO-8859-1");
         l[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return l[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
