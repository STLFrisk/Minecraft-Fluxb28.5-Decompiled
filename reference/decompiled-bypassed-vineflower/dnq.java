public class dnq extends cjm {
   public dnq(yqv var1) {
      this.px5 = var1;
      this.k23(4);
      ((zvv)var1.zq2()).wxx(true);
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
      // 05: getfield dnq.px5 Lyqv;
      // 08: invokevirtual yqv.mwv ()Z
      // 0b: iload 1
      // 0c: ifne 36
      // 0f: ifne 35
      // 12: goto 19
      // 15: invokestatic dnq.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield dnq.px5 Lyqv;
      // 1d: invokevirtual yqv.b2u ()Z
      // 20: iload 1
      // 21: ifne 36
      // 24: goto 2b
      // 27: invokestatic dnq.a (Loov;)Loov;
      // 2a: athrow
      // 2b: ifeq 39
      // 2e: goto 35
      // 31: invokestatic dnq.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield dnq.px5 Lyqv;
      // 08: iload 1
      // 09: ifeq 2b
      // 0c: invokevirtual yqv.mbr ()Ljava/util/Random;
      // 0f: invokevirtual java/util/Random.nextFloat ()F
      // 12: ldc 0.8
      // 14: nop
      // 15: fcmpg
      // 16: ifge 31
      // 19: goto 20
      // 1c: invokestatic dnq.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield dnq.px5 Lyqv;
      // 24: goto 2b
      // 27: invokestatic dnq.a (Loov;)Loov;
      // 2a: athrow
      // 2b: invokevirtual yqv.wzk ()Lrr0;
      // 2e: invokevirtual rr0.nqf ()V
      // 31: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
