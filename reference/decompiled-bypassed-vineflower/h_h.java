public class h_h extends flo {
   public float s0a;

   public h_h(t9d var1, double var2, double var4, double var6, float var8, float var9, float var10) {
      this(var1, var2, var4, var6, 1.0F, var8, var9, var10);
   }

   public h_h(t9d var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      int var10000 = t9d.c();
      this.icv *= 0.1F;
      this.mop *= 0.1F;
      this.bw4 *= 0.1F;
      int var12 = var10000;

      float var10001;
      label21: {
         label20: {
            try {
               var15 = var9;
               var10001 = 0.0F;
               if (var12 != 0) {
                  break label21;
               }

               if (var9 != 0.0F) {
                  break label20;
               }
            } catch (oov var14) {
               throw a(var14);
            }

            var9 = 1.0F;
         }

         var15 = (float)Math.random() * 0.4F;
         var10001 = 0.6F;
      }

      float var13 = var15 + var10001;
      this.aeh = ((float)(Math.random() * 0.2F) + 0.8F) * var9 * var13;
      this.li4 = ((float)(Math.random() * 0.2F) + 0.8F) * var10 * var13;
      this.v5a = ((float)(Math.random() * 0.2F) + 0.8F) * var11 * var13;
      this.ysq *= 0.75F;
      this.ysq *= var8;
      this.s0a = this.ysq;
      this.bx4 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.bx4 = (int)((float)this.bx4 * var8);
      this.kvx = false;
   }

   @Override
   public void oss(q3g var1, i2h var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.goc + var3) / (float)this.bx4 * 32.0F;
      var9 = fe6._f3(var9, 0.0F, 1.0F);
      this.ysq = this.s0a * var9;
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
      // 02: getfield h_h.o2v D
      // 05: putfield h_h.bc1 D
      // 08: aload 0
      // 09: aload 0
      // 0a: getfield h_h.kfp D
      // 0d: putfield h_h.o_z D
      // 10: invokestatic t9d.c ()I
      // 13: aload 0
      // 14: aload 0
      // 15: getfield h_h.vbd D
      // 18: putfield h_h.a4d D
      // 1b: istore 1
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield h_h.goc I
      // 21: dup_x1
      // 22: bipush 1
      // 23: iadd
      // 24: putfield h_h.goc I
      // 27: iload 1
      // 28: ifne 70
      // 2b: aload 0
      // 2c: getfield h_h.bx4 I
      // 2f: if_icmplt 44
      // 32: goto 39
      // 35: invokestatic h_h.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual h_h._kl ()V
      // 3d: goto 44
      // 40: invokestatic h_h.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: bipush 7
      // 47: aload 0
      // 48: getfield h_h.goc I
      // 4b: bipush 8
      // 4d: imul
      // 4e: aload 0
      // 4f: getfield h_h.bx4 I
      // 52: idiv
      // 53: isub
      // 54: invokevirtual h_h.f0l (I)V
      // 57: aload 0
      // 58: aload 0
      // 59: getfield h_h.icv D
      // 5c: aload 0
      // 5d: getfield h_h.mop D
      // 60: aload 0
      // 61: getfield h_h.bw4 D
      // 64: invokevirtual h_h.vjj (DDD)V
      // 67: aload 0
      // 68: getfield h_h.kfp D
      // 6b: aload 0
      // 6c: getfield h_h.o_z D
      // 6f: dcmpl
      // 70: iload 1
      // 71: ifne d0
      // 74: ifne 9d
      // 77: goto 7e
      // 7a: invokestatic h_h.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 0
      // 7f: dup
      // 80: getfield h_h.icv D
      // 83: ldc2_w 1.1
      // 86: dmul
      // 87: putfield h_h.icv D
      // 8a: aload 0
      // 8b: dup
      // 8c: getfield h_h.bw4 D
      // 8f: ldc2_w 1.1
      // 92: dmul
      // 93: putfield h_h.bw4 D
      // 96: goto 9d
      // 99: invokestatic h_h.a (Loov;)Loov;
      // 9c: athrow
      // 9d: aload 0
      // 9e: dup
      // 9f: getfield h_h.icv D
      // a2: ldc2_w 0.9599999785423279
      // a5: dmul
      // a6: putfield h_h.icv D
      // a9: aload 0
      // aa: dup
      // ab: getfield h_h.mop D
      // ae: ldc2_w 0.9599999785423279
      // b1: dmul
      // b2: putfield h_h.mop D
      // b5: aload 0
      // b6: dup
      // b7: getfield h_h.bw4 D
      // ba: ldc2_w 0.9599999785423279
      // bd: dmul
      // be: putfield h_h.bw4 D
      // c1: aload 0
      // c2: iload 1
      // c3: ifne e7
      // c6: getfield h_h.lfk Z
      // c9: goto d0
      // cc: invokestatic h_h.a (Loov;)Loov;
      // cf: athrow
      // d0: ifeq f2
      // d3: aload 0
      // d4: dup
      // d5: getfield h_h.icv D
      // d8: ldc2_w 0.699999988079071
      // db: dmul
      // dc: putfield h_h.icv D
      // df: aload 0
      // e0: goto e7
      // e3: invokestatic h_h.a (Loov;)Loov;
      // e6: athrow
      // e7: dup
      // e8: getfield h_h.bw4 D
      // eb: ldc2_w 0.699999988079071
      // ee: dmul
      // ef: putfield h_h.bw4 D
      // f2: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
