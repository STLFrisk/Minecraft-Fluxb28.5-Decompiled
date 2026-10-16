public class hzu$win {
   private final int qh9;
   private boolean vv8 = false;

   public hzu$win(int var1) {
      this.qh9 = var1;
   }

   public void iiq() {
      this.awg(false);
   }

   public void mdn() {
      this.awg(true);
   }

   public void awg(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 24
      // 09: aload 0
      // 0a: getfield hzu$win.vv8 Z
      // 0d: if_icmpeq 52
      // 10: goto 17
      // 13: invokestatic hzu$win.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield hzu$win.vv8 Z
      // 1c: iload 1
      // 1d: goto 24
      // 20: invokestatic hzu$win.a (Loov;)Loov;
      // 23: athrow
      // 24: iload 2
      // 25: ifne 4f
      // 28: ifeq 44
      // 2b: goto 32
      // 2e: invokestatic hzu$win.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield hzu$win.qh9 I
      // 36: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 39: iload 2
      // 3a: ifeq 52
      // 3d: goto 44
      // 40: invokestatic hzu$win.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield hzu$win.qh9 I
      // 48: goto 4f
      // 4b: invokestatic hzu$win.a (Loov;)Loov;
      // 4e: athrow
      // 4f: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 52: return
   }

   public static boolean c8k(hzu$win var0) {
      return var0.vv8;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
