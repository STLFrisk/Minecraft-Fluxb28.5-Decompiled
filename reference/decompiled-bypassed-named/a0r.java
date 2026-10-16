public class a0r extends vrx {
   public a0r(rsi var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean xvl(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokestatic net/minecraft/tileentity/TileEntityFurnace.wlb (Lerg;)Z
      // 08: iload 2
      // 09: ifeq 30
      // 0c: ifne 2f
      // 0f: goto 16
      // 12: invokestatic a0r.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokestatic a0r.zeg (Lerg;)Z
      // 1a: iload 2
      // 1b: ifeq 30
      // 1e: goto 25
      // 21: invokestatic a0r.a (Loov;)Loov;
      // 24: athrow
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic a0r.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   @Override
   public int n29(erg var1) {
      int var2 = OpaquePredicate.c();

      try {
         byte var10000 = zeg(var1);
         if (var2 != 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return super.n29(var1);
   }

   public static boolean zeg(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 14
      // 09: ifnull 3e
      // 0c: goto 13
      // 0f: invokestatic a0r.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual erg.gn1 ()Lu7m;
      // 17: iload 1
      // 18: ifeq 30
      // 1b: ifnull 3e
      // 1e: goto 25
      // 21: invokestatic a0r.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual erg.gn1 ()Lu7m;
      // 29: goto 30
      // 2c: invokestatic a0r.a (Loov;)Loov;
      // 2f: athrow
      // 30: getstatic xbr.xxz Lu7m;
      // 33: if_acmpne 3e
      // 36: bipush 1
      // 37: goto 3f
      // 3a: invokestatic a0r.a (Loov;)Loov;
      // 3d: athrow
      // 3e: bipush 0
      // 3f: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
