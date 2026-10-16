import com.google.common.base.Predicate;

public class s24$1 implements Predicate {
   public final Predicate n61;
   public final s24 swc;

   public s24$1(s24 var1, Predicate var2) {
      this.swc = var1;
      this.n61 = var2;
   }

   public boolean uh9(g_3 param1) {
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
      // 05: getfield s24$1.n61 Lcom/google/common/base/Predicate;
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifnull 3b
      // 0f: goto 16
      // 12: invokestatic s24$1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield s24$1.n61 Lcom/google/common/base/Predicate;
      // 1a: goto 21
      // 1d: invokestatic s24$1.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 1
      // 22: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 27: iload 2
      // 28: ifeq 3f
      // 2b: ifne 3b
      // 2e: goto 35
      // 31: invokestatic s24$1.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 0
      // 36: ireturn
      // 37: invokestatic s24$1.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 1
      // 3c: instanceof ha9
      // 3f: iload 2
      // 40: ifeq dd
      // 43: ifeq d4
      // 46: goto 4d
      // 49: invokestatic s24$1.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield s24$1.swc Ls24;
      // 51: invokevirtual s24.uyl ()D
      // 54: dstore 3
      // 55: aload 1
      // 56: invokevirtual g_3.hzv ()Z
      // 59: iload 2
      // 5a: ifeq 71
      // 5d: ifeq 6d
      // 60: goto 67
      // 63: invokestatic s24$1.a (Loov;)Loov;
      // 66: athrow
      // 67: dload 3
      // 68: ldc2_w 0.800000011920929
      // 6b: dmul
      // 6c: dstore 3
      // 6d: aload 1
      // 6e: invokevirtual g_3.h5u ()Z
      // 71: iload 2
      // 72: ifeq c0
      // 75: ifeq b2
      // 78: goto 7f
      // 7b: invokestatic s24$1.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 1
      // 80: checkcast ha9
      // 83: invokevirtual ha9.ws9 ()F
      // 86: fstore 5
      // 88: fload 5
      // 8a: iload 2
      // 8b: ifeq a6
      // 8e: ldc 0.1
      // 90: nop
      // 91: fcmpg
      // 92: ifge a8
      // 95: goto 9c
      // 98: invokestatic s24$1.a (Loov;)Loov;
      // 9b: athrow
      // 9c: ldc 0.1
      // 9e: nop
      // 9f: goto a6
      // a2: invokestatic s24$1.a (Loov;)Loov;
      // a5: athrow
      // a6: fstore 5
      // a8: dload 3
      // a9: ldc 0.7
      // ab: nop
      // ac: fload 5
      // ae: fmul
      // af: f2d
      // b0: dmul
      // b1: dstore 3
      // b2: aload 1
      // b3: aload 0
      // b4: getfield s24$1.swc Ls24;
      // b7: getfield s24.pf7 Llaq;
      // ba: invokevirtual g_3.tm6 (Li2h;)F
      // bd: f2d
      // be: dload 3
      // bf: dcmpl
      // c0: iload 2
      // c1: ifeq dd
      // c4: ifle d4
      // c7: goto ce
      // ca: invokestatic s24$1.a (Loov;)Loov;
      // cd: athrow
      // ce: bipush 0
      // cf: ireturn
      // d0: invokestatic s24$1.a (Loov;)Loov;
      // d3: athrow
      // d4: aload 0
      // d5: getfield s24$1.swc Ls24;
      // d8: aload 1
      // d9: bipush 0
      // da: invokevirtual s24.paa (Lg_3;Z)Z
      // dd: ireturn
   }

   public boolean apply(Object var1) {
      return this.uh9((g_3)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
