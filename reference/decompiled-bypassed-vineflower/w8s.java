public class w8s extends jd3 {
   public float _v3;
   public float w1t;
   public float b5b;
   public float ja3;
   public float pxd;
   public float m2u;
   public float a_w;
   public float eay;
   private float nxq;
   private float y3f;
   private float jkw;
   private float tm2;
   private float vxx;
   private float wh7;

   public w8s(t9d var1) {
      super(var1);
      this.yxc(0.95F, 0.95F);
      this.z2d.setSeed((long)(1 + this.jwu()));
      this.y3f = 1.0F / (this.z2d.nextFloat() + 1.0F) * 0.2F;
      this.r1d.tn8(0, new w8s$m6q(this));
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(10.0);
   }

   @Override
   public float c5y() {
      return this.ikl * 0.5F;
   }

   @Override
   public String _n1() {
      return null;
   }

   @Override
   public String wcg() {
      return null;
   }

   @Override
   public String ix6() {
      return null;
   }

   @Override
   public float o23() {
      return 0.4F;
   }

   @Override
   public u7m q4n() {
      return null;
   }

   @Override
   public boolean _p9() {
      return false;
   }

   @Override
   public void ir3(boolean var1, int var2) {
      int var4 = this.z2d.nextInt(3 + var2) + 1;
      int var10000 = t9d.b();
      int var5 = 0;
      int var3 = var10000;

      while (var5 < var4) {
         this.qji(new erg(xbr.nnn, 1, qvg.qn4.b9d()), 0.0F);
         var5++;
         if (var3 == 0) {
            break;
         }
      }
   }

   @Override
   public boolean mwv() {
      return this.oay.jqj(this.aaw().c2h(0.0, -0.6F, 0.0), p3y.six, this);
   }

   @Override
   public void e_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial jd3.e_a ()V
      // 004: aload 0
      // 005: aload 0
      // 006: getfield w8s._v3 F
      // 009: putfield w8s.w1t F
      // 00c: invokestatic t9d.c ()I
      // 00f: aload 0
      // 010: aload 0
      // 011: getfield w8s.b5b F
      // 014: putfield w8s.ja3 F
      // 017: aload 0
      // 018: aload 0
      // 019: getfield w8s.pxd F
      // 01c: putfield w8s.m2u F
      // 01f: aload 0
      // 020: aload 0
      // 021: getfield w8s.a_w F
      // 024: putfield w8s.eay F
      // 027: aload 0
      // 028: dup
      // 029: getfield w8s.pxd F
      // 02c: aload 0
      // 02d: getfield w8s.y3f F
      // 030: fadd
      // 031: putfield w8s.pxd F
      // 034: istore 1
      // 035: aload 0
      // 036: getfield w8s.pxd F
      // 039: f2d
      // 03a: ldc2_w 6.283185307179586
      // 03d: dcmpl
      // 03e: iload 1
      // 03f: ifne 0ce
      // 042: ifle 0ca
      // 045: goto 04c
      // 048: invokestatic w8s.b (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield w8s.oay Lt9d;
      // 050: getfield t9d.v0f Z
      // 053: iload 1
      // 054: ifne 0a3
      // 057: goto 05e
      // 05a: invokestatic w8s.b (Loov;)Loov;
      // 05d: athrow
      // 05e: ifeq 07a
      // 061: goto 068
      // 064: invokestatic w8s.b (Loov;)Loov;
      // 067: athrow
      // 068: aload 0
      // 069: ldc 6.2831855
      // 06b: nop
      // 06c: putfield w8s.pxd F
      // 06f: iload 1
      // 070: ifeq 0ca
      // 073: goto 07a
      // 076: invokestatic w8s.b (Loov;)Loov;
      // 079: athrow
      // 07a: aload 0
      // 07b: aload 0
      // 07c: getfield w8s.pxd F
      // 07f: f2d
      // 080: ldc2_w 6.283185307179586
      // 083: dsub
      // 084: d2f
      // 085: putfield w8s.pxd F
      // 088: aload 0
      // 089: iload 1
      // 08a: ifne 0c1
      // 08d: goto 094
      // 090: invokestatic w8s.b (Loov;)Loov;
      // 093: athrow
      // 094: getfield w8s.z2d Ljava/util/Random;
      // 097: bipush 10
      // 099: invokevirtual java/util/Random.nextInt (I)I
      // 09c: goto 0a3
      // 09f: invokestatic w8s.b (Loov;)Loov;
      // 0a2: athrow
      // 0a3: ifne 0c0
      // 0a6: aload 0
      // 0a7: fconst_1
      // 0a8: aload 0
      // 0a9: getfield w8s.z2d Ljava/util/Random;
      // 0ac: invokevirtual java/util/Random.nextFloat ()F
      // 0af: fconst_1
      // 0b0: fadd
      // 0b1: fdiv
      // 0b2: ldc 0.2
      // 0b4: nop
      // 0b5: fmul
      // 0b6: putfield w8s.y3f F
      // 0b9: goto 0c0
      // 0bc: invokestatic w8s.b (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: getfield w8s.oay Lt9d;
      // 0c4: aload 0
      // 0c5: bipush 19
      // 0c7: invokevirtual t9d.qyn (Li2h;B)V
      // 0ca: aload 0
      // 0cb: getfield w8s.x7a Z
      // 0ce: iload 1
      // 0cf: ifne 278
      // 0d2: ifeq 249
      // 0d5: goto 0dc
      // 0d8: invokestatic w8s.b (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: iload 1
      // 0de: ifne 171
      // 0e1: goto 0e8
      // 0e4: invokestatic w8s.b (Loov;)Loov;
      // 0e7: athrow
      // 0e8: getfield w8s.pxd F
      // 0eb: ldc 3.1415927
      // 0ed: nop
      // 0ee: fcmpg
      // 0ef: ifge 158
      // 0f2: goto 0f9
      // 0f5: invokestatic w8s.b (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: getfield w8s.pxd F
      // 0fd: ldc 3.1415927
      // 0ff: nop
      // 100: fdiv
      // 101: fstore 2
      // 102: aload 0
      // 103: fload 2
      // 104: fload 2
      // 105: fmul
      // 106: ldc 3.1415927
      // 108: nop
      // 109: fmul
      // 10a: invokestatic fe6.rtn (F)F
      // 10d: ldc 3.1415927
      // 10f: nop
      // 110: fmul
      // 111: ldc 0.25
      // 113: nop
      // 114: fmul
      // 115: iload 1
      // 116: ifne 151
      // 119: putfield w8s.a_w F
      // 11c: fload 2
      // 11d: f2d
      // 11e: ldc2_w 0.75
      // 121: dcmpl
      // 122: ifle 141
      // 125: goto 12c
      // 128: invokestatic w8s.b (Loov;)Loov;
      // 12b: athrow
      // 12c: aload 0
      // 12d: fconst_1
      // 12e: putfield w8s.nxq F
      // 131: aload 0
      // 132: fconst_1
      // 133: putfield w8s.jkw F
      // 136: iload 1
      // 137: ifeq 154
      // 13a: goto 141
      // 13d: invokestatic w8s.b (Loov;)Loov;
      // 140: athrow
      // 141: aload 0
      // 142: dup
      // 143: getfield w8s.jkw F
      // 146: ldc 0.8
      // 148: nop
      // 149: fmul
      // 14a: goto 151
      // 14d: invokestatic w8s.b (Loov;)Loov;
      // 150: athrow
      // 151: putfield w8s.jkw F
      // 154: iload 1
      // 155: ifeq 17c
      // 158: aload 0
      // 159: fconst_0
      // 15a: putfield w8s.a_w F
      // 15d: aload 0
      // 15e: dup
      // 15f: getfield w8s.nxq F
      // 162: ldc 0.9
      // 164: nop
      // 165: fmul
      // 166: putfield w8s.nxq F
      // 169: aload 0
      // 16a: goto 171
      // 16d: invokestatic w8s.b (Loov;)Loov;
      // 170: athrow
      // 171: dup
      // 172: getfield w8s.jkw F
      // 175: ldc 0.99
      // 177: nop
      // 178: fmul
      // 179: putfield w8s.jkw F
      // 17c: aload 0
      // 17d: iload 1
      // 17e: ifne 1c3
      // 181: getfield w8s.oay Lt9d;
      // 184: getfield t9d.v0f Z
      // 187: ifne 1c2
      // 18a: goto 191
      // 18d: invokestatic w8s.b (Loov;)Loov;
      // 190: athrow
      // 191: aload 0
      // 192: aload 0
      // 193: getfield w8s.tm2 F
      // 196: aload 0
      // 197: getfield w8s.nxq F
      // 19a: fmul
      // 19b: f2d
      // 19c: putfield w8s.icv D
      // 19f: aload 0
      // 1a0: aload 0
      // 1a1: getfield w8s.vxx F
      // 1a4: aload 0
      // 1a5: getfield w8s.nxq F
      // 1a8: fmul
      // 1a9: f2d
      // 1aa: putfield w8s.mop D
      // 1ad: aload 0
      // 1ae: aload 0
      // 1af: getfield w8s.wh7 F
      // 1b2: aload 0
      // 1b3: getfield w8s.nxq F
      // 1b6: fmul
      // 1b7: f2d
      // 1b8: putfield w8s.bw4 D
      // 1bb: goto 1c2
      // 1be: invokestatic w8s.b (Loov;)Loov;
      // 1c1: athrow
      // 1c2: aload 0
      // 1c3: getfield w8s.icv D
      // 1c6: aload 0
      // 1c7: getfield w8s.icv D
      // 1ca: dmul
      // 1cb: aload 0
      // 1cc: getfield w8s.bw4 D
      // 1cf: aload 0
      // 1d0: getfield w8s.bw4 D
      // 1d3: dmul
      // 1d4: dadd
      // 1d5: invokestatic fe6.dii (D)F
      // 1d8: fstore 2
      // 1d9: aload 0
      // 1da: dup
      // 1db: getfield w8s.ksw F
      // 1de: aload 0
      // 1df: getfield w8s.icv D
      // 1e2: aload 0
      // 1e3: getfield w8s.bw4 D
      // 1e6: invokestatic fe6.yr8 (DD)D
      // 1e9: d2f
      // 1ea: fneg
      // 1eb: ldc 180.0
      // 1ed: nop
      // 1ee: fmul
      // 1ef: ldc 3.1415927
      // 1f1: nop
      // 1f2: fdiv
      // 1f3: aload 0
      // 1f4: getfield w8s.ksw F
      // 1f7: fsub
      // 1f8: ldc 0.1
      // 1fa: nop
      // 1fb: fmul
      // 1fc: fadd
      // 1fd: putfield w8s.ksw F
      // 200: aload 0
      // 201: aload 0
      // 202: getfield w8s.ksw F
      // 205: putfield w8s.x5k F
      // 208: aload 0
      // 209: aload 0
      // 20a: getfield w8s.b5b F
      // 20d: f2d
      // 20e: ldc2_w 3.141592653589793
      // 211: aload 0
      // 212: getfield w8s.jkw F
      // 215: f2d
      // 216: dmul
      // 217: ldc2_w 1.5
      // 21a: dmul
      // 21b: dadd
      // 21c: d2f
      // 21d: putfield w8s.b5b F
      // 220: aload 0
      // 221: dup
      // 222: getfield w8s._v3 F
      // 225: fload 2
      // 226: f2d
      // 227: aload 0
      // 228: getfield w8s.mop D
      // 22b: invokestatic fe6.yr8 (DD)D
      // 22e: d2f
      // 22f: fneg
      // 230: ldc 180.0
      // 232: nop
      // 233: fmul
      // 234: ldc 3.1415927
      // 236: nop
      // 237: fdiv
      // 238: aload 0
      // 239: getfield w8s._v3 F
      // 23c: fsub
      // 23d: ldc 0.1
      // 23f: nop
      // 240: fmul
      // 241: fadd
      // 242: putfield w8s._v3 F
      // 245: iload 1
      // 246: ifeq 2bc
      // 249: aload 0
      // 24a: aload 0
      // 24b: getfield w8s.pxd F
      // 24e: invokestatic fe6.rtn (F)F
      // 251: invokestatic fe6.sqg (F)F
      // 254: ldc 3.1415927
      // 256: nop
      // 257: fmul
      // 258: ldc 0.25
      // 25a: nop
      // 25b: fmul
      // 25c: putfield w8s.a_w F
      // 25f: aload 0
      // 260: iload 1
      // 261: ifne 2a5
      // 264: goto 26b
      // 267: invokestatic w8s.b (Loov;)Loov;
      // 26a: athrow
      // 26b: getfield w8s.oay Lt9d;
      // 26e: getfield t9d.v0f Z
      // 271: goto 278
      // 274: invokestatic w8s.b (Loov;)Loov;
      // 277: athrow
      // 278: ifne 2a4
      // 27b: aload 0
      // 27c: dconst_0
      // 27d: putfield w8s.icv D
      // 280: aload 0
      // 281: dup
      // 282: getfield w8s.mop D
      // 285: ldc2_w 0.08
      // 288: dsub
      // 289: putfield w8s.mop D
      // 28c: aload 0
      // 28d: dup
      // 28e: getfield w8s.mop D
      // 291: ldc2_w 0.9800000190734863
      // 294: dmul
      // 295: putfield w8s.mop D
      // 298: aload 0
      // 299: dconst_0
      // 29a: putfield w8s.bw4 D
      // 29d: goto 2a4
      // 2a0: invokestatic w8s.b (Loov;)Loov;
      // 2a3: athrow
      // 2a4: aload 0
      // 2a5: aload 0
      // 2a6: getfield w8s._v3 F
      // 2a9: f2d
      // 2aa: ldc -90.0
      // 2ac: nop
      // 2ad: aload 0
      // 2ae: getfield w8s._v3 F
      // 2b1: fsub
      // 2b2: f2d
      // 2b3: ldc2_w 0.02
      // 2b6: dmul
      // 2b7: dadd
      // 2b8: d2f
      // 2b9: putfield w8s._v3 F
      // 2bc: return
   }

   @Override
   public void ge2(float var1, float var2) {
      this.vjj(this.icv, this.mop, this.bw4);
   }

   @Override
   public boolean iaw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield w8s.kfp D
      // 08: ldc2_w 45.0
      // 0b: dcmpl
      // 0c: iload 1
      // 0d: ifne 2e
      // 10: ifle 59
      // 13: goto 1a
      // 16: invokestatic w8s.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield w8s.kfp D
      // 1e: aload 0
      // 1f: getfield w8s.oay Lt9d;
      // 22: invokevirtual t9d._s3 ()I
      // 25: i2d
      // 26: dcmpg
      // 27: goto 2e
      // 2a: invokestatic w8s.b (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 1
      // 2f: ifne 47
      // 32: ifge 59
      // 35: goto 3c
      // 38: invokestatic w8s.b (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: invokespecial jd3.iaw ()Z
      // 40: goto 47
      // 43: invokestatic w8s.b (Loov;)Loov;
      // 46: athrow
      // 47: iload 1
      // 48: ifne 56
      // 4b: ifeq 59
      // 4e: goto 55
      // 51: invokestatic w8s.b (Loov;)Loov;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5a
      // 59: bipush 0
      // 5a: ireturn
   }

   @Override
   public void ptf(byte param1) {
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
      // 05: bipush 19
      // 07: if_icmpne 1a
      // 0a: aload 0
      // 0b: fconst_0
      // 0c: putfield w8s.pxd F
      // 0f: iload 2
      // 10: ifne 26
      // 13: goto 1a
      // 16: invokestatic w8s.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: iload 1
      // 1c: invokespecial jd3.ptf (B)V
      // 1f: goto 26
      // 22: invokestatic w8s.b (Loov;)Loov;
      // 25: athrow
      // 26: return
   }

   public void wpr(float var1, float var2, float var3) {
      this.tm2 = var1;
      this.vxx = var2;
      this.wh7 = var3;
   }

   public boolean yb3() {
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
      // 05: getfield w8s.tm2 F
      // 08: fconst_0
      // 09: fcmpl
      // 0a: iload 1
      // 0b: ifeq 4f
      // 0e: ifne 4e
      // 11: goto 18
      // 14: invokestatic w8s.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield w8s.vxx F
      // 1c: fconst_0
      // 1d: fcmpl
      // 1e: iload 1
      // 1f: ifeq 4f
      // 22: goto 29
      // 25: invokestatic w8s.b (Loov;)Loov;
      // 28: athrow
      // 29: ifne 4e
      // 2c: goto 33
      // 2f: invokestatic w8s.b (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: getfield w8s.wh7 F
      // 37: fconst_0
      // 38: fcmpl
      // 39: iload 1
      // 3a: ifeq 4f
      // 3d: goto 44
      // 40: invokestatic w8s.b (Loov;)Loov;
      // 43: athrow
      // 44: ifeq 52
      // 47: goto 4e
      // 4a: invokestatic w8s.b (Loov;)Loov;
      // 4d: athrow
      // 4e: bipush 1
      // 4f: goto 53
      // 52: bipush 0
      // 53: ireturn
   }

   public static boolean f5r(w8s var0) {
      return var0.x7a;
   }

   private static oov b(oov var0) {
      return var0;
   }
}
