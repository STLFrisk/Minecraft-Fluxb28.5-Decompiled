import java.lang.invoke.MethodHandles;
import java.util.Random;

public class ofe extends vef {
   public ofe(int var1, gdz var2, int var3) {
      super(var1, var2, var3, bn1.egy);
      this.wr5("durability");
   }

   @Override
   public int qwk(int var1) {
      return 5 + (var1 - 1) * 8;
   }

   @Override
   public int fnu(int var1) {
      return super.qwk(var1) + 50;
   }

   @Override
   public int ehp() {
      return 3;
   }

   @Override
   public boolean ovd(erg var1) {
      int var2 = OpaquePredicate.c();

      try {
         boolean var10000 = var1.dw2();
         if (var2 != 0) {
            return var10000;
         }

         if (var10000) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return super.ovd(var1);
   }

   public static boolean mi9(erg param0, int param1, Random param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: invokevirtual erg.gn1 ()Lu7m;
      // 08: instanceof jpt
      // 0b: iload 3
      // 0c: ifeq 45
      // 0f: ifeq 3e
      // 12: goto 19
      // 15: invokestatic ofe.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 2
      // 1a: invokevirtual java/util/Random.nextFloat ()F
      // 1d: ldc 0.6
      // 1f: nop
      // 20: fcmpg
      // 21: iload 3
      // 22: ifeq 45
      // 25: goto 2c
      // 28: invokestatic ofe.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifge 3e
      // 2f: goto 36
      // 32: invokestatic ofe.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 0
      // 37: goto 58
      // 3a: invokestatic ofe.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 2
      // 3f: iload 1
      // 40: bipush 1
      // 41: iadd
      // 42: invokevirtual java/util/Random.nextInt (I)I
      // 45: iload 3
      // 46: ifeq 54
      // 49: ifle 57
      // 4c: goto 53
      // 4f: invokestatic ofe.a (Loov;)Loov;
      // 52: athrow
      // 53: bipush 1
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      c.a(1104899306720978199L, -9077883890894583601L, MethodHandles.lookup().lookupClass()).a(145486056733357L);
      // $VF: monitorexit
   }

   private static oov a(oov var0) {
      return var0;
   }
}
