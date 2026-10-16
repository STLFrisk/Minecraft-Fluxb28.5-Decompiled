public class tpd extends z14 {
   public tpd() {
      this(0.0F, 0.0F, false);
   }

   public tpd(float param1, float param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: fload 1
      // 07: fconst_0
      // 08: bipush 64
      // 0a: iload 3
      // 0b: ifeq 13
      // 0e: bipush 32
      // 10: goto 15
      // 13: bipush 64
      // 15: invokespecial z14.<init> (FFII)V
      // 18: iload 4
      // 1a: ifne 9a
      // 1d: iload 3
      // 1e: ifeq 5e
      // 21: aload 0
      // 22: new tf8
      // 25: dup
      // 26: aload 0
      // 27: bipush 0
      // 28: bipush 0
      // 29: invokespecial tf8.<init> (Lg6r;II)V
      // 2c: putfield tpd.wtl Ltf8;
      // 2f: aload 0
      // 30: getfield tpd.wtl Ltf8;
      // 33: ldc -4.0
      // 35: nop
      // 36: ldc -10.0
      // 38: nop
      // 39: ldc -4.0
      // 3b: nop
      // 3c: bipush 8
      // 3e: bipush 8
      // 40: bipush 8
      // 42: fload 1
      // 43: invokevirtual tf8.q3x (FFFIIIF)V
      // 46: aload 0
      // 47: getfield tpd.wtl Ltf8;
      // 4a: fconst_0
      // 4b: fconst_0
      // 4c: fload 2
      // 4d: fadd
      // 4e: fconst_0
      // 4f: invokevirtual tf8.i50 (FFF)V
      // 52: iload 4
      // 54: ifeq b5
      // 57: goto 5e
      // 5a: invokestatic tpd.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 0
      // 5f: new tf8
      // 62: dup
      // 63: aload 0
      // 64: invokespecial tf8.<init> (Lg6r;)V
      // 67: putfield tpd.wtl Ltf8;
      // 6a: aload 0
      // 6b: getfield tpd.wtl Ltf8;
      // 6e: fconst_0
      // 6f: fconst_0
      // 70: fload 2
      // 71: fadd
      // 72: fconst_0
      // 73: invokevirtual tf8.i50 (FFF)V
      // 76: aload 0
      // 77: getfield tpd.wtl Ltf8;
      // 7a: bipush 0
      // 7b: bipush 32
      // 7d: invokevirtual tf8.fc6 (II)Ltf8;
      // 80: ldc -4.0
      // 82: nop
      // 83: ldc -10.0
      // 85: nop
      // 86: ldc -4.0
      // 88: nop
      // 89: bipush 8
      // 8b: bipush 10
      // 8d: bipush 8
      // 8f: fload 1
      // 90: invokevirtual tf8.q3x (FFFIIIF)V
      // 93: goto 9a
      // 96: invokestatic tpd.a (Loov;)Loov;
      // 99: athrow
      // 9a: aload 0
      // 9b: getfield tpd.wtl Ltf8;
      // 9e: bipush 24
      // a0: bipush 32
      // a2: invokevirtual tf8.fc6 (II)Ltf8;
      // a5: ldc -1.0
      // a7: nop
      // a8: ldc -3.0
      // aa: nop
      // ab: ldc -6.0
      // ad: nop
      // ae: bipush 2
      // af: bipush 4
      // b0: bipush 2
      // b1: fload 1
      // b2: invokevirtual tf8.q3x (FFFIIIF)V
      // b5: return
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      super.ltd(var1, var2, var3, var4, var5, var6, var7);
      float var8 = fe6.rtn(this._5e * (float) Math.PI);
      float var9 = fe6.rtn((1.0F - (1.0F - this._5e) * (1.0F - this._5e)) * (float) Math.PI);
      this.xwb.oo7 = 0.0F;
      this.hd2.oo7 = 0.0F;
      this.xwb.r80 = -(0.1F - var8 * 0.6F);
      this.hd2.r80 = 0.1F - var8 * 0.6F;
      this.xwb.pod = (float) (-Math.PI / 2);
      this.hd2.pod = (float) (-Math.PI / 2);
      this.xwb.pod -= var8 * 1.2F - var9 * 0.4F;
      this.hd2.pod -= var8 * 1.2F - var9 * 0.4F;
      this.xwb.oo7 = this.xwb.oo7 + fe6.ssk(var3 * 0.09F) * 0.05F + 0.05F;
      this.hd2.oo7 = this.hd2.oo7 - (fe6.ssk(var3 * 0.09F) * 0.05F + 0.05F);
      this.xwb.pod = this.xwb.pod + fe6.rtn(var3 * 0.067F) * 0.05F;
      this.hd2.pod = this.hd2.pod - fe6.rtn(var3 * 0.067F) * 0.05F;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
