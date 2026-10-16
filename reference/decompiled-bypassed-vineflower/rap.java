public class rap extends cjm {
   public rap(laq var1, double var2) {
      this.pz6 = var1;
      this.vz0 = var2;
      this.k23(1);
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield rap.pz6 Llaq;
      // 08: iload 1
      // 09: ifne 23
      // 0c: invokevirtual laq.k8l ()Z
      // 0f: ifeq 1f
      // 12: goto 19
      // 15: invokestatic rap.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 0
      // 1a: ireturn
      // 1b: invokestatic rap.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield rap.pz6 Llaq;
      // 23: invokevirtual laq.plj ()Lmew;
      // 26: astore 2
      // 27: aload 0
      // 28: getfield rap.pz6 Llaq;
      // 2b: bipush 16
      // 2d: bipush 7
      // 2f: new fqr
      // 32: dup
      // 33: aload 2
      // 34: invokevirtual mew.getX ()I
      // 37: i2d
      // 38: aload 2
      // 39: invokevirtual mew.getY ()I
      // 3c: i2d
      // 3d: aload 2
      // 3e: invokevirtual mew.getZ ()I
      // 41: i2d
      // 42: invokespecial fqr.<init> (DDD)V
      // 45: invokestatic zim.ity (Llaq;IILfqr;)Lfqr;
      // 48: astore 3
      // 49: iload 1
      // 4a: ifne 76
      // 4d: aload 3
      // 4e: ifnonnull 5e
      // 51: goto 58
      // 54: invokestatic rap.a (Loov;)Loov;
      // 57: athrow
      // 58: bipush 0
      // 59: ireturn
      // 5a: invokestatic rap.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 0
      // 5f: aload 3
      // 60: getfield fqr.lvi D
      // 63: putfield rap.fd3 D
      // 66: aload 0
      // 67: aload 3
      // 68: getfield fqr.gn5 D
      // 6b: putfield rap.rve D
      // 6e: aload 0
      // 6f: aload 3
      // 70: getfield fqr.bn2 D
      // 73: putfield rap._38 D
      // 76: bipush 1
      // 77: ireturn
   }

   @Override
   public boolean wh3() {
      int var1 = t9d.c();

      try {
         boolean var10000 = this.pz6.zq2().j07();
         if (var1 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public void mnp() {
      this.pz6.zq2().ni_(this.fd3, this.rve, this._38, this.vz0);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
