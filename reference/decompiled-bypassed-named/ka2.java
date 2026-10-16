import com.google.common.base.Predicate;

public class ka2 extends s24 {
   public ka2(k9a var1, Class var2, boolean var3, Predicate var4) {
      super(var1, var2, 10, var3, false, var4);
      this.iq2 = var1;
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield ka2.iq2 Lk9a;
      // 08: invokevirtual k9a.j1j ()Z
      // 0b: iload 1
      // 0c: ifne 24
      // 0f: ifne 36
      // 12: goto 19
      // 15: invokestatic ka2.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: invokespecial s24.vle ()Z
      // 1d: goto 24
      // 20: invokestatic ka2.a (Loov;)Loov;
      // 23: athrow
      // 24: iload 1
      // 25: ifne 33
      // 28: ifeq 36
      // 2b: goto 32
      // 2e: invokestatic ka2.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
