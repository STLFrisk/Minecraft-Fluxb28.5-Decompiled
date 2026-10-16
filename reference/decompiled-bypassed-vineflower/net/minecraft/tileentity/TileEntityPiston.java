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

public class TileEntityPiston extends pyk implements xcy {
   private zfz eyc;
   private vt2 fft;
   private boolean ehv;
   private boolean g1u;
   private float wzi;
   private float c0n;
   private List bg2 = Lists.newArrayList();
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public TileEntityPiston() {
   }

   public TileEntityPiston(zfz var1, vt2 var2, boolean var3, boolean var4) {
      this.eyc = var1;
      this.fft = var2;
      this.ehv = var3;
      this.g1u = var4;
   }

   public zfz x1g() {
      return this.eyc;
   }

   @Override
   public int hvh() {
      return 0;
   }

   public boolean _2v() {
      return this.ehv;
   }

   public vt2 mja() {
      return this.fft;
   }

   public boolean s1i() {
      return this.g1u;
   }

   public float vnk(float var1) {
      int[] var2 = TileEntityBeacon$yv7.b();

      try {
         if (var2 != null) {
            return var1 + 1.0F;
         }

         if (!(var1 > 1.0F)) {
            return this.c0n + (this.wzi - this.c0n) * var1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      var1 = 1.0F;
      return this.c0n + (this.wzi - this.c0n) * var1;
   }

   public float oam(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 1e
      // 09: getfield net/minecraft/tileentity/TileEntityPiston.ehv Z
      // 0c: ifeq 30
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 1d: athrow
      // 1e: fload 1
      // 1f: invokevirtual net/minecraft/tileentity/TileEntityPiston.vnk (F)F
      // 22: fconst_1
      // 23: fsub
      // 24: aload 0
      // 25: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 28: invokevirtual vt2.n67 ()I
      // 2b: i2f
      // 2c: fmul
      // 2d: goto 40
      // 30: fconst_1
      // 31: aload 0
      // 32: fload 1
      // 33: invokevirtual net/minecraft/tileentity/TileEntityPiston.vnk (F)F
      // 36: fsub
      // 37: aload 0
      // 38: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 3b: invokevirtual vt2.n67 ()I
      // 3e: i2f
      // 3f: fmul
      // 40: freturn
   }

   public float v12(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 1e
      // 09: getfield net/minecraft/tileentity/TileEntityPiston.ehv Z
      // 0c: ifeq 30
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 1d: athrow
      // 1e: fload 1
      // 1f: invokevirtual net/minecraft/tileentity/TileEntityPiston.vnk (F)F
      // 22: fconst_1
      // 23: fsub
      // 24: aload 0
      // 25: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 28: invokevirtual vt2.g5t ()I
      // 2b: i2f
      // 2c: fmul
      // 2d: goto 40
      // 30: fconst_1
      // 31: aload 0
      // 32: fload 1
      // 33: invokevirtual net/minecraft/tileentity/TileEntityPiston.vnk (F)F
      // 36: fsub
      // 37: aload 0
      // 38: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 3b: invokevirtual vt2.g5t ()I
      // 3e: i2f
      // 3f: fmul
      // 40: freturn
   }

   public float owx(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 1e
      // 09: getfield net/minecraft/tileentity/TileEntityPiston.ehv Z
      // 0c: ifeq 30
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 1d: athrow
      // 1e: fload 1
      // 1f: invokevirtual net/minecraft/tileentity/TileEntityPiston.vnk (F)F
      // 22: fconst_1
      // 23: fsub
      // 24: aload 0
      // 25: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 28: invokevirtual vt2.ozy ()I
      // 2b: i2f
      // 2c: fmul
      // 2d: goto 40
      // 30: fconst_1
      // 31: aload 0
      // 32: fload 1
      // 33: invokevirtual net/minecraft/tileentity/TileEntityPiston.vnk (F)F
      // 36: fsub
      // 37: aload 0
      // 38: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 3b: invokevirtual vt2.ozy ()I
      // 3e: i2f
      // 3f: fmul
      // 40: freturn
   }

   private void b_a(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 003: astore 3
      // 004: aload 0
      // 005: getfield net/minecraft/tileentity/TileEntityPiston.ehv Z
      // 008: ifeq 013
      // 00b: fconst_1
      // 00c: fload 1
      // 00d: fsub
      // 00e: fstore 1
      // 00f: aload 3
      // 010: ifnull 017
      // 013: fload 1
      // 014: fconst_1
      // 015: fsub
      // 016: fstore 1
      // 017: getstatic ox_.bn4 Lmyw;
      // 01a: aload 0
      // 01b: getfield net/minecraft/tileentity/TileEntityPiston.yh_ Lt9d;
      // 01e: aload 0
      // 01f: getfield net/minecraft/tileentity/TileEntityPiston.al2 Lmew;
      // 022: aload 0
      // 023: getfield net/minecraft/tileentity/TileEntityPiston.eyc Lzfz;
      // 026: fload 1
      // 027: aload 0
      // 028: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 02b: invokevirtual myw.kfw (Lt9d;Lmew;Lzfz;FLvt2;)Lnh4;
      // 02e: astore 4
      // 030: aload 4
      // 032: ifnull 17e
      // 035: aload 0
      // 036: getfield net/minecraft/tileentity/TileEntityPiston.yh_ Lt9d;
      // 039: aconst_null
      // 03a: checkcast i2h
      // 03d: aload 4
      // 03f: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 042: astore 5
      // 044: aload 5
      // 046: invokeinterface java/util/List.isEmpty ()Z 1
      // 04b: aload 3
      // 04c: ifnonnull 06b
      // 04f: ifne 17e
      // 052: goto 059
      // 055: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 058: athrow
      // 059: aload 0
      // 05a: getfield net/minecraft/tileentity/TileEntityPiston.bg2 Ljava/util/List;
      // 05d: aload 5
      // 05f: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 064: goto 06b
      // 067: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 06a: athrow
      // 06b: pop
      // 06c: aload 0
      // 06d: getfield net/minecraft/tileentity/TileEntityPiston.bg2 Ljava/util/List;
      // 070: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 075: astore 6
      // 077: aload 6
      // 079: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07e: ifeq 175
      // 081: aload 6
      // 083: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 088: checkcast i2h
      // 08b: astore 7
      // 08d: aload 0
      // 08e: aload 3
      // 08f: ifnonnull 176
      // 092: aload 3
      // 093: ifnonnull 0ba
      // 096: goto 09d
      // 099: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 09c: athrow
      // 09d: getfield net/minecraft/tileentity/TileEntityPiston.eyc Lzfz;
      // 0a0: invokeinterface zfz.r_y ()Le0x; 1
      // 0a5: getstatic ox_.ehh Le0x;
      // 0a8: if_acmpne 144
      // 0ab: goto 0b2
      // 0ae: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: goto 0ba
      // 0b6: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: getfield net/minecraft/tileentity/TileEntityPiston.ehv Z
      // 0bd: aload 3
      // 0be: ifnonnull 0e0
      // 0c1: ifeq 144
      // 0c4: goto 0cb
      // 0c7: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: getstatic net/minecraft/tileentity/TileEntityPiston$1.wjk [I
      // 0ce: aload 0
      // 0cf: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 0d2: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 0d5: invokevirtual vt2$y0s.ordinal ()I
      // 0d8: iaload
      // 0d9: goto 0e0
      // 0dc: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: tableswitch 96 1 3 28 52 76
      // 0fc: aload 7
      // 0fe: aload 0
      // 0ff: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 102: invokevirtual vt2.n67 ()I
      // 105: i2d
      // 106: putfield i2h.icv D
      // 109: aload 3
      // 10a: ifnull 140
      // 10d: goto 114
      // 110: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 113: athrow
      // 114: aload 7
      // 116: aload 0
      // 117: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 11a: invokevirtual vt2.g5t ()I
      // 11d: i2d
      // 11e: putfield i2h.mop D
      // 121: aload 3
      // 122: ifnull 140
      // 125: goto 12c
      // 128: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 12b: athrow
      // 12c: aload 7
      // 12e: aload 0
      // 12f: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 132: invokevirtual vt2.ozy ()I
      // 135: i2d
      // 136: putfield i2h.bw4 D
      // 139: goto 140
      // 13c: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 13f: athrow
      // 140: aload 3
      // 141: ifnull 171
      // 144: aload 7
      // 146: fload 2
      // 147: aload 0
      // 148: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 14b: invokevirtual vt2.n67 ()I
      // 14e: i2f
      // 14f: fmul
      // 150: f2d
      // 151: fload 2
      // 152: aload 0
      // 153: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 156: invokevirtual vt2.g5t ()I
      // 159: i2f
      // 15a: fmul
      // 15b: f2d
      // 15c: fload 2
      // 15d: aload 0
      // 15e: getfield net/minecraft/tileentity/TileEntityPiston.fft Lvt2;
      // 161: invokevirtual vt2.ozy ()I
      // 164: i2f
      // 165: fmul
      // 166: f2d
      // 167: invokevirtual i2h.vjj (DDD)V
      // 16a: goto 171
      // 16d: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 170: athrow
      // 171: aload 3
      // 172: ifnull 077
      // 175: aload 0
      // 176: getfield net/minecraft/tileentity/TileEntityPiston.bg2 Ljava/util/List;
      // 179: invokeinterface java/util/List.clear ()V 1
      // 17e: return
   }

   public void jm_() {
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
      // 06: ifnonnull 20
      // 09: getfield net/minecraft/tileentity/TileEntityPiston.c0n F
      // 0c: fconst_1
      // 0d: fcmpg
      // 0e: ifge 9e
      // 11: goto 18
      // 14: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: goto 20
      // 1c: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 1f: athrow
      // 20: getfield net/minecraft/tileentity/TileEntityPiston.yh_ Lt9d;
      // 23: aload 1
      // 24: ifnonnull 55
      // 27: ifnull 9e
      // 2a: goto 31
      // 2d: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: aload 0
      // 33: fconst_1
      // 34: dup_x1
      // 35: putfield net/minecraft/tileentity/TileEntityPiston.wzi F
      // 38: putfield net/minecraft/tileentity/TileEntityPiston.c0n F
      // 3b: aload 0
      // 3c: getfield net/minecraft/tileentity/TileEntityPiston.yh_ Lt9d;
      // 3f: aload 0
      // 40: getfield net/minecraft/tileentity/TileEntityPiston.al2 Lmew;
      // 43: invokevirtual t9d._jj (Lmew;)V
      // 46: aload 0
      // 47: invokevirtual net/minecraft/tileentity/TileEntityPiston.whd ()V
      // 4a: aload 0
      // 4b: getfield net/minecraft/tileentity/TileEntityPiston.yh_ Lt9d;
      // 4e: goto 55
      // 51: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: getfield net/minecraft/tileentity/TileEntityPiston.al2 Lmew;
      // 59: aload 1
      // 5a: ifnonnull 92
      // 5d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 60: invokeinterface zfz.r_y ()Le0x; 1
      // 65: getstatic ox_.bn4 Lmyw;
      // 68: if_acmpne 9e
      // 6b: goto 72
      // 6e: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: getfield net/minecraft/tileentity/TileEntityPiston.yh_ Lt9d;
      // 76: aload 0
      // 77: getfield net/minecraft/tileentity/TileEntityPiston.al2 Lmew;
      // 7a: aload 0
      // 7b: getfield net/minecraft/tileentity/TileEntityPiston.eyc Lzfz;
      // 7e: bipush 3
      // 7f: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 82: pop
      // 83: aload 0
      // 84: getfield net/minecraft/tileentity/TileEntityPiston.yh_ Lt9d;
      // 87: aload 0
      // 88: getfield net/minecraft/tileentity/TileEntityPiston.al2 Lmew;
      // 8b: goto 92
      // 8e: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 91: athrow
      // 92: aload 0
      // 93: getfield net/minecraft/tileentity/TileEntityPiston.eyc Lzfz;
      // 96: invokeinterface zfz.r_y ()Le0x; 1
      // 9b: invokevirtual t9d.hfy (Lmew;Le0x;)V
      // 9e: return
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
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 0
      // 06: getfield net/minecraft/tileentity/TileEntityPiston.wzi F
      // 09: putfield net/minecraft/tileentity/TileEntityPiston.c0n F
      // 0c: aload 0
      // 0d: getfield net/minecraft/tileentity/TileEntityPiston.c0n F
      // 10: fconst_1
      // 11: fcmpl
      // 12: aload 1
      // 13: ifnonnull a8
      // 16: iflt 8f
      // 19: goto 20
      // 1c: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: fconst_1
      // 22: ldc 0.25
      // 24: nop
      // 25: invokespecial net/minecraft/tileentity/TileEntityPiston.b_a (FF)V
      // 28: aload 0
      // 29: getfield net/minecraft/tileentity/TileEntityPiston.yh_ Lt9d;
      // 2c: aload 0
      // 2d: getfield net/minecraft/tileentity/TileEntityPiston.al2 Lmew;
      // 30: invokevirtual t9d._jj (Lmew;)V
      // 33: aload 0
      // 34: invokevirtual net/minecraft/tileentity/TileEntityPiston.whd ()V
      // 37: aload 0
      // 38: getfield net/minecraft/tileentity/TileEntityPiston.yh_ Lt9d;
      // 3b: aload 0
      // 3c: getfield net/minecraft/tileentity/TileEntityPiston.al2 Lmew;
      // 3f: aload 1
      // 40: ifnonnull 7f
      // 43: goto 4a
      // 46: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 49: athrow
      // 4a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 4d: invokeinterface zfz.r_y ()Le0x; 1
      // 52: getstatic ox_.bn4 Lmyw;
      // 55: if_acmpne e9
      // 58: goto 5f
      // 5b: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield net/minecraft/tileentity/TileEntityPiston.yh_ Lt9d;
      // 63: aload 0
      // 64: getfield net/minecraft/tileentity/TileEntityPiston.al2 Lmew;
      // 67: aload 0
      // 68: getfield net/minecraft/tileentity/TileEntityPiston.eyc Lzfz;
      // 6b: bipush 3
      // 6c: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 6f: pop
      // 70: aload 0
      // 71: getfield net/minecraft/tileentity/TileEntityPiston.yh_ Lt9d;
      // 74: aload 0
      // 75: getfield net/minecraft/tileentity/TileEntityPiston.al2 Lmew;
      // 78: goto 7f
      // 7b: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 0
      // 80: getfield net/minecraft/tileentity/TileEntityPiston.eyc Lzfz;
      // 83: invokeinterface zfz.r_y ()Le0x; 1
      // 88: invokevirtual t9d.hfy (Lmew;Le0x;)V
      // 8b: aload 1
      // 8c: ifnull e9
      // 8f: aload 0
      // 90: dup
      // 91: getfield net/minecraft/tileentity/TileEntityPiston.wzi F
      // 94: ldc 0.5
      // 96: nop
      // 97: fadd
      // 98: putfield net/minecraft/tileentity/TileEntityPiston.wzi F
      // 9b: aload 0
      // 9c: getfield net/minecraft/tileentity/TileEntityPiston.wzi F
      // 9f: fconst_1
      // a0: fcmpl
      // a1: goto a8
      // a4: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // a7: athrow
      // a8: aload 1
      // a9: ifnonnull d1
      // ac: iflt c2
      // af: goto b6
      // b2: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // b5: athrow
      // b6: aload 0
      // b7: fconst_1
      // b8: putfield net/minecraft/tileentity/TileEntityPiston.wzi F
      // bb: goto c2
      // be: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // c1: athrow
      // c2: aload 0
      // c3: aload 1
      // c4: ifnonnull d5
      // c7: getfield net/minecraft/tileentity/TileEntityPiston.ehv Z
      // ca: goto d1
      // cd: invokestatic net/minecraft/tileentity/TileEntityPiston.a (Loov;)Loov;
      // d0: athrow
      // d1: ifeq e9
      // d4: aload 0
      // d5: aload 0
      // d6: getfield net/minecraft/tileentity/TileEntityPiston.wzi F
      // d9: aload 0
      // da: getfield net/minecraft/tileentity/TileEntityPiston.wzi F
      // dd: aload 0
      // de: getfield net/minecraft/tileentity/TileEntityPiston.c0n F
      // e1: fsub
      // e2: ldc 0.0625
      // e4: nop
      // e5: fadd
      // e6: invokespecial net/minecraft/tileentity/TileEntityPiston.b_a (FF)V
      // e9: return
   }

   @Override
   public void agl(bdo var1) {
      long var2 = a ^ 32492176921875L;
      super.agl(var1);
      this.eyc = e0x.csc(var1.uz7(b<"z">(8057, 5413683784520439796L ^ var2))).kig(var1.uz7(b<"z">(18885, 7834973200070721858L ^ var2)));
      this.fft = vt2.jw6(var1.uz7(b<"z">(30001, 8753209339289238970L ^ var2)));
      this.c0n = this.wzi = var1.blg(b<"z">(14746, 3164810370793451797L ^ var2));
      this.ehv = var1.dvl(b<"z">(24684, 17361020549720292L ^ var2));
   }

   @Override
   public void m2a(bdo var1) {
      long var2 = a ^ 116769111716303L;
      super.m2a(var1);
      var1.iin(b<"z">(16088, 3109020235351937678L ^ var2), e0x.mxb(this.eyc.r_y()));
      var1.iin(b<"z">(15195, 5002380763834537742L ^ var2), this.eyc.r_y().hvp(this.eyc));
      var1.iin(b<"z">(31608, 5496125447516559144L ^ var2), this.fft.c3s());
      var1._i9(b<"z">(13671, 1285671169477007669L ^ var2), this.c0n);
      var1.zyu(b<"z">(30370, 6699186920437455608L ^ var2), this.ehv);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5261687936294466559L, -181942567278840335L, MethodHandles.lookup().lookupClass()).a(69785972204084L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 63395703741438L;
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
      String var6 = "K ¾/ß\tNV\r\u0081NKý\tL\u0081ÀØ}=»\u001b\u0094(x°o\"}á\u000eÏ \u000f/ªõ.Mw²r=q!I\u009b[\u0003ú5\u0017½ÌVÝ¥nS*öDæ¿H\u0010úÇÖNÉÏËp\u0092|G\u0010±¯ýW\u0010¨B:Ï\u000e>ôÄ\u0010örSTûr¤\u0010Î=\nwfaÁÙ ä\u0016o\u008c¾\u00adÌ\u0010wÒ\u0083l¸¢_\u009a4r<x\u008dj»\u0005\u0018\u00886<gá\u0092\u0003T5'Q)û\u001f]Y?k«~²b\u0004F \u0092¸\u00182øp\u0097\u000e`)\\Oõ\u0005\u0016¿N\\\r÷ô\u0094\u0095\u001c\u008e^\u0094&¼\u0013¯Y";
      int var8 = "K ¾/ß\tNV\r\u0081NKý\tL\u0081ÀØ}=»\u001b\u0094(x°o\"}á\u000eÏ \u000f/ªõ.Mw²r=q!I\u009b[\u0003ú5\u0017½ÌVÝ¥nS*öDæ¿H\u0010úÇÖNÉÏËp\u0092|G\u0010±¯ýW\u0010¨B:Ï\u000e>ôÄ\u0010örSTûr¤\u0010Î=\nwfaÁÙ ä\u0016o\u008c¾\u00adÌ\u0010wÒ\u0083l¸¢_\u009a4r<x\u008dj»\u0005\u0018\u00886<gá\u0092\u0003T5'Q)û\u001f]Y?k«~²b\u0004F \u0092¸\u00182øp\u0097\u000e`)\\Oõ\u0005\u0016¿N\\\r÷ô\u0094\u0095\u001c\u008e^\u0094&¼\u0013¯Y"
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
                     g = new String[10];
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

                  var6 = "µç½oÅ¸þµ\r0\u007fì4§Ð\u0098\u008d\u0091\u0096GÐh\u001dÊ ×å½%¬¦4ÅàgÏ³\\À\u0096£\u0084\u009c\u009eèu\u0084\u0015Ñµ)[Ïà~<\u0093";
                  var8 = "µç½oÅ¸þµ\r0\u007fì4§Ð\u0098\u008d\u0091\u0096GÐh\u001dÊ ×å½%¬¦4ÅàgÏ³\\À\u0096£\u0084\u009c\u009eèu\u0084\u0015Ñµ)[Ïà~<\u0093"
                     .length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32160;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntityPiston", var10);
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntityPiston" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
