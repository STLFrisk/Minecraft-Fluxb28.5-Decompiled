public class ugc extends rdv {
   public ugc(t9d var1) {
      super(var1);
   }

   public ugc(t9d var1, mew var2) {
      super(var1, var2);
      this.m6_((double)var2.getX() + 0.5, (double)var2.getY() + 0.5, (double)var2.getZ() + 0.5);
      float var3 = 0.125F;
      float var4 = 0.1875F;
      float var5 = 0.25F;
      this.qq7(new nh4(this.o2v - 0.1875, this.kfp - 0.25 + 0.125, this.vbd - 0.1875, this.o2v + 0.1875, this.kfp + 0.25 + 0.125, this.vbd + 0.1875));
   }

   @Override
   public void tbj() {
      super.tbj();
   }

   @Override
   public void qht(vt2 var1) {
   }

   @Override
   public int bli() {
      return 9;
   }

   @Override
   public int cgb() {
      return 9;
   }

   @Override
   public float c5y() {
      return -0.0625F;
   }

   @Override
   public boolean xvv(double var1) {
      int var3 = t9d.b();

      try {
         double var5;
         int var10000 = (var5 = var1 - 1024.0) == 0.0 ? 0 : (var5 < 0.0 ? -1 : 1);
         if (var3 == 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   @Override
   public void r4_(i2h var1) {
   }

   @Override
   public boolean qqt(bdo var1) {
      return false;
   }

   @Override
   public void srs(bdo var1) {
   }

   @Override
   public void cjb(bdo var1) {
   }

   @Override
   public boolean k25(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual ha9.tsc ()Lerg;
      // 004: astore 3
      // 005: invokestatic t9d.b ()I
      // 008: bipush 0
      // 009: istore 4
      // 00b: istore 2
      // 00c: aload 3
      // 00d: iload 2
      // 00e: ifeq 01c
      // 011: ifnull 0ec
      // 014: goto 01b
      // 017: invokestatic ugc.a (Loov;)Loov;
      // 01a: athrow
      // 01b: aload 3
      // 01c: invokevirtual erg.gn1 ()Lu7m;
      // 01f: getstatic xbr.tj6 Lu7m;
      // 022: if_acmpne 0ec
      // 025: aload 0
      // 026: getfield ugc.oay Lt9d;
      // 029: getfield t9d.v0f Z
      // 02c: iload 2
      // 02d: ifeq 0f3
      // 030: goto 037
      // 033: invokestatic ugc.a (Loov;)Loov;
      // 036: athrow
      // 037: ifne 0ec
      // 03a: goto 041
      // 03d: invokestatic ugc.a (Loov;)Loov;
      // 040: athrow
      // 041: ldc2_w 7.0
      // 044: dstore 5
      // 046: aload 0
      // 047: getfield ugc.oay Lt9d;
      // 04a: ldc yqv
      // 04c: nop
      // 04d: new nh4
      // 050: dup
      // 051: aload 0
      // 052: getfield ugc.o2v D
      // 055: dload 5
      // 057: dsub
      // 058: aload 0
      // 059: getfield ugc.kfp D
      // 05c: dload 5
      // 05e: dsub
      // 05f: aload 0
      // 060: getfield ugc.vbd D
      // 063: dload 5
      // 065: dsub
      // 066: aload 0
      // 067: getfield ugc.o2v D
      // 06a: dload 5
      // 06c: dadd
      // 06d: aload 0
      // 06e: getfield ugc.kfp D
      // 071: dload 5
      // 073: dadd
      // 074: aload 0
      // 075: getfield ugc.vbd D
      // 078: dload 5
      // 07a: dadd
      // 07b: invokespecial nh4.<init> (DDDDDD)V
      // 07e: invokevirtual t9d.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 081: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 086: astore 7
      // 088: aload 7
      // 08a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08f: ifeq 0ec
      // 092: aload 7
      // 094: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 099: checkcast yqv
      // 09c: astore 8
      // 09e: aload 8
      // 0a0: iload 2
      // 0a1: ifeq 0d3
      // 0a4: invokevirtual yqv.hk3 ()Z
      // 0a7: iload 2
      // 0a8: ifeq 0f3
      // 0ab: goto 0b2
      // 0ae: invokestatic ugc.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: ifeq 0e8
      // 0b5: goto 0bc
      // 0b8: invokestatic ugc.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 8
      // 0be: iload 2
      // 0bf: ifeq 0e0
      // 0c2: goto 0c9
      // 0c5: invokestatic ugc.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: invokevirtual yqv.ohg ()Li2h;
      // 0cc: goto 0d3
      // 0cf: invokestatic ugc.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 1
      // 0d4: if_acmpne 0e8
      // 0d7: aload 8
      // 0d9: goto 0e0
      // 0dc: invokestatic ugc.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: bipush 1
      // 0e2: invokevirtual yqv.dt4 (Li2h;Z)V
      // 0e5: bipush 1
      // 0e6: istore 4
      // 0e8: iload 2
      // 0e9: ifne 088
      // 0ec: aload 0
      // 0ed: getfield ugc.oay Lt9d;
      // 0f0: getfield t9d.v0f Z
      // 0f3: iload 2
      // 0f4: ifeq 1e1
      // 0f7: ifne 1e0
      // 0fa: goto 101
      // 0fd: invokestatic ugc.a (Loov;)Loov;
      // 100: athrow
      // 101: iload 4
      // 103: iload 2
      // 104: ifeq 1e1
      // 107: goto 10e
      // 10a: invokestatic ugc.a (Loov;)Loov;
      // 10d: athrow
      // 10e: ifne 1e0
      // 111: goto 118
      // 114: invokestatic ugc.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 0
      // 119: invokevirtual ugc._kl ()V
      // 11c: aload 1
      // 11d: getfield ha9.lls Lpj2;
      // 120: getfield pj2.g40 Z
      // 123: iload 2
      // 124: ifeq 1e1
      // 127: goto 12e
      // 12a: invokestatic ugc.a (Loov;)Loov;
      // 12d: athrow
      // 12e: ifeq 1e0
      // 131: goto 138
      // 134: invokestatic ugc.a (Loov;)Loov;
      // 137: athrow
      // 138: ldc2_w 7.0
      // 13b: dstore 5
      // 13d: aload 0
      // 13e: getfield ugc.oay Lt9d;
      // 141: ldc yqv
      // 143: nop
      // 144: new nh4
      // 147: dup
      // 148: aload 0
      // 149: getfield ugc.o2v D
      // 14c: dload 5
      // 14e: dsub
      // 14f: aload 0
      // 150: getfield ugc.kfp D
      // 153: dload 5
      // 155: dsub
      // 156: aload 0
      // 157: getfield ugc.vbd D
      // 15a: dload 5
      // 15c: dsub
      // 15d: aload 0
      // 15e: getfield ugc.o2v D
      // 161: dload 5
      // 163: dadd
      // 164: aload 0
      // 165: getfield ugc.kfp D
      // 168: dload 5
      // 16a: dadd
      // 16b: aload 0
      // 16c: getfield ugc.vbd D
      // 16f: dload 5
      // 171: dadd
      // 172: invokespecial nh4.<init> (DDDDDD)V
      // 175: invokevirtual t9d.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 178: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 17d: astore 7
      // 17f: aload 7
      // 181: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 186: ifeq 1e0
      // 189: aload 7
      // 18b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 190: checkcast yqv
      // 193: astore 8
      // 195: aload 8
      // 197: iload 2
      // 198: ifeq 1ca
      // 19b: invokevirtual yqv.hk3 ()Z
      // 19e: iload 2
      // 19f: ifeq 1e1
      // 1a2: goto 1a9
      // 1a5: invokestatic ugc.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: ifeq 1dc
      // 1ac: goto 1b3
      // 1af: invokestatic ugc.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: aload 8
      // 1b5: iload 2
      // 1b6: ifeq 1d7
      // 1b9: goto 1c0
      // 1bc: invokestatic ugc.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: invokevirtual yqv.ohg ()Li2h;
      // 1c3: goto 1ca
      // 1c6: invokestatic ugc.a (Loov;)Loov;
      // 1c9: athrow
      // 1ca: aload 0
      // 1cb: if_acmpne 1dc
      // 1ce: aload 8
      // 1d0: goto 1d7
      // 1d3: invokestatic ugc.a (Loov;)Loov;
      // 1d6: athrow
      // 1d7: bipush 1
      // 1d8: bipush 0
      // 1d9: invokevirtual yqv.xqh (ZZ)V
      // 1dc: iload 2
      // 1dd: ifne 17f
      // 1e0: bipush 1
      // 1e1: ireturn
   }

   @Override
   public boolean lgc() {
      return this.oay.getBlockState(this.aie).r_y() instanceof dqt;
   }

   public static ugc dk5(t9d var0, mew var1) {
      ugc var2 = new ugc(var0, var1);
      var2.dg4 = true;
      var0.xzq(var2);
      return var2;
   }

   public static ugc es0(t9d param0, mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual mew.getX ()I
      // 04: istore 3
      // 05: invokestatic t9d.b ()I
      // 08: aload 1
      // 09: invokevirtual mew.getY ()I
      // 0c: istore 4
      // 0e: istore 2
      // 0f: aload 1
      // 10: invokevirtual mew.getZ ()I
      // 13: istore 5
      // 15: aload 0
      // 16: ldc ugc
      // 18: nop
      // 19: new nh4
      // 1c: dup
      // 1d: iload 3
      // 1e: i2d
      // 1f: dconst_1
      // 20: dsub
      // 21: iload 4
      // 23: i2d
      // 24: dconst_1
      // 25: dsub
      // 26: iload 5
      // 28: i2d
      // 29: dconst_1
      // 2a: dsub
      // 2b: iload 3
      // 2c: i2d
      // 2d: dconst_1
      // 2e: dadd
      // 2f: iload 4
      // 31: i2d
      // 32: dconst_1
      // 33: dadd
      // 34: iload 5
      // 36: i2d
      // 37: dconst_1
      // 38: dadd
      // 39: invokespecial nh4.<init> (DDDDDD)V
      // 3c: invokevirtual t9d.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 3f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 44: astore 6
      // 46: aload 6
      // 48: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4d: ifeq 81
      // 50: aload 6
      // 52: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 57: checkcast ugc
      // 5a: astore 7
      // 5c: aload 7
      // 5e: iload 2
      // 5f: ifeq 7c
      // 62: invokevirtual ugc.liv ()Lmew;
      // 65: aload 1
      // 66: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 69: ifeq 7d
      // 6c: goto 73
      // 6f: invokestatic ugc.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 7
      // 75: goto 7c
      // 78: invokestatic ugc.a (Loov;)Loov;
      // 7b: athrow
      // 7c: areturn
      // 7d: iload 2
      // 7e: ifne 46
      // 81: aconst_null
      // 82: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
