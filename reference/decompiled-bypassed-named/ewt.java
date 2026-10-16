public class ewt extends _f3 {
   public ewt(OpaquePredicate var1) {
      super(var1);
   }

   public ewt(OpaquePredicate var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   @Override
   public boolean k25(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield ewt.wgv Li2h;
      // 08: iload 2
      // 09: ifne 61
      // 0c: ifnull 52
      // 0f: goto 16
      // 12: invokestatic ewt.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield ewt.wgv Li2h;
      // 1a: iload 2
      // 1b: ifne 61
      // 1e: goto 25
      // 21: invokestatic ewt.b (Loov;)Loov;
      // 24: athrow
      // 25: instanceof ha9
      // 28: ifeq 52
      // 2b: goto 32
      // 2e: invokestatic ewt.b (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield ewt.wgv Li2h;
      // 36: iload 2
      // 37: ifne 61
      // 3a: goto 41
      // 3d: invokestatic ewt.b (Loov;)Loov;
      // 40: athrow
      // 41: aload 1
      // 42: if_acmpeq 52
      // 45: goto 4c
      // 48: invokestatic ewt.b (Loov;)Loov;
      // 4b: athrow
      // 4c: bipush 1
      // 4d: ireturn
      // 4e: invokestatic ewt.b (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: iload 2
      // 54: ifne 85
      // 57: getfield ewt.wgv Li2h;
      // 5a: goto 61
      // 5d: invokestatic ewt.b (Loov;)Loov;
      // 60: athrow
      // 61: ifnull 84
      // 64: aload 0
      // 65: iload 2
      // 66: ifne 85
      // 69: goto 70
      // 6c: invokestatic ewt.b (Loov;)Loov;
      // 6f: athrow
      // 70: getfield ewt.wgv Li2h;
      // 73: aload 1
      // 74: if_acmpeq 84
      // 77: goto 7e
      // 7a: invokestatic ewt.b (Loov;)Loov;
      // 7d: athrow
      // 7e: bipush 0
      // 7f: ireturn
      // 80: invokestatic ewt.b (Loov;)Loov;
      // 83: athrow
      // 84: aload 0
      // 85: getfield ewt.oay Lt9d;
      // 88: getfield OpaquePredicate.v0f Z
      // 8b: iload 2
      // 8c: ifne a6
      // 8f: ifne a5
      // 92: goto 99
      // 95: invokestatic ewt.b (Loov;)Loov;
      // 98: athrow
      // 99: aload 1
      // 9a: aload 0
      // 9b: invokevirtual ha9.nw9 (Li2h;)V
      // 9e: goto a5
      // a1: invokestatic ewt.b (Loov;)Loov;
      // a4: athrow
      // a5: bipush 1
      // a6: ireturn
   }

   @Override
   public void xr9(int param1, int param2, int param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: iload 4
      // 07: ifeq 6a
      // 0a: aload 0
      // 0b: iload 5
      // 0d: ifeq 37
      // 10: goto 17
      // 13: invokestatic ewt.b (Loov;)Loov;
      // 16: athrow
      // 17: getfield ewt.wgv Li2h;
      // 1a: ifnull 36
      // 1d: goto 24
      // 20: invokestatic ewt.b (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield ewt.wgv Li2h;
      // 28: aconst_null
      // 29: checkcast EntityLivingBase
      // 2c: invokevirtual EntityLivingBase.nw9 (Li2h;)V
      // 2f: goto 36
      // 32: invokestatic ewt.b (Loov;)Loov;
      // 35: athrow
      // 36: aload 0
      // 37: iload 5
      // 39: ifeq 67
      // 3c: invokevirtual ewt.hg2 ()I
      // 3f: ifne 6a
      // 42: goto 49
      // 45: invokestatic ewt.b (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 0
      // 4b: invokevirtual ewt.ov7 ()I
      // 4e: ineg
      // 4f: invokevirtual ewt.leq (I)V
      // 52: aload 0
      // 53: bipush 10
      // 55: invokevirtual ewt.iux (I)V
      // 58: aload 0
      // 59: ldc 50.0
      // 5b: nop
      // 5c: invokevirtual ewt.xbf (F)V
      // 5f: aload 0
      // 60: goto 67
      // 63: invokestatic ewt.b (Loov;)Loov;
      // 66: athrow
      // 67: invokevirtual ewt.dxm ()V
      // 6a: return
   }

   @Override
   public _f3$c3d x38() {
      return _f3$c3d.g3j;
   }

   private static oov b(oov var0) {
      return var0;
   }
}
