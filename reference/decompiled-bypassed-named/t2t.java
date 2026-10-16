import us.myles.ViaVersion.api.data.UserConnection;
import us.myles.ViaVersion.protocols.base.VersionProvider;

public class t2t extends VersionProvider {
   public int getServerProtocol(UserConnection param1) {
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
      // 05: instanceof j25
      // 08: iload 2
      // 09: ifeq 23
      // 0c: ifeq 1e
      // 0f: goto 16
      // 12: invokestatic t2t.a (Loov;)Loov;
      // 15: athrow
      // 16: getstatic uy1.al8 I
      // 19: ireturn
      // 1a: invokestatic t2t.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: invokespecial us/myles/ViaVersion/protocols/base/VersionProvider.getServerProtocol (Lus/myles/ViaVersion/api/data/UserConnection;)I
      // 23: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
