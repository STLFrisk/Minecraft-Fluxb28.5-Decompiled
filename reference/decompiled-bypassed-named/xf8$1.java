import com.google.common.base.Predicate;

public class xf8$1 implements Predicate {
   public final xf8 _eu;

   public xf8$1(xf8 var1) {
      this._eu = var1;
   }

   public boolean o7k(String param1) {
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
      // 05: iload 2
      // 06: ifne 1d
      // 09: invokevirtual java/lang/String.length ()I
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic xf8$1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: bipush 1
      // 17: ireturn
      // 18: invokestatic xf8$1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: aload 1
      // 1d: ldc ":"
      // 1f: nop
      // 20: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 23: astore 3
      // 24: aload 3
      // 25: iload 2
      // 26: ifne 3b
      // 29: arraylength
      // 2a: ifne 3a
      // 2d: goto 34
      // 30: invokestatic xf8$1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: bipush 1
      // 35: ireturn
      // 36: invokestatic xf8$1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39: athrow
      // 3a: aload 3
      // 3b: bipush 0
      // 3c: aaload
      // 3d: invokestatic java/net/IDN.toASCII (Ljava/lang/String;)Ljava/lang/String;
      // 40: astore 4
      // 42: bipush 1
      // 43: ireturn
      // 44: astore 4
      // 46: bipush 0
      // 47: ireturn
   }

   public boolean apply(Object var1) {
      return this.o7k((String)var1);
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
