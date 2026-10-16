public class doc extends u10 {
   public doc(t9d var1) {
      super(var1);
      this.yxc(0.7F, 0.5F);
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(12.0);
   }

   @Override
   public boolean _nm(i2h param1) {
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
      // 05: aload 1
      // 06: invokespecial u10._nm (Li2h;)Z
      // 09: iload 2
      // 0a: ifeq 9a
      // 0d: ifeq 99
      // 10: goto 17
      // 13: invokestatic doc.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 1
      // 18: instanceof g_3
      // 1b: iload 2
      // 1c: ifeq 98
      // 1f: goto 26
      // 22: invokestatic doc.a (Loov;)Loov;
      // 25: athrow
      // 26: ifeq 97
      // 29: goto 30
      // 2c: invokestatic doc.a (Loov;)Loov;
      // 2f: athrow
      // 30: bipush 0
      // 31: istore 3
      // 32: aload 0
      // 33: getfield doc.oay Lt9d;
      // 36: invokevirtual t9d.rbk ()Lv66;
      // 39: getstatic v66.b_4 Lv66;
      // 3c: iload 2
      // 3d: ifeq 62
      // 40: if_acmpne 51
      // 43: goto 4a
      // 46: invokestatic doc.a (Loov;)Loov;
      // 49: athrow
      // 4a: bipush 7
      // 4c: istore 3
      // 4d: iload 2
      // 4e: ifne 68
      // 51: aload 0
      // 52: getfield doc.oay Lt9d;
      // 55: invokevirtual t9d.rbk ()Lv66;
      // 58: getstatic v66.csg Lv66;
      // 5b: goto 62
      // 5e: invokestatic doc.a (Loov;)Loov;
      // 61: athrow
      // 62: if_acmpne 68
      // 65: bipush 15
      // 67: istore 3
      // 68: iload 3
      // 69: iload 2
      // 6a: ifeq 98
      // 6d: ifle 97
      // 70: goto 77
      // 73: invokestatic doc.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 1
      // 78: checkcast g_3
      // 7b: new sdj
      // 7e: dup
      // 7f: getstatic mcs.veq Lmcs;
      // 82: getfield mcs.zr9 I
      // 85: iload 3
      // 86: bipush 20
      // 88: imul
      // 89: bipush 0
      // 8a: invokespecial sdj.<init> (III)V
      // 8d: invokevirtual g_3.gmn (Lsdj;)V
      // 90: goto 97
      // 93: invokestatic doc.a (Loov;)Loov;
      // 96: athrow
      // 97: bipush 1
      // 98: ireturn
      // 99: bipush 0
      // 9a: ireturn
   }

   @Override
   public ps6 hx8(css var1, ps6 var2) {
      return var2;
   }

   @Override
   public float c5y() {
      return 0.45F;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
