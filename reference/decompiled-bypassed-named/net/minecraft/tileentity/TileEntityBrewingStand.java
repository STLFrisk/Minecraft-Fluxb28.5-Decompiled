package net.minecraft.tileentity;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class TileEntityBrewingStand extends TileEntityLockable implements xcy, hjb {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String noc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntityBrewingStand.a J
      // 03: ldc2_w 53352867162507
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 3
      // 0c: aload 0
      // 0d: aload 3
      // 0e: ifnonnull 26
      // 11: invokevirtual net/minecraft/tileentity/TileEntityBrewingStand.qrh ()Z
      // 14: ifeq 2c
      // 17: goto 1e
      // 1a: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 25: athrow
      // 26: getfield net/minecraft/tileentity/TileEntityBrewingStand.tx1 Ljava/lang/String;
      // 29: goto 3a
      // 2c: sipush 30851
      // 2f: ldc2_w 3457436304628530929
      // 32: lload 1
      // 33: lxor
      // 34: invokedynamic k (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBrewingStand.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: nop
      // 3a: areturn
   }

   @Override
   public boolean qrh() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield net/minecraft/tileentity/TileEntityBrewingStand.tx1 Ljava/lang/String;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/tileentity/TileEntityBrewingStand.tx1 Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual java/lang/String.length ()I
      // 24: aload 1
      // 25: ifnonnull 33
      // 28: ifle 36
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public void f9y(String var1) {
      this.tx1 = var1;
   }

   @Override
   public int opt() {
      return this.uzr.length;
   }

   @Override
   public void _21() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 003: astore 1
      // 004: aload 0
      // 005: getfield net/minecraft/tileentity/TileEntityBrewingStand.ze3 I
      // 008: aload 1
      // 009: ifnonnull 0ba
      // 00c: ifle 0af
      // 00f: goto 016
      // 012: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: dup
      // 018: getfield net/minecraft/tileentity/TileEntityBrewingStand.ze3 I
      // 01b: bipush 1
      // 01c: isub
      // 01d: putfield net/minecraft/tileentity/TileEntityBrewingStand.ze3 I
      // 020: aload 0
      // 021: getfield net/minecraft/tileentity/TileEntityBrewingStand.ze3 I
      // 024: aload 1
      // 025: ifnonnull 062
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 02e: athrow
      // 02f: ifne 04c
      // 032: goto 039
      // 035: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 0
      // 03a: invokespecial net/minecraft/tileentity/TileEntityBrewingStand.h2m ()V
      // 03d: aload 0
      // 03e: invokevirtual net/minecraft/tileentity/TileEntityBrewingStand.r5t ()V
      // 041: aload 1
      // 042: ifnull 0e3
      // 045: goto 04c
      // 048: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: aload 1
      // 04e: ifnonnull 081
      // 051: goto 058
      // 054: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 057: athrow
      // 058: invokespecial net/minecraft/tileentity/TileEntityBrewingStand.h4a ()Z
      // 05b: goto 062
      // 05e: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 061: athrow
      // 062: ifne 079
      // 065: aload 0
      // 066: bipush 0
      // 067: putfield net/minecraft/tileentity/TileEntityBrewingStand.ze3 I
      // 06a: aload 0
      // 06b: invokevirtual net/minecraft/tileentity/TileEntityBrewingStand.r5t ()V
      // 06e: aload 1
      // 06f: ifnull 0e3
      // 072: goto 079
      // 075: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 0
      // 07a: goto 081
      // 07d: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 080: athrow
      // 081: aload 1
      // 082: ifnonnull 0e4
      // 085: getfield net/minecraft/tileentity/TileEntityBrewingStand._dl Lu7m;
      // 088: aload 0
      // 089: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 08c: bipush 3
      // 08d: aaload
      // 08e: invokevirtual erg.gn1 ()Lu7m;
      // 091: if_acmpeq 0e3
      // 094: goto 09b
      // 097: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 0
      // 09c: bipush 0
      // 09d: putfield net/minecraft/tileentity/TileEntityBrewingStand.ze3 I
      // 0a0: aload 0
      // 0a1: invokevirtual net/minecraft/tileentity/TileEntityBrewingStand.r5t ()V
      // 0a4: aload 1
      // 0a5: ifnull 0e3
      // 0a8: goto 0af
      // 0ab: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: invokespecial net/minecraft/tileentity/TileEntityBrewingStand.h4a ()Z
      // 0b3: goto 0ba
      // 0b6: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 1
      // 0bb: ifnonnull 0f5
      // 0be: ifeq 0e3
      // 0c1: goto 0c8
      // 0c4: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: sipush 400
      // 0cc: putfield net/minecraft/tileentity/TileEntityBrewingStand.ze3 I
      // 0cf: aload 0
      // 0d0: aload 0
      // 0d1: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 0d4: bipush 3
      // 0d5: aaload
      // 0d6: invokevirtual erg.gn1 ()Lu7m;
      // 0d9: putfield net/minecraft/tileentity/TileEntityBrewingStand._dl Lu7m;
      // 0dc: goto 0e3
      // 0df: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: aload 1
      // 0e5: ifnonnull 0f9
      // 0e8: getfield net/minecraft/tileentity/TileEntityBrewingStand.yh_ Lt9d;
      // 0eb: getfield OpaquePredicate.v0f Z
      // 0ee: goto 0f5
      // 0f1: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: ifne 183
      // 0f8: aload 0
      // 0f9: invokevirtual net/minecraft/tileentity/TileEntityBrewingStand.jsl ()[Z
      // 0fc: astore 2
      // 0fd: aload 1
      // 0fe: ifnonnull 11f
      // 101: aload 2
      // 102: aload 0
      // 103: getfield net/minecraft/tileentity/TileEntityBrewingStand.azw [Z
      // 106: invokestatic java/util/Arrays.equals ([Z[Z)Z
      // 109: ifne 183
      // 10c: goto 113
      // 10f: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 112: athrow
      // 113: aload 0
      // 114: aload 2
      // 115: putfield net/minecraft/tileentity/TileEntityBrewingStand.azw [Z
      // 118: goto 11f
      // 11b: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 11e: athrow
      // 11f: aload 0
      // 120: getfield net/minecraft/tileentity/TileEntityBrewingStand.yh_ Lt9d;
      // 123: aload 0
      // 124: invokevirtual net/minecraft/tileentity/TileEntityBrewingStand.y8_ ()Lmew;
      // 127: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 12a: astore 3
      // 12b: aload 3
      // 12c: invokeinterface zfz.r_y ()Le0x; 1
      // 131: instanceof all
      // 134: aload 1
      // 135: ifnonnull 144
      // 138: ifne 143
      // 13b: goto 142
      // 13e: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 141: athrow
      // 142: return
      // 143: bipush 0
      // 144: istore 4
      // 146: iload 4
      // 148: getstatic all.yky [Lh76;
      // 14b: arraylength
      // 14c: if_icmpge 175
      // 14f: aload 3
      // 150: getstatic all.yky [Lh76;
      // 153: iload 4
      // 155: aaload
      // 156: aload 2
      // 157: iload 4
      // 159: baload
      // 15a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 15d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 162: astore 3
      // 163: iinc 4 1
      // 166: aload 1
      // 167: ifnonnull 183
      // 16a: aload 1
      // 16b: ifnull 146
      // 16e: goto 175
      // 171: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 174: athrow
      // 175: aload 0
      // 176: getfield net/minecraft/tileentity/TileEntityBrewingStand.yh_ Lt9d;
      // 179: aload 0
      // 17a: getfield net/minecraft/tileentity/TileEntityBrewingStand.al2 Lmew;
      // 17d: aload 3
      // 17e: bipush 2
      // 17f: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 182: pop
      // 183: return
   }

   private boolean h4a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 003: astore 1
      // 004: aload 0
      // 005: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 008: bipush 3
      // 009: aaload
      // 00a: aload 1
      // 00b: ifnonnull 025
      // 00e: ifnull 18c
      // 011: goto 018
      // 014: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 01c: bipush 3
      // 01d: aaload
      // 01e: goto 025
      // 021: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 024: athrow
      // 025: getfield erg.qd2 I
      // 028: aload 1
      // 029: ifnonnull 18d
      // 02c: ifle 18c
      // 02f: goto 036
      // 032: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 035: athrow
      // 036: aload 0
      // 037: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 03a: bipush 3
      // 03b: aaload
      // 03c: astore 2
      // 03d: aload 2
      // 03e: invokevirtual erg.gn1 ()Lu7m;
      // 041: aload 2
      // 042: invokevirtual u7m.shg (Lerg;)Z
      // 045: aload 1
      // 046: ifnonnull 05a
      // 049: ifne 059
      // 04c: goto 053
      // 04f: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 052: athrow
      // 053: bipush 0
      // 054: ireturn
      // 055: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 058: athrow
      // 059: bipush 0
      // 05a: istore 3
      // 05b: bipush 0
      // 05c: istore 4
      // 05e: iload 4
      // 060: bipush 3
      // 061: if_icmpge 18a
      // 064: aload 0
      // 065: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 068: iload 4
      // 06a: aaload
      // 06b: aload 1
      // 06c: ifnonnull 087
      // 06f: ifnull 17c
      // 072: goto 079
      // 075: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 0
      // 07a: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 07d: iload 4
      // 07f: aaload
      // 080: goto 087
      // 083: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 1
      // 088: ifnonnull 0a9
      // 08b: invokevirtual erg.gn1 ()Lu7m;
      // 08e: getstatic xbr.ik6 Ldgn;
      // 091: if_acmpne 17c
      // 094: goto 09b
      // 097: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 0
      // 09c: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 09f: iload 4
      // 0a1: aaload
      // 0a2: goto 0a9
      // 0a5: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: invokevirtual erg.j6_ ()I
      // 0ac: istore 5
      // 0ae: aload 0
      // 0af: iload 5
      // 0b1: aload 2
      // 0b2: invokespecial net/minecraft/tileentity/TileEntityBrewingStand.hx6 (ILerg;)I
      // 0b5: istore 6
      // 0b7: iload 5
      // 0b9: invokestatic dgn.rri (I)Z
      // 0bc: aload 1
      // 0bd: ifnonnull 0d6
      // 0c0: ifne 0ea
      // 0c3: goto 0ca
      // 0c6: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: iload 6
      // 0cc: invokestatic dgn.rri (I)Z
      // 0cf: goto 0d6
      // 0d2: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 1
      // 0d7: ifnonnull 0e5
      // 0da: ifeq 0ea
      // 0dd: goto 0e4
      // 0e0: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: bipush 1
      // 0e5: istore 3
      // 0e6: aload 1
      // 0e7: ifnull 18a
      // 0ea: getstatic xbr.ik6 Ldgn;
      // 0ed: iload 5
      // 0ef: invokevirtual dgn.pcg (I)Ljava/util/List;
      // 0f2: astore 7
      // 0f4: getstatic xbr.ik6 Ldgn;
      // 0f7: iload 6
      // 0f9: invokevirtual dgn.pcg (I)Ljava/util/List;
      // 0fc: astore 8
      // 0fe: iload 5
      // 100: ifle 11c
      // 103: aload 7
      // 105: aload 1
      // 106: ifnonnull 125
      // 109: goto 110
      // 10c: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 8
      // 112: if_acmpeq 17c
      // 115: goto 11c
      // 118: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 11b: athrow
      // 11c: aload 7
      // 11e: goto 125
      // 121: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 124: athrow
      // 125: aload 1
      // 126: ifnonnull 135
      // 129: ifnull 156
      // 12c: goto 133
      // 12f: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 132: athrow
      // 133: aload 7
      // 135: aload 1
      // 136: ifnonnull 153
      // 139: aload 8
      // 13b: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 140: ifne 17c
      // 143: goto 14a
      // 146: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 149: athrow
      // 14a: aload 8
      // 14c: goto 153
      // 14f: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 152: athrow
      // 153: ifnull 17c
      // 156: iload 5
      // 158: aload 1
      // 159: ifnonnull 177
      // 15c: goto 163
      // 15f: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 162: athrow
      // 163: iload 6
      // 165: if_icmpeq 17c
      // 168: goto 16f
      // 16b: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 16e: athrow
      // 16f: bipush 1
      // 170: goto 177
      // 173: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 176: athrow
      // 177: istore 3
      // 178: aload 1
      // 179: ifnull 18a
      // 17c: iinc 4 1
      // 17f: aload 1
      // 180: ifnull 05e
      // 183: goto 18a
      // 186: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 189: athrow
      // 18a: iload 3
      // 18b: ireturn
      // 18c: bipush 0
      // 18d: ireturn
   }

   private void h2m() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 003: astore 1
      // 004: aload 0
      // 005: aload 1
      // 006: ifnonnull 01e
      // 009: invokespecial net/minecraft/tileentity/TileEntityBrewingStand.h4a ()Z
      // 00c: ifeq 1c7
      // 00f: goto 016
      // 012: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: goto 01e
      // 01a: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 01d: athrow
      // 01e: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 021: bipush 3
      // 022: aaload
      // 023: astore 2
      // 024: bipush 0
      // 025: istore 3
      // 026: iload 3
      // 027: bipush 3
      // 028: if_icmpge 158
      // 02b: aload 0
      // 02c: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 02f: iload 3
      // 030: aaload
      // 031: aload 1
      // 032: ifnonnull 159
      // 035: aload 1
      // 036: ifnonnull 057
      // 039: goto 040
      // 03c: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 03f: athrow
      // 040: ifnull 151
      // 043: goto 04a
      // 046: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 0
      // 04b: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 04e: iload 3
      // 04f: aaload
      // 050: goto 057
      // 053: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 1
      // 058: ifnonnull 078
      // 05b: invokevirtual erg.gn1 ()Lu7m;
      // 05e: getstatic xbr.ik6 Ldgn;
      // 061: if_acmpne 151
      // 064: goto 06b
      // 067: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 06f: iload 3
      // 070: aaload
      // 071: goto 078
      // 074: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 077: athrow
      // 078: invokevirtual erg.j6_ ()I
      // 07b: istore 4
      // 07d: aload 0
      // 07e: iload 4
      // 080: aload 2
      // 081: invokespecial net/minecraft/tileentity/TileEntityBrewingStand.hx6 (ILerg;)I
      // 084: istore 5
      // 086: getstatic xbr.ik6 Ldgn;
      // 089: iload 4
      // 08b: invokevirtual dgn.pcg (I)Ljava/util/List;
      // 08e: astore 6
      // 090: getstatic xbr.ik6 Ldgn;
      // 093: iload 5
      // 095: invokevirtual dgn.pcg (I)Ljava/util/List;
      // 098: astore 7
      // 09a: iload 4
      // 09c: ifle 0b8
      // 09f: aload 6
      // 0a1: aload 1
      // 0a2: ifnonnull 0c1
      // 0a5: goto 0ac
      // 0a8: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: aload 7
      // 0ae: if_acmpeq 0f2
      // 0b1: goto 0b8
      // 0b4: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 6
      // 0ba: goto 0c1
      // 0bd: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 1
      // 0c2: ifnonnull 0d1
      // 0c5: ifnull 131
      // 0c8: goto 0cf
      // 0cb: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 6
      // 0d1: aload 7
      // 0d3: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 0d8: aload 1
      // 0d9: ifnonnull 0fe
      // 0dc: ifne 0f2
      // 0df: goto 0e6
      // 0e2: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: aload 7
      // 0e8: ifnonnull 131
      // 0eb: goto 0f2
      // 0ee: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: iload 4
      // 0f4: invokestatic dgn.rri (I)Z
      // 0f7: goto 0fe
      // 0fa: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: aload 1
      // 0ff: ifnonnull 118
      // 102: ifne 151
      // 105: goto 10c
      // 108: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 10b: athrow
      // 10c: iload 5
      // 10e: invokestatic dgn.rri (I)Z
      // 111: goto 118
      // 114: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 117: athrow
      // 118: ifeq 151
      // 11b: aload 0
      // 11c: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 11f: iload 3
      // 120: aaload
      // 121: iload 5
      // 123: invokevirtual erg.awe (I)V
      // 126: aload 1
      // 127: ifnull 151
      // 12a: goto 131
      // 12d: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 130: athrow
      // 131: iload 4
      // 133: iload 5
      // 135: if_icmpeq 151
      // 138: goto 13f
      // 13b: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 13e: athrow
      // 13f: aload 0
      // 140: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 143: iload 3
      // 144: aaload
      // 145: iload 5
      // 147: invokevirtual erg.awe (I)V
      // 14a: goto 151
      // 14d: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 150: athrow
      // 151: iinc 3 1
      // 154: aload 1
      // 155: ifnull 026
      // 158: aload 2
      // 159: invokevirtual erg.gn1 ()Lu7m;
      // 15c: invokevirtual u7m.jof ()Z
      // 15f: aload 1
      // 160: ifnonnull 1b6
      // 163: ifeq 18c
      // 166: goto 16d
      // 169: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 16c: athrow
      // 16d: aload 0
      // 16e: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 171: bipush 3
      // 172: new erg
      // 175: dup
      // 176: aload 2
      // 177: invokevirtual erg.gn1 ()Lu7m;
      // 17a: invokevirtual u7m.cqe ()Lu7m;
      // 17d: invokespecial erg.<init> (Lu7m;)V
      // 180: aastore
      // 181: aload 1
      // 182: ifnull 1c7
      // 185: goto 18c
      // 188: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 18b: athrow
      // 18c: aload 0
      // 18d: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 190: bipush 3
      // 191: aaload
      // 192: dup
      // 193: getfield erg.qd2 I
      // 196: bipush 1
      // 197: isub
      // 198: putfield erg.qd2 I
      // 19b: aload 0
      // 19c: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 19f: bipush 3
      // 1a0: aload 1
      // 1a1: ifnonnull 1c5
      // 1a4: goto 1ab
      // 1a7: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 1aa: athrow
      // 1ab: aaload
      // 1ac: getfield erg.qd2 I
      // 1af: goto 1b6
      // 1b2: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 1b5: athrow
      // 1b6: ifgt 1c7
      // 1b9: aload 0
      // 1ba: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 1bd: bipush 3
      // 1be: goto 1c5
      // 1c1: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: aconst_null
      // 1c6: aastore
      // 1c7: return
   }

   private int hx6(int param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 3
      // 04: aload 2
      // 05: aload 3
      // 06: ifnonnull 1c
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 1
      // 14: goto 48
      // 17: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 2
      // 1c: invokevirtual erg.gn1 ()Lu7m;
      // 1f: aload 2
      // 20: invokevirtual u7m.shg (Lerg;)Z
      // 23: aload 3
      // 24: ifnonnull 44
      // 27: ifeq 47
      // 2a: goto 31
      // 2d: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 30: athrow
      // 31: iload 1
      // 32: aload 2
      // 33: invokevirtual erg.gn1 ()Lu7m;
      // 36: aload 2
      // 37: invokevirtual u7m.sdj (Lerg;)Ljava/lang/String;
      // 3a: invokestatic ksn.l18 (ILjava/lang/String;)I
      // 3d: goto 44
      // 40: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 43: athrow
      // 44: goto 48
      // 47: iload 1
      // 48: ireturn
   }

   @Override
   public void agl(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntityBrewingStand.a J
      // 03: ldc2_w 98330126037974
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: aload 1
      // 0a: invokespecial net/minecraft/tileentity/TileEntityLockable.agl (Lbdo;)V
      // 0d: aload 1
      // 0e: sipush 2387
      // 11: ldc2_w 5688673471432594810
      // 14: lload 2
      // 15: lxor
      // 16: invokedynamic k (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBrewingStand.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: bipush 10
      // 1e: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 21: astore 5
      // 23: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 26: aload 0
      // 27: aload 0
      // 28: invokevirtual net/minecraft/tileentity/TileEntityBrewingStand.opt ()I
      // 2b: anewarray 37
      // 2e: putfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 31: astore 4
      // 33: bipush 0
      // 34: istore 6
      // 36: iload 6
      // 38: aload 5
      // 3a: invokevirtual qhg.vek ()I
      // 3d: if_icmpge a7
      // 40: aload 5
      // 42: iload 6
      // 44: invokevirtual qhg.kd6 (I)Lbdo;
      // 47: astore 7
      // 49: aload 7
      // 4b: sipush 18258
      // 4e: ldc2_w 1517644892963658617
      // 51: lload 2
      // 52: lxor
      // 53: invokedynamic k (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBrewingStand.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: nop
      // 59: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 5c: istore 8
      // 5e: aload 4
      // 60: ifnonnull a2
      // 63: iload 8
      // 65: aload 4
      // 67: ifnonnull dd
      // 6a: goto 71
      // 6d: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 70: athrow
      // 71: iflt 9f
      // 74: goto 7b
      // 77: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 7a: athrow
      // 7b: iload 8
      // 7d: aload 0
      // 7e: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 81: arraylength
      // 82: if_icmpge 9f
      // 85: goto 8c
      // 88: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 0
      // 8d: getfield net/minecraft/tileentity/TileEntityBrewingStand.uzr [Lerg;
      // 90: iload 8
      // 92: aload 7
      // 94: invokestatic erg.qog (Lbdo;)Lerg;
      // 97: aastore
      // 98: goto 9f
      // 9b: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 9e: athrow
      // 9f: iinc 6 1
      // a2: aload 4
      // a4: ifnull 36
      // a7: aload 0
      // a8: aload 1
      // a9: sipush 28943
      // ac: ldc2_w 9060477332454239521
      // af: lload 2
      // b0: lxor
      // b1: invokedynamic k (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBrewingStand.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b6: nop
      // b7: aload 4
      // b9: ifnonnull f7
      // bc: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // bf: putfield net/minecraft/tileentity/TileEntityBrewingStand.ze3 I
      // c2: aload 1
      // c3: sipush 8760
      // c6: ldc2_w 8515141918057938457
      // c9: lload 2
      // ca: lxor
      // cb: invokedynamic k (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBrewingStand.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: nop
      // d1: bipush 8
      // d3: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // d6: goto dd
      // d9: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // dc: athrow
      // dd: ifeq fd
      // e0: aload 0
      // e1: aload 1
      // e2: sipush 30334
      // e5: ldc2_w 5524089466500180563
      // e8: lload 2
      // e9: lxor
      // ea: invokedynamic k (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBrewingStand.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ef: nop
      // f0: goto f7
      // f3: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // f6: athrow
      // f7: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // fa: putfield net/minecraft/tileentity/TileEntityBrewingStand.tx1 Ljava/lang/String;
      // fd: return
   }

   @Override
   public void m2a(bdo var1) {
      long var2 = a ^ 51470988662538L;
      super.m2a(var1);
      int[] var10000 = TileEntityBeacon$yv7.b();
      var1.ge7(b<"k">(25643, 8617580666952817883L ^ var2), (short)this.ze3);
      int[] var4 = var10000;
      qhg var5 = new qhg();
      int var6 = 0;

      String var10001;
      label46: {
         while (true) {
            if (var6 < this.uzr.length) {
               label41: {
                  try {
                     var11 = this;
                     if (var4 != null) {
                        break;
                     }

                     if (this.uzr[var6] == null) {
                        break label41;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }

                  bdo var7 = new bdo();
                  var7.atr(b<"k">(23573, 1671069143238288609L ^ var2), (byte)var6);
                  this.uzr[var6].zy4(var7);
                  var5.w2j(var7);
               }

               var6++;
               if (var4 == null) {
                  continue;
               }
            }

            try {
               var12 = var1;
               var10001 = b<"k">(31292, 8878087492810015424L ^ var2);
               if (var4 != null) {
                  break label46;
               }

               var1.rzm(var10001, var5);
               var11 = this;
               break;
            } catch (oov var9) {
               throw a(var9);
            }
         }

         try {
            if (!var11.qrh()) {
               return;
            }

            var12 = var1;
            var10001 = b<"k">(30334, 5524216504146267791L ^ var2);
         } catch (oov var8) {
            throw a(var8);
         }
      }

      var12.rjq(var10001, this.tx1);
   }

   @Override
   public erg ibn(int var1) {
      int[] var2 = TileEntityBeacon$yv7.b();

      int var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 != null) {
               break label27;
            }

            if (var1 < 0) {
               return null;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      try {
         if (var10000 < this.uzr.length) {
            return this.uzr[var1];
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return null;
   }

   @Override
   public erg afc(int var1, int var2) {
      int[] var3 = TileEntityBeacon$yv7.b();

      int var10000;
      label22: {
         try {
            var10000 = var1;
            if (var3 != null) {
               break label22;
            }

            if (var1 < 0) {
               return null;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = var1;
      }

      if (var10000 < this.uzr.length) {
         erg var4 = this.uzr[var1];
         this.uzr[var1] = null;
         return var4;
      } else {
         return null;
      }
   }

   @Override
   public erg yvk(int var1) {
      int[] var2 = TileEntityBeacon$yv7.b();

      int var10000;
      label22: {
         try {
            var10000 = var1;
            if (var2 != null) {
               break label22;
            }

            if (var1 < 0) {
               return null;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      if (var10000 < this.uzr.length) {
         erg var3 = this.uzr[var1];
         this.uzr[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void cxl(int var1, erg var2) {
      int[] var3 = TileEntityBeacon$yv7.b();

      int var10000;
      label26: {
         try {
            var10000 = var1;
            if (var3 != null) {
               break label26;
            }

            if (var1 < 0) {
               return;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = var1;
      }

      try {
         if (var10000 < this.uzr.length) {
            this.uzr[var1] = var2;
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   @Override
   public int v6l() {
      return 64;
   }

   @Override
   public boolean dnv(ha9 var1) {
      int[] var2 = TileEntityBeacon$yv7.b();

      try {
         if (this.yh_.getTileEntity(this.al2) != this) {
            return (boolean)0;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      try {
         double var5;
         int var10000 = (var5 = var1.p53((double)this.al2.getX() + 0.5, (double)this.al2.getY() + 0.5, (double)this.al2.getZ() + 0.5) - 64.0) == 0.0
            ? 0
            : (var5 < 0.0 ? -1 : 1);
         if (var2 != null) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   @Override
   public void dk0(ha9 var1) {
   }

   @Override
   public void vhz(ha9 var1) {
   }

   @Override
   public boolean er2(int param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 3
      // 04: iload 1
      // 05: aload 3
      // 06: ifnonnull 23
      // 09: bipush 3
      // 0a: if_icmpne 26
      // 0d: goto 14
      // 10: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 13: athrow
      // 14: aload 2
      // 15: invokevirtual erg.gn1 ()Lu7m;
      // 18: aload 2
      // 19: invokevirtual u7m.shg (Lerg;)Z
      // 1c: goto 23
      // 1f: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 22: athrow
      // 23: goto 55
      // 26: aload 2
      // 27: invokevirtual erg.gn1 ()Lu7m;
      // 2a: getstatic xbr.ik6 Ldgn;
      // 2d: aload 3
      // 2e: ifnonnull 49
      // 31: if_acmpeq 4c
      // 34: goto 3b
      // 37: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 2
      // 3c: invokevirtual erg.gn1 ()Lu7m;
      // 3f: getstatic xbr.fvb Lu7m;
      // 42: goto 49
      // 45: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 48: athrow
      // 49: if_acmpne 54
      // 4c: bipush 1
      // 4d: goto 55
      // 50: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 53: athrow
      // 54: bipush 0
      // 55: ireturn
   }

   public boolean[] jsl() {
      boolean[] var2 = new boolean[3];
      int[] var10000 = TileEntityBeacon$yv7.b();
      int var3 = 0;
      int[] var1 = var10000;

      while (var3 < 3) {
         try {
            if (this.uzr[var3] != null) {
               var2[var3] = true;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var3++;
         if (var1 != null) {
            break;
         }
      }

      return var2;
   }

   @Override
   public int[] ik0(vt2 var1) {
      try {
         if (var1 == vt2.rf3) {
            return uvm;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return gak;
   }

   @Override
   public boolean dy9(int var1, erg var2, vt2 var3) {
      return this.er2(var1, var2);
   }

   @Override
   public boolean kfc(int var1, erg var2, vt2 var3) {
      return true;
   }

   @Override
   public String q4l() {
      long var1 = a ^ 63739856360012L;
      return b<"k">(15605, 6749365154581807429L ^ var1);
   }

   @Override
   public _jc b_f(jnq var1, ha9 var2) {
      return new gem(var1, this);
   }

   @Override
   public int czu(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 2
      // 04: iload 1
      // 05: aload 2
      // 06: ifnonnull 2a
      // 09: lookupswitch 32 1 0 23
      // 1c: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield net/minecraft/tileentity/TileEntityBrewingStand.ze3 I
      // 24: ireturn
      // 25: invokestatic net/minecraft/tileentity/TileEntityBrewingStand.a (Loov;)Loov;
      // 28: athrow
      // 29: bipush 0
      // 2a: ireturn
   }

   @Override
   public void r8i(int var1, int var2) {
      try {
         switch (var1) {
            case 0:
               this.ze3 = var2;
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   @Override
   public int xa3() {
      return 1;
   }

   @Override
   public void nec() {
      int[] var1 = TileEntityBeacon$yv7.b();
      int var2 = 0;

      while (var2 < this.uzr.length) {
         this.uzr[var2] = null;
         var2++;
         if (var1 != null) {
            break;
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6367046378816234523L, -8205343880693538777L, MethodHandles.lookup().lookupClass()).a(174462975096364L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 101836002152776L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "\u0019\u0082l\u0005QVIP@J `\u0080=I\u001c\u0010ät\u0099Ê¼;Â\\y'ü\u0083C³±\u0019(ë=\u007fÜg\u0092ÈÕýn\u009bÿ³1Z\u000f\u0095ÙóÔ\u0081+ïXÊD½*=\u0087WSü°é\u001b j\u0083ê\u0010`\u000e0R\u0083MXT?[L¢}`þf\u0018 ½\"?l\u001aB\u0086p¢ÇÒ*o\u0011\u000b )ÕmD\u009eai =O©ð³\u0014eUÛ&\u0094´òë8Ó ìNR¥TÖ\u0004\u0080Ên#³Êdü  Õ»¾\u009cXe_,\u001e\u0001\u0089ÕòJ¡Îã\u0013¤YL\u000bIX\u008f¼\u008a\u001b´¦á(\u009a³ ézv5ÍÝXL\u008f\u0088j\u0010£\u0099°^?Ý\u008c\u0013\u009c¦\u007fØC\u0083wô\u008cmYZÿ\u009a_½l";
      int var8 = "\u0019\u0082l\u0005QVIP@J `\u0080=I\u001c\u0010ät\u0099Ê¼;Â\\y'ü\u0083C³±\u0019(ë=\u007fÜg\u0092ÈÕýn\u009bÿ³1Z\u000f\u0095ÙóÔ\u0081+ïXÊD½*=\u0087WSü°é\u001b j\u0083ê\u0010`\u000e0R\u0083MXT?[L¢}`þf\u0018 ½\"?l\u001aB\u0086p¢ÇÒ*o\u0011\u000b )ÕmD\u009eai =O©ð³\u0014eUÛ&\u0094´òë8Ó ìNR¥TÖ\u0004\u0080Ên#³Êdü  Õ»¾\u009cXe_,\u001e\u0001\u0089ÕòJ¡Îã\u0013¤YL\u000bIX\u008f¼\u008a\u001b´¦á(\u009a³ ézv5ÍÝXL\u008f\u0088j\u0010£\u0099°^?Ý\u008c\u0013\u009c¦\u007fØC\u0083wô\u008cmYZÿ\u009a_½l"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     g = new String[10];
                     uvm = new int[]{3};
                     gak = new int[]{0, 1, 2};
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

                  var6 = "\u0010f2ÜÒ\u0098-7°0\u0098DßLËÙ\u0018\u0012ÄÉ]¾ù<\u0084Uñ(«\u0002\u0010|ÉÀoBý\u0098Ö¿g";
                  var8 = "\u0010f2ÜÒ\u0098-7°0\u0098DßLËÙ\u0018\u0012ÄÉ]¾ù<\u0084Uñ(«\u0002\u0010|ÉÀoBý\u0098Ö¿g".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26886;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/tileentity/TileEntityBrewingStand", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntityBrewingStand" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
