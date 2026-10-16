public class e_y extends g6r {
   public tf8 k83;
   public tf8 phy;
   public tf8 se6;
   public tf8 odi;
   public tf8 qm3;
   public tf8 tc_;

   public e_y() {
      this(0.0F);
   }

   public e_y(float var1) {
      this(var1, -7.0F);
   }

   public e_y(float var1, float var2) {
      short var3 = 128;
      short var4 = 128;
      this.k83 = new tf8(this).swi(var3, var4);
      this.k83.i50(0.0F, 0.0F + var2, -2.0F);
      this.k83.fc6(0, 0).q3x(-4.0F, -12.0F, -5.5F, 8, 10, 8, var1);
      this.k83.fc6(24, 0).q3x(-1.0F, -5.0F, -7.5F, 2, 4, 2, var1);
      this.phy = new tf8(this).swi(var3, var4);
      this.phy.i50(0.0F, 0.0F + var2, 0.0F);
      this.phy.fc6(0, 40).q3x(-9.0F, -2.0F, -6.0F, 18, 12, 11, var1);
      this.phy.fc6(0, 70).q3x(-4.5F, 10.0F, -3.0F, 9, 5, 6, var1 + 0.5F);
      this.se6 = new tf8(this).swi(var3, var4);
      this.se6.i50(0.0F, -7.0F, 0.0F);
      this.se6.fc6(60, 21).q3x(-13.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      this.odi = new tf8(this).swi(var3, var4);
      this.odi.i50(0.0F, -7.0F, 0.0F);
      this.odi.fc6(60, 58).q3x(9.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      this.qm3 = new tf8(this, 0, 22).swi(var3, var4);
      this.qm3.i50(-4.0F, 18.0F + var2, 0.0F);
      this.qm3.fc6(37, 0).q3x(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
      this.tc_ = new tf8(this, 0, 22).swi(var3, var4);
      this.tc_.hsi = true;
      this.tc_.fc6(60, 0).i50(5.0F, 18.0F + var2, 0.0F);
      this.tc_.q3x(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
   }

   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      this.k83.vca(var7);
      this.phy.vca(var7);
      this.qm3.vca(var7);
      this.tc_.vca(var7);
      this.se6.vca(var7);
      this.odi.vca(var7);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      this.k83.r80 = var4 / (180.0F / (float)Math.PI);
      this.k83.pod = var5 / (180.0F / (float)Math.PI);
      this.qm3.pod = -1.5F * this.bgl(var1, 13.0F) * var2;
      this.tc_.pod = 1.5F * this.bgl(var1, 13.0F) * var2;
      this.qm3.r80 = 0.0F;
      this.tc_.r80 = 0.0F;
   }

   @Override
   public void v3g(g_3 param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: checkcast osf
      // 04: astore 6
      // 06: invokestatic t9d.c ()I
      // 09: aload 6
      // 0b: invokevirtual osf.x1h ()I
      // 0e: istore 7
      // 10: istore 5
      // 12: iload 7
      // 14: iload 5
      // 16: ifne 73
      // 19: ifle 67
      // 1c: goto 23
      // 1f: invokestatic e_y.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield e_y.se6 Ltf8;
      // 27: ldc -2.0
      // 29: nop
      // 2a: ldc 1.5
      // 2c: nop
      // 2d: aload 0
      // 2e: iload 7
      // 30: i2f
      // 31: fload 4
      // 33: fsub
      // 34: ldc 10.0
      // 36: nop
      // 37: invokespecial e_y.bgl (FF)F
      // 3a: fmul
      // 3b: fadd
      // 3c: putfield tf8.pod F
      // 3f: aload 0
      // 40: getfield e_y.odi Ltf8;
      // 43: ldc -2.0
      // 45: nop
      // 46: ldc 1.5
      // 48: nop
      // 49: aload 0
      // 4a: iload 7
      // 4c: i2f
      // 4d: fload 4
      // 4f: fsub
      // 50: ldc 10.0
      // 52: nop
      // 53: invokespecial e_y.bgl (FF)F
      // 56: fmul
      // 57: fadd
      // 58: putfield tf8.pod F
      // 5b: iload 5
      // 5d: ifeq ec
      // 60: goto 67
      // 63: invokestatic e_y.a (Loov;)Loov;
      // 66: athrow
      // 67: aload 6
      // 69: invokevirtual osf.gn_ ()I
      // 6c: goto 73
      // 6f: invokestatic e_y.a (Loov;)Loov;
      // 72: athrow
      // 73: istore 8
      // 75: iload 5
      // 77: ifne d3
      // 7a: iload 8
      // 7c: ifle b3
      // 7f: goto 86
      // 82: invokestatic e_y.a (Loov;)Loov;
      // 85: athrow
      // 86: aload 0
      // 87: getfield e_y.se6 Ltf8;
      // 8a: ldc -0.8
      // 8c: nop
      // 8d: ldc 0.025
      // 8f: nop
      // 90: aload 0
      // 91: iload 8
      // 93: i2f
      // 94: ldc 70.0
      // 96: nop
      // 97: invokespecial e_y.bgl (FF)F
      // 9a: fmul
      // 9b: fadd
      // 9c: putfield tf8.pod F
      // 9f: aload 0
      // a0: getfield e_y.odi Ltf8;
      // a3: fconst_0
      // a4: putfield tf8.pod F
      // a7: iload 5
      // a9: ifeq ec
      // ac: goto b3
      // af: invokestatic e_y.a (Loov;)Loov;
      // b2: athrow
      // b3: aload 0
      // b4: getfield e_y.se6 Ltf8;
      // b7: ldc -0.2
      // b9: nop
      // ba: ldc 1.5
      // bc: nop
      // bd: aload 0
      // be: fload 2
      // bf: ldc 13.0
      // c1: nop
      // c2: invokespecial e_y.bgl (FF)F
      // c5: fmul
      // c6: fadd
      // c7: fload 3
      // c8: fmul
      // c9: putfield tf8.pod F
      // cc: goto d3
      // cf: invokestatic e_y.a (Loov;)Loov;
      // d2: athrow
      // d3: aload 0
      // d4: getfield e_y.odi Ltf8;
      // d7: ldc -0.2
      // d9: nop
      // da: ldc 1.5
      // dc: nop
      // dd: aload 0
      // de: fload 2
      // df: ldc 13.0
      // e1: nop
      // e2: invokespecial e_y.bgl (FF)F
      // e5: fmul
      // e6: fsub
      // e7: fload 3
      // e8: fmul
      // e9: putfield tf8.pod F
      // ec: return
   }

   private float bgl(float var1, float var2) {
      return (Math.abs(var1 % var2 - var2 * 0.5F) - var2 * 0.25F) / (var2 * 0.25F);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
