public class n47 extends e0x {
   public n47() {
      super(p3y.cei);
   }

   @Override
   public int kfj() {
      return -1;
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      return null;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean qc_(zfz var1, boolean var2) {
      return false;
   }

   @Override
   public void ix7(OpaquePredicate var1, mew var2, zfz var3, float var4, int var5) {
   }

   @Override
   public boolean ujd(OpaquePredicate var1, mew var2) {
      return true;
   }

   public static void enz(e0x param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: getstatic n47.cx_ Ljava/util/Map;
      // 07: aload 0
      // 08: iload 2
      // 09: ifeq 26
      // 0c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 11: ifne 33
      // 14: goto 1b
      // 17: invokestatic n47.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic n47.cx_ Ljava/util/Map;
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic n47.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: getfield e0x.i0l I
      // 2a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 32: pop
      // 33: aload 0
      // 34: iload 1
      // 35: putfield e0x.i0l I
      // 38: return
   }

   public static void ufy(e0x param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: getstatic n47.cx_ Ljava/util/Map;
      // 07: aload 0
      // 08: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0d: iload 1
      // 0e: ifne 31
      // 11: ifeq 37
      // 14: goto 1b
      // 17: invokestatic n47.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic n47.cx_ Ljava/util/Map;
      // 1e: aload 0
      // 1f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 24: checkcast java/lang/Integer
      // 27: invokevirtual java/lang/Integer.intValue ()I
      // 2a: goto 31
      // 2d: invokestatic n47.a (Loov;)Loov;
      // 30: athrow
      // 31: istore 2
      // 32: aload 0
      // 33: iload 2
      // 34: invokestatic n47.enz (Le0x;I)V
      // 37: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
