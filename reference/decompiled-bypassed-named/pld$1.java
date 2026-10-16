import com.google.common.base.Predicate;

public final class pld$1 implements Predicate {
   public boolean uzz(d2q param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual d2q.uc6 ()Lzfz;
      // 08: iload 2
      // 09: ifne 2c
      // 0c: ifnull 7e
      // 0f: goto 16
      // 12: invokestatic pld$1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: iload 2
      // 18: ifne 3f
      // 1b: goto 22
      // 1e: invokestatic pld$1.a (Loov;)Loov;
      // 21: athrow
      // 22: invokevirtual d2q.uc6 ()Lzfz;
      // 25: goto 2c
      // 28: invokestatic pld$1.a (Loov;)Loov;
      // 2b: athrow
      // 2c: invokeinterface zfz.r_y ()Le0x; 1
      // 31: getstatic ox_.hvd Lpld;
      // 34: if_acmpne 7e
      // 37: aload 1
      // 38: goto 3f
      // 3b: invokestatic pld$1.a (Loov;)Loov;
      // 3e: athrow
      // 3f: invokevirtual d2q.lvq ()Lpyk;
      // 42: instanceof net/minecraft/tileentity/TileEntitySkull
      // 45: iload 2
      // 46: ifne 64
      // 49: ifeq 7e
      // 4c: goto 53
      // 4f: invokestatic pld$1.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 1
      // 54: invokevirtual d2q.lvq ()Lpyk;
      // 57: checkcast net/minecraft/tileentity/TileEntitySkull
      // 5a: invokevirtual net/minecraft/tileentity/TileEntitySkull.o4i ()I
      // 5d: goto 64
      // 60: invokestatic pld$1.a (Loov;)Loov;
      // 63: athrow
      // 64: iload 2
      // 65: ifne 7b
      // 68: bipush 1
      // 69: if_icmpne 7e
      // 6c: goto 73
      // 6f: invokestatic pld$1.a (Loov;)Loov;
      // 72: athrow
      // 73: bipush 1
      // 74: goto 7b
      // 77: invokestatic pld$1.a (Loov;)Loov;
      // 7a: athrow
      // 7b: goto 7f
      // 7e: bipush 0
      // 7f: ireturn
   }

   public boolean apply(Object var1) {
      return this.uzz((d2q)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
