public class v5l extends g0_ {
   public v5l(gmu var1) {
      super(var1);
   }

   @Override
   public void x8r() {
      this.f8y = new z14(0.5F);
      this.rna = new z14(1.0F);
   }

   public void x4k(z14 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual v5l._w1 (Lz14;)V
      // 09: iload 3
      // 0a: ifeq 47
      // 0d: iload 2
      // 0e: tableswitch 154 1 4 34 61 96 131
      // 2c: invokestatic v5l.b (Loov;)Loov;
      // 2f: athrow
      // 30: aload 1
      // 31: getfield z14.v3l Ltf8;
      // 34: bipush 1
      // 35: putfield tf8.b16 Z
      // 38: aload 1
      // 39: getfield z14.zv5 Ltf8;
      // 3c: bipush 1
      // 3d: putfield tf8.b16 Z
      // 40: goto 47
      // 43: invokestatic v5l.b (Loov;)Loov;
      // 46: athrow
      // 47: iload 3
      // 48: ifne a8
      // 4b: aload 1
      // 4c: getfield z14.s87 Ltf8;
      // 4f: bipush 1
      // 50: putfield tf8.b16 Z
      // 53: aload 1
      // 54: getfield z14.v3l Ltf8;
      // 57: bipush 1
      // 58: putfield tf8.b16 Z
      // 5b: aload 1
      // 5c: getfield z14.zv5 Ltf8;
      // 5f: bipush 1
      // 60: putfield tf8.b16 Z
      // 63: iload 3
      // 64: ifne a8
      // 67: goto 6e
      // 6a: invokestatic v5l.b (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 1
      // 6f: getfield z14.s87 Ltf8;
      // 72: bipush 1
      // 73: putfield tf8.b16 Z
      // 76: aload 1
      // 77: getfield z14.xwb Ltf8;
      // 7a: bipush 1
      // 7b: putfield tf8.b16 Z
      // 7e: aload 1
      // 7f: getfield z14.hd2 Ltf8;
      // 82: bipush 1
      // 83: putfield tf8.b16 Z
      // 86: iload 3
      // 87: ifne a8
      // 8a: goto 91
      // 8d: invokestatic v5l.b (Loov;)Loov;
      // 90: athrow
      // 91: aload 1
      // 92: getfield z14.wtl Ltf8;
      // 95: bipush 1
      // 96: putfield tf8.b16 Z
      // 99: aload 1
      // 9a: getfield z14.lxi Ltf8;
      // 9d: bipush 1
      // 9e: putfield tf8.b16 Z
      // a1: goto a8
      // a4: invokestatic v5l.b (Loov;)Loov;
      // a7: athrow
      // a8: return
   }

   public void _w1(z14 var1) {
      var1.sy2(false);
   }

   @Override
   public void rqn(g6r var1, int var2) {
      this.x4k((z14)var1, var2);
   }

   private static oov b(oov var0) {
      return var0;
   }
}
