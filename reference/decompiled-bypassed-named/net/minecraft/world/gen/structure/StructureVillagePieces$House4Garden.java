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

public class StructureVillagePieces$House4Garden extends StructureVillagePieces$Village {
   private boolean e9f;
   private static final long a;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public StructureVillagePieces$House4Garden() {
   }

   public StructureVillagePieces$House4Garden(StructureVillagePieces$Start var1, int var2, Random var3, yve var4, vt2 var5) {
      super(var1, var2);
      this.p7m = var5;
      this.yqm = var4;
      this.e9f = var3.nextBoolean();
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 87349511880199L;
      super.z0d(var1);
      var1.zyu(c<"y">(12316, 7030303403766329018L ^ var2), this.e9f);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 54022251231084L;
      super.oqf(var1);
      this.e9f = var1.dvl(c<"y">(25416, 2646904829296030852L ^ var2));
   }

   public static StructureVillagePieces$House4Garden ffk(
      StructureVillagePieces$Start var0, List var1, Random var2, int var3, int var4, int var5, vt2 var6, int var7
   ) {
      yve var8 = yve.sgq(var3, var4, var5, 0, 0, 0, 5, 6, 5, var6);

      try {
         if (xi1.qvo(var1, var8) != null) {
            return null;
         }
      } catch (oov var9) {
         throw a(var9);
      }

      return new StructureVillagePieces$House4Garden(var0, var7, var2, var8, var6);
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
      // 006: aload 4
      // 008: ifnull 23d
      // 00b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.e_j I
      // 00e: ifge 05c
      // 011: goto 018
      // 014: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 3
      // 01c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.rh3 (Lt9d;Lyve;)I
      // 01f: putfield net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.e_j I
      // 022: aload 0
      // 023: aload 4
      // 025: ifnull 043
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.a (Loov;)Loov;
      // 02e: athrow
      // 02f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.e_j I
      // 032: ifge 042
      // 035: goto 03c
      // 038: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.a (Loov;)Loov;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: ireturn
      // 03e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.yqm Lyve;
      // 046: bipush 0
      // 047: aload 0
      // 048: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.e_j I
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.yqm Lyve;
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
      // 060: bipush 0
      // 061: bipush 0
      // 062: bipush 4
      // 063: bipush 0
      // 064: bipush 4
      // 065: getstatic ox_.a3_ Le0x;
      // 068: invokevirtual e0x.l4i ()Lzfz;
      // 06b: getstatic ox_.a3_ Le0x;
      // 06e: invokevirtual e0x.l4i ()Lzfz;
      // 071: bipush 0
      // 072: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 075: aload 0
      // 076: aload 1
      // 077: aload 3
      // 078: bipush 0
      // 079: bipush 4
      // 07a: bipush 0
      // 07b: bipush 4
      // 07c: bipush 4
      // 07d: bipush 4
      // 07e: getstatic ox_.uom Le0x;
      // 081: invokevirtual e0x.l4i ()Lzfz;
      // 084: getstatic ox_.uom Le0x;
      // 087: invokevirtual e0x.l4i ()Lzfz;
      // 08a: bipush 0
      // 08b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 08e: aload 0
      // 08f: aload 1
      // 090: aload 3
      // 091: bipush 1
      // 092: bipush 4
      // 093: bipush 1
      // 094: bipush 3
      // 095: bipush 4
      // 096: bipush 3
      // 097: getstatic ox_.wb7 Le0x;
      // 09a: invokevirtual e0x.l4i ()Lzfz;
      // 09d: getstatic ox_.wb7 Le0x;
      // 0a0: invokevirtual e0x.l4i ()Lzfz;
      // 0a3: bipush 0
      // 0a4: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0a7: aload 0
      // 0a8: aload 1
      // 0a9: getstatic ox_.a3_ Le0x;
      // 0ac: invokevirtual e0x.l4i ()Lzfz;
      // 0af: bipush 0
      // 0b0: bipush 1
      // 0b1: bipush 0
      // 0b2: aload 3
      // 0b3: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b6: aload 0
      // 0b7: aload 1
      // 0b8: getstatic ox_.a3_ Le0x;
      // 0bb: invokevirtual e0x.l4i ()Lzfz;
      // 0be: bipush 0
      // 0bf: bipush 2
      // 0c0: bipush 0
      // 0c1: aload 3
      // 0c2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0c5: aload 0
      // 0c6: aload 1
      // 0c7: getstatic ox_.a3_ Le0x;
      // 0ca: invokevirtual e0x.l4i ()Lzfz;
      // 0cd: bipush 0
      // 0ce: bipush 3
      // 0cf: bipush 0
      // 0d0: aload 3
      // 0d1: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0d4: aload 0
      // 0d5: aload 1
      // 0d6: getstatic ox_.a3_ Le0x;
      // 0d9: invokevirtual e0x.l4i ()Lzfz;
      // 0dc: bipush 4
      // 0dd: bipush 1
      // 0de: bipush 0
      // 0df: aload 3
      // 0e0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0e3: aload 0
      // 0e4: aload 1
      // 0e5: getstatic ox_.a3_ Le0x;
      // 0e8: invokevirtual e0x.l4i ()Lzfz;
      // 0eb: bipush 4
      // 0ec: bipush 2
      // 0ed: bipush 0
      // 0ee: aload 3
      // 0ef: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f2: aload 0
      // 0f3: aload 1
      // 0f4: getstatic ox_.a3_ Le0x;
      // 0f7: invokevirtual e0x.l4i ()Lzfz;
      // 0fa: bipush 4
      // 0fb: bipush 3
      // 0fc: bipush 0
      // 0fd: aload 3
      // 0fe: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 101: aload 0
      // 102: aload 1
      // 103: getstatic ox_.a3_ Le0x;
      // 106: invokevirtual e0x.l4i ()Lzfz;
      // 109: bipush 0
      // 10a: bipush 1
      // 10b: bipush 4
      // 10c: aload 3
      // 10d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 110: aload 0
      // 111: aload 1
      // 112: getstatic ox_.a3_ Le0x;
      // 115: invokevirtual e0x.l4i ()Lzfz;
      // 118: bipush 0
      // 119: bipush 2
      // 11a: bipush 4
      // 11b: aload 3
      // 11c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 11f: aload 0
      // 120: aload 1
      // 121: getstatic ox_.a3_ Le0x;
      // 124: invokevirtual e0x.l4i ()Lzfz;
      // 127: bipush 0
      // 128: bipush 3
      // 129: bipush 4
      // 12a: aload 3
      // 12b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 12e: aload 0
      // 12f: aload 1
      // 130: getstatic ox_.a3_ Le0x;
      // 133: invokevirtual e0x.l4i ()Lzfz;
      // 136: bipush 4
      // 137: bipush 1
      // 138: bipush 4
      // 139: aload 3
      // 13a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 13d: aload 0
      // 13e: aload 1
      // 13f: getstatic ox_.a3_ Le0x;
      // 142: invokevirtual e0x.l4i ()Lzfz;
      // 145: bipush 4
      // 146: bipush 2
      // 147: bipush 4
      // 148: aload 3
      // 149: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 14c: aload 0
      // 14d: aload 1
      // 14e: getstatic ox_.a3_ Le0x;
      // 151: invokevirtual e0x.l4i ()Lzfz;
      // 154: bipush 4
      // 155: bipush 3
      // 156: bipush 4
      // 157: aload 3
      // 158: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 15b: aload 0
      // 15c: aload 1
      // 15d: aload 3
      // 15e: bipush 0
      // 15f: bipush 1
      // 160: bipush 1
      // 161: bipush 0
      // 162: bipush 3
      // 163: bipush 3
      // 164: getstatic ox_.wb7 Le0x;
      // 167: invokevirtual e0x.l4i ()Lzfz;
      // 16a: getstatic ox_.wb7 Le0x;
      // 16d: invokevirtual e0x.l4i ()Lzfz;
      // 170: bipush 0
      // 171: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 174: aload 0
      // 175: aload 1
      // 176: aload 3
      // 177: bipush 4
      // 178: bipush 1
      // 179: bipush 1
      // 17a: bipush 4
      // 17b: bipush 3
      // 17c: bipush 3
      // 17d: getstatic ox_.wb7 Le0x;
      // 180: invokevirtual e0x.l4i ()Lzfz;
      // 183: getstatic ox_.wb7 Le0x;
      // 186: invokevirtual e0x.l4i ()Lzfz;
      // 189: bipush 0
      // 18a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 18d: aload 0
      // 18e: aload 1
      // 18f: aload 3
      // 190: bipush 1
      // 191: bipush 1
      // 192: bipush 4
      // 193: bipush 3
      // 194: bipush 3
      // 195: bipush 4
      // 196: getstatic ox_.wb7 Le0x;
      // 199: invokevirtual e0x.l4i ()Lzfz;
      // 19c: getstatic ox_.wb7 Le0x;
      // 19f: invokevirtual e0x.l4i ()Lzfz;
      // 1a2: bipush 0
      // 1a3: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1a6: aload 0
      // 1a7: aload 1
      // 1a8: getstatic ox_.g6c Le0x;
      // 1ab: invokevirtual e0x.l4i ()Lzfz;
      // 1ae: bipush 0
      // 1af: bipush 2
      // 1b0: bipush 2
      // 1b1: aload 3
      // 1b2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1b5: aload 0
      // 1b6: aload 1
      // 1b7: getstatic ox_.g6c Le0x;
      // 1ba: invokevirtual e0x.l4i ()Lzfz;
      // 1bd: bipush 2
      // 1be: bipush 2
      // 1bf: bipush 4
      // 1c0: aload 3
      // 1c1: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1c4: aload 0
      // 1c5: aload 1
      // 1c6: getstatic ox_.g6c Le0x;
      // 1c9: invokevirtual e0x.l4i ()Lzfz;
      // 1cc: bipush 4
      // 1cd: bipush 2
      // 1ce: bipush 2
      // 1cf: aload 3
      // 1d0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1d3: aload 0
      // 1d4: aload 1
      // 1d5: getstatic ox_.wb7 Le0x;
      // 1d8: invokevirtual e0x.l4i ()Lzfz;
      // 1db: bipush 1
      // 1dc: bipush 1
      // 1dd: bipush 0
      // 1de: aload 3
      // 1df: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1e2: aload 0
      // 1e3: aload 1
      // 1e4: getstatic ox_.wb7 Le0x;
      // 1e7: invokevirtual e0x.l4i ()Lzfz;
      // 1ea: bipush 1
      // 1eb: bipush 2
      // 1ec: bipush 0
      // 1ed: aload 3
      // 1ee: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1f1: aload 0
      // 1f2: aload 1
      // 1f3: getstatic ox_.wb7 Le0x;
      // 1f6: invokevirtual e0x.l4i ()Lzfz;
      // 1f9: bipush 1
      // 1fa: bipush 3
      // 1fb: bipush 0
      // 1fc: aload 3
      // 1fd: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 200: aload 0
      // 201: aload 1
      // 202: getstatic ox_.wb7 Le0x;
      // 205: invokevirtual e0x.l4i ()Lzfz;
      // 208: bipush 2
      // 209: bipush 3
      // 20a: bipush 0
      // 20b: aload 3
      // 20c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 20f: aload 0
      // 210: aload 1
      // 211: getstatic ox_.wb7 Le0x;
      // 214: invokevirtual e0x.l4i ()Lzfz;
      // 217: bipush 3
      // 218: bipush 3
      // 219: bipush 0
      // 21a: aload 3
      // 21b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 21e: aload 0
      // 21f: aload 1
      // 220: getstatic ox_.wb7 Le0x;
      // 223: invokevirtual e0x.l4i ()Lzfz;
      // 226: bipush 3
      // 227: bipush 2
      // 228: bipush 0
      // 229: aload 3
      // 22a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 22d: aload 0
      // 22e: aload 1
      // 22f: getstatic ox_.wb7 Le0x;
      // 232: invokevirtual e0x.l4i ()Lzfz;
      // 235: bipush 3
      // 236: bipush 1
      // 237: bipush 0
      // 238: aload 3
      // 239: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 23c: aload 0
      // 23d: aload 1
      // 23e: aload 4
      // 240: ifnull 2a9
      // 243: bipush 2
      // 244: bipush 0
      // 245: bipush -1
      // 246: aload 3
      // 247: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.t90 (Lt9d;IIILyve;)Lzfz;
      // 24a: invokeinterface zfz.r_y ()Le0x; 1
      // 24f: invokevirtual e0x.p1r ()Lp3y;
      // 252: getstatic p3y.cei Lp3y;
      // 255: if_acmpne 2a7
      // 258: goto 25f
      // 25b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.a (Loov;)Loov;
      // 25e: athrow
      // 25f: aload 0
      // 260: aload 1
      // 261: aload 4
      // 263: ifnull 2a9
      // 266: goto 26d
      // 269: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.a (Loov;)Loov;
      // 26c: athrow
      // 26d: bipush 2
      // 26e: bipush -1
      // 26f: bipush -1
      // 270: aload 3
      // 271: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.t90 (Lt9d;IIILyve;)Lzfz;
      // 274: invokeinterface zfz.r_y ()Le0x; 1
      // 279: invokevirtual e0x.p1r ()Lp3y;
      // 27c: getstatic p3y.cei Lp3y;
      // 27f: if_acmpeq 2a7
      // 282: goto 289
      // 285: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.a (Loov;)Loov;
      // 288: athrow
      // 289: aload 0
      // 28a: aload 1
      // 28b: getstatic ox_.l3f Le0x;
      // 28e: aload 0
      // 28f: getstatic ox_.l3f Le0x;
      // 292: bipush 3
      // 293: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.ujv (Le0x;I)I
      // 296: invokevirtual e0x.kig (I)Lzfz;
      // 299: bipush 2
      // 29a: bipush 0
      // 29b: bipush -1
      // 29c: aload 3
      // 29d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2a0: goto 2a7
      // 2a3: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.a (Loov;)Loov;
      // 2a6: athrow
      // 2a7: aload 0
      // 2a8: aload 1
      // 2a9: aload 3
      // 2aa: bipush 1
      // 2ab: bipush 1
      // 2ac: bipush 1
      // 2ad: bipush 3
      // 2ae: bipush 3
      // 2af: bipush 3
      // 2b0: getstatic ox_.ibw Le0x;
      // 2b3: invokevirtual e0x.l4i ()Lzfz;
      // 2b6: getstatic ox_.ibw Le0x;
      // 2b9: invokevirtual e0x.l4i ()Lzfz;
      // 2bc: bipush 0
      // 2bd: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2c0: aload 0
      // 2c1: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.e9f Z
      // 2c4: aload 4
      // 2c6: ifnull 3ce
      // 2c9: ifeq 3ca
      // 2cc: goto 2d3
      // 2cf: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.a (Loov;)Loov;
      // 2d2: athrow
      // 2d3: aload 0
      // 2d4: aload 1
      // 2d5: getstatic ox_.j5b Le0x;
      // 2d8: invokevirtual e0x.l4i ()Lzfz;
      // 2db: bipush 0
      // 2dc: bipush 5
      // 2dd: bipush 0
      // 2de: aload 3
      // 2df: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2e2: aload 0
      // 2e3: aload 1
      // 2e4: getstatic ox_.j5b Le0x;
      // 2e7: invokevirtual e0x.l4i ()Lzfz;
      // 2ea: bipush 1
      // 2eb: bipush 5
      // 2ec: bipush 0
      // 2ed: aload 3
      // 2ee: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2f1: aload 0
      // 2f2: aload 1
      // 2f3: getstatic ox_.j5b Le0x;
      // 2f6: invokevirtual e0x.l4i ()Lzfz;
      // 2f9: bipush 2
      // 2fa: bipush 5
      // 2fb: bipush 0
      // 2fc: aload 3
      // 2fd: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 300: aload 0
      // 301: aload 1
      // 302: getstatic ox_.j5b Le0x;
      // 305: invokevirtual e0x.l4i ()Lzfz;
      // 308: bipush 3
      // 309: bipush 5
      // 30a: bipush 0
      // 30b: aload 3
      // 30c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 30f: aload 0
      // 310: aload 1
      // 311: getstatic ox_.j5b Le0x;
      // 314: invokevirtual e0x.l4i ()Lzfz;
      // 317: bipush 4
      // 318: bipush 5
      // 319: bipush 0
      // 31a: aload 3
      // 31b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 31e: aload 0
      // 31f: aload 1
      // 320: getstatic ox_.j5b Le0x;
      // 323: invokevirtual e0x.l4i ()Lzfz;
      // 326: bipush 0
      // 327: bipush 5
      // 328: bipush 4
      // 329: aload 3
      // 32a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 32d: aload 0
      // 32e: aload 1
      // 32f: getstatic ox_.j5b Le0x;
      // 332: invokevirtual e0x.l4i ()Lzfz;
      // 335: bipush 1
      // 336: bipush 5
      // 337: bipush 4
      // 338: aload 3
      // 339: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 33c: aload 0
      // 33d: aload 1
      // 33e: getstatic ox_.j5b Le0x;
      // 341: invokevirtual e0x.l4i ()Lzfz;
      // 344: bipush 2
      // 345: bipush 5
      // 346: bipush 4
      // 347: aload 3
      // 348: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 34b: aload 0
      // 34c: aload 1
      // 34d: getstatic ox_.j5b Le0x;
      // 350: invokevirtual e0x.l4i ()Lzfz;
      // 353: bipush 3
      // 354: bipush 5
      // 355: bipush 4
      // 356: aload 3
      // 357: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 35a: aload 0
      // 35b: aload 1
      // 35c: getstatic ox_.j5b Le0x;
      // 35f: invokevirtual e0x.l4i ()Lzfz;
      // 362: bipush 4
      // 363: bipush 5
      // 364: bipush 4
      // 365: aload 3
      // 366: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 369: aload 0
      // 36a: aload 1
      // 36b: getstatic ox_.j5b Le0x;
      // 36e: invokevirtual e0x.l4i ()Lzfz;
      // 371: bipush 4
      // 372: bipush 5
      // 373: bipush 1
      // 374: aload 3
      // 375: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 378: aload 0
      // 379: aload 1
      // 37a: getstatic ox_.j5b Le0x;
      // 37d: invokevirtual e0x.l4i ()Lzfz;
      // 380: bipush 4
      // 381: bipush 5
      // 382: bipush 2
      // 383: aload 3
      // 384: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 387: aload 0
      // 388: aload 1
      // 389: getstatic ox_.j5b Le0x;
      // 38c: invokevirtual e0x.l4i ()Lzfz;
      // 38f: bipush 4
      // 390: bipush 5
      // 391: bipush 3
      // 392: aload 3
      // 393: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 396: aload 0
      // 397: aload 1
      // 398: getstatic ox_.j5b Le0x;
      // 39b: invokevirtual e0x.l4i ()Lzfz;
      // 39e: bipush 0
      // 39f: bipush 5
      // 3a0: bipush 1
      // 3a1: aload 3
      // 3a2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3a5: aload 0
      // 3a6: aload 1
      // 3a7: getstatic ox_.j5b Le0x;
      // 3aa: invokevirtual e0x.l4i ()Lzfz;
      // 3ad: bipush 0
      // 3ae: bipush 5
      // 3af: bipush 2
      // 3b0: aload 3
      // 3b1: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3b4: aload 0
      // 3b5: aload 1
      // 3b6: getstatic ox_.j5b Le0x;
      // 3b9: invokevirtual e0x.l4i ()Lzfz;
      // 3bc: bipush 0
      // 3bd: bipush 5
      // 3be: bipush 3
      // 3bf: aload 3
      // 3c0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3c3: goto 3ca
      // 3c6: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.a (Loov;)Loov;
      // 3c9: athrow
      // 3ca: aload 0
      // 3cb: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.e9f Z
      // 3ce: aload 4
      // 3d0: ifnull 447
      // 3d3: ifeq 42b
      // 3d6: goto 3dd
      // 3d9: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.a (Loov;)Loov;
      // 3dc: athrow
      // 3dd: aload 0
      // 3de: getstatic ox_.h49 Le0x;
      // 3e1: bipush 3
      // 3e2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.ujv (Le0x;I)I
      // 3e5: istore 5
      // 3e7: aload 0
      // 3e8: aload 1
      // 3e9: getstatic ox_.h49 Le0x;
      // 3ec: iload 5
      // 3ee: invokevirtual e0x.kig (I)Lzfz;
      // 3f1: bipush 3
      // 3f2: bipush 1
      // 3f3: bipush 3
      // 3f4: aload 3
      // 3f5: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3f8: aload 0
      // 3f9: aload 1
      // 3fa: getstatic ox_.h49 Le0x;
      // 3fd: iload 5
      // 3ff: invokevirtual e0x.kig (I)Lzfz;
      // 402: bipush 3
      // 403: bipush 2
      // 404: bipush 3
      // 405: aload 3
      // 406: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 409: aload 0
      // 40a: aload 1
      // 40b: getstatic ox_.h49 Le0x;
      // 40e: iload 5
      // 410: invokevirtual e0x.kig (I)Lzfz;
      // 413: bipush 3
      // 414: bipush 3
      // 415: bipush 3
      // 416: aload 3
      // 417: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 41a: aload 0
      // 41b: aload 1
      // 41c: getstatic ox_.h49 Le0x;
      // 41f: iload 5
      // 421: invokevirtual e0x.kig (I)Lzfz;
      // 424: bipush 3
      // 425: bipush 4
      // 426: bipush 3
      // 427: aload 3
      // 428: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 42b: aload 0
      // 42c: aload 1
      // 42d: getstatic ox_.gt8 Le0x;
      // 430: invokevirtual e0x.l4i ()Lzfz;
      // 433: getstatic um3.go7 Lqx_;
      // 436: aload 0
      // 437: getfield net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.p7m Lvt2;
      // 43a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 43f: bipush 2
      // 440: bipush 3
      // 441: bipush 1
      // 442: aload 3
      // 443: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.lzy (Lt9d;Lzfz;IIILyve;)V
      // 446: bipush 0
      // 447: istore 5
      // 449: iload 5
      // 44b: bipush 5
      // 44c: if_icmpge 496
      // 44f: bipush 0
      // 450: aload 4
      // 452: ifnull 4a1
      // 455: istore 6
      // 457: iload 6
      // 459: bipush 5
      // 45a: if_icmpge 48e
      // 45d: aload 0
      // 45e: aload 1
      // 45f: iload 6
      // 461: bipush 6
      // 463: iload 5
      // 465: aload 3
      // 466: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.epu (Lt9d;IIILyve;)V
      // 469: aload 0
      // 46a: aload 1
      // 46b: getstatic ox_.a3_ Le0x;
      // 46e: invokevirtual e0x.l4i ()Lzfz;
      // 471: iload 6
      // 473: bipush -1
      // 474: iload 5
      // 476: aload 3
      // 477: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.doc (Lt9d;Lzfz;IIILyve;)V
      // 47a: iinc 6 1
      // 47d: aload 4
      // 47f: ifnull 491
      // 482: aload 4
      // 484: ifnonnull 457
      // 487: goto 48e
      // 48a: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.a (Loov;)Loov;
      // 48d: athrow
      // 48e: iinc 5 1
      // 491: aload 4
      // 493: ifnonnull 449
      // 496: aload 0
      // 497: aload 1
      // 498: aload 3
      // 499: bipush 1
      // 49a: bipush 1
      // 49b: bipush 2
      // 49c: bipush 1
      // 49d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden.pil (Lt9d;Lyve;IIII)V
      // 4a0: bipush 1
      // 4a1: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7924589871905226198L, 698500073349775614L, MethodHandles.lookup().lookupClass()).a(510507013657L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 26722261752422L;
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
      String var6 = "vé¶ó\u009fýí\u0019ó3*/\u0019wxÛ\u0010Ýñà\u0004î¤Sö`\u0094ÂÏ\u008f_\u0096¹";
      int var8 = "vé¶ó\u009fýí\u0019ó3*/\u0019wxÛ\u0010Ýñà\u0004î¤Sö`\u0094ÂÏ\u008f_\u0096¹".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23521;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces$House4Garden" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
