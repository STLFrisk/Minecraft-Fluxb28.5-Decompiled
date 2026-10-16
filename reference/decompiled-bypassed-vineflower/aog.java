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

public class aog extends e0x {
   public static final qx_ kx4;
   public static final h76 cv2;
   private final boolean _pp;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public aog(boolean var1) {
      super(p3y.f41);
      this.y8l(this._8_.c32().zvi(kx4, vt2.z9q).zvi(cv2, false));
      this._pp = var1;
      this.t4k(nsz);
      this.q6h(0.5F);
      this.i3l(uja.yj_);
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public void qh0(t9d var1, mew var2, zfz var3, g_3 var4, erg var5) {
      try {
         var1.vct(var2, var3.zvi(kx4, wf_(var1, var2, var4)), 2);
         if (!var1.v0f) {
            this._9w(var1, var2, var3);
         }
      } catch (oov var6) {
         throw a(var6);
      }
   }

   @Override
   public void z3l(t9d var1, mew var2, zfz var3, e0x var4) {
      try {
         if (!var1.v0f) {
            this._9w(var1, var2, var3);
         }
      } catch (oov var5) {
         throw a(var5);
      }
   }

   @Override
   public void tfc(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifeq 20
      // 0b: getfield t9d.v0f Z
      // 0e: ifne 35
      // 11: goto 18
      // 14: invokestatic aog.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: goto 20
      // 1c: invokestatic aog.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 24: ifnonnull 35
      // 27: aload 0
      // 28: aload 1
      // 29: aload 2
      // 2a: aload 3
      // 2b: invokespecial aog._9w (Lt9d;Lmew;Lzfz;)V
      // 2e: goto 35
      // 31: invokestatic aog.a (Loov;)Loov;
      // 34: athrow
      // 35: return
   }

   @Override
   public zfz qk_(t9d var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, g_3 var8) {
      return this.l4i().zvi(kx4, wf_(var1, var2, var8)).zvi(cv2, false);
   }

   private void _9w(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: getstatic aog.kx4 Lqx_;
      // 04: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 09: checkcast vt2
      // 0c: astore 5
      // 0e: invokestatic t9d.c ()I
      // 11: aload 0
      // 12: aload 1
      // 13: aload 2
      // 14: aload 5
      // 16: invokespecial aog.r3j (Lt9d;Lmew;Lvt2;)Z
      // 19: istore 6
      // 1b: istore 4
      // 1d: iload 6
      // 1f: iload 4
      // 21: ifne 86
      // 24: ifeq 7d
      // 27: goto 2e
      // 2a: invokestatic aog.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 3
      // 2f: getstatic aog.cv2 Lh76;
      // 32: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 37: checkcast java/lang/Boolean
      // 3a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3d: iload 4
      // 3f: ifne 86
      // 42: goto 49
      // 45: invokestatic aog.a (Loov;)Loov;
      // 48: athrow
      // 49: ifne 7d
      // 4c: goto 53
      // 4f: invokestatic aog.a (Loov;)Loov;
      // 52: athrow
      // 53: new cz3
      // 56: dup
      // 57: aload 1
      // 58: aload 2
      // 59: aload 5
      // 5b: bipush 1
      // 5c: invokespecial cz3.<init> (Lt9d;Lmew;Lvt2;Z)V
      // 5f: invokevirtual cz3.h2m ()Z
      // 62: ifeq e1
      // 65: goto 6c
      // 68: invokestatic aog.a (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 1
      // 6d: aload 2
      // 6e: aload 0
      // 6f: bipush 0
      // 70: aload 5
      // 72: invokevirtual vt2.c3s ()I
      // 75: invokevirtual t9d.dfj (Lmew;Le0x;II)V
      // 78: iload 4
      // 7a: ifeq e1
      // 7d: iload 6
      // 7f: goto 86
      // 82: invokestatic aog.a (Loov;)Loov;
      // 85: athrow
      // 86: iload 4
      // 88: ifne ab
      // 8b: ifne e1
      // 8e: goto 95
      // 91: invokestatic aog.a (Loov;)Loov;
      // 94: athrow
      // 95: aload 3
      // 96: getstatic aog.cv2 Lh76;
      // 99: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 9e: checkcast java/lang/Boolean
      // a1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // a4: goto ab
      // a7: invokestatic aog.a (Loov;)Loov;
      // aa: athrow
      // ab: iload 4
      // ad: ifne d4
      // b0: ifeq e1
      // b3: goto ba
      // b6: invokestatic aog.a (Loov;)Loov;
      // b9: athrow
      // ba: aload 1
      // bb: aload 2
      // bc: aload 3
      // bd: getstatic aog.cv2 Lh76;
      // c0: bipush 0
      // c1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // c4: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // c9: bipush 2
      // ca: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // cd: goto d4
      // d0: invokestatic aog.a (Loov;)Loov;
      // d3: athrow
      // d4: pop
      // d5: aload 1
      // d6: aload 2
      // d7: aload 0
      // d8: bipush 1
      // d9: aload 5
      // db: invokevirtual vt2.c3s ()I
      // de: invokevirtual t9d.dfj (Lmew;Le0x;II)V
      // e1: return
   }

   private boolean r3j(t9d param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic vt2.values ()[Lvt2;
      // 03: astore 5
      // 05: invokestatic t9d.c ()I
      // 08: aload 5
      // 0a: arraylength
      // 0b: istore 6
      // 0d: bipush 0
      // 0e: istore 7
      // 10: istore 4
      // 12: iload 7
      // 14: iload 6
      // 16: if_icmpge 6a
      // 19: aload 5
      // 1b: iload 7
      // 1d: aaload
      // 1e: astore 8
      // 20: iload 4
      // 22: ifne 83
      // 25: iload 4
      // 27: ifne 65
      // 2a: goto 31
      // 2d: invokestatic aog.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 8
      // 33: aload 3
      // 34: if_acmpeq 62
      // 37: goto 3e
      // 3a: invokestatic aog.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 1
      // 3f: aload 2
      // 40: aload 8
      // 42: invokevirtual mew.offset (Lvt2;)Lmew;
      // 45: aload 8
      // 47: invokevirtual t9d.rjp (Lmew;Lvt2;)Z
      // 4a: iload 4
      // 4c: ifne 61
      // 4f: goto 56
      // 52: invokestatic aog.a (Loov;)Loov;
      // 55: athrow
      // 56: ifeq 62
      // 59: goto 60
      // 5c: invokestatic aog.a (Loov;)Loov;
      // 5f: athrow
      // 60: bipush 1
      // 61: ireturn
      // 62: iinc 7 1
      // 65: iload 4
      // 67: ifeq 12
      // 6a: aload 1
      // 6b: aload 2
      // 6c: getstatic vt2.m3r Lvt2;
      // 6f: invokevirtual t9d.rjp (Lmew;Lvt2;)Z
      // 72: iload 4
      // 74: ifne 82
      // 77: ifeq 83
      // 7a: goto 81
      // 7d: invokestatic aog.a (Loov;)Loov;
      // 80: athrow
      // 81: bipush 1
      // 82: ireturn
      // 83: aload 2
      // 84: invokevirtual mew.nuv ()Lmew;
      // 87: astore 5
      // 89: invokestatic vt2.values ()[Lvt2;
      // 8c: astore 6
      // 8e: aload 6
      // 90: arraylength
      // 91: istore 7
      // 93: bipush 0
      // 94: istore 8
      // 96: iload 8
      // 98: iload 7
      // 9a: if_icmpge e5
      // 9d: aload 6
      // 9f: iload 8
      // a1: aaload
      // a2: astore 9
      // a4: iload 4
      // a6: ifne e0
      // a9: aload 9
      // ab: getstatic vt2.m3r Lvt2;
      // ae: if_acmpeq dd
      // b1: goto b8
      // b4: invokestatic aog.a (Loov;)Loov;
      // b7: athrow
      // b8: aload 1
      // b9: aload 5
      // bb: aload 9
      // bd: invokevirtual mew.offset (Lvt2;)Lmew;
      // c0: aload 9
      // c2: invokevirtual t9d.rjp (Lmew;Lvt2;)Z
      // c5: iload 4
      // c7: ifne dc
      // ca: goto d1
      // cd: invokestatic aog.a (Loov;)Loov;
      // d0: athrow
      // d1: ifeq dd
      // d4: goto db
      // d7: invokestatic aog.a (Loov;)Loov;
      // da: athrow
      // db: bipush 1
      // dc: ireturn
      // dd: iinc 8 1
      // e0: iload 4
      // e2: ifeq 96
      // e5: bipush 0
      // e6: ireturn
   }

   @Override
   public boolean ng5(t9d param1, mew param2, zfz param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic aog.b J
      // 003: ldc2_w 135954197870552
      // 006: lxor
      // 007: lstore 6
      // 009: invokestatic t9d.b ()I
      // 00c: istore 8
      // 00e: aload 3
      // 00f: getstatic aog.kx4 Lqx_;
      // 012: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 017: checkcast vt2
      // 01a: astore 9
      // 01c: aload 1
      // 01d: getfield t9d.v0f Z
      // 020: iload 8
      // 022: ifeq 0ae
      // 025: ifne 0ac
      // 028: goto 02f
      // 02b: invokestatic aog.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: aload 1
      // 031: aload 2
      // 032: aload 9
      // 034: invokespecial aog.r3j (Lt9d;Lmew;Lvt2;)Z
      // 037: istore 10
      // 039: iload 10
      // 03b: iload 8
      // 03d: ifeq 07f
      // 040: ifeq 07d
      // 043: goto 04a
      // 046: invokestatic aog.a (Loov;)Loov;
      // 049: athrow
      // 04a: iload 4
      // 04c: iload 8
      // 04e: ifeq 07f
      // 051: goto 058
      // 054: invokestatic aog.a (Loov;)Loov;
      // 057: athrow
      // 058: bipush 1
      // 059: if_icmpne 07d
      // 05c: goto 063
      // 05f: invokestatic aog.a (Loov;)Loov;
      // 062: athrow
      // 063: aload 1
      // 064: aload 2
      // 065: aload 3
      // 066: getstatic aog.cv2 Lh76;
      // 069: bipush 1
      // 06a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 06d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 072: bipush 2
      // 073: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 076: pop
      // 077: bipush 0
      // 078: ireturn
      // 079: invokestatic aog.a (Loov;)Loov;
      // 07c: athrow
      // 07d: iload 10
      // 07f: iload 8
      // 081: ifeq 0ae
      // 084: ifne 0ac
      // 087: goto 08e
      // 08a: invokestatic aog.a (Loov;)Loov;
      // 08d: athrow
      // 08e: iload 4
      // 090: iload 8
      // 092: ifeq 0ae
      // 095: goto 09c
      // 098: invokestatic aog.a (Loov;)Loov;
      // 09b: athrow
      // 09c: ifne 0ac
      // 09f: goto 0a6
      // 0a2: invokestatic aog.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: bipush 0
      // 0a7: ireturn
      // 0a8: invokestatic aog.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: iload 4
      // 0ae: iload 8
      // 0b0: ifeq 144
      // 0b3: ifne 13b
      // 0b6: goto 0bd
      // 0b9: invokestatic aog.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: aload 1
      // 0bf: aload 2
      // 0c0: aload 9
      // 0c2: bipush 1
      // 0c3: invokespecial aog.s8e (Lt9d;Lmew;Lvt2;Z)Z
      // 0c6: iload 8
      // 0c8: ifeq 0f5
      // 0cb: goto 0d2
      // 0ce: invokestatic aog.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: ifne 0e2
      // 0d5: goto 0dc
      // 0d8: invokestatic aog.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: bipush 0
      // 0dd: ireturn
      // 0de: invokestatic aog.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: aload 1
      // 0e3: aload 2
      // 0e4: aload 3
      // 0e5: getstatic aog.cv2 Lh76;
      // 0e8: bipush 1
      // 0e9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0ec: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0f1: bipush 2
      // 0f2: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 0f5: pop
      // 0f6: aload 1
      // 0f7: aload 2
      // 0f8: invokevirtual mew.getX ()I
      // 0fb: i2d
      // 0fc: ldc2_w 0.5
      // 0ff: dadd
      // 100: aload 2
      // 101: invokevirtual mew.getY ()I
      // 104: i2d
      // 105: ldc2_w 0.5
      // 108: dadd
      // 109: aload 2
      // 10a: invokevirtual mew.getZ ()I
      // 10d: i2d
      // 10e: ldc2_w 0.5
      // 111: dadd
      // 112: sipush 16784
      // 115: ldc2_w 8493326567002650660
      // 118: lload 6
      // 11a: lxor
      // 11b: invokedynamic b (IJ)Ljava/lang/String; bsm=aog.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: nop
      // 121: ldc 0.5
      // 123: nop
      // 124: aload 1
      // 125: getfield t9d.fsy Ljava/util/Random;
      // 128: invokevirtual java/util/Random.nextFloat ()F
      // 12b: ldc 0.25
      // 12d: nop
      // 12e: fmul
      // 12f: ldc 0.6
      // 131: nop
      // 132: fadd
      // 133: invokevirtual t9d.amg (DDDLjava/lang/String;FF)V
      // 136: iload 8
      // 138: ifne 35e
      // 13b: iload 4
      // 13d: goto 144
      // 140: invokestatic aog.a (Loov;)Loov;
      // 143: athrow
      // 144: iload 8
      // 146: ifeq 35f
      // 149: bipush 1
      // 14a: if_icmpne 35e
      // 14d: goto 154
      // 150: invokestatic aog.a (Loov;)Loov;
      // 153: athrow
      // 154: aload 1
      // 155: aload 2
      // 156: aload 9
      // 158: invokevirtual mew.offset (Lvt2;)Lmew;
      // 15b: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 15e: astore 10
      // 160: aload 10
      // 162: iload 8
      // 164: ifeq 17d
      // 167: instanceof net/minecraft/tileentity/TileEntityPiston
      // 16a: ifeq 183
      // 16d: goto 174
      // 170: invokestatic aog.a (Loov;)Loov;
      // 173: athrow
      // 174: aload 10
      // 176: goto 17d
      // 179: invokestatic aog.a (Loov;)Loov;
      // 17c: athrow
      // 17d: checkcast net/minecraft/tileentity/TileEntityPiston
      // 180: invokevirtual net/minecraft/tileentity/TileEntityPiston.jm_ ()V
      // 183: aload 1
      // 184: aload 2
      // 185: getstatic ox_.bn4 Lmyw;
      // 188: invokevirtual myw.l4i ()Lzfz;
      // 18b: getstatic myw.lw_ Lqx_;
      // 18e: aload 9
      // 190: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 195: getstatic myw._yy Lzb_;
      // 198: aload 0
      // 199: getfield aog._pp Z
      // 19c: ifeq 1a9
      // 19f: getstatic u4_$vxa.voo Lu4_$vxa;
      // 1a2: goto 1ac
      // 1a5: invokestatic aog.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: getstatic u4_$vxa.ek6 Lu4_$vxa;
      // 1ac: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1b1: bipush 3
      // 1b2: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1b5: pop
      // 1b6: aload 1
      // 1b7: aload 2
      // 1b8: aload 0
      // 1b9: iload 5
      // 1bb: invokevirtual aog.kig (I)Lzfz;
      // 1be: aload 9
      // 1c0: bipush 0
      // 1c1: bipush 1
      // 1c2: invokestatic myw.ck1 (Lzfz;Lvt2;ZZ)Lpyk;
      // 1c5: invokevirtual t9d.a_h (Lmew;Lpyk;)V
      // 1c8: aload 0
      // 1c9: getfield aog._pp Z
      // 1cc: iload 8
      // 1ce: ifeq 31d
      // 1d1: ifeq 30c
      // 1d4: goto 1db
      // 1d7: invokestatic aog.a (Loov;)Loov;
      // 1da: athrow
      // 1db: aload 2
      // 1dc: aload 9
      // 1de: invokevirtual vt2.n67 ()I
      // 1e1: bipush 2
      // 1e2: imul
      // 1e3: aload 9
      // 1e5: invokevirtual vt2.g5t ()I
      // 1e8: bipush 2
      // 1e9: imul
      // 1ea: aload 9
      // 1ec: invokevirtual vt2.ozy ()I
      // 1ef: bipush 2
      // 1f0: imul
      // 1f1: invokevirtual mew.ec4 (III)Lmew;
      // 1f4: astore 11
      // 1f6: aload 1
      // 1f7: aload 11
      // 1f9: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1fc: invokeinterface zfz.r_y ()Le0x; 1
      // 201: astore 12
      // 203: bipush 0
      // 204: istore 13
      // 206: aload 12
      // 208: getstatic ox_.bn4 Lmyw;
      // 20b: if_acmpne 26a
      // 20e: aload 1
      // 20f: aload 11
      // 211: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 214: astore 14
      // 216: aload 14
      // 218: instanceof net/minecraft/tileentity/TileEntityPiston
      // 21b: iload 8
      // 21d: ifeq 26c
      // 220: ifeq 26a
      // 223: goto 22a
      // 226: invokestatic aog.a (Loov;)Loov;
      // 229: athrow
      // 22a: aload 14
      // 22c: checkcast net/minecraft/tileentity/TileEntityPiston
      // 22f: astore 15
      // 231: aload 15
      // 233: iload 8
      // 235: ifeq 250
      // 238: invokevirtual net/minecraft/tileentity/TileEntityPiston.mja ()Lvt2;
      // 23b: aload 9
      // 23d: if_acmpne 26a
      // 240: goto 247
      // 243: invokestatic aog.a (Loov;)Loov;
      // 246: athrow
      // 247: aload 15
      // 249: goto 250
      // 24c: invokestatic aog.a (Loov;)Loov;
      // 24f: athrow
      // 250: invokevirtual net/minecraft/tileentity/TileEntityPiston._2v ()Z
      // 253: iload 8
      // 255: ifeq 26c
      // 258: ifeq 26a
      // 25b: goto 262
      // 25e: invokestatic aog.a (Loov;)Loov;
      // 261: athrow
      // 262: aload 15
      // 264: invokevirtual net/minecraft/tileentity/TileEntityPiston.jm_ ()V
      // 267: bipush 1
      // 268: istore 13
      // 26a: iload 13
      // 26c: ifne 307
      // 26f: aload 12
      // 271: iload 8
      // 273: ifeq 296
      // 276: goto 27d
      // 279: invokestatic aog.a (Loov;)Loov;
      // 27c: athrow
      // 27d: invokevirtual e0x.p1r ()Lp3y;
      // 280: getstatic p3y.cei Lp3y;
      // 283: if_acmpeq 307
      // 286: goto 28d
      // 289: invokestatic aog.a (Loov;)Loov;
      // 28c: athrow
      // 28d: aload 12
      // 28f: goto 296
      // 292: invokestatic aog.a (Loov;)Loov;
      // 295: athrow
      // 296: aload 1
      // 297: aload 11
      // 299: aload 9
      // 29b: invokevirtual vt2.b4b ()Lvt2;
      // 29e: bipush 0
      // 29f: invokestatic aog.eh5 (Le0x;Lt9d;Lmew;Lvt2;Z)Z
      // 2a2: iload 8
      // 2a4: ifeq 2bd
      // 2a7: ifeq 307
      // 2aa: goto 2b1
      // 2ad: invokestatic aog.a (Loov;)Loov;
      // 2b0: athrow
      // 2b1: aload 12
      // 2b3: invokevirtual e0x.quv ()I
      // 2b6: goto 2bd
      // 2b9: invokestatic aog.a (Loov;)Loov;
      // 2bc: athrow
      // 2bd: iload 8
      // 2bf: ifeq 306
      // 2c2: ifeq 2f6
      // 2c5: goto 2cc
      // 2c8: invokestatic aog.a (Loov;)Loov;
      // 2cb: athrow
      // 2cc: aload 12
      // 2ce: getstatic ox_.nc0 Laog;
      // 2d1: iload 8
      // 2d3: ifeq 2f3
      // 2d6: goto 2dd
      // 2d9: invokestatic aog.a (Loov;)Loov;
      // 2dc: athrow
      // 2dd: if_acmpeq 2f6
      // 2e0: goto 2e7
      // 2e3: invokestatic aog.a (Loov;)Loov;
      // 2e6: athrow
      // 2e7: aload 12
      // 2e9: getstatic ox_.wdk Laog;
      // 2ec: goto 2f3
      // 2ef: invokestatic aog.a (Loov;)Loov;
      // 2f2: athrow
      // 2f3: if_acmpne 307
      // 2f6: aload 0
      // 2f7: aload 1
      // 2f8: aload 2
      // 2f9: aload 9
      // 2fb: bipush 0
      // 2fc: invokespecial aog.s8e (Lt9d;Lmew;Lvt2;Z)Z
      // 2ff: goto 306
      // 302: invokestatic aog.a (Loov;)Loov;
      // 305: athrow
      // 306: pop
      // 307: iload 8
      // 309: ifne 31e
      // 30c: aload 1
      // 30d: aload 2
      // 30e: aload 9
      // 310: invokevirtual mew.offset (Lvt2;)Lmew;
      // 313: invokevirtual t9d.i6x (Lmew;)Z
      // 316: goto 31d
      // 319: invokestatic aog.a (Loov;)Loov;
      // 31c: athrow
      // 31d: pop
      // 31e: aload 1
      // 31f: aload 2
      // 320: invokevirtual mew.getX ()I
      // 323: i2d
      // 324: ldc2_w 0.5
      // 327: dadd
      // 328: aload 2
      // 329: invokevirtual mew.getY ()I
      // 32c: i2d
      // 32d: ldc2_w 0.5
      // 330: dadd
      // 331: aload 2
      // 332: invokevirtual mew.getZ ()I
      // 335: i2d
      // 336: ldc2_w 0.5
      // 339: dadd
      // 33a: sipush 30262
      // 33d: ldc2_w 2115906724059058048
      // 340: lload 6
      // 342: lxor
      // 343: invokedynamic b (IJ)Ljava/lang/String; bsm=aog.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 348: nop
      // 349: ldc 0.5
      // 34b: nop
      // 34c: aload 1
      // 34d: getfield t9d.fsy Ljava/util/Random;
      // 350: invokevirtual java/util/Random.nextFloat ()F
      // 353: ldc 0.15
      // 355: nop
      // 356: fmul
      // 357: ldc 0.6
      // 359: nop
      // 35a: fadd
      // 35b: invokevirtual t9d.amg (DDDLjava/lang/String;FF)V
      // 35e: bipush 1
      // 35f: ireturn
   }

   @Override
   public void c7i(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 1
      // 005: aload 2
      // 006: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 00b: astore 4
      // 00d: aload 4
      // 00f: iload 3
      // 010: ifne 02c
      // 013: invokeinterface zfz.r_y ()Le0x; 1
      // 018: aload 0
      // 019: if_acmpne 112
      // 01c: goto 023
      // 01f: invokestatic aog.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 4
      // 025: goto 02c
      // 028: invokestatic aog.a (Loov;)Loov;
      // 02b: athrow
      // 02c: getstatic aog.cv2 Lh76;
      // 02f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 034: checkcast java/lang/Boolean
      // 037: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03a: ifeq 112
      // 03d: ldc 0.25
      // 03f: nop
      // 040: fstore 5
      // 042: aload 4
      // 044: getstatic aog.kx4 Lqx_;
      // 047: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 04c: checkcast vt2
      // 04f: astore 6
      // 051: aload 6
      // 053: ifnull 10e
      // 056: getstatic aog$1.lbc [I
      // 059: aload 6
      // 05b: invokevirtual vt2.ordinal ()I
      // 05e: iaload
      // 05f: tableswitch 175 1 6 41 64 87 110 133 156
      // 084: invokestatic aog.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 0
      // 089: fconst_0
      // 08a: ldc 0.25
      // 08c: nop
      // 08d: fconst_0
      // 08e: fconst_1
      // 08f: fconst_1
      // 090: fconst_1
      // 091: invokevirtual aog.xl4 (FFFFFF)V
      // 094: iload 3
      // 095: ifeq 10e
      // 098: goto 09f
      // 09b: invokestatic aog.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: fconst_0
      // 0a1: fconst_0
      // 0a2: fconst_0
      // 0a3: fconst_1
      // 0a4: ldc 0.75
      // 0a6: nop
      // 0a7: fconst_1
      // 0a8: invokevirtual aog.xl4 (FFFFFF)V
      // 0ab: iload 3
      // 0ac: ifeq 10e
      // 0af: goto 0b6
      // 0b2: invokestatic aog.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: fconst_0
      // 0b8: fconst_0
      // 0b9: ldc 0.25
      // 0bb: nop
      // 0bc: fconst_1
      // 0bd: fconst_1
      // 0be: fconst_1
      // 0bf: invokevirtual aog.xl4 (FFFFFF)V
      // 0c2: iload 3
      // 0c3: ifeq 10e
      // 0c6: goto 0cd
      // 0c9: invokestatic aog.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: fconst_0
      // 0cf: fconst_0
      // 0d0: fconst_0
      // 0d1: fconst_1
      // 0d2: fconst_1
      // 0d3: ldc 0.75
      // 0d5: nop
      // 0d6: invokevirtual aog.xl4 (FFFFFF)V
      // 0d9: iload 3
      // 0da: ifeq 10e
      // 0dd: goto 0e4
      // 0e0: invokestatic aog.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: ldc 0.25
      // 0e7: nop
      // 0e8: fconst_0
      // 0e9: fconst_0
      // 0ea: fconst_1
      // 0eb: fconst_1
      // 0ec: fconst_1
      // 0ed: invokevirtual aog.xl4 (FFFFFF)V
      // 0f0: iload 3
      // 0f1: ifeq 10e
      // 0f4: goto 0fb
      // 0f7: invokestatic aog.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: fconst_0
      // 0fd: fconst_0
      // 0fe: fconst_0
      // 0ff: ldc 0.75
      // 101: nop
      // 102: fconst_1
      // 103: fconst_1
      // 104: invokevirtual aog.xl4 (FFFFFF)V
      // 107: goto 10e
      // 10a: invokestatic aog.a (Loov;)Loov;
      // 10d: athrow
      // 10e: iload 3
      // 10f: ifeq 123
      // 112: aload 0
      // 113: fconst_0
      // 114: fconst_0
      // 115: fconst_0
      // 116: fconst_1
      // 117: fconst_1
      // 118: fconst_1
      // 119: invokevirtual aog.xl4 (FFFFFF)V
      // 11c: goto 123
      // 11f: invokestatic aog.a (Loov;)Loov;
      // 122: athrow
      // 123: return
   }

   @Override
   public void bf6() {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void c76(t9d var1, mew var2, zfz var3, nh4 var4, List var5, i2h var6) {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.c76(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public nh4 m__(t9d var1, mew var2, zfz var3) {
      this.c7i(var1, var2);
      return super.m__(var1, var2, var3);
   }

   @Override
   public boolean gck() {
      return false;
   }

   public static vt2 p19(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: bipush 7
      // 07: iand
      // 08: istore 2
      // 09: iload 2
      // 0a: iload 1
      // 0b: ifeq 22
      // 0e: bipush 5
      // 0f: if_icmple 21
      // 12: goto 19
      // 15: invokestatic aog.a (Loov;)Loov;
      // 18: athrow
      // 19: aconst_null
      // 1a: goto 25
      // 1d: invokestatic aog.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: invokestatic vt2.jw6 (I)Lvt2;
      // 25: areturn
   }

   public static vt2 wf_(t9d param0, mew param1, g_3 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifne 8b
      // 09: getfield g_3.o2v D
      // 0c: d2f
      // 0d: aload 1
      // 0e: invokevirtual mew.getX ()I
      // 11: i2f
      // 12: fsub
      // 13: invokestatic fe6.sqg (F)F
      // 16: fconst_2
      // 17: fcmpg
      // 18: ifge 8a
      // 1b: goto 22
      // 1e: invokestatic aog.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 2
      // 23: iload 3
      // 24: ifne 8b
      // 27: goto 2e
      // 2a: invokestatic aog.a (Loov;)Loov;
      // 2d: athrow
      // 2e: getfield g_3.vbd D
      // 31: d2f
      // 32: aload 1
      // 33: invokevirtual mew.getZ ()I
      // 36: i2f
      // 37: fsub
      // 38: invokestatic fe6.sqg (F)F
      // 3b: fconst_2
      // 3c: fcmpg
      // 3d: ifge 8a
      // 40: goto 47
      // 43: invokestatic aog.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 2
      // 48: getfield g_3.kfp D
      // 4b: aload 2
      // 4c: invokevirtual g_3.c5y ()F
      // 4f: f2d
      // 50: dadd
      // 51: dstore 4
      // 53: dload 4
      // 55: aload 1
      // 56: invokevirtual mew.getY ()I
      // 59: i2d
      // 5a: dsub
      // 5b: ldc2_w 2.0
      // 5e: dcmpl
      // 5f: iload 3
      // 60: ifne 7f
      // 63: ifle 75
      // 66: goto 6d
      // 69: invokestatic aog.a (Loov;)Loov;
      // 6c: athrow
      // 6d: getstatic vt2.rf3 Lvt2;
      // 70: areturn
      // 71: invokestatic aog.a (Loov;)Loov;
      // 74: athrow
      // 75: aload 1
      // 76: invokevirtual mew.getY ()I
      // 79: i2d
      // 7a: dload 4
      // 7c: dsub
      // 7d: dconst_0
      // 7e: dcmpl
      // 7f: ifle 8a
      // 82: getstatic vt2.m3r Lvt2;
      // 85: areturn
      // 86: invokestatic aog.a (Loov;)Loov;
      // 89: athrow
      // 8a: aload 2
      // 8b: invokevirtual g_3.u0f ()Lvt2;
      // 8e: invokevirtual vt2.b4b ()Lvt2;
      // 91: areturn
   }

   public static boolean eh5(e0x param0, t9d param1, mew param2, vt2 param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 5
      // 005: aload 0
      // 006: getstatic ox_.j4y Le0x;
      // 009: if_acmpne 012
      // 00c: bipush 0
      // 00d: ireturn
      // 00e: invokestatic aog.a (Loov;)Loov;
      // 011: athrow
      // 012: aload 1
      // 013: invokevirtual t9d.fve ()Lw5i;
      // 016: aload 2
      // 017: invokevirtual w5i.hka (Lmew;)Z
      // 01a: iload 5
      // 01c: ifeq 033
      // 01f: ifne 02f
      // 022: goto 029
      // 025: invokestatic aog.a (Loov;)Loov;
      // 028: athrow
      // 029: bipush 0
      // 02a: ireturn
      // 02b: invokestatic aog.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 2
      // 030: invokevirtual mew.getY ()I
      // 033: iload 5
      // 035: ifeq 19d
      // 038: iflt 19c
      // 03b: goto 042
      // 03e: invokestatic aog.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 3
      // 043: getstatic vt2.m3r Lvt2;
      // 046: if_acmpne 06a
      // 049: goto 050
      // 04c: invokestatic aog.a (Loov;)Loov;
      // 04f: athrow
      // 050: aload 2
      // 051: invokevirtual mew.getY ()I
      // 054: iload 5
      // 056: ifeq 19d
      // 059: goto 060
      // 05c: invokestatic aog.a (Loov;)Loov;
      // 05f: athrow
      // 060: ifeq 19c
      // 063: goto 06a
      // 066: invokestatic aog.a (Loov;)Loov;
      // 069: athrow
      // 06a: aload 2
      // 06b: invokevirtual mew.getY ()I
      // 06e: iload 5
      // 070: ifeq 19b
      // 073: goto 07a
      // 076: invokestatic aog.a (Loov;)Loov;
      // 079: athrow
      // 07a: aload 1
      // 07b: invokevirtual t9d._1d ()I
      // 07e: bipush 1
      // 07f: isub
      // 080: if_icmpgt 19a
      // 083: goto 08a
      // 086: invokestatic aog.a (Loov;)Loov;
      // 089: athrow
      // 08a: aload 3
      // 08b: getstatic vt2.rf3 Lvt2;
      // 08e: if_acmpne 0b8
      // 091: goto 098
      // 094: invokestatic aog.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 2
      // 099: invokevirtual mew.getY ()I
      // 09c: iload 5
      // 09e: ifeq 19b
      // 0a1: goto 0a8
      // 0a4: invokestatic aog.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 1
      // 0a9: invokevirtual t9d._1d ()I
      // 0ac: bipush 1
      // 0ad: isub
      // 0ae: if_icmpeq 19a
      // 0b1: goto 0b8
      // 0b4: invokestatic aog.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: getstatic ox_.nc0 Laog;
      // 0bc: iload 5
      // 0be: ifeq 0e9
      // 0c1: goto 0c8
      // 0c4: invokestatic aog.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: if_acmpeq 159
      // 0cb: goto 0d2
      // 0ce: invokestatic aog.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: iload 5
      // 0d5: ifeq 0ed
      // 0d8: goto 0df
      // 0db: invokestatic aog.a (Loov;)Loov;
      // 0de: athrow
      // 0df: getstatic ox_.wdk Laog;
      // 0e2: goto 0e9
      // 0e5: invokestatic aog.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: if_acmpeq 159
      // 0ec: aload 0
      // 0ed: aload 1
      // 0ee: aload 2
      // 0ef: invokevirtual e0x.wnt (Lt9d;Lmew;)F
      // 0f2: ldc -1.0
      // 0f4: nop
      // 0f5: fcmpl
      // 0f6: iload 5
      // 0f8: ifeq 10f
      // 0fb: ifne 10b
      // 0fe: goto 105
      // 101: invokestatic aog.a (Loov;)Loov;
      // 104: athrow
      // 105: bipush 0
      // 106: ireturn
      // 107: invokestatic aog.a (Loov;)Loov;
      // 10a: athrow
      // 10b: aload 0
      // 10c: invokevirtual e0x.quv ()I
      // 10f: bipush 2
      // 110: iload 5
      // 112: ifeq 136
      // 115: if_icmpne 125
      // 118: goto 11f
      // 11b: invokestatic aog.a (Loov;)Loov;
      // 11e: athrow
      // 11f: bipush 0
      // 120: ireturn
      // 121: invokestatic aog.a (Loov;)Loov;
      // 124: athrow
      // 125: aload 0
      // 126: invokevirtual e0x.quv ()I
      // 129: iload 5
      // 12b: ifeq 185
      // 12e: bipush 1
      // 12f: goto 136
      // 132: invokestatic aog.a (Loov;)Loov;
      // 135: athrow
      // 136: if_icmpne 181
      // 139: iload 4
      // 13b: iload 5
      // 13d: ifeq 158
      // 140: goto 147
      // 143: invokestatic aog.a (Loov;)Loov;
      // 146: athrow
      // 147: ifne 157
      // 14a: goto 151
      // 14d: invokestatic aog.a (Loov;)Loov;
      // 150: athrow
      // 151: bipush 0
      // 152: ireturn
      // 153: invokestatic aog.a (Loov;)Loov;
      // 156: athrow
      // 157: bipush 1
      // 158: ireturn
      // 159: aload 1
      // 15a: aload 2
      // 15b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 15e: getstatic aog.cv2 Lh76;
      // 161: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 166: checkcast java/lang/Boolean
      // 169: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 16c: iload 5
      // 16e: ifeq 185
      // 171: ifeq 181
      // 174: goto 17b
      // 177: invokestatic aog.a (Loov;)Loov;
      // 17a: athrow
      // 17b: bipush 0
      // 17c: ireturn
      // 17d: invokestatic aog.a (Loov;)Loov;
      // 180: athrow
      // 181: aload 0
      // 182: instanceof adf
      // 185: iload 5
      // 187: ifeq 195
      // 18a: ifne 198
      // 18d: goto 194
      // 190: invokestatic aog.a (Loov;)Loov;
      // 193: athrow
      // 194: bipush 1
      // 195: goto 199
      // 198: bipush 0
      // 199: ireturn
      // 19a: bipush 0
      // 19b: ireturn
      // 19c: bipush 0
      // 19d: ireturn
   }

   private boolean s8e(t9d param1, mew param2, vt2 param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 5
      // 005: iload 4
      // 007: iload 5
      // 009: ifeq 026
      // 00c: ifne 027
      // 00f: goto 016
      // 012: invokestatic aog.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 1
      // 017: aload 2
      // 018: aload 3
      // 019: invokevirtual mew.offset (Lvt2;)Lmew;
      // 01c: invokevirtual t9d.i6x (Lmew;)Z
      // 01f: goto 026
      // 022: invokestatic aog.a (Loov;)Loov;
      // 025: athrow
      // 026: pop
      // 027: new cz3
      // 02a: dup
      // 02b: aload 1
      // 02c: aload 2
      // 02d: aload 3
      // 02e: iload 4
      // 030: invokespecial cz3.<init> (Lt9d;Lmew;Lvt2;Z)V
      // 033: astore 6
      // 035: aload 6
      // 037: invokevirtual cz3.sxx ()Ljava/util/List;
      // 03a: astore 7
      // 03c: aload 6
      // 03e: invokevirtual cz3._h2 ()Ljava/util/List;
      // 041: astore 8
      // 043: aload 6
      // 045: invokevirtual cz3.h2m ()Z
      // 048: iload 5
      // 04a: ifeq 06c
      // 04d: ifne 05d
      // 050: goto 057
      // 053: invokestatic aog.a (Loov;)Loov;
      // 056: athrow
      // 057: bipush 0
      // 058: ireturn
      // 059: invokestatic aog.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 7
      // 05f: invokeinterface java/util/List.size ()I 1
      // 064: aload 8
      // 066: invokeinterface java/util/List.size ()I 1
      // 06b: iadd
      // 06c: istore 9
      // 06e: iload 9
      // 070: anewarray 20
      // 073: astore 10
      // 075: iload 4
      // 077: ifeq 082
      // 07a: aload 3
      // 07b: goto 086
      // 07e: invokestatic aog.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 3
      // 083: invokevirtual vt2.b4b ()Lvt2;
      // 086: astore 11
      // 088: aload 8
      // 08a: invokeinterface java/util/List.size ()I 1
      // 08f: bipush 1
      // 090: isub
      // 091: istore 12
      // 093: iload 12
      // 095: iflt 0e7
      // 098: aload 8
      // 09a: iload 12
      // 09c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0a1: checkcast mew
      // 0a4: astore 13
      // 0a6: aload 1
      // 0a7: aload 13
      // 0a9: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0ac: invokeinterface zfz.r_y ()Le0x; 1
      // 0b1: astore 14
      // 0b3: aload 14
      // 0b5: aload 1
      // 0b6: aload 13
      // 0b8: aload 1
      // 0b9: aload 13
      // 0bb: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0be: bipush 0
      // 0bf: invokevirtual e0x.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 0c2: aload 1
      // 0c3: aload 13
      // 0c5: invokevirtual t9d.i6x (Lmew;)Z
      // 0c8: pop
      // 0c9: iinc 9 -1
      // 0cc: aload 10
      // 0ce: iload 9
      // 0d0: aload 14
      // 0d2: aastore
      // 0d3: iinc 12 -1
      // 0d6: iload 5
      // 0d8: ifeq 0f2
      // 0db: iload 5
      // 0dd: ifne 093
      // 0e0: goto 0e7
      // 0e3: invokestatic aog.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 7
      // 0e9: invokeinterface java/util/List.size ()I 1
      // 0ee: bipush 1
      // 0ef: isub
      // 0f0: istore 12
      // 0f2: iload 12
      // 0f4: iflt 16b
      // 0f7: aload 7
      // 0f9: iload 12
      // 0fb: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 100: checkcast mew
      // 103: astore 13
      // 105: aload 1
      // 106: aload 13
      // 108: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 10b: astore 14
      // 10d: aload 14
      // 10f: invokeinterface zfz.r_y ()Le0x; 1
      // 114: astore 15
      // 116: aload 15
      // 118: aload 14
      // 11a: invokevirtual e0x.hvp (Lzfz;)I
      // 11d: pop
      // 11e: aload 1
      // 11f: aload 13
      // 121: invokevirtual t9d.i6x (Lmew;)Z
      // 124: pop
      // 125: aload 13
      // 127: aload 11
      // 129: invokevirtual mew.offset (Lvt2;)Lmew;
      // 12c: iload 5
      // 12e: ifeq 170
      // 131: astore 13
      // 133: aload 1
      // 134: aload 13
      // 136: getstatic ox_.bn4 Lmyw;
      // 139: invokevirtual myw.l4i ()Lzfz;
      // 13c: getstatic aog.kx4 Lqx_;
      // 13f: aload 3
      // 140: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 145: bipush 4
      // 146: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 149: pop
      // 14a: aload 1
      // 14b: aload 13
      // 14d: aload 14
      // 14f: aload 3
      // 150: iload 4
      // 152: bipush 0
      // 153: invokestatic myw.ck1 (Lzfz;Lvt2;ZZ)Lpyk;
      // 156: invokevirtual t9d.a_h (Lmew;Lpyk;)V
      // 159: iinc 9 -1
      // 15c: aload 10
      // 15e: iload 9
      // 160: aload 15
      // 162: aastore
      // 163: iinc 12 -1
      // 166: iload 5
      // 168: ifne 0f2
      // 16b: aload 2
      // 16c: aload 3
      // 16d: invokevirtual mew.offset (Lvt2;)Lmew;
      // 170: astore 12
      // 172: iload 4
      // 174: iload 5
      // 176: ifeq 209
      // 179: ifeq 200
      // 17c: goto 183
      // 17f: invokestatic aog.a (Loov;)Loov;
      // 182: athrow
      // 183: aload 0
      // 184: getfield aog._pp Z
      // 187: ifeq 19b
      // 18a: goto 191
      // 18d: invokestatic aog.a (Loov;)Loov;
      // 190: athrow
      // 191: getstatic u4_$vxa.voo Lu4_$vxa;
      // 194: goto 19e
      // 197: invokestatic aog.a (Loov;)Loov;
      // 19a: athrow
      // 19b: getstatic u4_$vxa.ek6 Lu4_$vxa;
      // 19e: astore 13
      // 1a0: getstatic ox_.e1u Lu4_;
      // 1a3: invokevirtual u4_.l4i ()Lzfz;
      // 1a6: getstatic u4_.dju Lqx_;
      // 1a9: aload 3
      // 1aa: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1af: getstatic u4_.x38 Lzb_;
      // 1b2: aload 13
      // 1b4: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1b9: astore 14
      // 1bb: getstatic ox_.bn4 Lmyw;
      // 1be: invokevirtual myw.l4i ()Lzfz;
      // 1c1: getstatic myw.lw_ Lqx_;
      // 1c4: aload 3
      // 1c5: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1ca: getstatic myw._yy Lzb_;
      // 1cd: aload 0
      // 1ce: getfield aog._pp Z
      // 1d1: ifeq 1de
      // 1d4: getstatic u4_$vxa.voo Lu4_$vxa;
      // 1d7: goto 1e1
      // 1da: invokestatic aog.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: getstatic u4_$vxa.ek6 Lu4_$vxa;
      // 1e1: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1e6: astore 15
      // 1e8: aload 1
      // 1e9: aload 12
      // 1eb: aload 15
      // 1ed: bipush 4
      // 1ee: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1f1: pop
      // 1f2: aload 1
      // 1f3: aload 12
      // 1f5: aload 14
      // 1f7: aload 3
      // 1f8: bipush 1
      // 1f9: bipush 0
      // 1fa: invokestatic myw.ck1 (Lzfz;Lvt2;ZZ)Lpyk;
      // 1fd: invokevirtual t9d.a_h (Lmew;Lpyk;)V
      // 200: aload 8
      // 202: invokeinterface java/util/List.size ()I 1
      // 207: bipush 1
      // 208: isub
      // 209: istore 13
      // 20b: iload 13
      // 20d: iflt 23c
      // 210: aload 1
      // 211: aload 8
      // 213: iload 13
      // 215: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 21a: checkcast mew
      // 21d: aload 10
      // 21f: iload 9
      // 221: iinc 9 1
      // 224: aaload
      // 225: invokevirtual t9d._0o (Lmew;Le0x;)V
      // 228: iinc 13 -1
      // 22b: iload 5
      // 22d: ifeq 247
      // 230: iload 5
      // 232: ifne 20b
      // 235: goto 23c
      // 238: invokestatic aog.a (Loov;)Loov;
      // 23b: athrow
      // 23c: aload 7
      // 23e: invokeinterface java/util/List.size ()I 1
      // 243: bipush 1
      // 244: isub
      // 245: istore 13
      // 247: iload 13
      // 249: iflt 27f
      // 24c: aload 1
      // 24d: aload 7
      // 24f: iload 13
      // 251: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 256: checkcast mew
      // 259: aload 10
      // 25b: iload 9
      // 25d: iinc 9 1
      // 260: aaload
      // 261: invokevirtual t9d._0o (Lmew;Le0x;)V
      // 264: iinc 13 -1
      // 267: iload 5
      // 269: ifeq 2a6
      // 26c: goto 273
      // 26f: invokestatic aog.a (Loov;)Loov;
      // 272: athrow
      // 273: iload 5
      // 275: ifne 247
      // 278: goto 27f
      // 27b: invokestatic aog.a (Loov;)Loov;
      // 27e: athrow
      // 27f: iload 4
      // 281: iload 5
      // 283: ifeq 2a7
      // 286: ifeq 2a6
      // 289: goto 290
      // 28c: invokestatic aog.a (Loov;)Loov;
      // 28f: athrow
      // 290: aload 1
      // 291: aload 12
      // 293: getstatic ox_.e1u Lu4_;
      // 296: invokevirtual t9d._0o (Lmew;Le0x;)V
      // 299: aload 1
      // 29a: aload 2
      // 29b: aload 0
      // 29c: invokevirtual t9d._0o (Lmew;Le0x;)V
      // 29f: goto 2a6
      // 2a2: invokestatic aog.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: bipush 1
      // 2a7: ireturn
   }

   @Override
   public zfz v1x(zfz var1) {
      return this.l4i().zvi(kx4, vt2.rf3);
   }

   @Override
   public zfz kig(int var1) {
      int var2 = t9d.b();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = this.l4i().zvi(kx4, p19(var1));
         var10001 = cv2;
         int var10002 = var1 & 8;
         if (var2 == 0) {
            return var10000.zvi(cv2, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(cv2, true);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = t9d.b();
      var3 |= ((vt2)var1.dil(kx4)).c3s();
      int var2 = var10000;

      try {
         byte var6 = (Boolean)var1.dil(cv2);
         if (var2 == 0) {
            return var6;
         }

         if (var6 == 0) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 |= 8;
      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{kx4, cv2});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5183264899592318165L, -577049282287462341L, MethodHandles.lookup().lookupClass()).a(261075975107434L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 3010262905474L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "\u008e-ç»[2ù¢ï÷ã½&çFe\u0094\u000b\u0096\u001fd\u008fLÛ\u0010ÅXl\u000b\u0099\u008by;\u0012\u0019ý>1.ê/";
      int var6 = "\u008e-ç»[2ù¢ï÷ã½&çFe\u0094\u000b\u0096\u001fd\u008fLÛ\u0010ÅXl\u000b\u0099\u008by;\u0012\u0019ý>1.ê/".length();
      char var3 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     d = var7;
                     h = new String[4];
                     kx4 = qx_.jap(b<"b">(29917, 3716045046983411760L ^ var9));
                     cv2 = h76.d_1(b<"b">(4413, 4322934590262586834L ^ var9));
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "_ê?\rgr\u0010\u0084\u009eE\u0001*q\u0006´\u000eÎ89³áuTðÓÂ-\u0087\u0094×1F {(\u001aèÀ/4øá\u0011fI{GÉÚ&\u009c©MðÍ¸I\u0087Å«³p¬ÐK";
                  var6 = "_ê?\rgr\u0010\u0084\u009eE\u0001*q\u0006´\u000eÎ89³áuTðÓÂ-\u0087\u0094×1F {(\u001aèÀ/4øá\u0011fI{GÉÚ&\u009c©MðÍ¸I\u0087Å«³p¬ÐK"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32395;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("aog", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("aog" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
