public class hsd {
   public float m9v(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: getfield hsd.slv F
      // 05: fload 1
      // 06: fadd
      // 07: putfield hsd.slv F
      // 0a: invokestatic t9d.b ()I
      // 0d: aload 0
      // 0e: getfield hsd.slv F
      // 11: aload 0
      // 12: getfield hsd.upr F
      // 15: fsub
      // 16: fload 2
      // 17: fmul
      // 18: fstore 1
      // 19: istore 3
      // 1a: aload 0
      // 1b: dup
      // 1c: getfield hsd.cgi F
      // 1f: fload 1
      // 20: aload 0
      // 21: getfield hsd.cgi F
      // 24: fsub
      // 25: ldc 0.5
      // 27: nop
      // 28: fmul
      // 29: fadd
      // 2a: putfield hsd.cgi F
      // 2d: fload 1
      // 2e: fconst_0
      // 2f: fcmpl
      // 30: iload 3
      // 31: ifeq 6e
      // 34: ifle 59
      // 37: goto 3e
      // 3a: invokestatic hsd.a (Loov;)Loov;
      // 3d: athrow
      // 3e: fload 1
      // 3f: iload 3
      // 40: ifeq 97
      // 43: goto 4a
      // 46: invokestatic hsd.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield hsd.cgi F
      // 4e: fcmpl
      // 4f: ifgt 8c
      // 52: goto 59
      // 55: invokestatic hsd.a (Loov;)Loov;
      // 58: athrow
      // 59: fload 1
      // 5a: iload 3
      // 5b: ifeq a3
      // 5e: goto 65
      // 61: invokestatic hsd.a (Loov;)Loov;
      // 64: athrow
      // 65: fconst_0
      // 66: fcmpg
      // 67: goto 6e
      // 6a: invokestatic hsd.a (Loov;)Loov;
      // 6d: athrow
      // 6e: ifge 98
      // 71: fload 1
      // 72: iload 3
      // 73: ifeq a3
      // 76: goto 7d
      // 79: invokestatic hsd.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 0
      // 7e: getfield hsd.cgi F
      // 81: fcmpg
      // 82: ifge 98
      // 85: goto 8c
      // 88: invokestatic hsd.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 0
      // 8d: getfield hsd.cgi F
      // 90: goto 97
      // 93: invokestatic hsd.a (Loov;)Loov;
      // 96: athrow
      // 97: fstore 1
      // 98: aload 0
      // 99: dup
      // 9a: getfield hsd.upr F
      // 9d: fload 1
      // 9e: fadd
      // 9f: putfield hsd.upr F
      // a2: fload 1
      // a3: freturn
   }

   public void tdw() {
      this.slv = 0.0F;
      this.upr = 0.0F;
      this.cgi = 0.0F;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
