public class epq extends cjm {
   public yqv y2h;
   public g_3 sca;
   public float l8r;

   public epq(yqv var1, float var2) {
      this.y2h = var1;
      this.l8r = var2;
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: aload 0
      // 06: getfield epq.y2h Lyqv;
      // 09: invokevirtual yqv.q4v ()Lg_3;
      // 0c: putfield epq.sca Lg_3;
      // 0f: aload 0
      // 10: iload 1
      // 11: ifne 28
      // 14: getfield epq.sca Lg_3;
      // 17: ifnonnull 27
      // 1a: goto 21
      // 1d: invokestatic epq.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 0
      // 22: ireturn
      // 23: invokestatic epq.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield epq.y2h Lyqv;
      // 2b: aload 0
      // 2c: getfield epq.sca Lg_3;
      // 2f: invokevirtual yqv.wxg (Li2h;)D
      // 32: dstore 2
      // 33: dload 2
      // 34: ldc2_w 4.0
      // 37: dcmpl
      // 38: iload 1
      // 39: ifne 52
      // 3c: iflt a9
      // 3f: goto 46
      // 42: invokestatic epq.a (Loov;)Loov;
      // 45: athrow
      // 46: dload 2
      // 47: ldc2_w 16.0
      // 4a: dcmpg
      // 4b: goto 52
      // 4e: invokestatic epq.a (Loov;)Loov;
      // 51: athrow
      // 52: iload 1
      // 53: ifne 6e
      // 56: ifgt a9
      // 59: goto 60
      // 5c: invokestatic epq.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield epq.y2h Lyqv;
      // 64: getfield yqv.lfk Z
      // 67: goto 6e
      // 6a: invokestatic epq.a (Loov;)Loov;
      // 6d: athrow
      // 6e: iload 1
      // 6f: ifne 8f
      // 72: ifne 84
      // 75: goto 7c
      // 78: invokestatic epq.a (Loov;)Loov;
      // 7b: athrow
      // 7c: bipush 0
      // 7d: goto aa
      // 80: invokestatic epq.a (Loov;)Loov;
      // 83: athrow
      // 84: aload 0
      // 85: getfield epq.y2h Lyqv;
      // 88: invokevirtual yqv.mbr ()Ljava/util/Random;
      // 8b: bipush 5
      // 8c: invokevirtual java/util/Random.nextInt (I)I
      // 8f: iload 1
      // 90: ifne a6
      // 93: ifne a5
      // 96: goto 9d
      // 99: invokestatic epq.a (Loov;)Loov;
      // 9c: athrow
      // 9d: bipush 1
      // 9e: goto aa
      // a1: invokestatic epq.a (Loov;)Loov;
      // a4: athrow
      // a5: bipush 0
      // a6: goto aa
      // a9: bipush 0
      // aa: ireturn
   }

   @Override
   public boolean wh3() {
      int var1 = t9d.c();

      try {
         if (var1 != 0) {
            return this.y2h.lfk;
         }

         if (!this.y2h.lfk) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public void mnp() {
      double var1 = this.sca.o2v - this.y2h.o2v;
      double var3 = this.sca.vbd - this.y2h.vbd;
      float var5 = fe6.dii(var1 * var1 + var3 * var3);
      this.y2h.icv = this.y2h.icv + var1 / (double)var5 * 0.5 * 0.8F + this.y2h.icv * 0.2F;
      this.y2h.bw4 = this.y2h.bw4 + var3 / (double)var5 * 0.5 * 0.8F + this.y2h.bw4 * 0.2F;
      this.y2h.mop = (double)this.l8r;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
