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

public class StructureVillagePieces$House2 extends StructureVillagePieces$Village {
   private static final List r2k;
   private boolean t8u;
   private static final long a;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public StructureVillagePieces$House2() {
   }

   public StructureVillagePieces$House2(StructureVillagePieces$Start var1, int var2, Random var3, yve var4, vt2 var5) {
      super(var1, var2);
      this.p7m = var5;
      this.yqm = var4;
   }

   public static StructureVillagePieces$House2 yj2(
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
      // 08: bipush 10
      // 0a: bipush 6
      // 0c: bipush 7
      // 0e: aload 6
      // 10: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 13: astore 8
      // 15: aload 8
      // 17: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.r60 (Lyve;)Z
      // 1a: ifeq 43
      // 1d: aload 1
      // 1e: aload 8
      // 20: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 23: ifnonnull 43
      // 26: goto 2d
      // 29: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 2c: athrow
      // 2d: new net/minecraft/world/gen/structure/StructureVillagePieces$House2
      // 30: dup
      // 31: aload 0
      // 32: iload 7
      // 34: aload 2
      // 35: aload 8
      // 37: aload 6
      // 39: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$House2.<init> (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lyve;Lvt2;)V
      // 3c: goto 44
      // 3f: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 42: athrow
      // 43: aconst_null
      // 44: areturn
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 83164658188582L;
      super.z0d(var1);
      var1.zyu(c<"l">(9779, 26496526420958890L ^ var2), this.t8u);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 59308839569485L;
      super.oqf(var1);
      this.t8u = var1.dvl(c<"l">(15341, 4711693516533500446L ^ var2));
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
      // 006: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House2.e_j I
      // 009: aload 4
      // 00b: ifnull 345
      // 00e: ifge 05c
      // 011: goto 018
      // 014: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 3
      // 01c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.rh3 (Lt9d;Lyve;)I
      // 01f: putfield net/minecraft/world/gen/structure/StructureVillagePieces$House2.e_j I
      // 022: aload 0
      // 023: aload 4
      // 025: ifnull 043
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 02e: athrow
      // 02f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House2.e_j I
      // 032: ifge 042
      // 035: goto 03c
      // 038: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: ireturn
      // 03e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House2.yqm Lyve;
      // 046: bipush 0
      // 047: aload 0
      // 048: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House2.e_j I
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House2.yqm Lyve;
      // 04f: getfield yve.ixv I
      // 052: isub
      // 053: bipush 6
      // 055: iadd
      // 056: bipush 1
      // 057: isub
      // 058: bipush 0
      // 059: invokevirtual yve.gbw (III)V
      // 05c: aload 0
      // 05d: aload 1
      // 05e: aload 3
      // 05f: bipush 0
      // 060: bipush 1
      // 061: bipush 0
      // 062: bipush 9
      // 064: bipush 4
      // 065: bipush 6
      // 067: getstatic ox_.ibw Le0x;
      // 06a: invokevirtual e0x.l4i ()Lzfz;
      // 06d: getstatic ox_.ibw Le0x;
      // 070: invokevirtual e0x.l4i ()Lzfz;
      // 073: bipush 0
      // 074: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 077: aload 0
      // 078: aload 1
      // 079: aload 3
      // 07a: bipush 0
      // 07b: bipush 0
      // 07c: bipush 0
      // 07d: bipush 9
      // 07f: bipush 0
      // 080: bipush 6
      // 082: getstatic ox_.a3_ Le0x;
      // 085: invokevirtual e0x.l4i ()Lzfz;
      // 088: getstatic ox_.a3_ Le0x;
      // 08b: invokevirtual e0x.l4i ()Lzfz;
      // 08e: bipush 0
      // 08f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 092: aload 0
      // 093: aload 1
      // 094: aload 3
      // 095: bipush 0
      // 096: bipush 4
      // 097: bipush 0
      // 098: bipush 9
      // 09a: bipush 4
      // 09b: bipush 6
      // 09d: getstatic ox_.a3_ Le0x;
      // 0a0: invokevirtual e0x.l4i ()Lzfz;
      // 0a3: getstatic ox_.a3_ Le0x;
      // 0a6: invokevirtual e0x.l4i ()Lzfz;
      // 0a9: bipush 0
      // 0aa: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0ad: aload 0
      // 0ae: aload 1
      // 0af: aload 3
      // 0b0: bipush 0
      // 0b1: bipush 5
      // 0b2: bipush 0
      // 0b3: bipush 9
      // 0b5: bipush 5
      // 0b6: bipush 6
      // 0b8: getstatic ox_.bj8 Lizd;
      // 0bb: invokevirtual izd.l4i ()Lzfz;
      // 0be: getstatic ox_.bj8 Lizd;
      // 0c1: invokevirtual izd.l4i ()Lzfz;
      // 0c4: bipush 0
      // 0c5: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0c8: aload 0
      // 0c9: aload 1
      // 0ca: aload 3
      // 0cb: bipush 1
      // 0cc: bipush 5
      // 0cd: bipush 1
      // 0ce: bipush 8
      // 0d0: bipush 5
      // 0d1: bipush 5
      // 0d2: getstatic ox_.ibw Le0x;
      // 0d5: invokevirtual e0x.l4i ()Lzfz;
      // 0d8: getstatic ox_.ibw Le0x;
      // 0db: invokevirtual e0x.l4i ()Lzfz;
      // 0de: bipush 0
      // 0df: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e2: aload 0
      // 0e3: aload 1
      // 0e4: aload 3
      // 0e5: bipush 1
      // 0e6: bipush 1
      // 0e7: bipush 0
      // 0e8: bipush 2
      // 0e9: bipush 3
      // 0ea: bipush 0
      // 0eb: getstatic ox_.wb7 Le0x;
      // 0ee: invokevirtual e0x.l4i ()Lzfz;
      // 0f1: getstatic ox_.wb7 Le0x;
      // 0f4: invokevirtual e0x.l4i ()Lzfz;
      // 0f7: bipush 0
      // 0f8: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0fb: aload 0
      // 0fc: aload 1
      // 0fd: aload 3
      // 0fe: bipush 0
      // 0ff: bipush 1
      // 100: bipush 0
      // 101: bipush 0
      // 102: bipush 4
      // 103: bipush 0
      // 104: getstatic ox_.uom Le0x;
      // 107: invokevirtual e0x.l4i ()Lzfz;
      // 10a: getstatic ox_.uom Le0x;
      // 10d: invokevirtual e0x.l4i ()Lzfz;
      // 110: bipush 0
      // 111: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 114: aload 0
      // 115: aload 1
      // 116: aload 3
      // 117: bipush 3
      // 118: bipush 1
      // 119: bipush 0
      // 11a: bipush 3
      // 11b: bipush 4
      // 11c: bipush 0
      // 11d: getstatic ox_.uom Le0x;
      // 120: invokevirtual e0x.l4i ()Lzfz;
      // 123: getstatic ox_.uom Le0x;
      // 126: invokevirtual e0x.l4i ()Lzfz;
      // 129: bipush 0
      // 12a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 12d: aload 0
      // 12e: aload 1
      // 12f: aload 3
      // 130: bipush 0
      // 131: bipush 1
      // 132: bipush 6
      // 134: bipush 0
      // 135: bipush 4
      // 136: bipush 6
      // 138: getstatic ox_.uom Le0x;
      // 13b: invokevirtual e0x.l4i ()Lzfz;
      // 13e: getstatic ox_.uom Le0x;
      // 141: invokevirtual e0x.l4i ()Lzfz;
      // 144: bipush 0
      // 145: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 148: aload 0
      // 149: aload 1
      // 14a: getstatic ox_.wb7 Le0x;
      // 14d: invokevirtual e0x.l4i ()Lzfz;
      // 150: bipush 3
      // 151: bipush 3
      // 152: bipush 1
      // 153: aload 3
      // 154: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 157: aload 0
      // 158: aload 1
      // 159: aload 3
      // 15a: bipush 3
      // 15b: bipush 1
      // 15c: bipush 2
      // 15d: bipush 3
      // 15e: bipush 3
      // 15f: bipush 2
      // 160: getstatic ox_.wb7 Le0x;
      // 163: invokevirtual e0x.l4i ()Lzfz;
      // 166: getstatic ox_.wb7 Le0x;
      // 169: invokevirtual e0x.l4i ()Lzfz;
      // 16c: bipush 0
      // 16d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 170: aload 0
      // 171: aload 1
      // 172: aload 3
      // 173: bipush 4
      // 174: bipush 1
      // 175: bipush 3
      // 176: bipush 5
      // 177: bipush 3
      // 178: bipush 3
      // 179: getstatic ox_.wb7 Le0x;
      // 17c: invokevirtual e0x.l4i ()Lzfz;
      // 17f: getstatic ox_.wb7 Le0x;
      // 182: invokevirtual e0x.l4i ()Lzfz;
      // 185: bipush 0
      // 186: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 189: aload 0
      // 18a: aload 1
      // 18b: aload 3
      // 18c: bipush 0
      // 18d: bipush 1
      // 18e: bipush 1
      // 18f: bipush 0
      // 190: bipush 3
      // 191: bipush 5
      // 192: getstatic ox_.wb7 Le0x;
      // 195: invokevirtual e0x.l4i ()Lzfz;
      // 198: getstatic ox_.wb7 Le0x;
      // 19b: invokevirtual e0x.l4i ()Lzfz;
      // 19e: bipush 0
      // 19f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1a2: aload 0
      // 1a3: aload 1
      // 1a4: aload 3
      // 1a5: bipush 1
      // 1a6: bipush 1
      // 1a7: bipush 6
      // 1a9: bipush 5
      // 1aa: bipush 3
      // 1ab: bipush 6
      // 1ad: getstatic ox_.wb7 Le0x;
      // 1b0: invokevirtual e0x.l4i ()Lzfz;
      // 1b3: getstatic ox_.wb7 Le0x;
      // 1b6: invokevirtual e0x.l4i ()Lzfz;
      // 1b9: bipush 0
      // 1ba: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1bd: aload 0
      // 1be: aload 1
      // 1bf: aload 3
      // 1c0: bipush 5
      // 1c1: bipush 1
      // 1c2: bipush 0
      // 1c3: bipush 5
      // 1c4: bipush 3
      // 1c5: bipush 0
      // 1c6: getstatic ox_.j5b Le0x;
      // 1c9: invokevirtual e0x.l4i ()Lzfz;
      // 1cc: getstatic ox_.j5b Le0x;
      // 1cf: invokevirtual e0x.l4i ()Lzfz;
      // 1d2: bipush 0
      // 1d3: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1d6: aload 0
      // 1d7: aload 1
      // 1d8: aload 3
      // 1d9: bipush 9
      // 1db: bipush 1
      // 1dc: bipush 0
      // 1dd: bipush 9
      // 1df: bipush 3
      // 1e0: bipush 0
      // 1e1: getstatic ox_.j5b Le0x;
      // 1e4: invokevirtual e0x.l4i ()Lzfz;
      // 1e7: getstatic ox_.j5b Le0x;
      // 1ea: invokevirtual e0x.l4i ()Lzfz;
      // 1ed: bipush 0
      // 1ee: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1f1: aload 0
      // 1f2: aload 1
      // 1f3: aload 3
      // 1f4: bipush 6
      // 1f6: bipush 1
      // 1f7: bipush 4
      // 1f8: bipush 9
      // 1fa: bipush 4
      // 1fb: bipush 6
      // 1fd: getstatic ox_.a3_ Le0x;
      // 200: invokevirtual e0x.l4i ()Lzfz;
      // 203: getstatic ox_.a3_ Le0x;
      // 206: invokevirtual e0x.l4i ()Lzfz;
      // 209: bipush 0
      // 20a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 20d: aload 0
      // 20e: aload 1
      // 20f: getstatic ox_.dr2 L_13;
      // 212: invokevirtual _13.l4i ()Lzfz;
      // 215: bipush 7
      // 217: bipush 1
      // 218: bipush 5
      // 219: aload 3
      // 21a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 21d: aload 0
      // 21e: aload 1
      // 21f: getstatic ox_.dr2 L_13;
      // 222: invokevirtual _13.l4i ()Lzfz;
      // 225: bipush 8
      // 227: bipush 1
      // 228: bipush 5
      // 229: aload 3
      // 22a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 22d: aload 0
      // 22e: aload 1
      // 22f: getstatic ox_.ytr Le0x;
      // 232: invokevirtual e0x.l4i ()Lzfz;
      // 235: bipush 9
      // 237: bipush 2
      // 238: bipush 5
      // 239: aload 3
      // 23a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 23d: aload 0
      // 23e: aload 1
      // 23f: getstatic ox_.ytr Le0x;
      // 242: invokevirtual e0x.l4i ()Lzfz;
      // 245: bipush 9
      // 247: bipush 2
      // 248: bipush 4
      // 249: aload 3
      // 24a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 24d: aload 0
      // 24e: aload 1
      // 24f: aload 3
      // 250: bipush 7
      // 252: bipush 2
      // 253: bipush 4
      // 254: bipush 8
      // 256: bipush 2
      // 257: bipush 5
      // 258: getstatic ox_.ibw Le0x;
      // 25b: invokevirtual e0x.l4i ()Lzfz;
      // 25e: getstatic ox_.ibw Le0x;
      // 261: invokevirtual e0x.l4i ()Lzfz;
      // 264: bipush 0
      // 265: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 268: aload 0
      // 269: aload 1
      // 26a: getstatic ox_.a3_ Le0x;
      // 26d: invokevirtual e0x.l4i ()Lzfz;
      // 270: bipush 6
      // 272: bipush 1
      // 273: bipush 3
      // 274: aload 3
      // 275: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 278: aload 0
      // 279: aload 1
      // 27a: getstatic ox_.o16 Le0x;
      // 27d: invokevirtual e0x.l4i ()Lzfz;
      // 280: bipush 6
      // 282: bipush 2
      // 283: bipush 3
      // 284: aload 3
      // 285: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 288: aload 0
      // 289: aload 1
      // 28a: getstatic ox_.o16 Le0x;
      // 28d: invokevirtual e0x.l4i ()Lzfz;
      // 290: bipush 6
      // 292: bipush 3
      // 293: bipush 3
      // 294: aload 3
      // 295: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 298: aload 0
      // 299: aload 1
      // 29a: getstatic ox_.yvz Lizd;
      // 29d: invokevirtual izd.l4i ()Lzfz;
      // 2a0: bipush 8
      // 2a2: bipush 1
      // 2a3: bipush 1
      // 2a4: aload 3
      // 2a5: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2a8: aload 0
      // 2a9: aload 1
      // 2aa: getstatic ox_.g6c Le0x;
      // 2ad: invokevirtual e0x.l4i ()Lzfz;
      // 2b0: bipush 0
      // 2b1: bipush 2
      // 2b2: bipush 2
      // 2b3: aload 3
      // 2b4: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2b7: aload 0
      // 2b8: aload 1
      // 2b9: getstatic ox_.g6c Le0x;
      // 2bc: invokevirtual e0x.l4i ()Lzfz;
      // 2bf: bipush 0
      // 2c0: bipush 2
      // 2c1: bipush 4
      // 2c2: aload 3
      // 2c3: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2c6: aload 0
      // 2c7: aload 1
      // 2c8: getstatic ox_.g6c Le0x;
      // 2cb: invokevirtual e0x.l4i ()Lzfz;
      // 2ce: bipush 2
      // 2cf: bipush 2
      // 2d0: bipush 6
      // 2d2: aload 3
      // 2d3: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2d6: aload 0
      // 2d7: aload 1
      // 2d8: getstatic ox_.g6c Le0x;
      // 2db: invokevirtual e0x.l4i ()Lzfz;
      // 2de: bipush 4
      // 2df: bipush 2
      // 2e0: bipush 6
      // 2e2: aload 3
      // 2e3: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2e6: aload 0
      // 2e7: aload 1
      // 2e8: getstatic ox_.j5b Le0x;
      // 2eb: invokevirtual e0x.l4i ()Lzfz;
      // 2ee: bipush 2
      // 2ef: bipush 1
      // 2f0: bipush 4
      // 2f1: aload 3
      // 2f2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2f5: aload 0
      // 2f6: aload 1
      // 2f7: getstatic ox_.drm Le0x;
      // 2fa: invokevirtual e0x.l4i ()Lzfz;
      // 2fd: bipush 2
      // 2fe: bipush 2
      // 2ff: bipush 4
      // 300: aload 3
      // 301: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 304: aload 0
      // 305: aload 1
      // 306: getstatic ox_.wb7 Le0x;
      // 309: invokevirtual e0x.l4i ()Lzfz;
      // 30c: bipush 1
      // 30d: bipush 1
      // 30e: bipush 5
      // 30f: aload 3
      // 310: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 313: aload 0
      // 314: aload 1
      // 315: getstatic ox_.olk Le0x;
      // 318: aload 0
      // 319: getstatic ox_.olk Le0x;
      // 31c: bipush 3
      // 31d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.ujv (Le0x;I)I
      // 320: invokevirtual e0x.kig (I)Lzfz;
      // 323: bipush 2
      // 324: bipush 1
      // 325: bipush 5
      // 326: aload 3
      // 327: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 32a: aload 0
      // 32b: aload 1
      // 32c: getstatic ox_.olk Le0x;
      // 32f: aload 0
      // 330: getstatic ox_.olk Le0x;
      // 333: bipush 1
      // 334: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.ujv (Le0x;I)I
      // 337: invokevirtual e0x.kig (I)Lzfz;
      // 33a: bipush 1
      // 33b: bipush 1
      // 33c: bipush 4
      // 33d: aload 3
      // 33e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 341: aload 0
      // 342: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House2.t8u Z
      // 345: aload 4
      // 347: ifnull 3aa
      // 34a: ifne 3a8
      // 34d: goto 354
      // 350: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 353: athrow
      // 354: aload 3
      // 355: new mew
      // 358: dup
      // 359: aload 0
      // 35a: bipush 5
      // 35b: bipush 5
      // 35c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.q__ (II)I
      // 35f: aload 0
      // 360: bipush 1
      // 361: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2._tw (I)I
      // 364: aload 0
      // 365: bipush 5
      // 366: bipush 5
      // 367: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2._ye (II)I
      // 36a: invokespecial mew.<init> (III)V
      // 36d: invokevirtual yve.vwy (Lwgo;)Z
      // 370: aload 4
      // 372: ifnull 3aa
      // 375: goto 37c
      // 378: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 37b: athrow
      // 37c: ifeq 3a8
      // 37f: goto 386
      // 382: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 385: athrow
      // 386: aload 0
      // 387: bipush 1
      // 388: putfield net/minecraft/world/gen/structure/StructureVillagePieces$House2.t8u Z
      // 38b: aload 0
      // 38c: aload 1
      // 38d: aload 3
      // 38e: aload 2
      // 38f: bipush 5
      // 390: bipush 1
      // 391: bipush 5
      // 392: getstatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.r2k Ljava/util/List;
      // 395: bipush 3
      // 396: aload 2
      // 397: bipush 6
      // 399: invokevirtual java/util/Random.nextInt (I)I
      // 39c: iadd
      // 39d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.y6k (Lt9d;Lyve;Ljava/util/Random;IIILjava/util/List;I)Z
      // 3a0: pop
      // 3a1: goto 3a8
      // 3a4: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 3a7: athrow
      // 3a8: bipush 6
      // 3aa: istore 5
      // 3ac: iload 5
      // 3ae: bipush 8
      // 3b0: if_icmpgt 435
      // 3b3: aload 0
      // 3b4: aload 1
      // 3b5: aload 4
      // 3b7: ifnull 489
      // 3ba: iload 5
      // 3bc: bipush 0
      // 3bd: bipush -1
      // 3be: aload 3
      // 3bf: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.t90 (Lt9d;IIILyve;)Lzfz;
      // 3c2: invokeinterface zfz.r_y ()Le0x; 1
      // 3c7: invokevirtual e0x.p1r ()Lp3y;
      // 3ca: getstatic p3y.cei Lp3y;
      // 3cd: aload 4
      // 3cf: ifnull 40b
      // 3d2: goto 3d9
      // 3d5: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 3d8: athrow
      // 3d9: if_acmpne 42d
      // 3dc: goto 3e3
      // 3df: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 3e2: athrow
      // 3e3: aload 0
      // 3e4: aload 1
      // 3e5: aload 4
      // 3e7: ifnull 417
      // 3ea: goto 3f1
      // 3ed: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 3f0: athrow
      // 3f1: iload 5
      // 3f3: bipush -1
      // 3f4: bipush -1
      // 3f5: aload 3
      // 3f6: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.t90 (Lt9d;IIILyve;)Lzfz;
      // 3f9: invokeinterface zfz.r_y ()Le0x; 1
      // 3fe: invokevirtual e0x.p1r ()Lp3y;
      // 401: getstatic p3y.cei Lp3y;
      // 404: goto 40b
      // 407: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 40a: athrow
      // 40b: if_acmpeq 42d
      // 40e: aload 0
      // 40f: aload 1
      // 410: goto 417
      // 413: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 416: athrow
      // 417: getstatic ox_.l3f Le0x;
      // 41a: aload 0
      // 41b: getstatic ox_.l3f Le0x;
      // 41e: bipush 3
      // 41f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.ujv (Le0x;I)I
      // 422: invokevirtual e0x.kig (I)Lzfz;
      // 425: iload 5
      // 427: bipush 0
      // 428: bipush -1
      // 429: aload 3
      // 42a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 42d: iinc 5 1
      // 430: aload 4
      // 432: ifnonnull 3ac
      // 435: bipush 0
      // 436: istore 5
      // 438: iload 5
      // 43a: bipush 7
      // 43c: if_icmpge 487
      // 43f: bipush 0
      // 440: aload 4
      // 442: ifnull 493
      // 445: istore 6
      // 447: iload 6
      // 449: bipush 10
      // 44b: if_icmpge 47f
      // 44e: aload 0
      // 44f: aload 1
      // 450: iload 6
      // 452: bipush 6
      // 454: iload 5
      // 456: aload 3
      // 457: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.epu (Lt9d;IIILyve;)V
      // 45a: aload 0
      // 45b: aload 1
      // 45c: getstatic ox_.a3_ Le0x;
      // 45f: invokevirtual e0x.l4i ()Lzfz;
      // 462: iload 6
      // 464: bipush -1
      // 465: iload 5
      // 467: aload 3
      // 468: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.doc (Lt9d;Lzfz;IIILyve;)V
      // 46b: iinc 6 1
      // 46e: aload 4
      // 470: ifnull 482
      // 473: aload 4
      // 475: ifnonnull 447
      // 478: goto 47f
      // 47b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House2.a (Loov;)Loov;
      // 47e: athrow
      // 47f: iinc 5 1
      // 482: aload 4
      // 484: ifnonnull 438
      // 487: aload 0
      // 488: aload 1
      // 489: aload 3
      // 48a: bipush 7
      // 48c: bipush 1
      // 48d: bipush 1
      // 48e: bipush 1
      // 48f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House2.pil (Lt9d;Lyve;IIII)V
      // 492: bipush 1
      // 493: ireturn
   }

   @Override
   public int e0x(int var1, int var2) {
      return 3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4174613695700341075L, -1623314925331742422L, MethodHandles.lookup().lookupClass()).a(278969045520045L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 125309153296533L;
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
      String var6 = "dX\u0083\u00adð#´bI\u0090 «\u008bFÁ~\u0010FÓøc\u0013\u0013¬\u0012\u0087\u008c9Öé\u0098À\u0099";
      int var8 = "dX\u0083\u00adð#´bI\u0090 «\u008bFÁ~\u0010FÓøc\u0013\u0013¬\u0012\u0087\u008c9Öé\u0098À\u0099".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            j = var9;
            k = new String[2];
            r2k = Lists.newArrayList(
               new ypi[]{
                  new ypi(xbr.exg, 0, 1, 3, 3),
                  new ypi(xbr.icz, 0, 1, 5, 10),
                  new ypi(xbr.jtr, 0, 1, 3, 5),
                  new ypi(xbr.nfb, 0, 1, 3, 15),
                  new ypi(xbr.lym, 0, 1, 3, 15),
                  new ypi(xbr.l4f, 0, 1, 1, 5),
                  new ypi(xbr.jfo, 0, 1, 1, 5),
                  new ypi(xbr.w41, 0, 1, 1, 5),
                  new ypi(xbr.c2v, 0, 1, 1, 5),
                  new ypi(xbr.hfp, 0, 1, 1, 5),
                  new ypi(xbr.tfe, 0, 1, 1, 5),
                  new ypi(u7m.gfm(ox_.j4y), 0, 3, 7, 5),
                  new ypi(u7m.gfm(ox_.t_k), 0, 3, 7, 5),
                  new ypi(xbr.fpq, 0, 1, 1, 3),
                  new ypi(xbr.mhm, 0, 1, 1, 1),
                  new ypi(xbr.fps, 0, 1, 1, 1),
                  new ypi(xbr.krl, 0, 1, 1, 1)
               }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15838;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces$House2", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces$House2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
