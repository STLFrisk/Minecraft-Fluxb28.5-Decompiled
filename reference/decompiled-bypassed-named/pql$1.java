import com.google.common.base.Function;

public class pql$1 implements Function {
   public final String[] ll9;

   public pql$1(String[] var1) {
      this.ll9 = var1;
   }

   public String jib(erg param1) {
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
      // 05: invokevirtual erg.j6_ ()I
      // 08: istore 3
      // 09: iload 3
      // 0a: iload 2
      // 0b: ifne 3b
      // 0e: iflt 33
      // 11: goto 18
      // 14: invokestatic pql$1.a (Loov;)Loov;
      // 17: athrow
      // 18: iload 3
      // 19: iload 2
      // 1a: ifne 3b
      // 1d: goto 24
      // 20: invokestatic pql$1.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield pql$1.ll9 [Ljava/lang/String;
      // 28: arraylength
      // 29: if_icmplt 3c
      // 2c: goto 33
      // 2f: invokestatic pql$1.a (Loov;)Loov;
      // 32: athrow
      // 33: bipush 0
      // 34: goto 3b
      // 37: invokestatic pql$1.a (Loov;)Loov;
      // 3a: athrow
      // 3b: istore 3
      // 3c: aload 0
      // 3d: getfield pql$1.ll9 [Ljava/lang/String;
      // 40: iload 3
      // 41: aaload
      // 42: areturn
   }

   public Object apply(Object var1) {
      return this.jib((erg)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
