public class edl extends i2h {
   public int cjr;
   public int q4l;

   public edl(t9d var1) {
      super(var1);
      this.gz8 = true;
      this.yxc(2.0F, 2.0F);
      this.q4l = 5;
      this.cjr = this.z2d.nextInt(100000);
   }

   public edl(t9d var1, double var2, double var4, double var6) {
      this(var1);
      this.m6_(var2, var4, var6);
   }

   @Override
   public boolean _p9() {
      return false;
   }

   @Override
   public void tbj() {
      this.oit.kp2(8, this.q4l);
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
      // 00: aload 0
      // 01: aload 0
      // 02: getfield edl.o2v D
      // 05: putfield edl.bc1 D
      // 08: aload 0
      // 09: aload 0
      // 0a: getfield edl.kfp D
      // 0d: putfield edl.o_z D
      // 10: invokestatic t9d.c ()I
      // 13: aload 0
      // 14: aload 0
      // 15: getfield edl.vbd D
      // 18: putfield edl.a4d D
      // 1b: aload 0
      // 1c: dup
      // 1d: getfield edl.cjr I
      // 20: bipush 1
      // 21: iadd
      // 22: putfield edl.cjr I
      // 25: aload 0
      // 26: getfield edl.oit Lwl1;
      // 29: bipush 8
      // 2b: aload 0
      // 2c: getfield edl.q4l I
      // 2f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 32: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 35: aload 0
      // 36: getfield edl.o2v D
      // 39: invokestatic fe6.jqf (D)I
      // 3c: istore 2
      // 3d: istore 1
      // 3e: aload 0
      // 3f: getfield edl.kfp D
      // 42: invokestatic fe6.jqf (D)I
      // 45: istore 3
      // 46: aload 0
      // 47: getfield edl.vbd D
      // 4a: invokestatic fe6.jqf (D)I
      // 4d: istore 4
      // 4f: aload 0
      // 50: getfield edl.oay Lt9d;
      // 53: iload 1
      // 54: ifne 72
      // 57: getfield t9d.vzz Lupn;
      // 5a: instanceof aqg
      // 5d: ifeq b6
      // 60: goto 67
      // 63: invokestatic edl.a (Loov;)Loov;
      // 66: athrow
      // 67: aload 0
      // 68: getfield edl.oay Lt9d;
      // 6b: goto 72
      // 6e: invokestatic edl.a (Loov;)Loov;
      // 71: athrow
      // 72: new mew
      // 75: dup
      // 76: iload 2
      // 77: iload 3
      // 78: iload 4
      // 7a: invokespecial mew.<init> (III)V
      // 7d: iload 1
      // 7e: ifne ac
      // 81: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 84: invokeinterface zfz.r_y ()Le0x; 1
      // 89: getstatic ox_._0u Lwuo;
      // 8c: if_acmpeq b6
      // 8f: goto 96
      // 92: invokestatic edl.a (Loov;)Loov;
      // 95: athrow
      // 96: aload 0
      // 97: getfield edl.oay Lt9d;
      // 9a: new mew
      // 9d: dup
      // 9e: iload 2
      // 9f: iload 3
      // a0: iload 4
      // a2: invokespecial mew.<init> (III)V
      // a5: goto ac
      // a8: invokestatic edl.a (Loov;)Loov;
      // ab: athrow
      // ac: getstatic ox_._0u Lwuo;
      // af: invokevirtual wuo.l4i ()Lzfz;
      // b2: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // b5: pop
      // b6: return
   }

   @Override
   public void srs(bdo var1) {
   }

   @Override
   public void cjb(bdo var1) {
   }

   @Override
   public boolean mzu() {
      return true;
   }

   @Override
   public boolean m1t(ofh param1, float param2) {
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
      // 05: aload 1
      // 06: invokevirtual edl.nss (Lofh;)Z
      // 09: iload 3
      // 0a: ifeq 21
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic edl.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic edl.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield edl.ma9 Z
      // 21: iload 3
      // 22: ifeq ad
      // 25: ifne ac
      // 28: goto 2f
      // 2b: invokestatic edl.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield edl.oay Lt9d;
      // 33: getfield t9d.v0f Z
      // 36: iload 3
      // 37: ifeq ad
      // 3a: goto 41
      // 3d: invokestatic edl.a (Loov;)Loov;
      // 40: athrow
      // 41: ifne ac
      // 44: goto 4b
      // 47: invokestatic edl.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: bipush 0
      // 4d: putfield edl.q4l I
      // 50: aload 0
      // 51: getfield edl.q4l I
      // 54: iload 3
      // 55: ifeq ad
      // 58: goto 5f
      // 5b: invokestatic edl.a (Loov;)Loov;
      // 5e: athrow
      // 5f: ifgt ac
      // 62: goto 69
      // 65: invokestatic edl.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 0
      // 6a: invokevirtual edl._kl ()V
      // 6d: aload 0
      // 6e: getfield edl.oay Lt9d;
      // 71: getfield t9d.v0f Z
      // 74: iload 3
      // 75: ifeq ad
      // 78: goto 7f
      // 7b: invokestatic edl.a (Loov;)Loov;
      // 7e: athrow
      // 7f: ifne ac
      // 82: goto 89
      // 85: invokestatic edl.a (Loov;)Loov;
      // 88: athrow
      // 89: aload 0
      // 8a: getfield edl.oay Lt9d;
      // 8d: aconst_null
      // 8e: checkcast i2h
      // 91: aload 0
      // 92: getfield edl.o2v D
      // 95: aload 0
      // 96: getfield edl.kfp D
      // 99: aload 0
      // 9a: getfield edl.vbd D
      // 9d: ldc 6.0
      // 9f: nop
      // a0: bipush 1
      // a1: invokevirtual t9d.s1r (Li2h;DDDFZ)Lvu6;
      // a4: pop
      // a5: goto ac
      // a8: invokestatic edl.a (Loov;)Loov;
      // ab: athrow
      // ac: bipush 1
      // ad: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
