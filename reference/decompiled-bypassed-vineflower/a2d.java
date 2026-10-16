public class a2d {
   public static String sb9(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: invokestatic us/myles/ViaVersion/api/protocol/ProtocolVersion.isRegistered (I)Z
      // 08: iload 1
      // 09: ifne 20
      // 0c: ifne 1f
      // 0f: goto 16
      // 12: invokestatic a2d.a (Loov;)Loov;
      // 15: athrow
      // 16: iload 0
      // 17: invokestatic java/lang/Integer.toString (I)Ljava/lang/String;
      // 1a: areturn
      // 1b: invokestatic a2d.a (Loov;)Loov;
      // 1e: athrow
      // 1f: iload 0
      // 20: invokestatic us/myles/ViaVersion/api/protocol/ProtocolVersion.getProtocol (I)Lus/myles/ViaVersion/api/protocol/ProtocolVersion;
      // 23: invokevirtual us/myles/ViaVersion/api/protocol/ProtocolVersion.getName ()Ljava/lang/String;
      // 26: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
