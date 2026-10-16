import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.vector.Matrix4f;

public class boo {
   private static final long a;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public boo(String var1, int var2, int var3, jn3 var4) {
      this.s84 = var1;
      this.dl8 = var3;
      this.zf1 = var2;
      this.doy = var4;
      if (var2 <= 3) {
         this.ka2 = BufferUtils.createIntBuffer(var3);
         this._x6 = null;
      } else {
         this.ka2 = null;
         this._x6 = BufferUtils.createFloatBuffer(var3);
      }

      this.u71 = -1;
      this.c0r();
   }

   private void c0r() {
      try {
         this.bq1 = true;
         if (this.doy != null) {
            this.doy.ade();
         }
      } catch (oov var1) {
         throw a(var1);
      }
   }

   public static int he4(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic boo.a J
      // 003: ldc2_w 125738781220310
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: bipush -1
      // 00d: istore 4
      // 00f: aload 0
      // 010: sipush 2540
      // 013: ldc2_w 5405765408238530903
      // 016: lload 1
      // 017: lxor
      // 018: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01d: nop
      // 01e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 021: iload 3
      // 022: ifeq 04f
      // 025: ifeq 036
      // 028: goto 02f
      // 02b: invokestatic boo.a (Loov;)Loov;
      // 02e: athrow
      // 02f: bipush 0
      // 030: istore 4
      // 032: iload 3
      // 033: ifne 114
      // 036: aload 0
      // 037: sipush 26626
      // 03a: ldc2_w 1660820252264501435
      // 03d: lload 1
      // 03e: lxor
      // 03f: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: nop
      // 045: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 048: goto 04f
      // 04b: invokestatic boo.a (Loov;)Loov;
      // 04e: athrow
      // 04f: iload 3
      // 050: ifeq 07d
      // 053: ifeq 064
      // 056: goto 05d
      // 059: invokestatic boo.a (Loov;)Loov;
      // 05c: athrow
      // 05d: bipush 4
      // 05e: istore 4
      // 060: iload 3
      // 061: ifne 114
      // 064: aload 0
      // 065: sipush 3020
      // 068: ldc2_w 6681849008380605298
      // 06b: lload 1
      // 06c: lxor
      // 06d: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: nop
      // 073: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 076: goto 07d
      // 079: invokestatic boo.a (Loov;)Loov;
      // 07c: athrow
      // 07d: iload 3
      // 07e: ifeq 116
      // 081: ifeq 114
      // 084: goto 08b
      // 087: invokestatic boo.a (Loov;)Loov;
      // 08a: athrow
      // 08b: aload 0
      // 08c: sipush 25718
      // 08f: ldc2_w 7178016023927921858
      // 092: lload 1
      // 093: lxor
      // 094: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: nop
      // 09a: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 09d: iload 3
      // 09e: ifeq 0d3
      // 0a1: goto 0a8
      // 0a4: invokestatic boo.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: ifeq 0ba
      // 0ab: goto 0b2
      // 0ae: invokestatic boo.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: bipush 8
      // 0b4: istore 4
      // 0b6: iload 3
      // 0b7: ifne 114
      // 0ba: aload 0
      // 0bb: sipush 26186
      // 0be: ldc2_w 7175214111642427120
      // 0c1: lload 1
      // 0c2: lxor
      // 0c3: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: nop
      // 0c9: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0cc: goto 0d3
      // 0cf: invokestatic boo.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: iload 3
      // 0d4: ifeq 102
      // 0d7: ifeq 0e9
      // 0da: goto 0e1
      // 0dd: invokestatic boo.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: bipush 9
      // 0e3: istore 4
      // 0e5: iload 3
      // 0e6: ifne 114
      // 0e9: aload 0
      // 0ea: sipush 14127
      // 0ed: ldc2_w 1497021830696161178
      // 0f0: lload 1
      // 0f1: lxor
      // 0f2: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: nop
      // 0f8: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0fb: goto 102
      // 0fe: invokestatic boo.a (Loov;)Loov;
      // 101: athrow
      // 102: iload 3
      // 103: ifeq 116
      // 106: ifeq 114
      // 109: goto 110
      // 10c: invokestatic boo.a (Loov;)Loov;
      // 10f: athrow
      // 110: bipush 10
      // 112: istore 4
      // 114: iload 4
      // 116: ireturn
   }

   public void ubi(int var1) {
      this.u71 = var1;
   }

   public String hg_() {
      return this.s84;
   }

   public void scn(float var1) {
      ((Buffer)this._x6).position(0);
      this._x6.put(0, var1);
      this.c0r();
   }

   public void utn(float var1, float var2) {
      ((Buffer)this._x6).position(0);
      this._x6.put(0, var1);
      this._x6.put(1, var2);
      this.c0r();
   }

   public void otp(float var1, float var2, float var3) {
      ((Buffer)this._x6).position(0);
      this._x6.put(0, var1);
      this._x6.put(1, var2);
      this._x6.put(2, var3);
      this.c0r();
   }

   public void hej(float var1, float var2, float var3, float var4) {
      ((Buffer)this._x6).position(0);
      this._x6.put(var1);
      this._x6.put(var2);
      this._x6.put(var3);
      this._x6.put(var4);
      ((Buffer)this._x6).flip();
      this.c0r();
   }

   public void ipu(float param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 0
      // 06: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 09: bipush 0
      // 0a: invokevirtual java/nio/FloatBuffer.position (I)Ljava/nio/Buffer;
      // 0d: pop
      // 0e: aload 0
      // 0f: getfield boo.zf1 I
      // 12: bipush 4
      // 13: iload 5
      // 15: ifne 38
      // 18: if_icmplt 33
      // 1b: goto 22
      // 1e: invokestatic boo.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 26: bipush 0
      // 27: fload 1
      // 28: invokevirtual java/nio/FloatBuffer.put (IF)Ljava/nio/FloatBuffer;
      // 2b: pop
      // 2c: goto 33
      // 2f: invokestatic boo.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: getfield boo.zf1 I
      // 37: bipush 5
      // 38: iload 5
      // 3a: ifne 5e
      // 3d: if_icmplt 58
      // 40: goto 47
      // 43: invokestatic boo.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 0
      // 48: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 4b: bipush 1
      // 4c: fload 2
      // 4d: invokevirtual java/nio/FloatBuffer.put (IF)Ljava/nio/FloatBuffer;
      // 50: pop
      // 51: goto 58
      // 54: invokestatic boo.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: getfield boo.zf1 I
      // 5c: bipush 6
      // 5e: iload 5
      // 60: ifne 90
      // 63: if_icmplt 7e
      // 66: goto 6d
      // 69: invokestatic boo.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 71: bipush 2
      // 72: fload 3
      // 73: invokevirtual java/nio/FloatBuffer.put (IF)Ljava/nio/FloatBuffer;
      // 76: pop
      // 77: goto 7e
      // 7a: invokestatic boo.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 0
      // 7f: iload 5
      // 81: ifne a6
      // 84: getfield boo.zf1 I
      // 87: bipush 7
      // 89: goto 90
      // 8c: invokestatic boo.a (Loov;)Loov;
      // 8f: athrow
      // 90: if_icmplt a5
      // 93: aload 0
      // 94: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 97: bipush 3
      // 98: fload 4
      // 9a: invokevirtual java/nio/FloatBuffer.put (IF)Ljava/nio/FloatBuffer;
      // 9d: pop
      // 9e: goto a5
      // a1: invokestatic boo.a (Loov;)Loov;
      // a4: athrow
      // a5: aload 0
      // a6: invokespecial boo.c0r ()V
      // a9: return
   }

   public void kr1(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 0
      // 06: getfield boo.ka2 Ljava/nio/IntBuffer;
      // 09: bipush 0
      // 0a: invokevirtual java/nio/IntBuffer.position (I)Ljava/nio/Buffer;
      // 0d: pop
      // 0e: aload 0
      // 0f: getfield boo.zf1 I
      // 12: iload 5
      // 14: ifne 36
      // 17: iflt 32
      // 1a: goto 21
      // 1d: invokestatic boo.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield boo.ka2 Ljava/nio/IntBuffer;
      // 25: bipush 0
      // 26: iload 1
      // 27: invokevirtual java/nio/IntBuffer.put (II)Ljava/nio/IntBuffer;
      // 2a: pop
      // 2b: goto 32
      // 2e: invokestatic boo.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield boo.zf1 I
      // 36: bipush 1
      // 37: iload 5
      // 39: ifne 5c
      // 3c: if_icmplt 57
      // 3f: goto 46
      // 42: invokestatic boo.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: getfield boo.ka2 Ljava/nio/IntBuffer;
      // 4a: bipush 1
      // 4b: iload 2
      // 4c: invokevirtual java/nio/IntBuffer.put (II)Ljava/nio/IntBuffer;
      // 4f: pop
      // 50: goto 57
      // 53: invokestatic boo.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 0
      // 58: getfield boo.zf1 I
      // 5b: bipush 2
      // 5c: iload 5
      // 5e: ifne 8d
      // 61: if_icmplt 7c
      // 64: goto 6b
      // 67: invokestatic boo.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield boo.ka2 Ljava/nio/IntBuffer;
      // 6f: bipush 2
      // 70: iload 3
      // 71: invokevirtual java/nio/IntBuffer.put (II)Ljava/nio/IntBuffer;
      // 74: pop
      // 75: goto 7c
      // 78: invokestatic boo.a (Loov;)Loov;
      // 7b: athrow
      // 7c: aload 0
      // 7d: iload 5
      // 7f: ifne a3
      // 82: getfield boo.zf1 I
      // 85: bipush 3
      // 86: goto 8d
      // 89: invokestatic boo.a (Loov;)Loov;
      // 8c: athrow
      // 8d: if_icmplt a2
      // 90: aload 0
      // 91: getfield boo.ka2 Ljava/nio/IntBuffer;
      // 94: bipush 3
      // 95: iload 4
      // 97: invokevirtual java/nio/IntBuffer.put (II)Ljava/nio/IntBuffer;
      // 9a: pop
      // 9b: goto a2
      // 9e: invokestatic boo.a (Loov;)Loov;
      // a1: athrow
      // a2: aload 0
      // a3: invokespecial boo.c0r ()V
      // a6: return
   }

   public void l4a(float[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic boo.a J
      // 03: ldc2_w 17929013036253
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: arraylength
      // 0f: aload 0
      // 10: getfield boo.dl8 I
      // 13: if_icmpge 73
      // 16: getstatic boo.prm Lorg/apache/logging/log4j/Logger;
      // 19: new java/lang/StringBuilder
      // 1c: dup
      // 1d: invokespecial java/lang/StringBuilder.<init> ()V
      // 20: sipush 19285
      // 23: ldc2_w 3973686766608820974
      // 26: lload 2
      // 27: lxor
      // 28: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: nop
      // 2e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31: aload 0
      // 32: getfield boo.dl8 I
      // 35: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 38: sipush 30126
      // 3b: ldc2_w 3811164563183080466
      // 3e: lload 2
      // 3f: lxor
      // 40: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: nop
      // 46: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49: aload 1
      // 4a: arraylength
      // 4b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4e: sipush 16136
      // 51: ldc2_w 4373685530237001403
      // 54: lload 2
      // 55: lxor
      // 56: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: nop
      // 5c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 62: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 67: iload 4
      // 69: ifeq 99
      // 6c: goto 73
      // 6f: invokestatic boo.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 0
      // 74: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 77: bipush 0
      // 78: invokevirtual java/nio/FloatBuffer.position (I)Ljava/nio/Buffer;
      // 7b: pop
      // 7c: aload 0
      // 7d: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 80: aload 1
      // 81: invokevirtual java/nio/FloatBuffer.put ([F)Ljava/nio/FloatBuffer;
      // 84: pop
      // 85: aload 0
      // 86: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 89: bipush 0
      // 8a: invokevirtual java/nio/FloatBuffer.position (I)Ljava/nio/Buffer;
      // 8d: pop
      // 8e: aload 0
      // 8f: invokespecial boo.c0r ()V
      // 92: goto 99
      // 95: invokestatic boo.a (Loov;)Loov;
      // 98: athrow
      // 99: return
   }

   public void jd2(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      ((Buffer)this._x6).position(0);
      this._x6.put(0, var1);
      this._x6.put(1, var2);
      this._x6.put(2, var3);
      this._x6.put(3, var4);
      this._x6.put(4, var5);
      this._x6.put(5, var6);
      this._x6.put(6, var7);
      this._x6.put(7, var8);
      this._x6.put(8, var9);
      this._x6.put(9, var10);
      this._x6.put(10, var11);
      this._x6.put(11, var12);
      this._x6.put(12, var13);
      this._x6.put(13, var14);
      this._x6.put(14, var15);
      this._x6.put(15, var16);
      this.c0r();
   }

   public void i9w(Matrix4f var1) {
      this.jd2(
         var1.m00,
         var1.m01,
         var1.m02,
         var1.m03,
         var1.m10,
         var1.m11,
         var1.m12,
         var1.m13,
         var1.m20,
         var1.m21,
         var1.m22,
         var1.m23,
         var1.m30,
         var1.m31,
         var1.m32,
         var1.m33
      );
   }

   public void hr6() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic boo.a J
      // 03: ldc2_w 86386729885686
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield boo.bq1 Z
      // 10: ifne 13
      // 13: aload 0
      // 14: bipush 0
      // 15: putfield boo.bq1 Z
      // 18: aload 0
      // 19: getfield boo.zf1 I
      // 1c: bipush 3
      // 1d: iload 3
      // 1e: ifne 47
      // 21: if_icmpgt 3a
      // 24: goto 2b
      // 27: invokestatic boo.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: invokespecial boo.wps ()V
      // 2f: iload 3
      // 30: ifeq c3
      // 33: goto 3a
      // 36: invokestatic boo.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield boo.zf1 I
      // 3e: bipush 7
      // 40: goto 47
      // 43: invokestatic boo.a (Loov;)Loov;
      // 46: athrow
      // 47: iload 3
      // 48: ifne 7c
      // 4b: if_icmpgt 64
      // 4e: goto 55
      // 51: invokestatic boo.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: invokespecial boo.x2z ()V
      // 59: iload 3
      // 5a: ifeq c3
      // 5d: goto 64
      // 60: invokestatic boo.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: iload 3
      // 66: ifne c0
      // 69: goto 70
      // 6c: invokestatic boo.a (Loov;)Loov;
      // 6f: athrow
      // 70: getfield boo.zf1 I
      // 73: bipush 10
      // 75: goto 7c
      // 78: invokestatic boo.a (Loov;)Loov;
      // 7b: athrow
      // 7c: if_icmple bf
      // 7f: getstatic boo.prm Lorg/apache/logging/log4j/Logger;
      // 82: new java/lang/StringBuilder
      // 85: dup
      // 86: invokespecial java/lang/StringBuilder.<init> ()V
      // 89: sipush 5106
      // 8c: ldc2_w 72948354682087789
      // 8f: lload 1
      // 90: lxor
      // 91: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: nop
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: aload 0
      // 9b: getfield boo.zf1 I
      // 9e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // a1: sipush 9124
      // a4: ldc2_w 7608483193624647992
      // a7: lload 1
      // a8: lxor
      // a9: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: nop
      // af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b5: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // ba: return
      // bb: invokestatic boo.a (Loov;)Loov;
      // be: athrow
      // bf: aload 0
      // c0: invokespecial boo.o3x ()V
      // c3: return
   }

   private void wps() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic boo.a J
      // 03: ldc2_w 74123728047459
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield boo.zf1 I
      // 10: iload 3
      // 11: ifne 43
      // 14: tableswitch 124 0 3 36 58 80 102
      // 34: invokestatic boo.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: getfield boo.u71 I
      // 3c: goto 43
      // 3f: invokestatic boo.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: getfield boo.ka2 Ljava/nio/IntBuffer;
      // 47: invokestatic gis.lgb (ILjava/nio/IntBuffer;)V
      // 4a: iload 3
      // 4b: ifeq d2
      // 4e: aload 0
      // 4f: getfield boo.u71 I
      // 52: aload 0
      // 53: getfield boo.ka2 Ljava/nio/IntBuffer;
      // 56: invokestatic gis.gl3 (ILjava/nio/IntBuffer;)V
      // 59: iload 3
      // 5a: ifeq d2
      // 5d: goto 64
      // 60: invokestatic boo.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: getfield boo.u71 I
      // 68: aload 0
      // 69: getfield boo.ka2 Ljava/nio/IntBuffer;
      // 6c: invokestatic gis.mhi (ILjava/nio/IntBuffer;)V
      // 6f: iload 3
      // 70: ifeq d2
      // 73: goto 7a
      // 76: invokestatic boo.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield boo.u71 I
      // 7e: aload 0
      // 7f: getfield boo.ka2 Ljava/nio/IntBuffer;
      // 82: invokestatic gis.o_i (ILjava/nio/IntBuffer;)V
      // 85: iload 3
      // 86: ifeq d2
      // 89: goto 90
      // 8c: invokestatic boo.a (Loov;)Loov;
      // 8f: athrow
      // 90: getstatic boo.prm Lorg/apache/logging/log4j/Logger;
      // 93: new java/lang/StringBuilder
      // 96: dup
      // 97: invokespecial java/lang/StringBuilder.<init> ()V
      // 9a: sipush 9761
      // 9d: ldc2_w 2026835321811504674
      // a0: lload 1
      // a1: lxor
      // a2: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: nop
      // a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ab: aload 0
      // ac: getfield boo.dl8 I
      // af: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // b2: sipush 551
      // b5: ldc2_w 7670627010009279009
      // b8: lload 1
      // b9: lxor
      // ba: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: nop
      // c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c6: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // cb: goto d2
      // ce: invokestatic boo.a (Loov;)Loov;
      // d1: athrow
      // d2: return
   }

   private void x2z() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic boo.a J
      // 03: ldc2_w 46277576799222
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield boo.zf1 I
      // 10: iload 3
      // 11: ifeq 43
      // 14: tableswitch 124 4 7 36 58 80 102
      // 34: invokestatic boo.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: getfield boo.u71 I
      // 3c: goto 43
      // 3f: invokestatic boo.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 47: invokestatic gis.ory (ILjava/nio/FloatBuffer;)V
      // 4a: iload 3
      // 4b: ifne d2
      // 4e: aload 0
      // 4f: getfield boo.u71 I
      // 52: aload 0
      // 53: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 56: invokestatic gis.wph (ILjava/nio/FloatBuffer;)V
      // 59: iload 3
      // 5a: ifne d2
      // 5d: goto 64
      // 60: invokestatic boo.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: getfield boo.u71 I
      // 68: aload 0
      // 69: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 6c: invokestatic gis.j8w (ILjava/nio/FloatBuffer;)V
      // 6f: iload 3
      // 70: ifne d2
      // 73: goto 7a
      // 76: invokestatic boo.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield boo.u71 I
      // 7e: aload 0
      // 7f: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 82: invokestatic gis.o3b (ILjava/nio/FloatBuffer;)V
      // 85: iload 3
      // 86: ifne d2
      // 89: goto 90
      // 8c: invokestatic boo.a (Loov;)Loov;
      // 8f: athrow
      // 90: getstatic boo.prm Lorg/apache/logging/log4j/Logger;
      // 93: new java/lang/StringBuilder
      // 96: dup
      // 97: invokespecial java/lang/StringBuilder.<init> ()V
      // 9a: sipush 4407
      // 9d: ldc2_w 3636437844725942182
      // a0: lload 1
      // a1: lxor
      // a2: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: nop
      // a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ab: aload 0
      // ac: getfield boo.dl8 I
      // af: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // b2: sipush 24952
      // b5: ldc2_w 8595428086493263845
      // b8: lload 1
      // b9: lxor
      // ba: invokedynamic w (IJ)Ljava/lang/String; bsm=boo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: nop
      // c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c6: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // cb: goto d2
      // ce: invokestatic boo.a (Loov;)Loov;
      // d1: athrow
      // d2: return
   }

   private void o3x() {
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
      // 05: getfield boo.zf1 I
      // 08: iload 1
      // 09: ifeq 37
      // 0c: tableswitch 97 8 10 32 55 78
      // 28: invokestatic boo.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield boo.u71 I
      // 30: goto 37
      // 33: invokestatic boo.a (Loov;)Loov;
      // 36: athrow
      // 37: bipush 1
      // 38: aload 0
      // 39: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 3c: invokestatic gis.s3a (IZLjava/nio/FloatBuffer;)V
      // 3f: iload 1
      // 40: ifne 6d
      // 43: aload 0
      // 44: getfield boo.u71 I
      // 47: bipush 1
      // 48: aload 0
      // 49: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 4c: invokestatic gis.e9m (IZLjava/nio/FloatBuffer;)V
      // 4f: iload 1
      // 50: ifne 6d
      // 53: goto 5a
      // 56: invokestatic boo.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield boo.u71 I
      // 5e: bipush 1
      // 5f: aload 0
      // 60: getfield boo._x6 Ljava/nio/FloatBuffer;
      // 63: invokestatic gis.l8c (IZLjava/nio/FloatBuffer;)V
      // 66: goto 6d
      // 69: invokestatic boo.a (Loov;)Loov;
      // 6c: athrow
      // 6d: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5958543052833688990L, -6255259880255978736L, MethodHandles.lookup().lookupClass()).a(9391020076441L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 58805122315552L;
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
      String var6 = "\u0082(a¿¯¬\u0016\u0013Äé \u0013\u0098ã¯Q\u0093b\u0082Óÿ\u009aü\u0013WÊÞ5#¢<UN[±÷\u0080Mî*Q\u001c\u0080Ð\u0080\b²Ö\u009f9\rÁú\u00009\r\u0011o\u0004\u0080°7HÇ\u008b\u009bÜ¤´¬\u0096¯Ì=p\u000b\u0005oVâHcâI¯¡ó/5:4éGõ]«Ó»±ÑI¿à\ró¥ÏgKö\u0089§\u0093\u0090ûP\u00996Ä¨DÄ\u0099\u008bZÒ_g\u00924Ã«æÜ\u0080l\u009a\u0010\u0002\u008fó\u0096g\u0019\u0002\u0081ç&ve²*\u009c@\"\u0093zyZÀ\u000e»<:dl/Z\u0014á{C\u008e\u009aWcG{\u0091 \u000f\u0001ÛLñ\u009c;Ü\t\u0099û-¥É)ÉÀT±\u001bd\"Rõ>»eè~åÏ\u001a\u009få\\\u0091¶\u001d\u0010Ó©Ã_ù\u0083LU\u008d@ýÐ\u0096\u008e¢R\u0010ÆªÍ\u0007p½\u0092æq¤úF\u008f\u0092»S\u0018(\u009a*Ë\u0005{=\u0001Ar»b\u000eM\fÚ\u0002F\u0002Eeì¥Ü\u0010æßÈ\u009f\u0014r\u0084÷2\u008bi'\u0099íz\u0011\u0010·9©ç\u0000î=>Òq:KW¨=7\u00109ùxDd\u009eLÈ:vÍ\u001fÍÅö>\u0010\u0014Qáâ\u009b/g\u0086·¨\u0005Ó@¤s\u009e\u0010ïSv\u0086l\u0012_Ý\u0092k\u000bD8(\u0085jH\u0086\u0004Ù\u00adr^Co\u0017cÙ\u00ad\t\u0003°¦\u0095ýcL0©\u000b\u001d>\u0092²ZþoH>TûÍew^ª\u0097\u0094m#×¡j\u0082b\u009emí½ÖÞØØÉFq\u0095±Öáu\u0083u\u0015\"lp#íP\u0013\u001d\u0099ò\u00840l9ï\u009d0\u0095Å¾©\u009b.D\u001b¯É\u0083\u0081ñG¶\u008b\u0086\u0006j·s¾ÑZß\u0006\u001b\u0011\u008eê\u0080\"B(}Õ\u001a$\u008f²IZçRÃü¹\u0092&ú)T8IËß°7ä]a\u0019\u0015\u0086\u008f!85S";
      int var8 = "\u0082(a¿¯¬\u0016\u0013Äé \u0013\u0098ã¯Q\u0093b\u0082Óÿ\u009aü\u0013WÊÞ5#¢<UN[±÷\u0080Mî*Q\u001c\u0080Ð\u0080\b²Ö\u009f9\rÁú\u00009\r\u0011o\u0004\u0080°7HÇ\u008b\u009bÜ¤´¬\u0096¯Ì=p\u000b\u0005oVâHcâI¯¡ó/5:4éGõ]«Ó»±ÑI¿à\ró¥ÏgKö\u0089§\u0093\u0090ûP\u00996Ä¨DÄ\u0099\u008bZÒ_g\u00924Ã«æÜ\u0080l\u009a\u0010\u0002\u008fó\u0096g\u0019\u0002\u0081ç&ve²*\u009c@\"\u0093zyZÀ\u000e»<:dl/Z\u0014á{C\u008e\u009aWcG{\u0091 \u000f\u0001ÛLñ\u009c;Ü\t\u0099û-¥É)ÉÀT±\u001bd\"Rõ>»eè~åÏ\u001a\u009få\\\u0091¶\u001d\u0010Ó©Ã_ù\u0083LU\u008d@ýÐ\u0096\u008e¢R\u0010ÆªÍ\u0007p½\u0092æq¤úF\u008f\u0092»S\u0018(\u009a*Ë\u0005{=\u0001Ar»b\u000eM\fÚ\u0002F\u0002Eeì¥Ü\u0010æßÈ\u009f\u0014r\u0084÷2\u008bi'\u0099íz\u0011\u0010·9©ç\u0000î=>Òq:KW¨=7\u00109ùxDd\u009eLÈ:vÍ\u001fÍÅö>\u0010\u0014Qáâ\u009b/g\u0086·¨\u0005Ó@¤s\u009e\u0010ïSv\u0086l\u0012_Ý\u0092k\u000bD8(\u0085jH\u0086\u0004Ù\u00adr^Co\u0017cÙ\u00ad\t\u0003°¦\u0095ýcL0©\u000b\u001d>\u0092²ZþoH>TûÍew^ª\u0097\u0094m#×¡j\u0082b\u009emí½ÖÞØØÉFq\u0095±Öáu\u0083u\u0015\"lp#íP\u0013\u001d\u0099ò\u00840l9ï\u009d0\u0095Å¾©\u009b.D\u001b¯É\u0083\u0081ñG¶\u008b\u0086\u0006j·s¾ÑZß\u0006\u001b\u0011\u008eê\u0080\"B(}Õ\u001a$\u008f²IZçRÃü¹\u0092&ú)T8IËß°7ä]a\u0019\u0015\u0086\u008f!85S"
         .length();
      char var5 = 'P';
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
                     c = var9;
                     d = new String[15];
                     prm = LogManager.getLogger();
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

                  var6 = "9×<LZ&é~³y-|µ,ZÜ»är$øqNE¨AUj®g\u009bAÜ\u001a$\u0088\u0001\u0092\u0098b\"Þ\u0091`ÂA;{T\r\u0013\u0082 ú:M[@lÝ\u008b|!dù#\u0018Ø\u0001A\u008föLëÚh\u00028\u008aãE\u0001OWÃG|S+\u0088!\u0096+îÑ\u0007\u0014FÒ\u0099ÐCµ|HÏæë\u008dÕ@¨\n\u0098Y\u0088±Æ\u0085,t\u008fI½ý²\"\u0099/\u0005;b\u001e»eóçÜ\u0085Õ\u0084«ên5ðpáµõ\u0096)T\u0002Òâ\u0096ñº0ýÈ\u009c0%ksX¸¦AÑ\u0081BØ:\u00ad";
                  var8 = "9×<LZ&é~³y-|µ,ZÜ»är$øqNE¨AUj®g\u009bAÜ\u001a$\u0088\u0001\u0092\u0098b\"Þ\u0091`ÂA;{T\r\u0013\u0082 ú:M[@lÝ\u008b|!dù#\u0018Ø\u0001A\u008föLëÚh\u00028\u008aãE\u0001OWÃG|S+\u0088!\u0096+îÑ\u0007\u0014FÒ\u0099ÐCµ|HÏæë\u008dÕ@¨\n\u0098Y\u0088±Æ\u0085,t\u008fI½ý²\"\u0099/\u0005;b\u001e»eóçÜ\u0085Õ\u0084«ên5ðpáµõ\u0096)T\u0002Òâ\u0096ñº0ýÈ\u009c0%ksX¸¦AÑ\u0081BØ:\u00ad"
                     .length();
                  var5 = 'h';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14646;
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
            throw new RuntimeException("boo", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("boo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
