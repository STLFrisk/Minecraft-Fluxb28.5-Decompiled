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

public class oru {
   public int ntc;
   public int f86;
   public int r_a;
   public int s1h;
   public boolean zg_;
   public int zb_;
   public int mqx;
   public int vxw;
   public float[] dq3;
   public int o0i;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public oru(int var1, int var2, boolean var3) {
      this.zg_ = var3;
      this.zb_ = -1;
      this.mqx = -1;
      this.vxw = -1;
      this.dq3 = new float[4];
      this.dq3[0] = 1.0F;
      this.dq3[1] = 1.0F;
      this.dq3[2] = 1.0F;
      this.dq3[3] = 0.0F;
      this.mfw(var1, var2);
   }

   public void mfw(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: invokestatic gis.gu5 ()Z
      // 07: iload 3
      // 08: ifeq 38
      // 0b: ifne 2a
      // 0e: goto 15
      // 11: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: aload 0
      // 16: iload 1
      // 17: putfield oru.r_a I
      // 1a: aload 0
      // 1b: iload 2
      // 1c: putfield oru.s1h I
      // 1f: iload 3
      // 20: ifne 62
      // 23: goto 2a
      // 26: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 29: athrow
      // 2a: invokestatic hzu.m45 ()V
      // 2d: aload 0
      // 2e: getfield oru.zb_ I
      // 31: goto 38
      // 34: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 37: athrow
      // 38: iload 3
      // 39: ifeq 5e
      // 3c: iflt 51
      // 3f: goto 46
      // 42: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 45: athrow
      // 46: aload 0
      // 47: invokevirtual oru.qxv ()V
      // 4a: goto 51
      // 4d: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 50: athrow
      // 51: aload 0
      // 52: iload 1
      // 53: iload 2
      // 54: invokevirtual oru.j1i (II)V
      // 57: aload 0
      // 58: invokevirtual oru.y_x ()V
      // 5b: getstatic gis.cf1 I
      // 5e: bipush 0
      // 5f: invokestatic gis.ghy (II)V
      // 62: return
   }

   public void qxv() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: invokestatic gis.gu5 ()Z
      // 07: iload 1
      // 08: ifeq 28
      // 0b: ifeq 9d
      // 0e: goto 15
      // 11: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: aload 0
      // 16: invokevirtual oru.ihk ()V
      // 19: aload 0
      // 1a: invokevirtual oru._zc ()V
      // 1d: aload 0
      // 1e: getfield oru.vxw I
      // 21: goto 28
      // 24: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 27: athrow
      // 28: bipush -1
      // 29: iload 1
      // 2a: ifeq 4f
      // 2d: if_icmple 4a
      // 30: goto 37
      // 33: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 36: athrow
      // 37: aload 0
      // 38: getfield oru.vxw I
      // 3b: invokestatic gis.cpq (I)V
      // 3e: aload 0
      // 3f: bipush -1
      // 40: putfield oru.vxw I
      // 43: goto 4a
      // 46: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield oru.mqx I
      // 4e: bipush -1
      // 4f: iload 1
      // 50: ifeq 75
      // 53: if_icmple 70
      // 56: goto 5d
      // 59: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield oru.mqx I
      // 61: invokestatic p9t.d23 (I)V
      // 64: aload 0
      // 65: bipush -1
      // 66: putfield oru.mqx I
      // 69: goto 70
      // 6c: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield oru.zb_ I
      // 74: bipush -1
      // 75: iload 1
      // 76: ifeq 8e
      // 79: if_icmple 9d
      // 7c: goto 83
      // 7f: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 82: athrow
      // 83: getstatic gis.cf1 I
      // 86: bipush 0
      // 87: goto 8e
      // 8a: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8d: athrow
      // 8e: invokestatic gis.ghy (II)V
      // 91: aload 0
      // 92: getfield oru.zb_ I
      // 95: invokestatic gis.cy2 (I)V
      // 98: aload 0
      // 99: bipush -1
      // 9a: putfield oru.zb_ I
      // 9d: return
   }

   public void j1i(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: putfield oru.r_a I
      // 05: aload 0
      // 06: iload 2
      // 07: putfield oru.s1h I
      // 0a: invokestatic OpaquePredicate.c ()I
      // 0d: aload 0
      // 0e: iload 1
      // 0f: putfield oru.ntc I
      // 12: aload 0
      // 13: iload 2
      // 14: putfield oru.f86 I
      // 17: istore 3
      // 18: invokestatic gis.gu5 ()Z
      // 1b: iload 3
      // 1c: ifne 51
      // 1f: ifne 38
      // 22: goto 29
      // 25: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 28: athrow
      // 29: aload 0
      // 2a: invokevirtual oru.xix ()V
      // 2d: iload 3
      // 2e: ifeq ff
      // 31: goto 38
      // 34: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 37: athrow
      // 38: aload 0
      // 39: invokestatic gis.imr ()I
      // 3c: putfield oru.zb_ I
      // 3f: aload 0
      // 40: invokestatic p9t.gi2 ()I
      // 43: putfield oru.mqx I
      // 46: aload 0
      // 47: getfield oru.zg_ Z
      // 4a: goto 51
      // 4d: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 50: athrow
      // 51: iload 3
      // 52: ifne c2
      // 55: ifeq 6d
      // 58: goto 5f
      // 5b: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5e: athrow
      // 5f: aload 0
      // 60: invokestatic gis.u8i ()I
      // 63: putfield oru.vxw I
      // 66: goto 6d
      // 69: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6c: athrow
      // 6d: aload 0
      // 6e: sipush 9728
      // 71: invokevirtual oru.adf (I)V
      // 74: aload 0
      // 75: getfield oru.mqx I
      // 78: invokestatic hzu.t30 (I)V
      // 7b: sipush 3553
      // 7e: bipush 0
      // 7f: ldc 32856
      // 81: nop
      // 82: aload 0
      // 83: getfield oru.ntc I
      // 86: aload 0
      // 87: getfield oru.f86 I
      // 8a: bipush 0
      // 8b: sipush 6408
      // 8e: sipush 5121
      // 91: aconst_null
      // 92: checkcast java/nio/ByteBuffer
      // 95: invokestatic org/lwjgl/opengl/GL11.glTexImage2D (IIIIIIIILjava/nio/ByteBuffer;)V
      // 98: getstatic gis.cf1 I
      // 9b: aload 0
      // 9c: getfield oru.zb_ I
      // 9f: invokestatic gis.ghy (II)V
      // a2: getstatic gis.cf1 I
      // a5: getstatic gis.skr I
      // a8: sipush 3553
      // ab: aload 0
      // ac: getfield oru.mqx I
      // af: bipush 0
      // b0: invokestatic gis.men (IIIII)V
      // b3: aload 0
      // b4: iload 3
      // b5: ifne fc
      // b8: getfield oru.zg_ Z
      // bb: goto c2
      // be: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c1: athrow
      // c2: ifeq f7
      // c5: getstatic gis.eau I
      // c8: aload 0
      // c9: getfield oru.vxw I
      // cc: invokestatic gis.zc0 (II)V
      // cf: getstatic gis.eau I
      // d2: ldc 33190
      // d4: nop
      // d5: aload 0
      // d6: getfield oru.ntc I
      // d9: aload 0
      // da: getfield oru.f86 I
      // dd: invokestatic gis.noz (IIII)V
      // e0: getstatic gis.cf1 I
      // e3: getstatic gis.af2 I
      // e6: getstatic gis.eau I
      // e9: aload 0
      // ea: getfield oru.vxw I
      // ed: invokestatic gis.bz9 (IIII)V
      // f0: goto f7
      // f3: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // f6: athrow
      // f7: aload 0
      // f8: invokevirtual oru.xix ()V
      // fb: aload 0
      // fc: invokevirtual oru.ihk ()V
      // ff: return
   }

   public void adf(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: invokestatic gis.gu5 ()Z
      // 07: iload 2
      // 08: ifne 57
      // 0b: ifeq 5a
      // 0e: goto 15
      // 11: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: aload 0
      // 16: iload 1
      // 17: putfield oru.o0i I
      // 1a: aload 0
      // 1b: getfield oru.mqx I
      // 1e: invokestatic hzu.t30 (I)V
      // 21: sipush 3553
      // 24: sipush 10241
      // 27: iload 1
      // 28: i2f
      // 29: invokestatic org/lwjgl/opengl/GL11.glTexParameterf (IIF)V
      // 2c: sipush 3553
      // 2f: sipush 10240
      // 32: iload 1
      // 33: i2f
      // 34: invokestatic org/lwjgl/opengl/GL11.glTexParameterf (IIF)V
      // 37: sipush 3553
      // 3a: sipush 10242
      // 3d: ldc 10496.0
      // 3f: nop
      // 40: invokestatic org/lwjgl/opengl/GL11.glTexParameterf (IIF)V
      // 43: sipush 3553
      // 46: sipush 10243
      // 49: ldc 10496.0
      // 4b: nop
      // 4c: invokestatic org/lwjgl/opengl/GL11.glTexParameterf (IIF)V
      // 4f: bipush 0
      // 50: goto 57
      // 53: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 56: athrow
      // 57: invokestatic hzu.t30 (I)V
      // 5a: return
   }

   public void y_x() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic oru.a J
      // 03: ldc2_w 55020635722126
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: getstatic gis.cf1 I
      // 0f: invokestatic gis.mw0 (I)I
      // 12: istore 4
      // 14: iload 4
      // 16: getstatic gis.d6n I
      // 19: iload 3
      // 1a: ifeq 33
      // 1d: if_icmpeq ff
      // 20: goto 27
      // 23: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26: athrow
      // 27: iload 4
      // 29: getstatic gis.gff I
      // 2c: goto 33
      // 2f: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: iload 3
      // 34: ifeq 60
      // 37: if_icmpne 5b
      // 3a: goto 41
      // 3d: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 40: athrow
      // 41: new java/lang/RuntimeException
      // 44: dup
      // 45: sipush 25564
      // 48: ldc2_w 8391406126798246612
      // 4b: lload 1
      // 4c: lxor
      // 4d: invokedynamic a (IJ)Ljava/lang/String; bsm=oru.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: nop
      // 53: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 56: athrow
      // 57: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5a: athrow
      // 5b: iload 4
      // 5d: getstatic gis.qkh I
      // 60: iload 3
      // 61: ifeq 8d
      // 64: if_icmpne 88
      // 67: goto 6e
      // 6a: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6d: athrow
      // 6e: new java/lang/RuntimeException
      // 71: dup
      // 72: sipush 19511
      // 75: ldc2_w 7052828241689230649
      // 78: lload 1
      // 79: lxor
      // 7a: invokedynamic a (IJ)Ljava/lang/String; bsm=oru.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: nop
      // 80: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 83: athrow
      // 84: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 87: athrow
      // 88: iload 4
      // 8a: getstatic gis.qt6 I
      // 8d: iload 3
      // 8e: ifeq ba
      // 91: if_icmpne b5
      // 94: goto 9b
      // 97: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9a: athrow
      // 9b: new java/lang/RuntimeException
      // 9e: dup
      // 9f: sipush 24315
      // a2: ldc2_w 8718236119094112244
      // a5: lload 1
      // a6: lxor
      // a7: invokedynamic a (IJ)Ljava/lang/String; bsm=oru.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: nop
      // ad: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // b0: athrow
      // b1: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b4: athrow
      // b5: iload 4
      // b7: getstatic gis.ec5 I
      // ba: if_icmpne d7
      // bd: new java/lang/RuntimeException
      // c0: dup
      // c1: sipush 8765
      // c4: ldc2_w 9057971602571547440
      // c7: lload 1
      // c8: lxor
      // c9: invokedynamic a (IJ)Ljava/lang/String; bsm=oru.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: nop
      // cf: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // d2: athrow
      // d3: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // d6: athrow
      // d7: new java/lang/RuntimeException
      // da: dup
      // db: new java/lang/StringBuilder
      // de: dup
      // df: invokespecial java/lang/StringBuilder.<init> ()V
      // e2: sipush 24510
      // e5: ldc2_w 4389133322738151090
      // e8: lload 1
      // e9: lxor
      // ea: invokedynamic a (IJ)Ljava/lang/String; bsm=oru.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ef: nop
      // f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // f3: iload 4
      // f5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // fb: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // fe: athrow
      // ff: return
   }

   public void fth() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: invokestatic gis.gu5 ()Z
      // 07: iload 1
      // 08: ifeq 20
      // 0b: ifeq 23
      // 0e: goto 15
      // 11: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: aload 0
      // 16: getfield oru.mqx I
      // 19: goto 20
      // 1c: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: invokestatic hzu.t30 (I)V
      // 23: return
   }

   public void ihk() {
      int var1 = OpaquePredicate.b();

      byte var10000;
      label20: {
         try {
            var10000 = gis.gu5();
            if (var1 == 0) {
               break label20;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (RuntimeException var2) {
            throw a(var2);
         }

         var10000 = 0;
      }

      hzu.t30(var10000);
   }

   public void mou(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: invokestatic gis.gu5 ()Z
      // 07: iload 2
      // 08: ifne 27
      // 0b: ifeq 42
      // 0e: goto 15
      // 11: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: getstatic gis.cf1 I
      // 18: aload 0
      // 19: getfield oru.zb_ I
      // 1c: invokestatic gis.ghy (II)V
      // 1f: iload 1
      // 20: goto 27
      // 23: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26: athrow
      // 27: iload 2
      // 28: ifne 36
      // 2b: ifeq 42
      // 2e: goto 35
      // 31: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 34: athrow
      // 35: bipush 0
      // 36: bipush 0
      // 37: aload 0
      // 38: getfield oru.r_a I
      // 3b: aload 0
      // 3c: getfield oru.s1h I
      // 3f: invokestatic hzu.fb6 (IIII)V
      // 42: return
   }

   public void _zc() {
      int var1 = OpaquePredicate.b();

      int var10000;
      label20: {
         try {
            var10000 = gis.gu5();
            if (var1 == 0) {
               break label20;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (RuntimeException var2) {
            throw a(var2);
         }

         var10000 = gis.cf1;
      }

      gis.ghy(var10000, 0);
   }

   public void dty(float var1, float var2, float var3, float var4) {
      this.dq3[0] = var1;
      this.dq3[1] = var2;
      this.dq3[2] = var3;
      this.dq3[3] = var4;
   }

   public void ytj(int var1, int var2) {
      this.mk8(var1, var2, true);
   }

   public void mk8(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: invokestatic gis.gu5 ()Z
      // 008: iload 4
      // 00a: ifeq 066
      // 00d: ifeq 165
      // 010: goto 017
      // 013: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 016: athrow
      // 017: bipush 1
      // 018: bipush 1
      // 019: bipush 1
      // 01a: bipush 0
      // 01b: invokestatic hzu.y4q (ZZZZ)V
      // 01e: invokestatic hzu._o4 ()V
      // 021: bipush 0
      // 022: invokestatic hzu.jun (Z)V
      // 025: sipush 5889
      // 028: invokestatic hzu.ah8 (I)V
      // 02b: invokestatic hzu.zwy ()V
      // 02e: dconst_0
      // 02f: iload 1
      // 030: i2d
      // 031: iload 2
      // 032: i2d
      // 033: dconst_0
      // 034: ldc2_w 1000.0
      // 037: ldc2_w 3000.0
      // 03a: invokestatic hzu.bj8 (DDDDDD)V
      // 03d: sipush 5888
      // 040: invokestatic hzu.ah8 (I)V
      // 043: invokestatic hzu.zwy ()V
      // 046: fconst_0
      // 047: fconst_0
      // 048: ldc -2000.0
      // 04a: nop
      // 04b: invokestatic hzu.a4k (FFF)V
      // 04e: bipush 0
      // 04f: bipush 0
      // 050: iload 1
      // 051: iload 2
      // 052: invokestatic hzu.fb6 (IIII)V
      // 055: invokestatic hzu.rqj ()V
      // 058: invokestatic hzu.fpt ()V
      // 05b: invokestatic hzu.vtj ()V
      // 05e: iload 3
      // 05f: goto 066
      // 062: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 065: athrow
      // 066: iload 4
      // 068: ifeq 08e
      // 06b: ifeq 082
      // 06e: goto 075
      // 071: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 074: athrow
      // 075: invokestatic hzu.ux6 ()V
      // 078: invokestatic hzu.avm ()V
      // 07b: goto 082
      // 07e: invokestatic oru.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 081: athrow
      // 082: fconst_1
      // 083: fconst_1
      // 084: fconst_1
      // 085: fconst_1
      // 086: invokestatic hzu.wn0 (FFFF)V
      // 089: aload 0
      // 08a: invokevirtual oru.fth ()V
      // 08d: iload 1
      // 08e: i2f
      // 08f: fstore 5
      // 091: iload 2
      // 092: i2f
      // 093: fstore 6
      // 095: aload 0
      // 096: getfield oru.r_a I
      // 099: i2f
      // 09a: aload 0
      // 09b: getfield oru.ntc I
      // 09e: i2f
      // 09f: fdiv
      // 0a0: fstore 7
      // 0a2: aload 0
      // 0a3: getfield oru.s1h I
      // 0a6: i2f
      // 0a7: aload 0
      // 0a8: getfield oru.f86 I
      // 0ab: i2f
      // 0ac: fdiv
      // 0ad: fstore 8
      // 0af: invokestatic jom.yut ()Ljom;
      // 0b2: astore 9
      // 0b4: aload 9
      // 0b6: invokevirtual jom.zuq ()Lq3g;
      // 0b9: astore 10
      // 0bb: aload 10
      // 0bd: bipush 7
      // 0bf: getstatic gnl.rad Lbe7;
      // 0c2: invokevirtual q3g.ezr (ILbe7;)V
      // 0c5: aload 10
      // 0c7: dconst_0
      // 0c8: fload 6
      // 0ca: f2d
      // 0cb: dconst_0
      // 0cc: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0cf: dconst_0
      // 0d0: dconst_0
      // 0d1: invokevirtual q3g.h0a (DD)Lq3g;
      // 0d4: sipush 255
      // 0d7: sipush 255
      // 0da: sipush 255
      // 0dd: sipush 255
      // 0e0: invokevirtual q3g.fje (IIII)Lq3g;
      // 0e3: invokevirtual q3g.pzw ()V
      // 0e6: aload 10
      // 0e8: fload 5
      // 0ea: f2d
      // 0eb: fload 6
      // 0ed: f2d
      // 0ee: dconst_0
      // 0ef: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0f2: fload 7
      // 0f4: f2d
      // 0f5: dconst_0
      // 0f6: invokevirtual q3g.h0a (DD)Lq3g;
      // 0f9: sipush 255
      // 0fc: sipush 255
      // 0ff: sipush 255
      // 102: sipush 255
      // 105: invokevirtual q3g.fje (IIII)Lq3g;
      // 108: invokevirtual q3g.pzw ()V
      // 10b: aload 10
      // 10d: fload 5
      // 10f: f2d
      // 110: dconst_0
      // 111: dconst_0
      // 112: invokevirtual q3g.g5o (DDD)Lq3g;
      // 115: fload 7
      // 117: f2d
      // 118: fload 8
      // 11a: f2d
      // 11b: invokevirtual q3g.h0a (DD)Lq3g;
      // 11e: sipush 255
      // 121: sipush 255
      // 124: sipush 255
      // 127: sipush 255
      // 12a: invokevirtual q3g.fje (IIII)Lq3g;
      // 12d: invokevirtual q3g.pzw ()V
      // 130: aload 10
      // 132: dconst_0
      // 133: dconst_0
      // 134: dconst_0
      // 135: invokevirtual q3g.g5o (DDD)Lq3g;
      // 138: dconst_0
      // 139: fload 8
      // 13b: f2d
      // 13c: invokevirtual q3g.h0a (DD)Lq3g;
      // 13f: sipush 255
      // 142: sipush 255
      // 145: sipush 255
      // 148: sipush 255
      // 14b: invokevirtual q3g.fje (IIII)Lq3g;
      // 14e: invokevirtual q3g.pzw ()V
      // 151: aload 9
      // 153: invokevirtual jom.q7g ()V
      // 156: aload 0
      // 157: invokevirtual oru.ihk ()V
      // 15a: bipush 1
      // 15b: invokestatic hzu.jun (Z)V
      // 15e: bipush 1
      // 15f: bipush 1
      // 160: bipush 1
      // 161: bipush 1
      // 162: invokestatic hzu.y4q (ZZZZ)V
      // 165: return
   }

   public void xix() {
      this.mou(true);
      int var10000 = OpaquePredicate.c();
      hzu.ejn(this.dq3[0], this.dq3[1], this.dq3[2], this.dq3[3]);
      int var1 = var10000;
      short var2 = 16384;

      label21: {
         label20: {
            try {
               var4 = this.zg_;
               if (var1 != 0) {
                  break label21;
               }

               if (!this.zg_) {
                  break label20;
               }
            } catch (RuntimeException var3) {
               throw a(var3);
            }

            hzu.kc_(1.0);
            var2 |= 256;
         }

         var4 = var2;
      }

      hzu.yg5(var4);
      this._zc();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-874269978045949908L, 7089173083076858251L, MethodHandles.lookup().lookupClass()).a(249732332120252L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 125923909817299L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "!\u0091Ëï\\ÁPY6b\u009cÜÝcIâ\u008eÌËDg¹®¨½\u009d]\u0096´\u0080¯î¨äû9¨ño}\u0016Ï_J^á\u008a¢M]o\u000eß\u0003¾4Wâe,\u001a\"\u0010ptÁâ3\u0099\u001cÃ²ø\u009bÞl\t¬ó3²°\u008a\b\u0084ßøkH¥ß^+\u0096Ø7Â\u001eÈëD!ù4++\u001bÞ\u0089\u009b<nÚOÉ^Ò¾%*\u008bu\u0004w 9·9¤-P\u008eÆ¼C-¿\u007fO?2ß$¬\u001e O(\u0007\u008b*Ò°ý\u008añó\u00124lcP\u0082\u001fUNÊ×·FMo\u0097«rÆØ8Å»ÙÉ¦\u0093Ø\u0000$\u008c\u0095d\u008e¹\u0090â\u0015N\u0011±¶ÒÚ\u0080ýM¥\u000e\u001bX4ä\u0080sf Å+`õÎ´fF~ z,n[1ÇI\u001aÑ%H 3\u0098AºÚã";
      int var8 = "!\u0091Ëï\\ÁPY6b\u009cÜÝcIâ\u008eÌËDg¹®¨½\u009d]\u0096´\u0080¯î¨äû9¨ño}\u0016Ï_J^á\u008a¢M]o\u000eß\u0003¾4Wâe,\u001a\"\u0010ptÁâ3\u0099\u001cÃ²ø\u009bÞl\t¬ó3²°\u008a\b\u0084ßøkH¥ß^+\u0096Ø7Â\u001eÈëD!ù4++\u001bÞ\u0089\u009b<nÚOÉ^Ò¾%*\u008bu\u0004w 9·9¤-P\u008eÆ¼C-¿\u007fO?2ß$¬\u001e O(\u0007\u008b*Ò°ý\u008añó\u00124lcP\u0082\u001fUNÊ×·FMo\u0097«rÆØ8Å»ÙÉ¦\u0093Ø\u0000$\u008c\u0095d\u008e¹\u0090â\u0015N\u0011±¶ÒÚ\u0080ýM¥\u000e\u001bX4ä\u0080sf Å+`õÎ´fF~ z,n[1ÇI\u001aÑ%H 3\u0098AºÚã"
         .length();
      char var5 = 'X';
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
                     c = new String[5];
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

                  var6 = "Ç\u00974A\u0094àÂ\u0093Ò\u0001Ý²¾äÁÁ¯Oã\u00887\u0084ó\u001d` _N\u0091\u000e?@ê\u001e¶õÂ\u0015\u0088\u001e\u0001zTY\u0087¶\n\u0091ÏTûübâÄÒ\u007f:À\u008ae»ÑÖ@«\t÷ö\u0088\u0083øØ\u000b\r\u0010ð»\u001f\u0098¢\u0099°\u008f¶\u001céýÑóh`2.Â\u001f\u0004ÿ\u001bâm\u0017n\u001f>\u009d7tª\u0087\u0097÷2Lýü\u0018C{N\u0090U3MByQÑÔ";
                  var8 = "Ç\u00974A\u0094àÂ\u0093Ò\u0001Ý²¾äÁÁ¯Oã\u00887\u0084ó\u001d` _N\u0091\u000e?@ê\u001e¶õÂ\u0015\u0088\u001e\u0001zTY\u0087¶\n\u0091ÏTûübâÄÒ\u007f:À\u008ae»ÑÖ@«\t÷ö\u0088\u0083øØ\u000b\r\u0010ð»\u001f\u0098¢\u0099°\u008f¶\u001céýÑóh`2.Â\u001f\u0004ÿ\u001bâm\u0017n\u001f>\u009d7tª\u0087\u0097÷2Lýü\u0018C{N\u0090U3MByQÑÔ"
                     .length();
                  var5 = '@';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7825;
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
            throw new RuntimeException("oru", var10);
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
         throw new RuntimeException("oru" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
