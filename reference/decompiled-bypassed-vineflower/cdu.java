import java.util.Random;

public abstract class cdu {
   public cdu() {
      this(false);
   }

   public cdu(boolean var1) {
      this.h7t = var1;
   }

   public abstract boolean v3g(t9d var1, Random var2, mew var3);

   public void n3m() {
   }

   public void u0f(t9d param1, mew param2, zfz param3) {
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
      // 06: getfield cdu.h7t Z
      // 09: iload 4
      // 0b: ifeq 3a
      // 0e: ifeq 2c
      // 11: goto 18
      // 14: invokestatic cdu.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: aload 2
      // 1a: aload 3
      // 1b: bipush 3
      // 1c: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1f: pop
      // 20: iload 4
      // 22: ifne 3b
      // 25: goto 2c
      // 28: invokestatic cdu.b (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 1
      // 2d: aload 2
      // 2e: aload 3
      // 2f: bipush 2
      // 30: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 33: goto 3a
      // 36: invokestatic cdu.b (Loov;)Loov;
      // 39: athrow
      // 3a: pop
      // 3b: return
   }

   private static oov b(oov var0) {
      return var0;
   }
}
