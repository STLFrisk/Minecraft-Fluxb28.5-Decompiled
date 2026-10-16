public abstract class ed7 {
   public final Minecraft gk_;
   public int wde;
   public int io9;
   public int vem;
   public int chj;
   public int som;
   public int ytt;
   public final int qc1;
   public int bgb;
   public int sng;
   public boolean n05 = true;
   public int n26 = -2;
   public float lej;
   public float fx8;
   public int qzy = -1;
   public long kjk;
   public boolean s4g = true;
   public boolean zy6 = true;
   public boolean bc8;
   public int vrd;
   public boolean cwa = false;
   public int r3k = 0;
   public int puh = 0;

   public ed7(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      this.gk_ = var1;
      this.wde = var2;
      this.io9 = var3;
      this.vem = var4;
      this.chj = var5;
      this.qc1 = var6;
      this.ytt = 0;
      this.som = var2;
   }

   public void scs(int var1, int var2, int var3, int var4) {
      this.wde = var1;
      this.io9 = var2;
      this.vem = var3;
      this.chj = var4;
      this.ytt = 0;
      this.som = var1;
   }

   public void fai(boolean var1) {
      this.zy6 = var1;
   }

   public void lfu(boolean param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: putfield ed7.bc8 Z
      // 09: aload 0
      // 0a: iload 2
      // 0b: iload 3
      // 0c: ifeq 26
      // 0f: putfield ed7.vrd I
      // 12: iload 1
      // 13: ifne 29
      // 16: goto 1d
      // 19: invokestatic ed7.b (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: bipush 0
      // 1f: goto 26
      // 22: invokestatic ed7.b (Loov;)Loov;
      // 25: athrow
      // 26: putfield ed7.vrd I
      // 29: return
   }

   public abstract int getSize();

   public abstract void elementClicked(int var1, boolean var2, int var3, int var4);

   public abstract boolean isSelected(int var1);

   public int getContentHeight() {
      return this.getSize() * this.qc1 + this.vrd;
   }

   public abstract void drawBackground();

   public void dm2(int var1, int var2, int var3) {
   }

   public abstract void drawSlot(int var1, int var2, int var3, int var4, int var5, int var6);

   public void xwh(int var1, int var2, jom var3) {
   }

   public void n_7(int var1, int var2) {
   }

   public void fbo(int var1, int var2) {
   }

   public int dwe(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield ed7.ytt I
      // 04: aload 0
      // 05: getfield ed7.wde I
      // 08: bipush 2
      // 09: idiv
      // 0a: iadd
      // 0b: aload 0
      // 0c: invokevirtual ed7.getListWidth ()I
      // 0f: bipush 2
      // 10: idiv
      // 11: isub
      // 12: istore 4
      // 14: invokestatic OpaquePredicate.b ()I
      // 17: aload 0
      // 18: getfield ed7.ytt I
      // 1b: aload 0
      // 1c: getfield ed7.wde I
      // 1f: bipush 2
      // 20: idiv
      // 21: iadd
      // 22: aload 0
      // 23: invokevirtual ed7.getListWidth ()I
      // 26: bipush 2
      // 27: idiv
      // 28: iadd
      // 29: istore 5
      // 2b: istore 3
      // 2c: iload 2
      // 2d: aload 0
      // 2e: getfield ed7.vem I
      // 31: isub
      // 32: aload 0
      // 33: getfield ed7.vrd I
      // 36: isub
      // 37: aload 0
      // 38: getfield ed7.fx8 F
      // 3b: f2i
      // 3c: iadd
      // 3d: bipush 4
      // 3e: isub
      // 3f: istore 6
      // 41: iload 6
      // 43: aload 0
      // 44: getfield ed7.qc1 I
      // 47: idiv
      // 48: istore 7
      // 4a: iload 1
      // 4b: aload 0
      // 4c: invokevirtual ed7.getScrollBarX ()I
      // 4f: iload 3
      // 50: ifeq 67
      // 53: if_icmpge cd
      // 56: goto 5d
      // 59: invokestatic ed7.b (Loov;)Loov;
      // 5c: athrow
      // 5d: iload 1
      // 5e: iload 4
      // 60: goto 67
      // 63: invokestatic ed7.b (Loov;)Loov;
      // 66: athrow
      // 67: iload 3
      // 68: ifeq 8a
      // 6b: if_icmplt cd
      // 6e: goto 75
      // 71: invokestatic ed7.b (Loov;)Loov;
      // 74: athrow
      // 75: iload 1
      // 76: iload 3
      // 77: ifeq 8f
      // 7a: goto 81
      // 7d: invokestatic ed7.b (Loov;)Loov;
      // 80: athrow
      // 81: iload 5
      // 83: goto 8a
      // 86: invokestatic ed7.b (Loov;)Loov;
      // 89: athrow
      // 8a: if_icmpgt cd
      // 8d: iload 7
      // 8f: iload 3
      // 90: ifeq 9f
      // 93: iflt cd
      // 96: goto 9d
      // 99: invokestatic ed7.b (Loov;)Loov;
      // 9c: athrow
      // 9d: iload 6
      // 9f: iload 3
      // a0: ifeq af
      // a3: iflt cd
      // a6: goto ad
      // a9: invokestatic ed7.b (Loov;)Loov;
      // ac: athrow
      // ad: iload 7
      // af: iload 3
      // b0: ifeq ca
      // b3: aload 0
      // b4: invokevirtual ed7.getSize ()I
      // b7: if_icmpge cd
      // ba: goto c1
      // bd: invokestatic ed7.b (Loov;)Loov;
      // c0: athrow
      // c1: iload 7
      // c3: goto ca
      // c6: invokestatic ed7.b (Loov;)Loov;
      // c9: athrow
      // ca: goto ce
      // cd: bipush -1
      // ce: ireturn
   }

   public void x9x(int var1, int var2) {
      this.sot = var1;
      this.l8q = var2;
   }

   public void zn9() {
      this.fx8 = fe6._f3(this.fx8, 0.0F, (float)this.w1w());
   }

   public int w1w() {
      return Math.max(0, this.getContentHeight() - (this.chj - this.vem - 4));
   }

   public int hc1() {
      return (int)this.fx8;
   }

   public boolean gti(int param1) {
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
      // 05: aload 0
      // 06: getfield ed7.vem I
      // 09: iload 2
      // 0a: ifne 23
      // 0d: if_icmplt 6f
      // 10: goto 17
      // 13: invokestatic ed7.b (Loov;)Loov;
      // 16: athrow
      // 17: iload 1
      // 18: aload 0
      // 19: getfield ed7.chj I
      // 1c: goto 23
      // 1f: invokestatic ed7.b (Loov;)Loov;
      // 22: athrow
      // 23: iload 2
      // 24: ifne 40
      // 27: if_icmpgt 6f
      // 2a: goto 31
      // 2d: invokestatic ed7.b (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: getfield ed7.bgb I
      // 35: aload 0
      // 36: getfield ed7.ytt I
      // 39: goto 40
      // 3c: invokestatic ed7.b (Loov;)Loov;
      // 3f: athrow
      // 40: iload 2
      // 41: ifne 68
      // 44: if_icmplt 6f
      // 47: goto 4e
      // 4a: invokestatic ed7.b (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield ed7.bgb I
      // 52: iload 2
      // 53: ifne 6c
      // 56: goto 5d
      // 59: invokestatic ed7.b (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield ed7.som I
      // 61: goto 68
      // 64: invokestatic ed7.b (Loov;)Loov;
      // 67: athrow
      // 68: if_icmpgt 6f
      // 6b: bipush 1
      // 6c: goto 70
      // 6f: bipush 0
      // 70: ireturn
   }

   public void pg1(int var1) {
      this.fx8 += (float)var1;
      this.zn9();
      this.n26 = -2;
   }

   public void ncl(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4.c9a Z
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifeq 8f
      // 0f: goto 16
      // 12: invokestatic ed7.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic ed7.b (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield ed7.sot I
      // 25: iload 2
      // 26: ifne 69
      // 29: if_icmpne 5a
      // 2c: goto 33
      // 2f: invokestatic ed7.b (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: dup
      // 35: getfield ed7.fx8 F
      // 38: aload 0
      // 39: getfield ed7.qc1 I
      // 3c: bipush 2
      // 3d: imul
      // 3e: bipush 3
      // 3f: idiv
      // 40: i2f
      // 41: fsub
      // 42: putfield ed7.fx8 F
      // 45: aload 0
      // 46: bipush -2
      // 48: putfield ed7.n26 I
      // 4b: aload 0
      // 4c: invokevirtual ed7.zn9 ()V
      // 4f: iload 2
      // 50: ifeq 8f
      // 53: goto 5a
      // 56: invokestatic ed7.b (Loov;)Loov;
      // 59: athrow
      // 5a: aload 1
      // 5b: getfield gt4._me I
      // 5e: aload 0
      // 5f: getfield ed7.l8q I
      // 62: goto 69
      // 65: invokestatic ed7.b (Loov;)Loov;
      // 68: athrow
      // 69: if_icmpne 8f
      // 6c: aload 0
      // 6d: dup
      // 6e: getfield ed7.fx8 F
      // 71: aload 0
      // 72: getfield ed7.qc1 I
      // 75: bipush 2
      // 76: imul
      // 77: bipush 3
      // 78: idiv
      // 79: i2f
      // 7a: fadd
      // 7b: putfield ed7.fx8 F
      // 7e: aload 0
      // 7f: bipush -2
      // 81: putfield ed7.n26 I
      // 84: aload 0
      // 85: invokevirtual ed7.zn9 ()V
      // 88: goto 8f
      // 8b: invokestatic ed7.b (Loov;)Loov;
      // 8e: athrow
      // 8f: return
   }

   public void j46(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield ed7.s4g Z
      // 009: iload 4
      // 00b: ifeq 023
      // 00e: ifeq b09
      // 011: goto 018
      // 014: invokestatic ed7.b (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: getfield ed7.cwa Z
      // 01c: goto 023
      // 01f: invokestatic ed7.b (Loov;)Loov;
      // 022: athrow
      // 023: iload 4
      // 025: ifeq 5b6
      // 028: ifeq 5a4
      // 02b: goto 032
      // 02e: invokestatic ed7.b (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: iload 1
      // 034: putfield ed7.bgb I
      // 037: aload 0
      // 038: iload 2
      // 039: putfield ed7.sng I
      // 03c: aload 0
      // 03d: invokevirtual ed7.drawBackground ()V
      // 040: aload 0
      // 041: invokevirtual ed7.getScrollBarX ()I
      // 044: istore 5
      // 046: iload 5
      // 048: bipush 6
      // 04a: iadd
      // 04b: istore 6
      // 04d: aload 0
      // 04e: invokevirtual ed7.zn9 ()V
      // 051: invokestatic jom.yut ()Ljom;
      // 054: astore 7
      // 056: aload 7
      // 058: invokevirtual jom.zuq ()Lq3g;
      // 05b: astore 8
      // 05d: invokestatic hzu.spd ()V
      // 060: invokestatic hzu.vtj ()V
      // 063: invokestatic hzu.m_1 ()V
      // 066: bipush 5
      // 067: istore 9
      // 069: aload 0
      // 06a: getfield ed7.ytt I
      // 06d: aload 0
      // 06e: getfield ed7.wde I
      // 071: bipush 2
      // 072: idiv
      // 073: sipush 305
      // 076: iload 9
      // 078: iadd
      // 079: bipush 2
      // 07a: idiv
      // 07b: isub
      // 07c: iadd
      // 07d: aload 0
      // 07e: getfield ed7.r3k I
      // 081: iadd
      // 082: istore 10
      // 084: aload 0
      // 085: getfield ed7.ytt I
      // 088: aload 0
      // 089: getfield ed7.wde I
      // 08c: bipush 2
      // 08d: idiv
      // 08e: iadd
      // 08f: sipush 305
      // 092: iload 9
      // 094: iadd
      // 095: bipush 2
      // 096: idiv
      // 097: iadd
      // 098: aload 0
      // 099: getfield ed7.puh I
      // 09c: iadd
      // 09d: istore 11
      // 09f: aload 8
      // 0a1: bipush 7
      // 0a3: getstatic gnl.rad Lbe7;
      // 0a6: invokevirtual q3g.ezr (ILbe7;)V
      // 0a9: aload 8
      // 0ab: iload 10
      // 0ad: i2d
      // 0ae: aload 0
      // 0af: getfield ed7.chj I
      // 0b2: i2d
      // 0b3: dconst_0
      // 0b4: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0b7: dconst_0
      // 0b8: dconst_1
      // 0b9: invokevirtual q3g.h0a (DD)Lq3g;
      // 0bc: bipush 0
      // 0bd: bipush 0
      // 0be: bipush 0
      // 0bf: bipush 120
      // 0c1: invokevirtual q3g.fje (IIII)Lq3g;
      // 0c4: invokevirtual q3g.pzw ()V
      // 0c7: aload 8
      // 0c9: iload 11
      // 0cb: i2d
      // 0cc: aload 0
      // 0cd: getfield ed7.chj I
      // 0d0: i2d
      // 0d1: dconst_0
      // 0d2: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0d5: dconst_1
      // 0d6: dconst_1
      // 0d7: invokevirtual q3g.h0a (DD)Lq3g;
      // 0da: bipush 0
      // 0db: bipush 0
      // 0dc: bipush 0
      // 0dd: bipush 120
      // 0df: invokevirtual q3g.fje (IIII)Lq3g;
      // 0e2: invokevirtual q3g.pzw ()V
      // 0e5: aload 8
      // 0e7: iload 11
      // 0e9: i2d
      // 0ea: aload 0
      // 0eb: getfield ed7.vem I
      // 0ee: i2d
      // 0ef: dconst_0
      // 0f0: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0f3: dconst_1
      // 0f4: dconst_0
      // 0f5: invokevirtual q3g.h0a (DD)Lq3g;
      // 0f8: bipush 0
      // 0f9: bipush 0
      // 0fa: bipush 0
      // 0fb: bipush 120
      // 0fd: invokevirtual q3g.fje (IIII)Lq3g;
      // 100: invokevirtual q3g.pzw ()V
      // 103: aload 8
      // 105: iload 10
      // 107: i2d
      // 108: aload 0
      // 109: getfield ed7.vem I
      // 10c: i2d
      // 10d: dconst_0
      // 10e: invokevirtual q3g.g5o (DDD)Lq3g;
      // 111: dconst_0
      // 112: dconst_0
      // 113: invokevirtual q3g.h0a (DD)Lq3g;
      // 116: bipush 0
      // 117: bipush 0
      // 118: bipush 0
      // 119: bipush 120
      // 11b: invokevirtual q3g.fje (IIII)Lq3g;
      // 11e: invokevirtual q3g.pzw ()V
      // 121: aload 7
      // 123: invokevirtual jom.q7g ()V
      // 126: invokestatic hzu.rqj ()V
      // 129: invokestatic hzu.if9 ()V
      // 12c: invokestatic hzu.ux6 ()V
      // 12f: aload 0
      // 130: getfield ed7.ytt I
      // 133: aload 0
      // 134: getfield ed7.wde I
      // 137: bipush 2
      // 138: idiv
      // 139: iadd
      // 13a: aload 0
      // 13b: invokevirtual ed7.getListWidth ()I
      // 13e: bipush 2
      // 13f: idiv
      // 140: isub
      // 141: bipush 2
      // 142: iadd
      // 143: istore 12
      // 145: aload 0
      // 146: getfield ed7.vem I
      // 149: bipush 4
      // 14a: iadd
      // 14b: aload 0
      // 14c: getfield ed7.fx8 F
      // 14f: f2i
      // 150: isub
      // 151: istore 13
      // 153: aload 0
      // 154: getfield ed7.bc8 Z
      // 157: iload 4
      // 159: ifeq 185
      // 15c: ifeq 177
      // 15f: goto 166
      // 162: invokestatic ed7.b (Loov;)Loov;
      // 165: athrow
      // 166: aload 0
      // 167: iload 12
      // 169: iload 13
      // 16b: aload 7
      // 16d: invokevirtual ed7.xwh (IILjom;)V
      // 170: goto 177
      // 173: invokestatic ed7.b (Loov;)Loov;
      // 176: athrow
      // 177: aload 0
      // 178: iload 12
      // 17a: iload 13
      // 17c: iload 1
      // 17d: iload 2
      // 17e: invokevirtual ed7.ycp (IIII)V
      // 181: invokestatic hzu._o4 ()V
      // 184: bipush 1
      // 185: istore 14
      // 187: aload 0
      // 188: bipush 0
      // 189: aload 0
      // 18a: getfield ed7.vem I
      // 18d: sipush 255
      // 190: sipush 255
      // 193: invokevirtual ed7.ukt (IIII)V
      // 196: aload 0
      // 197: aload 0
      // 198: getfield ed7.chj I
      // 19b: aload 0
      // 19c: getfield ed7.io9 I
      // 19f: sipush 255
      // 1a2: sipush 255
      // 1a5: invokevirtual ed7.ukt (IIII)V
      // 1a8: invokestatic hzu.spd ()V
      // 1ab: sipush 770
      // 1ae: sipush 771
      // 1b1: bipush 0
      // 1b2: bipush 1
      // 1b3: invokestatic hzu.u39 (IIII)V
      // 1b6: invokestatic hzu.vtj ()V
      // 1b9: sipush 7425
      // 1bc: invokestatic hzu.nn9 (I)V
      // 1bf: invokestatic hzu.m_1 ()V
      // 1c2: aload 8
      // 1c4: bipush 7
      // 1c6: getstatic gnl.rad Lbe7;
      // 1c9: invokevirtual q3g.ezr (ILbe7;)V
      // 1cc: aload 8
      // 1ce: aload 0
      // 1cf: getfield ed7.ytt I
      // 1d2: i2d
      // 1d3: aload 0
      // 1d4: getfield ed7.vem I
      // 1d7: iload 14
      // 1d9: iadd
      // 1da: i2d
      // 1db: dconst_0
      // 1dc: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1df: dconst_0
      // 1e0: dconst_1
      // 1e1: invokevirtual q3g.h0a (DD)Lq3g;
      // 1e4: sipush 255
      // 1e7: sipush 255
      // 1ea: sipush 255
      // 1ed: sipush 255
      // 1f0: invokevirtual q3g.fje (IIII)Lq3g;
      // 1f3: invokevirtual q3g.pzw ()V
      // 1f6: aload 8
      // 1f8: aload 0
      // 1f9: getfield ed7.som I
      // 1fc: i2d
      // 1fd: aload 0
      // 1fe: getfield ed7.vem I
      // 201: iload 14
      // 203: iadd
      // 204: i2d
      // 205: dconst_0
      // 206: invokevirtual q3g.g5o (DDD)Lq3g;
      // 209: dconst_1
      // 20a: dconst_1
      // 20b: invokevirtual q3g.h0a (DD)Lq3g;
      // 20e: sipush 255
      // 211: sipush 255
      // 214: sipush 255
      // 217: sipush 255
      // 21a: invokevirtual q3g.fje (IIII)Lq3g;
      // 21d: invokevirtual q3g.pzw ()V
      // 220: aload 8
      // 222: aload 0
      // 223: getfield ed7.som I
      // 226: i2d
      // 227: aload 0
      // 228: getfield ed7.vem I
      // 22b: i2d
      // 22c: dconst_0
      // 22d: invokevirtual q3g.g5o (DDD)Lq3g;
      // 230: dconst_1
      // 231: dconst_0
      // 232: invokevirtual q3g.h0a (DD)Lq3g;
      // 235: sipush 255
      // 238: sipush 255
      // 23b: sipush 255
      // 23e: sipush 255
      // 241: invokevirtual q3g.fje (IIII)Lq3g;
      // 244: invokevirtual q3g.pzw ()V
      // 247: aload 8
      // 249: aload 0
      // 24a: getfield ed7.ytt I
      // 24d: i2d
      // 24e: aload 0
      // 24f: getfield ed7.vem I
      // 252: i2d
      // 253: dconst_0
      // 254: invokevirtual q3g.g5o (DDD)Lq3g;
      // 257: dconst_0
      // 258: dconst_0
      // 259: invokevirtual q3g.h0a (DD)Lq3g;
      // 25c: sipush 255
      // 25f: sipush 255
      // 262: sipush 255
      // 265: sipush 255
      // 268: invokevirtual q3g.fje (IIII)Lq3g;
      // 26b: invokevirtual q3g.pzw ()V
      // 26e: aload 7
      // 270: invokevirtual jom.q7g ()V
      // 273: aload 8
      // 275: bipush 7
      // 277: getstatic gnl.rad Lbe7;
      // 27a: invokevirtual q3g.ezr (ILbe7;)V
      // 27d: aload 8
      // 27f: aload 0
      // 280: getfield ed7.ytt I
      // 283: i2d
      // 284: aload 0
      // 285: getfield ed7.chj I
      // 288: i2d
      // 289: dconst_0
      // 28a: invokevirtual q3g.g5o (DDD)Lq3g;
      // 28d: dconst_0
      // 28e: dconst_1
      // 28f: invokevirtual q3g.h0a (DD)Lq3g;
      // 292: sipush 255
      // 295: sipush 255
      // 298: sipush 255
      // 29b: sipush 255
      // 29e: invokevirtual q3g.fje (IIII)Lq3g;
      // 2a1: invokevirtual q3g.pzw ()V
      // 2a4: aload 8
      // 2a6: aload 0
      // 2a7: getfield ed7.som I
      // 2aa: i2d
      // 2ab: aload 0
      // 2ac: getfield ed7.chj I
      // 2af: i2d
      // 2b0: dconst_0
      // 2b1: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2b4: dconst_1
      // 2b5: dconst_1
      // 2b6: invokevirtual q3g.h0a (DD)Lq3g;
      // 2b9: sipush 255
      // 2bc: sipush 255
      // 2bf: sipush 255
      // 2c2: sipush 255
      // 2c5: invokevirtual q3g.fje (IIII)Lq3g;
      // 2c8: invokevirtual q3g.pzw ()V
      // 2cb: aload 8
      // 2cd: aload 0
      // 2ce: getfield ed7.som I
      // 2d1: i2d
      // 2d2: aload 0
      // 2d3: getfield ed7.chj I
      // 2d6: iload 14
      // 2d8: isub
      // 2d9: i2d
      // 2da: dconst_0
      // 2db: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2de: dconst_1
      // 2df: dconst_0
      // 2e0: invokevirtual q3g.h0a (DD)Lq3g;
      // 2e3: sipush 255
      // 2e6: sipush 255
      // 2e9: sipush 255
      // 2ec: sipush 255
      // 2ef: invokevirtual q3g.fje (IIII)Lq3g;
      // 2f2: invokevirtual q3g.pzw ()V
      // 2f5: aload 8
      // 2f7: aload 0
      // 2f8: getfield ed7.ytt I
      // 2fb: i2d
      // 2fc: aload 0
      // 2fd: getfield ed7.chj I
      // 300: iload 14
      // 302: isub
      // 303: i2d
      // 304: dconst_0
      // 305: invokevirtual q3g.g5o (DDD)Lq3g;
      // 308: dconst_0
      // 309: dconst_0
      // 30a: invokevirtual q3g.h0a (DD)Lq3g;
      // 30d: sipush 255
      // 310: sipush 255
      // 313: sipush 255
      // 316: sipush 255
      // 319: invokevirtual q3g.fje (IIII)Lq3g;
      // 31c: invokevirtual q3g.pzw ()V
      // 31f: aload 7
      // 321: invokevirtual jom.q7g ()V
      // 324: aload 0
      // 325: invokevirtual ed7.w1w ()I
      // 328: istore 15
      // 32a: iload 15
      // 32c: iload 4
      // 32e: ifeq 59a
      // 331: ifle 58e
      // 334: goto 33b
      // 337: invokestatic ed7.b (Loov;)Loov;
      // 33a: athrow
      // 33b: aload 0
      // 33c: getfield ed7.chj I
      // 33f: aload 0
      // 340: getfield ed7.vem I
      // 343: isub
      // 344: aload 0
      // 345: getfield ed7.chj I
      // 348: aload 0
      // 349: getfield ed7.vem I
      // 34c: isub
      // 34d: imul
      // 34e: aload 0
      // 34f: invokevirtual ed7.getContentHeight ()I
      // 352: idiv
      // 353: istore 16
      // 355: iload 16
      // 357: bipush 32
      // 359: aload 0
      // 35a: getfield ed7.chj I
      // 35d: aload 0
      // 35e: getfield ed7.vem I
      // 361: isub
      // 362: bipush 8
      // 364: isub
      // 365: invokestatic fe6.faa (III)I
      // 368: istore 16
      // 36a: aload 0
      // 36b: getfield ed7.fx8 F
      // 36e: f2i
      // 36f: aload 0
      // 370: getfield ed7.chj I
      // 373: aload 0
      // 374: getfield ed7.vem I
      // 377: isub
      // 378: iload 16
      // 37a: isub
      // 37b: imul
      // 37c: iload 15
      // 37e: idiv
      // 37f: aload 0
      // 380: getfield ed7.vem I
      // 383: iadd
      // 384: istore 17
      // 386: iload 4
      // 388: ifeq 589
      // 38b: iload 17
      // 38d: aload 0
      // 38e: getfield ed7.vem I
      // 391: if_icmpge 3a1
      // 394: goto 39b
      // 397: invokestatic ed7.b (Loov;)Loov;
      // 39a: athrow
      // 39b: aload 0
      // 39c: getfield ed7.vem I
      // 39f: istore 17
      // 3a1: aload 8
      // 3a3: bipush 7
      // 3a5: getstatic gnl.rad Lbe7;
      // 3a8: invokevirtual q3g.ezr (ILbe7;)V
      // 3ab: aload 8
      // 3ad: iload 5
      // 3af: i2d
      // 3b0: aload 0
      // 3b1: getfield ed7.chj I
      // 3b4: i2d
      // 3b5: dconst_1
      // 3b6: dsub
      // 3b7: dconst_0
      // 3b8: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3bb: dconst_0
      // 3bc: dconst_1
      // 3bd: invokevirtual q3g.h0a (DD)Lq3g;
      // 3c0: bipush 0
      // 3c1: bipush 0
      // 3c2: bipush 0
      // 3c3: sipush 255
      // 3c6: invokevirtual q3g.fje (IIII)Lq3g;
      // 3c9: invokevirtual q3g.pzw ()V
      // 3cc: aload 8
      // 3ce: iload 6
      // 3d0: i2d
      // 3d1: aload 0
      // 3d2: getfield ed7.chj I
      // 3d5: i2d
      // 3d6: dconst_1
      // 3d7: dsub
      // 3d8: dconst_0
      // 3d9: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3dc: dconst_1
      // 3dd: dconst_1
      // 3de: invokevirtual q3g.h0a (DD)Lq3g;
      // 3e1: bipush 0
      // 3e2: bipush 0
      // 3e3: bipush 0
      // 3e4: sipush 255
      // 3e7: invokevirtual q3g.fje (IIII)Lq3g;
      // 3ea: invokevirtual q3g.pzw ()V
      // 3ed: aload 8
      // 3ef: iload 6
      // 3f1: i2d
      // 3f2: aload 0
      // 3f3: getfield ed7.vem I
      // 3f6: i2d
      // 3f7: dconst_1
      // 3f8: dadd
      // 3f9: dconst_0
      // 3fa: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3fd: dconst_1
      // 3fe: dconst_0
      // 3ff: invokevirtual q3g.h0a (DD)Lq3g;
      // 402: bipush 0
      // 403: bipush 0
      // 404: bipush 0
      // 405: sipush 255
      // 408: invokevirtual q3g.fje (IIII)Lq3g;
      // 40b: invokevirtual q3g.pzw ()V
      // 40e: aload 8
      // 410: iload 5
      // 412: i2d
      // 413: aload 0
      // 414: getfield ed7.vem I
      // 417: i2d
      // 418: dconst_1
      // 419: dadd
      // 41a: dconst_0
      // 41b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 41e: dconst_0
      // 41f: dconst_0
      // 420: invokevirtual q3g.h0a (DD)Lq3g;
      // 423: bipush 0
      // 424: bipush 0
      // 425: bipush 0
      // 426: sipush 255
      // 429: invokevirtual q3g.fje (IIII)Lq3g;
      // 42c: invokevirtual q3g.pzw ()V
      // 42f: aload 7
      // 431: invokevirtual jom.q7g ()V
      // 434: aload 8
      // 436: bipush 7
      // 438: getstatic gnl.rad Lbe7;
      // 43b: invokevirtual q3g.ezr (ILbe7;)V
      // 43e: aload 8
      // 440: iload 5
      // 442: i2d
      // 443: iload 17
      // 445: iload 16
      // 447: iadd
      // 448: bipush 1
      // 449: isub
      // 44a: i2d
      // 44b: dconst_0
      // 44c: invokevirtual q3g.g5o (DDD)Lq3g;
      // 44f: dconst_0
      // 450: dconst_1
      // 451: invokevirtual q3g.h0a (DD)Lq3g;
      // 454: sipush 128
      // 457: sipush 128
      // 45a: sipush 128
      // 45d: sipush 255
      // 460: invokevirtual q3g.fje (IIII)Lq3g;
      // 463: invokevirtual q3g.pzw ()V
      // 466: aload 8
      // 468: iload 6
      // 46a: i2d
      // 46b: iload 17
      // 46d: iload 16
      // 46f: iadd
      // 470: bipush 1
      // 471: isub
      // 472: i2d
      // 473: dconst_0
      // 474: invokevirtual q3g.g5o (DDD)Lq3g;
      // 477: dconst_1
      // 478: dconst_1
      // 479: invokevirtual q3g.h0a (DD)Lq3g;
      // 47c: sipush 128
      // 47f: sipush 128
      // 482: sipush 128
      // 485: sipush 255
      // 488: invokevirtual q3g.fje (IIII)Lq3g;
      // 48b: invokevirtual q3g.pzw ()V
      // 48e: aload 8
      // 490: iload 6
      // 492: i2d
      // 493: iload 17
      // 495: i2d
      // 496: dconst_1
      // 497: dadd
      // 498: dconst_0
      // 499: invokevirtual q3g.g5o (DDD)Lq3g;
      // 49c: dconst_1
      // 49d: dconst_0
      // 49e: invokevirtual q3g.h0a (DD)Lq3g;
      // 4a1: sipush 128
      // 4a4: sipush 128
      // 4a7: sipush 128
      // 4aa: sipush 255
      // 4ad: invokevirtual q3g.fje (IIII)Lq3g;
      // 4b0: invokevirtual q3g.pzw ()V
      // 4b3: aload 8
      // 4b5: iload 5
      // 4b7: i2d
      // 4b8: iload 17
      // 4ba: i2d
      // 4bb: dconst_1
      // 4bc: dadd
      // 4bd: dconst_0
      // 4be: invokevirtual q3g.g5o (DDD)Lq3g;
      // 4c1: dconst_0
      // 4c2: dconst_0
      // 4c3: invokevirtual q3g.h0a (DD)Lq3g;
      // 4c6: sipush 128
      // 4c9: sipush 128
      // 4cc: sipush 128
      // 4cf: sipush 255
      // 4d2: invokevirtual q3g.fje (IIII)Lq3g;
      // 4d5: invokevirtual q3g.pzw ()V
      // 4d8: aload 7
      // 4da: invokevirtual jom.q7g ()V
      // 4dd: aload 8
      // 4df: bipush 7
      // 4e1: getstatic gnl.rad Lbe7;
      // 4e4: invokevirtual q3g.ezr (ILbe7;)V
      // 4e7: aload 8
      // 4e9: iload 5
      // 4eb: i2d
      // 4ec: iload 17
      // 4ee: iload 16
      // 4f0: iadd
      // 4f1: bipush 1
      // 4f2: isub
      // 4f3: bipush 1
      // 4f4: isub
      // 4f5: i2d
      // 4f6: dconst_0
      // 4f7: invokevirtual q3g.g5o (DDD)Lq3g;
      // 4fa: dconst_0
      // 4fb: dconst_1
      // 4fc: invokevirtual q3g.h0a (DD)Lq3g;
      // 4ff: sipush 192
      // 502: sipush 192
      // 505: sipush 192
      // 508: sipush 255
      // 50b: invokevirtual q3g.fje (IIII)Lq3g;
      // 50e: invokevirtual q3g.pzw ()V
      // 511: aload 8
      // 513: iload 6
      // 515: bipush 1
      // 516: isub
      // 517: i2d
      // 518: iload 17
      // 51a: iload 16
      // 51c: iadd
      // 51d: bipush 1
      // 51e: isub
      // 51f: bipush 1
      // 520: isub
      // 521: i2d
      // 522: dconst_0
      // 523: invokevirtual q3g.g5o (DDD)Lq3g;
      // 526: dconst_1
      // 527: dconst_1
      // 528: invokevirtual q3g.h0a (DD)Lq3g;
      // 52b: sipush 192
      // 52e: sipush 192
      // 531: sipush 192
      // 534: sipush 255
      // 537: invokevirtual q3g.fje (IIII)Lq3g;
      // 53a: invokevirtual q3g.pzw ()V
      // 53d: aload 8
      // 53f: iload 6
      // 541: bipush 1
      // 542: isub
      // 543: i2d
      // 544: iload 17
      // 546: i2d
      // 547: dconst_1
      // 548: dadd
      // 549: dconst_0
      // 54a: invokevirtual q3g.g5o (DDD)Lq3g;
      // 54d: dconst_1
      // 54e: dconst_0
      // 54f: invokevirtual q3g.h0a (DD)Lq3g;
      // 552: sipush 192
      // 555: sipush 192
      // 558: sipush 192
      // 55b: sipush 255
      // 55e: invokevirtual q3g.fje (IIII)Lq3g;
      // 561: invokevirtual q3g.pzw ()V
      // 564: aload 8
      // 566: iload 5
      // 568: i2d
      // 569: iload 17
      // 56b: i2d
      // 56c: dconst_1
      // 56d: dadd
      // 56e: dconst_0
      // 56f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 572: dconst_0
      // 573: dconst_0
      // 574: invokevirtual q3g.h0a (DD)Lq3g;
      // 577: sipush 192
      // 57a: sipush 192
      // 57d: sipush 192
      // 580: sipush 255
      // 583: invokevirtual q3g.fje (IIII)Lq3g;
      // 586: invokevirtual q3g.pzw ()V
      // 589: aload 7
      // 58b: invokevirtual jom.q7g ()V
      // 58e: aload 0
      // 58f: iload 1
      // 590: iload 2
      // 591: invokevirtual ed7.fbo (II)V
      // 594: invokestatic hzu.rqj ()V
      // 597: sipush 7424
      // 59a: invokestatic hzu.nn9 (I)V
      // 59d: invokestatic hzu.if9 ()V
      // 5a0: invokestatic hzu.ux6 ()V
      // 5a3: return
      // 5a4: aload 0
      // 5a5: iload 1
      // 5a6: putfield ed7.bgb I
      // 5a9: aload 0
      // 5aa: iload 2
      // 5ab: putfield ed7.sng I
      // 5ae: aload 0
      // 5af: invokevirtual ed7.drawBackground ()V
      // 5b2: aload 0
      // 5b3: invokevirtual ed7.getScrollBarX ()I
      // 5b6: istore 5
      // 5b8: iload 5
      // 5ba: bipush 6
      // 5bc: iadd
      // 5bd: istore 6
      // 5bf: aload 0
      // 5c0: invokevirtual ed7.zn9 ()V
      // 5c3: invokestatic hzu.fpt ()V
      // 5c6: invokestatic hzu.gcp ()V
      // 5c9: invokestatic jom.yut ()Ljom;
      // 5cc: astore 7
      // 5ce: aload 7
      // 5d0: invokevirtual jom.zuq ()Lq3g;
      // 5d3: astore 8
      // 5d5: aload 0
      // 5d6: getfield ed7.gk_ Lc05;
      // 5d9: invokevirtual Minecraft.l22 ()Llc5;
      // 5dc: getstatic b0t.yby Lgdz;
      // 5df: invokevirtual lc5.anl (Lgdz;)V
      // 5e2: fconst_1
      // 5e3: fconst_1
      // 5e4: fconst_1
      // 5e5: fconst_1
      // 5e6: invokestatic hzu.wn0 (FFFF)V
      // 5e9: ldc 32.0
      // 5eb: nop
      // 5ec: fstore 9
      // 5ee: aload 8
      // 5f0: bipush 7
      // 5f2: getstatic gnl.rad Lbe7;
      // 5f5: invokevirtual q3g.ezr (ILbe7;)V
      // 5f8: aload 8
      // 5fa: aload 0
      // 5fb: getfield ed7.ytt I
      // 5fe: i2d
      // 5ff: aload 0
      // 600: getfield ed7.chj I
      // 603: i2d
      // 604: dconst_0
      // 605: invokevirtual q3g.g5o (DDD)Lq3g;
      // 608: aload 0
      // 609: getfield ed7.ytt I
      // 60c: i2f
      // 60d: fload 9
      // 60f: fdiv
      // 610: f2d
      // 611: aload 0
      // 612: getfield ed7.chj I
      // 615: aload 0
      // 616: getfield ed7.fx8 F
      // 619: f2i
      // 61a: iadd
      // 61b: i2f
      // 61c: fload 9
      // 61e: fdiv
      // 61f: f2d
      // 620: invokevirtual q3g.h0a (DD)Lq3g;
      // 623: bipush 32
      // 625: bipush 32
      // 627: bipush 32
      // 629: sipush 255
      // 62c: invokevirtual q3g.fje (IIII)Lq3g;
      // 62f: invokevirtual q3g.pzw ()V
      // 632: aload 8
      // 634: aload 0
      // 635: getfield ed7.som I
      // 638: i2d
      // 639: aload 0
      // 63a: getfield ed7.chj I
      // 63d: i2d
      // 63e: dconst_0
      // 63f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 642: aload 0
      // 643: getfield ed7.som I
      // 646: i2f
      // 647: fload 9
      // 649: fdiv
      // 64a: f2d
      // 64b: aload 0
      // 64c: getfield ed7.chj I
      // 64f: aload 0
      // 650: getfield ed7.fx8 F
      // 653: f2i
      // 654: iadd
      // 655: i2f
      // 656: fload 9
      // 658: fdiv
      // 659: f2d
      // 65a: invokevirtual q3g.h0a (DD)Lq3g;
      // 65d: bipush 32
      // 65f: bipush 32
      // 661: bipush 32
      // 663: sipush 255
      // 666: invokevirtual q3g.fje (IIII)Lq3g;
      // 669: invokevirtual q3g.pzw ()V
      // 66c: aload 8
      // 66e: aload 0
      // 66f: getfield ed7.som I
      // 672: i2d
      // 673: aload 0
      // 674: getfield ed7.vem I
      // 677: i2d
      // 678: dconst_0
      // 679: invokevirtual q3g.g5o (DDD)Lq3g;
      // 67c: aload 0
      // 67d: getfield ed7.som I
      // 680: i2f
      // 681: fload 9
      // 683: fdiv
      // 684: f2d
      // 685: aload 0
      // 686: getfield ed7.vem I
      // 689: aload 0
      // 68a: getfield ed7.fx8 F
      // 68d: f2i
      // 68e: iadd
      // 68f: i2f
      // 690: fload 9
      // 692: fdiv
      // 693: f2d
      // 694: invokevirtual q3g.h0a (DD)Lq3g;
      // 697: bipush 32
      // 699: bipush 32
      // 69b: bipush 32
      // 69d: sipush 255
      // 6a0: invokevirtual q3g.fje (IIII)Lq3g;
      // 6a3: invokevirtual q3g.pzw ()V
      // 6a6: aload 8
      // 6a8: aload 0
      // 6a9: getfield ed7.ytt I
      // 6ac: i2d
      // 6ad: aload 0
      // 6ae: getfield ed7.vem I
      // 6b1: i2d
      // 6b2: dconst_0
      // 6b3: invokevirtual q3g.g5o (DDD)Lq3g;
      // 6b6: aload 0
      // 6b7: getfield ed7.ytt I
      // 6ba: i2f
      // 6bb: fload 9
      // 6bd: fdiv
      // 6be: f2d
      // 6bf: aload 0
      // 6c0: getfield ed7.vem I
      // 6c3: aload 0
      // 6c4: getfield ed7.fx8 F
      // 6c7: f2i
      // 6c8: iadd
      // 6c9: i2f
      // 6ca: fload 9
      // 6cc: fdiv
      // 6cd: f2d
      // 6ce: invokevirtual q3g.h0a (DD)Lq3g;
      // 6d1: bipush 32
      // 6d3: bipush 32
      // 6d5: bipush 32
      // 6d7: sipush 255
      // 6da: invokevirtual q3g.fje (IIII)Lq3g;
      // 6dd: invokevirtual q3g.pzw ()V
      // 6e0: aload 7
      // 6e2: invokevirtual jom.q7g ()V
      // 6e5: aload 0
      // 6e6: getfield ed7.ytt I
      // 6e9: aload 0
      // 6ea: getfield ed7.wde I
      // 6ed: bipush 2
      // 6ee: idiv
      // 6ef: iadd
      // 6f0: aload 0
      // 6f1: invokevirtual ed7.getListWidth ()I
      // 6f4: bipush 2
      // 6f5: idiv
      // 6f6: isub
      // 6f7: bipush 2
      // 6f8: iadd
      // 6f9: istore 10
      // 6fb: aload 0
      // 6fc: getfield ed7.vem I
      // 6ff: bipush 4
      // 700: iadd
      // 701: aload 0
      // 702: getfield ed7.fx8 F
      // 705: f2i
      // 706: isub
      // 707: istore 11
      // 709: aload 0
      // 70a: getfield ed7.bc8 Z
      // 70d: iload 4
      // 70f: ifeq 73b
      // 712: ifeq 72d
      // 715: goto 71c
      // 718: invokestatic ed7.b (Loov;)Loov;
      // 71b: athrow
      // 71c: aload 0
      // 71d: iload 10
      // 71f: iload 11
      // 721: aload 7
      // 723: invokevirtual ed7.xwh (IILjom;)V
      // 726: goto 72d
      // 729: invokestatic ed7.b (Loov;)Loov;
      // 72c: athrow
      // 72d: aload 0
      // 72e: iload 10
      // 730: iload 11
      // 732: iload 1
      // 733: iload 2
      // 734: invokevirtual ed7.ycp (IIII)V
      // 737: invokestatic hzu._o4 ()V
      // 73a: bipush 4
      // 73b: istore 12
      // 73d: aload 0
      // 73e: bipush 0
      // 73f: aload 0
      // 740: getfield ed7.vem I
      // 743: sipush 255
      // 746: sipush 255
      // 749: invokevirtual ed7.ukt (IIII)V
      // 74c: aload 0
      // 74d: aload 0
      // 74e: getfield ed7.chj I
      // 751: aload 0
      // 752: getfield ed7.io9 I
      // 755: sipush 255
      // 758: sipush 255
      // 75b: invokevirtual ed7.ukt (IIII)V
      // 75e: invokestatic hzu.spd ()V
      // 761: sipush 770
      // 764: sipush 771
      // 767: bipush 0
      // 768: bipush 1
      // 769: invokestatic hzu.u39 (IIII)V
      // 76c: invokestatic hzu.vtj ()V
      // 76f: sipush 7425
      // 772: invokestatic hzu.nn9 (I)V
      // 775: invokestatic hzu.m_1 ()V
      // 778: aload 8
      // 77a: bipush 7
      // 77c: getstatic gnl.rad Lbe7;
      // 77f: invokevirtual q3g.ezr (ILbe7;)V
      // 782: aload 8
      // 784: aload 0
      // 785: getfield ed7.ytt I
      // 788: i2d
      // 789: aload 0
      // 78a: getfield ed7.vem I
      // 78d: iload 12
      // 78f: iadd
      // 790: i2d
      // 791: dconst_0
      // 792: invokevirtual q3g.g5o (DDD)Lq3g;
      // 795: dconst_0
      // 796: dconst_1
      // 797: invokevirtual q3g.h0a (DD)Lq3g;
      // 79a: bipush 0
      // 79b: bipush 0
      // 79c: bipush 0
      // 79d: bipush 0
      // 79e: invokevirtual q3g.fje (IIII)Lq3g;
      // 7a1: invokevirtual q3g.pzw ()V
      // 7a4: aload 8
      // 7a6: aload 0
      // 7a7: getfield ed7.som I
      // 7aa: i2d
      // 7ab: aload 0
      // 7ac: getfield ed7.vem I
      // 7af: iload 12
      // 7b1: iadd
      // 7b2: i2d
      // 7b3: dconst_0
      // 7b4: invokevirtual q3g.g5o (DDD)Lq3g;
      // 7b7: dconst_1
      // 7b8: dconst_1
      // 7b9: invokevirtual q3g.h0a (DD)Lq3g;
      // 7bc: bipush 0
      // 7bd: bipush 0
      // 7be: bipush 0
      // 7bf: bipush 0
      // 7c0: invokevirtual q3g.fje (IIII)Lq3g;
      // 7c3: invokevirtual q3g.pzw ()V
      // 7c6: aload 8
      // 7c8: aload 0
      // 7c9: getfield ed7.som I
      // 7cc: i2d
      // 7cd: aload 0
      // 7ce: getfield ed7.vem I
      // 7d1: i2d
      // 7d2: dconst_0
      // 7d3: invokevirtual q3g.g5o (DDD)Lq3g;
      // 7d6: dconst_1
      // 7d7: dconst_0
      // 7d8: invokevirtual q3g.h0a (DD)Lq3g;
      // 7db: bipush 0
      // 7dc: bipush 0
      // 7dd: bipush 0
      // 7de: sipush 255
      // 7e1: invokevirtual q3g.fje (IIII)Lq3g;
      // 7e4: invokevirtual q3g.pzw ()V
      // 7e7: aload 8
      // 7e9: aload 0
      // 7ea: getfield ed7.ytt I
      // 7ed: i2d
      // 7ee: aload 0
      // 7ef: getfield ed7.vem I
      // 7f2: i2d
      // 7f3: dconst_0
      // 7f4: invokevirtual q3g.g5o (DDD)Lq3g;
      // 7f7: dconst_0
      // 7f8: dconst_0
      // 7f9: invokevirtual q3g.h0a (DD)Lq3g;
      // 7fc: bipush 0
      // 7fd: bipush 0
      // 7fe: bipush 0
      // 7ff: sipush 255
      // 802: invokevirtual q3g.fje (IIII)Lq3g;
      // 805: invokevirtual q3g.pzw ()V
      // 808: aload 7
      // 80a: invokevirtual jom.q7g ()V
      // 80d: aload 8
      // 80f: bipush 7
      // 811: getstatic gnl.rad Lbe7;
      // 814: invokevirtual q3g.ezr (ILbe7;)V
      // 817: aload 8
      // 819: aload 0
      // 81a: getfield ed7.ytt I
      // 81d: i2d
      // 81e: aload 0
      // 81f: getfield ed7.chj I
      // 822: i2d
      // 823: dconst_0
      // 824: invokevirtual q3g.g5o (DDD)Lq3g;
      // 827: dconst_0
      // 828: dconst_1
      // 829: invokevirtual q3g.h0a (DD)Lq3g;
      // 82c: bipush 0
      // 82d: bipush 0
      // 82e: bipush 0
      // 82f: sipush 255
      // 832: invokevirtual q3g.fje (IIII)Lq3g;
      // 835: invokevirtual q3g.pzw ()V
      // 838: aload 8
      // 83a: aload 0
      // 83b: getfield ed7.som I
      // 83e: i2d
      // 83f: aload 0
      // 840: getfield ed7.chj I
      // 843: i2d
      // 844: dconst_0
      // 845: invokevirtual q3g.g5o (DDD)Lq3g;
      // 848: dconst_1
      // 849: dconst_1
      // 84a: invokevirtual q3g.h0a (DD)Lq3g;
      // 84d: bipush 0
      // 84e: bipush 0
      // 84f: bipush 0
      // 850: sipush 255
      // 853: invokevirtual q3g.fje (IIII)Lq3g;
      // 856: invokevirtual q3g.pzw ()V
      // 859: aload 8
      // 85b: aload 0
      // 85c: getfield ed7.som I
      // 85f: i2d
      // 860: aload 0
      // 861: getfield ed7.chj I
      // 864: iload 12
      // 866: isub
      // 867: i2d
      // 868: dconst_0
      // 869: invokevirtual q3g.g5o (DDD)Lq3g;
      // 86c: dconst_1
      // 86d: dconst_0
      // 86e: invokevirtual q3g.h0a (DD)Lq3g;
      // 871: bipush 0
      // 872: bipush 0
      // 873: bipush 0
      // 874: bipush 0
      // 875: invokevirtual q3g.fje (IIII)Lq3g;
      // 878: invokevirtual q3g.pzw ()V
      // 87b: aload 8
      // 87d: aload 0
      // 87e: getfield ed7.ytt I
      // 881: i2d
      // 882: aload 0
      // 883: getfield ed7.chj I
      // 886: iload 12
      // 888: isub
      // 889: i2d
      // 88a: dconst_0
      // 88b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 88e: dconst_0
      // 88f: dconst_0
      // 890: invokevirtual q3g.h0a (DD)Lq3g;
      // 893: bipush 0
      // 894: bipush 0
      // 895: bipush 0
      // 896: bipush 0
      // 897: invokevirtual q3g.fje (IIII)Lq3g;
      // 89a: invokevirtual q3g.pzw ()V
      // 89d: aload 7
      // 89f: invokevirtual jom.q7g ()V
      // 8a2: aload 0
      // 8a3: invokevirtual ed7.w1w ()I
      // 8a6: istore 13
      // 8a8: iload 13
      // 8aa: iload 4
      // 8ac: ifeq b00
      // 8af: ifle af4
      // 8b2: goto 8b9
      // 8b5: invokestatic ed7.b (Loov;)Loov;
      // 8b8: athrow
      // 8b9: aload 0
      // 8ba: getfield ed7.chj I
      // 8bd: aload 0
      // 8be: getfield ed7.vem I
      // 8c1: isub
      // 8c2: aload 0
      // 8c3: getfield ed7.chj I
      // 8c6: aload 0
      // 8c7: getfield ed7.vem I
      // 8ca: isub
      // 8cb: imul
      // 8cc: aload 0
      // 8cd: invokevirtual ed7.getContentHeight ()I
      // 8d0: idiv
      // 8d1: istore 14
      // 8d3: iload 14
      // 8d5: bipush 32
      // 8d7: aload 0
      // 8d8: getfield ed7.chj I
      // 8db: aload 0
      // 8dc: getfield ed7.vem I
      // 8df: isub
      // 8e0: bipush 8
      // 8e2: isub
      // 8e3: invokestatic fe6.faa (III)I
      // 8e6: istore 14
      // 8e8: aload 0
      // 8e9: getfield ed7.fx8 F
      // 8ec: f2i
      // 8ed: aload 0
      // 8ee: getfield ed7.chj I
      // 8f1: aload 0
      // 8f2: getfield ed7.vem I
      // 8f5: isub
      // 8f6: iload 14
      // 8f8: isub
      // 8f9: imul
      // 8fa: iload 13
      // 8fc: idiv
      // 8fd: aload 0
      // 8fe: getfield ed7.vem I
      // 901: iadd
      // 902: istore 15
      // 904: iload 4
      // 906: ifeq aef
      // 909: iload 15
      // 90b: aload 0
      // 90c: getfield ed7.vem I
      // 90f: if_icmpge 91f
      // 912: goto 919
      // 915: invokestatic ed7.b (Loov;)Loov;
      // 918: athrow
      // 919: aload 0
      // 91a: getfield ed7.vem I
      // 91d: istore 15
      // 91f: aload 8
      // 921: bipush 7
      // 923: getstatic gnl.rad Lbe7;
      // 926: invokevirtual q3g.ezr (ILbe7;)V
      // 929: aload 8
      // 92b: iload 5
      // 92d: i2d
      // 92e: aload 0
      // 92f: getfield ed7.chj I
      // 932: i2d
      // 933: dconst_0
      // 934: invokevirtual q3g.g5o (DDD)Lq3g;
      // 937: dconst_0
      // 938: dconst_1
      // 939: invokevirtual q3g.h0a (DD)Lq3g;
      // 93c: bipush 0
      // 93d: bipush 0
      // 93e: bipush 0
      // 93f: sipush 255
      // 942: invokevirtual q3g.fje (IIII)Lq3g;
      // 945: invokevirtual q3g.pzw ()V
      // 948: aload 8
      // 94a: iload 6
      // 94c: i2d
      // 94d: aload 0
      // 94e: getfield ed7.chj I
      // 951: i2d
      // 952: dconst_0
      // 953: invokevirtual q3g.g5o (DDD)Lq3g;
      // 956: dconst_1
      // 957: dconst_1
      // 958: invokevirtual q3g.h0a (DD)Lq3g;
      // 95b: bipush 0
      // 95c: bipush 0
      // 95d: bipush 0
      // 95e: sipush 255
      // 961: invokevirtual q3g.fje (IIII)Lq3g;
      // 964: invokevirtual q3g.pzw ()V
      // 967: aload 8
      // 969: iload 6
      // 96b: i2d
      // 96c: aload 0
      // 96d: getfield ed7.vem I
      // 970: i2d
      // 971: dconst_0
      // 972: invokevirtual q3g.g5o (DDD)Lq3g;
      // 975: dconst_1
      // 976: dconst_0
      // 977: invokevirtual q3g.h0a (DD)Lq3g;
      // 97a: bipush 0
      // 97b: bipush 0
      // 97c: bipush 0
      // 97d: sipush 255
      // 980: invokevirtual q3g.fje (IIII)Lq3g;
      // 983: invokevirtual q3g.pzw ()V
      // 986: aload 8
      // 988: iload 5
      // 98a: i2d
      // 98b: aload 0
      // 98c: getfield ed7.vem I
      // 98f: i2d
      // 990: dconst_0
      // 991: invokevirtual q3g.g5o (DDD)Lq3g;
      // 994: dconst_0
      // 995: dconst_0
      // 996: invokevirtual q3g.h0a (DD)Lq3g;
      // 999: bipush 0
      // 99a: bipush 0
      // 99b: bipush 0
      // 99c: sipush 255
      // 99f: invokevirtual q3g.fje (IIII)Lq3g;
      // 9a2: invokevirtual q3g.pzw ()V
      // 9a5: aload 7
      // 9a7: invokevirtual jom.q7g ()V
      // 9aa: aload 8
      // 9ac: bipush 7
      // 9ae: getstatic gnl.rad Lbe7;
      // 9b1: invokevirtual q3g.ezr (ILbe7;)V
      // 9b4: aload 8
      // 9b6: iload 5
      // 9b8: i2d
      // 9b9: iload 15
      // 9bb: iload 14
      // 9bd: iadd
      // 9be: i2d
      // 9bf: dconst_0
      // 9c0: invokevirtual q3g.g5o (DDD)Lq3g;
      // 9c3: dconst_0
      // 9c4: dconst_1
      // 9c5: invokevirtual q3g.h0a (DD)Lq3g;
      // 9c8: sipush 128
      // 9cb: sipush 128
      // 9ce: sipush 128
      // 9d1: sipush 255
      // 9d4: invokevirtual q3g.fje (IIII)Lq3g;
      // 9d7: invokevirtual q3g.pzw ()V
      // 9da: aload 8
      // 9dc: iload 6
      // 9de: i2d
      // 9df: iload 15
      // 9e1: iload 14
      // 9e3: iadd
      // 9e4: i2d
      // 9e5: dconst_0
      // 9e6: invokevirtual q3g.g5o (DDD)Lq3g;
      // 9e9: dconst_1
      // 9ea: dconst_1
      // 9eb: invokevirtual q3g.h0a (DD)Lq3g;
      // 9ee: sipush 128
      // 9f1: sipush 128
      // 9f4: sipush 128
      // 9f7: sipush 255
      // 9fa: invokevirtual q3g.fje (IIII)Lq3g;
      // 9fd: invokevirtual q3g.pzw ()V
      // a00: aload 8
      // a02: iload 6
      // a04: i2d
      // a05: iload 15
      // a07: i2d
      // a08: dconst_0
      // a09: invokevirtual q3g.g5o (DDD)Lq3g;
      // a0c: dconst_1
      // a0d: dconst_0
      // a0e: invokevirtual q3g.h0a (DD)Lq3g;
      // a11: sipush 128
      // a14: sipush 128
      // a17: sipush 128
      // a1a: sipush 255
      // a1d: invokevirtual q3g.fje (IIII)Lq3g;
      // a20: invokevirtual q3g.pzw ()V
      // a23: aload 8
      // a25: iload 5
      // a27: i2d
      // a28: iload 15
      // a2a: i2d
      // a2b: dconst_0
      // a2c: invokevirtual q3g.g5o (DDD)Lq3g;
      // a2f: dconst_0
      // a30: dconst_0
      // a31: invokevirtual q3g.h0a (DD)Lq3g;
      // a34: sipush 128
      // a37: sipush 128
      // a3a: sipush 128
      // a3d: sipush 255
      // a40: invokevirtual q3g.fje (IIII)Lq3g;
      // a43: invokevirtual q3g.pzw ()V
      // a46: aload 7
      // a48: invokevirtual jom.q7g ()V
      // a4b: aload 8
      // a4d: bipush 7
      // a4f: getstatic gnl.rad Lbe7;
      // a52: invokevirtual q3g.ezr (ILbe7;)V
      // a55: aload 8
      // a57: iload 5
      // a59: i2d
      // a5a: iload 15
      // a5c: iload 14
      // a5e: iadd
      // a5f: bipush 1
      // a60: isub
      // a61: i2d
      // a62: dconst_0
      // a63: invokevirtual q3g.g5o (DDD)Lq3g;
      // a66: dconst_0
      // a67: dconst_1
      // a68: invokevirtual q3g.h0a (DD)Lq3g;
      // a6b: sipush 192
      // a6e: sipush 192
      // a71: sipush 192
      // a74: sipush 255
      // a77: invokevirtual q3g.fje (IIII)Lq3g;
      // a7a: invokevirtual q3g.pzw ()V
      // a7d: aload 8
      // a7f: iload 6
      // a81: bipush 1
      // a82: isub
      // a83: i2d
      // a84: iload 15
      // a86: iload 14
      // a88: iadd
      // a89: bipush 1
      // a8a: isub
      // a8b: i2d
      // a8c: dconst_0
      // a8d: invokevirtual q3g.g5o (DDD)Lq3g;
      // a90: dconst_1
      // a91: dconst_1
      // a92: invokevirtual q3g.h0a (DD)Lq3g;
      // a95: sipush 192
      // a98: sipush 192
      // a9b: sipush 192
      // a9e: sipush 255
      // aa1: invokevirtual q3g.fje (IIII)Lq3g;
      // aa4: invokevirtual q3g.pzw ()V
      // aa7: aload 8
      // aa9: iload 6
      // aab: bipush 1
      // aac: isub
      // aad: i2d
      // aae: iload 15
      // ab0: i2d
      // ab1: dconst_0
      // ab2: invokevirtual q3g.g5o (DDD)Lq3g;
      // ab5: dconst_1
      // ab6: dconst_0
      // ab7: invokevirtual q3g.h0a (DD)Lq3g;
      // aba: sipush 192
      // abd: sipush 192
      // ac0: sipush 192
      // ac3: sipush 255
      // ac6: invokevirtual q3g.fje (IIII)Lq3g;
      // ac9: invokevirtual q3g.pzw ()V
      // acc: aload 8
      // ace: iload 5
      // ad0: i2d
      // ad1: iload 15
      // ad3: i2d
      // ad4: dconst_0
      // ad5: invokevirtual q3g.g5o (DDD)Lq3g;
      // ad8: dconst_0
      // ad9: dconst_0
      // ada: invokevirtual q3g.h0a (DD)Lq3g;
      // add: sipush 192
      // ae0: sipush 192
      // ae3: sipush 192
      // ae6: sipush 255
      // ae9: invokevirtual q3g.fje (IIII)Lq3g;
      // aec: invokevirtual q3g.pzw ()V
      // aef: aload 7
      // af1: invokevirtual jom.q7g ()V
      // af4: aload 0
      // af5: iload 1
      // af6: iload 2
      // af7: invokevirtual ed7.fbo (II)V
      // afa: invokestatic hzu.rqj ()V
      // afd: sipush 7424
      // b00: invokestatic hzu.nn9 (I)V
      // b03: invokestatic hzu.if9 ()V
      // b06: invokestatic hzu.ux6 ()V
      // b09: return
   }

   public void gzb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: aload 0
      // 006: getfield ed7.sng I
      // 009: invokevirtual ed7.gti (I)Z
      // 00c: iload 1
      // 00d: ifne 01d
      // 010: ifeq 545
      // 013: goto 01a
      // 016: invokestatic ed7.b (Loov;)Loov;
      // 019: athrow
      // 01a: invokestatic org/lwjgl/input/Mouse.getEventButton ()I
      // 01d: iload 1
      // 01e: ifne 1bd
      // 021: ifne 1b9
      // 024: goto 02b
      // 027: invokestatic ed7.b (Loov;)Loov;
      // 02a: athrow
      // 02b: invokestatic org/lwjgl/input/Mouse.getEventButtonState ()Z
      // 02e: iload 1
      // 02f: ifne 1bd
      // 032: goto 039
      // 035: invokestatic ed7.b (Loov;)Loov;
      // 038: athrow
      // 039: ifeq 1b9
      // 03c: goto 043
      // 03f: invokestatic ed7.b (Loov;)Loov;
      // 042: athrow
      // 043: aload 0
      // 044: getfield ed7.sng I
      // 047: iload 1
      // 048: ifne 1bd
      // 04b: goto 052
      // 04e: invokestatic ed7.b (Loov;)Loov;
      // 051: athrow
      // 052: aload 0
      // 053: getfield ed7.vem I
      // 056: if_icmplt 1b9
      // 059: goto 060
      // 05c: invokestatic ed7.b (Loov;)Loov;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield ed7.sng I
      // 064: iload 1
      // 065: ifne 1bd
      // 068: goto 06f
      // 06b: invokestatic ed7.b (Loov;)Loov;
      // 06e: athrow
      // 06f: aload 0
      // 070: getfield ed7.chj I
      // 073: if_icmpgt 1b9
      // 076: goto 07d
      // 079: invokestatic ed7.b (Loov;)Loov;
      // 07c: athrow
      // 07d: aload 0
      // 07e: getfield ed7.wde I
      // 081: aload 0
      // 082: invokevirtual ed7.getListWidth ()I
      // 085: isub
      // 086: bipush 2
      // 087: idiv
      // 088: istore 2
      // 089: aload 0
      // 08a: getfield ed7.wde I
      // 08d: aload 0
      // 08e: invokevirtual ed7.getListWidth ()I
      // 091: iadd
      // 092: bipush 2
      // 093: idiv
      // 094: istore 3
      // 095: aload 0
      // 096: getfield ed7.sng I
      // 099: aload 0
      // 09a: getfield ed7.vem I
      // 09d: isub
      // 09e: aload 0
      // 09f: getfield ed7.vrd I
      // 0a2: isub
      // 0a3: aload 0
      // 0a4: getfield ed7.fx8 F
      // 0a7: f2i
      // 0a8: iadd
      // 0a9: bipush 4
      // 0aa: isub
      // 0ab: istore 4
      // 0ad: iload 4
      // 0af: aload 0
      // 0b0: getfield ed7.qc1 I
      // 0b3: idiv
      // 0b4: istore 5
      // 0b6: iload 5
      // 0b8: aload 0
      // 0b9: invokevirtual ed7.getSize ()I
      // 0bc: iload 1
      // 0bd: ifne 163
      // 0c0: if_icmpge 14c
      // 0c3: goto 0ca
      // 0c6: invokestatic ed7.b (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield ed7.bgb I
      // 0ce: iload 2
      // 0cf: iload 1
      // 0d0: ifne 163
      // 0d3: goto 0da
      // 0d6: invokestatic ed7.b (Loov;)Loov;
      // 0d9: athrow
      // 0da: if_icmplt 14c
      // 0dd: goto 0e4
      // 0e0: invokestatic ed7.b (Loov;)Loov;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: getfield ed7.bgb I
      // 0e8: iload 3
      // 0e9: iload 1
      // 0ea: ifne 163
      // 0ed: goto 0f4
      // 0f0: invokestatic ed7.b (Loov;)Loov;
      // 0f3: athrow
      // 0f4: if_icmpgt 14c
      // 0f7: goto 0fe
      // 0fa: invokestatic ed7.b (Loov;)Loov;
      // 0fd: athrow
      // 0fe: iload 5
      // 100: iload 1
      // 101: ifne 157
      // 104: goto 10b
      // 107: invokestatic ed7.b (Loov;)Loov;
      // 10a: athrow
      // 10b: iflt 14c
      // 10e: goto 115
      // 111: invokestatic ed7.b (Loov;)Loov;
      // 114: athrow
      // 115: iload 4
      // 117: iload 1
      // 118: ifne 157
      // 11b: goto 122
      // 11e: invokestatic ed7.b (Loov;)Loov;
      // 121: athrow
      // 122: iflt 14c
      // 125: goto 12c
      // 128: invokestatic ed7.b (Loov;)Loov;
      // 12b: athrow
      // 12c: aload 0
      // 12d: iload 5
      // 12f: bipush 0
      // 130: aload 0
      // 131: getfield ed7.bgb I
      // 134: aload 0
      // 135: getfield ed7.sng I
      // 138: invokevirtual ed7.elementClicked (IZII)V
      // 13b: aload 0
      // 13c: iload 5
      // 13e: putfield ed7.qzy I
      // 141: iload 1
      // 142: ifeq 1b9
      // 145: goto 14c
      // 148: invokestatic ed7.b (Loov;)Loov;
      // 14b: athrow
      // 14c: aload 0
      // 14d: getfield ed7.bgb I
      // 150: goto 157
      // 153: invokestatic ed7.b (Loov;)Loov;
      // 156: athrow
      // 157: iload 1
      // 158: ifne 1bd
      // 15b: iload 2
      // 15c: goto 163
      // 15f: invokestatic ed7.b (Loov;)Loov;
      // 162: athrow
      // 163: if_icmplt 1b9
      // 166: aload 0
      // 167: getfield ed7.bgb I
      // 16a: iload 1
      // 16b: ifne 1bd
      // 16e: goto 175
      // 171: invokestatic ed7.b (Loov;)Loov;
      // 174: athrow
      // 175: iload 3
      // 176: if_icmpgt 1b9
      // 179: goto 180
      // 17c: invokestatic ed7.b (Loov;)Loov;
      // 17f: athrow
      // 180: iload 4
      // 182: iload 1
      // 183: ifne 1bd
      // 186: goto 18d
      // 189: invokestatic ed7.b (Loov;)Loov;
      // 18c: athrow
      // 18d: ifge 1b9
      // 190: goto 197
      // 193: invokestatic ed7.b (Loov;)Loov;
      // 196: athrow
      // 197: aload 0
      // 198: aload 0
      // 199: getfield ed7.bgb I
      // 19c: iload 2
      // 19d: isub
      // 19e: aload 0
      // 19f: getfield ed7.sng I
      // 1a2: aload 0
      // 1a3: getfield ed7.vem I
      // 1a6: isub
      // 1a7: aload 0
      // 1a8: getfield ed7.fx8 F
      // 1ab: f2i
      // 1ac: iadd
      // 1ad: bipush 4
      // 1ae: isub
      // 1af: invokevirtual ed7.n_7 (II)V
      // 1b2: goto 1b9
      // 1b5: invokestatic ed7.b (Loov;)Loov;
      // 1b8: athrow
      // 1b9: bipush 0
      // 1ba: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 1bd: iload 1
      // 1be: ifne 1e1
      // 1c1: ifeq 4e7
      // 1c4: goto 1cb
      // 1c7: invokestatic ed7.b (Loov;)Loov;
      // 1ca: athrow
      // 1cb: aload 0
      // 1cc: iload 1
      // 1cd: ifne 4ef
      // 1d0: goto 1d7
      // 1d3: invokestatic ed7.b (Loov;)Loov;
      // 1d6: athrow
      // 1d7: invokevirtual ed7.d17 ()Z
      // 1da: goto 1e1
      // 1dd: invokestatic ed7.b (Loov;)Loov;
      // 1e0: athrow
      // 1e1: ifeq 4e7
      // 1e4: aload 0
      // 1e5: getfield ed7.n26 I
      // 1e8: iload 1
      // 1e9: ifne 4ae
      // 1ec: goto 1f3
      // 1ef: invokestatic ed7.b (Loov;)Loov;
      // 1f2: athrow
      // 1f3: bipush -1
      // 1f4: if_icmpne 4a3
      // 1f7: goto 1fe
      // 1fa: invokestatic ed7.b (Loov;)Loov;
      // 1fd: athrow
      // 1fe: bipush 1
      // 1ff: istore 2
      // 200: aload 0
      // 201: iload 1
      // 202: ifne 49a
      // 205: getfield ed7.sng I
      // 208: aload 0
      // 209: getfield ed7.vem I
      // 20c: if_icmplt 492
      // 20f: goto 216
      // 212: invokestatic ed7.b (Loov;)Loov;
      // 215: athrow
      // 216: aload 0
      // 217: iload 1
      // 218: ifne 49a
      // 21b: goto 222
      // 21e: invokestatic ed7.b (Loov;)Loov;
      // 221: athrow
      // 222: getfield ed7.sng I
      // 225: aload 0
      // 226: getfield ed7.chj I
      // 229: if_icmpgt 492
      // 22c: goto 233
      // 22f: invokestatic ed7.b (Loov;)Loov;
      // 232: athrow
      // 233: aload 0
      // 234: getfield ed7.wde I
      // 237: aload 0
      // 238: invokevirtual ed7.getListWidth ()I
      // 23b: isub
      // 23c: bipush 2
      // 23d: idiv
      // 23e: istore 3
      // 23f: aload 0
      // 240: getfield ed7.wde I
      // 243: aload 0
      // 244: invokevirtual ed7.getListWidth ()I
      // 247: iadd
      // 248: bipush 2
      // 249: idiv
      // 24a: istore 4
      // 24c: aload 0
      // 24d: getfield ed7.sng I
      // 250: aload 0
      // 251: getfield ed7.vem I
      // 254: isub
      // 255: aload 0
      // 256: getfield ed7.vrd I
      // 259: isub
      // 25a: aload 0
      // 25b: getfield ed7.fx8 F
      // 25e: f2i
      // 25f: iadd
      // 260: bipush 4
      // 261: isub
      // 262: istore 5
      // 264: iload 5
      // 266: aload 0
      // 267: getfield ed7.qc1 I
      // 26a: idiv
      // 26b: istore 6
      // 26d: iload 6
      // 26f: aload 0
      // 270: invokevirtual ed7.getSize ()I
      // 273: iload 1
      // 274: ifne 35f
      // 277: if_icmpge 348
      // 27a: goto 281
      // 27d: invokestatic ed7.b (Loov;)Loov;
      // 280: athrow
      // 281: aload 0
      // 282: getfield ed7.bgb I
      // 285: iload 3
      // 286: iload 1
      // 287: ifne 35f
      // 28a: goto 291
      // 28d: invokestatic ed7.b (Loov;)Loov;
      // 290: athrow
      // 291: if_icmplt 348
      // 294: goto 29b
      // 297: invokestatic ed7.b (Loov;)Loov;
      // 29a: athrow
      // 29b: aload 0
      // 29c: getfield ed7.bgb I
      // 29f: iload 4
      // 2a1: iload 1
      // 2a2: ifne 35f
      // 2a5: goto 2ac
      // 2a8: invokestatic ed7.b (Loov;)Loov;
      // 2ab: athrow
      // 2ac: if_icmpgt 348
      // 2af: goto 2b6
      // 2b2: invokestatic ed7.b (Loov;)Loov;
      // 2b5: athrow
      // 2b6: iload 6
      // 2b8: iload 1
      // 2b9: ifne 353
      // 2bc: goto 2c3
      // 2bf: invokestatic ed7.b (Loov;)Loov;
      // 2c2: athrow
      // 2c3: iflt 348
      // 2c6: goto 2cd
      // 2c9: invokestatic ed7.b (Loov;)Loov;
      // 2cc: athrow
      // 2cd: iload 5
      // 2cf: iload 1
      // 2d0: ifne 353
      // 2d3: goto 2da
      // 2d6: invokestatic ed7.b (Loov;)Loov;
      // 2d9: athrow
      // 2da: iflt 348
      // 2dd: goto 2e4
      // 2e0: invokestatic ed7.b (Loov;)Loov;
      // 2e3: athrow
      // 2e4: iload 6
      // 2e6: iload 1
      // 2e7: ifne 312
      // 2ea: goto 2f1
      // 2ed: invokestatic ed7.b (Loov;)Loov;
      // 2f0: athrow
      // 2f1: aload 0
      // 2f2: getfield ed7.qzy I
      // 2f5: if_icmpne 324
      // 2f8: goto 2ff
      // 2fb: invokestatic ed7.b (Loov;)Loov;
      // 2fe: athrow
      // 2ff: invokestatic Minecraft.qgs ()J
      // 302: aload 0
      // 303: getfield ed7.kjk J
      // 306: lsub
      // 307: ldc2_w 250
      // 30a: lcmp
      // 30b: goto 312
      // 30e: invokestatic ed7.b (Loov;)Loov;
      // 311: athrow
      // 312: iload 1
      // 313: ifne 321
      // 316: ifge 324
      // 319: goto 320
      // 31c: invokestatic ed7.b (Loov;)Loov;
      // 31f: athrow
      // 320: bipush 1
      // 321: goto 325
      // 324: bipush 0
      // 325: istore 7
      // 327: aload 0
      // 328: iload 6
      // 32a: iload 7
      // 32c: aload 0
      // 32d: getfield ed7.bgb I
      // 330: aload 0
      // 331: getfield ed7.sng I
      // 334: invokevirtual ed7.elementClicked (IZII)V
      // 337: aload 0
      // 338: iload 6
      // 33a: putfield ed7.qzy I
      // 33d: aload 0
      // 33e: invokestatic Minecraft.qgs ()J
      // 341: putfield ed7.kjk J
      // 344: iload 1
      // 345: ifeq 3b1
      // 348: aload 0
      // 349: getfield ed7.bgb I
      // 34c: goto 353
      // 34f: invokestatic ed7.b (Loov;)Loov;
      // 352: athrow
      // 353: iload 1
      // 354: ifne 3b5
      // 357: iload 3
      // 358: goto 35f
      // 35b: invokestatic ed7.b (Loov;)Loov;
      // 35e: athrow
      // 35f: if_icmplt 3b1
      // 362: aload 0
      // 363: getfield ed7.bgb I
      // 366: iload 1
      // 367: ifne 3b5
      // 36a: goto 371
      // 36d: invokestatic ed7.b (Loov;)Loov;
      // 370: athrow
      // 371: iload 4
      // 373: if_icmpgt 3b1
      // 376: goto 37d
      // 379: invokestatic ed7.b (Loov;)Loov;
      // 37c: athrow
      // 37d: iload 5
      // 37f: iload 1
      // 380: ifne 3b5
      // 383: goto 38a
      // 386: invokestatic ed7.b (Loov;)Loov;
      // 389: athrow
      // 38a: ifge 3b1
      // 38d: goto 394
      // 390: invokestatic ed7.b (Loov;)Loov;
      // 393: athrow
      // 394: aload 0
      // 395: aload 0
      // 396: getfield ed7.bgb I
      // 399: iload 3
      // 39a: isub
      // 39b: aload 0
      // 39c: getfield ed7.sng I
      // 39f: aload 0
      // 3a0: getfield ed7.vem I
      // 3a3: isub
      // 3a4: aload 0
      // 3a5: getfield ed7.fx8 F
      // 3a8: f2i
      // 3a9: iadd
      // 3aa: bipush 4
      // 3ab: isub
      // 3ac: invokevirtual ed7.n_7 (II)V
      // 3af: bipush 0
      // 3b0: istore 2
      // 3b1: aload 0
      // 3b2: invokevirtual ed7.getScrollBarX ()I
      // 3b5: istore 7
      // 3b7: iload 7
      // 3b9: bipush 6
      // 3bb: iadd
      // 3bc: istore 8
      // 3be: aload 0
      // 3bf: iload 1
      // 3c0: ifne 466
      // 3c3: getfield ed7.bgb I
      // 3c6: iload 7
      // 3c8: if_icmplt 45e
      // 3cb: goto 3d2
      // 3ce: invokestatic ed7.b (Loov;)Loov;
      // 3d1: athrow
      // 3d2: aload 0
      // 3d3: iload 1
      // 3d4: ifne 466
      // 3d7: goto 3de
      // 3da: invokestatic ed7.b (Loov;)Loov;
      // 3dd: athrow
      // 3de: getfield ed7.bgb I
      // 3e1: iload 8
      // 3e3: if_icmpgt 45e
      // 3e6: goto 3ed
      // 3e9: invokestatic ed7.b (Loov;)Loov;
      // 3ec: athrow
      // 3ed: aload 0
      // 3ee: ldc -1.0
      // 3f0: nop
      // 3f1: putfield ed7.lej F
      // 3f4: aload 0
      // 3f5: invokevirtual ed7.w1w ()I
      // 3f8: istore 9
      // 3fa: iload 9
      // 3fc: bipush 1
      // 3fd: iload 1
      // 3fe: ifne 420
      // 401: if_icmpge 40e
      // 404: goto 40b
      // 407: invokestatic ed7.b (Loov;)Loov;
      // 40a: athrow
      // 40b: bipush 1
      // 40c: istore 9
      // 40e: aload 0
      // 40f: getfield ed7.chj I
      // 412: aload 0
      // 413: getfield ed7.vem I
      // 416: isub
      // 417: aload 0
      // 418: getfield ed7.chj I
      // 41b: aload 0
      // 41c: getfield ed7.vem I
      // 41f: isub
      // 420: imul
      // 421: i2f
      // 422: aload 0
      // 423: invokevirtual ed7.getContentHeight ()I
      // 426: i2f
      // 427: fdiv
      // 428: f2i
      // 429: istore 10
      // 42b: iload 10
      // 42d: bipush 32
      // 42f: aload 0
      // 430: getfield ed7.chj I
      // 433: aload 0
      // 434: getfield ed7.vem I
      // 437: isub
      // 438: bipush 8
      // 43a: isub
      // 43b: invokestatic fe6.faa (III)I
      // 43e: istore 10
      // 440: aload 0
      // 441: dup
      // 442: getfield ed7.lej F
      // 445: aload 0
      // 446: getfield ed7.chj I
      // 449: aload 0
      // 44a: getfield ed7.vem I
      // 44d: isub
      // 44e: iload 10
      // 450: isub
      // 451: i2f
      // 452: iload 9
      // 454: i2f
      // 455: fdiv
      // 456: fdiv
      // 457: putfield ed7.lej F
      // 45a: iload 1
      // 45b: ifeq 46a
      // 45e: aload 0
      // 45f: goto 466
      // 462: invokestatic ed7.b (Loov;)Loov;
      // 465: athrow
      // 466: fconst_1
      // 467: putfield ed7.lej F
      // 46a: iload 2
      // 46b: ifeq 481
      // 46e: aload 0
      // 46f: aload 0
      // 470: getfield ed7.sng I
      // 473: putfield ed7.n26 I
      // 476: iload 1
      // 477: ifeq 48e
      // 47a: goto 481
      // 47d: invokestatic ed7.b (Loov;)Loov;
      // 480: athrow
      // 481: aload 0
      // 482: bipush -2
      // 484: putfield ed7.n26 I
      // 487: goto 48e
      // 48a: invokestatic ed7.b (Loov;)Loov;
      // 48d: athrow
      // 48e: iload 1
      // 48f: ifeq 49f
      // 492: aload 0
      // 493: goto 49a
      // 496: invokestatic ed7.b (Loov;)Loov;
      // 499: athrow
      // 49a: bipush -2
      // 49c: putfield ed7.n26 I
      // 49f: iload 1
      // 4a0: ifeq 4f3
      // 4a3: aload 0
      // 4a4: getfield ed7.n26 I
      // 4a7: goto 4ae
      // 4aa: invokestatic ed7.b (Loov;)Loov;
      // 4ad: athrow
      // 4ae: iload 1
      // 4af: ifne 4f6
      // 4b2: iflt 4f3
      // 4b5: goto 4bc
      // 4b8: invokestatic ed7.b (Loov;)Loov;
      // 4bb: athrow
      // 4bc: aload 0
      // 4bd: dup
      // 4be: getfield ed7.fx8 F
      // 4c1: aload 0
      // 4c2: getfield ed7.sng I
      // 4c5: aload 0
      // 4c6: getfield ed7.n26 I
      // 4c9: isub
      // 4ca: i2f
      // 4cb: aload 0
      // 4cc: getfield ed7.lej F
      // 4cf: fmul
      // 4d0: fsub
      // 4d1: putfield ed7.fx8 F
      // 4d4: aload 0
      // 4d5: aload 0
      // 4d6: getfield ed7.sng I
      // 4d9: putfield ed7.n26 I
      // 4dc: iload 1
      // 4dd: ifeq 4f3
      // 4e0: goto 4e7
      // 4e3: invokestatic ed7.b (Loov;)Loov;
      // 4e6: athrow
      // 4e7: aload 0
      // 4e8: goto 4ef
      // 4eb: invokestatic ed7.b (Loov;)Loov;
      // 4ee: athrow
      // 4ef: bipush -1
      // 4f0: putfield ed7.n26 I
      // 4f3: invokestatic org/lwjgl/input/Mouse.getEventDWheel ()I
      // 4f6: istore 2
      // 4f7: iload 2
      // 4f8: iload 1
      // 4f9: ifne 507
      // 4fc: ifeq 545
      // 4ff: goto 506
      // 502: invokestatic ed7.b (Loov;)Loov;
      // 505: athrow
      // 506: iload 2
      // 507: iload 1
      // 508: ifne 523
      // 50b: ifle 51b
      // 50e: goto 515
      // 511: invokestatic ed7.b (Loov;)Loov;
      // 514: athrow
      // 515: bipush -1
      // 516: istore 2
      // 517: iload 1
      // 518: ifeq 533
      // 51b: iload 2
      // 51c: goto 523
      // 51f: invokestatic ed7.b (Loov;)Loov;
      // 522: athrow
      // 523: iload 1
      // 524: ifne 532
      // 527: ifge 533
      // 52a: goto 531
      // 52d: invokestatic ed7.b (Loov;)Loov;
      // 530: athrow
      // 531: bipush 1
      // 532: istore 2
      // 533: aload 0
      // 534: dup
      // 535: getfield ed7.fx8 F
      // 538: iload 2
      // 539: aload 0
      // 53a: getfield ed7.qc1 I
      // 53d: imul
      // 53e: bipush 2
      // 53f: idiv
      // 540: i2f
      // 541: fadd
      // 542: putfield ed7.fx8 F
      // 545: return
   }

   public void m9t(boolean var1) {
      this.gto = var1;
   }

   public boolean d17() {
      return this.gto;
   }

   public int getListWidth() {
      return 220;
   }

   public void ycp(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual ed7.getSize ()I
      // 004: istore 6
      // 006: invokestatic jom.yut ()Ljom;
      // 009: astore 7
      // 00b: invokestatic OpaquePredicate.c ()I
      // 00e: aload 7
      // 010: invokevirtual jom.zuq ()Lq3g;
      // 013: astore 8
      // 015: istore 5
      // 017: bipush 0
      // 018: istore 9
      // 01a: iload 9
      // 01c: iload 6
      // 01e: if_icmpge 22a
      // 021: iload 2
      // 022: iload 9
      // 024: aload 0
      // 025: getfield ed7.qc1 I
      // 028: imul
      // 029: iadd
      // 02a: aload 0
      // 02b: getfield ed7.vrd I
      // 02e: iadd
      // 02f: istore 10
      // 031: aload 0
      // 032: getfield ed7.qc1 I
      // 035: bipush 4
      // 036: isub
      // 037: istore 11
      // 039: iload 10
      // 03b: aload 0
      // 03c: getfield ed7.chj I
      // 03f: iload 5
      // 041: ifne 06a
      // 044: if_icmpgt 06d
      // 047: goto 04e
      // 04a: invokestatic ed7.b (Loov;)Loov;
      // 04d: athrow
      // 04e: iload 10
      // 050: iload 11
      // 052: iadd
      // 053: iload 5
      // 055: ifne 08d
      // 058: goto 05f
      // 05b: invokestatic ed7.b (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield ed7.vem I
      // 063: goto 06a
      // 066: invokestatic ed7.b (Loov;)Loov;
      // 069: athrow
      // 06a: if_icmpge 07d
      // 06d: aload 0
      // 06e: iload 9
      // 070: iload 1
      // 071: iload 10
      // 073: invokevirtual ed7.dm2 (III)V
      // 076: goto 07d
      // 079: invokestatic ed7.b (Loov;)Loov;
      // 07c: athrow
      // 07d: aload 0
      // 07e: iload 5
      // 080: ifne 215
      // 083: getfield ed7.zy6 Z
      // 086: goto 08d
      // 089: invokestatic ed7.b (Loov;)Loov;
      // 08c: athrow
      // 08d: ifeq 214
      // 090: aload 0
      // 091: iload 9
      // 093: iload 5
      // 095: ifne 217
      // 098: goto 09f
      // 09b: invokestatic ed7.b (Loov;)Loov;
      // 09e: athrow
      // 09f: invokevirtual ed7.isSelected (I)Z
      // 0a2: ifeq 214
      // 0a5: goto 0ac
      // 0a8: invokestatic ed7.b (Loov;)Loov;
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: getfield ed7.ytt I
      // 0b0: aload 0
      // 0b1: getfield ed7.wde I
      // 0b4: bipush 2
      // 0b5: idiv
      // 0b6: aload 0
      // 0b7: invokevirtual ed7.getListWidth ()I
      // 0ba: bipush 2
      // 0bb: idiv
      // 0bc: isub
      // 0bd: iadd
      // 0be: istore 12
      // 0c0: aload 0
      // 0c1: getfield ed7.ytt I
      // 0c4: aload 0
      // 0c5: getfield ed7.wde I
      // 0c8: bipush 2
      // 0c9: idiv
      // 0ca: iadd
      // 0cb: aload 0
      // 0cc: invokevirtual ed7.getListWidth ()I
      // 0cf: bipush 2
      // 0d0: idiv
      // 0d1: iadd
      // 0d2: istore 13
      // 0d4: fconst_1
      // 0d5: fconst_1
      // 0d6: fconst_1
      // 0d7: fconst_1
      // 0d8: invokestatic hzu.wn0 (FFFF)V
      // 0db: invokestatic hzu.m_1 ()V
      // 0de: aload 8
      // 0e0: bipush 7
      // 0e2: getstatic gnl.rad Lbe7;
      // 0e5: invokevirtual q3g.ezr (ILbe7;)V
      // 0e8: aload 8
      // 0ea: iload 12
      // 0ec: i2d
      // 0ed: iload 10
      // 0ef: iload 11
      // 0f1: iadd
      // 0f2: bipush 2
      // 0f3: iadd
      // 0f4: i2d
      // 0f5: dconst_0
      // 0f6: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0f9: dconst_0
      // 0fa: dconst_1
      // 0fb: invokevirtual q3g.h0a (DD)Lq3g;
      // 0fe: sipush 128
      // 101: sipush 128
      // 104: sipush 128
      // 107: sipush 255
      // 10a: invokevirtual q3g.fje (IIII)Lq3g;
      // 10d: invokevirtual q3g.pzw ()V
      // 110: aload 8
      // 112: iload 13
      // 114: i2d
      // 115: iload 10
      // 117: iload 11
      // 119: iadd
      // 11a: bipush 2
      // 11b: iadd
      // 11c: i2d
      // 11d: dconst_0
      // 11e: invokevirtual q3g.g5o (DDD)Lq3g;
      // 121: dconst_1
      // 122: dconst_1
      // 123: invokevirtual q3g.h0a (DD)Lq3g;
      // 126: sipush 128
      // 129: sipush 128
      // 12c: sipush 128
      // 12f: sipush 255
      // 132: invokevirtual q3g.fje (IIII)Lq3g;
      // 135: invokevirtual q3g.pzw ()V
      // 138: aload 8
      // 13a: iload 13
      // 13c: i2d
      // 13d: iload 10
      // 13f: bipush 2
      // 140: isub
      // 141: i2d
      // 142: dconst_0
      // 143: invokevirtual q3g.g5o (DDD)Lq3g;
      // 146: dconst_1
      // 147: dconst_0
      // 148: invokevirtual q3g.h0a (DD)Lq3g;
      // 14b: sipush 128
      // 14e: sipush 128
      // 151: sipush 128
      // 154: sipush 255
      // 157: invokevirtual q3g.fje (IIII)Lq3g;
      // 15a: invokevirtual q3g.pzw ()V
      // 15d: aload 8
      // 15f: iload 12
      // 161: i2d
      // 162: iload 10
      // 164: bipush 2
      // 165: isub
      // 166: i2d
      // 167: dconst_0
      // 168: invokevirtual q3g.g5o (DDD)Lq3g;
      // 16b: dconst_0
      // 16c: dconst_0
      // 16d: invokevirtual q3g.h0a (DD)Lq3g;
      // 170: sipush 128
      // 173: sipush 128
      // 176: sipush 128
      // 179: sipush 255
      // 17c: invokevirtual q3g.fje (IIII)Lq3g;
      // 17f: invokevirtual q3g.pzw ()V
      // 182: aload 8
      // 184: iload 12
      // 186: bipush 1
      // 187: iadd
      // 188: i2d
      // 189: iload 10
      // 18b: iload 11
      // 18d: iadd
      // 18e: bipush 1
      // 18f: iadd
      // 190: i2d
      // 191: dconst_0
      // 192: invokevirtual q3g.g5o (DDD)Lq3g;
      // 195: dconst_0
      // 196: dconst_1
      // 197: invokevirtual q3g.h0a (DD)Lq3g;
      // 19a: bipush 0
      // 19b: bipush 0
      // 19c: bipush 0
      // 19d: sipush 255
      // 1a0: invokevirtual q3g.fje (IIII)Lq3g;
      // 1a3: invokevirtual q3g.pzw ()V
      // 1a6: aload 8
      // 1a8: iload 13
      // 1aa: bipush 1
      // 1ab: isub
      // 1ac: i2d
      // 1ad: iload 10
      // 1af: iload 11
      // 1b1: iadd
      // 1b2: bipush 1
      // 1b3: iadd
      // 1b4: i2d
      // 1b5: dconst_0
      // 1b6: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1b9: dconst_1
      // 1ba: dconst_1
      // 1bb: invokevirtual q3g.h0a (DD)Lq3g;
      // 1be: bipush 0
      // 1bf: bipush 0
      // 1c0: bipush 0
      // 1c1: sipush 255
      // 1c4: invokevirtual q3g.fje (IIII)Lq3g;
      // 1c7: invokevirtual q3g.pzw ()V
      // 1ca: aload 8
      // 1cc: iload 13
      // 1ce: bipush 1
      // 1cf: isub
      // 1d0: i2d
      // 1d1: iload 10
      // 1d3: bipush 1
      // 1d4: isub
      // 1d5: i2d
      // 1d6: dconst_0
      // 1d7: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1da: dconst_1
      // 1db: dconst_0
      // 1dc: invokevirtual q3g.h0a (DD)Lq3g;
      // 1df: bipush 0
      // 1e0: bipush 0
      // 1e1: bipush 0
      // 1e2: sipush 255
      // 1e5: invokevirtual q3g.fje (IIII)Lq3g;
      // 1e8: invokevirtual q3g.pzw ()V
      // 1eb: aload 8
      // 1ed: iload 12
      // 1ef: bipush 1
      // 1f0: iadd
      // 1f1: i2d
      // 1f2: iload 10
      // 1f4: bipush 1
      // 1f5: isub
      // 1f6: i2d
      // 1f7: dconst_0
      // 1f8: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1fb: dconst_0
      // 1fc: dconst_0
      // 1fd: invokevirtual q3g.h0a (DD)Lq3g;
      // 200: bipush 0
      // 201: bipush 0
      // 202: bipush 0
      // 203: sipush 255
      // 206: invokevirtual q3g.fje (IIII)Lq3g;
      // 209: invokevirtual q3g.pzw ()V
      // 20c: aload 7
      // 20e: invokevirtual jom.q7g ()V
      // 211: invokestatic hzu.rqj ()V
      // 214: aload 0
      // 215: iload 9
      // 217: iload 1
      // 218: iload 10
      // 21a: iload 11
      // 21c: iload 3
      // 21d: iload 4
      // 21f: invokevirtual ed7.drawSlot (IIIIII)V
      // 222: iinc 9 1
      // 225: iload 5
      // 227: ifeq 01a
      // 22a: return
   }

   public int getScrollBarX() {
      return this.wde / 2 + 124;
   }

   public void ukt(int var1, int var2, int var3, int var4) {
      jom var5 = jom.yut();
      q3g var6 = var5.zuq();
      this.gk_.l22().anl(b0t.yby);
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = 32.0F;
      var6.ezr(7, gnl.rad);
      var6.g5o((double)this.ytt, (double)var2, 0.0).h0a(0.0, (double)((float)var2 / 32.0F)).fje(64, 64, 64, var4).pzw();
      var6.g5o((double)(this.ytt + this.wde), (double)var2, 0.0)
         .h0a((double)((float)this.wde / 32.0F), (double)((float)var2 / 32.0F))
         .fje(64, 64, 64, var4)
         .pzw();
      var6.g5o((double)(this.ytt + this.wde), (double)var1, 0.0)
         .h0a((double)((float)this.wde / 32.0F), (double)((float)var1 / 32.0F))
         .fje(64, 64, 64, var3)
         .pzw();
      var6.g5o((double)this.ytt, (double)var1, 0.0).h0a(0.0, (double)((float)var1 / 32.0F)).fje(64, 64, 64, var3).pzw();
      var5.q7g();
   }

   public void pm4(int var1) {
      this.ytt = var1;
      this.som = var1 + this.wde;
   }

   public int m6f() {
      return this.qc1;
   }

   private static oov b(oov var0) {
      return var0;
   }
}
