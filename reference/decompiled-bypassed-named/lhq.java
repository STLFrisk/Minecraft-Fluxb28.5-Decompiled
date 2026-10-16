public abstract class lhq extends cjm {
   public int i1n;
   public mew yiq = mew._9b;

   public lhq(EntityPlayer var1, double var2, int var4) {
      this.a16 = var1;
      this.vs0 = var2;
      this.z_x = var4;
      this.k23(5);
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
      // 05: getfield lhq.i1n I
      // 08: iload 1
      // 09: ifeq 3f
      // 0c: ifle 26
      // 0f: goto 16
      // 12: invokestatic lhq.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: dup
      // 18: getfield lhq.i1n I
      // 1b: bipush 1
      // 1c: isub
      // 1d: putfield lhq.i1n I
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic lhq.b (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: sipush 200
      // 2a: aload 0
      // 2b: getfield lhq.a16 Llaq;
      // 2e: invokevirtual EntityPlayer.mbr ()Ljava/util/Random;
      // 31: sipush 200
      // 34: invokevirtual java/util/Random.nextInt (I)I
      // 37: iadd
      // 38: putfield lhq.i1n I
      // 3b: aload 0
      // 3c: invokespecial lhq.ub6 ()Z
      // 3f: ireturn
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
      // 05: getfield lhq.m8h I
      // 08: aload 0
      // 09: getfield lhq.au3 I
      // 0c: ineg
      // 0d: iload 1
      // 0e: ifeq 34
      // 11: if_icmplt 5f
      // 14: goto 1b
      // 17: invokestatic lhq.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield lhq.m8h I
      // 1f: iload 1
      // 20: ifeq 4d
      // 23: goto 2a
      // 26: invokestatic lhq.b (Loov;)Loov;
      // 29: athrow
      // 2a: sipush 1200
      // 2d: goto 34
      // 30: invokestatic lhq.b (Loov;)Loov;
      // 33: athrow
      // 34: if_icmpgt 5f
      // 37: aload 0
      // 38: aload 0
      // 39: getfield lhq.a16 Llaq;
      // 3c: getfield EntityPlayer.oay Lt9d;
      // 3f: aload 0
      // 40: getfield lhq.yiq Lmew;
      // 43: invokevirtual lhq.c0f (Lt9d;Lmew;)Z
      // 46: goto 4d
      // 49: invokestatic lhq.b (Loov;)Loov;
      // 4c: athrow
      // 4d: iload 1
      // 4e: ifeq 5c
      // 51: ifeq 5f
      // 54: goto 5b
      // 57: invokestatic lhq.b (Loov;)Loov;
      // 5a: athrow
      // 5b: bipush 1
      // 5c: goto 60
      // 5f: bipush 0
      // 60: ireturn
   }

   @Override
   public void mnp() {
      this.a16.zq2().ni_((double)((float)this.yiq.getX()) + 0.5, (double)(this.yiq.getY() + 1), (double)((float)this.yiq.getZ()) + 0.5, this.vs0);
      this.m8h = 0;
      this.au3 = this.a16.mbr().nextInt(this.a16.mbr().nextInt(1200) + 1200) + 1200;
   }

   @Override
   public void zly() {
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 98
      // 09: getfield lhq.a16 Llaq;
      // 0c: aload 0
      // 0d: getfield lhq.yiq Lmew;
      // 10: invokevirtual mew.nuv ()Lmew;
      // 13: invokevirtual EntityPlayer.x4g (Lmew;)D
      // 16: dconst_1
      // 17: dcmpl
      // 18: ifle 8b
      // 1b: goto 22
      // 1e: invokestatic lhq.b (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: bipush 0
      // 24: putfield lhq.bgr Z
      // 27: aload 0
      // 28: dup
      // 29: getfield lhq.m8h I
      // 2c: bipush 1
      // 2d: iadd
      // 2e: putfield lhq.m8h I
      // 31: aload 0
      // 32: getfield lhq.m8h I
      // 35: bipush 40
      // 37: irem
      // 38: iload 1
      // 39: ifeq 86
      // 3c: goto 43
      // 3f: invokestatic lhq.b (Loov;)Loov;
      // 42: athrow
      // 43: ifne a1
      // 46: goto 4d
      // 49: invokestatic lhq.b (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield lhq.a16 Llaq;
      // 51: invokevirtual EntityPlayer.zq2 ()Lp8a;
      // 54: aload 0
      // 55: getfield lhq.yiq Lmew;
      // 58: invokevirtual mew.getX ()I
      // 5b: i2f
      // 5c: f2d
      // 5d: ldc2_w 0.5
      // 60: dadd
      // 61: aload 0
      // 62: getfield lhq.yiq Lmew;
      // 65: invokevirtual mew.getY ()I
      // 68: bipush 1
      // 69: iadd
      // 6a: i2d
      // 6b: aload 0
      // 6c: getfield lhq.yiq Lmew;
      // 6f: invokevirtual mew.getZ ()I
      // 72: i2f
      // 73: f2d
      // 74: ldc2_w 0.5
      // 77: dadd
      // 78: aload 0
      // 79: getfield lhq.vs0 D
      // 7c: invokevirtual p8a.ni_ (DDDD)Z
      // 7f: goto 86
      // 82: invokestatic lhq.b (Loov;)Loov;
      // 85: athrow
      // 86: pop
      // 87: iload 1
      // 88: ifne a1
      // 8b: aload 0
      // 8c: bipush 1
      // 8d: putfield lhq.bgr Z
      // 90: aload 0
      // 91: goto 98
      // 94: invokestatic lhq.b (Loov;)Loov;
      // 97: athrow
      // 98: dup
      // 99: getfield lhq.m8h I
      // 9c: bipush 1
      // 9d: isub
      // 9e: putfield lhq.m8h I
      // a1: return
   }

   public boolean p38() {
      return this.bgr;
   }

   private boolean ub6() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield lhq.z_x I
      // 004: istore 2
      // 005: invokestatic OpaquePredicate.c ()I
      // 008: bipush 1
      // 009: istore 3
      // 00a: istore 1
      // 00b: new mew
      // 00e: dup
      // 00f: aload 0
      // 010: getfield lhq.a16 Llaq;
      // 013: invokespecial mew.<init> (Li2h;)V
      // 016: astore 4
      // 018: bipush 0
      // 019: istore 5
      // 01b: iload 5
      // 01d: bipush 1
      // 01e: if_icmpgt 14d
      // 021: bipush 0
      // 022: iload 1
      // 023: ifne 14e
      // 026: istore 6
      // 028: iload 6
      // 02a: iload 2
      // 02b: if_icmpge 129
      // 02e: bipush 0
      // 02f: iload 1
      // 030: ifne 12b
      // 033: istore 7
      // 035: iload 7
      // 037: iload 6
      // 039: if_icmpgt 122
      // 03c: iload 7
      // 03e: iload 6
      // 040: iload 1
      // 041: ifne 02b
      // 044: iload 1
      // 045: ifne 069
      // 048: if_icmpge 071
      // 04b: goto 052
      // 04e: invokestatic lhq.b (Loov;)Loov;
      // 051: athrow
      // 052: iload 7
      // 054: iload 1
      // 055: ifne 06e
      // 058: goto 05f
      // 05b: invokestatic lhq.b (Loov;)Loov;
      // 05e: athrow
      // 05f: iload 6
      // 061: ineg
      // 062: goto 069
      // 065: invokestatic lhq.b (Loov;)Loov;
      // 068: athrow
      // 069: if_icmple 071
      // 06c: iload 6
      // 06e: goto 072
      // 071: bipush 0
      // 072: istore 8
      // 074: iload 8
      // 076: iload 6
      // 078: if_icmpgt 0fe
      // 07b: aload 4
      // 07d: iload 7
      // 07f: iload 5
      // 081: bipush 1
      // 082: isub
      // 083: iload 8
      // 085: invokevirtual mew.ec4 (III)Lmew;
      // 088: astore 9
      // 08a: aload 0
      // 08b: getfield lhq.a16 Llaq;
      // 08e: aload 9
      // 090: invokevirtual EntityPlayer.oon (Lmew;)Z
      // 093: iload 1
      // 094: ifne 100
      // 097: iload 1
      // 098: ifne 0dc
      // 09b: goto 0a2
      // 09e: invokestatic lhq.b (Loov;)Loov;
      // 0a1: athrow
      // 0a2: ifeq 0da
      // 0a5: goto 0ac
      // 0a8: invokestatic lhq.b (Loov;)Loov;
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: aload 0
      // 0ae: getfield lhq.a16 Llaq;
      // 0b1: getfield EntityPlayer.oay Lt9d;
      // 0b4: aload 9
      // 0b6: invokevirtual lhq.c0f (Lt9d;Lmew;)Z
      // 0b9: iload 1
      // 0ba: ifne 0dc
      // 0bd: goto 0c4
      // 0c0: invokestatic lhq.b (Loov;)Loov;
      // 0c3: athrow
      // 0c4: ifeq 0da
      // 0c7: goto 0ce
      // 0ca: invokestatic lhq.b (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: aload 9
      // 0d1: putfield lhq.yiq Lmew;
      // 0d4: bipush 1
      // 0d5: ireturn
      // 0d6: invokestatic lhq.b (Loov;)Loov;
      // 0d9: athrow
      // 0da: iload 8
      // 0dc: iload 1
      // 0dd: ifne 0f5
      // 0e0: ifle 0f4
      // 0e3: goto 0ea
      // 0e6: invokestatic lhq.b (Loov;)Loov;
      // 0e9: athrow
      // 0ea: iload 8
      // 0ec: ineg
      // 0ed: goto 0f8
      // 0f0: invokestatic lhq.b (Loov;)Loov;
      // 0f3: athrow
      // 0f4: bipush 1
      // 0f5: iload 8
      // 0f7: isub
      // 0f8: istore 8
      // 0fa: iload 1
      // 0fb: ifeq 074
      // 0fe: iload 7
      // 100: iload 1
      // 101: ifne 119
      // 104: ifle 118
      // 107: goto 10e
      // 10a: invokestatic lhq.b (Loov;)Loov;
      // 10d: athrow
      // 10e: iload 7
      // 110: ineg
      // 111: goto 11c
      // 114: invokestatic lhq.b (Loov;)Loov;
      // 117: athrow
      // 118: bipush 1
      // 119: iload 7
      // 11b: isub
      // 11c: istore 7
      // 11e: iload 1
      // 11f: ifeq 035
      // 122: iinc 6 1
      // 125: iload 1
      // 126: ifeq 028
      // 129: iload 5
      // 12b: iload 1
      // 12c: ifne 144
      // 12f: ifle 143
      // 132: goto 139
      // 135: invokestatic lhq.b (Loov;)Loov;
      // 138: athrow
      // 139: iload 5
      // 13b: ineg
      // 13c: goto 147
      // 13f: invokestatic lhq.b (Loov;)Loov;
      // 142: athrow
      // 143: bipush 1
      // 144: iload 5
      // 146: isub
      // 147: istore 5
      // 149: iload 1
      // 14a: ifeq 01b
      // 14d: bipush 0
      // 14e: ireturn
   }

   public abstract boolean c0f(OpaquePredicate var1, mew var2);

   private static oov b(oov var0) {
      return var0;
   }
}
