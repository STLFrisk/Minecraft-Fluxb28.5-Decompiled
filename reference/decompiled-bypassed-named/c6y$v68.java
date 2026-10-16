public class c6y$v68 extends flo {
   private int yls = 160;
   private boolean gih;
   private boolean e16;
   private final jux aqh;
   private float k7v;
   private float m3p;
   private float fbc;
   private boolean yzw;

   public c6y$v68(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12, jux var14) {
      super(var1, var2, var4, var6);
      this.icv = var8;
      this.mop = var10;
      this.bw4 = var12;
      this.aqh = var14;
      this.ysq *= 0.75F;
      this.bx4 = 48 + this.z2d.nextInt(12);
      this.kvx = false;
   }

   public void kqe(boolean var1) {
      this.gih = var1;
   }

   public void tvt(boolean var1) {
      this.e16 = var1;
   }

   public void fnk(int var1) {
      float var2 = (float)((var1 & 0xFF0000) >> 16) / 255.0F;
      float var3 = (float)((var1 & 0xFF00) >> 8) / 255.0F;
      float var4 = (float)((var1 & 0xFF) >> 0) / 255.0F;
      float var5 = 1.0F;
      this.mcd(var2 * var5, var3 * var5, var4 * var5);
   }

   public void nll(int var1) {
      this.k7v = (float)((var1 & 0xFF0000) >> 16) / 255.0F;
      this.m3p = (float)((var1 & 0xFF00) >> 8) / 255.0F;
      this.fbc = (float)((var1 & 0xFF) >> 0) / 255.0F;
      this.yzw = true;
   }

   @Override
   public nh4 q3r() {
      return null;
   }

   @Override
   public boolean tfh() {
      return false;
   }

   @Override
   public void oss(q3g param1, EntityLivingBase param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 9
      // 05: aload 0
      // 06: iload 9
      // 08: ifeq 63
      // 0b: getfield c6y$v68.e16 Z
      // 0e: ifeq 5b
      // 11: goto 18
      // 14: invokestatic c6y$v68.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: iload 9
      // 1b: ifeq 63
      // 1e: goto 25
      // 21: invokestatic c6y$v68.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield c6y$v68.goc I
      // 28: aload 0
      // 29: getfield c6y$v68.bx4 I
      // 2c: bipush 3
      // 2d: idiv
      // 2e: if_icmplt 5b
      // 31: goto 38
      // 34: invokestatic c6y$v68.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: iload 9
      // 3b: ifeq 63
      // 3e: goto 45
      // 41: invokestatic c6y$v68.a (Loov;)Loov;
      // 44: athrow
      // 45: getfield c6y$v68.goc I
      // 48: aload 0
      // 49: getfield c6y$v68.bx4 I
      // 4c: iadd
      // 4d: bipush 3
      // 4e: idiv
      // 4f: bipush 2
      // 50: irem
      // 51: ifne 73
      // 54: goto 5b
      // 57: invokestatic c6y$v68.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic c6y$v68.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 1
      // 64: aload 2
      // 65: fload 3
      // 66: fload 4
      // 68: fload 5
      // 6a: fload 6
      // 6c: fload 7
      // 6e: fload 8
      // 70: invokespecial flo.oss (Lq3g;Li2h;FFFFFF)V
      // 73: return
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
      // 000: aload 0
      // 001: aload 0
      // 002: getfield c6y$v68.o2v D
      // 005: putfield c6y$v68.bc1 D
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield c6y$v68.kfp D
      // 010: putfield c6y$v68.o_z D
      // 013: istore 1
      // 014: aload 0
      // 015: aload 0
      // 016: getfield c6y$v68.vbd D
      // 019: putfield c6y$v68.a4d D
      // 01c: aload 0
      // 01d: dup
      // 01e: getfield c6y$v68.goc I
      // 021: dup_x1
      // 022: bipush 1
      // 023: iadd
      // 024: putfield c6y$v68.goc I
      // 027: aload 0
      // 028: getfield c6y$v68.bx4 I
      // 02b: iload 1
      // 02c: ifeq 059
      // 02f: if_icmplt 044
      // 032: goto 039
      // 035: invokestatic c6y$v68.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 0
      // 03a: invokevirtual c6y$v68._kl ()V
      // 03d: goto 044
      // 040: invokestatic c6y$v68.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 0
      // 045: getfield c6y$v68.goc I
      // 048: iload 1
      // 049: ifeq 133
      // 04c: aload 0
      // 04d: getfield c6y$v68.bx4 I
      // 050: bipush 2
      // 051: idiv
      // 052: goto 059
      // 055: invokestatic c6y$v68.a (Loov;)Loov;
      // 058: athrow
      // 059: if_icmple 0d7
      // 05c: aload 0
      // 05d: fconst_1
      // 05e: aload 0
      // 05f: getfield c6y$v68.goc I
      // 062: i2f
      // 063: aload 0
      // 064: getfield c6y$v68.bx4 I
      // 067: bipush 2
      // 068: idiv
      // 069: i2f
      // 06a: fsub
      // 06b: aload 0
      // 06c: getfield c6y$v68.bx4 I
      // 06f: i2f
      // 070: fdiv
      // 071: fsub
      // 072: invokevirtual c6y$v68.rc6 (F)V
      // 075: aload 0
      // 076: getfield c6y$v68.yzw Z
      // 079: iload 1
      // 07a: ifeq 133
      // 07d: goto 084
      // 080: invokestatic c6y$v68.a (Loov;)Loov;
      // 083: athrow
      // 084: ifeq 0d7
      // 087: goto 08e
      // 08a: invokestatic c6y$v68.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: dup
      // 090: getfield c6y$v68.aeh F
      // 093: aload 0
      // 094: getfield c6y$v68.k7v F
      // 097: aload 0
      // 098: getfield c6y$v68.aeh F
      // 09b: fsub
      // 09c: ldc 0.2
      // 09e: nop
      // 09f: fmul
      // 0a0: fadd
      // 0a1: putfield c6y$v68.aeh F
      // 0a4: aload 0
      // 0a5: dup
      // 0a6: getfield c6y$v68.li4 F
      // 0a9: aload 0
      // 0aa: getfield c6y$v68.m3p F
      // 0ad: aload 0
      // 0ae: getfield c6y$v68.li4 F
      // 0b1: fsub
      // 0b2: ldc 0.2
      // 0b4: nop
      // 0b5: fmul
      // 0b6: fadd
      // 0b7: putfield c6y$v68.li4 F
      // 0ba: aload 0
      // 0bb: dup
      // 0bc: getfield c6y$v68.v5a F
      // 0bf: aload 0
      // 0c0: getfield c6y$v68.fbc F
      // 0c3: aload 0
      // 0c4: getfield c6y$v68.v5a F
      // 0c7: fsub
      // 0c8: ldc 0.2
      // 0ca: nop
      // 0cb: fmul
      // 0cc: fadd
      // 0cd: putfield c6y$v68.v5a F
      // 0d0: goto 0d7
      // 0d3: invokestatic c6y$v68.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: aload 0
      // 0d9: getfield c6y$v68.yls I
      // 0dc: bipush 7
      // 0de: aload 0
      // 0df: getfield c6y$v68.goc I
      // 0e2: bipush 8
      // 0e4: imul
      // 0e5: aload 0
      // 0e6: getfield c6y$v68.bx4 I
      // 0e9: idiv
      // 0ea: isub
      // 0eb: iadd
      // 0ec: invokevirtual c6y$v68.f0l (I)V
      // 0ef: aload 0
      // 0f0: dup
      // 0f1: getfield c6y$v68.mop D
      // 0f4: ldc2_w 0.004
      // 0f7: dsub
      // 0f8: putfield c6y$v68.mop D
      // 0fb: aload 0
      // 0fc: aload 0
      // 0fd: getfield c6y$v68.icv D
      // 100: aload 0
      // 101: getfield c6y$v68.mop D
      // 104: aload 0
      // 105: getfield c6y$v68.bw4 D
      // 108: invokevirtual c6y$v68.vjj (DDD)V
      // 10b: aload 0
      // 10c: dup
      // 10d: getfield c6y$v68.icv D
      // 110: ldc2_w 0.9100000262260437
      // 113: dmul
      // 114: putfield c6y$v68.icv D
      // 117: aload 0
      // 118: dup
      // 119: getfield c6y$v68.mop D
      // 11c: ldc2_w 0.9100000262260437
      // 11f: dmul
      // 120: putfield c6y$v68.mop D
      // 123: aload 0
      // 124: dup
      // 125: getfield c6y$v68.bw4 D
      // 128: ldc2_w 0.9100000262260437
      // 12b: dmul
      // 12c: putfield c6y$v68.bw4 D
      // 12f: aload 0
      // 130: getfield c6y$v68.lfk Z
      // 133: iload 1
      // 134: ifeq 164
      // 137: ifeq 160
      // 13a: goto 141
      // 13d: invokestatic c6y$v68.a (Loov;)Loov;
      // 140: athrow
      // 141: aload 0
      // 142: dup
      // 143: getfield c6y$v68.icv D
      // 146: ldc2_w 0.699999988079071
      // 149: dmul
      // 14a: putfield c6y$v68.icv D
      // 14d: aload 0
      // 14e: dup
      // 14f: getfield c6y$v68.bw4 D
      // 152: ldc2_w 0.699999988079071
      // 155: dmul
      // 156: putfield c6y$v68.bw4 D
      // 159: goto 160
      // 15c: invokestatic c6y$v68.a (Loov;)Loov;
      // 15f: athrow
      // 160: aload 0
      // 161: getfield c6y$v68.gih Z
      // 164: iload 1
      // 165: ifeq 17d
      // 168: ifeq 23e
      // 16b: goto 172
      // 16e: invokestatic c6y$v68.a (Loov;)Loov;
      // 171: athrow
      // 172: aload 0
      // 173: getfield c6y$v68.goc I
      // 176: goto 17d
      // 179: invokestatic c6y$v68.a (Loov;)Loov;
      // 17c: athrow
      // 17d: aload 0
      // 17e: getfield c6y$v68.bx4 I
      // 181: bipush 2
      // 182: idiv
      // 183: iload 1
      // 184: ifeq 1ad
      // 187: if_icmpge 23e
      // 18a: goto 191
      // 18d: invokestatic c6y$v68.a (Loov;)Loov;
      // 190: athrow
      // 191: aload 0
      // 192: iload 1
      // 193: ifeq 1d6
      // 196: goto 19d
      // 199: invokestatic c6y$v68.a (Loov;)Loov;
      // 19c: athrow
      // 19d: getfield c6y$v68.goc I
      // 1a0: aload 0
      // 1a1: getfield c6y$v68.bx4 I
      // 1a4: iadd
      // 1a5: bipush 2
      // 1a6: goto 1ad
      // 1a9: invokestatic c6y$v68.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: irem
      // 1ae: ifne 23e
      // 1b1: new c6y$v68
      // 1b4: dup
      // 1b5: aload 0
      // 1b6: getfield c6y$v68.oay Lt9d;
      // 1b9: aload 0
      // 1ba: getfield c6y$v68.o2v D
      // 1bd: aload 0
      // 1be: getfield c6y$v68.kfp D
      // 1c1: aload 0
      // 1c2: getfield c6y$v68.vbd D
      // 1c5: dconst_0
      // 1c6: dconst_0
      // 1c7: dconst_0
      // 1c8: aload 0
      // 1c9: getfield c6y$v68.aqh Ljux;
      // 1cc: invokespecial c6y$v68.<init> (Lt9d;DDDDDDLjux;)V
      // 1cf: goto 1d6
      // 1d2: invokestatic c6y$v68.a (Loov;)Loov;
      // 1d5: athrow
      // 1d6: astore 2
      // 1d7: aload 2
      // 1d8: ldc 0.99
      // 1da: nop
      // 1db: invokevirtual c6y$v68.rc6 (F)V
      // 1de: aload 2
      // 1df: aload 0
      // 1e0: getfield c6y$v68.aeh F
      // 1e3: aload 0
      // 1e4: getfield c6y$v68.li4 F
      // 1e7: aload 0
      // 1e8: getfield c6y$v68.v5a F
      // 1eb: invokevirtual c6y$v68.mcd (FFF)V
      // 1ee: aload 2
      // 1ef: aload 2
      // 1f0: getfield c6y$v68.bx4 I
      // 1f3: bipush 2
      // 1f4: idiv
      // 1f5: putfield c6y$v68.goc I
      // 1f8: aload 0
      // 1f9: iload 1
      // 1fa: ifeq 237
      // 1fd: getfield c6y$v68.yzw Z
      // 200: ifeq 22e
      // 203: goto 20a
      // 206: invokestatic c6y$v68.a (Loov;)Loov;
      // 209: athrow
      // 20a: aload 2
      // 20b: bipush 1
      // 20c: putfield c6y$v68.yzw Z
      // 20f: aload 2
      // 210: aload 0
      // 211: getfield c6y$v68.k7v F
      // 214: putfield c6y$v68.k7v F
      // 217: aload 2
      // 218: aload 0
      // 219: getfield c6y$v68.m3p F
      // 21c: putfield c6y$v68.m3p F
      // 21f: aload 2
      // 220: aload 0
      // 221: getfield c6y$v68.fbc F
      // 224: putfield c6y$v68.fbc F
      // 227: goto 22e
      // 22a: invokestatic c6y$v68.a (Loov;)Loov;
      // 22d: athrow
      // 22e: aload 2
      // 22f: aload 0
      // 230: getfield c6y$v68.e16 Z
      // 233: putfield c6y$v68.e16 Z
      // 236: aload 0
      // 237: getfield c6y$v68.aqh Ljux;
      // 23a: aload 2
      // 23b: invokevirtual jux.o4t (Lflo;)V
      // 23e: return
   }

   @Override
   public int azk(float var1) {
      return 15728880;
   }

   @Override
   public float xeu(float var1) {
      return 1.0F;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
