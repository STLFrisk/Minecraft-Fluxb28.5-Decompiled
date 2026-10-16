package net.minecraft.network.play.server;

public class S44PacketWorldBorder implements mz2 {
   private S44PacketWorldBorder$yf2 bz9;
   private int s4v;
   private double s1f;
   private double s65;
   private double hok;
   private double yfa;
   private long tx2;
   private int jw9;
   private int g4s;

   public S44PacketWorldBorder() {
   }

   public S44PacketWorldBorder(w5i var1, S44PacketWorldBorder$yf2 var2) {
      this.bz9 = var2;
      this.s1f = var1.nf3();
      this.s65 = var1.ad0();
      this.yfa = var1.cuf();
      this.hok = var1.uz5();
      this.tx2 = var1.a2z();
      this.s4v = var1.goi();
      this.g4s = var1.skm();
      this.jw9 = var1.xyx();
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
      // 000: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: aload 1
      // 006: ldc net/minecraft/network/play/server/S44PacketWorldBorder$yf2
      // 008: nop
      // 009: invokevirtual nfj.e0h (Ljava/lang/Class;)Ljava/lang/Enum;
      // 00c: checkcast net/minecraft/network/play/server/S44PacketWorldBorder$yf2
      // 00f: putfield net/minecraft/network/play/server/S44PacketWorldBorder.bz9 Lnet/minecraft/network/play/server/S44PacketWorldBorder$yf2;
      // 012: aload 2
      // 013: ifnull 05b
      // 016: getstatic net/minecraft/network/play/server/S44PacketWorldBorder$1.bx5 [I
      // 019: aload 0
      // 01a: getfield net/minecraft/network/play/server/S44PacketWorldBorder.bz9 Lnet/minecraft/network/play/server/S44PacketWorldBorder$yf2;
      // 01d: invokevirtual net/minecraft/network/play/server/S44PacketWorldBorder$yf2.ordinal ()I
      // 020: iaload
      // 021: tableswitch 233 1 6 43 62 97 124 143 162
      // 048: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: aload 1
      // 04e: invokevirtual nfj.readDouble ()D
      // 051: putfield net/minecraft/network/play/server/S44PacketWorldBorder.hok D
      // 054: goto 05b
      // 057: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 2
      // 05c: ifnonnull 10a
      // 05f: aload 0
      // 060: aload 1
      // 061: invokevirtual nfj.readDouble ()D
      // 064: putfield net/minecraft/network/play/server/S44PacketWorldBorder.yfa D
      // 067: aload 0
      // 068: aload 1
      // 069: invokevirtual nfj.readDouble ()D
      // 06c: putfield net/minecraft/network/play/server/S44PacketWorldBorder.hok D
      // 06f: aload 0
      // 070: aload 1
      // 071: invokevirtual nfj.yhj ()J
      // 074: putfield net/minecraft/network/play/server/S44PacketWorldBorder.tx2 J
      // 077: aload 2
      // 078: ifnonnull 10a
      // 07b: goto 082
      // 07e: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 0
      // 083: aload 1
      // 084: invokevirtual nfj.readDouble ()D
      // 087: putfield net/minecraft/network/play/server/S44PacketWorldBorder.s1f D
      // 08a: aload 0
      // 08b: aload 1
      // 08c: invokevirtual nfj.readDouble ()D
      // 08f: putfield net/minecraft/network/play/server/S44PacketWorldBorder.s65 D
      // 092: aload 2
      // 093: ifnonnull 10a
      // 096: goto 09d
      // 099: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 0
      // 09e: aload 1
      // 09f: invokevirtual nfj.gux ()I
      // 0a2: putfield net/minecraft/network/play/server/S44PacketWorldBorder.g4s I
      // 0a5: aload 2
      // 0a6: ifnonnull 10a
      // 0a9: goto 0b0
      // 0ac: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: aload 1
      // 0b2: invokevirtual nfj.gux ()I
      // 0b5: putfield net/minecraft/network/play/server/S44PacketWorldBorder.jw9 I
      // 0b8: aload 2
      // 0b9: ifnonnull 10a
      // 0bc: goto 0c3
      // 0bf: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: aload 1
      // 0c5: invokevirtual nfj.readDouble ()D
      // 0c8: putfield net/minecraft/network/play/server/S44PacketWorldBorder.s1f D
      // 0cb: aload 0
      // 0cc: aload 1
      // 0cd: invokevirtual nfj.readDouble ()D
      // 0d0: putfield net/minecraft/network/play/server/S44PacketWorldBorder.s65 D
      // 0d3: aload 0
      // 0d4: aload 1
      // 0d5: invokevirtual nfj.readDouble ()D
      // 0d8: putfield net/minecraft/network/play/server/S44PacketWorldBorder.yfa D
      // 0db: aload 0
      // 0dc: aload 1
      // 0dd: invokevirtual nfj.readDouble ()D
      // 0e0: putfield net/minecraft/network/play/server/S44PacketWorldBorder.hok D
      // 0e3: aload 0
      // 0e4: aload 1
      // 0e5: invokevirtual nfj.yhj ()J
      // 0e8: putfield net/minecraft/network/play/server/S44PacketWorldBorder.tx2 J
      // 0eb: aload 0
      // 0ec: aload 1
      // 0ed: invokevirtual nfj.gux ()I
      // 0f0: putfield net/minecraft/network/play/server/S44PacketWorldBorder.s4v I
      // 0f3: aload 0
      // 0f4: aload 1
      // 0f5: invokevirtual nfj.gux ()I
      // 0f8: putfield net/minecraft/network/play/server/S44PacketWorldBorder.g4s I
      // 0fb: aload 0
      // 0fc: aload 1
      // 0fd: invokevirtual nfj.gux ()I
      // 100: putfield net/minecraft/network/play/server/S44PacketWorldBorder.jw9 I
      // 103: goto 10a
      // 106: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 109: athrow
      // 10a: return
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
      // 000: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: aload 0
      // 006: getfield net/minecraft/network/play/server/S44PacketWorldBorder.bz9 Lnet/minecraft/network/play/server/S44PacketWorldBorder$yf2;
      // 009: invokevirtual nfj.p9c (Ljava/lang/Enum;)Lnfj;
      // 00c: pop
      // 00d: aload 2
      // 00e: ifnull 058
      // 011: getstatic net/minecraft/network/play/server/S44PacketWorldBorder$1.bx5 [I
      // 014: aload 0
      // 015: getfield net/minecraft/network/play/server/S44PacketWorldBorder.bz9 Lnet/minecraft/network/play/server/S44PacketWorldBorder$yf2;
      // 018: invokevirtual net/minecraft/network/play/server/S44PacketWorldBorder$yf2.ordinal ()I
      // 01b: iaload
      // 01c: tableswitch 250 1 6 44 64 102 131 151 171
      // 044: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 1
      // 049: aload 0
      // 04a: getfield net/minecraft/network/play/server/S44PacketWorldBorder.hok D
      // 04d: invokevirtual nfj.writeDouble (D)Lio/netty/buffer/ByteBuf;
      // 050: pop
      // 051: goto 058
      // 054: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 057: athrow
      // 058: aload 2
      // 059: ifnonnull 116
      // 05c: aload 1
      // 05d: aload 0
      // 05e: getfield net/minecraft/network/play/server/S44PacketWorldBorder.yfa D
      // 061: invokevirtual nfj.writeDouble (D)Lio/netty/buffer/ByteBuf;
      // 064: pop
      // 065: aload 1
      // 066: aload 0
      // 067: getfield net/minecraft/network/play/server/S44PacketWorldBorder.hok D
      // 06a: invokevirtual nfj.writeDouble (D)Lio/netty/buffer/ByteBuf;
      // 06d: pop
      // 06e: aload 1
      // 06f: aload 0
      // 070: getfield net/minecraft/network/play/server/S44PacketWorldBorder.tx2 J
      // 073: invokevirtual nfj.snn (J)Lnfj;
      // 076: pop
      // 077: aload 2
      // 078: ifnonnull 116
      // 07b: goto 082
      // 07e: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 1
      // 083: aload 0
      // 084: getfield net/minecraft/network/play/server/S44PacketWorldBorder.s1f D
      // 087: invokevirtual nfj.writeDouble (D)Lio/netty/buffer/ByteBuf;
      // 08a: pop
      // 08b: aload 1
      // 08c: aload 0
      // 08d: getfield net/minecraft/network/play/server/S44PacketWorldBorder.s65 D
      // 090: invokevirtual nfj.writeDouble (D)Lio/netty/buffer/ByteBuf;
      // 093: pop
      // 094: aload 2
      // 095: ifnonnull 116
      // 098: goto 09f
      // 09b: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 1
      // 0a0: aload 0
      // 0a1: getfield net/minecraft/network/play/server/S44PacketWorldBorder.g4s I
      // 0a4: invokevirtual nfj.tao (I)Lnfj;
      // 0a7: pop
      // 0a8: aload 2
      // 0a9: ifnonnull 116
      // 0ac: goto 0b3
      // 0af: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 1
      // 0b4: aload 0
      // 0b5: getfield net/minecraft/network/play/server/S44PacketWorldBorder.jw9 I
      // 0b8: invokevirtual nfj.tao (I)Lnfj;
      // 0bb: pop
      // 0bc: aload 2
      // 0bd: ifnonnull 116
      // 0c0: goto 0c7
      // 0c3: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 1
      // 0c8: aload 0
      // 0c9: getfield net/minecraft/network/play/server/S44PacketWorldBorder.s1f D
      // 0cc: invokevirtual nfj.writeDouble (D)Lio/netty/buffer/ByteBuf;
      // 0cf: pop
      // 0d0: aload 1
      // 0d1: aload 0
      // 0d2: getfield net/minecraft/network/play/server/S44PacketWorldBorder.s65 D
      // 0d5: invokevirtual nfj.writeDouble (D)Lio/netty/buffer/ByteBuf;
      // 0d8: pop
      // 0d9: aload 1
      // 0da: aload 0
      // 0db: getfield net/minecraft/network/play/server/S44PacketWorldBorder.yfa D
      // 0de: invokevirtual nfj.writeDouble (D)Lio/netty/buffer/ByteBuf;
      // 0e1: pop
      // 0e2: aload 1
      // 0e3: aload 0
      // 0e4: getfield net/minecraft/network/play/server/S44PacketWorldBorder.hok D
      // 0e7: invokevirtual nfj.writeDouble (D)Lio/netty/buffer/ByteBuf;
      // 0ea: pop
      // 0eb: aload 1
      // 0ec: aload 0
      // 0ed: getfield net/minecraft/network/play/server/S44PacketWorldBorder.tx2 J
      // 0f0: invokevirtual nfj.snn (J)Lnfj;
      // 0f3: pop
      // 0f4: aload 1
      // 0f5: aload 0
      // 0f6: getfield net/minecraft/network/play/server/S44PacketWorldBorder.s4v I
      // 0f9: invokevirtual nfj.tao (I)Lnfj;
      // 0fc: pop
      // 0fd: aload 1
      // 0fe: aload 0
      // 0ff: getfield net/minecraft/network/play/server/S44PacketWorldBorder.g4s I
      // 102: invokevirtual nfj.tao (I)Lnfj;
      // 105: pop
      // 106: aload 1
      // 107: aload 0
      // 108: getfield net/minecraft/network/play/server/S44PacketWorldBorder.jw9 I
      // 10b: invokevirtual nfj.tao (I)Lnfj;
      // 10e: pop
      // 10f: goto 116
      // 112: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 115: athrow
      // 116: return
   }

   public void o_9(jsv var1) {
      var1.o8p(this);
   }

   public void nfv(w5i param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 003: astore 2
      // 004: getstatic net/minecraft/network/play/server/S44PacketWorldBorder$1.bx5 [I
      // 007: aload 0
      // 008: getfield net/minecraft/network/play/server/S44PacketWorldBorder.bz9 Lnet/minecraft/network/play/server/S44PacketWorldBorder$yf2;
      // 00b: invokevirtual net/minecraft/network/play/server/S44PacketWorldBorder$yf2.ordinal ()I
      // 00e: iaload
      // 00f: tableswitch 249 1 6 37 56 83 106 125 144
      // 034: aload 1
      // 035: aload 0
      // 036: getfield net/minecraft/network/play/server/S44PacketWorldBorder.hok D
      // 039: invokevirtual w5i.w37 (D)V
      // 03c: aload 2
      // 03d: ifnonnull 108
      // 040: goto 047
      // 043: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 1
      // 048: aload 0
      // 049: getfield net/minecraft/network/play/server/S44PacketWorldBorder.yfa D
      // 04c: aload 0
      // 04d: getfield net/minecraft/network/play/server/S44PacketWorldBorder.hok D
      // 050: aload 0
      // 051: getfield net/minecraft/network/play/server/S44PacketWorldBorder.tx2 J
      // 054: invokevirtual w5i._03 (DDJ)V
      // 057: aload 2
      // 058: ifnonnull 108
      // 05b: goto 062
      // 05e: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 061: athrow
      // 062: aload 1
      // 063: aload 0
      // 064: getfield net/minecraft/network/play/server/S44PacketWorldBorder.s1f D
      // 067: aload 0
      // 068: getfield net/minecraft/network/play/server/S44PacketWorldBorder.s65 D
      // 06b: invokevirtual w5i.bfn (DD)V
      // 06e: aload 2
      // 06f: ifnonnull 108
      // 072: goto 079
      // 075: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 1
      // 07a: aload 0
      // 07b: getfield net/minecraft/network/play/server/S44PacketWorldBorder.g4s I
      // 07e: invokevirtual w5i.n3z (I)V
      // 081: aload 2
      // 082: ifnonnull 108
      // 085: goto 08c
      // 088: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 08b: athrow
      // 08c: aload 1
      // 08d: aload 0
      // 08e: getfield net/minecraft/network/play/server/S44PacketWorldBorder.jw9 I
      // 091: invokevirtual w5i.ilo (I)V
      // 094: aload 2
      // 095: ifnonnull 108
      // 098: goto 09f
      // 09b: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 1
      // 0a0: aload 0
      // 0a1: getfield net/minecraft/network/play/server/S44PacketWorldBorder.s1f D
      // 0a4: aload 2
      // 0a5: ifnull 0ed
      // 0a8: goto 0af
      // 0ab: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: getfield net/minecraft/network/play/server/S44PacketWorldBorder.s65 D
      // 0b3: invokevirtual w5i.bfn (DD)V
      // 0b6: aload 0
      // 0b7: getfield net/minecraft/network/play/server/S44PacketWorldBorder.tx2 J
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: ifle 0e1
      // 0bf: goto 0c6
      // 0c2: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: aload 1
      // 0c7: aload 0
      // 0c8: getfield net/minecraft/network/play/server/S44PacketWorldBorder.yfa D
      // 0cb: aload 0
      // 0cc: getfield net/minecraft/network/play/server/S44PacketWorldBorder.hok D
      // 0cf: aload 0
      // 0d0: getfield net/minecraft/network/play/server/S44PacketWorldBorder.tx2 J
      // 0d3: invokevirtual w5i._03 (DDJ)V
      // 0d6: aload 2
      // 0d7: ifnonnull 0f0
      // 0da: goto 0e1
      // 0dd: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 1
      // 0e2: aload 0
      // 0e3: getfield net/minecraft/network/play/server/S44PacketWorldBorder.hok D
      // 0e6: goto 0ed
      // 0e9: invokestatic net/minecraft/network/play/server/S44PacketWorldBorder.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: invokevirtual w5i.w37 (D)V
      // 0f0: aload 1
      // 0f1: aload 0
      // 0f2: getfield net/minecraft/network/play/server/S44PacketWorldBorder.s4v I
      // 0f5: invokevirtual w5i.lth (I)V
      // 0f8: aload 1
      // 0f9: aload 0
      // 0fa: getfield net/minecraft/network/play/server/S44PacketWorldBorder.g4s I
      // 0fd: invokevirtual w5i.n3z (I)V
      // 100: aload 1
      // 101: aload 0
      // 102: getfield net/minecraft/network/play/server/S44PacketWorldBorder.jw9 I
      // 105: invokevirtual w5i.ilo (I)V
      // 108: return
   }

   @Override
   public void ito(yw3 var1) {
      this.o_9((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
