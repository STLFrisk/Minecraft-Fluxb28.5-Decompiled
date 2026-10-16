public class _xi {
   public static final char[] wu_ = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};

   public static boolean _m2(char param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: sipush 167
      // 08: iload 1
      // 09: ifne 20
      // 0c: if_icmpeq 4a
      // 0f: goto 16
      // 12: invokestatic _xi.a (Loov;)Loov;
      // 15: athrow
      // 16: iload 0
      // 17: bipush 32
      // 19: goto 20
      // 1c: invokestatic _xi.a (Loov;)Loov;
      // 1f: athrow
      // 20: iload 1
      // 21: ifne 43
      // 24: if_icmplt 4a
      // 27: goto 2e
      // 2a: invokestatic _xi.a (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 0
      // 2f: iload 1
      // 30: ifne 47
      // 33: goto 3a
      // 36: invokestatic _xi.a (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 127
      // 3c: goto 43
      // 3f: invokestatic _xi.a (Loov;)Loov;
      // 42: athrow
      // 43: if_icmpeq 4a
      // 46: bipush 1
      // 47: goto 4b
      // 4a: bipush 0
      // 4b: ireturn
   }

   public static String _dn(String param0) {
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
      // 08: invokestatic t9d.b ()I
      // 0b: aload 0
      // 0c: invokevirtual java/lang/String.toCharArray ()[C
      // 0f: astore 3
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
      // 26: ifeq 49
      // 29: iload 6
      // 2b: invokestatic _xi._m2 (C)Z
      // 2e: ifeq 46
      // 31: goto 38
      // 34: invokestatic _xi.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 2
      // 39: iload 6
      // 3b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 3e: pop
      // 3f: goto 46
      // 42: invokestatic _xi.a (Loov;)Loov;
      // 45: athrow
      // 46: iinc 5 1
      // 49: iload 1
      // 4a: ifne 18
      // 4d: aload 2
      // 4e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 51: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
