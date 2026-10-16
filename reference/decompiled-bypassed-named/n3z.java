public class n3z extends cjm {
   public n3z(k9a var1) {
      this.ozv = var1;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield n3z.ozv Lk9a;
      // 08: invokevirtual k9a.j1j ()Z
      // 0b: iload 1
      // 0c: ifne 26
      // 0f: ifne 1f
      // 12: goto 19
      // 15: invokestatic n3z.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 0
      // 1a: ireturn
      // 1b: invokestatic n3z.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield n3z.ozv Lk9a;
      // 23: invokevirtual k9a.mwv ()Z
      // 26: iload 1
      // 27: ifne 4c
      // 2a: ifeq 3a
      // 2d: goto 34
      // 30: invokestatic n3z.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
      // 36: invokestatic n3z.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield n3z.ozv Lk9a;
      // 3e: iload 1
      // 3f: ifne 5c
      // 42: getfield k9a.lfk Z
      // 45: goto 4c
      // 48: invokestatic n3z.a (Loov;)Loov;
      // 4b: athrow
      // 4c: ifne 55
      // 4f: bipush 0
      // 50: ireturn
      // 51: invokestatic n3z.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: getfield n3z.ozv Lk9a;
      // 59: invokevirtual k9a.ifk ()Lg_3;
      // 5c: astore 2
      // 5d: aload 2
      // 5e: ifnonnull 69
      // 61: bipush 1
      // 62: goto 9d
      // 65: invokestatic n3z.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 0
      // 6a: iload 1
      // 6b: ifne 9a
      // 6e: getfield n3z.ozv Lk9a;
      // 71: aload 2
      // 72: invokevirtual k9a.wxg (Li2h;)D
      // 75: ldc2_w 144.0
      // 78: dcmpg
      // 79: ifge 99
      // 7c: goto 83
      // 7f: invokestatic n3z.a (Loov;)Loov;
      // 82: athrow
      // 83: aload 2
      // 84: invokevirtual Entity.myo ()Lg_3;
      // 87: ifnull 99
      // 8a: goto 91
      // 8d: invokestatic n3z.a (Loov;)Loov;
      // 90: athrow
      // 91: bipush 0
      // 92: goto 9d
      // 95: invokestatic n3z.a (Loov;)Loov;
      // 98: athrow
      // 99: aload 0
      // 9a: getfield n3z.kq0 Z
      // 9d: ireturn
   }

   @Override
   public void mnp() {
      this.ozv.zq2().pj2();
      this.ozv.xxq(true);
   }

   @Override
   public void zly() {
      this.ozv.xxq(false);
   }

   public void spo(boolean var1) {
      this.kq0 = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
