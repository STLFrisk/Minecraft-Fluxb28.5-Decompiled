public class oin {
   public void r_3(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield oin.zi1 [J
      // 04: aload 0
      // 05: getfield oin.c0a I
      // 08: lload 1
      // 09: lastore
      // 0a: invokestatic t9d.b ()I
      // 0d: aload 0
      // 0e: dup
      // 0f: getfield oin.c0a I
      // 12: bipush 1
      // 13: iadd
      // 14: putfield oin.c0a I
      // 17: istore 3
      // 18: aload 0
      // 19: getfield oin.c0a I
      // 1c: sipush 240
      // 1f: iload 3
      // 20: ifeq 4b
      // 23: if_icmpne 39
      // 26: goto 2d
      // 29: invokestatic oin.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: bipush 0
      // 2f: putfield oin.c0a I
      // 32: goto 39
      // 35: invokestatic oin.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: iload 3
      // 3b: ifeq 70
      // 3e: getfield oin.v21 I
      // 41: sipush 240
      // 44: goto 4b
      // 47: invokestatic oin.a (Loov;)Loov;
      // 4a: athrow
      // 4b: if_icmpge 68
      // 4e: aload 0
      // 4f: bipush 0
      // 50: putfield oin.tix I
      // 53: aload 0
      // 54: dup
      // 55: getfield oin.v21 I
      // 58: bipush 1
      // 59: iadd
      // 5a: putfield oin.v21 I
      // 5d: iload 3
      // 5e: ifne 7d
      // 61: goto 68
      // 64: invokestatic oin.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: goto 70
      // 6c: invokestatic oin.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: aload 0
      // 72: getfield oin.c0a I
      // 75: bipush 1
      // 76: iadd
      // 77: invokevirtual oin.pc7 (I)I
      // 7a: putfield oin.tix I
      // 7d: return
   }

   public int g14(long var1, int var3) {
      double var4 = (double)var1 / 1.6666666E7;
      return (int)(var4 * (double)var3);
   }

   public int qva() {
      return this.tix;
   }

   public int kyn() {
      return this.c0a;
   }

   public int pc7(int var1) {
      return var1 % 240;
   }

   public long[] kll() {
      return this.zi1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
