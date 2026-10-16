public class pni$dqe {
   public final int dgm;
   public Object zse;
   public pni$dqe g7y;
   public final int f78;

   public pni$dqe(int var1, int var2, Object var3, pni$dqe var4) {
      this.zse = var3;
      this.g7y = var4;
      this.dgm = var2;
      this.f78 = var1;
   }

   public final int udk() {
      return this.dgm;
   }

   public final Object lql() {
      return this.zse;
   }

   @Override
   public final boolean equals(Object param1) {
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
      // 05: iload 2
      // 06: ifeq 1d
      // 09: instanceof pni$dqe
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic pni$dqe.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic pni$dqe.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: checkcast pni$dqe
      // 20: astore 3
      // 21: aload 0
      // 22: invokevirtual pni$dqe.udk ()I
      // 25: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 28: astore 4
      // 2a: aload 3
      // 2b: invokevirtual pni$dqe.udk ()I
      // 2e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 31: astore 5
      // 33: aload 4
      // 35: iload 2
      // 36: ifeq 7c
      // 39: aload 5
      // 3b: if_acmpeq 71
      // 3e: goto 45
      // 41: invokestatic pni$dqe.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 4
      // 47: iload 2
      // 48: ifeq 5e
      // 4b: goto 52
      // 4e: invokestatic pni$dqe.a (Loov;)Loov;
      // 51: athrow
      // 52: ifnull c8
      // 55: goto 5c
      // 58: invokestatic pni$dqe.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 4
      // 5e: aload 5
      // 60: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 63: iload 2
      // 64: ifeq c9
      // 67: ifeq c8
      // 6a: goto 71
      // 6d: invokestatic pni$dqe.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 0
      // 72: invokevirtual pni$dqe.lql ()Ljava/lang/Object;
      // 75: goto 7c
      // 78: invokestatic pni$dqe.a (Loov;)Loov;
      // 7b: athrow
      // 7c: astore 6
      // 7e: aload 3
      // 7f: invokevirtual pni$dqe.lql ()Ljava/lang/Object;
      // 82: astore 7
      // 84: aload 6
      // 86: iload 2
      // 87: ifeq 9f
      // 8a: aload 7
      // 8c: if_acmpeq c2
      // 8f: goto 96
      // 92: invokestatic pni$dqe.a (Loov;)Loov;
      // 95: athrow
      // 96: aload 6
      // 98: goto 9f
      // 9b: invokestatic pni$dqe.a (Loov;)Loov;
      // 9e: athrow
      // 9f: iload 2
      // a0: ifeq af
      // a3: ifnull c8
      // a6: goto ad
      // a9: invokestatic pni$dqe.a (Loov;)Loov;
      // ac: athrow
      // ad: aload 6
      // af: aload 7
      // b1: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // b4: iload 2
      // b5: ifeq c9
      // b8: ifeq c8
      // bb: goto c2
      // be: invokestatic pni$dqe.a (Loov;)Loov;
      // c1: athrow
      // c2: bipush 1
      // c3: ireturn
      // c4: invokestatic pni$dqe.a (Loov;)Loov;
      // c7: athrow
      // c8: bipush 0
      // c9: ireturn
   }

   @Override
   public final int hashCode() {
      return pni.brw(this.dgm);
   }

   @Override
   public final String toString() {
      return this.udk() + "=" + this.lql();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
