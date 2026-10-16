public class ml4 extends flo {
   private float i82;

   public ml4(OpaquePredicate var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.icv *= 0.8F;
      this.mop *= 0.8F;
      this.bw4 *= 0.8F;
      this.mop = (double)(this.z2d.nextFloat() * 0.4F + 0.05F);
      this.aeh = this.li4 = this.v5a = 1.0F;
      this.ysq = this.ysq * (this.z2d.nextFloat() * 2.0F + 0.2F);
      this.i82 = this.ysq;
      this.bx4 = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      this.kvx = false;
      this.f0l(49);
   }

   @Override
   public int azk(float var1) {
      float var2 = ((float)this.goc + var1) / (float)this.bx4;
      var2 = fe6._f3(var2, 0.0F, 1.0F);
      int var3 = super.azk(var1);
      short var4 = 240;
      int var5 = var3 >> 16 & 0xFF;
      return var4 | var5 << 16;
   }

   @Override
   public float xeu(float var1) {
      return 1.0F;
   }

   @Override
   public void oss(q3g var1, EntityLivingBase var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.goc + var3) / (float)this.bx4;
      this.ysq = this.i82 * (1.0F - var9 * var9);
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
      // 000: aload 0
      // 001: aload 0
      // 002: getfield ml4.o2v D
      // 005: putfield ml4.bc1 D
      // 008: aload 0
      // 009: aload 0
      // 00a: getfield ml4.kfp D
      // 00d: putfield ml4.o_z D
      // 010: invokestatic OpaquePredicate.c ()I
      // 013: aload 0
      // 014: aload 0
      // 015: getfield ml4.vbd D
      // 018: putfield ml4.a4d D
      // 01b: istore 1
      // 01c: aload 0
      // 01d: dup
      // 01e: getfield ml4.goc I
      // 021: dup_x1
      // 022: bipush 1
      // 023: iadd
      // 024: putfield ml4.goc I
      // 027: iload 1
      // 028: ifne 048
      // 02b: aload 0
      // 02c: getfield ml4.bx4 I
      // 02f: if_icmplt 044
      // 032: goto 039
      // 035: invokestatic ml4.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 0
      // 03a: invokevirtual ml4._kl ()V
      // 03d: goto 044
      // 040: invokestatic ml4.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 0
      // 045: getfield ml4.goc I
      // 048: i2f
      // 049: aload 0
      // 04a: getfield ml4.bx4 I
      // 04d: i2f
      // 04e: fdiv
      // 04f: fstore 2
      // 050: aload 0
      // 051: getfield ml4.z2d Ljava/util/Random;
      // 054: invokevirtual java/util/Random.nextFloat ()F
      // 057: fload 2
      // 058: fcmpl
      // 059: iload 1
      // 05a: ifne 0e2
      // 05d: ifle 093
      // 060: goto 067
      // 063: invokestatic ml4.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 0
      // 068: getfield ml4.oay Lt9d;
      // 06b: getstatic w_0.bac Lw_0;
      // 06e: aload 0
      // 06f: getfield ml4.o2v D
      // 072: aload 0
      // 073: getfield ml4.kfp D
      // 076: aload 0
      // 077: getfield ml4.vbd D
      // 07a: aload 0
      // 07b: getfield ml4.icv D
      // 07e: aload 0
      // 07f: getfield ml4.mop D
      // 082: aload 0
      // 083: getfield ml4.bw4 D
      // 086: bipush 0
      // 087: newarray 10
      // 089: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 08c: goto 093
      // 08f: invokestatic ml4.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 0
      // 094: dup
      // 095: getfield ml4.mop D
      // 098: ldc2_w 0.03
      // 09b: dsub
      // 09c: putfield ml4.mop D
      // 09f: aload 0
      // 0a0: aload 0
      // 0a1: getfield ml4.icv D
      // 0a4: aload 0
      // 0a5: getfield ml4.mop D
      // 0a8: aload 0
      // 0a9: getfield ml4.bw4 D
      // 0ac: invokevirtual ml4.vjj (DDD)V
      // 0af: aload 0
      // 0b0: dup
      // 0b1: getfield ml4.icv D
      // 0b4: ldc2_w 0.9990000128746033
      // 0b7: dmul
      // 0b8: putfield ml4.icv D
      // 0bb: aload 0
      // 0bc: dup
      // 0bd: getfield ml4.mop D
      // 0c0: ldc2_w 0.9990000128746033
      // 0c3: dmul
      // 0c4: putfield ml4.mop D
      // 0c7: aload 0
      // 0c8: dup
      // 0c9: getfield ml4.bw4 D
      // 0cc: ldc2_w 0.9990000128746033
      // 0cf: dmul
      // 0d0: putfield ml4.bw4 D
      // 0d3: aload 0
      // 0d4: iload 1
      // 0d5: ifne 0f9
      // 0d8: getfield ml4.lfk Z
      // 0db: goto 0e2
      // 0de: invokestatic ml4.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: ifeq 104
      // 0e5: aload 0
      // 0e6: dup
      // 0e7: getfield ml4.icv D
      // 0ea: ldc2_w 0.699999988079071
      // 0ed: dmul
      // 0ee: putfield ml4.icv D
      // 0f1: aload 0
      // 0f2: goto 0f9
      // 0f5: invokestatic ml4.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: dup
      // 0fa: getfield ml4.bw4 D
      // 0fd: ldc2_w 0.699999988079071
      // 100: dmul
      // 101: putfield ml4.bw4 D
      // 104: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
