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

public class StructureVillagePieces$Path extends StructureVillagePieces$Road {
   private int fpv;
   private static final long a;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public StructureVillagePieces$Path() {
   }

   public StructureVillagePieces$Path(StructureVillagePieces$Start var1, int var2, Random var3, yve var4, vt2 var5) {
      super(var1, var2);
      this.p7m = var5;
      this.yqm = var4;
      this.fpv = Math.max(var4.num(), var4.ut6());
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 39578345554872L;
      super.z0d(var1);
      var1.iin(c<"o">(21824, 3597996709518202835L ^ var2), this.fpv);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 102996008635091L;
      super.oqf(var1);
      this.fpv = var1.uz7(c<"o">(2153, 2296568681741763472L ^ var2));
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
      // 000: bipush 0
      // 001: istore 5
      // 003: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 006: aload 3
      // 007: bipush 5
      // 008: invokevirtual java/util/Random.nextInt (I)I
      // 00b: istore 6
      // 00d: astore 4
      // 00f: iload 6
      // 011: aload 0
      // 012: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.fpv I
      // 015: bipush 8
      // 017: isub
      // 018: if_icmpge 073
      // 01b: aload 0
      // 01c: aload 1
      // 01d: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$Start
      // 020: aload 2
      // 021: aload 3
      // 022: bipush 0
      // 023: iload 6
      // 025: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Path.a3p (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // 028: astore 7
      // 02a: aload 4
      // 02c: ifnull 06e
      // 02f: aload 7
      // 031: aload 4
      // 033: ifnull 2e0
      // 036: goto 03d
      // 039: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 03c: athrow
      // 03d: ifnull 062
      // 040: goto 047
      // 043: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 046: athrow
      // 047: iload 6
      // 049: aload 7
      // 04b: getfield xi1.yqm Lyve;
      // 04e: invokevirtual yve.num ()I
      // 051: aload 7
      // 053: getfield xi1.yqm Lyve;
      // 056: invokevirtual yve.ut6 ()I
      // 059: invokestatic java/lang/Math.max (II)I
      // 05c: iadd
      // 05d: istore 6
      // 05f: bipush 1
      // 060: istore 5
      // 062: iload 6
      // 064: bipush 2
      // 065: aload 3
      // 066: bipush 5
      // 067: invokevirtual java/util/Random.nextInt (I)I
      // 06a: iadd
      // 06b: iadd
      // 06c: istore 6
      // 06e: aload 4
      // 070: ifnonnull 00f
      // 073: aload 3
      // 074: bipush 5
      // 075: invokevirtual java/util/Random.nextInt (I)I
      // 078: istore 6
      // 07a: iload 6
      // 07c: aload 0
      // 07d: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.fpv I
      // 080: bipush 8
      // 082: isub
      // 083: if_icmpge 0de
      // 086: aload 0
      // 087: aload 1
      // 088: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$Start
      // 08b: aload 2
      // 08c: aload 3
      // 08d: bipush 0
      // 08e: iload 6
      // 090: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Path.x8y (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // 093: astore 7
      // 095: aload 4
      // 097: ifnull 0d9
      // 09a: aload 7
      // 09c: aload 4
      // 09e: ifnull 2e0
      // 0a1: goto 0a8
      // 0a4: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: ifnull 0cd
      // 0ab: goto 0b2
      // 0ae: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: iload 6
      // 0b4: aload 7
      // 0b6: getfield xi1.yqm Lyve;
      // 0b9: invokevirtual yve.num ()I
      // 0bc: aload 7
      // 0be: getfield xi1.yqm Lyve;
      // 0c1: invokevirtual yve.ut6 ()I
      // 0c4: invokestatic java/lang/Math.max (II)I
      // 0c7: iadd
      // 0c8: istore 6
      // 0ca: bipush 1
      // 0cb: istore 5
      // 0cd: iload 6
      // 0cf: bipush 2
      // 0d0: aload 3
      // 0d1: bipush 5
      // 0d2: invokevirtual java/util/Random.nextInt (I)I
      // 0d5: iadd
      // 0d6: iadd
      // 0d7: istore 6
      // 0d9: aload 4
      // 0db: ifnonnull 07a
      // 0de: iload 5
      // 0e0: aload 4
      // 0e2: ifnull 221
      // 0e5: ifeq 21f
      // 0e8: goto 0ef
      // 0eb: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: aload 3
      // 0f0: bipush 3
      // 0f1: invokevirtual java/util/Random.nextInt (I)I
      // 0f4: aload 4
      // 0f6: ifnull 221
      // 0f9: goto 100
      // 0fc: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 0ff: athrow
      // 100: ifle 21f
      // 103: goto 10a
      // 106: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 109: athrow
      // 10a: aload 0
      // 10b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.p7m Lvt2;
      // 10e: ifnull 21f
      // 111: goto 118
      // 114: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 117: athrow
      // 118: getstatic net/minecraft/world/gen/structure/StructureVillagePieces$1.wgx [I
      // 11b: aload 0
      // 11c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.p7m Lvt2;
      // 11f: invokevirtual vt2.ordinal ()I
      // 122: iaload
      // 123: aload 4
      // 125: ifnull 221
      // 128: goto 12f
      // 12b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 12e: athrow
      // 12f: tableswitch 240 1 4 33 85 139 191
      // 14c: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 14f: athrow
      // 150: aload 1
      // 151: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$Start
      // 154: aload 2
      // 155: aload 3
      // 156: aload 0
      // 157: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 15a: getfield yve.gdj I
      // 15d: bipush 1
      // 15e: isub
      // 15f: aload 0
      // 160: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 163: getfield yve._3o I
      // 166: aload 0
      // 167: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 16a: getfield yve.ob0 I
      // 16d: getstatic vt2.te4 Lvt2;
      // 170: aload 0
      // 171: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Path.gd3 ()I
      // 174: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ycl (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 177: pop
      // 178: aload 4
      // 17a: ifnonnull 21f
      // 17d: goto 184
      // 180: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 183: athrow
      // 184: aload 1
      // 185: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$Start
      // 188: aload 2
      // 189: aload 3
      // 18a: aload 0
      // 18b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 18e: getfield yve.gdj I
      // 191: bipush 1
      // 192: isub
      // 193: aload 0
      // 194: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 197: getfield yve._3o I
      // 19a: aload 0
      // 19b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 19e: getfield yve.nwc I
      // 1a1: bipush 2
      // 1a2: isub
      // 1a3: getstatic vt2.te4 Lvt2;
      // 1a6: aload 0
      // 1a7: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Path.gd3 ()I
      // 1aa: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ycl (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 1ad: pop
      // 1ae: aload 4
      // 1b0: ifnonnull 21f
      // 1b3: goto 1ba
      // 1b6: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 1b9: athrow
      // 1ba: aload 1
      // 1bb: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$Start
      // 1be: aload 2
      // 1bf: aload 3
      // 1c0: aload 0
      // 1c1: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 1c4: getfield yve.gdj I
      // 1c7: aload 0
      // 1c8: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 1cb: getfield yve._3o I
      // 1ce: aload 0
      // 1cf: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 1d2: getfield yve.ob0 I
      // 1d5: bipush 1
      // 1d6: isub
      // 1d7: getstatic vt2.z9q Lvt2;
      // 1da: aload 0
      // 1db: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Path.gd3 ()I
      // 1de: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ycl (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 1e1: pop
      // 1e2: aload 4
      // 1e4: ifnonnull 21f
      // 1e7: goto 1ee
      // 1ea: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 1ed: athrow
      // 1ee: aload 1
      // 1ef: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$Start
      // 1f2: aload 2
      // 1f3: aload 3
      // 1f4: aload 0
      // 1f5: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 1f8: getfield yve.kwp I
      // 1fb: bipush 2
      // 1fc: isub
      // 1fd: aload 0
      // 1fe: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 201: getfield yve._3o I
      // 204: aload 0
      // 205: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 208: getfield yve.ob0 I
      // 20b: bipush 1
      // 20c: isub
      // 20d: getstatic vt2.z9q Lvt2;
      // 210: aload 0
      // 211: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Path.gd3 ()I
      // 214: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ycl (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 217: pop
      // 218: goto 21f
      // 21b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 21e: athrow
      // 21f: iload 5
      // 221: aload 4
      // 223: ifnull 23c
      // 226: ifeq 34b
      // 229: goto 230
      // 22c: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 22f: athrow
      // 230: aload 3
      // 231: bipush 3
      // 232: invokevirtual java/util/Random.nextInt (I)I
      // 235: goto 23c
      // 238: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 23b: athrow
      // 23c: ifle 34b
      // 23f: aload 0
      // 240: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.p7m Lvt2;
      // 243: ifnull 34b
      // 246: goto 24d
      // 249: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 24c: athrow
      // 24d: getstatic net/minecraft/world/gen/structure/StructureVillagePieces$1.wgx [I
      // 250: aload 0
      // 251: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.p7m Lvt2;
      // 254: invokevirtual vt2.ordinal ()I
      // 257: iaload
      // 258: tableswitch 243 1 4 36 88 142 194
      // 278: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 27b: athrow
      // 27c: aload 1
      // 27d: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$Start
      // 280: aload 2
      // 281: aload 3
      // 282: aload 0
      // 283: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 286: getfield yve.kwp I
      // 289: bipush 1
      // 28a: iadd
      // 28b: aload 0
      // 28c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 28f: getfield yve._3o I
      // 292: aload 0
      // 293: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 296: getfield yve.ob0 I
      // 299: getstatic vt2.zk4 Lvt2;
      // 29c: aload 0
      // 29d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Path.gd3 ()I
      // 2a0: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ycl (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 2a3: pop
      // 2a4: aload 4
      // 2a6: ifnonnull 34b
      // 2a9: goto 2b0
      // 2ac: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 2af: athrow
      // 2b0: aload 1
      // 2b1: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$Start
      // 2b4: aload 2
      // 2b5: aload 3
      // 2b6: aload 0
      // 2b7: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 2ba: getfield yve.kwp I
      // 2bd: bipush 1
      // 2be: iadd
      // 2bf: aload 0
      // 2c0: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 2c3: getfield yve._3o I
      // 2c6: aload 0
      // 2c7: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 2ca: getfield yve.nwc I
      // 2cd: bipush 2
      // 2ce: isub
      // 2cf: getstatic vt2.zk4 Lvt2;
      // 2d2: aload 0
      // 2d3: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Path.gd3 ()I
      // 2d6: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ycl (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 2d9: goto 2e0
      // 2dc: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 2df: athrow
      // 2e0: pop
      // 2e1: aload 4
      // 2e3: ifnonnull 34b
      // 2e6: aload 1
      // 2e7: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$Start
      // 2ea: aload 2
      // 2eb: aload 3
      // 2ec: aload 0
      // 2ed: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 2f0: getfield yve.gdj I
      // 2f3: aload 0
      // 2f4: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 2f7: getfield yve._3o I
      // 2fa: aload 0
      // 2fb: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 2fe: getfield yve.nwc I
      // 301: bipush 1
      // 302: iadd
      // 303: getstatic vt2.mxp Lvt2;
      // 306: aload 0
      // 307: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Path.gd3 ()I
      // 30a: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ycl (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 30d: pop
      // 30e: aload 4
      // 310: ifnonnull 34b
      // 313: goto 31a
      // 316: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 319: athrow
      // 31a: aload 1
      // 31b: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$Start
      // 31e: aload 2
      // 31f: aload 3
      // 320: aload 0
      // 321: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 324: getfield yve.kwp I
      // 327: bipush 2
      // 328: isub
      // 329: aload 0
      // 32a: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 32d: getfield yve._3o I
      // 330: aload 0
      // 331: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Path.yqm Lyve;
      // 334: getfield yve.nwc I
      // 337: bipush 1
      // 338: iadd
      // 339: getstatic vt2.mxp Lvt2;
      // 33c: aload 0
      // 33d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Path.gd3 ()I
      // 340: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ycl (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 343: pop
      // 344: goto 34b
      // 347: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 34a: athrow
      // 34b: return
   }

   public static yve c8l(StructureVillagePieces$Start param0, List param1, Random param2, int param3, int param4, int param5, vt2 param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 7
      // 05: bipush 7
      // 07: aload 2
      // 08: bipush 3
      // 09: bipush 5
      // 0a: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 0d: imul
      // 0e: istore 8
      // 10: iload 8
      // 12: bipush 7
      // 14: if_icmplt 4e
      // 17: iload 3
      // 18: iload 4
      // 1a: iload 5
      // 1c: bipush 0
      // 1d: bipush 0
      // 1e: bipush 0
      // 1f: bipush 3
      // 20: bipush 3
      // 21: iload 8
      // 23: aload 6
      // 25: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 28: astore 9
      // 2a: aload 7
      // 2c: ifnull 49
      // 2f: aload 1
      // 30: aload 9
      // 32: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 35: ifnonnull 46
      // 38: goto 3f
      // 3b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 9
      // 41: areturn
      // 42: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Path.a (Loov;)Loov;
      // 45: athrow
      // 46: iinc 8 -7
      // 49: aload 7
      // 4b: ifnonnull 10
      // 4e: aconst_null
      // 4f: areturn
   }

   @Override
   public boolean d__(t9d var1, Random var2, yve var3) {
      zfz var5 = this.wrt(ox_.bqn.l4i());
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      zfz var6 = this.wrt(ox_.a3_.l4i());
      int var7 = this.yqm.gdj;
      i2h[] var4 = var10000;

      label51:
      while (true) {
         int var12 = var7;

         label48:
         while (var12 <= this.yqm.kwp) {
            if (var4 == null) {
               return (boolean)this.yqm.ob0;
            }

            int var8 = this.yqm.ob0;

            while (var8 <= this.yqm.nwc) {
               mew var9 = new mew(var7, 64, var8);

               label58: {
                  try {
                     if (var4 == null) {
                        break label58;
                     }

                     var12 = var3.vwy(var9);
                     if (var4 == null) {
                        continue label48;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }

                  if (var12 != 0) {
                     var9 = var1.pnv(var9).eve();
                     var1.vct(var9, var5, 2);
                     var1.vct(var9.eve(), var6, 2);
                  }

                  var8++;
               }

               if (var4 == null) {
                  break;
               }
            }

            var7++;
            if (var4 != null) {
               continue label51;
            }
            break;
         }

         return (boolean)1;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6486709329257917329L, -1499599422834926883L, MethodHandles.lookup().lookupClass()).a(245823668010812L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 27601410319128L;
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
      String var6 = "\u0095¨\u009f`¶¼Ç\u0010YM%M\u0011K\u0082\u008c\u0010®)§þ;Ù\"\n¥c\u0082+ò\u0099£ï";
      int var8 = "\u0095¨\u009f`¶¼Ç\u0010YM%M\u0011K\u0082\u008c\u0010®)§þ;Ù\"\n¥c\u0082+ò\u0099£ï".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18388;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces$Path", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces$Path" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
