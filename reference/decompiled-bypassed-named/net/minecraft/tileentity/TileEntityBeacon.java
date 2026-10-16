package net.minecraft.tileentity;

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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

public class TileEntityBeacon extends TileEntityLockable implements xcy, rsi {
   public static final mcs[][] llb;
   public final List yvt = Lists.newArrayList();
   private long ec_;
   private float s6x;
   public boolean b0f;
   public int ijl = -1;
   public int urt;
   public int nhy;
   private erg _g7;
   private String abk;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public void _21() {
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
      // 05: aload 1
      // 06: ifnonnull 27
      // 09: getfield net/minecraft/tileentity/TileEntityBeacon.yh_ Lt9d;
      // 0c: invokevirtual OpaquePredicate.p2b ()J
      // 0f: ldc2_w 80
      // 12: lrem
      // 13: lconst_0
      // 14: lcmp
      // 15: ifne 2a
      // 18: goto 1f
      // 1b: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 27
      // 23: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 26: athrow
      // 27: invokevirtual net/minecraft/tileentity/TileEntityBeacon.l8u ()V
      // 2a: return
   }

   public void l8u() {
      this._79();
      this.lo3();
   }

   private void lo3() {
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
      // 005: getfield net/minecraft/tileentity/TileEntityBeacon.b0f Z
      // 008: aload 1
      // 009: ifnonnull 021
      // 00c: ifeq 1c6
      // 00f: goto 016
      // 012: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield net/minecraft/tileentity/TileEntityBeacon.ijl I
      // 01a: goto 021
      // 01d: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 1
      // 022: ifnonnull 03d
      // 025: ifle 1c6
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield net/minecraft/tileentity/TileEntityBeacon.yh_ Lt9d;
      // 033: getfield OpaquePredicate.v0f Z
      // 036: goto 03d
      // 039: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 1
      // 03e: ifnonnull 056
      // 041: ifne 1c6
      // 044: goto 04b
      // 047: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield net/minecraft/tileentity/TileEntityBeacon.urt I
      // 04f: goto 056
      // 052: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 1
      // 057: ifnonnull 075
      // 05a: ifle 1c6
      // 05d: goto 064
      // 060: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 063: athrow
      // 064: aload 0
      // 065: getfield net/minecraft/tileentity/TileEntityBeacon.ijl I
      // 068: bipush 10
      // 06a: imul
      // 06b: bipush 10
      // 06d: iadd
      // 06e: goto 075
      // 071: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 074: athrow
      // 075: i2d
      // 076: dstore 2
      // 077: bipush 0
      // 078: istore 4
      // 07a: aload 0
      // 07b: getfield net/minecraft/tileentity/TileEntityBeacon.ijl I
      // 07e: aload 1
      // 07f: ifnonnull 0b4
      // 082: bipush 4
      // 083: if_icmplt 0ad
      // 086: goto 08d
      // 089: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield net/minecraft/tileentity/TileEntityBeacon.urt I
      // 091: aload 1
      // 092: ifnonnull 0b4
      // 095: goto 09c
      // 098: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 0
      // 09d: getfield net/minecraft/tileentity/TileEntityBeacon.nhy I
      // 0a0: if_icmpne 0ad
      // 0a3: goto 0aa
      // 0a6: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: bipush 1
      // 0ab: istore 4
      // 0ad: aload 0
      // 0ae: getfield net/minecraft/tileentity/TileEntityBeacon.al2 Lmew;
      // 0b1: invokevirtual mew.getX ()I
      // 0b4: istore 5
      // 0b6: aload 0
      // 0b7: getfield net/minecraft/tileentity/TileEntityBeacon.al2 Lmew;
      // 0ba: invokevirtual mew.getY ()I
      // 0bd: istore 6
      // 0bf: aload 0
      // 0c0: getfield net/minecraft/tileentity/TileEntityBeacon.al2 Lmew;
      // 0c3: invokevirtual mew.getZ ()I
      // 0c6: istore 7
      // 0c8: new nh4
      // 0cb: dup
      // 0cc: iload 5
      // 0ce: i2d
      // 0cf: iload 6
      // 0d1: i2d
      // 0d2: iload 7
      // 0d4: i2d
      // 0d5: iload 5
      // 0d7: bipush 1
      // 0d8: iadd
      // 0d9: i2d
      // 0da: iload 6
      // 0dc: bipush 1
      // 0dd: iadd
      // 0de: i2d
      // 0df: iload 7
      // 0e1: bipush 1
      // 0e2: iadd
      // 0e3: i2d
      // 0e4: invokespecial nh4.<init> (DDDDDD)V
      // 0e7: dload 2
      // 0e8: dload 2
      // 0e9: dload 2
      // 0ea: invokevirtual nh4.c2h (DDD)Lnh4;
      // 0ed: dconst_0
      // 0ee: aload 0
      // 0ef: getfield net/minecraft/tileentity/TileEntityBeacon.yh_ Lt9d;
      // 0f2: invokevirtual OpaquePredicate._1d ()I
      // 0f5: i2d
      // 0f6: dconst_0
      // 0f7: invokevirtual nh4.z9h (DDD)Lnh4;
      // 0fa: astore 8
      // 0fc: aload 0
      // 0fd: getfield net/minecraft/tileentity/TileEntityBeacon.yh_ Lt9d;
      // 100: ldc ha9
      // 102: nop
      // 103: aload 8
      // 105: invokevirtual OpaquePredicate.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 108: astore 9
      // 10a: aload 9
      // 10c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 111: astore 10
      // 113: aload 10
      // 115: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11a: ifeq 14f
      // 11d: aload 10
      // 11f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 124: checkcast ha9
      // 127: astore 11
      // 129: aload 11
      // 12b: new sdj
      // 12e: dup
      // 12f: aload 0
      // 130: getfield net/minecraft/tileentity/TileEntityBeacon.urt I
      // 133: sipush 180
      // 136: iload 4
      // 138: bipush 1
      // 139: bipush 1
      // 13a: invokespecial sdj.<init> (IIIZZ)V
      // 13d: invokevirtual ha9.gmn (Lsdj;)V
      // 140: aload 1
      // 141: ifnonnull 1c6
      // 144: aload 1
      // 145: ifnull 113
      // 148: goto 14f
      // 14b: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 14e: athrow
      // 14f: aload 0
      // 150: getfield net/minecraft/tileentity/TileEntityBeacon.ijl I
      // 153: bipush 4
      // 154: aload 1
      // 155: ifnonnull 17c
      // 158: if_icmplt 1c6
      // 15b: goto 162
      // 15e: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 161: athrow
      // 162: aload 0
      // 163: getfield net/minecraft/tileentity/TileEntityBeacon.urt I
      // 166: aload 1
      // 167: ifnonnull 18a
      // 16a: goto 171
      // 16d: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 170: athrow
      // 171: aload 0
      // 172: getfield net/minecraft/tileentity/TileEntityBeacon.nhy I
      // 175: goto 17c
      // 178: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 17b: athrow
      // 17c: if_icmpeq 1c6
      // 17f: aload 0
      // 180: getfield net/minecraft/tileentity/TileEntityBeacon.nhy I
      // 183: goto 18a
      // 186: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 189: athrow
      // 18a: ifle 1c6
      // 18d: aload 9
      // 18f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 194: astore 10
      // 196: aload 10
      // 198: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19d: ifeq 1c6
      // 1a0: aload 10
      // 1a2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a7: checkcast ha9
      // 1aa: astore 11
      // 1ac: aload 11
      // 1ae: new sdj
      // 1b1: dup
      // 1b2: aload 0
      // 1b3: getfield net/minecraft/tileentity/TileEntityBeacon.nhy I
      // 1b6: sipush 180
      // 1b9: bipush 0
      // 1ba: bipush 1
      // 1bb: bipush 1
      // 1bc: invokespecial sdj.<init> (IIIZZ)V
      // 1bf: invokevirtual ha9.gmn (Lsdj;)V
      // 1c2: aload 1
      // 1c3: ifnull 196
      // 1c6: return
   }

   private void _79() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield net/minecraft/tileentity/TileEntityBeacon.ijl I
      // 004: istore 2
      // 005: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 008: aload 0
      // 009: getfield net/minecraft/tileentity/TileEntityBeacon.al2 Lmew;
      // 00c: invokevirtual mew.getX ()I
      // 00f: istore 3
      // 010: aload 0
      // 011: getfield net/minecraft/tileentity/TileEntityBeacon.al2 Lmew;
      // 014: invokevirtual mew.getY ()I
      // 017: istore 4
      // 019: astore 1
      // 01a: aload 0
      // 01b: getfield net/minecraft/tileentity/TileEntityBeacon.al2 Lmew;
      // 01e: invokevirtual mew.getZ ()I
      // 021: istore 5
      // 023: aload 0
      // 024: bipush 0
      // 025: putfield net/minecraft/tileentity/TileEntityBeacon.ijl I
      // 028: aload 0
      // 029: getfield net/minecraft/tileentity/TileEntityBeacon.yvt Ljava/util/List;
      // 02c: invokeinterface java/util/List.clear ()V 1
      // 031: aload 0
      // 032: bipush 1
      // 033: putfield net/minecraft/tileentity/TileEntityBeacon.b0f Z
      // 036: new net/minecraft/tileentity/TileEntityBeacon$yv7
      // 039: dup
      // 03a: getstatic qvg.ft3 Lqvg;
      // 03d: invokestatic EntityZombie.kn7 (Lqvg;)[F
      // 040: invokespecial net/minecraft/tileentity/TileEntityBeacon$yv7.<init> ([F)V
      // 043: astore 6
      // 045: aload 0
      // 046: getfield net/minecraft/tileentity/TileEntityBeacon.yvt Ljava/util/List;
      // 049: aload 6
      // 04b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 050: pop
      // 051: bipush 1
      // 052: istore 7
      // 054: new mew$mix
      // 057: dup
      // 058: invokespecial mew$mix.<init> ()V
      // 05b: astore 8
      // 05d: iload 4
      // 05f: bipush 1
      // 060: iadd
      // 061: istore 9
      // 063: iload 9
      // 065: sipush 256
      // 068: if_icmpge 1de
      // 06b: aload 0
      // 06c: getfield net/minecraft/tileentity/TileEntityBeacon.yh_ Lt9d;
      // 06f: aload 8
      // 071: iload 3
      // 072: iload 9
      // 074: iload 5
      // 076: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 079: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 07c: astore 10
      // 07e: aload 1
      // 07f: ifnonnull 327
      // 082: aload 10
      // 084: invokeinterface zfz.r_y ()Le0x; 1
      // 089: aload 1
      // 08a: ifnonnull 0d0
      // 08d: goto 094
      // 090: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 093: athrow
      // 094: getstatic ox_.dh_ Lowm;
      // 097: if_acmpne 0b7
      // 09a: goto 0a1
      // 09d: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 10
      // 0a3: getstatic owm.vcc Lzb_;
      // 0a6: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0ab: checkcast qvg
      // 0ae: invokestatic EntityZombie.kn7 (Lqvg;)[F
      // 0b1: astore 11
      // 0b3: aload 1
      // 0b4: ifnull 14d
      // 0b7: aload 10
      // 0b9: aload 1
      // 0ba: ifnonnull 13d
      // 0bd: goto 0c4
      // 0c0: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: invokeinterface zfz.r_y ()Le0x; 1
      // 0c9: goto 0d0
      // 0cc: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: getstatic ox_.pse Ljgy;
      // 0d3: if_acmpeq 134
      // 0d6: aload 10
      // 0d8: invokeinterface zfz.r_y ()Le0x; 1
      // 0dd: aload 1
      // 0de: ifnonnull 105
      // 0e1: goto 0e8
      // 0e4: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: invokevirtual e0x.uhw ()I
      // 0eb: bipush 15
      // 0ed: if_icmplt 124
      // 0f0: goto 0f7
      // 0f3: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 10
      // 0f9: invokeinterface zfz.r_y ()Le0x; 1
      // 0fe: goto 105
      // 101: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 104: athrow
      // 105: getstatic ox_.n6z Le0x;
      // 108: if_acmpeq 124
      // 10b: aload 0
      // 10c: bipush 0
      // 10d: putfield net/minecraft/tileentity/TileEntityBeacon.b0f Z
      // 110: aload 0
      // 111: getfield net/minecraft/tileentity/TileEntityBeacon.yvt Ljava/util/List;
      // 114: invokeinterface java/util/List.clear ()V 1
      // 119: aload 1
      // 11a: ifnull 1de
      // 11d: goto 124
      // 120: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 123: athrow
      // 124: aload 6
      // 126: invokevirtual net/minecraft/tileentity/TileEntityBeacon$yv7.h9w ()V
      // 129: aload 1
      // 12a: ifnull 1d7
      // 12d: goto 134
      // 130: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 133: athrow
      // 134: aload 10
      // 136: goto 13d
      // 139: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 13c: athrow
      // 13d: getstatic jgy.kcr Lzb_;
      // 140: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 145: checkcast qvg
      // 148: invokestatic EntityZombie.kn7 (Lqvg;)[F
      // 14b: astore 11
      // 14d: iload 7
      // 14f: aload 1
      // 150: ifnonnull 19f
      // 153: ifne 195
      // 156: goto 15d
      // 159: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 15c: athrow
      // 15d: bipush 3
      // 15e: newarray 6
      // 160: dup
      // 161: bipush 0
      // 162: aload 6
      // 164: invokevirtual net/minecraft/tileentity/TileEntityBeacon$yv7.tow ()[F
      // 167: bipush 0
      // 168: faload
      // 169: aload 11
      // 16b: bipush 0
      // 16c: faload
      // 16d: fadd
      // 16e: fconst_2
      // 16f: fdiv
      // 170: fastore
      // 171: dup
      // 172: bipush 1
      // 173: aload 6
      // 175: invokevirtual net/minecraft/tileentity/TileEntityBeacon$yv7.tow ()[F
      // 178: bipush 1
      // 179: faload
      // 17a: aload 11
      // 17c: bipush 1
      // 17d: faload
      // 17e: fadd
      // 17f: fconst_2
      // 180: fdiv
      // 181: fastore
      // 182: dup
      // 183: bipush 2
      // 184: aload 6
      // 186: invokevirtual net/minecraft/tileentity/TileEntityBeacon$yv7.tow ()[F
      // 189: bipush 2
      // 18a: faload
      // 18b: aload 11
      // 18d: bipush 2
      // 18e: faload
      // 18f: fadd
      // 190: fconst_2
      // 191: fdiv
      // 192: fastore
      // 193: astore 11
      // 195: aload 11
      // 197: aload 6
      // 199: invokevirtual net/minecraft/tileentity/TileEntityBeacon$yv7.tow ()[F
      // 19c: invokestatic java/util/Arrays.equals ([F[F)Z
      // 19f: aload 1
      // 1a0: ifnonnull 1d3
      // 1a3: ifeq 1bd
      // 1a6: goto 1ad
      // 1a9: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: aload 6
      // 1af: invokevirtual net/minecraft/tileentity/TileEntityBeacon$yv7.h9w ()V
      // 1b2: aload 1
      // 1b3: ifnull 1d4
      // 1b6: goto 1bd
      // 1b9: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: new net/minecraft/tileentity/TileEntityBeacon$yv7
      // 1c0: dup
      // 1c1: aload 11
      // 1c3: invokespecial net/minecraft/tileentity/TileEntityBeacon$yv7.<init> ([F)V
      // 1c6: astore 6
      // 1c8: aload 0
      // 1c9: getfield net/minecraft/tileentity/TileEntityBeacon.yvt Ljava/util/List;
      // 1cc: aload 6
      // 1ce: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d3: pop
      // 1d4: bipush 0
      // 1d5: istore 7
      // 1d7: iinc 9 1
      // 1da: aload 1
      // 1db: ifnull 063
      // 1de: aload 0
      // 1df: getfield net/minecraft/tileentity/TileEntityBeacon.b0f Z
      // 1e2: aload 1
      // 1e3: ifnonnull 32e
      // 1e6: ifeq 327
      // 1e9: goto 1f0
      // 1ec: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: bipush 1
      // 1f1: istore 9
      // 1f3: iload 9
      // 1f5: bipush 4
      // 1f6: if_icmpgt 309
      // 1f9: iload 4
      // 1fb: iload 9
      // 1fd: isub
      // 1fe: istore 10
      // 200: iload 10
      // 202: aload 1
      // 203: ifnonnull 30d
      // 206: aload 1
      // 207: ifnonnull 21f
      // 20a: goto 211
      // 20d: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 210: athrow
      // 211: ifge 21e
      // 214: goto 21b
      // 217: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 21a: athrow
      // 21b: goto 309
      // 21e: bipush 1
      // 21f: istore 11
      // 221: iload 3
      // 222: iload 9
      // 224: isub
      // 225: istore 12
      // 227: iload 12
      // 229: iload 3
      // 22a: iload 9
      // 22c: iadd
      // 22d: if_icmpgt 2f4
      // 230: iload 11
      // 232: aload 1
      // 233: ifnonnull 2f6
      // 236: aload 1
      // 237: ifnonnull 2f6
      // 23a: goto 241
      // 23d: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 240: athrow
      // 241: ifeq 2f4
      // 244: goto 24b
      // 247: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 24a: athrow
      // 24b: iload 5
      // 24d: iload 9
      // 24f: isub
      // 250: istore 13
      // 252: iload 13
      // 254: iload 5
      // 256: iload 9
      // 258: iadd
      // 259: if_icmpgt 2ed
      // 25c: aload 0
      // 25d: getfield net/minecraft/tileentity/TileEntityBeacon.yh_ Lt9d;
      // 260: new mew
      // 263: dup
      // 264: iload 12
      // 266: iload 10
      // 268: iload 13
      // 26a: invokespecial mew.<init> (III)V
      // 26d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 270: invokeinterface zfz.r_y ()Le0x; 1
      // 275: astore 14
      // 277: aload 1
      // 278: ifnonnull 2f0
      // 27b: aload 1
      // 27c: ifnonnull 2e9
      // 27f: goto 286
      // 282: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 285: athrow
      // 286: aload 14
      // 288: getstatic ox_.mo3 Le0x;
      // 28b: if_acmpeq 2df
      // 28e: goto 295
      // 291: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 294: athrow
      // 295: aload 14
      // 297: getstatic ox_.pkt Le0x;
      // 29a: aload 1
      // 29b: ifnonnull 2bb
      // 29e: goto 2a5
      // 2a1: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 2a4: athrow
      // 2a5: if_acmpeq 2df
      // 2a8: goto 2af
      // 2ab: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 2ae: athrow
      // 2af: aload 14
      // 2b1: getstatic ox_.fad Le0x;
      // 2b4: goto 2bb
      // 2b7: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 2ba: athrow
      // 2bb: aload 1
      // 2bc: ifnonnull 2d5
      // 2bf: if_acmpeq 2df
      // 2c2: goto 2c9
      // 2c5: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 2c8: athrow
      // 2c9: aload 14
      // 2cb: getstatic ox_.rq4 Le0x;
      // 2ce: goto 2d5
      // 2d1: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 2d4: athrow
      // 2d5: if_acmpeq 2df
      // 2d8: bipush 0
      // 2d9: istore 11
      // 2db: aload 1
      // 2dc: ifnull 2ed
      // 2df: iinc 13 1
      // 2e2: goto 2e9
      // 2e5: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 2e8: athrow
      // 2e9: aload 1
      // 2ea: ifnull 252
      // 2ed: iinc 12 1
      // 2f0: aload 1
      // 2f1: ifnull 227
      // 2f4: iload 11
      // 2f6: ifne 2fc
      // 2f9: goto 309
      // 2fc: aload 0
      // 2fd: iload 9
      // 2ff: iinc 9 1
      // 302: putfield net/minecraft/tileentity/TileEntityBeacon.ijl I
      // 305: aload 1
      // 306: ifnull 1f3
      // 309: aload 0
      // 30a: getfield net/minecraft/tileentity/TileEntityBeacon.ijl I
      // 30d: aload 1
      // 30e: ifnonnull 32e
      // 311: ifne 327
      // 314: goto 31b
      // 317: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 31a: athrow
      // 31b: aload 0
      // 31c: bipush 0
      // 31d: putfield net/minecraft/tileentity/TileEntityBeacon.b0f Z
      // 320: goto 327
      // 323: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 326: athrow
      // 327: aload 0
      // 328: getfield net/minecraft/tileentity/TileEntityBeacon.yh_ Lt9d;
      // 32b: getfield OpaquePredicate.v0f Z
      // 32e: aload 1
      // 32f: ifnonnull 347
      // 332: ifne 3bd
      // 335: goto 33c
      // 338: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 33b: athrow
      // 33c: aload 0
      // 33d: getfield net/minecraft/tileentity/TileEntityBeacon.ijl I
      // 340: goto 347
      // 343: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 346: athrow
      // 347: bipush 4
      // 348: aload 1
      // 349: ifnonnull 362
      // 34c: if_icmpne 3bd
      // 34f: goto 356
      // 352: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 355: athrow
      // 356: iload 2
      // 357: aload 0
      // 358: getfield net/minecraft/tileentity/TileEntityBeacon.ijl I
      // 35b: goto 362
      // 35e: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 361: athrow
      // 362: if_icmpge 3bd
      // 365: aload 0
      // 366: getfield net/minecraft/tileentity/TileEntityBeacon.yh_ Lt9d;
      // 369: ldc ha9
      // 36b: nop
      // 36c: new nh4
      // 36f: dup
      // 370: iload 3
      // 371: i2d
      // 372: iload 4
      // 374: i2d
      // 375: iload 5
      // 377: i2d
      // 378: iload 3
      // 379: i2d
      // 37a: iload 4
      // 37c: bipush 4
      // 37d: isub
      // 37e: i2d
      // 37f: iload 5
      // 381: i2d
      // 382: invokespecial nh4.<init> (DDDDDD)V
      // 385: ldc2_w 10.0
      // 388: ldc2_w 5.0
      // 38b: ldc2_w 10.0
      // 38e: invokevirtual nh4.c2h (DDD)Lnh4;
      // 391: invokevirtual OpaquePredicate.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 394: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 399: astore 9
      // 39b: aload 9
      // 39d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3a2: ifeq 3bd
      // 3a5: aload 9
      // 3a7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3ac: checkcast ha9
      // 3af: astore 10
      // 3b1: aload 10
      // 3b3: getstatic y8d.kto Ll7l;
      // 3b6: invokevirtual ha9.aex (L_ss;)V
      // 3b9: aload 1
      // 3ba: ifnull 39b
      // 3bd: return
   }

   public List tsd() {
      return this.yvt;
   }

   public float ywb() {
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
      // 05: getfield net/minecraft/tileentity/TileEntityBeacon.b0f Z
      // 08: aload 1
      // 09: ifnonnull 29
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 15: athrow
      // 16: fconst_0
      // 17: freturn
      // 18: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield net/minecraft/tileentity/TileEntityBeacon.yh_ Lt9d;
      // 20: invokevirtual OpaquePredicate.p2b ()J
      // 23: aload 0
      // 24: getfield net/minecraft/tileentity/TileEntityBeacon.ec_ J
      // 27: lsub
      // 28: l2i
      // 29: istore 2
      // 2a: aload 0
      // 2b: aload 0
      // 2c: getfield net/minecraft/tileentity/TileEntityBeacon.yh_ Lt9d;
      // 2f: invokevirtual OpaquePredicate.p2b ()J
      // 32: putfield net/minecraft/tileentity/TileEntityBeacon.ec_ J
      // 35: iload 2
      // 36: aload 1
      // 37: ifnonnull 98
      // 3a: bipush 1
      // 3b: if_icmple 7b
      // 3e: goto 45
      // 41: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 0
      // 46: dup
      // 47: getfield net/minecraft/tileentity/TileEntityBeacon.s6x F
      // 4a: iload 2
      // 4b: i2f
      // 4c: ldc 40.0
      // 4e: nop
      // 4f: fdiv
      // 50: fsub
      // 51: putfield net/minecraft/tileentity/TileEntityBeacon.s6x F
      // 54: aload 0
      // 55: getfield net/minecraft/tileentity/TileEntityBeacon.s6x F
      // 58: fconst_0
      // 59: fcmpg
      // 5a: aload 1
      // 5b: ifnonnull 98
      // 5e: goto 65
      // 61: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 64: athrow
      // 65: ifge 7b
      // 68: goto 6f
      // 6b: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 0
      // 70: fconst_0
      // 71: putfield net/minecraft/tileentity/TileEntityBeacon.s6x F
      // 74: goto 7b
      // 77: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 0
      // 7c: dup
      // 7d: getfield net/minecraft/tileentity/TileEntityBeacon.s6x F
      // 80: ldc 0.025
      // 82: nop
      // 83: fadd
      // 84: putfield net/minecraft/tileentity/TileEntityBeacon.s6x F
      // 87: aload 0
      // 88: getfield net/minecraft/tileentity/TileEntityBeacon.s6x F
      // 8b: aload 1
      // 8c: ifnonnull ab
      // 8f: fconst_1
      // 90: fcmpl
      // 91: goto 98
      // 94: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 97: athrow
      // 98: ifle a7
      // 9b: aload 0
      // 9c: fconst_1
      // 9d: putfield net/minecraft/tileentity/TileEntityBeacon.s6x F
      // a0: goto a7
      // a3: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // a6: athrow
      // a7: aload 0
      // a8: getfield net/minecraft/tileentity/TileEntityBeacon.s6x F
      // ab: freturn
   }

   @Override
   public mz2 ptb() {
      bdo var1 = new bdo();
      this.m2a(var1);
      return new S35PacketUpdateTileEntity(this.al2, 3, var1);
   }

   @Override
   public double g2f() {
      return 65536.0;
   }

   private int eap(int param1) {
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
      // 06: ifnonnull e3
      // 09: iflt e2
      // 0c: goto 13
      // 0f: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 1
      // 14: aload 2
      // 15: ifnonnull e3
      // 18: goto 1f
      // 1b: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic mcs.ip9 [Lmcs;
      // 22: arraylength
      // 23: if_icmpge e2
      // 26: goto 2d
      // 29: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 2c: athrow
      // 2d: getstatic mcs.ip9 [Lmcs;
      // 30: iload 1
      // 31: aaload
      // 32: aload 2
      // 33: ifnonnull 53
      // 36: goto 3d
      // 39: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 3c: athrow
      // 3d: ifnull e2
      // 40: goto 47
      // 43: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 46: athrow
      // 47: getstatic mcs.ip9 [Lmcs;
      // 4a: iload 1
      // 4b: aaload
      // 4c: goto 53
      // 4f: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 52: athrow
      // 53: astore 3
      // 54: aload 3
      // 55: getstatic mcs.uwx Lmcs;
      // 58: aload 2
      // 59: ifnonnull 71
      // 5c: if_acmpeq e0
      // 5f: goto 66
      // 62: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 3
      // 67: getstatic mcs.izk Lmcs;
      // 6a: goto 71
      // 6d: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 2
      // 72: ifnonnull 8a
      // 75: if_acmpeq e0
      // 78: goto 7f
      // 7b: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 3
      // 80: getstatic mcs.y3z Lmcs;
      // 83: goto 8a
      // 86: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 89: athrow
      // 8a: aload 2
      // 8b: ifnonnull a3
      // 8e: if_acmpeq e0
      // 91: goto 98
      // 94: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 97: athrow
      // 98: aload 3
      // 99: getstatic mcs.y0p Lmcs;
      // 9c: goto a3
      // 9f: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // a2: athrow
      // a3: aload 2
      // a4: ifnonnull bc
      // a7: if_acmpeq e0
      // aa: goto b1
      // ad: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // b0: athrow
      // b1: aload 3
      // b2: getstatic mcs.faz Lmcs;
      // b5: goto bc
      // b8: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // bb: athrow
      // bc: aload 2
      // bd: ifnonnull d5
      // c0: if_acmpeq e0
      // c3: goto ca
      // c6: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // c9: athrow
      // ca: aload 3
      // cb: getstatic mcs.kkg Lmcs;
      // ce: goto d5
      // d1: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // d4: athrow
      // d5: if_acmpeq e0
      // d8: bipush 0
      // d9: goto e1
      // dc: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // df: athrow
      // e0: iload 1
      // e1: ireturn
      // e2: bipush 0
      // e3: ireturn
   }

   @Override
   public void agl(bdo var1) {
      long var2 = a ^ 61239974095802L;
      super.agl(var1);
      this.urt = this.eap(var1.uz7(b<"m">(29057, 2567924161936223814L ^ var2)));
      this.nhy = this.eap(var1.uz7(b<"m">(10863, 2132264376523142570L ^ var2)));
      this.ijl = var1.uz7(b<"m">(8643, 2552204184423218693L ^ var2));
   }

   @Override
   public void m2a(bdo var1) {
      long var2 = a ^ 70423691890534L;
      super.m2a(var1);
      var1.iin(b<"m">(21746, 8024305985825484781L ^ var2), this.urt);
      var1.iin(b<"m">(25980, 4257749608859344484L ^ var2), this.nhy);
      var1.iin(b<"m">(20547, 5126336855936707422L ^ var2), this.ijl);
   }

   @Override
   public int opt() {
      return 1;
   }

   @Override
   public erg ibn(int var1) {
      try {
         if (var1 == 0) {
            return this._g7;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return null;
   }

   @Override
   public erg afc(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: ifne 54
      // 04: aload 0
      // 05: getfield net/minecraft/tileentity/TileEntityBeacon._g7 Lerg;
      // 08: ifnull 54
      // 0b: goto 12
      // 0e: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 11: athrow
      // 12: iload 2
      // 13: aload 0
      // 14: getfield net/minecraft/tileentity/TileEntityBeacon._g7 Lerg;
      // 17: getfield erg.qd2 I
      // 1a: if_icmplt 30
      // 1d: goto 24
      // 20: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield net/minecraft/tileentity/TileEntityBeacon._g7 Lerg;
      // 28: astore 3
      // 29: aload 0
      // 2a: aconst_null
      // 2b: putfield net/minecraft/tileentity/TileEntityBeacon._g7 Lerg;
      // 2e: aload 3
      // 2f: areturn
      // 30: aload 0
      // 31: getfield net/minecraft/tileentity/TileEntityBeacon._g7 Lerg;
      // 34: dup
      // 35: getfield erg.qd2 I
      // 38: iload 2
      // 39: isub
      // 3a: putfield erg.qd2 I
      // 3d: new erg
      // 40: dup
      // 41: aload 0
      // 42: getfield net/minecraft/tileentity/TileEntityBeacon._g7 Lerg;
      // 45: invokevirtual erg.gn1 ()Lu7m;
      // 48: iload 2
      // 49: aload 0
      // 4a: getfield net/minecraft/tileentity/TileEntityBeacon._g7 Lerg;
      // 4d: invokevirtual erg.j6_ ()I
      // 50: invokespecial erg.<init> (Lu7m;II)V
      // 53: areturn
      // 54: aconst_null
      // 55: areturn
   }

   @Override
   public erg yvk(int param1) {
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
      // 05: ifne 34
      // 08: aload 0
      // 09: getfield net/minecraft/tileentity/TileEntityBeacon._g7 Lerg;
      // 0c: aload 2
      // 0d: ifnonnull 2c
      // 10: goto 17
      // 13: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 16: athrow
      // 17: ifnull 34
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield net/minecraft/tileentity/TileEntityBeacon._g7 Lerg;
      // 25: goto 2c
      // 28: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 2b: athrow
      // 2c: astore 3
      // 2d: aload 0
      // 2e: aconst_null
      // 2f: putfield net/minecraft/tileentity/TileEntityBeacon._g7 Lerg;
      // 32: aload 3
      // 33: areturn
      // 34: aconst_null
      // 35: areturn
   }

   @Override
   public void cxl(int var1, erg var2) {
      try {
         if (var1 == 0) {
            this._g7 = var2;
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   @Override
   public String noc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntityBeacon.a J
      // 03: ldc2_w 103744405287399
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 3
      // 0c: aload 0
      // 0d: aload 3
      // 0e: ifnonnull 26
      // 11: invokevirtual net/minecraft/tileentity/TileEntityBeacon.qrh ()Z
      // 14: ifeq 2c
      // 17: goto 1e
      // 1a: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 25: athrow
      // 26: getfield net/minecraft/tileentity/TileEntityBeacon.abk Ljava/lang/String;
      // 29: goto 3a
      // 2c: sipush 24926
      // 2f: ldc2_w 637980188850922691
      // 32: lload 1
      // 33: lxor
      // 34: invokedynamic m (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBeacon.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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
      // 05: getfield net/minecraft/tileentity/TileEntityBeacon.abk Ljava/lang/String;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/tileentity/TileEntityBeacon.abk Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual java/lang/String.length ()I
      // 24: aload 1
      // 25: ifnonnull 33
      // 28: ifle 36
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public void p4t(String var1) {
      this.abk = var1;
   }

   @Override
   public int v6l() {
      return 1;
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
      // 04: aload 2
      // 05: invokevirtual erg.gn1 ()Lu7m;
      // 08: getstatic xbr.cu7 Lu7m;
      // 0b: aload 3
      // 0c: ifnonnull 27
      // 0f: if_acmpeq 62
      // 12: goto 19
      // 15: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 2
      // 1a: invokevirtual erg.gn1 ()Lu7m;
      // 1d: getstatic xbr.exg Lu7m;
      // 20: goto 27
      // 23: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 3
      // 28: ifnonnull 43
      // 2b: if_acmpeq 62
      // 2e: goto 35
      // 31: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 2
      // 36: invokevirtual erg.gn1 ()Lu7m;
      // 39: getstatic xbr.jtr Lu7m;
      // 3c: goto 43
      // 3f: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 3
      // 44: ifnonnull 5f
      // 47: if_acmpeq 62
      // 4a: goto 51
      // 4d: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 2
      // 52: invokevirtual erg.gn1 ()Lu7m;
      // 55: getstatic xbr.icz Lu7m;
      // 58: goto 5f
      // 5b: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 5e: athrow
      // 5f: if_acmpne 6a
      // 62: bipush 1
      // 63: goto 6b
      // 66: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 69: athrow
      // 6a: bipush 0
      // 6b: ireturn
   }

   @Override
   public String q4l() {
      long var1 = a ^ 95813634247200L;
      return b<"m">(23010, 8167544290827331514L ^ var1);
   }

   @Override
   public _jc b_f(jnq var1, ha9 var2) {
      return new je4(var1, this);
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
      // 06: ifnonnull 3c
      // 09: tableswitch 50 0 2 31 40 45
      // 24: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getfield net/minecraft/tileentity/TileEntityBeacon.ijl I
      // 2c: ireturn
      // 2d: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: getfield net/minecraft/tileentity/TileEntityBeacon.urt I
      // 35: ireturn
      // 36: aload 0
      // 37: getfield net/minecraft/tileentity/TileEntityBeacon.nhy I
      // 3a: ireturn
      // 3b: bipush 0
      // 3c: ireturn
   }

   @Override
   public void r8i(int param1, int param2) {
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
      // 05: tableswitch 79 0 2 27 43 63
      // 20: aload 0
      // 21: iload 2
      // 22: putfield net/minecraft/tileentity/TileEntityBeacon.ijl I
      // 25: aload 3
      // 26: ifnull 54
      // 29: goto 30
      // 2c: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: aload 0
      // 32: iload 2
      // 33: invokespecial net/minecraft/tileentity/TileEntityBeacon.eap (I)I
      // 36: putfield net/minecraft/tileentity/TileEntityBeacon.urt I
      // 39: aload 3
      // 3a: ifnull 54
      // 3d: goto 44
      // 40: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: aload 0
      // 46: iload 2
      // 47: invokespecial net/minecraft/tileentity/TileEntityBeacon.eap (I)I
      // 4a: putfield net/minecraft/tileentity/TileEntityBeacon.nhy I
      // 4d: goto 54
      // 50: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 53: athrow
      // 54: return
   }

   @Override
   public int xa3() {
      return 3;
   }

   @Override
   public void nec() {
      this._g7 = null;
   }

   @Override
   public boolean hjo(int param1, int param2) {
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
      // 06: ifnonnull 24
      // 09: bipush 1
      // 0a: if_icmpne 1e
      // 0d: goto 14
      // 10: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 13: athrow
      // 14: aload 0
      // 15: invokevirtual net/minecraft/tileentity/TileEntityBeacon.l8u ()V
      // 18: bipush 1
      // 19: ireturn
      // 1a: invokestatic net/minecraft/tileentity/TileEntityBeacon.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: iload 1
      // 20: iload 2
      // 21: invokespecial net/minecraft/tileentity/TileEntityLockable.hjo (II)Z
      // 24: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6001154596125481635L, -7221194933630927854L, MethodHandles.lookup().lookupClass()).a(261730831104912L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 64403265067992L;
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
      String var6 = "¥>\u000e¡ø\u0084j\u0081\u00807º\u0006Å8§\u0016(\u0098\u0092Ãþ¿Y{á×Å\u008a¯\u0010&\u0012NC}\u0081øNuíÖµ\u0019÷G\u009dn¹Gd+õýj\u0092Ó©\u0010äM\rCö¿\u0019\u007fâ\\Ücê«y©(ùá¨¿\u0099QÛ\u008cå£ô¤#\u008bq\u008ePªQ¿æq àõ\u0094{\u0083ÂòóÏòß\u0096,S>?;\u0010\u0000Ýg5\u009e8ã\t½¥´NØÇ\u0091$\u0010!ËÓCñý·êR\u0017uýÃªô\u0090";
      int var8 = "¥>\u000e¡ø\u0084j\u0081\u00807º\u0006Å8§\u0016(\u0098\u0092Ãþ¿Y{á×Å\u008a¯\u0010&\u0012NC}\u0081øNuíÖµ\u0019÷G\u009dn¹Gd+õýj\u0092Ó©\u0010äM\rCö¿\u0019\u007fâ\\Ücê«y©(ùá¨¿\u0099QÛ\u008cå£ô¤#\u008bq\u008ePªQ¿æq àõ\u0094{\u0083ÂòóÏòß\u0096,S>?;\u0010\u0000Ýg5\u009e8ã\t½¥´NØÇ\u0091$\u0010!ËÓCñý·êR\u0017uýÃªô\u0090"
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
                     g = new String[8];
                     llb = new mcs[][]{{mcs.uwx, mcs.izk}, {mcs.y3z, mcs.y0p}, {mcs.faz}, {mcs.kkg}};
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

                  var6 = "¥\u008cÙ\u0019\u001f2\u00130kOm;\u008cÁþãjî²usd\u000b\u0004§\u008aó\u0013\u0017§Âí\u0018X{\u00ad_]þ\u0083á¡Ì!.BB[\u008e\u009f\u0097¥ºí£Ä\\";
                  var8 = "¥\u008cÙ\u0019\u001f2\u00130kOm;\u008cÁþãjî²usd\u000b\u0004§\u008aó\u0013\u0017§Âí\u0018X{\u00ad_]þ\u0083á¡Ì!.BB[\u008e\u009f\u0097¥ºí£Ä\\"
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27373;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntityBeacon", var10);
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntityBeacon" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
