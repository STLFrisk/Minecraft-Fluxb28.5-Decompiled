import com.google.common.base.Predicate;

public final class z83$9 implements Predicate {
   public final int j50;
   public final int lpv;

   public z83$9(int var1, int var2) {
      this.j50 = var1;
      this.lpv = var2;
   }

   public boolean nts(i2h param1) {
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
      // 05: getfield i2h.x5k F
      // 08: f2d
      // 09: invokestatic java/lang/Math.floor (D)D
      // 0c: d2i
      // 0d: invokestatic z83.gqf (I)I
      // 10: istore 3
      // 11: aload 0
      // 12: getfield z83$9.j50 I
      // 15: aload 0
      // 16: getfield z83$9.lpv I
      // 19: iload 2
      // 1a: ifne 6f
      // 1d: if_icmple 6a
      // 20: goto 27
      // 23: invokestatic z83$9.a (Loov;)Loov;
      // 26: athrow
      // 27: iload 3
      // 28: iload 2
      // 29: ifne 63
      // 2c: goto 33
      // 2f: invokestatic z83$9.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: getfield z83$9.j50 I
      // 37: if_icmpge 5b
      // 3a: goto 41
      // 3d: invokestatic z83$9.a (Loov;)Loov;
      // 40: athrow
      // 41: iload 3
      // 42: iload 2
      // 43: ifne 67
      // 46: goto 4d
      // 49: invokestatic z83$9.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield z83$9.lpv I
      // 51: if_icmpgt 66
      // 54: goto 5b
      // 57: invokestatic z83$9.a (Loov;)Loov;
      // 5a: athrow
      // 5b: bipush 1
      // 5c: goto 63
      // 5f: invokestatic z83$9.a (Loov;)Loov;
      // 62: athrow
      // 63: goto 9c
      // 66: bipush 0
      // 67: goto 9c
      // 6a: iload 3
      // 6b: aload 0
      // 6c: getfield z83$9.j50 I
      // 6f: iload 2
      // 70: ifne 94
      // 73: if_icmplt 9b
      // 76: goto 7d
      // 79: invokestatic z83$9.a (Loov;)Loov;
      // 7c: athrow
      // 7d: iload 3
      // 7e: iload 2
      // 7f: ifne 98
      // 82: goto 89
      // 85: invokestatic z83$9.a (Loov;)Loov;
      // 88: athrow
      // 89: aload 0
      // 8a: getfield z83$9.lpv I
      // 8d: goto 94
      // 90: invokestatic z83$9.a (Loov;)Loov;
      // 93: athrow
      // 94: if_icmpgt 9b
      // 97: bipush 1
      // 98: goto 9c
      // 9b: bipush 0
      // 9c: ireturn
   }

   public boolean apply(Object var1) {
      return this.nts((i2h)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
