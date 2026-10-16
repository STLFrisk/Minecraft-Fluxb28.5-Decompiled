import java.util.Comparator;

public class opt$1 implements Comparator {
   public final opt a3w;

   public opt$1(opt var1) {
      this.a3w = var1;
   }

   public int m0t(ui9 param1, ui9 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: instanceof ufx
      // 08: iload 3
      // 09: ifeq 3b
      // 0c: ifeq 37
      // 0f: goto 16
      // 12: invokestatic opt$1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 2
      // 17: instanceof f7i
      // 1a: iload 3
      // 1b: ifeq 3b
      // 1e: goto 25
      // 21: invokestatic opt$1.a (Loov;)Loov;
      // 24: athrow
      // 25: ifeq 37
      // 28: goto 2f
      // 2b: invokestatic opt$1.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto ab
      // 33: invokestatic opt$1.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 2
      // 38: instanceof ufx
      // 3b: iload 3
      // 3c: ifeq 70
      // 3f: ifeq 6a
      // 42: goto 49
      // 45: invokestatic opt$1.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 1
      // 4a: instanceof f7i
      // 4d: iload 3
      // 4e: ifeq 70
      // 51: goto 58
      // 54: invokestatic opt$1.a (Loov;)Loov;
      // 57: athrow
      // 58: ifeq 6a
      // 5b: goto 62
      // 5e: invokestatic opt$1.a (Loov;)Loov;
      // 61: athrow
      // 62: bipush -1
      // 63: goto ab
      // 66: invokestatic opt$1.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 2
      // 6b: invokeinterface ui9.hmy ()I 1
      // 70: aload 1
      // 71: invokeinterface ui9.hmy ()I 1
      // 76: iload 3
      // 77: ifeq a3
      // 7a: if_icmpge 8c
      // 7d: goto 84
      // 80: invokestatic opt$1.a (Loov;)Loov;
      // 83: athrow
      // 84: bipush -1
      // 85: goto ab
      // 88: invokestatic opt$1.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 2
      // 8d: invokeinterface ui9.hmy ()I 1
      // 92: iload 3
      // 93: ifeq a7
      // 96: aload 1
      // 97: invokeinterface ui9.hmy ()I 1
      // 9c: goto a3
      // 9f: invokestatic opt$1.a (Loov;)Loov;
      // a2: athrow
      // a3: if_icmple aa
      // a6: bipush 1
      // a7: goto ab
      // aa: bipush 0
      // ab: ireturn
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.m0t((ui9)var1, (ui9)var2);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
