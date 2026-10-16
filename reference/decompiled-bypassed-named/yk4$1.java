public final class yk4$1 implements Runnable {
   public final OpaquePredicate k1n;
   public final mew die;

   public yk4$1(OpaquePredicate var1, mew var2) {
      this.k1n = var1;
      this.die = var2;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield yk4$1.k1n Lt9d;
      // 04: aload 0
      // 05: getfield yk4$1.die Lmew;
      // 08: invokevirtual OpaquePredicate.pxs (Lmew;)Ltts;
      // 0b: astore 2
      // 0c: invokestatic OpaquePredicate.c ()I
      // 0f: aload 0
      // 10: getfield yk4$1.die Lmew;
      // 13: invokevirtual mew.getY ()I
      // 16: bipush 1
      // 17: isub
      // 18: istore 3
      // 19: istore 1
      // 1a: iload 3
      // 1b: iflt 8c
      // 1e: new mew
      // 21: dup
      // 22: aload 0
      // 23: getfield yk4$1.die Lmew;
      // 26: invokevirtual mew.getX ()I
      // 29: iload 3
      // 2a: aload 0
      // 2b: getfield yk4$1.die Lmew;
      // 2e: invokevirtual mew.getZ ()I
      // 31: invokespecial mew.<init> (III)V
      // 34: astore 4
      // 36: aload 2
      // 37: aload 4
      // 39: invokevirtual tts.om1 (Lmew;)Z
      // 3c: ifne 46
      // 3f: goto 8c
      // 42: invokestatic yk4$1.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: getfield yk4$1.k1n Lt9d;
      // 4a: aload 4
      // 4c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 4f: astore 5
      // 51: iload 1
      // 52: ifne 88
      // 55: aload 5
      // 57: invokeinterface zfz.r_y ()Le0x; 1
      // 5c: getstatic ox_.ayi Lyk4;
      // 5f: if_acmpne 85
      // 62: goto 69
      // 65: invokestatic yk4$1.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 0
      // 6a: getfield yk4$1.k1n Lt9d;
      // 6d: checkcast dug
      // 70: new yk4$1$1
      // 73: dup
      // 74: aload 0
      // 75: aload 4
      // 77: invokespecial yk4$1$1.<init> (Lyk4$1;Lmew;)V
      // 7a: invokevirtual dug.acd (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
      // 7d: pop
      // 7e: goto 85
      // 81: invokestatic yk4$1.a (Loov;)Loov;
      // 84: athrow
      // 85: iinc 3 -1
      // 88: iload 1
      // 89: ifeq 1a
      // 8c: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
