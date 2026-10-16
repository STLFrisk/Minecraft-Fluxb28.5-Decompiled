public class _tb extends cjm {
   public _tb(EntityPlayer var1, double var2) {
      this(var1, var2, 120);
   }

   public _tb(EntityPlayer var1, double var2, int var4) {
      this.qgq = var1;
      this.k8k = var2;
      this.xwc = var4;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 5d
      // 09: getfield _tb.xfm Z
      // 0c: ifne 5c
      // 0f: goto 16
      // 12: invokestatic _tb.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield _tb.qgq Llaq;
      // 1a: invokevirtual EntityPlayer.c67 ()I
      // 1d: iload 1
      // 1e: ifne 53
      // 21: goto 28
      // 24: invokestatic _tb.a (Loov;)Loov;
      // 27: athrow
      // 28: bipush 100
      // 2a: if_icmplt 3a
      // 2d: goto 34
      // 30: invokestatic _tb.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
      // 36: invokestatic _tb.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield _tb.qgq Llaq;
      // 3e: iload 1
      // 3f: ifne 60
      // 42: invokevirtual EntityPlayer.mbr ()Ljava/util/Random;
      // 45: aload 0
      // 46: getfield _tb.xwc I
      // 49: invokevirtual java/util/Random.nextInt (I)I
      // 4c: goto 53
      // 4f: invokestatic _tb.a (Loov;)Loov;
      // 52: athrow
      // 53: ifeq 5c
      // 56: bipush 0
      // 57: ireturn
      // 58: invokestatic _tb.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield _tb.qgq Llaq;
      // 60: bipush 10
      // 62: bipush 7
      // 64: invokestatic zim.jb8 (Llaq;II)Lfqr;
      // 67: astore 2
      // 68: iload 1
      // 69: ifne 9a
      // 6c: aload 2
      // 6d: ifnonnull 7d
      // 70: goto 77
      // 73: invokestatic _tb.a (Loov;)Loov;
      // 76: athrow
      // 77: bipush 0
      // 78: ireturn
      // 79: invokestatic _tb.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 0
      // 7e: aload 2
      // 7f: getfield fqr.lvi D
      // 82: putfield _tb.ei1 D
      // 85: aload 0
      // 86: aload 2
      // 87: getfield fqr.gn5 D
      // 8a: putfield _tb.y52 D
      // 8d: aload 0
      // 8e: aload 2
      // 8f: getfield fqr.bn2 D
      // 92: putfield _tb.p4f D
      // 95: aload 0
      // 96: bipush 0
      // 97: putfield _tb.xfm Z
      // 9a: bipush 1
      // 9b: ireturn
   }

   @Override
   public boolean wh3() {
      int var1 = OpaquePredicate.b();

      try {
         boolean var10000 = this.qgq.zq2().j07();
         if (var1 == 0) {
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
      this.qgq.zq2().ni_(this.ei1, this.y52, this.p4f, this.k8k);
   }

   public void x6d() {
      this.xfm = true;
   }

   public void kj8(int var1) {
      this.xwc = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
