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

public class dqh extends _f3 {
   private int qbu = -1;
   private static final long c;
   private static final String[] d;
   private static final String[] i;
   private static final Map m = new HashMap(13);

   public dqh(t9d var1) {
      super(var1);
   }

   public dqh(t9d var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   @Override
   public _f3$c3d x38() {
      return _f3$c3d.qut;
   }

   @Override
   public zfz hcw() {
      return ox_.od1.l4i();
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial _f3.xx_ ()V
      // 08: aload 0
      // 09: getfield dqh.qbu I
      // 0c: iload 1
      // 0d: ifne 5a
      // 10: ifle 4f
      // 13: goto 1a
      // 16: invokestatic dqh.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: dup
      // 1c: getfield dqh.qbu I
      // 1f: bipush 1
      // 20: isub
      // 21: putfield dqh.qbu I
      // 24: aload 0
      // 25: getfield dqh.oay Lt9d;
      // 28: getstatic w_0.bac Lw_0;
      // 2b: aload 0
      // 2c: getfield dqh.o2v D
      // 2f: aload 0
      // 30: getfield dqh.kfp D
      // 33: ldc2_w 0.5
      // 36: dadd
      // 37: aload 0
      // 38: getfield dqh.vbd D
      // 3b: dconst_0
      // 3c: dconst_0
      // 3d: dconst_0
      // 3e: bipush 0
      // 3f: newarray 10
      // 41: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 44: iload 1
      // 45: ifeq 86
      // 48: goto 4f
      // 4b: invokestatic dqh.b (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield dqh.qbu I
      // 53: goto 5a
      // 56: invokestatic dqh.b (Loov;)Loov;
      // 59: athrow
      // 5a: iload 1
      // 5b: ifne 95
      // 5e: ifne 86
      // 61: goto 68
      // 64: invokestatic dqh.b (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: aload 0
      // 6a: getfield dqh.icv D
      // 6d: aload 0
      // 6e: getfield dqh.icv D
      // 71: dmul
      // 72: aload 0
      // 73: getfield dqh.bw4 D
      // 76: aload 0
      // 77: getfield dqh.bw4 D
      // 7a: dmul
      // 7b: dadd
      // 7c: invokevirtual dqh.uc4 (D)V
      // 7f: goto 86
      // 82: invokestatic dqh.b (Loov;)Loov;
      // 85: athrow
      // 86: aload 0
      // 87: iload 1
      // 88: ifne 99
      // 8b: getfield dqh.cbi Z
      // 8e: goto 95
      // 91: invokestatic dqh.b (Loov;)Loov;
      // 94: athrow
      // 95: ifeq c0
      // 98: aload 0
      // 99: getfield dqh.icv D
      // 9c: aload 0
      // 9d: getfield dqh.icv D
      // a0: dmul
      // a1: aload 0
      // a2: getfield dqh.bw4 D
      // a5: aload 0
      // a6: getfield dqh.bw4 D
      // a9: dmul
      // aa: dadd
      // ab: dstore 2
      // ac: dload 2
      // ad: ldc2_w 0.009999999776482582
      // b0: dcmpl
      // b1: iflt c0
      // b4: aload 0
      // b5: dload 2
      // b6: invokevirtual dqh.uc4 (D)V
      // b9: goto c0
      // bc: invokestatic dqh.b (Loov;)Loov;
      // bf: athrow
      // c0: return
   }

   @Override
   public boolean m1t(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokevirtual ofh.f8d ()Li2h;
      // 08: astore 4
      // 0a: aload 4
      // 0c: instanceof hy9
      // 0f: iload 3
      // 10: ifeq 6b
      // 13: ifeq 65
      // 16: goto 1d
      // 19: invokestatic dqh.b (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 4
      // 1f: checkcast hy9
      // 22: astore 5
      // 24: aload 5
      // 26: invokevirtual hy9.agj ()Z
      // 29: iload 3
      // 2a: ifeq 6b
      // 2d: ifeq 65
      // 30: goto 37
      // 33: invokestatic dqh.b (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: aload 5
      // 3a: getfield hy9.icv D
      // 3d: aload 5
      // 3f: getfield hy9.icv D
      // 42: dmul
      // 43: aload 5
      // 45: getfield hy9.mop D
      // 48: aload 5
      // 4a: getfield hy9.mop D
      // 4d: dmul
      // 4e: dadd
      // 4f: aload 5
      // 51: getfield hy9.bw4 D
      // 54: aload 5
      // 56: getfield hy9.bw4 D
      // 59: dmul
      // 5a: dadd
      // 5b: invokevirtual dqh.uc4 (D)V
      // 5e: goto 65
      // 61: invokestatic dqh.b (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: aload 1
      // 67: fload 2
      // 68: invokespecial _f3.m1t (Lofh;F)Z
      // 6b: ireturn
   }

   @Override
   public void szd(ofh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic dqh.c J
      // 03: ldc2_w 9483493800509
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: aload 1
      // 0a: invokespecial _f3.szd (Lofh;)V
      // 0d: invokestatic t9d.c ()I
      // 10: aload 0
      // 11: getfield dqh.icv D
      // 14: aload 0
      // 15: getfield dqh.icv D
      // 18: dmul
      // 19: aload 0
      // 1a: getfield dqh.bw4 D
      // 1d: aload 0
      // 1e: getfield dqh.bw4 D
      // 21: dmul
      // 22: dadd
      // 23: dstore 5
      // 25: istore 4
      // 27: aload 1
      // 28: invokevirtual ofh.yto ()Z
      // 2b: iload 4
      // 2d: ifne 84
      // 30: ifne 80
      // 33: goto 3a
      // 36: invokestatic dqh.b (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield dqh.oay Lt9d;
      // 3e: invokevirtual t9d.eir ()Lef9;
      // 41: sipush 12372
      // 44: ldc2_w 6199224590095166542
      // 47: lload 2
      // 48: lxor
      // 49: invokedynamic z (IJ)Ljava/lang/String; bsm=dqh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: nop
      // 4f: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 52: iload 4
      // 54: ifne 84
      // 57: goto 5e
      // 5a: invokestatic dqh.b (Loov;)Loov;
      // 5d: athrow
      // 5e: ifeq 80
      // 61: goto 68
      // 64: invokestatic dqh.b (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: new erg
      // 6c: dup
      // 6d: getstatic ox_.od1 Le0x;
      // 70: bipush 1
      // 71: invokespecial erg.<init> (Le0x;I)V
      // 74: fconst_0
      // 75: invokevirtual dqh.qji (Lerg;F)Lnvf;
      // 78: pop
      // 79: goto 80
      // 7c: invokestatic dqh.b (Loov;)Loov;
      // 7f: athrow
      // 80: aload 1
      // 81: invokevirtual ofh.i0l ()Z
      // 84: iload 4
      // 86: ifne 9e
      // 89: ifne bd
      // 8c: goto 93
      // 8f: invokestatic dqh.b (Loov;)Loov;
      // 92: athrow
      // 93: aload 1
      // 94: invokevirtual ofh.yto ()Z
      // 97: goto 9e
      // 9a: invokestatic dqh.b (Loov;)Loov;
      // 9d: athrow
      // 9e: iload 4
      // a0: ifne ba
      // a3: ifne bd
      // a6: goto ad
      // a9: invokestatic dqh.b (Loov;)Loov;
      // ac: athrow
      // ad: dload 5
      // af: ldc2_w 0.009999999776482582
      // b2: dcmpl
      // b3: goto ba
      // b6: invokestatic dqh.b (Loov;)Loov;
      // b9: athrow
      // ba: iflt ca
      // bd: aload 0
      // be: dload 5
      // c0: invokevirtual dqh.uc4 (D)V
      // c3: goto ca
      // c6: invokestatic dqh.b (Loov;)Loov;
      // c9: athrow
      // ca: return
   }

   public void uc4(double var1) {
      int var3 = t9d.b();
      if (!this.oay.v0f) {
         double var4 = Math.sqrt(var1);

         label23: {
            label22: {
               try {
                  if (var3 == 0) {
                     break label23;
                  }

                  if (!(var4 > 5.0)) {
                     break label22;
                  }
               } catch (oov var6) {
                  throw b(var6);
               }

               var4 = 5.0;
            }

            this.oay.s1r(this, this.o2v, this.kfp, this.vbd, (float)(4.0 + this.z2d.nextDouble() * 1.5 * var4), true);
         }

         this._kl();
      }
   }

   @Override
   public void ibc(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: fload 1
      // 05: ldc 3.0
      // 07: nop
      // 08: iload 3
      // 09: ifne 22
      // 0c: fcmpl
      // 0d: iflt 2f
      // 10: goto 17
      // 13: invokestatic dqh.b (Loov;)Loov;
      // 16: athrow
      // 17: fload 1
      // 18: ldc 10.0
      // 1a: nop
      // 1b: goto 22
      // 1e: invokestatic dqh.b (Loov;)Loov;
      // 21: athrow
      // 22: fdiv
      // 23: fstore 4
      // 25: aload 0
      // 26: fload 4
      // 28: fload 4
      // 2a: fmul
      // 2b: f2d
      // 2c: invokevirtual dqh.uc4 (D)V
      // 2f: aload 0
      // 30: fload 1
      // 31: fload 2
      // 32: invokespecial _f3.ibc (FF)V
      // 35: return
   }

   @Override
   public void xr9(int param1, int param2, int param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: iload 4
      // 07: iload 5
      // 09: ifeq 2d
      // 0c: ifeq 34
      // 0f: goto 16
      // 12: invokestatic dqh.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: iload 5
      // 19: ifeq 31
      // 1c: goto 23
      // 1f: invokestatic dqh.b (Loov;)Loov;
      // 22: athrow
      // 23: getfield dqh.qbu I
      // 26: goto 2d
      // 29: invokestatic dqh.b (Loov;)Loov;
      // 2c: athrow
      // 2d: ifge 34
      // 30: aload 0
      // 31: invokevirtual dqh.dpi ()V
      // 34: return
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: bipush 10
      // 07: if_icmpne 19
      // 0a: aload 0
      // 0b: invokevirtual dqh.dpi ()V
      // 0e: iload 2
      // 0f: ifeq 25
      // 12: goto 19
      // 15: invokestatic dqh.b (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: invokespecial _f3.ptf (B)V
      // 1e: goto 25
      // 21: invokestatic dqh.b (Loov;)Loov;
      // 24: athrow
      // 25: return
   }

   public void dpi() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic dqh.c J
      // 03: ldc2_w 69126328198151
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: bipush 80
      // 0f: putfield dqh.qbu I
      // 12: aload 0
      // 13: getfield dqh.oay Lt9d;
      // 16: getfield t9d.v0f Z
      // 19: iload 3
      // 1a: ifeq 47
      // 1d: ifne 62
      // 20: goto 27
      // 23: invokestatic dqh.b (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield dqh.oay Lt9d;
      // 2b: aload 0
      // 2c: bipush 10
      // 2e: invokevirtual t9d.qyn (Li2h;B)V
      // 31: aload 0
      // 32: iload 3
      // 33: ifeq 4b
      // 36: goto 3d
      // 39: invokestatic dqh.b (Loov;)Loov;
      // 3c: athrow
      // 3d: invokevirtual dqh.o3x ()Z
      // 40: goto 47
      // 43: invokestatic dqh.b (Loov;)Loov;
      // 46: athrow
      // 47: ifne 62
      // 4a: aload 0
      // 4b: getfield dqh.oay Lt9d;
      // 4e: aload 0
      // 4f: sipush 25421
      // 52: ldc2_w 4421971273611092332
      // 55: lload 1
      // 56: lxor
      // 57: invokedynamic z (IJ)Ljava/lang/String; bsm=dqh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: nop
      // 5d: fconst_1
      // 5e: fconst_1
      // 5f: invokevirtual t9d.yfq (Li2h;Ljava/lang/String;FF)V
      // 62: return
   }

   public int sb5() {
      return this.qbu;
   }

   public boolean a18() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield dqh.qbu I
      // 08: iload 1
      // 09: ifne 1f
      // 0c: bipush -1
      // 0d: if_icmple 22
      // 10: goto 17
      // 13: invokestatic dqh.b (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic dqh.b (Loov;)Loov;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   @Override
   public float sx1(vu6 param1, t9d param2, mew param3, zfz param4) {
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
      // 06: iload 5
      // 08: ifne 46
      // 0b: invokevirtual dqh.a18 ()Z
      // 0e: ifeq 45
      // 11: goto 18
      // 14: invokestatic dqh.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 4
      // 1a: invokestatic y0y.al_ (Lzfz;)Z
      // 1d: iload 5
      // 1f: ifne 42
      // 22: goto 29
      // 25: invokestatic dqh.b (Loov;)Loov;
      // 28: athrow
      // 29: ifne 51
      // 2c: goto 33
      // 2f: invokestatic dqh.b (Loov;)Loov;
      // 32: athrow
      // 33: aload 2
      // 34: aload 3
      // 35: invokevirtual mew.nuv ()Lmew;
      // 38: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 3b: goto 42
      // 3e: invokestatic dqh.b (Loov;)Loov;
      // 41: athrow
      // 42: ifne 51
      // 45: aload 0
      // 46: aload 1
      // 47: aload 2
      // 48: aload 3
      // 49: aload 4
      // 4b: invokespecial _f3.sx1 (Lvu6;Lt9d;Lmew;Lzfz;)F
      // 4e: goto 52
      // 51: fconst_0
      // 52: freturn
   }

   @Override
   public boolean kli(vu6 param1, t9d param2, mew param3, zfz param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 6
      // 05: aload 0
      // 06: invokevirtual dqh.a18 ()Z
      // 09: iload 6
      // 0b: ifeq 63
      // 0e: ifeq 51
      // 11: goto 18
      // 14: invokestatic dqh.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 4
      // 1a: invokestatic y0y.al_ (Lzfz;)Z
      // 1d: iload 6
      // 1f: ifeq 42
      // 22: goto 29
      // 25: invokestatic dqh.b (Loov;)Loov;
      // 28: athrow
      // 29: ifne 66
      // 2c: goto 33
      // 2f: invokestatic dqh.b (Loov;)Loov;
      // 32: athrow
      // 33: aload 2
      // 34: aload 3
      // 35: invokevirtual mew.nuv ()Lmew;
      // 38: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 3b: goto 42
      // 3e: invokestatic dqh.b (Loov;)Loov;
      // 41: athrow
      // 42: iload 6
      // 44: ifeq 63
      // 47: ifne 66
      // 4a: goto 51
      // 4d: invokestatic dqh.b (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: aload 1
      // 53: aload 2
      // 54: aload 3
      // 55: aload 4
      // 57: fload 5
      // 59: invokespecial _f3.kli (Lvu6;Lt9d;Lmew;Lzfz;F)Z
      // 5c: goto 63
      // 5f: invokestatic dqh.b (Loov;)Loov;
      // 62: athrow
      // 63: goto 67
      // 66: bipush 0
      // 67: ireturn
   }

   @Override
   public void cjb(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic dqh.c J
      // 03: ldc2_w 71187374044238
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: iload 4
      // 11: ifne 3e
      // 14: invokespecial _f3.cjb (Lbdo;)V
      // 17: aload 1
      // 18: sipush 7777
      // 1b: ldc2_w 6306438898719788042
      // 1e: lload 2
      // 1f: lxor
      // 20: invokedynamic z (IJ)Ljava/lang/String; bsm=dqh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: nop
      // 26: bipush 99
      // 28: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 2b: ifeq 52
      // 2e: goto 35
      // 31: invokestatic dqh.b (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: goto 3e
      // 3a: invokestatic dqh.b (Loov;)Loov;
      // 3d: athrow
      // 3e: sipush 7777
      // 41: ldc2_w 6306438898719788042
      // 44: lload 2
      // 45: lxor
      // 46: invokedynamic z (IJ)Ljava/lang/String; bsm=dqh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: nop
      // 4c: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 4f: putfield dqh.qbu I
      // 52: return
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 59446096763109L;
      super.srs(var1);
      var1.iin(c<"z">(30988, 7252770011488126925L ^ var2), this.qbu);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8556790111516358623L, -9162506149111651204L, MethodHandles.lookup().lookupClass()).a(135661969430987L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 113336504950088L;
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
      String var6 = "\u000bú¹Tp|\u009e¤v6ÎÅä\u0085\u0085=Æ\u0092\u0096Ê\u0087#\u0090\nÜ\u0017R5hkÔU \u0087\u001a\u009b(á¤\u001bþ*(è\u0099¼_ßJ\u0011ÿìg)\u0014~ù×¾\"ö5` \t";
      int var8 = "\u000bú¹Tp|\u009e¤v6ÎÅä\u0085\u0085=Æ\u0092\u0096Ê\u0087#\u0090\nÜ\u0017R5hkÔU \u0087\u001a\u009b(á¤\u001bþ*(è\u0099¼_ßJ\u0011ÿìg)\u0014~ù×¾\"ö5` \t"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     i = new String[4];
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

                  var6 = "íTó×\u0096ÙPÜ¶\u000eÄ\u0081\u0007îÄ°\u0010m\u0090\u0093+lQ'r\u00016\u0081\u001bú\u007f³î";
                  var8 = "íTó×\u0096ÙPÜ¶\u000eÄ\u0081\u0007îÄ°\u0010m\u0090\u0093+lQ'r\u00016\u0081\u001bú\u007f³î".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17070;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("dqh", var10);
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
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("dqh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
