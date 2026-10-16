import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class u98 extends sq9 {
   public static final h76 fcp;
   public static final h76 sjz;
   public static final h76 cvu;

   public u98(x54$lti var1) {
      super(p3y.fdu, var1._fn());
      this.y8l(this._8_.c32().zvi(fcp, false).zvi(sjz, false).zvi(cvu, false));
      this.i3l(uja.yj_);
   }

   @Override
   public zfz w1b(zfz param1, m5n param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: getstatic u98.em9 Lqx_;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast vt2
      // 11: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 14: astore 5
      // 16: aload 5
      // 18: getstatic vt2$y0s.zty Lvt2$y0s;
      // 1b: iload 4
      // 1d: ifne 86
      // 20: if_acmpne 7a
      // 23: goto 2a
      // 26: invokestatic u98.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 2
      // 2b: aload 3
      // 2c: invokevirtual mew.y8e ()Lmew;
      // 2f: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 34: iload 4
      // 36: ifne ed
      // 39: goto 40
      // 3c: invokestatic u98.a (Loov;)Loov;
      // 3f: athrow
      // 40: invokeinterface zfz.r_y ()Le0x; 1
      // 45: getstatic ox_.nu3 Le0x;
      // 48: if_acmpeq d9
      // 4b: goto 52
      // 4e: invokestatic u98.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 2
      // 53: aload 3
      // 54: invokevirtual mew.o_8 ()Lmew;
      // 57: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 5c: iload 4
      // 5e: ifne ed
      // 61: goto 68
      // 64: invokestatic u98.a (Loov;)Loov;
      // 67: athrow
      // 68: invokeinterface zfz.r_y ()Le0x; 1
      // 6d: getstatic ox_.nu3 Le0x;
      // 70: if_acmpeq d9
      // 73: goto 7a
      // 76: invokestatic u98.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 5
      // 7c: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 7f: goto 86
      // 82: invokestatic u98.a (Loov;)Loov;
      // 85: athrow
      // 86: if_acmpne ee
      // 89: aload 2
      // 8a: aload 3
      // 8b: invokevirtual mew.idu ()Lmew;
      // 8e: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 93: iload 4
      // 95: ifne ed
      // 98: goto 9f
      // 9b: invokestatic u98.a (Loov;)Loov;
      // 9e: athrow
      // 9f: invokeinterface zfz.r_y ()Le0x; 1
      // a4: getstatic ox_.nu3 Le0x;
      // a7: if_acmpeq d9
      // aa: goto b1
      // ad: invokestatic u98.a (Loov;)Loov;
      // b0: athrow
      // b1: aload 2
      // b2: aload 3
      // b3: invokevirtual mew.z6x ()Lmew;
      // b6: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // bb: iload 4
      // bd: ifne ef
      // c0: goto c7
      // c3: invokestatic u98.a (Loov;)Loov;
      // c6: athrow
      // c7: invokeinterface zfz.r_y ()Le0x; 1
      // cc: getstatic ox_.nu3 Le0x;
      // cf: if_acmpne ee
      // d2: goto d9
      // d5: invokestatic u98.a (Loov;)Loov;
      // d8: athrow
      // d9: aload 1
      // da: getstatic u98.cvu Lh76;
      // dd: bipush 1
      // de: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // e1: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // e6: goto ed
      // e9: invokestatic u98.a (Loov;)Loov;
      // ec: athrow
      // ed: astore 1
      // ee: aload 1
      // ef: areturn
   }

   @Override
   public boolean ctq(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual mew.eve ()Lmew;
      // 09: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0c: invokeinterface zfz.r_y ()Le0x; 1
      // 11: invokevirtual e0x.p1r ()Lp3y;
      // 14: invokevirtual p3y.gk6 ()Z
      // 17: iload 3
      // 18: ifeq 32
      // 1b: ifeq 35
      // 1e: goto 25
      // 21: invokestatic u98.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: aload 2
      // 28: invokespecial sq9.ctq (Lt9d;Lmew;)Z
      // 2b: goto 32
      // 2e: invokestatic u98.a (Loov;)Loov;
      // 31: athrow
      // 32: goto 36
      // 35: bipush 0
      // 36: ireturn
   }

   @Override
   public nh4 m__(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 3
      // 06: getstatic u98.fcp Lh76;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Boolean
      // 11: iload 4
      // 13: ifeq 32
      // 16: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19: ifeq 29
      // 1c: goto 23
      // 1f: invokestatic u98.a (Loov;)Loov;
      // 22: athrow
      // 23: aconst_null
      // 24: areturn
      // 25: invokestatic u98.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 3
      // 2a: getstatic u98.em9 Lqx_;
      // 2d: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 32: checkcast vt2
      // 35: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 38: astore 5
      // 3a: aload 5
      // 3c: getstatic vt2$y0s.zty Lvt2$y0s;
      // 3f: if_acmpne 7f
      // 42: new nh4
      // 45: dup
      // 46: aload 2
      // 47: invokevirtual mew.getX ()I
      // 4a: i2d
      // 4b: aload 2
      // 4c: invokevirtual mew.getY ()I
      // 4f: i2d
      // 50: aload 2
      // 51: invokevirtual mew.getZ ()I
      // 54: i2f
      // 55: ldc 0.375
      // 57: nop
      // 58: fadd
      // 59: f2d
      // 5a: aload 2
      // 5b: invokevirtual mew.getX ()I
      // 5e: bipush 1
      // 5f: iadd
      // 60: i2d
      // 61: aload 2
      // 62: invokevirtual mew.getY ()I
      // 65: i2f
      // 66: ldc 1.5
      // 68: nop
      // 69: fadd
      // 6a: f2d
      // 6b: aload 2
      // 6c: invokevirtual mew.getZ ()I
      // 6f: i2f
      // 70: ldc 0.625
      // 72: nop
      // 73: fadd
      // 74: f2d
      // 75: invokespecial nh4.<init> (DDDDDD)V
      // 78: goto b5
      // 7b: invokestatic u98.a (Loov;)Loov;
      // 7e: athrow
      // 7f: new nh4
      // 82: dup
      // 83: aload 2
      // 84: invokevirtual mew.getX ()I
      // 87: i2f
      // 88: ldc 0.375
      // 8a: nop
      // 8b: fadd
      // 8c: f2d
      // 8d: aload 2
      // 8e: invokevirtual mew.getY ()I
      // 91: i2d
      // 92: aload 2
      // 93: invokevirtual mew.getZ ()I
      // 96: i2d
      // 97: aload 2
      // 98: invokevirtual mew.getX ()I
      // 9b: i2f
      // 9c: ldc 0.625
      // 9e: nop
      // 9f: fadd
      // a0: f2d
      // a1: aload 2
      // a2: invokevirtual mew.getY ()I
      // a5: i2f
      // a6: ldc 1.5
      // a8: nop
      // a9: fadd
      // aa: f2d
      // ab: aload 2
      // ac: invokevirtual mew.getZ ()I
      // af: bipush 1
      // b0: iadd
      // b1: i2d
      // b2: invokespecial nh4.<init> (DDDDDD)V
      // b5: areturn
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0b: getstatic u98.em9 Lqx_;
      // 0e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 13: checkcast vt2
      // 16: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 19: astore 4
      // 1b: iload 3
      // 1c: ifeq 43
      // 1f: aload 4
      // 21: getstatic vt2$y0s.zty Lvt2$y0s;
      // 24: if_acmpne 47
      // 27: goto 2e
      // 2a: invokestatic u98.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: fconst_0
      // 30: fconst_0
      // 31: ldc 0.375
      // 33: nop
      // 34: fconst_1
      // 35: fconst_1
      // 36: ldc 0.625
      // 38: nop
      // 39: invokevirtual u98.xl4 (FFFFFF)V
      // 3c: goto 43
      // 3f: invokestatic u98.a (Loov;)Loov;
      // 42: athrow
      // 43: iload 3
      // 44: ifne 5c
      // 47: aload 0
      // 48: ldc 0.375
      // 4a: nop
      // 4b: fconst_0
      // 4c: fconst_0
      // 4d: ldc 0.625
      // 4f: nop
      // 50: fconst_1
      // 51: fconst_1
      // 52: invokevirtual u98.xl4 (FFFFFF)V
      // 55: goto 5c
      // 58: invokestatic u98.a (Loov;)Loov;
      // 5b: athrow
      // 5c: return
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean iwf(m5n var1, mew var2) {
      return (Boolean)var1.getBlockState(var2).dil(fcp);
   }

   @Override
   public zfz qk_(OpaquePredicate var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, Entity var8) {
      return this.l4i().zvi(em9, var8.u0f()).zvi(fcp, false).zvi(sjz, false).zvi(cvu, false);
   }

   @Override
   public boolean cl2(OpaquePredicate var1, mew var2, zfz var3, ha9 var4, vt2 var5, float var6, float var7, float var8) {
      int var9 = OpaquePredicate.b();

      label64: {
         label59: {
            label58: {
               try {
                  boolean var10000 = (Boolean)var3.dil(fcp);
                  if (var9 == 0) {
                     break label58;
                  }

                  if (!var10000) {
                     break label59;
                  }
               } catch (oov var13) {
                  throw a(var13);
               }

               var3 = var3.zvi(fcp, false);
               var1.vct(var2, var3, 2);
            }

            if (var9 != 0) {
               break label64;
            }
         }

         vt2 var10 = vt2.ni1((double)var4.x5k);

         zfz var14;
         label47: {
            label46: {
               try {
                  var14 = var3;
                  if (var9 == 0) {
                     break label47;
                  }

                  if (var3.dil(em9) != var10.b4b()) {
                     break label46;
                  }
               } catch (oov var12) {
                  throw a(var12);
               }

               var3 = var3.zvi(em9, var10);
            }

            var14 = var3.zvi(fcp, true);
         }

         var3 = var14;
         var1.vct(var2, var3, 2);
      }

      OpaquePredicate var15;
      ha9 var10001;
      short var10002;
      label38: {
         label37: {
            try {
               var15 = var1;
               var10001 = var4;
               var10002 = (Boolean)var3.dil(fcp);
               if (var9 == 0) {
                  break label38;
               }

               if (var10002 != 0) {
                  break label37;
               }
            } catch (oov var11) {
               throw a(var11);
            }

            var10002 = 1006;
            break label38;
         }

         var10002 = 1003;
      }

      var15.pbs(var10001, var10002, var2, 0);
      return true;
   }

   @Override
   public void z3l(OpaquePredicate param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 5
      // 005: aload 1
      // 006: getfield OpaquePredicate.v0f Z
      // 009: iload 5
      // 00b: ifeq 024
      // 00e: ifne 1c4
      // 011: goto 018
      // 014: invokestatic u98.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 1
      // 019: aload 2
      // 01a: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 01d: goto 024
      // 020: invokestatic u98.a (Loov;)Loov;
      // 023: athrow
      // 024: istore 6
      // 026: iload 6
      // 028: iload 5
      // 02a: ifeq 054
      // 02d: ifne 052
      // 030: goto 037
      // 033: invokestatic u98.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 4
      // 039: invokevirtual e0x.scl ()Z
      // 03c: iload 5
      // 03e: ifeq 054
      // 041: goto 048
      // 044: invokestatic u98.a (Loov;)Loov;
      // 047: athrow
      // 048: ifeq 1c4
      // 04b: goto 052
      // 04e: invokestatic u98.a (Loov;)Loov;
      // 051: athrow
      // 052: iload 6
      // 054: iload 5
      // 056: ifeq 0ef
      // 059: ifeq 0e6
      // 05c: goto 063
      // 05f: invokestatic u98.a (Loov;)Loov;
      // 062: athrow
      // 063: aload 3
      // 064: getstatic u98.fcp Lh76;
      // 067: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 06c: checkcast java/lang/Boolean
      // 06f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 072: iload 5
      // 074: ifeq 0ef
      // 077: goto 07e
      // 07a: invokestatic u98.a (Loov;)Loov;
      // 07d: athrow
      // 07e: ifne 0e6
      // 081: goto 088
      // 084: invokestatic u98.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 3
      // 089: getstatic u98.sjz Lh76;
      // 08c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 091: checkcast java/lang/Boolean
      // 094: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 097: iload 5
      // 099: ifeq 0ef
      // 09c: goto 0a3
      // 09f: invokestatic u98.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: ifne 0e6
      // 0a6: goto 0ad
      // 0a9: invokestatic u98.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 1
      // 0ae: aload 2
      // 0af: aload 3
      // 0b0: getstatic u98.fcp Lh76;
      // 0b3: bipush 1
      // 0b4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0b7: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0bc: getstatic u98.sjz Lh76;
      // 0bf: bipush 1
      // 0c0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c3: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0c8: bipush 2
      // 0c9: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0cc: pop
      // 0cd: aload 1
      // 0ce: aconst_null
      // 0cf: checkcast ha9
      // 0d2: sipush 1003
      // 0d5: aload 2
      // 0d6: bipush 0
      // 0d7: invokevirtual OpaquePredicate.pbs (Lha9;ILmew;I)V
      // 0da: iload 5
      // 0dc: ifne 1c4
      // 0df: goto 0e6
      // 0e2: invokestatic u98.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: iload 6
      // 0e8: goto 0ef
      // 0eb: invokestatic u98.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: iload 5
      // 0f1: ifeq 18a
      // 0f4: ifne 181
      // 0f7: goto 0fe
      // 0fa: invokestatic u98.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: aload 3
      // 0ff: getstatic u98.fcp Lh76;
      // 102: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 107: checkcast java/lang/Boolean
      // 10a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 10d: iload 5
      // 10f: ifeq 18a
      // 112: goto 119
      // 115: invokestatic u98.a (Loov;)Loov;
      // 118: athrow
      // 119: ifeq 181
      // 11c: goto 123
      // 11f: invokestatic u98.a (Loov;)Loov;
      // 122: athrow
      // 123: aload 3
      // 124: getstatic u98.sjz Lh76;
      // 127: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 12c: checkcast java/lang/Boolean
      // 12f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 132: iload 5
      // 134: ifeq 18a
      // 137: goto 13e
      // 13a: invokestatic u98.a (Loov;)Loov;
      // 13d: athrow
      // 13e: ifeq 181
      // 141: goto 148
      // 144: invokestatic u98.a (Loov;)Loov;
      // 147: athrow
      // 148: aload 1
      // 149: aload 2
      // 14a: aload 3
      // 14b: getstatic u98.fcp Lh76;
      // 14e: bipush 0
      // 14f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 152: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 157: getstatic u98.sjz Lh76;
      // 15a: bipush 0
      // 15b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 15e: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 163: bipush 2
      // 164: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 167: pop
      // 168: aload 1
      // 169: aconst_null
      // 16a: checkcast ha9
      // 16d: sipush 1006
      // 170: aload 2
      // 171: bipush 0
      // 172: invokevirtual OpaquePredicate.pbs (Lha9;ILmew;I)V
      // 175: iload 5
      // 177: ifne 1c4
      // 17a: goto 181
      // 17d: invokestatic u98.a (Loov;)Loov;
      // 180: athrow
      // 181: iload 6
      // 183: goto 18a
      // 186: invokestatic u98.a (Loov;)Loov;
      // 189: athrow
      // 18a: iload 5
      // 18c: ifeq 1c3
      // 18f: aload 3
      // 190: getstatic u98.sjz Lh76;
      // 193: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 198: checkcast java/lang/Boolean
      // 19b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19e: if_icmpeq 1c4
      // 1a1: goto 1a8
      // 1a4: invokestatic u98.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: aload 1
      // 1a9: aload 2
      // 1aa: aload 3
      // 1ab: getstatic u98.sjz Lh76;
      // 1ae: iload 6
      // 1b0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1b3: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1b8: bipush 2
      // 1b9: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 1bc: goto 1c3
      // 1bf: invokestatic u98.a (Loov;)Loov;
      // 1c2: athrow
      // 1c3: pop
      // 1c4: return
   }

   @Override
   public boolean ron(m5n var1, mew var2, vt2 var3) {
      return true;
   }

   @Override
   public zfz kig(int var1) {
      int var2 = OpaquePredicate.b();

      zfz var10000;
      h76 var10001;
      int var10002;
      label39: {
         label38: {
            try {
               var10000 = this.l4i().zvi(em9, vt2.bm6(var1));
               var10001 = fcp;
               var10002 = var1 & 4;
               if (var2 == 0) {
                  break label39;
               }

               if (var10002 != 0) {
                  break label38;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10002 = 0;
            break label39;
         }

         var10002 = 1;
      }

      try {
         var10000 = var10000.zvi(var10001, Boolean.valueOf((boolean)var10002));
         var10001 = sjz;
         var10002 = var1 & 8;
         if (var2 == 0) {
            return var10000.zvi(sjz, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 != 0) {
            return var10000.zvi(sjz, true);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = OpaquePredicate.b();
      var3 |= ((vt2)var1.dil(em9)).tmy();
      int var2 = var10000;

      label37: {
         label36: {
            try {
               var7 = (Boolean)var1.dil(sjz);
               if (var2 == 0) {
                  break label37;
               }

               if (var7 == 0) {
                  break label36;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var3 |= 8;
         }

         var7 = (Boolean)var1.dil(fcp);
      }

      try {
         if (var2 == 0) {
            return var7;
         }

         if (var7 == 0) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 |= 4;
      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{em9, fcp, sjz, cvu});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3652510562859511202L, 7691504391294816643L, MethodHandles.lookup().lookupClass()).a(51101373821142L);
      // $VF: monitorexit
      long var10 = var10000 ^ 37868906144508L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[3];
      int var6 = 0;
      String var5 = "}\u0007¨Û\u0080/ûm\b:\u001bb\u0019Y\u000e?H\bn\u0001ÈJr§\u007f\u001a";
      int var7 = "}\u0007¨Û\u0080/ûm\b:\u001bb\u0019Y\u000e?H\bn\u0001ÈJr§\u007f\u001a".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = c(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            fcp = h76.d_1(var8[0]);
            sjz = h76.d_1(var8[2]);
            cvu = h76.d_1(var8[1]);
            return;
         }

         var4 = var5.charAt(var3);
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
}
