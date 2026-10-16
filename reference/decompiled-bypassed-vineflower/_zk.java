import org.lwjgl.opengl.GL11;

public abstract class _zk {
   public int fux;
   public int ymi;
   public int cms;
   public int v5s;
   public int ll_;
   public final int pu6;
   public int __a;
   public int qjv;
   public boolean xgh = true;
   public int s63;

   public _zk(c05 var1, int var2, int var3, int var4, int var5, int var6) {
      this._ny = var1;
      this.fux = var2;
      this.k24 = var3;
      this.ymi = var4;
      this.cms = var5;
      this.pu6 = var6;
      this.ll_ = 0;
      this.v5s = var2;
   }

   public void ysu(int var1, int var2, int var3, int var4) {
      this.fux = var1;
      this.k24 = var2;
      this.ymi = var3;
      this.cms = var4;
      this.ll_ = 0;
      this.v5s = var1;
   }

   public void j6h(boolean var1) {
      this.czy = var1;
   }

   public void o68(boolean param1, int param2) {
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
      // 05: iload 1
      // 06: putfield _zk.we6 Z
      // 09: aload 0
      // 0a: iload 2
      // 0b: iload 3
      // 0c: ifeq 26
      // 0f: putfield _zk.s63 I
      // 12: iload 1
      // 13: ifne 29
      // 16: goto 1d
      // 19: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 0
      // 1e: bipush 0
      // 1f: goto 26
      // 22: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: putfield _zk.s63 I
      // 29: return
   }

   public abstract int osm();

   public abstract void f41(int var1, boolean var2, int var3, int var4);

   public abstract boolean ie8(int var1);

   public int lty() {
      return this.osm() * this.pu6 + this.s63;
   }

   public abstract void lec();

   public abstract void bct(int var1, int var2, int var3, int var4, int var5, int var6);

   public void zot(int var1, int var2, jom var3) {
   }

   public void xdy(int var1, int var2) {
   }

   public void zrl(int var1, int var2) {
   }

   public int byn(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield _zk.ll_ I
      // 04: aload 0
      // 05: getfield _zk.fux I
      // 08: bipush 2
      // 09: idiv
      // 0a: iadd
      // 0b: aload 0
      // 0c: invokevirtual _zk.e14 ()I
      // 0f: bipush 2
      // 10: idiv
      // 11: isub
      // 12: istore 4
      // 14: aload 0
      // 15: getfield _zk.ll_ I
      // 18: aload 0
      // 19: getfield _zk.fux I
      // 1c: bipush 2
      // 1d: idiv
      // 1e: iadd
      // 1f: aload 0
      // 20: invokevirtual _zk.e14 ()I
      // 23: bipush 2
      // 24: idiv
      // 25: iadd
      // 26: istore 5
      // 28: iload 2
      // 29: aload 0
      // 2a: getfield _zk.ymi I
      // 2d: isub
      // 2e: aload 0
      // 2f: getfield _zk.s63 I
      // 32: isub
      // 33: aload 0
      // 34: getfield _zk.cdx F
      // 37: f2i
      // 38: iadd
      // 39: bipush 4
      // 3a: isub
      // 3b: istore 6
      // 3d: invokestatic t9d.c ()I
      // 40: iload 6
      // 42: aload 0
      // 43: getfield _zk.pu6 I
      // 46: idiv
      // 47: istore 7
      // 49: istore 3
      // 4a: iload 1
      // 4b: aload 0
      // 4c: invokevirtual _zk.w3q ()I
      // 4f: iload 3
      // 50: ifne 67
      // 53: if_icmpge cd
      // 56: goto 5d
      // 59: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: iload 1
      // 5e: iload 4
      // 60: goto 67
      // 63: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66: athrow
      // 67: iload 3
      // 68: ifne 8a
      // 6b: if_icmplt cd
      // 6e: goto 75
      // 71: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: iload 1
      // 76: iload 3
      // 77: ifne 8f
      // 7a: goto 81
      // 7d: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: iload 5
      // 83: goto 8a
      // 86: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89: athrow
      // 8a: if_icmpgt cd
      // 8d: iload 7
      // 8f: iload 3
      // 90: ifne 9f
      // 93: iflt cd
      // 96: goto 9d
      // 99: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9c: athrow
      // 9d: iload 6
      // 9f: iload 3
      // a0: ifne af
      // a3: iflt cd
      // a6: goto ad
      // a9: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: iload 7
      // af: iload 3
      // b0: ifne ca
      // b3: aload 0
      // b4: invokevirtual _zk.osm ()I
      // b7: if_icmpge cd
      // ba: goto c1
      // bd: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c0: athrow
      // c1: iload 7
      // c3: goto ca
      // c6: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c9: athrow
      // ca: goto ce
      // cd: bipush -1
      // ce: ireturn
   }

   public void oae(int var1, int var2) {
      this.iz9 = var1;
      this.xq9 = var2;
   }

   private void kg2() {
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
      // 05: invokevirtual _zk.g1g ()I
      // 08: istore 2
      // 09: iload 2
      // 0a: iload 1
      // 0b: ifeq 20
      // 0e: ifge 1c
      // 11: goto 18
      // 14: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: iload 2
      // 19: bipush 2
      // 1a: idiv
      // 1b: istore 2
      // 1c: aload 0
      // 1d: getfield _zk.xgh Z
      // 20: iload 1
      // 21: ifeq 4c
      // 24: ifne 46
      // 27: goto 2e
      // 2a: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: iload 2
      // 2f: iload 1
      // 30: ifeq 4c
      // 33: goto 3a
      // 36: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: ifge 46
      // 3d: goto 44
      // 40: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: bipush 0
      // 45: istore 2
      // 46: aload 0
      // 47: getfield _zk.cdx F
      // 4a: fconst_0
      // 4b: fcmpg
      // 4c: iload 1
      // 4d: ifeq 78
      // 50: ifge 66
      // 53: goto 5a
      // 56: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: aload 0
      // 5b: fconst_0
      // 5c: putfield _zk.cdx F
      // 5f: goto 66
      // 62: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 0
      // 67: iload 1
      // 68: ifeq 7c
      // 6b: getfield _zk.cdx F
      // 6e: iload 2
      // 6f: i2f
      // 70: fcmpl
      // 71: goto 78
      // 74: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: ifle 81
      // 7b: aload 0
      // 7c: iload 2
      // 7d: i2f
      // 7e: putfield _zk.cdx F
      // 81: return
   }

   public int g1g() {
      return this.lty() - (this.cms - this.ymi - 4);
   }

   public int x1g() {
      return (int)this.cdx;
   }

   public boolean ghj(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: aload 0
      // 06: getfield _zk.ymi I
      // 09: iload 2
      // 0a: ifeq 2e
      // 0d: if_icmplt 35
      // 10: goto 17
      // 13: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: iload 1
      // 18: iload 2
      // 19: ifeq 32
      // 1c: goto 23
      // 1f: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 0
      // 24: getfield _zk.cms I
      // 27: goto 2e
      // 2a: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: if_icmpgt 35
      // 31: bipush 1
      // 32: goto 36
      // 35: bipush 0
      // 36: ireturn
   }

   public void ics(int var1) {
      this.cdx += (float)var1;
      this.kg2();
      this._pr = -2.0F;
   }

   public void lyg(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4.c9a Z
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifeq 91
      // 0f: goto 16
      // 12: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: getfield _zk.iz9 I
      // 25: iload 2
      // 26: ifne 6a
      // 29: if_icmpne 5b
      // 2c: goto 33
      // 2f: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: aload 0
      // 34: dup
      // 35: getfield _zk.cdx F
      // 38: aload 0
      // 39: getfield _zk.pu6 I
      // 3c: bipush 2
      // 3d: imul
      // 3e: bipush 3
      // 3f: idiv
      // 40: i2f
      // 41: fsub
      // 42: putfield _zk.cdx F
      // 45: aload 0
      // 46: ldc -2.0
      // 48: nop
      // 49: putfield _zk._pr F
      // 4c: aload 0
      // 4d: invokespecial _zk.kg2 ()V
      // 50: iload 2
      // 51: ifeq 91
      // 54: goto 5b
      // 57: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: aload 1
      // 5c: getfield gt4._me I
      // 5f: aload 0
      // 60: getfield _zk.xq9 I
      // 63: goto 6a
      // 66: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: if_icmpne 91
      // 6d: aload 0
      // 6e: dup
      // 6f: getfield _zk.cdx F
      // 72: aload 0
      // 73: getfield _zk.pu6 I
      // 76: bipush 2
      // 77: imul
      // 78: bipush 3
      // 79: idiv
      // 7a: i2f
      // 7b: fadd
      // 7c: putfield _zk.cdx F
      // 7f: aload 0
      // 80: ldc -2.0
      // 82: nop
      // 83: putfield _zk._pr F
      // 86: aload 0
      // 87: invokespecial _zk.kg2 ()V
      // 8a: goto 91
      // 8d: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 90: athrow
      // 91: return
   }

   public void t01(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: iload 1
      // 002: putfield _zk.__a I
      // 005: aload 0
      // 006: iload 2
      // 007: putfield _zk.qjv I
      // 00a: aload 0
      // 00b: invokevirtual _zk.lec ()V
      // 00e: invokestatic t9d.c ()I
      // 011: aload 0
      // 012: invokevirtual _zk.osm ()I
      // 015: istore 5
      // 017: istore 4
      // 019: aload 0
      // 01a: invokevirtual _zk.w3q ()I
      // 01d: istore 6
      // 01f: iload 6
      // 021: bipush 6
      // 023: iadd
      // 024: istore 7
      // 026: iload 1
      // 027: iload 4
      // 029: ifne 4b3
      // 02c: aload 0
      // 02d: getfield _zk.ll_ I
      // 030: if_icmple 4a6
      // 033: goto 03a
      // 036: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: iload 1
      // 03b: iload 4
      // 03d: ifne 4b3
      // 040: goto 047
      // 043: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: aload 0
      // 048: getfield _zk.v5s I
      // 04b: if_icmpge 4a6
      // 04e: goto 055
      // 051: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: iload 2
      // 056: iload 4
      // 058: ifne 4b3
      // 05b: goto 062
      // 05e: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: aload 0
      // 063: getfield _zk.ymi I
      // 066: if_icmple 4a6
      // 069: goto 070
      // 06c: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: iload 2
      // 071: iload 4
      // 073: ifne 4b3
      // 076: goto 07d
      // 079: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c: athrow
      // 07d: aload 0
      // 07e: getfield _zk.cms I
      // 081: if_icmpge 4a6
      // 084: goto 08b
      // 087: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a: athrow
      // 08b: bipush 0
      // 08c: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 08f: iload 4
      // 091: ifne 3fa
      // 094: goto 09b
      // 097: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: ifeq 3f0
      // 09e: goto 0a5
      // 0a1: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: invokevirtual _zk.u8l ()Z
      // 0a9: iload 4
      // 0ab: ifne 3fa
      // 0ae: goto 0b5
      // 0b1: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b4: athrow
      // 0b5: ifeq 3f0
      // 0b8: goto 0bf
      // 0bb: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: getfield _zk._pr F
      // 0c3: ldc -1.0
      // 0c5: nop
      // 0c6: fcmpl
      // 0c7: iload 4
      // 0c9: ifne 3ba
      // 0cc: goto 0d3
      // 0cf: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: ifne 3ad
      // 0d6: goto 0dd
      // 0d9: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: bipush 1
      // 0de: istore 12
      // 0e0: iload 2
      // 0e1: aload 0
      // 0e2: getfield _zk.ymi I
      // 0e5: iload 4
      // 0e7: ifne 100
      // 0ea: if_icmplt 39a
      // 0ed: goto 0f4
      // 0f0: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f3: athrow
      // 0f4: iload 2
      // 0f5: aload 0
      // 0f6: getfield _zk.cms I
      // 0f9: goto 100
      // 0fc: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: iload 4
      // 102: ifne 122
      // 105: if_icmpgt 39a
      // 108: goto 10f
      // 10b: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: aload 0
      // 110: getfield _zk.fux I
      // 113: bipush 2
      // 114: idiv
      // 115: aload 0
      // 116: invokevirtual _zk.e14 ()I
      // 119: bipush 2
      // 11a: idiv
      // 11b: goto 122
      // 11e: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: isub
      // 123: istore 13
      // 125: aload 0
      // 126: getfield _zk.fux I
      // 129: bipush 2
      // 12a: idiv
      // 12b: aload 0
      // 12c: invokevirtual _zk.e14 ()I
      // 12f: bipush 2
      // 130: idiv
      // 131: iadd
      // 132: istore 8
      // 134: iload 2
      // 135: aload 0
      // 136: getfield _zk.ymi I
      // 139: isub
      // 13a: aload 0
      // 13b: getfield _zk.s63 I
      // 13e: isub
      // 13f: aload 0
      // 140: getfield _zk.cdx F
      // 143: f2i
      // 144: iadd
      // 145: bipush 4
      // 146: isub
      // 147: istore 9
      // 149: iload 9
      // 14b: aload 0
      // 14c: getfield _zk.pu6 I
      // 14f: idiv
      // 150: istore 14
      // 152: iload 1
      // 153: iload 13
      // 155: iload 4
      // 157: ifne 232
      // 15a: if_icmplt 228
      // 15d: goto 164
      // 160: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: iload 1
      // 165: iload 8
      // 167: iload 4
      // 169: ifne 232
      // 16c: goto 173
      // 16f: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: if_icmpgt 228
      // 176: goto 17d
      // 179: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: iload 14
      // 17f: iload 4
      // 181: ifne 230
      // 184: goto 18b
      // 187: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: iflt 228
      // 18e: goto 195
      // 191: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: iload 9
      // 197: iload 4
      // 199: ifne 230
      // 19c: goto 1a3
      // 19f: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a2: athrow
      // 1a3: iflt 228
      // 1a6: goto 1ad
      // 1a9: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ac: athrow
      // 1ad: iload 14
      // 1af: iload 5
      // 1b1: iload 4
      // 1b3: ifne 232
      // 1b6: goto 1bd
      // 1b9: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bc: athrow
      // 1bd: if_icmpge 228
      // 1c0: goto 1c7
      // 1c3: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c6: athrow
      // 1c7: iload 14
      // 1c9: iload 4
      // 1cb: ifne 1f6
      // 1ce: goto 1d5
      // 1d1: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d4: athrow
      // 1d5: aload 0
      // 1d6: getfield _zk.qx9 I
      // 1d9: if_icmpne 209
      // 1dc: goto 1e3
      // 1df: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e2: athrow
      // 1e3: invokestatic c05.qgs ()J
      // 1e6: aload 0
      // 1e7: getfield _zk.dy2 J
      // 1ea: lsub
      // 1eb: ldc2_w 250
      // 1ee: lcmp
      // 1ef: goto 1f6
      // 1f2: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: iload 4
      // 1f8: ifne 206
      // 1fb: ifge 209
      // 1fe: goto 205
      // 201: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 204: athrow
      // 205: bipush 1
      // 206: goto 20a
      // 209: bipush 0
      // 20a: istore 15
      // 20c: aload 0
      // 20d: iload 14
      // 20f: iload 15
      // 211: iload 1
      // 212: iload 2
      // 213: invokevirtual _zk.f41 (IZII)V
      // 216: aload 0
      // 217: iload 14
      // 219: putfield _zk.qx9 I
      // 21c: aload 0
      // 21d: invokestatic c05.qgs ()J
      // 220: putfield _zk.dy2 J
      // 223: iload 4
      // 225: ifeq 28b
      // 228: iload 1
      // 229: goto 230
      // 22c: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22f: athrow
      // 230: iload 13
      // 232: iload 4
      // 234: ifne 28e
      // 237: if_icmplt 28b
      // 23a: goto 241
      // 23d: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 240: athrow
      // 241: iload 1
      // 242: iload 8
      // 244: iload 4
      // 246: ifne 28e
      // 249: goto 250
      // 24c: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24f: athrow
      // 250: if_icmpgt 28b
      // 253: goto 25a
      // 256: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 259: athrow
      // 25a: iload 9
      // 25c: iload 4
      // 25e: ifne 28c
      // 261: goto 268
      // 264: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 267: athrow
      // 268: ifge 28b
      // 26b: goto 272
      // 26e: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 271: athrow
      // 272: aload 0
      // 273: iload 1
      // 274: iload 13
      // 276: isub
      // 277: iload 2
      // 278: aload 0
      // 279: getfield _zk.ymi I
      // 27c: isub
      // 27d: aload 0
      // 27e: getfield _zk.cdx F
      // 281: f2i
      // 282: iadd
      // 283: bipush 4
      // 284: isub
      // 285: invokevirtual _zk.xdy (II)V
      // 288: bipush 0
      // 289: istore 12
      // 28b: iload 1
      // 28c: iload 6
      // 28e: iload 4
      // 290: ifne 2b3
      // 293: if_icmplt 364
      // 296: goto 29d
      // 299: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29c: athrow
      // 29d: iload 1
      // 29e: iload 4
      // 2a0: ifne 2c8
      // 2a3: goto 2aa
      // 2a6: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a9: athrow
      // 2aa: iload 7
      // 2ac: goto 2b3
      // 2af: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b2: athrow
      // 2b3: if_icmpgt 364
      // 2b6: aload 0
      // 2b7: ldc -1.0
      // 2b9: nop
      // 2ba: putfield _zk.mdk F
      // 2bd: aload 0
      // 2be: invokevirtual _zk.g1g ()I
      // 2c1: goto 2c8
      // 2c4: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c7: athrow
      // 2c8: istore 11
      // 2ca: iload 11
      // 2cc: bipush 1
      // 2cd: iload 4
      // 2cf: ifne 2f1
      // 2d2: if_icmpge 2df
      // 2d5: goto 2dc
      // 2d8: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2db: athrow
      // 2dc: bipush 1
      // 2dd: istore 11
      // 2df: aload 0
      // 2e0: getfield _zk.cms I
      // 2e3: aload 0
      // 2e4: getfield _zk.ymi I
      // 2e7: isub
      // 2e8: aload 0
      // 2e9: getfield _zk.cms I
      // 2ec: aload 0
      // 2ed: getfield _zk.ymi I
      // 2f0: isub
      // 2f1: imul
      // 2f2: i2f
      // 2f3: aload 0
      // 2f4: invokevirtual _zk.lty ()I
      // 2f7: i2f
      // 2f8: fdiv
      // 2f9: f2i
      // 2fa: istore 10
      // 2fc: iload 10
      // 2fe: bipush 32
      // 300: iload 4
      // 302: ifne 321
      // 305: if_icmpge 313
      // 308: goto 30f
      // 30b: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30e: athrow
      // 30f: bipush 32
      // 311: istore 10
      // 313: iload 10
      // 315: aload 0
      // 316: getfield _zk.cms I
      // 319: aload 0
      // 31a: getfield _zk.ymi I
      // 31d: isub
      // 31e: bipush 8
      // 320: isub
      // 321: iload 4
      // 323: ifne 342
      // 326: if_icmple 345
      // 329: goto 330
      // 32c: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32f: athrow
      // 330: aload 0
      // 331: getfield _zk.cms I
      // 334: aload 0
      // 335: getfield _zk.ymi I
      // 338: isub
      // 339: bipush 8
      // 33b: goto 342
      // 33e: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 341: athrow
      // 342: isub
      // 343: istore 10
      // 345: aload 0
      // 346: dup
      // 347: getfield _zk.mdk F
      // 34a: aload 0
      // 34b: getfield _zk.cms I
      // 34e: aload 0
      // 34f: getfield _zk.ymi I
      // 352: isub
      // 353: iload 10
      // 355: isub
      // 356: i2f
      // 357: iload 11
      // 359: i2f
      // 35a: fdiv
      // 35b: fdiv
      // 35c: putfield _zk.mdk F
      // 35f: iload 4
      // 361: ifeq 370
      // 364: aload 0
      // 365: fconst_1
      // 366: putfield _zk.mdk F
      // 369: goto 370
      // 36c: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36f: athrow
      // 370: iload 12
      // 372: ifeq 387
      // 375: aload 0
      // 376: iload 2
      // 377: i2f
      // 378: putfield _zk._pr F
      // 37b: iload 4
      // 37d: ifeq 395
      // 380: goto 387
      // 383: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 386: athrow
      // 387: aload 0
      // 388: ldc -2.0
      // 38a: nop
      // 38b: putfield _zk._pr F
      // 38e: goto 395
      // 391: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 394: athrow
      // 395: iload 4
      // 397: ifeq 3a8
      // 39a: aload 0
      // 39b: ldc -2.0
      // 39d: nop
      // 39e: putfield _zk._pr F
      // 3a1: goto 3a8
      // 3a4: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a7: athrow
      // 3a8: iload 4
      // 3aa: ifeq 4a6
      // 3ad: aload 0
      // 3ae: getfield _zk._pr F
      // 3b1: fconst_0
      // 3b2: fcmpl
      // 3b3: goto 3ba
      // 3b6: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b9: athrow
      // 3ba: iload 4
      // 3bc: ifne 4b3
      // 3bf: iflt 4a6
      // 3c2: goto 3c9
      // 3c5: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c8: athrow
      // 3c9: aload 0
      // 3ca: dup
      // 3cb: getfield _zk.cdx F
      // 3ce: iload 2
      // 3cf: i2f
      // 3d0: aload 0
      // 3d1: getfield _zk._pr F
      // 3d4: fsub
      // 3d5: aload 0
      // 3d6: getfield _zk.mdk F
      // 3d9: fmul
      // 3da: fsub
      // 3db: putfield _zk.cdx F
      // 3de: aload 0
      // 3df: iload 2
      // 3e0: i2f
      // 3e1: putfield _zk._pr F
      // 3e4: iload 4
      // 3e6: ifeq 4a6
      // 3e9: goto 3f0
      // 3ec: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ef: athrow
      // 3f0: aload 0
      // 3f1: getfield _zk._ny Lc05;
      // 3f4: getfield c05.oxn Lmoh;
      // 3f7: getfield moh.mg8 Z
      // 3fa: ifne 495
      // 3fd: invokestatic org/lwjgl/input/Mouse.next ()Z
      // 400: iload 4
      // 402: ifne 4b3
      // 405: goto 40c
      // 408: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40b: athrow
      // 40c: iload 4
      // 40e: ifne 425
      // 411: goto 418
      // 414: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 417: athrow
      // 418: ifeq 495
      // 41b: goto 422
      // 41e: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 421: athrow
      // 422: invokestatic org/lwjgl/input/Mouse.getEventDWheel ()I
      // 425: istore 12
      // 427: iload 4
      // 429: ifne 490
      // 42c: iload 12
      // 42e: ifeq 486
      // 431: goto 438
      // 434: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 437: athrow
      // 438: iload 12
      // 43a: iload 4
      // 43c: ifne 461
      // 43f: goto 446
      // 442: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 445: athrow
      // 446: ifle 458
      // 449: goto 450
      // 44c: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44f: athrow
      // 450: bipush -1
      // 451: istore 12
      // 453: iload 4
      // 455: ifeq 473
      // 458: iload 12
      // 45a: goto 461
      // 45d: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 460: athrow
      // 461: iload 4
      // 463: ifne 471
      // 466: ifge 473
      // 469: goto 470
      // 46c: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46f: athrow
      // 470: bipush 1
      // 471: istore 12
      // 473: aload 0
      // 474: dup
      // 475: getfield _zk.cdx F
      // 478: iload 12
      // 47a: aload 0
      // 47b: getfield _zk.pu6 I
      // 47e: imul
      // 47f: bipush 2
      // 480: idiv
      // 481: i2f
      // 482: fadd
      // 483: putfield _zk.cdx F
      // 486: aload 0
      // 487: getfield _zk._ny Lc05;
      // 48a: getfield c05.u0y Lgbe;
      // 48d: invokevirtual gbe.handleMouseInput ()V
      // 490: iload 4
      // 492: ifeq 3f0
      // 495: goto 49f
      // 498: astore 12
      // 49a: aload 12
      // 49c: invokevirtual java/io/IOException.printStackTrace ()V
      // 49f: aload 0
      // 4a0: ldc -1.0
      // 4a2: nop
      // 4a3: putfield _zk._pr F
      // 4a6: aload 0
      // 4a7: invokespecial _zk.kg2 ()V
      // 4aa: sipush 2896
      // 4ad: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 4b0: sipush 2912
      // 4b3: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 4b6: invokestatic jom.yut ()Ljom;
      // 4b9: astore 12
      // 4bb: aload 12
      // 4bd: invokevirtual jom.zuq ()Lq3g;
      // 4c0: astore 13
      // 4c2: fconst_0
      // 4c3: fconst_0
      // 4c4: fconst_0
      // 4c5: fconst_0
      // 4c6: aload 0
      // 4c7: getfield _zk.ll_ I
      // 4ca: aload 0
      // 4cb: getfield _zk.ymi I
      // 4ce: aload 0
      // 4cf: getfield _zk.ll_ I
      // 4d2: aload 0
      // 4d3: getfield _zk.ymi I
      // 4d6: aload 0
      // 4d7: getfield _zk.ll_ I
      // 4da: i2f
      // 4db: aload 0
      // 4dc: getfield _zk.ymi I
      // 4df: i2f
      // 4e0: invokestatic b0t.oc3 (FFFFIIIIFF)V
      // 4e3: aload 0
      // 4e4: getfield _zk.ll_ I
      // 4e7: aload 0
      // 4e8: getfield _zk.fux I
      // 4eb: bipush 2
      // 4ec: idiv
      // 4ed: iadd
      // 4ee: aload 0
      // 4ef: invokevirtual _zk.e14 ()I
      // 4f2: bipush 2
      // 4f3: idiv
      // 4f4: isub
      // 4f5: bipush 2
      // 4f6: iadd
      // 4f7: istore 8
      // 4f9: aload 0
      // 4fa: getfield _zk.ymi I
      // 4fd: bipush 4
      // 4fe: iadd
      // 4ff: aload 0
      // 500: getfield _zk.cdx F
      // 503: f2i
      // 504: isub
      // 505: istore 9
      // 507: aload 0
      // 508: getfield _zk.we6 Z
      // 50b: iload 4
      // 50d: ifne 53d
      // 510: ifeq 52c
      // 513: goto 51a
      // 516: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 519: athrow
      // 51a: aload 0
      // 51b: iload 8
      // 51d: iload 9
      // 51f: invokestatic jom.yut ()Ljom;
      // 522: invokevirtual _zk.zot (IILjom;)V
      // 525: goto 52c
      // 528: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52b: athrow
      // 52c: aload 0
      // 52d: iload 8
      // 52f: iload 9
      // 531: iload 1
      // 532: iload 2
      // 533: invokevirtual _zk.pci (IIII)V
      // 536: sipush 2929
      // 539: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 53c: bipush 4
      // 53d: istore 14
      // 53f: aload 0
      // 540: bipush 0
      // 541: aload 0
      // 542: getfield _zk.ymi I
      // 545: sipush 255
      // 548: sipush 255
      // 54b: invokespecial _zk.vfu (IIII)V
      // 54e: aload 0
      // 54f: aload 0
      // 550: getfield _zk.cms I
      // 553: aload 0
      // 554: getfield _zk.k24 I
      // 557: sipush 255
      // 55a: sipush 255
      // 55d: invokespecial _zk.vfu (IIII)V
      // 560: sipush 3042
      // 563: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 566: sipush 770
      // 569: sipush 771
      // 56c: bipush 0
      // 56d: bipush 1
      // 56e: invokestatic gis.y03 (IIII)V
      // 571: sipush 3008
      // 574: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 577: sipush 7425
      // 57a: invokestatic org/lwjgl/opengl/GL11.glShadeModel (I)V
      // 57d: sipush 3553
      // 580: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 583: aload 13
      // 585: bipush 7
      // 587: getstatic gnl.rad Lbe7;
      // 58a: invokevirtual q3g.ezr (ILbe7;)V
      // 58d: aload 13
      // 58f: aload 0
      // 590: getfield _zk.ll_ I
      // 593: i2d
      // 594: aload 0
      // 595: getfield _zk.ymi I
      // 598: iload 14
      // 59a: iadd
      // 59b: i2d
      // 59c: dconst_0
      // 59d: invokevirtual q3g.g5o (DDD)Lq3g;
      // 5a0: dconst_0
      // 5a1: dconst_1
      // 5a2: invokevirtual q3g.h0a (DD)Lq3g;
      // 5a5: bipush 0
      // 5a6: bipush 0
      // 5a7: bipush 0
      // 5a8: bipush 0
      // 5a9: invokevirtual q3g.fje (IIII)Lq3g;
      // 5ac: invokevirtual q3g.pzw ()V
      // 5af: aload 13
      // 5b1: aload 0
      // 5b2: getfield _zk.v5s I
      // 5b5: i2d
      // 5b6: aload 0
      // 5b7: getfield _zk.ymi I
      // 5ba: iload 14
      // 5bc: iadd
      // 5bd: i2d
      // 5be: dconst_0
      // 5bf: invokevirtual q3g.g5o (DDD)Lq3g;
      // 5c2: dconst_1
      // 5c3: dconst_1
      // 5c4: invokevirtual q3g.h0a (DD)Lq3g;
      // 5c7: bipush 0
      // 5c8: bipush 0
      // 5c9: bipush 0
      // 5ca: bipush 0
      // 5cb: invokevirtual q3g.fje (IIII)Lq3g;
      // 5ce: invokevirtual q3g.pzw ()V
      // 5d1: aload 13
      // 5d3: aload 0
      // 5d4: getfield _zk.v5s I
      // 5d7: i2d
      // 5d8: aload 0
      // 5d9: getfield _zk.ymi I
      // 5dc: i2d
      // 5dd: dconst_0
      // 5de: invokevirtual q3g.g5o (DDD)Lq3g;
      // 5e1: dconst_1
      // 5e2: dconst_0
      // 5e3: invokevirtual q3g.h0a (DD)Lq3g;
      // 5e6: bipush 0
      // 5e7: bipush 0
      // 5e8: bipush 0
      // 5e9: sipush 255
      // 5ec: invokevirtual q3g.fje (IIII)Lq3g;
      // 5ef: invokevirtual q3g.pzw ()V
      // 5f2: aload 13
      // 5f4: aload 0
      // 5f5: getfield _zk.ll_ I
      // 5f8: i2d
      // 5f9: aload 0
      // 5fa: getfield _zk.ymi I
      // 5fd: i2d
      // 5fe: dconst_0
      // 5ff: invokevirtual q3g.g5o (DDD)Lq3g;
      // 602: dconst_0
      // 603: dconst_0
      // 604: invokevirtual q3g.h0a (DD)Lq3g;
      // 607: bipush 0
      // 608: bipush 0
      // 609: bipush 0
      // 60a: sipush 255
      // 60d: invokevirtual q3g.fje (IIII)Lq3g;
      // 610: invokevirtual q3g.pzw ()V
      // 613: aload 12
      // 615: invokevirtual jom.q7g ()V
      // 618: aload 13
      // 61a: bipush 7
      // 61c: getstatic gnl.rad Lbe7;
      // 61f: invokevirtual q3g.ezr (ILbe7;)V
      // 622: aload 13
      // 624: aload 0
      // 625: getfield _zk.ll_ I
      // 628: i2d
      // 629: aload 0
      // 62a: getfield _zk.cms I
      // 62d: i2d
      // 62e: dconst_0
      // 62f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 632: dconst_0
      // 633: dconst_1
      // 634: invokevirtual q3g.h0a (DD)Lq3g;
      // 637: bipush 0
      // 638: bipush 0
      // 639: bipush 0
      // 63a: sipush 255
      // 63d: invokevirtual q3g.fje (IIII)Lq3g;
      // 640: invokevirtual q3g.pzw ()V
      // 643: aload 13
      // 645: aload 0
      // 646: getfield _zk.v5s I
      // 649: i2d
      // 64a: aload 0
      // 64b: getfield _zk.cms I
      // 64e: i2d
      // 64f: dconst_0
      // 650: invokevirtual q3g.g5o (DDD)Lq3g;
      // 653: dconst_1
      // 654: dconst_1
      // 655: invokevirtual q3g.h0a (DD)Lq3g;
      // 658: bipush 0
      // 659: bipush 0
      // 65a: bipush 0
      // 65b: sipush 255
      // 65e: invokevirtual q3g.fje (IIII)Lq3g;
      // 661: invokevirtual q3g.pzw ()V
      // 664: aload 13
      // 666: aload 0
      // 667: getfield _zk.v5s I
      // 66a: i2d
      // 66b: aload 0
      // 66c: getfield _zk.cms I
      // 66f: iload 14
      // 671: isub
      // 672: i2d
      // 673: dconst_0
      // 674: invokevirtual q3g.g5o (DDD)Lq3g;
      // 677: dconst_1
      // 678: dconst_0
      // 679: invokevirtual q3g.h0a (DD)Lq3g;
      // 67c: bipush 0
      // 67d: bipush 0
      // 67e: bipush 0
      // 67f: bipush 0
      // 680: invokevirtual q3g.fje (IIII)Lq3g;
      // 683: invokevirtual q3g.pzw ()V
      // 686: aload 13
      // 688: aload 0
      // 689: getfield _zk.ll_ I
      // 68c: i2d
      // 68d: aload 0
      // 68e: getfield _zk.cms I
      // 691: iload 14
      // 693: isub
      // 694: i2d
      // 695: dconst_0
      // 696: invokevirtual q3g.g5o (DDD)Lq3g;
      // 699: dconst_0
      // 69a: dconst_0
      // 69b: invokevirtual q3g.h0a (DD)Lq3g;
      // 69e: bipush 0
      // 69f: bipush 0
      // 6a0: bipush 0
      // 6a1: bipush 0
      // 6a2: invokevirtual q3g.fje (IIII)Lq3g;
      // 6a5: invokevirtual q3g.pzw ()V
      // 6a8: aload 12
      // 6aa: invokevirtual jom.q7g ()V
      // 6ad: aload 0
      // 6ae: invokevirtual _zk.g1g ()I
      // 6b1: istore 11
      // 6b3: iload 11
      // 6b5: iload 4
      // 6b7: ifne 93b
      // 6ba: ifle 920
      // 6bd: goto 6c4
      // 6c0: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c3: athrow
      // 6c4: aload 0
      // 6c5: getfield _zk.cms I
      // 6c8: aload 0
      // 6c9: getfield _zk.ymi I
      // 6cc: isub
      // 6cd: aload 0
      // 6ce: getfield _zk.cms I
      // 6d1: aload 0
      // 6d2: getfield _zk.ymi I
      // 6d5: isub
      // 6d6: imul
      // 6d7: aload 0
      // 6d8: invokevirtual _zk.lty ()I
      // 6db: idiv
      // 6dc: istore 10
      // 6de: iload 10
      // 6e0: bipush 32
      // 6e2: iload 4
      // 6e4: ifne 703
      // 6e7: if_icmpge 6f5
      // 6ea: goto 6f1
      // 6ed: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f0: athrow
      // 6f1: bipush 32
      // 6f3: istore 10
      // 6f5: iload 10
      // 6f7: aload 0
      // 6f8: getfield _zk.cms I
      // 6fb: aload 0
      // 6fc: getfield _zk.ymi I
      // 6ff: isub
      // 700: bipush 8
      // 702: isub
      // 703: iload 4
      // 705: ifne 739
      // 708: if_icmple 720
      // 70b: goto 712
      // 70e: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 711: athrow
      // 712: aload 0
      // 713: getfield _zk.cms I
      // 716: aload 0
      // 717: getfield _zk.ymi I
      // 71a: isub
      // 71b: bipush 8
      // 71d: isub
      // 71e: istore 10
      // 720: aload 0
      // 721: getfield _zk.cdx F
      // 724: f2i
      // 725: aload 0
      // 726: getfield _zk.cms I
      // 729: aload 0
      // 72a: getfield _zk.ymi I
      // 72d: isub
      // 72e: iload 10
      // 730: isub
      // 731: imul
      // 732: iload 11
      // 734: idiv
      // 735: aload 0
      // 736: getfield _zk.ymi I
      // 739: iadd
      // 73a: istore 15
      // 73c: iload 4
      // 73e: ifne 91b
      // 741: iload 15
      // 743: aload 0
      // 744: getfield _zk.ymi I
      // 747: if_icmpge 757
      // 74a: goto 751
      // 74d: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 750: athrow
      // 751: aload 0
      // 752: getfield _zk.ymi I
      // 755: istore 15
      // 757: aload 13
      // 759: bipush 7
      // 75b: getstatic gnl.rad Lbe7;
      // 75e: invokevirtual q3g.ezr (ILbe7;)V
      // 761: aload 13
      // 763: iload 6
      // 765: i2d
      // 766: aload 0
      // 767: getfield _zk.cms I
      // 76a: i2d
      // 76b: dconst_0
      // 76c: invokevirtual q3g.g5o (DDD)Lq3g;
      // 76f: dconst_0
      // 770: dconst_1
      // 771: invokevirtual q3g.h0a (DD)Lq3g;
      // 774: bipush 0
      // 775: bipush 0
      // 776: bipush 0
      // 777: sipush 255
      // 77a: invokevirtual q3g.fje (IIII)Lq3g;
      // 77d: invokevirtual q3g.pzw ()V
      // 780: aload 13
      // 782: iload 7
      // 784: i2d
      // 785: aload 0
      // 786: getfield _zk.cms I
      // 789: i2d
      // 78a: dconst_0
      // 78b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 78e: dconst_1
      // 78f: dconst_1
      // 790: invokevirtual q3g.h0a (DD)Lq3g;
      // 793: bipush 0
      // 794: bipush 0
      // 795: bipush 0
      // 796: sipush 255
      // 799: invokevirtual q3g.fje (IIII)Lq3g;
      // 79c: invokevirtual q3g.pzw ()V
      // 79f: aload 13
      // 7a1: iload 7
      // 7a3: i2d
      // 7a4: aload 0
      // 7a5: getfield _zk.ymi I
      // 7a8: i2d
      // 7a9: dconst_0
      // 7aa: invokevirtual q3g.g5o (DDD)Lq3g;
      // 7ad: dconst_1
      // 7ae: dconst_0
      // 7af: invokevirtual q3g.h0a (DD)Lq3g;
      // 7b2: bipush 0
      // 7b3: bipush 0
      // 7b4: bipush 0
      // 7b5: sipush 255
      // 7b8: invokevirtual q3g.fje (IIII)Lq3g;
      // 7bb: invokevirtual q3g.pzw ()V
      // 7be: aload 13
      // 7c0: iload 6
      // 7c2: i2d
      // 7c3: aload 0
      // 7c4: getfield _zk.ymi I
      // 7c7: i2d
      // 7c8: dconst_0
      // 7c9: invokevirtual q3g.g5o (DDD)Lq3g;
      // 7cc: dconst_0
      // 7cd: dconst_0
      // 7ce: invokevirtual q3g.h0a (DD)Lq3g;
      // 7d1: bipush 0
      // 7d2: bipush 0
      // 7d3: bipush 0
      // 7d4: sipush 255
      // 7d7: invokevirtual q3g.fje (IIII)Lq3g;
      // 7da: invokevirtual q3g.pzw ()V
      // 7dd: aload 12
      // 7df: invokevirtual jom.q7g ()V
      // 7e2: aload 13
      // 7e4: bipush 7
      // 7e6: getstatic gnl.rad Lbe7;
      // 7e9: invokevirtual q3g.ezr (ILbe7;)V
      // 7ec: aload 13
      // 7ee: iload 6
      // 7f0: i2d
      // 7f1: iload 15
      // 7f3: iload 10
      // 7f5: iadd
      // 7f6: i2d
      // 7f7: dconst_0
      // 7f8: invokevirtual q3g.g5o (DDD)Lq3g;
      // 7fb: dconst_0
      // 7fc: dconst_1
      // 7fd: invokevirtual q3g.h0a (DD)Lq3g;
      // 800: bipush 80
      // 802: bipush 80
      // 804: bipush 80
      // 806: sipush 255
      // 809: invokevirtual q3g.fje (IIII)Lq3g;
      // 80c: invokevirtual q3g.pzw ()V
      // 80f: aload 13
      // 811: iload 7
      // 813: i2d
      // 814: iload 15
      // 816: iload 10
      // 818: iadd
      // 819: i2d
      // 81a: dconst_0
      // 81b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 81e: dconst_1
      // 81f: dconst_1
      // 820: invokevirtual q3g.h0a (DD)Lq3g;
      // 823: bipush 80
      // 825: bipush 80
      // 827: bipush 80
      // 829: sipush 255
      // 82c: invokevirtual q3g.fje (IIII)Lq3g;
      // 82f: invokevirtual q3g.pzw ()V
      // 832: aload 13
      // 834: iload 7
      // 836: i2d
      // 837: iload 15
      // 839: i2d
      // 83a: dconst_0
      // 83b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 83e: dconst_1
      // 83f: dconst_0
      // 840: invokevirtual q3g.h0a (DD)Lq3g;
      // 843: bipush 80
      // 845: bipush 80
      // 847: bipush 80
      // 849: sipush 255
      // 84c: invokevirtual q3g.fje (IIII)Lq3g;
      // 84f: invokevirtual q3g.pzw ()V
      // 852: aload 13
      // 854: iload 6
      // 856: i2d
      // 857: iload 15
      // 859: i2d
      // 85a: dconst_0
      // 85b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 85e: dconst_0
      // 85f: dconst_0
      // 860: invokevirtual q3g.h0a (DD)Lq3g;
      // 863: bipush 80
      // 865: bipush 80
      // 867: bipush 80
      // 869: sipush 255
      // 86c: invokevirtual q3g.fje (IIII)Lq3g;
      // 86f: invokevirtual q3g.pzw ()V
      // 872: aload 12
      // 874: invokevirtual jom.q7g ()V
      // 877: aload 13
      // 879: bipush 7
      // 87b: getstatic gnl.rad Lbe7;
      // 87e: invokevirtual q3g.ezr (ILbe7;)V
      // 881: aload 13
      // 883: iload 6
      // 885: i2d
      // 886: iload 15
      // 888: iload 10
      // 88a: iadd
      // 88b: bipush 1
      // 88c: isub
      // 88d: i2d
      // 88e: dconst_0
      // 88f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 892: dconst_0
      // 893: dconst_1
      // 894: invokevirtual q3g.h0a (DD)Lq3g;
      // 897: sipush 192
      // 89a: sipush 192
      // 89d: sipush 192
      // 8a0: sipush 255
      // 8a3: invokevirtual q3g.fje (IIII)Lq3g;
      // 8a6: invokevirtual q3g.pzw ()V
      // 8a9: aload 13
      // 8ab: iload 7
      // 8ad: bipush 1
      // 8ae: isub
      // 8af: i2d
      // 8b0: iload 15
      // 8b2: iload 10
      // 8b4: iadd
      // 8b5: bipush 1
      // 8b6: isub
      // 8b7: i2d
      // 8b8: dconst_0
      // 8b9: invokevirtual q3g.g5o (DDD)Lq3g;
      // 8bc: dconst_1
      // 8bd: dconst_1
      // 8be: invokevirtual q3g.h0a (DD)Lq3g;
      // 8c1: sipush 192
      // 8c4: sipush 192
      // 8c7: sipush 192
      // 8ca: sipush 255
      // 8cd: invokevirtual q3g.fje (IIII)Lq3g;
      // 8d0: invokevirtual q3g.pzw ()V
      // 8d3: aload 13
      // 8d5: iload 7
      // 8d7: bipush 1
      // 8d8: isub
      // 8d9: i2d
      // 8da: iload 15
      // 8dc: i2d
      // 8dd: dconst_0
      // 8de: invokevirtual q3g.g5o (DDD)Lq3g;
      // 8e1: dconst_1
      // 8e2: dconst_0
      // 8e3: invokevirtual q3g.h0a (DD)Lq3g;
      // 8e6: sipush 192
      // 8e9: sipush 192
      // 8ec: sipush 192
      // 8ef: sipush 255
      // 8f2: invokevirtual q3g.fje (IIII)Lq3g;
      // 8f5: invokevirtual q3g.pzw ()V
      // 8f8: aload 13
      // 8fa: iload 6
      // 8fc: i2d
      // 8fd: iload 15
      // 8ff: i2d
      // 900: dconst_0
      // 901: invokevirtual q3g.g5o (DDD)Lq3g;
      // 904: dconst_0
      // 905: dconst_0
      // 906: invokevirtual q3g.h0a (DD)Lq3g;
      // 909: sipush 192
      // 90c: sipush 192
      // 90f: sipush 192
      // 912: sipush 255
      // 915: invokevirtual q3g.fje (IIII)Lq3g;
      // 918: invokevirtual q3g.pzw ()V
      // 91b: aload 12
      // 91d: invokevirtual jom.q7g ()V
      // 920: aload 0
      // 921: iload 1
      // 922: iload 2
      // 923: invokevirtual _zk.zrl (II)V
      // 926: sipush 3553
      // 929: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 92c: sipush 7424
      // 92f: invokestatic org/lwjgl/opengl/GL11.glShadeModel (I)V
      // 932: sipush 3008
      // 935: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 938: sipush 3042
      // 93b: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 93e: return
   }

   public void zt8(boolean var1) {
      this._sv = var1;
   }

   public boolean u8l() {
      return this._sv;
   }

   public int e14() {
      return 250;
   }

   public void pci(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual _zk.osm ()I
      // 004: istore 6
      // 006: invokestatic jom.yut ()Ljom;
      // 009: astore 7
      // 00b: invokestatic t9d.c ()I
      // 00e: aload 7
      // 010: invokevirtual jom.zuq ()Lq3g;
      // 013: astore 8
      // 015: bipush 0
      // 016: istore 9
      // 018: istore 5
      // 01a: iload 9
      // 01c: iload 6
      // 01e: if_icmpge 227
      // 021: iload 2
      // 022: iload 9
      // 024: aload 0
      // 025: getfield _zk.pu6 I
      // 028: imul
      // 029: iadd
      // 02a: aload 0
      // 02b: getfield _zk.s63 I
      // 02e: iadd
      // 02f: istore 10
      // 031: aload 0
      // 032: getfield _zk.pu6 I
      // 035: bipush 4
      // 036: isub
      // 037: istore 11
      // 039: iload 5
      // 03b: ifne 222
      // 03e: iload 10
      // 040: aload 0
      // 041: getfield _zk.cms I
      // 044: if_icmpgt 21f
      // 047: goto 04e
      // 04a: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: iload 10
      // 050: iload 11
      // 052: iadd
      // 053: iload 5
      // 055: ifne 084
      // 058: goto 05f
      // 05b: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield _zk.ymi I
      // 063: if_icmplt 21f
      // 066: goto 06d
      // 069: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: aload 0
      // 06e: iload 5
      // 070: ifne 212
      // 073: goto 07a
      // 076: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 079: athrow
      // 07a: getfield _zk.czy Z
      // 07d: goto 084
      // 080: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: ifeq 211
      // 087: aload 0
      // 088: iload 9
      // 08a: iload 5
      // 08c: ifne 214
      // 08f: goto 096
      // 092: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: invokevirtual _zk.ie8 (I)Z
      // 099: ifeq 211
      // 09c: goto 0a3
      // 09f: invokestatic _zk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield _zk.ll_ I
      // 0a7: aload 0
      // 0a8: getfield _zk.fux I
      // 0ab: bipush 2
      // 0ac: idiv
      // 0ad: iadd
      // 0ae: aload 0
      // 0af: invokevirtual _zk.e14 ()I
      // 0b2: bipush 2
      // 0b3: idiv
      // 0b4: isub
      // 0b5: istore 12
      // 0b7: aload 0
      // 0b8: getfield _zk.ll_ I
      // 0bb: aload 0
      // 0bc: getfield _zk.fux I
      // 0bf: bipush 2
      // 0c0: idiv
      // 0c1: iadd
      // 0c2: aload 0
      // 0c3: invokevirtual _zk.e14 ()I
      // 0c6: bipush 2
      // 0c7: idiv
      // 0c8: iadd
      // 0c9: istore 13
      // 0cb: fconst_1
      // 0cc: fconst_1
      // 0cd: fconst_1
      // 0ce: fconst_1
      // 0cf: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 0d2: sipush 3553
      // 0d5: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 0d8: aload 8
      // 0da: bipush 7
      // 0dc: getstatic gnl.rad Lbe7;
      // 0df: invokevirtual q3g.ezr (ILbe7;)V
      // 0e2: aload 8
      // 0e4: iload 12
      // 0e6: i2d
      // 0e7: iload 10
      // 0e9: iload 11
      // 0eb: iadd
      // 0ec: bipush 2
      // 0ed: iadd
      // 0ee: i2d
      // 0ef: dconst_0
      // 0f0: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0f3: dconst_0
      // 0f4: dconst_1
      // 0f5: invokevirtual q3g.h0a (DD)Lq3g;
      // 0f8: sipush 128
      // 0fb: sipush 128
      // 0fe: sipush 128
      // 101: sipush 255
      // 104: invokevirtual q3g.fje (IIII)Lq3g;
      // 107: invokevirtual q3g.pzw ()V
      // 10a: aload 8
      // 10c: iload 13
      // 10e: i2d
      // 10f: iload 10
      // 111: iload 11
      // 113: iadd
      // 114: bipush 2
      // 115: iadd
      // 116: i2d
      // 117: dconst_0
      // 118: invokevirtual q3g.g5o (DDD)Lq3g;
      // 11b: dconst_1
      // 11c: dconst_1
      // 11d: invokevirtual q3g.h0a (DD)Lq3g;
      // 120: sipush 128
      // 123: sipush 128
      // 126: sipush 128
      // 129: sipush 255
      // 12c: invokevirtual q3g.fje (IIII)Lq3g;
      // 12f: invokevirtual q3g.pzw ()V
      // 132: aload 8
      // 134: iload 13
      // 136: i2d
      // 137: iload 10
      // 139: bipush 2
      // 13a: isub
      // 13b: i2d
      // 13c: dconst_0
      // 13d: invokevirtual q3g.g5o (DDD)Lq3g;
      // 140: dconst_1
      // 141: dconst_0
      // 142: invokevirtual q3g.h0a (DD)Lq3g;
      // 145: sipush 128
      // 148: sipush 128
      // 14b: sipush 128
      // 14e: sipush 255
      // 151: invokevirtual q3g.fje (IIII)Lq3g;
      // 154: invokevirtual q3g.pzw ()V
      // 157: aload 8
      // 159: iload 12
      // 15b: i2d
      // 15c: iload 10
      // 15e: bipush 2
      // 15f: isub
      // 160: i2d
      // 161: dconst_0
      // 162: invokevirtual q3g.g5o (DDD)Lq3g;
      // 165: dconst_0
      // 166: dconst_0
      // 167: invokevirtual q3g.h0a (DD)Lq3g;
      // 16a: sipush 128
      // 16d: sipush 128
      // 170: sipush 128
      // 173: sipush 255
      // 176: invokevirtual q3g.fje (IIII)Lq3g;
      // 179: invokevirtual q3g.pzw ()V
      // 17c: aload 8
      // 17e: iload 12
      // 180: bipush 1
      // 181: iadd
      // 182: i2d
      // 183: iload 10
      // 185: iload 11
      // 187: iadd
      // 188: bipush 1
      // 189: iadd
      // 18a: i2d
      // 18b: dconst_0
      // 18c: invokevirtual q3g.g5o (DDD)Lq3g;
      // 18f: dconst_0
      // 190: dconst_1
      // 191: invokevirtual q3g.h0a (DD)Lq3g;
      // 194: bipush 0
      // 195: bipush 0
      // 196: bipush 0
      // 197: sipush 255
      // 19a: invokevirtual q3g.fje (IIII)Lq3g;
      // 19d: invokevirtual q3g.pzw ()V
      // 1a0: aload 8
      // 1a2: iload 13
      // 1a4: bipush 1
      // 1a5: isub
      // 1a6: i2d
      // 1a7: iload 10
      // 1a9: iload 11
      // 1ab: iadd
      // 1ac: bipush 1
      // 1ad: iadd
      // 1ae: i2d
      // 1af: dconst_0
      // 1b0: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1b3: dconst_1
      // 1b4: dconst_1
      // 1b5: invokevirtual q3g.h0a (DD)Lq3g;
      // 1b8: bipush 0
      // 1b9: bipush 0
      // 1ba: bipush 0
      // 1bb: sipush 255
      // 1be: invokevirtual q3g.fje (IIII)Lq3g;
      // 1c1: invokevirtual q3g.pzw ()V
      // 1c4: aload 8
      // 1c6: iload 13
      // 1c8: bipush 1
      // 1c9: isub
      // 1ca: i2d
      // 1cb: iload 10
      // 1cd: bipush 1
      // 1ce: isub
      // 1cf: i2d
      // 1d0: dconst_0
      // 1d1: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1d4: dconst_1
      // 1d5: dconst_0
      // 1d6: invokevirtual q3g.h0a (DD)Lq3g;
      // 1d9: bipush 0
      // 1da: bipush 0
      // 1db: bipush 0
      // 1dc: sipush 255
      // 1df: invokevirtual q3g.fje (IIII)Lq3g;
      // 1e2: invokevirtual q3g.pzw ()V
      // 1e5: aload 8
      // 1e7: iload 12
      // 1e9: bipush 1
      // 1ea: iadd
      // 1eb: i2d
      // 1ec: iload 10
      // 1ee: bipush 1
      // 1ef: isub
      // 1f0: i2d
      // 1f1: dconst_0
      // 1f2: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1f5: dconst_0
      // 1f6: dconst_0
      // 1f7: invokevirtual q3g.h0a (DD)Lq3g;
      // 1fa: bipush 0
      // 1fb: bipush 0
      // 1fc: bipush 0
      // 1fd: sipush 255
      // 200: invokevirtual q3g.fje (IIII)Lq3g;
      // 203: invokevirtual q3g.pzw ()V
      // 206: aload 7
      // 208: invokevirtual jom.q7g ()V
      // 20b: sipush 3553
      // 20e: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 211: aload 0
      // 212: iload 9
      // 214: iload 1
      // 215: iload 10
      // 217: iload 11
      // 219: iload 3
      // 21a: iload 4
      // 21c: invokevirtual _zk.bct (IIIIII)V
      // 21f: iinc 9 1
      // 222: iload 5
      // 224: ifeq 01a
      // 227: return
   }

   public int w3q() {
      return this.fux / 2 + 134;
   }

   private void vfu(int var1, int var2, int var3, int var4) {
      jom var5 = jom.yut();
      q3g var6 = var5.zuq();
      this._ny.l22().anl(sum.dj4);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = 32.0F;
      var6.ezr(7, gnl.rad);
      var6.g5o((double)this.ll_, (double)var2, 0.0).h0a(0.0, (double)((float)var2 / var7)).fje(64, 64, 64, var4).pzw();
      var6.g5o((double)(this.ll_ + this.fux), (double)var2, 0.0)
         .h0a((double)((float)this.fux / var7), (double)((float)var2 / var7))
         .fje(64, 64, 64, var4)
         .pzw();
      var6.g5o((double)(this.ll_ + this.fux), (double)var1, 0.0)
         .h0a((double)((float)this.fux / var7), (double)((float)var1 / var7))
         .fje(64, 64, 64, var3)
         .pzw();
      var6.g5o((double)this.ll_, (double)var1, 0.0).h0a(0.0, (double)((float)var1 / var7)).fje(64, 64, 64, var3).pzw();
      var5.q7g();
   }

   public void c1r(int var1) {
      this.ll_ = var1;
      this.v5s = var1 + this.fux;
   }

   public int f1e() {
      return this.pu6;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
