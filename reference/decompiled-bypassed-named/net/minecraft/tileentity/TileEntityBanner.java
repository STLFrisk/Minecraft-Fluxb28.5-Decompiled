package net.minecraft.tileentity;

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

public class TileEntityBanner extends pyk {
   private int hb_;
   private qhg vyj;
   private boolean g5j;
   private List blu;
   private List lrg;
   private String ztf;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public void m2b(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic net/minecraft/tileentity/TileEntityBanner.a J
      // 003: ldc2_w 10151152016209
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 00b: astore 4
      // 00d: aload 0
      // 00e: aload 4
      // 010: ifnonnull 112
      // 013: aconst_null
      // 014: putfield net/minecraft/tileentity/TileEntityBanner.vyj Lqhg;
      // 017: aload 1
      // 018: invokevirtual erg.w8b ()Z
      // 01b: ifeq 10a
      // 01e: goto 025
      // 021: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 024: athrow
      // 025: aload 1
      // 026: invokevirtual erg.zso ()Lbdo;
      // 029: sipush 32733
      // 02c: ldc2_w 7830526459724707665
      // 02f: lload 2
      // 030: lxor
      // 031: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: nop
      // 037: aload 4
      // 039: ifnonnull 06b
      // 03c: goto 043
      // 03f: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 042: athrow
      // 043: bipush 10
      // 045: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 048: ifeq 10a
      // 04b: goto 052
      // 04e: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 1
      // 053: invokevirtual erg.zso ()Lbdo;
      // 056: sipush 27692
      // 059: ldc2_w 3601803679513388195
      // 05c: lload 2
      // 05d: lxor
      // 05e: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: nop
      // 064: goto 06b
      // 067: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 06a: athrow
      // 06b: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 06e: astore 5
      // 070: aload 5
      // 072: sipush 6857
      // 075: ldc2_w 6834614145455673927
      // 078: lload 2
      // 079: lxor
      // 07a: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: nop
      // 080: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 083: aload 4
      // 085: ifnonnull 0cd
      // 088: ifeq 0b8
      // 08b: goto 092
      // 08e: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 091: athrow
      // 092: aload 0
      // 093: aload 5
      // 095: sipush 21356
      // 098: ldc2_w 4254445874168896484
      // 09b: lload 2
      // 09c: lxor
      // 09d: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: nop
      // 0a3: bipush 10
      // 0a5: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 0a8: invokevirtual qhg.h33 ()Lgdw;
      // 0ab: checkcast qhg
      // 0ae: putfield net/minecraft/tileentity/TileEntityBanner.vyj Lqhg;
      // 0b1: goto 0b8
      // 0b4: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 5
      // 0ba: sipush 12268
      // 0bd: ldc2_w 9088452497161054055
      // 0c0: lload 2
      // 0c1: lxor
      // 0c2: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: nop
      // 0c8: bipush 99
      // 0ca: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0cd: ifeq 0f3
      // 0d0: aload 0
      // 0d1: aload 5
      // 0d3: sipush 25475
      // 0d6: ldc2_w 6055946103876954890
      // 0d9: lload 2
      // 0da: lxor
      // 0db: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: nop
      // 0e1: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0e4: putfield net/minecraft/tileentity/TileEntityBanner.hb_ I
      // 0e7: aload 4
      // 0e9: ifnull 105
      // 0ec: goto 0f3
      // 0ef: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: aload 1
      // 0f5: invokevirtual erg.j6_ ()I
      // 0f8: bipush 15
      // 0fa: iand
      // 0fb: putfield net/minecraft/tileentity/TileEntityBanner.hb_ I
      // 0fe: goto 105
      // 101: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 4
      // 107: ifnull 11c
      // 10a: aload 0
      // 10b: goto 112
      // 10e: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 111: athrow
      // 112: aload 1
      // 113: invokevirtual erg.j6_ ()I
      // 116: bipush 15
      // 118: iand
      // 119: putfield net/minecraft/tileentity/TileEntityBanner.hb_ I
      // 11c: aload 0
      // 11d: aconst_null
      // 11e: putfield net/minecraft/tileentity/TileEntityBanner.blu Ljava/util/List;
      // 121: aload 0
      // 122: aconst_null
      // 123: putfield net/minecraft/tileentity/TileEntityBanner.lrg Ljava/util/List;
      // 126: aload 0
      // 127: ldc ""
      // 129: nop
      // 12a: putfield net/minecraft/tileentity/TileEntityBanner.ztf Ljava/lang/String;
      // 12d: aload 0
      // 12e: bipush 1
      // 12f: putfield net/minecraft/tileentity/TileEntityBanner.g5j Z
      // 132: return
   }

   @Override
   public void m2a(bdo var1) {
      super.m2a(var1);
      ds4(var1, this.hb_, this.vyj);
   }

   public static void ds4(bdo param0, int param1, qhg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntityBanner.a J
      // 03: ldc2_w 20900171375762
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 5
      // 0d: aload 0
      // 0e: sipush 25475
      // 11: ldc2_w 6055952661025002697
      // 14: lload 3
      // 15: lxor
      // 16: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: aload 5
      // 1e: ifnonnull 46
      // 21: iload 1
      // 22: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 25: aload 2
      // 26: ifnull 4a
      // 29: goto 30
      // 2c: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: sipush 21356
      // 34: ldc2_w 4254434633224266791
      // 37: lload 3
      // 38: lxor
      // 39: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: nop
      // 3f: goto 46
      // 42: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 2
      // 47: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 4a: return
   }

   @Override
   public void agl(bdo var1) {
      long var2 = a ^ 11948563268652L;
      super.agl(var1);
      this.hb_ = var1.uz7(b<"t">(25475, 6055944035882693751L ^ var2));
      this.vyj = var1.bzb(b<"t">(21356, 4254441624331306137L ^ var2), 10);
      this.blu = null;
      this.lrg = null;
      this.ztf = null;
      this.g5j = true;
   }

   @Override
   public mz2 ptb() {
      bdo var1 = new bdo();
      this.m2a(var1);
      return new S35PacketUpdateTileEntity(this.al2, 6, var1);
   }

   public int s29() {
      return this.hb_;
   }

   public static int wsh(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntityBanner.a J
      // 03: ldc2_w 15567903698504
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 3
      // 0c: aload 0
      // 0d: sipush 27692
      // 10: ldc2_w 3601800320050975162
      // 13: lload 1
      // 14: lxor
      // 15: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: nop
      // 1b: bipush 0
      // 1c: invokevirtual erg.o4p (Ljava/lang/String;Z)Lbdo;
      // 1f: astore 4
      // 21: aload 4
      // 23: aload 3
      // 24: ifnonnull 33
      // 27: ifnull 6f
      // 2a: goto 31
      // 2d: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 4
      // 33: sipush 25475
      // 36: ldc2_w 6055949476775779859
      // 39: lload 1
      // 3a: lxor
      // 3b: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: nop
      // 41: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 44: aload 3
      // 45: ifnonnull 6c
      // 48: ifeq 6f
      // 4b: goto 52
      // 4e: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 4
      // 54: sipush 25475
      // 57: ldc2_w 6055949476775779859
      // 5a: lload 1
      // 5b: lxor
      // 5c: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 65: goto 6c
      // 68: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 6b: athrow
      // 6c: goto 73
      // 6f: aload 0
      // 70: invokevirtual erg.j6_ ()I
      // 73: ireturn
   }

   public static int v93(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntityBanner.a J
      // 03: ldc2_w 14110438221378
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 3
      // 0c: aload 0
      // 0d: sipush 27692
      // 10: ldc2_w 3601798551999355312
      // 13: lload 1
      // 14: lxor
      // 15: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: nop
      // 1b: bipush 0
      // 1c: invokevirtual erg.o4p (Ljava/lang/String;Z)Lbdo;
      // 1f: astore 4
      // 21: aload 4
      // 23: aload 3
      // 24: ifnonnull 33
      // 27: ifnull 74
      // 2a: goto 31
      // 2d: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 4
      // 33: sipush 21356
      // 36: ldc2_w 4254448185525774071
      // 39: lload 1
      // 3a: lxor
      // 3b: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: nop
      // 41: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 44: aload 3
      // 45: ifnonnull 71
      // 48: ifeq 74
      // 4b: goto 52
      // 4e: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 4
      // 54: sipush 21356
      // 57: ldc2_w 4254448185525774071
      // 5a: lload 1
      // 5b: lxor
      // 5c: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: bipush 10
      // 64: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 67: invokevirtual qhg.vek ()I
      // 6a: goto 71
      // 6d: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 70: athrow
      // 71: goto 75
      // 74: bipush 0
      // 75: ireturn
   }

   public List u88() {
      this.ctt();
      return this.blu;
   }

   public qhg jj8() {
      return this.vyj;
   }

   public List s1t() {
      this.ctt();
      return this.lrg;
   }

   public String uq3() {
      this.ctt();
      return this.ztf;
   }

   private void ctt() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic net/minecraft/tileentity/TileEntityBanner.a J
      // 003: ldc2_w 109660100654905
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 00b: astore 3
      // 00c: aload 0
      // 00d: aload 3
      // 00e: ifnonnull 058
      // 011: getfield net/minecraft/tileentity/TileEntityBanner.blu Ljava/util/List;
      // 014: ifnull 050
      // 017: goto 01e
      // 01a: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: aload 3
      // 020: ifnonnull 058
      // 023: goto 02a
      // 026: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 029: athrow
      // 02a: getfield net/minecraft/tileentity/TileEntityBanner.lrg Ljava/util/List;
      // 02d: ifnull 050
      // 030: goto 037
      // 033: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 0
      // 038: aload 3
      // 039: ifnonnull 058
      // 03c: goto 043
      // 03f: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 042: athrow
      // 043: getfield net/minecraft/tileentity/TileEntityBanner.ztf Ljava/lang/String;
      // 046: ifnonnull 17d
      // 049: goto 050
      // 04c: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 04f: athrow
      // 050: aload 0
      // 051: goto 058
      // 054: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 057: athrow
      // 058: getfield net/minecraft/tileentity/TileEntityBanner.g5j Z
      // 05b: aload 3
      // 05c: ifnonnull 0ad
      // 05f: ifne 07b
      // 062: goto 069
      // 065: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 068: athrow
      // 069: aload 0
      // 06a: ldc ""
      // 06c: nop
      // 06d: putfield net/minecraft/tileentity/TileEntityBanner.ztf Ljava/lang/String;
      // 070: aload 3
      // 071: ifnull 17d
      // 074: goto 07b
      // 077: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 0
      // 07c: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 07f: putfield net/minecraft/tileentity/TileEntityBanner.blu Ljava/util/List;
      // 082: aload 0
      // 083: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 086: putfield net/minecraft/tileentity/TileEntityBanner.lrg Ljava/util/List;
      // 089: aload 0
      // 08a: getfield net/minecraft/tileentity/TileEntityBanner.blu Ljava/util/List;
      // 08d: getstatic net/minecraft/tileentity/TileEntityBanner$swh.ise Lnet/minecraft/tileentity/TileEntityBanner$swh;
      // 090: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 095: pop
      // 096: aload 0
      // 097: getfield net/minecraft/tileentity/TileEntityBanner.lrg Ljava/util/List;
      // 09a: aload 0
      // 09b: getfield net/minecraft/tileentity/TileEntityBanner.hb_ I
      // 09e: invokestatic qvg.b7j (I)Lqvg;
      // 0a1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a6: goto 0ad
      // 0a9: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 3
      // 0ae: ifnonnull 0e3
      // 0b1: pop
      // 0b2: aload 0
      // 0b3: new java/lang/StringBuilder
      // 0b6: dup
      // 0b7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ba: ldc "b"
      // 0bc: nop
      // 0bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c0: aload 0
      // 0c1: getfield net/minecraft/tileentity/TileEntityBanner.hb_ I
      // 0c4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0c7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ca: putfield net/minecraft/tileentity/TileEntityBanner.ztf Ljava/lang/String;
      // 0cd: aload 0
      // 0ce: getfield net/minecraft/tileentity/TileEntityBanner.vyj Lqhg;
      // 0d1: ifnull 17d
      // 0d4: goto 0db
      // 0d7: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 0da: athrow
      // 0db: bipush 0
      // 0dc: goto 0e3
      // 0df: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: istore 4
      // 0e5: iload 4
      // 0e7: aload 0
      // 0e8: getfield net/minecraft/tileentity/TileEntityBanner.vyj Lqhg;
      // 0eb: invokevirtual qhg.vek ()I
      // 0ee: if_icmpge 17d
      // 0f1: aload 0
      // 0f2: getfield net/minecraft/tileentity/TileEntityBanner.vyj Lqhg;
      // 0f5: iload 4
      // 0f7: invokevirtual qhg.kd6 (I)Lbdo;
      // 0fa: astore 5
      // 0fc: aload 5
      // 0fe: sipush 8390
      // 101: ldc2_w 3575034899713279011
      // 104: lload 1
      // 105: lxor
      // 106: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: nop
      // 10c: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 10f: invokestatic net/minecraft/tileentity/TileEntityBanner$swh.sk1 (Ljava/lang/String;)Lnet/minecraft/tileentity/TileEntityBanner$swh;
      // 112: astore 6
      // 114: aload 3
      // 115: ifnonnull 179
      // 118: aload 6
      // 11a: ifnull 176
      // 11d: goto 124
      // 120: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 123: athrow
      // 124: aload 0
      // 125: getfield net/minecraft/tileentity/TileEntityBanner.blu Ljava/util/List;
      // 128: aload 6
      // 12a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 12f: pop
      // 130: aload 5
      // 132: sipush 1696
      // 135: ldc2_w 3649432679724048962
      // 138: lload 1
      // 139: lxor
      // 13a: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: nop
      // 140: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 143: istore 7
      // 145: aload 0
      // 146: getfield net/minecraft/tileentity/TileEntityBanner.lrg Ljava/util/List;
      // 149: iload 7
      // 14b: invokestatic qvg.b7j (I)Lqvg;
      // 14e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 153: pop
      // 154: aload 0
      // 155: new java/lang/StringBuilder
      // 158: dup
      // 159: invokespecial java/lang/StringBuilder.<init> ()V
      // 15c: aload 0
      // 15d: getfield net/minecraft/tileentity/TileEntityBanner.ztf Ljava/lang/String;
      // 160: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 163: aload 6
      // 165: invokevirtual net/minecraft/tileentity/TileEntityBanner$swh.rjb ()Ljava/lang/String;
      // 168: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16b: iload 7
      // 16d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 170: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 173: putfield net/minecraft/tileentity/TileEntityBanner.ztf Ljava/lang/String;
      // 176: iinc 4 1
      // 179: aload 3
      // 17a: ifnull 0e5
      // 17d: return
   }

   public static void x2u(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntityBanner.a J
      // 03: ldc2_w 18079247964140
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 3
      // 0c: aload 0
      // 0d: sipush 27692
      // 10: ldc2_w 3601811075864946718
      // 13: lload 1
      // 14: lxor
      // 15: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: nop
      // 1b: bipush 0
      // 1c: invokevirtual erg.o4p (Ljava/lang/String;Z)Lbdo;
      // 1f: astore 4
      // 21: aload 4
      // 23: aload 3
      // 24: ifnonnull 33
      // 27: ifnull e5
      // 2a: goto 31
      // 2d: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 4
      // 33: sipush 21356
      // 36: ldc2_w 4254435661125179225
      // 39: lload 1
      // 3a: lxor
      // 3b: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: nop
      // 41: bipush 9
      // 43: aload 3
      // 44: ifnonnull 6d
      // 47: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 4a: ifeq e5
      // 4d: goto 54
      // 50: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 4
      // 56: sipush 21356
      // 59: ldc2_w 4254435661125179225
      // 5c: lload 1
      // 5d: lxor
      // 5e: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: nop
      // 64: bipush 10
      // 66: goto 6d
      // 69: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 6c: athrow
      // 6d: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 70: astore 5
      // 72: aload 5
      // 74: invokevirtual qhg.vek ()I
      // 77: aload 3
      // 78: ifnonnull 9e
      // 7b: ifle e5
      // 7e: goto 85
      // 81: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 5
      // 87: aload 5
      // 89: invokevirtual qhg.vek ()I
      // 8c: bipush 1
      // 8d: isub
      // 8e: invokevirtual qhg.bf3 (I)Lgdw;
      // 91: pop
      // 92: aload 5
      // 94: invokevirtual qhg.dq5 ()Z
      // 97: goto 9e
      // 9a: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // 9d: athrow
      // 9e: aload 3
      // 9f: ifnonnull da
      // a2: ifeq e5
      // a5: goto ac
      // a8: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // ab: athrow
      // ac: aload 0
      // ad: invokevirtual erg.zso ()Lbdo;
      // b0: sipush 27692
      // b3: ldc2_w 3601811075864946718
      // b6: lload 1
      // b7: lxor
      // b8: invokedynamic t (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityBanner.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd: nop
      // be: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // c1: aload 0
      // c2: aload 3
      // c3: ifnonnull de
      // c6: goto cd
      // c9: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // cc: athrow
      // cd: invokevirtual erg.zso ()Lbdo;
      // d0: invokevirtual bdo.dq5 ()Z
      // d3: goto da
      // d6: invokestatic net/minecraft/tileentity/TileEntityBanner.a (Loov;)Loov;
      // d9: athrow
      // da: ifeq e5
      // dd: aload 0
      // de: aconst_null
      // df: checkcast bdo
      // e2: invokevirtual erg.b67 (Lbdo;)V
      // e5: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7997984887435345929L, -5411913937690914397L, MethodHandles.lookup().lookupClass()).a(276948321659313L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 110074840037522L;
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
      String var6 = "O\u0005\u0084àF]QÔ\u009a\u0093\u0083\u001f\u0006%\u0094\u0013\u0007öá1\u0089uE¹ô\u0006\u0094é\u008cXMR\u0018\u0004ïÏ[)Å.?¥/VÝ£8?ìgÒ\u0018÷rÛ\u001bM\u0010{¤©~\"ê\u0098Ô<E©aGác~\u0018Üâp(J¬\u001b_n\u008aïíG\u008fòT\u00ad\"\u008e©ÒÐ\u0082\u0099\u0010¬\u001f3vQà³cTlm\u0017\u001cgÔ\u000b\u0010U\u0000\u000eJB\u0097µN\u0089íU\n\u001c\u0082F\u0016";
      int var8 = "O\u0005\u0084àF]QÔ\u009a\u0093\u0083\u001f\u0006%\u0094\u0013\u0007öá1\u0089uE¹ô\u0006\u0094é\u008cXMR\u0018\u0004ïÏ[)Å.?¥/VÝ£8?ìgÒ\u0018÷rÛ\u001bM\u0010{¤©~\"ê\u0098Ô<E©aGác~\u0018Üâp(J¬\u001b_n\u008aïíG\u008fòT\u00ad\"\u008e©ÒÐ\u0082\u0099\u0010¬\u001f3vQà³cTlm\u0017\u001cgÔ\u000b\u0010U\u0000\u000eJB\u0097µN\u0089íU\n\u001c\u0082F\u0016"
         .length();
      char var5 = ' ';
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

                  var6 = "ý\u009a\u009c*\u0091\bªAÚ\u008dÁê/W\u0003» ÃÏûh?^ûºÑy\u0003KeE\u0014\u0097óø6ù\u001f\\Á>o÷\u001b§qn«q";
                  var8 = "ý\u009a\u009c*\u0091\bªAÚ\u008dÁê/W\u0003» ÃÏûh?^ûºÑy\u0003KeE\u0014\u0097óø6ù\u001f\\Á>o÷\u001b§qn«q".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25308;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntityBanner", var10);
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntityBanner" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
