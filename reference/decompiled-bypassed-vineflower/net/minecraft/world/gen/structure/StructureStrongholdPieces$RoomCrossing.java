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

public class StructureStrongholdPieces$RoomCrossing extends StructureStrongholdPieces$Stronghold {
   private static final List jcc;
   public int mer;
   private static final long b;
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   public StructureStrongholdPieces$RoomCrossing() {
   }

   public StructureStrongholdPieces$RoomCrossing(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.ppu = this.i2t(var2);
      this.yqm = var3;
      this.mer = var2.nextInt(5);
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = b ^ 80774738131823L;
      super.z0d(var1);
      var1.iin(c<"y">(26257, 8137658189045592716L ^ var2), this.mer);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = b ^ 60634069398020L;
      super.oqf(var1);
      this.mer = var1.uz7(c<"y">(9499, 6981710023379908716L ^ var2));
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      this.bmb((StructureStrongholdPieces$Stairs2)var1, var2, var3, 4, 1);
      this.go3((StructureStrongholdPieces$Stairs2)var1, var2, var3, 1, 4);
      this.ywi((StructureStrongholdPieces$Stairs2)var1, var2, var3, 1, 4);
   }

   public static StructureStrongholdPieces$RoomCrossing z_4(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 04: bipush -4
      // 06: bipush -1
      // 07: bipush 0
      // 08: bipush 11
      // 0a: bipush 7
      // 0c: bipush 11
      // 0e: aload 5
      // 10: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 13: astore 7
      // 15: aload 7
      // 17: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.jty (Lyve;)Z
      // 1a: ifeq 42
      // 1d: aload 0
      // 1e: aload 7
      // 20: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 23: ifnonnull 42
      // 26: goto 2d
      // 29: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 2c: athrow
      // 2d: new net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing
      // 30: dup
      // 31: iload 6
      // 33: aload 1
      // 34: aload 7
      // 36: aload 5
      // 38: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3b: goto 43
      // 3e: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 41: athrow
      // 42: aconst_null
      // 43: areturn
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
      // 008: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.knc (Lt9d;Lyve;)Z
      // 00b: aload 4
      // 00d: ifnull 098
      // 010: ifeq 020
      // 013: goto 01a
      // 016: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aload 1
      // 022: aload 3
      // 023: bipush 0
      // 024: bipush 0
      // 025: bipush 0
      // 026: bipush 10
      // 028: bipush 6
      // 02a: bipush 10
      // 02c: bipush 1
      // 02d: aload 2
      // 02e: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 031: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 034: aload 0
      // 035: aload 1
      // 036: aload 2
      // 037: aload 3
      // 038: aload 0
      // 039: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.ppu Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 03c: bipush 4
      // 03d: bipush 1
      // 03e: bipush 0
      // 03f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 042: aload 0
      // 043: aload 1
      // 044: aload 3
      // 045: bipush 4
      // 046: bipush 1
      // 047: bipush 10
      // 049: bipush 6
      // 04b: bipush 3
      // 04c: bipush 10
      // 04e: getstatic ox_.ibw Le0x;
      // 051: invokevirtual e0x.l4i ()Lzfz;
      // 054: getstatic ox_.ibw Le0x;
      // 057: invokevirtual e0x.l4i ()Lzfz;
      // 05a: bipush 0
      // 05b: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 05e: aload 0
      // 05f: aload 1
      // 060: aload 3
      // 061: bipush 0
      // 062: bipush 1
      // 063: bipush 4
      // 064: bipush 0
      // 065: bipush 3
      // 066: bipush 6
      // 068: getstatic ox_.ibw Le0x;
      // 06b: invokevirtual e0x.l4i ()Lzfz;
      // 06e: getstatic ox_.ibw Le0x;
      // 071: invokevirtual e0x.l4i ()Lzfz;
      // 074: bipush 0
      // 075: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 078: aload 0
      // 079: aload 1
      // 07a: aload 3
      // 07b: bipush 10
      // 07d: bipush 1
      // 07e: bipush 4
      // 07f: bipush 10
      // 081: bipush 3
      // 082: bipush 6
      // 084: getstatic ox_.ibw Le0x;
      // 087: invokevirtual e0x.l4i ()Lzfz;
      // 08a: getstatic ox_.ibw Le0x;
      // 08d: invokevirtual e0x.l4i ()Lzfz;
      // 090: bipush 0
      // 091: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 094: aload 0
      // 095: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.mer I
      // 098: aload 4
      // 09a: ifnull 501
      // 09d: tableswitch 1123 0 2 31 276 444
      // 0b8: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: aload 1
      // 0be: getstatic ox_.ow_ Le0x;
      // 0c1: invokevirtual e0x.l4i ()Lzfz;
      // 0c4: bipush 5
      // 0c5: bipush 1
      // 0c6: bipush 5
      // 0c7: aload 3
      // 0c8: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0cb: aload 0
      // 0cc: aload 1
      // 0cd: getstatic ox_.ow_ Le0x;
      // 0d0: invokevirtual e0x.l4i ()Lzfz;
      // 0d3: bipush 5
      // 0d4: bipush 2
      // 0d5: bipush 5
      // 0d6: aload 3
      // 0d7: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0da: aload 0
      // 0db: aload 1
      // 0dc: getstatic ox_.ow_ Le0x;
      // 0df: invokevirtual e0x.l4i ()Lzfz;
      // 0e2: bipush 5
      // 0e3: bipush 3
      // 0e4: bipush 5
      // 0e5: aload 3
      // 0e6: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0e9: aload 0
      // 0ea: aload 1
      // 0eb: getstatic ox_.gt8 Le0x;
      // 0ee: invokevirtual e0x.l4i ()Lzfz;
      // 0f1: bipush 4
      // 0f2: bipush 3
      // 0f3: bipush 5
      // 0f4: aload 3
      // 0f5: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f8: aload 0
      // 0f9: aload 1
      // 0fa: getstatic ox_.gt8 Le0x;
      // 0fd: invokevirtual e0x.l4i ()Lzfz;
      // 100: bipush 6
      // 102: bipush 3
      // 103: bipush 5
      // 104: aload 3
      // 105: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 108: aload 0
      // 109: aload 1
      // 10a: getstatic ox_.gt8 Le0x;
      // 10d: invokevirtual e0x.l4i ()Lzfz;
      // 110: bipush 5
      // 111: bipush 3
      // 112: bipush 4
      // 113: aload 3
      // 114: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 117: aload 0
      // 118: aload 1
      // 119: getstatic ox_.gt8 Le0x;
      // 11c: invokevirtual e0x.l4i ()Lzfz;
      // 11f: bipush 5
      // 120: bipush 3
      // 121: bipush 6
      // 123: aload 3
      // 124: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 127: aload 0
      // 128: aload 1
      // 129: getstatic ox_.bj8 Lizd;
      // 12c: invokevirtual izd.l4i ()Lzfz;
      // 12f: bipush 4
      // 130: bipush 1
      // 131: bipush 4
      // 132: aload 3
      // 133: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 136: aload 0
      // 137: aload 1
      // 138: getstatic ox_.bj8 Lizd;
      // 13b: invokevirtual izd.l4i ()Lzfz;
      // 13e: bipush 4
      // 13f: bipush 1
      // 140: bipush 5
      // 141: aload 3
      // 142: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 145: aload 0
      // 146: aload 1
      // 147: getstatic ox_.bj8 Lizd;
      // 14a: invokevirtual izd.l4i ()Lzfz;
      // 14d: bipush 4
      // 14e: bipush 1
      // 14f: bipush 6
      // 151: aload 3
      // 152: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 155: aload 0
      // 156: aload 1
      // 157: getstatic ox_.bj8 Lizd;
      // 15a: invokevirtual izd.l4i ()Lzfz;
      // 15d: bipush 6
      // 15f: bipush 1
      // 160: bipush 4
      // 161: aload 3
      // 162: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 165: aload 0
      // 166: aload 1
      // 167: getstatic ox_.bj8 Lizd;
      // 16a: invokevirtual izd.l4i ()Lzfz;
      // 16d: bipush 6
      // 16f: bipush 1
      // 170: bipush 5
      // 171: aload 3
      // 172: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 175: aload 0
      // 176: aload 1
      // 177: getstatic ox_.bj8 Lizd;
      // 17a: invokevirtual izd.l4i ()Lzfz;
      // 17d: bipush 6
      // 17f: bipush 1
      // 180: bipush 6
      // 182: aload 3
      // 183: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 186: aload 0
      // 187: aload 1
      // 188: getstatic ox_.bj8 Lizd;
      // 18b: invokevirtual izd.l4i ()Lzfz;
      // 18e: bipush 5
      // 18f: bipush 1
      // 190: bipush 4
      // 191: aload 3
      // 192: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 195: aload 0
      // 196: aload 1
      // 197: getstatic ox_.bj8 Lizd;
      // 19a: invokevirtual izd.l4i ()Lzfz;
      // 19d: bipush 5
      // 19e: bipush 1
      // 19f: bipush 6
      // 1a1: aload 3
      // 1a2: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1a5: aload 4
      // 1a7: ifnonnull 500
      // 1aa: goto 1b1
      // 1ad: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 1b0: athrow
      // 1b1: bipush 0
      // 1b2: istore 5
      // 1b4: iload 5
      // 1b6: bipush 5
      // 1b7: if_icmpge 218
      // 1ba: aload 0
      // 1bb: aload 1
      // 1bc: getstatic ox_.ow_ Le0x;
      // 1bf: invokevirtual e0x.l4i ()Lzfz;
      // 1c2: bipush 3
      // 1c3: bipush 1
      // 1c4: bipush 3
      // 1c5: iload 5
      // 1c7: iadd
      // 1c8: aload 3
      // 1c9: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1cc: aload 0
      // 1cd: aload 1
      // 1ce: getstatic ox_.ow_ Le0x;
      // 1d1: invokevirtual e0x.l4i ()Lzfz;
      // 1d4: bipush 7
      // 1d6: bipush 1
      // 1d7: bipush 3
      // 1d8: iload 5
      // 1da: iadd
      // 1db: aload 3
      // 1dc: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1df: aload 0
      // 1e0: aload 1
      // 1e1: getstatic ox_.ow_ Le0x;
      // 1e4: invokevirtual e0x.l4i ()Lzfz;
      // 1e7: bipush 3
      // 1e8: iload 5
      // 1ea: iadd
      // 1eb: bipush 1
      // 1ec: bipush 3
      // 1ed: aload 3
      // 1ee: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1f1: aload 0
      // 1f2: aload 1
      // 1f3: getstatic ox_.ow_ Le0x;
      // 1f6: invokevirtual e0x.l4i ()Lzfz;
      // 1f9: bipush 3
      // 1fa: iload 5
      // 1fc: iadd
      // 1fd: bipush 1
      // 1fe: bipush 7
      // 200: aload 3
      // 201: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 204: iinc 5 1
      // 207: aload 4
      // 209: ifnull 254
      // 20c: aload 4
      // 20e: ifnonnull 1b4
      // 211: goto 218
      // 214: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 217: athrow
      // 218: aload 0
      // 219: aload 1
      // 21a: getstatic ox_.ow_ Le0x;
      // 21d: invokevirtual e0x.l4i ()Lzfz;
      // 220: bipush 5
      // 221: bipush 1
      // 222: bipush 5
      // 223: aload 3
      // 224: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 227: aload 0
      // 228: aload 1
      // 229: getstatic ox_.ow_ Le0x;
      // 22c: invokevirtual e0x.l4i ()Lzfz;
      // 22f: bipush 5
      // 230: bipush 2
      // 231: bipush 5
      // 232: aload 3
      // 233: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 236: aload 0
      // 237: aload 1
      // 238: getstatic ox_.ow_ Le0x;
      // 23b: invokevirtual e0x.l4i ()Lzfz;
      // 23e: bipush 5
      // 23f: bipush 3
      // 240: bipush 5
      // 241: aload 3
      // 242: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 245: aload 0
      // 246: aload 1
      // 247: getstatic ox_.whp L_13;
      // 24a: invokevirtual _13.l4i ()Lzfz;
      // 24d: bipush 5
      // 24e: bipush 4
      // 24f: bipush 5
      // 250: aload 3
      // 251: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 254: aload 4
      // 256: ifnonnull 500
      // 259: bipush 1
      // 25a: istore 5
      // 25c: iload 5
      // 25e: bipush 9
      // 260: if_icmpgt 298
      // 263: aload 0
      // 264: aload 1
      // 265: getstatic ox_.a3_ Le0x;
      // 268: invokevirtual e0x.l4i ()Lzfz;
      // 26b: bipush 1
      // 26c: bipush 3
      // 26d: iload 5
      // 26f: aload 3
      // 270: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 273: aload 0
      // 274: aload 1
      // 275: getstatic ox_.a3_ Le0x;
      // 278: invokevirtual e0x.l4i ()Lzfz;
      // 27b: bipush 9
      // 27d: bipush 3
      // 27e: iload 5
      // 280: aload 3
      // 281: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 284: iinc 5 1
      // 287: aload 4
      // 289: ifnull 29b
      // 28c: aload 4
      // 28e: ifnonnull 25c
      // 291: goto 298
      // 294: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 297: athrow
      // 298: bipush 1
      // 299: istore 5
      // 29b: iload 5
      // 29d: bipush 9
      // 29f: if_icmpgt 2de
      // 2a2: aload 0
      // 2a3: aload 1
      // 2a4: getstatic ox_.a3_ Le0x;
      // 2a7: invokevirtual e0x.l4i ()Lzfz;
      // 2aa: iload 5
      // 2ac: bipush 3
      // 2ad: bipush 1
      // 2ae: aload 3
      // 2af: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2b2: aload 0
      // 2b3: aload 1
      // 2b4: getstatic ox_.a3_ Le0x;
      // 2b7: invokevirtual e0x.l4i ()Lzfz;
      // 2ba: iload 5
      // 2bc: bipush 3
      // 2bd: bipush 9
      // 2bf: aload 3
      // 2c0: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2c3: iinc 5 1
      // 2c6: aload 4
      // 2c8: ifnull 35a
      // 2cb: goto 2d2
      // 2ce: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 2d1: athrow
      // 2d2: aload 4
      // 2d4: ifnonnull 29b
      // 2d7: goto 2de
      // 2da: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 2dd: athrow
      // 2de: aload 0
      // 2df: aload 1
      // 2e0: getstatic ox_.a3_ Le0x;
      // 2e3: invokevirtual e0x.l4i ()Lzfz;
      // 2e6: bipush 5
      // 2e7: bipush 1
      // 2e8: bipush 4
      // 2e9: aload 3
      // 2ea: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2ed: aload 0
      // 2ee: aload 1
      // 2ef: getstatic ox_.a3_ Le0x;
      // 2f2: invokevirtual e0x.l4i ()Lzfz;
      // 2f5: bipush 5
      // 2f6: bipush 1
      // 2f7: bipush 6
      // 2f9: aload 3
      // 2fa: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 2fd: aload 0
      // 2fe: aload 1
      // 2ff: getstatic ox_.a3_ Le0x;
      // 302: invokevirtual e0x.l4i ()Lzfz;
      // 305: bipush 5
      // 306: bipush 3
      // 307: bipush 4
      // 308: aload 3
      // 309: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 30c: aload 0
      // 30d: aload 1
      // 30e: getstatic ox_.a3_ Le0x;
      // 311: invokevirtual e0x.l4i ()Lzfz;
      // 314: bipush 5
      // 315: bipush 3
      // 316: bipush 6
      // 318: aload 3
      // 319: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 31c: aload 0
      // 31d: aload 1
      // 31e: getstatic ox_.a3_ Le0x;
      // 321: invokevirtual e0x.l4i ()Lzfz;
      // 324: bipush 4
      // 325: bipush 1
      // 326: bipush 5
      // 327: aload 3
      // 328: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 32b: aload 0
      // 32c: aload 1
      // 32d: getstatic ox_.a3_ Le0x;
      // 330: invokevirtual e0x.l4i ()Lzfz;
      // 333: bipush 6
      // 335: bipush 1
      // 336: bipush 5
      // 337: aload 3
      // 338: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 33b: aload 0
      // 33c: aload 1
      // 33d: getstatic ox_.a3_ Le0x;
      // 340: invokevirtual e0x.l4i ()Lzfz;
      // 343: bipush 4
      // 344: bipush 3
      // 345: bipush 5
      // 346: aload 3
      // 347: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 34a: aload 0
      // 34b: aload 1
      // 34c: getstatic ox_.a3_ Le0x;
      // 34f: invokevirtual e0x.l4i ()Lzfz;
      // 352: bipush 6
      // 354: bipush 3
      // 355: bipush 5
      // 356: aload 3
      // 357: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 35a: bipush 1
      // 35b: istore 5
      // 35d: iload 5
      // 35f: bipush 3
      // 360: if_icmpgt 3bb
      // 363: aload 0
      // 364: aload 1
      // 365: getstatic ox_.a3_ Le0x;
      // 368: invokevirtual e0x.l4i ()Lzfz;
      // 36b: bipush 4
      // 36c: iload 5
      // 36e: bipush 4
      // 36f: aload 3
      // 370: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 373: aload 0
      // 374: aload 1
      // 375: getstatic ox_.a3_ Le0x;
      // 378: invokevirtual e0x.l4i ()Lzfz;
      // 37b: bipush 6
      // 37d: iload 5
      // 37f: bipush 4
      // 380: aload 3
      // 381: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 384: aload 0
      // 385: aload 1
      // 386: getstatic ox_.a3_ Le0x;
      // 389: invokevirtual e0x.l4i ()Lzfz;
      // 38c: bipush 4
      // 38d: iload 5
      // 38f: bipush 6
      // 391: aload 3
      // 392: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 395: aload 0
      // 396: aload 1
      // 397: getstatic ox_.a3_ Le0x;
      // 39a: invokevirtual e0x.l4i ()Lzfz;
      // 39d: bipush 6
      // 39f: iload 5
      // 3a1: bipush 6
      // 3a3: aload 3
      // 3a4: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3a7: iinc 5 1
      // 3aa: aload 4
      // 3ac: ifnull 3ca
      // 3af: aload 4
      // 3b1: ifnonnull 35d
      // 3b4: goto 3bb
      // 3b7: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 3ba: athrow
      // 3bb: aload 0
      // 3bc: aload 1
      // 3bd: getstatic ox_.gt8 Le0x;
      // 3c0: invokevirtual e0x.l4i ()Lzfz;
      // 3c3: bipush 5
      // 3c4: bipush 3
      // 3c5: bipush 5
      // 3c6: aload 3
      // 3c7: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3ca: bipush 2
      // 3cb: istore 5
      // 3cd: iload 5
      // 3cf: bipush 8
      // 3d1: if_icmpgt 482
      // 3d4: aload 0
      // 3d5: aload 1
      // 3d6: getstatic ox_.wb7 Le0x;
      // 3d9: invokevirtual e0x.l4i ()Lzfz;
      // 3dc: bipush 2
      // 3dd: bipush 3
      // 3de: iload 5
      // 3e0: aload 3
      // 3e1: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3e4: aload 0
      // 3e5: aload 1
      // 3e6: getstatic ox_.wb7 Le0x;
      // 3e9: invokevirtual e0x.l4i ()Lzfz;
      // 3ec: bipush 3
      // 3ed: bipush 3
      // 3ee: iload 5
      // 3f0: aload 3
      // 3f1: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3f4: aload 4
      // 3f6: ifnull 447
      // 3f9: iload 5
      // 3fb: aload 4
      // 3fd: ifnull 4ff
      // 400: goto 407
      // 403: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 406: athrow
      // 407: bipush 3
      // 408: if_icmple 420
      // 40b: goto 412
      // 40e: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 411: athrow
      // 412: iload 5
      // 414: bipush 7
      // 416: if_icmplt 458
      // 419: goto 420
      // 41c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 41f: athrow
      // 420: aload 0
      // 421: aload 1
      // 422: getstatic ox_.wb7 Le0x;
      // 425: invokevirtual e0x.l4i ()Lzfz;
      // 428: bipush 4
      // 429: bipush 3
      // 42a: iload 5
      // 42c: aload 3
      // 42d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 430: aload 0
      // 431: aload 1
      // 432: getstatic ox_.wb7 Le0x;
      // 435: invokevirtual e0x.l4i ()Lzfz;
      // 438: bipush 5
      // 439: bipush 3
      // 43a: iload 5
      // 43c: aload 3
      // 43d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 440: goto 447
      // 443: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.a (Loov;)Loov;
      // 446: athrow
      // 447: aload 0
      // 448: aload 1
      // 449: getstatic ox_.wb7 Le0x;
      // 44c: invokevirtual e0x.l4i ()Lzfz;
      // 44f: bipush 6
      // 451: bipush 3
      // 452: iload 5
      // 454: aload 3
      // 455: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 458: aload 0
      // 459: aload 1
      // 45a: getstatic ox_.wb7 Le0x;
      // 45d: invokevirtual e0x.l4i ()Lzfz;
      // 460: bipush 7
      // 462: bipush 3
      // 463: iload 5
      // 465: aload 3
      // 466: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 469: aload 0
      // 46a: aload 1
      // 46b: getstatic ox_.wb7 Le0x;
      // 46e: invokevirtual e0x.l4i ()Lzfz;
      // 471: bipush 8
      // 473: bipush 3
      // 474: iload 5
      // 476: aload 3
      // 477: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 47a: iinc 5 1
      // 47d: aload 4
      // 47f: ifnonnull 3cd
      // 482: aload 0
      // 483: aload 1
      // 484: getstatic ox_.h49 Le0x;
      // 487: aload 0
      // 488: getstatic ox_.h49 Le0x;
      // 48b: getstatic vt2.te4 Lvt2;
      // 48e: invokevirtual vt2.c3s ()I
      // 491: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.ujv (Le0x;I)I
      // 494: invokevirtual e0x.kig (I)Lzfz;
      // 497: bipush 9
      // 499: bipush 1
      // 49a: bipush 3
      // 49b: aload 3
      // 49c: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 49f: aload 0
      // 4a0: aload 1
      // 4a1: getstatic ox_.h49 Le0x;
      // 4a4: aload 0
      // 4a5: getstatic ox_.h49 Le0x;
      // 4a8: getstatic vt2.te4 Lvt2;
      // 4ab: invokevirtual vt2.c3s ()I
      // 4ae: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.ujv (Le0x;I)I
      // 4b1: invokevirtual e0x.kig (I)Lzfz;
      // 4b4: bipush 9
      // 4b6: bipush 2
      // 4b7: bipush 3
      // 4b8: aload 3
      // 4b9: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4bc: aload 0
      // 4bd: aload 1
      // 4be: getstatic ox_.h49 Le0x;
      // 4c1: aload 0
      // 4c2: getstatic ox_.h49 Le0x;
      // 4c5: getstatic vt2.te4 Lvt2;
      // 4c8: invokevirtual vt2.c3s ()I
      // 4cb: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.ujv (Le0x;I)I
      // 4ce: invokevirtual e0x.kig (I)Lzfz;
      // 4d1: bipush 9
      // 4d3: bipush 3
      // 4d4: bipush 3
      // 4d5: aload 3
      // 4d6: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4d9: aload 0
      // 4da: aload 1
      // 4db: aload 3
      // 4dc: aload 2
      // 4dd: bipush 3
      // 4de: bipush 4
      // 4df: bipush 8
      // 4e1: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.jcc Ljava/util/List;
      // 4e4: bipush 1
      // 4e5: anewarray 191
      // 4e8: dup
      // 4e9: bipush 0
      // 4ea: getstatic xbr.frz Lnmo;
      // 4ed: aload 2
      // 4ee: invokevirtual nmo.z0_ (Ljava/util/Random;)Lypi;
      // 4f1: aastore
      // 4f2: invokestatic ypi.voc (Ljava/util/List;[Lypi;)Ljava/util/List;
      // 4f5: bipush 1
      // 4f6: aload 2
      // 4f7: bipush 4
      // 4f8: invokevirtual java/util/Random.nextInt (I)I
      // 4fb: iadd
      // 4fc: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing.y6k (Lt9d;Lyve;Ljava/util/Random;IIILjava/util/List;I)Z
      // 4ff: pop
      // 500: bipush 1
      // 501: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5032329734937724883L, -6894693069048866376L, MethodHandles.lookup().lookupClass()).a(219721850514372L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 91293389612069L;
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
      String var6 = "»÷³s7á\u0094U50)\u0010 \u0012\u0011z\u0010î\u0004JM%Q\rW[q1?K¦\u009c|";
      int var8 = "»÷³s7á\u0094U50)\u0010 \u0012\u0011z\u0010î\u0004JM%Q\rW[q1?K¦\u009c|".length();
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
            jcc = Lists.newArrayList(
               new ypi[]{
                  new ypi(xbr.icz, 0, 1, 5, 10),
                  new ypi(xbr.jtr, 0, 1, 3, 5),
                  new ypi(xbr.deg, 0, 4, 9, 5),
                  new ypi(xbr.thr, 0, 3, 8, 10),
                  new ypi(xbr.nfb, 0, 1, 3, 15),
                  new ypi(xbr.lym, 0, 1, 3, 15),
                  new ypi(xbr.l4f, 0, 1, 1, 1)
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20827;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$RoomCrossing" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
