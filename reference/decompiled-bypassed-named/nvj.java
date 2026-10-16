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

public class nvj implements Serializable, Cloneable {
   public static final long serialVersionUID = 329697160112089834L;
   public float i2i;
   public float k12;
   public float xu6;
   public float _id;
   public float aoj;
   public float zk_;
   public float aqg;
   public float wdt;
   public float jr8;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public nvj(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.i2i = var1;
      this.k12 = var2;
      this.xu6 = var3;
      this._id = var4;
      this.aoj = var5;
      this.zk_ = var6;
      this.aqg = var7;
      this.wdt = var8;
      this.jr8 = var9;
   }

   public nvj(float[] var1) {
      this.i2i = var1[0];
      this.k12 = var1[1];
      this.xu6 = var1[2];
      this._id = var1[3];
      this.aoj = var1[4];
      this.zk_ = var1[5];
      this.aqg = var1[6];
      this.wdt = var1[7];
      this.jr8 = var1[8];
   }

   public nvj(iww var1) {
      this.i2i = (float)var1.lxb;
      this.k12 = (float)var1.y3c;
      this.xu6 = (float)var1.bhd;
      this._id = (float)var1.get;
      this.aoj = (float)var1.pwn;
      this.zk_ = (float)var1.c84;
      this.aqg = (float)var1.y7q;
      this.wdt = (float)var1._o7;
      this.jr8 = (float)var1.ffq;
   }

   public nvj(nvj var1) {
      this.i2i = var1.i2i;
      this.k12 = var1.k12;
      this.xu6 = var1.xu6;
      this._id = var1._id;
      this.aoj = var1.aoj;
      this.zk_ = var1.zk_;
      this.aqg = var1.aqg;
      this.wdt = var1.wdt;
      this.jr8 = var1.jr8;
   }

   public nvj() {
      this.i2i = 0.0F;
      this.k12 = 0.0F;
      this.xu6 = 0.0F;
      this._id = 0.0F;
      this.aoj = 0.0F;
      this.zk_ = 0.0F;
      this.aqg = 0.0F;
      this.wdt = 0.0F;
      this.jr8 = 0.0F;
   }

   @Override
   public String toString() {
      long var1 = a ^ 49819861344783L;
      return this.i2i
         + a<"i">(26710, 8298212738152222259L ^ var1)
         + this.k12
         + a<"i">(11332, 8347782692840737317L ^ var1)
         + this.xu6
         + "\n"
         + this._id
         + a<"i">(11332, 8347782692840737317L ^ var1)
         + this.aoj
         + a<"i">(11332, 8347782692840737317L ^ var1)
         + this.zk_
         + "\n"
         + this.aqg
         + a<"i">(11332, 8347782692840737317L ^ var1)
         + this.wdt
         + a<"i">(11332, 8347782692840737317L ^ var1)
         + this.jr8
         + "\n";
   }

   public final void vdb() {
      this.i2i = 1.0F;
      this.k12 = 0.0F;
      this.xu6 = 0.0F;
      this._id = 0.0F;
      this.aoj = 1.0F;
      this.zk_ = 0.0F;
      this.aqg = 0.0F;
      this.wdt = 0.0F;
      this.jr8 = 1.0F;
   }

   public final void n74(float var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.ojt(var3, var2);
      this.i2i = (float)(var2[0] * (double)var1);
      this.k12 = (float)(var2[1] * (double)var1);
      this.xu6 = (float)(var2[2] * (double)var1);
      this._id = (float)(var2[3] * (double)var1);
      this.aoj = (float)(var2[4] * (double)var1);
      this.zk_ = (float)(var2[5] * (double)var1);
      this.aqg = (float)(var2[6] * (double)var1);
      this.wdt = (float)(var2[7] * (double)var1);
      this.jr8 = (float)(var2[8] * (double)var1);
   }

   public final void m8f(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic nvj.a J
      // 003: ldc2_w 110931055090715
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 6
      // 00e: iload 1
      // 00f: iload 6
      // 011: ifne 035
      // 014: tableswitch 357 0 2 32 141 249
      // 030: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 033: athrow
      // 034: iload 2
      // 035: tableswitch 78 0 2 27 44 61
      // 050: aload 0
      // 051: fload 3
      // 052: putfield nvj.i2i F
      // 055: iload 6
      // 057: ifeq 193
      // 05a: goto 061
      // 05d: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 060: athrow
      // 061: aload 0
      // 062: fload 3
      // 063: putfield nvj.k12 F
      // 066: iload 6
      // 068: ifeq 193
      // 06b: goto 072
      // 06e: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 071: athrow
      // 072: aload 0
      // 073: fload 3
      // 074: putfield nvj.xu6 F
      // 077: iload 6
      // 079: ifeq 193
      // 07c: goto 083
      // 07f: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 082: athrow
      // 083: new java/lang/ArrayIndexOutOfBoundsException
      // 086: dup
      // 087: sipush 18425
      // 08a: ldc2_w 2042421159679696779
      // 08d: lload 4
      // 08f: lxor
      // 090: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: nop
      // 096: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 099: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 09c: athrow
      // 09d: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a0: athrow
      // 0a1: iload 2
      // 0a2: tableswitch 77 0 2 26 43 60
      // 0bc: aload 0
      // 0bd: fload 3
      // 0be: putfield nvj._id F
      // 0c1: iload 6
      // 0c3: ifeq 193
      // 0c6: goto 0cd
      // 0c9: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: fload 3
      // 0cf: putfield nvj.aoj F
      // 0d2: iload 6
      // 0d4: ifeq 193
      // 0d7: goto 0de
      // 0da: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: fload 3
      // 0e0: putfield nvj.zk_ F
      // 0e3: iload 6
      // 0e5: ifeq 193
      // 0e8: goto 0ef
      // 0eb: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ee: athrow
      // 0ef: new java/lang/ArrayIndexOutOfBoundsException
      // 0f2: dup
      // 0f3: sipush 4615
      // 0f6: ldc2_w 5689996391119407743
      // 0f9: lload 4
      // 0fb: lxor
      // 0fc: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: nop
      // 102: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 105: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 108: athrow
      // 109: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10c: athrow
      // 10d: iload 2
      // 10e: tableswitch 77 0 2 26 43 60
      // 128: aload 0
      // 129: fload 3
      // 12a: putfield nvj.aqg F
      // 12d: iload 6
      // 12f: ifeq 193
      // 132: goto 139
      // 135: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 138: athrow
      // 139: aload 0
      // 13a: fload 3
      // 13b: putfield nvj.wdt F
      // 13e: iload 6
      // 140: ifeq 193
      // 143: goto 14a
      // 146: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 149: athrow
      // 14a: aload 0
      // 14b: fload 3
      // 14c: putfield nvj.jr8 F
      // 14f: iload 6
      // 151: ifeq 193
      // 154: goto 15b
      // 157: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15a: athrow
      // 15b: new java/lang/ArrayIndexOutOfBoundsException
      // 15e: dup
      // 15f: sipush 4615
      // 162: ldc2_w 5689996391119407743
      // 165: lload 4
      // 167: lxor
      // 168: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: nop
      // 16e: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 171: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 174: athrow
      // 175: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 178: athrow
      // 179: new java/lang/ArrayIndexOutOfBoundsException
      // 17c: dup
      // 17d: sipush 4615
      // 180: ldc2_w 5689996391119407743
      // 183: lload 4
      // 185: lxor
      // 186: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: nop
      // 18c: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 18f: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 192: athrow
      // 193: return
   }

   public final void mro(int param1, l3p param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvj.a J
      // 03: ldc2_w 63285178277809
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: iload 5
      // 10: ifne 49
      // 13: ifne 41
      // 16: goto 1d
      // 19: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: aload 2
      // 1e: aload 0
      // 1f: getfield nvj.i2i F
      // 22: putfield l3p.yiu F
      // 25: aload 2
      // 26: aload 0
      // 27: getfield nvj.k12 F
      // 2a: putfield l3p.q6o F
      // 2d: aload 2
      // 2e: aload 0
      // 2f: getfield nvj.xu6 F
      // 32: putfield l3p.n_d F
      // 35: iload 5
      // 37: ifeq ca
      // 3a: goto 41
      // 3d: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 40: athrow
      // 41: iload 1
      // 42: goto 49
      // 45: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: bipush 1
      // 4a: iload 5
      // 4c: ifne 86
      // 4f: if_icmpne 7d
      // 52: goto 59
      // 55: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 58: athrow
      // 59: aload 2
      // 5a: aload 0
      // 5b: getfield nvj._id F
      // 5e: putfield l3p.yiu F
      // 61: aload 2
      // 62: aload 0
      // 63: getfield nvj.aoj F
      // 66: putfield l3p.q6o F
      // 69: aload 2
      // 6a: aload 0
      // 6b: getfield nvj.zk_ F
      // 6e: putfield l3p.n_d F
      // 71: iload 5
      // 73: ifeq ca
      // 76: goto 7d
      // 79: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7c: athrow
      // 7d: iload 1
      // 7e: bipush 2
      // 7f: goto 86
      // 82: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 85: athrow
      // 86: if_icmpne ad
      // 89: aload 2
      // 8a: aload 0
      // 8b: getfield nvj.aqg F
      // 8e: putfield l3p.yiu F
      // 91: aload 2
      // 92: aload 0
      // 93: getfield nvj.wdt F
      // 96: putfield l3p.q6o F
      // 99: aload 2
      // 9a: aload 0
      // 9b: getfield nvj.jr8 F
      // 9e: putfield l3p.n_d F
      // a1: iload 5
      // a3: ifeq ca
      // a6: goto ad
      // a9: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ac: athrow
      // ad: new java/lang/ArrayIndexOutOfBoundsException
      // b0: dup
      // b1: sipush 5154
      // b4: ldc2_w 2488282530196901883
      // b7: lload 3
      // b8: lxor
      // b9: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: nop
      // bf: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // c2: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // c5: athrow
      // c6: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c9: athrow
      // ca: return
   }

   public final void jx5(int param1, float[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvj.a J
      // 03: ldc2_w 59462183661560
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: iload 5
      // 10: ifne 46
      // 13: ifne 3e
      // 16: goto 1d
      // 19: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: aload 2
      // 1e: bipush 0
      // 1f: aload 0
      // 20: getfield nvj.i2i F
      // 23: fastore
      // 24: aload 2
      // 25: bipush 1
      // 26: aload 0
      // 27: getfield nvj.k12 F
      // 2a: fastore
      // 2b: aload 2
      // 2c: bipush 2
      // 2d: aload 0
      // 2e: getfield nvj.xu6 F
      // 31: fastore
      // 32: iload 5
      // 34: ifeq c1
      // 37: goto 3e
      // 3a: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: iload 1
      // 3f: goto 46
      // 42: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 45: athrow
      // 46: bipush 1
      // 47: iload 5
      // 49: ifne 80
      // 4c: if_icmpne 77
      // 4f: goto 56
      // 52: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 55: athrow
      // 56: aload 2
      // 57: bipush 0
      // 58: aload 0
      // 59: getfield nvj._id F
      // 5c: fastore
      // 5d: aload 2
      // 5e: bipush 1
      // 5f: aload 0
      // 60: getfield nvj.aoj F
      // 63: fastore
      // 64: aload 2
      // 65: bipush 2
      // 66: aload 0
      // 67: getfield nvj.zk_ F
      // 6a: fastore
      // 6b: iload 5
      // 6d: ifeq c1
      // 70: goto 77
      // 73: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 76: athrow
      // 77: iload 1
      // 78: bipush 2
      // 79: goto 80
      // 7c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7f: athrow
      // 80: if_icmpne a4
      // 83: aload 2
      // 84: bipush 0
      // 85: aload 0
      // 86: getfield nvj.aqg F
      // 89: fastore
      // 8a: aload 2
      // 8b: bipush 1
      // 8c: aload 0
      // 8d: getfield nvj.wdt F
      // 90: fastore
      // 91: aload 2
      // 92: bipush 2
      // 93: aload 0
      // 94: getfield nvj.jr8 F
      // 97: fastore
      // 98: iload 5
      // 9a: ifeq c1
      // 9d: goto a4
      // a0: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a3: athrow
      // a4: new java/lang/ArrayIndexOutOfBoundsException
      // a7: dup
      // a8: sipush 28520
      // ab: ldc2_w 5063404201017476343
      // ae: lload 3
      // af: lxor
      // b0: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: nop
      // b6: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // b9: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // bc: athrow
      // bd: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c0: athrow
      // c1: return
   }

   public final void fj9(int param1, l3p param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvj.a J
      // 03: ldc2_w 106843312935971
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: iload 5
      // 10: ifne 49
      // 13: ifne 41
      // 16: goto 1d
      // 19: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: aload 2
      // 1e: aload 0
      // 1f: getfield nvj.i2i F
      // 22: putfield l3p.yiu F
      // 25: aload 2
      // 26: aload 0
      // 27: getfield nvj._id F
      // 2a: putfield l3p.q6o F
      // 2d: aload 2
      // 2e: aload 0
      // 2f: getfield nvj.aqg F
      // 32: putfield l3p.n_d F
      // 35: iload 5
      // 37: ifeq ca
      // 3a: goto 41
      // 3d: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 40: athrow
      // 41: iload 1
      // 42: goto 49
      // 45: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: bipush 1
      // 4a: iload 5
      // 4c: ifne 86
      // 4f: if_icmpne 7d
      // 52: goto 59
      // 55: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 58: athrow
      // 59: aload 2
      // 5a: aload 0
      // 5b: getfield nvj.k12 F
      // 5e: putfield l3p.yiu F
      // 61: aload 2
      // 62: aload 0
      // 63: getfield nvj.aoj F
      // 66: putfield l3p.q6o F
      // 69: aload 2
      // 6a: aload 0
      // 6b: getfield nvj.wdt F
      // 6e: putfield l3p.n_d F
      // 71: iload 5
      // 73: ifeq ca
      // 76: goto 7d
      // 79: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7c: athrow
      // 7d: iload 1
      // 7e: bipush 2
      // 7f: goto 86
      // 82: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 85: athrow
      // 86: if_icmpne ad
      // 89: aload 2
      // 8a: aload 0
      // 8b: getfield nvj.xu6 F
      // 8e: putfield l3p.yiu F
      // 91: aload 2
      // 92: aload 0
      // 93: getfield nvj.zk_ F
      // 96: putfield l3p.q6o F
      // 99: aload 2
      // 9a: aload 0
      // 9b: getfield nvj.jr8 F
      // 9e: putfield l3p.n_d F
      // a1: iload 5
      // a3: ifeq ca
      // a6: goto ad
      // a9: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ac: athrow
      // ad: new java/lang/ArrayIndexOutOfBoundsException
      // b0: dup
      // b1: sipush 18441
      // b4: ldc2_w 5289997637000714312
      // b7: lload 3
      // b8: lxor
      // b9: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: nop
      // bf: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // c2: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // c5: athrow
      // c6: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c9: athrow
      // ca: return
   }

   public final void r1u(int param1, float[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvj.a J
      // 03: ldc2_w 112215095051585
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: iload 5
      // 10: ifeq 46
      // 13: ifne 3e
      // 16: goto 1d
      // 19: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: aload 2
      // 1e: bipush 0
      // 1f: aload 0
      // 20: getfield nvj.i2i F
      // 23: fastore
      // 24: aload 2
      // 25: bipush 1
      // 26: aload 0
      // 27: getfield nvj._id F
      // 2a: fastore
      // 2b: aload 2
      // 2c: bipush 2
      // 2d: aload 0
      // 2e: getfield nvj.aqg F
      // 31: fastore
      // 32: iload 5
      // 34: ifne c1
      // 37: goto 3e
      // 3a: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: iload 1
      // 3f: goto 46
      // 42: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 45: athrow
      // 46: bipush 1
      // 47: iload 5
      // 49: ifeq 80
      // 4c: if_icmpne 77
      // 4f: goto 56
      // 52: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 55: athrow
      // 56: aload 2
      // 57: bipush 0
      // 58: aload 0
      // 59: getfield nvj.k12 F
      // 5c: fastore
      // 5d: aload 2
      // 5e: bipush 1
      // 5f: aload 0
      // 60: getfield nvj.aoj F
      // 63: fastore
      // 64: aload 2
      // 65: bipush 2
      // 66: aload 0
      // 67: getfield nvj.wdt F
      // 6a: fastore
      // 6b: iload 5
      // 6d: ifne c1
      // 70: goto 77
      // 73: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 76: athrow
      // 77: iload 1
      // 78: bipush 2
      // 79: goto 80
      // 7c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7f: athrow
      // 80: if_icmpne a4
      // 83: aload 2
      // 84: bipush 0
      // 85: aload 0
      // 86: getfield nvj.xu6 F
      // 89: fastore
      // 8a: aload 2
      // 8b: bipush 1
      // 8c: aload 0
      // 8d: getfield nvj.zk_ F
      // 90: fastore
      // 91: aload 2
      // 92: bipush 2
      // 93: aload 0
      // 94: getfield nvj.jr8 F
      // 97: fastore
      // 98: iload 5
      // 9a: ifne c1
      // 9d: goto a4
      // a0: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a3: athrow
      // a4: new java/lang/ArrayIndexOutOfBoundsException
      // a7: dup
      // a8: sipush 7706
      // ab: ldc2_w 5186105843956047679
      // ae: lload 3
      // af: lxor
      // b0: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: nop
      // b6: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // b9: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // bc: athrow
      // bd: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c0: athrow
      // c1: return
   }

   public final float ak7(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvj.a J
      // 03: ldc2_w 67011961872665
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: iload 5
      // 10: ifne 31
      // 13: tableswitch 191 0 2 29 81 137
      // 2c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f: athrow
      // 30: iload 2
      // 31: tableswitch 46 0 2 27 36 41
      // 4c: aload 0
      // 4d: getfield nvj.i2i F
      // 50: freturn
      // 51: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 54: athrow
      // 55: aload 0
      // 56: getfield nvj.k12 F
      // 59: freturn
      // 5a: aload 0
      // 5b: getfield nvj.xu6 F
      // 5e: freturn
      // 5f: iload 5
      // 61: ifeq d2
      // 64: iload 2
      // 65: tableswitch 50 0 2 31 40 45
      // 80: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 83: athrow
      // 84: aload 0
      // 85: getfield nvj._id F
      // 88: freturn
      // 89: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8c: athrow
      // 8d: aload 0
      // 8e: getfield nvj.aoj F
      // 91: freturn
      // 92: aload 0
      // 93: getfield nvj.zk_ F
      // 96: freturn
      // 97: iload 5
      // 99: ifeq d2
      // 9c: iload 2
      // 9d: tableswitch 50 0 2 31 40 45
      // b8: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // bb: athrow
      // bc: aload 0
      // bd: getfield nvj.aqg F
      // c0: freturn
      // c1: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c4: athrow
      // c5: aload 0
      // c6: getfield nvj.wdt F
      // c9: freturn
      // ca: aload 0
      // cb: getfield nvj.jr8 F
      // ce: freturn
      // cf: goto d2
      // d2: new java/lang/ArrayIndexOutOfBoundsException
      // d5: dup
      // d6: sipush 24115
      // d9: ldc2_w 2940066359164795722
      // dc: lload 3
      // dd: lxor
      // de: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e3: nop
      // e4: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // e7: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // ea: athrow
   }

   public final void yzu(int param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvj.a J
      // 03: ldc2_w 5309116568795
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 7
      // 0e: iload 1
      // 0f: tableswitch 109 0 2 25 53 81
      // 28: aload 0
      // 29: fload 2
      // 2a: putfield nvj.i2i F
      // 2d: aload 0
      // 2e: fload 3
      // 2f: putfield nvj.k12 F
      // 32: aload 0
      // 33: fload 4
      // 35: putfield nvj.xu6 F
      // 38: iload 7
      // 3a: ifeq 9a
      // 3d: goto 44
      // 40: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 43: athrow
      // 44: aload 0
      // 45: fload 2
      // 46: putfield nvj._id F
      // 49: aload 0
      // 4a: fload 3
      // 4b: putfield nvj.aoj F
      // 4e: aload 0
      // 4f: fload 4
      // 51: putfield nvj.zk_ F
      // 54: iload 7
      // 56: ifeq 9a
      // 59: goto 60
      // 5c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5f: athrow
      // 60: aload 0
      // 61: fload 2
      // 62: putfield nvj.aqg F
      // 65: aload 0
      // 66: fload 3
      // 67: putfield nvj.wdt F
      // 6a: aload 0
      // 6b: fload 4
      // 6d: putfield nvj.jr8 F
      // 70: iload 7
      // 72: ifeq 9a
      // 75: goto 7c
      // 78: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7b: athrow
      // 7c: new java/lang/ArrayIndexOutOfBoundsException
      // 7f: dup
      // 80: sipush 1262
      // 83: ldc2_w 456236854823621720
      // 86: lload 5
      // 88: lxor
      // 89: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: nop
      // 8f: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 92: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 95: athrow
      // 96: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 99: athrow
      // 9a: return
   }

   public final void n2o(int param1, l3p param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvj.a J
      // 03: ldc2_w 70537642758122
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 134 0 2 26 62 98
      // 28: aload 0
      // 29: aload 2
      // 2a: getfield l3p.yiu F
      // 2d: putfield nvj.i2i F
      // 30: aload 0
      // 31: aload 2
      // 32: getfield l3p.q6o F
      // 35: putfield nvj.k12 F
      // 38: aload 0
      // 39: aload 2
      // 3a: getfield l3p.n_d F
      // 3d: putfield nvj.xu6 F
      // 40: iload 5
      // 42: ifne b1
      // 45: goto 4c
      // 48: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 2
      // 4e: getfield l3p.yiu F
      // 51: putfield nvj._id F
      // 54: aload 0
      // 55: aload 2
      // 56: getfield l3p.q6o F
      // 59: putfield nvj.aoj F
      // 5c: aload 0
      // 5d: aload 2
      // 5e: getfield l3p.n_d F
      // 61: putfield nvj.zk_ F
      // 64: iload 5
      // 66: ifne b1
      // 69: goto 70
      // 6c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6f: athrow
      // 70: aload 0
      // 71: aload 2
      // 72: getfield l3p.yiu F
      // 75: putfield nvj.aqg F
      // 78: aload 0
      // 79: aload 2
      // 7a: getfield l3p.q6o F
      // 7d: putfield nvj.wdt F
      // 80: aload 0
      // 81: aload 2
      // 82: getfield l3p.n_d F
      // 85: putfield nvj.jr8 F
      // 88: iload 5
      // 8a: ifne b1
      // 8d: goto 94
      // 90: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 93: athrow
      // 94: new java/lang/ArrayIndexOutOfBoundsException
      // 97: dup
      // 98: sipush 15179
      // 9b: ldc2_w 7283070122034999488
      // 9e: lload 3
      // 9f: lxor
      // a0: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: nop
      // a6: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // a9: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // ac: athrow
      // ad: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b0: athrow
      // b1: return
   }

   public final void cb_(int param1, float[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvj.a J
      // 03: ldc2_w 123299546759064
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 125 0 2 26 59 92
      // 28: aload 0
      // 29: aload 2
      // 2a: bipush 0
      // 2b: faload
      // 2c: putfield nvj.i2i F
      // 2f: aload 0
      // 30: aload 2
      // 31: bipush 1
      // 32: faload
      // 33: putfield nvj.k12 F
      // 36: aload 0
      // 37: aload 2
      // 38: bipush 2
      // 39: faload
      // 3a: putfield nvj.xu6 F
      // 3d: iload 5
      // 3f: ifeq a8
      // 42: goto 49
      // 45: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 2
      // 4b: bipush 0
      // 4c: faload
      // 4d: putfield nvj._id F
      // 50: aload 0
      // 51: aload 2
      // 52: bipush 1
      // 53: faload
      // 54: putfield nvj.aoj F
      // 57: aload 0
      // 58: aload 2
      // 59: bipush 2
      // 5a: faload
      // 5b: putfield nvj.zk_ F
      // 5e: iload 5
      // 60: ifeq a8
      // 63: goto 6a
      // 66: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 69: athrow
      // 6a: aload 0
      // 6b: aload 2
      // 6c: bipush 0
      // 6d: faload
      // 6e: putfield nvj.aqg F
      // 71: aload 0
      // 72: aload 2
      // 73: bipush 1
      // 74: faload
      // 75: putfield nvj.wdt F
      // 78: aload 0
      // 79: aload 2
      // 7a: bipush 2
      // 7b: faload
      // 7c: putfield nvj.jr8 F
      // 7f: iload 5
      // 81: ifeq a8
      // 84: goto 8b
      // 87: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8a: athrow
      // 8b: new java/lang/ArrayIndexOutOfBoundsException
      // 8e: dup
      // 8f: sipush 1262
      // 92: ldc2_w 456154351847259931
      // 95: lload 3
      // 96: lxor
      // 97: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: nop
      // 9d: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // a0: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // a3: athrow
      // a4: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a7: athrow
      // a8: return
   }

   public final void umy(int param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvj.a J
      // 03: ldc2_w 129091480792210
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: istore 7
      // 0e: iload 1
      // 0f: tableswitch 109 0 2 25 53 81
      // 28: aload 0
      // 29: fload 2
      // 2a: putfield nvj.i2i F
      // 2d: aload 0
      // 2e: fload 3
      // 2f: putfield nvj._id F
      // 32: aload 0
      // 33: fload 4
      // 35: putfield nvj.aqg F
      // 38: iload 7
      // 3a: ifne 9a
      // 3d: goto 44
      // 40: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 43: athrow
      // 44: aload 0
      // 45: fload 2
      // 46: putfield nvj.k12 F
      // 49: aload 0
      // 4a: fload 3
      // 4b: putfield nvj.aoj F
      // 4e: aload 0
      // 4f: fload 4
      // 51: putfield nvj.wdt F
      // 54: iload 7
      // 56: ifne 9a
      // 59: goto 60
      // 5c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5f: athrow
      // 60: aload 0
      // 61: fload 2
      // 62: putfield nvj.xu6 F
      // 65: aload 0
      // 66: fload 3
      // 67: putfield nvj.zk_ F
      // 6a: aload 0
      // 6b: fload 4
      // 6d: putfield nvj.jr8 F
      // 70: iload 7
      // 72: ifne 9a
      // 75: goto 7c
      // 78: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7b: athrow
      // 7c: new java/lang/ArrayIndexOutOfBoundsException
      // 7f: dup
      // 80: sipush 10952
      // 83: ldc2_w 6107466554283147830
      // 86: lload 5
      // 88: lxor
      // 89: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: nop
      // 8f: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 92: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 95: athrow
      // 96: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 99: athrow
      // 9a: return
   }

   public final void x6l(int param1, l3p param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvj.a J
      // 03: ldc2_w 118632194655542
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 134 0 2 26 62 98
      // 28: aload 0
      // 29: aload 2
      // 2a: getfield l3p.yiu F
      // 2d: putfield nvj.i2i F
      // 30: aload 0
      // 31: aload 2
      // 32: getfield l3p.q6o F
      // 35: putfield nvj._id F
      // 38: aload 0
      // 39: aload 2
      // 3a: getfield l3p.n_d F
      // 3d: putfield nvj.aqg F
      // 40: iload 5
      // 42: ifne b1
      // 45: goto 4c
      // 48: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 2
      // 4e: getfield l3p.yiu F
      // 51: putfield nvj.k12 F
      // 54: aload 0
      // 55: aload 2
      // 56: getfield l3p.q6o F
      // 59: putfield nvj.aoj F
      // 5c: aload 0
      // 5d: aload 2
      // 5e: getfield l3p.n_d F
      // 61: putfield nvj.wdt F
      // 64: iload 5
      // 66: ifne b1
      // 69: goto 70
      // 6c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6f: athrow
      // 70: aload 0
      // 71: aload 2
      // 72: getfield l3p.yiu F
      // 75: putfield nvj.xu6 F
      // 78: aload 0
      // 79: aload 2
      // 7a: getfield l3p.q6o F
      // 7d: putfield nvj.zk_ F
      // 80: aload 0
      // 81: aload 2
      // 82: getfield l3p.n_d F
      // 85: putfield nvj.jr8 F
      // 88: iload 5
      // 8a: ifne b1
      // 8d: goto 94
      // 90: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 93: athrow
      // 94: new java/lang/ArrayIndexOutOfBoundsException
      // 97: dup
      // 98: sipush 16431
      // 9b: ldc2_w 3388360558114849142
      // 9e: lload 3
      // 9f: lxor
      // a0: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: nop
      // a6: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // a9: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // ac: athrow
      // ad: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b0: athrow
      // b1: return
   }

   public final void mi_(int param1, float[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvj.a J
      // 03: ldc2_w 46898455642506
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 125 0 2 26 59 92
      // 28: aload 0
      // 29: aload 2
      // 2a: bipush 0
      // 2b: faload
      // 2c: putfield nvj.i2i F
      // 2f: aload 0
      // 30: aload 2
      // 31: bipush 1
      // 32: faload
      // 33: putfield nvj._id F
      // 36: aload 0
      // 37: aload 2
      // 38: bipush 2
      // 39: faload
      // 3a: putfield nvj.aqg F
      // 3d: iload 5
      // 3f: ifeq a8
      // 42: goto 49
      // 45: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 2
      // 4b: bipush 0
      // 4c: faload
      // 4d: putfield nvj.k12 F
      // 50: aload 0
      // 51: aload 2
      // 52: bipush 1
      // 53: faload
      // 54: putfield nvj.aoj F
      // 57: aload 0
      // 58: aload 2
      // 59: bipush 2
      // 5a: faload
      // 5b: putfield nvj.wdt F
      // 5e: iload 5
      // 60: ifeq a8
      // 63: goto 6a
      // 66: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 69: athrow
      // 6a: aload 0
      // 6b: aload 2
      // 6c: bipush 0
      // 6d: faload
      // 6e: putfield nvj.xu6 F
      // 71: aload 0
      // 72: aload 2
      // 73: bipush 1
      // 74: faload
      // 75: putfield nvj.zk_ F
      // 78: aload 0
      // 79: aload 2
      // 7a: bipush 2
      // 7b: faload
      // 7c: putfield nvj.jr8 F
      // 7f: iload 5
      // 81: ifeq a8
      // 84: goto 8b
      // 87: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8a: athrow
      // 8b: new java/lang/ArrayIndexOutOfBoundsException
      // 8e: dup
      // 8f: sipush 10952
      // 92: ldc2_w 6107527298241621806
      // 95: lload 3
      // 96: lxor
      // 97: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: nop
      // 9d: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // a0: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // a3: athrow
      // a4: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a7: athrow
      // a8: return
   }

   public final float hx3() {
      double[] var1 = new double[9];
      double[] var2 = new double[3];
      this.ojt(var2, var1);
      return (float)iww.okm(var2);
   }

   public final void vh0(float var1) {
      this.i2i += var1;
      this.k12 += var1;
      this.xu6 += var1;
      this._id += var1;
      this.aoj += var1;
      this.zk_ += var1;
      this.aqg += var1;
      this.wdt += var1;
      this.jr8 += var1;
   }

   public final void ov1(float var1, nvj var2) {
      this.i2i = var2.i2i + var1;
      this.k12 = var2.k12 + var1;
      this.xu6 = var2.xu6 + var1;
      this._id = var2._id + var1;
      this.aoj = var2.aoj + var1;
      this.zk_ = var2.zk_ + var1;
      this.aqg = var2.aqg + var1;
      this.wdt = var2.wdt + var1;
      this.jr8 = var2.jr8 + var1;
   }

   public final void lgq(nvj var1, nvj var2) {
      this.i2i = var1.i2i + var2.i2i;
      this.k12 = var1.k12 + var2.k12;
      this.xu6 = var1.xu6 + var2.xu6;
      this._id = var1._id + var2._id;
      this.aoj = var1.aoj + var2.aoj;
      this.zk_ = var1.zk_ + var2.zk_;
      this.aqg = var1.aqg + var2.aqg;
      this.wdt = var1.wdt + var2.wdt;
      this.jr8 = var1.jr8 + var2.jr8;
   }

   public final void _z9(nvj var1) {
      this.i2i = this.i2i + var1.i2i;
      this.k12 = this.k12 + var1.k12;
      this.xu6 = this.xu6 + var1.xu6;
      this._id = this._id + var1._id;
      this.aoj = this.aoj + var1.aoj;
      this.zk_ = this.zk_ + var1.zk_;
      this.aqg = this.aqg + var1.aqg;
      this.wdt = this.wdt + var1.wdt;
      this.jr8 = this.jr8 + var1.jr8;
   }

   public final void skz(nvj var1, nvj var2) {
      this.i2i = var1.i2i - var2.i2i;
      this.k12 = var1.k12 - var2.k12;
      this.xu6 = var1.xu6 - var2.xu6;
      this._id = var1._id - var2._id;
      this.aoj = var1.aoj - var2.aoj;
      this.zk_ = var1.zk_ - var2.zk_;
      this.aqg = var1.aqg - var2.aqg;
      this.wdt = var1.wdt - var2.wdt;
      this.jr8 = var1.jr8 - var2.jr8;
   }

   public final void zut(nvj var1) {
      this.i2i = this.i2i - var1.i2i;
      this.k12 = this.k12 - var1.k12;
      this.xu6 = this.xu6 - var1.xu6;
      this._id = this._id - var1._id;
      this.aoj = this.aoj - var1.aoj;
      this.zk_ = this.zk_ - var1.zk_;
      this.aqg = this.aqg - var1.aqg;
      this.wdt = this.wdt - var1.wdt;
      this.jr8 = this.jr8 - var1.jr8;
   }

   public final void ahq() {
      float var1 = this._id;
      this._id = this.k12;
      this.k12 = var1;
      var1 = this.aqg;
      this.aqg = this.xu6;
      this.xu6 = var1;
      var1 = this.wdt;
      this.wdt = this.zk_;
      this.zk_ = var1;
   }

   public final void spt(nvj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 6f
      // 09: aload 1
      // 0a: if_acmpeq 67
      // 0d: goto 14
      // 10: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: aload 0
      // 15: aload 1
      // 16: getfield nvj.i2i F
      // 19: putfield nvj.i2i F
      // 1c: aload 0
      // 1d: aload 1
      // 1e: getfield nvj._id F
      // 21: putfield nvj.k12 F
      // 24: aload 0
      // 25: aload 1
      // 26: getfield nvj.aqg F
      // 29: putfield nvj.xu6 F
      // 2c: aload 0
      // 2d: aload 1
      // 2e: getfield nvj.k12 F
      // 31: putfield nvj._id F
      // 34: aload 0
      // 35: aload 1
      // 36: getfield nvj.aoj F
      // 39: putfield nvj.aoj F
      // 3c: aload 0
      // 3d: aload 1
      // 3e: getfield nvj.wdt F
      // 41: putfield nvj.zk_ F
      // 44: aload 0
      // 45: aload 1
      // 46: getfield nvj.xu6 F
      // 49: putfield nvj.aqg F
      // 4c: aload 0
      // 4d: aload 1
      // 4e: getfield nvj.zk_ F
      // 51: putfield nvj.wdt F
      // 54: aload 0
      // 55: aload 1
      // 56: getfield nvj.jr8 F
      // 59: putfield nvj.jr8 F
      // 5c: iload 2
      // 5d: ifne 72
      // 60: goto 67
      // 63: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 66: athrow
      // 67: aload 0
      // 68: goto 6f
      // 6b: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6e: athrow
      // 6f: invokevirtual nvj.ahq ()V
      // 72: return
   }

   public final void x5p(lwt var1) {
      this.i2i = 1.0F - 2.0F * var1.nc_ * var1.nc_ - 2.0F * var1.ax5 * var1.ax5;
      this._id = 2.0F * (var1.hp2 * var1.nc_ + var1.ck3 * var1.ax5);
      this.aqg = 2.0F * (var1.hp2 * var1.ax5 - var1.ck3 * var1.nc_);
      this.k12 = 2.0F * (var1.hp2 * var1.nc_ - var1.ck3 * var1.ax5);
      this.aoj = 1.0F - 2.0F * var1.hp2 * var1.hp2 - 2.0F * var1.ax5 * var1.ax5;
      this.wdt = 2.0F * (var1.nc_ * var1.ax5 + var1.ck3 * var1.hp2);
      this.xu6 = 2.0F * (var1.hp2 * var1.ax5 + var1.ck3 * var1.nc_);
      this.zk_ = 2.0F * (var1.nc_ * var1.ax5 - var1.ck3 * var1.hp2);
      this.jr8 = 1.0F - 2.0F * var1.hp2 * var1.hp2 - 2.0F * var1.nc_ * var1.nc_;
   }

   public final void _c9(ll8 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
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
      // 025: d2f
      // 026: fstore 3
      // 027: fload 3
      // 028: iload 2
      // 029: ifne 07d
      // 02c: f2d
      // 02d: ldc2_w 1.0E-8
      // 030: dcmpg
      // 031: ifge 073
      // 034: goto 03b
      // 037: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03a: athrow
      // 03b: aload 0
      // 03c: fconst_1
      // 03d: putfield nvj.i2i F
      // 040: aload 0
      // 041: fconst_0
      // 042: putfield nvj.k12 F
      // 045: aload 0
      // 046: fconst_0
      // 047: putfield nvj.xu6 F
      // 04a: aload 0
      // 04b: fconst_0
      // 04c: putfield nvj._id F
      // 04f: aload 0
      // 050: fconst_1
      // 051: putfield nvj.aoj F
      // 054: aload 0
      // 055: fconst_0
      // 056: putfield nvj.zk_ F
      // 059: aload 0
      // 05a: fconst_0
      // 05b: putfield nvj.aqg F
      // 05e: aload 0
      // 05f: fconst_0
      // 060: putfield nvj.wdt F
      // 063: aload 0
      // 064: fconst_1
      // 065: putfield nvj.jr8 F
      // 068: iload 2
      // 069: ifeq 147
      // 06c: goto 073
      // 06f: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 072: athrow
      // 073: fconst_1
      // 074: fload 3
      // 075: fdiv
      // 076: fstore 3
      // 077: aload 1
      // 078: getfield ll8._5i F
      // 07b: fload 3
      // 07c: fmul
      // 07d: fstore 4
      // 07f: aload 1
      // 080: getfield ll8.w5z F
      // 083: fload 3
      // 084: fmul
      // 085: fstore 5
      // 087: aload 1
      // 088: getfield ll8.yz_ F
      // 08b: fload 3
      // 08c: fmul
      // 08d: fstore 6
      // 08f: aload 1
      // 090: getfield ll8.b77 F
      // 093: f2d
      // 094: invokestatic java/lang/Math.sin (D)D
      // 097: d2f
      // 098: fstore 7
      // 09a: aload 1
      // 09b: getfield ll8.b77 F
      // 09e: f2d
      // 09f: invokestatic java/lang/Math.cos (D)D
      // 0a2: d2f
      // 0a3: fstore 8
      // 0a5: fconst_1
      // 0a6: fload 8
      // 0a8: fsub
      // 0a9: fstore 9
      // 0ab: fload 4
      // 0ad: fload 6
      // 0af: fmul
      // 0b0: fstore 10
      // 0b2: fload 4
      // 0b4: fload 5
      // 0b6: fmul
      // 0b7: fstore 11
      // 0b9: fload 5
      // 0bb: fload 6
      // 0bd: fmul
      // 0be: fstore 12
      // 0c0: aload 0
      // 0c1: fload 9
      // 0c3: fload 4
      // 0c5: fmul
      // 0c6: fload 4
      // 0c8: fmul
      // 0c9: fload 8
      // 0cb: fadd
      // 0cc: putfield nvj.i2i F
      // 0cf: aload 0
      // 0d0: fload 9
      // 0d2: fload 11
      // 0d4: fmul
      // 0d5: fload 7
      // 0d7: fload 6
      // 0d9: fmul
      // 0da: fsub
      // 0db: putfield nvj.k12 F
      // 0de: aload 0
      // 0df: fload 9
      // 0e1: fload 10
      // 0e3: fmul
      // 0e4: fload 7
      // 0e6: fload 5
      // 0e8: fmul
      // 0e9: fadd
      // 0ea: putfield nvj.xu6 F
      // 0ed: aload 0
      // 0ee: fload 9
      // 0f0: fload 11
      // 0f2: fmul
      // 0f3: fload 7
      // 0f5: fload 6
      // 0f7: fmul
      // 0f8: fadd
      // 0f9: putfield nvj._id F
      // 0fc: aload 0
      // 0fd: fload 9
      // 0ff: fload 5
      // 101: fmul
      // 102: fload 5
      // 104: fmul
      // 105: fload 8
      // 107: fadd
      // 108: putfield nvj.aoj F
      // 10b: aload 0
      // 10c: fload 9
      // 10e: fload 12
      // 110: fmul
      // 111: fload 7
      // 113: fload 4
      // 115: fmul
      // 116: fsub
      // 117: putfield nvj.zk_ F
      // 11a: aload 0
      // 11b: fload 9
      // 11d: fload 10
      // 11f: fmul
      // 120: fload 7
      // 122: fload 5
      // 124: fmul
      // 125: fsub
      // 126: putfield nvj.aqg F
      // 129: aload 0
      // 12a: fload 9
      // 12c: fload 12
      // 12e: fmul
      // 12f: fload 7
      // 131: fload 4
      // 133: fmul
      // 134: fadd
      // 135: putfield nvj.wdt F
      // 138: aload 0
      // 139: fload 9
      // 13b: fload 6
      // 13d: fmul
      // 13e: fload 6
      // 140: fmul
      // 141: fload 8
      // 143: fadd
      // 144: putfield nvj.jr8 F
      // 147: return
   }

   public final void mjc(lg5 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
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
      // 026: ldc2_w 1.0E-8
      // 029: iload 2
      // 02a: ifeq 079
      // 02d: dcmpg
      // 02e: ifge 070
      // 031: goto 038
      // 034: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 037: athrow
      // 038: aload 0
      // 039: fconst_1
      // 03a: putfield nvj.i2i F
      // 03d: aload 0
      // 03e: fconst_0
      // 03f: putfield nvj.k12 F
      // 042: aload 0
      // 043: fconst_0
      // 044: putfield nvj.xu6 F
      // 047: aload 0
      // 048: fconst_0
      // 049: putfield nvj._id F
      // 04c: aload 0
      // 04d: fconst_1
      // 04e: putfield nvj.aoj F
      // 051: aload 0
      // 052: fconst_0
      // 053: putfield nvj.zk_ F
      // 056: aload 0
      // 057: fconst_0
      // 058: putfield nvj.aqg F
      // 05b: aload 0
      // 05c: fconst_0
      // 05d: putfield nvj.wdt F
      // 060: aload 0
      // 061: fconst_1
      // 062: putfield nvj.jr8 F
      // 065: iload 2
      // 066: ifne 149
      // 069: goto 070
      // 06c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 0c5: d2f
      // 0c6: putfield nvj.i2i F
      // 0c9: aload 0
      // 0ca: dload 15
      // 0cc: dload 19
      // 0ce: dmul
      // 0cf: dload 11
      // 0d1: dload 9
      // 0d3: dmul
      // 0d4: dsub
      // 0d5: d2f
      // 0d6: putfield nvj.k12 F
      // 0d9: aload 0
      // 0da: dload 15
      // 0dc: dload 17
      // 0de: dmul
      // 0df: dload 11
      // 0e1: dload 7
      // 0e3: dmul
      // 0e4: dadd
      // 0e5: d2f
      // 0e6: putfield nvj.xu6 F
      // 0e9: aload 0
      // 0ea: dload 15
      // 0ec: dload 19
      // 0ee: dmul
      // 0ef: dload 11
      // 0f1: dload 9
      // 0f3: dmul
      // 0f4: dadd
      // 0f5: d2f
      // 0f6: putfield nvj._id F
      // 0f9: aload 0
      // 0fa: dload 15
      // 0fc: dload 7
      // 0fe: dmul
      // 0ff: dload 7
      // 101: dmul
      // 102: dload 13
      // 104: dadd
      // 105: d2f
      // 106: putfield nvj.aoj F
      // 109: aload 0
      // 10a: dload 15
      // 10c: dload 21
      // 10e: dmul
      // 10f: dload 11
      // 111: dload 5
      // 113: dmul
      // 114: dsub
      // 115: d2f
      // 116: putfield nvj.zk_ F
      // 119: aload 0
      // 11a: dload 15
      // 11c: dload 17
      // 11e: dmul
      // 11f: dload 11
      // 121: dload 7
      // 123: dmul
      // 124: dsub
      // 125: d2f
      // 126: putfield nvj.aqg F
      // 129: aload 0
      // 12a: dload 15
      // 12c: dload 21
      // 12e: dmul
      // 12f: dload 11
      // 131: dload 5
      // 133: dmul
      // 134: dadd
      // 135: d2f
      // 136: putfield nvj.wdt F
      // 139: aload 0
      // 13a: dload 15
      // 13c: dload 9
      // 13e: dmul
      // 13f: dload 9
      // 141: dmul
      // 142: dload 13
      // 144: dadd
      // 145: d2f
      // 146: putfield nvj.jr8 F
      // 149: return
   }

   public final void zpd(nbf var1) {
      this.i2i = (float)(1.0 - 2.0 * var1.pf8 * var1.pf8 - 2.0 * var1.jfe * var1.jfe);
      this._id = (float)(2.0 * (var1.yme * var1.pf8 + var1.ggc * var1.jfe));
      this.aqg = (float)(2.0 * (var1.yme * var1.jfe - var1.ggc * var1.pf8));
      this.k12 = (float)(2.0 * (var1.yme * var1.pf8 - var1.ggc * var1.jfe));
      this.aoj = (float)(1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.jfe * var1.jfe);
      this.wdt = (float)(2.0 * (var1.pf8 * var1.jfe + var1.ggc * var1.yme));
      this.xu6 = (float)(2.0 * (var1.yme * var1.jfe + var1.ggc * var1.pf8));
      this.zk_ = (float)(2.0 * (var1.pf8 * var1.jfe - var1.ggc * var1.yme));
      this.jr8 = (float)(1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.pf8 * var1.pf8);
   }

   public final void z_d(float[] var1) {
      this.i2i = var1[0];
      this.k12 = var1[1];
      this.xu6 = var1[2];
      this._id = var1[3];
      this.aoj = var1[4];
      this.zk_ = var1[5];
      this.aqg = var1[6];
      this.wdt = var1[7];
      this.jr8 = var1[8];
   }

   public final void jrw(nvj var1) {
      this.i2i = var1.i2i;
      this.k12 = var1.k12;
      this.xu6 = var1.xu6;
      this._id = var1._id;
      this.aoj = var1.aoj;
      this.zk_ = var1.zk_;
      this.aqg = var1.aqg;
      this.wdt = var1.wdt;
      this.jr8 = var1.jr8;
   }

   public final void bt0(iww var1) {
      this.i2i = (float)var1.lxb;
      this.k12 = (float)var1.y3c;
      this.xu6 = (float)var1.bhd;
      this._id = (float)var1.get;
      this.aoj = (float)var1.pwn;
      this.zk_ = (float)var1.c84;
      this.aqg = (float)var1.y7q;
      this.wdt = (float)var1._o7;
      this.jr8 = (float)var1.ffq;
   }

   public final void m7h(nvj var1) {
      this.tdb(var1);
   }

   public final void x2l() {
      this.tdb(this);
   }

   private final void tdb(nvj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic nvj.a J
      // 003: ldc2_w 67182028750080
      // 006: lxor
      // 007: lstore 2
      // 008: bipush 9
      // 00a: newarray 7
      // 00c: astore 5
      // 00e: bipush 9
      // 010: newarray 7
      // 012: astore 6
      // 014: bipush 3
      // 015: newarray 10
      // 017: astore 7
      // 019: aload 5
      // 01b: bipush 0
      // 01c: aload 1
      // 01d: getfield nvj.i2i F
      // 020: f2d
      // 021: dastore
      // 022: aload 5
      // 024: bipush 1
      // 025: aload 1
      // 026: getfield nvj.k12 F
      // 029: f2d
      // 02a: dastore
      // 02b: aload 5
      // 02d: bipush 2
      // 02e: aload 1
      // 02f: getfield nvj.xu6 F
      // 032: f2d
      // 033: dastore
      // 034: aload 5
      // 036: bipush 3
      // 037: aload 1
      // 038: getfield nvj._id F
      // 03b: f2d
      // 03c: dastore
      // 03d: aload 5
      // 03f: bipush 4
      // 040: aload 1
      // 041: getfield nvj.aoj F
      // 044: f2d
      // 045: dastore
      // 046: invokestatic OpaquePredicate.b ()I
      // 049: aload 5
      // 04b: bipush 5
      // 04c: aload 1
      // 04d: getfield nvj.zk_ F
      // 050: f2d
      // 051: dastore
      // 052: aload 5
      // 054: bipush 6
      // 056: aload 1
      // 057: getfield nvj.aqg F
      // 05a: f2d
      // 05b: dastore
      // 05c: istore 4
      // 05e: aload 5
      // 060: bipush 7
      // 062: aload 1
      // 063: getfield nvj.wdt F
      // 066: f2d
      // 067: dastore
      // 068: aload 5
      // 06a: bipush 8
      // 06c: aload 1
      // 06d: getfield nvj.jr8 F
      // 070: f2d
      // 071: dastore
      // 072: aload 5
      // 074: aload 7
      // 076: invokestatic nvj.i00 ([D[I)Z
      // 079: iload 4
      // 07b: ifeq 0a6
      // 07e: ifne 0a5
      // 081: goto 088
      // 084: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 087: athrow
      // 088: new fgk
      // 08b: dup
      // 08c: sipush 28125
      // 08f: ldc2_w 2814889164686185654
      // 092: lload 2
      // 093: lxor
      // 094: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: nop
      // 09a: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 09d: invokespecial fgk.<init> (Ljava/lang/String;)V
      // 0a0: athrow
      // 0a1: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a4: athrow
      // 0a5: bipush 0
      // 0a6: istore 8
      // 0a8: iload 8
      // 0aa: bipush 9
      // 0ac: if_icmpge 0c9
      // 0af: aload 6
      // 0b1: iload 8
      // 0b3: dconst_0
      // 0b4: dastore
      // 0b5: iinc 8 1
      // 0b8: iload 4
      // 0ba: ifeq 136
      // 0bd: iload 4
      // 0bf: ifne 0a8
      // 0c2: goto 0c9
      // 0c5: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c8: athrow
      // 0c9: aload 6
      // 0cb: bipush 0
      // 0cc: dconst_1
      // 0cd: dastore
      // 0ce: aload 6
      // 0d0: bipush 4
      // 0d1: dconst_1
      // 0d2: dastore
      // 0d3: aload 6
      // 0d5: bipush 8
      // 0d7: dconst_1
      // 0d8: dastore
      // 0d9: aload 5
      // 0db: aload 7
      // 0dd: aload 6
      // 0df: invokestatic nvj.c52 ([D[I[D)V
      // 0e2: aload 0
      // 0e3: aload 6
      // 0e5: bipush 0
      // 0e6: daload
      // 0e7: d2f
      // 0e8: putfield nvj.i2i F
      // 0eb: aload 0
      // 0ec: aload 6
      // 0ee: bipush 1
      // 0ef: daload
      // 0f0: d2f
      // 0f1: putfield nvj.k12 F
      // 0f4: aload 0
      // 0f5: aload 6
      // 0f7: bipush 2
      // 0f8: daload
      // 0f9: d2f
      // 0fa: putfield nvj.xu6 F
      // 0fd: aload 0
      // 0fe: aload 6
      // 100: bipush 3
      // 101: daload
      // 102: d2f
      // 103: putfield nvj._id F
      // 106: aload 0
      // 107: aload 6
      // 109: bipush 4
      // 10a: daload
      // 10b: d2f
      // 10c: putfield nvj.aoj F
      // 10f: aload 0
      // 110: aload 6
      // 112: bipush 5
      // 113: daload
      // 114: d2f
      // 115: putfield nvj.zk_ F
      // 118: aload 0
      // 119: aload 6
      // 11b: bipush 6
      // 11d: daload
      // 11e: d2f
      // 11f: putfield nvj.aqg F
      // 122: aload 0
      // 123: aload 6
      // 125: bipush 7
      // 127: daload
      // 128: d2f
      // 129: putfield nvj.wdt F
      // 12c: aload 0
      // 12d: aload 6
      // 12f: bipush 8
      // 131: daload
      // 132: d2f
      // 133: putfield nvj.jr8 F
      // 136: return
   }

   public static boolean i00(double[] param0, int[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic nvj.a J
      // 003: ldc2_w 61581740045933
      // 006: lxor
      // 007: lstore 2
      // 008: bipush 3
      // 009: newarray 7
      // 00b: astore 5
      // 00d: invokestatic OpaquePredicate.b ()I
      // 010: bipush 0
      // 011: istore 8
      // 013: istore 4
      // 015: bipush 0
      // 016: istore 9
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
      // 058: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05b: athrow
      // 05c: ifle 02e
      // 05f: goto 066
      // 062: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 07e: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 104: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 17a: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 1a0: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 1c1: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c4: athrow
      // 1c5: new java/lang/RuntimeException
      // 1c8: dup
      // 1c9: sipush 22838
      // 1cc: ldc2_w 1496753489545816894
      // 1cf: lload 2
      // 1d0: lxor
      // 1d1: invokedynamic i (IJ)Ljava/lang/String; bsm=nvj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: nop
      // 1d7: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 1da: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 1dd: athrow
      // 1de: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e1: athrow
      // 1e2: iload 6
      // 1e4: iload 4
      // 1e6: ifeq 25b
      // 1e9: iload 9
      // 1eb: if_icmpeq 247
      // 1ee: goto 1f5
      // 1f1: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 239: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 266: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 269: athrow
      // 26a: bipush 0
      // 26b: ireturn
      // 26c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 2bb: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2be: athrow
      // 2bf: iinc 6 1
      // 2c2: iload 4
      // 2c4: ifne 09b
      // 2c7: bipush 1
      // 2c8: ireturn
   }

   public static void c52(double[] param0, int[] param1, double[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 9
      // 003: invokestatic OpaquePredicate.c ()I
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
      // 049: ifne 0c6
      // 04c: iload 3
      // 04d: ifne 0a0
      // 050: goto 057
      // 053: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 056: athrow
      // 057: iflt 09c
      // 05a: goto 061
      // 05d: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 08e: ifne 0c0
      // 091: iload 3
      // 092: ifeq 06b
      // 095: goto 09c
      // 098: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09b: athrow
      // 09c: dload 12
      // 09e: dconst_0
      // 09f: dcmpl
      // 0a0: iload 3
      // 0a1: ifne 0b0
      // 0a4: ifeq 0b2
      // 0a7: goto 0ae
      // 0aa: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 0c1: ifeq 01a
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
      // 134: ifeq 00a
      // 137: return
   }

   public final float a23() {
      return this.i2i * (this.aoj * this.jr8 - this.zk_ * this.wdt)
         + this.k12 * (this.zk_ * this.aqg - this._id * this.jr8)
         + this.xu6 * (this._id * this.wdt - this.aoj * this.aqg);
   }

   public final void yd2(float var1) {
      this.i2i = var1;
      this.k12 = 0.0F;
      this.xu6 = 0.0F;
      this._id = 0.0F;
      this.aoj = var1;
      this.zk_ = 0.0F;
      this.aqg = 0.0F;
      this.wdt = 0.0F;
      this.jr8 = var1;
   }

   public final void w3_(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.i2i = 1.0F;
      this.k12 = 0.0F;
      this.xu6 = 0.0F;
      this._id = 0.0F;
      this.aoj = var3;
      this.zk_ = -var2;
      this.aqg = 0.0F;
      this.wdt = var2;
      this.jr8 = var3;
   }

   public final void nlz(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.i2i = var3;
      this.k12 = 0.0F;
      this.xu6 = var2;
      this._id = 0.0F;
      this.aoj = 1.0F;
      this.zk_ = 0.0F;
      this.aqg = -var2;
      this.wdt = 0.0F;
      this.jr8 = var3;
   }

   public final void aky(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.i2i = var3;
      this.k12 = -var2;
      this.xu6 = 0.0F;
      this._id = var2;
      this.aoj = var3;
      this.zk_ = 0.0F;
      this.aqg = 0.0F;
      this.wdt = 0.0F;
      this.jr8 = 1.0F;
   }

   public final void z7j(float var1) {
      this.i2i *= var1;
      this.k12 *= var1;
      this.xu6 *= var1;
      this._id *= var1;
      this.aoj *= var1;
      this.zk_ *= var1;
      this.aqg *= var1;
      this.wdt *= var1;
      this.jr8 *= var1;
   }

   public final void mnv(float var1, nvj var2) {
      this.i2i = var1 * var2.i2i;
      this.k12 = var1 * var2.k12;
      this.xu6 = var1 * var2.xu6;
      this._id = var1 * var2._id;
      this.aoj = var1 * var2.aoj;
      this.zk_ = var1 * var2.zk_;
      this.aqg = var1 * var2.aqg;
      this.wdt = var1 * var2.wdt;
      this.jr8 = var1 * var2.jr8;
   }

   public final void m9o(nvj var1) {
      float var2 = this.i2i * var1.i2i + this.k12 * var1._id + this.xu6 * var1.aqg;
      float var3 = this.i2i * var1.k12 + this.k12 * var1.aoj + this.xu6 * var1.wdt;
      float var4 = this.i2i * var1.xu6 + this.k12 * var1.zk_ + this.xu6 * var1.jr8;
      float var5 = this._id * var1.i2i + this.aoj * var1._id + this.zk_ * var1.aqg;
      float var6 = this._id * var1.k12 + this.aoj * var1.aoj + this.zk_ * var1.wdt;
      float var7 = this._id * var1.xu6 + this.aoj * var1.zk_ + this.zk_ * var1.jr8;
      float var8 = this.aqg * var1.i2i + this.wdt * var1._id + this.jr8 * var1.aqg;
      float var9 = this.aqg * var1.k12 + this.wdt * var1.aoj + this.jr8 * var1.wdt;
      float var10 = this.aqg * var1.xu6 + this.wdt * var1.zk_ + this.jr8 * var1.jr8;
      this.i2i = var2;
      this.k12 = var3;
      this.xu6 = var4;
      this._id = var5;
      this.aoj = var6;
      this.zk_ = var7;
      this.aqg = var8;
      this.wdt = var9;
      this.jr8 = var10;
   }

   public final void b63(nvj param1, nvj param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifeq 167
      // 009: aload 1
      // 00a: if_acmpeq 15f
      // 00d: goto 014
      // 010: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifeq 167
      // 019: goto 020
      // 01c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 15f
      // 024: goto 02b
      // 027: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield nvj.i2i F
      // 030: aload 2
      // 031: getfield nvj.i2i F
      // 034: fmul
      // 035: aload 1
      // 036: getfield nvj.k12 F
      // 039: aload 2
      // 03a: getfield nvj._id F
      // 03d: fmul
      // 03e: fadd
      // 03f: aload 1
      // 040: getfield nvj.xu6 F
      // 043: aload 2
      // 044: getfield nvj.aqg F
      // 047: fmul
      // 048: fadd
      // 049: putfield nvj.i2i F
      // 04c: aload 0
      // 04d: aload 1
      // 04e: getfield nvj.i2i F
      // 051: aload 2
      // 052: getfield nvj.k12 F
      // 055: fmul
      // 056: aload 1
      // 057: getfield nvj.k12 F
      // 05a: aload 2
      // 05b: getfield nvj.aoj F
      // 05e: fmul
      // 05f: fadd
      // 060: aload 1
      // 061: getfield nvj.xu6 F
      // 064: aload 2
      // 065: getfield nvj.wdt F
      // 068: fmul
      // 069: fadd
      // 06a: putfield nvj.k12 F
      // 06d: aload 0
      // 06e: aload 1
      // 06f: getfield nvj.i2i F
      // 072: aload 2
      // 073: getfield nvj.xu6 F
      // 076: fmul
      // 077: aload 1
      // 078: getfield nvj.k12 F
      // 07b: aload 2
      // 07c: getfield nvj.zk_ F
      // 07f: fmul
      // 080: fadd
      // 081: aload 1
      // 082: getfield nvj.xu6 F
      // 085: aload 2
      // 086: getfield nvj.jr8 F
      // 089: fmul
      // 08a: fadd
      // 08b: putfield nvj.xu6 F
      // 08e: aload 0
      // 08f: aload 1
      // 090: getfield nvj._id F
      // 093: aload 2
      // 094: getfield nvj.i2i F
      // 097: fmul
      // 098: aload 1
      // 099: getfield nvj.aoj F
      // 09c: aload 2
      // 09d: getfield nvj._id F
      // 0a0: fmul
      // 0a1: fadd
      // 0a2: aload 1
      // 0a3: getfield nvj.zk_ F
      // 0a6: aload 2
      // 0a7: getfield nvj.aqg F
      // 0aa: fmul
      // 0ab: fadd
      // 0ac: putfield nvj._id F
      // 0af: aload 0
      // 0b0: aload 1
      // 0b1: getfield nvj._id F
      // 0b4: aload 2
      // 0b5: getfield nvj.k12 F
      // 0b8: fmul
      // 0b9: aload 1
      // 0ba: getfield nvj.aoj F
      // 0bd: aload 2
      // 0be: getfield nvj.aoj F
      // 0c1: fmul
      // 0c2: fadd
      // 0c3: aload 1
      // 0c4: getfield nvj.zk_ F
      // 0c7: aload 2
      // 0c8: getfield nvj.wdt F
      // 0cb: fmul
      // 0cc: fadd
      // 0cd: putfield nvj.aoj F
      // 0d0: aload 0
      // 0d1: aload 1
      // 0d2: getfield nvj._id F
      // 0d5: aload 2
      // 0d6: getfield nvj.xu6 F
      // 0d9: fmul
      // 0da: aload 1
      // 0db: getfield nvj.aoj F
      // 0de: aload 2
      // 0df: getfield nvj.zk_ F
      // 0e2: fmul
      // 0e3: fadd
      // 0e4: aload 1
      // 0e5: getfield nvj.zk_ F
      // 0e8: aload 2
      // 0e9: getfield nvj.jr8 F
      // 0ec: fmul
      // 0ed: fadd
      // 0ee: putfield nvj.zk_ F
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: getfield nvj.aqg F
      // 0f6: aload 2
      // 0f7: getfield nvj.i2i F
      // 0fa: fmul
      // 0fb: aload 1
      // 0fc: getfield nvj.wdt F
      // 0ff: aload 2
      // 100: getfield nvj._id F
      // 103: fmul
      // 104: fadd
      // 105: aload 1
      // 106: getfield nvj.jr8 F
      // 109: aload 2
      // 10a: getfield nvj.aqg F
      // 10d: fmul
      // 10e: fadd
      // 10f: putfield nvj.aqg F
      // 112: aload 0
      // 113: aload 1
      // 114: getfield nvj.aqg F
      // 117: aload 2
      // 118: getfield nvj.k12 F
      // 11b: fmul
      // 11c: aload 1
      // 11d: getfield nvj.wdt F
      // 120: aload 2
      // 121: getfield nvj.aoj F
      // 124: fmul
      // 125: fadd
      // 126: aload 1
      // 127: getfield nvj.jr8 F
      // 12a: aload 2
      // 12b: getfield nvj.wdt F
      // 12e: fmul
      // 12f: fadd
      // 130: putfield nvj.wdt F
      // 133: aload 0
      // 134: aload 1
      // 135: getfield nvj.aqg F
      // 138: aload 2
      // 139: getfield nvj.xu6 F
      // 13c: fmul
      // 13d: aload 1
      // 13e: getfield nvj.wdt F
      // 141: aload 2
      // 142: getfield nvj.zk_ F
      // 145: fmul
      // 146: fadd
      // 147: aload 1
      // 148: getfield nvj.jr8 F
      // 14b: aload 2
      // 14c: getfield nvj.jr8 F
      // 14f: fmul
      // 150: fadd
      // 151: putfield nvj.jr8 F
      // 154: iload 3
      // 155: ifne 2b3
      // 158: goto 15f
      // 15b: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15e: athrow
      // 15f: aload 1
      // 160: goto 167
      // 163: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 166: athrow
      // 167: getfield nvj.i2i F
      // 16a: aload 2
      // 16b: getfield nvj.i2i F
      // 16e: fmul
      // 16f: aload 1
      // 170: getfield nvj.k12 F
      // 173: aload 2
      // 174: getfield nvj._id F
      // 177: fmul
      // 178: fadd
      // 179: aload 1
      // 17a: getfield nvj.xu6 F
      // 17d: aload 2
      // 17e: getfield nvj.aqg F
      // 181: fmul
      // 182: fadd
      // 183: fstore 4
      // 185: aload 1
      // 186: getfield nvj.i2i F
      // 189: aload 2
      // 18a: getfield nvj.k12 F
      // 18d: fmul
      // 18e: aload 1
      // 18f: getfield nvj.k12 F
      // 192: aload 2
      // 193: getfield nvj.aoj F
      // 196: fmul
      // 197: fadd
      // 198: aload 1
      // 199: getfield nvj.xu6 F
      // 19c: aload 2
      // 19d: getfield nvj.wdt F
      // 1a0: fmul
      // 1a1: fadd
      // 1a2: fstore 5
      // 1a4: aload 1
      // 1a5: getfield nvj.i2i F
      // 1a8: aload 2
      // 1a9: getfield nvj.xu6 F
      // 1ac: fmul
      // 1ad: aload 1
      // 1ae: getfield nvj.k12 F
      // 1b1: aload 2
      // 1b2: getfield nvj.zk_ F
      // 1b5: fmul
      // 1b6: fadd
      // 1b7: aload 1
      // 1b8: getfield nvj.xu6 F
      // 1bb: aload 2
      // 1bc: getfield nvj.jr8 F
      // 1bf: fmul
      // 1c0: fadd
      // 1c1: fstore 6
      // 1c3: aload 1
      // 1c4: getfield nvj._id F
      // 1c7: aload 2
      // 1c8: getfield nvj.i2i F
      // 1cb: fmul
      // 1cc: aload 1
      // 1cd: getfield nvj.aoj F
      // 1d0: aload 2
      // 1d1: getfield nvj._id F
      // 1d4: fmul
      // 1d5: fadd
      // 1d6: aload 1
      // 1d7: getfield nvj.zk_ F
      // 1da: aload 2
      // 1db: getfield nvj.aqg F
      // 1de: fmul
      // 1df: fadd
      // 1e0: fstore 7
      // 1e2: aload 1
      // 1e3: getfield nvj._id F
      // 1e6: aload 2
      // 1e7: getfield nvj.k12 F
      // 1ea: fmul
      // 1eb: aload 1
      // 1ec: getfield nvj.aoj F
      // 1ef: aload 2
      // 1f0: getfield nvj.aoj F
      // 1f3: fmul
      // 1f4: fadd
      // 1f5: aload 1
      // 1f6: getfield nvj.zk_ F
      // 1f9: aload 2
      // 1fa: getfield nvj.wdt F
      // 1fd: fmul
      // 1fe: fadd
      // 1ff: fstore 8
      // 201: aload 1
      // 202: getfield nvj._id F
      // 205: aload 2
      // 206: getfield nvj.xu6 F
      // 209: fmul
      // 20a: aload 1
      // 20b: getfield nvj.aoj F
      // 20e: aload 2
      // 20f: getfield nvj.zk_ F
      // 212: fmul
      // 213: fadd
      // 214: aload 1
      // 215: getfield nvj.zk_ F
      // 218: aload 2
      // 219: getfield nvj.jr8 F
      // 21c: fmul
      // 21d: fadd
      // 21e: fstore 9
      // 220: aload 1
      // 221: getfield nvj.aqg F
      // 224: aload 2
      // 225: getfield nvj.i2i F
      // 228: fmul
      // 229: aload 1
      // 22a: getfield nvj.wdt F
      // 22d: aload 2
      // 22e: getfield nvj._id F
      // 231: fmul
      // 232: fadd
      // 233: aload 1
      // 234: getfield nvj.jr8 F
      // 237: aload 2
      // 238: getfield nvj.aqg F
      // 23b: fmul
      // 23c: fadd
      // 23d: fstore 10
      // 23f: aload 1
      // 240: getfield nvj.aqg F
      // 243: aload 2
      // 244: getfield nvj.k12 F
      // 247: fmul
      // 248: aload 1
      // 249: getfield nvj.wdt F
      // 24c: aload 2
      // 24d: getfield nvj.aoj F
      // 250: fmul
      // 251: fadd
      // 252: aload 1
      // 253: getfield nvj.jr8 F
      // 256: aload 2
      // 257: getfield nvj.wdt F
      // 25a: fmul
      // 25b: fadd
      // 25c: fstore 11
      // 25e: aload 1
      // 25f: getfield nvj.aqg F
      // 262: aload 2
      // 263: getfield nvj.xu6 F
      // 266: fmul
      // 267: aload 1
      // 268: getfield nvj.wdt F
      // 26b: aload 2
      // 26c: getfield nvj.zk_ F
      // 26f: fmul
      // 270: fadd
      // 271: aload 1
      // 272: getfield nvj.jr8 F
      // 275: aload 2
      // 276: getfield nvj.jr8 F
      // 279: fmul
      // 27a: fadd
      // 27b: fstore 12
      // 27d: aload 0
      // 27e: fload 4
      // 280: putfield nvj.i2i F
      // 283: aload 0
      // 284: fload 5
      // 286: putfield nvj.k12 F
      // 289: aload 0
      // 28a: fload 6
      // 28c: putfield nvj.xu6 F
      // 28f: aload 0
      // 290: fload 7
      // 292: putfield nvj._id F
      // 295: aload 0
      // 296: fload 8
      // 298: putfield nvj.aoj F
      // 29b: aload 0
      // 29c: fload 9
      // 29e: putfield nvj.zk_ F
      // 2a1: aload 0
      // 2a2: fload 10
      // 2a4: putfield nvj.aqg F
      // 2a7: aload 0
      // 2a8: fload 11
      // 2aa: putfield nvj.wdt F
      // 2ad: aload 0
      // 2ae: fload 12
      // 2b0: putfield nvj.jr8 F
      // 2b3: return
   }

   public final void irz(nvj var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      var2[0] = (double)(this.i2i * var1.i2i + this.k12 * var1._id + this.xu6 * var1.aqg);
      var2[1] = (double)(this.i2i * var1.k12 + this.k12 * var1.aoj + this.xu6 * var1.wdt);
      var2[2] = (double)(this.i2i * var1.xu6 + this.k12 * var1.zk_ + this.xu6 * var1.jr8);
      var2[3] = (double)(this._id * var1.i2i + this.aoj * var1._id + this.zk_ * var1.aqg);
      var2[4] = (double)(this._id * var1.k12 + this.aoj * var1.aoj + this.zk_ * var1.wdt);
      var2[5] = (double)(this._id * var1.xu6 + this.aoj * var1.zk_ + this.zk_ * var1.jr8);
      var2[6] = (double)(this.aqg * var1.i2i + this.wdt * var1._id + this.jr8 * var1.aqg);
      var2[7] = (double)(this.aqg * var1.k12 + this.wdt * var1.aoj + this.jr8 * var1.wdt);
      var2[8] = (double)(this.aqg * var1.xu6 + this.wdt * var1.zk_ + this.jr8 * var1.jr8);
      iww.d20(var2, var4, var3);
      this.i2i = (float)var3[0];
      this.k12 = (float)var3[1];
      this.xu6 = (float)var3[2];
      this._id = (float)var3[3];
      this.aoj = (float)var3[4];
      this.zk_ = (float)var3[5];
      this.aqg = (float)var3[6];
      this.wdt = (float)var3[7];
      this.jr8 = (float)var3[8];
   }

   public final void f19(nvj var1, nvj var2) {
      double[] var3 = new double[9];
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      var3[0] = (double)(var1.i2i * var2.i2i + var1.k12 * var2._id + var1.xu6 * var2.aqg);
      var3[1] = (double)(var1.i2i * var2.k12 + var1.k12 * var2.aoj + var1.xu6 * var2.wdt);
      var3[2] = (double)(var1.i2i * var2.xu6 + var1.k12 * var2.zk_ + var1.xu6 * var2.jr8);
      var3[3] = (double)(var1._id * var2.i2i + var1.aoj * var2._id + var1.zk_ * var2.aqg);
      var3[4] = (double)(var1._id * var2.k12 + var1.aoj * var2.aoj + var1.zk_ * var2.wdt);
      var3[5] = (double)(var1._id * var2.xu6 + var1.aoj * var2.zk_ + var1.zk_ * var2.jr8);
      var3[6] = (double)(var1.aqg * var2.i2i + var1.wdt * var2._id + var1.jr8 * var2.aqg);
      var3[7] = (double)(var1.aqg * var2.k12 + var1.wdt * var2.aoj + var1.jr8 * var2.wdt);
      var3[8] = (double)(var1.aqg * var2.xu6 + var1.wdt * var2.zk_ + var1.jr8 * var2.jr8);
      iww.d20(var3, var5, var4);
      this.i2i = (float)var4[0];
      this.k12 = (float)var4[1];
      this.xu6 = (float)var4[2];
      this._id = (float)var4[3];
      this.aoj = (float)var4[4];
      this.zk_ = (float)var4[5];
      this.aqg = (float)var4[6];
      this.wdt = (float)var4[7];
      this.jr8 = (float)var4[8];
   }

   public final void zy2(nvj param1, nvj param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 167
      // 009: aload 1
      // 00a: if_acmpeq 15f
      // 00d: goto 014
      // 010: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifne 167
      // 019: goto 020
      // 01c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 15f
      // 024: goto 02b
      // 027: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield nvj.i2i F
      // 030: aload 2
      // 031: getfield nvj.i2i F
      // 034: fmul
      // 035: aload 1
      // 036: getfield nvj._id F
      // 039: aload 2
      // 03a: getfield nvj.k12 F
      // 03d: fmul
      // 03e: fadd
      // 03f: aload 1
      // 040: getfield nvj.aqg F
      // 043: aload 2
      // 044: getfield nvj.xu6 F
      // 047: fmul
      // 048: fadd
      // 049: putfield nvj.i2i F
      // 04c: aload 0
      // 04d: aload 1
      // 04e: getfield nvj.i2i F
      // 051: aload 2
      // 052: getfield nvj._id F
      // 055: fmul
      // 056: aload 1
      // 057: getfield nvj._id F
      // 05a: aload 2
      // 05b: getfield nvj.aoj F
      // 05e: fmul
      // 05f: fadd
      // 060: aload 1
      // 061: getfield nvj.aqg F
      // 064: aload 2
      // 065: getfield nvj.zk_ F
      // 068: fmul
      // 069: fadd
      // 06a: putfield nvj.k12 F
      // 06d: aload 0
      // 06e: aload 1
      // 06f: getfield nvj.i2i F
      // 072: aload 2
      // 073: getfield nvj.aqg F
      // 076: fmul
      // 077: aload 1
      // 078: getfield nvj._id F
      // 07b: aload 2
      // 07c: getfield nvj.wdt F
      // 07f: fmul
      // 080: fadd
      // 081: aload 1
      // 082: getfield nvj.aqg F
      // 085: aload 2
      // 086: getfield nvj.jr8 F
      // 089: fmul
      // 08a: fadd
      // 08b: putfield nvj.xu6 F
      // 08e: aload 0
      // 08f: aload 1
      // 090: getfield nvj.k12 F
      // 093: aload 2
      // 094: getfield nvj.i2i F
      // 097: fmul
      // 098: aload 1
      // 099: getfield nvj.aoj F
      // 09c: aload 2
      // 09d: getfield nvj.k12 F
      // 0a0: fmul
      // 0a1: fadd
      // 0a2: aload 1
      // 0a3: getfield nvj.wdt F
      // 0a6: aload 2
      // 0a7: getfield nvj.xu6 F
      // 0aa: fmul
      // 0ab: fadd
      // 0ac: putfield nvj._id F
      // 0af: aload 0
      // 0b0: aload 1
      // 0b1: getfield nvj.k12 F
      // 0b4: aload 2
      // 0b5: getfield nvj._id F
      // 0b8: fmul
      // 0b9: aload 1
      // 0ba: getfield nvj.aoj F
      // 0bd: aload 2
      // 0be: getfield nvj.aoj F
      // 0c1: fmul
      // 0c2: fadd
      // 0c3: aload 1
      // 0c4: getfield nvj.wdt F
      // 0c7: aload 2
      // 0c8: getfield nvj.zk_ F
      // 0cb: fmul
      // 0cc: fadd
      // 0cd: putfield nvj.aoj F
      // 0d0: aload 0
      // 0d1: aload 1
      // 0d2: getfield nvj.k12 F
      // 0d5: aload 2
      // 0d6: getfield nvj.aqg F
      // 0d9: fmul
      // 0da: aload 1
      // 0db: getfield nvj.aoj F
      // 0de: aload 2
      // 0df: getfield nvj.wdt F
      // 0e2: fmul
      // 0e3: fadd
      // 0e4: aload 1
      // 0e5: getfield nvj.wdt F
      // 0e8: aload 2
      // 0e9: getfield nvj.jr8 F
      // 0ec: fmul
      // 0ed: fadd
      // 0ee: putfield nvj.zk_ F
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: getfield nvj.xu6 F
      // 0f6: aload 2
      // 0f7: getfield nvj.i2i F
      // 0fa: fmul
      // 0fb: aload 1
      // 0fc: getfield nvj.zk_ F
      // 0ff: aload 2
      // 100: getfield nvj.k12 F
      // 103: fmul
      // 104: fadd
      // 105: aload 1
      // 106: getfield nvj.jr8 F
      // 109: aload 2
      // 10a: getfield nvj.xu6 F
      // 10d: fmul
      // 10e: fadd
      // 10f: putfield nvj.aqg F
      // 112: aload 0
      // 113: aload 1
      // 114: getfield nvj.xu6 F
      // 117: aload 2
      // 118: getfield nvj._id F
      // 11b: fmul
      // 11c: aload 1
      // 11d: getfield nvj.zk_ F
      // 120: aload 2
      // 121: getfield nvj.aoj F
      // 124: fmul
      // 125: fadd
      // 126: aload 1
      // 127: getfield nvj.jr8 F
      // 12a: aload 2
      // 12b: getfield nvj.zk_ F
      // 12e: fmul
      // 12f: fadd
      // 130: putfield nvj.wdt F
      // 133: aload 0
      // 134: aload 1
      // 135: getfield nvj.xu6 F
      // 138: aload 2
      // 139: getfield nvj.aqg F
      // 13c: fmul
      // 13d: aload 1
      // 13e: getfield nvj.zk_ F
      // 141: aload 2
      // 142: getfield nvj.wdt F
      // 145: fmul
      // 146: fadd
      // 147: aload 1
      // 148: getfield nvj.jr8 F
      // 14b: aload 2
      // 14c: getfield nvj.jr8 F
      // 14f: fmul
      // 150: fadd
      // 151: putfield nvj.jr8 F
      // 154: iload 3
      // 155: ifeq 2b3
      // 158: goto 15f
      // 15b: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15e: athrow
      // 15f: aload 1
      // 160: goto 167
      // 163: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 166: athrow
      // 167: getfield nvj.i2i F
      // 16a: aload 2
      // 16b: getfield nvj.i2i F
      // 16e: fmul
      // 16f: aload 1
      // 170: getfield nvj._id F
      // 173: aload 2
      // 174: getfield nvj.k12 F
      // 177: fmul
      // 178: fadd
      // 179: aload 1
      // 17a: getfield nvj.aqg F
      // 17d: aload 2
      // 17e: getfield nvj.xu6 F
      // 181: fmul
      // 182: fadd
      // 183: fstore 4
      // 185: aload 1
      // 186: getfield nvj.i2i F
      // 189: aload 2
      // 18a: getfield nvj._id F
      // 18d: fmul
      // 18e: aload 1
      // 18f: getfield nvj._id F
      // 192: aload 2
      // 193: getfield nvj.aoj F
      // 196: fmul
      // 197: fadd
      // 198: aload 1
      // 199: getfield nvj.aqg F
      // 19c: aload 2
      // 19d: getfield nvj.zk_ F
      // 1a0: fmul
      // 1a1: fadd
      // 1a2: fstore 5
      // 1a4: aload 1
      // 1a5: getfield nvj.i2i F
      // 1a8: aload 2
      // 1a9: getfield nvj.aqg F
      // 1ac: fmul
      // 1ad: aload 1
      // 1ae: getfield nvj._id F
      // 1b1: aload 2
      // 1b2: getfield nvj.wdt F
      // 1b5: fmul
      // 1b6: fadd
      // 1b7: aload 1
      // 1b8: getfield nvj.aqg F
      // 1bb: aload 2
      // 1bc: getfield nvj.jr8 F
      // 1bf: fmul
      // 1c0: fadd
      // 1c1: fstore 6
      // 1c3: aload 1
      // 1c4: getfield nvj.k12 F
      // 1c7: aload 2
      // 1c8: getfield nvj.i2i F
      // 1cb: fmul
      // 1cc: aload 1
      // 1cd: getfield nvj.aoj F
      // 1d0: aload 2
      // 1d1: getfield nvj.k12 F
      // 1d4: fmul
      // 1d5: fadd
      // 1d6: aload 1
      // 1d7: getfield nvj.wdt F
      // 1da: aload 2
      // 1db: getfield nvj.xu6 F
      // 1de: fmul
      // 1df: fadd
      // 1e0: fstore 7
      // 1e2: aload 1
      // 1e3: getfield nvj.k12 F
      // 1e6: aload 2
      // 1e7: getfield nvj._id F
      // 1ea: fmul
      // 1eb: aload 1
      // 1ec: getfield nvj.aoj F
      // 1ef: aload 2
      // 1f0: getfield nvj.aoj F
      // 1f3: fmul
      // 1f4: fadd
      // 1f5: aload 1
      // 1f6: getfield nvj.wdt F
      // 1f9: aload 2
      // 1fa: getfield nvj.zk_ F
      // 1fd: fmul
      // 1fe: fadd
      // 1ff: fstore 8
      // 201: aload 1
      // 202: getfield nvj.k12 F
      // 205: aload 2
      // 206: getfield nvj.aqg F
      // 209: fmul
      // 20a: aload 1
      // 20b: getfield nvj.aoj F
      // 20e: aload 2
      // 20f: getfield nvj.wdt F
      // 212: fmul
      // 213: fadd
      // 214: aload 1
      // 215: getfield nvj.wdt F
      // 218: aload 2
      // 219: getfield nvj.jr8 F
      // 21c: fmul
      // 21d: fadd
      // 21e: fstore 9
      // 220: aload 1
      // 221: getfield nvj.xu6 F
      // 224: aload 2
      // 225: getfield nvj.i2i F
      // 228: fmul
      // 229: aload 1
      // 22a: getfield nvj.zk_ F
      // 22d: aload 2
      // 22e: getfield nvj.k12 F
      // 231: fmul
      // 232: fadd
      // 233: aload 1
      // 234: getfield nvj.jr8 F
      // 237: aload 2
      // 238: getfield nvj.xu6 F
      // 23b: fmul
      // 23c: fadd
      // 23d: fstore 10
      // 23f: aload 1
      // 240: getfield nvj.xu6 F
      // 243: aload 2
      // 244: getfield nvj._id F
      // 247: fmul
      // 248: aload 1
      // 249: getfield nvj.zk_ F
      // 24c: aload 2
      // 24d: getfield nvj.aoj F
      // 250: fmul
      // 251: fadd
      // 252: aload 1
      // 253: getfield nvj.jr8 F
      // 256: aload 2
      // 257: getfield nvj.zk_ F
      // 25a: fmul
      // 25b: fadd
      // 25c: fstore 11
      // 25e: aload 1
      // 25f: getfield nvj.xu6 F
      // 262: aload 2
      // 263: getfield nvj.aqg F
      // 266: fmul
      // 267: aload 1
      // 268: getfield nvj.zk_ F
      // 26b: aload 2
      // 26c: getfield nvj.wdt F
      // 26f: fmul
      // 270: fadd
      // 271: aload 1
      // 272: getfield nvj.jr8 F
      // 275: aload 2
      // 276: getfield nvj.jr8 F
      // 279: fmul
      // 27a: fadd
      // 27b: fstore 12
      // 27d: aload 0
      // 27e: fload 4
      // 280: putfield nvj.i2i F
      // 283: aload 0
      // 284: fload 5
      // 286: putfield nvj.k12 F
      // 289: aload 0
      // 28a: fload 6
      // 28c: putfield nvj.xu6 F
      // 28f: aload 0
      // 290: fload 7
      // 292: putfield nvj._id F
      // 295: aload 0
      // 296: fload 8
      // 298: putfield nvj.aoj F
      // 29b: aload 0
      // 29c: fload 9
      // 29e: putfield nvj.zk_ F
      // 2a1: aload 0
      // 2a2: fload 10
      // 2a4: putfield nvj.aqg F
      // 2a7: aload 0
      // 2a8: fload 11
      // 2aa: putfield nvj.wdt F
      // 2ad: aload 0
      // 2ae: fload 12
      // 2b0: putfield nvj.jr8 F
      // 2b3: return
   }

   public final void fhl(nvj param1, nvj param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifeq 167
      // 009: aload 1
      // 00a: if_acmpeq 15f
      // 00d: goto 014
      // 010: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifeq 167
      // 019: goto 020
      // 01c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 15f
      // 024: goto 02b
      // 027: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield nvj.i2i F
      // 030: aload 2
      // 031: getfield nvj.i2i F
      // 034: fmul
      // 035: aload 1
      // 036: getfield nvj.k12 F
      // 039: aload 2
      // 03a: getfield nvj.k12 F
      // 03d: fmul
      // 03e: fadd
      // 03f: aload 1
      // 040: getfield nvj.xu6 F
      // 043: aload 2
      // 044: getfield nvj.xu6 F
      // 047: fmul
      // 048: fadd
      // 049: putfield nvj.i2i F
      // 04c: aload 0
      // 04d: aload 1
      // 04e: getfield nvj.i2i F
      // 051: aload 2
      // 052: getfield nvj._id F
      // 055: fmul
      // 056: aload 1
      // 057: getfield nvj.k12 F
      // 05a: aload 2
      // 05b: getfield nvj.aoj F
      // 05e: fmul
      // 05f: fadd
      // 060: aload 1
      // 061: getfield nvj.xu6 F
      // 064: aload 2
      // 065: getfield nvj.zk_ F
      // 068: fmul
      // 069: fadd
      // 06a: putfield nvj.k12 F
      // 06d: aload 0
      // 06e: aload 1
      // 06f: getfield nvj.i2i F
      // 072: aload 2
      // 073: getfield nvj.aqg F
      // 076: fmul
      // 077: aload 1
      // 078: getfield nvj.k12 F
      // 07b: aload 2
      // 07c: getfield nvj.wdt F
      // 07f: fmul
      // 080: fadd
      // 081: aload 1
      // 082: getfield nvj.xu6 F
      // 085: aload 2
      // 086: getfield nvj.jr8 F
      // 089: fmul
      // 08a: fadd
      // 08b: putfield nvj.xu6 F
      // 08e: aload 0
      // 08f: aload 1
      // 090: getfield nvj._id F
      // 093: aload 2
      // 094: getfield nvj.i2i F
      // 097: fmul
      // 098: aload 1
      // 099: getfield nvj.aoj F
      // 09c: aload 2
      // 09d: getfield nvj.k12 F
      // 0a0: fmul
      // 0a1: fadd
      // 0a2: aload 1
      // 0a3: getfield nvj.zk_ F
      // 0a6: aload 2
      // 0a7: getfield nvj.xu6 F
      // 0aa: fmul
      // 0ab: fadd
      // 0ac: putfield nvj._id F
      // 0af: aload 0
      // 0b0: aload 1
      // 0b1: getfield nvj._id F
      // 0b4: aload 2
      // 0b5: getfield nvj._id F
      // 0b8: fmul
      // 0b9: aload 1
      // 0ba: getfield nvj.aoj F
      // 0bd: aload 2
      // 0be: getfield nvj.aoj F
      // 0c1: fmul
      // 0c2: fadd
      // 0c3: aload 1
      // 0c4: getfield nvj.zk_ F
      // 0c7: aload 2
      // 0c8: getfield nvj.zk_ F
      // 0cb: fmul
      // 0cc: fadd
      // 0cd: putfield nvj.aoj F
      // 0d0: aload 0
      // 0d1: aload 1
      // 0d2: getfield nvj._id F
      // 0d5: aload 2
      // 0d6: getfield nvj.aqg F
      // 0d9: fmul
      // 0da: aload 1
      // 0db: getfield nvj.aoj F
      // 0de: aload 2
      // 0df: getfield nvj.wdt F
      // 0e2: fmul
      // 0e3: fadd
      // 0e4: aload 1
      // 0e5: getfield nvj.zk_ F
      // 0e8: aload 2
      // 0e9: getfield nvj.jr8 F
      // 0ec: fmul
      // 0ed: fadd
      // 0ee: putfield nvj.zk_ F
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: getfield nvj.aqg F
      // 0f6: aload 2
      // 0f7: getfield nvj.i2i F
      // 0fa: fmul
      // 0fb: aload 1
      // 0fc: getfield nvj.wdt F
      // 0ff: aload 2
      // 100: getfield nvj.k12 F
      // 103: fmul
      // 104: fadd
      // 105: aload 1
      // 106: getfield nvj.jr8 F
      // 109: aload 2
      // 10a: getfield nvj.xu6 F
      // 10d: fmul
      // 10e: fadd
      // 10f: putfield nvj.aqg F
      // 112: aload 0
      // 113: aload 1
      // 114: getfield nvj.aqg F
      // 117: aload 2
      // 118: getfield nvj._id F
      // 11b: fmul
      // 11c: aload 1
      // 11d: getfield nvj.wdt F
      // 120: aload 2
      // 121: getfield nvj.aoj F
      // 124: fmul
      // 125: fadd
      // 126: aload 1
      // 127: getfield nvj.jr8 F
      // 12a: aload 2
      // 12b: getfield nvj.zk_ F
      // 12e: fmul
      // 12f: fadd
      // 130: putfield nvj.wdt F
      // 133: aload 0
      // 134: aload 1
      // 135: getfield nvj.aqg F
      // 138: aload 2
      // 139: getfield nvj.aqg F
      // 13c: fmul
      // 13d: aload 1
      // 13e: getfield nvj.wdt F
      // 141: aload 2
      // 142: getfield nvj.wdt F
      // 145: fmul
      // 146: fadd
      // 147: aload 1
      // 148: getfield nvj.jr8 F
      // 14b: aload 2
      // 14c: getfield nvj.jr8 F
      // 14f: fmul
      // 150: fadd
      // 151: putfield nvj.jr8 F
      // 154: iload 3
      // 155: ifne 2b3
      // 158: goto 15f
      // 15b: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15e: athrow
      // 15f: aload 1
      // 160: goto 167
      // 163: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 166: athrow
      // 167: getfield nvj.i2i F
      // 16a: aload 2
      // 16b: getfield nvj.i2i F
      // 16e: fmul
      // 16f: aload 1
      // 170: getfield nvj.k12 F
      // 173: aload 2
      // 174: getfield nvj.k12 F
      // 177: fmul
      // 178: fadd
      // 179: aload 1
      // 17a: getfield nvj.xu6 F
      // 17d: aload 2
      // 17e: getfield nvj.xu6 F
      // 181: fmul
      // 182: fadd
      // 183: fstore 4
      // 185: aload 1
      // 186: getfield nvj.i2i F
      // 189: aload 2
      // 18a: getfield nvj._id F
      // 18d: fmul
      // 18e: aload 1
      // 18f: getfield nvj.k12 F
      // 192: aload 2
      // 193: getfield nvj.aoj F
      // 196: fmul
      // 197: fadd
      // 198: aload 1
      // 199: getfield nvj.xu6 F
      // 19c: aload 2
      // 19d: getfield nvj.zk_ F
      // 1a0: fmul
      // 1a1: fadd
      // 1a2: fstore 5
      // 1a4: aload 1
      // 1a5: getfield nvj.i2i F
      // 1a8: aload 2
      // 1a9: getfield nvj.aqg F
      // 1ac: fmul
      // 1ad: aload 1
      // 1ae: getfield nvj.k12 F
      // 1b1: aload 2
      // 1b2: getfield nvj.wdt F
      // 1b5: fmul
      // 1b6: fadd
      // 1b7: aload 1
      // 1b8: getfield nvj.xu6 F
      // 1bb: aload 2
      // 1bc: getfield nvj.jr8 F
      // 1bf: fmul
      // 1c0: fadd
      // 1c1: fstore 6
      // 1c3: aload 1
      // 1c4: getfield nvj._id F
      // 1c7: aload 2
      // 1c8: getfield nvj.i2i F
      // 1cb: fmul
      // 1cc: aload 1
      // 1cd: getfield nvj.aoj F
      // 1d0: aload 2
      // 1d1: getfield nvj.k12 F
      // 1d4: fmul
      // 1d5: fadd
      // 1d6: aload 1
      // 1d7: getfield nvj.zk_ F
      // 1da: aload 2
      // 1db: getfield nvj.xu6 F
      // 1de: fmul
      // 1df: fadd
      // 1e0: fstore 7
      // 1e2: aload 1
      // 1e3: getfield nvj._id F
      // 1e6: aload 2
      // 1e7: getfield nvj._id F
      // 1ea: fmul
      // 1eb: aload 1
      // 1ec: getfield nvj.aoj F
      // 1ef: aload 2
      // 1f0: getfield nvj.aoj F
      // 1f3: fmul
      // 1f4: fadd
      // 1f5: aload 1
      // 1f6: getfield nvj.zk_ F
      // 1f9: aload 2
      // 1fa: getfield nvj.zk_ F
      // 1fd: fmul
      // 1fe: fadd
      // 1ff: fstore 8
      // 201: aload 1
      // 202: getfield nvj._id F
      // 205: aload 2
      // 206: getfield nvj.aqg F
      // 209: fmul
      // 20a: aload 1
      // 20b: getfield nvj.aoj F
      // 20e: aload 2
      // 20f: getfield nvj.wdt F
      // 212: fmul
      // 213: fadd
      // 214: aload 1
      // 215: getfield nvj.zk_ F
      // 218: aload 2
      // 219: getfield nvj.jr8 F
      // 21c: fmul
      // 21d: fadd
      // 21e: fstore 9
      // 220: aload 1
      // 221: getfield nvj.aqg F
      // 224: aload 2
      // 225: getfield nvj.i2i F
      // 228: fmul
      // 229: aload 1
      // 22a: getfield nvj.wdt F
      // 22d: aload 2
      // 22e: getfield nvj.k12 F
      // 231: fmul
      // 232: fadd
      // 233: aload 1
      // 234: getfield nvj.jr8 F
      // 237: aload 2
      // 238: getfield nvj.xu6 F
      // 23b: fmul
      // 23c: fadd
      // 23d: fstore 10
      // 23f: aload 1
      // 240: getfield nvj.aqg F
      // 243: aload 2
      // 244: getfield nvj._id F
      // 247: fmul
      // 248: aload 1
      // 249: getfield nvj.wdt F
      // 24c: aload 2
      // 24d: getfield nvj.aoj F
      // 250: fmul
      // 251: fadd
      // 252: aload 1
      // 253: getfield nvj.jr8 F
      // 256: aload 2
      // 257: getfield nvj.zk_ F
      // 25a: fmul
      // 25b: fadd
      // 25c: fstore 11
      // 25e: aload 1
      // 25f: getfield nvj.aqg F
      // 262: aload 2
      // 263: getfield nvj.aqg F
      // 266: fmul
      // 267: aload 1
      // 268: getfield nvj.wdt F
      // 26b: aload 2
      // 26c: getfield nvj.wdt F
      // 26f: fmul
      // 270: fadd
      // 271: aload 1
      // 272: getfield nvj.jr8 F
      // 275: aload 2
      // 276: getfield nvj.jr8 F
      // 279: fmul
      // 27a: fadd
      // 27b: fstore 12
      // 27d: aload 0
      // 27e: fload 4
      // 280: putfield nvj.i2i F
      // 283: aload 0
      // 284: fload 5
      // 286: putfield nvj.k12 F
      // 289: aload 0
      // 28a: fload 6
      // 28c: putfield nvj.xu6 F
      // 28f: aload 0
      // 290: fload 7
      // 292: putfield nvj._id F
      // 295: aload 0
      // 296: fload 8
      // 298: putfield nvj.aoj F
      // 29b: aload 0
      // 29c: fload 9
      // 29e: putfield nvj.zk_ F
      // 2a1: aload 0
      // 2a2: fload 10
      // 2a4: putfield nvj.aqg F
      // 2a7: aload 0
      // 2a8: fload 11
      // 2aa: putfield nvj.wdt F
      // 2ad: aload 0
      // 2ae: fload 12
      // 2b0: putfield nvj.jr8 F
      // 2b3: return
   }

   public final void ud5(nvj param1, nvj param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifeq 167
      // 009: aload 1
      // 00a: if_acmpeq 15f
      // 00d: goto 014
      // 010: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifeq 167
      // 019: goto 020
      // 01c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 15f
      // 024: goto 02b
      // 027: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield nvj.i2i F
      // 030: aload 2
      // 031: getfield nvj.i2i F
      // 034: fmul
      // 035: aload 1
      // 036: getfield nvj._id F
      // 039: aload 2
      // 03a: getfield nvj._id F
      // 03d: fmul
      // 03e: fadd
      // 03f: aload 1
      // 040: getfield nvj.aqg F
      // 043: aload 2
      // 044: getfield nvj.aqg F
      // 047: fmul
      // 048: fadd
      // 049: putfield nvj.i2i F
      // 04c: aload 0
      // 04d: aload 1
      // 04e: getfield nvj.i2i F
      // 051: aload 2
      // 052: getfield nvj.k12 F
      // 055: fmul
      // 056: aload 1
      // 057: getfield nvj._id F
      // 05a: aload 2
      // 05b: getfield nvj.aoj F
      // 05e: fmul
      // 05f: fadd
      // 060: aload 1
      // 061: getfield nvj.aqg F
      // 064: aload 2
      // 065: getfield nvj.wdt F
      // 068: fmul
      // 069: fadd
      // 06a: putfield nvj.k12 F
      // 06d: aload 0
      // 06e: aload 1
      // 06f: getfield nvj.i2i F
      // 072: aload 2
      // 073: getfield nvj.xu6 F
      // 076: fmul
      // 077: aload 1
      // 078: getfield nvj._id F
      // 07b: aload 2
      // 07c: getfield nvj.zk_ F
      // 07f: fmul
      // 080: fadd
      // 081: aload 1
      // 082: getfield nvj.aqg F
      // 085: aload 2
      // 086: getfield nvj.jr8 F
      // 089: fmul
      // 08a: fadd
      // 08b: putfield nvj.xu6 F
      // 08e: aload 0
      // 08f: aload 1
      // 090: getfield nvj.k12 F
      // 093: aload 2
      // 094: getfield nvj.i2i F
      // 097: fmul
      // 098: aload 1
      // 099: getfield nvj.aoj F
      // 09c: aload 2
      // 09d: getfield nvj._id F
      // 0a0: fmul
      // 0a1: fadd
      // 0a2: aload 1
      // 0a3: getfield nvj.wdt F
      // 0a6: aload 2
      // 0a7: getfield nvj.aqg F
      // 0aa: fmul
      // 0ab: fadd
      // 0ac: putfield nvj._id F
      // 0af: aload 0
      // 0b0: aload 1
      // 0b1: getfield nvj.k12 F
      // 0b4: aload 2
      // 0b5: getfield nvj.k12 F
      // 0b8: fmul
      // 0b9: aload 1
      // 0ba: getfield nvj.aoj F
      // 0bd: aload 2
      // 0be: getfield nvj.aoj F
      // 0c1: fmul
      // 0c2: fadd
      // 0c3: aload 1
      // 0c4: getfield nvj.wdt F
      // 0c7: aload 2
      // 0c8: getfield nvj.wdt F
      // 0cb: fmul
      // 0cc: fadd
      // 0cd: putfield nvj.aoj F
      // 0d0: aload 0
      // 0d1: aload 1
      // 0d2: getfield nvj.k12 F
      // 0d5: aload 2
      // 0d6: getfield nvj.xu6 F
      // 0d9: fmul
      // 0da: aload 1
      // 0db: getfield nvj.aoj F
      // 0de: aload 2
      // 0df: getfield nvj.zk_ F
      // 0e2: fmul
      // 0e3: fadd
      // 0e4: aload 1
      // 0e5: getfield nvj.wdt F
      // 0e8: aload 2
      // 0e9: getfield nvj.jr8 F
      // 0ec: fmul
      // 0ed: fadd
      // 0ee: putfield nvj.zk_ F
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: getfield nvj.xu6 F
      // 0f6: aload 2
      // 0f7: getfield nvj.i2i F
      // 0fa: fmul
      // 0fb: aload 1
      // 0fc: getfield nvj.zk_ F
      // 0ff: aload 2
      // 100: getfield nvj._id F
      // 103: fmul
      // 104: fadd
      // 105: aload 1
      // 106: getfield nvj.jr8 F
      // 109: aload 2
      // 10a: getfield nvj.aqg F
      // 10d: fmul
      // 10e: fadd
      // 10f: putfield nvj.aqg F
      // 112: aload 0
      // 113: aload 1
      // 114: getfield nvj.xu6 F
      // 117: aload 2
      // 118: getfield nvj.k12 F
      // 11b: fmul
      // 11c: aload 1
      // 11d: getfield nvj.zk_ F
      // 120: aload 2
      // 121: getfield nvj.aoj F
      // 124: fmul
      // 125: fadd
      // 126: aload 1
      // 127: getfield nvj.jr8 F
      // 12a: aload 2
      // 12b: getfield nvj.wdt F
      // 12e: fmul
      // 12f: fadd
      // 130: putfield nvj.wdt F
      // 133: aload 0
      // 134: aload 1
      // 135: getfield nvj.xu6 F
      // 138: aload 2
      // 139: getfield nvj.xu6 F
      // 13c: fmul
      // 13d: aload 1
      // 13e: getfield nvj.zk_ F
      // 141: aload 2
      // 142: getfield nvj.zk_ F
      // 145: fmul
      // 146: fadd
      // 147: aload 1
      // 148: getfield nvj.jr8 F
      // 14b: aload 2
      // 14c: getfield nvj.jr8 F
      // 14f: fmul
      // 150: fadd
      // 151: putfield nvj.jr8 F
      // 154: iload 3
      // 155: ifne 2b3
      // 158: goto 15f
      // 15b: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15e: athrow
      // 15f: aload 1
      // 160: goto 167
      // 163: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 166: athrow
      // 167: getfield nvj.i2i F
      // 16a: aload 2
      // 16b: getfield nvj.i2i F
      // 16e: fmul
      // 16f: aload 1
      // 170: getfield nvj._id F
      // 173: aload 2
      // 174: getfield nvj._id F
      // 177: fmul
      // 178: fadd
      // 179: aload 1
      // 17a: getfield nvj.aqg F
      // 17d: aload 2
      // 17e: getfield nvj.aqg F
      // 181: fmul
      // 182: fadd
      // 183: fstore 4
      // 185: aload 1
      // 186: getfield nvj.i2i F
      // 189: aload 2
      // 18a: getfield nvj.k12 F
      // 18d: fmul
      // 18e: aload 1
      // 18f: getfield nvj._id F
      // 192: aload 2
      // 193: getfield nvj.aoj F
      // 196: fmul
      // 197: fadd
      // 198: aload 1
      // 199: getfield nvj.aqg F
      // 19c: aload 2
      // 19d: getfield nvj.wdt F
      // 1a0: fmul
      // 1a1: fadd
      // 1a2: fstore 5
      // 1a4: aload 1
      // 1a5: getfield nvj.i2i F
      // 1a8: aload 2
      // 1a9: getfield nvj.xu6 F
      // 1ac: fmul
      // 1ad: aload 1
      // 1ae: getfield nvj._id F
      // 1b1: aload 2
      // 1b2: getfield nvj.zk_ F
      // 1b5: fmul
      // 1b6: fadd
      // 1b7: aload 1
      // 1b8: getfield nvj.aqg F
      // 1bb: aload 2
      // 1bc: getfield nvj.jr8 F
      // 1bf: fmul
      // 1c0: fadd
      // 1c1: fstore 6
      // 1c3: aload 1
      // 1c4: getfield nvj.k12 F
      // 1c7: aload 2
      // 1c8: getfield nvj.i2i F
      // 1cb: fmul
      // 1cc: aload 1
      // 1cd: getfield nvj.aoj F
      // 1d0: aload 2
      // 1d1: getfield nvj._id F
      // 1d4: fmul
      // 1d5: fadd
      // 1d6: aload 1
      // 1d7: getfield nvj.wdt F
      // 1da: aload 2
      // 1db: getfield nvj.aqg F
      // 1de: fmul
      // 1df: fadd
      // 1e0: fstore 7
      // 1e2: aload 1
      // 1e3: getfield nvj.k12 F
      // 1e6: aload 2
      // 1e7: getfield nvj.k12 F
      // 1ea: fmul
      // 1eb: aload 1
      // 1ec: getfield nvj.aoj F
      // 1ef: aload 2
      // 1f0: getfield nvj.aoj F
      // 1f3: fmul
      // 1f4: fadd
      // 1f5: aload 1
      // 1f6: getfield nvj.wdt F
      // 1f9: aload 2
      // 1fa: getfield nvj.wdt F
      // 1fd: fmul
      // 1fe: fadd
      // 1ff: fstore 8
      // 201: aload 1
      // 202: getfield nvj.k12 F
      // 205: aload 2
      // 206: getfield nvj.xu6 F
      // 209: fmul
      // 20a: aload 1
      // 20b: getfield nvj.aoj F
      // 20e: aload 2
      // 20f: getfield nvj.zk_ F
      // 212: fmul
      // 213: fadd
      // 214: aload 1
      // 215: getfield nvj.wdt F
      // 218: aload 2
      // 219: getfield nvj.jr8 F
      // 21c: fmul
      // 21d: fadd
      // 21e: fstore 9
      // 220: aload 1
      // 221: getfield nvj.xu6 F
      // 224: aload 2
      // 225: getfield nvj.i2i F
      // 228: fmul
      // 229: aload 1
      // 22a: getfield nvj.zk_ F
      // 22d: aload 2
      // 22e: getfield nvj._id F
      // 231: fmul
      // 232: fadd
      // 233: aload 1
      // 234: getfield nvj.jr8 F
      // 237: aload 2
      // 238: getfield nvj.aqg F
      // 23b: fmul
      // 23c: fadd
      // 23d: fstore 10
      // 23f: aload 1
      // 240: getfield nvj.xu6 F
      // 243: aload 2
      // 244: getfield nvj.k12 F
      // 247: fmul
      // 248: aload 1
      // 249: getfield nvj.zk_ F
      // 24c: aload 2
      // 24d: getfield nvj.aoj F
      // 250: fmul
      // 251: fadd
      // 252: aload 1
      // 253: getfield nvj.jr8 F
      // 256: aload 2
      // 257: getfield nvj.wdt F
      // 25a: fmul
      // 25b: fadd
      // 25c: fstore 11
      // 25e: aload 1
      // 25f: getfield nvj.xu6 F
      // 262: aload 2
      // 263: getfield nvj.xu6 F
      // 266: fmul
      // 267: aload 1
      // 268: getfield nvj.zk_ F
      // 26b: aload 2
      // 26c: getfield nvj.zk_ F
      // 26f: fmul
      // 270: fadd
      // 271: aload 1
      // 272: getfield nvj.jr8 F
      // 275: aload 2
      // 276: getfield nvj.jr8 F
      // 279: fmul
      // 27a: fadd
      // 27b: fstore 12
      // 27d: aload 0
      // 27e: fload 4
      // 280: putfield nvj.i2i F
      // 283: aload 0
      // 284: fload 5
      // 286: putfield nvj.k12 F
      // 289: aload 0
      // 28a: fload 6
      // 28c: putfield nvj.xu6 F
      // 28f: aload 0
      // 290: fload 7
      // 292: putfield nvj._id F
      // 295: aload 0
      // 296: fload 8
      // 298: putfield nvj.aoj F
      // 29b: aload 0
      // 29c: fload 9
      // 29e: putfield nvj.zk_ F
      // 2a1: aload 0
      // 2a2: fload 10
      // 2a4: putfield nvj.aqg F
      // 2a7: aload 0
      // 2a8: fload 11
      // 2aa: putfield nvj.wdt F
      // 2ad: aload 0
      // 2ae: fload 12
      // 2b0: putfield nvj.jr8 F
      // 2b3: return
   }

   public final void rub() {
      double[] var1 = new double[9];
      double[] var2 = new double[3];
      this.ojt(var2, var1);
      this.i2i = (float)var1[0];
      this.k12 = (float)var1[1];
      this.xu6 = (float)var1[2];
      this._id = (float)var1[3];
      this.aoj = (float)var1[4];
      this.zk_ = (float)var1[5];
      this.aqg = (float)var1[6];
      this.wdt = (float)var1[7];
      this.jr8 = (float)var1[8];
   }

   public final void o7o(nvj var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      var2[0] = (double)var1.i2i;
      var2[1] = (double)var1.k12;
      var2[2] = (double)var1.xu6;
      var2[3] = (double)var1._id;
      var2[4] = (double)var1.aoj;
      var2[5] = (double)var1.zk_;
      var2[6] = (double)var1.aqg;
      var2[7] = (double)var1.wdt;
      var2[8] = (double)var1.jr8;
      iww.d20(var2, var4, var3);
      this.i2i = (float)var3[0];
      this.k12 = (float)var3[1];
      this.xu6 = (float)var3[2];
      this._id = (float)var3[3];
      this.aoj = (float)var3[4];
      this.zk_ = (float)var3[5];
      this.aqg = (float)var3[6];
      this.wdt = (float)var3[7];
      this.jr8 = (float)var3[8];
   }

   public final void qh1() {
      float var1 = 1.0F / (float)Math.sqrt((double)(this.i2i * this.i2i + this._id * this._id + this.aqg * this.aqg));
      this.i2i *= var1;
      this._id *= var1;
      this.aqg *= var1;
      var1 = 1.0F / (float)Math.sqrt((double)(this.k12 * this.k12 + this.aoj * this.aoj + this.wdt * this.wdt));
      this.k12 *= var1;
      this.aoj *= var1;
      this.wdt *= var1;
      this.xu6 = this._id * this.wdt - this.aoj * this.aqg;
      this.zk_ = this.k12 * this.aqg - this.i2i * this.wdt;
      this.jr8 = this.i2i * this.aoj - this.k12 * this._id;
   }

   public final void oei(nvj var1) {
      float var2 = 1.0F / (float)Math.sqrt((double)(var1.i2i * var1.i2i + var1._id * var1._id + var1.aqg * var1.aqg));
      this.i2i = var1.i2i * var2;
      this._id = var1._id * var2;
      this.aqg = var1.aqg * var2;
      var2 = 1.0F / (float)Math.sqrt((double)(var1.k12 * var1.k12 + var1.aoj * var1.aoj + var1.wdt * var1.wdt));
      this.k12 = var1.k12 * var2;
      this.aoj = var1.aoj * var2;
      this.wdt = var1.wdt * var2;
      this.xu6 = this._id * this.wdt - this.aoj * this.aqg;
      this.zk_ = this.k12 * this.aqg - this.i2i * this.wdt;
      this.jr8 = this.i2i * this.aoj - this.k12 * this._id;
   }

   public boolean jln(nvj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield nvj.i2i F
      // 008: aload 1
      // 009: getfield nvj.i2i F
      // 00c: fcmpl
      // 00d: iload 2
      // 00e: ifeq 02b
      // 011: ifne 10f
      // 014: goto 01b
      // 017: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield nvj.k12 F
      // 01f: aload 1
      // 020: getfield nvj.k12 F
      // 023: fcmpl
      // 024: goto 02b
      // 027: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: iload 2
      // 02c: ifeq 049
      // 02f: ifne 10f
      // 032: goto 039
      // 035: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 038: athrow
      // 039: aload 0
      // 03a: getfield nvj.xu6 F
      // 03d: aload 1
      // 03e: getfield nvj.xu6 F
      // 041: fcmpl
      // 042: goto 049
      // 045: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: iload 2
      // 04a: ifeq 067
      // 04d: ifne 10f
      // 050: goto 057
      // 053: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 056: athrow
      // 057: aload 0
      // 058: getfield nvj._id F
      // 05b: aload 1
      // 05c: getfield nvj._id F
      // 05f: fcmpl
      // 060: goto 067
      // 063: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 066: athrow
      // 067: iload 2
      // 068: ifeq 085
      // 06b: ifne 10f
      // 06e: goto 075
      // 071: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 074: athrow
      // 075: aload 0
      // 076: getfield nvj.aoj F
      // 079: aload 1
      // 07a: getfield nvj.aoj F
      // 07d: fcmpl
      // 07e: goto 085
      // 081: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 084: athrow
      // 085: iload 2
      // 086: ifeq 0a3
      // 089: ifne 10f
      // 08c: goto 093
      // 08f: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 092: athrow
      // 093: aload 0
      // 094: getfield nvj.zk_ F
      // 097: aload 1
      // 098: getfield nvj.zk_ F
      // 09b: fcmpl
      // 09c: goto 0a3
      // 09f: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a2: athrow
      // 0a3: iload 2
      // 0a4: ifeq 0c1
      // 0a7: ifne 10f
      // 0aa: goto 0b1
      // 0ad: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield nvj.aqg F
      // 0b5: aload 1
      // 0b6: getfield nvj.aqg F
      // 0b9: fcmpl
      // 0ba: goto 0c1
      // 0bd: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c0: athrow
      // 0c1: iload 2
      // 0c2: ifeq 0df
      // 0c5: ifne 10f
      // 0c8: goto 0cf
      // 0cb: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield nvj.wdt F
      // 0d3: aload 1
      // 0d4: getfield nvj.wdt F
      // 0d7: fcmpl
      // 0d8: goto 0df
      // 0db: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0de: athrow
      // 0df: iload 2
      // 0e0: ifeq 0fd
      // 0e3: ifne 10f
      // 0e6: goto 0ed
      // 0e9: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield nvj.jr8 F
      // 0f1: aload 1
      // 0f2: getfield nvj.jr8 F
      // 0f5: fcmpl
      // 0f6: goto 0fd
      // 0f9: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0fc: athrow
      // 0fd: iload 2
      // 0fe: ifeq 10c
      // 101: ifne 10f
      // 104: goto 10b
      // 107: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: checkcast nvj
      // 008: astore 3
      // 009: aload 0
      // 00a: getfield nvj.i2i F
      // 00d: aload 3
      // 00e: getfield nvj.i2i F
      // 011: fcmpl
      // 012: iload 2
      // 013: ifeq 030
      // 016: ifne 114
      // 019: goto 020
      // 01c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield nvj.k12 F
      // 024: aload 3
      // 025: getfield nvj.k12 F
      // 028: fcmpl
      // 029: goto 030
      // 02c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02f: athrow
      // 030: iload 2
      // 031: ifeq 04e
      // 034: ifne 114
      // 037: goto 03e
      // 03a: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03d: athrow
      // 03e: aload 0
      // 03f: getfield nvj.xu6 F
      // 042: aload 3
      // 043: getfield nvj.xu6 F
      // 046: fcmpl
      // 047: goto 04e
      // 04a: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04d: athrow
      // 04e: iload 2
      // 04f: ifeq 06c
      // 052: ifne 114
      // 055: goto 05c
      // 058: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05b: athrow
      // 05c: aload 0
      // 05d: getfield nvj._id F
      // 060: aload 3
      // 061: getfield nvj._id F
      // 064: fcmpl
      // 065: goto 06c
      // 068: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06b: athrow
      // 06c: iload 2
      // 06d: ifeq 08a
      // 070: ifne 114
      // 073: goto 07a
      // 076: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 079: athrow
      // 07a: aload 0
      // 07b: getfield nvj.aoj F
      // 07e: aload 3
      // 07f: getfield nvj.aoj F
      // 082: fcmpl
      // 083: goto 08a
      // 086: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 089: athrow
      // 08a: iload 2
      // 08b: ifeq 0a8
      // 08e: ifne 114
      // 091: goto 098
      // 094: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 097: athrow
      // 098: aload 0
      // 099: getfield nvj.zk_ F
      // 09c: aload 3
      // 09d: getfield nvj.zk_ F
      // 0a0: fcmpl
      // 0a1: goto 0a8
      // 0a4: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a7: athrow
      // 0a8: iload 2
      // 0a9: ifeq 0c6
      // 0ac: ifne 114
      // 0af: goto 0b6
      // 0b2: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: getfield nvj.aqg F
      // 0ba: aload 3
      // 0bb: getfield nvj.aqg F
      // 0be: fcmpl
      // 0bf: goto 0c6
      // 0c2: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c5: athrow
      // 0c6: iload 2
      // 0c7: ifeq 0e4
      // 0ca: ifne 114
      // 0cd: goto 0d4
      // 0d0: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield nvj.wdt F
      // 0d8: aload 3
      // 0d9: getfield nvj.wdt F
      // 0dc: fcmpl
      // 0dd: goto 0e4
      // 0e0: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e3: athrow
      // 0e4: iload 2
      // 0e5: ifeq 102
      // 0e8: ifne 114
      // 0eb: goto 0f2
      // 0ee: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: getfield nvj.jr8 F
      // 0f6: aload 3
      // 0f7: getfield nvj.jr8 F
      // 0fa: fcmpl
      // 0fb: goto 102
      // 0fe: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 101: athrow
      // 102: iload 2
      // 103: ifeq 111
      // 106: ifne 114
      // 109: goto 110
      // 10c: invokestatic nvj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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

   public boolean sog(nvj var1, float var2) {
      int var3 = OpaquePredicate.c();
      byte var4 = 1;

      int var10000;
      label149: {
         label148: {
            try {
               float var14;
               var10000 = (var14 = Math.abs(this.i2i - var1.i2i) - var2) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
               if (var3 != 0) {
                  break label149;
               }

               if (var10000 <= 0) {
                  break label148;
               }
            } catch (ArrayIndexOutOfBoundsException var13) {
               throw a(var13);
            }

            var4 = 0;
         }

         float var15;
         var10000 = (var15 = Math.abs(this.k12 - var1.k12) - var2) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
      }

      label140: {
         label139: {
            try {
               if (var3 != 0) {
                  break label140;
               }

               if (var10000 <= 0) {
                  break label139;
               }
            } catch (ArrayIndexOutOfBoundsException var12) {
               throw a(var12);
            }

            var4 = 0;
         }

         float var16;
         var10000 = (var16 = Math.abs(this.xu6 - var1.xu6) - var2) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
      }

      label131: {
         label130: {
            try {
               if (var3 != 0) {
                  break label131;
               }

               if (var10000 <= 0) {
                  break label130;
               }
            } catch (ArrayIndexOutOfBoundsException var11) {
               throw a(var11);
            }

            var4 = 0;
         }

         float var17;
         var10000 = (var17 = Math.abs(this._id - var1._id) - var2) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
      }

      label122: {
         label121: {
            try {
               if (var3 != 0) {
                  break label122;
               }

               if (var10000 <= 0) {
                  break label121;
               }
            } catch (ArrayIndexOutOfBoundsException var10) {
               throw a(var10);
            }

            var4 = 0;
         }

         float var18;
         var10000 = (var18 = Math.abs(this.aoj - var1.aoj) - var2) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
      }

      label113: {
         label112: {
            try {
               if (var3 != 0) {
                  break label113;
               }

               if (var10000 <= 0) {
                  break label112;
               }
            } catch (ArrayIndexOutOfBoundsException var9) {
               throw a(var9);
            }

            var4 = 0;
         }

         float var19;
         var10000 = (var19 = Math.abs(this.zk_ - var1.zk_) - var2) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
      }

      label104: {
         label103: {
            try {
               if (var3 != 0) {
                  break label104;
               }

               if (var10000 <= 0) {
                  break label103;
               }
            } catch (ArrayIndexOutOfBoundsException var8) {
               throw a(var8);
            }

            var4 = 0;
         }

         float var20;
         var10000 = (var20 = Math.abs(this.aqg - var1.aqg) - var2) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
      }

      label95: {
         label94: {
            try {
               if (var3 != 0) {
                  break label95;
               }

               if (var10000 <= 0) {
                  break label94;
               }
            } catch (ArrayIndexOutOfBoundsException var7) {
               throw a(var7);
            }

            var4 = 0;
         }

         float var21;
         var10000 = (var21 = Math.abs(this.wdt - var1.wdt) - var2) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
      }

      label86: {
         label85: {
            try {
               if (var3 != 0) {
                  break label86;
               }

               if (var10000 <= 0) {
                  break label85;
               }
            } catch (ArrayIndexOutOfBoundsException var6) {
               throw a(var6);
            }

            var4 = 0;
         }

         float var22;
         var10000 = (var22 = Math.abs(this.jr8 - var1.jr8) - var2) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
      }

      try {
         if (var3 != 0) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)var4;
         }
      } catch (ArrayIndexOutOfBoundsException var5) {
         throw a(var5);
      }

      return (boolean)0;
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = get.g_p(var1, this.i2i);
      var1 = get.g_p(var1, this.k12);
      var1 = get.g_p(var1, this.xu6);
      var1 = get.g_p(var1, this._id);
      var1 = get.g_p(var1, this.aoj);
      var1 = get.g_p(var1, this.zk_);
      var1 = get.g_p(var1, this.aqg);
      var1 = get.g_p(var1, this.wdt);
      var1 = get.g_p(var1, this.jr8);
      return get.p05(var1);
   }

   public final void qkz() {
      this.i2i = 0.0F;
      this.k12 = 0.0F;
      this.xu6 = 0.0F;
      this._id = 0.0F;
      this.aoj = 0.0F;
      this.zk_ = 0.0F;
      this.aqg = 0.0F;
      this.wdt = 0.0F;
      this.jr8 = 0.0F;
   }

   public final void rsc() {
      this.i2i = -this.i2i;
      this.k12 = -this.k12;
      this.xu6 = -this.xu6;
      this._id = -this._id;
      this.aoj = -this.aoj;
      this.zk_ = -this.zk_;
      this.aqg = -this.aqg;
      this.wdt = -this.wdt;
      this.jr8 = -this.jr8;
   }

   public final void uyg(nvj var1) {
      this.i2i = -var1.i2i;
      this.k12 = -var1.k12;
      this.xu6 = -var1.xu6;
      this._id = -var1._id;
      this.aoj = -var1.aoj;
      this.zk_ = -var1.zk_;
      this.aqg = -var1.aqg;
      this.wdt = -var1.wdt;
      this.jr8 = -var1.jr8;
   }

   public final void gpm(ry6 var1) {
      float var2 = this.i2i * var1.yiu + this.k12 * var1.q6o + this.xu6 * var1.n_d;
      float var3 = this._id * var1.yiu + this.aoj * var1.q6o + this.zk_ * var1.n_d;
      float var4 = this.aqg * var1.yiu + this.wdt * var1.q6o + this.jr8 * var1.n_d;
      var1.plt(var2, var3, var4);
   }

   public final void dre(ry6 var1, ry6 var2) {
      float var3 = this.i2i * var1.yiu + this.k12 * var1.q6o + this.xu6 * var1.n_d;
      float var4 = this._id * var1.yiu + this.aoj * var1.q6o + this.zk_ * var1.n_d;
      var2.n_d = this.aqg * var1.yiu + this.wdt * var1.q6o + this.jr8 * var1.n_d;
      var2.yiu = var3;
      var2.q6o = var4;
   }

   public void ojt(double[] var1, double[] var2) {
      double[] var3 = new double[]{
         (double)this.i2i,
         (double)this.k12,
         (double)this.xu6,
         (double)this._id,
         (double)this.aoj,
         (double)this.zk_,
         (double)this.aqg,
         (double)this.wdt,
         (double)this.jr8
      };
      iww.d20(var3, var1, var2);
   }

   @Override
   public Object clone() {
      Object var1 = null;

      try {
         return (nvj)super.clone();
      } catch (CloneNotSupportedException var3) {
         throw new InternalError();
      }
   }

   public final float vsj() {
      return this.i2i;
   }

   public final void h6b(float var1) {
      this.i2i = var1;
   }

   public final float i6n() {
      return this.k12;
   }

   public final void g9e(float var1) {
      this.k12 = var1;
   }

   public final float qfr() {
      return this.xu6;
   }

   public final void jb0(float var1) {
      this.xu6 = var1;
   }

   public final float lyh() {
      return this._id;
   }

   public final void _17(float var1) {
      this._id = var1;
   }

   public final float cu1() {
      return this.aoj;
   }

   public final void ny1(float var1) {
      this.aoj = var1;
   }

   public final float tzi() {
      return this.zk_;
   }

   public final void meh(float var1) {
      this.zk_ = var1;
   }

   public final float uug() {
      return this.aqg;
   }

   public final void bz3(float var1) {
      this.aqg = var1;
   }

   public final float yut() {
      return this.wdt;
   }

   public final void Entity(float var1) {
      this.wdt = var1;
   }

   public final float ciy() {
      return this.jr8;
   }

   public final void yfy(float var1) {
      this.jr8 = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6860743453887961994L, -3881784322247905606L, MethodHandles.lookup().lookupClass()).a(72962095424535L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 105521252565449L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[15];
      int var7 = 0;
      String var6 = "qÞ/\u000eè\u009dU'Ë!\u0013.O\u0090^§LGFÚõðº)\u0003\u001bå]Î]g+ ê \u0084+÷ù9ü\b¥\u0003\u0001Ö!©\u0000LÖêÇPàJ \u00adû\r\u00886q<ü\u0018ti\u009fãèlðëúnkI§ï.\u001e\u0084\u0014®\u008f\u009f¾\u00900\u0010\u0090Üä×Ìb\u009a\\æa+Fæ@Nü\u0018W\u0098V¾\u0091\u000f±\u00023r\b\u0013³¯\u0094Jmâ\u001c¤ç\u0090K\u008e\u0018`Bc¬Ò\u009b\u009f 1GÊ*\bMX\u009aVÆá´\u0097¢¦\u0080 6¥¬\u0089H<\u0006dg8Y\u0016w\u009b\u008b#Y½¥·¦\u0014ÿv\u009aözË\u0096RÕ]\u0010\u008cñ8§\u0092Gð,Ð\b\u0000\u0000\u001cs3þ ù\u0012ÑÕE'&¾¤&¦JjQ\u0018¼\u009d\u001c*±´\\ \u0001ùh¥\u0088ýòßÐ\u0018aW¨ö\u0082 \u008d«\u0018/x9EùÉ:óJ\r°?\u009a·Ò Æ\u0001÷o×ó³\n+ø¡\u0089a\u0090ÖYÃ@´\u008eá\u009fð¥÷\u0091\u0001\u008f-\u00041) \u00868$É¸ö\u000f,\u00975êB\u0084è<'\u0007\u000eÑ`Å\u0091â\u0001´{0,z¿ø2 îy\u0011\u0010QÝ`\u0018[¡üt¸\u0012û\u009d»\u009d]\u0098\u008bô?ÀÃ§å¼\b#ËZ";
      int var8 = "qÞ/\u000eè\u009dU'Ë!\u0013.O\u0090^§LGFÚõðº)\u0003\u001bå]Î]g+ ê \u0084+÷ù9ü\b¥\u0003\u0001Ö!©\u0000LÖêÇPàJ \u00adû\r\u00886q<ü\u0018ti\u009fãèlðëúnkI§ï.\u001e\u0084\u0014®\u008f\u009f¾\u00900\u0010\u0090Üä×Ìb\u009a\\æa+Fæ@Nü\u0018W\u0098V¾\u0091\u000f±\u00023r\b\u0013³¯\u0094Jmâ\u001c¤ç\u0090K\u008e\u0018`Bc¬Ò\u009b\u009f 1GÊ*\bMX\u009aVÆá´\u0097¢¦\u0080 6¥¬\u0089H<\u0006dg8Y\u0016w\u009b\u008b#Y½¥·¦\u0014ÿv\u009aözË\u0096RÕ]\u0010\u008cñ8§\u0092Gð,Ð\b\u0000\u0000\u001cs3þ ù\u0012ÑÕE'&¾¤&¦JjQ\u0018¼\u009d\u001c*±´\\ \u0001ùh¥\u0088ýòßÐ\u0018aW¨ö\u0082 \u008d«\u0018/x9EùÉ:óJ\r°?\u009a·Ò Æ\u0001÷o×ó³\n+ø¡\u0089a\u0090ÖYÃ@´\u008eá\u009fð¥÷\u0091\u0001\u008f-\u00041) \u00868$É¸ö\u000f,\u00975êB\u0084è<'\u0007\u000eÑ`Å\u0091â\u0001´{0,z¿ø2 îy\u0011\u0010QÝ`\u0018[¡üt¸\u0012û\u009d»\u009d]\u0098\u008bô?ÀÃ§å¼\b#ËZ"
         .length();
      char var5 = ' ';
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
                     c = new String[15];
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

                  var6 = "\t3êI\u007f\u000bÔO`\bV.¨Ç_Ä:\u0082'ç\u0092\t\u0001Å \u0085\u0082r\tj;\u0005\u0093÷\u008f®\u0085³Q\t9rÇíö\u0091\u0094\rU q\u0096D\u001f³ª¾";
                  var8 = "\t3êI\u007f\u000bÔO`\bV.¨Ç_Ä:\u0082'ç\u0092\t\u0001Å \u0085\u0082r\tj;\u0005\u0093÷\u008f®\u0085³Q\t9rÇíö\u0091\u0094\rU q\u0096D\u001f³ª¾"
                     .length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17722;
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
            throw new RuntimeException("nvj", var10);
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
         throw new RuntimeException("nvj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
