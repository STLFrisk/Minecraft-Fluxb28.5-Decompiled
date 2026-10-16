public class h2d extends cjm {
   public OpaquePredicate xcc;
   public EntityPlayer w75;
   public int iep;
   public double zdz;
   public boolean pnp;
   public t_2 _z6;
   public Class f58;

   public h2d(EntityPlayer var1, Class var2, double var3, boolean var5) {
      this(var1, var3, var5);
      this.f58 = var2;
   }

   public h2d(EntityPlayer var1, double var2, boolean var4) {
      this.w75 = var1;
      this.xcc = var1.oay;
      this.zdz = var2;
      this.pnp = var4;
      this.k23(3);
   }

   @Override
   public boolean vle() {
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
      // 05: getfield h2d.w75 Llaq;
      // 08: invokevirtual EntityPlayer.q4v ()Lg_3;
      // 0b: astore 2
      // 0c: aload 2
      // 0d: iload 1
      // 0e: ifeq 22
      // 11: ifnonnull 21
      // 14: goto 1b
      // 17: invokestatic h2d.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: invokestatic h2d.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 2
      // 22: invokevirtual Entity.gzr ()Z
      // 25: iload 1
      // 26: ifeq 34
      // 29: ifne 35
      // 2c: goto 33
      // 2f: invokestatic h2d.a (Loov;)Loov;
      // 32: athrow
      // 33: bipush 0
      // 34: ireturn
      // 35: aload 0
      // 36: iload 1
      // 37: ifeq 7d
      // 3a: getfield h2d.f58 Ljava/lang/Class;
      // 3d: ifnull 6d
      // 40: goto 47
      // 43: invokestatic h2d.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 0
      // 48: iload 1
      // 49: ifeq 7d
      // 4c: goto 53
      // 4f: invokestatic h2d.a (Loov;)Loov;
      // 52: athrow
      // 53: getfield h2d.f58 Ljava/lang/Class;
      // 56: aload 2
      // 57: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 5a: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 5d: ifne 6d
      // 60: goto 67
      // 63: invokestatic h2d.a (Loov;)Loov;
      // 66: athrow
      // 67: bipush 0
      // 68: ireturn
      // 69: invokestatic h2d.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: aload 0
      // 6f: getfield h2d.w75 Llaq;
      // 72: invokevirtual EntityPlayer.zq2 ()Lp8a;
      // 75: aload 2
      // 76: invokevirtual p8a.n4j (Li2h;)Lt_2;
      // 79: putfield h2d._z6 Lt_2;
      // 7c: aload 0
      // 7d: getfield h2d._z6 Lt_2;
      // 80: ifnull 8b
      // 83: bipush 1
      // 84: goto 8c
      // 87: invokestatic h2d.a (Loov;)Loov;
      // 8a: athrow
      // 8b: bipush 0
      // 8c: ireturn
   }

   @Override
   public boolean wh3() {
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
      // 05: getfield h2d.w75 Llaq;
      // 08: invokevirtual EntityPlayer.q4v ()Lg_3;
      // 0b: astore 2
      // 0c: aload 2
      // 0d: iload 1
      // 0e: ifeq 24
      // 11: ifnonnull 23
      // 14: goto 1b
      // 17: invokestatic h2d.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: goto 89
      // 1f: invokestatic h2d.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 2
      // 24: invokevirtual Entity.gzr ()Z
      // 27: iload 1
      // 28: ifeq 4c
      // 2b: ifne 3d
      // 2e: goto 35
      // 31: invokestatic h2d.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 0
      // 36: goto 89
      // 39: invokestatic h2d.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: iload 1
      // 3f: ifeq 7b
      // 42: getfield h2d.pnp Z
      // 45: goto 4c
      // 48: invokestatic h2d.a (Loov;)Loov;
      // 4b: athrow
      // 4c: ifne 7a
      // 4f: aload 0
      // 50: getfield h2d.w75 Llaq;
      // 53: invokevirtual EntityPlayer.zq2 ()Lp8a;
      // 56: invokevirtual p8a.j07 ()Z
      // 59: iload 1
      // 5a: ifeq 77
      // 5d: goto 64
      // 60: invokestatic h2d.a (Loov;)Loov;
      // 63: athrow
      // 64: ifne 76
      // 67: goto 6e
      // 6a: invokestatic h2d.a (Loov;)Loov;
      // 6d: athrow
      // 6e: bipush 1
      // 6f: goto 89
      // 72: invokestatic h2d.a (Loov;)Loov;
      // 75: athrow
      // 76: bipush 0
      // 77: goto 89
      // 7a: aload 0
      // 7b: getfield h2d.w75 Llaq;
      // 7e: new mew
      // 81: dup
      // 82: aload 2
      // 83: invokespecial mew.<init> (Li2h;)V
      // 86: invokevirtual EntityPlayer.oon (Lmew;)Z
      // 89: ireturn
   }

   @Override
   public void mnp() {
      this.w75.zq2().sh7(this._z6, this.zdz);
      this.ioy = 0;
   }

   @Override
   public void zly() {
      this.w75.zq2().pj2();
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield h2d.w75 Llaq;
      // 004: invokevirtual EntityPlayer.q4v ()Lg_3;
      // 007: astore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: aload 0
      // 00c: getfield h2d.w75 Llaq;
      // 00f: invokevirtual EntityPlayer.ph8 ()Lknw;
      // 012: aload 2
      // 013: ldc 30.0
      // 015: nop
      // 016: ldc 30.0
      // 018: nop
      // 019: invokevirtual knw.rz3 (Li2h;FF)V
      // 01c: istore 1
      // 01d: aload 0
      // 01e: getfield h2d.w75 Llaq;
      // 021: aload 2
      // 022: getfield Entity.o2v D
      // 025: aload 2
      // 026: invokevirtual Entity.aaw ()Lnh4;
      // 029: getfield nh4.bx_ D
      // 02c: aload 2
      // 02d: getfield Entity.vbd D
      // 030: invokevirtual EntityPlayer.p53 (DDD)D
      // 033: dstore 3
      // 034: aload 0
      // 035: aload 2
      // 036: invokevirtual h2d.t5_ (Lg_3;)D
      // 039: dstore 5
      // 03b: aload 0
      // 03c: dup
      // 03d: getfield h2d.ioy I
      // 040: bipush 1
      // 041: isub
      // 042: putfield h2d.ioy I
      // 045: aload 0
      // 046: getfield h2d.pnp Z
      // 049: iload 1
      // 04a: ifeq 082
      // 04d: ifne 077
      // 050: goto 057
      // 053: invokestatic h2d.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 0
      // 058: getfield h2d.w75 Llaq;
      // 05b: invokevirtual EntityPlayer.dov ()Ld6l;
      // 05e: aload 2
      // 05f: invokevirtual d6l.ik5 (Li2h;)Z
      // 062: iload 1
      // 063: ifeq 1f4
      // 066: goto 06d
      // 069: invokestatic h2d.a (Loov;)Loov;
      // 06c: athrow
      // 06d: ifeq 1e2
      // 070: goto 077
      // 073: invokestatic h2d.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 0
      // 078: getfield h2d.ioy I
      // 07b: goto 082
      // 07e: invokestatic h2d.a (Loov;)Loov;
      // 081: athrow
      // 082: iload 1
      // 083: ifeq 1f4
      // 086: ifgt 1e2
      // 089: goto 090
      // 08c: invokestatic h2d.a (Loov;)Loov;
      // 08f: athrow
      // 090: aload 0
      // 091: getfield h2d.dui D
      // 094: dconst_0
      // 095: dcmpl
      // 096: iload 1
      // 097: ifeq 0fa
      // 09a: goto 0a1
      // 09d: invokestatic h2d.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: ifne 0e1
      // 0a4: goto 0ab
      // 0a7: invokestatic h2d.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: getfield h2d.eaq D
      // 0af: dconst_0
      // 0b0: dcmpl
      // 0b1: iload 1
      // 0b2: ifeq 0fa
      // 0b5: goto 0bc
      // 0b8: invokestatic h2d.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: ifne 0e1
      // 0bf: goto 0c6
      // 0c2: invokestatic h2d.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: getfield h2d.ws8 D
      // 0ca: dconst_0
      // 0cb: dcmpl
      // 0cc: iload 1
      // 0cd: ifeq 164
      // 0d0: goto 0d7
      // 0d3: invokestatic h2d.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: ifeq 12b
      // 0da: goto 0e1
      // 0dd: invokestatic h2d.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 2
      // 0e2: aload 0
      // 0e3: getfield h2d.dui D
      // 0e6: aload 0
      // 0e7: getfield h2d.eaq D
      // 0ea: aload 0
      // 0eb: getfield h2d.ws8 D
      // 0ee: invokevirtual Entity.p53 (DDD)D
      // 0f1: dconst_1
      // 0f2: dcmpl
      // 0f3: goto 0fa
      // 0f6: invokestatic h2d.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: iload 1
      // 0fb: ifeq 164
      // 0fe: ifge 12b
      // 101: goto 108
      // 104: invokestatic h2d.a (Loov;)Loov;
      // 107: athrow
      // 108: aload 0
      // 109: getfield h2d.w75 Llaq;
      // 10c: invokevirtual EntityPlayer.mbr ()Ljava/util/Random;
      // 10f: invokevirtual java/util/Random.nextFloat ()F
      // 112: ldc 0.05
      // 114: nop
      // 115: fcmpg
      // 116: iload 1
      // 117: ifeq 1f4
      // 11a: goto 121
      // 11d: invokestatic h2d.a (Loov;)Loov;
      // 120: athrow
      // 121: ifge 1e2
      // 124: goto 12b
      // 127: invokestatic h2d.a (Loov;)Loov;
      // 12a: athrow
      // 12b: aload 0
      // 12c: aload 2
      // 12d: getfield Entity.o2v D
      // 130: putfield h2d.dui D
      // 133: aload 0
      // 134: aload 2
      // 135: invokevirtual Entity.aaw ()Lnh4;
      // 138: getfield nh4.bx_ D
      // 13b: putfield h2d.eaq D
      // 13e: aload 0
      // 13f: aload 2
      // 140: getfield Entity.vbd D
      // 143: putfield h2d.ws8 D
      // 146: aload 0
      // 147: bipush 4
      // 148: aload 0
      // 149: getfield h2d.w75 Llaq;
      // 14c: invokevirtual EntityPlayer.mbr ()Ljava/util/Random;
      // 14f: bipush 7
      // 151: invokevirtual java/util/Random.nextInt (I)I
      // 154: iadd
      // 155: putfield h2d.ioy I
      // 158: dload 3
      // 159: ldc2_w 1024.0
      // 15c: dcmpl
      // 15d: goto 164
      // 160: invokestatic h2d.a (Loov;)Loov;
      // 163: athrow
      // 164: iload 1
      // 165: ifeq 194
      // 168: ifle 188
      // 16b: goto 172
      // 16e: invokestatic h2d.a (Loov;)Loov;
      // 171: athrow
      // 172: aload 0
      // 173: dup
      // 174: getfield h2d.ioy I
      // 177: bipush 10
      // 179: iadd
      // 17a: putfield h2d.ioy I
      // 17d: iload 1
      // 17e: ifne 1b3
      // 181: goto 188
      // 184: invokestatic h2d.a (Loov;)Loov;
      // 187: athrow
      // 188: dload 3
      // 189: ldc2_w 256.0
      // 18c: dcmpl
      // 18d: goto 194
      // 190: invokestatic h2d.a (Loov;)Loov;
      // 193: athrow
      // 194: iload 1
      // 195: ifeq 1c2
      // 198: ifle 1b3
      // 19b: goto 1a2
      // 19e: invokestatic h2d.a (Loov;)Loov;
      // 1a1: athrow
      // 1a2: aload 0
      // 1a3: dup
      // 1a4: getfield h2d.ioy I
      // 1a7: bipush 5
      // 1a8: iadd
      // 1a9: putfield h2d.ioy I
      // 1ac: goto 1b3
      // 1af: invokestatic h2d.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: getfield h2d.w75 Llaq;
      // 1b7: invokevirtual EntityPlayer.zq2 ()Lp8a;
      // 1ba: aload 2
      // 1bb: aload 0
      // 1bc: getfield h2d.zdz D
      // 1bf: invokevirtual p8a.p6m (Li2h;D)Z
      // 1c2: iload 1
      // 1c3: ifeq 1f4
      // 1c6: ifne 1e2
      // 1c9: goto 1d0
      // 1cc: invokestatic h2d.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: dup
      // 1d2: getfield h2d.ioy I
      // 1d5: bipush 15
      // 1d7: iadd
      // 1d8: putfield h2d.ioy I
      // 1db: goto 1e2
      // 1de: invokestatic h2d.a (Loov;)Loov;
      // 1e1: athrow
      // 1e2: aload 0
      // 1e3: aload 0
      // 1e4: getfield h2d.iep I
      // 1e7: bipush 1
      // 1e8: isub
      // 1e9: bipush 0
      // 1ea: invokestatic java/lang/Math.max (II)I
      // 1ed: putfield h2d.iep I
      // 1f0: dload 3
      // 1f1: dload 5
      // 1f3: dcmpg
      // 1f4: iload 1
      // 1f5: ifeq 218
      // 1f8: ifgt 254
      // 1fb: goto 202
      // 1fe: invokestatic h2d.a (Loov;)Loov;
      // 201: athrow
      // 202: aload 0
      // 203: iload 1
      // 204: ifeq 229
      // 207: goto 20e
      // 20a: invokestatic h2d.a (Loov;)Loov;
      // 20d: athrow
      // 20e: getfield h2d.iep I
      // 211: goto 218
      // 214: invokestatic h2d.a (Loov;)Loov;
      // 217: athrow
      // 218: ifgt 254
      // 21b: aload 0
      // 21c: bipush 20
      // 21e: putfield h2d.iep I
      // 221: aload 0
      // 222: goto 229
      // 225: invokestatic h2d.a (Loov;)Loov;
      // 228: athrow
      // 229: getfield h2d.w75 Llaq;
      // 22c: iload 1
      // 22d: ifeq 24f
      // 230: invokevirtual EntityPlayer.tsc ()Lerg;
      // 233: ifnull 24b
      // 236: goto 23d
      // 239: invokestatic h2d.a (Loov;)Loov;
      // 23c: athrow
      // 23d: aload 0
      // 23e: getfield h2d.w75 Llaq;
      // 241: invokevirtual EntityPlayer.hgb ()V
      // 244: goto 24b
      // 247: invokestatic h2d.a (Loov;)Loov;
      // 24a: athrow
      // 24b: aload 0
      // 24c: getfield h2d.w75 Llaq;
      // 24f: aload 2
      // 250: invokevirtual EntityPlayer._nm (Li2h;)Z
      // 253: pop
      // 254: return
   }

   public double t5_(Entity var1) {
      return (double)(this.w75.uo6 * 2.0F * this.w75.uo6 * 2.0F + var1.uo6);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
