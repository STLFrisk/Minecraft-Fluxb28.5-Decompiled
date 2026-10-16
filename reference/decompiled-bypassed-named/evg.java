import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class evg extends e0x {
   public static final h76 m0p;
   public static final h76 z0g;
   public static final h76 h98;
   public static final h76 w3p;
   public static final h76 vj8;
   public static final h76 mv6;
   public static final h76 u5x;
   public static final h76 bni;

   public evg() {
      super(p3y.f20);
      this.y8l(this._8_.c32().zvi(m0p, false).zvi(z0g, false).zvi(h98, false).zvi(w3p, false).zvi(vj8, false).zvi(mv6, false).zvi(u5x, false).zvi(bni, false));
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.15625F, 1.0F);
      this._p_(true);
   }

   @Override
   public zfz w1b(zfz var1, m5n var2, mew var3) {
      return var1.zvi(vj8, w51(var2, var3, var1, vt2.z9q))
         .zvi(mv6, w51(var2, var3, var1, vt2.zk4))
         .zvi(u5x, w51(var2, var3, var1, vt2.mxp))
         .zvi(bni, w51(var2, var3, var1, vt2.te4));
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      return null;
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
   public w51 w3x() {
      return w51.mem;
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.eij;
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return xbr.eij;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic evg.z0g Lh76;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Boolean
      // 11: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14: istore 6
      // 16: aload 1
      // 17: aload 2
      // 18: invokevirtual mew.eve ()Lmew;
      // 1b: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 1e: iload 5
      // 20: ifne 2e
      // 23: ifne 31
      // 26: goto 2d
      // 29: invokestatic evg.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 1
      // 2e: goto 32
      // 31: bipush 0
      // 32: istore 7
      // 34: iload 6
      // 36: iload 5
      // 38: ifne 5b
      // 3b: iload 7
      // 3d: if_icmpeq 5c
      // 40: goto 47
      // 43: invokestatic evg.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 0
      // 48: aload 1
      // 49: aload 2
      // 4a: aload 3
      // 4b: bipush 0
      // 4c: invokevirtual evg.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 4f: aload 1
      // 50: aload 2
      // 51: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 54: goto 5b
      // 57: invokestatic evg.a (Loov;)Loov;
      // 5a: athrow
      // 5b: pop
      // 5c: return
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
      // 00: aload 1
      // 01: aload 2
      // 02: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 07: astore 4
      // 09: aload 4
      // 0b: getstatic evg.h98 Lh76;
      // 0e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 13: checkcast java/lang/Boolean
      // 16: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19: istore 5
      // 1b: invokestatic OpaquePredicate.b ()I
      // 1e: aload 4
      // 20: getstatic evg.z0g Lh76;
      // 23: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 28: checkcast java/lang/Boolean
      // 2b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2e: istore 6
      // 30: istore 3
      // 31: iload 6
      // 33: iload 3
      // 34: ifeq 61
      // 37: ifne 58
      // 3a: goto 41
      // 3d: invokestatic evg.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: fconst_0
      // 43: fconst_0
      // 44: fconst_0
      // 45: fconst_1
      // 46: ldc 0.09375
      // 48: nop
      // 49: fconst_1
      // 4a: invokevirtual evg.xl4 (FFFFFF)V
      // 4d: iload 3
      // 4e: ifne 90
      // 51: goto 58
      // 54: invokestatic evg.a (Loov;)Loov;
      // 57: athrow
      // 58: iload 5
      // 5a: goto 61
      // 5d: invokestatic evg.a (Loov;)Loov;
      // 60: athrow
      // 61: ifne 7b
      // 64: aload 0
      // 65: fconst_0
      // 66: fconst_0
      // 67: fconst_0
      // 68: fconst_1
      // 69: ldc 0.5
      // 6b: nop
      // 6c: fconst_1
      // 6d: invokevirtual evg.xl4 (FFFFFF)V
      // 70: iload 3
      // 71: ifne 90
      // 74: goto 7b
      // 77: invokestatic evg.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 0
      // 7c: fconst_0
      // 7d: ldc 0.0625
      // 7f: nop
      // 80: fconst_0
      // 81: fconst_1
      // 82: ldc 0.15625
      // 84: nop
      // 85: fconst_1
      // 86: invokevirtual evg.xl4 (FFFFFF)V
      // 89: goto 90
      // 8c: invokestatic evg.a (Loov;)Loov;
      // 8f: athrow
      // 90: return
   }

   @Override
   public void tfc(OpaquePredicate var1, mew var2, zfz var3) {
      int var4 = OpaquePredicate.b();

      zfz var10000;
      h76 var10001;
      boolean var10002;
      label22: {
         label21: {
            try {
               var10000 = var3;
               var10001 = z0g;
               var10002 = OpaquePredicate.r3_(var1, var2.eve());
               if (var4 == 0) {
                  break label22;
               }

               if (!var10002) {
                  break label21;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var10002 = false;
            break label22;
         }

         var10002 = true;
      }

      var3 = var10000.zvi(var10001, var10002);
      var1.vct(var2, var3, 3);
      this.whx(var1, var2, var3);
   }

   @Override
   public void b8f(OpaquePredicate var1, mew var2, zfz var3) {
      this.whx(var1, var2, var3.zvi(m0p, true));
   }

   @Override
   public void f51(OpaquePredicate param1, mew param2, zfz param3, ha9 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: ifne 57
      // 0c: aload 4
      // 0e: invokevirtual ha9.b5z ()Lerg;
      // 11: iload 5
      // 13: ifne 33
      // 16: goto 1d
      // 19: invokestatic evg.a (Loov;)Loov;
      // 1c: athrow
      // 1d: ifnull 57
      // 20: goto 27
      // 23: invokestatic evg.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 4
      // 29: invokevirtual ha9.b5z ()Lerg;
      // 2c: goto 33
      // 2f: invokestatic evg.a (Loov;)Loov;
      // 32: athrow
      // 33: invokevirtual erg.gn1 ()Lu7m;
      // 36: getstatic xbr.qsl Lguw;
      // 39: if_acmpne 57
      // 3c: aload 1
      // 3d: aload 2
      // 3e: aload 3
      // 3f: getstatic evg.w3p Lh76;
      // 42: bipush 1
      // 43: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 46: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 4b: bipush 4
      // 4c: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 4f: pop
      // 50: goto 57
      // 53: invokestatic evg.a (Loov;)Loov;
      // 56: athrow
      // 57: return
   }

   private void whx(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 2
      // 01: anewarray 87
      // 04: dup
      // 05: bipush 0
      // 06: getstatic vt2.mxp Lvt2;
      // 09: aastore
      // 0a: dup
      // 0b: bipush 1
      // 0c: getstatic vt2.te4 Lvt2;
      // 0f: aastore
      // 10: astore 5
      // 12: invokestatic OpaquePredicate.c ()I
      // 15: aload 5
      // 17: arraylength
      // 18: istore 6
      // 1a: istore 4
      // 1c: bipush 0
      // 1d: istore 7
      // 1f: iload 7
      // 21: iload 6
      // 23: if_icmpge ca
      // 26: aload 5
      // 28: iload 7
      // 2a: aaload
      // 2b: astore 8
      // 2d: bipush 1
      // 2e: istore 9
      // 30: iload 9
      // 32: bipush 42
      // 34: if_icmpge c2
      // 37: aload 2
      // 38: aload 8
      // 3a: iload 9
      // 3c: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 3f: astore 10
      // 41: aload 1
      // 42: aload 10
      // 44: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 47: astore 11
      // 49: iload 4
      // 4b: ifne c5
      // 4e: aload 11
      // 50: invokeinterface zfz.r_y ()Le0x; 1
      // 55: getstatic ox_.r11 Ll2c;
      // 58: iload 4
      // 5a: ifne b4
      // 5d: goto 64
      // 60: invokestatic evg.a (Loov;)Loov;
      // 63: athrow
      // 64: if_acmpne a3
      // 67: goto 6e
      // 6a: invokestatic evg.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 11
      // 70: getstatic l2c._ic Lqx_;
      // 73: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 78: aload 8
      // 7a: invokevirtual vt2.b4b ()Lvt2;
      // 7d: if_acmpne c2
      // 80: goto 87
      // 83: invokestatic evg.a (Loov;)Loov;
      // 86: athrow
      // 87: getstatic ox_.r11 Ll2c;
      // 8a: aload 1
      // 8b: aload 10
      // 8d: aload 11
      // 8f: bipush 0
      // 90: bipush 1
      // 91: iload 9
      // 93: aload 3
      // 94: invokevirtual l2c.khf (Lt9d;Lmew;Lzfz;ZZILzfz;)V
      // 97: iload 4
      // 99: ifeq c2
      // 9c: goto a3
      // 9f: invokestatic evg.a (Loov;)Loov;
      // a2: athrow
      // a3: aload 11
      // a5: invokeinterface zfz.r_y ()Le0x; 1
      // aa: getstatic ox_.s7a Le0x;
      // ad: goto b4
      // b0: invokestatic evg.a (Loov;)Loov;
      // b3: athrow
      // b4: if_acmpeq ba
      // b7: goto c2
      // ba: iinc 9 1
      // bd: iload 4
      // bf: ifeq 30
      // c2: iinc 7 1
      // c5: iload 4
      // c7: ifeq 1f
      // ca: return
   }

   @Override
   public void n9e(OpaquePredicate param1, mew param2, zfz param3, EntityLivingBase param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 5
      // 0b: ifne 2e
      // 0e: ifne 3e
      // 11: goto 18
      // 14: invokestatic evg.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 3
      // 19: getstatic evg.m0p Lh76;
      // 1c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 21: checkcast java/lang/Boolean
      // 24: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 27: goto 2e
      // 2a: invokestatic evg.a (Loov;)Loov;
      // 2d: athrow
      // 2e: ifne 3e
      // 31: aload 0
      // 32: aload 1
      // 33: aload 2
      // 34: invokespecial evg.wuj (Lt9d;Lmew;)V
      // 37: goto 3e
      // 3a: invokestatic evg.a (Loov;)Loov;
      // 3d: athrow
      // 3e: return
   }

   @Override
   public void ff3(OpaquePredicate var1, mew var2, zfz var3, Random var4) {
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 5
      // 0b: ifeq 32
      // 0e: ifne 42
      // 11: goto 18
      // 14: invokestatic evg.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: aload 2
      // 1a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1d: getstatic evg.m0p Lh76;
      // 20: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 25: checkcast java/lang/Boolean
      // 28: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2b: goto 32
      // 2e: invokestatic evg.a (Loov;)Loov;
      // 31: athrow
      // 32: ifeq 42
      // 35: aload 0
      // 36: aload 1
      // 37: aload 2
      // 38: invokespecial evg.wuj (Lt9d;Lmew;)V
      // 3b: goto 42
      // 3e: invokestatic evg.a (Loov;)Loov;
      // 41: athrow
      // 42: return
   }

   private void wuj(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 2
      // 002: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 005: astore 4
      // 007: aload 4
      // 009: getstatic evg.m0p Lh76;
      // 00c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 011: checkcast java/lang/Boolean
      // 014: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 017: istore 5
      // 019: invokestatic OpaquePredicate.b ()I
      // 01c: bipush 0
      // 01d: istore 6
      // 01f: istore 3
      // 020: aload 1
      // 021: aconst_null
      // 022: checkcast EntityLivingBase
      // 025: new nh4
      // 028: dup
      // 029: aload 2
      // 02a: invokevirtual mew.getX ()I
      // 02d: i2d
      // 02e: aload 0
      // 02f: getfield evg.d80 D
      // 032: dadd
      // 033: aload 2
      // 034: invokevirtual mew.getY ()I
      // 037: i2d
      // 038: aload 0
      // 039: getfield evg.tcq D
      // 03c: dadd
      // 03d: aload 2
      // 03e: invokevirtual mew.getZ ()I
      // 041: i2d
      // 042: aload 0
      // 043: getfield evg.iac D
      // 046: dadd
      // 047: aload 2
      // 048: invokevirtual mew.getX ()I
      // 04b: i2d
      // 04c: aload 0
      // 04d: getfield evg.smy D
      // 050: dadd
      // 051: aload 2
      // 052: invokevirtual mew.getY ()I
      // 055: i2d
      // 056: aload 0
      // 057: getfield evg.lpg D
      // 05a: dadd
      // 05b: aload 2
      // 05c: invokevirtual mew.getZ ()I
      // 05f: i2d
      // 060: aload 0
      // 061: getfield evg.nlu D
      // 064: dadd
      // 065: invokespecial nh4.<init> (DDDDDD)V
      // 068: invokevirtual OpaquePredicate.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 06b: astore 7
      // 06d: aload 7
      // 06f: invokeinterface java/util/List.isEmpty ()Z 1
      // 074: iload 3
      // 075: ifeq 0d3
      // 078: ifne 0d1
      // 07b: goto 082
      // 07e: invokestatic evg.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 7
      // 084: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 089: astore 8
      // 08b: aload 8
      // 08d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 092: ifeq 0d1
      // 095: aload 8
      // 097: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 09c: checkcast EntityLivingBase
      // 09f: astore 9
      // 0a1: aload 9
      // 0a3: invokevirtual EntityLivingBase.l__ ()Z
      // 0a6: iload 3
      // 0a7: ifeq 0d3
      // 0aa: iload 3
      // 0ab: ifeq 0c0
      // 0ae: goto 0b5
      // 0b1: invokestatic evg.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: ifne 0c6
      // 0b8: goto 0bf
      // 0bb: invokestatic evg.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: bipush 1
      // 0c0: istore 6
      // 0c2: iload 3
      // 0c3: ifne 0d1
      // 0c6: iload 3
      // 0c7: ifne 08b
      // 0ca: goto 0d1
      // 0cd: invokestatic evg.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: iload 6
      // 0d3: iload 3
      // 0d4: ifeq 107
      // 0d7: iload 5
      // 0d9: if_icmpeq 105
      // 0dc: goto 0e3
      // 0df: invokestatic evg.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aload 4
      // 0e5: getstatic evg.m0p Lh76;
      // 0e8: iload 6
      // 0ea: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0ed: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0f2: astore 4
      // 0f4: aload 1
      // 0f5: aload 2
      // 0f6: aload 4
      // 0f8: bipush 3
      // 0f9: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0fc: pop
      // 0fd: aload 0
      // 0fe: aload 1
      // 0ff: aload 2
      // 100: aload 4
      // 102: invokespecial evg.whx (Lt9d;Lmew;Lzfz;)V
      // 105: iload 6
      // 107: ifeq 11c
      // 10a: aload 1
      // 10b: aload 2
      // 10c: aload 0
      // 10d: aload 0
      // 10e: aload 1
      // 10f: invokevirtual evg.odp (Lt9d;)I
      // 112: invokevirtual OpaquePredicate.cjk (Lmew;Le0x;I)V
      // 115: goto 11c
      // 118: invokestatic evg.a (Loov;)Loov;
      // 11b: athrow
      // 11c: return
   }

   public static boolean w51(m5n param0, mew param1, zfz param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 3
      // 02: invokevirtual mew.offset (Lvt2;)Lmew;
      // 05: astore 5
      // 07: invokestatic OpaquePredicate.b ()I
      // 0a: aload 0
      // 0b: aload 5
      // 0d: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 12: astore 6
      // 14: istore 4
      // 16: aload 6
      // 18: invokeinterface zfz.r_y ()Le0x; 1
      // 1d: astore 7
      // 1f: aload 7
      // 21: getstatic ox_.r11 Ll2c;
      // 24: iload 4
      // 26: ifeq 57
      // 29: if_acmpne 52
      // 2c: goto 33
      // 2f: invokestatic evg.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 3
      // 34: invokevirtual vt2.b4b ()Lvt2;
      // 37: astore 8
      // 39: aload 6
      // 3b: getstatic l2c._ic Lqx_;
      // 3e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 43: aload 8
      // 45: if_acmpne 50
      // 48: bipush 1
      // 49: goto 51
      // 4c: invokestatic evg.a (Loov;)Loov;
      // 4f: athrow
      // 50: bipush 0
      // 51: ireturn
      // 52: aload 7
      // 54: getstatic ox_.s7a Le0x;
      // 57: if_acmpne 9d
      // 5a: aload 2
      // 5b: getstatic evg.z0g Lh76;
      // 5e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 63: checkcast java/lang/Boolean
      // 66: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 69: istore 8
      // 6b: aload 6
      // 6d: getstatic evg.z0g Lh76;
      // 70: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 75: checkcast java/lang/Boolean
      // 78: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7b: istore 9
      // 7d: iload 8
      // 7f: iload 4
      // 81: ifeq 98
      // 84: iload 9
      // 86: if_icmpne 9b
      // 89: goto 90
      // 8c: invokestatic evg.a (Loov;)Loov;
      // 8f: athrow
      // 90: bipush 1
      // 91: goto 98
      // 94: invokestatic evg.a (Loov;)Loov;
      // 97: athrow
      // 98: goto 9c
      // 9b: bipush 0
      // 9c: ireturn
      // 9d: bipush 0
      // 9e: ireturn
   }

   @Override
   public zfz kig(int var1) {
      int var2 = OpaquePredicate.b();

      zfz var10000;
      h76 var10001;
      int var10002;
      label73: {
         label72: {
            try {
               var10000 = this.l4i();
               var10001 = m0p;
               var10002 = var1 & 1;
               if (var2 == 0) {
                  break label73;
               }

               if (var10002 > 0) {
                  break label72;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var10002 = 0;
            break label73;
         }

         var10002 = 1;
      }

      label64: {
         label63: {
            try {
               var10000 = var10000.zvi(var10001, Boolean.valueOf((boolean)var10002));
               var10001 = z0g;
               var10002 = var1 & 2;
               if (var2 == 0) {
                  break label64;
               }

               if (var10002 > 0) {
                  break label63;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var10002 = 0;
            break label64;
         }

         var10002 = 1;
      }

      label55: {
         label54: {
            try {
               var10000 = var10000.zvi(var10001, Boolean.valueOf((boolean)var10002));
               var10001 = h98;
               var10002 = var1 & 4;
               if (var2 == 0) {
                  break label55;
               }

               if (var10002 > 0) {
                  break label54;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10002 = 0;
            break label55;
         }

         var10002 = 1;
      }

      try {
         var10000 = var10000.zvi(var10001, Boolean.valueOf((boolean)var10002));
         var10001 = w3p;
         var10002 = var1 & 8;
         if (var2 == 0) {
            return var10000.zvi(w3p, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(w3p, true);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = OpaquePredicate.b();
      byte var3 = 0;

      byte var10000;
      label69: {
         label68: {
            try {
               var10000 = (Boolean)var1.dil(m0p);
               if (var2 == 0) {
                  break label69;
               }

               if (var10000 == 0) {
                  break label68;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var3 |= 1;
         }

         var10000 = (Boolean)var1.dil(z0g);
      }

      label60: {
         label59: {
            try {
               if (var2 == 0) {
                  break label60;
               }

               if (var10000 == 0) {
                  break label59;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var3 |= 2;
         }

         var10000 = (Boolean)var1.dil(h98);
      }

      label51: {
         label50: {
            try {
               if (var2 == 0) {
                  break label51;
               }

               if (var10000 == 0) {
                  break label50;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var3 |= 4;
         }

         var10000 = (Boolean)var1.dil(w3p);
      }

      try {
         if (var2 == 0) {
            return var10000;
         }

         if (var10000 == 0) {
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
      return new g92(this, new xny[]{m0p, z0g, h98, w3p, vj8, mv6, bni, u5x});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8085418392312476089L, -9222931857476214371L, MethodHandles.lookup().lookupClass()).a(183974476276540L);
      // $VF: monitorexit
      long var10 = var10000 ^ 46939556784695L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[8];
      int var6 = 0;
      String var5 = "0Ë\u000ehã\u009eq}d\u009e3±ü¡bÊ\bõõ\u00881\u0003Ü±à\u0010!2\u0016%\u001bQ\u001c\u008c\u001c\u008bd°ê\u00032#\bº`¶ÕCîå\"\bI*\u0002\u0092;\u0006?\r\b\u000e\u0011ÖWá\u0097U6";
      int var7 = "0Ë\u000ehã\u009eq}d\u009e3±ü¡bÊ\bõõ\u00881\u0003Ü±à\u0010!2\u0016%\u001bQ\u001c\u008c\u001c\u008bd°ê\u00032#\bº`¶ÕCîå\"\bI*\u0002\u0092;\u0006?\r\b\u000e\u0011ÖWá\u0097U6"
         .length();
      char var4 = 16;
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = b(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     m0p = h76.d_1(var8[7]);
                     z0g = h76.d_1(var8[6]);
                     h98 = h76.d_1(var8[2]);
                     w3p = h76.d_1(var8[0]);
                     vj8 = h76.d_1(var8[5]);
                     mv6 = h76.d_1(var8[4]);
                     u5x = h76.d_1(var8[3]);
                     bni = h76.d_1(var8[1]);
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "Âß!û\u001aXþ\u001fì\u0081'¨W\u001cÿR\b\u0094x-\u0011c66þ";
                  var7 = "Âß!û\u001aXþ\u001fì\u0081'¨W\u001cÿR\b\u0094x-\u0011c66þ".length();
                  var4 = 16;
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
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
}
