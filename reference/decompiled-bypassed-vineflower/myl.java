public class myl extends flo {
   public myl(t9d var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      float var14 = this.z2d.nextFloat() * 0.1F + 0.2F;
      this.aeh = var14;
      this.li4 = var14;
      this.v5a = var14;
      this.f0l(0);
      this.yxc(0.02F, 0.02F);
      this.ysq = this.ysq * (this.z2d.nextFloat() * 0.6F + 0.5F);
      this.icv *= 0.02F;
      this.mop *= 0.02F;
      this.bw4 *= 0.02F;
      this.bx4 = (int)(20.0 / (Math.random() * 0.8 + 0.2));
      this.kvx = true;
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
      // 02: getfield myl.o2v D
      // 05: putfield myl.bc1 D
      // 08: invokestatic t9d.c ()I
      // 0b: aload 0
      // 0c: aload 0
      // 0d: getfield myl.kfp D
      // 10: putfield myl.o_z D
      // 13: aload 0
      // 14: aload 0
      // 15: getfield myl.vbd D
      // 18: putfield myl.a4d D
      // 1b: aload 0
      // 1c: aload 0
      // 1d: getfield myl.icv D
      // 20: aload 0
      // 21: getfield myl.mop D
      // 24: aload 0
      // 25: getfield myl.bw4 D
      // 28: invokevirtual myl.vjj (DDD)V
      // 2b: aload 0
      // 2c: dup
      // 2d: getfield myl.icv D
      // 30: ldc2_w 0.99
      // 33: dmul
      // 34: putfield myl.icv D
      // 37: istore 1
      // 38: aload 0
      // 39: dup
      // 3a: getfield myl.mop D
      // 3d: ldc2_w 0.99
      // 40: dmul
      // 41: putfield myl.mop D
      // 44: aload 0
      // 45: dup
      // 46: getfield myl.bw4 D
      // 49: ldc2_w 0.99
      // 4c: dmul
      // 4d: putfield myl.bw4 D
      // 50: aload 0
      // 51: iload 1
      // 52: ifne 71
      // 55: dup
      // 56: getfield myl.bx4 I
      // 59: dup_x1
      // 5a: bipush 1
      // 5b: isub
      // 5c: putfield myl.bx4 I
      // 5f: ifgt 74
      // 62: goto 69
      // 65: invokestatic myl.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 0
      // 6a: goto 71
      // 6d: invokestatic myl.a (Loov;)Loov;
      // 70: athrow
      // 71: invokevirtual myl._kl ()V
      // 74: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
