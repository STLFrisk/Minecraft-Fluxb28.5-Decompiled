public class lur extends flo {
   public lur(OpaquePredicate var1, EntityLivingBase var2, EntityLivingBase var3, float var4) {
      super(var1, var2.o2v, var2.kfp, var2.vbd, var2.icv, var2.mop, var2.bw4);
      this.lyh = var2;
      this.b29 = var3;
      this.hck = 3;
      this.lfj = var4;
   }

   @Override
   public void oss(q3g param1, EntityLivingBase param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 9
      // 005: aconst_null
      // 006: astore 10
      // 008: invokestatic hxt.ly3 ()Z
      // 00b: ifeq 01a
      // 00e: getstatic net/optifine/shaders/Shaders.activeProgram Lnet/optifine/shaders/Program;
      // 011: astore 10
      // 013: aload 0
      // 014: getfield lur.lyh Li2h;
      // 017: invokestatic net/optifine/shaders/Shaders.nextEntity (Li2h;)V
      // 01a: aload 0
      // 01b: getfield lur.g_4 I
      // 01e: i2f
      // 01f: fload 3
      // 020: fadd
      // 021: aload 0
      // 022: getfield lur.hck I
      // 025: i2f
      // 026: fdiv
      // 027: fstore 11
      // 029: fload 11
      // 02b: fload 11
      // 02d: fmul
      // 02e: fstore 11
      // 030: aload 0
      // 031: getfield lur.lyh Li2h;
      // 034: getfield EntityLivingBase.o2v D
      // 037: dstore 12
      // 039: aload 0
      // 03a: getfield lur.lyh Li2h;
      // 03d: getfield EntityLivingBase.kfp D
      // 040: dstore 14
      // 042: aload 0
      // 043: getfield lur.lyh Li2h;
      // 046: getfield EntityLivingBase.vbd D
      // 049: dstore 16
      // 04b: aload 0
      // 04c: getfield lur.b29 Li2h;
      // 04f: getfield EntityLivingBase.ivp D
      // 052: aload 0
      // 053: getfield lur.b29 Li2h;
      // 056: getfield EntityLivingBase.o2v D
      // 059: aload 0
      // 05a: getfield lur.b29 Li2h;
      // 05d: getfield EntityLivingBase.ivp D
      // 060: dsub
      // 061: fload 3
      // 062: f2d
      // 063: dmul
      // 064: dadd
      // 065: dstore 18
      // 067: aload 0
      // 068: getfield lur.b29 Li2h;
      // 06b: getfield EntityLivingBase.c54 D
      // 06e: aload 0
      // 06f: getfield lur.b29 Li2h;
      // 072: getfield EntityLivingBase.kfp D
      // 075: aload 0
      // 076: getfield lur.b29 Li2h;
      // 079: getfield EntityLivingBase.c54 D
      // 07c: dsub
      // 07d: fload 3
      // 07e: f2d
      // 07f: dmul
      // 080: dadd
      // 081: aload 0
      // 082: getfield lur.lfj F
      // 085: f2d
      // 086: dadd
      // 087: dstore 20
      // 089: aload 0
      // 08a: getfield lur.b29 Li2h;
      // 08d: getfield EntityLivingBase.e2b D
      // 090: aload 0
      // 091: getfield lur.b29 Li2h;
      // 094: getfield EntityLivingBase.vbd D
      // 097: aload 0
      // 098: getfield lur.b29 Li2h;
      // 09b: getfield EntityLivingBase.e2b D
      // 09e: dsub
      // 09f: fload 3
      // 0a0: f2d
      // 0a1: dmul
      // 0a2: dadd
      // 0a3: dstore 22
      // 0a5: dload 12
      // 0a7: dload 18
      // 0a9: dload 12
      // 0ab: dsub
      // 0ac: fload 11
      // 0ae: f2d
      // 0af: dmul
      // 0b0: dadd
      // 0b1: dstore 24
      // 0b3: dload 14
      // 0b5: dload 20
      // 0b7: dload 14
      // 0b9: dsub
      // 0ba: fload 11
      // 0bc: f2d
      // 0bd: dmul
      // 0be: dadd
      // 0bf: dstore 26
      // 0c1: dload 16
      // 0c3: dload 22
      // 0c5: dload 16
      // 0c7: dsub
      // 0c8: fload 11
      // 0ca: f2d
      // 0cb: dmul
      // 0cc: dadd
      // 0cd: dstore 28
      // 0cf: aload 0
      // 0d0: fload 3
      // 0d1: invokevirtual lur.azk (F)I
      // 0d4: istore 30
      // 0d6: iload 30
      // 0d8: ldc 65536
      // 0da: nop
      // 0db: irem
      // 0dc: istore 31
      // 0de: iload 30
      // 0e0: ldc 65536
      // 0e2: nop
      // 0e3: idiv
      // 0e4: istore 32
      // 0e6: getstatic gis.exn I
      // 0e9: iload 31
      // 0eb: i2f
      // 0ec: fconst_1
      // 0ed: fdiv
      // 0ee: iload 32
      // 0f0: i2f
      // 0f1: fconst_1
      // 0f2: fdiv
      // 0f3: invokestatic gis.w9e (IFF)V
      // 0f6: fconst_1
      // 0f7: fconst_1
      // 0f8: fconst_1
      // 0f9: fconst_1
      // 0fa: invokestatic hzu.wn0 (FFFF)V
      // 0fd: dload 24
      // 0ff: getstatic lur.mrd D
      // 102: dsub
      // 103: dstore 24
      // 105: dload 26
      // 107: getstatic lur.txo D
      // 10a: dsub
      // 10b: dstore 26
      // 10d: dload 28
      // 10f: getstatic lur.bta D
      // 112: dsub
      // 113: dstore 28
      // 115: aload 0
      // 116: getfield lur.ubm Lhr_;
      // 119: aload 0
      // 11a: getfield lur.lyh Li2h;
      // 11d: dload 24
      // 11f: d2f
      // 120: f2d
      // 121: dload 26
      // 123: d2f
      // 124: f2d
      // 125: dload 28
      // 127: d2f
      // 128: f2d
      // 129: aload 0
      // 12a: getfield lur.lyh Li2h;
      // 12d: getfield EntityLivingBase.x5k F
      // 130: fload 3
      // 131: invokevirtual hr_.ajg (Li2h;DDDFF)Z
      // 134: pop
      // 135: iload 9
      // 137: ifeq 155
      // 13a: invokestatic hxt.ly3 ()Z
      // 13d: ifeq 15a
      // 140: goto 147
      // 143: invokestatic lur.a (Loov;)Loov;
      // 146: athrow
      // 147: aconst_null
      // 148: checkcast EntityLivingBase
      // 14b: invokestatic net/optifine/shaders/Shaders.setEntityId (Li2h;)V
      // 14e: goto 155
      // 151: invokestatic lur.a (Loov;)Loov;
      // 154: athrow
      // 155: aload 10
      // 157: invokestatic net/optifine/shaders/Shaders.useProgram (Lnet/optifine/shaders/Program;)V
      // 15a: return
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: dup
      // 06: getfield lur.g_4 I
      // 09: bipush 1
      // 0a: iadd
      // 0b: putfield lur.g_4 I
      // 0e: aload 0
      // 0f: iload 1
      // 10: ifne 2c
      // 13: getfield lur.g_4 I
      // 16: aload 0
      // 17: getfield lur.hck I
      // 1a: if_icmpne 2f
      // 1d: goto 24
      // 20: invokestatic lur.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: goto 2c
      // 28: invokestatic lur.a (Loov;)Loov;
      // 2b: athrow
      // 2c: invokevirtual lur._kl ()V
      // 2f: return
   }

   @Override
   public int ikr() {
      return 3;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
