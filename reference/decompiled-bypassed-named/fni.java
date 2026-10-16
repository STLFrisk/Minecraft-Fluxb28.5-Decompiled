public class fni extends j0j {
   public cdu yl_ = new ork(ox_.p5a);

   @Override
   public void nvi(gyu param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokevirtual fni.mbd ()V
      // 08: aload 0
      // 09: getfield fni.rsu Ljava/util/Random;
      // 0c: bipush 5
      // 0d: invokevirtual java/util/Random.nextInt (I)I
      // 10: iload 2
      // 11: ifeq 62
      // 14: ifne 5b
      // 17: goto 1e
      // 1a: invokestatic fni.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield fni.rsu Ljava/util/Random;
      // 22: bipush 16
      // 24: invokevirtual java/util/Random.nextInt (I)I
      // 27: bipush 8
      // 29: iadd
      // 2a: istore 3
      // 2b: aload 0
      // 2c: getfield fni.rsu Ljava/util/Random;
      // 2f: bipush 16
      // 31: invokevirtual java/util/Random.nextInt (I)I
      // 34: bipush 8
      // 36: iadd
      // 37: istore 4
      // 39: aload 0
      // 3a: getfield fni.yl_ Lcdu;
      // 3d: aload 0
      // 3e: getfield fni.noy Lt9d;
      // 41: aload 0
      // 42: getfield fni.rsu Ljava/util/Random;
      // 45: aload 0
      // 46: getfield fni.noy Lt9d;
      // 49: aload 0
      // 4a: getfield fni.n_g Lmew;
      // 4d: iload 3
      // 4e: bipush 0
      // 4f: iload 4
      // 51: invokevirtual mew.ec4 (III)Lmew;
      // 54: invokevirtual OpaquePredicate.pnv (Lmew;)Lmew;
      // 57: invokevirtual cdu.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 5a: pop
      // 5b: aload 0
      // 5c: getfield fni.n_g Lmew;
      // 5f: invokevirtual mew.getX ()I
      // 62: iload 2
      // 63: ifeq 7e
      // 66: ifne ab
      // 69: goto 70
      // 6c: invokestatic fni.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield fni.n_g Lmew;
      // 74: invokevirtual mew.getZ ()I
      // 77: goto 7e
      // 7a: invokestatic fni.a (Loov;)Loov;
      // 7d: athrow
      // 7e: ifne ab
      // 81: new fcs
      // 84: dup
      // 85: aload 0
      // 86: getfield fni.noy Lt9d;
      // 89: invokespecial fcs.<init> (Lt9d;)V
      // 8c: astore 3
      // 8d: aload 3
      // 8e: dconst_0
      // 8f: ldc2_w 128.0
      // 92: dconst_0
      // 93: aload 0
      // 94: getfield fni.rsu Ljava/util/Random;
      // 97: invokevirtual java/util/Random.nextFloat ()F
      // 9a: ldc 360.0
      // 9c: nop
      // 9d: fmul
      // 9e: fconst_0
      // 9f: invokevirtual fcs.x24 (DDDFF)V
      // a2: aload 0
      // a3: getfield fni.noy Lt9d;
      // a6: aload 3
      // a7: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // aa: pop
      // ab: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
