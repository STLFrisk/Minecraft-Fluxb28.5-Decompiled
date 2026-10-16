public class gpp {
   public c05 kfh = c05.vz1();
   public int bwg = 0;

   @jev
   public void dd6(axn var1) {
      this.bwg = 0;
   }

   @jev
   public void x9n(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield gpp.kfh Lc05;
      // 08: getfield c05.vg8 Ll86;
      // 0b: iload 2
      // 0c: ifeq 4b
      // 0f: getfield l86.g25 I
      // 12: bipush 25
      // 14: irem
      // 15: ifne 5c
      // 18: goto 1f
      // 1b: invokestatic gpp.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield gpp.kfh Lc05;
      // 23: getfield c05.vg8 Ll86;
      // 26: getfield l86.lq7 Lp_k;
      // 29: new net/minecraft/network/play/client/C18PacketSpectate
      // 2c: dup
      // 2d: aload 0
      // 2e: getfield gpp.kfh Lc05;
      // 31: getfield c05.vg8 Ll86;
      // 34: invokevirtual l86.b_q ()Ljava/util/UUID;
      // 37: invokespecial net/minecraft/network/play/client/C18PacketSpectate.<init> (Ljava/util/UUID;)V
      // 3a: invokevirtual p_k.sxi (Lmz2;)V
      // 3d: aload 0
      // 3e: getfield gpp.kfh Lc05;
      // 41: getfield c05.vg8 Ll86;
      // 44: goto 4b
      // 47: invokestatic gpp.a (Loov;)Loov;
      // 4a: athrow
      // 4b: getfield l86.lq7 Lp_k;
      // 4e: new net/minecraft/network/play/client/C0CPacketInput
      // 51: dup
      // 52: fconst_0
      // 53: fconst_0
      // 54: bipush 0
      // 55: bipush 0
      // 56: invokespecial net/minecraft/network/play/client/C0CPacketInput.<init> (FFZZ)V
      // 59: invokevirtual p_k.sxi (Lmz2;)V
      // 5c: return
   }

   @jev
   public void va3(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual ihr.bbi ()Lmz2;
      // 08: iload 2
      // 09: ifne 24
      // 0c: instanceof net/minecraft/network/play/client/C0FPacketConfirmTransaction
      // 0f: ifeq 77
      // 12: goto 19
      // 15: invokestatic gpp.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual ihr.bbi ()Lmz2;
      // 1d: goto 24
      // 20: invokestatic gpp.a (Loov;)Loov;
      // 23: athrow
      // 24: checkcast net/minecraft/network/play/client/C0FPacketConfirmTransaction
      // 27: astore 3
      // 28: aload 3
      // 29: invokevirtual net/minecraft/network/play/client/C0FPacketConfirmTransaction.qec ()I
      // 2c: iload 2
      // 2d: ifne 45
      // 30: ifne 77
      // 33: goto 3a
      // 36: invokestatic gpp.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 3
      // 3b: invokevirtual net/minecraft/network/play/client/C0FPacketConfirmTransaction.x7y ()S
      // 3e: goto 45
      // 41: invokestatic gpp.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush -1
      // 46: iload 2
      // 47: ifne 68
      // 4a: if_icmpge 77
      // 4d: goto 54
      // 50: invokestatic gpp.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: dup
      // 56: getfield gpp.bwg I
      // 59: dup_x1
      // 5a: bipush 1
      // 5b: iadd
      // 5c: putfield gpp.bwg I
      // 5f: bipush 15
      // 61: goto 68
      // 64: invokestatic gpp.a (Loov;)Loov;
      // 67: athrow
      // 68: if_icmple 77
      // 6b: aload 1
      // 6c: bipush 1
      // 6d: invokevirtual ihr.wxi (Z)V
      // 70: goto 77
      // 73: invokestatic gpp.a (Loov;)Loov;
      // 76: athrow
      // 77: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
