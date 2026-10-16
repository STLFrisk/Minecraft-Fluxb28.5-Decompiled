import java.util.Random;

public class xhb extends e0x {
   public xhb() {
      super(p3y.r84);
      this._p_(true);
      this.i3l(uja.mqu);
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.db4;
   }

   @Override
   public int bzr(Random var1) {
      return 4;
   }

   @Override
   public void zvy(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getstatic qe5.lm8 Lqe5;
      // 09: aload 2
      // 0a: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 0d: iload 5
      // 0f: ifne 36
      // 12: bipush 11
      // 14: if_icmple 37
      // 17: goto 1e
      // 1a: invokestatic xhb.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: aload 2
      // 21: aload 1
      // 22: aload 2
      // 23: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 26: bipush 0
      // 27: invokevirtual xhb.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 2a: aload 1
      // 2b: aload 2
      // 2c: invokevirtual t9d.i6x (Lmew;)Z
      // 2f: goto 36
      // 32: invokestatic xhb.a (Loov;)Loov;
      // 35: athrow
      // 36: pop
      // 37: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
