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

public abstract class StructureStrongholdPieces$Stronghold extends xi1 {
   public StructureStrongholdPieces$Stronghold$gjy ppu = StructureStrongholdPieces$Stronghold$gjy.waj;
   private static EntityLivingBase[] a;
   private static final long c;
   private static final String[] h;
   private static final String[] i;
   private static final Map j = new HashMap(13);

   public StructureStrongholdPieces$Stronghold() {
   }

   public StructureStrongholdPieces$Stronghold(int var1) {
      super(var1);
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = c ^ 47537822857239L;
      var1.rjq(b<"x">(16412, 3415796435326125544L ^ var2), this.ppu.name());
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = c ^ 93939234451836L;
      this.ppu = StructureStrongholdPieces$Stronghold$gjy.valueOf(var1.u14(b<"x">(7295, 3212963015542984929L ^ var2)));
   }

   public void gjd(OpaquePredicate param1, Random param2, yve param3, StructureStrongholdPieces$Stronghold$gjy param4, int param5, int param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 8
      // 005: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$3.ciw [I
      // 008: aload 4
      // 00a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy.ordinal ()I
      // 00d: iaload
      // 00e: tableswitch 30 1 4 30 81 281 479
      // 02c: aload 0
      // 02d: aload 1
      // 02e: aload 3
      // 02f: iload 5
      // 031: iload 6
      // 033: iload 7
      // 035: iload 5
      // 037: bipush 3
      // 038: iadd
      // 039: bipush 1
      // 03a: isub
      // 03b: iload 6
      // 03d: bipush 3
      // 03e: iadd
      // 03f: bipush 1
      // 040: isub
      // 041: iload 7
      // 043: getstatic ox_.ibw Le0x;
      // 046: invokevirtual e0x.l4i ()Lzfz;
      // 049: getstatic ox_.ibw Le0x;
      // 04c: invokevirtual e0x.l4i ()Lzfz;
      // 04f: bipush 0
      // 050: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 053: aload 8
      // 055: ifnonnull 2f0
      // 058: goto 05f
      // 05b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: aload 1
      // 061: getstatic ox_.ow_ Le0x;
      // 064: invokevirtual e0x.l4i ()Lzfz;
      // 067: iload 5
      // 069: iload 6
      // 06b: iload 7
      // 06d: aload 3
      // 06e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 071: aload 0
      // 072: aload 1
      // 073: getstatic ox_.ow_ Le0x;
      // 076: invokevirtual e0x.l4i ()Lzfz;
      // 079: iload 5
      // 07b: iload 6
      // 07d: bipush 1
      // 07e: iadd
      // 07f: iload 7
      // 081: aload 3
      // 082: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 085: aload 0
      // 086: aload 1
      // 087: getstatic ox_.ow_ Le0x;
      // 08a: invokevirtual e0x.l4i ()Lzfz;
      // 08d: iload 5
      // 08f: iload 6
      // 091: bipush 2
      // 092: iadd
      // 093: iload 7
      // 095: aload 3
      // 096: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 099: aload 0
      // 09a: aload 1
      // 09b: getstatic ox_.ow_ Le0x;
      // 09e: invokevirtual e0x.l4i ()Lzfz;
      // 0a1: iload 5
      // 0a3: bipush 1
      // 0a4: iadd
      // 0a5: iload 6
      // 0a7: bipush 2
      // 0a8: iadd
      // 0a9: iload 7
      // 0ab: aload 3
      // 0ac: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0af: aload 0
      // 0b0: aload 1
      // 0b1: getstatic ox_.ow_ Le0x;
      // 0b4: invokevirtual e0x.l4i ()Lzfz;
      // 0b7: iload 5
      // 0b9: bipush 2
      // 0ba: iadd
      // 0bb: iload 6
      // 0bd: bipush 2
      // 0be: iadd
      // 0bf: iload 7
      // 0c1: aload 3
      // 0c2: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0c5: aload 0
      // 0c6: aload 1
      // 0c7: getstatic ox_.ow_ Le0x;
      // 0ca: invokevirtual e0x.l4i ()Lzfz;
      // 0cd: iload 5
      // 0cf: bipush 2
      // 0d0: iadd
      // 0d1: iload 6
      // 0d3: bipush 1
      // 0d4: iadd
      // 0d5: iload 7
      // 0d7: aload 3
      // 0d8: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0db: aload 0
      // 0dc: aload 1
      // 0dd: getstatic ox_.ow_ Le0x;
      // 0e0: invokevirtual e0x.l4i ()Lzfz;
      // 0e3: iload 5
      // 0e5: bipush 2
      // 0e6: iadd
      // 0e7: iload 6
      // 0e9: iload 7
      // 0eb: aload 3
      // 0ec: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0ef: aload 0
      // 0f0: aload 1
      // 0f1: getstatic ox_.o0v Le0x;
      // 0f4: invokevirtual e0x.l4i ()Lzfz;
      // 0f7: iload 5
      // 0f9: bipush 1
      // 0fa: iadd
      // 0fb: iload 6
      // 0fd: iload 7
      // 0ff: aload 3
      // 100: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 103: aload 0
      // 104: aload 1
      // 105: getstatic ox_.o0v Le0x;
      // 108: bipush 8
      // 10a: invokevirtual e0x.kig (I)Lzfz;
      // 10d: iload 5
      // 10f: bipush 1
      // 110: iadd
      // 111: iload 6
      // 113: bipush 1
      // 114: iadd
      // 115: iload 7
      // 117: aload 3
      // 118: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 11b: aload 8
      // 11d: ifnonnull 2f0
      // 120: goto 127
      // 123: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 126: athrow
      // 127: aload 0
      // 128: aload 1
      // 129: getstatic ox_.ibw Le0x;
      // 12c: invokevirtual e0x.l4i ()Lzfz;
      // 12f: iload 5
      // 131: bipush 1
      // 132: iadd
      // 133: iload 6
      // 135: iload 7
      // 137: aload 3
      // 138: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 13b: aload 0
      // 13c: aload 1
      // 13d: getstatic ox_.ibw Le0x;
      // 140: invokevirtual e0x.l4i ()Lzfz;
      // 143: iload 5
      // 145: bipush 1
      // 146: iadd
      // 147: iload 6
      // 149: bipush 1
      // 14a: iadd
      // 14b: iload 7
      // 14d: aload 3
      // 14e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 151: aload 0
      // 152: aload 1
      // 153: getstatic ox_.ytr Le0x;
      // 156: invokevirtual e0x.l4i ()Lzfz;
      // 159: iload 5
      // 15b: iload 6
      // 15d: iload 7
      // 15f: aload 3
      // 160: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 163: aload 0
      // 164: aload 1
      // 165: getstatic ox_.ytr Le0x;
      // 168: invokevirtual e0x.l4i ()Lzfz;
      // 16b: iload 5
      // 16d: iload 6
      // 16f: bipush 1
      // 170: iadd
      // 171: iload 7
      // 173: aload 3
      // 174: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 177: aload 0
      // 178: aload 1
      // 179: getstatic ox_.ytr Le0x;
      // 17c: invokevirtual e0x.l4i ()Lzfz;
      // 17f: iload 5
      // 181: iload 6
      // 183: bipush 2
      // 184: iadd
      // 185: iload 7
      // 187: aload 3
      // 188: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 18b: aload 0
      // 18c: aload 1
      // 18d: getstatic ox_.ytr Le0x;
      // 190: invokevirtual e0x.l4i ()Lzfz;
      // 193: iload 5
      // 195: bipush 1
      // 196: iadd
      // 197: iload 6
      // 199: bipush 2
      // 19a: iadd
      // 19b: iload 7
      // 19d: aload 3
      // 19e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1a1: aload 0
      // 1a2: aload 1
      // 1a3: getstatic ox_.ytr Le0x;
      // 1a6: invokevirtual e0x.l4i ()Lzfz;
      // 1a9: iload 5
      // 1ab: bipush 2
      // 1ac: iadd
      // 1ad: iload 6
      // 1af: bipush 2
      // 1b0: iadd
      // 1b1: iload 7
      // 1b3: aload 3
      // 1b4: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1b7: aload 0
      // 1b8: aload 1
      // 1b9: getstatic ox_.ytr Le0x;
      // 1bc: invokevirtual e0x.l4i ()Lzfz;
      // 1bf: iload 5
      // 1c1: bipush 2
      // 1c2: iadd
      // 1c3: iload 6
      // 1c5: bipush 1
      // 1c6: iadd
      // 1c7: iload 7
      // 1c9: aload 3
      // 1ca: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1cd: aload 0
      // 1ce: aload 1
      // 1cf: getstatic ox_.ytr Le0x;
      // 1d2: invokevirtual e0x.l4i ()Lzfz;
      // 1d5: iload 5
      // 1d7: bipush 2
      // 1d8: iadd
      // 1d9: iload 6
      // 1db: iload 7
      // 1dd: aload 3
      // 1de: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1e1: aload 8
      // 1e3: ifnonnull 2f0
      // 1e6: goto 1ed
      // 1e9: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 1ec: athrow
      // 1ed: aload 0
      // 1ee: aload 1
      // 1ef: getstatic ox_.ow_ Le0x;
      // 1f2: invokevirtual e0x.l4i ()Lzfz;
      // 1f5: iload 5
      // 1f7: iload 6
      // 1f9: iload 7
      // 1fb: aload 3
      // 1fc: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1ff: aload 0
      // 200: aload 1
      // 201: getstatic ox_.ow_ Le0x;
      // 204: invokevirtual e0x.l4i ()Lzfz;
      // 207: iload 5
      // 209: iload 6
      // 20b: bipush 1
      // 20c: iadd
      // 20d: iload 7
      // 20f: aload 3
      // 210: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 213: aload 0
      // 214: aload 1
      // 215: getstatic ox_.ow_ Le0x;
      // 218: invokevirtual e0x.l4i ()Lzfz;
      // 21b: iload 5
      // 21d: iload 6
      // 21f: bipush 2
      // 220: iadd
      // 221: iload 7
      // 223: aload 3
      // 224: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 227: aload 0
      // 228: aload 1
      // 229: getstatic ox_.ow_ Le0x;
      // 22c: invokevirtual e0x.l4i ()Lzfz;
      // 22f: iload 5
      // 231: bipush 1
      // 232: iadd
      // 233: iload 6
      // 235: bipush 2
      // 236: iadd
      // 237: iload 7
      // 239: aload 3
      // 23a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 23d: aload 0
      // 23e: aload 1
      // 23f: getstatic ox_.ow_ Le0x;
      // 242: invokevirtual e0x.l4i ()Lzfz;
      // 245: iload 5
      // 247: bipush 2
      // 248: iadd
      // 249: iload 6
      // 24b: bipush 2
      // 24c: iadd
      // 24d: iload 7
      // 24f: aload 3
      // 250: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 253: aload 0
      // 254: aload 1
      // 255: getstatic ox_.ow_ Le0x;
      // 258: invokevirtual e0x.l4i ()Lzfz;
      // 25b: iload 5
      // 25d: bipush 2
      // 25e: iadd
      // 25f: iload 6
      // 261: bipush 1
      // 262: iadd
      // 263: iload 7
      // 265: aload 3
      // 266: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 269: aload 0
      // 26a: aload 1
      // 26b: getstatic ox_.ow_ Le0x;
      // 26e: invokevirtual e0x.l4i ()Lzfz;
      // 271: iload 5
      // 273: bipush 2
      // 274: iadd
      // 275: iload 6
      // 277: iload 7
      // 279: aload 3
      // 27a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 27d: aload 0
      // 27e: aload 1
      // 27f: getstatic ox_.oof Le0x;
      // 282: invokevirtual e0x.l4i ()Lzfz;
      // 285: iload 5
      // 287: bipush 1
      // 288: iadd
      // 289: iload 6
      // 28b: iload 7
      // 28d: aload 3
      // 28e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 291: aload 0
      // 292: aload 1
      // 293: getstatic ox_.oof Le0x;
      // 296: bipush 8
      // 298: invokevirtual e0x.kig (I)Lzfz;
      // 29b: iload 5
      // 29d: bipush 1
      // 29e: iadd
      // 29f: iload 6
      // 2a1: bipush 1
      // 2a2: iadd
      // 2a3: iload 7
      // 2a5: aload 3
      // 2a6: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2a9: aload 0
      // 2aa: aload 1
      // 2ab: getstatic ox_.oiw Le0x;
      // 2ae: aload 0
      // 2af: getstatic ox_.oiw Le0x;
      // 2b2: bipush 4
      // 2b3: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.ujv (Le0x;I)I
      // 2b6: invokevirtual e0x.kig (I)Lzfz;
      // 2b9: iload 5
      // 2bb: bipush 2
      // 2bc: iadd
      // 2bd: iload 6
      // 2bf: bipush 1
      // 2c0: iadd
      // 2c1: iload 7
      // 2c3: bipush 1
      // 2c4: iadd
      // 2c5: aload 3
      // 2c6: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2c9: aload 0
      // 2ca: aload 1
      // 2cb: getstatic ox_.oiw Le0x;
      // 2ce: aload 0
      // 2cf: getstatic ox_.oiw Le0x;
      // 2d2: bipush 3
      // 2d3: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.ujv (Le0x;I)I
      // 2d6: invokevirtual e0x.kig (I)Lzfz;
      // 2d9: iload 5
      // 2db: bipush 2
      // 2dc: iadd
      // 2dd: iload 6
      // 2df: bipush 1
      // 2e0: iadd
      // 2e1: iload 7
      // 2e3: bipush 1
      // 2e4: isub
      // 2e5: aload 3
      // 2e6: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2e9: goto 2f0
      // 2ec: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 2ef: athrow
      // 2f0: return
   }

   public StructureStrongholdPieces$Stronghold$gjy i2t(Random var1) {
      int var2 = var1.nextInt(5);

      try {
         switch (var2) {
            case 0:
            case 1:
            default:
               return StructureStrongholdPieces$Stronghold$gjy.waj;
            case 2:
               return StructureStrongholdPieces$Stronghold$gjy.s8l;
            case 3:
               return StructureStrongholdPieces$Stronghold$gjy.r67;
            case 4:
         }
      } catch (oov var3) {
         throw c(var3);
      }

      return StructureStrongholdPieces$Stronghold$gjy.ca3;
   }

   public xi1 bmb(StructureStrongholdPieces$Stairs2 param1, List param2, Random param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.p7m Lvt2;
      // 04: ifnull e8
      // 07: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$3.dds [I
      // 0a: aload 0
      // 0b: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.p7m Lvt2;
      // 0e: invokevirtual vt2.ordinal ()I
      // 11: iaload
      // 12: tableswitch 214 1 4 82 126 170 34
      // 30: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 33: athrow
      // 34: aload 1
      // 35: aload 2
      // 36: aload 3
      // 37: aload 0
      // 38: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 3b: getfield yve.gdj I
      // 3e: iload 4
      // 40: iadd
      // 41: aload 0
      // 42: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 45: getfield yve._3o I
      // 48: iload 5
      // 4a: iadd
      // 4b: aload 0
      // 4c: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 4f: getfield yve.ob0 I
      // 52: bipush 1
      // 53: isub
      // 54: aload 0
      // 55: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.p7m Lvt2;
      // 58: aload 0
      // 59: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gd3 ()I
      // 5c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fdf (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 5f: areturn
      // 60: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 63: athrow
      // 64: aload 1
      // 65: aload 2
      // 66: aload 3
      // 67: aload 0
      // 68: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 6b: getfield yve.gdj I
      // 6e: iload 4
      // 70: iadd
      // 71: aload 0
      // 72: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 75: getfield yve._3o I
      // 78: iload 5
      // 7a: iadd
      // 7b: aload 0
      // 7c: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 7f: getfield yve.nwc I
      // 82: bipush 1
      // 83: iadd
      // 84: aload 0
      // 85: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.p7m Lvt2;
      // 88: aload 0
      // 89: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gd3 ()I
      // 8c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fdf (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 8f: areturn
      // 90: aload 1
      // 91: aload 2
      // 92: aload 3
      // 93: aload 0
      // 94: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 97: getfield yve.gdj I
      // 9a: bipush 1
      // 9b: isub
      // 9c: aload 0
      // 9d: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // a0: getfield yve._3o I
      // a3: iload 5
      // a5: iadd
      // a6: aload 0
      // a7: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // aa: getfield yve.ob0 I
      // ad: iload 4
      // af: iadd
      // b0: aload 0
      // b1: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.p7m Lvt2;
      // b4: aload 0
      // b5: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gd3 ()I
      // b8: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fdf (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // bb: areturn
      // bc: aload 1
      // bd: aload 2
      // be: aload 3
      // bf: aload 0
      // c0: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // c3: getfield yve.kwp I
      // c6: bipush 1
      // c7: iadd
      // c8: aload 0
      // c9: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // cc: getfield yve._3o I
      // cf: iload 5
      // d1: iadd
      // d2: aload 0
      // d3: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // d6: getfield yve.ob0 I
      // d9: iload 4
      // db: iadd
      // dc: aload 0
      // dd: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.p7m Lvt2;
      // e0: aload 0
      // e1: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gd3 ()I
      // e4: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fdf (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // e7: areturn
      // e8: aconst_null
      // e9: areturn
   }

   public xi1 go3(StructureStrongholdPieces$Stairs2 param1, List param2, Random param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.p7m Lvt2;
      // 04: ifnull e4
      // 07: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$3.dds [I
      // 0a: aload 0
      // 0b: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.p7m Lvt2;
      // 0e: invokevirtual vt2.ordinal ()I
      // 11: iaload
      // 12: tableswitch 210 1 4 81 124 167 34
      // 30: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 33: athrow
      // 34: aload 1
      // 35: aload 2
      // 36: aload 3
      // 37: aload 0
      // 38: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 3b: getfield yve.gdj I
      // 3e: bipush 1
      // 3f: isub
      // 40: aload 0
      // 41: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 44: getfield yve._3o I
      // 47: iload 4
      // 49: iadd
      // 4a: aload 0
      // 4b: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 4e: getfield yve.ob0 I
      // 51: iload 5
      // 53: iadd
      // 54: getstatic vt2.te4 Lvt2;
      // 57: aload 0
      // 58: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gd3 ()I
      // 5b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fdf (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 5e: areturn
      // 5f: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 62: athrow
      // 63: aload 1
      // 64: aload 2
      // 65: aload 3
      // 66: aload 0
      // 67: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 6a: getfield yve.gdj I
      // 6d: bipush 1
      // 6e: isub
      // 6f: aload 0
      // 70: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 73: getfield yve._3o I
      // 76: iload 4
      // 78: iadd
      // 79: aload 0
      // 7a: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 7d: getfield yve.ob0 I
      // 80: iload 5
      // 82: iadd
      // 83: getstatic vt2.te4 Lvt2;
      // 86: aload 0
      // 87: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gd3 ()I
      // 8a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fdf (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 8d: areturn
      // 8e: aload 1
      // 8f: aload 2
      // 90: aload 3
      // 91: aload 0
      // 92: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 95: getfield yve.gdj I
      // 98: iload 5
      // 9a: iadd
      // 9b: aload 0
      // 9c: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 9f: getfield yve._3o I
      // a2: iload 4
      // a4: iadd
      // a5: aload 0
      // a6: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // a9: getfield yve.ob0 I
      // ac: bipush 1
      // ad: isub
      // ae: getstatic vt2.z9q Lvt2;
      // b1: aload 0
      // b2: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gd3 ()I
      // b5: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fdf (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // b8: areturn
      // b9: aload 1
      // ba: aload 2
      // bb: aload 3
      // bc: aload 0
      // bd: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // c0: getfield yve.gdj I
      // c3: iload 5
      // c5: iadd
      // c6: aload 0
      // c7: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // ca: getfield yve._3o I
      // cd: iload 4
      // cf: iadd
      // d0: aload 0
      // d1: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // d4: getfield yve.ob0 I
      // d7: bipush 1
      // d8: isub
      // d9: getstatic vt2.z9q Lvt2;
      // dc: aload 0
      // dd: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gd3 ()I
      // e0: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fdf (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // e3: areturn
      // e4: aconst_null
      // e5: areturn
   }

   public xi1 ywi(StructureStrongholdPieces$Stairs2 param1, List param2, Random param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.p7m Lvt2;
      // 04: ifnull e4
      // 07: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$3.dds [I
      // 0a: aload 0
      // 0b: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.p7m Lvt2;
      // 0e: invokevirtual vt2.ordinal ()I
      // 11: iaload
      // 12: tableswitch 210 1 4 81 124 167 34
      // 30: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 33: athrow
      // 34: aload 1
      // 35: aload 2
      // 36: aload 3
      // 37: aload 0
      // 38: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 3b: getfield yve.kwp I
      // 3e: bipush 1
      // 3f: iadd
      // 40: aload 0
      // 41: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 44: getfield yve._3o I
      // 47: iload 4
      // 49: iadd
      // 4a: aload 0
      // 4b: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 4e: getfield yve.ob0 I
      // 51: iload 5
      // 53: iadd
      // 54: getstatic vt2.zk4 Lvt2;
      // 57: aload 0
      // 58: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gd3 ()I
      // 5b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fdf (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 5e: areturn
      // 5f: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 62: athrow
      // 63: aload 1
      // 64: aload 2
      // 65: aload 3
      // 66: aload 0
      // 67: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 6a: getfield yve.kwp I
      // 6d: bipush 1
      // 6e: iadd
      // 6f: aload 0
      // 70: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 73: getfield yve._3o I
      // 76: iload 4
      // 78: iadd
      // 79: aload 0
      // 7a: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 7d: getfield yve.ob0 I
      // 80: iload 5
      // 82: iadd
      // 83: getstatic vt2.zk4 Lvt2;
      // 86: aload 0
      // 87: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gd3 ()I
      // 8a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fdf (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 8d: areturn
      // 8e: aload 1
      // 8f: aload 2
      // 90: aload 3
      // 91: aload 0
      // 92: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 95: getfield yve.gdj I
      // 98: iload 5
      // 9a: iadd
      // 9b: aload 0
      // 9c: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // 9f: getfield yve._3o I
      // a2: iload 4
      // a4: iadd
      // a5: aload 0
      // a6: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // a9: getfield yve.nwc I
      // ac: bipush 1
      // ad: iadd
      // ae: getstatic vt2.mxp Lvt2;
      // b1: aload 0
      // b2: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gd3 ()I
      // b5: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fdf (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // b8: areturn
      // b9: aload 1
      // ba: aload 2
      // bb: aload 3
      // bc: aload 0
      // bd: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // c0: getfield yve.gdj I
      // c3: iload 5
      // c5: iadd
      // c6: aload 0
      // c7: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // ca: getfield yve._3o I
      // cd: iload 4
      // cf: iadd
      // d0: aload 0
      // d1: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.yqm Lyve;
      // d4: getfield yve.nwc I
      // d7: bipush 1
      // d8: iadd
      // d9: getstatic vt2.mxp Lvt2;
      // dc: aload 0
      // dd: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.gd3 ()I
      // e0: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.fdf (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // e3: areturn
      // e4: aconst_null
      // e5: areturn
   }

   public static boolean jty(yve param0) {
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
      // 0f: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: getfield yve._3o I
      // 17: aload 1
      // 18: ifnull 2f
      // 1b: bipush 10
      // 1d: if_icmple 32
      // 20: goto 27
      // 23: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 26: athrow
      // 27: bipush 1
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.c (Loov;)Loov;
      // 2e: athrow
      // 2f: goto 33
      // 32: bipush 0
      // 33: ireturn
   }

   public static void b(EntityLivingBase[] var0) {
      a = var0;
   }

   public static EntityLivingBase[] b() {
      return a;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8554913999971164753L, -1228138604501556260L, MethodHandles.lookup().lookupClass()).a(24841291438554L);
      // $VF: monitorexit
      c = var10000;
      EntityLivingBase[] var12 = new EntityLivingBase[2];
      b(var12);
      long var0 = c ^ 44108504021886L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "å\u0005\f\u0018>\u001a\u000eîE\u0016éËÆâXBa\u0013ò¶ì5úrB \u008c\u0013)u\\\u001c Ê\u00ad\u0089\nùF\n%Ã<~\u0090°²\u001dr0.\u0006\u0010:j\u0099\u001dÊéNÔ,(]\u0000";
      int var8 = "å\u0005\f\u0018>\u001a\u000eîE\u0016éËÆâXBa\u0013ò¶ì5úrB \u008c\u0013)u\\\u001c Ê\u00ad\u0089\nùF\n%Ã<~\u0090°²\u001dr0.\u0006\u0010:j\u0099\u001dÊéNÔ,(]\u0000"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var15 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var15;
         if ((var4 += var5) >= var8) {
            h = var9;
            i = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov c(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16563;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         i[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
