public class kta$1 extends vrx {
   public final int mdq;
   public final kta bhr;

   public kta$1(kta var1, rsi var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5);
      this.bhr = var1;
      this.mdq = var6;
   }

   @Override
   public int c1r() {
      return 1;
   }

   @Override
   public boolean xvl(erg param1) {
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
      // 06: ifne 1c
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic kta$1.a (Loov;)Loov;
      // 12: athrow
      // 13: bipush 0
      // 14: goto a7
      // 17: invokestatic kta$1.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual erg.gn1 ()Lu7m;
      // 1f: iload 2
      // 20: ifne 63
      // 23: instanceof jpt
      // 26: ifeq 5f
      // 29: goto 30
      // 2c: invokestatic kta$1.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 1
      // 31: invokevirtual erg.gn1 ()Lu7m;
      // 34: checkcast jpt
      // 37: getfield jpt.nbs I
      // 3a: iload 2
      // 3b: ifne 5c
      // 3e: goto 45
      // 41: invokestatic kta$1.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 0
      // 46: getfield kta$1.mdq I
      // 49: if_icmpne 5b
      // 4c: goto 53
      // 4f: invokestatic kta$1.a (Loov;)Loov;
      // 52: athrow
      // 53: bipush 1
      // 54: goto a7
      // 57: invokestatic kta$1.a (Loov;)Loov;
      // 5a: athrow
      // 5b: bipush 0
      // 5c: goto a7
      // 5f: aload 1
      // 60: invokevirtual erg.gn1 ()Lu7m;
      // 63: getstatic ox_.jzx Le0x;
      // 66: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 69: iload 2
      // 6a: ifne 85
      // 6d: if_acmpeq 90
      // 70: goto 77
      // 73: invokestatic kta$1.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 1
      // 78: invokevirtual erg.gn1 ()Lu7m;
      // 7b: getstatic xbr.r9n Lu7m;
      // 7e: goto 85
      // 81: invokestatic kta$1.a (Loov;)Loov;
      // 84: athrow
      // 85: if_acmpeq 90
      // 88: bipush 0
      // 89: goto a7
      // 8c: invokestatic kta$1.a (Loov;)Loov;
      // 8f: athrow
      // 90: aload 0
      // 91: getfield kta$1.mdq I
      // 94: iload 2
      // 95: ifne a3
      // 98: ifne a6
      // 9b: goto a2
      // 9e: invokestatic kta$1.a (Loov;)Loov;
      // a1: athrow
      // a2: bipush 1
      // a3: goto a7
      // a6: bipush 0
      // a7: ireturn
   }

   @Override
   public String i8b() {
      return jpt.rj6[this.mdq];
   }

   private static oov a(oov var0) {
      return var0;
   }
}
