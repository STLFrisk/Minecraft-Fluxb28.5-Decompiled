import java.util.Random;

public class ofx extends cdu {
   @Override
   public boolean v3g(OpaquePredicate param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: bipush 0
      // 06: istore 5
      // 08: iload 5
      // 0a: bipush 64
      // 0c: if_icmpge a2
      // 0f: aload 3
      // 10: aload 2
      // 11: bipush 8
      // 13: invokevirtual java/util/Random.nextInt (I)I
      // 16: aload 2
      // 17: bipush 8
      // 19: invokevirtual java/util/Random.nextInt (I)I
      // 1c: isub
      // 1d: aload 2
      // 1e: bipush 4
      // 1f: invokevirtual java/util/Random.nextInt (I)I
      // 22: aload 2
      // 23: bipush 4
      // 24: invokevirtual java/util/Random.nextInt (I)I
      // 27: isub
      // 28: aload 2
      // 29: bipush 8
      // 2b: invokevirtual java/util/Random.nextInt (I)I
      // 2e: aload 2
      // 2f: bipush 8
      // 31: invokevirtual java/util/Random.nextInt (I)I
      // 34: isub
      // 35: invokevirtual mew.ec4 (III)Lmew;
      // 38: astore 6
      // 3a: iload 4
      // 3c: ifne 9d
      // 3f: getstatic ox_.gdb Le0x;
      // 42: aload 1
      // 43: aload 6
      // 45: invokevirtual e0x.ctq (Lt9d;Lmew;)Z
      // 48: iload 4
      // 4a: ifne a3
      // 4d: goto 54
      // 50: invokestatic ofx.a (Loov;)Loov;
      // 53: athrow
      // 54: ifeq 9a
      // 57: goto 5e
      // 5a: invokestatic ofx.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 1
      // 5f: aload 6
      // 61: invokevirtual mew.eve ()Lmew;
      // 64: iload 4
      // 66: ifne 8f
      // 69: goto 70
      // 6c: invokestatic ofx.a (Loov;)Loov;
      // 6f: athrow
      // 70: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 73: invokeinterface zfz.r_y ()Le0x; 1
      // 78: getstatic ox_.l11 Lx82;
      // 7b: if_acmpne 9a
      // 7e: goto 85
      // 81: invokestatic ofx.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 1
      // 86: aload 6
      // 88: goto 8f
      // 8b: invokestatic ofx.a (Loov;)Loov;
      // 8e: athrow
      // 8f: getstatic ox_.gdb Le0x;
      // 92: invokevirtual e0x.l4i ()Lzfz;
      // 95: bipush 2
      // 96: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 99: pop
      // 9a: iinc 5 1
      // 9d: iload 4
      // 9f: ifeq 08
      // a2: bipush 1
      // a3: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
