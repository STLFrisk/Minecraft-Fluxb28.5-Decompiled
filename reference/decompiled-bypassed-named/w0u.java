public class w0u extends flo {
   public float m4h;

   private w0u(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 1.0F);
   }

   public w0u(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.icv *= 0.1F;
      this.mop *= 0.1F;
      this.bw4 *= 0.1F;
      this.icv += var8;
      this.mop += var10;
      this.bw4 += var12;
      this.aeh = this.li4 = this.v5a = (float)(Math.random() * 0.3F);
      this.ysq *= 0.75F;
      this.ysq *= var14;
      this.m4h = this.ysq;
      this.bx4 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.bx4 = (int)((float)this.bx4 * var14);
      this.kvx = false;
   }

   @Override
   public void oss(q3g var1, EntityLivingBase var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.goc + var3) / (float)this.bx4 * 32.0F;
      var9 = fe6._f3(var9, 0.0F, 1.0F);
      this.ysq = this.m4h * var9;
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
      // 02: getfield w0u.o2v D
      // 05: putfield w0u.bc1 D
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: aload 0
      // 0c: aload 0
      // 0d: getfield w0u.kfp D
      // 10: putfield w0u.o_z D
      // 13: istore 1
      // 14: aload 0
      // 15: aload 0
      // 16: getfield w0u.vbd D
      // 19: putfield w0u.a4d D
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield w0u.goc I
      // 21: dup_x1
      // 22: bipush 1
      // 23: iadd
      // 24: putfield w0u.goc I
      // 27: iload 1
      // 28: ifne 7c
      // 2b: aload 0
      // 2c: getfield w0u.bx4 I
      // 2f: if_icmplt 44
      // 32: goto 39
      // 35: invokestatic w0u.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual w0u._kl ()V
      // 3d: goto 44
      // 40: invokestatic w0u.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: bipush 7
      // 47: aload 0
      // 48: getfield w0u.goc I
      // 4b: bipush 8
      // 4d: imul
      // 4e: aload 0
      // 4f: getfield w0u.bx4 I
      // 52: idiv
      // 53: isub
      // 54: invokevirtual w0u.f0l (I)V
      // 57: aload 0
      // 58: dup
      // 59: getfield w0u.mop D
      // 5c: ldc2_w 0.004
      // 5f: dadd
      // 60: putfield w0u.mop D
      // 63: aload 0
      // 64: aload 0
      // 65: getfield w0u.icv D
      // 68: aload 0
      // 69: getfield w0u.mop D
      // 6c: aload 0
      // 6d: getfield w0u.bw4 D
      // 70: invokevirtual w0u.vjj (DDD)V
      // 73: aload 0
      // 74: getfield w0u.kfp D
      // 77: aload 0
      // 78: getfield w0u.o_z D
      // 7b: dcmpl
      // 7c: iload 1
      // 7d: ifne dc
      // 80: ifne a9
      // 83: goto 8a
      // 86: invokestatic w0u.a (Loov;)Loov;
      // 89: athrow
      // 8a: aload 0
      // 8b: dup
      // 8c: getfield w0u.icv D
      // 8f: ldc2_w 1.1
      // 92: dmul
      // 93: putfield w0u.icv D
      // 96: aload 0
      // 97: dup
      // 98: getfield w0u.bw4 D
      // 9b: ldc2_w 1.1
      // 9e: dmul
      // 9f: putfield w0u.bw4 D
      // a2: goto a9
      // a5: invokestatic w0u.a (Loov;)Loov;
      // a8: athrow
      // a9: aload 0
      // aa: dup
      // ab: getfield w0u.icv D
      // ae: ldc2_w 0.9599999785423279
      // b1: dmul
      // b2: putfield w0u.icv D
      // b5: aload 0
      // b6: dup
      // b7: getfield w0u.mop D
      // ba: ldc2_w 0.9599999785423279
      // bd: dmul
      // be: putfield w0u.mop D
      // c1: aload 0
      // c2: dup
      // c3: getfield w0u.bw4 D
      // c6: ldc2_w 0.9599999785423279
      // c9: dmul
      // ca: putfield w0u.bw4 D
      // cd: aload 0
      // ce: iload 1
      // cf: ifne f3
      // d2: getfield w0u.lfk Z
      // d5: goto dc
      // d8: invokestatic w0u.a (Loov;)Loov;
      // db: athrow
      // dc: ifeq fe
      // df: aload 0
      // e0: dup
      // e1: getfield w0u.icv D
      // e4: ldc2_w 0.699999988079071
      // e7: dmul
      // e8: putfield w0u.icv D
      // eb: aload 0
      // ec: goto f3
      // ef: invokestatic w0u.a (Loov;)Loov;
      // f2: athrow
      // f3: dup
      // f4: getfield w0u.bw4 D
      // f7: ldc2_w 0.699999988079071
      // fa: dmul
      // fb: putfield w0u.bw4 D
      // fe: return
   }

   public w0u(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12, w0u$1 var14) {
      this(var1, var2, var4, var6, var8, var10, var12);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
