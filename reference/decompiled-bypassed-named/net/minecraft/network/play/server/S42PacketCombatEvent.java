package net.minecraft.network.play.server;

public class S42PacketCombatEvent implements mz2 {
   public S42PacketCombatEvent$cwk qt6;
   public int gzf;
   public int e92;
   public int k6d;
   public String iri;

   public S42PacketCombatEvent() {
   }

   public S42PacketCombatEvent(w0s param1, S42PacketCombatEvent$cwk param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 07: aload 0
      // 08: aload 2
      // 09: putfield net/minecraft/network/play/server/S42PacketCombatEvent.qt6 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 0c: astore 3
      // 0d: aload 1
      // 0e: invokevirtual w0s.bnc ()Lg_3;
      // 11: astore 4
      // 13: aload 3
      // 14: ifnull 4b
      // 17: getstatic net/minecraft/network/play/server/S42PacketCombatEvent$1.q_o [I
      // 1a: aload 2
      // 1b: invokevirtual net/minecraft/network/play/server/S42PacketCombatEvent$cwk.ordinal ()I
      // 1e: iaload
      // 1f: lookupswitch 145 2 1 29 2 81
      // 38: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 1
      // 3e: invokevirtual w0s.ey1 ()I
      // 41: putfield net/minecraft/network/play/server/S42PacketCombatEvent.k6d I
      // 44: goto 4b
      // 47: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: aload 4
      // 4e: aload 3
      // 4f: ifnull 66
      // 52: ifnonnull 64
      // 55: goto 5c
      // 58: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 5b: athrow
      // 5c: bipush -1
      // 5d: goto 69
      // 60: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 4
      // 66: invokevirtual Entity.jwu ()I
      // 69: putfield net/minecraft/network/play/server/S42PacketCombatEvent.e92 I
      // 6c: aload 3
      // 6d: ifnonnull b0
      // 70: aload 0
      // 71: aload 1
      // 72: invokevirtual w0s.xta ()Lg_3;
      // 75: invokevirtual Entity.jwu ()I
      // 78: putfield net/minecraft/network/play/server/S42PacketCombatEvent.gzf I
      // 7b: aload 0
      // 7c: aload 4
      // 7e: aload 3
      // 7f: ifnull 9d
      // 82: goto 89
      // 85: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 88: athrow
      // 89: ifnonnull 9b
      // 8c: goto 93
      // 8f: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 92: athrow
      // 93: bipush -1
      // 94: goto a0
      // 97: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 9a: athrow
      // 9b: aload 4
      // 9d: invokevirtual Entity.jwu ()I
      // a0: putfield net/minecraft/network/play/server/S42PacketCombatEvent.e92 I
      // a3: aload 0
      // a4: aload 1
      // a5: invokevirtual w0s.bus ()Lekw;
      // a8: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // ad: putfield net/minecraft/network/play/server/S42PacketCombatEvent.iri Ljava/lang/String;
      // b0: return
   }

   @Override
   public void ajj(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 1
      // 06: ldc net/minecraft/network/play/server/S42PacketCombatEvent$cwk
      // 08: nop
      // 09: invokevirtual nfj.e0h (Ljava/lang/Class;)Ljava/lang/Enum;
      // 0c: checkcast net/minecraft/network/play/server/S42PacketCombatEvent$cwk
      // 0f: putfield net/minecraft/network/play/server/S42PacketCombatEvent.qt6 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 12: aload 0
      // 13: getfield net/minecraft/network/play/server/S42PacketCombatEvent.qt6 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 16: getstatic net/minecraft/network/play/server/S42PacketCombatEvent$cwk.ks3 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 19: aload 2
      // 1a: ifnull 5b
      // 1d: if_acmpne 42
      // 20: goto 27
      // 23: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: aload 1
      // 29: invokevirtual nfj.gux ()I
      // 2c: putfield net/minecraft/network/play/server/S42PacketCombatEvent.k6d I
      // 2f: aload 0
      // 30: aload 1
      // 31: invokevirtual nfj.readInt ()I
      // 34: putfield net/minecraft/network/play/server/S42PacketCombatEvent.e92 I
      // 37: aload 2
      // 38: ifnonnull 80
      // 3b: goto 42
      // 3e: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: aload 2
      // 44: ifnull 76
      // 47: goto 4e
      // 4a: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 4d: athrow
      // 4e: getfield net/minecraft/network/play/server/S42PacketCombatEvent.qt6 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 51: getstatic net/minecraft/network/play/server/S42PacketCombatEvent$cwk.mx5 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 54: goto 5b
      // 57: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 5a: athrow
      // 5b: if_acmpne 80
      // 5e: aload 0
      // 5f: aload 1
      // 60: invokevirtual nfj.gux ()I
      // 63: putfield net/minecraft/network/play/server/S42PacketCombatEvent.gzf I
      // 66: aload 0
      // 67: aload 1
      // 68: invokevirtual nfj.readInt ()I
      // 6b: putfield net/minecraft/network/play/server/S42PacketCombatEvent.e92 I
      // 6e: aload 0
      // 6f: goto 76
      // 72: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 1
      // 77: sipush 32767
      // 7a: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 7d: putfield net/minecraft/network/play/server/S42PacketCombatEvent.iri Ljava/lang/String;
      // 80: return
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
      // 00: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 0
      // 06: getfield net/minecraft/network/play/server/S42PacketCombatEvent.qt6 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 09: invokevirtual nfj.p9c (Ljava/lang/Enum;)Lnfj;
      // 0c: pop
      // 0d: aload 0
      // 0e: getfield net/minecraft/network/play/server/S42PacketCombatEvent.qt6 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 11: getstatic net/minecraft/network/play/server/S42PacketCombatEvent$cwk.ks3 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 14: aload 2
      // 15: ifnull 4d
      // 18: if_acmpne 3f
      // 1b: goto 22
      // 1e: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 1
      // 23: aload 0
      // 24: getfield net/minecraft/network/play/server/S42PacketCombatEvent.k6d I
      // 27: invokevirtual nfj.tao (I)Lnfj;
      // 2a: pop
      // 2b: aload 1
      // 2c: aload 0
      // 2d: getfield net/minecraft/network/play/server/S42PacketCombatEvent.e92 I
      // 30: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 33: pop
      // 34: aload 2
      // 35: ifnonnull 72
      // 38: goto 3f
      // 3b: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield net/minecraft/network/play/server/S42PacketCombatEvent.qt6 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 43: getstatic net/minecraft/network/play/server/S42PacketCombatEvent$cwk.mx5 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 46: goto 4d
      // 49: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 4c: athrow
      // 4d: if_acmpne 72
      // 50: aload 1
      // 51: aload 0
      // 52: getfield net/minecraft/network/play/server/S42PacketCombatEvent.gzf I
      // 55: invokevirtual nfj.tao (I)Lnfj;
      // 58: pop
      // 59: aload 1
      // 5a: aload 0
      // 5b: getfield net/minecraft/network/play/server/S42PacketCombatEvent.e92 I
      // 5e: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 61: pop
      // 62: aload 1
      // 63: aload 0
      // 64: getfield net/minecraft/network/play/server/S42PacketCombatEvent.iri Ljava/lang/String;
      // 67: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 6a: pop
      // 6b: goto 72
      // 6e: invokestatic net/minecraft/network/play/server/S42PacketCombatEvent.a (Loov;)Loov;
      // 71: athrow
      // 72: return
   }

   public void xoi(jsv var1) {
      var1.wno(this);
   }

   @Override
   public void ito(yw3 var1) {
      this.xoi((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
