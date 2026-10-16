public class w_u extends flo {
   public float tds;

   public w_u(t9d var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      float var14 = 2.5F;
      this.icv *= 0.1F;
      this.mop *= 0.1F;
      this.bw4 *= 0.1F;
      this.icv += var8;
      this.mop += var10;
      this.bw4 += var12;
      this.aeh = this.li4 = this.v5a = 1.0F - (float)(Math.random() * 0.3F);
      this.ysq *= 0.75F;
      this.ysq *= var14;
      this.tds = this.ysq;
      this.bx4 = (int)(8.0 / (Math.random() * 0.8 + 0.3));
      this.bx4 = (int)((float)this.bx4 * var14);
      this.kvx = false;
   }

   @Override
   public void oss(q3g var1, i2h var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.goc + var3) / (float)this.bx4 * 32.0F;
      var9 = fe6._f3(var9, 0.0F, 1.0F);
      this.ysq = this.tds * var9;
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
      // 002: getfield w_u.o2v D
      // 005: putfield w_u.bc1 D
      // 008: invokestatic t9d.c ()I
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield w_u.kfp D
      // 010: putfield w_u.o_z D
      // 013: aload 0
      // 014: aload 0
      // 015: getfield w_u.vbd D
      // 018: putfield w_u.a4d D
      // 01b: istore 1
      // 01c: aload 0
      // 01d: dup
      // 01e: getfield w_u.goc I
      // 021: iload 1
      // 022: ifne 054
      // 025: dup_x1
      // 026: bipush 1
      // 027: iadd
      // 028: putfield w_u.goc I
      // 02b: aload 0
      // 02c: getfield w_u.bx4 I
      // 02f: if_icmplt 044
      // 032: goto 039
      // 035: invokestatic w_u.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 0
      // 03a: invokevirtual w_u._kl ()V
      // 03d: goto 044
      // 040: invokestatic w_u.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 0
      // 045: bipush 7
      // 047: aload 0
      // 048: getfield w_u.goc I
      // 04b: bipush 8
      // 04d: imul
      // 04e: aload 0
      // 04f: getfield w_u.bx4 I
      // 052: idiv
      // 053: isub
      // 054: invokevirtual w_u.f0l (I)V
      // 057: aload 0
      // 058: aload 0
      // 059: getfield w_u.icv D
      // 05c: aload 0
      // 05d: getfield w_u.mop D
      // 060: aload 0
      // 061: getfield w_u.bw4 D
      // 064: invokevirtual w_u.vjj (DDD)V
      // 067: aload 0
      // 068: dup
      // 069: getfield w_u.icv D
      // 06c: ldc2_w 0.9599999785423279
      // 06f: dmul
      // 070: putfield w_u.icv D
      // 073: aload 0
      // 074: dup
      // 075: getfield w_u.mop D
      // 078: ldc2_w 0.9599999785423279
      // 07b: dmul
      // 07c: putfield w_u.mop D
      // 07f: aload 0
      // 080: dup
      // 081: getfield w_u.bw4 D
      // 084: ldc2_w 0.9599999785423279
      // 087: dmul
      // 088: putfield w_u.bw4 D
      // 08b: aload 0
      // 08c: getfield w_u.oay Lt9d;
      // 08f: aload 0
      // 090: ldc2_w 2.0
      // 093: invokevirtual t9d.a_q (Li2h;D)Lha9;
      // 096: astore 2
      // 097: aload 2
      // 098: ifnull 102
      // 09b: aload 0
      // 09c: getfield w_u.kfp D
      // 09f: aload 2
      // 0a0: invokevirtual ha9.aaw ()Lnh4;
      // 0a3: getfield nh4.bx_ D
      // 0a6: dcmpl
      // 0a7: iload 1
      // 0a8: ifne 111
      // 0ab: goto 0b2
      // 0ae: invokestatic w_u.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: ifle 102
      // 0b5: goto 0bc
      // 0b8: invokestatic w_u.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: dup
      // 0be: getfield w_u.kfp D
      // 0c1: aload 2
      // 0c2: invokevirtual ha9.aaw ()Lnh4;
      // 0c5: getfield nh4.bx_ D
      // 0c8: aload 0
      // 0c9: getfield w_u.kfp D
      // 0cc: dsub
      // 0cd: ldc2_w 0.2
      // 0d0: dmul
      // 0d1: dadd
      // 0d2: putfield w_u.kfp D
      // 0d5: aload 0
      // 0d6: dup
      // 0d7: getfield w_u.mop D
      // 0da: aload 2
      // 0db: getfield ha9.mop D
      // 0de: aload 0
      // 0df: getfield w_u.mop D
      // 0e2: dsub
      // 0e3: ldc2_w 0.2
      // 0e6: dmul
      // 0e7: dadd
      // 0e8: putfield w_u.mop D
      // 0eb: aload 0
      // 0ec: aload 0
      // 0ed: getfield w_u.o2v D
      // 0f0: aload 0
      // 0f1: getfield w_u.kfp D
      // 0f4: aload 0
      // 0f5: getfield w_u.vbd D
      // 0f8: invokevirtual w_u.m6_ (DDD)V
      // 0fb: goto 102
      // 0fe: invokestatic w_u.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 0
      // 103: iload 1
      // 104: ifne 128
      // 107: getfield w_u.lfk Z
      // 10a: goto 111
      // 10d: invokestatic w_u.a (Loov;)Loov;
      // 110: athrow
      // 111: ifeq 133
      // 114: aload 0
      // 115: dup
      // 116: getfield w_u.icv D
      // 119: ldc2_w 0.699999988079071
      // 11c: dmul
      // 11d: putfield w_u.icv D
      // 120: aload 0
      // 121: goto 128
      // 124: invokestatic w_u.a (Loov;)Loov;
      // 127: athrow
      // 128: dup
      // 129: getfield w_u.bw4 D
      // 12c: ldc2_w 0.699999988079071
      // 12f: dmul
      // 130: putfield w_u.bw4 D
      // 133: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
