import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class hmv extends e0x {
   public static final _ku nfg;
   private static final long d;
   private static final String[] h;
   private static final String[] i;
   private static final Map j = new HashMap(13);

   public hmv(p3y var1) {
      super(var1);
      this.y8l(this._8_.c32().zvi(nfg, 0));
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this._p_(true);
   }

   @Override
   public boolean iwf(m5n var1, mew var2) {
      try {
         if (this.kgd != p3y.e1s) {
            return true;
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      return false;
   }

   @Override
   public int j24(m5n var1, mew var2, int var3) {
      try {
         if (this.kgd == p3y.six) {
            return s4i.ex1(var1, var2);
         }
      } catch (IllegalArgumentException var4) {
         throw a(var4);
      }

      return 16777215;
   }

   public static float jou(int var0) {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return (float)(var0 + 8) / 9.0F;
         }

         if (var0 < 8) {
            return (float)(var0 + 1) / 9.0F;
         }
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }

      byte var3 = 0;
      return (float)(var3 + 1) / 9.0F;
   }

   public int cah(m5n param1, mew param2) {
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
      // 05: aload 2
      // 06: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0b: iload 3
      // 0c: ifeq 33
      // 0f: invokeinterface zfz.r_y ()Le0x; 1
      // 14: invokevirtual e0x.p1r ()Lp3y;
      // 17: aload 0
      // 18: getfield hmv.kgd Lp3y;
      // 1b: if_acmpne 44
      // 1e: goto 25
      // 21: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: aload 1
      // 26: aload 2
      // 27: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 2c: goto 33
      // 2f: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32: athrow
      // 33: getstatic hmv.nfg L_ku;
      // 36: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 3b: checkcast java/lang/Integer
      // 3e: invokevirtual java/lang/Integer.intValue ()I
      // 41: goto 45
      // 44: bipush -1
      // 45: ireturn
   }

   public int fao(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual hmv.cah (Lm5n;Lmew;)I
      // 0a: istore 4
      // 0c: iload 4
      // 0e: iload 3
      // 0f: ifne 26
      // 12: bipush 8
      // 14: if_icmplt 29
      // 17: goto 1e
      // 1a: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: goto 26
      // 22: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25: athrow
      // 26: goto 2b
      // 29: iload 4
      // 2b: ireturn
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean qc_(zfz param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifne 29
      // 09: ifeq 3b
      // 0c: goto 13
      // 0f: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: aload 1
      // 14: getstatic hmv.nfg L_ku;
      // 17: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1c: checkcast java/lang/Integer
      // 1f: invokevirtual java/lang/Integer.intValue ()I
      // 22: goto 29
      // 25: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28: athrow
      // 29: iload 3
      // 2a: ifne 38
      // 2d: ifne 3b
      // 30: goto 37
      // 33: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: bipush 1
      // 38: goto 3c
      // 3b: bipush 0
      // 3c: ireturn
   }

   @Override
   public boolean f3u(m5n var1, mew var2, vt2 var3) {
      p3y var4 = var1.getBlockState(var2).r_y().p1r();

      try {
         if (var4 == this.kgd) {
            return false;
         }
      } catch (IllegalArgumentException var7) {
         throw a(var7);
      }

      try {
         if (var3 == vt2.rf3) {
            return true;
         }
      } catch (IllegalArgumentException var6) {
         throw a(var6);
      }

      try {
         if (var4 == p3y.b8s) {
            return false;
         }
      } catch (IllegalArgumentException var5) {
         throw a(var5);
      }

      return super.f3u(var1, var2, var3);
   }

   @Override
   public boolean ron(m5n var1, mew var2, vt2 var3) {
      try {
         if (var1.getBlockState(var2).r_y().p1r() == this.kgd) {
            return false;
         }
      } catch (IllegalArgumentException var5) {
         throw a(var5);
      }

      try {
         if (var3 == vt2.rf3) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw a(var4);
      }

      return super.ron(var1, var2, var3);
   }

   public boolean m98(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: bipush -1
      // 05: istore 4
      // 07: iload 4
      // 09: bipush 1
      // 0a: if_icmpgt 84
      // 0d: bipush -1
      // 0e: iload 3
      // 0f: ifeq 85
      // 12: istore 5
      // 14: iload 5
      // 16: bipush 1
      // 17: if_icmpgt 7d
      // 1a: aload 1
      // 1b: aload 2
      // 1c: iload 4
      // 1e: bipush 0
      // 1f: iload 5
      // 21: invokevirtual mew.ec4 (III)Lmew;
      // 24: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 29: astore 6
      // 2b: aload 6
      // 2d: invokeinterface zfz.r_y ()Le0x; 1
      // 32: astore 7
      // 34: aload 7
      // 36: invokevirtual e0x.p1r ()Lp3y;
      // 39: astore 8
      // 3b: iload 3
      // 3c: ifeq 80
      // 3f: iload 3
      // 40: ifeq 79
      // 43: goto 4a
      // 46: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 49: athrow
      // 4a: aload 8
      // 4c: aload 0
      // 4d: getfield hmv.kgd Lp3y;
      // 50: if_acmpeq 76
      // 53: goto 5a
      // 56: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 59: athrow
      // 5a: aload 7
      // 5c: invokevirtual e0x.z4c ()Z
      // 5f: iload 3
      // 60: ifeq 75
      // 63: goto 6a
      // 66: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 69: athrow
      // 6a: ifne 76
      // 6d: goto 74
      // 70: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 73: athrow
      // 74: bipush 1
      // 75: ireturn
      // 76: iinc 5 1
      // 79: iload 3
      // 7a: ifne 14
      // 7d: iinc 4 1
      // 80: iload 3
      // 81: ifne 07
      // 84: bipush 0
      // 85: ireturn
   }

   @Override
   public nh4 m__(t9d var1, mew var2, zfz var3) {
      return null;
   }

   @Override
   public int kfj() {
      return 1;
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return null;
   }

   @Override
   public int bzr(Random var1) {
      return 0;
   }

   public fqr q5d(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new fqr
      // 003: dup
      // 004: dconst_0
      // 005: dconst_0
      // 006: dconst_0
      // 007: invokespecial fqr.<init> (DDD)V
      // 00a: astore 4
      // 00c: invokestatic t9d.b ()I
      // 00f: aload 0
      // 010: aload 1
      // 011: aload 2
      // 012: invokevirtual hmv.fao (Lm5n;Lmew;)I
      // 015: istore 5
      // 017: istore 3
      // 018: getstatic vt2$unz.fzl Lvt2$unz;
      // 01b: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 01e: astore 6
      // 020: aload 6
      // 022: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 027: ifeq 146
      // 02a: aload 6
      // 02c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 031: checkcast vt2
      // 034: astore 7
      // 036: aload 2
      // 037: aload 7
      // 039: invokevirtual mew.offset (Lvt2;)Lmew;
      // 03c: astore 8
      // 03e: aload 0
      // 03f: aload 1
      // 040: aload 8
      // 042: invokevirtual hmv.fao (Lm5n;Lmew;)I
      // 045: istore 9
      // 047: iload 9
      // 049: iload 3
      // 04a: ifeq 15b
      // 04d: iload 3
      // 04e: ifeq 0f5
      // 051: goto 058
      // 054: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 057: athrow
      // 058: ifge 0ec
      // 05b: goto 062
      // 05e: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 061: athrow
      // 062: aload 1
      // 063: aload 8
      // 065: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 06a: invokeinterface zfz.r_y ()Le0x; 1
      // 06f: invokevirtual e0x.p1r ()Lp3y;
      // 072: invokevirtual p3y.c3t ()Z
      // 075: iload 3
      // 076: ifeq 098
      // 079: goto 080
      // 07c: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07f: athrow
      // 080: ifne 142
      // 083: goto 08a
      // 086: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 089: athrow
      // 08a: aload 0
      // 08b: aload 1
      // 08c: aload 8
      // 08e: invokevirtual mew.eve ()Lmew;
      // 091: invokevirtual hmv.fao (Lm5n;Lmew;)I
      // 094: istore 9
      // 096: iload 9
      // 098: iload 3
      // 099: ifeq 0b5
      // 09c: iflt 142
      // 09f: goto 0a6
      // 0a2: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a5: athrow
      // 0a6: iload 9
      // 0a8: iload 5
      // 0aa: bipush 8
      // 0ac: isub
      // 0ad: isub
      // 0ae: goto 0b5
      // 0b1: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b4: athrow
      // 0b5: istore 10
      // 0b7: aload 4
      // 0b9: aload 8
      // 0bb: invokevirtual mew.getX ()I
      // 0be: aload 2
      // 0bf: invokevirtual mew.getX ()I
      // 0c2: isub
      // 0c3: iload 10
      // 0c5: imul
      // 0c6: i2d
      // 0c7: aload 8
      // 0c9: invokevirtual mew.getY ()I
      // 0cc: aload 2
      // 0cd: invokevirtual mew.getY ()I
      // 0d0: isub
      // 0d1: iload 10
      // 0d3: imul
      // 0d4: i2d
      // 0d5: aload 8
      // 0d7: invokevirtual mew.getZ ()I
      // 0da: aload 2
      // 0db: invokevirtual mew.getZ ()I
      // 0de: isub
      // 0df: iload 10
      // 0e1: imul
      // 0e2: i2d
      // 0e3: invokevirtual fqr.r2x (DDD)Lfqr;
      // 0e6: astore 4
      // 0e8: iload 3
      // 0e9: ifne 142
      // 0ec: iload 9
      // 0ee: goto 0f5
      // 0f1: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f4: athrow
      // 0f5: iload 3
      // 0f6: ifeq 10f
      // 0f9: iflt 142
      // 0fc: goto 103
      // 0ff: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 102: athrow
      // 103: iload 9
      // 105: iload 5
      // 107: isub
      // 108: goto 10f
      // 10b: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10e: athrow
      // 10f: istore 10
      // 111: aload 4
      // 113: aload 8
      // 115: invokevirtual mew.getX ()I
      // 118: aload 2
      // 119: invokevirtual mew.getX ()I
      // 11c: isub
      // 11d: iload 10
      // 11f: imul
      // 120: i2d
      // 121: aload 8
      // 123: invokevirtual mew.getY ()I
      // 126: aload 2
      // 127: invokevirtual mew.getY ()I
      // 12a: isub
      // 12b: iload 10
      // 12d: imul
      // 12e: i2d
      // 12f: aload 8
      // 131: invokevirtual mew.getZ ()I
      // 134: aload 2
      // 135: invokevirtual mew.getZ ()I
      // 138: isub
      // 139: iload 10
      // 13b: imul
      // 13c: i2d
      // 13d: invokevirtual fqr.r2x (DDD)Lfqr;
      // 140: astore 4
      // 142: iload 3
      // 143: ifne 020
      // 146: aload 1
      // 147: aload 2
      // 148: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 14d: getstatic hmv.nfg L_ku;
      // 150: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 155: checkcast java/lang/Integer
      // 158: invokevirtual java/lang/Integer.intValue ()I
      // 15b: bipush 8
      // 15d: if_icmplt 1d1
      // 160: getstatic vt2$unz.fzl Lvt2$unz;
      // 163: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 166: astore 6
      // 168: aload 6
      // 16a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 16f: ifeq 1d1
      // 172: aload 6
      // 174: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 179: checkcast vt2
      // 17c: astore 7
      // 17e: aload 2
      // 17f: aload 7
      // 181: invokevirtual mew.offset (Lvt2;)Lmew;
      // 184: astore 8
      // 186: iload 3
      // 187: ifeq 1c2
      // 18a: aload 0
      // 18b: aload 1
      // 18c: aload 8
      // 18e: aload 7
      // 190: invokevirtual hmv.f3u (Lm5n;Lmew;Lvt2;)Z
      // 193: ifne 1b3
      // 196: goto 19d
      // 199: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19c: athrow
      // 19d: aload 0
      // 19e: aload 1
      // 19f: aload 8
      // 1a1: invokevirtual mew.nuv ()Lmew;
      // 1a4: aload 7
      // 1a6: invokevirtual hmv.f3u (Lm5n;Lmew;Lvt2;)Z
      // 1a9: ifeq 1c6
      // 1ac: goto 1b3
      // 1af: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b2: athrow
      // 1b3: aload 4
      // 1b5: invokevirtual fqr.kec ()Lfqr;
      // 1b8: dconst_0
      // 1b9: ldc2_w -6.0
      // 1bc: dconst_0
      // 1bd: invokevirtual fqr.r2x (DDD)Lfqr;
      // 1c0: astore 4
      // 1c2: iload 3
      // 1c3: ifne 1d1
      // 1c6: iload 3
      // 1c7: ifne 168
      // 1ca: goto 1d1
      // 1cd: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d0: athrow
      // 1d1: aload 4
      // 1d3: invokevirtual fqr.kec ()Lfqr;
      // 1d6: areturn
   }

   @Override
   public fqr efx(t9d var1, mew var2, i2h var3, fqr var4) {
      return var4.lle(this.q5d(var1, var2));
   }

   @Override
   public int odp(t9d param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield hmv.kgd Lp3y;
      // 08: getstatic p3y.six Lp3y;
      // 0b: iload 2
      // 0c: ifeq 28
      // 0f: if_acmpne 21
      // 12: goto 19
      // 15: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18: athrow
      // 19: bipush 5
      // 1a: goto 56
      // 1d: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: aload 0
      // 22: getfield hmv.kgd Lp3y;
      // 25: getstatic p3y.e1s Lp3y;
      // 28: if_acmpne 55
      // 2b: aload 1
      // 2c: getfield t9d.vzz Lupn;
      // 2f: invokevirtual upn.qyc ()Z
      // 32: iload 2
      // 33: ifeq 52
      // 36: goto 3d
      // 39: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c: athrow
      // 3d: ifeq 50
      // 40: goto 47
      // 43: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: bipush 10
      // 49: goto 56
      // 4c: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4f: athrow
      // 50: bipush 30
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   @Override
   public int pil(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 2
      // 02: bipush 0
      // 03: invokeinterface m5n.getCombinedLight (Lmew;I)I 3
      // 08: istore 4
      // 0a: invokestatic t9d.b ()I
      // 0d: aload 1
      // 0e: aload 2
      // 0f: invokevirtual mew.nuv ()Lmew;
      // 12: bipush 0
      // 13: invokeinterface m5n.getCombinedLight (Lmew;I)I 3
      // 18: istore 5
      // 1a: iload 4
      // 1c: sipush 255
      // 1f: iand
      // 20: istore 6
      // 22: iload 5
      // 24: sipush 255
      // 27: iand
      // 28: istore 7
      // 2a: iload 4
      // 2c: bipush 16
      // 2e: ishr
      // 2f: sipush 255
      // 32: iand
      // 33: istore 8
      // 35: istore 3
      // 36: iload 5
      // 38: bipush 16
      // 3a: ishr
      // 3b: sipush 255
      // 3e: iand
      // 3f: istore 9
      // 41: iload 6
      // 43: iload 3
      // 44: ifeq 5c
      // 47: iload 7
      // 49: if_icmple 5f
      // 4c: goto 53
      // 4f: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52: athrow
      // 53: iload 6
      // 55: goto 5c
      // 58: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5b: athrow
      // 5c: goto 61
      // 5f: iload 7
      // 61: iload 8
      // 63: iload 3
      // 64: ifeq 7c
      // 67: iload 9
      // 69: if_icmple 7f
      // 6c: goto 73
      // 6f: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 72: athrow
      // 73: iload 8
      // 75: goto 7c
      // 78: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7b: athrow
      // 7c: goto 81
      // 7f: iload 9
      // 81: bipush 16
      // 83: ishl
      // 84: ior
      // 85: ireturn
   }

   @Override
   public w51 w3x() {
      try {
         if (this.kgd == p3y.six) {
            return w51.mem;
         }
      } catch (IllegalArgumentException var1) {
         throw a(var1);
      }

      return w51.exw;
   }

   @Override
   public void kyo(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hmv.d J
      // 003: ldc2_w 15019615365592
      // 006: lxor
      // 007: lstore 5
      // 009: aload 2
      // 00a: invokevirtual mew.getX ()I
      // 00d: i2d
      // 00e: dstore 8
      // 010: aload 2
      // 011: invokevirtual mew.getY ()I
      // 014: i2d
      // 015: dstore 10
      // 017: invokestatic t9d.c ()I
      // 01a: aload 2
      // 01b: invokevirtual mew.getZ ()I
      // 01e: i2d
      // 01f: dstore 12
      // 021: istore 7
      // 023: aload 0
      // 024: getfield hmv.kgd Lp3y;
      // 027: getstatic p3y.six Lp3y;
      // 02a: iload 7
      // 02c: ifne 117
      // 02f: if_acmpne 110
      // 032: goto 039
      // 035: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 038: athrow
      // 039: aload 3
      // 03a: getstatic hmv.nfg L_ku;
      // 03d: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 042: checkcast java/lang/Integer
      // 045: invokevirtual java/lang/Integer.intValue ()I
      // 048: istore 14
      // 04a: iload 14
      // 04c: iload 7
      // 04e: ifne 0de
      // 051: ifle 0d0
      // 054: goto 05b
      // 057: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05a: athrow
      // 05b: iload 14
      // 05d: iload 7
      // 05f: ifne 0de
      // 062: goto 069
      // 065: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 068: athrow
      // 069: bipush 8
      // 06b: if_icmpge 0d0
      // 06e: goto 075
      // 071: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 074: athrow
      // 075: aload 4
      // 077: bipush 64
      // 079: invokevirtual java/util/Random.nextInt (I)I
      // 07c: ifne 110
      // 07f: goto 086
      // 082: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 085: athrow
      // 086: aload 1
      // 087: dload 8
      // 089: ldc2_w 0.5
      // 08c: dadd
      // 08d: dload 10
      // 08f: ldc2_w 0.5
      // 092: dadd
      // 093: dload 12
      // 095: ldc2_w 0.5
      // 098: dadd
      // 099: sipush 30922
      // 09c: ldc2_w 1838660199184113974
      // 09f: lload 5
      // 0a1: lxor
      // 0a2: invokedynamic s (IJ)Ljava/lang/String; bsm=hmv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: nop
      // 0a8: aload 4
      // 0aa: invokevirtual java/util/Random.nextFloat ()F
      // 0ad: ldc 0.25
      // 0af: nop
      // 0b0: fmul
      // 0b1: ldc 0.75
      // 0b3: nop
      // 0b4: fadd
      // 0b5: aload 4
      // 0b7: invokevirtual java/util/Random.nextFloat ()F
      // 0ba: fconst_1
      // 0bb: fmul
      // 0bc: ldc 0.5
      // 0be: nop
      // 0bf: fadd
      // 0c0: bipush 0
      // 0c1: invokevirtual t9d.wd_ (DDDLjava/lang/String;FFZ)V
      // 0c4: iload 7
      // 0c6: ifeq 110
      // 0c9: goto 0d0
      // 0cc: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cf: athrow
      // 0d0: aload 4
      // 0d2: bipush 10
      // 0d4: invokevirtual java/util/Random.nextInt (I)I
      // 0d7: goto 0de
      // 0da: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0dd: athrow
      // 0de: ifne 110
      // 0e1: aload 1
      // 0e2: getstatic w_0.ahz Lw_0;
      // 0e5: dload 8
      // 0e7: aload 4
      // 0e9: invokevirtual java/util/Random.nextFloat ()F
      // 0ec: f2d
      // 0ed: dadd
      // 0ee: dload 10
      // 0f0: aload 4
      // 0f2: invokevirtual java/util/Random.nextFloat ()F
      // 0f5: f2d
      // 0f6: dadd
      // 0f7: dload 12
      // 0f9: aload 4
      // 0fb: invokevirtual java/util/Random.nextFloat ()F
      // 0fe: f2d
      // 0ff: dadd
      // 100: dconst_0
      // 101: dconst_0
      // 102: dconst_0
      // 103: bipush 0
      // 104: newarray 10
      // 106: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 109: goto 110
      // 10c: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield hmv.kgd Lp3y;
      // 114: getstatic p3y.e1s Lp3y;
      // 117: iload 7
      // 119: ifne 14c
      // 11c: if_acmpne 24a
      // 11f: goto 126
      // 122: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 125: athrow
      // 126: aload 1
      // 127: aload 2
      // 128: invokevirtual mew.nuv ()Lmew;
      // 12b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 12e: invokeinterface zfz.r_y ()Le0x; 1
      // 133: iload 7
      // 135: ifne 163
      // 138: goto 13f
      // 13b: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13e: athrow
      // 13f: invokevirtual e0x.p1r ()Lp3y;
      // 142: getstatic p3y.cei Lp3y;
      // 145: goto 14c
      // 148: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14b: athrow
      // 14c: if_acmpne 24a
      // 14f: aload 1
      // 150: aload 2
      // 151: invokevirtual mew.nuv ()Lmew;
      // 154: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 157: invokeinterface zfz.r_y ()Le0x; 1
      // 15c: goto 163
      // 15f: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 162: athrow
      // 163: invokevirtual e0x.ko5 ()Z
      // 166: iload 7
      // 168: ifne 251
      // 16b: ifne 24a
      // 16e: goto 175
      // 171: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 174: athrow
      // 175: aload 4
      // 177: bipush 100
      // 179: invokevirtual java/util/Random.nextInt (I)I
      // 17c: iload 7
      // 17e: ifne 200
      // 181: goto 188
      // 184: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 187: athrow
      // 188: ifne 1f8
      // 18b: goto 192
      // 18e: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 191: athrow
      // 192: dload 8
      // 194: aload 4
      // 196: invokevirtual java/util/Random.nextFloat ()F
      // 199: f2d
      // 19a: dadd
      // 19b: dstore 14
      // 19d: dload 10
      // 19f: aload 0
      // 1a0: getfield hmv.lpg D
      // 1a3: dadd
      // 1a4: dstore 16
      // 1a6: dload 12
      // 1a8: aload 4
      // 1aa: invokevirtual java/util/Random.nextFloat ()F
      // 1ad: f2d
      // 1ae: dadd
      // 1af: dstore 18
      // 1b1: aload 1
      // 1b2: getstatic w_0.l3c Lw_0;
      // 1b5: dload 14
      // 1b7: dload 16
      // 1b9: dload 18
      // 1bb: dconst_0
      // 1bc: dconst_0
      // 1bd: dconst_0
      // 1be: bipush 0
      // 1bf: newarray 10
      // 1c1: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 1c4: aload 1
      // 1c5: dload 14
      // 1c7: dload 16
      // 1c9: dload 18
      // 1cb: sipush 22630
      // 1ce: ldc2_w 2710027532839322015
      // 1d1: lload 5
      // 1d3: lxor
      // 1d4: invokedynamic s (IJ)Ljava/lang/String; bsm=hmv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: nop
      // 1da: ldc 0.2
      // 1dc: nop
      // 1dd: aload 4
      // 1df: invokevirtual java/util/Random.nextFloat ()F
      // 1e2: ldc 0.2
      // 1e4: nop
      // 1e5: fmul
      // 1e6: fadd
      // 1e7: ldc 0.9
      // 1e9: nop
      // 1ea: aload 4
      // 1ec: invokevirtual java/util/Random.nextFloat ()F
      // 1ef: ldc 0.15
      // 1f1: nop
      // 1f2: fmul
      // 1f3: fadd
      // 1f4: bipush 0
      // 1f5: invokevirtual t9d.wd_ (DDDLjava/lang/String;FFZ)V
      // 1f8: aload 4
      // 1fa: sipush 200
      // 1fd: invokevirtual java/util/Random.nextInt (I)I
      // 200: iload 7
      // 202: ifne 251
      // 205: ifne 24a
      // 208: goto 20f
      // 20b: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20e: athrow
      // 20f: aload 1
      // 210: dload 8
      // 212: dload 10
      // 214: dload 12
      // 216: sipush 16577
      // 219: ldc2_w 8877549322019608890
      // 21c: lload 5
      // 21e: lxor
      // 21f: invokedynamic s (IJ)Ljava/lang/String; bsm=hmv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: nop
      // 225: ldc 0.2
      // 227: nop
      // 228: aload 4
      // 22a: invokevirtual java/util/Random.nextFloat ()F
      // 22d: ldc 0.2
      // 22f: nop
      // 230: fmul
      // 231: fadd
      // 232: ldc 0.9
      // 234: nop
      // 235: aload 4
      // 237: invokevirtual java/util/Random.nextFloat ()F
      // 23a: ldc 0.15
      // 23c: nop
      // 23d: fmul
      // 23e: fadd
      // 23f: bipush 0
      // 240: invokevirtual t9d.wd_ (DDDLjava/lang/String;FFZ)V
      // 243: goto 24a
      // 246: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 249: athrow
      // 24a: aload 4
      // 24c: bipush 10
      // 24e: invokevirtual java/util/Random.nextInt (I)I
      // 251: iload 7
      // 253: ifne 27b
      // 256: ifne 328
      // 259: goto 260
      // 25c: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25f: athrow
      // 260: aload 1
      // 261: aload 2
      // 262: invokevirtual mew.eve ()Lmew;
      // 265: iload 7
      // 267: ifne 28b
      // 26a: goto 271
      // 26d: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 270: athrow
      // 271: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 274: goto 27b
      // 277: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27a: athrow
      // 27b: ifeq 328
      // 27e: aload 1
      // 27f: aload 2
      // 280: bipush 2
      // 281: invokevirtual mew.rb6 (I)Lmew;
      // 284: goto 28b
      // 287: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28a: athrow
      // 28b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 28e: invokeinterface zfz.r_y ()Le0x; 1
      // 293: invokevirtual e0x.p1r ()Lp3y;
      // 296: astore 14
      // 298: aload 14
      // 29a: invokevirtual p3y.c3t ()Z
      // 29d: iload 7
      // 29f: ifne 2b8
      // 2a2: ifne 328
      // 2a5: goto 2ac
      // 2a8: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ab: athrow
      // 2ac: aload 14
      // 2ae: invokevirtual p3y.l7j ()Z
      // 2b1: goto 2b8
      // 2b4: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b7: athrow
      // 2b8: ifne 328
      // 2bb: dload 8
      // 2bd: aload 4
      // 2bf: invokevirtual java/util/Random.nextFloat ()F
      // 2c2: f2d
      // 2c3: dadd
      // 2c4: dstore 15
      // 2c6: dload 10
      // 2c8: ldc2_w 1.05
      // 2cb: dsub
      // 2cc: dstore 17
      // 2ce: dload 12
      // 2d0: aload 4
      // 2d2: invokevirtual java/util/Random.nextFloat ()F
      // 2d5: f2d
      // 2d6: dadd
      // 2d7: dstore 19
      // 2d9: iload 7
      // 2db: ifne 309
      // 2de: aload 0
      // 2df: getfield hmv.kgd Lp3y;
      // 2e2: getstatic p3y.six Lp3y;
      // 2e5: if_acmpne 30e
      // 2e8: goto 2ef
      // 2eb: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ee: athrow
      // 2ef: aload 1
      // 2f0: getstatic w_0.cde Lw_0;
      // 2f3: dload 15
      // 2f5: dload 17
      // 2f7: dload 19
      // 2f9: dconst_0
      // 2fa: dconst_0
      // 2fb: dconst_0
      // 2fc: bipush 0
      // 2fd: newarray 10
      // 2ff: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 302: goto 309
      // 305: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 308: athrow
      // 309: iload 7
      // 30b: ifeq 328
      // 30e: aload 1
      // 30f: getstatic w_0.fpv Lw_0;
      // 312: dload 15
      // 314: dload 17
      // 316: dload 19
      // 318: dconst_0
      // 319: dconst_0
      // 31a: dconst_0
      // 31b: bipush 0
      // 31c: newarray 10
      // 31e: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 321: goto 328
      // 324: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 327: athrow
      // 328: return
   }

   public static double _47(m5n param0, mew param1, p3y param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: invokestatic hmv.cvb (Lp3y;)L_13;
      // 08: aload 0
      // 09: aload 1
      // 0a: invokevirtual _13.q5d (Lm5n;Lmew;)Lfqr;
      // 0d: astore 4
      // 0f: aload 4
      // 11: getfield fqr.lvi D
      // 14: dconst_0
      // 15: iload 3
      // 16: ifeq 5a
      // 19: dcmpl
      // 1a: ifne 4a
      // 1d: goto 24
      // 20: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: aload 4
      // 26: getfield fqr.bn2 D
      // 29: dconst_0
      // 2a: iload 3
      // 2b: ifeq 5a
      // 2e: goto 35
      // 31: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: dcmpl
      // 36: ifne 4a
      // 39: goto 40
      // 3c: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: ldc2_w -1000.0
      // 43: goto 5b
      // 46: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 49: athrow
      // 4a: aload 4
      // 4c: getfield fqr.bn2 D
      // 4f: aload 4
      // 51: getfield fqr.lvi D
      // 54: invokestatic fe6.yr8 (DD)D
      // 57: ldc2_w 1.5707963267948966
      // 5a: dsub
      // 5b: dreturn
   }

   @Override
   public void tfc(t9d var1, mew var2, zfz var3) {
      this.umq(var1, var2, var3);
   }

   @Override
   public void z3l(t9d var1, mew var2, zfz var3, e0x var4) {
      this.umq(var1, var2, var3);
   }

   public boolean umq(t9d param1, mew param2, zfz param3) {
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
      // 006: getfield hmv.kgd Lp3y;
      // 009: getstatic p3y.e1s Lp3y;
      // 00c: if_acmpne 102
      // 00f: bipush 0
      // 010: istore 5
      // 012: invokestatic vt2.values ()[Lvt2;
      // 015: astore 6
      // 017: aload 6
      // 019: arraylength
      // 01a: istore 7
      // 01c: bipush 0
      // 01d: istore 8
      // 01f: iload 8
      // 021: iload 7
      // 023: if_icmpge 083
      // 026: aload 6
      // 028: iload 8
      // 02a: aaload
      // 02b: astore 9
      // 02d: iload 4
      // 02f: ifne 07e
      // 032: aload 9
      // 034: iload 4
      // 036: ifne 0a4
      // 039: goto 040
      // 03c: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03f: athrow
      // 040: getstatic vt2.m3r Lvt2;
      // 043: if_acmpeq 074
      // 046: goto 04d
      // 049: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04c: athrow
      // 04d: aload 1
      // 04e: aload 2
      // 04f: aload 9
      // 051: invokevirtual mew.offset (Lvt2;)Lmew;
      // 054: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 057: invokeinterface zfz.r_y ()Le0x; 1
      // 05c: invokevirtual e0x.p1r ()Lp3y;
      // 05f: getstatic p3y.six Lp3y;
      // 062: if_acmpne 074
      // 065: goto 06c
      // 068: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06b: athrow
      // 06c: bipush 1
      // 06d: istore 5
      // 06f: iload 4
      // 071: ifeq 083
      // 074: iinc 8 1
      // 077: goto 07e
      // 07a: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07d: athrow
      // 07e: iload 4
      // 080: ifeq 01f
      // 083: iload 5
      // 085: iload 4
      // 087: ifne 103
      // 08a: ifeq 102
      // 08d: goto 094
      // 090: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 093: athrow
      // 094: aload 3
      // 095: getstatic hmv.nfg L_ku;
      // 098: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 09d: goto 0a4
      // 0a0: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: checkcast java/lang/Integer
      // 0a7: astore 6
      // 0a9: aload 6
      // 0ab: invokevirtual java/lang/Integer.intValue ()I
      // 0ae: iload 4
      // 0b0: ifne 0da
      // 0b3: ifne 0d5
      // 0b6: goto 0bd
      // 0b9: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bc: athrow
      // 0bd: aload 1
      // 0be: aload 2
      // 0bf: getstatic ox_.j4y Le0x;
      // 0c2: invokevirtual e0x.l4i ()Lzfz;
      // 0c5: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 0c8: pop
      // 0c9: aload 0
      // 0ca: aload 1
      // 0cb: aload 2
      // 0cc: invokevirtual hmv.hjz (Lt9d;Lmew;)V
      // 0cf: bipush 1
      // 0d0: ireturn
      // 0d1: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d4: athrow
      // 0d5: aload 6
      // 0d7: invokevirtual java/lang/Integer.intValue ()I
      // 0da: iload 4
      // 0dc: ifne 103
      // 0df: bipush 4
      // 0e0: if_icmpgt 102
      // 0e3: goto 0ea
      // 0e6: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e9: athrow
      // 0ea: aload 1
      // 0eb: aload 2
      // 0ec: getstatic ox_.a3_ Le0x;
      // 0ef: invokevirtual e0x.l4i ()Lzfz;
      // 0f2: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 0f5: pop
      // 0f6: aload 0
      // 0f7: aload 1
      // 0f8: aload 2
      // 0f9: invokevirtual hmv.hjz (Lt9d;Lmew;)V
      // 0fc: bipush 1
      // 0fd: ireturn
      // 0fe: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 101: athrow
      // 102: bipush 0
      // 103: ireturn
   }

   public void hjz(t9d var1, mew var2) {
      long var3 = d ^ 90959680997014L;
      double var6 = (double)var2.getX();
      int var10000 = t9d.b();
      double var8 = (double)var2.getY();
      int var5 = var10000;
      double var10 = (double)var2.getZ();
      var1.amg(
         var6 + 0.5, var8 + 0.5, var10 + 0.5, b<"s">(3987, 8527395385127696672L ^ var3), 0.5F, 2.6F + (var1.fsy.nextFloat() - var1.fsy.nextFloat()) * 0.8F
      );
      int var12 = 0;

      while (var12 < 8) {
         var1.zvy(w_0.vby, var6 + Math.random(), var8 + 1.2, var10 + Math.random(), 0.0, 0.0, 0.0, new int[0]);
         var12++;
         if (var5 == 0) {
            break;
         }
      }
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(nfg, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(nfg);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{nfg});
   }

   public static _13 cvb(p3y param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hmv.d J
      // 03: ldc2_w 129622240306982
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getstatic p3y.six Lp3y;
      // 10: iload 3
      // 11: ifeq 2a
      // 14: if_acmpne 26
      // 17: goto 1e
      // 1a: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d: athrow
      // 1e: getstatic ox_.whp L_13;
      // 21: areturn
      // 22: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25: athrow
      // 26: aload 0
      // 27: getstatic p3y.e1s Lp3y;
      // 2a: if_acmpne 35
      // 2d: getstatic ox_.dr2 L_13;
      // 30: areturn
      // 31: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: new java/lang/IllegalArgumentException
      // 38: dup
      // 39: sipush 13802
      // 3c: ldc2_w 8095994052034388715
      // 3f: lload 1
      // 40: lxor
      // 41: invokedynamic s (IJ)Ljava/lang/String; bsm=hmv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 4a: athrow
   }

   public static es2 km1(p3y param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hmv.d J
      // 03: ldc2_w 83512692792225
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getstatic p3y.six Lp3y;
      // 10: iload 3
      // 11: ifne 2a
      // 14: if_acmpne 26
      // 17: goto 1e
      // 1a: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d: athrow
      // 1e: getstatic ox_.gdz Les2;
      // 21: areturn
      // 22: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25: athrow
      // 26: aload 0
      // 27: getstatic p3y.e1s Lp3y;
      // 2a: if_acmpne 35
      // 2d: getstatic ox_.ska Les2;
      // 30: areturn
      // 31: invokestatic hmv.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: new java/lang/IllegalArgumentException
      // 38: dup
      // 39: sipush 19210
      // 3c: ldc2_w 6862996265317294217
      // 3f: lload 1
      // 40: lxor
      // 41: invokedynamic s (IJ)Ljava/lang/String; bsm=hmv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 4a: athrow
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4666256657457868098L, -1764071980591832961L, MethodHandles.lookup().lookupClass()).a(185153864383505L);
      // $VF: monitorexit
      d = var10000;
      long var9 = d ^ 88582575082135L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "a¹ê\nÄgÄúa°{\u0002þuD\b\u0084ðþ»ËA÷\u001e\u0010µ\"Äã%¯_\u0019<¹å\u001aï<Á\u007f\u0018\u009fã[ä_¡\u0091}ÝJV\u0083Sh5\u0094¤å'ì\rzÂ&(Ó\u0017Å\u0016eü²[\u0093H\u009a\u00adÎÚ?\u0004\u0081\u0088ÿ\u009f¥x*\u0019{¡=^µNqhµrÁ´\u009e\u008c\u008a( \u0098Ee\u0016÷@¡Ì\u0094qü\u008eÒh0qú{\u0016\"¼\u0092\u008cS\u009f2\u00ad\u0099\u001fø¢\u009f";
      int var6 = "a¹ê\nÄgÄúa°{\u0002þuD\b\u0084ðþ»ËA÷\u001e\u0010µ\"Äã%¯_\u0019<¹å\u001aï<Á\u007f\u0018\u009fã[ä_¡\u0091}ÝJV\u0083Sh5\u0094¤å'ì\rzÂ&(Ó\u0017Å\u0016eü²[\u0093H\u009a\u00adÎÚ?\u0004\u0081\u0088ÿ\u009f¥x*\u0019{¡=^µNqhµrÁ´\u009e\u008c\u008a( \u0098Ee\u0016÷@¡Ì\u0094qü\u008eÒh0qú{\u0016\"¼\u0092\u008cS\u009f2\u00ad\u0099\u001fø¢\u009f"
         .length();
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
                     h = var7;
                     i = new String[7];
                     nfg = _ku.wgl(b<"s">(12965, 2361819081560459282L ^ var9), 0, 15);
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

                  var4 = "\u0089ÐÁßOþÑ?Î'\u0002¹§xd\u0010Ç\r\u0089NbÕëó(\u009c\u0097,«=\u0094.@Jý\u00973Z¿ó\u008búB(Ë\u0094}[ßy\u0011¥çÖ7¼E+iw\u009c§\u0003k©";
                  var6 = "\u0089ÐÁßOþÑ?Î'\u0002¹§xd\u0010Ç\r\u0089NbÕëó(\u009c\u0097,«=\u0094.@Jý\u00973Z¿ó\u008búB(Ë\u0094}[ßy\u0011¥çÖ7¼E+iw\u009c§\u0003k©"
                     .length();
                  var3 = 24;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21453;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("hmv", var10);
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
         i[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
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
         throw new RuntimeException("hmv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
