package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureVillagePieces$WoodHut extends StructureVillagePieces$Village {
   private boolean to1;
   private int qj0;

   public StructureVillagePieces$WoodHut() {
   }

   public StructureVillagePieces$WoodHut(StructureVillagePieces$Start var1, int var2, Random var3, yve var4, vt2 var5) {
      super(var1, var2);
      this.p7m = var5;
      this.yqm = var4;
      this.to1 = var3.nextBoolean();
      this.qj0 = var3.nextInt(3);
   }

   @Override
   public void z0d(bdo var1) {
      super.z0d(var1);
      var1.iin("T", this.qj0);
      var1.zyu("C", this.to1);
   }

   @Override
   public void oqf(bdo var1) {
      super.oqf(var1);
      this.qj0 = var1.uz7("T");
      this.to1 = var1.dvl("C");
   }

   public static StructureVillagePieces$WoodHut z36(
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
      // 08: bipush 4
      // 09: bipush 6
      // 0b: bipush 5
      // 0c: aload 6
      // 0e: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 11: astore 8
      // 13: aload 8
      // 15: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.r60 (Lyve;)Z
      // 18: ifeq 41
      // 1b: aload 1
      // 1c: aload 8
      // 1e: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 21: ifnonnull 41
      // 24: goto 2b
      // 27: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 2a: athrow
      // 2b: new net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut
      // 2e: dup
      // 2f: aload 0
      // 30: iload 7
      // 32: aload 2
      // 33: aload 8
      // 35: aload 6
      // 37: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.<init> (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lyve;Lvt2;)V
      // 3a: goto 42
      // 3d: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 40: athrow
      // 41: aconst_null
      // 42: areturn
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
      // 006: getfield net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.e_j I
      // 009: aload 4
      // 00b: ifnull 0b7
      // 00e: ifge 05c
      // 011: goto 018
      // 014: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 3
      // 01c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.rh3 (Lt9d;Lyve;)I
      // 01f: putfield net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.e_j I
      // 022: aload 0
      // 023: aload 4
      // 025: ifnull 043
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 02e: athrow
      // 02f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.e_j I
      // 032: ifge 042
      // 035: goto 03c
      // 038: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: ireturn
      // 03e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.yqm Lyve;
      // 046: bipush 0
      // 047: aload 0
      // 048: getfield net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.e_j I
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.yqm Lyve;
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
      // 05f: bipush 1
      // 060: bipush 1
      // 061: bipush 1
      // 062: bipush 3
      // 063: bipush 5
      // 064: bipush 4
      // 065: getstatic ox_.ibw Le0x;
      // 068: invokevirtual e0x.l4i ()Lzfz;
      // 06b: getstatic ox_.ibw Le0x;
      // 06e: invokevirtual e0x.l4i ()Lzfz;
      // 071: bipush 0
      // 072: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 075: aload 0
      // 076: aload 1
      // 077: aload 3
      // 078: bipush 0
      // 079: bipush 0
      // 07a: bipush 0
      // 07b: bipush 3
      // 07c: bipush 0
      // 07d: bipush 4
      // 07e: getstatic ox_.a3_ Le0x;
      // 081: invokevirtual e0x.l4i ()Lzfz;
      // 084: getstatic ox_.a3_ Le0x;
      // 087: invokevirtual e0x.l4i ()Lzfz;
      // 08a: bipush 0
      // 08b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 08e: aload 0
      // 08f: aload 1
      // 090: aload 3
      // 091: bipush 1
      // 092: bipush 0
      // 093: bipush 1
      // 094: bipush 2
      // 095: bipush 0
      // 096: bipush 3
      // 097: getstatic ox_.kqk Le0x;
      // 09a: invokevirtual e0x.l4i ()Lzfz;
      // 09d: getstatic ox_.kqk Le0x;
      // 0a0: invokevirtual e0x.l4i ()Lzfz;
      // 0a3: bipush 0
      // 0a4: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0a7: aload 0
      // 0a8: aload 4
      // 0aa: ifnull 0e7
      // 0ad: getfield net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.to1 Z
      // 0b0: goto 0b7
      // 0b3: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: ifeq 0df
      // 0ba: aload 0
      // 0bb: aload 1
      // 0bc: aload 3
      // 0bd: bipush 1
      // 0be: bipush 4
      // 0bf: bipush 1
      // 0c0: bipush 2
      // 0c1: bipush 4
      // 0c2: bipush 3
      // 0c3: getstatic ox_.uom Le0x;
      // 0c6: invokevirtual e0x.l4i ()Lzfz;
      // 0c9: getstatic ox_.uom Le0x;
      // 0cc: invokevirtual e0x.l4i ()Lzfz;
      // 0cf: bipush 0
      // 0d0: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0d3: aload 4
      // 0d5: ifnonnull 0ff
      // 0d8: goto 0df
      // 0db: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: goto 0e7
      // 0e3: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 1
      // 0e8: aload 3
      // 0e9: bipush 1
      // 0ea: bipush 5
      // 0eb: bipush 1
      // 0ec: bipush 2
      // 0ed: bipush 5
      // 0ee: bipush 3
      // 0ef: getstatic ox_.uom Le0x;
      // 0f2: invokevirtual e0x.l4i ()Lzfz;
      // 0f5: getstatic ox_.uom Le0x;
      // 0f8: invokevirtual e0x.l4i ()Lzfz;
      // 0fb: bipush 0
      // 0fc: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0ff: aload 0
      // 100: aload 1
      // 101: getstatic ox_.uom Le0x;
      // 104: invokevirtual e0x.l4i ()Lzfz;
      // 107: bipush 1
      // 108: bipush 4
      // 109: bipush 0
      // 10a: aload 3
      // 10b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 10e: aload 0
      // 10f: aload 1
      // 110: getstatic ox_.uom Le0x;
      // 113: invokevirtual e0x.l4i ()Lzfz;
      // 116: bipush 2
      // 117: bipush 4
      // 118: bipush 0
      // 119: aload 3
      // 11a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 11d: aload 0
      // 11e: aload 1
      // 11f: getstatic ox_.uom Le0x;
      // 122: invokevirtual e0x.l4i ()Lzfz;
      // 125: bipush 1
      // 126: bipush 4
      // 127: bipush 4
      // 128: aload 3
      // 129: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 12c: aload 0
      // 12d: aload 1
      // 12e: getstatic ox_.uom Le0x;
      // 131: invokevirtual e0x.l4i ()Lzfz;
      // 134: bipush 2
      // 135: bipush 4
      // 136: bipush 4
      // 137: aload 3
      // 138: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 13b: aload 0
      // 13c: aload 1
      // 13d: getstatic ox_.uom Le0x;
      // 140: invokevirtual e0x.l4i ()Lzfz;
      // 143: bipush 0
      // 144: bipush 4
      // 145: bipush 1
      // 146: aload 3
      // 147: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 14a: aload 0
      // 14b: aload 1
      // 14c: getstatic ox_.uom Le0x;
      // 14f: invokevirtual e0x.l4i ()Lzfz;
      // 152: bipush 0
      // 153: bipush 4
      // 154: bipush 2
      // 155: aload 3
      // 156: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 159: aload 0
      // 15a: aload 1
      // 15b: getstatic ox_.uom Le0x;
      // 15e: invokevirtual e0x.l4i ()Lzfz;
      // 161: bipush 0
      // 162: bipush 4
      // 163: bipush 3
      // 164: aload 3
      // 165: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 168: aload 0
      // 169: aload 1
      // 16a: getstatic ox_.uom Le0x;
      // 16d: invokevirtual e0x.l4i ()Lzfz;
      // 170: bipush 3
      // 171: bipush 4
      // 172: bipush 1
      // 173: aload 3
      // 174: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 177: aload 0
      // 178: aload 1
      // 179: getstatic ox_.uom Le0x;
      // 17c: invokevirtual e0x.l4i ()Lzfz;
      // 17f: bipush 3
      // 180: bipush 4
      // 181: bipush 2
      // 182: aload 3
      // 183: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 186: aload 0
      // 187: aload 1
      // 188: getstatic ox_.uom Le0x;
      // 18b: invokevirtual e0x.l4i ()Lzfz;
      // 18e: bipush 3
      // 18f: bipush 4
      // 190: bipush 3
      // 191: aload 3
      // 192: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 195: aload 0
      // 196: aload 1
      // 197: aload 3
      // 198: bipush 0
      // 199: bipush 1
      // 19a: bipush 0
      // 19b: bipush 0
      // 19c: bipush 3
      // 19d: bipush 0
      // 19e: getstatic ox_.uom Le0x;
      // 1a1: invokevirtual e0x.l4i ()Lzfz;
      // 1a4: getstatic ox_.uom Le0x;
      // 1a7: invokevirtual e0x.l4i ()Lzfz;
      // 1aa: bipush 0
      // 1ab: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1ae: aload 0
      // 1af: aload 1
      // 1b0: aload 3
      // 1b1: bipush 3
      // 1b2: bipush 1
      // 1b3: bipush 0
      // 1b4: bipush 3
      // 1b5: bipush 3
      // 1b6: bipush 0
      // 1b7: getstatic ox_.uom Le0x;
      // 1ba: invokevirtual e0x.l4i ()Lzfz;
      // 1bd: getstatic ox_.uom Le0x;
      // 1c0: invokevirtual e0x.l4i ()Lzfz;
      // 1c3: bipush 0
      // 1c4: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1c7: aload 0
      // 1c8: aload 1
      // 1c9: aload 3
      // 1ca: bipush 0
      // 1cb: bipush 1
      // 1cc: bipush 4
      // 1cd: bipush 0
      // 1ce: bipush 3
      // 1cf: bipush 4
      // 1d0: getstatic ox_.uom Le0x;
      // 1d3: invokevirtual e0x.l4i ()Lzfz;
      // 1d6: getstatic ox_.uom Le0x;
      // 1d9: invokevirtual e0x.l4i ()Lzfz;
      // 1dc: bipush 0
      // 1dd: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1e0: aload 0
      // 1e1: aload 1
      // 1e2: aload 3
      // 1e3: bipush 3
      // 1e4: bipush 1
      // 1e5: bipush 4
      // 1e6: bipush 3
      // 1e7: bipush 3
      // 1e8: bipush 4
      // 1e9: getstatic ox_.uom Le0x;
      // 1ec: invokevirtual e0x.l4i ()Lzfz;
      // 1ef: getstatic ox_.uom Le0x;
      // 1f2: invokevirtual e0x.l4i ()Lzfz;
      // 1f5: bipush 0
      // 1f6: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1f9: aload 0
      // 1fa: aload 1
      // 1fb: aload 3
      // 1fc: bipush 0
      // 1fd: bipush 1
      // 1fe: bipush 1
      // 1ff: bipush 0
      // 200: bipush 3
      // 201: bipush 3
      // 202: getstatic ox_.wb7 Le0x;
      // 205: invokevirtual e0x.l4i ()Lzfz;
      // 208: getstatic ox_.wb7 Le0x;
      // 20b: invokevirtual e0x.l4i ()Lzfz;
      // 20e: bipush 0
      // 20f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 212: aload 0
      // 213: aload 1
      // 214: aload 3
      // 215: bipush 3
      // 216: bipush 1
      // 217: bipush 1
      // 218: bipush 3
      // 219: bipush 3
      // 21a: bipush 3
      // 21b: getstatic ox_.wb7 Le0x;
      // 21e: invokevirtual e0x.l4i ()Lzfz;
      // 221: getstatic ox_.wb7 Le0x;
      // 224: invokevirtual e0x.l4i ()Lzfz;
      // 227: bipush 0
      // 228: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 22b: aload 0
      // 22c: aload 1
      // 22d: aload 3
      // 22e: bipush 1
      // 22f: bipush 1
      // 230: bipush 0
      // 231: bipush 2
      // 232: bipush 3
      // 233: bipush 0
      // 234: getstatic ox_.wb7 Le0x;
      // 237: invokevirtual e0x.l4i ()Lzfz;
      // 23a: getstatic ox_.wb7 Le0x;
      // 23d: invokevirtual e0x.l4i ()Lzfz;
      // 240: bipush 0
      // 241: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 244: aload 0
      // 245: aload 1
      // 246: aload 3
      // 247: bipush 1
      // 248: bipush 1
      // 249: bipush 4
      // 24a: bipush 2
      // 24b: bipush 3
      // 24c: bipush 4
      // 24d: getstatic ox_.wb7 Le0x;
      // 250: invokevirtual e0x.l4i ()Lzfz;
      // 253: getstatic ox_.wb7 Le0x;
      // 256: invokevirtual e0x.l4i ()Lzfz;
      // 259: bipush 0
      // 25a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 25d: aload 0
      // 25e: aload 1
      // 25f: getstatic ox_.g6c Le0x;
      // 262: invokevirtual e0x.l4i ()Lzfz;
      // 265: bipush 0
      // 266: bipush 2
      // 267: bipush 2
      // 268: aload 3
      // 269: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 26c: aload 0
      // 26d: aload 1
      // 26e: getstatic ox_.g6c Le0x;
      // 271: invokevirtual e0x.l4i ()Lzfz;
      // 274: bipush 3
      // 275: bipush 2
      // 276: bipush 2
      // 277: aload 3
      // 278: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 27b: aload 0
      // 27c: aload 4
      // 27e: ifnull 2ed
      // 281: getfield net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.qj0 I
      // 284: ifle 2b9
      // 287: goto 28e
      // 28a: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 28d: athrow
      // 28e: aload 0
      // 28f: aload 1
      // 290: getstatic ox_.j5b Le0x;
      // 293: invokevirtual e0x.l4i ()Lzfz;
      // 296: aload 0
      // 297: getfield net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.qj0 I
      // 29a: bipush 1
      // 29b: bipush 3
      // 29c: aload 3
      // 29d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2a0: aload 0
      // 2a1: aload 1
      // 2a2: getstatic ox_.drm Le0x;
      // 2a5: invokevirtual e0x.l4i ()Lzfz;
      // 2a8: aload 0
      // 2a9: getfield net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.qj0 I
      // 2ac: bipush 2
      // 2ad: bipush 3
      // 2ae: aload 3
      // 2af: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2b2: goto 2b9
      // 2b5: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 2b8: athrow
      // 2b9: aload 0
      // 2ba: aload 1
      // 2bb: getstatic ox_.ibw Le0x;
      // 2be: invokevirtual e0x.l4i ()Lzfz;
      // 2c1: bipush 1
      // 2c2: bipush 1
      // 2c3: bipush 0
      // 2c4: aload 3
      // 2c5: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2c8: aload 0
      // 2c9: aload 1
      // 2ca: getstatic ox_.ibw Le0x;
      // 2cd: invokevirtual e0x.l4i ()Lzfz;
      // 2d0: bipush 1
      // 2d1: bipush 2
      // 2d2: bipush 0
      // 2d3: aload 3
      // 2d4: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2d7: aload 0
      // 2d8: aload 1
      // 2d9: aload 3
      // 2da: aload 2
      // 2db: bipush 1
      // 2dc: bipush 1
      // 2dd: bipush 0
      // 2de: aload 0
      // 2df: getstatic ox_.o0v Le0x;
      // 2e2: bipush 1
      // 2e3: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.ujv (Le0x;I)I
      // 2e6: invokestatic vt2.bm6 (I)Lvt2;
      // 2e9: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.us5 (Lt9d;Lyve;Ljava/util/Random;IIILvt2;)V
      // 2ec: aload 0
      // 2ed: aload 1
      // 2ee: bipush 1
      // 2ef: bipush 0
      // 2f0: bipush -1
      // 2f1: aload 3
      // 2f2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.t90 (Lt9d;IIILyve;)Lzfz;
      // 2f5: invokeinterface zfz.r_y ()Le0x; 1
      // 2fa: invokevirtual e0x.p1r ()Lp3y;
      // 2fd: getstatic p3y.cei Lp3y;
      // 300: aload 4
      // 302: ifnull 336
      // 305: if_acmpne 357
      // 308: goto 30f
      // 30b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 30e: athrow
      // 30f: aload 0
      // 310: aload 1
      // 311: aload 4
      // 313: ifnull 342
      // 316: goto 31d
      // 319: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 31c: athrow
      // 31d: bipush 1
      // 31e: bipush -1
      // 31f: bipush -1
      // 320: aload 3
      // 321: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.t90 (Lt9d;IIILyve;)Lzfz;
      // 324: invokeinterface zfz.r_y ()Le0x; 1
      // 329: invokevirtual e0x.p1r ()Lp3y;
      // 32c: getstatic p3y.cei Lp3y;
      // 32f: goto 336
      // 332: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 335: athrow
      // 336: if_acmpeq 357
      // 339: aload 0
      // 33a: aload 1
      // 33b: goto 342
      // 33e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 341: athrow
      // 342: getstatic ox_.l3f Le0x;
      // 345: aload 0
      // 346: getstatic ox_.l3f Le0x;
      // 349: bipush 3
      // 34a: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.ujv (Le0x;I)I
      // 34d: invokevirtual e0x.kig (I)Lzfz;
      // 350: bipush 1
      // 351: bipush 0
      // 352: bipush -1
      // 353: aload 3
      // 354: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 357: bipush 0
      // 358: istore 5
      // 35a: iload 5
      // 35c: bipush 5
      // 35d: if_icmpge 3a7
      // 360: bipush 0
      // 361: aload 4
      // 363: ifnull 3b2
      // 366: istore 6
      // 368: iload 6
      // 36a: bipush 4
      // 36b: if_icmpge 39f
      // 36e: aload 0
      // 36f: aload 1
      // 370: iload 6
      // 372: bipush 6
      // 374: iload 5
      // 376: aload 3
      // 377: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.epu (Lt9d;IIILyve;)V
      // 37a: aload 0
      // 37b: aload 1
      // 37c: getstatic ox_.a3_ Le0x;
      // 37f: invokevirtual e0x.l4i ()Lzfz;
      // 382: iload 6
      // 384: bipush -1
      // 385: iload 5
      // 387: aload 3
      // 388: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.doc (Lt9d;Lzfz;IIILyve;)V
      // 38b: iinc 6 1
      // 38e: aload 4
      // 390: ifnull 3a2
      // 393: aload 4
      // 395: ifnonnull 368
      // 398: goto 39f
      // 39b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.a (Loov;)Loov;
      // 39e: athrow
      // 39f: iinc 5 1
      // 3a2: aload 4
      // 3a4: ifnonnull 35a
      // 3a7: aload 0
      // 3a8: aload 1
      // 3a9: aload 3
      // 3aa: bipush 1
      // 3ab: bipush 1
      // 3ac: bipush 2
      // 3ad: bipush 1
      // 3ae: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$WoodHut.pil (Lt9d;Lyve;IIII)V
      // 3b1: bipush 1
      // 3b2: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
