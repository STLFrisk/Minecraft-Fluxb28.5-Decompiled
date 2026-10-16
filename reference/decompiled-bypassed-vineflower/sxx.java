public class sxx extends flo {
   public float qbk;

   public sxx(t9d var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 1.0F);
   }

   public sxx(t9d var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.icv *= 0.1F;
      this.mop *= 0.1F;
      this.bw4 *= 0.1F;
      this.icv += var8 * 0.4;
      this.mop += var10 * 0.4;
      this.bw4 += var12 * 0.4;
      this.aeh = this.li4 = this.v5a = (float)(Math.random() * 0.3F + 0.6F);
      this.ysq *= 0.75F;
      this.ysq *= var14;
      this.qbk = this.ysq;
      this.bx4 = (int)(6.0 / (Math.random() * 0.8 + 0.6));
      this.bx4 = (int)((float)this.bx4 * var14);
      this.kvx = false;
      this.f0l(65);
      this.xx_();
   }

   @Override
   public void oss(q3g var1, i2h var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.goc + var3) / (float)this.bx4 * 32.0F;
      var9 = fe6._f3(var9, 0.0F, 1.0F);
      this.ysq = this.qbk * var9;
      super.oss(var1, var2, var3, var4, var5, var6, var7, var8);
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
      // 02: getfield sxx.o2v D
      // 05: putfield sxx.bc1 D
      // 08: invokestatic t9d.c ()I
      // 0b: aload 0
      // 0c: aload 0
      // 0d: getfield sxx.kfp D
      // 10: putfield sxx.o_z D
      // 13: istore 1
      // 14: aload 0
      // 15: aload 0
      // 16: getfield sxx.vbd D
      // 19: putfield sxx.a4d D
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield sxx.goc I
      // 21: dup_x1
      // 22: bipush 1
      // 23: iadd
      // 24: putfield sxx.goc I
      // 27: iload 1
      // 28: ifne af
      // 2b: aload 0
      // 2c: getfield sxx.bx4 I
      // 2f: if_icmplt 44
      // 32: goto 39
      // 35: invokestatic sxx.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual sxx._kl ()V
      // 3d: goto 44
      // 40: invokestatic sxx.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: aload 0
      // 46: getfield sxx.icv D
      // 49: aload 0
      // 4a: getfield sxx.mop D
      // 4d: aload 0
      // 4e: getfield sxx.bw4 D
      // 51: invokevirtual sxx.vjj (DDD)V
      // 54: aload 0
      // 55: aload 0
      // 56: getfield sxx.li4 F
      // 59: f2d
      // 5a: ldc2_w 0.96
      // 5d: dmul
      // 5e: d2f
      // 5f: putfield sxx.li4 F
      // 62: aload 0
      // 63: aload 0
      // 64: getfield sxx.v5a F
      // 67: f2d
      // 68: ldc2_w 0.9
      // 6b: dmul
      // 6c: d2f
      // 6d: putfield sxx.v5a F
      // 70: aload 0
      // 71: dup
      // 72: getfield sxx.icv D
      // 75: ldc2_w 0.699999988079071
      // 78: dmul
      // 79: putfield sxx.icv D
      // 7c: aload 0
      // 7d: dup
      // 7e: getfield sxx.mop D
      // 81: ldc2_w 0.699999988079071
      // 84: dmul
      // 85: putfield sxx.mop D
      // 88: aload 0
      // 89: dup
      // 8a: getfield sxx.bw4 D
      // 8d: ldc2_w 0.699999988079071
      // 90: dmul
      // 91: putfield sxx.bw4 D
      // 94: aload 0
      // 95: dup
      // 96: getfield sxx.mop D
      // 99: ldc2_w 0.019999999552965164
      // 9c: dsub
      // 9d: putfield sxx.mop D
      // a0: aload 0
      // a1: iload 1
      // a2: ifne c6
      // a5: getfield sxx.lfk Z
      // a8: goto af
      // ab: invokestatic sxx.a (Loov;)Loov;
      // ae: athrow
      // af: ifeq d1
      // b2: aload 0
      // b3: dup
      // b4: getfield sxx.icv D
      // b7: ldc2_w 0.699999988079071
      // ba: dmul
      // bb: putfield sxx.icv D
      // be: aload 0
      // bf: goto c6
      // c2: invokestatic sxx.a (Loov;)Loov;
      // c5: athrow
      // c6: dup
      // c7: getfield sxx.bw4 D
      // ca: ldc2_w 0.699999988079071
      // cd: dmul
      // ce: putfield sxx.bw4 D
      // d1: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
