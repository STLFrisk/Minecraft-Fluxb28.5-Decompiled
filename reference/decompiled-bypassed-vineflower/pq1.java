public class pq1 extends i2h {
   public final qxu zzu;
   public final String fb_;

   public pq1(qxu var1, String var2, float var3, float var4) {
      super(var1.sz5());
      this.yxc(var3, var4);
      this.zzu = var1;
      this.fb_ = var2;
   }

   @Override
   public void tbj() {
   }

   @Override
   public void cjb(bdo var1) {
   }

   @Override
   public void srs(bdo var1) {
   }

   @Override
   public boolean mzu() {
      return true;
   }

   @Override
   public boolean m1t(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 20
      // 09: aload 1
      // 0a: invokevirtual pq1.nss (Lofh;)Z
      // 0d: ifeq 1f
      // 10: goto 17
      // 13: invokestatic pq1.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: goto 2b
      // 1b: invokestatic pq1.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield pq1.zzu Lqxu;
      // 23: aload 0
      // 24: aload 1
      // 25: fload 2
      // 26: invokeinterface qxu.ojr (Lpq1;Lofh;F)Z 4
      // 2b: ireturn
   }

   @Override
   public boolean ipr(i2h param1) {
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
      // 05: iload 2
      // 06: ifeq 1c
      // 09: aload 1
      // 0a: if_acmpeq 23
      // 0d: goto 14
      // 10: invokestatic pq1.a (Loov;)Loov;
      // 13: athrow
      // 14: aload 0
      // 15: goto 1c
      // 18: invokestatic pq1.a (Loov;)Loov;
      // 1b: athrow
      // 1c: getfield pq1.zzu Lqxu;
      // 1f: aload 1
      // 20: if_acmpne 2b
      // 23: bipush 1
      // 24: goto 2c
      // 27: invokestatic pq1.a (Loov;)Loov;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
