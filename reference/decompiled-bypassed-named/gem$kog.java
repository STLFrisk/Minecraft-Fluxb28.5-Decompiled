public class gem$kog extends vrx {
   private ha9 wrj;

   public gem$kog(ha9 var1, rsi var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.wrj = var1;
   }

   @Override
   public boolean xvl(erg var1) {
      return lvh(var1);
   }

   @Override
   public int c1r() {
      return 1;
   }

   @Override
   public void g1d(ha9 param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifeq 21
      // 09: invokevirtual erg.gn1 ()Lu7m;
      // 0c: getstatic xbr.ik6 Ldgn;
      // 0f: if_acmpne 38
      // 12: goto 19
      // 15: invokestatic gem$kog.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 2
      // 1a: goto 21
      // 1d: invokestatic gem$kog.a (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual erg.j6_ ()I
      // 24: ifle 38
      // 27: aload 0
      // 28: getfield gem$kog.wrj Lha9;
      // 2b: getstatic y8d.ux9 Ll7l;
      // 2e: invokevirtual ha9.aex (L_ss;)V
      // 31: goto 38
      // 34: invokestatic gem$kog.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: aload 1
      // 3a: aload 2
      // 3b: invokespecial vrx.g1d (Lha9;Lerg;)V
      // 3e: return
   }

   public static boolean lvh(erg param0) {
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
      // 05: iload 1
      // 06: ifne 14
      // 09: ifnull 41
      // 0c: goto 13
      // 0f: invokestatic gem$kog.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual erg.gn1 ()Lu7m;
      // 17: getstatic xbr.ik6 Ldgn;
      // 1a: iload 1
      // 1b: ifne 36
      // 1e: if_acmpeq 39
      // 21: goto 28
      // 24: invokestatic gem$kog.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: invokevirtual erg.gn1 ()Lu7m;
      // 2c: getstatic xbr.fvb Lu7m;
      // 2f: goto 36
      // 32: invokestatic gem$kog.a (Loov;)Loov;
      // 35: athrow
      // 36: if_acmpne 41
      // 39: bipush 1
      // 3a: goto 42
      // 3d: invokestatic gem$kog.a (Loov;)Loov;
      // 40: athrow
      // 41: bipush 0
      // 42: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
