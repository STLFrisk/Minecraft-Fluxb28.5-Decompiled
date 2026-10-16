import java.util.Random;

public class _um extends cdu {
   @Override
   public boolean v3g(OpaquePredicate param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: bipush 0
      // 06: istore 5
      // 08: iload 5
      // 0a: bipush 10
      // 0c: if_icmpge c7
      // 0f: aload 3
      // 10: invokevirtual mew.getX ()I
      // 13: aload 2
      // 14: bipush 8
      // 16: invokevirtual java/util/Random.nextInt (I)I
      // 19: iadd
      // 1a: aload 2
      // 1b: bipush 8
      // 1d: invokevirtual java/util/Random.nextInt (I)I
      // 20: isub
      // 21: istore 6
      // 23: aload 3
      // 24: invokevirtual mew.getY ()I
      // 27: aload 2
      // 28: bipush 4
      // 29: invokevirtual java/util/Random.nextInt (I)I
      // 2c: iadd
      // 2d: aload 2
      // 2e: bipush 4
      // 2f: invokevirtual java/util/Random.nextInt (I)I
      // 32: isub
      // 33: istore 7
      // 35: aload 3
      // 36: invokevirtual mew.getZ ()I
      // 39: aload 2
      // 3a: bipush 8
      // 3c: invokevirtual java/util/Random.nextInt (I)I
      // 3f: iadd
      // 40: aload 2
      // 41: bipush 8
      // 43: invokevirtual java/util/Random.nextInt (I)I
      // 46: isub
      // 47: istore 8
      // 49: iload 4
      // 4b: ifeq c2
      // 4e: aload 1
      // 4f: new mew
      // 52: dup
      // 53: iload 6
      // 55: iload 7
      // 57: iload 8
      // 59: invokespecial mew.<init> (III)V
      // 5c: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 5f: iload 4
      // 61: ifeq c8
      // 64: goto 6b
      // 67: invokestatic _um.a (Loov;)Loov;
      // 6a: athrow
      // 6b: ifeq bf
      // 6e: goto 75
      // 71: invokestatic _um.a (Loov;)Loov;
      // 74: athrow
      // 75: getstatic ox_.r67 Le0x;
      // 78: aload 1
      // 79: new mew
      // 7c: dup
      // 7d: iload 6
      // 7f: iload 7
      // 81: iload 8
      // 83: invokespecial mew.<init> (III)V
      // 86: invokevirtual e0x.ctq (Lt9d;Lmew;)Z
      // 89: iload 4
      // 8b: ifeq be
      // 8e: goto 95
      // 91: invokestatic _um.a (Loov;)Loov;
      // 94: athrow
      // 95: ifeq bf
      // 98: goto 9f
      // 9b: invokestatic _um.a (Loov;)Loov;
      // 9e: athrow
      // 9f: aload 1
      // a0: new mew
      // a3: dup
      // a4: iload 6
      // a6: iload 7
      // a8: iload 8
      // aa: invokespecial mew.<init> (III)V
      // ad: getstatic ox_.r67 Le0x;
      // b0: invokevirtual e0x.l4i ()Lzfz;
      // b3: bipush 2
      // b4: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // b7: goto be
      // ba: invokestatic _um.a (Loov;)Loov;
      // bd: athrow
      // be: pop
      // bf: iinc 5 1
      // c2: iload 4
      // c4: ifne 08
      // c7: bipush 1
      // c8: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
