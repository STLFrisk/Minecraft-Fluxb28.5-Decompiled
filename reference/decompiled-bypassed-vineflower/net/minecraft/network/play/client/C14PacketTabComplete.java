package net.minecraft.network.play.client;

public class C14PacketTabComplete implements mz2 {
   public C14PacketTabComplete() {
   }

   public C14PacketTabComplete(String var1) {
      this(var1, (mew)null);
   }

   public C14PacketTabComplete(String var1, mew var2) {
      this.i_q = var1;
      this.qim = var2;
   }

   @Override
   public void ajj(nfj var1) {
      this.i_q = var1.oa5(32767);
      boolean var2 = var1.readBoolean();

      try {
         if (var2) {
            this.qim = var1.jh0();
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   @Override
   public void ddd(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/network/play/client/C03PacketPlayer.b ()[Li2h;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 0
      // 06: getfield net/minecraft/network/play/client/C14PacketTabComplete.i_q Ljava/lang/String;
      // 09: bipush 0
      // 0a: sipush 32767
      // 0d: invokestatic org/apache/commons/lang3/StringUtils.substring (Ljava/lang/String;II)Ljava/lang/String;
      // 10: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 13: pop
      // 14: aload 0
      // 15: getfield net/minecraft/network/play/client/C14PacketTabComplete.qim Lmew;
      // 18: ifnull 23
      // 1b: bipush 1
      // 1c: goto 24
      // 1f: invokestatic net/minecraft/network/play/client/C14PacketTabComplete.a (Loov;)Loov;
      // 22: athrow
      // 23: bipush 0
      // 24: istore 3
      // 25: aload 1
      // 26: aload 2
      // 27: ifnonnull 49
      // 2a: iload 3
      // 2b: invokevirtual nfj.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
      // 2e: pop
      // 2f: iload 3
      // 30: ifeq 4a
      // 33: goto 3a
      // 36: invokestatic net/minecraft/network/play/client/C14PacketTabComplete.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 1
      // 3b: aload 0
      // 3c: getfield net/minecraft/network/play/client/C14PacketTabComplete.qim Lmew;
      // 3f: invokevirtual nfj.l3a (Lmew;)Lnfj;
      // 42: goto 49
      // 45: invokestatic net/minecraft/network/play/client/C14PacketTabComplete.a (Loov;)Loov;
      // 48: athrow
      // 49: pop
      // 4a: return
   }

   public void p5a(no5 var1) {
      var1.w_f(this);
   }

   public String t2y() {
      return this.i_q;
   }

   public mew _fg() {
      return this.qim;
   }

   @Override
   public void ito(yw3 var1) {
      this.p5a((no5)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
