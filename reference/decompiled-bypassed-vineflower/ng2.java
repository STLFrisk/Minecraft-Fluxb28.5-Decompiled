import java.util.Random;

public class ng2 extends flo {
   private static final Random oz7 = new Random();
   private int hef;

   public ng2(t9d param1, double param2, double param4, double param6, double param8, double param10, double param12) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: dload 2
      // 03: dload 4
      // 05: dload 6
      // 07: ldc2_w 0.5
      // 0a: getstatic ng2.oz7 Ljava/util/Random;
      // 0d: invokevirtual java/util/Random.nextDouble ()D
      // 10: dsub
      // 11: dload 10
      // 13: ldc2_w 0.5
      // 16: getstatic ng2.oz7 Ljava/util/Random;
      // 19: invokevirtual java/util/Random.nextDouble ()D
      // 1c: dsub
      // 1d: invokespecial flo.<init> (Lt9d;DDDDDD)V
      // 20: invokestatic t9d.b ()I
      // 23: aload 0
      // 24: sipush 128
      // 27: putfield ng2.hef I
      // 2a: istore 14
      // 2c: aload 0
      // 2d: dup
      // 2e: getfield ng2.mop D
      // 31: ldc2_w 0.20000000298023224
      // 34: dmul
      // 35: putfield ng2.mop D
      // 38: iload 14
      // 3a: ifeq 9d
      // 3d: dload 8
      // 3f: dconst_0
      // 40: dcmpl
      // 41: ifne 78
      // 44: goto 4b
      // 47: invokestatic ng2.a (Loov;)Loov;
      // 4a: athrow
      // 4b: dload 12
      // 4d: dconst_0
      // 4e: dcmpl
      // 4f: ifne 78
      // 52: goto 59
      // 55: invokestatic ng2.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 0
      // 5a: dup
      // 5b: getfield ng2.icv D
      // 5e: ldc2_w 0.10000000149011612
      // 61: dmul
      // 62: putfield ng2.icv D
      // 65: aload 0
      // 66: dup
      // 67: getfield ng2.bw4 D
      // 6a: ldc2_w 0.10000000149011612
      // 6d: dmul
      // 6e: putfield ng2.bw4 D
      // 71: goto 78
      // 74: invokestatic ng2.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 0
      // 79: dup
      // 7a: getfield ng2.ysq F
      // 7d: ldc 0.75
      // 7f: nop
      // 80: fmul
      // 81: putfield ng2.ysq F
      // 84: aload 0
      // 85: ldc2_w 8.0
      // 88: invokestatic java/lang/Math.random ()D
      // 8b: ldc2_w 0.8
      // 8e: dmul
      // 8f: ldc2_w 0.2
      // 92: dadd
      // 93: ddiv
      // 94: d2i
      // 95: putfield ng2.bx4 I
      // 98: aload 0
      // 99: bipush 0
      // 9a: putfield ng2.kvx Z
      // 9d: return
   }

   @Override
   public void oss(q3g var1, i2h var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.goc + var3) / (float)this.bx4 * 32.0F;
      var9 = fe6._f3(var9, 0.0F, 1.0F);
      super.oss(var1, var2, var3, var4, var5, var6, var7, var8);
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
      // 000: aload 0
      // 001: aload 0
      // 002: getfield ng2.o2v D
      // 005: putfield ng2.bc1 D
      // 008: invokestatic t9d.b ()I
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield ng2.kfp D
      // 010: putfield ng2.o_z D
      // 013: aload 0
      // 014: aload 0
      // 015: getfield ng2.vbd D
      // 018: putfield ng2.a4d D
      // 01b: istore 1
      // 01c: aload 0
      // 01d: dup
      // 01e: getfield ng2.goc I
      // 021: dup_x1
      // 022: bipush 1
      // 023: iadd
      // 024: putfield ng2.goc I
      // 027: iload 1
      // 028: ifeq 081
      // 02b: aload 0
      // 02c: getfield ng2.bx4 I
      // 02f: if_icmplt 044
      // 032: goto 039
      // 035: invokestatic ng2.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 0
      // 03a: invokevirtual ng2._kl ()V
      // 03d: goto 044
      // 040: invokestatic ng2.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 0
      // 045: aload 0
      // 046: getfield ng2.hef I
      // 049: bipush 7
      // 04b: aload 0
      // 04c: getfield ng2.goc I
      // 04f: bipush 8
      // 051: imul
      // 052: aload 0
      // 053: getfield ng2.bx4 I
      // 056: idiv
      // 057: isub
      // 058: iadd
      // 059: invokevirtual ng2.f0l (I)V
      // 05c: aload 0
      // 05d: dup
      // 05e: getfield ng2.mop D
      // 061: ldc2_w 0.004
      // 064: dadd
      // 065: putfield ng2.mop D
      // 068: aload 0
      // 069: aload 0
      // 06a: getfield ng2.icv D
      // 06d: aload 0
      // 06e: getfield ng2.mop D
      // 071: aload 0
      // 072: getfield ng2.bw4 D
      // 075: invokevirtual ng2.vjj (DDD)V
      // 078: aload 0
      // 079: getfield ng2.kfp D
      // 07c: aload 0
      // 07d: getfield ng2.o_z D
      // 080: dcmpl
      // 081: iload 1
      // 082: ifeq 0e1
      // 085: ifne 0ae
      // 088: goto 08f
      // 08b: invokestatic ng2.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 0
      // 090: dup
      // 091: getfield ng2.icv D
      // 094: ldc2_w 1.1
      // 097: dmul
      // 098: putfield ng2.icv D
      // 09b: aload 0
      // 09c: dup
      // 09d: getfield ng2.bw4 D
      // 0a0: ldc2_w 1.1
      // 0a3: dmul
      // 0a4: putfield ng2.bw4 D
      // 0a7: goto 0ae
      // 0aa: invokestatic ng2.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: dup
      // 0b0: getfield ng2.icv D
      // 0b3: ldc2_w 0.9599999785423279
      // 0b6: dmul
      // 0b7: putfield ng2.icv D
      // 0ba: aload 0
      // 0bb: dup
      // 0bc: getfield ng2.mop D
      // 0bf: ldc2_w 0.9599999785423279
      // 0c2: dmul
      // 0c3: putfield ng2.mop D
      // 0c6: aload 0
      // 0c7: dup
      // 0c8: getfield ng2.bw4 D
      // 0cb: ldc2_w 0.9599999785423279
      // 0ce: dmul
      // 0cf: putfield ng2.bw4 D
      // 0d2: aload 0
      // 0d3: iload 1
      // 0d4: ifeq 0f8
      // 0d7: getfield ng2.lfk Z
      // 0da: goto 0e1
      // 0dd: invokestatic ng2.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: ifeq 103
      // 0e4: aload 0
      // 0e5: dup
      // 0e6: getfield ng2.icv D
      // 0e9: ldc2_w 0.699999988079071
      // 0ec: dmul
      // 0ed: putfield ng2.icv D
      // 0f0: aload 0
      // 0f1: goto 0f8
      // 0f4: invokestatic ng2.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: dup
      // 0f9: getfield ng2.bw4 D
      // 0fc: ldc2_w 0.699999988079071
      // 0ff: dmul
      // 100: putfield ng2.bw4 D
      // 103: return
   }

   public void ov8(int var1) {
      this.hef = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
