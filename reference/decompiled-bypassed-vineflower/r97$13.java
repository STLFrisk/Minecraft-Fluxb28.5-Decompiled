public final class r97$13 extends kea {
   private boolean ald = true;

   @Override
   public erg lno(sdf param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: getstatic qvg.ft3 Lqvg;
      // 07: aload 2
      // 08: invokevirtual erg.j6_ ()I
      // 0b: invokestatic qvg.b7j (I)Lqvg;
      // 0e: if_acmpne 7a
      // 11: aload 1
      // 12: invokeinterface sdf.acz ()Lt9d; 1
      // 17: astore 4
      // 19: aload 1
      // 1a: invokeinterface sdf.taq ()Lmew; 1
      // 1f: aload 1
      // 20: invokeinterface sdf.lcq ()I 1
      // 25: invokestatic okn.dwc (I)Lvt2;
      // 28: invokevirtual mew.offset (Lvt2;)Lmew;
      // 2b: astore 5
      // 2d: aload 2
      // 2e: aload 4
      // 30: aload 5
      // 32: invokestatic pis.l5m (Lerg;Lt9d;Lmew;)Z
      // 35: iload 3
      // 36: ifeq 5a
      // 39: ifeq 6c
      // 3c: goto 43
      // 3f: invokestatic r97$13.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 4
      // 45: iload 3
      // 46: ifeq 5f
      // 49: goto 50
      // 4c: invokestatic r97$13.a (Loov;)Loov;
      // 4f: athrow
      // 50: getfield t9d.v0f Z
      // 53: goto 5a
      // 56: invokestatic r97$13.a (Loov;)Loov;
      // 59: athrow
      // 5a: ifne 78
      // 5d: aload 4
      // 5f: sipush 2005
      // 62: aload 5
      // 64: bipush 0
      // 65: invokevirtual t9d.qca (ILmew;I)V
      // 68: iload 3
      // 69: ifne 78
      // 6c: aload 0
      // 6d: bipush 0
      // 6e: putfield r97$13.ald Z
      // 71: goto 78
      // 74: invokestatic r97$13.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 2
      // 79: areturn
      // 7a: aload 0
      // 7b: aload 1
      // 7c: aload 2
      // 7d: invokespecial kea.lno (Lsdf;Lerg;)Lerg;
      // 80: areturn
   }

   @Override
   public void d_l(sdf param1) {
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
      // 05: getfield r97$13.ald Z
      // 08: ifeq 29
      // 0b: aload 1
      // 0c: invokeinterface sdf.acz ()Lt9d; 1
      // 11: sipush 1000
      // 14: aload 1
      // 15: invokeinterface sdf.taq ()Lmew; 1
      // 1a: bipush 0
      // 1b: invokevirtual t9d.qca (ILmew;I)V
      // 1e: iload 2
      // 1f: ifne 43
      // 22: goto 29
      // 25: invokestatic r97$13.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 1
      // 2a: invokeinterface sdf.acz ()Lt9d; 1
      // 2f: sipush 1001
      // 32: aload 1
      // 33: invokeinterface sdf.taq ()Lmew; 1
      // 38: bipush 0
      // 39: invokevirtual t9d.qca (ILmew;I)V
      // 3c: goto 43
      // 3f: invokestatic r97$13.a (Loov;)Loov;
      // 42: athrow
      // 43: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
