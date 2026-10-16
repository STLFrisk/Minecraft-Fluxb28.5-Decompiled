public class vdu extends xg0 {
   public vdu(OpaquePredicate var1) {
      super(var1);
   }

   public vdu(OpaquePredicate var1, Entity var2) {
      super(var1, var2);
   }

   public vdu(OpaquePredicate var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   @Override
   public float _qq() {
      return 0.07F;
   }

   @Override
   public float t9b() {
      return 0.7F;
   }

   @Override
   public float ch3() {
      return -20.0F;
   }

   @Override
   public void _7u(akm param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield vdu.oay Lt9d;
      // 08: getfield OpaquePredicate.v0f Z
      // 0b: iload 2
      // 0c: ifeq 4c
      // 0f: ifne 90
      // 12: goto 19
      // 15: invokestatic vdu.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield vdu.oay Lt9d;
      // 1d: sipush 2002
      // 20: new mew
      // 23: dup
      // 24: aload 0
      // 25: invokespecial mew.<init> (Li2h;)V
      // 28: bipush 0
      // 29: invokevirtual OpaquePredicate.qca (ILmew;I)V
      // 2c: bipush 3
      // 2d: aload 0
      // 2e: getfield vdu.oay Lt9d;
      // 31: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 34: bipush 5
      // 35: invokevirtual java/util/Random.nextInt (I)I
      // 38: iadd
      // 39: aload 0
      // 3a: getfield vdu.oay Lt9d;
      // 3d: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 40: bipush 5
      // 41: invokevirtual java/util/Random.nextInt (I)I
      // 44: iadd
      // 45: goto 4c
      // 48: invokestatic vdu.a (Loov;)Loov;
      // 4b: athrow
      // 4c: istore 3
      // 4d: iload 3
      // 4e: ifle 8c
      // 51: iload 3
      // 52: invokestatic uno.di5 (I)I
      // 55: istore 4
      // 57: iload 3
      // 58: iload 4
      // 5a: isub
      // 5b: istore 3
      // 5c: aload 0
      // 5d: getfield vdu.oay Lt9d;
      // 60: new uno
      // 63: dup
      // 64: aload 0
      // 65: getfield vdu.oay Lt9d;
      // 68: aload 0
      // 69: getfield vdu.o2v D
      // 6c: aload 0
      // 6d: getfield vdu.kfp D
      // 70: aload 0
      // 71: getfield vdu.vbd D
      // 74: iload 4
      // 76: invokespecial uno.<init> (Lt9d;DDDI)V
      // 79: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 7c: pop
      // 7d: iload 2
      // 7e: ifeq 90
      // 81: iload 2
      // 82: ifne 4d
      // 85: goto 8c
      // 88: invokestatic vdu.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 0
      // 8d: invokevirtual vdu._kl ()V
      // 90: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
