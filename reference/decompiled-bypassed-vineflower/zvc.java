public class zvc extends dug {
   private dug t36;

   public zvc(vr1 var1, he6 var2, int var3, dug var4, uan var5) {
      super(var1, var2, new rjp(var4.r7d()), var3, var5);
      this.t36 = var4;
      var4.fve().air(new zvc$1(this));
   }

   @Override
   public void u54() {
   }

   @Override
   public t9d ufh() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 0
      // 02: getfield zvc.t36 Ldug;
      // 05: invokevirtual dug.pjw ()L_ie;
      // 08: putfield zvc.hqr L_ie;
      // 0b: invokestatic t9d.c ()I
      // 0e: aload 0
      // 0f: aload 0
      // 10: getfield zvc.t36 Ldug;
      // 13: invokevirtual dug.fgp ()Luci;
      // 16: putfield zvc.t7i Luci;
      // 19: aload 0
      // 1a: getfield zvc.vzz Lupn;
      // 1d: invokestatic bg8.m28 (Lupn;)Ljava/lang/String;
      // 20: astore 2
      // 21: istore 1
      // 22: aload 0
      // 23: getfield zvc.hqr L_ie;
      // 26: ldc bg8
      // 28: nop
      // 29: aload 2
      // 2a: invokevirtual _ie.ym5 (Ljava/lang/Class;Ljava/lang/String;)Lwob;
      // 2d: checkcast bg8
      // 30: astore 3
      // 31: aload 3
      // 32: iload 1
      // 33: ifne 73
      // 36: ifnonnull 63
      // 39: goto 40
      // 3c: invokestatic zvc.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: new bg8
      // 44: dup
      // 45: aload 0
      // 46: invokespecial bg8.<init> (Lt9d;)V
      // 49: putfield zvc.sw1 Lbg8;
      // 4c: aload 0
      // 4d: getfield zvc.hqr L_ie;
      // 50: aload 2
      // 51: aload 0
      // 52: getfield zvc.sw1 Lbg8;
      // 55: invokevirtual _ie.vex (Ljava/lang/String;Lwob;)V
      // 58: iload 1
      // 59: ifeq 77
      // 5c: goto 63
      // 5f: invokestatic zvc.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 0
      // 64: aload 3
      // 65: putfield zvc.sw1 Lbg8;
      // 68: aload 0
      // 69: getfield zvc.sw1 Lbg8;
      // 6c: goto 73
      // 6f: invokestatic zvc.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 0
      // 74: invokevirtual bg8.kyu (Lt9d;)V
      // 77: aload 0
      // 78: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
