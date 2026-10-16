public abstract class jd3 extends yqv implements w55 {
   public jd3(OpaquePredicate var1) {
      super(var1);
   }

   @Override
   public boolean s53() {
      return true;
   }

   @Override
   public boolean iaw() {
      return true;
   }

   @Override
   public boolean m63() {
      return this.oay.g17(this.aaw(), this);
   }

   @Override
   public int u8h() {
      return 120;
   }

   @Override
   public boolean kz3() {
      return true;
   }

   @Override
   public int _96(ha9 var1) {
      return 1 + this.oay.fsy.nextInt(3);
   }

   @Override
   public void mwr() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual jd3.n5m ()I
      // 04: istore 2
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: aload 0
      // 09: invokespecial yqv.mwr ()V
      // 0c: istore 1
      // 0d: aload 0
      // 0e: iload 1
      // 0f: ifne 7c
      // 12: invokevirtual jd3.gzr ()Z
      // 15: ifeq 74
      // 18: goto 1f
      // 1b: invokestatic jd3.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 1
      // 21: ifne 7c
      // 24: goto 2b
      // 27: invokestatic jd3.a (Loov;)Loov;
      // 2a: athrow
      // 2b: invokevirtual jd3.mwv ()Z
      // 2e: ifne 74
      // 31: goto 38
      // 34: invokestatic jd3.a (Loov;)Loov;
      // 37: athrow
      // 38: iinc 2 -1
      // 3b: aload 0
      // 3c: iload 2
      // 3d: invokevirtual jd3.yoc (I)V
      // 40: aload 0
      // 41: invokevirtual jd3.n5m ()I
      // 44: iload 1
      // 45: ifne 6f
      // 48: goto 4f
      // 4b: invokestatic jd3.a (Loov;)Loov;
      // 4e: athrow
      // 4f: bipush -20
      // 51: if_icmpne 82
      // 54: goto 5b
      // 57: invokestatic jd3.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 0
      // 5c: bipush 0
      // 5d: invokevirtual jd3.yoc (I)V
      // 60: aload 0
      // 61: getstatic ofh.e7v Lofh;
      // 64: fconst_2
      // 65: invokevirtual jd3.m1t (Lofh;F)Z
      // 68: goto 6f
      // 6b: invokestatic jd3.a (Loov;)Loov;
      // 6e: athrow
      // 6f: pop
      // 70: iload 1
      // 71: ifeq 82
      // 74: aload 0
      // 75: goto 7c
      // 78: invokestatic jd3.a (Loov;)Loov;
      // 7b: athrow
      // 7c: sipush 300
      // 7f: invokevirtual jd3.yoc (I)V
      // 82: return
   }

   @Override
   public boolean ycw() {
      return false;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
