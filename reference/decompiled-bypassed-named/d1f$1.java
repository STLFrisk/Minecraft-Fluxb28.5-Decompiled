import com.google.common.base.Predicate;

public class d1f$1 implements Predicate {
   public final d1f uew;

   public d1f$1(d1f var1) {
      this.uew = var1;
   }

   public boolean qsu(r11 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual r11.tg2 ()Ljava/lang/String;
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifnull 39
      // 0f: goto 16
      // 12: invokestatic d1f$1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual r11.tg2 ()Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokestatic d1f$1.a (Loov;)Loov;
      // 20: athrow
      // 21: ldc "#"
      // 23: nop
      // 24: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 27: iload 2
      // 28: ifne 36
      // 2b: ifne 39
      // 2e: goto 35
      // 31: invokestatic d1f$1.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   public boolean apply(Object var1) {
      return this.qsu((r11)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
