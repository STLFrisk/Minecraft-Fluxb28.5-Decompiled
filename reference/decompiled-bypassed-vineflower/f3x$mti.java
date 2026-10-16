public class f3x$mti extends ed7 {
   public final f3x vaa;

   public f3x$mti(f3x var1, c05 var2) {
      super(var2, var1.dt7, var1.o1e, 32, var1.o1e - 64, 10);
      this.vaa = var1;
      this.fai(false);
   }

   @Override
   public int getSize() {
      return l9p.o4r.size();
   }

   @Override
   public void elementClicked(int var1, boolean var2, int var3, int var4) {
   }

   @Override
   public boolean isSelected(int var1) {
      return false;
   }

   @Override
   public int getContentHeight() {
      return this.getSize() * 10;
   }

   @Override
   public void drawBackground() {
      this.vaa.xmz();
   }

   @Override
   public void drawSlot(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 7
      // 05: getstatic l9p.o4r Ljava/util/List;
      // 08: iload 1
      // 09: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e: checkcast _ss
      // 11: astore 8
      // 13: aload 0
      // 14: getfield f3x$mti.vaa Lf3x;
      // 17: aload 0
      // 18: getfield f3x$mti.vaa Lf3x;
      // 1b: invokestatic f3x._vs (Lf3x;)Lowt;
      // 1e: aload 8
      // 20: invokevirtual _ss.xn7 ()Lekw;
      // 23: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 28: iload 2
      // 29: bipush 2
      // 2a: iadd
      // 2b: iload 3
      // 2c: bipush 1
      // 2d: iadd
      // 2e: iload 1
      // 2f: bipush 2
      // 30: irem
      // 31: iload 7
      // 33: ifeq 4c
      // 36: ifne 4a
      // 39: goto 40
      // 3c: invokestatic f3x$mti.a (Loov;)Loov;
      // 3f: athrow
      // 40: ldc 16777215
      // 42: nop
      // 43: goto 4d
      // 46: invokestatic f3x$mti.a (Loov;)Loov;
      // 49: athrow
      // 4a: ldc 9474192
      // 4c: nop
      // 4d: invokevirtual f3x.c_t (Lowt;Ljava/lang/String;III)V
      // 50: aload 8
      // 52: aload 0
      // 53: getfield f3x$mti.vaa Lf3x;
      // 56: invokestatic f3x.h5z (Lf3x;)Lik0;
      // 59: aload 8
      // 5b: invokevirtual ik0.zgq (L_ss;)I
      // 5e: invokevirtual _ss.rbf (I)Ljava/lang/String;
      // 61: astore 9
      // 63: aload 0
      // 64: getfield f3x$mti.vaa Lf3x;
      // 67: aload 0
      // 68: getfield f3x$mti.vaa Lf3x;
      // 6b: invokestatic f3x.lp6 (Lf3x;)Lowt;
      // 6e: aload 9
      // 70: iload 2
      // 71: bipush 2
      // 72: iadd
      // 73: sipush 213
      // 76: iadd
      // 77: aload 0
      // 78: getfield f3x$mti.vaa Lf3x;
      // 7b: invokestatic f3x.xsr (Lf3x;)Lowt;
      // 7e: aload 9
      // 80: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 83: isub
      // 84: iload 3
      // 85: bipush 1
      // 86: iadd
      // 87: iload 1
      // 88: bipush 2
      // 89: irem
      // 8a: iload 7
      // 8c: ifeq a5
      // 8f: ifne a3
      // 92: goto 99
      // 95: invokestatic f3x$mti.a (Loov;)Loov;
      // 98: athrow
      // 99: ldc 16777215
      // 9b: nop
      // 9c: goto a6
      // 9f: invokestatic f3x$mti.a (Loov;)Loov;
      // a2: athrow
      // a3: ldc 9474192
      // a5: nop
      // a6: invokevirtual f3x.c_t (Lowt;Ljava/lang/String;III)V
      // a9: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
