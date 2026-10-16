import com.google.common.base.Predicate;

public final class z83$3 implements Predicate {
   public final int by7;
   public final int zqy;

   public z83$3(int var1, int var2) {
      this.by7 = var1;
      this.zqy = var2;
   }

   public boolean vv6(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 1d
      // 09: instanceof z96
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic z83$3.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic z83$3.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: checkcast z96
      // 20: astore 3
      // 21: aload 0
      // 22: getfield z83$3.by7 I
      // 25: bipush -1
      // 26: iload 2
      // 27: ifne 68
      // 2a: if_icmple 51
      // 2d: goto 34
      // 30: invokestatic z83$3.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 3
      // 35: getfield z96.op5 I
      // 38: aload 0
      // 39: getfield z83$3.by7 I
      // 3c: iload 2
      // 3d: ifne 68
      // 40: goto 47
      // 43: invokestatic z83$3.a (Loov;)Loov;
      // 46: athrow
      // 47: if_icmplt 93
      // 4a: goto 51
      // 4d: invokestatic z83$3.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: getfield z83$3.zqy I
      // 55: iload 2
      // 56: ifne 90
      // 59: goto 60
      // 5c: invokestatic z83$3.a (Loov;)Loov;
      // 5f: athrow
      // 60: bipush -1
      // 61: goto 68
      // 64: invokestatic z83$3.a (Loov;)Loov;
      // 67: athrow
      // 68: if_icmple 88
      // 6b: aload 3
      // 6c: getfield z96.op5 I
      // 6f: iload 2
      // 70: ifne 90
      // 73: goto 7a
      // 76: invokestatic z83$3.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield z83$3.zqy I
      // 7e: if_icmpgt 93
      // 81: goto 88
      // 84: invokestatic z83$3.a (Loov;)Loov;
      // 87: athrow
      // 88: bipush 1
      // 89: goto 90
      // 8c: invokestatic z83$3.a (Loov;)Loov;
      // 8f: athrow
      // 90: goto 94
      // 93: bipush 0
      // 94: ireturn
   }

   public boolean apply(Object var1) {
      return this.vv6((i2h)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
