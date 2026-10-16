public class ak2 extends wel {
   public k9a k5w;
   public Entity isn;

   public ak2(k9a var1) {
      super(var1, false);
      this.k5w = var1;
      this.k23(1);
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
      // 05: getfield ak2.k5w Lk9a;
      // 08: iload 1
      // 09: ifne 26
      // 0c: invokevirtual k9a.j1j ()Z
      // 0f: ifne 1f
      // 12: goto 19
      // 15: invokestatic ak2.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 0
      // 1a: ireturn
      // 1b: invokestatic ak2.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield ak2.k5w Lk9a;
      // 23: invokevirtual k9a.ifk ()Lg_3;
      // 26: astore 2
      // 27: aload 2
      // 28: iload 1
      // 29: ifne 45
      // 2c: ifnonnull 3c
      // 2f: goto 36
      // 32: invokestatic ak2.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 0
      // 37: ireturn
      // 38: invokestatic ak2.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 2
      // 3e: invokevirtual Entity.myo ()Lg_3;
      // 41: putfield ak2.isn Lg_3;
      // 44: aload 2
      // 45: invokevirtual Entity.ii0 ()I
      // 48: istore 3
      // 49: iload 3
      // 4a: iload 1
      // 4b: ifne 6c
      // 4e: aload 0
      // 4f: getfield ak2.g5v I
      // 52: if_icmpeq 9f
      // 55: goto 5c
      // 58: invokestatic ak2.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 0
      // 5d: aload 0
      // 5e: getfield ak2.isn Lg_3;
      // 61: bipush 0
      // 62: invokevirtual ak2.paa (Lg_3;Z)Z
      // 65: goto 6c
      // 68: invokestatic ak2.a (Loov;)Loov;
      // 6b: athrow
      // 6c: iload 1
      // 6d: ifne 8d
      // 70: ifeq 9f
      // 73: goto 7a
      // 76: invokestatic ak2.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield ak2.k5w Lk9a;
      // 7e: aload 0
      // 7f: getfield ak2.isn Lg_3;
      // 82: aload 2
      // 83: invokevirtual k9a.ssb (Lg_3;Lg_3;)Z
      // 86: goto 8d
      // 89: invokestatic ak2.a (Loov;)Loov;
      // 8c: athrow
      // 8d: iload 1
      // 8e: ifne 9c
      // 91: ifeq 9f
      // 94: goto 9b
      // 97: invokestatic ak2.a (Loov;)Loov;
      // 9a: athrow
      // 9b: bipush 1
      // 9c: goto a0
      // 9f: bipush 0
      // a0: ireturn
   }

   @Override
   public void mnp() {
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
      // 05: getfield ak2.pf7 Llaq;
      // 08: aload 0
      // 09: getfield ak2.isn Lg_3;
      // 0c: invokevirtual EntityPlayer.ux8 (Lg_3;)V
      // 0f: aload 0
      // 10: getfield ak2.k5w Lk9a;
      // 13: invokevirtual k9a.ifk ()Lg_3;
      // 16: astore 2
      // 17: iload 1
      // 18: ifne 39
      // 1b: aload 2
      // 1c: ifnull 35
      // 1f: goto 26
      // 22: invokestatic ak2.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: aload 2
      // 28: invokevirtual Entity.ii0 ()I
      // 2b: putfield ak2.g5v I
      // 2e: goto 35
      // 31: invokestatic ak2.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: invokespecial wel.mnp ()V
      // 39: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
