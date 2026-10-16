import com.google.common.base.Predicate;

public class dj9$1 implements Predicate {
   public final dj9 yeg;

   public dj9$1(dj9 var1) {
      this.yeg = var1;
   }

   public boolean cjg(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokestatic com/google/common/primitives/Floats.tryParse (Ljava/lang/String;)Ljava/lang/Float;
      // 08: astore 3
      // 09: aload 1
      // 0a: invokevirtual java/lang/String.length ()I
      // 0d: iload 2
      // 0e: ifeq 62
      // 11: ifeq 61
      // 14: goto 1b
      // 17: invokestatic dj9$1.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 3
      // 1c: iload 2
      // 1d: ifeq 32
      // 20: goto 27
      // 23: invokestatic dj9$1.a (Loov;)Loov;
      // 26: athrow
      // 27: ifnull 65
      // 2a: goto 31
      // 2d: invokestatic dj9$1.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 3
      // 32: invokevirtual java/lang/Float.floatValue ()F
      // 35: invokestatic com/google/common/primitives/Floats.isFinite (F)Z
      // 38: iload 2
      // 39: ifeq 53
      // 3c: ifeq 65
      // 3f: goto 46
      // 42: invokestatic dj9$1.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 3
      // 47: invokevirtual java/lang/Float.floatValue ()F
      // 4a: fconst_0
      // 4b: fcmpl
      // 4c: goto 53
      // 4f: invokestatic dj9$1.a (Loov;)Loov;
      // 52: athrow
      // 53: iload 2
      // 54: ifeq 62
      // 57: iflt 65
      // 5a: goto 61
      // 5d: invokestatic dj9$1.a (Loov;)Loov;
      // 60: athrow
      // 61: bipush 1
      // 62: goto 66
      // 65: bipush 0
      // 66: ireturn
   }

   public boolean apply(Object var1) {
      return this.cjg((String)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
