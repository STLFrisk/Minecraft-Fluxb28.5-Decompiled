import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class oo6 extends gyu {
   private int m4t;
   public static final d55 g9i;
   public static final d55 bs0;
   public static final n0s ebr;
   private static final long a;
   private static final String f;

   public oo6(int var1, int var2) {
      super(var1);
      this.m4t = var2;
      this.dmv.c10 = 10;
      this.dmv.qy9 = 2;
      if (this.m4t == 1) {
         this.dmv.c10 = 6;
         this.dmv.k9k = 100;
         this.dmv.qy9 = 1;
      }

      try {
         this.v_x(5159473);
         this.j10(0.7F, 0.8F);
         if (this.m4t == 2) {
            this.ril = 353825;
            this.np2 = 3175492;
            this.j10(0.6F, 0.6F);
         }
      } catch (oov var4) {
         throw a(var4);
      }

      try {
         if (this.m4t == 0) {
            this.c1d.add(new gyu$dwn(gse.class, 5, 4, 4));
         }
      } catch (oov var5) {
         throw a(var5);
      }

      try {
         if (this.m4t == 3) {
            this.dmv.c10 = -999;
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   @Override
   public gyu cq8(int param1, boolean param2) {
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
      // 06: ifeq 56
      // 09: getfield oo6.m4t I
      // 0c: bipush 2
      // 0d: if_icmpne 50
      // 10: goto 17
      // 13: invokestatic oo6.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: ldc 353825
      // 1a: nop
      // 1b: putfield oo6.ril I
      // 1e: aload 0
      // 1f: iload 3
      // 20: ifeq 4f
      // 23: goto 2a
      // 26: invokestatic oo6.a (Loov;)Loov;
      // 29: athrow
      // 2a: iload 1
      // 2b: putfield oo6.np2 I
      // 2e: iload 2
      // 2f: ifeq 4e
      // 32: goto 39
      // 35: invokestatic oo6.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: aload 0
      // 3b: getfield oo6.ril I
      // 3e: ldc 16711422
      // 40: nop
      // 41: iand
      // 42: bipush 1
      // 43: ishr
      // 44: putfield oo6.ril I
      // 47: goto 4e
      // 4a: invokestatic oo6.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: areturn
      // 50: aload 0
      // 51: iload 1
      // 52: iload 2
      // 53: invokespecial gyu.cq8 (IZ)Lgyu;
      // 56: areturn
   }

   @Override
   public e9q jk9(Random param1) {
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
      // 05: getfield oo6.m4t I
      // 08: bipush 3
      // 09: iload 2
      // 0a: ifeq 4b
      // 0d: if_icmpne 3b
      // 10: goto 17
      // 13: invokestatic oo6.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 1
      // 18: bipush 3
      // 19: invokevirtual java/util/Random.nextInt (I)I
      // 1c: iload 2
      // 1d: ifeq 3f
      // 20: goto 27
      // 23: invokestatic oo6.a (Loov;)Loov;
      // 26: athrow
      // 27: ifle 3b
      // 2a: goto 31
      // 2d: invokestatic oo6.a (Loov;)Loov;
      // 30: athrow
      // 31: getstatic oo6.ebr Ln0s;
      // 34: goto 6b
      // 37: invokestatic oo6.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield oo6.m4t I
      // 3f: iload 2
      // 40: ifeq 5a
      // 43: bipush 2
      // 44: goto 4b
      // 47: invokestatic oo6.a (Loov;)Loov;
      // 4a: athrow
      // 4b: if_icmpeq 68
      // 4e: aload 1
      // 4f: bipush 5
      // 50: invokevirtual java/util/Random.nextInt (I)I
      // 53: goto 5a
      // 56: invokestatic oo6.a (Loov;)Loov;
      // 59: athrow
      // 5a: ifeq 68
      // 5d: aload 0
      // 5e: getfield oo6.zqo Lffn;
      // 61: goto 6b
      // 64: invokestatic oo6.a (Loov;)Loov;
      // 67: athrow
      // 68: getstatic oo6.bs0 Ld55;
      // 6b: areturn
   }

   @Override
   public u5m$cco op2(Random param1, mew param2) {
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
      // 05: iload 3
      // 06: ifne 71
      // 09: getfield oo6.m4t I
      // 0c: bipush 1
      // 0d: if_icmpne 70
      // 10: goto 17
      // 13: invokestatic oo6.a (Loov;)Loov;
      // 16: athrow
      // 17: dconst_1
      // 18: getstatic oo6.sx9 Luwf;
      // 1b: aload 2
      // 1c: invokevirtual mew.getX ()I
      // 1f: i2d
      // 20: ldc2_w 48.0
      // 23: ddiv
      // 24: aload 2
      // 25: invokevirtual mew.getZ ()I
      // 28: i2d
      // 29: ldc2_w 48.0
      // 2c: ddiv
      // 2d: invokevirtual uwf.oj4 (DD)D
      // 30: dadd
      // 31: ldc2_w 2.0
      // 34: ddiv
      // 35: dconst_0
      // 36: ldc2_w 0.9999
      // 39: invokestatic fe6.lft (DDD)D
      // 3c: dstore 4
      // 3e: invokestatic u5m$cco.values ()[Lu5m$cco;
      // 41: dload 4
      // 43: invokestatic u5m$cco.values ()[Lu5m$cco;
      // 46: arraylength
      // 47: i2d
      // 48: dmul
      // 49: d2i
      // 4a: aaload
      // 4b: astore 6
      // 4d: aload 6
      // 4f: iload 3
      // 50: ifne 6a
      // 53: getstatic u5m$cco.i9o Lu5m$cco;
      // 56: if_acmpne 6d
      // 59: goto 60
      // 5c: invokestatic oo6.a (Loov;)Loov;
      // 5f: athrow
      // 60: getstatic u5m$cco.gye Lu5m$cco;
      // 63: goto 6a
      // 66: invokestatic oo6.a (Loov;)Loov;
      // 69: athrow
      // 6a: goto 6f
      // 6d: aload 6
      // 6f: areturn
      // 70: aload 0
      // 71: aload 1
      // 72: aload 2
      // 73: invokespecial gyu.op2 (Ljava/util/Random;Lmew;)Lu5m$cco;
      // 76: areturn
   }

   @Override
   public void u0r(t9d param1, Random param2, mew param3) {
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
      // 006: getfield oo6.m4t I
      // 009: bipush 3
      // 00a: iload 4
      // 00c: ifne 0d1
      // 00f: if_icmpne 0cb
      // 012: goto 019
      // 015: invokestatic oo6.a (Loov;)Loov;
      // 018: athrow
      // 019: bipush 0
      // 01a: istore 5
      // 01c: iload 5
      // 01e: bipush 4
      // 01f: if_icmpge 0cb
      // 022: bipush 0
      // 023: iload 4
      // 025: ifne 0d8
      // 028: istore 6
      // 02a: iload 6
      // 02c: bipush 4
      // 02d: if_icmpge 0c3
      // 030: iload 5
      // 032: bipush 4
      // 033: imul
      // 034: bipush 1
      // 035: iadd
      // 036: bipush 8
      // 038: iadd
      // 039: aload 2
      // 03a: bipush 3
      // 03b: invokevirtual java/util/Random.nextInt (I)I
      // 03e: iadd
      // 03f: istore 7
      // 041: iload 6
      // 043: bipush 4
      // 044: imul
      // 045: bipush 1
      // 046: iadd
      // 047: bipush 8
      // 049: iadd
      // 04a: aload 2
      // 04b: bipush 3
      // 04c: invokevirtual java/util/Random.nextInt (I)I
      // 04f: iadd
      // 050: istore 8
      // 052: aload 1
      // 053: aload 3
      // 054: iload 7
      // 056: bipush 0
      // 057: iload 8
      // 059: invokevirtual mew.ec4 (III)Lmew;
      // 05c: invokevirtual t9d.p9y (Lmew;)Lmew;
      // 05f: astore 9
      // 061: aload 2
      // 062: bipush 20
      // 064: invokevirtual java/util/Random.nextInt (I)I
      // 067: iload 4
      // 069: ifne 01e
      // 06c: ifne 087
      // 06f: new ts2
      // 072: dup
      // 073: invokespecial ts2.<init> ()V
      // 076: astore 10
      // 078: aload 10
      // 07a: aload 1
      // 07b: aload 2
      // 07c: aload 9
      // 07e: invokevirtual ts2.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 081: pop
      // 082: iload 4
      // 084: ifeq 0bb
      // 087: aload 0
      // 088: aload 2
      // 089: invokevirtual oo6.jk9 (Ljava/util/Random;)Le9q;
      // 08c: astore 10
      // 08e: aload 10
      // 090: invokevirtual e9q.n3m ()V
      // 093: iload 4
      // 095: ifne 0be
      // 098: aload 10
      // 09a: aload 1
      // 09b: aload 2
      // 09c: aload 9
      // 09e: invokevirtual e9q.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 0a1: ifeq 0bb
      // 0a4: goto 0ab
      // 0a7: invokestatic oo6.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 10
      // 0ad: aload 1
      // 0ae: aload 2
      // 0af: aload 9
      // 0b1: invokevirtual e9q.mpp (Lt9d;Ljava/util/Random;Lmew;)V
      // 0b4: goto 0bb
      // 0b7: invokestatic oo6.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: iinc 6 1
      // 0be: iload 4
      // 0c0: ifeq 02a
      // 0c3: iinc 5 1
      // 0c6: iload 4
      // 0c8: ifeq 01c
      // 0cb: aload 2
      // 0cc: bipush 5
      // 0cd: invokevirtual java/util/Random.nextInt (I)I
      // 0d0: bipush 3
      // 0d1: isub
      // 0d2: istore 5
      // 0d4: aload 0
      // 0d5: getfield oo6.m4t I
      // 0d8: iload 4
      // 0da: ifne 0f3
      // 0dd: bipush 1
      // 0de: if_icmpne 0f2
      // 0e1: goto 0e8
      // 0e4: invokestatic oo6.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: iinc 5 2
      // 0eb: goto 0f2
      // 0ee: invokestatic oo6.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: bipush 0
      // 0f3: istore 6
      // 0f5: iload 6
      // 0f7: iload 5
      // 0f9: if_icmpge 20a
      // 0fc: aload 2
      // 0fd: bipush 3
      // 0fe: invokevirtual java/util/Random.nextInt (I)I
      // 101: istore 7
      // 103: iload 4
      // 105: ifne 211
      // 108: iload 7
      // 10a: iload 4
      // 10c: ifne 13e
      // 10f: goto 116
      // 112: invokestatic oo6.a (Loov;)Loov;
      // 115: athrow
      // 116: ifne 135
      // 119: goto 120
      // 11c: invokestatic oo6.a (Loov;)Loov;
      // 11f: athrow
      // 120: getstatic oo6.e_t Luio;
      // 123: getstatic ldj$vn8.pnm Lldj$vn8;
      // 126: invokevirtual uio.r91 (Lldj$vn8;)V
      // 129: iload 4
      // 12b: ifeq 18c
      // 12e: goto 135
      // 131: invokestatic oo6.a (Loov;)Loov;
      // 134: athrow
      // 135: iload 7
      // 137: goto 13e
      // 13a: invokestatic oo6.a (Loov;)Loov;
      // 13d: athrow
      // 13e: bipush 1
      // 13f: iload 4
      // 141: ifne 179
      // 144: if_icmpne 163
      // 147: goto 14e
      // 14a: invokestatic oo6.a (Loov;)Loov;
      // 14d: athrow
      // 14e: getstatic oo6.e_t Luio;
      // 151: getstatic ldj$vn8.sp9 Lldj$vn8;
      // 154: invokevirtual uio.r91 (Lldj$vn8;)V
      // 157: iload 4
      // 159: ifeq 18c
      // 15c: goto 163
      // 15f: invokestatic oo6.a (Loov;)Loov;
      // 162: athrow
      // 163: iload 7
      // 165: iload 4
      // 167: ifne 18d
      // 16a: goto 171
      // 16d: invokestatic oo6.a (Loov;)Loov;
      // 170: athrow
      // 171: bipush 2
      // 172: goto 179
      // 175: invokestatic oo6.a (Loov;)Loov;
      // 178: athrow
      // 179: if_icmpne 18c
      // 17c: getstatic oo6.e_t Luio;
      // 17f: getstatic ldj$vn8.mal Lldj$vn8;
      // 182: invokevirtual uio.r91 (Lldj$vn8;)V
      // 185: goto 18c
      // 188: invokestatic oo6.a (Loov;)Loov;
      // 18b: athrow
      // 18c: bipush 0
      // 18d: istore 8
      // 18f: iload 8
      // 191: bipush 5
      // 192: if_icmpge 202
      // 195: aload 2
      // 196: bipush 16
      // 198: invokevirtual java/util/Random.nextInt (I)I
      // 19b: bipush 8
      // 19d: iadd
      // 19e: istore 9
      // 1a0: aload 2
      // 1a1: bipush 16
      // 1a3: invokevirtual java/util/Random.nextInt (I)I
      // 1a6: bipush 8
      // 1a8: iadd
      // 1a9: istore 10
      // 1ab: aload 2
      // 1ac: aload 1
      // 1ad: aload 3
      // 1ae: iload 9
      // 1b0: bipush 0
      // 1b1: iload 10
      // 1b3: invokevirtual mew.ec4 (III)Lmew;
      // 1b6: invokevirtual t9d.p9y (Lmew;)Lmew;
      // 1b9: invokevirtual mew.getY ()I
      // 1bc: bipush 32
      // 1be: iadd
      // 1bf: invokevirtual java/util/Random.nextInt (I)I
      // 1c2: istore 11
      // 1c4: iload 4
      // 1c6: ifne 1fd
      // 1c9: getstatic oo6.e_t Luio;
      // 1cc: aload 1
      // 1cd: aload 2
      // 1ce: new mew
      // 1d1: dup
      // 1d2: aload 3
      // 1d3: invokevirtual mew.getX ()I
      // 1d6: iload 9
      // 1d8: iadd
      // 1d9: iload 11
      // 1db: aload 3
      // 1dc: invokevirtual mew.getZ ()I
      // 1df: iload 10
      // 1e1: iadd
      // 1e2: invokespecial mew.<init> (III)V
      // 1e5: invokevirtual uio.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 1e8: iload 4
      // 1ea: ifne 0f7
      // 1ed: goto 1f4
      // 1f0: invokestatic oo6.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: ifeq 1fa
      // 1f7: goto 202
      // 1fa: iinc 8 1
      // 1fd: iload 4
      // 1ff: ifeq 18f
      // 202: iinc 6 1
      // 205: iload 4
      // 207: ifeq 0f5
      // 20a: aload 0
      // 20b: aload 1
      // 20c: aload 2
      // 20d: aload 3
      // 20e: invokespecial gyu.u0r (Lt9d;Ljava/util/Random;Lmew;)V
      // 211: return
   }

   @Override
   public int bib(mew param1) {
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
      // 05: aload 1
      // 06: invokespecial gyu.bib (Lmew;)I
      // 09: istore 3
      // 0a: aload 0
      // 0b: getfield oo6.m4t I
      // 0e: bipush 3
      // 0f: iload 2
      // 10: ifeq 2e
      // 13: if_icmpne 32
      // 16: goto 1d
      // 19: invokestatic oo6.a (Loov;)Loov;
      // 1c: athrow
      // 1d: iload 3
      // 1e: ldc 16711422
      // 20: nop
      // 21: iand
      // 22: ldc 2634762
      // 24: nop
      // 25: iadd
      // 26: bipush 1
      // 27: goto 2e
      // 2a: invokestatic oo6.a (Loov;)Loov;
      // 2d: athrow
      // 2e: ishr
      // 2f: goto 33
      // 32: iload 3
      // 33: ireturn
   }

   @Override
   public gyu hiq(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic oo6.a J
      // 03: ldc2_w 130842095438940
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield oo6.mu9 I
      // 11: getstatic gyu.yo0 Lgyu;
      // 14: getfield gyu.mu9 I
      // 17: iload 4
      // 19: ifne 74
      // 1c: if_icmpne 6a
      // 1f: goto 26
      // 22: invokestatic oo6.a (Loov;)Loov;
      // 25: athrow
      // 26: new oo6
      // 29: dup
      // 2a: iload 1
      // 2b: bipush 1
      // 2c: invokespecial oo6.<init> (II)V
      // 2f: astore 5
      // 31: aload 5
      // 33: new gyu$ekk
      // 36: dup
      // 37: aload 0
      // 38: getfield oo6.f6x F
      // 3b: aload 0
      // 3c: getfield oo6.yeh F
      // 3f: ldc 0.2
      // 41: nop
      // 42: fadd
      // 43: invokespecial gyu$ekk.<init> (FF)V
      // 46: invokevirtual oo6.wzy (Lgyu$ekk;)Lgyu;
      // 49: pop
      // 4a: aload 5
      // 4c: getstatic oo6.f Ljava/lang/String;
      // 4f: nop
      // 50: invokevirtual oo6.cb4 (Ljava/lang/String;)Lgyu;
      // 53: pop
      // 54: aload 5
      // 56: ldc 6976549
      // 58: nop
      // 59: bipush 1
      // 5a: invokevirtual oo6.cq8 (IZ)Lgyu;
      // 5d: pop
      // 5e: aload 5
      // 60: ldc 8233509
      // 62: nop
      // 63: invokevirtual oo6.v_x (I)Lgyu;
      // 66: pop
      // 67: aload 5
      // 69: areturn
      // 6a: aload 0
      // 6b: getfield oo6.mu9 I
      // 6e: getstatic gyu.hwi Lgyu;
      // 71: getfield gyu.mu9 I
      // 74: iload 4
      // 76: ifne 94
      // 79: if_icmpeq a8
      // 7c: goto 83
      // 7f: invokestatic oo6.a (Loov;)Loov;
      // 82: athrow
      // 83: aload 0
      // 84: getfield oo6.mu9 I
      // 87: getstatic gyu.i11 Lgyu;
      // 8a: getfield gyu.mu9 I
      // 8d: goto 94
      // 90: invokestatic oo6.a (Loov;)Loov;
      // 93: athrow
      // 94: if_icmpeq a8
      // 97: new oo6$1
      // 9a: dup
      // 9b: aload 0
      // 9c: iload 1
      // 9d: aload 0
      // 9e: invokespecial oo6$1.<init> (Loo6;ILgyu;)V
      // a1: goto b2
      // a4: invokestatic oo6.a (Loov;)Loov;
      // a7: athrow
      // a8: new oo6$2
      // ab: dup
      // ac: aload 0
      // ad: iload 1
      // ae: aload 0
      // af: invokespecial oo6$2.<init> (Loo6;ILgyu;)V
      // b2: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2788050854627482623L, 5297766517279256323L, MethodHandles.lookup().lookupClass()).a(274599810385717L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 70286100431230L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("L4\u001f\u0089¼.Úý5H\u008cºFzîa".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
      g9i = new d55(false, true);
      bs0 = new d55(false, false);
      ebr = new n0s(false);
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
