public class ihr extends u1p {
   public mz2 noy;

   public ihr(mz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial u1p.<init> ()V
      // 04: invokestatic t9d.b ()I
      // 07: aload 0
      // 08: aload 1
      // 09: putfield ihr.noy Lmz2;
      // 0c: istore 2
      // 0d: aload 1
      // 0e: iload 2
      // 0f: ifeq 40
      // 12: instanceof net/minecraft/network/play/client/C03PacketPlayer$C05PacketPlayerLook
      // 15: ifne 38
      // 18: goto 1f
      // 1b: invokestatic ihr.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 1
      // 20: iload 2
      // 21: ifeq 40
      // 24: goto 2b
      // 27: invokestatic ihr.a (Loov;)Loov;
      // 2a: athrow
      // 2b: instanceof net/minecraft/network/play/client/C03PacketPlayer$C06PacketPlayerPosLook
      // 2e: ifeq 5f
      // 31: goto 38
      // 34: invokestatic ihr.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 1
      // 39: goto 40
      // 3c: invokestatic ihr.a (Loov;)Loov;
      // 3f: athrow
      // 40: checkcast net/minecraft/network/play/client/C03PacketPlayer
      // 43: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.ijl ()F
      // 46: fstore 3
      // 47: aload 1
      // 48: checkcast net/minecraft/network/play/client/C03PacketPlayer
      // 4b: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.l94 ()F
      // 4e: fstore 4
      // 50: getstatic omb.to7 Lyfc;
      // 53: fload 3
      // 54: invokevirtual yfc.nms (F)V
      // 57: getstatic omb.to7 Lyfc;
      // 5a: fload 4
      // 5c: invokevirtual yfc.qg6 (F)V
      // 5f: return
   }

   public mz2 bbi() {
      return this.noy;
   }

   public void x_f(mz2 var1) {
      this.noy = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
