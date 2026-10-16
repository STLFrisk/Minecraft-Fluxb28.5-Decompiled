public class u14 extends z14 {
   public u14() {
      this(0.0F);
   }

   public u14(float var1) {
      this(var1, 64, 32);
   }

   public u14(float var1, int var2, int var3) {
      super(var1, 0.0F, var2, var3);
   }

   @Override
   public void ltd(float param1, float param2, float param3, float param4, float param5, float param6, i2h param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 8
      // 005: aload 7
      // 007: iload 8
      // 009: ifne 022
      // 00c: instanceof h67
      // 00f: ifeq 1ae
      // 012: goto 019
      // 015: invokestatic u14.b (Loov;)Loov;
      // 018: athrow
      // 019: aload 7
      // 01b: goto 022
      // 01e: invokestatic u14.b (Loov;)Loov;
      // 021: athrow
      // 022: checkcast h67
      // 025: astore 9
      // 027: aload 0
      // 028: getfield u14.wtl Ltf8;
      // 02b: ldc 0.017453292
      // 02d: nop
      // 02e: aload 9
      // 030: invokevirtual h67.l6k ()Lwis;
      // 033: invokevirtual wis.ins ()F
      // 036: fmul
      // 037: putfield tf8.pod F
      // 03a: aload 0
      // 03b: getfield u14.wtl Ltf8;
      // 03e: ldc 0.017453292
      // 040: nop
      // 041: aload 9
      // 043: invokevirtual h67.l6k ()Lwis;
      // 046: invokevirtual wis.t9l ()F
      // 049: fmul
      // 04a: putfield tf8.r80 F
      // 04d: aload 0
      // 04e: getfield u14.wtl Ltf8;
      // 051: ldc 0.017453292
      // 053: nop
      // 054: aload 9
      // 056: invokevirtual h67.l6k ()Lwis;
      // 059: invokevirtual wis.pic ()F
      // 05c: fmul
      // 05d: putfield tf8.oo7 F
      // 060: aload 0
      // 061: getfield u14.wtl Ltf8;
      // 064: fconst_0
      // 065: fconst_1
      // 066: fconst_0
      // 067: invokevirtual tf8.i50 (FFF)V
      // 06a: aload 0
      // 06b: getfield u14.s87 Ltf8;
      // 06e: ldc 0.017453292
      // 070: nop
      // 071: aload 9
      // 073: invokevirtual h67.pfz ()Lwis;
      // 076: invokevirtual wis.ins ()F
      // 079: fmul
      // 07a: putfield tf8.pod F
      // 07d: aload 0
      // 07e: getfield u14.s87 Ltf8;
      // 081: ldc 0.017453292
      // 083: nop
      // 084: aload 9
      // 086: invokevirtual h67.pfz ()Lwis;
      // 089: invokevirtual wis.t9l ()F
      // 08c: fmul
      // 08d: putfield tf8.r80 F
      // 090: aload 0
      // 091: getfield u14.s87 Ltf8;
      // 094: ldc 0.017453292
      // 096: nop
      // 097: aload 9
      // 099: invokevirtual h67.pfz ()Lwis;
      // 09c: invokevirtual wis.pic ()F
      // 09f: fmul
      // 0a0: putfield tf8.oo7 F
      // 0a3: aload 0
      // 0a4: getfield u14.hd2 Ltf8;
      // 0a7: ldc 0.017453292
      // 0a9: nop
      // 0aa: aload 9
      // 0ac: invokevirtual h67.xvb ()Lwis;
      // 0af: invokevirtual wis.ins ()F
      // 0b2: fmul
      // 0b3: putfield tf8.pod F
      // 0b6: aload 0
      // 0b7: getfield u14.hd2 Ltf8;
      // 0ba: ldc 0.017453292
      // 0bc: nop
      // 0bd: aload 9
      // 0bf: invokevirtual h67.xvb ()Lwis;
      // 0c2: invokevirtual wis.t9l ()F
      // 0c5: fmul
      // 0c6: putfield tf8.r80 F
      // 0c9: aload 0
      // 0ca: getfield u14.hd2 Ltf8;
      // 0cd: ldc 0.017453292
      // 0cf: nop
      // 0d0: aload 9
      // 0d2: invokevirtual h67.xvb ()Lwis;
      // 0d5: invokevirtual wis.pic ()F
      // 0d8: fmul
      // 0d9: putfield tf8.oo7 F
      // 0dc: aload 0
      // 0dd: getfield u14.xwb Ltf8;
      // 0e0: ldc 0.017453292
      // 0e2: nop
      // 0e3: aload 9
      // 0e5: invokevirtual h67.wod ()Lwis;
      // 0e8: invokevirtual wis.ins ()F
      // 0eb: fmul
      // 0ec: putfield tf8.pod F
      // 0ef: aload 0
      // 0f0: getfield u14.xwb Ltf8;
      // 0f3: ldc 0.017453292
      // 0f5: nop
      // 0f6: aload 9
      // 0f8: invokevirtual h67.wod ()Lwis;
      // 0fb: invokevirtual wis.t9l ()F
      // 0fe: fmul
      // 0ff: putfield tf8.r80 F
      // 102: aload 0
      // 103: getfield u14.xwb Ltf8;
      // 106: ldc 0.017453292
      // 108: nop
      // 109: aload 9
      // 10b: invokevirtual h67.wod ()Lwis;
      // 10e: invokevirtual wis.pic ()F
      // 111: fmul
      // 112: putfield tf8.oo7 F
      // 115: aload 0
      // 116: getfield u14.zv5 Ltf8;
      // 119: ldc 0.017453292
      // 11b: nop
      // 11c: aload 9
      // 11e: invokevirtual h67.fby ()Lwis;
      // 121: invokevirtual wis.ins ()F
      // 124: fmul
      // 125: putfield tf8.pod F
      // 128: aload 0
      // 129: getfield u14.zv5 Ltf8;
      // 12c: ldc 0.017453292
      // 12e: nop
      // 12f: aload 9
      // 131: invokevirtual h67.fby ()Lwis;
      // 134: invokevirtual wis.t9l ()F
      // 137: fmul
      // 138: putfield tf8.r80 F
      // 13b: aload 0
      // 13c: getfield u14.zv5 Ltf8;
      // 13f: ldc 0.017453292
      // 141: nop
      // 142: aload 9
      // 144: invokevirtual h67.fby ()Lwis;
      // 147: invokevirtual wis.pic ()F
      // 14a: fmul
      // 14b: putfield tf8.oo7 F
      // 14e: aload 0
      // 14f: getfield u14.zv5 Ltf8;
      // 152: ldc 1.9
      // 154: nop
      // 155: ldc 11.0
      // 157: nop
      // 158: fconst_0
      // 159: invokevirtual tf8.i50 (FFF)V
      // 15c: aload 0
      // 15d: getfield u14.v3l Ltf8;
      // 160: ldc 0.017453292
      // 162: nop
      // 163: aload 9
      // 165: invokevirtual h67.wym ()Lwis;
      // 168: invokevirtual wis.ins ()F
      // 16b: fmul
      // 16c: putfield tf8.pod F
      // 16f: aload 0
      // 170: getfield u14.v3l Ltf8;
      // 173: ldc 0.017453292
      // 175: nop
      // 176: aload 9
      // 178: invokevirtual h67.wym ()Lwis;
      // 17b: invokevirtual wis.t9l ()F
      // 17e: fmul
      // 17f: putfield tf8.r80 F
      // 182: aload 0
      // 183: getfield u14.v3l Ltf8;
      // 186: ldc 0.017453292
      // 188: nop
      // 189: aload 9
      // 18b: invokevirtual h67.wym ()Lwis;
      // 18e: invokevirtual wis.pic ()F
      // 191: fmul
      // 192: putfield tf8.oo7 F
      // 195: aload 0
      // 196: getfield u14.v3l Ltf8;
      // 199: ldc -1.9
      // 19b: nop
      // 19c: ldc 11.0
      // 19e: nop
      // 19f: fconst_0
      // 1a0: invokevirtual tf8.i50 (FFF)V
      // 1a3: aload 0
      // 1a4: getfield u14.wtl Ltf8;
      // 1a7: aload 0
      // 1a8: getfield u14.lxi Ltf8;
      // 1ab: invokestatic u14.ibo (Ltf8;Ltf8;)V
      // 1ae: return
   }

   private static oov b(oov var0) {
      return var0;
   }
}
