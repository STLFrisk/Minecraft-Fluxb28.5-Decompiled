public class tvi {
   public static final char[] ojw = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};

   public static boolean pwq(char param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: bipush 32
      // 07: iload 1
      // 08: ifne 2a
      // 0b: if_icmplt 31
      // 0e: goto 15
      // 11: invokestatic tvi.a (Loov;)Loov;
      // 14: athrow
      // 15: iload 0
      // 16: iload 1
      // 17: ifne 2e
      // 1a: goto 21
      // 1d: invokestatic tvi.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 127
      // 23: goto 2a
      // 26: invokestatic tvi.a (Loov;)Loov;
      // 29: athrow
      // 2a: if_icmpeq 31
      // 2d: bipush 1
      // 2e: goto 32
      // 31: bipush 0
      // 32: ireturn
   }

   public static String zno(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/lang/StringBuilder
      // 03: dup
      // 04: invokespecial java/lang/StringBuilder.<init> ()V
      // 07: astore 2
      // 08: aload 0
      // 09: invokevirtual java/lang/String.toCharArray ()[C
      // 0c: astore 3
      // 0d: invokestatic OpaquePredicate.c ()I
      // 10: aload 3
      // 11: arraylength
      // 12: istore 4
      // 14: bipush 0
      // 15: istore 5
      // 17: istore 1
      // 18: iload 5
      // 1a: iload 4
      // 1c: if_icmpge 4d
      // 1f: aload 3
      // 20: iload 5
      // 22: caload
      // 23: istore 6
      // 25: iload 1
      // 26: ifne 49
      // 29: iload 6
      // 2b: invokestatic tvi.pwq (C)Z
      // 2e: ifeq 46
      // 31: goto 38
      // 34: invokestatic tvi.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 2
      // 39: iload 6
      // 3b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 3e: pop
      // 3f: goto 46
      // 42: invokestatic tvi.a (Loov;)Loov;
      // 45: athrow
      // 46: iinc 5 1
      // 49: iload 1
      // 4a: ifeq 18
      // 4d: aload 2
      // 4e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 51: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
