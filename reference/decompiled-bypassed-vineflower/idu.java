public class idu extends cjm {
   public idu(osf var1) {
      this.rxo = var1;
      this.k23(3);
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
      // 05: getfield idu.rxo Losf;
      // 08: getfield osf.oay Lt9d;
      // 0b: invokevirtual t9d.m40 ()Z
      // 0e: iload 1
      // 0f: ifne 3a
      // 12: ifne 22
      // 15: goto 1c
      // 18: invokestatic idu.a (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: ireturn
      // 1e: invokestatic idu.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: iload 1
      // 24: ifne 6f
      // 27: getfield idu.rxo Losf;
      // 2a: invokevirtual osf.mbr ()Ljava/util/Random;
      // 2d: sipush 8000
      // 30: invokevirtual java/util/Random.nextInt (I)I
      // 33: goto 3a
      // 36: invokestatic idu.a (Loov;)Loov;
      // 39: athrow
      // 3a: ifeq 43
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: invokestatic idu.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: aload 0
      // 45: getfield idu.rxo Losf;
      // 48: getfield osf.oay Lt9d;
      // 4b: ldc ysf
      // 4d: nop
      // 4e: aload 0
      // 4f: getfield idu.rxo Losf;
      // 52: invokevirtual osf.aaw ()Lnh4;
      // 55: ldc2_w 6.0
      // 58: ldc2_w 2.0
      // 5b: ldc2_w 6.0
      // 5e: invokevirtual nh4.c2h (DDD)Lnh4;
      // 61: aload 0
      // 62: getfield idu.rxo Losf;
      // 65: invokevirtual t9d.xq6 (Ljava/lang/Class;Lnh4;Li2h;)Li2h;
      // 68: checkcast ysf
      // 6b: putfield idu.bep Lysf;
      // 6e: aload 0
      // 6f: getfield idu.bep Lysf;
      // 72: ifnull 7d
      // 75: bipush 1
      // 76: goto 7e
      // 79: invokestatic idu.a (Loov;)Loov;
      // 7c: athrow
      // 7d: bipush 0
      // 7e: ireturn
   }

   @Override
   public boolean wh3() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return (boolean)this.m22;
         }

         if (this.m22 > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   @Override
   public void mnp() {
      this.m22 = 400;
      this.rxo.p30(true);
   }

   @Override
   public void zly() {
      this.rxo.p30(false);
      this.bep = null;
   }

   @Override
   public void iad() {
      this.rxo.ph8().rz3(this.bep, 30.0F, 30.0F);
      this.m22--;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
