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

public class StructureNetherBridgePieces$Throne extends StructureNetherBridgePieces$Piece {
   private boolean u9j;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map h = new HashMap(13);

   public StructureNetherBridgePieces$Throne() {
   }

   public StructureNetherBridgePieces$Throne(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.yqm = var3;
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 91521012642566L;
      super.oqf(var1);
      this.u9j = var1.dvl(b<"s">(18492, 3683693799958911093L ^ var2));
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 49955985881709L;
      super.z0d(var1);
      var1.zyu(b<"s">(16910, 5478395877783821103L ^ var2), this.u9j);
   }

   public static StructureNetherBridgePieces$Throne c3w(List param0, Random param1, int param2, int param3, int param4, int param5, vt2 param6) {
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
      // 04: bipush -2
      // 06: bipush 0
      // 07: bipush 0
      // 08: bipush 7
      // 0a: bipush 8
      // 0c: bipush 9
      // 0e: aload 6
      // 10: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 13: astore 7
      // 15: aload 7
      // 17: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.ulp (Lyve;)Z
      // 1a: ifeq 42
      // 1d: aload 0
      // 1e: aload 7
      // 20: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 23: ifnonnull 42
      // 26: goto 2d
      // 29: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.a (Loov;)Loov;
      // 2c: athrow
      // 2d: new net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne
      // 30: dup
      // 31: iload 5
      // 33: aload 1
      // 34: aload 7
      // 36: aload 6
      // 38: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3b: goto 43
      // 3e: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.a (Loov;)Loov;
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
      // 000: getstatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.a J
      // 003: ldc2_w 66946888514798
      // 006: lxor
      // 007: lstore 4
      // 009: aload 0
      // 00a: aload 1
      // 00b: aload 3
      // 00c: bipush 0
      // 00d: bipush 2
      // 00e: bipush 0
      // 00f: bipush 6
      // 011: bipush 7
      // 013: bipush 7
      // 015: getstatic ox_.ibw Le0x;
      // 018: invokevirtual e0x.l4i ()Lzfz;
      // 01b: getstatic ox_.ibw Le0x;
      // 01e: invokevirtual e0x.l4i ()Lzfz;
      // 021: bipush 0
      // 022: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 025: aload 0
      // 026: aload 1
      // 027: aload 3
      // 028: bipush 1
      // 029: bipush 0
      // 02a: bipush 0
      // 02b: bipush 5
      // 02c: bipush 1
      // 02d: bipush 7
      // 02f: getstatic ox_.cbk Le0x;
      // 032: invokevirtual e0x.l4i ()Lzfz;
      // 035: getstatic ox_.cbk Le0x;
      // 038: invokevirtual e0x.l4i ()Lzfz;
      // 03b: bipush 0
      // 03c: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 03f: aload 0
      // 040: aload 1
      // 041: aload 3
      // 042: bipush 1
      // 043: bipush 2
      // 044: bipush 1
      // 045: bipush 5
      // 046: bipush 2
      // 047: bipush 7
      // 049: getstatic ox_.cbk Le0x;
      // 04c: invokevirtual e0x.l4i ()Lzfz;
      // 04f: getstatic ox_.cbk Le0x;
      // 052: invokevirtual e0x.l4i ()Lzfz;
      // 055: bipush 0
      // 056: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 059: aload 0
      // 05a: aload 1
      // 05b: aload 3
      // 05c: bipush 1
      // 05d: bipush 3
      // 05e: bipush 2
      // 05f: bipush 5
      // 060: bipush 3
      // 061: bipush 7
      // 063: getstatic ox_.cbk Le0x;
      // 066: invokevirtual e0x.l4i ()Lzfz;
      // 069: getstatic ox_.cbk Le0x;
      // 06c: invokevirtual e0x.l4i ()Lzfz;
      // 06f: bipush 0
      // 070: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 073: aload 0
      // 074: aload 1
      // 075: aload 3
      // 076: bipush 1
      // 077: bipush 4
      // 078: bipush 3
      // 079: bipush 5
      // 07a: bipush 4
      // 07b: bipush 7
      // 07d: getstatic ox_.cbk Le0x;
      // 080: invokevirtual e0x.l4i ()Lzfz;
      // 083: getstatic ox_.cbk Le0x;
      // 086: invokevirtual e0x.l4i ()Lzfz;
      // 089: bipush 0
      // 08a: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 08d: aload 0
      // 08e: aload 1
      // 08f: aload 3
      // 090: bipush 1
      // 091: bipush 2
      // 092: bipush 0
      // 093: bipush 1
      // 094: bipush 4
      // 095: bipush 2
      // 096: getstatic ox_.cbk Le0x;
      // 099: invokevirtual e0x.l4i ()Lzfz;
      // 09c: getstatic ox_.cbk Le0x;
      // 09f: invokevirtual e0x.l4i ()Lzfz;
      // 0a2: bipush 0
      // 0a3: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0a6: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 0a9: aload 0
      // 0aa: aload 1
      // 0ab: aload 3
      // 0ac: bipush 5
      // 0ad: bipush 2
      // 0ae: bipush 0
      // 0af: bipush 5
      // 0b0: bipush 4
      // 0b1: bipush 2
      // 0b2: getstatic ox_.cbk Le0x;
      // 0b5: invokevirtual e0x.l4i ()Lzfz;
      // 0b8: getstatic ox_.cbk Le0x;
      // 0bb: invokevirtual e0x.l4i ()Lzfz;
      // 0be: bipush 0
      // 0bf: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0c2: aload 0
      // 0c3: aload 1
      // 0c4: aload 3
      // 0c5: bipush 1
      // 0c6: bipush 5
      // 0c7: bipush 2
      // 0c8: bipush 1
      // 0c9: bipush 5
      // 0ca: bipush 3
      // 0cb: getstatic ox_.cbk Le0x;
      // 0ce: invokevirtual e0x.l4i ()Lzfz;
      // 0d1: getstatic ox_.cbk Le0x;
      // 0d4: invokevirtual e0x.l4i ()Lzfz;
      // 0d7: bipush 0
      // 0d8: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0db: aload 0
      // 0dc: aload 1
      // 0dd: aload 3
      // 0de: bipush 5
      // 0df: bipush 5
      // 0e0: bipush 2
      // 0e1: bipush 5
      // 0e2: bipush 5
      // 0e3: bipush 3
      // 0e4: getstatic ox_.cbk Le0x;
      // 0e7: invokevirtual e0x.l4i ()Lzfz;
      // 0ea: getstatic ox_.cbk Le0x;
      // 0ed: invokevirtual e0x.l4i ()Lzfz;
      // 0f0: bipush 0
      // 0f1: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0f4: aload 0
      // 0f5: aload 1
      // 0f6: aload 3
      // 0f7: bipush 0
      // 0f8: bipush 5
      // 0f9: bipush 3
      // 0fa: bipush 0
      // 0fb: bipush 5
      // 0fc: bipush 8
      // 0fe: getstatic ox_.cbk Le0x;
      // 101: invokevirtual e0x.l4i ()Lzfz;
      // 104: getstatic ox_.cbk Le0x;
      // 107: invokevirtual e0x.l4i ()Lzfz;
      // 10a: bipush 0
      // 10b: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 10e: aload 0
      // 10f: aload 1
      // 110: aload 3
      // 111: bipush 6
      // 113: bipush 5
      // 114: bipush 3
      // 115: bipush 6
      // 117: bipush 5
      // 118: bipush 8
      // 11a: getstatic ox_.cbk Le0x;
      // 11d: invokevirtual e0x.l4i ()Lzfz;
      // 120: getstatic ox_.cbk Le0x;
      // 123: invokevirtual e0x.l4i ()Lzfz;
      // 126: bipush 0
      // 127: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 12a: aload 0
      // 12b: aload 1
      // 12c: aload 3
      // 12d: bipush 1
      // 12e: bipush 5
      // 12f: bipush 8
      // 131: bipush 5
      // 132: bipush 5
      // 133: bipush 8
      // 135: getstatic ox_.cbk Le0x;
      // 138: invokevirtual e0x.l4i ()Lzfz;
      // 13b: getstatic ox_.cbk Le0x;
      // 13e: invokevirtual e0x.l4i ()Lzfz;
      // 141: bipush 0
      // 142: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 145: aload 0
      // 146: aload 1
      // 147: getstatic ox_.laa Le0x;
      // 14a: invokevirtual e0x.l4i ()Lzfz;
      // 14d: bipush 1
      // 14e: bipush 6
      // 150: bipush 3
      // 151: aload 3
      // 152: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.lzy (Lt9d;Lzfz;IIILyve;)V
      // 155: astore 6
      // 157: aload 0
      // 158: aload 1
      // 159: getstatic ox_.laa Le0x;
      // 15c: invokevirtual e0x.l4i ()Lzfz;
      // 15f: bipush 5
      // 160: bipush 6
      // 162: bipush 3
      // 163: aload 3
      // 164: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.lzy (Lt9d;Lzfz;IIILyve;)V
      // 167: aload 0
      // 168: aload 1
      // 169: aload 3
      // 16a: bipush 0
      // 16b: bipush 6
      // 16d: bipush 3
      // 16e: bipush 0
      // 16f: bipush 6
      // 171: bipush 8
      // 173: getstatic ox_.laa Le0x;
      // 176: invokevirtual e0x.l4i ()Lzfz;
      // 179: getstatic ox_.laa Le0x;
      // 17c: invokevirtual e0x.l4i ()Lzfz;
      // 17f: bipush 0
      // 180: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 183: aload 0
      // 184: aload 1
      // 185: aload 3
      // 186: bipush 6
      // 188: bipush 6
      // 18a: bipush 3
      // 18b: bipush 6
      // 18d: bipush 6
      // 18f: bipush 8
      // 191: getstatic ox_.laa Le0x;
      // 194: invokevirtual e0x.l4i ()Lzfz;
      // 197: getstatic ox_.laa Le0x;
      // 19a: invokevirtual e0x.l4i ()Lzfz;
      // 19d: bipush 0
      // 19e: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1a1: aload 0
      // 1a2: aload 1
      // 1a3: aload 3
      // 1a4: bipush 1
      // 1a5: bipush 6
      // 1a7: bipush 8
      // 1a9: bipush 5
      // 1aa: bipush 7
      // 1ac: bipush 8
      // 1ae: getstatic ox_.laa Le0x;
      // 1b1: invokevirtual e0x.l4i ()Lzfz;
      // 1b4: getstatic ox_.laa Le0x;
      // 1b7: invokevirtual e0x.l4i ()Lzfz;
      // 1ba: bipush 0
      // 1bb: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1be: aload 0
      // 1bf: aload 1
      // 1c0: aload 3
      // 1c1: bipush 2
      // 1c2: bipush 8
      // 1c4: bipush 8
      // 1c6: bipush 4
      // 1c7: bipush 8
      // 1c9: bipush 8
      // 1cb: getstatic ox_.laa Le0x;
      // 1ce: invokevirtual e0x.l4i ()Lzfz;
      // 1d1: getstatic ox_.laa Le0x;
      // 1d4: invokevirtual e0x.l4i ()Lzfz;
      // 1d7: bipush 0
      // 1d8: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1db: aload 0
      // 1dc: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.u9j Z
      // 1df: aload 6
      // 1e1: ifnull 26e
      // 1e4: ifne 26d
      // 1e7: goto 1ee
      // 1ea: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.a (Loov;)Loov;
      // 1ed: athrow
      // 1ee: new mew
      // 1f1: dup
      // 1f2: aload 0
      // 1f3: bipush 3
      // 1f4: bipush 5
      // 1f5: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.q__ (II)I
      // 1f8: aload 0
      // 1f9: bipush 5
      // 1fa: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne._tw (I)I
      // 1fd: aload 0
      // 1fe: bipush 3
      // 1ff: bipush 5
      // 200: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne._ye (II)I
      // 203: invokespecial mew.<init> (III)V
      // 206: astore 7
      // 208: aload 3
      // 209: aload 7
      // 20b: invokevirtual yve.vwy (Lwgo;)Z
      // 20e: aload 6
      // 210: ifnull 26e
      // 213: ifeq 26d
      // 216: goto 21d
      // 219: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.a (Loov;)Loov;
      // 21c: athrow
      // 21d: aload 0
      // 21e: bipush 1
      // 21f: putfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.u9j Z
      // 222: aload 1
      // 223: aload 7
      // 225: getstatic ox_.jvm Le0x;
      // 228: invokevirtual e0x.l4i ()Lzfz;
      // 22b: bipush 2
      // 22c: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 22f: pop
      // 230: aload 1
      // 231: aload 7
      // 233: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 236: astore 8
      // 238: aload 8
      // 23a: instanceof net/minecraft/tileentity/TileEntityMobSpawner
      // 23d: aload 6
      // 23f: ifnull 26e
      // 242: ifeq 26d
      // 245: goto 24c
      // 248: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.a (Loov;)Loov;
      // 24b: athrow
      // 24c: aload 8
      // 24e: checkcast net/minecraft/tileentity/TileEntityMobSpawner
      // 251: invokevirtual net/minecraft/tileentity/TileEntityMobSpawner.ebe ()Laih;
      // 254: sipush 5582
      // 257: ldc2_w 5972981437241870957
      // 25a: lload 4
      // 25c: lxor
      // 25d: invokedynamic s (IJ)Ljava/lang/String; bsm=net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: nop
      // 263: invokevirtual aih.ugq (Ljava/lang/String;)V
      // 266: goto 26d
      // 269: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.a (Loov;)Loov;
      // 26c: athrow
      // 26d: bipush 0
      // 26e: istore 7
      // 270: iload 7
      // 272: bipush 6
      // 274: if_icmpgt 2b3
      // 277: bipush 0
      // 278: aload 6
      // 27a: ifnull 2b4
      // 27d: istore 8
      // 27f: iload 8
      // 281: bipush 6
      // 283: if_icmpgt 2ab
      // 286: aload 0
      // 287: aload 1
      // 288: getstatic ox_.cbk Le0x;
      // 28b: invokevirtual e0x.l4i ()Lzfz;
      // 28e: iload 7
      // 290: bipush -1
      // 291: iload 8
      // 293: aload 3
      // 294: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.doc (Lt9d;Lzfz;IIILyve;)V
      // 297: iinc 8 1
      // 29a: aload 6
      // 29c: ifnull 2ae
      // 29f: aload 6
      // 2a1: ifnonnull 27f
      // 2a4: goto 2ab
      // 2a7: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne.a (Loov;)Loov;
      // 2aa: athrow
      // 2ab: iinc 7 1
      // 2ae: aload 6
      // 2b0: ifnonnull 270
      // 2b3: bipush 1
      // 2b4: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2233158261794296611L, -4759796884080541526L, MethodHandles.lookup().lookupClass()).a(234150168662624L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 131171335773341L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "3ô\u0086\u0096z¤ \u0086§{3(w6ûd\u00103¸J£8\u0088ù\u0001cüQPý¨Ç\u001a\u0010É\u0015\u0006¦ºÉ\u0018|íïJ¸\u0080\u0013\u0014;";
      int var8 = "3ô\u0086\u0096z¤ \u0086§{3(w6ûd\u00103¸J£8\u0088ù\u0001cüQPý¨Ç\u001a\u0010É\u0015\u0006¦ºÉ\u0018|íïJ¸\u0080\u0013\u0014;".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23654;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
