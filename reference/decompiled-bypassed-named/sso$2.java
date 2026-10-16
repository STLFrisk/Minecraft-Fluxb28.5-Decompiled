import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.StatType;

public class sso$2 implements IStatCallbacks {
   public final sso nm6;

   public sso$2(sso var1) {
      this.nm6 = var1;
   }

   public void statCallback(StatType param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: getstatic sso$3._o3 [I
      // 08: aload 1
      // 09: invokevirtual tv/twitch/broadcast/StatType.ordinal ()I
      // 0c: iaload
      // 0d: lookupswitch 66 2 1 27 2 51
      // 28: aload 0
      // 29: getfield sso$2.nm6 Lsso;
      // 2c: lload 2
      // 2d: l2i
      // 2e: invokestatic tv/twitch/broadcast/RTMPState.lookupValue (I)Ltv/twitch/broadcast/RTMPState;
      // 31: putfield sso.err Ltv/twitch/broadcast/RTMPState;
      // 34: iload 4
      // 36: ifeq 4f
      // 39: goto 40
      // 3c: invokestatic sso$2.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield sso$2.nm6 Lsso;
      // 44: lload 2
      // 45: putfield sso.jgd J
      // 48: goto 4f
      // 4b: invokestatic sso$2.a (Loov;)Loov;
      // 4e: athrow
      // 4f: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
