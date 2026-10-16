public class dbu$2 implements y_f {
   public final gdz ajd;
   public final String yf4;
   public final rv2$nlt giy;
   public final dbu rnn;

   public dbu$2(dbu var1, String var2, rv2$nlt var3) {
      this.rnn = var1;
      this.yf4 = var2;
      this.giy = var3;
      this.ajd = new gdz(this.yf4, this.giy.ssp());
   }

   @Override
   public int h_s() {
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
      // 05: getfield dbu$2.rnn Ldbu;
      // 08: invokestatic dbu.gl0 (Ldbu;)Lzlg;
      // 0b: aload 0
      // 0c: getfield dbu$2.ajd Lgdz;
      // 0f: invokevirtual zlg._gz (Ljava/lang/Object;)Ljava/lang/Object;
      // 12: checkcast z7p
      // 15: astore 2
      // 16: aload 2
      // 17: iload 1
      // 18: ifne 2e
      // 1b: ifnonnull 2d
      // 1e: goto 25
      // 21: invokestatic dbu$2.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 0
      // 26: goto 31
      // 29: invokestatic dbu$2.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 2
      // 2e: invokevirtual z7p.h_s ()I
      // 31: ireturn
   }

   public vas npr() {
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
      // 05: getfield dbu$2.rnn Ldbu;
      // 08: invokestatic dbu.gl0 (Ldbu;)Lzlg;
      // 0b: aload 0
      // 0c: getfield dbu$2.ajd Lgdz;
      // 0f: invokevirtual zlg._gz (Ljava/lang/Object;)Ljava/lang/Object;
      // 12: checkcast z7p
      // 15: astore 2
      // 16: aload 2
      // 17: iload 1
      // 18: ifne 30
      // 1b: ifnonnull 2f
      // 1e: goto 25
      // 21: invokestatic dbu$2.a (Loov;)Loov;
      // 24: athrow
      // 25: getstatic dbu.e5c Lvas;
      // 28: goto 33
      // 2b: invokestatic dbu$2.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 2
      // 30: invokevirtual z7p.npr ()Lvas;
      // 33: areturn
   }

   @Override
   public Object npr() {
      return this.npr();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
