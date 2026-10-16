import java.util.List;
import java.util.Random;

public class s9p extends e9q {
   private Random l5h;
   private OpaquePredicate p5t;
   private mew cgs = mew._9b;
   public int _jw;
   public int lz2;
   public double ru5 = 0.618;
   public double d4k = 0.381;
   public double hd3 = 1.0;
   public double jce = 1.0;
   public int d40 = 1;
   public int dqi = 12;
   public int g8p = 4;
   public List vtz;

   public s9p(boolean var1) {
      super(var1);
   }

   public void igf() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: aload 0
      // 006: getfield s9p._jw I
      // 009: i2d
      // 00a: aload 0
      // 00b: getfield s9p.ru5 D
      // 00e: dmul
      // 00f: d2i
      // 010: putfield s9p.lz2 I
      // 013: aload 0
      // 014: getfield s9p.lz2 I
      // 017: iload 1
      // 018: ifeq 053
      // 01b: aload 0
      // 01c: getfield s9p._jw I
      // 01f: if_icmplt 03a
      // 022: goto 029
      // 025: invokestatic s9p.a (Loov;)Loov;
      // 028: athrow
      // 029: aload 0
      // 02a: aload 0
      // 02b: getfield s9p._jw I
      // 02e: bipush 1
      // 02f: isub
      // 030: putfield s9p.lz2 I
      // 033: goto 03a
      // 036: invokestatic s9p.a (Loov;)Loov;
      // 039: athrow
      // 03a: ldc2_w 1.382
      // 03d: aload 0
      // 03e: getfield s9p.jce D
      // 041: aload 0
      // 042: getfield s9p._jw I
      // 045: i2d
      // 046: dmul
      // 047: ldc2_w 13.0
      // 04a: ddiv
      // 04b: ldc2_w 2.0
      // 04e: invokestatic java/lang/Math.pow (DD)D
      // 051: dadd
      // 052: d2i
      // 053: istore 2
      // 054: iload 2
      // 055: bipush 1
      // 056: iload 1
      // 057: ifeq 071
      // 05a: if_icmpge 066
      // 05d: goto 064
      // 060: invokestatic s9p.a (Loov;)Loov;
      // 063: athrow
      // 064: bipush 1
      // 065: istore 2
      // 066: aload 0
      // 067: getfield s9p.cgs Lmew;
      // 06a: invokevirtual mew.getY ()I
      // 06d: aload 0
      // 06e: getfield s9p.lz2 I
      // 071: iadd
      // 072: istore 3
      // 073: aload 0
      // 074: getfield s9p._jw I
      // 077: aload 0
      // 078: getfield s9p.g8p I
      // 07b: isub
      // 07c: istore 4
      // 07e: aload 0
      // 07f: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 082: putfield s9p.vtz Ljava/util/List;
      // 085: aload 0
      // 086: getfield s9p.vtz Ljava/util/List;
      // 089: new s9p$pgo
      // 08c: dup
      // 08d: aload 0
      // 08e: getfield s9p.cgs Lmew;
      // 091: iload 4
      // 093: invokevirtual mew.z89 (I)Lmew;
      // 096: iload 3
      // 097: invokespecial s9p$pgo.<init> (Lmew;I)V
      // 09a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 09f: pop
      // 0a0: iload 4
      // 0a2: iflt 1fb
      // 0a5: aload 0
      // 0a6: iload 4
      // 0a8: invokevirtual s9p.ljf (I)F
      // 0ab: fstore 5
      // 0ad: iload 1
      // 0ae: ifeq 1f7
      // 0b1: fload 5
      // 0b3: fconst_0
      // 0b4: fcmpl
      // 0b5: iflt 1f4
      // 0b8: goto 0bf
      // 0bb: invokestatic s9p.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: bipush 0
      // 0c0: istore 6
      // 0c2: iload 6
      // 0c4: iload 2
      // 0c5: if_icmpge 1f4
      // 0c8: aload 0
      // 0c9: getfield s9p.hd3 D
      // 0cc: fload 5
      // 0ce: f2d
      // 0cf: dmul
      // 0d0: aload 0
      // 0d1: getfield s9p.l5h Ljava/util/Random;
      // 0d4: invokevirtual java/util/Random.nextFloat ()F
      // 0d7: f2d
      // 0d8: ldc2_w 0.328
      // 0db: dadd
      // 0dc: dmul
      // 0dd: dstore 7
      // 0df: aload 0
      // 0e0: getfield s9p.l5h Ljava/util/Random;
      // 0e3: invokevirtual java/util/Random.nextFloat ()F
      // 0e6: fconst_2
      // 0e7: fmul
      // 0e8: f2d
      // 0e9: ldc2_w 3.141592653589793
      // 0ec: dmul
      // 0ed: dstore 9
      // 0ef: dload 7
      // 0f1: dload 9
      // 0f3: invokestatic java/lang/Math.sin (D)D
      // 0f6: dmul
      // 0f7: ldc2_w 0.5
      // 0fa: dadd
      // 0fb: dstore 11
      // 0fd: dload 7
      // 0ff: dload 9
      // 101: invokestatic java/lang/Math.cos (D)D
      // 104: dmul
      // 105: ldc2_w 0.5
      // 108: dadd
      // 109: dstore 13
      // 10b: aload 0
      // 10c: getfield s9p.cgs Lmew;
      // 10f: dload 11
      // 111: iload 4
      // 113: bipush 1
      // 114: isub
      // 115: i2d
      // 116: dload 13
      // 118: invokevirtual mew.f_0 (DDD)Lmew;
      // 11b: astore 15
      // 11d: aload 15
      // 11f: aload 0
      // 120: getfield s9p.g8p I
      // 123: invokevirtual mew.z89 (I)Lmew;
      // 126: astore 16
      // 128: iload 1
      // 129: ifeq 1f0
      // 12c: aload 0
      // 12d: aload 15
      // 12f: aload 16
      // 131: invokevirtual s9p._w0 (Lmew;Lmew;)I
      // 134: bipush -1
      // 135: iload 1
      // 136: ifeq 0c5
      // 139: goto 140
      // 13c: invokestatic s9p.a (Loov;)Loov;
      // 13f: athrow
      // 140: if_icmpne 1ed
      // 143: aload 0
      // 144: getfield s9p.cgs Lmew;
      // 147: invokevirtual mew.getX ()I
      // 14a: aload 15
      // 14c: invokevirtual mew.getX ()I
      // 14f: isub
      // 150: istore 17
      // 152: aload 0
      // 153: getfield s9p.cgs Lmew;
      // 156: invokevirtual mew.getZ ()I
      // 159: aload 15
      // 15b: invokevirtual mew.getZ ()I
      // 15e: isub
      // 15f: istore 18
      // 161: aload 15
      // 163: invokevirtual mew.getY ()I
      // 166: i2d
      // 167: iload 17
      // 169: iload 17
      // 16b: imul
      // 16c: iload 18
      // 16e: iload 18
      // 170: imul
      // 171: iadd
      // 172: i2d
      // 173: invokestatic java/lang/Math.sqrt (D)D
      // 176: aload 0
      // 177: getfield s9p.d4k D
      // 17a: dmul
      // 17b: dsub
      // 17c: dstore 19
      // 17e: dload 19
      // 180: iload 1
      // 181: ifeq 19b
      // 184: iload 3
      // 185: i2d
      // 186: dcmpl
      // 187: ifle 199
      // 18a: goto 191
      // 18d: invokestatic s9p.a (Loov;)Loov;
      // 190: athrow
      // 191: iload 3
      // 192: goto 19c
      // 195: invokestatic s9p.a (Loov;)Loov;
      // 198: athrow
      // 199: dload 19
      // 19b: d2i
      // 19c: istore 21
      // 19e: new mew
      // 1a1: dup
      // 1a2: aload 0
      // 1a3: getfield s9p.cgs Lmew;
      // 1a6: invokevirtual mew.getX ()I
      // 1a9: iload 21
      // 1ab: aload 0
      // 1ac: getfield s9p.cgs Lmew;
      // 1af: invokevirtual mew.getZ ()I
      // 1b2: invokespecial mew.<init> (III)V
      // 1b5: astore 22
      // 1b7: iload 1
      // 1b8: ifeq 1f0
      // 1bb: aload 0
      // 1bc: aload 22
      // 1be: aload 15
      // 1c0: invokevirtual s9p._w0 (Lmew;Lmew;)I
      // 1c3: bipush -1
      // 1c4: if_icmpne 1ed
      // 1c7: goto 1ce
      // 1ca: invokestatic s9p.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: aload 0
      // 1cf: getfield s9p.vtz Ljava/util/List;
      // 1d2: new s9p$pgo
      // 1d5: dup
      // 1d6: aload 15
      // 1d8: aload 22
      // 1da: invokevirtual mew.getY ()I
      // 1dd: invokespecial s9p$pgo.<init> (Lmew;I)V
      // 1e0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1e5: pop
      // 1e6: goto 1ed
      // 1e9: invokestatic s9p.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: iinc 6 1
      // 1f0: iload 1
      // 1f1: ifne 0c2
      // 1f4: iinc 4 -1
      // 1f7: iload 1
      // 1f8: ifne 0a0
      // 1fb: return
   }

   public void ezg(mew param1, float param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: fload 2
      // 01: f2d
      // 02: ldc2_w 0.618
      // 05: dadd
      // 06: d2i
      // 07: istore 5
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: iload 5
      // 0e: ineg
      // 0f: istore 6
      // 11: istore 4
      // 13: iload 6
      // 15: iload 5
      // 17: if_icmpgt b7
      // 1a: iload 5
      // 1c: ineg
      // 1d: istore 7
      // 1f: iload 7
      // 21: iload 5
      // 23: if_icmpgt af
      // 26: iload 6
      // 28: invokestatic java/lang/Math.abs (I)I
      // 2b: i2d
      // 2c: ldc2_w 0.5
      // 2f: dadd
      // 30: ldc2_w 2.0
      // 33: invokestatic java/lang/Math.pow (DD)D
      // 36: iload 7
      // 38: invokestatic java/lang/Math.abs (I)I
      // 3b: i2d
      // 3c: ldc2_w 0.5
      // 3f: dadd
      // 40: ldc2_w 2.0
      // 43: invokestatic java/lang/Math.pow (DD)D
      // 46: dadd
      // 47: fload 2
      // 48: fload 2
      // 49: fmul
      // 4a: f2d
      // 4b: dcmpg
      // 4c: iload 4
      // 4e: ifeq 15
      // 51: ifgt a7
      // 54: aload 1
      // 55: iload 6
      // 57: bipush 0
      // 58: iload 7
      // 5a: invokevirtual mew.ec4 (III)Lmew;
      // 5d: astore 8
      // 5f: aload 0
      // 60: getfield s9p.p5t Lt9d;
      // 63: aload 8
      // 65: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 68: invokeinterface zfz.r_y ()Le0x; 1
      // 6d: invokevirtual e0x.p1r ()Lp3y;
      // 70: astore 9
      // 72: aload 9
      // 74: getstatic p3y.cei Lp3y;
      // 77: iload 4
      // 79: ifeq 92
      // 7c: if_acmpeq 95
      // 7f: goto 86
      // 82: invokestatic s9p.a (Loov;)Loov;
      // 85: athrow
      // 86: aload 9
      // 88: getstatic p3y.hh1 Lp3y;
      // 8b: goto 92
      // 8e: invokestatic s9p.a (Loov;)Loov;
      // 91: athrow
      // 92: if_acmpne a7
      // 95: aload 0
      // 96: aload 0
      // 97: getfield s9p.p5t Lt9d;
      // 9a: aload 8
      // 9c: aload 3
      // 9d: invokevirtual s9p.u0f (Lt9d;Lmew;Lzfz;)V
      // a0: goto a7
      // a3: invokestatic s9p.a (Loov;)Loov;
      // a6: athrow
      // a7: iinc 7 1
      // aa: iload 4
      // ac: ifne 1f
      // af: iinc 6 1
      // b2: iload 4
      // b4: ifne 13
      // b7: return
   }

   public float ljf(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: i2f
      // 06: aload 0
      // 07: getfield s9p._jw I
      // 0a: i2f
      // 0b: ldc 0.3
      // 0d: nop
      // 0e: fmul
      // 0f: fcmpg
      // 10: iload 2
      // 11: ifeq 2a
      // 14: ifge 26
      // 17: goto 1e
      // 1a: invokestatic s9p.a (Loov;)Loov;
      // 1d: athrow
      // 1e: ldc -1.0
      // 20: nop
      // 21: freturn
      // 22: invokestatic s9p.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: getfield s9p._jw I
      // 2a: i2f
      // 2b: fconst_2
      // 2c: fdiv
      // 2d: fstore 3
      // 2e: fload 3
      // 2f: iload 1
      // 30: i2f
      // 31: fsub
      // 32: fstore 4
      // 34: fload 3
      // 35: fload 3
      // 36: fmul
      // 37: fload 4
      // 39: fload 4
      // 3b: fmul
      // 3c: fsub
      // 3d: invokestatic fe6.bug (F)F
      // 40: fstore 5
      // 42: fload 4
      // 44: fconst_0
      // 45: fcmpl
      // 46: iload 2
      // 47: ifeq 74
      // 4a: ifne 5b
      // 4d: goto 54
      // 50: invokestatic s9p.a (Loov;)Loov;
      // 53: athrow
      // 54: fload 3
      // 55: fstore 5
      // 57: iload 2
      // 58: ifne 7d
      // 5b: fload 4
      // 5d: invokestatic java/lang/Math.abs (F)F
      // 60: fload 3
      // 61: iload 2
      // 62: ifeq 82
      // 65: goto 6c
      // 68: invokestatic s9p.a (Loov;)Loov;
      // 6b: athrow
      // 6c: fcmpl
      // 6d: goto 74
      // 70: invokestatic s9p.a (Loov;)Loov;
      // 73: athrow
      // 74: iflt 7d
      // 77: fconst_0
      // 78: freturn
      // 79: invokestatic s9p.a (Loov;)Loov;
      // 7c: athrow
      // 7d: fload 5
      // 7f: ldc 0.5
      // 81: nop
      // 82: fmul
      // 83: freturn
   }

   public float lkq(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 14
      // 09: iflt 54
      // 0c: goto 13
      // 0f: invokestatic s9p.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 1
      // 14: iload 2
      // 15: ifne 2e
      // 18: aload 0
      // 19: getfield s9p.g8p I
      // 1c: if_icmpge 54
      // 1f: goto 26
      // 22: invokestatic s9p.a (Loov;)Loov;
      // 25: athrow
      // 26: iload 1
      // 27: goto 2e
      // 2a: invokestatic s9p.a (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 2
      // 2f: ifne 3d
      // 32: ifeq 50
      // 35: goto 3c
      // 38: invokestatic s9p.a (Loov;)Loov;
      // 3b: athrow
      // 3c: iload 1
      // 3d: aload 0
      // 3e: getfield s9p.g8p I
      // 41: bipush 1
      // 42: isub
      // 43: if_icmpeq 50
      // 46: ldc 3.0
      // 48: nop
      // 49: goto 57
      // 4c: invokestatic s9p.a (Loov;)Loov;
      // 4f: athrow
      // 50: fconst_2
      // 51: goto 57
      // 54: ldc -1.0
      // 56: nop
      // 57: freturn
   }

   public void _ph(mew var1) {
      int var2 = OpaquePredicate.b();
      int var3 = 0;

      while (var3 < this.g8p) {
         this.ezg(var1.z89(var3), this.lkq(var3), ox_.rwl.l4i().zvi(_cv.sdu, false));
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   public void gi3(mew var1, mew var2, e0x var3) {
      mew var5 = var2.ec4(-var1.getX(), -var1.getY(), -var1.getZ());
      int var10000 = OpaquePredicate.c();
      int var6 = this.d6d(var5);
      float var7 = (float)var5.getX() / (float)var6;
      int var4 = var10000;
      float var8 = (float)var5.getY() / (float)var6;
      float var9 = (float)var5.getZ() / (float)var6;
      int var10 = 0;

      while (var10 <= var6) {
         mew var11 = var1.f_0((double)(0.5F + (float)var10 * var7), (double)(0.5F + (float)var10 * var8), (double)(0.5F + (float)var10 * var9));
         _h4$i61 var12 = this.kwv(var1, var11);
         this.u0f(this.p5t, var11, var3.l4i().zvi(_h4.msa, var12));
         var10++;
         if (var4 != 0) {
            break;
         }
      }
   }

   private int d6d(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual mew.getX ()I
      // 04: invokestatic fe6.z1m (I)I
      // 07: istore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: aload 1
      // 0c: invokevirtual mew.getY ()I
      // 0f: invokestatic fe6.z1m (I)I
      // 12: istore 4
      // 14: aload 1
      // 15: invokevirtual mew.getZ ()I
      // 18: invokestatic fe6.z1m (I)I
      // 1b: istore 5
      // 1d: istore 2
      // 1e: iload 5
      // 20: iload 3
      // 21: iload 2
      // 22: ifne 5f
      // 25: if_icmple 51
      // 28: goto 2f
      // 2b: invokestatic s9p.a (Loov;)Loov;
      // 2e: athrow
      // 2f: iload 5
      // 31: iload 4
      // 33: iload 2
      // 34: ifne 5f
      // 37: goto 3e
      // 3a: invokestatic s9p.a (Loov;)Loov;
      // 3d: athrow
      // 3e: if_icmple 51
      // 41: goto 48
      // 44: invokestatic s9p.a (Loov;)Loov;
      // 47: athrow
      // 48: iload 5
      // 4a: goto 68
      // 4d: invokestatic s9p.a (Loov;)Loov;
      // 50: athrow
      // 51: iload 4
      // 53: iload 2
      // 54: ifne 64
      // 57: iload 3
      // 58: goto 5f
      // 5b: invokestatic s9p.a (Loov;)Loov;
      // 5e: athrow
      // 5f: if_icmple 67
      // 62: iload 4
      // 64: goto 68
      // 67: iload 3
      // 68: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private _h4$i61 kwv(mew var1, mew var2) {
      _h4$i61 var4 = _h4$i61.z89;
      int var10000 = OpaquePredicate.c();
      int var5 = Math.abs(var2.getX() - var1.getX());
      int var6 = Math.abs(var2.getZ() - var1.getZ());
      int var3 = var10000;
      int var7 = Math.max(var5, var6);

      label51: {
         try {
            var10000 = var7;
            if (var3 != 0) {
               break label51;
            }

            if (var7 <= 0) {
               return var4;
            }
         } catch (oov var11) {
            throw a(var11);
         }

         var10000 = var5;
      }

      int var10001;
      label63: {
         label57: {
            try {
               var10001 = var7;
               if (var3 != 0) {
                  break label63;
               }

               if (var10000 != var7) {
                  break label57;
               }
            } catch (oov var10) {
               throw a(var10);
            }

            var4 = _h4$i61.gs0;

            try {
               if (var3 == 0) {
                  return var4;
               }
            } catch (oov var9) {
               boolean var14 = false;
               throw a(var9);
            }
         }

         try {
            var10000 = var6;
            var10001 = var7;
         } catch (oov var8) {
            boolean var15 = false;
            throw a(var8);
         }
      }

      if (var10000 == var10001) {
         var4 = _h4$i61.e6j;
      }

      return var4;
   }

   public void j3e() {
      int var1 = OpaquePredicate.c();

      for (s9p$pgo var3 : this.vtz) {
         this._ph(var3);
         if (var1 != 0) {
            break;
         }
      }
   }

   public boolean ktv(int var1) {
      int var2 = OpaquePredicate.c();

      try {
         double var4;
         int var10000 = (var4 = (double)var1 - (double)this._jw * 0.2) == 0.0 ? 0 : (var4 < 0.0 ? -1 : 1);
         if (var2 != 0) {
            return (boolean)var10000;
         }

         if (var10000 >= 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   public void cx9() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield s9p.cgs Lmew;
      // 04: astore 2
      // 05: aload 0
      // 06: getfield s9p.cgs Lmew;
      // 09: aload 0
      // 0a: getfield s9p.lz2 I
      // 0d: invokevirtual mew.z89 (I)Lmew;
      // 10: astore 3
      // 11: invokestatic OpaquePredicate.b ()I
      // 14: getstatic ox_.uom Le0x;
      // 17: astore 4
      // 19: istore 1
      // 1a: aload 0
      // 1b: aload 2
      // 1c: aload 3
      // 1d: aload 4
      // 1f: invokevirtual s9p.gi3 (Lmew;Lmew;Le0x;)V
      // 22: aload 0
      // 23: iload 1
      // 24: ifeq 5f
      // 27: getfield s9p.d40 I
      // 2a: bipush 2
      // 2b: if_icmpne 6c
      // 2e: goto 35
      // 31: invokestatic s9p.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: aload 2
      // 37: invokevirtual mew.o_8 ()Lmew;
      // 3a: aload 3
      // 3b: invokevirtual mew.o_8 ()Lmew;
      // 3e: aload 4
      // 40: invokevirtual s9p.gi3 (Lmew;Lmew;Le0x;)V
      // 43: aload 0
      // 44: aload 2
      // 45: invokevirtual mew.o_8 ()Lmew;
      // 48: invokevirtual mew.z6x ()Lmew;
      // 4b: aload 3
      // 4c: invokevirtual mew.o_8 ()Lmew;
      // 4f: invokevirtual mew.z6x ()Lmew;
      // 52: aload 4
      // 54: invokevirtual s9p.gi3 (Lmew;Lmew;Le0x;)V
      // 57: aload 0
      // 58: goto 5f
      // 5b: invokestatic s9p.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 2
      // 60: invokevirtual mew.z6x ()Lmew;
      // 63: aload 3
      // 64: invokevirtual mew.z6x ()Lmew;
      // 67: aload 4
      // 69: invokevirtual s9p.gi3 (Lmew;Lmew;Le0x;)V
      // 6c: return
   }

   public void lbq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield s9p.vtz Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 2
      // 0e: aload 2
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 85
      // 17: aload 2
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast s9p$pgo
      // 20: astore 3
      // 21: aload 3
      // 22: invokevirtual s9p$pgo.fmf ()I
      // 25: istore 4
      // 27: new mew
      // 2a: dup
      // 2b: aload 0
      // 2c: getfield s9p.cgs Lmew;
      // 2f: invokevirtual mew.getX ()I
      // 32: iload 4
      // 34: aload 0
      // 35: getfield s9p.cgs Lmew;
      // 38: invokevirtual mew.getZ ()I
      // 3b: invokespecial mew.<init> (III)V
      // 3e: astore 5
      // 40: aload 5
      // 42: aload 3
      // 43: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 46: iload 1
      // 47: ifeq 74
      // 4a: ifne 81
      // 4d: goto 54
      // 50: invokestatic s9p.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: iload 1
      // 56: ifeq 78
      // 59: goto 60
      // 5c: invokestatic s9p.a (Loov;)Loov;
      // 5f: athrow
      // 60: iload 4
      // 62: aload 0
      // 63: getfield s9p.cgs Lmew;
      // 66: invokevirtual mew.getY ()I
      // 69: isub
      // 6a: invokevirtual s9p.ktv (I)Z
      // 6d: goto 74
      // 70: invokestatic s9p.a (Loov;)Loov;
      // 73: athrow
      // 74: ifeq 81
      // 77: aload 0
      // 78: aload 5
      // 7a: aload 3
      // 7b: getstatic ox_.uom Le0x;
      // 7e: invokevirtual s9p.gi3 (Lmew;Lmew;Le0x;)V
      // 81: iload 1
      // 82: ifne 0e
      // 85: return
   }

   public int _w0(mew param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: aload 1
      // 02: invokevirtual mew.getX ()I
      // 05: ineg
      // 06: aload 1
      // 07: invokevirtual mew.getY ()I
      // 0a: ineg
      // 0b: aload 1
      // 0c: invokevirtual mew.getZ ()I
      // 0f: ineg
      // 10: invokevirtual mew.ec4 (III)Lmew;
      // 13: astore 4
      // 15: invokestatic OpaquePredicate.b ()I
      // 18: aload 0
      // 19: aload 4
      // 1b: invokespecial s9p.d6d (Lmew;)I
      // 1e: istore 5
      // 20: istore 3
      // 21: aload 4
      // 23: invokevirtual mew.getX ()I
      // 26: i2f
      // 27: iload 5
      // 29: i2f
      // 2a: fdiv
      // 2b: fstore 6
      // 2d: aload 4
      // 2f: invokevirtual mew.getY ()I
      // 32: i2f
      // 33: iload 5
      // 35: i2f
      // 36: fdiv
      // 37: fstore 7
      // 39: aload 4
      // 3b: invokevirtual mew.getZ ()I
      // 3e: i2f
      // 3f: iload 5
      // 41: i2f
      // 42: fdiv
      // 43: fstore 8
      // 45: iload 5
      // 47: iload 3
      // 48: ifeq 5c
      // 4b: ifne 5b
      // 4e: goto 55
      // 51: invokestatic s9p.a (Loov;)Loov;
      // 54: athrow
      // 55: bipush -1
      // 56: ireturn
      // 57: invokestatic s9p.a (Loov;)Loov;
      // 5a: athrow
      // 5b: bipush 0
      // 5c: istore 9
      // 5e: iload 9
      // 60: iload 5
      // 62: if_icmpgt c5
      // 65: aload 1
      // 66: ldc 0.5
      // 68: nop
      // 69: iload 9
      // 6b: i2f
      // 6c: fload 6
      // 6e: fmul
      // 6f: fadd
      // 70: f2d
      // 71: ldc 0.5
      // 73: nop
      // 74: iload 9
      // 76: i2f
      // 77: fload 7
      // 79: fmul
      // 7a: fadd
      // 7b: f2d
      // 7c: ldc 0.5
      // 7e: nop
      // 7f: iload 9
      // 81: i2f
      // 82: fload 8
      // 84: fmul
      // 85: fadd
      // 86: f2d
      // 87: invokevirtual mew.f_0 (DDD)Lmew;
      // 8a: astore 10
      // 8c: iload 3
      // 8d: ifeq c1
      // 90: aload 0
      // 91: aload 0
      // 92: getfield s9p.p5t Lt9d;
      // 95: aload 10
      // 97: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 9a: invokeinterface zfz.r_y ()Le0x; 1
      // 9f: invokevirtual s9p.mgy (Le0x;)Z
      // a2: iload 3
      // a3: ifeq c6
      // a6: goto ad
      // a9: invokestatic s9p.a (Loov;)Loov;
      // ac: athrow
      // ad: ifne be
      // b0: goto b7
      // b3: invokestatic s9p.a (Loov;)Loov;
      // b6: athrow
      // b7: iload 9
      // b9: ireturn
      // ba: invokestatic s9p.a (Loov;)Loov;
      // bd: athrow
      // be: iinc 9 1
      // c1: iload 3
      // c2: ifne 5e
      // c5: bipush -1
      // c6: ireturn
   }

   @Override
   public void n3m() {
      this.g8p = 5;
   }

   @Override
   public boolean v3g(OpaquePredicate param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: putfield s9p.p5t Lt9d;
      // 05: aload 0
      // 06: aload 3
      // 07: putfield s9p.cgs Lmew;
      // 0a: invokestatic OpaquePredicate.b ()I
      // 0d: aload 0
      // 0e: new java/util/Random
      // 11: dup
      // 12: aload 2
      // 13: invokevirtual java/util/Random.nextLong ()J
      // 16: invokespecial java/util/Random.<init> (J)V
      // 19: putfield s9p.l5h Ljava/util/Random;
      // 1c: istore 4
      // 1e: aload 0
      // 1f: getfield s9p._jw I
      // 22: iload 4
      // 24: ifeq 4d
      // 27: ifne 49
      // 2a: goto 31
      // 2d: invokestatic s9p.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: bipush 5
      // 33: aload 0
      // 34: getfield s9p.l5h Ljava/util/Random;
      // 37: aload 0
      // 38: getfield s9p.dqi I
      // 3b: invokevirtual java/util/Random.nextInt (I)I
      // 3e: iadd
      // 3f: putfield s9p._jw I
      // 42: goto 49
      // 45: invokestatic s9p.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: invokespecial s9p.h1x ()Z
      // 4d: iload 4
      // 4f: ifeq 73
      // 52: ifne 62
      // 55: goto 5c
      // 58: invokestatic s9p.a (Loov;)Loov;
      // 5b: athrow
      // 5c: bipush 0
      // 5d: ireturn
      // 5e: invokestatic s9p.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 0
      // 63: invokevirtual s9p.igf ()V
      // 66: aload 0
      // 67: invokevirtual s9p.j3e ()V
      // 6a: aload 0
      // 6b: invokevirtual s9p.cx9 ()V
      // 6e: aload 0
      // 6f: invokevirtual s9p.lbq ()V
      // 72: bipush 1
      // 73: ireturn
   }

   private boolean h1x() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield s9p.p5t Lt9d;
      // 08: aload 0
      // 09: getfield s9p.cgs Lmew;
      // 0c: invokevirtual mew.eve ()Lmew;
      // 0f: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 12: invokeinterface zfz.r_y ()Le0x; 1
      // 17: astore 2
      // 18: aload 2
      // 19: iload 1
      // 1a: ifeq 32
      // 1d: getstatic ox_.kqk Le0x;
      // 20: if_acmpeq 57
      // 23: goto 2a
      // 26: invokestatic s9p.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 2
      // 2b: goto 32
      // 2e: invokestatic s9p.a (Loov;)Loov;
      // 31: athrow
      // 32: getstatic ox_.l11 Lx82;
      // 35: iload 1
      // 36: ifeq 4e
      // 39: if_acmpeq 57
      // 3c: goto 43
      // 3f: invokestatic s9p.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 2
      // 44: getstatic ox_._5i Le0x;
      // 47: goto 4e
      // 4a: invokestatic s9p.a (Loov;)Loov;
      // 4d: athrow
      // 4e: if_acmpeq 57
      // 51: bipush 0
      // 52: ireturn
      // 53: invokestatic s9p.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 0
      // 58: aload 0
      // 59: getfield s9p.cgs Lmew;
      // 5c: aload 0
      // 5d: getfield s9p.cgs Lmew;
      // 60: aload 0
      // 61: getfield s9p._jw I
      // 64: bipush 1
      // 65: isub
      // 66: invokevirtual mew.z89 (I)Lmew;
      // 69: invokevirtual s9p._w0 (Lmew;Lmew;)I
      // 6c: istore 3
      // 6d: iload 3
      // 6e: bipush -1
      // 6f: iload 1
      // 70: ifeq 91
      // 73: if_icmpne 83
      // 76: goto 7d
      // 79: invokestatic s9p.a (Loov;)Loov;
      // 7c: athrow
      // 7d: bipush 1
      // 7e: ireturn
      // 7f: invokestatic s9p.a (Loov;)Loov;
      // 82: athrow
      // 83: iload 3
      // 84: iload 1
      // 85: ifeq a0
      // 88: bipush 6
      // 8a: goto 91
      // 8d: invokestatic s9p.a (Loov;)Loov;
      // 90: athrow
      // 91: if_icmpge 9a
      // 94: bipush 0
      // 95: ireturn
      // 96: invokestatic s9p.a (Loov;)Loov;
      // 99: athrow
      // 9a: aload 0
      // 9b: iload 3
      // 9c: putfield s9p._jw I
      // 9f: bipush 1
      // a0: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
