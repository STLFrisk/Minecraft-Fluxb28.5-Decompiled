import java.util.Random;

public abstract class e9q extends cdu {
   public e9q(boolean var1) {
      super(var1);
   }

   public boolean mgy(e0x param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual e0x.p1r ()Lp3y;
      // 08: astore 3
      // 09: aload 3
      // 0a: getstatic p3y.cei Lp3y;
      // 0d: iload 2
      // 0e: ifeq 26
      // 11: if_acmpeq b4
      // 14: goto 1b
      // 17: invokestatic e9q.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 3
      // 1c: getstatic p3y.hh1 Lp3y;
      // 1f: goto 26
      // 22: invokestatic e9q.c (Loov;)Loov;
      // 25: athrow
      // 26: if_acmpeq b4
      // 29: aload 1
      // 2a: getstatic ox_.l11 Lx82;
      // 2d: iload 2
      // 2e: ifeq 4d
      // 31: goto 38
      // 34: invokestatic e9q.c (Loov;)Loov;
      // 37: athrow
      // 38: if_acmpeq b4
      // 3b: goto 42
      // 3e: invokestatic e9q.c (Loov;)Loov;
      // 41: athrow
      // 42: aload 1
      // 43: getstatic ox_.kqk Le0x;
      // 46: goto 4d
      // 49: invokestatic e9q.c (Loov;)Loov;
      // 4c: athrow
      // 4d: iload 2
      // 4e: ifeq 66
      // 51: if_acmpeq b4
      // 54: goto 5b
      // 57: invokestatic e9q.c (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 1
      // 5c: getstatic ox_.uom Le0x;
      // 5f: goto 66
      // 62: invokestatic e9q.c (Loov;)Loov;
      // 65: athrow
      // 66: iload 2
      // 67: ifeq 7f
      // 6a: if_acmpeq b4
      // 6d: goto 74
      // 70: invokestatic e9q.c (Loov;)Loov;
      // 73: athrow
      // 74: aload 1
      // 75: getstatic ox_.a4y Le0x;
      // 78: goto 7f
      // 7b: invokestatic e9q.c (Loov;)Loov;
      // 7e: athrow
      // 7f: iload 2
      // 80: ifeq 98
      // 83: if_acmpeq b4
      // 86: goto 8d
      // 89: invokestatic e9q.c (Loov;)Loov;
      // 8c: athrow
      // 8d: aload 1
      // 8e: getstatic ox_.t_k Le0x;
      // 91: goto 98
      // 94: invokestatic e9q.c (Loov;)Loov;
      // 97: athrow
      // 98: iload 2
      // 99: ifeq b1
      // 9c: if_acmpeq b4
      // 9f: goto a6
      // a2: invokestatic e9q.c (Loov;)Loov;
      // a5: athrow
      // a6: aload 1
      // a7: getstatic ox_.s25 Le0x;
      // aa: goto b1
      // ad: invokestatic e9q.c (Loov;)Loov;
      // b0: athrow
      // b1: if_acmpne bc
      // b4: bipush 1
      // b5: goto bd
      // b8: invokestatic e9q.c (Loov;)Loov;
      // bb: athrow
      // bc: bipush 0
      // bd: ireturn
   }

   public void mpp(OpaquePredicate var1, Random var2, mew var3) {
   }

   public void g27(OpaquePredicate var1, mew var2) {
      try {
         if (var1.getBlockState(var2).r_y() != ox_.kqk) {
            this.u0f(var1, var2, ox_.kqk.l4i());
         }
      } catch (oov var3) {
         throw c(var3);
      }
   }

   private static oov c(oov var0) {
      return var0;
   }
}
