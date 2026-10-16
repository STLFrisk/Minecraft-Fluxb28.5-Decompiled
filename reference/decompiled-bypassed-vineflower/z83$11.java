import com.google.common.base.Predicate;

public final class z83$11 implements Predicate {
   public final nh4 bsu;

   public z83$11(nh4 var1) {
      this.bsu = var1;
   }

   public boolean sig(i2h param1) {
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
      // 05: getfield i2h.o2v D
      // 08: aload 0
      // 09: getfield z83$11.bsu Lnh4;
      // 0c: getfield nh4.rlc D
      // 0f: dcmpl
      // 10: iload 2
      // 11: ifne 31
      // 14: iflt cf
      // 17: goto 1e
      // 1a: invokestatic z83$11.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: getfield i2h.kfp D
      // 22: aload 0
      // 23: getfield z83$11.bsu Lnh4;
      // 26: getfield nh4.bx_ D
      // 29: dcmpl
      // 2a: goto 31
      // 2d: invokestatic z83$11.a (Loov;)Loov;
      // 30: athrow
      // 31: iload 2
      // 32: ifne 52
      // 35: iflt cf
      // 38: goto 3f
      // 3b: invokestatic z83$11.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 1
      // 40: getfield i2h.vbd D
      // 43: aload 0
      // 44: getfield z83$11.bsu Lnh4;
      // 47: getfield nh4.t8n D
      // 4a: dcmpl
      // 4b: goto 52
      // 4e: invokestatic z83$11.a (Loov;)Loov;
      // 51: athrow
      // 52: iload 2
      // 53: ifne 73
      // 56: iflt cf
      // 59: goto 60
      // 5c: invokestatic z83$11.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 1
      // 61: getfield i2h.o2v D
      // 64: aload 0
      // 65: getfield z83$11.bsu Lnh4;
      // 68: getfield nh4.t_2 D
      // 6b: dcmpg
      // 6c: goto 73
      // 6f: invokestatic z83$11.a (Loov;)Loov;
      // 72: athrow
      // 73: iload 2
      // 74: ifne cc
      // 77: ifge cb
      // 7a: goto 81
      // 7d: invokestatic z83$11.a (Loov;)Loov;
      // 80: athrow
      // 81: aload 1
      // 82: getfield i2h.kfp D
      // 85: aload 0
      // 86: getfield z83$11.bsu Lnh4;
      // 89: getfield nh4.i2c D
      // 8c: dcmpg
      // 8d: iload 2
      // 8e: ifne cc
      // 91: goto 98
      // 94: invokestatic z83$11.a (Loov;)Loov;
      // 97: athrow
      // 98: ifge cb
      // 9b: goto a2
      // 9e: invokestatic z83$11.a (Loov;)Loov;
      // a1: athrow
      // a2: aload 1
      // a3: getfield i2h.vbd D
      // a6: aload 0
      // a7: getfield z83$11.bsu Lnh4;
      // aa: getfield nh4.oqj D
      // ad: dcmpg
      // ae: iload 2
      // af: ifne cc
      // b2: goto b9
      // b5: invokestatic z83$11.a (Loov;)Loov;
      // b8: athrow
      // b9: ifge cb
      // bc: goto c3
      // bf: invokestatic z83$11.a (Loov;)Loov;
      // c2: athrow
      // c3: bipush 1
      // c4: goto d0
      // c7: invokestatic z83$11.a (Loov;)Loov;
      // ca: athrow
      // cb: bipush 0
      // cc: goto d0
      // cf: bipush 0
      // d0: ireturn
   }

   public boolean apply(Object var1) {
      return this.sig((i2h)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
