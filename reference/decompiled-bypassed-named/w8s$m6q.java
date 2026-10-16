public class w8s$m6q extends cjm {
   private EntityMob k4t;

   public w8s$m6q(EntityMob var1) {
      this.k4t = var1;
   }

   @Override
   public boolean vle() {
      return true;
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield w8s$m6q.k4t Lw8s;
      // 08: invokevirtual EntityMob.c67 ()I
      // 0b: istore 2
      // 0c: iload 2
      // 0d: iload 1
      // 0e: ifeq 50
      // 11: bipush 100
      // 13: if_icmple 32
      // 16: goto 1d
      // 19: invokestatic w8s$m6q.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield w8s$m6q.k4t Lw8s;
      // 21: fconst_0
      // 22: fconst_0
      // 23: fconst_0
      // 24: invokevirtual EntityMob.wpr (FFF)V
      // 27: iload 1
      // 28: ifne d8
      // 2b: goto 32
      // 2e: invokestatic w8s$m6q.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield w8s$m6q.k4t Lw8s;
      // 36: invokevirtual EntityMob.mbr ()Ljava/util/Random;
      // 39: iload 1
      // 3a: ifeq 99
      // 3d: goto 44
      // 40: invokestatic w8s$m6q.a (Loov;)Loov;
      // 43: athrow
      // 44: bipush 50
      // 46: invokevirtual java/util/Random.nextInt (I)I
      // 49: goto 50
      // 4c: invokestatic w8s$m6q.a (Loov;)Loov;
      // 4f: athrow
      // 50: ifeq 8b
      // 53: aload 0
      // 54: getfield w8s$m6q.k4t Lw8s;
      // 57: iload 1
      // 58: ifeq 96
      // 5b: goto 62
      // 5e: invokestatic w8s$m6q.a (Loov;)Loov;
      // 61: athrow
      // 62: invokestatic EntityMob.f5r (Lw8s;)Z
      // 65: ifeq 8b
      // 68: goto 6f
      // 6b: invokestatic w8s$m6q.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 0
      // 70: getfield w8s$m6q.k4t Lw8s;
      // 73: iload 1
      // 74: ifeq 96
      // 77: goto 7e
      // 7a: invokestatic w8s$m6q.a (Loov;)Loov;
      // 7d: athrow
      // 7e: invokevirtual EntityMob.yb3 ()Z
      // 81: ifne d8
      // 84: goto 8b
      // 87: invokestatic w8s$m6q.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 0
      // 8c: getfield w8s$m6q.k4t Lw8s;
      // 8f: goto 96
      // 92: invokestatic w8s$m6q.a (Loov;)Loov;
      // 95: athrow
      // 96: invokevirtual EntityMob.mbr ()Ljava/util/Random;
      // 99: invokevirtual java/util/Random.nextFloat ()F
      // 9c: ldc 3.1415927
      // 9e: nop
      // 9f: fmul
      // a0: fconst_2
      // a1: fmul
      // a2: fstore 3
      // a3: fload 3
      // a4: invokestatic fe6.ssk (F)F
      // a7: ldc 0.2
      // a9: nop
      // aa: fmul
      // ab: fstore 4
      // ad: ldc -0.1
      // af: nop
      // b0: aload 0
      // b1: getfield w8s$m6q.k4t Lw8s;
      // b4: invokevirtual EntityMob.mbr ()Ljava/util/Random;
      // b7: invokevirtual java/util/Random.nextFloat ()F
      // ba: ldc 0.2
      // bc: nop
      // bd: fmul
      // be: fadd
      // bf: fstore 5
      // c1: fload 3
      // c2: invokestatic fe6.rtn (F)F
      // c5: ldc 0.2
      // c7: nop
      // c8: fmul
      // c9: fstore 6
      // cb: aload 0
      // cc: getfield w8s$m6q.k4t Lw8s;
      // cf: fload 4
      // d1: fload 5
      // d3: fload 6
      // d5: invokevirtual EntityMob.wpr (FFF)V
      // d8: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
