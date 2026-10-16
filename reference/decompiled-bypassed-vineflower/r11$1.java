import java.util.Comparator;

public final class r11$1 implements Comparator {
   public int ofu(r11 param1, r11 param2) {
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
      // 05: invokevirtual r11.fge ()I
      // 08: aload 2
      // 09: invokevirtual r11.fge ()I
      // 0c: iload 3
      // 0d: ifeq 35
      // 10: if_icmple 22
      // 13: goto 1a
      // 16: invokestatic r11$1.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 1
      // 1b: goto 4b
      // 1e: invokestatic r11$1.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 1
      // 23: iload 3
      // 24: ifeq 41
      // 27: invokevirtual r11.fge ()I
      // 2a: aload 2
      // 2b: invokevirtual r11.fge ()I
      // 2e: goto 35
      // 31: invokestatic r11$1.a (Loov;)Loov;
      // 34: athrow
      // 35: if_icmpge 40
      // 38: bipush -1
      // 39: goto 4b
      // 3c: invokestatic r11$1.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 2
      // 41: invokevirtual r11.tg2 ()Ljava/lang/String;
      // 44: aload 1
      // 45: invokevirtual r11.tg2 ()Ljava/lang/String;
      // 48: invokevirtual java/lang/String.compareToIgnoreCase (Ljava/lang/String;)I
      // 4b: ireturn
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.ofu((r11)var1, (r11)var2);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
