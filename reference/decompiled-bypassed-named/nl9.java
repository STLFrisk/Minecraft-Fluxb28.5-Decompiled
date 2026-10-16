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

public class nl9 extends EntityLivingBase {
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public nl9(OpaquePredicate var1) {
      super(var1);
      this.yxc(0.25F, 0.25F);
   }

   @Override
   public void tbj() {
      this.oit._i_(8, 5);
   }

   @Override
   public boolean xvv(double var1) {
      int var3 = OpaquePredicate.c();

      try {
         double var5;
         int var10000 = (var5 = var1 - 4096.0) == 0.0 ? 0 : (var5 < 0.0 ? -1 : 1);
         if (var3 != 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   public nl9(OpaquePredicate param1, double param2, double param4, double param6, erg param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nl9.b J
      // 03: ldc2_w 45310976757435
      // 06: lxor
      // 07: lstore 9
      // 09: aload 0
      // 0a: aload 1
      // 0b: invokespecial EntityLivingBase.<init> (Lt9d;)V
      // 0e: aload 0
      // 0f: bipush 0
      // 10: putfield nl9.hia I
      // 13: aload 0
      // 14: ldc 0.25
      // 16: nop
      // 17: ldc 0.25
      // 19: nop
      // 1a: invokevirtual nl9.yxc (FF)V
      // 1d: invokestatic OpaquePredicate.b ()I
      // 20: aload 0
      // 21: dload 2
      // 22: dload 4
      // 24: dload 6
      // 26: invokevirtual nl9.m6_ (DDD)V
      // 29: istore 11
      // 2b: bipush 1
      // 2c: istore 12
      // 2e: iload 11
      // 30: ifeq f5
      // 33: aload 8
      // 35: ifnull b3
      // 38: goto 3f
      // 3b: invokestatic nl9.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 8
      // 41: iload 11
      // 43: ifeq 6e
      // 46: goto 4d
      // 49: invokestatic nl9.a (Loov;)Loov;
      // 4c: athrow
      // 4d: invokevirtual erg.w8b ()Z
      // 50: ifeq b3
      // 53: goto 5a
      // 56: invokestatic nl9.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield nl9.oit Lwl1;
      // 5e: bipush 8
      // 60: aload 8
      // 62: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 65: aload 8
      // 67: goto 6e
      // 6a: invokestatic nl9.a (Loov;)Loov;
      // 6d: athrow
      // 6e: invokevirtual erg.zso ()Lbdo;
      // 71: astore 13
      // 73: aload 13
      // 75: sipush 25087
      // 78: ldc2_w 4609774873122893225
      // 7b: lload 9
      // 7d: lxor
      // 7e: invokedynamic t (IJ)Ljava/lang/String; bsm=nl9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: nop
      // 84: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 87: astore 14
      // 89: iload 11
      // 8b: ifeq f5
      // 8e: aload 14
      // 90: ifnull b3
      // 93: goto 9a
      // 96: invokestatic nl9.a (Loov;)Loov;
      // 99: athrow
      // 9a: iload 12
      // 9c: aload 14
      // 9e: sipush 19145
      // a1: ldc2_w 7633999768123917969
      // a4: lload 9
      // a6: lxor
      // a7: invokedynamic t (IJ)Ljava/lang/String; bsm=nl9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: nop
      // ad: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // b0: iadd
      // b1: istore 12
      // b3: aload 0
      // b4: aload 0
      // b5: getfield nl9.z2d Ljava/util/Random;
      // b8: invokevirtual java/util/Random.nextGaussian ()D
      // bb: ldc2_w 0.001
      // be: dmul
      // bf: putfield nl9.icv D
      // c2: aload 0
      // c3: aload 0
      // c4: getfield nl9.z2d Ljava/util/Random;
      // c7: invokevirtual java/util/Random.nextGaussian ()D
      // ca: ldc2_w 0.001
      // cd: dmul
      // ce: putfield nl9.bw4 D
      // d1: aload 0
      // d2: ldc2_w 0.05
      // d5: putfield nl9.mop D
      // d8: aload 0
      // d9: bipush 10
      // db: iload 12
      // dd: imul
      // de: aload 0
      // df: getfield nl9.z2d Ljava/util/Random;
      // e2: bipush 6
      // e4: invokevirtual java/util/Random.nextInt (I)I
      // e7: iadd
      // e8: aload 0
      // e9: getfield nl9.z2d Ljava/util/Random;
      // ec: bipush 7
      // ee: invokevirtual java/util/Random.nextInt (I)I
      // f1: iadd
      // f2: putfield nl9.f3w I
      // f5: return
   }

   @Override
   public void lmm(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dload 1
      // 02: putfield nl9.icv D
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: aload 0
      // 09: dload 3
      // 0a: putfield nl9.mop D
      // 0d: istore 7
      // 0f: aload 0
      // 10: dload 5
      // 12: putfield nl9.bw4 D
      // 15: aload 0
      // 16: getfield nl9.j25 F
      // 19: fconst_0
      // 1a: fcmpl
      // 1b: iload 7
      // 1d: ifeq 43
      // 20: ifne 8c
      // 23: goto 2a
      // 26: invokestatic nl9.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield nl9.p3h F
      // 2e: iload 7
      // 30: ifeq 59
      // 33: goto 3a
      // 36: invokestatic nl9.a (Loov;)Loov;
      // 39: athrow
      // 3a: fconst_0
      // 3b: fcmpl
      // 3c: goto 43
      // 3f: invokestatic nl9.a (Loov;)Loov;
      // 42: athrow
      // 43: ifne 8c
      // 46: dload 1
      // 47: dload 1
      // 48: dmul
      // 49: dload 5
      // 4b: dload 5
      // 4d: dmul
      // 4e: dadd
      // 4f: invokestatic fe6.dii (D)F
      // 52: goto 59
      // 55: invokestatic nl9.a (Loov;)Loov;
      // 58: athrow
      // 59: fstore 8
      // 5b: aload 0
      // 5c: aload 0
      // 5d: dload 1
      // 5e: dload 5
      // 60: invokestatic fe6.yr8 (DD)D
      // 63: ldc2_w 180.0
      // 66: dmul
      // 67: ldc2_w 3.141592653589793
      // 6a: ddiv
      // 6b: d2f
      // 6c: dup_x1
      // 6d: putfield nl9.x5k F
      // 70: putfield nl9.p3h F
      // 73: aload 0
      // 74: aload 0
      // 75: dload 3
      // 76: fload 8
      // 78: f2d
      // 79: invokestatic fe6.yr8 (DD)D
      // 7c: ldc2_w 180.0
      // 7f: dmul
      // 80: ldc2_w 3.141592653589793
      // 83: ddiv
      // 84: d2f
      // 85: dup_x1
      // 86: putfield nl9.y2i F
      // 89: putfield nl9.j25 F
      // 8c: return
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic nl9.b J
      // 003: ldc2_w 74624049490914
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: aload 0
      // 00a: getfield nl9.o2v D
      // 00d: putfield nl9.ivp D
      // 010: invokestatic OpaquePredicate.c ()I
      // 013: aload 0
      // 014: aload 0
      // 015: getfield nl9.kfp D
      // 018: putfield nl9.c54 D
      // 01b: istore 3
      // 01c: aload 0
      // 01d: aload 0
      // 01e: getfield nl9.vbd D
      // 021: putfield nl9.e2b D
      // 024: aload 0
      // 025: invokespecial EntityLivingBase.xx_ ()V
      // 028: aload 0
      // 029: dup
      // 02a: getfield nl9.icv D
      // 02d: ldc2_w 1.15
      // 030: dmul
      // 031: putfield nl9.icv D
      // 034: aload 0
      // 035: dup
      // 036: getfield nl9.bw4 D
      // 039: ldc2_w 1.15
      // 03c: dmul
      // 03d: putfield nl9.bw4 D
      // 040: aload 0
      // 041: dup
      // 042: getfield nl9.mop D
      // 045: ldc2_w 0.04
      // 048: dadd
      // 049: putfield nl9.mop D
      // 04c: aload 0
      // 04d: aload 0
      // 04e: getfield nl9.icv D
      // 051: aload 0
      // 052: getfield nl9.mop D
      // 055: aload 0
      // 056: getfield nl9.bw4 D
      // 059: invokevirtual nl9.vjj (DDD)V
      // 05c: aload 0
      // 05d: getfield nl9.icv D
      // 060: aload 0
      // 061: getfield nl9.icv D
      // 064: dmul
      // 065: aload 0
      // 066: getfield nl9.bw4 D
      // 069: aload 0
      // 06a: getfield nl9.bw4 D
      // 06d: dmul
      // 06e: dadd
      // 06f: invokestatic fe6.dii (D)F
      // 072: fstore 4
      // 074: aload 0
      // 075: aload 0
      // 076: getfield nl9.icv D
      // 079: aload 0
      // 07a: getfield nl9.bw4 D
      // 07d: invokestatic fe6.yr8 (DD)D
      // 080: ldc2_w 180.0
      // 083: dmul
      // 084: ldc2_w 3.141592653589793
      // 087: ddiv
      // 088: d2f
      // 089: putfield nl9.x5k F
      // 08c: aload 0
      // 08d: aload 0
      // 08e: getfield nl9.mop D
      // 091: fload 4
      // 093: f2d
      // 094: invokestatic fe6.yr8 (DD)D
      // 097: ldc2_w 180.0
      // 09a: dmul
      // 09b: ldc2_w 3.141592653589793
      // 09e: ddiv
      // 09f: d2f
      // 0a0: putfield nl9.y2i F
      // 0a3: aload 0
      // 0a4: getfield nl9.y2i F
      // 0a7: aload 0
      // 0a8: getfield nl9.j25 F
      // 0ab: fsub
      // 0ac: ldc -180.0
      // 0ae: nop
      // 0af: fcmpg
      // 0b0: ifge 0ce
      // 0b3: aload 0
      // 0b4: dup
      // 0b5: getfield nl9.j25 F
      // 0b8: ldc 360.0
      // 0ba: nop
      // 0bb: fsub
      // 0bc: putfield nl9.j25 F
      // 0bf: iload 3
      // 0c0: ifne 0f9
      // 0c3: iload 3
      // 0c4: ifeq 0a3
      // 0c7: goto 0ce
      // 0ca: invokestatic nl9.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: getfield nl9.y2i F
      // 0d2: aload 0
      // 0d3: getfield nl9.j25 F
      // 0d6: fsub
      // 0d7: ldc 180.0
      // 0d9: nop
      // 0da: fcmpl
      // 0db: iflt 0f9
      // 0de: aload 0
      // 0df: dup
      // 0e0: getfield nl9.j25 F
      // 0e3: ldc 360.0
      // 0e5: nop
      // 0e6: fadd
      // 0e7: putfield nl9.j25 F
      // 0ea: iload 3
      // 0eb: ifne 12b
      // 0ee: iload 3
      // 0ef: ifeq 0ce
      // 0f2: goto 0f9
      // 0f5: invokestatic nl9.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: getfield nl9.x5k F
      // 0fd: aload 0
      // 0fe: getfield nl9.p3h F
      // 101: fsub
      // 102: ldc -180.0
      // 104: nop
      // 105: fcmpg
      // 106: ifge 12b
      // 109: aload 0
      // 10a: dup
      // 10b: getfield nl9.p3h F
      // 10e: ldc 360.0
      // 110: nop
      // 111: fsub
      // 112: putfield nl9.p3h F
      // 115: iload 3
      // 116: ifne 189
      // 119: goto 120
      // 11c: invokestatic nl9.a (Loov;)Loov;
      // 11f: athrow
      // 120: iload 3
      // 121: ifeq 0f9
      // 124: goto 12b
      // 127: invokestatic nl9.a (Loov;)Loov;
      // 12a: athrow
      // 12b: aload 0
      // 12c: getfield nl9.x5k F
      // 12f: aload 0
      // 130: getfield nl9.p3h F
      // 133: fsub
      // 134: ldc 180.0
      // 136: nop
      // 137: fcmpl
      // 138: iflt 15d
      // 13b: aload 0
      // 13c: dup
      // 13d: getfield nl9.p3h F
      // 140: ldc 360.0
      // 142: nop
      // 143: fadd
      // 144: putfield nl9.p3h F
      // 147: iload 3
      // 148: ifne 189
      // 14b: goto 152
      // 14e: invokestatic nl9.a (Loov;)Loov;
      // 151: athrow
      // 152: iload 3
      // 153: ifeq 12b
      // 156: goto 15d
      // 159: invokestatic nl9.a (Loov;)Loov;
      // 15c: athrow
      // 15d: aload 0
      // 15e: aload 0
      // 15f: getfield nl9.j25 F
      // 162: aload 0
      // 163: getfield nl9.y2i F
      // 166: aload 0
      // 167: getfield nl9.j25 F
      // 16a: fsub
      // 16b: ldc 0.2
      // 16d: nop
      // 16e: fmul
      // 16f: fadd
      // 170: putfield nl9.y2i F
      // 173: aload 0
      // 174: aload 0
      // 175: getfield nl9.p3h F
      // 178: aload 0
      // 179: getfield nl9.x5k F
      // 17c: aload 0
      // 17d: getfield nl9.p3h F
      // 180: fsub
      // 181: ldc 0.2
      // 183: nop
      // 184: fmul
      // 185: fadd
      // 186: putfield nl9.x5k F
      // 189: aload 0
      // 18a: getfield nl9.hia I
      // 18d: iload 3
      // 18e: ifne 1e6
      // 191: ifne 1d5
      // 194: goto 19b
      // 197: invokestatic nl9.a (Loov;)Loov;
      // 19a: athrow
      // 19b: aload 0
      // 19c: invokevirtual nl9.o3x ()Z
      // 19f: iload 3
      // 1a0: ifne 1e6
      // 1a3: goto 1aa
      // 1a6: invokestatic nl9.a (Loov;)Loov;
      // 1a9: athrow
      // 1aa: ifne 1d5
      // 1ad: goto 1b4
      // 1b0: invokestatic nl9.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: getfield nl9.oay Lt9d;
      // 1b8: aload 0
      // 1b9: sipush 17710
      // 1bc: ldc2_w 133626676465364014
      // 1bf: lload 1
      // 1c0: lxor
      // 1c1: invokedynamic t (IJ)Ljava/lang/String; bsm=nl9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: nop
      // 1c7: ldc 3.0
      // 1c9: nop
      // 1ca: fconst_1
      // 1cb: invokevirtual OpaquePredicate.yfq (Li2h;Ljava/lang/String;FF)V
      // 1ce: goto 1d5
      // 1d1: invokestatic nl9.a (Loov;)Loov;
      // 1d4: athrow
      // 1d5: aload 0
      // 1d6: dup
      // 1d7: getfield nl9.hia I
      // 1da: bipush 1
      // 1db: iadd
      // 1dc: putfield nl9.hia I
      // 1df: aload 0
      // 1e0: getfield nl9.oay Lt9d;
      // 1e3: getfield OpaquePredicate.v0f Z
      // 1e6: iload 3
      // 1e7: ifne 25a
      // 1ea: ifeq 253
      // 1ed: goto 1f4
      // 1f0: invokestatic nl9.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: aload 0
      // 1f5: getfield nl9.hia I
      // 1f8: bipush 2
      // 1f9: irem
      // 1fa: iload 3
      // 1fb: ifne 25a
      // 1fe: goto 205
      // 201: invokestatic nl9.a (Loov;)Loov;
      // 204: athrow
      // 205: bipush 2
      // 206: if_icmpge 253
      // 209: goto 210
      // 20c: invokestatic nl9.a (Loov;)Loov;
      // 20f: athrow
      // 210: aload 0
      // 211: getfield nl9.oay Lt9d;
      // 214: getstatic w_0.dj0 Lw_0;
      // 217: aload 0
      // 218: getfield nl9.o2v D
      // 21b: aload 0
      // 21c: getfield nl9.kfp D
      // 21f: ldc2_w 0.3
      // 222: dsub
      // 223: aload 0
      // 224: getfield nl9.vbd D
      // 227: aload 0
      // 228: getfield nl9.z2d Ljava/util/Random;
      // 22b: invokevirtual java/util/Random.nextGaussian ()D
      // 22e: ldc2_w 0.05
      // 231: dmul
      // 232: aload 0
      // 233: getfield nl9.mop D
      // 236: dneg
      // 237: ldc2_w 0.5
      // 23a: dmul
      // 23b: aload 0
      // 23c: getfield nl9.z2d Ljava/util/Random;
      // 23f: invokevirtual java/util/Random.nextGaussian ()D
      // 242: ldc2_w 0.05
      // 245: dmul
      // 246: bipush 0
      // 247: newarray 10
      // 249: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 24c: goto 253
      // 24f: invokestatic nl9.a (Loov;)Loov;
      // 252: athrow
      // 253: aload 0
      // 254: getfield nl9.oay Lt9d;
      // 257: getfield OpaquePredicate.v0f Z
      // 25a: iload 3
      // 25b: ifne 27e
      // 25e: ifne 29a
      // 261: goto 268
      // 264: invokestatic nl9.a (Loov;)Loov;
      // 267: athrow
      // 268: aload 0
      // 269: iload 3
      // 26a: ifne 297
      // 26d: goto 274
      // 270: invokestatic nl9.a (Loov;)Loov;
      // 273: athrow
      // 274: getfield nl9.hia I
      // 277: goto 27e
      // 27a: invokestatic nl9.a (Loov;)Loov;
      // 27d: athrow
      // 27e: aload 0
      // 27f: getfield nl9.f3w I
      // 282: if_icmple 29a
      // 285: aload 0
      // 286: getfield nl9.oay Lt9d;
      // 289: aload 0
      // 28a: bipush 17
      // 28c: invokevirtual OpaquePredicate.qyn (Li2h;B)V
      // 28f: aload 0
      // 290: goto 297
      // 293: invokestatic nl9.a (Loov;)Loov;
      // 296: athrow
      // 297: invokevirtual nl9._kl ()V
      // 29a: return
   }

   @Override
   public void ptf(byte param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nl9.b J
      // 03: ldc2_w 88334306199752
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: iload 1
      // 0e: iload 4
      // 10: ifne 39
      // 13: bipush 17
      // 15: if_icmpne af
      // 18: goto 1f
      // 1b: invokestatic nl9.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 4
      // 22: ifne b0
      // 25: goto 2c
      // 28: invokestatic nl9.a (Loov;)Loov;
      // 2b: athrow
      // 2c: getfield nl9.oay Lt9d;
      // 2f: getfield OpaquePredicate.v0f Z
      // 32: goto 39
      // 35: invokestatic nl9.a (Loov;)Loov;
      // 38: athrow
      // 39: ifeq af
      // 3c: aload 0
      // 3d: getfield nl9.oit Lwl1;
      // 40: bipush 8
      // 42: invokevirtual wl1.qh4 (I)Lerg;
      // 45: astore 5
      // 47: aconst_null
      // 48: astore 6
      // 4a: aload 5
      // 4c: iload 4
      // 4e: ifne 5d
      // 51: ifnull 8e
      // 54: goto 5b
      // 57: invokestatic nl9.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 5
      // 5d: iload 4
      // 5f: ifne 78
      // 62: invokevirtual erg.w8b ()Z
      // 65: ifeq 8e
      // 68: goto 6f
      // 6b: invokestatic nl9.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 5
      // 71: goto 78
      // 74: invokestatic nl9.a (Loov;)Loov;
      // 77: athrow
      // 78: invokevirtual erg.zso ()Lbdo;
      // 7b: sipush 5282
      // 7e: ldc2_w 1508243378730360462
      // 81: lload 2
      // 82: lxor
      // 83: invokedynamic t (IJ)Ljava/lang/String; bsm=nl9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: nop
      // 89: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 8c: astore 6
      // 8e: aload 0
      // 8f: getfield nl9.oay Lt9d;
      // 92: aload 0
      // 93: getfield nl9.o2v D
      // 96: aload 0
      // 97: getfield nl9.kfp D
      // 9a: aload 0
      // 9b: getfield nl9.vbd D
      // 9e: aload 0
      // 9f: getfield nl9.icv D
      // a2: aload 0
      // a3: getfield nl9.mop D
      // a6: aload 0
      // a7: getfield nl9.bw4 D
      // aa: aload 6
      // ac: invokevirtual OpaquePredicate.w39 (DDDDDDLbdo;)V
      // af: aload 0
      // b0: iload 1
      // b1: invokespecial EntityLivingBase.ptf (B)V
      // b4: return
   }

   @Override
   public void srs(bdo var1) {
      long var2 = b ^ 98377908488908L;
      var1.iin(b<"t">(16878, 599415406222330311L ^ var2), this.hia);
      var1.iin(b<"t">(17835, 4028821475256520064L ^ var2), this.f3w);
      erg var4 = this.oit.qh4(8);
      if (var4 != null) {
         bdo var5 = new bdo();
         var4.zy4(var5);
         var1.rzm(b<"t">(25295, 6476149407769488099L ^ var2), var5);
      }
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = b ^ 52601019524711L;
      this.hia = var1.uz7(b<"t">(9548, 6875622389924151757L ^ var2));
      int var10000 = OpaquePredicate.c();
      this.f3w = var1.uz7(b<"t">(29364, 7678495504001308210L ^ var2));
      int var4 = var10000;
      bdo var5 = var1.b__(b<"t">(29717, 790468382830006430L ^ var2));

      label28: {
         try {
            var9 = var5;
            if (var4 != 0) {
               break label28;
            }

            if (var5 == null) {
               return;
            }
         } catch (oov var8) {
            throw a(var8);
         }

         var9 = var5;
      }

      erg var6 = erg.qog(var9);

      try {
         if (var6 != null) {
            this.oit.c66(8, var6);
         }
      } catch (oov var7) {
         throw a(var7);
      }
   }

   @Override
   public float xeu(float var1) {
      return super.xeu(var1);
   }

   @Override
   public int azk(float var1) {
      return super.azk(var1);
   }

   @Override
   public boolean qvl() {
      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3504164368989800646L, 1470476321903541556L, MethodHandles.lookup().lookupClass()).a(272254329864226L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 40973314743179L;
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
      String var6 = "Oô~XC[Ú¥R¿\u0088\u0004Èñü\u0019 ò\u0097m\u0099\u0017Gí¿\u0094eW}#ã\u001f\u0005À\u0001cÂ\u0015\u001aZ¶ù\u00863ège\u001dÕ ×÷Î@\u0012owDKMF\u0000¤\u0018sº/ù'H\u0000\b/\u0080³Ê½ØfÌ¼§\u0010Ü\u0015\u0006èÊao¶#ÅæÏÆôj\u0086\u0018\u009c\u008coW\u0093rFÊ¾©\u0004¬a!ÛçVÊÌVI\u0000óÐ\u0018\u009604\u0003h\u0015\\Ð\u001c\u0003\u0099]\u0001Õ4K\u000fÎøn£\u0088D|\u0010\u0010Ñ\u0007\u008cìBQRQã7Ü\u0012â!ó ûV\u0092È\u0095Ç\u0005\u0001\u0096p6!\u009c\u009e¶ÿ7Ûh\u0016\u0098CÊÅ\u008c\tì]\u009c<Õ\u0081";
      int var8 = "Oô~XC[Ú¥R¿\u0088\u0004Èñü\u0019 ò\u0097m\u0099\u0017Gí¿\u0094eW}#ã\u001f\u0005À\u0001cÂ\u0015\u001aZ¶ù\u00863ège\u001dÕ ×÷Î@\u0012owDKMF\u0000¤\u0018sº/ù'H\u0000\b/\u0080³Ê½ØfÌ¼§\u0010Ü\u0015\u0006èÊao¶#ÅæÏÆôj\u0086\u0018\u009c\u008coW\u0093rFÊ¾©\u0004¬a!ÛçVÊÌVI\u0000óÐ\u0018\u009604\u0003h\u0015\\Ð\u001c\u0003\u0099]\u0001Õ4K\u000fÎøn£\u0088D|\u0010\u0010Ñ\u0007\u008cìBQRQã7Ü\u0012â!ó ûV\u0092È\u0095Ç\u0005\u0001\u0096p6!\u009c\u009e¶ÿ7Ûh\u0016\u0098CÊÅ\u008c\tì]\u009c<Õ\u0081"
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
                     c = var9;
                     d = new String[10];
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

                  var6 = "1N\\³\r\u009ci\u000e÷7\u008dá/N\u0001MÂjØ¹^uzþíëè¯eÒ¹÷ y\u0091µ\u00837i:M\u0007\u00141T½\u0082\u008bw\u007fçj^±É\u0005\u0010\u0001 ]§.a³I";
                  var8 = "1N\\³\r\u009ci\u000e÷7\u008dá/N\u0001MÂjØ¹^uzþíëè¯eÒ¹÷ y\u0091µ\u00837i:M\u0007\u00141T½\u0082\u008bw\u007fçj^±É\u0005\u0010\u0001 ]§.a³I"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13381;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("nl9", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("nl9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
