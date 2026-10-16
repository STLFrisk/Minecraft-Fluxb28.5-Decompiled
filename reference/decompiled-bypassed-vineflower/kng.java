public class kng extends flo {
   public float hn1;

   public kng(t9d var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 2.0F);
   }

   public kng(t9d var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.icv *= 0.01F;
      this.mop *= 0.01F;
      this.bw4 *= 0.01F;
      this.mop += 0.2;
      this.aeh = fe6.rtn(((float)var8 + 0.0F) * (float) Math.PI * 2.0F) * 0.65F + 0.35F;
      this.li4 = fe6.rtn(((float)var8 + 0.33333334F) * (float) Math.PI * 2.0F) * 0.65F + 0.35F;
      this.v5a = fe6.rtn(((float)var8 + 0.6666667F) * (float) Math.PI * 2.0F) * 0.65F + 0.35F;
      this.ysq *= 0.75F;
      this.ysq *= var14;
      this.hn1 = this.ysq;
      this.bx4 = 6;
      this.kvx = false;
      this.f0l(64);
   }

   @Override
   public void oss(q3g var1, i2h var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.goc + var3) / (float)this.bx4 * 32.0F;
      var9 = fe6._f3(var9, 0.0F, 1.0F);
      this.ysq = this.hn1 * var9;
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
      // 02: getfield kng.o2v D
      // 05: putfield kng.bc1 D
      // 08: invokestatic t9d.b ()I
      // 0b: aload 0
      // 0c: aload 0
      // 0d: getfield kng.kfp D
      // 10: putfield kng.o_z D
      // 13: aload 0
      // 14: aload 0
      // 15: getfield kng.vbd D
      // 18: putfield kng.a4d D
      // 1b: istore 1
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield kng.goc I
      // 21: dup_x1
      // 22: bipush 1
      // 23: iadd
      // 24: putfield kng.goc I
      // 27: iload 1
      // 28: ifeq 5d
      // 2b: aload 0
      // 2c: getfield kng.bx4 I
      // 2f: if_icmplt 44
      // 32: goto 39
      // 35: invokestatic kng.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual kng._kl ()V
      // 3d: goto 44
      // 40: invokestatic kng.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: aload 0
      // 46: getfield kng.icv D
      // 49: aload 0
      // 4a: getfield kng.mop D
      // 4d: aload 0
      // 4e: getfield kng.bw4 D
      // 51: invokevirtual kng.vjj (DDD)V
      // 54: aload 0
      // 55: getfield kng.kfp D
      // 58: aload 0
      // 59: getfield kng.o_z D
      // 5c: dcmpl
      // 5d: iload 1
      // 5e: ifeq bd
      // 61: ifne 8a
      // 64: goto 6b
      // 67: invokestatic kng.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 0
      // 6c: dup
      // 6d: getfield kng.icv D
      // 70: ldc2_w 1.1
      // 73: dmul
      // 74: putfield kng.icv D
      // 77: aload 0
      // 78: dup
      // 79: getfield kng.bw4 D
      // 7c: ldc2_w 1.1
      // 7f: dmul
      // 80: putfield kng.bw4 D
      // 83: goto 8a
      // 86: invokestatic kng.a (Loov;)Loov;
      // 89: athrow
      // 8a: aload 0
      // 8b: dup
      // 8c: getfield kng.icv D
      // 8f: ldc2_w 0.6600000262260437
      // 92: dmul
      // 93: putfield kng.icv D
      // 96: aload 0
      // 97: dup
      // 98: getfield kng.mop D
      // 9b: ldc2_w 0.6600000262260437
      // 9e: dmul
      // 9f: putfield kng.mop D
      // a2: aload 0
      // a3: dup
      // a4: getfield kng.bw4 D
      // a7: ldc2_w 0.6600000262260437
      // aa: dmul
      // ab: putfield kng.bw4 D
      // ae: aload 0
      // af: iload 1
      // b0: ifeq d4
      // b3: getfield kng.lfk Z
      // b6: goto bd
      // b9: invokestatic kng.a (Loov;)Loov;
      // bc: athrow
      // bd: ifeq df
      // c0: aload 0
      // c1: dup
      // c2: getfield kng.icv D
      // c5: ldc2_w 0.699999988079071
      // c8: dmul
      // c9: putfield kng.icv D
      // cc: aload 0
      // cd: goto d4
      // d0: invokestatic kng.a (Loov;)Loov;
      // d3: athrow
      // d4: dup
      // d5: getfield kng.bw4 D
      // d8: ldc2_w 0.699999988079071
      // db: dmul
      // dc: putfield kng.bw4 D
      // df: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
