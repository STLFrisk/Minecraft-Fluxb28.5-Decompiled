public class zwr$m2b {
   public long zsl;
   public final ClientState ten;

   public zwr$m2b(ClientState var1) {
      this.ten = var1;
      this.zsl = System.nanoTime() / 1000000L;
   }

   public boolean szo(long param1, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: invokevirtual zwr$m2b.u75 ()J
      // 09: lload 1
      // 0a: lcmp
      // 0b: iload 4
      // 0d: ifne 3f
      // 10: iflt 3e
      // 13: goto 1a
      // 16: invokestatic zwr$m2b.a (Loov;)Loov;
      // 19: athrow
      // 1a: iload 3
      // 1b: iload 4
      // 1d: ifne 3d
      // 20: goto 27
      // 23: invokestatic zwr$m2b.a (Loov;)Loov;
      // 26: athrow
      // 27: ifeq 3c
      // 2a: goto 31
      // 2d: invokestatic zwr$m2b.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: invokevirtual zwr$m2b.l1_ ()V
      // 35: goto 3c
      // 38: invokestatic zwr$m2b.a (Loov;)Loov;
      // 3b: athrow
      // 3c: bipush 1
      // 3d: ireturn
      // 3e: bipush 0
      // 3f: ireturn
   }

   public long u75() {
      return System.nanoTime() / 1000000L - this.zsl;
   }

   public void l1_() {
      this.zsl = System.nanoTime() / 1000000L;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
