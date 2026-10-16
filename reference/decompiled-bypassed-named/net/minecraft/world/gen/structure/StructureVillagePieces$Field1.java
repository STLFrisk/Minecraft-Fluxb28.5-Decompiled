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

public class StructureVillagePieces$Field1 extends StructureVillagePieces$Village {
   private e0x zee;
   private e0x srw;
   private e0x va8;
   private e0x byp;
   private static final long a;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public StructureVillagePieces$Field1() {
   }

   public StructureVillagePieces$Field1(StructureVillagePieces$Start var1, int var2, Random var3, yve var4, vt2 var5) {
      super(var1, var2);
      this.p7m = var5;
      this.yqm = var4;
      this.zee = this.iu2(var3);
      this.srw = this.iu2(var3);
      this.va8 = this.iu2(var3);
      this.byp = this.iu2(var3);
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 137004797920987L;
      super.z0d(var1);
      var1.iin(c<"a">(5934, 4198650778461346919L ^ var2), e0x.db8.fbj(this.zee));
      var1.iin(c<"a">(7974, 5541796909058430059L ^ var2), e0x.db8.fbj(this.srw));
      var1.iin(c<"a">(17591, 3300871671737667579L ^ var2), e0x.db8.fbj(this.va8));
      var1.iin(c<"a">(26476, 9063277024425962530L ^ var2), e0x.db8.fbj(this.byp));
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 3063518089136L;
      super.oqf(var1);
      this.zee = e0x.csc(var1.uz7(c<"a">(6528, 9108405584145308579L ^ var2)));
      this.srw = e0x.csc(var1.uz7(c<"a">(9879, 936789953285547187L ^ var2)));
      this.va8 = e0x.csc(var1.uz7(c<"a">(18977, 5459344895524931585L ^ var2)));
      this.byp = e0x.csc(var1.uz7(c<"a">(4514, 4511557018862572419L ^ var2)));
   }

   private e0x iu2(Random var1) {
      try {
         switch (var1.nextInt(5)) {
            case 0:
               return ox_.r9b;
            case 1:
               return ox_.wl2;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return ox_.gi5;
   }

   public static StructureVillagePieces$Field1 mwt(
      StructureVillagePieces$Start param0, List param1, Random param2, int param3, int param4, int param5, vt2 param6, int param7
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 3
      // 01: iload 4
      // 03: iload 5
      // 05: bipush 0
      // 06: bipush 0
      // 07: bipush 0
      // 08: bipush 13
      // 0a: bipush 4
      // 0b: bipush 9
      // 0d: aload 6
      // 0f: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 12: astore 8
      // 14: aload 8
      // 16: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field1.r60 (Lyve;)Z
      // 19: ifeq 42
      // 1c: aload 1
      // 1d: aload 8
      // 1f: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 22: ifnonnull 42
      // 25: goto 2c
      // 28: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field1.a (Loov;)Loov;
      // 2b: athrow
      // 2c: new net/minecraft/world/gen/structure/StructureVillagePieces$Field1
      // 2f: dup
      // 30: aload 0
      // 31: iload 7
      // 33: aload 2
      // 34: aload 8
      // 36: aload 6
      // 38: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$Field1.<init> (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lyve;Lvt2;)V
      // 3b: goto 43
      // 3e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field1.a (Loov;)Loov;
      // 41: athrow
      // 42: aconst_null
      // 43: areturn
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
      // 006: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.e_j I
      // 009: aload 4
      // 00b: ifnull 1a1
      // 00e: ifge 05b
      // 011: goto 018
      // 014: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field1.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 3
      // 01c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.rh3 (Lt9d;Lyve;)I
      // 01f: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.e_j I
      // 022: aload 0
      // 023: aload 4
      // 025: ifnull 043
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field1.a (Loov;)Loov;
      // 02e: athrow
      // 02f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.e_j I
      // 032: ifge 042
      // 035: goto 03c
      // 038: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field1.a (Loov;)Loov;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: ireturn
      // 03e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field1.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.yqm Lyve;
      // 046: bipush 0
      // 047: aload 0
      // 048: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.e_j I
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.yqm Lyve;
      // 04f: getfield yve.ixv I
      // 052: isub
      // 053: bipush 4
      // 054: iadd
      // 055: bipush 1
      // 056: isub
      // 057: bipush 0
      // 058: invokevirtual yve.gbw (III)V
      // 05b: aload 0
      // 05c: aload 1
      // 05d: aload 3
      // 05e: bipush 0
      // 05f: bipush 1
      // 060: bipush 0
      // 061: bipush 12
      // 063: bipush 4
      // 064: bipush 8
      // 066: getstatic ox_.ibw Le0x;
      // 069: invokevirtual e0x.l4i ()Lzfz;
      // 06c: getstatic ox_.ibw Le0x;
      // 06f: invokevirtual e0x.l4i ()Lzfz;
      // 072: bipush 0
      // 073: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 076: aload 0
      // 077: aload 1
      // 078: aload 3
      // 079: bipush 1
      // 07a: bipush 0
      // 07b: bipush 1
      // 07c: bipush 2
      // 07d: bipush 0
      // 07e: bipush 7
      // 080: getstatic ox_._5i Le0x;
      // 083: invokevirtual e0x.l4i ()Lzfz;
      // 086: getstatic ox_._5i Le0x;
      // 089: invokevirtual e0x.l4i ()Lzfz;
      // 08c: bipush 0
      // 08d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 090: aload 0
      // 091: aload 1
      // 092: aload 3
      // 093: bipush 4
      // 094: bipush 0
      // 095: bipush 1
      // 096: bipush 5
      // 097: bipush 0
      // 098: bipush 7
      // 09a: getstatic ox_._5i Le0x;
      // 09d: invokevirtual e0x.l4i ()Lzfz;
      // 0a0: getstatic ox_._5i Le0x;
      // 0a3: invokevirtual e0x.l4i ()Lzfz;
      // 0a6: bipush 0
      // 0a7: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0aa: aload 0
      // 0ab: aload 1
      // 0ac: aload 3
      // 0ad: bipush 7
      // 0af: bipush 0
      // 0b0: bipush 1
      // 0b1: bipush 8
      // 0b3: bipush 0
      // 0b4: bipush 7
      // 0b6: getstatic ox_._5i Le0x;
      // 0b9: invokevirtual e0x.l4i ()Lzfz;
      // 0bc: getstatic ox_._5i Le0x;
      // 0bf: invokevirtual e0x.l4i ()Lzfz;
      // 0c2: bipush 0
      // 0c3: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0c6: aload 0
      // 0c7: aload 1
      // 0c8: aload 3
      // 0c9: bipush 10
      // 0cb: bipush 0
      // 0cc: bipush 1
      // 0cd: bipush 11
      // 0cf: bipush 0
      // 0d0: bipush 7
      // 0d2: getstatic ox_._5i Le0x;
      // 0d5: invokevirtual e0x.l4i ()Lzfz;
      // 0d8: getstatic ox_._5i Le0x;
      // 0db: invokevirtual e0x.l4i ()Lzfz;
      // 0de: bipush 0
      // 0df: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e2: aload 0
      // 0e3: aload 1
      // 0e4: aload 3
      // 0e5: bipush 0
      // 0e6: bipush 0
      // 0e7: bipush 0
      // 0e8: bipush 0
      // 0e9: bipush 0
      // 0ea: bipush 8
      // 0ec: getstatic ox_.uom Le0x;
      // 0ef: invokevirtual e0x.l4i ()Lzfz;
      // 0f2: getstatic ox_.uom Le0x;
      // 0f5: invokevirtual e0x.l4i ()Lzfz;
      // 0f8: bipush 0
      // 0f9: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0fc: aload 0
      // 0fd: aload 1
      // 0fe: aload 3
      // 0ff: bipush 6
      // 101: bipush 0
      // 102: bipush 0
      // 103: bipush 6
      // 105: bipush 0
      // 106: bipush 8
      // 108: getstatic ox_.uom Le0x;
      // 10b: invokevirtual e0x.l4i ()Lzfz;
      // 10e: getstatic ox_.uom Le0x;
      // 111: invokevirtual e0x.l4i ()Lzfz;
      // 114: bipush 0
      // 115: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 118: aload 0
      // 119: aload 1
      // 11a: aload 3
      // 11b: bipush 12
      // 11d: bipush 0
      // 11e: bipush 0
      // 11f: bipush 12
      // 121: bipush 0
      // 122: bipush 8
      // 124: getstatic ox_.uom Le0x;
      // 127: invokevirtual e0x.l4i ()Lzfz;
      // 12a: getstatic ox_.uom Le0x;
      // 12d: invokevirtual e0x.l4i ()Lzfz;
      // 130: bipush 0
      // 131: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 134: aload 0
      // 135: aload 1
      // 136: aload 3
      // 137: bipush 1
      // 138: bipush 0
      // 139: bipush 0
      // 13a: bipush 11
      // 13c: bipush 0
      // 13d: bipush 0
      // 13e: getstatic ox_.uom Le0x;
      // 141: invokevirtual e0x.l4i ()Lzfz;
      // 144: getstatic ox_.uom Le0x;
      // 147: invokevirtual e0x.l4i ()Lzfz;
      // 14a: bipush 0
      // 14b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 14e: aload 0
      // 14f: aload 1
      // 150: aload 3
      // 151: bipush 1
      // 152: bipush 0
      // 153: bipush 8
      // 155: bipush 11
      // 157: bipush 0
      // 158: bipush 8
      // 15a: getstatic ox_.uom Le0x;
      // 15d: invokevirtual e0x.l4i ()Lzfz;
      // 160: getstatic ox_.uom Le0x;
      // 163: invokevirtual e0x.l4i ()Lzfz;
      // 166: bipush 0
      // 167: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 16a: aload 0
      // 16b: aload 1
      // 16c: aload 3
      // 16d: bipush 3
      // 16e: bipush 0
      // 16f: bipush 1
      // 170: bipush 3
      // 171: bipush 0
      // 172: bipush 7
      // 174: getstatic ox_.gdz Les2;
      // 177: invokevirtual es2.l4i ()Lzfz;
      // 17a: getstatic ox_.gdz Les2;
      // 17d: invokevirtual es2.l4i ()Lzfz;
      // 180: bipush 0
      // 181: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 184: aload 0
      // 185: aload 1
      // 186: aload 3
      // 187: bipush 9
      // 189: bipush 0
      // 18a: bipush 1
      // 18b: bipush 9
      // 18d: bipush 0
      // 18e: bipush 7
      // 190: getstatic ox_.gdz Les2;
      // 193: invokevirtual es2.l4i ()Lzfz;
      // 196: getstatic ox_.gdz Les2;
      // 199: invokevirtual es2.l4i ()Lzfz;
      // 19c: bipush 0
      // 19d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1a0: bipush 1
      // 1a1: istore 5
      // 1a3: iload 5
      // 1a5: bipush 7
      // 1a7: if_icmpgt 282
      // 1aa: aload 0
      // 1ab: aload 1
      // 1ac: aload 0
      // 1ad: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.zee Le0x;
      // 1b0: aload 2
      // 1b1: bipush 2
      // 1b2: bipush 7
      // 1b4: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 1b7: invokevirtual e0x.kig (I)Lzfz;
      // 1ba: bipush 1
      // 1bb: bipush 1
      // 1bc: iload 5
      // 1be: aload 3
      // 1bf: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1c2: aload 0
      // 1c3: aload 1
      // 1c4: aload 0
      // 1c5: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.zee Le0x;
      // 1c8: aload 2
      // 1c9: bipush 2
      // 1ca: bipush 7
      // 1cc: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 1cf: invokevirtual e0x.kig (I)Lzfz;
      // 1d2: bipush 2
      // 1d3: bipush 1
      // 1d4: iload 5
      // 1d6: aload 3
      // 1d7: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1da: aload 0
      // 1db: aload 1
      // 1dc: aload 0
      // 1dd: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.srw Le0x;
      // 1e0: aload 2
      // 1e1: bipush 2
      // 1e2: bipush 7
      // 1e4: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 1e7: invokevirtual e0x.kig (I)Lzfz;
      // 1ea: bipush 4
      // 1eb: bipush 1
      // 1ec: iload 5
      // 1ee: aload 3
      // 1ef: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1f2: aload 0
      // 1f3: aload 1
      // 1f4: aload 0
      // 1f5: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.srw Le0x;
      // 1f8: aload 2
      // 1f9: bipush 2
      // 1fa: bipush 7
      // 1fc: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 1ff: invokevirtual e0x.kig (I)Lzfz;
      // 202: bipush 5
      // 203: bipush 1
      // 204: iload 5
      // 206: aload 3
      // 207: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 20a: aload 0
      // 20b: aload 1
      // 20c: aload 0
      // 20d: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.va8 Le0x;
      // 210: aload 2
      // 211: bipush 2
      // 212: bipush 7
      // 214: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 217: invokevirtual e0x.kig (I)Lzfz;
      // 21a: bipush 7
      // 21c: bipush 1
      // 21d: iload 5
      // 21f: aload 3
      // 220: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 223: aload 0
      // 224: aload 1
      // 225: aload 0
      // 226: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.va8 Le0x;
      // 229: aload 2
      // 22a: bipush 2
      // 22b: bipush 7
      // 22d: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 230: invokevirtual e0x.kig (I)Lzfz;
      // 233: bipush 8
      // 235: bipush 1
      // 236: iload 5
      // 238: aload 3
      // 239: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 23c: aload 0
      // 23d: aload 1
      // 23e: aload 0
      // 23f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.byp Le0x;
      // 242: aload 2
      // 243: bipush 2
      // 244: bipush 7
      // 246: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 249: invokevirtual e0x.kig (I)Lzfz;
      // 24c: bipush 10
      // 24e: bipush 1
      // 24f: iload 5
      // 251: aload 3
      // 252: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 255: aload 0
      // 256: aload 1
      // 257: aload 0
      // 258: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field1.byp Le0x;
      // 25b: aload 2
      // 25c: bipush 2
      // 25d: bipush 7
      // 25f: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 262: invokevirtual e0x.kig (I)Lzfz;
      // 265: bipush 11
      // 267: bipush 1
      // 268: iload 5
      // 26a: aload 3
      // 26b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 26e: iinc 5 1
      // 271: aload 4
      // 273: ifnull 285
      // 276: aload 4
      // 278: ifnonnull 1a3
      // 27b: goto 282
      // 27e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field1.a (Loov;)Loov;
      // 281: athrow
      // 282: bipush 0
      // 283: istore 5
      // 285: iload 5
      // 287: bipush 9
      // 289: if_icmpge 2da
      // 28c: bipush 0
      // 28d: aload 4
      // 28f: ifnull 2db
      // 292: goto 299
      // 295: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field1.a (Loov;)Loov;
      // 298: athrow
      // 299: istore 6
      // 29b: iload 6
      // 29d: bipush 13
      // 29f: if_icmpge 2d2
      // 2a2: aload 0
      // 2a3: aload 1
      // 2a4: iload 6
      // 2a6: bipush 4
      // 2a7: iload 5
      // 2a9: aload 3
      // 2aa: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.epu (Lt9d;IIILyve;)V
      // 2ad: aload 0
      // 2ae: aload 1
      // 2af: getstatic ox_.kqk Le0x;
      // 2b2: invokevirtual e0x.l4i ()Lzfz;
      // 2b5: iload 6
      // 2b7: bipush -1
      // 2b8: iload 5
      // 2ba: aload 3
      // 2bb: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field1.doc (Lt9d;Lzfz;IIILyve;)V
      // 2be: iinc 6 1
      // 2c1: aload 4
      // 2c3: ifnull 2d5
      // 2c6: aload 4
      // 2c8: ifnonnull 29b
      // 2cb: goto 2d2
      // 2ce: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field1.a (Loov;)Loov;
      // 2d1: athrow
      // 2d2: iinc 5 1
      // 2d5: aload 4
      // 2d7: ifnonnull 285
      // 2da: bipush 1
      // 2db: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7328130891184340040L, -2584808124191046060L, MethodHandles.lookup().lookupClass()).a(40134695915332L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 70165831001321L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "2Ä{Ê«_LTå¥£Òù\u0082³\u0082\u0010\u008fÖ$i-@.7«'¤\u009aFªÿ\u000e\u0010§t\u008c³ÃÒ\u0087\u0095þR@¥\u0096ñ0×\u0010À+ø±é\"ëDLÛÃG\u0004K\n\u008e\u0010Ø¤Ì'(\u0015/&íw¯H\u009deNì\u0010\u007f¼cÝ\u009d\u0090ö&\u0017\u0007Mòö%\u0089-";
      int var8 = "2Ä{Ê«_LTå¥£Òù\u0082³\u0082\u0010\u008fÖ$i-@.7«'¤\u009aFªÿ\u000e\u0010§t\u008c³ÃÒ\u0087\u0095þR@¥\u0096ñ0×\u0010À+ø±é\"ëDLÛÃG\u0004K\n\u008e\u0010Ø¤Ì'(\u0015/&íw¯H\u009deNì\u0010\u007f¼cÝ\u009d\u0090ö&\u0017\u0007Mòö%\u0089-"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     j = var9;
                     k = new String[8];
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

                  var6 = "ä\u008aú*).û\u0098ÕeÅNÌ½Äú\u0010û±óGºoÕ£\u0007{\u0006VO*ï\u000e";
                  var8 = "ä\u008aú*).û\u0098ÕeÅNÌ½Äú\u0010û±óGºoÕ£\u0007{\u0006VO*ï\u000e".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19978;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces$Field1", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces$Field1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
