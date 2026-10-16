public class yk4$1$1 implements Runnable {
   public final mew fcn;
   public final yk4$1 srl;

   public yk4$1$1(yk4$1 var1, mew var2) {
      this.srl = var1;
      this.fcn = var2;
   }

   @Override
   public void run() {
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
      // 05: getfield yk4$1$1.srl Lyk4$1;
      // 08: getfield yk4$1.k1n Lt9d;
      // 0b: aload 0
      // 0c: getfield yk4$1$1.fcn Lmew;
      // 0f: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 12: astore 2
      // 13: aload 2
      // 14: iload 1
      // 15: ifne 2d
      // 18: instanceof net/minecraft/tileentity/TileEntityBeacon
      // 1b: ifeq 46
      // 1e: goto 25
      // 21: invokestatic yk4$1$1.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 2
      // 26: goto 2d
      // 29: invokestatic yk4$1$1.a (Loov;)Loov;
      // 2c: athrow
      // 2d: checkcast net/minecraft/tileentity/TileEntityBeacon
      // 30: invokevirtual net/minecraft/tileentity/TileEntityBeacon.l8u ()V
      // 33: aload 0
      // 34: getfield yk4$1$1.srl Lyk4$1;
      // 37: getfield yk4$1.k1n Lt9d;
      // 3a: aload 0
      // 3b: getfield yk4$1$1.fcn Lmew;
      // 3e: getstatic ox_.ayi Lyk4;
      // 41: bipush 1
      // 42: bipush 0
      // 43: invokevirtual t9d.dfj (Lmew;Le0x;II)V
      // 46: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
