public class mew extends wgo {
   public static final mew _9b = new mew(0, 0, 0);
   private static final int rns = 1 + fe6.xjr(fe6.l0o(30000000));
   private static final int xmb = rns;
   private static final int u4u = 64 - rns - xmb;
   private static final int boa = 0 + xmb;
   private static final int iz9 = boa + u4u;
   private static final long h3u = (1L << rns) - 1L;
   private static final long f_w = (1L << u4u) - 1L;
   private static final long dx1 = (1L << xmb) - 1L;

   public mew(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public mew(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public mew(EntityLivingBase var1) {
      this(var1.o2v, var1.kfp, var1.vbd);
   }

   public mew(fqr var1) {
      this(var1.lvi, var1.gn5, var1.bn2);
   }

   public mew(wgo var1) {
      this(var1.getX(), var1.getY(), var1.getZ());
   }

   public mew f_0(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 7
      // 05: dload 1
      // 06: dconst_0
      // 07: dcmpl
      // 08: iload 7
      // 0a: ifeq 21
      // 0d: ifne 46
      // 10: goto 17
      // 13: invokestatic mew.a (Loov;)Loov;
      // 16: athrow
      // 17: dload 3
      // 18: dconst_0
      // 19: dcmpl
      // 1a: goto 21
      // 1d: invokestatic mew.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 7
      // 23: ifeq 3b
      // 26: ifne 46
      // 29: goto 30
      // 2c: invokestatic mew.a (Loov;)Loov;
      // 2f: athrow
      // 30: dload 5
      // 32: dconst_0
      // 33: dcmpl
      // 34: goto 3b
      // 37: invokestatic mew.a (Loov;)Loov;
      // 3a: athrow
      // 3b: ifne 46
      // 3e: aload 0
      // 3f: goto 63
      // 42: invokestatic mew.a (Loov;)Loov;
      // 45: athrow
      // 46: new mew
      // 49: dup
      // 4a: aload 0
      // 4b: invokevirtual mew.getX ()I
      // 4e: i2d
      // 4f: dload 1
      // 50: dadd
      // 51: aload 0
      // 52: invokevirtual mew.getY ()I
      // 55: i2d
      // 56: dload 3
      // 57: dadd
      // 58: aload 0
      // 59: invokevirtual mew.getZ ()I
      // 5c: i2d
      // 5d: dload 5
      // 5f: dadd
      // 60: invokespecial mew.<init> (DDD)V
      // 63: areturn
   }

   public mew ec4(int var1, int var2, int var3) {
      int var4 = OpaquePredicate.c();

      int var10000;
      label41: {
         try {
            var10000 = var1;
            if (var4 != 0) {
               break label41;
            }

            if (var1 != 0) {
               return new mew(this.getX() + var1, this.getY() + var2, this.getZ() + var3);
            }
         } catch (oov var7) {
            throw a(var7);
         }

         var10000 = var2;
      }

      label33: {
         try {
            if (var4 != 0) {
               break label33;
            }

            if (var10000 != 0) {
               return new mew(this.getX() + var1, this.getY() + var2, this.getZ() + var3);
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var10000 = var3;
      }

      try {
         if (var10000 == 0) {
            return this;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return new mew(this.getX() + var1, this.getY() + var2, this.getZ() + var3);
   }

   public mew m2c(wgo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual wgo.getX ()I
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifne 45
      // 0f: goto 16
      // 12: invokestatic mew.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual wgo.getY ()I
      // 1a: goto 21
      // 1d: invokestatic mew.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifne 3a
      // 25: ifne 45
      // 28: goto 2f
      // 2b: invokestatic mew.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: invokevirtual wgo.getZ ()I
      // 33: goto 3a
      // 36: invokestatic mew.a (Loov;)Loov;
      // 39: athrow
      // 3a: ifne 45
      // 3d: aload 0
      // 3e: goto 67
      // 41: invokestatic mew.a (Loov;)Loov;
      // 44: athrow
      // 45: new mew
      // 48: dup
      // 49: aload 0
      // 4a: invokevirtual mew.getX ()I
      // 4d: aload 1
      // 4e: invokevirtual wgo.getX ()I
      // 51: iadd
      // 52: aload 0
      // 53: invokevirtual mew.getY ()I
      // 56: aload 1
      // 57: invokevirtual wgo.getY ()I
      // 5a: iadd
      // 5b: aload 0
      // 5c: invokevirtual mew.getZ ()I
      // 5f: aload 1
      // 60: invokevirtual wgo.getZ ()I
      // 63: iadd
      // 64: invokespecial mew.<init> (III)V
      // 67: areturn
   }

   public mew dg4(wgo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual wgo.getX ()I
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifne 45
      // 0f: goto 16
      // 12: invokestatic mew.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual wgo.getY ()I
      // 1a: goto 21
      // 1d: invokestatic mew.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifne 3a
      // 25: ifne 45
      // 28: goto 2f
      // 2b: invokestatic mew.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: invokevirtual wgo.getZ ()I
      // 33: goto 3a
      // 36: invokestatic mew.a (Loov;)Loov;
      // 39: athrow
      // 3a: ifne 45
      // 3d: aload 0
      // 3e: goto 67
      // 41: invokestatic mew.a (Loov;)Loov;
      // 44: athrow
      // 45: new mew
      // 48: dup
      // 49: aload 0
      // 4a: invokevirtual mew.getX ()I
      // 4d: aload 1
      // 4e: invokevirtual wgo.getX ()I
      // 51: isub
      // 52: aload 0
      // 53: invokevirtual mew.getY ()I
      // 56: aload 1
      // 57: invokevirtual wgo.getY ()I
      // 5a: isub
      // 5b: aload 0
      // 5c: invokevirtual mew.getZ ()I
      // 5f: aload 1
      // 60: invokevirtual wgo.getZ ()I
      // 63: isub
      // 64: invokespecial mew.<init> (III)V
      // 67: areturn
   }

   public mew nuv() {
      return this.z89(1);
   }

   public mew z89(int var1) {
      return this.offset(vt2.rf3, var1);
   }

   public mew eve() {
      return this.rb6(1);
   }

   public mew rb6(int var1) {
      return this.offset(vt2.m3r, var1);
   }

   public mew idu() {
      return this.pzc(1);
   }

   public mew pzc(int var1) {
      return this.offset(vt2.z9q, var1);
   }

   public mew z6x() {
      return this.wfo(1);
   }

   public mew wfo(int var1) {
      return this.offset(vt2.mxp, var1);
   }

   public mew y8e() {
      return this.g52(1);
   }

   public mew g52(int var1) {
      return this.offset(vt2.te4, var1);
   }

   public mew o_8() {
      return this.b20(1);
   }

   public mew b20(int var1) {
      return this.offset(vt2.zk4, var1);
   }

   public mew offset(vt2 var1) {
      return this.offset(var1, 1);
   }

   public mew offset(vt2 var1, int var2) {
      try {
         if (var2 == 0) {
            return this;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return new mew(this.getX() + var1.n67() * var2, this.getY() + var1.g5t() * var2, this.getZ() + var1.ozy() * var2);
   }

   public mew ufc(wgo var1) {
      return new mew(
         this.getY() * var1.getZ() - this.getZ() * var1.getY(),
         this.getZ() * var1.getX() - this.getX() * var1.getZ(),
         this.getX() * var1.getY() - this.getY() * var1.getX()
      );
   }

   public long _d2() {
      return ((long)this.getX() & h3u) << iz9 | ((long)this.getY() & f_w) << boa | ((long)this.getZ() & dx1) << 0;
   }

   public static mew s4d(long var0) {
      int var2 = (int)(var0 << 64 - iz9 - rns >> 64 - rns);
      int var3 = (int)(var0 << 64 - boa - u4u >> 64 - u4u);
      int var4 = (int)(var0 << 64 - xmb >> 64 - xmb);
      return new mew(var2, var3, var4);
   }

   public static Iterable kil(mew var0, mew var1) {
      mew var2 = new mew(Math.min(var0.getX(), var1.getX()), Math.min(var0.getY(), var1.getY()), Math.min(var0.getZ(), var1.getZ()));
      mew var3 = new mew(Math.max(var0.getX(), var1.getX()), Math.max(var0.getY(), var1.getY()), Math.max(var0.getZ(), var1.getZ()));
      return new mew$1(var2, var3);
   }

   public static Iterable getAllInBoxMutable(mew var0, mew var1) {
      mew var2 = new mew(Math.min(var0.getX(), var1.getX()), Math.min(var0.getY(), var1.getY()), Math.min(var0.getZ(), var1.getZ()));
      mew var3 = new mew(Math.max(var0.getX(), var1.getX()), Math.max(var0.getY(), var1.getY()), Math.max(var0.getZ(), var1.getZ()));
      return new mew$2(var2, var3);
   }

   @Override
   public wgo ufc(wgo var1) {
      return this.ufc(var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
