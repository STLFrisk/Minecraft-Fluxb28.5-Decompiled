public class eel extends e0x {
   public boolean d0y;

   public eel(p3y var1, boolean var2) {
      super(var1);
      this.d0y = var2;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean ron(m5n param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne 38
      // 0b: getfield eel.d0y Z
      // 0e: ifne 37
      // 11: goto 18
      // 14: invokestatic eel.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: aload 2
      // 1a: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 1f: invokeinterface zfz.r_y ()Le0x; 1
      // 24: aload 0
      // 25: if_acmpne 37
      // 28: goto 2f
      // 2b: invokestatic eel.b (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 0
      // 30: goto 3e
      // 33: invokestatic eel.b (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: aload 1
      // 39: aload 2
      // 3a: aload 3
      // 3b: invokespecial e0x.ron (Lm5n;Lmew;Lvt2;)Z
      // 3e: ireturn
   }

   private static oov b(oov var0) {
      return var0;
   }
}
