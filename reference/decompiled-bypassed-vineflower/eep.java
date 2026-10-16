public class eep extends mcs {
   public eep(int var1, gdz var2, boolean var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public void iqt(g_3 param1, osd param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: iload 3
      // 09: invokespecial mcs.iqt (Lg_3;Losd;I)V
      // 0c: aload 1
      // 0d: iload 4
      // 0f: ifeq 2c
      // 12: invokevirtual g_3.i55 ()F
      // 15: aload 1
      // 16: invokevirtual g_3.axb ()F
      // 19: fcmpl
      // 1a: ifle 33
      // 1d: goto 24
      // 20: invokestatic eep.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 1
      // 25: goto 2c
      // 28: invokestatic eep.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 1
      // 2d: invokevirtual g_3.axb ()F
      // 30: invokevirtual g_3.uh3 (F)V
      // 33: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
