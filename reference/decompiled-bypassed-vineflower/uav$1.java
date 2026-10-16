import com.google.common.base.Predicate;

public final class uav$1 implements Predicate {
   public boolean olo(x54$lti param1) {
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
      // 05: invokevirtual x54$lti.h8z ()I
      // 08: iload 2
      // 09: ifne 1f
      // 0c: bipush 4
      // 0d: if_icmpge 22
      // 10: goto 17
      // 13: invokestatic uav$1.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic uav$1.a (Loov;)Loov;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   public boolean apply(Object var1) {
      return this.olo((x54$lti)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
