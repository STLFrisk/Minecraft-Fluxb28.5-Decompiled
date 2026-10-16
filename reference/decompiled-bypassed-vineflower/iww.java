import java.io.Serializable;
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

public class iww implements Serializable, Cloneable {
   public static final long serialVersionUID = 6837536777072402710L;
   public double lxb;
   public double y3c;
   public double bhd;
   public double get;
   public double pwn;
   public double c84;
   public double y7q;
   public double _o7;
   public double ffq;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public iww(double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15, double var17) {
      this.lxb = var1;
      this.y3c = var3;
      this.bhd = var5;
      this.get = var7;
      this.pwn = var9;
      this.c84 = var11;
      this.y7q = var13;
      this._o7 = var15;
      this.ffq = var17;
   }

   public iww(double[] var1) {
      this.lxb = var1[0];
      this.y3c = var1[1];
      this.bhd = var1[2];
      this.get = var1[3];
      this.pwn = var1[4];
      this.c84 = var1[5];
      this.y7q = var1[6];
      this._o7 = var1[7];
      this.ffq = var1[8];
   }

   public iww(iww var1) {
      this.lxb = var1.lxb;
      this.y3c = var1.y3c;
      this.bhd = var1.bhd;
      this.get = var1.get;
      this.pwn = var1.pwn;
      this.c84 = var1.c84;
      this.y7q = var1.y7q;
      this._o7 = var1._o7;
      this.ffq = var1.ffq;
   }

   public iww(nvj var1) {
      this.lxb = (double)var1.i2i;
      this.y3c = (double)var1.k12;
      this.bhd = (double)var1.xu6;
      this.get = (double)var1._id;
      this.pwn = (double)var1.aoj;
      this.c84 = (double)var1.zk_;
      this.y7q = (double)var1.aqg;
      this._o7 = (double)var1.wdt;
      this.ffq = (double)var1.jr8;
   }

   public iww() {
      this.lxb = 0.0;
      this.y3c = 0.0;
      this.bhd = 0.0;
      this.get = 0.0;
      this.pwn = 0.0;
      this.c84 = 0.0;
      this.y7q = 0.0;
      this._o7 = 0.0;
      this.ffq = 0.0;
   }

   @Override
   public String toString() {
      long var1 = a ^ 93497394794517L;
      return this.lxb
         + a<"h">(13894, 3355029946048886910L ^ var1)
         + this.y3c
         + a<"h">(10194, 7748823131866540518L ^ var1)
         + this.bhd
         + "\n"
         + this.get
         + a<"h">(10194, 7748823131866540518L ^ var1)
         + this.pwn
         + a<"h">(10194, 7748823131866540518L ^ var1)
         + this.c84
         + "\n"
         + this.y7q
         + a<"h">(10194, 7748823131866540518L ^ var1)
         + this._o7
         + a<"h">(10194, 7748823131866540518L ^ var1)
         + this.ffq
         + "\n";
   }

   public final void xrb() {
      this.lxb = 1.0;
      this.y3c = 0.0;
      this.bhd = 0.0;
      this.get = 0.0;
      this.pwn = 1.0;
      this.c84 = 0.0;
      this.y7q = 0.0;
      this._o7 = 0.0;
      this.ffq = 1.0;
   }

   public final void _1o(double var1) {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.oa4(var4, var3);
      this.lxb = var3[0] * var1;
      this.y3c = var3[1] * var1;
      this.bhd = var3[2] * var1;
      this.get = var3[3] * var1;
      this.pwn = var3[4] * var1;
      this.c84 = var3[5] * var1;
      this.y7q = var3[6] * var1;
      this._o7 = var3[7] * var1;
      this.ffq = var3[8] * var1;
   }

   public final void ts9(int param1, int param2, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic iww.a J
      // 003: ldc2_w 48528713875817
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic t9d.b ()I
      // 00c: istore 7
      // 00e: iload 1
      // 00f: iload 7
      // 011: ifeq 035
      // 014: tableswitch 357 0 2 32 141 249
      // 030: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 033: athrow
      // 034: iload 2
      // 035: tableswitch 78 0 2 27 44 61
      // 050: aload 0
      // 051: dload 3
      // 052: putfield iww.lxb D
      // 055: iload 7
      // 057: ifne 193
      // 05a: goto 061
      // 05d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 060: athrow
      // 061: aload 0
      // 062: dload 3
      // 063: putfield iww.y3c D
      // 066: iload 7
      // 068: ifne 193
      // 06b: goto 072
      // 06e: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 071: athrow
      // 072: aload 0
      // 073: dload 3
      // 074: putfield iww.bhd D
      // 077: iload 7
      // 079: ifne 193
      // 07c: goto 083
      // 07f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 082: athrow
      // 083: new java/lang/ArrayIndexOutOfBoundsException
      // 086: dup
      // 087: sipush 15192
      // 08a: ldc2_w 60972141476815892
      // 08d: lload 5
      // 08f: lxor
      // 090: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: nop
      // 096: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 099: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 09c: athrow
      // 09d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a0: athrow
      // 0a1: iload 2
      // 0a2: tableswitch 77 0 2 26 43 60
      // 0bc: aload 0
      // 0bd: dload 3
      // 0be: putfield iww.get D
      // 0c1: iload 7
      // 0c3: ifne 193
      // 0c6: goto 0cd
      // 0c9: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: dload 3
      // 0cf: putfield iww.pwn D
      // 0d2: iload 7
      // 0d4: ifne 193
      // 0d7: goto 0de
      // 0da: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: dload 3
      // 0e0: putfield iww.c84 D
      // 0e3: iload 7
      // 0e5: ifne 193
      // 0e8: goto 0ef
      // 0eb: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ee: athrow
      // 0ef: new java/lang/ArrayIndexOutOfBoundsException
      // 0f2: dup
      // 0f3: sipush 12077
      // 0f6: ldc2_w 230595330685349984
      // 0f9: lload 5
      // 0fb: lxor
      // 0fc: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: nop
      // 102: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 105: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 108: athrow
      // 109: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10c: athrow
      // 10d: iload 2
      // 10e: tableswitch 77 0 2 26 43 60
      // 128: aload 0
      // 129: dload 3
      // 12a: putfield iww.y7q D
      // 12d: iload 7
      // 12f: ifne 193
      // 132: goto 139
      // 135: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 138: athrow
      // 139: aload 0
      // 13a: dload 3
      // 13b: putfield iww._o7 D
      // 13e: iload 7
      // 140: ifne 193
      // 143: goto 14a
      // 146: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 149: athrow
      // 14a: aload 0
      // 14b: dload 3
      // 14c: putfield iww.ffq D
      // 14f: iload 7
      // 151: ifne 193
      // 154: goto 15b
      // 157: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15a: athrow
      // 15b: new java/lang/ArrayIndexOutOfBoundsException
      // 15e: dup
      // 15f: sipush 12077
      // 162: ldc2_w 230595330685349984
      // 165: lload 5
      // 167: lxor
      // 168: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: nop
      // 16e: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 171: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 174: athrow
      // 175: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 178: athrow
      // 179: new java/lang/ArrayIndexOutOfBoundsException
      // 17c: dup
      // 17d: sipush 12077
      // 180: ldc2_w 230595330685349984
      // 183: lload 5
      // 185: lxor
      // 186: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: nop
      // 18c: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 18f: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 192: athrow
      // 193: return
   }

   public final double ru3(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iww.a J
      // 03: ldc2_w 3818232611481
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: iload 5
      // 10: ifeq 31
      // 13: tableswitch 191 0 2 29 81 137
      // 2c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f: athrow
      // 30: iload 2
      // 31: tableswitch 46 0 2 27 36 41
      // 4c: aload 0
      // 4d: getfield iww.lxb D
      // 50: dreturn
      // 51: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 54: athrow
      // 55: aload 0
      // 56: getfield iww.y3c D
      // 59: dreturn
      // 5a: aload 0
      // 5b: getfield iww.bhd D
      // 5e: dreturn
      // 5f: iload 5
      // 61: ifne d2
      // 64: iload 2
      // 65: tableswitch 50 0 2 31 40 45
      // 80: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 83: athrow
      // 84: aload 0
      // 85: getfield iww.get D
      // 88: dreturn
      // 89: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8c: athrow
      // 8d: aload 0
      // 8e: getfield iww.pwn D
      // 91: dreturn
      // 92: aload 0
      // 93: getfield iww.c84 D
      // 96: dreturn
      // 97: iload 5
      // 99: ifne d2
      // 9c: iload 2
      // 9d: tableswitch 50 0 2 31 40 45
      // b8: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // bb: athrow
      // bc: aload 0
      // bd: getfield iww.y7q D
      // c0: dreturn
      // c1: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c4: athrow
      // c5: aload 0
      // c6: getfield iww._o7 D
      // c9: dreturn
      // ca: aload 0
      // cb: getfield iww.ffq D
      // ce: dreturn
      // cf: goto d2
      // d2: new java/lang/ArrayIndexOutOfBoundsException
      // d5: dup
      // d6: sipush 6311
      // d9: ldc2_w 3493037283729900572
      // dc: lload 3
      // dd: lxor
      // de: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e3: nop
      // e4: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // e7: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // ea: athrow
   }

   public final void tjq(int param1, qhn param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iww.a J
      // 03: ldc2_w 28201426972035
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: iload 5
      // 10: ifne 49
      // 13: ifne 41
      // 16: goto 1d
      // 19: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: aload 2
      // 1e: aload 0
      // 1f: getfield iww.lxb D
      // 22: putfield qhn.v54 D
      // 25: aload 2
      // 26: aload 0
      // 27: getfield iww.y3c D
      // 2a: putfield qhn.g0w D
      // 2d: aload 2
      // 2e: aload 0
      // 2f: getfield iww.bhd D
      // 32: putfield qhn.mu9 D
      // 35: iload 5
      // 37: ifeq ca
      // 3a: goto 41
      // 3d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 40: athrow
      // 41: iload 1
      // 42: goto 49
      // 45: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: bipush 1
      // 4a: iload 5
      // 4c: ifne 86
      // 4f: if_icmpne 7d
      // 52: goto 59
      // 55: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 58: athrow
      // 59: aload 2
      // 5a: aload 0
      // 5b: getfield iww.get D
      // 5e: putfield qhn.v54 D
      // 61: aload 2
      // 62: aload 0
      // 63: getfield iww.pwn D
      // 66: putfield qhn.g0w D
      // 69: aload 2
      // 6a: aload 0
      // 6b: getfield iww.c84 D
      // 6e: putfield qhn.mu9 D
      // 71: iload 5
      // 73: ifeq ca
      // 76: goto 7d
      // 79: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7c: athrow
      // 7d: iload 1
      // 7e: bipush 2
      // 7f: goto 86
      // 82: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 85: athrow
      // 86: if_icmpne ad
      // 89: aload 2
      // 8a: aload 0
      // 8b: getfield iww.y7q D
      // 8e: putfield qhn.v54 D
      // 91: aload 2
      // 92: aload 0
      // 93: getfield iww._o7 D
      // 96: putfield qhn.g0w D
      // 99: aload 2
      // 9a: aload 0
      // 9b: getfield iww.ffq D
      // 9e: putfield qhn.mu9 D
      // a1: iload 5
      // a3: ifeq ca
      // a6: goto ad
      // a9: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ac: athrow
      // ad: new java/lang/ArrayIndexOutOfBoundsException
      // b0: dup
      // b1: sipush 8378
      // b4: ldc2_w 4696747427533116185
      // b7: lload 3
      // b8: lxor
      // b9: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: nop
      // bf: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // c2: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // c5: athrow
      // c6: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c9: athrow
      // ca: return
   }

   public final void alh(int param1, double[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iww.a J
      // 03: ldc2_w 60312600018104
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: iload 5
      // 10: ifne 46
      // 13: ifne 3e
      // 16: goto 1d
      // 19: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: aload 2
      // 1e: bipush 0
      // 1f: aload 0
      // 20: getfield iww.lxb D
      // 23: dastore
      // 24: aload 2
      // 25: bipush 1
      // 26: aload 0
      // 27: getfield iww.y3c D
      // 2a: dastore
      // 2b: aload 2
      // 2c: bipush 2
      // 2d: aload 0
      // 2e: getfield iww.bhd D
      // 31: dastore
      // 32: iload 5
      // 34: ifeq c1
      // 37: goto 3e
      // 3a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: iload 1
      // 3f: goto 46
      // 42: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 45: athrow
      // 46: bipush 1
      // 47: iload 5
      // 49: ifne 80
      // 4c: if_icmpne 77
      // 4f: goto 56
      // 52: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 55: athrow
      // 56: aload 2
      // 57: bipush 0
      // 58: aload 0
      // 59: getfield iww.get D
      // 5c: dastore
      // 5d: aload 2
      // 5e: bipush 1
      // 5f: aload 0
      // 60: getfield iww.pwn D
      // 63: dastore
      // 64: aload 2
      // 65: bipush 2
      // 66: aload 0
      // 67: getfield iww.c84 D
      // 6a: dastore
      // 6b: iload 5
      // 6d: ifeq c1
      // 70: goto 77
      // 73: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 76: athrow
      // 77: iload 1
      // 78: bipush 2
      // 79: goto 80
      // 7c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7f: athrow
      // 80: if_icmpne a4
      // 83: aload 2
      // 84: bipush 0
      // 85: aload 0
      // 86: getfield iww.y7q D
      // 89: dastore
      // 8a: aload 2
      // 8b: bipush 1
      // 8c: aload 0
      // 8d: getfield iww._o7 D
      // 90: dastore
      // 91: aload 2
      // 92: bipush 2
      // 93: aload 0
      // 94: getfield iww.ffq D
      // 97: dastore
      // 98: iload 5
      // 9a: ifeq c1
      // 9d: goto a4
      // a0: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a3: athrow
      // a4: new java/lang/ArrayIndexOutOfBoundsException
      // a7: dup
      // a8: sipush 31575
      // ab: ldc2_w 4358572592382679496
      // ae: lload 3
      // af: lxor
      // b0: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: nop
      // b6: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // b9: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // bc: athrow
      // bd: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c0: athrow
      // c1: return
   }

   public final void qpv(int param1, qhn param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iww.a J
      // 03: ldc2_w 112834059793489
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: iload 5
      // 10: ifeq 49
      // 13: ifne 41
      // 16: goto 1d
      // 19: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: aload 2
      // 1e: aload 0
      // 1f: getfield iww.lxb D
      // 22: putfield qhn.v54 D
      // 25: aload 2
      // 26: aload 0
      // 27: getfield iww.get D
      // 2a: putfield qhn.g0w D
      // 2d: aload 2
      // 2e: aload 0
      // 2f: getfield iww.y7q D
      // 32: putfield qhn.mu9 D
      // 35: iload 5
      // 37: ifne ca
      // 3a: goto 41
      // 3d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 40: athrow
      // 41: iload 1
      // 42: goto 49
      // 45: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: bipush 1
      // 4a: iload 5
      // 4c: ifeq 86
      // 4f: if_icmpne 7d
      // 52: goto 59
      // 55: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 58: athrow
      // 59: aload 2
      // 5a: aload 0
      // 5b: getfield iww.y3c D
      // 5e: putfield qhn.v54 D
      // 61: aload 2
      // 62: aload 0
      // 63: getfield iww.pwn D
      // 66: putfield qhn.g0w D
      // 69: aload 2
      // 6a: aload 0
      // 6b: getfield iww._o7 D
      // 6e: putfield qhn.mu9 D
      // 71: iload 5
      // 73: ifne ca
      // 76: goto 7d
      // 79: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7c: athrow
      // 7d: iload 1
      // 7e: bipush 2
      // 7f: goto 86
      // 82: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 85: athrow
      // 86: if_icmpne ad
      // 89: aload 2
      // 8a: aload 0
      // 8b: getfield iww.bhd D
      // 8e: putfield qhn.v54 D
      // 91: aload 2
      // 92: aload 0
      // 93: getfield iww.c84 D
      // 96: putfield qhn.g0w D
      // 99: aload 2
      // 9a: aload 0
      // 9b: getfield iww.ffq D
      // 9e: putfield qhn.mu9 D
      // a1: iload 5
      // a3: ifne ca
      // a6: goto ad
      // a9: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ac: athrow
      // ad: new java/lang/ArrayIndexOutOfBoundsException
      // b0: dup
      // b1: sipush 28052
      // b4: ldc2_w 8048950653167699950
      // b7: lload 3
      // b8: lxor
      // b9: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: nop
      // bf: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // c2: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // c5: athrow
      // c6: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c9: athrow
      // ca: return
   }

   public final void qh_(int param1, double[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iww.a J
      // 03: ldc2_w 40039260342490
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: iload 5
      // 10: ifne 46
      // 13: ifne 3e
      // 16: goto 1d
      // 19: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: aload 2
      // 1e: bipush 0
      // 1f: aload 0
      // 20: getfield iww.lxb D
      // 23: dastore
      // 24: aload 2
      // 25: bipush 1
      // 26: aload 0
      // 27: getfield iww.get D
      // 2a: dastore
      // 2b: aload 2
      // 2c: bipush 2
      // 2d: aload 0
      // 2e: getfield iww.y7q D
      // 31: dastore
      // 32: iload 5
      // 34: ifeq c1
      // 37: goto 3e
      // 3a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: iload 1
      // 3f: goto 46
      // 42: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 45: athrow
      // 46: bipush 1
      // 47: iload 5
      // 49: ifne 80
      // 4c: if_icmpne 77
      // 4f: goto 56
      // 52: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 55: athrow
      // 56: aload 2
      // 57: bipush 0
      // 58: aload 0
      // 59: getfield iww.y3c D
      // 5c: dastore
      // 5d: aload 2
      // 5e: bipush 1
      // 5f: aload 0
      // 60: getfield iww.pwn D
      // 63: dastore
      // 64: aload 2
      // 65: bipush 2
      // 66: aload 0
      // 67: getfield iww._o7 D
      // 6a: dastore
      // 6b: iload 5
      // 6d: ifeq c1
      // 70: goto 77
      // 73: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 76: athrow
      // 77: iload 1
      // 78: bipush 2
      // 79: goto 80
      // 7c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7f: athrow
      // 80: if_icmpne a4
      // 83: aload 2
      // 84: bipush 0
      // 85: aload 0
      // 86: getfield iww.bhd D
      // 89: dastore
      // 8a: aload 2
      // 8b: bipush 1
      // 8c: aload 0
      // 8d: getfield iww.c84 D
      // 90: dastore
      // 91: aload 2
      // 92: bipush 2
      // 93: aload 0
      // 94: getfield iww.ffq D
      // 97: dastore
      // 98: iload 5
      // 9a: ifeq c1
      // 9d: goto a4
      // a0: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a3: athrow
      // a4: new java/lang/ArrayIndexOutOfBoundsException
      // a7: dup
      // a8: sipush 10062
      // ab: ldc2_w 8110405602088055218
      // ae: lload 3
      // af: lxor
      // b0: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: nop
      // b6: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // b9: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // bc: athrow
      // bd: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c0: athrow
      // c1: return
   }

   public final void bx_(int param1, double param2, double param4, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iww.a J
      // 03: ldc2_w 110502477695547
      // 06: lxor
      // 07: lstore 8
      // 09: invokestatic t9d.c ()I
      // 0c: istore 10
      // 0e: iload 1
      // 0f: tableswitch 112 0 2 25 54 83
      // 28: aload 0
      // 29: dload 2
      // 2a: putfield iww.lxb D
      // 2d: aload 0
      // 2e: dload 4
      // 30: putfield iww.y3c D
      // 33: aload 0
      // 34: dload 6
      // 36: putfield iww.bhd D
      // 39: iload 10
      // 3b: ifeq 9d
      // 3e: goto 45
      // 41: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 44: athrow
      // 45: aload 0
      // 46: dload 2
      // 47: putfield iww.get D
      // 4a: aload 0
      // 4b: dload 4
      // 4d: putfield iww.pwn D
      // 50: aload 0
      // 51: dload 6
      // 53: putfield iww.c84 D
      // 56: iload 10
      // 58: ifeq 9d
      // 5b: goto 62
      // 5e: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 61: athrow
      // 62: aload 0
      // 63: dload 2
      // 64: putfield iww.y7q D
      // 67: aload 0
      // 68: dload 4
      // 6a: putfield iww._o7 D
      // 6d: aload 0
      // 6e: dload 6
      // 70: putfield iww.ffq D
      // 73: iload 10
      // 75: ifeq 9d
      // 78: goto 7f
      // 7b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7e: athrow
      // 7f: new java/lang/ArrayIndexOutOfBoundsException
      // 82: dup
      // 83: sipush 27480
      // 86: ldc2_w 7858930980775952201
      // 89: lload 8
      // 8b: lxor
      // 8c: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: nop
      // 92: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 95: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 98: athrow
      // 99: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9c: athrow
      // 9d: return
   }

   public final void van(int param1, qhn param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iww.a J
      // 03: ldc2_w 130307808955949
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 134 0 2 26 62 98
      // 28: aload 0
      // 29: aload 2
      // 2a: getfield qhn.v54 D
      // 2d: putfield iww.lxb D
      // 30: aload 0
      // 31: aload 2
      // 32: getfield qhn.g0w D
      // 35: putfield iww.y3c D
      // 38: aload 0
      // 39: aload 2
      // 3a: getfield qhn.mu9 D
      // 3d: putfield iww.bhd D
      // 40: iload 5
      // 42: ifne b1
      // 45: goto 4c
      // 48: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 2
      // 4e: getfield qhn.v54 D
      // 51: putfield iww.get D
      // 54: aload 0
      // 55: aload 2
      // 56: getfield qhn.g0w D
      // 59: putfield iww.pwn D
      // 5c: aload 0
      // 5d: aload 2
      // 5e: getfield qhn.mu9 D
      // 61: putfield iww.c84 D
      // 64: iload 5
      // 66: ifne b1
      // 69: goto 70
      // 6c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6f: athrow
      // 70: aload 0
      // 71: aload 2
      // 72: getfield qhn.v54 D
      // 75: putfield iww.y7q D
      // 78: aload 0
      // 79: aload 2
      // 7a: getfield qhn.g0w D
      // 7d: putfield iww._o7 D
      // 80: aload 0
      // 81: aload 2
      // 82: getfield qhn.mu9 D
      // 85: putfield iww.ffq D
      // 88: iload 5
      // 8a: ifne b1
      // 8d: goto 94
      // 90: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 93: athrow
      // 94: new java/lang/ArrayIndexOutOfBoundsException
      // 97: dup
      // 98: sipush 4681
      // 9b: ldc2_w 2225390531852993101
      // 9e: lload 3
      // 9f: lxor
      // a0: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: nop
      // a6: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // a9: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // ac: athrow
      // ad: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b0: athrow
      // b1: return
   }

   public final void _vf(int param1, double[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iww.a J
      // 03: ldc2_w 26203066744941
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 125 0 2 26 59 92
      // 28: aload 0
      // 29: aload 2
      // 2a: bipush 0
      // 2b: daload
      // 2c: putfield iww.lxb D
      // 2f: aload 0
      // 30: aload 2
      // 31: bipush 1
      // 32: daload
      // 33: putfield iww.y3c D
      // 36: aload 0
      // 37: aload 2
      // 38: bipush 2
      // 39: daload
      // 3a: putfield iww.bhd D
      // 3d: iload 5
      // 3f: ifeq a8
      // 42: goto 49
      // 45: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 2
      // 4b: bipush 0
      // 4c: daload
      // 4d: putfield iww.get D
      // 50: aload 0
      // 51: aload 2
      // 52: bipush 1
      // 53: daload
      // 54: putfield iww.pwn D
      // 57: aload 0
      // 58: aload 2
      // 59: bipush 2
      // 5a: daload
      // 5b: putfield iww.c84 D
      // 5e: iload 5
      // 60: ifeq a8
      // 63: goto 6a
      // 66: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 69: athrow
      // 6a: aload 0
      // 6b: aload 2
      // 6c: bipush 0
      // 6d: daload
      // 6e: putfield iww.y7q D
      // 71: aload 0
      // 72: aload 2
      // 73: bipush 1
      // 74: daload
      // 75: putfield iww._o7 D
      // 78: aload 0
      // 79: aload 2
      // 7a: bipush 2
      // 7b: daload
      // 7c: putfield iww.ffq D
      // 7f: iload 5
      // 81: ifeq a8
      // 84: goto 8b
      // 87: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8a: athrow
      // 8b: new java/lang/ArrayIndexOutOfBoundsException
      // 8e: dup
      // 8f: sipush 27480
      // 92: ldc2_w 7859057610981651743
      // 95: lload 3
      // 96: lxor
      // 97: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: nop
      // 9d: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // a0: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // a3: athrow
      // a4: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a7: athrow
      // a8: return
   }

   public final void qqj(int param1, double param2, double param4, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iww.a J
      // 03: ldc2_w 25589856205093
      // 06: lxor
      // 07: lstore 8
      // 09: invokestatic t9d.b ()I
      // 0c: istore 10
      // 0e: iload 1
      // 0f: tableswitch 112 0 2 25 54 83
      // 28: aload 0
      // 29: dload 2
      // 2a: putfield iww.lxb D
      // 2d: aload 0
      // 2e: dload 4
      // 30: putfield iww.get D
      // 33: aload 0
      // 34: dload 6
      // 36: putfield iww.y7q D
      // 39: iload 10
      // 3b: ifne 9d
      // 3e: goto 45
      // 41: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 44: athrow
      // 45: aload 0
      // 46: dload 2
      // 47: putfield iww.y3c D
      // 4a: aload 0
      // 4b: dload 4
      // 4d: putfield iww.pwn D
      // 50: aload 0
      // 51: dload 6
      // 53: putfield iww._o7 D
      // 56: iload 10
      // 58: ifne 9d
      // 5b: goto 62
      // 5e: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 61: athrow
      // 62: aload 0
      // 63: dload 2
      // 64: putfield iww.bhd D
      // 67: aload 0
      // 68: dload 4
      // 6a: putfield iww.c84 D
      // 6d: aload 0
      // 6e: dload 6
      // 70: putfield iww.ffq D
      // 73: iload 10
      // 75: ifne 9d
      // 78: goto 7f
      // 7b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7e: athrow
      // 7f: new java/lang/ArrayIndexOutOfBoundsException
      // 82: dup
      // 83: sipush 15632
      // 86: ldc2_w 1247977300148902427
      // 89: lload 8
      // 8b: lxor
      // 8c: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: nop
      // 92: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 95: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 98: athrow
      // 99: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9c: athrow
      // 9d: return
   }

   public final void chf(int param1, qhn param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iww.a J
      // 03: ldc2_w 66723969712474
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 134 0 2 26 62 98
      // 28: aload 0
      // 29: aload 2
      // 2a: getfield qhn.v54 D
      // 2d: putfield iww.lxb D
      // 30: aload 0
      // 31: aload 2
      // 32: getfield qhn.g0w D
      // 35: putfield iww.get D
      // 38: aload 0
      // 39: aload 2
      // 3a: getfield qhn.mu9 D
      // 3d: putfield iww.y7q D
      // 40: iload 5
      // 42: ifne b1
      // 45: goto 4c
      // 48: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 2
      // 4e: getfield qhn.v54 D
      // 51: putfield iww.y3c D
      // 54: aload 0
      // 55: aload 2
      // 56: getfield qhn.g0w D
      // 59: putfield iww.pwn D
      // 5c: aload 0
      // 5d: aload 2
      // 5e: getfield qhn.mu9 D
      // 61: putfield iww._o7 D
      // 64: iload 5
      // 66: ifne b1
      // 69: goto 70
      // 6c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6f: athrow
      // 70: aload 0
      // 71: aload 2
      // 72: getfield qhn.v54 D
      // 75: putfield iww.bhd D
      // 78: aload 0
      // 79: aload 2
      // 7a: getfield qhn.g0w D
      // 7d: putfield iww.c84 D
      // 80: aload 0
      // 81: aload 2
      // 82: getfield qhn.mu9 D
      // 85: putfield iww.ffq D
      // 88: iload 5
      // 8a: ifne b1
      // 8d: goto 94
      // 90: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 93: athrow
      // 94: new java/lang/ArrayIndexOutOfBoundsException
      // 97: dup
      // 98: sipush 15632
      // 9b: ldc2_w 1247953769781191268
      // 9e: lload 3
      // 9f: lxor
      // a0: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: nop
      // a6: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // a9: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // ac: athrow
      // ad: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b0: athrow
      // b1: return
   }

   public final void msc(int param1, double[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iww.a J
      // 03: ldc2_w 39952882079286
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 125 0 2 26 59 92
      // 28: aload 0
      // 29: aload 2
      // 2a: bipush 0
      // 2b: daload
      // 2c: putfield iww.lxb D
      // 2f: aload 0
      // 30: aload 2
      // 31: bipush 1
      // 32: daload
      // 33: putfield iww.get D
      // 36: aload 0
      // 37: aload 2
      // 38: bipush 2
      // 39: daload
      // 3a: putfield iww.y7q D
      // 3d: iload 5
      // 3f: ifne a8
      // 42: goto 49
      // 45: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 2
      // 4b: bipush 0
      // 4c: daload
      // 4d: putfield iww.y3c D
      // 50: aload 0
      // 51: aload 2
      // 52: bipush 1
      // 53: daload
      // 54: putfield iww.pwn D
      // 57: aload 0
      // 58: aload 2
      // 59: bipush 2
      // 5a: daload
      // 5b: putfield iww._o7 D
      // 5e: iload 5
      // 60: ifne a8
      // 63: goto 6a
      // 66: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 69: athrow
      // 6a: aload 0
      // 6b: aload 2
      // 6c: bipush 0
      // 6d: daload
      // 6e: putfield iww.bhd D
      // 71: aload 0
      // 72: aload 2
      // 73: bipush 1
      // 74: daload
      // 75: putfield iww.c84 D
      // 78: aload 0
      // 79: aload 2
      // 7a: bipush 2
      // 7b: daload
      // 7c: putfield iww.ffq D
      // 7f: iload 5
      // 81: ifne a8
      // 84: goto 8b
      // 87: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8a: athrow
      // 8b: new java/lang/ArrayIndexOutOfBoundsException
      // 8e: dup
      // 8f: sipush 23590
      // 92: ldc2_w 6879617092731032636
      // 95: lload 3
      // 96: lxor
      // 97: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: nop
      // 9d: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // a0: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // a3: athrow
      // a4: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a7: athrow
      // a8: return
   }

   public final double k_b() {
      double[] var1 = new double[3];
      double[] var2 = new double[9];
      this.oa4(var1, var2);
      return okm(var1);
   }

   public final void vrl(double var1) {
      this.lxb += var1;
      this.y3c += var1;
      this.bhd += var1;
      this.get += var1;
      this.pwn += var1;
      this.c84 += var1;
      this.y7q += var1;
      this._o7 += var1;
      this.ffq += var1;
   }

   public final void ds1(double var1, iww var3) {
      this.lxb = var3.lxb + var1;
      this.y3c = var3.y3c + var1;
      this.bhd = var3.bhd + var1;
      this.get = var3.get + var1;
      this.pwn = var3.pwn + var1;
      this.c84 = var3.c84 + var1;
      this.y7q = var3.y7q + var1;
      this._o7 = var3._o7 + var1;
      this.ffq = var3.ffq + var1;
   }

   public final void v4d(iww var1, iww var2) {
      this.lxb = var1.lxb + var2.lxb;
      this.y3c = var1.y3c + var2.y3c;
      this.bhd = var1.bhd + var2.bhd;
      this.get = var1.get + var2.get;
      this.pwn = var1.pwn + var2.pwn;
      this.c84 = var1.c84 + var2.c84;
      this.y7q = var1.y7q + var2.y7q;
      this._o7 = var1._o7 + var2._o7;
      this.ffq = var1.ffq + var2.ffq;
   }

   public final void drp(iww var1) {
      this.lxb = this.lxb + var1.lxb;
      this.y3c = this.y3c + var1.y3c;
      this.bhd = this.bhd + var1.bhd;
      this.get = this.get + var1.get;
      this.pwn = this.pwn + var1.pwn;
      this.c84 = this.c84 + var1.c84;
      this.y7q = this.y7q + var1.y7q;
      this._o7 = this._o7 + var1._o7;
      this.ffq = this.ffq + var1.ffq;
   }

   public final void mx4(iww var1, iww var2) {
      this.lxb = var1.lxb - var2.lxb;
      this.y3c = var1.y3c - var2.y3c;
      this.bhd = var1.bhd - var2.bhd;
      this.get = var1.get - var2.get;
      this.pwn = var1.pwn - var2.pwn;
      this.c84 = var1.c84 - var2.c84;
      this.y7q = var1.y7q - var2.y7q;
      this._o7 = var1._o7 - var2._o7;
      this.ffq = var1.ffq - var2.ffq;
   }

   public final void xv0(iww var1) {
      this.lxb = this.lxb - var1.lxb;
      this.y3c = this.y3c - var1.y3c;
      this.bhd = this.bhd - var1.bhd;
      this.get = this.get - var1.get;
      this.pwn = this.pwn - var1.pwn;
      this.c84 = this.c84 - var1.c84;
      this.y7q = this.y7q - var1.y7q;
      this._o7 = this._o7 - var1._o7;
      this.ffq = this.ffq - var1.ffq;
   }

   public final void bmf() {
      double var1 = this.get;
      this.get = this.y3c;
      this.y3c = var1;
      var1 = this.y7q;
      this.y7q = this.bhd;
      this.bhd = var1;
      var1 = this._o7;
      this._o7 = this.c84;
      this.c84 = var1;
   }

   public final void izv(iww param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 6f
      // 09: aload 1
      // 0a: if_acmpeq 67
      // 0d: goto 14
      // 10: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: aload 0
      // 15: aload 1
      // 16: getfield iww.lxb D
      // 19: putfield iww.lxb D
      // 1c: aload 0
      // 1d: aload 1
      // 1e: getfield iww.get D
      // 21: putfield iww.y3c D
      // 24: aload 0
      // 25: aload 1
      // 26: getfield iww.y7q D
      // 29: putfield iww.bhd D
      // 2c: aload 0
      // 2d: aload 1
      // 2e: getfield iww.y3c D
      // 31: putfield iww.get D
      // 34: aload 0
      // 35: aload 1
      // 36: getfield iww.pwn D
      // 39: putfield iww.pwn D
      // 3c: aload 0
      // 3d: aload 1
      // 3e: getfield iww._o7 D
      // 41: putfield iww.c84 D
      // 44: aload 0
      // 45: aload 1
      // 46: getfield iww.bhd D
      // 49: putfield iww.y7q D
      // 4c: aload 0
      // 4d: aload 1
      // 4e: getfield iww.c84 D
      // 51: putfield iww._o7 D
      // 54: aload 0
      // 55: aload 1
      // 56: getfield iww.ffq D
      // 59: putfield iww.ffq D
      // 5c: iload 2
      // 5d: ifeq 72
      // 60: goto 67
      // 63: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 66: athrow
      // 67: aload 0
      // 68: goto 6f
      // 6b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6e: athrow
      // 6f: invokevirtual iww.bmf ()V
      // 72: return
   }

   public final void g17(nbf var1) {
      this.lxb = 1.0 - 2.0 * var1.pf8 * var1.pf8 - 2.0 * var1.jfe * var1.jfe;
      this.get = 2.0 * (var1.yme * var1.pf8 + var1.ggc * var1.jfe);
      this.y7q = 2.0 * (var1.yme * var1.jfe - var1.ggc * var1.pf8);
      this.y3c = 2.0 * (var1.yme * var1.pf8 - var1.ggc * var1.jfe);
      this.pwn = 1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.jfe * var1.jfe;
      this._o7 = 2.0 * (var1.pf8 * var1.jfe + var1.ggc * var1.yme);
      this.bhd = 2.0 * (var1.yme * var1.jfe + var1.ggc * var1.pf8);
      this.c84 = 2.0 * (var1.pf8 * var1.jfe - var1.ggc * var1.yme);
      this.ffq = 1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.pf8 * var1.pf8;
   }

   public final void dps(lg5 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: getfield lg5.fs3 D
      // 008: aload 1
      // 009: getfield lg5.fs3 D
      // 00c: dmul
      // 00d: aload 1
      // 00e: getfield lg5.j4q D
      // 011: aload 1
      // 012: getfield lg5.j4q D
      // 015: dmul
      // 016: dadd
      // 017: aload 1
      // 018: getfield lg5.fki D
      // 01b: aload 1
      // 01c: getfield lg5.fki D
      // 01f: dmul
      // 020: dadd
      // 021: invokestatic java/lang/Math.sqrt (D)D
      // 024: dstore 3
      // 025: dload 3
      // 026: ldc2_w 1.110223024E-16
      // 029: iload 2
      // 02a: ifne 079
      // 02d: dcmpg
      // 02e: ifge 070
      // 031: goto 038
      // 034: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 037: athrow
      // 038: aload 0
      // 039: dconst_1
      // 03a: putfield iww.lxb D
      // 03d: aload 0
      // 03e: dconst_0
      // 03f: putfield iww.y3c D
      // 042: aload 0
      // 043: dconst_0
      // 044: putfield iww.bhd D
      // 047: aload 0
      // 048: dconst_0
      // 049: putfield iww.get D
      // 04c: aload 0
      // 04d: dconst_1
      // 04e: putfield iww.pwn D
      // 051: aload 0
      // 052: dconst_0
      // 053: putfield iww.c84 D
      // 056: aload 0
      // 057: dconst_0
      // 058: putfield iww.y7q D
      // 05b: aload 0
      // 05c: dconst_0
      // 05d: putfield iww._o7 D
      // 060: aload 0
      // 061: dconst_1
      // 062: putfield iww.ffq D
      // 065: iload 2
      // 066: ifeq 140
      // 069: goto 070
      // 06c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06f: athrow
      // 070: dconst_1
      // 071: dload 3
      // 072: ddiv
      // 073: dstore 3
      // 074: aload 1
      // 075: getfield lg5.fs3 D
      // 078: dload 3
      // 079: dmul
      // 07a: dstore 5
      // 07c: aload 1
      // 07d: getfield lg5.j4q D
      // 080: dload 3
      // 081: dmul
      // 082: dstore 7
      // 084: aload 1
      // 085: getfield lg5.fki D
      // 088: dload 3
      // 089: dmul
      // 08a: dstore 9
      // 08c: aload 1
      // 08d: getfield lg5.ezi D
      // 090: invokestatic java/lang/Math.sin (D)D
      // 093: dstore 11
      // 095: aload 1
      // 096: getfield lg5.ezi D
      // 099: invokestatic java/lang/Math.cos (D)D
      // 09c: dstore 13
      // 09e: dconst_1
      // 09f: dload 13
      // 0a1: dsub
      // 0a2: dstore 15
      // 0a4: dload 5
      // 0a6: dload 9
      // 0a8: dmul
      // 0a9: dstore 17
      // 0ab: dload 5
      // 0ad: dload 7
      // 0af: dmul
      // 0b0: dstore 19
      // 0b2: dload 7
      // 0b4: dload 9
      // 0b6: dmul
      // 0b7: dstore 21
      // 0b9: aload 0
      // 0ba: dload 15
      // 0bc: dload 5
      // 0be: dmul
      // 0bf: dload 5
      // 0c1: dmul
      // 0c2: dload 13
      // 0c4: dadd
      // 0c5: putfield iww.lxb D
      // 0c8: aload 0
      // 0c9: dload 15
      // 0cb: dload 19
      // 0cd: dmul
      // 0ce: dload 11
      // 0d0: dload 9
      // 0d2: dmul
      // 0d3: dsub
      // 0d4: putfield iww.y3c D
      // 0d7: aload 0
      // 0d8: dload 15
      // 0da: dload 17
      // 0dc: dmul
      // 0dd: dload 11
      // 0df: dload 7
      // 0e1: dmul
      // 0e2: dadd
      // 0e3: putfield iww.bhd D
      // 0e6: aload 0
      // 0e7: dload 15
      // 0e9: dload 19
      // 0eb: dmul
      // 0ec: dload 11
      // 0ee: dload 9
      // 0f0: dmul
      // 0f1: dadd
      // 0f2: putfield iww.get D
      // 0f5: aload 0
      // 0f6: dload 15
      // 0f8: dload 7
      // 0fa: dmul
      // 0fb: dload 7
      // 0fd: dmul
      // 0fe: dload 13
      // 100: dadd
      // 101: putfield iww.pwn D
      // 104: aload 0
      // 105: dload 15
      // 107: dload 21
      // 109: dmul
      // 10a: dload 11
      // 10c: dload 5
      // 10e: dmul
      // 10f: dsub
      // 110: putfield iww.c84 D
      // 113: aload 0
      // 114: dload 15
      // 116: dload 17
      // 118: dmul
      // 119: dload 11
      // 11b: dload 7
      // 11d: dmul
      // 11e: dsub
      // 11f: putfield iww.y7q D
      // 122: aload 0
      // 123: dload 15
      // 125: dload 21
      // 127: dmul
      // 128: dload 11
      // 12a: dload 5
      // 12c: dmul
      // 12d: dadd
      // 12e: putfield iww._o7 D
      // 131: aload 0
      // 132: dload 15
      // 134: dload 9
      // 136: dmul
      // 137: dload 9
      // 139: dmul
      // 13a: dload 13
      // 13c: dadd
      // 13d: putfield iww.ffq D
      // 140: return
   }

   public final void nth(lwt var1) {
      this.lxb = 1.0 - 2.0 * (double)var1.nc_ * (double)var1.nc_ - 2.0 * (double)var1.ax5 * (double)var1.ax5;
      this.get = 2.0 * (double)(var1.hp2 * var1.nc_ + var1.ck3 * var1.ax5);
      this.y7q = 2.0 * (double)(var1.hp2 * var1.ax5 - var1.ck3 * var1.nc_);
      this.y3c = 2.0 * (double)(var1.hp2 * var1.nc_ - var1.ck3 * var1.ax5);
      this.pwn = 1.0 - 2.0 * (double)var1.hp2 * (double)var1.hp2 - 2.0 * (double)var1.ax5 * (double)var1.ax5;
      this._o7 = 2.0 * (double)(var1.nc_ * var1.ax5 + var1.ck3 * var1.hp2);
      this.bhd = 2.0 * (double)(var1.hp2 * var1.ax5 + var1.ck3 * var1.nc_);
      this.c84 = 2.0 * (double)(var1.nc_ * var1.ax5 - var1.ck3 * var1.hp2);
      this.ffq = 1.0 - 2.0 * (double)var1.hp2 * (double)var1.hp2 - 2.0 * (double)var1.nc_ * (double)var1.nc_;
   }

   public final void ebn(ll8 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: getfield ll8._5i F
      // 008: aload 1
      // 009: getfield ll8._5i F
      // 00c: fmul
      // 00d: aload 1
      // 00e: getfield ll8.w5z F
      // 011: aload 1
      // 012: getfield ll8.w5z F
      // 015: fmul
      // 016: fadd
      // 017: aload 1
      // 018: getfield ll8.yz_ F
      // 01b: aload 1
      // 01c: getfield ll8.yz_ F
      // 01f: fmul
      // 020: fadd
      // 021: f2d
      // 022: invokestatic java/lang/Math.sqrt (D)D
      // 025: dstore 3
      // 026: dload 3
      // 027: ldc2_w 1.110223024E-16
      // 02a: iload 2
      // 02b: ifeq 07b
      // 02e: dcmpg
      // 02f: ifge 071
      // 032: goto 039
      // 035: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 038: athrow
      // 039: aload 0
      // 03a: dconst_1
      // 03b: putfield iww.lxb D
      // 03e: aload 0
      // 03f: dconst_0
      // 040: putfield iww.y3c D
      // 043: aload 0
      // 044: dconst_0
      // 045: putfield iww.bhd D
      // 048: aload 0
      // 049: dconst_0
      // 04a: putfield iww.get D
      // 04d: aload 0
      // 04e: dconst_1
      // 04f: putfield iww.pwn D
      // 052: aload 0
      // 053: dconst_0
      // 054: putfield iww.c84 D
      // 057: aload 0
      // 058: dconst_0
      // 059: putfield iww.y7q D
      // 05c: aload 0
      // 05d: dconst_0
      // 05e: putfield iww._o7 D
      // 061: aload 0
      // 062: dconst_1
      // 063: putfield iww.ffq D
      // 066: iload 2
      // 067: ifne 146
      // 06a: goto 071
      // 06d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 070: athrow
      // 071: dconst_1
      // 072: dload 3
      // 073: ddiv
      // 074: dstore 3
      // 075: aload 1
      // 076: getfield ll8._5i F
      // 079: f2d
      // 07a: dload 3
      // 07b: dmul
      // 07c: dstore 5
      // 07e: aload 1
      // 07f: getfield ll8.w5z F
      // 082: f2d
      // 083: dload 3
      // 084: dmul
      // 085: dstore 7
      // 087: aload 1
      // 088: getfield ll8.yz_ F
      // 08b: f2d
      // 08c: dload 3
      // 08d: dmul
      // 08e: dstore 9
      // 090: aload 1
      // 091: getfield ll8.b77 F
      // 094: f2d
      // 095: invokestatic java/lang/Math.sin (D)D
      // 098: dstore 11
      // 09a: aload 1
      // 09b: getfield ll8.b77 F
      // 09e: f2d
      // 09f: invokestatic java/lang/Math.cos (D)D
      // 0a2: dstore 13
      // 0a4: dconst_1
      // 0a5: dload 13
      // 0a7: dsub
      // 0a8: dstore 15
      // 0aa: dload 5
      // 0ac: dload 9
      // 0ae: dmul
      // 0af: dstore 17
      // 0b1: dload 5
      // 0b3: dload 7
      // 0b5: dmul
      // 0b6: dstore 19
      // 0b8: dload 7
      // 0ba: dload 9
      // 0bc: dmul
      // 0bd: dstore 21
      // 0bf: aload 0
      // 0c0: dload 15
      // 0c2: dload 5
      // 0c4: dmul
      // 0c5: dload 5
      // 0c7: dmul
      // 0c8: dload 13
      // 0ca: dadd
      // 0cb: putfield iww.lxb D
      // 0ce: aload 0
      // 0cf: dload 15
      // 0d1: dload 19
      // 0d3: dmul
      // 0d4: dload 11
      // 0d6: dload 9
      // 0d8: dmul
      // 0d9: dsub
      // 0da: putfield iww.y3c D
      // 0dd: aload 0
      // 0de: dload 15
      // 0e0: dload 17
      // 0e2: dmul
      // 0e3: dload 11
      // 0e5: dload 7
      // 0e7: dmul
      // 0e8: dadd
      // 0e9: putfield iww.bhd D
      // 0ec: aload 0
      // 0ed: dload 15
      // 0ef: dload 19
      // 0f1: dmul
      // 0f2: dload 11
      // 0f4: dload 9
      // 0f6: dmul
      // 0f7: dadd
      // 0f8: putfield iww.get D
      // 0fb: aload 0
      // 0fc: dload 15
      // 0fe: dload 7
      // 100: dmul
      // 101: dload 7
      // 103: dmul
      // 104: dload 13
      // 106: dadd
      // 107: putfield iww.pwn D
      // 10a: aload 0
      // 10b: dload 15
      // 10d: dload 21
      // 10f: dmul
      // 110: dload 11
      // 112: dload 5
      // 114: dmul
      // 115: dsub
      // 116: putfield iww.c84 D
      // 119: aload 0
      // 11a: dload 15
      // 11c: dload 17
      // 11e: dmul
      // 11f: dload 11
      // 121: dload 7
      // 123: dmul
      // 124: dsub
      // 125: putfield iww.y7q D
      // 128: aload 0
      // 129: dload 15
      // 12b: dload 21
      // 12d: dmul
      // 12e: dload 11
      // 130: dload 5
      // 132: dmul
      // 133: dadd
      // 134: putfield iww._o7 D
      // 137: aload 0
      // 138: dload 15
      // 13a: dload 9
      // 13c: dmul
      // 13d: dload 9
      // 13f: dmul
      // 140: dload 13
      // 142: dadd
      // 143: putfield iww.ffq D
      // 146: return
   }

   public final void sil(nvj var1) {
      this.lxb = (double)var1.i2i;
      this.y3c = (double)var1.k12;
      this.bhd = (double)var1.xu6;
      this.get = (double)var1._id;
      this.pwn = (double)var1.aoj;
      this.c84 = (double)var1.zk_;
      this.y7q = (double)var1.aqg;
      this._o7 = (double)var1.wdt;
      this.ffq = (double)var1.jr8;
   }

   public final void q4q(iww var1) {
      this.lxb = var1.lxb;
      this.y3c = var1.y3c;
      this.bhd = var1.bhd;
      this.get = var1.get;
      this.pwn = var1.pwn;
      this.c84 = var1.c84;
      this.y7q = var1.y7q;
      this._o7 = var1._o7;
      this.ffq = var1.ffq;
   }

   public final void qqo(double[] var1) {
      this.lxb = var1[0];
      this.y3c = var1[1];
      this.bhd = var1[2];
      this.get = var1[3];
      this.pwn = var1[4];
      this.c84 = var1[5];
      this.y7q = var1[6];
      this._o7 = var1[7];
      this.ffq = var1[8];
   }

   public final void _99(iww var1) {
      this.syf(var1);
   }

   public final void wjl() {
      this.syf(this);
   }

   private final void syf(iww param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic iww.a J
      // 003: ldc2_w 68354002213214
      // 006: lxor
      // 007: lstore 2
      // 008: bipush 9
      // 00a: newarray 7
      // 00c: astore 5
      // 00e: bipush 3
      // 00f: newarray 10
      // 011: astore 6
      // 013: invokestatic t9d.c ()I
      // 016: bipush 9
      // 018: newarray 7
      // 01a: astore 8
      // 01c: aload 8
      // 01e: bipush 0
      // 01f: aload 1
      // 020: getfield iww.lxb D
      // 023: dastore
      // 024: aload 8
      // 026: bipush 1
      // 027: aload 1
      // 028: getfield iww.y3c D
      // 02b: dastore
      // 02c: aload 8
      // 02e: bipush 2
      // 02f: aload 1
      // 030: getfield iww.bhd D
      // 033: dastore
      // 034: aload 8
      // 036: bipush 3
      // 037: aload 1
      // 038: getfield iww.get D
      // 03b: dastore
      // 03c: aload 8
      // 03e: bipush 4
      // 03f: aload 1
      // 040: getfield iww.pwn D
      // 043: dastore
      // 044: aload 8
      // 046: bipush 5
      // 047: aload 1
      // 048: getfield iww.c84 D
      // 04b: dastore
      // 04c: aload 8
      // 04e: bipush 6
      // 050: aload 1
      // 051: getfield iww.y7q D
      // 054: dastore
      // 055: istore 4
      // 057: aload 8
      // 059: bipush 7
      // 05b: aload 1
      // 05c: getfield iww._o7 D
      // 05f: dastore
      // 060: aload 8
      // 062: bipush 8
      // 064: aload 1
      // 065: getfield iww.ffq D
      // 068: dastore
      // 069: aload 8
      // 06b: aload 6
      // 06d: invokestatic iww.hze ([D[I)Z
      // 070: iload 4
      // 072: ifne 09d
      // 075: ifne 09c
      // 078: goto 07f
      // 07b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07e: athrow
      // 07f: new fgk
      // 082: dup
      // 083: sipush 30487
      // 086: ldc2_w 2339800751126917217
      // 089: lload 2
      // 08a: lxor
      // 08b: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: nop
      // 091: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 094: invokespecial fgk.<init> (Ljava/lang/String;)V
      // 097: athrow
      // 098: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09b: athrow
      // 09c: bipush 0
      // 09d: istore 7
      // 09f: iload 7
      // 0a1: bipush 9
      // 0a3: if_icmpge 0c0
      // 0a6: aload 5
      // 0a8: iload 7
      // 0aa: dconst_0
      // 0ab: dastore
      // 0ac: iinc 7 1
      // 0af: iload 4
      // 0b1: ifne 124
      // 0b4: iload 4
      // 0b6: ifeq 09f
      // 0b9: goto 0c0
      // 0bc: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0bf: athrow
      // 0c0: aload 5
      // 0c2: bipush 0
      // 0c3: dconst_1
      // 0c4: dastore
      // 0c5: aload 5
      // 0c7: bipush 4
      // 0c8: dconst_1
      // 0c9: dastore
      // 0ca: aload 5
      // 0cc: bipush 8
      // 0ce: dconst_1
      // 0cf: dastore
      // 0d0: aload 8
      // 0d2: aload 6
      // 0d4: aload 5
      // 0d6: invokestatic iww.dks ([D[I[D)V
      // 0d9: aload 0
      // 0da: aload 5
      // 0dc: bipush 0
      // 0dd: daload
      // 0de: putfield iww.lxb D
      // 0e1: aload 0
      // 0e2: aload 5
      // 0e4: bipush 1
      // 0e5: daload
      // 0e6: putfield iww.y3c D
      // 0e9: aload 0
      // 0ea: aload 5
      // 0ec: bipush 2
      // 0ed: daload
      // 0ee: putfield iww.bhd D
      // 0f1: aload 0
      // 0f2: aload 5
      // 0f4: bipush 3
      // 0f5: daload
      // 0f6: putfield iww.get D
      // 0f9: aload 0
      // 0fa: aload 5
      // 0fc: bipush 4
      // 0fd: daload
      // 0fe: putfield iww.pwn D
      // 101: aload 0
      // 102: aload 5
      // 104: bipush 5
      // 105: daload
      // 106: putfield iww.c84 D
      // 109: aload 0
      // 10a: aload 5
      // 10c: bipush 6
      // 10e: daload
      // 10f: putfield iww.y7q D
      // 112: aload 0
      // 113: aload 5
      // 115: bipush 7
      // 117: daload
      // 118: putfield iww._o7 D
      // 11b: aload 0
      // 11c: aload 5
      // 11e: bipush 8
      // 120: daload
      // 121: putfield iww.ffq D
      // 124: return
   }

   public static boolean hze(double[] param0, int[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic iww.a J
      // 003: ldc2_w 32040749676946
      // 006: lxor
      // 007: lstore 2
      // 008: bipush 3
      // 009: newarray 7
      // 00b: astore 5
      // 00d: bipush 0
      // 00e: istore 8
      // 010: invokestatic t9d.b ()I
      // 013: bipush 0
      // 014: istore 9
      // 016: istore 4
      // 018: bipush 3
      // 019: istore 6
      // 01b: iload 6
      // 01d: iinc 6 -1
      // 020: ifeq 095
      // 023: dconst_0
      // 024: dstore 10
      // 026: bipush 3
      // 027: iload 4
      // 029: ifeq 096
      // 02c: istore 7
      // 02e: iload 7
      // 030: iinc 7 -1
      // 033: ifeq 06f
      // 036: aload 0
      // 037: iload 8
      // 039: iinc 8 1
      // 03c: daload
      // 03d: dstore 12
      // 03f: dload 12
      // 041: invokestatic java/lang/Math.abs (D)D
      // 044: dstore 12
      // 046: dload 12
      // 048: iload 4
      // 04a: ifeq 068
      // 04d: dload 10
      // 04f: dcmpl
      // 050: iload 4
      // 052: ifeq 073
      // 055: goto 05c
      // 058: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05b: athrow
      // 05c: ifle 02e
      // 05f: goto 066
      // 062: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 065: athrow
      // 066: dload 12
      // 068: dstore 10
      // 06a: iload 4
      // 06c: ifne 02e
      // 06f: dload 10
      // 071: dconst_0
      // 072: dcmpl
      // 073: iload 4
      // 075: ifeq 083
      // 078: ifne 084
      // 07b: goto 082
      // 07e: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 081: athrow
      // 082: bipush 0
      // 083: ireturn
      // 084: aload 5
      // 086: iload 9
      // 088: iinc 9 1
      // 08b: dconst_1
      // 08c: dload 10
      // 08e: ddiv
      // 08f: dastore
      // 090: iload 4
      // 092: ifne 01b
      // 095: bipush 0
      // 096: istore 7
      // 098: bipush 0
      // 099: istore 6
      // 09b: iload 6
      // 09d: bipush 3
      // 09e: if_icmpge 2c7
      // 0a1: bipush 0
      // 0a2: iload 4
      // 0a4: ifeq 2c8
      // 0a7: istore 8
      // 0a9: iload 8
      // 0ab: iload 6
      // 0ad: if_icmpge 116
      // 0b0: iload 7
      // 0b2: bipush 3
      // 0b3: iload 8
      // 0b5: imul
      // 0b6: iadd
      // 0b7: iload 6
      // 0b9: iadd
      // 0ba: istore 11
      // 0bc: aload 0
      // 0bd: iload 11
      // 0bf: daload
      // 0c0: dstore 14
      // 0c2: iload 8
      // 0c4: istore 10
      // 0c6: iload 7
      // 0c8: bipush 3
      // 0c9: iload 8
      // 0cb: imul
      // 0cc: iadd
      // 0cd: istore 12
      // 0cf: iload 7
      // 0d1: iload 6
      // 0d3: iadd
      // 0d4: iload 4
      // 0d6: ifeq 09d
      // 0d9: istore 13
      // 0db: iload 10
      // 0dd: iinc 10 -1
      // 0e0: ifeq 108
      // 0e3: dload 14
      // 0e5: aload 0
      // 0e6: iload 12
      // 0e8: daload
      // 0e9: aload 0
      // 0ea: iload 13
      // 0ec: daload
      // 0ed: dmul
      // 0ee: dsub
      // 0ef: dstore 14
      // 0f1: iinc 12 1
      // 0f4: iinc 13 3
      // 0f7: iload 4
      // 0f9: ifeq 111
      // 0fc: iload 4
      // 0fe: ifne 0db
      // 101: goto 108
      // 104: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 107: athrow
      // 108: aload 0
      // 109: iload 11
      // 10b: dload 14
      // 10d: dastore
      // 10e: iinc 8 1
      // 111: iload 4
      // 113: ifne 0a9
      // 116: dconst_0
      // 117: dstore 16
      // 119: bipush -1
      // 11a: istore 9
      // 11c: iload 6
      // 11e: istore 8
      // 120: iload 8
      // 122: bipush 3
      // 123: if_icmpge 1b4
      // 126: iload 7
      // 128: bipush 3
      // 129: iload 8
      // 12b: imul
      // 12c: iadd
      // 12d: iload 6
      // 12f: iadd
      // 130: istore 11
      // 132: aload 0
      // 133: iload 11
      // 135: daload
      // 136: dstore 14
      // 138: iload 6
      // 13a: istore 10
      // 13c: iload 7
      // 13e: bipush 3
      // 13f: iload 8
      // 141: imul
      // 142: iadd
      // 143: istore 12
      // 145: iload 7
      // 147: iload 6
      // 149: iadd
      // 14a: iload 4
      // 14c: ifeq 1b6
      // 14f: istore 13
      // 151: iload 10
      // 153: iinc 10 -1
      // 156: ifeq 17e
      // 159: dload 14
      // 15b: aload 0
      // 15c: iload 12
      // 15e: daload
      // 15f: aload 0
      // 160: iload 13
      // 162: daload
      // 163: dmul
      // 164: dsub
      // 165: dstore 14
      // 167: iinc 12 1
      // 16a: iinc 13 3
      // 16d: iload 4
      // 16f: ifeq 184
      // 172: iload 4
      // 174: ifne 151
      // 177: goto 17e
      // 17a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17d: athrow
      // 17e: aload 0
      // 17f: iload 11
      // 181: dload 14
      // 183: dastore
      // 184: aload 5
      // 186: iload 8
      // 188: daload
      // 189: dload 14
      // 18b: invokestatic java/lang/Math.abs (D)D
      // 18e: dmul
      // 18f: dup2
      // 190: dstore 18
      // 192: dload 16
      // 194: dcmpl
      // 195: iload 4
      // 197: ifeq 1aa
      // 19a: iflt 1ac
      // 19d: goto 1a4
      // 1a0: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a3: athrow
      // 1a4: dload 18
      // 1a6: dstore 16
      // 1a8: iload 8
      // 1aa: istore 9
      // 1ac: iinc 8 1
      // 1af: iload 4
      // 1b1: ifne 120
      // 1b4: iload 9
      // 1b6: iload 4
      // 1b8: ifeq 1e4
      // 1bb: ifge 1e2
      // 1be: goto 1c5
      // 1c1: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c4: athrow
      // 1c5: new java/lang/RuntimeException
      // 1c8: dup
      // 1c9: sipush 8699
      // 1cc: ldc2_w 8508815847927645770
      // 1cf: lload 2
      // 1d0: lxor
      // 1d1: invokedynamic h (IJ)Ljava/lang/String; bsm=iww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: nop
      // 1d7: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 1da: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 1dd: athrow
      // 1de: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e1: athrow
      // 1e2: iload 6
      // 1e4: iload 4
      // 1e6: ifeq 25b
      // 1e9: iload 9
      // 1eb: if_icmpeq 247
      // 1ee: goto 1f5
      // 1f1: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f4: athrow
      // 1f5: bipush 3
      // 1f6: istore 10
      // 1f8: iload 7
      // 1fa: bipush 3
      // 1fb: iload 9
      // 1fd: imul
      // 1fe: iadd
      // 1ff: istore 12
      // 201: iload 7
      // 203: bipush 3
      // 204: iload 6
      // 206: imul
      // 207: iadd
      // 208: istore 13
      // 20a: iload 10
      // 20c: iinc 10 -1
      // 20f: ifeq 23d
      // 212: aload 0
      // 213: iload 12
      // 215: daload
      // 216: dstore 18
      // 218: aload 0
      // 219: iload 12
      // 21b: iinc 12 1
      // 21e: aload 0
      // 21f: iload 13
      // 221: daload
      // 222: dastore
      // 223: aload 0
      // 224: iload 13
      // 226: iinc 13 1
      // 229: dload 18
      // 22b: dastore
      // 22c: iload 4
      // 22e: ifeq 24d
      // 231: iload 4
      // 233: ifne 20a
      // 236: goto 23d
      // 239: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23c: athrow
      // 23d: aload 5
      // 23f: iload 9
      // 241: aload 5
      // 243: iload 6
      // 245: daload
      // 246: dastore
      // 247: aload 1
      // 248: iload 6
      // 24a: iload 9
      // 24c: iastore
      // 24d: aload 0
      // 24e: iload 7
      // 250: bipush 3
      // 251: iload 6
      // 253: imul
      // 254: iadd
      // 255: iload 6
      // 257: iadd
      // 258: daload
      // 259: dconst_0
      // 25a: dcmpl
      // 25b: iload 4
      // 25d: ifeq 272
      // 260: ifne 270
      // 263: goto 26a
      // 266: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 269: athrow
      // 26a: bipush 0
      // 26b: ireturn
      // 26c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26f: athrow
      // 270: iload 6
      // 272: bipush 2
      // 273: if_icmpeq 2bf
      // 276: dconst_1
      // 277: aload 0
      // 278: iload 7
      // 27a: bipush 3
      // 27b: iload 6
      // 27d: imul
      // 27e: iadd
      // 27f: iload 6
      // 281: iadd
      // 282: daload
      // 283: ddiv
      // 284: dstore 18
      // 286: iload 7
      // 288: bipush 3
      // 289: iload 6
      // 28b: bipush 1
      // 28c: iadd
      // 28d: imul
      // 28e: iadd
      // 28f: iload 6
      // 291: iadd
      // 292: istore 11
      // 294: bipush 2
      // 295: iload 6
      // 297: isub
      // 298: istore 8
      // 29a: iload 8
      // 29c: iinc 8 -1
      // 29f: ifeq 2bf
      // 2a2: aload 0
      // 2a3: iload 11
      // 2a5: dup2
      // 2a6: daload
      // 2a7: dload 18
      // 2a9: dmul
      // 2aa: dastore
      // 2ab: iinc 11 3
      // 2ae: iload 4
      // 2b0: ifeq 2c2
      // 2b3: iload 4
      // 2b5: ifne 29a
      // 2b8: goto 2bf
      // 2bb: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2be: athrow
      // 2bf: iinc 6 1
      // 2c2: iload 4
      // 2c4: ifne 09b
      // 2c7: bipush 1
      // 2c8: ireturn
   }

   public static void dks(double[] param0, int[] param1, double[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 9
      // 003: invokestatic t9d.b ()I
      // 006: bipush 0
      // 007: istore 8
      // 009: istore 3
      // 00a: iload 8
      // 00c: bipush 3
      // 00d: if_icmpge 137
      // 010: iload 8
      // 012: istore 10
      // 014: bipush -1
      // 015: istore 5
      // 017: bipush 0
      // 018: istore 4
      // 01a: iload 4
      // 01c: bipush 3
      // 01d: if_icmpge 0c4
      // 020: aload 1
      // 021: iload 9
      // 023: iload 4
      // 025: iadd
      // 026: iaload
      // 027: istore 6
      // 029: aload 2
      // 02a: iload 10
      // 02c: bipush 3
      // 02d: iload 6
      // 02f: imul
      // 030: iadd
      // 031: daload
      // 032: dstore 12
      // 034: aload 2
      // 035: iload 10
      // 037: bipush 3
      // 038: iload 6
      // 03a: imul
      // 03b: iadd
      // 03c: aload 2
      // 03d: iload 10
      // 03f: bipush 3
      // 040: iload 4
      // 042: imul
      // 043: iadd
      // 044: daload
      // 045: dastore
      // 046: iload 5
      // 048: iload 3
      // 049: ifeq 0c6
      // 04c: iload 3
      // 04d: ifeq 0a0
      // 050: goto 057
      // 053: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 056: athrow
      // 057: iflt 09c
      // 05a: goto 061
      // 05d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 060: athrow
      // 061: iload 4
      // 063: bipush 3
      // 064: imul
      // 065: istore 11
      // 067: iload 5
      // 069: istore 7
      // 06b: iload 7
      // 06d: iload 4
      // 06f: bipush 1
      // 070: isub
      // 071: if_icmpgt 0b2
      // 074: dload 12
      // 076: aload 0
      // 077: iload 11
      // 079: iload 7
      // 07b: iadd
      // 07c: daload
      // 07d: aload 2
      // 07e: iload 10
      // 080: bipush 3
      // 081: iload 7
      // 083: imul
      // 084: iadd
      // 085: daload
      // 086: dmul
      // 087: dsub
      // 088: dstore 12
      // 08a: iinc 7 1
      // 08d: iload 3
      // 08e: ifeq 0c0
      // 091: iload 3
      // 092: ifne 06b
      // 095: goto 09c
      // 098: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09b: athrow
      // 09c: dload 12
      // 09e: dconst_0
      // 09f: dcmpl
      // 0a0: iload 3
      // 0a1: ifeq 0b0
      // 0a4: ifeq 0b2
      // 0a7: goto 0ae
      // 0aa: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ad: athrow
      // 0ae: iload 4
      // 0b0: istore 5
      // 0b2: aload 2
      // 0b3: iload 10
      // 0b5: bipush 3
      // 0b6: iload 4
      // 0b8: imul
      // 0b9: iadd
      // 0ba: dload 12
      // 0bc: dastore
      // 0bd: iinc 4 1
      // 0c0: iload 3
      // 0c1: ifne 01a
      // 0c4: bipush 6
      // 0c6: istore 11
      // 0c8: aload 2
      // 0c9: iload 10
      // 0cb: bipush 6
      // 0cd: iadd
      // 0ce: dup2
      // 0cf: daload
      // 0d0: aload 0
      // 0d1: iload 11
      // 0d3: bipush 2
      // 0d4: iadd
      // 0d5: daload
      // 0d6: ddiv
      // 0d7: dastore
      // 0d8: iinc 11 -3
      // 0db: aload 2
      // 0dc: iload 10
      // 0de: bipush 3
      // 0df: iadd
      // 0e0: aload 2
      // 0e1: iload 10
      // 0e3: bipush 3
      // 0e4: iadd
      // 0e5: daload
      // 0e6: aload 0
      // 0e7: iload 11
      // 0e9: bipush 2
      // 0ea: iadd
      // 0eb: daload
      // 0ec: aload 2
      // 0ed: iload 10
      // 0ef: bipush 6
      // 0f1: iadd
      // 0f2: daload
      // 0f3: dmul
      // 0f4: dsub
      // 0f5: aload 0
      // 0f6: iload 11
      // 0f8: bipush 1
      // 0f9: iadd
      // 0fa: daload
      // 0fb: ddiv
      // 0fc: dastore
      // 0fd: iinc 11 -3
      // 100: aload 2
      // 101: iload 10
      // 103: bipush 0
      // 104: iadd
      // 105: aload 2
      // 106: iload 10
      // 108: bipush 0
      // 109: iadd
      // 10a: daload
      // 10b: aload 0
      // 10c: iload 11
      // 10e: bipush 1
      // 10f: iadd
      // 110: daload
      // 111: aload 2
      // 112: iload 10
      // 114: bipush 3
      // 115: iadd
      // 116: daload
      // 117: dmul
      // 118: dsub
      // 119: aload 0
      // 11a: iload 11
      // 11c: bipush 2
      // 11d: iadd
      // 11e: daload
      // 11f: aload 2
      // 120: iload 10
      // 122: bipush 6
      // 124: iadd
      // 125: daload
      // 126: dmul
      // 127: dsub
      // 128: aload 0
      // 129: iload 11
      // 12b: bipush 0
      // 12c: iadd
      // 12d: daload
      // 12e: ddiv
      // 12f: dastore
      // 130: iinc 8 1
      // 133: iload 3
      // 134: ifne 00a
      // 137: return
   }

   public final double of4() {
      return this.lxb * (this.pwn * this.ffq - this.c84 * this._o7)
         + this.y3c * (this.c84 * this.y7q - this.get * this.ffq)
         + this.bhd * (this.get * this._o7 - this.pwn * this.y7q);
   }

   public final void t0k(double var1) {
      this.lxb = var1;
      this.y3c = 0.0;
      this.bhd = 0.0;
      this.get = 0.0;
      this.pwn = var1;
      this.c84 = 0.0;
      this.y7q = 0.0;
      this._o7 = 0.0;
      this.ffq = var1;
   }

   public final void dq6(double var1) {
      double var3 = Math.sin(var1);
      double var5 = Math.cos(var1);
      this.lxb = 1.0;
      this.y3c = 0.0;
      this.bhd = 0.0;
      this.get = 0.0;
      this.pwn = var5;
      this.c84 = -var3;
      this.y7q = 0.0;
      this._o7 = var3;
      this.ffq = var5;
   }

   public final void o1t(double var1) {
      double var3 = Math.sin(var1);
      double var5 = Math.cos(var1);
      this.lxb = var5;
      this.y3c = 0.0;
      this.bhd = var3;
      this.get = 0.0;
      this.pwn = 1.0;
      this.c84 = 0.0;
      this.y7q = -var3;
      this._o7 = 0.0;
      this.ffq = var5;
   }

   public final void nxi(double var1) {
      double var3 = Math.sin(var1);
      double var5 = Math.cos(var1);
      this.lxb = var5;
      this.y3c = -var3;
      this.bhd = 0.0;
      this.get = var3;
      this.pwn = var5;
      this.c84 = 0.0;
      this.y7q = 0.0;
      this._o7 = 0.0;
      this.ffq = 1.0;
   }

   public final void c7o(double var1) {
      this.lxb *= var1;
      this.y3c *= var1;
      this.bhd *= var1;
      this.get *= var1;
      this.pwn *= var1;
      this.c84 *= var1;
      this.y7q *= var1;
      this._o7 *= var1;
      this.ffq *= var1;
   }

   public final void iaz(double var1, iww var3) {
      this.lxb = var1 * var3.lxb;
      this.y3c = var1 * var3.y3c;
      this.bhd = var1 * var3.bhd;
      this.get = var1 * var3.get;
      this.pwn = var1 * var3.pwn;
      this.c84 = var1 * var3.c84;
      this.y7q = var1 * var3.y7q;
      this._o7 = var1 * var3._o7;
      this.ffq = var1 * var3.ffq;
   }

   public final void b3v(iww var1) {
      double var2 = this.lxb * var1.lxb + this.y3c * var1.get + this.bhd * var1.y7q;
      double var4 = this.lxb * var1.y3c + this.y3c * var1.pwn + this.bhd * var1._o7;
      double var6 = this.lxb * var1.bhd + this.y3c * var1.c84 + this.bhd * var1.ffq;
      double var8 = this.get * var1.lxb + this.pwn * var1.get + this.c84 * var1.y7q;
      double var10 = this.get * var1.y3c + this.pwn * var1.pwn + this.c84 * var1._o7;
      double var12 = this.get * var1.bhd + this.pwn * var1.c84 + this.c84 * var1.ffq;
      double var14 = this.y7q * var1.lxb + this._o7 * var1.get + this.ffq * var1.y7q;
      double var16 = this.y7q * var1.y3c + this._o7 * var1.pwn + this.ffq * var1._o7;
      double var18 = this.y7q * var1.bhd + this._o7 * var1.c84 + this.ffq * var1.ffq;
      this.lxb = var2;
      this.y3c = var4;
      this.bhd = var6;
      this.get = var8;
      this.pwn = var10;
      this.c84 = var12;
      this.y7q = var14;
      this._o7 = var16;
      this.ffq = var18;
   }

   public final void _ns(iww param1, iww param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 167
      // 009: aload 1
      // 00a: if_acmpeq 15f
      // 00d: goto 014
      // 010: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifne 167
      // 019: goto 020
      // 01c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 15f
      // 024: goto 02b
      // 027: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield iww.lxb D
      // 030: aload 2
      // 031: getfield iww.lxb D
      // 034: dmul
      // 035: aload 1
      // 036: getfield iww.y3c D
      // 039: aload 2
      // 03a: getfield iww.get D
      // 03d: dmul
      // 03e: dadd
      // 03f: aload 1
      // 040: getfield iww.bhd D
      // 043: aload 2
      // 044: getfield iww.y7q D
      // 047: dmul
      // 048: dadd
      // 049: putfield iww.lxb D
      // 04c: aload 0
      // 04d: aload 1
      // 04e: getfield iww.lxb D
      // 051: aload 2
      // 052: getfield iww.y3c D
      // 055: dmul
      // 056: aload 1
      // 057: getfield iww.y3c D
      // 05a: aload 2
      // 05b: getfield iww.pwn D
      // 05e: dmul
      // 05f: dadd
      // 060: aload 1
      // 061: getfield iww.bhd D
      // 064: aload 2
      // 065: getfield iww._o7 D
      // 068: dmul
      // 069: dadd
      // 06a: putfield iww.y3c D
      // 06d: aload 0
      // 06e: aload 1
      // 06f: getfield iww.lxb D
      // 072: aload 2
      // 073: getfield iww.bhd D
      // 076: dmul
      // 077: aload 1
      // 078: getfield iww.y3c D
      // 07b: aload 2
      // 07c: getfield iww.c84 D
      // 07f: dmul
      // 080: dadd
      // 081: aload 1
      // 082: getfield iww.bhd D
      // 085: aload 2
      // 086: getfield iww.ffq D
      // 089: dmul
      // 08a: dadd
      // 08b: putfield iww.bhd D
      // 08e: aload 0
      // 08f: aload 1
      // 090: getfield iww.get D
      // 093: aload 2
      // 094: getfield iww.lxb D
      // 097: dmul
      // 098: aload 1
      // 099: getfield iww.pwn D
      // 09c: aload 2
      // 09d: getfield iww.get D
      // 0a0: dmul
      // 0a1: dadd
      // 0a2: aload 1
      // 0a3: getfield iww.c84 D
      // 0a6: aload 2
      // 0a7: getfield iww.y7q D
      // 0aa: dmul
      // 0ab: dadd
      // 0ac: putfield iww.get D
      // 0af: aload 0
      // 0b0: aload 1
      // 0b1: getfield iww.get D
      // 0b4: aload 2
      // 0b5: getfield iww.y3c D
      // 0b8: dmul
      // 0b9: aload 1
      // 0ba: getfield iww.pwn D
      // 0bd: aload 2
      // 0be: getfield iww.pwn D
      // 0c1: dmul
      // 0c2: dadd
      // 0c3: aload 1
      // 0c4: getfield iww.c84 D
      // 0c7: aload 2
      // 0c8: getfield iww._o7 D
      // 0cb: dmul
      // 0cc: dadd
      // 0cd: putfield iww.pwn D
      // 0d0: aload 0
      // 0d1: aload 1
      // 0d2: getfield iww.get D
      // 0d5: aload 2
      // 0d6: getfield iww.bhd D
      // 0d9: dmul
      // 0da: aload 1
      // 0db: getfield iww.pwn D
      // 0de: aload 2
      // 0df: getfield iww.c84 D
      // 0e2: dmul
      // 0e3: dadd
      // 0e4: aload 1
      // 0e5: getfield iww.c84 D
      // 0e8: aload 2
      // 0e9: getfield iww.ffq D
      // 0ec: dmul
      // 0ed: dadd
      // 0ee: putfield iww.c84 D
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: getfield iww.y7q D
      // 0f6: aload 2
      // 0f7: getfield iww.lxb D
      // 0fa: dmul
      // 0fb: aload 1
      // 0fc: getfield iww._o7 D
      // 0ff: aload 2
      // 100: getfield iww.get D
      // 103: dmul
      // 104: dadd
      // 105: aload 1
      // 106: getfield iww.ffq D
      // 109: aload 2
      // 10a: getfield iww.y7q D
      // 10d: dmul
      // 10e: dadd
      // 10f: putfield iww.y7q D
      // 112: aload 0
      // 113: aload 1
      // 114: getfield iww.y7q D
      // 117: aload 2
      // 118: getfield iww.y3c D
      // 11b: dmul
      // 11c: aload 1
      // 11d: getfield iww._o7 D
      // 120: aload 2
      // 121: getfield iww.pwn D
      // 124: dmul
      // 125: dadd
      // 126: aload 1
      // 127: getfield iww.ffq D
      // 12a: aload 2
      // 12b: getfield iww._o7 D
      // 12e: dmul
      // 12f: dadd
      // 130: putfield iww._o7 D
      // 133: aload 0
      // 134: aload 1
      // 135: getfield iww.y7q D
      // 138: aload 2
      // 139: getfield iww.bhd D
      // 13c: dmul
      // 13d: aload 1
      // 13e: getfield iww._o7 D
      // 141: aload 2
      // 142: getfield iww.c84 D
      // 145: dmul
      // 146: dadd
      // 147: aload 1
      // 148: getfield iww.ffq D
      // 14b: aload 2
      // 14c: getfield iww.ffq D
      // 14f: dmul
      // 150: dadd
      // 151: putfield iww.ffq D
      // 154: iload 3
      // 155: ifeq 2b3
      // 158: goto 15f
      // 15b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15e: athrow
      // 15f: aload 1
      // 160: goto 167
      // 163: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 166: athrow
      // 167: getfield iww.lxb D
      // 16a: aload 2
      // 16b: getfield iww.lxb D
      // 16e: dmul
      // 16f: aload 1
      // 170: getfield iww.y3c D
      // 173: aload 2
      // 174: getfield iww.get D
      // 177: dmul
      // 178: dadd
      // 179: aload 1
      // 17a: getfield iww.bhd D
      // 17d: aload 2
      // 17e: getfield iww.y7q D
      // 181: dmul
      // 182: dadd
      // 183: dstore 4
      // 185: aload 1
      // 186: getfield iww.lxb D
      // 189: aload 2
      // 18a: getfield iww.y3c D
      // 18d: dmul
      // 18e: aload 1
      // 18f: getfield iww.y3c D
      // 192: aload 2
      // 193: getfield iww.pwn D
      // 196: dmul
      // 197: dadd
      // 198: aload 1
      // 199: getfield iww.bhd D
      // 19c: aload 2
      // 19d: getfield iww._o7 D
      // 1a0: dmul
      // 1a1: dadd
      // 1a2: dstore 6
      // 1a4: aload 1
      // 1a5: getfield iww.lxb D
      // 1a8: aload 2
      // 1a9: getfield iww.bhd D
      // 1ac: dmul
      // 1ad: aload 1
      // 1ae: getfield iww.y3c D
      // 1b1: aload 2
      // 1b2: getfield iww.c84 D
      // 1b5: dmul
      // 1b6: dadd
      // 1b7: aload 1
      // 1b8: getfield iww.bhd D
      // 1bb: aload 2
      // 1bc: getfield iww.ffq D
      // 1bf: dmul
      // 1c0: dadd
      // 1c1: dstore 8
      // 1c3: aload 1
      // 1c4: getfield iww.get D
      // 1c7: aload 2
      // 1c8: getfield iww.lxb D
      // 1cb: dmul
      // 1cc: aload 1
      // 1cd: getfield iww.pwn D
      // 1d0: aload 2
      // 1d1: getfield iww.get D
      // 1d4: dmul
      // 1d5: dadd
      // 1d6: aload 1
      // 1d7: getfield iww.c84 D
      // 1da: aload 2
      // 1db: getfield iww.y7q D
      // 1de: dmul
      // 1df: dadd
      // 1e0: dstore 10
      // 1e2: aload 1
      // 1e3: getfield iww.get D
      // 1e6: aload 2
      // 1e7: getfield iww.y3c D
      // 1ea: dmul
      // 1eb: aload 1
      // 1ec: getfield iww.pwn D
      // 1ef: aload 2
      // 1f0: getfield iww.pwn D
      // 1f3: dmul
      // 1f4: dadd
      // 1f5: aload 1
      // 1f6: getfield iww.c84 D
      // 1f9: aload 2
      // 1fa: getfield iww._o7 D
      // 1fd: dmul
      // 1fe: dadd
      // 1ff: dstore 12
      // 201: aload 1
      // 202: getfield iww.get D
      // 205: aload 2
      // 206: getfield iww.bhd D
      // 209: dmul
      // 20a: aload 1
      // 20b: getfield iww.pwn D
      // 20e: aload 2
      // 20f: getfield iww.c84 D
      // 212: dmul
      // 213: dadd
      // 214: aload 1
      // 215: getfield iww.c84 D
      // 218: aload 2
      // 219: getfield iww.ffq D
      // 21c: dmul
      // 21d: dadd
      // 21e: dstore 14
      // 220: aload 1
      // 221: getfield iww.y7q D
      // 224: aload 2
      // 225: getfield iww.lxb D
      // 228: dmul
      // 229: aload 1
      // 22a: getfield iww._o7 D
      // 22d: aload 2
      // 22e: getfield iww.get D
      // 231: dmul
      // 232: dadd
      // 233: aload 1
      // 234: getfield iww.ffq D
      // 237: aload 2
      // 238: getfield iww.y7q D
      // 23b: dmul
      // 23c: dadd
      // 23d: dstore 16
      // 23f: aload 1
      // 240: getfield iww.y7q D
      // 243: aload 2
      // 244: getfield iww.y3c D
      // 247: dmul
      // 248: aload 1
      // 249: getfield iww._o7 D
      // 24c: aload 2
      // 24d: getfield iww.pwn D
      // 250: dmul
      // 251: dadd
      // 252: aload 1
      // 253: getfield iww.ffq D
      // 256: aload 2
      // 257: getfield iww._o7 D
      // 25a: dmul
      // 25b: dadd
      // 25c: dstore 18
      // 25e: aload 1
      // 25f: getfield iww.y7q D
      // 262: aload 2
      // 263: getfield iww.bhd D
      // 266: dmul
      // 267: aload 1
      // 268: getfield iww._o7 D
      // 26b: aload 2
      // 26c: getfield iww.c84 D
      // 26f: dmul
      // 270: dadd
      // 271: aload 1
      // 272: getfield iww.ffq D
      // 275: aload 2
      // 276: getfield iww.ffq D
      // 279: dmul
      // 27a: dadd
      // 27b: dstore 20
      // 27d: aload 0
      // 27e: dload 4
      // 280: putfield iww.lxb D
      // 283: aload 0
      // 284: dload 6
      // 286: putfield iww.y3c D
      // 289: aload 0
      // 28a: dload 8
      // 28c: putfield iww.bhd D
      // 28f: aload 0
      // 290: dload 10
      // 292: putfield iww.get D
      // 295: aload 0
      // 296: dload 12
      // 298: putfield iww.pwn D
      // 29b: aload 0
      // 29c: dload 14
      // 29e: putfield iww.c84 D
      // 2a1: aload 0
      // 2a2: dload 16
      // 2a4: putfield iww.y7q D
      // 2a7: aload 0
      // 2a8: dload 18
      // 2aa: putfield iww._o7 D
      // 2ad: aload 0
      // 2ae: dload 20
      // 2b0: putfield iww.ffq D
      // 2b3: return
   }

   public final void x9s(iww var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      var2[0] = this.lxb * var1.lxb + this.y3c * var1.get + this.bhd * var1.y7q;
      var2[1] = this.lxb * var1.y3c + this.y3c * var1.pwn + this.bhd * var1._o7;
      var2[2] = this.lxb * var1.bhd + this.y3c * var1.c84 + this.bhd * var1.ffq;
      var2[3] = this.get * var1.lxb + this.pwn * var1.get + this.c84 * var1.y7q;
      var2[4] = this.get * var1.y3c + this.pwn * var1.pwn + this.c84 * var1._o7;
      var2[5] = this.get * var1.bhd + this.pwn * var1.c84 + this.c84 * var1.ffq;
      var2[6] = this.y7q * var1.lxb + this._o7 * var1.get + this.ffq * var1.y7q;
      var2[7] = this.y7q * var1.y3c + this._o7 * var1.pwn + this.ffq * var1._o7;
      var2[8] = this.y7q * var1.bhd + this._o7 * var1.c84 + this.ffq * var1.ffq;
      d20(var2, var4, var3);
      this.lxb = var3[0];
      this.y3c = var3[1];
      this.bhd = var3[2];
      this.get = var3[3];
      this.pwn = var3[4];
      this.c84 = var3[5];
      this.y7q = var3[6];
      this._o7 = var3[7];
      this.ffq = var3[8];
   }

   public final void v4j(iww var1, iww var2) {
      double[] var3 = new double[9];
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      var3[0] = var1.lxb * var2.lxb + var1.y3c * var2.get + var1.bhd * var2.y7q;
      var3[1] = var1.lxb * var2.y3c + var1.y3c * var2.pwn + var1.bhd * var2._o7;
      var3[2] = var1.lxb * var2.bhd + var1.y3c * var2.c84 + var1.bhd * var2.ffq;
      var3[3] = var1.get * var2.lxb + var1.pwn * var2.get + var1.c84 * var2.y7q;
      var3[4] = var1.get * var2.y3c + var1.pwn * var2.pwn + var1.c84 * var2._o7;
      var3[5] = var1.get * var2.bhd + var1.pwn * var2.c84 + var1.c84 * var2.ffq;
      var3[6] = var1.y7q * var2.lxb + var1._o7 * var2.get + var1.ffq * var2.y7q;
      var3[7] = var1.y7q * var2.y3c + var1._o7 * var2.pwn + var1.ffq * var2._o7;
      var3[8] = var1.y7q * var2.bhd + var1._o7 * var2.c84 + var1.ffq * var2.ffq;
      d20(var3, var5, var4);
      this.lxb = var4[0];
      this.y3c = var4[1];
      this.bhd = var4[2];
      this.get = var4[3];
      this.pwn = var4[4];
      this.c84 = var4[5];
      this.y7q = var4[6];
      this._o7 = var4[7];
      this.ffq = var4[8];
   }

   public final void xnf(iww param1, iww param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 167
      // 009: aload 1
      // 00a: if_acmpeq 15f
      // 00d: goto 014
      // 010: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifne 167
      // 019: goto 020
      // 01c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 15f
      // 024: goto 02b
      // 027: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield iww.lxb D
      // 030: aload 2
      // 031: getfield iww.lxb D
      // 034: dmul
      // 035: aload 1
      // 036: getfield iww.get D
      // 039: aload 2
      // 03a: getfield iww.y3c D
      // 03d: dmul
      // 03e: dadd
      // 03f: aload 1
      // 040: getfield iww.y7q D
      // 043: aload 2
      // 044: getfield iww.bhd D
      // 047: dmul
      // 048: dadd
      // 049: putfield iww.lxb D
      // 04c: aload 0
      // 04d: aload 1
      // 04e: getfield iww.lxb D
      // 051: aload 2
      // 052: getfield iww.get D
      // 055: dmul
      // 056: aload 1
      // 057: getfield iww.get D
      // 05a: aload 2
      // 05b: getfield iww.pwn D
      // 05e: dmul
      // 05f: dadd
      // 060: aload 1
      // 061: getfield iww.y7q D
      // 064: aload 2
      // 065: getfield iww.c84 D
      // 068: dmul
      // 069: dadd
      // 06a: putfield iww.y3c D
      // 06d: aload 0
      // 06e: aload 1
      // 06f: getfield iww.lxb D
      // 072: aload 2
      // 073: getfield iww.y7q D
      // 076: dmul
      // 077: aload 1
      // 078: getfield iww.get D
      // 07b: aload 2
      // 07c: getfield iww._o7 D
      // 07f: dmul
      // 080: dadd
      // 081: aload 1
      // 082: getfield iww.y7q D
      // 085: aload 2
      // 086: getfield iww.ffq D
      // 089: dmul
      // 08a: dadd
      // 08b: putfield iww.bhd D
      // 08e: aload 0
      // 08f: aload 1
      // 090: getfield iww.y3c D
      // 093: aload 2
      // 094: getfield iww.lxb D
      // 097: dmul
      // 098: aload 1
      // 099: getfield iww.pwn D
      // 09c: aload 2
      // 09d: getfield iww.y3c D
      // 0a0: dmul
      // 0a1: dadd
      // 0a2: aload 1
      // 0a3: getfield iww._o7 D
      // 0a6: aload 2
      // 0a7: getfield iww.bhd D
      // 0aa: dmul
      // 0ab: dadd
      // 0ac: putfield iww.get D
      // 0af: aload 0
      // 0b0: aload 1
      // 0b1: getfield iww.y3c D
      // 0b4: aload 2
      // 0b5: getfield iww.get D
      // 0b8: dmul
      // 0b9: aload 1
      // 0ba: getfield iww.pwn D
      // 0bd: aload 2
      // 0be: getfield iww.pwn D
      // 0c1: dmul
      // 0c2: dadd
      // 0c3: aload 1
      // 0c4: getfield iww._o7 D
      // 0c7: aload 2
      // 0c8: getfield iww.c84 D
      // 0cb: dmul
      // 0cc: dadd
      // 0cd: putfield iww.pwn D
      // 0d0: aload 0
      // 0d1: aload 1
      // 0d2: getfield iww.y3c D
      // 0d5: aload 2
      // 0d6: getfield iww.y7q D
      // 0d9: dmul
      // 0da: aload 1
      // 0db: getfield iww.pwn D
      // 0de: aload 2
      // 0df: getfield iww._o7 D
      // 0e2: dmul
      // 0e3: dadd
      // 0e4: aload 1
      // 0e5: getfield iww._o7 D
      // 0e8: aload 2
      // 0e9: getfield iww.ffq D
      // 0ec: dmul
      // 0ed: dadd
      // 0ee: putfield iww.c84 D
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: getfield iww.bhd D
      // 0f6: aload 2
      // 0f7: getfield iww.lxb D
      // 0fa: dmul
      // 0fb: aload 1
      // 0fc: getfield iww.c84 D
      // 0ff: aload 2
      // 100: getfield iww.y3c D
      // 103: dmul
      // 104: dadd
      // 105: aload 1
      // 106: getfield iww.ffq D
      // 109: aload 2
      // 10a: getfield iww.bhd D
      // 10d: dmul
      // 10e: dadd
      // 10f: putfield iww.y7q D
      // 112: aload 0
      // 113: aload 1
      // 114: getfield iww.bhd D
      // 117: aload 2
      // 118: getfield iww.get D
      // 11b: dmul
      // 11c: aload 1
      // 11d: getfield iww.c84 D
      // 120: aload 2
      // 121: getfield iww.pwn D
      // 124: dmul
      // 125: dadd
      // 126: aload 1
      // 127: getfield iww.ffq D
      // 12a: aload 2
      // 12b: getfield iww.c84 D
      // 12e: dmul
      // 12f: dadd
      // 130: putfield iww._o7 D
      // 133: aload 0
      // 134: aload 1
      // 135: getfield iww.bhd D
      // 138: aload 2
      // 139: getfield iww.y7q D
      // 13c: dmul
      // 13d: aload 1
      // 13e: getfield iww.c84 D
      // 141: aload 2
      // 142: getfield iww._o7 D
      // 145: dmul
      // 146: dadd
      // 147: aload 1
      // 148: getfield iww.ffq D
      // 14b: aload 2
      // 14c: getfield iww.ffq D
      // 14f: dmul
      // 150: dadd
      // 151: putfield iww.ffq D
      // 154: iload 3
      // 155: ifeq 2b3
      // 158: goto 15f
      // 15b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15e: athrow
      // 15f: aload 1
      // 160: goto 167
      // 163: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 166: athrow
      // 167: getfield iww.lxb D
      // 16a: aload 2
      // 16b: getfield iww.lxb D
      // 16e: dmul
      // 16f: aload 1
      // 170: getfield iww.get D
      // 173: aload 2
      // 174: getfield iww.y3c D
      // 177: dmul
      // 178: dadd
      // 179: aload 1
      // 17a: getfield iww.y7q D
      // 17d: aload 2
      // 17e: getfield iww.bhd D
      // 181: dmul
      // 182: dadd
      // 183: dstore 4
      // 185: aload 1
      // 186: getfield iww.lxb D
      // 189: aload 2
      // 18a: getfield iww.get D
      // 18d: dmul
      // 18e: aload 1
      // 18f: getfield iww.get D
      // 192: aload 2
      // 193: getfield iww.pwn D
      // 196: dmul
      // 197: dadd
      // 198: aload 1
      // 199: getfield iww.y7q D
      // 19c: aload 2
      // 19d: getfield iww.c84 D
      // 1a0: dmul
      // 1a1: dadd
      // 1a2: dstore 6
      // 1a4: aload 1
      // 1a5: getfield iww.lxb D
      // 1a8: aload 2
      // 1a9: getfield iww.y7q D
      // 1ac: dmul
      // 1ad: aload 1
      // 1ae: getfield iww.get D
      // 1b1: aload 2
      // 1b2: getfield iww._o7 D
      // 1b5: dmul
      // 1b6: dadd
      // 1b7: aload 1
      // 1b8: getfield iww.y7q D
      // 1bb: aload 2
      // 1bc: getfield iww.ffq D
      // 1bf: dmul
      // 1c0: dadd
      // 1c1: dstore 8
      // 1c3: aload 1
      // 1c4: getfield iww.y3c D
      // 1c7: aload 2
      // 1c8: getfield iww.lxb D
      // 1cb: dmul
      // 1cc: aload 1
      // 1cd: getfield iww.pwn D
      // 1d0: aload 2
      // 1d1: getfield iww.y3c D
      // 1d4: dmul
      // 1d5: dadd
      // 1d6: aload 1
      // 1d7: getfield iww._o7 D
      // 1da: aload 2
      // 1db: getfield iww.bhd D
      // 1de: dmul
      // 1df: dadd
      // 1e0: dstore 10
      // 1e2: aload 1
      // 1e3: getfield iww.y3c D
      // 1e6: aload 2
      // 1e7: getfield iww.get D
      // 1ea: dmul
      // 1eb: aload 1
      // 1ec: getfield iww.pwn D
      // 1ef: aload 2
      // 1f0: getfield iww.pwn D
      // 1f3: dmul
      // 1f4: dadd
      // 1f5: aload 1
      // 1f6: getfield iww._o7 D
      // 1f9: aload 2
      // 1fa: getfield iww.c84 D
      // 1fd: dmul
      // 1fe: dadd
      // 1ff: dstore 12
      // 201: aload 1
      // 202: getfield iww.y3c D
      // 205: aload 2
      // 206: getfield iww.y7q D
      // 209: dmul
      // 20a: aload 1
      // 20b: getfield iww.pwn D
      // 20e: aload 2
      // 20f: getfield iww._o7 D
      // 212: dmul
      // 213: dadd
      // 214: aload 1
      // 215: getfield iww._o7 D
      // 218: aload 2
      // 219: getfield iww.ffq D
      // 21c: dmul
      // 21d: dadd
      // 21e: dstore 14
      // 220: aload 1
      // 221: getfield iww.bhd D
      // 224: aload 2
      // 225: getfield iww.lxb D
      // 228: dmul
      // 229: aload 1
      // 22a: getfield iww.c84 D
      // 22d: aload 2
      // 22e: getfield iww.y3c D
      // 231: dmul
      // 232: dadd
      // 233: aload 1
      // 234: getfield iww.ffq D
      // 237: aload 2
      // 238: getfield iww.bhd D
      // 23b: dmul
      // 23c: dadd
      // 23d: dstore 16
      // 23f: aload 1
      // 240: getfield iww.bhd D
      // 243: aload 2
      // 244: getfield iww.get D
      // 247: dmul
      // 248: aload 1
      // 249: getfield iww.c84 D
      // 24c: aload 2
      // 24d: getfield iww.pwn D
      // 250: dmul
      // 251: dadd
      // 252: aload 1
      // 253: getfield iww.ffq D
      // 256: aload 2
      // 257: getfield iww.c84 D
      // 25a: dmul
      // 25b: dadd
      // 25c: dstore 18
      // 25e: aload 1
      // 25f: getfield iww.bhd D
      // 262: aload 2
      // 263: getfield iww.y7q D
      // 266: dmul
      // 267: aload 1
      // 268: getfield iww.c84 D
      // 26b: aload 2
      // 26c: getfield iww._o7 D
      // 26f: dmul
      // 270: dadd
      // 271: aload 1
      // 272: getfield iww.ffq D
      // 275: aload 2
      // 276: getfield iww.ffq D
      // 279: dmul
      // 27a: dadd
      // 27b: dstore 20
      // 27d: aload 0
      // 27e: dload 4
      // 280: putfield iww.lxb D
      // 283: aload 0
      // 284: dload 6
      // 286: putfield iww.y3c D
      // 289: aload 0
      // 28a: dload 8
      // 28c: putfield iww.bhd D
      // 28f: aload 0
      // 290: dload 10
      // 292: putfield iww.get D
      // 295: aload 0
      // 296: dload 12
      // 298: putfield iww.pwn D
      // 29b: aload 0
      // 29c: dload 14
      // 29e: putfield iww.c84 D
      // 2a1: aload 0
      // 2a2: dload 16
      // 2a4: putfield iww.y7q D
      // 2a7: aload 0
      // 2a8: dload 18
      // 2aa: putfield iww._o7 D
      // 2ad: aload 0
      // 2ae: dload 20
      // 2b0: putfield iww.ffq D
      // 2b3: return
   }

   public final void xvm(iww param1, iww param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifeq 167
      // 009: aload 1
      // 00a: if_acmpeq 15f
      // 00d: goto 014
      // 010: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifeq 167
      // 019: goto 020
      // 01c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 15f
      // 024: goto 02b
      // 027: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield iww.lxb D
      // 030: aload 2
      // 031: getfield iww.lxb D
      // 034: dmul
      // 035: aload 1
      // 036: getfield iww.y3c D
      // 039: aload 2
      // 03a: getfield iww.y3c D
      // 03d: dmul
      // 03e: dadd
      // 03f: aload 1
      // 040: getfield iww.bhd D
      // 043: aload 2
      // 044: getfield iww.bhd D
      // 047: dmul
      // 048: dadd
      // 049: putfield iww.lxb D
      // 04c: aload 0
      // 04d: aload 1
      // 04e: getfield iww.lxb D
      // 051: aload 2
      // 052: getfield iww.get D
      // 055: dmul
      // 056: aload 1
      // 057: getfield iww.y3c D
      // 05a: aload 2
      // 05b: getfield iww.pwn D
      // 05e: dmul
      // 05f: dadd
      // 060: aload 1
      // 061: getfield iww.bhd D
      // 064: aload 2
      // 065: getfield iww.c84 D
      // 068: dmul
      // 069: dadd
      // 06a: putfield iww.y3c D
      // 06d: aload 0
      // 06e: aload 1
      // 06f: getfield iww.lxb D
      // 072: aload 2
      // 073: getfield iww.y7q D
      // 076: dmul
      // 077: aload 1
      // 078: getfield iww.y3c D
      // 07b: aload 2
      // 07c: getfield iww._o7 D
      // 07f: dmul
      // 080: dadd
      // 081: aload 1
      // 082: getfield iww.bhd D
      // 085: aload 2
      // 086: getfield iww.ffq D
      // 089: dmul
      // 08a: dadd
      // 08b: putfield iww.bhd D
      // 08e: aload 0
      // 08f: aload 1
      // 090: getfield iww.get D
      // 093: aload 2
      // 094: getfield iww.lxb D
      // 097: dmul
      // 098: aload 1
      // 099: getfield iww.pwn D
      // 09c: aload 2
      // 09d: getfield iww.y3c D
      // 0a0: dmul
      // 0a1: dadd
      // 0a2: aload 1
      // 0a3: getfield iww.c84 D
      // 0a6: aload 2
      // 0a7: getfield iww.bhd D
      // 0aa: dmul
      // 0ab: dadd
      // 0ac: putfield iww.get D
      // 0af: aload 0
      // 0b0: aload 1
      // 0b1: getfield iww.get D
      // 0b4: aload 2
      // 0b5: getfield iww.get D
      // 0b8: dmul
      // 0b9: aload 1
      // 0ba: getfield iww.pwn D
      // 0bd: aload 2
      // 0be: getfield iww.pwn D
      // 0c1: dmul
      // 0c2: dadd
      // 0c3: aload 1
      // 0c4: getfield iww.c84 D
      // 0c7: aload 2
      // 0c8: getfield iww.c84 D
      // 0cb: dmul
      // 0cc: dadd
      // 0cd: putfield iww.pwn D
      // 0d0: aload 0
      // 0d1: aload 1
      // 0d2: getfield iww.get D
      // 0d5: aload 2
      // 0d6: getfield iww.y7q D
      // 0d9: dmul
      // 0da: aload 1
      // 0db: getfield iww.pwn D
      // 0de: aload 2
      // 0df: getfield iww._o7 D
      // 0e2: dmul
      // 0e3: dadd
      // 0e4: aload 1
      // 0e5: getfield iww.c84 D
      // 0e8: aload 2
      // 0e9: getfield iww.ffq D
      // 0ec: dmul
      // 0ed: dadd
      // 0ee: putfield iww.c84 D
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: getfield iww.y7q D
      // 0f6: aload 2
      // 0f7: getfield iww.lxb D
      // 0fa: dmul
      // 0fb: aload 1
      // 0fc: getfield iww._o7 D
      // 0ff: aload 2
      // 100: getfield iww.y3c D
      // 103: dmul
      // 104: dadd
      // 105: aload 1
      // 106: getfield iww.ffq D
      // 109: aload 2
      // 10a: getfield iww.bhd D
      // 10d: dmul
      // 10e: dadd
      // 10f: putfield iww.y7q D
      // 112: aload 0
      // 113: aload 1
      // 114: getfield iww.y7q D
      // 117: aload 2
      // 118: getfield iww.get D
      // 11b: dmul
      // 11c: aload 1
      // 11d: getfield iww._o7 D
      // 120: aload 2
      // 121: getfield iww.pwn D
      // 124: dmul
      // 125: dadd
      // 126: aload 1
      // 127: getfield iww.ffq D
      // 12a: aload 2
      // 12b: getfield iww.c84 D
      // 12e: dmul
      // 12f: dadd
      // 130: putfield iww._o7 D
      // 133: aload 0
      // 134: aload 1
      // 135: getfield iww.y7q D
      // 138: aload 2
      // 139: getfield iww.y7q D
      // 13c: dmul
      // 13d: aload 1
      // 13e: getfield iww._o7 D
      // 141: aload 2
      // 142: getfield iww._o7 D
      // 145: dmul
      // 146: dadd
      // 147: aload 1
      // 148: getfield iww.ffq D
      // 14b: aload 2
      // 14c: getfield iww.ffq D
      // 14f: dmul
      // 150: dadd
      // 151: putfield iww.ffq D
      // 154: iload 3
      // 155: ifne 2b3
      // 158: goto 15f
      // 15b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15e: athrow
      // 15f: aload 1
      // 160: goto 167
      // 163: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 166: athrow
      // 167: getfield iww.lxb D
      // 16a: aload 2
      // 16b: getfield iww.lxb D
      // 16e: dmul
      // 16f: aload 1
      // 170: getfield iww.y3c D
      // 173: aload 2
      // 174: getfield iww.y3c D
      // 177: dmul
      // 178: dadd
      // 179: aload 1
      // 17a: getfield iww.bhd D
      // 17d: aload 2
      // 17e: getfield iww.bhd D
      // 181: dmul
      // 182: dadd
      // 183: dstore 4
      // 185: aload 1
      // 186: getfield iww.lxb D
      // 189: aload 2
      // 18a: getfield iww.get D
      // 18d: dmul
      // 18e: aload 1
      // 18f: getfield iww.y3c D
      // 192: aload 2
      // 193: getfield iww.pwn D
      // 196: dmul
      // 197: dadd
      // 198: aload 1
      // 199: getfield iww.bhd D
      // 19c: aload 2
      // 19d: getfield iww.c84 D
      // 1a0: dmul
      // 1a1: dadd
      // 1a2: dstore 6
      // 1a4: aload 1
      // 1a5: getfield iww.lxb D
      // 1a8: aload 2
      // 1a9: getfield iww.y7q D
      // 1ac: dmul
      // 1ad: aload 1
      // 1ae: getfield iww.y3c D
      // 1b1: aload 2
      // 1b2: getfield iww._o7 D
      // 1b5: dmul
      // 1b6: dadd
      // 1b7: aload 1
      // 1b8: getfield iww.bhd D
      // 1bb: aload 2
      // 1bc: getfield iww.ffq D
      // 1bf: dmul
      // 1c0: dadd
      // 1c1: dstore 8
      // 1c3: aload 1
      // 1c4: getfield iww.get D
      // 1c7: aload 2
      // 1c8: getfield iww.lxb D
      // 1cb: dmul
      // 1cc: aload 1
      // 1cd: getfield iww.pwn D
      // 1d0: aload 2
      // 1d1: getfield iww.y3c D
      // 1d4: dmul
      // 1d5: dadd
      // 1d6: aload 1
      // 1d7: getfield iww.c84 D
      // 1da: aload 2
      // 1db: getfield iww.bhd D
      // 1de: dmul
      // 1df: dadd
      // 1e0: dstore 10
      // 1e2: aload 1
      // 1e3: getfield iww.get D
      // 1e6: aload 2
      // 1e7: getfield iww.get D
      // 1ea: dmul
      // 1eb: aload 1
      // 1ec: getfield iww.pwn D
      // 1ef: aload 2
      // 1f0: getfield iww.pwn D
      // 1f3: dmul
      // 1f4: dadd
      // 1f5: aload 1
      // 1f6: getfield iww.c84 D
      // 1f9: aload 2
      // 1fa: getfield iww.c84 D
      // 1fd: dmul
      // 1fe: dadd
      // 1ff: dstore 12
      // 201: aload 1
      // 202: getfield iww.get D
      // 205: aload 2
      // 206: getfield iww.y7q D
      // 209: dmul
      // 20a: aload 1
      // 20b: getfield iww.pwn D
      // 20e: aload 2
      // 20f: getfield iww._o7 D
      // 212: dmul
      // 213: dadd
      // 214: aload 1
      // 215: getfield iww.c84 D
      // 218: aload 2
      // 219: getfield iww.ffq D
      // 21c: dmul
      // 21d: dadd
      // 21e: dstore 14
      // 220: aload 1
      // 221: getfield iww.y7q D
      // 224: aload 2
      // 225: getfield iww.lxb D
      // 228: dmul
      // 229: aload 1
      // 22a: getfield iww._o7 D
      // 22d: aload 2
      // 22e: getfield iww.y3c D
      // 231: dmul
      // 232: dadd
      // 233: aload 1
      // 234: getfield iww.ffq D
      // 237: aload 2
      // 238: getfield iww.bhd D
      // 23b: dmul
      // 23c: dadd
      // 23d: dstore 16
      // 23f: aload 1
      // 240: getfield iww.y7q D
      // 243: aload 2
      // 244: getfield iww.get D
      // 247: dmul
      // 248: aload 1
      // 249: getfield iww._o7 D
      // 24c: aload 2
      // 24d: getfield iww.pwn D
      // 250: dmul
      // 251: dadd
      // 252: aload 1
      // 253: getfield iww.ffq D
      // 256: aload 2
      // 257: getfield iww.c84 D
      // 25a: dmul
      // 25b: dadd
      // 25c: dstore 18
      // 25e: aload 1
      // 25f: getfield iww.y7q D
      // 262: aload 2
      // 263: getfield iww.y7q D
      // 266: dmul
      // 267: aload 1
      // 268: getfield iww._o7 D
      // 26b: aload 2
      // 26c: getfield iww._o7 D
      // 26f: dmul
      // 270: dadd
      // 271: aload 1
      // 272: getfield iww.ffq D
      // 275: aload 2
      // 276: getfield iww.ffq D
      // 279: dmul
      // 27a: dadd
      // 27b: dstore 20
      // 27d: aload 0
      // 27e: dload 4
      // 280: putfield iww.lxb D
      // 283: aload 0
      // 284: dload 6
      // 286: putfield iww.y3c D
      // 289: aload 0
      // 28a: dload 8
      // 28c: putfield iww.bhd D
      // 28f: aload 0
      // 290: dload 10
      // 292: putfield iww.get D
      // 295: aload 0
      // 296: dload 12
      // 298: putfield iww.pwn D
      // 29b: aload 0
      // 29c: dload 14
      // 29e: putfield iww.c84 D
      // 2a1: aload 0
      // 2a2: dload 16
      // 2a4: putfield iww.y7q D
      // 2a7: aload 0
      // 2a8: dload 18
      // 2aa: putfield iww._o7 D
      // 2ad: aload 0
      // 2ae: dload 20
      // 2b0: putfield iww.ffq D
      // 2b3: return
   }

   public final void ldy(iww param1, iww param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 167
      // 009: aload 1
      // 00a: if_acmpeq 15f
      // 00d: goto 014
      // 010: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifne 167
      // 019: goto 020
      // 01c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 15f
      // 024: goto 02b
      // 027: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield iww.lxb D
      // 030: aload 2
      // 031: getfield iww.lxb D
      // 034: dmul
      // 035: aload 1
      // 036: getfield iww.get D
      // 039: aload 2
      // 03a: getfield iww.get D
      // 03d: dmul
      // 03e: dadd
      // 03f: aload 1
      // 040: getfield iww.y7q D
      // 043: aload 2
      // 044: getfield iww.y7q D
      // 047: dmul
      // 048: dadd
      // 049: putfield iww.lxb D
      // 04c: aload 0
      // 04d: aload 1
      // 04e: getfield iww.lxb D
      // 051: aload 2
      // 052: getfield iww.y3c D
      // 055: dmul
      // 056: aload 1
      // 057: getfield iww.get D
      // 05a: aload 2
      // 05b: getfield iww.pwn D
      // 05e: dmul
      // 05f: dadd
      // 060: aload 1
      // 061: getfield iww.y7q D
      // 064: aload 2
      // 065: getfield iww._o7 D
      // 068: dmul
      // 069: dadd
      // 06a: putfield iww.y3c D
      // 06d: aload 0
      // 06e: aload 1
      // 06f: getfield iww.lxb D
      // 072: aload 2
      // 073: getfield iww.bhd D
      // 076: dmul
      // 077: aload 1
      // 078: getfield iww.get D
      // 07b: aload 2
      // 07c: getfield iww.c84 D
      // 07f: dmul
      // 080: dadd
      // 081: aload 1
      // 082: getfield iww.y7q D
      // 085: aload 2
      // 086: getfield iww.ffq D
      // 089: dmul
      // 08a: dadd
      // 08b: putfield iww.bhd D
      // 08e: aload 0
      // 08f: aload 1
      // 090: getfield iww.y3c D
      // 093: aload 2
      // 094: getfield iww.lxb D
      // 097: dmul
      // 098: aload 1
      // 099: getfield iww.pwn D
      // 09c: aload 2
      // 09d: getfield iww.get D
      // 0a0: dmul
      // 0a1: dadd
      // 0a2: aload 1
      // 0a3: getfield iww._o7 D
      // 0a6: aload 2
      // 0a7: getfield iww.y7q D
      // 0aa: dmul
      // 0ab: dadd
      // 0ac: putfield iww.get D
      // 0af: aload 0
      // 0b0: aload 1
      // 0b1: getfield iww.y3c D
      // 0b4: aload 2
      // 0b5: getfield iww.y3c D
      // 0b8: dmul
      // 0b9: aload 1
      // 0ba: getfield iww.pwn D
      // 0bd: aload 2
      // 0be: getfield iww.pwn D
      // 0c1: dmul
      // 0c2: dadd
      // 0c3: aload 1
      // 0c4: getfield iww._o7 D
      // 0c7: aload 2
      // 0c8: getfield iww._o7 D
      // 0cb: dmul
      // 0cc: dadd
      // 0cd: putfield iww.pwn D
      // 0d0: aload 0
      // 0d1: aload 1
      // 0d2: getfield iww.y3c D
      // 0d5: aload 2
      // 0d6: getfield iww.bhd D
      // 0d9: dmul
      // 0da: aload 1
      // 0db: getfield iww.pwn D
      // 0de: aload 2
      // 0df: getfield iww.c84 D
      // 0e2: dmul
      // 0e3: dadd
      // 0e4: aload 1
      // 0e5: getfield iww._o7 D
      // 0e8: aload 2
      // 0e9: getfield iww.ffq D
      // 0ec: dmul
      // 0ed: dadd
      // 0ee: putfield iww.c84 D
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: getfield iww.bhd D
      // 0f6: aload 2
      // 0f7: getfield iww.lxb D
      // 0fa: dmul
      // 0fb: aload 1
      // 0fc: getfield iww.c84 D
      // 0ff: aload 2
      // 100: getfield iww.get D
      // 103: dmul
      // 104: dadd
      // 105: aload 1
      // 106: getfield iww.ffq D
      // 109: aload 2
      // 10a: getfield iww.y7q D
      // 10d: dmul
      // 10e: dadd
      // 10f: putfield iww.y7q D
      // 112: aload 0
      // 113: aload 1
      // 114: getfield iww.bhd D
      // 117: aload 2
      // 118: getfield iww.y3c D
      // 11b: dmul
      // 11c: aload 1
      // 11d: getfield iww.c84 D
      // 120: aload 2
      // 121: getfield iww.pwn D
      // 124: dmul
      // 125: dadd
      // 126: aload 1
      // 127: getfield iww.ffq D
      // 12a: aload 2
      // 12b: getfield iww._o7 D
      // 12e: dmul
      // 12f: dadd
      // 130: putfield iww._o7 D
      // 133: aload 0
      // 134: aload 1
      // 135: getfield iww.bhd D
      // 138: aload 2
      // 139: getfield iww.bhd D
      // 13c: dmul
      // 13d: aload 1
      // 13e: getfield iww.c84 D
      // 141: aload 2
      // 142: getfield iww.c84 D
      // 145: dmul
      // 146: dadd
      // 147: aload 1
      // 148: getfield iww.ffq D
      // 14b: aload 2
      // 14c: getfield iww.ffq D
      // 14f: dmul
      // 150: dadd
      // 151: putfield iww.ffq D
      // 154: iload 3
      // 155: ifeq 2b3
      // 158: goto 15f
      // 15b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15e: athrow
      // 15f: aload 1
      // 160: goto 167
      // 163: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 166: athrow
      // 167: getfield iww.lxb D
      // 16a: aload 2
      // 16b: getfield iww.lxb D
      // 16e: dmul
      // 16f: aload 1
      // 170: getfield iww.get D
      // 173: aload 2
      // 174: getfield iww.get D
      // 177: dmul
      // 178: dadd
      // 179: aload 1
      // 17a: getfield iww.y7q D
      // 17d: aload 2
      // 17e: getfield iww.y7q D
      // 181: dmul
      // 182: dadd
      // 183: dstore 4
      // 185: aload 1
      // 186: getfield iww.lxb D
      // 189: aload 2
      // 18a: getfield iww.y3c D
      // 18d: dmul
      // 18e: aload 1
      // 18f: getfield iww.get D
      // 192: aload 2
      // 193: getfield iww.pwn D
      // 196: dmul
      // 197: dadd
      // 198: aload 1
      // 199: getfield iww.y7q D
      // 19c: aload 2
      // 19d: getfield iww._o7 D
      // 1a0: dmul
      // 1a1: dadd
      // 1a2: dstore 6
      // 1a4: aload 1
      // 1a5: getfield iww.lxb D
      // 1a8: aload 2
      // 1a9: getfield iww.bhd D
      // 1ac: dmul
      // 1ad: aload 1
      // 1ae: getfield iww.get D
      // 1b1: aload 2
      // 1b2: getfield iww.c84 D
      // 1b5: dmul
      // 1b6: dadd
      // 1b7: aload 1
      // 1b8: getfield iww.y7q D
      // 1bb: aload 2
      // 1bc: getfield iww.ffq D
      // 1bf: dmul
      // 1c0: dadd
      // 1c1: dstore 8
      // 1c3: aload 1
      // 1c4: getfield iww.y3c D
      // 1c7: aload 2
      // 1c8: getfield iww.lxb D
      // 1cb: dmul
      // 1cc: aload 1
      // 1cd: getfield iww.pwn D
      // 1d0: aload 2
      // 1d1: getfield iww.get D
      // 1d4: dmul
      // 1d5: dadd
      // 1d6: aload 1
      // 1d7: getfield iww._o7 D
      // 1da: aload 2
      // 1db: getfield iww.y7q D
      // 1de: dmul
      // 1df: dadd
      // 1e0: dstore 10
      // 1e2: aload 1
      // 1e3: getfield iww.y3c D
      // 1e6: aload 2
      // 1e7: getfield iww.y3c D
      // 1ea: dmul
      // 1eb: aload 1
      // 1ec: getfield iww.pwn D
      // 1ef: aload 2
      // 1f0: getfield iww.pwn D
      // 1f3: dmul
      // 1f4: dadd
      // 1f5: aload 1
      // 1f6: getfield iww._o7 D
      // 1f9: aload 2
      // 1fa: getfield iww._o7 D
      // 1fd: dmul
      // 1fe: dadd
      // 1ff: dstore 12
      // 201: aload 1
      // 202: getfield iww.y3c D
      // 205: aload 2
      // 206: getfield iww.bhd D
      // 209: dmul
      // 20a: aload 1
      // 20b: getfield iww.pwn D
      // 20e: aload 2
      // 20f: getfield iww.c84 D
      // 212: dmul
      // 213: dadd
      // 214: aload 1
      // 215: getfield iww._o7 D
      // 218: aload 2
      // 219: getfield iww.ffq D
      // 21c: dmul
      // 21d: dadd
      // 21e: dstore 14
      // 220: aload 1
      // 221: getfield iww.bhd D
      // 224: aload 2
      // 225: getfield iww.lxb D
      // 228: dmul
      // 229: aload 1
      // 22a: getfield iww.c84 D
      // 22d: aload 2
      // 22e: getfield iww.get D
      // 231: dmul
      // 232: dadd
      // 233: aload 1
      // 234: getfield iww.ffq D
      // 237: aload 2
      // 238: getfield iww.y7q D
      // 23b: dmul
      // 23c: dadd
      // 23d: dstore 16
      // 23f: aload 1
      // 240: getfield iww.bhd D
      // 243: aload 2
      // 244: getfield iww.y3c D
      // 247: dmul
      // 248: aload 1
      // 249: getfield iww.c84 D
      // 24c: aload 2
      // 24d: getfield iww.pwn D
      // 250: dmul
      // 251: dadd
      // 252: aload 1
      // 253: getfield iww.ffq D
      // 256: aload 2
      // 257: getfield iww._o7 D
      // 25a: dmul
      // 25b: dadd
      // 25c: dstore 18
      // 25e: aload 1
      // 25f: getfield iww.bhd D
      // 262: aload 2
      // 263: getfield iww.bhd D
      // 266: dmul
      // 267: aload 1
      // 268: getfield iww.c84 D
      // 26b: aload 2
      // 26c: getfield iww.c84 D
      // 26f: dmul
      // 270: dadd
      // 271: aload 1
      // 272: getfield iww.ffq D
      // 275: aload 2
      // 276: getfield iww.ffq D
      // 279: dmul
      // 27a: dadd
      // 27b: dstore 20
      // 27d: aload 0
      // 27e: dload 4
      // 280: putfield iww.lxb D
      // 283: aload 0
      // 284: dload 6
      // 286: putfield iww.y3c D
      // 289: aload 0
      // 28a: dload 8
      // 28c: putfield iww.bhd D
      // 28f: aload 0
      // 290: dload 10
      // 292: putfield iww.get D
      // 295: aload 0
      // 296: dload 12
      // 298: putfield iww.pwn D
      // 29b: aload 0
      // 29c: dload 14
      // 29e: putfield iww.c84 D
      // 2a1: aload 0
      // 2a2: dload 16
      // 2a4: putfield iww.y7q D
      // 2a7: aload 0
      // 2a8: dload 18
      // 2aa: putfield iww._o7 D
      // 2ad: aload 0
      // 2ae: dload 20
      // 2b0: putfield iww.ffq D
      // 2b3: return
   }

   public final void dtx() {
      double[] var1 = new double[9];
      double[] var2 = new double[3];
      this.oa4(var2, var1);
      this.lxb = var1[0];
      this.y3c = var1[1];
      this.bhd = var1[2];
      this.get = var1[3];
      this.pwn = var1[4];
      this.c84 = var1[5];
      this.y7q = var1[6];
      this._o7 = var1[7];
      this.ffq = var1[8];
   }

   public final void qw6(iww var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      var2[0] = var1.lxb;
      var2[1] = var1.y3c;
      var2[2] = var1.bhd;
      var2[3] = var1.get;
      var2[4] = var1.pwn;
      var2[5] = var1.c84;
      var2[6] = var1.y7q;
      var2[7] = var1._o7;
      var2[8] = var1.ffq;
      d20(var2, var4, var3);
      this.lxb = var3[0];
      this.y3c = var3[1];
      this.bhd = var3[2];
      this.get = var3[3];
      this.pwn = var3[4];
      this.c84 = var3[5];
      this.y7q = var3[6];
      this._o7 = var3[7];
      this.ffq = var3[8];
   }

   public final void ozs() {
      double var1 = 1.0 / Math.sqrt(this.lxb * this.lxb + this.get * this.get + this.y7q * this.y7q);
      this.lxb *= var1;
      this.get *= var1;
      this.y7q *= var1;
      var1 = 1.0 / Math.sqrt(this.y3c * this.y3c + this.pwn * this.pwn + this._o7 * this._o7);
      this.y3c *= var1;
      this.pwn *= var1;
      this._o7 *= var1;
      this.bhd = this.get * this._o7 - this.pwn * this.y7q;
      this.c84 = this.y3c * this.y7q - this.lxb * this._o7;
      this.ffq = this.lxb * this.pwn - this.y3c * this.get;
   }

   public final void eub(iww var1) {
      double var2 = 1.0 / Math.sqrt(var1.lxb * var1.lxb + var1.get * var1.get + var1.y7q * var1.y7q);
      this.lxb = var1.lxb * var2;
      this.get = var1.get * var2;
      this.y7q = var1.y7q * var2;
      var2 = 1.0 / Math.sqrt(var1.y3c * var1.y3c + var1.pwn * var1.pwn + var1._o7 * var1._o7);
      this.y3c = var1.y3c * var2;
      this.pwn = var1.pwn * var2;
      this._o7 = var1._o7 * var2;
      this.bhd = this.get * this._o7 - this.pwn * this.y7q;
      this.c84 = this.y3c * this.y7q - this.lxb * this._o7;
      this.ffq = this.lxb * this.pwn - this.y3c * this.get;
   }

   public boolean w91(iww param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield iww.lxb D
      // 008: aload 1
      // 009: getfield iww.lxb D
      // 00c: dcmpl
      // 00d: iload 2
      // 00e: ifne 02b
      // 011: ifne 10f
      // 014: goto 01b
      // 017: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield iww.y3c D
      // 01f: aload 1
      // 020: getfield iww.y3c D
      // 023: dcmpl
      // 024: goto 02b
      // 027: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: iload 2
      // 02c: ifne 049
      // 02f: ifne 10f
      // 032: goto 039
      // 035: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 038: athrow
      // 039: aload 0
      // 03a: getfield iww.bhd D
      // 03d: aload 1
      // 03e: getfield iww.bhd D
      // 041: dcmpl
      // 042: goto 049
      // 045: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: iload 2
      // 04a: ifne 067
      // 04d: ifne 10f
      // 050: goto 057
      // 053: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 056: athrow
      // 057: aload 0
      // 058: getfield iww.get D
      // 05b: aload 1
      // 05c: getfield iww.get D
      // 05f: dcmpl
      // 060: goto 067
      // 063: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 066: athrow
      // 067: iload 2
      // 068: ifne 085
      // 06b: ifne 10f
      // 06e: goto 075
      // 071: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 074: athrow
      // 075: aload 0
      // 076: getfield iww.pwn D
      // 079: aload 1
      // 07a: getfield iww.pwn D
      // 07d: dcmpl
      // 07e: goto 085
      // 081: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 084: athrow
      // 085: iload 2
      // 086: ifne 0a3
      // 089: ifne 10f
      // 08c: goto 093
      // 08f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 092: athrow
      // 093: aload 0
      // 094: getfield iww.c84 D
      // 097: aload 1
      // 098: getfield iww.c84 D
      // 09b: dcmpl
      // 09c: goto 0a3
      // 09f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a2: athrow
      // 0a3: iload 2
      // 0a4: ifne 0c1
      // 0a7: ifne 10f
      // 0aa: goto 0b1
      // 0ad: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield iww.y7q D
      // 0b5: aload 1
      // 0b6: getfield iww.y7q D
      // 0b9: dcmpl
      // 0ba: goto 0c1
      // 0bd: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c0: athrow
      // 0c1: iload 2
      // 0c2: ifne 0df
      // 0c5: ifne 10f
      // 0c8: goto 0cf
      // 0cb: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield iww._o7 D
      // 0d3: aload 1
      // 0d4: getfield iww._o7 D
      // 0d7: dcmpl
      // 0d8: goto 0df
      // 0db: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0de: athrow
      // 0df: iload 2
      // 0e0: ifne 0fd
      // 0e3: ifne 10f
      // 0e6: goto 0ed
      // 0e9: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield iww.ffq D
      // 0f1: aload 1
      // 0f2: getfield iww.ffq D
      // 0f5: dcmpl
      // 0f6: goto 0fd
      // 0f9: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0fc: athrow
      // 0fd: iload 2
      // 0fe: ifne 10c
      // 101: ifne 10f
      // 104: goto 10b
      // 107: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10a: athrow
      // 10b: bipush 1
      // 10c: goto 110
      // 10f: bipush 0
      // 110: ireturn
      // 111: astore 3
      // 112: bipush 0
      // 113: ireturn
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: checkcast iww
      // 008: astore 3
      // 009: aload 0
      // 00a: getfield iww.lxb D
      // 00d: aload 3
      // 00e: getfield iww.lxb D
      // 011: dcmpl
      // 012: iload 2
      // 013: ifeq 030
      // 016: ifne 114
      // 019: goto 020
      // 01c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield iww.y3c D
      // 024: aload 3
      // 025: getfield iww.y3c D
      // 028: dcmpl
      // 029: goto 030
      // 02c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02f: athrow
      // 030: iload 2
      // 031: ifeq 04e
      // 034: ifne 114
      // 037: goto 03e
      // 03a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03d: athrow
      // 03e: aload 0
      // 03f: getfield iww.bhd D
      // 042: aload 3
      // 043: getfield iww.bhd D
      // 046: dcmpl
      // 047: goto 04e
      // 04a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04d: athrow
      // 04e: iload 2
      // 04f: ifeq 06c
      // 052: ifne 114
      // 055: goto 05c
      // 058: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05b: athrow
      // 05c: aload 0
      // 05d: getfield iww.get D
      // 060: aload 3
      // 061: getfield iww.get D
      // 064: dcmpl
      // 065: goto 06c
      // 068: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06b: athrow
      // 06c: iload 2
      // 06d: ifeq 08a
      // 070: ifne 114
      // 073: goto 07a
      // 076: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 079: athrow
      // 07a: aload 0
      // 07b: getfield iww.pwn D
      // 07e: aload 3
      // 07f: getfield iww.pwn D
      // 082: dcmpl
      // 083: goto 08a
      // 086: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 089: athrow
      // 08a: iload 2
      // 08b: ifeq 0a8
      // 08e: ifne 114
      // 091: goto 098
      // 094: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 097: athrow
      // 098: aload 0
      // 099: getfield iww.c84 D
      // 09c: aload 3
      // 09d: getfield iww.c84 D
      // 0a0: dcmpl
      // 0a1: goto 0a8
      // 0a4: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a7: athrow
      // 0a8: iload 2
      // 0a9: ifeq 0c6
      // 0ac: ifne 114
      // 0af: goto 0b6
      // 0b2: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: getfield iww.y7q D
      // 0ba: aload 3
      // 0bb: getfield iww.y7q D
      // 0be: dcmpl
      // 0bf: goto 0c6
      // 0c2: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c5: athrow
      // 0c6: iload 2
      // 0c7: ifeq 0e4
      // 0ca: ifne 114
      // 0cd: goto 0d4
      // 0d0: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield iww._o7 D
      // 0d8: aload 3
      // 0d9: getfield iww._o7 D
      // 0dc: dcmpl
      // 0dd: goto 0e4
      // 0e0: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e3: athrow
      // 0e4: iload 2
      // 0e5: ifeq 102
      // 0e8: ifne 114
      // 0eb: goto 0f2
      // 0ee: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: getfield iww.ffq D
      // 0f6: aload 3
      // 0f7: getfield iww.ffq D
      // 0fa: dcmpl
      // 0fb: goto 102
      // 0fe: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 101: athrow
      // 102: iload 2
      // 103: ifeq 111
      // 106: ifne 114
      // 109: goto 110
      // 10c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10f: athrow
      // 110: bipush 1
      // 111: goto 115
      // 114: bipush 0
      // 115: ireturn
      // 116: astore 3
      // 117: bipush 0
      // 118: ireturn
      // 119: astore 3
      // 11a: bipush 0
      // 11b: ireturn
   }

   public boolean hsp(iww param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield iww.lxb D
      // 009: aload 1
      // 00a: getfield iww.lxb D
      // 00d: dsub
      // 00e: dstore 5
      // 010: dload 5
      // 012: iload 4
      // 014: ifne 02d
      // 017: dconst_0
      // 018: dcmpg
      // 019: ifge 030
      // 01c: goto 023
      // 01f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 022: athrow
      // 023: dload 5
      // 025: dneg
      // 026: goto 02d
      // 029: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02c: athrow
      // 02d: goto 032
      // 030: dload 5
      // 032: dload 2
      // 033: dcmpl
      // 034: iload 4
      // 036: ifne 064
      // 039: ifle 049
      // 03c: goto 043
      // 03f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 042: athrow
      // 043: bipush 0
      // 044: ireturn
      // 045: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: aload 0
      // 04a: getfield iww.y3c D
      // 04d: aload 1
      // 04e: getfield iww.y3c D
      // 051: dsub
      // 052: dstore 5
      // 054: dload 5
      // 056: iload 4
      // 058: ifne 071
      // 05b: dconst_0
      // 05c: dcmpg
      // 05d: goto 064
      // 060: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 063: athrow
      // 064: ifge 074
      // 067: dload 5
      // 069: dneg
      // 06a: goto 071
      // 06d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 070: athrow
      // 071: goto 076
      // 074: dload 5
      // 076: dload 2
      // 077: dcmpl
      // 078: iload 4
      // 07a: ifne 0a8
      // 07d: ifle 08d
      // 080: goto 087
      // 083: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 086: athrow
      // 087: bipush 0
      // 088: ireturn
      // 089: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield iww.bhd D
      // 091: aload 1
      // 092: getfield iww.bhd D
      // 095: dsub
      // 096: dstore 5
      // 098: dload 5
      // 09a: iload 4
      // 09c: ifne 0b5
      // 09f: dconst_0
      // 0a0: dcmpg
      // 0a1: goto 0a8
      // 0a4: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a7: athrow
      // 0a8: ifge 0b8
      // 0ab: dload 5
      // 0ad: dneg
      // 0ae: goto 0b5
      // 0b1: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b4: athrow
      // 0b5: goto 0ba
      // 0b8: dload 5
      // 0ba: dload 2
      // 0bb: dcmpl
      // 0bc: iload 4
      // 0be: ifne 0ec
      // 0c1: ifle 0d1
      // 0c4: goto 0cb
      // 0c7: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ca: athrow
      // 0cb: bipush 0
      // 0cc: ireturn
      // 0cd: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: getfield iww.get D
      // 0d5: aload 1
      // 0d6: getfield iww.get D
      // 0d9: dsub
      // 0da: dstore 5
      // 0dc: dload 5
      // 0de: iload 4
      // 0e0: ifne 0f9
      // 0e3: dconst_0
      // 0e4: dcmpg
      // 0e5: goto 0ec
      // 0e8: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0eb: athrow
      // 0ec: ifge 0fc
      // 0ef: dload 5
      // 0f1: dneg
      // 0f2: goto 0f9
      // 0f5: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f8: athrow
      // 0f9: goto 0fe
      // 0fc: dload 5
      // 0fe: dload 2
      // 0ff: dcmpl
      // 100: iload 4
      // 102: ifne 130
      // 105: ifle 115
      // 108: goto 10f
      // 10b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10e: athrow
      // 10f: bipush 0
      // 110: ireturn
      // 111: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 114: athrow
      // 115: aload 0
      // 116: getfield iww.pwn D
      // 119: aload 1
      // 11a: getfield iww.pwn D
      // 11d: dsub
      // 11e: dstore 5
      // 120: dload 5
      // 122: iload 4
      // 124: ifne 13d
      // 127: dconst_0
      // 128: dcmpg
      // 129: goto 130
      // 12c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12f: athrow
      // 130: ifge 140
      // 133: dload 5
      // 135: dneg
      // 136: goto 13d
      // 139: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13c: athrow
      // 13d: goto 142
      // 140: dload 5
      // 142: dload 2
      // 143: dcmpl
      // 144: iload 4
      // 146: ifne 174
      // 149: ifle 159
      // 14c: goto 153
      // 14f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 152: athrow
      // 153: bipush 0
      // 154: ireturn
      // 155: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 158: athrow
      // 159: aload 0
      // 15a: getfield iww.c84 D
      // 15d: aload 1
      // 15e: getfield iww.c84 D
      // 161: dsub
      // 162: dstore 5
      // 164: dload 5
      // 166: iload 4
      // 168: ifne 181
      // 16b: dconst_0
      // 16c: dcmpg
      // 16d: goto 174
      // 170: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 173: athrow
      // 174: ifge 184
      // 177: dload 5
      // 179: dneg
      // 17a: goto 181
      // 17d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 180: athrow
      // 181: goto 186
      // 184: dload 5
      // 186: dload 2
      // 187: dcmpl
      // 188: iload 4
      // 18a: ifne 1b8
      // 18d: ifle 19d
      // 190: goto 197
      // 193: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 196: athrow
      // 197: bipush 0
      // 198: ireturn
      // 199: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19c: athrow
      // 19d: aload 0
      // 19e: getfield iww.y7q D
      // 1a1: aload 1
      // 1a2: getfield iww.y7q D
      // 1a5: dsub
      // 1a6: dstore 5
      // 1a8: dload 5
      // 1aa: iload 4
      // 1ac: ifne 1c5
      // 1af: dconst_0
      // 1b0: dcmpg
      // 1b1: goto 1b8
      // 1b4: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b7: athrow
      // 1b8: ifge 1c8
      // 1bb: dload 5
      // 1bd: dneg
      // 1be: goto 1c5
      // 1c1: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c4: athrow
      // 1c5: goto 1ca
      // 1c8: dload 5
      // 1ca: dload 2
      // 1cb: dcmpl
      // 1cc: iload 4
      // 1ce: ifne 1fc
      // 1d1: ifle 1e1
      // 1d4: goto 1db
      // 1d7: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1da: athrow
      // 1db: bipush 0
      // 1dc: ireturn
      // 1dd: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e0: athrow
      // 1e1: aload 0
      // 1e2: getfield iww._o7 D
      // 1e5: aload 1
      // 1e6: getfield iww._o7 D
      // 1e9: dsub
      // 1ea: dstore 5
      // 1ec: dload 5
      // 1ee: iload 4
      // 1f0: ifne 209
      // 1f3: dconst_0
      // 1f4: dcmpg
      // 1f5: goto 1fc
      // 1f8: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1fb: athrow
      // 1fc: ifge 20c
      // 1ff: dload 5
      // 201: dneg
      // 202: goto 209
      // 205: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 208: athrow
      // 209: goto 20e
      // 20c: dload 5
      // 20e: dload 2
      // 20f: dcmpl
      // 210: iload 4
      // 212: ifne 240
      // 215: ifle 225
      // 218: goto 21f
      // 21b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 21e: athrow
      // 21f: bipush 0
      // 220: ireturn
      // 221: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 224: athrow
      // 225: aload 0
      // 226: getfield iww.ffq D
      // 229: aload 1
      // 22a: getfield iww.ffq D
      // 22d: dsub
      // 22e: dstore 5
      // 230: dload 5
      // 232: iload 4
      // 234: ifne 24d
      // 237: dconst_0
      // 238: dcmpg
      // 239: goto 240
      // 23c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23f: athrow
      // 240: ifge 250
      // 243: dload 5
      // 245: dneg
      // 246: goto 24d
      // 249: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24c: athrow
      // 24d: goto 252
      // 250: dload 5
      // 252: dload 2
      // 253: dcmpl
      // 254: iload 4
      // 256: ifne 26a
      // 259: ifle 269
      // 25c: goto 263
      // 25f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 262: athrow
      // 263: bipush 0
      // 264: ireturn
      // 265: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 268: athrow
      // 269: bipush 1
      // 26a: ireturn
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = get.mql(var1, this.lxb);
      var1 = get.mql(var1, this.y3c);
      var1 = get.mql(var1, this.bhd);
      var1 = get.mql(var1, this.get);
      var1 = get.mql(var1, this.pwn);
      var1 = get.mql(var1, this.c84);
      var1 = get.mql(var1, this.y7q);
      var1 = get.mql(var1, this._o7);
      var1 = get.mql(var1, this.ffq);
      return get.p05(var1);
   }

   public final void jbq() {
      this.lxb = 0.0;
      this.y3c = 0.0;
      this.bhd = 0.0;
      this.get = 0.0;
      this.pwn = 0.0;
      this.c84 = 0.0;
      this.y7q = 0.0;
      this._o7 = 0.0;
      this.ffq = 0.0;
   }

   public final void ppg() {
      this.lxb = -this.lxb;
      this.y3c = -this.y3c;
      this.bhd = -this.bhd;
      this.get = -this.get;
      this.pwn = -this.pwn;
      this.c84 = -this.c84;
      this.y7q = -this.y7q;
      this._o7 = -this._o7;
      this.ffq = -this.ffq;
   }

   public final void ngr(iww var1) {
      this.lxb = -var1.lxb;
      this.y3c = -var1.y3c;
      this.bhd = -var1.bhd;
      this.get = -var1.get;
      this.pwn = -var1.pwn;
      this.c84 = -var1.c84;
      this.y7q = -var1.y7q;
      this._o7 = -var1._o7;
      this.ffq = -var1.ffq;
   }

   public final void gtv(g5s var1) {
      double var2 = this.lxb * var1.v54 + this.y3c * var1.g0w + this.bhd * var1.mu9;
      double var4 = this.get * var1.v54 + this.pwn * var1.g0w + this.c84 * var1.mu9;
      double var6 = this.y7q * var1.v54 + this._o7 * var1.g0w + this.ffq * var1.mu9;
      var1.ww3(var2, var4, var6);
   }

   public final void ony(g5s var1, g5s var2) {
      double var3 = this.lxb * var1.v54 + this.y3c * var1.g0w + this.bhd * var1.mu9;
      double var5 = this.get * var1.v54 + this.pwn * var1.g0w + this.c84 * var1.mu9;
      var2.mu9 = this.y7q * var1.v54 + this._o7 * var1.g0w + this.ffq * var1.mu9;
      var2.v54 = var3;
      var2.g0w = var5;
   }

   public final void oa4(double[] var1, double[] var2) {
      double[] var3 = new double[]{this.lxb, this.y3c, this.bhd, this.get, this.pwn, this.c84, this.y7q, this._o7, this.ffq};
      d20(var3, var1, var2);
   }

   public static void d20(double[] param0, double[] param1, double[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 9
      // 002: newarray 7
      // 004: astore 10
      // 006: invokestatic t9d.c ()I
      // 009: bipush 9
      // 00b: newarray 7
      // 00d: astore 11
      // 00f: bipush 9
      // 011: newarray 7
      // 013: astore 12
      // 015: bipush 9
      // 017: newarray 7
      // 019: astore 13
      // 01b: aload 12
      // 01d: astore 14
      // 01f: aload 13
      // 021: astore 15
      // 023: bipush 9
      // 025: newarray 7
      // 027: astore 16
      // 029: istore 3
      // 02a: bipush 3
      // 02b: newarray 7
      // 02d: astore 17
      // 02f: bipush 3
      // 030: newarray 7
      // 032: astore 18
      // 034: bipush 0
      // 035: istore 20
      // 037: bipush 0
      // 038: istore 4
      // 03a: iload 4
      // 03c: bipush 9
      // 03e: if_icmpge 05c
      // 041: aload 16
      // 043: iload 4
      // 045: aload 0
      // 046: iload 4
      // 048: daload
      // 049: dastore
      // 04a: iinc 4 1
      // 04d: iload 3
      // 04e: ifne 0b0
      // 051: iload 3
      // 052: ifeq 03a
      // 055: goto 05c
      // 058: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05b: athrow
      // 05c: aload 0
      // 05d: bipush 3
      // 05e: daload
      // 05f: aload 0
      // 060: bipush 3
      // 061: daload
      // 062: dmul
      // 063: ldc2_w 1.110223024E-16
      // 066: dcmpg
      // 067: iload 3
      // 068: ifne 0c6
      // 06b: ifge 0b0
      // 06e: goto 075
      // 071: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 074: athrow
      // 075: aload 10
      // 077: bipush 0
      // 078: dconst_1
      // 079: dastore
      // 07a: aload 10
      // 07c: bipush 1
      // 07d: dconst_0
      // 07e: dastore
      // 07f: aload 10
      // 081: bipush 2
      // 082: dconst_0
      // 083: dastore
      // 084: aload 10
      // 086: bipush 3
      // 087: dconst_0
      // 088: dastore
      // 089: aload 10
      // 08b: bipush 4
      // 08c: dconst_1
      // 08d: dastore
      // 08e: aload 10
      // 090: bipush 5
      // 091: dconst_0
      // 092: dastore
      // 093: aload 10
      // 095: bipush 6
      // 097: dconst_0
      // 098: dastore
      // 099: aload 10
      // 09b: bipush 7
      // 09d: dconst_0
      // 09e: dastore
      // 09f: aload 10
      // 0a1: bipush 8
      // 0a3: dconst_1
      // 0a4: dastore
      // 0a5: iload 3
      // 0a6: ifeq 222
      // 0a9: goto 0b0
      // 0ac: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: bipush 0
      // 0b2: daload
      // 0b3: aload 0
      // 0b4: bipush 0
      // 0b5: daload
      // 0b6: dmul
      // 0b7: ldc2_w 1.110223024E-16
      // 0ba: iload 3
      // 0bb: ifne 15f
      // 0be: dcmpg
      // 0bf: goto 0c6
      // 0c2: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c5: athrow
      // 0c6: ifge 145
      // 0c9: aload 14
      // 0cb: bipush 0
      // 0cc: aload 0
      // 0cd: bipush 0
      // 0ce: daload
      // 0cf: dastore
      // 0d0: aload 14
      // 0d2: bipush 1
      // 0d3: aload 0
      // 0d4: bipush 1
      // 0d5: daload
      // 0d6: dastore
      // 0d7: aload 14
      // 0d9: bipush 2
      // 0da: aload 0
      // 0db: bipush 2
      // 0dc: daload
      // 0dd: dastore
      // 0de: aload 0
      // 0df: bipush 0
      // 0e0: aload 0
      // 0e1: bipush 3
      // 0e2: daload
      // 0e3: dastore
      // 0e4: aload 0
      // 0e5: bipush 1
      // 0e6: aload 0
      // 0e7: bipush 4
      // 0e8: daload
      // 0e9: dastore
      // 0ea: aload 0
      // 0eb: bipush 2
      // 0ec: aload 0
      // 0ed: bipush 5
      // 0ee: daload
      // 0ef: dastore
      // 0f0: aload 0
      // 0f1: bipush 3
      // 0f2: aload 14
      // 0f4: bipush 0
      // 0f5: daload
      // 0f6: dneg
      // 0f7: dastore
      // 0f8: aload 0
      // 0f9: bipush 4
      // 0fa: aload 14
      // 0fc: bipush 1
      // 0fd: daload
      // 0fe: dneg
      // 0ff: dastore
      // 100: aload 0
      // 101: bipush 5
      // 102: aload 14
      // 104: bipush 2
      // 105: daload
      // 106: dneg
      // 107: dastore
      // 108: aload 10
      // 10a: bipush 0
      // 10b: dconst_0
      // 10c: dastore
      // 10d: aload 10
      // 10f: bipush 1
      // 110: dconst_1
      // 111: dastore
      // 112: aload 10
      // 114: bipush 2
      // 115: dconst_0
      // 116: dastore
      // 117: aload 10
      // 119: bipush 3
      // 11a: ldc2_w -1.0
      // 11d: dastore
      // 11e: aload 10
      // 120: bipush 4
      // 121: dconst_0
      // 122: dastore
      // 123: aload 10
      // 125: bipush 5
      // 126: dconst_0
      // 127: dastore
      // 128: aload 10
      // 12a: bipush 6
      // 12c: dconst_0
      // 12d: dastore
      // 12e: aload 10
      // 130: bipush 7
      // 132: dconst_0
      // 133: dastore
      // 134: aload 10
      // 136: bipush 8
      // 138: dconst_1
      // 139: dastore
      // 13a: iload 3
      // 13b: ifeq 222
      // 13e: goto 145
      // 141: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 144: athrow
      // 145: dconst_1
      // 146: aload 0
      // 147: bipush 0
      // 148: daload
      // 149: aload 0
      // 14a: bipush 0
      // 14b: daload
      // 14c: dmul
      // 14d: aload 0
      // 14e: bipush 3
      // 14f: daload
      // 150: aload 0
      // 151: bipush 3
      // 152: daload
      // 153: dmul
      // 154: dadd
      // 155: invokestatic java/lang/Math.sqrt (D)D
      // 158: goto 15f
      // 15b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15e: athrow
      // 15f: ddiv
      // 160: dstore 6
      // 162: aload 0
      // 163: bipush 0
      // 164: daload
      // 165: dload 6
      // 167: dmul
      // 168: dstore 25
      // 16a: aload 0
      // 16b: bipush 3
      // 16c: daload
      // 16d: dload 6
      // 16f: dmul
      // 170: dstore 33
      // 172: aload 14
      // 174: bipush 0
      // 175: dload 25
      // 177: aload 0
      // 178: bipush 0
      // 179: daload
      // 17a: dmul
      // 17b: dload 33
      // 17d: aload 0
      // 17e: bipush 3
      // 17f: daload
      // 180: dmul
      // 181: dadd
      // 182: dastore
      // 183: aload 14
      // 185: bipush 1
      // 186: dload 25
      // 188: aload 0
      // 189: bipush 1
      // 18a: daload
      // 18b: dmul
      // 18c: dload 33
      // 18e: aload 0
      // 18f: bipush 4
      // 190: daload
      // 191: dmul
      // 192: dadd
      // 193: dastore
      // 194: aload 14
      // 196: bipush 2
      // 197: dload 25
      // 199: aload 0
      // 19a: bipush 2
      // 19b: daload
      // 19c: dmul
      // 19d: dload 33
      // 19f: aload 0
      // 1a0: bipush 5
      // 1a1: daload
      // 1a2: dmul
      // 1a3: dadd
      // 1a4: dastore
      // 1a5: aload 0
      // 1a6: bipush 3
      // 1a7: dload 33
      // 1a9: dneg
      // 1aa: aload 0
      // 1ab: bipush 0
      // 1ac: daload
      // 1ad: dmul
      // 1ae: dload 25
      // 1b0: aload 0
      // 1b1: bipush 3
      // 1b2: daload
      // 1b3: dmul
      // 1b4: dadd
      // 1b5: dastore
      // 1b6: aload 0
      // 1b7: bipush 4
      // 1b8: dload 33
      // 1ba: dneg
      // 1bb: aload 0
      // 1bc: bipush 1
      // 1bd: daload
      // 1be: dmul
      // 1bf: dload 25
      // 1c1: aload 0
      // 1c2: bipush 4
      // 1c3: daload
      // 1c4: dmul
      // 1c5: dadd
      // 1c6: dastore
      // 1c7: aload 0
      // 1c8: bipush 5
      // 1c9: dload 33
      // 1cb: dneg
      // 1cc: aload 0
      // 1cd: bipush 2
      // 1ce: daload
      // 1cf: dmul
      // 1d0: dload 25
      // 1d2: aload 0
      // 1d3: bipush 5
      // 1d4: daload
      // 1d5: dmul
      // 1d6: dadd
      // 1d7: dastore
      // 1d8: aload 0
      // 1d9: bipush 0
      // 1da: aload 14
      // 1dc: bipush 0
      // 1dd: daload
      // 1de: dastore
      // 1df: aload 0
      // 1e0: bipush 1
      // 1e1: aload 14
      // 1e3: bipush 1
      // 1e4: daload
      // 1e5: dastore
      // 1e6: aload 0
      // 1e7: bipush 2
      // 1e8: aload 14
      // 1ea: bipush 2
      // 1eb: daload
      // 1ec: dastore
      // 1ed: aload 10
      // 1ef: bipush 0
      // 1f0: dload 25
      // 1f2: dastore
      // 1f3: aload 10
      // 1f5: bipush 1
      // 1f6: dload 33
      // 1f8: dastore
      // 1f9: aload 10
      // 1fb: bipush 2
      // 1fc: dconst_0
      // 1fd: dastore
      // 1fe: aload 10
      // 200: bipush 3
      // 201: dload 33
      // 203: dneg
      // 204: dastore
      // 205: aload 10
      // 207: bipush 4
      // 208: dload 25
      // 20a: dastore
      // 20b: aload 10
      // 20d: bipush 5
      // 20e: dconst_0
      // 20f: dastore
      // 210: aload 10
      // 212: bipush 6
      // 214: dconst_0
      // 215: dastore
      // 216: aload 10
      // 218: bipush 7
      // 21a: dconst_0
      // 21b: dastore
      // 21c: aload 10
      // 21e: bipush 8
      // 220: dconst_1
      // 221: dastore
      // 222: aload 0
      // 223: bipush 6
      // 225: daload
      // 226: aload 0
      // 227: bipush 6
      // 229: daload
      // 22a: dmul
      // 22b: ldc2_w 1.110223024E-16
      // 22e: dcmpg
      // 22f: iload 3
      // 230: ifne 256
      // 233: ifge 240
      // 236: goto 23d
      // 239: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23c: athrow
      // 23d: goto 40f
      // 240: aload 0
      // 241: bipush 0
      // 242: daload
      // 243: aload 0
      // 244: bipush 0
      // 245: daload
      // 246: dmul
      // 247: ldc2_w 1.110223024E-16
      // 24a: iload 3
      // 24b: ifne 316
      // 24e: dcmpg
      // 24f: goto 256
      // 252: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 255: athrow
      // 256: ifge 2fa
      // 259: aload 14
      // 25b: bipush 0
      // 25c: aload 0
      // 25d: bipush 0
      // 25e: daload
      // 25f: dastore
      // 260: aload 14
      // 262: bipush 1
      // 263: aload 0
      // 264: bipush 1
      // 265: daload
      // 266: dastore
      // 267: aload 14
      // 269: bipush 2
      // 26a: aload 0
      // 26b: bipush 2
      // 26c: daload
      // 26d: dastore
      // 26e: aload 0
      // 26f: bipush 0
      // 270: aload 0
      // 271: bipush 6
      // 273: daload
      // 274: dastore
      // 275: aload 0
      // 276: bipush 1
      // 277: aload 0
      // 278: bipush 7
      // 27a: daload
      // 27b: dastore
      // 27c: aload 0
      // 27d: bipush 2
      // 27e: aload 0
      // 27f: bipush 8
      // 281: daload
      // 282: dastore
      // 283: aload 0
      // 284: bipush 6
      // 286: aload 14
      // 288: bipush 0
      // 289: daload
      // 28a: dneg
      // 28b: dastore
      // 28c: aload 0
      // 28d: bipush 7
      // 28f: aload 14
      // 291: bipush 1
      // 292: daload
      // 293: dneg
      // 294: dastore
      // 295: aload 0
      // 296: bipush 8
      // 298: aload 14
      // 29a: bipush 2
      // 29b: daload
      // 29c: dneg
      // 29d: dastore
      // 29e: aload 14
      // 2a0: bipush 0
      // 2a1: aload 10
      // 2a3: bipush 0
      // 2a4: daload
      // 2a5: dastore
      // 2a6: aload 14
      // 2a8: bipush 1
      // 2a9: aload 10
      // 2ab: bipush 1
      // 2ac: daload
      // 2ad: dastore
      // 2ae: aload 14
      // 2b0: bipush 2
      // 2b1: aload 10
      // 2b3: bipush 2
      // 2b4: daload
      // 2b5: dastore
      // 2b6: aload 10
      // 2b8: bipush 0
      // 2b9: aload 10
      // 2bb: bipush 6
      // 2bd: daload
      // 2be: dastore
      // 2bf: aload 10
      // 2c1: bipush 1
      // 2c2: aload 10
      // 2c4: bipush 7
      // 2c6: daload
      // 2c7: dastore
      // 2c8: aload 10
      // 2ca: bipush 2
      // 2cb: aload 10
      // 2cd: bipush 8
      // 2cf: daload
      // 2d0: dastore
      // 2d1: aload 10
      // 2d3: bipush 6
      // 2d5: aload 14
      // 2d7: bipush 0
      // 2d8: daload
      // 2d9: dneg
      // 2da: dastore
      // 2db: aload 10
      // 2dd: bipush 7
      // 2df: aload 14
      // 2e1: bipush 1
      // 2e2: daload
      // 2e3: dneg
      // 2e4: dastore
      // 2e5: aload 10
      // 2e7: bipush 8
      // 2e9: aload 14
      // 2eb: bipush 2
      // 2ec: daload
      // 2ed: dneg
      // 2ee: dastore
      // 2ef: iload 3
      // 2f0: ifeq 40f
      // 2f3: goto 2fa
      // 2f6: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f9: athrow
      // 2fa: dconst_1
      // 2fb: aload 0
      // 2fc: bipush 0
      // 2fd: daload
      // 2fe: aload 0
      // 2ff: bipush 0
      // 300: daload
      // 301: dmul
      // 302: aload 0
      // 303: bipush 6
      // 305: daload
      // 306: aload 0
      // 307: bipush 6
      // 309: daload
      // 30a: dmul
      // 30b: dadd
      // 30c: invokestatic java/lang/Math.sqrt (D)D
      // 30f: goto 316
      // 312: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 315: athrow
      // 316: ddiv
      // 317: dstore 6
      // 319: aload 0
      // 31a: bipush 0
      // 31b: daload
      // 31c: dload 6
      // 31e: dmul
      // 31f: dstore 27
      // 321: aload 0
      // 322: bipush 6
      // 324: daload
      // 325: dload 6
      // 327: dmul
      // 328: dstore 35
      // 32a: aload 14
      // 32c: bipush 0
      // 32d: dload 27
      // 32f: aload 0
      // 330: bipush 0
      // 331: daload
      // 332: dmul
      // 333: dload 35
      // 335: aload 0
      // 336: bipush 6
      // 338: daload
      // 339: dmul
      // 33a: dadd
      // 33b: dastore
      // 33c: aload 14
      // 33e: bipush 1
      // 33f: dload 27
      // 341: aload 0
      // 342: bipush 1
      // 343: daload
      // 344: dmul
      // 345: dload 35
      // 347: aload 0
      // 348: bipush 7
      // 34a: daload
      // 34b: dmul
      // 34c: dadd
      // 34d: dastore
      // 34e: aload 14
      // 350: bipush 2
      // 351: dload 27
      // 353: aload 0
      // 354: bipush 2
      // 355: daload
      // 356: dmul
      // 357: dload 35
      // 359: aload 0
      // 35a: bipush 8
      // 35c: daload
      // 35d: dmul
      // 35e: dadd
      // 35f: dastore
      // 360: aload 0
      // 361: bipush 6
      // 363: dload 35
      // 365: dneg
      // 366: aload 0
      // 367: bipush 0
      // 368: daload
      // 369: dmul
      // 36a: dload 27
      // 36c: aload 0
      // 36d: bipush 6
      // 36f: daload
      // 370: dmul
      // 371: dadd
      // 372: dastore
      // 373: aload 0
      // 374: bipush 7
      // 376: dload 35
      // 378: dneg
      // 379: aload 0
      // 37a: bipush 1
      // 37b: daload
      // 37c: dmul
      // 37d: dload 27
      // 37f: aload 0
      // 380: bipush 7
      // 382: daload
      // 383: dmul
      // 384: dadd
      // 385: dastore
      // 386: aload 0
      // 387: bipush 8
      // 389: dload 35
      // 38b: dneg
      // 38c: aload 0
      // 38d: bipush 2
      // 38e: daload
      // 38f: dmul
      // 390: dload 27
      // 392: aload 0
      // 393: bipush 8
      // 395: daload
      // 396: dmul
      // 397: dadd
      // 398: dastore
      // 399: aload 0
      // 39a: bipush 0
      // 39b: aload 14
      // 39d: bipush 0
      // 39e: daload
      // 39f: dastore
      // 3a0: aload 0
      // 3a1: bipush 1
      // 3a2: aload 14
      // 3a4: bipush 1
      // 3a5: daload
      // 3a6: dastore
      // 3a7: aload 0
      // 3a8: bipush 2
      // 3a9: aload 14
      // 3ab: bipush 2
      // 3ac: daload
      // 3ad: dastore
      // 3ae: aload 14
      // 3b0: bipush 0
      // 3b1: dload 27
      // 3b3: aload 10
      // 3b5: bipush 0
      // 3b6: daload
      // 3b7: dmul
      // 3b8: dastore
      // 3b9: aload 14
      // 3bb: bipush 1
      // 3bc: dload 27
      // 3be: aload 10
      // 3c0: bipush 1
      // 3c1: daload
      // 3c2: dmul
      // 3c3: dastore
      // 3c4: aload 10
      // 3c6: bipush 2
      // 3c7: dload 35
      // 3c9: dastore
      // 3ca: aload 14
      // 3cc: bipush 6
      // 3ce: aload 10
      // 3d0: bipush 0
      // 3d1: daload
      // 3d2: dneg
      // 3d3: dload 35
      // 3d5: dmul
      // 3d6: dastore
      // 3d7: aload 14
      // 3d9: bipush 7
      // 3db: aload 10
      // 3dd: bipush 1
      // 3de: daload
      // 3df: dneg
      // 3e0: dload 35
      // 3e2: dmul
      // 3e3: dastore
      // 3e4: aload 10
      // 3e6: bipush 8
      // 3e8: dload 27
      // 3ea: dastore
      // 3eb: aload 10
      // 3ed: bipush 0
      // 3ee: aload 14
      // 3f0: bipush 0
      // 3f1: daload
      // 3f2: dastore
      // 3f3: aload 10
      // 3f5: bipush 1
      // 3f6: aload 14
      // 3f8: bipush 1
      // 3f9: daload
      // 3fa: dastore
      // 3fb: aload 10
      // 3fd: bipush 6
      // 3ff: aload 14
      // 401: bipush 6
      // 403: daload
      // 404: dastore
      // 405: aload 10
      // 407: bipush 7
      // 409: aload 14
      // 40b: bipush 7
      // 40d: daload
      // 40e: dastore
      // 40f: aload 0
      // 410: bipush 2
      // 411: daload
      // 412: aload 0
      // 413: bipush 2
      // 414: daload
      // 415: dmul
      // 416: ldc2_w 1.110223024E-16
      // 419: dcmpg
      // 41a: iload 3
      // 41b: ifne 480
      // 41e: ifge 463
      // 421: goto 428
      // 424: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 427: athrow
      // 428: aload 11
      // 42a: bipush 0
      // 42b: dconst_1
      // 42c: dastore
      // 42d: aload 11
      // 42f: bipush 1
      // 430: dconst_0
      // 431: dastore
      // 432: aload 11
      // 434: bipush 2
      // 435: dconst_0
      // 436: dastore
      // 437: aload 11
      // 439: bipush 3
      // 43a: dconst_0
      // 43b: dastore
      // 43c: aload 11
      // 43e: bipush 4
      // 43f: dconst_1
      // 440: dastore
      // 441: aload 11
      // 443: bipush 5
      // 444: dconst_0
      // 445: dastore
      // 446: aload 11
      // 448: bipush 6
      // 44a: dconst_0
      // 44b: dastore
      // 44c: aload 11
      // 44e: bipush 7
      // 450: dconst_0
      // 451: dastore
      // 452: aload 11
      // 454: bipush 8
      // 456: dconst_1
      // 457: dastore
      // 458: iload 3
      // 459: ifeq 5ea
      // 45c: goto 463
      // 45f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 462: athrow
      // 463: aload 0
      // 464: bipush 1
      // 465: daload
      // 466: aload 0
      // 467: bipush 1
      // 468: daload
      // 469: dmul
      // 46a: ldc2_w 1.110223024E-16
      // 46d: iload 3
      // 46e: ifne 51f
      // 471: goto 478
      // 474: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 477: athrow
      // 478: dcmpg
      // 479: goto 480
      // 47c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 47f: athrow
      // 480: ifge 505
      // 483: aload 14
      // 485: bipush 2
      // 486: aload 0
      // 487: bipush 2
      // 488: daload
      // 489: dastore
      // 48a: aload 14
      // 48c: bipush 5
      // 48d: aload 0
      // 48e: bipush 5
      // 48f: daload
      // 490: dastore
      // 491: aload 14
      // 493: bipush 8
      // 495: aload 0
      // 496: bipush 8
      // 498: daload
      // 499: dastore
      // 49a: aload 0
      // 49b: bipush 2
      // 49c: aload 0
      // 49d: bipush 1
      // 49e: daload
      // 49f: dneg
      // 4a0: dastore
      // 4a1: aload 0
      // 4a2: bipush 5
      // 4a3: aload 0
      // 4a4: bipush 4
      // 4a5: daload
      // 4a6: dneg
      // 4a7: dastore
      // 4a8: aload 0
      // 4a9: bipush 8
      // 4ab: aload 0
      // 4ac: bipush 7
      // 4ae: daload
      // 4af: dneg
      // 4b0: dastore
      // 4b1: aload 0
      // 4b2: bipush 1
      // 4b3: aload 14
      // 4b5: bipush 2
      // 4b6: daload
      // 4b7: dastore
      // 4b8: aload 0
      // 4b9: bipush 4
      // 4ba: aload 14
      // 4bc: bipush 5
      // 4bd: daload
      // 4be: dastore
      // 4bf: aload 0
      // 4c0: bipush 7
      // 4c2: aload 14
      // 4c4: bipush 8
      // 4c6: daload
      // 4c7: dastore
      // 4c8: aload 11
      // 4ca: bipush 0
      // 4cb: dconst_1
      // 4cc: dastore
      // 4cd: aload 11
      // 4cf: bipush 1
      // 4d0: dconst_0
      // 4d1: dastore
      // 4d2: aload 11
      // 4d4: bipush 2
      // 4d5: dconst_0
      // 4d6: dastore
      // 4d7: aload 11
      // 4d9: bipush 3
      // 4da: dconst_0
      // 4db: dastore
      // 4dc: aload 11
      // 4de: bipush 4
      // 4df: dconst_0
      // 4e0: dastore
      // 4e1: aload 11
      // 4e3: bipush 5
      // 4e4: ldc2_w -1.0
      // 4e7: dastore
      // 4e8: aload 11
      // 4ea: bipush 6
      // 4ec: dconst_0
      // 4ed: dastore
      // 4ee: aload 11
      // 4f0: bipush 7
      // 4f2: dconst_1
      // 4f3: dastore
      // 4f4: aload 11
      // 4f6: bipush 8
      // 4f8: dconst_0
      // 4f9: dastore
      // 4fa: iload 3
      // 4fb: ifeq 5ea
      // 4fe: goto 505
      // 501: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 504: athrow
      // 505: dconst_1
      // 506: aload 0
      // 507: bipush 1
      // 508: daload
      // 509: aload 0
      // 50a: bipush 1
      // 50b: daload
      // 50c: dmul
      // 50d: aload 0
      // 50e: bipush 2
      // 50f: daload
      // 510: aload 0
      // 511: bipush 2
      // 512: daload
      // 513: dmul
      // 514: dadd
      // 515: invokestatic java/lang/Math.sqrt (D)D
      // 518: goto 51f
      // 51b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 51e: athrow
      // 51f: ddiv
      // 520: dstore 6
      // 522: aload 0
      // 523: bipush 1
      // 524: daload
      // 525: dload 6
      // 527: dmul
      // 528: dstore 29
      // 52a: aload 0
      // 52b: bipush 2
      // 52c: daload
      // 52d: dload 6
      // 52f: dmul
      // 530: dstore 37
      // 532: aload 14
      // 534: bipush 1
      // 535: dload 29
      // 537: aload 0
      // 538: bipush 1
      // 539: daload
      // 53a: dmul
      // 53b: dload 37
      // 53d: aload 0
      // 53e: bipush 2
      // 53f: daload
      // 540: dmul
      // 541: dadd
      // 542: dastore
      // 543: aload 0
      // 544: bipush 2
      // 545: dload 37
      // 547: dneg
      // 548: aload 0
      // 549: bipush 1
      // 54a: daload
      // 54b: dmul
      // 54c: dload 29
      // 54e: aload 0
      // 54f: bipush 2
      // 550: daload
      // 551: dmul
      // 552: dadd
      // 553: dastore
      // 554: aload 0
      // 555: bipush 1
      // 556: aload 14
      // 558: bipush 1
      // 559: daload
      // 55a: dastore
      // 55b: aload 14
      // 55d: bipush 4
      // 55e: dload 29
      // 560: aload 0
      // 561: bipush 4
      // 562: daload
      // 563: dmul
      // 564: dload 37
      // 566: aload 0
      // 567: bipush 5
      // 568: daload
      // 569: dmul
      // 56a: dadd
      // 56b: dastore
      // 56c: aload 0
      // 56d: bipush 5
      // 56e: dload 37
      // 570: dneg
      // 571: aload 0
      // 572: bipush 4
      // 573: daload
      // 574: dmul
      // 575: dload 29
      // 577: aload 0
      // 578: bipush 5
      // 579: daload
      // 57a: dmul
      // 57b: dadd
      // 57c: dastore
      // 57d: aload 0
      // 57e: bipush 4
      // 57f: aload 14
      // 581: bipush 4
      // 582: daload
      // 583: dastore
      // 584: aload 14
      // 586: bipush 7
      // 588: dload 29
      // 58a: aload 0
      // 58b: bipush 7
      // 58d: daload
      // 58e: dmul
      // 58f: dload 37
      // 591: aload 0
      // 592: bipush 8
      // 594: daload
      // 595: dmul
      // 596: dadd
      // 597: dastore
      // 598: aload 0
      // 599: bipush 8
      // 59b: dload 37
      // 59d: dneg
      // 59e: aload 0
      // 59f: bipush 7
      // 5a1: daload
      // 5a2: dmul
      // 5a3: dload 29
      // 5a5: aload 0
      // 5a6: bipush 8
      // 5a8: daload
      // 5a9: dmul
      // 5aa: dadd
      // 5ab: dastore
      // 5ac: aload 0
      // 5ad: bipush 7
      // 5af: aload 14
      // 5b1: bipush 7
      // 5b3: daload
      // 5b4: dastore
      // 5b5: aload 11
      // 5b7: bipush 0
      // 5b8: dconst_1
      // 5b9: dastore
      // 5ba: aload 11
      // 5bc: bipush 1
      // 5bd: dconst_0
      // 5be: dastore
      // 5bf: aload 11
      // 5c1: bipush 2
      // 5c2: dconst_0
      // 5c3: dastore
      // 5c4: aload 11
      // 5c6: bipush 3
      // 5c7: dconst_0
      // 5c8: dastore
      // 5c9: aload 11
      // 5cb: bipush 4
      // 5cc: dload 29
      // 5ce: dastore
      // 5cf: aload 11
      // 5d1: bipush 5
      // 5d2: dload 37
      // 5d4: dneg
      // 5d5: dastore
      // 5d6: aload 11
      // 5d8: bipush 6
      // 5da: dconst_0
      // 5db: dastore
      // 5dc: aload 11
      // 5de: bipush 7
      // 5e0: dload 37
      // 5e2: dastore
      // 5e3: aload 11
      // 5e5: bipush 8
      // 5e7: dload 29
      // 5e9: dastore
      // 5ea: aload 0
      // 5eb: bipush 7
      // 5ed: daload
      // 5ee: aload 0
      // 5ef: bipush 7
      // 5f1: daload
      // 5f2: dmul
      // 5f3: ldc2_w 1.110223024E-16
      // 5f6: dcmpg
      // 5f7: iload 3
      // 5f8: ifne 61e
      // 5fb: ifge 608
      // 5fe: goto 605
      // 601: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 604: athrow
      // 605: goto 80c
      // 608: aload 0
      // 609: bipush 4
      // 60a: daload
      // 60b: aload 0
      // 60c: bipush 4
      // 60d: daload
      // 60e: dmul
      // 60f: ldc2_w 1.110223024E-16
      // 612: iload 3
      // 613: ifne 6de
      // 616: dcmpg
      // 617: goto 61e
      // 61a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 61d: athrow
      // 61e: ifge 6c2
      // 621: aload 14
      // 623: bipush 3
      // 624: aload 0
      // 625: bipush 3
      // 626: daload
      // 627: dastore
      // 628: aload 14
      // 62a: bipush 4
      // 62b: aload 0
      // 62c: bipush 4
      // 62d: daload
      // 62e: dastore
      // 62f: aload 14
      // 631: bipush 5
      // 632: aload 0
      // 633: bipush 5
      // 634: daload
      // 635: dastore
      // 636: aload 0
      // 637: bipush 3
      // 638: aload 0
      // 639: bipush 6
      // 63b: daload
      // 63c: dastore
      // 63d: aload 0
      // 63e: bipush 4
      // 63f: aload 0
      // 640: bipush 7
      // 642: daload
      // 643: dastore
      // 644: aload 0
      // 645: bipush 5
      // 646: aload 0
      // 647: bipush 8
      // 649: daload
      // 64a: dastore
      // 64b: aload 0
      // 64c: bipush 6
      // 64e: aload 14
      // 650: bipush 3
      // 651: daload
      // 652: dneg
      // 653: dastore
      // 654: aload 0
      // 655: bipush 7
      // 657: aload 14
      // 659: bipush 4
      // 65a: daload
      // 65b: dneg
      // 65c: dastore
      // 65d: aload 0
      // 65e: bipush 8
      // 660: aload 14
      // 662: bipush 5
      // 663: daload
      // 664: dneg
      // 665: dastore
      // 666: aload 14
      // 668: bipush 3
      // 669: aload 10
      // 66b: bipush 3
      // 66c: daload
      // 66d: dastore
      // 66e: aload 14
      // 670: bipush 4
      // 671: aload 10
      // 673: bipush 4
      // 674: daload
      // 675: dastore
      // 676: aload 14
      // 678: bipush 5
      // 679: aload 10
      // 67b: bipush 5
      // 67c: daload
      // 67d: dastore
      // 67e: aload 10
      // 680: bipush 3
      // 681: aload 10
      // 683: bipush 6
      // 685: daload
      // 686: dastore
      // 687: aload 10
      // 689: bipush 4
      // 68a: aload 10
      // 68c: bipush 7
      // 68e: daload
      // 68f: dastore
      // 690: aload 10
      // 692: bipush 5
      // 693: aload 10
      // 695: bipush 8
      // 697: daload
      // 698: dastore
      // 699: aload 10
      // 69b: bipush 6
      // 69d: aload 14
      // 69f: bipush 3
      // 6a0: daload
      // 6a1: dneg
      // 6a2: dastore
      // 6a3: aload 10
      // 6a5: bipush 7
      // 6a7: aload 14
      // 6a9: bipush 4
      // 6aa: daload
      // 6ab: dneg
      // 6ac: dastore
      // 6ad: aload 10
      // 6af: bipush 8
      // 6b1: aload 14
      // 6b3: bipush 5
      // 6b4: daload
      // 6b5: dneg
      // 6b6: dastore
      // 6b7: iload 3
      // 6b8: ifeq 80c
      // 6bb: goto 6c2
      // 6be: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6c1: athrow
      // 6c2: dconst_1
      // 6c3: aload 0
      // 6c4: bipush 4
      // 6c5: daload
      // 6c6: aload 0
      // 6c7: bipush 4
      // 6c8: daload
      // 6c9: dmul
      // 6ca: aload 0
      // 6cb: bipush 7
      // 6cd: daload
      // 6ce: aload 0
      // 6cf: bipush 7
      // 6d1: daload
      // 6d2: dmul
      // 6d3: dadd
      // 6d4: invokestatic java/lang/Math.sqrt (D)D
      // 6d7: goto 6de
      // 6da: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6dd: athrow
      // 6de: ddiv
      // 6df: dstore 6
      // 6e1: aload 0
      // 6e2: bipush 4
      // 6e3: daload
      // 6e4: dload 6
      // 6e6: dmul
      // 6e7: dstore 31
      // 6e9: aload 0
      // 6ea: bipush 7
      // 6ec: daload
      // 6ed: dload 6
      // 6ef: dmul
      // 6f0: dstore 39
      // 6f2: aload 14
      // 6f4: bipush 3
      // 6f5: dload 31
      // 6f7: aload 0
      // 6f8: bipush 3
      // 6f9: daload
      // 6fa: dmul
      // 6fb: dload 39
      // 6fd: aload 0
      // 6fe: bipush 6
      // 700: daload
      // 701: dmul
      // 702: dadd
      // 703: dastore
      // 704: aload 0
      // 705: bipush 6
      // 707: dload 39
      // 709: dneg
      // 70a: aload 0
      // 70b: bipush 3
      // 70c: daload
      // 70d: dmul
      // 70e: dload 31
      // 710: aload 0
      // 711: bipush 6
      // 713: daload
      // 714: dmul
      // 715: dadd
      // 716: dastore
      // 717: aload 0
      // 718: bipush 3
      // 719: aload 14
      // 71b: bipush 3
      // 71c: daload
      // 71d: dastore
      // 71e: aload 14
      // 720: bipush 4
      // 721: dload 31
      // 723: aload 0
      // 724: bipush 4
      // 725: daload
      // 726: dmul
      // 727: dload 39
      // 729: aload 0
      // 72a: bipush 7
      // 72c: daload
      // 72d: dmul
      // 72e: dadd
      // 72f: dastore
      // 730: aload 0
      // 731: bipush 7
      // 733: dload 39
      // 735: dneg
      // 736: aload 0
      // 737: bipush 4
      // 738: daload
      // 739: dmul
      // 73a: dload 31
      // 73c: aload 0
      // 73d: bipush 7
      // 73f: daload
      // 740: dmul
      // 741: dadd
      // 742: dastore
      // 743: aload 0
      // 744: bipush 4
      // 745: aload 14
      // 747: bipush 4
      // 748: daload
      // 749: dastore
      // 74a: aload 14
      // 74c: bipush 5
      // 74d: dload 31
      // 74f: aload 0
      // 750: bipush 5
      // 751: daload
      // 752: dmul
      // 753: dload 39
      // 755: aload 0
      // 756: bipush 8
      // 758: daload
      // 759: dmul
      // 75a: dadd
      // 75b: dastore
      // 75c: aload 0
      // 75d: bipush 8
      // 75f: dload 39
      // 761: dneg
      // 762: aload 0
      // 763: bipush 5
      // 764: daload
      // 765: dmul
      // 766: dload 31
      // 768: aload 0
      // 769: bipush 8
      // 76b: daload
      // 76c: dmul
      // 76d: dadd
      // 76e: dastore
      // 76f: aload 0
      // 770: bipush 5
      // 771: aload 14
      // 773: bipush 5
      // 774: daload
      // 775: dastore
      // 776: aload 14
      // 778: bipush 3
      // 779: dload 31
      // 77b: aload 10
      // 77d: bipush 3
      // 77e: daload
      // 77f: dmul
      // 780: dload 39
      // 782: aload 10
      // 784: bipush 6
      // 786: daload
      // 787: dmul
      // 788: dadd
      // 789: dastore
      // 78a: aload 10
      // 78c: bipush 6
      // 78e: dload 39
      // 790: dneg
      // 791: aload 10
      // 793: bipush 3
      // 794: daload
      // 795: dmul
      // 796: dload 31
      // 798: aload 10
      // 79a: bipush 6
      // 79c: daload
      // 79d: dmul
      // 79e: dadd
      // 79f: dastore
      // 7a0: aload 10
      // 7a2: bipush 3
      // 7a3: aload 14
      // 7a5: bipush 3
      // 7a6: daload
      // 7a7: dastore
      // 7a8: aload 14
      // 7aa: bipush 4
      // 7ab: dload 31
      // 7ad: aload 10
      // 7af: bipush 4
      // 7b0: daload
      // 7b1: dmul
      // 7b2: dload 39
      // 7b4: aload 10
      // 7b6: bipush 7
      // 7b8: daload
      // 7b9: dmul
      // 7ba: dadd
      // 7bb: dastore
      // 7bc: aload 10
      // 7be: bipush 7
      // 7c0: dload 39
      // 7c2: dneg
      // 7c3: aload 10
      // 7c5: bipush 4
      // 7c6: daload
      // 7c7: dmul
      // 7c8: dload 31
      // 7ca: aload 10
      // 7cc: bipush 7
      // 7ce: daload
      // 7cf: dmul
      // 7d0: dadd
      // 7d1: dastore
      // 7d2: aload 10
      // 7d4: bipush 4
      // 7d5: aload 14
      // 7d7: bipush 4
      // 7d8: daload
      // 7d9: dastore
      // 7da: aload 14
      // 7dc: bipush 5
      // 7dd: dload 31
      // 7df: aload 10
      // 7e1: bipush 5
      // 7e2: daload
      // 7e3: dmul
      // 7e4: dload 39
      // 7e6: aload 10
      // 7e8: bipush 8
      // 7ea: daload
      // 7eb: dmul
      // 7ec: dadd
      // 7ed: dastore
      // 7ee: aload 10
      // 7f0: bipush 8
      // 7f2: dload 39
      // 7f4: dneg
      // 7f5: aload 10
      // 7f7: bipush 5
      // 7f8: daload
      // 7f9: dmul
      // 7fa: dload 31
      // 7fc: aload 10
      // 7fe: bipush 8
      // 800: daload
      // 801: dmul
      // 802: dadd
      // 803: dastore
      // 804: aload 10
      // 806: bipush 5
      // 807: aload 14
      // 809: bipush 5
      // 80a: daload
      // 80b: dastore
      // 80c: aload 15
      // 80e: bipush 0
      // 80f: aload 0
      // 810: bipush 0
      // 811: daload
      // 812: dastore
      // 813: aload 15
      // 815: bipush 1
      // 816: aload 0
      // 817: bipush 4
      // 818: daload
      // 819: dastore
      // 81a: aload 15
      // 81c: bipush 2
      // 81d: aload 0
      // 81e: bipush 8
      // 820: daload
      // 821: dastore
      // 822: aload 17
      // 824: bipush 0
      // 825: aload 0
      // 826: bipush 1
      // 827: daload
      // 828: dastore
      // 829: aload 17
      // 82b: bipush 1
      // 82c: aload 0
      // 82d: bipush 5
      // 82e: daload
      // 82f: dastore
      // 830: aload 17
      // 832: bipush 0
      // 833: daload
      // 834: aload 17
      // 836: bipush 0
      // 837: daload
      // 838: dmul
      // 839: ldc2_w 1.110223024E-16
      // 83c: dcmpg
      // 83d: iload 3
      // 83e: ifne 87b
      // 841: ifge 870
      // 844: goto 84b
      // 847: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 84a: athrow
      // 84b: aload 17
      // 84d: bipush 1
      // 84e: daload
      // 84f: aload 17
      // 851: bipush 1
      // 852: daload
      // 853: dmul
      // 854: ldc2_w 1.110223024E-16
      // 857: dcmpg
      // 858: iload 3
      // 859: ifne 87b
      // 85c: goto 863
      // 85f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 862: athrow
      // 863: ifge 870
      // 866: goto 86d
      // 869: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 86c: athrow
      // 86d: goto 87c
      // 870: aload 15
      // 872: aload 17
      // 874: aload 10
      // 876: aload 11
      // 878: invokestatic iww.to9 ([D[D[D[D)I
      // 87b: pop
      // 87c: aload 18
      // 87e: bipush 0
      // 87f: aload 15
      // 881: bipush 0
      // 882: daload
      // 883: dastore
      // 884: aload 18
      // 886: bipush 1
      // 887: aload 15
      // 889: bipush 1
      // 88a: daload
      // 88b: dastore
      // 88c: aload 18
      // 88e: bipush 2
      // 88f: aload 15
      // 891: bipush 2
      // 892: daload
      // 893: dastore
      // 894: aload 18
      // 896: iload 3
      // 897: ifne 97a
      // 89a: bipush 0
      // 89b: daload
      // 89c: invokestatic java/lang/Math.abs (D)D
      // 89f: dconst_1
      // 8a0: invokestatic iww.aov (DD)Z
      // 8a3: ifeq 96b
      // 8a6: goto 8ad
      // 8a9: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8ac: athrow
      // 8ad: aload 18
      // 8af: iload 3
      // 8b0: ifne 97a
      // 8b3: goto 8ba
      // 8b6: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8b9: athrow
      // 8ba: bipush 1
      // 8bb: daload
      // 8bc: invokestatic java/lang/Math.abs (D)D
      // 8bf: dconst_1
      // 8c0: invokestatic iww.aov (DD)Z
      // 8c3: ifeq 96b
      // 8c6: goto 8cd
      // 8c9: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8cc: athrow
      // 8cd: aload 18
      // 8cf: iload 3
      // 8d0: ifne 97a
      // 8d3: goto 8da
      // 8d6: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8d9: athrow
      // 8da: bipush 2
      // 8db: daload
      // 8dc: invokestatic java/lang/Math.abs (D)D
      // 8df: dconst_1
      // 8e0: invokestatic iww.aov (DD)Z
      // 8e3: ifeq 96b
      // 8e6: goto 8ed
      // 8e9: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8ec: athrow
      // 8ed: bipush 0
      // 8ee: istore 4
      // 8f0: iload 4
      // 8f2: bipush 3
      // 8f3: if_icmpge 915
      // 8f6: aload 18
      // 8f8: iload 4
      // 8fa: daload
      // 8fb: dconst_0
      // 8fc: dcmpg
      // 8fd: iload 3
      // 8fe: ifne 917
      // 901: ifge 90e
      // 904: goto 90b
      // 907: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 90a: athrow
      // 90b: iinc 20 1
      // 90e: iinc 4 1
      // 911: iload 3
      // 912: ifeq 8f0
      // 915: iload 20
      // 917: iload 3
      // 918: ifne 951
      // 91b: ifeq 93d
      // 91e: goto 925
      // 921: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 924: athrow
      // 925: iload 20
      // 927: iload 3
      // 928: ifne 951
      // 92b: goto 932
      // 92e: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 931: athrow
      // 932: bipush 2
      // 933: if_icmpne 96b
      // 936: goto 93d
      // 939: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 93c: athrow
      // 93d: aload 1
      // 93e: bipush 0
      // 93f: aload 1
      // 940: bipush 1
      // 941: aload 1
      // 942: bipush 2
      // 943: dconst_1
      // 944: dup2_x2
      // 945: dastore
      // 946: dup2_x2
      // 947: dastore
      // 948: dastore
      // 949: bipush 0
      // 94a: goto 951
      // 94d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 950: athrow
      // 951: istore 4
      // 953: iload 4
      // 955: bipush 9
      // 957: if_icmpge 96a
      // 95a: aload 2
      // 95b: iload 4
      // 95d: aload 16
      // 95f: iload 4
      // 961: daload
      // 962: dastore
      // 963: iinc 4 1
      // 966: iload 3
      // 967: ifeq 953
      // 96a: return
      // 96b: aload 10
      // 96d: aload 12
      // 96f: invokestatic iww.zvx ([D[D)V
      // 972: aload 11
      // 974: aload 13
      // 976: invokestatic iww.zvx ([D[D)V
      // 979: aload 0
      // 97a: aload 12
      // 97c: aload 13
      // 97e: aload 18
      // 980: aload 2
      // 981: aload 1
      // 982: invokestatic iww.edq ([D[D[D[D[D[D)V
      // 985: return
   }

   public static void edq(double[] param0, double[] param1, double[] param2, double[] param3, double[] param4, double[] param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 3
      // 001: newarray 10
      // 003: astore 7
      // 005: invokestatic t9d.b ()I
      // 008: bipush 3
      // 009: newarray 10
      // 00b: astore 8
      // 00d: istore 6
      // 00f: bipush 3
      // 010: newarray 7
      // 012: astore 14
      // 014: bipush 9
      // 016: newarray 7
      // 018: astore 15
      // 01a: aload 3
      // 01b: bipush 0
      // 01c: daload
      // 01d: dconst_0
      // 01e: dcmpg
      // 01f: iload 6
      // 021: ifeq 056
      // 024: ifge 051
      // 027: goto 02e
      // 02a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02d: athrow
      // 02e: aload 3
      // 02f: bipush 0
      // 030: aload 3
      // 031: bipush 0
      // 032: daload
      // 033: dneg
      // 034: dastore
      // 035: aload 2
      // 036: bipush 0
      // 037: aload 2
      // 038: bipush 0
      // 039: daload
      // 03a: dneg
      // 03b: dastore
      // 03c: aload 2
      // 03d: bipush 1
      // 03e: aload 2
      // 03f: bipush 1
      // 040: daload
      // 041: dneg
      // 042: dastore
      // 043: aload 2
      // 044: bipush 2
      // 045: aload 2
      // 046: bipush 2
      // 047: daload
      // 048: dneg
      // 049: dastore
      // 04a: goto 051
      // 04d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 050: athrow
      // 051: aload 3
      // 052: bipush 1
      // 053: daload
      // 054: dconst_0
      // 055: dcmpg
      // 056: iload 6
      // 058: ifeq 08d
      // 05b: ifge 088
      // 05e: goto 065
      // 061: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 064: athrow
      // 065: aload 3
      // 066: bipush 1
      // 067: aload 3
      // 068: bipush 1
      // 069: daload
      // 06a: dneg
      // 06b: dastore
      // 06c: aload 2
      // 06d: bipush 3
      // 06e: aload 2
      // 06f: bipush 3
      // 070: daload
      // 071: dneg
      // 072: dastore
      // 073: aload 2
      // 074: bipush 4
      // 075: aload 2
      // 076: bipush 4
      // 077: daload
      // 078: dneg
      // 079: dastore
      // 07a: aload 2
      // 07b: bipush 5
      // 07c: aload 2
      // 07d: bipush 5
      // 07e: daload
      // 07f: dneg
      // 080: dastore
      // 081: goto 088
      // 084: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 087: athrow
      // 088: aload 3
      // 089: bipush 2
      // 08a: daload
      // 08b: dconst_0
      // 08c: dcmpg
      // 08d: iload 6
      // 08f: ifeq 0db
      // 092: ifge 0c5
      // 095: goto 09c
      // 098: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09b: athrow
      // 09c: aload 3
      // 09d: bipush 2
      // 09e: aload 3
      // 09f: bipush 2
      // 0a0: daload
      // 0a1: dneg
      // 0a2: dastore
      // 0a3: aload 2
      // 0a4: bipush 6
      // 0a6: aload 2
      // 0a7: bipush 6
      // 0a9: daload
      // 0aa: dneg
      // 0ab: dastore
      // 0ac: aload 2
      // 0ad: bipush 7
      // 0af: aload 2
      // 0b0: bipush 7
      // 0b2: daload
      // 0b3: dneg
      // 0b4: dastore
      // 0b5: aload 2
      // 0b6: bipush 8
      // 0b8: aload 2
      // 0b9: bipush 8
      // 0bb: daload
      // 0bc: dneg
      // 0bd: dastore
      // 0be: goto 0c5
      // 0c1: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c4: athrow
      // 0c5: aload 1
      // 0c6: aload 2
      // 0c7: aload 15
      // 0c9: invokestatic iww.sw7 ([D[D[D)V
      // 0cc: aload 3
      // 0cd: bipush 0
      // 0ce: daload
      // 0cf: invokestatic java/lang/Math.abs (D)D
      // 0d2: aload 3
      // 0d3: bipush 1
      // 0d4: daload
      // 0d5: invokestatic java/lang/Math.abs (D)D
      // 0d8: invokestatic iww.aov (DD)Z
      // 0db: iload 6
      // 0dd: ifeq 15f
      // 0e0: ifeq 158
      // 0e3: goto 0ea
      // 0e6: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e9: athrow
      // 0ea: aload 3
      // 0eb: bipush 1
      // 0ec: daload
      // 0ed: invokestatic java/lang/Math.abs (D)D
      // 0f0: aload 3
      // 0f1: bipush 2
      // 0f2: daload
      // 0f3: invokestatic java/lang/Math.abs (D)D
      // 0f6: invokestatic iww.aov (DD)Z
      // 0f9: iload 6
      // 0fb: ifeq 15f
      // 0fe: goto 105
      // 101: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 104: athrow
      // 105: ifeq 158
      // 108: goto 10f
      // 10b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10e: athrow
      // 10f: bipush 0
      // 110: istore 13
      // 112: iload 13
      // 114: bipush 9
      // 116: if_icmpge 137
      // 119: aload 4
      // 11b: iload 13
      // 11d: aload 15
      // 11f: iload 13
      // 121: daload
      // 122: dastore
      // 123: iinc 13 1
      // 126: iload 6
      // 128: ifeq 13a
      // 12b: iload 6
      // 12d: ifne 112
      // 130: goto 137
      // 133: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 136: athrow
      // 137: bipush 0
      // 138: istore 13
      // 13a: iload 13
      // 13c: bipush 3
      // 13d: if_icmpge 48c
      // 140: aload 5
      // 142: iload 13
      // 144: aload 3
      // 145: iload 13
      // 147: daload
      // 148: dastore
      // 149: iinc 13 1
      // 14c: iload 6
      // 14e: ifne 13a
      // 151: goto 158
      // 154: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 157: athrow
      // 158: aload 3
      // 159: bipush 0
      // 15a: daload
      // 15b: aload 3
      // 15c: bipush 1
      // 15d: daload
      // 15e: dcmpl
      // 15f: iload 6
      // 161: ifeq 1fb
      // 164: ifle 1ed
      // 167: goto 16e
      // 16a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16d: athrow
      // 16e: aload 3
      // 16f: bipush 0
      // 170: daload
      // 171: aload 3
      // 172: bipush 2
      // 173: daload
      // 174: dcmpl
      // 175: iload 6
      // 177: ifeq 199
      // 17a: goto 181
      // 17d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 180: athrow
      // 181: ifle 1d2
      // 184: goto 18b
      // 187: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18a: athrow
      // 18b: aload 3
      // 18c: bipush 2
      // 18d: daload
      // 18e: aload 3
      // 18f: bipush 1
      // 190: daload
      // 191: dcmpl
      // 192: goto 199
      // 195: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 198: athrow
      // 199: ifle 1b7
      // 19c: aload 7
      // 19e: bipush 0
      // 19f: bipush 0
      // 1a0: iastore
      // 1a1: aload 7
      // 1a3: bipush 1
      // 1a4: bipush 2
      // 1a5: iastore
      // 1a6: aload 7
      // 1a8: bipush 2
      // 1a9: bipush 1
      // 1aa: iastore
      // 1ab: iload 6
      // 1ad: ifne 267
      // 1b0: goto 1b7
      // 1b3: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b6: athrow
      // 1b7: aload 7
      // 1b9: bipush 0
      // 1ba: bipush 0
      // 1bb: iastore
      // 1bc: aload 7
      // 1be: bipush 1
      // 1bf: bipush 1
      // 1c0: iastore
      // 1c1: aload 7
      // 1c3: bipush 2
      // 1c4: bipush 2
      // 1c5: iastore
      // 1c6: iload 6
      // 1c8: ifne 267
      // 1cb: goto 1d2
      // 1ce: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d1: athrow
      // 1d2: aload 7
      // 1d4: bipush 0
      // 1d5: bipush 2
      // 1d6: iastore
      // 1d7: aload 7
      // 1d9: bipush 1
      // 1da: bipush 0
      // 1db: iastore
      // 1dc: aload 7
      // 1de: bipush 2
      // 1df: bipush 1
      // 1e0: iastore
      // 1e1: iload 6
      // 1e3: ifne 267
      // 1e6: goto 1ed
      // 1e9: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ec: athrow
      // 1ed: aload 3
      // 1ee: bipush 1
      // 1ef: daload
      // 1f0: aload 3
      // 1f1: bipush 2
      // 1f2: daload
      // 1f3: dcmpl
      // 1f4: goto 1fb
      // 1f7: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1fa: athrow
      // 1fb: iload 6
      // 1fd: ifeq 218
      // 200: ifle 251
      // 203: goto 20a
      // 206: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 209: athrow
      // 20a: aload 3
      // 20b: bipush 2
      // 20c: daload
      // 20d: aload 3
      // 20e: bipush 0
      // 20f: daload
      // 210: dcmpl
      // 211: goto 218
      // 214: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 217: athrow
      // 218: ifle 236
      // 21b: aload 7
      // 21d: bipush 0
      // 21e: bipush 1
      // 21f: iastore
      // 220: aload 7
      // 222: bipush 1
      // 223: bipush 2
      // 224: iastore
      // 225: aload 7
      // 227: bipush 2
      // 228: bipush 0
      // 229: iastore
      // 22a: iload 6
      // 22c: ifne 267
      // 22f: goto 236
      // 232: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 235: athrow
      // 236: aload 7
      // 238: bipush 0
      // 239: bipush 1
      // 23a: iastore
      // 23b: aload 7
      // 23d: bipush 1
      // 23e: bipush 0
      // 23f: iastore
      // 240: aload 7
      // 242: bipush 2
      // 243: bipush 2
      // 244: iastore
      // 245: iload 6
      // 247: ifne 267
      // 24a: goto 251
      // 24d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 250: athrow
      // 251: aload 7
      // 253: bipush 0
      // 254: bipush 2
      // 255: iastore
      // 256: aload 7
      // 258: bipush 1
      // 259: bipush 1
      // 25a: iastore
      // 25b: aload 7
      // 25d: bipush 2
      // 25e: bipush 0
      // 25f: iastore
      // 260: goto 267
      // 263: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 266: athrow
      // 267: aload 14
      // 269: bipush 0
      // 26a: aload 0
      // 26b: bipush 0
      // 26c: daload
      // 26d: aload 0
      // 26e: bipush 0
      // 26f: daload
      // 270: dmul
      // 271: aload 0
      // 272: bipush 1
      // 273: daload
      // 274: aload 0
      // 275: bipush 1
      // 276: daload
      // 277: dmul
      // 278: dadd
      // 279: aload 0
      // 27a: bipush 2
      // 27b: daload
      // 27c: aload 0
      // 27d: bipush 2
      // 27e: daload
      // 27f: dmul
      // 280: dadd
      // 281: dastore
      // 282: aload 14
      // 284: bipush 1
      // 285: aload 0
      // 286: bipush 3
      // 287: daload
      // 288: aload 0
      // 289: bipush 3
      // 28a: daload
      // 28b: dmul
      // 28c: aload 0
      // 28d: bipush 4
      // 28e: daload
      // 28f: aload 0
      // 290: bipush 4
      // 291: daload
      // 292: dmul
      // 293: dadd
      // 294: aload 0
      // 295: bipush 5
      // 296: daload
      // 297: aload 0
      // 298: bipush 5
      // 299: daload
      // 29a: dmul
      // 29b: dadd
      // 29c: dastore
      // 29d: aload 14
      // 29f: bipush 2
      // 2a0: aload 0
      // 2a1: bipush 6
      // 2a3: daload
      // 2a4: aload 0
      // 2a5: bipush 6
      // 2a7: daload
      // 2a8: dmul
      // 2a9: aload 0
      // 2aa: bipush 7
      // 2ac: daload
      // 2ad: aload 0
      // 2ae: bipush 7
      // 2b0: daload
      // 2b1: dmul
      // 2b2: dadd
      // 2b3: aload 0
      // 2b4: bipush 8
      // 2b6: daload
      // 2b7: aload 0
      // 2b8: bipush 8
      // 2ba: daload
      // 2bb: dmul
      // 2bc: dadd
      // 2bd: dastore
      // 2be: aload 14
      // 2c0: bipush 0
      // 2c1: daload
      // 2c2: aload 14
      // 2c4: bipush 1
      // 2c5: daload
      // 2c6: dcmpl
      // 2c7: iload 6
      // 2c9: ifeq 35c
      // 2cc: ifle 34c
      // 2cf: goto 2d6
      // 2d2: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d5: athrow
      // 2d6: aload 14
      // 2d8: bipush 0
      // 2d9: daload
      // 2da: aload 14
      // 2dc: bipush 2
      // 2dd: daload
      // 2de: dcmpl
      // 2df: iload 6
      // 2e1: ifeq 33f
      // 2e4: goto 2eb
      // 2e7: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ea: athrow
      // 2eb: ifle 337
      // 2ee: goto 2f5
      // 2f1: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f4: athrow
      // 2f5: aload 14
      // 2f7: bipush 2
      // 2f8: daload
      // 2f9: aload 14
      // 2fb: bipush 1
      // 2fc: daload
      // 2fd: dcmpl
      // 2fe: iload 6
      // 300: ifeq 32a
      // 303: goto 30a
      // 306: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 309: athrow
      // 30a: ifle 322
      // 30d: goto 314
      // 310: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 313: athrow
      // 314: bipush 0
      // 315: istore 9
      // 317: bipush 1
      // 318: istore 11
      // 31a: bipush 2
      // 31b: istore 10
      // 31d: iload 6
      // 31f: ifne 3bd
      // 322: bipush 0
      // 323: goto 32a
      // 326: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 329: athrow
      // 32a: istore 9
      // 32c: bipush 1
      // 32d: istore 10
      // 32f: bipush 2
      // 330: istore 11
      // 332: iload 6
      // 334: ifne 3bd
      // 337: bipush 0
      // 338: goto 33f
      // 33b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 33e: athrow
      // 33f: istore 11
      // 341: bipush 1
      // 342: istore 9
      // 344: bipush 2
      // 345: istore 10
      // 347: iload 6
      // 349: ifne 3bd
      // 34c: aload 14
      // 34e: bipush 1
      // 34f: daload
      // 350: aload 14
      // 352: bipush 2
      // 353: daload
      // 354: dcmpl
      // 355: goto 35c
      // 358: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 35b: athrow
      // 35c: iload 6
      // 35e: ifeq 3b5
      // 361: ifle 3ad
      // 364: goto 36b
      // 367: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 36a: athrow
      // 36b: aload 14
      // 36d: bipush 2
      // 36e: daload
      // 36f: aload 14
      // 371: bipush 0
      // 372: daload
      // 373: dcmpl
      // 374: iload 6
      // 376: ifeq 3a0
      // 379: goto 380
      // 37c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 37f: athrow
      // 380: ifle 398
      // 383: goto 38a
      // 386: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 389: athrow
      // 38a: bipush 0
      // 38b: istore 10
      // 38d: bipush 1
      // 38e: istore 11
      // 390: bipush 2
      // 391: istore 9
      // 393: iload 6
      // 395: ifne 3bd
      // 398: bipush 0
      // 399: goto 3a0
      // 39c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 39f: athrow
      // 3a0: istore 10
      // 3a2: bipush 1
      // 3a3: istore 9
      // 3a5: bipush 2
      // 3a6: istore 11
      // 3a8: iload 6
      // 3aa: ifne 3bd
      // 3ad: bipush 0
      // 3ae: goto 3b5
      // 3b1: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3b4: athrow
      // 3b5: istore 11
      // 3b7: bipush 1
      // 3b8: istore 10
      // 3ba: bipush 2
      // 3bb: istore 9
      // 3bd: aload 7
      // 3bf: iload 9
      // 3c1: iaload
      // 3c2: istore 12
      // 3c4: aload 5
      // 3c6: bipush 0
      // 3c7: aload 3
      // 3c8: iload 12
      // 3ca: daload
      // 3cb: dastore
      // 3cc: aload 7
      // 3ce: iload 10
      // 3d0: iaload
      // 3d1: istore 12
      // 3d3: aload 5
      // 3d5: bipush 1
      // 3d6: aload 3
      // 3d7: iload 12
      // 3d9: daload
      // 3da: dastore
      // 3db: aload 7
      // 3dd: iload 11
      // 3df: iaload
      // 3e0: istore 12
      // 3e2: aload 5
      // 3e4: bipush 2
      // 3e5: aload 3
      // 3e6: iload 12
      // 3e8: daload
      // 3e9: dastore
      // 3ea: aload 7
      // 3ec: iload 9
      // 3ee: iaload
      // 3ef: istore 12
      // 3f1: aload 4
      // 3f3: bipush 0
      // 3f4: aload 15
      // 3f6: iload 12
      // 3f8: daload
      // 3f9: dastore
      // 3fa: aload 7
      // 3fc: iload 9
      // 3fe: iaload
      // 3ff: bipush 3
      // 400: iadd
      // 401: istore 12
      // 403: aload 4
      // 405: bipush 3
      // 406: aload 15
      // 408: iload 12
      // 40a: daload
      // 40b: dastore
      // 40c: aload 7
      // 40e: iload 9
      // 410: iaload
      // 411: bipush 6
      // 413: iadd
      // 414: istore 12
      // 416: aload 4
      // 418: bipush 6
      // 41a: aload 15
      // 41c: iload 12
      // 41e: daload
      // 41f: dastore
      // 420: aload 7
      // 422: iload 10
      // 424: iaload
      // 425: istore 12
      // 427: aload 4
      // 429: bipush 1
      // 42a: aload 15
      // 42c: iload 12
      // 42e: daload
      // 42f: dastore
      // 430: aload 7
      // 432: iload 10
      // 434: iaload
      // 435: bipush 3
      // 436: iadd
      // 437: istore 12
      // 439: aload 4
      // 43b: bipush 4
      // 43c: aload 15
      // 43e: iload 12
      // 440: daload
      // 441: dastore
      // 442: aload 7
      // 444: iload 10
      // 446: iaload
      // 447: bipush 6
      // 449: iadd
      // 44a: istore 12
      // 44c: aload 4
      // 44e: bipush 7
      // 450: aload 15
      // 452: iload 12
      // 454: daload
      // 455: dastore
      // 456: aload 7
      // 458: iload 11
      // 45a: iaload
      // 45b: istore 12
      // 45d: aload 4
      // 45f: bipush 2
      // 460: aload 15
      // 462: iload 12
      // 464: daload
      // 465: dastore
      // 466: aload 7
      // 468: iload 11
      // 46a: iaload
      // 46b: bipush 3
      // 46c: iadd
      // 46d: istore 12
      // 46f: aload 4
      // 471: bipush 5
      // 472: aload 15
      // 474: iload 12
      // 476: daload
      // 477: dastore
      // 478: aload 7
      // 47a: iload 11
      // 47c: iaload
      // 47d: bipush 6
      // 47f: iadd
      // 480: istore 12
      // 482: aload 4
      // 484: bipush 8
      // 486: aload 15
      // 488: iload 12
      // 48a: daload
      // 48b: dastore
      // 48c: return
   }

   public static int to9(double[] param0, double[] param1, double[] param2, double[] param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 2
      // 001: newarray 7
      // 003: astore 17
      // 005: bipush 2
      // 006: newarray 7
      // 008: astore 18
      // 00a: bipush 2
      // 00b: newarray 7
      // 00d: astore 19
      // 00f: bipush 2
      // 010: newarray 7
      // 012: astore 20
      // 014: bipush 9
      // 016: newarray 7
      // 018: astore 21
      // 01a: bipush 10
      // 01c: istore 30
      // 01e: ldc2_w 4.89E-15
      // 021: dstore 31
      // 023: dconst_1
      // 024: dstore 33
      // 026: ldc2_w -1.0
      // 029: dstore 35
      // 02b: invokestatic t9d.c ()I
      // 02e: bipush 0
      // 02f: istore 8
      // 031: istore 4
      // 033: bipush 1
      // 034: istore 37
      // 036: aload 1
      // 037: bipush 1
      // 038: daload
      // 039: invokestatic java/lang/Math.abs (D)D
      // 03c: ldc2_w 4.89E-15
      // 03f: dcmpg
      // 040: iload 4
      // 042: ifne 070
      // 045: iflt 06f
      // 048: goto 04f
      // 04b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04e: athrow
      // 04f: aload 1
      // 050: bipush 0
      // 051: daload
      // 052: invokestatic java/lang/Math.abs (D)D
      // 055: ldc2_w 4.89E-15
      // 058: dcmpg
      // 059: iload 4
      // 05b: ifne 073
      // 05e: goto 065
      // 061: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 064: athrow
      // 065: ifge 072
      // 068: goto 06f
      // 06b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06e: athrow
      // 06f: bipush 1
      // 070: istore 8
      // 072: bipush 0
      // 073: istore 7
      // 075: iload 7
      // 077: bipush 10
      // 079: if_icmpge 49a
      // 07c: iload 8
      // 07e: iload 4
      // 080: ifne 4a4
      // 083: iload 4
      // 085: ifne 4a4
      // 088: goto 08f
      // 08b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08e: athrow
      // 08f: ifne 49a
      // 092: goto 099
      // 095: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 098: athrow
      // 099: aload 0
      // 09a: bipush 1
      // 09b: daload
      // 09c: aload 1
      // 09d: bipush 1
      // 09e: daload
      // 09f: aload 0
      // 0a0: bipush 2
      // 0a1: daload
      // 0a2: invokestatic iww.rd3 (DDD)D
      // 0a5: dstore 9
      // 0a7: aload 0
      // 0a8: bipush 0
      // 0a9: daload
      // 0aa: invokestatic java/lang/Math.abs (D)D
      // 0ad: dload 9
      // 0af: dsub
      // 0b0: dload 33
      // 0b2: aload 0
      // 0b3: bipush 0
      // 0b4: daload
      // 0b5: invokestatic iww.g1q (DD)D
      // 0b8: dload 9
      // 0ba: aload 0
      // 0bb: bipush 0
      // 0bc: daload
      // 0bd: ddiv
      // 0be: dadd
      // 0bf: dmul
      // 0c0: dstore 26
      // 0c2: aload 1
      // 0c3: bipush 0
      // 0c4: daload
      // 0c5: dstore 28
      // 0c7: dload 26
      // 0c9: dload 28
      // 0cb: aload 20
      // 0cd: aload 18
      // 0cf: bipush 0
      // 0d0: iload 37
      // 0d2: invokestatic iww.hpn (DD[D[DII)D
      // 0d5: dstore 15
      // 0d7: aload 18
      // 0d9: bipush 0
      // 0da: daload
      // 0db: aload 0
      // 0dc: bipush 0
      // 0dd: daload
      // 0de: dmul
      // 0df: aload 20
      // 0e1: bipush 0
      // 0e2: daload
      // 0e3: aload 1
      // 0e4: bipush 0
      // 0e5: daload
      // 0e6: dmul
      // 0e7: dadd
      // 0e8: dstore 26
      // 0ea: aload 1
      // 0eb: bipush 0
      // 0ec: aload 18
      // 0ee: bipush 0
      // 0ef: daload
      // 0f0: aload 1
      // 0f1: bipush 0
      // 0f2: daload
      // 0f3: dmul
      // 0f4: aload 20
      // 0f6: bipush 0
      // 0f7: daload
      // 0f8: aload 0
      // 0f9: bipush 0
      // 0fa: daload
      // 0fb: dmul
      // 0fc: dsub
      // 0fd: dastore
      // 0fe: aload 20
      // 100: bipush 0
      // 101: daload
      // 102: aload 0
      // 103: bipush 1
      // 104: daload
      // 105: dmul
      // 106: dstore 28
      // 108: aload 0
      // 109: bipush 1
      // 10a: aload 18
      // 10c: bipush 0
      // 10d: daload
      // 10e: aload 0
      // 10f: bipush 1
      // 110: daload
      // 111: dmul
      // 112: dastore
      // 113: dload 26
      // 115: dload 28
      // 117: aload 19
      // 119: aload 17
      // 11b: bipush 0
      // 11c: iload 37
      // 11e: invokestatic iww.hpn (DD[D[DII)D
      // 121: dstore 15
      // 123: bipush 0
      // 124: istore 37
      // 126: aload 0
      // 127: bipush 0
      // 128: dload 15
      // 12a: dastore
      // 12b: aload 17
      // 12d: bipush 0
      // 12e: daload
      // 12f: aload 1
      // 130: bipush 0
      // 131: daload
      // 132: dmul
      // 133: aload 19
      // 135: bipush 0
      // 136: daload
      // 137: aload 0
      // 138: bipush 1
      // 139: daload
      // 13a: dmul
      // 13b: dadd
      // 13c: dstore 26
      // 13e: aload 0
      // 13f: bipush 1
      // 140: aload 17
      // 142: bipush 0
      // 143: daload
      // 144: aload 0
      // 145: bipush 1
      // 146: daload
      // 147: dmul
      // 148: aload 19
      // 14a: bipush 0
      // 14b: daload
      // 14c: aload 1
      // 14d: bipush 0
      // 14e: daload
      // 14f: dmul
      // 150: dsub
      // 151: dastore
      // 152: aload 19
      // 154: bipush 0
      // 155: daload
      // 156: aload 1
      // 157: bipush 1
      // 158: daload
      // 159: dmul
      // 15a: dstore 28
      // 15c: aload 1
      // 15d: bipush 1
      // 15e: aload 17
      // 160: bipush 0
      // 161: daload
      // 162: aload 1
      // 163: bipush 1
      // 164: daload
      // 165: dmul
      // 166: dastore
      // 167: dload 26
      // 169: dload 28
      // 16b: aload 20
      // 16d: aload 18
      // 16f: bipush 1
      // 170: iload 37
      // 172: invokestatic iww.hpn (DD[D[DII)D
      // 175: dstore 15
      // 177: aload 1
      // 178: bipush 0
      // 179: dload 15
      // 17b: dastore
      // 17c: aload 18
      // 17e: bipush 1
      // 17f: daload
      // 180: aload 0
      // 181: bipush 1
      // 182: daload
      // 183: dmul
      // 184: aload 20
      // 186: bipush 1
      // 187: daload
      // 188: aload 1
      // 189: bipush 1
      // 18a: daload
      // 18b: dmul
      // 18c: dadd
      // 18d: dstore 26
      // 18f: aload 1
      // 190: bipush 1
      // 191: aload 18
      // 193: bipush 1
      // 194: daload
      // 195: aload 1
      // 196: bipush 1
      // 197: daload
      // 198: dmul
      // 199: aload 20
      // 19b: bipush 1
      // 19c: daload
      // 19d: aload 0
      // 19e: bipush 1
      // 19f: daload
      // 1a0: dmul
      // 1a1: dsub
      // 1a2: dastore
      // 1a3: aload 20
      // 1a5: bipush 1
      // 1a6: daload
      // 1a7: aload 0
      // 1a8: bipush 2
      // 1a9: daload
      // 1aa: dmul
      // 1ab: dstore 28
      // 1ad: aload 0
      // 1ae: bipush 2
      // 1af: aload 18
      // 1b1: bipush 1
      // 1b2: daload
      // 1b3: aload 0
      // 1b4: bipush 2
      // 1b5: daload
      // 1b6: dmul
      // 1b7: dastore
      // 1b8: dload 26
      // 1ba: dload 28
      // 1bc: aload 19
      // 1be: aload 17
      // 1c0: bipush 1
      // 1c1: iload 37
      // 1c3: invokestatic iww.hpn (DD[D[DII)D
      // 1c6: dstore 15
      // 1c8: aload 0
      // 1c9: bipush 1
      // 1ca: dload 15
      // 1cc: dastore
      // 1cd: aload 17
      // 1cf: bipush 1
      // 1d0: daload
      // 1d1: aload 1
      // 1d2: bipush 1
      // 1d3: daload
      // 1d4: dmul
      // 1d5: aload 19
      // 1d7: bipush 1
      // 1d8: daload
      // 1d9: aload 0
      // 1da: bipush 2
      // 1db: daload
      // 1dc: dmul
      // 1dd: dadd
      // 1de: dstore 26
      // 1e0: aload 0
      // 1e1: bipush 2
      // 1e2: aload 17
      // 1e4: bipush 1
      // 1e5: daload
      // 1e6: aload 0
      // 1e7: bipush 2
      // 1e8: daload
      // 1e9: dmul
      // 1ea: aload 19
      // 1ec: bipush 1
      // 1ed: daload
      // 1ee: aload 1
      // 1ef: bipush 1
      // 1f0: daload
      // 1f1: dmul
      // 1f2: dsub
      // 1f3: dastore
      // 1f4: aload 1
      // 1f5: bipush 1
      // 1f6: dload 26
      // 1f8: dastore
      // 1f9: aload 2
      // 1fa: bipush 0
      // 1fb: daload
      // 1fc: dstore 22
      // 1fe: aload 2
      // 1ff: bipush 0
      // 200: aload 17
      // 202: bipush 0
      // 203: daload
      // 204: dload 22
      // 206: dmul
      // 207: aload 19
      // 209: bipush 0
      // 20a: daload
      // 20b: aload 2
      // 20c: bipush 3
      // 20d: daload
      // 20e: dmul
      // 20f: dadd
      // 210: dastore
      // 211: aload 2
      // 212: bipush 3
      // 213: aload 19
      // 215: bipush 0
      // 216: daload
      // 217: dneg
      // 218: dload 22
      // 21a: dmul
      // 21b: aload 17
      // 21d: bipush 0
      // 21e: daload
      // 21f: aload 2
      // 220: bipush 3
      // 221: daload
      // 222: dmul
      // 223: dadd
      // 224: dastore
      // 225: aload 2
      // 226: bipush 1
      // 227: daload
      // 228: dstore 22
      // 22a: aload 2
      // 22b: bipush 1
      // 22c: aload 17
      // 22e: bipush 0
      // 22f: daload
      // 230: dload 22
      // 232: dmul
      // 233: aload 19
      // 235: bipush 0
      // 236: daload
      // 237: aload 2
      // 238: bipush 4
      // 239: daload
      // 23a: dmul
      // 23b: dadd
      // 23c: dastore
      // 23d: aload 2
      // 23e: bipush 4
      // 23f: aload 19
      // 241: bipush 0
      // 242: daload
      // 243: dneg
      // 244: dload 22
      // 246: dmul
      // 247: aload 17
      // 249: bipush 0
      // 24a: daload
      // 24b: aload 2
      // 24c: bipush 4
      // 24d: daload
      // 24e: dmul
      // 24f: dadd
      // 250: dastore
      // 251: aload 2
      // 252: bipush 2
      // 253: daload
      // 254: dstore 22
      // 256: aload 2
      // 257: bipush 2
      // 258: aload 17
      // 25a: bipush 0
      // 25b: daload
      // 25c: dload 22
      // 25e: dmul
      // 25f: aload 19
      // 261: bipush 0
      // 262: daload
      // 263: aload 2
      // 264: bipush 5
      // 265: daload
      // 266: dmul
      // 267: dadd
      // 268: dastore
      // 269: aload 2
      // 26a: bipush 5
      // 26b: aload 19
      // 26d: bipush 0
      // 26e: daload
      // 26f: dneg
      // 270: dload 22
      // 272: dmul
      // 273: aload 17
      // 275: bipush 0
      // 276: daload
      // 277: aload 2
      // 278: bipush 5
      // 279: daload
      // 27a: dmul
      // 27b: dadd
      // 27c: dastore
      // 27d: aload 2
      // 27e: bipush 3
      // 27f: daload
      // 280: dstore 22
      // 282: aload 2
      // 283: bipush 3
      // 284: aload 17
      // 286: bipush 1
      // 287: daload
      // 288: dload 22
      // 28a: dmul
      // 28b: aload 19
      // 28d: bipush 1
      // 28e: daload
      // 28f: aload 2
      // 290: bipush 6
      // 292: daload
      // 293: dmul
      // 294: dadd
      // 295: dastore
      // 296: aload 2
      // 297: bipush 6
      // 299: aload 19
      // 29b: bipush 1
      // 29c: daload
      // 29d: dneg
      // 29e: dload 22
      // 2a0: dmul
      // 2a1: aload 17
      // 2a3: bipush 1
      // 2a4: daload
      // 2a5: aload 2
      // 2a6: bipush 6
      // 2a8: daload
      // 2a9: dmul
      // 2aa: dadd
      // 2ab: dastore
      // 2ac: aload 2
      // 2ad: bipush 4
      // 2ae: daload
      // 2af: dstore 22
      // 2b1: aload 2
      // 2b2: bipush 4
      // 2b3: aload 17
      // 2b5: bipush 1
      // 2b6: daload
      // 2b7: dload 22
      // 2b9: dmul
      // 2ba: aload 19
      // 2bc: bipush 1
      // 2bd: daload
      // 2be: aload 2
      // 2bf: bipush 7
      // 2c1: daload
      // 2c2: dmul
      // 2c3: dadd
      // 2c4: dastore
      // 2c5: aload 2
      // 2c6: bipush 7
      // 2c8: aload 19
      // 2ca: bipush 1
      // 2cb: daload
      // 2cc: dneg
      // 2cd: dload 22
      // 2cf: dmul
      // 2d0: aload 17
      // 2d2: bipush 1
      // 2d3: daload
      // 2d4: aload 2
      // 2d5: bipush 7
      // 2d7: daload
      // 2d8: dmul
      // 2d9: dadd
      // 2da: dastore
      // 2db: aload 2
      // 2dc: bipush 5
      // 2dd: daload
      // 2de: dstore 22
      // 2e0: aload 2
      // 2e1: bipush 5
      // 2e2: aload 17
      // 2e4: bipush 1
      // 2e5: daload
      // 2e6: dload 22
      // 2e8: dmul
      // 2e9: aload 19
      // 2eb: bipush 1
      // 2ec: daload
      // 2ed: aload 2
      // 2ee: bipush 8
      // 2f0: daload
      // 2f1: dmul
      // 2f2: dadd
      // 2f3: dastore
      // 2f4: aload 2
      // 2f5: bipush 8
      // 2f7: aload 19
      // 2f9: bipush 1
      // 2fa: daload
      // 2fb: dneg
      // 2fc: dload 22
      // 2fe: dmul
      // 2ff: aload 17
      // 301: bipush 1
      // 302: daload
      // 303: aload 2
      // 304: bipush 8
      // 306: daload
      // 307: dmul
      // 308: dadd
      // 309: dastore
      // 30a: aload 3
      // 30b: bipush 0
      // 30c: daload
      // 30d: dstore 24
      // 30f: aload 3
      // 310: bipush 0
      // 311: aload 18
      // 313: bipush 0
      // 314: daload
      // 315: dload 24
      // 317: dmul
      // 318: aload 20
      // 31a: bipush 0
      // 31b: daload
      // 31c: aload 3
      // 31d: bipush 1
      // 31e: daload
      // 31f: dmul
      // 320: dadd
      // 321: dastore
      // 322: aload 3
      // 323: bipush 1
      // 324: aload 20
      // 326: bipush 0
      // 327: daload
      // 328: dneg
      // 329: dload 24
      // 32b: dmul
      // 32c: aload 18
      // 32e: bipush 0
      // 32f: daload
      // 330: aload 3
      // 331: bipush 1
      // 332: daload
      // 333: dmul
      // 334: dadd
      // 335: dastore
      // 336: aload 3
      // 337: bipush 3
      // 338: daload
      // 339: dstore 24
      // 33b: aload 3
      // 33c: bipush 3
      // 33d: aload 18
      // 33f: bipush 0
      // 340: daload
      // 341: dload 24
      // 343: dmul
      // 344: aload 20
      // 346: bipush 0
      // 347: daload
      // 348: aload 3
      // 349: bipush 4
      // 34a: daload
      // 34b: dmul
      // 34c: dadd
      // 34d: dastore
      // 34e: aload 3
      // 34f: bipush 4
      // 350: aload 20
      // 352: bipush 0
      // 353: daload
      // 354: dneg
      // 355: dload 24
      // 357: dmul
      // 358: aload 18
      // 35a: bipush 0
      // 35b: daload
      // 35c: aload 3
      // 35d: bipush 4
      // 35e: daload
      // 35f: dmul
      // 360: dadd
      // 361: dastore
      // 362: aload 3
      // 363: bipush 6
      // 365: daload
      // 366: dstore 24
      // 368: aload 3
      // 369: bipush 6
      // 36b: aload 18
      // 36d: bipush 0
      // 36e: daload
      // 36f: dload 24
      // 371: dmul
      // 372: aload 20
      // 374: bipush 0
      // 375: daload
      // 376: aload 3
      // 377: bipush 7
      // 379: daload
      // 37a: dmul
      // 37b: dadd
      // 37c: dastore
      // 37d: aload 3
      // 37e: bipush 7
      // 380: aload 20
      // 382: bipush 0
      // 383: daload
      // 384: dneg
      // 385: dload 24
      // 387: dmul
      // 388: aload 18
      // 38a: bipush 0
      // 38b: daload
      // 38c: aload 3
      // 38d: bipush 7
      // 38f: daload
      // 390: dmul
      // 391: dadd
      // 392: dastore
      // 393: aload 3
      // 394: bipush 1
      // 395: daload
      // 396: dstore 24
      // 398: aload 3
      // 399: bipush 1
      // 39a: aload 18
      // 39c: bipush 1
      // 39d: daload
      // 39e: dload 24
      // 3a0: dmul
      // 3a1: aload 20
      // 3a3: bipush 1
      // 3a4: daload
      // 3a5: aload 3
      // 3a6: bipush 2
      // 3a7: daload
      // 3a8: dmul
      // 3a9: dadd
      // 3aa: dastore
      // 3ab: aload 3
      // 3ac: bipush 2
      // 3ad: aload 20
      // 3af: bipush 1
      // 3b0: daload
      // 3b1: dneg
      // 3b2: dload 24
      // 3b4: dmul
      // 3b5: aload 18
      // 3b7: bipush 1
      // 3b8: daload
      // 3b9: aload 3
      // 3ba: bipush 2
      // 3bb: daload
      // 3bc: dmul
      // 3bd: dadd
      // 3be: dastore
      // 3bf: aload 3
      // 3c0: bipush 4
      // 3c1: daload
      // 3c2: dstore 24
      // 3c4: aload 3
      // 3c5: bipush 4
      // 3c6: aload 18
      // 3c8: bipush 1
      // 3c9: daload
      // 3ca: dload 24
      // 3cc: dmul
      // 3cd: aload 20
      // 3cf: bipush 1
      // 3d0: daload
      // 3d1: aload 3
      // 3d2: bipush 5
      // 3d3: daload
      // 3d4: dmul
      // 3d5: dadd
      // 3d6: dastore
      // 3d7: aload 3
      // 3d8: bipush 5
      // 3d9: aload 20
      // 3db: bipush 1
      // 3dc: daload
      // 3dd: dneg
      // 3de: dload 24
      // 3e0: dmul
      // 3e1: aload 18
      // 3e3: bipush 1
      // 3e4: daload
      // 3e5: aload 3
      // 3e6: bipush 5
      // 3e7: daload
      // 3e8: dmul
      // 3e9: dadd
      // 3ea: dastore
      // 3eb: aload 3
      // 3ec: bipush 7
      // 3ee: daload
      // 3ef: dstore 24
      // 3f1: aload 3
      // 3f2: bipush 7
      // 3f4: aload 18
      // 3f6: bipush 1
      // 3f7: daload
      // 3f8: dload 24
      // 3fa: dmul
      // 3fb: aload 20
      // 3fd: bipush 1
      // 3fe: daload
      // 3ff: aload 3
      // 400: bipush 8
      // 402: daload
      // 403: dmul
      // 404: dadd
      // 405: dastore
      // 406: aload 3
      // 407: bipush 8
      // 409: aload 20
      // 40b: bipush 1
      // 40c: daload
      // 40d: dneg
      // 40e: dload 24
      // 410: dmul
      // 411: aload 18
      // 413: bipush 1
      // 414: daload
      // 415: aload 3
      // 416: bipush 8
      // 418: daload
      // 419: dmul
      // 41a: dadd
      // 41b: dastore
      // 41c: aload 21
      // 41e: bipush 0
      // 41f: aload 0
      // 420: bipush 0
      // 421: daload
      // 422: dastore
      // 423: aload 21
      // 425: bipush 1
      // 426: aload 1
      // 427: bipush 0
      // 428: daload
      // 429: dastore
      // 42a: aload 21
      // 42c: bipush 2
      // 42d: dconst_0
      // 42e: dastore
      // 42f: aload 21
      // 431: bipush 3
      // 432: dconst_0
      // 433: dastore
      // 434: aload 21
      // 436: bipush 4
      // 437: aload 0
      // 438: bipush 1
      // 439: daload
      // 43a: dastore
      // 43b: aload 21
      // 43d: bipush 5
      // 43e: aload 1
      // 43f: bipush 1
      // 440: daload
      // 441: dastore
      // 442: aload 21
      // 444: bipush 6
      // 446: dconst_0
      // 447: dastore
      // 448: aload 21
      // 44a: bipush 7
      // 44c: dconst_0
      // 44d: dastore
      // 44e: aload 21
      // 450: bipush 8
      // 452: aload 0
      // 453: bipush 2
      // 454: daload
      // 455: dastore
      // 456: aload 1
      // 457: bipush 1
      // 458: daload
      // 459: invokestatic java/lang/Math.abs (D)D
      // 45c: ldc2_w 4.89E-15
      // 45f: dcmpg
      // 460: iload 4
      // 462: ifne 490
      // 465: iflt 48f
      // 468: goto 46f
      // 46b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 46e: athrow
      // 46f: aload 1
      // 470: bipush 0
      // 471: daload
      // 472: invokestatic java/lang/Math.abs (D)D
      // 475: ldc2_w 4.89E-15
      // 478: dcmpg
      // 479: iload 4
      // 47b: ifne 490
      // 47e: goto 485
      // 481: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 484: athrow
      // 485: ifge 492
      // 488: goto 48f
      // 48b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48e: athrow
      // 48f: bipush 1
      // 490: istore 8
      // 492: iinc 7 1
      // 495: iload 4
      // 497: ifeq 075
      // 49a: aload 1
      // 49b: bipush 1
      // 49c: daload
      // 49d: invokestatic java/lang/Math.abs (D)D
      // 4a0: ldc2_w 4.89E-15
      // 4a3: dcmpg
      // 4a4: iload 4
      // 4a6: ifne 5f9
      // 4a9: ifge 5dc
      // 4ac: goto 4b3
      // 4af: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4b2: athrow
      // 4b3: aload 0
      // 4b4: bipush 0
      // 4b5: daload
      // 4b6: aload 1
      // 4b7: bipush 0
      // 4b8: daload
      // 4b9: aload 0
      // 4ba: bipush 1
      // 4bb: daload
      // 4bc: aload 0
      // 4bd: aload 19
      // 4bf: aload 17
      // 4c1: aload 20
      // 4c3: aload 18
      // 4c5: bipush 0
      // 4c6: invokestatic iww.y6k (DDD[D[D[D[D[DI)I
      // 4c9: pop
      // 4ca: aload 2
      // 4cb: bipush 0
      // 4cc: daload
      // 4cd: dstore 22
      // 4cf: aload 2
      // 4d0: bipush 0
      // 4d1: aload 17
      // 4d3: bipush 0
      // 4d4: daload
      // 4d5: dload 22
      // 4d7: dmul
      // 4d8: aload 19
      // 4da: bipush 0
      // 4db: daload
      // 4dc: aload 2
      // 4dd: bipush 3
      // 4de: daload
      // 4df: dmul
      // 4e0: dadd
      // 4e1: dastore
      // 4e2: aload 2
      // 4e3: bipush 3
      // 4e4: aload 19
      // 4e6: bipush 0
      // 4e7: daload
      // 4e8: dneg
      // 4e9: dload 22
      // 4eb: dmul
      // 4ec: aload 17
      // 4ee: bipush 0
      // 4ef: daload
      // 4f0: aload 2
      // 4f1: bipush 3
      // 4f2: daload
      // 4f3: dmul
      // 4f4: dadd
      // 4f5: dastore
      // 4f6: aload 2
      // 4f7: bipush 1
      // 4f8: daload
      // 4f9: dstore 22
      // 4fb: aload 2
      // 4fc: bipush 1
      // 4fd: aload 17
      // 4ff: bipush 0
      // 500: daload
      // 501: dload 22
      // 503: dmul
      // 504: aload 19
      // 506: bipush 0
      // 507: daload
      // 508: aload 2
      // 509: bipush 4
      // 50a: daload
      // 50b: dmul
      // 50c: dadd
      // 50d: dastore
      // 50e: aload 2
      // 50f: bipush 4
      // 510: aload 19
      // 512: bipush 0
      // 513: daload
      // 514: dneg
      // 515: dload 22
      // 517: dmul
      // 518: aload 17
      // 51a: bipush 0
      // 51b: daload
      // 51c: aload 2
      // 51d: bipush 4
      // 51e: daload
      // 51f: dmul
      // 520: dadd
      // 521: dastore
      // 522: aload 2
      // 523: bipush 2
      // 524: daload
      // 525: dstore 22
      // 527: aload 2
      // 528: bipush 2
      // 529: aload 17
      // 52b: bipush 0
      // 52c: daload
      // 52d: dload 22
      // 52f: dmul
      // 530: aload 19
      // 532: bipush 0
      // 533: daload
      // 534: aload 2
      // 535: bipush 5
      // 536: daload
      // 537: dmul
      // 538: dadd
      // 539: dastore
      // 53a: aload 2
      // 53b: bipush 5
      // 53c: aload 19
      // 53e: bipush 0
      // 53f: daload
      // 540: dneg
      // 541: dload 22
      // 543: dmul
      // 544: aload 17
      // 546: bipush 0
      // 547: daload
      // 548: aload 2
      // 549: bipush 5
      // 54a: daload
      // 54b: dmul
      // 54c: dadd
      // 54d: dastore
      // 54e: aload 3
      // 54f: bipush 0
      // 550: daload
      // 551: dstore 24
      // 553: aload 3
      // 554: bipush 0
      // 555: aload 18
      // 557: bipush 0
      // 558: daload
      // 559: dload 24
      // 55b: dmul
      // 55c: aload 20
      // 55e: bipush 0
      // 55f: daload
      // 560: aload 3
      // 561: bipush 1
      // 562: daload
      // 563: dmul
      // 564: dadd
      // 565: dastore
      // 566: aload 3
      // 567: bipush 1
      // 568: aload 20
      // 56a: bipush 0
      // 56b: daload
      // 56c: dneg
      // 56d: dload 24
      // 56f: dmul
      // 570: aload 18
      // 572: bipush 0
      // 573: daload
      // 574: aload 3
      // 575: bipush 1
      // 576: daload
      // 577: dmul
      // 578: dadd
      // 579: dastore
      // 57a: aload 3
      // 57b: bipush 3
      // 57c: daload
      // 57d: dstore 24
      // 57f: aload 3
      // 580: bipush 3
      // 581: aload 18
      // 583: bipush 0
      // 584: daload
      // 585: dload 24
      // 587: dmul
      // 588: aload 20
      // 58a: bipush 0
      // 58b: daload
      // 58c: aload 3
      // 58d: bipush 4
      // 58e: daload
      // 58f: dmul
      // 590: dadd
      // 591: dastore
      // 592: aload 3
      // 593: bipush 4
      // 594: aload 20
      // 596: bipush 0
      // 597: daload
      // 598: dneg
      // 599: dload 24
      // 59b: dmul
      // 59c: aload 18
      // 59e: bipush 0
      // 59f: daload
      // 5a0: aload 3
      // 5a1: bipush 4
      // 5a2: daload
      // 5a3: dmul
      // 5a4: dadd
      // 5a5: dastore
      // 5a6: aload 3
      // 5a7: bipush 6
      // 5a9: daload
      // 5aa: dstore 24
      // 5ac: aload 3
      // 5ad: bipush 6
      // 5af: aload 18
      // 5b1: bipush 0
      // 5b2: daload
      // 5b3: dload 24
      // 5b5: dmul
      // 5b6: aload 20
      // 5b8: bipush 0
      // 5b9: daload
      // 5ba: aload 3
      // 5bb: bipush 7
      // 5bd: daload
      // 5be: dmul
      // 5bf: dadd
      // 5c0: dastore
      // 5c1: aload 3
      // 5c2: bipush 7
      // 5c4: aload 20
      // 5c6: bipush 0
      // 5c7: daload
      // 5c8: dneg
      // 5c9: dload 24
      // 5cb: dmul
      // 5cc: aload 18
      // 5ce: bipush 0
      // 5cf: daload
      // 5d0: aload 3
      // 5d1: bipush 7
      // 5d3: daload
      // 5d4: dmul
      // 5d5: dadd
      // 5d6: dastore
      // 5d7: iload 4
      // 5d9: ifeq 710
      // 5dc: aload 0
      // 5dd: bipush 1
      // 5de: daload
      // 5df: aload 1
      // 5e0: bipush 1
      // 5e1: daload
      // 5e2: aload 0
      // 5e3: bipush 2
      // 5e4: daload
      // 5e5: aload 0
      // 5e6: aload 19
      // 5e8: aload 17
      // 5ea: aload 20
      // 5ec: aload 18
      // 5ee: bipush 1
      // 5ef: invokestatic iww.y6k (DDD[D[D[D[D[DI)I
      // 5f2: goto 5f9
      // 5f5: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5f8: athrow
      // 5f9: pop
      // 5fa: aload 2
      // 5fb: bipush 3
      // 5fc: daload
      // 5fd: dstore 22
      // 5ff: aload 2
      // 600: bipush 3
      // 601: aload 17
      // 603: bipush 0
      // 604: daload
      // 605: dload 22
      // 607: dmul
      // 608: aload 19
      // 60a: bipush 0
      // 60b: daload
      // 60c: aload 2
      // 60d: bipush 6
      // 60f: daload
      // 610: dmul
      // 611: dadd
      // 612: dastore
      // 613: aload 2
      // 614: bipush 6
      // 616: aload 19
      // 618: bipush 0
      // 619: daload
      // 61a: dneg
      // 61b: dload 22
      // 61d: dmul
      // 61e: aload 17
      // 620: bipush 0
      // 621: daload
      // 622: aload 2
      // 623: bipush 6
      // 625: daload
      // 626: dmul
      // 627: dadd
      // 628: dastore
      // 629: aload 2
      // 62a: bipush 4
      // 62b: daload
      // 62c: dstore 22
      // 62e: aload 2
      // 62f: bipush 4
      // 630: aload 17
      // 632: bipush 0
      // 633: daload
      // 634: dload 22
      // 636: dmul
      // 637: aload 19
      // 639: bipush 0
      // 63a: daload
      // 63b: aload 2
      // 63c: bipush 7
      // 63e: daload
      // 63f: dmul
      // 640: dadd
      // 641: dastore
      // 642: aload 2
      // 643: bipush 7
      // 645: aload 19
      // 647: bipush 0
      // 648: daload
      // 649: dneg
      // 64a: dload 22
      // 64c: dmul
      // 64d: aload 17
      // 64f: bipush 0
      // 650: daload
      // 651: aload 2
      // 652: bipush 7
      // 654: daload
      // 655: dmul
      // 656: dadd
      // 657: dastore
      // 658: aload 2
      // 659: bipush 5
      // 65a: daload
      // 65b: dstore 22
      // 65d: aload 2
      // 65e: bipush 5
      // 65f: aload 17
      // 661: bipush 0
      // 662: daload
      // 663: dload 22
      // 665: dmul
      // 666: aload 19
      // 668: bipush 0
      // 669: daload
      // 66a: aload 2
      // 66b: bipush 8
      // 66d: daload
      // 66e: dmul
      // 66f: dadd
      // 670: dastore
      // 671: aload 2
      // 672: bipush 8
      // 674: aload 19
      // 676: bipush 0
      // 677: daload
      // 678: dneg
      // 679: dload 22
      // 67b: dmul
      // 67c: aload 17
      // 67e: bipush 0
      // 67f: daload
      // 680: aload 2
      // 681: bipush 8
      // 683: daload
      // 684: dmul
      // 685: dadd
      // 686: dastore
      // 687: aload 3
      // 688: bipush 1
      // 689: daload
      // 68a: dstore 24
      // 68c: aload 3
      // 68d: bipush 1
      // 68e: aload 18
      // 690: bipush 0
      // 691: daload
      // 692: dload 24
      // 694: dmul
      // 695: aload 20
      // 697: bipush 0
      // 698: daload
      // 699: aload 3
      // 69a: bipush 2
      // 69b: daload
      // 69c: dmul
      // 69d: dadd
      // 69e: dastore
      // 69f: aload 3
      // 6a0: bipush 2
      // 6a1: aload 20
      // 6a3: bipush 0
      // 6a4: daload
      // 6a5: dneg
      // 6a6: dload 24
      // 6a8: dmul
      // 6a9: aload 18
      // 6ab: bipush 0
      // 6ac: daload
      // 6ad: aload 3
      // 6ae: bipush 2
      // 6af: daload
      // 6b0: dmul
      // 6b1: dadd
      // 6b2: dastore
      // 6b3: aload 3
      // 6b4: bipush 4
      // 6b5: daload
      // 6b6: dstore 24
      // 6b8: aload 3
      // 6b9: bipush 4
      // 6ba: aload 18
      // 6bc: bipush 0
      // 6bd: daload
      // 6be: dload 24
      // 6c0: dmul
      // 6c1: aload 20
      // 6c3: bipush 0
      // 6c4: daload
      // 6c5: aload 3
      // 6c6: bipush 5
      // 6c7: daload
      // 6c8: dmul
      // 6c9: dadd
      // 6ca: dastore
      // 6cb: aload 3
      // 6cc: bipush 5
      // 6cd: aload 20
      // 6cf: bipush 0
      // 6d0: daload
      // 6d1: dneg
      // 6d2: dload 24
      // 6d4: dmul
      // 6d5: aload 18
      // 6d7: bipush 0
      // 6d8: daload
      // 6d9: aload 3
      // 6da: bipush 5
      // 6db: daload
      // 6dc: dmul
      // 6dd: dadd
      // 6de: dastore
      // 6df: aload 3
      // 6e0: bipush 7
      // 6e2: daload
      // 6e3: dstore 24
      // 6e5: aload 3
      // 6e6: bipush 7
      // 6e8: aload 18
      // 6ea: bipush 0
      // 6eb: daload
      // 6ec: dload 24
      // 6ee: dmul
      // 6ef: aload 20
      // 6f1: bipush 0
      // 6f2: daload
      // 6f3: aload 3
      // 6f4: bipush 8
      // 6f6: daload
      // 6f7: dmul
      // 6f8: dadd
      // 6f9: dastore
      // 6fa: aload 3
      // 6fb: bipush 8
      // 6fd: aload 20
      // 6ff: bipush 0
      // 700: daload
      // 701: dneg
      // 702: dload 24
      // 704: dmul
      // 705: aload 18
      // 707: bipush 0
      // 708: daload
      // 709: aload 3
      // 70a: bipush 8
      // 70c: daload
      // 70d: dmul
      // 70e: dadd
      // 70f: dastore
      // 710: bipush 0
      // 711: ireturn
   }

   public static double nz9(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: dload 0
      // 06: iload 4
      // 08: ifeq 1e
      // 0b: dload 2
      // 0c: dcmpl
      // 0d: ifle 1d
      // 10: goto 17
      // 13: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16: athrow
      // 17: dload 0
      // 18: dreturn
      // 19: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: dload 2
      // 1e: dreturn
   }

   public static double fzy(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: dload 0
      // 06: iload 4
      // 08: ifeq 1e
      // 0b: dload 2
      // 0c: dcmpg
      // 0d: ifge 1d
      // 10: goto 17
      // 13: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16: athrow
      // 17: dload 0
      // 18: dreturn
      // 19: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: dload 2
      // 1e: dreturn
   }

   public static double g1q(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: dload 0
      // 06: iload 4
      // 08: ifne 20
      // 0b: dconst_0
      // 0c: dcmpl
      // 0d: iflt 1f
      // 10: goto 17
      // 13: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16: athrow
      // 17: dload 0
      // 18: goto 21
      // 1b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: dload 0
      // 20: dneg
      // 21: dstore 5
      // 23: dload 2
      // 24: iload 4
      // 26: ifne 40
      // 29: dconst_0
      // 2a: dcmpl
      // 2b: iflt 3e
      // 2e: goto 35
      // 31: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 34: athrow
      // 35: dload 5
      // 37: goto 41
      // 3a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: dload 5
      // 40: dneg
      // 41: dreturn
   }

   public static double rd3(double param0, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: dload 0
      // 001: invokestatic java/lang/Math.abs (D)D
      // 004: dstore 17
      // 006: invokestatic t9d.c ()I
      // 009: dload 2
      // 00a: invokestatic java/lang/Math.abs (D)D
      // 00d: dstore 19
      // 00f: istore 6
      // 011: dload 4
      // 013: invokestatic java/lang/Math.abs (D)D
      // 016: dstore 21
      // 018: dload 17
      // 01a: dload 21
      // 01c: invokestatic iww.fzy (DD)D
      // 01f: dstore 11
      // 021: dload 17
      // 023: dload 21
      // 025: invokestatic iww.nz9 (DD)D
      // 028: dstore 13
      // 02a: dload 11
      // 02c: dconst_0
      // 02d: dcmpl
      // 02e: iload 6
      // 030: ifne 088
      // 033: ifne 070
      // 036: goto 03d
      // 039: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03c: athrow
      // 03d: dconst_0
      // 03e: dstore 29
      // 040: dload 13
      // 042: dconst_0
      // 043: iload 6
      // 045: ifne 068
      // 048: dcmpl
      // 049: ifne 05a
      // 04c: goto 053
      // 04f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 052: athrow
      // 053: goto 157
      // 056: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 059: athrow
      // 05a: dload 13
      // 05c: dload 19
      // 05e: invokestatic iww.fzy (DD)D
      // 061: dload 13
      // 063: dload 19
      // 065: invokestatic iww.nz9 (DD)D
      // 068: ddiv
      // 069: dstore 7
      // 06b: iload 6
      // 06d: ifeq 157
      // 070: dload 19
      // 072: dload 13
      // 074: iload 6
      // 076: ifne 0e0
      // 079: goto 080
      // 07c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07f: athrow
      // 080: dcmpg
      // 081: goto 088
      // 084: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 087: athrow
      // 088: ifge 0d5
      // 08b: dload 11
      // 08d: dload 13
      // 08f: ddiv
      // 090: dconst_1
      // 091: dadd
      // 092: dstore 23
      // 094: dload 13
      // 096: dload 11
      // 098: dsub
      // 099: dload 13
      // 09b: ddiv
      // 09c: dstore 25
      // 09e: dload 19
      // 0a0: dload 13
      // 0a2: ddiv
      // 0a3: dstore 7
      // 0a5: dload 7
      // 0a7: dload 7
      // 0a9: dmul
      // 0aa: dstore 27
      // 0ac: ldc2_w 2.0
      // 0af: dload 23
      // 0b1: dload 23
      // 0b3: dmul
      // 0b4: dload 27
      // 0b6: dadd
      // 0b7: invokestatic java/lang/Math.sqrt (D)D
      // 0ba: dload 25
      // 0bc: dload 25
      // 0be: dmul
      // 0bf: dload 27
      // 0c1: dadd
      // 0c2: invokestatic java/lang/Math.sqrt (D)D
      // 0c5: dadd
      // 0c6: ddiv
      // 0c7: dstore 15
      // 0c9: dload 11
      // 0cb: dload 15
      // 0cd: dmul
      // 0ce: dstore 29
      // 0d0: iload 6
      // 0d2: ifeq 157
      // 0d5: dload 13
      // 0d7: dload 19
      // 0d9: goto 0e0
      // 0dc: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0df: athrow
      // 0e0: ddiv
      // 0e1: dstore 27
      // 0e3: dload 27
      // 0e5: dconst_0
      // 0e6: iload 6
      // 0e8: ifne 112
      // 0eb: dcmpl
      // 0ec: ifne 105
      // 0ef: goto 0f6
      // 0f2: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f5: athrow
      // 0f6: dload 11
      // 0f8: dload 13
      // 0fa: dmul
      // 0fb: dload 19
      // 0fd: ddiv
      // 0fe: dstore 29
      // 100: iload 6
      // 102: ifeq 157
      // 105: dload 11
      // 107: dload 13
      // 109: ddiv
      // 10a: dconst_1
      // 10b: goto 112
      // 10e: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 111: athrow
      // 112: dadd
      // 113: dstore 23
      // 115: dload 13
      // 117: dload 11
      // 119: dsub
      // 11a: dload 13
      // 11c: ddiv
      // 11d: dstore 25
      // 11f: dload 23
      // 121: dload 27
      // 123: dmul
      // 124: dstore 7
      // 126: dload 25
      // 128: dload 27
      // 12a: dmul
      // 12b: dstore 9
      // 12d: dconst_1
      // 12e: dload 7
      // 130: dload 7
      // 132: dmul
      // 133: dconst_1
      // 134: dadd
      // 135: invokestatic java/lang/Math.sqrt (D)D
      // 138: dload 9
      // 13a: dload 9
      // 13c: dmul
      // 13d: dconst_1
      // 13e: dadd
      // 13f: invokestatic java/lang/Math.sqrt (D)D
      // 142: dadd
      // 143: ddiv
      // 144: dstore 15
      // 146: dload 11
      // 148: dload 15
      // 14a: dmul
      // 14b: dload 27
      // 14d: dmul
      // 14e: dstore 29
      // 150: dload 29
      // 152: dload 29
      // 154: dadd
      // 155: dstore 29
      // 157: dload 29
      // 159: dreturn
   }

   public static int y6k(
      double param0, double param2, double param4, double[] param6, double[] param7, double[] param8, double[] param9, double[] param10, int param11
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc2_w 2.0
      // 003: dstore 13
      // 005: invokestatic t9d.c ()I
      // 008: dconst_1
      // 009: dstore 15
      // 00b: aload 6
      // 00d: bipush 0
      // 00e: daload
      // 00f: dstore 66
      // 011: aload 6
      // 013: bipush 1
      // 014: daload
      // 015: dstore 64
      // 017: dconst_0
      // 018: dstore 56
      // 01a: dconst_0
      // 01b: dstore 58
      // 01d: istore 12
      // 01f: dconst_0
      // 020: dstore 60
      // 022: dconst_0
      // 023: dstore 62
      // 025: dconst_0
      // 026: dstore 37
      // 028: dload 0
      // 029: dstore 45
      // 02b: dload 45
      // 02d: invokestatic java/lang/Math.abs (D)D
      // 030: dstore 39
      // 032: dload 4
      // 034: dstore 49
      // 036: dload 4
      // 038: invokestatic java/lang/Math.abs (D)D
      // 03b: dstore 43
      // 03d: bipush 1
      // 03e: istore 19
      // 040: dload 43
      // 042: dload 39
      // 044: dcmpl
      // 045: iload 12
      // 047: ifne 064
      // 04a: ifle 05c
      // 04d: goto 054
      // 050: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 053: athrow
      // 054: bipush 1
      // 055: istore 22
      // 057: iload 12
      // 059: ifeq 066
      // 05c: bipush 0
      // 05d: goto 064
      // 060: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 063: athrow
      // 064: istore 22
      // 066: iload 22
      // 068: iload 12
      // 06a: ifne 078
      // 06d: ifeq 092
      // 070: goto 077
      // 073: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 076: athrow
      // 077: bipush 3
      // 078: istore 19
      // 07a: dload 45
      // 07c: dstore 20
      // 07e: dload 49
      // 080: dstore 45
      // 082: dload 20
      // 084: dstore 49
      // 086: dload 39
      // 088: dstore 20
      // 08a: dload 43
      // 08c: dstore 39
      // 08e: dload 20
      // 090: dstore 43
      // 092: dload 2
      // 093: dstore 47
      // 095: dload 47
      // 097: invokestatic java/lang/Math.abs (D)D
      // 09a: dstore 41
      // 09c: dload 41
      // 09e: dconst_0
      // 09f: dcmpl
      // 0a0: iload 12
      // 0a2: ifne 0d4
      // 0a5: ifne 0cc
      // 0a8: goto 0af
      // 0ab: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ae: athrow
      // 0af: aload 6
      // 0b1: bipush 1
      // 0b2: dload 43
      // 0b4: dastore
      // 0b5: aload 6
      // 0b7: bipush 0
      // 0b8: dload 39
      // 0ba: dastore
      // 0bb: dconst_1
      // 0bc: dstore 56
      // 0be: dconst_1
      // 0bf: dstore 58
      // 0c1: dconst_0
      // 0c2: dstore 60
      // 0c4: dconst_0
      // 0c5: dstore 62
      // 0c7: iload 12
      // 0c9: ifeq 4d7
      // 0cc: bipush 1
      // 0cd: goto 0d4
      // 0d0: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d3: athrow
      // 0d4: istore 53
      // 0d6: dload 41
      // 0d8: dload 39
      // 0da: dcmpl
      // 0db: iload 12
      // 0dd: ifne 155
      // 0e0: ifle 153
      // 0e3: goto 0ea
      // 0e6: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e9: athrow
      // 0ea: bipush 2
      // 0eb: istore 19
      // 0ed: dload 39
      // 0ef: dload 41
      // 0f1: ddiv
      // 0f2: ldc2_w 1.110223024E-16
      // 0f5: dcmpg
      // 0f6: iload 12
      // 0f8: ifne 155
      // 0fb: ifge 153
      // 0fe: goto 105
      // 101: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 104: athrow
      // 105: bipush 0
      // 106: istore 53
      // 108: dload 41
      // 10a: dstore 66
      // 10c: dload 43
      // 10e: dconst_1
      // 10f: iload 12
      // 111: ifne 13c
      // 114: dcmpl
      // 115: ifle 12e
      // 118: goto 11f
      // 11b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11e: athrow
      // 11f: dload 39
      // 121: dload 41
      // 123: dload 43
      // 125: ddiv
      // 126: ddiv
      // 127: dstore 64
      // 129: iload 12
      // 12b: ifeq 13f
      // 12e: dload 39
      // 130: dload 41
      // 132: ddiv
      // 133: dload 43
      // 135: goto 13c
      // 138: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13b: athrow
      // 13c: dmul
      // 13d: dstore 64
      // 13f: dconst_1
      // 140: dstore 56
      // 142: dload 49
      // 144: dload 47
      // 146: ddiv
      // 147: dstore 60
      // 149: dconst_1
      // 14a: dstore 62
      // 14c: dload 45
      // 14e: dload 47
      // 150: ddiv
      // 151: dstore 58
      // 153: iload 53
      // 155: iload 12
      // 157: ifne 3e5
      // 15a: ifeq 3e3
      // 15d: goto 164
      // 160: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 163: athrow
      // 164: dload 39
      // 166: dload 43
      // 168: dsub
      // 169: dstore 25
      // 16b: dload 25
      // 16d: dload 39
      // 16f: iload 12
      // 171: ifne 192
      // 174: dcmpl
      // 175: ifne 187
      // 178: goto 17f
      // 17b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17e: athrow
      // 17f: dconst_1
      // 180: dstore 27
      // 182: iload 12
      // 184: ifeq 195
      // 187: dload 25
      // 189: dload 39
      // 18b: goto 192
      // 18e: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 191: athrow
      // 192: ddiv
      // 193: dstore 27
      // 195: dload 47
      // 197: dload 45
      // 199: ddiv
      // 19a: dstore 29
      // 19c: ldc2_w 2.0
      // 19f: dload 27
      // 1a1: dsub
      // 1a2: dstore 35
      // 1a4: dload 29
      // 1a6: dload 29
      // 1a8: dmul
      // 1a9: dstore 51
      // 1ab: dload 35
      // 1ad: dload 35
      // 1af: dmul
      // 1b0: dstore 54
      // 1b2: dload 54
      // 1b4: dload 51
      // 1b6: dadd
      // 1b7: invokestatic java/lang/Math.sqrt (D)D
      // 1ba: dstore 33
      // 1bc: dload 27
      // 1be: dconst_0
      // 1bf: iload 12
      // 1c1: ifne 1e9
      // 1c4: dcmpl
      // 1c5: ifne 1db
      // 1c8: goto 1cf
      // 1cb: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ce: athrow
      // 1cf: dload 29
      // 1d1: invokestatic java/lang/Math.abs (D)D
      // 1d4: dstore 31
      // 1d6: iload 12
      // 1d8: ifeq 1ef
      // 1db: dload 27
      // 1dd: dload 27
      // 1df: dmul
      // 1e0: dload 51
      // 1e2: goto 1e9
      // 1e5: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e8: athrow
      // 1e9: dadd
      // 1ea: invokestatic java/lang/Math.sqrt (D)D
      // 1ed: dstore 31
      // 1ef: dload 33
      // 1f1: dload 31
      // 1f3: dadd
      // 1f4: ldc2_w 0.5
      // 1f7: dmul
      // 1f8: dstore 23
      // 1fa: dload 41
      // 1fc: dload 39
      // 1fe: dcmpl
      // 1ff: iload 12
      // 201: ifne 279
      // 204: ifle 277
      // 207: goto 20e
      // 20a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20d: athrow
      // 20e: bipush 2
      // 20f: istore 19
      // 211: dload 39
      // 213: dload 41
      // 215: ddiv
      // 216: ldc2_w 1.110223024E-16
      // 219: dcmpg
      // 21a: iload 12
      // 21c: ifne 279
      // 21f: ifge 277
      // 222: goto 229
      // 225: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 228: athrow
      // 229: bipush 0
      // 22a: istore 53
      // 22c: dload 41
      // 22e: dstore 66
      // 230: dload 43
      // 232: dconst_1
      // 233: iload 12
      // 235: ifne 260
      // 238: dcmpl
      // 239: ifle 252
      // 23c: goto 243
      // 23f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 242: athrow
      // 243: dload 39
      // 245: dload 41
      // 247: dload 43
      // 249: ddiv
      // 24a: ddiv
      // 24b: dstore 64
      // 24d: iload 12
      // 24f: ifeq 263
      // 252: dload 39
      // 254: dload 41
      // 256: ddiv
      // 257: dload 43
      // 259: goto 260
      // 25c: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25f: athrow
      // 260: dmul
      // 261: dstore 64
      // 263: dconst_1
      // 264: dstore 56
      // 266: dload 49
      // 268: dload 47
      // 26a: ddiv
      // 26b: dstore 60
      // 26d: dconst_1
      // 26e: dstore 62
      // 270: dload 45
      // 272: dload 47
      // 274: ddiv
      // 275: dstore 58
      // 277: iload 53
      // 279: iload 12
      // 27b: ifne 3e5
      // 27e: ifeq 3e3
      // 281: goto 288
      // 284: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 287: athrow
      // 288: dload 39
      // 28a: dload 43
      // 28c: dsub
      // 28d: dstore 25
      // 28f: dload 25
      // 291: dload 39
      // 293: iload 12
      // 295: ifne 2b6
      // 298: dcmpl
      // 299: ifne 2ab
      // 29c: goto 2a3
      // 29f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a2: athrow
      // 2a3: dconst_1
      // 2a4: dstore 27
      // 2a6: iload 12
      // 2a8: ifeq 2b9
      // 2ab: dload 25
      // 2ad: dload 39
      // 2af: goto 2b6
      // 2b2: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b5: athrow
      // 2b6: ddiv
      // 2b7: dstore 27
      // 2b9: dload 47
      // 2bb: dload 45
      // 2bd: ddiv
      // 2be: dstore 29
      // 2c0: ldc2_w 2.0
      // 2c3: dload 27
      // 2c5: dsub
      // 2c6: dstore 35
      // 2c8: dload 29
      // 2ca: dload 29
      // 2cc: dmul
      // 2cd: dstore 51
      // 2cf: dload 35
      // 2d1: dload 35
      // 2d3: dmul
      // 2d4: dstore 54
      // 2d6: dload 54
      // 2d8: dload 51
      // 2da: dadd
      // 2db: invokestatic java/lang/Math.sqrt (D)D
      // 2de: dstore 33
      // 2e0: dload 27
      // 2e2: dconst_0
      // 2e3: iload 12
      // 2e5: ifne 30d
      // 2e8: dcmpl
      // 2e9: ifne 2ff
      // 2ec: goto 2f3
      // 2ef: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f2: athrow
      // 2f3: dload 29
      // 2f5: invokestatic java/lang/Math.abs (D)D
      // 2f8: dstore 31
      // 2fa: iload 12
      // 2fc: ifeq 313
      // 2ff: dload 27
      // 301: dload 27
      // 303: dmul
      // 304: dload 51
      // 306: goto 30d
      // 309: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 30c: athrow
      // 30d: dadd
      // 30e: invokestatic java/lang/Math.sqrt (D)D
      // 311: dstore 31
      // 313: dload 33
      // 315: dload 31
      // 317: dadd
      // 318: ldc2_w 0.5
      // 31b: dmul
      // 31c: dstore 23
      // 31e: dload 43
      // 320: dload 23
      // 322: ddiv
      // 323: dstore 64
      // 325: dload 39
      // 327: dload 23
      // 329: dmul
      // 32a: dstore 66
      // 32c: dload 51
      // 32e: dconst_0
      // 32f: iload 12
      // 331: ifne 3a9
      // 334: dcmpl
      // 335: ifne 38d
      // 338: goto 33f
      // 33b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 33e: athrow
      // 33f: dload 27
      // 341: dconst_0
      // 342: iload 12
      // 344: ifne 385
      // 347: goto 34e
      // 34a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 34d: athrow
      // 34e: dcmpl
      // 34f: ifne 36f
      // 352: goto 359
      // 355: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 358: athrow
      // 359: dload 13
      // 35b: dload 45
      // 35d: invokestatic iww.g1q (DD)D
      // 360: dload 15
      // 362: dload 47
      // 364: invokestatic iww.g1q (DD)D
      // 367: dmul
      // 368: dstore 35
      // 36a: iload 12
      // 36c: ifeq 3ac
      // 36f: dload 47
      // 371: dload 25
      // 373: dload 45
      // 375: invokestatic iww.g1q (DD)D
      // 378: ddiv
      // 379: dload 29
      // 37b: dload 35
      // 37d: ddiv
      // 37e: goto 385
      // 381: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 384: athrow
      // 385: dadd
      // 386: dstore 35
      // 388: iload 12
      // 38a: ifeq 3ac
      // 38d: dload 29
      // 38f: dload 33
      // 391: dload 35
      // 393: dadd
      // 394: ddiv
      // 395: dload 29
      // 397: dload 31
      // 399: dload 27
      // 39b: dadd
      // 39c: ddiv
      // 39d: dadd
      // 39e: dload 23
      // 3a0: dconst_1
      // 3a1: dadd
      // 3a2: goto 3a9
      // 3a5: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3a8: athrow
      // 3a9: dmul
      // 3aa: dstore 35
      // 3ac: dload 35
      // 3ae: dload 35
      // 3b0: dmul
      // 3b1: ldc2_w 4.0
      // 3b4: dadd
      // 3b5: invokestatic java/lang/Math.sqrt (D)D
      // 3b8: dstore 27
      // 3ba: ldc2_w 2.0
      // 3bd: dload 27
      // 3bf: ddiv
      // 3c0: dstore 58
      // 3c2: dload 35
      // 3c4: dload 27
      // 3c6: ddiv
      // 3c7: dstore 62
      // 3c9: dload 58
      // 3cb: dload 62
      // 3cd: dload 29
      // 3cf: dmul
      // 3d0: dadd
      // 3d1: dload 23
      // 3d3: ddiv
      // 3d4: dstore 56
      // 3d6: dload 49
      // 3d8: dload 45
      // 3da: ddiv
      // 3db: dload 62
      // 3dd: dmul
      // 3de: dload 23
      // 3e0: ddiv
      // 3e1: dstore 60
      // 3e3: iload 22
      // 3e5: ifeq 40c
      // 3e8: aload 8
      // 3ea: bipush 0
      // 3eb: dload 62
      // 3ed: dastore
      // 3ee: aload 7
      // 3f0: bipush 0
      // 3f1: dload 58
      // 3f3: dastore
      // 3f4: aload 10
      // 3f6: bipush 0
      // 3f7: dload 60
      // 3f9: dastore
      // 3fa: aload 9
      // 3fc: bipush 0
      // 3fd: dload 56
      // 3ff: dastore
      // 400: iload 12
      // 402: ifeq 42b
      // 405: goto 40c
      // 408: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 40b: athrow
      // 40c: aload 8
      // 40e: bipush 0
      // 40f: dload 56
      // 411: dastore
      // 412: aload 7
      // 414: bipush 0
      // 415: dload 60
      // 417: dastore
      // 418: aload 10
      // 41a: bipush 0
      // 41b: dload 58
      // 41d: dastore
      // 41e: aload 9
      // 420: bipush 0
      // 421: dload 62
      // 423: dastore
      // 424: goto 42b
      // 427: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 42a: athrow
      // 42b: iload 19
      // 42d: bipush 1
      // 42e: iload 12
      // 430: ifne 45c
      // 433: if_icmpne 459
      // 436: goto 43d
      // 439: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 43c: athrow
      // 43d: dload 15
      // 43f: aload 10
      // 441: bipush 0
      // 442: daload
      // 443: invokestatic iww.g1q (DD)D
      // 446: dload 15
      // 448: aload 8
      // 44a: bipush 0
      // 44b: daload
      // 44c: invokestatic iww.g1q (DD)D
      // 44f: dmul
      // 450: dload 15
      // 452: dload 0
      // 453: invokestatic iww.g1q (DD)D
      // 456: dmul
      // 457: dstore 37
      // 459: iload 19
      // 45b: bipush 2
      // 45c: iload 12
      // 45e: ifne 48a
      // 461: if_icmpne 487
      // 464: goto 46b
      // 467: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 46a: athrow
      // 46b: dload 15
      // 46d: aload 9
      // 46f: bipush 0
      // 470: daload
      // 471: invokestatic iww.g1q (DD)D
      // 474: dload 15
      // 476: aload 8
      // 478: bipush 0
      // 479: daload
      // 47a: invokestatic iww.g1q (DD)D
      // 47d: dmul
      // 47e: dload 15
      // 480: dload 2
      // 481: invokestatic iww.g1q (DD)D
      // 484: dmul
      // 485: dstore 37
      // 487: iload 19
      // 489: bipush 3
      // 48a: if_icmpne 4aa
      // 48d: dload 15
      // 48f: aload 9
      // 491: bipush 0
      // 492: daload
      // 493: invokestatic iww.g1q (DD)D
      // 496: dload 15
      // 498: aload 7
      // 49a: bipush 0
      // 49b: daload
      // 49c: invokestatic iww.g1q (DD)D
      // 49f: dmul
      // 4a0: dload 15
      // 4a2: dload 4
      // 4a4: invokestatic iww.g1q (DD)D
      // 4a7: dmul
      // 4a8: dstore 37
      // 4aa: aload 6
      // 4ac: iload 11
      // 4ae: dload 66
      // 4b0: dload 37
      // 4b2: invokestatic iww.g1q (DD)D
      // 4b5: dastore
      // 4b6: dload 37
      // 4b8: dload 15
      // 4ba: dload 0
      // 4bb: invokestatic iww.g1q (DD)D
      // 4be: dmul
      // 4bf: dload 15
      // 4c1: dload 4
      // 4c3: invokestatic iww.g1q (DD)D
      // 4c6: dmul
      // 4c7: dstore 17
      // 4c9: aload 6
      // 4cb: iload 11
      // 4cd: bipush 1
      // 4ce: iadd
      // 4cf: dload 64
      // 4d1: dload 17
      // 4d3: invokestatic iww.g1q (DD)D
      // 4d6: dastore
      // 4d7: bipush 0
      // 4d8: ireturn
   }

   public static double hpn(double param0, double param2, double[] param4, double[] param5, int param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc2_w 2.002083095183101E-146
      // 003: dstore 28
      // 005: invokestatic t9d.b ()I
      // 008: ldc2_w 4.9947976805055876E145
      // 00b: dstore 30
      // 00d: istore 8
      // 00f: dload 2
      // 010: dconst_0
      // 011: dcmpl
      // 012: iload 8
      // 014: ifeq 045
      // 017: ifne 02f
      // 01a: goto 021
      // 01d: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 020: athrow
      // 021: dconst_1
      // 022: dstore 14
      // 024: dconst_0
      // 025: dstore 16
      // 027: dload 0
      // 028: dstore 26
      // 02a: iload 8
      // 02c: ifne 1fb
      // 02f: dload 0
      // 030: iload 8
      // 032: ifeq 05e
      // 035: goto 03c
      // 038: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03b: athrow
      // 03c: dconst_0
      // 03d: dcmpl
      // 03e: goto 045
      // 041: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 044: athrow
      // 045: ifne 056
      // 048: dconst_0
      // 049: dstore 14
      // 04b: dconst_1
      // 04c: dstore 16
      // 04e: dload 2
      // 04f: dstore 26
      // 051: iload 8
      // 053: ifne 1fb
      // 056: dload 0
      // 057: goto 05e
      // 05a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05d: athrow
      // 05e: dstore 22
      // 060: dload 2
      // 061: dstore 24
      // 063: dload 22
      // 065: invokestatic java/lang/Math.abs (D)D
      // 068: dload 24
      // 06a: invokestatic java/lang/Math.abs (D)D
      // 06d: invokestatic iww.nz9 (DD)D
      // 070: dstore 19
      // 072: dload 19
      // 074: ldc2_w 4.9947976805055876E145
      // 077: dcmpl
      // 078: iload 8
      // 07a: ifeq 119
      // 07d: iflt 107
      // 080: goto 087
      // 083: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 086: athrow
      // 087: bipush 0
      // 088: istore 21
      // 08a: dload 19
      // 08c: ldc2_w 4.9947976805055876E145
      // 08f: dcmpl
      // 090: iflt 0bf
      // 093: iinc 21 1
      // 096: dload 22
      // 098: ldc2_w 2.002083095183101E-146
      // 09b: dmul
      // 09c: dstore 22
      // 09e: dload 24
      // 0a0: ldc2_w 2.002083095183101E-146
      // 0a3: dmul
      // 0a4: dstore 24
      // 0a6: dload 22
      // 0a8: invokestatic java/lang/Math.abs (D)D
      // 0ab: dload 24
      // 0ad: invokestatic java/lang/Math.abs (D)D
      // 0b0: invokestatic iww.nz9 (DD)D
      // 0b3: iload 8
      // 0b5: ifeq 0cd
      // 0b8: dstore 19
      // 0ba: iload 8
      // 0bc: ifne 08a
      // 0bf: dload 22
      // 0c1: dload 22
      // 0c3: dmul
      // 0c4: dload 24
      // 0c6: dload 24
      // 0c8: dmul
      // 0c9: dadd
      // 0ca: invokestatic java/lang/Math.sqrt (D)D
      // 0cd: dstore 26
      // 0cf: dload 22
      // 0d1: dload 26
      // 0d3: ddiv
      // 0d4: dstore 14
      // 0d6: dload 24
      // 0d8: dload 26
      // 0da: ddiv
      // 0db: dstore 16
      // 0dd: iload 21
      // 0df: istore 9
      // 0e1: bipush 1
      // 0e2: istore 18
      // 0e4: iload 18
      // 0e6: iload 21
      // 0e8: if_icmpgt 1ba
      // 0eb: dload 26
      // 0ed: ldc2_w 4.9947976805055876E145
      // 0f0: dmul
      // 0f1: dstore 26
      // 0f3: iinc 18 1
      // 0f6: iload 8
      // 0f8: ifeq 209
      // 0fb: iload 8
      // 0fd: ifne 0e4
      // 100: goto 107
      // 103: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 106: athrow
      // 107: dload 19
      // 109: ldc2_w 2.002083095183101E-146
      // 10c: iload 8
      // 10e: ifeq 1a6
      // 111: dcmpg
      // 112: goto 119
      // 115: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 118: athrow
      // 119: ifgt 19c
      // 11c: bipush 0
      // 11d: istore 21
      // 11f: dload 19
      // 121: ldc2_w 2.002083095183101E-146
      // 124: dcmpg
      // 125: ifgt 154
      // 128: iinc 21 1
      // 12b: dload 22
      // 12d: ldc2_w 4.9947976805055876E145
      // 130: dmul
      // 131: dstore 22
      // 133: dload 24
      // 135: ldc2_w 4.9947976805055876E145
      // 138: dmul
      // 139: dstore 24
      // 13b: dload 22
      // 13d: invokestatic java/lang/Math.abs (D)D
      // 140: dload 24
      // 142: invokestatic java/lang/Math.abs (D)D
      // 145: invokestatic iww.nz9 (DD)D
      // 148: iload 8
      // 14a: ifeq 162
      // 14d: dstore 19
      // 14f: iload 8
      // 151: ifne 11f
      // 154: dload 22
      // 156: dload 22
      // 158: dmul
      // 159: dload 24
      // 15b: dload 24
      // 15d: dmul
      // 15e: dadd
      // 15f: invokestatic java/lang/Math.sqrt (D)D
      // 162: dstore 26
      // 164: dload 22
      // 166: dload 26
      // 168: ddiv
      // 169: dstore 14
      // 16b: dload 24
      // 16d: dload 26
      // 16f: ddiv
      // 170: dstore 16
      // 172: iload 21
      // 174: istore 9
      // 176: bipush 1
      // 177: istore 18
      // 179: iload 18
      // 17b: iload 21
      // 17d: if_icmpgt 1ba
      // 180: dload 26
      // 182: ldc2_w 2.002083095183101E-146
      // 185: dmul
      // 186: dstore 26
      // 188: iinc 18 1
      // 18b: iload 8
      // 18d: ifeq 209
      // 190: iload 8
      // 192: ifne 179
      // 195: goto 19c
      // 198: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19b: athrow
      // 19c: dload 22
      // 19e: dload 22
      // 1a0: dmul
      // 1a1: dload 24
      // 1a3: dload 24
      // 1a5: dmul
      // 1a6: dadd
      // 1a7: invokestatic java/lang/Math.sqrt (D)D
      // 1aa: dstore 26
      // 1ac: dload 22
      // 1ae: dload 26
      // 1b0: ddiv
      // 1b1: dstore 14
      // 1b3: dload 24
      // 1b5: dload 26
      // 1b7: ddiv
      // 1b8: dstore 16
      // 1ba: dload 0
      // 1bb: invokestatic java/lang/Math.abs (D)D
      // 1be: iload 8
      // 1c0: ifeq 20b
      // 1c3: dload 2
      // 1c4: invokestatic java/lang/Math.abs (D)D
      // 1c7: dcmpl
      // 1c8: ifle 1fb
      // 1cb: goto 1d2
      // 1ce: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d1: athrow
      // 1d2: dload 14
      // 1d4: iload 8
      // 1d6: ifeq 20b
      // 1d9: goto 1e0
      // 1dc: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1df: athrow
      // 1e0: dconst_0
      // 1e1: dcmpg
      // 1e2: ifge 1fb
      // 1e5: goto 1ec
      // 1e8: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1eb: athrow
      // 1ec: dload 14
      // 1ee: dneg
      // 1ef: dstore 14
      // 1f1: dload 16
      // 1f3: dneg
      // 1f4: dstore 16
      // 1f6: dload 26
      // 1f8: dneg
      // 1f9: dstore 26
      // 1fb: aload 4
      // 1fd: iload 6
      // 1ff: dload 16
      // 201: dastore
      // 202: aload 5
      // 204: iload 6
      // 206: dload 14
      // 208: dastore
      // 209: dload 26
      // 20b: dreturn
   }

   public static void l3r(double[] var0) {
      int var1 = t9d.b();
      int var2 = 0;

      while (var2 < 3) {
         System.out.println(var0[var2 * 3 + 0] + " " + var0[var2 * 3 + 1] + " " + var0[var2 * 3 + 2] + "\n");
         var2++;
         if (var1 == 0) {
            break;
         }
      }
   }

   public static void cyp(double[] var0) {
      long var1 = a ^ 48873585444741L;
      double var3 = var0[0] * var0[4] * var0[8]
         + var0[1] * var0[5] * var0[6]
         + var0[2] * var0[3] * var0[7]
         - var0[2] * var0[4] * var0[6]
         - var0[0] * var0[5] * var0[7]
         - var0[1] * var0[3] * var0[8];
      System.out.println(a<"h">(11284, 841837104052581822L ^ var1) + var3);
   }

   public static void sw7(double[] var0, double[] var1, double[] var2) {
      double[] var5 = new double[9];
      int var10000 = t9d.c();
      var5[0] = var0[0] * var1[0] + var0[1] * var1[3] + var0[2] * var1[6];
      int var3 = var10000;
      var5[1] = var0[0] * var1[1] + var0[1] * var1[4] + var0[2] * var1[7];
      var5[2] = var0[0] * var1[2] + var0[1] * var1[5] + var0[2] * var1[8];
      var5[3] = var0[3] * var1[0] + var0[4] * var1[3] + var0[5] * var1[6];
      var5[4] = var0[3] * var1[1] + var0[4] * var1[4] + var0[5] * var1[7];
      var5[5] = var0[3] * var1[2] + var0[4] * var1[5] + var0[5] * var1[8];
      var5[6] = var0[6] * var1[0] + var0[7] * var1[3] + var0[8] * var1[6];
      var5[7] = var0[6] * var1[1] + var0[7] * var1[4] + var0[8] * var1[7];
      var5[8] = var0[6] * var1[2] + var0[7] * var1[5] + var0[8] * var1[8];
      int var4 = 0;

      while (var4 < 9) {
         var2[var4] = var5[var4];
         var4++;
         if (var3 != 0) {
            break;
         }
      }
   }

   public static void zvx(double[] var0, double[] var1) {
      var1[0] = var0[0];
      var1[1] = var0[3];
      var1[2] = var0[6];
      var1[3] = var0[1];
      var1[4] = var0[4];
      var1[5] = var0[7];
      var1[6] = var0[2];
      var1[7] = var0[5];
      var1[8] = var0[8];
   }

   public static double okm(double[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: bipush 0
      // 06: daload
      // 07: aload 0
      // 08: bipush 1
      // 09: daload
      // 0a: dcmpl
      // 0b: iload 1
      // 0c: ifeq 53
      // 0f: ifle 41
      // 12: goto 19
      // 15: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: aload 0
      // 1a: bipush 0
      // 1b: daload
      // 1c: iload 1
      // 1d: ifeq 40
      // 20: goto 27
      // 23: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26: athrow
      // 27: aload 0
      // 28: bipush 2
      // 29: daload
      // 2a: dcmpl
      // 2b: ifle 3d
      // 2e: goto 35
      // 31: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 34: athrow
      // 35: aload 0
      // 36: bipush 0
      // 37: daload
      // 38: dreturn
      // 39: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: bipush 2
      // 3f: daload
      // 40: dreturn
      // 41: aload 0
      // 42: bipush 1
      // 43: daload
      // 44: iload 1
      // 45: ifeq 61
      // 48: aload 0
      // 49: bipush 2
      // 4a: daload
      // 4b: dcmpl
      // 4c: goto 53
      // 4f: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 52: athrow
      // 53: ifle 5e
      // 56: aload 0
      // 57: bipush 1
      // 58: daload
      // 59: dreturn
      // 5a: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5d: athrow
      // 5e: aload 0
      // 5f: bipush 2
      // 60: daload
      // 61: dreturn
   }

   private static final boolean aov(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: dload 0
      // 06: iload 4
      // 08: ifne 20
      // 0b: dload 2
      // 0c: dcmpl
      // 0d: ifne 1d
      // 10: goto 17
      // 13: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16: athrow
      // 17: bipush 1
      // 18: ireturn
      // 19: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: ldc2_w 1.0E-6
      // 20: dstore 5
      // 22: ldc2_w 1.0E-4
      // 25: dstore 7
      // 27: dload 0
      // 28: dload 2
      // 29: dsub
      // 2a: invokestatic java/lang/Math.abs (D)D
      // 2d: dstore 9
      // 2f: dload 0
      // 30: invokestatic java/lang/Math.abs (D)D
      // 33: dstore 11
      // 35: dload 2
      // 36: invokestatic java/lang/Math.abs (D)D
      // 39: dstore 13
      // 3b: dload 11
      // 3d: iload 4
      // 3f: ifne 58
      // 42: dload 13
      // 44: dcmpl
      // 45: iflt 5b
      // 48: goto 4f
      // 4b: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e: athrow
      // 4f: dload 11
      // 51: goto 58
      // 54: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 57: athrow
      // 58: goto 5d
      // 5b: dload 13
      // 5d: dstore 15
      // 5f: dload 9
      // 61: ldc2_w 1.0E-6
      // 64: dcmpg
      // 65: iload 4
      // 67: ifne 83
      // 6a: ifge 7a
      // 6d: goto 74
      // 70: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 73: athrow
      // 74: bipush 1
      // 75: ireturn
      // 76: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 79: athrow
      // 7a: dload 9
      // 7c: dload 15
      // 7e: ddiv
      // 7f: ldc2_w 1.0E-4
      // 82: dcmpg
      // 83: iload 4
      // 85: ifne 99
      // 88: ifge 98
      // 8b: goto 92
      // 8e: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 91: athrow
      // 92: bipush 1
      // 93: ireturn
      // 94: invokestatic iww.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 97: athrow
      // 98: bipush 0
      // 99: ireturn
   }

   @Override
   public Object clone() {
      Object var1 = null;

      try {
         return (iww)super.clone();
      } catch (CloneNotSupportedException var3) {
         throw new InternalError();
      }
   }

   public final double cwf() {
      return this.lxb;
   }

   public final void rjo(double var1) {
      this.lxb = var1;
   }

   public final double js5() {
      return this.y3c;
   }

   public final void ti8(double var1) {
      this.y3c = var1;
   }

   public final double b9a() {
      return this.bhd;
   }

   public final void rj9(double var1) {
      this.bhd = var1;
   }

   public final double fw7() {
      return this.get;
   }

   public final void fx7(double var1) {
      this.get = var1;
   }

   public final double bi7() {
      return this.pwn;
   }

   public final void i71(double var1) {
      this.pwn = var1;
   }

   public final double paf() {
      return this.c84;
   }

   public final void rcy(double var1) {
      this.c84 = var1;
   }

   public final double oxq() {
      return this.y7q;
   }

   public final void hx0(double var1) {
      this.y7q = var1;
   }

   public final double l41() {
      return this._o7;
   }

   public final void gft(double var1) {
      this._o7 = var1;
   }

   public final double am6() {
      return this.ffq;
   }

   public final void qfb(double var1) {
      this.ffq = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5611127502596463208L, -7929496897392324392L, MethodHandles.lookup().lookupClass()).a(51081858839739L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 11426369852644L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[16];
      int var7 = 0;
      String var6 = "Áè©3Z\u0097=\u00194\u0090\u0010\u0091X|ØÔ\u0090\u000f\u0001¦\u000b\u007f\u0016\u0006 (\"S-²\u0018#<ÛU\u0016oàÒVÐuÌÆ¯\"'Í\u0090ÌÑ\u0015Xb\u0080\bô \u0003ªì.\u0019\u008a0\u0085\u009cSº:\u0096_{làS\u007fÙ\u001dàî\u009fO\u00adcnn6\u0099ù ¶ÐZú¬Ð\u0099\u0001\u008f_ô\u000eC?ãHEÝ°;K¥ö²ánçDÅ´Ë8 Á5ô\u0016}IÞìl\r·»\u008b×®\u0001\u001a\u008580E\u0083°«0ÐW\u008agÐ\u008b:\u0010Sà\u0094N\u008b\u0013äËNìì±Ú8Í\f \u0013\u0019I¤ÍK\u009e\u0004z ª\u0092¹k¥\u008cH6B/lë&ñ`üÉUÓÏ\u0092>\u0010ò\u0092Hi$M«46¦Ú²§/\u0019Ô H#\u001dóÿ*$\u0006Mm¡§\u0091ó\u001b\u009eù:\u0016a\u0011×\u0092u\u0087m\u0001½Ý1\u001b5 gMW*\n\u001a/Ä\u0002\u0005ñ\r\u0003\n=´É@°\t¡\u0003q.ü\n\u0080gZW\u009a\u0089 R\u0015=tÀó¹\u0007Àñ\u0088\u001c\u0017\u0083%]=¤x\u0095ªd\u009eðXs\u008cÜOn Ø\u0010\u0006\u009cÞ\u0018\u008f\u000f\nÛ %´í;\u0000#Ô i%hÏÐ?Úä8Í\u0092¦ÐÝÐ\u000bçCat\u0097Qg\u009aßdRdèÁËª U*\u0088F·Wôt\u009aß\u0094\u0003©¤+Ûuþ\u0081¹ ~µP×Ø9ê\u0012ÔàÙ";
      int var8 = "Áè©3Z\u0097=\u00194\u0090\u0010\u0091X|ØÔ\u0090\u000f\u0001¦\u000b\u007f\u0016\u0006 (\"S-²\u0018#<ÛU\u0016oàÒVÐuÌÆ¯\"'Í\u0090ÌÑ\u0015Xb\u0080\bô \u0003ªì.\u0019\u008a0\u0085\u009cSº:\u0096_{làS\u007fÙ\u001dàî\u009fO\u00adcnn6\u0099ù ¶ÐZú¬Ð\u0099\u0001\u008f_ô\u000eC?ãHEÝ°;K¥ö²ánçDÅ´Ë8 Á5ô\u0016}IÞìl\r·»\u008b×®\u0001\u001a\u008580E\u0083°«0ÐW\u008agÐ\u008b:\u0010Sà\u0094N\u008b\u0013äËNìì±Ú8Í\f \u0013\u0019I¤ÍK\u009e\u0004z ª\u0092¹k¥\u008cH6B/lë&ñ`üÉUÓÏ\u0092>\u0010ò\u0092Hi$M«46¦Ú²§/\u0019Ô H#\u001dóÿ*$\u0006Mm¡§\u0091ó\u001b\u009eù:\u0016a\u0011×\u0092u\u0087m\u0001½Ý1\u001b5 gMW*\n\u001a/Ä\u0002\u0005ñ\r\u0003\n=´É@°\t¡\u0003q.ü\n\u0080gZW\u009a\u0089 R\u0015=tÀó¹\u0007Àñ\u0088\u001c\u0017\u0083%]=¤x\u0095ªd\u009eðXs\u008cÜOn Ø\u0010\u0006\u009cÞ\u0018\u008f\u000f\nÛ %´í;\u0000#Ô i%hÏÐ?Úä8Í\u0092¦ÐÝÐ\u000bçCat\u0097Qg\u009aßdRdèÁËª U*\u0088F·Wôt\u009aß\u0094\u0003©¤+Ûuþ\u0081¹ ~µP×Ø9ê\u0012ÔàÙ"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[16];
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

                  var6 = "Ü3\u0097®ç\u0081È\u008d!y\nÀMGÙ®\u0082J/ Á\u001fÇ\u0097[\u007f\u0017òh\u0099\u008c\u009f\u0018±X\u0084ï\u0019ò\u008eªË\u0093Ã\u0080\u001a·â©º\u0095ò·L\u001e\u009c\u008a";
                  var8 = "Ü3\u0097®ç\u0081È\u008d!y\nÀMGÙ®\u0082J/ Á\u001fÇ\u0097[\u007f\u0017òh\u0099\u008c\u009f\u0018±X\u0084ï\u0019ò\u008eªË\u0093Ã\u0080\u001a·â©º\u0095ò·L\u001e\u009c\u008a"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13603;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("iww", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("iww" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
