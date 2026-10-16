public class z95 extends iq2 {
   public boolean z78;

   public z95(float var1) {
      super(var1, 0.0F, 64, 128);
      this.oy3.i50(0.0F, -2.0F, 0.0F);
      this.oy3.fc6(0, 0).q3x(0.0F, 3.0F, -6.75F, 1, 1, 1, -0.25F);
      this.ict.i_6(this.oy3);
      this.knm = new tf8(this).swi(64, 128);
      this.knm.i50(-5.0F, -10.03125F, -5.0F);
      this.knm.fc6(0, 64).ge4(0.0F, 0.0F, 0.0F, 10, 2, 10);
      this.gsh.i_6(this.knm);
      tf8 var2 = new tf8(this).swi(64, 128);
      var2.i50(1.75F, -4.0F, 2.0F);
      var2.fc6(0, 76).ge4(0.0F, 0.0F, 0.0F, 7, 4, 7);
      var2.pod = -0.05235988F;
      var2.oo7 = 0.02617994F;
      this.knm.i_6(var2);
      tf8 var3 = new tf8(this).swi(64, 128);
      var3.i50(1.75F, -4.0F, 2.0F);
      var3.fc6(0, 87).ge4(0.0F, 0.0F, 0.0F, 4, 4, 4);
      var3.pod = -0.10471976F;
      var3.oo7 = 0.05235988F;
      var2.i_6(var3);
      tf8 var4 = new tf8(this).swi(64, 128);
      var4.i50(1.75F, -2.0F, 2.0F);
      var4.fc6(0, 95).q3x(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
      var4.pod = (float) (-Math.PI / 15);
      var4.oo7 = 0.10471976F;
      var3.i_6(var4);
   }

   @Override
   public void ltd(float param1, float param2, float param3, float param4, float param5, float param6, EntityLivingBase param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: fload 1
      // 02: fload 2
      // 03: fload 3
      // 04: fload 4
      // 06: fload 5
      // 08: fload 6
      // 0a: aload 7
      // 0c: invokespecial iq2.ltd (FFFFFFLi2h;)V
      // 0f: aload 0
      // 10: getfield z95.ict Ltf8;
      // 13: aload 0
      // 14: getfield z95.ict Ltf8;
      // 17: aload 0
      // 18: getfield z95.ict Ltf8;
      // 1b: fconst_0
      // 1c: dup_x1
      // 1d: putfield tf8.c0n F
      // 20: dup_x1
      // 21: putfield tf8.nh8 F
      // 24: putfield tf8.sdb F
      // 27: ldc 0.01
      // 29: nop
      // 2a: aload 7
      // 2c: invokevirtual EntityLivingBase.jwu ()I
      // 2f: bipush 10
      // 31: irem
      // 32: i2f
      // 33: fmul
      // 34: fstore 9
      // 36: invokestatic OpaquePredicate.b ()I
      // 39: aload 0
      // 3a: getfield z95.ict Ltf8;
      // 3d: aload 7
      // 3f: getfield EntityLivingBase.g25 I
      // 42: i2f
      // 43: fload 9
      // 45: fmul
      // 46: invokestatic fe6.rtn (F)F
      // 49: ldc 4.5
      // 4b: nop
      // 4c: fmul
      // 4d: ldc 3.1415927
      // 4f: nop
      // 50: fmul
      // 51: ldc 180.0
      // 53: nop
      // 54: fdiv
      // 55: putfield tf8.pod F
      // 58: aload 0
      // 59: getfield z95.ict Ltf8;
      // 5c: fconst_0
      // 5d: putfield tf8.r80 F
      // 60: aload 0
      // 61: getfield z95.ict Ltf8;
      // 64: aload 7
      // 66: getfield EntityLivingBase.g25 I
      // 69: i2f
      // 6a: fload 9
      // 6c: fmul
      // 6d: invokestatic fe6.ssk (F)F
      // 70: ldc 2.5
      // 72: nop
      // 73: fmul
      // 74: ldc 3.1415927
      // 76: nop
      // 77: fmul
      // 78: ldc 180.0
      // 7a: nop
      // 7b: fdiv
      // 7c: putfield tf8.oo7 F
      // 7f: istore 8
      // 81: aload 0
      // 82: iload 8
      // 84: ifeq b0
      // 87: getfield z95.z78 Z
      // 8a: ifeq b9
      // 8d: goto 94
      // 90: invokestatic z95.a (Loov;)Loov;
      // 93: athrow
      // 94: aload 0
      // 95: getfield z95.ict Ltf8;
      // 98: ldc -0.9
      // 9a: nop
      // 9b: putfield tf8.pod F
      // 9e: aload 0
      // 9f: getfield z95.ict Ltf8;
      // a2: ldc -0.09375
      // a4: nop
      // a5: putfield tf8.c0n F
      // a8: aload 0
      // a9: goto b0
      // ac: invokestatic z95.a (Loov;)Loov;
      // af: athrow
      // b0: getfield z95.ict Ltf8;
      // b3: ldc 0.1875
      // b5: nop
      // b6: putfield tf8.nh8 F
      // b9: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
