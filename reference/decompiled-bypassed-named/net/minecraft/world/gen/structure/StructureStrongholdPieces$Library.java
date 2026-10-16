package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
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

public class StructureStrongholdPieces$Library extends StructureStrongholdPieces$Stronghold {
   private static final List mjm;
   private boolean y_7;
   private static final long b;
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   public StructureStrongholdPieces$Library() {
   }

   public StructureStrongholdPieces$Library(int param1, Random param2, yve param3, vt2 param4) {
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
      // 05: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 08: aload 0
      // 09: aload 4
      // 0b: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.p7m Lvt2;
      // 0e: aload 0
      // 0f: aload 0
      // 10: aload 2
      // 11: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.i2t (Ljava/util/Random;)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 14: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.ppu Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 17: astore 5
      // 19: aload 0
      // 1a: aload 3
      // 1b: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.yqm Lyve;
      // 1e: aload 0
      // 1f: aload 3
      // 20: invokevirtual yve.v8b ()I
      // 23: aload 5
      // 25: ifnull 3c
      // 28: bipush 6
      // 2a: if_icmple 3f
      // 2d: goto 34
      // 30: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 1
      // 35: goto 3c
      // 38: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 3b: athrow
      // 3c: goto 40
      // 3f: bipush 0
      // 40: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.y_7 Z
      // 43: return
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = b ^ 92889712241947L;
      super.z0d(var1);
      var1.zyu(c<"e">(11023, 7269764928718407173L ^ var2), this.y_7);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = b ^ 46352360105072L;
      super.oqf(var1);
      this.y_7 = var1.dvl(c<"e">(20590, 3830881586285982734L ^ var2));
   }

   public static StructureStrongholdPieces$Library h_r(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 7
      // 05: iload 2
      // 06: iload 3
      // 07: iload 4
      // 09: bipush -4
      // 0b: bipush -1
      // 0c: bipush 0
      // 0d: bipush 14
      // 0f: bipush 11
      // 11: bipush 15
      // 13: aload 5
      // 15: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 18: astore 8
      // 1a: aload 8
      // 1c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.jty (Lyve;)Z
      // 1f: aload 7
      // 21: ifnull 58
      // 24: ifeq 3e
      // 27: goto 2e
      // 2a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: aload 8
      // 31: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 34: ifnull 71
      // 37: goto 3e
      // 3a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 3d: athrow
      // 3e: iload 2
      // 3f: iload 3
      // 40: iload 4
      // 42: bipush -4
      // 44: bipush -1
      // 45: bipush 0
      // 46: bipush 14
      // 48: bipush 6
      // 4a: bipush 15
      // 4c: aload 5
      // 4e: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 51: astore 8
      // 53: aload 8
      // 55: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.jty (Lyve;)Z
      // 58: ifeq 6b
      // 5b: aload 0
      // 5c: aload 8
      // 5e: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 61: ifnull 71
      // 64: goto 6b
      // 67: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aconst_null
      // 6c: areturn
      // 6d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 70: athrow
      // 71: new net/minecraft/world/gen/structure/StructureStrongholdPieces$Library
      // 74: dup
      // 75: iload 6
      // 77: aload 1
      // 78: aload 8
      // 7a: aload 5
      // 7c: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 7f: areturn
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
      // 008: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.knc (Lt9d;Lyve;)Z
      // 00b: aload 4
      // 00d: ifnull 022
      // 010: ifeq 020
      // 013: goto 01a
      // 016: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 01f: athrow
      // 020: bipush 11
      // 022: istore 5
      // 024: aload 0
      // 025: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.y_7 Z
      // 028: aload 4
      // 02a: ifnull 07f
      // 02d: ifne 03b
      // 030: goto 037
      // 033: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 036: athrow
      // 037: bipush 6
      // 039: istore 5
      // 03b: aload 0
      // 03c: aload 1
      // 03d: aload 3
      // 03e: bipush 0
      // 03f: bipush 0
      // 040: bipush 0
      // 041: bipush 13
      // 043: iload 5
      // 045: bipush 1
      // 046: isub
      // 047: bipush 14
      // 049: bipush 1
      // 04a: aload 2
      // 04b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 04e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 051: aload 0
      // 052: aload 1
      // 053: aload 2
      // 054: aload 3
      // 055: aload 0
      // 056: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.ppu Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 059: bipush 4
      // 05a: bipush 1
      // 05b: bipush 0
      // 05c: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 05f: aload 0
      // 060: aload 1
      // 061: aload 3
      // 062: aload 2
      // 063: ldc 0.07
      // 065: nop
      // 066: bipush 2
      // 067: bipush 1
      // 068: bipush 1
      // 069: bipush 11
      // 06b: bipush 4
      // 06c: bipush 13
      // 06e: getstatic ox_.gna Le0x;
      // 071: invokevirtual e0x.l4i ()Lzfz;
      // 074: getstatic ox_.gna Le0x;
      // 077: invokevirtual e0x.l4i ()Lzfz;
      // 07a: bipush 0
      // 07b: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.ne7 (Lt9d;Lyve;Ljava/util/Random;FIIIIIILzfz;Lzfz;Z)V
      // 07e: bipush 1
      // 07f: istore 6
      // 081: bipush 12
      // 083: istore 7
      // 085: bipush 1
      // 086: istore 8
      // 088: iload 8
      // 08a: bipush 13
      // 08c: if_icmpgt 208
      // 08f: iload 8
      // 091: bipush 1
      // 092: isub
      // 093: bipush 4
      // 094: irem
      // 095: aload 4
      // 097: ifnull 209
      // 09a: aload 4
      // 09c: ifnull 1ba
      // 09f: goto 0a6
      // 0a2: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: ifne 16b
      // 0a9: goto 0b0
      // 0ac: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: aload 1
      // 0b2: aload 3
      // 0b3: bipush 1
      // 0b4: bipush 1
      // 0b5: iload 8
      // 0b7: bipush 1
      // 0b8: bipush 4
      // 0b9: iload 8
      // 0bb: getstatic ox_.wb7 Le0x;
      // 0be: invokevirtual e0x.l4i ()Lzfz;
      // 0c1: getstatic ox_.wb7 Le0x;
      // 0c4: invokevirtual e0x.l4i ()Lzfz;
      // 0c7: bipush 0
      // 0c8: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0cb: aload 0
      // 0cc: aload 1
      // 0cd: aload 3
      // 0ce: bipush 12
      // 0d0: bipush 1
      // 0d1: iload 8
      // 0d3: bipush 12
      // 0d5: bipush 4
      // 0d6: iload 8
      // 0d8: getstatic ox_.wb7 Le0x;
      // 0db: invokevirtual e0x.l4i ()Lzfz;
      // 0de: getstatic ox_.wb7 Le0x;
      // 0e1: invokevirtual e0x.l4i ()Lzfz;
      // 0e4: bipush 0
      // 0e5: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e8: aload 0
      // 0e9: aload 1
      // 0ea: getstatic ox_.gt8 Le0x;
      // 0ed: invokevirtual e0x.l4i ()Lzfz;
      // 0f0: bipush 2
      // 0f1: bipush 3
      // 0f2: iload 8
      // 0f4: aload 3
      // 0f5: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f8: aload 0
      // 0f9: aload 1
      // 0fa: getstatic ox_.gt8 Le0x;
      // 0fd: invokevirtual e0x.l4i ()Lzfz;
      // 100: bipush 11
      // 102: bipush 3
      // 103: iload 8
      // 105: aload 3
      // 106: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 109: aload 4
      // 10b: ifnull 203
      // 10e: goto 115
      // 111: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 114: athrow
      // 115: aload 0
      // 116: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.y_7 Z
      // 119: ifeq 200
      // 11c: goto 123
      // 11f: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 122: athrow
      // 123: aload 0
      // 124: aload 1
      // 125: aload 3
      // 126: bipush 1
      // 127: bipush 6
      // 129: iload 8
      // 12b: bipush 1
      // 12c: bipush 9
      // 12e: iload 8
      // 130: getstatic ox_.wb7 Le0x;
      // 133: invokevirtual e0x.l4i ()Lzfz;
      // 136: getstatic ox_.wb7 Le0x;
      // 139: invokevirtual e0x.l4i ()Lzfz;
      // 13c: bipush 0
      // 13d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 140: aload 0
      // 141: aload 1
      // 142: aload 3
      // 143: bipush 12
      // 145: bipush 6
      // 147: iload 8
      // 149: bipush 12
      // 14b: bipush 9
      // 14d: iload 8
      // 14f: getstatic ox_.wb7 Le0x;
      // 152: invokevirtual e0x.l4i ()Lzfz;
      // 155: getstatic ox_.wb7 Le0x;
      // 158: invokevirtual e0x.l4i ()Lzfz;
      // 15b: bipush 0
      // 15c: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 15f: aload 4
      // 161: ifnonnull 200
      // 164: goto 16b
      // 167: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 16a: athrow
      // 16b: aload 0
      // 16c: aload 1
      // 16d: aload 3
      // 16e: bipush 1
      // 16f: bipush 1
      // 170: iload 8
      // 172: bipush 1
      // 173: bipush 4
      // 174: iload 8
      // 176: getstatic ox_.kzr Le0x;
      // 179: invokevirtual e0x.l4i ()Lzfz;
      // 17c: getstatic ox_.kzr Le0x;
      // 17f: invokevirtual e0x.l4i ()Lzfz;
      // 182: bipush 0
      // 183: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 186: aload 0
      // 187: aload 1
      // 188: aload 3
      // 189: bipush 12
      // 18b: bipush 1
      // 18c: iload 8
      // 18e: bipush 12
      // 190: bipush 4
      // 191: iload 8
      // 193: getstatic ox_.kzr Le0x;
      // 196: invokevirtual e0x.l4i ()Lzfz;
      // 199: getstatic ox_.kzr Le0x;
      // 19c: invokevirtual e0x.l4i ()Lzfz;
      // 19f: bipush 0
      // 1a0: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1a3: aload 4
      // 1a5: ifnull 203
      // 1a8: goto 1af
      // 1ab: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: aload 0
      // 1b0: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.y_7 Z
      // 1b3: goto 1ba
      // 1b6: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 1b9: athrow
      // 1ba: ifeq 200
      // 1bd: aload 0
      // 1be: aload 1
      // 1bf: aload 3
      // 1c0: bipush 1
      // 1c1: bipush 6
      // 1c3: iload 8
      // 1c5: bipush 1
      // 1c6: bipush 9
      // 1c8: iload 8
      // 1ca: getstatic ox_.kzr Le0x;
      // 1cd: invokevirtual e0x.l4i ()Lzfz;
      // 1d0: getstatic ox_.kzr Le0x;
      // 1d3: invokevirtual e0x.l4i ()Lzfz;
      // 1d6: bipush 0
      // 1d7: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1da: aload 0
      // 1db: aload 1
      // 1dc: aload 3
      // 1dd: bipush 12
      // 1df: bipush 6
      // 1e1: iload 8
      // 1e3: bipush 12
      // 1e5: bipush 9
      // 1e7: iload 8
      // 1e9: getstatic ox_.kzr Le0x;
      // 1ec: invokevirtual e0x.l4i ()Lzfz;
      // 1ef: getstatic ox_.kzr Le0x;
      // 1f2: invokevirtual e0x.l4i ()Lzfz;
      // 1f5: bipush 0
      // 1f6: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1f9: goto 200
      // 1fc: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 1ff: athrow
      // 200: iinc 8 1
      // 203: aload 4
      // 205: ifnonnull 088
      // 208: bipush 3
      // 209: istore 8
      // 20b: iload 8
      // 20d: bipush 12
      // 20f: if_icmpge 27b
      // 212: aload 0
      // 213: aload 1
      // 214: aload 3
      // 215: bipush 3
      // 216: bipush 1
      // 217: iload 8
      // 219: bipush 4
      // 21a: bipush 3
      // 21b: iload 8
      // 21d: getstatic ox_.kzr Le0x;
      // 220: invokevirtual e0x.l4i ()Lzfz;
      // 223: getstatic ox_.kzr Le0x;
      // 226: invokevirtual e0x.l4i ()Lzfz;
      // 229: bipush 0
      // 22a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 22d: aload 0
      // 22e: aload 1
      // 22f: aload 3
      // 230: bipush 6
      // 232: bipush 1
      // 233: iload 8
      // 235: bipush 7
      // 237: bipush 3
      // 238: iload 8
      // 23a: getstatic ox_.kzr Le0x;
      // 23d: invokevirtual e0x.l4i ()Lzfz;
      // 240: getstatic ox_.kzr Le0x;
      // 243: invokevirtual e0x.l4i ()Lzfz;
      // 246: bipush 0
      // 247: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 24a: aload 0
      // 24b: aload 1
      // 24c: aload 3
      // 24d: bipush 9
      // 24f: bipush 1
      // 250: iload 8
      // 252: bipush 10
      // 254: bipush 3
      // 255: iload 8
      // 257: getstatic ox_.kzr Le0x;
      // 25a: invokevirtual e0x.l4i ()Lzfz;
      // 25d: getstatic ox_.kzr Le0x;
      // 260: invokevirtual e0x.l4i ()Lzfz;
      // 263: bipush 0
      // 264: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 267: iinc 8 2
      // 26a: aload 4
      // 26c: ifnull 603
      // 26f: aload 4
      // 271: ifnonnull 20b
      // 274: goto 27b
      // 277: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 27a: athrow
      // 27b: aload 0
      // 27c: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.y_7 Z
      // 27f: aload 4
      // 281: ifnull 607
      // 284: ifeq 5da
      // 287: goto 28e
      // 28a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 28d: athrow
      // 28e: aload 0
      // 28f: aload 1
      // 290: aload 3
      // 291: bipush 1
      // 292: bipush 5
      // 293: bipush 1
      // 294: bipush 3
      // 295: bipush 5
      // 296: bipush 13
      // 298: getstatic ox_.wb7 Le0x;
      // 29b: invokevirtual e0x.l4i ()Lzfz;
      // 29e: getstatic ox_.wb7 Le0x;
      // 2a1: invokevirtual e0x.l4i ()Lzfz;
      // 2a4: bipush 0
      // 2a5: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2a8: aload 0
      // 2a9: aload 1
      // 2aa: aload 3
      // 2ab: bipush 10
      // 2ad: bipush 5
      // 2ae: bipush 1
      // 2af: bipush 12
      // 2b1: bipush 5
      // 2b2: bipush 13
      // 2b4: getstatic ox_.wb7 Le0x;
      // 2b7: invokevirtual e0x.l4i ()Lzfz;
      // 2ba: getstatic ox_.wb7 Le0x;
      // 2bd: invokevirtual e0x.l4i ()Lzfz;
      // 2c0: bipush 0
      // 2c1: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2c4: aload 0
      // 2c5: aload 1
      // 2c6: aload 3
      // 2c7: bipush 4
      // 2c8: bipush 5
      // 2c9: bipush 1
      // 2ca: bipush 9
      // 2cc: bipush 5
      // 2cd: bipush 2
      // 2ce: getstatic ox_.wb7 Le0x;
      // 2d1: invokevirtual e0x.l4i ()Lzfz;
      // 2d4: getstatic ox_.wb7 Le0x;
      // 2d7: invokevirtual e0x.l4i ()Lzfz;
      // 2da: bipush 0
      // 2db: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2de: aload 0
      // 2df: aload 1
      // 2e0: aload 3
      // 2e1: bipush 4
      // 2e2: bipush 5
      // 2e3: bipush 12
      // 2e5: bipush 9
      // 2e7: bipush 5
      // 2e8: bipush 13
      // 2ea: getstatic ox_.wb7 Le0x;
      // 2ed: invokevirtual e0x.l4i ()Lzfz;
      // 2f0: getstatic ox_.wb7 Le0x;
      // 2f3: invokevirtual e0x.l4i ()Lzfz;
      // 2f6: bipush 0
      // 2f7: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2fa: aload 0
      // 2fb: aload 1
      // 2fc: getstatic ox_.wb7 Le0x;
      // 2ff: invokevirtual e0x.l4i ()Lzfz;
      // 302: bipush 9
      // 304: bipush 5
      // 305: bipush 11
      // 307: aload 3
      // 308: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 30b: aload 0
      // 30c: aload 1
      // 30d: getstatic ox_.wb7 Le0x;
      // 310: invokevirtual e0x.l4i ()Lzfz;
      // 313: bipush 8
      // 315: bipush 5
      // 316: bipush 11
      // 318: aload 3
      // 319: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 31c: aload 0
      // 31d: aload 1
      // 31e: getstatic ox_.wb7 Le0x;
      // 321: invokevirtual e0x.l4i ()Lzfz;
      // 324: bipush 9
      // 326: bipush 5
      // 327: bipush 10
      // 329: aload 3
      // 32a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 32d: aload 0
      // 32e: aload 1
      // 32f: aload 3
      // 330: bipush 3
      // 331: bipush 6
      // 333: bipush 2
      // 334: bipush 3
      // 335: bipush 6
      // 337: bipush 12
      // 339: getstatic ox_.j5b Le0x;
      // 33c: invokevirtual e0x.l4i ()Lzfz;
      // 33f: getstatic ox_.j5b Le0x;
      // 342: invokevirtual e0x.l4i ()Lzfz;
      // 345: bipush 0
      // 346: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 349: aload 0
      // 34a: aload 1
      // 34b: aload 3
      // 34c: bipush 10
      // 34e: bipush 6
      // 350: bipush 2
      // 351: bipush 10
      // 353: bipush 6
      // 355: bipush 10
      // 357: getstatic ox_.j5b Le0x;
      // 35a: invokevirtual e0x.l4i ()Lzfz;
      // 35d: getstatic ox_.j5b Le0x;
      // 360: invokevirtual e0x.l4i ()Lzfz;
      // 363: bipush 0
      // 364: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 367: aload 0
      // 368: aload 1
      // 369: aload 3
      // 36a: bipush 4
      // 36b: bipush 6
      // 36d: bipush 2
      // 36e: bipush 9
      // 370: bipush 6
      // 372: bipush 2
      // 373: getstatic ox_.j5b Le0x;
      // 376: invokevirtual e0x.l4i ()Lzfz;
      // 379: getstatic ox_.j5b Le0x;
      // 37c: invokevirtual e0x.l4i ()Lzfz;
      // 37f: bipush 0
      // 380: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 383: aload 0
      // 384: aload 1
      // 385: aload 3
      // 386: bipush 4
      // 387: bipush 6
      // 389: bipush 12
      // 38b: bipush 8
      // 38d: bipush 6
      // 38f: bipush 12
      // 391: getstatic ox_.j5b Le0x;
      // 394: invokevirtual e0x.l4i ()Lzfz;
      // 397: getstatic ox_.j5b Le0x;
      // 39a: invokevirtual e0x.l4i ()Lzfz;
      // 39d: bipush 0
      // 39e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3a1: aload 0
      // 3a2: aload 1
      // 3a3: getstatic ox_.j5b Le0x;
      // 3a6: invokevirtual e0x.l4i ()Lzfz;
      // 3a9: bipush 9
      // 3ab: bipush 6
      // 3ad: bipush 11
      // 3af: aload 3
      // 3b0: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3b3: aload 0
      // 3b4: aload 1
      // 3b5: getstatic ox_.j5b Le0x;
      // 3b8: invokevirtual e0x.l4i ()Lzfz;
      // 3bb: bipush 8
      // 3bd: bipush 6
      // 3bf: bipush 11
      // 3c1: aload 3
      // 3c2: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3c5: aload 0
      // 3c6: aload 1
      // 3c7: getstatic ox_.j5b Le0x;
      // 3ca: invokevirtual e0x.l4i ()Lzfz;
      // 3cd: bipush 9
      // 3cf: bipush 6
      // 3d1: bipush 10
      // 3d3: aload 3
      // 3d4: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3d7: aload 0
      // 3d8: getstatic ox_.h49 Le0x;
      // 3db: bipush 3
      // 3dc: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.ujv (Le0x;I)I
      // 3df: istore 8
      // 3e1: aload 0
      // 3e2: aload 1
      // 3e3: getstatic ox_.h49 Le0x;
      // 3e6: iload 8
      // 3e8: invokevirtual e0x.kig (I)Lzfz;
      // 3eb: bipush 10
      // 3ed: bipush 1
      // 3ee: bipush 13
      // 3f0: aload 3
      // 3f1: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3f4: aload 0
      // 3f5: aload 1
      // 3f6: getstatic ox_.h49 Le0x;
      // 3f9: iload 8
      // 3fb: invokevirtual e0x.kig (I)Lzfz;
      // 3fe: bipush 10
      // 400: bipush 2
      // 401: bipush 13
      // 403: aload 3
      // 404: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 407: aload 0
      // 408: aload 1
      // 409: getstatic ox_.h49 Le0x;
      // 40c: iload 8
      // 40e: invokevirtual e0x.kig (I)Lzfz;
      // 411: bipush 10
      // 413: bipush 3
      // 414: bipush 13
      // 416: aload 3
      // 417: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 41a: aload 0
      // 41b: aload 1
      // 41c: getstatic ox_.h49 Le0x;
      // 41f: iload 8
      // 421: invokevirtual e0x.kig (I)Lzfz;
      // 424: bipush 10
      // 426: bipush 4
      // 427: bipush 13
      // 429: aload 3
      // 42a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 42d: aload 0
      // 42e: aload 1
      // 42f: getstatic ox_.h49 Le0x;
      // 432: iload 8
      // 434: invokevirtual e0x.kig (I)Lzfz;
      // 437: bipush 10
      // 439: bipush 5
      // 43a: bipush 13
      // 43c: aload 3
      // 43d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 440: aload 0
      // 441: aload 1
      // 442: getstatic ox_.h49 Le0x;
      // 445: iload 8
      // 447: invokevirtual e0x.kig (I)Lzfz;
      // 44a: bipush 10
      // 44c: bipush 6
      // 44e: bipush 13
      // 450: aload 3
      // 451: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 454: aload 0
      // 455: aload 1
      // 456: getstatic ox_.h49 Le0x;
      // 459: iload 8
      // 45b: invokevirtual e0x.kig (I)Lzfz;
      // 45e: bipush 10
      // 460: bipush 7
      // 462: bipush 13
      // 464: aload 3
      // 465: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 468: bipush 7
      // 46a: istore 9
      // 46c: bipush 7
      // 46e: istore 10
      // 470: aload 0
      // 471: aload 1
      // 472: getstatic ox_.j5b Le0x;
      // 475: invokevirtual e0x.l4i ()Lzfz;
      // 478: iload 9
      // 47a: bipush 1
      // 47b: isub
      // 47c: bipush 9
      // 47e: iload 10
      // 480: aload 3
      // 481: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 484: aload 0
      // 485: aload 1
      // 486: getstatic ox_.j5b Le0x;
      // 489: invokevirtual e0x.l4i ()Lzfz;
      // 48c: iload 9
      // 48e: bipush 9
      // 490: iload 10
      // 492: aload 3
      // 493: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 496: aload 0
      // 497: aload 1
      // 498: getstatic ox_.j5b Le0x;
      // 49b: invokevirtual e0x.l4i ()Lzfz;
      // 49e: iload 9
      // 4a0: bipush 1
      // 4a1: isub
      // 4a2: bipush 8
      // 4a4: iload 10
      // 4a6: aload 3
      // 4a7: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4aa: aload 0
      // 4ab: aload 1
      // 4ac: getstatic ox_.j5b Le0x;
      // 4af: invokevirtual e0x.l4i ()Lzfz;
      // 4b2: iload 9
      // 4b4: bipush 8
      // 4b6: iload 10
      // 4b8: aload 3
      // 4b9: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4bc: aload 0
      // 4bd: aload 1
      // 4be: getstatic ox_.j5b Le0x;
      // 4c1: invokevirtual e0x.l4i ()Lzfz;
      // 4c4: iload 9
      // 4c6: bipush 1
      // 4c7: isub
      // 4c8: bipush 7
      // 4ca: iload 10
      // 4cc: aload 3
      // 4cd: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4d0: aload 0
      // 4d1: aload 1
      // 4d2: getstatic ox_.j5b Le0x;
      // 4d5: invokevirtual e0x.l4i ()Lzfz;
      // 4d8: iload 9
      // 4da: bipush 7
      // 4dc: iload 10
      // 4de: aload 3
      // 4df: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4e2: aload 0
      // 4e3: aload 1
      // 4e4: getstatic ox_.j5b Le0x;
      // 4e7: invokevirtual e0x.l4i ()Lzfz;
      // 4ea: iload 9
      // 4ec: bipush 2
      // 4ed: isub
      // 4ee: bipush 7
      // 4f0: iload 10
      // 4f2: aload 3
      // 4f3: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4f6: aload 0
      // 4f7: aload 1
      // 4f8: getstatic ox_.j5b Le0x;
      // 4fb: invokevirtual e0x.l4i ()Lzfz;
      // 4fe: iload 9
      // 500: bipush 1
      // 501: iadd
      // 502: bipush 7
      // 504: iload 10
      // 506: aload 3
      // 507: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 50a: aload 0
      // 50b: aload 1
      // 50c: getstatic ox_.j5b Le0x;
      // 50f: invokevirtual e0x.l4i ()Lzfz;
      // 512: iload 9
      // 514: bipush 1
      // 515: isub
      // 516: bipush 7
      // 518: iload 10
      // 51a: bipush 1
      // 51b: isub
      // 51c: aload 3
      // 51d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 520: aload 0
      // 521: aload 1
      // 522: getstatic ox_.j5b Le0x;
      // 525: invokevirtual e0x.l4i ()Lzfz;
      // 528: iload 9
      // 52a: bipush 1
      // 52b: isub
      // 52c: bipush 7
      // 52e: iload 10
      // 530: bipush 1
      // 531: iadd
      // 532: aload 3
      // 533: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 536: aload 0
      // 537: aload 1
      // 538: getstatic ox_.j5b Le0x;
      // 53b: invokevirtual e0x.l4i ()Lzfz;
      // 53e: iload 9
      // 540: bipush 7
      // 542: iload 10
      // 544: bipush 1
      // 545: isub
      // 546: aload 3
      // 547: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 54a: aload 0
      // 54b: aload 1
      // 54c: getstatic ox_.j5b Le0x;
      // 54f: invokevirtual e0x.l4i ()Lzfz;
      // 552: iload 9
      // 554: bipush 7
      // 556: iload 10
      // 558: bipush 1
      // 559: iadd
      // 55a: aload 3
      // 55b: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 55e: aload 0
      // 55f: aload 1
      // 560: getstatic ox_.gt8 Le0x;
      // 563: invokevirtual e0x.l4i ()Lzfz;
      // 566: iload 9
      // 568: bipush 2
      // 569: isub
      // 56a: bipush 8
      // 56c: iload 10
      // 56e: aload 3
      // 56f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 572: aload 0
      // 573: aload 1
      // 574: getstatic ox_.gt8 Le0x;
      // 577: invokevirtual e0x.l4i ()Lzfz;
      // 57a: iload 9
      // 57c: bipush 1
      // 57d: iadd
      // 57e: bipush 8
      // 580: iload 10
      // 582: aload 3
      // 583: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 586: aload 0
      // 587: aload 1
      // 588: getstatic ox_.gt8 Le0x;
      // 58b: invokevirtual e0x.l4i ()Lzfz;
      // 58e: iload 9
      // 590: bipush 1
      // 591: isub
      // 592: bipush 8
      // 594: iload 10
      // 596: bipush 1
      // 597: isub
      // 598: aload 3
      // 599: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 59c: aload 0
      // 59d: aload 1
      // 59e: getstatic ox_.gt8 Le0x;
      // 5a1: invokevirtual e0x.l4i ()Lzfz;
      // 5a4: iload 9
      // 5a6: bipush 1
      // 5a7: isub
      // 5a8: bipush 8
      // 5aa: iload 10
      // 5ac: bipush 1
      // 5ad: iadd
      // 5ae: aload 3
      // 5af: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5b2: aload 0
      // 5b3: aload 1
      // 5b4: getstatic ox_.gt8 Le0x;
      // 5b7: invokevirtual e0x.l4i ()Lzfz;
      // 5ba: iload 9
      // 5bc: bipush 8
      // 5be: iload 10
      // 5c0: bipush 1
      // 5c1: isub
      // 5c2: aload 3
      // 5c3: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5c6: aload 0
      // 5c7: aload 1
      // 5c8: getstatic ox_.gt8 Le0x;
      // 5cb: invokevirtual e0x.l4i ()Lzfz;
      // 5ce: iload 9
      // 5d0: bipush 8
      // 5d2: iload 10
      // 5d4: bipush 1
      // 5d5: iadd
      // 5d6: aload 3
      // 5d7: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5da: aload 0
      // 5db: aload 1
      // 5dc: aload 3
      // 5dd: aload 2
      // 5de: bipush 3
      // 5df: bipush 3
      // 5e0: bipush 5
      // 5e1: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.mjm Ljava/util/List;
      // 5e4: bipush 1
      // 5e5: anewarray 161
      // 5e8: dup
      // 5e9: bipush 0
      // 5ea: getstatic xbr.frz Lnmo;
      // 5ed: aload 2
      // 5ee: bipush 1
      // 5ef: bipush 5
      // 5f0: bipush 2
      // 5f1: invokevirtual nmo.i_7 (Ljava/util/Random;III)Lypi;
      // 5f4: aastore
      // 5f5: invokestatic ypi.voc (Ljava/util/List;[Lypi;)Ljava/util/List;
      // 5f8: bipush 1
      // 5f9: aload 2
      // 5fa: bipush 4
      // 5fb: invokevirtual java/util/Random.nextInt (I)I
      // 5fe: iadd
      // 5ff: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.y6k (Lt9d;Lyve;Ljava/util/Random;IIILjava/util/List;I)Z
      // 602: pop
      // 603: aload 0
      // 604: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.y_7 Z
      // 607: aload 4
      // 609: ifnull 65a
      // 60c: ifeq 659
      // 60f: goto 616
      // 612: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 615: athrow
      // 616: aload 0
      // 617: aload 1
      // 618: getstatic ox_.ibw Le0x;
      // 61b: invokevirtual e0x.l4i ()Lzfz;
      // 61e: bipush 12
      // 620: bipush 9
      // 622: bipush 1
      // 623: aload 3
      // 624: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.lzy (Lt9d;Lzfz;IIILyve;)V
      // 627: aload 0
      // 628: aload 1
      // 629: aload 3
      // 62a: aload 2
      // 62b: bipush 12
      // 62d: bipush 8
      // 62f: bipush 1
      // 630: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.mjm Ljava/util/List;
      // 633: bipush 1
      // 634: anewarray 161
      // 637: dup
      // 638: bipush 0
      // 639: getstatic xbr.frz Lnmo;
      // 63c: aload 2
      // 63d: bipush 1
      // 63e: bipush 5
      // 63f: bipush 2
      // 640: invokevirtual nmo.i_7 (Ljava/util/Random;III)Lypi;
      // 643: aastore
      // 644: invokestatic ypi.voc (Ljava/util/List;[Lypi;)Ljava/util/List;
      // 647: bipush 1
      // 648: aload 2
      // 649: bipush 4
      // 64a: invokevirtual java/util/Random.nextInt (I)I
      // 64d: iadd
      // 64e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.y6k (Lt9d;Lyve;Ljava/util/Random;IIILjava/util/List;I)Z
      // 651: pop
      // 652: goto 659
      // 655: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Library.a (Loov;)Loov;
      // 658: athrow
      // 659: bipush 1
      // 65a: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2039980869790203463L, 5951858090013026624L, MethodHandles.lookup().lookupClass()).a(116824439151771L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 86493616884571L;
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
      String var6 = "ÍhxCU\u000eN\u0012õrê\u0016Ì]ód\u0010.· t$éîý0Ø\u0099¤)Á\u0013Ö";
      int var8 = "ÍhxCU\u000eN\u0012õrê\u0016Ì]ód\u0010.· t$éîý0Ø\u0099¤)Á\u0013Ö".length();
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
            mjm = Lists.newArrayList(
               new ypi[]{new ypi(xbr.rm0, 0, 1, 3, 20), new ypi(xbr.y8u, 0, 2, 7, 20), new ypi(xbr.xpe, 0, 1, 1, 1), new ypi(xbr.xdw, 0, 1, 1, 1)}
            );
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26700;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$Library", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$Library" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
