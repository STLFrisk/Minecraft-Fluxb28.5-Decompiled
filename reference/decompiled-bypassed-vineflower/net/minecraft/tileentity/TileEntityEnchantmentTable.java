package net.minecraft.tileentity;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class TileEntityEnchantmentTable extends pyk implements xcy, _83 {
   public int tk5;
   public float r17;
   public float jbl;
   public float dik;
   public float lug;
   public float mvq;
   public float i1_;
   public float xzl;
   public float fzf;
   public float mth;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public void m2a(bdo var1) {
      long var2 = a ^ 44495755082489L;

      try {
         super.m2a(var1);
         if (this.qrh()) {
            var1.rjq(b<"i">(3412, 3035128309207525926L ^ var2), this.a33);
         }
      } catch (oov var4) {
         throw a(var4);
      }
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
      // 00: getstatic net/minecraft/tileentity/TileEntityEnchantmentTable.a J
      // 03: ldc2_w 105319986994725
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: aload 4
      // 11: ifnonnull 3e
      // 14: invokespecial pyk.agl (Lbdo;)V
      // 17: aload 1
      // 18: sipush 30397
      // 1b: ldc2_w 3164811068380771601
      // 1e: lload 2
      // 1f: lxor
      // 20: invokedynamic i (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityEnchantmentTable.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: nop
      // 26: bipush 8
      // 28: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 2b: ifeq 52
      // 2e: goto 35
      // 31: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: goto 3e
      // 3a: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 3d: athrow
      // 3e: sipush 3412
      // 41: ldc2_w 3035011235944763130
      // 44: lload 2
      // 45: lxor
      // 46: invokedynamic i (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityEnchantmentTable.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: nop
      // 4c: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 4f: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.a33 Ljava/lang/String;
      // 52: return
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
      // 000: aload 0
      // 001: aload 0
      // 002: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.mvq F
      // 005: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.i1_ F
      // 008: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.xzl F
      // 010: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.fzf F
      // 013: astore 1
      // 014: aload 0
      // 015: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.yh_ Lt9d;
      // 018: aload 0
      // 019: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.al2 Lmew;
      // 01c: invokevirtual mew.getX ()I
      // 01f: i2f
      // 020: ldc 0.5
      // 022: nop
      // 023: fadd
      // 024: f2d
      // 025: aload 0
      // 026: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.al2 Lmew;
      // 029: invokevirtual mew.getY ()I
      // 02c: i2f
      // 02d: ldc 0.5
      // 02f: nop
      // 030: fadd
      // 031: f2d
      // 032: aload 0
      // 033: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.al2 Lmew;
      // 036: invokevirtual mew.getZ ()I
      // 039: i2f
      // 03a: ldc 0.5
      // 03c: nop
      // 03d: fadd
      // 03e: f2d
      // 03f: ldc2_w 3.0
      // 042: invokevirtual t9d.z3e (DDDD)Lha9;
      // 045: astore 2
      // 046: aload 1
      // 047: ifnonnull 110
      // 04a: aload 2
      // 04b: ifnull 104
      // 04e: goto 055
      // 051: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 054: athrow
      // 055: aload 2
      // 056: getfield ha9.o2v D
      // 059: aload 0
      // 05a: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.al2 Lmew;
      // 05d: invokevirtual mew.getX ()I
      // 060: i2f
      // 061: ldc 0.5
      // 063: nop
      // 064: fadd
      // 065: f2d
      // 066: dsub
      // 067: dstore 3
      // 068: aload 2
      // 069: getfield ha9.vbd D
      // 06c: aload 0
      // 06d: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.al2 Lmew;
      // 070: invokevirtual mew.getZ ()I
      // 073: i2f
      // 074: ldc 0.5
      // 076: nop
      // 077: fadd
      // 078: f2d
      // 079: dsub
      // 07a: dstore 5
      // 07c: aload 0
      // 07d: dload 5
      // 07f: dload 3
      // 080: invokestatic fe6.yr8 (DD)D
      // 083: d2f
      // 084: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.mth F
      // 087: aload 0
      // 088: dup
      // 089: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.mvq F
      // 08c: ldc 0.1
      // 08e: nop
      // 08f: fadd
      // 090: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.mvq F
      // 093: aload 0
      // 094: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.mvq F
      // 097: aload 1
      // 098: ifnonnull 0c6
      // 09b: ldc 0.5
      // 09d: nop
      // 09e: fcmpg
      // 09f: iflt 0bb
      // 0a2: goto 0a9
      // 0a5: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: getstatic net/minecraft/tileentity/TileEntityEnchantmentTable.w85 Ljava/util/Random;
      // 0ac: bipush 40
      // 0ae: invokevirtual java/util/Random.nextInt (I)I
      // 0b1: ifne 0f2
      // 0b4: goto 0bb
      // 0b7: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.dik F
      // 0bf: goto 0c6
      // 0c2: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: fstore 7
      // 0c8: aload 0
      // 0c9: dup
      // 0ca: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.dik F
      // 0cd: getstatic net/minecraft/tileentity/TileEntityEnchantmentTable.w85 Ljava/util/Random;
      // 0d0: bipush 4
      // 0d1: invokevirtual java/util/Random.nextInt (I)I
      // 0d4: getstatic net/minecraft/tileentity/TileEntityEnchantmentTable.w85 Ljava/util/Random;
      // 0d7: bipush 4
      // 0d8: invokevirtual java/util/Random.nextInt (I)I
      // 0db: isub
      // 0dc: i2f
      // 0dd: fadd
      // 0de: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.dik F
      // 0e1: fload 7
      // 0e3: aload 0
      // 0e4: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.dik F
      // 0e7: fcmpl
      // 0e8: ifeq 0c8
      // 0eb: goto 0f2
      // 0ee: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 1
      // 0f3: ifnull 11c
      // 0f6: bipush 4
      // 0f7: anewarray 195
      // 0fa: invokestatic i2h.b ([Li2h;)V
      // 0fd: goto 104
      // 100: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 103: athrow
      // 104: aload 0
      // 105: dup
      // 106: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.mth F
      // 109: ldc 0.02
      // 10b: nop
      // 10c: fadd
      // 10d: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.mth F
      // 110: aload 0
      // 111: dup
      // 112: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.mvq F
      // 115: ldc 0.1
      // 117: nop
      // 118: fsub
      // 119: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.mvq F
      // 11c: aload 0
      // 11d: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.xzl F
      // 120: ldc 3.1415927
      // 122: nop
      // 123: fcmpl
      // 124: iflt 142
      // 127: aload 0
      // 128: dup
      // 129: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.xzl F
      // 12c: ldc 6.2831855
      // 12e: nop
      // 12f: fsub
      // 130: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.xzl F
      // 133: aload 1
      // 134: ifnonnull 168
      // 137: aload 1
      // 138: ifnull 11c
      // 13b: goto 142
      // 13e: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 141: athrow
      // 142: aload 0
      // 143: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.xzl F
      // 146: ldc -3.1415927
      // 148: nop
      // 149: fcmpg
      // 14a: ifge 168
      // 14d: aload 0
      // 14e: dup
      // 14f: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.xzl F
      // 152: ldc 6.2831855
      // 154: nop
      // 155: fadd
      // 156: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.xzl F
      // 159: aload 1
      // 15a: ifnonnull 195
      // 15d: aload 1
      // 15e: ifnull 142
      // 161: goto 168
      // 164: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 167: athrow
      // 168: aload 0
      // 169: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.mth F
      // 16c: ldc 3.1415927
      // 16e: nop
      // 16f: fcmpl
      // 170: iflt 195
      // 173: aload 0
      // 174: dup
      // 175: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.mth F
      // 178: ldc 6.2831855
      // 17a: nop
      // 17b: fsub
      // 17c: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.mth F
      // 17f: aload 1
      // 180: ifnonnull 1c2
      // 183: goto 18a
      // 186: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 189: athrow
      // 18a: aload 1
      // 18b: ifnull 168
      // 18e: goto 195
      // 191: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 194: athrow
      // 195: aload 0
      // 196: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.mth F
      // 199: ldc -3.1415927
      // 19b: nop
      // 19c: fcmpg
      // 19d: ifge 1c2
      // 1a0: aload 0
      // 1a1: aload 1
      // 1a2: ifnonnull 1c3
      // 1a5: goto 1ac
      // 1a8: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 1ab: athrow
      // 1ac: dup
      // 1ad: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.mth F
      // 1b0: ldc 6.2831855
      // 1b2: nop
      // 1b3: fadd
      // 1b4: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.mth F
      // 1b7: aload 1
      // 1b8: ifnull 195
      // 1bb: goto 1c2
      // 1be: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 1c1: athrow
      // 1c2: aload 0
      // 1c3: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.mth F
      // 1c6: aload 0
      // 1c7: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.xzl F
      // 1ca: fsub
      // 1cb: fstore 3
      // 1cc: fload 3
      // 1cd: ldc 3.1415927
      // 1cf: nop
      // 1d0: fcmpl
      // 1d1: iflt 1e9
      // 1d4: fload 3
      // 1d5: ldc 6.2831855
      // 1d7: nop
      // 1d8: fsub
      // 1d9: fstore 3
      // 1da: aload 1
      // 1db: ifnonnull 233
      // 1de: aload 1
      // 1df: ifnull 1cc
      // 1e2: goto 1e9
      // 1e5: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 1e8: athrow
      // 1e9: fload 3
      // 1ea: ldc -3.1415927
      // 1ec: nop
      // 1ed: fcmpg
      // 1ee: ifge 206
      // 1f1: fload 3
      // 1f2: ldc 6.2831855
      // 1f4: nop
      // 1f5: fadd
      // 1f6: fstore 3
      // 1f7: aload 1
      // 1f8: ifnonnull 233
      // 1fb: aload 1
      // 1fc: ifnull 1e9
      // 1ff: goto 206
      // 202: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 205: athrow
      // 206: aload 0
      // 207: dup
      // 208: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.xzl F
      // 20b: fload 3
      // 20c: ldc 0.4
      // 20e: nop
      // 20f: fmul
      // 210: fadd
      // 211: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.xzl F
      // 214: aload 0
      // 215: aload 0
      // 216: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.mvq F
      // 219: fconst_0
      // 21a: fconst_1
      // 21b: invokestatic fe6._f3 (FFF)F
      // 21e: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.mvq F
      // 221: aload 0
      // 222: dup
      // 223: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.tk5 I
      // 226: bipush 1
      // 227: iadd
      // 228: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.tk5 I
      // 22b: aload 0
      // 22c: aload 0
      // 22d: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.r17 F
      // 230: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.jbl F
      // 233: aload 0
      // 234: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.dik F
      // 237: aload 0
      // 238: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.r17 F
      // 23b: fsub
      // 23c: ldc 0.4
      // 23e: nop
      // 23f: fmul
      // 240: fstore 4
      // 242: ldc 0.2
      // 244: nop
      // 245: fstore 5
      // 247: fload 4
      // 249: fload 5
      // 24b: fneg
      // 24c: fload 5
      // 24e: invokestatic fe6._f3 (FFF)F
      // 251: fstore 4
      // 253: aload 0
      // 254: dup
      // 255: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.lug F
      // 258: fload 4
      // 25a: aload 0
      // 25b: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.lug F
      // 25e: fsub
      // 25f: ldc 0.9
      // 261: nop
      // 262: fmul
      // 263: fadd
      // 264: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.lug F
      // 267: aload 0
      // 268: dup
      // 269: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.r17 F
      // 26c: aload 0
      // 26d: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.lug F
      // 270: fadd
      // 271: putfield net/minecraft/tileentity/TileEntityEnchantmentTable.r17 F
      // 274: return
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
      // 00: getstatic net/minecraft/tileentity/TileEntityEnchantmentTable.a J
      // 03: ldc2_w 59518899963000
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 3
      // 0c: aload 0
      // 0d: aload 3
      // 0e: ifnonnull 26
      // 11: invokevirtual net/minecraft/tileentity/TileEntityEnchantmentTable.qrh ()Z
      // 14: ifeq 2c
      // 17: goto 1e
      // 1a: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 25: athrow
      // 26: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.a33 Ljava/lang/String;
      // 29: goto 3a
      // 2c: sipush 9621
      // 2f: ldc2_w 993468582318308453
      // 32: lload 1
      // 33: lxor
      // 34: invokedynamic i (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityEnchantmentTable.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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
      // 05: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.a33 Ljava/lang/String;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/tileentity/TileEntityEnchantmentTable.a33 Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual java/lang/String.length ()I
      // 24: aload 1
      // 25: ifnonnull 33
      // 28: ifle 36
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/tileentity/TileEntityEnchantmentTable.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public void nai(String var1) {
      this.a33 = var1;
   }

   @Override
   public ekw xyw() {
      try {
         if (this.qrh()) {
            return new tao(this.noc());
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return new hsu(this.noc(), new Object[0]);
   }

   @Override
   public _jc b_f(jnq var1, ha9 var2) {
      return new six(var1, this.yh_, this.al2);
   }

   @Override
   public String q4l() {
      long var1 = a ^ 69679052570559L;
      return b<"i">(23744, 6633135481990446837L ^ var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1715914998636846052L, -4539195327994302402L, MethodHandles.lookup().lookupClass()).a(63831027455048L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 80610446286312L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "\u007f\u0019Àd\u0090+®bfÒ°\u0010_èù$o+5\u0096-\u001duý\t\u009adT;\u00146:HêU÷+~Õó \u0005\u0086\u0011Ê+T}ªíÜ\u008e\u0017Èü\u0090\u008b\u008ah\u001aS#ßkò¦\u0096óÚt\bCF";
      int var8 = "\u007f\u0019Àd\u0090+®bfÒ°\u0010_èù$o+5\u0096-\u001duý\t\u009adT;\u00146:HêU÷+~Õó \u0005\u0086\u0011Ê+T}ªíÜ\u008e\u0017Èü\u0090\u008b\u008ah\u001aS#ßkò¦\u0096óÚt\bCF"
         .length();
      char var5 = '(';
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
                     g = new String[4];
                     w85 = new Random();
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

                  var6 = "¡,ü\u0006Ä\u0014\u008a\u0019\u008fÀI\u000eê£ÃÃ\u0091?\u0015 p&ÿ*Ý³;D\"Ö\"ø1f³\u0087éÅ½\u0081µîÓPcÿf\\¨t\u009aò\r\u0096sÒ\u0018î2>\r\u007f\u0090Åø´â\u0097³C\u009aÂïÄ6ê¦ ¡Ö\u0006";
                  var8 = "¡,ü\u0006Ä\u0014\u008a\u0019\u008fÀI\u000eê£ÃÃ\u0091?\u0015 p&ÿ*Ý³;D\"Ö\"ø1f³\u0087éÅ½\u0081µîÓPcÿf\\¨t\u009aò\r\u0096sÒ\u0018î2>\r\u007f\u0090Åø´â\u0097³C\u009aÂïÄ6ê¦ ¡Ö\u0006"
                     .length();
                  var5 = '8';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30339;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntityEnchantmentTable", var10);
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntityEnchantmentTable" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
