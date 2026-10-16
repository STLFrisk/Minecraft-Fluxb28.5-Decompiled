public class umi extends ql4 {
   @Override
   public u7m buz() {
      return xbr.dzx;
   }

   @Override
   public u7m fae() {
      return xbr.dzx;
   }

   @Override
   public void ix7(OpaquePredicate param1, mew param2, zfz param3, float param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: fload 4
      // 0b: iload 5
      // 0d: invokespecial ql4.ix7 (Lt9d;Lmew;Lzfz;FI)V
      // 10: aload 1
      // 11: getfield OpaquePredicate.v0f Z
      // 14: iload 6
      // 16: ifne 39
      // 19: ifne 78
      // 1c: goto 23
      // 1f: invokestatic umi.c (Loov;)Loov;
      // 22: athrow
      // 23: aload 3
      // 24: getstatic umi.ul6 L_ku;
      // 27: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2c: checkcast java/lang/Integer
      // 2f: invokevirtual java/lang/Integer.intValue ()I
      // 32: goto 39
      // 35: invokestatic umi.c (Loov;)Loov;
      // 38: athrow
      // 39: iload 6
      // 3b: ifne 66
      // 3e: bipush 7
      // 40: if_icmplt 78
      // 43: goto 4a
      // 46: invokestatic umi.c (Loov;)Loov;
      // 49: athrow
      // 4a: aload 1
      // 4b: iload 6
      // 4d: ifne 6a
      // 50: goto 57
      // 53: invokestatic umi.c (Loov;)Loov;
      // 56: athrow
      // 57: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 5a: bipush 50
      // 5c: invokevirtual java/util/Random.nextInt (I)I
      // 5f: goto 66
      // 62: invokestatic umi.c (Loov;)Loov;
      // 65: athrow
      // 66: ifne 78
      // 69: aload 1
      // 6a: aload 2
      // 6b: new erg
      // 6e: dup
      // 6f: getstatic xbr.yru Lu7m;
      // 72: invokespecial erg.<init> (Lu7m;)V
      // 75: invokestatic umi.ymu (Lt9d;Lmew;Lerg;)V
      // 78: return
   }

   private static oov c(oov var0) {
      return var0;
   }
}
