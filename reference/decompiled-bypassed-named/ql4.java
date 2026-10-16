import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ql4 extends rrw implements jrp {
   public static final _ku ul6;

   public ql4() {
      this.y8l(this._8_.c32().zvi(ul6, 0));
      this._p_(true);
      float var1 = 0.5F;
      this.xl4(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
      this.i3l((uja)null);
      this.q6h(0.0F);
      this.t4k(_0p);
      this.myy();
   }

   @Override
   public boolean ib4(e0x var1) {
      try {
         if (var1 == ox_._5i) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: aload 4
      // 0b: invokespecial rrw.zvy (Lt9d;Lmew;Lzfz;Ljava/util/Random;)V
      // 0e: aload 1
      // 0f: aload 2
      // 10: invokevirtual mew.nuv ()Lmew;
      // 13: invokevirtual OpaquePredicate.rts (Lmew;)I
      // 16: iload 5
      // 18: ifne 3d
      // 1b: bipush 9
      // 1d: if_icmplt 89
      // 20: goto 27
      // 23: invokestatic ql4.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 3
      // 28: getstatic ql4.ul6 L_ku;
      // 2b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 30: checkcast java/lang/Integer
      // 33: invokevirtual java/lang/Integer.intValue ()I
      // 36: goto 3d
      // 39: invokestatic ql4.a (Loov;)Loov;
      // 3c: athrow
      // 3d: istore 6
      // 3f: iload 6
      // 41: bipush 7
      // 43: if_icmpge 89
      // 46: aload 0
      // 47: aload 1
      // 48: aload 2
      // 49: invokestatic ql4.l_7 (Le0x;Lt9d;Lmew;)F
      // 4c: fstore 7
      // 4e: aload 4
      // 50: ldc 25.0
      // 52: nop
      // 53: fload 7
      // 55: fdiv
      // 56: f2i
      // 57: bipush 1
      // 58: iadd
      // 59: invokevirtual java/util/Random.nextInt (I)I
      // 5c: iload 5
      // 5e: ifne 88
      // 61: ifne 89
      // 64: goto 6b
      // 67: invokestatic ql4.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 1
      // 6c: aload 2
      // 6d: aload 3
      // 6e: getstatic ql4.ul6 L_ku;
      // 71: iload 6
      // 73: bipush 1
      // 74: iadd
      // 75: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 78: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 7d: bipush 2
      // 7e: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 81: goto 88
      // 84: invokestatic ql4.a (Loov;)Loov;
      // 87: athrow
      // 88: pop
      // 89: return
   }

   public void uoi(OpaquePredicate var1, mew var2, zfz var3) {
      int var4 = OpaquePredicate.b();
      int var5 = (Integer)var3.dil(ul6) + fe6.pzp(var1.fsy, 2, 5);

      label20: {
         try {
            if (var4 == 0) {
               return;
            }

            if (var5 <= 7) {
               break label20;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var5 = 7;
      }

      var1.vct(var2, var3.zvi(ul6, var5), 2);
   }

   public static float l_7(e0x param0, OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: fconst_1
      // 001: fstore 4
      // 003: invokestatic OpaquePredicate.b ()I
      // 006: aload 2
      // 007: invokevirtual mew.eve ()Lmew;
      // 00a: astore 5
      // 00c: bipush -1
      // 00d: istore 6
      // 00f: istore 3
      // 010: iload 6
      // 012: bipush 1
      // 013: if_icmpgt 0ad
      // 016: bipush -1
      // 017: istore 7
      // 019: iload 7
      // 01b: bipush 1
      // 01c: if_icmpgt 0a6
      // 01f: fconst_0
      // 020: fstore 8
      // 022: aload 1
      // 023: aload 5
      // 025: iload 6
      // 027: bipush 0
      // 028: iload 7
      // 02a: invokevirtual mew.ec4 (III)Lmew;
      // 02d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 030: astore 9
      // 032: iload 3
      // 033: ifeq 0a9
      // 036: aload 9
      // 038: iload 3
      // 039: ifeq 05a
      // 03c: goto 043
      // 03f: invokestatic ql4.a (Loov;)Loov;
      // 042: athrow
      // 043: invokeinterface zfz.r_y ()Le0x; 1
      // 048: getstatic ox_._5i Le0x;
      // 04b: if_acmpne 07b
      // 04e: goto 055
      // 051: invokestatic ql4.a (Loov;)Loov;
      // 054: athrow
      // 055: fconst_1
      // 056: fstore 8
      // 058: aload 9
      // 05a: getstatic tdq.irx L_ku;
      // 05d: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 062: checkcast java/lang/Integer
      // 065: invokevirtual java/lang/Integer.intValue ()I
      // 068: iload 3
      // 069: ifeq 07d
      // 06c: ifle 07b
      // 06f: goto 076
      // 072: invokestatic ql4.a (Loov;)Loov;
      // 075: athrow
      // 076: ldc 3.0
      // 078: nop
      // 079: fstore 8
      // 07b: iload 6
      // 07d: iload 3
      // 07e: ifeq 08d
      // 081: ifne 090
      // 084: goto 08b
      // 087: invokestatic ql4.a (Loov;)Loov;
      // 08a: athrow
      // 08b: iload 7
      // 08d: ifeq 098
      // 090: fload 8
      // 092: ldc 4.0
      // 094: nop
      // 095: fdiv
      // 096: fstore 8
      // 098: fload 4
      // 09a: fload 8
      // 09c: fadd
      // 09d: fstore 4
      // 09f: iinc 7 1
      // 0a2: iload 3
      // 0a3: ifne 019
      // 0a6: iinc 6 1
      // 0a9: iload 3
      // 0aa: ifne 010
      // 0ad: aload 2
      // 0ae: invokevirtual mew.idu ()Lmew;
      // 0b1: astore 6
      // 0b3: aload 2
      // 0b4: invokevirtual mew.z6x ()Lmew;
      // 0b7: astore 7
      // 0b9: aload 2
      // 0ba: invokevirtual mew.y8e ()Lmew;
      // 0bd: astore 8
      // 0bf: aload 2
      // 0c0: invokevirtual mew.o_8 ()Lmew;
      // 0c3: astore 9
      // 0c5: aload 0
      // 0c6: aload 1
      // 0c7: aload 8
      // 0c9: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0cc: invokeinterface zfz.r_y ()Le0x; 1
      // 0d1: iload 3
      // 0d2: ifeq 0f2
      // 0d5: if_acmpeq 0f5
      // 0d8: goto 0df
      // 0db: invokestatic ql4.a (Loov;)Loov;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: aload 1
      // 0e1: aload 9
      // 0e3: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0e6: invokeinterface zfz.r_y ()Le0x; 1
      // 0eb: goto 0f2
      // 0ee: invokestatic ql4.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: if_acmpne 0fd
      // 0f5: bipush 1
      // 0f6: goto 0fe
      // 0f9: invokestatic ql4.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: bipush 0
      // 0fe: istore 10
      // 100: aload 0
      // 101: aload 1
      // 102: aload 6
      // 104: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 107: invokeinterface zfz.r_y ()Le0x; 1
      // 10c: iload 3
      // 10d: ifeq 12d
      // 110: if_acmpeq 130
      // 113: goto 11a
      // 116: invokestatic ql4.a (Loov;)Loov;
      // 119: athrow
      // 11a: aload 0
      // 11b: aload 1
      // 11c: aload 7
      // 11e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 121: invokeinterface zfz.r_y ()Le0x; 1
      // 126: goto 12d
      // 129: invokestatic ql4.a (Loov;)Loov;
      // 12c: athrow
      // 12d: if_acmpne 138
      // 130: bipush 1
      // 131: goto 139
      // 134: invokestatic ql4.a (Loov;)Loov;
      // 137: athrow
      // 138: bipush 0
      // 139: istore 11
      // 13b: iload 10
      // 13d: iload 3
      // 13e: ifeq 14d
      // 141: ifeq 15a
      // 144: goto 14b
      // 147: invokestatic ql4.a (Loov;)Loov;
      // 14a: athrow
      // 14b: iload 11
      // 14d: ifeq 15a
      // 150: fload 4
      // 152: fconst_2
      // 153: fdiv
      // 154: fstore 4
      // 156: iload 3
      // 157: ifne 1f5
      // 15a: aload 0
      // 15b: aload 1
      // 15c: aload 8
      // 15e: invokevirtual mew.idu ()Lmew;
      // 161: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 164: invokeinterface zfz.r_y ()Le0x; 1
      // 169: iload 3
      // 16a: ifeq 194
      // 16d: goto 174
      // 170: invokestatic ql4.a (Loov;)Loov;
      // 173: athrow
      // 174: if_acmpeq 1df
      // 177: goto 17e
      // 17a: invokestatic ql4.a (Loov;)Loov;
      // 17d: athrow
      // 17e: aload 0
      // 17f: aload 1
      // 180: aload 9
      // 182: invokevirtual mew.idu ()Lmew;
      // 185: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 188: invokeinterface zfz.r_y ()Le0x; 1
      // 18d: goto 194
      // 190: invokestatic ql4.a (Loov;)Loov;
      // 193: athrow
      // 194: iload 3
      // 195: ifeq 1b8
      // 198: if_acmpeq 1df
      // 19b: goto 1a2
      // 19e: invokestatic ql4.a (Loov;)Loov;
      // 1a1: athrow
      // 1a2: aload 0
      // 1a3: aload 1
      // 1a4: aload 9
      // 1a6: invokevirtual mew.z6x ()Lmew;
      // 1a9: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1ac: invokeinterface zfz.r_y ()Le0x; 1
      // 1b1: goto 1b8
      // 1b4: invokestatic ql4.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: iload 3
      // 1b9: ifeq 1dc
      // 1bc: if_acmpeq 1df
      // 1bf: goto 1c6
      // 1c2: invokestatic ql4.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: aload 0
      // 1c7: aload 1
      // 1c8: aload 8
      // 1ca: invokevirtual mew.z6x ()Lmew;
      // 1cd: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1d0: invokeinterface zfz.r_y ()Le0x; 1
      // 1d5: goto 1dc
      // 1d8: invokestatic ql4.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: if_acmpne 1e7
      // 1df: bipush 1
      // 1e0: goto 1e8
      // 1e3: invokestatic ql4.a (Loov;)Loov;
      // 1e6: athrow
      // 1e7: bipush 0
      // 1e8: istore 12
      // 1ea: iload 12
      // 1ec: ifeq 1f5
      // 1ef: fload 4
      // 1f1: fconst_2
      // 1f2: fdiv
      // 1f3: fstore 4
      // 1f5: fload 4
      // 1f7: freturn
   }

   @Override
   public boolean _h0(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual OpaquePredicate.a2f (Lmew;)I
      // 0a: iload 4
      // 0c: ifeq 4e
      // 0f: bipush 8
      // 11: if_icmpge 36
      // 14: goto 1b
      // 17: invokestatic ql4.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: aload 2
      // 1d: invokevirtual OpaquePredicate.cfv (Lmew;)Z
      // 20: iload 4
      // 22: ifeq 4e
      // 25: goto 2c
      // 28: invokestatic ql4.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifeq 61
      // 2f: goto 36
      // 32: invokestatic ql4.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 0
      // 37: aload 1
      // 38: aload 2
      // 39: invokevirtual mew.eve ()Lmew;
      // 3c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 3f: invokeinterface zfz.r_y ()Le0x; 1
      // 44: invokevirtual ql4.ib4 (Le0x;)Z
      // 47: goto 4e
      // 4a: invokestatic ql4.a (Loov;)Loov;
      // 4d: athrow
      // 4e: iload 4
      // 50: ifeq 5e
      // 53: ifeq 61
      // 56: goto 5d
      // 59: invokestatic ql4.a (Loov;)Loov;
      // 5c: athrow
      // 5d: bipush 1
      // 5e: goto 62
      // 61: bipush 0
      // 62: ireturn
   }

   public u7m buz() {
      return xbr.gj8;
   }

   public u7m fae() {
      return xbr.iqq;
   }

   @Override
   public void ix7(OpaquePredicate param1, mew param2, zfz param3, float param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: fload 4
      // 0b: bipush 0
      // 0c: invokespecial rrw.ix7 (Lt9d;Lmew;Lzfz;FI)V
      // 0f: aload 1
      // 10: getfield OpaquePredicate.v0f Z
      // 13: iload 6
      // 15: ifne 38
      // 18: ifne 9f
      // 1b: goto 22
      // 1e: invokestatic ql4.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 3
      // 23: getstatic ql4.ul6 L_ku;
      // 26: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2b: checkcast java/lang/Integer
      // 2e: invokevirtual java/lang/Integer.intValue ()I
      // 31: goto 38
      // 34: invokestatic ql4.a (Loov;)Loov;
      // 37: athrow
      // 38: istore 7
      // 3a: iload 7
      // 3c: bipush 7
      // 3e: iload 6
      // 40: ifne 57
      // 43: if_icmplt 9f
      // 46: goto 4d
      // 49: invokestatic ql4.a (Loov;)Loov;
      // 4c: athrow
      // 4d: bipush 3
      // 4e: iload 5
      // 50: goto 57
      // 53: invokestatic ql4.a (Loov;)Loov;
      // 56: athrow
      // 57: iadd
      // 58: istore 8
      // 5a: bipush 0
      // 5b: istore 9
      // 5d: iload 9
      // 5f: iload 8
      // 61: if_icmpge 9f
      // 64: aload 1
      // 65: iload 6
      // 67: ifne 86
      // 6a: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 6d: bipush 15
      // 6f: invokevirtual java/util/Random.nextInt (I)I
      // 72: iload 7
      // 74: if_icmpgt 97
      // 77: goto 7e
      // 7a: invokestatic ql4.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 1
      // 7f: goto 86
      // 82: invokestatic ql4.a (Loov;)Loov;
      // 85: athrow
      // 86: aload 2
      // 87: new erg
      // 8a: dup
      // 8b: aload 0
      // 8c: invokevirtual ql4.buz ()Lu7m;
      // 8f: bipush 1
      // 90: bipush 0
      // 91: invokespecial erg.<init> (Lu7m;II)V
      // 94: invokestatic ql4.ymu (Lt9d;Lmew;Lerg;)V
      // 97: iinc 9 1
      // 9a: iload 6
      // 9c: ifeq 5d
      // 9f: return
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      try {
         if ((Integer)var1.dil(ul6) == 7) {
            return this.fae();
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return this.buz();
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return this.buz();
   }

   @Override
   public boolean z3t(OpaquePredicate param1, mew param2, zfz param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic ql4.ul6 L_ku;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: iload 5
      // 16: ifeq 2d
      // 19: bipush 7
      // 1b: if_icmpge 30
      // 1e: goto 25
      // 21: invokestatic ql4.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 1
      // 26: goto 2d
      // 29: invokestatic ql4.a (Loov;)Loov;
      // 2c: athrow
      // 2d: goto 31
      // 30: bipush 0
      // 31: ireturn
   }

   @Override
   public boolean y4n(OpaquePredicate var1, Random var2, mew var3, zfz var4) {
      return true;
   }

   @Override
   public void tu1(OpaquePredicate var1, Random var2, mew var3, zfz var4) {
      this.uoi(var1, var3, var4);
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(ul6, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(ul6);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{ul6});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6474148367668615408L, -4455947968816329103L, MethodHandles.lookup().lookupClass()).a(96688467306647L);
      // $VF: monitorexit
      long var4 = var10000 ^ 4623109416507L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(":¹c½?\u0015âï".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      ul6 = _ku.wgl(var0, 0, 7);
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
