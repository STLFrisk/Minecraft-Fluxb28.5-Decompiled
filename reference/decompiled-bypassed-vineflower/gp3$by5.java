public class gp3$by5 {
   private final gdz kya;
   private final xup vho;
   private final boolean jf3;
   private final int b84;

   public gp3$by5(gdz var1, xup var2, boolean var3, int var4) {
      this.kya = var1;
      this.vho = var2;
      this.jf3 = var3;
      this.b84 = var4;
   }

   public gdz g8t() {
      return this.kya;
   }

   public xup epl() {
      return this.vho;
   }

   public boolean nei() {
      return this.jf3;
   }

   public int of7() {
      return this.b84;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic gp3$by5.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic gp3$by5.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifeq 33
      // 1f: instanceof gp3$by5
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic gp3$by5.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic gp3$by5.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast gp3$by5
      // 36: astore 3
      // 37: aload 0
      // 38: iload 2
      // 39: ifeq 58
      // 3c: getfield gp3$by5.kya Lgdz;
      // 3f: aload 3
      // 40: getfield gp3$by5.kya Lgdz;
      // 43: invokevirtual gdz.equals (Ljava/lang/Object;)Z
      // 46: ifeq 95
      // 49: goto 50
      // 4c: invokestatic gp3$by5.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: goto 58
      // 54: invokestatic gp3$by5.a (Loov;)Loov;
      // 57: athrow
      // 58: iload 2
      // 59: ifeq 75
      // 5c: getfield gp3$by5.vho Lxup;
      // 5f: aload 3
      // 60: getfield gp3$by5.vho Lxup;
      // 63: if_acmpne 95
      // 66: goto 6d
      // 69: invokestatic gp3$by5.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: goto 75
      // 71: invokestatic gp3$by5.a (Loov;)Loov;
      // 74: athrow
      // 75: getfield gp3$by5.jf3 Z
      // 78: iload 2
      // 79: ifeq 92
      // 7c: aload 3
      // 7d: getfield gp3$by5.jf3 Z
      // 80: if_icmpne 95
      // 83: goto 8a
      // 86: invokestatic gp3$by5.a (Loov;)Loov;
      // 89: athrow
      // 8a: bipush 1
      // 8b: goto 92
      // 8e: invokestatic gp3$by5.a (Loov;)Loov;
      // 91: athrow
      // 92: goto 96
      // 95: bipush 0
      // 96: ireturn
   }

   @Override
   public int hashCode() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield gp3$by5.kya Lgdz;
      // 08: invokevirtual gdz.hashCode ()I
      // 0b: istore 2
      // 0c: bipush 31
      // 0e: iload 2
      // 0f: imul
      // 10: aload 0
      // 11: getfield gp3$by5.vho Lxup;
      // 14: iload 1
      // 15: ifne 2d
      // 18: ifnull 33
      // 1b: goto 22
      // 1e: invokestatic gp3$by5.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getfield gp3$by5.vho Lxup;
      // 26: goto 2d
      // 29: invokestatic gp3$by5.a (Loov;)Loov;
      // 2c: athrow
      // 2d: invokevirtual xup.hashCode ()I
      // 30: goto 34
      // 33: bipush 0
      // 34: iadd
      // 35: istore 2
      // 36: bipush 31
      // 38: iload 2
      // 39: imul
      // 3a: aload 0
      // 3b: getfield gp3$by5.jf3 Z
      // 3e: iload 1
      // 3f: ifne 4d
      // 42: ifeq 50
      // 45: goto 4c
      // 48: invokestatic gp3$by5.a (Loov;)Loov;
      // 4b: athrow
      // 4c: bipush 1
      // 4d: goto 51
      // 50: bipush 0
      // 51: iadd
      // 52: istore 2
      // 53: iload 2
      // 54: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
