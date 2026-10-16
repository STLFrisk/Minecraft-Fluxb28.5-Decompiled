import com.google.common.base.Function;

public class u51 extends pql {
   public u51(e0x var1, e0x var2, Function var3) {
      super(var1, var2, var3);
   }

   @Override
   public int bu9(erg param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokevirtual erg.j6_ ()I
      // 08: invokestatic ldj$vn8.voe (I)Lldj$vn8;
      // 0b: astore 4
      // 0d: aload 4
      // 0f: getstatic ldj$vn8.h4k Lldj$vn8;
      // 12: iload 3
      // 13: ifne 2c
      // 16: if_acmpeq 3c
      // 19: goto 20
      // 1c: invokestatic u51.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 4
      // 22: getstatic ldj$vn8.t7o Lldj$vn8;
      // 25: goto 2c
      // 28: invokestatic u51.a (Loov;)Loov;
      // 2b: athrow
      // 2c: if_acmpeq 3c
      // 2f: aload 0
      // 30: aload 1
      // 31: iload 2
      // 32: invokespecial pql.bu9 (Lerg;I)I
      // 35: goto 43
      // 38: invokestatic u51.a (Loov;)Loov;
      // 3b: athrow
      // 3c: ldc2_w 0.5
      // 3f: dconst_1
      // 40: invokestatic vfg.vkm (DD)I
      // 43: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
