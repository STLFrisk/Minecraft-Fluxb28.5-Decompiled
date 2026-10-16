public class pmg extends flo {
   public float wk1;

   public pmg(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 1.0F);
   }

   public pmg(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.icv *= 0.1F;
      this.mop *= 0.1F;
      this.bw4 *= 0.1F;
      this.icv += var8;
      this.mop += var10;
      this.bw4 += var12;
      this.aeh = this.li4 = this.v5a = 1.0F - (float)(Math.random() * 0.3F);
      this.ysq *= 0.75F;
      this.ysq *= var14;
      this.wk1 = this.ysq;
      this.bx4 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.bx4 = (int)((float)this.bx4 * var14);
      this.kvx = false;
   }

   @Override
   public void oss(q3g var1, EntityLivingBase var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.goc + var3) / (float)this.bx4 * 32.0F;
      var9 = fe6._f3(var9, 0.0F, 1.0F);
      this.ysq = this.wk1 * var9;
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
      // 02: getfield pmg.o2v D
      // 05: putfield pmg.bc1 D
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: aload 0
      // 0c: aload 0
      // 0d: getfield pmg.kfp D
      // 10: putfield pmg.o_z D
      // 13: istore 1
      // 14: aload 0
      // 15: aload 0
      // 16: getfield pmg.vbd D
      // 19: putfield pmg.a4d D
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield pmg.goc I
      // 21: dup_x1
      // 22: bipush 1
      // 23: iadd
      // 24: putfield pmg.goc I
      // 27: iload 1
      // 28: ifeq a6
      // 2b: aload 0
      // 2c: getfield pmg.bx4 I
      // 2f: if_icmplt 44
      // 32: goto 39
      // 35: invokestatic pmg.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual pmg._kl ()V
      // 3d: goto 44
      // 40: invokestatic pmg.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: bipush 7
      // 47: aload 0
      // 48: getfield pmg.goc I
      // 4b: bipush 8
      // 4d: imul
      // 4e: aload 0
      // 4f: getfield pmg.bx4 I
      // 52: idiv
      // 53: isub
      // 54: invokevirtual pmg.f0l (I)V
      // 57: aload 0
      // 58: dup
      // 59: getfield pmg.mop D
      // 5c: ldc2_w 0.03
      // 5f: dsub
      // 60: putfield pmg.mop D
      // 63: aload 0
      // 64: aload 0
      // 65: getfield pmg.icv D
      // 68: aload 0
      // 69: getfield pmg.mop D
      // 6c: aload 0
      // 6d: getfield pmg.bw4 D
      // 70: invokevirtual pmg.vjj (DDD)V
      // 73: aload 0
      // 74: dup
      // 75: getfield pmg.icv D
      // 78: ldc2_w 0.9900000095367432
      // 7b: dmul
      // 7c: putfield pmg.icv D
      // 7f: aload 0
      // 80: dup
      // 81: getfield pmg.mop D
      // 84: ldc2_w 0.9900000095367432
      // 87: dmul
      // 88: putfield pmg.mop D
      // 8b: aload 0
      // 8c: dup
      // 8d: getfield pmg.bw4 D
      // 90: ldc2_w 0.9900000095367432
      // 93: dmul
      // 94: putfield pmg.bw4 D
      // 97: aload 0
      // 98: iload 1
      // 99: ifeq bd
      // 9c: getfield pmg.lfk Z
      // 9f: goto a6
      // a2: invokestatic pmg.a (Loov;)Loov;
      // a5: athrow
      // a6: ifeq c8
      // a9: aload 0
      // aa: dup
      // ab: getfield pmg.icv D
      // ae: ldc2_w 0.699999988079071
      // b1: dmul
      // b2: putfield pmg.icv D
      // b5: aload 0
      // b6: goto bd
      // b9: invokestatic pmg.a (Loov;)Loov;
      // bc: athrow
      // bd: dup
      // be: getfield pmg.bw4 D
      // c1: ldc2_w 0.699999988079071
      // c4: dmul
      // c5: putfield pmg.bw4 D
      // c8: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
