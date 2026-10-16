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

public class co7 extends rdv {
   private static final long b;
   private static final String[] h;
   private static final String[] i;
   private static final Map m = new HashMap(13);

   public co7(t9d var1) {
      super(var1);
   }

   public co7(t9d var1, mew var2, vt2 var3) {
      super(var1, var2);
      this.qht(var3);
   }

   @Override
   public void tbj() {
      this.a0c()._i_(8, 5);
      this.a0c().kp2(9, (byte)0);
   }

   @Override
   public float npl() {
      return 0.0F;
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
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual co7.nss (Lofh;)Z
      // 09: iload 3
      // 0a: ifeq 21
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic co7.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic co7.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 1
      // 1e: invokevirtual ofh.yto ()Z
      // 21: iload 3
      // 22: ifeq 84
      // 25: ifne 7e
      // 28: goto 2f
      // 2b: invokestatic co7.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: iload 3
      // 31: ifeq 7f
      // 34: goto 3b
      // 37: invokestatic co7.a (Loov;)Loov;
      // 3a: athrow
      // 3b: invokevirtual co7.t9o ()Lerg;
      // 3e: ifnull 7e
      // 41: goto 48
      // 44: invokestatic co7.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: getfield co7.oay Lt9d;
      // 4c: getfield t9d.v0f Z
      // 4f: iload 3
      // 50: ifeq 7d
      // 53: goto 5a
      // 56: invokestatic co7.a (Loov;)Loov;
      // 59: athrow
      // 5a: ifne 7c
      // 5d: goto 64
      // 60: invokestatic co7.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: aload 1
      // 66: invokevirtual ofh.nra ()Li2h;
      // 69: bipush 0
      // 6a: invokevirtual co7.b4q (Li2h;Z)V
      // 6d: aload 0
      // 6e: aconst_null
      // 6f: checkcast erg
      // 72: invokevirtual co7.cid (Lerg;)V
      // 75: goto 7c
      // 78: invokestatic co7.a (Loov;)Loov;
      // 7b: athrow
      // 7c: bipush 1
      // 7d: ireturn
      // 7e: aload 0
      // 7f: aload 1
      // 80: fload 2
      // 81: invokespecial rdv.m1t (Lofh;F)Z
      // 84: ireturn
   }

   @Override
   public int bli() {
      return 12;
   }

   @Override
   public int cgb() {
      return 12;
   }

   @Override
   public boolean xvv(double var1) {
      double var4 = 16.0;
      int var10000 = t9d.b();
      var4 = var4 * 64.0 * this.y33;
      int var3 = var10000;

      try {
         double var9;
         var10000 = (var9 = var1 - var4 * var4) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
         if (var3 == 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return (boolean)0;
   }

   @Override
   public void r4_(i2h var1) {
      this.b4q(var1, true);
   }

   public void b4q(i2h param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic co7.b J
      // 03: ldc2_w 70882864922479
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: iload 5
      // 10: ifne 3c
      // 13: getfield co7.oay Lt9d;
      // 16: invokevirtual t9d.eir ()Lef9;
      // 19: sipush 12157
      // 1c: ldc2_w 8564243188118371363
      // 1f: lload 3
      // 20: lxor
      // 21: invokedynamic k (IJ)Ljava/lang/String; bsm=co7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: nop
      // 27: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 2a: ifeq d3
      // 2d: goto 34
      // 30: invokestatic co7.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: goto 3c
      // 38: invokestatic co7.a (Loov;)Loov;
      // 3b: athrow
      // 3c: invokevirtual co7.t9o ()Lerg;
      // 3f: astore 6
      // 41: aload 1
      // 42: instanceof ha9
      // 45: iload 5
      // 47: ifne 7d
      // 4a: ifeq 7c
      // 4d: goto 54
      // 50: invokestatic co7.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 1
      // 55: checkcast ha9
      // 58: astore 7
      // 5a: aload 7
      // 5c: getfield ha9.lls Lpj2;
      // 5f: getfield pj2.g40 Z
      // 62: iload 5
      // 64: ifne 7d
      // 67: ifeq 7c
      // 6a: goto 71
      // 6d: invokestatic co7.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 0
      // 72: aload 6
      // 74: invokespecial co7.luu (Lerg;)V
      // 77: return
      // 78: invokestatic co7.a (Loov;)Loov;
      // 7b: athrow
      // 7c: iload 2
      // 7d: ifeq 97
      // 80: aload 0
      // 81: new erg
      // 84: dup
      // 85: getstatic xbr.hqq Lu7m;
      // 88: invokespecial erg.<init> (Lu7m;)V
      // 8b: fconst_0
      // 8c: invokevirtual co7.qji (Lerg;F)Lnvf;
      // 8f: pop
      // 90: goto 97
      // 93: invokestatic co7.a (Loov;)Loov;
      // 96: athrow
      // 97: aload 6
      // 99: ifnull d3
      // 9c: aload 0
      // 9d: iload 5
      // 9f: ifne cc
      // a2: goto a9
      // a5: invokestatic co7.a (Loov;)Loov;
      // a8: athrow
      // a9: getfield co7.z2d Ljava/util/Random;
      // ac: invokevirtual java/util/Random.nextFloat ()F
      // af: aload 0
      // b0: getfield co7.nes F
      // b3: fcmpg
      // b4: ifge d3
      // b7: goto be
      // ba: invokestatic co7.a (Loov;)Loov;
      // bd: athrow
      // be: aload 6
      // c0: invokevirtual erg.yaq ()Lerg;
      // c3: astore 6
      // c5: aload 0
      // c6: aload 6
      // c8: invokespecial co7.luu (Lerg;)V
      // cb: aload 0
      // cc: aload 6
      // ce: fconst_0
      // cf: invokevirtual co7.qji (Lerg;F)Lnvf;
      // d2: pop
      // d3: return
   }

   private void luu(erg var1) {
      long var2 = b ^ 58594249602867L;
      int var4 = t9d.b();

      erg var10000;
      label36: {
         try {
            var10000 = var1;
            if (var4 == 0) {
               break label36;
            }

            if (var1 == null) {
               return;
            }
         } catch (oov var7) {
            throw a(var7);
         }

         var10000 = var1;
      }

      label28: {
         label27: {
            try {
               if (var4 == 0) {
                  break label28;
               }

               if (var10000.gn1() != xbr.kdv) {
                  break label27;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            ucr var5 = ((f58)var1.gn1()).h9y(var1, this.oay);
            var5.xoj.remove(c<"k">(9563, 6755801672518909530L ^ var2) + this.jwu());
         }

         var10000 = var1;
      }

      var10000.s2k((co7)null);
   }

   public erg t9o() {
      return this.a0c().qh4(8);
   }

   public void cid(erg var1) {
      this.ncg(var1, true);
   }

   private void ncg(erg param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 1e
      // 09: ifnull 22
      // 0c: goto 13
      // 0f: invokestatic co7.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual erg.yaq ()Lerg;
      // 17: astore 1
      // 18: aload 1
      // 19: bipush 1
      // 1a: putfield erg.qd2 I
      // 1d: aload 1
      // 1e: aload 0
      // 1f: invokevirtual erg.s2k (Lco7;)V
      // 22: aload 0
      // 23: invokevirtual co7.a0c ()Lwl1;
      // 26: bipush 8
      // 28: aload 1
      // 29: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 2c: aload 0
      // 2d: iload 3
      // 2e: ifne 4c
      // 31: invokevirtual co7.a0c ()Lwl1;
      // 34: bipush 8
      // 36: invokevirtual wl1.pqa (I)V
      // 39: iload 2
      // 3a: ifeq 72
      // 3d: goto 44
      // 40: invokestatic co7.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: goto 4c
      // 48: invokestatic co7.a (Loov;)Loov;
      // 4b: athrow
      // 4c: iload 3
      // 4d: ifne 65
      // 50: getfield co7.aie Lmew;
      // 53: ifnull 72
      // 56: goto 5d
      // 59: invokestatic co7.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: goto 65
      // 61: invokestatic co7.a (Loov;)Loov;
      // 64: athrow
      // 65: getfield co7.oay Lt9d;
      // 68: aload 0
      // 69: getfield co7.aie Lmew;
      // 6c: getstatic ox_.ibw Le0x;
      // 6f: invokevirtual t9d.lw8 (Lmew;Le0x;)V
      // 72: return
   }

   public int fsp() {
      return this.a0c().miz(9);
   }

   public void kgt(int var1) {
      this.mq4(var1, true);
   }

   private void mq4(int param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 2c
      // 09: invokevirtual co7.a0c ()Lwl1;
      // 0c: bipush 9
      // 0e: iload 1
      // 0f: bipush 8
      // 11: irem
      // 12: i2b
      // 13: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 16: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 19: iload 2
      // 1a: ifeq 52
      // 1d: goto 24
      // 20: invokestatic co7.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: goto 2c
      // 28: invokestatic co7.a (Loov;)Loov;
      // 2b: athrow
      // 2c: iload 3
      // 2d: ifeq 45
      // 30: getfield co7.aie Lmew;
      // 33: ifnull 52
      // 36: goto 3d
      // 39: invokestatic co7.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: goto 45
      // 41: invokestatic co7.a (Loov;)Loov;
      // 44: athrow
      // 45: getfield co7.oay Lt9d;
      // 48: aload 0
      // 49: getfield co7.aie Lmew;
      // 4c: getstatic ox_.ibw Le0x;
      // 4f: invokevirtual t9d.lw8 (Lmew;Le0x;)V
      // 52: return
   }

   @Override
   public void srs(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic co7.b J
      // 03: ldc2_w 109747409199354
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifne 75
      // 13: invokevirtual co7.t9o ()Lerg;
      // 16: ifnull 74
      // 19: goto 20
      // 1c: invokestatic co7.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: sipush 4104
      // 24: ldc2_w 8115936877199023302
      // 27: lload 2
      // 28: lxor
      // 29: invokedynamic k (IJ)Ljava/lang/String; bsm=co7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: nop
      // 2f: aload 0
      // 30: invokevirtual co7.t9o ()Lerg;
      // 33: new bdo
      // 36: dup
      // 37: invokespecial bdo.<init> ()V
      // 3a: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // 3d: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 40: aload 1
      // 41: sipush 24372
      // 44: ldc2_w 7557146710669956093
      // 47: lload 2
      // 48: lxor
      // 49: invokedynamic k (IJ)Ljava/lang/String; bsm=co7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: nop
      // 4f: aload 0
      // 50: invokevirtual co7.fsp ()I
      // 53: i2b
      // 54: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 57: aload 1
      // 58: sipush 14574
      // 5b: ldc2_w 9048069682018808866
      // 5e: lload 2
      // 5f: lxor
      // 60: invokedynamic k (IJ)Ljava/lang/String; bsm=co7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: nop
      // 66: aload 0
      // 67: getfield co7.nes F
      // 6a: invokevirtual bdo._i9 (Ljava/lang/String;F)V
      // 6d: goto 74
      // 70: invokestatic co7.a (Loov;)Loov;
      // 73: athrow
      // 74: aload 0
      // 75: aload 1
      // 76: invokespecial rdv.srs (Lbdo;)V
      // 79: return
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
      // 00: getstatic co7.b J
      // 03: ldc2_w 23634299604049
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: sipush 7274
      // 11: ldc2_w 8795475154446597132
      // 14: lload 2
      // 15: lxor
      // 16: invokedynamic k (IJ)Ljava/lang/String; bsm=co7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 1f: astore 5
      // 21: iload 4
      // 23: ifne e1
      // 26: aload 5
      // 28: ifnull dc
      // 2b: goto 32
      // 2e: invokestatic co7.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 5
      // 34: invokevirtual bdo.dq5 ()Z
      // 37: iload 4
      // 39: ifne 89
      // 3c: goto 43
      // 3f: invokestatic co7.a (Loov;)Loov;
      // 42: athrow
      // 43: ifne dc
      // 46: goto 4d
      // 49: invokestatic co7.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: aload 5
      // 50: invokestatic erg.qog (Lbdo;)Lerg;
      // 53: bipush 0
      // 54: invokespecial co7.ncg (Lerg;Z)V
      // 57: aload 0
      // 58: aload 1
      // 59: sipush 30342
      // 5c: ldc2_w 5964416885615122146
      // 5f: lload 2
      // 60: lxor
      // 61: invokedynamic k (IJ)Ljava/lang/String; bsm=co7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: nop
      // 67: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 6a: bipush 0
      // 6b: invokespecial co7.mq4 (IZ)V
      // 6e: aload 1
      // 6f: sipush 19891
      // 72: ldc2_w 5578072335900241362
      // 75: lload 2
      // 76: lxor
      // 77: invokedynamic k (IJ)Ljava/lang/String; bsm=co7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: nop
      // 7d: bipush 99
      // 7f: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 82: goto 89
      // 85: invokestatic co7.a (Loov;)Loov;
      // 88: athrow
      // 89: iload 4
      // 8b: ifne c7
      // 8e: ifeq b5
      // 91: goto 98
      // 94: invokestatic co7.a (Loov;)Loov;
      // 97: athrow
      // 98: aload 0
      // 99: aload 1
      // 9a: sipush 14574
      // 9d: ldc2_w 9048089824395335817
      // a0: lload 2
      // a1: lxor
      // a2: invokedynamic k (IJ)Ljava/lang/String; bsm=co7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: nop
      // a8: invokevirtual bdo.blg (Ljava/lang/String;)F
      // ab: putfield co7.nes F
      // ae: goto b5
      // b1: invokestatic co7.a (Loov;)Loov;
      // b4: athrow
      // b5: aload 1
      // b6: sipush 4184
      // b9: ldc2_w 2773940202677448759
      // bc: lload 2
      // bd: lxor
      // be: invokedynamic k (IJ)Ljava/lang/String; bsm=co7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: nop
      // c4: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // c7: ifeq dc
      // ca: aload 0
      // cb: aload 0
      // cc: invokevirtual co7.fsp ()I
      // cf: bipush 2
      // d0: imul
      // d1: bipush 0
      // d2: invokespecial co7.mq4 (IZ)V
      // d5: goto dc
      // d8: invokestatic co7.a (Loov;)Loov;
      // db: athrow
      // dc: aload 0
      // dd: aload 1
      // de: invokespecial rdv.cjb (Lbdo;)V
      // e1: return
   }

   @Override
   public boolean k25(ha9 param1) {
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
      // 06: ifne 96
      // 09: invokevirtual co7.t9o ()Lerg;
      // 0c: ifnonnull 8e
      // 0f: goto 16
      // 12: invokestatic co7.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual ha9.tsc ()Lerg;
      // 1a: astore 3
      // 1b: aload 3
      // 1c: ifnull 8a
      // 1f: aload 0
      // 20: getfield co7.oay Lt9d;
      // 23: getfield t9d.v0f Z
      // 26: iload 2
      // 27: ifne 4e
      // 2a: goto 31
      // 2d: invokestatic co7.a (Loov;)Loov;
      // 30: athrow
      // 31: ifne 8a
      // 34: goto 3b
      // 37: invokestatic co7.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: aload 3
      // 3d: invokevirtual co7.cid (Lerg;)V
      // 40: aload 1
      // 41: getfield ha9.lls Lpj2;
      // 44: getfield pj2.g40 Z
      // 47: goto 4e
      // 4a: invokestatic co7.a (Loov;)Loov;
      // 4d: athrow
      // 4e: iload 2
      // 4f: ifne 6e
      // 52: ifne 8a
      // 55: goto 5c
      // 58: invokestatic co7.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 3
      // 5d: dup
      // 5e: getfield erg.qd2 I
      // 61: bipush 1
      // 62: isub
      // 63: dup_x1
      // 64: putfield erg.qd2 I
      // 67: goto 6e
      // 6a: invokestatic co7.a (Loov;)Loov;
      // 6d: athrow
      // 6e: ifgt 8a
      // 71: aload 1
      // 72: getfield ha9.up_ Ljnq;
      // 75: aload 1
      // 76: getfield ha9.up_ Ljnq;
      // 79: getfield jnq.nb5 I
      // 7c: aconst_null
      // 7d: checkcast erg
      // 80: invokevirtual jnq.cxl (ILerg;)V
      // 83: goto 8a
      // 86: invokestatic co7.a (Loov;)Loov;
      // 89: athrow
      // 8a: iload 2
      // 8b: ifeq bb
      // 8e: aload 0
      // 8f: goto 96
      // 92: invokestatic co7.a (Loov;)Loov;
      // 95: athrow
      // 96: getfield co7.oay Lt9d;
      // 99: getfield t9d.v0f Z
      // 9c: iload 2
      // 9d: ifne bc
      // a0: ifne bb
      // a3: goto aa
      // a6: invokestatic co7.a (Loov;)Loov;
      // a9: athrow
      // aa: aload 0
      // ab: aload 0
      // ac: invokevirtual co7.fsp ()I
      // af: bipush 1
      // b0: iadd
      // b1: invokevirtual co7.kgt (I)V
      // b4: goto bb
      // b7: invokestatic co7.a (Loov;)Loov;
      // ba: athrow
      // bb: bipush 1
      // bc: ireturn
   }

   public int mqa() {
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
      // 05: iload 1
      // 06: ifeq 1f
      // 09: invokevirtual co7.t9o ()Lerg;
      // 0c: ifnonnull 1e
      // 0f: goto 16
      // 12: invokestatic co7.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: goto 27
      // 1a: invokestatic co7.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokevirtual co7.fsp ()I
      // 22: bipush 8
      // 24: irem
      // 25: bipush 1
      // 26: iadd
      // 27: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2896318338168551686L, -5599022023077905723L, MethodHandles.lookup().lookupClass()).a(181628083541021L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 121716054580609L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "ÍECGÎ\u0001hû\u0096V\u0006òÚ\u0010ßýÝ\u00ad±t\u0016Ö\u0089pÿ¨é\bÄÌhß\u0010BÃÏg¬1CD¥P¼Ñb&Ç\u0089\u0010÷íÏt\u00938å\u0081\u0095Ûæ¡\u0094ÃmÍ ñ'\u008eÍ{\u0089µ¿Ï\u009f`\u0000Óqá\u0007àì\u0005a´/j>ëeZh\u001f¬;h\u0010)\u009d$\u0080'\u009cH\u008c½^éav8\u0089\u0006 V\u000eiÓåK²<ýi\u00adÚ4C\u000eµ½e*¿\u0007Â¨ÇDú<a«ï\u0014³ o\u00907÷\fÁð\u0002£m\u007fö'?Zë87N!!Ð+=~úÅ_'î\u001fÉ";
      int var8 = "ÍECGÎ\u0001hû\u0096V\u0006òÚ\u0010ßýÝ\u00ad±t\u0016Ö\u0089pÿ¨é\bÄÌhß\u0010BÃÏg¬1CD¥P¼Ñb&Ç\u0089\u0010÷íÏt\u00938å\u0081\u0095Ûæ¡\u0094ÃmÍ ñ'\u008eÍ{\u0089µ¿Ï\u009f`\u0000Óqá\u0007àì\u0005a´/j>ëeZh\u001f¬;h\u0010)\u009d$\u0080'\u009cH\u008c½^éav8\u0089\u0006 V\u000eiÓåK²<ýi\u00adÚ4C\u000eµ½e*¿\u0007Â¨ÇDú<a«ï\u0014³ o\u00907÷\fÁð\u0002£m\u007fö'?Zë87N!!Ð+=~úÅ_'î\u001fÉ"
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
                     h = var9;
                     i = new String[9];
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

                  var6 = "\u0095Ù\u00199Ò\u0005\u0086\u0099@\u0085x\"\u0012ìÐ\u0095ïUÝ\n»¤ªàZ1ß\u0084QL\u000ec\u0018\u0092ÇRÀ]ª\u0006ØG´\n¼\u001c#Xÿ7¹j¤Ó\u001bV\u001d";
                  var8 = "\u0095Ù\u00199Ò\u0005\u0086\u0099@\u0085x\"\u0012ìÐ\u0095ïUÝ\n»¤ªàZ1ß\u0084QL\u000ec\u0018\u0092ÇRÀ]ª\u0006ØG´\n¼\u001c#Xÿ7¹j¤Ó\u001bV\u001d"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28832;
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
            throw new RuntimeException("co7", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("co7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
